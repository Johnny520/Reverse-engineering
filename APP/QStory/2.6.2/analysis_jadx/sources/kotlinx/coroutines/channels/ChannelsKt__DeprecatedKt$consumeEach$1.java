package kotlinx.coroutines.channels;

import com.alibaba.fastjson2.C2941;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {41}, m = "consumeEach", v = 1)
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

    public ChannelsKt__DeprecatedKt$consumeEach$1(InterfaceC4356<? super ChannelsKt__DeprecatedKt$consumeEach$1> interfaceC4356) {
        super(interfaceC4356);
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
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i != 1) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i2 = this.I$2;
        int i3 = this.I$1;
        int i4 = this.I$0;
        ?? r6 = (InterfaceC5211) this.L$5;
        InterfaceC5198 interfaceC5198 = (InterfaceC5198) this.L$3;
        if (this.L$2 != null) {
            C2941.m6336();
            return null;
        }
        InterfaceC6557 interfaceC6557 = (InterfaceC6557) this.L$1;
        if (this.L$0 != null) {
            C2941.m6336();
            return null;
        }
        try {
            AbstractC5184.m10206(obj);
            while (((Boolean) obj).booleanValue()) {
                r6 = (C5190) r6;
                interfaceC6557.invoke(r6.m10258());
                this.L$0 = null;
                this.L$1 = interfaceC6557;
                this.L$2 = null;
                this.L$3 = interfaceC5198;
                this.L$4 = null;
                this.L$5 = r6;
                this.I$0 = i4;
                this.I$1 = i3;
                this.I$2 = i2;
                this.label = 1;
                obj = r6.m10260(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            interfaceC5198.mo10252(null);
            return C5175.f14739;
        } catch (Throwable th) {
            interfaceC5198.mo10252(null);
            throw th;
        }
    }
}
