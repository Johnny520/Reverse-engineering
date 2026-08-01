package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: v8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0810v8 extends qb0 {

    /* JADX INFO: renamed from: k */
    public final ArrayList f4817k;

    /* JADX INFO: renamed from: l */
    public int f4818l;

    public C0810v8(C0592pc c0592pc, int i) {
        C0592pc c0592pc2;
        super(c0592pc);
        ArrayList arrayList = new ArrayList();
        this.f4817k = arrayList;
        this.f4057f = i;
        C0592pc c0592pc3 = this.f4053b;
        C0592pc c0592pcM2099k = c0592pc3.m2099k(i);
        while (true) {
            c0592pc2 = c0592pc3;
            c0592pc3 = c0592pcM2099k;
            if (c0592pc3 == null) {
                break;
            } else {
                c0592pcM2099k = c0592pc3.m2099k(this.f4057f);
            }
        }
        this.f4053b = c0592pc2;
        int i2 = this.f4057f;
        arrayList.add(i2 == 0 ? c0592pc2.f3856d : i2 == 1 ? c0592pc2.f3857e : null);
        C0592pc c0592pcM2098j = c0592pc2.m2098j(this.f4057f);
        while (c0592pcM2098j != null) {
            int i3 = this.f4057f;
            arrayList.add(i3 == 0 ? c0592pcM2098j.f3856d : i3 == 1 ? c0592pcM2098j.f3857e : null);
            c0592pcM2098j = c0592pcM2098j.m2098j(this.f4057f);
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            qb0 qb0Var = (qb0) obj;
            int i5 = this.f4057f;
            if (i5 == 0) {
                qb0Var.f4053b.f3852b = this;
            } else if (i5 == 1) {
                qb0Var.f4053b.f3854c = this;
            }
        }
        if (this.f4057f == 0 && ((C0629qc) this.f4053b.f3832I).f4066h0 && arrayList.size() > 1) {
            this.f4053b = ((qb0) arrayList.get(arrayList.size() - 1)).f4053b;
        }
        this.f4818l = this.f4057f == 0 ? this.f4053b.f3847X : this.f4053b.f3848Y;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01bc A[PHI: r1 r26
  0x01bc: PHI (r1v57 int) = (r1v55 int), (r1v60 int) binds: [B:120:0x01ba, B:111:0x019a] A[DONT_GENERATE, DONT_INLINE]
  0x01bc: PHI (r26v1 int) = (r26v0 int), (r26v3 int) binds: [B:120:0x01ba, B:111:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00df  */
    @Override // p000.InterfaceC0297hg
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1357a(p000.InterfaceC0297hg r28) {
        /*
            Method dump skipped, instruction units count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0810v8.mo1357a(hg):void");
    }

    @Override // p000.qb0
    /* JADX INFO: renamed from: d */
    public final void mo1363d() {
        ArrayList arrayList = this.f4817k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((qb0) obj).mo1363d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        C0592pc c0592pc = ((qb0) arrayList.get(0)).f4053b;
        C0592pc c0592pc2 = ((qb0) arrayList.get(size2 - 1)).f4053b;
        int i2 = this.f4057f;
        C0373jg c0373jg = this.f4060i;
        C0373jg c0373jg2 = this.f4059h;
        if (i2 == 0) {
            C0099cc c0099cc = c0592pc.f3876x;
            C0099cc c0099cc2 = c0592pc2.f3878z;
            C0373jg c0373jgM2160i = qb0.m2160i(c0099cc, 0);
            int iM661c = c0099cc.m661c();
            C0592pc c0592pcM2492m = m2492m();
            if (c0592pcM2492m != null) {
                iM661c = c0592pcM2492m.f3876x.m661c();
            }
            if (c0373jgM2160i != null) {
                qb0.m2158b(c0373jg2, c0373jgM2160i, iM661c);
            }
            C0373jg c0373jgM2160i2 = qb0.m2160i(c0099cc2, 0);
            int iM661c2 = c0099cc2.m661c();
            C0592pc c0592pcM2493n = m2493n();
            if (c0592pcM2493n != null) {
                iM661c2 = c0592pcM2493n.f3878z.m661c();
            }
            if (c0373jgM2160i2 != null) {
                qb0.m2158b(c0373jg, c0373jgM2160i2, -iM661c2);
            }
        } else {
            C0099cc c0099cc3 = c0592pc.f3877y;
            C0099cc c0099cc4 = c0592pc2.f3824A;
            C0373jg c0373jgM2160i3 = qb0.m2160i(c0099cc3, 1);
            int iM661c3 = c0099cc3.m661c();
            C0592pc c0592pcM2492m2 = m2492m();
            if (c0592pcM2492m2 != null) {
                iM661c3 = c0592pcM2492m2.f3877y.m661c();
            }
            if (c0373jgM2160i3 != null) {
                qb0.m2158b(c0373jg2, c0373jgM2160i3, iM661c3);
            }
            C0373jg c0373jgM2160i4 = qb0.m2160i(c0099cc4, 1);
            int iM661c4 = c0099cc4.m661c();
            C0592pc c0592pcM2493n2 = m2493n();
            if (c0592pcM2493n2 != null) {
                iM661c4 = c0592pcM2493n2.f3824A.m661c();
            }
            if (c0373jgM2160i4 != null) {
                qb0.m2158b(c0373jg, c0373jgM2160i4, -iM661c4);
            }
        }
        c0373jg2.f2621a = this;
        c0373jg.f2621a = this;
    }

    @Override // p000.qb0
    /* JADX INFO: renamed from: e */
    public final void mo1364e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4817k;
            if (i >= arrayList.size()) {
                return;
            }
            ((qb0) arrayList.get(i)).mo1364e();
            i++;
        }
    }

    @Override // p000.qb0
    /* JADX INFO: renamed from: f */
    public final void mo1365f() {
        this.f4054c = null;
        ArrayList arrayList = this.f4817k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((qb0) obj).mo1365f();
        }
    }

    @Override // p000.qb0
    /* JADX INFO: renamed from: j */
    public final long mo2163j() {
        ArrayList arrayList = this.f4817k;
        int size = arrayList.size();
        long jMo2163j = 0;
        for (int i = 0; i < size; i++) {
            qb0 qb0Var = (qb0) arrayList.get(i);
            jMo2163j = ((long) qb0Var.f4060i.f2626f) + qb0Var.mo2163j() + jMo2163j + ((long) qb0Var.f4059h.f2626f);
        }
        return jMo2163j;
    }

    @Override // p000.qb0
    /* JADX INFO: renamed from: k */
    public final boolean mo1366k() {
        ArrayList arrayList = this.f4817k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((qb0) arrayList.get(i)).mo1366k()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final C0592pc m2492m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4817k;
            if (i >= arrayList.size()) {
                return null;
            }
            C0592pc c0592pc = ((qb0) arrayList.get(i)).f4053b;
            if (c0592pc.f3845V != 8) {
                return c0592pc;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: n */
    public final C0592pc m2493n() {
        ArrayList arrayList = this.f4817k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0592pc c0592pc = ((qb0) arrayList.get(size)).f4053b;
            if (c0592pc.f3845V != 8) {
                return c0592pc;
            }
        }
        return null;
    }

    public final String toString() {
        String strConcat = "ChainRun ".concat(this.f4057f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f4817k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            strConcat = z30.m2764i(z30.m2764i(strConcat, "<") + ((qb0) obj), "> ");
        }
        return strConcat;
    }
}
