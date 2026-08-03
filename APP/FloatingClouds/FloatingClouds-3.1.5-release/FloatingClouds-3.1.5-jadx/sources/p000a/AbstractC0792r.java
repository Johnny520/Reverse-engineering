package p000a;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: a.r */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public abstract class AbstractC0792r implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final Parcelable f3119a;

    /* JADX INFO: renamed from: b */
    public static final a f3118b = new a();
    public static final Parcelable.Creator<AbstractC0792r> CREATOR = new b();

    /* JADX INFO: renamed from: a.r$a */
    public class a extends AbstractC0792r {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0792r() {
        this.f3119a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3119a, i);
    }

    /* JADX INFO: renamed from: a.r$b */
    public class b implements Parcelable.ClassLoaderCreator<AbstractC0792r> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return AbstractC0792r.f3118b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AbstractC0792r[i];
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public final AbstractC0792r createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC0792r.f3118b;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public AbstractC0792r(Parcelable parcelable) {
        if (parcelable != null) {
            this.f3119a = parcelable == f3118b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC0792r(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f3119a = parcelable == null ? f3118b : parcelable;
    }
}
