package androidx.appcompat.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.widget.C0159;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.animation.core.C0325;
import androidx.recyclerview.widget.C2492;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import p008.C6150;
import p027.DialogC6300;
import p038.ViewOnClickListenerC6416;
import p190.C7799;
import p192.AbstractC7809;
import p257.C8222;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0086 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f257;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f258;

    public /* synthetic */ ViewOnClickListenerC0086(Object obj, int i) {
        this.f258 = i;
        this.f257 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f258;
        Object obj = this.f257;
        switch (i) {
            case 0:
                C0106 c0106 = (C0106) obj;
                c0106.f301.obtainMessage(1, c0106.f295).sendToTarget();
                break;
            case 1:
                ((AbstractC7809) obj).mo410();
                break;
            case 2:
                C0159 c0159 = ((Toolbar) obj).f522;
                C7799 c7799 = c0159 != null ? c0159.f643 : null;
                if (c7799 != null) {
                    c7799.collapseActionView();
                }
                break;
            case 3:
                ((C6150) obj).m4433().finish();
                break;
            case 4:
                ViewOnClickListenerC6416 viewOnClickListenerC6416 = (ViewOnClickListenerC6416) obj;
                Context context = view.getContext();
                viewOnClickListenerC6416.f17580 = new DialogC6300(context);
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.set_pic_summary, (ViewGroup) null, false);
                EditText editText = (EditText) viewGroup.findViewById(R.id.summary_edit);
                viewOnClickListenerC6416.f17577 = editText;
                editText.setText(viewOnClickListenerC6416.m11928());
                ((Button) viewGroup.findViewById(R.id.save_summary_btn)).setOnClickListener(viewOnClickListenerC6416);
                viewOnClickListenerC6416.f17580.setContentView(viewGroup);
                viewOnClickListenerC6416.f17580.show();
                break;
            case 5:
                ((C0325) obj).m978(view);
                break;
            case 6:
                ((C8222) obj).m13732(view);
                break;
            default:
                AbstractC3737.m8049(view);
                ((C2492) obj).m4923(view);
                break;
        }
    }
}
