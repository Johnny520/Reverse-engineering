package p119i1;

import java.util.Iterator;
import java.util.Map;
import p117i.C3039b;
import p172l8.C4700i0;

/* JADX INFO: renamed from: i1.s0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3152s0 {

    /* JADX INFO: renamed from: q */
    public final C3128g0 f8413q;

    /* JADX INFO: renamed from: r */
    public final Iterator f8414r;

    /* JADX INFO: renamed from: s */
    public int f8415s;

    /* JADX INFO: renamed from: t */
    public Map.Entry f8416t;

    /* JADX INFO: renamed from: u */
    public Map.Entry f8417u;

    public AbstractC3152s0(C3128g0 c3128g0, Iterator it) {
        this.f8413q = c3128g0;
        this.f8414r = it;
        this.f8415s = c3128g0.m11739n();
        m11868o();
    }

    public final boolean hasNext() {
        return this.f8417u != null;
    }

    /* JADX INFO: renamed from: o */
    public final void m11868o() {
        this.f8416t = this.f8417u;
        this.f8417u = this.f8414r.hasNext() ? (Map.Entry) this.f8414r.next() : null;
    }

    public final void remove() {
        if (m11870x().m11739n() != this.f8415s) {
            C3039b.m11232a();
            return;
        }
        Map.Entry entry = this.f8416t;
        if (entry == null) {
            throw new IllegalStateException();
        }
        this.f8413q.remove(entry.getKey());
        this.f8416t = null;
        C4700i0 c4700i0 = C4700i0.f13910a;
        this.f8415s = m11870x().m11739n();
    }

    /* JADX INFO: renamed from: v */
    public final Map.Entry m11869v() {
        return this.f8416t;
    }

    /* JADX INFO: renamed from: x */
    public final C3128g0 m11870x() {
        return this.f8413q;
    }

    /* JADX INFO: renamed from: y */
    public final Map.Entry m11871y() {
        return this.f8417u;
    }
}
