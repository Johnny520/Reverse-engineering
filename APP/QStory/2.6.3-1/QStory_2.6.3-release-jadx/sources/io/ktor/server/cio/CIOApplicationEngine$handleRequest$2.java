package io.ktor.server.cio;

import io.ktor.http.cio.C4798;
import io.ktor.server.application.C4890;
import io.ktor.server.cio.backend.C4905;
import io.ktor.server.engine.AbstractC4925;
import io.ktor.server.request.C4962;
import io.ktor.util.debug.AbstractC5020;
import io.ktor.util.pipeline.C5024;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.cio.CIOApplicationEngine$handleRequest$2", m556f = "CIOApplicationEngine.kt", m557l = {165, 229, 168}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class CIOApplicationEngine$handleRequest$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C4798 $request;
    final /* synthetic */ C4905 $this_handleRequest;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C4913 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOApplicationEngine$handleRequest$2(C4913 c4913, C4798 c4798, C4905 c4905, InterfaceC5189<? super CIOApplicationEngine$handleRequest$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c4913;
        this.$request = c4798;
        this.$this_handleRequest = c4905;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        CIOApplicationEngine$handleRequest$2 cIOApplicationEngine$handleRequest$2 = new CIOApplicationEngine$handleRequest$2(this.this$0, this.$request, this.$this_handleRequest, interfaceC5189);
        cIOApplicationEngine$handleRequest$2.L$0 = obj;
        return cIOApplicationEngine$handleRequest$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((CIOApplicationEngine$handleRequest$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C4915 c4915;
        C0365x14a42c8f c0365x14a42c8f;
        C4915 c49152;
        C4915 c49153;
        C4911 c4911;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
            C4890 c4890 = (C4890) this.this$0.f12736.invoke();
            C4798 c4798 = this.$request;
            C4905 c4905 = this.$this_handleRequest;
            InterfaceC5084 interfaceC5084 = c4905.f12716;
            InterfaceC5079 interfaceC5079 = c4905.f12717;
            C4913 c4913 = this.this$0;
            C4915 c49154 = new C4915(c4890, c4798, interfaceC5084, interfaceC5079, c4913.f12739, c4913.f12738, c4905.f12715, c4905.f12714, c4905.f12713, interfaceC6233.mo2990());
            try {
                C4913 c49132 = this.this$0;
                InterfaceC5079 interfaceC50792 = this.$this_handleRequest.f12717;
                this.L$0 = c49154;
                this.label = 1;
                c49132.getClass();
                C5024 c5024 = new C5024("ExpectedHeaderPhase");
                C4911 c49112 = c49154.f12746;
                c49112.f12771.m9134(C4962.f12869, c5024);
                C4962 c4962 = c49112.f12771;
                try {
                    CIOApplicationEngine$addHandlerForExpectedHeader$2 cIOApplicationEngine$addHandlerForExpectedHeader$2 = new CIOApplicationEngine$addHandlerForExpectedHeader$2(c49154, c49132, "100-continue", interfaceC50792, "HTTP/1.1 100 Continue\r\n", null);
                    c49154 = c49154;
                    c4962.m9138(c5024, cIOApplicationEngine$addHandlerForExpectedHeader$2);
                    if (c6008 != coroutineSingletons) {
                        c4915 = c49154;
                        c0365x14a42c8f = new C0365x14a42c8f(this.this$0.f12774, c4915, null);
                        this.L$0 = c4915;
                        this.label = 2;
                        if (AbstractC5020.m9114(c0365x14a42c8f, this) != coroutineSingletons) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    c49154 = c49154;
                    c4915 = c49154;
                    this.L$0 = c4915;
                    this.label = 3;
                    if (AbstractC4925.m9049(c4915, th, this) != coroutineSingletons) {
                        c49153 = c4915;
                        c4911 = c49153.f12746;
                        C4798 c47982 = c4911.f12729;
                        c47982.f12561.m8896();
                        c47982.f12562.m8936();
                        return c6008;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            c4915 = (C4915) this.L$0;
            try {
                AbstractC6017.m10769(obj);
                c0365x14a42c8f = new C0365x14a42c8f(this.this$0.f12774, c4915, null);
                this.L$0 = c4915;
                this.label = 2;
                if (AbstractC5020.m9114(c0365x14a42c8f, this) != coroutineSingletons) {
                    c49152 = c4915;
                    c4911 = c49152.f12746;
                }
            } catch (Throwable th3) {
                th = th3;
                this.L$0 = c4915;
                this.label = 3;
                if (AbstractC4925.m9049(c4915, th, this) != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
        if (i == 2) {
            c49152 = (C4915) this.L$0;
            try {
                AbstractC6017.m10769(obj);
                c4911 = c49152.f12746;
            } catch (Throwable th4) {
                th = th4;
                c4915 = c49152;
                try {
                    this.L$0 = c4915;
                    this.label = 3;
                    if (AbstractC4925.m9049(c4915, th, this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                } catch (Throwable th5) {
                    th = th5;
                    c49153 = c4915;
                    C4798 c47983 = c49153.f12746.f12729;
                    c47983.f12561.m8896();
                    c47983.f12562.m8936();
                    throw th;
                }
            }
        } else {
            if (i != 3) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c49153 = (C4915) this.L$0;
            try {
                AbstractC6017.m10769(obj);
                c4911 = c49153.f12746;
            } catch (Throwable th6) {
                th = th6;
                C4798 c479832 = c49153.f12746.f12729;
                c479832.f12561.m8896();
                c479832.f12562.m8936();
                throw th;
            }
        }
        C4798 c479822 = c4911.f12729;
        c479822.f12561.m8896();
        c479822.f12562.m8936();
        return c6008;
    }
}
