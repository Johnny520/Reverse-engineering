package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class v80 implements yd0 {

    /* JADX INFO: renamed from: a */
    public final w80 f6445a;

    /* JADX INFO: renamed from: b */
    public final int f6446b;

    /* JADX INFO: renamed from: c */
    public final boolean f6447c;

    /* JADX INFO: renamed from: d */
    public final float f6448d;

    /* JADX INFO: renamed from: e */
    public final yd0 f6449e;

    /* JADX INFO: renamed from: f */
    public final float f6450f;

    /* JADX INFO: renamed from: g */
    public final boolean f6451g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC0966yk f6452h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC0968ym f6453i;

    /* JADX INFO: renamed from: j */
    public final long f6454j;

    /* JADX INFO: renamed from: k */
    public final List f6455k;

    /* JADX INFO: renamed from: l */
    public final int f6456l;

    /* JADX INFO: renamed from: m */
    public final int f6457m;

    /* JADX INFO: renamed from: n */
    public final int f6458n;

    /* JADX INFO: renamed from: o */
    public final um0 f6459o;

    /* JADX INFO: renamed from: p */
    public final int f6460p;

    /* JADX INFO: renamed from: q */
    public final int f6461q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v80(w80 w80Var, int i, boolean z, float f, yd0 yd0Var, float f2, boolean z2, InterfaceC0966yk interfaceC0966yk, InterfaceC0968ym interfaceC0968ym, long j, List list, int i2, int i3, int i4, um0 um0Var, int i5, int i6) {
        this.f6445a = w80Var;
        this.f6446b = i;
        this.f6447c = z;
        this.f6448d = f;
        this.f6449e = yd0Var;
        this.f6450f = f2;
        this.f6451g = z2;
        this.f6452h = interfaceC0966yk;
        this.f6453i = interfaceC0968ym;
        this.f6454j = j;
        this.f6455k = list;
        this.f6456l = i2;
        this.f6457m = i3;
        this.f6458n = i4;
        this.f6459o = um0Var;
        this.f6460p = i5;
        this.f6461q = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd0
    /* JADX INFO: renamed from: a */
    public final Map mo667a() {
        return this.f6449e.mo667a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd0
    /* JADX INFO: renamed from: b */
    public final void mo668b() {
        this.f6449e.mo668b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd0
    /* JADX INFO: renamed from: c */
    public final int mo669c() {
        return this.f6449e.mo669c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd0
    /* JADX INFO: renamed from: d */
    public final InterfaceC0742sw mo1678d() {
        return this.f6449e.mo1678d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd0
    /* JADX INFO: renamed from: e */
    public final int mo670e() {
        return this.f6449e.mo670e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final v80 m4420f(int i, boolean z) {
        w80 w80Var;
        if (this.f6451g) {
            return null;
        }
        List list = this.f6455k;
        if (list.isEmpty() || (w80Var = this.f6445a) == null) {
            return null;
        }
        int i2 = w80Var.f7041k;
        int i3 = this.f6446b - i;
        if (i3 < 0 || i3 >= i2) {
            return null;
        }
        w80 w80Var2 = (w80) AbstractC0960ye.m5240J(list);
        w80 w80Var3 = (w80) AbstractC0960ye.m5246P(list);
        if (w80Var2.f7043m || w80Var3.f7043m) {
            return null;
        }
        int i4 = w80Var2.f7039i;
        int i5 = this.f6457m;
        int i6 = this.f6456l;
        if (i < 0) {
            if (Math.min((i4 + w80Var2.f7041k) - i6, (w80Var3.f7039i + w80Var3.f7041k) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - i4, i5 - w80Var3.f7039i) <= i) {
            return null;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            w80 w80Var4 = (w80) list.get(i7);
            w80Var4.getClass();
            int[] iArr = w80Var4.f7045o;
            if (!w80Var4.f7043m) {
                w80Var4.f7039i += i;
                int length = iArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    if ((i8 & 1) == 0) {
                        iArr[i8] = iArr[i8] + i;
                    }
                }
                if (z) {
                    int size2 = w80Var4.f7032b.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        AbstractC0748t1.m4160r(w80Var4.f7038h.f3371a.m1701g(w80Var4.f7036f));
                    }
                }
            }
        }
        return new v80(this.f6445a, i3, this.f6447c || i > 0, i, this.f6449e, this.f6450f, this.f6451g, this.f6452h, this.f6453i, this.f6454j, list, this.f6456l, this.f6457m, this.f6458n, this.f6459o, this.f6460p, this.f6461q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final long m4421g() {
        yd0 yd0Var = this.f6449e;
        return (((long) yd0Var.mo670e()) << 32) | (((long) yd0Var.mo669c()) & 4294967295L);
    }
}
