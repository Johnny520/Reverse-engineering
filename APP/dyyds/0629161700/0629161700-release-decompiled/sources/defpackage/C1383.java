package defpackage;

/* JADX INFO: renamed from: ᛷᲇᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1383 extends defpackage.AbstractC1188 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final long f6025;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String f6026;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C2252 f6027;

    public C1383(java.lang.String r1, long r2, defpackage.C2252 r4) {
            r0 = this;
            r0.<init>()
            r0.f6026 = r1
            r0.f6025 = r2
            r0.f6027 = r4
            return
    }

    @Override // defpackage.AbstractC1188
    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public final defpackage.C1237 mo630() {
            r2 = this;
            r0 = 0
            java.lang.String r2 = r2.f6026
            if (r2 == 0) goto Lc
            ᲁᲀᲈᛵ r1 = defpackage.C1237.f5542
            ᛷᛳᛱᛳ r2 = defpackage.AbstractC1171.m2254(r2)     // Catch: java.lang.IllegalArgumentException -> Lc
            return r2
        Lc:
            return r0
    }

    @Override // defpackage.AbstractC1188
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final defpackage.InterfaceC1810 mo631() {
            r0 = this;
            ᲈᛵᲈᛵ r0 = r0.f6027
            return r0
    }

    @Override // defpackage.AbstractC1188
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final long mo632() {
            r2 = this;
            long r0 = r2.f6025
            return r0
    }
}
