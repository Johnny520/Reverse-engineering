package p322w0;

import android.os.Parcel;
import android.os.Parcelable;
import p202o0.C3034f;
import p202o0.C3037i;

/* JADX INFO: renamed from: w0.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4664o implements Parcelable.ClassLoaderCreator {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C4665p m9143a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = C4664o.class.getClassLoader();
        }
        int i9 = parcel.readInt();
        if (i9 == 0) {
            return new C4665p();
        }
        C3034f c3034fMo6437e = C3037i.f9857h.mo6437e();
        for (int i10 = 0; i10 < i9; i10++) {
            c3034fMo6437e.add(parcel.readValue(classLoader));
        }
        return new C4665p(c3034fMo6437e.m6459d());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return m9143a(parcel, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i9) {
        return new C4665p[i9];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m9143a(parcel, classLoader);
    }
}
