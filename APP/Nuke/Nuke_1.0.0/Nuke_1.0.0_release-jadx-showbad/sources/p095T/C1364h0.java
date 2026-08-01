package p095T;

import android.os.Parcel;
import android.os.Parcelable;
import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: T.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1364h0 implements Parcelable.ClassLoaderCreator {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1366i0 m2512a(Parcel parcel, ClassLoader classLoader) {
        C1357e c1357e;
        if (classLoader == null) {
            classLoader = C1364h0.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i5 = parcel.readInt();
        if (i5 == 0) {
            c1357e = C1357e.f4795g;
        } else if (i5 == 1) {
            c1357e = C1357e.f4798j;
        } else {
            if (i5 != 2) {
                throw new IllegalStateException(AbstractC0231b.m397h(i5, "Unsupported MutableState policy ", " was restored"));
            }
            c1357e = C1357e.f4796h;
        }
        return new C1366i0(value, c1357e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m2512a(parcel, classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        return new C1366i0[i5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return m2512a(parcel, null);
    }
}
