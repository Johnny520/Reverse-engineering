package p302ud;

import ae.C0074e;
import be.C0293m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import md.C2825b;
import md.EnumC2824a;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p199nd.AbstractC2986r;
import p199nd.C2982n;
import p233pd.EnumC3400k;
import p246qd.AbstractC3508l;
import p246qd.C3509m;
import p246qd.C3514r;
import p246qd.C3515s;
import p351xe.AbstractC5792m;
import p351xe.AbstractC5798s;
import p351xe.C5791l;

/* JADX INFO: renamed from: ud.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C4320p extends AbstractC2986r {

    /* JADX INFO: renamed from: k */
    public final EnumC3400k f14396k;

    /* JADX INFO: renamed from: l */
    public C3514r f14397l;

    /* JADX INFO: renamed from: m */
    public final List f14398m;

    /* JADX INFO: renamed from: n */
    public int f14399n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4320p(EnumC3400k enumC3400k, List list) {
        this.f14396k = enumC3400k;
        this.f14398m = list;
        this.f14399n = -1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m8678L((AbstractC3508l) it.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public void mo7178I(AbstractC3508l abstractC3508l) {
        this.f14398m.add(abstractC3508l);
        m8678L(abstractC3508l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final boolean m8676J(StringBuilder sb2) {
        List list = this.f14398m;
        if (list.isEmpty()) {
            return false;
        }
        String strM10516j = AbstractC5798s.m10516j(list, ", ");
        if (strM10516j.length() < 120) {
            sb2.append(strM10516j);
            return false;
        }
        sb2.append("\n  ");
        sb2.append(AbstractC5798s.m10516j(list, "\n  "));
        sb2.append('\n');
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public final void m8677K(StringBuilder sb2) {
        if (!this.f9217g.mo6240f()) {
            sb2.append(' ');
            sb2.append(this.f9217g.toString());
        }
        if (this.f9752i != 0) {
            sb2.append(" (LINE:");
            sb2.append(this.f9752i);
            sb2.append(')');
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final void m8678L(AbstractC3508l abstractC3508l) {
        C3514r c3514r;
        C3515s c3515s;
        abstractC3508l.mo7385V(this);
        if (!(abstractC3508l instanceof C3514r) || (c3515s = (c3514r = (C3514r) abstractC3508l).f11440m) == null) {
            return;
        }
        c3515s.m7412q(c3514r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public final String m8679M() {
        StringBuilder sb2 = new StringBuilder();
        m8677K(sb2);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public final boolean m8680N() {
        boolean zMo6235a = this.f9217g.mo6235a(EnumC2824a.f9166s);
        EnumC3400k enumC3400k = this.f14396k;
        if (!zMo6235a) {
            for (AbstractC3508l abstractC3508l : this.f14398m) {
                abstractC3508l.getClass();
                if ((abstractC3508l instanceof C3509m) && !((C3509m) abstractC3508l).f11421l.m8680N()) {
                    return false;
                }
            }
            int iOrdinal = enumC3400k.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 6 && iOrdinal != 8 && iOrdinal != 23 && iOrdinal != 25 && iOrdinal != 28 && iOrdinal != 41 && iOrdinal != 13 && iOrdinal != 14 && iOrdinal != 20 && iOrdinal != 21) {
                return false;
            }
        } else if (enumC3400k == EnumC3400k.f10996z) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public C4320p mo7167O() {
        if (getClass() != C4320p.class) {
            C0086a.m452k("Copy method not implemented in insn class ".concat(getClass().getSimpleName()));
            return null;
        }
        C4320p c4320p = new C4320p(this.f14396k, this.f14398m.size());
        m8681P(c4320p);
        return c4320p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final void m8681P(C4320p c4320p) {
        if (c4320p.f14398m.size() == 0) {
            Iterator it = this.f14398m.iterator();
            while (it.hasNext()) {
                c4320p.mo7178I(((AbstractC3508l) it.next()).mo7374H());
            }
        }
        c4320p.m6225B(this);
        c4320p.m6393H(this);
        c4320p.f9752i = this.f9752i;
        c4320p.f9753j = this.f9753j;
        c4320p.f14399n = this.f14399n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public final C4320p m8682Q(C4322r c4322r) {
        C3514r c3514r = this.f14397l;
        if (c3514r == null) {
            C0086a.m452k("Result in null");
            return null;
        }
        C3514r c3514rM7392d0 = c3514r.m7392d0(c3514r.f11439l, c3514r.f11419i, null);
        c4322r.m8703b0(c3514rM7392d0);
        C4320p c4320pMo7167O = mo7167O();
        c4320pMo7167O.m8688d0(c3514rM7392d0);
        return c4320pMo7167O;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public final C4320p m8683R() {
        C4320p c4320pMo7167O = mo7167O();
        C3514r c3514r = this.f14397l;
        if (c3514r == null) {
            return c4320pMo7167O;
        }
        if (c3514r.f11440m == null) {
            c4320pMo7167O.m8688d0(c3514r.mo7374H());
            return c4320pMo7167O;
        }
        C0086a.m452k("Can't copy if SSA var is set");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public AbstractC3508l mo7179S(int i9) {
        return (AbstractC3508l) this.f14398m.get(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public final int m8684T(AbstractC3508l abstractC3508l) {
        List list = this.f14398m;
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (abstractC3508l == list.get(i9)) {
                return i9;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public void mo8340U(Collection collection) {
        for (AbstractC3508l abstractC3508l : this.f14398m) {
            abstractC3508l.getClass();
            if (abstractC3508l instanceof C3514r) {
                collection.add((C3514r) abstractC3508l);
            } else if (abstractC3508l instanceof C3509m) {
                ((C3509m) abstractC3508l).f11421l.mo8340U(collection);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public final void m8685V(C4320p c4320p) {
        EnumC3400k enumC3400k = this.f14396k;
        EnumC3400k enumC3400k2 = EnumC3400k.f10986p;
        C2825b c2825b = C2825b.f9186a;
        if (enumC3400k != enumC3400k2) {
            m6224A(c4320p, c2825b);
            m6393H(c4320p);
            return;
        }
        this.f9752i = c4320p.f9752i;
        this.f9753j = c4320p.f9753j;
        if (!this.f9217g.mo6235a(EnumC2824a.f9159m)) {
            m6224A(c4320p, c2825b);
            return;
        }
        this.f14399n = c4320p.f14399n;
        m6228E(c2825b);
        m6224A(c4320p, c2825b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public final boolean m8686W() {
        int iOrdinal = this.f14396k.ordinal();
        return iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public final boolean m8687X(C4320p c4320p) {
        if (this == c4320p) {
            return true;
        }
        return mo7168Y(c4320p) && Objects.equals(this.f14397l, c4320p.f14397l) && Objects.equals(this.f14398m, c4320p.f14398m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public boolean mo7168Y(C4320p c4320p) {
        List list;
        int size;
        if (this == c4320p) {
            return true;
        }
        EnumC3400k enumC3400k = c4320p.f14396k;
        List list2 = c4320p.f14398m;
        if (this.f14396k != enumC3400k || (size = (list = this.f14398m).size()) != list2.size()) {
            return false;
        }
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC3508l abstractC3508l = (AbstractC3508l) list.get(i9);
            AbstractC3508l abstractC3508l2 = (AbstractC3508l) list2.get(i9);
            abstractC3508l.getClass();
            if (abstractC3508l instanceof C3509m) {
                abstractC3508l2.getClass();
                if (!(abstractC3508l2 instanceof C3509m) || !((C3509m) abstractC3508l).f11421l.mo7168Y(((C3509m) abstractC3508l2).f11421l)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public void mo8341Z() {
        C3514r c3514r = this.f14397l;
        if (c3514r != null) {
            C3515s c3515s = c3514r.f11440m;
            if (c3515s == null) {
                C0086a.m452k(AbstractC0255e.m1021j("No SSA var for result arg: ", String.valueOf(c3514r), " from ", String.valueOf(c3514r.f11420j)));
                return;
            }
            C3514r c3514r2 = c3515s.f11444i;
            if (c3514r2 == null) {
                c3515s.f11444i = c3514r;
            } else if (c3514r2 != c3514r) {
                c3514r2.f11440m = null;
                c3515s.f11444i = c3514r;
            }
        }
        for (AbstractC3508l abstractC3508l : this.f14398m) {
            if (abstractC3508l instanceof C3514r) {
                C3514r c3514r3 = (C3514r) abstractC3508l;
                C3515s c3515s2 = c3514r3.f11440m;
                c3515s2.m7412q(c3514r3);
                c3515s2.m7411p();
            } else if (abstractC3508l instanceof C3509m) {
                ((C3509m) abstractC3508l).f11421l.mo8341Z();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public AbstractC3508l mo7180a0(int i9) {
        List list = this.f14398m;
        AbstractC3508l abstractC3508l = (AbstractC3508l) list.get(i9);
        list.remove(i9);
        C5791l.m10477i(null, abstractC3508l);
        return abstractC3508l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public boolean mo7181b0(AbstractC3508l abstractC3508l, AbstractC3508l abstractC3508l2) {
        List list = this.f14398m;
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC3508l abstractC3508l3 = (AbstractC3508l) list.get(i9);
            if (abstractC3508l3 == abstractC3508l) {
                C5791l.m10477i(null, abstractC3508l3);
                mo7182c0(i9, abstractC3508l2);
                return true;
            }
            abstractC3508l3.getClass();
            if ((abstractC3508l3 instanceof C3509m) && ((C3509m) abstractC3508l3).f11421l.mo7181b0(abstractC3508l, abstractC3508l2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public void mo7182c0(int i9, AbstractC3508l abstractC3508l) {
        this.f14398m.set(i9, abstractC3508l);
        m8678L(abstractC3508l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public final void m8688d0(C3514r c3514r) {
        this.f14397l = c3514r;
        if (c3514r != null) {
            c3514r.f11420j = this;
            C3515s c3515s = c3514r.f11440m;
            if (c3515s != null) {
                C3514r c3514r2 = c3515s.f11444i;
                if (c3514r2 == null) {
                    c3515s.f11444i = c3514r;
                } else if (c3514r2 != c3514r) {
                    c3514r2.f11440m = null;
                    c3515s.f11444i = c3514r;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public final Object m8689e0(C2982n c2982n) {
        for (AbstractC3508l abstractC3508l : this.f14398m) {
            abstractC3508l.getClass();
            Object objM8689e0 = abstractC3508l instanceof C3509m ? ((C3509m) abstractC3508l).f11421l.m8689e0(c2982n) : c2982n.apply(abstractC3508l);
            if (objM8689e0 != null) {
                return objM8689e0;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public final void m8690f0(C0074e c0074e) {
        for (AbstractC3508l abstractC3508l : this.f14398m) {
            abstractC3508l.getClass();
            if (abstractC3508l instanceof C3509m) {
                ((C3509m) abstractC3508l).f11421l.m8690f0(c0074e);
            } else {
                c0074e.accept(abstractC3508l);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public final Object m8691g0(C0293m c0293m) {
        Object objM8691g0;
        Object objApply = c0293m.apply(this);
        if (objApply != null) {
            return objApply;
        }
        for (AbstractC3508l abstractC3508l : this.f14398m) {
            abstractC3508l.getClass();
            if ((abstractC3508l instanceof C3509m) && (objM8691g0 = ((C3509m) abstractC3508l).f11421l.m8691g0(c0293m)) != null) {
                return objM8691g0;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    public void mo8342h0(Consumer consumer) {
        consumer.accept(this);
        for (AbstractC3508l abstractC3508l : this.f14398m) {
            abstractC3508l.getClass();
            if (abstractC3508l instanceof C3509m) {
                ((C3509m) abstractC3508l).f11421l.mo8342h0(consumer);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final String m8692k() {
        StringBuilder sb2 = new StringBuilder();
        int i9 = this.f14399n;
        if (i9 != -1) {
            sb2.append(AbstractC5792m.m10487d(i9));
            sb2.append(": ");
        }
        sb2.append(this.f14396k);
        sb2.append(' ');
        C3514r c3514r = this.f14397l;
        if (c3514r != null) {
            sb2.append(c3514r);
            sb2.append(" = ");
        }
        m8676J(sb2);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return m8692k().concat(m8679M());
    }

    public C4320p(EnumC3400k enumC3400k, int i9) {
        this(enumC3400k, i9 == 0 ? Collections.EMPTY_LIST : new ArrayList(i9));
    }
}
