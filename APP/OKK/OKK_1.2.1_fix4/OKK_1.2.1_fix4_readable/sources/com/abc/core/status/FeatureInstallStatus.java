package com.abc.core.status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: e0.b */
/* JADX INFO: loaded from: classes.dex */
public final class FeatureInstallStatus {

    /* JADX INFO: renamed from: a */
    public static final FeatureInstallStatus f2723a;

    /* JADX INFO: renamed from: b */
    public static final FeatureInstallStatus f2724b;

    /* JADX INFO: renamed from: c */
    public static final FeatureInstallStatus f2725c;

    /* JADX INFO: renamed from: d */
    public static final FeatureInstallStatus f2726d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ FeatureInstallStatus[] f2727e;

    static {
        FeatureInstallStatus featureInstallStatus = new FeatureInstallStatus("OK", 0);
        f2723a = featureInstallStatus;
        FeatureInstallStatus featureInstallStatus2 = new FeatureInstallStatus("FAIL", 1);
        f2724b = featureInstallStatus2;
        FeatureInstallStatus featureInstallStatus3 = new FeatureInstallStatus("SKIP", 2);
        f2725c = featureInstallStatus3;
        FeatureInstallStatus featureInstallStatus4 = new FeatureInstallStatus("PARTIAL", 3);
        f2726d = featureInstallStatus4;
        f2727e = new FeatureInstallStatus[]{featureInstallStatus, featureInstallStatus2, featureInstallStatus3, featureInstallStatus4};
    }

    public static FeatureInstallStatus valueOf(String str) {
        return (FeatureInstallStatus) Enum.valueOf(FeatureInstallStatus.class, str);
    }

    public static FeatureInstallStatus[] values() {
        return (FeatureInstallStatus[]) f2727e.clone();
    }
}
