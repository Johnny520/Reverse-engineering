package p257;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.C2492;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;
import com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN;
import com.kongzue.dialogx.util.C3770;
import java.util.ArrayList;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArrayList;
import p033.AbstractC6325;
import p261.AbstractC8247;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8211 extends AbstractC3737 {

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static ArrayList f22650;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public BaseDialog$BOOLEAN f22651;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public float f22652;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public int f22653;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public C2492 f22654;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public DialogXStyle$PopTipSettings$ALIGN f22655;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public int f22656;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public C8211 f22657;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public int f22658;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public C8216 f22659;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public int[] f22660;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public Timer f22661;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public CharSequence f22662;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public C3770 f22663;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static C8211 m13720(String str) {
        C8211 c8211 = new C8211();
        c8211.f22657 = c8211;
        c8211.f22653 = 0;
        c8211.f22656 = 0;
        c8211.f22652 = AbstractC8247.f22829;
        C3770 c3770 = new C3770();
        c3770.f11736 = true;
        c8211.f22663 = c3770;
        c8211.f22660 = new int[]{-1, -1, -1, -1};
        c8211.f22662 = str;
        c8211.m13721();
        return c8211;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m13721() {
        m8066();
        if (m8068() != null) {
            AbstractC3737.m8041(m8068());
            return;
        }
        AbstractC6325 abstractC6325 = AbstractC8247.f22824;
        if (f22650 != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(f22650);
            for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
                C8211 c8211 = (C8211) copyOnWriteArrayList.get(i);
                if (copyOnWriteArrayList.size() < Integer.MAX_VALUE) {
                    c8211.m13722();
                } else if (i <= copyOnWriteArrayList.size() - Integer.MAX_VALUE) {
                    c8211.getClass();
                    AbstractC3737.m8043(new RunnableC8214(c8211, 1));
                    f22650.remove(c8211);
                } else {
                    c8211.m13722();
                }
            }
        }
        if (f22650 == null) {
            f22650 = new ArrayList();
        }
        f22650.add(this);
        int iM8072 = mo8057() ? R.layout.layout_dialogx_poptip_material : R.layout.layout_dialogx_poptip_material_dark;
        AbstractC6325 abstractC63252 = this.f11578;
        abstractC63252.mo11879();
        if (abstractC63252.mo11879().mo9909(mo8057()) != 0) {
            iM8072 = abstractC63252.mo11879().mo9909(mo8057());
        }
        if (this.f22655 == null) {
            if (abstractC63252.mo11879().mo9910() == null) {
                this.f22655 = DialogXStyle$PopTipSettings$ALIGN.BOTTOM;
            } else {
                this.f22655 = abstractC63252.mo11879().mo9910();
            }
        }
        mo8057();
        mo8057();
        int i2 = this.f22653;
        if (i2 == 0) {
            i2 = R.anim.anim_dialogx_default_enter;
        }
        this.f22653 = i2;
        int i3 = this.f22656;
        if (i3 == 0) {
            i3 = R.anim.anim_dialogx_default_exit;
        }
        this.f22656 = i3;
        long j = this.f11575;
        if (j == -1) {
            j = -1;
        }
        this.f11575 = j;
        long j2 = this.f11586;
        this.f11586 = j2 != -1 ? j2 : -1L;
        if (m8072(mo8057()) != 0) {
            iM8072 = m8072(mo8057());
        }
        View viewM8064 = m8064(iM8072);
        this.f22654 = new C2492(this, viewM8064);
        if (viewM8064 != null) {
            viewM8064.setTag(this.f22657);
        }
        AbstractC3737.m8041(viewM8064);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void m13722() {
        LinearLayout linearLayout;
        C2492 c2492 = this.f22654;
        if (c2492 == null || (linearLayout = (LinearLayout) c2492.f7460) == null) {
            return;
        }
        linearLayout.post(new RunnableC8215(this, linearLayout, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void m13723() {
        this.f22651 = BaseDialog$BOOLEAN.FALSE;
        if (this.f22654 != null) {
            AbstractC3737.m8043(new RunnableC8214(this, 0));
        }
        this.f11578.mo11879();
        this.f22658 = R.mipmap.ico_dialogx_success;
        if (this.f22654 == null) {
            return;
        }
        AbstractC3737.m8043(new RunnableC8214(this, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m13724() {
        this.f22651 = BaseDialog$BOOLEAN.FALSE;
        if (this.f22654 != null) {
            AbstractC3737.m8043(new RunnableC8214(this, 0));
        }
        this.f11578.mo11879();
        this.f22658 = R.mipmap.ico_dialogx_error;
        if (this.f22654 == null) {
            return;
        }
        AbstractC3737.m8043(new RunnableC8214(this, 0));
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3737
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo8061() {
        if (m8068() != null) {
            AbstractC3737.m8044(m8068());
            this.f11579 = false;
        }
        RelativeLayout relativeLayout = (RelativeLayout) this.f22654.f7456;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        AbstractC6325 abstractC6325 = AbstractC8247.f22824;
        if (f22650 != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(f22650);
            for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
                C8211 c8211 = (C8211) copyOnWriteArrayList.get(i);
                if (copyOnWriteArrayList.size() < Integer.MAX_VALUE) {
                    c8211.m13722();
                } else if (i <= copyOnWriteArrayList.size() - Integer.MAX_VALUE) {
                    c8211.getClass();
                    AbstractC3737.m8043(new RunnableC8214(c8211, 1));
                    f22650.remove(c8211);
                } else {
                    c8211.m13722();
                }
            }
        }
        if (f22650 == null) {
            f22650 = new ArrayList();
        }
        f22650.add(this);
        int iM8072 = mo8057() ? R.layout.layout_dialogx_poptip_material : R.layout.layout_dialogx_poptip_material_dark;
        AbstractC6325 abstractC63252 = this.f11578;
        abstractC63252.mo11879();
        if (abstractC63252.mo11879().mo9909(mo8057()) != 0) {
            iM8072 = abstractC63252.mo11879().mo9909(mo8057());
        }
        if (this.f22655 == null) {
            if (abstractC63252.mo11879().mo9910() == null) {
                this.f22655 = DialogXStyle$PopTipSettings$ALIGN.BOTTOM;
            } else {
                this.f22655 = abstractC63252.mo11879().mo9910();
            }
        }
        mo8057();
        mo8057();
        int i2 = this.f22653;
        if (i2 == 0) {
            i2 = R.anim.anim_dialogx_default_enter;
        }
        this.f22653 = i2;
        int i3 = this.f22656;
        if (i3 == 0) {
            i3 = R.anim.anim_dialogx_default_exit;
        }
        this.f22656 = i3;
        long j = this.f11575;
        if (j == -1) {
            j = -1;
        }
        this.f11575 = j;
        long j2 = this.f11586;
        this.f11586 = j2 != -1 ? j2 : -1L;
        this.f11575 = 0L;
        if (m8072(mo8057()) != 0) {
            iM8072 = m8072(mo8057());
        }
        View viewM8064 = m8064(iM8072);
        this.f22654 = new C2492(this, viewM8064);
        if (viewM8064 != null) {
            viewM8064.setTag(this.f22657);
        }
        AbstractC3737.m8041(viewM8064);
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3737
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8063() {
        return C8211.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3737
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo8065() {
        super.mo8065();
        AbstractC3737.m8044(m8068());
    }
}
