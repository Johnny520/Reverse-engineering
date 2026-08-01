package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: g9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0253g9 extends vb0 {

    /* JADX INFO: renamed from: k */
    public final ArrayList f1928k;

    /* JADX INFO: renamed from: l */
    public int f1929l;

    public C0253g9(C0925yc c0925yc, int i) {
        C0925yc c0925yc2;
        super(c0925yc);
        ArrayList arrayList = new ArrayList();
        this.f1928k = arrayList;
        this.f4931f = i;
        C0925yc c0925yc3 = this.f4927b;
        C0925yc c0925ycM2748k = c0925yc3.m2748k(i);
        while (true) {
            c0925yc2 = c0925yc3;
            c0925yc3 = c0925ycM2748k;
            if (c0925yc3 == null) {
                break;
            } else {
                c0925ycM2748k = c0925yc3.m2748k(this.f4931f);
            }
        }
        this.f4927b = c0925yc2;
        int i2 = this.f4931f;
        arrayList.add(i2 == 0 ? c0925yc2.f5403d : i2 == 1 ? c0925yc2.f5404e : null);
        C0925yc c0925ycM2747j = c0925yc2.m2747j(this.f4931f);
        while (c0925ycM2747j != null) {
            int i3 = this.f4931f;
            arrayList.add(i3 == 0 ? c0925ycM2747j.f5403d : i3 == 1 ? c0925ycM2747j.f5404e : null);
            c0925ycM2747j = c0925ycM2747j.m2747j(this.f4931f);
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            vb0 vb0Var = (vb0) obj;
            int i5 = this.f4931f;
            if (i5 == 0) {
                vb0Var.f4927b.f5399b = this;
            } else if (i5 == 1) {
                vb0Var.f4927b.f5401c = this;
            }
        }
        if (this.f4931f == 0 && ((C0962zc) this.f4927b.f5379I).f5569h0 && arrayList.size() > 1) {
            this.f4927b = ((vb0) arrayList.get(arrayList.size() - 1)).f4927b;
        }
        this.f1929l = this.f4931f == 0 ? this.f4927b.f5394X : this.f4927b.f5395Y;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01bc A[PHI: r1 r26
  0x01bc: PHI (r1v57 int) = (r1v55 int), (r1v60 int) binds: [B:120:0x01ba, B:111:0x019a] A[DONT_GENERATE, DONT_INLINE]
  0x01bc: PHI (r26v1 int) = (r26v0 int), (r26v3 int) binds: [B:120:0x01ba, B:111:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00df  */
    @Override // p000.InterfaceC0333ig
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1212a(p000.InterfaceC0333ig r28) {
        /*
            Method dump skipped, instruction units count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0253g9.mo1212a(ig):void");
    }

    @Override // p000.vb0
    /* JADX INFO: renamed from: d */
    public final void mo1213d() {
        ArrayList arrayList = this.f1928k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((vb0) obj).mo1213d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        C0925yc c0925yc = ((vb0) arrayList.get(0)).f4927b;
        C0925yc c0925yc2 = ((vb0) arrayList.get(size2 - 1)).f4927b;
        int i2 = this.f4931f;
        C0410kg c0410kg = this.f4934i;
        C0410kg c0410kg2 = this.f4933h;
        if (i2 == 0) {
            C0443lc c0443lc = c0925yc.f5423x;
            C0443lc c0443lc2 = c0925yc2.f5425z;
            C0410kg c0410kgM2557i = vb0.m2557i(c0443lc, 0);
            int iM1753c = c0443lc.m1753c();
            C0925yc c0925ycM1218m = m1218m();
            if (c0925ycM1218m != null) {
                iM1753c = c0925ycM1218m.f5423x.m1753c();
            }
            if (c0410kgM2557i != null) {
                vb0.m2555b(c0410kg2, c0410kgM2557i, iM1753c);
            }
            C0410kg c0410kgM2557i2 = vb0.m2557i(c0443lc2, 0);
            int iM1753c2 = c0443lc2.m1753c();
            C0925yc c0925ycM1219n = m1219n();
            if (c0925ycM1219n != null) {
                iM1753c2 = c0925ycM1219n.f5425z.m1753c();
            }
            if (c0410kgM2557i2 != null) {
                vb0.m2555b(c0410kg, c0410kgM2557i2, -iM1753c2);
            }
        } else {
            C0443lc c0443lc3 = c0925yc.f5424y;
            C0443lc c0443lc4 = c0925yc2.f5371A;
            C0410kg c0410kgM2557i3 = vb0.m2557i(c0443lc3, 1);
            int iM1753c3 = c0443lc3.m1753c();
            C0925yc c0925ycM1218m2 = m1218m();
            if (c0925ycM1218m2 != null) {
                iM1753c3 = c0925ycM1218m2.f5424y.m1753c();
            }
            if (c0410kgM2557i3 != null) {
                vb0.m2555b(c0410kg2, c0410kgM2557i3, iM1753c3);
            }
            C0410kg c0410kgM2557i4 = vb0.m2557i(c0443lc4, 1);
            int iM1753c4 = c0443lc4.m1753c();
            C0925yc c0925ycM1219n2 = m1219n();
            if (c0925ycM1219n2 != null) {
                iM1753c4 = c0925ycM1219n2.f5371A.m1753c();
            }
            if (c0410kgM2557i4 != null) {
                vb0.m2555b(c0410kg, c0410kgM2557i4, -iM1753c4);
            }
        }
        c0410kg2.f2827a = this;
        c0410kg.f2827a = this;
    }

    @Override // p000.vb0
    /* JADX INFO: renamed from: e */
    public final void mo1214e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1928k;
            if (i >= arrayList.size()) {
                return;
            }
            ((vb0) arrayList.get(i)).mo1214e();
            i++;
        }
    }

    @Override // p000.vb0
    /* JADX INFO: renamed from: f */
    public final void mo1215f() {
        this.f4928c = null;
        ArrayList arrayList = this.f1928k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((vb0) obj).mo1215f();
        }
    }

    @Override // p000.vb0
    /* JADX INFO: renamed from: j */
    public final long mo1216j() {
        ArrayList arrayList = this.f1928k;
        int size = arrayList.size();
        long jMo1216j = 0;
        for (int i = 0; i < size; i++) {
            vb0 vb0Var = (vb0) arrayList.get(i);
            jMo1216j = ((long) vb0Var.f4934i.f2832f) + vb0Var.mo1216j() + jMo1216j + ((long) vb0Var.f4933h.f2832f);
        }
        return jMo1216j;
    }

    @Override // p000.vb0
    /* JADX INFO: renamed from: k */
    public final boolean mo1217k() {
        ArrayList arrayList = this.f1928k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((vb0) arrayList.get(i)).mo1217k()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final C0925yc m1218m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1928k;
            if (i >= arrayList.size()) {
                return null;
            }
            C0925yc c0925yc = ((vb0) arrayList.get(i)).f4927b;
            if (c0925yc.f5392V != 8) {
                return c0925yc;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: n */
    public final C0925yc m1219n() {
        ArrayList arrayList = this.f1928k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0925yc c0925yc = ((vb0) arrayList.get(size)).f4927b;
            if (c0925yc.f5392V != 8) {
                return c0925yc;
            }
        }
        return null;
    }

    public final String toString() {
        String strConcat = "ChainRun ".concat(this.f4931f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f1928k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            strConcat = g40.m1146i(g40.m1146i(strConcat, "<") + ((vb0) obj), "> ");
        }
        return strConcat;
    }
}
