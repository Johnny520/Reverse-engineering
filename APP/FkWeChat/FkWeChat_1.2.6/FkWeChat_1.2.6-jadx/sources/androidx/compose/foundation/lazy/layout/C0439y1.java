package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.InterfaceC0370f;
import p010a9.InterfaceC0184l;
import p080f9.C2363j;
import p117i.AbstractC3088u0;
import p117i.AbstractC3090v0;
import p117i.C3074n0;
import p263s.AbstractC6635e;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.y1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0439y1 implements InterfaceC0355b0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC3088u0 f1275a;

    /* JADX INFO: renamed from: b */
    public final Object[] f1276b;

    /* JADX INFO: renamed from: c */
    public final int f1277c;

    public C0439y1(C2363j c2363j, AbstractC0413q abstractC0413q) {
        InterfaceC0370f interfaceC0370fMo1319h = abstractC0413q.mo1319h();
        final int iM8560o = c2363j.m8560o();
        if (!(iM8560o >= 0)) {
            AbstractC6635e.m26320c("negative nearestRange.first");
        }
        final int iMin = Math.min(c2363j.m8561p(), interfaceC0370fMo1319h.mo1196a() - 1);
        if (iMin < iM8560o) {
            this.f1275a = AbstractC3090v0.m11575a();
            this.f1276b = new Object[0];
            this.f1277c = 0;
        } else {
            int i10 = (iMin - iM8560o) + 1;
            this.f1276b = new Object[i10];
            this.f1277c = iM8560o;
            final C3074n0 c3074n0 = new C3074n0(i10);
            interfaceC0370fMo1319h.mo1197b(iM8560o, iMin, new InterfaceC0184l() { // from class: androidx.compose.foundation.lazy.layout.x1
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return C0439y1.m1463a(iM8560o, iMin, c3074n0, this, (InterfaceC0370f.a) obj);
                }
            });
            this.f1275a = c3074n0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046 A[LOOP:0: B:4:0x0023->B:10:0x0046, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[EDGE_INSN: B:13:0x0049->B:11:0x0049 BREAK  A[LOOP:0: B:4:0x0023->B:10:0x0046], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p172l8.C4700i0 m1463a(int r4, int r5, p117i.C3074n0 r6, androidx.compose.foundation.lazy.layout.C0439y1 r7, androidx.compose.foundation.lazy.layout.InterfaceC0370f.a r8) {
        /*
            java.lang.Object r0 = r8.m1200c()
            androidx.compose.foundation.lazy.layout.q$a r0 = (androidx.compose.foundation.lazy.layout.AbstractC0413q.a) r0
            a9.l r0 = r0.getKey()
            int r1 = r8.m1199b()
            int r4 = java.lang.Math.max(r4, r1)
            int r1 = r8.m1199b()
            int r2 = r8.m1198a()
            int r1 = r1 + r2
            int r1 = r1 + (-1)
            int r5 = java.lang.Math.min(r5, r1)
            if (r4 > r5) goto L49
        L23:
            if (r0 == 0) goto L35
            int r1 = r8.m1199b()
            int r1 = r4 - r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r0.mo27m(r1)
            if (r1 != 0) goto L39
        L35:
            java.lang.Object r1 = androidx.compose.foundation.lazy.layout.AbstractC0430v1.m1437a(r4)
        L39:
            r6.m11447u(r1, r4)
            java.lang.Object[] r2 = r7.f1276b
            int r3 = r7.f1277c
            int r3 = r4 - r3
            r2[r3] = r1
            if (r4 == r5) goto L49
            int r4 = r4 + 1
            goto L23
        L49:
            l8.i0 r4 = p172l8.C4700i0.f13910a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.C0439y1.m1463a(int, int, i.n0, androidx.compose.foundation.lazy.layout.y1, androidx.compose.foundation.lazy.layout.f$a):l8.i0");
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0355b0
    /* JADX INFO: renamed from: b */
    public Object mo1124b(int i10) {
        Object[] objArr = this.f1276b;
        int i11 = i10 - this.f1277c;
        if (i11 < 0 || i11 >= objArr.length) {
            return null;
        }
        return objArr[i11];
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0355b0
    /* JADX INFO: renamed from: e */
    public int mo1125e(Object obj) {
        AbstractC3088u0 abstractC3088u0 = this.f1275a;
        int iM11565b = abstractC3088u0.m11565b(obj);
        if (iM11565b >= 0) {
            return abstractC3088u0.f8224c[iM11565b];
        }
        return -1;
    }
}
