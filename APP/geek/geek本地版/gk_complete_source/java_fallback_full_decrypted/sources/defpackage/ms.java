package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ms extends de.robv.android.xposed.XC_MethodReplacement {
    public final java.lang.Object replaceHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) {
            r2 = this;
            java.lang.String r0 = "ۣۣۤ"
            int r0 = androidx.lifecycle.C0029.m116(r0)
        L6:
            switch(r0) {
                case 1746690: goto La;
                case 1746783: goto Ld;
                case 1750660: goto L20;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        Ld:
            int r0 = com.google.android.material.chip.C0057.m230()
            if (r0 < 0) goto L1d
            com.google.android.material.floatingactionbutton.C0060.m240()
            java.lang.String r0 = "ۣۢۥ"
        L18:
            int r0 = com.google.android.material.theme.C0063.m254(r0)
            goto L6
        L1d:
            java.lang.String r0 = "ۣۣۤ"
            goto L18
        L20:
            java.lang.String r0 = "bo6pen4=\n"
            java.lang.String r1 = "Hu/bGxNLmIw=\n"
            java.lang.String r0 = "param"
            defpackage.ip.o(r0, r3)
            int r0 = com.github.megatronking.stringfog.annotation.C0044.f44
            int r1 = com.google.android.material.appbar.C0049.f49
            r0 = r0 | r1
            r1 = 1746315(0x1aa58b, float:2.447109E-39)
            int r0 = r0 + r1
            goto L6
    }
}
