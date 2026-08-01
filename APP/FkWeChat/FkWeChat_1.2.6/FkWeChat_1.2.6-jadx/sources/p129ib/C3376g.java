package p129ib;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import p010a9.InterfaceC0184l;
import p185m8.AbstractC5065a1;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5114x;
import p213oa.C5695f;
import p229p9.InterfaceC6004h;
import p342x9.InterfaceC9468b;
import za.C9906d;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: ib.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3376g implements InterfaceC9913k {

    /* JADX INFO: renamed from: b */
    public final EnumC3377h f9216b;

    /* JADX INFO: renamed from: c */
    public final String f9217c;

    public C3376g(EnumC3377h enumC3377h, String... strArr) {
        enumC3377h.getClass();
        strArr.getClass();
        this.f9216b = enumC3377h;
        String strM12691c = enumC3377h.m12691c();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f9217c = String.format(strM12691c, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // za.InterfaceC9913k
    /* JADX INFO: renamed from: b */
    public Set mo5514b() {
        return AbstractC5068b1.m20483e();
    }

    @Override // za.InterfaceC9913k
    /* JADX INFO: renamed from: d */
    public Set mo5516d() {
        return AbstractC5068b1.m20483e();
    }

    @Override // za.InterfaceC9913k
    /* JADX INFO: renamed from: e */
    public Set mo5517e() {
        return AbstractC5068b1.m20483e();
    }

    @Override // za.InterfaceC9916n
    /* JADX INFO: renamed from: f */
    public InterfaceC6004h mo5518f(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        C5695f c5695fM23029m = C5695f.m23029m(String.format(EnumC3371b.f9197r.m12634c(), Arrays.copyOf(new Object[]{c5695f}, 1)));
        c5695fM23029m.getClass();
        return new C3370a(c5695fM23029m);
    }

    @Override // za.InterfaceC9916n
    /* JADX INFO: renamed from: g */
    public Collection mo5519g(C9906d c9906d, InterfaceC0184l interfaceC0184l) {
        c9906d.getClass();
        interfaceC0184l.getClass();
        return AbstractC5114x.m20800o();
    }

    @Override // za.InterfaceC9913k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set mo5513a(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        return AbstractC5065a1.m20479d(new C3372c(C3381l.f9328a.m12710h()));
    }

    @Override // za.InterfaceC9913k
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set mo5515c(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        return C3381l.f9328a.m12712j();
    }

    /* JADX INFO: renamed from: j */
    public final String m12689j() {
        return this.f9217c;
    }

    public String toString() {
        return "ErrorScope{" + this.f9217c + '}';
    }
}
