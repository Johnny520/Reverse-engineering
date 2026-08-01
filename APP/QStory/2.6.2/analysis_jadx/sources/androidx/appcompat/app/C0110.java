package androidx.appcompat.app;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0197;
import java.lang.ref.WeakReference;
import p190.InterfaceC7796;
import p190.MenuC7801;
import p192.AbstractC7809;
import p192.C7816;
import p192.InterfaceC7810;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0110 extends AbstractC7809 implements InterfaceC7796 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C0076 f324;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final MenuC7801 f325;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public WeakReference f326;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ C0111 f327;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Context f328;

    public C0110(C0111 c0111, Context context, C0076 c0076) {
        this.f327 = c0111;
        this.f328 = context;
        this.f324 = c0076;
        MenuC7801 menuC7801 = new MenuC7801(context);
        menuC7801.f21255 = 1;
        this.f325 = menuC7801;
        menuC7801.f21264 = this;
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final CharSequence mo405() {
        return this.f327.f331.getTitle();
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final CharSequence mo406() {
        return this.f327.f331.getSubtitle();
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final MenuInflater mo407() {
        return new C7816(this.f328);
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final MenuC7801 mo408() {
        return this.f325;
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final View mo409() {
        WeakReference weakReference = this.f326;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo410() {
        C0111 c0111 = this.f327;
        if (c0111.f353 != this) {
            return;
        }
        if (c0111.f348) {
            c0111.f354 = this;
            c0111.f351 = this.f324;
        } else {
            this.f324.mo278(this);
        }
        this.f324 = null;
        c0111.m422(false);
        ActionBarContextView actionBarContextView = c0111.f331;
        if (actionBarContextView.f402 == null) {
            actionBarContextView.m464();
        }
        c0111.f334.setHideOnContentScrollEnabled(c0111.f341);
        c0111.f353 = null;
    }

    @Override // p190.InterfaceC7796
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo203(MenuC7801 menuC7801) {
        if (this.f324 == null) {
            return;
        }
        mo415();
        C0197 c0197 = this.f327.f331.f410;
        if (c0197 != null) {
            c0197.m702();
        }
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo411(int i) {
        mo412(this.f327.f336.getResources().getString(i));
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void mo412(CharSequence charSequence) {
        this.f327.f331.setTitle(charSequence);
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void mo413(boolean z) {
        this.f21293 = z;
        this.f327.f331.setTitleOptional(z);
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean mo414() {
        return this.f327.f331.f405;
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo415() {
        if (this.f327.f353 != this) {
            return;
        }
        MenuC7801 menuC7801 = this.f325;
        menuC7801.m13131();
        try {
            this.f324.mo285(this, menuC7801);
        } finally {
            menuC7801.m13133();
        }
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo416(int i) {
        mo417(this.f327.f336.getResources().getString(i));
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void mo417(CharSequence charSequence) {
        this.f327.f331.setSubtitle(charSequence);
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo418(View view) {
        this.f327.f331.setCustomView(view);
        this.f326 = new WeakReference(view);
    }

    @Override // p190.InterfaceC7796
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo204(MenuC7801 menuC7801, MenuItem menuItem) {
        C0076 c0076 = this.f324;
        if (c0076 != null) {
            return ((InterfaceC7810) c0076.f227).mo297(this, menuItem);
        }
        return false;
    }
}
