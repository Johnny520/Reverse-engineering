package p330;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.RunnableC0099;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import com.davemorrissey.labs.subscaleview.R;
import de.robv.android.xposed.XC_MethodHook;
import java.time.LocalDate;
import java.util.HashMap;
import p026.AbstractC6293;
import p026.InterfaceC6294;
import p044.C6460;
import p044.InterfaceC6453;
import p144.C7546;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪子兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C8794 extends AbstractC6293 implements InterfaceC6453 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final HashMap f24747 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f24748 = 0;

    @Override // p026.AbstractC6296
    public final boolean isLoadedByDefault() {
        LocalDate.now().getMonthValue();
        return false;
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        final int i = 0;
        m11802(Activity.class.getDeclaredMethod("onWindowFocusChanged", Boolean.TYPE), new InterfaceC6294(this) { // from class: 飘花落叶言苏世哲楪子兰.飘花落叶言子楪世苏哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8794 f24749;

            {
                this.f24749 = this;
            }

            @Override // p026.InterfaceC6294
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                int i2 = i;
                C8794 c8794 = this.f24749;
                switch (i2) {
                    case 0:
                        HashMap map = C8794.f24747;
                        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0099(c8794, 27, methodHookParam), 50L);
                        break;
                    default:
                        HashMap map2 = C8794.f24747;
                        c8794.m14447((Activity) methodHookParam.thisObject, false);
                        break;
                }
            }
        });
        final int i2 = 1;
        m11803(Activity.class.getDeclaredMethod("onPause", null), new InterfaceC6294(this) { // from class: 飘花落叶言苏世哲楪子兰.飘花落叶言子楪世苏哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8794 f24749;

            {
                this.f24749 = this;
            }

            @Override // p026.InterfaceC6294
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22 = i2;
                C8794 c8794 = this.f24749;
                switch (i22) {
                    case 0:
                        HashMap map = C8794.f24747;
                        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0099(c8794, 27, methodHookParam), 50L);
                        break;
                    default:
                        HashMap map2 = C8794.f24747;
                        c8794.m14447((Activity) methodHookParam.thisObject, false);
                        break;
                }
            }
        });
        m11803(Activity.class.getDeclaredMethod("onDestroy", null), new C7546(26));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u67af\u6811\u7ec8\u6709\u56de\u6625\u65e5 \u6545\u4eba\u96be\u56de\u90a3\u5e74\u79cb";
    }

    @Override // p044.InterfaceC6453
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo11941(int i) {
        this.f24748 = i;
    }

    @Override // p044.InterfaceC6453
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo11942() {
        return this.f24748;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m14447(Activity activity, boolean z) {
        try {
            HashMap map = f24747;
            C6460 c6460 = (C6460) map.get(activity);
            if (c6460 == null) {
                c6460 = new C6460(this, R.drawable.ic_maple_leaf);
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
