package yyds;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: yyds.ᛷᛶᛷᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1580 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8017;

    public /* synthetic */ C1580(int i) {
        this.f8017 = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f8017) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC1656.f8457;
                }
                C0188.m800("superState must be null");
                return null;
            case 1:
                return new C2444(parcel, classLoader);
            case 2:
                return new C0095(parcel, classLoader);
            default:
                return new C0968(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f8017) {
            case 0:
                return new AbstractC1656[i];
            case 1:
                return new C2444[i];
            case 2:
                return new C0095[i];
            default:
                return new C0968[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f8017) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC1656.f8457;
                }
                C0188.m800("superState must be null");
                return null;
            case 1:
                return new C2444(parcel, null);
            case 2:
                return new C0095(parcel, null);
            default:
                return new C0968(parcel, null);
        }
    }
}
