package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1743 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.lang.String f5429 = "kotlinx.coroutines.debug";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.lang.String f5430 = "kotlinx.coroutines.stacktrace.recovery";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.lang.String f5431 = "auto";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.lang.String f5432 = "on";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.lang.String f5433 = "off";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final boolean f5434 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final boolean f5435 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean f5436 = false;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.util.concurrent.atomic.AtomicLong f5437 = null;

    static {
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = Yue.C6087.m22845(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2f
            int r3 = r0.hashCode()
            if (r3 == 0) goto L3a
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L31
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L27
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L44
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
            goto L2f
        L27:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
        L2f:
            r0 = r2
            goto L64
        L31:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
            goto L42
        L3a:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
        L42:
            r0 = r1
            goto L64
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r2.append(r3)
            r2.append(r0)
            r0 = 39
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L64:
            Yue.C1743.f5435 = r0
            if (r0 == 0) goto L71
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = Yue.C6087.m22846(r0, r1)
            if (r0 == 0) goto L71
            goto L72
        L71:
            r1 = r2
        L72:
            Yue.C1743.f5436 = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            Yue.C1743.f5437 = r0
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final void m8283(Yue.InterfaceC2823<java.lang.Boolean> r0) {
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final boolean m8284() {
            boolean r0 = Yue.C1743.f5434
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.util.concurrent.atomic.AtomicLong m8285() {
            java.util.concurrent.atomic.AtomicLong r0 = Yue.C1743.f5437
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final boolean m8286() {
            boolean r0 = Yue.C1743.f5435
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final boolean m8287() {
            boolean r0 = Yue.C1743.f5436
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m8288() {
            java.util.concurrent.atomic.AtomicLong r0 = Yue.C1743.f5437
            r1 = 0
            r0.set(r1)
            return
    }
}
