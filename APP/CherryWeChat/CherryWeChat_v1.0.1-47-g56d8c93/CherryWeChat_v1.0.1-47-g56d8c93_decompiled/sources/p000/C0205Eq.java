package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Eq */
/* JADX INFO: loaded from: classes.dex */
public final class C0205Eq extends AbstractC2393q {
    public static final Parcelable.Creator<C0205Eq> CREATOR = new C2342p(5);

    /* JADX INFO: renamed from: c */
    public boolean f612c;

    public C0205Eq(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C0205Eq.class.getClassLoader();
        }
        this.f612c = parcel.readInt() == 1;
    }

    @Override // p000.AbstractC2393q, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f612c ? 1 : 0);
    }
}
