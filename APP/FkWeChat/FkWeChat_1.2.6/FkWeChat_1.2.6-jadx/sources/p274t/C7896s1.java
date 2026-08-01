package p274t;

import java.util.List;
import p135j2.InterfaceC3563r;

/* JADX INFO: renamed from: t.s1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7896s1 {

    /* JADX INFO: renamed from: a */
    public static final C7896s1 f26302a = new C7896s1();

    /* JADX INFO: renamed from: a */
    public final int m30488a(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC3563r interfaceC3563r = (InterfaceC3563r) list.get(i12);
            float fM30549e = AbstractC7912v2.m30549e(AbstractC7912v2.m30547c(interfaceC3563r));
            if (fM30549e == 0.0f) {
                int iMin2 = Math.min(interfaceC3563r.mo13147W(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC3563r.mo13150t(iMin2));
            } else if (fM30549e > 0.0f) {
                f10 += fM30549e;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC3563r interfaceC3563r2 = (InterfaceC3563r) list.get(i13);
            float fM30549e2 = AbstractC7912v2.m30549e(AbstractC7912v2.m30547c(interfaceC3563r2));
            if (fM30549e2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC3563r2.mo13150t(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM30549e2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    /* JADX INFO: renamed from: b */
    public final int m30489b(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC3563r interfaceC3563r = (InterfaceC3563r) list.get(i13);
            float fM30549e = AbstractC7912v2.m30549e(AbstractC7912v2.m30547c(interfaceC3563r));
            int iMo13147W = interfaceC3563r.mo13147W(i10);
            if (fM30549e == 0.0f) {
                i12 += iMo13147W;
            } else if (fM30549e > 0.0f) {
                f10 += fM30549e;
                iMax = Math.max(iMax, Math.round(iMo13147W / fM30549e));
            }
        }
        return Math.round(iMax * f10) + i12 + ((list.size() - 1) * i11);
    }

    /* JADX INFO: renamed from: c */
    public final int m30490c(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC3563r interfaceC3563r = (InterfaceC3563r) list.get(i12);
            float fM30549e = AbstractC7912v2.m30549e(AbstractC7912v2.m30547c(interfaceC3563r));
            if (fM30549e == 0.0f) {
                int iMin2 = Math.min(interfaceC3563r.mo13147W(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC3563r.mo13151z0(iMin2));
            } else if (fM30549e > 0.0f) {
                f10 += fM30549e;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC3563r interfaceC3563r2 = (InterfaceC3563r) list.get(i13);
            float fM30549e2 = AbstractC7912v2.m30549e(AbstractC7912v2.m30547c(interfaceC3563r2));
            if (fM30549e2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC3563r2.mo13151z0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM30549e2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    /* JADX INFO: renamed from: d */
    public final int m30491d(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC3563r interfaceC3563r = (InterfaceC3563r) list.get(i13);
            float fM30549e = AbstractC7912v2.m30549e(AbstractC7912v2.m30547c(interfaceC3563r));
            int iMo13146S = interfaceC3563r.mo13146S(i10);
            if (fM30549e == 0.0f) {
                i12 += iMo13146S;
            } else if (fM30549e > 0.0f) {
                f10 += fM30549e;
                iMax = Math.max(iMax, Math.round(iMo13146S / fM30549e));
            }
        }
        return Math.round(iMax * f10) + i12 + ((list.size() - 1) * i11);
    }

    /* JADX INFO: renamed from: e */
    public final int m30492e(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC3563r interfaceC3563r = (InterfaceC3563r) list.get(i13);
            float fM30549e = AbstractC7912v2.m30549e(AbstractC7912v2.m30547c(interfaceC3563r));
            int iMo13150t = interfaceC3563r.mo13150t(i10);
            if (fM30549e == 0.0f) {
                i12 += iMo13150t;
            } else if (fM30549e > 0.0f) {
                f10 += fM30549e;
                iMax = Math.max(iMax, Math.round(iMo13150t / fM30549e));
            }
        }
        return Math.round(iMax * f10) + i12 + ((list.size() - 1) * i11);
    }

    /* JADX INFO: renamed from: f */
    public final int m30493f(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC3563r interfaceC3563r = (InterfaceC3563r) list.get(i12);
            float fM30549e = AbstractC7912v2.m30549e(AbstractC7912v2.m30547c(interfaceC3563r));
            if (fM30549e == 0.0f) {
                int iMin2 = Math.min(interfaceC3563r.mo13150t(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC3563r.mo13147W(iMin2));
            } else if (fM30549e > 0.0f) {
                f10 += fM30549e;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC3563r interfaceC3563r2 = (InterfaceC3563r) list.get(i13);
            float fM30549e2 = AbstractC7912v2.m30549e(AbstractC7912v2.m30547c(interfaceC3563r2));
            if (fM30549e2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC3563r2.mo13147W(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM30549e2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    /* JADX INFO: renamed from: g */
    public final int m30494g(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC3563r interfaceC3563r = (InterfaceC3563r) list.get(i13);
            float fM30549e = AbstractC7912v2.m30549e(AbstractC7912v2.m30547c(interfaceC3563r));
            int iMo13151z0 = interfaceC3563r.mo13151z0(i10);
            if (fM30549e == 0.0f) {
                i12 += iMo13151z0;
            } else if (fM30549e > 0.0f) {
                f10 += fM30549e;
                iMax = Math.max(iMax, Math.round(iMo13151z0 / fM30549e));
            }
        }
        return Math.round(iMax * f10) + i12 + ((list.size() - 1) * i11);
    }

    /* JADX INFO: renamed from: h */
    public final int m30495h(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC3563r interfaceC3563r = (InterfaceC3563r) list.get(i12);
            float fM30549e = AbstractC7912v2.m30549e(AbstractC7912v2.m30547c(interfaceC3563r));
            if (fM30549e == 0.0f) {
                int iMin2 = Math.min(interfaceC3563r.mo13150t(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC3563r.mo13146S(iMin2));
            } else if (fM30549e > 0.0f) {
                f10 += fM30549e;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC3563r interfaceC3563r2 = (InterfaceC3563r) list.get(i13);
            float fM30549e2 = AbstractC7912v2.m30549e(AbstractC7912v2.m30547c(interfaceC3563r2));
            if (fM30549e2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC3563r2.mo13146S(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM30549e2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }
}
