package p007B0;

import androidx.compose.p134ui.input.pointer.PointerInputEventHandler;
import com.bumptech.glide.AbstractC1923e;
import java.util.ArrayList;
import p000A.C0098y0;
import p027E4.C0330q;
import p041H0.AbstractC0601k;
import p041H0.InterfaceC0624v0;
import p056K2.C0891q;
import p074O2.C1053k;
import p074O2.InterfaceC1046d;
import p105V.C1483e;
import p112W2.InterfaceC1603e;
import p153e1.InterfaceC2007c;
import p160f3.AbstractC2162v;
import p160f3.C2135g;
import p160f3.C2136g0;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: B0.T */
/* JADX INFO: loaded from: classes.dex */
public final class C0186T extends AbstractC2206o implements InterfaceC0169B, InterfaceC2007c, InterfaceC0624v0 {

    /* JADX INFO: renamed from: A */
    public C0200n f646A;

    /* JADX INFO: renamed from: B */
    public long f647B;

    /* JADX INFO: renamed from: r */
    public Object f648r;

    /* JADX INFO: renamed from: s */
    public Object f649s;

    /* JADX INFO: renamed from: t */
    public Object[] f650t;

    /* JADX INFO: renamed from: u */
    public PointerInputEventHandler f651u;

    /* JADX INFO: renamed from: v */
    public C2136g0 f652v;

    /* JADX INFO: renamed from: w */
    public C0200n f653w = AbstractC0181N.f628a;

    /* JADX INFO: renamed from: x */
    public final C1483e f654x;

    /* JADX INFO: renamed from: y */
    public final C1483e f655y;

    /* JADX INFO: renamed from: z */
    public final C1483e f656z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0186T(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.f648r = obj;
        this.f649s = obj2;
        this.f650t = objArr;
        this.f651u = pointerInputEventHandler;
        C1483e c1483e = new C1483e(new C0185S[16]);
        this.f654x = c1483e;
        this.f655y = c1483e;
        this.f656z = new C1483e(new C0185S[16]);
        this.f647B = 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: C0 */
    public final void mo144C0() {
        m288L0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public final Object m285J0(InterfaceC1603e interfaceC1603e, InterfaceC1046d interfaceC1046d) {
        C2135g c2135g = new C2135g(1, AbstractC1923e.m3448G(interfaceC1046d));
        c2135g.m3968t();
        C0185S c0185s = new C0185S(this, c2135g);
        synchronized (this.f655y) {
            this.f654x.m2753b(c0185s);
            new C1053k(AbstractC1923e.m3448G(AbstractC1923e.m3479q(c0185s, c0185s, interfaceC1603e))).mo278i(C0891q.f2780a);
        }
        c2135g.m3970w(new C0172E(1, c0185s));
        return c2135g.m3967r();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p041H0.InterfaceC0624v0
    /* JADX INFO: renamed from: K */
    public final void mo286K(C0200n c0200n, EnumC0201o enumC0201o, long j5) {
        this.f647B = j5;
        if (enumC0201o == EnumC0201o.f702d) {
            this.f653w = c0200n;
        }
        InterfaceC1046d interfaceC1046d = null;
        if (this.f652v == null) {
            this.f652v = AbstractC2162v.m3994p(m4023x0(), null, new C0098y0(this, interfaceC1046d, 1), 1);
        }
        m287K0(c0200n, enumC0201o);
        ?? r4 = c0200n.f696a;
        int size = r4.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                c0200n = null;
                break;
            } else if (!AbstractC0208v.m314d((C0209w) r4.get(i5))) {
                break;
            } else {
                i5++;
            }
        }
        this.f646A = c0200n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    /* JADX INFO: renamed from: K0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m287K0(C0200n c0200n, EnumC0201o enumC0201o) {
        int i5;
        int i6;
        C2135g c2135g;
        C2135g c2135g2;
        synchronized (this.f655y) {
            C1483e c1483e = this.f656z;
            c1483e.m2754c(c1483e.f5183f, this.f654x);
        }
        try {
            int iOrdinal = enumC0201o.ordinal();
            if (iOrdinal == 0) {
                C1483e c1483e2 = this.f656z;
                Object[] objArr = c1483e2.f5181d;
                i5 = c1483e2.f5183f;
                for (i6 = 0; i6 < i5; i6++) {
                    C0185S c0185s = (C0185S) objArr[i6];
                    if (enumC0201o == c0185s.f643g && (c2135g = c0185s.f642f) != null) {
                        c0185s.f642f = null;
                        c2135g.mo278i(c0200n);
                    }
                }
            } else if (iOrdinal == 1) {
                C1483e c1483e3 = this.f656z;
                int i7 = c1483e3.f5183f - 1;
                Object[] objArr2 = c1483e3.f5181d;
                if (i7 < objArr2.length) {
                    while (i7 >= 0) {
                        C0185S c0185s2 = (C0185S) objArr2[i7];
                        if (enumC0201o == c0185s2.f643g && (c2135g2 = c0185s2.f642f) != null) {
                            c0185s2.f642f = null;
                            c2135g2.mo278i(c0200n);
                        }
                        i7--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new C0330q();
                }
                C1483e c1483e22 = this.f656z;
                Object[] objArr3 = c1483e22.f5181d;
                i5 = c1483e22.f5183f;
                while (i6 < i5) {
                }
            }
            this.f656z.m2758g();
        } catch (Throwable th) {
            this.f656z.m2758g();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L0 */
    public final void m288L0() {
        C2136g0 c2136g0 = this.f652v;
        if (c2136g0 != null) {
            c2136g0.mo3946z(new C0168A("Pointer input was reset", 0));
            this.f652v = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0597i, p041H0.InterfaceC0624v0
    /* JADX INFO: renamed from: a */
    public final void mo289a() {
        m288L0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: b */
    public final float mo272b() {
        return AbstractC0601k.m1044t(this).f1692C.mo272b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0624v0
    /* JADX INFO: renamed from: d0 */
    public final void mo290d0() {
        m288L0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p041H0.InterfaceC0624v0
    /* JADX INFO: renamed from: g0 */
    public final void mo291g0() {
        C0200n c0200n = this.f646A;
        if (c0200n == null) {
            return;
        }
        ?? r12 = c0200n.f696a;
        int size = r12.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (((C0209w) r12.get(i5)).f714d) {
                ArrayList arrayList = new ArrayList(r12.size());
                int size2 = r12.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    C0209w c0209w = (C0209w) r12.get(i6);
                    long j5 = c0209w.f711a;
                    long j6 = c0209w.f713c;
                    long j7 = c0209w.f712b;
                    float f2 = c0209w.f715e;
                    boolean z5 = c0209w.f714d;
                    arrayList.add(new C0209w(j5, j7, j6, false, f2, j7, j6, z5, z5, c0209w.f719i, 0L));
                }
                C0200n c0200n2 = new C0200n(arrayList, null);
                this.f653w = c0200n2;
                m287K0(c0200n2, EnumC0201o.f702d);
                m287K0(c0200n2, EnumC0201o.f703e);
                m287K0(c0200n2, EnumC0201o.f704f);
                this.f646A = null;
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: p */
    public final float mo282p() {
        return AbstractC0601k.m1044t(this).f1692C.mo282p();
    }
}
