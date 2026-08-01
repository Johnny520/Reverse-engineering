package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements defpackage.InterfaceC0708 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.InterfaceC0708 f276;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC1453 f277;

    public DefaultLifecycleObserverAdapter(defpackage.InterfaceC1453 r1, defpackage.InterfaceC0708 r2) {
            r0 = this;
            r0.<init>()
            r0.f277 = r1
            r0.f276 = r2
            return
    }

    @Override // defpackage.InterfaceC0708
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo6(defpackage.InterfaceC0770 r3, defpackage.EnumC2255 r4) {
            r2 = this;
            int[] r0 = defpackage.AbstractC0180.f1222
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 3
            if (r0 == r1) goto L15
            r1 = 7
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            java.lang.String r2 = "ON_ANY must not been send by anybody"
            defpackage.C2264.m3684(r2)
            return
        L15:
            ᛸᛳᛳᛸ r0 = r2.f277
            r0.mo104()
        L1a:
            ᛴᛷᛶᛱ r2 = r2.f276
            if (r2 == 0) goto L21
            r2.mo6(r3, r4)
        L21:
            return
    }
}
