package p236s3;

import p117X2.AbstractC1665j;
import p214o3.InterfaceC2798a;
import p225q3.InterfaceC2933d;
import p231r3.InterfaceC3152b;
import p231r3.InterfaceC3153c;

/* JADX INFO: renamed from: s3.i */
/* JADX INFO: loaded from: classes.dex */
public final class C3193i implements InterfaceC2798a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2798a f9950a;

    /* JADX INFO: renamed from: b */
    public final C3199o f9951b;

    public C3193i(InterfaceC2798a interfaceC2798a) {
        AbstractC1665j.m2985e(interfaceC2798a, "serializer");
        this.f9950a = interfaceC2798a;
        this.f9951b = new C3199o(interfaceC2798a.mo1486e());
    }

    @Override // p214o3.InterfaceC2798a
    /* JADX INFO: renamed from: b */
    public final Object mo1483b(InterfaceC3152b interfaceC3152b) {
        AbstractC1665j.m2985e(interfaceC3152b, "decoder");
        if (interfaceC3152b.mo5425d()) {
            return interfaceC3152b.mo5426e(this.f9950a);
        }
        return null;
    }

    @Override // p214o3.InterfaceC2798a
    /* JADX INFO: renamed from: c */
    public final void mo1484c(InterfaceC3153c interfaceC3153c, Object obj) {
        if (obj != null) {
            interfaceC3153c.mo5179c(this.f9950a, obj);
        } else {
            interfaceC3153c.mo5178b();
        }
    }

    @Override // p214o3.InterfaceC2798a
    /* JADX INFO: renamed from: e */
    public final InterfaceC2933d mo1486e() {
        return this.f9951b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C3193i.class == obj.getClass() && AbstractC1665j.m2981a(this.f9950a, ((C3193i) obj).f9950a);
    }

    public final int hashCode() {
        return this.f9950a.hashCode();
    }
}
