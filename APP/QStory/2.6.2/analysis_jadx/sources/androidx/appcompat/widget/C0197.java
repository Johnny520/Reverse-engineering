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
import androidx.appcompat.app.C0113;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import p190.AbstractC7793;
import p190.ActionProviderVisibilityListenerC7791;
import p190.C7799;
import p190.InterfaceC7786;
import p190.InterfaceC7787;
import p190.InterfaceC7788;
import p190.InterfaceC7789;
import p190.MenuC7801;
import p190.SubMenuC7774;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0197 implements InterfaceC7789 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C0207 f775;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f776;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public int f777;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f778;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f779;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f780;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public Drawable f781;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public RunnableC0208 f782;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C0203 f783;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C0203 f784;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f786;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f787;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC7788 f788;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final LayoutInflater f789;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public InterfaceC7787 f790;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public C0206 f791;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Context f794;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public MenuC7801 f795;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f796;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f792 = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f793 = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final SparseBooleanArray f785 = new SparseBooleanArray();

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C0113 f774 = new C0113(this, 1);

    public C0197(Context context) {
        this.f796 = context;
        this.f789 = LayoutInflater.from(context);
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo608() {
        int size;
        ArrayList arrayListM13139;
        int i;
        boolean z;
        C0197 c0197 = this;
        MenuC7801 menuC7801 = c0197.f795;
        if (menuC7801 != null) {
            arrayListM13139 = menuC7801.m13139();
            size = arrayListM13139.size();
        } else {
            size = 0;
            arrayListM13139 = null;
        }
        int i2 = c0197.f787;
        int i3 = c0197.f776;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0197.f790;
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
            C7799 c7799 = (C7799) arrayListM13139.get(i4);
            int i7 = c7799.f21225;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (c0197.f786 && c7799.f21219) {
                i2 = 0;
            }
            i4++;
        }
        if (c0197.f779 && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = c0197.f785;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            C7799 c77992 = (C7799) arrayListM13139.get(i9);
            int i11 = c77992.f21225;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = c77992.f21245;
            if (z3) {
                View viewM699 = c0197.m699(c77992, null, viewGroup);
                viewM699.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM699.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                c77992.m13123(z);
            } else if ((i11 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i12);
                boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                if (z5) {
                    View viewM6992 = c0197.m699(c77992, null, viewGroup);
                    viewM6992.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewM6992.getMeasuredWidth();
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
                        C7799 c77993 = (C7799) arrayListM13139.get(i13);
                        if (c77993.f21245 == i12) {
                            if ((c77993.f21226 & 32) == 32) {
                                i8++;
                            }
                            c77993.m13123(false);
                        }
                    }
                }
                if (z5) {
                    i8--;
                }
                c77992.m13123(z5);
            } else {
                c77992.m13123(false);
                i9++;
                i = 2;
                c0197 = this;
                z = true;
            }
            i9++;
            i = 2;
            c0197 = this;
            z = true;
        }
        return z;
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo609(C7799 c7799) {
        return false;
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo610(Context context, MenuC7801 menuC7801) {
        this.f794 = context;
        LayoutInflater.from(context);
        this.f795 = menuC7801;
        Resources resources = context.getResources();
        if (!this.f778) {
            this.f779 = true;
        }
        int i = 2;
        this.f777 = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f787 = i;
        int measuredWidth = this.f777;
        if (this.f779) {
            if (this.f791 == null) {
                C0206 c0206 = new C0206(this, this.f796);
                this.f791 = c0206;
                if (this.f780) {
                    c0206.setImageDrawable(this.f781);
                    this.f781 = null;
                    this.f780 = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f791.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f791.getMeasuredWidth();
        } else {
            this.f791 = null;
        }
        this.f776 = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo611(SubMenuC7774 subMenuC7774) {
        boolean z;
        if (subMenuC7774.hasVisibleItems()) {
            SubMenuC7774 subMenuC77742 = subMenuC7774;
            while (true) {
                MenuC7801 menuC7801 = subMenuC77742.f21111;
                if (menuC7801 == this.f795) {
                    break;
                }
                subMenuC77742 = (SubMenuC7774) menuC7801;
            }
            C7799 c7799 = subMenuC77742.f21112;
            ViewGroup viewGroup = (ViewGroup) this.f790;
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
                    if ((childAt instanceof InterfaceC7786) && ((InterfaceC7786) childAt).getItemData() == c7799) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                subMenuC7774.f21112.getClass();
                int size = subMenuC7774.f21268.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = subMenuC7774.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                C0203 c0203 = new C0203(this, this.f794, subMenuC7774, view);
                this.f783 = c0203;
                c0203.f21193 = z;
                AbstractC7793 abstractC7793 = c0203.f21198;
                if (abstractC7793 != null) {
                    abstractC7793.mo13105(z);
                }
                C0203 c02032 = this.f783;
                if (!c02032.m13117()) {
                    if (c02032.f21187 == null) {
                        C5919.m11250("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    c02032.m13116(0, 0, false, false);
                }
                InterfaceC7788 interfaceC7788 = this.f788;
                if (interfaceC7788 != null) {
                    interfaceC7788.mo196(subMenuC7774);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo612(MenuC7801 menuC7801, boolean z) {
        m703();
        C0203 c0203 = this.f783;
        if (c0203 != null && c0203.m13117()) {
            c0203.f21198.dismiss();
        }
        InterfaceC7788 interfaceC7788 = this.f788;
        if (interfaceC7788 != null) {
            interfaceC7788.mo189(menuC7801, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View m699(C7799 c7799, View view, ViewGroup viewGroup) {
        View actionView = c7799.getActionView();
        if (actionView == null || c7799.m13124()) {
            InterfaceC7786 interfaceC7786 = view instanceof InterfaceC7786 ? (InterfaceC7786) view : (InterfaceC7786) this.f789.inflate(this.f793, viewGroup, false);
            interfaceC7786.mo453(c7799);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC7786;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f790);
            if (this.f775 == null) {
                this.f775 = new C0207(this);
            }
            actionMenuItemView.setPopupCallback(this.f775);
            actionView = (View) interfaceC7786;
        }
        actionView.setVisibility(c7799.f21219 ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0199)) {
            actionView.setLayoutParams(ActionMenuView.m481(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo613() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f790;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            MenuC7801 menuC7801 = this.f795;
            if (menuC7801 != null) {
                menuC7801.m13140();
                ArrayList arrayListM13139 = this.f795.m13139();
                int size = arrayListM13139.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C7799 c7799 = (C7799) arrayListM13139.get(i2);
                    if ((c7799.f21226 & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        C7799 itemData = childAt instanceof InterfaceC7786 ? ((InterfaceC7786) childAt).getItemData() : null;
                        View viewM699 = m699(c7799, childAt, viewGroup);
                        if (c7799 != itemData) {
                            viewM699.setPressed(false);
                            viewM699.jumpDrawablesToCurrentState();
                        }
                        if (viewM699 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM699.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM699);
                            }
                            ((ViewGroup) this.f790).addView(viewM699, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f791) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f790).requestLayout();
        MenuC7801 menuC78012 = this.f795;
        if (menuC78012 != null) {
            menuC78012.m13140();
            ArrayList arrayList2 = menuC78012.f21267;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC7791 actionProviderVisibilityListenerC7791 = ((C7799) arrayList2.get(i3)).f21222;
            }
        }
        MenuC7801 menuC78013 = this.f795;
        if (menuC78013 != null) {
            menuC78013.m13140();
            arrayList = menuC78013.f21257;
        }
        if (this.f779 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((C7799) arrayList.get(0)).f21219;
            } else if (size3 > 0) {
                z = true;
            }
        }
        C0206 c0206 = this.f791;
        if (z) {
            if (c0206 == null) {
                this.f791 = new C0206(this, this.f796);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f791.getParent();
            if (viewGroup3 != this.f790) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f791);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f790;
                C0206 c02062 = this.f791;
                actionMenuView.getClass();
                C0199 c0199M482 = ActionMenuView.m482();
                c0199M482.f803 = true;
                actionMenuView.addView(c02062, c0199M482);
            }
        } else if (c0206 != null) {
            Object parent = c0206.getParent();
            Object obj = this.f790;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f791);
            }
        }
        ((ActionMenuView) this.f790).setOverflowReserved(this.f779);
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo700(InterfaceC7788 interfaceC7788) {
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m701() {
        C0203 c0203 = this.f784;
        return c0203 != null && c0203.m13117();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m702() {
        MenuC7801 menuC7801;
        if (!this.f779 || m701() || (menuC7801 = this.f795) == null || this.f790 == null || this.f782 != null) {
            return false;
        }
        menuC7801.m13140();
        if (menuC7801.f21257.isEmpty()) {
            return false;
        }
        RunnableC0208 runnableC0208 = new RunnableC0208(this, new C0203(this, this.f794, this.f795, this.f791));
        this.f782 = runnableC0208;
        ((View) this.f790).post(runnableC0208);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m703() {
        Object obj;
        RunnableC0208 runnableC0208 = this.f782;
        if (runnableC0208 != null && (obj = this.f790) != null) {
            ((View) obj).removeCallbacks(runnableC0208);
            this.f782 = null;
            return true;
        }
        C0203 c0203 = this.f784;
        if (c0203 == null) {
            return false;
        }
        if (c0203.m13117()) {
            c0203.f21198.dismiss();
        }
        return true;
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo614(C7799 c7799) {
        return false;
    }
}
