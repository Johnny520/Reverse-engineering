package com.abc.core.features;

import p034S.AbstractC0324d;

/* JADX INFO: renamed from: c0.X */
/* JADX INFO: loaded from: classes.dex */
public final class C0632X {

    /* JADX INFO: renamed from: a */
    public final float f1944a;

    /* JADX INFO: renamed from: b */
    public final float f1945b;

    /* JADX INFO: renamed from: c */
    public final int f1946c;

    /* JADX INFO: renamed from: d */
    public boolean f1947d = false;

    public C0632X(float f2, float f3, int i2) {
        this.f1944a = f2;
        this.f1945b = f3;
        this.f1946c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0632X)) {
            return false;
        }
        C0632X c0632x = (C0632X) obj;
        return Float.compare(this.f1944a, c0632x.f1944a) == 0 && Float.compare(this.f1945b, c0632x.f1945b) == 0 && this.f1946c == c0632x.f1946c && this.f1947d == c0632x.f1947d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1947d) + AbstractC0324d.m718a(this.f1946c, (Float.hashCode(this.f1945b) + (Float.hashCode(this.f1944a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "SwipeState(initialRawX=" + this.f1944a + ", initialRawY=" + this.f1945b + ", touchSlop=" + this.f1946c + ", dragging=" + this.f1947d + ")";
    }
}
