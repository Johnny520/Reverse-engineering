package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.C1610;
import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.ui.graphics.layer.GraphicsLayer", f = "AndroidGraphicsLayer.android.kt", l = {870}, m = "toImageBitmap", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class GraphicsLayer$toImageBitmap$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C1516 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphicsLayer$toImageBitmap$1(C1516 c1516, InterfaceC4356<? super GraphicsLayer$toImageBitmap$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c1516;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C1516 c1516 = this.this$0;
        c1516.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new GraphicsLayer$toImageBitmap$1(c1516, this);
        }
        Object objMo2796 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5184.m10206(objMo2796);
            InterfaceC1526 interfaceC1526 = C1516.f4349;
            this.label = 1;
            objMo2796 = interfaceC1526.mo2796(c1516, this);
            if (objMo2796 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(objMo2796);
        }
        return new C1610((Bitmap) objMo2796);
    }
}
