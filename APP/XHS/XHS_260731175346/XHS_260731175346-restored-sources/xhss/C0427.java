package xhss;

/* JADX INFO: renamed from: xhss.ᛴᲈᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0427 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.InterfaceC0825 f1506;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final byte[] f1507;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final java.lang.String f1508;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.util.concurrent.Executor f1509;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public byte[] f1510;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public xhss.C0607[] f1511;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.io.File f1512;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public boolean f1513;

    public C0427(android.content.res.AssetManager r1, java.util.concurrent.Executor r2, xhss.InterfaceC0825 r3, java.lang.String r4, java.io.File r5) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.f1513 = r1
            r0.f1509 = r2
            r0.f1506 = r3
            r0.f1508 = r4
            r0.f1512 = r5
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            r3 = 0
            if (r1 <= r2) goto L16
            goto L1f
        L16:
            switch(r1) {
                case 30: goto L1d;
                case 31: goto L1a;
                case 32: goto L1a;
                case 33: goto L1a;
                case 34: goto L1a;
                default: goto L19;
            }
        L19:
            goto L1f
        L1a:
            byte[] r3 = xhss.AbstractC0473.f1703
            goto L1f
        L1d:
            byte[] r3 = xhss.AbstractC0473.f1709
        L1f:
            r0.f1507 = r3
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m815(int r2, java.io.Serializable r3) {
            r1 = this;
            xhss.ᛲᛵᲀᛲ r0 = new xhss.ᛲᛵᲀᛲ
            r0.<init>(r1, r2, r3)
            java.util.concurrent.Executor r1 = r1.f1509
            r1.execute(r0)
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.io.FileInputStream m816(android.content.res.AssetManager r1, java.lang.String r2) {
            r0 = this;
            android.content.res.AssetFileDescriptor r0 = r1.openFd(r2)     // Catch: java.io.FileNotFoundException -> L9
            java.io.FileInputStream r0 = r0.createInputStream()     // Catch: java.io.FileNotFoundException -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L15
            java.lang.String r1 = "compressed"
            r0.contains(r1)
        L15:
            r0 = 0
            return r0
    }
}
