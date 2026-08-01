package defpackage;

/* JADX INFO: renamed from: ᛳᛸᛵᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0526 extends defpackage.C2260 {

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final defpackage.AbstractC0624 f2593;

    public C0526(defpackage.InterfaceC0140 r2, defpackage.AbstractC0624 r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r2)
            r1.f2593 = r3
            return
    }

    @Override // defpackage.C2260
    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public final java.lang.Throwable mo1323(defpackage.AbstractC0624 r2) {
            r1 = this;
            ᛴᛲᛵᛵ r1 = r1.f2593
            java.lang.Object r1 = r1.m1442()
            boolean r0 = r1 instanceof defpackage.C0612
            if (r0 == 0) goto L14
            r0 = r1
            ᛴᛱᛷᛱ r0 = (defpackage.C0612) r0
            java.lang.Throwable r0 = r0.m1408()
            if (r0 == 0) goto L14
            return r0
        L14:
            boolean r0 = r1 instanceof defpackage.C0142
            if (r0 == 0) goto L1d
            ᛱᛸᛳᛱ r1 = (defpackage.C0142) r1
            java.lang.Throwable r1 = r1.f1092
            return r1
        L1d:
            java.util.concurrent.CancellationException r1 = r2.m1448()
            return r1
    }

    @Override // defpackage.C2260
    /* JADX INFO: renamed from: ᛴᲀᲁᛴ, reason: contains not printable characters */
    public final java.lang.String mo1324() {
            r0 = this;
            java.lang.String r0 = "AwaitContinuation"
            return r0
    }
}
