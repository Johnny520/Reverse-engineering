package io.ktor.client.plugins.websocket;

import com.alibaba.fastjson2.C3775;
import io.ktor.client.plugins.AbstractC4770;
import io.ktor.websocket.AbstractC5089;
import io.ktor.websocket.C5095;
import io.ktor.websocket.CloseReason$Codes;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;
import p267.AbstractC9004;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.websocket.BuildersKt", m556f = "builders.kt", m557l = {242, 245, 101, 103, 103, 264, 264}, m558m = "webSocket")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class BuildersKt$webSocket$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public BuildersKt$webSocket$1(InterfaceC5189<? super BuildersKt$webSocket$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        try {
            try {
                switch (i) {
                    case 0:
                        AbstractC6017.m10769(obj);
                        int i2 = AbstractC4741.f12465;
                        int i3 = AbstractC4770.f12498;
                        throw null;
                    case 1:
                        if (this.L$1 != null) {
                            C3775.m6954();
                            return null;
                        }
                        AbstractC6017.m10769(obj);
                        if (obj == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    case 2:
                        if (this.L$2 != null) {
                            C3775.m6954();
                            return null;
                        }
                        if (this.L$1 != null) {
                            C3775.m6954();
                            return null;
                        }
                        AbstractC6017.m10769(obj);
                        if (obj != null) {
                            throw new ClassCastException();
                        }
                        throw new NullPointerException("null cannot be cast to non-null type io.ktor.client.plugins.websocket.DefaultClientWebSocketSession");
                    case 3:
                        if (this.L$2 != null) {
                            C3775.m6954();
                            return null;
                        }
                        if (this.L$1 != null) {
                            C3775.m6954();
                            return null;
                        }
                        if (this.L$0 != null) {
                            C3775.m6954();
                            return null;
                        }
                        try {
                            AbstractC6017.m10769(obj);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 4;
                        } catch (Throwable th) {
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = th;
                            this.label = 5;
                            if (AbstractC5089.m9273(null, new C5095(CloseReason$Codes.NORMAL, ""), this) != coroutineSingletons) {
                                throw null;
                            }
                        }
                        if (AbstractC5089.m9273(null, new C5095(CloseReason$Codes.NORMAL, ""), this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        throw null;
                    case 4:
                        if (this.L$2 != null) {
                            C3775.m6954();
                            return null;
                        }
                        if (this.L$1 != null) {
                            C3775.m6954();
                            return null;
                        }
                        if (this.L$0 != null) {
                            C3775.m6954();
                            return null;
                        }
                        AbstractC6017.m10769(obj);
                        throw null;
                    case 5:
                        if (this.L$2 != null) {
                            C3775.m6954();
                            return null;
                        }
                        if (this.L$1 != null) {
                            C3775.m6954();
                            return null;
                        }
                        if (this.L$0 != null) {
                            C3775.m6954();
                            return null;
                        }
                        AbstractC6017.m10769(obj);
                        throw null;
                    case 6:
                        AbstractC6017.m10769(obj);
                        return C6008.f15084;
                    case 7:
                        Throwable th2 = (Throwable) this.L$0;
                        AbstractC6017.m10769(obj);
                        throw th2;
                    default:
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            } catch (Throwable th3) {
                this.L$0 = th3;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 7;
                throw null;
            }
        } catch (CancellationException e) {
            throw AbstractC9004.m14184(e);
        }
    }
}
