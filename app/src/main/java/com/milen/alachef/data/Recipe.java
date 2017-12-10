
        package com.milen.alachef.data;


        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

        public class Recipe {

    @SerializedName("Category")
    @Expose
    private String category;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("TimeToCook")
    @Expose
    private Integer timeToCook;
    @SerializedName("ModifiedOn")
    @Expose
    private Integer modifiedOn;
    @SerializedName("StepText")
    @Expose
    private String stepText;
    @SerializedName("URLOfOrigin")
    @Expose
    private String uRLOfOrigin;
    @SerializedName("IngredientQuantity")
    @Expose
    private Integer ingredientQuantity;
    @SerializedName("ModifiedBy")
    @Expose
    private String modifiedBy;
    @SerializedName("ownerId")
    @Expose
    private Object ownerId;
    @SerializedName("TimeToPrepare")
    @Expose
    private Integer timeToPrepare;
    @SerializedName("NumberOfPortions")
    @Expose
    private Integer numberOfPortions;
    @SerializedName("IngredientUnit")
    @Expose
    private Integer ingredientUnit;
    @SerializedName("CreatedOn")
    @Expose
    private Integer createdOn;
    @SerializedName("objectId")
    @Expose
    private String objectId;
    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("StepSequence")
    @Expose
    private Integer stepSequence;
    @SerializedName("CreatedBy")
    @Expose
    private String createdBy;
    @SerializedName("created")
    @Expose
    private Integer created;
    @SerializedName("Ingredients")
    @Expose
    private String ingredients;
    @SerializedName("YouTubeURL")
    @Expose
    private String youTubeURL;
    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("CreditsTo")
    @Expose
    private String creditsTo;
    @SerializedName("PictureURL")
    @Expose
    private String pictureURL;
    @SerializedName("updated")
    @Expose
    private Integer updated;
    @SerializedName("IngredientText")
    @Expose
    private String ingredientText;
    @SerializedName("PrepareSteps")
    @Expose
    private String prepareSteps;
    @SerializedName("___class")


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTimeToCook() {
        return timeToCook;
    }

    public void setTimeToCook(Integer timeToCook) {
        this.timeToCook = timeToCook;
    }

    public Integer getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Integer modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getStepText() {
        return stepText;
    }

    public void setStepText(String stepText) {
        this.stepText = stepText;
    }

    public String getURLOfOrigin() {
        return uRLOfOrigin;
    }

    public void setURLOfOrigin(String uRLOfOrigin) {
        this.uRLOfOrigin = uRLOfOrigin;
    }

    public Integer getIngredientQuantity() {
        return ingredientQuantity;
    }

    public void setIngredientQuantity(Integer ingredientQuantity) {
        this.ingredientQuantity = ingredientQuantity;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Object getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Object ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getTimeToPrepare() {
        return timeToPrepare;
    }

    public void setTimeToPrepare(Integer timeToPrepare) {
        this.timeToPrepare = timeToPrepare;
    }

    public Integer getNumberOfPortions() {
        return numberOfPortions;
    }

    public void setNumberOfPortions(Integer numberOfPortions) {
        this.numberOfPortions = numberOfPortions;
    }

    public Integer getIngredientUnit() {
        return ingredientUnit;
    }

    public void setIngredientUnit(Integer ingredientUnit) {
        this.ingredientUnit = ingredientUnit;
    }

    public Integer getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Integer createdOn) {
        this.createdOn = createdOn;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getStepSequence() {
        return stepSequence;
    }

    public void setStepSequence(Integer stepSequence) {
        this.stepSequence = stepSequence;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getYouTubeURL() {
        return youTubeURL;
    }

    public void setYouTubeURL(String youTubeURL) {
        this.youTubeURL = youTubeURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreditsTo() {
        return creditsTo;
    }

    public void setCreditsTo(String creditsTo) {
        this.creditsTo = creditsTo;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }

    public Integer getUpdated() {
        return updated;
    }

    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    public String getIngredientText() {
        return ingredientText;
    }

    public void setIngredientText(String ingredientText) {
        this.ingredientText = ingredientText;
    }

    public String getPrepareSteps() {
        return prepareSteps;
    }

    public void setPrepareSteps(String prepareSteps) {
        this.prepareSteps = prepareSteps;
    }
}