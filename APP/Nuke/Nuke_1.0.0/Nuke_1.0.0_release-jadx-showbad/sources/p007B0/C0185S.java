package p007B0;

import com.bumptech.glide.AbstractC1923e;
import p041H0.AbstractC0601k;
import p047I0.InterfaceC0697T0;
import p074O2.C1052j;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1176a;
import p084Q2.AbstractC1178c;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p153e1.InterfaceC2007c;
import p160f3.AbstractC2162v;
import p160f3.C2135g;
import p160f3.C2136g0;

/* JADX INFO: renamed from: B0.S */
/* JADX INFO: loaded from: classes.dex */
public final class C0185S implements InterfaceC2007c, InterfaceC1046d {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0186T f640d;

    /* JADX INFO: renamed from: e */
    public final C2135g f641e;

    /* JADX INFO: renamed from: f */
    public C2135g f642f;

    /* JADX INFO: renamed from: g */
    public EnumC0201o f643g = EnumC0201o.f703e;

    /* JADX INFO: renamed from: h */
    public final C1052j f644h = C1052j.f3286d;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0186T f645i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0185S(C0186T c0186t, C2135g c2135g) {
        this.f645i = c0186t;
        this.f640d = c0186t;
        this.f641e = c2135g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: C */
    public final long mo266C(float f2) {
        return this.f640d.mo266C(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: E */
    public final long mo267E(long j5) {
        return this.f640d.mo267E(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: G */
    public final float mo268G(float f2) {
        return this.f640d.mo272b() * f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: M */
    public final float mo269M(long j5) {
        return this.f640d.mo269M(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: S */
    public final int mo270S(float f2) {
        return this.f640d.mo270S(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m271a(EnumC0201o enumC0201o, AbstractC1176a abstractC1176a) {
        C2135g c2135g = new C2135g(1, AbstractC1923e.m3448G(abstractC1176a));
        c2135g.m3968t();
        this.f643g = enumC0201o;
        this.f642f = c2135g;
        return c2135g.m3967r();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: b */
    public final float mo272b() {
        return this.f640d.mo272b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: c0 */
    public final long mo273c0(long j5) {
        return this.f640d.mo273c0(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final long m274d() {
        C0186T c0186t = this.f645i;
        c0186t.getClass();
        long jMo273c0 = c0186t.mo273c0(AbstractC0601k.m1044t(c0186t).f1694E.mo778g());
        long j5 = c0186t.f647B;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo273c0 >> 32)) - ((int) (j5 >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo273c0 & 4294967295L)) - ((int) (j5 & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p074O2.InterfaceC1046d
    /* JADX INFO: renamed from: e */
    public final InterfaceC1051i mo275e() {
        return this.f644h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: e0 */
    public final float mo276e0(long j5) {
        return this.f640d.mo276e0(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final InterfaceC0697T0 m277f() {
        C0186T c0186t = this.f645i;
        c0186t.getClass();
        return AbstractC0601k.m1044t(c0186t).f1694E;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p074O2.InterfaceC1046d
    /* JADX INFO: renamed from: i */
    public final void mo278i(Object obj) {
        C0186T c0186t = this.f645i;
        synchronized (c0186t.f655y) {
            c0186t.f654x.m2761j(this);
        }
        this.f641e.mo278i(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x001d */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /* JADX WARN: Type inference failed for: r6v1, types: [f3.S] */
    /* JADX WARN: Type inference failed for: r6v4, types: [f3.S] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [W2.e] */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m279j(long j5, InterfaceC1603e interfaceC1603e, AbstractC1178c abstractC1178c) {
        C0182O c0182o;
        C2135g c2135g;
        if (abstractC1178c instanceof C0182O) {
            c0182o = (C0182O) abstractC1178c;
            int i5 = c0182o.f632j;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0182o.f632j = i5 - Integer.MIN_VALUE;
            } else {
                c0182o = new C0182O(this, abstractC1178c);
            }
        }
        Object objMo0g = c0182o.f630h;
        int i6 = c0182o.f632j;
        try {
            if (i6 == 0) {
                AbstractC1784a.m3205S(objMo0g);
                if (j5 <= 0 && (c2135g = this.f642f) != null) {
                    c2135g.mo278i(AbstractC1784a.m3229o(new C0202p(j5)));
                }
                C2136g0 c2136g0M3994p = AbstractC2162v.m3994p(this.f645i.m4023x0(), null, new C0183P(j5, this, null), 3);
                c0182o.f629g = c2136g0M3994p;
                c0182o.f632j = 1;
                objMo0g = interfaceC1603e.mo0g(this, c0182o);
                EnumC1152a enumC1152a = EnumC1152a.f3788d;
                j5 = c2136g0M3994p;
                if (objMo0g == enumC1152a) {
                    return enumC1152a;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2136g0 c2136g0 = c0182o.f629g;
                AbstractC1784a.m3205S(objMo0g);
                j5 = c2136g0;
            }
            return objMo0g;
        } finally {
            j5.mo3905c(C0188b.f658e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: k0 */
    public final long mo280k0(float f2) {
        return this.f640d.mo280k0(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m281l(long j5, InterfaceC1603e interfaceC1603e, AbstractC1176a abstractC1176a) {
        C0184Q c0184q;
        if (abstractC1176a instanceof C0184Q) {
            c0184q = (C0184Q) abstractC1176a;
            int i5 = c0184q.f639i;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0184q.f639i = i5 - Integer.MIN_VALUE;
            } else {
                c0184q = new C0184Q(this, abstractC1176a);
            }
        }
        Object obj = c0184q.f637g;
        int i6 = c0184q.f639i;
        try {
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1784a.m3205S(obj);
                return obj;
            }
            AbstractC1784a.m3205S(obj);
            c0184q.f639i = 1;
            Object objM279j = m279j(j5, interfaceC1603e, c0184q);
            Object obj2 = EnumC1152a.f3788d;
            return objM279j == obj2 ? obj2 : objM279j;
        } catch (C0202p unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: p */
    public final float mo282p() {
        return this.f640d.mo282p();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: q0 */
    public final float mo283q0(int i5) {
        return this.f640d.mo283q0(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: u0 */
    public final float mo284u0(float f2) {
        return f2 / this.f640d.mo272b();
    }
}
