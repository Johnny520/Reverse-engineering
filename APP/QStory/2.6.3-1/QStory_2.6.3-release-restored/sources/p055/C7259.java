package p055;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import androidx.compose.runtime.internal.C2080;
import androidx.fragment.app.C3191;
import com.bumptech.glide.AbstractC3888;
import java.lang.reflect.Method;
import java.util.List;
import lin.xposed.hook.view.main.itemview.C6395;
import p026.AbstractC7014;
import p042.AbstractC7140;
import p049.AbstractC7166;
import p049.C7164;
import p052.AbstractC7187;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7259 extends AbstractC7140 {
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m12536(String str) {
        ((ClipboardManager) AbstractC7187.f17852.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("QStory", str));
        AbstractC7014.m12151("已复制到剪切板:" + str);
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Method methodM12414;
        if (AbstractC3888.m7256()) {
            C6686 c6686 = new C6686(this, 6);
            int i = AbstractC7187.f17853;
            if (i >= 6458) {
                if (i > 5028) {
                    C7164 c7164M12412 = C7164.m12412("com.tencent.qqnt.aio.menu.ui.QQCustomMenuExpandableLayout");
                    String strM14532 = "setMenu";
                    C2080 c2080 = c7164M12412.f17803;
                    c2080.f3963 = strM14532;
                    c2080.f3964 = new Class[]{Object.class, View.class};
                    methodM12414 = c7164M12412.m12414();
                } else {
                    C7164 c7164M124122 = C7164.m12412("com.tencent.qqnt.aio.menu.ui.QQCustomMenuNoIconLayout");
                    String strM145322 = "setMenu";
                    C2080 c20802 = c7164M124122.f17803;
                    c20802.f3963 = strM145322;
                    c20802.f3964 = new Class[]{Object.class};
                    methodM12414 = c7164M124122.m12414();
                }
                m12390(methodM12414, new C3191(c6686, 13));
                return;
            }
            Class clsM12425 = AbstractC7166.m12425("com.tencent.mobileqq.aio.msg.AIOMsgItem");
            String[] strArr = {"com.tencent.mobileqq.aio.msglist.holder.component.pic.AIOPicContentComponent", "com.tencent.mobileqq.aio.msglist.holder.component.mix.AIOMixContentComponent"};
            Class clsM124252 = AbstractC7166.m12425("com.tencent.mobileqq.aio.msglist.holder.component.BaseContentComponent");
            C7164 c7164M12413 = C7164.m12413(clsM124252);
            c7164M12413.f17803.f3962 = clsM12425;
            Method methodM124142 = c7164M12413.m12414();
            C7164 c7164M124132 = C7164.m12413(clsM124252);
            c7164M124132.f17803.f3962 = List.class;
            Method methodM124143 = c7164M124132.m12414();
            for (int i2 = 0; i2 < 2; i2++) {
                C7164 c7164M124123 = C7164.m12412(strArr[i2]);
                String name = methodM124143.getName();
                C2080 c20803 = c7164M124123.f17803;
                c20803.f3963 = name;
                c20803.f3962 = List.class;
                ((C7259) c6686.f16359).m12389(c7164M124123.m12414(), new C6395(c6686, methodM124142, clsM12425, 5));
            }
        }
    }
}
