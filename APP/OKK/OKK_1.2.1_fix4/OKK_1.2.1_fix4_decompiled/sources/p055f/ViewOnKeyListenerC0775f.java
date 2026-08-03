package p055f;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.luckypray.dexkit.C1031R;
import p001A0.ViewOnAttachStateChangeListenerC0043s;
import p006D.C0095d;
import p057g.AbstractC0923q0;
import p057g.AbstractC0925r0;
import p057g.C0927s0;
import p057g.C0929t0;
import p057g.C0938y;

/* JADX INFO: renamed from: f.f */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0775f extends AbstractC0781l implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: A */
    public boolean f2752A;

    /* JADX INFO: renamed from: b */
    public final Context f2753b;

    /* JADX INFO: renamed from: c */
    public final int f2754c;

    /* JADX INFO: renamed from: d */
    public final int f2755d;

    /* JADX INFO: renamed from: e */
    public final int f2756e;

    /* JADX INFO: renamed from: f */
    public final boolean f2757f;

    /* JADX INFO: renamed from: g */
    public final Handler f2758g;

    /* JADX INFO: renamed from: o */
    public View f2766o;

    /* JADX INFO: renamed from: p */
    public View f2767p;

    /* JADX INFO: renamed from: q */
    public int f2768q;

    /* JADX INFO: renamed from: r */
    public boolean f2769r;

    /* JADX INFO: renamed from: s */
    public boolean f2770s;

    /* JADX INFO: renamed from: t */
    public int f2771t;

    /* JADX INFO: renamed from: u */
    public int f2772u;

    /* JADX INFO: renamed from: w */
    public boolean f2774w;

    /* JADX INFO: renamed from: x */
    public InterfaceC0784o f2775x;

    /* JADX INFO: renamed from: y */
    public ViewTreeObserver f2776y;

    /* JADX INFO: renamed from: z */
    public PopupWindow.OnDismissListener f2777z;

    /* JADX INFO: renamed from: h */
    public final ArrayList f2759h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final ArrayList f2760i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final ViewTreeObserverOnGlobalLayoutListenerC0772c f2761j = new ViewTreeObserverOnGlobalLayoutListenerC0772c(this, 0);

    /* JADX INFO: renamed from: k */
    public final ViewOnAttachStateChangeListenerC0043s f2762k = new ViewOnAttachStateChangeListenerC0043s(1, this);

    /* JADX INFO: renamed from: l */
    public final C0095d f2763l = new C0095d(16, this);

    /* JADX INFO: renamed from: m */
    public int f2764m = 0;

    /* JADX INFO: renamed from: n */
    public int f2765n = 0;

    /* JADX INFO: renamed from: v */
    public boolean f2773v = false;

    public ViewOnKeyListenerC0775f(Context context, View view, int i2, int i3, boolean z2) {
        this.f2753b = context;
        this.f2766o = view;
        this.f2755d = i2;
        this.f2756e = i3;
        this.f2757f = z2;
        this.f2768q = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f2754c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1031R.dimen.abc_config_prefDialogWidth));
        this.f2758g = new Handler();
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: a */
    public final void mo1976a(MenuC0779j menuC0779j, boolean z2) {
        ArrayList arrayList = this.f2760i;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (menuC0779j == ((C0774e) arrayList.get(i2)).f2750b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < arrayList.size()) {
            ((C0774e) arrayList.get(i3)).f2750b.m1997c(false);
        }
        C0774e c0774e = (C0774e) arrayList.remove(i2);
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = c0774e.f2750b.f2802r;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0785p interfaceC0785p = (InterfaceC0785p) weakReference.get();
            if (interfaceC0785p == null || interfaceC0785p == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        boolean z3 = this.f2752A;
        C0929t0 c0929t0 = c0774e.f2749a;
        if (z3) {
            AbstractC0923q0.m2252b(c0929t0.f3272v, null);
            c0929t0.f3272v.setAnimationStyle(0);
        }
        c0929t0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2768q = ((C0774e) arrayList.get(size2 - 1)).f2751c;
        } else {
            this.f2768q = this.f2766o.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0774e) arrayList.get(0)).f2750b.m1997c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0784o interfaceC0784o = this.f2775x;
        if (interfaceC0784o != null) {
            interfaceC0784o.mo339a(menuC0779j, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2776y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2776y.removeGlobalOnLayoutListener(this.f2761j);
            }
            this.f2776y = null;
        }
        this.f2767p.removeOnAttachStateChangeListener(this.f2762k);
        this.f2777z.onDismiss();
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: b */
    public final void mo1977b() {
        Iterator it = this.f2760i.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0774e) it.next()).f2749a.f3253c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0776g) adapter).notifyDataSetChanged();
        }
    }

    @Override // p055f.InterfaceC0787r
    /* JADX INFO: renamed from: d */
    public final boolean mo1978d() {
        ArrayList arrayList = this.f2760i;
        return arrayList.size() > 0 && ((C0774e) arrayList.get(0)).f2749a.f3272v.isShowing();
    }

    @Override // p055f.InterfaceC0787r
    public final void dismiss() {
        ArrayList arrayList = this.f2760i;
        int size = arrayList.size();
        if (size > 0) {
            C0774e[] c0774eArr = (C0774e[]) arrayList.toArray(new C0774e[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0774e c0774e = c0774eArr[i2];
                if (c0774e.f2749a.f3272v.isShowing()) {
                    c0774e.f2749a.dismiss();
                }
            }
        }
    }

    @Override // p055f.InterfaceC0787r
    /* JADX INFO: renamed from: e */
    public final ListView mo1979e() {
        ArrayList arrayList = this.f2760i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0774e) arrayList.get(arrayList.size() - 1)).f2749a.f3253c;
    }

    @Override // p055f.InterfaceC0787r
    /* JADX INFO: renamed from: f */
    public final void mo1980f() {
        if (mo1978d()) {
            return;
        }
        ArrayList arrayList = this.f2759h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m1992v((MenuC0779j) it.next());
        }
        arrayList.clear();
        View view = this.f2766o;
        this.f2767p = view;
        if (view != null) {
            boolean z2 = this.f2776y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2776y = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f2761j);
            }
            this.f2767p.addOnAttachStateChangeListener(this.f2762k);
        }
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: g */
    public final boolean mo1981g() {
        return false;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: j */
    public final void mo1982j(InterfaceC0784o interfaceC0784o) {
        this.f2775x = interfaceC0784o;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: k */
    public final boolean mo1983k(SubMenuC0789t subMenuC0789t) {
        for (C0774e c0774e : this.f2760i) {
            if (subMenuC0789t == c0774e.f2750b) {
                c0774e.f2749a.f3253c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0789t.hasVisibleItems()) {
            return false;
        }
        mo1984l(subMenuC0789t);
        InterfaceC0784o interfaceC0784o = this.f2775x;
        if (interfaceC0784o != null) {
            interfaceC0784o.mo345k(subMenuC0789t);
        }
        return true;
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: l */
    public final void mo1984l(MenuC0779j menuC0779j) {
        menuC0779j.m1996b(this, this.f2753b);
        if (mo1978d()) {
            m1992v(menuC0779j);
        } else {
            this.f2759h.add(menuC0779j);
        }
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: n */
    public final void mo1985n(View view) {
        if (this.f2766o != view) {
            this.f2766o = view;
            this.f2765n = Gravity.getAbsoluteGravity(this.f2764m, view.getLayoutDirection());
        }
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: o */
    public final void mo1986o(boolean z2) {
        this.f2773v = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0774e c0774e;
        ArrayList arrayList = this.f2760i;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                c0774e = null;
                break;
            }
            c0774e = (C0774e) arrayList.get(i2);
            if (!c0774e.f2749a.f3272v.isShowing()) {
                break;
            } else {
                i2++;
            }
        }
        if (c0774e != null) {
            c0774e.f2750b.m1997c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: p */
    public final void mo1987p(int i2) {
        if (this.f2764m != i2) {
            this.f2764m = i2;
            this.f2765n = Gravity.getAbsoluteGravity(i2, this.f2766o.getLayoutDirection());
        }
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: q */
    public final void mo1988q(int i2) {
        this.f2769r = true;
        this.f2771t = i2;
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: r */
    public final void mo1989r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2777z = onDismissListener;
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: s */
    public final void mo1990s(boolean z2) {
        this.f2774w = z2;
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: t */
    public final void mo1991t(int i2) {
        this.f2770s = true;
        this.f2772u = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0186  */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1992v(MenuC0779j menuC0779j) {
        C0774e c0774e;
        View childAt;
        int i2;
        MenuItem item;
        C0776g c0776g;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f2753b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C0776g c0776g2 = new C0776g(menuC0779j, layoutInflaterFrom, this.f2757f, C1031R.layout.abc_cascading_menu_item_layout);
        if (!mo1978d() && this.f2773v) {
            c0776g2.f2780c = true;
        } else if (mo1978d()) {
            c0776g2.f2780c = AbstractC0781l.m2022u(menuC0779j);
        }
        int iM2021m = AbstractC0781l.m2021m(c0776g2, context, this.f2754c);
        C0929t0 c0929t0 = new C0929t0(context, this.f2755d, this.f2756e);
        c0929t0.f3298y = this.f2763l;
        c0929t0.f3263m = this;
        c0929t0.f3272v.setOnDismissListener(this);
        c0929t0.f3262l = this.f2766o;
        c0929t0.f3260j = this.f2765n;
        c0929t0.f3271u = true;
        c0929t0.f3272v.setFocusable(true);
        c0929t0.f3272v.setInputMethodMode(2);
        c0929t0.m2249a(c0776g2);
        Drawable background = c0929t0.f3272v.getBackground();
        if (background != null) {
            Rect rect = c0929t0.f3269s;
            background.getPadding(rect);
            c0929t0.f3254d = rect.left + rect.right + iM2021m;
        } else {
            c0929t0.f3254d = iM2021m;
        }
        c0929t0.f3260j = this.f2765n;
        ArrayList arrayList = this.f2760i;
        if (arrayList.size() > 0) {
            c0774e = (C0774e) arrayList.get(arrayList.size() - 1);
            MenuC0779j menuC0779j2 = c0774e.f2750b;
            int size = menuC0779j2.f2790f.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    item = null;
                    break;
                }
                item = menuC0779j2.getItem(i3);
                if (item.hasSubMenu() && menuC0779j == item.getSubMenu()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (item != null) {
                C0927s0 c0927s0 = c0774e.f2749a.f3253c;
                ListAdapter adapter = c0927s0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c0776g = (C0776g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0776g = (C0776g) adapter;
                    headersCount = 0;
                }
                int count = c0776g.getCount();
                int i4 = 0;
                while (true) {
                    if (i4 >= count) {
                        i4 = -1;
                        break;
                    } else if (item == c0776g.getItem(i4)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                childAt = (i4 != -1 && (firstVisiblePosition = (i4 + headersCount) - c0927s0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0927s0.getChildCount()) ? c0927s0.getChildAt(firstVisiblePosition) : null;
            }
            if (childAt == null) {
                int i5 = Build.VERSION.SDK_INT;
                C0938y c0938y = c0929t0.f3272v;
                if (i5 <= 28) {
                    Method method = C0929t0.f3297z;
                    if (method != null) {
                        try {
                            method.invoke(c0938y, Boolean.FALSE);
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    AbstractC0925r0.m2258a(c0938y, false);
                }
                AbstractC0923q0.m2251a(c0929t0.f3272v, null);
                C0927s0 c0927s02 = ((C0774e) arrayList.get(arrayList.size() - 1)).f2749a.f3253c;
                int[] iArr = new int[2];
                c0927s02.getLocationOnScreen(iArr);
                Rect rect2 = new Rect();
                this.f2767p.getWindowVisibleDisplayFrame(rect2);
                if (this.f2768q == 1) {
                    i2 = (c0927s02.getWidth() + iArr[0]) + iM2021m > rect2.right ? 0 : 1;
                } else if (iArr[0] - iM2021m < 0) {
                }
                boolean z2 = i2 == 1;
                this.f2768q = i2;
                c0929t0.f3262l = childAt;
                if ((this.f2765n & 5) != 5) {
                    iM2021m = z2 ? childAt.getWidth() : 0 - iM2021m;
                } else if (!z2) {
                    iM2021m = 0 - childAt.getWidth();
                }
                c0929t0.f3255e = iM2021m;
                c0929t0.f3259i = true;
                c0929t0.f3258h = true;
                c0929t0.f3256f = 0;
                c0929t0.f3257g = true;
            } else {
                if (this.f2769r) {
                    c0929t0.f3255e = this.f2771t;
                }
                if (this.f2770s) {
                    c0929t0.f3256f = this.f2772u;
                    c0929t0.f3257g = true;
                }
                Rect rect3 = this.f2833a;
                c0929t0.f3270t = rect3 != null ? new Rect(rect3) : null;
            }
            arrayList.add(new C0774e(c0929t0, menuC0779j, this.f2768q));
            c0929t0.mo1980f();
            C0927s0 c0927s03 = c0929t0.f3253c;
            c0927s03.setOnKeyListener(this);
            if (c0774e == null || !this.f2774w || menuC0779j.f2796l == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(C1031R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0927s03, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC0779j.f2796l);
            c0927s03.addHeaderView(frameLayout, null, false);
            c0929t0.mo1980f();
            return;
        }
        c0774e = null;
        if (childAt == null) {
        }
        arrayList.add(new C0774e(c0929t0, menuC0779j, this.f2768q));
        c0929t0.mo1980f();
        C0927s0 c0927s032 = c0929t0.f3253c;
        c0927s032.setOnKeyListener(this);
        if (c0774e == null) {
        }
    }
}
