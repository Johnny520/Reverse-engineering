package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ro */
/* JADX INFO: loaded from: classes.dex */
public final class C2467ro extends AbstractC2522t {

    /* JADX INFO: renamed from: a */
    public final C2424qo f8688a;

    public C2467ro() {
        C2521sz c2521sz = C2521sz.f8819a;
        C2637vm c2637vm = C2637vm.f9146a;
        this.f8688a = new C2424qo(C2521sz.f8820b, C2637vm.f9147b);
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: a */
    public final Object mo544a() {
        return new LinkedHashMap();
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: b */
    public final int mo545b(Object obj) {
        return ((LinkedHashMap) obj).size() * 2;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object obj) {
        throw null;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va interfaceC0919Va, int i, Object obj) {
        Map map = (Map) obj;
        C2637vm c2637vm = C2637vm.f9146a;
        C2521sz c2521sz = C2521sz.f8819a;
        C2424qo c2424qo = this.f8688a;
        Object objMo1779v = interfaceC0919Va.mo1779v(c2424qo, i, c2521sz, null);
        int iMo1770j = interfaceC0919Va.mo1770j(c2424qo);
        if (iMo1770j == i + 1) {
            map.put(objMo1779v, (!map.containsKey(objMo1779v) || (C2637vm.f9147b.f619b instanceof AbstractC2293nu)) ? interfaceC0919Va.mo1779v(c2424qo, iMo1770j, c2637vm, null) : interfaceC0919Va.mo1779v(c2424qo, iMo1770j, c2637vm, AbstractC2598uq.m5108J(map, objMo1779v)));
            return;
        }
        throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i + ", returned index for value: " + iMo1770j).toString());
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object obj) {
        return new LinkedHashMap((Map) null);
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: g */
    public final Object mo546g(Object obj) {
        return (LinkedHashMap) obj;
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return this.f8688a;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, Object obj) {
        ((Map) obj).size();
        throw null;
    }
}
