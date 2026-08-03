package Yue;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۡۧ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7189 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f21693 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f21694 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f21695 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static int f21696;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public AbstractC8432 f21697;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public AbstractC8432 f21698;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f21700;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f21701;

    /* JADX INFO: renamed from: ۥ */
    public int f2731 = 0;

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean f2732 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public ArrayList<AbstractC8432> f21699 = new ArrayList<>();

    public C7189(AbstractC8432 abstractC8432, int i) {
        this.f21697 = null;
        this.f21698 = null;
        int i2 = f21696;
        this.f21700 = i2;
        f21696 = i2 + 1;
        this.f21697 = abstractC8432;
        this.f21698 = abstractC8432;
        this.f21701 = i;
    }

    /* JADX INFO: renamed from: ۥ */
    public void m3481(AbstractC8432 abstractC8432) {
        this.f21699.add(abstractC8432);
        this.f21698 = abstractC8432;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public long m3482(C4129 c4129, int i) {
        long jMo10133;
        int i2;
        AbstractC8432 abstractC8432 = this.f21697;
        if (abstractC8432 instanceof C3692) {
            if (((C3692) abstractC8432).f25273 != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(abstractC8432 instanceof C5316)) {
                return 0L;
            }
        } else if (!(abstractC8432 instanceof C8184)) {
            return 0L;
        }
        C4371 c4371 = (i == 0 ? c4129.f8355 : c4129.f8356).f25275;
        C4371 c43712 = (i == 0 ? c4129.f8355 : c4129.f8356).f25276;
        boolean zContains = abstractC8432.f25275.f8960.contains(c4371);
        boolean zContains2 = this.f21697.f25276.f8960.contains(c43712);
        long jMo101332 = this.f21697.mo10133();
        if (zContains && zContains2) {
            long jM22524 = m22524(this.f21697.f25275, 0L);
            long jM22523 = m22523(this.f21697.f25276, 0L);
            long j = jM22524 - jMo101332;
            AbstractC8432 abstractC84322 = this.f21697;
            int i3 = abstractC84322.f25276.f8954;
            if (j >= (-i3)) {
                j += (long) i3;
            }
            int i4 = abstractC84322.f25275.f8954;
            long j2 = ((-jM22523) - jMo101332) - ((long) i4);
            if (j2 >= i4) {
                j2 -= (long) i4;
            }
            float fM11850 = abstractC84322.f3497.m11850(i);
            float f = fM11850 > 0.0f ? (long) ((j2 / fM11850) + (j / (1.0f - fM11850))) : 0L;
            long j3 = ((long) ((f * fM11850) + 0.5f)) + jMo101332 + ((long) ((f * (1.0f - fM11850)) + 0.5f));
            AbstractC8432 abstractC84323 = this.f21697;
            jMo10133 = ((long) abstractC84323.f25275.f8954) + j3;
            i2 = abstractC84323.f25276.f8954;
        } else {
            if (zContains) {
                return Math.max(m22524(this.f21697.f25275, r12.f8954), ((long) this.f21697.f25275.f8954) + jMo101332);
            }
            if (zContains2) {
                return Math.max(-m22523(this.f21697.f25276, r12.f8954), ((long) (-this.f21697.f25276.f8954)) + jMo101332);
            }
            AbstractC8432 abstractC84324 = this.f21697;
            jMo10133 = ((long) abstractC84324.f25275.f8954) + abstractC84324.mo10133();
            i2 = this.f21697.f25276.f8954;
        }
        return jMo10133 - ((long) i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m22521(AbstractC8432 abstractC8432, int i) {
        C4371 c4371;
        AbstractC8432 abstractC84322;
        C4371 c43712;
        AbstractC8432 abstractC84323;
        if (!abstractC8432.f3497.f8357[i]) {
            return false;
        }
        for (InterfaceC4369 interfaceC4369 : abstractC8432.f25275.f8959) {
            if ((interfaceC4369 instanceof C4371) && (abstractC84323 = (c43712 = (C4371) interfaceC4369).f8952) != abstractC8432 && c43712 == abstractC84323.f25275) {
                if (abstractC8432 instanceof C3692) {
                    Iterator<AbstractC8432> it = ((C3692) abstractC8432).f6530.iterator();
                    while (it.hasNext()) {
                        m22521(it.next(), i);
                    }
                } else if (!(abstractC8432 instanceof C5280)) {
                    abstractC8432.f3497.f8357[i] = false;
                }
                m22521(c43712.f8952, i);
            }
        }
        for (InterfaceC4369 interfaceC43692 : abstractC8432.f25276.f8959) {
            if ((interfaceC43692 instanceof C4371) && (abstractC84322 = (c4371 = (C4371) interfaceC43692).f8952) != abstractC8432 && c4371 == abstractC84322.f25275) {
                if (abstractC8432 instanceof C3692) {
                    Iterator<AbstractC8432> it2 = ((C3692) abstractC8432).f6530.iterator();
                    while (it2.hasNext()) {
                        m22521(it2.next(), i);
                    }
                } else if (!(abstractC8432 instanceof C5280)) {
                    abstractC8432.f3497.f8357[i] = false;
                }
                m22521(c4371.f8952, i);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m22522(boolean z, boolean z2) {
        if (z) {
            AbstractC8432 abstractC8432 = this.f21697;
            if (abstractC8432 instanceof C5316) {
                m22521(abstractC8432, 0);
            }
        }
        if (z2) {
            AbstractC8432 abstractC84322 = this.f21697;
            if (abstractC84322 instanceof C8184) {
                m22521(abstractC84322, 1);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final long m22523(C4371 c4371, long j) {
        AbstractC8432 abstractC8432 = c4371.f8952;
        if (abstractC8432 instanceof C5280) {
            return j;
        }
        int size = c4371.f8959.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC4369 interfaceC4369 = c4371.f8959.get(i);
            if (interfaceC4369 instanceof C4371) {
                C4371 c43712 = (C4371) interfaceC4369;
                if (c43712.f8952 != abstractC8432) {
                    jMin = Math.min(jMin, m22523(c43712, ((long) c43712.f8954) + j));
                }
            }
        }
        if (c4371 != abstractC8432.f25276) {
            return jMin;
        }
        long jMo10133 = j - abstractC8432.mo10133();
        return Math.min(Math.min(jMin, m22523(abstractC8432.f25275, jMo10133)), jMo10133 - ((long) abstractC8432.f25275.f8954));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final long m22524(C4371 c4371, long j) {
        AbstractC8432 abstractC8432 = c4371.f8952;
        if (abstractC8432 instanceof C5280) {
            return j;
        }
        int size = c4371.f8959.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC4369 interfaceC4369 = c4371.f8959.get(i);
            if (interfaceC4369 instanceof C4371) {
                C4371 c43712 = (C4371) interfaceC4369;
                if (c43712.f8952 != abstractC8432) {
                    jMax = Math.max(jMax, m22524(c43712, ((long) c43712.f8954) + j));
                }
            }
        }
        if (c4371 != abstractC8432.f25275) {
            return jMax;
        }
        long jMo10133 = j + abstractC8432.mo10133();
        return Math.max(Math.max(jMax, m22524(abstractC8432.f25276, jMo10133)), jMo10133 - ((long) abstractC8432.f25276.f8954));
    }
}
