package p273;

import android.view.View;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.AbstractC4581;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;
import com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT;
import com.kongzue.dialogx.interfaces.InterfaceC4569;
import com.kongzue.dialogx.interfaces.InterfaceC4582;
import com.kongzue.dialogx.util.C4603;
import p277.AbstractC9077;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C9037 extends AbstractC4570 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public C9050 f22958;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public CharSequence f22959;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public AbstractC4581 f22961;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public C9046 f22962;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public BaseDialog$BOOLEAN f22963;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public C9038 f22965;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public InterfaceC4582 f22966;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public InterfaceC4582 f22967;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public InterfaceC4569 f22968;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public C4603 f22969;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public String f22970;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public CharSequence f22971;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public String f22972;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public float f22973;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public String f22974;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public String f22975;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public boolean f22964 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public C9037 f22960 = this;

    public C9037() {
        BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT = BaseDialog$BUTTON_SELECT_RESULT.NONE;
        this.f22973 = AbstractC9077.f23177;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static C9037 m14288(CharSequence charSequence, String str) {
        C9037 c9037 = new C9037();
        c9037.f22964 = true;
        c9037.f22960 = c9037;
        BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT = BaseDialog$BUTTON_SELECT_RESULT.NONE;
        c9037.f22973 = AbstractC9077.f23177;
        c9037.f22959 = str;
        c9037.f22971 = charSequence;
        c9037.m14290();
        return c9037;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public C9037 mo14278(String str, InterfaceC4582 interfaceC4582) {
        this.f22970 = str;
        this.f22968 = interfaceC4582;
        mo14280();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public void mo14279(boolean z) {
        this.f22963 = z ? BaseDialog$BOOLEAN.TRUE : BaseDialog$BOOLEAN.FALSE;
        mo14280();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public void mo14280() {
        if (mo14283() == null) {
            return;
        }
        AbstractC4570.m8589(new RunnableC9054(this, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public void mo14281(String str) {
        this.f22971 = str;
        mo14280();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public C9037 mo14282(AbstractC4581 abstractC4581) {
        this.f22961 = abstractC4581;
        mo14280();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public C9038 mo14283() {
        return this.f22965;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public boolean mo14284() {
        BaseDialog$BOOLEAN baseDialog$BOOLEAN = this.f22963;
        return baseDialog$BOOLEAN != null ? baseDialog$BOOLEAN == BaseDialog$BOOLEAN.TRUE : this.f11930;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public View mo14285() {
        AbstractC4581 abstractC4581 = this.f22961;
        if (abstractC4581 == null) {
            return null;
        }
        return abstractC4581.getCustomView();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m14289() {
        AbstractC4570.m8589(new RunnableC9054(this, 1));
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC4570
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public void mo8607() {
        if (m8614() != null) {
            AbstractC4570.m8590(m8614());
            this.f11929 = false;
        }
        if (mo14283().f22986 != null) {
            mo14283().f22986.removeAllViews();
        }
        if (mo14283().f22987 != null) {
            mo14283().f22987.removeAllViews();
        }
        int iM8618 = m8618(mo8603()) != 0 ? m8618(mo8603()) : this.f11928.mo10454(mo8603());
        if (iM8618 == 0) {
            iM8618 = mo8603() ? C0328R.layout.layout_dialogx_material : C0328R.layout.layout_dialogx_material_dark;
        }
        this.f11925 = 0L;
        View viewM8610 = m8610(iM8618);
        this.f22965 = new C9038(this, viewM8610);
        if (viewM8610 != null) {
            viewM8610.setTag(this.f22960);
        }
        AbstractC4570.m8587(viewM8610);
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC4570
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public String mo8609() {
        return getClass().getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final void m14290() {
        m8612();
        if (m8614() != null) {
            AbstractC4570.m8587(m8614());
            return;
        }
        int iM8618 = m8618(mo8603()) != 0 ? m8618(mo8603()) : this.f11928.mo10454(mo8603());
        if (iM8618 == 0) {
            iM8618 = mo8603() ? C0328R.layout.layout_dialogx_material : C0328R.layout.layout_dialogx_material_dark;
        }
        View viewM8610 = m8610(iM8618);
        this.f22965 = new C9038(this, viewM8610);
        if (viewM8610 != null) {
            viewM8610.setTag(this.f22960);
        }
        AbstractC4570.m8587(viewM8610);
    }
}
