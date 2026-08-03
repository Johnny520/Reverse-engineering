package com.youth.banner.util;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.youth.banner.Banner;
import java.lang.reflect.Field;
import p000.C0038Av;
import p000.C2201lo;

/* JADX INFO: loaded from: classes.dex */
public class ScrollSpeedManger extends LinearLayoutManager {
    private Banner banner;

    public ScrollSpeedManger(Banner r1, LinearLayoutManager r2) {
        r1.getContext();
        super(r2.getOrientation());
        this.banner = r1;
    }

    public static /* synthetic */ Banner access$000(ScrollSpeedManger r0) {
        return r0.banner;
    }

    public static void reflectLayoutManager(Banner r6) {
        if (r6.getScrollTime() < 100) goto L18;
        ViewPager2 r2 = r6.getViewPager2();     // Catch: Exception -> L12
        RecyclerView r3 = (RecyclerView) r2.getChildAt(0);     // Catch: Exception -> L12
        r3.setOverScrollMode(2);     // Catch: Exception -> L12
        ScrollSpeedManger r4 = new ScrollSpeedManger(r6, (LinearLayoutManager) r3.getLayoutManager());     // Catch: Exception -> L12
        r3.setLayoutManager(r4);     // Catch: Exception -> L12
        Field r62 = ViewPager2.class.getDeclaredField("mLayoutManager");     // Catch: Exception -> L12
        r62.setAccessible(true);     // Catch: Exception -> L12
        r62.set(r2, r4);     // Catch: Exception -> L12
        Field r63 = ViewPager2.class.getDeclaredField("mPageTransformerAdapter");     // Catch: Exception -> L12
        r63.setAccessible(true);     // Catch: Exception -> L12
        Object r64 = r63.get(r2);     // Catch: Exception -> L12
        if (r64 == null) goto L8;
        Field r5 = r64.getClass().getDeclaredField("mLayoutManager");     // Catch: Exception -> L12
        r5.setAccessible(true);     // Catch: Exception -> L12
        r5.set(r64, r4);     // Catch: Exception -> L12
    L8:
        Field r65 = ViewPager2.class.getDeclaredField("mScrollEventAdapter");     // Catch: Exception -> L12
        r65.setAccessible(true);     // Catch: Exception -> L12
        Object r66 = r65.get(r2);     // Catch: Exception -> L12
        if (r66 == null) goto L17;
        Field r0 = r66.getClass().getDeclaredField("mLayoutManager");     // Catch: Exception -> L12
        r0.setAccessible(true);     // Catch: Exception -> L12
        r0.set(r66, r4);     // Catch: Exception -> L12
        return;
    L17:
        return;
    L12:
        e = move-exception;
        e.printStackTrace();
        return;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1160i
    public void smoothScrollToPosition(RecyclerView r1, C0038Av r2, int r3) {
        final Context r12 = r1.getContext();
        C2201lo r22 = new C12901(this, r12);
        r22.setTargetPosition(r3);
        startSmoothScroll(r22);
    }
}
