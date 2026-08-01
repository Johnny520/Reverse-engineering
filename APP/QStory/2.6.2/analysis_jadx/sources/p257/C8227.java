package p257;

import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.AbstractC3748;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8227 extends C8207 {
    @Override // p257.C8207
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final void mo13703(boolean z) {
        this.f22619 = BaseDialog$BOOLEAN.TRUE;
        mo13704();
    }

    @Override // p257.C8207
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final void mo13705(String str) {
        this.f22627 = str;
        mo13704();
    }

    @Override // p257.C8207
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public final C8207 mo13706(AbstractC3748 abstractC3748) {
        this.f22617 = abstractC3748;
        mo13704();
        return this;
    }

    @Override // p257.C8207
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final boolean mo13708() {
        BaseDialog$BOOLEAN baseDialog$BOOLEAN = this.f22619;
        return baseDialog$BOOLEAN != null ? baseDialog$BOOLEAN == BaseDialog$BOOLEAN.TRUE : this.f11580;
    }

    @Override // p257.C8207
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final View mo13709() {
        AbstractC3748 abstractC3748 = this.f22617;
        if (abstractC3748 == null) {
            return null;
        }
        return abstractC3748.getCustomView();
    }

    @Override // p257.C8207, com.kongzue.dialogx.interfaces.AbstractC3737
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo8061() {
        EditText editText;
        if (m8068() != null) {
            AbstractC3737.m8044(m8068());
            this.f11579 = false;
        }
        RelativeLayout relativeLayout = this.f22621.f22642;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        int iM8072 = m8072(mo8057()) != 0 ? m8072(mo8057()) : this.f11578.mo11878(mo8057());
        if (iM8072 == 0) {
            iM8072 = mo8057() ? R.layout.layout_dialogx_material : R.layout.layout_dialogx_material_dark;
        }
        C8208 c8208 = this.f22621;
        String string = (c8208 == null || (editText = c8208.f22646) == null) ? this.f22628 : editText.getText().toString();
        this.f11575 = 0L;
        View viewM8064 = m8064(iM8072);
        this.f22621 = new C8208(this, viewM8064);
        if (viewM8064 != null) {
            viewM8064.setTag(this.f22616);
        }
        AbstractC3737.m8041(viewM8064);
        this.f22628 = string;
        mo13704();
    }

    @Override // p257.C8207, com.kongzue.dialogx.interfaces.AbstractC3737
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8063() {
        return C8227.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }
}
