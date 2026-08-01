package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import androidx.compose.ui.graphics.layer.C1521;
import androidx.compose.ui.node.InterfaceC1806;
import kotlin.C5176;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1845 extends View implements InterfaceC1806 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ int f5352 = 0;

    static {
        ViewLayer$Companion$getMatrix$1 viewLayer$Companion$getMatrix$1 = new InterfaceC6554() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$getMatrix$1
            @Override // p052.InterfaceC6554
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((View) obj, (Matrix) obj2);
                return C5176.f14739;
            }

            public final void invoke(View view, Matrix matrix) {
                matrix.set(view.getMatrix());
            }
        };
        new C1521(1);
    }
}
