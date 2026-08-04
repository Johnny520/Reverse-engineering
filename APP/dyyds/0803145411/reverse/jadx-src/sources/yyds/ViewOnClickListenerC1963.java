package yyds;

import android.view.View;
import android.widget.EditText;
import com.kongzue.dialogx.interfaces.AbstractC0041;

/* JADX INFO: renamed from: yyds.ᲀᛳᛴᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1963 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f9857;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C2283 f9858;

    public /* synthetic */ ViewOnClickListenerC1963(C2283 c2283, int i) {
        this.f9857 = i;
        this.f9858 = c2283;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f9857;
        C2283 c2283 = this.f9858;
        switch (i) {
            case 0:
                C1188 c1188 = (C1188) c2283.f11233;
                EditText editText = c2283.f11239;
                if (editText != null) {
                    c1188.m281(editText, false);
                }
                AbstractC0041.m263(view);
                C1188 c11882 = c1188.f5446;
                InterfaceC2185 interfaceC2185 = c1188.f5444;
                if (interfaceC2185 != null) {
                    if (interfaceC2185 instanceof C1616) {
                        if (!((C1616) c1188.f5444).m3310(c1188.f5446, editText != null ? editText.getText().toString() : "")) {
                            c2283.m4290(view);
                        }
                        break;
                    } else if (interfaceC2185 instanceof InterfaceC1376) {
                        if (!((InterfaceC1376) interfaceC2185).mo912(c11882)) {
                            c2283.m4290(view);
                        }
                        break;
                    } else if ((interfaceC2185 instanceof InterfaceC1006) && !((InterfaceC1006) interfaceC2185).mo1031(c11882)) {
                        c2283.m4290(view);
                        break;
                    }
                } else {
                    c2283.m4290(view);
                    break;
                }
                break;
            case 1:
                C1188 c11883 = (C1188) c2283.f11233;
                EditText editText2 = c2283.f11239;
                if (editText2 != null) {
                    c11883.m281(editText2, false);
                }
                AbstractC0041.m263(view);
                C1188 c11884 = c11883.f5446;
                InterfaceC1376 interfaceC1376 = c11883.f5439;
                if (interfaceC1376 == null) {
                    c2283.m4290(view);
                } else if (!(interfaceC1376 instanceof C1616)) {
                    if (!(interfaceC1376 instanceof InterfaceC1006)) {
                        if (!interfaceC1376.mo912(c11884)) {
                            c2283.m4290(view);
                        }
                    } else if (!((InterfaceC1006) interfaceC1376).mo1031(c11884)) {
                        c2283.m4290(view);
                    }
                } else if (!((C1616) c11883.f5439).m3310(c11883.f5446, editText2 != null ? editText2.getText().toString() : "")) {
                    c2283.m4290(view);
                }
                break;
            case 2:
                C1188 c11885 = (C1188) c2283.f11233;
                EditText editText3 = c2283.f11239;
                if (editText3 != null) {
                    c11885.m281(editText3, false);
                }
                AbstractC0041.m263(view);
                AbstractC0041 abstractC0041 = c11885.f5446;
                InterfaceC1376 interfaceC13762 = c11885.f5442;
                if (interfaceC13762 == null) {
                    c2283.m4290(view);
                } else if (!(interfaceC13762 instanceof InterfaceC1006)) {
                    if (!interfaceC13762.mo912(abstractC0041)) {
                        c2283.m4290(view);
                    }
                } else if (!((InterfaceC1006) interfaceC13762).mo1031(abstractC0041)) {
                    c2283.m4290(view);
                }
                break;
            default:
                c2283.m4290(view);
                break;
        }
    }
}
