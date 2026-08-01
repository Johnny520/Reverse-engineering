package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: vz */
/* JADX INFO: loaded from: classes.dex */
public final class C0837vz extends AbstractC0133d {
    public static final Parcelable.Creator<C0837vz> CREATOR = new C0086c(5);

    /* JADX INFO: renamed from: c */
    public Parcelable f4890c;

    public C0837vz(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4890c = parcel.readParcelable(classLoader == null ? AbstractC0540nz.class.getClassLoader() : classLoader);
    }

    @Override // p000.AbstractC0133d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f4890c, 0);
    }
}
