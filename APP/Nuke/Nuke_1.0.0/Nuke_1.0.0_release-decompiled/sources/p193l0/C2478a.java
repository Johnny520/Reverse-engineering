package p193l0;

import p056K2.C0891q;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;
import p211o0.AbstractC2767z;
import p211o0.C2735J;
import p211o0.C2757p;

/* JADX INFO: renamed from: l0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2478a extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f7974e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ float f7975f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7976g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f7977h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2478a(float f2, float f5, int i5, boolean z5) {
        super(1);
        this.f7974e = f2;
        this.f7975f = f5;
        this.f7976g = i5;
        this.f7977h = z5;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        C2735J c2735j = (C2735J) obj;
        float fMo272b = c2735j.f8696t.mo272b() * this.f7974e;
        float fMo272b2 = c2735j.f8696t.mo272b() * this.f7975f;
        c2735j.m4796j((fMo272b <= 0.0f || fMo272b2 <= 0.0f) ? null : new C2757p(fMo272b, fMo272b2, this.f7976g));
        c2735j.m4803x(AbstractC2767z.f8776b);
        c2735j.m4795i(this.f7977h);
        return C0891q.f2780a;
    }
}
