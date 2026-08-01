package p024;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.animation.core.C1171;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.C3894;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.textfield.ViewOnClickListenerC4015;
import com.google.gson.C4084;
import com.google.gson.C4085;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5227;
import lin.xposed.hook.javaplugin.view.C6380;
import p044.DialogC7148;
import p177.AbstractC8475;
import p273.C9037;
import p303.AbstractC9234;
import p348.C9614;
import p351.AbstractC9618;
import p361.C9663;
import p364.InterfaceC9672;
import p371.RunnableC9718;
import p412.C9942;

/* JADX INFO: renamed from: 飘花落叶言世兰子楪哲苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC6987 extends DialogC7148 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Button f17283;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public TextView f17284;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ImageView f17285;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Button f17286;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public TextView f17287;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public TextView f17288;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public TextView f17289;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC9234.m14532("喵喵喵喵喵呜喵呜");
        view.getClass();
        dismiss();
        C9663 c9663 = C9663.f25281;
        C4084 c4084 = new C4084();
        c4084.m7893();
        C4085 c4085M7894 = c4084.m7894();
        C1171 c1171 = new C1171(19);
        c1171.m1531(AbstractC9234.m14531(2860));
        C9663.f25281.getClass();
        c1171.f1440 = C9663.m15050(false);
        ((ArrayList) c1171.f1439).add(new C9942(c4085M7894));
        Object objM1108 = c1171.m1530().m1108(InterfaceC9672.class);
        AbstractC9234.m14531(2861);
        objM1108.getClass();
        C9037 c9037 = new C9037();
        c9037.f22959 = AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜呜呜喵呜喵~呜呜呜喵呜喵呜喵~呜喵喵喵呜呜呜呜~呜呜喵喵喵喵喵呜~呜呜喵呜喵呜呜喵");
        c9037.mo14280();
        c9037.mo14279(false);
        c9037.mo14281(AbstractC9234.m14531(3140));
        c9037.mo14278(AbstractC9234.m14531(3141), new C6380(4));
        c9037.m14290();
        AbstractC9618.f25101.execute(new RunnableC9718(c9037, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12117() {
        String strM14531;
        Button button = this.f17283;
        if (button == null) {
            AbstractC5227.m9467(AbstractC9234.m14531(1281));
            throw null;
        }
        button.setOnClickListener(this);
        C9614 c9614M7268 = AbstractC3888.m7268();
        TextView textView = this.f17284;
        if (textView == null) {
            AbstractC5227.m9467(AbstractC9234.m14531(1282));
            throw null;
        }
        String strM145312 = AbstractC9234.m14531(1283);
        LocalDateTime localDateTime = c9614M7268.f25082;
        if (localDateTime == null) {
            strM14531 = AbstractC9234.m14531(1289);
        } else {
            strM14531 = localDateTime.format(DateTimeFormatter.ofPattern(AbstractC9234.m14531(1168)));
            AbstractC9234.m14531(1290);
            strM14531.getClass();
        }
        textView.setText(strM145312.concat(strM14531));
        TextView textView2 = this.f17289;
        if (textView2 == null) {
            AbstractC5227.m9467(AbstractC9234.m14531(1284));
            throw null;
        }
        textView2.setText(c9614M7268.f25086);
        TextView textView3 = this.f17287;
        if (textView3 == null) {
            AbstractC5227.m9467(AbstractC9234.m14531(1285));
            throw null;
        }
        textView3.setText(c9614M7268.f25084.toString());
        String strM14532 = c9614M7268.f25083;
        int color = getContext().getColor(C0328R.color.____res_0x2406048d);
        if (strM14532 == null || strM14532.length() == 0) {
            strM14532 = AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜喵喵喵呜喵~呜呜喵呜呜喵呜喵");
        } else {
            TextView textView4 = this.f17288;
            if (textView4 == null) {
                AbstractC5227.m9467(AbstractC9234.m14531(1286));
                throw null;
            }
            textView4.setTextColor(color);
        }
        TextView textView5 = this.f17288;
        if (textView5 == null) {
            AbstractC5227.m9467(AbstractC9234.m14531(1286));
            throw null;
        }
        textView5.setText(AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜喵呜喵呜喵呜~呜呜呜呜呜呜喵呜~呜喵喵喵呜呜呜呜~呜呜喵喵呜喵喵喵~呜呜喵呜喵喵呜喵~喵呜喵呜呜喵呜呜").concat(strM14532));
        Button button2 = this.f17286;
        if (button2 == null) {
            AbstractC5227.m9467(AbstractC9234.m14531(1287));
            throw null;
        }
        button2.setOnClickListener(new ViewOnClickListenerC4015(this, 9));
        C3894 c3894 = (C3894) ComponentCallbacks2C3890.m7325(getContext()).m7356(AbstractC9234.m14531(1134) + c9614M7268.f25087 + AbstractC9234.m14531(1135)).m7174();
        ImageView imageView = this.f17285;
        if (imageView == null) {
            AbstractC5227.m9467(AbstractC9234.m14531(1288));
            throw null;
        }
        c3894.m7349(imageView);
        if (c9614M7268.f25085.intValue() >= 1) {
            TextView textView6 = this.f17287;
            if (textView6 == null) {
                AbstractC5227.m9467(AbstractC9234.m14531(1285));
                throw null;
            }
            Resources resources = getContext().getResources();
            ThreadLocal threadLocal = AbstractC8475.f21101;
            textView6.setTextColor(resources.getColor(C0328R.color.vip_color, null));
        }
    }
}
