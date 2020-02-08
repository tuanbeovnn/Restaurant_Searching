package com.javacode.builder;

public class RestaurantsSearchBuilder {
    private String name;
    private String description;
    private String[] tags = new String[]{};
    private double[] location = new double[]{};

    public double[] getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String[] getTags() {
        return tags;
    }

    public RestaurantsSearchBuilder(Builder builder) {
        this.name = builder.name;
        this.description = builder.description;
        this.tags = builder.tags;
        this.location = builder.location;
    }

    public static class Builder{
        private String name;
        private String description;
        private String[] tags = new String[]{};
        private double[] location = new double[]{};

        public Builder setLocation(double[] location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setTags(String[] tags) {
            this.tags = tags;
            return this;
        }
        public RestaurantsSearchBuilder Builder() {
            return new RestaurantsSearchBuilder(this);
        }

    }
}
