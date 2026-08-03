package com.youth.banner.util;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class BannerUtils {
    public BannerUtils() {
    }

    public static int dp2px(float r2) {
        return (int) TypedValue.applyDimension(1, r2, Resources.getSystem().getDisplayMetrics());
    }

    public static int getRealPosition(boolean r0, int r1, int r2) {
        if (r0 == true) goto L4;
        return r1;
    L4:
        if (r1 != 0) goto L8;
        return r2 - 1;
    L8:
        if (r1 != (r2 + 1)) goto L12;
        return 0;
    L12:
        return r1 - 1;
    }

    public static View getView(ViewGroup r2, int r3) {
        View r22 = LayoutInflater.from(r2.getContext()).inflate(r3, r2, false);
        ViewGroup.LayoutParams r32 = r22.getLayoutParams();
        if (r32.height == (-1)) goto L5;
    L8:
        r32.height = -1;
        r32.width = -1;
        r22.setLayoutParams(r32);
        return r22;
    L5:
        if (r32.width != (-1)) goto L8;
        return r22;
    }

    public static void setBannerRound(View r1, final float r2) {
        r1.setOutlineProvider(new C12891(r2));
        r1.setClipToOutline(true);
    }
}
