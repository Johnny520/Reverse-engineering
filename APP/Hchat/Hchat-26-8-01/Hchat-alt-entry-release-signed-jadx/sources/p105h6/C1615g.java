package p105h6;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import p134j6.C2066d;
import p151k6.AbstractC2284c1;
import p151k6.AbstractC2291g;
import p151k6.C2293h;
import p151k6.C2316s0;
import p181m6.AbstractC2787f;
import p181m6.C2786e;

/* JADX INFO: renamed from: h6.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1615g {

    /* JADX INFO: renamed from: a */
    public C2066d f5301a = C2066d.f6943j;

    /* JADX INFO: renamed from: b */
    public final int f5302b = 1;

    /* JADX INFO: renamed from: c */
    public int f5303c = 1;

    /* JADX INFO: renamed from: d */
    public final HashMap f5304d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final ArrayList f5305e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f5306f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final int f5307g;

    /* JADX INFO: renamed from: h */
    public final int f5308h;

    /* JADX INFO: renamed from: i */
    public boolean f5309i;

    /* JADX INFO: renamed from: j */
    public C1609a f5310j;

    /* JADX INFO: renamed from: k */
    public int f5311k;

    /* JADX INFO: renamed from: l */
    public boolean f5312l;

    /* JADX INFO: renamed from: m */
    public final int f5313m;

    /* JADX INFO: renamed from: n */
    public final int f5314n;

    /* JADX INFO: renamed from: o */
    public final ArrayDeque f5315o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1615g() {
        C1609a c1609a = C1614f.f5290i;
        this.f5307g = 2;
        this.f5308h = 2;
        this.f5309i = true;
        this.f5310j = C1614f.f5290i;
        this.f5311k = 0;
        this.f5312l = true;
        this.f5313m = C1614f.f5291j;
        this.f5314n = C1614f.f5292k;
        this.f5315o = new ArrayDeque();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C1614f m4133a() {
        C2316s0 c2316s0;
        C2316s0 c2316s02;
        ArrayList arrayList = this.f5305e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f5306f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z9 = AbstractC2787f.f9029a;
        int i9 = this.f5307g;
        int i10 = this.f5308h;
        if (i9 != 2 || i10 != 2) {
            C2293h c2293h = new C2293h(AbstractC2291g.f7614b, i9, i10);
            C2316s0 c2316s03 = AbstractC2284c1.f7586a;
            C2316s0 c2316s04 = new C2316s0(Date.class, c2293h, 0);
            if (z9) {
                C2786e c2786e = AbstractC2787f.f9031c;
                c2786e.getClass();
                c2316s0 = new C2316s0(c2786e.f7615a, new C2293h(c2786e, i9, i10), 0);
                C2786e c2786e2 = AbstractC2787f.f9030b;
                c2786e2.getClass();
                c2316s02 = new C2316s0(c2786e2.f7615a, new C2293h(c2786e2, i9, i10), 0);
            } else {
                c2316s0 = null;
                c2316s02 = null;
            }
            arrayList3.add(c2316s04);
            if (z9) {
                arrayList3.add(c2316s0);
                arrayList3.add(c2316s02);
            }
        }
        C2066d c2066d = this.f5301a;
        int i11 = this.f5303c;
        HashMap map = new HashMap(this.f5304d);
        boolean z10 = this.f5309i;
        C1609a c1609a = this.f5310j;
        int i12 = this.f5311k;
        boolean z11 = this.f5312l;
        new ArrayList(arrayList);
        new ArrayList(arrayList2);
        return new C1614f(c2066d, i11, map, z10, c1609a, i12, z11, this.f5302b, arrayList3, this.f5313m, this.f5314n, new ArrayList(this.f5315o));
    }
}
