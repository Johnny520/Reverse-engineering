package androidx.compose.foundation.lazy.layout;

import android.animation.Animator;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.compose.runtime.InterfaceC1342;
import androidx.core.os.InterfaceC2170;
import androidx.core.view.C2225;
import androidx.core.view.InterfaceC2205;
import androidx.fragment.app.AbstractC2313;
import androidx.fragment.app.C2357;
import androidx.fragment.app.RunnableC2346;
import com.kongzue.dialogx.util.views.C3753;
import com.kongzue.dialogx.util.views.C3754;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.util.ArrayList;
import kotlin.text.AbstractC5144;
import lin.xposed.hook.util.qq.CreateElement;
import lin.xposed.hook.util.qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.qq.QQSessionUtils;
import org.apache.commons.io.filefilter.AgeFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.HiddenFileFilter;
import org.apache.commons.io.filefilter.SizeFileFilter;
import p010.AbstractC6185;
import p026.InterfaceC6312;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p039.C6394;
import p217.AbstractC7969;
import p217.InterfaceC7964;
import p257.C8240;
import p287.AbstractC8405;
import p321.C8688;
import p321.C8694;
import p321.C8696;
import p323.C8726;
import p323.RunnableC8712;
import p358.InterfaceC8905;
import top.suzhelan.qstory.hook.item.stickerpanel.StickerPanelSettingsConfig$SortMode;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0679 implements InterfaceC1342, InterfaceC2170, InterfaceC2205, InterfaceC6312, InterfaceC7964, InterfaceC8905 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1895;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f1896;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1897;

    public /* synthetic */ C0679(Object obj, int i, Object obj2) {
        this.f1897 = i;
        this.f1895 = obj;
        this.f1896 = obj2;
    }

    @Override // p358.InterfaceC8905
    public Object get() {
        int i = this.f1897;
        Object obj = this.f1896;
        Object obj2 = this.f1895;
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

    @Override // androidx.core.os.InterfaceC2170
    public void onCancel() {
        Animator animator = (Animator) this.f1895;
        C2357 c2357 = (C2357) this.f1896;
        animator.end();
        if (AbstractC2313.m4362(2)) {
            Log.v("FragmentManager", "Animator from operation " + c2357 + " has been canceled.");
        }
    }

    @Override // p217.InterfaceC7964
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo1478(AbstractC7969 abstractC7969, View view, int i) {
        C8726 c8726 = (C8726) this.f1895;
        C8240 c8240 = (C8240) this.f1896;
        AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        AbstractC8405.m13972(1293);
        C8694 c8694 = (C8694) abstractC7969.f22042.get(i);
        c8726.getClass();
        try {
            Object objCreateEmojiElement = CreateElement.createEmojiElement(c8694.f24516);
            Object objM11859 = AbstractC6336.m11859(AbstractC6337.m11866(AbstractC8405.m13972(178)), AbstractC8405.m13972(282), objCreateEmojiElement);
            AbstractC6336.m11865(objM11859, AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵喵~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵喵喵"), AbstractC8405.m13972(364));
            int i2 = 1;
            AbstractC6336.m11865(objM11859, AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵喵喵喵喵~喵喵呜喵喵呜喵呜~喵喵呜喵喵呜喵呜"), 1);
            AbstractC6336.m11865(objM11859, AbstractC8405.m13972(141), 0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(objCreateEmojiElement);
            QQNTSendMsgUtils.sendMsg(QQSessionUtils.getCurrentContact(), arrayList);
            C8688 c8688 = C8688.f24506;
            String str = c8694.f24516;
            c8688.getClass();
            C8688.m14409(str);
            C8696.f24517.getClass();
            if (C8696.m14419() == StickerPanelSettingsConfig$SortMode.RECENT_USAGE) {
                String strM14412 = C8688.m14412();
                if (!AbstractC5144.m10172(strM14412)) {
                    c8726.m14433(strM14412);
                    DialogXRecycleView dialogXRecycleView = c8726.f24592;
                    if (dialogXRecycleView != null) {
                        dialogXRecycleView.post(new RunnableC8712(c8726, i2));
                    }
                }
            }
        } catch (Exception e) {
            AbstractC6185.m11592(AbstractC8405.m13972(2726) + e.getMessage());
        }
        C8696.f24517.getClass();
        if (C8696.m14418()) {
            return;
        }
        c8240.m13764();
    }

    @Override // androidx.compose.runtime.InterfaceC1342
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public boolean mo852() {
        C0730 c0730 = (C0730) this.f1895;
        C0705 c0705 = (C0705) this.f1896;
        if (!c0730.f2052) {
            c0730.m1534();
            c0705.f1986 = C0705.m1503(c0730.f2054, c0705.f1986);
            c0730.f2052 = !c0730.m1535(c0730.f2050, r1 + c0705.f1985);
        }
        return c0730.f2052;
    }

    @Override // p026.InterfaceC6312
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
        C6394 c6394 = (C6394) this.f1895;
        Method method = (Method) this.f1896;
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC2346(c6394, methodHookParam.thisObject, method, 9), 200L);
    }

    @Override // androidx.core.view.InterfaceC2205
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public C2225 mo303(View view, C2225 c2225) {
        C3753 c3753 = (C3753) this.f1895;
        C3754 c3754 = (C3754) this.f1896;
        if (c3753.f11664) {
            return c2225;
        }
        c3753.m8081(c2225, new C3754(c3754));
        return c2225;
    }
}
