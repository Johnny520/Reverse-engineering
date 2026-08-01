package p273s9;

import gb.C2663f2;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p213oa.C5695f;
import p213oa.C5697h;
import p229p9.AbstractC6043u;
import p229p9.EnumC5996e0;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC5988b1;
import p229p9.InterfaceC5992d;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6016l;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6025o;
import p229p9.InterfaceC6056z;
import p243q9.InterfaceC6333h;

/* JADX INFO: renamed from: s9.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C7217i extends AbstractC7237s implements InterfaceC5992d {

    /* JADX INFO: renamed from: U */
    public final boolean f23938U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7217i(InterfaceC5995e interfaceC5995e, InterfaceC6016l interfaceC6016l, InterfaceC6333h interfaceC6333h, boolean z10, InterfaceC5986b.a aVar, InterfaceC6003g1 interfaceC6003g1) {
        super(interfaceC5995e, interfaceC6016l, interfaceC6333h, C5697h.f17924j, aVar, interfaceC6003g1);
        if (interfaceC5995e == null) {
            m28494N(0);
        }
        if (interfaceC6333h == null) {
            m28494N(1);
        }
        if (aVar == null) {
            m28494N(2);
        }
        if (interfaceC6003g1 == null) {
            m28494N(3);
        }
        this.f23938U = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void m28494N(int r8) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p273s9.C7217i.m28494N(int):void");
    }

    /* JADX INFO: renamed from: t1 */
    public static C7217i m28495t1(InterfaceC5995e interfaceC5995e, InterfaceC6333h interfaceC6333h, boolean z10, InterfaceC6003g1 interfaceC6003g1) {
        if (interfaceC5995e == null) {
            m28494N(4);
        }
        if (interfaceC6333h == null) {
            m28494N(5);
        }
        if (interfaceC6003g1 == null) {
            m28494N(6);
        }
        return new C7217i(interfaceC5995e, null, interfaceC6333h, z10, InterfaceC5986b.a.DECLARATION, interfaceC6003g1);
    }

    @Override // p273s9.AbstractC7237s, p229p9.InterfaceC5986b
    /* JADX INFO: renamed from: B0 */
    public void mo12635B0(Collection collection) {
        if (collection == null) {
            m28494N(22);
        }
    }

    @Override // p229p9.InterfaceC6016l
    /* JADX INFO: renamed from: G */
    public boolean mo24019G() {
        return this.f23938U;
    }

    @Override // p229p9.InterfaceC6016l
    /* JADX INFO: renamed from: H */
    public InterfaceC5995e mo24020H() {
        InterfaceC5995e interfaceC5995eMo7443b = mo7443b();
        if (interfaceC5995eMo7443b == null) {
            m28494N(18);
        }
        return interfaceC5995eMo7443b;
    }

    @Override // p273s9.AbstractC7237s, p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: M0 */
    public Object mo12663M0(InterfaceC6025o interfaceC6025o, Object obj) {
        return interfaceC6025o.mo13696c(this, obj);
    }

    @Override // p273s9.AbstractC7237s, p273s9.AbstractC7227n, p273s9.AbstractC7225m, p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: a */
    public InterfaceC5992d mo12664a() {
        InterfaceC5992d interfaceC5992d = (InterfaceC5992d) super.mo12664a();
        if (interfaceC5992d == null) {
            m28494N(19);
        }
        return interfaceC5992d;
    }

    @Override // p273s9.AbstractC7237s, p229p9.InterfaceC6056z, p229p9.InterfaceC6009i1
    /* JADX INFO: renamed from: c */
    public InterfaceC5992d mo7503c(C2663f2 c2663f2) {
        if (c2663f2 == null) {
            m28494N(20);
        }
        return (InterfaceC5992d) super.mo7503c(c2663f2);
    }

    @Override // p273s9.AbstractC7237s, p229p9.InterfaceC6056z, p229p9.InterfaceC5986b, p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: e */
    public Collection mo12674e() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            m28494N(21);
        }
        return set;
    }

    /* JADX INFO: renamed from: q1 */
    public final List m28496q1() {
        InterfaceC5995e interfaceC5995eMo7443b = mo7443b();
        if (interfaceC5995eMo7443b.mo7442K0().isEmpty()) {
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                m28494N(16);
            }
            return list;
        }
        List listMo7442K0 = interfaceC5995eMo7443b.mo7442K0();
        if (listMo7442K0 == null) {
            m28494N(15);
        }
        return listMo7442K0;
    }

    /* JADX INFO: renamed from: r1 */
    public InterfaceC5988b1 m28497r1() {
        InterfaceC5995e interfaceC5995eMo7443b = mo7443b();
        if (!interfaceC5995eMo7443b.mo5577S()) {
            return null;
        }
        InterfaceC6019m interfaceC6019mMo7443b = interfaceC5995eMo7443b.mo7443b();
        if (interfaceC6019mMo7443b instanceof InterfaceC5995e) {
            return ((InterfaceC5995e) interfaceC6019mMo7443b).mo23999P0();
        }
        return null;
    }

    @Override // p229p9.InterfaceC5986b
    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
    public InterfaceC5992d mo12636M(InterfaceC6019m interfaceC6019m, EnumC5996e0 enumC5996e0, AbstractC6043u abstractC6043u, InterfaceC5986b.a aVar, boolean z10) {
        InterfaceC5992d interfaceC5992d = (InterfaceC5992d) super.m28596Q0(interfaceC6019m, enumC5996e0, abstractC6043u, aVar, z10);
        if (interfaceC5992d == null) {
            m28494N(27);
        }
        return interfaceC5992d;
    }

    @Override // p273s9.AbstractC7237s
    /* JADX INFO: renamed from: u1 */
    public C7217i mo423u1(InterfaceC6019m interfaceC6019m, InterfaceC6056z interfaceC6056z, InterfaceC5986b.a aVar, C5695f c5695f, InterfaceC6333h interfaceC6333h, InterfaceC6003g1 interfaceC6003g1) {
        if (interfaceC6019m == null) {
            m28494N(23);
        }
        if (aVar == null) {
            m28494N(24);
        }
        if (interfaceC6333h == null) {
            m28494N(25);
        }
        if (interfaceC6003g1 == null) {
            m28494N(26);
        }
        InterfaceC5986b.a aVar2 = InterfaceC5986b.a.DECLARATION;
        if (aVar == aVar2 || aVar == InterfaceC5986b.a.SYNTHESIZED) {
            return new C7217i((InterfaceC5995e) interfaceC6019m, this, interfaceC6333h, this.f23938U, aVar2, interfaceC6003g1);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC6019m + "\nkind: " + aVar);
    }

    @Override // p273s9.AbstractC7227n, p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public InterfaceC5995e mo7443b() {
        InterfaceC5995e interfaceC5995e = (InterfaceC5995e) super.mo7443b();
        if (interfaceC5995e == null) {
            m28494N(17);
        }
        return interfaceC5995e;
    }

    /* JADX INFO: renamed from: w1 */
    public C7217i m28500w1(List list, AbstractC6043u abstractC6043u) {
        if (list == null) {
            m28494N(13);
        }
        if (abstractC6043u == null) {
            m28494N(14);
        }
        m28501x1(list, abstractC6043u, mo7443b().mo5594z());
        return this;
    }

    /* JADX INFO: renamed from: x1 */
    public C7217i m28501x1(List list, AbstractC6043u abstractC6043u, List list2) {
        if (list == null) {
            m28494N(10);
        }
        if (abstractC6043u == null) {
            m28494N(11);
        }
        if (list2 == null) {
            m28494N(12);
        }
        super.mo28569X0(null, m28497r1(), m28496q1(), list2, list, null, EnumC5996e0.f18936r, abstractC6043u);
        return this;
    }
}
