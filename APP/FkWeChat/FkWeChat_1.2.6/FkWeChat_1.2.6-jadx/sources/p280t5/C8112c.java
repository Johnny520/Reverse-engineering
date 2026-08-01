package p280t5;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import p239q5.C6267r;
import p239q5.C6268s;
import p280t5.AbstractC8131v;

/* JADX INFO: renamed from: t5.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C8112c {

    /* JADX INFO: renamed from: a */
    public final C8132w f27069a;

    /* JADX INFO: renamed from: b */
    public final int f27070b;

    /* JADX INFO: renamed from: c */
    public final BitSet f27071c;

    /* JADX INFO: renamed from: d */
    public final ArrayList[] f27072d;

    /* JADX INFO: renamed from: t5.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a implements AbstractC8131v.a {

        /* JADX INFO: renamed from: a */
        public BitSet f27073a;

        public a(BitSet bitSet) {
            this.f27073a = bitSet;
        }

        @Override // p280t5.AbstractC8131v.a
        /* JADX INFO: renamed from: a */
        public void mo31346a(C8123n c8123n) {
            if (C8112c.m31341b(c8123n)) {
                return;
            }
            this.f27073a.set(c8123n.m31516n().m24754t());
        }

        @Override // p280t5.AbstractC8131v.a
        /* JADX INFO: renamed from: b */
        public void mo31347b(C8121l c8121l) {
            C6267r c6267rM31516n = c8121l.m31516n();
            if (C8112c.m31341b(c8121l) || c6267rM31516n == null) {
                return;
            }
            this.f27073a.set(c6267rM31516n.m24754t());
        }

        @Override // p280t5.AbstractC8131v.a
        /* JADX INFO: renamed from: c */
        public void mo31348c(C8121l c8121l) {
            if (C8112c.m31341b(c8121l)) {
                return;
            }
            this.f27073a.set(c8121l.m31516n().m24754t());
        }
    }

    public C8112c(C8132w c8132w) {
        this.f27069a = c8132w;
        int iM31556u = c8132w.m31556u();
        this.f27070b = iM31556u;
        this.f27071c = new BitSet(iM31556u);
        this.f27072d = c8132w.m31557v();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m31341b(AbstractC8131v abstractC8131v) {
        if (abstractC8131v == null) {
            return true;
        }
        return abstractC8131v.mo31419p();
    }

    /* JADX INFO: renamed from: d */
    public static void m31342d(C8132w c8132w) {
        new C8112c(c8132w).m31345f();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m31343c(int i10, BitSet bitSet) {
        if (bitSet != null && bitSet.get(i10)) {
            return true;
        }
        Iterator it = this.f27072d[i10].iterator();
        while (it.hasNext()) {
            if (m31341b((AbstractC8131v) it.next())) {
                return false;
            }
        }
        if (bitSet == null) {
            bitSet = new BitSet(this.f27070b);
        }
        bitSet.set(i10);
        Iterator it2 = this.f27072d[i10].iterator();
        while (it2.hasNext()) {
            C6267r c6267rM31516n = ((AbstractC8131v) it2.next()).m31516n();
            if (c6267rM31516n == null || !m31343c(c6267rM31516n.m24754t(), bitSet)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m31344e() {
        HashSet hashSet = new HashSet();
        BitSet bitSetM31543g = this.f27069a.m31543g();
        ArrayList arrayListM31549m = this.f27069a.m31549m();
        int i10 = 0;
        while (true) {
            int iNextClearBit = bitSetM31543g.nextClearBit(i10);
            if (iNextClearBit >= arrayListM31549m.size()) {
                this.f27069a.m31545i(hashSet);
                return;
            }
            C8128s c8128s = (C8128s) arrayListM31549m.get(iNextClearBit);
            i10 = iNextClearBit + 1;
            for (int i11 = 0; i11 < c8128s.m31492q().size(); i11++) {
                AbstractC8131v abstractC8131v = (AbstractC8131v) c8128s.m31492q().get(i11);
                C6268s c6268sMo31418o = abstractC8131v.mo31418o();
                int size = c6268sMo31418o.size();
                if (size != 0) {
                    hashSet.add(abstractC8131v);
                }
                for (int i12 = 0; i12 < size; i12++) {
                    this.f27072d[c6268sMo31418o.m24769G(i12).m24754t()].remove(abstractC8131v);
                }
                C6267r c6267rM31516n = abstractC8131v.m31516n();
                if (c6267rM31516n != null) {
                    for (AbstractC8131v abstractC8131v2 : this.f27072d[c6267rM31516n.m24754t()]) {
                        if (abstractC8131v2 instanceof C8123n) {
                            ((C8123n) abstractC8131v2).m31436H(c6267rM31516n);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: f */
    public final void m31345f() {
        m31344e();
        HashSet hashSet = new HashSet();
        this.f27069a.m31548l(new a(this.f27071c));
        while (true) {
            int iNextSetBit = this.f27071c.nextSetBit(0);
            if (iNextSetBit < 0) {
                this.f27069a.m31545i(hashSet);
                return;
            }
            this.f27071c.clear(iNextSetBit);
            if (this.f27072d[iNextSetBit].size() == 0 || m31343c(iNextSetBit, null)) {
                AbstractC8131v abstractC8131vM31550n = this.f27069a.m31550n(iNextSetBit);
                if (!hashSet.contains(abstractC8131vM31550n)) {
                    C6268s c6268sMo31418o = abstractC8131vM31550n.mo31418o();
                    int size = c6268sMo31418o.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        C6267r c6267rM24769G = c6268sMo31418o.m24769G(i10);
                        this.f27072d[c6267rM24769G.m24754t()].remove(abstractC8131vM31550n);
                        if (!m31341b(this.f27069a.m31550n(c6267rM24769G.m24754t()))) {
                            this.f27071c.set(c6267rM24769G.m24754t());
                        }
                    }
                    hashSet.add(abstractC8131vM31550n);
                }
            }
        }
    }
}
