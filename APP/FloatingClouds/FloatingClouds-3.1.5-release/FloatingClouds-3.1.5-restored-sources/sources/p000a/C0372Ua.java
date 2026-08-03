package p000a;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.datepicker.C1282a;
import java.util.Iterator;

/* JADX INFO: renamed from: a.Ua */
/* JADX INFO: loaded from: classes.dex */
public final class C0372Ua<S> extends AbstractC0843tc<S> {

    /* JADX INFO: renamed from: W */
    public int f1391W;

    /* JADX INFO: renamed from: X */
    public InterfaceC0151I4<S> f1392X;

    /* JADX INFO: renamed from: Y */
    public C1282a f1393Y;

    /* JADX INFO: renamed from: a.Ua$a */
    public class a extends AbstractC0577fc<S> {
        public a() {
        }

        @Override // p000a.AbstractC0577fc
        /* JADX INFO: renamed from: a */
        public final void mo997a(S s) {
            Iterator<AbstractC0577fc<S>> it = C0372Ua.this.f3319V.iterator();
            while (it.hasNext()) {
                it.next().mo997a(s);
            }
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1100b
    /* JADX INFO: renamed from: o */
    public final void mo994o(Bundle bundle) {
        super.mo994o(bundle);
        if (bundle == null) {
            bundle = this.f4562f;
        }
        this.f1391W = bundle.getInt("THEME_RES_ID_KEY");
        this.f1392X = (InterfaceC0151I4) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f1393Y = (C1282a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1100b
    /* JADX INFO: renamed from: p */
    public final View mo995p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(m2531d(), this.f1391W));
        InterfaceC0151I4<S> interfaceC0151I4 = this.f1392X;
        new a();
        return interfaceC0151I4.m428g();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1100b
    /* JADX INFO: renamed from: t */
    public final void mo996t(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f1391W);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f1392X);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f1393Y);
    }
}
