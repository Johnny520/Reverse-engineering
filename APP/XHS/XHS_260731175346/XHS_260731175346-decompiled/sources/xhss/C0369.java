package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛵᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0369 extends xhss.AbstractC1052 {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.String f1347;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final xhss.C0976 f1348;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final long f1349;

    public C0369(java.lang.String r1, long r2, xhss.C0976 r4) {
            r0 = this;
            r0.<init>()
            r0.f1347 = r1
            r0.f1349 = r2
            r0.f1348 = r4
            return
    }

    @Override // xhss.AbstractC1052
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final long mo719() {
            r2 = this;
            long r0 = r2.f1349
            return r0
    }

    @Override // xhss.AbstractC1052
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final xhss.InterfaceC0870 mo720() {
            r0 = this;
            xhss.ᲁᛸᛵᛳ r0 = r0.f1348
            return r0
    }

    @Override // xhss.AbstractC1052
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.C0034 mo721() {
            r2 = this;
            r0 = 0
            java.lang.String r2 = r2.f1347
            if (r2 == 0) goto Lc
            xhss.ᛲᛳᛴᲁ r1 = xhss.C0034.f219
            xhss.ᛱᛴᛲᛴ r2 = xhss.AbstractC0007.m103(r2)     // Catch: java.lang.IllegalArgumentException -> Lc
            return r2
        Lc:
            return r0
    }
}
