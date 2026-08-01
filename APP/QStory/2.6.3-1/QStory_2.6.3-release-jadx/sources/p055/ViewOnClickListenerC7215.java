package p055;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.RunnableC0946;
import androidx.compose.runtime.internal.C2080;
import androidx.fragment.app.C3191;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3888;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.lang.reflect.Method;
import java.util.List;
import lin.xposed.hook.view.main.itemview.C6395;
import p042.AbstractC7140;
import p044.DialogC7148;
import p049.AbstractC7166;
import p049.C7164;
import p052.AbstractC7187;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class ViewOnClickListenerC7215 extends AbstractC7140 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public EditText f17895;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public DialogC7148 f17896;

    public ViewOnClickListenerC7215() {
        AbstractC9234.m14531(291);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m12522(ViewOnClickListenerC7215 viewOnClickListenerC7215, String str) {
        Activity activityM7213 = AbstractC3887.m7213();
        viewOnClickListenerC7215.f17896 = new DialogC7148(activityM7213);
        View viewInflate = LayoutInflater.from(activityM7213).inflate(C0328R.layout.send_pic_card_dialog, (ViewGroup) null, false);
        viewOnClickListenerC7215.f17895 = (EditText) viewInflate.findViewById(C0328R.id.send_pic_card_yx);
        Button button = (Button) viewInflate.findViewById(C0328R.id.send_pic_card_btn);
        button.setTag(str);
        button.setOnClickListener(viewOnClickListenerC7215);
        viewOnClickListenerC7215.f17896.setContentView(viewInflate);
        viewOnClickListenerC7215.f17896.show();
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Method methodM12414;
        if (AbstractC3888.m7256()) {
            C6686 c6686 = new C6686(this, 7);
            int i = AbstractC7187.f17853;
            if (i >= 6458) {
                if (i > 5028) {
                    C7164 c7164M12412 = C7164.m12412(AbstractC9234.m14531(158));
                    String strM14532 = AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵喵");
                    C2080 c2080 = c7164M12412.f17803;
                    c2080.f3963 = strM14532;
                    c2080.f3964 = new Class[]{Object.class, View.class};
                    methodM12414 = c7164M12412.m12414();
                } else {
                    C7164 c7164M124122 = C7164.m12412(AbstractC9234.m14531(159));
                    String strM145322 = AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵喵");
                    C2080 c20802 = c7164M124122.f17803;
                    c20802.f3963 = strM145322;
                    c20802.f3964 = new Class[]{Object.class};
                    methodM12414 = c7164M124122.m12414();
                }
                m12390(methodM12414, new C3191(c6686, 18));
                return;
            }
            Class clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(160));
            String[] strArr = {AbstractC9234.m14531(161), AbstractC9234.m14531(162)};
            Class clsM124252 = AbstractC7166.m12425(AbstractC9234.m14531(163));
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
                ((ViewOnClickListenerC7215) c6686.f16359).m12389(c7164M124123.m12414(), new C6395(c6686, methodM124142, clsM12425, 6));
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        new Thread(new RunnableC0946(this, 16, view)).start();
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(292);
    }
}
