package kotlinx.coroutines.channels;

import java.util.List;
import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", l = {277}, m = "toList", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class ChannelsKt__Channels_commonKt$toList$1<E> extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__Channels_commonKt$toList$1(InterfaceC4356<? super ChannelsKt__Channels_commonKt$toList$1> interfaceC4356) {
        super(interfaceC4356);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        InterfaceC5198 interfaceC5198 = null;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            AbstractC8189.m13685();
            try {
                throw null;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i2 = this.I$3;
            int i3 = this.I$2;
            int i4 = this.I$1;
            int i5 = this.I$0;
            ?? r7 = (InterfaceC5211) this.L$7;
            InterfaceC5198 interfaceC51982 = (InterfaceC5198) this.L$5;
            ?? r9 = (List) this.L$2;
            List list = (List) this.L$1;
            try {
                AbstractC5184.m10206(obj);
                while (((Boolean) obj).booleanValue()) {
                    r7 = (C5190) r7;
                    r9.add(r7.m10258());
                    this.L$0 = null;
                    this.L$1 = list;
                    this.L$2 = r9;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = interfaceC51982;
                    this.L$6 = null;
                    this.L$7 = r7;
                    this.I$0 = i5;
                    this.I$1 = i4;
                    this.I$2 = i3;
                    this.I$3 = i2;
                    this.label = 1;
                    obj = r7.m10260(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                interfaceC51982.mo10252(null);
                list.getClass();
                return ((ListBuilder) list).build();
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
