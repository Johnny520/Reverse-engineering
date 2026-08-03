package p056f0;

import android.app.Activity;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p031Q0.C0313m;

/* JADX INFO: renamed from: f0.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0834m implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3016a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3017b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3018c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f3019d;

    public /* synthetic */ ViewOnClickListenerC0834m(Object obj, Object obj2, Object obj3, int i2) {
        this.f3016a = i2;
        this.f3018c = obj;
        this.f3019d = obj2;
        this.f3017b = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3016a) {
            case 0:
                C0797H c0797h = (C0797H) this.f3018c;
                AbstractC0307g.m703e(c0797h, "$item");
                Activity activity = (Activity) this.f3019d;
                AbstractC0307g.m703e(activity, "$host");
                InterfaceC0275a interfaceC0275a = (InterfaceC0275a) this.f3017b;
                AbstractC0307g.m703e(interfaceC0275a, "$onToggle");
                c0797h.f2897f.mo518b(activity, interfaceC0275a);
                return;
            case 1:
                EditText editText = (EditText) this.f3018c;
                AbstractC0307g.m703e(editText, "$target");
                String str = (String) this.f3019d;
                AbstractC0307g.m703e(str, "$tag");
                int iMax = Math.max(0, editText.getSelectionStart());
                int iMax2 = Math.max(0, editText.getSelectionEnd());
                int iMin = Math.min(iMax, iMax2);
                int iMax3 = Math.max(iMax, iMax2);
                if (editText.getText() != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.replace(iMin, iMax3, str, 0, str.length());
                    }
                } else {
                    editText.append(str);
                }
                editText.requestFocus();
                InterfaceC0275a interfaceC0275a2 = (InterfaceC0275a) this.f3017b;
                if (interfaceC0275a2 != null) {
                    interfaceC0275a2.invoke();
                    return;
                }
                return;
            default:
                C0313m c0313m = (C0313m) this.f3018c;
                AbstractC0307g.m703e(c0313m, "$currentTab");
                EnumC0806Q enumC0806Q = (EnumC0806Q) this.f3019d;
                AbstractC0307g.m703e(enumC0806Q, "$tab");
                C0313m c0313m2 = (C0313m) this.f3017b;
                AbstractC0307g.m703e(c0313m2, "$render");
                if (c0313m.f595a != enumC0806Q) {
                    c0313m.f595a = enumC0806Q;
                    Object obj = c0313m2.f595a;
                    if (obj != null) {
                        ((InterfaceC0275a) obj).invoke();
                        return;
                    } else {
                        AbstractC0307g.m705g("render");
                        throw null;
                    }
                }
                return;
        }
    }
}
