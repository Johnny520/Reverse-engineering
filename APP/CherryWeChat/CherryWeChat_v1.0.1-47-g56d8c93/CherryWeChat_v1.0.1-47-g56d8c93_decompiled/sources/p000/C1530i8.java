package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: i8 */
/* JADX INFO: loaded from: classes.dex */
public final class C1530i8 extends AbstractC2393q {
    public static final Parcelable.Creator<C1530i8> CREATOR = new C2342p(2);

    /* JADX INFO: renamed from: c */
    public boolean f5412c;

    public C1530i8(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5412c = parcel.readInt() == 1;
    }

    @Override // p000.AbstractC2393q, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f5412c ? 1 : 0);
    }
}
