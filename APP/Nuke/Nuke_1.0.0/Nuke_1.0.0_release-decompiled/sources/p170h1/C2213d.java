package p170h1;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import p029F0.InterfaceC0377O;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p029F0.InterfaceC0420q;
import p041H0.C0564I;
import p061L2.C0982v;
import p117X2.AbstractC1665j;
import p153e1.C2005a;

/* JADX INFO: renamed from: h1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2213d implements InterfaceC0377O {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2233x f7212a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0564I f7213b;

    public C2213d(C2233x c2233x, C0564I c0564i) {
        this.f7212a = c2233x;
        this.f7213b = c0564i;
    }

    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: a */
    public final int mo651a(InterfaceC0420q interfaceC0420q, List list, int i5) {
        C2233x c2233x = this.f7212a;
        ViewGroup.LayoutParams layoutParams = c2233x.getLayoutParams();
        AbstractC1665j.m2982b(layoutParams);
        c2233x.measure(AbstractC2218i.m4026e(c2233x, 0, i5, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return c2233x.getMeasuredHeight();
    }

    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: e */
    public final int mo652e(InterfaceC0420q interfaceC0420q, List list, int i5) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        C2233x c2233x = this.f7212a;
        ViewGroup.LayoutParams layoutParams = c2233x.getLayoutParams();
        AbstractC1665j.m2982b(layoutParams);
        c2233x.measure(iMakeMeasureSpec, AbstractC2218i.m4026e(c2233x, 0, i5, layoutParams.height));
        return c2233x.getMeasuredWidth();
    }

    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: f */
    public final int mo15f(InterfaceC0420q interfaceC0420q, List list, int i5) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        C2233x c2233x = this.f7212a;
        ViewGroup.LayoutParams layoutParams = c2233x.getLayoutParams();
        AbstractC1665j.m2982b(layoutParams);
        c2233x.measure(iMakeMeasureSpec, AbstractC2218i.m4026e(c2233x, 0, i5, layoutParams.height));
        return c2233x.getMeasuredWidth();
    }

    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: h */
    public final int mo653h(InterfaceC0420q interfaceC0420q, List list, int i5) {
        C2233x c2233x = this.f7212a;
        ViewGroup.LayoutParams layoutParams = c2233x.getLayoutParams();
        AbstractC1665j.m2982b(layoutParams);
        c2233x.measure(AbstractC2218i.m4026e(c2233x, 0, i5, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return c2233x.getMeasuredHeight();
    }

    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: i */
    public final InterfaceC0378P mo16i(InterfaceC0379Q interfaceC0379Q, List list, long j5) {
        C2233x c2233x = this.f7212a;
        int childCount = c2233x.getChildCount();
        C0982v c0982v = C0982v.f3048d;
        if (childCount == 0) {
            return interfaceC0379Q.mo604f0(C2005a.m3682j(j5), C2005a.m3681i(j5), c0982v, C2211b.f7205g);
        }
        if (C2005a.m3682j(j5) != 0) {
            c2233x.getChildAt(0).setMinimumWidth(C2005a.m3682j(j5));
        }
        if (C2005a.m3681i(j5) != 0) {
            c2233x.getChildAt(0).setMinimumHeight(C2005a.m3681i(j5));
        }
        int iM3682j = C2005a.m3682j(j5);
        int iM3680h = C2005a.m3680h(j5);
        ViewGroup.LayoutParams layoutParams = c2233x.getLayoutParams();
        AbstractC1665j.m2982b(layoutParams);
        int iM4026e = AbstractC2218i.m4026e(c2233x, iM3682j, iM3680h, layoutParams.width);
        int iM3681i = C2005a.m3681i(j5);
        int iM3679g = C2005a.m3679g(j5);
        ViewGroup.LayoutParams layoutParams2 = c2233x.getLayoutParams();
        AbstractC1665j.m2982b(layoutParams2);
        c2233x.measure(iM4026e, AbstractC2218i.m4026e(c2233x, iM3681i, iM3679g, layoutParams2.height));
        return interfaceC0379Q.mo604f0(c2233x.getMeasuredWidth(), c2233x.getMeasuredHeight(), c0982v, new C2212c(c2233x, this.f7213b, 1));
    }
}
