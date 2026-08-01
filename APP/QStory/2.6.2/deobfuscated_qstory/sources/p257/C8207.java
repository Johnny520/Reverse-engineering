package p257;

import android.view.View;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.AbstractC3748;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;
import com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT;
import com.kongzue.dialogx.interfaces.InterfaceC3736;
import com.kongzue.dialogx.interfaces.InterfaceC3749;
import com.kongzue.dialogx.util.C3770;
import p261.AbstractC8247;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C8207 extends AbstractC3737 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public C8220 f22614;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public CharSequence f22615;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public AbstractC3748 f22617;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public C8216 f22618;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public BaseDialog$BOOLEAN f22619;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public C8208 f22621;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public InterfaceC3749 f22622;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public InterfaceC3749 f22623;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public InterfaceC3736 f22624;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public C3770 f22625;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public String f22626;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public CharSequence f22627;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public String f22628;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public float f22629;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public String f22630;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public String f22631;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public boolean f22620 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public C8207 f22616 = this;

    public C8207() {
        BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT = BaseDialog$BUTTON_SELECT_RESULT.NONE;
        this.f22629 = AbstractC8247.f22833;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static C8207 m13712(CharSequence charSequence, String str) {
        C8207 c8207 = new C8207();
        c8207.f22620 = true;
        c8207.f22616 = c8207;
        BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT = BaseDialog$BUTTON_SELECT_RESULT.NONE;
        c8207.f22629 = AbstractC8247.f22833;
        c8207.f22615 = str;
        c8207.f22627 = charSequence;
        c8207.m13714();
        return c8207;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public C8207 mo13702(String str, InterfaceC3749 interfaceC3749) {
        this.f22626 = str;
        this.f22624 = interfaceC3749;
        mo13704();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public void mo13703(boolean z) {
        this.f22619 = z ? BaseDialog$BOOLEAN.TRUE : BaseDialog$BOOLEAN.FALSE;
        mo13704();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public void mo13704() {
        if (mo13707() == null) {
            return;
        }
        AbstractC3737.m8043(new RunnableC8224(this, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public void mo13705(String str) {
        this.f22627 = str;
        mo13704();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public C8207 mo13706(AbstractC3748 abstractC3748) {
        this.f22617 = abstractC3748;
        mo13704();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public C8208 mo13707() {
        return this.f22621;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public boolean mo13708() {
        BaseDialog$BOOLEAN baseDialog$BOOLEAN = this.f22619;
        return baseDialog$BOOLEAN != null ? baseDialog$BOOLEAN == BaseDialog$BOOLEAN.TRUE : this.f11580;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public View mo13709() {
        AbstractC3748 abstractC3748 = this.f22617;
        if (abstractC3748 == null) {
            return null;
        }
        return abstractC3748.getCustomView();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m13713() {
        AbstractC3737.m8043(new RunnableC8224(this, 1));
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3737
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public void mo8061() {
        if (m8068() != null) {
            AbstractC3737.m8044(m8068());
            this.f11579 = false;
        }
        if (mo13707().f22642 != null) {
            mo13707().f22642.removeAllViews();
        }
        if (mo13707().f22643 != null) {
            mo13707().f22643.removeAllViews();
        }
        int iM8072 = m8072(mo8057()) != 0 ? m8072(mo8057()) : this.f11578.mo11878(mo8057());
        if (iM8072 == 0) {
            iM8072 = mo8057() ? R.layout.layout_dialogx_material : R.layout.layout_dialogx_material_dark;
        }
        this.f11575 = 0L;
        View viewM8064 = m8064(iM8072);
        this.f22621 = new C8208(this, viewM8064);
        if (viewM8064 != null) {
            viewM8064.setTag(this.f22616);
        }
        AbstractC3737.m8041(viewM8064);
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3737
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public String mo8063() {
        return getClass().getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final void m13714() {
        m8066();
        if (m8068() != null) {
            AbstractC3737.m8041(m8068());
            return;
        }
        int iM8072 = m8072(mo8057()) != 0 ? m8072(mo8057()) : this.f11578.mo11878(mo8057());
        if (iM8072 == 0) {
            iM8072 = mo8057() ? R.layout.layout_dialogx_material : R.layout.layout_dialogx_material_dark;
        }
        View viewM8064 = m8064(iM8072);
        this.f22621 = new C8208(this, viewM8064);
        if (viewM8064 != null) {
            viewM8064.setTag(this.f22616);
        }
        AbstractC3737.m8041(viewM8064);
    }
}
