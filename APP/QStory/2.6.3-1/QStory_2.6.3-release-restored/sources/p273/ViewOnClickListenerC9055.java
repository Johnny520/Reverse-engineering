package p273;

import android.view.View;
import android.widget.EditText;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT;
import com.kongzue.dialogx.interfaces.InterfaceC4569;
import com.kongzue.dialogx.interfaces.InterfaceC4576;
import com.kongzue.dialogx.interfaces.InterfaceC4582;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC9055 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C9038 f23043;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f23044;

    public /* synthetic */ ViewOnClickListenerC9055(C9038 c9038, int i) {
        this.f23044 = i;
        this.f23043 = c9038;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f23044;
        C9038 c9038 = this.f23043;
        switch (i) {
            case 0:
                C9037 c9037 = c9038.f22985;
                BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT = BaseDialog$BUTTON_SELECT_RESULT.NONE;
                c9037.getClass();
                EditText editText = c9038.f22990;
                if (editText != null) {
                    c9037.m8613(editText, false);
                }
                c9037.getClass();
                AbstractC4570.m8595(view);
                InterfaceC4569 interfaceC4569 = c9037.f22968;
                if (interfaceC4569 != null) {
                    if (interfaceC4569 instanceof InterfaceC4576) {
                        if (!((InterfaceC4576) c9037.f22968).mo8621(c9037.f22960, view, editText != null ? editText.getText().toString() : "")) {
                            c9038.m14293(view);
                        }
                        break;
                    } else if ((interfaceC4569 instanceof InterfaceC4582) && !((InterfaceC4582) interfaceC4569).onClick(c9037.f22960, view)) {
                        c9038.m14293(view);
                        break;
                    }
                } else {
                    c9038.m14293(view);
                    break;
                }
                break;
            case 1:
                C9037 c90372 = c9038.f22985;
                BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT2 = BaseDialog$BUTTON_SELECT_RESULT.NONE;
                c90372.getClass();
                EditText editText2 = c9038.f22990;
                if (editText2 != null) {
                    c90372.m8613(editText2, false);
                }
                c90372.getClass();
                AbstractC4570.m8595(view);
                InterfaceC4582 interfaceC4582 = c90372.f22967;
                if (interfaceC4582 == null) {
                    c9038.m14293(view);
                } else if (!(interfaceC4582 instanceof InterfaceC4576)) {
                    if (!interfaceC4582.onClick(c90372.f22960, view)) {
                        c9038.m14293(view);
                    }
                } else if (!((InterfaceC4576) c90372.f22967).mo8621(c90372.f22960, view, editText2 != null ? editText2.getText().toString() : "")) {
                    c9038.m14293(view);
                }
                break;
            case 2:
                C9037 c90373 = c9038.f22985;
                BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT3 = BaseDialog$BUTTON_SELECT_RESULT.NONE;
                c90373.getClass();
                EditText editText3 = c9038.f22990;
                if (editText3 != null) {
                    c90373.m8613(editText3, false);
                }
                c90373.getClass();
                AbstractC4570.m8595(view);
                InterfaceC4582 interfaceC45822 = c90373.f22966;
                if (interfaceC45822 == null) {
                    c9038.m14293(view);
                } else if (!(interfaceC45822 instanceof InterfaceC4576)) {
                    if (!interfaceC45822.onClick(c90373.f22960, view)) {
                        c9038.m14293(view);
                    }
                } else if (!((InterfaceC4576) c90373.f22966).mo8621(c90373.f22960, view, editText3 != null ? editText3.getText().toString() : "")) {
                    c9038.m14293(view);
                }
                break;
            default:
                c9038.f22985.getClass();
                c9038.m14293(view);
                break;
        }
    }
}
