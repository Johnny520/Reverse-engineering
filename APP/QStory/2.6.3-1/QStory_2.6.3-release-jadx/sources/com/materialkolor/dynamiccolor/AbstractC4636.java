package com.materialkolor.dynamiccolor;

import p050.AbstractC7173;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4636 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4649 f12319 = new C4649();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4644 f12318 = new C4644();

    /* JADX WARN: Removed duplicated region for block: B:26:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055 A[RETURN] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static double m8691(double d, double d2) {
        double dM12443 = AbstractC7173.m12443(d, d2);
        if (dM12443 < 0.0d) {
            dM12443 = 100.0d;
        }
        double dMax = Math.max(0.0d, AbstractC7173.m12441(d, d2));
        double dM12439 = AbstractC7173.m12439(dM12443, d);
        double dM124392 = AbstractC7173.m12439(dMax, d);
        if (Math.rint(d) < 60.0d) {
            return (dM12439 >= d2 || dM12439 >= dM124392 || ((Math.abs(dM12439 - dM124392) > 0.1d ? 1 : (Math.abs(dM12439 - dM124392) == 0.1d ? 0 : -1)) < 0 && (dM12439 > d2 ? 1 : (dM12439 == d2 ? 0 : -1)) < 0 && (dM124392 > d2 ? 1 : (dM124392 == d2 ? 0 : -1)) < 0)) ? dM12443 : dMax;
        }
        if (dM124392 >= d2 || dM124392 >= dM12439) {
        }
    }
}
