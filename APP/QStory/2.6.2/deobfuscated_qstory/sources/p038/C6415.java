package p038;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.compose.foundation.lazy.layout.C0679;
import androidx.compose.runtime.internal.C1245;
import androidx.fragment.app.C2358;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import p010.AbstractC6154;
import p027.DialogC6300;
import p032.AbstractC6318;
import p032.C6316;
import p035.AbstractC6340;
import p175.AbstractC7738;
import p316.C8675;
import p331.C8799;
import p336.AbstractC8805;
import top.suzhelan.qstory.hook.api.C5817;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6415 extends AbstractC8805 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final HashMap f17576 = new HashMap();

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        Method methodM11827;
        C6411 c6411 = new C6411(this, 0);
        HashMap map = C5817.f15949;
        C8675.m14351(this, c6411);
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
            m11803(methodM11827, new C2358(this, 10));
            return;
        }
        Class clsM11838 = AbstractC6318.m11838("com.tencent.mobileqq.aio.msg.AIOMsgItem");
        Class clsM118382 = AbstractC6318.m11838("com.tencent.mobileqq.aio.msglist.holder.component.text.AIOTextContentComponent");
        Class clsM118383 = AbstractC6318.m11838("com.tencent.mobileqq.aio.msglist.holder.component.BaseContentComponent");
        C6316 c6316M11826 = C6316.m11826(clsM118383);
        c6316M11826.f17409.f3616 = clsM11838;
        Method methodM118272 = c6316M11826.m11827();
        C6316 c6316M118262 = C6316.m11826(clsM118383);
        c6316M118262.f17409.f3616 = List.class;
        Method methodM118273 = c6316M118262.m11827();
        C6316 c6316M118263 = C6316.m11826(clsM118382);
        String name = methodM118273.getName();
        C1245 c12453 = c6316M118263.f17409;
        c12453.f3617 = name;
        c12453.f3616 = List.class;
        m11802(c6316M118263.m11827(), new C0679(this, 3, methodM118272));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u76ee\u524d\u652f\u6301\u6587\u672c\u6d88\u606f\u7684\u4fee\u6539 \u4ec5\u652f\u6301QQNT \u957f\u6309\u4e00\u6761\u6d88\u606f\u4f1a\u51fa\u73b0\u53ef\u4fee\u6539\u6d88\u606f\u7684\u53ef\u9009\u9879";
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11255(C8799 c8799) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m11927(final long j, String str) {
        Activity activityM13031 = AbstractC7738.m13031();
        final DialogC6300 dialogC6300 = new DialogC6300(activityM13031);
        View viewInflate = LayoutInflater.from(activityM13031).inflate(R.layout.change_message, (ViewGroup) null, false);
        final EditText editText = (EditText) viewInflate.findViewById(R.id.change_message_content);
        editText.setText(str);
        ((Button) viewInflate.findViewById(R.id.change_message_save)).setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪苏世哲兰
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17574.f17576.put(Long.valueOf(j), editText.getText().toString());
                dialogC6300.dismiss();
                AbstractC6154.m11561("\u91cd\u65b0\u6253\u5f00\u6b64\u4f1a\u8bdd\u751f\u6548");
            }
        });
        dialogC6300.setContentView(viewInflate);
        dialogC6300.show();
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11257(C8799 c8799) {
        return c8799.f24759.intValue() >= 1;
    }
}
