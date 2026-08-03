package androidx.appcompat.view.menu;

import Yue.AbstractC6162;
import Yue.C5194;
import Yue.C6163;
import Yue.C6898;
import Yue.InterfaceC3451;
import Yue.InterfaceC6157;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7651;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC8699;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟ */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC1601 extends AbstractC6162 implements InterfaceC8699, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final int f25971 = C6898.C6906.f18979;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final int f25972 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f25973 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f25974 = 200;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final Context f25975;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f25976;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int f25977;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final int f25978;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final boolean f25979;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final Handler f25980;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public View f25988;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public View f25989;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public boolean f25991;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public boolean f25992;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public int f25993;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public int f25994;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public boolean f25996;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public InterfaceC8699.InterfaceC1607 f25997;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public ViewTreeObserver f25998;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f25999;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public boolean f26000;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final List<C8694> f25981 = new ArrayList();

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final List<C8690> f25982 = new ArrayList();

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final ViewTreeObserver.OnGlobalLayoutListener f25983 = new ViewTreeObserverOnGlobalLayoutListenerC8686();

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final View.OnAttachStateChangeListener f25984 = new ViewOnAttachStateChangeListenerC8687();

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final InterfaceC6157 f25985 = new C8688();

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public int f25986 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public int f25987 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public boolean f25995 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public int f25990 = m29006();

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟$ۥ, reason: contains not printable characters */
    public class ViewTreeObserverOnGlobalLayoutListenerC8686 implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC8686() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC1601.this.mo2407() || ViewOnKeyListenerC1601.this.f25982.size() <= 0 || ViewOnKeyListenerC1601.this.f25982.get(0).f3647.m17762()) {
                return;
            }
            View view = ViewOnKeyListenerC1601.this.f25989;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC1601.this.dismiss();
                return;
            }
            Iterator<C8690> it = ViewOnKeyListenerC1601.this.f25982.iterator();
            while (it.hasNext()) {
                it.next().f3647.show();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟$ۥ۟, reason: contains not printable characters */
    public class ViewOnAttachStateChangeListenerC8687 implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC8687() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC1601.this.f25998;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC1601.this.f25998 = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC1601 viewOnKeyListenerC1601 = ViewOnKeyListenerC1601.this;
                viewOnKeyListenerC1601.f25998.removeGlobalOnLayoutListener(viewOnKeyListenerC1601.f25983);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟$ۥ۟۟, reason: contains not printable characters */
    public class C8688 implements InterfaceC6157 {

        /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟$ۥ۟۟$ۥ, reason: contains not printable characters */
        public class RunnableC8689 implements Runnable {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ C8690 f26004;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ MenuItem f26005;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ C8694 f26006;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public RunnableC8689(C8690 c8690, MenuItem menuItem, C8694 c8694) {
                this.f26004 = c8690;
                this.f26005 = menuItem;
                this.f26006 = c8694;
            }

            @Override // java.lang.Runnable
            public void run() {
                C8690 c8690 = this.f26004;
                if (c8690 != null) {
                    ViewOnKeyListenerC1601.this.f26000 = true;
                    c8690.f3648.close(false);
                    ViewOnKeyListenerC1601.this.f26000 = false;
                }
                if (this.f26005.isEnabled() && this.f26005.hasSubMenu()) {
                    this.f26006.performItemAction(this.f26005, 4);
                }
            }
        }

        public C8688() {
        }

        @Override // Yue.InterfaceC6157
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo18999(@InterfaceC6391 C8694 c8694, @InterfaceC6391 MenuItem menuItem) {
            ViewOnKeyListenerC1601.this.f25980.removeCallbacksAndMessages(null);
            int size = ViewOnKeyListenerC1601.this.f25982.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (c8694 == ViewOnKeyListenerC1601.this.f25982.get(i).f3648) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            ViewOnKeyListenerC1601.this.f25980.postAtTime(new RunnableC8689(i2 < ViewOnKeyListenerC1601.this.f25982.size() ? ViewOnKeyListenerC1601.this.f25982.get(i2) : null, menuItem, c8694), c8694, SystemClock.uptimeMillis() + 200);
        }

        @Override // Yue.InterfaceC6157
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public void mo19000(@InterfaceC6391 C8694 c8694, @InterfaceC6391 MenuItem menuItem) {
            ViewOnKeyListenerC1601.this.f25980.removeCallbacksAndMessages(c8694);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟, reason: contains not printable characters */
    public static class C8690 {

        /* JADX INFO: renamed from: ۥ */
        public final C6163 f3647;

        /* JADX INFO: renamed from: ۥ۟ */
        public final C8694 f3648;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int f26008;

        public C8690(@InterfaceC6391 C6163 c6163, @InterfaceC6391 C8694 c8694, int i) {
            this.f3647 = c6163;
            this.f3648 = c8694;
            this.f26008 = i;
        }

        /* JADX INFO: renamed from: ۥ */
        public ListView m4642() {
            return this.f3647.mo17740();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟۟, reason: contains not printable characters */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8691 {
    }

    public ViewOnKeyListenerC1601(@InterfaceC6391 Context context, @InterfaceC6391 View view, @InterfaceC3451 int i, @InterfaceC7651 int i2, boolean z) {
        this.f25975 = context;
        this.f25988 = view;
        this.f25977 = i;
        this.f25978 = i2;
        this.f25979 = z;
        Resources resources = context.getResources();
        this.f25976 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C6898.C6901.f18725));
        this.f25980 = new Handler();
    }

    @Override // Yue.InterfaceC7462
    public void dismiss() {
        int size = this.f25982.size();
        if (size > 0) {
            C8690[] c8690Arr = (C8690[]) this.f25982.toArray(new C8690[size]);
            for (int i = size - 1; i >= 0; i--) {
                C8690 c8690 = c8690Arr[i];
                if (c8690.f3647.mo2407()) {
                    c8690.f3647.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void onCloseMenu(C8694 c8694, boolean z) {
        int iM29003 = m29003(c8694);
        if (iM29003 < 0) {
            return;
        }
        int i = iM29003 + 1;
        if (i < this.f25982.size()) {
            this.f25982.get(i).f3648.close(false);
        }
        C8690 c8690Remove = this.f25982.remove(iM29003);
        c8690Remove.f3648.removeMenuPresenter(this);
        if (this.f26000) {
            c8690Remove.f3647.m19026(null);
            c8690Remove.f3647.m17770(0);
        }
        c8690Remove.f3647.dismiss();
        int size = this.f25982.size();
        if (size > 0) {
            this.f25990 = this.f25982.get(size - 1).f26008;
        } else {
            this.f25990 = m29006();
        }
        if (size != 0) {
            if (z) {
                this.f25982.get(0).f3648.close(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC8699.InterfaceC1607 interfaceC1607 = this.f25997;
        if (interfaceC1607 != null) {
            interfaceC1607.onCloseMenu(c8694, true);
        }
        ViewTreeObserver viewTreeObserver = this.f25998;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f25998.removeGlobalOnLayoutListener(this.f25983);
            }
            this.f25998 = null;
        }
        this.f25989.removeOnAttachStateChangeListener(this.f25984);
        this.f25999.onDismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C8690 c8690;
        int size = this.f25982.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c8690 = null;
                break;
            }
            c8690 = this.f25982.get(i);
            if (!c8690.f3647.mo2407()) {
                break;
            } else {
                i++;
            }
        }
        if (c8690 != null) {
            c8690.f3648.close(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public boolean onSubMenuSelected(SubMenuC8702 subMenuC8702) {
        for (C8690 c8690 : this.f25982) {
            if (subMenuC8702 == c8690.f3648) {
                c8690.m4642().requestFocus();
                return true;
            }
        }
        if (!subMenuC8702.hasVisibleItems()) {
            return false;
        }
        mo2665(subMenuC8702);
        InterfaceC8699.InterfaceC1607 interfaceC1607 = this.f25997;
        if (interfaceC1607 != null) {
            interfaceC1607.mo4617(subMenuC8702);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void setCallback(InterfaceC8699.InterfaceC1607 interfaceC1607) {
        this.f25997 = interfaceC1607;
    }

    @Override // Yue.InterfaceC7462
    public void show() {
        if (mo2407()) {
            return;
        }
        Iterator<C8694> it = this.f25981.iterator();
        while (it.hasNext()) {
            m29008(it.next());
        }
        this.f25981.clear();
        View view = this.f25988;
        this.f25989 = view;
        if (view != null) {
            boolean z = this.f25998 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f25998 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f25983);
            }
            this.f25989.addOnAttachStateChangeListener(this.f25984);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void updateMenuView(boolean z) {
        Iterator<C8690> it = this.f25982.iterator();
        while (it.hasNext()) {
            AbstractC6162.m19014(it.next().m4642().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // Yue.InterfaceC7462
    /* JADX INFO: renamed from: ۥ */
    public boolean mo2407() {
        return this.f25982.size() > 0 && this.f25982.get(0).f3647.mo2407();
    }

    @Override // Yue.AbstractC6162
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo2665(C8694 c8694) {
        c8694.addMenuPresenter(this, this.f25975);
        if (mo2407()) {
            m29008(c8694);
        } else {
            this.f25981.add(c8694);
        }
    }

    @Override // Yue.AbstractC6162
    /* JADX INFO: renamed from: ۥ۟۟ */
    public boolean mo19015() {
        return false;
    }

    @Override // Yue.AbstractC6162
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo19017(@InterfaceC6391 View view) {
        if (this.f25988 != view) {
            this.f25988 = view;
            this.f25987 = C5194.m15901(this.f25986, view.getLayoutDirection());
        }
    }

    @Override // Yue.InterfaceC7462
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public ListView mo17740() {
        if (this.f25982.isEmpty()) {
            return null;
        }
        return this.f25982.get(r0.size() - 1).m4642();
    }

    @Override // Yue.AbstractC6162
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo19019(boolean z) {
        this.f25995 = z;
    }

    @Override // Yue.AbstractC6162
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo19020(int i) {
        if (this.f25986 != i) {
            this.f25986 = i;
            this.f25987 = C5194.m15901(i, this.f25988.getLayoutDirection());
        }
    }

    @Override // Yue.AbstractC6162
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public void mo19021(int i) {
        this.f25991 = true;
        this.f25993 = i;
    }

    @Override // Yue.AbstractC6162
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo19022(PopupWindow.OnDismissListener onDismissListener) {
        this.f25999 = onDismissListener;
    }

    @Override // Yue.AbstractC6162
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public void mo19023(boolean z) {
        this.f25996 = z;
    }

    @Override // Yue.AbstractC6162
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo19024(int i) {
        this.f25992 = true;
        this.f25994 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final C6163 m29002() {
        C6163 c6163 = new C6163(this.f25975, null, this.f25977, this.f25978);
        c6163.m19027(this.f25985);
        c6163.m17782(this);
        c6163.m17781(this);
        c6163.m17769(this.f25988);
        c6163.m17773(this.f25987);
        c6163.m17780(true);
        c6163.m17777(2);
        return c6163;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final int m29003(@InterfaceC6391 C8694 c8694) {
        int size = this.f25982.size();
        for (int i = 0; i < size; i++) {
            if (c8694 == this.f25982.get(i).f3648) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final MenuItem m29004(@InterfaceC6391 C8694 c8694, @InterfaceC6391 C8694 c86942) {
        int size = c8694.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c8694.getItem(i);
            if (item.hasSubMenu() && c86942 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final View m29005(@InterfaceC6391 C8690 c8690, @InterfaceC6391 C8694 c8694) {
        C8693 c8693;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemM29004 = m29004(c8690.f3648, c8694);
        if (menuItemM29004 == null) {
            return null;
        }
        ListView listViewM4642 = c8690.m4642();
        ListAdapter adapter = listViewM4642.getAdapter();
        int i = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            c8693 = (C8693) headerViewListAdapter.getWrappedAdapter();
        } else {
            c8693 = (C8693) adapter;
            headersCount = 0;
        }
        int count = c8693.getCount();
        while (true) {
            if (i >= count) {
                i = -1;
                break;
            }
            if (menuItemM29004 == c8693.getItem(i)) {
                break;
            }
            i++;
        }
        if (i != -1 && (firstVisiblePosition = (i + headersCount) - listViewM4642.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewM4642.getChildCount()) {
            return listViewM4642.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int m29006() {
        return this.f25988.getLayoutDirection() == 1 ? 0 : 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int m29007(int i) {
        List<C8690> list = this.f25982;
        ListView listViewM4642 = list.get(list.size() - 1).m4642();
        int[] iArr = new int[2];
        listViewM4642.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f25989.getWindowVisibleDisplayFrame(rect);
        return this.f25990 == 1 ? (iArr[0] + listViewM4642.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m29008(@InterfaceC6391 C8694 c8694) {
        C8690 c8690;
        View viewM29005;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f25975);
        C8693 c8693 = new C8693(c8694, layoutInflaterFrom, this.f25979, f25971);
        if (!mo2407() && this.f25995) {
            c8693.m29015(true);
        } else if (mo2407()) {
            c8693.m29015(AbstractC6162.m19013(c8694));
        }
        int iM19012 = AbstractC6162.m19012(c8693, null, this.f25975, this.f25976);
        C6163 c6163M29002 = m29002();
        c6163M29002.mo6805(c8693);
        c6163M29002.m17771(iM19012);
        c6163M29002.m17773(this.f25987);
        if (this.f25982.size() > 0) {
            List<C8690> list = this.f25982;
            c8690 = list.get(list.size() - 1);
            viewM29005 = m29005(c8690, c8694);
        } else {
            c8690 = null;
            viewM29005 = null;
        }
        if (viewM29005 != null) {
            c6163M29002.m19028(false);
            c6163M29002.m19025(null);
            int iM29007 = m29007(iM19012);
            boolean z = iM29007 == 1;
            this.f25990 = iM29007;
            c6163M29002.m17769(viewM29005);
            if ((this.f25987 & 5) != 5) {
                iM19012 = z ? viewM29005.getWidth() : 0 - iM19012;
            } else if (!z) {
                iM19012 = 0 - viewM29005.getWidth();
            }
            c6163M29002.m17738(iM19012);
            c6163M29002.m17784(true);
            c6163M29002.m17741(0);
        } else {
            if (this.f25991) {
                c6163M29002.m17738(this.f25993);
            }
            if (this.f25992) {
                c6163M29002.m17741(this.f25994);
            }
            c6163M29002.m17774(m19016());
        }
        this.f25982.add(new C8690(c6163M29002, c8694, this.f25990));
        c6163M29002.show();
        ListView listViewMo17740 = c6163M29002.mo17740();
        listViewMo17740.setOnKeyListener(this);
        if (c8690 == null && this.f25996 && c8694.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(C6898.C6906.f18986, (ViewGroup) listViewMo17740, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(c8694.getHeaderTitle());
            listViewMo17740.addHeaderView(frameLayout, null, false);
            c6163M29002.show();
        }
    }
}
