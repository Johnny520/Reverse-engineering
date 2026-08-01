package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ba */
/* JADX INFO: loaded from: classes.dex */
public final class C0061ba extends AbstractC0133d {
    public static final Parcelable.Creator<C0061ba> CREATOR = new C0086c(2);

    /* JADX INFO: renamed from: c */
    public boolean f803c;

    public C0061ba(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f803c = parcel.readInt() == 1;
    }

    @Override // p000.AbstractC0133d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f803c ? 1 : 0);
    }
}
