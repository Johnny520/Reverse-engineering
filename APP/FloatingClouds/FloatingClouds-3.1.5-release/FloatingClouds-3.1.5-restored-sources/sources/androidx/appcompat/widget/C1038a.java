package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.C0983R;
import androidx.appcompat.view.menu.AbstractC0993a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0998f;
import androidx.appcompat.view.menu.C1000h;
import androidx.appcompat.view.menu.C1001i;
import androidx.appcompat.view.menu.InterfaceC1002j;
import androidx.appcompat.view.menu.InterfaceC1003k;
import androidx.appcompat.view.menu.SubMenuC1005m;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import p000a.AbstractC0290Q;
import p000a.AbstractC0557eb;
import p000a.AbstractViewOnTouchListenerC0386V6;
import p000a.C0547e1;
import p000a.C0893w5;
import p000a.C0922xf;
import p000a.InterfaceC0541de;

/* JADX INFO: renamed from: androidx.appcompat.widget.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1038a extends AbstractC0993a {

    /* JADX INFO: renamed from: i */
    public d f4085i;

    /* JADX INFO: renamed from: j */
    public Drawable f4086j;

    /* JADX INFO: renamed from: k */
    public boolean f4087k;

    /* JADX INFO: renamed from: l */
    public boolean f4088l;

    /* JADX INFO: renamed from: m */
    public boolean f4089m;

    /* JADX INFO: renamed from: n */
    public int f4090n;

    /* JADX INFO: renamed from: o */
    public int f4091o;

    /* JADX INFO: renamed from: p */
    public int f4092p;

    /* JADX INFO: renamed from: q */
    public boolean f4093q;

    /* JADX INFO: renamed from: r */
    public final SparseBooleanArray f4094r;

    /* JADX INFO: renamed from: s */
    public e f4095s;

    /* JADX INFO: renamed from: t */
    public a f4096t;

    /* JADX INFO: renamed from: u */
    public c f4097u;

    /* JADX INFO: renamed from: v */
    public b f4098v;

    /* JADX INFO: renamed from: w */
    public final f f4099w;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a */
    public class a extends C1001i {
        public a(Context context, SubMenuC1005m subMenuC1005m, View view) {
            super(C0983R.attr.actionOverflowMenuStyle, context, view, subMenuC1005m, false);
            if ((subMenuC1005m.f3875A.f3837x & 32) != 32) {
                View view2 = C1038a.this.f4085i;
                this.f3845e = view2 == null ? (View) C1038a.this.f3731h : view2;
            }
            f fVar = C1038a.this.f4099w;
            this.f3848h = fVar;
            AbstractC0557eb abstractC0557eb = this.f3849i;
            if (abstractC0557eb != null) {
                abstractC0557eb.mo2309h(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.C1001i
        /* JADX INFO: renamed from: c */
        public final void mo2345c() {
            C1038a c1038a = C1038a.this;
            c1038a.f4096t = null;
            c1038a.getClass();
            super.mo2345c();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$b */
    public class b extends ActionMenuItemView.AbstractC0992b {
        public b() {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final e f4102a;

        public c(e eVar) {
            this.f4102a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0998f.a aVar;
            C1038a c1038a = C1038a.this;
            C0998f c0998f = c1038a.f3726c;
            if (c0998f != null && (aVar = c0998f.f3788e) != null) {
                aVar.mo817b(c0998f);
            }
            View view = (View) c1038a.f3731h;
            if (view != null && view.getWindowToken() != null) {
                e eVar = this.f4102a;
                if (eVar.m2344b()) {
                    c1038a.f4095s = eVar;
                } else if (eVar.f3845e != null) {
                    eVar.m2346d(0, 0, false, false);
                    c1038a.f4095s = eVar;
                }
            }
            c1038a.f4097u = null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$d */
    public class d extends C0547e1 implements ActionMenuView.InterfaceC1013a {

        /* JADX INFO: renamed from: androidx.appcompat.widget.a$d$a */
        public class a extends AbstractViewOnTouchListenerC0386V6 {
            public a(d dVar) {
                super(dVar);
            }

            @Override // p000a.AbstractViewOnTouchListenerC0386V6
            /* JADX INFO: renamed from: b */
            public final InterfaceC0541de mo1016b() {
                e eVar = C1038a.this.f4095s;
                if (eVar == null) {
                    return null;
                }
                return eVar.m2343a();
            }

            @Override // p000a.AbstractViewOnTouchListenerC0386V6
            /* JADX INFO: renamed from: c */
            public final boolean mo1017c() {
                C1038a.this.m2400l();
                return true;
            }

            @Override // p000a.AbstractViewOnTouchListenerC0386V6
            /* JADX INFO: renamed from: d */
            public final boolean mo1018d() {
                C1038a c1038a = C1038a.this;
                if (c1038a.f4097u != null) {
                    return false;
                }
                c1038a.m2398f();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, C0983R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0922xf.m2208a(this, getContentDescription());
            setOnTouchListener(new a(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC1013a
        /* JADX INFO: renamed from: a */
        public final boolean mo2299a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC1013a
        /* JADX INFO: renamed from: c */
        public final boolean mo2301c() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C1038a.this.m2400l();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0893w5.a.m2174f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$e */
    public class e extends C1001i {
        public e(Context context, C0998f c0998f, View view) {
            super(C0983R.attr.actionOverflowMenuStyle, context, view, c0998f, true);
            this.f3846f = 8388613;
            f fVar = C1038a.this.f4099w;
            this.f3848h = fVar;
            AbstractC0557eb abstractC0557eb = this.f3849i;
            if (abstractC0557eb != null) {
                abstractC0557eb.mo2309h(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.C1001i
        /* JADX INFO: renamed from: c */
        public final void mo2345c() {
            C1038a c1038a = C1038a.this;
            C0998f c0998f = c1038a.f3726c;
            if (c0998f != null) {
                c0998f.m2318c(true);
            }
            c1038a.f4095s = null;
            super.mo2345c();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$f */
    public class f implements InterfaceC1002j.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1002j.a
        /* JADX INFO: renamed from: a */
        public final void mo818a(C0998f c0998f, boolean z) {
            if (c0998f instanceof SubMenuC1005m) {
                ((SubMenuC1005m) c0998f).f3876z.mo2326k().m2318c(false);
            }
            InterfaceC1002j.a aVar = C1038a.this.f3728e;
            if (aVar != null) {
                aVar.mo818a(c0998f, z);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1002j.a
        /* JADX INFO: renamed from: b */
        public final boolean mo819b(C0998f c0998f) {
            C1038a c1038a = C1038a.this;
            if (c0998f == c1038a.f3726c) {
                return false;
            }
            ((SubMenuC1005m) c0998f).f3875A.getClass();
            c1038a.getClass();
            InterfaceC1002j.a aVar = c1038a.f3728e;
            if (aVar != null) {
                return aVar.mo819b(c0998f);
            }
            return false;
        }
    }

    public C1038a(Context context) {
        int i = C0983R.layout.abc_action_menu_layout;
        int i2 = C0983R.layout.abc_action_menu_item_layout;
        this.f3724a = context;
        this.f3727d = LayoutInflater.from(context);
        this.f3729f = i;
        this.f3730g = i2;
        this.f4094r = new SparseBooleanArray();
        this.f4099w = new f();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: a */
    public final void mo2306a(C0998f c0998f, boolean z) {
        m2398f();
        a aVar = this.f4096t;
        if (aVar != null && aVar.m2344b()) {
            aVar.f3849i.dismiss();
        }
        InterfaceC1002j.a aVar2 = this.f3728e;
        if (aVar2 != null) {
            aVar2.mo818a(c0998f, z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final View m2397b(C1000h c1000h, View view, ViewGroup viewGroup) {
        View actionView = c1000h.getActionView();
        if (actionView == null || c1000h.m2341e()) {
            InterfaceC1003k.a aVar = view instanceof InterfaceC1003k.a ? (InterfaceC1003k.a) view : (InterfaceC1003k.a) this.f3727d.inflate(this.f3730g, viewGroup, false);
            aVar.mo2300b(c1000h);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f3731h);
            if (this.f4098v == null) {
                this.f4098v = new b();
            }
            actionMenuItemView.setPopupCallback(this.f4098v);
            actionView = (View) aVar;
        }
        actionView.setVisibility(c1000h.f3813C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof ActionMenuView.C1015c)) {
            actionView.setLayoutParams(ActionMenuView.m2356m(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: d */
    public final boolean mo2307d() {
        int size;
        ArrayList<C1000h> arrayListM2327l;
        int i;
        boolean z;
        C1038a c1038a = this;
        C0998f c0998f = c1038a.f3726c;
        if (c0998f != null) {
            arrayListM2327l = c0998f.m2327l();
            size = arrayListM2327l.size();
        } else {
            size = 0;
            arrayListM2327l = null;
        }
        int i2 = c1038a.f4092p;
        int i3 = c1038a.f4091o;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c1038a.f3731h;
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
            C1000h c1000h = arrayListM2327l.get(i4);
            int i7 = c1000h.f3838y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (c1038a.f4093q && c1000h.f3813C) {
                i2 = 0;
            }
            i4++;
        }
        if (c1038a.f4088l && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = c1038a.f4094r;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            C1000h c1000h2 = arrayListM2327l.get(i9);
            int i11 = c1000h2.f3838y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = c1000h2.f3815b;
            if (z3) {
                View viewM2397b = c1038a.m2397b(c1000h2, null, viewGroup);
                viewM2397b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM2397b.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                c1000h2.m2342f(z);
            } else if ((i11 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i12);
                boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                if (z5) {
                    View viewM2397b2 = c1038a.m2397b(c1000h2, null, viewGroup);
                    viewM2397b2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewM2397b2.getMeasuredWidth();
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
                        C1000h c1000h3 = arrayListM2327l.get(i13);
                        if (c1000h3.f3815b == i12) {
                            if ((c1000h3.f3837x & 32) == 32) {
                                i8++;
                            }
                            c1000h3.m2342f(false);
                        }
                    }
                }
                if (z5) {
                    i8--;
                }
                c1000h2.m2342f(z5);
            } else {
                c1000h2.m2342f(false);
                i9++;
                i = 2;
                c1038a = this;
                z = true;
            }
            i9++;
            i = 2;
            c1038a = this;
            z = true;
        }
        return z;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: e */
    public final void mo1397e(Context context, C0998f c0998f) {
        this.f3725b = context;
        LayoutInflater.from(context);
        this.f3726c = c0998f;
        Resources resources = context.getResources();
        if (!this.f4089m) {
            this.f4088l = true;
        }
        int i = 2;
        this.f4090n = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f4092p = i;
        int measuredWidth = this.f4090n;
        if (this.f4088l) {
            if (this.f4085i == null) {
                d dVar = new d(this.f3724a);
                this.f4085i = dVar;
                if (this.f4087k) {
                    dVar.setImageDrawable(this.f4086j);
                    this.f4086j = null;
                    this.f4087k = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f4085i.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f4085i.getMeasuredWidth();
        } else {
            this.f4085i = null;
        }
        this.f4091o = measuredWidth;
        float f2 = resources.getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2398f() {
        Object obj;
        c cVar = this.f4097u;
        if (cVar != null && (obj = this.f3731h) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f4097u = null;
            return true;
        }
        e eVar = this.f4095s;
        if (eVar == null) {
            return false;
        }
        if (eVar.m2344b()) {
            eVar.f3849i.dismiss();
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: g */
    public final void mo2308g() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f3731h;
        ArrayList<C1000h> arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            C0998f c0998f = this.f3726c;
            if (c0998f != null) {
                c0998f.m2324i();
                ArrayList<C1000h> arrayListM2327l = this.f3726c.m2327l();
                int size = arrayListM2327l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C1000h c1000h = arrayListM2327l.get(i2);
                    if ((c1000h.f3837x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        C1000h itemData = childAt instanceof InterfaceC1003k.a ? ((InterfaceC1003k.a) childAt).getItemData() : null;
                        View viewM2397b = m2397b(c1000h, childAt, viewGroup);
                        if (c1000h != itemData) {
                            viewM2397b.setPressed(false);
                            viewM2397b.jumpDrawablesToCurrentState();
                        }
                        if (viewM2397b != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM2397b.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM2397b);
                            }
                            ((ViewGroup) this.f3731h).addView(viewM2397b, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f4085i) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f3731h).requestLayout();
        C0998f c0998f2 = this.f3726c;
        if (c0998f2 != null) {
            c0998f2.m2324i();
            ArrayList<C1000h> arrayList2 = c0998f2.f3792i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractC0290Q abstractC0290Q = arrayList2.get(i3).f3811A;
            }
        }
        C0998f c0998f3 = this.f3726c;
        if (c0998f3 != null) {
            c0998f3.m2324i();
            arrayList = c0998f3.f3793j;
        }
        if (this.f4088l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !arrayList.get(0).f3813C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        if (z) {
            if (this.f4085i == null) {
                this.f4085i = new d(this.f3724a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f4085i.getParent();
            if (viewGroup3 != this.f3731h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f4085i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f3731h;
                d dVar = this.f4085i;
                actionMenuView.getClass();
                ActionMenuView.C1015c c1015cM2355l = ActionMenuView.m2355l();
                c1015cM2355l.f3946a = true;
                actionMenuView.addView(dVar, c1015cM2355l);
            }
        } else {
            d dVar2 = this.f4085i;
            if (dVar2 != null) {
                Object parent = dVar2.getParent();
                Object obj = this.f3731h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f4085i);
                }
            }
        }
        ((ActionMenuView) this.f3731h).setOverflowReserved(this.f4088l);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x003a */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: androidx.appcompat.view.menu.k */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: j */
    public final boolean mo2310j(SubMenuC1005m subMenuC1005m) {
        boolean z;
        if (subMenuC1005m.hasVisibleItems()) {
            SubMenuC1005m subMenuC1005m2 = subMenuC1005m;
            while (true) {
                C0998f c0998f = subMenuC1005m2.f3876z;
                if (c0998f == this.f3726c) {
                    break;
                }
                subMenuC1005m2 = (SubMenuC1005m) c0998f;
            }
            ViewGroup viewGroup = (ViewGroup) this.f3731h;
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
                    if ((childAt instanceof InterfaceC1003k.a) && ((InterfaceC1003k.a) childAt).getItemData() == subMenuC1005m2.f3875A) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                subMenuC1005m.f3875A.getClass();
                int size = subMenuC1005m.f3789f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = subMenuC1005m.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                a aVar = new a(this.f3725b, subMenuC1005m, view);
                this.f4096t = aVar;
                aVar.f3847g = z;
                AbstractC0557eb abstractC0557eb = aVar.f3849i;
                if (abstractC0557eb != null) {
                    abstractC0557eb.mo1401o(z);
                }
                a aVar2 = this.f4096t;
                if (!aVar2.m2344b()) {
                    if (aVar2.f3845e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    aVar2.m2346d(0, 0, false, false);
                }
                InterfaceC1002j.a aVar3 = this.f3728e;
                if (aVar3 != null) {
                    aVar3.mo819b(subMenuC1005m);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2399k() {
        e eVar = this.f4095s;
        return eVar != null && eVar.m2344b();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2400l() {
        C0998f c0998f;
        if (!this.f4088l || m2399k() || (c0998f = this.f3726c) == null || this.f3731h == null || this.f4097u != null) {
            return false;
        }
        c0998f.m2324i();
        if (c0998f.f3793j.isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f3725b, this.f3726c, this.f4085i));
        this.f4097u = cVar;
        ((View) this.f3731h).post(cVar);
        return true;
    }
}
