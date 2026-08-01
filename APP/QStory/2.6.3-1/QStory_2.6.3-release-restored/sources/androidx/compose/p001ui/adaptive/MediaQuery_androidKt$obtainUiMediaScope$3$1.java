package androidx.compose.p001ui.adaptive;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.compose.C0855;
import androidx.compose.runtime.C2153;
import androidx.compose.runtime.InterfaceC2195;
import androidx.core.view.AbstractC3022;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3058;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/runtime/飘花落叶言子世楪苏哲兰;", "Landroidx/compose/runtime/飘花落叶言子楪兰哲苏世;", "invoke", "(Landroidx/compose/runtime/飘花落叶言子世楪苏哲兰;)Landroidx/compose/runtime/飘花落叶言子楪兰哲苏世;", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class MediaQuery_androidKt$obtainUiMediaScope$3$1 extends Lambda implements InterfaceC7387 {
    final /* synthetic */ AbstractC2234 $scope;
    final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaQuery_androidKt$obtainUiMediaScope$3$1(View view, AbstractC2234 abstractC2234) {
        super(1);
        this.$view = view;
        this.$scope = abstractC2234;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(AbstractC2234 abstractC2234, View view) {
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        C3058 c3058M4553 = AbstractC3022.m4553(view);
        if (c3058M4553 != null) {
            c3058M4553.f6866.mo4605(8);
        }
        abstractC2234.getClass();
        throw null;
    }

    @Override // p068.InterfaceC7387
    public final InterfaceC2195 invoke(C2153 c2153) {
        final View view = this.$view;
        final AbstractC2234 abstractC2234 = null;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener(abstractC2234, view) { // from class: androidx.compose.ui.adaptive.飘花落叶言子楪世苏兰哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
            public final /* synthetic */ View f4402;

            {
                this.f4402 = view;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                MediaQuery_androidKt$obtainUiMediaScope$3$1.invoke$lambda$0(null, this.f4402);
            }
        };
        view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        return new C0855(this.$view, 7, onGlobalLayoutListener);
    }
}
