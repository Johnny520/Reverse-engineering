package kevin.fun;

/* JADX INFO: loaded from: classes.dex */
public class MainActivity extends android.app.Activity {
    static {
            return
    }

    public MainActivity() {
            r2 = this;
            r2.<init>()
            int r1 = androidx.core.C1072.m980()
            r0 = 1616(0x650, float:2.264E-42)
        L9:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lf;
                case 49: goto L12;
                case 204: goto L17;
                case 239: goto L22;
                default: goto Le;
            }
        Le:
            goto L9
        Lf:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L9
        L12:
            if (r1 > 0) goto Lf
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L9
        L17:
            java.lang.String r0 = "cnCuY6kubz3zjC6TMR9gI3FwNlicv"
            java.lang.String r0 = kevin.fun.hook.audio.C1116.m8071(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L22:
            return
    }

    /* JADX INFO: renamed from: ۡ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static int m3854(java.lang.Object r2) {
            int r1 = kevin.fun.hook.audio.C1117.m8167()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L19;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r2)
        L18:
            return r0
        L19:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L22;
                case 54: goto L18;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1c
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle r4) {
            r3 = this;
            super.onCreate(r4)
            r0 = 2132199864(0x7f16c9b8, float:2.0043158E38)
            java.lang.String r1 = androidx.activity.C1062.m197()
            int r1 = m3854(r1)
            r0 = r0 ^ r1
            androidx.lifecycle.livedata.C1085.m1832(r3, r0)
            int r1 = androidx.lifecycle.viewmodel.C1093.m2412()
            r0 = 1616(0x650, float:2.264E-42)
        L18:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1e;
                case 49: goto L21;
                case 204: goto L26;
                case 239: goto L35;
                default: goto L1d;
            }
        L1d:
            goto L18
        L1e:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L18
        L21:
            if (r1 > 0) goto L1e
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L18
        L26:
            java.lang.String r0 = "x6"
            java.lang.String r0 = androidx.activity.C1064.m367(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L35:
            return
    }
}
