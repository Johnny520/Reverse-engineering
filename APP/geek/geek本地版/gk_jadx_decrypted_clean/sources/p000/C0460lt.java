package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lt */
/* JADX INFO: loaded from: classes.dex */
public final class C0460lt extends AbstractC0133d {
    public static final Parcelable.Creator<C0460lt> CREATOR = new C0086c(4);

    /* JADX INFO: renamed from: c */
    public boolean f3103c;

    public C0460lt(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C0460lt.class.getClassLoader();
        }
        this.f3103c = parcel.readInt() == 1;
    }

    @Override // p000.AbstractC0133d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3103c ? 1 : 0);
    }
}
