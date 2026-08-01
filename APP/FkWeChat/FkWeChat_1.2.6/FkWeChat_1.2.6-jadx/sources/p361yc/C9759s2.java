package p361yc;

import java.util.ArrayList;
import java.util.Iterator;
import p024b9.AbstractC1027c;
import p098g9.InterfaceC2549c;
import p185m8.AbstractC5102r;
import p300uc.InterfaceC8647b;
import p329wc.InterfaceC9218f;

/* JADX INFO: renamed from: yc.s2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9759s2 extends AbstractC9775w {

    /* JADX INFO: renamed from: b */
    public final InterfaceC2549c f33029b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9218f f33030c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9759s2(InterfaceC2549c interfaceC2549c, InterfaceC8647b interfaceC8647b) {
        super(interfaceC8647b, null);
        interfaceC2549c.getClass();
        interfaceC8647b.getClass();
        this.f33029b = interfaceC2549c;
        this.f33030c = new C9681d(interfaceC8647b.mo15953a());
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public ArrayList mo37794q(Object[] objArr) {
        objArr.getClass();
        return new ArrayList(AbstractC5102r.m20652d(objArr));
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Object[] mo37795r(ArrayList arrayList) {
        arrayList.getClass();
        return AbstractC9684d2.m37859q(arrayList, this.f33029b);
    }

    @Override // p361yc.AbstractC9775w, p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: a */
    public InterfaceC9218f mo15953a() {
        return this.f33030c;
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList mo37785g() {
        return new ArrayList();
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo37786h(ArrayList arrayList) {
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo37787i(ArrayList arrayList, int i10) {
        arrayList.getClass();
        arrayList.ensureCapacity(i10);
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Iterator mo37788j(Object[] objArr) {
        objArr.getClass();
        return AbstractC1027c.m3774a(objArr);
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public int mo37789k(Object[] objArr) {
        objArr.getClass();
        return objArr.length;
    }

    @Override // p361yc.AbstractC9775w
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo37873t(ArrayList arrayList, int i10, Object obj) {
        arrayList.getClass();
        arrayList.add(i10, obj);
    }
}
