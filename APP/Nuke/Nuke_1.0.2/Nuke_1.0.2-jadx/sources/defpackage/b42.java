package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b42 extends x73 {
    public final /* synthetic */ int f;
    public final Object g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b42(int i, z70 z70Var) {
        super("proto_ids", z70Var, 4);
        this.f = i;
        switch (i) {
            case 1:
                super("string_ids", z70Var, 4);
                this.g = new TreeMap();
                break;
            case 2:
                super("type_ids", z70Var, 4);
                this.g = new TreeMap();
                break;
            case 3:
                super(null, z70Var, 4);
                hs0 hs0Var = new hs0();
                hs0Var.g(0);
                this.g = Collections.singletonList(hs0Var);
                break;
            default:
                this.g = new TreeMap();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jm2
    public final Collection c() {
        switch (this.f) {
            case 0:
                return ((TreeMap) this.g).values();
            case 1:
                return ((TreeMap) this.g).values();
            case 2:
                return ((TreeMap) this.g).values();
            default:
                return (List) this.g;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x73
    public final void k() {
        int i = this.f;
        Object obj = this.g;
        int i2 = 0;
        switch (i) {
            case 0:
                Iterator it = ((TreeMap) obj).values().iterator();
                while (it.hasNext()) {
                    ((a42) it.next()).g(i2);
                    i2++;
                }
                break;
            case 1:
                Iterator it2 = ((TreeMap) obj).values().iterator();
                while (it2.hasNext()) {
                    ((jv2) it2.next()).g(i2);
                    i2++;
                }
                break;
            case 2:
                Iterator it3 = ((TreeMap) obj).values().iterator();
                while (it3.hasNext()) {
                    ((b63) it3.next()).g(i2);
                    i2++;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int l(q30 q30Var) {
        if (q30Var == null) {
            um2.f("string == null");
            return 0;
        }
        f();
        jv2 jv2Var = (jv2) ((TreeMap) this.g).get(q30Var);
        if (jv2Var != null) {
            return jv2Var.e();
        }
        s.j("not found");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int m(r30 r30Var) {
        if (r30Var != null) {
            return n(r30Var.h);
        }
        um2.f("type == null");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int n(o43 o43Var) {
        if (o43Var == null) {
            um2.f("type == null");
            return 0;
        }
        f();
        b63 b63Var = (b63) ((TreeMap) this.g).get(o43Var);
        if (b63Var != null) {
            return b63Var.e();
        }
        s.g("not found: ", o43Var);
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void o(q30 q30Var) {
        jv2 jv2Var = new jv2(q30Var);
        synchronized (this) {
            g();
            if (((jv2) ((TreeMap) this.g).get(q30Var)) != null) {
                return;
            }
            ((TreeMap) this.g).put(q30Var, jv2Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized void p(r30 r30Var) {
        if (r30Var == null) {
            throw new NullPointerException("type == null");
        }
        g();
        o43 o43Var = r30Var.h;
        if (((b63) ((TreeMap) this.g).get(o43Var)) == null) {
            ((TreeMap) this.g).put(o43Var, new b63(r30Var));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized void q(o43 o43Var) {
        if (o43Var == null) {
            throw new NullPointerException("type == null");
        }
        g();
        if (((b63) ((TreeMap) this.g).get(o43Var)) == null) {
            ((TreeMap) this.g).put(o43Var, new b63(new r30(o43Var)));
        }
    }

    private final void r() {
    }
}
