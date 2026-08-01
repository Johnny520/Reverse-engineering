package androidx.compose.foundation;

import androidx.compose.ui.platform.AbstractC1866;
import androidx.compose.ui.semantics.C1954;
import com.alibaba.fastjson2.C2942;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6543;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.ClickableKt$combinedClickable-f5TDLPQ$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/飘花落叶言子哲楪世苏兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/platform/飘花落叶言子哲楪世苏兰;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {2, 1, 0})
public final class ClickableKt$combinedClickablef5TDLPQ$$inlined$debugInspectorInfo$1 extends Lambda implements InterfaceC6558 {
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ boolean $hapticFeedbackEnabled$inlined;
    final /* synthetic */ InterfaceC6543 $onClick$inlined;
    final /* synthetic */ String $onClickLabel$inlined;
    final /* synthetic */ InterfaceC6543 $onDoubleClick$inlined;
    final /* synthetic */ InterfaceC6543 $onLongClick$inlined;
    final /* synthetic */ String $onLongClickLabel$inlined;
    final /* synthetic */ C1954 $role$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$combinedClickablef5TDLPQ$$inlined$debugInspectorInfo$1(boolean z, String str, C1954 c1954, InterfaceC6543 interfaceC6543, InterfaceC6543 interfaceC65432, InterfaceC6543 interfaceC65433, String str2, boolean z2) {
        super(1);
        this.$enabled$inlined = z;
        this.$onClickLabel$inlined = str;
        this.$role$inlined = c1954;
        this.$onClick$inlined = interfaceC6543;
        this.$onDoubleClick$inlined = interfaceC65432;
        this.$onLongClick$inlined = interfaceC65433;
        this.$onLongClickLabel$inlined = str2;
        this.$hapticFeedbackEnabled$inlined = z2;
    }

    @Override // p052.InterfaceC6558
    public /* synthetic */ Object invoke(Object obj) {
        if (obj == null) {
            invoke((AbstractC1866) null);
            return C5176.f14739;
        }
        C2942.m6394();
        return null;
    }

    public final void invoke(AbstractC1866 abstractC1866) {
        throw null;
    }
}
