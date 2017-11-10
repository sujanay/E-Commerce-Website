/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author sujan
 */
public class ShoesErrorList {
    private boolean genderMissing = false;
    private boolean brandMissing = false;
    private boolean modelMissing = false;
    private boolean modelIllegal = false;
    private boolean colorMissing = false;
    private boolean colorIllegal = false;
    private boolean sizeMissing = false;
    private boolean styleMissing = false;
    private boolean priceMissing = false;
    private boolean priceNegative = false;
    private boolean priceNotNumeric = false;
    private boolean insoleMissing = false;
    private boolean materialMissing = false;
    private boolean occasionMissing = false;
    private boolean quantityMissing = false;
    private boolean quantityNegative = false;
    private boolean quantityNotNumeric = false;
    private boolean shoeAlreadyExist = false;

    public boolean isGenderMissing() {
        return genderMissing;
    }

    public void setGenderMissing(boolean genderMissing) {
        this.genderMissing = genderMissing;
    }

    public boolean isBrandMissing() {
        return brandMissing;
    }

    public void setBrandMissing(boolean brandMissing) {
        this.brandMissing = brandMissing;
    }

    public boolean isModelMissing() {
        return modelMissing;
    }

    public void setModelMissing(boolean modelMissing) {
        this.modelMissing = modelMissing;
    }

    public boolean isModelIllegal() {
        return modelIllegal;
    }

    public void setModelIllegal(boolean modelIllegal) {
        this.modelIllegal = modelIllegal;
    }

    public boolean isColorMissing() {
        return colorMissing;
    }

    public void setColorMissing(boolean colorMissing) {
        this.colorMissing = colorMissing;
    }

    public boolean isColorIllegal() {
        return colorIllegal;
    }

    public void setColorIllegal(boolean colorIllegal) {
        this.colorIllegal = colorIllegal;
    }
    
    public boolean isSizeMissing() {
        return sizeMissing;
    }

    public void setSizeMissing(boolean sizeMissing) {
        this.sizeMissing = sizeMissing;
    }

    public boolean isStyleMissing() {
        return styleMissing;
    }

    public void setStyleMissing(boolean styleMissing) {
        this.styleMissing = styleMissing;
    }

    public boolean isPriceMissing() {
        return priceMissing;
    }

    public void setPriceMissing(boolean priceMissing) {
        this.priceMissing = priceMissing;
    }

    public boolean isPriceNegative() {
        return priceNegative;
    }

    public void setPriceNegative(boolean priceNegative) {
        this.priceNegative = priceNegative;
    }
    
    public boolean isPriceNotNumeric() {
        return priceNotNumeric;
    }

    public void setPriceNotNumeric(boolean priceNotNumeric) {
        this.priceNotNumeric = priceNotNumeric;
    }

    public boolean isInsoleMissing() {
        return insoleMissing;
    }

    public void setInsoleMissing(boolean insoleMissing) {
        this.insoleMissing = insoleMissing;
    }

    public boolean isMaterialMissing() {
        return materialMissing;
    }

    public void setMaterialMissing(boolean materialMissing) {
        this.materialMissing = materialMissing;
    }

    public boolean isOccasionMissing() {
        return occasionMissing;
    }

    public void setOccasionMissing(boolean occasionMissing) {
        this.occasionMissing = occasionMissing;
    }

    public boolean isQuantityMissing() {
        return quantityMissing;
    }

    public void setQuantityMissing(boolean quantityMissing) {
        this.quantityMissing = quantityMissing;
    }

    public boolean isQuantityNegative() {
        return quantityNegative;
    }

    public void setQuantityNegative(boolean quantityNegative) {
        this.quantityNegative = quantityNegative;
    }
    
    public boolean isQuantityNotNumeric() {
        return quantityNotNumeric;
    }

    public void setQuantityNotNumeric(boolean quantityNotNumeric) {
        this.quantityNotNumeric = quantityNotNumeric;
    }

    public boolean isShoeAlreadyExist() {
        return shoeAlreadyExist;
    }

    public void setShoeAlreadyExist(boolean shoeAlreadyExist) {
        this.shoeAlreadyExist = shoeAlreadyExist;
    }
    
}
