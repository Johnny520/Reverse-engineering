package com.abc.core.features;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.O0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0613O0 {

    /* JADX INFO: renamed from: a */
    public final String f1891a;

    /* JADX INFO: renamed from: b */
    public final String f1892b;

    /* JADX INFO: renamed from: c */
    public final boolean f1893c;

    public C0613O0(String str, String str2, boolean z2) {
        this.f1891a = str;
        this.f1892b = str2;
        this.f1893c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0613O0)) {
            return false;
        }
        C0613O0 c0613o0 = (C0613O0) obj;
        return AbstractC0307g.m699a(this.f1891a, c0613o0.f1891a) && AbstractC0307g.m699a(this.f1892b, c0613o0.f1892b) && this.f1893c == c0613o0.f1893c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1893c) + ((this.f1892b.hashCode() + (this.f1891a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Identity(room=" + this.f1891a + ", sender=" + this.f1892b + ", isGroup=" + this.f1893c + ")";
    }
}
