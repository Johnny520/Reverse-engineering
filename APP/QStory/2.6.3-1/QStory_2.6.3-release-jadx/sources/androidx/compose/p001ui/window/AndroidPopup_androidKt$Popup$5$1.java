package androidx.compose.p001ui.window;

import androidx.compose.p001ui.platform.C2742;
import androidx.compose.runtime.AbstractC2202;
import com.alibaba.fastjson2.C3775;
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
@InterfaceC7691(m555c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", m556f = "AndroidPopup.android.kt", m557l = {496}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class AndroidPopup_androidKt$Popup$5$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C2930 $popupLayout;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$5$1(C2930 c2930, InterfaceC5189<? super AndroidPopup_androidKt$Popup$5$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$popupLayout = c2930;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        AndroidPopup_androidKt$Popup$5$1 androidPopup_androidKt$Popup$5$1 = new AndroidPopup_androidKt$Popup$5$1(this.$popupLayout, interfaceC5189);
        androidPopup_androidKt$Popup$5$1.L$0 = obj;
        return androidPopup_androidKt$Popup$5$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((AndroidPopup_androidKt$Popup$5$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0044 -> B:16:0x0047). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC6233 interfaceC6233;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            interfaceC6233 = (InterfaceC6233) this.L$0;
            if (AbstractC6231.m11054(interfaceC6233)) {
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC6233 = (InterfaceC6233) this.L$0;
            AbstractC6017.m10769(obj);
            C2930 c2930 = this.$popupLayout;
            int[] iArr = c2930.f6552;
            if (c2930.isAttachedToWindow()) {
                int i2 = iArr[0];
                int i3 = iArr[1];
                c2930.f6562.getLocationOnScreen(iArr);
                if (i2 != iArr[0] || i3 != iArr[1]) {
                    c2930.m4404();
                }
            }
            if (AbstractC6231.m11054(interfaceC6233)) {
                C02231 c02231 = new InterfaceC7387() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1.1
                    @Override // p068.InterfaceC7387
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke(((Number) obj2).longValue());
                        return C6008.f15084;
                    }

                    public final void invoke(long j) {
                    }
                };
                this.L$0 = interfaceC6233;
                this.label = 1;
                if (getContext().get(C2742.f5967) != null) {
                    C3775.m6954();
                    return null;
                }
                if (AbstractC2202.m3052(getContext()).mo2865(c02231, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                C2930 c29302 = this.$popupLayout;
                int[] iArr2 = c29302.f6552;
                if (c29302.isAttachedToWindow()) {
                }
                if (AbstractC6231.m11054(interfaceC6233)) {
                    return C6008.f15084;
                }
            }
        }
    }
}
