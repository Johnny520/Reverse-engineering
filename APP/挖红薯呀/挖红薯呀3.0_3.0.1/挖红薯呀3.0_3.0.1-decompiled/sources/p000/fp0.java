package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class fp0 implements Parcelable.ClassLoaderCreator {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static gp0 m1174a(Parcel parcel, ClassLoader classLoader) {
        C0496n2 c0496n2;
        if (classLoader == null) {
            classLoader = fp0.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            c0496n2 = C0496n2.f4133M;
        } else if (i == 1) {
            c0496n2 = C0496n2.f4141U;
        } else {
            if (i != 2) {
                throw new IllegalStateException("Unsupported MutableState policy " + i + " was restored");
            }
            c0496n2 = C0496n2.f4138R;
        }
        return new gp0(value, c0496n2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return m1174a(parcel, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new gp0[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m1174a(parcel, classLoader);
    }
}
