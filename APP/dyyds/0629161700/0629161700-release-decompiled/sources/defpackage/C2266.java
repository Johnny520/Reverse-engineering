package defpackage;

/* JADX INFO: renamed from: ᲈᛶᛷᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2266 implements defpackage.InterfaceC2267 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C2266 f9605 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f9606;

    static {
            ᲈᛶᛷᛱ r0 = new ᲈᛶᛷᛱ
            r1 = 0
            r0.<init>(r1)
            defpackage.C2266.f9605 = r0
            return
    }

    public /* synthetic */ C2266(int r1) {
            r0 = this;
            r0.f9606 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC2267
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final boolean mo1265(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.f9606
            switch(r0) {
                case 0: goto Lb;
                case 1: goto L7;
                default: goto L5;
            }
        L5:
            r0 = 0
            return r0
        L7:
            java.io.File r1 = (java.io.File) r1
            r0 = 1
            return r0
        Lb:
            r0 = 1
            return r0
    }

    @Override // defpackage.InterfaceC2267
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final defpackage.C0402 mo1266(java.lang.Object r1, int r2, int r3, defpackage.C0533 r4) {
            r0 = this;
            int r0 = r0.f9606
            switch(r0) {
                case 0: goto L1a;
                case 1: goto L7;
                default: goto L5;
            }
        L5:
            r0 = 0
            return r0
        L7:
            java.io.File r1 = (java.io.File) r1
            ᛳᛱᛱᛲ r0 = new ᛳᛱᛱᛲ
            ᛵᛶᲈᛵ r2 = new ᛵᛶᲈᛵ
            r2.<init>(r1)
            ᛷᛸᲇᲀ r3 = new ᛷᛸᲇᲀ
            r4 = 0
            r3.<init>(r4, r1)
            r0.<init>(r2, r3)
            return r0
        L1a:
            ᛳᛱᛱᛲ r0 = new ᛳᛱᛱᛲ
            ᛵᛶᲈᛵ r2 = new ᛵᛶᲈᛵ
            r2.<init>(r1)
            ᛷᛸᲇᲀ r3 = new ᛷᛸᲇᲀ
            r4 = 1
            r3.<init>(r4, r1)
            r0.<init>(r2, r3)
            return r0
    }
}
