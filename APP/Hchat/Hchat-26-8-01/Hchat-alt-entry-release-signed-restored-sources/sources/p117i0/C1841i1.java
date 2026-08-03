package p117i0;

import android.os.Parcel;
import android.os.Parcelable;
import p068eh.AbstractC0921a;
import p136j8.C2104o;

/* JADX INFO: renamed from: i0.i1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1841i1 implements Parcelable.ClassLoaderCreator {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1845j1 m4566a(Parcel parcel, ClassLoader classLoader) {
        C1823e c1823e;
        if (classLoader == null) {
            classLoader = C1841i1.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i9 = parcel.readInt();
        if (i9 == 0) {
            c1823e = C1823e.f6049j;
        } else if (i9 == 1) {
            c1823e = C1823e.f6052m;
        } else {
            if (i9 != 2) {
                C2104o.m5276A(AbstractC0921a.m2250m(i9, "Unsupported MutableState policy ", " was restored"));
                return null;
            }
            c1823e = C1823e.f6050k;
        }
        return new C1845j1(value, c1823e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return m4566a(parcel, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i9) {
        return new C1845j1[i9];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m4566a(parcel, classLoader);
    }
}
