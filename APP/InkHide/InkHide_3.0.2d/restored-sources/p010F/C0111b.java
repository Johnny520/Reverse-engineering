package p010F;

import android.os.Parcel;
import android.os.Parcelable;
import p069i.C0658Z0;
import p069i.C0691k1;

/* JADX INFO: renamed from: F.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0111b implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f405a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [F.c.<clinit>():void] */
    public /* synthetic */ C0111b(int i2) {
        this.f405a = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f405a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC0112c.f406b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C0658Z0(parcel, classLoader);
            default:
                return new C0691k1(parcel, classLoader);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f405a) {
            case 0:
                return new AbstractC0112c[i2];
            case 1:
                return new C0658Z0[i2];
            default:
                return new C0691k1[i2];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f405a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC0112c.f406b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C0658Z0(parcel, null);
            default:
                return new C0691k1(parcel, null);
        }
    }
}
