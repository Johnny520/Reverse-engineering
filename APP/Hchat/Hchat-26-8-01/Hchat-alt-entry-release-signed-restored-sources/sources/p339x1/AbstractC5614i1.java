package p339x1;

import android.os.Build;
import android.view.ViewParent;
import be.AbstractC0283h;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import okio.C3193a;
import p002a1.C0009g;
import p020b5.C0184c;
import p028c1.C0372b;
import p057e1.C0806a;
import p057e1.C0807b;
import p057e1.C0808c;
import p057e1.C0809d;
import p069f.AbstractC0951o0;
import p069f.C0925b0;
import p069f.C0933f0;
import p069f.C0967y;
import p071f1.AbstractC0996c0;
import p071f1.AbstractC1013l;
import p071f1.C1008i0;
import p071f1.C1009j;
import p071f1.C1010j0;
import p071f1.C1012k0;
import p071f1.C1014l0;
import p071f1.C1017n;
import p071f1.C1020o0;
import p071f1.C1032u0;
import p071f1.C1034w;
import p071f1.InterfaceC1026r0;
import p071f1.InterfaceC1031u;
import p071f1.InterfaceC1037z;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p101h1.C1565b;
import p118i1.C1902b;
import p118i1.InterfaceC1904d;
import p129ig.AbstractC2043a;
import p131j0.C2046b;
import p136j8.C2104o;
import p219oh.AbstractC3165h;
import p227p4.C3315t;
import p259r9.AbstractC3754e0;
import p292u1.AbstractC4229a;
import p293u2.C4240j;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p308v1.AbstractC4434w;
import p308v1.C4399j;
import p308v1.C4406l0;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4428t;
import p322w0.AbstractC4655f;
import p322w0.AbstractC4666q;
import p332wb.AbstractC4855en;
import p356y0.AbstractC5852n;
import p357y1.AbstractC5883g0;
import p357y1.C5916o1;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: x1.i1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5614i1 extends AbstractC5628n0 implements InterfaceC4409m0, InterfaceC4428t, InterfaceC5644s1 {

    /* JADX INFO: renamed from: T */
    public static final C1020o0 f22844T = new C1020o0();

    /* JADX INFO: renamed from: U */
    public static final C5645t f22845U = new C5645t();

    /* JADX INFO: renamed from: V */
    public static final float[] f22846V = C1008i0.m2593a();

    /* JADX INFO: renamed from: W */
    public static final C5591c1 f22847W = new C5591c1();

    /* JADX INFO: renamed from: X */
    public static final C5595d1 f22848X = new C5595d1();

    /* JADX INFO: renamed from: A */
    public InterfaceC4233c f22849A;

    /* JADX INFO: renamed from: B */
    public EnumC4243m f22850B;

    /* JADX INFO: renamed from: D */
    public InterfaceC4415o0 f22852D;

    /* JADX INFO: renamed from: E */
    public C0925b0 f22853E;

    /* JADX INFO: renamed from: G */
    public float f22855G;

    /* JADX INFO: renamed from: H */
    public C0806a f22856H;

    /* JADX INFO: renamed from: I */
    public C5645t f22857I;

    /* JADX INFO: renamed from: K */
    public boolean f22859K;

    /* JADX INFO: renamed from: L */
    public boolean f22860L;

    /* JADX INFO: renamed from: M */
    public C1902b f22861M;

    /* JADX INFO: renamed from: N */
    public InterfaceC1031u f22862N;

    /* JADX INFO: renamed from: O */
    public C0009g f22863O;

    /* JADX INFO: renamed from: Q */
    public boolean f22865Q;

    /* JADX INFO: renamed from: R */
    public InterfaceC5638q1 f22866R;

    /* JADX INFO: renamed from: S */
    public C1902b f22867S;

    /* JADX INFO: renamed from: u */
    public final C5602f0 f22868u;

    /* JADX INFO: renamed from: v */
    public AbstractC5614i1 f22869v;

    /* JADX INFO: renamed from: w */
    public AbstractC5614i1 f22870w;

    /* JADX INFO: renamed from: x */
    public boolean f22871x;

    /* JADX INFO: renamed from: y */
    public boolean f22872y;

    /* JADX INFO: renamed from: z */
    public InterfaceC1231l f22873z;

    /* JADX INFO: renamed from: C */
    public float f22851C = 0.8f;

    /* JADX INFO: renamed from: F */
    public long f22854F = 0;

    /* JADX INFO: renamed from: J */
    public InterfaceC1026r0 f22858J = AbstractC0996c0.f3162b;

    /* JADX INFO: renamed from: P */
    public final C5603f1 f22864P = new C5603f1(this, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC5614i1(C5602f0 c5602f0) {
        this.f22868u = c5602f0;
        this.f22849A = c5602f0.f22771E;
        this.f22850B = c5602f0.f22772F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M1 */
    public static AbstractC5614i1 m10068M1(InterfaceC4428t interfaceC4428t) {
        AbstractC5614i1 abstractC5614i1;
        C4406l0 c4406l0 = interfaceC4428t instanceof C4406l0 ? (C4406l0) interfaceC4428t : null;
        if (c4406l0 != null && (abstractC5614i1 = c4406l0.f14675g.f22932u) != null) {
            return abstractC5614i1;
        }
        interfaceC4428t.getClass();
        return (AbstractC5614i1) interfaceC4428t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A1 */
    public final void m10069A1() {
        this.f22868u.f22779M.m10126b();
    }

    @Override // p308v1.AbstractC4377b1
    /* JADX INFO: renamed from: B0 */
    public abstract void mo8821B0(long j3, float f3, C1902b c1902b);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:43:0x0080 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:68:0x008f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:69:0x004a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:71:0x004a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x0089 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r7v7, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: B1 */
    public final void m10070B1() {
        AbstractC5852n abstractC5852nMo10106r1;
        boolean zM10141g = AbstractC5617j1.m10141g(128);
        AbstractC5852n abstractC5852nM10108t1 = m10108t1(zM10141g);
        if (abstractC5852nM10108t1 == null || (abstractC5852nM10108t1.f23788g.f23791j & 128) == 0) {
            return;
        }
        AbstractC4655f abstractC4655fM9148e = AbstractC4666q.m9148e();
        InterfaceC1231l interfaceC1231lMo9095e = abstractC4655fM9148e != null ? abstractC4655fM9148e.mo9095e() : null;
        AbstractC4655f abstractC4655fM9151h = AbstractC4666q.m9151h(abstractC4655fM9148e);
        try {
            if (!zM10141g) {
                abstractC5852nMo10106r1 = mo10106r1().f23792k;
                if (abstractC5852nMo10106r1 == null) {
                }
            }
            abstractC5852nMo10106r1 = mo10106r1();
            for (AbstractC5852n abstractC5852nM10108t12 = m10108t1(zM10141g); abstractC5852nM10108t12 != null; abstractC5852nM10108t12 = abstractC5852nM10108t12.f23793l) {
                if ((abstractC5852nM10108t12.f23791j & 128) == 0) {
                    break;
                }
                if ((abstractC5852nM10108t12.f23790i & 128) != 0) {
                    ?? M10149e = abstractC5852nM10108t12;
                    ?? c2046b = 0;
                    while (M10149e != 0) {
                        if (M10149e instanceof InterfaceC5655w0) {
                            ((InterfaceC5655w0) M10149e).mo744e(this.f14595i);
                        } else if ((M10149e.f23790i & 128) != 0 && (M10149e instanceof AbstractC5615j)) {
                            AbstractC5852n abstractC5852n = ((AbstractC5615j) M10149e).f22875v;
                            int i9 = 0;
                            M10149e = M10149e;
                            c2046b = c2046b;
                            while (abstractC5852n != null) {
                                if ((abstractC5852n.f23790i & 128) != 0) {
                                    i9++;
                                    c2046b = c2046b;
                                    if (i9 == 1) {
                                        M10149e = abstractC5852n;
                                    } else {
                                        if (c2046b == 0) {
                                            c2046b = new C2046b(new AbstractC5852n[16]);
                                        }
                                        if (M10149e != 0) {
                                            c2046b.m5056b(M10149e);
                                            M10149e = 0;
                                        }
                                        c2046b.m5056b(abstractC5852n);
                                    }
                                }
                                abstractC5852n = abstractC5852n.f23793l;
                                M10149e = M10149e;
                                c2046b = c2046b;
                            }
                            if (i9 == 1) {
                            }
                        }
                        M10149e = AbstractC5618k.m10149e(c2046b);
                    }
                }
                if (abstractC5852nM10108t12 == abstractC5852nMo10106r1) {
                    break;
                }
            }
        } finally {
            AbstractC4666q.m9154k(abstractC4655fM9148e, abstractC4655fM9151h, interfaceC1231lMo9095e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: C */
    public final boolean mo8856C() {
        return mo10106r1().f23801t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:33:0x005a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x0069 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x0026 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:53:0x0026 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:56:0x0063 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: C1 */
    public final void m10071C1() {
        boolean zM10141g = AbstractC5617j1.m10141g(4194304);
        AbstractC5852n abstractC5852nMo10106r1 = mo10106r1();
        if (!zM10141g && (abstractC5852nMo10106r1 = abstractC5852nMo10106r1.f23792k) == null) {
            return;
        }
        for (AbstractC5852n abstractC5852nM10108t1 = m10108t1(zM10141g); abstractC5852nM10108t1 != null && (abstractC5852nM10108t1.f23791j & 4194304) != 0; abstractC5852nM10108t1 = abstractC5852nM10108t1.f23793l) {
            if ((abstractC5852nM10108t1.f23790i & 4194304) != 0) {
                ?? M10149e = abstractC5852nM10108t1;
                ?? c2046b = 0;
                while (M10149e != 0) {
                    if (M10149e instanceof InterfaceC5648u) {
                        ((InterfaceC5648u) M10149e).mo1802p0(this);
                    } else if ((M10149e.f23790i & 4194304) != 0 && (M10149e instanceof AbstractC5615j)) {
                        AbstractC5852n abstractC5852n = ((AbstractC5615j) M10149e).f22875v;
                        int i9 = 0;
                        M10149e = M10149e;
                        c2046b = c2046b;
                        while (abstractC5852n != null) {
                            if ((abstractC5852n.f23790i & 4194304) != 0) {
                                i9++;
                                c2046b = c2046b;
                                if (i9 == 1) {
                                    M10149e = abstractC5852n;
                                } else {
                                    if (c2046b == 0) {
                                        c2046b = new C2046b(new AbstractC5852n[16]);
                                    }
                                    if (M10149e != 0) {
                                        c2046b.m5056b(M10149e);
                                        M10149e = 0;
                                    }
                                    c2046b.m5056b(abstractC5852n);
                                }
                            }
                            abstractC5852n = abstractC5852n.f23793l;
                            M10149e = M10149e;
                            c2046b = c2046b;
                        }
                        if (i9 == 1) {
                        }
                    }
                    M10149e = AbstractC5618k.m10149e(c2046b);
                }
            }
            if (abstractC5852nM10108t1 == abstractC5852nMo10106r1) {
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D1 */
    public final void m10072D1() {
        this.f22871x = true;
        this.f22864P.invoke();
        m10078J1();
        if (C4240j.m8528b(this.f22854F, 0L)) {
            return;
        }
        this.f22868u.m10016N(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: E */
    public final void mo8857E(float[] fArr) {
        InterfaceC5641r1 interfaceC5641r1M10067a = AbstractC5613i0.m10067a(this.f22868u);
        AbstractC5614i1 abstractC5614i1M10068M1 = m10068M1(AbstractC4434w.m8884h(this));
        m10083P1(abstractC5614i1M10068M1, fArr);
        if (interfaceC5641r1M10067a instanceof ViewTreeObserverOnGlobalLayoutListenerC5934t) {
            ((ViewTreeObserverOnGlobalLayoutListenerC5934t) interfaceC5641r1M10067a).m10664v(fArr);
            return;
        }
        long jMo8859P = abstractC5614i1M10068M1.mo8859P(0L);
        if ((9223372034707292159L & jMo8859P) != 9205357640488583168L) {
            C1008i0.m2598f(fArr, Float.intBitsToFloat((int) (jMo8859P >> 32)), Float.intBitsToFloat((int) (jMo8859P & 4294967295L)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E1 */
    public final void m10073E1() {
        boolean zM10141g = AbstractC5617j1.m10141g(1048576);
        AbstractC5852n abstractC5852nM10108t1 = m10108t1(zM10141g);
        if (abstractC5852nM10108t1 == null || (abstractC5852nM10108t1.f23788g.f23791j & 1048576) == 0) {
            return;
        }
        AbstractC5852n abstractC5852nMo10106r1 = mo10106r1();
        if (!zM10141g && (abstractC5852nMo10106r1 = abstractC5852nMo10106r1.f23792k) == null) {
            return;
        }
        for (AbstractC5852n abstractC5852nM10108t12 = m10108t1(zM10141g); abstractC5852nM10108t12 != null && (abstractC5852nM10108t12.f23791j & 1048576) != 0; abstractC5852nM10108t12 = abstractC5852nM10108t12.f23793l) {
            if ((abstractC5852nM10108t12.f23790i & 1048576) != 0) {
                AbstractC5852n abstractC5852nM10149e = abstractC5852nM10108t12;
                C2046b c2046b = null;
                while (abstractC5852nM10149e != null) {
                    if ((abstractC5852nM10149e.f23790i & 1048576) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                        int i9 = 0;
                        for (AbstractC5852n abstractC5852n = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n != null; abstractC5852n = abstractC5852n.f23793l) {
                            if ((abstractC5852n.f23790i & 1048576) != 0) {
                                i9++;
                                if (i9 == 1) {
                                    abstractC5852nM10149e = abstractC5852n;
                                } else {
                                    if (c2046b == null) {
                                        c2046b = new C2046b(new AbstractC5852n[16]);
                                    }
                                    if (abstractC5852nM10149e != null) {
                                        c2046b.m5056b(abstractC5852nM10149e);
                                        abstractC5852nM10149e = null;
                                    }
                                    c2046b.m5056b(abstractC5852n);
                                }
                            }
                        }
                        if (i9 == 1) {
                        }
                    }
                    abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b);
                }
            }
            if (abstractC5852nM10108t12 == abstractC5852nMo10106r1) {
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: F */
    public final long mo8858F() {
        return this.f14595i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:67:0x0192 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:71:0x019e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:83:0x01a0 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:86:0x019b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a4 A[PHI: r4
  0x01a4: PHI (r4v11 ??) = (r4v1 ??), (r4v1 ??), (r4v13 ??) binds: [B:55:0x0171, B:57:0x0175, B:71:0x019e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r3v7, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX INFO: renamed from: F1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10074F1(AbstractC5852n abstractC5852n, InterfaceC5599e1 interfaceC5599e1, long j3, C5633p c5633p, int i9, boolean z9, float f3, boolean z10) {
        ?? M10149e;
        if (abstractC5852n == null) {
            mo10112x1(interfaceC5599e1, j3, c5633p, i9, z9);
            return;
        }
        if (!interfaceC5599e1.mo9993b(abstractC5852n)) {
            m10074F1(AbstractC5618k.m10148d(abstractC5852n, interfaceC5599e1.mo9986a()), interfaceC5599e1, j3, c5633p, i9, z9, f3, z10);
            return;
        }
        int i10 = i9;
        if (i10 == 3 || i10 == 4) {
            ?? c2046b = 0;
            ?? r32 = abstractC5852n;
            while (true) {
                if (r32 == 0) {
                    break;
                }
                int i11 = 0;
                if (r32 instanceof InterfaceC5656w1) {
                    long jMo2034H = ((InterfaceC5656w1) r32).mo2034H();
                    int i12 = (int) (j3 >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i12);
                    C5602f0 c5602f0 = this.f22868u;
                    EnumC4243m enumC4243m = c5602f0.f22772F;
                    int i13 = AbstractC5592c2.f22729b;
                    long j4 = Long.MIN_VALUE & jMo2034H;
                    EnumC4243m enumC4243m2 = EnumC4243m.f13919g;
                    if (fIntBitsToFloat >= (-((j4 == 0 || enumC4243m == enumC4243m2) ? C5595d1.m9991g(0, jMo2034H) : C5595d1.m9991g(2, jMo2034H)))) {
                        if (Float.intBitsToFloat(i12) < mo8826w0() + ((j4 == 0 || c5602f0.f22772F == enumC4243m2) ? C5595d1.m9991g(2, jMo2034H) : C5595d1.m9991g(0, jMo2034H))) {
                            int i14 = (int) (j3 & 4294967295L);
                            if (Float.intBitsToFloat(i14) >= (-C5595d1.m9991g(1, jMo2034H))) {
                                if (Float.intBitsToFloat(i14) < C5595d1.m9991g(3, jMo2034H) + mo8825r0()) {
                                    C5607g1 c5607g1 = new C5607g1(this, abstractC5852n, interfaceC5599e1, j3, c5633p, i10, z9, f3, z10);
                                    C0967y c0967y = c5633p.f22941h;
                                    C0933f0 c0933f0 = c5633p.f22940g;
                                    int i15 = c5633p.f22942i;
                                    int i16 = c0933f0.f2924b;
                                    if (i15 == i16 - 1) {
                                        c5633p.m10186c(i15 + 1, i16);
                                        c5633p.f22942i++;
                                        c0933f0.m2286a(abstractC5852n);
                                        c0967y.m2386a(AbstractC5618k.m10145a(0.0f, z9, true));
                                        c5607g1.invoke();
                                        c5633p.f22942i = i15;
                                        return;
                                    }
                                    long jM10185a = c5633p.m10185a();
                                    int i17 = c5633p.f22942i;
                                    if (!AbstractC5618k.m10159o(jM10185a)) {
                                        if (AbstractC5618k.m10155k(jM10185a) > 0.0f) {
                                            int i18 = c5633p.f22942i;
                                            c5633p.m10186c(i18 + 1, c0933f0.f2924b);
                                            c5633p.f22942i++;
                                            c0933f0.m2286a(abstractC5852n);
                                            c0967y.m2386a(AbstractC5618k.m10145a(0.0f, z9, true));
                                            c5607g1.invoke();
                                            c5633p.f22942i = i18;
                                            return;
                                        }
                                        return;
                                    }
                                    int i19 = c0933f0.f2924b;
                                    int i20 = i19 - 1;
                                    c5633p.f22942i = i20;
                                    c5633p.m10186c(i19, c0933f0.f2924b);
                                    c5633p.f22942i++;
                                    c0933f0.m2286a(abstractC5852n);
                                    c0967y.m2386a(AbstractC5618k.m10145a(0.0f, z9, true));
                                    c5607g1.invoke();
                                    c5633p.f22942i = i20;
                                    if (AbstractC5618k.m10155k(c5633p.m10185a()) < 0.0f) {
                                        c5633p.m10186c(i17 + 1, c5633p.f22942i + 1);
                                    }
                                    c5633p.f22942i = i17;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    if ((r32.f23790i & 16) == 0 || !(r32 instanceof AbstractC5615j)) {
                        M10149e = AbstractC5618k.m10149e(c2046b);
                    } else {
                        AbstractC5852n abstractC5852n2 = ((AbstractC5615j) r32).f22875v;
                        M10149e = r32;
                        c2046b = c2046b;
                        while (abstractC5852n2 != null) {
                            if ((abstractC5852n2.f23790i & 16) != 0) {
                                i11++;
                                c2046b = c2046b;
                                if (i11 == 1) {
                                    M10149e = abstractC5852n2;
                                } else {
                                    if (c2046b == 0) {
                                        c2046b = new C2046b(new AbstractC5852n[16]);
                                    }
                                    if (M10149e != 0) {
                                        c2046b.m5056b(M10149e);
                                        M10149e = 0;
                                    }
                                    c2046b.m5056b(abstractC5852n2);
                                }
                            }
                            abstractC5852n2 = abstractC5852n2.f23793l;
                            M10149e = M10149e;
                            c2046b = c2046b;
                        }
                        if (i11 == 1) {
                        }
                    }
                    i10 = i9;
                    r32 = M10149e;
                    c2046b = c2046b;
                }
            }
        }
        if (z10) {
            m10110v1(abstractC5852n, interfaceC5599e1, j3, c5633p, i9, z9, f3);
        } else {
            m10080L1(abstractC5852n, interfaceC5599e1, j3, c5633p, i9, z9, f3);
        }
    }

    /* JADX INFO: renamed from: G1 */
    public abstract void mo10075G1(InterfaceC1031u interfaceC1031u, C1902b c1902b);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H1 */
    public final void m10076H1(long j3, float f3, InterfaceC1231l interfaceC1231l, C1902b c1902b) {
        C5602f0 c5602f0 = this.f22868u;
        if (c1902b != null) {
            if (interfaceC1231l != null) {
                AbstractC4229a.m8493a("both ways to create layers shouldn't be used together");
            }
            if (this.f22867S != c1902b) {
                this.f22867S = null;
                m10084Q1(null, false);
                this.f22867S = c1902b;
            }
            if (this.f22866R == null) {
                InterfaceC5641r1 interfaceC5641r1M10067a = AbstractC5613i0.m10067a(c5602f0);
                C0009g c0009g = this.f22863O;
                if (c0009g == null) {
                    C0009g c0009g2 = new C0009g(this, 3, new C5603f1(this, 0));
                    this.f22863O = c0009g2;
                    c0009g = c0009g2;
                }
                C5603f1 c5603f1 = this.f22864P;
                InterfaceC5638q1 interfaceC5638q1M10658l = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) interfaceC5641r1M10067a).m10658l(c0009g, c5603f1, c1902b);
                C5916o1 c5916o1 = (C5916o1) interfaceC5638q1M10658l;
                c5916o1.m10627e(this.f14595i);
                c5916o1.m10626d(j3);
                this.f22866R = interfaceC5638q1M10658l;
                c5602f0.f22782P = true;
                c5603f1.invoke();
            }
        } else {
            if (this.f22867S != null) {
                this.f22867S = null;
                m10084Q1(null, false);
            }
            m10084Q1(interfaceC1231l, false);
        }
        if (!C4240j.m8528b(this.f22854F, j3)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(c5602f0)).m10657P(-4.0f);
            this.f22854F = j3;
            InterfaceC5638q1 interfaceC5638q1 = this.f22866R;
            if (interfaceC5638q1 != null) {
                ((C5916o1) interfaceC5638q1).m10626d(j3);
            } else {
                AbstractC5614i1 abstractC5614i1 = this.f22870w;
                if (abstractC5614i1 != null) {
                    abstractC5614i1.m10113y1();
                }
            }
            c5602f0.m10016N(this);
            AbstractC5628n0.m10172d1(this);
            InterfaceC5641r1 interfaceC5641r1 = c5602f0.f22803t;
            if (interfaceC5641r1 != null) {
                ((ViewTreeObserverOnGlobalLayoutListenerC5934t) interfaceC5641r1).m10643B(c5602f0);
            }
        }
        this.f22855G = f3;
        if (this == c5602f0.f22778L.f22717d) {
            ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(c5602f0)).getRectManager().m3437f(c5602f0);
        }
        if (this.f22924q) {
            return;
        }
        m10176N0(mo10091Z0());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX INFO: renamed from: I1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10077I1(C0806a c0806a, boolean z9, boolean z10) {
        long jFloatToRawIntBits;
        InterfaceC5638q1 interfaceC5638q1 = this.f22866R;
        if (interfaceC5638q1 != null) {
            if (this.f22872y) {
                if (z10) {
                    long jM10105q1 = m10105q1();
                    float f3 = c0806a.f2410a;
                    float f10 = c0806a.f2411b;
                    if (c0806a.f2412c >= 0.0f) {
                        long j3 = this.f14595i;
                        if (f3 > ((int) (j3 >> 32)) || c0806a.f2413d < 0.0f || f10 > ((int) (j3 & 4294967295L))) {
                            jFloatToRawIntBits = 0;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM10105q1 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM10105q1 & 4294967295L));
                            float f11 = (fIntBitsToFloat - (c0806a.f2412c - c0806a.f2410a)) / 2.0f;
                            if (f11 > 0.0f) {
                                f3 -= f11;
                            } else {
                                float f12 = (-fIntBitsToFloat) / 2.0f;
                                if (f3 < f12) {
                                    f3 = f12;
                                }
                            }
                            float f13 = (fIntBitsToFloat2 - (c0806a.f2413d - c0806a.f2411b)) / 2.0f;
                            if (f13 > 0.0f) {
                                f10 -= f13;
                            } else {
                                float f14 = (-fIntBitsToFloat2) / 2.0f;
                                if (f10 < f14) {
                                    f10 = f14;
                                }
                            }
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L);
                        }
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                        long j4 = this.f14595i;
                        float f15 = (int) (j4 >> 32);
                        int i9 = (int) (jM10105q1 >> 32);
                        float f16 = (int) (j4 & 4294967295L);
                        int i10 = (int) (jM10105q1 & 4294967295L);
                        c0806a.m2035a(fIntBitsToFloat3, fIntBitsToFloat4, Math.min(Float.intBitsToFloat(i9) + f15, Math.max(f15, Float.intBitsToFloat(i9) + fIntBitsToFloat3)), Math.min(Float.intBitsToFloat(i10) + f16, Math.max(f16, Float.intBitsToFloat(i10) + fIntBitsToFloat4)));
                    }
                } else if (z9) {
                    long j5 = this.f14595i;
                    c0806a.m2035a(0.0f, 0.0f, (int) (j5 >> 32), (int) (j5 & 4294967295L));
                }
                if (c0806a.m2036b()) {
                    return;
                }
            }
            C5916o1 c5916o1 = (C5916o1) interfaceC5638q1;
            float[] fArrM10624b = c5916o1.m10624b();
            if (!c5916o1.f24024y) {
                if (fArrM10624b == null) {
                    c0806a.f2410a = 0.0f;
                    c0806a.f2411b = 0.0f;
                    c0806a.f2412c = 0.0f;
                    c0806a.f2413d = 0.0f;
                } else {
                    C1008i0.m2595c(fArrM10624b, c0806a);
                }
            }
        }
        long j10 = this.f22854F;
        float f17 = (int) (j10 >> 32);
        c0806a.f2410a += f17;
        c0806a.f2412c += f17;
        float f18 = (int) (j10 & 4294967295L);
        c0806a.f2411b += f18;
        c0806a.f2413d += f18;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J1 */
    public final void m10078J1() {
        if (this.f22866R != null) {
            if (this.f22867S != null) {
                this.f22867S = null;
            }
            m10084Q1(null, false);
            this.f22868u.m10022U(false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:117:0x00c6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:120:0x0083 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:122:0x0083 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:125:0x00c0 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x00b7 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [j0.b] */
    /* JADX INFO: renamed from: K1 */
    public final void m10079K1(InterfaceC4415o0 interfaceC4415o0) {
        AbstractC5614i1 abstractC5614i1;
        InterfaceC4415o0 interfaceC4415o02 = this.f22852D;
        if (interfaceC4415o0 != interfaceC4415o02) {
            this.f22852D = interfaceC4415o0;
            C5602f0 c5602f0 = this.f22868u;
            int i9 = 0;
            if (interfaceC4415o02 == null || interfaceC4415o0.mo7602h() != interfaceC4415o02.mo7602h() || interfaceC4415o0.mo7601g() != interfaceC4415o02.mo7601g()) {
                int iMo7602h = interfaceC4415o0.mo7602h();
                int iMo7601g = interfaceC4415o0.mo7601g();
                InterfaceC5638q1 interfaceC5638q1 = this.f22866R;
                if (interfaceC5638q1 != null) {
                    ((C5916o1) interfaceC5638q1).m10627e((((long) iMo7602h) << 32) | (((long) iMo7601g) & 4294967295L));
                } else if (c5602f0.m10011H() && (abstractC5614i1 = this.f22870w) != null) {
                    abstractC5614i1.m10113y1();
                }
                m8822C0((((long) iMo7601g) & 4294967295L) | (((long) iMo7602h) << 32));
                if (this.f22873z != null) {
                    m10085R1(false);
                }
                boolean zM10141g = AbstractC5617j1.m10141g(4);
                AbstractC5852n abstractC5852nMo10106r1 = mo10106r1();
                if (zM10141g || (abstractC5852nMo10106r1 = abstractC5852nMo10106r1.f23792k) != null) {
                    for (AbstractC5852n abstractC5852nM10108t1 = m10108t1(zM10141g); abstractC5852nM10108t1 != null && (abstractC5852nM10108t1.f23791j & 4) != 0; abstractC5852nM10108t1 = abstractC5852nM10108t1.f23793l) {
                        if ((abstractC5852nM10108t1.f23790i & 4) != 0) {
                            ?? M10149e = abstractC5852nM10108t1;
                            ?? c2046b = 0;
                            while (M10149e != 0) {
                                if (M10149e instanceof InterfaceC5624m) {
                                    ((InterfaceC5624m) M10149e).mo1329g0();
                                } else if ((M10149e.f23790i & 4) != 0 && (M10149e instanceof AbstractC5615j)) {
                                    AbstractC5852n abstractC5852n = ((AbstractC5615j) M10149e).f22875v;
                                    int i10 = 0;
                                    M10149e = M10149e;
                                    c2046b = c2046b;
                                    while (abstractC5852n != null) {
                                        if ((abstractC5852n.f23790i & 4) != 0) {
                                            i10++;
                                            c2046b = c2046b;
                                            if (i10 == 1) {
                                                M10149e = abstractC5852n;
                                            } else {
                                                if (c2046b == 0) {
                                                    c2046b = new C2046b(new AbstractC5852n[16]);
                                                }
                                                if (M10149e != 0) {
                                                    c2046b.m5056b(M10149e);
                                                    M10149e = 0;
                                                }
                                                c2046b.m5056b(abstractC5852n);
                                            }
                                        }
                                        abstractC5852n = abstractC5852n.f23793l;
                                        M10149e = M10149e;
                                        c2046b = c2046b;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                M10149e = AbstractC5618k.m10149e(c2046b);
                            }
                        }
                        if (abstractC5852nM10108t1 == abstractC5852nMo10106r1) {
                            break;
                        }
                    }
                }
                InterfaceC5641r1 interfaceC5641r1 = c5602f0.f22803t;
                if (interfaceC5641r1 != null) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC5934t) interfaceC5641r1).m10643B(c5602f0);
                }
                c5602f0.m10016N(this);
            }
            C0925b0 c0925b0 = this.f22853E;
            if ((c0925b0 == null || c0925b0.f2898e == 0) && interfaceC4415o0.mo7599e().isEmpty()) {
                return;
            }
            C0925b0 c0925b02 = this.f22853E;
            Map mapMo7599e = interfaceC4415o0.mo7599e();
            if (c0925b02 != null && c0925b02.f2898e == mapMo7599e.size()) {
                Object[] objArr = c0925b02.f2895b;
                int[] iArr = c0925b02.f2896c;
                long[] jArr = c0925b02.f2894a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i11 = 0;
                loop0: while (true) {
                    long j3 = jArr[i11];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = i9; i13 < i12; i13++) {
                            if ((255 & j3) < 128) {
                                int i14 = (i11 << 3) + i13;
                                Object obj = objArr[i14];
                                int i15 = iArr[i14];
                                Integer num = (Integer) mapMo7599e.get((C4399j) obj);
                                if (num == null || num.intValue() != i15) {
                                    break loop0;
                                }
                            }
                            j3 >>= 8;
                        }
                        if (i12 != 8) {
                            return;
                        }
                    }
                    if (i11 == length) {
                        return;
                    }
                    i11++;
                    i9 = 0;
                }
            }
            c5602f0.f22779M.f22891p.f23014D.m10061f();
            C0925b0 c0925b03 = this.f22853E;
            if (c0925b03 == null) {
                C0925b0 c0925b04 = AbstractC0951o0.f2997a;
                c0925b03 = new C0925b0();
                this.f22853E = c0925b03;
            }
            c0925b03.m2267a();
            for (Map.Entry entry : interfaceC4415o0.mo7599e().entrySet()) {
                c0925b03.m2273g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5644s1
    /* JADX INFO: renamed from: L */
    public final boolean mo9975L() {
        return (this.f22866R == null || this.f22871x || !this.f22868u.m10010G()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L1 */
    public final void m10080L1(AbstractC5852n abstractC5852n, InterfaceC5599e1 interfaceC5599e1, long j3, C5633p c5633p, int i9, boolean z9, float f3) {
        int i10;
        if (abstractC5852n == null) {
            mo10112x1(interfaceC5599e1, j3, c5633p, i9, z9);
            return;
        }
        if (!interfaceC5599e1.mo9993b(abstractC5852n)) {
            m10080L1(AbstractC5618k.m10148d(abstractC5852n, interfaceC5599e1.mo9986a()), interfaceC5599e1, j3, c5633p, i9, z9, f3);
            return;
        }
        if (!interfaceC5599e1.mo9990f(abstractC5852n)) {
            m10074F1(AbstractC5618k.m10148d(abstractC5852n, interfaceC5599e1.mo9986a()), interfaceC5599e1, j3, c5633p, i9, z9, f3, false);
            return;
        }
        C5611h1 c5611h1 = new C5611h1(this, abstractC5852n, interfaceC5599e1, j3, c5633p, i9, z9, f3);
        C0967y c0967y = c5633p.f22941h;
        C0933f0 c0933f0 = c5633p.f22940g;
        int i11 = c5633p.f22942i;
        int i12 = c0933f0.f2924b;
        if (i11 != i12 - 1) {
            long jM10185a = c5633p.m10185a();
            int i13 = c5633p.f22942i;
            int i14 = c0933f0.f2924b;
            int i15 = i14 - 1;
            c5633p.f22942i = i15;
            c5633p.m10186c(i14, c0933f0.f2924b);
            c5633p.f22942i++;
            c0933f0.m2286a(abstractC5852n);
            c0967y.m2386a(AbstractC5618k.m10145a(f3, z9, false));
            c5611h1.invoke();
            c5633p.f22942i = i15;
            long jM10185a2 = c5633p.m10185a();
            if (c5633p.f22942i + 1 >= c0933f0.f2924b - 1 || AbstractC5618k.m10151g(jM10185a, jM10185a2) <= 0) {
                c5633p.m10186c(c5633p.f22942i + 1, c0933f0.f2924b);
            } else {
                int i16 = i13 + 1;
                boolean zM10159o = AbstractC5618k.m10159o(jM10185a2);
                int i17 = c5633p.f22942i;
                c5633p.m10186c(i16, zM10159o ? i17 + 2 : i17 + 1);
            }
            c5633p.f22942i = i13;
            return;
        }
        int i18 = i11 + 1;
        c5633p.m10186c(i18, i12);
        c5633p.f22942i++;
        c0933f0.m2286a(abstractC5852n);
        c0967y.m2386a(AbstractC5618k.m10145a(f3, z9, false));
        c5611h1.invoke();
        c5633p.f22942i = i11;
        if (i18 == c0933f0.f2924b - 1 || AbstractC5618k.m10159o(c5633p.m10185a())) {
            int i19 = c5633p.f22942i;
            int i20 = i19 + 1;
            c0933f0.m2296k(i20);
            if (i20 < 0 || i20 >= (i10 = c0967y.f3044b)) {
                C3193a.m6820i("Index must be between 0 and size");
                return;
            }
            long[] jArr = c0967y.f3043a;
            long j4 = jArr[i20];
            if (i20 != i10 - 1) {
                AbstractC4165l.m8382q0(jArr, jArr, i20, i19 + 2, i10);
            }
            c0967y.f3044b--;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N1 */
    public final C0808c m10081N1() {
        if (mo10106r1().f23801t) {
            InterfaceC4428t interfaceC4428tM8884h = AbstractC4434w.m8884h(this);
            C0806a c0806a = this.f22856H;
            if (c0806a == null) {
                c0806a = new C0806a();
                this.f22856H = c0806a;
            }
            long jM10097i1 = m10097i1(m10105q1());
            int i9 = (int) (jM10097i1 >> 32);
            c0806a.f2410a = -Float.intBitsToFloat(i9);
            int i10 = (int) (jM10097i1 & 4294967295L);
            c0806a.f2411b = -Float.intBitsToFloat(i10);
            c0806a.f2412c = Float.intBitsToFloat(i9) + mo8826w0();
            c0806a.f2413d = Float.intBitsToFloat(i10) + mo8825r0();
            AbstractC5614i1 abstractC5614i1 = this;
            while (abstractC5614i1 != interfaceC4428tM8884h) {
                abstractC5614i1.m10077I1(c0806a, false, true);
                if (!c0806a.m2036b()) {
                    abstractC5614i1 = abstractC5614i1.f22870w;
                    abstractC5614i1.getClass();
                }
            }
            return new C0808c(c0806a.f2410a, c0806a.f2411b, c0806a.f2412c, c0806a.f2413d);
        }
        return C0808c.f2415e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O1 */
    public final void m10082O1(AbstractC5614i1 abstractC5614i1, float[] fArr) {
        float[] fArrM10623a;
        if (AbstractC1416l.m3825a(abstractC5614i1, this)) {
            return;
        }
        AbstractC5614i1 abstractC5614i12 = this.f22870w;
        abstractC5614i12.getClass();
        abstractC5614i12.m10082O1(abstractC5614i1, fArr);
        if (!C4240j.m8528b(this.f22854F, 0L)) {
            float[] fArr2 = f22846V;
            C1008i0.m2596d(fArr2);
            long j3 = this.f22854F;
            C1008i0.m2598f(fArr2, -((int) (j3 >> 32)), -((int) (j3 & 4294967295L)));
            C1008i0.m2597e(fArr, fArr2);
        }
        InterfaceC5638q1 interfaceC5638q1 = this.f22866R;
        if (interfaceC5638q1 == null || (fArrM10623a = ((C5916o1) interfaceC5638q1).m10623a()) == null) {
            return;
        }
        C1008i0.m2597e(fArr, fArrM10623a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: P */
    public final long mo8859P(long j3) {
        if (!mo10106r1().f23801t) {
            AbstractC4229a.m8494b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(this.f22868u)).m10665w(mo8868m0(j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P1 */
    public final void m10083P1(AbstractC5614i1 abstractC5614i1, float[] fArr) {
        AbstractC5614i1 abstractC5614i12 = this;
        while (!abstractC5614i12.equals(abstractC5614i1)) {
            InterfaceC5638q1 interfaceC5638q1 = abstractC5614i12.f22866R;
            if (interfaceC5638q1 != null) {
                C1008i0.m2597e(fArr, ((C5916o1) interfaceC5638q1).m10624b());
            }
            if (!C4240j.m8528b(abstractC5614i12.f22854F, 0L)) {
                float[] fArr2 = f22846V;
                C1008i0.m2596d(fArr2);
                C1008i0.m2598f(fArr2, (int) (r1 >> 32), (int) (r1 & 4294967295L));
                C1008i0.m2597e(fArr, fArr2);
            }
            abstractC5614i12 = abstractC5614i12.f22870w;
            abstractC5614i12.getClass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q1 */
    public final void m10084Q1(InterfaceC1231l interfaceC1231l, boolean z9) {
        InterfaceC5641r1 interfaceC5641r1;
        C2046b c2046b;
        Reference referencePoll;
        if (interfaceC1231l != null && this.f22867S != null) {
            AbstractC4229a.m8493a("layerBlock can't be provided when explicitLayer is provided");
        }
        C5602f0 c5602f0 = this.f22868u;
        boolean z10 = (!z9 && this.f22873z == interfaceC1231l && AbstractC1416l.m3825a(this.f22849A, c5602f0.f22771E) && this.f22850B == c5602f0.f22772F) ? false : true;
        this.f22849A = c5602f0.f22771E;
        this.f22850B = c5602f0.f22772F;
        boolean zM10010G = c5602f0.m10010G();
        C5603f1 c5603f1 = this.f22864P;
        if (zM10010G && interfaceC1231l != null) {
            this.f22873z = interfaceC1231l;
            if (this.f22866R != null) {
                if (z10) {
                    m10085R1(true);
                    return;
                }
                return;
            }
            InterfaceC5641r1 interfaceC5641r1M10067a = AbstractC5613i0.m10067a(c5602f0);
            C0009g c0009g = this.f22863O;
            if (c0009g == null) {
                C0009g c0009g2 = new C0009g(this, 3, new C5603f1(this, 0));
                this.f22863O = c0009g2;
                c0009g = c0009g2;
            }
            InterfaceC5638q1 interfaceC5638q1M10658l = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) interfaceC5641r1M10067a).m10658l(c0009g, c5603f1, null);
            C5916o1 c5916o1 = (C5916o1) interfaceC5638q1M10658l;
            c5916o1.m10627e(this.f14595i);
            c5916o1.m10626d(this.f22854F);
            this.f22866R = interfaceC5638q1M10658l;
            m10085R1(true);
            c5602f0.f22782P = true;
            c5603f1.invoke();
            return;
        }
        this.f22873z = null;
        InterfaceC5638q1 interfaceC5638q1 = this.f22866R;
        if (interfaceC5638q1 != null) {
            C5916o1 c5916o12 = (C5916o1) interfaceC5638q1;
            if (!AbstractC0996c0.m2518o(c5916o12.m10624b())) {
                c5602f0.m10016N(this);
            }
            c5916o12.f24009j = null;
            c5916o12.f24010k = null;
            c5916o12.f24012m = true;
            c5916o12.m10628f(false);
            InterfaceC1037z interfaceC1037z = c5916o12.f24007h;
            if (interfaceC1037z != null) {
                interfaceC1037z.mo2555a(c5916o12.f24006g);
                ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = c5916o12.f24008i;
                C3315t c3315t = viewTreeObserverOnGlobalLayoutListenerC5934t.f24071E0;
                do {
                    ReferenceQueue referenceQueue = (ReferenceQueue) c3315t.f10678i;
                    c2046b = (C2046b) c3315t.f10677h;
                    referencePoll = referenceQueue.poll();
                    if (referencePoll != null) {
                        c2046b.m5064j(referencePoll);
                    }
                } while (referencePoll != null);
                c2046b.m5056b(new WeakReference(c5916o12, (ReferenceQueue) c3315t.f10678i));
                viewTreeObserverOnGlobalLayoutListenerC5934t.f24082K.m2295j(c5916o12);
            }
            this.f22866R = null;
            c5602f0.f22782P = true;
            c5603f1.invoke();
            if (mo10106r1().f23801t && c5602f0.m10011H() && (interfaceC5641r1 = c5602f0.f22803t) != null) {
                ((ViewTreeObserverOnGlobalLayoutListenerC5934t) interfaceC5641r1).m10643B(c5602f0);
            }
        }
        this.f22865Q = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: R */
    public final long mo8860R(long j3) {
        if (!mo10106r1().f23801t) {
            AbstractC4229a.m8494b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        InterfaceC4428t interfaceC4428tM8884h = AbstractC4434w.m8884h(this);
        ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = (ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(this.f22868u);
        viewTreeObserverOnGlobalLayoutListenerC5934t.m10647F();
        return mo8861W(interfaceC4428tM8884h, C0807b.m2041d(C1008i0.m2594b(j3, viewTreeObserverOnGlobalLayoutListenerC5934t.f24119k0), interfaceC4428tM8884h.mo8868m0(0L)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R1 */
    public final void m10085R1(boolean z9) {
        float f3;
        ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t;
        int i9;
        long j3;
        char c10;
        ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t2;
        boolean z10;
        ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t3;
        InterfaceC5641r1 interfaceC5641r1;
        InterfaceC1220a interfaceC1220a;
        int i10;
        InterfaceC1220a interfaceC1220a2;
        if (this.f22867S != null) {
            return;
        }
        InterfaceC5638q1 interfaceC5638q1 = this.f22866R;
        InterfaceC1231l interfaceC1231l = this.f22873z;
        if (interfaceC5638q1 == null) {
            if (interfaceC1231l == null) {
                return;
            }
            AbstractC4229a.m8494b("null layer with a non-null layerBlock");
            return;
        }
        if (interfaceC1231l == null) {
            throw AbstractC4855en.m9257a("updateLayerParameters requires a non-null layerBlock");
        }
        C1020o0 c1020o0 = f22844T;
        c1020o0.m2627e();
        C5602f0 c5602f0 = this.f22868u;
        c1020o0.f3223w = c5602f0.f22771E;
        c1020o0.f3224x = c5602f0.f22772F;
        c1020o0.f3222v = AbstractC3754e0.m7908q0(this.f14595i);
        ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(c5602f0)).getSnapshotObserver().f23001a.m9162c(this, C5593d.f22733k, new C0372b(interfaceC1231l, 5, this));
        C5645t c5645t = this.f22857I;
        if (c5645t == null) {
            c5645t = new C5645t();
            this.f22857I = c5645t;
        }
        C5645t c5645t2 = f22845U;
        c5645t2.getClass();
        c5645t2.f22983a = c5645t.f22983a;
        c5645t2.f22984b = c5645t.f22984b;
        c5645t2.f22985c = c5645t.f22985c;
        c5645t2.f22986d = c5645t.f22986d;
        c5645t2.f22987e = c5645t.f22987e;
        c5645t2.f22988f = c5645t.f22988f;
        c5645t2.f22989g = c5645t.f22989g;
        c5645t2.f22990h = c5645t.f22990h;
        c5645t2.f22991i = c5645t.f22991i;
        float f10 = c1020o0.f3208h;
        c5645t.f22983a = f10;
        c5645t.f22984b = c1020o0.f3209i;
        c5645t.f22985c = c1020o0.f3211k;
        c5645t.f22986d = c1020o0.f3212l;
        c5645t.f22987e = 0.0f;
        c5645t.f22988f = 0.0f;
        c5645t.f22989g = c1020o0.f3216p;
        c5645t.f22990h = c1020o0.f3217q;
        long j4 = c1020o0.f3218r;
        c5645t.f22991i = j4;
        C5916o1 c5916o1 = (C5916o1) interfaceC5638q1;
        ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t4 = c5916o1.f24008i;
        int i11 = c1020o0.f3207g | c5916o1.f24019t;
        c5916o1.f24017r = c1020o0.f3224x;
        c5916o1.f24016q = c1020o0.f3223w;
        int i12 = i11 & 4096;
        if (i12 != 0) {
            c5916o1.f24020u = j4;
        }
        if ((i11 & 1) != 0) {
            InterfaceC1904d interfaceC1904d = c5916o1.f24006g.f6340a;
            if (interfaceC1904d.mo4698b() != f10) {
                interfaceC1904d.mo4713q(f10);
            }
        }
        if ((i11 & 2) != 0) {
            C1902b c1902b = c5916o1.f24006g;
            float f11 = c1020o0.f3209i;
            InterfaceC1904d interfaceC1904d2 = c1902b.f6340a;
            if (interfaceC1904d2.mo4718v() != f11) {
                interfaceC1904d2.mo4705i(f11);
            }
        }
        if ((i11 & 4) != 0) {
            c5916o1.f24006g.m4678f(c1020o0.f3210j);
        }
        if ((i11 & 8) != 0) {
            C1902b c1902b2 = c5916o1.f24006g;
            float f12 = c1020o0.f3211k;
            InterfaceC1904d interfaceC1904d3 = c1902b2.f6340a;
            if (interfaceC1904d3.mo4689H() != f12) {
                interfaceC1904d3.mo4715s(f12);
            }
        }
        if ((i11 & 16) != 0) {
            C1902b c1902b3 = c5916o1.f24006g;
            float f13 = c1020o0.f3212l;
            InterfaceC1904d interfaceC1904d4 = c1902b3.f6340a;
            if (interfaceC1904d4.mo4686E() != f13) {
                interfaceC1904d4.mo4703g(f13);
            }
        }
        if ((i11 & 32) != 0) {
            C1902b c1902b4 = c5916o1.f24006g;
            float f14 = c1020o0.f3213m;
            InterfaceC1904d interfaceC1904d5 = c1902b4.f6340a;
            if (interfaceC1904d5.mo4694M() != f14) {
                interfaceC1904d5.mo4699c(f14);
                c1902b4.f6346g = true;
                c1902b4.m4673a();
            }
            if (c1020o0.f3213m > 0.0f && !c5916o1.f24025z && (interfaceC1220a2 = c5916o1.f24010k) != null) {
                interfaceC1220a2.invoke();
            }
        }
        if ((i11 & 64) != 0) {
            C1902b c1902b5 = c5916o1.f24006g;
            long j5 = c1020o0.f3214n;
            InterfaceC1904d interfaceC1904d6 = c1902b5.f6340a;
            f3 = 0.0f;
            if (!C1034w.m2635c(j5, interfaceC1904d6.mo4685D())) {
                interfaceC1904d6.mo4712p(j5);
            }
        } else {
            f3 = 0.0f;
        }
        if ((i11 & 128) != 0) {
            C1902b c1902b6 = c5916o1.f24006g;
            long j10 = c1020o0.f3215o;
            InterfaceC1904d interfaceC1904d7 = c1902b6.f6340a;
            if (!C1034w.m2635c(j10, interfaceC1904d7.mo4687F())) {
                interfaceC1904d7.mo4716t(j10);
            }
        }
        if ((i11 & 1024) != 0) {
            C1902b c1902b7 = c5916o1.f24006g;
            float f15 = c1020o0.f3216p;
            InterfaceC1904d interfaceC1904d8 = c1902b7.f6340a;
            if (interfaceC1904d8.mo4683B() != f15) {
                interfaceC1904d8.mo4702f(f15);
            }
        }
        if ((i11 & Opcodes.ACC_NATIVE) != 0) {
            InterfaceC1904d interfaceC1904d9 = c5916o1.f24006g.f6340a;
            if (interfaceC1904d9.mo4690I() != f3) {
                interfaceC1904d9.mo4708l();
            }
        }
        if ((i11 & Opcodes.ACC_INTERFACE) != 0) {
            InterfaceC1904d interfaceC1904d10 = c5916o1.f24006g.f6340a;
            if (interfaceC1904d10.mo4722z() != f3) {
                interfaceC1904d10.mo4711o();
            }
        }
        if ((i11 & Opcodes.ACC_STRICT) != 0) {
            C1902b c1902b8 = c5916o1.f24006g;
            float f16 = c1020o0.f3217q;
            InterfaceC1904d interfaceC1904d11 = c1902b8.f6340a;
            if (interfaceC1904d11.mo4688G() != f16) {
                interfaceC1904d11.mo4717u(f16);
            }
        }
        if (i12 != 0) {
            j3 = 4294967295L;
            viewTreeObserverOnGlobalLayoutListenerC5934t = viewTreeObserverOnGlobalLayoutListenerC5934t4;
            boolean zM2631a = C1032u0.m2631a(c5916o1.f24020u, C1032u0.f3254b);
            C1902b c1902b9 = c5916o1.f24006g;
            if (zM2631a) {
                if (!C0807b.m2039b(c1902b9.f6361v, 9205357640488583168L)) {
                    c1902b9.f6361v = 9205357640488583168L;
                    c1902b9.f6340a.mo4684C(9205357640488583168L);
                }
                i9 = i11;
                c10 = ' ';
            } else {
                c10 = ' ';
                i9 = i11;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c5916o1.f24020u & 4294967295L)) * ((int) (c5916o1.f24011l & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c5916o1.f24020u >> 32)) * ((int) (c5916o1.f24011l >> 32)))) << 32);
                if (!C0807b.m2039b(c1902b9.f6361v, jFloatToRawIntBits)) {
                    c1902b9.f6361v = jFloatToRawIntBits;
                    c1902b9.f6340a.mo4684C(jFloatToRawIntBits);
                }
            }
        } else {
            viewTreeObserverOnGlobalLayoutListenerC5934t = viewTreeObserverOnGlobalLayoutListenerC5934t4;
            i9 = i11;
            j3 = 4294967295L;
            c10 = ' ';
        }
        if ((i9 & 16384) != 0) {
            C1902b c1902b10 = c5916o1.f24006g;
            boolean z11 = c1020o0.f3220t;
            if (c1902b10.f6362w != z11) {
                c1902b10.f6362w = z11;
                c1902b10.f6346g = true;
                c1902b10.m4673a();
            }
        }
        if ((131072 & i9) != 0) {
            c5916o1.f24006g.m4679g(null);
        }
        if ((262144 & i9) != 0) {
            C1902b c1902b11 = c5916o1.f24006g;
            C1017n c1017n = c1020o0.f3225y;
            InterfaceC1904d interfaceC1904d12 = c1902b11.f6340a;
            if (!AbstractC1416l.m3825a(interfaceC1904d12.mo4720x(), c1017n)) {
                interfaceC1904d12.mo4707k(c1017n);
            }
        }
        if ((524288 & i9) != 0) {
            C1902b c1902b12 = c5916o1.f24006g;
            int i13 = c1020o0.f3226z;
            InterfaceC1904d interfaceC1904d13 = c1902b12.f6340a;
            if (interfaceC1904d13.mo4696O() != i13) {
                interfaceC1904d13.mo4704h(i13);
            }
        }
        if ((32768 & i9) != 0) {
            C1902b c1902b13 = c5916o1.f24006g;
            int i14 = c1020o0.f3221u;
            if (i14 == 0) {
                i10 = 0;
            } else if (i14 == 1) {
                i10 = 1;
            } else {
                i10 = 2;
                if (i14 != 2) {
                    C2104o.m5276A("Not supported composition strategy");
                    return;
                }
            }
            InterfaceC1904d interfaceC1904d14 = c1902b13.f6340a;
            if (interfaceC1904d14.mo4719w() != i10) {
                interfaceC1904d14.mo4691J(i10);
            }
        }
        if ((i9 & 7963) != 0) {
            c5916o1.f24022w = true;
            c5916o1.f24023x = true;
        }
        if (AbstractC1416l.m3825a(c5916o1.f24021v, c1020o0.f3206A)) {
            viewTreeObserverOnGlobalLayoutListenerC5934t2 = viewTreeObserverOnGlobalLayoutListenerC5934t;
            z10 = false;
        } else {
            AbstractC0996c0 abstractC0996c0 = c1020o0.f3206A;
            c5916o1.f24021v = abstractC0996c0;
            if (abstractC0996c0 == null) {
                viewTreeObserverOnGlobalLayoutListenerC5934t2 = viewTreeObserverOnGlobalLayoutListenerC5934t;
            } else {
                C1902b c1902b14 = c5916o1.f24006g;
                if (abstractC0996c0 instanceof C1012k0) {
                    C0808c c0808c = ((C1012k0) abstractC0996c0).f3197f;
                    float f17 = c0808c.f2416a;
                    float f18 = c0808c.f2417b;
                    viewTreeObserverOnGlobalLayoutListenerC5934t2 = viewTreeObserverOnGlobalLayoutListenerC5934t;
                    c1902b14.m4680h(0.0f, (((long) Float.floatToRawIntBits(f17)) << c10) | (((long) Float.floatToRawIntBits(f18)) & j3), (((long) Float.floatToRawIntBits(c0808c.f2418c - f17)) << c10) | (((long) Float.floatToRawIntBits(c0808c.f2419d - f18)) & j3));
                } else {
                    viewTreeObserverOnGlobalLayoutListenerC5934t2 = viewTreeObserverOnGlobalLayoutListenerC5934t;
                    if (abstractC0996c0 instanceof C1010j0) {
                        C1009j c1009j = ((C1010j0) abstractC0996c0).f3195f;
                        c1902b14.f6350k = null;
                        c1902b14.f6348i = 9205357640488583168L;
                        c1902b14.f6347h = 0L;
                        c1902b14.f6349j = 0.0f;
                        c1902b14.f6346g = true;
                        c1902b14.f6353n = false;
                        c1902b14.f6351l = c1009j;
                        c1902b14.m4673a();
                    } else {
                        if (!(abstractC0996c0 instanceof C1014l0)) {
                            C3193a.m6822k();
                            return;
                        }
                        C1014l0 c1014l0 = (C1014l0) abstractC0996c0;
                        C1009j c1009j2 = c1014l0.f3199g;
                        if (c1009j2 != null) {
                            c1902b14.f6350k = null;
                            c1902b14.f6348i = 9205357640488583168L;
                            c1902b14.f6347h = 0L;
                            c1902b14.f6349j = 0.0f;
                            c1902b14.f6346g = true;
                            c1902b14.f6353n = false;
                            c1902b14.f6351l = c1009j2;
                            c1902b14.m4673a();
                        } else {
                            C0809d c0809d = c1014l0.f3198f;
                            float f19 = c0809d.f2421b;
                            float f20 = c0809d.f2420a;
                            c1902b14.m4680h(Float.intBitsToFloat((int) (c0809d.f2427h >> c10)), (((long) Float.floatToRawIntBits(f20)) << c10) | (((long) Float.floatToRawIntBits(f19)) & j3), (((long) Float.floatToRawIntBits(c0809d.f2422c - f20)) << c10) | (((long) Float.floatToRawIntBits(c0809d.f2423d - f19)) & j3));
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((abstractC0996c0 instanceof C1010j0) || ((abstractC0996c0 instanceof C1014l0) && !AbstractC0283h.m1124D(((C1014l0) abstractC0996c0).f3198f))) && (interfaceC1220a = c5916o1.f24010k) != null)) {
                    interfaceC1220a.invoke();
                }
            }
            z10 = true;
        }
        c5916o1.f24019t = c1020o0.f3207g;
        if (i9 != 0 || z10) {
            ViewParent parent = viewTreeObserverOnGlobalLayoutListenerC5934t2.getParent();
            if (parent != null) {
                viewTreeObserverOnGlobalLayoutListenerC5934t3 = viewTreeObserverOnGlobalLayoutListenerC5934t2;
                parent.onDescendantInvalidated(viewTreeObserverOnGlobalLayoutListenerC5934t3, viewTreeObserverOnGlobalLayoutListenerC5934t3);
            } else {
                viewTreeObserverOnGlobalLayoutListenerC5934t3 = viewTreeObserverOnGlobalLayoutListenerC5934t2;
            }
            if (ViewTreeObserverOnGlobalLayoutListenerC5934t.m10640r()) {
                viewTreeObserverOnGlobalLayoutListenerC5934t3.m10657P(0.0f);
            }
        }
        boolean z12 = this.f22872y;
        this.f22872y = c1020o0.f3220t;
        this.f22851C = c1020o0.f3210j;
        boolean z13 = c5645t2.f22983a == c5645t.f22983a && c5645t2.f22984b == c5645t.f22984b && c5645t2.f22985c == c5645t.f22985c && c5645t2.f22986d == c5645t.f22986d && c5645t2.f22987e == c5645t.f22987e && c5645t2.f22988f == c5645t.f22988f && c5645t2.f22989g == c5645t.f22989g && c5645t2.f22990h == c5645t.f22990h && C1032u0.m2631a(c5645t2.f22991i, c5645t.f22991i);
        if (z9 && ((!z13 || z12 != this.f22872y) && (interfaceC5641r1 = c5602f0.f22803t) != null)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC5934t) interfaceC5641r1).m10643B(c5602f0);
        }
        if (z13) {
            return;
        }
        c5602f0.m10016N(this);
        if (c5602f0.f22788V > 0) {
            ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t5 = (ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(c5602f0);
            C3315t c3315t = viewTreeObserverOnGlobalLayoutListenerC5934t5.f24109f0.f22996e;
            c3315t.getClass();
            if (c5602f0.f22788V > 0) {
                ((C2046b) c3315t.f10677h).m5056b(c5602f0);
                c5602f0.f22787U = true;
            }
            viewTreeObserverOnGlobalLayoutListenerC5934t5.m10650I(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5628n0
    /* JADX INFO: renamed from: S0 */
    public final AbstractC5628n0 mo10086S0() {
        return this.f22869v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017b  */
    /* JADX INFO: renamed from: S1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m10087S1(long j3) {
        boolean z9;
        boolean z10;
        boolean zM10602r;
        if ((((9187343241974906880L ^ (j3 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        InterfaceC5638q1 interfaceC5638q1 = this.f22866R;
        if (interfaceC5638q1 == null || !this.f22872y) {
            return true;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        C1902b c1902b = ((C5916o1) interfaceC5638q1).f24006g;
        if (c1902b.f6362w) {
            AbstractC0996c0 abstractC0996c0M4676d = c1902b.m4676d();
            if (abstractC0996c0M4676d instanceof C1012k0) {
                C0808c c0808c = ((C1012k0) abstractC0996c0M4676d).f3197f;
                if (c0808c.f2416a > fIntBitsToFloat || fIntBitsToFloat >= c0808c.f2418c || c0808c.f2417b > fIntBitsToFloat2 || fIntBitsToFloat2 >= c0808c.f2419d) {
                    z9 = false;
                    z10 = true;
                }
                z9 = false;
                z10 = true;
            } else if (abstractC0996c0M4676d instanceof C1014l0) {
                C0809d c0809d = ((C1014l0) abstractC0996c0M4676d).f3198f;
                float f3 = c0809d.f2422c;
                float f10 = c0809d.f2421b;
                float f11 = c0809d.f2423d;
                float f12 = c0809d.f2420a;
                long j4 = c0809d.f2425f;
                z9 = false;
                z10 = true;
                long j5 = c0809d.f2427h;
                long j10 = c0809d.f2426g;
                long j11 = c0809d.f2424e;
                if (fIntBitsToFloat >= f12 && fIntBitsToFloat < f3 && fIntBitsToFloat2 >= f10 && fIntBitsToFloat2 < f11) {
                    int i9 = (int) (j11 >> 32);
                    float fIntBitsToFloat3 = Float.intBitsToFloat(i9);
                    int i10 = (int) (j4 >> 32);
                    if (Float.intBitsToFloat(i10) + fIntBitsToFloat3 <= f3 - f12) {
                        int i11 = (int) (j5 >> 32);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i11);
                        int i12 = (int) (j10 >> 32);
                        if (Float.intBitsToFloat(i12) + fIntBitsToFloat4 <= f3 - f12) {
                            int i13 = (int) (j11 & 4294967295L);
                            int i14 = (int) (j5 & 4294967295L);
                            if (Float.intBitsToFloat(i14) + Float.intBitsToFloat(i13) <= f11 - f10) {
                                int i15 = (int) (j4 & 4294967295L);
                                int i16 = (int) (j10 & 4294967295L);
                                if (Float.intBitsToFloat(i16) + Float.intBitsToFloat(i15) <= f11 - f10) {
                                    float fIntBitsToFloat5 = Float.intBitsToFloat(i9) + f12;
                                    float fIntBitsToFloat6 = Float.intBitsToFloat(i13) + f10;
                                    float fIntBitsToFloat7 = f3 - Float.intBitsToFloat(i10);
                                    float fIntBitsToFloat8 = Float.intBitsToFloat(i15) + f10;
                                    float fIntBitsToFloat9 = f3 - Float.intBitsToFloat(i12);
                                    float fIntBitsToFloat10 = f11 - Float.intBitsToFloat(i16);
                                    float fIntBitsToFloat11 = f11 - Float.intBitsToFloat(i14);
                                    float fIntBitsToFloat12 = Float.intBitsToFloat(i11) + f12;
                                    zM10602r = (fIntBitsToFloat >= fIntBitsToFloat5 || fIntBitsToFloat2 >= fIntBitsToFloat6) ? (fIntBitsToFloat >= fIntBitsToFloat12 || fIntBitsToFloat2 <= fIntBitsToFloat11) ? (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 >= fIntBitsToFloat8) ? (fIntBitsToFloat <= fIntBitsToFloat9 || fIntBitsToFloat2 <= fIntBitsToFloat10) ? z10 : AbstractC5883g0.m10602r(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat9, fIntBitsToFloat10, c0809d.f2426g) : AbstractC5883g0.m10602r(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, c0809d.f2425f) : AbstractC5883g0.m10602r(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat12, fIntBitsToFloat11, c0809d.f2427h) : AbstractC5883g0.m10602r(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, c0809d.f2424e);
                                } else {
                                    C1009j c1009jM2609a = AbstractC1013l.m2609a();
                                    C1009j.m2601c(c1009jM2609a, c0809d);
                                    zM10602r = AbstractC5883g0.m10601q(fIntBitsToFloat, fIntBitsToFloat2, c1009jM2609a);
                                }
                            }
                        }
                    }
                }
            } else {
                z9 = false;
                z10 = true;
                if (!(abstractC0996c0M4676d instanceof C1010j0)) {
                    C3193a.m6822k();
                    return false;
                }
                zM10602r = AbstractC5883g0.m10601q(fIntBitsToFloat, fIntBitsToFloat2, ((C1010j0) abstractC0996c0M4676d).f3195f);
            }
            zM10602r = z9;
        } else {
            z9 = false;
            z10 = true;
        }
        return zM10602r ? z10 : z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: W */
    public final long mo8861W(InterfaceC4428t interfaceC4428t, long j3) {
        if (interfaceC4428t instanceof C4406l0) {
            C4406l0 c4406l0 = (C4406l0) interfaceC4428t;
            c4406l0.f14675g.f22932u.m10069A1();
            return c4406l0.mo8861W(this, j3 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        AbstractC5614i1 abstractC5614i1M10068M1 = m10068M1(interfaceC4428t);
        abstractC5614i1M10068M1.m10069A1();
        AbstractC5614i1 abstractC5614i1M10102n1 = m10102n1(abstractC5614i1M10068M1);
        while (abstractC5614i1M10068M1 != abstractC5614i1M10102n1) {
            InterfaceC5638q1 interfaceC5638q1 = abstractC5614i1M10068M1.f22866R;
            if (interfaceC5638q1 != null) {
                C5916o1 c5916o1 = (C5916o1) interfaceC5638q1;
                float[] fArrM10624b = c5916o1.m10624b();
                if (!c5916o1.f24024y) {
                    j3 = C1008i0.m2594b(j3, fArrM10624b);
                }
            }
            j3 = AbstractC2043a.m5012R(j3, abstractC5614i1M10068M1.f22854F);
            abstractC5614i1M10068M1 = abstractC5614i1M10068M1.f22870w;
            abstractC5614i1M10068M1.getClass();
        }
        return m10096h1(abstractC5614i1M10102n1, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:27:0x0055 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x0064 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x001e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:46:0x001e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x005e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // p308v1.AbstractC4377b1, p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: X */
    public final Object mo8824X() {
        C5602f0 c5602f0 = this.f22868u;
        if (!c5602f0.f22778L.m9982d(64)) {
            return null;
        }
        mo10106r1();
        Object objMo6926R = null;
        for (AbstractC5852n abstractC5852n = c5602f0.f22778L.f22718e; abstractC5852n != null; abstractC5852n = abstractC5852n.f23792k) {
            if ((abstractC5852n.f23790i & 64) != 0) {
                ?? M10149e = abstractC5852n;
                ?? c2046b = 0;
                while (M10149e != 0) {
                    if (M10149e instanceof InterfaceC5650u1) {
                        objMo6926R = ((InterfaceC5650u1) M10149e).mo6926R(c5602f0.f22771E, objMo6926R);
                    } else if ((M10149e.f23790i & 64) != 0 && (M10149e instanceof AbstractC5615j)) {
                        AbstractC5852n abstractC5852n2 = ((AbstractC5615j) M10149e).f22875v;
                        int i9 = 0;
                        M10149e = M10149e;
                        c2046b = c2046b;
                        while (abstractC5852n2 != null) {
                            if ((abstractC5852n2.f23790i & 64) != 0) {
                                i9++;
                                c2046b = c2046b;
                                if (i9 == 1) {
                                    M10149e = abstractC5852n2;
                                } else {
                                    if (c2046b == 0) {
                                        c2046b = new C2046b(new AbstractC5852n[16]);
                                    }
                                    if (M10149e != 0) {
                                        c2046b.m5056b(M10149e);
                                        M10149e = 0;
                                    }
                                    c2046b.m5056b(abstractC5852n2);
                                }
                            }
                            abstractC5852n2 = abstractC5852n2.f23793l;
                            M10149e = M10149e;
                            c2046b = c2046b;
                        }
                        if (i9 == 1) {
                        }
                    }
                    M10149e = AbstractC5618k.m10149e(c2046b);
                }
            }
        }
        return objMo6926R;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5628n0
    /* JADX INFO: renamed from: X0 */
    public final boolean mo10089X0() {
        return this.f22852D != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5628n0
    /* JADX INFO: renamed from: Y0 */
    public final C5602f0 mo10090Y0() {
        return this.f22868u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5628n0
    /* JADX INFO: renamed from: Z0 */
    public final InterfaceC4415o0 mo10091Z0() {
        InterfaceC4415o0 interfaceC4415o0 = this.f22852D;
        if (interfaceC4415o0 != null) {
            return interfaceC4415o0;
        }
        C2104o.m5276A("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5628n0
    /* JADX INFO: renamed from: a1 */
    public final AbstractC5628n0 mo10092a1() {
        return this.f22870w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: b0 */
    public final InterfaceC4428t mo8863b0() {
        boolean z9 = mo10106r1().f23801t;
        C5602f0 c5602f0 = this.f22868u;
        if (!z9) {
            StringBuilder sb2 = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (C5602f0 c5602f0M10049u = c5602f0; c5602f0M10049u != null; c5602f0M10049u = c5602f0M10049u.m10049u()) {
                sb2.append("\n|");
                sb2.append(c5602f0M10049u);
                sb2.append(" isAttached=");
                sb2.append(c5602f0M10049u.m10010G());
                sb2.append(" modifier=");
                sb2.append(c5602f0M10049u.f22783Q);
                sb2.append(" tail=");
                sb2.append(mo10106r1());
            }
            AbstractC4229a.m8494b(sb2.toString());
        }
        m10069A1();
        return c5602f0.f22778L.f22717d.f22870w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5628n0
    /* JADX INFO: renamed from: b1 */
    public final long mo10093b1() {
        return this.f22854F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: d */
    public final float mo1333d() {
        return this.f22868u.f22771E.mo1333d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5628n0
    /* JADX INFO: renamed from: f1 */
    public final void mo10094f1() {
        C1902b c1902b = this.f22867S;
        long j3 = this.f22854F;
        if (c1902b != null) {
            mo8821B0(j3, this.f22855G, c1902b);
        } else {
            mo8820A0(j3, this.f22855G, this.f22873z);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: g0 */
    public final void mo8864g0(InterfaceC4428t interfaceC4428t, float[] fArr) {
        AbstractC5614i1 abstractC5614i1M10068M1 = m10068M1(interfaceC4428t);
        abstractC5614i1M10068M1.m10069A1();
        AbstractC5614i1 abstractC5614i1M10102n1 = m10102n1(abstractC5614i1M10068M1);
        C1008i0.m2596d(fArr);
        abstractC5614i1M10068M1.m10083P1(abstractC5614i1M10102n1, fArr);
        m10082O1(abstractC5614i1M10102n1, fArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g1 */
    public final void m10095g1(AbstractC5614i1 abstractC5614i1, C0806a c0806a, boolean z9) {
        if (abstractC5614i1 == this) {
            return;
        }
        AbstractC5614i1 abstractC5614i12 = this.f22870w;
        if (abstractC5614i12 != null) {
            abstractC5614i12.m10095g1(abstractC5614i1, c0806a, z9);
        }
        long j3 = this.f22854F;
        float f3 = (int) (j3 >> 32);
        c0806a.f2410a -= f3;
        c0806a.f2412c -= f3;
        float f10 = (int) (j3 & 4294967295L);
        c0806a.f2411b -= f10;
        c0806a.f2413d -= f10;
        InterfaceC5638q1 interfaceC5638q1 = this.f22866R;
        if (interfaceC5638q1 != null) {
            C5916o1 c5916o1 = (C5916o1) interfaceC5638q1;
            float[] fArrM10623a = c5916o1.m10623a();
            if (!c5916o1.f24024y) {
                if (fArrM10623a == null) {
                    c0806a.f2410a = 0.0f;
                    c0806a.f2411b = 0.0f;
                    c0806a.f2412c = 0.0f;
                    c0806a.f2413d = 0.0f;
                } else {
                    C1008i0.m2595c(fArrM10623a, c0806a);
                }
            }
            if (this.f22872y && z9) {
                long j4 = this.f14595i;
                c0806a.m2035a(0.0f, 0.0f, (int) (j4 >> 32), (int) (j4 & 4294967295L));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4414o
    public final EnumC4243m getLayoutDirection() {
        return this.f22868u.f22772F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h1 */
    public final long m10096h1(AbstractC5614i1 abstractC5614i1, long j3) {
        if (abstractC5614i1 == this) {
            return j3;
        }
        AbstractC5614i1 abstractC5614i12 = this.f22870w;
        return (abstractC5614i12 == null || AbstractC1416l.m3825a(abstractC5614i1, abstractC5614i12)) ? m10103o1(j3) : m10103o1(abstractC5614i12.m10096h1(abstractC5614i1, j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i1 */
    public final long m10097i1(long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) - mo8826w0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) - mo8825r0();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: j0 */
    public final long mo8865j0(long j3) {
        if (!mo10106r1().f23801t) {
            AbstractC4229a.m8494b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return mo8861W(AbstractC4434w.m8884h(this), ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(this.f22868u)).m10651J(j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j1 */
    public final float m10098j1(long j3, long j4) {
        if (mo8826w0() >= Float.intBitsToFloat((int) (j4 >> 32)) && mo8825r0() >= Float.intBitsToFloat((int) (j4 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jM10097i1 = m10097i1(j4);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM10097i1 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM10097i1 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - mo8826w0());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - mo8825r0()))) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i9 = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i9) <= fIntBitsToFloat) {
                int i10 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i10) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i9);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i10);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: k0 */
    public final C0808c mo8866k0(InterfaceC4428t interfaceC4428t, boolean z9) {
        if (!mo10106r1().f23801t) {
            AbstractC4229a.m8494b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!interfaceC4428t.mo8856C()) {
            AbstractC4229a.m8494b("LayoutCoordinates " + interfaceC4428t + " is not attached!");
        }
        AbstractC5614i1 abstractC5614i1M10068M1 = m10068M1(interfaceC4428t);
        abstractC5614i1M10068M1.m10069A1();
        AbstractC5614i1 abstractC5614i1M10102n1 = m10102n1(abstractC5614i1M10068M1);
        C0806a c0806a = this.f22856H;
        if (c0806a == null) {
            c0806a = new C0806a();
            this.f22856H = c0806a;
        }
        c0806a.f2410a = 0.0f;
        c0806a.f2411b = 0.0f;
        c0806a.f2412c = (int) (interfaceC4428t.mo8858F() >> 32);
        c0806a.f2413d = (int) (interfaceC4428t.mo8858F() & 4294967295L);
        while (abstractC5614i1M10068M1 != abstractC5614i1M10102n1) {
            abstractC5614i1M10068M1.m10077I1(c0806a, z9, false);
            if (c0806a.m2036b()) {
                return C0808c.f2415e;
            }
            abstractC5614i1M10068M1 = abstractC5614i1M10068M1.f22870w;
            abstractC5614i1M10068M1.getClass();
        }
        m10095g1(abstractC5614i1M10102n1, c0806a, z9);
        return new C0808c(c0806a.f2410a, c0806a.f2411b, c0806a.f2412c, c0806a.f2413d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k1 */
    public final void m10099k1(InterfaceC1031u interfaceC1031u, C1902b c1902b) {
        InterfaceC5638q1 interfaceC5638q1 = this.f22866R;
        if (interfaceC5638q1 == null) {
            long j3 = this.f22854F;
            float f3 = (int) (j3 >> 32);
            float f10 = (int) (j3 & 4294967295L);
            interfaceC1031u.mo2494m(f3, f10);
            m10100l1(interfaceC1031u, c1902b);
            interfaceC1031u.mo2494m(-f3, -f10);
            return;
        }
        C5916o1 c5916o1 = (C5916o1) interfaceC5638q1;
        C1565b c1565b = c5916o1.f24018s;
        c5916o1.m10629g();
        c5916o1.f24025z = c5916o1.f24006g.f6340a.mo4694M() > 0.0f;
        C0184c c0184c = c1565b.f5220h;
        c0184c.m798P(interfaceC1031u);
        c0184c.f470b = c1902b;
        AbstractC3165h.m6794u(c1565b, c5916o1.f24006g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l1 */
    public final void m10100l1(InterfaceC1031u interfaceC1031u, C1902b c1902b) {
        InterfaceC1031u interfaceC1031u2;
        C1902b c1902b2;
        AbstractC5852n abstractC5852nM10107s1 = m10107s1(4);
        if (abstractC5852nM10107s1 == null) {
            mo10075G1(interfaceC1031u, c1902b);
            return;
        }
        C5602f0 c5602f0 = this.f22868u;
        c5602f0.getClass();
        C5610h0 sharedDrawScope = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(c5602f0)).getSharedDrawScope();
        long jM7908q0 = AbstractC3754e0.m7908q0(this.f14595i);
        sharedDrawScope.getClass();
        C2046b c2046b = null;
        while (abstractC5852nM10107s1 != null) {
            if (abstractC5852nM10107s1 instanceof InterfaceC5624m) {
                interfaceC1031u2 = interfaceC1031u;
                c1902b2 = c1902b;
                sharedDrawScope.m10065j(interfaceC1031u2, jM7908q0, this, (InterfaceC5624m) abstractC5852nM10107s1, c1902b2);
            } else {
                interfaceC1031u2 = interfaceC1031u;
                c1902b2 = c1902b;
                if ((abstractC5852nM10107s1.f23790i & 4) != 0 && (abstractC5852nM10107s1 instanceof AbstractC5615j)) {
                    int i9 = 0;
                    for (AbstractC5852n abstractC5852n = ((AbstractC5615j) abstractC5852nM10107s1).f22875v; abstractC5852n != null; abstractC5852n = abstractC5852n.f23793l) {
                        if ((abstractC5852n.f23790i & 4) != 0) {
                            i9++;
                            if (i9 == 1) {
                                abstractC5852nM10107s1 = abstractC5852n;
                            } else {
                                if (c2046b == null) {
                                    c2046b = new C2046b(new AbstractC5852n[16]);
                                }
                                if (abstractC5852nM10107s1 != null) {
                                    c2046b.m5056b(abstractC5852nM10107s1);
                                    abstractC5852nM10107s1 = null;
                                }
                                c2046b.m5056b(abstractC5852n);
                            }
                        }
                    }
                    if (i9 == 1) {
                    }
                }
                interfaceC1031u = interfaceC1031u2;
                c1902b = c1902b2;
            }
            abstractC5852nM10107s1 = AbstractC5618k.m10149e(c2046b);
            interfaceC1031u = interfaceC1031u2;
            c1902b = c1902b2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: m */
    public final long mo8867m(long j3) {
        long jMo8868m0 = mo8868m0(j3);
        ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = (ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(this.f22868u);
        viewTreeObserverOnGlobalLayoutListenerC5934t.m10647F();
        return C1008i0.m2594b(jMo8868m0, viewTreeObserverOnGlobalLayoutListenerC5934t.f24117j0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: m0 */
    public final long mo8868m0(long j3) {
        if (!mo10106r1().f23801t) {
            AbstractC4229a.m8494b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m10069A1();
        for (AbstractC5614i1 abstractC5614i1 = this; abstractC5614i1 != null; abstractC5614i1 = abstractC5614i1.f22870w) {
            C5602f0 c5602f0 = abstractC5614i1.f22868u;
            if (abstractC5614i1 == c5602f0.f22778L.f22717d && !c5602f0.f22792i) {
                long jM3435b = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(c5602f0)).getRectManager().m3435b(c5602f0);
                if (!C4240j.m8528b(jM3435b, 9223372034707292159L)) {
                    return AbstractC2043a.m5012R(j3, jM3435b);
                }
            }
            InterfaceC5638q1 interfaceC5638q1 = abstractC5614i1.f22866R;
            if (interfaceC5638q1 != null) {
                C5916o1 c5916o1 = (C5916o1) interfaceC5638q1;
                float[] fArrM10624b = c5916o1.m10624b();
                if (!c5916o1.f24024y) {
                    j3 = C1008i0.m2594b(j3, fArrM10624b);
                }
            }
            j3 = AbstractC2043a.m5012R(j3, abstractC5614i1.f22854F);
        }
        return j3;
    }

    /* JADX INFO: renamed from: m1 */
    public abstract void mo10101m1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n1 */
    public final AbstractC5614i1 m10102n1(AbstractC5614i1 abstractC5614i1) {
        C5602f0 c5602f0M10049u = abstractC5614i1.f22868u;
        C5602f0 c5602f0 = this.f22868u;
        if (c5602f0M10049u == c5602f0) {
            AbstractC5852n abstractC5852nMo10106r1 = abstractC5614i1.mo10106r1();
            AbstractC5852n abstractC5852nMo10106r12 = mo10106r1();
            if (!abstractC5852nMo10106r12.f23788g.f23801t) {
                AbstractC4229a.m8494b("visitLocalAncestors called on an unattached node");
            }
            for (AbstractC5852n abstractC5852n = abstractC5852nMo10106r12.f23788g.f23792k; abstractC5852n != null; abstractC5852n = abstractC5852n.f23792k) {
                if ((abstractC5852n.f23790i & 2) != 0 && abstractC5852n == abstractC5852nMo10106r1) {
                    return abstractC5614i1;
                }
            }
            return this;
        }
        while (c5602f0M10049u.f22805v > c5602f0.f22805v) {
            c5602f0M10049u = c5602f0M10049u.m10049u();
            c5602f0M10049u.getClass();
        }
        C5602f0 c5602f0M10049u2 = c5602f0;
        while (c5602f0M10049u2.f22805v > c5602f0M10049u.f22805v) {
            c5602f0M10049u2 = c5602f0M10049u2.m10049u();
            c5602f0M10049u2.getClass();
        }
        while (c5602f0M10049u != c5602f0M10049u2) {
            c5602f0M10049u = c5602f0M10049u.m10049u();
            c5602f0M10049u2 = c5602f0M10049u2.m10049u();
            if (c5602f0M10049u == null || c5602f0M10049u2 == null) {
                C2104o.m5294t("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (c5602f0M10049u2 != c5602f0) {
            if (c5602f0M10049u != abstractC5614i1.f22868u) {
                return c5602f0M10049u.f22778L.f22716c;
            }
            return abstractC5614i1;
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o1 */
    public final long m10103o1(long j3) {
        long j4 = this.f22854F;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) - ((int) (j4 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 >> 32)) - ((int) (j4 >> 32)))) << 32);
        InterfaceC5638q1 interfaceC5638q1 = this.f22866R;
        if (interfaceC5638q1 == null) {
            return jFloatToRawIntBits;
        }
        C5916o1 c5916o1 = (C5916o1) interfaceC5638q1;
        float[] fArrM10623a = c5916o1.m10623a();
        if (fArrM10623a == null) {
            return 9187343241974906880L;
        }
        return c5916o1.f24024y ? jFloatToRawIntBits : C1008i0.m2594b(jFloatToRawIntBits, fArrM10623a);
    }

    /* JADX INFO: renamed from: p1 */
    public abstract AbstractC5631o0 mo10104p1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: q0 */
    public final float mo1335q0() {
        return this.f22868u.f22771E.mo1335q0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q1 */
    public final long m10105q1() {
        return this.f22849A.mo1593L0(this.f22868u.f22773G.mo10227d());
    }

    /* JADX INFO: renamed from: r1 */
    public abstract AbstractC5852n mo10106r1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s1 */
    public final AbstractC5852n m10107s1(int i9) {
        boolean zM10141g = AbstractC5617j1.m10141g(i9);
        AbstractC5852n abstractC5852nMo10106r1 = mo10106r1();
        if (!zM10141g && (abstractC5852nMo10106r1 = abstractC5852nMo10106r1.f23792k) == null) {
            return null;
        }
        for (AbstractC5852n abstractC5852nM10108t1 = m10108t1(zM10141g); abstractC5852nM10108t1 != null && (abstractC5852nM10108t1.f23791j & i9) != 0; abstractC5852nM10108t1 = abstractC5852nM10108t1.f23793l) {
            if ((abstractC5852nM10108t1.f23790i & i9) != 0) {
                return abstractC5852nM10108t1;
            }
            if (abstractC5852nM10108t1 == abstractC5852nMo10106r1) {
                return null;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t1 */
    public final AbstractC5852n m10108t1(boolean z9) {
        AbstractC5852n abstractC5852nMo10106r1;
        C5587b1 c5587b1 = this.f22868u.f22778L;
        if (c5587b1.f22717d == this) {
            return c5587b1.f22719f;
        }
        AbstractC5614i1 abstractC5614i1 = this.f22870w;
        if (!z9) {
            if (abstractC5614i1 != null) {
                return abstractC5614i1.mo10106r1();
            }
            return null;
        }
        if (abstractC5614i1 == null || (abstractC5852nMo10106r1 = abstractC5614i1.mo10106r1()) == null) {
            return null;
        }
        return abstractC5852nMo10106r1.f23793l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u1 */
    public final void m10109u1(AbstractC5852n abstractC5852n, InterfaceC5599e1 interfaceC5599e1, long j3, C5633p c5633p, int i9, boolean z9) {
        if (abstractC5852n == null) {
            mo10112x1(interfaceC5599e1, j3, c5633p, i9, z9);
            return;
        }
        if (!interfaceC5599e1.mo9993b(abstractC5852n)) {
            m10109u1(AbstractC5618k.m10148d(abstractC5852n, interfaceC5599e1.mo9986a()), interfaceC5599e1, j3, c5633p, i9, z9);
            return;
        }
        int i10 = c5633p.f22942i;
        C0933f0 c0933f0 = c5633p.f22940g;
        c5633p.m10186c(i10 + 1, c0933f0.f2924b);
        c5633p.f22942i++;
        c0933f0.m2286a(abstractC5852n);
        c5633p.f22941h.m2386a(AbstractC5618k.m10145a(-1.0f, z9, false));
        m10109u1(AbstractC5618k.m10148d(abstractC5852n, interfaceC5599e1.mo9986a()), interfaceC5599e1, j3, c5633p, i9, z9);
        c5633p.f22942i = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v1 */
    public final void m10110v1(AbstractC5852n abstractC5852n, InterfaceC5599e1 interfaceC5599e1, long j3, C5633p c5633p, int i9, boolean z9, float f3) {
        if (abstractC5852n == null) {
            mo10112x1(interfaceC5599e1, j3, c5633p, i9, z9);
            return;
        }
        if (!interfaceC5599e1.mo9993b(abstractC5852n)) {
            m10110v1(AbstractC5618k.m10148d(abstractC5852n, interfaceC5599e1.mo9986a()), interfaceC5599e1, j3, c5633p, i9, z9, f3);
            return;
        }
        int i10 = c5633p.f22942i;
        C0933f0 c0933f0 = c5633p.f22940g;
        c5633p.m10186c(i10 + 1, c0933f0.f2924b);
        c5633p.f22942i++;
        c0933f0.m2286a(abstractC5852n);
        c5633p.f22941h.m2386a(AbstractC5618k.m10145a(f3, z9, false));
        m10074F1(AbstractC5618k.m10148d(abstractC5852n, interfaceC5599e1.mo9986a()), interfaceC5599e1, j3, c5633p, i9, z9, f3, true);
        c5633p.f22942i = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: w */
    public final long mo8869w(InterfaceC4428t interfaceC4428t, long j3) {
        return mo8861W(interfaceC4428t, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w1 */
    public final void m10111w1(InterfaceC5599e1 interfaceC5599e1, long j3, C5633p c5633p, int i9, boolean z9) {
        boolean z10;
        boolean z11;
        AbstractC5852n abstractC5852nM10107s1 = m10107s1(interfaceC5599e1.mo9986a());
        if (!m10087S1(j3)) {
            if (i9 == 1) {
                float fM10098j1 = m10098j1(j3, m10105q1());
                if ((Float.floatToRawIntBits(fM10098j1) & Integer.MAX_VALUE) < 2139095040) {
                    if (c5633p.f22942i != c5633p.f22940g.f2924b - 1) {
                        if (AbstractC5618k.m10151g(c5633p.m10185a(), AbstractC5618k.m10145a(fM10098j1, false, false)) <= 0) {
                            return;
                        }
                    }
                    m10110v1(abstractC5852nM10107s1, interfaceC5599e1, j3, c5633p, i9, false, fM10098j1);
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC5852nM10107s1 == null) {
            mo10112x1(interfaceC5599e1, j3, c5633p, i9, z9);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < mo8826w0() && fIntBitsToFloat2 < mo8825r0()) {
            m10109u1(abstractC5852nM10107s1, interfaceC5599e1, j3, c5633p, i9, z9);
            return;
        }
        float fM10098j12 = i9 == 1 ? m10098j1(j3, m10105q1()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fM10098j12) & Integer.MAX_VALUE) < 2139095040) {
            if (c5633p.f22942i != c5633p.f22940g.f2924b - 1) {
                z10 = z9;
                if (AbstractC5618k.m10151g(c5633p.m10185a(), AbstractC5618k.m10145a(fM10098j12, z10, false)) > 0) {
                }
                m10074F1(abstractC5852nM10107s1, interfaceC5599e1, j3, c5633p, i9, z10, fM10098j12, z11);
            }
            z10 = z9;
            z11 = true;
            m10074F1(abstractC5852nM10107s1, interfaceC5599e1, j3, c5633p, i9, z10, fM10098j12, z11);
        }
        z10 = z9;
        z11 = false;
        m10074F1(abstractC5852nM10107s1, interfaceC5599e1, j3, c5633p, i9, z10, fM10098j12, z11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x1 */
    public void mo10112x1(InterfaceC5599e1 interfaceC5599e1, long j3, C5633p c5633p, int i9, boolean z9) {
        AbstractC5614i1 abstractC5614i1 = this.f22869v;
        if (abstractC5614i1 != null) {
            abstractC5614i1.m10111w1(interfaceC5599e1, abstractC5614i1.m10103o1(j3), c5633p, i9, z9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y1 */
    public final void m10113y1() {
        InterfaceC5638q1 interfaceC5638q1 = this.f22866R;
        if (interfaceC5638q1 != null) {
            ((C5916o1) interfaceC5638q1).m10625c();
            return;
        }
        AbstractC5614i1 abstractC5614i1 = this.f22870w;
        if (abstractC5614i1 != null) {
            abstractC5614i1.m10113y1();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z1 */
    public final boolean m10114z1() {
        if (this.f22866R != null && this.f22851C <= 0.0f) {
            return true;
        }
        AbstractC5614i1 abstractC5614i1 = this.f22870w;
        if (abstractC5614i1 != null) {
            return abstractC5614i1.m10114z1();
        }
        return false;
    }

    @Override // p339x1.AbstractC5628n0
    /* JADX INFO: renamed from: T0 */
    public final InterfaceC4428t mo10088T0() {
        return this;
    }
}
