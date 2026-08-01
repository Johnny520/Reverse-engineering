package androidx.compose.p001ui.platform;

import android.graphics.Matrix;
import android.view.View;
import androidx.compose.p001ui.graphics.layer.C2356;
import androidx.compose.p001ui.node.InterfaceC2641;
import kotlin.C6008;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2680 extends View implements InterfaceC2641 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ int f5697 = 0;

    static {
        ViewLayer$Companion$getMatrix$1 viewLayer$Companion$getMatrix$1 = new InterfaceC7383() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$getMatrix$1
            @Override // p068.InterfaceC7383
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((View) obj, (Matrix) obj2);
                return C6008.f15084;
            }

            public final void invoke(View view, Matrix matrix) {
                matrix.set(view.getMatrix());
            }
        };
        new C2356(1);
    }
}
