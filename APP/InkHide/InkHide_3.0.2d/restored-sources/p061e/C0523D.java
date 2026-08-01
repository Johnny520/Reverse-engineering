package p061e;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.emoji2.text.C0404s;
import java.lang.ref.WeakReference;
import p014H.C0142a;
import p066g.AbstractC0561a;
import p066g.C0569i;
import p068h.InterfaceC0592k;
import p068h.MenuC0594m;
import p069i.C0689k;

/* JADX INFO: renamed from: e.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0523D extends AbstractC0561a implements InterfaceC0592k {

    /* JADX INFO: renamed from: d */
    public final Context f1676d;

    /* JADX INFO: renamed from: e */
    public final MenuC0594m f1677e;

    /* JADX INFO: renamed from: f */
    public C0142a f1678f;

    /* JADX INFO: renamed from: g */
    public WeakReference f1679g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0524E f1680h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0523D(C0524E c0524e, Context context, C0142a c0142a) {
        this.f1680h = c0524e;
        this.f1676d = context;
        this.f1678f = c0142a;
        MenuC0594m menuC0594m = new MenuC0594m(context);
        menuC0594m.f2041l = 1;
        this.f1677e = menuC0594m;
        menuC0594m.f2034e = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: a */
    public final void mo1048a() {
        C0524E c0524e = this.f1680h;
        if (c0524e.f1705x != this) {
            return;
        }
        boolean z2 = c0524e.f1687E;
        boolean z3 = c0524e.f1688F;
        if (z2 || z3) {
            c0524e.f1706y = this;
            c0524e.f1707z = this.f1678f;
        } else {
            this.f1678f.m332r(this);
        }
        this.f1678f = null;
        c0524e.m1062Q(false);
        ActionBarContextView actionBarContextView = c0524e.f1702u;
        if (actionBarContextView.f964l == null) {
            actionBarContextView.m656e();
        }
        c0524e.f1699r.setHideOnContentScrollEnabled(c0524e.f1693K);
        c0524e.f1705x = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: b */
    public final View mo1049b() {
        WeakReference weakReference = this.f1679g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: c */
    public final MenuC0594m mo1050c() {
        return this.f1677e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: d */
    public final MenuInflater mo1051d() {
        return new C0569i(this.f1676d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: e */
    public final CharSequence mo1052e() {
        return this.f1680h.f1702u.getSubtitle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0592k
    /* JADX INFO: renamed from: f */
    public final void mo135f(MenuC0594m menuC0594m) {
        if (this.f1678f == null) {
            return;
        }
        mo1054i();
        C0689k c0689k = this.f1680h.f1702u.f957e;
        if (c0689k != null) {
            c0689k.m1311l();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0592k
    /* JADX INFO: renamed from: g */
    public final boolean mo136g(MenuC0594m menuC0594m, MenuItem menuItem) {
        C0142a c0142a = this.f1678f;
        if (c0142a != null) {
            return ((C0404s) c0142a.f443b).m776b(this, menuItem);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: h */
    public final CharSequence mo1053h() {
        return this.f1680h.f1702u.getTitle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: i */
    public final void mo1054i() {
        if (this.f1680h.f1705x != this) {
            return;
        }
        MenuC0594m menuC0594m = this.f1677e;
        menuC0594m.m1196w();
        try {
            this.f1678f.m333s(this, menuC0594m);
        } finally {
            menuC0594m.m1195v();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: j */
    public final boolean mo1055j() {
        return this.f1680h.f1702u.f972t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: k */
    public final void mo1056k(View view) {
        this.f1680h.f1702u.setCustomView(view);
        this.f1679g = new WeakReference(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: l */
    public final void mo1057l(int i2) {
        mo1058m(this.f1680h.f1697p.getResources().getString(i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: m */
    public final void mo1058m(CharSequence charSequence) {
        this.f1680h.f1702u.setSubtitle(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: n */
    public final void mo1059n(int i2) {
        mo1060o(this.f1680h.f1697p.getResources().getString(i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: o */
    public final void mo1060o(CharSequence charSequence) {
        this.f1680h.f1702u.setTitle(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.AbstractC0561a
    /* JADX INFO: renamed from: p */
    public final void mo1061p(boolean z2) {
        this.f1875c = z2;
        this.f1680h.f1702u.setTitleOptional(z2);
    }
}
