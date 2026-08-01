package p273;

import android.view.View;
import androidx.compose.animation.core.C1171;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.dialogs.CustomDialog$ALIGN;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.AbstractC4581;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9062 extends AbstractC4570 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public CustomDialog$ALIGN f23061;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int f23062;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public C1171 f23063;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public C9062 f23064;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public int f23065;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public int f23066;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public AbstractC4581 f23067;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public boolean f23068;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public BaseDialog$BOOLEAN f23069;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public int f23070;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public C9046 f23071;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public int f23072;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static C9062 m14311() {
        C9062 c9062 = new C9062();
        c9062.f23064 = c9062;
        c9062.f23066 = C0328R.anim.anim_dialogx_default_enter;
        c9062.f23065 = C0328R.anim.anim_dialogx_default_exit;
        c9062.f23061 = CustomDialog$ALIGN.CENTER;
        c9062.f23062 = 0;
        c9062.f23068 = true;
        c9062.f23072 = -1;
        c9062.f23070 = -1;
        return c9062;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void m14312() {
        if (this.f23063 == null) {
            return;
        }
        AbstractC4570.m8589(new RunnableC9066(this, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m14313() {
        m8612();
        if (m8614() != null) {
            AbstractC4570.m8587(m8614());
            return;
        }
        View viewM8610 = m8610(m8618(mo8603()) != 0 ? m8618(mo8603()) : C0328R.layout.layout_dialogx_custom);
        this.f23063 = new C1171(this, viewM8610);
        if (viewM8610 != null) {
            viewM8610.setTag(this.f23064);
        }
        AbstractC4570.m8587(viewM8610);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void m14314() {
        AbstractC4570.m8589(new RunnableC9066(this, 1));
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC4570
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo8607() {
        MaxRelativeLayout maxRelativeLayout;
        if (m8614() != null) {
            AbstractC4570.m8590(m8614());
            this.f11929 = false;
        }
        C1171 c1171 = this.f23063;
        if (c1171 != null && (maxRelativeLayout = (MaxRelativeLayout) c1171.f1441) != null) {
            maxRelativeLayout.removeAllViews();
        }
        this.f11925 = 0L;
        View viewM8610 = m8610(m8618(mo8603()) != 0 ? m8618(mo8603()) : C0328R.layout.layout_dialogx_custom);
        this.f23063 = new C1171(this, viewM8610);
        if (viewM8610 != null) {
            viewM8610.setTag(this.f23064);
        }
        AbstractC4570.m8587(viewM8610);
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC4570
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8609() {
        return C9062.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }
}
