package kotlinx.coroutines.channels;

import com.alibaba.fastjson2.C2942;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {41}, m = "consumeEach", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
final class ChannelsKt__DeprecatedKt$consumeEach$1<E> extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$consumeEach$1(InterfaceC4357<? super ChannelsKt__DeprecatedKt$consumeEach$1> interfaceC4357) {
        super(interfaceC4357);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            throw null;
        }
        if (i != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i2 = this.I$2;
        int i3 = this.I$1;
        int i4 = this.I$0;
        ?? r6 = (InterfaceC5212) this.L$5;
        InterfaceC5199 interfaceC5199 = (InterfaceC5199) this.L$3;
        if (this.L$2 != null) {
            C2942.m6394();
            return null;
        }
        InterfaceC6558 interfaceC6558 = (InterfaceC6558) this.L$1;
        if (this.L$0 != null) {
            C2942.m6394();
            return null;
        }
        try {
            AbstractC5185.m10210(obj);
            while (((Boolean) obj).booleanValue()) {
                r6 = (C5191) r6;
                interfaceC6558.invoke(r6.m10262());
                this.L$0 = null;
                this.L$1 = interfaceC6558;
                this.L$2 = null;
                this.L$3 = interfaceC5199;
                this.L$4 = null;
                this.L$5 = r6;
                this.I$0 = i4;
                this.I$1 = i3;
                this.I$2 = i2;
                this.label = 1;
                obj = r6.m10264(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            interfaceC5199.mo10256(null);
            return C5176.f14739;
        } catch (Throwable th) {
            interfaceC5199.mo10256(null);
            throw th;
        }
    }
}
