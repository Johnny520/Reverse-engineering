package kotlinx.coroutines;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.AwaitKt", m556f = "Await.kt", m557l = {47}, m558m = "joinAll", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final class AwaitKt$joinAll$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public AwaitKt$joinAll$1(InterfaceC5189<? super AwaitKt$joinAll$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC6284 interfaceC6284;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new AwaitKt$joinAll$1(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
            throw null;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.I$2;
        int i4 = this.I$1;
        int i5 = this.I$0;
        InterfaceC6284[] interfaceC6284Arr = (InterfaceC6284[]) this.L$1;
        AbstractC6017.m10769(obj2);
        do {
            i4++;
            if (i4 >= i3) {
                return C6008.f15084;
            }
            interfaceC6284 = interfaceC6284Arr[i4];
            this.L$0 = null;
            this.L$1 = interfaceC6284Arr;
            this.L$2 = null;
            this.L$3 = null;
            this.I$0 = i5;
            this.I$1 = i4;
            this.I$2 = i3;
            this.I$3 = 0;
            this.label = 1;
        } while (interfaceC6284.mo11123(this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
