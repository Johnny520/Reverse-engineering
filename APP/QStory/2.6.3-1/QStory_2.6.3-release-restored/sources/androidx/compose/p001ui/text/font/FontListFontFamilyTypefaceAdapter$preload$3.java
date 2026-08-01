package androidx.compose.p001ui.text.font;

import androidx.collection.C1082;
import com.alibaba.fastjson2.C3775;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3", m556f = "FontListFontFamilyTypefaceAdapter.kt", m557l = {120}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class FontListFontFamilyTypefaceAdapter$preload$3 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ List<InterfaceC2829> $asyncLoads;
    final /* synthetic */ InterfaceC2818 $resourceLoader;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C2823 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontListFontFamilyTypefaceAdapter$preload$3(List<InterfaceC2829> list, C2823 c2823, InterfaceC2818 interfaceC2818, InterfaceC5189<? super FontListFontFamilyTypefaceAdapter$preload$3> interfaceC5189) {
        super(2, interfaceC5189);
        this.$asyncLoads = list;
        this.this$0 = c2823;
        this.$resourceLoader = interfaceC2818;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        FontListFontFamilyTypefaceAdapter$preload$3 fontListFontFamilyTypefaceAdapter$preload$3 = new FontListFontFamilyTypefaceAdapter$preload$3(this.$asyncLoads, this.this$0, this.$resourceLoader, interfaceC5189);
        fontListFontFamilyTypefaceAdapter$preload$3.L$0 = obj;
        return fontListFontFamilyTypefaceAdapter$preload$3;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((FontListFontFamilyTypefaceAdapter$preload$3) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
            List<InterfaceC2829> list = this.$asyncLoads;
            C1082 c1082 = new C1082(list.size());
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC2829 interfaceC2829 = list.get(i2);
                if (interfaceC2829 != null) {
                    C3775.m6954();
                    return null;
                }
                if (c1082.m1301(null)) {
                    arrayList.add(interfaceC2829);
                }
            }
            C2823 c2823 = this.this$0;
            InterfaceC2818 interfaceC2818 = this.$resourceLoader;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if (arrayList.get(i3) != null) {
                    C3775.m6954();
                    return null;
                }
                arrayList2.add(AbstractC6231.m11045(interfaceC6233, null, new FontListFontFamilyTypefaceAdapter$preload$3$2$1(c2823, null, interfaceC2818, null), 3));
            }
            this.label = 1;
            if (AbstractC6231.m11038(arrayList2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
