package p092S0;

import android.text.Layout;
import java.io.Serializable;
import p041H0.C0566K;
import p056K2.C0891q;
import p072O0.C1036g;
import p096T0.C1410j;
import p112W2.InterfaceC1601c;
import p117X2.C1672q;
import p117X2.C1673r;
import p117X2.C1675t;
import p120Y0.AbstractC1732a;
import p121Y1.C1753n;
import p204n0.C2684c;
import p211o0.C2747f;
import p211o0.C2753l;
import p222q0.C2901b;
import p222q0.InterfaceC2903d;

/* JADX INFO: renamed from: S0.n */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1276n implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4580d = 0;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f4581e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f4582f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Serializable f4583g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f4584h;

    public /* synthetic */ C1276n(long j5, float[] fArr, C1673r c1673r, C1672q c1672q) {
        this.f4581e = j5;
        this.f4582f = fArr;
        this.f4583g = c1673r;
        this.f4584h = c1672q;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        float[] fArr;
        long j5;
        int i5;
        float fM2111a;
        float fM2111a2;
        switch (this.f4580d) {
            case 0:
                float[] fArr2 = (float[]) this.f4582f;
                C1673r c1673r = (C1673r) this.f4583g;
                C1672q c1672q = (C1672q) this.f4584h;
                C1279q c1279q = (C1279q) obj;
                int i6 = c1279q.f4596b;
                C1263a c1263a = c1279q.f4595a;
                int iM2337e = c1279q.f4597c;
                long j6 = this.f4581e;
                int iM2338f = i6 > C1259L.m2338f(j6) ? c1279q.f4596b : C1259L.m2338f(j6);
                if (iM2337e >= C1259L.m2337e(j6)) {
                    iM2337e = C1259L.m2337e(j6);
                }
                long jM2313b = AbstractC1251D.m2313b(c1279q.m2374d(iM2338f), c1279q.m2374d(iM2337e));
                int i7 = c1673r.f5707d;
                C1410j c1410j = c1263a.f4548d;
                int iM2338f2 = C1259L.m2338f(jM2313b);
                int iM2337e2 = C1259L.m2337e(jM2313b);
                Layout layout = c1410j.f5044f;
                int length = layout.getText().length();
                if (iM2338f2 < 0) {
                    AbstractC1732a.m3085a("startOffset must be > 0");
                }
                if (iM2338f2 >= length) {
                    AbstractC1732a.m3085a("startOffset must be less than text length");
                }
                if (iM2337e2 <= iM2338f2) {
                    AbstractC1732a.m3085a("endOffset must be greater than startOffset");
                }
                if (iM2337e2 > length) {
                    AbstractC1732a.m3085a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i7 < (iM2337e2 - iM2338f2) * 4) {
                    AbstractC1732a.m3085a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iM2338f2);
                int lineForOffset2 = layout.getLineForOffset(iM2337e2 - 1);
                C1036g c1036g = new C1036g(c1410j);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        fArr = fArr2;
                        int iM2710f = c1410j.m2710f(lineForOffset);
                        int iMax = Math.max(iM2338f2, lineStart);
                        int iMin = Math.min(iM2337e2, iM2710f);
                        float fM2711g = c1410j.m2711g(lineForOffset);
                        float fM2709e = c1410j.m2709e(lineForOffset);
                        j5 = jM2313b;
                        boolean z5 = false;
                        boolean z6 = layout.getParagraphDirection(lineForOffset) == 1;
                        while (iMax < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            if (!z6 || zIsRtlCharAt) {
                                if (z6 && zIsRtlCharAt) {
                                    z5 = false;
                                    float fM2111a3 = c1036g.m2111a(iMax, false, false, false);
                                    i5 = iMin;
                                    fM2111a = c1036g.m2111a(iMax + 1, true, true, false);
                                    fM2111a2 = fM2111a3;
                                } else {
                                    i5 = iMin;
                                    z5 = false;
                                    if (z6 || !zIsRtlCharAt) {
                                        fM2111a = c1036g.m2111a(iMax, false, false, false);
                                        fM2111a2 = c1036g.m2111a(iMax + 1, true, true, false);
                                    } else {
                                        fM2111a2 = c1036g.m2111a(iMax, false, false, true);
                                        fM2111a = c1036g.m2111a(iMax + 1, true, true, true);
                                    }
                                }
                                fArr[i7] = fM2111a;
                                fArr[i7 + 1] = fM2711g;
                                fArr[i7 + 2] = fM2111a2;
                                fArr[i7 + 3] = fM2709e;
                                i7 += 4;
                                iMax++;
                                iMin = i5;
                            } else {
                                fM2111a = c1036g.m2111a(iMax, z5, z5, true);
                                i5 = iMin;
                                fM2111a2 = c1036g.m2111a(iMax + 1, true, true, true);
                            }
                            z5 = false;
                            fArr[i7] = fM2111a;
                            fArr[i7 + 1] = fM2711g;
                            fArr[i7 + 2] = fM2111a2;
                            fArr[i7 + 3] = fM2709e;
                            i7 += 4;
                            iMax++;
                            iMin = i5;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            fArr2 = fArr;
                            jM2313b = j5;
                        }
                    }
                } else {
                    fArr = fArr2;
                    j5 = jM2313b;
                }
                int iM2336d = (C1259L.m2336d(j5) * 4) + c1673r.f5707d;
                for (int i8 = c1673r.f5707d; i8 < iM2336d; i8 += 4) {
                    int i9 = i8 + 1;
                    float f2 = fArr[i9];
                    float f5 = c1672q.f5706d;
                    fArr[i9] = f2 + f5;
                    int i10 = i8 + 3;
                    fArr[i10] = fArr[i10] + f5;
                }
                c1673r.f5707d = iM2336d;
                c1672q.f5706d = c1263a.m2347b() + c1672q.f5706d;
                break;
            default:
                C2684c c2684c = (C2684c) this.f4582f;
                C1675t c1675t = (C1675t) this.f4583g;
                long j7 = this.f4581e;
                C2753l c2753l = (C2753l) this.f4584h;
                C0566K c0566k = (C0566K) obj;
                c0566k.m857a();
                float f6 = c2684c.f8558a;
                float f7 = c2684c.f8559b;
                C2901b c2901b = c0566k.f1742d;
                ((C1753n) c2901b.f9185e.f307e).m3115L(f6, f7);
                try {
                    InterfaceC2903d.m5102b0(c0566k, (C2747f) c1675t.f5710e, j7, 0L, 0.0f, c2753l, 0, 890);
                } finally {
                    ((C1753n) c2901b.f9185e.f307e).m3115L(-f6, -f7);
                }
                break;
        }
        return C0891q.f2780a;
    }

    public /* synthetic */ C1276n(C2684c c2684c, C1675t c1675t, long j5, C2753l c2753l) {
        this.f4582f = c2684c;
        this.f4583g = c1675t;
        this.f4581e = j5;
        this.f4584h = c2753l;
    }
}
