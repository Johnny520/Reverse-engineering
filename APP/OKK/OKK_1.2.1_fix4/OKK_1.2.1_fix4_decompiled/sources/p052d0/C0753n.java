package p052d0;

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

    public C0753n(LinearLayout linearLayout, View view, int i2) {
        AbstractC0307g.m703e(linearLayout, "panel");
        AbstractC0307g.m703e(view, "dim");
        this.f2626a = linearLayout;
        this.f2627b = view;
        this.f2628c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0753n)) {
            return false;
        }
        C0753n c0753n = (C0753n) obj;
        return AbstractC0307g.m699a(this.f2626a, c0753n.f2626a) && AbstractC0307g.m699a(this.f2627b, c0753n.f2627b) && this.f2628c == c0753n.f2628c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2628c) + ((this.f2627b.hashCode() + (this.f2626a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "OverlayData(panel=" + this.f2626a + ", dim=" + this.f2627b + ", panelW=" + this.f2628c + ")";
    }
}
