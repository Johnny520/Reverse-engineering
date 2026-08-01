package androidx.compose.foundation.lazy.layout;

import p024b9.C1042j0;
import p024b9.C1044k0;
import p024b9.C1046l0;
import p024b9.C1050n0;
import p080f9.AbstractC2368o;
import p121i3.C3179i;
import p163l.C4312j;
import p163l.C4327m;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.b1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0356b1 {

    /* JADX INFO: renamed from: a */
    public static final float f1011a = C3179i.m12003k(2500);

    /* JADX INFO: renamed from: b */
    public static final float f1012b = C3179i.m12003k(1500);

    /* JADX INFO: renamed from: c */
    public static final float f1013c = C3179i.m12003k(50);

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.b1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: A */
        public float f1014A;

        /* JADX INFO: renamed from: B */
        public /* synthetic */ Object f1015B;

        /* JADX INFO: renamed from: C */
        public int f1016C;

        /* JADX INFO: renamed from: q */
        public Object f1017q;

        /* JADX INFO: renamed from: r */
        public Object f1018r;

        /* JADX INFO: renamed from: s */
        public Object f1019s;

        /* JADX INFO: renamed from: t */
        public Object f1020t;

        /* JADX INFO: renamed from: u */
        public int f1021u;

        /* JADX INFO: renamed from: v */
        public int f1022v;

        /* JADX INFO: renamed from: w */
        public int f1023w;

        /* JADX INFO: renamed from: x */
        public int f1024x;

        /* JADX INFO: renamed from: y */
        public float f1025y;

        /* JADX INFO: renamed from: z */
        public float f1026z;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f1015B = obj;
            this.f1016C |= Integer.MIN_VALUE;
            return AbstractC0356b1.m1128c(null, 0, 0, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m1126a(InterfaceC0438y0 interfaceC0438y0, int i10, float f10, C1044k0 c1044k0, C1042j0 c1042j0, boolean z10, float f11, C1046l0 c1046l0, int i11, int i12, C1050n0 c1050n0, C4312j c4312j) {
        if (!m1130e(interfaceC0438y0, i10)) {
            float fM8581h = (f10 > 0.0f ? AbstractC2368o.m8581h(((Number) c4312j.m16943e()).floatValue(), f10) : AbstractC2368o.m8577d(((Number) c4312j.m16943e()).floatValue(), f10)) - c1044k0.f3203q;
            float fMo23523g = interfaceC0438y0.mo23523g(fM8581h);
            if (!m1130e(interfaceC0438y0, i10) && !m1129d(z10, interfaceC0438y0, i10, i12)) {
                if (fM8581h != fMo23523g) {
                    c4312j.m16939a();
                    c1042j0.f3202q = false;
                    return C4700i0.f13910a;
                }
                c1044k0.f3203q += fM8581h;
                if (z10) {
                    if (((Number) c4312j.m16943e()).floatValue() > f11) {
                        c4312j.m16939a();
                    }
                } else if (((Number) c4312j.m16943e()).floatValue() < (-f11)) {
                    c4312j.m16939a();
                }
                if (z10) {
                    if (c1046l0.f3205q >= 2 && i10 - interfaceC0438y0.mo1458c() > i11) {
                        interfaceC0438y0.mo1460e(i10 - i11, 0);
                    }
                } else if (c1046l0.f3205q >= 2 && interfaceC0438y0.mo1462h() - i10 > i11) {
                    interfaceC0438y0.mo1460e(i11 + i10, 0);
                }
            }
        }
        if (!m1129d(z10, interfaceC0438y0, i10, i12)) {
            if (m1130e(interfaceC0438y0, i10)) {
                throw new C0378h(InterfaceC0438y0.m1456b(interfaceC0438y0, i10, 0, 2, null), (C4327m) c1050n0.f3208q);
            }
            return C4700i0.f13910a;
        }
        interfaceC0438y0.mo1460e(i10, i12);
        c1042j0.f3202q = false;
        c4312j.m16939a();
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m1127b(float f10, C1044k0 c1044k0, InterfaceC0438y0 interfaceC0438y0, C4312j c4312j) {
        float fM8577d = 0.0f;
        if (f10 > 0.0f) {
            fM8577d = AbstractC2368o.m8581h(((Number) c4312j.m16943e()).floatValue(), f10);
        } else if (f10 < 0.0f) {
            fM8577d = AbstractC2368o.m8577d(((Number) c4312j.m16943e()).floatValue(), f10);
        }
        float f11 = fM8577d - c1044k0.f3203q;
        if (f11 != interfaceC0438y0.mo23523g(f11) || fM8577d != ((Number) c4312j.m16943e()).floatValue()) {
            c4312j.m16939a();
        }
        c1044k0.f3203q += f11;
        return C4700i0.f13910a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9 A[Catch: h -> 0x01eb, TryCatch #4 {h -> 0x01eb, blocks: (B:35:0x00e5, B:37:0x00e9, B:39:0x00ef, B:53:0x0120, B:57:0x015c, B:61:0x0164), top: B:113:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x024e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01b4 -> B:18:0x0071). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1128c(androidx.compose.foundation.lazy.layout.InterfaceC0438y0 r37, int r38, int r39, int r40, p121i3.InterfaceC3175e r41, p228p8.InterfaceC5976f r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.AbstractC0356b1.m1128c(androidx.compose.foundation.lazy.layout.y0, int, int, int, i3.e, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m1129d(boolean z10, InterfaceC0438y0 interfaceC0438y0, int i10, int i11) {
        if (z10) {
            if (interfaceC0438y0.mo1462h() > i10) {
                return true;
            }
            return interfaceC0438y0.mo1462h() == i10 && interfaceC0438y0.mo1461f() > i11;
        }
        if (interfaceC0438y0.mo1462h() < i10) {
            return true;
        }
        return interfaceC0438y0.mo1462h() == i10 && interfaceC0438y0.mo1461f() < i11;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m1130e(InterfaceC0438y0 interfaceC0438y0, int i10) {
        return i10 <= interfaceC0438y0.mo1458c() && interfaceC0438y0.mo1462h() <= i10;
    }
}
