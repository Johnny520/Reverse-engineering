package defpackage;

/* JADX INFO: renamed from: ᛲᛷᛱᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0316 extends defpackage.AbstractC0761 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC0464 f1648;

    public C0316(defpackage.InterfaceC0464 r1, defpackage.C2191 r2) {
            r0 = this;
            r0.<init>(r2)
            r0.f1648 = r1
            return
    }

    @Override // defpackage.AbstractC0761
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.Object mo990(java.lang.Object r1) {
            r0 = this;
            return r1
    }

    @Override // defpackage.AbstractC0761
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.Object mo991() {
            r0 = this;
            ᛳᛴᲁᛸ r0 = r0.f1648
            java.lang.Object r0 = r0.mo741()
            return r0
    }

    @Override // defpackage.AbstractC0761
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void mo992(java.lang.Object r2, defpackage.C1103 r3, defpackage.C2185 r4) {
            r1 = this;
            java.lang.reflect.Field r1 = r4.f9276
            ᛴᲀᲈᛴ r0 = r4.f9277
            java.lang.Object r3 = r0.mo562(r3)
            if (r3 != 0) goto L10
            boolean r0 = r4.f9278
            if (r0 != 0) goto Lf
            goto L10
        Lf:
            return
        L10:
            boolean r4 = r4.f9271
            if (r4 != 0) goto L18
            r1.set(r2, r3)
            return
        L18:
            r2 = 0
            java.lang.String r1 = defpackage.AbstractC2026.m3413(r1, r2)
            ᛲᛱᛶᲀ r2 = new ᛲᛱᛶᲀ
            java.lang.String r3 = "Cannot set value of 'static final' "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
    }
}
