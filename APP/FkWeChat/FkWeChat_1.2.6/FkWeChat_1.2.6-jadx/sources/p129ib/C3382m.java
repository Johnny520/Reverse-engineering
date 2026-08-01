package p129ib;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import p010a9.InterfaceC0184l;
import p213oa.C5695f;
import p229p9.InterfaceC6004h;
import p342x9.InterfaceC9468b;
import za.C9906d;

/* JADX INFO: renamed from: ib.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3382m extends C3376g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3382m(EnumC3377h enumC3377h, String... strArr) {
        super(enumC3377h, (String[]) Arrays.copyOf(strArr, strArr.length));
        enumC3377h.getClass();
        strArr.getClass();
    }

    @Override // p129ib.C3376g, za.InterfaceC9913k
    /* JADX INFO: renamed from: b */
    public Set mo5514b() {
        throw new IllegalStateException();
    }

    @Override // p129ib.C3376g, za.InterfaceC9913k
    /* JADX INFO: renamed from: d */
    public Set mo5516d() {
        throw new IllegalStateException();
    }

    @Override // p129ib.C3376g, za.InterfaceC9913k
    /* JADX INFO: renamed from: e */
    public Set mo5517e() {
        throw new IllegalStateException();
    }

    @Override // p129ib.C3376g, za.InterfaceC9916n
    /* JADX INFO: renamed from: f */
    public InterfaceC6004h mo5518f(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        throw new IllegalStateException(m12689j() + ", required name: " + c5695f);
    }

    @Override // p129ib.C3376g, za.InterfaceC9916n
    /* JADX INFO: renamed from: g */
    public Collection mo5519g(C9906d c9906d, InterfaceC0184l interfaceC0184l) {
        c9906d.getClass();
        interfaceC0184l.getClass();
        throw new IllegalStateException(m12689j());
    }

    @Override // p129ib.C3376g, za.InterfaceC9913k
    /* JADX INFO: renamed from: h */
    public Set mo5513a(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        throw new IllegalStateException(m12689j() + ", required name: " + c5695f);
    }

    @Override // p129ib.C3376g, za.InterfaceC9913k
    /* JADX INFO: renamed from: i */
    public Set mo5515c(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        throw new IllegalStateException(m12689j() + ", required name: " + c5695f);
    }

    @Override // p129ib.C3376g
    public String toString() {
        return "ThrowingScope{" + m12689j() + '}';
    }
}
