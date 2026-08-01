package defpackage;

/* JADX INFO: renamed from: ᲁᛸᛴᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1897 implements defpackage.InterfaceC1801 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C2073 f8245;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String f8246;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.content.Context f8247;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C0389 f8248;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public boolean f8249;

    public C1897(android.content.Context r1, java.lang.String r2, defpackage.C2073 r3) {
            r0 = this;
            r0.<init>()
            r0.f8247 = r1
            r0.f8246 = r2
            r0.f8245 = r3
            ᛲᲀ r1 = new ᛲᲀ
            r2 = 7
            r1.<init>(r2, r0)
            ᛲᲈᛶᲈ r2 = new ᛲᲈᛶᲈ
            r2.<init>(r1)
            r0.f8248 = r2
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            ᛲᲈᛶᲈ r0 = r2.f8248
            java.lang.Object r0 = r0.f2022
            ᛸᛶᛱᛵ r1 = defpackage.C1500.f6601
            if (r0 == r1) goto L13
            ᛲᲈᛶᲈ r2 = r2.f8248
            java.lang.Object r2 = r2.getValue()
            ᲀᛵᛴᛴ r2 = (defpackage.C1673) r2
            r2.close()
        L13:
            return
    }

    @Override // defpackage.InterfaceC1801
    public final java.lang.String getDatabaseName() {
            r0 = this;
            java.lang.String r0 = r0.f8246
            return r0
    }

    @Override // defpackage.InterfaceC1801
    public final void setWriteAheadLoggingEnabled(boolean r3) {
            r2 = this;
            ᛲᲈᛶᲈ r0 = r2.f8248
            java.lang.Object r0 = r0.f2022
            ᛸᛶᛱᛵ r1 = defpackage.C1500.f6601
            if (r0 == r1) goto L13
            ᛲᲈᛶᲈ r0 = r2.f8248
            java.lang.Object r0 = r0.getValue()
            ᲀᛵᛴᛴ r0 = (defpackage.C1673) r0
            r0.setWriteAheadLoggingEnabled(r3)
        L13:
            r2.f8249 = r3
            return
    }

    @Override // defpackage.InterfaceC1801
    /* JADX INFO: renamed from: ᲁᲈᛳ */
    public final defpackage.C0633 mo3193() {
            r1 = this;
            ᛲᲈᛶᲈ r1 = r1.f8248
            java.lang.Object r1 = r1.getValue()
            ᲀᛵᛴᛴ r1 = (defpackage.C1673) r1
            r0 = 1
            ᛴᛲᲈᲀ r1 = r1.m3065(r0)
            return r1
    }
}
