package io.ktor.client.engine.cio;

import io.ktor.http.content.AbstractC4819;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5062;
import io.ktor.utils.p007io.C5077;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5079;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C6292;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p257.C8968;
import p267.AbstractC9004;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.engine.cio.UtilsKt$writeBody$2", m556f = "utils.kt", m557l = {130, 135, 137, 135, 137}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class UtilsKt$writeBody$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ AbstractC4819 $body;
    final /* synthetic */ InterfaceC5079 $channel;
    final /* synthetic */ C5062 $chunkedJob;
    final /* synthetic */ boolean $closeChannel;
    final /* synthetic */ InterfaceC5079 $output;
    final /* synthetic */ C8968 $request;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$writeBody$2(C8968 c8968, AbstractC4819 abstractC4819, InterfaceC5079 interfaceC5079, C5062 c5062, InterfaceC5079 interfaceC50792, boolean z, InterfaceC5189<? super UtilsKt$writeBody$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$request = c8968;
        this.$body = abstractC4819;
        this.$channel = interfaceC5079;
        this.$chunkedJob = c5062;
        this.$output = interfaceC50792;
        this.$closeChannel = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new UtilsKt$writeBody$2(this.$request, this.$body, this.$channel, this.$chunkedJob, this.$output, this.$closeChannel, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((UtilsKt$writeBody$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if (r10 == r0) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        Throwable thMo9203;
        Throwable th2;
        C5062 c5062;
        C5062 c50622;
        Throwable thMo92032;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj2 = C6008.f15084;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                AbstractC4819 abstractC4819 = this.$body;
                InterfaceC5079 interfaceC5079 = this.$channel;
                this.label = 1;
                if (AbstractC4702.m8814(abstractC4819, interfaceC5079, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i == 2) {
                    AbstractC6017.m10769(obj);
                    c5062 = this.$chunkedJob;
                    if (c5062 != null) {
                        AbstractC5076.m9225(c5062.f13078);
                    }
                    c50622 = this.$chunkedJob;
                    if (c50622 != null) {
                        this.label = 3;
                        C5077 c5077 = AbstractC5078.f13099;
                        Object objMo11123 = ((C6292) c50622.mo9205()).mo11123(this);
                        if (objMo11123 != coroutineSingletons) {
                            objMo11123 = obj2;
                        }
                    }
                    thMo92032 = ((C5081) this.$output).mo9203();
                    if (thMo92032 != null) {
                    }
                    if (this.$closeChannel) {
                    }
                    return obj2;
                }
                if (i == 3) {
                    AbstractC6017.m10769(obj);
                    thMo92032 = ((C5081) this.$output).mo9203();
                    if (thMo92032 != null) {
                        Throwable thM14184 = AbstractC9004.m14184(thMo92032);
                        th2 = thM14184 instanceof CancellationException ? null : thM14184;
                        if (th2 != null) {
                            throw th2;
                        }
                    }
                    if (this.$closeChannel) {
                        AbstractC5076.m9225(this.$output);
                    }
                    return obj2;
                }
                if (i != 4) {
                    if (i != 5) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = (Throwable) this.L$0;
                    AbstractC6017.m10769(obj);
                    th = th;
                    thMo9203 = ((C5081) this.$output).mo9203();
                    if (thMo9203 != null) {
                        Throwable thM141842 = AbstractC9004.m14184(thMo9203);
                        th2 = thM141842 instanceof CancellationException ? null : thM141842;
                        if (th2 != null) {
                            throw th2;
                        }
                    }
                    if (this.$closeChannel) {
                        AbstractC5076.m9225(this.$output);
                    }
                    throw th;
                }
                Throwable th3 = (Throwable) this.L$0;
                AbstractC6017.m10769(obj);
                th = th3;
                C5062 c50623 = this.$chunkedJob;
                if (c50623 != null) {
                    AbstractC5076.m9225(c50623.f13078);
                }
                C5062 c50624 = this.$chunkedJob;
                if (c50624 != null) {
                    this.L$0 = th;
                    this.label = 5;
                    C5077 c50772 = AbstractC5078.f13099;
                    Object objMo111232 = ((C6292) c50624.mo9205()).mo11123(this);
                    if (objMo111232 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        obj2 = objMo111232;
                    }
                    if (obj2 != coroutineSingletons) {
                        th = th;
                        th = th;
                    }
                    return coroutineSingletons;
                }
                thMo9203 = ((C5081) this.$output).mo9203();
                if (thMo9203 != null) {
                }
                if (this.$closeChannel) {
                }
                throw th;
            }
            AbstractC6017.m10769(obj);
            InterfaceC5079 interfaceC50792 = this.$channel;
            this.label = 2;
            if (((C5081) interfaceC50792).m9259(this) != coroutineSingletons) {
                c5062 = this.$chunkedJob;
                if (c5062 != null) {
                }
                c50622 = this.$chunkedJob;
                if (c50622 != null) {
                }
                thMo92032 = ((C5081) this.$output).mo9203();
                if (thMo92032 != null) {
                }
                if (this.$closeChannel) {
                }
                return obj2;
            }
            return coroutineSingletons;
        } catch (Throwable th4) {
            try {
                AbstractC5078.m9251(this.$channel, th4);
                throw th4;
            } catch (Throwable th5) {
                th = th5;
                InterfaceC5079 interfaceC50793 = this.$channel;
                this.L$0 = th;
                this.label = 4;
                if (((C5081) interfaceC50793).m9259(this) != coroutineSingletons) {
                }
            }
        }
    }
}
