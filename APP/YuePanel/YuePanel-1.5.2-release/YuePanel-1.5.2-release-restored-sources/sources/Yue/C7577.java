package Yue;

import Yue.C7060;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7577 implements InterfaceC7441 {

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۨۧ$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.StartedLazily$command$1", m1273f = "SharingStarted.kt", m1274i = {}, m1275l = {155}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C1297 extends AbstractC7690 implements InterfaceC5138<InterfaceC4892<? super EnumC7439>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f22886;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f22887;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7588<Integer> f22888;

        /* JADX INFO: renamed from: Yue.ۥۢ۟ۨۧ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C7578<T> implements InterfaceC4892 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ C7060.C1153 f22889;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC4892<EnumC7439> f22890;

            /* JADX INFO: renamed from: Yue.ۥۢ۟ۨۧ$ۥ$ۥ$ۥ, reason: contains not printable characters */
            @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", m1273f = "SharingStarted.kt", m1274i = {}, m1275l = {158}, m1276m = "emit", m1277n = {}, m1278s = {})
            public static final class C7579 extends AbstractC4201 {

                /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
                public /* synthetic */ Object f22891;

                /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
                public final /* synthetic */ C7578<T> f22892;

                /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
                public int f22893;

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۢ۟ۨۧ$ۥ$ۥ<? super T> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C7579(C7578<? super T> c7578, InterfaceC4199<? super C7579> interfaceC4199) {
                    super(interfaceC4199);
                    this.f22892 = c7578;
                }

                @Override // Yue.AbstractC3513
                @InterfaceC6489
                public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                    this.f22891 = obj;
                    this.f22893 |= Integer.MIN_VALUE;
                    return this.f22892.m3741(0, this);
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣۣ۠ۢ<? super Yue.ۥۡۨۨۦ> */
            /* JADX WARN: Multi-variable type inference failed */
            public C7578(C7060.C1153 c1153, InterfaceC4892<? super EnumC7439> interfaceC4892) {
                this.f22889 = c1153;
                this.f22890 = interfaceC4892;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object m3741(int i, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
                C7579 c7579;
                if (interfaceC4199 instanceof C7579) {
                    c7579 = (C7579) interfaceC4199;
                    int i2 = c7579.f22893;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c7579.f22893 = i2 - Integer.MIN_VALUE;
                    } else {
                        c7579 = new C7579(this, interfaceC4199);
                    }
                }
                Object obj = c7579.f22891;
                Object objM17142 = C5508.m17142();
                int i3 = c7579.f22893;
                if (i3 == 0) {
                    C7149.m22422(obj);
                    if (i > 0) {
                        C7060.C1153 c1153 = this.f22889;
                        if (!c1153.f21346) {
                            c1153.f21346 = true;
                            InterfaceC4892<EnumC7439> interfaceC4892 = this.f22890;
                            EnumC7439 enumC7439 = EnumC7439.START;
                            c7579.f22893 = 1;
                            if (interfaceC4892.mo10059(enumC7439, c7579) == objM17142) {
                                return objM17142;
                            }
                        }
                    }
                    return C8107.f3222;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7149.m22422(obj);
                return C8107.f3222;
            }

            @Override // Yue.InterfaceC4892
            /* JADX INFO: renamed from: ۥ۟۟۟۟ */
            public /* bridge */ /* synthetic */ Object mo10059(Object obj, InterfaceC4199 interfaceC4199) {
                return m3741(((Number) obj).intValue(), interfaceC4199);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1297(InterfaceC7588<Integer> interfaceC7588, InterfaceC4199<? super C1297> interfaceC4199) {
            super(2, interfaceC4199);
            this.f22888 = interfaceC7588;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C1297 c1297 = new C1297(this.f22888, interfaceC4199);
            c1297.f22887 = obj;
            return c1297;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            Object objM17142 = C5508.m17142();
            int i = this.f22886;
            if (i == 0) {
                C7149.m22422(obj);
                InterfaceC4892 interfaceC4892 = (InterfaceC4892) this.f22887;
                C7060.C1153 c1153 = new C7060.C1153();
                InterfaceC7588<Integer> interfaceC7588 = this.f22888;
                C7578 c7578 = new C7578(c1153, interfaceC4892);
                this.f22886 = 1;
                if (interfaceC7588.mo48(c7578, this) == objM17142) {
                    return objM17142;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7149.m22422(obj);
            }
            throw new C5667();
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 InterfaceC4892<? super EnumC7439> interfaceC4892, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C1297) create(interfaceC4892, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    @InterfaceC6399
    public String toString() {
        return "SharingStarted.Lazily";
    }

    @Override // Yue.InterfaceC7441
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public InterfaceC4890<EnumC7439> mo3633(@InterfaceC6399 InterfaceC7588<Integer> interfaceC7588) {
        return C4896.m15231(new C1297(interfaceC7588, null));
    }
}
