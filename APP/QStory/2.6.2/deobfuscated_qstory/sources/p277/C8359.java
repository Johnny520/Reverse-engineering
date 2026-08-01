package p277;

import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN;
import kotlin.reflect.jvm.internal.types.AbstractC4921;

/* JADX INFO: renamed from: 飘花落叶言楪哲苏子世兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8359 extends AbstractC4921 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f23042;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8359(int i) {
        super(3);
        this.f23042 = i;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4921
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final int mo9909(boolean z) {
        switch (this.f23042) {
            case 0:
                return z ? R.layout.layout_dialogx_poptip_material : R.layout.layout_dialogx_poptip_material_dark;
            default:
                return z ? R.layout.layout_dialogx_poptip_material_you : R.layout.layout_dialogx_poptip_material_you_dark;
        }
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4921
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final DialogXStyle$PopTipSettings$ALIGN mo9910() {
        switch (this.f23042) {
        }
        return DialogXStyle$PopTipSettings$ALIGN.BOTTOM;
    }
}
