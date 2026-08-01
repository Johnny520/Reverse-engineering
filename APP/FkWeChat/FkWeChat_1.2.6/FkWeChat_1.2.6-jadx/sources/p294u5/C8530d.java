package p294u5;

import bsh.C1193i2;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import p239q5.C6267r;
import p239q5.C6268s;
import p280t5.AbstractC8131v;
import p280t5.C8123n;
import p280t5.C8128s;
import p280t5.C8132w;

/* JADX INFO: renamed from: u5.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C8530d {

    /* JADX INFO: renamed from: a */
    public final BitSet f28439a;

    /* JADX INFO: renamed from: b */
    public final BitSet f28440b;

    /* JADX INFO: renamed from: c */
    public final int f28441c;

    /* JADX INFO: renamed from: d */
    public final C8132w f28442d;

    /* JADX INFO: renamed from: e */
    public final C8529c f28443e;

    /* JADX INFO: renamed from: f */
    public C8128s f28444f;

    /* JADX INFO: renamed from: g */
    public int f28445g;

    /* JADX INFO: renamed from: h */
    public b f28446h;

    /* JADX INFO: renamed from: u5.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f28447a;

        static {
            int[] iArr = new int[b.values().length];
            f28447a = iArr;
            try {
                iArr[b.LIVE_IN_AT_STATEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28447a[b.LIVE_OUT_AT_STATEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28447a[b.LIVE_OUT_AT_BLOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: u5.d$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum b {
        LIVE_IN_AT_STATEMENT,
        LIVE_OUT_AT_STATEMENT,
        LIVE_OUT_AT_BLOCK,
        DONE
    }

    public C8530d(C8132w c8132w, int i10, C8529c c8529c) {
        int size = c8132w.m31549m().size();
        this.f28442d = c8132w;
        this.f28441c = i10;
        this.f28439a = new BitSet(size);
        this.f28440b = new BitSet(size);
        this.f28443e = c8529c;
    }

    /* JADX INFO: renamed from: a */
    public static void m32827a(C8529c c8529c, C6267r c6267r, C6268s c6268s) {
        int iM24754t = c6267r.m24754t();
        for (int i10 = 0; i10 < c6268s.size(); i10++) {
            c8529c.m32824a(iM24754t, c6268s.m24769G(i10).m24754t());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m32828b(C8132w c8132w, C8529c c8529c) {
        Iterator it = c8132w.m31549m().iterator();
        while (it.hasNext()) {
            List listM31495t = ((C8128s) it.next()).m31495t();
            int size = listM31495t.size();
            for (int i10 = 0; i10 < size; i10++) {
                for (int i11 = 0; i11 < size; i11++) {
                    if (i10 != i11) {
                        AbstractC8131v abstractC8131v = (AbstractC8131v) listM31495t.get(i10);
                        AbstractC8131v abstractC8131v2 = (AbstractC8131v) listM31495t.get(i11);
                        m32827a(c8529c, abstractC8131v.m31516n(), abstractC8131v2.mo31418o());
                        m32827a(c8529c, abstractC8131v2.m31516n(), abstractC8131v.mo31418o());
                        c8529c.m32824a(abstractC8131v.m31516n().m24754t(), abstractC8131v2.m31516n().m24754t());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static C8529c m32829c(C8132w c8132w) {
        int iM31556u = c8132w.m31556u();
        C8529c c8529c = new C8529c(iM31556u);
        for (int i10 = 0; i10 < iM31556u; i10++) {
            new C8530d(c8132w, i10, c8529c).m32834h();
        }
        m32828b(c8132w, c8529c);
        return c8529c;
    }

    /* JADX INFO: renamed from: d */
    public final void m32830d() {
        while (true) {
            b bVar = this.f28446h;
            b bVar2 = b.DONE;
            if (bVar == bVar2) {
                return;
            }
            int i10 = a.f28447a[bVar.ordinal()];
            if (i10 == 1) {
                this.f28446h = bVar2;
                m32831e();
            } else if (i10 == 2) {
                this.f28446h = bVar2;
                m32833g();
            } else if (i10 == 3) {
                this.f28446h = bVar2;
                m32832f();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m32831e() {
        int i10 = this.f28445g;
        if (i10 != 0) {
            this.f28445g = i10 - 1;
            this.f28446h = b.LIVE_OUT_AT_STATEMENT;
        } else {
            this.f28444f.m31480d(this.f28441c);
            this.f28440b.or(this.f28444f.m31496u());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m32832f() {
        if (this.f28439a.get(this.f28444f.m31491p())) {
            return;
        }
        this.f28439a.set(this.f28444f.m31491p());
        this.f28444f.m31481e(this.f28441c);
        this.f28445g = this.f28444f.m31492q().size() - 1;
        this.f28446h = b.LIVE_OUT_AT_STATEMENT;
    }

    /* JADX INFO: renamed from: g */
    public final void m32833g() {
        AbstractC8131v abstractC8131v = (AbstractC8131v) this.f28444f.m31492q().get(this.f28445g);
        C6267r c6267rM31516n = abstractC8131v.m31516n();
        if (abstractC8131v.m31517u(this.f28441c)) {
            return;
        }
        if (c6267rM31516n != null) {
            this.f28443e.m32824a(this.f28441c, c6267rM31516n.m24754t());
        }
        this.f28446h = b.LIVE_IN_AT_STATEMENT;
    }

    /* JADX INFO: renamed from: h */
    public void m32834h() {
        for (AbstractC8131v abstractC8131v : this.f28442d.m31558w(this.f28441c)) {
            this.f28446h = b.DONE;
            if (abstractC8131v instanceof C8123n) {
                Iterator it = ((C8123n) abstractC8131v).m31435G(this.f28441c, this.f28442d).iterator();
                while (it.hasNext()) {
                    this.f28444f = (C8128s) it.next();
                    this.f28446h = b.LIVE_OUT_AT_BLOCK;
                    m32830d();
                }
            } else {
                C8128s c8128sM31515f = abstractC8131v.m31515f();
                this.f28444f = c8128sM31515f;
                int iIndexOf = c8128sM31515f.m31492q().indexOf(abstractC8131v);
                this.f28445g = iIndexOf;
                if (iIndexOf < 0) {
                    C1193i2.m4438a("insn not found in it's own block");
                    return;
                } else {
                    this.f28446h = b.LIVE_IN_AT_STATEMENT;
                    m32830d();
                }
            }
        }
        while (true) {
            int iNextSetBit = this.f28440b.nextSetBit(0);
            if (iNextSetBit < 0) {
                return;
            }
            this.f28444f = (C8128s) this.f28442d.m31549m().get(iNextSetBit);
            this.f28440b.clear(iNextSetBit);
            this.f28446h = b.LIVE_OUT_AT_BLOCK;
            m32830d();
        }
    }
}
