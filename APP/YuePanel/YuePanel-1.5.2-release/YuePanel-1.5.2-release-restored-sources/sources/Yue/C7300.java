package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۨ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7300 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f2792 = C7707.m24506("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final C7694 f2793 = new C7694("PERMIT");

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C7694 f22004 = new C7694("TAKEN");

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C7694 f22005 = new C7694("BROKEN");

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C7694 f22006 = new C7694("CANCELLED");

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f22007 = C7707.m24506("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    /* JADX INFO: renamed from: Yue.ۥۡۨ۟ۥ$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.sync.SemaphoreKt", m1273f = "Semaphore.kt", m1274i = {0, 0}, m1275l = {85}, m1276m = "withPermit", m1277n = {"$this$withPermit", "action"}, m1278s = {"L$0", "L$1"})
    public static final class C1228<T> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f22008;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f22009;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ Object f22010;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f22011;

        public C1228(InterfaceC4199<? super C1228> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f22010 = obj;
            this.f22011 |= Integer.MIN_VALUE;
            return C7300.m22816(null, null, this);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final InterfaceC7298 m3557(int i, int i2) {
        return new C7299(i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ InterfaceC7298 m3558(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m3557(i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final C7301 m22809(long j, C7301 c7301) {
        return new C7301(j, c7301, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m22810() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ void m22811() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m22812() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m22813() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ void m22814() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static /* synthetic */ void m22815() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m22816(@InterfaceC6399 InterfaceC7298 interfaceC7298, @InterfaceC6399 InterfaceC5122<? extends T> interfaceC5122, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        C1228 c1228;
        if (interfaceC4199 instanceof C1228) {
            c1228 = (C1228) interfaceC4199;
            int i = c1228.f22011;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1228.f22011 = i - Integer.MIN_VALUE;
            } else {
                c1228 = new C1228(interfaceC4199);
            }
        }
        Object obj = c1228.f22010;
        Object objM17142 = C5508.m17142();
        int i2 = c1228.f22011;
        if (i2 == 0) {
            C7149.m22422(obj);
            c1228.f22008 = interfaceC7298;
            c1228.f22009 = interfaceC5122;
            c1228.f22011 = 1;
            if (interfaceC7298.mo3556(c1228) == objM17142) {
                return objM17142;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC5122 = (InterfaceC5122) c1228.f22009;
            interfaceC7298 = (InterfaceC7298) c1228.f22008;
            C7149.m22422(obj);
        }
        try {
            return interfaceC5122.invoke();
        } finally {
            C5437.m16930(1);
            interfaceC7298.release();
            C5437.m16929(1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final <T> Object m22817(InterfaceC7298 interfaceC7298, InterfaceC5122<? extends T> interfaceC5122, InterfaceC4199<? super T> interfaceC4199) {
        C5437.m16931(0);
        interfaceC7298.mo3556(interfaceC4199);
        C5437.m16931(1);
        try {
            return interfaceC5122.invoke();
        } finally {
            C5437.m16930(1);
            interfaceC7298.release();
            C5437.m16929(1);
        }
    }
}
