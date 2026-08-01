package me.dartcv.nuke.app;

import android.app.Application;
import p015C2.C3534;
import p076P.C3563;
import p091S.C3571;
import p100U.C3575;
import p107V1.C3583;
import p110W0.C3584;
import p111W1.C3586;
import p119Y.C3593;
import p169h0.C3634;
import p210o.C3663;
import p217p0.C3672;
import p233s0.C3680;
import p252v2.C3693;
import p254v4.C3695;

/* JADX INFO: loaded from: classes.dex */
public final class NukeApp extends Application {
    public static final int $stable = 8;

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NukeApp() {
        int iM6005 = C3571.m6005("ۦ۟۟");
        Double dDecode = null;
        while (true) {
            String str = "۟ۦۡ";
            switch (iM6005) {
                case 1746906:
                    break;
                case 1747741:
                    if (C3584.m6068() <= 0) {
                        C3593.f11057 = 12;
                        str = "ۦۧ۟";
                    }
                    iM6005 = C3575.m6027(str);
                    break;
                case 1750539:
                    iM6005 = C3563.m5963(C3680.f11146 <= 0 ? "ۢۦۢ" : "ۦ۟۟");
                    break;
                case 1750810:
                    dDecode = Double.decode(C3586.m6078("OzHDcXcZH"));
                    if (C3586.f11050 + (C3634.f11097 ^ 3478) < 0) {
                        iM6005 = C3583.m6067("ۦ۟ۢ");
                    } else {
                        str = "۠ۢ۟";
                        iM6005 = C3534.m5812(str);
                    }
                    break;
                case 1753414:
                    if (C3672.m6542() < 0) {
                        if (C3584.m6068() <= 0) {
                        }
                        iM6005 = C3575.m6027(str);
                    } else {
                        int i5 = C3695.f11161;
                        int i6 = C3693.f11159;
                        iM6005 = C3663.m6496("ۣۨ۟");
                    }
                    break;
                case 1753417:
                    System.out.println(dDecode);
                    iM6005 = C3534.m5812(str);
                    break;
            }
            return;
        }
    }
}
