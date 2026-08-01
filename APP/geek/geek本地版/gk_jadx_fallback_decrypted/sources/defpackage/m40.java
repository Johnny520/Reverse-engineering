package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m40 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.m40> CREATOR = null;
    public int a;
    public int b;
    public int c;
    public int[] d;
    public int e;
    public int[] f;
    public java.util.ArrayList g;
    public boolean h;
    public boolean i;
    public boolean j;

    static {
            t1 r0 = new t1
            r1 = 14
            r0.<init>(r1)
            defpackage.m40.CREATOR = r0
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
            int r2 = r0.c
            r1.writeInt(r2)
            int r2 = r0.c
            if (r2 <= 0) goto L18
            int[] r2 = r0.d
            r1.writeIntArray(r2)
        L18:
            int r2 = r0.e
            r1.writeInt(r2)
            int r2 = r0.e
            if (r2 <= 0) goto L26
            int[] r2 = r0.f
            r1.writeIntArray(r2)
        L26:
            boolean r2 = r0.h
            r1.writeInt(r2)
            boolean r2 = r0.i
            r1.writeInt(r2)
            boolean r2 = r0.j
            r1.writeInt(r2)
            java.util.ArrayList r2 = r0.g
            r1.writeList(r2)
            return
    }
}
