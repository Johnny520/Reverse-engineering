package fun.box001.internal.dexformat;

import fun.box001.internal.dexformat.writer.C0162m;
import fun.box001.internal.dexformat.writer.C0165p;
import fun.box001.internal.dexformat.writer.data.C0195c;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: e.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0042s {

    /* JADX INFO: renamed from: a */
    private final ArrayList f264a;

    /* JADX INFO: renamed from: b */
    private int f265b = 0;

    /* JADX INFO: renamed from: c */
    private C0165p f266c = null;

    /* JADX INFO: renamed from: d */
    private int[] f267d = null;

    public C0042s(int i2) {
        this.f264a = new ArrayList(i2);
    }

    /* JADX INFO: renamed from: a */
    private void m184a(int i2, int i3) {
        int[] iArr = this.f267d;
        boolean z = iArr == null;
        if (i2 != 0 || z) {
            if (i2 < 0) {
                throw new RuntimeException("shouldn't happen");
            }
            if (z || i3 >= iArr.length) {
                int i4 = i3 + 1;
                C0165p c0165p = new C0165p(i4);
                int[] iArr2 = new int[i4];
                Arrays.fill(iArr2, -1);
                if (!z) {
                    c0165p.m408n(this.f266c);
                    int[] iArr3 = this.f267d;
                    System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
                }
                this.f266c = c0165p;
                this.f267d = iArr2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m185b(int i2, int i3, C0162m c0162m) {
        c0162m.getClass();
        if (i2 < 0) {
            throw new IllegalArgumentException("address < 0");
        }
        if (i3 == 0) {
            throw new NullPointerException("disposition == null");
        }
        try {
            throw new NullPointerException("spec.getLocalItem() == null");
        } catch (NullPointerException unused) {
            throw new NullPointerException("spec == null");
        }
    }

    /* JADX INFO: renamed from: c */
    private void m186c(int i2, int i3, C0162m c0162m) {
        if (i3 == 1) {
            throw new RuntimeException("shouldn't happen");
        }
        int i4 = this.f267d[c0162m.m384i()];
        if (i4 >= 0) {
            ((AbstractC0041r) this.f264a.get(i4)).getClass();
            if (i2 == 0) {
                throw null;
            }
        }
        m188d(i2, i3, c0162m);
    }

    /* JADX INFO: renamed from: e */
    private static C0162m m187e(C0162m c0162m) {
        return (c0162m == null || c0162m.mo379c() != C0195c.f771p) ? c0162m : c0162m.m391s(C0195c.f776u);
    }

    /* JADX INFO: renamed from: d */
    public final void m188d(int i2, int i3, C0162m c0162m) {
        int iM384i = c0162m.m384i();
        C0162m c0162mM187e = m187e(c0162m);
        m184a(i2, iM384i);
        if (this.f267d[iM384i] >= 0) {
            return;
        }
        ArrayList arrayList = this.f264a;
        boolean z = true;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                this.f266c.m409o(c0162mM187e);
                arrayList.set(size, null);
                this.f265b++;
                do {
                    size--;
                    if (size >= 0) {
                    }
                } while (((AbstractC0041r) arrayList.get(size)) == null);
                throw null;
            }
            if (((AbstractC0041r) arrayList.get(size)) == null) {
                size--;
            } else {
                if (i2 == 0) {
                    throw null;
                }
                z = false;
            }
        }
        if (z) {
            return;
        }
        m185b(i2, i3, c0162mM187e);
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public final C0043t m189f() {
        m184a(Integer.MAX_VALUE, 0);
        ArrayList<AbstractC0041r> arrayList = this.f264a;
        int size = arrayList.size();
        int i2 = size - this.f265b;
        if (i2 == 0) {
            return C0043t.f268c;
        }
        AbstractC0041r[] abstractC0041rArr = new AbstractC0041r[i2];
        if (size == i2) {
            arrayList.toArray(abstractC0041rArr);
        } else {
            int i3 = 0;
            for (AbstractC0041r abstractC0041r : arrayList) {
                if (abstractC0041r != null) {
                    abstractC0041rArr[i3] = abstractC0041r;
                    i3++;
                }
            }
        }
        Arrays.sort(abstractC0041rArr);
        C0043t c0043t = new C0043t(i2);
        for (int i4 = 0; i4 < i2; i4++) {
            c0043t.m519v(i4, abstractC0041rArr[i4]);
        }
        c0043t.m536g();
        return c0043t;
    }

    /* JADX INFO: renamed from: g */
    public final void m190g(int i2, C0165p c0165p) {
        int iM406l = c0165p.m406l();
        m184a(i2, iM406l - 1);
        for (int i3 = 0; i3 < iM406l; i3++) {
            C0162m c0162mM405k = this.f266c.m405k(i3);
            C0162m c0162mM187e = m187e(c0165p.m405k(i3));
            if (c0162mM405k == null) {
                if (c0162mM187e != null) {
                    m191h(i2, c0162mM187e);
                }
            } else if (c0162mM187e == null) {
                m188d(i2, 2, c0162mM405k);
            } else if (!c0162mM187e.m381f(c0162mM405k)) {
                m188d(i2, 2, c0162mM405k);
                m191h(i2, c0162mM187e);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m191h(int i2, C0162m c0162m) {
        C0162m c0162mM405k;
        C0162m c0162mM405k2;
        int iM384i = c0162m.m384i();
        C0162m c0162mM187e = m187e(c0162m);
        m184a(i2, iM384i);
        C0162m c0162mM405k3 = this.f266c.m405k(iM384i);
        if (c0162mM187e.m381f(c0162mM405k3)) {
            return;
        }
        C0162m c0162mM404j = this.f266c.m404j(c0162mM187e);
        if (c0162mM404j != null) {
            m186c(i2, 4, c0162mM404j);
        }
        int i3 = this.f267d[iM384i];
        if (c0162mM405k3 != null) {
            m185b(i2, 3, c0162mM405k3);
            throw null;
        }
        if (i3 >= 0) {
            ((AbstractC0041r) this.f264a.get(i3)).getClass();
            if (i2 == 0) {
                throw null;
            }
        }
        if (iM384i > 0 && (c0162mM405k2 = this.f266c.m405k(iM384i - 1)) != null && c0162mM405k2.m385k()) {
            m186c(i2, 6, c0162mM405k2);
        }
        if (c0162mM187e.m385k() && (c0162mM405k = this.f266c.m405k(iM384i + 1)) != null) {
            m186c(i2, 5, c0162mM405k);
        }
        m185b(i2, 1, c0162mM187e);
        throw null;
    }
}
