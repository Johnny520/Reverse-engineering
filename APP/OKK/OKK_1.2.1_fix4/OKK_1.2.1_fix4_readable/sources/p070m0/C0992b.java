package p070m0;

import android.os.Parcel;
import android.os.Parcelable;
import p001A0.C0023I;
import p019K.AbstractC0239b;

/* JADX INFO: renamed from: m0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0992b extends AbstractC0239b {
    public static final Parcelable.Creator<C0992b> CREATOR = new C0023I(5);

    /* JADX INFO: renamed from: c */
    public boolean f3529c;

    public C0992b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C0992b.class.getClassLoader();
        }
        this.f3529c = parcel.readInt() == 1;
    }

    @Override // p019K.AbstractC0239b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f3529c ? 1 : 0);
    }
}
