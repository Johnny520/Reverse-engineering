package Yue;

import Yue.InterfaceC7144;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C8693;
import androidx.appcompat.view.menu.C8694;
import androidx.appcompat.view.menu.C8697;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C6163 extends C5726 implements InterfaceC6157 {

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static final String f15072 = "MenuPopupWindow";

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static Method f15073;

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public InterfaceC6157 f15074;

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۦۨ$ۥ */
    @InterfaceC7113(23)
    public static class C0925 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m2666(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m2667(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۦۨ$ۥ۟ */
    @InterfaceC7113(29)
    public static class C0926 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m2668(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۦۨ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public static class C6164 extends C4546 {

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public final int f15075;

        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public final int f15076;

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public InterfaceC6157 f15077;

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public MenuItem f15078;

        public C6164(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f15075 = 21;
                this.f15076 = 22;
            } else {
                this.f15075 = 22;
                this.f15076 = 21;
            }
        }

        @Override // Yue.C4546, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // Yue.C4546, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // Yue.C4546, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // Yue.C4546, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // Yue.C4546, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            C8693 c8693;
            int headersCount;
            int iPointToPosition;
            int i;
            if (this.f15077 != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c8693 = (C8693) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c8693 = (C8693) adapter;
                    headersCount = 0;
                }
                C8697 item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c8693.getCount()) ? null : c8693.getItem(i);
                MenuItem menuItem = this.f15078;
                if (menuItem != item) {
                    C8694 c8694M4648 = c8693.m4648();
                    if (menuItem != null) {
                        this.f15077.mo19000(c8694M4648, menuItem);
                    }
                    this.f15078 = item;
                    if (item != null) {
                        this.f15077.mo18999(c8694M4648, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f15075) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.f15076) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (C8693) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C8693) adapter).m4648().close(false);
            return true;
        }

        @Override // Yue.C4546, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(InterfaceC6157 interfaceC6157) {
            this.f15077 = interfaceC6157;
        }

        @Override // Yue.C4546, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        @Override // Yue.C4546
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public /* bridge */ /* synthetic */ int mo13367(int i, boolean z) {
            return super.mo13367(i, z);
        }

        @Override // Yue.C4546
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public /* bridge */ /* synthetic */ int mo13368(int i, int i2, int i3, int i4, int i5) {
            return super.mo13368(i, i2, i3, i4, i5);
        }

        @Override // Yue.C4546
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public /* bridge */ /* synthetic */ boolean mo13369(MotionEvent motionEvent, int i) {
            return super.mo13369(motionEvent, i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public void m19029() {
            setSelection(-1);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f15073 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i(f15072, "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C6163(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // Yue.InterfaceC6157
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo18999(@InterfaceC6391 C8694 c8694, @InterfaceC6391 MenuItem menuItem) {
        InterfaceC6157 interfaceC6157 = this.f15074;
        if (interfaceC6157 != null) {
            interfaceC6157.mo18999(c8694, menuItem);
        }
    }

    @Override // Yue.InterfaceC6157
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo19000(@InterfaceC6391 C8694 c8694, @InterfaceC6391 MenuItem menuItem) {
        InterfaceC6157 interfaceC6157 = this.f15074;
        if (interfaceC6157 != null) {
            interfaceC6157.mo19000(c8694, menuItem);
        }
    }

    @Override // Yue.C5726
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public C4546 mo17746(Context context, boolean z) {
        C6164 c6164 = new C6164(context, z);
        c6164.setHoverListener(this);
        return c6164;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public void m19025(Object obj) {
        C0925.m2666(this.f14207, (Transition) obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public void m19026(Object obj) {
        C0925.m2667(this.f14207, (Transition) obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public void m19027(InterfaceC6157 interfaceC6157) {
        this.f15074 = interfaceC6157;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public void m19028(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            C0926.m2668(this.f14207, z);
            return;
        }
        Method method = f15073;
        if (method != null) {
            try {
                method.invoke(this.f14207, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i(f15072, "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }
}
