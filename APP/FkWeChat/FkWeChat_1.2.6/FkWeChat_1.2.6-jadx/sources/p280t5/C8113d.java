package p280t5;

import java.util.ArrayList;
import java.util.BitSet;
import p309v5.InterfaceC8830l;

/* JADX INFO: renamed from: t5.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C8113d {

    /* JADX INFO: renamed from: a */
    public final C8132w f27074a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f27075b;

    /* JADX INFO: renamed from: c */
    public final a[] f27076c;

    /* JADX INFO: renamed from: t5.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public InterfaceC8830l f27077a;

        /* JADX INFO: renamed from: b */
        public int f27078b = -1;
    }

    public C8113d(C8132w c8132w) {
        this.f27074a = c8132w;
        ArrayList arrayListM31549m = c8132w.m31549m();
        this.f27075b = arrayListM31549m;
        int size = arrayListM31549m.size();
        this.f27076c = new a[size];
        for (int i10 = 0; i10 < size; i10++) {
            this.f27076c[i10] = new a();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m31349a() {
        int size = this.f27075b.size();
        for (int i10 = 0; i10 < size; i10++) {
            int i11 = this.f27076c[i10].f27078b;
            if (i11 != -1) {
                ((C8128s) this.f27075b.get(i11)).m31478b((C8128s) this.f27075b.get(i10));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m31350b() {
        int size = this.f27075b.size();
        for (int i10 = 0; i10 < size; i10++) {
            C8128s c8128s = (C8128s) this.f27075b.get(i10);
            a aVar = this.f27076c[i10];
            BitSet bitSetM31496u = c8128s.m31496u();
            if (bitSetM31496u.cardinality() > 1) {
                for (int iNextSetBit = bitSetM31496u.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM31496u.nextSetBit(iNextSetBit + 1)) {
                    int i11 = iNextSetBit;
                    while (i11 != aVar.f27078b && i11 != -1) {
                        a aVar2 = this.f27076c[i11];
                        if (aVar2.f27077a.mo33831c(i10)) {
                            break;
                        }
                        aVar2.f27077a.add(i10);
                        i11 = aVar2.f27078b;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public a[] m31351c() {
        int size = this.f27075b.size();
        C8114e.m31354f(this.f27074a, this.f27076c, false);
        m31349a();
        for (int i10 = 0; i10 < size; i10++) {
            this.f27076c[i10].f27077a = AbstractC8127r.m31459a(size);
        }
        m31350b();
        return this.f27076c;
    }
}
