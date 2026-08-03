package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p000.b> CREATOR = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final ۟.b.a f129 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.os.Parcelable f130;

    public static class a extends p000.b {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: ۟.b$b, reason: collision with other inner class name */
    public static class C0008b implements android.os.Parcelable.ClassLoaderCreator<p000.b> {
        public C0008b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public final java.lang.Object createFromParcel(android.os.Parcel r2) {
                r1 = this;
                r0 = 0
                android.os.Parcelable r2 = r2.readParcelable(r0)
                if (r2 != 0) goto La
                ۟.b$a r2 = p000.b.f129
                return r2
            La:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "superState must be null"
                r2.<init>(r0)
                throw r2
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public final p000.b createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                android.os.Parcelable r1 = r1.readParcelable(r2)
                if (r1 != 0) goto L9
                ۟.b$a r1 = p000.b.f129
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
                ۟.b[] r1 = new p000.b[r1]
                return r1
        }
    }

    static {
            ۟.b$a r0 = new ۟.b$a
            r0.<init>()
            p000.b.f129 = r0
            ۟.b$b r0 = new ۟.b$b
            r0.<init>()
            p000.b.CREATOR = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f130 = r0
            return
    }

    public b(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>()
            android.os.Parcelable r1 = r1.readParcelable(r2)
            if (r1 == 0) goto La
            goto Lc
        La:
            ۟.b$a r1 = p000.b.f129
        Lc:
            r0.f130 = r1
            return
    }

    public b(android.os.Parcelable r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto Le
            ۟.b$a r0 = p000.b.f129
            if (r2 == r0) goto La
            goto Lb
        La:
            r2 = 0
        Lb:
            r1.f130 = r2
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
            android.os.Parcelable r0 = r1.f130
            r2.writeParcelable(r0, r3)
            return
    }
}
