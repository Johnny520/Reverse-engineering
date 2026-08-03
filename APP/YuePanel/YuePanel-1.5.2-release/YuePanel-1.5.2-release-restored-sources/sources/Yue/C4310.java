package Yue;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4310 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6489
    public final C7564 f813;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC5568
    public final long f814;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final WeakReference<InterfaceC4225> f8835;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public String f8836 = C4311.f815;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC5568
    @InterfaceC6489
    public Thread f8837;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6489
    public WeakReference<InterfaceC4246> f8838;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۨۥ$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", m1273f = "DebugCoroutineInfoImpl.kt", m1274i = {}, m1275l = {75}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C0378 extends AbstractC7146 implements InterfaceC5138<AbstractC7328<? super StackTraceElement>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f8839;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ Object f8840;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ C7564 f8842;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0378(C7564 c7564, InterfaceC4199<? super C0378> interfaceC4199) {
            super(2, interfaceC4199);
            this.f8842 = c7564;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C0378 c0378 = C4310.this.new C0378(this.f8842, interfaceC4199);
            c0378.f8840 = obj;
            return c0378;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            Object objM17142 = C5508.m17142();
            int i = this.f8839;
            if (i == 0) {
                C7149.m22422(obj);
                AbstractC7328 abstractC7328 = (AbstractC7328) this.f8840;
                C4310 c4310 = C4310.this;
                InterfaceC4246 callerFrame = this.f8842.getCallerFrame();
                this.f8839 = 1;
                if (c4310.m12455(abstractC7328, callerFrame, this) == objM17142) {
                    return objM17142;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7149.m22422(obj);
            }
            return C8107.f3222;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 AbstractC7328<? super StackTraceElement> abstractC7328, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C0378) create(abstractC7328, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۨۥ$ۥ۟ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", m1273f = "DebugCoroutineInfoImpl.kt", m1274i = {}, m1275l = {80}, m1276m = "yieldFrames", m1277n = {}, m1278s = {})
    public static final class C0379 extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f8843;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f8844;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f8845;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f8846;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public int f8848;

        public C0379(InterfaceC4199<? super C0379> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f8846 = obj;
            this.f8848 |= Integer.MIN_VALUE;
            return C4310.this.m12455(null, null, this);
        }
    }

    public C4310(@InterfaceC6489 InterfaceC4225 interfaceC4225, @InterfaceC6489 C7564 c7564, long j) {
        this.f813 = c7564;
        this.f814 = j;
        this.f8835 = new WeakReference<>(interfaceC4225);
    }

    @InterfaceC6399
    public String toString() {
        return "DebugCoroutineInfo(state=" + m12451() + ",context=" + m12447() + ')';
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final List<StackTraceElement> m1269() {
        C7564 c7564 = this.f813;
        return c7564 == null ? C3880.m10735() : C7342.m23081(C7330.m3577(new C0378(c7564, null)));
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final InterfaceC4225 m12447() {
        return this.f8835.get();
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final C7564 m12448() {
        return this.f813;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final List<StackTraceElement> m12449() {
        return m1269();
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final InterfaceC4246 m12450() {
        WeakReference<InterfaceC4246> weakReference = this.f8838;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final String m12451() {
        return this.f8836;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final List<StackTraceElement> m12452() {
        InterfaceC4246 interfaceC4246M12450 = m12450();
        if (interfaceC4246M12450 == null) {
            return C3880.m10735();
        }
        ArrayList arrayList = new ArrayList();
        while (interfaceC4246M12450 != null) {
            StackTraceElement stackTraceElement = interfaceC4246M12450.getStackTraceElement();
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
            interfaceC4246M12450 = interfaceC4246M12450.getCallerFrame();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m12453(@InterfaceC6489 InterfaceC4246 interfaceC4246) {
        this.f8838 = interfaceC4246 != null ? new WeakReference<>(interfaceC4246) : null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m12454(@InterfaceC6399 String str, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
        if (C5499.m17094(this.f8836, str) && C5499.m17094(str, C4311.f8849) && m12450() != null) {
            return;
        }
        this.f8836 = str;
        m12453(interfaceC4199 instanceof InterfaceC4246 ? (InterfaceC4246) interfaceC4199 : null);
        this.f8837 = C5499.m17094(str, C4311.f816) ? Thread.currentThread() : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004a -> B:25:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005b -> B:24:0x005e). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m12455(AbstractC7328<? super StackTraceElement> abstractC7328, InterfaceC4246 interfaceC4246, InterfaceC4199<? super C8107> interfaceC4199) {
        C0379 c0379;
        C4310 c4310;
        if (interfaceC4199 instanceof C0379) {
            c0379 = (C0379) interfaceC4199;
            int i = c0379.f8848;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0379.f8848 = i - Integer.MIN_VALUE;
            } else {
                c0379 = new C0379(interfaceC4199);
            }
        }
        Object obj = c0379.f8846;
        Object objM17142 = C5508.m17142();
        int i2 = c0379.f8848;
        if (i2 == 0) {
            C7149.m22422(obj);
            c4310 = this;
            if (interfaceC4246 == null) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC4246 interfaceC42462 = (InterfaceC4246) c0379.f8845;
            AbstractC7328<? super StackTraceElement> abstractC73282 = (AbstractC7328) c0379.f8844;
            c4310 = (C4310) c0379.f8843;
            C7149.m22422(obj);
            AbstractC7328<? super StackTraceElement> abstractC73283 = abstractC73282;
            interfaceC4246 = interfaceC42462;
            abstractC7328 = abstractC73283;
            interfaceC4246 = interfaceC4246.getCallerFrame();
            if (interfaceC4246 == null) {
                return C8107.f3222;
            }
            if (interfaceC4246 == null) {
                StackTraceElement stackTraceElement = interfaceC4246.getStackTraceElement();
                if (stackTraceElement != null) {
                    c0379.f8843 = c4310;
                    c0379.f8844 = abstractC7328;
                    c0379.f8845 = interfaceC4246;
                    c0379.f8848 = 1;
                    if (abstractC7328.mo3574(stackTraceElement, c0379) == objM17142) {
                        return objM17142;
                    }
                    InterfaceC4246 interfaceC42463 = interfaceC4246;
                    abstractC73282 = abstractC7328;
                    interfaceC42462 = interfaceC42463;
                    AbstractC7328<? super StackTraceElement> abstractC732832 = abstractC73282;
                    interfaceC4246 = interfaceC42462;
                    abstractC7328 = abstractC732832;
                }
                interfaceC4246 = interfaceC4246.getCallerFrame();
                if (interfaceC4246 == null) {
                }
                if (interfaceC4246 == null) {
                    return C8107.f3222;
                }
            }
        }
    }
}
