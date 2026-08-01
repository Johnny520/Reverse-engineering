package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class o10 {

    /* JADX INFO: renamed from: a */
    public final dz0 f4383a;

    /* JADX INFO: renamed from: b */
    public j10 f4384b;

    /* JADX INFO: renamed from: c */
    public m10 f4385c;

    /* JADX INFO: renamed from: d */
    public l10 f4386d;

    /* JADX INFO: renamed from: e */
    public k10 f4387e;

    /* JADX INFO: renamed from: f */
    public rd0 f4388f;

    /* JADX INFO: renamed from: g */
    public qb1 f4389g;

    /* JADX INFO: renamed from: h */
    public long f4390h = 9205357640488583168L;

    /* JADX INFO: renamed from: i */
    public q81 f4391i;

    /* JADX INFO: renamed from: j */
    public final p10 f4392j;

    /* JADX INFO: renamed from: k */
    public final p10 f4393k;

    /* JADX INFO: renamed from: l */
    public long f4394l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o10(dz0 dz0Var) {
        this.f4383a = dz0Var;
        p10 p10Var = new p10();
        p10Var.f4694b = new ArrayList();
        this.f4392j = p10Var;
        p10 p10Var2 = new p10();
        p10Var2.f4694b = new ArrayList();
        this.f4393k = p10Var2;
        this.f4394l = 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m2751c(o10 o10Var, h10 h10Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        dz0 dz0Var = o10Var.f4383a;
        l10 l10Var = o10Var.f4386d;
        if (l10Var == null) {
            l10Var = new l10();
            l10Var.f3306t = null;
            l10Var.f3307u = Long.MAX_VALUE;
            l10Var.f3308v = false;
            o10Var.f4386d = l10Var;
        }
        l10Var.f3306t = h10Var;
        l10Var.f3307u = j;
        q81 q81Var = o10Var.f4391i;
        um0 um0Var = dz0Var.f1238t;
        if (q81Var == null) {
            o10Var.f4391i = new q81(um0Var);
        } else {
            q81Var.f5087a = um0Var;
            q81Var.f5088b = j2;
        }
        l10Var.f3308v = false;
        o10Var.f4388f = l10Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2752a() {
        j10 j10Var = this.f4384b;
        i10 i10Var = i10.f2393f;
        if (j10Var == null) {
            j10Var = new j10();
            j10Var.f2656t = i10Var;
            j10Var.f2657u = false;
            this.f4384b = j10Var;
        }
        j10Var.f2656t = i10Var;
        j10Var.f2657u = false;
        this.f4388f = j10Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m2753b(h10 h10Var, long j, q81 q81Var) {
        k10 k10Var = this.f4387e;
        if (k10Var == null) {
            k10Var = new k10();
            k10Var.f2985t = null;
            k10Var.f2986u = Long.MAX_VALUE;
            this.f4387e = k10Var;
        }
        k10Var.f2985t = h10Var;
        k10Var.f2986u = j;
        q81Var.f5088b = 0L;
        this.f4388f = k10Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final qb1 m2754d() {
        qb1 qb1Var = this.f4389g;
        if (qb1Var != null) {
            return qb1Var;
        }
        C0921xc.m5131l("Velocity Tracker not initialized.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m2755e(h10 h10Var, g10 g10Var, long j) {
        dz0 dz0Var = this.f4383a;
        long jMo344d = pf1.m3038P(dz0Var).mo344d(0L);
        if (!ok0.m2931b(this.f4390h, 9205357640488583168L) && !ok0.m2931b(jMo344d, this.f4390h)) {
            this.f4394l = ok0.m2934e(this.f4394l, ok0.m2933d(jMo344d, this.f4390h));
        }
        this.f4390h = jMo344d;
        um0 um0Var = dz0Var.f1238t;
        um0Var.getClass();
        int i = AbstractC0560oq.f4604a;
        if (Math.abs(Float.intBitsToFloat((int) (um0Var == um0.f6264d ? j & 4294967295L : j >> 32))) > 2.0f) {
            s91.m4041f(m2754d(), h10Var, dz0Var.f1238t, g10Var, this.f4392j, this.f4394l);
            p10 p10Var = this.f4393k;
            ArrayList arrayList = p10Var.f4694b;
            if (arrayList.size() == 3) {
                int i2 = p10Var.f4693a;
                p10Var.f4693a = i2 + 1;
                arrayList.set(i2, new ok0(j));
            } else {
                arrayList.add(new ok0(j));
            }
            if (p10Var.f4693a == 3) {
                p10Var.f4693a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((ok0) arrayList.get(i3)).f4590a >> 32))));
            }
            float fM5238H = (float) AbstractC0960ye.m5238H(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((ok0) arrayList.get(i4)).f4590a & 4294967295L))));
            }
            dz0Var.m749G0(new C0027aq((((long) Float.floatToRawIntBits((float) AbstractC0960ye.m5238H(arrayList3))) & 4294967295L) | (((long) Float.floatToRawIntBits(fM5238H)) << 32), true));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m2756f(h10 h10Var, h10 h10Var2, g10 g10Var, long j) {
        if (this.f4389g == null) {
            this.f4389g = new qb1();
        }
        this.f4394l = 0L;
        qb1 qb1VarM2754d = m2754d();
        dz0 dz0Var = this.f4383a;
        s91.m4041f(qb1VarM2754d, h10Var, dz0Var.f1238t, g10Var, this.f4392j, this.f4394l);
        long jM2933d = ok0.m2933d(s91.m4024K(h10Var2, dz0Var.f1238t, g10Var), j);
        dz0Var.f1239u.getClass();
        this.f4390h = pf1.m3038P(dz0Var).mo344d(0L);
        dz0Var.m749G0(new C0064bq(jM2933d));
        p10 p10Var = this.f4393k;
        p10Var.f4693a = 0;
        p10Var.f4694b.clear();
    }
}
