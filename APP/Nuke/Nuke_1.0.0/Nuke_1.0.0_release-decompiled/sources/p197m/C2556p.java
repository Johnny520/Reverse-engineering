package p197m;

import p029F0.AbstractC0389a0;
import p029F0.AbstractC0391b0;
import p056K2.C0891q;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;

/* JADX INFO: renamed from: m.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2556p extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2558r f8162e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC0391b0 f8163f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f8164g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2556p(C2558r c2558r, AbstractC0391b0 abstractC0391b0, long j5) {
        super(1);
        this.f8162e = c2558r;
        this.f8163f = abstractC0391b0;
        this.f8164g = j5;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        this.f8162e.f8170t.getClass();
        AbstractC0391b0 abstractC0391b0 = this.f8163f;
        long j5 = (((long) abstractC0391b0.f1206d) << 32) | (((long) abstractC0391b0.f1207e) & 4294967295L);
        long j6 = this.f8164g;
        float f2 = 1;
        AbstractC0389a0.m659j((AbstractC0389a0) obj, abstractC0391b0, (((long) Math.round((f2 - 1.0f) * ((((int) (j6 >> 32)) - ((int) (j5 >> 32))) / 2.0f))) << 32) | (((long) Math.round((f2 - 1.0f) * ((((int) (j6 & 4294967295L)) - ((int) (j5 & 4294967295L))) / 2.0f))) & 4294967295L));
        return C0891q.f2780a;
    }
}
