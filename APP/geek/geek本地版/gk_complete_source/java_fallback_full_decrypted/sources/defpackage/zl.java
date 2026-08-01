package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.zl> CREATOR = null;
    public java.util.ArrayList a;
    public java.util.ArrayList b;
    public defpackage.c7[] c;
    public int d;
    public java.lang.String e;
    public java.util.ArrayList f;
    public java.util.ArrayList g;
    public java.util.ArrayList h;

    static {
            t1 r0 = new t1
            r1 = 6
            r0.<init>(r1)
            defpackage.zl.CREATOR = r0
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.util.ArrayList r0 = r1.a
            r2.writeTypedList(r0)
            java.util.ArrayList r0 = r1.b
            r2.writeStringList(r0)
            c7[] r0 = r1.c
            r2.writeTypedArray(r0, r3)
            int r3 = r1.d
            r2.writeInt(r3)
            java.lang.String r3 = r1.e
            r2.writeString(r3)
            java.util.ArrayList r3 = r1.f
            r2.writeStringList(r3)
            java.util.ArrayList r3 = r1.g
            r2.writeTypedList(r3)
            java.util.ArrayList r3 = r1.h
            r2.writeTypedList(r3)
            return
    }
}
