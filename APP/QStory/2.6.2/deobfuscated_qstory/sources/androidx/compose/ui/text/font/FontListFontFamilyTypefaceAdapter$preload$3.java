package androidx.compose.ui.text.font;

import androidx.collection.C0235;
import com.alibaba.fastjson2.C2941;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3", f = "FontListFontFamilyTypefaceAdapter.kt", l = {120}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class FontListFontFamilyTypefaceAdapter$preload$3 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ List<InterfaceC1995> $asyncLoads;
    final /* synthetic */ InterfaceC1984 $resourceLoader;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C1989 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontListFontFamilyTypefaceAdapter$preload$3(List<InterfaceC1995> list, C1989 c1989, InterfaceC1984 interfaceC1984, InterfaceC4356<? super FontListFontFamilyTypefaceAdapter$preload$3> interfaceC4356) {
        super(2, interfaceC4356);
        this.$asyncLoads = list;
        this.this$0 = c1989;
        this.$resourceLoader = interfaceC1984;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        FontListFontFamilyTypefaceAdapter$preload$3 fontListFontFamilyTypefaceAdapter$preload$3 = new FontListFontFamilyTypefaceAdapter$preload$3(this.$asyncLoads, this.this$0, this.$resourceLoader, interfaceC4356);
        fontListFontFamilyTypefaceAdapter$preload$3.L$0 = obj;
        return fontListFontFamilyTypefaceAdapter$preload$3;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((FontListFontFamilyTypefaceAdapter$preload$3) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC5400 interfaceC5400 = (InterfaceC5400) this.L$0;
            List<InterfaceC1995> list = this.$asyncLoads;
            C0235 c0235 = new C0235(list.size());
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC1995 interfaceC1995 = list.get(i2);
                if (interfaceC1995 != null) {
                    C2941.m6336();
                    return null;
                }
                if (c0235.m740(null)) {
                    arrayList.add(interfaceC1995);
                }
            }
            C1989 c1989 = this.this$0;
            InterfaceC1984 interfaceC1984 = this.$resourceLoader;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if (arrayList.get(i3) != null) {
                    C2941.m6336();
                    return null;
                }
                arrayList2.add(AbstractC5398.m10482(interfaceC5400, null, new FontListFontFamilyTypefaceAdapter$preload$3$2$1(c1989, null, interfaceC1984, null), 3));
            }
            this.label = 1;
            if (AbstractC5398.m10475(arrayList2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
