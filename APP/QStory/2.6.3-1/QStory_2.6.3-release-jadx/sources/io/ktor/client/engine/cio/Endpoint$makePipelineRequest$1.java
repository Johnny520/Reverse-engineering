package io.ktor.client.engine.cio;

import androidx.activity.AbstractC0900;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.engine.cio.Endpoint", m556f = "Endpoint.kt", m557l = {85, 92}, m558m = "makePipelineRequest")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class Endpoint$makePipelineRequest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4703 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Endpoint$makePipelineRequest$1(C4703 c4703, InterfaceC5189<? super Endpoint$makePipelineRequest$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c4703;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        throw null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C4703 c4703 = this.this$0;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C4703.f12435;
        c4703.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new Endpoint$makePipelineRequest$1(c4703, this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
            throw null;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC6017.m10769(obj2);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC0900.m697(this.L$1);
        C4703 c47032 = (C4703) this.L$0;
        AbstractC6017.m10769(obj2);
        c47032.getClass();
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        throw null;
    }
}
