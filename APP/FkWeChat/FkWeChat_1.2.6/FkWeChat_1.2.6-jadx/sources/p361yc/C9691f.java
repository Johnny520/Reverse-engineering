package p361yc;

import java.util.ArrayList;
import java.util.List;
import p300uc.InterfaceC8647b;
import p329wc.InterfaceC9218f;

/* JADX INFO: renamed from: yc.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9691f extends AbstractC9779x {

    /* JADX INFO: renamed from: b */
    public final InterfaceC9218f f32927b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9691f(InterfaceC8647b interfaceC8647b) {
        super(interfaceC8647b);
        interfaceC8647b.getClass();
        this.f32927b = new C9686e(interfaceC8647b.mo15953a());
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public ArrayList mo37794q(List list) {
        list.getClass();
        ArrayList arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList(list) : arrayList;
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public List mo37795r(ArrayList arrayList) {
        arrayList.getClass();
        return arrayList;
    }

    @Override // p361yc.AbstractC9775w, p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: a */
    public InterfaceC9218f mo15953a() {
        return this.f32927b;
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public ArrayList mo37785g() {
        return new ArrayList();
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public int mo37786h(ArrayList arrayList) {
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo37787i(ArrayList arrayList, int i10) {
        arrayList.getClass();
        arrayList.ensureCapacity(i10);
    }

    @Override // p361yc.AbstractC9775w
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo37873t(ArrayList arrayList, int i10, Object obj) {
        arrayList.getClass();
        arrayList.add(i10, obj);
    }
}
