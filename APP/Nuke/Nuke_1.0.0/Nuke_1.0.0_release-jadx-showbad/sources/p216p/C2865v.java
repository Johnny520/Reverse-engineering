package p216p;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import p000A.C0009E0;
import p000A.C0010F;
import p000A.C0049a;
import p007B0.AbstractC0208v;
import p007B0.C0200n;
import p007B0.C0209w;
import p007B0.EnumC0201o;
import p034G.C0462g;
import p034G.C0466k;
import p041H0.AbstractC0599j;
import p041H0.AbstractC0601k;
import p041H0.InterfaceC0558E0;
import p041H0.InterfaceC0595h;
import p041H0.InterfaceC0597i;
import p041H0.InterfaceC0604l0;
import p041H0.InterfaceC0624v0;
import p041H0.InterfaceC0632z0;
import p047I0.AbstractC0757q0;
import p047I0.InterfaceC0697T0;
import p049I2.C0793k;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p077P0.AbstractC1124k;
import p077P0.AbstractC1132s;
import p077P0.AbstractC1134u;
import p077P0.C1114a;
import p077P0.InterfaceC1136w;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p117X2.C1671p;
import p137b3.InterfaceC1855c;
import p154e2.C2023b;
import p160f3.AbstractC2162v;
import p160f3.C2136g0;
import p160f3.C2155q;
import p160f3.InterfaceC2115S;
import p186k.AbstractC2431m;
import p186k.C2442x;
import p190k3.C2455c;
import p204n0.C2683b;
import p227r.AbstractC2958J0;
import p227r.C2993i0;
import p232s.C3159f;
import p232s.C3160g;
import p232s.C3162i;
import p232s.C3163j;
import p232s.C3164k;
import p267y0.C3480b;
import p267y0.InterfaceC3481c;
import p273z0.AbstractC3510c;
import p273z0.InterfaceC3512e;

/* JADX INFO: renamed from: p.v */
/* JADX INFO: loaded from: classes.dex */
public final class C2865v extends AbstractC0599j implements InterfaceC0624v0, InterfaceC3512e, InterfaceC0632z0, InterfaceC0558E0, InterfaceC0595h, InterfaceC0604l0, InterfaceC3481c {

    /* JADX INFO: renamed from: N */
    public static final C2835b f9032N = new C2835b();

    /* JADX INFO: renamed from: A */
    public InterfaceC2819L f9033A;

    /* JADX INFO: renamed from: B */
    public InterfaceC0597i f9034B;

    /* JADX INFO: renamed from: C */
    public C3164k f9035C;

    /* JADX INFO: renamed from: D */
    public C3159f f9036D;

    /* JADX INFO: renamed from: E */
    public final C2442x f9037E;

    /* JADX INFO: renamed from: F */
    public long f9038F;

    /* JADX INFO: renamed from: G */
    public C3164k f9039G;

    /* JADX INFO: renamed from: H */
    public C3162i f9040H;

    /* JADX INFO: renamed from: I */
    public boolean f9041I;

    /* JADX INFO: renamed from: J */
    public C2023b f9042J;

    /* JADX INFO: renamed from: K */
    public C2136g0 f9043K;

    /* JADX INFO: renamed from: L */
    public final C2835b f9044L;

    /* JADX INFO: renamed from: M */
    public C0209w f9045M;

    /* JADX INFO: renamed from: t */
    public C3162i f9046t;

    /* JADX INFO: renamed from: u */
    public InterfaceC2819L f9047u;

    /* JADX INFO: renamed from: v */
    public boolean f9048v;

    /* JADX INFO: renamed from: w */
    public String f9049w;

    /* JADX INFO: renamed from: x */
    public boolean f9050x;

    /* JADX INFO: renamed from: y */
    public InterfaceC1599a f9051y;

    /* JADX INFO: renamed from: z */
    public final C2811D f9052z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2865v(C3162i c3162i, InterfaceC2819L interfaceC2819L, boolean z5, boolean z6, String str, InterfaceC1599a interfaceC1599a) {
        this.f9046t = c3162i;
        this.f9047u = interfaceC2819L;
        this.f9048v = z5;
        this.f9049w = str;
        this.f9050x = z6;
        this.f9051y = interfaceC1599a;
        this.f9052z = new C2811D(c3162i, 0, new C0009E0(1, this, C2865v.class, "onFocusChange", "onFocusChange(Z)V", 0, 0, 4));
        int i5 = AbstractC2431m.f7852a;
        this.f9037E = new C2442x(6);
        this.f9038F = 0L;
        C3162i c3162i2 = this.f9046t;
        this.f9040H = c3162i2;
        this.f9041I = c3162i2 == null;
        this.f9044L = f9032N;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: B0 */
    public final void mo143B0() {
        mo1051O();
        if (!this.f9041I) {
            m5066Q0();
        }
        if (this.f9050x) {
            m1021J0(this.f9052z);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: C0 */
    public final void mo144C0() throws ClassNotFoundException {
        m5062M0();
        if (this.f9040H == null) {
            this.f9046t = null;
        }
        InterfaceC0597i interfaceC0597i = this.f9034B;
        if (interfaceC0597i != null) {
            m1022K0(interfaceC0597i);
        }
        this.f9034B = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p267y0.InterfaceC3481c
    /* JADX INFO: renamed from: I */
    public final void mo5061I() {
        C2023b c2023b = this.f9042J;
        if (c2023b != null) {
            c2023b.m3721c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, java.util.List] */
    @Override // p041H0.InterfaceC0624v0
    /* JADX INFO: renamed from: K */
    public final void mo286K(C0200n c0200n, EnumC0201o enumC0201o, long j5) {
        long j6 = ((j5 >> 33) << 32) | (((j5 << 32) >> 33) & 4294967295L);
        this.f9038F = (((long) Float.floatToRawIntBits((int) (j6 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j6 & 4294967295L))) & 4294967295L);
        m5066Q0();
        boolean z5 = this.f9050x;
        EnumC0201o enumC0201o2 = EnumC0201o.f703e;
        InterfaceC1046d interfaceC1046d = null;
        if (z5 && enumC0201o == enumC0201o2) {
            int i5 = c0200n.f701f;
            if (i5 == 4) {
                AbstractC2162v.m3994p(m4023x0(), null, new C2843f(this, interfaceC1046d, 0), 3);
            } else if (i5 == 5) {
                AbstractC2162v.m3994p(m4023x0(), null, new C2843f(this, interfaceC1046d, 1), 3);
            }
        }
        if (enumC0201o != enumC0201o2) {
            if (enumC0201o != EnumC0201o.f704f || this.f9045M == null) {
                return;
            }
            ?? r12 = c0200n.f696a;
            int size = r12.size();
            for (int i6 = 0; i6 < size; i6++) {
                C0209w c0209w = (C0209w) r12.get(i6);
                if (c0209w.m321b() && !c0209w.equals(this.f9045M)) {
                    this.f9045M = null;
                    m5063N0(false);
                    return;
                }
            }
            return;
        }
        C0209w c0209w2 = this.f9045M;
        if (c0209w2 == null) {
            if (AbstractC2958J0.m5160d(c0200n, true)) {
                C0209w c0209w3 = (C0209w) c0200n.f696a.get(0);
                c0209w3.m320a();
                this.f9045M = c0209w3;
                if (this.f9050x) {
                    m5065P0(c0209w3.f713c, false);
                    return;
                }
                return;
            }
            return;
        }
        ?? r122 = c0200n.f696a;
        int size2 = r122.size();
        for (int i7 = 0; i7 < size2; i7++) {
            if (!AbstractC0208v.m313c((C0209w) r122.get(i7))) {
                long jMo273c0 = AbstractC0601k.m1044t(this).f1692C.mo273c0(((InterfaceC0697T0) AbstractC0601k.m1032h(this, AbstractC0757q0.f2369s)).mo778g());
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo273c0 >> 32)) - ((int) (j5 >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo273c0 & 4294967295L)) - ((int) (j5 & 4294967295L))) / 2.0f)) & 4294967295L);
                int size3 = r122.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    C0209w c0209w4 = (C0209w) r122.get(i8);
                    if (c0209w4.m321b() || AbstractC0208v.m316f(c0209w4, j5, jFloatToRawIntBits)) {
                        this.f9045M = null;
                        m5063N0(false);
                        return;
                    }
                }
                return;
            }
        }
        ((C0209w) r122.get(0)).m320a();
        if (this.f9050x) {
            m5064O0(c0209w2.f713c, false);
            this.f9051y.mo6a();
        }
        this.f9045M = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX INFO: renamed from: M0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5062M0() {
        C3162i c3162i = this.f9046t;
        C2442x c2442x = this.f9037E;
        if (c3162i != null) {
            C3164k c3164k = this.f9035C;
            if (c3164k != null) {
                c3162i.m5430b(new C3163j(c3164k));
            }
            C3164k c3164k2 = this.f9039G;
            if (c3164k2 != null) {
                c3162i.m5430b(new C3163j(c3164k2));
            }
            C3159f c3159f = this.f9036D;
            if (c3159f != null) {
                c3162i.m5430b(new C3160g(c3159f));
            }
            Object[] objArr = c2442x.f7889c;
            long[] jArr = c2442x.f7887a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j5 = jArr[i5];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((255 & j5) < 128) {
                                c3162i.m5430b(new C3163j((C3164k) objArr[(i5 << 3) + i7]));
                            }
                            j5 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        } else if (i5 == length) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
            }
        }
        this.f9035C = null;
        this.f9039G = null;
        this.f9036D = null;
        c2442x.m4352a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N0 */
    public final void m5063N0(boolean z5) {
        C3162i c3162i = this.f9046t;
        if (c3162i != null) {
            C2136g0 c2136g0 = this.f9043K;
            InterfaceC1046d interfaceC1046d = null;
            if (c2136g0 == null || !c2136g0.mo3904b()) {
                C3164k c3164k = z5 ? this.f9039G : this.f9035C;
                if (c3164k != null) {
                    C3163j c3163j = new C3163j(c3164k);
                    InterfaceC2115S interfaceC2115S = (InterfaceC2115S) ((C2455c) m4023x0()).f7926d.mo1166C(C2155q.f7102e);
                    AbstractC2162v.m3994p(m4023x0(), null, new C0466k(c3162i, c3163j, interfaceC2115S != null ? interfaceC2115S.mo3909w(new C0010F(14, c3162i, c3163j)) : null, interfaceC1046d, 8), 3);
                }
            } else {
                C2136g0 c2136g02 = this.f9043K;
                if (c2136g02 != null) {
                    c2136g02.mo3905c(null);
                }
            }
            if (z5) {
                this.f9039G = null;
            } else {
                this.f9035C = null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0604l0
    /* JADX INFO: renamed from: O */
    public final void mo1051O() {
        if (this.f9048v) {
            AbstractC0601k.m1040p(this, new C2833a(this, 0));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O0 */
    public final void m5064O0(long j5, boolean z5) {
        C3162i c3162i = this.f9046t;
        if (c3162i != null) {
            C2136g0 c2136g0 = this.f9043K;
            if (c2136g0 == null || !c2136g0.mo3904b()) {
                C3164k c3164k = z5 ? this.f9039G : this.f9035C;
                if (c3164k != null) {
                    AbstractC2162v.m3994p(m4023x0(), null, new C2837c(c3164k, c3162i, (InterfaceC1046d) null), 3);
                }
            } else {
                c2136g0.mo3905c(null);
                AbstractC2162v.m3994p(m4023x0(), null, new C0462g(c2136g0, j5, c3162i, (InterfaceC1046d) null, 2), 3);
            }
            if (z5) {
                this.f9039G = null;
            } else {
                this.f9035C = null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P0 */
    public final void m5065P0(long j5, boolean z5) {
        C3162i c3162i = this.f9046t;
        if (c3162i != null) {
            C3164k c3164k = new C3164k(j5);
            C1671p c1671p = new C1671p();
            AbstractC0601k.m1047w(this, C2993i0.f9478s, new C0049a(24, c1671p));
            if (!c1671p.f5705d) {
                int i5 = AbstractC2866w.f9054b;
                ViewParent parent = AbstractC0601k.m1046v(this).getParent();
                while (parent != null && (parent instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (!viewGroup.shouldDelayChildPressedState()) {
                        parent = viewGroup.getParent();
                    }
                }
                if (z5) {
                    this.f9039G = c3164k;
                } else {
                    this.f9035C = c3164k;
                }
                AbstractC2162v.m3994p(m4023x0(), null, new C2837c(c3162i, c3164k, (InterfaceC1046d) null), 3);
                return;
            }
            this.f9043K = AbstractC2162v.m3994p(m4023x0(), null, new C2839d(c3162i, c3164k, z5, this, null), 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q0 */
    public final void m5066Q0() {
        if (this.f9034B != null) {
            return;
        }
        InterfaceC2819L interfaceC2819L = this.f9048v ? this.f9033A : this.f9047u;
        if (interfaceC2819L != null) {
            if (this.f9046t == null) {
                this.f9046t = new C3162i();
            }
            this.f9052z.m5016O0(this.f9046t);
            C3162i c3162i = this.f9046t;
            AbstractC1665j.m2982b(c3162i);
            InterfaceC0597i interfaceC0597iMo2139a = interfaceC2819L.mo2139a(c3162i);
            m1021J0(interfaceC0597iMo2139a);
            this.f9034B = interfaceC0597iMo2139a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r17v1, resolved type: boolean */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ca, code lost:
    
        if (((r7 & ((~r7) << 6)) & r14) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cc, code lost:
    
        r16 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p273z0.InterfaceC3512e
    /* JADX INFO: renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo1266U(KeyEvent keyEvent) {
        boolean z5;
        int iNumberOfTrailingZeros;
        Object obj;
        m5066Q0();
        long jM5764b = AbstractC3510c.m5764b(keyEvent);
        boolean z6 = this.f9050x;
        C2442x c2442x = this.f9037E;
        InterfaceC1046d interfaceC1046d = null;
        int i5 = 1;
        if (z6 && AbstractC3510c.m5765c(keyEvent) == 2 && AbstractC2856m.m5055i(keyEvent)) {
            if (!c2442x.m4353b(jM5764b)) {
                C3164k c3164k = new C3164k(this.f9038F);
                c2442x.m4357f(jM5764b, c3164k);
                if (this.f9046t == null) {
                    return true;
                }
                AbstractC2162v.m3994p(m4023x0(), null, new C2841e(this, c3164k, interfaceC1046d, 2), 3);
                return true;
            }
        } else if (this.f9050x && AbstractC3510c.m5765c(keyEvent) == 1 && AbstractC2856m.m5055i(keyEvent)) {
            c2442x.getClass();
            int iHashCode = Long.hashCode(jM5764b) * (-862048943);
            int i6 = iHashCode ^ (iHashCode << 16);
            int i7 = i6 & 127;
            int i8 = c2442x.f7890d;
            int i9 = (i6 >>> 7) & i8;
            int i10 = 0;
            loop0: while (true) {
                long[] jArr = c2442x.f7887a;
                int i11 = i9 >> 3;
                int i12 = (i9 & 7) << 3;
                z5 = i5;
                long j5 = (((-i12) >> 63) & (jArr[i11 + i5] << (64 - i12))) | (jArr[i11] >>> i12);
                long j6 = (((long) i7) * 72340172838076673L) ^ j5;
                long j7 = -9187201950435737472L;
                long j8 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j8 == 0) {
                        break;
                    }
                    iNumberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j8) >> 3)) & i8;
                    long j9 = j7;
                    if (c2442x.f7888b[iNumberOfTrailingZeros] == jM5764b) {
                        break loop0;
                    }
                    j8 &= j8 - 1;
                    j7 = j9;
                }
                i10 += 8;
                i9 = (i9 + i10) & i8;
                i5 = z5 ? 1 : 0;
            }
            if (iNumberOfTrailingZeros >= 0) {
                c2442x.f7891e--;
                long[] jArr2 = c2442x.f7887a;
                int i13 = c2442x.f7890d;
                int i14 = iNumberOfTrailingZeros >> 3;
                int i15 = (iNumberOfTrailingZeros & 7) << 3;
                long j10 = (jArr2[i14] & (~(255 << i15))) | (254 << i15);
                jArr2[i14] = j10;
                jArr2[(((iNumberOfTrailingZeros - 7) & i13) + (i13 & 7)) >> 3] = j10;
                Object[] objArr = c2442x.f7889c;
                obj = objArr[iNumberOfTrailingZeros];
                objArr[iNumberOfTrailingZeros] = null;
            } else {
                obj = null;
            }
            C3164k c3164k2 = (C3164k) obj;
            if (c3164k2 != null) {
                if (this.f9046t != null) {
                    AbstractC2162v.m3994p(m4023x0(), null, new C2841e(this, c3164k2, interfaceC1046d, 3), 3);
                }
                this.f9051y.mo6a();
            }
            if (c3164k2 != null) {
                return z5;
            }
            return false;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0632z0
    /* JADX INFO: renamed from: X */
    public final void mo943X(InterfaceC1136w interfaceC1136w) {
        String str = this.f9049w;
        C2833a c2833a = new C2833a(this, 1);
        InterfaceC1855c[] interfaceC1855cArr = AbstractC1134u.f3766a;
        interfaceC1136w.mo1128a(AbstractC1124k.f3677b, new C1114a(str, c2833a));
        if (this.f9050x) {
            this.f9052z.mo943X(interfaceC1136w);
        } else {
            interfaceC1136w.mo1128a(AbstractC1132s.f3746i, C0891q.f2780a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0624v0
    /* JADX INFO: renamed from: g0 */
    public final void mo291g0() {
        C3159f c3159f;
        C3162i c3162i = this.f9046t;
        if (c3162i != null && (c3159f = this.f9036D) != null) {
            c3162i.m5430b(new C3160g(c3159f));
        }
        this.f9036D = null;
        if (this.f9045M != null) {
            this.f9045M = null;
            m5063N0(false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0632z0
    /* JADX INFO: renamed from: j0 */
    public final boolean mo1085j0() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p273z0.InterfaceC3512e
    /* JADX INFO: renamed from: k */
    public final boolean mo1267k(KeyEvent keyEvent) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0558E0
    /* JADX INFO: renamed from: s */
    public final Object mo146s() {
        return this.f9044L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p267y0.InterfaceC3481c
    /* JADX INFO: renamed from: y */
    public final void mo5067y(C0793k c0793k, EnumC0201o enumC0201o) {
        ArrayList arrayList = (ArrayList) c0793k.f2538f;
        m5066Q0();
        if (this.f9050x) {
            if (this.f9042J == null) {
                this.f9042J = new C2023b(this);
            }
            C2023b c2023b = this.f9042J;
            if (c2023b != null) {
                InterfaceC1599a interfaceC1599a = this.f9051y;
                C2865v c2865v = (C2865v) c2023b.f6752e;
                int i5 = 0;
                if (enumC0201o != EnumC0201o.f703e) {
                    if (enumC0201o != EnumC0201o.f704f || ((C3480b) c2023b.f6753f) == null) {
                        return;
                    }
                    int size = arrayList.size();
                    while (i5 < size) {
                        C3480b c3480b = (C3480b) arrayList.get(i5);
                        if (c3480b.f10809i && !c3480b.equals((C3480b) c2023b.f6753f)) {
                            c2023b.m3721c();
                            return;
                        }
                        i5++;
                    }
                    return;
                }
                C3480b c3480b2 = (C3480b) c2023b.f6753f;
                if (c3480b2 == null) {
                    int size2 = arrayList.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        C3480b c3480b3 = (C3480b) arrayList.get(i6);
                        if (!c3480b3.f10808h && c3480b3.f10804d) {
                            C3480b c3480b4 = (C3480b) arrayList.get(0);
                            c2023b.f6753f = c3480b4;
                            c2865v.m5065P0(c3480b4.f10803c, true);
                            c3480b4.f10809i = true;
                            return;
                        }
                    }
                    return;
                }
                long j5 = c3480b2.f10803c;
                int size3 = arrayList.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    C3480b c3480b5 = (C3480b) arrayList.get(i7);
                    if (c3480b5.f10808h && c3480b5.f10804d) {
                        if (Math.abs(C2683b.m4645c(C2683b.m4646d(((C3480b) arrayList.get(0)).f10803c, j5))) > ((InterfaceC0697T0) AbstractC0601k.m1032h(c2865v, AbstractC0757q0.f2369s)).mo777d()) {
                            c2023b.m3721c();
                            return;
                        }
                        return;
                    }
                }
                int size4 = arrayList.size();
                for (int i8 = 0; i8 < size4; i8++) {
                    C3480b c3480b6 = (C3480b) arrayList.get(i8);
                    if (c3480b6.f10809i || !c3480b6.f10808h || c3480b6.f10804d) {
                        int size5 = arrayList.size();
                        while (i5 < size5) {
                            if (((C3480b) arrayList.get(i5)).f10809i) {
                                c2023b.m3721c();
                                return;
                            }
                            i5++;
                        }
                        return;
                    }
                }
                ((C3480b) arrayList.get(0)).f10809i = true;
                c2865v.m5064O0(j5, true);
                interfaceC1599a.mo6a();
                c2023b.f6753f = null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: y0 */
    public final boolean mo656y0() {
        return false;
    }
}
