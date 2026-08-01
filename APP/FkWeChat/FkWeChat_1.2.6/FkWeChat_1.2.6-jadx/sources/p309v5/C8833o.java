package p309v5;

import bsh.C1189h4;

/* JADX INFO: renamed from: v5.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C8833o implements InterfaceC8830l {

    /* JADX INFO: renamed from: a */
    public final C8829k f29366a;

    /* JADX INFO: renamed from: v5.o$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a implements InterfaceC8828j {

        /* JADX INFO: renamed from: a */
        public int f29367a = 0;

        public a() {
        }

        @Override // p309v5.InterfaceC8828j
        public boolean hasNext() {
            return this.f29367a < C8833o.this.f29366a.size();
        }

        @Override // p309v5.InterfaceC8828j
        public int next() {
            if (!hasNext()) {
                C1189h4.m4429a();
                return 0;
            }
            C8829k c8829k = C8833o.this.f29366a;
            int i10 = this.f29367a;
            this.f29367a = i10 + 1;
            return c8829k.m33920z(i10);
        }
    }

    public C8833o() {
        C8829k c8829k = new C8829k();
        this.f29366a = c8829k;
        c8829k.m33915K();
    }

    @Override // p309v5.InterfaceC8830l
    /* JADX INFO: renamed from: a */
    public void mo33829a(InterfaceC8830l interfaceC8830l) {
        int iM33837e = 0;
        if (interfaceC8830l instanceof C8833o) {
            C8833o c8833o = (C8833o) interfaceC8830l;
            int size = this.f29366a.size();
            int size2 = c8833o.f29366a.size();
            int i10 = 0;
            while (iM33837e < size2 && i10 < size) {
                while (iM33837e < size2 && c8833o.f29366a.m33920z(iM33837e) < this.f29366a.m33920z(i10)) {
                    add(c8833o.f29366a.m33920z(iM33837e));
                    iM33837e++;
                }
                if (iM33837e == size2) {
                    break;
                }
                while (i10 < size && c8833o.f29366a.m33920z(iM33837e) >= this.f29366a.m33920z(i10)) {
                    i10++;
                }
            }
            while (iM33837e < size2) {
                add(c8833o.f29366a.m33920z(iM33837e));
                iM33837e++;
            }
            this.f29366a.m33915K();
            return;
        }
        if (!(interfaceC8830l instanceof C8820b)) {
            InterfaceC8828j it = interfaceC8830l.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
        } else {
            C8820b c8820b = (C8820b) interfaceC8830l;
            while (true) {
                C8829k c8829k = this.f29366a;
                if (iM33837e < 0) {
                    c8829k.m33915K();
                    return;
                } else {
                    c8829k.m33917w(iM33837e);
                    iM33837e = AbstractC8821c.m33837e(c8820b.f29334a, iM33837e + 1);
                }
            }
        }
    }

    @Override // p309v5.InterfaceC8830l
    public void add(int i10) {
        int iM33918x = this.f29366a.m33918x(i10);
        if (iM33918x < 0) {
            this.f29366a.m33909C(-(iM33918x + 1), i10);
        }
    }

    @Override // p309v5.InterfaceC8830l
    /* JADX INFO: renamed from: b */
    public int mo33830b() {
        return this.f29366a.size();
    }

    @Override // p309v5.InterfaceC8830l
    /* JADX INFO: renamed from: c */
    public boolean mo33831c(int i10) {
        return this.f29366a.m33908B(i10) >= 0;
    }

    @Override // p309v5.InterfaceC8830l
    public InterfaceC8828j iterator() {
        return new a();
    }

    public String toString() {
        return this.f29366a.toString();
    }
}
