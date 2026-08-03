package p001A0;

import android.os.Parcel;
import android.os.Parcelable;
import p019K.AbstractC0239b;
import p037U.C0351K;
import p057g.C0871L0;
import p068l0.C0980b;
import p070m0.C0992b;
import p078r.C1063f;
import p081s0.C1067a;
import p090y0.C1141c;

/* JADX INFO: renamed from: A0.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0023I implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61a;

    public /* synthetic */ C0023I(int i2) {
        this.f61a = i2;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f61a) {
            case 0:
                return new C0024J(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC0239b.f480b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new C0351K(parcel, classLoader);
            case 3:
                return new C0871L0(parcel, classLoader);
            case 4:
                return new C0980b(parcel, classLoader);
            case 5:
                return new C0992b(parcel, classLoader);
            case 6:
                return new C1063f(parcel, classLoader);
            case 7:
                return new C1067a(parcel, classLoader);
            default:
                return new C1141c(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f61a) {
            case 0:
                return new C0024J[i2];
            case 1:
                return new AbstractC0239b[i2];
            case 2:
                return new C0351K[i2];
            case 3:
                return new C0871L0[i2];
            case 4:
                return new C0980b[i2];
            case 5:
                return new C0992b[i2];
            case 6:
                return new C1063f[i2];
            case 7:
                return new C1067a[i2];
            default:
                return new C1141c[i2];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f61a) {
            case 0:
                return new C0024J(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC0239b.f480b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new C0351K(parcel, null);
            case 3:
                return new C0871L0(parcel, null);
            case 4:
                return new C0980b(parcel, (ClassLoader) null);
            case 5:
                return new C0992b(parcel, null);
            case 6:
                return new C1063f(parcel, null);
            case 7:
                return new C1067a(parcel, null);
            default:
                return new C1141c(parcel, (ClassLoader) null);
        }
    }
}
