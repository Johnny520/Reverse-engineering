package com.abc.ui;

import android.view.View;
import android.widget.LinearLayout;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: d0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0753n {

    /* JADX INFO: renamed from: a */
    public final View f2626a;

    /* JADX INFO: renamed from: b */
    public final View f2627b;

    /* JADX INFO: renamed from: c */
    public final int f2628c;

    public C0753n(LinearLayout r2, View r3, int r4) {
        AbstractC0307g.m703e(r2, "panel");
        AbstractC0307g.m703e(r3, "dim");
        this.f2626a = r2;
        this.f2627b = r3;
        this.f2628c = r4;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0753n) == true) goto L8;
        return false;
    L8:
        C0753n r52 = (C0753n) r5;
        View r1 = r52.f2626a;
        if (AbstractC0307g.m699a(this.f2626a, r1) == true) goto L12;
        return false;
    L12:
        if (AbstractC0307g.m699a(this.f2627b, r52.f2627b) == true) goto L15;
        return false;
    L15:
        if (this.f2628c == r52.f2628c) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f2626a.hashCode() * 31;
        int r1 = (this.f2627b.hashCode() + r02) * 31;
        return Integer.hashCode(this.f2628c) + r1;
    }

    public final String toString() {
        return "OverlayData(panel=" + this.f2626a + ", dim=" + this.f2627b + ", panelW=" + this.f2628c + ")";
    }
}
