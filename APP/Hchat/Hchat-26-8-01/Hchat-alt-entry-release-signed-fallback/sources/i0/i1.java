package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements android.os.Parcelable.ClassLoaderCreator {
    public static i0.j1 a(android.os.Parcel r2, java.lang.ClassLoader r3) {
            if (r3 != 0) goto L8
            java.lang.Class<i0.i1> r3 = i0.i1.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
        L8:
            java.lang.Object r3 = r2.readValue(r3)
            int r2 = r2.readInt()
            i0.j1 r0 = new i0.j1
            if (r2 == 0) goto L2d
            r1 = 1
            if (r2 == r1) goto L2a
            r1 = 2
            if (r2 != r1) goto L1d
            i0.e r2 = i0.e.f5868k
            goto L2f
        L1d:
            java.lang.String r3 = "Unsupported MutableState policy "
            java.lang.String r0 = " was restored"
            java.lang.String r2 = eh.a.m(r2, r3, r0)
            j8.o.A(r2)
            r2 = 0
            return r2
        L2a:
            i0.e r2 = i0.e.f5870m
            goto L2f
        L2d:
            i0.e r2 = i0.e.f5867j
        L2f:
            r0.<init>(r3, r2)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r2) {
            r1 = this;
            r0 = 0
            i0.j1 r2 = a(r2, r0)
            return r2
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            i0.j1 r1 = a(r1, r2)
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int r1) {
            r0 = this;
            i0.j1[] r1 = new i0.j1[r1]
            return r1
    }
}
