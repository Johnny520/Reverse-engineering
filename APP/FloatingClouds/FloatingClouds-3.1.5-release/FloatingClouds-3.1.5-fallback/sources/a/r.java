package a;

/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"BanParcelableUsage"})
public abstract class r implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<a.r> CREATOR = null;
    public static final a.r.a b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.os.Parcelable f661a;

    public class a extends a.r {
    }

    public class b implements android.os.Parcelable.ClassLoaderCreator<a.r> {
        @Override // android.os.Parcelable.Creator
        public final java.lang.Object createFromParcel(android.os.Parcel r2) {
                r1 = this;
                r0 = 0
                android.os.Parcelable r2 = r2.readParcelable(r0)
                if (r2 != 0) goto La
                a.r$a r2 = a.r.b
                return r2
            La:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "superState must be null"
                r2.<init>(r0)
                throw r2
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final a.r createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                android.os.Parcelable r1 = r1.readParcelable(r2)
                if (r1 != 0) goto L9
                a.r$a r1 = a.r.b
                return r1
            L9:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "superState must be null"
                r1.<init>(r2)
                throw r1
        }

        @Override // android.os.Parcelable.Creator
        public final java.lang.Object[] newArray(int r1) {
                r0 = this;
                a.r[] r1 = new a.r[r1]
                return r1
        }
    }

    static {
            a.r$a r0 = new a.r$a
            r0.<init>()
            a.r.b = r0
            a.r$b r0 = new a.r$b
            r0.<init>()
            a.r.CREATOR = r0
            return
    }

    public r() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f661a = r0
            return
    }

    public r(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>()
            android.os.Parcelable r1 = r1.readParcelable(r2)
            if (r1 == 0) goto La
            goto Lc
        La:
            a.r$a r1 = a.r.b
        Lc:
            r0.f661a = r1
            return
    }

    public r(android.os.Parcelable r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto Le
            a.r$a r0 = a.r.b
            if (r2 == r0) goto La
            goto Lb
        La:
            r2 = 0
        Lb:
            r1.f661a = r2
            return
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "superState must not be null"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            android.os.Parcelable r0 = r1.f661a
            r2.writeParcelable(r0, r3)
            return
    }
}
