package p011;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.animation.core.C0325;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3061;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.textfield.ViewOnClickListenerC3182;
import com.google.gson.C3251;
import com.google.gson.C3252;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4394;
import lin.xposed.hook.javaplugin.view.C5548;
import p027.DialogC6300;
import p161.AbstractC7645;
import p257.C8207;
import p331.C8799;
import p335.AbstractC8804;
import p342.C8821;
import p348.InterfaceC8861;
import p349.C8865;
import p352.RunnableC8872;
import p398.C9152;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏楪哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC6162 extends DialogC6300 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Button f16783;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public TextView f16784;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ImageView f16785;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Button f16786;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public TextView f16787;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public TextView f16788;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public TextView f16789;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC3056.m6668(-3937602712565450151L);
        view.getClass();
        dismiss();
        C8865 c8865 = C8865.f24976;
        C3251 c3251 = new C3251();
        c3251.m7347();
        C3252 c3252M7348 = c3251.m7348();
        C0325 c0325 = new C0325(19);
        c0325.m971(AbstractC3056.m6668(-3937274572769068455L));
        C8865.f24976.getClass();
        c0325.f1095 = C8865.m14511(false);
        ((ArrayList) c0325.f1094).add(new C9152(c3252M7348));
        Object objM547 = c0325.m970().m547(InterfaceC8861.class);
        AbstractC3056.m6668(-3937274383790507431L);
        objM547.getClass();
        C8207 c8207 = new C8207();
        c8207.f22615 = AbstractC3056.m6668(-3937326790981453223L);
        c8207.mo13704();
        c8207.mo13703(false);
        c8207.mo13705(AbstractC3056.m6668(-3937326700787140007L));
        c8207.mo13702(AbstractC3056.m6668(-3937326464563938727L), new C5548(4));
        c8207.m13714();
        AbstractC8804.f24777.execute(new RunnableC8872(c8207, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11584() {
        String strM6668;
        Button button = this.f16783;
        if (button == null) {
            AbstractC4394.m8918(AbstractC3056.m6668(-3937691480949523879L));
            throw null;
        }
        button.setOnClickListener(this);
        C8799 c8799 = new C8799();
        c8799.f24761 = AbstractC3056.m6668(-3937561652678100391L);
        c8799.f24760 = AbstractC3056.m6668(-3937706809687803303L);
        c8799.f24759 = 0;
        c8799.f24758 = AbstractC3056.m6668(-3937706809687803303L);
        C8799 c87992 = (C8799) new C8821().m14466(C8799.class, AbstractC3056.m6668(-3937706766738130343L));
        if (c87992 != null) {
            c8799 = c87992;
        }
        TextView textView = this.f16784;
        if (textView == null) {
            AbstractC4394.m8918(AbstractC3056.m6668(-3937691326330701223L));
            throw null;
        }
        String strM66682 = AbstractC3056.m6668(-3937691261906191783L);
        LocalDateTime localDateTime = c8799.f24756;
        if (localDateTime == null) {
            strM6668 = AbstractC3056.m6668(-3937690832409462183L);
        } else {
            strM6668 = localDateTime.format(DateTimeFormatter.ofPattern(AbstractC3056.m6668(-3937683122943165863L)));
            AbstractC3056.m6668(-3937690883949069735L);
            strM6668.getClass();
        }
        textView.setText(strM66682.concat(strM6668));
        TextView textView2 = this.f16789;
        if (textView2 == null) {
            AbstractC4394.m8918(AbstractC3056.m6668(-3937691296265930151L));
            throw null;
        }
        textView2.setText(c8799.f24760);
        TextView textView3 = this.f16787;
        if (textView3 == null) {
            AbstractC4394.m8918(AbstractC3056.m6668(-3937691197481682343L));
            throw null;
        }
        textView3.setText(c8799.f24758.toString());
        String strM66683 = c8799.f24757;
        int color = getContext().getColor(R.color.____res_0x2406048d);
        if (strM66683 == null || strM66683.length() == 0) {
            strM66683 = AbstractC3056.m6668(-3937691047157826983L);
        } else {
            TextView textView4 = this.f16788;
            if (textView4 == null) {
                AbstractC4394.m8918(AbstractC3056.m6668(-3937691055747761575L));
                throw null;
            }
            textView4.setTextColor(color);
        }
        TextView textView5 = this.f16788;
        if (textView5 == null) {
            AbstractC4394.m8918(AbstractC3056.m6668(-3937691055747761575L));
            throw null;
        }
        textView5.setText(AbstractC3056.m6668(-3937640156090336679L).concat(strM66683));
        Button button2 = this.f16786;
        if (button2 == null) {
            AbstractC4394.m8918(AbstractC3056.m6668(-3937690961258481063L));
            throw null;
        }
        button2.setOnClickListener(new ViewOnClickListenerC3182(this, 12));
        C3061 c3061 = (C3061) ComponentCallbacks2C3057.m6720(getContext()).m6751(AbstractC3056.m6668(-3937669469242131879L) + c8799.f24761 + AbstractC3056.m6668(-3937669323213243815L)).m6554();
        ImageView imageView = this.f16785;
        if (imageView == null) {
            AbstractC4394.m8918(AbstractC3056.m6668(-3937690922603775399L));
            throw null;
        }
        c3061.m6744(imageView);
        if (c8799.f24759.intValue() >= 1) {
            TextView textView6 = this.f16787;
            if (textView6 == null) {
                AbstractC4394.m8918(AbstractC3056.m6668(-3937691197481682343L));
                throw null;
            }
            Resources resources = getContext().getResources();
            ThreadLocal threadLocal = AbstractC7645.f20761;
            textView6.setTextColor(resources.getColor(R.color.vip_color, null));
        }
    }
}
