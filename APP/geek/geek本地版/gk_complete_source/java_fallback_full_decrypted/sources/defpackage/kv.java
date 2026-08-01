package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kv implements defpackage.sm {
    public final int a;
    public final android.content.Context b;

    public /* synthetic */ kv(android.content.Context r4, int r5) {
            r3 = this;
            r3.a = r5
            r3.b = r4
            r3.<init>()
            r0 = 0
            java.lang.String r1 = "ۧۥۢ"
            int r2 = androidx.coordinatorlayout.widget.C0022.m90(r1)
            r1 = r0
        Lf:
            switch(r2) {
                case 56351: goto L13;
                case 56389: goto L25;
                case 1753574: goto L6b;
                case 1753604: goto L54;
                case 1754564: goto L39;
                case 1755495: goto L80;
                default: goto L12;
            }
        L12:
            goto Lf
        L13:
            int r0 = com.ljx.wechatmod.auth.C0065.f65
            if (r0 < 0) goto L22
            android.app.C0002.m10()
            java.lang.String r0 = "ۣۥۣ"
        L1c:
            int r0 = android.app.C0000.m2(r0)
            r2 = r0
            goto Lf
        L22:
            java.lang.String r0 = "ۧۥۢ"
            goto L1c
        L25:
            int r0 = androidx.lifecycle.C0029.m118()
            if (r0 > 0) goto L36
            androidx.fragment.app.C0027.m111()
            java.lang.String r0 = "۟ۧ۟"
        L30:
            int r0 = android.app.C0003.m13(r0)
            r2 = r0
            goto Lf
        L36:
            java.lang.String r0 = "ۣۨۤ"
            goto L1c
        L39:
            int r0 = com.google.android.material.carousel.C0054.m217()
            if (r0 < 0) goto L25
            int r0 = android.support.v4.graphics.drawable.C0006.f6
            int r2 = androidx.core.content.C0023.f23
            r2 = r2 ^ 7166(0x1bfe, float:1.0042E-41)
            r0 = r0 ^ r2
            if (r0 > 0) goto L4c
            r0 = 99
            androidx.versionedparcelable.C0038.f38 = r0
        L4c:
            java.lang.String r0 = "ۦۤۤ"
            int r0 = android.app.C0001.m5(r0)
            r2 = r0
            goto Lf
        L54:
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            int r0 = androidx.versionedparcelable.C0042.f42
            if (r0 < 0) goto L68
            androidx.fragment.app.C0027.m111()
            java.lang.String r0 = "ۧۥۢ"
            int r0 = android.app.C0001.m5(r0)
            r2 = r0
            goto Lf
        L68:
            java.lang.String r0 = "ۣۨۤ"
            goto L30
        L6b:
            java.lang.String r0 = "fqvllKtCK2AL76O"
            java.lang.String r0 = com.google.android.material.carousel.C0055.m222(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = androidx.startup.C0037.f37
            int r2 = androidx.savedstate.C0035.f35
            int r1 = r1 % r2
            r2 = 1754224(0x1ac470, float:2.458191E-39)
            int r2 = r2 + r1
            r1 = r0
            goto Lf
        L80:
            return
    }

    @Override // defpackage.sm
    public final java.lang.Object f(java.lang.Object r3) {
            r2 = this;
            java.lang.String r0 = "ۥۨ۟"
            int r0 = kotlinx.coroutines.C0069.m277(r0)
        L6:
            switch(r0) {
                case 56418: goto La;
                case 1749733: goto L22;
                case 1752644: goto L41;
                case 1752732: goto L3c;
                case 1753632: goto L5e;
                case 1755494: goto L4b;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            java.lang.Float r3 = (java.lang.Float) r3
            float r0 = r3.floatValue()
            android.content.Context r1 = r2.b
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L21:
            return r0
        L22:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r0 = r3.intValue()
            float r0 = (float) r0
            android.content.Context r1 = r2.b
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L21
        L3c:
            int r0 = r2.a
            switch(r0) {
                case 0: goto L5e;
                default: goto L41;
            }
        L41:
            int r0 = android.app.C0001.f1
            int r1 = androidx.activity.result.C0008.f8
            int r0 = r0 * r1
            r1 = 153033(0x255c9, float:2.14445E-40)
            r0 = r0 ^ r1
            goto L6
        L4b:
            int r0 = defpackage.C0072.m289()
            if (r0 > 0) goto L5b
            defpackage.C0073.m295()
            java.lang.String r0 = "ۣۤۥ"
        L56:
            int r0 = com.google.android.material.floatingactionbutton.C0060.m241(r0)
            goto L6
        L5b:
            java.lang.String r0 = "ۥۨ۟"
            goto L56
        L5e:
            java.lang.String r0 = "ۢۤۧ"
            goto L56
    }
}
