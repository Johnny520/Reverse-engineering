package p192;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import p190.MenuC7777;

/* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7805 extends ActionMode {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC7809 f21279;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f21280;

    public C7805(Context context, AbstractC7809 abstractC7809) {
        this.f21280 = context;
        this.f21279 = abstractC7809;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f21279.mo410();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f21279.mo409();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC7777(this.f21280, this.f21279.mo408());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f21279.mo407();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f21279.mo406();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f21279.f21294;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f21279.mo405();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f21279.f21293;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f21279.mo415();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f21279.mo414();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f21279.mo418(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f21279.mo417(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f21279.f21294 = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f21279.mo412(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f21279.mo413(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f21279.mo416(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f21279.mo411(i);
    }
}
