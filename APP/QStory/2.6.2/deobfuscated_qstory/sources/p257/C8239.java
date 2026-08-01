package p257;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.AbstractC3746;
import com.kongzue.dialogx.interfaces.AbstractC3748;
import com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT;
import com.kongzue.dialogx.interfaces.InterfaceC3750;
import com.kongzue.dialogx.util.C3770;
import lin.xposed.hook.javaplugin.view.C5548;
import p033.AbstractC6325;
import p261.AbstractC8247;
import p319.C8683;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8239 extends AbstractC3737 implements InterfaceC3750 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public boolean f22759;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public C5548 f22760;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public String f22761;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public String f22762;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public String f22763;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public String f22764;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public AbstractC3748 f22765;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public C8238 f22766;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public C8239 f22767;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public AbstractC3746 f22768;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public C3770 f22769;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public C3770 f22770;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public boolean f22771;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public C8683 f22772;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public boolean f22773;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public C3770 f22774;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public float f22775;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public C8216 f22776;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static C8239 m13743() {
        C8239 c8239 = new C8239();
        c8239.f22759 = true;
        c8239.f22771 = true;
        c8239.f22775 = AbstractC8247.f22826;
        BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT = BaseDialog$BUTTON_SELECT_RESULT.NONE;
        c8239.f22773 = true;
        C3770 c3770 = new C3770();
        c3770.f11736 = true;
        c8239.f22774 = c3770;
        C3770 c37702 = new C3770();
        c37702.f11736 = true;
        c8239.f22770 = c37702;
        C3770 c37703 = new C3770();
        c37703.f11736 = true;
        c8239.f22769 = c37703;
        c8239.f22767 = c8239;
        return c8239;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m13744() {
        m8066();
        if (m8068() != null) {
            AbstractC3737.m8041(m8068());
            return;
        }
        mo8057();
        AbstractC6325 abstractC6325 = this.f11578;
        abstractC6325.mo11877();
        int iMo8330 = abstractC6325.mo11877().mo8330(mo8057());
        if (m8072(mo8057()) != 0) {
            iMo8330 = m8072(mo8057());
        }
        View viewM8064 = m8064(iMo8330);
        this.f22766 = new C8238(this, viewM8064);
        if (viewM8064 != null) {
            viewM8064.setTag(this.f22767);
        }
        AbstractC3737.m8041(viewM8064);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final boolean m13745() {
        this.f11578.mo11877();
        return this.f22759;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m13746() {
        if (this.f22766 == null) {
            return;
        }
        AbstractC3737.m8043(new RunnableC8221(this, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void m13747() {
        AbstractC3737.m8043(new RunnableC8221(this, 1));
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3737
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo8061() {
        if (m8068() != null) {
            AbstractC3737.m8044(m8068());
            this.f11579 = false;
        }
        RelativeLayout relativeLayout = this.f22766.f22755;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        ViewGroup viewGroup = this.f22766.f22758;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        mo8057();
        AbstractC6325 abstractC6325 = this.f11578;
        abstractC6325.mo11877();
        int iMo8330 = abstractC6325.mo11877().mo8330(mo8057());
        if (m8072(mo8057()) != 0) {
            iMo8330 = m8072(mo8057());
        }
        this.f11575 = 0L;
        View viewM8064 = m8064(iMo8330);
        this.f22766 = new C8238(this, viewM8064);
        if (viewM8064 != null) {
            viewM8064.setTag(this.f22767);
        }
        AbstractC3737.m8041(viewM8064);
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3737
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8063() {
        return C8239.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }
}
