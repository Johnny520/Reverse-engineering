package p058L;

import android.os.Build;
import p056K2.C0891q;
import p095T.InterfaceC1347Y;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p153e1.C2012h;
import p153e1.C2016l;
import p153e1.InterfaceC2007c;
import p169h0.C2204m;
import p216p.AbstractC2823P;
import p216p.C2820M;
import p216p.C2838c0;

/* JADX INFO: renamed from: L.Z */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0923Z implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2894d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC2007c f2895e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC1347Y f2896f;

    public /* synthetic */ C0923Z(InterfaceC2007c interfaceC2007c, InterfaceC1347Y interfaceC1347Y, int i5) {
        this.f2894d = i5;
        this.f2895e = interfaceC2007c;
        this.f2896f = interfaceC1347Y;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f2894d) {
            case 0:
                C0927b0 c0927b0 = new C0927b0((InterfaceC1599a) obj, 0);
                C0923Z c0923z = new C0923Z(this.f2895e, this.f2896f, 1);
                if (AbstractC2823P.m5024a()) {
                    return AbstractC2823P.m5024a() ? new C2820M(c0927b0, c0923z, Build.VERSION.SDK_INT == 28 ? C2838c0.f8918b : C2838c0.f8919c) : C2204m.f7185a;
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            default:
                C2012h c2012h = (C2012h) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c2012h.f6734a >> 32));
                InterfaceC2007c interfaceC2007c = this.f2895e;
                this.f2896f.setValue(new C2016l((((long) interfaceC2007c.mo270S(fIntBitsToFloat)) << 32) | (((long) interfaceC2007c.mo270S(Float.intBitsToFloat((int) (c2012h.f6734a & 4294967295L)))) & 4294967295L)));
                return C0891q.f2780a;
        }
    }
}
