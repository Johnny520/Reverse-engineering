package Yue;

import Yue.InterfaceC4225;

/* JADX INFO: renamed from: Yue.ۥۢۡۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7776 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    @InterfaceC5568
    public static final C7694 f3074 = new C7694("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final InterfaceC5138<Object, InterfaceC4225.InterfaceC0357, Object> f3075 = C1352.f23317;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final InterfaceC5138<InterfaceC7774<?>, InterfaceC4225.InterfaceC0357, InterfaceC7774<?>> f23315 = C1353.f23318;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final InterfaceC5138<C7786, InterfaceC4225.InterfaceC0357, C7786> f23316 = C7777.f23319;

    /* JADX INFO: renamed from: Yue.ۥۢۡۡۦ$ۥ */
    public static final class C1352 extends AbstractC5673 implements InterfaceC5138<Object, InterfaceC4225.InterfaceC0357, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C1352 f23317 = new C1352();

        public C1352() {
            super(2);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4225.InterfaceC0357 interfaceC0357) {
            if (!(interfaceC0357 instanceof InterfaceC7774)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? interfaceC0357 : Integer.valueOf(iIntValue + 1);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۡۦ$ۥ۟ */
    public static final class C1353 extends AbstractC5673 implements InterfaceC5138<InterfaceC7774<?>, InterfaceC4225.InterfaceC0357, InterfaceC7774<?>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C1353 f23318 = new C1353();

        public C1353() {
            super(2);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final InterfaceC7774<?> invoke(@InterfaceC6489 InterfaceC7774<?> interfaceC7774, @InterfaceC6399 InterfaceC4225.InterfaceC0357 interfaceC0357) {
            if (interfaceC7774 != null) {
                return interfaceC7774;
            }
            if (interfaceC0357 instanceof InterfaceC7774) {
                return (InterfaceC7774) interfaceC0357;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۡۦ$ۥ۟۟, reason: contains not printable characters */
    public static final class C7777 extends AbstractC5673 implements InterfaceC5138<C7786, InterfaceC4225.InterfaceC0357, C7786> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C7777 f23319 = new C7777();

        public C7777() {
            super(2);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final C7786 invoke(@InterfaceC6399 C7786 c7786, @InterfaceC6399 InterfaceC4225.InterfaceC0357 interfaceC0357) {
            if (interfaceC0357 instanceof InterfaceC7774) {
                InterfaceC7774<?> interfaceC7774 = (InterfaceC7774) interfaceC0357;
                c7786.m3885(interfaceC7774, interfaceC7774.mo12178(c7786.f3081));
            }
            return c7786;
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static final void m3874(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6489 Object obj) {
        if (obj == f3074) {
            return;
        }
        if (obj instanceof C7786) {
            ((C7786) obj).m3886(interfaceC4225);
            return;
        }
        Object objFold = interfaceC4225.fold(null, f23315);
        if (objFold == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
        ((InterfaceC7774) objFold).mo12179(interfaceC4225, obj);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final Object m3875(@InterfaceC6399 InterfaceC4225 interfaceC4225) {
        Object objFold = interfaceC4225.fold(0, f3075);
        C5499.m17100(objFold);
        return objFold;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Object m24718(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6489 Object obj) {
        if (obj == null) {
            obj = m3875(interfaceC4225);
        }
        return obj == 0 ? f3074 : obj instanceof Integer ? interfaceC4225.fold(new C7786(interfaceC4225, ((Number) obj).intValue()), f23316) : ((InterfaceC7774) obj).mo12178(interfaceC4225);
    }
}
