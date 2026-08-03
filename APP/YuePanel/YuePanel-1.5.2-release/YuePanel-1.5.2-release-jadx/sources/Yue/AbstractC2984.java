package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5039
public abstract class AbstractC2984<T> implements InterfaceC4890<T>, InterfaceC3669<T> {

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۡ۠$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.AbstractFlow", m1273f = "Flow.kt", m1274i = {0}, m1275l = {230}, m1276m = "collect", m1277n = {"safeCollector"}, m1278s = {"L$0"})
    public static final class C0013 extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f4322;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f4323;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ AbstractC2984<T> f4324;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f4325;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0013(AbstractC2984<T> abstractC2984, InterfaceC4199<? super C0013> interfaceC4199) {
            super(interfaceC4199);
            this.f4324 = abstractC2984;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f4323 = obj;
            this.f4325 |= Integer.MIN_VALUE;
            return this.f4324.mo48(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Yue.InterfaceC4890
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) throws Throwable {
        C0013 c0013;
        Throwable th;
        C7203 c7203;
        if (interfaceC4199 instanceof C0013) {
            c0013 = (C0013) interfaceC4199;
            int i = c0013.f4325;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0013.f4325 = i - Integer.MIN_VALUE;
            } else {
                c0013 = new C0013(this, interfaceC4199);
            }
        }
        Object obj = c0013.f4323;
        Object objM17142 = C5508.m17142();
        int i2 = c0013.f4325;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7203 = (C7203) c0013.f4322;
            try {
                C7149.m22422(obj);
                c7203.releaseIntercepted();
                return C8107.f3222;
            } catch (Throwable th2) {
                th = th2;
                c7203.releaseIntercepted();
                throw th;
            }
        }
        C7149.m22422(obj);
        C7203 c72032 = new C7203(interfaceC4892, c0013.getContext());
        try {
            c0013.f4322 = c72032;
            c0013.f4325 = 1;
            if (mo5788(c72032, c0013) == objM17142) {
                return objM17142;
            }
            c7203 = c72032;
            c7203.releaseIntercepted();
            return C8107.f3222;
        } catch (Throwable th3) {
            th = th3;
            c7203 = c72032;
            c7203.releaseIntercepted();
            throw th;
        }
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public abstract Object mo5788(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199);
}
