package p327;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.RunnableC0099;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import de.robv.android.xposed.XC_MethodHook;
import java.util.HashMap;
import p026.AbstractC6311;
import p026.InterfaceC6312;
import p044.C6461;
import p044.InterfaceC6454;
import p144.C7547;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏世哲子兰楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C8748 extends AbstractC6311 implements InterfaceC6454 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final HashMap f24662 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f24663 = 0;

    @Override // p026.AbstractC6314
    public final boolean isLoadedByDefault() {
        return true;
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        final int i = 0;
        m11830(Activity.class.getDeclaredMethod(AbstractC8405.m13972(1153), Boolean.TYPE), new InterfaceC6312(this) { // from class: 飘花落叶言苏世哲子兰楪.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8748 f24664;

            {
                this.f24664 = this;
            }

            @Override // p026.InterfaceC6312
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                int i2 = i;
                C8748 c8748 = this.f24664;
                switch (i2) {
                    case 0:
                        HashMap map = C8748.f24662;
                        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0099(c8748, 28, methodHookParam), 50L);
                        break;
                    default:
                        HashMap map2 = C8748.f24662;
                        c8748.m14441((Activity) methodHookParam.thisObject, false);
                        break;
                }
            }
        });
        final int i2 = 1;
        m11831(Activity.class.getDeclaredMethod(AbstractC8405.m13973("喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵呜喵呜喵呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜喵喵"), null), new InterfaceC6312(this) { // from class: 飘花落叶言苏世哲子兰楪.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8748 f24664;

            {
                this.f24664 = this;
            }

            @Override // p026.InterfaceC6312
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22 = i2;
                C8748 c8748 = this.f24664;
                switch (i22) {
                    case 0:
                        HashMap map = C8748.f24662;
                        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0099(c8748, 28, methodHookParam), 50L);
                        break;
                    default:
                        HashMap map2 = C8748.f24662;
                        c8748.m14441((Activity) methodHookParam.thisObject, false);
                        break;
                }
            }
        });
        m11831(Activity.class.getDeclaredMethod(AbstractC8405.m13972(350), null), new C7547(23));
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1154);
    }

    @Override // p044.InterfaceC6454
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo11984(int i) {
        this.f24663 = i;
    }

    @Override // p044.InterfaceC6454
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo11985() {
        return this.f24663;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m14441(Activity activity, boolean z) {
        try {
            HashMap map = f24662;
            C6461 c6461 = (C6461) map.get(activity);
            if (c6461 == null) {
                c6461 = new C6461(this, R.drawable.snowflakes);
                AbstractC3056.m6687(activity);
                map.put(activity, c6461);
            }
            if (z) {
                c6461.m11988(activity);
            } else {
                c6461.m11989();
            }
        } catch (Exception e) {
            getExceptionCollectionToolInstance().m11832(e);
        }
    }
}
