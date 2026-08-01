package io.ktor.client.plugins.websocket;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.alibaba.fastjson2.C2941;
import io.ktor.client.statement.AbstractC3942;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5437;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5440;
import lin.xposed.BuildConfig;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2", f = "builders.kt", l = {240, 243, 49, BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class BuildersKt$webSocketSession$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC5440 $sessionDeferred;
    final /* synthetic */ AbstractC3942 $statement;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuildersKt$webSocketSession$2(AbstractC3942 abstractC3942, InterfaceC5440 interfaceC5440, InterfaceC4356<? super BuildersKt$webSocketSession$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$statement = abstractC3942;
        this.$sessionDeferred = interfaceC5440;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new BuildersKt$webSocketSession$2(this.$statement, this.$sessionDeferred, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((BuildersKt$webSocketSession$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        try {
            try {
                if (i == 0) {
                    AbstractC5184.m10206(obj);
                    InterfaceC5440 interfaceC5440 = this.$sessionDeferred;
                    this.L$0 = null;
                    this.L$1 = interfaceC5440;
                    this.label = 1;
                    throw null;
                }
                try {
                    if (i == 1) {
                        AbstractC0053.m137(this.L$0);
                        AbstractC5184.m10206(obj);
                        if (obj == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                    if (i == 2) {
                        if (this.L$2 != null) {
                            C2941.m6336();
                            return null;
                        }
                        InterfaceC5440 interfaceC54402 = (InterfaceC5440) this.L$1;
                        AbstractC0053.m137(this.L$0);
                        AbstractC5184.m10206(obj);
                        if (obj == null) {
                            throw new NullPointerException("null cannot be cast to non-null type io.ktor.client.plugins.websocket.DefaultClientWebSocketSession");
                        }
                        AbstractC0053.m137(obj);
                        AbstractC5398.m10486();
                        ((C5437) interfaceC54402).m10585(null);
                        throw null;
                    }
                    if (i == 3) {
                        if (this.L$1 != null) {
                            C2941.m6336();
                            return null;
                        }
                        AbstractC0053.m137(this.L$0);
                        AbstractC5184.m10206(obj);
                        this.L$0 = c5175;
                        this.L$1 = null;
                        this.label = 4;
                        throw null;
                    }
                    if (i == 4) {
                        AbstractC5184.m10206(obj);
                        return c5175;
                    }
                    if (i != 5) {
                        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th = (Throwable) this.L$0;
                    AbstractC5184.m10206(obj);
                    throw th;
                } catch (Throwable th2) {
                    this.L$0 = th2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    throw null;
                }
            } catch (CancellationException e) {
                throw AbstractC0455.m1139(e);
            }
        } catch (Throwable th3) {
            ((C5437) this.$sessionDeferred).m10525(th3);
            return c5175;
        }
    }
}
