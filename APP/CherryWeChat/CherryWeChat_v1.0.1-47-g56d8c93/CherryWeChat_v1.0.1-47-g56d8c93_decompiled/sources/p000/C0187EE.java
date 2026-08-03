package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: EE */
/* JADX INFO: loaded from: classes.dex */
public final class C0187EE extends AbstractC2393q {
    public static final Parcelable.Creator<C0187EE> CREATOR = new C2342p(10);

    /* JADX INFO: renamed from: c */
    public int f571c;

    /* JADX INFO: renamed from: d */
    public Parcelable f572d;

    public C0187EE(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? C0187EE.class.getClassLoader() : classLoader;
        this.f571c = parcel.readInt();
        this.f572d = parcel.readParcelable(classLoader);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return AbstractC0213Ey.m409g(sb, this.f571c, "}");
    }

    @Override // p000.AbstractC2393q, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f571c);
        parcel.writeParcelable(this.f572d, i);
    }
}
