package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class u40 {
    public static final com.github.megatronking.stringfog.xor.StringFogImpl a = null;

    static {
            com.github.megatronking.stringfog.xor.StringFogImpl r0 = new com.github.megatronking.stringfog.xor.StringFogImpl
            r0.<init>()
            defpackage.u40.a = r0
            return
    }

    public static java.lang.String a(java.lang.String r5, java.lang.String r6) {
            r0 = 0
            r4 = 0
            java.lang.String r1 = "ۣۧۥ"
            int r3 = com.google.android.material.datepicker.C0059.m239(r1)
            r1 = r0
            r2 = r0
        La:
            switch(r3) {
                case 1749573: goto Le;
                case 1749765: goto L3d;
                case 1752520: goto L50;
                case 1754505: goto L19;
                default: goto Ld;
            }
        Ld:
            goto La
        Le:
            int r0 = androidx.savedstate.C0034.f34
            int r3 = com.github.megatronking.stringfog.C0048.f48
            int r0 = r0 % r3
            r3 = 1754521(0x1ac599, float:2.458608E-39)
            int r0 = r0 + r3
            r3 = r0
            goto La
        L19:
            byte[] r0 = com.github.megatronking.stringfog.Base64.decode(r5, r4)
            int r1 = com.google.android.material.datepicker.C0058.f58
            int r3 = com.github.megatronking.stringfog.annotation.C0044.f44
            int r3 = r3 * (-1381)
            int r1 = r1 % r3
            if (r1 > 0) goto L32
            r1 = 78
            androidx.versionedparcelable.C0040.f40 = r1
            java.lang.String r1 = "ۣۧۥ"
            int r3 = android.app.C0002.m8(r1)
            r1 = r0
            goto La
        L32:
            int r1 = androidx.startup.C0037.f37
            int r3 = androidx.coordinatorlayout.widget.C0022.f22
            r1 = r1 ^ r3
            r3 = 1749390(0x1ab18e, float:2.451418E-39)
            int r3 = r3 + r1
            r1 = r0
            goto La
        L3d:
            byte[] r2 = com.github.megatronking.stringfog.Base64.decode(r6, r4)
            int r0 = com.google.android.material.theme.C0062.f62
            if (r0 < 0) goto L4d
            java.lang.String r0 = "ۢ۟ۢ"
        L47:
            int r0 = androidx.activity.C0011.m45(r0)
            r3 = r0
            goto La
        L4d:
            java.lang.String r0 = "ۥۡۤ"
            goto L47
        L50:
            com.github.megatronking.stringfog.xor.StringFogImpl r0 = defpackage.u40.a
            java.lang.String r0 = r0.decrypt(r1, r2)
            return r0
    }
}
