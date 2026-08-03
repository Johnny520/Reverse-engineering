package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
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
import androidx.appcompat.C0983R;
import androidx.appcompat.view.menu.C1001i;
import androidx.appcompat.view.menu.InterfaceC1002j;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.AbstractC0557eb;
import p000a.C0006A5;
import p000a.C0576fb;
import p000a.C0585g1;
import p000a.InterfaceC0519cb;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.b */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0994b extends AbstractC0557eb implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: A */
    public static final int f3732A = C0983R.layout.abc_cascading_menu_item_layout;

    /* JADX INFO: renamed from: b */
    public final Context f3733b;

    /* JADX INFO: renamed from: c */
    public final int f3734c;

    /* JADX INFO: renamed from: d */
    public final int f3735d;

    /* JADX INFO: renamed from: e */
    public final boolean f3736e;

    /* JADX INFO: renamed from: f */
    public final Handler f3737f;

    /* JADX INFO: renamed from: n */
    public View f3745n;

    /* JADX INFO: renamed from: o */
    public View f3746o;

    /* JADX INFO: renamed from: p */
    public int f3747p;

    /* JADX INFO: renamed from: q */
    public boolean f3748q;

    /* JADX INFO: renamed from: r */
    public boolean f3749r;

    /* JADX INFO: renamed from: s */
    public int f3750s;

    /* JADX INFO: renamed from: t */
    public int f3751t;

    /* JADX INFO: renamed from: v */
    public boolean f3753v;

    /* JADX INFO: renamed from: w */
    public InterfaceC1002j.a f3754w;

    /* JADX INFO: renamed from: x */
    public ViewTreeObserver f3755x;

    /* JADX INFO: renamed from: y */
    public C1001i.a f3756y;

    /* JADX INFO: renamed from: z */
    public boolean f3757z;

    /* JADX INFO: renamed from: g */
    public final ArrayList f3738g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final ArrayList f3739h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final a f3740i = new a();

    /* JADX INFO: renamed from: j */
    public final b f3741j = new b();

    /* JADX INFO: renamed from: k */
    public final c f3742k = new c();

    /* JADX INFO: renamed from: l */
    public int f3743l = 0;

    /* JADX INFO: renamed from: m */
    public int f3744m = 0;

    /* JADX INFO: renamed from: u */
    public boolean f3752u = false;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewOnKeyListenerC0994b viewOnKeyListenerC0994b = ViewOnKeyListenerC0994b.this;
            if (viewOnKeyListenerC0994b.mo276b()) {
                ArrayList arrayList = viewOnKeyListenerC0994b.f3739h;
                if (arrayList.size() <= 0 || ((d) arrayList.get(0)).f3761a.f352y) {
                    return;
                }
                View view = viewOnKeyListenerC0994b.f3746o;
                if (view == null || !view.isShown()) {
                    viewOnKeyListenerC0994b.dismiss();
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f3761a.mo279f();
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewOnKeyListenerC0994b viewOnKeyListenerC0994b = ViewOnKeyListenerC0994b.this;
            ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0994b.f3755x;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    viewOnKeyListenerC0994b.f3755x = view.getViewTreeObserver();
                }
                viewOnKeyListenerC0994b.f3755x.removeGlobalOnLayoutListener(viewOnKeyListenerC0994b.f3740i);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$c */
    public class c implements InterfaceC0519cb {
        public c() {
        }

        @Override // p000a.InterfaceC0519cb
        /* JADX INFO: renamed from: a */
        public final void mo1282a(C0998f c0998f, C1000h c1000h) {
            ViewOnKeyListenerC0994b.this.f3737f.removeCallbacksAndMessages(c0998f);
        }

        @Override // p000a.InterfaceC0519cb
        /* JADX INFO: renamed from: h */
        public final void mo1283h(C0998f c0998f, C1000h c1000h) {
            ViewOnKeyListenerC0994b viewOnKeyListenerC0994b = ViewOnKeyListenerC0994b.this;
            viewOnKeyListenerC0994b.f3737f.removeCallbacksAndMessages(null);
            ArrayList arrayList = viewOnKeyListenerC0994b.f3739h;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (c0998f == ((d) arrayList.get(i)).f3762b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            viewOnKeyListenerC0994b.f3737f.postAtTime(new RunnableC0995c(this, i2 < arrayList.size() ? (d) arrayList.get(i2) : null, c1000h, c0998f), c0998f, SystemClock.uptimeMillis() + 200);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final C0576fb f3761a;

        /* JADX INFO: renamed from: b */
        public final C0998f f3762b;

        /* JADX INFO: renamed from: c */
        public final int f3763c;

        public d(C0576fb c0576fb, C0998f c0998f, int i) {
            this.f3761a = c0576fb;
            this.f3762b = c0998f;
            this.f3763c = i;
        }
    }

    public ViewOnKeyListenerC0994b(Context context, View view, int i, boolean z) {
        this.f3733b = context;
        this.f3745n = view;
        this.f3735d = i;
        this.f3736e = z;
        this.f3747p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f3734c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0983R.dimen.abc_config_prefDialogWidth));
        this.f3737f = new Handler();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: a */
    public final void mo2306a(C0998f c0998f, boolean z) {
        ArrayList arrayList = this.f3739h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (c0998f == ((d) arrayList.get(i)).f3762b) {
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
            ((d) arrayList.get(i2)).f3762b.m2318c(false);
        }
        d dVar = (d) arrayList.remove(i);
        dVar.f3762b.m2333r(this);
        boolean z2 = this.f3757z;
        C0576fb c0576fb = dVar.f3761a;
        if (z2) {
            C0576fb.a.m1415b(c0576fb.f353z, null);
            c0576fb.f353z.setAnimationStyle(0);
        }
        c0576fb.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f3747p = ((d) arrayList.get(size2 - 1)).f3763c;
        } else {
            this.f3747p = this.f3745n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((d) arrayList.get(0)).f3762b.m2318c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC1002j.a aVar = this.f3754w;
        if (aVar != null) {
            aVar.mo818a(c0998f, true);
        }
        ViewTreeObserver viewTreeObserver = this.f3755x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f3755x.removeGlobalOnLayoutListener(this.f3740i);
            }
            this.f3755x = null;
        }
        this.f3746o.removeOnAttachStateChangeListener(this.f3741j);
        this.f3756y.onDismiss();
    }

    @Override // p000a.InterfaceC0541de
    /* JADX INFO: renamed from: b */
    public final boolean mo276b() {
        ArrayList arrayList = this.f3739h;
        return arrayList.size() > 0 && ((d) arrayList.get(0)).f3761a.f353z.isShowing();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: d */
    public final boolean mo2307d() {
        return false;
    }

    @Override // p000a.InterfaceC0541de
    public final void dismiss() {
        ArrayList arrayList = this.f3739h;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.f3761a.f353z.isShowing()) {
                    dVar.f3761a.dismiss();
                }
            }
        }
    }

    @Override // p000a.InterfaceC0541de
    /* JADX INFO: renamed from: f */
    public final void mo279f() {
        if (mo276b()) {
            return;
        }
        ArrayList arrayList = this.f3738g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m2311v((C0998f) it.next());
        }
        arrayList.clear();
        View view = this.f3745n;
        this.f3746o = view;
        if (view != null) {
            boolean z = this.f3755x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f3755x = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f3740i);
            }
            this.f3746o.addOnAttachStateChangeListener(this.f3741j);
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:9:0x0029 */
    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: g */
    public final void mo2308g() {
        Iterator it = this.f3739h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).f3761a.f330c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0997e) adapter).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: h */
    public final void mo2309h(InterfaceC1002j.a aVar) {
        this.f3754w = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: j */
    public final boolean mo2310j(SubMenuC1005m subMenuC1005m) {
        for (d dVar : this.f3739h) {
            if (subMenuC1005m == dVar.f3762b) {
                dVar.f3761a.f330c.requestFocus();
                return true;
            }
        }
        if (!subMenuC1005m.hasVisibleItems()) {
            return false;
        }
        mo1399l(subMenuC1005m);
        InterfaceC1002j.a aVar = this.f3754w;
        if (aVar != null) {
            aVar.mo819b(subMenuC1005m);
        }
        return true;
    }

    @Override // p000a.InterfaceC0541de
    /* JADX INFO: renamed from: k */
    public final C0006A5 mo282k() {
        ArrayList arrayList = this.f3739h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) arrayList.get(arrayList.size() - 1)).f3761a.f330c;
    }

    @Override // p000a.AbstractC0557eb
    /* JADX INFO: renamed from: l */
    public final void mo1399l(C0998f c0998f) {
        c0998f.m2317b(this, this.f3733b);
        if (mo276b()) {
            m2311v(c0998f);
        } else {
            this.f3738g.add(c0998f);
        }
    }

    @Override // p000a.AbstractC0557eb
    /* JADX INFO: renamed from: n */
    public final void mo1400n(View view) {
        if (this.f3745n != view) {
            this.f3745n = view;
            this.f3744m = Gravity.getAbsoluteGravity(this.f3743l, view.getLayoutDirection());
        }
    }

    @Override // p000a.AbstractC0557eb
    /* JADX INFO: renamed from: o */
    public final void mo1401o(boolean z) {
        this.f3752u = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.f3739h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i);
            if (!dVar.f3761a.f353z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (dVar != null) {
            dVar.f3762b.m2318c(false);
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

    @Override // p000a.AbstractC0557eb
    /* JADX INFO: renamed from: p */
    public final void mo1402p(int i) {
        if (this.f3743l != i) {
            this.f3743l = i;
            this.f3744m = Gravity.getAbsoluteGravity(i, this.f3745n.getLayoutDirection());
        }
    }

    @Override // p000a.AbstractC0557eb
    /* JADX INFO: renamed from: q */
    public final void mo1403q(int i) {
        this.f3748q = true;
        this.f3750s = i;
    }

    @Override // p000a.AbstractC0557eb
    /* JADX INFO: renamed from: r */
    public final void mo1404r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3756y = (C1001i.a) onDismissListener;
    }

    @Override // p000a.AbstractC0557eb
    /* JADX INFO: renamed from: s */
    public final void mo1405s(boolean z) {
        this.f3753v = z;
    }

    @Override // p000a.AbstractC0557eb
    /* JADX INFO: renamed from: t */
    public final void mo1406t(int i) {
        this.f3749r = true;
        this.f3751t = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0180  */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2311v(C0998f c0998f) {
        int i;
        d dVar;
        View childAt;
        int i2;
        int i3;
        MenuItem item;
        C0997e c0997e;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f3733b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C0997e c0997e2 = new C0997e(c0998f, layoutInflaterFrom, this.f3736e, f3732A);
        if (!mo276b() && this.f3752u) {
            c0997e2.f3779c = true;
        } else if (mo276b()) {
            c0997e2.f3779c = AbstractC0557eb.m1395u(c0998f);
        }
        int iM1394m = AbstractC0557eb.m1394m(c0997e2, context, this.f3734c);
        C0576fb c0576fb = new C0576fb(context, null, this.f3735d);
        c0576fb.f2140C = this.f3742k;
        c0576fb.f343p = this;
        c0576fb.f353z.setOnDismissListener(this);
        c0576fb.f342o = this.f3745n;
        c0576fb.f339l = this.f3744m;
        c0576fb.f352y = true;
        c0576fb.f353z.setFocusable(true);
        c0576fb.f353z.setInputMethodMode(2);
        c0576fb.mo285o(c0997e2);
        c0576fb.m287r(iM1394m);
        c0576fb.f339l = this.f3744m;
        ArrayList arrayList = this.f3739h;
        if (arrayList.size() > 0) {
            dVar = (d) arrayList.get(arrayList.size() - 1);
            C0998f c0998f2 = dVar.f3762b;
            int size = c0998f2.f3789f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    item = null;
                    break;
                }
                item = c0998f2.getItem(i4);
                if (item.hasSubMenu() && c0998f == item.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (item == null) {
                i = 1;
                childAt = null;
            } else {
                C0006A5 c0006a5 = dVar.f3761a.f330c;
                ListAdapter adapter = c0006a5.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c0997e = (C0997e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0997e = (C0997e) adapter;
                    headersCount = 0;
                }
                int count = c0997e.getCount();
                i = 1;
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (item == c0997e.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 != -1 && (firstVisiblePosition = (i5 + headersCount) - c0006a5.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0006a5.getChildCount()) {
                    childAt = c0006a5.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt == null) {
                int i6 = Build.VERSION.SDK_INT;
                C0585g1 c0585g1 = c0576fb.f353z;
                if (i6 <= 28) {
                    Method method = C0576fb.f2139D;
                    if (method != null) {
                        try {
                            method.invoke(c0585g1, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    C0576fb.b.m1416a(c0585g1, false);
                }
                C0576fb.a.m1414a(c0576fb.f353z, null);
                C0006A5 c0006a52 = ((d) arrayList.get(arrayList.size() - 1)).f3761a.f330c;
                int[] iArr = new int[2];
                c0006a52.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f3746o.getWindowVisibleDisplayFrame(rect);
                if (this.f3747p == i) {
                    if (c0006a52.getWidth() + iArr[0] + iM1394m > rect.right) {
                        i3 = 0;
                        i2 = 1;
                    } else {
                        i2 = 1;
                        i3 = 1;
                    }
                } else if (iArr[0] - iM1394m < 0) {
                }
                boolean z = i3 == i2;
                this.f3747p = i3;
                c0576fb.f342o = childAt;
                if ((this.f3744m & 5) != 5) {
                    iM1394m = z ? childAt.getWidth() : 0 - iM1394m;
                } else if (!z) {
                    iM1394m = 0 - childAt.getWidth();
                }
                c0576fb.f333f = iM1394m;
                c0576fb.f338k = true;
                c0576fb.f337j = true;
                c0576fb.m284n(0);
            } else {
                if (this.f3748q) {
                    c0576fb.f333f = this.f3750s;
                }
                if (this.f3749r) {
                    c0576fb.m284n(this.f3751t);
                }
                Rect rect2 = this.f2101a;
                c0576fb.f351x = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new d(c0576fb, c0998f, this.f3747p));
            c0576fb.mo279f();
            C0006A5 c0006a53 = c0576fb.f330c;
            c0006a53.setOnKeyListener(this);
            if (dVar == null || !this.f3753v || c0998f.f3796m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(C0983R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0006a53, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(c0998f.f3796m);
            c0006a53.addHeaderView(frameLayout, null, false);
            c0576fb.mo279f();
            return;
        }
        i = 1;
        dVar = null;
        childAt = null;
        if (childAt == null) {
        }
        arrayList.add(new d(c0576fb, c0998f, this.f3747p));
        c0576fb.mo279f();
        C0006A5 c0006a532 = c0576fb.f330c;
        c0006a532.setOnKeyListener(this);
        if (dVar == null) {
        }
    }
}
