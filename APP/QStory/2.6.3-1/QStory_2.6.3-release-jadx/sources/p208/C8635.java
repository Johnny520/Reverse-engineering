package p208;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import p206.MenuC8607;

/* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8635 extends ActionMode {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC8639 f21621;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f21622;

    public C8635(Context context, AbstractC8639 abstractC8639) {
        this.f21622 = context;
        this.f21621 = abstractC8639;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f21621.mo971();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f21621.mo970();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC8607(this.f21622, this.f21621.mo969());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f21621.mo968();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f21621.mo967();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f21621.f21636;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f21621.mo966();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f21621.f21635;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f21621.mo976();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f21621.mo975();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f21621.mo979(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f21621.mo978(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f21621.f21636 = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f21621.mo973(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f21621.mo974(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f21621.mo977(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f21621.mo972(i);
    }
}
