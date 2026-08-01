package p273;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import androidx.appcompat.app.RunnableC0909;
import androidx.appcompat.widget.C0965;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.AbstractC4581;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;
import com.kongzue.dialogx.interfaces.InterfaceC4575;
import com.kongzue.dialogx.interfaces.InterfaceC4582;
import com.kongzue.dialogx.interfaces.SELECT_MODE;
import com.kongzue.dialogx.util.C4605;
import com.kongzue.dialogx.util.views.DialogListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p208.C8637;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9034 extends C9037 {

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public C9034 f22945;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public long f22946;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public float f22947;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public C4605 f22948;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public ArrayList f22949;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public HashMap f22950;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public SELECT_MODE f22951;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public DialogListView f22952;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public InterfaceC4575 f22953;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public boolean f22954;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public int f22955;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public static C9034 m14277() {
        C9034 c9034 = new C9034();
        c9034.f22945 = c9034;
        c9034.f22954 = true;
        c9034.f22955 = -1;
        c9034.f22951 = SELECT_MODE.NONE;
        c9034.f22950 = new HashMap();
        c9034.f22946 = 0L;
        return c9034;
    }

    @Override // p273.C9037
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final C9037 mo14278(String str, InterfaceC4582 interfaceC4582) {
        this.f22970 = str;
        this.f22968 = interfaceC4582;
        return this;
    }

    @Override // p273.C9037
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void mo14279(boolean z) {
        this.f22963 = BaseDialog$BOOLEAN.TRUE;
        m14286();
    }

    @Override // p273.C9037
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void mo14280() {
        if (this.f22965 == null) {
            return;
        }
        if (this.f22952 != null) {
            if (this.f22948 == null) {
                C9034 c9034 = this.f22945;
                Activity activityM8617 = m8617();
                ArrayList arrayList = this.f22949;
                C4605 c4605 = new C4605();
                c4605.f12097 = arrayList;
                c4605.f12096 = activityM8617;
                c4605.f12098 = c9034;
                this.f22948 = c4605;
            }
            ListAdapter adapter = this.f22952.getAdapter();
            DialogListView dialogListView = this.f22952;
            if (adapter == null) {
                dialogListView.setAdapter((ListAdapter) this.f22948);
            } else {
                ListAdapter adapter2 = dialogListView.getAdapter();
                C4605 c46052 = this.f22948;
                if (adapter2 != c46052) {
                    this.f22952.setAdapter((ListAdapter) c46052);
                } else {
                    c46052.notifyDataSetChanged();
                }
            }
        }
        super.mo14280();
    }

    @Override // p273.C9037
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void mo14281(String str) {
        this.f22971 = str;
        m14286();
    }

    @Override // p273.C9037
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final C9037 mo14282(AbstractC4581 abstractC4581) {
        this.f22961 = abstractC4581;
        m14286();
        return this;
    }

    @Override // p273.C9037
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final C9038 mo14283() {
        return this.f22965;
    }

    @Override // p273.C9037
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final boolean mo14284() {
        BaseDialog$BOOLEAN baseDialog$BOOLEAN = this.f22963;
        return baseDialog$BOOLEAN != null ? baseDialog$BOOLEAN == BaseDialog$BOOLEAN.TRUE : this.f11930;
    }

    @Override // p273.C9037
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final View mo14285() {
        AbstractC4581 abstractC4581 = this.f22961;
        if (abstractC4581 == null) {
            return null;
        }
        return abstractC4581.getCustomView();
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC4570
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo8602() {
        ViewGroup viewGroup;
        C9038 c9038 = this.f22965;
        if (c9038 == null || (viewGroup = c9038.f22987) == null) {
            return;
        }
        viewGroup.setVisibility(0);
        AbstractC5754 abstractC5754 = this.f11928;
        abstractC5754.mo10461();
        if (!this.f22954) {
            this.f22965.f22979.m8635(this.f11935);
            if (this.f11935 != 0) {
                this.f22965.f22977.mo8624(true);
            }
        }
        int iMo7434 = abstractC5754.mo10461().mo7434(mo8603());
        mo8603();
        if (iMo7434 == 0) {
            iMo7434 = mo8603() ? C0328R.drawable.rect_dialogx_material_menu_split_divider : C0328R.drawable.rect_dialogx_material_menu_split_divider_night;
        }
        if (mo8603()) {
            DialogListView dialogListView = new DialogListView(m8617());
            dialogListView.setVerticalScrollBarEnabled(false);
            this.f22952 = dialogListView;
        } else {
            DialogListView dialogListView2 = new DialogListView(new C8637(m8617(), C0328R.style.DialogXCompatThemeDark));
            dialogListView2.setVerticalScrollBarEnabled(false);
            this.f22952 = dialogListView2;
        }
        this.f22952.setOverScrollMode(2);
        this.f22952.setDivider(m8615().getDrawable(iMo7434));
        this.f22952.setDividerHeight(1);
        DialogListView dialogListView3 = this.f22952;
        dialogListView3.f11966 = new C9036(this);
        dialogListView3.setOnItemClickListener(new C0965(this, 2));
        this.f22965.f22987.addView(this.f22952, new ViewGroup.LayoutParams(-1, -2));
        mo14280();
    }

    @Override // p273.C9037, com.kongzue.dialogx.interfaces.AbstractC4570
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8609() {
        return C9034.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final void m14286() {
        if (this.f22965 == null) {
            return;
        }
        AbstractC4570.m8589(new RunnableC0909(this, 23));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final void m14287(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        this.f22949 = arrayList;
        arrayList.addAll(Arrays.asList(strArr));
        this.f22948 = null;
        m14286();
    }
}
