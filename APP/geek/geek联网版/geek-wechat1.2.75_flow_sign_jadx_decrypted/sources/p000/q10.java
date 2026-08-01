package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q10 {

    /* JADX INFO: renamed from: a */
    public vb0 f3768a;

    /* JADX INFO: renamed from: b */
    public ArrayList f3769b;

    /* JADX INFO: renamed from: a */
    public static long m2106a(C0410kg c0410kg, long j) {
        vb0 vb0Var = c0410kg.f2830d;
        ArrayList arrayList = c0410kg.f2837k;
        if (vb0Var instanceof C0677ro) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC0333ig interfaceC0333ig = (InterfaceC0333ig) arrayList.get(i);
            if (interfaceC0333ig instanceof C0410kg) {
                C0410kg c0410kg2 = (C0410kg) interfaceC0333ig;
                if (c0410kg2.f2830d != vb0Var) {
                    jMin = Math.min(jMin, m2106a(c0410kg2, ((long) c0410kg2.f2832f) + j));
                }
            }
        }
        C0410kg c0410kg3 = vb0Var.f4934i;
        C0410kg c0410kg4 = vb0Var.f4933h;
        if (c0410kg != c0410kg3) {
            return jMin;
        }
        long jMo1216j = j - vb0Var.mo1216j();
        return Math.min(Math.min(jMin, m2106a(c0410kg4, jMo1216j)), jMo1216j - ((long) c0410kg4.f2832f));
    }

    /* JADX INFO: renamed from: b */
    public static long m2107b(C0410kg c0410kg, long j) {
        vb0 vb0Var = c0410kg.f2830d;
        ArrayList arrayList = c0410kg.f2837k;
        if (vb0Var instanceof C0677ro) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC0333ig interfaceC0333ig = (InterfaceC0333ig) arrayList.get(i);
            if (interfaceC0333ig instanceof C0410kg) {
                C0410kg c0410kg2 = (C0410kg) interfaceC0333ig;
                if (c0410kg2.f2830d != vb0Var) {
                    jMax = Math.max(jMax, m2107b(c0410kg2, ((long) c0410kg2.f2832f) + j));
                }
            }
        }
        C0410kg c0410kg3 = vb0Var.f4933h;
        C0410kg c0410kg4 = vb0Var.f4934i;
        if (c0410kg != c0410kg3) {
            return jMax;
        }
        long jMo1216j = vb0Var.mo1216j() + j;
        return Math.max(Math.max(jMax, m2107b(c0410kg4, jMo1216j)), jMo1216j - ((long) c0410kg4.f2832f));
    }
}
