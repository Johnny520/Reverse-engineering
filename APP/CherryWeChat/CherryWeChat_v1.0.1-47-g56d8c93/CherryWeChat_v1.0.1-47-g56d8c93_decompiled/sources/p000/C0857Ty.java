package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: Ty */
/* JADX INFO: loaded from: classes.dex */
public final class C0857Ty implements Parcelable {
    public static final Parcelable.Creator<C0857Ty> CREATOR = new C0646P0(25);

    /* JADX INFO: renamed from: a */
    public int f2710a;

    /* JADX INFO: renamed from: b */
    public int f2711b;

    /* JADX INFO: renamed from: c */
    public int f2712c;

    /* JADX INFO: renamed from: d */
    public int[] f2713d;

    /* JADX INFO: renamed from: e */
    public int f2714e;

    /* JADX INFO: renamed from: f */
    public int[] f2715f;

    /* JADX INFO: renamed from: g */
    public ArrayList f2716g;

    /* JADX INFO: renamed from: h */
    public boolean f2717h;

    /* JADX INFO: renamed from: i */
    public boolean f2718i;

    /* JADX INFO: renamed from: j */
    public boolean f2719j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2710a);
        parcel.writeInt(this.f2711b);
        parcel.writeInt(this.f2712c);
        if (this.f2712c > 0) {
            parcel.writeIntArray(this.f2713d);
        }
        parcel.writeInt(this.f2714e);
        if (this.f2714e > 0) {
            parcel.writeIntArray(this.f2715f);
        }
        parcel.writeInt(this.f2717h ? 1 : 0);
        parcel.writeInt(this.f2718i ? 1 : 0);
        parcel.writeInt(this.f2719j ? 1 : 0);
        parcel.writeList(this.f2716g);
    }
}
