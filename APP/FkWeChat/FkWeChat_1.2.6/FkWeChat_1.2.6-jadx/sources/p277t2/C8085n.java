package p277t2;

import android.graphics.Region;
import p121i3.C3187q;
import p265s1.AbstractC7050a3;

/* JADX INFO: renamed from: t2.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8085n implements InterfaceC8076i0 {

    /* JADX INFO: renamed from: a */
    public final Region f26991a = new Region();

    @Override // p277t2.InterfaceC8076i0
    /* JADX INFO: renamed from: a */
    public boolean mo31170a(InterfaceC8076i0 interfaceC8076i0) {
        Region region = this.f26991a;
        interfaceC8076i0.getClass();
        return region.op(((C8085n) interfaceC8076i0).f26991a, Region.Op.INTERSECT);
    }

    @Override // p277t2.InterfaceC8076i0
    /* JADX INFO: renamed from: b */
    public boolean mo31171b(C3187q c3187q) {
        return this.f26991a.op(c3187q.m12068g(), c3187q.m12071j(), c3187q.m12069h(), c3187q.m12065d(), Region.Op.DIFFERENCE);
    }

    @Override // p277t2.InterfaceC8076i0
    /* JADX INFO: renamed from: c */
    public void mo31172c(C3187q c3187q) {
        this.f26991a.set(c3187q.m12068g(), c3187q.m12071j(), c3187q.m12069h(), c3187q.m12065d());
    }

    @Override // p277t2.InterfaceC8076i0
    public C3187q getBounds() {
        return AbstractC7050a3.m27756d(this.f26991a.getBounds());
    }

    @Override // p277t2.InterfaceC8076i0
    public boolean isEmpty() {
        return this.f26991a.isEmpty();
    }
}
