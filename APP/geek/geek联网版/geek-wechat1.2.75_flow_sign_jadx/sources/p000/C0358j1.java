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
public final class C0358j1 implements InterfaceC0462lv {

    /* JADX INFO: renamed from: a */
    public final Context f2623a;

    /* JADX INFO: renamed from: b */
    public Context f2624b;

    /* JADX INFO: renamed from: c */
    public MenuC0646qu f2625c;

    /* JADX INFO: renamed from: d */
    public final LayoutInflater f2626d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0425kv f2627e;

    /* JADX INFO: renamed from: h */
    public InterfaceC0536nv f2630h;

    /* JADX INFO: renamed from: i */
    public C0319i1 f2631i;

    /* JADX INFO: renamed from: j */
    public Drawable f2632j;

    /* JADX INFO: renamed from: k */
    public boolean f2633k;

    /* JADX INFO: renamed from: l */
    public boolean f2634l;

    /* JADX INFO: renamed from: m */
    public boolean f2635m;

    /* JADX INFO: renamed from: n */
    public int f2636n;

    /* JADX INFO: renamed from: o */
    public int f2637o;

    /* JADX INFO: renamed from: p */
    public int f2638p;

    /* JADX INFO: renamed from: q */
    public boolean f2639q;

    /* JADX INFO: renamed from: s */
    public C0208f1 f2641s;

    /* JADX INFO: renamed from: t */
    public C0208f1 f2642t;

    /* JADX INFO: renamed from: u */
    public RunnableC0282h1 f2643u;

    /* JADX INFO: renamed from: v */
    public C0245g1 f2644v;

    /* JADX INFO: renamed from: f */
    public final int f2628f = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: g */
    public final int f2629g = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: r */
    public final SparseBooleanArray f2640r = new SparseBooleanArray();

    /* JADX INFO: renamed from: w */
    public final C0431l0 f2645w = new C0431l0(1, this);

    public C0358j1(Context context) {
        this.f2623a = context;
        this.f2626d = LayoutInflater.from(context);
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: a */
    public final void mo972a(MenuC0646qu menuC0646qu, boolean z) {
        m1560f();
        C0208f1 c0208f1 = this.f2642t;
        if (c0208f1 != null && c0208f1.m1029b()) {
            c0208f1.f1669i.dismiss();
        }
        InterfaceC0425kv interfaceC0425kv = this.f2627e;
        if (interfaceC0425kv != null) {
            interfaceC0425kv.mo1134a(menuC0646qu, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final View m1559b(C0869wu c0869wu, View view, ViewGroup viewGroup) {
        View actionView = c0869wu.getActionView();
        if (actionView == null || c0869wu.m2622e()) {
            InterfaceC0499mv interfaceC0499mv = view instanceof InterfaceC0499mv ? (InterfaceC0499mv) view : (InterfaceC0499mv) this.f2626d.inflate(this.f2629g, viewGroup, false);
            interfaceC0499mv.mo119c(c0869wu);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC0499mv;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f2630h);
            if (this.f2644v == null) {
                this.f2644v = new C0245g1(this);
            }
            actionMenuItemView.setPopupCallback(this.f2644v);
            actionView = (View) interfaceC0499mv;
        }
        actionView.setVisibility(c0869wu.f5111C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0432l1)) {
            actionView.setLayoutParams(ActionMenuView.m146k(layoutParams));
        }
        return actionView;
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: c */
    public final boolean mo974c() {
        int size;
        ArrayList arrayListM2171l;
        int i;
        boolean z;
        C0358j1 c0358j1 = this;
        MenuC0646qu menuC0646qu = c0358j1.f2625c;
        if (menuC0646qu != null) {
            arrayListM2171l = menuC0646qu.m2171l();
            size = arrayListM2171l.size();
        } else {
            size = 0;
            arrayListM2171l = null;
        }
        int i2 = c0358j1.f2638p;
        int i3 = c0358j1.f2637o;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0358j1.f2630h;
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
            C0869wu c0869wu = (C0869wu) arrayListM2171l.get(i4);
            int i7 = c0869wu.f5136y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (c0358j1.f2639q && c0869wu.f5111C) {
                i2 = 0;
            }
            i4++;
        }
        if (c0358j1.f2634l && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = c0358j1.f2640r;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            C0869wu c0869wu2 = (C0869wu) arrayListM2171l.get(i9);
            int i11 = c0869wu2.f5136y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = c0869wu2.f5113b;
            if (z3) {
                View viewM1559b = c0358j1.m1559b(c0869wu2, null, viewGroup);
                viewM1559b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM1559b.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                c0869wu2.m2623f(z);
            } else if ((i11 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i12);
                boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                if (z5) {
                    View viewM1559b2 = c0358j1.m1559b(c0869wu2, null, viewGroup);
                    viewM1559b2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewM1559b2.getMeasuredWidth();
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
                        C0869wu c0869wu3 = (C0869wu) arrayListM2171l.get(i13);
                        if (c0869wu3.f5113b == i12) {
                            if ((c0869wu3.f5135x & 32) == 32) {
                                i8++;
                            }
                            c0869wu3.m2623f(false);
                        }
                    }
                }
                if (z5) {
                    i8--;
                }
                c0869wu2.m2623f(z5);
            } else {
                c0869wu2.m2623f(false);
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

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: d */
    public final boolean mo530d(C0869wu c0869wu) {
        return false;
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: e */
    public final void mo975e(InterfaceC0425kv interfaceC0425kv) {
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1560f() {
        Object obj;
        RunnableC0282h1 runnableC0282h1 = this.f2643u;
        if (runnableC0282h1 != null && (obj = this.f2630h) != null) {
            ((View) obj).removeCallbacks(runnableC0282h1);
            this.f2643u = null;
            return true;
        }
        C0208f1 c0208f1 = this.f2641s;
        if (c0208f1 == null) {
            return false;
        }
        if (c0208f1.m1029b()) {
            c0208f1.f1669i.dismiss();
        }
        return true;
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: g */
    public final boolean mo531g(C0869wu c0869wu) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: h */
    public final void mo977h() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f2630h;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            MenuC0646qu menuC0646qu = this.f2625c;
            if (menuC0646qu != null) {
                menuC0646qu.m2170i();
                ArrayList arrayListM2171l = this.f2625c.m2171l();
                int size = arrayListM2171l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0869wu c0869wu = (C0869wu) arrayListM2171l.get(i2);
                    if ((c0869wu.f5135x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        C0869wu itemData = childAt instanceof InterfaceC0499mv ? ((InterfaceC0499mv) childAt).getItemData() : null;
                        View viewM1559b = m1559b(c0869wu, childAt, viewGroup);
                        if (c0869wu != itemData) {
                            viewM1559b.setPressed(false);
                            viewM1559b.jumpDrawablesToCurrentState();
                        }
                        if (viewM1559b != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM1559b.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM1559b);
                            }
                            ((ViewGroup) this.f2630h).addView(viewM1559b, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f2631i) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f2630h).requestLayout();
        MenuC0646qu menuC0646qu2 = this.f2625c;
        if (menuC0646qu2 != null) {
            menuC0646qu2.m2170i();
            ArrayList arrayList2 = menuC0646qu2.f3959i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC0906xu actionProviderVisibilityListenerC0906xu = ((C0869wu) arrayList2.get(i3)).f5109A;
            }
        }
        MenuC0646qu menuC0646qu3 = this.f2625c;
        if (menuC0646qu3 != null) {
            menuC0646qu3.m2170i();
            arrayList = menuC0646qu3.f3960j;
        }
        if (this.f2634l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((C0869wu) arrayList.get(0)).f5111C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        if (z) {
            if (this.f2631i == null) {
                this.f2631i = new C0319i1(this, this.f2623a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f2631i.getParent();
            if (viewGroup3 != this.f2630h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f2631i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2630h;
                C0319i1 c0319i1 = this.f2631i;
                actionMenuView.getClass();
                C0432l1 c0432l1M145j = ActionMenuView.m145j();
                c0432l1M145j.f2888a = true;
                actionMenuView.addView(c0319i1, c0432l1M145j);
            }
        } else {
            C0319i1 c0319i12 = this.f2631i;
            if (c0319i12 != null) {
                Object parent = c0319i12.getParent();
                Object obj = this.f2630h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f2631i);
                }
            }
        }
        ((ActionMenuView) this.f2630h).setOverflowReserved(this.f2634l);
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: i */
    public final void mo532i(Context context, MenuC0646qu menuC0646qu) {
        this.f2624b = context;
        LayoutInflater.from(context);
        this.f2625c = menuC0646qu;
        Resources resources = context.getResources();
        if (!this.f2635m) {
            this.f2634l = true;
        }
        int i = 2;
        this.f2636n = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f2638p = i;
        int measuredWidth = this.f2636n;
        if (this.f2634l) {
            if (this.f2631i == null) {
                C0319i1 c0319i1 = new C0319i1(this, this.f2623a);
                this.f2631i = c0319i1;
                if (this.f2633k) {
                    c0319i1.setImageDrawable(this.f2632j);
                    this.f2632j = null;
                    this.f2633k = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2631i.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f2631i.getMeasuredWidth();
        } else {
            this.f2631i = null;
        }
        this.f2637o = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1561j() {
        C0208f1 c0208f1 = this.f2641s;
        return c0208f1 != null && c0208f1.m1029b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: k */
    public final boolean mo979k(j50 j50Var) {
        boolean z;
        if (j50Var.hasVisibleItems()) {
            j50 j50Var2 = j50Var;
            while (true) {
                MenuC0646qu menuC0646qu = j50Var2.f2661z;
                if (menuC0646qu == this.f2625c) {
                    break;
                }
                j50Var2 = (j50) menuC0646qu;
            }
            C0869wu c0869wu = j50Var2.f2660A;
            ViewGroup viewGroup = (ViewGroup) this.f2630h;
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
                    if ((childAt instanceof InterfaceC0499mv) && ((InterfaceC0499mv) childAt).getItemData() == c0869wu) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                j50Var.f2660A.getClass();
                int size = j50Var.f3956f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = j50Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                C0208f1 c0208f1 = new C0208f1(this, this.f2624b, j50Var, view);
                this.f2642t = c0208f1;
                c0208f1.f1667g = z;
                AbstractC0082bv abstractC0082bv = c0208f1.f1669i;
                if (abstractC0082bv != null) {
                    abstractC0082bv.mo535o(z);
                }
                C0208f1 c0208f12 = this.f2642t;
                if (!c0208f12.m1029b()) {
                    if (c0208f12.f1665e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c0208f12.m1031d(0, 0, false, false);
                }
                InterfaceC0425kv interfaceC0425kv = this.f2627e;
                if (interfaceC0425kv != null) {
                    interfaceC0425kv.mo1135q(j50Var);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1562l() {
        MenuC0646qu menuC0646qu;
        if (!this.f2634l || m1561j() || (menuC0646qu = this.f2625c) == null || this.f2630h == null || this.f2643u != null) {
            return false;
        }
        menuC0646qu.m2170i();
        if (menuC0646qu.f3960j.isEmpty()) {
            return false;
        }
        RunnableC0282h1 runnableC0282h1 = new RunnableC0282h1(this, 0, new C0208f1(this, this.f2624b, this.f2625c, this.f2631i));
        this.f2643u = runnableC0282h1;
        ((View) this.f2630h).post(runnableC0282h1);
        return true;
    }
}
