package p052;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.compose.material.ripple.RunnableC1945;
import com.google.android.material.textfield.ViewOnClickListenerC4015;
import io.ktor.client.plugins.AbstractC4765;
import p042.AbstractC7140;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子兰苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7185 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f17849 = AbstractC4765.m8874().concat("/Log/Crash/MainCrash.log");

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1945(this, 18));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "闪退日志保存在" + this.f17849 + " 点击可以复制并测试闪退 日志仅保留最新的一份";
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11806() {
        return new ViewOnClickListenerC4015(this, 14);
    }
}
