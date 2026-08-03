package com.abc.core.features;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0686q {

    /* JADX INFO: renamed from: a */
    public final boolean f2145a;

    /* JADX INFO: renamed from: b */
    public final boolean f2146b;

    /* JADX INFO: renamed from: c */
    public final boolean f2147c;

    /* JADX INFO: renamed from: d */
    public final String f2148d;

    /* JADX INFO: renamed from: e */
    public final boolean f2149e;

    /* JADX INFO: renamed from: f */
    public final boolean f2150f;

    /* JADX INFO: renamed from: g */
    public final boolean f2151g;

    /* JADX INFO: renamed from: h */
    public final boolean f2152h;

    /* JADX INFO: renamed from: i */
    public final boolean f2153i;

    public C0686q(boolean z2, boolean z3, boolean z4, String str, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        AbstractC0307g.m703e(str, "revokeNoticeTemplate");
        this.f2145a = z2;
        this.f2146b = z3;
        this.f2147c = z4;
        this.f2148d = str;
        this.f2149e = z5;
        this.f2150f = z6;
        this.f2151g = z7;
        this.f2152h = z9;
        this.f2153i = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0686q)) {
            return false;
        }
        C0686q c0686q = (C0686q) obj;
        return this.f2145a == c0686q.f2145a && this.f2146b == c0686q.f2146b && this.f2147c == c0686q.f2147c && AbstractC0307g.m699a(this.f2148d, c0686q.f2148d) && this.f2149e == c0686q.f2149e && this.f2150f == c0686q.f2150f && this.f2151g == c0686q.f2151g && this.f2152h == c0686q.f2152h && this.f2153i == c0686q.f2153i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2153i) + ((Boolean.hashCode(this.f2152h) + ((Boolean.hashCode(false) + ((Boolean.hashCode(this.f2151g) + ((Boolean.hashCode(this.f2150f) + ((Boolean.hashCode(this.f2149e) + ((this.f2148d.hashCode() + ((Boolean.hashCode(this.f2147c) + ((Boolean.hashCode(this.f2146b) + (Boolean.hashCode(this.f2145a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AppFeatureOptions(antiRevoke=" + this.f2145a + ", revokeNotice=" + this.f2146b + ", keepSelfRevoke=" + this.f2147c + ", revokeNoticeTemplate=" + this.f2148d + ", mediaProtect=" + this.f2149e + ", antiMomentsDelete=" + this.f2150f + ", swipeQuote=" + this.f2151g + ", swipeRepeat=false, customBubble=" + this.f2152h + ", settingsEntry=" + this.f2153i + ")";
    }
}
