package p000;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.github.megatronking.stringfog.Base64;
import com.ljx.wechatmod.p001ui.MainActivity;

/* JADX INFO: renamed from: ya */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0923ya implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5368a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5369b;

    public /* synthetic */ ViewOnClickListenerC0923ya(int i, Object obj) {
        this.f5368a = i;
        this.f5369b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5368a) {
            case Base64.DEFAULT /* 0 */:
                C0098cb c0098cb = (C0098cb) this.f5369b;
                EditText editText = c0098cb.f865i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                c0098cb.m1403p();
                return;
            case Base64.NO_PADDING /* 1 */:
                ((C0670rh) this.f5369b).m2292t();
                return;
            case Base64.NO_WRAP /* 2 */:
                ((FrameLayout) this.f5369b).performClick();
                return;
            case 3:
                TextView textView = (TextView) this.f5369b;
                C0417kn c0417kn = C0417kn.f2847a;
                AbstractC0493mp.m1854d(view);
                c0417kn.getClass();
                C0417kn.m1698i(view, 1);
                textView.setText("\u5df2\u6e05\u7a7a");
                return;
            case 4:
                MainActivity.initSukiStyleUI$lambda$46$lambda$45((MainActivity) this.f5369b, view);
                return;
            case 5:
                ((C0200eu) this.f5369b).m1022E();
                throw null;
            default:
                C0797ux c0797ux = (C0797ux) this.f5369b;
                EditText editText2 = c0797ux.f4853f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = c0797ux.f4853f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    c0797ux.f4853f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    c0797ux.f4853f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    c0797ux.f4853f.setSelection(selectionEnd);
                }
                c0797ux.m1403p();
                return;
        }
    }
}
