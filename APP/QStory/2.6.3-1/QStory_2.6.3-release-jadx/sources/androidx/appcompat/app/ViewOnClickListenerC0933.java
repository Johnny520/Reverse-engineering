package androidx.appcompat.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.widget.C1006;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.animation.core.C1171;
import androidx.recyclerview.widget.C3325;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import p022.C6946;
import p044.DialogC7148;
import p055.ViewOnClickListenerC7239;
import p206.C8629;
import p208.AbstractC8639;
import p273.C9052;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0933 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f602;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f603;

    public /* synthetic */ ViewOnClickListenerC0933(Object obj, int i) {
        this.f603 = i;
        this.f602 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f603;
        Object obj = this.f602;
        switch (i) {
            case 0:
                C0953 c0953 = (C0953) obj;
                c0953.f646.obtainMessage(1, c0953.f640).sendToTarget();
                break;
            case 1:
                ((AbstractC8639) obj).mo971();
                break;
            case 2:
                C1006 c1006 = ((Toolbar) obj).f867;
                C8629 c8629 = c1006 != null ? c1006.f988 : null;
                if (c8629 != null) {
                    c8629.collapseActionView();
                }
                break;
            case 3:
                ((C6946) obj).m5003().finish();
                break;
            case 4:
                ViewOnClickListenerC7239 viewOnClickListenerC7239 = (ViewOnClickListenerC7239) obj;
                Context context = view.getContext();
                viewOnClickListenerC7239.f17931 = new DialogC7148(context);
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C0328R.layout.set_pic_summary, (ViewGroup) null, false);
                EditText editText = (EditText) viewGroup.findViewById(C0328R.id.summary_edit);
                viewOnClickListenerC7239.f17928 = editText;
                editText.setText(viewOnClickListenerC7239.m12526());
                ((Button) viewGroup.findViewById(C0328R.id.save_summary_btn)).setOnClickListener(viewOnClickListenerC7239);
                viewOnClickListenerC7239.f17931.setContentView(viewGroup);
                viewOnClickListenerC7239.f17931.show();
                break;
            case 5:
                ((C1171) obj).m1538(view);
                break;
            case 6:
                C9052 c9052 = (C9052) obj;
                c9052.f23036.getClass();
                c9052.m14308(view);
                break;
            default:
                AbstractC4570.m8595(view);
                ((C3325) obj).m5493(view);
                break;
        }
    }
}
