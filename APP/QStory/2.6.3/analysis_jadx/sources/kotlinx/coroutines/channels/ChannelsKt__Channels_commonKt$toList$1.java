package kotlinx.coroutines.channels;

import java.util.List;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p034.AbstractC6347;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", l = {277}, m = "toList", v = 1)
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

    public ChannelsKt__Channels_commonKt$toList$1(InterfaceC4357<? super ChannelsKt__Channels_commonKt$toList$1> interfaceC4357) {
        super(interfaceC4357);
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
        InterfaceC5199 interfaceC5199 = null;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            AbstractC6347.m11911();
            try {
                throw null;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i2 = this.I$3;
            int i3 = this.I$2;
            int i4 = this.I$1;
            int i5 = this.I$0;
            ?? r7 = (InterfaceC5212) this.L$7;
            InterfaceC5199 interfaceC51992 = (InterfaceC5199) this.L$5;
            ?? r9 = (List) this.L$2;
            List list = (List) this.L$1;
            try {
                AbstractC5185.m10210(obj);
                while (((Boolean) obj).booleanValue()) {
                    r7 = (C5191) r7;
                    r9.add(r7.m10262());
                    this.L$0 = null;
                    this.L$1 = list;
                    this.L$2 = r9;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = interfaceC51992;
                    this.L$6 = null;
                    this.L$7 = r7;
                    this.I$0 = i5;
                    this.I$1 = i4;
                    this.I$2 = i3;
                    this.I$3 = i2;
                    this.label = 1;
                    obj = r7.m10264(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                interfaceC51992.mo10256(null);
                list.getClass();
                return ((ListBuilder) list).build();
            } catch (Throwable th2) {
                th = th2;
                interfaceC5199 = interfaceC51992;
            }
        }
        try {
            throw th;
        } catch (Throwable th3) {
            AbstractC5205.m10278(interfaceC5199, th);
            throw th3;
        }
    }
}
