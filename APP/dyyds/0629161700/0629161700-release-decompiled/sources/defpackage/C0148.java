package defpackage;

/* JADX INFO: renamed from: ᛱᛸᛷᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0148 extends defpackage.AbstractC0758 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C1534 f1112 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.AbstractC0758 f1113;

    static {
            ᛸᛷᲈᲈ r0 = new ᛸᛷᲈᲈ
            r0.<init>()
            defpackage.C0148.f1112 = r0
            return
    }

    public C0148(defpackage.AbstractC0758 r1) {
            r0 = this;
            r0.<init>()
            r0.f1113 = r1
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r1, java.lang.Object r2) {
            r0 = this;
            java.sql.Timestamp r2 = (java.sql.Timestamp) r2
            ᛴᲀᲈᛴ r0 = r0.f1113
            r0.mo561(r1, r2)
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r3) {
            r2 = this;
            ᛴᲀᲈᛴ r2 = r2.f1113
            java.lang.Object r2 = r2.mo562(r3)
            java.util.Date r2 = (java.util.Date) r2
            if (r2 == 0) goto L14
            java.sql.Timestamp r3 = new java.sql.Timestamp
            long r0 = r2.getTime()
            r3.<init>(r0)
            return r3
        L14:
            r2 = 0
            return r2
    }
}
