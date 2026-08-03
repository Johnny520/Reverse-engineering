package p001A0;

import android.app.Dialog;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import com.abc.core.features.MessageDetailHook;
import com.abc.ui.C0752m;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: A0.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0025a implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f65b;

    public /* synthetic */ ViewOnClickListenerC0025a(int i2, Object obj) {
        this.f64a = i2;
        this.f65b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f64a) {
            case 0:
                C0030f c0030f = (C0030f) this.f65b;
                EditText editText = c0030f.f78i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    c0030f.m156q();
                    break;
                }
                break;
            case 1:
                ((C0039o) this.f65b).m78u();
                break;
            case 2:
                C0050z c0050z = (C0050z) this.f65b;
                EditText editText2 = c0050z.f178f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = c0050z.f178f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        c0050z.f178f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        c0050z.f178f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        c0050z.f178f.setSelection(selectionEnd);
                    }
                    c0050z.m156q();
                    break;
                }
                break;
            case 3:
                View view2 = (View) this.f65b;
                AbstractC0307g.m703e(view2, "$host");
                ViewParent parent = view2.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup == null) {
                    View rootView = view2.getRootView();
                    ViewGroup viewGroup2 = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
                    if (viewGroup2 != null) {
                        viewGroup = viewGroup2;
                    }
                }
                MessageDetailHook.m1595m0(viewGroup);
                break;
            case 4:
                C0752m c0752m = (C0752m) this.f65b;
                AbstractC0307g.m703e(c0752m, "$item");
                c0752m.f2625d.invoke();
                break;
            default:
                Dialog dialog = (Dialog) this.f65b;
                AbstractC0307g.m703e(dialog, "$dialog");
                dialog.dismiss();
                break;
        }
    }
}
