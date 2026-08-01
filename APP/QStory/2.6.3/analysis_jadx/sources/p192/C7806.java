package p192;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import p190.MenuC7778;

/* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7806 extends ActionMode {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC7810 f21276;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f21277;

    public C7806(Context context, AbstractC7810 abstractC7810) {
        this.f21277 = context;
        this.f21276 = abstractC7810;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f21276.mo411();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f21276.mo410();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC7778(this.f21277, this.f21276.mo409());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f21276.mo408();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f21276.mo407();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f21276.f21291;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f21276.mo406();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f21276.f21290;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f21276.mo416();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f21276.mo415();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f21276.mo419(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f21276.mo418(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f21276.f21291 = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f21276.mo413(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f21276.mo414(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f21276.mo417(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f21276.mo412(i);
    }
}
