package p190;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.C0134;
import androidx.appcompat.widget.C0168;
import androidx.appcompat.widget.C0177;
import androidx.appcompat.widget.ViewTreeObserverOnGlobalLayoutListenerC0121;
import androidx.compose.ui.graphics.ViewOnAttachStateChangeListenerC1592;
import com.davemorrissey.labs.subscaleview.R;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC7775 extends AbstractC7793 implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC7788 f21113;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public View f21114;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public View f21115;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f21116;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f21119;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f21121;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f21122;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f21123;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public ViewTreeObserver f21124;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f21125;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C7797 f21126;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int f21127;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C0168 f21128;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f21129;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f21130;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Context f21131;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final MenuC7801 f21132;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC0121 f21118 = new ViewTreeObserverOnGlobalLayoutListenerC0121(this, 3);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC1592 f21117 = new ViewOnAttachStateChangeListenerC1592(this, 4);

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public int f21120 = 0;

    public ViewOnKeyListenerC7775(int i, int i2, Context context, View view, MenuC7801 menuC7801, boolean z) {
        this.f21131 = context;
        this.f21132 = menuC7801;
        this.f21125 = z;
        this.f21126 = new C7797(menuC7801, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f21130 = i;
        this.f21127 = i2;
        Resources resources = context.getResources();
        this.f21129 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f21115 = view;
        this.f21128 = new C0168(context, null, i, i2);
        menuC7801.m13127(this, context);
    }

    @Override // p190.InterfaceC7776
    public final void dismiss() {
        if (mo645()) {
            this.f21128.dismiss();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f21123 = true;
        this.f21132.m13126(true);
        ViewTreeObserver viewTreeObserver = this.f21124;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f21124 = this.f21114.getViewTreeObserver();
            }
            this.f21124.removeGlobalOnLayoutListener(this.f21118);
            this.f21124 = null;
        }
        this.f21114.removeOnAttachStateChangeListener(this.f21117);
        PopupWindow.OnDismissListener onDismissListener = this.f21116;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f21116 = onDismissListener;
    }

    @Override // p190.InterfaceC7776
    public final void show() {
        View view;
        if (mo645()) {
            return;
        }
        if (this.f21123 || (view = this.f21115) == null) {
            C5919.m11250("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.f21114 = view;
        C0168 c0168 = this.f21128;
        c0168.setOnDismissListener(this);
        C0134 c0134 = c0168.f709;
        c0168.setOnItemClickListener(this);
        c0168.f712 = true;
        c0134.setFocusable(true);
        View view2 = this.f21114;
        boolean z = this.f21124 == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f21124 = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f21118);
        }
        view2.addOnAttachStateChangeListener(this.f21117);
        c0168.f714 = view2;
        c0168.f717 = this.f21120;
        boolean z2 = this.f21122;
        Context context = this.f21131;
        C7797 c7797 = this.f21126;
        if (!z2) {
            this.f21121 = AbstractC7793.m13119(c7797, context, this.f21129);
            this.f21122 = true;
        }
        c0168.m646(this.f21121);
        c0134.setInputMethodMode(2);
        Rect rect = this.f21205;
        c0168.f713 = rect != null ? new Rect(rect) : null;
        c0168.show();
        C0177 c0177 = c0168.f733;
        c0177.setOnKeyListener(this);
        if (this.f21119) {
            MenuC7801 menuC7801 = this.f21132;
            if (menuC7801.f21254 != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0177, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC7801.f21254);
                }
                frameLayout.setEnabled(false);
                c0177.addHeaderView(frameLayout, null, false);
            }
        }
        c0168.mo513(c7797);
        c0168.show();
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo608() {
        return false;
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo611(SubMenuC7774 subMenuC7774) {
        boolean z;
        if (subMenuC7774.hasVisibleItems()) {
            C7784 c7784 = new C7784(this.f21130, this.f21127, this.f21131, this.f21114, subMenuC7774, this.f21125);
            InterfaceC7788 interfaceC7788 = this.f21113;
            c7784.f21197 = interfaceC7788;
            AbstractC7793 abstractC7793 = c7784.f21198;
            if (abstractC7793 != null) {
                abstractC7793.mo700(interfaceC7788);
            }
            int size = subMenuC7774.f21268.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = subMenuC7774.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            c7784.f21193 = z;
            AbstractC7793 abstractC77932 = c7784.f21198;
            if (abstractC77932 != null) {
                abstractC77932.mo13105(z);
            }
            c7784.setOnDismissListener(this.f21116);
            this.f21116 = null;
            this.f21132.m13126(false);
            C0168 c0168 = this.f21128;
            int width = c0168.f730;
            int iM649 = c0168.m649();
            if ((Gravity.getAbsoluteGravity(this.f21120, this.f21115.getLayoutDirection()) & 7) == 5) {
                width += this.f21115.getWidth();
            }
            if (!c7784.m13117()) {
                if (c7784.f21187 != null) {
                    c7784.m13116(width, iM649, true, true);
                }
            }
            InterfaceC7788 interfaceC77882 = this.f21113;
            if (interfaceC77882 != null) {
                interfaceC77882.mo196(subMenuC7774);
            }
            return true;
        }
        return false;
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo612(MenuC7801 menuC7801, boolean z) {
        if (menuC7801 != this.f21132) {
            return;
        }
        dismiss();
        InterfaceC7788 interfaceC7788 = this.f21113;
        if (interfaceC7788 != null) {
            interfaceC7788.mo189(menuC7801, z);
        }
    }

    @Override // p190.InterfaceC7776
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo645() {
        return !this.f21123 && this.f21128.f709.isShowing();
    }

    @Override // p190.AbstractC7793
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void mo13105(boolean z) {
        this.f21126.f21213 = z;
    }

    @Override // p190.AbstractC7793
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo13106(View view) {
        this.f21115 = view;
    }

    @Override // p190.AbstractC7793
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void mo13107(boolean z) {
        this.f21119 = z;
    }

    @Override // p190.AbstractC7793
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void mo13108(int i) {
        this.f21128.m647(i);
    }

    @Override // p190.AbstractC7793
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void mo13109(int i) {
        this.f21120 = i;
    }

    @Override // p190.AbstractC7793
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void mo13110(int i) {
        this.f21128.f730 = i;
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo613() {
        this.f21122 = false;
        C7797 c7797 = this.f21126;
        if (c7797 != null) {
            c7797.notifyDataSetChanged();
        }
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo700(InterfaceC7788 interfaceC7788) {
        this.f21113 = interfaceC7788;
    }

    @Override // p190.InterfaceC7776
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final C0177 mo650() {
        return this.f21128.f733;
    }

    @Override // p190.AbstractC7793
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo13111(MenuC7801 menuC7801) {
    }
}
