package com.abc.core.features;

import android.view.View;
import android.widget.LinearLayout;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C0634Y {

    /* JADX INFO: renamed from: a */
    public final LinearLayout f1949a;

    /* JADX INFO: renamed from: b */
    public final View f1950b;

    public C0634Y(LinearLayout linearLayout, View view) {
        AbstractC0307g.m703e(linearLayout, "parent");
        AbstractC0307g.m703e(view, "child");
        this.f1949a = linearLayout;
        this.f1950b = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0634Y)) {
            return false;
        }
        C0634Y c0634y = (C0634Y) obj;
        return AbstractC0307g.m699a(this.f1949a, c0634y.f1949a) && AbstractC0307g.m699a(this.f1950b, c0634y.f1950b);
    }

    public final int hashCode() {
        return this.f1950b.hashCode() + (this.f1949a.hashCode() * 31);
    }

    public final String toString() {
        return "TimeAnchor(parent=" + this.f1949a + ", child=" + this.f1950b + ")";
    }
}
