package io.ktor.client.engine.cio;

import io.ktor.http.content.AbstractC4819;
import io.ktor.util.AbstractC5049;
import io.ktor.util.C5036;
import io.ktor.util.C5041;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import java.util.Map;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6254;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p075.C7686;
import p079.InterfaceC7691;
import p252.AbstractC8944;
import p252.C8926;
import p252.C8928;
import p252.C8930;
import p252.C8945;
import p257.AbstractC8965;
import p257.AbstractC8967;
import p257.C8966;
import p257.C8968;
import p259.C8976;
import p269.AbstractC9019;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.engine.cio.Endpoint$processExpectContinue$2", m556f = "Endpoint.kt", m557l = {149, 151, 156, 163, 167, 171, 176, 179}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世兰苏哲;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世兰苏哲;"}, m152k = 3, m153mv = {2, 0, 0})
final class Endpoint$processExpectContinue$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC5192 $callContext;
    final /* synthetic */ InterfaceC5084 $input;
    final /* synthetic */ InterfaceC5079 $originOutput;
    final /* synthetic */ InterfaceC5079 $output;
    final /* synthetic */ boolean $overProxy;
    final /* synthetic */ C8968 $request;
    final /* synthetic */ C8976 $requestTime;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Endpoint$processExpectContinue$2(C8968 c8968, InterfaceC5079 interfaceC5079, boolean z, C8976 c8976, InterfaceC5084 interfaceC5084, InterfaceC5079 interfaceC50792, InterfaceC5192 interfaceC5192, InterfaceC5189<? super Endpoint$processExpectContinue$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$request = c8968;
        this.$output = interfaceC5079;
        this.$overProxy = z;
        this.$requestTime = c8976;
        this.$input = interfaceC5084;
        this.$originOutput = interfaceC50792;
        this.$callContext = interfaceC5192;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new Endpoint$processExpectContinue$2(this.$request, this.$output, this.$overProxy, this.$requestTime, this.$input, this.$originOutput, this.$callContext, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C8966> interfaceC5189) {
        return ((Endpoint$processExpectContinue$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[PHI: r2
  0x005b: PHI (r2v5 java.lang.Object) = (r2v4 java.lang.Object), (r2v10 java.lang.Object) binds: [B:18:0x0057, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM11032;
        Object objM11029;
        C8926 c8926;
        Object objM110292;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj2 = C6008.f15084;
        switch (i) {
            case 0:
                AbstractC6017.m10769(obj);
                C8968 c8968 = this.$request;
                InterfaceC5079 interfaceC5079 = this.$output;
                boolean z = this.$overProxy;
                this.label = 1;
                if (AbstractC4702.m8812(c8968, interfaceC5079, z, true, this) != coroutineSingletons) {
                    Endpoint$processExpectContinue$2$responseReady$1 endpoint$processExpectContinue$2$responseReady$1 = new Endpoint$processExpectContinue$2$responseReady$1(this.$input, null);
                    this.label = 2;
                    objM11032 = AbstractC6231.m11032(1000L, endpoint$processExpectContinue$2$responseReady$1, this);
                    if (objM11032 != coroutineSingletons) {
                        if (((Boolean) objM11032) == null) {
                            C8976 c8976 = this.$requestTime;
                            C8968 c89682 = this.$request;
                            InterfaceC5084 interfaceC5084 = this.$input;
                            InterfaceC5079 interfaceC50792 = this.$originOutput;
                            InterfaceC5192 interfaceC5192 = this.$callContext;
                            this.label = 3;
                            objM11029 = AbstractC6231.m11029(interfaceC5192, new UtilsKt$readResponse$2(interfaceC5084, interfaceC50792, interfaceC5192, c8976, c89682, null), this);
                            if (objM11029 != coroutineSingletons) {
                                C8966 c8966 = (C8966) objM11029;
                                c8926 = c8966.f22792;
                                if (!c8926.equals(C8926.f22694)) {
                                    C8930 c8930 = new C8930();
                                    C8928 c8928 = C8928.f22715;
                                    C8945 c8945 = new C8945(2);
                                    C6254 c6254M11046 = AbstractC6231.m11046();
                                    C5036 c5036M9186 = AbstractC5049.m9186(true);
                                    C8968 c89683 = this.$request;
                                    C5041 c5041 = AbstractC8967.f22793;
                                    c89683.getClass();
                                    C8928 c89282 = c89683.f22798;
                                    c89282.getClass();
                                    AbstractC4819 abstractC4819 = c89683.f22796;
                                    C5041 c50412 = AbstractC8965.f22790;
                                    C7686 c7686 = (C7686) c5036M9186.m9146(c50412);
                                    if (c7686 != null) {
                                        c5036M9186.m9145(c50412, c7686);
                                    } else {
                                        c50412.getClass();
                                        c5036M9186.m9147().remove(c50412);
                                    }
                                    AbstractC9019.m14238(c8930, c89683.f22799);
                                    c8945.m2985(c89683.f22797);
                                    AbstractC5049.m9194(c5036M9186, c89683.f22794);
                                    String[] strArr = AbstractC8944.f22758;
                                    ((Map) c8945.f4240).remove("Expect");
                                    C8968 c89684 = new C8968(c8930.m14132(), c89282, c8945.m14144(), abstractC4819, c6254M11046, c5036M9186);
                                    InterfaceC5079 interfaceC50793 = this.$output;
                                    InterfaceC5192 interfaceC51922 = this.$callContext;
                                    boolean z2 = this.$overProxy;
                                    this.label = 4;
                                    Object objM110293 = AbstractC6231.m11029(interfaceC51922, new UtilsKt$writeRequest$2(c89684, interfaceC50793, z2, true, interfaceC51922, null), this);
                                    if (objM110293 == coroutineSingletons) {
                                        obj2 = objM110293;
                                    }
                                    if (obj2 != coroutineSingletons) {
                                        C8976 c89762 = this.$requestTime;
                                        C8968 c89685 = this.$request;
                                        InterfaceC5084 interfaceC50842 = this.$input;
                                        InterfaceC5079 interfaceC50794 = this.$originOutput;
                                        InterfaceC5192 interfaceC51923 = this.$callContext;
                                        this.label = 8;
                                        objM110292 = AbstractC6231.m11029(interfaceC51923, new UtilsKt$readResponse$2(interfaceC50842, interfaceC50794, interfaceC51923, c89762, c89685, null), this);
                                        if (objM110292 != coroutineSingletons) {
                                            return objM110292;
                                        }
                                    }
                                } else if (c8926.equals(C8926.f22702)) {
                                    C8968 c89686 = this.$request;
                                    InterfaceC5079 interfaceC50795 = this.$output;
                                    InterfaceC5192 interfaceC51924 = this.$callContext;
                                    this.label = 5;
                                    AbstractC4702.m8813(c89686, interfaceC50795, interfaceC51924);
                                    if (obj2 != coroutineSingletons) {
                                    }
                                } else {
                                    InterfaceC5079 interfaceC50796 = this.$output;
                                    this.L$0 = c8966;
                                    this.label = 6;
                                    if (((C5081) interfaceC50796).m9263(this) != coroutineSingletons) {
                                        return c8966;
                                    }
                                }
                            }
                        } else {
                            C8968 c89687 = this.$request;
                            InterfaceC5079 interfaceC50797 = this.$output;
                            InterfaceC5192 interfaceC51925 = this.$callContext;
                            this.label = 7;
                            AbstractC4702.m8813(c89687, interfaceC50797, interfaceC51925);
                            if (obj2 != coroutineSingletons) {
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                AbstractC6017.m10769(obj);
                Endpoint$processExpectContinue$2$responseReady$1 endpoint$processExpectContinue$2$responseReady$12 = new Endpoint$processExpectContinue$2$responseReady$1(this.$input, null);
                this.label = 2;
                objM11032 = AbstractC6231.m11032(1000L, endpoint$processExpectContinue$2$responseReady$12, this);
                if (objM11032 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 2:
                AbstractC6017.m10769(obj);
                objM11032 = obj;
                if (((Boolean) objM11032) == null) {
                }
                return coroutineSingletons;
            case 3:
                AbstractC6017.m10769(obj);
                objM11029 = obj;
                C8966 c89662 = (C8966) objM11029;
                c8926 = c89662.f22792;
                if (!c8926.equals(C8926.f22694)) {
                }
                return coroutineSingletons;
            case 4:
            case 5:
            case 7:
                AbstractC6017.m10769(obj);
                C8976 c897622 = this.$requestTime;
                C8968 c896852 = this.$request;
                InterfaceC5084 interfaceC508422 = this.$input;
                InterfaceC5079 interfaceC507942 = this.$originOutput;
                InterfaceC5192 interfaceC519232 = this.$callContext;
                this.label = 8;
                objM110292 = AbstractC6231.m11029(interfaceC519232, new UtilsKt$readResponse$2(interfaceC508422, interfaceC507942, interfaceC519232, c897622, c896852, null), this);
                if (objM110292 != coroutineSingletons) {
                    return coroutineSingletons;
                }
                break;
            case 6:
                C8966 c89663 = (C8966) this.L$0;
                AbstractC6017.m10769(obj);
                return c89663;
            case 8:
                AbstractC6017.m10769(obj);
                return obj;
            default:
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
