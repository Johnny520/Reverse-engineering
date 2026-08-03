package Yue;

import java.util.ArrayList;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5495
public abstract class AbstractC3716<T> implements InterfaceC5154<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final InterfaceC4225 f6621;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC5568
    public final int f6622;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final EnumC3602 f6623;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۡ۠$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", m1273f = "ChannelFlow.kt", m1274i = {}, m1275l = {123}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C0234 extends AbstractC7690 implements InterfaceC5138<InterfaceC4243, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f6624;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f6625;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4892<T> f6626;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ AbstractC3716<T> f6627;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣۣ۠ۢ<? super T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0234(InterfaceC4892<? super T> interfaceC4892, AbstractC3716<T> abstractC3716, InterfaceC4199<? super C0234> interfaceC4199) {
            super(2, interfaceC4199);
            this.f6626 = interfaceC4892;
            this.f6627 = abstractC3716;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C0234 c0234 = new C0234(this.f6626, this.f6627, interfaceC4199);
            c0234.f6625 = obj;
            return c0234;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        public final Object invoke(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C0234) create(interfaceC4243, interfaceC4199)).invokeSuspend(C8107.f3222);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            Object objM17142 = C5508.m17142();
            int i = this.f6624;
            if (i == 0) {
                C7149.m22422(obj);
                InterfaceC4243 interfaceC4243 = (InterfaceC4243) this.f6625;
                InterfaceC4892<T> interfaceC4892 = this.f6626;
                InterfaceC7042<T> interfaceC7042Mo10174 = this.f6627.mo10174(interfaceC4243);
                this.f6624 = 1;
                if (C4896.m15209(interfaceC4892, interfaceC7042Mo10174, this) == objM17142) {
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
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۡ۠$ۥ۟ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", m1273f = "ChannelFlow.kt", m1274i = {}, m1275l = {60}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C0235 extends AbstractC7690 implements InterfaceC5138<InterfaceC6809<? super T>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f6628;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f6629;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ AbstractC3716<T> f6630;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0235(AbstractC3716<T> abstractC3716, InterfaceC4199<? super C0235> interfaceC4199) {
            super(2, interfaceC4199);
            this.f6630 = abstractC3716;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C0235 c0235 = new C0235(this.f6630, interfaceC4199);
            c0235.f6629 = obj;
            return c0235;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            Object objM17142 = C5508.m17142();
            int i = this.f6628;
            if (i == 0) {
                C7149.m22422(obj);
                InterfaceC6809<? super T> interfaceC6809 = (InterfaceC6809) this.f6629;
                AbstractC3716<T> abstractC3716 = this.f6630;
                this.f6628 = 1;
                if (abstractC3716.mo9979(interfaceC6809, this) == objM17142) {
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
        public final Object invoke(@InterfaceC6399 InterfaceC6809<? super T> interfaceC6809, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C0235) create(interfaceC6809, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    public AbstractC3716(@InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC3602 enumC3602) {
        this.f6621 = interfaceC4225;
        this.f6622 = i;
        this.f6623 = enumC3602;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ Object m10177(AbstractC3716 abstractC3716, InterfaceC4892 interfaceC4892, InterfaceC4199 interfaceC4199) {
        Object objM12241 = C4244.m12241(new C0234(interfaceC4892, abstractC3716, null), interfaceC4199);
        return objM12241 == C5508.m17142() ? objM12241 : C8107.f3222;
    }

    @InterfaceC6399
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strMo10172 = mo10172();
        if (strMo10172 != null) {
            arrayList.add(strMo10172);
        }
        if (this.f6621 != C4629.f9940) {
            arrayList.add("context=" + this.f6621);
        }
        if (this.f6622 != -3) {
            arrayList.add("capacity=" + this.f6622);
        }
        if (this.f6623 != EnumC3602.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f6623);
        }
        return C4325.m1288(this) + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + C3888.m10923(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }

    @Override // Yue.InterfaceC4890
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        return m10177(this, interfaceC4892, interfaceC4199);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // Yue.InterfaceC5154
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC4890<T> mo10178(@InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC3602 enumC3602) {
        InterfaceC4225 interfaceC4225Plus = interfaceC4225.plus(this.f6621);
        if (enumC3602 == EnumC3602.SUSPEND) {
            int i2 = this.f6622;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i == -2) {
                            i = i2;
                        } else {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
            }
            enumC3602 = this.f6623;
        }
        return (C5499.m17094(interfaceC4225Plus, this.f6621) && i == this.f6622 && enumC3602 == this.f6623) ? this : mo9980(interfaceC4225Plus, i, enumC3602);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public String mo10172() {
        return null;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public abstract Object mo9979(@InterfaceC6399 InterfaceC6809<? super T> interfaceC6809, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199);

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public abstract AbstractC3716<T> mo9980(@InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC3602 enumC3602);

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public InterfaceC4890<T> mo10173() {
        return null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final InterfaceC5138<InterfaceC6809<? super T>, InterfaceC4199<? super C8107>, Object> m10179() {
        return new C0235(this, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final int m10180() {
        int i = this.f6622;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥۡۥۡۢ.ۥ۟۟۟۠(Yue.ۥ۟ۧۧۥ, Yue.ۥ۟ۧۦۥ, int, Yue.ۥۣۣ۟, Yue.ۥ۟ۧۨ, Yue.ۥۣ۠ۡ۟, Yue.ۥۣ۠ۢۢ, int, java.lang.Object):Yue.ۥۡۦۡۡ */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public InterfaceC7042<T> mo10174(@InterfaceC6399 InterfaceC4243 interfaceC4243) {
        return C6806.m21526(interfaceC4243, this.f6621, m10180(), this.f6623, EnumC4247.ATOMIC, null, m10179(), 16, null);
    }
}
