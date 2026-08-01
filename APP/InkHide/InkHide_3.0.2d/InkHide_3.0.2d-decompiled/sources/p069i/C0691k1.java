package p069i;

import android.os.Parcel;
import android.os.Parcelable;
import p010F.AbstractC0112c;
import p010F.C0111b;

/* JADX INFO: renamed from: i.k1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0691k1 extends AbstractC0112c {
    public static final Parcelable.Creator<C0691k1> CREATOR = new C0111b(2);

    /* JADX INFO: renamed from: c */
    public int f2338c;

    /* JADX INFO: renamed from: d */
    public boolean f2339d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0691k1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2338c = parcel.readInt();
        this.f2339d = parcel.readInt() != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p010F.AbstractC0112c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f2338c);
        parcel.writeInt(this.f2339d ? 1 : 0);
    }
}
