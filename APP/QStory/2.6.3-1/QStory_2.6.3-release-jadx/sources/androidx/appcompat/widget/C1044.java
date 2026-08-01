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
import androidx.appcompat.app.C0960;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.ArrayList;
import p206.AbstractC8623;
import p206.ActionProviderVisibilityListenerC8621;
import p206.C8629;
import p206.InterfaceC8616;
import p206.InterfaceC8617;
import p206.InterfaceC8618;
import p206.InterfaceC8619;
import p206.MenuC8631;
import p206.SubMenuC8604;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1044 implements InterfaceC8619 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C1054 f1120;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f1121;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public int f1122;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f1123;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f1124;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f1125;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public Drawable f1126;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public RunnableC1055 f1127;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C1050 f1128;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C1050 f1129;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f1131;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f1132;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC8618 f1133;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final LayoutInflater f1134;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public InterfaceC8617 f1135;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public C1053 f1136;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Context f1139;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public MenuC8631 f1140;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f1141;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f1137 = C0328R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f1138 = C0328R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final SparseBooleanArray f1130 = new SparseBooleanArray();

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C0960 f1119 = new C0960(this, 1);

    public C1044(Context context) {
        this.f1141 = context;
        this.f1134 = LayoutInflater.from(context);
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo1169() {
        int size;
        ArrayList arrayListM13726;
        int i;
        boolean z;
        C1044 c1044 = this;
        MenuC8631 menuC8631 = c1044.f1140;
        if (menuC8631 != null) {
            arrayListM13726 = menuC8631.m13726();
            size = arrayListM13726.size();
        } else {
            size = 0;
            arrayListM13726 = null;
        }
        int i2 = c1044.f1132;
        int i3 = c1044.f1121;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c1044.f1135;
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
            C8629 c8629 = (C8629) arrayListM13726.get(i4);
            int i7 = c8629.f21567;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (c1044.f1131 && c8629.f21561) {
                i2 = 0;
            }
            i4++;
        }
        if (c1044.f1124 && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = c1044.f1130;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            C8629 c86292 = (C8629) arrayListM13726.get(i9);
            int i11 = c86292.f21567;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = c86292.f21587;
            if (z3) {
                View viewM1260 = c1044.m1260(c86292, null, viewGroup);
                viewM1260.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM1260.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                c86292.m13710(z);
            } else if ((i11 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i12);
                boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                if (z5) {
                    View viewM12602 = c1044.m1260(c86292, null, viewGroup);
                    viewM12602.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewM12602.getMeasuredWidth();
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
                        C8629 c86293 = (C8629) arrayListM13726.get(i13);
                        if (c86293.f21587 == i12) {
                            if ((c86293.f21568 & 32) == 32) {
                                i8++;
                            }
                            c86293.m13710(false);
                        }
                    }
                }
                if (z5) {
                    i8--;
                }
                c86292.m13710(z5);
            } else {
                c86292.m13710(false);
                i9++;
                i = 2;
                c1044 = this;
                z = true;
            }
            i9++;
            i = 2;
            c1044 = this;
            z = true;
        }
        return z;
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo1170(C8629 c8629) {
        return false;
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1171(Context context, MenuC8631 menuC8631) {
        this.f1139 = context;
        LayoutInflater.from(context);
        this.f1140 = menuC8631;
        Resources resources = context.getResources();
        if (!this.f1123) {
            this.f1124 = true;
        }
        int i = 2;
        this.f1122 = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f1132 = i;
        int measuredWidth = this.f1122;
        if (this.f1124) {
            if (this.f1136 == null) {
                C1053 c1053 = new C1053(this, this.f1141);
                this.f1136 = c1053;
                if (this.f1125) {
                    c1053.setImageDrawable(this.f1126);
                    this.f1126 = null;
                    this.f1125 = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1136.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f1136.getMeasuredWidth();
        } else {
            this.f1136 = null;
        }
        this.f1121 = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo1172(SubMenuC8604 subMenuC8604) {
        boolean z;
        if (subMenuC8604.hasVisibleItems()) {
            SubMenuC8604 subMenuC86042 = subMenuC8604;
            while (true) {
                MenuC8631 menuC8631 = subMenuC86042.f21453;
                if (menuC8631 == this.f1140) {
                    break;
                }
                subMenuC86042 = (SubMenuC8604) menuC8631;
            }
            C8629 c8629 = subMenuC86042.f21454;
            ViewGroup viewGroup = (ViewGroup) this.f1135;
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
                    if ((childAt instanceof InterfaceC8616) && ((InterfaceC8616) childAt).getItemData() == c8629) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                subMenuC8604.f21454.getClass();
                int size = subMenuC8604.f21610.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = subMenuC8604.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                C1050 c1050 = new C1050(this, this.f1139, subMenuC8604, view);
                this.f1128 = c1050;
                c1050.f21535 = z;
                AbstractC8623 abstractC8623 = c1050.f21540;
                if (abstractC8623 != null) {
                    abstractC8623.mo13692(z);
                }
                C1050 c10502 = this.f1128;
                if (!c10502.m13704()) {
                    if (c10502.f21529 == null) {
                        C6755.m11870("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    c10502.m13703(0, 0, false, false);
                }
                InterfaceC8618 interfaceC8618 = this.f1133;
                if (interfaceC8618 != null) {
                    interfaceC8618.mo757(subMenuC8604);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo1173(MenuC8631 menuC8631, boolean z) {
        m1264();
        C1050 c1050 = this.f1128;
        if (c1050 != null && c1050.m13704()) {
            c1050.f21540.dismiss();
        }
        InterfaceC8618 interfaceC8618 = this.f1133;
        if (interfaceC8618 != null) {
            interfaceC8618.mo750(menuC8631, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View m1260(C8629 c8629, View view, ViewGroup viewGroup) {
        View actionView = c8629.getActionView();
        if (actionView == null || c8629.m13711()) {
            InterfaceC8616 interfaceC8616 = view instanceof InterfaceC8616 ? (InterfaceC8616) view : (InterfaceC8616) this.f1134.inflate(this.f1138, viewGroup, false);
            interfaceC8616.mo1014(c8629);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC8616;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f1135);
            if (this.f1120 == null) {
                this.f1120 = new C1054(this);
            }
            actionMenuItemView.setPopupCallback(this.f1120);
            actionView = (View) interfaceC8616;
        }
        actionView.setVisibility(c8629.f21561 ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C1046)) {
            actionView.setLayoutParams(ActionMenuView.m1042(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo1174() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f1135;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            MenuC8631 menuC8631 = this.f1140;
            if (menuC8631 != null) {
                menuC8631.m13727();
                ArrayList arrayListM13726 = this.f1140.m13726();
                int size = arrayListM13726.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C8629 c8629 = (C8629) arrayListM13726.get(i2);
                    if ((c8629.f21568 & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        C8629 itemData = childAt instanceof InterfaceC8616 ? ((InterfaceC8616) childAt).getItemData() : null;
                        View viewM1260 = m1260(c8629, childAt, viewGroup);
                        if (c8629 != itemData) {
                            viewM1260.setPressed(false);
                            viewM1260.jumpDrawablesToCurrentState();
                        }
                        if (viewM1260 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM1260.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM1260);
                            }
                            ((ViewGroup) this.f1135).addView(viewM1260, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f1136) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f1135).requestLayout();
        MenuC8631 menuC86312 = this.f1140;
        if (menuC86312 != null) {
            menuC86312.m13727();
            ArrayList arrayList2 = menuC86312.f21609;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC8621 actionProviderVisibilityListenerC8621 = ((C8629) arrayList2.get(i3)).f21564;
            }
        }
        MenuC8631 menuC86313 = this.f1140;
        if (menuC86313 != null) {
            menuC86313.m13727();
            arrayList = menuC86313.f21599;
        }
        if (this.f1124 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((C8629) arrayList.get(0)).f21561;
            } else if (size3 > 0) {
                z = true;
            }
        }
        C1053 c1053 = this.f1136;
        if (z) {
            if (c1053 == null) {
                this.f1136 = new C1053(this, this.f1141);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f1136.getParent();
            if (viewGroup3 != this.f1135) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f1136);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1135;
                C1053 c10532 = this.f1136;
                actionMenuView.getClass();
                C1046 c1046M1043 = ActionMenuView.m1043();
                c1046M1043.f1148 = true;
                actionMenuView.addView(c10532, c1046M1043);
            }
        } else if (c1053 != null) {
            Object parent = c1053.getParent();
            Object obj = this.f1135;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f1136);
            }
        }
        ((ActionMenuView) this.f1135).setOverflowReserved(this.f1124);
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo1261(InterfaceC8618 interfaceC8618) {
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m1262() {
        C1050 c1050 = this.f1129;
        return c1050 != null && c1050.m13704();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m1263() {
        MenuC8631 menuC8631;
        if (!this.f1124 || m1262() || (menuC8631 = this.f1140) == null || this.f1135 == null || this.f1127 != null) {
            return false;
        }
        menuC8631.m13727();
        if (menuC8631.f21599.isEmpty()) {
            return false;
        }
        RunnableC1055 runnableC1055 = new RunnableC1055(this, new C1050(this, this.f1139, this.f1140, this.f1136));
        this.f1127 = runnableC1055;
        ((View) this.f1135).post(runnableC1055);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m1264() {
        Object obj;
        RunnableC1055 runnableC1055 = this.f1127;
        if (runnableC1055 != null && (obj = this.f1135) != null) {
            ((View) obj).removeCallbacks(runnableC1055);
            this.f1127 = null;
            return true;
        }
        C1050 c1050 = this.f1129;
        if (c1050 == null) {
            return false;
        }
        if (c1050.m13704()) {
            c1050.f21540.dismiss();
        }
        return true;
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo1175(C8629 c8629) {
        return false;
    }
}
