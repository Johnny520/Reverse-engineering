package yyds;

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
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛳᛶᛷᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0619 extends AbstractC2356 implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public View f2989;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final int f2990;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f2991;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final int f2992;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final MenuC0836 f2993;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public int f2994;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public View f2995;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public boolean f2996;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public ViewTreeObserver f2997;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final boolean f2998;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public boolean f2999;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final C2795 f3003;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public boolean f3004;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public InterfaceC2407 f3005;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C2309 f3006;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Context f3007;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC0562 f3001 = new ViewTreeObserverOnGlobalLayoutListenerC0562(4, this);

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC0075 f3002 = new ViewOnAttachStateChangeListenerC0075(2, this);

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public int f3000 = 0;

    public ViewOnKeyListenerC0619(Context context, MenuC0836 menuC0836, View view, int i, boolean z) {
        this.f3007 = context;
        this.f2993 = menuC0836;
        this.f2998 = z;
        this.f3006 = new C2309(menuC0836, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f2992 = i;
        Resources resources = context.getResources();
        this.f2990 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2989 = view;
        this.f3003 = new C2795(context, null, i);
        menuC0836.m1904(this, context);
    }

    @Override // yyds.InterfaceC0911
    public final void dismiss() {
        if (mo1515()) {
            this.f3003.dismiss();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2996 = true;
        this.f2993.m1914(true);
        ViewTreeObserver viewTreeObserver = this.f2997;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2997 = this.f2995.getViewTreeObserver();
            }
            this.f2997.removeGlobalOnLayoutListener(this.f3001);
            this.f2997 = null;
        }
        this.f2995.removeOnAttachStateChangeListener(this.f3002);
        PopupWindow.OnDismissListener onDismissListener = this.f2991;
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

    @Override // yyds.InterfaceC0911
    public final void show() {
        View view;
        if (mo1515()) {
            return;
        }
        if (this.f2996 || (view = this.f2989) == null) {
            C0188.m800("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.f2995 = view;
        C2795 c2795 = this.f3003;
        C1000 c1000 = c2795.f11541;
        C1000 c10002 = c2795.f11541;
        c1000.setOnDismissListener(this);
        c2795.f11547 = this;
        c2795.f11548 = true;
        c10002.setFocusable(true);
        View view2 = this.f2995;
        boolean z = this.f2997 == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2997 = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f3001);
        }
        view2.addOnAttachStateChangeListener(this.f3002);
        c2795.f11550 = view2;
        c2795.f11538 = this.f3000;
        boolean z2 = this.f3004;
        Context context = this.f3007;
        C2309 c2309 = this.f3006;
        if (!z2) {
            this.f2994 = AbstractC2356.m4379(c2309, context, this.f2990);
            this.f3004 = true;
        }
        c2795.m4375(this.f2994);
        c10002.setInputMethodMode(2);
        Rect rect = this.f11576;
        c2795.f11562 = rect != null ? new Rect(rect) : null;
        c2795.show();
        C2045 c2045 = c2795.f11543;
        c2045.setOnKeyListener(this);
        if (this.f2999) {
            MenuC0836 menuC0836 = this.f2993;
            if (menuC0836.f3829 != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c2045, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0836.f3829);
                }
                frameLayout.setEnabled(false);
                c2045.addHeaderView(frameLayout, null, false);
            }
        }
        c2795.mo2569(c2309);
        c2795.show();
    }

    @Override // yyds.AbstractC2356
    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final void mo1513(boolean z) {
        this.f3006.f11314 = z;
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final boolean mo1501() {
        return false;
    }

    @Override // yyds.AbstractC2356
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final void mo1514(View view) {
        this.f2989 = view;
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo1503() {
        this.f3004 = false;
        C2309 c2309 = this.f3006;
        if (c2309 != null) {
            c2309.notifyDataSetChanged();
        }
    }

    @Override // yyds.InterfaceC0911
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean mo1515() {
        return !this.f2996 && this.f3003.f11541.isShowing();
    }

    @Override // yyds.AbstractC2356
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final void mo1516(int i) {
        this.f3000 = i;
    }

    @Override // yyds.AbstractC2356
    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final void mo1517(boolean z) {
        this.f2999 = z;
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1504(MenuC0836 menuC0836, boolean z) {
        if (menuC0836 != this.f2993) {
            return;
        }
        dismiss();
        InterfaceC2407 interfaceC2407 = this.f3005;
        if (interfaceC2407 != null) {
            interfaceC2407.mo391(menuC0836, z);
        }
    }

    @Override // yyds.AbstractC2356
    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final void mo1518(PopupWindow.OnDismissListener onDismissListener) {
        this.f2991 = onDismissListener;
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final boolean mo1505(SubMenuC1011 subMenuC1011) {
        boolean z;
        if (subMenuC1011.hasVisibleItems()) {
            C1649 c1649 = new C1649(this.f3007, subMenuC1011, this.f2995, this.f2998, this.f2992, 0);
            InterfaceC2407 interfaceC2407 = this.f3005;
            c1649.f8389 = interfaceC2407;
            AbstractC2356 abstractC2356 = c1649.f8390;
            if (abstractC2356 != null) {
                abstractC2356.mo1508(interfaceC2407);
            }
            int size = subMenuC1011.f3823.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = subMenuC1011.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            c1649.f8394 = z;
            AbstractC2356 abstractC23562 = c1649.f8390;
            if (abstractC23562 != null) {
                abstractC23562.mo1513(z);
            }
            c1649.f8396 = this.f2991;
            this.f2991 = null;
            this.f2993.m1914(false);
            C2795 c2795 = this.f3003;
            int width = c2795.f11539;
            int iM4372 = c2795.m4372();
            int i2 = this.f3000;
            View view = this.f2989;
            WeakHashMap weakHashMap = AbstractC1640.f8352;
            if ((Gravity.getAbsoluteGravity(i2, view.getLayoutDirection()) & 7) == 5) {
                width += this.f2989.getWidth();
            }
            if (!c1649.m3361()) {
                if (c1649.f8391 != null) {
                    c1649.m3362(width, iM4372, true, true);
                }
            }
            InterfaceC2407 interfaceC24072 = this.f3005;
            if (interfaceC24072 != null) {
                interfaceC24072.mo404(subMenuC1011);
            }
            return true;
        }
        return false;
    }

    @Override // yyds.AbstractC2356
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final void mo1519(MenuC0836 menuC0836) {
    }

    @Override // yyds.AbstractC2356
    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final void mo1520(int i) {
        this.f3003.m4368(i);
    }

    @Override // yyds.AbstractC2356
    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final void mo1521(int i) {
        this.f3003.f11539 = i;
    }

    @Override // yyds.InterfaceC0911
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C2045 mo1522() {
        return this.f3003.f11543;
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo1508(InterfaceC2407 interfaceC2407) {
        this.f3005 = interfaceC2407;
    }
}
