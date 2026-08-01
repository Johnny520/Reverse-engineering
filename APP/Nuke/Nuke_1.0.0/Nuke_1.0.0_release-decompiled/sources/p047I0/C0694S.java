package p047I0;

import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;

/* JADX INFO: renamed from: I0.S */
/* JADX INFO: loaded from: classes.dex */
public final class C0694S extends AbstractC1178c {

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f2219g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0696T f2220h;

    /* JADX INFO: renamed from: i */
    public int f2221i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0694S(C0696T c0696t, AbstractC1178c abstractC1178c) {
        super(abstractC1178c);
        this.f2220h = c0696t;
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        this.f2219g = obj;
        this.f2221i |= Integer.MIN_VALUE;
        this.f2220h.m1201a(null, this);
        return EnumC1152a.f3788d;
    }
}
