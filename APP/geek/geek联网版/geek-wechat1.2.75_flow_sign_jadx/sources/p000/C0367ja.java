package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ja */
/* JADX INFO: loaded from: classes.dex */
public final class C0367ja extends AbstractC0133d {
    public static final Parcelable.Creator<C0367ja> CREATOR = new C0086c(2);

    /* JADX INFO: renamed from: c */
    public boolean f2690c;

    public C0367ja(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2690c = parcel.readInt() == 1;
    }

    @Override // p000.AbstractC0133d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2690c ? 1 : 0);
    }
}
