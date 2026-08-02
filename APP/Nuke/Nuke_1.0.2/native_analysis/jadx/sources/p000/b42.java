package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b42 extends x73 {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f554f;

    /* JADX INFO: renamed from: g */
    public final Object f555g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b42(int i, z70 z70Var) {
        super("proto_ids", z70Var, 4);
        this.f554f = i;
        switch (i) {
            case 1:
                super("string_ids", z70Var, 4);
                this.f555g = new TreeMap();
                break;
            case 2:
                super("type_ids", z70Var, 4);
                this.f555g = new TreeMap();
                break;
            case 3:
                super(null, z70Var, 4);
                hs0 hs0Var = new hs0();
                hs0Var.m2417g(0);
                this.f555g = Collections.singletonList(hs0Var);
                break;
            default:
                this.f555g = new TreeMap();
                break;
        }
    }

    @Override // p000.jm2
    /* JADX INFO: renamed from: c */
    public final Collection mo398c() {
        switch (this.f554f) {
            case 0:
                return ((TreeMap) this.f555g).values();
            case 1:
                return ((TreeMap) this.f555g).values();
            case 2:
                return ((TreeMap) this.f555g).values();
            default:
                return (List) this.f555g;
        }
    }

    @Override // p000.x73
    /* JADX INFO: renamed from: k */
    public final void mo399k() {
        int i = this.f554f;
        Object obj = this.f555g;
        int i2 = 0;
        switch (i) {
            case 0:
                Iterator it = ((TreeMap) obj).values().iterator();
                while (it.hasNext()) {
                    ((a42) it.next()).m2417g(i2);
                    i2++;
                }
                break;
            case 1:
                Iterator it2 = ((TreeMap) obj).values().iterator();
                while (it2.hasNext()) {
                    ((jv2) it2.next()).m2417g(i2);
                    i2++;
                }
                break;
            case 2:
                Iterator it3 = ((TreeMap) obj).values().iterator();
                while (it3.hasNext()) {
                    ((b63) it3.next()).m2417g(i2);
                    i2++;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: l */
    public int m400l(q30 q30Var) {
        if (q30Var == null) {
            um2.m5516f("string == null");
            return 0;
        }
        m2518f();
        jv2 jv2Var = (jv2) ((TreeMap) this.f555g).get(q30Var);
        if (jv2Var != null) {
            return jv2Var.m2415e();
        }
        C0676s.m4651j("not found");
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public int m401m(r30 r30Var) {
        if (r30Var != null) {
            return m402n(r30Var.f9342h);
        }
        um2.m5516f("type == null");
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public int m402n(o43 o43Var) {
        if (o43Var == null) {
            um2.m5516f("type == null");
            return 0;
        }
        m2518f();
        b63 b63Var = (b63) ((TreeMap) this.f555g).get(o43Var);
        if (b63Var != null) {
            return b63Var.m2415e();
        }
        C0676s.m4648g("not found: ", o43Var);
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public void m403o(q30 q30Var) {
        jv2 jv2Var = new jv2(q30Var);
        synchronized (this) {
            m2519g();
            if (((jv2) ((TreeMap) this.f555g).get(q30Var)) != null) {
                return;
            }
            ((TreeMap) this.f555g).put(q30Var, jv2Var);
        }
    }

    /* JADX INFO: renamed from: p */
    public synchronized void m404p(r30 r30Var) {
        if (r30Var == null) {
            throw new NullPointerException("type == null");
        }
        m2519g();
        o43 o43Var = r30Var.f9342h;
        if (((b63) ((TreeMap) this.f555g).get(o43Var)) == null) {
            ((TreeMap) this.f555g).put(o43Var, new b63(r30Var));
        }
    }

    /* JADX INFO: renamed from: q */
    public synchronized void m405q(o43 o43Var) {
        if (o43Var == null) {
            throw new NullPointerException("type == null");
        }
        m2519g();
        if (((b63) ((TreeMap) this.f555g).get(o43Var)) == null) {
            ((TreeMap) this.f555g).put(o43Var, new b63(new r30(o43Var)));
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m397r() {
    }
}
