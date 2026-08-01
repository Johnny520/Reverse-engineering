package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xq implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.xq> CREATOR = null;
    public int a;
    public int b;
    public boolean c;

    static {
            t1 r0 = new t1
            r1 = 8
            r0.<init>(r1)
            defpackage.xq.CREATOR = r0
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.a
            r1.writeInt(r2)
            int r2 = r0.b
            r1.writeInt(r2)
            boolean r2 = r0.c
            r1.writeInt(r2)
            return
    }
}
