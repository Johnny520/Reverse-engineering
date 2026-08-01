package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛸᛵᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0076 extends xhss.AbstractC0668 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final android.os.Parcel f410;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public int f411;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final java.lang.String f412;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public int f413;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final int f414;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final android.util.SparseIntArray f415;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final int f416;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public int f417;

    public C0076(android.os.Parcel r9) {
            r8 = this;
            int r2 = r9.dataPosition()
            int r3 = r9.dataSize()
            xhss.ᲇᛱᛱᛶ r5 = new xhss.ᲇᛱᛱᛶ
            r5.<init>()
            xhss.ᲇᛱᛱᛶ r6 = new xhss.ᲇᛱᛱᛶ
            r6.<init>()
            xhss.ᲇᛱᛱᛶ r7 = new xhss.ᲇᛱᛱᛶ
            r7.<init>()
            java.lang.String r4 = ""
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public C0076(android.os.Parcel r1, int r2, int r3, java.lang.String r4, xhss.C1001 r5, xhss.C1001 r6, xhss.C1001 r7) {
            r0 = this;
            r0.<init>(r5, r6, r7)
            android.util.SparseIntArray r5 = new android.util.SparseIntArray
            r5.<init>()
            r0.f415 = r5
            r5 = -1
            r0.f411 = r5
            r0.f417 = r5
            r0.f410 = r1
            r0.f416 = r2
            r0.f414 = r3
            r0.f413 = r2
            r0.f412 = r4
            return
    }

    @Override // xhss.AbstractC0668
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final boolean mo232(int r4) {
            r3 = this;
        L0:
            int r0 = r3.f413
            int r1 = r3.f417
            int r2 = r3.f414
            if (r0 >= r2) goto L31
            if (r1 != r4) goto Lb
            goto L33
        Lb:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r4)
            int r0 = r0.compareTo(r1)
            if (r0 <= 0) goto L1a
            goto L35
        L1a:
            int r0 = r3.f413
            android.os.Parcel r1 = r3.f410
            r1.setDataPosition(r0)
            int r0 = r1.readInt()
            int r1 = r1.readInt()
            r3.f417 = r1
            int r1 = r3.f413
            int r1 = r1 + r0
            r3.f413 = r1
            goto L0
        L31:
            if (r1 != r4) goto L35
        L33:
            r3 = 1
            return r3
        L35:
            r3 = 0
            return r3
    }

    @Override // xhss.AbstractC0668
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0076 mo233() {
            r8 = this;
            xhss.ᛱᛸᛵᛳ r0 = new xhss.ᛱᛸᛵᛳ
            android.os.Parcel r1 = r8.f410
            int r2 = r1.dataPosition()
            int r3 = r8.f413
            int r4 = r8.f416
            if (r3 != r4) goto L10
            int r3 = r8.f414
        L10:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r8.f412
            r4.append(r5)
            java.lang.String r5 = "  "
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            xhss.ᲇᛱᛱᛶ r6 = r8.f2279
            xhss.ᲇᛱᛱᛶ r7 = r8.f2280
            xhss.ᲇᛱᛱᛶ r5 = r8.f2281
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // xhss.AbstractC0668
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final void mo234(int r6) {
            r5 = this;
            int r0 = r5.f411
            android.util.SparseIntArray r1 = r5.f415
            android.os.Parcel r2 = r5.f410
            if (r0 < 0) goto L1b
            int r0 = r1.get(r0)
            int r3 = r2.dataPosition()
            int r4 = r3 - r0
            r2.setDataPosition(r0)
            r2.writeInt(r4)
            r2.setDataPosition(r3)
        L1b:
            r5.f411 = r6
            int r5 = r2.dataPosition()
            r1.put(r6, r5)
            r5 = 0
            r2.writeInt(r5)
            r2.writeInt(r6)
            return
    }
}
