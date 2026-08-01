package defpackage;

/* JADX INFO: renamed from: ᲈᛴᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2232 implements defpackage.InterfaceC0119, java.io.Serializable {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final boolean f9524;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.Class f9525;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.Object f9526;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public transient defpackage.InterfaceC0119 f9527;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.lang.String f9528;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.lang.String f9529;

    public AbstractC2232(java.lang.Object r1, java.lang.Class r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f9526 = r1
            r0.f9525 = r2
            r0.f9528 = r3
            r0.f9529 = r4
            r0.f9524 = r5
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.InterfaceC2139 m3626() {
            r1 = this;
            boolean r0 = r1.f9524
            java.lang.Class r1 = r1.f9525
            if (r0 == 0) goto L11
            ᲀᛶᲈᲀ r0 = defpackage.AbstractC1168.f5286
            r0.getClass()
            ᲈᲁᲀᛴ r0 = new ᲈᲁᲀᛴ
            r0.<init>(r1)
            return r0
        L11:
            ᛲᲀᲈᛳ r1 = defpackage.AbstractC1168.m2249(r1)
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public abstract defpackage.InterfaceC0119 mo1263();
}
