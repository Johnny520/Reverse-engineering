package p277;

import com.bumptech.glide.AbstractC3065;
import com.bumptech.glide.AbstractC3066;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.client.plugins.AbstractC3933;
import kotlin.reflect.jvm.internal.AbstractC5062;
import kotlin.reflect.jvm.internal.types.AbstractC4922;

/* JADX INFO: renamed from: 飘花落叶言楪哲苏子世兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8358 extends AbstractC4922 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f23039;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8358(int i) {
        super(3);
        this.f23039 = i;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4922
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final AbstractC3933 mo9894() {
        switch (this.f23039) {
            case 0:
                return new C8360(0);
            default:
                return new C8360(1);
        }
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4922
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final int mo9895(boolean z) {
        switch (this.f23039) {
            case 0:
                return z ? R.layout.layout_dialogx_material : R.layout.layout_dialogx_material_dark;
            default:
                return z ? R.layout.layout_dialogx_material_you : R.layout.layout_dialogx_material_you_dark;
        }
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4922
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final int[] mo9899() {
        switch (this.f23039) {
        }
        return new int[]{3, 4, 2, 1};
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4922
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final AbstractC5062 mo9900() {
        switch (this.f23039) {
            case 0:
                return new C8359(0);
            default:
                return new C8359(1);
        }
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4922
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final AbstractC3065 mo9901() {
        switch (this.f23039) {
            case 0:
                return new C8361(0);
            default:
                return new C8361(1);
        }
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4922
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final AbstractC3066 mo9902() {
        switch (this.f23039) {
            case 0:
                return new C8362(0);
            default:
                return new C8362(1);
        }
    }
}
