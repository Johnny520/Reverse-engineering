package bsh;

import bsh.C1281x0;

/* JADX INFO: renamed from: bsh.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1244r extends AbstractC1195i4 implements C1281x0.a {

    /* JADX INFO: renamed from: A */
    public boolean f3786A;

    /* JADX INFO: renamed from: B */
    public Class[] f3787B;

    /* JADX INFO: renamed from: C */
    public int f3788C;

    /* JADX INFO: renamed from: D */
    public String[] f3789D;

    /* JADX INFO: renamed from: E */
    public boolean f3790E;

    /* JADX INFO: renamed from: y */
    public String[] f3791y;

    /* JADX INFO: renamed from: z */
    public C1283x2[] f3792z;

    public C1244r(int i10) {
        super(i10);
    }

    @Override // bsh.C1281x0.a
    /* JADX INFO: renamed from: b */
    public void mo4283b() {
        this.f3787B = null;
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Class[] mo4048p(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) {
        Class[] clsArr = this.f3787B;
        if (clsArr != null) {
            return clsArr;
        }
        m5068x();
        Class[] clsArr2 = new Class[this.f3788C];
        for (int i10 = 0; i10 < this.f3788C; i10++) {
            clsArr2[i10] = (Class) ((C1238q) mo4051s(i10)).mo4048p(c1174f1, runnableC1205k2);
        }
        this.f3787B = clsArr2;
        return clsArr2;
    }

    /* JADX INFO: renamed from: l */
    public C1283x2[] m5065l() {
        m5068x();
        return this.f3792z;
    }

    /* JADX INFO: renamed from: o */
    public String[] m5066o() {
        m5068x();
        return this.f3791y;
    }

    /* JADX INFO: renamed from: v */
    public String[] m5067v(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2, String str) {
        String[] strArr = this.f3789D;
        if (strArr != null) {
            return strArr;
        }
        m5068x();
        String[] strArr2 = new String[this.f3788C];
        for (int i10 = 0; i10 < this.f3788C; i10++) {
            strArr2[i10] = ((C1238q) mo4051s(i10)).m5046k(c1174f1, runnableC1205k2, str);
        }
        this.f3789D = strArr2;
        return strArr2;
    }

    /* JADX INFO: renamed from: x */
    public void m5068x() {
        if (this.f3791y != null) {
            return;
        }
        int iMo4050r = mo4050r();
        this.f3788C = iMo4050r;
        String[] strArr = new String[iMo4050r];
        C1283x2[] c1283x2Arr = new C1283x2[iMo4050r];
        for (int i10 = 0; i10 < this.f3788C; i10++) {
            C1238q c1238q = (C1238q) mo4051s(i10);
            this.f3790E = c1238q.f3768B;
            strArr[i10] = c1238q.f3770y;
            C1283x2 c1283x2 = new C1283x2(4);
            c1283x2Arr[i10] = c1283x2;
            if (c1238q.f3767A) {
                c1283x2.m5193b("final");
            }
        }
        this.f3791y = strArr;
        this.f3792z = c1283x2Arr;
    }

    /* JADX INFO: renamed from: y */
    public boolean m5069y() {
        return this.f3786A;
    }

    /* JADX INFO: renamed from: z */
    public void m5070z(boolean z10) {
        this.f3786A = z10;
    }
}
