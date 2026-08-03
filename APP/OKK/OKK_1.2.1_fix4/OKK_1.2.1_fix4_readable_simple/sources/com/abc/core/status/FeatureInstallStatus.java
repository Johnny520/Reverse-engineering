package com.abc.core.status;

/* JADX INFO: renamed from: e0.b */
/* JADX INFO: loaded from: classes.dex */
public enum FeatureInstallStatus extends Enum {

    /* JADX INFO: renamed from: a */
    public static final FeatureInstallStatus f2723a = null;

    /* JADX INFO: renamed from: b */
    public static final FeatureInstallStatus f2724b = null;

    /* JADX INFO: renamed from: c */
    public static final FeatureInstallStatus f2725c = null;

    /* JADX INFO: renamed from: d */
    public static final FeatureInstallStatus f2726d = null;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ FeatureInstallStatus[] f2727e = null;

    static {
        FeatureInstallStatus r02 = new FeatureInstallStatus("OK", 0);
        f2723a = r02;
        FeatureInstallStatus r1 = new FeatureInstallStatus("FAIL", 1);
        f2724b = r1;
        FeatureInstallStatus r2 = new FeatureInstallStatus("SKIP", 2);
        f2725c = r2;
        FeatureInstallStatus r3 = new FeatureInstallStatus("PARTIAL", 3);
        f2726d = r3;
        f2727e = new FeatureInstallStatus[]{r02, r1, r2, r3};
    }

    public static FeatureInstallStatus valueOf(String r1) {
        return (FeatureInstallStatus) Enum.valueOf(FeatureInstallStatus.class, r1);
    }

    public static FeatureInstallStatus[] values() {
        return (FeatureInstallStatus[]) f2727e.clone();
    }
}
