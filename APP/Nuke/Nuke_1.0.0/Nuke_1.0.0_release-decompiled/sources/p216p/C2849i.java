package p216p;

import android.content.Context;
import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p153e1.InterfaceC2007c;
import p211o0.C2762u;
import p244u.C3251U;

/* JADX INFO: renamed from: p.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2849i {

    /* JADX INFO: renamed from: a */
    public final Context f8961a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2007c f8962b;

    /* JADX INFO: renamed from: c */
    public final long f8963c;

    /* JADX INFO: renamed from: d */
    public final C3251U f8964d;

    public C2849i(Context context, InterfaceC2007c interfaceC2007c, long j5, C3251U c3251u) {
        this.f8961a = context;
        this.f8962b = interfaceC2007c;
        this.f8963c = j5;
        this.f8964d = c3251u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C2849i.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        C2849i c2849i = (C2849i) obj;
        return AbstractC1665j.m2981a(this.f8961a, c2849i.f8961a) && AbstractC1665j.m2981a(this.f8962b, c2849i.f8962b) && C2762u.m4921c(this.f8963c, c2849i.f8963c) && AbstractC1665j.m2981a(this.f8964d, c2849i.f8964d);
    }

    public final int hashCode() {
        int iHashCode = (this.f8962b.hashCode() + (this.f8961a.hashCode() * 31)) * 31;
        int i5 = C2762u.f8763h;
        return this.f8964d.hashCode() + AbstractC0231b.m392c(iHashCode, 31, this.f8963c);
    }
}
