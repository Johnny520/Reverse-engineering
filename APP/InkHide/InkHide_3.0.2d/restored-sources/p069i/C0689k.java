package p069i;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.p055lu.wxmask272.R;
import java.util.ArrayList;
import p004C.C0066j;
import p068h.AbstractC0602u;
import p068h.ActionProviderVisibilityListenerC0597p;
import p068h.C0596o;
import p068h.InterfaceC0576A;
import p068h.InterfaceC0577B;
import p068h.InterfaceC0606y;
import p068h.InterfaceC0607z;
import p068h.MenuC0594m;
import p068h.SubMenuC0581F;

/* JADX INFO: renamed from: i.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0689k implements InterfaceC0607z {

    /* JADX INFO: renamed from: b */
    public final Context f2302b;

    /* JADX INFO: renamed from: c */
    public Context f2303c;

    /* JADX INFO: renamed from: d */
    public MenuC0594m f2304d;

    /* JADX INFO: renamed from: e */
    public final LayoutInflater f2305e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0606y f2306f;

    /* JADX INFO: renamed from: i */
    public InterfaceC0577B f2309i;

    /* JADX INFO: renamed from: j */
    public C0686j f2310j;

    /* JADX INFO: renamed from: k */
    public Drawable f2311k;

    /* JADX INFO: renamed from: l */
    public boolean f2312l;

    /* JADX INFO: renamed from: m */
    public boolean f2313m;

    /* JADX INFO: renamed from: n */
    public boolean f2314n;

    /* JADX INFO: renamed from: o */
    public int f2315o;

    /* JADX INFO: renamed from: p */
    public int f2316p;

    /* JADX INFO: renamed from: q */
    public int f2317q;

    /* JADX INFO: renamed from: r */
    public boolean f2318r;

    /* JADX INFO: renamed from: t */
    public C0677g f2320t;

    /* JADX INFO: renamed from: u */
    public C0677g f2321u;

    /* JADX INFO: renamed from: v */
    public RunnableC0683i f2322v;

    /* JADX INFO: renamed from: w */
    public C0680h f2323w;

    /* JADX INFO: renamed from: g */
    public final int f2307g = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: h */
    public final int f2308h = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: s */
    public final SparseBooleanArray f2319s = new SparseBooleanArray();

    /* JADX INFO: renamed from: x */
    public final C0066j f2324x = new C0066j(17, this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0689k(Context context) {
        this.f2302b = context;
        this.f2305e = LayoutInflater.from(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final View m1308a(C0596o c0596o, View view, ViewGroup viewGroup) {
        View actionView = c0596o.getActionView();
        if (actionView == null || c0596o.m1199e()) {
            InterfaceC0576A interfaceC0576A = view instanceof InterfaceC0576A ? (InterfaceC0576A) view : (InterfaceC0576A) this.f2305e.inflate(this.f2308h, viewGroup, false);
            interfaceC0576A.mo645c(c0596o);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC0576A;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f2309i);
            if (this.f2323w == null) {
                this.f2323w = new C0680h(this);
            }
            actionMenuItemView.setPopupCallback(this.f2323w);
            actionView = (View) interfaceC0576A;
        }
        actionView.setVisibility(c0596o.f2059C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0695m)) {
            actionView.setLayoutParams(ActionMenuView.m672l(layoutParams));
        }
        return actionView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: b */
    public final void mo1147b(MenuC0594m menuC0594m, boolean z2) {
        m1309f();
        C0677g c0677g = this.f2321u;
        if (c0677g != null && c0677g.m1206b()) {
            c0677g.f2106i.dismiss();
        }
        InterfaceC0606y interfaceC0606y = this.f2306f;
        if (interfaceC0606y != null) {
            interfaceC0606y.mo132b(menuC0594m, z2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: c */
    public final void mo1148c() {
        int i2;
        ViewGroup viewGroup = (ViewGroup) this.f2309i;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            MenuC0594m menuC0594m = this.f2304d;
            if (menuC0594m != null) {
                menuC0594m.m1187i();
                ArrayList arrayListM1188l = this.f2304d.m1188l();
                int size = arrayListM1188l.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0596o c0596o = (C0596o) arrayListM1188l.get(i3);
                    if ((c0596o.f2083x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i2);
                        C0596o itemData = childAt instanceof InterfaceC0576A ? ((InterfaceC0576A) childAt).getItemData() : null;
                        View viewM1308a = m1308a(c0596o, childAt, viewGroup);
                        if (c0596o != itemData) {
                            viewM1308a.setPressed(false);
                            viewM1308a.jumpDrawablesToCurrentState();
                        }
                        if (viewM1308a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM1308a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM1308a);
                            }
                            ((ViewGroup) this.f2309i).addView(viewM1308a, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) == this.f2310j) {
                    i2++;
                } else {
                    viewGroup.removeViewAt(i2);
                }
            }
        }
        ((View) this.f2309i).requestLayout();
        MenuC0594m menuC0594m2 = this.f2304d;
        if (menuC0594m2 != null) {
            menuC0594m2.m1187i();
            ArrayList arrayList2 = menuC0594m2.f2038i;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ActionProviderVisibilityListenerC0597p actionProviderVisibilityListenerC0597p = ((C0596o) arrayList2.get(i4)).f2057A;
            }
        }
        MenuC0594m menuC0594m3 = this.f2304d;
        if (menuC0594m3 != null) {
            menuC0594m3.m1187i();
            arrayList = menuC0594m3.f2039j;
        }
        if (this.f2313m && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C0596o) arrayList.get(0)).f2059C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f2310j == null) {
                this.f2310j = new C0686j(this, this.f2302b);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f2310j.getParent();
            if (viewGroup3 != this.f2309i) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f2310j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2309i;
                C0686j c0686j = this.f2310j;
                actionMenuView.getClass();
                C0695m c0695mM671k = ActionMenuView.m671k();
                c0695mM671k.f2345a = true;
                actionMenuView.addView(c0686j, c0695mM671k);
            }
        } else {
            C0686j c0686j2 = this.f2310j;
            if (c0686j2 != null) {
                Object parent = c0686j2.getParent();
                Object obj = this.f2309i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f2310j);
                }
            }
        }
        ((ActionMenuView) this.f2309i).setOverflowReserved(this.f2313m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: d */
    public final boolean mo1177d(C0596o c0596o) {
        return false;
    }

    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: e */
    public final void mo1149e(InterfaceC0606y interfaceC0606y) {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m1309f() {
        Object obj;
        RunnableC0683i runnableC0683i = this.f2322v;
        if (runnableC0683i != null && (obj = this.f2309i) != null) {
            ((View) obj).removeCallbacks(runnableC0683i);
            this.f2322v = null;
            return true;
        }
        C0677g c0677g = this.f2320t;
        if (c0677g == null) {
            return false;
        }
        if (c0677g.m1206b()) {
            c0677g.f2106i.dismiss();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: g */
    public final void mo1178g(Context context, MenuC0594m menuC0594m) {
        this.f2303c = context;
        LayoutInflater.from(context);
        this.f2304d = menuC0594m;
        Resources resources = context.getResources();
        if (!this.f2314n) {
            this.f2313m = true;
        }
        int i2 = 2;
        this.f2315o = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i4 > 720) || (i3 > 720 && i4 > 960))) {
            i2 = 5;
        } else if (i3 >= 500 || ((i3 > 640 && i4 > 480) || (i3 > 480 && i4 > 640))) {
            i2 = 4;
        } else if (i3 >= 360) {
            i2 = 3;
        }
        this.f2317q = i2;
        int measuredWidth = this.f2315o;
        if (this.f2313m) {
            if (this.f2310j == null) {
                C0686j c0686j = new C0686j(this, this.f2302b);
                this.f2310j = c0686j;
                if (this.f2312l) {
                    c0686j.setImageDrawable(this.f2311k);
                    this.f2311k = null;
                    this.f2312l = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2310j.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f2310j.getMeasuredWidth();
        } else {
            this.f2310j = null;
        }
        this.f2316p = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m1310h() {
        C0677g c0677g = this.f2320t;
        return c0677g != null && c0677g.m1206b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: i */
    public final boolean mo1150i() {
        int size;
        ArrayList arrayListM1188l;
        int i2;
        boolean z2;
        C0689k c0689k = this;
        MenuC0594m menuC0594m = c0689k.f2304d;
        if (menuC0594m != null) {
            arrayListM1188l = menuC0594m.m1188l();
            size = arrayListM1188l.size();
        } else {
            size = 0;
            arrayListM1188l = null;
        }
        int i3 = c0689k.f2317q;
        int i4 = c0689k.f2316p;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0689k.f2309i;
        int i5 = 0;
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z2 = true;
            if (i5 >= size) {
                break;
            }
            C0596o c0596o = (C0596o) arrayListM1188l.get(i5);
            int i8 = c0596o.f2084y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (c0689k.f2318r && c0596o.f2059C) {
                i3 = 0;
            }
            i5++;
        }
        if (c0689k.f2313m && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = c0689k.f2319s;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            C0596o c0596o2 = (C0596o) arrayListM1188l.get(i10);
            int i12 = c0596o2.f2084y;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = c0596o2.f2061b;
            if (z4) {
                View viewM1308a = c0689k.m1308a(c0596o2, null, viewGroup);
                viewM1308a.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM1308a.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                c0596o2.m1200f(z2);
            } else if ((i12 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i13);
                boolean z6 = ((i9 > 0 || z5) && i4 > 0) ? z2 : false;
                if (z6) {
                    View viewM1308a2 = c0689k.m1308a(c0596o2, null, viewGroup);
                    viewM1308a2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewM1308a2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z6 &= i4 + i11 > 0;
                }
                if (z6 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z5) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        C0596o c0596o3 = (C0596o) arrayListM1188l.get(i14);
                        if (c0596o3.f2061b == i13) {
                            if ((c0596o3.f2083x & 32) == 32) {
                                i9++;
                            }
                            c0596o3.m1200f(false);
                        }
                    }
                }
                if (z6) {
                    i9--;
                }
                c0596o2.m1200f(z6);
            } else {
                c0596o2.m1200f(false);
                i10++;
                i2 = 2;
                c0689k = this;
                z2 = true;
            }
            i10++;
            i2 = 2;
            c0689k = this;
            z2 = true;
        }
        return z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x003a */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: h.B */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: j */
    public final boolean mo1151j(SubMenuC0581F subMenuC0581F) {
        boolean z2;
        if (subMenuC0581F.hasVisibleItems()) {
            SubMenuC0581F subMenuC0581F2 = subMenuC0581F;
            while (true) {
                MenuC0594m menuC0594m = subMenuC0581F2.f1962z;
                if (menuC0594m == this.f2304d) {
                    break;
                }
                subMenuC0581F2 = (SubMenuC0581F) menuC0594m;
            }
            ViewGroup viewGroup = (ViewGroup) this.f2309i;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i2);
                    if ((childAt instanceof InterfaceC0576A) && ((InterfaceC0576A) childAt).getItemData() == subMenuC0581F2.f1961A) {
                        view = childAt;
                        break;
                    }
                    i2++;
                }
            }
            if (view != null) {
                subMenuC0581F.f1961A.getClass();
                int size = subMenuC0581F.f2035f.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        z2 = false;
                        break;
                    }
                    MenuItem item = subMenuC0581F.getItem(i3);
                    if (item.isVisible() && item.getIcon() != null) {
                        z2 = true;
                        break;
                    }
                    i3++;
                }
                C0677g c0677g = new C0677g(this, this.f2303c, subMenuC0581F, view);
                this.f2321u = c0677g;
                c0677g.f2104g = z2;
                AbstractC0602u abstractC0602u = c0677g.f2106i;
                if (abstractC0602u != null) {
                    abstractC0602u.mo1154o(z2);
                }
                C0677g c0677g2 = this.f2321u;
                if (!c0677g2.m1206b()) {
                    if (c0677g2.f2102e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c0677g2.m1208d(0, 0, false, false);
                }
                InterfaceC0606y interfaceC0606y = this.f2306f;
                if (interfaceC0606y != null) {
                    interfaceC0606y.mo142m(subMenuC0581F);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: k */
    public final boolean mo1179k(C0596o c0596o) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final boolean m1311l() {
        MenuC0594m menuC0594m;
        if (!this.f2313m || m1310h() || (menuC0594m = this.f2304d) == null || this.f2309i == null || this.f2322v != null) {
            return false;
        }
        menuC0594m.m1187i();
        if (menuC0594m.f2039j.isEmpty()) {
            return false;
        }
        RunnableC0683i runnableC0683i = new RunnableC0683i(this, new C0677g(this, this.f2303c, this.f2304d, this.f2310j));
        this.f2322v = runnableC0683i;
        ((View) this.f2309i).post(runnableC0683i);
        return true;
    }
}
