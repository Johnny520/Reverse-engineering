package kotlinx.coroutines.channels;

import java.util.Map;
import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {667}, m = "toMap", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class ChannelsKt__DeprecatedKt$toMap$2<K, V, M extends Map<? super K, ? super V>> extends ContinuationImpl {
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

    public ChannelsKt__DeprecatedKt$toMap$2(InterfaceC4356<? super ChannelsKt__DeprecatedKt$toMap$2> interfaceC4356) {
        super(interfaceC4356);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new ChannelsKt__DeprecatedKt$toMap$2<>(this);
        }
        Object objM10260 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        InterfaceC5198 interfaceC5198 = null;
        if (i2 == 0) {
            AbstractC5184.m10206(objM10260);
            try {
                throw null;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i2 != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.I$2;
            int i4 = this.I$1;
            int i5 = this.I$0;
            ?? r6 = (InterfaceC5211) this.L$5;
            InterfaceC5198 interfaceC51982 = (InterfaceC5198) this.L$3;
            ?? r8 = (Map) this.L$1;
            try {
                AbstractC5184.m10206(objM10260);
                while (((Boolean) objM10260).booleanValue()) {
                    r6 = (C5190) r6;
                    Pair pair = (Pair) r6.m10258();
                    r8.put(pair.getFirst(), pair.getSecond());
                    this.L$0 = null;
                    this.L$1 = r8;
                    this.L$2 = null;
                    this.L$3 = interfaceC51982;
                    this.L$4 = null;
                    this.L$5 = r6;
                    this.I$0 = i5;
                    this.I$1 = i4;
                    this.I$2 = i3;
                    this.label = 1;
                    objM10260 = r6.m10260(this);
                    if (objM10260 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                interfaceC51982.mo10252(null);
                return r8;
            } catch (Throwable th2) {
                th = th2;
                interfaceC5198 = interfaceC51982;
            }
        }
        try {
            throw th;
        } catch (Throwable th3) {
            AbstractC5204.m10274(interfaceC5198, th);
            throw th3;
        }
    }
}
