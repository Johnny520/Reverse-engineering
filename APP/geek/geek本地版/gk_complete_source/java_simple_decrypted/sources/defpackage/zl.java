package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zl implements Parcelable {
    public static final Parcelable.Creator<zl> CREATOR = null;
    public ArrayList a;
    public ArrayList b;
    public c7[] c;
    public int d;
    public String e;
    public ArrayList f;
    public ArrayList g;
    public ArrayList h;

    static {
        CREATOR = new t1(6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.writeTypedList(this.a);
        r2.writeStringList(this.b);
        r2.writeTypedArray(this.c, r3);
        r2.writeInt(this.d);
        r2.writeString(this.e);
        r2.writeStringList(this.f);
        r2.writeTypedList(this.g);
        r2.writeTypedList(this.h);
    }
}
