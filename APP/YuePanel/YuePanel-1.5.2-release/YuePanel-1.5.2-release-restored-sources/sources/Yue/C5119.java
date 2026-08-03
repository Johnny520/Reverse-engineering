package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5119 {

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۥ$ۥ */
    @InterfaceC4313(m1272c = "androidx.activity.FullyDrawnReporterKt", m1273f = "FullyDrawnReporter.kt", m1274i = {0}, m1275l = {185}, m1276m = "reportWhenComplete", m1277n = {"$this$reportWhenComplete"}, m1278s = {"L$0"})
    @InterfaceC7507({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporterKt$reportWhenComplete$1\n*L\n1#1,190:1\n*E\n"})
    public static final class C0649 extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f12137;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f12138;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f12139;

        public C0649(InterfaceC4199<? super C0649> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f12138 = obj;
            this.f12139 |= Integer.MIN_VALUE;
            return C5119.m1932(null, null, this);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x0021 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Yue.ۥۣ۠۠ۤ */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Yue.ۥۣ۠۠ۤ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v4, types: [Yue.ۥۣۢ۠ۤ, java.lang.Object] */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1932(@InterfaceC6399 C5118 c5118, @InterfaceC6399 InterfaceC5124<? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5124, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        C0649 c0649;
        C5118 c51182;
        if (interfaceC4199 instanceof C0649) {
            c0649 = (C0649) interfaceC4199;
            int i = c0649.f12139;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0649.f12139 = i - Integer.MIN_VALUE;
            } else {
                c0649 = new C0649(interfaceC4199);
            }
        }
        Object obj = c0649.f12138;
        Object objM17142 = C5508.m17142();
        int i2 = c0649.f12139;
        try {
            if (i2 == 0) {
                C7149.m22422(obj);
                c5118.m15792();
                if (c5118.m15794()) {
                    return C8107.f3222;
                }
                c0649.f12137 = c5118;
                c0649.f12139 = 1;
                c51182 = c5118;
                if (interfaceC5124.invoke(c0649) == objM17142) {
                    return objM17142;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C5118 c51183 = (C5118) c0649.f12137;
                C7149.m22422(obj);
                c51182 = c51183;
            }
            C5437.m16930(1);
            c51182.m15797();
            C5437.m16929(1);
            c5118 = C8107.f3222;
            return c5118;
        } catch (Throwable th) {
            C5437.m16930(1);
            c5118.m15797();
            C5437.m16929(1);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final Object m1933(C5118 c5118, InterfaceC5124<? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5124, InterfaceC4199<? super C8107> interfaceC4199) {
        c5118.m15792();
        if (c5118.m15794()) {
            return C8107.f3222;
        }
        try {
            interfaceC5124.invoke(interfaceC4199);
            C5437.m16930(1);
            c5118.m15797();
            C5437.m16929(1);
            return C8107.f3222;
        } catch (Throwable th) {
            C5437.m16930(1);
            c5118.m15797();
            C5437.m16929(1);
            throw th;
        }
    }
}
