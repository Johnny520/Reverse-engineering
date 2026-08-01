package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛱᛵᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0234 implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f895;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ android.content.Context f896;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f897;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f898;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final /* synthetic */ int f899;

    public /* synthetic */ CallableC0234(java.lang.String r1, android.content.Context r2, java.lang.Object r3, int r4, int r5) {
            r0 = this;
            r0.f898 = r5
            r0.f895 = r1
            r0.f896 = r2
            r0.f897 = r3
            r0.f899 = r4
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
            r4 = this;
            int r0 = r4.f898
            int r1 = r4.f899
            java.lang.Object r2 = r4.f897
            android.content.Context r3 = r4.f896
            java.lang.String r4 = r4.f895
            switch(r0) {
                case 0: goto L1b;
                default: goto Ld;
            }
        Ld:
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L14
            xhss.ᛳᛵᛴᲈ r4 = xhss.AbstractC0294.m619(r4, r3, r2, r1)     // Catch: java.lang.Throwable -> L14
            goto L1a
        L14:
            xhss.ᛳᛵᛴᲈ r4 = new xhss.ᛳᛵᛴᲈ
            r0 = -3
            r4.<init>(r0)
        L1a:
            return r4
        L1b:
            xhss.ᛷᛱᛲᲇ r2 = (xhss.C0622) r2
            java.util.List r0 = java.util.List.of(r2)
            xhss.ᛳᛵᛴᲈ r4 = xhss.AbstractC0294.m619(r4, r3, r0, r1)
            return r4
    }
}
