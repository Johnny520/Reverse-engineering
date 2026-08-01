package p067eb;

import java.util.Iterator;
import java.util.List;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1052o0;
import p024b9.C1038h0;
import p082fb.AbstractC2411m;
import p082fb.InterfaceC2407i;
import p082fb.InterfaceC2412n;
import p098g9.InterfaceC2557k;
import p213oa.C5692c;
import p243q9.InterfaceC6328c;
import p243q9.InterfaceC6333h;

/* JADX INFO: renamed from: eb.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2060a implements InterfaceC6333h {

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ InterfaceC2557k[] f5767r = {AbstractC1052o0.m3814i(new C1038h0(C2060a.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: q */
    public final InterfaceC2407i f5768q;

    public C2060a(InterfaceC2412n interfaceC2412n, InterfaceC0173a interfaceC0173a) {
        interfaceC2412n.getClass();
        interfaceC0173a.getClass();
        this.f5768q = interfaceC2412n.mo8663f(interfaceC0173a);
    }

    /* JADX INFO: renamed from: a */
    public final List m7414a() {
        return (List) AbstractC2411m.m8702a(this.f5768q, this, f5767r[0]);
    }

    @Override // p243q9.InterfaceC6333h
    /* JADX INFO: renamed from: b */
    public InterfaceC6328c mo3926b(C5692c c5692c) {
        return InterfaceC6333h.b.m25005a(this, c5692c);
    }

    @Override // p243q9.InterfaceC6333h
    /* JADX INFO: renamed from: i */
    public boolean mo3927i(C5692c c5692c) {
        return InterfaceC6333h.b.m25006b(this, c5692c);
    }

    @Override // p243q9.InterfaceC6333h
    public boolean isEmpty() {
        return m7414a().isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return m7414a().iterator();
    }
}
