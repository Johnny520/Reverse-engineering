package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class b31 implements Parcelable.ClassLoaderCreator {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static c31 m251a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = b31.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new c31();
        }
        qq0 qq0VarMo10e = a21.f28e.mo10e();
        for (int i2 = 0; i2 < i; i2++) {
            qq0VarMo10e.add(parcel.readValue(classLoader));
        }
        return new c31(qq0VarMo10e.m3301c());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return m251a(parcel, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new c31[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m251a(parcel, classLoader);
    }
}
