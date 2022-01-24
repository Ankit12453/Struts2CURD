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
public class ProductReportAction extends ActionSupport {
    private static final long serialVersionUID = 6329394260276112660L;
    ResultSet rs = null;
    Product product = null;
    private List<Product> productList = null;
    Admin admin = new Admin();
    private boolean noData = false;

        @Override
    public String execute() throws Exception {
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
    
    
    /**
     * @return the productList
     */
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
}
