package p000a;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0998f;
import java.util.ArrayList;
import p000a.AbstractC0272P;

/* JADX INFO: renamed from: a.Ge */
/* JADX INFO: loaded from: classes.dex */
public final class C0125Ge extends ActionMode {

    /* JADX INFO: renamed from: a */
    public final Context f418a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0272P f419b;

    /* JADX INFO: renamed from: a.Ge$a */
    public static class a implements AbstractC0272P.a {

        /* JADX INFO: renamed from: a */
        public final ActionMode.Callback f420a;

        /* JADX INFO: renamed from: b */
        public final Context f421b;

        /* JADX INFO: renamed from: c */
        public final ArrayList<C0125Ge> f422c = new ArrayList<>();

        /* JADX INFO: renamed from: d */
        public final C0598ge<Menu, Menu> f423d = new C0598ge<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f421b = context;
            this.f420a = callback;
        }

        @Override // p000a.AbstractC0272P.a
        /* JADX INFO: renamed from: a */
        public final boolean mo329a(AbstractC0272P abstractC0272P, C0998f c0998f) {
            C0125Ge c0125GeM333e = m333e(abstractC0272P);
            C0598ge<Menu, Menu> c0598ge = this.f423d;
            Menu orDefault = c0598ge.getOrDefault(c0998f, null);
            if (orDefault == null) {
                orDefault = new MenuC0614hb(this.f421b, c0998f);
                c0598ge.put(c0998f, orDefault);
            }
            return this.f420a.onCreateActionMode(c0125GeM333e, orDefault);
        }

        @Override // p000a.AbstractC0272P.a
        /* JADX INFO: renamed from: b */
        public final void mo330b(AbstractC0272P abstractC0272P) {
            this.f420a.onDestroyActionMode(m333e(abstractC0272P));
        }

        @Override // p000a.AbstractC0272P.a
        /* JADX INFO: renamed from: c */
        public final boolean mo331c(AbstractC0272P abstractC0272P, C0998f c0998f) {
            C0125Ge c0125GeM333e = m333e(abstractC0272P);
            C0598ge<Menu, Menu> c0598ge = this.f423d;
            Menu orDefault = c0598ge.getOrDefault(c0998f, null);
            if (orDefault == null) {
                orDefault = new MenuC0614hb(this.f421b, c0998f);
                c0598ge.put(c0998f, orDefault);
            }
            return this.f420a.onPrepareActionMode(c0125GeM333e, orDefault);
        }

        @Override // p000a.AbstractC0272P.a
        /* JADX INFO: renamed from: d */
        public final boolean mo332d(AbstractC0272P abstractC0272P, MenuItem menuItem) {
            return this.f420a.onActionItemClicked(m333e(abstractC0272P), new MenuItemC0538db(this.f421b, (InterfaceMenuItemC0179Je) menuItem));
        }

        /* JADX INFO: renamed from: e */
        public final C0125Ge m333e(AbstractC0272P abstractC0272P) {
            ArrayList<C0125Ge> arrayList = this.f422c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0125Ge c0125Ge = arrayList.get(i);
                if (c0125Ge != null && c0125Ge.f419b == abstractC0272P) {
                    return c0125Ge;
                }
            }
            C0125Ge c0125Ge2 = new C0125Ge(this.f421b, abstractC0272P);
            arrayList.add(c0125Ge2);
            return c0125Ge2;
        }
    }

    public C0125Ge(Context context, AbstractC0272P abstractC0272P) {
        this.f418a = context;
        this.f419b = abstractC0272P;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f419b.mo761c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f419b.mo762d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0614hb(this.f418a, this.f419b.mo763e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f419b.mo764f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f419b.mo765g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f419b.f959a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f419b.mo766h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f419b.f960b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f419b.mo767i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f419b.mo768j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f419b.mo769k(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f419b.mo771m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f419b.f959a = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f419b.mo773o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f419b.mo774p(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f419b.mo770l(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f419b.mo772n(i);
    }
}
