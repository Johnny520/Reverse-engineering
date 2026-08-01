package p273;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.C3325;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;
import com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN;
import com.kongzue.dialogx.util.C4603;
import java.util.ArrayList;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p277.AbstractC9077;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9041 extends AbstractC4570 {

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static ArrayList f22994;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public BaseDialog$BOOLEAN f22995;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public float f22996;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public int f22997;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public C3325 f22998;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public DialogXStyle$PopTipSettings$ALIGN f22999;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public int f23000;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public C9041 f23001;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public int f23002;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public C9046 f23003;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public int[] f23004;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public Timer f23005;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public CharSequence f23006;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public C4603 f23007;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static C9041 m14296(String str) {
        C9041 c9041 = new C9041();
        c9041.f23001 = c9041;
        c9041.f22997 = 0;
        c9041.f23000 = 0;
        c9041.f22996 = AbstractC9077.f23173;
        C4603 c4603 = new C4603();
        c4603.f12086 = true;
        c9041.f23007 = c4603;
        c9041.f23004 = new int[]{-1, -1, -1, -1};
        c9041.f23006 = str;
        c9041.m14297();
        return c9041;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m14297() {
        m8612();
        if (m8614() != null) {
            AbstractC4570.m8587(m8614());
            return;
        }
        AbstractC5754 abstractC5754 = AbstractC9077.f23168;
        if (f22994 != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(f22994);
            for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
                C9041 c9041 = (C9041) copyOnWriteArrayList.get(i);
                if (copyOnWriteArrayList.size() < Integer.MAX_VALUE) {
                    c9041.m14298();
                } else if (i <= copyOnWriteArrayList.size() - Integer.MAX_VALUE) {
                    c9041.getClass();
                    AbstractC4570.m8589(new RunnableC9044(c9041, 1));
                    f22994.remove(c9041);
                } else {
                    c9041.m14298();
                }
            }
        }
        if (f22994 == null) {
            f22994 = new ArrayList();
        }
        f22994.add(this);
        int iM8618 = mo8603() ? C0328R.layout.layout_dialogx_poptip_material : C0328R.layout.layout_dialogx_poptip_material_dark;
        AbstractC5754 abstractC57542 = this.f11928;
        abstractC57542.mo10453();
        if (abstractC57542.mo10453().mo8883(mo8603()) != 0) {
            iM8618 = abstractC57542.mo10453().mo8883(mo8603());
        }
        if (this.f22999 == null) {
            if (abstractC57542.mo10453().mo8882() == null) {
                this.f22999 = DialogXStyle$PopTipSettings$ALIGN.BOTTOM;
            } else {
                this.f22999 = abstractC57542.mo10453().mo8882();
            }
        }
        mo8603();
        mo8603();
        int i2 = this.f22997;
        if (i2 == 0) {
            i2 = C0328R.anim.anim_dialogx_default_enter;
        }
        this.f22997 = i2;
        int i3 = this.f23000;
        if (i3 == 0) {
            i3 = C0328R.anim.anim_dialogx_default_exit;
        }
        this.f23000 = i3;
        long j = this.f11925;
        if (j == -1) {
            j = -1;
        }
        this.f11925 = j;
        long j2 = this.f11936;
        this.f11936 = j2 != -1 ? j2 : -1L;
        if (m8618(mo8603()) != 0) {
            iM8618 = m8618(mo8603());
        }
        View viewM8610 = m8610(iM8618);
        this.f22998 = new C3325(this, viewM8610);
        if (viewM8610 != null) {
            viewM8610.setTag(this.f23001);
        }
        AbstractC4570.m8587(viewM8610);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void m14298() {
        LinearLayout linearLayout;
        C3325 c3325 = this.f22998;
        if (c3325 == null || (linearLayout = (LinearLayout) c3325.f7806) == null) {
            return;
        }
        linearLayout.post(new RunnableC9045(this, linearLayout, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void m14299() {
        this.f22995 = BaseDialog$BOOLEAN.FALSE;
        if (this.f22998 != null) {
            AbstractC4570.m8589(new RunnableC9044(this, 0));
        }
        this.f11928.mo10453();
        this.f23002 = C0328R.mipmap.ico_dialogx_success;
        if (this.f22998 == null) {
            return;
        }
        AbstractC4570.m8589(new RunnableC9044(this, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m14300() {
        this.f22995 = BaseDialog$BOOLEAN.FALSE;
        if (this.f22998 != null) {
            AbstractC4570.m8589(new RunnableC9044(this, 0));
        }
        this.f11928.mo10453();
        this.f23002 = C0328R.mipmap.ico_dialogx_error;
        if (this.f22998 == null) {
            return;
        }
        AbstractC4570.m8589(new RunnableC9044(this, 0));
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC4570
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo8607() {
        if (m8614() != null) {
            AbstractC4570.m8590(m8614());
            this.f11929 = false;
        }
        RelativeLayout relativeLayout = (RelativeLayout) this.f22998.f7802;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        AbstractC5754 abstractC5754 = AbstractC9077.f23168;
        if (f22994 != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(f22994);
            for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
                C9041 c9041 = (C9041) copyOnWriteArrayList.get(i);
                if (copyOnWriteArrayList.size() < Integer.MAX_VALUE) {
                    c9041.m14298();
                } else if (i <= copyOnWriteArrayList.size() - Integer.MAX_VALUE) {
                    c9041.getClass();
                    AbstractC4570.m8589(new RunnableC9044(c9041, 1));
                    f22994.remove(c9041);
                } else {
                    c9041.m14298();
                }
            }
        }
        if (f22994 == null) {
            f22994 = new ArrayList();
        }
        f22994.add(this);
        int iM8618 = mo8603() ? C0328R.layout.layout_dialogx_poptip_material : C0328R.layout.layout_dialogx_poptip_material_dark;
        AbstractC5754 abstractC57542 = this.f11928;
        abstractC57542.mo10453();
        if (abstractC57542.mo10453().mo8883(mo8603()) != 0) {
            iM8618 = abstractC57542.mo10453().mo8883(mo8603());
        }
        if (this.f22999 == null) {
            if (abstractC57542.mo10453().mo8882() == null) {
                this.f22999 = DialogXStyle$PopTipSettings$ALIGN.BOTTOM;
            } else {
                this.f22999 = abstractC57542.mo10453().mo8882();
            }
        }
        mo8603();
        mo8603();
        int i2 = this.f22997;
        if (i2 == 0) {
            i2 = C0328R.anim.anim_dialogx_default_enter;
        }
        this.f22997 = i2;
        int i3 = this.f23000;
        if (i3 == 0) {
            i3 = C0328R.anim.anim_dialogx_default_exit;
        }
        this.f23000 = i3;
        long j = this.f11925;
        if (j == -1) {
            j = -1;
        }
        this.f11925 = j;
        long j2 = this.f11936;
        this.f11936 = j2 != -1 ? j2 : -1L;
        this.f11925 = 0L;
        if (m8618(mo8603()) != 0) {
            iM8618 = m8618(mo8603());
        }
        View viewM8610 = m8610(iM8618);
        this.f22998 = new C3325(this, viewM8610);
        if (viewM8610 != null) {
            viewM8610.setTag(this.f23001);
        }
        AbstractC4570.m8587(viewM8610);
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC4570
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8609() {
        return C9041.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC4570
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo8611() {
        super.mo8611();
        AbstractC4570.m8590(m8614());
    }
}
