package p001;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۟.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0148b implements Parcelable {

    /* JADX INFO: renamed from: ۥ */
    public final Parcelable f694;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final a f693 = new a();
    public static final Parcelable.Creator<AbstractC0148b> CREATOR = new b();

    /* JADX INFO: renamed from: ۟.b$a */
    public static class a extends AbstractC0148b {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0148b() {
        this.f694 = null;
    }

    public AbstractC0148b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f694 = parcelable == null ? f693 : parcelable;
    }

    public AbstractC0148b(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f694 = parcelable == f693 ? null : parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f694, i);
    }

    /* JADX INFO: renamed from: ۟.b$b */
    public static class b implements Parcelable.ClassLoaderCreator<AbstractC0148b> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return AbstractC0148b.f693;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AbstractC0148b[i];
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public final AbstractC0148b createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC0148b.f693;
            }
            throw new IllegalStateException("superState must be null");
        }
    }
}
