package p257;

import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.AbstractC3749;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8228 extends C8208 {
    @Override // p257.C8208
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final void mo13720(boolean z) {
        this.f22618 = BaseDialog$BOOLEAN.TRUE;
        mo13721();
    }

    @Override // p257.C8208
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final void mo13722(String str) {
        this.f22626 = str;
        mo13721();
    }

    @Override // p257.C8208
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public final C8208 mo13723(AbstractC3749 abstractC3749) {
        this.f22616 = abstractC3749;
        mo13721();
        return this;
    }

    @Override // p257.C8208
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final boolean mo13725() {
        BaseDialog$BOOLEAN baseDialog$BOOLEAN = this.f22618;
        return baseDialog$BOOLEAN != null ? baseDialog$BOOLEAN == BaseDialog$BOOLEAN.TRUE : this.f11585;
    }

    @Override // p257.C8208
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final View mo13726() {
        AbstractC3749 abstractC3749 = this.f22616;
        if (abstractC3749 == null) {
            return null;
        }
        return abstractC3749.getCustomView();
    }

    @Override // p257.C8208, com.kongzue.dialogx.interfaces.AbstractC3738
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo8048() {
        EditText editText;
        if (m8055() != null) {
            AbstractC3738.m8031(m8055());
            this.f11584 = false;
        }
        RelativeLayout relativeLayout = this.f22620.f22641;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        int iM8059 = m8059(mo8044()) != 0 ? m8059(mo8044()) : this.f11583.mo9895(mo8044());
        if (iM8059 == 0) {
            iM8059 = mo8044() ? R.layout.layout_dialogx_material : R.layout.layout_dialogx_material_dark;
        }
        C8209 c8209 = this.f22620;
        String string = (c8209 == null || (editText = c8209.f22645) == null) ? this.f22627 : editText.getText().toString();
        this.f11580 = 0L;
        View viewM8051 = m8051(iM8059);
        this.f22620 = new C8209(this, viewM8051);
        if (viewM8051 != null) {
            viewM8051.setTag(this.f22615);
        }
        AbstractC3738.m8028(viewM8051);
        this.f22627 = string;
        mo13721();
    }

    @Override // p257.C8208, com.kongzue.dialogx.interfaces.AbstractC3738
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8050() {
        return C8228.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }
}
