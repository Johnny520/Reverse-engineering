package p273;

import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT;
import lin.xposed.hook.javaplugin.view.C6380;
import p339.C9545;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC9064 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C9068 f23075;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f23076;

    public /* synthetic */ ViewOnClickListenerC9064(C9068 c9068, int i) {
        this.f23076 = i;
        this.f23075 = c9068;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f23076;
        C9068 c9068 = this.f23075;
        switch (i) {
            case 0:
                AbstractC4570.m8595(view);
                C9069 c9069 = c9068.f23090;
                BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT = BaseDialog$BUTTON_SELECT_RESULT.NONE;
                C6380 c6380 = c9069.f23104;
                if (c6380 == null) {
                    c9069.m14323();
                } else if (!c6380.onClick(c9069.f23111, view)) {
                    c9069.m14323();
                }
                break;
            case 1:
                AbstractC4570.m8595(view);
                C9069 c90692 = c9068.f23090;
                BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT2 = BaseDialog$BUTTON_SELECT_RESULT.NONE;
                c90692.m14323();
                break;
            case 2:
                AbstractC4570.m8595(view);
                C9069 c90693 = c9068.f23090;
                BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT3 = BaseDialog$BUTTON_SELECT_RESULT.NONE;
                C9545 c9545 = c90693.f23116;
                if (c9545 == null) {
                    c90693.m14323();
                } else if (!c9545.onClick(c90693.f23111, view)) {
                    c90693.m14323();
                }
                break;
            case 3:
                c9068.m14317(view);
                break;
            default:
                c9068.f23086.callOnClick();
                break;
        }
    }
}
