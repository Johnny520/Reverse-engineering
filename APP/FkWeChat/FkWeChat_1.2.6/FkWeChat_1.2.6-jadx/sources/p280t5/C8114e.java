package p280t5;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import p280t5.C8113d;
import p280t5.C8128s;

/* JADX INFO: renamed from: t5.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8114e {

    /* JADX INFO: renamed from: a */
    public final boolean f27079a;

    /* JADX INFO: renamed from: b */
    public final C8132w f27080b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f27081c;

    /* JADX INFO: renamed from: d */
    public final b[] f27082d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f27083e;

    /* JADX INFO: renamed from: f */
    public final C8113d.a[] f27084f;

    /* JADX INFO: renamed from: t5.e$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public int f27085a;

        /* JADX INFO: renamed from: b */
        public C8128s f27086b;

        /* JADX INFO: renamed from: c */
        public C8128s f27087c;

        /* JADX INFO: renamed from: d */
        public C8128s f27088d;

        /* JADX INFO: renamed from: e */
        public ArrayList f27089e = new ArrayList();
    }

    /* JADX INFO: renamed from: t5.e$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class c implements C8128s.b {

        /* JADX INFO: renamed from: a */
        public int f27090a;

        public c() {
            this.f27090a = 0;
        }

        @Override // p280t5.C8128s.b
        /* JADX INFO: renamed from: a */
        public void mo31359a(C8128s c8128s, C8128s c8128s2) {
            b bVar = new b();
            int i10 = this.f27090a + 1;
            this.f27090a = i10;
            bVar.f27085a = i10;
            bVar.f27087c = c8128s;
            bVar.f27086b = c8128s2;
            C8114e.this.f27083e.add(c8128s);
            C8114e.this.f27082d[c8128s.m31491p()] = bVar;
        }
    }

    public C8114e(C8132w c8132w, C8113d.a[] aVarArr, boolean z10) {
        this.f27080b = c8132w;
        this.f27084f = aVarArr;
        this.f27079a = z10;
        ArrayList arrayListM31549m = c8132w.m31549m();
        this.f27081c = arrayListM31549m;
        this.f27082d = new b[arrayListM31549m.size() + 2];
        this.f27083e = new ArrayList();
    }

    /* JADX INFO: renamed from: f */
    public static C8114e m31354f(C8132w c8132w, C8113d.a[] aVarArr, boolean z10) {
        C8114e c8114e = new C8114e(c8132w, aVarArr, z10);
        c8114e.m31358g();
        return c8114e;
    }

    /* JADX INFO: renamed from: c */
    public final void m31355c(C8128s c8128s) {
        if (this.f27082d[this.f27082d[c8128s.m31491p()].f27088d.m31491p()].f27088d != null) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            arrayList.add(c8128s);
            while (!arrayList.isEmpty()) {
                int size = arrayList.size() - 1;
                b bVar = this.f27082d[((C8128s) arrayList.get(size)).m31491p()];
                C8128s c8128s2 = bVar.f27088d;
                b bVar2 = this.f27082d[c8128s2.m31491p()];
                if (!hashSet.add(c8128s2) || bVar2.f27088d == null) {
                    arrayList.remove(size);
                    if (bVar2.f27088d != null) {
                        C8128s c8128s3 = bVar2.f27087c;
                        if (this.f27082d[c8128s3.m31491p()].f27085a < this.f27082d[bVar.f27087c.m31491p()].f27085a) {
                            bVar.f27087c = c8128s3;
                        }
                        bVar.f27088d = bVar2.f27088d;
                    }
                } else {
                    arrayList.add(c8128s2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final C8128s m31356d(C8128s c8128s) {
        b bVar = this.f27082d[c8128s.m31491p()];
        if (bVar.f27088d == null) {
            return c8128s;
        }
        m31355c(c8128s);
        return bVar.f27087c;
    }

    /* JADX INFO: renamed from: e */
    public final BitSet m31357e(C8128s c8128s) {
        return this.f27079a ? c8128s.m31468C() : c8128s.m31496u();
    }

    /* JADX INFO: renamed from: g */
    public final void m31358g() {
        int i10;
        int i11;
        boolean z10 = this.f27079a;
        C8132w c8132w = this.f27080b;
        C8128s c8128sM31553q = z10 ? c8132w.m31553q() : c8132w.m31551o();
        if (c8128sM31553q != null) {
            this.f27083e.add(c8128sM31553q);
            this.f27084f[c8128sM31553q.m31491p()].f27078b = c8128sM31553q.m31491p();
        }
        this.f27080b.m31546j(this.f27079a, new c());
        int size = this.f27083e.size() - 1;
        int i12 = size;
        while (true) {
            if (i12 < 2) {
                break;
            }
            C8128s c8128s = (C8128s) this.f27083e.get(i12);
            b bVar = this.f27082d[c8128s.m31491p()];
            BitSet bitSetM31357e = m31357e(c8128s);
            for (int iNextSetBit = bitSetM31357e.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM31357e.nextSetBit(iNextSetBit + 1)) {
                C8128s c8128s2 = (C8128s) this.f27081c.get(iNextSetBit);
                if (this.f27082d[c8128s2.m31491p()] != null && (i11 = this.f27082d[m31356d(c8128s2).m31491p()].f27085a) < bVar.f27085a) {
                    bVar.f27085a = i11;
                }
            }
            this.f27082d[((C8128s) this.f27083e.get(bVar.f27085a)).m31491p()].f27089e.add(c8128s);
            C8128s c8128s3 = bVar.f27086b;
            bVar.f27088d = c8128s3;
            ArrayList arrayList = this.f27082d[c8128s3.m31491p()].f27089e;
            while (!arrayList.isEmpty()) {
                C8128s c8128s4 = (C8128s) arrayList.remove(arrayList.size() - 1);
                C8128s c8128sM31356d = m31356d(c8128s4);
                int i13 = this.f27082d[c8128sM31356d.m31491p()].f27085a;
                int i14 = this.f27082d[c8128s4.m31491p()].f27085a;
                C8113d.a[] aVarArr = this.f27084f;
                if (i13 < i14) {
                    aVarArr[c8128s4.m31491p()].f27078b = c8128sM31356d.m31491p();
                } else {
                    aVarArr[c8128s4.m31491p()].f27078b = bVar.f27086b.m31491p();
                }
            }
            i12--;
        }
        for (i10 = 2; i10 <= size; i10++) {
            C8128s c8128s5 = (C8128s) this.f27083e.get(i10);
            if (this.f27084f[c8128s5.m31491p()].f27078b != ((C8128s) this.f27083e.get(this.f27082d[c8128s5.m31491p()].f27085a)).m31491p()) {
                C8113d.a aVar = this.f27084f[c8128s5.m31491p()];
                C8113d.a[] aVarArr2 = this.f27084f;
                aVar.f27078b = aVarArr2[aVarArr2[c8128s5.m31491p()].f27078b].f27078b;
            }
        }
    }
}
