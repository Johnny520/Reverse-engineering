package defpackage;

/* JADX INFO: renamed from: ᛸᲁᲈᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1576 extends defpackage.AbstractC0034 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final java.lang.String f6982;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public int f6983;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public int f6984;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final android.os.Parcel f6985;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.util.SparseIntArray f6986;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public int f6987;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final int f6988;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final int f6989;

    public C1576(android.os.Parcel r9) {
            r8 = this;
            int r2 = r9.dataPosition()
            int r3 = r9.dataSize()
            ᛸᛶᛱᛲ r5 = new ᛸᛶᛱᛲ
            r0 = 0
            r5.<init>(r0)
            ᛸᛶᛱᛲ r6 = new ᛸᛶᛱᛲ
            r6.<init>(r0)
            ᛸᛶᛱᛲ r7 = new ᛸᛶᛱᛲ
            r7.<init>(r0)
            java.lang.String r4 = ""
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public C1576(android.os.Parcel r1, int r2, int r3, java.lang.String r4, defpackage.C1499 r5, defpackage.C1499 r6, defpackage.C1499 r7) {
            r0 = this;
            r0.<init>(r5, r6, r7)
            android.util.SparseIntArray r5 = new android.util.SparseIntArray
            r5.<init>()
            r0.f6986 = r5
            r5 = -1
            r0.f6984 = r5
            r0.f6983 = r5
            r0.f6985 = r1
            r0.f6988 = r2
            r0.f6989 = r3
            r0.f6987 = r2
            r0.f6982 = r4
            return
    }

    @Override // defpackage.AbstractC0034
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final void mo348(int r6) {
            r5 = this;
            int r0 = r5.f6984
            android.util.SparseIntArray r1 = r5.f6986
            android.os.Parcel r2 = r5.f6985
            if (r0 < 0) goto L1b
            int r0 = r1.get(r0)
            int r3 = r2.dataPosition()
            int r4 = r3 - r0
            r2.setDataPosition(r0)
            r2.writeInt(r4)
            r2.setDataPosition(r3)
        L1b:
            r5.f6984 = r6
            int r5 = r2.dataPosition()
            r1.put(r6, r5)
            r5 = 0
            r2.writeInt(r5)
            r2.writeInt(r6)
            return
    }

    @Override // defpackage.AbstractC0034
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final boolean mo350(int r4) {
            r3 = this;
        L0:
            int r0 = r3.f6987
            int r1 = r3.f6983
            int r2 = r3.f6989
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
            int r0 = r3.f6987
            android.os.Parcel r1 = r3.f6985
            r1.setDataPosition(r0)
            int r0 = r1.readInt()
            int r1 = r1.readInt()
            r3.f6983 = r1
            int r1 = r3.f6987
            int r1 = r1 + r0
            r3.f6987 = r1
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

    @Override // defpackage.AbstractC0034
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final defpackage.C1576 mo353() {
            r8 = this;
            ᛸᲁᲈᛳ r0 = new ᛸᲁᲈᛳ
            android.os.Parcel r1 = r8.f6985
            int r2 = r1.dataPosition()
            int r3 = r8.f6987
            int r4 = r8.f6988
            if (r3 != r4) goto L10
            int r3 = r8.f6989
        L10:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r8.f6982
            r4.append(r5)
            java.lang.String r5 = "  "
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            ᛸᛶᛱᛲ r6 = r8.f533
            ᛸᛶᛱᛲ r7 = r8.f531
            ᛸᛶᛱᛲ r5 = r8.f532
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }
}
