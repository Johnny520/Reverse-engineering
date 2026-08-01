package androidx.compose.material3;

import androidx.compose.animation.core.InterfaceC0349;
import com.alibaba.fastjson2.AbstractC2905;
import com.alibaba.fastjson2.C2942;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p063.InterfaceC6862;
import p205.C7902;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.AppBarKt", f = "AppBar.kt", l = {3464, 3480}, m = "settleAppBar")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class AppBarKt$settleAppBar$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public AppBarKt$settleAppBar$1(InterfaceC4357<? super AppBarKt$settleAppBar$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$FloatRef ref$FloatRef;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        int i2 = AbstractC1178.f3384;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new AppBarKt$settleAppBar$1(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            AbstractC5185.m10210(obj2);
            throw null;
        }
        if (i3 == 1) {
            Ref$FloatRef ref$FloatRef2 = (Ref$FloatRef) this.L$2;
            InterfaceC0349 interfaceC0349 = (InterfaceC0349) this.L$1;
            if (this.L$0 != null) {
                C2942.m6394();
                return null;
            }
            AbstractC5185.m10210(obj2);
            if (interfaceC0349 != null) {
                throw null;
            }
            ref$FloatRef = ref$FloatRef2;
        } else {
            if (i3 != 2) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$FloatRef = (Ref$FloatRef) this.L$0;
            AbstractC5185.m10210(obj2);
        }
        return new C7902(AbstractC2905.m6311(0.0f, ref$FloatRef.element));
    }
}
