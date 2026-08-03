package Yue;

import Yue.InterfaceC4234;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3595 {

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۢۤ$ۥ */
    public static final class C0188 extends AbstractC2981 implements InterfaceC4234 {
        public C0188(InterfaceC4234.C0362 c0362) {
            super(c0362);
        }

        @Override // Yue.InterfaceC4234
        /* JADX INFO: renamed from: ۥ۟۟ۢ */
        public void mo6569(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 Throwable th) {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۢۤ$ۥ۟ */
    public static final class C0189 extends AbstractC5673 implements InterfaceC5124<Throwable, C8107> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7042<E> f6178;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۦۡۡ<? extends E> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0189(InterfaceC7042<? extends E> interfaceC7042) {
            super(1);
            this.f6178 = interfaceC7042;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(Throwable th) {
            m9593(th);
            return C8107.f3222;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m9593(@InterfaceC6489 Throwable th) {
            C3734.m810(this.f6178, th);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: Yue.ۥۣ۟ۢۤ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", m1273f = "Broadcast.kt", m1274i = {0, 1}, m1275l = {53, 54}, m1276m = "invokeSuspend", m1277n = {"$this$broadcast", "$this$broadcast"}, m1278s = {"L$0", "L$0"})
    public static final class C3596<E> extends AbstractC7690 implements InterfaceC5138<InterfaceC6809<? super E>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6179;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f6180;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ Object f6181;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7042<E> f6182;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۦۡۡ<? extends E> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3596(InterfaceC7042<? extends E> interfaceC7042, InterfaceC4199<? super C3596> interfaceC4199) {
            super(2, interfaceC4199);
            this.f6182 = interfaceC7042;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C3596 c3596 = new C3596(this.f6182, interfaceC4199);
            c3596.f6181 = obj;
            return c3596;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0062 -> B:7:0x0019). Please report as a decompilation issue!!! */
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            InterfaceC6809 interfaceC6809;
            InterfaceC3728<E> it;
            InterfaceC6809 interfaceC68092;
            Object objMo38;
            Object objM17142 = C5508.m17142();
            int i = this.f6180;
            if (i == 0) {
                C7149.m22422(obj);
                interfaceC6809 = (InterfaceC6809) this.f6181;
                it = this.f6182.iterator();
                this.f6181 = interfaceC6809;
                this.f6179 = it;
                this.f6180 = 1;
                objMo38 = it.mo38(this);
                if (objMo38 == objM17142) {
                }
            } else if (i == 1) {
                it = (InterfaceC3728) this.f6179;
                interfaceC68092 = (InterfaceC6809) this.f6181;
                C7149.m22422(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (InterfaceC3728) this.f6179;
                interfaceC68092 = (InterfaceC6809) this.f6181;
                C7149.m22422(obj);
                interfaceC6809 = interfaceC68092;
                this.f6181 = interfaceC6809;
                this.f6179 = it;
                this.f6180 = 1;
                objMo38 = it.mo38(this);
                if (objMo38 == objM17142) {
                    return objM17142;
                }
                interfaceC68092 = interfaceC6809;
                obj = objMo38;
                if (((Boolean) obj).booleanValue()) {
                    return C8107.f3222;
                }
                E next = it.next();
                this.f6181 = interfaceC68092;
                this.f6179 = it;
                this.f6180 = 2;
                if (interfaceC68092.mo5844(next, this) == objM17142) {
                    return objM17142;
                }
                interfaceC6809 = interfaceC68092;
                this.f6181 = interfaceC6809;
                this.f6179 = it;
                this.f6180 = 1;
                objMo38 = it.mo38(this);
                if (objMo38 == objM17142) {
                }
            }
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 InterfaceC6809<? super E> interfaceC6809, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C3596) create(interfaceC6809, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    @InterfaceC6399
    @InterfaceC6501
    /* JADX INFO: renamed from: ۥ */
    public static final <E> InterfaceC3592<E> m644(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC4247 enumC4247, @InterfaceC6489 InterfaceC5124<? super Throwable, C8107> interfaceC5124, @InterfaceC6399 @InterfaceC3614 InterfaceC5138<? super InterfaceC6809<? super E>, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138) {
        InterfaceC4225 interfaceC4225M12165 = C4230.m12165(interfaceC4243, interfaceC4225);
        InterfaceC3592 interfaceC3592M642 = C3593.m642(i);
        C3594 c5686 = enumC4247.m12252() ? new C5686(interfaceC4225M12165, interfaceC3592M642, interfaceC5138) : new C3594(interfaceC4225M12165, interfaceC3592M642, true);
        if (interfaceC5124 != null) {
            ((C5557) c5686).mo17160(interfaceC5124);
        }
        ((AbstractC2980) c5686).m5781(enumC4247, c5686, interfaceC5138);
        return (InterfaceC3592<E>) c5686;
    }

    @InterfaceC6399
    @InterfaceC6501
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <E> InterfaceC3592<E> m645(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, int i, @InterfaceC6399 EnumC4247 enumC4247) {
        return m9591(C4244.m12247(C4244.m12247(C5178.f12230, C4423.m12874()), new C0188(InterfaceC4234.f8587)), null, i, enumC4247, new C0189(interfaceC7042), new C3596(interfaceC7042, null), 1, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC3592 m9591(InterfaceC4243 interfaceC4243, InterfaceC4225 interfaceC4225, int i, EnumC4247 enumC4247, InterfaceC5124 interfaceC5124, InterfaceC5138 interfaceC5138, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC4225 = C4629.f9940;
        }
        InterfaceC4225 interfaceC42252 = interfaceC4225;
        if ((i2 & 2) != 0) {
            i = 1;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            enumC4247 = EnumC4247.LAZY;
        }
        EnumC4247 enumC42472 = enumC4247;
        if ((i2 & 8) != 0) {
            interfaceC5124 = null;
        }
        return m644(interfaceC4243, interfaceC42252, i3, enumC42472, interfaceC5124, interfaceC5138);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC3592 m9592(InterfaceC7042 interfaceC7042, int i, EnumC4247 enumC4247, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        if ((i2 & 2) != 0) {
            enumC4247 = EnumC4247.LAZY;
        }
        return m645(interfaceC7042, i, enumC4247);
    }
}
