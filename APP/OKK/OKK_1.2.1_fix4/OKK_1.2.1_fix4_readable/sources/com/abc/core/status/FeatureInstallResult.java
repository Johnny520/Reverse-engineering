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

    public FeatureInstallResult(String str, FeatureInstallStatus featureInstallStatus, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        AbstractC0307g.m703e(str2, "detail");
        this.f2719a = str;
        this.f2720b = featureInstallStatus;
        this.f2721c = str2;
        this.f2722d = jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeatureInstallResult)) {
            return false;
        }
        FeatureInstallResult featureInstallResult = (FeatureInstallResult) obj;
        return AbstractC0307g.m699a(this.f2719a, featureInstallResult.f2719a) && this.f2720b == featureInstallResult.f2720b && AbstractC0307g.m699a(this.f2721c, featureInstallResult.f2721c) && this.f2722d == featureInstallResult.f2722d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2722d) + ((this.f2721c.hashCode() + ((this.f2720b.hashCode() + (this.f2719a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Record(name=" + this.f2719a + ", status=" + this.f2720b + ", detail=" + this.f2721c + ", atMs=" + this.f2722d + ")";
    }
}
