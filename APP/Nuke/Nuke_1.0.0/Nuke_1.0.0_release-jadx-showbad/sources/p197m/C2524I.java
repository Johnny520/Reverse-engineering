package p197m;

import p029F0.AbstractC0389a0;
import p029F0.AbstractC0391b0;
import p056K2.C0891q;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;
import p153e1.C2014j;
import p170h1.C2214e;

/* JADX INFO: renamed from: m.I */
/* JADX INFO: loaded from: classes.dex */
public final class C2524I extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC0391b0 f8067e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f8068f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f8069g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2214e f8070h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2524I(AbstractC0391b0 abstractC0391b0, long j5, long j6, C2214e c2214e) {
        super(1);
        this.f8067e = abstractC0391b0;
        this.f8068f = j5;
        this.f8069g = j6;
        this.f8070h = c2214e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        AbstractC0389a0 abstractC0389a0 = (AbstractC0389a0) obj;
        long j5 = this.f8068f;
        long j6 = this.f8069g;
        abstractC0389a0.getClass();
        AbstractC0391b0 abstractC0391b0 = this.f8067e;
        AbstractC0389a0.m657a(abstractC0389a0, abstractC0391b0);
        abstractC0391b0.mo666i0(C2014j.m3702c((((long) (((int) (j5 >> 32)) + ((int) (j6 >> 32)))) << 32) | (((long) (((int) (j5 & 4294967295L)) + ((int) (j6 & 4294967295L)))) & 4294967295L), abstractC0391b0.f1210h), 0.0f, this.f8070h);
        return C0891q.f2780a;
    }
}
