package io.ktor.network.selector;

import com.alibaba.fastjson2.AbstractC3738;
import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.spi.AbstractSelector;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.network.selector.ActorSelectorManager$1", m556f = "ActorSelectorManager.kt", m557l = {42}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class ActorSelectorManager$1 extends SuspendLambda implements InterfaceC7383 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C4835 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActorSelectorManager$1(C4835 c4835, InterfaceC5189<? super ActorSelectorManager$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c4835;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new ActorSelectorManager$1(this.this$0, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ActorSelectorManager$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [io.ktor.network.selector.ActorSelectorManager$1, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.io.Closeable] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        C4835 c4835;
        AbstractSelector abstractSelector;
        Throwable th;
        AbstractSelector abstractSelector2;
        ?? r5;
        AbstractSelector abstractSelector3;
        ?? r52;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                AbstractSelector abstractSelectorOpenSelector = this.this$0.f12605.openSelector();
                if (abstractSelectorOpenSelector == null) {
                    C6755.m11870("openSelector() = null");
                    return null;
                }
                this.this$0.selectorRef = abstractSelectorOpenSelector;
                c4835 = this.this$0;
                try {
                    C4831 c4831 = c4835.f12601;
                    this.L$0 = abstractSelectorOpenSelector;
                    this.L$1 = c4835;
                    this.L$2 = abstractSelectorOpenSelector;
                    this.label = 1;
                    if (C4835.m8955(c4835, c4831, abstractSelectorOpenSelector, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    AbstractSelector abstractSelector4 = abstractSelectorOpenSelector;
                    abstractSelector2 = abstractSelector4;
                    r52 = abstractSelector4;
                    c4835.closed = true;
                    c4835.f12601.m8945();
                    abstractSelector3 = abstractSelector2;
                    r5 = r52;
                } catch (Throwable th2) {
                    abstractSelector = abstractSelectorOpenSelector;
                    th = th2;
                    this = abstractSelector;
                    c4835.closed = true;
                    c4835.f12601.m8945();
                    C4835.m8956(abstractSelector, th);
                    c4835.closed = true;
                    c4835.f12601.m8945();
                    abstractSelector3 = abstractSelector;
                    r5 = this;
                }
            } else {
                if (i != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                abstractSelector = (AbstractSelector) this.L$2;
                c4835 = (C4835) this.L$1;
                this = (Closeable) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    abstractSelector2 = abstractSelector;
                    r52 = this;
                    c4835.closed = true;
                    c4835.f12601.m8945();
                    abstractSelector3 = abstractSelector2;
                    r5 = r52;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        c4835.closed = true;
                        c4835.f12601.m8945();
                        C4835.m8956(abstractSelector, th);
                        c4835.closed = true;
                        c4835.f12601.m8945();
                        abstractSelector3 = abstractSelector;
                        r5 = this;
                    } catch (Throwable th4) {
                        c4835.closed = true;
                        c4835.f12601.m8945();
                        c4835.selectorRef = null;
                        C4835.m8956(abstractSelector, null);
                        throw th4;
                    }
                }
            }
            c4835.selectorRef = null;
            C4835.m8956(abstractSelector3, null);
            while (true) {
                InterfaceC4840 interfaceC4840 = (InterfaceC4840) c4835.f12601.m8943();
                if (interfaceC4840 == null) {
                    AbstractC3738.m6868(r5, null);
                    return C6008.f15084;
                }
                C4835.m8957(interfaceC4840, new ClosedSendChannelException("Failed to apply interest: selector closed"));
            }
        } finally {
        }
    }
}
