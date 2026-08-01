package p257;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.C2492;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;
import com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN;
import com.kongzue.dialogx.util.C3771;
import java.util.ArrayList;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p261.AbstractC8248;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8212 extends AbstractC3738 {

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static ArrayList f22649;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public BaseDialog$BOOLEAN f22650;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public float f22651;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public int f22652;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public C2492 f22653;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public DialogXStyle$PopTipSettings$ALIGN f22654;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public int f22655;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public C8212 f22656;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public int f22657;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public C8217 f22658;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public int[] f22659;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public Timer f22660;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public CharSequence f22661;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public C3771 f22662;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static C8212 m13737(String str) {
        C8212 c8212 = new C8212();
        c8212.f22656 = c8212;
        c8212.f22652 = 0;
        c8212.f22655 = 0;
        c8212.f22651 = AbstractC8248.f22828;
        C3771 c3771 = new C3771();
        c3771.f11741 = true;
        c8212.f22662 = c3771;
        c8212.f22659 = new int[]{-1, -1, -1, -1};
        c8212.f22661 = str;
        c8212.m13738();
        return c8212;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m13738() {
        m8053();
        if (m8055() != null) {
            AbstractC3738.m8028(m8055());
            return;
        }
        AbstractC4922 abstractC4922 = AbstractC8248.f22823;
        if (f22649 != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(f22649);
            for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
                C8212 c8212 = (C8212) copyOnWriteArrayList.get(i);
                if (copyOnWriteArrayList.size() < Integer.MAX_VALUE) {
                    c8212.m13739();
                } else if (i <= copyOnWriteArrayList.size() - Integer.MAX_VALUE) {
                    c8212.getClass();
                    AbstractC3738.m8030(new RunnableC8215(c8212, 1));
                    f22649.remove(c8212);
                } else {
                    c8212.m13739();
                }
            }
        }
        if (f22649 == null) {
            f22649 = new ArrayList();
        }
        f22649.add(this);
        int iM8059 = mo8044() ? R.layout.layout_dialogx_poptip_material : R.layout.layout_dialogx_poptip_material_dark;
        AbstractC4922 abstractC49222 = this.f11583;
        abstractC49222.mo9894();
        if (abstractC49222.mo9894().mo8324(mo8044()) != 0) {
            iM8059 = abstractC49222.mo9894().mo8324(mo8044());
        }
        if (this.f22654 == null) {
            if (abstractC49222.mo9894().mo8323() == null) {
                this.f22654 = DialogXStyle$PopTipSettings$ALIGN.BOTTOM;
            } else {
                this.f22654 = abstractC49222.mo9894().mo8323();
            }
        }
        mo8044();
        mo8044();
        int i2 = this.f22652;
        if (i2 == 0) {
            i2 = R.anim.anim_dialogx_default_enter;
        }
        this.f22652 = i2;
        int i3 = this.f22655;
        if (i3 == 0) {
            i3 = R.anim.anim_dialogx_default_exit;
        }
        this.f22655 = i3;
        long j = this.f11580;
        if (j == -1) {
            j = -1;
        }
        this.f11580 = j;
        long j2 = this.f11591;
        this.f11591 = j2 != -1 ? j2 : -1L;
        if (m8059(mo8044()) != 0) {
            iM8059 = m8059(mo8044());
        }
        View viewM8051 = m8051(iM8059);
        this.f22653 = new C2492(this, viewM8051);
        if (viewM8051 != null) {
            viewM8051.setTag(this.f22656);
        }
        AbstractC3738.m8028(viewM8051);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void m13739() {
        LinearLayout linearLayout;
        C2492 c2492 = this.f22653;
        if (c2492 == null || (linearLayout = (LinearLayout) c2492.f7461) == null) {
            return;
        }
        linearLayout.post(new RunnableC8216(this, linearLayout, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void m13740() {
        this.f22650 = BaseDialog$BOOLEAN.FALSE;
        if (this.f22653 != null) {
            AbstractC3738.m8030(new RunnableC8215(this, 0));
        }
        this.f11583.mo9894();
        this.f22657 = R.mipmap.ico_dialogx_success;
        if (this.f22653 == null) {
            return;
        }
        AbstractC3738.m8030(new RunnableC8215(this, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m13741() {
        this.f22650 = BaseDialog$BOOLEAN.FALSE;
        if (this.f22653 != null) {
            AbstractC3738.m8030(new RunnableC8215(this, 0));
        }
        this.f11583.mo9894();
        this.f22657 = R.mipmap.ico_dialogx_error;
        if (this.f22653 == null) {
            return;
        }
        AbstractC3738.m8030(new RunnableC8215(this, 0));
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3738
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo8048() {
        if (m8055() != null) {
            AbstractC3738.m8031(m8055());
            this.f11584 = false;
        }
        RelativeLayout relativeLayout = (RelativeLayout) this.f22653.f7457;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        AbstractC4922 abstractC4922 = AbstractC8248.f22823;
        if (f22649 != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(f22649);
            for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
                C8212 c8212 = (C8212) copyOnWriteArrayList.get(i);
                if (copyOnWriteArrayList.size() < Integer.MAX_VALUE) {
                    c8212.m13739();
                } else if (i <= copyOnWriteArrayList.size() - Integer.MAX_VALUE) {
                    c8212.getClass();
                    AbstractC3738.m8030(new RunnableC8215(c8212, 1));
                    f22649.remove(c8212);
                } else {
                    c8212.m13739();
                }
            }
        }
        if (f22649 == null) {
            f22649 = new ArrayList();
        }
        f22649.add(this);
        int iM8059 = mo8044() ? R.layout.layout_dialogx_poptip_material : R.layout.layout_dialogx_poptip_material_dark;
        AbstractC4922 abstractC49222 = this.f11583;
        abstractC49222.mo9894();
        if (abstractC49222.mo9894().mo8324(mo8044()) != 0) {
            iM8059 = abstractC49222.mo9894().mo8324(mo8044());
        }
        if (this.f22654 == null) {
            if (abstractC49222.mo9894().mo8323() == null) {
                this.f22654 = DialogXStyle$PopTipSettings$ALIGN.BOTTOM;
            } else {
                this.f22654 = abstractC49222.mo9894().mo8323();
            }
        }
        mo8044();
        mo8044();
        int i2 = this.f22652;
        if (i2 == 0) {
            i2 = R.anim.anim_dialogx_default_enter;
        }
        this.f22652 = i2;
        int i3 = this.f22655;
        if (i3 == 0) {
            i3 = R.anim.anim_dialogx_default_exit;
        }
        this.f22655 = i3;
        long j = this.f11580;
        if (j == -1) {
            j = -1;
        }
        this.f11580 = j;
        long j2 = this.f11591;
        this.f11591 = j2 != -1 ? j2 : -1L;
        this.f11580 = 0L;
        if (m8059(mo8044()) != 0) {
            iM8059 = m8059(mo8044());
        }
        View viewM8051 = m8051(iM8059);
        this.f22653 = new C2492(this, viewM8051);
        if (viewM8051 != null) {
            viewM8051.setTag(this.f22656);
        }
        AbstractC3738.m8028(viewM8051);
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3738
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8050() {
        return C8212.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3738
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo8052() {
        super.mo8052();
        AbstractC3738.m8031(m8055());
    }
}
