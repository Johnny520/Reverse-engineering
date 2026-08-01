package defpackage;

/* JADX INFO: renamed from: ᲈᛶᛵᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2262 implements defpackage.InterfaceC0493, java.io.Serializable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.InterfaceC1151 f9601;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC0493 f9602;

    public C2262(defpackage.InterfaceC0493 r1, defpackage.InterfaceC1151 r2) {
            r0 = this;
            r0.<init>()
            r0.f9602 = r1
            r0.f9601 = r2
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            if (r6 == r7) goto L5b
            boolean r0 = r7 instanceof defpackage.C2262
            r1 = 0
            if (r0 == 0) goto L5a
            ᲈᛶᛵᛶ r7 = (defpackage.C2262) r7
            r0 = 2
            r2 = r7
            r3 = r0
        Lc:
            ᛳᛵᲈᛵ r2 = r2.f9602
            boolean r4 = r2 instanceof defpackage.C2262
            r5 = 0
            if (r4 == 0) goto L16
            ᲈᛶᛵᛶ r2 = (defpackage.C2262) r2
            goto L17
        L16:
            r2 = r5
        L17:
            if (r2 != 0) goto L57
            r2 = r6
        L1a:
            ᛳᛵᲈᛵ r2 = r2.f9602
            boolean r4 = r2 instanceof defpackage.C2262
            if (r4 == 0) goto L23
            ᲈᛶᛵᛶ r2 = (defpackage.C2262) r2
            goto L24
        L23:
            r2 = r5
        L24:
            if (r2 != 0) goto L54
            if (r3 != r0) goto L5a
        L28:
            ᛶᲁᛳᲈ r0 = r6.f9601
            ᛶᲈᲇᛶ r2 = r0.getKey()
            ᛶᲁᛳᲈ r2 = r7.mo970(r2)
            boolean r0 = defpackage.AbstractC0498.m1280(r2, r0)
            if (r0 != 0) goto L3a
            r6 = r1
            goto L51
        L3a:
            ᛳᛵᲈᛵ r6 = r6.f9602
            boolean r0 = r6 instanceof defpackage.C2262
            if (r0 == 0) goto L43
            ᲈᛶᛵᛶ r6 = (defpackage.C2262) r6
            goto L28
        L43:
            ᛶᲁᛳᲈ r6 = (defpackage.InterfaceC1151) r6
            ᛶᲈᲇᛶ r0 = r6.getKey()
            ᛶᲁᛳᲈ r7 = r7.mo970(r0)
            boolean r6 = defpackage.AbstractC0498.m1280(r7, r6)
        L51:
            if (r6 == 0) goto L5a
            goto L5b
        L54:
            int r0 = r0 + 1
            goto L1a
        L57:
            int r3 = r3 + 1
            goto Lc
        L5a:
            return r1
        L5b:
            r6 = 1
            return r6
    }

    public final int hashCode() {
            r1 = this;
            ᛳᛵᲈᛵ r0 = r1.f9602
            int r0 = r0.hashCode()
            ᛶᲁᛳᲈ r1 = r1.f9601
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            ᲇᲈᛱᛸ r1 = new ᲇᲈᛱᛸ
            r2 = 2
            r1.<init>(r2)
            java.lang.String r2 = ""
            java.lang.Object r3 = r3.mo969(r2, r1)
            java.lang.String r3 = (java.lang.String) r3
            r1 = 93
            java.lang.String r3 = defpackage.AbstractC0225.m823(r0, r3, r1)
            return r3
    }

    @Override // defpackage.InterfaceC0493
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final java.lang.Object mo969(java.lang.Object r2, defpackage.InterfaceC2087 r3) {
            r1 = this;
            ᛳᛵᲈᛵ r0 = r1.f9602
            java.lang.Object r2 = r0.mo969(r2, r3)
            ᛶᲁᛳᲈ r1 = r1.f9601
            java.lang.Object r1 = r3.mo388(r2, r1)
            return r1
    }

    @Override // defpackage.InterfaceC0493
    /* JADX INFO: renamed from: ᛳᲁᲈᲁ */
    public final defpackage.InterfaceC1151 mo970(defpackage.InterfaceC1192 r2) {
            r1 = this;
        L0:
            ᛶᲁᛳᲈ r0 = r1.f9601
            ᛶᲁᛳᲈ r0 = r0.mo970(r2)
            if (r0 == 0) goto L9
            return r0
        L9:
            ᛳᛵᲈᛵ r1 = r1.f9602
            boolean r0 = r1 instanceof defpackage.C2262
            if (r0 == 0) goto L12
            ᲈᛶᛵᛶ r1 = (defpackage.C2262) r1
            goto L0
        L12:
            ᛶᲁᛳᲈ r1 = r1.mo970(r2)
            return r1
    }

    @Override // defpackage.InterfaceC0493
    /* JADX INFO: renamed from: ᛴᛸᲀ */
    public final /* bridge */ defpackage.InterfaceC0493 mo971(defpackage.InterfaceC0493 r1) {
            r0 = this;
            ᛳᛵᲈᛵ r0 = defpackage.AbstractC0397.m1146(r0, r1)
            return r0
    }

    @Override // defpackage.InterfaceC0493
    /* JADX INFO: renamed from: ᲀᲀᛴᛳ */
    public final defpackage.InterfaceC0493 mo972(defpackage.InterfaceC1192 r4) {
            r3 = this;
            ᛶᲁᛳᲈ r0 = r3.f9601
            ᛶᲁᛳᲈ r1 = r0.mo970(r4)
            ᛳᛵᲈᛵ r2 = r3.f9602
            if (r1 == 0) goto Lb
            return r2
        Lb:
            ᛳᛵᲈᛵ r4 = r2.mo972(r4)
            if (r4 != r2) goto L12
            return r3
        L12:
            ᛲᛶᛳᛱ r3 = defpackage.C0303.f1620
            if (r4 != r3) goto L17
            return r0
        L17:
            ᲈᛶᛵᛶ r3 = new ᲈᛶᛵᛶ
            r3.<init>(r4, r0)
            return r3
    }
}
