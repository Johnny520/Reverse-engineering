package com.abc.core.features;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.x1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0709x1 {

    /* JADX INFO: renamed from: a */
    public final boolean f2230a;

    /* JADX INFO: renamed from: b */
    public final float f2231b;

    /* JADX INFO: renamed from: c */
    public final String f2232c;

    /* JADX INFO: renamed from: d */
    public final long f2233d;

    public C0709x1(boolean z2, float f2, String str, long j2) {
        AbstractC0307g.m703e(str, "source");
        this.f2230a = z2;
        this.f2231b = f2;
        this.f2232c = str;
        this.f2233d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0709x1)) {
            return false;
        }
        C0709x1 c0709x1 = (C0709x1) obj;
        return this.f2230a == c0709x1.f2230a && Float.compare(this.f2231b, c0709x1.f2231b) == 0 && AbstractC0307g.m699a(this.f2232c, c0709x1.f2232c) && this.f2233d == c0709x1.f2233d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2233d) + ((this.f2232c.hashCode() + ((Float.hashCode(this.f2231b) + (Boolean.hashCode(this.f2230a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundAvatarOptions(enabled=" + this.f2230a + ", radius=" + this.f2231b + ", source=" + this.f2232c + ", updated=" + this.f2233d + ")";
    }
}
