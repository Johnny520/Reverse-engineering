package com.youth.banner.config;

import com.youth.banner.util.BannerUtils;

/* JADX INFO: loaded from: classes.dex */
public class BannerConfig {
    public static final int INCREASE_COUNT = 2;
    public static final int INDICATOR_HEIGHT = 0;
    public static final int INDICATOR_MARGIN = 0;
    public static final int INDICATOR_NORMAL_COLOR = -1996488705;
    public static final int INDICATOR_NORMAL_WIDTH = 0;
    public static final int INDICATOR_RADIUS = 0;
    public static final int INDICATOR_SELECTED_COLOR = -2013265920;
    public static final int INDICATOR_SELECTED_WIDTH = 0;
    public static final int INDICATOR_SPACE = 0;
    public static final boolean IS_AUTO_LOOP = true;
    public static final boolean IS_INFINITE_LOOP = true;
    public static final int LOOP_TIME = 3000;
    public static final int SCROLL_TIME = 600;

    static {
        INDICATOR_NORMAL_WIDTH = BannerUtils.dp2px(5.0f);
        INDICATOR_SELECTED_WIDTH = BannerUtils.dp2px(7.0f);
        INDICATOR_SPACE = BannerUtils.dp2px(5.0f);
        INDICATOR_MARGIN = BannerUtils.dp2px(5.0f);
        INDICATOR_HEIGHT = BannerUtils.dp2px(3.0f);
        INDICATOR_RADIUS = BannerUtils.dp2px(3.0f);
    }

    public BannerConfig() {
    }
}
