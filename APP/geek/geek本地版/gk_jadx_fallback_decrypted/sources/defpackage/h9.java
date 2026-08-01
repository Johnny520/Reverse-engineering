package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h9 extends java.lang.ThreadLocal {
    public final int a;

    public /* synthetic */ h9(int r4) {
            r3 = this;
            r3.a = r4
            r3.<init>()
            r0 = 0
            java.lang.String r1 = "ۧ۟ۢ"
            int r2 = androidx.activity.C0010.m43(r1)
            r1 = r0
        Ld:
            switch(r2) {
                case 56292: goto L11;
                case 1746727: goto L54;
                case 1747777: goto L28;
                case 1749666: goto L12;
                case 1749789: goto L3f;
                case 1754378: goto L73;
                default: goto L10;
            }
        L10:
            goto Ld
        L11:
            return
        L12:
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            int r0 = com.google.android.material.theme.C0064.m257()
            if (r0 < 0) goto L25
            java.lang.String r0 = "ۣ۠ۤ"
        L1f:
            int r0 = com.github.megatronking.stringfog.xor.C0046.m186(r0)
            r2 = r0
            goto Ld
        L25:
            java.lang.String r0 = "ۣ۟"
            goto L1f
        L28:
            int r0 = com.github.megatronking.stringfog.annotation.C0044.f44
            if (r0 > 0) goto L34
            java.lang.String r0 = "۠۟"
            int r0 = com.google.android.material.datepicker.C0059.m239(r0)
            r2 = r0
            goto Ld
        L34:
            int r0 = com.github.megatronking.stringfog.xor.C0045.f45
            int r2 = com.google.android.material.carousel.C0052.f52
            r0 = r0 | r2
            r2 = 1754673(0x1ac631, float:2.45882E-39)
            int r0 = r0 + r2
            r2 = r0
            goto Ld
        L3f:
            java.lang.String r0 = "MNpbvepmspXqYzuYsMIZ7cO049"
            java.lang.String r0 = androidx.versionedparcelable.C0041.m165(r0)
            java.lang.Integer r0 = java.lang.Integer.decode(r0)
            int r1 = androidx.appcompat.widget.C0013.f13
            int r2 = android.app.C0003.f3
            int r1 = r1 * r2
            r2 = 2140640(0x20a9e0, float:2.999676E-39)
            int r2 = r2 + r1
            r1 = r0
            goto Ld
        L54:
            int r0 = androidx.fragment.app.C0027.f27
            int r2 = com.ljx.wechatmod.auth.C0065.f65
            int r2 = r2 * (-6089)
            int r0 = r0 * r2
            if (r0 > 0) goto L68
            androidx.constraintlayout.widget.C0018.m75()
            java.lang.String r0 = "ۡۧ"
            int r0 = androidx.appcompat.app.C0012.m50(r0)
            r2 = r0
            goto Ld
        L68:
            int r0 = androidx.viewpager2.adapter.C0043.f43
            int r2 = androidx.savedstate.C0034.f34
            int r0 = r0 % r2
            r2 = 55998(0xdabe, float:7.847E-41)
            r0 = r0 ^ r2
            r2 = r0
            goto Ld
        L73:
            int r0 = androidx.profileinstaller.C0031.m124()
            if (r0 > 0) goto L54
            int r0 = com.google.android.material.internal.C0061.f61
            int r2 = com.google.android.material.chip.C0056.f56
            r2 = r2 ^ (-4024(0xfffffffffffff048, float:NaN))
            int r0 = r0 + r2
            if (r0 > 0) goto L8e
            r0 = 42
            androidx.constraintlayout.widget.C0020.f20 = r0
            java.lang.String r0 = "۟۠ۨ"
            int r0 = defpackage.C0072.m288(r0)
            r2 = r0
            goto Ld
        L8e:
            int r0 = androidx.activity.C0011.f11
            int r2 = androidx.activity.C0010.f10
            r0 = r0 | r2
            r2 = -1749950(0xffffffffffe54c42, float:NaN)
            r0 = r0 ^ r2
            r2 = r0
            goto Ld
    }

    @Override // java.lang.ThreadLocal
    public final java.lang.Object initialValue() {
            r3 = this;
            java.lang.String r0 = "ۦۡۤ"
            int r0 = androidx.profileinstaller.C0030.m120(r0)
        L6:
            switch(r0) {
                case 1746941: goto La;
                case 1747773: goto L29;
                case 1752462: goto L10;
                case 1752706: goto L1f;
                case 1753481: goto L1a;
                case 1754499: goto L39;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            java.util.Random r0 = new java.util.Random
            r0.<init>()
        Lf:
            return r0
        L10:
            int r0 = androidx.savedstate.C0034.f34
            int r1 = androidx.appcompat.widget.C0015.f15
            int r0 = r0 * r1
            r1 = 1483088(0x16a150, float:2.078249E-39)
            r0 = r0 ^ r1
            goto L6
        L1a:
            int r0 = r3.a
            switch(r0) {
                case 0: goto L39;
                default: goto L1f;
            }
        L1f:
            int r0 = androidx.profileinstaller.C0031.f31
            int r1 = android.app.C0002.f2
            r0 = r0 | r1
            r1 = -1746944(0xffffffffffe55800, float:NaN)
            r0 = r0 ^ r1
            goto L6
        L29:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "PK9V5pbxePM=\n"
            java.lang.String r2 = "dOdvi/vLC4A=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r2)
            java.util.Locale r2 = java.util.Locale.CHINA
            r0.<init>(r1, r2)
            goto Lf
        L39:
            int r0 = androidx.appcompat.widget.C0015.m61()
            if (r0 > 0) goto L4a
            r0 = 83
            androidx.savedstate.C0034.f34 = r0
            java.lang.String r0 = "ۤۤ۟"
            int r0 = android.support.v4.graphics.drawable.C0004.m16(r0)
            goto L6
        L4a:
            int r0 = androidx.activity.result.C0009.f9
            int r1 = androidx.recyclerview.widget.C0032.f32
            int r0 = r0 % r1
            r1 = -1747822(0xffffffffffe55492, float:NaN)
            r0 = r0 ^ r1
            goto L6
    }
}
