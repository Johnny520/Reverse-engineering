package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexbridge.C0002c;
import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.code.AbstractC0171a;
import fun.box001.internal.dexformat.writer.code.C0190t;
import fun.box001.internal.dexformat.writer.code.C0191u;
import fun.box001.internal.dexformat.writer.data.C0193a;
import fun.box001.internal.dexformat.writer.data.C0195c;
import fun.box001.internal.dexmaker.AbstractC0007d;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: g.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0113x extends AbstractC0087J {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f431f;

    /* JADX INFO: renamed from: g */
    private final Object f432g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0113x(C0100k c0100k, int i2) {
        super("method_handles", c0100k, 8);
        this.f431f = i2;
        if (i2 == 1) {
            super("proto_ids", c0100k, 4);
            this.f432g = new TreeMap();
            return;
        }
        if (i2 == 2) {
            super("string_ids", c0100k, 4);
            this.f432g = new TreeMap();
            return;
        }
        if (i2 == 3) {
            super("type_ids", c0100k, 4);
            this.f432g = new TreeMap();
        } else if (i2 != 4) {
            this.f432g = new TreeMap();
        } else {
            super(null, c0100k, 4);
            C0105p c0105p = new C0105p();
            c0105p.m320h(0);
            this.f432g = Collections.singletonList(c0105p);
        }
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0082E
    /* JADX INFO: renamed from: f */
    public final Collection mo225f() {
        int i2 = this.f431f;
        Object obj = this.f432g;
        switch (i2) {
        }
        return ((TreeMap) obj).values();
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0087J
    /* JADX INFO: renamed from: o */
    protected final void mo255o() {
        int i2 = this.f431f;
        Object obj = this.f432g;
        int i3 = 0;
        switch (i2) {
            case 0:
                Iterator it = ((TreeMap) obj).values().iterator();
                if (it.hasNext()) {
                    AbstractC0007d.m47a(it.next());
                    throw null;
                }
                return;
            case 1:
                Iterator it2 = mo225f().iterator();
                while (it2.hasNext()) {
                    ((C0081D) it2.next()).m320h(i3);
                    i3++;
                }
                return;
            case 2:
                Iterator it3 = ((TreeMap) obj).values().iterator();
                while (it3.hasNext()) {
                    ((C0084G) it3.next()).m320h(i3);
                    i3++;
                }
                return;
            case 3:
                Iterator it4 = mo225f().iterator();
                while (it4.hasNext()) {
                    ((C0085H) it4.next()).m320h(i3);
                    i3++;
                }
                return;
            default:
                return;
        }
    }

    /* JADX INFO: renamed from: p */
    public final AbstractC0107r m327p(AbstractC0171a abstractC0171a) {
        int i2 = this.f431f;
        Object obj = this.f432g;
        switch (i2) {
            case 0:
                if (abstractC0171a == null) {
                    throw new NullPointerException("cst == null");
                }
                m250j();
                AbstractC0007d.m47a(abstractC0171a);
                AbstractC0107r abstractC0107r = (AbstractC0107r) ((TreeMap) obj).get(null);
                if (abstractC0107r != null) {
                    return abstractC0107r;
                }
                throw new IllegalArgumentException("not found");
            case 1:
                if (abstractC0171a != null) {
                    throw new IllegalArgumentException("cst not instance of CstProtoRef");
                }
                throw new NullPointerException("cst == null");
            case 2:
                if (abstractC0171a == null) {
                    throw new NullPointerException("cst == null");
                }
                m250j();
                AbstractC0107r abstractC0107r2 = (AbstractC0107r) ((TreeMap) obj).get((C0190t) abstractC0171a);
                if (abstractC0107r2 != null) {
                    return abstractC0107r2;
                }
                throw new IllegalArgumentException("not found");
            default:
                if (abstractC0171a == null) {
                    throw new NullPointerException("cst == null");
                }
                m250j();
                AbstractC0107r abstractC0107r3 = (AbstractC0107r) ((TreeMap) obj).get(((C0191u) abstractC0171a).m451g());
                if (abstractC0107r3 != null) {
                    return abstractC0107r3;
                }
                throw new IllegalArgumentException("not found: " + abstractC0171a);
        }
    }

    /* JADX INFO: renamed from: q */
    public final int m328q(C0190t c0190t) {
        if (c0190t == null) {
            throw new NullPointerException("string == null");
        }
        m250j();
        C0084G c0084g = (C0084G) ((TreeMap) this.f432g).get(c0190t);
        if (c0084g != null) {
            return c0084g.m317e();
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: r */
    public final int m329r(C0191u c0191u) {
        if (c0191u != null) {
            return m331t(c0191u.m451g());
        }
        throw new NullPointerException("type == null");
    }

    /* JADX INFO: renamed from: s */
    public final int m330s(C0193a c0193a) {
        if (c0193a == null) {
            throw new NullPointerException("prototype == null");
        }
        m250j();
        C0081D c0081d = (C0081D) ((TreeMap) this.f432g).get(c0193a);
        if (c0081d != null) {
            return c0081d.m317e();
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: t */
    public final int m331t(C0195c c0195c) {
        if (c0195c == null) {
            throw new NullPointerException("type == null");
        }
        m250j();
        C0085H c0085h = (C0085H) ((TreeMap) this.f432g).get(c0195c);
        if (c0085h != null) {
            return c0085h.m317e();
        }
        throw new IllegalArgumentException("not found: " + c0195c);
    }

    /* JADX INFO: renamed from: u */
    public final void m332u(C0190t c0190t) {
        C0084G c0084g = new C0084G(c0190t);
        synchronized (this) {
            m251k();
            C0190t c0190tM253i = c0084g.m253i();
            if (((C0084G) ((TreeMap) this.f432g).get(c0190tM253i)) == null) {
                ((TreeMap) this.f432g).put(c0190tM253i, c0084g);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final synchronized void m333v(C0191u c0191u) {
        if (c0191u == null) {
            throw new NullPointerException("type == null");
        }
        m251k();
        C0195c c0195cM451g = c0191u.m451g();
        if (((C0085H) ((TreeMap) this.f432g).get(c0195cM451g)) == null) {
            ((TreeMap) this.f432g).put(c0195cM451g, new C0085H(c0191u));
        }
    }

    /* JADX INFO: renamed from: w */
    public final synchronized void m334w(C0193a c0193a) {
        if (c0193a == null) {
            throw new NullPointerException("prototype == null");
        }
        m251k();
        if (((C0081D) ((TreeMap) this.f432g).get(c0193a)) == null) {
            ((TreeMap) this.f432g).put(c0193a, new C0081D(c0193a));
        }
    }

    /* JADX INFO: renamed from: x */
    public final synchronized void m335x(C0195c c0195c) {
        if (c0195c == null) {
            throw new NullPointerException("type == null");
        }
        m251k();
        if (((C0085H) ((TreeMap) this.f432g).get(c0195c)) == null) {
            ((TreeMap) this.f432g).put(c0195c, new C0085H(new C0191u(c0195c)));
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m336y(C0202d c0202d) {
        int iM247e;
        int i2 = this.f431f;
        Object obj = this.f432g;
        switch (i2) {
            case 1:
                m250j();
                int size = ((TreeMap) obj).size();
                iM247e = size != 0 ? m247e() : 0;
                if (size > 65536) {
                    throw new UnsupportedOperationException("too many proto ids");
                }
                if (c0202d.m486d()) {
                    c0202d.m484b(4, "proto_ids_size:  ".concat(RuntimeDexGenerator.m13s(size)));
                    c0202d.m484b(4, "proto_ids_off:   ".concat(RuntimeDexGenerator.m13s(iM247e)));
                }
                c0202d.m497q(size);
                c0202d.m497q(iM247e);
                return;
            case 2:
                m250j();
                int size2 = ((TreeMap) obj).size();
                iM247e = size2 != 0 ? m247e() : 0;
                if (c0202d.m486d()) {
                    c0202d.m484b(4, "string_ids_size: ".concat(RuntimeDexGenerator.m13s(size2)));
                    c0202d.m484b(4, "string_ids_off:  ".concat(RuntimeDexGenerator.m13s(iM247e)));
                }
                c0202d.m497q(size2);
                c0202d.m497q(iM247e);
                return;
            default:
                m250j();
                int size3 = ((TreeMap) obj).size();
                iM247e = size3 != 0 ? m247e() : 0;
                if (size3 > 65536) {
                    throw new C0002c(String.format("Too many type identifiers to fit in one dex file: %1$d; max is %2$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.", Integer.valueOf(mo225f().size()), 65536));
                }
                if (c0202d.m486d()) {
                    c0202d.m484b(4, "type_ids_size:   ".concat(RuntimeDexGenerator.m13s(size3)));
                    c0202d.m484b(4, "type_ids_off:    ".concat(RuntimeDexGenerator.m13s(iM247e)));
                }
                c0202d.m497q(size3);
                c0202d.m497q(iM247e);
                return;
        }
    }
}
