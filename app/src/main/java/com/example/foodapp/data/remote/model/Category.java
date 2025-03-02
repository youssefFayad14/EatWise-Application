package com.example.foodapp.data.remote.model;

import com.google.gson.annotations.SerializedName;

public class Category {

	@SerializedName("strCategory")
	private String strCategory;

	@SerializedName("strCategoryDescription")
	private String strCategoryDescription;

	@SerializedName("idCategory")
	private String idCategory;

	@SerializedName("strCategoryThumb")
	private String strCategoryThumb;

	public String getStrCategory(){
		return strCategory;
	}

	public String getStrCategoryDescription(){
		return strCategoryDescription;
	}

	public String getIdCategory(){
		return idCategory;
	}

	public String getStrCategoryThumb(){
		return strCategoryThumb;
	}
}