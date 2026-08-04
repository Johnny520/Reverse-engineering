package yyds;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᲁᲈᲇᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC2374 extends AbstractC2356 implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final Handler f11689;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f11691;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int f11693;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public boolean f11694;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public boolean f11695;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public int f11697;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public ViewTreeObserver f11698;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public View f11700;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final boolean f11701;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public int f11702;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public int f11703;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public boolean f11706;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public boolean f11708;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public View f11709;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final int f11710;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Context f11711;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public InterfaceC2407 f11712;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final ArrayList f11692 = new ArrayList();

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final ArrayList f11707 = new ArrayList();

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC0562 f11704 = new ViewTreeObserverOnGlobalLayoutListenerC0562(2, this);

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC0075 f11705 = new ViewOnAttachStateChangeListenerC0075(0, this);

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final C0052 f11690 = new C0052(7, this);

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public int f11688 = 0;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public int f11696 = 0;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public boolean f11699 = false;

    public ViewOnKeyListenerC2374(Context context, View view, int i, boolean z) {
        this.f11711 = context;
        this.f11709 = view;
        this.f11710 = i;
        this.f11701 = z;
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        this.f11697 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f11693 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f11689 = new Handler();
    }

    @Override // yyds.InterfaceC0911
    public final void dismiss() {
        ArrayList arrayList = this.f11707;
        int size = arrayList.size();
        if (size > 0) {
            C0597[] c0597Arr = (C0597[]) arrayList.toArray(new C0597[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0597 c0597 = c0597Arr[i];
                if (c0597.f2821.f11541.isShowing()) {
                    c0597.f2821.dismiss();
                }
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0597 c0597;
        ArrayList arrayList = this.f11707;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0597 = null;
                break;
            }
            c0597 = (C0597) arrayList.get(i);
            if (!c0597.f2821.f11541.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0597 != null) {
            c0597.f2822.m1914(false);
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
        if (mo1515()) {
            return;
        }
        ArrayList arrayList = this.f11692;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m4414((MenuC0836) it.next());
        }
        arrayList.clear();
        View view = this.f11709;
        this.f11700 = view;
        if (view != null) {
            boolean z = this.f11698 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f11698 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f11704);
            }
            this.f11700.addOnAttachStateChangeListener(this.f11705);
        }
    }

    @Override // yyds.AbstractC2356
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final void mo1513(boolean z) {
        this.f11699 = z;
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final boolean mo1501() {
        return false;
    }

    @Override // yyds.AbstractC2356
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final void mo1514(View view) {
        if (this.f11709 != view) {
            this.f11709 = view;
            int i = this.f11688;
            WeakHashMap weakHashMap = AbstractC1640.f8352;
            this.f11696 = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo1503() {
        Iterator it = this.f11707.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0597) it.next()).f2821.f11543.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C2309) adapter).notifyDataSetChanged();
        }
    }

    @Override // yyds.InterfaceC0911
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final boolean mo1515() {
        ArrayList arrayList = this.f11707;
        return arrayList.size() > 0 && ((C0597) arrayList.get(0)).f2821.f11541.isShowing();
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0170  */
    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4414(MenuC0836 menuC0836) {
        boolean z;
        int i;
        View childAt;
        C0597 c0597;
        int i2;
        int i3;
        MenuItem item;
        C2309 c2309;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f11711;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C2309 c23092 = new C2309(menuC0836, layoutInflaterFrom, this.f11701, R.layout.abc_cascading_menu_item_layout);
        int i4 = 1;
        if (!mo1515() && this.f11699) {
            c23092.f11314 = true;
        } else if (mo1515()) {
            int size = menuC0836.f3823.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = menuC0836.getItem(i5);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i5++;
            }
            c23092.f11314 = z;
        }
        int iM4379 = AbstractC2356.m4379(c23092, context, this.f11693);
        C2795 c2795 = new C2795(context, null, this.f11710);
        c2795.f13659 = this.f11690;
        c2795.f11547 = this;
        C1000 c1000 = c2795.f11541;
        c1000.setOnDismissListener(this);
        c2795.f11550 = this.f11709;
        c2795.f11538 = this.f11696;
        c2795.f11548 = true;
        c1000.setFocusable(true);
        c1000.setInputMethodMode(2);
        c2795.mo2569(c23092);
        c2795.m4375(iM4379);
        c2795.f11538 = this.f11696;
        ArrayList arrayList = this.f11707;
        if (arrayList.size() > 0) {
            c0597 = (C0597) arrayList.get(arrayList.size() - 1);
            MenuC0836 menuC08362 = c0597.f2822;
            int size2 = menuC08362.f3823.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    i = i4;
                    item = null;
                    break;
                }
                item = menuC08362.getItem(i6);
                if (item.hasSubMenu()) {
                    i = i4;
                    if (menuC0836 == item.getSubMenu()) {
                        break;
                    }
                } else {
                    i = i4;
                }
                i6++;
                i4 = i;
            }
            if (item == null) {
                childAt = null;
            } else {
                C2045 c2045 = c0597.f2821.f11543;
                ListAdapter adapter = c2045.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c2309 = (C2309) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c2309 = (C2309) adapter;
                    headersCount = 0;
                }
                int count = c2309.getCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (item == c2309.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                childAt = (i7 != -1 && (firstVisiblePosition = (i7 + headersCount) - c2045.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c2045.getChildCount()) ? c2045.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            i = 1;
            childAt = null;
            c0597 = null;
        }
        if (childAt != null) {
            AbstractC0898.m2007(c1000, false);
            AbstractC2510.m4554(c1000, null);
            C2045 c20452 = ((C0597) arrayList.get(arrayList.size() - 1)).f2821.f11543;
            int[] iArr = new int[2];
            c20452.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f11700.getWindowVisibleDisplayFrame(rect);
            if (this.f11697 == i) {
                i2 = (c20452.getWidth() + iArr[0]) + iM4379 > rect.right ? 0 : 1;
                boolean z2 = i2 != 1;
                this.f11697 = i2;
                c2795.f11550 = childAt;
                if ((this.f11696 & 5) == 5) {
                    i3 = 0;
                    iM4379 = z2 ? childAt.getWidth() : 0 - iM4379;
                } else if (z2) {
                    i3 = 0;
                } else {
                    i3 = 0;
                    iM4379 = 0 - childAt.getWidth();
                }
                c2795.f11539 = iM4379;
                c2795.f11540 = true;
                c2795.f11555 = true;
                c2795.m4368(i3);
            } else {
                if (iArr[0] - iM4379 >= 0) {
                    i2 = 0;
                }
                if (i2 != 1) {
                }
                this.f11697 = i2;
                c2795.f11550 = childAt;
                if ((this.f11696 & 5) == 5) {
                }
                c2795.f11539 = iM4379;
                c2795.f11540 = true;
                c2795.f11555 = true;
                c2795.m4368(i3);
            }
        } else {
            if (this.f11708) {
                c2795.f11539 = this.f11703;
            }
            if (this.f11695) {
                c2795.m4368(this.f11702);
            }
            Rect rect2 = this.f11576;
            c2795.f11562 = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new C0597(c2795, menuC0836, this.f11697));
        c2795.show();
        C2045 c20453 = c2795.f11543;
        c20453.setOnKeyListener(this);
        if (c0597 == null && this.f11694 && menuC0836.f3829 != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c20453, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC0836.f3829);
            c20453.addHeaderView(frameLayout, null, false);
            c2795.show();
        }
    }

    @Override // yyds.AbstractC2356
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public final void mo1516(int i) {
        if (this.f11688 != i) {
            this.f11688 = i;
            View view = this.f11709;
            WeakHashMap weakHashMap = AbstractC1640.f8352;
            this.f11696 = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // yyds.AbstractC2356
    /* JADX INFO: renamed from: ᛵᛶᛲᲀ */
    public final void mo1517(boolean z) {
        this.f11694 = z;
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1504(MenuC0836 menuC0836, boolean z) {
        ArrayList arrayList = this.f11707;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0836 == ((C0597) arrayList.get(i)).f2822) {
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
            ((C0597) arrayList.get(i2)).f2822.m1914(false);
        }
        C0597 c0597 = (C0597) arrayList.remove(i);
        MenuC0836 menuC08362 = c0597.f2822;
        C2795 c2795 = c0597.f2821;
        C1000 c1000 = c2795.f11541;
        menuC08362.m1903(this);
        if (this.f11706) {
            AbstractC2510.m4555(c1000, null);
            c1000.setAnimationStyle(0);
        }
        c2795.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f11697 = ((C0597) arrayList.get(size2 - 1)).f2823;
        } else {
            View view = this.f11709;
            WeakHashMap weakHashMap = AbstractC1640.f8352;
            this.f11697 = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C0597) arrayList.get(0)).f2822.m1914(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC2407 interfaceC2407 = this.f11712;
        if (interfaceC2407 != null) {
            interfaceC2407.mo391(menuC0836, true);
        }
        ViewTreeObserver viewTreeObserver = this.f11698;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f11698.removeGlobalOnLayoutListener(this.f11704);
            }
            this.f11698 = null;
        }
        this.f11700.removeOnAttachStateChangeListener(this.f11705);
        this.f11691.onDismiss();
    }

    @Override // yyds.AbstractC2356
    /* JADX INFO: renamed from: ᛶᛳᛶᛵ */
    public final void mo1518(PopupWindow.OnDismissListener onDismissListener) {
        this.f11691 = onDismissListener;
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final boolean mo1505(SubMenuC1011 subMenuC1011) {
        for (C0597 c0597 : this.f11707) {
            if (subMenuC1011 == c0597.f2822) {
                c0597.f2821.f11543.requestFocus();
                return true;
            }
        }
        if (!subMenuC1011.hasVisibleItems()) {
            return false;
        }
        mo1519(subMenuC1011);
        InterfaceC2407 interfaceC2407 = this.f11712;
        if (interfaceC2407 != null) {
            interfaceC2407.mo404(subMenuC1011);
        }
        return true;
    }

    @Override // yyds.AbstractC2356
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public final void mo1519(MenuC0836 menuC0836) {
        menuC0836.m1904(this, this.f11711);
        if (mo1515()) {
            m4414(menuC0836);
        } else {
            this.f11692.add(menuC0836);
        }
    }

    @Override // yyds.AbstractC2356
    /* JADX INFO: renamed from: ᲀᛲᛲᲇ */
    public final void mo1520(int i) {
        this.f11695 = true;
        this.f11702 = i;
    }

    @Override // yyds.AbstractC2356
    /* JADX INFO: renamed from: ᲇᛱᛲ */
    public final void mo1521(int i) {
        this.f11708 = true;
        this.f11703 = i;
    }

    @Override // yyds.InterfaceC0911
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final C2045 mo1522() {
        ArrayList arrayList = this.f11707;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0597) arrayList.get(arrayList.size() - 1)).f2821.f11543;
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo1508(InterfaceC2407 interfaceC2407) {
        this.f11712 = interfaceC2407;
    }
}
