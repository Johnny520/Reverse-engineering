package p219p;

import android.os.Build;
import android.view.ViewConfiguration;
import java.util.List;
import p073f2.C2236d0;
import p073f2.C2261q;
import p121i3.C3179i;
import p121i3.InterfaceC3175e;
import p250r1.C6455e;

/* JADX INFO: renamed from: p.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5826a implements InterfaceC5907z0 {

    /* JADX INFO: renamed from: a */
    public final ViewConfiguration f18253a;

    public C5826a(ViewConfiguration viewConfiguration) {
        this.f18253a = viewConfiguration;
    }

    @Override // p219p.InterfaceC5907z0
    /* JADX INFO: renamed from: a */
    public long mo23477a(InterfaceC3175e interfaceC3175e, C2261q c2261q, long j10) {
        float f10 = -m23479e(interfaceC3175e);
        float f11 = -m23478d(interfaceC3175e);
        List listM8216c = c2261q.m8216c();
        C6455e c6455eM25550d = C6455e.m25550d(C6455e.f20314b.m25569c());
        int size = listM8216c.size();
        for (int i10 = 0; i10 < size; i10++) {
            c6455eM25550d = C6455e.m25550d(C6455e.m25563q(c6455eM25550d.m25566t(), ((C2236d0) listM8216c.get(i10)).m8082m()));
        }
        long jM25566t = c6455eM25550d.m25566t();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM25566t >> 32)) * f11;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM25566t & 4294967295L)) * f10;
        return C6455e.m25551e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public final float m23478d(InterfaceC3175e interfaceC3175e) {
        return Build.VERSION.SDK_INT > 26 ? C5845e2.f18343a.m23544a(this.f18253a) : interfaceC3175e.mo1233i1(C3179i.m12003k(64));
    }

    /* JADX INFO: renamed from: e */
    public final float m23479e(InterfaceC3175e interfaceC3175e) {
        return Build.VERSION.SDK_INT > 26 ? C5845e2.f18343a.m23545b(this.f18253a) : interfaceC3175e.mo1233i1(C3179i.m12003k(64));
    }
}
