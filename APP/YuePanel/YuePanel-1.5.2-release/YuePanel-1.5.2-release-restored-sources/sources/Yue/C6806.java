package Yue;

import Yue.C7148;

/* JADX INFO: renamed from: Yue.ۥۡۥۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6806 {

    /* JADX INFO: renamed from: Yue.ۥۡۥۡۢ$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ProduceKt", m1273f = "Produce.kt", m1274i = {0, 0}, m1275l = {153}, m1276m = "awaitClose", m1277n = {"$this$awaitClose", "block"}, m1278s = {"L$0", "L$1"})
    public static final class C1089 extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f17687;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f17688;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ Object f17689;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f17690;

        public C1089(InterfaceC4199<? super C1089> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f17689 = obj;
            this.f17690 |= Integer.MIN_VALUE;
            return C6806.m3271(null, null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۥۡۢ$ۥ۟ */
    public static final class C1090 extends AbstractC5673 implements InterfaceC5122<C8107> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C1090 f17691 = new C1090();

        public C1090() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5122
        public /* bridge */ /* synthetic */ C8107 invoke() {
            invoke2();
            return C8107.f3222;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method Yue.ۥۣ۠۠ۨ.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۥۡۢ$ۥ۟۟, reason: contains not printable characters */
    public static final class C6807 extends AbstractC5673 implements InterfaceC5124<Throwable, C8107> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC3665<C8107> f17692;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۟ۨ۟<? super Yue.ۥۣۢ۠ۤ> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6807(InterfaceC3665<? super C8107> interfaceC3665) {
            super(1);
            this.f17692 = interfaceC3665;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(Throwable th) {
            m21529(th);
            return C8107.f3222;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m21529(@InterfaceC6489 Throwable th) {
            InterfaceC3665<C8107> interfaceC3665 = this.f17692;
            C7148.C1189 c1189 = C7148.f21560;
            interfaceC3665.resumeWith(C7148.m3438(C8107.f3222));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3271(@InterfaceC6399 InterfaceC6809<?> interfaceC6809, @InterfaceC6399 InterfaceC5122<C8107> interfaceC5122, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        C1089 c1089;
        if (interfaceC4199 instanceof C1089) {
            c1089 = (C1089) interfaceC4199;
            int i = c1089.f17690;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1089.f17690 = i - Integer.MIN_VALUE;
            } else {
                c1089 = new C1089(interfaceC4199);
            }
        }
        Object obj = c1089.f17689;
        Object objM17142 = C5508.m17142();
        int i2 = c1089.f17690;
        try {
            if (i2 == 0) {
                C7149.m22422(obj);
                if (c1089.getContext().get(InterfaceC5542.f13507) != interfaceC6809) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context".toString());
                }
                c1089.f17687 = interfaceC6809;
                c1089.f17688 = interfaceC5122;
                c1089.f17690 = 1;
                C3666 c3666 = new C3666(C5501.m17135(c1089), 1);
                c3666.mo10020();
                interfaceC6809.mo5866(new C6807(c3666));
                Object objM10039 = c3666.m10039();
                if (objM10039 == C5508.m17142()) {
                    C4324.m12513(c1089);
                }
                if (objM10039 == objM17142) {
                    return objM17142;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC5122 = (InterfaceC5122) c1089.f17688;
                C7149.m22422(obj);
            }
            interfaceC5122.invoke();
            return C8107.f3222;
        } catch (Throwable th) {
            interfaceC5122.invoke();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ Object m3272(InterfaceC6809 interfaceC6809, InterfaceC5122 interfaceC5122, InterfaceC4199 interfaceC4199, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC5122 = C1090.f17691;
        }
        return m3271(interfaceC6809, interfaceC5122, interfaceC4199);
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥ۟ۤۡۨ.ۥ۟۟۟(int, Yue.ۥۣۣ۟, Yue.ۥۣ۠ۡ۟, int, java.lang.Object):Yue.ۥ۟ۤ۠ۨ */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <E> InterfaceC7042<E> m21523(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC3602 enumC3602, @InterfaceC6399 EnumC4247 enumC4247, @InterfaceC6489 InterfaceC5124<? super Throwable, C8107> interfaceC5124, @InterfaceC6399 @InterfaceC3614 InterfaceC5138<? super InterfaceC6809<? super E>, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138) {
        C6808 c6808 = new C6808(C4230.m12165(interfaceC4243, interfaceC4225), C3730.m10194(i, enumC3602, null, 4, null));
        if (interfaceC5124 != null) {
            c6808.mo17160(interfaceC5124);
        }
        c6808.m5781(enumC4247, c6808, interfaceC5138);
        return c6808;
    }

    @InterfaceC6399
    @InterfaceC5495
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <E> InterfaceC7042<E> m21524(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC4247 enumC4247, @InterfaceC6489 InterfaceC5124<? super Throwable, C8107> interfaceC5124, @InterfaceC6399 @InterfaceC3614 InterfaceC5138<? super InterfaceC6809<? super E>, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138) {
        return m21523(interfaceC4243, interfaceC4225, i, EnumC3602.SUSPEND, enumC4247, interfaceC5124, interfaceC5138);
    }

    @InterfaceC6399
    @InterfaceC4764
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <E> InterfaceC7042<E> m21525(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 @InterfaceC3614 InterfaceC5138<? super InterfaceC6809<? super E>, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138) {
        return m21523(interfaceC4243, interfaceC4225, i, EnumC3602.SUSPEND, EnumC4247.DEFAULT, null, interfaceC5138);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7042 m21526(InterfaceC4243 interfaceC4243, InterfaceC4225 interfaceC4225, int i, EnumC3602 enumC3602, EnumC4247 enumC4247, InterfaceC5124 interfaceC5124, InterfaceC5138 interfaceC5138, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC4225 = C4629.f9940;
        }
        InterfaceC4225 interfaceC42252 = interfaceC4225;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            enumC3602 = EnumC3602.SUSPEND;
        }
        EnumC3602 enumC36022 = enumC3602;
        if ((i2 & 8) != 0) {
            enumC4247 = EnumC4247.DEFAULT;
        }
        EnumC4247 enumC42472 = enumC4247;
        if ((i2 & 16) != 0) {
            interfaceC5124 = null;
        }
        return m21523(interfaceC4243, interfaceC42252, i3, enumC36022, enumC42472, interfaceC5124, interfaceC5138);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7042 m21527(InterfaceC4243 interfaceC4243, InterfaceC4225 interfaceC4225, int i, EnumC4247 enumC4247, InterfaceC5124 interfaceC5124, InterfaceC5138 interfaceC5138, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC4225 = C4629.f9940;
        }
        InterfaceC4225 interfaceC42252 = interfaceC4225;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            enumC4247 = EnumC4247.DEFAULT;
        }
        EnumC4247 enumC42472 = enumC4247;
        if ((i2 & 8) != 0) {
            interfaceC5124 = null;
        }
        return m21524(interfaceC4243, interfaceC42252, i3, enumC42472, interfaceC5124, interfaceC5138);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7042 m21528(InterfaceC4243 interfaceC4243, InterfaceC4225 interfaceC4225, int i, InterfaceC5138 interfaceC5138, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC4225 = C4629.f9940;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m21525(interfaceC4243, interfaceC4225, i, interfaceC5138);
    }
}
