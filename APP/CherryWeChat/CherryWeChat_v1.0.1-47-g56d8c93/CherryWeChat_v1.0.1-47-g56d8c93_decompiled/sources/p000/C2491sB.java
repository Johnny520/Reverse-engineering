package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: sB */
/* JADX INFO: loaded from: classes.dex */
public final class C2491sB extends AbstractC2393q {
    public static final Parcelable.Creator<C2491sB> CREATOR = new C2342p(9);

    /* JADX INFO: renamed from: c */
    public int f8753c;

    /* JADX INFO: renamed from: d */
    public boolean f8754d;

    public C2491sB(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f8753c = parcel.readInt();
        this.f8754d = parcel.readInt() != 0;
    }

    @Override // p000.AbstractC2393q, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f8753c);
        parcel.writeInt(this.f8754d ? 1 : 0);
    }
}
