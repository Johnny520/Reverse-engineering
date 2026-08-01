package p257;

import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT;
import lin.xposed.hook.javaplugin.view.C5548;
import p319.C8683;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC8234 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8238 f22731;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22732;

    public /* synthetic */ ViewOnClickListenerC8234(C8238 c8238, int i) {
        this.f22732 = i;
        this.f22731 = c8238;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f22732;
        C8238 c8238 = this.f22731;
        switch (i) {
            case 0:
                AbstractC3737.m8049(view);
                C8239 c8239 = c8238.f22746;
                BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT = BaseDialog$BUTTON_SELECT_RESULT.NONE;
                C5548 c5548 = c8239.f22760;
                if (c5548 == null) {
                    c8239.m13747();
                } else if (!c5548.onClick(c8239.f22767, view)) {
                    c8239.m13747();
                }
                break;
            case 1:
                AbstractC3737.m8049(view);
                C8239 c82392 = c8238.f22746;
                BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT2 = BaseDialog$BUTTON_SELECT_RESULT.NONE;
                c82392.m13747();
                break;
            case 2:
                AbstractC3737.m8049(view);
                C8239 c82393 = c8238.f22746;
                BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT3 = BaseDialog$BUTTON_SELECT_RESULT.NONE;
                C8683 c8683 = c82393.f22772;
                if (c8683 == null) {
                    c82393.m13747();
                } else if (!c8683.onClick(c82393.f22767, view)) {
                    c82393.m13747();
                }
                break;
            case 3:
                c8238.m13742(view);
                break;
            default:
                c8238.f22742.callOnClick();
                break;
        }
    }
}
