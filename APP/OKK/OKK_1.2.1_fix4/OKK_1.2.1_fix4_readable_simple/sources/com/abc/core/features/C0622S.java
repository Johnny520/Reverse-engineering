package com.abc.core.features;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.Arrays;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.S */
/* JADX INFO: loaded from: classes.dex */
public final class C0622S {

    /* JADX INFO: renamed from: a */
    public final Bitmap f1918a;

    /* JADX INFO: renamed from: b */
    public final byte[] f1919b;

    /* JADX INFO: renamed from: c */
    public final Rect f1920c;

    public C0622S(Bitmap r1, byte[] r2, Rect r3) {
        this.f1918a = r1;
        this.f1919b = r2;
        this.f1920c = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0622S) == true) goto L8;
        return false;
    L8:
        C0622S r52 = (C0622S) r5;
        Bitmap r1 = r52.f1918a;
        if (AbstractC0307g.m699a(this.f1918a, r1) == true) goto L12;
        return false;
    L12:
        if (AbstractC0307g.m699a(this.f1919b, r52.f1919b) == true) goto L15;
        return false;
    L15:
        if (AbstractC0307g.m699a(this.f1920c, r52.f1920c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f1918a.hashCode() * 31;
        int r1 = (Arrays.hashCode(this.f1919b) + r02) * 31;
        return this.f1920c.hashCode() + r1;
    }

    public final String toString() {
        return "Patch(bitmap=" + this.f1918a + ", chunk=" + Arrays.toString(this.f1919b) + ", padding=" + this.f1920c + ")";
    }
}
