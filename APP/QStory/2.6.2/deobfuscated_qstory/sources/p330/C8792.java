package p330;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.RunnableC0099;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import com.davemorrissey.labs.subscaleview.R;
import de.robv.android.xposed.XC_MethodHook;
import java.util.HashMap;
import p026.AbstractC6293;
import p026.InterfaceC6294;
import p044.C6460;
import p044.InterfaceC6453;
import p144.C7546;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪子兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C8792 extends AbstractC6293 implements InterfaceC6453 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final HashMap f24743 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f24744 = 0;

    @Override // p026.AbstractC6296
    public final boolean isLoadedByDefault() {
        return true;
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        final int i = 0;
        m11802(Activity.class.getDeclaredMethod("onWindowFocusChanged", Boolean.TYPE), new InterfaceC6294(this) { // from class: 飘花落叶言苏世哲楪子兰.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8792 f24745;

            {
                this.f24745 = this;
            }

            @Override // p026.InterfaceC6294
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                int i2 = i;
                C8792 c8792 = this.f24745;
                switch (i2) {
                    case 0:
                        HashMap map = C8792.f24743;
                        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0099(c8792, 28, methodHookParam), 50L);
                        break;
                    default:
                        HashMap map2 = C8792.f24743;
                        c8792.m14446((Activity) methodHookParam.thisObject, false);
                        break;
                }
            }
        });
        final int i2 = 1;
        m11803(Activity.class.getDeclaredMethod("onPause", null), new InterfaceC6294(this) { // from class: 飘花落叶言苏世哲楪子兰.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8792 f24745;

            {
                this.f24745 = this;
            }

            @Override // p026.InterfaceC6294
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22 = i2;
                C8792 c8792 = this.f24745;
                switch (i22) {
                    case 0:
                        HashMap map = C8792.f24743;
                        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0099(c8792, 28, methodHookParam), 50L);
                        break;
                    default:
                        HashMap map2 = C8792.f24743;
                        c8792.m14446((Activity) methodHookParam.thisObject, false);
                        break;
                }
            }
        });
        m11803(Activity.class.getDeclaredMethod("onDestroy", null), new C7546(27));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u60f3\u8981\u7559\u4f4f\u96ea\u82b1 \u53ef\u5728\u638c\u5fc3\u91cc \u53ea\u4f1a\u5316\u7684\u66f4\u5feb";
    }

    @Override // p044.InterfaceC6453
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo11941(int i) {
        this.f24744 = i;
    }

    @Override // p044.InterfaceC6453
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo11942() {
        return this.f24744;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m14446(Activity activity, boolean z) {
        try {
            HashMap map = f24743;
            C6460 c6460 = (C6460) map.get(activity);
            if (c6460 == null) {
                c6460 = new C6460(this, R.drawable.snowflakes);
                AbstractC3065.m6858(activity);
                map.put(activity, c6460);
            }
            if (z) {
                c6460.m11945(activity);
            } else {
                c6460.m11946();
            }
        } catch (Exception e) {
            getExceptionCollectionToolInstance().m11804(e);
        }
    }
}
