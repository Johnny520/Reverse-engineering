package yyds;

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
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛶᛴᛲᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1313 implements InterfaceC0613 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public boolean f6000;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public boolean f6002;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public MenuC0836 f6004;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public C1568 f6005;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public boolean f6007;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public int f6008;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public RunnableC2660 f6009;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public int f6010;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public InterfaceC2407 f6011;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public C0640 f6012;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public C0640 f6013;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public C0977 f6014;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public Drawable f6015;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public InterfaceC0665 f6016;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public boolean f6017;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Context f6018;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public int f6019;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final LayoutInflater f6020;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Context f6021;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final int f6001 = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final int f6003 = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final SparseBooleanArray f6006 = new SparseBooleanArray();

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public final C0052 f6022 = new C0052(2, this);

    public C1313(Context context) {
        this.f6018 = context;
        this.f6020 = LayoutInflater.from(context);
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final boolean mo1501() {
        int size;
        ArrayList arrayListM1911;
        int i;
        boolean z;
        C1313 c1313 = this;
        MenuC0836 menuC0836 = c1313.f6004;
        if (menuC0836 != null) {
            arrayListM1911 = menuC0836.m1911();
            size = arrayListM1911.size();
        } else {
            size = 0;
            arrayListM1911 = null;
        }
        int i2 = c1313.f6008;
        int i3 = c1313.f6010;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c1313.f6016;
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
            C1148 c1148 = (C1148) arrayListM1911.get(i4);
            int i7 = c1148.f5255;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (c1313.f6017 && c1148.f5273) {
                i2 = 0;
            }
            i4++;
        }
        if (c1313.f6000 && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = c1313.f6006;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            C1148 c11482 = (C1148) arrayListM1911.get(i9);
            int i11 = c11482.f5255;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = c11482.f5278;
            if (z3) {
                View viewM2602 = c1313.m2602(c11482, null, viewGroup);
                viewM2602.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM2602.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                c11482.m2338(z);
            } else if ((i11 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i12);
                boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                if (z5) {
                    View viewM26022 = c1313.m2602(c11482, null, viewGroup);
                    viewM26022.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewM26022.getMeasuredWidth();
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
                        C1148 c11483 = (C1148) arrayListM1911.get(i13);
                        if (c11483.f5278 == i12) {
                            if ((c11483.f5262 & 32) == 32) {
                                i8++;
                            }
                            c11483.m2338(false);
                        }
                    }
                }
                if (z5) {
                    i8--;
                }
                c11482.m2338(z5);
            } else {
                c11482.m2338(false);
                i9++;
                i = 2;
                c1313 = this;
                z = true;
            }
            i9++;
            i = 2;
            c1313 = this;
            z = true;
        }
        return z;
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final boolean mo1502(C1148 c1148) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo1503() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f6016;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            MenuC0836 menuC0836 = this.f6004;
            if (menuC0836 != null) {
                menuC0836.m1898();
                ArrayList arrayListM1911 = this.f6004.m1911();
                int size = arrayListM1911.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C1148 c1148 = (C1148) arrayListM1911.get(i2);
                    if ((c1148.f5262 & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        C1148 itemData = childAt instanceof InterfaceC2468 ? ((InterfaceC2468) childAt).getItemData() : null;
                        View viewM2602 = m2602(c1148, childAt, viewGroup);
                        if (c1148 != itemData) {
                            viewM2602.setPressed(false);
                            viewM2602.jumpDrawablesToCurrentState();
                        }
                        if (viewM2602 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM2602.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM2602);
                            }
                            ((ViewGroup) this.f6016).addView(viewM2602, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f6014) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f6016).requestLayout();
        MenuC0836 menuC08362 = this.f6004;
        if (menuC08362 != null) {
            menuC08362.m1898();
            ArrayList arrayList2 = menuC08362.f3837;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC2022 actionProviderVisibilityListenerC2022 = ((C1148) arrayList2.get(i3)).f5251;
            }
        }
        MenuC0836 menuC08363 = this.f6004;
        if (menuC08363 != null) {
            menuC08363.m1898();
            arrayList = menuC08363.f3838;
        }
        if (this.f6000 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((C1148) arrayList.get(0)).f5273;
            } else if (size3 > 0) {
                z = true;
            }
        }
        C0977 c0977 = this.f6014;
        if (z) {
            if (c0977 == null) {
                c0977 = new C0977(this, this.f6018);
                this.f6014 = c0977;
            }
            ViewGroup viewGroup3 = (ViewGroup) c0977.getParent();
            if (viewGroup3 != this.f6016) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f6014);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f6016;
                C0977 c09772 = this.f6014;
                actionMenuView.getClass();
                C1534 c1534M53 = ActionMenuView.m53();
                c1534M53.f7372 = true;
                actionMenuView.addView(c09772, c1534M53);
            }
        } else if (c0977 != null) {
            Object parent = c0977.getParent();
            Object obj = this.f6016;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f6014);
            }
        }
        ((ActionMenuView) this.f6016).setOverflowReserved(this.f6000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final View m2602(C1148 c1148, View view, ViewGroup viewGroup) {
        View actionView = c1148.getActionView();
        if (actionView == null || c1148.m2337()) {
            InterfaceC2468 interfaceC2468 = view instanceof InterfaceC2468 ? (InterfaceC2468) view : (InterfaceC2468) this.f6020.inflate(this.f6003, viewGroup, false);
            interfaceC2468.mo26(c1148);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC2468;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f6016);
            C1568 c1568 = this.f6005;
            if (c1568 == null) {
                c1568 = new C1568(this);
                this.f6005 = c1568;
            }
            actionMenuItemView.setPopupCallback(c1568);
            actionView = (View) interfaceC2468;
        }
        actionView.setVisibility(c1148.f5273 ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C1534)) {
            actionView.setLayoutParams(ActionMenuView.m54(layoutParams));
        }
        return actionView;
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1504(MenuC0836 menuC0836, boolean z) {
        m2605();
        C0640 c0640 = this.f6012;
        if (c0640 != null && c0640.m3361()) {
            c0640.f8390.dismiss();
        }
        InterfaceC2407 interfaceC2407 = this.f6011;
        if (interfaceC2407 != null) {
            interfaceC2407.mo391(menuC0836, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final boolean mo1505(SubMenuC1011 subMenuC1011) {
        boolean z;
        if (subMenuC1011.hasVisibleItems()) {
            SubMenuC1011 subMenuC10112 = subMenuC1011;
            while (true) {
                MenuC0836 menuC0836 = subMenuC10112.f4601;
                if (menuC0836 == this.f6004) {
                    break;
                }
                subMenuC10112 = (SubMenuC1011) menuC0836;
            }
            C1148 c1148 = subMenuC10112.f4600;
            ViewGroup viewGroup = (ViewGroup) this.f6016;
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
                    if ((childAt instanceof InterfaceC2468) && ((InterfaceC2468) childAt).getItemData() == c1148) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                int size = subMenuC1011.f3823.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = subMenuC1011.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                C0640 c0640 = new C0640(this, this.f6021, subMenuC1011, view);
                this.f6012 = c0640;
                c0640.f8394 = z;
                AbstractC2356 abstractC2356 = c0640.f8390;
                if (abstractC2356 != null) {
                    abstractC2356.mo1513(z);
                }
                C0640 c06402 = this.f6012;
                if (!c06402.m3361()) {
                    if (c06402.f8391 == null) {
                        C0188.m800("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    c06402.m3362(0, 0, false, false);
                }
                InterfaceC2407 interfaceC2407 = this.f6011;
                if (interfaceC2407 != null) {
                    interfaceC2407.mo404(subMenuC1011);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final boolean m2603() {
        C0640 c0640 = this.f6013;
        return c0640 != null && c0640.m3361();
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final boolean m2604() {
        MenuC0836 menuC0836;
        int i = 0;
        if (this.f6000 && !m2603() && (menuC0836 = this.f6004) != null && this.f6016 != null && this.f6009 == null) {
            menuC0836.m1898();
            if (!menuC0836.f3838.isEmpty()) {
                RunnableC2660 runnableC2660 = new RunnableC2660(this, i, new C0640(this, this.f6021, this.f6004, this.f6014));
                this.f6009 = runnableC2660;
                ((View) this.f6016).post(runnableC2660);
                return true;
            }
        }
        return false;
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final boolean mo1506(C1148 c1148) {
        return false;
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo1507(Context context, MenuC0836 menuC0836) {
        this.f6021 = context;
        LayoutInflater.from(context);
        this.f6004 = menuC0836;
        Resources resources = context.getResources();
        if (!this.f6007) {
            this.f6000 = true;
        }
        int i = 2;
        this.f6019 = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f6008 = i;
        int measuredWidth = this.f6019;
        if (this.f6000) {
            if (this.f6014 == null) {
                C0977 c0977 = new C0977(this, this.f6018);
                this.f6014 = c0977;
                if (this.f6002) {
                    c0977.setImageDrawable(this.f6015);
                    this.f6015 = null;
                    this.f6002 = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f6014.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f6014.getMeasuredWidth();
        } else {
            this.f6014 = null;
        }
        this.f6010 = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final boolean m2605() {
        Object obj;
        RunnableC2660 runnableC2660 = this.f6009;
        if (runnableC2660 != null && (obj = this.f6016) != null) {
            ((View) obj).removeCallbacks(runnableC2660);
            this.f6009 = null;
            return true;
        }
        C0640 c0640 = this.f6013;
        if (c0640 == null) {
            return false;
        }
        if (c0640.m3361()) {
            c0640.f8390.dismiss();
        }
        return true;
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo1508(InterfaceC2407 interfaceC2407) {
        throw null;
    }
}
