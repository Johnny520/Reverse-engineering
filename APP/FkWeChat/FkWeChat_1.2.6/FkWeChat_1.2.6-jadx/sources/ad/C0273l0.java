package ad;

import bd.InterfaceC1111d;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p098g9.InterfaceC2549c;
import p300uc.InterfaceC8647b;
import p329wc.AbstractC9216d;
import p329wc.AbstractC9217e;
import p329wc.AbstractC9224l;
import p329wc.AbstractC9225m;
import p329wc.InterfaceC9218f;
import p375zc.C9951i;
import p375zc.EnumC9935a;

/* JADX INFO: renamed from: ad.l0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0273l0 implements InterfaceC1111d {

    /* JADX INFO: renamed from: a */
    public final String f666a;

    /* JADX INFO: renamed from: b */
    public final boolean f667b;

    /* JADX INFO: renamed from: c */
    public final boolean f668c;

    public C0273l0(C9951i c9951i) {
        c9951i.getClass();
        this.f666a = c9951i.m38552e();
        this.f667b = c9951i.m38563p();
        this.f668c = c9951i.m38553f() != EnumC9935a.f33472q;
    }

    @Override // bd.InterfaceC1111d
    /* JADX INFO: renamed from: a */
    public void mo801a(InterfaceC2549c interfaceC2549c, InterfaceC0184l interfaceC0184l) {
        interfaceC2549c.getClass();
        interfaceC0184l.getClass();
    }

    @Override // bd.InterfaceC1111d
    /* JADX INFO: renamed from: b */
    public void mo802b(InterfaceC2549c interfaceC2549c, InterfaceC0184l interfaceC0184l) {
        interfaceC2549c.getClass();
        interfaceC0184l.getClass();
    }

    @Override // bd.InterfaceC1111d
    /* JADX INFO: renamed from: c */
    public void mo803c(InterfaceC2549c interfaceC2549c, InterfaceC2549c interfaceC2549c2, InterfaceC8647b interfaceC8647b) {
        interfaceC2549c.getClass();
        interfaceC2549c2.getClass();
        interfaceC8647b.getClass();
        InterfaceC9218f interfaceC9218fMo15953a = interfaceC8647b.mo15953a();
        m805e(interfaceC9218fMo15953a, interfaceC2549c2);
        if (this.f667b || !this.f668c) {
            return;
        }
        m804d(interfaceC9218fMo15953a, interfaceC2549c2);
    }

    /* JADX INFO: renamed from: d */
    public final void m804d(InterfaceC9218f interfaceC9218f, InterfaceC2549c interfaceC2549c) {
        int iMo35891e = interfaceC9218f.mo35891e();
        for (int i10 = 0; i10 < iMo35891e; i10++) {
            String strMo35892f = interfaceC9218f.mo35892f(i10);
            if (AbstractC1061t.m3842c(strMo35892f, this.f666a)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + interfaceC2549c + " has property '" + strMo35892f + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m805e(InterfaceC9218f interfaceC9218f, InterfaceC2549c interfaceC2549c) {
        AbstractC9224l abstractC9224lMo35896j = interfaceC9218f.mo35896j();
        if ((abstractC9224lMo35896j instanceof AbstractC9216d) || AbstractC1061t.m3842c(abstractC9224lMo35896j, AbstractC9224l.a.f31484a)) {
            throw new IllegalArgumentException("Serializer for " + interfaceC2549c.mo3794w() + " can't be registered as a subclass for polymorphic serialization because its kind " + abstractC9224lMo35896j + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (!this.f667b && this.f668c) {
            if (AbstractC1061t.m3842c(abstractC9224lMo35896j, AbstractC9225m.b.f31487a) || AbstractC1061t.m3842c(abstractC9224lMo35896j, AbstractC9225m.c.f31488a) || (abstractC9224lMo35896j instanceof AbstractC9217e) || (abstractC9224lMo35896j instanceof AbstractC9224l.b)) {
                throw new IllegalArgumentException("Serializer for " + interfaceC2549c.mo3794w() + " of kind " + abstractC9224lMo35896j + " cannot be serialized polymorphically with class discriminator.");
            }
        }
    }
}
