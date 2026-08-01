package p257;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import androidx.appcompat.app.RunnableC0062;
import androidx.appcompat.widget.C0118;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.AbstractC3749;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;
import com.kongzue.dialogx.interfaces.InterfaceC3743;
import com.kongzue.dialogx.interfaces.InterfaceC3750;
import com.kongzue.dialogx.interfaces.SELECT_MODE;
import com.kongzue.dialogx.util.C3773;
import com.kongzue.dialogx.util.views.DialogListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p192.C7808;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8205 extends C8208 {

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public C8205 f22600;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public long f22601;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public float f22602;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public C3773 f22603;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public ArrayList f22604;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public HashMap f22605;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public SELECT_MODE f22606;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public DialogListView f22607;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public InterfaceC3743 f22608;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public boolean f22609;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public int f22610;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public static C8205 m13718() {
        C8205 c8205 = new C8205();
        c8205.f22600 = c8205;
        c8205.f22609 = true;
        c8205.f22610 = -1;
        c8205.f22606 = SELECT_MODE.NONE;
        c8205.f22605 = new HashMap();
        c8205.f22601 = 0L;
        return c8205;
    }

    @Override // p257.C8208
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final C8208 mo13719(String str, InterfaceC3750 interfaceC3750) {
        this.f22625 = str;
        this.f22623 = interfaceC3750;
        return this;
    }

    @Override // p257.C8208
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void mo13720(boolean z) {
        this.f22618 = BaseDialog$BOOLEAN.TRUE;
        m13727();
    }

    @Override // p257.C8208
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void mo13721() {
        if (this.f22620 == null) {
            return;
        }
        if (this.f22607 != null) {
            if (this.f22603 == null) {
                C8205 c8205 = this.f22600;
                Activity activityM8058 = m8058();
                ArrayList arrayList = this.f22604;
                C3773 c3773 = new C3773();
                c3773.f11752 = arrayList;
                c3773.f11751 = activityM8058;
                c3773.f11753 = c8205;
                this.f22603 = c3773;
            }
            ListAdapter adapter = this.f22607.getAdapter();
            DialogListView dialogListView = this.f22607;
            if (adapter == null) {
                dialogListView.setAdapter((ListAdapter) this.f22603);
            } else {
                ListAdapter adapter2 = dialogListView.getAdapter();
                C3773 c37732 = this.f22603;
                if (adapter2 != c37732) {
                    this.f22607.setAdapter((ListAdapter) c37732);
                } else {
                    c37732.notifyDataSetChanged();
                }
            }
        }
        super.mo13721();
    }

    @Override // p257.C8208
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void mo13722(String str) {
        this.f22626 = str;
        m13727();
    }

    @Override // p257.C8208
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final C8208 mo13723(AbstractC3749 abstractC3749) {
        this.f22616 = abstractC3749;
        m13727();
        return this;
    }

    @Override // p257.C8208
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final C8209 mo13724() {
        return this.f22620;
    }

    @Override // p257.C8208
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final boolean mo13725() {
        BaseDialog$BOOLEAN baseDialog$BOOLEAN = this.f22618;
        return baseDialog$BOOLEAN != null ? baseDialog$BOOLEAN == BaseDialog$BOOLEAN.TRUE : this.f11585;
    }

    @Override // p257.C8208
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final View mo13726() {
        AbstractC3749 abstractC3749 = this.f22616;
        if (abstractC3749 == null) {
            return null;
        }
        return abstractC3749.getCustomView();
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3738
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo8043() {
        ViewGroup viewGroup;
        C8209 c8209 = this.f22620;
        if (c8209 == null || (viewGroup = c8209.f22642) == null) {
            return;
        }
        viewGroup.setVisibility(0);
        AbstractC4922 abstractC4922 = this.f11583;
        abstractC4922.mo9902();
        if (!this.f22609) {
            this.f22620.f22634.m8076(this.f11590);
            if (this.f11590 != 0) {
                this.f22620.f22632.mo8065(true);
            }
        }
        int iMo6874 = abstractC4922.mo9902().mo6874(mo8044());
        mo8044();
        if (iMo6874 == 0) {
            iMo6874 = mo8044() ? R.drawable.rect_dialogx_material_menu_split_divider : R.drawable.rect_dialogx_material_menu_split_divider_night;
        }
        if (mo8044()) {
            DialogListView dialogListView = new DialogListView(m8058());
            dialogListView.setVerticalScrollBarEnabled(false);
            this.f22607 = dialogListView;
        } else {
            DialogListView dialogListView2 = new DialogListView(new C7808(m8058(), R.style.DialogXCompatThemeDark));
            dialogListView2.setVerticalScrollBarEnabled(false);
            this.f22607 = dialogListView2;
        }
        this.f22607.setOverScrollMode(2);
        this.f22607.setDivider(m8056().getDrawable(iMo6874));
        this.f22607.setDividerHeight(1);
        DialogListView dialogListView3 = this.f22607;
        dialogListView3.f11621 = new C8207(this);
        dialogListView3.setOnItemClickListener(new C0118(this, 2));
        this.f22620.f22642.addView(this.f22607, new ViewGroup.LayoutParams(-1, -2));
        mo13721();
    }

    @Override // p257.C8208, com.kongzue.dialogx.interfaces.AbstractC3738
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8050() {
        return C8205.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final void m13727() {
        if (this.f22620 == null) {
            return;
        }
        AbstractC3738.m8030(new RunnableC0062(this, 23));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final void m13728(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        this.f22604 = arrayList;
        arrayList.addAll(Arrays.asList(strArr));
        this.f22603 = null;
        m13727();
    }
}
