package defpackage;

/* JADX INFO: renamed from: ᛶᛱᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1012 implements defpackage.InterfaceC1781 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f4487;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C2361 f4488;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f4489;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ int f4490;

    public /* synthetic */ C1012(defpackage.C2361 r1, int r2, int r3, int r4) {
            r0 = this;
            r0.f4489 = r4
            r0.f4488 = r1
            r0.f4487 = r2
            r0.f4490 = r3
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC1781
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.Object mo1032() {
            r6 = this;
            int r0 = r6.f4489
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            r2 = 2
            int r3 = r6.f4490
            int r4 = r6.f4487
            ᲈᲈ r6 = r6.f4488
            switch(r0) {
                case 0: goto L1a;
                default: goto Le;
            }
        Le:
            ᛴᲈᛲᲀ r0 = r6.f10229     // Catch: java.io.IOException -> L15
            r5 = 1
            r0.m1719(r4, r3, r5)     // Catch: java.io.IOException -> L15
            goto L19
        L15:
            r0 = move-exception
            r6.m3861(r2, r2, r0)
        L19:
            return r1
        L1a:
            ᛴᲈᛲᲀ r0 = r6.f10229     // Catch: java.io.IOException -> L20
            r0.m1718(r4, r3)     // Catch: java.io.IOException -> L20
            goto L24
        L20:
            r0 = move-exception
            r6.m3861(r2, r2, r0)
        L24:
            return r1
    }
}
