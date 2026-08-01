package p257;

import android.view.View;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.AbstractC3749;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;
import com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT;
import com.kongzue.dialogx.interfaces.InterfaceC3737;
import com.kongzue.dialogx.interfaces.InterfaceC3750;
import com.kongzue.dialogx.util.C3771;
import p261.AbstractC8248;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8208 extends AbstractC3738 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public C8221 f22613;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public CharSequence f22614;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public AbstractC3749 f22616;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public C8217 f22617;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public BaseDialog$BOOLEAN f22618;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public C8209 f22620;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public InterfaceC3750 f22621;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public InterfaceC3750 f22622;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public InterfaceC3737 f22623;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public C3771 f22624;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public String f22625;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public CharSequence f22626;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public String f22627;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public float f22628;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public String f22629;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public String f22630;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public boolean f22619 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public C8208 f22615 = this;

    public C8208() {
        BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT = BaseDialog$BUTTON_SELECT_RESULT.NONE;
        this.f22628 = AbstractC8248.f22832;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static C8208 m13729(CharSequence charSequence, String str) {
        C8208 c8208 = new C8208();
        c8208.f22619 = true;
        c8208.f22615 = c8208;
        BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT = BaseDialog$BUTTON_SELECT_RESULT.NONE;
        c8208.f22628 = AbstractC8248.f22832;
        c8208.f22614 = str;
        c8208.f22626 = charSequence;
        c8208.m13731();
        return c8208;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public C8208 mo13719(String str, InterfaceC3750 interfaceC3750) {
        this.f22625 = str;
        this.f22623 = interfaceC3750;
        mo13721();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public void mo13720(boolean z) {
        this.f22618 = z ? BaseDialog$BOOLEAN.TRUE : BaseDialog$BOOLEAN.FALSE;
        mo13721();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public void mo13721() {
        if (mo13724() == null) {
            return;
        }
        AbstractC3738.m8030(new RunnableC8225(this, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public void mo13722(String str) {
        this.f22626 = str;
        mo13721();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public C8208 mo13723(AbstractC3749 abstractC3749) {
        this.f22616 = abstractC3749;
        mo13721();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public C8209 mo13724() {
        return this.f22620;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public boolean mo13725() {
        BaseDialog$BOOLEAN baseDialog$BOOLEAN = this.f22618;
        return baseDialog$BOOLEAN != null ? baseDialog$BOOLEAN == BaseDialog$BOOLEAN.TRUE : this.f11585;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public View mo13726() {
        AbstractC3749 abstractC3749 = this.f22616;
        if (abstractC3749 == null) {
            return null;
        }
        return abstractC3749.getCustomView();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m13730() {
        AbstractC3738.m8030(new RunnableC8225(this, 1));
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3738
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public void mo8048() {
        if (m8055() != null) {
            AbstractC3738.m8031(m8055());
            this.f11584 = false;
        }
        if (mo13724().f22641 != null) {
            mo13724().f22641.removeAllViews();
        }
        if (mo13724().f22642 != null) {
            mo13724().f22642.removeAllViews();
        }
        int iM8059 = m8059(mo8044()) != 0 ? m8059(mo8044()) : this.f11583.mo9895(mo8044());
        if (iM8059 == 0) {
            iM8059 = mo8044() ? R.layout.layout_dialogx_material : R.layout.layout_dialogx_material_dark;
        }
        this.f11580 = 0L;
        View viewM8051 = m8051(iM8059);
        this.f22620 = new C8209(this, viewM8051);
        if (viewM8051 != null) {
            viewM8051.setTag(this.f22615);
        }
        AbstractC3738.m8028(viewM8051);
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3738
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public String mo8050() {
        return getClass().getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final void m13731() {
        m8053();
        if (m8055() != null) {
            AbstractC3738.m8028(m8055());
            return;
        }
        int iM8059 = m8059(mo8044()) != 0 ? m8059(mo8044()) : this.f11583.mo9895(mo8044());
        if (iM8059 == 0) {
            iM8059 = mo8044() ? R.layout.layout_dialogx_material : R.layout.layout_dialogx_material_dark;
        }
        View viewM8051 = m8051(iM8059);
        this.f22620 = new C8209(this, viewM8051);
        if (viewM8051 != null) {
            viewM8051.setTag(this.f22615);
        }
        AbstractC3738.m8028(viewM8051);
    }
}
