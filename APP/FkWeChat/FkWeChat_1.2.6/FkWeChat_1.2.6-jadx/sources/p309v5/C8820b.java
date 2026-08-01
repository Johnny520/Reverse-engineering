package p309v5;

import bsh.C1189h4;

/* JADX INFO: renamed from: v5.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C8820b implements InterfaceC8830l {

    /* JADX INFO: renamed from: a */
    public int[] f29334a;

    /* JADX INFO: renamed from: v5.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a implements InterfaceC8828j {

        /* JADX INFO: renamed from: a */
        public int f29335a;

        public a() {
            this.f29335a = AbstractC8821c.m33837e(C8820b.this.f29334a, 0);
        }

        @Override // p309v5.InterfaceC8828j
        public boolean hasNext() {
            return this.f29335a >= 0;
        }

        @Override // p309v5.InterfaceC8828j
        public int next() {
            if (!hasNext()) {
                C1189h4.m4429a();
                return 0;
            }
            int i10 = this.f29335a;
            this.f29335a = AbstractC8821c.m33837e(C8820b.this.f29334a, i10 + 1);
            return i10;
        }
    }

    public C8820b(int i10) {
        this.f29334a = AbstractC8821c.m33841i(i10);
    }

    @Override // p309v5.InterfaceC8830l
    /* JADX INFO: renamed from: a */
    public void mo33829a(InterfaceC8830l interfaceC8830l) {
        if (interfaceC8830l instanceof C8820b) {
            C8820b c8820b = (C8820b) interfaceC8830l;
            m33832d(AbstractC8821c.m33839g(c8820b.f29334a) + 1);
            AbstractC8821c.m33842j(this.f29334a, c8820b.f29334a);
        } else {
            if (!(interfaceC8830l instanceof C8833o)) {
                InterfaceC8828j it = interfaceC8830l.iterator();
                while (it.hasNext()) {
                    add(it.next());
                }
                return;
            }
            C8833o c8833o = (C8833o) interfaceC8830l;
            int size = c8833o.f29366a.size();
            if (size > 0) {
                m33832d(c8833o.f29366a.m33920z(size - 1));
            }
            for (int i10 = 0; i10 < c8833o.f29366a.size(); i10++) {
                AbstractC8821c.m33844l(this.f29334a, c8833o.f29366a.m33920z(i10), true);
            }
        }
    }

    @Override // p309v5.InterfaceC8830l
    public void add(int i10) {
        m33832d(i10);
        AbstractC8821c.m33844l(this.f29334a, i10, true);
    }

    @Override // p309v5.InterfaceC8830l
    /* JADX INFO: renamed from: b */
    public int mo33830b() {
        return AbstractC8821c.m33834b(this.f29334a);
    }

    @Override // p309v5.InterfaceC8830l
    /* JADX INFO: renamed from: c */
    public boolean mo33831c(int i10) {
        return i10 < AbstractC8821c.m33839g(this.f29334a) && AbstractC8821c.m33838f(this.f29334a, i10);
    }

    /* JADX INFO: renamed from: d */
    public final void m33832d(int i10) {
        if (i10 >= AbstractC8821c.m33839g(this.f29334a)) {
            int[] iArrM33841i = AbstractC8821c.m33841i(Math.max(i10 + 1, AbstractC8821c.m33839g(this.f29334a) * 2));
            int[] iArr = this.f29334a;
            System.arraycopy(iArr, 0, iArrM33841i, 0, iArr.length);
            this.f29334a = iArrM33841i;
        }
    }

    @Override // p309v5.InterfaceC8830l
    public InterfaceC8828j iterator() {
        return new a();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        int iM33837e = AbstractC8821c.m33837e(this.f29334a, 0);
        boolean z10 = true;
        while (iM33837e >= 0) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(iM33837e);
            iM33837e = AbstractC8821c.m33837e(this.f29334a, iM33837e + 1);
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }
}
