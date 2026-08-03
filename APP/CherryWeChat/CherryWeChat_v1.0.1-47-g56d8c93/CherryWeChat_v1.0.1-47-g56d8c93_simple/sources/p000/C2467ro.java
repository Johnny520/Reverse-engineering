package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ro */
/* JADX INFO: loaded from: classes.dex */
public final class C2467ro extends AbstractC2522t {

    /* JADX INFO: renamed from: a */
    public final C2424qo f8688a;

    public C2467ro() {
        C2521sz r0 = C2521sz.f8819a;
        C2637vm r02 = C2637vm.f9146a;
        this.f8688a = new C2424qo(C2521sz.f8820b, C2637vm.f9147b);
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: a */
    public final Object mo544a() {
        return new LinkedHashMap();
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: b */
    public final int mo545b(Object r1) {
        return ((LinkedHashMap) r1).size() * 2;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object r1) {
        throw null;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va r7, int r8, Object r9) {
        Map r92 = (Map) r9;
        C2637vm r0 = C2637vm.f9146a;
        C2521sz r1 = C2521sz.f8819a;
        C2424qo r2 = this.f8688a;
        Object r12 = r7.mo1779v(r2, r8, r1, null);
        int r4 = r7.mo1770j(r2);
        if (r4 != (r8 + 1)) goto L13;
        if (r92.containsKey(r12) == true) goto L7;
    L9:
        Object r72 = r7.mo1779v(r2, r4, r0, null);
    L10:
        r92.put(r12, r72);
        return;
    L7:
        if ((C2637vm.f9147b.f619b instanceof AbstractC2293nu) == true) goto L9;
        r72 = r7.mo1779v(r2, r4, r0, AbstractC2598uq.m5108J(r92, r12));
        goto L10
    L13:
        throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + r8 + ", returned index for value: " + r4).toString());
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object r2) {
        return new LinkedHashMap(null);
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: g */
    public final Object mo546g(Object r1) {
        return (LinkedHashMap) r1;
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return this.f8688a;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of r1, Object r2) {
        ((Map) r2).size();
        throw null;
    }
}
