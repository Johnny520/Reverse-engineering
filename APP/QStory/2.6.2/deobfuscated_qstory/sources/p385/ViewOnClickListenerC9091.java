package p385;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.internal.C1251;
import com.bumptech.glide.load.engine.C3004;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import kotlin.jvm.internal.AbstractC4394;
import p128.AbstractC7478;
import p128.C7466;
import p257.C8226;
import p257.RunnableC8233;
import p319.C8684;
import p319.C8685;
import p343.C8831;
import top.suzhelan.plugin.sdk.online.presenter.C5806;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰世哲子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC9091 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f25399;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25400;

    public /* synthetic */ ViewOnClickListenerC9091(C8831 c8831, TextView textView) {
        this.f25400 = 3;
        this.f25399 = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f25400;
        Object obj = this.f25399;
        switch (i) {
            case 0:
                C1251 c1251 = (C1251) obj;
                ((C5806) c1251.f3628).f15924 = null;
                EditText editText = (EditText) c1251.f3635;
                if (editText != null) {
                    editText.setHint("期待你的评论");
                    return;
                } else {
                    AbstractC4394.m8918("inputEdit");
                    throw null;
                }
            case 1:
                C8226 c8226 = (C8226) ((C3004) obj).f9535;
                c8226.getClass();
                AbstractC3737.m8043(new RunnableC8233(c8226, 1));
                return;
            case 2:
                C9088 c9088 = new C9088(((C9092) obj).m13431());
                C8684 c8684 = new C8684(c9088);
                C8226 c82262 = c9088.f25381;
                c82262.f22707 = c8684;
                if (c82262.f22709 != null) {
                    AbstractC3737.m8043(new RunnableC8233(c82262, 0));
                }
                C8685 c8685 = new C8685(c9088, 3);
                c82262.f22701 = c8685;
                if (c82262.f11579) {
                    c8685.mo8079(c82262.f22702);
                }
                c82262.m13733();
                return;
            default:
                TextView textView = (TextView) obj;
                C7466 c7466 = new C7466();
                c7466.mo12645(300L);
                ViewParent parent = textView.getParent();
                parent.getClass();
                AbstractC7478.m12668((ViewGroup) parent, c7466);
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

    public /* synthetic */ ViewOnClickListenerC9091(Object obj, int i) {
        this.f25400 = i;
        this.f25399 = obj;
    }
}
