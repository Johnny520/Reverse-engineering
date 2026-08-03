package p037U;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p017J.C0222k;

/* JADX INFO: renamed from: U.V */
/* JADX INFO: loaded from: classes.dex */
public final class C0361V implements Parcelable {
    public static final Parcelable.Creator<C0361V> CREATOR = new C0222k(3);

    /* JADX INFO: renamed from: a */
    public int f751a;

    /* JADX INFO: renamed from: b */
    public int f752b;

    /* JADX INFO: renamed from: c */
    public int f753c;

    /* JADX INFO: renamed from: d */
    public int[] f754d;

    /* JADX INFO: renamed from: e */
    public int f755e;

    /* JADX INFO: renamed from: f */
    public int[] f756f;

    /* JADX INFO: renamed from: g */
    public List f757g;

    /* JADX INFO: renamed from: h */
    public boolean f758h;

    /* JADX INFO: renamed from: i */
    public boolean f759i;

    /* JADX INFO: renamed from: j */
    public boolean f760j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f751a);
        parcel.writeInt(this.f752b);
        parcel.writeInt(this.f753c);
        if (this.f753c > 0) {
            parcel.writeIntArray(this.f754d);
        }
        parcel.writeInt(this.f755e);
        if (this.f755e > 0) {
            parcel.writeIntArray(this.f756f);
        }
        parcel.writeInt(this.f758h ? 1 : 0);
        parcel.writeInt(this.f759i ? 1 : 0);
        parcel.writeInt(this.f760j ? 1 : 0);
        parcel.writeList(this.f757g);
    }
}
