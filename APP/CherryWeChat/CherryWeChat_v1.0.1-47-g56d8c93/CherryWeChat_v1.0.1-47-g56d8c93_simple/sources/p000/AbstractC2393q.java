package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2393q implements Parcelable {
    public static final Parcelable.Creator<AbstractC2393q> CREATOR = null;

    /* JADX INFO: renamed from: b */
    public static final C2299o f8396b = null;

    /* JADX INFO: renamed from: a */
    public final Parcelable f8397a;

    static {
        f8396b = new C2299o();
        CREATOR = new C2342p(0);
    }

    public AbstractC2393q() {
        this.f8397a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r2, int r3) {
        r2.writeParcelable(this.f8397a, r3);
    }

    public AbstractC2393q(Parcelable r2) {
        if (r2 == null) goto L11;
        if (r2 != f8396b) goto L8;
        r2 = null;
    L8:
        this.f8397a = r2;
        return;
    L11:
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC2393q(Parcel r1, ClassLoader r2) {
        Parcelable r12 = r1.readParcelable(r2);
        if (r12 != null) goto L6;
        r12 = f8396b;
    L6:
        this.f8397a = r12;
    }
}
