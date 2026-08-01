package p038ce;

import be.AbstractC1113a;
import java.util.Iterator;
import java.util.List;
import p185m8.AbstractC5081g0;

/* JADX INFO: renamed from: ce.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C1523e extends AbstractC1521c {

    /* JADX INFO: renamed from: e */
    public final List f4492e;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1523e(AbstractC1113a abstractC1113a, List list) {
        abstractC1113a.getClass();
        list.getClass();
        InterfaceC1519a interfaceC1519a = (InterfaceC1519a) AbstractC5081g0.m20578l0(list);
        int iMo5940h = interfaceC1519a != null ? interfaceC1519a.mo5940h() : 0;
        InterfaceC1519a interfaceC1519a2 = (InterfaceC1519a) AbstractC5081g0.m20589w0(list);
        super(abstractC1113a, iMo5940h, interfaceC1519a2 != null ? interfaceC1519a2.mo5939g() : 0);
        this.f4492e = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC1519a interfaceC1519a3 = (InterfaceC1519a) it.next();
            if (interfaceC1519a3 instanceof AbstractC1521c) {
                ((AbstractC1521c) interfaceC1519a3).m5945a(this);
            }
        }
    }

    @Override // p038ce.InterfaceC1519a
    /* JADX INFO: renamed from: f */
    public final List mo5938f() {
        return this.f4492e;
    }
}
