package defpackage;

/* JADX INFO: renamed from: ᲇᛶᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC2078 implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f8908;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f8909;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ android.content.Context f8910;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f8911;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f8912;

    public /* synthetic */ CallableC2078(java.lang.String r1, android.content.Context r2, java.lang.Object r3, int r4, int r5) {
            r0 = this;
            r0.f8911 = r5
            r0.f8912 = r1
            r0.f8910 = r2
            r0.f8908 = r3
            r0.f8909 = r4
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
            r4 = this;
            int r0 = r4.f8911
            int r1 = r4.f8909
            java.lang.Object r2 = r4.f8908
            android.content.Context r3 = r4.f8910
            java.lang.String r4 = r4.f8912
            switch(r0) {
                case 0: goto L1b;
                default: goto Ld;
            }
        Ld:
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L14
            ᛴᲀᛷ r4 = defpackage.AbstractC0604.m1399(r4, r3, r2, r1)     // Catch: java.lang.Throwable -> L14
            goto L1a
        L14:
            ᛴᲀᛷ r4 = new ᛴᲀᛷ
            r0 = -3
            r4.<init>(r0)
        L1a:
            return r4
        L1b:
            ᲇᛱᛸᛱ r2 = (defpackage.C1982) r2
            java.util.List r0 = java.util.List.of(r2)
            ᛴᲀᛷ r4 = defpackage.AbstractC0604.m1399(r4, r3, r0, r1)
            return r4
    }
}
