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
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC7780 extends AbstractC7793 implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f21142;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public boolean f21143;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean f21144;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public ViewTreeObserver f21146;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public InterfaceC7788 f21147;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public View f21148;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public int f21154;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public int f21155;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f21156;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f21157;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f21158;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public View f21159;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f21160;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f21161;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f21164;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Handler f21165;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Context f21166;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f21167;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final ArrayList f21162 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final ArrayList f21163 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC0121 f21153 = new ViewTreeObserverOnGlobalLayoutListenerC0121(this, 2);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC1592 f21152 = new ViewOnAttachStateChangeListenerC1592(this, 3);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C5851 f21151 = new C5851(this, 21);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f21150 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public int f21149 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f21145 = false;

    public ViewOnKeyListenerC7780(Context context, View view, int i, int i2, boolean z) {
        this.f21166 = context;
        this.f21148 = view;
        this.f21161 = i;
        this.f21160 = i2;
        this.f21164 = z;
        this.f21158 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f21167 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f21165 = new Handler();
    }

    @Override // p190.InterfaceC7776
    public final void dismiss() {
        ArrayList arrayList = this.f21163;
        int size = arrayList.size();
        if (size > 0) {
            C7781[] c7781Arr = (C7781[]) arrayList.toArray(new C7781[size]);
            for (int i = size - 1; i >= 0; i--) {
                C7781 c7781 = c7781Arr[i];
                if (c7781.f21170.f709.isShowing()) {
                    c7781.f21170.dismiss();
                }
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C7781 c7781;
        ArrayList arrayList = this.f21163;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c7781 = null;
                break;
            }
            c7781 = (C7781) arrayList.get(i);
            if (!c7781.f21170.f709.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c7781 != null) {
            c7781.f21169.m13126(false);
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

    @Override // p190.AbstractC7793
    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f21142 = onDismissListener;
    }

    @Override // p190.InterfaceC7776
    public final void show() {
        if (mo645()) {
            return;
        }
        ArrayList arrayList = this.f21162;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m13114((MenuC7801) it.next());
        }
        arrayList.clear();
        View view = this.f21148;
        this.f21159 = view;
        if (view != null) {
            boolean z = this.f21146 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f21146 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f21153);
            }
            this.f21159.addOnAttachStateChangeListener(this.f21152);
        }
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo608() {
        return false;
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo611(SubMenuC7774 subMenuC7774) {
        for (C7781 c7781 : this.f21163) {
            if (subMenuC7774 == c7781.f21169) {
                c7781.f21170.f733.requestFocus();
                return true;
            }
        }
        if (!subMenuC7774.hasVisibleItems()) {
            return false;
        }
        mo13111(subMenuC7774);
        InterfaceC7788 interfaceC7788 = this.f21147;
        if (interfaceC7788 != null) {
            interfaceC7788.mo196(subMenuC7774);
        }
        return true;
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo612(MenuC7801 menuC7801, boolean z) {
        ArrayList arrayList = this.f21163;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC7801 == ((C7781) arrayList.get(i)).f21169) {
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
            ((C7781) arrayList.get(i2)).f21169.m13126(false);
        }
        C7781 c7781 = (C7781) arrayList.remove(i);
        MenuC7801 menuC78012 = c7781.f21169;
        C0168 c0168 = c7781.f21170;
        C0134 c0134 = c0168.f709;
        menuC78012.m13135(this);
        if (this.f21143) {
            AbstractC0169.m626(c0134, null);
            c0134.setAnimationStyle(0);
        }
        c0168.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f21158 = ((C7781) arrayList.get(size2 - 1)).f21168;
        } else {
            this.f21158 = this.f21148.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C7781) arrayList.get(0)).f21169.m13126(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC7788 interfaceC7788 = this.f21147;
        if (interfaceC7788 != null) {
            interfaceC7788.mo189(menuC7801, true);
        }
        ViewTreeObserver viewTreeObserver = this.f21146;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f21146.removeGlobalOnLayoutListener(this.f21153);
            }
            this.f21146 = null;
        }
        this.f21159.removeOnAttachStateChangeListener(this.f21152);
        this.f21142.onDismiss();
    }

    @Override // p190.InterfaceC7776
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo645() {
        ArrayList arrayList = this.f21163;
        return arrayList.size() > 0 && ((C7781) arrayList.get(0)).f21170.f709.isShowing();
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
    public final void m13114(p190.MenuC7801 r20) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p190.ViewOnKeyListenerC7780.m13114(飘花落叶言子楪苏兰世哲.飘花落叶言子楪苏哲兰世):void");
    }

    @Override // p190.AbstractC7793
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo13105(boolean z) {
        this.f21145 = z;
    }

    @Override // p190.AbstractC7793
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo13106(View view) {
        if (this.f21148 != view) {
            this.f21148 = view;
            this.f21149 = Gravity.getAbsoluteGravity(this.f21150, view.getLayoutDirection());
        }
    }

    @Override // p190.AbstractC7793
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo13107(boolean z) {
        this.f21144 = z;
    }

    @Override // p190.AbstractC7793
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo13108(int i) {
        this.f21156 = true;
        this.f21154 = i;
    }

    @Override // p190.AbstractC7793
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo13109(int i) {
        if (this.f21150 != i) {
            this.f21150 = i;
            this.f21149 = Gravity.getAbsoluteGravity(i, this.f21148.getLayoutDirection());
        }
    }

    @Override // p190.AbstractC7793
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13110(int i) {
        this.f21157 = true;
        this.f21155 = i;
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo613() {
        Iterator it = this.f21163.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C7781) it.next()).f21170.f733.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C7797) adapter).notifyDataSetChanged();
        }
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo700(InterfaceC7788 interfaceC7788) {
        this.f21147 = interfaceC7788;
    }

    @Override // p190.AbstractC7793
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo13111(MenuC7801 menuC7801) {
        menuC7801.m13127(this, this.f21166);
        if (mo645()) {
            m13114(menuC7801);
        } else {
            this.f21162.add(menuC7801);
        }
    }

    @Override // p190.InterfaceC7776
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final C0177 mo650() {
        ArrayList arrayList = this.f21163;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C7781) AbstractC6136.m11555(1, arrayList)).f21170.f733;
    }
}
