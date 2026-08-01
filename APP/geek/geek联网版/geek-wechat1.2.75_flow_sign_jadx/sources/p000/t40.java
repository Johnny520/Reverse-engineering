package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t40 implements Parcelable {
    public static final Parcelable.Creator<t40> CREATOR = new C0728t1(14);

    /* JADX INFO: renamed from: a */
    public int f4401a;

    /* JADX INFO: renamed from: b */
    public int f4402b;

    /* JADX INFO: renamed from: c */
    public int f4403c;

    /* JADX INFO: renamed from: d */
    public int[] f4404d;

    /* JADX INFO: renamed from: e */
    public int f4405e;

    /* JADX INFO: renamed from: f */
    public int[] f4406f;

    /* JADX INFO: renamed from: g */
    public ArrayList f4407g;

    /* JADX INFO: renamed from: h */
    public boolean f4408h;

    /* JADX INFO: renamed from: i */
    public boolean f4409i;

    /* JADX INFO: renamed from: j */
    public boolean f4410j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4401a);
        parcel.writeInt(this.f4402b);
        parcel.writeInt(this.f4403c);
        if (this.f4403c > 0) {
            parcel.writeIntArray(this.f4404d);
        }
        parcel.writeInt(this.f4405e);
        if (this.f4405e > 0) {
            parcel.writeIntArray(this.f4406f);
        }
        parcel.writeInt(this.f4408h ? 1 : 0);
        parcel.writeInt(this.f4409i ? 1 : 0);
        parcel.writeInt(this.f4410j ? 1 : 0);
        parcel.writeList(this.f4407g);
    }
}
