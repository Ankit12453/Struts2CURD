/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts2.test.actions;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import struts2.test.beans.Product;
import struts2.test.dao.Admin;
/**
 *
 * @author Ankit Kundu
 */
public class ProductAction extends ActionSupport {
    private static final long serialVersionUID = 6329394260276112660L;
    ResultSet rs = null;
    Product product = null;
    private List<Product> productList = null;
    Admin admin = new Admin();
    private boolean noData = false;
    
    private int productId;
    private String productName;
    private String productMake;
    private double price;
    private int availability;
    private String msg = "";
    private String submitType;
    
    
public String ProductReportAction()  {

        try {
            setProductList(new ArrayList<>());
            setProductList(admin.reportProduct());
            

            if (!productList.isEmpty() ) {
                setNoData(false);
                System.out.println("Product retrieve = "+getProductList().size());
                System.out.println("setting nodata=false");
            } else {
                setNoData(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "REPORTPRODUCT";
    }

public String ProductUpdateAction()
{
            try {
            if (submitType.equals("updatedata")) {
                Product product=admin.fetchProductDetails(productId);
                if (product != null) {
                    productId = product.getProductId();
                    setProductName(product.getProductName());
                    productMake = product.getProductMake();
                    price = product.getPrice();
                    availability = product.getAvailability();
                }
            } else {
                int i = admin.updateProductDetails(productId, productName, productMake, price,
                        availability);
                if (i > 0) {
                    msg = "Record Updated Successfuly";
                } else {
                    msg = "error";
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "UPDATEPRODUCT";
    
}

public String ProductDeleteAction()
{
    try {
            int isDeleted = admin.deleteProductDetails(productId);
            if (isDeleted > 0) {
                msg = "Record deleted successfully";
            } else {
                msg = "Some error";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "DELETEPRODUCT";
}



        public List<Product> getProductList() {
            return productList;
        }

        /**
         * @param productList the productList to set
         */
        public void setProductList(List<Product> productList) {
            this.productList = productList;
        }

        /**
         * @return the noData
         */
        public boolean isNoData() {
            return noData;
        }

        /**
         * @param noData the noData to set
         */
        public void setNoData(boolean noData) {
            this.noData = noData;
        }

    /**
     * @return the productId
     */
    public int getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @return the productMake
     */
    public String getProductMake() {
        return productMake;
    }

    /**
     * @param productMake the productMake to set
     */
    public void setProductMake(String productMake) {
        this.productMake = productMake;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the availability
     */
    public int getAvailability() {
        return availability;
    }

    /**
     * @param availability the availability to set
     */
    public void setAvailability(int availability) {
        this.availability = availability;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @return the submitType
     */
    public String getSubmitType() {
        return submitType;
    }

    /**
     * @param submitType the submitType to set
     */
    public void setSubmitType(String submitType) {
        this.submitType = submitType;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }
        
     
}
