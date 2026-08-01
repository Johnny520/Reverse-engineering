package p361yc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p300uc.InterfaceC8647b;
import p329wc.InterfaceC9218f;

/* JADX INFO: renamed from: yc.p0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9742p0 extends AbstractC9733n1 {

    /* JADX INFO: renamed from: c */
    public final InterfaceC9218f f33012c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9742p0(InterfaceC8647b interfaceC8647b, InterfaceC8647b interfaceC8647b2) {
        super(interfaceC8647b, interfaceC8647b2, null);
        interfaceC8647b.getClass();
        interfaceC8647b2.getClass();
        this.f33012c = new C9737o0(interfaceC8647b.mo15953a(), interfaceC8647b2.mo15953a());
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public int mo37789k(Map map) {
        map.getClass();
        return map.size();
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public HashMap mo37794q(Map map) {
        map.getClass();
        HashMap map2 = map instanceof HashMap ? (HashMap) map : null;
        return map2 == null ? new HashMap(map) : map2;
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public Map mo37795r(HashMap map) {
        map.getClass();
        return map;
    }

    @Override // p361yc.AbstractC9733n1, p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: a */
    public InterfaceC9218f mo15953a() {
        return this.f33012c;
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public HashMap mo37785g() {
        return new HashMap();
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public int mo37786h(HashMap map) {
        map.getClass();
        return map.size() * 2;
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo37787i(HashMap map, int i10) {
        map.getClass();
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Iterator mo37788j(Map map) {
        map.getClass();
        return map.entrySet().iterator();
    }
}
