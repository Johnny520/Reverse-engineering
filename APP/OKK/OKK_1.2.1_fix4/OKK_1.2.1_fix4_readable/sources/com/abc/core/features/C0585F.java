package com.abc.core.features;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.abc.ui.FloatingBottomTabView;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import p001A0.RunnableC0028d;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.F */
/* JADX INFO: loaded from: classes.dex */
public final class C0585F extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public float f1760b;

    /* JADX INFO: renamed from: c */
    public boolean f1761c;

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public final void mo1386b(C0760b c0760b) {
        FloatingBottomTabView floatingBottomTabView = C0588G.f1770c;
        if (floatingBottomTabView != null && BottomTabConfig.m1807b()) {
            Object[] objArr = c0760b.f2670c;
            AbstractC0307g.m702d(objArr, "args");
            Object objM537n0 = AbstractC0179j.m537n0(0, objArr);
            MotionEvent motionEvent = objM537n0 instanceof MotionEvent ? (MotionEvent) objM537n0 : null;
            if (motionEvent == null) {
                return;
            }
            Object obj = c0760b.f2669b;
            View view = obj instanceof View ? (View) obj : null;
            if (view == null) {
                return;
            }
            C0588G c0588g = C0588G.f1768a;
            Context context = view.getContext();
            AbstractC0307g.m702d(context, "getContext(...)");
            if (C0588G.m1431r(context)) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    this.f1760b = motionEvent.getRawY();
                    this.f1761c = false;
                    return;
                }
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        if (Math.abs(motionEvent.getRawY() - this.f1760b) > 18.0f) {
                            this.f1761c = true;
                            if (floatingBottomTabView.f2641G) {
                                return;
                            }
                            floatingBottomTabView.f2641G = true;
                            int height = floatingBottomTabView.getHeight();
                            int iM1940c = floatingBottomTabView.m1940c(50.0f);
                            if (height < iM1940c) {
                                height = iM1940c;
                            }
                            float fM1940c = floatingBottomTabView.m1940c(40.0f) + height;
                            floatingBottomTabView.animate().cancel();
                            floatingBottomTabView.animate().translationY(fM1940c).setDuration(220L).setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.2f, 1.0f)).start();
                            return;
                        }
                        return;
                    }
                    if (actionMasked != 3) {
                        return;
                    }
                }
                if (this.f1761c) {
                    view.postDelayed(new RunnableC0028d(5, floatingBottomTabView), 800L);
                }
            }
        }
    }
}
