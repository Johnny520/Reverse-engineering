package p273s9;

import gb.AbstractC2706r0;
import gb.C2663f2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p172l8.AbstractC4706m;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5116y;
import p213oa.C5695f;
import p229p9.AbstractC6040t;
import p229p9.AbstractC6043u;
import p229p9.InterfaceC5983a;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6025o;
import p229p9.InterfaceC6039s1;
import p243q9.InterfaceC6333h;
import p319w2.C9079i0;
import ua.AbstractC8590g;

/* JADX INFO: renamed from: s9.u0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C7242u0 extends AbstractC7246w0 implements InterfaceC6039s1 {

    /* JADX INFO: renamed from: B */
    public static final a f24090B = new a(null);

    /* JADX INFO: renamed from: A */
    public final InterfaceC6039s1 f24091A;

    /* JADX INFO: renamed from: v */
    public final int f24092v;

    /* JADX INFO: renamed from: w */
    public final boolean f24093w;

    /* JADX INFO: renamed from: x */
    public final boolean f24094x;

    /* JADX INFO: renamed from: y */
    public final boolean f24095y;

    /* JADX INFO: renamed from: z */
    public final AbstractC2706r0 f24096z;

    /* JADX INFO: renamed from: s9.u0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends C7242u0 {

        /* JADX INFO: renamed from: C */
        public final InterfaceC4705l f24097C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC5983a interfaceC5983a, InterfaceC6039s1 interfaceC6039s1, int i10, InterfaceC6333h interfaceC6333h, C5695f c5695f, AbstractC2706r0 abstractC2706r0, boolean z10, boolean z11, boolean z12, AbstractC2706r0 abstractC2706r02, InterfaceC6003g1 interfaceC6003g1, InterfaceC0173a interfaceC0173a) {
            super(interfaceC5983a, interfaceC6039s1, i10, interfaceC6333h, c5695f, abstractC2706r0, z10, z11, z12, abstractC2706r02, interfaceC6003g1);
            interfaceC5983a.getClass();
            interfaceC6333h.getClass();
            c5695f.getClass();
            abstractC2706r0.getClass();
            interfaceC6003g1.getClass();
            interfaceC0173a.getClass();
            this.f24097C = AbstractC4706m.m18787a(interfaceC0173a);
        }

        /* JADX INFO: renamed from: U0 */
        public static final List m28671U0(b bVar) {
            return bVar.m28672V0();
        }

        @Override // p273s9.C7242u0, p229p9.InterfaceC6039s1
        /* JADX INFO: renamed from: F */
        public InterfaceC6039s1 mo24067F(InterfaceC5983a interfaceC5983a, C5695f c5695f, int i10) {
            interfaceC5983a.getClass();
            c5695f.getClass();
            InterfaceC6333h annotations = getAnnotations();
            annotations.getClass();
            AbstractC2706r0 type = getType();
            type.getClass();
            boolean zMo24071y0 = mo24071y0();
            boolean zMo24069h0 = mo24069h0();
            boolean zMo24068d0 = mo24068d0();
            AbstractC2706r0 abstractC2706r0Mo24070o0 = mo24070o0();
            InterfaceC6003g1 interfaceC6003g1 = InterfaceC6003g1.f18958a;
            interfaceC6003g1.getClass();
            return new b(interfaceC5983a, null, i10, annotations, c5695f, type, zMo24071y0, zMo24069h0, zMo24068d0, abstractC2706r0Mo24070o0, interfaceC6003g1, new C7244v0(this));
        }

        /* JADX INFO: renamed from: V0 */
        public final List m28672V0() {
            return (List) this.f24097C.getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7242u0(InterfaceC5983a interfaceC5983a, InterfaceC6039s1 interfaceC6039s1, int i10, InterfaceC6333h interfaceC6333h, C5695f c5695f, AbstractC2706r0 abstractC2706r0, boolean z10, boolean z11, boolean z12, AbstractC2706r0 abstractC2706r02, InterfaceC6003g1 interfaceC6003g1) {
        super(interfaceC5983a, interfaceC6333h, c5695f, abstractC2706r0, interfaceC6003g1);
        interfaceC5983a.getClass();
        interfaceC6333h.getClass();
        c5695f.getClass();
        abstractC2706r0.getClass();
        interfaceC6003g1.getClass();
        this.f24092v = i10;
        this.f24093w = z10;
        this.f24094x = z11;
        this.f24095y = z12;
        this.f24096z = abstractC2706r02;
        this.f24091A = interfaceC6039s1 == null ? this : interfaceC6039s1;
    }

    /* JADX INFO: renamed from: Q0 */
    public static final C7242u0 m28666Q0(InterfaceC5983a interfaceC5983a, InterfaceC6039s1 interfaceC6039s1, int i10, InterfaceC6333h interfaceC6333h, C5695f c5695f, AbstractC2706r0 abstractC2706r0, boolean z10, boolean z11, boolean z12, AbstractC2706r0 abstractC2706r02, InterfaceC6003g1 interfaceC6003g1, InterfaceC0173a interfaceC0173a) {
        return f24090B.m28669a(interfaceC5983a, interfaceC6039s1, i10, interfaceC6333h, c5695f, abstractC2706r0, z10, z11, z12, abstractC2706r02, interfaceC6003g1, interfaceC0173a);
    }

    @Override // p229p9.InterfaceC6039s1
    /* JADX INFO: renamed from: F */
    public InterfaceC6039s1 mo24067F(InterfaceC5983a interfaceC5983a, C5695f c5695f, int i10) {
        interfaceC5983a.getClass();
        c5695f.getClass();
        InterfaceC6333h annotations = getAnnotations();
        annotations.getClass();
        AbstractC2706r0 type = getType();
        type.getClass();
        boolean zMo24071y0 = mo24071y0();
        boolean zMo24069h0 = mo24069h0();
        boolean zMo24068d0 = mo24068d0();
        AbstractC2706r0 abstractC2706r0Mo24070o0 = mo24070o0();
        InterfaceC6003g1 interfaceC6003g1 = InterfaceC6003g1.f18958a;
        interfaceC6003g1.getClass();
        return new C7242u0(interfaceC5983a, null, i10, annotations, c5695f, type, zMo24071y0, zMo24069h0, zMo24068d0, abstractC2706r0Mo24070o0, interfaceC6003g1);
    }

    @Override // p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: M0 */
    public Object mo12663M0(InterfaceC6025o interfaceC6025o, Object obj) {
        interfaceC6025o.getClass();
        return interfaceC6025o.mo24032a(this, obj);
    }

    /* JADX INFO: renamed from: R0 */
    public Void m28667R0() {
        return null;
    }

    @Override // p229p9.InterfaceC6009i1
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public InterfaceC6039s1 mo7503c(C2663f2 c2663f2) {
        c2663f2.getClass();
        if (c2663f2.m9390k()) {
            return this;
        }
        C9079i0.m35296a();
        return null;
    }

    @Override // p273s9.AbstractC7227n, p273s9.AbstractC7225m, p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: a */
    public InterfaceC6039s1 mo12664a() {
        InterfaceC6039s1 interfaceC6039s1 = this.f24091A;
        return interfaceC6039s1 == this ? this : interfaceC6039s1.mo12664a();
    }

    @Override // p273s9.AbstractC7227n, p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: b */
    public InterfaceC5983a mo7443b() {
        InterfaceC6019m interfaceC6019mMo7443b = super.mo7443b();
        interfaceC6019mMo7443b.getClass();
        return (InterfaceC5983a) interfaceC6019mMo7443b;
    }

    @Override // p229p9.InterfaceC6042t1
    /* JADX INFO: renamed from: c0 */
    public /* bridge */ /* synthetic */ AbstractC8590g mo12673c0() {
        return (AbstractC8590g) m28667R0();
    }

    @Override // p229p9.InterfaceC6039s1
    /* JADX INFO: renamed from: d0 */
    public boolean mo24068d0() {
        return this.f24095y;
    }

    @Override // p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: e */
    public Collection mo12674e() {
        Collection collectionMo12674e = mo7443b().mo12674e();
        collectionMo12674e.getClass();
        Collection collection = collectionMo12674e;
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((InterfaceC6039s1) ((InterfaceC5983a) it.next()).mo12680m().get(getIndex()));
        }
        return arrayList;
    }

    @Override // p229p9.InterfaceC6031q
    /* JADX INFO: renamed from: g */
    public AbstractC6043u mo5587g() {
        AbstractC6043u abstractC6043u = AbstractC6040t.f18987f;
        abstractC6043u.getClass();
        return abstractC6043u;
    }

    @Override // p229p9.InterfaceC6039s1
    public int getIndex() {
        return this.f24092v;
    }

    @Override // p229p9.InterfaceC6039s1
    /* JADX INFO: renamed from: h0 */
    public boolean mo24069h0() {
        return this.f24094x;
    }

    @Override // p229p9.InterfaceC6042t1
    /* JADX INFO: renamed from: n0 */
    public boolean mo12681n0() {
        return false;
    }

    @Override // p229p9.InterfaceC6039s1
    /* JADX INFO: renamed from: o0 */
    public AbstractC2706r0 mo24070o0() {
        return this.f24096z;
    }

    @Override // p229p9.InterfaceC6039s1
    /* JADX INFO: renamed from: y0 */
    public boolean mo24071y0() {
        if (!this.f24093w) {
            return false;
        }
        InterfaceC5983a interfaceC5983aMo7443b = mo7443b();
        interfaceC5983aMo7443b.getClass();
        return ((InterfaceC5986b) interfaceC5983aMo7443b).mo12678j().m23992a();
    }

    /* JADX INFO: renamed from: s9.u0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C7242u0 m28669a(InterfaceC5983a interfaceC5983a, InterfaceC6039s1 interfaceC6039s1, int i10, InterfaceC6333h interfaceC6333h, C5695f c5695f, AbstractC2706r0 abstractC2706r0, boolean z10, boolean z11, boolean z12, AbstractC2706r0 abstractC2706r02, InterfaceC6003g1 interfaceC6003g1, InterfaceC0173a interfaceC0173a) {
            interfaceC5983a.getClass();
            interfaceC6333h.getClass();
            c5695f.getClass();
            abstractC2706r0.getClass();
            interfaceC6003g1.getClass();
            return interfaceC0173a == null ? new C7242u0(interfaceC5983a, interfaceC6039s1, i10, interfaceC6333h, c5695f, abstractC2706r0, z10, z11, z12, abstractC2706r02, interfaceC6003g1) : new b(interfaceC5983a, interfaceC6039s1, i10, interfaceC6333h, c5695f, abstractC2706r0, z10, z11, z12, abstractC2706r02, interfaceC6003g1, interfaceC0173a);
        }

        public a() {
        }
    }
}
