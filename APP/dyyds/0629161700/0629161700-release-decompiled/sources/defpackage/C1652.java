package defpackage;

/* JADX INFO: renamed from: ᲀᛳᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1652 extends defpackage.AbstractC0615 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final java.lang.reflect.Field f7347;

    public C1652(java.lang.reflect.Field r1) {
            r0 = this;
            r0.<init>()
            r0.f7347 = r1
            return
    }

    @Override // defpackage.AbstractC1849
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.reflect.Member mo711() {
            r0 = this;
            java.lang.reflect.Field r0 = r0.f7347
            return r0
    }

    @Override // defpackage.AbstractC0615
    /* JADX INFO: renamed from: ᲀᲀᛴᛳ */
    public final defpackage.AbstractC0615 mo712(java.lang.Object r1) {
            r0 = this;
            r0.m1413(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
    public final java.lang.Object m3036() {
            r1 = this;
            r1.m3258()     // Catch: java.lang.Throwable -> Lc
            java.lang.reflect.Field r0 = r1.f7347     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r1 = r1.f3015     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> Lc
            goto L13
        Lc:
            r1 = move-exception
            ᛴᛸᛲᲀ r0 = new ᛴᛸᛲᲀ
            r0.<init>(r1)
            r1 = r0
        L13:
            boolean r0 = r1 instanceof defpackage.C0723
            if (r0 == 0) goto L18
            r1 = 0
        L18:
            return r1
    }

    /* JADX INFO: renamed from: ᲈᛵᲀᛱ, reason: contains not printable characters */
    public final java.lang.Object m3037() {
            r2 = this;
            r0 = 0
            r2.m3258()     // Catch: java.lang.Throwable -> L10
            java.lang.reflect.Field r1 = r2.f7347     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r2.f3015     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto L17
            r2 = r0
            goto L17
        L10:
            r2 = move-exception
            ᛴᛸᛲᲀ r1 = new ᛴᛸᛲᲀ
            r1.<init>(r2)
            r2 = r1
        L17:
            boolean r1 = r2 instanceof defpackage.C0723
            if (r1 == 0) goto L1c
            goto L1d
        L1c:
            r0 = r2
        L1d:
            return r0
    }
}
