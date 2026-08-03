package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6319 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C7694 f1996 = new C7694("LOCK_FAIL");

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final C7694 f1997 = new C7694("UNLOCK_FAIL");

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C7694 f15913;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C7694 f15914;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C4627 f15915;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final C4627 f15916;

    /* JADX INFO: renamed from: Yue.ۥۡۡۨ$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.sync.MutexKt", m1273f = "Mutex.kt", m1274i = {0, 0, 0}, m1275l = {112}, m1276m = "withLock", m1277n = {"$this$withLock", "owner", "action"}, m1278s = {"L$0", "L$1", "L$2"})
    public static final class C0964<T> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f15917;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f15918;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f15919;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f15920;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f15921;

        public C0964(InterfaceC4199<? super C0964> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f15920 = obj;
            this.f15921 |= Integer.MIN_VALUE;
            return C6319.m19644(null, null, null, this);
        }
    }

    static {
        C7694 c7694 = new C7694("LOCKED");
        f15913 = c7694;
        C7694 c76942 = new C7694("UNLOCKED");
        f15914 = c76942;
        f15915 = new C4627(c7694);
        f15916 = new C4627(c76942);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final InterfaceC6310 m2781(boolean z) {
        return new C6311(z);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ InterfaceC6310 m2782(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m2781(z);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m19638() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ void m19639() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m19640() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ void m19641() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m19642() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m19643() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m19644(@InterfaceC6399 InterfaceC6310 interfaceC6310, @InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC5122<? extends T> interfaceC5122, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        C0964 c0964;
        if (interfaceC4199 instanceof C0964) {
            c0964 = (C0964) interfaceC4199;
            int i = c0964.f15921;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0964.f15921 = i - Integer.MIN_VALUE;
            } else {
                c0964 = new C0964(interfaceC4199);
            }
        }
        Object obj2 = c0964.f15920;
        Object objM17142 = C5508.m17142();
        int i2 = c0964.f15921;
        if (i2 == 0) {
            C7149.m22422(obj2);
            c0964.f15917 = interfaceC6310;
            c0964.f15918 = obj;
            c0964.f15919 = interfaceC5122;
            c0964.f15921 = 1;
            if (interfaceC6310.mo2777(obj, c0964) == objM17142) {
                return objM17142;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC5122 = (InterfaceC5122) c0964.f15919;
            obj = c0964.f15918;
            interfaceC6310 = (InterfaceC6310) c0964.f15917;
            C7149.m22422(obj2);
        }
        try {
            return interfaceC5122.invoke();
        } finally {
            C5437.m16930(1);
            interfaceC6310.mo19616(obj);
            C5437.m16929(1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final <T> Object m19645(InterfaceC6310 interfaceC6310, Object obj, InterfaceC5122<? extends T> interfaceC5122, InterfaceC4199<? super T> interfaceC4199) {
        C5437.m16931(0);
        interfaceC6310.mo2777(obj, interfaceC4199);
        C5437.m16931(1);
        try {
            return interfaceC5122.invoke();
        } finally {
            C5437.m16930(1);
            interfaceC6310.mo19616(obj);
            C5437.m16929(1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static /* synthetic */ Object m19646(InterfaceC6310 interfaceC6310, Object obj, InterfaceC5122 interfaceC5122, InterfaceC4199 interfaceC4199, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        C5437.m16931(0);
        interfaceC6310.mo2777(obj, interfaceC4199);
        C5437.m16931(1);
        try {
            return interfaceC5122.invoke();
        } finally {
            C5437.m16930(1);
            interfaceC6310.mo19616(obj);
            C5437.m16929(1);
        }
    }
}
