package p026c;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.AbstractC0482e0;
import androidx.lifecycle.AbstractC0679p0;
import androidx.lifecycle.AbstractC0681q0;
import p010a9.InterfaceC0188p;
import p014b.AbstractActivityC0706h;
import p179m2.C4865k1;
import p181m4.AbstractC4977n;

/* JADX INFO: renamed from: c.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1297a {

    /* JADX INFO: renamed from: a */
    public static final ViewGroup.LayoutParams f3895a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX INFO: renamed from: a */
    public static final void m5236a(AbstractActivityC0706h abstractActivityC0706h, AbstractC0482e0 abstractC0482e0, InterfaceC0188p interfaceC0188p) {
        View childAt = ((ViewGroup) abstractActivityC0706h.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        C4865k1 c4865k1 = childAt instanceof C4865k1 ? (C4865k1) childAt : null;
        if (c4865k1 != null) {
            c4865k1.setParentCompositionContext(abstractC0482e0);
            c4865k1.setContent(interfaceC0188p);
            return;
        }
        C4865k1 c4865k12 = new C4865k1(abstractActivityC0706h, null, 0, 6, null);
        c4865k12.setParentCompositionContext(abstractC0482e0);
        c4865k12.setContent(interfaceC0188p);
        m5238c(abstractActivityC0706h);
        abstractActivityC0706h.setContentView(c4865k12, f3895a);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5237b(AbstractActivityC0706h abstractActivityC0706h, AbstractC0482e0 abstractC0482e0, InterfaceC0188p interfaceC0188p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC0482e0 = null;
        }
        m5236a(abstractActivityC0706h, abstractC0482e0, interfaceC0188p);
    }

    /* JADX INFO: renamed from: c */
    public static final void m5238c(AbstractActivityC0706h abstractActivityC0706h) {
        View decorView = abstractActivityC0706h.getWindow().getDecorView();
        if (AbstractC0679p0.m2661a(decorView) == null) {
            AbstractC0679p0.m2662b(decorView, abstractActivityC0706h);
        }
        if (AbstractC0681q0.m2678a(decorView) == null) {
            AbstractC0681q0.m2679b(decorView, abstractActivityC0706h);
        }
        if (AbstractC4977n.m20086a(decorView) == null) {
            AbstractC4977n.m20087b(decorView, abstractActivityC0706h);
        }
    }
}
