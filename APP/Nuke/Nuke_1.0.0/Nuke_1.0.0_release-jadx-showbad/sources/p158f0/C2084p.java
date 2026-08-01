package p158f0;

import android.os.Parcel;
import android.os.Parcelable;
import p114X.C1618g;
import p114X.C1621j;

/* JADX INFO: renamed from: f0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2084p implements Parcelable.ClassLoaderCreator {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C2085q m3848a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = C2084p.class.getClassLoader();
        }
        int i5 = parcel.readInt();
        if (i5 == 0) {
            return new C2085q();
        }
        C1618g c1618gMo2880e = C1621j.f5578e.mo2880e();
        for (int i6 = 0; i6 < i5; i6++) {
            c1618gMo2880e.add(parcel.readValue(classLoader));
        }
        return new C2085q(c1618gMo2880e.m2899c());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m3848a(parcel, classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        return new C2085q[i5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return m3848a(parcel, null);
    }
}
