package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class os2 implements Parcelable.ClassLoaderCreator {
    /* JADX INFO: renamed from: a */
    public static ps2 m3632a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = os2.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new ps2();
        }
        lz1 lz1VarMo622e = ur2.f11454i.mo622e();
        for (int i2 = 0; i2 < i; i2++) {
            lz1VarMo622e.add(parcel.readValue(classLoader));
        }
        return new ps2(lz1VarMo622e.m2997c());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return m3632a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ps2[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m3632a(parcel, classLoader);
    }
}
