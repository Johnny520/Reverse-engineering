package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p006D.C0085n;

/* JADX INFO: renamed from: androidx.fragment.app.A */
/* JADX INFO: loaded from: classes.dex */
public final class C0410A implements Parcelable {
    public static final Parcelable.Creator<C0410A> CREATOR = new C0085n(5);

    /* JADX INFO: renamed from: a */
    public ArrayList f1222a;

    /* JADX INFO: renamed from: b */
    public ArrayList f1223b;

    /* JADX INFO: renamed from: c */
    public C0424b[] f1224c;

    /* JADX INFO: renamed from: d */
    public int f1225d;

    /* JADX INFO: renamed from: e */
    public String f1226e;

    /* JADX INFO: renamed from: f */
    public ArrayList f1227f;

    /* JADX INFO: renamed from: g */
    public ArrayList f1228g;

    /* JADX INFO: renamed from: h */
    public ArrayList f1229h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.f1222a);
        parcel.writeStringList(this.f1223b);
        parcel.writeTypedArray(this.f1224c, i2);
        parcel.writeInt(this.f1225d);
        parcel.writeString(this.f1226e);
        parcel.writeStringList(this.f1227f);
        parcel.writeTypedList(this.f1228g);
        parcel.writeTypedList(this.f1229h);
    }
}
