package p257;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.AbstractC3747;
import com.kongzue.dialogx.interfaces.AbstractC3749;
import com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT;
import com.kongzue.dialogx.interfaces.InterfaceC3751;
import com.kongzue.dialogx.util.C3771;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import lin.xposed.hook.javaplugin.view.C5549;
import p261.AbstractC8248;
import p323.C8716;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8240 extends AbstractC3738 implements InterfaceC3751 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public boolean f22758;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public C5549 f22759;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public String f22760;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public String f22761;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public String f22762;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public String f22763;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public AbstractC3749 f22764;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public C8239 f22765;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public C8240 f22766;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public AbstractC3747 f22767;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public C3771 f22768;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public C3771 f22769;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public boolean f22770;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public C8716 f22771;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public boolean f22772;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public C3771 f22773;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public float f22774;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public C8217 f22775;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static C8240 m13759() {
        C8240 c8240 = new C8240();
        c8240.f22758 = true;
        c8240.f22770 = true;
        c8240.f22774 = AbstractC8248.f22825;
        BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT = BaseDialog$BUTTON_SELECT_RESULT.NONE;
        c8240.f22772 = true;
        C3771 c3771 = new C3771();
        c3771.f11741 = true;
        c8240.f22773 = c3771;
        C3771 c37712 = new C3771();
        c37712.f11741 = true;
        c8240.f22769 = c37712;
        C3771 c37713 = new C3771();
        c37713.f11741 = true;
        c8240.f22768 = c37713;
        c8240.f22766 = c8240;
        return c8240;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m13760() {
        m8053();
        if (m8055() != null) {
            AbstractC3738.m8028(m8055());
            return;
        }
        mo8044();
        AbstractC4922 abstractC4922 = this.f11583;
        abstractC4922.mo9902();
        int iMo6873 = abstractC4922.mo9902().mo6873(mo8044());
        if (m8059(mo8044()) != 0) {
            iMo6873 = m8059(mo8044());
        }
        View viewM8051 = m8051(iMo6873);
        this.f22765 = new C8239(this, viewM8051);
        if (viewM8051 != null) {
            viewM8051.setTag(this.f22766);
        }
        AbstractC3738.m8028(viewM8051);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m13761(AbstractC3747 abstractC3747) {
        this.f22767 = abstractC3747;
        if (this.f11584) {
            abstractC3747.mo8066(this.f22766);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final boolean m13762() {
        this.f11583.mo9902();
        return this.f22758;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m13763() {
        if (this.f22765 == null) {
            return;
        }
        AbstractC3738.m8030(new RunnableC8222(this, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void m13764() {
        AbstractC3738.m8030(new RunnableC8222(this, 1));
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3738
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo8048() {
        if (m8055() != null) {
            AbstractC3738.m8031(m8055());
            this.f11584 = false;
        }
        RelativeLayout relativeLayout = this.f22765.f22754;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        ViewGroup viewGroup = this.f22765.f22757;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        mo8044();
        AbstractC4922 abstractC4922 = this.f11583;
        abstractC4922.mo9902();
        int iMo6873 = abstractC4922.mo9902().mo6873(mo8044());
        if (m8059(mo8044()) != 0) {
            iMo6873 = m8059(mo8044());
        }
        this.f11580 = 0L;
        View viewM8051 = m8051(iMo6873);
        this.f22765 = new C8239(this, viewM8051);
        if (viewM8051 != null) {
            viewM8051.setTag(this.f22766);
        }
        AbstractC3738.m8028(viewM8051);
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3738
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8050() {
        return C8240.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }
}
