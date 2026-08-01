package p257;

import android.view.View;
import android.widget.EditText;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT;
import com.kongzue.dialogx.interfaces.InterfaceC3737;
import com.kongzue.dialogx.interfaces.InterfaceC3744;
import com.kongzue.dialogx.interfaces.InterfaceC3750;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC8226 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8209 f22698;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22699;

    public /* synthetic */ ViewOnClickListenerC8226(C8209 c8209, int i) {
        this.f22699 = i;
        this.f22698 = c8209;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f22699;
        C8209 c8209 = this.f22698;
        switch (i) {
            case 0:
                C8208 c8208 = c8209.f22640;
                BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT = BaseDialog$BUTTON_SELECT_RESULT.NONE;
                c8208.getClass();
                EditText editText = c8209.f22645;
                if (editText != null) {
                    c8208.m8054(editText, false);
                }
                c8208.getClass();
                AbstractC3738.m8036(view);
                InterfaceC3737 interfaceC3737 = c8208.f22623;
                if (interfaceC3737 != null) {
                    if (interfaceC3737 instanceof InterfaceC3744) {
                        if (!((InterfaceC3744) c8208.f22623).mo8062(c8208.f22615, view, editText != null ? editText.getText().toString() : "")) {
                            c8209.m13734(view);
                        }
                        break;
                    } else if ((interfaceC3737 instanceof InterfaceC3750) && !((InterfaceC3750) interfaceC3737).onClick(c8208.f22615, view)) {
                        c8209.m13734(view);
                        break;
                    }
                } else {
                    c8209.m13734(view);
                    break;
                }
                break;
            case 1:
                C8208 c82082 = c8209.f22640;
                BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT2 = BaseDialog$BUTTON_SELECT_RESULT.NONE;
                c82082.getClass();
                EditText editText2 = c8209.f22645;
                if (editText2 != null) {
                    c82082.m8054(editText2, false);
                }
                c82082.getClass();
                AbstractC3738.m8036(view);
                InterfaceC3750 interfaceC3750 = c82082.f22622;
                if (interfaceC3750 == null) {
                    c8209.m13734(view);
                } else if (!(interfaceC3750 instanceof InterfaceC3744)) {
                    if (!interfaceC3750.onClick(c82082.f22615, view)) {
                        c8209.m13734(view);
                    }
                } else if (!((InterfaceC3744) c82082.f22622).mo8062(c82082.f22615, view, editText2 != null ? editText2.getText().toString() : "")) {
                    c8209.m13734(view);
                }
                break;
            case 2:
                C8208 c82083 = c8209.f22640;
                BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT3 = BaseDialog$BUTTON_SELECT_RESULT.NONE;
                c82083.getClass();
                EditText editText3 = c8209.f22645;
                if (editText3 != null) {
                    c82083.m8054(editText3, false);
                }
                c82083.getClass();
                AbstractC3738.m8036(view);
                InterfaceC3750 interfaceC37502 = c82083.f22621;
                if (interfaceC37502 == null) {
                    c8209.m13734(view);
                } else if (!(interfaceC37502 instanceof InterfaceC3744)) {
                    if (!interfaceC37502.onClick(c82083.f22615, view)) {
                        c8209.m13734(view);
                    }
                } else if (!((InterfaceC3744) c82083.f22621).mo8062(c82083.f22615, view, editText3 != null ? editText3.getText().toString() : "")) {
                    c8209.m13734(view);
                }
                break;
            default:
                c8209.f22640.getClass();
                c8209.m13734(view);
                break;
        }
    }
}
