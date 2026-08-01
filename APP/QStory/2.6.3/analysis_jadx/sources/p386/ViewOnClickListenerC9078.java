package p386;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.internal.C1251;
import com.bumptech.glide.load.engine.C3005;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import kotlin.jvm.internal.AbstractC4395;
import p128.AbstractC7479;
import p128.C7467;
import p257.C8227;
import p257.C8240;
import p257.RunnableC8234;
import p323.C8707;
import p323.C8708;
import p342.C8817;
import top.suzhelan.plugin.sdk.online.presenter.C5807;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC9078 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f25449;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25450;

    public /* synthetic */ ViewOnClickListenerC9078(C8817 c8817, TextView textView) {
        this.f25450 = 3;
        this.f25449 = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f25450;
        Object obj = this.f25449;
        switch (i) {
            case 0:
                C1251 c1251 = (C1251) obj;
                ((C5807) c1251.f3629).f15924 = null;
                EditText editText = (EditText) c1251.f3636;
                if (editText != null) {
                    editText.setHint("期待你的评论");
                    return;
                } else {
                    AbstractC4395.m8908("inputEdit");
                    throw null;
                }
            case 1:
                C8227 c8227 = (C8227) ((C3005) obj).f9537;
                c8227.getClass();
                AbstractC3738.m8030(new RunnableC8234(c8227, 1));
                return;
            case 2:
                C9075 c9075 = new C9075(((C9079) obj).m13459());
                C8707 c8707 = new C8707(c9075);
                C8240 c8240 = c9075.f25431;
                c8240.f22764 = c8707;
                c8240.m13763();
                c8240.m13761(new C8708(c9075, 3));
                c8240.m13760();
                return;
            default:
                TextView textView = (TextView) obj;
                C7467 c7467 = new C7467();
                c7467.mo12672(300L);
                ViewParent parent = textView.getParent();
                parent.getClass();
                AbstractC7479.m12697((ViewGroup) parent, c7467);
                Object tag = textView.getTag();
                Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
                if (zBooleanValue) {
                    textView.setMaxLines(Integer.MAX_VALUE);
                    textView.setEllipsize(null);
                } else {
                    textView.setMaxLines(2);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                }
                textView.setTag(Boolean.valueOf(!zBooleanValue));
                return;
        }
    }

    public /* synthetic */ ViewOnClickListenerC9078(Object obj, int i) {
        this.f25450 = i;
        this.f25449 = obj;
    }
}
