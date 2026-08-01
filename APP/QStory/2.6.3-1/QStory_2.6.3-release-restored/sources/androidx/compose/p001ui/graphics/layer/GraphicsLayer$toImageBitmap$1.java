package androidx.compose.p001ui.graphics.layer;

import android.graphics.Bitmap;
import androidx.compose.p001ui.graphics.C2445;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.ui.graphics.layer.GraphicsLayer", m556f = "AndroidGraphicsLayer.android.kt", m557l = {870}, m558m = "toImageBitmap", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class GraphicsLayer$toImageBitmap$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C2351 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphicsLayer$toImageBitmap$1(C2351 c2351, InterfaceC5189<? super GraphicsLayer$toImageBitmap$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c2351;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C2351 c2351 = this.this$0;
        c2351.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new GraphicsLayer$toImageBitmap$1(c2351, this);
        }
        Object objMo3366 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objMo3366);
            InterfaceC2361 interfaceC2361 = C2351.f4695;
            this.label = 1;
            objMo3366 = interfaceC2361.mo3366(c2351, this);
            if (objMo3366 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(objMo3366);
        }
        return new C2445((Bitmap) objMo3366);
    }
}
