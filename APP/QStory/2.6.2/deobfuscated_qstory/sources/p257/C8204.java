package p257;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import androidx.appcompat.app.RunnableC0062;
import androidx.appcompat.widget.C0118;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.AbstractC3748;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;
import com.kongzue.dialogx.interfaces.InterfaceC3742;
import com.kongzue.dialogx.interfaces.InterfaceC3749;
import com.kongzue.dialogx.interfaces.SELECT_MODE;
import com.kongzue.dialogx.util.C3772;
import com.kongzue.dialogx.util.views.DialogListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p033.AbstractC6325;
import p192.C7807;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8204 extends C8207 {

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public C8204 f22601;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public long f22602;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public float f22603;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public C3772 f22604;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public ArrayList f22605;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public HashMap f22606;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public SELECT_MODE f22607;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public DialogListView f22608;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public InterfaceC3742 f22609;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public boolean f22610;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public int f22611;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public static C8204 m13701() {
        C8204 c8204 = new C8204();
        c8204.f22601 = c8204;
        c8204.f22610 = true;
        c8204.f22611 = -1;
        c8204.f22607 = SELECT_MODE.NONE;
        c8204.f22606 = new HashMap();
        c8204.f22602 = 0L;
        return c8204;
    }

    @Override // p257.C8207
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final C8207 mo13702(String str, InterfaceC3749 interfaceC3749) {
        this.f22626 = str;
        this.f22624 = interfaceC3749;
        return this;
    }

    @Override // p257.C8207
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void mo13703(boolean z) {
        this.f22619 = BaseDialog$BOOLEAN.TRUE;
        m13710();
    }

    @Override // p257.C8207
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void mo13704() {
        if (this.f22621 == null) {
            return;
        }
        if (this.f22608 != null) {
            if (this.f22604 == null) {
                C8204 c8204 = this.f22601;
                Activity activityM8071 = m8071();
                ArrayList arrayList = this.f22605;
                C3772 c3772 = new C3772();
                c3772.f11747 = arrayList;
                c3772.f11746 = activityM8071;
                c3772.f11748 = c8204;
                this.f22604 = c3772;
            }
            ListAdapter adapter = this.f22608.getAdapter();
            DialogListView dialogListView = this.f22608;
            if (adapter == null) {
                dialogListView.setAdapter((ListAdapter) this.f22604);
            } else {
                ListAdapter adapter2 = dialogListView.getAdapter();
                C3772 c37722 = this.f22604;
                if (adapter2 != c37722) {
                    this.f22608.setAdapter((ListAdapter) c37722);
                } else {
                    c37722.notifyDataSetChanged();
                }
            }
        }
        super.mo13704();
    }

    @Override // p257.C8207
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void mo13705(String str) {
        this.f22627 = str;
        m13710();
    }

    @Override // p257.C8207
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final C8207 mo13706(AbstractC3748 abstractC3748) {
        this.f22617 = abstractC3748;
        m13710();
        return this;
    }

    @Override // p257.C8207
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final C8208 mo13707() {
        return this.f22621;
    }

    @Override // p257.C8207
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final boolean mo13708() {
        BaseDialog$BOOLEAN baseDialog$BOOLEAN = this.f22619;
        return baseDialog$BOOLEAN != null ? baseDialog$BOOLEAN == BaseDialog$BOOLEAN.TRUE : this.f11580;
    }

    @Override // p257.C8207
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final View mo13709() {
        AbstractC3748 abstractC3748 = this.f22617;
        if (abstractC3748 == null) {
            return null;
        }
        return abstractC3748.getCustomView();
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3737
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo8056() {
        ViewGroup viewGroup;
        C8208 c8208 = this.f22621;
        if (c8208 == null || (viewGroup = c8208.f22643) == null) {
            return;
        }
        viewGroup.setVisibility(0);
        AbstractC6325 abstractC6325 = this.f11578;
        abstractC6325.mo11877();
        if (!this.f22610) {
            this.f22621.f22635.m8089(this.f11585);
            if (this.f11585 != 0) {
                this.f22621.f22633.mo8078(true);
            }
        }
        int iMo8331 = abstractC6325.mo11877().mo8331(mo8057());
        mo8057();
        if (iMo8331 == 0) {
            iMo8331 = mo8057() ? R.drawable.rect_dialogx_material_menu_split_divider : R.drawable.rect_dialogx_material_menu_split_divider_night;
        }
        if (mo8057()) {
            DialogListView dialogListView = new DialogListView(m8071());
            dialogListView.setVerticalScrollBarEnabled(false);
            this.f22608 = dialogListView;
        } else {
            DialogListView dialogListView2 = new DialogListView(new C7807(m8071(), R.style.DialogXCompatThemeDark));
            dialogListView2.setVerticalScrollBarEnabled(false);
            this.f22608 = dialogListView2;
        }
        this.f22608.setOverScrollMode(2);
        this.f22608.setDivider(m8069().getDrawable(iMo8331));
        this.f22608.setDividerHeight(1);
        DialogListView dialogListView3 = this.f22608;
        dialogListView3.f11616 = new C8206(this);
        dialogListView3.setOnItemClickListener(new C0118(this, 2));
        this.f22621.f22643.addView(this.f22608, new ViewGroup.LayoutParams(-1, -2));
        mo13704();
    }

    @Override // p257.C8207, com.kongzue.dialogx.interfaces.AbstractC3737
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8063() {
        return C8204.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final void m13710() {
        if (this.f22621 == null) {
            return;
        }
        AbstractC3737.m8043(new RunnableC0062(this, 23));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final void m13711(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        this.f22605 = arrayList;
        arrayList.addAll(Arrays.asList(strArr));
        this.f22604 = null;
        m13710();
    }
}
