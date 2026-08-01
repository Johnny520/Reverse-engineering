package defpackage;

/* JADX INFO: renamed from: ᛷᲀᲈᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1359 implements defpackage.InterfaceC0270 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f5945;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String f5946;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0633 f5947;

    public AbstractC1359(defpackage.C0633 r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f5947 = r1
            r0.f5946 = r2
            return
    }

    @Override // defpackage.InterfaceC0270
    public void reset() {
            r0 = this;
            r0.m2534()
            return
    }

    @Override // defpackage.InterfaceC0270
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public void mo894() {
            r0 = this;
            r0.m2534()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m2534() {
            r1 = this;
            boolean r1 = r1.f5945
            if (r1 != 0) goto L5
            return
        L5:
            r1 = 21
            java.lang.String r0 = "statement is closed"
            defpackage.AbstractC1628.m2954(r1, r0)
            r1 = 0
            throw r1
    }
}
