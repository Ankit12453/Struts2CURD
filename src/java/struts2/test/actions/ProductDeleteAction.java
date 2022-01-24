/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts2.test.actions;
import com.opensymphony.xwork2.ActionSupport;
import struts2.test.dao.Admin;
/**
 *
 * @author Ankit Kundu
 */
public class ProductDeleteAction extends ActionSupport {
    private int productId;
    private String msg;
    Admin dao = new Admin();

        @Override
    public String execute() throws Exception {
        try {
            int isDeleted = dao.deleteProductDetails(productId);
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
}
