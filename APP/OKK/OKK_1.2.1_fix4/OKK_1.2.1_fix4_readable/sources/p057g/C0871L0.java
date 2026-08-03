package p057g;

import android.os.Parcel;
import android.os.Parcelable;
import p001A0.C0023I;
import p019K.AbstractC0239b;

/* JADX INFO: renamed from: g.L0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0871L0 extends AbstractC0239b {
    public static final Parcelable.Creator<C0871L0> CREATOR = new C0023I(3);

    /* JADX INFO: renamed from: c */
    public int f3120c;

    /* JADX INFO: renamed from: d */
    public boolean f3121d;

    public C0871L0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3120c = parcel.readInt();
        this.f3121d = parcel.readInt() != 0;
    }

    @Override // p019K.AbstractC0239b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f3120c);
        parcel.writeInt(this.f3121d ? 1 : 0);
    }
}
