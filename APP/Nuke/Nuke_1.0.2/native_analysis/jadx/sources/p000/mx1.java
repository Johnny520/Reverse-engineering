package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mx1 implements Parcelable.ClassLoaderCreator {
    /* JADX INFO: renamed from: a */
    public static nx1 m3217a(Parcel parcel, ClassLoader classLoader) {
        ks2 ks2Var;
        if (classLoader == null) {
            classLoader = mx1.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            ks2Var = gd3.f3416C;
        } else if (i == 1) {
            ks2Var = C0700sn.f10216T;
        } else {
            if (i != 2) {
                C0676s.m4653l(hk1.m2208g(i, "Unsupported MutableState policy ", " was restored"));
                return null;
            }
            ks2Var = C0700sn.f10212P;
        }
        return new nx1(value, ks2Var);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return m3217a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new nx1[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m3217a(parcel, classLoader);
    }
}
