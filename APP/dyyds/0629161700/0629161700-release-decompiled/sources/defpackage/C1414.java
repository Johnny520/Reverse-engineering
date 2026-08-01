package defpackage;

/* JADX INFO: renamed from: ᛸᛱᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1414 implements defpackage.InterfaceC2267 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.Class f6195;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC2267 f6196;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.content.Context f6197;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC2267 f6198;

    public C1414(android.content.Context r1, defpackage.InterfaceC2267 r2, defpackage.InterfaceC2267 r3, java.lang.Class r4) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.f6197 = r1
            r0.f6198 = r2
            r0.f6196 = r3
            r0.f6195 = r4
            return
    }

    @Override // defpackage.InterfaceC2267
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final boolean mo1265(java.lang.Object r1) {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            boolean r0 = defpackage.AbstractC0209.m762(r1)
            return r0
    }

    @Override // defpackage.InterfaceC2267
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final defpackage.C0402 mo1266(java.lang.Object r11, int r12, int r13, defpackage.C0533 r14) {
            r10 = this;
            r4 = r11
            android.net.Uri r4 = (android.net.Uri) r4
            ᛳᛱᛱᛲ r11 = new ᛳᛱᛱᛲ
            ᛵᛶᲈᛵ r9 = new ᛵᛶᲈᛵ
            r9.<init>(r4)
            ᲈᛵᛶᛸ r0 = new ᲈᛵᛶᛸ
            ᲈᛶᲀᛳ r3 = r10.f6196
            java.lang.Class r8 = r10.f6195
            android.content.Context r1 = r10.f6197
            ᲈᛶᲀᛳ r2 = r10.f6198
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.<init>(r9, r0)
            return r11
    }
}
