package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k90 extends defpackage.j90 {
    public final android.util.SparseIntArray d;
    public final android.os.Parcel e;
    public final int f;
    public final int g;
    public final java.lang.String h;
    public int i;
    public int j;
    public int k;

    public k90(android.os.Parcel r9) {
            r8 = this;
            int r2 = r9.dataPosition()
            int r3 = r9.dataSize()
            n6 r5 = new n6
            r5.<init>()
            n6 r6 = new n6
            r6.<init>()
            n6 r7 = new n6
            r7.<init>()
            java.lang.String r4 = ""
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public k90(android.os.Parcel r1, int r2, int r3, java.lang.String r4, defpackage.n6 r5, defpackage.n6 r6, defpackage.n6 r7) {
            r0 = this;
            r0.<init>(r5, r6, r7)
            android.util.SparseIntArray r5 = new android.util.SparseIntArray
            r5.<init>()
            r0.d = r5
            r5 = -1
            r0.i = r5
            r0.k = r5
            r0.e = r1
            r0.f = r2
            r0.g = r3
            r0.j = r2
            r0.h = r4
            return
    }

    @Override // defpackage.j90
    public final defpackage.k90 a() {
            r8 = this;
            k90 r0 = new k90
            android.os.Parcel r1 = r8.e
            int r2 = r1.dataPosition()
            int r3 = r8.j
            int r4 = r8.f
            if (r3 != r4) goto L10
            int r3 = r8.g
        L10:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r8.h
            java.lang.String r6 = "  "
            java.lang.String r4 = defpackage.z30.l(r4, r5, r6)
            n6 r6 = r8.b
            n6 r7 = r8.c
            n6 r5 = r8.a
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // defpackage.j90
    public final boolean e(int r3) {
            r2 = this;
        L0:
            int r0 = r2.j
            int r1 = r2.g
            if (r0 >= r1) goto L31
            int r0 = r2.k
            if (r0 != r3) goto Lb
            goto L35
        Lb:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r3)
            int r0 = r0.compareTo(r1)
            if (r0 <= 0) goto L1a
            goto L37
        L1a:
            int r0 = r2.j
            android.os.Parcel r1 = r2.e
            r1.setDataPosition(r0)
            int r0 = r1.readInt()
            int r1 = r1.readInt()
            r2.k = r1
            int r1 = r2.j
            int r1 = r1 + r0
            r2.j = r1
            goto L0
        L31:
            int r0 = r2.k
            if (r0 != r3) goto L37
        L35:
            r3 = 1
            return r3
        L37:
            r3 = 0
            return r3
    }

    @Override // defpackage.j90
    public final void h(int r6) {
            r5 = this;
            int r0 = r5.i
            android.util.SparseIntArray r1 = r5.d
            android.os.Parcel r2 = r5.e
            if (r0 < 0) goto L1b
            int r0 = r1.get(r0)
            int r3 = r2.dataPosition()
            int r4 = r3 - r0
            r2.setDataPosition(r0)
            r2.writeInt(r4)
            r2.setDataPosition(r3)
        L1b:
            r5.i = r6
            int r0 = r2.dataPosition()
            r1.put(r6, r0)
            r0 = 0
            r2.writeInt(r0)
            r2.writeInt(r6)
            return
    }
}
