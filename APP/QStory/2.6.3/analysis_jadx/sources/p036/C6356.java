package p036;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.compose.material.ripple.RunnableC1107;
import com.google.android.material.textfield.ViewOnClickListenerC3183;
import io.ktor.client.plugins.AbstractC3933;
import p026.AbstractC6311;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子兰苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6356 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f17504 = AbstractC3933.m8315().concat(AbstractC8405.m13972(75));

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1107(this, 18));
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(76) + this.f17504 + AbstractC8405.m13972(77);
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11247() {
        return new ViewOnClickListenerC3183(this, 14);
    }
}
