package androidx.compose.material3;

import androidx.compose.animation.core.InterfaceC0349;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.alibaba.fastjson2.C2941;
import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p063.InterfaceC6861;
import p205.C7901;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.material3.AppBarKt", f = "AppBar.kt", l = {2424, 2440}, m = "settleAppBarBottom")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class AppBarKt$settleAppBarBottom$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public AppBarKt$settleAppBarBottom$1(InterfaceC4356<? super AppBarKt$settleAppBarBottom$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$FloatRef ref$FloatRef;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        int i2 = AbstractC1178.f3383;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new AppBarKt$settleAppBarBottom$1(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            AbstractC5184.m10206(obj2);
            throw null;
        }
        if (i3 == 1) {
            Ref$FloatRef ref$FloatRef2 = (Ref$FloatRef) this.L$2;
            InterfaceC0349 interfaceC0349 = (InterfaceC0349) this.L$1;
            if (this.L$0 != null) {
                C2941.m6336();
                return null;
            }
            AbstractC5184.m10206(obj2);
            if (interfaceC0349 != null) {
                throw null;
            }
            ref$FloatRef = ref$FloatRef2;
        } else {
            if (i3 != 2) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$FloatRef = (Ref$FloatRef) this.L$0;
            AbstractC5184.m10206(obj2);
        }
        return new C7901(AbstractC0455.m1149(0.0f, ref$FloatRef.element));
    }
}
