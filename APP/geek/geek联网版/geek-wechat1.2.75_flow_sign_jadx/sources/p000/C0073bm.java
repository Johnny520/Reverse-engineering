package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: bm */
/* JADX INFO: loaded from: classes.dex */
public final class C0073bm implements Parcelable {
    public static final Parcelable.Creator<C0073bm> CREATOR = new C0728t1(6);

    /* JADX INFO: renamed from: a */
    public ArrayList f737a;

    /* JADX INFO: renamed from: b */
    public ArrayList f738b;

    /* JADX INFO: renamed from: c */
    public C0475m7[] f739c;

    /* JADX INFO: renamed from: d */
    public int f740d;

    /* JADX INFO: renamed from: e */
    public String f741e;

    /* JADX INFO: renamed from: f */
    public ArrayList f742f;

    /* JADX INFO: renamed from: g */
    public ArrayList f743g;

    /* JADX INFO: renamed from: h */
    public ArrayList f744h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f737a);
        parcel.writeStringList(this.f738b);
        parcel.writeTypedArray(this.f739c, i);
        parcel.writeInt(this.f740d);
        parcel.writeString(this.f741e);
        parcel.writeStringList(this.f742f);
        parcel.writeTypedList(this.f743g);
        parcel.writeTypedList(this.f744h);
    }
}
