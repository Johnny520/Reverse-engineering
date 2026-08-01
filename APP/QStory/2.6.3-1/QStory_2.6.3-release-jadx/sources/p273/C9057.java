package p273;

import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.AbstractC4581;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9057 extends C9037 {
    @Override // p273.C9037
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final void mo14279(boolean z) {
        this.f22963 = BaseDialog$BOOLEAN.TRUE;
        mo14280();
    }

    @Override // p273.C9037
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final void mo14281(String str) {
        this.f22971 = str;
        mo14280();
    }

    @Override // p273.C9037
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public final C9037 mo14282(AbstractC4581 abstractC4581) {
        this.f22961 = abstractC4581;
        mo14280();
        return this;
    }

    @Override // p273.C9037
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final boolean mo14284() {
        BaseDialog$BOOLEAN baseDialog$BOOLEAN = this.f22963;
        return baseDialog$BOOLEAN != null ? baseDialog$BOOLEAN == BaseDialog$BOOLEAN.TRUE : this.f11930;
    }

    @Override // p273.C9037
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final View mo14285() {
        AbstractC4581 abstractC4581 = this.f22961;
        if (abstractC4581 == null) {
            return null;
        }
        return abstractC4581.getCustomView();
    }

    @Override // p273.C9037, com.kongzue.dialogx.interfaces.AbstractC4570
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo8607() {
        EditText editText;
        if (m8614() != null) {
            AbstractC4570.m8590(m8614());
            this.f11929 = false;
        }
        RelativeLayout relativeLayout = this.f22965.f22986;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        int iM8618 = m8618(mo8603()) != 0 ? m8618(mo8603()) : this.f11928.mo10454(mo8603());
        if (iM8618 == 0) {
            iM8618 = mo8603() ? C0328R.layout.layout_dialogx_material : C0328R.layout.layout_dialogx_material_dark;
        }
        C9038 c9038 = this.f22965;
        String string = (c9038 == null || (editText = c9038.f22990) == null) ? this.f22972 : editText.getText().toString();
        this.f11925 = 0L;
        View viewM8610 = m8610(iM8618);
        this.f22965 = new C9038(this, viewM8610);
        if (viewM8610 != null) {
            viewM8610.setTag(this.f22960);
        }
        AbstractC4570.m8587(viewM8610);
        this.f22972 = string;
        mo14280();
    }

    @Override // p273.C9037, com.kongzue.dialogx.interfaces.AbstractC4570
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8609() {
        return C9057.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }
}
