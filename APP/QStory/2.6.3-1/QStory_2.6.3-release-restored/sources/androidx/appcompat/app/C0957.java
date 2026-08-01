package androidx.appcompat.app;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C1044;
import java.lang.ref.WeakReference;
import p206.InterfaceC8626;
import p206.MenuC8631;
import p208.AbstractC8639;
import p208.C8646;
import p208.InterfaceC8640;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0957 extends AbstractC8639 implements InterfaceC8626 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C0923 f669;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final MenuC8631 f670;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public WeakReference f671;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ C0958 f672;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Context f673;

    public C0957(C0958 c0958, Context context, C0923 c0923) {
        this.f672 = c0958;
        this.f673 = context;
        this.f669 = c0923;
        MenuC8631 menuC8631 = new MenuC8631(context);
        menuC8631.f21597 = 1;
        this.f670 = menuC8631;
        menuC8631.f21606 = this;
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final CharSequence mo966() {
        return this.f672.f676.getTitle();
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final CharSequence mo967() {
        return this.f672.f676.getSubtitle();
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final MenuInflater mo968() {
        return new C8646(this.f673);
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final MenuC8631 mo969() {
        return this.f670;
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final View mo970() {
        WeakReference weakReference = this.f671;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo971() {
        C0958 c0958 = this.f672;
        if (c0958.f698 != this) {
            return;
        }
        if (c0958.f693) {
            c0958.f699 = this;
            c0958.f696 = this.f669;
        } else {
            this.f669.mo839(this);
        }
        this.f669 = null;
        c0958.m983(false);
        ActionBarContextView actionBarContextView = c0958.f676;
        if (actionBarContextView.f747 == null) {
            actionBarContextView.m1025();
        }
        c0958.f679.setHideOnContentScrollEnabled(c0958.f686);
        c0958.f698 = null;
    }

    @Override // p206.InterfaceC8626
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo764(MenuC8631 menuC8631) {
        if (this.f669 == null) {
            return;
        }
        mo976();
        C1044 c1044 = this.f672.f676.f755;
        if (c1044 != null) {
            c1044.m1263();
        }
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo972(int i) {
        mo973(this.f672.f681.getResources().getString(i));
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void mo973(CharSequence charSequence) {
        this.f672.f676.setTitle(charSequence);
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void mo974(boolean z) {
        this.f21635 = z;
        this.f672.f676.setTitleOptional(z);
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean mo975() {
        return this.f672.f676.f750;
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo976() {
        if (this.f672.f698 != this) {
            return;
        }
        MenuC8631 menuC8631 = this.f670;
        menuC8631.m13718();
        try {
            this.f669.mo846(this, menuC8631);
        } finally {
            menuC8631.m13720();
        }
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo977(int i) {
        mo978(this.f672.f681.getResources().getString(i));
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void mo978(CharSequence charSequence) {
        this.f672.f676.setSubtitle(charSequence);
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo979(View view) {
        this.f672.f676.setCustomView(view);
        this.f671 = new WeakReference(view);
    }

    @Override // p206.InterfaceC8626
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo765(MenuC8631 menuC8631, MenuItem menuItem) {
        C0923 c0923 = this.f669;
        if (c0923 != null) {
            return ((InterfaceC8640) c0923.f572).mo858(this, menuItem);
        }
        return false;
    }
}
