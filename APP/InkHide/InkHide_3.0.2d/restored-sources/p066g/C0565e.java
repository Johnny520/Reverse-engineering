package p066g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.emoji2.text.C0404s;
import java.lang.ref.WeakReference;
import p014H.C0142a;
import p068h.InterfaceC0592k;
import p068h.MenuC0594m;
import p069i.C0689k;

/* JADX INFO: renamed from: g.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0565e extends AbstractC0561a implements InterfaceC0592k {

    /* JADX INFO: renamed from: d */
    public Context f1882d;

    /* JADX INFO: renamed from: e */
    public ActionBarContextView f1883e;

    /* JADX INFO: renamed from: f */
    public C0142a f1884f;

    /* JADX INFO: renamed from: g */
    public WeakReference f1885g;

    /* JADX INFO: renamed from: h */
    public boolean f1886h;

    /* JADX INFO: renamed from: i */
    public MenuC0594m f1887i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: a */
    public final void mo1048a() {
        if (this.f1886h) {
            return;
        }
        this.f1886h = true;
        this.f1884f.m332r(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: b */
    public final View mo1049b() {
        WeakReference weakReference = this.f1885g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: c */
    public final MenuC0594m mo1050c() {
        return this.f1887i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: d */
    public final MenuInflater mo1051d() {
        return new C0569i(this.f1883e.getContext());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: e */
    public final CharSequence mo1052e() {
        return this.f1883e.getSubtitle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0592k
    /* JADX INFO: renamed from: f */
    public final void mo135f(MenuC0594m menuC0594m) {
        mo1054i();
        C0689k c0689k = this.f1883e.f957e;
        if (c0689k != null) {
            c0689k.m1311l();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0592k
    /* JADX INFO: renamed from: g */
    public final boolean mo136g(MenuC0594m menuC0594m, MenuItem menuItem) {
        return ((C0404s) this.f1884f.f443b).m776b(this, menuItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: h */
    public final CharSequence mo1053h() {
        return this.f1883e.getTitle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: i */
    public final void mo1054i() {
        this.f1884f.m333s(this, this.f1887i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: j */
    public final boolean mo1055j() {
        return this.f1883e.f972t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: k */
    public final void mo1056k(View view) {
        this.f1883e.setCustomView(view);
        this.f1885g = view != null ? new WeakReference(view) : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: l */
    public final void mo1057l(int i2) {
        mo1058m(this.f1882d.getString(i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: m */
    public final void mo1058m(CharSequence charSequence) {
        this.f1883e.setSubtitle(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: n */
    public final void mo1059n(int i2) {
        mo1060o(this.f1882d.getString(i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: o */
    public final void mo1060o(CharSequence charSequence) {
        this.f1883e.setTitle(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: p */
    public final void mo1061p(boolean z2) {
        this.f1875c = z2;
        this.f1883e.setTitleOptional(z2);
    }
}
