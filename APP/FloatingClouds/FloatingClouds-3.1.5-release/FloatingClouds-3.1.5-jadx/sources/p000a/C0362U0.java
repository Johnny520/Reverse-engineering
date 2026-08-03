package p000a;

import android.view.View;
import java.util.WeakHashMap;
import p000a.C0866ug;

/* JADX INFO: renamed from: a.U0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0362U0 extends C0726n9 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C0291Q0 f1361b;

    public C0362U0(LayoutInflaterFactory2C0291Q0 layoutInflaterFactory2C0291Q0) {
        this.f1361b = layoutInflaterFactory2C0291Q0;
    }

    @Override // p000a.InterfaceC0217Lg
    /* JADX INFO: renamed from: a */
    public final void mo553a() {
        LayoutInflaterFactory2C0291Q0 layoutInflaterFactory2C0291Q0 = this.f1361b;
        layoutInflaterFactory2C0291Q0.f1037v.setAlpha(1.0f);
        layoutInflaterFactory2C0291Q0.f1040y.m491d(null);
        layoutInflaterFactory2C0291Q0.f1040y = null;
    }

    @Override // p000a.C0726n9, p000a.InterfaceC0217Lg
    /* JADX INFO: renamed from: c */
    public final void mo554c() {
        LayoutInflaterFactory2C0291Q0 layoutInflaterFactory2C0291Q0 = this.f1361b;
        layoutInflaterFactory2C0291Q0.f1037v.setVisibility(0);
        if (layoutInflaterFactory2C0291Q0.f1037v.getParent() instanceof View) {
            View view = (View) layoutInflaterFactory2C0291Q0.f1037v.getParent();
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            C0866ug.c.m2008c(view);
        }
    }
}
