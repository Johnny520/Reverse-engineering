package p197m;

import p029F0.AbstractC0389a0;
import p029F0.AbstractC0391b0;
import p056K2.C0891q;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;

/* JADX INFO: renamed from: m.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2551k extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC0391b0[] f8154e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f8155f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f8156g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2551k(AbstractC0391b0[] abstractC0391b0Arr, C2552l c2552l, int i5, int i6) {
        super(1);
        this.f8154e = abstractC0391b0Arr;
        this.f8155f = i5;
        this.f8156g = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        AbstractC0389a0 abstractC0389a0 = (AbstractC0389a0) obj;
        for (AbstractC0391b0 abstractC0391b0 : this.f8154e) {
            if (abstractC0391b0 != null) {
                long j5 = (((long) abstractC0391b0.f1206d) << 32) | (((long) abstractC0391b0.f1207e) & 4294967295L);
                long j6 = (((long) this.f8155f) << 32) | (((long) this.f8156g) & 4294967295L);
                float f2 = 1;
                long jRound = (((long) Math.round((f2 - 1.0f) * ((((int) (j6 & 4294967295L)) - ((int) (j5 & 4294967295L))) / 2.0f))) & 4294967295L) | (((long) Math.round((f2 - 1.0f) * ((((int) (j6 >> 32)) - ((int) (j5 >> 32))) / 2.0f))) << 32);
                AbstractC0389a0.m658i(abstractC0389a0, abstractC0391b0, (int) (jRound >> 32), (int) (jRound & 4294967295L));
            }
        }
        return C0891q.f2780a;
    }
}
