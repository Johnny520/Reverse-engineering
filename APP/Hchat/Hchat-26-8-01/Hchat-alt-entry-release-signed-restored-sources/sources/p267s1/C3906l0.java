package p267s1;

import af.C0081d;
import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import ci.C0575c;
import java.util.ArrayList;
import p016b1.C0166f;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1235p;
import p131j0.C2046b;
import p249qg.AbstractC3603v;
import p249qg.C3560e1;
import p249qg.C3564g;
import p276sf.C3967n;
import p293u2.InterfaceC4233c;
import p339x1.AbstractC5618k;
import p339x1.InterfaceC5656w1;
import p356y0.AbstractC5852n;
import wf.C5563i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: s1.l0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3906l0 extends AbstractC5852n implements InterfaceC3918x, InterfaceC4233c, InterfaceC5656w1 {

    /* JADX INFO: renamed from: A */
    public final C2046b f12816A;

    /* JADX INFO: renamed from: B */
    public final C2046b f12817B;

    /* JADX INFO: renamed from: C */
    public final C2046b f12818C;

    /* JADX INFO: renamed from: D */
    public C3903k f12819D;

    /* JADX INFO: renamed from: E */
    public long f12820E;

    /* JADX INFO: renamed from: u */
    public Object f12821u;

    /* JADX INFO: renamed from: v */
    public Object f12822v;

    /* JADX INFO: renamed from: w */
    public Object[] f12823w;

    /* JADX INFO: renamed from: x */
    public PointerInputEventHandler f12824x;

    /* JADX INFO: renamed from: y */
    public C3560e1 f12825y;

    /* JADX INFO: renamed from: z */
    public C3903k f12826z = AbstractC3898h0.f12782a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3906l0(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.f12821u = obj;
        this.f12822v = obj2;
        this.f12823w = objArr;
        this.f12824x = pointerInputEventHandler;
        C2046b c2046b = new C2046b(new C3904k0[16]);
        this.f12816A = c2046b;
        this.f12817B = c2046b;
        this.f12818C = new C2046b(new C3904k0[16]);
        this.f12820E = 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5656w1
    /* JADX INFO: renamed from: N0 */
    public final void mo8104N0() {
        m8107m1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p339x1.InterfaceC5656w1
    /* JADX INFO: renamed from: P */
    public final void mo1608P(C3903k c3903k, EnumC3905l enumC3905l, long j3) {
        this.f12820E = j3;
        if (enumC3905l == EnumC3905l.f12812g) {
            this.f12826z = c3903k;
        }
        InterfaceC5557c interfaceC5557c = null;
        if (this.f12825y == null) {
            this.f12825y = AbstractC3603v.m7563q(m10550Y0(), null, new C0575c(this, interfaceC5557c, 10), 1);
        }
        m8106l1(c3903k, enumC3905l);
        ?? r42 = c3903k.f12800a;
        int size = r42.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                c3903k = null;
                break;
            } else if (!AbstractC3913s.m8111d((C3914t) r42.get(i9))) {
                break;
            } else {
                i9++;
            }
        }
        this.f12819D = c3903k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p339x1.InterfaceC5656w1
    /* JADX INFO: renamed from: b0 */
    public final void mo1611b0() {
        C3903k c3903k = this.f12819D;
        if (c3903k == null) {
            return;
        }
        ?? r12 = c3903k.f12800a;
        int size = r12.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((C3914t) r12.get(i9)).f12837d) {
                ArrayList arrayList = new ArrayList(r12.size());
                int size2 = r12.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    C3914t c3914t = (C3914t) r12.get(i10);
                    long j3 = c3914t.f12834a;
                    long j4 = c3914t.f12836c;
                    long j5 = c3914t.f12835b;
                    float f3 = c3914t.f12838e;
                    boolean z9 = c3914t.f12837d;
                    arrayList.add(new C3914t(j3, j5, j4, false, f3, j5, j4, z9, z9, c3914t.f12842i, 0L, 1.0f, 0L));
                }
                C3903k c3903k2 = new C3903k(arrayList, null);
                this.f12826z = c3903k2;
                m8106l1(c3903k2, EnumC3905l.f12812g);
                m8106l1(c3903k2, EnumC3905l.f12813h);
                m8106l1(c3903k2, EnumC3905l.f12814i);
                this.f12819D = null;
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: d */
    public final float mo1333d() {
        return AbstractC5618k.m10167w(this).f22771E.mo1333d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: d1 */
    public final void mo743d1() {
        m8107m1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k1 */
    public final Object m8105k1(InterfaceC1235p interfaceC1235p, InterfaceC5557c interfaceC5557c) {
        C3564g c3564g = new C3564g(1, AbstractC1184v0.m3214x(interfaceC5557c));
        c3564g.m7513p();
        C3904k0 c3904k0 = new C3904k0(this, c3564g);
        synchronized (this.f12817B) {
            this.f12816A.m5056b(c3904k0);
            new C5563i(AbstractC1184v0.m3214x(AbstractC1184v0.m3200j(interfaceC1235p, c3904k0, c3904k0))).resumeWith(C3967n.f12976a);
        }
        c3564g.m7515r(new C0166f(c3904k0, 15));
        return c3564g.m7512o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    /* JADX INFO: renamed from: l1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8106l1(C3903k c3903k, EnumC3905l enumC3905l) {
        int i9;
        int i10;
        C3564g c3564g;
        C3564g c3564g2;
        synchronized (this.f12817B) {
            C2046b c2046b = this.f12818C;
            c2046b.m5057c(c2046b.f6893i, this.f12816A);
        }
        try {
            int iOrdinal = enumC3905l.ordinal();
            if (iOrdinal == 0) {
                C2046b c2046b2 = this.f12818C;
                Object[] objArr = c2046b2.f6891g;
                i9 = c2046b2.f6893i;
                for (i10 = 0; i10 < i9; i10++) {
                    C3904k0 c3904k0 = (C3904k0) objArr[i10];
                    if (enumC3905l == c3904k0.f12809j && (c3564g = c3904k0.f12808i) != null) {
                        c3904k0.f12808i = null;
                        c3564g.resumeWith(c3903k);
                    }
                }
            } else if (iOrdinal == 1) {
                C2046b c2046b3 = this.f12818C;
                int i11 = c2046b3.f6893i - 1;
                Object[] objArr2 = c2046b3.f6891g;
                if (i11 < objArr2.length) {
                    while (i11 >= 0) {
                        C3904k0 c3904k02 = (C3904k0) objArr2[i11];
                        if (enumC3905l == c3904k02.f12809j && (c3564g2 = c3904k02.f12808i) != null) {
                            c3904k02.f12808i = null;
                            c3564g2.resumeWith(c3903k);
                        }
                        i11--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new C0081d();
                }
                C2046b c2046b22 = this.f12818C;
                Object[] objArr3 = c2046b22.f6891g;
                i9 = c2046b22.f6893i;
                while (i10 < i9) {
                }
            }
            this.f12818C.m5061g();
        } catch (Throwable th2) {
            this.f12818C.m5061g();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5612i
    /* JADX INFO: renamed from: m */
    public final void mo1332m() {
        m8107m1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m1 */
    public final void m8107m1() {
        C3560e1 c3560e1 = this.f12825y;
        if (c3560e1 != null) {
            c3560e1.mo7596x(new C3917w("Pointer input was reset", 2));
            this.f12825y = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: q0 */
    public final float mo1335q0() {
        return AbstractC5618k.m10167w(this).f22771E.mo1335q0();
    }
}
