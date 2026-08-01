package p402;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.internal.C2086;
import com.bumptech.glide.load.engine.C3837;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import kotlin.jvm.internal.AbstractC5227;
import p144.AbstractC8308;
import p144.C8296;
import p273.C9056;
import p273.C9069;
import p273.RunnableC9063;
import p339.C9536;
import p339.C9537;
import p358.C9646;
import top.suzhelan.plugin.sdk.online.presenter.C6637;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC9907 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f25794;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25795;

    public /* synthetic */ ViewOnClickListenerC9907(C9646 c9646, TextView textView) {
        this.f25795 = 3;
        this.f25794 = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f25795;
        Object obj = this.f25794;
        switch (i) {
            case 0:
                C2086 c2086 = (C2086) obj;
                ((C6637) c2086.f3974).f16269 = null;
                EditText editText = (EditText) c2086.f3981;
                if (editText != null) {
                    editText.setHint("期待你的评论");
                    return;
                } else {
                    AbstractC5227.m9467("inputEdit");
                    throw null;
                }
            case 1:
                C9056 c9056 = (C9056) ((C3837) obj).f9882;
                c9056.getClass();
                AbstractC4570.m8589(new RunnableC9063(c9056, 1));
                return;
            case 2:
                C9904 c9904 = new C9904(((C9908) obj).m14018());
                C9536 c9536 = new C9536(c9904);
                C9069 c9069 = c9904.f25776;
                c9069.f23109 = c9536;
                c9069.m14322();
                c9069.m14320(new C9537(c9904, 3));
                c9069.m14319();
                return;
            default:
                TextView textView = (TextView) obj;
                C8296 c8296 = new C8296();
                c8296.mo13231(300L);
                ViewParent parent = textView.getParent();
                parent.getClass();
                AbstractC8308.m13256((ViewGroup) parent, c8296);
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

    public /* synthetic */ ViewOnClickListenerC9907(Object obj, int i) {
        this.f25795 = i;
        this.f25794 = obj;
    }
}
