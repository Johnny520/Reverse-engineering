package top.yukonga.miuix.kmp.basic;

import androidx.compose.animation.core.C1177;
import androidx.compose.p001ui.focus.C2303;
import androidx.compose.p001ui.focus.InterfaceC2320;
import androidx.compose.runtime.InterfaceC2168;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.SearchBarKt$InputField$5$1", m556f = "SearchBar.kt", m557l = {297, 299, 301}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class SearchBarKt$InputField$5$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC2168 $currentOnQueryChange$delegate;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ InterfaceC2320 $focusManager;
    final /* synthetic */ C2303 $focusRequester;
    final /* synthetic */ boolean $focused;
    final /* synthetic */ String $query;
    final /* synthetic */ C1177 $textAlpha;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarKt$InputField$5$1(boolean z, C2303 c2303, boolean z2, String str, C1177 c1177, InterfaceC2320 interfaceC2320, InterfaceC2168 interfaceC2168, InterfaceC5189<? super SearchBarKt$InputField$5$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$expanded = z;
        this.$focusRequester = c2303;
        this.$focused = z2;
        this.$query = str;
        this.$textAlpha = c1177;
        this.$focusManager = interfaceC2320;
        this.$currentOnQueryChange$delegate = interfaceC2168;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new SearchBarKt$InputField$5$1(this.$expanded, this.$focusRequester, this.$focused, this.$query, this.$textAlpha, this.$focusManager, this.$currentOnQueryChange$delegate, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SearchBarKt$InputField$5$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        if (r11.m1591(r12, r9) != r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SearchBarKt$InputField$5$1 searchBarKt$InputField$5$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            if (this.$expanded) {
                C2303.m3192(this.$focusRequester);
            } else if (this.$focused) {
                this.label = 1;
                if (AbstractC6231.m11058(100L, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return C6008.f15084;
        }
        if (i == 1) {
            AbstractC6017.m10769(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
                searchBarKt$InputField$5$1 = this;
                InterfaceC2320.m3215(searchBarKt$InputField$5$1.$focusManager);
                return C6008.f15084;
            }
            AbstractC6017.m10769(obj);
            searchBarKt$InputField$5$1 = this;
            ((InterfaceC7387) searchBarKt$InputField$5$1.$currentOnQueryChange$delegate.getValue()).invoke("");
            C1177 c1177 = searchBarKt$InputField$5$1.$textAlpha;
            Float f = new Float(1.0f);
            searchBarKt$InputField$5$1.label = 3;
        }
        if (this.$query.length() > 0) {
            C1177 c11772 = this.$textAlpha;
            Float f2 = new Float(0.0f);
            this.label = 2;
            searchBarKt$InputField$5$1 = this;
            if (C1177.m1589(c11772, f2, null, null, null, searchBarKt$InputField$5$1, 14) != coroutineSingletons) {
                ((InterfaceC7387) searchBarKt$InputField$5$1.$currentOnQueryChange$delegate.getValue()).invoke("");
                C1177 c11773 = searchBarKt$InputField$5$1.$textAlpha;
                Float f3 = new Float(1.0f);
                searchBarKt$InputField$5$1.label = 3;
            }
            return coroutineSingletons;
        }
        searchBarKt$InputField$5$1 = this;
        InterfaceC2320.m3215(searchBarKt$InputField$5$1.$focusManager);
        return C6008.f15084;
    }
}
