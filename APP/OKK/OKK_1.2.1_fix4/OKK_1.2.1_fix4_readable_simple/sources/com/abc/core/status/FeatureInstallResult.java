package com.abc.core.status;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: e0.a */
/* JADX INFO: loaded from: classes.dex */
public final class FeatureInstallResult {

    /* JADX INFO: renamed from: a */
    public final String f2719a;

    /* JADX INFO: renamed from: b */
    public final FeatureInstallStatus f2720b;

    /* JADX INFO: renamed from: c */
    public final String f2721c;

    /* JADX INFO: renamed from: d */
    public final long f2722d;

    public FeatureInstallResult(String r4, FeatureInstallStatus r5, String r6) {
        long r02 = System.currentTimeMillis();
        AbstractC0307g.m703e(r6, "detail");
        this.f2719a = r4;
        this.f2720b = r5;
        this.f2721c = r6;
        this.f2722d = r02;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof FeatureInstallResult) == true) goto L8;
        return false;
    L8:
        FeatureInstallResult r82 = (FeatureInstallResult) r8;
        String r1 = r82.f2719a;
        if (AbstractC0307g.m699a(this.f2719a, r1) == true) goto L12;
        return false;
    L12:
        if (this.f2720b == r82.f2720b) goto L15;
        return false;
    L15:
        if (AbstractC0307g.m699a(this.f2721c, r82.f2721c) == true) goto L18;
        return false;
    L18:
        if (this.f2722d == r82.f2722d) goto L20;
        return false;
    L20:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f2719a.hashCode() * 31;
        int r1 = (this.f2720b.hashCode() + r02) * 31;
        int r03 = (this.f2721c.hashCode() + r1) * 31;
        return Long.hashCode(this.f2722d) + r03;
    }

    public final String toString() {
        return "Record(name=" + this.f2719a + ", status=" + this.f2720b + ", detail=" + this.f2721c + ", atMs=" + this.f2722d + ")";
    }
}
