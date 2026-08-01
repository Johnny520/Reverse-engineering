package p206;

import android.R;
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
import androidx.appcompat.widget.C0981;
import androidx.appcompat.widget.C1015;
import androidx.appcompat.widget.C1024;
import androidx.appcompat.widget.ViewTreeObserverOnGlobalLayoutListenerC0968;
import androidx.compose.p001ui.graphics.ViewOnAttachStateChangeListenerC2427;
import com.davemorrissey.labs.subscaleview.C0328R;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC8605 extends AbstractC8623 implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC8618 f21455;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public View f21456;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public View f21457;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f21458;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f21461;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f21463;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f21464;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f21465;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public ViewTreeObserver f21466;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f21467;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C8627 f21468;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int f21469;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C1015 f21470;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f21471;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f21472;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Context f21473;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final MenuC8631 f21474;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC0968 f21460 = new ViewTreeObserverOnGlobalLayoutListenerC0968(this, 3);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC2427 f21459 = new ViewOnAttachStateChangeListenerC2427(this, 4);

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public int f21462 = 0;

    public ViewOnKeyListenerC8605(int i, int i2, Context context, View view, MenuC8631 menuC8631, boolean z) {
        this.f21473 = context;
        this.f21474 = menuC8631;
        this.f21467 = z;
        this.f21468 = new C8627(menuC8631, LayoutInflater.from(context), z, C0328R.layout.abc_popup_menu_item_layout);
        this.f21472 = i;
        this.f21469 = i2;
        Resources resources = context.getResources();
        this.f21471 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0328R.dimen.abc_config_prefDialogWidth));
        this.f21457 = view;
        this.f21470 = new C1015(context, null, i, i2);
        menuC8631.m13714(this, context);
    }

    @Override // p206.InterfaceC8606
    public final void dismiss() {
        if (mo1206()) {
            this.f21470.dismiss();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f21465 = true;
        this.f21474.m13713(true);
        ViewTreeObserver viewTreeObserver = this.f21466;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f21466 = this.f21456.getViewTreeObserver();
            }
            this.f21466.removeGlobalOnLayoutListener(this.f21460);
            this.f21466 = null;
        }
        this.f21456.removeOnAttachStateChangeListener(this.f21459);
        PopupWindow.OnDismissListener onDismissListener = this.f21458;
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

    @Override // p206.AbstractC8623
    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f21458 = onDismissListener;
    }

    @Override // p206.InterfaceC8606
    public final void show() {
        View view;
        if (mo1206()) {
            return;
        }
        if (this.f21465 || (view = this.f21457) == null) {
            C6755.m11870("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.f21456 = view;
        C1015 c1015 = this.f21470;
        c1015.setOnDismissListener(this);
        C0981 c0981 = c1015.f1054;
        c1015.setOnItemClickListener(this);
        c1015.f1057 = true;
        c0981.setFocusable(true);
        View view2 = this.f21456;
        boolean z = this.f21466 == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f21466 = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f21460);
        }
        view2.addOnAttachStateChangeListener(this.f21459);
        c1015.f1059 = view2;
        c1015.f1062 = this.f21462;
        boolean z2 = this.f21464;
        Context context = this.f21473;
        C8627 c8627 = this.f21468;
        if (!z2) {
            this.f21463 = AbstractC8623.m13706(c8627, context, this.f21471);
            this.f21464 = true;
        }
        c1015.m1207(this.f21463);
        c0981.setInputMethodMode(2);
        Rect rect = this.f21547;
        c1015.f1058 = rect != null ? new Rect(rect) : null;
        c1015.show();
        C1024 c1024 = c1015.f1078;
        c1024.setOnKeyListener(this);
        if (this.f21461) {
            MenuC8631 menuC8631 = this.f21474;
            if (menuC8631.f21596 != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(C0328R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1024, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(menuC8631.f21596);
                }
                frameLayout.setEnabled(false);
                c1024.addHeaderView(frameLayout, null, false);
            }
        }
        c1015.mo1074(c8627);
        c1015.show();
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo1169() {
        return false;
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo1172(SubMenuC8604 subMenuC8604) {
        boolean z;
        if (subMenuC8604.hasVisibleItems()) {
            C8614 c8614 = new C8614(this.f21472, this.f21469, this.f21473, this.f21456, subMenuC8604, this.f21467);
            InterfaceC8618 interfaceC8618 = this.f21455;
            c8614.f21539 = interfaceC8618;
            AbstractC8623 abstractC8623 = c8614.f21540;
            if (abstractC8623 != null) {
                abstractC8623.mo1261(interfaceC8618);
            }
            int size = subMenuC8604.f21610.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = subMenuC8604.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            c8614.f21535 = z;
            AbstractC8623 abstractC86232 = c8614.f21540;
            if (abstractC86232 != null) {
                abstractC86232.mo13692(z);
            }
            c8614.setOnDismissListener(this.f21458);
            this.f21458 = null;
            this.f21474.m13713(false);
            C1015 c1015 = this.f21470;
            int width = c1015.f1075;
            int iM1210 = c1015.m1210();
            if ((Gravity.getAbsoluteGravity(this.f21462, this.f21457.getLayoutDirection()) & 7) == 5) {
                width += this.f21457.getWidth();
            }
            if (!c8614.m13704()) {
                if (c8614.f21529 != null) {
                    c8614.m13703(width, iM1210, true, true);
                }
            }
            InterfaceC8618 interfaceC86182 = this.f21455;
            if (interfaceC86182 != null) {
                interfaceC86182.mo757(subMenuC8604);
            }
            return true;
        }
        return false;
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo1173(MenuC8631 menuC8631, boolean z) {
        if (menuC8631 != this.f21474) {
            return;
        }
        dismiss();
        InterfaceC8618 interfaceC8618 = this.f21455;
        if (interfaceC8618 != null) {
            interfaceC8618.mo750(menuC8631, z);
        }
    }

    @Override // p206.InterfaceC8606
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo1206() {
        return !this.f21465 && this.f21470.f1054.isShowing();
    }

    @Override // p206.AbstractC8623
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void mo13692(boolean z) {
        this.f21468.f21555 = z;
    }

    @Override // p206.AbstractC8623
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo13693(View view) {
        this.f21457 = view;
    }

    @Override // p206.AbstractC8623
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void mo13694(boolean z) {
        this.f21461 = z;
    }

    @Override // p206.AbstractC8623
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void mo13695(int i) {
        this.f21470.m1208(i);
    }

    @Override // p206.AbstractC8623
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void mo13696(int i) {
        this.f21462 = i;
    }

    @Override // p206.AbstractC8623
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void mo13697(int i) {
        this.f21470.f1075 = i;
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo1174() {
        this.f21464 = false;
        C8627 c8627 = this.f21468;
        if (c8627 != null) {
            c8627.notifyDataSetChanged();
        }
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo1261(InterfaceC8618 interfaceC8618) {
        this.f21455 = interfaceC8618;
    }

    @Override // p206.InterfaceC8606
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final C1024 mo1211() {
        return this.f21470.f1078;
    }

    @Override // p206.AbstractC8623
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo13698(MenuC8631 menuC8631) {
    }
}
