package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class n9 {
    public static java.lang.Class a;
    public static boolean b;
    public static java.lang.Boolean c;
    public static long d;
    public static final java.util.concurrent.ConcurrentHashMap e = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            defpackage.n9.e = r0
            return
    }

    public static void a(java.lang.String r6, java.lang.Throwable r7) {
            r0 = 0
            java.lang.String r1 = "۟ۡ۟"
            int r1 = androidx.activity.C0011.m45(r1)
        L7:
            switch(r1) {
                case 56571: goto Lb;
                case 1746749: goto L59;
                case 1748739: goto Lcb;
                case 1748896: goto L84;
                case 1750539: goto L20;
                case 1751501: goto L46;
                case 1751594: goto L6e;
                case 1753453: goto L3c;
                case 1754379: goto Lfb;
                case 1754507: goto Lac;
                default: goto La;
            }
        La:
            goto L7
        Lb:
            int r1 = androidx.emoji2.text.C0026.m106()
            if (r1 > 0) goto L46
            int r1 = com.google.android.material.carousel.C0054.f54
            if (r1 > 0) goto La9
            r1 = 99
            com.ljx.wechatmod.hook.C0066.f66 = r1
            java.lang.String r1 = "۟ۡ۟"
            int r1 = kotlinx.coroutines.C0070.m281(r1)
            goto L7
        L20:
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            int r1 = android.support.v4.graphics.drawable.C0006.m24()
            if (r1 > 0) goto L32
            java.lang.String r1 = "ۡۨۧ"
            int r1 = android.app.C0002.m8(r1)
            goto L7
        L32:
            int r1 = com.google.android.material.carousel.C0053.f53
            int r2 = com.google.android.material.datepicker.C0059.f59
            r1 = r1 ^ r2
            r2 = 1755134(0x1ac7fe, float:2.459467E-39)
            int r1 = r1 + r2
            goto L7
        L3c:
            int r1 = com.google.android.material.datepicker.C0058.f58
            int r2 = com.google.android.material.theme.C0063.f63
            int r1 = r1 * r2
            r2 = 1685189(0x19b6c5, float:2.361453E-39)
            int r1 = r1 + r2
            goto L7
        L46:
            int r1 = androidx.versionedparcelable.C0041.m167()
            if (r1 > 0) goto L56
            com.google.android.material.theme.C0064.m257()
            java.lang.String r1 = "ۦ۠ۤ"
        L51:
            int r1 = androidx.core.content.C0023.m95(r1)
            goto L7
        L56:
            java.lang.String r1 = "ۣۧ۟"
            goto L51
        L59:
            java.lang.String r1 = "ttXS\n"
            java.lang.String r2 = "wrS1oN8q1Zs=\n"
            java.lang.String r3 = "Dg==\n"
            java.lang.String r4 = "a4/9w+gFbuc=\n"
            defpackage.z30.o(r1, r2, r6, r3, r4)
            int r1 = android.support.v4.graphics.drawable.C0005.f5
            int r2 = androidx.versionedparcelable.C0041.f41
            int r1 = r1 / r2
            r2 = 1754507(0x1ac58b, float:2.458588E-39)
            int r1 = r1 + r2
            goto L7
        L6e:
            int r1 = androidx.fragment.app.C0027.f27
            int r2 = kotlinx.coroutines.C0069.f69
            int r2 = r2 * (-7507)
            int r1 = r1 % r2
            if (r1 < 0) goto L81
            com.google.android.material.carousel.C0053.m214()
            java.lang.String r1 = "ۧ۠ۨ"
        L7c:
            int r1 = androidx.savedstate.C0036.m144(r1)
            goto L7
        L81:
            java.lang.String r1 = "ۣۨ"
            goto L7c
        L84:
            java.lang.String r0 = "GzxsWEN92Ya0cxFxuNli9"
            java.lang.String r0 = com.ljx.wechatmod.auth.C0065.m262(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
            int r1 = androidx.savedstate.C0036.f36
            if (r1 > 0) goto L9e
            r1 = 65
            com.google.android.material.carousel.C0052.f52 = r1
        L96:
            java.lang.String r1 = "ۣۡۥ"
        L98:
            int r1 = androidx.appcompat.widget.C0014.m57(r1)
            goto L7
        L9e:
            int r1 = androidx.legacy.content.C0028.f28
            int r2 = androidx.constraintlayout.widget.C0019.f19
            int r1 = r1 * r2
            r2 = 1803735(0x1b85d7, float:2.527571E-39)
            int r1 = r1 + r2
            goto L7
        La9:
            java.lang.String r1 = "ۡۨۧ"
            goto L98
        Lac:
            java.util.concurrent.ConcurrentHashMap r1 = defpackage.n9.e
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Object r1 = r1.putIfAbsent(r6, r2)
            if (r1 != 0) goto L6e
            int r1 = androidx.activity.C0010.f10
            int r2 = com.google.android.material.datepicker.C0059.f59
            int r2 = r2 % 737
            int r1 = r1 + r2
            if (r1 < 0) goto L96
            r1 = 64
            androidx.profileinstaller.C0030.f30 = r1
            java.lang.String r1 = "ۤۢۨ"
            int r1 = kotlinx.coroutines.C0069.m277(r1)
            goto L7
        Lcb:
            java.lang.String r1 = "Nwje\n"
            java.lang.String r2 = "Q2m5jaPP2Zc=\n"
            java.lang.String r3 = " (防抖)"
            java.lang.String r3 = r6.concat(r3)
            java.lang.String r4 = "Fg==\n"
            java.lang.String r5 = "c8HJlSTQVfc=\n"
            defpackage.z30.o(r1, r2, r3, r4, r5)
            int r1 = kotlinx.coroutines.C0070.f70
            int r2 = android.support.v4.graphics.drawable.C0006.f6
            int r2 = r2 % (-7008)
            r1 = r1 ^ r2
            if (r1 > 0) goto Lf0
            android.support.v4.graphics.drawable.C0005.m20()
            java.lang.String r1 = "ۦ۠ۧ"
            int r1 = android.support.v4.graphics.drawable.C0005.m23(r1)
            goto L7
        Lf0:
            int r1 = defpackage.C0071.f71
            int r2 = androidx.legacy.content.C0028.f28
            int r1 = r1 - r2
            r2 = 56622(0xdd2e, float:7.9344E-41)
            int r1 = r1 + r2
            goto L7
        Lfb:
            return
    }
}
