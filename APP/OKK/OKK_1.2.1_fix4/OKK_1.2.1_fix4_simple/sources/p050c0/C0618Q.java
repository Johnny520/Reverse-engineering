package p050c0;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C0618Q {

    /* JADX INFO: renamed from: a */
    public final Drawable f1908a;

    /* JADX INFO: renamed from: b */
    public final Rect f1909b;

    public C0618Q(NinePatchDrawable r1, Rect r2) {
        this.f1908a = r1;
        this.f1909b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0618Q) == true) goto L8;
        return false;
    L8:
        C0618Q r52 = (C0618Q) r5;
        Drawable r1 = r52.f1908a;
        if (AbstractC0307g.m699a(this.f1908a, r1) == true) goto L12;
        return false;
    L12:
        if (AbstractC0307g.m699a(this.f1909b, r52.f1909b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f1908a.hashCode() * 31;
        return this.f1909b.hashCode() + r02;
    }

    public final String toString() {
        return "BubbleDrawable(drawable=" + this.f1908a + ", padding=" + this.f1909b + ")";
    }
}
