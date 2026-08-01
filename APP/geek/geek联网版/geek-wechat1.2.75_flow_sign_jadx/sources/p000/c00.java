package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class c00 extends AbstractC0133d {
    public static final Parcelable.Creator<c00> CREATOR = new C0086c(5);

    /* JADX INFO: renamed from: c */
    public Parcelable f793c;

    public c00(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f793c = parcel.readParcelable(classLoader == null ? AbstractC0799uz.class.getClassLoader() : classLoader);
    }

    @Override // p000.AbstractC0133d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f793c, 0);
    }
}
