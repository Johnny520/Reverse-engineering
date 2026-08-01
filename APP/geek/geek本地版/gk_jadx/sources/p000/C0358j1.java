package p000;

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
import com.ljx.wechatmod.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: j1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0358j1 implements InterfaceC0164dv {

    /* JADX INFO: renamed from: a */
    public final Context f2516a;

    /* JADX INFO: renamed from: b */
    public Context f2517b;

    /* JADX INFO: renamed from: c */
    public MenuC0424ku f2518c;

    /* JADX INFO: renamed from: d */
    public final LayoutInflater f2519d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0128cv f2520e;

    /* JADX INFO: renamed from: h */
    public InterfaceC0238fv f2523h;

    /* JADX INFO: renamed from: i */
    public C0319i1 f2524i;

    /* JADX INFO: renamed from: j */
    public Drawable f2525j;

    /* JADX INFO: renamed from: k */
    public boolean f2526k;

    /* JADX INFO: renamed from: l */
    public boolean f2527l;

    /* JADX INFO: renamed from: m */
    public boolean f2528m;

    /* JADX INFO: renamed from: n */
    public int f2529n;

    /* JADX INFO: renamed from: o */
    public int f2530o;

    /* JADX INFO: renamed from: p */
    public int f2531p;

    /* JADX INFO: renamed from: q */
    public boolean f2532q;

    /* JADX INFO: renamed from: s */
    public C0208f1 f2534s;

    /* JADX INFO: renamed from: t */
    public C0208f1 f2535t;

    /* JADX INFO: renamed from: u */
    public RunnableC0282h1 f2536u;

    /* JADX INFO: renamed from: v */
    public C0245g1 f2537v;

    /* JADX INFO: renamed from: f */
    public final int f2521f = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: g */
    public final int f2522g = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: r */
    public final SparseBooleanArray f2533r = new SparseBooleanArray();

    /* JADX INFO: renamed from: w */
    public final C0431l0 f2538w = new C0431l0(1, this);

    public C0358j1(Context context) {
        this.f2516a = context;
        this.f2519d = LayoutInflater.from(context);
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: a */
    public final void mo949a(MenuC0424ku menuC0424ku, boolean z) {
        m1540f();
        C0208f1 c0208f1 = this.f2535t;
        if (c0208f1 != null && c0208f1.m2600b()) {
            c0208f1.f5031i.dismiss();
        }
        InterfaceC0128cv interfaceC0128cv = this.f2520e;
        if (interfaceC0128cv != null) {
            interfaceC0128cv.mo829a(menuC0424ku, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final View m1539b(C0572ou c0572ou, View view, ViewGroup viewGroup) {
        View actionView = c0572ou.getActionView();
        if (actionView == null || c0572ou.m2024e()) {
            InterfaceC0201ev interfaceC0201ev = view instanceof InterfaceC0201ev ? (InterfaceC0201ev) view : (InterfaceC0201ev) this.f2519d.inflate(this.f2522g, viewGroup, false);
            interfaceC0201ev.mo134c(c0572ou);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC0201ev;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f2523h);
            if (this.f2537v == null) {
                this.f2537v = new C0245g1(this);
            }
            actionMenuItemView.setPopupCallback(this.f2537v);
            actionView = (View) interfaceC0201ev;
        }
        actionView.setVisibility(c0572ou.f3585C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0432l1)) {
            actionView.setLayoutParams(ActionMenuView.m161k(layoutParams));
        }
        return actionView;
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: c */
    public final boolean mo950c() {
        int size;
        ArrayList arrayListM1722l;
        int i;
        boolean z;
        C0358j1 c0358j1 = this;
        MenuC0424ku menuC0424ku = c0358j1.f2518c;
        if (menuC0424ku != null) {
            arrayListM1722l = menuC0424ku.m1722l();
            size = arrayListM1722l.size();
        } else {
            size = 0;
            arrayListM1722l = null;
        }
        int i2 = c0358j1.f2531p;
        int i3 = c0358j1.f2530o;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0358j1.f2523h;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            C0572ou c0572ou = (C0572ou) arrayListM1722l.get(i4);
            int i7 = c0572ou.f3610y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (c0358j1.f2532q && c0572ou.f3585C) {
                i2 = 0;
            }
            i4++;
        }
        if (c0358j1.f2527l && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = c0358j1.f2533r;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            C0572ou c0572ou2 = (C0572ou) arrayListM1722l.get(i9);
            int i11 = c0572ou2.f3610y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = c0572ou2.f3587b;
            if (z3) {
                View viewM1539b = c0358j1.m1539b(c0572ou2, null, viewGroup);
                viewM1539b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM1539b.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                c0572ou2.m2025f(z);
            } else if ((i11 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i12);
                boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                if (z5) {
                    View viewM1539b2 = c0358j1.m1539b(c0572ou2, null, viewGroup);
                    viewM1539b2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewM1539b2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i10 == 0) {
                        i10 = measuredWidth2;
                    }
                    z5 &= i3 + i10 > 0;
                }
                if (z5 && i12 != 0) {
                    sparseBooleanArray.put(i12, true);
                } else if (z4) {
                    sparseBooleanArray.put(i12, false);
                    for (int i13 = 0; i13 < i9; i13++) {
                        C0572ou c0572ou3 = (C0572ou) arrayListM1722l.get(i13);
                        if (c0572ou3.f3587b == i12) {
                            if ((c0572ou3.f3609x & 32) == 32) {
                                i8++;
                            }
                            c0572ou3.m2025f(false);
                        }
                    }
                }
                if (z5) {
                    i8--;
                }
                c0572ou2.m2025f(z5);
            } else {
                c0572ou2.m2025f(false);
                i9++;
                i = 2;
                c0358j1 = this;
                z = true;
            }
            i9++;
            i = 2;
            c0358j1 = this;
            z = true;
        }
        return z;
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: d */
    public final boolean mo951d(C0572ou c0572ou) {
        return false;
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: e */
    public final void mo952e(InterfaceC0128cv interfaceC0128cv) {
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1540f() {
        Object obj;
        RunnableC0282h1 runnableC0282h1 = this.f2536u;
        if (runnableC0282h1 != null && (obj = this.f2523h) != null) {
            ((View) obj).removeCallbacks(runnableC0282h1);
            this.f2536u = null;
            return true;
        }
        C0208f1 c0208f1 = this.f2534s;
        if (c0208f1 == null) {
            return false;
        }
        if (c0208f1.m2600b()) {
            c0208f1.f5031i.dismiss();
        }
        return true;
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: g */
    public final boolean mo953g(C0572ou c0572ou) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: h */
    public final void mo954h() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f2523h;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            MenuC0424ku menuC0424ku = this.f2518c;
            if (menuC0424ku != null) {
                menuC0424ku.m1721i();
                ArrayList arrayListM1722l = this.f2518c.m1722l();
                int size = arrayListM1722l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0572ou c0572ou = (C0572ou) arrayListM1722l.get(i2);
                    if ((c0572ou.f3609x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        C0572ou itemData = childAt instanceof InterfaceC0201ev ? ((InterfaceC0201ev) childAt).getItemData() : null;
                        View viewM1539b = m1539b(c0572ou, childAt, viewGroup);
                        if (c0572ou != itemData) {
                            viewM1539b.setPressed(false);
                            viewM1539b.jumpDrawablesToCurrentState();
                        }
                        if (viewM1539b != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM1539b.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM1539b);
                            }
                            ((ViewGroup) this.f2523h).addView(viewM1539b, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f2524i) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f2523h).requestLayout();
        MenuC0424ku menuC0424ku2 = this.f2518c;
        if (menuC0424ku2 != null) {
            menuC0424ku2.m1721i();
            ArrayList arrayList2 = menuC0424ku2.f2958i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC0610pu actionProviderVisibilityListenerC0610pu = ((C0572ou) arrayList2.get(i3)).f3583A;
            }
        }
        MenuC0424ku menuC0424ku3 = this.f2518c;
        if (menuC0424ku3 != null) {
            menuC0424ku3.m1721i();
            arrayList = menuC0424ku3.f2959j;
        }
        if (this.f2527l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((C0572ou) arrayList.get(0)).f3585C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        if (z) {
            if (this.f2524i == null) {
                this.f2524i = new C0319i1(this, this.f2516a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f2524i.getParent();
            if (viewGroup3 != this.f2523h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f2524i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2523h;
                C0319i1 c0319i1 = this.f2524i;
                actionMenuView.getClass();
                C0432l1 c0432l1M160j = ActionMenuView.m160j();
                c0432l1M160j.f2982a = true;
                actionMenuView.addView(c0319i1, c0432l1M160j);
            }
        } else {
            C0319i1 c0319i12 = this.f2524i;
            if (c0319i12 != null) {
                Object parent = c0319i12.getParent();
                Object obj = this.f2523h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f2524i);
                }
            }
        }
        ((ActionMenuView) this.f2523h).setOverflowReserved(this.f2527l);
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: i */
    public final void mo955i(Context context, MenuC0424ku menuC0424ku) {
        this.f2517b = context;
        LayoutInflater.from(context);
        this.f2518c = menuC0424ku;
        Resources resources = context.getResources();
        if (!this.f2528m) {
            this.f2527l = true;
        }
        int i = 2;
        this.f2529n = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f2531p = i;
        int measuredWidth = this.f2529n;
        if (this.f2527l) {
            if (this.f2524i == null) {
                C0319i1 c0319i1 = new C0319i1(this, this.f2516a);
                this.f2524i = c0319i1;
                if (this.f2526k) {
                    c0319i1.setImageDrawable(this.f2525j);
                    this.f2525j = null;
                    this.f2526k = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2524i.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f2524i.getMeasuredWidth();
        } else {
            this.f2524i = null;
        }
        this.f2530o = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1541j() {
        C0208f1 c0208f1 = this.f2534s;
        return c0208f1 != null && c0208f1.m2600b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: k */
    public final boolean mo956k(c50 c50Var) {
        boolean z;
        if (c50Var.hasVisibleItems()) {
            c50 c50Var2 = c50Var;
            while (true) {
                MenuC0424ku menuC0424ku = c50Var2.f890z;
                if (menuC0424ku == this.f2518c) {
                    break;
                }
                c50Var2 = (c50) menuC0424ku;
            }
            C0572ou c0572ou = c50Var2.f889A;
            ViewGroup viewGroup = (ViewGroup) this.f2523h;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof InterfaceC0201ev) && ((InterfaceC0201ev) childAt).getItemData() == c0572ou) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                c50Var.f889A.getClass();
                int size = c50Var.f2955f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = c50Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                C0208f1 c0208f1 = new C0208f1(this, this.f2517b, c50Var, view);
                this.f2535t = c0208f1;
                c0208f1.f5029g = z;
                AbstractC0758tu abstractC0758tu = c0208f1.f5031i;
                if (abstractC0758tu != null) {
                    abstractC0758tu.mo2144o(z);
                }
                C0208f1 c0208f12 = this.f2535t;
                if (!c0208f12.m2600b()) {
                    if (c0208f12.f5027e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c0208f12.m2601d(0, 0, false, false);
                }
                InterfaceC0128cv interfaceC0128cv = this.f2520e;
                if (interfaceC0128cv != null) {
                    interfaceC0128cv.mo830q(c50Var);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1542l() {
        MenuC0424ku menuC0424ku;
        if (!this.f2527l || m1541j() || (menuC0424ku = this.f2518c) == null || this.f2523h == null || this.f2536u != null) {
            return false;
        }
        menuC0424ku.m1721i();
        if (menuC0424ku.f2959j.isEmpty()) {
            return false;
        }
        RunnableC0282h1 runnableC0282h1 = new RunnableC0282h1(this, 0, new C0208f1(this, this.f2517b, this.f2518c, this.f2524i));
        this.f2536u = runnableC0282h1;
        ((View) this.f2523h).post(runnableC0282h1);
        return true;
    }
}
