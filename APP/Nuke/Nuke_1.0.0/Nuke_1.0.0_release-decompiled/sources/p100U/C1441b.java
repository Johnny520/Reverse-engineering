package p100U;

import java.util.ArrayList;
import p041H0.C0619t;
import p095T.AbstractC1387t;
import p095T.C1383r;
import p127Z2.AbstractC1784a;

/* JADX INFO: renamed from: U.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1441b {

    /* JADX INFO: renamed from: a */
    public final C1383r f5103a;

    /* JADX INFO: renamed from: b */
    public C1440a f5104b;

    /* JADX INFO: renamed from: c */
    public boolean f5105c;

    /* JADX INFO: renamed from: f */
    public int f5108f;

    /* JADX INFO: renamed from: g */
    public int f5109g;

    /* JADX INFO: renamed from: l */
    public int f5114l;

    /* JADX INFO: renamed from: d */
    public final C0619t f5106d = new C0619t();

    /* JADX INFO: renamed from: e */
    public boolean f5107e = true;

    /* JADX INFO: renamed from: h */
    public final ArrayList f5110h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public int f5111i = -1;

    /* JADX INFO: renamed from: j */
    public int f5112j = -1;

    /* JADX INFO: renamed from: k */
    public int f5113k = -1;

    public C1441b(C1383r c1383r, C1440a c1440a) {
        this.f5103a = c1383r;
        this.f5104b = c1440a;
    }

    /* JADX INFO: renamed from: a */
    public final void m2730a() {
        m2732c();
        ArrayList arrayList = this.f5110h;
        if (arrayList.isEmpty()) {
            this.f5109g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2731b() {
        int i5 = this.f5109g;
        if (i5 > 0) {
            C1439L c1439l = this.f5104b.f5102h;
            c1439l.m2728z(C1435H.f5092c);
            c1439l.f5098j[c1439l.f5099k - c1439l.f5096h[c1439l.f5097i - 1].f5094a] = i5;
            this.f5109g = 0;
        }
        ArrayList arrayList = this.f5110h;
        if (arrayList.isEmpty()) {
            return;
        }
        C1440a c1440a = this.f5104b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i6 = 0; i6 < size; i6++) {
            objArr[i6] = arrayList.get(i6);
        }
        c1440a.getClass();
        if (size != 0) {
            C1439L c1439l2 = c1440a.f5102h;
            c1439l2.m2728z(C1450k.f5124c);
            AbstractC1784a.m3202P(c1439l2, 0, objArr);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: c */
    public final void m2732c() {
        int i5 = this.f5114l;
        if (i5 > 0) {
            int i6 = this.f5111i;
            if (i6 >= 0) {
                m2731b();
                C1439L c1439l = this.f5104b.f5102h;
                c1439l.m2728z(C1465z.f5143c);
                int i7 = c1439l.f5099k - c1439l.f5096h[c1439l.f5097i - 1].f5094a;
                int[] iArr = c1439l.f5098j;
                iArr[i7] = i6;
                iArr[i7 + 1] = i5;
                this.f5111i = -1;
            } else {
                int i8 = this.f5113k;
                int i9 = this.f5112j;
                m2731b();
                C1439L c1439l2 = this.f5104b.f5102h;
                c1439l2.m2728z(C1461v.f5139c);
                int i10 = c1439l2.f5099k - c1439l2.f5096h[c1439l2.f5097i - 1].f5094a;
                int[] iArr2 = c1439l2.f5098j;
                iArr2[i10 + 1] = i8;
                iArr2[i10] = i9;
                iArr2[i10 + 2] = i5;
                this.f5112j = -1;
                this.f5113k = -1;
            }
            this.f5114l = 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2733d(boolean z5) {
        C1383r c1383r = this.f5103a;
        int i5 = z5 ? c1383r.f4869G.f4699i : c1383r.f4869G.f4697g;
        int i6 = i5 - this.f5108f;
        if (i6 < 0) {
            AbstractC1387t.m2638a("Tried to seek backward");
        }
        if (i6 > 0) {
            C1439L c1439l = this.f5104b.f5102h;
            c1439l.m2728z(C1443d.f5117c);
            c1439l.f5098j[c1439l.f5099k - c1439l.f5096h[c1439l.f5097i - 1].f5094a] = i6;
            this.f5108f = i5;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2734e(int i5, int i6) {
        if (i6 > 0) {
            if (!(i5 >= 0)) {
                AbstractC1387t.m2638a("Invalid remove index " + i5);
            }
            if (this.f5111i == i5) {
                this.f5114l += i6;
                return;
            }
            m2732c();
            this.f5111i = i5;
            this.f5114l = i6;
        }
    }
}
