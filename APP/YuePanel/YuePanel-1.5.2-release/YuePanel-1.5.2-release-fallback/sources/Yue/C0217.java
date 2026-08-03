package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"BanParcelableUsage"})
public final class C0217 implements android.os.Parcelable {

    @Yue.InterfaceC4410
    public static final android.os.Parcelable.Creator<Yue.C0217> CREATOR = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int f479;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public final android.content.Intent f480;

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۨ۟$ۥ, reason: contains not printable characters */
    public class C0218 implements android.os.Parcelable.Creator<Yue.C0217> {
        public C0218() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Yue.C0217 createFromParcel(@Yue.InterfaceC4410 android.os.Parcel r1) {
                r0 = this;
                Yue.ۥ۟۟ۨ۟ r1 = r0.m1120(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Yue.C0217[] newArray(int r1) {
                r0 = this;
                Yue.ۥ۟۟ۨ۟[] r1 = r0.m1121(r1)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public Yue.C0217 m1120(@Yue.InterfaceC4410 android.os.Parcel r2) {
                r1 = this;
                Yue.ۥ۟۟ۨ۟ r0 = new Yue.ۥ۟۟ۨ۟
                r0.<init>(r2)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C0217[] m1121(int r1) {
                r0 = this;
                Yue.ۥ۟۟ۨ۟[] r1 = new Yue.C0217[r1]
                return r1
        }
    }

    static {
            Yue.ۥ۟۟ۨ۟$ۥ r0 = new Yue.ۥ۟۟ۨ۟$ۥ
            r0.<init>()
            Yue.C0217.CREATOR = r0
            return
    }

    public C0217(int r1, @Yue.InterfaceC4544 android.content.Intent r2) {
            r0 = this;
            r0.<init>()
            r0.f479 = r1
            r0.f480 = r2
            return
    }

    public C0217(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.readInt()
            r1.f479 = r0
            int r0 = r2.readInt()
            if (r0 != 0) goto L11
            r2 = 0
            goto L19
        L11:
            android.os.Parcelable$Creator r0 = android.content.Intent.CREATOR
            java.lang.Object r2 = r0.createFromParcel(r2)
            android.content.Intent r2 = (android.content.Intent) r2
        L19:
            r1.f480 = r2
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.lang.String m1117(int r1) {
            r0 = -1
            if (r1 == r0) goto Ld
            if (r1 == 0) goto La
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
        La:
            java.lang.String r1 = "RESULT_CANCELED"
            return r1
        Ld:
            java.lang.String r1 = "RESULT_OK"
            return r1
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ActivityResult{resultCode="
            r0.append(r1)
            int r1 = r2.f479
            java.lang.String r1 = m1117(r1)
            r0.append(r1)
            java.lang.String r1 = ", data="
            r0.append(r1)
            android.content.Intent r1 = r2.f480
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Yue.InterfaceC4410 android.os.Parcel r2, int r3) {
            r1 = this;
            int r0 = r1.f479
            r2.writeInt(r0)
            android.content.Intent r0 = r1.f480
            if (r0 != 0) goto Lb
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            r2.writeInt(r0)
            android.content.Intent r0 = r1.f480
            if (r0 == 0) goto L16
            r0.writeToParcel(r2, r3)
        L16:
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public android.content.Intent m1118() {
            r1 = this;
            android.content.Intent r0 = r1.f480
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int m1119() {
            r1 = this;
            int r0 = r1.f479
            return r0
    }
}
