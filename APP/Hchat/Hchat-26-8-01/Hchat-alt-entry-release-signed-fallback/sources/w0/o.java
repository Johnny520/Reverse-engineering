package w0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements android.os.Parcelable.ClassLoaderCreator {
    public static w0.p a(android.os.Parcel r4, java.lang.ClassLoader r5) {
            if (r5 != 0) goto L8
            java.lang.Class<w0.o> r5 = w0.o.class
            java.lang.ClassLoader r5 = r5.getClassLoader()
        L8:
            int r0 = r4.readInt()
            if (r0 != 0) goto L14
            w0.p r4 = new w0.p
            r4.<init>()
            return r4
        L14:
            o0.i r1 = o0.i.f9494h
            o0.f r1 = r1.e()
            r2 = 0
        L1b:
            if (r2 >= r0) goto L27
            java.lang.Object r3 = r4.readValue(r5)
            r1.add(r3)
            int r2 = r2 + 1
            goto L1b
        L27:
            w0.p r4 = new w0.p
            o0.c r5 = r1.d()
            r4.<init>(r5)
            return r4
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r2) {
            r1 = this;
            r0 = 0
            w0.p r2 = a(r2, r0)
            return r2
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            w0.p r1 = a(r1, r2)
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int r1) {
            r0 = this;
            w0.p[] r1 = new w0.p[r1]
            return r1
    }
}
