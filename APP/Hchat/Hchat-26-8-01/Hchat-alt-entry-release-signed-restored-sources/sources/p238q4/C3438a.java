package p238q4;

import java.util.BitSet;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;
import p077f8.AbstractC1089i;
import p227p4.AbstractC3303h;
import p227p4.AbstractC3307l;
import p227p4.C3296b0;
import p227p4.C3302g;
import p227p4.C3313r;
import p227p4.C3321z;
import p295u4.C4265o;
import p295u4.C4266p;
import p311v4.AbstractC4446a;
import p311v4.AbstractC4471t;
import p311v4.AbstractC4472u;
import p311v4.C4447a0;
import p311v4.C4451c0;
import p311v4.C4453d0;
import p311v4.C4460i;
import p311v4.C4464m;
import p311v4.C4475x;
import p311v4.C4476y;
import p326w4.C4683c;
import p376z4.C6090d;

/* JADX INFO: renamed from: q4.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3438a extends AbstractC1089i {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f11155b;

    /* JADX INFO: renamed from: c */
    public static final C3438a f11131c = new C3438a(0);

    /* JADX INFO: renamed from: d */
    public static final C3438a f11132d = new C3438a(1);

    /* JADX INFO: renamed from: e */
    public static final C3438a f11133e = new C3438a(2);

    /* JADX INFO: renamed from: f */
    public static final C3438a f11134f = new C3438a(3);

    /* JADX INFO: renamed from: g */
    public static final C3438a f11135g = new C3438a(4);

    /* JADX INFO: renamed from: h */
    public static final C3438a f11136h = new C3438a(5);

    /* JADX INFO: renamed from: i */
    public static final C3438a f11137i = new C3438a(6);

    /* JADX INFO: renamed from: j */
    public static final C3438a f11138j = new C3438a(7);

    /* JADX INFO: renamed from: k */
    public static final C3438a f11139k = new C3438a(8);

    /* JADX INFO: renamed from: l */
    public static final C3438a f11140l = new C3438a(9);

    /* JADX INFO: renamed from: m */
    public static final C3438a f11141m = new C3438a(10);

    /* JADX INFO: renamed from: n */
    public static final C3438a f11142n = new C3438a(11);

    /* JADX INFO: renamed from: o */
    public static final C3438a f11143o = new C3438a(12);

    /* JADX INFO: renamed from: p */
    public static final C3438a f11144p = new C3438a(13);

    /* JADX INFO: renamed from: q */
    public static final C3438a f11145q = new C3438a(14);

    /* JADX INFO: renamed from: r */
    public static final C3438a f11146r = new C3438a(15);

    /* JADX INFO: renamed from: s */
    public static final C3438a f11147s = new C3438a(16);

    /* JADX INFO: renamed from: t */
    public static final C3438a f11148t = new C3438a(17);

    /* JADX INFO: renamed from: u */
    public static final C3438a f11149u = new C3438a(18);

    /* JADX INFO: renamed from: v */
    public static final C3438a f11150v = new C3438a(19);

    /* JADX INFO: renamed from: w */
    public static final C3438a f11151w = new C3438a(20);

    /* JADX INFO: renamed from: x */
    public static final C3438a f11152x = new C3438a(21);

    /* JADX INFO: renamed from: y */
    public static final C3438a f11153y = new C3438a(22);

    /* JADX INFO: renamed from: z */
    public static final C3438a f11154z = new C3438a(23);

    /* JADX INFO: renamed from: A */
    public static final C3438a f11129A = new C3438a(24);

    /* JADX INFO: renamed from: B */
    public static final C3438a f11130B = new C3438a(25);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [q4.a.<clinit>():void] */
    public /* synthetic */ C3438a(int i9) {
        this.f11155b = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U0 */
    public static C4266p m7212U0(C4266p c4266p) {
        int iM7214W0 = m7214W0(c4266p);
        int length = c4266p.f24601h.length;
        if (iM7214W0 == length) {
            return c4266p;
        }
        C4266p c4266p2 = new C4266p(iM7214W0);
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            C4265o c4265o = (C4265o) c4266p.m10840l(i10);
            c4266p2.m10841m(i9, c4265o);
            if (c4265o.m8561j() == 2) {
                c4266p2.m10841m(i9 + 1, C4265o.m8557k(c4265o.f13965g + 1, C4683c.f15644w, null));
                i9 += 2;
            } else {
                i9++;
            }
        }
        c4266p2.f24613g = false;
        return c4266p2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V0 */
    public static C4266p m7213V0(C4266p c4266p) {
        int iM7215X0 = m7215X0(c4266p);
        int length = c4266p.f24601h.length;
        if (iM7215X0 == length) {
            return c4266p;
        }
        C4266p c4266p2 = new C4266p(iM7215X0);
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            C4265o c4265o = (C4265o) c4266p.m10840l(i10);
            c4266p2.m10841m(i9, c4265o);
            if (c4265o.m8561j() == 2) {
                c4266p2.m10841m(i9 + 1, C4265o.m8557k(c4265o.f13965g + 1, C4683c.f15644w, null));
                i9 += 2;
            } else {
                i9++;
            }
        }
        c4266p2.f24613g = false;
        return c4266p2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W0 */
    public static int m7214W0(C4266p c4266p) {
        int length = c4266p.f24601h.length;
        if (length > 5) {
            return -1;
        }
        int iM8561j = 0;
        for (int i9 = 0; i9 < length; i9++) {
            iM8561j += ((C4265o) c4266p.m10840l(i9)).m8561j();
            if (!AbstractC1089i.m2744O0((r4.m8561j() + r4.f13965g) - 1)) {
                return -1;
            }
        }
        if (iM8561j <= 5) {
            return iM8561j;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X0 */
    public static int m7215X0(C4266p c4266p) {
        int length = c4266p.f24601h.length;
        if (length > 5) {
            return -1;
        }
        int iM8561j = 0;
        for (int i9 = 0; i9 < length; i9++) {
            iM8561j += ((C4265o) c4266p.m10840l(i9)).m8561j();
            if (!AbstractC1089i.m2744O0((r4.m8561j() + r4.f13965g) - 1)) {
                return -1;
            }
        }
        if (iM8561j <= 5) {
            return iM8561j;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p077f8.AbstractC1089i
    /* JADX INFO: renamed from: P */
    public final String mo2806P(AbstractC3307l abstractC3307l) {
        switch (this.f11155b) {
            case 0:
                return AbstractC1089i.m2767g(abstractC3307l);
            case 1:
                return HttpUrl.FRAGMENT_ENCODE_SET;
            case 2:
                return ((C4265o) abstractC3307l.f10490d.m10840l(0)).m8563m() + ", " + AbstractC1089i.m2765e0((AbstractC4472u) ((C3302g) abstractC3307l).f10484f);
            case 3:
                return ((C4265o) abstractC3307l.f10490d.m10840l(0)).m8563m();
            case 4:
                C4266p c4266p = abstractC3307l.f10490d;
                int length = c4266p.f24601h.length;
                return ((C4265o) c4266p.m10840l(length - 2)).m8563m() + ", " + ((C4265o) c4266p.m10840l(length - 1)).m8563m();
            case 5:
                return AbstractC1089i.m2767g(abstractC3307l);
            case 6:
                return ((C4265o) abstractC3307l.f10490d.m10840l(0)).m8563m() + ", " + abstractC3307l.mo6984d();
            case 7:
                return ((C4265o) abstractC3307l.f10490d.m10840l(0)).m8563m() + ", " + AbstractC1089i.m2765e0((AbstractC4472u) ((C3302g) abstractC3307l).f10484f);
            case 8:
                return ((C4265o) abstractC3307l.f10490d.m10840l(0)).m8563m() + ", " + AbstractC1089i.m2765e0((AbstractC4472u) ((C3302g) abstractC3307l).f10484f);
            case 9:
                return ((C4265o) abstractC3307l.f10490d.m10840l(0)).m8563m() + ", " + AbstractC1089i.m2767g(abstractC3307l);
            case 10:
                C4266p c4266p2 = abstractC3307l.f10490d;
                return ((C4265o) c4266p2.m10840l(0)).m8563m() + ", " + ((C4265o) c4266p2.m10840l(1)).m8563m() + ", " + AbstractC1089i.m2765e0((AbstractC4472u) ((C3302g) abstractC3307l).f10484f);
            case 11:
                C4266p c4266p3 = abstractC3307l.f10490d;
                return ((C4265o) c4266p3.m10840l(0)).m8563m() + ", " + ((C4265o) c4266p3.m10840l(1)).m8563m() + ", " + abstractC3307l.mo6984d();
            case 12:
                C4266p c4266p4 = abstractC3307l.f10490d;
                return ((C4265o) c4266p4.m10840l(0)).m8563m() + ", " + ((C4265o) c4266p4.m10840l(1)).m8563m() + ", " + AbstractC1089i.m2765e0((AbstractC4472u) ((C3302g) abstractC3307l).f10484f);
            case 13:
                C4266p c4266p5 = abstractC3307l.f10490d;
                return ((C4265o) c4266p5.m10840l(0)).m8563m() + ", " + ((C4265o) c4266p5.m10840l(1)).m8563m() + ", " + AbstractC1089i.m2767g(abstractC3307l);
            case 14:
                C4266p c4266p6 = abstractC3307l.f10490d;
                return ((C4265o) c4266p6.m10840l(0)).m8563m() + ", " + ((C4265o) c4266p6.m10840l(1)).m8563m();
            case 15:
                C4266p c4266p7 = abstractC3307l.f10490d;
                return ((C4265o) c4266p7.m10840l(0)).m8563m() + ", " + ((C4265o) c4266p7.m10840l(1)).m8563m() + ", " + ((C4265o) c4266p7.m10840l(2)).m8563m();
            case 16:
                return ((C4265o) abstractC3307l.f10490d.m10840l(0)).m8563m() + ", " + abstractC3307l.mo6984d();
            case 17:
                return ((C4265o) abstractC3307l.f10490d.m10840l(0)).m8563m() + ", " + AbstractC1089i.m2765e0((AbstractC4472u) ((C3302g) abstractC3307l).f10484f);
            case 18:
                return ((C4265o) abstractC3307l.f10490d.m10840l(0)).m8563m() + ", " + AbstractC1089i.m2767g(abstractC3307l);
            case 19:
                C4266p c4266p8 = abstractC3307l.f10490d;
                return ((C4265o) c4266p8.m10840l(0)).m8563m() + ", " + ((C4265o) c4266p8.m10840l(1)).m8563m();
            case 20:
                return AbstractC1089i.m2792t0(m7212U0(abstractC3307l.f10490d)) + ", " + abstractC3307l.mo6984d();
            case 21:
                return AbstractC1089i.m2794u0(abstractC3307l.f10490d) + ", " + abstractC3307l.mo6984d();
            case 22:
                return AbstractC1089i.m2792t0(m7213V0(abstractC3307l.f10490d)) + ", " + abstractC3307l.mo6984d();
            case 23:
                return AbstractC1089i.m2794u0(abstractC3307l.f10490d) + ", " + abstractC3307l.mo6984d();
            case 24:
                return ((C4265o) abstractC3307l.f10490d.m10840l(0)).m8563m() + ", " + AbstractC1089i.m2765e0((AbstractC4472u) ((C3302g) abstractC3307l).f10484f);
            default:
                throw new RuntimeException("unsupported");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p077f8.AbstractC1089i
    /* JADX INFO: renamed from: Q */
    public final String mo2807Q(AbstractC3307l abstractC3307l) {
        switch (this.f11155b) {
            case 0:
                return AbstractC1089i.m2764e(abstractC3307l);
            case 1:
                return HttpUrl.FRAGMENT_ENCODE_SET;
            case 2:
                return AbstractC1089i.m2763d0((AbstractC4472u) ((C3302g) abstractC3307l).f10484f, 4);
            case 3:
                return HttpUrl.FRAGMENT_ENCODE_SET;
            case 4:
                return HttpUrl.FRAGMENT_ENCODE_SET;
            case 5:
                return AbstractC1089i.m2764e(abstractC3307l);
            case 6:
                return abstractC3307l.mo6983c();
            case 7:
                return AbstractC1089i.m2763d0((AbstractC4472u) ((C3302g) abstractC3307l).f10484f, ((C4265o) abstractC3307l.f10490d.m10840l(0)).m8561j() == 1 ? 32 : 64);
            case 8:
                return AbstractC1089i.m2763d0((AbstractC4472u) ((C3302g) abstractC3307l).f10484f, 16);
            case 9:
                return AbstractC1089i.m2764e(abstractC3307l);
            case 10:
                return AbstractC1089i.m2763d0((AbstractC4472u) ((C3302g) abstractC3307l).f10484f, 8);
            case 11:
                return abstractC3307l.mo6983c();
            case 12:
                return AbstractC1089i.m2763d0((AbstractC4472u) ((C3302g) abstractC3307l).f10484f, 16);
            case 13:
                return AbstractC1089i.m2764e(abstractC3307l);
            case 14:
                return HttpUrl.FRAGMENT_ENCODE_SET;
            case 15:
                return HttpUrl.FRAGMENT_ENCODE_SET;
            case 16:
                return abstractC3307l.mo6983c();
            case 17:
                return AbstractC1089i.m2763d0((AbstractC4472u) ((C3302g) abstractC3307l).f10484f, 32);
            case 18:
                return AbstractC1089i.m2764e(abstractC3307l);
            case 19:
                return HttpUrl.FRAGMENT_ENCODE_SET;
            case 20:
                return abstractC3307l.mo6983c();
            case 21:
                return abstractC3307l.mo6983c();
            case 22:
                return abstractC3307l.mo6983c();
            case 23:
                return abstractC3307l.mo6983c();
            case 24:
                return AbstractC1089i.m2763d0((AbstractC4472u) ((C3302g) abstractC3307l).f10484f, 64);
            default:
                throw new RuntimeException("unsupported");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p077f8.AbstractC1089i
    /* JADX INFO: renamed from: R0 */
    public final void mo2808R0(C6090d c6090d, AbstractC3307l abstractC3307l) {
        switch (this.f11155b) {
            case 0:
                c6090d.m10836l(AbstractC1089i.m2784p0(abstractC3307l, ((C3296b0) abstractC3307l).m6976m() & 255));
                return;
            case 1:
                c6090d.m10836l(AbstractC1089i.m2784p0(abstractC3307l, 0));
                return;
            case 2:
                c6090d.m10836l(AbstractC1089i.m2784p0(abstractC3307l, AbstractC1089i.m2772i0(((C4265o) abstractC3307l.f10490d.m10840l(0)).f13965g, ((AbstractC4472u) ((C3302g) abstractC3307l).f10484f).mo8913l() & 15)));
                return;
            case 3:
                c6090d.m10836l(AbstractC1089i.m2784p0(abstractC3307l, ((C4265o) abstractC3307l.f10490d.m10840l(0)).f13965g));
                return;
            case 4:
                C4266p c4266p = abstractC3307l.f10490d;
                int length = c4266p.f24601h.length;
                c6090d.m10836l(AbstractC1089i.m2784p0(abstractC3307l, AbstractC1089i.m2772i0(((C4265o) c4266p.m10840l(length - 2)).f13965g, ((C4265o) c4266p.m10840l(length - 1)).f13965g)));
                return;
            case 5:
                int iM6976m = ((C3296b0) abstractC3307l).m6976m();
                c6090d.m10836l(AbstractC1089i.m2784p0(abstractC3307l, 0));
                c6090d.m10836l((short) iM6976m);
                return;
            case 6:
                C4266p c4266p2 = abstractC3307l.f10490d;
                int iM6985m = ((C3302g) abstractC3307l).m6985m();
                c6090d.m10836l(AbstractC1089i.m2784p0(abstractC3307l, ((C4265o) c4266p2.m10840l(0)).f13965g));
                c6090d.m10836l((short) iM6985m);
                return;
            case 7:
                C4266p c4266p3 = abstractC3307l.f10490d;
                AbstractC4472u abstractC4472u = (AbstractC4472u) ((C3302g) abstractC3307l).f10484f;
                short sMo8913l = (short) (((C4265o) c4266p3.m10840l(0)).m8561j() == 1 ? abstractC4472u.mo8913l() >>> 16 : (int) (abstractC4472u.mo8914m() >>> 48));
                c6090d.m10836l(AbstractC1089i.m2784p0(abstractC3307l, ((C4265o) c4266p3.m10840l(0)).f13965g));
                c6090d.m10836l(sMo8913l);
                return;
            case 8:
                C4266p c4266p4 = abstractC3307l.f10490d;
                int iMo8913l = ((AbstractC4472u) ((C3302g) abstractC3307l).f10484f).mo8913l();
                c6090d.m10836l(AbstractC1089i.m2784p0(abstractC3307l, ((C4265o) c4266p4.m10840l(0)).f13965g));
                c6090d.m10836l((short) iMo8913l);
                return;
            case 9:
                C4266p c4266p5 = abstractC3307l.f10490d;
                int iM6976m2 = ((C3296b0) abstractC3307l).m6976m();
                c6090d.m10836l(AbstractC1089i.m2784p0(abstractC3307l, ((C4265o) c4266p5.m10840l(0)).f13965g));
                c6090d.m10836l((short) iM6976m2);
                return;
            case 10:
                C4266p c4266p6 = abstractC3307l.f10490d;
                int iMo8913l2 = ((AbstractC4472u) ((C3302g) abstractC3307l).f10484f).mo8913l();
                short sM2784p0 = AbstractC1089i.m2784p0(abstractC3307l, ((C4265o) c4266p6.m10840l(0)).f13965g);
                short sM2774k = AbstractC1089i.m2774k(((C4265o) c4266p6.m10840l(1)).f13965g, iMo8913l2 & 255);
                c6090d.m10836l(sM2784p0);
                c6090d.m10836l(sM2774k);
                return;
            case 11:
                C4266p c4266p7 = abstractC3307l.f10490d;
                int iM6985m2 = ((C3302g) abstractC3307l).m6985m();
                c6090d.m10836l(AbstractC1089i.m2784p0(abstractC3307l, AbstractC1089i.m2772i0(((C4265o) c4266p7.m10840l(0)).f13965g, ((C4265o) c4266p7.m10840l(1)).f13965g)));
                c6090d.m10836l((short) iM6985m2);
                return;
            case 12:
                C4266p c4266p8 = abstractC3307l.f10490d;
                int iMo8913l3 = ((AbstractC4472u) ((C3302g) abstractC3307l).f10484f).mo8913l();
                c6090d.m10836l(AbstractC1089i.m2784p0(abstractC3307l, AbstractC1089i.m2772i0(((C4265o) c4266p8.m10840l(0)).f13965g, ((C4265o) c4266p8.m10840l(1)).f13965g)));
                c6090d.m10836l((short) iMo8913l3);
                return;
            case 13:
                C4266p c4266p9 = abstractC3307l.f10490d;
                int iM6976m3 = ((C3296b0) abstractC3307l).m6976m();
                c6090d.m10836l(AbstractC1089i.m2784p0(abstractC3307l, AbstractC1089i.m2772i0(((C4265o) c4266p9.m10840l(0)).f13965g, ((C4265o) c4266p9.m10840l(1)).f13965g)));
                c6090d.m10836l((short) iM6976m3);
                return;
            case 14:
                C4266p c4266p10 = abstractC3307l.f10490d;
                short sM2784p02 = AbstractC1089i.m2784p0(abstractC3307l, ((C4265o) c4266p10.m10840l(0)).f13965g);
                short s10 = (short) ((C4265o) c4266p10.m10840l(1)).f13965g;
                c6090d.m10836l(sM2784p02);
                c6090d.m10836l(s10);
                return;
            case 15:
                C4266p c4266p11 = abstractC3307l.f10490d;
                short sM2784p03 = AbstractC1089i.m2784p0(abstractC3307l, ((C4265o) c4266p11.m10840l(0)).f13965g);
                short sM2774k2 = AbstractC1089i.m2774k(((C4265o) c4266p11.m10840l(1)).f13965g, ((C4265o) c4266p11.m10840l(2)).f13965g);
                c6090d.m10836l(sM2784p03);
                c6090d.m10836l(sM2774k2);
                return;
            case 16:
                C4266p c4266p12 = abstractC3307l.f10490d;
                int iM6985m3 = ((C3302g) abstractC3307l).m6985m();
                c6090d.m10836l(AbstractC1089i.m2784p0(abstractC3307l, ((C4265o) c4266p12.m10840l(0)).f13965g));
                c6090d.m10836l((short) iM6985m3);
                c6090d.m10836l((short) (iM6985m3 >> 16));
                return;
            case 17:
                C4266p c4266p13 = abstractC3307l.f10490d;
                int iMo8913l4 = ((AbstractC4472u) ((C3302g) abstractC3307l).f10484f).mo8913l();
                c6090d.m10836l(AbstractC1089i.m2784p0(abstractC3307l, ((C4265o) c4266p13.m10840l(0)).f13965g));
                c6090d.m10836l((short) iMo8913l4);
                c6090d.m10836l((short) (iMo8913l4 >> 16));
                return;
            case 18:
                C4266p c4266p14 = abstractC3307l.f10490d;
                int iM6976m4 = ((C3296b0) abstractC3307l).m6976m();
                c6090d.m10836l(AbstractC1089i.m2784p0(abstractC3307l, ((C4265o) c4266p14.m10840l(0)).f13965g));
                c6090d.m10836l((short) iM6976m4);
                c6090d.m10836l((short) (iM6976m4 >> 16));
                return;
            case 19:
                C4266p c4266p15 = abstractC3307l.f10490d;
                short sM2784p04 = AbstractC1089i.m2784p0(abstractC3307l, 0);
                short s11 = (short) ((C4265o) c4266p15.m10840l(0)).f13965g;
                short s12 = (short) ((C4265o) c4266p15.m10840l(1)).f13965g;
                c6090d.m10836l(sM2784p04);
                c6090d.m10836l(s11);
                c6090d.m10836l(s12);
                return;
            case 20:
                int iM6985m4 = ((C3302g) abstractC3307l).m6985m();
                C4266p c4266pM7212U0 = m7212U0(abstractC3307l.f10490d);
                int length2 = c4266pM7212U0.f24601h.length;
                int i9 = length2 > 0 ? ((C4265o) c4266pM7212U0.m10840l(0)).f13965g : 0;
                int i10 = length2 > 1 ? ((C4265o) c4266pM7212U0.m10840l(1)).f13965g : 0;
                int i11 = length2 > 2 ? ((C4265o) c4266pM7212U0.m10840l(2)).f13965g : 0;
                int i12 = length2 > 3 ? ((C4265o) c4266pM7212U0.m10840l(3)).f13965g : 0;
                short sM2784p05 = AbstractC1089i.m2784p0(abstractC3307l, AbstractC1089i.m2772i0(length2 > 4 ? ((C4265o) c4266pM7212U0.m10840l(4)).f13965g : 0, length2));
                short sM2776l = AbstractC1089i.m2776l(i9, i10, i11, i12);
                c6090d.m10836l(sM2784p05);
                c6090d.m10836l((short) iM6985m4);
                c6090d.m10836l(sM2776l);
                return;
            case 21:
                C4266p c4266p16 = abstractC3307l.f10490d;
                int iM6985m5 = ((C3302g) abstractC3307l).m6985m();
                int i13 = c4266p16.f24601h.length != 0 ? ((C4265o) c4266p16.m10840l(0)).f13965g : 0;
                c6090d.m10836l(AbstractC1089i.m2784p0(abstractC3307l, c4266p16.m8569o()));
                c6090d.m10836l((short) iM6985m5);
                c6090d.m10836l((short) i13);
                return;
            case 22:
                C3313r c3313r = (C3313r) abstractC3307l;
                short sM6998m = (short) c3313r.m6998m(0);
                short sM6998m2 = (short) c3313r.m6998m(1);
                C4266p c4266pM7213V0 = m7213V0(abstractC3307l.f10490d);
                int length3 = c4266pM7213V0.f24601h.length;
                int i14 = length3 > 0 ? ((C4265o) c4266pM7213V0.m10840l(0)).f13965g : 0;
                int i15 = length3 > 1 ? ((C4265o) c4266pM7213V0.m10840l(1)).f13965g : 0;
                int i16 = length3 > 2 ? ((C4265o) c4266pM7213V0.m10840l(2)).f13965g : 0;
                int i17 = length3 > 3 ? ((C4265o) c4266pM7213V0.m10840l(3)).f13965g : 0;
                short sM2784p06 = AbstractC1089i.m2784p0(abstractC3307l, AbstractC1089i.m2772i0(length3 > 4 ? ((C4265o) c4266pM7213V0.m10840l(4)).f13965g : 0, length3));
                short sM2776l2 = AbstractC1089i.m2776l(i14, i15, i16, i17);
                c6090d.m10836l(sM2784p06);
                c6090d.m10836l(sM6998m);
                c6090d.m10836l(sM2776l2);
                c6090d.m10836l(sM6998m2);
                return;
            case 23:
                C3313r c3313r2 = (C3313r) abstractC3307l;
                short sM6998m3 = (short) c3313r2.m6998m(0);
                short sM6998m4 = (short) c3313r2.m6998m(1);
                C4266p c4266p17 = abstractC3307l.f10490d;
                short s13 = c4266p17.f24601h.length > 0 ? (short) ((C4265o) c4266p17.m10840l(0)).f13965g : (short) 0;
                c6090d.m10836l(AbstractC1089i.m2784p0(abstractC3307l, c4266p17.m8569o()));
                c6090d.m10836l(sM6998m3);
                c6090d.m10836l(s13);
                c6090d.m10836l(sM6998m4);
                return;
            case 24:
                C4266p c4266p18 = abstractC3307l.f10490d;
                long j3 = ((AbstractC4471t) ((C3302g) abstractC3307l).f10484f).f14818g;
                c6090d.m10836l(AbstractC1089i.m2784p0(abstractC3307l, ((C4265o) c4266p18.m10840l(0)).f13965g));
                c6090d.m10836l((short) j3);
                c6090d.m10836l((short) (j3 >> 16));
                c6090d.m10836l((short) (j3 >> 32));
                c6090d.m10836l((short) (j3 >> 48));
                return;
            default:
                throw new RuntimeException("unsupported");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p077f8.AbstractC1089i
    /* JADX INFO: renamed from: S */
    public final boolean mo2809S(AbstractC3303h abstractC3303h) {
        int iMo8913l;
        C4265o c4265o;
        C4265o c4265o2;
        C4265o c4265o3;
        C4265o c4265o4;
        switch (this.f11155b) {
            case 0:
                if (!(abstractC3303h instanceof C3296b0) || abstractC3303h.f10490d.f24601h.length != 0) {
                    return false;
                }
                C3296b0 c3296b0 = (C3296b0) abstractC3303h;
                if (c3296b0.m6977n()) {
                    return mo2811f(c3296b0);
                }
                return true;
            case 1:
                return (abstractC3303h instanceof C3321z) && abstractC3303h.f10490d.f24601h.length == 0;
            case 2:
                C4266p c4266p = abstractC3303h.f10490d;
                if (!(abstractC3303h instanceof C3302g) || c4266p.f24601h.length != 1 || !AbstractC1089i.m2744O0(((C4265o) c4266p.m10840l(0)).f13965g)) {
                    return false;
                }
                AbstractC4446a abstractC4446a = ((C3302g) abstractC3303h).f10484f;
                if (!(abstractC4446a instanceof AbstractC4472u)) {
                    return false;
                }
                AbstractC4472u abstractC4472u = (AbstractC4472u) abstractC4446a;
                return abstractC4472u.mo8912k() && (iMo8913l = abstractC4472u.mo8913l()) >= -8 && iMo8913l <= 7;
            case 3:
                C4266p c4266p2 = abstractC3303h.f10490d;
                return (abstractC3303h instanceof C3321z) && c4266p2.f24601h.length == 1 && AbstractC1089i.m2742N0(((C4265o) c4266p2.m10840l(0)).f13965g);
            case 4:
                if (!(abstractC3303h instanceof C3321z)) {
                    return false;
                }
                C4266p c4266p3 = abstractC3303h.f10490d;
                int length = c4266p3.f24601h.length;
                if (length == 2) {
                    c4265o = (C4265o) c4266p3.m10840l(0);
                    c4265o2 = (C4265o) c4266p3.m10840l(1);
                } else {
                    if (length != 3) {
                        return false;
                    }
                    c4265o = (C4265o) c4266p3.m10840l(1);
                    c4265o2 = (C4265o) c4266p3.m10840l(2);
                    if (c4265o.f13965g != ((C4265o) c4266p3.m10840l(0)).f13965g) {
                        return false;
                    }
                }
                return AbstractC1089i.m2744O0(c4265o.f13965g) && AbstractC1089i.m2744O0(c4265o2.f13965g);
            case 5:
                if (!(abstractC3303h instanceof C3296b0) || abstractC3303h.f10490d.f24601h.length != 0) {
                    return false;
                }
                C3296b0 c3296b02 = (C3296b0) abstractC3303h;
                if (c3296b02.m6977n()) {
                    return mo2811f(c3296b02);
                }
                return true;
            case 6:
                if (!(abstractC3303h instanceof C3302g)) {
                    return false;
                }
                C4266p c4266p4 = abstractC3303h.f10490d;
                int length2 = c4266p4.f24601h.length;
                if (length2 == 1) {
                    c4265o3 = (C4265o) c4266p4.m10840l(0);
                } else {
                    if (length2 != 2) {
                        return false;
                    }
                    c4265o3 = (C4265o) c4266p4.m10840l(0);
                    if (c4265o3.f13965g != ((C4265o) c4266p4.m10840l(1)).f13965g) {
                        return false;
                    }
                }
                if (!AbstractC1089i.m2742N0(c4265o3.f13965g)) {
                    return false;
                }
                C3302g c3302g = (C3302g) abstractC3303h;
                int iM6985m = c3302g.m6985m();
                AbstractC4446a abstractC4446a2 = c3302g.f10484f;
                if (AbstractC1089i.m2745P0(iM6985m)) {
                    return (abstractC4446a2 instanceof C4453d0) || (abstractC4446a2 instanceof C4464m) || (abstractC4446a2 instanceof C4451c0) || (abstractC4446a2 instanceof C4475x) || (abstractC4446a2 instanceof C4447a0);
                }
                return false;
            case 7:
                C4266p c4266p5 = abstractC3303h.f10490d;
                if (!(abstractC3303h instanceof C3302g) || c4266p5.f24601h.length != 1 || !AbstractC1089i.m2742N0(((C4265o) c4266p5.m10840l(0)).f13965g)) {
                    return false;
                }
                AbstractC4446a abstractC4446a3 = ((C3302g) abstractC3303h).f10484f;
                if (!(abstractC4446a3 instanceof AbstractC4472u)) {
                    return false;
                }
                AbstractC4472u abstractC4472u2 = (AbstractC4472u) abstractC4446a3;
                if (((C4265o) c4266p5.m10840l(0)).m8561j() == 1) {
                    if ((abstractC4472u2.mo8913l() & Settings.DEFAULT_INITIAL_WINDOW_SIZE) != 0) {
                        return false;
                    }
                } else if ((abstractC4472u2.mo8914m() & 281474976710655L) != 0) {
                    return false;
                }
                return true;
            case 8:
                C4266p c4266p6 = abstractC3303h.f10490d;
                if (!(abstractC3303h instanceof C3302g) || c4266p6.f24601h.length != 1 || !AbstractC1089i.m2742N0(((C4265o) c4266p6.m10840l(0)).f13965g)) {
                    return false;
                }
                AbstractC4446a abstractC4446a4 = ((C3302g) abstractC3303h).f10484f;
                if (!(abstractC4446a4 instanceof AbstractC4472u)) {
                    return false;
                }
                AbstractC4472u abstractC4472u3 = (AbstractC4472u) abstractC4446a4;
                if (!abstractC4472u3.mo8912k()) {
                    return false;
                }
                int iMo8913l2 = abstractC4472u3.mo8913l();
                return ((short) iMo8913l2) == iMo8913l2;
            case 9:
                C4266p c4266p7 = abstractC3303h.f10490d;
                if (!(abstractC3303h instanceof C3296b0) || c4266p7.f24601h.length != 1 || !AbstractC1089i.m2742N0(((C4265o) c4266p7.m10840l(0)).f13965g)) {
                    return false;
                }
                C3296b0 c3296b03 = (C3296b0) abstractC3303h;
                if (c3296b03.m6977n()) {
                    return mo2811f(c3296b03);
                }
                return true;
            case 10:
                C4266p c4266p8 = abstractC3303h.f10490d;
                if (!(abstractC3303h instanceof C3302g) || c4266p8.f24601h.length != 2 || !AbstractC1089i.m2742N0(((C4265o) c4266p8.m10840l(0)).f13965g) || !AbstractC1089i.m2742N0(((C4265o) c4266p8.m10840l(1)).f13965g)) {
                    return false;
                }
                AbstractC4446a abstractC4446a5 = ((C3302g) abstractC3303h).f10484f;
                if (!(abstractC4446a5 instanceof AbstractC4472u)) {
                    return false;
                }
                AbstractC4472u abstractC4472u4 = (AbstractC4472u) abstractC4446a5;
                if (!abstractC4472u4.mo8912k()) {
                    return false;
                }
                int iMo8913l3 = abstractC4472u4.mo8913l();
                return ((byte) iMo8913l3) == iMo8913l3;
            case 11:
                C4266p c4266p9 = abstractC3303h.f10490d;
                if (!(abstractC3303h instanceof C3302g) || c4266p9.f24601h.length != 2 || !AbstractC1089i.m2744O0(((C4265o) c4266p9.m10840l(0)).f13965g) || !AbstractC1089i.m2744O0(((C4265o) c4266p9.m10840l(1)).f13965g)) {
                    return false;
                }
                C3302g c3302g2 = (C3302g) abstractC3303h;
                if (!AbstractC1089i.m2745P0(c3302g2.m6985m())) {
                    return false;
                }
                AbstractC4446a abstractC4446a6 = c3302g2.f10484f;
                return (abstractC4446a6 instanceof C4453d0) || (abstractC4446a6 instanceof C4464m);
            case 12:
                C4266p c4266p10 = abstractC3303h.f10490d;
                if (!(abstractC3303h instanceof C3302g) || c4266p10.f24601h.length != 2 || !AbstractC1089i.m2744O0(((C4265o) c4266p10.m10840l(0)).f13965g) || !AbstractC1089i.m2744O0(((C4265o) c4266p10.m10840l(1)).f13965g)) {
                    return false;
                }
                AbstractC4446a abstractC4446a7 = ((C3302g) abstractC3303h).f10484f;
                if (!(abstractC4446a7 instanceof AbstractC4472u)) {
                    return false;
                }
                AbstractC4472u abstractC4472u5 = (AbstractC4472u) abstractC4446a7;
                if (!abstractC4472u5.mo8912k()) {
                    return false;
                }
                int iMo8913l4 = abstractC4472u5.mo8913l();
                return ((short) iMo8913l4) == iMo8913l4;
            case 13:
                C4266p c4266p11 = abstractC3303h.f10490d;
                if (!(abstractC3303h instanceof C3296b0) || c4266p11.f24601h.length != 2 || !AbstractC1089i.m2744O0(((C4265o) c4266p11.m10840l(0)).f13965g) || !AbstractC1089i.m2744O0(((C4265o) c4266p11.m10840l(1)).f13965g)) {
                    return false;
                }
                C3296b0 c3296b04 = (C3296b0) abstractC3303h;
                if (c3296b04.m6977n()) {
                    return mo2811f(c3296b04);
                }
                return true;
            case 14:
                C4266p c4266p12 = abstractC3303h.f10490d;
                return (abstractC3303h instanceof C3321z) && c4266p12.f24601h.length == 2 && AbstractC1089i.m2742N0(((C4265o) c4266p12.m10840l(0)).f13965g) && AbstractC1089i.m2745P0(((C4265o) c4266p12.m10840l(1)).f13965g);
            case 15:
                C4266p c4266p13 = abstractC3303h.f10490d;
                return (abstractC3303h instanceof C3321z) && c4266p13.f24601h.length == 3 && AbstractC1089i.m2742N0(((C4265o) c4266p13.m10840l(0)).f13965g) && AbstractC1089i.m2742N0(((C4265o) c4266p13.m10840l(1)).f13965g) && AbstractC1089i.m2742N0(((C4265o) c4266p13.m10840l(2)).f13965g);
            case 16:
                if (!(abstractC3303h instanceof C3302g)) {
                    return false;
                }
                C4266p c4266p14 = abstractC3303h.f10490d;
                int length3 = c4266p14.f24601h.length;
                if (length3 == 1) {
                    c4265o4 = (C4265o) c4266p14.m10840l(0);
                } else {
                    if (length3 != 2) {
                        return false;
                    }
                    c4265o4 = (C4265o) c4266p14.m10840l(0);
                    if (c4265o4.f13965g != ((C4265o) c4266p14.m10840l(1)).f13965g) {
                        return false;
                    }
                }
                if (!AbstractC1089i.m2742N0(c4265o4.f13965g)) {
                    return false;
                }
                AbstractC4446a abstractC4446a8 = ((C3302g) abstractC3303h).f10484f;
                return (abstractC4446a8 instanceof C4453d0) || (abstractC4446a8 instanceof C4464m) || (abstractC4446a8 instanceof C4451c0);
            case 17:
                C4266p c4266p15 = abstractC3303h.f10490d;
                if (!(abstractC3303h instanceof C3302g) || c4266p15.f24601h.length != 1 || !AbstractC1089i.m2742N0(((C4265o) c4266p15.m10840l(0)).f13965g)) {
                    return false;
                }
                AbstractC4446a abstractC4446a9 = ((C3302g) abstractC3303h).f10484f;
                if (abstractC4446a9 instanceof AbstractC4472u) {
                    return ((AbstractC4472u) abstractC4446a9).mo8912k();
                }
                return false;
            case 18:
                C4266p c4266p16 = abstractC3303h.f10490d;
                return (abstractC3303h instanceof C3296b0) && c4266p16.f24601h.length == 1 && AbstractC1089i.m2742N0(((C4265o) c4266p16.m10840l(0)).f13965g);
            case 19:
                C4266p c4266p17 = abstractC3303h.f10490d;
                return (abstractC3303h instanceof C3321z) && c4266p17.f24601h.length == 2 && AbstractC1089i.m2745P0(((C4265o) c4266p17.m10840l(0)).f13965g) && AbstractC1089i.m2745P0(((C4265o) c4266p17.m10840l(1)).f13965g);
            case 20:
                if (!(abstractC3303h instanceof C3302g)) {
                    return false;
                }
                C3302g c3302g3 = (C3302g) abstractC3303h;
                if (!AbstractC1089i.m2745P0(c3302g3.m6985m())) {
                    return false;
                }
                AbstractC4446a abstractC4446a10 = c3302g3.f10484f;
                return ((abstractC4446a10 instanceof C4476y) || (abstractC4446a10 instanceof C4453d0) || (abstractC4446a10 instanceof C4460i)) && m7214W0(c3302g3.f10490d) >= 0;
            case 21:
                if (!(abstractC3303h instanceof C3302g)) {
                    return false;
                }
                C3302g c3302g4 = (C3302g) abstractC3303h;
                int iM6985m2 = c3302g4.m6985m();
                AbstractC4446a abstractC4446a11 = c3302g4.f10484f;
                if (!AbstractC1089i.m2745P0(iM6985m2)) {
                    return false;
                }
                if (!(abstractC4446a11 instanceof C4476y) && !(abstractC4446a11 instanceof C4453d0) && !(abstractC4446a11 instanceof C4460i)) {
                    return false;
                }
                C4266p c4266p18 = c3302g4.f10490d;
                return c4266p18.f24601h.length == 0 || (AbstractC1089i.m2754Y(c4266p18) && AbstractC1089i.m2745P0(((C4265o) c4266p18.m10840l(0)).f13965g) && AbstractC1089i.m2742N0(c4266p18.m8569o()));
            case 22:
                if (!(abstractC3303h instanceof C3313r)) {
                    return false;
                }
                C3313r c3313r = (C3313r) abstractC3303h;
                AbstractC4446a[] abstractC4446aArr = c3313r.f10673f;
                if (abstractC4446aArr.length != 2) {
                    return false;
                }
                return AbstractC1089i.m2745P0(c3313r.m6998m(0)) && AbstractC1089i.m2745P0(c3313r.m6998m(1)) && (abstractC4446aArr[0] instanceof C4476y) && (abstractC4446aArr[1] instanceof C4447a0) && m7215X0(c3313r.f10490d) >= 0;
            case 23:
                if (!(abstractC3303h instanceof C3313r)) {
                    return false;
                }
                C3313r c3313r2 = (C3313r) abstractC3303h;
                int iM6998m = c3313r2.m6998m(0);
                int iM6998m2 = c3313r2.m6998m(1);
                if (!AbstractC1089i.m2745P0(iM6998m) || !AbstractC1089i.m2745P0(iM6998m2)) {
                    return false;
                }
                AbstractC4446a[] abstractC4446aArr2 = c3313r2.f10673f;
                if (!(abstractC4446aArr2[0] instanceof C4476y) || !(abstractC4446aArr2[1] instanceof C4447a0)) {
                    return false;
                }
                C4266p c4266p19 = c3313r2.f10490d;
                int length4 = c4266p19.f24601h.length;
                return length4 == 0 || (AbstractC1089i.m2742N0(c4266p19.m8569o()) && AbstractC1089i.m2745P0(length4) && AbstractC1089i.m2745P0(((C4265o) c4266p19.m10840l(0)).f13965g) && AbstractC1089i.m2754Y(c4266p19));
            case 24:
                C4266p c4266p20 = abstractC3303h.f10490d;
                if ((abstractC3303h instanceof C3302g) && c4266p20.f24601h.length == 1 && AbstractC1089i.m2742N0(((C4265o) c4266p20.m10840l(0)).f13965g)) {
                    return ((C3302g) abstractC3303h).f10484f instanceof AbstractC4471t;
                }
                return false;
            default:
                return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p077f8.AbstractC1089i
    /* JADX INFO: renamed from: f */
    public boolean mo2811f(C3296b0 c3296b0) {
        switch (this.f11155b) {
            case 0:
                int iM6976m = c3296b0.m6976m();
                return iM6976m != 0 && ((byte) iM6976m) == iM6976m;
            case 5:
                int iM6976m2 = c3296b0.m6976m();
                return iM6976m2 != 0 && ((short) iM6976m2) == iM6976m2;
            case 9:
                int iM6976m3 = c3296b0.m6976m();
                return iM6976m3 != 0 && ((short) iM6976m3) == iM6976m3;
            case 13:
                int iM6976m4 = c3296b0.m6976m();
                return iM6976m4 != 0 && ((short) iM6976m4) == iM6976m4;
            case 18:
                return true;
            default:
                return super.mo2811f(c3296b0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p077f8.AbstractC1089i
    /* JADX INFO: renamed from: j */
    public final int mo2812j() {
        switch (this.f11155b) {
            case 0:
                return 1;
            case 1:
                return 1;
            case 2:
                return 1;
            case 3:
                return 1;
            case 4:
                return 1;
            case 5:
                return 2;
            case 6:
                return 2;
            case 7:
                return 2;
            case 8:
                return 2;
            case 9:
                return 2;
            case 10:
                return 2;
            case 11:
                return 2;
            case 12:
                return 2;
            case 13:
                return 2;
            case 14:
                return 2;
            case 15:
                return 2;
            case 16:
                return 3;
            case 17:
                return 3;
            case 18:
                return 3;
            case 19:
                return 3;
            case 20:
                return 3;
            case 21:
                return 3;
            case 22:
                return 4;
            case 23:
                return 4;
            case 24:
                return 5;
            default:
                throw new RuntimeException("unsupported");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p077f8.AbstractC1089i
    /* JADX INFO: renamed from: m */
    public BitSet mo2813m(AbstractC3303h abstractC3303h) {
        switch (this.f11155b) {
            case 2:
                C4266p c4266p = abstractC3303h.f10490d;
                BitSet bitSet = new BitSet(1);
                bitSet.set(0, AbstractC1089i.m2744O0(((C4265o) c4266p.m10840l(0)).f13965g));
                return bitSet;
            case 3:
                C4266p c4266p2 = abstractC3303h.f10490d;
                BitSet bitSet2 = new BitSet(1);
                bitSet2.set(0, AbstractC1089i.m2742N0(((C4265o) c4266p2.m10840l(0)).f13965g));
                return bitSet2;
            case 4:
                C4266p c4266p3 = abstractC3303h.f10490d;
                BitSet bitSet3 = new BitSet(2);
                int i9 = ((C4265o) c4266p3.m10840l(0)).f13965g;
                int i10 = ((C4265o) c4266p3.m10840l(1)).f13965g;
                int length = c4266p3.f24601h.length;
                if (length == 2) {
                    bitSet3.set(0, AbstractC1089i.m2744O0(i9));
                    bitSet3.set(1, AbstractC1089i.m2744O0(i10));
                } else {
                    if (length != 3) {
                        throw new AssertionError();
                    }
                    if (i9 != i10) {
                        bitSet3.set(0, false);
                        bitSet3.set(1, false);
                    } else {
                        boolean zM2744O0 = AbstractC1089i.m2744O0(i10);
                        bitSet3.set(0, zM2744O0);
                        bitSet3.set(1, zM2744O0);
                    }
                    bitSet3.set(2, AbstractC1089i.m2744O0(((C4265o) c4266p3.m10840l(2)).f13965g));
                }
                return bitSet3;
            case 5:
            case 21:
            case 23:
            default:
                return super.mo2813m(abstractC3303h);
            case 6:
                C4266p c4266p4 = abstractC3303h.f10490d;
                int length2 = c4266p4.f24601h.length;
                BitSet bitSet4 = new BitSet(length2);
                boolean zM2742N0 = AbstractC1089i.m2742N0(((C4265o) c4266p4.m10840l(0)).f13965g);
                if (length2 == 1) {
                    bitSet4.set(0, zM2742N0);
                } else if (((C4265o) c4266p4.m10840l(0)).f13965g == ((C4265o) c4266p4.m10840l(1)).f13965g) {
                    bitSet4.set(0, zM2742N0);
                    bitSet4.set(1, zM2742N0);
                }
                return bitSet4;
            case 7:
                C4266p c4266p5 = abstractC3303h.f10490d;
                BitSet bitSet5 = new BitSet(1);
                bitSet5.set(0, AbstractC1089i.m2742N0(((C4265o) c4266p5.m10840l(0)).f13965g));
                return bitSet5;
            case 8:
                C4266p c4266p6 = abstractC3303h.f10490d;
                BitSet bitSet6 = new BitSet(1);
                bitSet6.set(0, AbstractC1089i.m2742N0(((C4265o) c4266p6.m10840l(0)).f13965g));
                return bitSet6;
            case 9:
                C4266p c4266p7 = abstractC3303h.f10490d;
                BitSet bitSet7 = new BitSet(1);
                bitSet7.set(0, AbstractC1089i.m2742N0(((C4265o) c4266p7.m10840l(0)).f13965g));
                return bitSet7;
            case 10:
                C4266p c4266p8 = abstractC3303h.f10490d;
                BitSet bitSet8 = new BitSet(2);
                bitSet8.set(0, AbstractC1089i.m2742N0(((C4265o) c4266p8.m10840l(0)).f13965g));
                bitSet8.set(1, AbstractC1089i.m2742N0(((C4265o) c4266p8.m10840l(1)).f13965g));
                return bitSet8;
            case 11:
                C4266p c4266p9 = abstractC3303h.f10490d;
                BitSet bitSet9 = new BitSet(2);
                bitSet9.set(0, AbstractC1089i.m2744O0(((C4265o) c4266p9.m10840l(0)).f13965g));
                bitSet9.set(1, AbstractC1089i.m2744O0(((C4265o) c4266p9.m10840l(1)).f13965g));
                return bitSet9;
            case 12:
                C4266p c4266p10 = abstractC3303h.f10490d;
                BitSet bitSet10 = new BitSet(2);
                bitSet10.set(0, AbstractC1089i.m2744O0(((C4265o) c4266p10.m10840l(0)).f13965g));
                bitSet10.set(1, AbstractC1089i.m2744O0(((C4265o) c4266p10.m10840l(1)).f13965g));
                return bitSet10;
            case 13:
                C4266p c4266p11 = abstractC3303h.f10490d;
                BitSet bitSet11 = new BitSet(2);
                bitSet11.set(0, AbstractC1089i.m2744O0(((C4265o) c4266p11.m10840l(0)).f13965g));
                bitSet11.set(1, AbstractC1089i.m2744O0(((C4265o) c4266p11.m10840l(1)).f13965g));
                return bitSet11;
            case 14:
                C4266p c4266p12 = abstractC3303h.f10490d;
                BitSet bitSet12 = new BitSet(2);
                bitSet12.set(0, AbstractC1089i.m2742N0(((C4265o) c4266p12.m10840l(0)).f13965g));
                bitSet12.set(1, AbstractC1089i.m2745P0(((C4265o) c4266p12.m10840l(1)).f13965g));
                return bitSet12;
            case 15:
                C4266p c4266p13 = abstractC3303h.f10490d;
                BitSet bitSet13 = new BitSet(3);
                bitSet13.set(0, AbstractC1089i.m2742N0(((C4265o) c4266p13.m10840l(0)).f13965g));
                bitSet13.set(1, AbstractC1089i.m2742N0(((C4265o) c4266p13.m10840l(1)).f13965g));
                bitSet13.set(2, AbstractC1089i.m2742N0(((C4265o) c4266p13.m10840l(2)).f13965g));
                return bitSet13;
            case 16:
                C4266p c4266p14 = abstractC3303h.f10490d;
                int length3 = c4266p14.f24601h.length;
                BitSet bitSet14 = new BitSet(length3);
                boolean zM2742N02 = AbstractC1089i.m2742N0(((C4265o) c4266p14.m10840l(0)).f13965g);
                if (length3 == 1) {
                    bitSet14.set(0, zM2742N02);
                } else if (((C4265o) c4266p14.m10840l(0)).f13965g == ((C4265o) c4266p14.m10840l(1)).f13965g) {
                    bitSet14.set(0, zM2742N02);
                    bitSet14.set(1, zM2742N02);
                }
                return bitSet14;
            case 17:
                C4266p c4266p15 = abstractC3303h.f10490d;
                BitSet bitSet15 = new BitSet(1);
                bitSet15.set(0, AbstractC1089i.m2742N0(((C4265o) c4266p15.m10840l(0)).f13965g));
                return bitSet15;
            case 18:
                C4266p c4266p16 = abstractC3303h.f10490d;
                BitSet bitSet16 = new BitSet(1);
                bitSet16.set(0, AbstractC1089i.m2742N0(((C4265o) c4266p16.m10840l(0)).f13965g));
                return bitSet16;
            case 19:
                C4266p c4266p17 = abstractC3303h.f10490d;
                BitSet bitSet17 = new BitSet(2);
                bitSet17.set(0, AbstractC1089i.m2745P0(((C4265o) c4266p17.m10840l(0)).f13965g));
                bitSet17.set(1, AbstractC1089i.m2745P0(((C4265o) c4266p17.m10840l(1)).f13965g));
                return bitSet17;
            case 20:
                C4266p c4266p18 = abstractC3303h.f10490d;
                int length4 = c4266p18.f24601h.length;
                BitSet bitSet18 = new BitSet(length4);
                for (int i11 = 0; i11 < length4; i11++) {
                    C4265o c4265o = (C4265o) c4266p18.m10840l(i11);
                    bitSet18.set(i11, AbstractC1089i.m2744O0((c4265o.m8561j() + c4265o.f13965g) - 1));
                }
                return bitSet18;
            case 22:
                C4266p c4266p19 = abstractC3303h.f10490d;
                int length5 = c4266p19.f24601h.length;
                BitSet bitSet19 = new BitSet(length5);
                for (int i12 = 0; i12 < length5; i12++) {
                    C4265o c4265o2 = (C4265o) c4266p19.m10840l(i12);
                    bitSet19.set(i12, AbstractC1089i.m2744O0((c4265o2.m8561j() + c4265o2.f13965g) - 1));
                }
                return bitSet19;
            case 24:
                C4266p c4266p20 = abstractC3303h.f10490d;
                BitSet bitSet20 = new BitSet(1);
                bitSet20.set(0, AbstractC1089i.m2742N0(((C4265o) c4266p20.m10840l(0)).f13965g));
                return bitSet20;
        }
    }
}
