package p037U;

import android.os.Parcel;
import android.os.Parcelable;
import p001A0.C0023I;
import p019K.AbstractC0239b;

/* JADX INFO: renamed from: U.K */
/* JADX INFO: loaded from: classes.dex */
public final class C0351K extends AbstractC0239b {
    public static final Parcelable.Creator<C0351K> CREATOR = new C0023I(2);

    /* JADX INFO: renamed from: c */
    public Parcelable f692c;

    public C0351K(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f692c = parcel.readParcelable(classLoader == null ? AbstractC0343C.class.getClassLoader() : classLoader);
    }

    @Override // p019K.AbstractC0239b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.f692c, 0);
    }
}
