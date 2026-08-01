package p227r;

import com.bumptech.glide.AbstractC1925g;
import p027E4.C0330q;
import p041H0.AbstractC0601k;
import p041H0.InterfaceC0595h;
import p041H0.InterfaceC0625w;
import p095T.C1305C;
import p105V.C1483e;
import p117X2.AbstractC1665j;
import p153e1.C2016l;
import p160f3.AbstractC2162v;
import p169h0.AbstractC2206o;
import p204n0.C2684c;
import p238t.AbstractC3204b;

/* JADX INFO: renamed from: r.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2992i extends AbstractC2206o implements InterfaceC0595h, InterfaceC0625w {

    /* JADX INFO: renamed from: r */
    public EnumC2983d0 f9470r;

    /* JADX INFO: renamed from: s */
    public final C2940A0 f9471s;

    /* JADX INFO: renamed from: t */
    public boolean f9472t;

    /* JADX INFO: renamed from: u */
    public final C3009q0 f9473u;

    /* JADX INFO: renamed from: w */
    public boolean f9475w;

    /* JADX INFO: renamed from: y */
    public boolean f9477y;

    /* JADX INFO: renamed from: v */
    public final C2976a f9474v = new C2976a(0);

    /* JADX INFO: renamed from: x */
    public long f9476x = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2992i(EnumC2983d0 enumC2983d0, C2940A0 c2940a0, boolean z5, C3009q0 c3009q0) {
        this.f9470r = enumC2983d0;
        this.f9471s = c2940a0;
        this.f9472t = z5;
        this.f9473u = c3009q0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public static final float m5203J0(C2992i c2992i, InterfaceC2982d interfaceC2982d, long j5) {
        C2684c c2684c;
        int iCompare;
        if (C2016l.m3704a(c2992i.f9476x, 0L)) {
            return 0.0f;
        }
        C1483e c1483e = c2992i.f9474v.f9424a;
        int i5 = c1483e.f5183f - 1;
        Object[] objArr = c1483e.f5181d;
        if (i5 < objArr.length) {
            c2684c = null;
            while (true) {
                if (i5 < 0) {
                    break;
                }
                C2684c c2684c2 = (C2684c) ((C2988g) objArr[i5]).f9458a.mo6a();
                if (c2684c2 != null) {
                    long jM4652c = c2684c2.m4652c();
                    long jM3523F = AbstractC1925g.m3523F(c2992i.f9476x);
                    int iOrdinal = c2992i.f9470r.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM4652c & 4294967295L)), Float.intBitsToFloat((int) (jM3523F & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            throw new C0330q();
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM4652c >> 32)), Float.intBitsToFloat((int) (jM3523F >> 32)));
                    }
                    if (iCompare <= 0) {
                        c2684c = c2684c2;
                    } else if (c2684c == null) {
                        c2684c = c2684c2;
                    }
                }
                i5--;
            }
        } else {
            c2684c = null;
        }
        if (c2684c == null) {
            C2684c c2684c3 = c2992i.f9475w ? (C2684c) c2992i.f9473u.mo6a() : null;
            if (c2684c3 == null) {
                return 0.0f;
            }
            c2684c = c2684c3;
        }
        long jM3523F2 = AbstractC1925g.m3523F(c2992i.f9476x);
        int iOrdinal2 = c2992i.f9470r.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = c2684c.f8559b;
            return interfaceC2982d.mo5197a(f2 - ((int) (j5 & 4294967295L)), c2684c.f8561d - f2, Float.intBitsToFloat((int) (jM3523F2 & 4294967295L)));
        }
        if (iOrdinal2 != 1) {
            throw new C0330q();
        }
        float f5 = c2684c.f8558a;
        return interfaceC2982d.mo5197a(f5 - ((int) (j5 >> 32)), c2684c.f8560c - f5, Float.intBitsToFloat((int) (jM3523F2 >> 32)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K0 */
    public static boolean m5204K0(C2992i c2992i, C2684c c2684c, long j5, long j6, int i5) {
        if ((i5 & 1) != 0) {
            j5 = c2992i.f9476x;
        }
        long j7 = j5;
        if ((i5 & 2) != 0) {
            j6 = 0;
        }
        long jM5206M0 = c2992i.m5206M0(c2684c, j7, j6);
        return Math.abs(Float.intBitsToFloat((int) (jM5206M0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jM5206M0 & 4294967295L))) <= 0.5f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L0 */
    public final void m5205L0(long j5) {
        C1305C c1305c = AbstractC2986f.f9453a;
        InterfaceC2982d interfaceC2982d = (InterfaceC2982d) AbstractC0601k.m1032h(this, c1305c);
        if (this.f9477y) {
            AbstractC3204b.m5477c("launchAnimation called when previous animation was running");
        }
        ((InterfaceC2982d) AbstractC0601k.m1032h(this, c1305c)).getClass();
        InterfaceC2982d.f9446a.getClass();
        AbstractC2162v.m3994p(m4023x0(), null, new C2990h(this, new C2962L0(C2980c.f9436b), interfaceC2982d, j5, null), 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M0 */
    public final long m5206M0(C2684c c2684c, long j5, long j6) {
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        long jM3523F = AbstractC1925g.m3523F(j5);
        int iOrdinal = this.f9470r.ordinal();
        if (iOrdinal == 0) {
            InterfaceC2982d interfaceC2982d = (InterfaceC2982d) AbstractC0601k.m1032h(this, AbstractC2986f.f9453a);
            float f2 = c2684c.f8559b;
            float fMo5197a = interfaceC2982d.mo5197a(f2 - ((int) (j6 & 4294967295L)), c2684c.f8561d - f2, Float.intBitsToFloat((int) (jM3523F & 4294967295L)));
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fMo5197a);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        } else {
            if (iOrdinal != 1) {
                throw new C0330q();
            }
            InterfaceC2982d interfaceC2982d2 = (InterfaceC2982d) AbstractC0601k.m1032h(this, AbstractC2986f.f9453a);
            float f5 = c2684c.f8558a;
            jFloatToRawIntBits = ((long) Float.floatToRawIntBits(interfaceC2982d2.mo5197a(f5 - ((int) (j6 >> 32)), c2684c.f8560c - f5, Float.intBitsToFloat((int) (jM3523F >> 32))))) << 32;
            jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(0.0f)) & 4294967295L;
        }
        return jFloatToRawIntBits | jFloatToRawIntBits2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0625w
    /* JADX INFO: renamed from: x */
    public final void mo655x(long j5) {
        int iM2987g;
        long j6;
        long j7;
        long j8;
        long j9 = this.f9476x;
        this.f9476x = j5;
        int iOrdinal = this.f9470r.ordinal();
        if (iOrdinal == 0) {
            iM2987g = AbstractC1665j.m2987g((int) (j5 & 4294967295L), (int) (j9 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                throw new C0330q();
            }
            iM2987g = AbstractC1665j.m2987g((int) (j5 >> 32), (int) (j9 >> 32));
        }
        if (iM2987g >= 0) {
            return;
        }
        if (this.f9472t) {
            j6 = 0;
        } else {
            if (this.f9470r == EnumC2983d0.f9447d) {
                j7 = ((long) 0) << 32;
                j8 = ((int) (j9 & 4294967295L)) - ((int) (j5 & 4294967295L));
            } else {
                j7 = ((long) (((int) (j9 >> 32)) - ((int) (j5 >> 32)))) << 32;
                j8 = 0;
            }
            j6 = j7 | (j8 & 4294967295L);
        }
        long j10 = j6;
        C2684c c2684c = (C2684c) this.f9473u.mo6a();
        if (c2684c == null || this.f9477y || this.f9475w || !m5204K0(this, c2684c, j9, 0L, 2) || m5204K0(this, c2684c, 0L, j10, 1)) {
            return;
        }
        this.f9475w = true;
        m5205L0(j10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: y0 */
    public final boolean mo656y0() {
        return false;
    }
}
