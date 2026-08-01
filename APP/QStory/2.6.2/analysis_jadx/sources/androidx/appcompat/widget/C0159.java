package androidx.appcompat.widget;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import p190.C7790;
import p190.C7799;
import p190.InterfaceC7789;
import p190.MenuC7801;
import p190.SubMenuC7774;
import p192.InterfaceC7808;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0159 implements InterfaceC7789 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C7799 f643;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Toolbar f644;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public MenuC7801 f645;

    public C0159(Toolbar toolbar) {
        this.f644 = toolbar;
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo608() {
        return false;
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo609(C7799 c7799) {
        Toolbar toolbar = this.f644;
        KeyEvent.Callback callback = toolbar.f506;
        if (callback instanceof InterfaceC7808) {
            ((C7790) ((InterfaceC7808) callback)).f21200.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f506);
        toolbar.removeView(toolbar.f505);
        toolbar.f506 = null;
        ArrayList arrayList = toolbar.f483;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f643 = null;
        toolbar.requestLayout();
        c7799.f21219 = false;
        c7799.f21228.m13136(false);
        toolbar.m501();
        return true;
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo610(Context context, MenuC7801 menuC7801) {
        C7799 c7799;
        MenuC7801 menuC78012 = this.f645;
        if (menuC78012 != null && (c7799 = this.f643) != null) {
            menuC78012.mo13099(c7799);
        }
        this.f645 = menuC7801;
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo611(SubMenuC7774 subMenuC7774) {
        return false;
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo613() {
        if (this.f643 != null) {
            MenuC7801 menuC7801 = this.f645;
            if (menuC7801 != null) {
                int size = menuC7801.f21268.size();
                for (int i = 0; i < size; i++) {
                    if (this.f645.getItem(i) == this.f643) {
                        return;
                    }
                }
            }
            mo609(this.f643);
        }
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean mo614(C7799 c7799) {
        Toolbar toolbar = this.f644;
        toolbar.m495();
        ViewParent parent = toolbar.f505.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f505);
            }
            toolbar.addView(toolbar.f505);
        }
        View actionView = c7799.getActionView();
        toolbar.f506 = actionView;
        this.f643 = c7799;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f506);
            }
            C0160 c0160M488 = Toolbar.m488();
            c0160M488.f647 = (toolbar.f492 & 112) | 8388611;
            c0160M488.f646 = 2;
            toolbar.f506.setLayoutParams(c0160M488);
            toolbar.addView(toolbar.f506);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C0160) childAt.getLayoutParams()).f646 != 2 && childAt != toolbar.f511) {
                toolbar.removeViewAt(childCount);
                toolbar.f483.add(childAt);
            }
        }
        toolbar.requestLayout();
        c7799.f21219 = true;
        c7799.f21228.m13136(false);
        KeyEvent.Callback callback = toolbar.f506;
        if (callback instanceof InterfaceC7808) {
            ((C7790) ((InterfaceC7808) callback)).f21200.onActionViewExpanded();
        }
        toolbar.m501();
        return true;
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo612(MenuC7801 menuC7801, boolean z) {
    }
}
