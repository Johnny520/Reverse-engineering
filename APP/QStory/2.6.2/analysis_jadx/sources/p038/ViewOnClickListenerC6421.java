package p038;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.RunnableC0099;
import androidx.compose.runtime.internal.C1245;
import androidx.fragment.app.C2358;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import java.lang.reflect.Method;
import java.util.List;
import lin.xposed.hook.view.main.itemview.C5564;
import p026.AbstractC6293;
import p027.DialogC6300;
import p032.AbstractC6318;
import p032.C6316;
import p035.AbstractC6340;
import p053.AbstractC6560;
import p175.AbstractC7738;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class ViewOnClickListenerC6421 extends AbstractC6293 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public EditText f17585;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public DialogC6300 f17586;

    public ViewOnClickListenerC6421() {
        AbstractC3056.m6668(-3937580614958712231L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m11930(ViewOnClickListenerC6421 viewOnClickListenerC6421, String str) {
        Activity activityM13031 = AbstractC7738.m13031();
        viewOnClickListenerC6421.f17586 = new DialogC6300(activityM13031);
        View viewInflate = LayoutInflater.from(activityM13031).inflate(R.layout.send_pic_card_dialog, (ViewGroup) null, false);
        viewOnClickListenerC6421.f17585 = (EditText) viewInflate.findViewById(R.id.send_pic_card_yx);
        Button button = (Button) viewInflate.findViewById(R.id.send_pic_card_btn);
        button.setTag(str);
        button.setOnClickListener(viewOnClickListenerC6421);
        viewOnClickListenerC6421.f17586.setContentView(viewInflate);
        viewOnClickListenerC6421.f17586.show();
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        Method methodM11827;
        if (AbstractC6560.m12011()) {
            C5851 c5851 = new C5851(this, 7);
            int i = AbstractC6340.f17461;
            if (i >= 6458) {
                if (i > 5028) {
                    C6316 c6316M11825 = C6316.m11825(AbstractC3056.m6668(-3937564998457623975L));
                    String strM6668 = AbstractC3056.m6668(-3937564835248866727L);
                    C1245 c1245 = c6316M11825.f17409;
                    c1245.f3617 = strM6668;
                    c1245.f3618 = new Class[]{Object.class, View.class};
                    methodM11827 = c6316M11825.m11827();
                } else {
                    C6316 c6316M118252 = C6316.m11825(AbstractC3056.m6668(-3937564732169651623L));
                    String strM66682 = AbstractC3056.m6668(-3937564835248866727L);
                    C1245 c12452 = c6316M118252.f17409;
                    c12452.f3617 = strM66682;
                    c12452.f3618 = new Class[]{Object.class};
                    methodM11827 = c6316M118252.m11827();
                }
                m11803(methodM11827, new C2358(c5851, 18));
                return;
            }
            Class clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937564551781025191L));
            String[] strArr = {AbstractC3056.m6668(-3937578192597157287L), AbstractC3056.m6668(-3937577870474610087L)};
            Class clsM118382 = AbstractC6318.m11838(AbstractC3056.m6668(-3937563963370505639L));
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
                ((ViewOnClickListenerC6421) c5851.f16007).m11802(c6316M118253.m11827(), new C5564(c5851, methodM118272, clsM11838, 6));
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        new Thread(new RunnableC0099(this, 15, view)).start();
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937580567714071975L);
    }
}
