package p257;

import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT;
import lin.xposed.hook.javaplugin.view.C5549;
import p323.C8716;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC8235 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8239 f22730;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22731;

    public /* synthetic */ ViewOnClickListenerC8235(C8239 c8239, int i) {
        this.f22731 = i;
        this.f22730 = c8239;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f22731;
        C8239 c8239 = this.f22730;
        switch (i) {
            case 0:
                AbstractC3738.m8036(view);
                C8240 c8240 = c8239.f22745;
                BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT = BaseDialog$BUTTON_SELECT_RESULT.NONE;
                C5549 c5549 = c8240.f22759;
                if (c5549 == null) {
                    c8240.m13764();
                } else if (!c5549.onClick(c8240.f22766, view)) {
                    c8240.m13764();
                }
                break;
            case 1:
                AbstractC3738.m8036(view);
                C8240 c82402 = c8239.f22745;
                BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT2 = BaseDialog$BUTTON_SELECT_RESULT.NONE;
                c82402.m13764();
                break;
            case 2:
                AbstractC3738.m8036(view);
                C8240 c82403 = c8239.f22745;
                BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT3 = BaseDialog$BUTTON_SELECT_RESULT.NONE;
                C8716 c8716 = c82403.f22771;
                if (c8716 == null) {
                    c82403.m13764();
                } else if (!c8716.onClick(c82403.f22766, view)) {
                    c82403.m13764();
                }
                break;
            case 3:
                c8239.m13758(view);
                break;
            default:
                c8239.f22741.callOnClick();
                break;
        }
    }
}
