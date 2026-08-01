package p257;

import android.view.View;
import android.widget.EditText;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT;
import com.kongzue.dialogx.interfaces.InterfaceC3736;
import com.kongzue.dialogx.interfaces.InterfaceC3743;
import com.kongzue.dialogx.interfaces.InterfaceC3749;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC8225 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8208 f22699;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22700;

    public /* synthetic */ ViewOnClickListenerC8225(C8208 c8208, int i) {
        this.f22700 = i;
        this.f22699 = c8208;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f22700;
        C8208 c8208 = this.f22699;
        switch (i) {
            case 0:
                C8207 c8207 = c8208.f22641;
                BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT = BaseDialog$BUTTON_SELECT_RESULT.NONE;
                c8207.getClass();
                EditText editText = c8208.f22646;
                if (editText != null) {
                    c8207.m8067(editText, false);
                }
                c8207.getClass();
                AbstractC3737.m8049(view);
                InterfaceC3736 interfaceC3736 = c8207.f22624;
                if (interfaceC3736 != null) {
                    if (interfaceC3736 instanceof InterfaceC3743) {
                        if (!((InterfaceC3743) c8207.f22624).mo8075(c8207.f22616, view, editText != null ? editText.getText().toString() : "")) {
                            c8208.m13717(view);
                        }
                        break;
                    } else if ((interfaceC3736 instanceof InterfaceC3749) && !((InterfaceC3749) interfaceC3736).onClick(c8207.f22616, view)) {
                        c8208.m13717(view);
                        break;
                    }
                } else {
                    c8208.m13717(view);
                    break;
                }
                break;
            case 1:
                C8207 c82072 = c8208.f22641;
                BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT2 = BaseDialog$BUTTON_SELECT_RESULT.NONE;
                c82072.getClass();
                EditText editText2 = c8208.f22646;
                if (editText2 != null) {
                    c82072.m8067(editText2, false);
                }
                c82072.getClass();
                AbstractC3737.m8049(view);
                InterfaceC3749 interfaceC3749 = c82072.f22623;
                if (interfaceC3749 == null) {
                    c8208.m13717(view);
                } else if (!(interfaceC3749 instanceof InterfaceC3743)) {
                    if (!interfaceC3749.onClick(c82072.f22616, view)) {
                        c8208.m13717(view);
                    }
                } else if (!((InterfaceC3743) c82072.f22623).mo8075(c82072.f22616, view, editText2 != null ? editText2.getText().toString() : "")) {
                    c8208.m13717(view);
                }
                break;
            case 2:
                C8207 c82073 = c8208.f22641;
                BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT3 = BaseDialog$BUTTON_SELECT_RESULT.NONE;
                c82073.getClass();
                EditText editText3 = c8208.f22646;
                if (editText3 != null) {
                    c82073.m8067(editText3, false);
                }
                c82073.getClass();
                AbstractC3737.m8049(view);
                InterfaceC3749 interfaceC37492 = c82073.f22622;
                if (interfaceC37492 == null) {
                    c8208.m13717(view);
                } else if (!(interfaceC37492 instanceof InterfaceC3743)) {
                    if (!interfaceC37492.onClick(c82073.f22616, view)) {
                        c8208.m13717(view);
                    }
                } else if (!((InterfaceC3743) c82073.f22622).mo8075(c82073.f22616, view, editText3 != null ? editText3.getText().toString() : "")) {
                    c8208.m13717(view);
                }
                break;
            default:
                c8208.f22641.getClass();
                c8208.m13717(view);
                break;
        }
    }
}
