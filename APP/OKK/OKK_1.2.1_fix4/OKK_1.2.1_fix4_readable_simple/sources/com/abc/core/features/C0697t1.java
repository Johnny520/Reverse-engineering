package com.abc.core.features;

import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: c0.t1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0697t1 extends AbstractC0358S {

    /* JADX INFO: renamed from: z */
    public final String f2198z;

    public C0697t1(String r2) {
        AbstractC0307g.m703e(r2, "content");
        this.f2198z = r2;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C0697t1) == true) goto L9;
        return false;
    L9:
        if (AbstractC0307g.m699a(this.f2198z, ((C0697t1) r4).f2198z) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.f2198z.hashCode();
    }

    public final String toString() {
        return "KeepRevokeNotice(content=" + this.f2198z + ")";
    }
}
