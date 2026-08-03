package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Task.kt\nokhttp3/internal/concurrent/Task\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
public abstract class AbstractC6111 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.String f22055;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean f22056;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.C6118 f22057;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public long f22058;

    public AbstractC6111(@Yue.InterfaceC4418 java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f22055 = r2
            r1.f22056 = r3
            r2 = -1
            r1.f22058 = r2
            return
    }

    public /* synthetic */ AbstractC6111(java.lang.String r1, boolean r2, int r3, Yue.C1769 r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 1
        L5:
            r0.<init>(r1, r2)
            return
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f22055
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final boolean m22926() {
            r1 = this;
            boolean r0 = r1.f22056
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.String m22927() {
            r1 = this;
            java.lang.String r0 = r1.f22055
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final long m22928() {
            r2 = this;
            long r0 = r2.f22058
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Yue.C6118 m22929() {
            r1 = this;
            Yue.ۥۢۡ۟ۡ r0 = r1.f22057
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m22930(@Yue.InterfaceC4418 Yue.C6118 r2) {
            r1 = this;
            java.lang.String r0 = "queue"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۢۡ۟ۡ r0 = r1.f22057
            if (r0 != r2) goto La
            return
        La:
            if (r0 != 0) goto Lf
            r1.f22057 = r2
            return
        Lf:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "task is in multiple queues"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public abstract long mo8734();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m22931(long r1) {
            r0 = this;
            r0.f22058 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m22932(@Yue.InterfaceC4543 Yue.C6118 r1) {
            r0 = this;
            r0.f22057 = r1
            return
    }
}
