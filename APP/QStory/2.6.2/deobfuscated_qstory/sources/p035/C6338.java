package p035;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.compose.material.ripple.RunnableC1107;
import com.bumptech.glide.AbstractC3056;
import com.google.android.material.textfield.ViewOnClickListenerC3182;
import io.ktor.client.plugins.AbstractC3932;
import p026.AbstractC6293;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子兰苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6338 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f17457 = AbstractC3932.m8313().concat("/Log/Crash/MainCrash.log");

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1107(this, 18));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u95ea\u9000\u65e5\u5fd7\u4fdd\u5b58\u5728" + this.f17457 + " \u70b9\u51fb\u53ef\u4ee5\u590d\u5236\u5e76\u6d4b\u8bd5\u95ea\u9000 \u65e5\u5fd7\u4ec5\u4fdd\u7559\u6700\u65b0\u7684\u4e00\u4efd";
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11193() {
        return new ViewOnClickListenerC3182(this, 13);
    }
}
