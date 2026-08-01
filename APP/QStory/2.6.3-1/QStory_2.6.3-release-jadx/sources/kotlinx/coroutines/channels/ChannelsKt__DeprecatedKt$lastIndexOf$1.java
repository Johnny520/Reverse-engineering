package kotlinx.coroutines.channels;

import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$IntRef;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m556f = "Deprecated.kt", m557l = {667}, m558m = "lastIndexOf", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final class ChannelsKt__DeprecatedKt$lastIndexOf$1<E> extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
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

    public ChannelsKt__DeprecatedKt$lastIndexOf$1(InterfaceC5189<? super ChannelsKt__DeprecatedKt$lastIndexOf$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new ChannelsKt__DeprecatedKt$lastIndexOf$1<>(this);
        }
        Object objM10823 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        InterfaceC6031 interfaceC6031 = null;
        if (i2 == 0) {
            AbstractC6017.m10769(objM10823);
            new Ref$IntRef().element = -1;
            new Ref$IntRef();
            try {
                throw null;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.I$2;
            int i4 = this.I$1;
            int i5 = this.I$0;
            ?? r6 = (InterfaceC6044) this.L$7;
            InterfaceC6031 interfaceC60312 = (InterfaceC6031) this.L$5;
            Ref$IntRef ref$IntRef = (Ref$IntRef) this.L$3;
            Ref$IntRef ref$IntRef2 = (Ref$IntRef) this.L$2;
            Object obj2 = this.L$1;
            try {
                AbstractC6017.m10769(objM10823);
                while (((Boolean) objM10823).booleanValue()) {
                    r6 = (C6023) r6;
                    if (AbstractC5227.m9466(obj2, r6.m10821())) {
                        ref$IntRef2.element = ref$IntRef.element;
                    }
                    ref$IntRef.element++;
                    this.L$0 = null;
                    this.L$1 = obj2;
                    this.L$2 = ref$IntRef2;
                    this.L$3 = ref$IntRef;
                    this.L$4 = null;
                    this.L$5 = interfaceC60312;
                    this.L$6 = null;
                    this.L$7 = r6;
                    this.I$0 = i5;
                    this.I$1 = i4;
                    this.I$2 = i3;
                    this.label = 1;
                    objM10823 = r6.m10823(this);
                    if (objM10823 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                interfaceC60312.mo10815(null);
                return new Integer(ref$IntRef2.element);
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
