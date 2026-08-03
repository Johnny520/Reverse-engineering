package p050c0;

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

    public C0634Y(LinearLayout r2, View r3) {
        AbstractC0307g.m703e(r2, "parent");
        AbstractC0307g.m703e(r3, "child");
        this.f1949a = r2;
        this.f1950b = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0634Y) == true) goto L8;
        return false;
    L8:
        C0634Y r52 = (C0634Y) r5;
        LinearLayout r1 = r52.f1949a;
        if (AbstractC0307g.m699a(this.f1949a, r1) == true) goto L12;
        return false;
    L12:
        if (AbstractC0307g.m699a(this.f1950b, r52.f1950b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f1949a.hashCode() * 31;
        return this.f1950b.hashCode() + r02;
    }

    public final String toString() {
        return "TimeAnchor(parent=" + this.f1949a + ", child=" + this.f1950b + ")";
    }
}
