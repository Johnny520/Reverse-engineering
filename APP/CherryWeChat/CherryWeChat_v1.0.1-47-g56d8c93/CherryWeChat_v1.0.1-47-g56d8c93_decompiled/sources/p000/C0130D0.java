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
import io.github.cherrywechat.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: D0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0130D0 implements InterfaceC0163Dr {

    /* JADX INFO: renamed from: a */
    public final Context f302a;

    /* JADX INFO: renamed from: b */
    public Context f303b;

    /* JADX INFO: renamed from: c */
    public MenuC2204lr f304c;

    /* JADX INFO: renamed from: d */
    public final LayoutInflater f305d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0120Cr f306e;

    /* JADX INFO: renamed from: h */
    public InterfaceC0292Gr f309h;

    /* JADX INFO: renamed from: i */
    public C0087C0 f310i;

    /* JADX INFO: renamed from: j */
    public Drawable f311j;

    /* JADX INFO: renamed from: k */
    public boolean f312k;

    /* JADX INFO: renamed from: l */
    public boolean f313l;

    /* JADX INFO: renamed from: m */
    public boolean f314m;

    /* JADX INFO: renamed from: n */
    public int f315n;

    /* JADX INFO: renamed from: o */
    public int f316o;

    /* JADX INFO: renamed from: p */
    public int f317p;

    /* JADX INFO: renamed from: q */
    public boolean f318q;

    /* JADX INFO: renamed from: s */
    public C2781z0 f320s;

    /* JADX INFO: renamed from: t */
    public C2781z0 f321t;

    /* JADX INFO: renamed from: u */
    public RunnableC0044B0 f322u;

    /* JADX INFO: renamed from: v */
    public C0001A0 f323v;

    /* JADX INFO: renamed from: f */
    public final int f307f = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: g */
    public final int f308g = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: r */
    public final SparseBooleanArray f319r = new SparseBooleanArray();

    /* JADX INFO: renamed from: w */
    public final C0132D2 f324w = new C0132D2(3, this);

    public C0130D0(Context context) {
        this.f302a = context;
        this.f305d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final View m212a(C2427qr c2427qr, View view, ViewGroup viewGroup) {
        View actionView = c2427qr.getActionView();
        if (actionView == null || c2427qr.m4860e()) {
            InterfaceC0249Fr interfaceC0249Fr = view instanceof InterfaceC0249Fr ? (InterfaceC0249Fr) view : (InterfaceC0249Fr) this.f305d.inflate(this.f308g, viewGroup, false);
            interfaceC0249Fr.mo521c(c2427qr);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC0249Fr;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f309h);
            if (this.f323v == null) {
                this.f323v = new C0001A0(this);
            }
            actionMenuItemView.setPopupCallback(this.f323v);
            actionView = (View) interfaceC0249Fr;
        }
        actionView.setVisibility(c2427qr.f8491C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0216F0)) {
            actionView.setLayoutParams(ActionMenuView.m2091k(layoutParams));
        }
        return actionView;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: b */
    public final void mo213b(MenuC2204lr menuC2204lr, boolean z) {
        m214c();
        C2781z0 c2781z0 = this.f321t;
        if (c2781z0 != null && c2781z0.m5291b()) {
            c2781z0.f9323i.dismiss();
        }
        InterfaceC0120Cr interfaceC0120Cr = this.f306e;
        if (interfaceC0120Cr != null) {
            interfaceC0120Cr.mo193b(menuC2204lr, z);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m214c() {
        Object obj;
        RunnableC0044B0 runnableC0044B0 = this.f322u;
        if (runnableC0044B0 != null && (obj = this.f309h) != null) {
            ((View) obj).removeCallbacks(runnableC0044B0);
            this.f322u = null;
            return true;
        }
        C2781z0 c2781z0 = this.f320s;
        if (c2781z0 == null) {
            return false;
        }
        if (c2781z0.m5291b()) {
            c2781z0.f9323i.dismiss();
        }
        return true;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: d */
    public final boolean mo215d(C2427qr c2427qr) {
        return false;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: e */
    public final void mo216e(InterfaceC0120Cr interfaceC0120Cr) {
        throw null;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: f */
    public final boolean mo217f(C2427qr c2427qr) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: g */
    public final void mo218g() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f309h;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            MenuC2204lr menuC2204lr = this.f304c;
            if (menuC2204lr != null) {
                menuC2204lr.m4433i();
                ArrayList arrayListM4434l = this.f304c.m4434l();
                int size = arrayListM4434l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C2427qr c2427qr = (C2427qr) arrayListM4434l.get(i2);
                    if ((c2427qr.f8515x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        C2427qr itemData = childAt instanceof InterfaceC0249Fr ? ((InterfaceC0249Fr) childAt).getItemData() : null;
                        View viewM212a = m212a(c2427qr, childAt, viewGroup);
                        if (c2427qr != itemData) {
                            viewM212a.setPressed(false);
                            viewM212a.jumpDrawablesToCurrentState();
                        }
                        if (viewM212a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM212a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM212a);
                            }
                            ((ViewGroup) this.f309h).addView(viewM212a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f310i) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f309h).requestLayout();
        MenuC2204lr menuC2204lr2 = this.f304c;
        if (menuC2204lr2 != null) {
            menuC2204lr2.m4433i();
            ArrayList arrayList2 = menuC2204lr2.f7668i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC2470rr actionProviderVisibilityListenerC2470rr = ((C2427qr) arrayList2.get(i3)).f8489A;
            }
        }
        MenuC2204lr menuC2204lr3 = this.f304c;
        if (menuC2204lr3 != null) {
            menuC2204lr3.m4433i();
            arrayList = menuC2204lr3.f7669j;
        }
        if (this.f313l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((C2427qr) arrayList.get(0)).f8491C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        if (z) {
            if (this.f310i == null) {
                this.f310i = new C0087C0(this, this.f302a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f310i.getParent();
            if (viewGroup3 != this.f309h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f310i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f309h;
                C0087C0 c0087c0 = this.f310i;
                actionMenuView.getClass();
                C0216F0 c0216f0M2090j = ActionMenuView.m2090j();
                c0216f0M2090j.f635a = true;
                actionMenuView.addView(c0087c0, c0216f0M2090j);
            }
        } else {
            C0087C0 c0087c02 = this.f310i;
            if (c0087c02 != null) {
                Object parent = c0087c02.getParent();
                Object obj = this.f309h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f310i);
                }
            }
        }
        ((ActionMenuView) this.f309h).setOverflowReserved(this.f313l);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m219h() {
        C2781z0 c2781z0 = this.f320s;
        return c2781z0 != null && c2781z0.m5291b();
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: i */
    public final void mo220i(Context context, MenuC2204lr menuC2204lr) {
        this.f303b = context;
        LayoutInflater.from(context);
        this.f304c = menuC2204lr;
        Resources resources = context.getResources();
        if (!this.f314m) {
            this.f313l = true;
        }
        int i = 2;
        this.f315n = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f317p = i;
        int measuredWidth = this.f315n;
        if (this.f313l) {
            if (this.f310i == null) {
                C0087C0 c0087c0 = new C0087C0(this, this.f302a);
                this.f310i = c0087c0;
                if (this.f312k) {
                    c0087c0.setImageDrawable(this.f311j);
                    this.f311j = null;
                    this.f312k = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f310i.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f310i.getMeasuredWidth();
        } else {
            this.f310i = null;
        }
        this.f316o = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: j */
    public final boolean mo221j(SubMenuC0214Ez subMenuC0214Ez) {
        boolean z;
        if (subMenuC0214Ez.hasVisibleItems()) {
            SubMenuC0214Ez subMenuC0214Ez2 = subMenuC0214Ez;
            while (true) {
                MenuC2204lr menuC2204lr = subMenuC0214Ez2.f631z;
                if (menuC2204lr == this.f304c) {
                    break;
                }
                subMenuC0214Ez2 = (SubMenuC0214Ez) menuC2204lr;
            }
            C2427qr c2427qr = subMenuC0214Ez2.f630A;
            ViewGroup viewGroup = (ViewGroup) this.f309h;
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
                    if ((childAt instanceof InterfaceC0249Fr) && ((InterfaceC0249Fr) childAt).getItemData() == c2427qr) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                subMenuC0214Ez.f630A.getClass();
                int size = subMenuC0214Ez.f7665f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = subMenuC0214Ez.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                C2781z0 c2781z0 = new C2781z0(this, this.f303b, subMenuC0214Ez, view);
                this.f321t = c2781z0;
                c2781z0.f9321g = z;
                AbstractC2642vr abstractC2642vr = c2781z0.f9323i;
                if (abstractC2642vr != null) {
                    abstractC2642vr.mo1947o(z);
                }
                C2781z0 c2781z02 = this.f321t;
                if (!c2781z02.m5291b()) {
                    if (c2781z02.f9319e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c2781z02.m5293d(0, 0, false, false);
                }
                InterfaceC0120Cr interfaceC0120Cr = this.f306e;
                if (interfaceC0120Cr != null) {
                    interfaceC0120Cr.mo194s(subMenuC0214Ez);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: k */
    public final boolean mo222k() {
        int size;
        ArrayList arrayListM4434l;
        int i;
        boolean z;
        C0130D0 c0130d0 = this;
        MenuC2204lr menuC2204lr = c0130d0.f304c;
        if (menuC2204lr != null) {
            arrayListM4434l = menuC2204lr.m4434l();
            size = arrayListM4434l.size();
        } else {
            size = 0;
            arrayListM4434l = null;
        }
        int i2 = c0130d0.f317p;
        int i3 = c0130d0.f316o;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0130d0.f309h;
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
            C2427qr c2427qr = (C2427qr) arrayListM4434l.get(i4);
            int i7 = c2427qr.f8516y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (c0130d0.f318q && c2427qr.f8491C) {
                i2 = 0;
            }
            i4++;
        }
        if (c0130d0.f313l && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = c0130d0.f319r;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            C2427qr c2427qr2 = (C2427qr) arrayListM4434l.get(i9);
            int i11 = c2427qr2.f8516y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = c2427qr2.f8493b;
            if (z3) {
                View viewM212a = c0130d0.m212a(c2427qr2, null, viewGroup);
                viewM212a.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM212a.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                c2427qr2.m4861f(z);
            } else if ((i11 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i12);
                boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                if (z5) {
                    View viewM212a2 = c0130d0.m212a(c2427qr2, null, viewGroup);
                    viewM212a2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewM212a2.getMeasuredWidth();
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
                        C2427qr c2427qr3 = (C2427qr) arrayListM4434l.get(i13);
                        if (c2427qr3.f8493b == i12) {
                            if ((c2427qr3.f8515x & 32) == 32) {
                                i8++;
                            }
                            c2427qr3.m4861f(false);
                        }
                    }
                }
                if (z5) {
                    i8--;
                }
                c2427qr2.m4861f(z5);
            } else {
                c2427qr2.m4861f(false);
                i9++;
                i = 2;
                c0130d0 = this;
                z = true;
            }
            i9++;
            i = 2;
            c0130d0 = this;
            z = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m223l() {
        MenuC2204lr menuC2204lr;
        if (!this.f313l || m219h() || (menuC2204lr = this.f304c) == null || this.f309h == null || this.f322u != null) {
            return false;
        }
        menuC2204lr.m4433i();
        if (menuC2204lr.f7669j.isEmpty()) {
            return false;
        }
        RunnableC0044B0 runnableC0044B0 = new RunnableC0044B0(0, this, new C2781z0(this, this.f303b, this.f304c, this.f310i));
        this.f322u = runnableC0044B0;
        ((View) this.f309h).post(runnableC0044B0);
        return true;
    }
}
