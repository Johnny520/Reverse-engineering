package p361yc;

import java.util.LinkedHashSet;
import java.util.Set;
import p300uc.InterfaceC8647b;
import p329wc.InterfaceC9218f;

/* JADX INFO: renamed from: yc.e1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9688e1 extends AbstractC9779x {

    /* JADX INFO: renamed from: b */
    public final InterfaceC9218f f32924b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9688e1(InterfaceC8647b interfaceC8647b) {
        super(interfaceC8647b);
        interfaceC8647b.getClass();
        this.f32924b = new C9683d1(interfaceC8647b.mo15953a());
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet mo37794q(Set set) {
        set.getClass();
        LinkedHashSet linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet(set) : linkedHashSet;
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Set mo37795r(LinkedHashSet linkedHashSet) {
        linkedHashSet.getClass();
        return linkedHashSet;
    }

    @Override // p361yc.AbstractC9775w, p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: a */
    public InterfaceC9218f mo15953a() {
        return this.f32924b;
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet mo37785g() {
        return new LinkedHashSet();
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public int mo37786h(LinkedHashSet linkedHashSet) {
        linkedHashSet.getClass();
        return linkedHashSet.size();
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo37787i(LinkedHashSet linkedHashSet, int i10) {
        linkedHashSet.getClass();
    }

    @Override // p361yc.AbstractC9775w
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo37873t(LinkedHashSet linkedHashSet, int i10, Object obj) {
        linkedHashSet.getClass();
        linkedHashSet.add(obj);
    }
}
