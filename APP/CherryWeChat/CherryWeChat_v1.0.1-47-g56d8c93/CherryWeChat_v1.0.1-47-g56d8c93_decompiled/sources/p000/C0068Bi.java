package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: Bi */
/* JADX INFO: loaded from: classes.dex */
public final class C0068Bi implements Parcelable {
    public static final Parcelable.Creator<C0068Bi> CREATOR = new C0646P0(7);

    /* JADX INFO: renamed from: a */
    public ArrayList f162a;

    /* JADX INFO: renamed from: b */
    public ArrayList f163b;

    /* JADX INFO: renamed from: c */
    public C1527i5[] f164c;

    /* JADX INFO: renamed from: d */
    public int f165d;

    /* JADX INFO: renamed from: e */
    public String f166e;

    /* JADX INFO: renamed from: f */
    public ArrayList f167f;

    /* JADX INFO: renamed from: g */
    public ArrayList f168g;

    /* JADX INFO: renamed from: h */
    public ArrayList f169h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f162a);
        parcel.writeStringList(this.f163b);
        parcel.writeTypedArray(this.f164c, i);
        parcel.writeInt(this.f165d);
        parcel.writeString(this.f166e);
        parcel.writeStringList(this.f167f);
        parcel.writeTypedList(this.f168g);
        parcel.writeTypedList(this.f169h);
    }
}
