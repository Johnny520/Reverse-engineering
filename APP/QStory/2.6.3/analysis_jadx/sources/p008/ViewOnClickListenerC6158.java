package p008;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.animation.core.C0325;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3062;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.textfield.ViewOnClickListenerC3183;
import com.google.gson.C3252;
import com.google.gson.C3253;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4395;
import lin.xposed.hook.javaplugin.view.C5549;
import p028.DialogC6319;
import p161.AbstractC7646;
import p257.C8208;
import p287.AbstractC8405;
import p332.C8785;
import p335.AbstractC8789;
import p345.C8834;
import p348.InterfaceC8843;
import p355.RunnableC8889;
import p396.C9113;

/* JADX INFO: renamed from: 飘花落叶言世兰子楪哲苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC6158 extends DialogC6319 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Button f16938;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public TextView f16939;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ImageView f16940;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Button f16941;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public TextView f16942;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public TextView f16943;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public TextView f16944;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC8405.m13973("喵喵喵喵喵呜喵呜");
        view.getClass();
        dismiss();
        C8834 c8834 = C8834.f24936;
        C3252 c3252 = new C3252();
        c3252.m7334();
        C3253 c3253M7335 = c3252.m7335();
        C0325 c0325 = new C0325(19);
        c0325.m971(AbstractC8405.m13972(2860));
        C8834.f24936.getClass();
        c0325.f1095 = C8834.m14491(false);
        ((ArrayList) c0325.f1094).add(new C9113(c3253M7335));
        Object objM548 = c0325.m970().m548(InterfaceC8843.class);
        AbstractC8405.m13972(2861);
        objM548.getClass();
        C8208 c8208 = new C8208();
        c8208.f22614 = AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜呜呜喵呜喵~呜呜呜喵呜喵呜喵~呜喵喵喵呜呜呜呜~呜呜喵喵喵喵喵呜~呜呜喵呜喵呜呜喵");
        c8208.mo13721();
        c8208.mo13720(false);
        c8208.mo13722(AbstractC8405.m13972(3140));
        c8208.mo13719(AbstractC8405.m13972(3141), new C5549(4));
        c8208.m13731();
        AbstractC8789.f24756.execute(new RunnableC8889(c8208, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11558() {
        String strM13972;
        Button button = this.f16938;
        if (button == null) {
            AbstractC4395.m8908(AbstractC8405.m13972(1281));
            throw null;
        }
        button.setOnClickListener(this);
        C8785 c8785M6708 = AbstractC3056.m6708();
        TextView textView = this.f16939;
        if (textView == null) {
            AbstractC4395.m8908(AbstractC8405.m13972(1282));
            throw null;
        }
        String strM139722 = AbstractC8405.m13972(1283);
        LocalDateTime localDateTime = c8785M6708.f24737;
        if (localDateTime == null) {
            strM13972 = AbstractC8405.m13972(1289);
        } else {
            strM13972 = localDateTime.format(DateTimeFormatter.ofPattern(AbstractC8405.m13972(1168)));
            AbstractC8405.m13972(1290);
            strM13972.getClass();
        }
        textView.setText(strM139722.concat(strM13972));
        TextView textView2 = this.f16944;
        if (textView2 == null) {
            AbstractC4395.m8908(AbstractC8405.m13972(1284));
            throw null;
        }
        textView2.setText(c8785M6708.f24741);
        TextView textView3 = this.f16942;
        if (textView3 == null) {
            AbstractC4395.m8908(AbstractC8405.m13972(1285));
            throw null;
        }
        textView3.setText(c8785M6708.f24739.toString());
        String strM13973 = c8785M6708.f24738;
        int color = getContext().getColor(R.color.____res_0x2406048d);
        if (strM13973 == null || strM13973.length() == 0) {
            strM13973 = AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜喵喵喵呜喵~呜呜喵呜呜喵呜喵");
        } else {
            TextView textView4 = this.f16943;
            if (textView4 == null) {
                AbstractC4395.m8908(AbstractC8405.m13972(1286));
                throw null;
            }
            textView4.setTextColor(color);
        }
        TextView textView5 = this.f16943;
        if (textView5 == null) {
            AbstractC4395.m8908(AbstractC8405.m13972(1286));
            throw null;
        }
        textView5.setText(AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜喵呜喵呜喵呜~呜呜呜呜呜呜喵呜~呜喵喵喵呜呜呜呜~呜呜喵喵呜喵喵喵~呜呜喵呜喵喵呜喵~喵呜喵呜呜喵呜呜").concat(strM13973));
        Button button2 = this.f16941;
        if (button2 == null) {
            AbstractC4395.m8908(AbstractC8405.m13972(1287));
            throw null;
        }
        button2.setOnClickListener(new ViewOnClickListenerC3183(this, 9));
        C3062 c3062 = (C3062) ComponentCallbacks2C3058.m6765(getContext()).m6796(AbstractC8405.m13972(1134) + c8785M6708.f24742 + AbstractC8405.m13972(1135)).m6614();
        ImageView imageView = this.f16940;
        if (imageView == null) {
            AbstractC4395.m8908(AbstractC8405.m13972(1288));
            throw null;
        }
        c3062.m6789(imageView);
        if (c8785M6708.f24740.intValue() >= 1) {
            TextView textView6 = this.f16942;
            if (textView6 == null) {
                AbstractC4395.m8908(AbstractC8405.m13972(1285));
                throw null;
            }
            Resources resources = getContext().getResources();
            ThreadLocal threadLocal = AbstractC7646.f20756;
            textView6.setTextColor(resources.getColor(R.color.vip_color, null));
        }
    }
}
