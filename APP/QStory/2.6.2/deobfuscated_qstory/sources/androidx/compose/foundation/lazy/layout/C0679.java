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
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.util.views.C3752;
import com.kongzue.dialogx.util.views.C3753;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.AbstractC5143;
import lin.xposed.hook.util.qq.CreateElement;
import lin.xposed.hook.util.qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.qq.QQSessionUtils;
import org.apache.commons.io.filefilter.AgeFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.HiddenFileFilter;
import org.apache.commons.io.filefilter.SizeFileFilter;
import p010.AbstractC6154;
import p026.InterfaceC6294;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p037.C6360;
import p038.C6372;
import p038.C6415;
import p038.CallableC6393;
import p217.AbstractC7968;
import p217.InterfaceC7963;
import p257.C8239;
import p319.C8703;
import p319.RunnableC8689;
import p324.C8738;
import p324.C8744;
import p324.C8746;
import p358.InterfaceC8915;
import top.suzhelan.qstory.hook.item.stickerpanel.StickerPanelSettingsConfig$SortMode;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0679 implements InterfaceC1342, InterfaceC2170, InterfaceC2205, InterfaceC6294, InterfaceC7963, InterfaceC8915 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1894;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f1895;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1896;

    public /* synthetic */ C0679(Object obj, int i, Object obj2) {
        this.f1896 = i;
        this.f1894 = obj;
        this.f1895 = obj2;
    }

    @Override // p358.InterfaceC8915
    public Object get() {
        int i = this.f1896;
        Object obj = this.f1895;
        Object obj2 = this.f1894;
        switch (i) {
            case 7:
                return ((AgeFileFilter) obj2).lambda$accept$0((Path) obj);
            case 8:
                return ((EmptyFileFilter) obj2).lambda$accept$0((Path) obj);
            case 9:
                return ((HiddenFileFilter) obj2).lambda$accept$0((Path) obj);
            default:
                return ((SizeFileFilter) obj2).lambda$accept$0((Path) obj);
        }
    }

    @Override // androidx.core.os.InterfaceC2170
    public void onCancel() {
        Animator animator = (Animator) this.f1894;
        C2357 c2357 = (C2357) this.f1895;
        animator.end();
        if (AbstractC2313.m4352(2)) {
            Log.v("FragmentManager", "Animator from operation " + c2357 + " has been canceled.");
        }
    }

    @Override // p217.InterfaceC7963
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo1468(AbstractC7968 abstractC7968, View view, int i) {
        C8703 c8703 = (C8703) this.f1894;
        C8239 c8239 = (C8239) this.f1895;
        "adapter";
        "<unused var>";
        C8744 c8744 = (C8744) abstractC7968.f22045.get(i);
        c8703.getClass();
        try {
            Object objCreateEmojiElement = CreateElement.createEmojiElement(c8744.f24649);
            Object objM11831 = AbstractC6317.m11831(AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.PicElement"), "picElement", objCreateEmojiElement);
            AbstractC6317.m11837(objM11831, "summary", "[\u52a8\u753b\u8868\u60c5]");
            int i2 = 1;
            AbstractC6317.m11837(objM11831, "storeID", 1);
            AbstractC6317.m11837(objM11831, "emojiFrom", 0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(objCreateEmojiElement);
            QQNTSendMsgUtils.sendMsg(QQSessionUtils.getCurrentContact(), arrayList);
            C8738 c8738 = C8738.f24639;
            String str = c8744.f24649;
            c8738.getClass();
            C8738.m14404(str);
            C8746.f24650.getClass();
            if (C8746.m14414() == StickerPanelSettingsConfig$SortMode.RECENT_USAGE) {
                String strM14407 = C8738.m14407();
                if (!AbstractC5143.m10164(strM14407)) {
                    c8703.m14385(strM14407);
                    DialogXRecycleView dialogXRecycleView = c8703.f24542;
                    if (dialogXRecycleView != null) {
                        dialogXRecycleView.post(new RunnableC8689(c8703, i2));
                    }
                }
            }
        } catch (Exception e) {
            AbstractC6154.m11561("\u53d1\u9001\u8868\u60c5\u5931\u8d25: " + e.getMessage());
        }
        C8746.f24650.getClass();
        if (C8746.m14413()) {
            return;
        }
        c8239.m13747();
    }

    @Override // androidx.compose.runtime.InterfaceC1342
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public boolean mo851() {
        C0730 c0730 = (C0730) this.f1894;
        C0705 c0705 = (C0705) this.f1895;
        if (!c0730.f2051) {
            c0730.m1524();
            c0705.f1985 = C0705.m1493(c0730.f2053, c0705.f1985);
            c0730.f2051 = !c0730.m1525(c0730.f2049, r1 + c0705.f1984);
        }
        return c0730.f2051;
    }

    @Override // p026.InterfaceC6294
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void mo1469(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException, InvocationTargetException {
        int i = this.f1896;
        Object obj = this.f1895;
        Object obj2 = this.f1894;
        switch (i) {
            case 3:
                Object objInvoke = ((Method) obj).invoke(methodHookParam.thisObject, null);
                Object objM11913 = C6360.m11913(objInvoke, "\u4fee\u6539\u6d88\u606f", R.mipmap.ic_launcher_round, new CallableC6393((C6415) obj2, objInvoke, 0));
                List list = (List) methodHookParam.getResult();
                ArrayList arrayList = new ArrayList();
                arrayList.add(objM11913);
                arrayList.addAll(list);
                methodHookParam.setResult(arrayList);
                break;
            default:
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC2346((C6372) obj2, methodHookParam.thisObject, (Method) obj, 9), 200L);
                break;
        }
    }

    @Override // androidx.core.view.InterfaceC2205
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public C2225 mo302(View view, C2225 c2225) {
        C3752 c3752 = (C3752) this.f1894;
        C3753 c3753 = (C3753) this.f1895;
        if (c3752.f11659) {
            return c2225;
        }
        c3752.m8094(c2225, new C3753(c3753));
        return c2225;
    }
}
