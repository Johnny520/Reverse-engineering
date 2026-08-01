package p257;

import android.view.View;
import androidx.compose.animation.core.C0325;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.dialogs.CustomDialog$ALIGN;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.AbstractC3748;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8232 extends AbstractC3737 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public CustomDialog$ALIGN f22717;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int f22718;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public C0325 f22719;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public C8232 f22720;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public int f22721;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public int f22722;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public AbstractC3748 f22723;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public boolean f22724;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public BaseDialog$BOOLEAN f22725;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public int f22726;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public C8216 f22727;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public int f22728;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static C8232 m13736() {
        C8232 c8232 = new C8232();
        c8232.f22720 = c8232;
        c8232.f22722 = R.anim.anim_dialogx_default_enter;
        c8232.f22721 = R.anim.anim_dialogx_default_exit;
        c8232.f22717 = CustomDialog$ALIGN.CENTER;
        c8232.f22718 = 0;
        c8232.f22724 = true;
        c8232.f22728 = -1;
        c8232.f22726 = -1;
        return c8232;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void m13737() {
        if (this.f22719 == null) {
            return;
        }
        AbstractC3737.m8043(new RunnableC8236(this, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m13738() {
        m8066();
        if (m8068() != null) {
            AbstractC3737.m8041(m8068());
            return;
        }
        View viewM8064 = m8064(m8072(mo8057()) != 0 ? m8072(mo8057()) : R.layout.layout_dialogx_custom);
        this.f22719 = new C0325(this, viewM8064);
        if (viewM8064 != null) {
            viewM8064.setTag(this.f22720);
        }
        AbstractC3737.m8041(viewM8064);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void m13739() {
        AbstractC3737.m8043(new RunnableC8236(this, 1));
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3737
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo8061() {
        MaxRelativeLayout maxRelativeLayout;
        if (m8068() != null) {
            AbstractC3737.m8044(m8068());
            this.f11579 = false;
        }
        C0325 c0325 = this.f22719;
        if (c0325 != null && (maxRelativeLayout = (MaxRelativeLayout) c0325.f1096) != null) {
            maxRelativeLayout.removeAllViews();
        }
        this.f11575 = 0L;
        View viewM8064 = m8064(m8072(mo8057()) != 0 ? m8072(mo8057()) : R.layout.layout_dialogx_custom);
        this.f22719 = new C0325(this, viewM8064);
        if (viewM8064 != null) {
            viewM8064.setTag(this.f22720);
        }
        AbstractC3737.m8041(viewM8064);
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3737
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8063() {
        return C8232.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }
}
