package defpackage;

/* JADX INFO: renamed from: ᛸᛸᲀᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1547 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public byte[] f6865;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.String f6866;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.io.File f6867;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final byte[] f6868;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.concurrent.Executor f6869;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC1429 f6870;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public boolean f6871;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.C1067[] f6872;

    public C1547(android.content.res.AssetManager r1, java.util.concurrent.Executor r2, defpackage.InterfaceC1429 r3, java.lang.String r4, java.io.File r5) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.f6871 = r1
            r0.f6869 = r2
            r0.f6870 = r3
            r0.f6866 = r4
            r0.f6867 = r5
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r1 < r2) goto L17
            byte[] r1 = defpackage.AbstractC0069.f774
            goto L1f
        L17:
            r2 = 30
            if (r1 == r2) goto L1d
            r1 = 0
            goto L1f
        L1d:
            byte[] r1 = defpackage.AbstractC0069.f772
        L1f:
            r0.f6868 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.io.FileInputStream m2824(android.content.res.AssetManager r1, java.lang.String r2) {
            r0 = this;
            android.content.res.AssetFileDescriptor r1 = r1.openFd(r2)     // Catch: java.io.FileNotFoundException -> L9
            java.io.FileInputStream r0 = r1.createInputStream()     // Catch: java.io.FileNotFoundException -> L9
            return r0
        L9:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            if (r1 == 0) goto L1d
            java.lang.String r2 = "compressed"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L1d
            ᛸᛲᛱᲈ r0 = r0.f6870
            r0.mo2301()
        L1d:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m2825(int r2, java.io.Serializable r3) {
            r1 = this;
            ᛱᛲᛲᲈ r0 = new ᛱᛲᛲᲈ
            r0.<init>(r1, r2, r3)
            java.util.concurrent.Executor r1 = r1.f6869
            r1.execute(r0)
            return
    }
}
