package p298u9;

import java.io.InputStream;
import la.C4723c;
import p051db.C1939a;
import p051db.C1942d;
import p081fa.InterfaceC2379g;
import p111ha.InterfaceC2935v;
import p186m9.C5135p;
import p213oa.C5691b;
import p213oa.C5692c;

/* JADX INFO: renamed from: u9.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8572g implements InterfaceC2935v {

    /* JADX INFO: renamed from: a */
    public final ClassLoader f28613a;

    /* JADX INFO: renamed from: b */
    public final C1942d f28614b;

    public C8572g(ClassLoader classLoader) {
        classLoader.getClass();
        this.f28613a = classLoader;
        this.f28614b = new C1942d();
    }

    @Override // p111ha.InterfaceC2935v
    /* JADX INFO: renamed from: a */
    public InterfaceC2935v.a mo10726a(C5691b c5691b, C4723c c4723c) {
        c5691b.getClass();
        c4723c.getClass();
        return m32987d(AbstractC8573h.m32989b(c5691b));
    }

    @Override // p111ha.InterfaceC2935v
    /* JADX INFO: renamed from: b */
    public InterfaceC2935v.a mo10727b(InterfaceC2379g interfaceC2379g, C4723c c4723c) {
        String strM22994a;
        interfaceC2379g.getClass();
        c4723c.getClass();
        C5692c c5692cMo8616d = interfaceC2379g.mo8616d();
        if (c5692cMo8616d == null || (strM22994a = c5692cMo8616d.m22994a()) == null) {
            return null;
        }
        return m32987d(strM22994a);
    }

    @Override // p037cb.InterfaceC1461a0
    /* JADX INFO: renamed from: c */
    public InputStream mo5752c(C5692c c5692c) {
        c5692c.getClass();
        if (c5692c.m23001h(C5135p.f15523z)) {
            return this.f28614b.m7048a(C1939a.f5416r.m7042r(c5692c));
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC2935v.a m32987d(String str) {
        C8571f c8571fM32986a;
        Class clsM32984a = AbstractC8570e.m32984a(this.f28613a, str);
        if (clsM32984a == null || (c8571fM32986a = C8571f.f28610c.m32986a(clsM32984a)) == null) {
            return null;
        }
        return new InterfaceC2935v.a.C10095a(c8571fM32986a, null, 2, null);
    }
}
