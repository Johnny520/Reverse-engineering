package a;

/* JADX INFO: renamed from: a.mg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0271mg extends a.AbstractC0253lg {
    public final android.util.SparseIntArray d;
    public final android.os.Parcel e;
    public final int f;
    public final int g;
    public final java.lang.String h;
    public int i;
    public int j;
    public int k;

    public C0271mg(android.os.Parcel r9) {
            r8 = this;
            int r2 = r9.dataPosition()
            int r3 = r9.dataSize()
            a.J1 r5 = new a.J1
            r5.<init>()
            a.J1 r6 = new a.J1
            r6.<init>()
            a.J1 r7 = new a.J1
            r7.<init>()
            java.lang.String r4 = ""
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public C0271mg(android.os.Parcel r1, int r2, int r3, java.lang.String r4, a.J1<java.lang.String, java.lang.reflect.Method> r5, a.J1<java.lang.String, java.lang.reflect.Method> r6, a.J1<java.lang.String, java.lang.Class> r7) {
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

    @Override // a.AbstractC0253lg
    public final a.C0271mg a() {
            r8 = this;
            a.mg r0 = new a.mg
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
            java.lang.String r4 = a.C0487z.h(r4, r5, r6)
            a.J1<java.lang.String, java.lang.reflect.Method> r6 = r8.b
            a.J1<java.lang.String, java.lang.Class> r7 = r8.c
            a.J1<java.lang.String, java.lang.reflect.Method> r5 = r8.f566a
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // a.AbstractC0253lg
    public final boolean e() {
            r1 = this;
            android.os.Parcel r0 = r1.e
            int r0 = r0.readInt()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // a.AbstractC0253lg
    public final byte[] f() {
            r2 = this;
            android.os.Parcel r0 = r2.e
            int r1 = r0.readInt()
            if (r1 >= 0) goto La
            r0 = 0
            return r0
        La:
            byte[] r1 = new byte[r1]
            r0.readByteArray(r1)
            return r1
    }

    @Override // a.AbstractC0253lg
    public final java.lang.CharSequence g() {
            r2 = this;
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            android.os.Parcel r1 = r2.e
            java.lang.Object r0 = r0.createFromParcel(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            return r0
    }

    @Override // a.AbstractC0253lg
    public final boolean h(int r3) {
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

    @Override // a.AbstractC0253lg
    public final int i() {
            r1 = this;
            android.os.Parcel r0 = r1.e
            int r0 = r0.readInt()
            return r0
    }

    @Override // a.AbstractC0253lg
    public final <T extends android.os.Parcelable> T j() {
            r2 = this;
            java.lang.Class<a.mg> r0 = a.C0271mg.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcel r1 = r2.e
            android.os.Parcelable r0 = r1.readParcelable(r0)
            return r0
    }

    @Override // a.AbstractC0253lg
    public final java.lang.String k() {
            r1 = this;
            android.os.Parcel r0 = r1.e
            java.lang.String r0 = r0.readString()
            return r0
    }

    @Override // a.AbstractC0253lg
    public final void m(int r3) {
            r2 = this;
            r2.u()
            r2.i = r3
            android.util.SparseIntArray r0 = r2.d
            android.os.Parcel r1 = r2.e
            int r1 = r1.dataPosition()
            r0.put(r3, r1)
            r0 = 0
            r2.q(r0)
            r2.q(r3)
            return
    }

    @Override // a.AbstractC0253lg
    public final void n(boolean r2) {
            r1 = this;
            android.os.Parcel r0 = r1.e
            r0.writeInt(r2)
            return
    }

    @Override // a.AbstractC0253lg
    public final void o(byte[] r3) {
            r2 = this;
            android.os.Parcel r0 = r2.e
            if (r3 == 0) goto Lc
            int r1 = r3.length
            r0.writeInt(r1)
            r0.writeByteArray(r3)
            return
        Lc:
            r3 = -1
            r0.writeInt(r3)
            return
    }

    @Override // a.AbstractC0253lg
    public final void p(java.lang.CharSequence r3) {
            r2 = this;
            android.os.Parcel r0 = r2.e
            r1 = 0
            android.text.TextUtils.writeToParcel(r3, r0, r1)
            return
    }

    @Override // a.AbstractC0253lg
    public final void q(int r2) {
            r1 = this;
            android.os.Parcel r0 = r1.e
            r0.writeInt(r2)
            return
    }

    @Override // a.AbstractC0253lg
    public final void r(android.os.Parcelable r3) {
            r2 = this;
            android.os.Parcel r0 = r2.e
            r1 = 0
            r0.writeParcelable(r3, r1)
            return
    }

    @Override // a.AbstractC0253lg
    public final void s(java.lang.String r2) {
            r1 = this;
            android.os.Parcel r0 = r1.e
            r0.writeString(r2)
            return
    }

    public final void u() {
            r4 = this;
            int r0 = r4.i
            if (r0 < 0) goto L1b
            android.util.SparseIntArray r1 = r4.d
            int r0 = r1.get(r0)
            android.os.Parcel r1 = r4.e
            int r2 = r1.dataPosition()
            int r3 = r2 - r0
            r1.setDataPosition(r0)
            r1.writeInt(r3)
            r1.setDataPosition(r2)
        L1b:
            return
    }
}
