package io.ktor.client.plugins.websocket.cio;

import com.alibaba.fastjson2.C3775;
import io.ktor.util.AbstractC5049;
import io.ktor.util.C5038;
import io.ktor.websocket.AbstractC5089;
import io.ktor.websocket.C5095;
import io.ktor.websocket.CloseReason$Codes;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p252.C8928;
import p252.C8930;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.websocket.cio.BuildersCioKt", m556f = "buildersCio.kt", m557l = {63, 71, 75, 73, 75, 75}, m558m = "webSocketRaw")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class BuildersCioKt$webSocketRaw$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public BuildersCioKt$webSocketRaw$1(InterfaceC5189<? super BuildersCioKt$webSocketRaw$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r3;
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        try {
            try {
            } catch (Throwable th) {
                this.L$0 = null;
                this.label = 4;
                Object objM9271 = AbstractC5089.m9271(null, th, this);
                r3 = this;
                if (objM9271 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            switch (i) {
                case 0:
                    AbstractC6017.m10769(obj);
                    this.L$0 = null;
                    this.label = 1;
                    new C8930();
                    C8928 c8928 = C8928.f22715;
                    new C5038();
                    AbstractC6231.m11046();
                    AbstractC5049.m9186(true);
                    throw null;
                case 1:
                    InterfaceC7383 interfaceC7383 = (InterfaceC7383) this.L$0;
                    AbstractC6017.m10769(obj);
                    if (obj != null) {
                        C3775.m6954();
                        return null;
                    }
                    this.L$0 = null;
                    this.label = 2;
                    if (interfaceC7383.invoke(null, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    this.L$0 = null;
                    this.label = 3;
                    this = AbstractC5089.m9273(null, new C5095(CloseReason$Codes.NORMAL, ""), this);
                    if (this == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return C6008.f15084;
                case 2:
                    if (this.L$0 != null) {
                        C3775.m6954();
                        return null;
                    }
                    AbstractC6017.m10769(obj);
                    this.L$0 = null;
                    this.label = 3;
                    this = AbstractC5089.m9273(null, new C5095(CloseReason$Codes.NORMAL, ""), this);
                    if (this == coroutineSingletons) {
                    }
                    return C6008.f15084;
                case 3:
                case 5:
                    AbstractC6017.m10769(obj);
                    return C6008.f15084;
                case 4:
                    if (this.L$0 != null) {
                        C3775.m6954();
                        return null;
                    }
                    AbstractC6017.m10769(obj);
                    this = this;
                    r3.L$0 = null;
                    r3.label = 5;
                    if (AbstractC5089.m9273(null, new C5095(CloseReason$Codes.NORMAL, ""), r3) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return C6008.f15084;
                case 6:
                    Throwable th2 = (Throwable) this.L$0;
                    AbstractC6017.m10769(obj);
                    throw th2;
                default:
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Throwable th3) {
            this.L$0 = th3;
            this.label = 6;
            if (AbstractC5089.m9273(null, new C5095(CloseReason$Codes.NORMAL, ""), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            throw th3;
        }
    }
}
