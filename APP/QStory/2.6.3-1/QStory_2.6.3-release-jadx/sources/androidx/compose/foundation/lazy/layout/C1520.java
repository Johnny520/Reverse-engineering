package androidx.compose.foundation.lazy.layout;

import android.animation.Animator;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.compose.runtime.InterfaceC2177;
import androidx.core.os.InterfaceC3003;
import androidx.core.view.C3058;
import androidx.core.view.InterfaceC3038;
import androidx.fragment.app.AbstractC3146;
import androidx.fragment.app.C3190;
import androidx.fragment.app.RunnableC3179;
import com.kongzue.dialogx.util.views.C4585;
import com.kongzue.dialogx.util.views.C4586;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.util.ArrayList;
import kotlin.text.AbstractC5976;
import lin.xposed.hook.util.p011qq.CreateElement;
import lin.xposed.hook.util.p011qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.p011qq.QQSessionUtils;
import org.apache.commons.p014io.filefilter.AgeFileFilter;
import org.apache.commons.p014io.filefilter.EmptyFileFilter;
import org.apache.commons.p014io.filefilter.HiddenFileFilter;
import org.apache.commons.p014io.filefilter.SizeFileFilter;
import p026.AbstractC7014;
import p042.InterfaceC7141;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p055.C7223;
import p233.AbstractC8798;
import p233.InterfaceC8793;
import p273.C9069;
import p303.AbstractC9234;
import p337.C9517;
import p337.C9523;
import p337.C9525;
import p339.C9555;
import p339.RunnableC9541;
import p374.InterfaceC9734;
import top.suzhelan.qstory.hook.item.stickerpanel.StickerPanelSettingsConfig$SortMode;
import top.suzhelan.qstory.p015ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1520 implements InterfaceC2177, InterfaceC3003, InterfaceC3038, InterfaceC7141, InterfaceC8793, InterfaceC9734 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2240;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2241;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2242;

    public /* synthetic */ C1520(Object obj, int i, Object obj2) {
        this.f2242 = i;
        this.f2240 = obj;
        this.f2241 = obj2;
    }

    @Override // p374.InterfaceC9734
    public Object get() {
        int i = this.f2242;
        Object obj = this.f2241;
        Object obj2 = this.f2240;
        switch (i) {
            case 6:
                return ((AgeFileFilter) obj2).lambda$accept$0((Path) obj);
            case 7:
                return ((EmptyFileFilter) obj2).lambda$accept$0((Path) obj);
            case 8:
                return ((HiddenFileFilter) obj2).lambda$accept$0((Path) obj);
            default:
                return ((SizeFileFilter) obj2).lambda$accept$0((Path) obj);
        }
    }

    @Override // androidx.core.os.InterfaceC3003
    public void onCancel() {
        Animator animator = (Animator) this.f2240;
        C3190 c3190 = (C3190) this.f2241;
        animator.end();
        if (AbstractC3146.m4922(2)) {
            Log.v("FragmentManager", "Animator from operation " + c3190 + " has been canceled.");
        }
    }

    @Override // p233.InterfaceC8793
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo2038(AbstractC8798 abstractC8798, View view, int i) {
        C9555 c9555 = (C9555) this.f2240;
        C9069 c9069 = (C9069) this.f2241;
        AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        AbstractC9234.m14531(1293);
        C9523 c9523 = (C9523) abstractC8798.f22387.get(i);
        c9555.getClass();
        try {
            Object objCreateEmojiElement = CreateElement.createEmojiElement(c9523.f24861);
            Object objM12418 = AbstractC7165.m12418(AbstractC7166.m12425(AbstractC9234.m14531(178)), AbstractC9234.m14531(282), objCreateEmojiElement);
            AbstractC7165.m12424(objM12418, AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵喵~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵喵喵"), AbstractC9234.m14531(364));
            int i2 = 1;
            AbstractC7165.m12424(objM12418, AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵喵喵喵喵~喵喵呜喵喵呜喵呜~喵喵呜喵喵呜喵呜"), 1);
            AbstractC7165.m12424(objM12418, AbstractC9234.m14531(141), 0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(objCreateEmojiElement);
            QQNTSendMsgUtils.sendMsg(QQSessionUtils.getCurrentContact(), arrayList);
            C9517 c9517 = C9517.f24851;
            String str = c9523.f24861;
            c9517.getClass();
            C9517.m14968(str);
            C9525.f24862.getClass();
            if (C9525.m14978() == StickerPanelSettingsConfig$SortMode.RECENT_USAGE) {
                String strM14971 = C9517.m14971();
                if (!AbstractC5976.m10731(strM14971)) {
                    c9555.m14992(strM14971);
                    DialogXRecycleView dialogXRecycleView = c9555.f24937;
                    if (dialogXRecycleView != null) {
                        dialogXRecycleView.post(new RunnableC9541(c9555, i2));
                    }
                }
            }
        } catch (Exception e) {
            AbstractC7014.m12151(AbstractC9234.m14531(2726) + e.getMessage());
        }
        C9525.f24862.getClass();
        if (C9525.m14977()) {
            return;
        }
        c9069.m14323();
    }

    @Override // androidx.compose.runtime.InterfaceC2177
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public boolean mo1412() {
        C1571 c1571 = (C1571) this.f2240;
        C1546 c1546 = (C1546) this.f2241;
        if (!c1571.f2397) {
            c1571.m2094();
            c1546.f2331 = C1546.m2063(c1571.f2399, c1546.f2331);
            c1571.f2397 = !c1571.m2095(c1571.f2395, r1 + c1546.f2330);
        }
        return c1571.f2397;
    }

    @Override // p042.InterfaceC7141
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
        C7223 c7223 = (C7223) this.f2240;
        Method method = (Method) this.f2241;
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC3179(c7223, methodHookParam.thisObject, method, 9), 200L);
    }

    @Override // androidx.core.view.InterfaceC3038
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public C3058 mo863(View view, C3058 c3058) {
        C4585 c4585 = (C4585) this.f2240;
        C4586 c4586 = (C4586) this.f2241;
        if (c4585.f12009) {
            return c3058;
        }
        c4585.m8640(c3058, new C4586(c4586));
        return c3058;
    }
}
