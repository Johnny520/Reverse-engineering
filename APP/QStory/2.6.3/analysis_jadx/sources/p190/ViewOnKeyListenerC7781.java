package p190;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AbstractC0169;
import androidx.appcompat.widget.C0134;
import androidx.appcompat.widget.C0168;
import androidx.appcompat.widget.C0177;
import androidx.appcompat.widget.ViewTreeObserverOnGlobalLayoutListenerC0121;
import androidx.compose.ui.graphics.ViewOnAttachStateChangeListenerC1592;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import java.util.Iterator;
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC7781 extends AbstractC7794 implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f21139;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public boolean f21140;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean f21141;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public ViewTreeObserver f21143;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public InterfaceC7789 f21144;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public View f21145;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public int f21151;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public int f21152;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f21153;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f21154;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f21155;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public View f21156;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f21157;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f21158;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f21161;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Handler f21162;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Context f21163;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f21164;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final ArrayList f21159 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final ArrayList f21160 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC0121 f21150 = new ViewTreeObserverOnGlobalLayoutListenerC0121(this, 2);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC1592 f21149 = new ViewOnAttachStateChangeListenerC1592(this, 3);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C5856 f21148 = new C5856(this, 21);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f21147 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public int f21146 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f21142 = false;

    public ViewOnKeyListenerC7781(Context context, View view, int i, int i2, boolean z) {
        this.f21163 = context;
        this.f21145 = view;
        this.f21158 = i;
        this.f21157 = i2;
        this.f21161 = z;
        this.f21155 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f21164 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f21162 = new Handler();
    }

    @Override // p190.InterfaceC7777
    public final void dismiss() {
        ArrayList arrayList = this.f21160;
        int size = arrayList.size();
        if (size > 0) {
            C7782[] c7782Arr = (C7782[]) arrayList.toArray(new C7782[size]);
            for (int i = size - 1; i >= 0; i--) {
                C7782 c7782 = c7782Arr[i];
                if (c7782.f21167.f709.isShowing()) {
                    c7782.f21167.dismiss();
                }
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C7782 c7782;
        ArrayList arrayList = this.f21160;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c7782 = null;
                break;
            }
            c7782 = (C7782) arrayList.get(i);
            if (!c7782.f21167.f709.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c7782 != null) {
            c7782.f21166.m13154(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p190.AbstractC7794
    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f21139 = onDismissListener;
    }

    @Override // p190.InterfaceC7777
    public final void show() {
        if (mo646()) {
            return;
        }
        ArrayList arrayList = this.f21159;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m13142((MenuC7802) it.next());
        }
        arrayList.clear();
        View view = this.f21145;
        this.f21156 = view;
        if (view != null) {
            boolean z = this.f21143 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f21143 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f21150);
            }
            this.f21156.addOnAttachStateChangeListener(this.f21149);
        }
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo609() {
        return false;
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo612(SubMenuC7775 subMenuC7775) {
        for (C7782 c7782 : this.f21160) {
            if (subMenuC7775 == c7782.f21166) {
                c7782.f21167.f733.requestFocus();
                return true;
            }
        }
        if (!subMenuC7775.hasVisibleItems()) {
            return false;
        }
        mo13139(subMenuC7775);
        InterfaceC7789 interfaceC7789 = this.f21144;
        if (interfaceC7789 != null) {
            interfaceC7789.mo197(subMenuC7775);
        }
        return true;
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo613(MenuC7802 menuC7802, boolean z) {
        ArrayList arrayList = this.f21160;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC7802 == ((C7782) arrayList.get(i)).f21166) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((C7782) arrayList.get(i2)).f21166.m13154(false);
        }
        C7782 c7782 = (C7782) arrayList.remove(i);
        MenuC7802 menuC78022 = c7782.f21166;
        C0168 c0168 = c7782.f21167;
        C0134 c0134 = c0168.f709;
        menuC78022.m13163(this);
        if (this.f21140) {
            AbstractC0169.m627(c0134, null);
            c0134.setAnimationStyle(0);
        }
        c0168.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f21155 = ((C7782) arrayList.get(size2 - 1)).f21165;
        } else {
            this.f21155 = this.f21145.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C7782) arrayList.get(0)).f21166.m13154(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC7789 interfaceC7789 = this.f21144;
        if (interfaceC7789 != null) {
            interfaceC7789.mo190(menuC7802, true);
        }
        ViewTreeObserver viewTreeObserver = this.f21143;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f21143.removeGlobalOnLayoutListener(this.f21150);
            }
            this.f21143 = null;
        }
        this.f21156.removeOnAttachStateChangeListener(this.f21149);
        this.f21139.onDismiss();
    }

    @Override // p190.InterfaceC7777
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo646() {
        ArrayList arrayList = this.f21160;
        return arrayList.size() > 0 && ((C7782) arrayList.get(0)).f21167.f709.isShowing();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13142(p190.MenuC7802 r20) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p190.ViewOnKeyListenerC7781.m13142(飘花落叶言子楪苏兰世哲.飘花落叶言子楪苏哲兰世):void");
    }

    @Override // p190.AbstractC7794
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo13133(boolean z) {
        this.f21142 = z;
    }

    @Override // p190.AbstractC7794
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo13134(View view) {
        if (this.f21145 != view) {
            this.f21145 = view;
            this.f21146 = Gravity.getAbsoluteGravity(this.f21147, view.getLayoutDirection());
        }
    }

    @Override // p190.AbstractC7794
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo13135(boolean z) {
        this.f21141 = z;
    }

    @Override // p190.AbstractC7794
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo13136(int i) {
        this.f21153 = true;
        this.f21151 = i;
    }

    @Override // p190.AbstractC7794
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo13137(int i) {
        if (this.f21147 != i) {
            this.f21147 = i;
            this.f21146 = Gravity.getAbsoluteGravity(i, this.f21145.getLayoutDirection());
        }
    }

    @Override // p190.AbstractC7794
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13138(int i) {
        this.f21154 = true;
        this.f21152 = i;
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo614() {
        Iterator it = this.f21160.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C7782) it.next()).f21167.f733.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C7798) adapter).notifyDataSetChanged();
        }
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo701(InterfaceC7789 interfaceC7789) {
        this.f21144 = interfaceC7789;
    }

    @Override // p190.AbstractC7794
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo13139(MenuC7802 menuC7802) {
        menuC7802.m13155(this, this.f21163);
        if (mo646()) {
            m13142(menuC7802);
        } else {
            this.f21159.add(menuC7802);
        }
    }

    @Override // p190.InterfaceC7777
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final C0177 mo651() {
        ArrayList arrayList = this.f21160;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C7782) AbstractC6183.m11586(1, arrayList)).f21167.f733;
    }
}
