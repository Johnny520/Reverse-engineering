package androidx.compose.p001ui.adaptive;

import android.hardware.input.InputManager;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.C2153;
import androidx.compose.runtime.InterfaceC2195;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/runtime/飘花落叶言子世楪苏哲兰;", "Landroidx/compose/runtime/飘花落叶言子楪兰哲苏世;", "invoke", "(Landroidx/compose/runtime/飘花落叶言子世楪苏哲兰;)Landroidx/compose/runtime/飘花落叶言子楪兰哲苏世;", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class MediaQuery_androidKt$obtainUiMediaScope$2$1 extends Lambda implements InterfaceC7387 {
    final /* synthetic */ InputManager $inputManager;
    final /* synthetic */ AbstractC2234 $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaQuery_androidKt$obtainUiMediaScope$2$1(InputManager inputManager, AbstractC2234 abstractC2234) {
        super(1);
        this.$inputManager = inputManager;
        this.$scope = abstractC2234;
    }

    @Override // p068.InterfaceC7387
    public final InterfaceC2195 invoke(C2153 c2153) {
        InputManager inputManager = this.$inputManager;
        C2237 c2237 = new C2237(inputManager, null);
        inputManager.registerInputDeviceListener(c2237, new Handler(Looper.getMainLooper()));
        c2237.m3100();
        throw null;
    }
}
