package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"BanParcelableUsage"})
public abstract class AbstractC0025 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<Yue.AbstractC0025> CREATOR = null;
    public static final Yue.AbstractC0025 EMPTY_STATE = null;
    private final android.os.Parcelable mSuperState;

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟۠$ۥ, reason: contains not printable characters */
    public class C0026 extends Yue.AbstractC0025 {
        public C0026() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟۠$ۥ۟, reason: contains not printable characters */
    public class C0027 implements android.os.Parcelable.ClassLoaderCreator<Yue.AbstractC0025> {
        public C0027() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                r0 = this;
                Yue.ۥۣ۟۟۠ r1 = r0.m303(r1)
                return r1
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public /* bridge */ /* synthetic */ Yue.AbstractC0025 createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                Yue.ۥۣ۟۟۠ r1 = r0.m304(r1, r2)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int r1) {
                r0 = this;
                Yue.ۥۣ۟۟۠[] r1 = r0.m305(r1)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public Yue.AbstractC0025 m303(android.os.Parcel r2) {
                r1 = this;
                r0 = 0
                Yue.ۥۣ۟۟۠ r2 = r1.m304(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.AbstractC0025 m304(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                android.os.Parcelable r1 = r1.readParcelable(r2)
                if (r1 != 0) goto L9
                Yue.ۥۣ۟۟۠ r1 = Yue.AbstractC0025.EMPTY_STATE
                return r1
            L9:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "superState must be null"
                r1.<init>(r2)
                throw r1
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Yue.AbstractC0025[] m305(int r1) {
                r0 = this;
                Yue.ۥۣ۟۟۠[] r1 = new Yue.AbstractC0025[r1]
                return r1
        }
    }

    static {
            Yue.ۥۣ۟۟۠$ۥ r0 = new Yue.ۥۣ۟۟۠$ۥ
            r0.<init>()
            Yue.AbstractC0025.EMPTY_STATE = r0
            Yue.ۥۣ۟۟۠$ۥ۟ r0 = new Yue.ۥۣ۟۟۠$ۥ۟
            r0.<init>()
            Yue.AbstractC0025.CREATOR = r0
            return
    }

    public AbstractC0025() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mSuperState = r0
            return
    }

    public /* synthetic */ AbstractC0025(Yue.AbstractC0025.C0026 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public AbstractC0025(@Yue.InterfaceC4410 android.os.Parcel r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AbstractC0025(@Yue.InterfaceC4410 android.os.Parcel r1, @Yue.InterfaceC4544 java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>()
            android.os.Parcelable r1 = r1.readParcelable(r2)
            if (r1 == 0) goto La
            goto Lc
        La:
            Yue.ۥۣ۟۟۠ r1 = Yue.AbstractC0025.EMPTY_STATE
        Lc:
            r0.mSuperState = r1
            return
    }

    public AbstractC0025(@Yue.InterfaceC4410 android.os.Parcelable r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto Le
            Yue.ۥۣ۟۟۠ r0 = Yue.AbstractC0025.EMPTY_STATE
            if (r2 == r0) goto La
            goto Lb
        La:
            r2 = 0
        Lb:
            r1.mSuperState = r2
            return
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "superState must not be null"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Yue.InterfaceC4544
    public final android.os.Parcelable getSuperState() {
            r1 = this;
            android.os.Parcelable r0 = r1.mSuperState
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            android.os.Parcelable r0 = r1.mSuperState
            r2.writeParcelable(r0, r3)
            return
    }
}
