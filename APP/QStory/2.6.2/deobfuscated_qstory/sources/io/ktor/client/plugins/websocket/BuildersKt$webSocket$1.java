package io.ktor.client.plugins.websocket;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.alibaba.fastjson2.C2941;
import io.ktor.client.plugins.AbstractC3937;
import io.ktor.websocket.AbstractC4256;
import io.ktor.websocket.C4262;
import io.ktor.websocket.CloseReason$Codes;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.websocket.BuildersKt", f = "builders.kt", l = {242, 245, 101, 103, 103, 264, 264}, m = "webSocket")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class BuildersKt$webSocket$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public BuildersKt$webSocket$1(InterfaceC4356<? super BuildersKt$webSocket$1> interfaceC4356) {
        super(interfaceC4356);
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
                        AbstractC5184.m10206(obj);
                        int i2 = AbstractC3908.f12115;
                        int i3 = AbstractC3937.f12149;
                        throw null;
                    case 1:
                        if (this.L$1 != null) {
                            C2941.m6336();
                            return null;
                        }
                        AbstractC5184.m10206(obj);
                        if (obj == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    case 2:
                        if (this.L$2 != null) {
                            C2941.m6336();
                            return null;
                        }
                        if (this.L$1 != null) {
                            C2941.m6336();
                            return null;
                        }
                        AbstractC5184.m10206(obj);
                        if (obj != null) {
                            throw new ClassCastException();
                        }
                        throw new NullPointerException("null cannot be cast to non-null type io.ktor.client.plugins.websocket.DefaultClientWebSocketSession");
                    case 3:
                        if (this.L$2 != null) {
                            C2941.m6336();
                            return null;
                        }
                        if (this.L$1 != null) {
                            C2941.m6336();
                            return null;
                        }
                        if (this.L$0 != null) {
                            C2941.m6336();
                            return null;
                        }
                        try {
                            AbstractC5184.m10206(obj);
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
                            if (AbstractC4256.m8724(null, new C4262(CloseReason$Codes.NORMAL, ""), this) != coroutineSingletons) {
                                throw null;
                            }
                        }
                        if (AbstractC4256.m8724(null, new C4262(CloseReason$Codes.NORMAL, ""), this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        throw null;
                    case 4:
                        if (this.L$2 != null) {
                            C2941.m6336();
                            return null;
                        }
                        if (this.L$1 != null) {
                            C2941.m6336();
                            return null;
                        }
                        if (this.L$0 != null) {
                            C2941.m6336();
                            return null;
                        }
                        AbstractC5184.m10206(obj);
                        throw null;
                    case 5:
                        if (this.L$2 != null) {
                            C2941.m6336();
                            return null;
                        }
                        if (this.L$1 != null) {
                            C2941.m6336();
                            return null;
                        }
                        if (this.L$0 != null) {
                            C2941.m6336();
                            return null;
                        }
                        AbstractC5184.m10206(obj);
                        throw null;
                    case 6:
                        AbstractC5184.m10206(obj);
                        return C5175.f14739;
                    case 7:
                        Throwable th2 = (Throwable) this.L$0;
                        AbstractC5184.m10206(obj);
                        throw th2;
                    default:
                        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
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
            throw AbstractC0455.m1139(e);
        }
    }
}
