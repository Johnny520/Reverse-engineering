package kevin.fun.hook.webdav;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class WebDAVConfig$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final kevin.fun.hook.webdav.WebDAVConfig.BackupCallback f$0;
    public final android.content.Context f$1;
    public final android.net.Uri f$2;

    static {
            return
    }

    public /* synthetic */ WebDAVConfig$$ExternalSyntheticLambda0(kevin.fun.hook.webdav.WebDAVConfig.BackupCallback r4, android.content.Context r5, android.net.Uri r6) {
            r3 = this;
            r3.<init>()
            r3.f$0 = r4
            r3.f$1 = r5
            r3.f$2 = r6
            int r1 = androidx.loader.C1094.m2490()
            r0 = 1616(0x650, float:2.264E-42)
        Lf:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L15;
                case 49: goto L18;
                case 204: goto L1d;
                case 239: goto L2c;
                default: goto L14;
            }
        L14:
            goto Lf
        L15:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lf
        L18:
            if (r1 < 0) goto L15
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lf
        L1d:
            java.lang.String r0 = "kx23SHbBZsQHXFR8KCHI"
            java.lang.String r0 = androidx.versionedparcelable.C1107.m3469(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m8384(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.lifecycle.process.C1087.m1954()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1e;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.webdav.WebDAVConfig$BackupCallback r2 = (kevin.fun.hook.webdav.WebDAVConfig.BackupCallback) r2
            android.content.Context r3 = (android.content.Context) r3
            android.net.Uri r4 = (android.net.Uri) r4
            kevin.fun.hook.webdav.WebDAVConfig.lambda$8(r2, r3, r4)
        L1d:
            return
        L1e:
            r0 = 1740(0x6cc, float:2.438E-42)
        L20:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L26;
                case 54: goto L1d;
                default: goto L25;
            }
        L25:
            goto L20
        L26:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L20
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            r1 = 0
            java.lang.String r4 = "ۥۦۨ"
            r0 = r1
            r2 = r1
            r3 = r1
        L6:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 1747781: goto L25;
                case 1752679: goto L1d;
                case 1755370: goto L15;
                case 1755403: goto L2c;
                default: goto Ld;
            }
        Ld:
            android.content.Context r1 = androidx.startup.C1101.m64(r5)
            java.lang.String r4 = "ۨ۠ۢ"
            r2 = r1
            goto L6
        L15:
            android.net.Uri r1 = androidx.loader.C1096.m2632(r5)
            java.lang.String r4 = "ۣ۠ۨ"
            r3 = r1
            goto L6
        L1d:
            kevin.fun.hook.webdav.WebDAVConfig$BackupCallback r0 = androidx.lifecycle.viewmodel.C1093.m2425(r5)
            java.lang.String r1 = "ۦۤۨ"
            r4 = r1
            goto L6
        L25:
            m8384(r0, r2, r3)
            java.lang.String r1 = "ۨۡۤ"
            r4 = r1
            goto L6
        L2c:
            return
    }
}
