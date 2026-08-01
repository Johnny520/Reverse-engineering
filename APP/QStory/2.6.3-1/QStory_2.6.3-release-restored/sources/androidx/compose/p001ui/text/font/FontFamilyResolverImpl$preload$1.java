package androidx.compose.p001ui.text.font;

import com.alibaba.fastjson2.C3775;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.ui.text.font.FontFamilyResolverImpl", m556f = "FontFamilyResolver.kt", m557l = {43}, m558m = "preload", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class FontFamilyResolverImpl$preload$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C2828 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$preload$1(C2828 c2828, InterfaceC5189<? super FontFamilyResolverImpl$preload$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c2828;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C2828 c2828 = this.this$0;
        c2828.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new FontFamilyResolverImpl$preload$1(c2828, this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
            return C6008.f15084;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC2827 abstractC2827 = (AbstractC2827) this.L$0;
        AbstractC6017.m10769(obj2);
        abstractC2827.getClass();
        C3775.m6954();
        return null;
    }
}
