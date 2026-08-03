package com.youth.banner.config;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class IndicatorConfig {
    private boolean attachToBanner;
    private int currentPosition;
    private int gravity;
    private int height;
    private int indicatorSize;
    private int indicatorSpace;
    private Margins margins;
    private int normalColor;
    private int normalWidth;
    private int radius;
    private int selectedColor;
    private int selectedWidth;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Direction {
        public static final int CENTER = 1;
        public static final int LEFT = 0;
        public static final int RIGHT = 2;
    }

    public static class Margins {
        public int bottomMargin;
        public int leftMargin;
        public int rightMargin;
        public int topMargin;

        public Margins() {
            this(BannerConfig.INDICATOR_MARGIN);
        }

        public Margins(int r1) {
            this(r1, r1, r1, r1);
        }

        public Margins(int r1, int r2, int r3, int r4) {
            this.leftMargin = r1;
            this.topMargin = r2;
            this.rightMargin = r3;
            this.bottomMargin = r4;
        }
    }

    public IndicatorConfig() {
        this.gravity = 1;
        this.indicatorSpace = BannerConfig.INDICATOR_SPACE;
        this.normalWidth = BannerConfig.INDICATOR_NORMAL_WIDTH;
        this.selectedWidth = BannerConfig.INDICATOR_SELECTED_WIDTH;
        this.normalColor = BannerConfig.INDICATOR_NORMAL_COLOR;
        this.selectedColor = BannerConfig.INDICATOR_SELECTED_COLOR;
        this.radius = BannerConfig.INDICATOR_RADIUS;
        this.height = BannerConfig.INDICATOR_HEIGHT;
        this.attachToBanner = true;
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }

    public int getGravity() {
        return this.gravity;
    }

    public int getHeight() {
        return this.height;
    }

    public int getIndicatorSize() {
        return this.indicatorSize;
    }

    public int getIndicatorSpace() {
        return this.indicatorSpace;
    }

    public Margins getMargins() {
        if (this.margins != null) goto L6;
        setMargins(new Margins());
    L6:
        return this.margins;
    }

    public int getNormalColor() {
        return this.normalColor;
    }

    public int getNormalWidth() {
        return this.normalWidth;
    }

    public int getRadius() {
        return this.radius;
    }

    public int getSelectedColor() {
        return this.selectedColor;
    }

    public int getSelectedWidth() {
        return this.selectedWidth;
    }

    public boolean isAttachToBanner() {
        return this.attachToBanner;
    }

    public IndicatorConfig setAttachToBanner(boolean r1) {
        this.attachToBanner = r1;
        return this;
    }

    public IndicatorConfig setCurrentPosition(int r1) {
        this.currentPosition = r1;
        return this;
    }

    public IndicatorConfig setGravity(int r1) {
        this.gravity = r1;
        return this;
    }

    public IndicatorConfig setHeight(int r1) {
        this.height = r1;
        return this;
    }

    public IndicatorConfig setIndicatorSize(int r1) {
        this.indicatorSize = r1;
        return this;
    }

    public IndicatorConfig setIndicatorSpace(int r1) {
        this.indicatorSpace = r1;
        return this;
    }

    public IndicatorConfig setMargins(Margins r1) {
        this.margins = r1;
        return this;
    }

    public IndicatorConfig setNormalColor(int r1) {
        this.normalColor = r1;
        return this;
    }

    public IndicatorConfig setNormalWidth(int r1) {
        this.normalWidth = r1;
        return this;
    }

    public IndicatorConfig setRadius(int r1) {
        this.radius = r1;
        return this;
    }

    public IndicatorConfig setSelectedColor(int r1) {
        this.selectedColor = r1;
        return this;
    }

    public IndicatorConfig setSelectedWidth(int r1) {
        this.selectedWidth = r1;
        return this;
    }
}
