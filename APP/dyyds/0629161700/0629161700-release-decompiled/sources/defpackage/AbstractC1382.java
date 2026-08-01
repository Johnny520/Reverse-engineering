package defpackage;

/* JADX INFO: renamed from: ᛷᲇᛲᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1382 extends defpackage.AbstractC0668 implements defpackage.InterfaceC1679 {
    public AbstractC1382(defpackage.InterfaceC0140 r1) {
            r0 = this;
            r0.<init>(r1)
            if (r1 == 0) goto L15
            ᛳᛵᲈᛵ r0 = r1.mo663()
            ᛲᛶᛳᛱ r1 = defpackage.C0303.f1620
            if (r0 != r1) goto Le
            goto L15
        Le:
            java.lang.String r0 = "Coroutines with restricted suspension must have EmptyCoroutineContext"
            defpackage.C2264.m3684(r0)
            r0 = 0
            throw r0
        L15:
            return
    }

    @Override // defpackage.AbstractC0668
    public final java.lang.String toString() {
            r1 = this;
            ᛱᛸᛲᲀ r0 = r1.f3238
            if (r0 != 0) goto Le
            ᲀᛶᲈᲀ r0 = defpackage.AbstractC1168.f5286
            r0.getClass()
            java.lang.String r1 = defpackage.C1700.m3074(r1)
            return r1
        Le:
            java.lang.String r1 = super.toString()
            return r1
    }

    @Override // defpackage.InterfaceC0140
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.InterfaceC0493 mo663() {
            r0 = this;
            ᛲᛶᛳᛱ r0 = defpackage.C0303.f1620
            return r0
    }

    @Override // defpackage.InterfaceC1679
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final int mo1702() {
            r0 = this;
            r0 = 2
            return r0
    }
}
