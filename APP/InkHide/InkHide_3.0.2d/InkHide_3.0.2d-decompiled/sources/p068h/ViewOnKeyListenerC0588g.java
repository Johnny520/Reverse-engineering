package p068h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
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
import androidx.fragment.app.ViewOnAttachStateChangeListenerC0414E;
import com.p055lu.wxmask272.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p004C.C0066j;
import p069i.AbstractC0623H0;
import p069i.AbstractC0625I0;
import p069i.C0610B;
import p069i.C0631L0;
import p069i.C0717t0;
import p099y.AbstractC1048L;

/* JADX INFO: renamed from: h.g */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0588g extends AbstractC0602u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: A */
    public boolean f1990A;

    /* JADX INFO: renamed from: c */
    public final Context f1991c;

    /* JADX INFO: renamed from: d */
    public final int f1992d;

    /* JADX INFO: renamed from: e */
    public final int f1993e;

    /* JADX INFO: renamed from: f */
    public final boolean f1994f;

    /* JADX INFO: renamed from: g */
    public final Handler f1995g;

    /* JADX INFO: renamed from: o */
    public View f2003o;

    /* JADX INFO: renamed from: p */
    public View f2004p;

    /* JADX INFO: renamed from: q */
    public int f2005q;

    /* JADX INFO: renamed from: r */
    public boolean f2006r;

    /* JADX INFO: renamed from: s */
    public boolean f2007s;

    /* JADX INFO: renamed from: t */
    public int f2008t;

    /* JADX INFO: renamed from: u */
    public int f2009u;

    /* JADX INFO: renamed from: w */
    public boolean f2011w;

    /* JADX INFO: renamed from: x */
    public InterfaceC0606y f2012x;

    /* JADX INFO: renamed from: y */
    public ViewTreeObserver f2013y;

    /* JADX INFO: renamed from: z */
    public C0603v f2014z;

    /* JADX INFO: renamed from: h */
    public final ArrayList f1996h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final ArrayList f1997i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final ViewTreeObserverOnGlobalLayoutListenerC0585d f1998j = new ViewTreeObserverOnGlobalLayoutListenerC0585d(0, this);

    /* JADX INFO: renamed from: k */
    public final ViewOnAttachStateChangeListenerC0414E f1999k = new ViewOnAttachStateChangeListenerC0414E(1, this);

    /* JADX INFO: renamed from: l */
    public final C0066j f2000l = new C0066j(15, this);

    /* JADX INFO: renamed from: m */
    public int f2001m = 0;

    /* JADX INFO: renamed from: n */
    public int f2002n = 0;

    /* JADX INFO: renamed from: v */
    public boolean f2010v = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnKeyListenerC0588g(Context context, View view, int i2, boolean z2) {
        this.f1991c = context;
        this.f2003o = view;
        this.f1993e = i2;
        this.f1994f = z2;
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        this.f2005q = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.f1992d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f1995g = new Handler();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0579D
    /* JADX INFO: renamed from: a */
    public final boolean mo1144a() {
        ArrayList arrayList = this.f1997i;
        return arrayList.size() > 0 && ((C0587f) arrayList.get(0)).f1987a.f2152z.isShowing();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: b */
    public final void mo1147b(MenuC0594m menuC0594m, boolean z2) {
        ArrayList arrayList = this.f1997i;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (menuC0594m == ((C0587f) arrayList.get(i2)).f1988b) {
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
            ((C0587f) arrayList.get(i3)).f1988b.m1184c(false);
        }
        C0587f c0587f = (C0587f) arrayList.remove(i2);
        c0587f.f1988b.m1191r(this);
        boolean z3 = this.f1990A;
        C0631L0 c0631l0 = c0587f.f1987a;
        if (z3) {
            AbstractC0623H0.m1231b(c0631l0.f2152z, null);
            c0631l0.f2152z.setAnimationStyle(0);
        }
        c0631l0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2005q = ((C0587f) arrayList.get(size2 - 1)).f1989c;
        } else {
            View view = this.f2003o;
            WeakHashMap weakHashMap = AbstractC1048L.f3662a;
            this.f2005q = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0587f) arrayList.get(0)).f1988b.m1184c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0606y interfaceC0606y = this.f2012x;
        if (interfaceC0606y != null) {
            interfaceC0606y.mo132b(menuC0594m, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2013y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2013y.removeGlobalOnLayoutListener(this.f1998j);
            }
            this.f2013y = null;
        }
        this.f2004p.removeOnAttachStateChangeListener(this.f1999k);
        this.f2014z.onDismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:9:0x0029 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: c */
    public final void mo1148c() {
        Iterator it = this.f1997i.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0587f) it.next()).f1987a.f2130d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0591j) adapter).notifyDataSetChanged();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0579D
    public final void dismiss() {
        ArrayList arrayList = this.f1997i;
        int size = arrayList.size();
        if (size > 0) {
            C0587f[] c0587fArr = (C0587f[]) arrayList.toArray(new C0587f[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0587f c0587f = c0587fArr[i2];
                if (c0587f.f1987a.f2152z.isShowing()) {
                    c0587f.f1987a.dismiss();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: e */
    public final void mo1149e(InterfaceC0606y interfaceC0606y) {
        this.f2012x = interfaceC0606y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0579D
    /* JADX INFO: renamed from: f */
    public final C0717t0 mo1145f() {
        ArrayList arrayList = this.f1997i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0587f) arrayList.get(arrayList.size() - 1)).f1987a.f2130d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0579D
    /* JADX INFO: renamed from: h */
    public final void mo1146h() {
        if (mo1144a()) {
            return;
        }
        ArrayList arrayList = this.f1996h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m1174v((MenuC0594m) it.next());
        }
        arrayList.clear();
        View view = this.f2003o;
        this.f2004p = view;
        if (view != null) {
            boolean z2 = this.f2013y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2013y = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1998j);
            }
            this.f2004p.addOnAttachStateChangeListener(this.f1999k);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: i */
    public final boolean mo1150i() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: j */
    public final boolean mo1151j(SubMenuC0581F subMenuC0581F) {
        for (C0587f c0587f : this.f1997i) {
            if (subMenuC0581F == c0587f.f1988b) {
                c0587f.f1987a.f2130d.requestFocus();
                return true;
            }
        }
        if (!subMenuC0581F.hasVisibleItems()) {
            return false;
        }
        mo1152l(subMenuC0581F);
        InterfaceC0606y interfaceC0606y = this.f2012x;
        if (interfaceC0606y != null) {
            interfaceC0606y.mo142m(subMenuC0581F);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.AbstractC0602u
    /* JADX INFO: renamed from: l */
    public final void mo1152l(MenuC0594m menuC0594m) {
        menuC0594m.m1183b(this, this.f1991c);
        if (mo1144a()) {
            m1174v(menuC0594m);
        } else {
            this.f1996h.add(menuC0594m);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.AbstractC0602u
    /* JADX INFO: renamed from: n */
    public final void mo1153n(View view) {
        if (this.f2003o != view) {
            this.f2003o = view;
            int i2 = this.f2001m;
            WeakHashMap weakHashMap = AbstractC1048L.f3662a;
            this.f2002n = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.AbstractC0602u
    /* JADX INFO: renamed from: o */
    public final void mo1154o(boolean z2) {
        this.f2010v = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0587f c0587f;
        ArrayList arrayList = this.f1997i;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                c0587f = null;
                break;
            }
            c0587f = (C0587f) arrayList.get(i2);
            if (!c0587f.f1987a.f2152z.isShowing()) {
                break;
            } else {
                i2++;
            }
        }
        if (c0587f != null) {
            c0587f.f1988b.m1184c(false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.AbstractC0602u
    /* JADX INFO: renamed from: p */
    public final void mo1155p(int i2) {
        if (this.f2001m != i2) {
            this.f2001m = i2;
            View view = this.f2003o;
            WeakHashMap weakHashMap = AbstractC1048L.f3662a;
            this.f2002n = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.AbstractC0602u
    /* JADX INFO: renamed from: q */
    public final void mo1156q(int i2) {
        this.f2006r = true;
        this.f2008t = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.AbstractC0602u
    /* JADX INFO: renamed from: r */
    public final void mo1157r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2014z = (C0603v) onDismissListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.AbstractC0602u
    /* JADX INFO: renamed from: s */
    public final void mo1158s(boolean z2) {
        this.f2011w = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.AbstractC0602u
    /* JADX INFO: renamed from: t */
    public final void mo1159t(int i2) {
        this.f2007s = true;
        this.f2009u = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ba  */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1174v(MenuC0594m menuC0594m) {
        int i2;
        C0587f c0587f;
        View childAt;
        int i3;
        int i4;
        int i5;
        int width;
        MenuItem item;
        C0591j c0591j;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f1991c;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C0591j c0591j2 = new C0591j(menuC0594m, layoutInflaterFrom, this.f1994f, R.layout.abc_cascading_menu_item_layout);
        if (!mo1144a() && this.f2010v) {
            c0591j2.f2025d = true;
        } else if (mo1144a()) {
            c0591j2.f2025d = AbstractC0602u.m1203u(menuC0594m);
        }
        int iM1202m = AbstractC0602u.m1202m(c0591j2, context, this.f1992d);
        C0631L0 c0631l0 = new C0631L0(context, null, this.f1993e);
        c0631l0.f2167C = this.f2000l;
        c0631l0.f2143q = this;
        c0631l0.f2152z.setOnDismissListener(this);
        c0631l0.f2142p = this.f2003o;
        c0631l0.f2139m = this.f2002n;
        c0631l0.f2151y = true;
        c0631l0.f2152z.setFocusable(true);
        c0631l0.f2152z.setInputMethodMode(2);
        c0631l0.mo1225m(c0591j2);
        c0631l0.m1227p(iM1202m);
        c0631l0.f2139m = this.f2002n;
        ArrayList arrayList = this.f1997i;
        if (arrayList.size() > 0) {
            c0587f = (C0587f) arrayList.get(arrayList.size() - 1);
            MenuC0594m menuC0594m2 = c0587f.f1988b;
            int size = menuC0594m2.f2035f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    item = null;
                    break;
                }
                item = menuC0594m2.getItem(i6);
                if (item.hasSubMenu() && menuC0594m == item.getSubMenu()) {
                    break;
                } else {
                    i6++;
                }
            }
            if (item == null) {
                i2 = 1;
                childAt = null;
            } else {
                C0717t0 c0717t0 = c0587f.f1987a.f2130d;
                ListAdapter adapter = c0717t0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c0591j = (C0591j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0591j = (C0591j) adapter;
                    headersCount = 0;
                }
                int count = c0591j.getCount();
                i2 = 1;
                int i7 = 0;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (item == c0591j.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i7 != -1 && (firstVisiblePosition = (i7 + headersCount) - c0717t0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0717t0.getChildCount()) {
                    childAt = c0717t0.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt == null) {
                int i8 = Build.VERSION.SDK_INT;
                C0610B c0610b = c0631l0.f2152z;
                if (i8 <= 28) {
                    Method method = C0631L0.f2166D;
                    if (method != null) {
                        try {
                            method.invoke(c0610b, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    AbstractC0625I0.m1232a(c0610b, false);
                }
                AbstractC0623H0.m1230a(c0631l0.f2152z, null);
                C0717t0 c0717t02 = ((C0587f) arrayList.get(arrayList.size() - 1)).f1987a.f2130d;
                int[] iArr = new int[2];
                c0717t02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f2004p.getWindowVisibleDisplayFrame(rect);
                if (this.f2005q == i2) {
                    i3 = (c0717t02.getWidth() + iArr[0]) + iM1202m > rect.right ? 0 : 1;
                } else if (iArr[0] - iM1202m < 0) {
                }
                boolean z2 = i3 == 1;
                this.f2005q = i3;
                if (Build.VERSION.SDK_INT >= 26) {
                    c0631l0.f2142p = childAt;
                    i5 = 0;
                    i4 = 0;
                } else {
                    int[] iArr2 = new int[2];
                    this.f2003o.getLocationOnScreen(iArr2);
                    int[] iArr3 = new int[2];
                    childAt.getLocationOnScreen(iArr3);
                    if ((this.f2002n & 7) == 5) {
                        iArr2[0] = this.f2003o.getWidth() + iArr2[0];
                        iArr3[0] = childAt.getWidth() + iArr3[0];
                    }
                    i4 = iArr3[0] - iArr2[0];
                    i5 = iArr3[1] - iArr2[1];
                }
                if ((this.f2002n & 5) != 5) {
                    width = z2 ? i4 + childAt.getWidth() : i4 - iM1202m;
                    c0631l0.f2133g = width;
                    c0631l0.f2138l = true;
                    c0631l0.f2137k = true;
                    c0631l0.m1223k(i5);
                } else if (z2) {
                    width = i4 + iM1202m;
                    c0631l0.f2133g = width;
                    c0631l0.f2138l = true;
                    c0631l0.f2137k = true;
                    c0631l0.m1223k(i5);
                } else {
                    iM1202m = childAt.getWidth();
                    c0631l0.f2133g = width;
                    c0631l0.f2138l = true;
                    c0631l0.f2137k = true;
                    c0631l0.m1223k(i5);
                }
            } else {
                if (this.f2006r) {
                    c0631l0.f2133g = this.f2008t;
                }
                if (this.f2007s) {
                    c0631l0.m1223k(this.f2009u);
                }
                Rect rect2 = this.f2096b;
                c0631l0.f2150x = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C0587f(c0631l0, menuC0594m, this.f2005q));
            c0631l0.mo1146h();
            C0717t0 c0717t03 = c0631l0.f2130d;
            c0717t03.setOnKeyListener(this);
            if (c0587f == null || !this.f2011w || menuC0594m.f2042m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0717t03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC0594m.f2042m);
            c0717t03.addHeaderView(frameLayout, null, false);
            c0631l0.mo1146h();
            return;
        }
        i2 = 1;
        c0587f = null;
        childAt = null;
        if (childAt == null) {
        }
        arrayList.add(new C0587f(c0631l0, menuC0594m, this.f2005q));
        c0631l0.mo1146h();
        C0717t0 c0717t032 = c0631l0.f2130d;
        c0717t032.setOnKeyListener(this);
        if (c0587f == null) {
        }
    }
}
