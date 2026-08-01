package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements defpackage.InterfaceC0708 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC1927[] f275;

    public CompositeGeneratedAdaptersObserver(defpackage.InterfaceC1927[] r1) {
            r0 = this;
            r0.<init>()
            r0.f275 = r1
            return
    }

    @Override // defpackage.InterfaceC0708
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo6(defpackage.InterfaceC0770 r2, defpackage.EnumC2255 r3) {
            r1 = this;
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            ᲁᲁᛵᛱ[] r1 = r1.f275
            int r2 = r1.length
            r3 = 0
            r0 = 0
            if (r2 > 0) goto L13
            int r2 = r1.length
            if (r2 > 0) goto L10
            return
        L10:
            r1 = r1[r0]
            throw r3
        L13:
            r1 = r1[r0]
            throw r3
    }
}
