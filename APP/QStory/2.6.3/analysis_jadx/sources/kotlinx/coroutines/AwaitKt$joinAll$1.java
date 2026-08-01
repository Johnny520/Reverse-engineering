package kotlinx.coroutines;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {47}, m = "joinAll", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
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

    public AwaitKt$joinAll$1(InterfaceC4357<? super AwaitKt$joinAll$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5452 interfaceC5452;
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
            AbstractC5185.m10210(obj2);
            throw null;
        }
        if (i2 != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.I$2;
        int i4 = this.I$1;
        int i5 = this.I$0;
        InterfaceC5452[] interfaceC5452Arr = (InterfaceC5452[]) this.L$1;
        AbstractC5185.m10210(obj2);
        do {
            i4++;
            if (i4 >= i3) {
                return C5176.f14739;
            }
            interfaceC5452 = interfaceC5452Arr[i4];
            this.L$0 = null;
            this.L$1 = interfaceC5452Arr;
            this.L$2 = null;
            this.L$3 = null;
            this.I$0 = i5;
            this.I$1 = i4;
            this.I$2 = i3;
            this.I$3 = 0;
            this.label = 1;
        } while (interfaceC5452.mo10564(this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
