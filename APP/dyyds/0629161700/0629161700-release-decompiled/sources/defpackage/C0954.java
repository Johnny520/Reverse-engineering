package defpackage;

/* JADX INFO: renamed from: ᛵᲀᛱᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0954 implements defpackage.InterfaceC1152 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f4259;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f4260;

    public /* synthetic */ C0954(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f4259 = r1
            r0.f4260 = r2
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC1152
    public final java.util.Iterator iterator() {
            r2 = this;
            int r0 = r2.f4259
            java.lang.Object r1 = r2.f4260
            switch(r0) {
                case 0: goto L18;
                case 1: goto L12;
                case 2: goto Lf;
                default: goto L7;
            }
        L7:
            ᛵᛵᛷᛸ r2 = new ᛵᛵᛷᛸ
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2.<init>(r1)
            return r2
        Lf:
            java.util.Iterator r1 = (java.util.Iterator) r1
            return r1
        L12:
            ᲁᲈᛱᛲ r0 = new ᲁᲈᛱᛲ
            r0.<init>(r2)
            return r0
        L18:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r2 = r1.iterator()
            return r2
    }
}
