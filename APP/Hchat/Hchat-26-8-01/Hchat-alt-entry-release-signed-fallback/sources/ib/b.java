package ib;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.SharedPreferences f6650a;

    public b(android.content.Context r1, int r2) {
            r0 = this;
            switch(r2) {
                case 1: goto L1b;
                case 2: goto Lf;
                default: goto L3;
            }
        L3:
            r0.<init>()
            java.lang.String r2 = "settings_entry"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f6650a = r1
            return
        Lf:
            r0.<init>()
            java.lang.String r2 = "Hchat_member_title_config"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f6650a = r1
            return
        L1b:
            r0.<init>()
            java.lang.String r2 = "Hchat_group_nickname_color_config"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f6650a = r1
            return
    }

    public static java.lang.String a(java.lang.String r2, java.lang.String r3) {
            r0 = 0
            if (r2 == 0) goto Lc
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            goto Ld
        Lc:
            r2 = r0
        Ld:
            java.lang.String r1 = ""
            if (r2 != 0) goto L12
            r2 = r1
        L12:
            if (r3 == 0) goto L1c
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r0 = r3.toString()
        L1c:
            if (r0 != 0) goto L1f
            r0 = r1
        L1f:
            int r3 = r2.length()
            if (r3 != 0) goto L26
            goto L2c
        L26:
            int r3 = r0.length()
            if (r3 != 0) goto L2d
        L2c:
            return r1
        L2d:
            java.lang.String r3 = "_"
            java.lang.String r2 = wb.en.h(r2, r3, r0)
            return r2
    }
}
