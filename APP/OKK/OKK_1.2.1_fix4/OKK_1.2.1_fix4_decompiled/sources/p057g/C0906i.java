package p057g;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import org.luckypray.dexkit.C1031R;
import p000A.RunnableC0000a;
import p006D.C0095d;
import p055f.AbstractC0781l;
import p055f.InterfaceC0784o;
import p055f.InterfaceC0785p;
import p055f.InterfaceC0786q;
import p055f.MenuC0779j;
import p055f.MenuItemC0780k;
import p055f.SubMenuC0789t;

/* JADX INFO: renamed from: g.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0906i implements InterfaceC0785p {

    /* JADX INFO: renamed from: a */
    public final Context f3203a;

    /* JADX INFO: renamed from: b */
    public Context f3204b;

    /* JADX INFO: renamed from: c */
    public MenuC0779j f3205c;

    /* JADX INFO: renamed from: d */
    public final LayoutInflater f3206d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0784o f3207e;

    /* JADX INFO: renamed from: g */
    public ActionMenuView f3209g;

    /* JADX INFO: renamed from: h */
    public C0904h f3210h;

    /* JADX INFO: renamed from: i */
    public Drawable f3211i;

    /* JADX INFO: renamed from: j */
    public boolean f3212j;

    /* JADX INFO: renamed from: k */
    public boolean f3213k;

    /* JADX INFO: renamed from: l */
    public boolean f3214l;

    /* JADX INFO: renamed from: m */
    public int f3215m;

    /* JADX INFO: renamed from: n */
    public int f3216n;

    /* JADX INFO: renamed from: o */
    public int f3217o;

    /* JADX INFO: renamed from: p */
    public boolean f3218p;

    /* JADX INFO: renamed from: r */
    public C0900f f3220r;

    /* JADX INFO: renamed from: s */
    public C0900f f3221s;

    /* JADX INFO: renamed from: t */
    public RunnableC0000a f3222t;

    /* JADX INFO: renamed from: u */
    public C0902g f3223u;

    /* JADX INFO: renamed from: f */
    public final int f3208f = C1031R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: q */
    public final SparseBooleanArray f3219q = new SparseBooleanArray();

    /* JADX INFO: renamed from: v */
    public final C0095d f3224v = new C0095d(17, this);

    public C0906i(Context context) {
        this.f3203a = context;
        this.f3206d = LayoutInflater.from(context);
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: a */
    public final void mo1976a(MenuC0779j menuC0779j, boolean z2) {
        m2235e();
        C0900f c0900f = this.f3221s;
        if (c0900f != null && c0900f.m2027b()) {
            c0900f.f2844j.dismiss();
        }
        InterfaceC0784o interfaceC0784o = this.f3207e;
        if (interfaceC0784o != null) {
            interfaceC0784o.mo339a(menuC0779j, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: b */
    public final void mo1977b() {
        int i2;
        ViewGroup viewGroup = this.f3209g;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            MenuC0779j menuC0779j = this.f3205c;
            if (menuC0779j != null) {
                menuC0779j.m2003i();
                ArrayList arrayListM2005k = this.f3205c.m2005k();
                int size = arrayListM2005k.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    MenuItemC0780k menuItemC0780k = (MenuItemC0780k) arrayListM2005k.get(i3);
                    if (menuItemC0780k.m2017d()) {
                        View childAt = viewGroup.getChildAt(i2);
                        MenuItemC0780k itemData = childAt instanceof InterfaceC0786q ? ((InterfaceC0786q) childAt).getItemData() : null;
                        View viewM2234d = m2234d(menuItemC0780k, childAt, viewGroup);
                        if (menuItemC0780k != itemData) {
                            viewM2234d.setPressed(false);
                            viewM2234d.jumpDrawablesToCurrentState();
                        }
                        if (viewM2234d != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM2234d.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM2234d);
                            }
                            this.f3209g.addView(viewM2234d, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) == this.f3210h) {
                    i2++;
                } else {
                    viewGroup.removeViewAt(i2);
                }
            }
        }
        this.f3209g.requestLayout();
        MenuC0779j menuC0779j2 = this.f3205c;
        if (menuC0779j2 != null) {
            menuC0779j2.m2003i();
            ArrayList arrayList2 = menuC0779j2.f2793i;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((MenuItemC0780k) arrayList2.get(i4)).getClass();
            }
        }
        MenuC0779j menuC0779j3 = this.f3205c;
        if (menuC0779j3 != null) {
            menuC0779j3.m2003i();
            arrayList = menuC0779j3.f2794j;
        }
        if (this.f3213k && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((MenuItemC0780k) arrayList.get(0)).f2806B;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f3210h == null) {
                this.f3210h = new C0904h(this, this.f3203a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f3210h.getParent();
            if (viewGroup3 != this.f3209g) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f3210h);
                }
                ActionMenuView actionMenuView = this.f3209g;
                C0904h c0904h = this.f3210h;
                actionMenuView.getClass();
                C0910k c0910kM1124i = ActionMenuView.m1124i();
                c0910kM1124i.f3225a = true;
                actionMenuView.addView(c0904h, c0910kM1124i);
            }
        } else {
            C0904h c0904h2 = this.f3210h;
            if (c0904h2 != null) {
                ViewParent parent = c0904h2.getParent();
                ActionMenuView actionMenuView2 = this.f3209g;
                if (parent == actionMenuView2) {
                    actionMenuView2.removeView(this.f3210h);
                }
            }
        }
        this.f3209g.setOverflowReserved(this.f3213k);
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: c */
    public final boolean mo2023c(MenuItemC0780k menuItemC0780k) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final View m2234d(MenuItemC0780k menuItemC0780k, View view, ViewGroup viewGroup) {
        View view2 = menuItemC0780k.f2832z;
        if (view2 == null) {
            view2 = null;
        }
        if (view2 == null || menuItemC0780k.m2016c()) {
            InterfaceC0786q interfaceC0786q = view instanceof InterfaceC0786q ? (InterfaceC0786q) view : (InterfaceC0786q) this.f3206d.inflate(this.f3208f, viewGroup, false);
            interfaceC0786q.mo1113c(menuItemC0780k);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC0786q;
            actionMenuItemView.setItemInvoker(this.f3209g);
            if (this.f3223u == null) {
                this.f3223u = new C0902g(this);
            }
            actionMenuItemView.setPopupCallback(this.f3223u);
            view2 = (View) interfaceC0786q;
        }
        view2.setVisibility(menuItemC0780k.f2806B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0910k)) {
            view2.setLayoutParams(ActionMenuView.m1125j(layoutParams));
        }
        return view2;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2235e() {
        ActionMenuView actionMenuView;
        RunnableC0000a runnableC0000a = this.f3222t;
        if (runnableC0000a != null && (actionMenuView = this.f3209g) != null) {
            actionMenuView.removeCallbacks(runnableC0000a);
            this.f3222t = null;
            return true;
        }
        C0900f c0900f = this.f3220r;
        if (c0900f == null) {
            return false;
        }
        if (c0900f.m2027b()) {
            c0900f.f2844j.dismiss();
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2236f() {
        MenuC0779j menuC0779j;
        if (!this.f3213k) {
            return false;
        }
        C0900f c0900f = this.f3220r;
        if ((c0900f != null && c0900f.m2027b()) || (menuC0779j = this.f3205c) == null || this.f3209g == null || this.f3222t != null) {
            return false;
        }
        menuC0779j.m2003i();
        if (menuC0779j.f2794j.isEmpty()) {
            return false;
        }
        RunnableC0000a runnableC0000a = new RunnableC0000a(this, new C0900f(this, this.f3204b, this.f3205c, this.f3210h));
        this.f3222t = runnableC0000a;
        this.f3209g.post(runnableC0000a);
        return true;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: g */
    public final boolean mo1981g() {
        int size;
        ArrayList arrayListM2005k;
        int i2;
        boolean z2;
        MenuC0779j menuC0779j = this.f3205c;
        if (menuC0779j != null) {
            arrayListM2005k = menuC0779j.m2005k();
            size = arrayListM2005k.size();
        } else {
            size = 0;
            arrayListM2005k = null;
        }
        int i3 = this.f3217o;
        int i4 = this.f3216n;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = this.f3209g;
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
            MenuItemC0780k menuItemC0780k = (MenuItemC0780k) arrayListM2005k.get(i5);
            int i8 = menuItemC0780k.f2831y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (this.f3218p && menuItemC0780k.f2806B) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f3213k && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.f3219q;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            MenuItemC0780k menuItemC0780k2 = (MenuItemC0780k) arrayListM2005k.get(i10);
            int i12 = menuItemC0780k2.f2831y;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = menuItemC0780k2.f2808b;
            if (z4) {
                View viewM2234d = m2234d(menuItemC0780k2, null, actionMenuView);
                viewM2234d.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM2234d.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                menuItemC0780k2.m2019f(z2);
            } else if ((i12 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i13);
                boolean z6 = ((i9 > 0 || z5) && i4 > 0) ? z2 : false;
                if (z6) {
                    View viewM2234d2 = m2234d(menuItemC0780k2, null, actionMenuView);
                    viewM2234d2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewM2234d2.getMeasuredWidth();
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
                        MenuItemC0780k menuItemC0780k3 = (MenuItemC0780k) arrayListM2005k.get(i14);
                        if (menuItemC0780k3.f2808b == i13) {
                            if (menuItemC0780k3.m2017d()) {
                                i9++;
                            }
                            menuItemC0780k3.m2019f(false);
                        }
                    }
                }
                if (z6) {
                    i9--;
                }
                menuItemC0780k2.m2019f(z6);
            } else {
                menuItemC0780k2.m2019f(false);
                i10++;
                i2 = 2;
                z2 = true;
            }
            i10++;
            i2 = 2;
            z2 = true;
        }
        return z2;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: h */
    public final void mo2024h(Context context, MenuC0779j menuC0779j) {
        this.f3204b = context;
        LayoutInflater.from(context);
        this.f3205c = menuC0779j;
        Resources resources = context.getResources();
        if (!this.f3214l) {
            this.f3213k = true;
        }
        int i2 = 2;
        this.f3215m = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f3217o = i2;
        int measuredWidth = this.f3215m;
        if (this.f3213k) {
            if (this.f3210h == null) {
                C0904h c0904h = new C0904h(this, this.f3203a);
                this.f3210h = c0904h;
                if (this.f3212j) {
                    c0904h.setImageDrawable(this.f3211i);
                    this.f3211i = null;
                    this.f3212j = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f3210h.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f3210h.getMeasuredWidth();
        } else {
            this.f3210h = null;
        }
        this.f3216n = measuredWidth;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: i */
    public final boolean mo2025i(MenuItemC0780k menuItemC0780k) {
        return false;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: j */
    public final void mo1982j(InterfaceC0784o interfaceC0784o) {
        this.f3207e = interfaceC0784o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: k */
    public final boolean mo1983k(SubMenuC0789t subMenuC0789t) {
        boolean z2;
        if (!subMenuC0789t.hasVisibleItems()) {
            return false;
        }
        SubMenuC0789t subMenuC0789t2 = subMenuC0789t;
        while (true) {
            MenuC0779j menuC0779j = subMenuC0789t2.f2867v;
            if (menuC0779j == this.f3205c) {
                break;
            }
            subMenuC0789t2 = (SubMenuC0789t) menuC0779j;
        }
        ActionMenuView actionMenuView = this.f3209g;
        View view = null;
        view = null;
        if (actionMenuView != null) {
            int childCount = actionMenuView.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = actionMenuView.getChildAt(i2);
                if ((childAt instanceof InterfaceC0786q) && ((InterfaceC0786q) childAt).getItemData() == subMenuC0789t2.f2868w) {
                    view = childAt;
                    break;
                }
                i2++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC0789t.f2868w.getClass();
        int size = subMenuC0789t.f2790f.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = subMenuC0789t.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i3++;
        }
        C0900f c0900f = new C0900f(this, this.f3204b, subMenuC0789t, view);
        this.f3221s = c0900f;
        c0900f.f2842h = z2;
        AbstractC0781l abstractC0781l = c0900f.f2844j;
        if (abstractC0781l != null) {
            abstractC0781l.mo1986o(z2);
        }
        C0900f c0900f2 = this.f3221s;
        if (!c0900f2.m2027b()) {
            if (c0900f2.f2840f == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0900f2.m2029d(0, 0, false, false);
        }
        InterfaceC0784o interfaceC0784o = this.f3207e;
        if (interfaceC0784o != null) {
            interfaceC0784o.mo345k(subMenuC0789t);
        }
        return true;
    }
}
