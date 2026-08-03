package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6560 {

    /* JADX INFO: renamed from: Yue.ۥۣۡۢۥ$ۥ */
    public static final class C1011 extends AbstractC5673 implements InterfaceC5124<Throwable, C8107> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<E, C8107> f16821;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ E f16822;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4225 f16823;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۡ۟<? super E, Yue.ۥۣۢ۠ۤ> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1011(InterfaceC5124<? super E, C8107> interfaceC5124, E e, InterfaceC4225 interfaceC4225) {
            super(1);
            this.f16821 = interfaceC5124;
            this.f16822 = e;
            this.f16823 = interfaceC4225;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(Throwable th) {
            m20876(th);
            return C8107.f3222;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m20876(@InterfaceC6399 Throwable th) {
            C6560.m3021(this.f16821, this.f16822, this.f16823);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final <E> InterfaceC5124<Throwable, C8107> m3020(@InterfaceC6399 InterfaceC5124<? super E, C8107> interfaceC5124, E e, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
        return new C1011(interfaceC5124, e, interfaceC4225);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final <E> void m3021(@InterfaceC6399 InterfaceC5124<? super E, C8107> interfaceC5124, E e, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
        C8100 c8100M20874 = m20874(interfaceC5124, e, null);
        if (c8100M20874 != null) {
            C4236.m1201(interfaceC4225, c8100M20874);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: E */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <E> C8100 m20874(@InterfaceC6399 InterfaceC5124<? super E, C8107> interfaceC5124, E e, @InterfaceC6489 C8100 c8100) {
        try {
            interfaceC5124.invoke(e);
        } catch (Throwable th) {
            if (c8100 == null || c8100.getCause() == th) {
                return new C8100("Exception in undelivered element handler for " + e, th);
            }
            C4741.m1656(c8100, th);
        }
        return c8100;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ C8100 m20875(InterfaceC5124 interfaceC5124, Object obj, C8100 c8100, int i, Object obj2) {
        if ((i & 2) != 0) {
            c8100 = null;
        }
        return m20874(interfaceC5124, obj, c8100);
    }
}
