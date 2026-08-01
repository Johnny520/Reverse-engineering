package p316w;

import androidx.compose.foundation.lazy.layout.InterfaceC0370f;
import java.util.ArrayList;
import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p185m8.AbstractC5114x;
import p263s.AbstractC6635e;
import p316w.C8987x0;

/* JADX INFO: renamed from: w.x0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8987x0 {

    /* JADX INFO: renamed from: a */
    public final C8962l f29788a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f29789b;

    /* JADX INFO: renamed from: c */
    public int f29790c;

    /* JADX INFO: renamed from: d */
    public int f29791d;

    /* JADX INFO: renamed from: e */
    public int f29792e;

    /* JADX INFO: renamed from: f */
    public int f29793f;

    /* JADX INFO: renamed from: g */
    public final List f29794g;

    /* JADX INFO: renamed from: h */
    public List f29795h;

    /* JADX INFO: renamed from: i */
    public int f29796i;

    /* JADX INFO: renamed from: w.x0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC8982v {

        /* JADX INFO: renamed from: a */
        public static final b f29799a = new b();

        /* JADX INFO: renamed from: b */
        public static int f29800b;

        /* JADX INFO: renamed from: c */
        public static int f29801c;

        /* JADX INFO: renamed from: a */
        public void m34469a(int i10) {
            f29800b = i10;
        }

        /* JADX INFO: renamed from: b */
        public void m34470b(int i10) {
            f29801c = i10;
        }
    }

    /* JADX INFO: renamed from: w.x0$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final int f29802a;

        /* JADX INFO: renamed from: b */
        public final List f29803b;

        public c(int i10, List list) {
            this.f29802a = i10;
            this.f29803b = list;
        }

        /* JADX INFO: renamed from: a */
        public final int m34471a() {
            return this.f29802a;
        }

        /* JADX INFO: renamed from: b */
        public final List m34472b() {
            return this.f29803b;
        }
    }

    public C8987x0(C8962l c8962l) {
        this.f29788a = c8962l;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        arrayList.add(new a(i10, i10, 2, null));
        this.f29789b = arrayList;
        this.f29793f = -1;
        this.f29794g = new ArrayList();
        this.f29795h = AbstractC5114x.m20800o();
    }

    /* JADX INFO: renamed from: a */
    public static int m34457a(int i10, a aVar) {
        return aVar.m34467a() - i10;
    }

    /* JADX INFO: renamed from: b */
    public final int m34458b() {
        return ((int) Math.sqrt((((double) m34463g()) * 1.0d) / ((double) this.f29796i))) + 1;
    }

    /* JADX INFO: renamed from: c */
    public final List m34459c(int i10) {
        if (i10 == this.f29795h.size()) {
            return this.f29795h;
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(C8937c.m34315a(AbstractC8983v0.m34456a(1)));
        }
        this.f29795h = arrayList;
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p316w.C8987x0.c m34460d(int r11) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p316w.C8987x0.m34460d(int):w.x0$c");
    }

    /* JADX INFO: renamed from: e */
    public final int m34461e(final int i10) {
        int i11;
        int i12 = 0;
        if (m34463g() <= 0) {
            return 0;
        }
        if (!(i10 < m34463g())) {
            AbstractC6635e.m26318a("ItemIndex > total count");
        }
        if (!this.f29788a.m34417l()) {
            return i10 / this.f29796i;
        }
        int iM20798m = AbstractC5114x.m20798m(this.f29789b, 0, 0, new InterfaceC0184l() { // from class: w.w0
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Integer.valueOf(C8987x0.m34457a(i10, (C8987x0.a) obj));
            }
        }, 3, null);
        int i13 = 2;
        if (iM20798m < 0) {
            iM20798m = (-iM20798m) - 2;
        }
        int iM34458b = m34458b() * iM20798m;
        int iM34467a = ((a) this.f29789b.get(iM20798m)).m34467a();
        if (!(iM34467a <= i10)) {
            AbstractC6635e.m26318a("currentItemIndex > itemIndex");
        }
        int i14 = 0;
        while (true) {
            i11 = this.f29796i;
            if (iM34467a >= i10) {
                break;
            }
            int i15 = iM34467a + 1;
            int iM34466j = m34466j(iM34467a, i11 - i14);
            i14 += iM34466j;
            int i16 = this.f29796i;
            if (i14 >= i16) {
                if (i14 == i16) {
                    iM34458b++;
                    i14 = 0;
                } else {
                    iM34458b++;
                    i14 = iM34466j;
                }
            }
            if (iM34458b % m34458b() == 0 && iM34458b / m34458b() >= this.f29789b.size()) {
                this.f29789b.add(new a(i15 - (i14 > 0 ? 1 : 0), i12, i13, null));
            }
            iM34467a = i15;
        }
        return i14 + m34466j(i10, i11 - i14) > this.f29796i ? iM34458b + 1 : iM34458b;
    }

    /* JADX INFO: renamed from: f */
    public final int m34462f() {
        return this.f29796i;
    }

    /* JADX INFO: renamed from: g */
    public final int m34463g() {
        return this.f29788a.mo1319h().mo1196a();
    }

    /* JADX INFO: renamed from: h */
    public final void m34464h() {
        this.f29789b.clear();
        int i10 = 0;
        this.f29789b.add(new a(i10, i10, 2, null));
        this.f29790c = 0;
        this.f29791d = 0;
        this.f29792e = 0;
        this.f29793f = -1;
        this.f29794g.clear();
    }

    /* JADX INFO: renamed from: i */
    public final void m34465i(int i10) {
        if (i10 != this.f29796i) {
            this.f29796i = i10;
            m34464h();
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m34466j(int i10, int i11) {
        b bVar = b.f29799a;
        bVar.m34469a(i11);
        bVar.m34470b(this.f29796i);
        InterfaceC0370f.a aVar = this.f29788a.mo1319h().get(i10);
        return C8937c.m34318d(((C8937c) ((C8958j) aVar.m1200c()).m34400b().invoke(bVar, Integer.valueOf(i10 - aVar.m1199b()))).m34321g());
    }

    /* JADX INFO: renamed from: w.x0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f29797a;

        /* JADX INFO: renamed from: b */
        public final int f29798b;

        public /* synthetic */ a(int i10, int i11, int i12, AbstractC1043k abstractC1043k) {
            this(i10, (i12 & 2) != 0 ? 0 : i11);
        }

        /* JADX INFO: renamed from: a */
        public final int m34467a() {
            return this.f29797a;
        }

        /* JADX INFO: renamed from: b */
        public final int m34468b() {
            return this.f29798b;
        }

        public a(int i10, int i11) {
            this.f29797a = i10;
            this.f29798b = i11;
        }
    }
}
