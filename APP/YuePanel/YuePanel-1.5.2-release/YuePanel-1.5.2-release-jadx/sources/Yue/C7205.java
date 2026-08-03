package Yue;

import Yue.InterfaceC4225;

/* JADX INFO: renamed from: Yue.ۥۡۧۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7205 {

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۢ$ۥ */
    public static final class C1208 extends AbstractC5673 implements InterfaceC5138<Integer, InterfaceC4225.InterfaceC0357, Integer> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C7203<?> f21768;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1208(C7203<?> c7203) {
            super(2);
            this.f21768 = c7203;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5138
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, InterfaceC4225.InterfaceC0357 interfaceC0357) {
            return m22584(num.intValue(), interfaceC0357);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Integer m22584(int i, @InterfaceC6399 InterfaceC4225.InterfaceC0357 interfaceC0357) {
            InterfaceC4225.InterfaceC4228<?> key = interfaceC0357.getKey();
            InterfaceC4225.InterfaceC0357 interfaceC03572 = this.f21768.f21762.get(key);
            if (key != InterfaceC5542.f13507) {
                return Integer.valueOf(interfaceC0357 != interfaceC03572 ? Integer.MIN_VALUE : i + 1);
            }
            InterfaceC5542 interfaceC5542 = (InterfaceC5542) interfaceC03572;
            InterfaceC5542 interfaceC5542M3499 = C7205.m3499((InterfaceC5542) interfaceC0357, interfaceC5542);
            if (interfaceC5542M3499 == interfaceC5542) {
                if (interfaceC5542 != null) {
                    i++;
                }
                return Integer.valueOf(i);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC5542M3499 + ", expected child of " + interfaceC5542 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۧۢۢ$ۥ۟ */
    public static final class C1209<T> implements InterfaceC4890<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<InterfaceC4892<? super T>, InterfaceC4199<? super C8107>, Object> f21769;

        /* JADX INFO: renamed from: Yue.ۥۡۧۢۢ$ۥ۟$ۥ, reason: contains not printable characters */
        public static final class C7206 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f21770;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public int f21772;

            public C7206(InterfaceC4199<? super C7206> interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f21770 = obj;
                this.f21772 |= Integer.MIN_VALUE;
                return C1209.this.mo48(null, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۢ<? super Yue.ۥۣۣ۠ۢ<? super T>, ? super Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, ? extends java.lang.Object> */
        /* JADX WARN: Multi-variable type inference failed */
        public C1209(InterfaceC5138<? super InterfaceC4892<? super T>, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138) {
            this.f21769 = interfaceC5138;
        }

        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            Object objInvoke = this.f21769.invoke(interfaceC4892, interfaceC4199);
            return objInvoke == C5508.m17142() ? objInvoke : C8107.f3222;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Object m22585(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C5437.m16931(4);
            new C7206(interfaceC4199);
            C5437.m16931(5);
            this.f21769.invoke(interfaceC4892, interfaceC4199);
            return C8107.f3222;
        }
    }

    @InterfaceC5572(name = "checkContext")
    /* JADX INFO: renamed from: ۥ */
    public static final void m3498(@InterfaceC6399 C7203<?> c7203, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
        if (((Number) interfaceC4225.fold(0, new C1208(c7203))).intValue() == c7203.f21763) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + c7203.f21762 + ",\n\t\tbut emission happened in " + interfaceC4225 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public static final InterfaceC5542 m3499(@InterfaceC6489 InterfaceC5542 interfaceC5542, @InterfaceC6489 InterfaceC5542 interfaceC55422) {
        while (interfaceC5542 != null) {
            if (interfaceC5542 == interfaceC55422 || !(interfaceC5542 instanceof C7242)) {
                return interfaceC5542;
            }
            interfaceC5542 = ((C7242) interfaceC5542).m22679();
        }
        return null;
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m22583(@InterfaceC6399 @InterfaceC3614 InterfaceC5138<? super InterfaceC4892<? super T>, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138) {
        return new C1209(interfaceC5138);
    }
}
