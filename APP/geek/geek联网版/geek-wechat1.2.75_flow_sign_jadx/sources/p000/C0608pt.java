package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: pt */
/* JADX INFO: loaded from: classes.dex */
public final class C0608pt extends AbstractC0133d {
    public static final Parcelable.Creator<C0608pt> CREATOR = new C0086c(4);

    /* JADX INFO: renamed from: c */
    public boolean f3753c;

    public C0608pt(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C0608pt.class.getClassLoader();
        }
        this.f3753c = parcel.readInt() == 1;
    }

    @Override // p000.AbstractC0133d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3753c ? 1 : 0);
    }
}
