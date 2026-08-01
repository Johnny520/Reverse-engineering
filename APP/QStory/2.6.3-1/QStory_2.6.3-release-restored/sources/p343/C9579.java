package p343;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.RunnableC0946;
import com.bumptech.glide.AbstractC3888;
import com.davemorrissey.labs.subscaleview.C0328R;
import de.robv.android.xposed.XC_MethodHook;
import java.time.LocalDate;
import java.util.HashMap;
import p042.AbstractC7140;
import p042.InterfaceC7141;
import p060.C7290;
import p060.InterfaceC7283;
import p160.C8376;

/* JADX INFO: renamed from: 飘花落叶言苏世哲子兰楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C9579 extends AbstractC7140 implements InterfaceC7283 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final HashMap f25011 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f25012 = 0;

    @Override // p042.AbstractC7143
    public final boolean isLoadedByDefault() {
        LocalDate.now().getMonthValue();
        return false;
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        final int i = 0;
        m12389(Activity.class.getDeclaredMethod("onWindowFocusChanged", Boolean.TYPE), new InterfaceC7141(this) { // from class: 飘花落叶言苏世哲子兰楪.飘花落叶言子楪世苏哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C9579 f25013;

            {
                this.f25013 = this;
            }

            @Override // p042.InterfaceC7141
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                int i2 = i;
                C9579 c9579 = this.f25013;
                switch (i2) {
                    case 0:
                        HashMap map = C9579.f25011;
                        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0946(c9579, 27, methodHookParam), 50L);
                        break;
                    default:
                        HashMap map2 = C9579.f25011;
                        c9579.m15001((Activity) methodHookParam.thisObject, false);
                        break;
                }
            }
        });
        final int i2 = 1;
        m12390(Activity.class.getDeclaredMethod("onPause", null), new InterfaceC7141(this) { // from class: 飘花落叶言苏世哲子兰楪.飘花落叶言子楪世苏哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C9579 f25013;

            {
                this.f25013 = this;
            }

            @Override // p042.InterfaceC7141
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22 = i2;
                C9579 c9579 = this.f25013;
                switch (i22) {
                    case 0:
                        HashMap map = C9579.f25011;
                        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0946(c9579, 27, methodHookParam), 50L);
                        break;
                    default:
                        HashMap map2 = C9579.f25011;
                        c9579.m15001((Activity) methodHookParam.thisObject, false);
                        break;
                }
            }
        });
        m12390(Activity.class.getDeclaredMethod("onDestroy", null), new C8376(22));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "枯树终有回春日 故人难回那年秋";
    }

    @Override // p060.InterfaceC7283
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo12543(int i) {
        this.f25012 = i;
    }

    @Override // p060.InterfaceC7283
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo12544() {
        return this.f25012;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m15001(Activity activity, boolean z) {
        try {
            HashMap map = f25011;
            C7290 c7290 = (C7290) map.get(activity);
            if (c7290 == null) {
                c7290 = new C7290(this, C0328R.drawable.ic_maple_leaf);
                AbstractC3888.m7247(activity);
                map.put(activity, c7290);
            }
            if (z) {
                c7290.m12547(activity);
            } else {
                c7290.m12548();
            }
        } catch (Exception e) {
            getExceptionCollectionToolInstance().m12391(e);
        }
    }
}
