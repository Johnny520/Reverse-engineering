package androidx.compose.ui.adaptive;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.compose.C0008;
import androidx.compose.runtime.C1318;
import androidx.compose.runtime.InterfaceC1360;
import androidx.core.view.AbstractC2189;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2225;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/飘花落叶言子世楪苏哲兰;", "Landroidx/compose/runtime/飘花落叶言子楪兰哲苏世;", "invoke", "(Landroidx/compose/runtime/飘花落叶言子世楪苏哲兰;)Landroidx/compose/runtime/飘花落叶言子楪兰哲苏世;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class MediaQuery_androidKt$obtainUiMediaScope$3$1 extends Lambda implements InterfaceC6558 {
    final /* synthetic */ AbstractC1399 $scope;
    final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaQuery_androidKt$obtainUiMediaScope$3$1(View view, AbstractC1399 abstractC1399) {
        super(1);
        this.$view = view;
        this.$scope = abstractC1399;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(AbstractC1399 abstractC1399, View view) {
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        C2225 c2225M3993 = AbstractC2189.m3993(view);
        if (c2225M3993 != null) {
            c2225M3993.f6521.mo4045(8);
        }
        abstractC1399.getClass();
        throw null;
    }

    @Override // p052.InterfaceC6558
    public final InterfaceC1360 invoke(C1318 c1318) {
        final View view = this.$view;
        final AbstractC1399 abstractC1399 = null;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener(abstractC1399, view) { // from class: androidx.compose.ui.adaptive.飘花落叶言子楪世苏兰哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
            public final /* synthetic */ View f4057;

            {
                this.f4057 = view;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                MediaQuery_androidKt$obtainUiMediaScope$3$1.invoke$lambda$0(null, this.f4057);
            }
        };
        view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        return new C0008(this.$view, 7, onGlobalLayoutListener);
    }
}
