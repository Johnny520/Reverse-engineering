package p000;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.github.megatronking.stringfog.Base64;
import com.ljx.wechatmod.p001ui.MainActivity;

/* JADX INFO: renamed from: qa */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0627qa implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4048a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4049b;

    public /* synthetic */ ViewOnClickListenerC0627qa(int i, Object obj) {
        this.f4048a = i;
        this.f4049b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4048a) {
            case Base64.DEFAULT /* 0 */:
                C0775ua c0775ua = (C0775ua) this.f4049b;
                EditText editText = c0775ua.f4703i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                c0775ua.m1228p();
                return;
            case Base64.NO_PADDING /* 1 */:
                ((C0597ph) this.f4049b).m2118t();
                return;
            case Base64.NO_WRAP /* 2 */:
                ((FrameLayout) this.f4049b).performClick();
                return;
            case 3:
                TextView textView = (TextView) this.f4049b;
                C0267gn c0267gn = C0267gn.f2144a;
                AbstractC0346ip.m1500l(view);
                c0267gn.getClass();
                C0267gn.m1289i(view, 1);
                textView.setText("\u5df2\u6e05\u7a7a");
                return;
            case 4:
                MainActivity.initSukiStyleUI$lambda$46$lambda$45((MainActivity) this.f4049b, view);
                return;
            case 5:
                ((C0081bu) this.f4049b).m573E();
                throw null;
            default:
                C0501mx c0501mx = (C0501mx) this.f4049b;
                EditText editText2 = c0501mx.f3295f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = c0501mx.f3295f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    c0501mx.f3295f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    c0501mx.f3295f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    c0501mx.f3295f.setSelection(selectionEnd);
                }
                c0501mx.m1228p();
                return;
        }
    }
}
