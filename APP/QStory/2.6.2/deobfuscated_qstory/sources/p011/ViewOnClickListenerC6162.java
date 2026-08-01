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
        "v";
        view.getClass();
        dismiss();
        C8865 c8865 = C8865.f24976;
        C3251 c3251 = new C3251();
        c3251.m7347();
        C3252 c3252M7348 = c3251.m7348();
        C0325 c0325 = new C0325(19);
        c0325.m971("https://qstory.suzhelan.top");
        C8865.f24976.getClass();
        c0325.f1095 = C8865.m14511(false);
        ((ArrayList) c0325.f1094).add(new C9152(c3252M7348));
        Object objM547 = c0325.m970().m547(InterfaceC8861.class);
        "create(...)";
        objM547.getClass();
        C8207 c8207 = new C8207();
        c8207.f22615 = "\u63d0\u793a";
        c8207.mo13704();
        c8207.mo13703(false);
        c8207.mo13705("\u53ef\u4ee5\u8d5e\u52a9\u4e00\u4e0b\u5417,\u8fd9\u4f1a\u5e2e\u52a9\u6a21\u5757\u5f00\u53d1\u66f4\u591a\u529f\u80fd\u8d70\u7684\u66f4\u8fdc,\u4e3a\u4f60\u63d0\u4f9b\u66f4\u591a\u670d\u52a1\n(\u4e0d\u8d5e\u52a9\u4e5f\u53ef\u4ee5\u6b63\u5e38\u4f7f\u7528\uff0c\u4f60\u7684\u652f\u6301\u662f\u6b64\u6a21\u5757\u7ef4\u62a4\u7684\u52a8\u529b\uff09\n\u8d5e\u52a9\u540e\u6b64\u5f39\u7a97\u5c06\u4e0d\u4f1a\u51fa\u73b0");
        c8207.mo13702("\u53bb\u8d5e\u52a9", new C5548(4));
        c8207.m13714();
        AbstractC8804.f24777.execute(new RunnableC8872(c8207, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11584() {
        String strM6668;
        Button button = this.f16783;
        if (button == null) {
            AbstractC4394.m8918("enterSponsorshipBtn");
            throw null;
        }
        button.setOnClickListener(this);
        C8799 c8799 = new C8799();
        c8799.f24761 = "0";
        c8799.f24760 = "\u672a\u540c\u6b65";
        c8799.f24759 = 0;
        c8799.f24758 = "\u672a\u540c\u6b65";
        C8799 c87992 = (C8799) new C8821().m14466(C8799.class, "user_info");
        if (c87992 != null) {
            c8799 = c87992;
        }
        TextView textView = this.f16784;
        if (textView == null) {
            AbstractC4394.m8918("tvSponsorEndDate");
            throw null;
        }
        String strM66682 = "\u8d5e\u52a9\u5230\u671f\u65f6\u95f4:";
        LocalDateTime localDateTime = c8799.f24756;
        if (localDateTime == null) {
            strM6668 = "\u672a\u8d5e\u52a9";
        } else {
            strM6668 = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            "format(...)";
            strM6668.getClass();
        }
        textView.setText(strM66682.concat(strM6668));
        TextView textView2 = this.f16789;
        if (textView2 == null) {
            AbstractC4394.m8918("userNameTextView");
            throw null;
        }
        textView2.setText(c8799.f24760);
        TextView textView3 = this.f16787;
        if (textView3 == null) {
            AbstractC4394.m8918("userIdentityTextView");
            throw null;
        }
        textView3.setText(c8799.f24758.toString());
        String strM66683 = c8799.f24757;
        int color = getContext().getColor(R.color.____res_0x2406048d);
        if (strM66683 == null || strM66683.length() == 0) {
            strM66683 = "\u65e0";
        } else {
            TextView textView4 = this.f16788;
            if (textView4 == null) {
                AbstractC4394.m8918("userLabelTextView");
                throw null;
            }
            textView4.setTextColor(color);
        }
        TextView textView5 = this.f16788;
        if (textView5 == null) {
            AbstractC4394.m8918("userLabelTextView");
            throw null;
        }
        textView5.setText("\u6807\u7b7e:".concat(strM66683));
        Button button2 = this.f16786;
        if (button2 == null) {
            AbstractC4394.m8918("refreshUserInformation");
            throw null;
        }
        button2.setOnClickListener(new ViewOnClickListenerC3182(this, 12));
        C3061 c3061 = (C3061) ComponentCallbacks2C3057.m6720(getContext()).m6751("http://q.qlogo.cn/headimg_dl?dst_uin=" + c8799.f24761 + "&spec=640&img_type=jpg").m6554();
        ImageView imageView = this.f16785;
        if (imageView == null) {
            AbstractC4394.m8918("userAvatar");
            throw null;
        }
        c3061.m6744(imageView);
        if (c8799.f24759.intValue() >= 1) {
            TextView textView6 = this.f16787;
            if (textView6 == null) {
                AbstractC4394.m8918("userIdentityTextView");
                throw null;
            }
            Resources resources = getContext().getResources();
            ThreadLocal threadLocal = AbstractC7645.f20761;
            textView6.setTextColor(resources.getColor(R.color.vip_color, null));
        }
    }
}
