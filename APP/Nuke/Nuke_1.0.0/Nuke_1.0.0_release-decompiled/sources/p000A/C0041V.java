package p000A;

import p007B0.InterfaceC0169B;
import p056K2.C0891q;
import p058L.C0920W;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p160f3.AbstractC2162v;
import p160f3.InterfaceC2160t;

/* JADX INFO: renamed from: A.V */
/* JADX INFO: loaded from: classes.dex */
public final class C0041V extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f180h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC0169B f181i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC0092v0 f182j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0920W f183k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0041V(InterfaceC0169B interfaceC0169B, InterfaceC0092v0 interfaceC0092v0, C0920W c0920w, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f181i = interfaceC0169B;
        this.f182j = interfaceC0092v0;
        this.f183k = c0920w;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        C0041V c0041v = (C0041V) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj);
        C0891q c0891q = C0891q.f2780a;
        c0041v.mo8p(c0891q);
        return c0891q;
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        C0041V c0041v = new C0041V(this.f181i, this.f182j, this.f183k, interfaceC1046d);
        c0041v.f180h = obj;
        return c0041v;
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        AbstractC1784a.m3205S(obj);
        InterfaceC2160t interfaceC2160t = (InterfaceC2160t) this.f180h;
        InterfaceC0169B interfaceC0169B = this.f181i;
        InterfaceC1046d interfaceC1046d = null;
        AbstractC2162v.m3994p(interfaceC2160t, null, new C0037T(interfaceC0169B, this.f182j, interfaceC1046d, 0), 1);
        AbstractC2162v.m3994p(interfaceC2160t, null, new C0039U(interfaceC0169B, this.f183k, interfaceC1046d, 0), 1);
        return C0891q.f2780a;
    }
}
