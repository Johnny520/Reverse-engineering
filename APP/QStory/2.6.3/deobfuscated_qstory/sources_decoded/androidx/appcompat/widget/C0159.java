package androidx.appcompat.widget;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import p190.C7791;
import p190.C7800;
import p190.InterfaceC7790;
import p190.MenuC7802;
import p190.SubMenuC7775;
import p192.InterfaceC7809;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0159 implements InterfaceC7790 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C7800 f643;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Toolbar f644;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public MenuC7802 f645;

    public C0159(Toolbar toolbar) {
        this.f644 = toolbar;
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo609() {
        return false;
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo610(C7800 c7800) {
        Toolbar toolbar = this.f644;
        KeyEvent.Callback callback = toolbar.f506;
        if (callback instanceof InterfaceC7809) {
            ((C7791) ((InterfaceC7809) callback)).f21197.onActionViewCollapsed();
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
        c7800.f21216 = false;
        c7800.f21225.m13164(false);
        toolbar.m502();
        return true;
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo611(Context context, MenuC7802 menuC7802) {
        C7800 c7800;
        MenuC7802 menuC78022 = this.f645;
        if (menuC78022 != null && (c7800 = this.f643) != null) {
            menuC78022.mo13127(c7800);
        }
        this.f645 = menuC7802;
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo612(SubMenuC7775 subMenuC7775) {
        return false;
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo614() {
        if (this.f643 != null) {
            MenuC7802 menuC7802 = this.f645;
            if (menuC7802 != null) {
                int size = menuC7802.f21265.size();
                for (int i = 0; i < size; i++) {
                    if (this.f645.getItem(i) == this.f643) {
                        return;
                    }
                }
            }
            mo610(this.f643);
        }
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean mo615(C7800 c7800) {
        Toolbar toolbar = this.f644;
        toolbar.m496();
        ViewParent parent = toolbar.f505.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f505);
            }
            toolbar.addView(toolbar.f505);
        }
        View actionView = c7800.getActionView();
        toolbar.f506 = actionView;
        this.f643 = c7800;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f506);
            }
            C0160 c0160M489 = Toolbar.m489();
            c0160M489.f647 = (toolbar.f492 & 112) | 8388611;
            c0160M489.f646 = 2;
            toolbar.f506.setLayoutParams(c0160M489);
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
        c7800.f21216 = true;
        c7800.f21225.m13164(false);
        KeyEvent.Callback callback = toolbar.f506;
        if (callback instanceof InterfaceC7809) {
            ((C7791) ((InterfaceC7809) callback)).f21197.onActionViewExpanded();
        }
        toolbar.m502();
        return true;
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo613(MenuC7802 menuC7802, boolean z) {
    }
}
