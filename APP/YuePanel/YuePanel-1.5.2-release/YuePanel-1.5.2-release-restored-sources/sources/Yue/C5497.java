package Yue;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5497 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f1544 = 0;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f1545 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f13463 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f13464 = 3;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۥۧ$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", m1273f = "Interruptible.kt", m1274i = {}, m1275l = {}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C0778<T> extends AbstractC7690 implements InterfaceC5138<InterfaceC4243, InterfaceC4199<? super T>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f13465;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f13466;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5122<T> f13467;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠۠ۨ<? extends T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0778(InterfaceC5122<? extends T> interfaceC5122, InterfaceC4199<? super C0778> interfaceC4199) {
            super(2, interfaceC4199);
            this.f13467 = interfaceC5122;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C0778 c0778 = new C0778(this.f13467, interfaceC4199);
            c0778.f13466 = obj;
            return c0778;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        public final Object invoke(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6489 InterfaceC4199<? super T> interfaceC4199) {
            return ((C0778) create(interfaceC4243, interfaceC4199)).invokeSuspend(C8107.f3222);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            C5508.m17142();
            if (this.f13465 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7149.m22422(obj);
            return C5497.m17089(((InterfaceC4243) this.f13466).getCoroutineContext(), this.f13467);
        }
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T> Object m2254(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC5122<? extends T> interfaceC5122, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        return C3615.m9756(interfaceC4225, new C0778(interfaceC5122, null), interfaceC4199);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ Object m17088(InterfaceC4225 interfaceC4225, InterfaceC5122 interfaceC5122, InterfaceC4199 interfaceC4199, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC4225 = C4629.f9940;
        }
        return m2254(interfaceC4225, interfaceC5122, interfaceC4199);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> T m17089(InterfaceC4225 interfaceC4225, InterfaceC5122<? extends T> interfaceC5122) throws Throwable {
        try {
            C7787 c7787 = new C7787(C5553.m17213(interfaceC4225));
            c7787.m24746();
            try {
                return interfaceC5122.invoke();
            } finally {
                c7787.m24743();
            }
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }
}
