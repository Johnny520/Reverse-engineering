package p000a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0997e;
import androidx.appcompat.view.menu.C0998f;
import androidx.appcompat.view.menu.C1000h;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.ViewOnKeyListenerC0994b;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: a.fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0576fb extends C0102F9 implements InterfaceC0519cb {

    /* JADX INFO: renamed from: D */
    public static final Method f2139D;

    /* JADX INFO: renamed from: C */
    public ViewOnKeyListenerC0994b.c f2140C;

    /* JADX INFO: renamed from: a.fb$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m1414a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        /* JADX INFO: renamed from: b */
        public static void m1415b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* JADX INFO: renamed from: a.fb$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static void m1416a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    /* JADX INFO: renamed from: a.fb$c */
    public static class c extends C0006A5 {

        /* JADX INFO: renamed from: m */
        public final int f2141m;

        /* JADX INFO: renamed from: n */
        public final int f2142n;

        /* JADX INFO: renamed from: o */
        public InterfaceC0519cb f2143o;

        /* JADX INFO: renamed from: p */
        public C1000h f2144p;

        public c(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f2141m = 21;
                this.f2142n = 22;
            } else {
                this.f2141m = 22;
                this.f2142n = 21;
            }
        }

        @Override // p000a.C0006A5, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            C0997e c0997e;
            int headersCount;
            int iPointToPosition;
            int i;
            if (this.f2143o != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c0997e = (C0997e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0997e = (C0997e) adapter;
                    headersCount = 0;
                }
                C1000h item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c0997e.getCount()) ? null : c0997e.getItem(i);
                C1000h c1000h = this.f2144p;
                if (c1000h != item) {
                    C0998f c0998f = c0997e.f3777a;
                    if (c1000h != null) {
                        this.f2143o.mo1282a(c0998f, c1000h);
                    }
                    this.f2144p = item;
                    if (item != null) {
                        this.f2143o.mo1283h(c0998f, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f2141m) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.f2142n) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (C0997e) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0997e) adapter).f3777a.m2318c(false);
            return true;
        }

        public void setHoverListener(InterfaceC0519cb interfaceC0519cb) {
            this.f2143o = interfaceC0519cb;
        }

        @Override // p000a.C0006A5, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2139D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p000a.InterfaceC0519cb
    /* JADX INFO: renamed from: a */
    public final void mo1282a(C0998f c0998f, C1000h c1000h) {
        ViewOnKeyListenerC0994b.c cVar = this.f2140C;
        if (cVar != null) {
            cVar.mo1282a(c0998f, c1000h);
        }
    }

    @Override // p000a.InterfaceC0519cb
    /* JADX INFO: renamed from: h */
    public final void mo1283h(C0998f c0998f, C1000h c1000h) {
        ViewOnKeyListenerC0994b.c cVar = this.f2140C;
        if (cVar != null) {
            cVar.mo1283h(c0998f, c1000h);
        }
    }

    @Override // p000a.C0102F9
    /* JADX INFO: renamed from: q */
    public final C0006A5 mo286q(Context context, boolean z) {
        c cVar = new c(context, z);
        cVar.setHoverListener(this);
        return cVar;
    }
}
