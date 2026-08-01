package p000;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class cc0 extends AbstractC0506n1 implements InterfaceC0572ou {

    /* JADX INFO: renamed from: c */
    public final Context f876c;

    /* JADX INFO: renamed from: d */
    public final MenuC0646qu f877d;

    /* JADX INFO: renamed from: e */
    public C0138d4 f878e;

    /* JADX INFO: renamed from: f */
    public WeakReference f879f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ dc0 f880g;

    public cc0(dc0 dc0Var, Context context, C0138d4 c0138d4) {
        this.f880g = dc0Var;
        this.f876c = context;
        this.f878e = c0138d4;
        MenuC0646qu menuC0646qu = new MenuC0646qu(context);
        menuC0646qu.f3962l = 1;
        this.f877d = menuC0646qu;
        menuC0646qu.f3955e = this;
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: a */
    public final void mo613a() {
        dc0 dc0Var = this.f880g;
        if (dc0Var.f1364D != this) {
            return;
        }
        if (dc0Var.f1371K) {
            dc0Var.f1365E = this;
            dc0Var.f1366F = this.f878e;
        } else {
            this.f878e.m832D(this);
        }
        this.f878e = null;
        dc0Var.m909Q(false);
        ActionBarContextView actionBarContextView = dc0Var.f1361A;
        if (actionBarContextView.f206k == null) {
            actionBarContextView.m130e();
        }
        dc0Var.f1382x.setHideOnContentScrollEnabled(dc0Var.f1376P);
        dc0Var.f1364D = null;
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: b */
    public final View mo614b() {
        WeakReference weakReference = this.f879f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: c */
    public final MenuC0646qu mo615c() {
        return this.f877d;
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: d */
    public final MenuInflater mo616d() {
        return new r50(this.f876c);
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: e */
    public final CharSequence mo617e() {
        return this.f880g.f1361A.getSubtitle();
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: f */
    public final CharSequence mo618f() {
        return this.f880g.f1361A.getTitle();
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: g */
    public final void mo619g() {
        if (this.f880g.f1364D != this) {
            return;
        }
        MenuC0646qu menuC0646qu = this.f877d;
        menuC0646qu.m2179w();
        try {
            this.f878e.m833E(this, menuC0646qu);
        } finally {
            menuC0646qu.m2178v();
        }
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: h */
    public final boolean mo620h() {
        return this.f880g.f1361A.f214s;
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: i */
    public final void mo621i(View view) {
        this.f880g.f1361A.setCustomView(view);
        this.f879f = new WeakReference(view);
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: j */
    public final void mo622j(int i) {
        mo624l(this.f880g.f1380v.getResources().getString(i));
    }

    @Override // p000.InterfaceC0572ou
    /* JADX INFO: renamed from: k */
    public final void mo623k(MenuC0646qu menuC0646qu) {
        if (this.f878e == null) {
            return;
        }
        mo619g();
        C0358j1 c0358j1 = this.f880g.f1361A.f199d;
        if (c0358j1 != null) {
            c0358j1.m1562l();
        }
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: l */
    public final void mo624l(CharSequence charSequence) {
        this.f880g.f1361A.setSubtitle(charSequence);
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: m */
    public final void mo625m(int i) {
        mo627o(this.f880g.f1380v.getResources().getString(i));
    }

    @Override // p000.InterfaceC0572ou
    /* JADX INFO: renamed from: n */
    public final boolean mo626n(MenuC0646qu menuC0646qu, MenuItem menuItem) {
        C0138d4 c0138d4 = this.f878e;
        if (c0138d4 != null) {
            return ((C0402k8) c0138d4.f1297b).m1663c(this, menuItem);
        }
        return false;
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: o */
    public final void mo627o(CharSequence charSequence) {
        this.f880g.f1361A.setTitle(charSequence);
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: p */
    public final void mo628p(boolean z) {
        this.f3203b = z;
        this.f880g.f1361A.setTitleOptional(z);
    }
}
