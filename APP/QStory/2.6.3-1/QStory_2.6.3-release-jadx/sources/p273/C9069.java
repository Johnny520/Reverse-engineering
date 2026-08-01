package p273;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.AbstractC4579;
import com.kongzue.dialogx.interfaces.AbstractC4581;
import com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT;
import com.kongzue.dialogx.interfaces.InterfaceC4583;
import com.kongzue.dialogx.util.C4603;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import lin.xposed.hook.javaplugin.view.C6380;
import p277.AbstractC9077;
import p339.C9545;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9069 extends AbstractC4570 implements InterfaceC4583 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public boolean f23103;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public C6380 f23104;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public String f23105;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public String f23106;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public String f23107;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public String f23108;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public AbstractC4581 f23109;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public C9068 f23110;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public C9069 f23111;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public AbstractC4579 f23112;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public C4603 f23113;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public C4603 f23114;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public boolean f23115;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public C9545 f23116;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public boolean f23117;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public C4603 f23118;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public float f23119;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public C9046 f23120;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static C9069 m14318() {
        C9069 c9069 = new C9069();
        c9069.f23103 = true;
        c9069.f23115 = true;
        c9069.f23119 = AbstractC9077.f23170;
        BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT = BaseDialog$BUTTON_SELECT_RESULT.NONE;
        c9069.f23117 = true;
        C4603 c4603 = new C4603();
        c4603.f12086 = true;
        c9069.f23118 = c4603;
        C4603 c46032 = new C4603();
        c46032.f12086 = true;
        c9069.f23114 = c46032;
        C4603 c46033 = new C4603();
        c46033.f12086 = true;
        c9069.f23113 = c46033;
        c9069.f23111 = c9069;
        return c9069;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m14319() {
        m8612();
        if (m8614() != null) {
            AbstractC4570.m8587(m8614());
            return;
        }
        mo8603();
        AbstractC5754 abstractC5754 = this.f11928;
        abstractC5754.mo10461();
        int iMo7433 = abstractC5754.mo10461().mo7433(mo8603());
        if (m8618(mo8603()) != 0) {
            iMo7433 = m8618(mo8603());
        }
        View viewM8610 = m8610(iMo7433);
        this.f23110 = new C9068(this, viewM8610);
        if (viewM8610 != null) {
            viewM8610.setTag(this.f23111);
        }
        AbstractC4570.m8587(viewM8610);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m14320(AbstractC4579 abstractC4579) {
        this.f23112 = abstractC4579;
        if (this.f11929) {
            abstractC4579.mo8625(this.f23111);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final boolean m14321() {
        this.f11928.mo10461();
        return this.f23103;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m14322() {
        if (this.f23110 == null) {
            return;
        }
        AbstractC4570.m8589(new RunnableC9051(this, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void m14323() {
        AbstractC4570.m8589(new RunnableC9051(this, 1));
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC4570
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo8607() {
        if (m8614() != null) {
            AbstractC4570.m8590(m8614());
            this.f11929 = false;
        }
        RelativeLayout relativeLayout = this.f23110.f23099;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        ViewGroup viewGroup = this.f23110.f23102;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        mo8603();
        AbstractC5754 abstractC5754 = this.f11928;
        abstractC5754.mo10461();
        int iMo7433 = abstractC5754.mo10461().mo7433(mo8603());
        if (m8618(mo8603()) != 0) {
            iMo7433 = m8618(mo8603());
        }
        this.f11925 = 0L;
        View viewM8610 = m8610(iMo7433);
        this.f23110 = new C9068(this, viewM8610);
        if (viewM8610 != null) {
            viewM8610.setTag(this.f23111);
        }
        AbstractC4570.m8587(viewM8610);
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC4570
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8609() {
        return C9069.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }
}
