package com.abc.core.features;

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

    public C0618Q(NinePatchDrawable ninePatchDrawable, Rect rect) {
        this.f1908a = ninePatchDrawable;
        this.f1909b = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0618Q)) {
            return false;
        }
        C0618Q c0618q = (C0618Q) obj;
        return AbstractC0307g.m699a(this.f1908a, c0618q.f1908a) && AbstractC0307g.m699a(this.f1909b, c0618q.f1909b);
    }

    public final int hashCode() {
        return this.f1909b.hashCode() + (this.f1908a.hashCode() * 31);
    }

    public final String toString() {
        return "BubbleDrawable(drawable=" + this.f1908a + ", padding=" + this.f1909b + ")";
    }
}
