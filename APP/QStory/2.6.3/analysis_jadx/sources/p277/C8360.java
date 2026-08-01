package p277;

import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN;
import io.ktor.client.plugins.AbstractC3933;

/* JADX INFO: renamed from: 飘花落叶言楪哲苏子世兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8360 extends AbstractC3933 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f23041;

    public /* synthetic */ C8360(int i) {
        this.f23041 = i;
    }

    @Override // io.ktor.client.plugins.AbstractC3933
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final DialogXStyle$PopTipSettings$ALIGN mo8323() {
        switch (this.f23041) {
        }
        return DialogXStyle$PopTipSettings$ALIGN.BOTTOM;
    }

    @Override // io.ktor.client.plugins.AbstractC3933
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final int mo8324(boolean z) {
        switch (this.f23041) {
            case 0:
                return z ? R.layout.layout_dialogx_poptip_material : R.layout.layout_dialogx_poptip_material_dark;
            default:
                return z ? R.layout.layout_dialogx_poptip_material_you : R.layout.layout_dialogx_poptip_material_you_dark;
        }
    }
}
