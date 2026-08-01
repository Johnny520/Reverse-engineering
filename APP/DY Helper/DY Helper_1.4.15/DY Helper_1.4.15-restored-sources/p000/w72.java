package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class w72 extends p000.v72 {

    /* JADX INFO: renamed from: δ */
    public final android.util.SparseIntArray f11593;

    /* JADX INFO: renamed from: ε */
    public final android.os.Parcel f11594;

    /* JADX INFO: renamed from: ζ */
    public final int f11595;

    /* JADX INFO: renamed from: η */
    public final int f11596;

    /* JADX INFO: renamed from: θ */
    public final java.lang.String f11597;

    /* JADX INFO: renamed from: ι */
    public int f11598;

    /* JADX INFO: renamed from: κ */
    public int f11599;

    /* JADX INFO: renamed from: λ */
    public int f11600;

    public w72(android.os.Parcel r9) {
            r8 = this;
            int r2 = r9.dataPosition()
            int r3 = r9.dataSize()
            c7 r5 = new c7
            r0 = 0
            r5.<init>(r0)
            c7 r6 = new c7
            r6.<init>(r0)
            c7 r7 = new c7
            r7.<init>(r0)
            java.lang.String r4 = ""
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public w72(android.os.Parcel r1, int r2, int r3, java.lang.String r4, p000.C0103c7 r5, p000.C0103c7 r6, p000.C0103c7 r7) {
            r0 = this;
            r0.<init>(r5, r6, r7)
            android.util.SparseIntArray r5 = new android.util.SparseIntArray
            r5.<init>()
            r0.f11593 = r5
            r5 = -1
            r0.f11598 = r5
            r0.f11600 = r5
            r0.f11594 = r1
            r0.f11595 = r2
            r0.f11596 = r3
            r0.f11599 = r2
            r0.f11597 = r4
            return
    }

    @Override // p000.v72
    /* JADX INFO: renamed from: α */
    public final p000.w72 mo6053() {
            r8 = this;
            w72 r0 = new w72
            android.os.Parcel r1 = r8.f11594
            int r2 = r1.dataPosition()
            int r3 = r8.f11599
            int r4 = r8.f11595
            if (r3 != r4) goto L10
            int r3 = r8.f11596
        L10:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r8.f11597
            java.lang.String r6 = "  "
            java.lang.String r4 = p000.lz1.m3691(r4, r5, r6)
            c7 r6 = r8.f11126
            c7 r7 = r8.f11127
            c7 r5 = r8.f11125
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // p000.v72
    /* JADX INFO: renamed from: ε */
    public final boolean mo6057(int r4) {
            r3 = this;
        L0:
            int r0 = r3.f11599
            int r1 = r3.f11600
            int r2 = r3.f11596
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
            int r0 = r3.f11599
            android.os.Parcel r1 = r3.f11594
            r1.setDataPosition(r0)
            int r0 = r1.readInt()
            int r1 = r1.readInt()
            r3.f11600 = r1
            int r1 = r3.f11599
            int r1 = r1 + r0
            r3.f11599 = r1
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

    @Override // p000.v72
    /* JADX INFO: renamed from: θ */
    public final void mo6060(int r6) {
            r5 = this;
            int r0 = r5.f11598
            android.util.SparseIntArray r1 = r5.f11593
            android.os.Parcel r2 = r5.f11594
            if (r0 < 0) goto L1b
            int r0 = r1.get(r0)
            int r3 = r2.dataPosition()
            int r4 = r3 - r0
            r2.setDataPosition(r0)
            r2.writeInt(r4)
            r2.setDataPosition(r3)
        L1b:
            r5.f11598 = r6
            int r5 = r2.dataPosition()
            r1.put(r6, r5)
            r5 = 0
            r2.writeInt(r5)
            r2.writeInt(r6)
            return
    }
}
