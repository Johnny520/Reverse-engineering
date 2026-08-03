package p000a;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.datepicker.C1285d;
import p000a.C0425X9;

/* JADX INFO: renamed from: a.h3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0606h3 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2236a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2237b;

    public /* synthetic */ ViewOnClickListenerC0606h3(int i, Object obj) {
        this.f2236a = i;
        this.f2237b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        switch (this.f2236a) {
            case 0:
                C0682l3 c0682l3 = (C0682l3) this.f2237b;
                EditText editText = c0682l3.f2539i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    c0682l3.m1269q();
                    break;
                }
                break;
            case 1:
                ((C0098F5) this.f2237b).m275u();
                break;
            case 2:
                ((C0425X9.a.C1333a) this.f2237b).f1594c.mo31a();
                break;
            case 3:
                ((InterfaceC0819s7) this.f2237b).mo31a();
                break;
            case 4:
                ((C0537da) this.f2237b).mo31a();
                break;
            case 5:
                ((C0004A3) this.f2237b).mo31a();
                break;
            case 6:
                C1285d c1285d = (C1285d) this.f2237b;
                c1285d.f5720K0.setEnabled(c1285d.m3219H().m429h());
                c1285d.f5718I0.toggle();
                c1285d.f5737x0 = c1285d.f5737x0 == 1 ? 0 : 1;
                c1285d.m3221L(c1285d.f5718I0);
                c1285d.m3220K();
                break;
            default:
                C0786qc c0786qc = (C0786qc) this.f2237b;
                EditText editText2 = c0786qc.f3105f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = c0786qc.f3105f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        c0786qc.f3105f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        c0786qc.f3105f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        c0786qc.f3105f.setSelection(selectionEnd);
                    }
                    c0786qc.m1269q();
                    break;
                }
                break;
        }
    }
}
