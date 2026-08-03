package p081s0;

import android.os.Parcel;
import android.os.Parcelable;
import p001A0.C0023I;
import p019K.AbstractC0239b;

/* JADX INFO: renamed from: s0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1067a extends AbstractC0239b {
    public static final Parcelable.Creator<C1067a> CREATOR = new C0023I(7);

    /* JADX INFO: renamed from: c */
    public boolean f4093c;

    public C1067a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4093c = parcel.readInt() == 1;
    }

    @Override // p019K.AbstractC0239b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f4093c ? 1 : 0);
    }
}
