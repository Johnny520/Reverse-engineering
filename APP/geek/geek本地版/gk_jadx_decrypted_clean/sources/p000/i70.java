package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class i70 extends AbstractC0133d {
    public static final Parcelable.Creator<i70> CREATOR = new C0086c(9);

    /* JADX INFO: renamed from: c */
    public int f2361c;

    /* JADX INFO: renamed from: d */
    public boolean f2362d;

    public i70(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2361c = parcel.readInt();
        this.f2362d = parcel.readInt() != 0;
    }

    @Override // p000.AbstractC0133d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2361c);
        parcel.writeInt(this.f2362d ? 1 : 0);
    }
}
