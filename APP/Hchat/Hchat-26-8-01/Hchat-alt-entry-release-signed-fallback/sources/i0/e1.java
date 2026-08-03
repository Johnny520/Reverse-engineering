package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements android.os.Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5873a;

    public /* synthetic */ e1(int r1) {
            r0 = this;
            r0.f5873a = r1
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r4) {
            r3 = this;
            int r0 = r3.f5873a
            switch(r0) {
                case 0: goto L19;
                case 1: goto Lf;
                default: goto L5;
            }
        L5:
            i0.h1 r0 = new i0.h1
            long r1 = r4.readLong()
            r0.<init>(r1)
            return r0
        Lf:
            i0.g1 r0 = new i0.g1
            int r4 = r4.readInt()
            r0.<init>(r4)
            return r0
        L19:
            i0.f1 r0 = new i0.f1
            float r4 = r4.readFloat()
            r0.<init>(r4)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int r2) {
            r1 = this;
            int r0 = r1.f5873a
            switch(r0) {
                case 0: goto Lb;
                case 1: goto L8;
                default: goto L5;
            }
        L5:
            i0.h1[] r2 = new i0.h1[r2]
            return r2
        L8:
            i0.g1[] r2 = new i0.g1[r2]
            return r2
        Lb:
            i0.f1[] r2 = new i0.f1[r2]
            return r2
    }
}
