package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class o70 extends AbstractC0133d {
    public static final Parcelable.Creator<o70> CREATOR = new C0086c(9);

    /* JADX INFO: renamed from: c */
    public int f3411c;

    /* JADX INFO: renamed from: d */
    public boolean f3412d;

    public o70(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3411c = parcel.readInt();
        this.f3412d = parcel.readInt() != 0;
    }

    @Override // p000.AbstractC0133d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3411c);
        parcel.writeInt(this.f3412d ? 1 : 0);
    }
}
