package p257;

import android.view.View;
import androidx.compose.animation.core.C0325;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.dialogs.CustomDialog$ALIGN;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.AbstractC3749;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8233 extends AbstractC3738 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public CustomDialog$ALIGN f22716;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int f22717;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public C0325 f22718;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public C8233 f22719;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public int f22720;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public int f22721;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public AbstractC3749 f22722;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public boolean f22723;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public BaseDialog$BOOLEAN f22724;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public int f22725;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public C8217 f22726;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public int f22727;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static C8233 m13752() {
        C8233 c8233 = new C8233();
        c8233.f22719 = c8233;
        c8233.f22721 = R.anim.anim_dialogx_default_enter;
        c8233.f22720 = R.anim.anim_dialogx_default_exit;
        c8233.f22716 = CustomDialog$ALIGN.CENTER;
        c8233.f22717 = 0;
        c8233.f22723 = true;
        c8233.f22727 = -1;
        c8233.f22725 = -1;
        return c8233;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void m13753() {
        if (this.f22718 == null) {
            return;
        }
        AbstractC3738.m8030(new RunnableC8237(this, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m13754() {
        m8053();
        if (m8055() != null) {
            AbstractC3738.m8028(m8055());
            return;
        }
        View viewM8051 = m8051(m8059(mo8044()) != 0 ? m8059(mo8044()) : R.layout.layout_dialogx_custom);
        this.f22718 = new C0325(this, viewM8051);
        if (viewM8051 != null) {
            viewM8051.setTag(this.f22719);
        }
        AbstractC3738.m8028(viewM8051);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void m13755() {
        AbstractC3738.m8030(new RunnableC8237(this, 1));
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3738
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo8048() {
        MaxRelativeLayout maxRelativeLayout;
        if (m8055() != null) {
            AbstractC3738.m8031(m8055());
            this.f11584 = false;
        }
        C0325 c0325 = this.f22718;
        if (c0325 != null && (maxRelativeLayout = (MaxRelativeLayout) c0325.f1096) != null) {
            maxRelativeLayout.removeAllViews();
        }
        this.f11580 = 0L;
        View viewM8051 = m8051(m8059(mo8044()) != 0 ? m8059(mo8044()) : R.layout.layout_dialogx_custom);
        this.f22718 = new C0325(this, viewM8051);
        if (viewM8051 != null) {
            viewM8051.setTag(this.f22719);
        }
        AbstractC3738.m8028(viewM8051);
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3738
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8050() {
        return C8233.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }
}
