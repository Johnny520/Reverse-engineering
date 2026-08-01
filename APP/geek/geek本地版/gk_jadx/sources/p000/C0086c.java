package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: c */
/* JADX INFO: loaded from: classes.dex */
public final class C0086c implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f860a;

    public /* synthetic */ C0086c(int i) {
        this.f860a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f860a) {
            case Base64.DEFAULT /* 0 */:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC0133d.f1343b;
                }
                throw new IllegalStateException("superState must be null");
            case Base64.NO_PADDING /* 1 */:
                return new C0735t7(parcel, classLoader);
            case Base64.NO_WRAP /* 2 */:
                return new C0061ba(parcel, classLoader);
            case 3:
                return new C0065be(parcel, classLoader);
            case 4:
                return new C0460lt(parcel, classLoader);
            case 5:
                return new C0837vz(parcel, classLoader);
            case 6:
                return new g20(parcel, classLoader);
            case 7:
                return new t30(parcel, classLoader);
            case 8:
                return new g60(parcel, classLoader);
            default:
                return new i70(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f860a) {
            case Base64.DEFAULT /* 0 */:
                return new AbstractC0133d[i];
            case Base64.NO_PADDING /* 1 */:
                return new C0735t7[i];
            case Base64.NO_WRAP /* 2 */:
                return new C0061ba[i];
            case 3:
                return new C0065be[i];
            case 4:
                return new C0460lt[i];
            case 5:
                return new C0837vz[i];
            case 6:
                return new g20[i];
            case 7:
                return new t30[i];
            case 8:
                return new g60[i];
            default:
                return new i70[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f860a) {
            case Base64.DEFAULT /* 0 */:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC0133d.f1343b;
                }
                throw new IllegalStateException("superState must be null");
            case Base64.NO_PADDING /* 1 */:
                return new C0735t7(parcel, null);
            case Base64.NO_WRAP /* 2 */:
                return new C0061ba(parcel, null);
            case 3:
                return new C0065be(parcel, null);
            case 4:
                return new C0460lt(parcel, null);
            case 5:
                return new C0837vz(parcel, null);
            case 6:
                return new g20(parcel, null);
            case 7:
                return new t30(parcel, null);
            case 8:
                return new g60(parcel, null);
            default:
                return new i70(parcel, null);
        }
    }
}
