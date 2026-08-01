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
import com.kongzue.dialogx.interfaces.AbstractC3738;
import p006.C6117;
import p028.DialogC6319;
import p039.ViewOnClickListenerC6410;
import p190.C7800;
import p192.AbstractC7810;
import p257.C8223;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
                ((AbstractC7810) obj).mo411();
                break;
            case 2:
                C0159 c0159 = ((Toolbar) obj).f522;
                C7800 c7800 = c0159 != null ? c0159.f643 : null;
                if (c7800 != null) {
                    c7800.collapseActionView();
                }
                break;
            case 3:
                ((C6117) obj).m4443().finish();
                break;
            case 4:
                ViewOnClickListenerC6410 viewOnClickListenerC6410 = (ViewOnClickListenerC6410) obj;
                Context context = view.getContext();
                viewOnClickListenerC6410.f17586 = new DialogC6319(context);
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.set_pic_summary, (ViewGroup) null, false);
                EditText editText = (EditText) viewGroup.findViewById(R.id.summary_edit);
                viewOnClickListenerC6410.f17583 = editText;
                editText.setText(viewOnClickListenerC6410.m11967());
                ((Button) viewGroup.findViewById(R.id.save_summary_btn)).setOnClickListener(viewOnClickListenerC6410);
                viewOnClickListenerC6410.f17586.setContentView(viewGroup);
                viewOnClickListenerC6410.f17586.show();
                break;
            case 5:
                ((C0325) obj).m978(view);
                break;
            case 6:
                C8223 c8223 = (C8223) obj;
                c8223.f22691.getClass();
                c8223.m13749(view);
                break;
            default:
                AbstractC3738.m8036(view);
                ((C2492) obj).m4933(view);
                break;
        }
    }
}
