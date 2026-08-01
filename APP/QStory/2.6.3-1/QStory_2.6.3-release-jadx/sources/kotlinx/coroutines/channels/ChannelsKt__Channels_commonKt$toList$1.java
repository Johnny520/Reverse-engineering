package kotlinx.coroutines.channels;

import java.util.List;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p050.AbstractC7176;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", m556f = "Channels.common.kt", m557l = {277}, m558m = "toList", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
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

    public ChannelsKt__Channels_commonKt$toList$1(InterfaceC5189<? super ChannelsKt__Channels_commonKt$toList$1> interfaceC5189) {
        super(interfaceC5189);
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
        InterfaceC6031 interfaceC6031 = null;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            AbstractC7176.m12470();
            try {
                throw null;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i2 = this.I$3;
            int i3 = this.I$2;
            int i4 = this.I$1;
            int i5 = this.I$0;
            ?? r7 = (InterfaceC6044) this.L$7;
            InterfaceC6031 interfaceC60312 = (InterfaceC6031) this.L$5;
            ?? r9 = (List) this.L$2;
            List list = (List) this.L$1;
            try {
                AbstractC6017.m10769(obj);
                while (((Boolean) obj).booleanValue()) {
                    r7 = (C6023) r7;
                    r9.add(r7.m10821());
                    this.L$0 = null;
                    this.L$1 = list;
                    this.L$2 = r9;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = interfaceC60312;
                    this.L$6 = null;
                    this.L$7 = r7;
                    this.I$0 = i5;
                    this.I$1 = i4;
                    this.I$2 = i3;
                    this.I$3 = i2;
                    this.label = 1;
                    obj = r7.m10823(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                interfaceC60312.mo10815(null);
                list.getClass();
                return ((ListBuilder) list).build();
            } catch (Throwable th2) {
                th = th2;
                interfaceC6031 = interfaceC60312;
            }
        }
        try {
            throw th;
        } catch (Throwable th3) {
            AbstractC6037.m10837(interfaceC6031, th);
            throw th3;
        }
    }
}
