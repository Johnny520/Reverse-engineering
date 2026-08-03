package com.abc.core.features;

import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: c0.u1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0700u1 {

    /* JADX INFO: renamed from: a */
    public final long f2203a;

    /* JADX INFO: renamed from: b */
    public final int f2204b;

    /* JADX INFO: renamed from: c */
    public final String f2205c;

    public C0700u1(long r1, int r3, String r4) {
        this.f2203a = r1;
        this.f2204b = r3;
        this.f2205c = r4;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C0700u1) == true) goto L8;
        return false;
    L8:
        C0700u1 r82 = (C0700u1) r8;
        r82.getClass();
        if ("message".equals("message") == true) goto L12;
        return false;
    L12:
        if (this.f2203a == r82.f2203a) goto L15;
        return false;
    L15:
        if (this.f2204b == r82.f2204b) goto L18;
        return false;
    L18:
        if (AbstractC0307g.m699a(this.f2205c, r82.f2205c) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final int hashCode() {
        return this.f2205c.hashCode() + AbstractC0324d.m718a(this.f2204b, (Long.hashCode(this.f2203a) - 462094119) * 31, 31);
    }

    public final String toString() {
        return "RevokeUpdate(table=message, msgId=" + this.f2203a + ", type=" + this.f2204b + ", content=" + this.f2205c + ")";
    }
}
