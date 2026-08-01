package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class be extends defpackage.d {
    public static final android.os.Parcelable.Creator<defpackage.be> CREATOR = null;
    public android.util.SparseArray c;

    static {
            c r0 = new c
            r1 = 3
            r0.<init>(r1)
            defpackage.be.CREATOR = r0
            return
    }

    public be(android.os.Parcel r6, java.lang.ClassLoader r7) {
            r5 = this;
            r5.<init>(r6, r7)
            int r0 = r6.readInt()
            int[] r1 = new int[r0]
            r6.readIntArray(r1)
            android.os.Parcelable[] r6 = r6.readParcelableArray(r7)
            android.util.SparseArray r7 = new android.util.SparseArray
            r7.<init>(r0)
            r5.c = r7
            r7 = 0
        L18:
            if (r7 >= r0) goto L26
            android.util.SparseArray r2 = r5.c
            r3 = r1[r7]
            r4 = r6[r7]
            r2.append(r3, r4)
            int r7 = r7 + 1
            goto L18
        L26:
            return
    }

    @Override // defpackage.d, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            super.writeToParcel(r6, r7)
            android.util.SparseArray r0 = r5.c
            r1 = 0
            if (r0 == 0) goto Ld
            int r0 = r0.size()
            goto Le
        Ld:
            r0 = r1
        Le:
            r6.writeInt(r0)
            int[] r2 = new int[r0]
            android.os.Parcelable[] r3 = new android.os.Parcelable[r0]
        L15:
            if (r1 >= r0) goto L2c
            android.util.SparseArray r4 = r5.c
            int r4 = r4.keyAt(r1)
            r2[r1] = r4
            android.util.SparseArray r4 = r5.c
            java.lang.Object r4 = r4.valueAt(r1)
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            r3[r1] = r4
            int r1 = r1 + 1
            goto L15
        L2c:
            r6.writeIntArray(r2)
            r6.writeParcelableArray(r3, r7)
            return
    }
}
