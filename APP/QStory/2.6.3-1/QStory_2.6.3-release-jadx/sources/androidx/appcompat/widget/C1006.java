package androidx.appcompat.widget;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import p206.C8620;
import p206.C8629;
import p206.InterfaceC8619;
import p206.MenuC8631;
import p206.SubMenuC8604;
import p208.InterfaceC8638;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1006 implements InterfaceC8619 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C8629 f988;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Toolbar f989;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public MenuC8631 f990;

    public C1006(Toolbar toolbar) {
        this.f989 = toolbar;
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo1169() {
        return false;
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo1170(C8629 c8629) {
        Toolbar toolbar = this.f989;
        KeyEvent.Callback callback = toolbar.f851;
        if (callback instanceof InterfaceC8638) {
            ((C8620) ((InterfaceC8638) callback)).f21542.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f851);
        toolbar.removeView(toolbar.f850);
        toolbar.f851 = null;
        ArrayList arrayList = toolbar.f828;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f988 = null;
        toolbar.requestLayout();
        c8629.f21561 = false;
        c8629.f21570.m13723(false);
        toolbar.m1062();
        return true;
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo1171(Context context, MenuC8631 menuC8631) {
        C8629 c8629;
        MenuC8631 menuC86312 = this.f990;
        if (menuC86312 != null && (c8629 = this.f988) != null) {
            menuC86312.mo13686(c8629);
        }
        this.f990 = menuC8631;
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo1172(SubMenuC8604 subMenuC8604) {
        return false;
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo1174() {
        if (this.f988 != null) {
            MenuC8631 menuC8631 = this.f990;
            if (menuC8631 != null) {
                int size = menuC8631.f21610.size();
                for (int i = 0; i < size; i++) {
                    if (this.f990.getItem(i) == this.f988) {
                        return;
                    }
                }
            }
            mo1170(this.f988);
        }
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean mo1175(C8629 c8629) {
        Toolbar toolbar = this.f989;
        toolbar.m1056();
        ViewParent parent = toolbar.f850.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f850);
            }
            toolbar.addView(toolbar.f850);
        }
        View actionView = c8629.getActionView();
        toolbar.f851 = actionView;
        this.f988 = c8629;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f851);
            }
            C1007 c1007M1049 = Toolbar.m1049();
            c1007M1049.f992 = (toolbar.f837 & 112) | 8388611;
            c1007M1049.f991 = 2;
            toolbar.f851.setLayoutParams(c1007M1049);
            toolbar.addView(toolbar.f851);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C1007) childAt.getLayoutParams()).f991 != 2 && childAt != toolbar.f856) {
                toolbar.removeViewAt(childCount);
                toolbar.f828.add(childAt);
            }
        }
        toolbar.requestLayout();
        c8629.f21561 = true;
        c8629.f21570.m13723(false);
        KeyEvent.Callback callback = toolbar.f851;
        if (callback instanceof InterfaceC8638) {
            ((C8620) ((InterfaceC8638) callback)).f21542.onActionViewExpanded();
        }
        toolbar.m1062();
        return true;
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo1173(MenuC8631 menuC8631, boolean z) {
    }
}
