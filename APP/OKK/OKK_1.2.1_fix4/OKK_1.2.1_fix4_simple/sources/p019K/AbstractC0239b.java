package p019K;

import android.os.Parcel;
import android.os.Parcelable;
import p001A0.C0023I;

/* JADX INFO: renamed from: K.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0239b implements Parcelable {
    public static final Parcelable.Creator<AbstractC0239b> CREATOR = null;

    /* JADX INFO: renamed from: b */
    public static final C0238a f480b = null;

    /* JADX INFO: renamed from: a */
    public final Parcelable f481a;

    static {
        f480b = new C0238a();
        CREATOR = new C0023I(1);
    }

    public AbstractC0239b() {
        this.f481a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r2, int r3) {
        r2.writeParcelable(this.f481a, r3);
    }

    public AbstractC0239b(Parcelable r2) {
        if (r2 == null) goto L11;
        if (r2 != f480b) goto L8;
        r2 = null;
    L8:
        this.f481a = r2;
        return;
    L11:
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC0239b(Parcel r1, ClassLoader r2) {
        Parcelable r12 = r1.readParcelable(r2);
        if (r12 != null) goto L6;
        r12 = f480b;
    L6:
        this.f481a = r12;
    }
}
