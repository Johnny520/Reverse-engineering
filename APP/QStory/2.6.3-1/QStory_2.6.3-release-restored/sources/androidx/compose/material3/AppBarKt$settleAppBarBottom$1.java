package androidx.compose.material3;

import androidx.compose.animation.core.InterfaceC1195;
import com.alibaba.fastjson2.AbstractC3738;
import com.alibaba.fastjson2.C3775;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p079.InterfaceC7691;
import p221.C8731;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.AppBarKt", m556f = "AppBar.kt", m557l = {2424, 2440}, m558m = "settleAppBarBottom")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class AppBarKt$settleAppBarBottom$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public AppBarKt$settleAppBarBottom$1(InterfaceC5189<? super AppBarKt$settleAppBarBottom$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$FloatRef ref$FloatRef;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        int i2 = AbstractC2013.f3729;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new AppBarKt$settleAppBarBottom$1(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            AbstractC6017.m10769(obj2);
            throw null;
        }
        if (i3 == 1) {
            Ref$FloatRef ref$FloatRef2 = (Ref$FloatRef) this.L$2;
            InterfaceC1195 interfaceC1195 = (InterfaceC1195) this.L$1;
            if (this.L$0 != null) {
                C3775.m6954();
                return null;
            }
            AbstractC6017.m10769(obj2);
            if (interfaceC1195 != null) {
                throw null;
            }
            ref$FloatRef = ref$FloatRef2;
        } else {
            if (i3 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$FloatRef = (Ref$FloatRef) this.L$0;
            AbstractC6017.m10769(obj2);
        }
        return new C8731(AbstractC3738.m6871(0.0f, ref$FloatRef.element));
    }
}
