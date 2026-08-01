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
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC7776 extends AbstractC7794 implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC7789 f21110;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public View f21111;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public View f21112;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f21113;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f21116;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f21118;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f21119;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f21120;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public ViewTreeObserver f21121;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f21122;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C7798 f21123;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int f21124;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C0168 f21125;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f21126;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f21127;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Context f21128;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final MenuC7802 f21129;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC0121 f21115 = new ViewTreeObserverOnGlobalLayoutListenerC0121(this, 3);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC1592 f21114 = new ViewOnAttachStateChangeListenerC1592(this, 4);

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public int f21117 = 0;

    public ViewOnKeyListenerC7776(int i, int i2, Context context, View view, MenuC7802 menuC7802, boolean z) {
        this.f21128 = context;
        this.f21129 = menuC7802;
        this.f21122 = z;
        this.f21123 = new C7798(menuC7802, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f21127 = i;
        this.f21124 = i2;
        Resources resources = context.getResources();
        this.f21126 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f21112 = view;
        this.f21125 = new C0168(context, null, i, i2);
        menuC7802.m13155(this, context);
    }

    @Override // p190.InterfaceC7777
    public final void dismiss() {
        if (mo646()) {
            this.f21125.dismiss();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f21120 = true;
        this.f21129.m13154(true);
        ViewTreeObserver viewTreeObserver = this.f21121;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f21121 = this.f21111.getViewTreeObserver();
            }
            this.f21121.removeGlobalOnLayoutListener(this.f21115);
            this.f21121 = null;
        }
        this.f21111.removeOnAttachStateChangeListener(this.f21114);
        PopupWindow.OnDismissListener onDismissListener = this.f21113;
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

    @Override // p190.AbstractC7794
    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f21113 = onDismissListener;
    }

    @Override // p190.InterfaceC7777
    public final void show() {
        View view;
        if (mo646()) {
            return;
        }
        if (this.f21120 || (view = this.f21112) == null) {
            C5925.m11311("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.f21111 = view;
        C0168 c0168 = this.f21125;
        c0168.setOnDismissListener(this);
        C0134 c0134 = c0168.f709;
        c0168.setOnItemClickListener(this);
        c0168.f712 = true;
        c0134.setFocusable(true);
        View view2 = this.f21111;
        boolean z = this.f21121 == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f21121 = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f21115);
        }
        view2.addOnAttachStateChangeListener(this.f21114);
        c0168.f714 = view2;
        c0168.f717 = this.f21117;
        boolean z2 = this.f21119;
        Context context = this.f21128;
        C7798 c7798 = this.f21123;
        if (!z2) {
            this.f21118 = AbstractC7794.m13147(c7798, context, this.f21126);
            this.f21119 = true;
        }
        c0168.m647(this.f21118);
        c0134.setInputMethodMode(2);
        Rect rect = this.f21202;
        c0168.f713 = rect != null ? new Rect(rect) : null;
        c0168.show();
        C0177 c0177 = c0168.f733;
        c0177.setOnKeyListener(this);
        if (this.f21116) {
            MenuC7802 menuC7802 = this.f21129;
            if (menuC7802.f21251 != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0177, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC7802.f21251);
                }
                frameLayout.setEnabled(false);
                c0177.addHeaderView(frameLayout, null, false);
            }
        }
        c0168.mo514(c7798);
        c0168.show();
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo609() {
        return false;
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo612(SubMenuC7775 subMenuC7775) {
        boolean z;
        if (subMenuC7775.hasVisibleItems()) {
            C7785 c7785 = new C7785(this.f21127, this.f21124, this.f21128, this.f21111, subMenuC7775, this.f21122);
            InterfaceC7789 interfaceC7789 = this.f21110;
            c7785.f21194 = interfaceC7789;
            AbstractC7794 abstractC7794 = c7785.f21195;
            if (abstractC7794 != null) {
                abstractC7794.mo701(interfaceC7789);
            }
            int size = subMenuC7775.f21265.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = subMenuC7775.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            c7785.f21190 = z;
            AbstractC7794 abstractC77942 = c7785.f21195;
            if (abstractC77942 != null) {
                abstractC77942.mo13133(z);
            }
            c7785.setOnDismissListener(this.f21113);
            this.f21113 = null;
            this.f21129.m13154(false);
            C0168 c0168 = this.f21125;
            int width = c0168.f730;
            int iM650 = c0168.m650();
            if ((Gravity.getAbsoluteGravity(this.f21117, this.f21112.getLayoutDirection()) & 7) == 5) {
                width += this.f21112.getWidth();
            }
            if (!c7785.m13145()) {
                if (c7785.f21184 != null) {
                    c7785.m13144(width, iM650, true, true);
                }
            }
            InterfaceC7789 interfaceC77892 = this.f21110;
            if (interfaceC77892 != null) {
                interfaceC77892.mo197(subMenuC7775);
            }
            return true;
        }
        return false;
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo613(MenuC7802 menuC7802, boolean z) {
        if (menuC7802 != this.f21129) {
            return;
        }
        dismiss();
        InterfaceC7789 interfaceC7789 = this.f21110;
        if (interfaceC7789 != null) {
            interfaceC7789.mo190(menuC7802, z);
        }
    }

    @Override // p190.InterfaceC7777
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo646() {
        return !this.f21120 && this.f21125.f709.isShowing();
    }

    @Override // p190.AbstractC7794
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void mo13133(boolean z) {
        this.f21123.f21210 = z;
    }

    @Override // p190.AbstractC7794
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo13134(View view) {
        this.f21112 = view;
    }

    @Override // p190.AbstractC7794
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void mo13135(boolean z) {
        this.f21116 = z;
    }

    @Override // p190.AbstractC7794
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void mo13136(int i) {
        this.f21125.m648(i);
    }

    @Override // p190.AbstractC7794
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void mo13137(int i) {
        this.f21117 = i;
    }

    @Override // p190.AbstractC7794
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void mo13138(int i) {
        this.f21125.f730 = i;
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo614() {
        this.f21119 = false;
        C7798 c7798 = this.f21123;
        if (c7798 != null) {
            c7798.notifyDataSetChanged();
        }
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo701(InterfaceC7789 interfaceC7789) {
        this.f21110 = interfaceC7789;
    }

    @Override // p190.InterfaceC7777
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final C0177 mo651() {
        return this.f21125.f733;
    }

    @Override // p190.AbstractC7794
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo13139(MenuC7802 menuC7802) {
    }
}
