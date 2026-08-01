package p361yc;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p300uc.InterfaceC8647b;
import p329wc.InterfaceC9218f;

/* JADX INFO: renamed from: yc.c1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9678c1 extends AbstractC9733n1 {

    /* JADX INFO: renamed from: c */
    public final InterfaceC9218f f32912c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9678c1(InterfaceC8647b interfaceC8647b, InterfaceC8647b interfaceC8647b2) {
        super(interfaceC8647b, interfaceC8647b2, null);
        interfaceC8647b.getClass();
        interfaceC8647b2.getClass();
        this.f32912c = new C9673b1(interfaceC8647b.mo15953a(), interfaceC8647b2.mo15953a());
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public int mo37789k(Map map) {
        map.getClass();
        return map.size();
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap mo37794q(Map map) {
        map.getClass();
        LinkedHashMap linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap(map) : linkedHashMap;
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public Map mo37795r(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        return linkedHashMap;
    }

    @Override // p361yc.AbstractC9733n1, p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: a */
    public InterfaceC9218f mo15953a() {
        return this.f32912c;
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap mo37785g() {
        return new LinkedHashMap();
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public int mo37786h(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        return linkedHashMap.size() * 2;
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo37787i(LinkedHashMap linkedHashMap, int i10) {
        linkedHashMap.getClass();
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Iterator mo37788j(Map map) {
        map.getClass();
        return map.entrySet().iterator();
    }
}
