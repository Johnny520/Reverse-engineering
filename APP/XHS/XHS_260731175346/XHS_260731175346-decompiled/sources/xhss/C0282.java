package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛵᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0282 implements xhss.InterfaceC0362, java.io.Serializable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.InterfaceC0362 f1095;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.InterfaceC0281 f1096;

    public C0282(xhss.InterfaceC0362 r1, xhss.InterfaceC0281 r2) {
            r0 = this;
            r0.<init>()
            r0.f1095 = r1
            r0.f1096 = r2
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            if (r6 == r7) goto L5b
            boolean r0 = r7 instanceof xhss.C0282
            r1 = 0
            if (r0 == 0) goto L5a
            xhss.ᛳᛵᲈᲈ r7 = (xhss.C0282) r7
            r0 = 2
            r2 = r7
            r3 = r0
        Lc:
            xhss.ᛴᛵᛳᛵ r2 = r2.f1095
            boolean r4 = r2 instanceof xhss.C0282
            r5 = 0
            if (r4 == 0) goto L16
            xhss.ᛳᛵᲈᲈ r2 = (xhss.C0282) r2
            goto L17
        L16:
            r2 = r5
        L17:
            if (r2 != 0) goto L57
            r2 = r6
        L1a:
            xhss.ᛴᛵᛳᛵ r2 = r2.f1095
            boolean r4 = r2 instanceof xhss.C0282
            if (r4 == 0) goto L23
            xhss.ᛳᛵᲈᲈ r2 = (xhss.C0282) r2
            goto L24
        L23:
            r2 = r5
        L24:
            if (r2 != 0) goto L54
            if (r3 != r0) goto L5a
        L28:
            xhss.ᛳᛵᲈᛲ r0 = r6.f1096
            xhss.ᲇᲁᛵᲈ r2 = r0.getKey()
            xhss.ᛳᛵᲈᛲ r2 = r7.mo442(r2)
            boolean r0 = xhss.AbstractC0007.m97(r2, r0)
            if (r0 != 0) goto L3a
            r6 = r1
            goto L51
        L3a:
            xhss.ᛴᛵᛳᛵ r6 = r6.f1095
            boolean r0 = r6 instanceof xhss.C0282
            if (r0 == 0) goto L43
            xhss.ᛳᛵᲈᲈ r6 = (xhss.C0282) r6
            goto L28
        L43:
            xhss.ᛳᛵᲈᛲ r6 = (xhss.InterfaceC0281) r6
            xhss.ᲇᲁᛵᲈ r0 = r6.getKey()
            xhss.ᛳᛵᲈᛲ r7 = r7.mo442(r0)
            boolean r6 = xhss.AbstractC0007.m97(r7, r6)
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
            xhss.ᛴᛵᛳᛵ r0 = r1.f1095
            int r0 = r0.hashCode()
            xhss.ᛳᛵᲈᛲ r1 = r1.f1096
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            xhss.ᲇᛵᲈᛵ r1 = new xhss.ᲇᛵᲈᛵ
            r2 = 0
            r1.<init>(r2)
            java.lang.String r2 = ""
            java.lang.Object r3 = r3.mo598(r2, r1)
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            r3 = 93
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // xhss.InterfaceC0362
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.Object mo598(java.lang.Object r2, xhss.InterfaceC0517 r3) {
            r1 = this;
            xhss.ᛴᛵᛳᛵ r0 = r1.f1095
            java.lang.Object r2 = r0.mo598(r2, r3)
            xhss.ᛳᛵᲈᛲ r1 = r1.f1096
            java.lang.Object r1 = r3.mo115(r2, r1)
            return r1
    }

    @Override // xhss.InterfaceC0362
    /* JADX INFO: renamed from: ᛸᛲᲀᛵ */
    public final xhss.InterfaceC0362 mo440(xhss.InterfaceC1091 r4) {
            r3 = this;
            xhss.ᛳᛵᲈᛲ r0 = r3.f1096
            xhss.ᛳᛵᲈᛲ r1 = r0.mo442(r4)
            xhss.ᛴᛵᛳᛵ r2 = r3.f1095
            if (r1 == 0) goto Lb
            return r2
        Lb:
            xhss.ᛴᛵᛳᛵ r4 = r2.mo440(r4)
            if (r4 != r2) goto L12
            return r3
        L12:
            xhss.ᲇᛷᲁᛷ r3 = xhss.C1059.f3421
            if (r4 != r3) goto L17
            return r0
        L17:
            xhss.ᛳᛵᲈᲈ r3 = new xhss.ᛳᛵᲈᲈ
            r3.<init>(r4, r0)
            return r3
    }

    @Override // xhss.InterfaceC0362
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final /* bridge */ xhss.InterfaceC0362 mo599(xhss.InterfaceC0362 r1) {
            r0 = this;
            xhss.ᛴᛵᛳᛵ r0 = xhss.AbstractC0060.m188(r0, r1)
            return r0
    }

    @Override // xhss.InterfaceC0362
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final xhss.InterfaceC0281 mo442(xhss.InterfaceC1091 r2) {
            r1 = this;
        L0:
            xhss.ᛳᛵᲈᛲ r0 = r1.f1096
            xhss.ᛳᛵᲈᛲ r0 = r0.mo442(r2)
            if (r0 == 0) goto L9
            return r0
        L9:
            xhss.ᛴᛵᛳᛵ r1 = r1.f1095
            boolean r0 = r1 instanceof xhss.C0282
            if (r0 == 0) goto L12
            xhss.ᛳᛵᲈᲈ r1 = (xhss.C0282) r1
            goto L0
        L12:
            xhss.ᛳᛵᲈᛲ r1 = r1.mo442(r2)
            return r1
    }
}
