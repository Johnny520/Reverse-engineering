package p113hc;

import p130ic.AbstractC3386d;
import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: hc.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3001y extends AbstractC3386d {

    /* JADX INFO: renamed from: a */
    public long f7966a = -1;

    /* JADX INFO: renamed from: b */
    public InterfaceC5976f f7967b;

    @Override // p130ic.AbstractC3386d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo11022a(C2999w c2999w) {
        if (this.f7966a >= 0) {
            return false;
        }
        this.f7966a = c2999w.m11085Z();
        return true;
    }

    @Override // p130ic.AbstractC3386d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC5976f[] mo11023b(C2999w c2999w) {
        long j10 = this.f7966a;
        this.f7966a = -1L;
        this.f7967b = null;
        return c2999w.m11084Y(j10);
    }
}
