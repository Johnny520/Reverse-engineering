package p233q;

import androidx.compose.foundation.lazy.layout.InterfaceC0391k0;
import java.util.Iterator;
import java.util.List;
import p080f9.AbstractC2368o;
import p121i3.InterfaceC3175e;
import p219p.EnumC5898w0;
import p233q.InterfaceC6093o;
import p303v.C8722t0;
import p303v.InterfaceC8709n;
import p303v.InterfaceC8729x;

/* JADX INFO: renamed from: q.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6084f {

    /* JADX INFO: renamed from: q.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC6092n {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8722t0 f19087a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC6093o f19088b;

        public a(C8722t0 c8722t0, InterfaceC6093o interfaceC6093o) {
            this.f19087a = c8722t0;
            this.f19088b = interfaceC6093o;
        }

        @Override // p233q.InterfaceC6092n
        /* JADX INFO: renamed from: a */
        public float mo24209a(float f10, float f11) {
            return AbstractC2368o.m8577d(Math.abs(f11) - m24211c(), 0.0f) * Math.signum(f11);
        }

        @Override // p233q.InterfaceC6092n
        /* JADX INFO: renamed from: b */
        public float mo24210b(float f10) {
            List listMo33395k = m24212d().mo33395k();
            InterfaceC6093o interfaceC6093o = this.f19088b;
            int size = listMo33395k.size();
            float f11 = Float.NEGATIVE_INFINITY;
            float f12 = Float.POSITIVE_INFINITY;
            for (int i10 = 0; i10 < size; i10++) {
                InterfaceC8709n interfaceC8709n = (InterfaceC8709n) listMo33395k.get(i10);
                InterfaceC0391k0 interfaceC0391k0 = interfaceC8709n instanceof InterfaceC0391k0 ? (InterfaceC0391k0) interfaceC8709n : null;
                if (interfaceC0391k0 == null || !interfaceC0391k0.mo1242e()) {
                    float fM24247a = AbstractC6094p.m24247a(AbstractC6084f.m24208d(m24212d()), m24212d().mo33391g(), m24212d().mo33388c(), interfaceC8709n.mo33408a(), interfaceC8709n.getOffset(), interfaceC8709n.getIndex(), interfaceC6093o, m24212d().mo33393i());
                    if (fM24247a <= 0.0f && fM24247a > f11) {
                        f11 = fM24247a;
                    }
                    if (fM24247a >= 0.0f && fM24247a < f12) {
                        f12 = fM24247a;
                    }
                }
            }
            return AbstractC6091m.m24241j(AbstractC6084f.m24207c(this.f19087a.m33497v(), f10), f11, f12);
        }

        /* JADX INFO: renamed from: c */
        public final int m24211c() {
            InterfaceC8729x interfaceC8729xM24212d = m24212d();
            int iMo33408a = 0;
            if (interfaceC8729xM24212d.mo33395k().isEmpty()) {
                return 0;
            }
            int size = interfaceC8729xM24212d.mo33395k().size();
            Iterator it = interfaceC8729xM24212d.mo33395k().iterator();
            while (it.hasNext()) {
                iMo33408a += ((InterfaceC8709n) it.next()).mo33408a();
            }
            return iMo33408a / size;
        }

        /* JADX INFO: renamed from: d */
        public final InterfaceC8729x m24212d() {
            return this.f19087a.m33474B();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC6092n m24205a(C8722t0 c8722t0, InterfaceC6093o interfaceC6093o) {
        return new a(c8722t0, interfaceC6093o);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC6092n m24206b(C8722t0 c8722t0, InterfaceC6093o interfaceC6093o, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC6093o = InterfaceC6093o.a.f19136a;
        }
        return m24205a(c8722t0, interfaceC6093o);
    }

    /* JADX INFO: renamed from: c */
    public static final int m24207c(InterfaceC3175e interfaceC3175e, float f10) {
        return Math.abs(f10) < interfaceC3175e.mo1233i1(AbstractC6091m.m24244m()) ? AbstractC6082d.f19083a.m24199a() : f10 > 0.0f ? AbstractC6082d.f19083a.m24200b() : AbstractC6082d.f19083a.m24201c();
    }

    /* JADX INFO: renamed from: d */
    public static final int m24208d(InterfaceC8729x interfaceC8729x) {
        return (int) (interfaceC8729x.mo33390f() == EnumC5898w0.f18786q ? interfaceC8729x.mo33387b() & 4294967295L : interfaceC8729x.mo33387b() >> 32);
    }
}
