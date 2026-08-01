package qa;

import bsh.C1189h4;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;
import qa.AbstractC6348e;

/* JADX INFO: renamed from: qa.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C6364u extends AbstractC6348e {

    /* JADX INFO: renamed from: x */
    public static final int[] f20032x;

    /* JADX INFO: renamed from: r */
    public final int f20033r;

    /* JADX INFO: renamed from: s */
    public final AbstractC6348e f20034s;

    /* JADX INFO: renamed from: t */
    public final AbstractC6348e f20035t;

    /* JADX INFO: renamed from: u */
    public final int f20036u;

    /* JADX INFO: renamed from: v */
    public final int f20037v;

    /* JADX INFO: renamed from: w */
    public int f20038w;

    /* JADX INFO: renamed from: qa.u$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final Stack f20039a;

        public b() {
            this.f20039a = new Stack();
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC6348e m25284b(AbstractC6348e abstractC6348e, AbstractC6348e abstractC6348e2) {
            m25285c(abstractC6348e);
            m25285c(abstractC6348e2);
            AbstractC6348e c6364u = (AbstractC6348e) this.f20039a.pop();
            while (!this.f20039a.isEmpty()) {
                c6364u = new C6364u((AbstractC6348e) this.f20039a.pop(), c6364u);
            }
            return c6364u;
        }

        /* JADX INFO: renamed from: c */
        public final void m25285c(AbstractC6348e abstractC6348e) {
            if (abstractC6348e.mo25046r()) {
                m25287e(abstractC6348e);
                return;
            }
            if (abstractC6348e instanceof C6364u) {
                C6364u c6364u = (C6364u) abstractC6348e;
                m25285c(c6364u.f20034s);
                m25285c(c6364u.f20035t);
            } else {
                String strValueOf = String.valueOf(abstractC6348e.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
                sb2.append("Has a new type of ByteString been created? Found ");
                sb2.append(strValueOf);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        /* JADX INFO: renamed from: d */
        public final int m25286d(int i10) {
            int iBinarySearch = Arrays.binarySearch(C6364u.f20032x, i10);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        /* JADX INFO: renamed from: e */
        public final void m25287e(AbstractC6348e abstractC6348e) {
            int iM25286d = m25286d(abstractC6348e.size());
            int i10 = C6364u.f20032x[iM25286d + 1];
            if (this.f20039a.isEmpty() || ((AbstractC6348e) this.f20039a.peek()).size() >= i10) {
                this.f20039a.push(abstractC6348e);
                return;
            }
            int i11 = C6364u.f20032x[iM25286d];
            AbstractC6348e c6364u = (AbstractC6348e) this.f20039a.pop();
            while (true) {
                if (this.f20039a.isEmpty() || ((AbstractC6348e) this.f20039a.peek()).size() >= i11) {
                    break;
                } else {
                    c6364u = new C6364u((AbstractC6348e) this.f20039a.pop(), c6364u);
                }
            }
            C6364u c6364u2 = new C6364u(c6364u, abstractC6348e);
            while (!this.f20039a.isEmpty()) {
                if (((AbstractC6348e) this.f20039a.peek()).size() >= C6364u.f20032x[m25286d(c6364u2.size()) + 1]) {
                    break;
                } else {
                    c6364u2 = new C6364u((AbstractC6348e) this.f20039a.pop(), c6364u2);
                }
            }
            this.f20039a.push(c6364u2);
        }
    }

    /* JADX INFO: renamed from: qa.u$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class c implements Iterator {

        /* JADX INFO: renamed from: q */
        public final Stack f20040q;

        /* JADX INFO: renamed from: r */
        public C6359p f20041r;

        public c(AbstractC6348e abstractC6348e) {
            this.f20040q = new Stack();
            this.f20041r = m25288b(abstractC6348e);
        }

        /* JADX INFO: renamed from: b */
        public final C6359p m25288b(AbstractC6348e abstractC6348e) {
            while (abstractC6348e instanceof C6364u) {
                C6364u c6364u = (C6364u) abstractC6348e;
                this.f20040q.push(c6364u);
                abstractC6348e = c6364u.f20034s;
            }
            return (C6359p) abstractC6348e;
        }

        /* JADX INFO: renamed from: d */
        public final C6359p m25289d() {
            while (!this.f20040q.isEmpty()) {
                C6359p c6359pM25288b = m25288b(((C6364u) this.f20040q.pop()).f20035t);
                if (!c6359pM25288b.isEmpty()) {
                    return c6359pM25288b;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public C6359p next() {
            C6359p c6359p = this.f20041r;
            if (c6359p != null) {
                this.f20041r = m25289d();
                return c6359p;
            }
            C1189h4.m4429a();
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20041r != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: qa.u$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class d implements AbstractC6348e.a {

        /* JADX INFO: renamed from: q */
        public final c f20042q;

        /* JADX INFO: renamed from: r */
        public AbstractC6348e.a f20043r;

        /* JADX INFO: renamed from: s */
        public int f20044s;

        public d() {
            c cVar = new c(C6364u.this);
            this.f20042q = cVar;
            this.f20043r = cVar.next().iterator();
            this.f20044s = C6364u.this.size();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(mo25033c());
        }

        @Override // qa.AbstractC6348e.a
        /* JADX INFO: renamed from: c */
        public byte mo25033c() {
            if (!this.f20043r.hasNext()) {
                this.f20043r = this.f20042q.next().iterator();
            }
            this.f20044s--;
            return this.f20043r.mo25033c();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20044s > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 > 0) {
            arrayList.add(Integer.valueOf(i10));
            int i12 = i11 + i10;
            i11 = i10;
            i10 = i12;
        }
        arrayList.add(Integer.MAX_VALUE);
        f20032x = new int[arrayList.size()];
        int i13 = 0;
        while (true) {
            int[] iArr = f20032x;
            if (i13 >= iArr.length) {
                return;
            }
            iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
            i13++;
        }
    }

    public C6364u(AbstractC6348e abstractC6348e, AbstractC6348e abstractC6348e2) {
        this.f20038w = 0;
        this.f20034s = abstractC6348e;
        this.f20035t = abstractC6348e2;
        int size = abstractC6348e.size();
        this.f20036u = size;
        this.f20033r = size + abstractC6348e2.size();
        this.f20037v = Math.max(abstractC6348e.mo25045q(), abstractC6348e2.mo25045q()) + 1;
    }

    /* JADX INFO: renamed from: F */
    public static AbstractC6348e m25279F(AbstractC6348e abstractC6348e, AbstractC6348e abstractC6348e2) {
        C6364u c6364u = abstractC6348e instanceof C6364u ? (C6364u) abstractC6348e : null;
        if (abstractC6348e2.size() == 0) {
            return abstractC6348e;
        }
        if (abstractC6348e.size() == 0) {
            return abstractC6348e2;
        }
        int size = abstractC6348e.size() + abstractC6348e2.size();
        if (size < 128) {
            return m25280G(abstractC6348e, abstractC6348e2);
        }
        if (c6364u != null && c6364u.f20035t.size() + abstractC6348e2.size() < 128) {
            return new C6364u(c6364u.f20034s, m25280G(c6364u.f20035t, abstractC6348e2));
        }
        if (c6364u == null || c6364u.f20034s.mo25045q() <= c6364u.f20035t.mo25045q() || c6364u.mo25045q() <= abstractC6348e2.mo25045q()) {
            return size >= f20032x[Math.max(abstractC6348e.mo25045q(), abstractC6348e2.mo25045q()) + 1] ? new C6364u(abstractC6348e, abstractC6348e2) : new b().m25284b(abstractC6348e, abstractC6348e2);
        }
        return new C6364u(c6364u.f20034s, new C6364u(c6364u.f20035t, abstractC6348e2));
    }

    /* JADX INFO: renamed from: G */
    public static C6359p m25280G(AbstractC6348e abstractC6348e, AbstractC6348e abstractC6348e2) {
        int size = abstractC6348e.size();
        int size2 = abstractC6348e2.size();
        byte[] bArr = new byte[size + size2];
        abstractC6348e.m25044o(bArr, 0, 0, size);
        abstractC6348e2.m25044o(bArr, 0, size, size2);
        return new C6359p(bArr);
    }

    @Override // qa.AbstractC6348e
    /* JADX INFO: renamed from: B */
    public void mo25042B(OutputStream outputStream, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.f20036u;
        if (i12 <= i13) {
            this.f20034s.mo25042B(outputStream, i10, i11);
        } else {
            if (i10 >= i13) {
                this.f20035t.mo25042B(outputStream, i10 - i13, i11);
                return;
            }
            int i14 = i13 - i10;
            this.f20034s.mo25042B(outputStream, i10, i14);
            this.f20035t.mo25042B(outputStream, 0, i11 - i14);
        }
    }

    /* JADX INFO: renamed from: H */
    public final boolean m25281H(AbstractC6348e abstractC6348e) {
        c cVar = new c(this);
        C6359p c6359p = (C6359p) cVar.next();
        c cVar2 = new c(abstractC6348e);
        C6359p c6359p2 = (C6359p) cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = c6359p.size() - i10;
            int size2 = c6359p2.size() - i11;
            int iMin = Math.min(size, size2);
            if (!(i10 == 0 ? c6359p.m25274C(c6359p2, i11, iMin) : c6359p2.m25274C(c6359p, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f20033r;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                c6359p = (C6359p) cVar.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
            if (iMin == size2) {
                c6359p2 = (C6359p) cVar2.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
        }
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public AbstractC6348e.a iterator() {
        return new d();
    }

    public boolean equals(Object obj) {
        int iMo25050w;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6348e)) {
            return false;
        }
        AbstractC6348e abstractC6348e = (AbstractC6348e) obj;
        if (this.f20033r != abstractC6348e.size()) {
            return false;
        }
        if (this.f20033r == 0) {
            return true;
        }
        if (this.f20038w == 0 || (iMo25050w = abstractC6348e.mo25050w()) == 0 || this.f20038w == iMo25050w) {
            return m25281H(abstractC6348e);
        }
        return false;
    }

    public int hashCode() {
        int iMo25048u = this.f20038w;
        if (iMo25048u == 0) {
            int i10 = this.f20033r;
            iMo25048u = mo25048u(i10, 0, i10);
            if (iMo25048u == 0) {
                iMo25048u = 1;
            }
            this.f20038w = iMo25048u;
        }
        return iMo25048u;
    }

    @Override // qa.AbstractC6348e
    /* JADX INFO: renamed from: p */
    public void mo25031p(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f20036u;
        if (i13 <= i14) {
            this.f20034s.mo25031p(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.f20035t.mo25031p(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.f20034s.mo25031p(bArr, i10, i11, i15);
            this.f20035t.mo25031p(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // qa.AbstractC6348e
    /* JADX INFO: renamed from: q */
    public int mo25045q() {
        return this.f20037v;
    }

    @Override // qa.AbstractC6348e
    /* JADX INFO: renamed from: r */
    public boolean mo25046r() {
        return this.f20033r >= f20032x[this.f20037v];
    }

    @Override // qa.AbstractC6348e
    /* JADX INFO: renamed from: s */
    public boolean mo25047s() {
        int iMo25049v = this.f20034s.mo25049v(0, 0, this.f20036u);
        AbstractC6348e abstractC6348e = this.f20035t;
        return abstractC6348e.mo25049v(iMo25049v, 0, abstractC6348e.size()) == 0;
    }

    @Override // qa.AbstractC6348e
    public int size() {
        return this.f20033r;
    }

    @Override // qa.AbstractC6348e
    /* JADX INFO: renamed from: u */
    public int mo25048u(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f20036u;
        if (i13 <= i14) {
            return this.f20034s.mo25048u(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f20035t.mo25048u(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f20035t.mo25048u(this.f20034s.mo25048u(i10, i11, i15), 0, i12 - i15);
    }

    @Override // qa.AbstractC6348e
    /* JADX INFO: renamed from: v */
    public int mo25049v(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f20036u;
        if (i13 <= i14) {
            return this.f20034s.mo25049v(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f20035t.mo25049v(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f20035t.mo25049v(this.f20034s.mo25049v(i10, i11, i15), 0, i12 - i15);
    }

    @Override // qa.AbstractC6348e
    /* JADX INFO: renamed from: w */
    public int mo25050w() {
        return this.f20038w;
    }

    @Override // qa.AbstractC6348e
    /* JADX INFO: renamed from: y */
    public String mo25052y(String str) {
        return new String(m25051x(), str);
    }
}
