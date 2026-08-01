package androidx.compose.p001ui.adaptive;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.compose.runtime.C2153;
import androidx.compose.runtime.InterfaceC2195;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7387;
import p178.AbstractC8482;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/runtime/飘花落叶言子世楪苏哲兰;", "Landroidx/compose/runtime/飘花落叶言子楪兰哲苏世;", "invoke", "(Landroidx/compose/runtime/飘花落叶言子世楪苏哲兰;)Landroidx/compose/runtime/飘花落叶言子楪兰哲苏世;", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class MediaQuery_androidKt$obtainUiMediaScope$4$1 extends Lambda implements InterfaceC7387 {
    final /* synthetic */ Context $context;
    final /* synthetic */ AbstractC2234 $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaQuery_androidKt$obtainUiMediaScope$4$1(Context context, AbstractC2234 abstractC2234) {
        super(1);
        this.$context = context;
        this.$scope = abstractC2234;
    }

    @Override // p068.InterfaceC7387
    public final InterfaceC2195 invoke(C2153 c2153) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.DOCK_EVENT");
        Intent intentM13480 = AbstractC8482.m13480(this.$context, new C2235(), intentFilter, null, null, 2);
        if (intentM13480 != null) {
            intentM13480.getIntExtra("android.intent.extra.DOCK_STATE", 0);
        }
        Object obj = null;
        obj.getClass();
        throw null;
    }
}
