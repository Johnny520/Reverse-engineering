package p066g;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import p068h.MenuC0578C;

/* JADX INFO: renamed from: g.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0566f extends ActionMode {

    /* JADX INFO: renamed from: a */
    public final Context f1888a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0561a f1889b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0566f(Context context, AbstractC0561a abstractC0561a) {
        this.f1888a = context;
        this.f1889b = abstractC0561a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionMode
    public final void finish() {
        this.f1889b.mo1048a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f1889b.mo1049b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0578C(this.f1888a, this.f1889b.mo1050c());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f1889b.mo1051d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f1889b.mo1052e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f1889b.f1874b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f1889b.mo1053h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f1889b.f1875c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f1889b.mo1054i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f1889b.mo1055j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f1889b.mo1056k(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f1889b.mo1058m(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f1889b.f1874b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f1889b.mo1060o(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f1889b.mo1061p(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ActionMode
    public final void setSubtitle(int i2) {
        this.f1889b.mo1057l(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ActionMode
    public final void setTitle(int i2) {
        this.f1889b.mo1059n(i2);
    }
}
