package com.blithe.cms.controller.business;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName BusinessController
 * @Description: TODO
 * @Author: 夏小颜
 * @Date: 15:33
 * @Version: 1.0
 **/
@Controller
public class BusinessController {

    /**
     *
     * 客户管理
     */
    @RequestMapping("/bus/toCustomerManager")
    public String toCustomer(){
        return "business/customer/customer";
    }


    /**
     *
     * 商品管理
     */
    @RequestMapping("/bus/toGoodsManager")
    public String toGoods(){
        return "business/goods/goods";
    }


    /**
     *
     * 供应商管理
     */
    @RequestMapping("/bus/toProviderManager")
    public String toProvider(){
        return "business/provider/provider";
    }

}