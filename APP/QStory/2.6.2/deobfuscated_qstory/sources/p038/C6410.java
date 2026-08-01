package p038;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import androidx.compose.runtime.internal.C1245;
import androidx.fragment.app.C2358;
import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Method;
import java.util.List;
import lin.xposed.hook.view.main.itemview.C5564;
import p010.AbstractC6154;
import p026.AbstractC6293;
import p032.AbstractC6318;
import p032.C6316;
import p035.AbstractC6340;
import p053.AbstractC6560;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6410 extends AbstractC6293 {
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m11926(String str) {
        ((ClipboardManager) AbstractC6340.f17460.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("QStory", str));
        AbstractC6154.m11561("\u5df2\u590d\u5236\u5230\u526a\u5207\u677f:" + str);
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        Method methodM11827;
        if (AbstractC6560.m12011()) {
            C5851 c5851 = new C5851(this, 6);
            int i = AbstractC6340.f17461;
            if (i >= 6458) {
                if (i > 5028) {
                    C6316 c6316M11825 = C6316.m11825("com.tencent.qqnt.aio.menu.ui.QQCustomMenuExpandableLayout");
                    String strM6668 = "setMenu";
                    C1245 c1245 = c6316M11825.f17409;
                    c1245.f3617 = strM6668;
                    c1245.f3618 = new Class[]{Object.class, View.class};
                    methodM11827 = c6316M11825.m11827();
                } else {
                    C6316 c6316M118252 = C6316.m11825("com.tencent.qqnt.aio.menu.ui.QQCustomMenuNoIconLayout");
                    String strM66682 = "setMenu";
                    C1245 c12452 = c6316M118252.f17409;
                    c12452.f3617 = strM66682;
                    c12452.f3618 = new Class[]{Object.class};
                    methodM11827 = c6316M118252.m11827();
                }
                m11803(methodM11827, new C2358(c5851, 13));
                return;
            }
            Class clsM11838 = AbstractC6318.m11838("com.tencent.mobileqq.aio.msg.AIOMsgItem");
            String[] strArr = {"com.tencent.mobileqq.aio.msglist.holder.component.pic.AIOPicContentComponent", "com.tencent.mobileqq.aio.msglist.holder.component.mix.AIOMixContentComponent"};
            Class clsM118382 = AbstractC6318.m11838("com.tencent.mobileqq.aio.msglist.holder.component.BaseContentComponent");
            C6316 c6316M11826 = C6316.m11826(clsM118382);
            c6316M11826.f17409.f3616 = clsM11838;
            Method methodM118272 = c6316M11826.m11827();
            C6316 c6316M118262 = C6316.m11826(clsM118382);
            c6316M118262.f17409.f3616 = List.class;
            Method methodM118273 = c6316M118262.m11827();
            for (int i2 = 0; i2 < 2; i2++) {
                C6316 c6316M118253 = C6316.m11825(strArr[i2]);
                String name = methodM118273.getName();
                C1245 c12453 = c6316M118253.f17409;
                c12453.f3617 = name;
                c12453.f3616 = List.class;
                ((C6410) c5851.f16007).m11802(c6316M118253.m11827(), new C5564(c5851, methodM118272, clsM11838, 5));
            }
        }
    }
}
