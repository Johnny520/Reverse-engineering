package p000;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.AbstractC1160i;

/* JADX INFO: renamed from: yv */
/* JADX INFO: loaded from: classes.dex */
public final class C2775yv extends AbstractC2393q {
    public static final Parcelable.Creator<C2775yv> CREATOR = new C2342p(6);

    /* JADX INFO: renamed from: c */
    public Parcelable f9425c;

    public C2775yv(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f9425c = parcel.readParcelable(classLoader == null ? AbstractC1160i.class.getClassLoader() : classLoader);
    }

    @Override // p000.AbstractC2393q, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f9425c, 0);
    }
}
