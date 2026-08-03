package p082fd;

import androidx.lifecycle.C0119x;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import md.EnumC2824a;
import p012ah.C0086a;
import p081fc.C1203f;
import p222p.AbstractC3199a;
import p233pd.C3390a;
import p233pd.C3398i;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3503g;
import p246qd.C3509m;
import p246qd.C3510n;
import p281t3.AbstractC4106c;
import p302ud.C4320p;
import p332wb.AbstractC4855en;
import p351xe.C5784e;
import p369yd.C6028b;

/* JADX INFO: renamed from: fd.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1206c extends C1208e {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static boolean m3293s(AbstractC3508l abstractC3508l) {
        abstractC3508l.getClass();
        if (!(abstractC3508l instanceof C3509m)) {
            return false;
        }
        C4320p c4320p = ((C3509m) abstractC3508l).f11421l;
        EnumC3400k enumC3400k = c4320p.f14396k;
        if (enumC3400k == EnumC3400k.f10980j) {
            int iM8279b = AbstractC4106c.m8279b(((C3390a) c4320p).f10928o);
            if (iM8279b == 0 || iM8279b == 1 || iM8279b == 2 || iM8279b == 3 || iM8279b == 4) {
                return false;
            }
        } else {
            int iOrdinal = enumC3400k.ordinal();
            if (iOrdinal == 0 || iOrdinal == 22 || iOrdinal == 26 || iOrdinal == 30 || iOrdinal == 32 || iOrdinal == 34) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a A[PHI: r1
  0x010a: PHI (r1v2 int) = (r1v1 int), (r1v1 int), (r1v1 int), (r1v5 int) binds: [B:24:0x00a0, B:26:0x00a7, B:28:0x00b1, B:50:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3294r(C1203f c1203f, C0119x c0119x, C6028b c6028b) {
        ArrayDeque arrayDeque = (ArrayDeque) c0119x.f310h;
        arrayDeque.add(c6028b);
        int i9 = c6028b.f24477i;
        List list = c6028b.f24478j;
        int iM8279b = AbstractC4106c.m8279b(i9);
        if (iM8279b == 0) {
            C5784e c5784e = c6028b.f24479k;
            C3398i c3398i = (C3398i) c5784e.f23527b;
            int iM6828a = c3398i.f10945p;
            AbstractC3508l abstractC3508lMo7179S = c3398i.mo7179S(0);
            AbstractC3508l abstractC3508lM10466a = c5784e.m10466a();
            AbstractC3506j abstractC3506jMo7375I = abstractC3508lMo7179S.mo7375I();
            C3503g c3503g = AbstractC3506j.f11386c;
            if (abstractC3506jMo7375I.equals(c3503g)) {
                abstractC3508lM10466a.getClass();
                if ((abstractC3508lM10466a instanceof C3510n) && abstractC3508lM10466a.mo7375I().equals(c3503g)) {
                    if (((C3510n) abstractC3508lM10466a).f11422l == 0) {
                        iM6828a = AbstractC3199a.m6828a(iM6828a);
                    }
                    if (iM6828a == 1) {
                        if (arrayDeque.size() == 1) {
                            m3298b(c1203f, abstractC3508lMo7179S, false);
                        } else {
                            boolean zM3293s = m3293s(abstractC3508lMo7179S);
                            if (zM3293s) {
                                c1203f.mo3254d('(');
                            }
                            m3298b(c1203f, abstractC3508lMo7179S, false);
                            if (zM3293s) {
                                c1203f.mo3254d(')');
                            }
                        }
                    } else if (iM6828a == 2) {
                        c1203f.mo3254d('!');
                        boolean zM3293s2 = m3293s(abstractC3508lMo7179S);
                        if (zM3293s2) {
                            c1203f.mo3254d('(');
                        }
                        m3298b(c1203f, abstractC3508lMo7179S, false);
                        if (zM3293s2) {
                            c1203f.mo3254d(')');
                        }
                    } else {
                        this.f4061b.m6382K("Unsupported boolean condition ".concat(AbstractC3199a.m6833f(iM6828a)));
                        m3298b(c1203f, abstractC3508lMo7179S, m3293s(abstractC3508lMo7179S));
                        c1203f.mo3254d(' ').mo3255e(AbstractC3199a.m6833f(iM6828a)).mo3254d(' ');
                        m3298b(c1203f, abstractC3508lM10466a, m3293s(abstractC3508lM10466a));
                    }
                } else {
                    m3298b(c1203f, abstractC3508lMo7179S, m3293s(abstractC3508lMo7179S));
                    c1203f.mo3254d(' ').mo3255e(AbstractC3199a.m6833f(iM6828a)).mo3254d(' ');
                    m3298b(c1203f, abstractC3508lM10466a, m3293s(abstractC3508lM10466a));
                }
            }
        } else if (iM8279b == 1) {
            m3294r(c1203f, c0119x, c6028b.m10793H());
            c1203f.mo3255e(" ? ");
            m3294r(c1203f, c0119x, (C6028b) list.get(1));
            c1203f.mo3255e(" : ");
            m3294r(c1203f, c0119x, (C6028b) list.get(2));
        } else if (iM8279b == 2) {
            c1203f.mo3254d('!');
            m3295t(c1203f, c0119x, (C6028b) list.get(0));
        } else {
            if (iM8279b != 3 && iM8279b != 4) {
                C0086a.m452k("Unknown condition mode: ".concat(AbstractC4855en.m9273q(i9)));
                return;
            }
            String str = i9 == 4 ? " && " : " || ";
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m3295t(c1203f, c0119x, (C6028b) it.next());
                if (it.hasNext()) {
                    c1203f.mo3255e(str);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m3295t(C1203f c1203f, C0119x c0119x, C6028b c6028b) {
        boolean z9 = false;
        if (!c6028b.m10796L()) {
            if (!c6028b.f9217g.mo6235a(EnumC2824a.f9163p) && c6028b.f24477i != 3) {
                z9 = true;
            }
        }
        if (z9) {
            c1203f.mo3254d('(');
        }
        m3294r(c1203f, c0119x, c6028b);
        if (z9) {
            c1203f.mo3254d(')');
        }
    }
}
