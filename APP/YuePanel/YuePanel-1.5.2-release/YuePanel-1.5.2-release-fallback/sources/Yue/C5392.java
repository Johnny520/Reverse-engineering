package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
@android.annotation.SuppressLint({"BanParcelableUsage"})
public class C5392 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<Yue.C5392> CREATOR = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean f20032;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final android.os.Handler f20033;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Yue.InterfaceC3194 f20034;

    /* JADX INFO: renamed from: Yue.ۥۡۦۧۦ$ۥ, reason: contains not printable characters */
    public class C5393 implements android.os.Parcelable.Creator<Yue.C5392> {
        public C5393() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Yue.C5392 createFromParcel(android.os.Parcel r1) {
                r0 = this;
                Yue.ۥۡۦۧۦ r1 = r0.m20406(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Yue.C5392[] newArray(int r1) {
                r0 = this;
                Yue.ۥۡۦۧۦ[] r1 = r0.m20407(r1)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public Yue.C5392 m20406(android.os.Parcel r2) {
                r1 = this;
                Yue.ۥۡۦۧۦ r0 = new Yue.ۥۡۦۧۦ
                r0.<init>(r2)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C5392[] m20407(int r1) {
                r0 = this;
                Yue.ۥۡۦۧۦ[] r1 = new Yue.C5392[r1]
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۧۦ$ۥ۟, reason: contains not printable characters */
    public class BinderC5394 extends Yue.InterfaceC3194.AbstractBinderC3196 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5392 f20035;

        public BinderC5394(Yue.C5392 r1) {
                r0 = this;
                r0.f20035 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC3194
        /* JADX INFO: renamed from: ۥ */
        public void mo13604(int r4, android.os.Bundle r5) {
                r3 = this;
                Yue.ۥۡۦۧۦ r0 = r3.f20035
                android.os.Handler r1 = r0.f20033
                if (r1 == 0) goto Lf
                Yue.ۥۡۦۧۦ$ۥ۟۟ r2 = new Yue.ۥۡۦۧۦ$ۥ۟۟
                r2.<init>(r0, r4, r5)
                r1.post(r2)
                goto L12
            Lf:
                r0.m20404(r4, r5)
            L12:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۧۦ$ۥ۟۟, reason: contains not printable characters */
    public class RunnableC5395 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final int f20036;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final android.os.Bundle f20037;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5392 f20038;

        public RunnableC5395(Yue.C5392 r1, int r2, android.os.Bundle r3) {
                r0 = this;
                r0.f20038 = r1
                r0.<init>()
                r0.f20036 = r2
                r0.f20037 = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                Yue.ۥۡۦۧۦ r0 = r3.f20038
                int r1 = r3.f20036
                android.os.Bundle r2 = r3.f20037
                r0.m20404(r1, r2)
                return
        }
    }

    static {
            Yue.ۥۡۦۧۦ$ۥ r0 = new Yue.ۥۡۦۧۦ$ۥ
            r0.<init>()
            Yue.C5392.CREATOR = r0
            return
    }

    public C5392(android.os.Handler r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f20032 = r0
            r1.f20033 = r2
            return
    }

    public C5392(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f20032 = r0
            r0 = 0
            r1.f20033 = r0
            android.os.IBinder r2 = r2.readStrongBinder()
            Yue.ۥ۠ۥ۟ۤ r2 = Yue.InterfaceC3194.AbstractBinderC3196.m13605(r2)
            r1.f20034 = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Yue.InterfaceC4410 android.os.Parcel r1, int r2) {
            r0 = this;
            monitor-enter(r0)
            Yue.ۥ۠ۥ۟ۤ r2 = r0.f20034     // Catch: java.lang.Throwable -> Ld
            if (r2 != 0) goto Lf
            Yue.ۥۡۦۧۦ$ۥ۟ r2 = new Yue.ۥۡۦۧۦ$ۥ۟     // Catch: java.lang.Throwable -> Ld
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Ld
            r0.f20034 = r2     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r1 = move-exception
            goto L1a
        Lf:
            Yue.ۥ۠ۥ۟ۤ r2 = r0.f20034     // Catch: java.lang.Throwable -> Ld
            android.os.IBinder r2 = r2.asBinder()     // Catch: java.lang.Throwable -> Ld
            r1.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m20404(int r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m20405(int r3, android.os.Bundle r4) {
            r2 = this;
            boolean r0 = r2.f20032
            if (r0 == 0) goto L15
            android.os.Handler r0 = r2.f20033
            if (r0 == 0) goto L11
            Yue.ۥۡۦۧۦ$ۥ۟۟ r1 = new Yue.ۥۡۦۧۦ$ۥ۟۟
            r1.<init>(r2, r3, r4)
            r0.post(r1)
            goto L14
        L11:
            r2.m20404(r3, r4)
        L14:
            return
        L15:
            Yue.ۥ۠ۥ۟ۤ r0 = r2.f20034
            if (r0 == 0) goto L1c
            r0.mo13604(r3, r4)     // Catch: android.os.RemoteException -> L1c
        L1c:
            return
    }
}
