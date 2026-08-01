package io.ktor.client.plugins.websocket;

import com.alibaba.fastjson2.C2942;
import io.ktor.client.plugins.AbstractC3938;
import io.ktor.websocket.AbstractC4257;
import io.ktor.websocket.C4263;
import io.ktor.websocket.CloseReason$Codes;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;
import p251.AbstractC8175;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.websocket.BuildersKt", f = "builders.kt", l = {242, 245, 101, 103, 103, 264, 264}, m = "webSocket")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class BuildersKt$webSocket$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public BuildersKt$webSocket$1(InterfaceC4357<? super BuildersKt$webSocket$1> interfaceC4357) {
        super(interfaceC4357);
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
                        AbstractC5185.m10210(obj);
                        int i2 = AbstractC3909.f12120;
                        int i3 = AbstractC3938.f12153;
                        throw null;
                    case 1:
                        if (this.L$1 != null) {
                            C2942.m6394();
                            return null;
                        }
                        AbstractC5185.m10210(obj);
                        if (obj == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    case 2:
                        if (this.L$2 != null) {
                            C2942.m6394();
                            return null;
                        }
                        if (this.L$1 != null) {
                            C2942.m6394();
                            return null;
                        }
                        AbstractC5185.m10210(obj);
                        if (obj != null) {
                            throw new ClassCastException();
                        }
                        throw new NullPointerException("null cannot be cast to non-null type io.ktor.client.plugins.websocket.DefaultClientWebSocketSession");
                    case 3:
                        if (this.L$2 != null) {
                            C2942.m6394();
                            return null;
                        }
                        if (this.L$1 != null) {
                            C2942.m6394();
                            return null;
                        }
                        if (this.L$0 != null) {
                            C2942.m6394();
                            return null;
                        }
                        try {
                            AbstractC5185.m10210(obj);
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
                            if (AbstractC4257.m8714(null, new C4263(CloseReason$Codes.NORMAL, ""), this) != coroutineSingletons) {
                                throw null;
                            }
                        }
                        if (AbstractC4257.m8714(null, new C4263(CloseReason$Codes.NORMAL, ""), this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        throw null;
                    case 4:
                        if (this.L$2 != null) {
                            C2942.m6394();
                            return null;
                        }
                        if (this.L$1 != null) {
                            C2942.m6394();
                            return null;
                        }
                        if (this.L$0 != null) {
                            C2942.m6394();
                            return null;
                        }
                        AbstractC5185.m10210(obj);
                        throw null;
                    case 5:
                        if (this.L$2 != null) {
                            C2942.m6394();
                            return null;
                        }
                        if (this.L$1 != null) {
                            C2942.m6394();
                            return null;
                        }
                        if (this.L$0 != null) {
                            C2942.m6394();
                            return null;
                        }
                        AbstractC5185.m10210(obj);
                        throw null;
                    case 6:
                        AbstractC5185.m10210(obj);
                        return C5176.f14739;
                    case 7:
                        Throwable th2 = (Throwable) this.L$0;
                        AbstractC5185.m10210(obj);
                        throw th2;
                    default:
                        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
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
            throw AbstractC8175.m13625(e);
        }
    }
}
