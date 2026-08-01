package androidx.compose.ui.adaptive;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.compose.runtime.C1318;
import androidx.compose.runtime.InterfaceC1360;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6557;
import p162.AbstractC7652;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/飘花落叶言子世楪苏哲兰;", "Landroidx/compose/runtime/飘花落叶言子楪兰哲苏世;", "invoke", "(Landroidx/compose/runtime/飘花落叶言子世楪苏哲兰;)Landroidx/compose/runtime/飘花落叶言子楪兰哲苏世;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class MediaQuery_androidKt$obtainUiMediaScope$4$1 extends Lambda implements InterfaceC6557 {
    final /* synthetic */ Context $context;
    final /* synthetic */ AbstractC1399 $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaQuery_androidKt$obtainUiMediaScope$4$1(Context context, AbstractC1399 abstractC1399) {
        super(1);
        this.$context = context;
        this.$scope = abstractC1399;
    }

    @Override // p052.InterfaceC6557
    public final InterfaceC1360 invoke(C1318 c1318) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.DOCK_EVENT");
        Intent intentM12892 = AbstractC7652.m12892(this.$context, new C1400(), intentFilter, null, null, 2);
        if (intentM12892 != null) {
            intentM12892.getIntExtra("android.intent.extra.DOCK_STATE", 0);
        }
        Object obj = null;
        obj.getClass();
        throw null;
    }
}
