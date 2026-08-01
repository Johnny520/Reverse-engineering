package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: c */
/* JADX INFO: loaded from: classes.dex */
public final class C0086c implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f792a;

    public /* synthetic */ C0086c(int i) {
        this.f792a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f792a) {
            case Base64.DEFAULT /* 0 */:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC0133d.f1273b;
                }
                throw new IllegalStateException("superState must be null");
            case Base64.NO_PADDING /* 1 */:
                return new C0142d8(parcel, classLoader);
            case Base64.NO_WRAP /* 2 */:
                return new C0367ja(parcel, classLoader);
            case 3:
                return new C0101ce(parcel, classLoader);
            case 4:
                return new C0608pt(parcel, classLoader);
            case 5:
                return new c00(parcel, classLoader);
            case 6:
                return new n20(parcel, classLoader);
            case 7:
                return new a40(parcel, classLoader);
            case 8:
                return new m60(parcel, classLoader);
            default:
                return new o70(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f792a) {
            case Base64.DEFAULT /* 0 */:
                return new AbstractC0133d[i];
            case Base64.NO_PADDING /* 1 */:
                return new C0142d8[i];
            case Base64.NO_WRAP /* 2 */:
                return new C0367ja[i];
            case 3:
                return new C0101ce[i];
            case 4:
                return new C0608pt[i];
            case 5:
                return new c00[i];
            case 6:
                return new n20[i];
            case 7:
                return new a40[i];
            case 8:
                return new m60[i];
            default:
                return new o70[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f792a) {
            case Base64.DEFAULT /* 0 */:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC0133d.f1273b;
                }
                throw new IllegalStateException("superState must be null");
            case Base64.NO_PADDING /* 1 */:
                return new C0142d8(parcel, null);
            case Base64.NO_WRAP /* 2 */:
                return new C0367ja(parcel, null);
            case 3:
                return new C0101ce(parcel, null);
            case 4:
                return new C0608pt(parcel, null);
            case 5:
                return new c00(parcel, null);
            case 6:
                return new n20(parcel, null);
            case 7:
                return new a40(parcel, null);
            case 8:
                return new m60(parcel, null);
            default:
                return new o70(parcel, null);
        }
    }
}
