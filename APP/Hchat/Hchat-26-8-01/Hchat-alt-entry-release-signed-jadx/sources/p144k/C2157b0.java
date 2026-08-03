package p144k;

import ac.AbstractC0063p;
import ac.C0058k;
import android.view.KeyEvent;
import java.util.ArrayList;
import p057e1.C0807b;
import p069f.AbstractC0948n;
import p069f.C0968z;
import p072f2.InterfaceC1062y;
import p085fg.InterfaceC1220a;
import p174m.AbstractC2677y2;
import p187n.C2857k;
import p224p1.C3287b;
import p236q1.AbstractC3424d;
import p249qg.C3560e1;
import p249qg.InterfaceC3596r0;
import p267s1.AbstractC3913s;
import p267s1.C3903k;
import p267s1.C3906l0;
import p267s1.C3914t;
import p267s1.EnumC3905l;
import p339x1.AbstractC5618k;
import p357y1.AbstractC5888h1;
import p357y1.InterfaceC5905l2;

/* JADX INFO: renamed from: k.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2157b0 extends AbstractC2171g {

    /* JADX INFO: renamed from: R */
    public final C0968z f7127R;

    /* JADX INFO: renamed from: S */
    public final C0968z f7128S;

    /* JADX INFO: renamed from: T */
    public C3914t f7129T;

    /* JADX INFO: renamed from: U */
    public C3560e1 f7130U;

    /* JADX INFO: renamed from: V */
    public C3560e1 f7131V;

    /* JADX INFO: renamed from: W */
    public boolean f7132W;

    /* JADX INFO: renamed from: X */
    public boolean f7133X;

    /* JADX INFO: renamed from: Y */
    public long f7134Y;

    /* JADX INFO: renamed from: Z */
    public boolean f7135Z;

    /* JADX INFO: renamed from: a0 */
    public C3287b f7136a0;

    /* JADX INFO: renamed from: b0 */
    public C3560e1 f7137b0;

    /* JADX INFO: renamed from: c0 */
    public C3560e1 f7138c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f7139d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f7140e0;

    /* JADX INFO: renamed from: f0 */
    public long f7141f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f7142g0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2157b0(InterfaceC1220a interfaceC1220a, C2857k c2857k) {
        super(c2857k, null, false, true, null, null, interfaceC1220a);
        int i9 = AbstractC0948n.f2993a;
        this.f7127R = new C0968z(6);
        this.f7128S = new C0968z(6);
        this.f7134Y = -1L;
        this.f7141f0 = -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A1 */
    public final void m5373A1(boolean z9) {
        if (z9) {
            this.f7136a0 = null;
            C3560e1 c3560e1 = this.f7137b0;
            if (c3560e1 != null) {
                c3560e1.mo7485a(null);
            }
            this.f7137b0 = null;
            C3560e1 c3560e12 = this.f7138c0;
            if (c3560e12 != null) {
                c3560e12.mo7485a(null);
            }
            this.f7138c0 = null;
            this.f7139d0 = false;
            this.f7140e0 = false;
            this.f7141f0 = -1L;
            this.f7142g0 = false;
        } else {
            this.f7129T = null;
            C3560e1 c3560e13 = this.f7130U;
            if (c3560e13 != null) {
                c3560e13.mo7485a(null);
            }
            this.f7130U = null;
            C3560e1 c3560e14 = this.f7131V;
            if (c3560e14 != null) {
                c3560e14.mo7485a(null);
            }
            this.f7131V = null;
            this.f7132W = false;
            this.f7133X = false;
            this.f7134Y = -1L;
            this.f7135Z = false;
        }
        m5393r1(z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B1 */
    public final void m5374B1(long j3, C3287b c3287b) {
        if (this.f7190B && !this.f7142g0) {
            m5394s1(c3287b.f10452c, true);
            this.f7141f0 = j3;
            if (!this.f7140e0 && !this.f7139d0) {
                this.f7191C.invoke();
            }
        }
        this.f7136a0 = null;
        this.f7142g0 = false;
        this.f7139d0 = false;
        C3560e1 c3560e1 = this.f7137b0;
        if (c3560e1 != null) {
            c3560e1.mo7485a(null);
        }
        this.f7137b0 = null;
        this.f7140e0 = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C1 */
    public final void m5375C1(long j3, C3914t c3914t) {
        if (this.f7190B && !this.f7135Z) {
            m5394s1(c3914t.f12836c, false);
            this.f7134Y = j3;
            if (!this.f7133X && !this.f7132W) {
                this.f7191C.invoke();
            }
        }
        this.f7129T = null;
        this.f7135Z = false;
        this.f7132W = false;
        C3560e1 c3560e1 = this.f7130U;
        if (c3560e1 != null) {
            c3560e1.mo7485a(null);
        }
        this.f7130U = null;
        this.f7133X = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX INFO: renamed from: D1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5376D1() {
        char c10;
        long j3;
        long j4;
        long j5;
        char c11;
        long j10;
        C0968z c0968z = this.f7127R;
        Object[] objArr = c0968z.f3047c;
        long[] jArr = c0968z.f3045a;
        int length = jArr.length - 2;
        char c12 = 7;
        long j11 = -9187201950435737472L;
        if (length >= 0) {
            int i9 = 0;
            j4 = 128;
            while (true) {
                long j12 = jArr[i9];
                j5 = 255;
                if ((((~j12) << c12) & j12 & j11) != j11) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j12 & 255) < 128) {
                            c11 = c12;
                            j10 = j11;
                            ((InterfaceC3596r0) objArr[(i9 << 3) + i11]).mo7485a(null);
                        } else {
                            c11 = c12;
                            j10 = j11;
                        }
                        j12 >>= 8;
                        i11++;
                        c12 = c11;
                        j11 = j10;
                    }
                    c10 = c12;
                    j3 = j11;
                    if (i10 != 8) {
                        break;
                    }
                } else {
                    c10 = c12;
                    j3 = j11;
                }
                if (i9 == length) {
                    break;
                }
                i9++;
                c12 = c10;
                j11 = j3;
            }
        } else {
            c10 = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        c0968z.m2387a();
        C0968z c0968z2 = this.f7128S;
        Object[] objArr2 = c0968z2.f3047c;
        long[] jArr2 = c0968z2.f3045a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i12 = 0;
            while (true) {
                long j13 = jArr2[i12];
                if ((((~j13) << c10) & j13 & j3) != j3) {
                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j13 & j5) < j4) {
                            ((AbstractC2154a0) objArr2[(i12 << 3) + i14]).getClass();
                            throw null;
                        }
                        j13 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    } else if (i12 == length2) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        c0968z2.m2387a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, java.util.List] */
    @Override // p144k.AbstractC2171g, p339x1.InterfaceC5656w1
    /* JADX INFO: renamed from: P */
    public final void mo1608P(C3903k c3903k, EnumC3905l enumC3905l, long j3) {
        super.mo1608P(c3903k, enumC3905l, j3);
        if (enumC3905l != EnumC3905l.f12813h) {
            if (enumC3905l != EnumC3905l.f12814i || this.f7129T == null || this.f7133X) {
                return;
            }
            ?? r72 = c3903k.f12800a;
            int size = r72.size();
            for (int i9 = 0; i9 < size; i9++) {
                C3914t c3914t = (C3914t) r72.get(i9);
                if (c3914t.m8119b() && !c3914t.equals(this.f7129T)) {
                    m5373A1(false);
                    return;
                }
            }
            return;
        }
        if (this.f7129T == null) {
            if (AbstractC2677y2.m6120e(c3903k, true)) {
                C3914t c3914t2 = (C3914t) c3903k.f12800a.get(0);
                c3914t2.m8118a();
                this.f7129T = c3914t2;
                if (this.f7190B) {
                    C3560e1 c3560e1 = this.f7131V;
                    if (c3560e1 != null && c3560e1.mo7486b()) {
                        ((InterfaceC5905l2) AbstractC5618k.m10152h(this, AbstractC5888h1.f23938t)).getClass();
                        if (c3914t2.f12835b - this.f7134Y < 40) {
                            this.f7135Z = true;
                            return;
                        }
                        this.f7132W = true;
                        C3560e1 c3560e12 = this.f7131V;
                        if (c3560e12 != null) {
                            c3560e12.mo7485a(null);
                        }
                        this.f7131V = null;
                    }
                    this.f7133X = false;
                    m5396u1(c3914t2);
                    return;
                }
                return;
            }
            return;
        }
        int i10 = c3903k.f12802c;
        ?? r73 = c3903k.f12800a;
        if (this.f7133X) {
            int size2 = r73.size();
            for (int i11 = 0; i11 < size2; i11++) {
                if (!AbstractC3913s.m8111d((C3914t) r73.get(i11))) {
                    int size3 = r73.size();
                    for (int i12 = 0; i12 < size3; i12++) {
                        ((C3914t) r73.get(i12)).m8118a();
                    }
                    return;
                }
            }
            C3914t c3914t3 = (C3914t) r73.get(0);
            c3914t3.m8118a();
            long j4 = c3914t3.f12835b;
            C3914t c3914t4 = this.f7129T;
            c3914t4.getClass();
            m5375C1(j4, c3914t4);
            return;
        }
        int size4 = r73.size();
        for (int i13 = 0; i13 < size4; i13++) {
            if (!AbstractC3913s.m8110c((C3914t) r73.get(i13))) {
                long jM5392q1 = m5392q1(j3);
                int size5 = r73.size();
                for (int i14 = 0; i14 < size5; i14++) {
                    C3914t c3914t5 = (C3914t) r73.get(i14);
                    if (c3914t5.m8119b() || AbstractC3913s.m8113f(c3914t5, j3, jM5392q1)) {
                        m5373A1(false);
                        return;
                    }
                }
                return;
            }
        }
        C3914t c3914t6 = (C3914t) r73.get(0);
        c3914t6.m8118a();
        long j5 = c3914t6.f12835b;
        C3914t c3914t7 = this.f7129T;
        c3914t7.getClass();
        m5375C1(j5, c3914t7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p224p1.InterfaceC3288c
    /* JADX INFO: renamed from: T0 */
    public final void mo5377T0(C0058k c0058k, EnumC3905l enumC3905l) {
        ArrayList arrayList = (ArrayList) c0058k.f177i;
        m5397v1();
        if (this.f7190B && this.f7195G == null) {
            C2187l0 c2187l0 = new C2187l0(this);
            m10122k1(c2187l0);
            this.f7195G = c2187l0;
        }
        int i9 = 0;
        if (enumC3905l != EnumC3905l.f12813h) {
            if (enumC3905l != EnumC3905l.f12814i || this.f7136a0 == null || this.f7140e0) {
                return;
            }
            int size = arrayList.size();
            while (i9 < size) {
                C3287b c3287b = (C3287b) arrayList.get(i9);
                if (c3287b.f10458i && !c3287b.equals(this.f7136a0)) {
                    m5373A1(true);
                    return;
                }
                i9++;
            }
            return;
        }
        if (this.f7136a0 == null) {
            int size2 = arrayList.size();
            for (int i10 = 0; i10 < size2; i10++) {
                if (AbstractC0063p.m417j((C3287b) arrayList.get(i10))) {
                    C3287b c3287b2 = (C3287b) arrayList.get(0);
                    c3287b2.f10458i = true;
                    this.f7136a0 = c3287b2;
                    if (this.f7190B) {
                        C3560e1 c3560e1 = this.f7138c0;
                        if (c3560e1 != null && c3560e1.mo7486b()) {
                            ((InterfaceC5905l2) AbstractC5618k.m10152h(this, AbstractC5888h1.f23938t)).getClass();
                            if (c3287b2.f10451b - this.f7141f0 < 40) {
                                this.f7142g0 = true;
                                return;
                            }
                            this.f7139d0 = true;
                            C3560e1 c3560e12 = this.f7138c0;
                            if (c3560e12 != null) {
                                c3560e12.mo7485a(null);
                            }
                            this.f7138c0 = null;
                        }
                        this.f7140e0 = false;
                        m5395t1(c3287b2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.f7140e0) {
            int size3 = arrayList.size();
            for (int i11 = 0; i11 < size3; i11++) {
                C3287b c3287b3 = (C3287b) arrayList.get(i11);
                if (!c3287b3.f10457h || c3287b3.f10453d) {
                    int size4 = arrayList.size();
                    while (i9 < size4) {
                        ((C3287b) arrayList.get(i9)).f10458i = true;
                        i9++;
                    }
                    return;
                }
            }
            C3287b c3287b4 = (C3287b) arrayList.get(0);
            c3287b4.f10458i = true;
            long j3 = c3287b4.f10451b;
            C3287b c3287b5 = this.f7136a0;
            c3287b5.getClass();
            m5374B1(j3, c3287b5);
            return;
        }
        int size5 = arrayList.size();
        for (int i12 = 0; i12 < size5; i12++) {
            C3287b c3287b6 = (C3287b) arrayList.get(i12);
            if (c3287b6.f10458i || !c3287b6.f10457h || c3287b6.f10453d) {
                float fMo10228f = ((InterfaceC5905l2) AbstractC5618k.m10152h(this, AbstractC5888h1.f23938t)).mo10228f();
                int size6 = arrayList.size();
                for (int i13 = 0; i13 < size6; i13++) {
                    C3287b c3287b7 = (C3287b) arrayList.get(i13);
                    long j4 = c3287b7.f10452c;
                    C3287b c3287b8 = this.f7136a0;
                    c3287b8.getClass();
                    boolean z9 = Math.abs(C0807b.m2040c(C0807b.m2041d(j4, c3287b8.f10452c))) > fMo10228f;
                    if (c3287b7.f10458i || z9) {
                        m5373A1(true);
                        return;
                    }
                }
                return;
            }
        }
        C3287b c3287b9 = (C3287b) arrayList.get(0);
        c3287b9.f10458i = true;
        long j5 = c3287b9.f10451b;
        C3287b c3287b10 = this.f7136a0;
        c3287b10.getClass();
        m5374B1(j5, c3287b10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144k.AbstractC2171g, p339x1.InterfaceC5656w1
    /* JADX INFO: renamed from: b0 */
    public final void mo1611b0() {
        super.mo1611b0();
        m5373A1(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: e1 */
    public final void mo1328e1() {
        m5376D1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144k.AbstractC2171g
    /* JADX INFO: renamed from: o1 */
    public final C3906l0 mo5379o1() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144k.AbstractC2171g
    /* JADX INFO: renamed from: w1 */
    public final void mo5380w1() {
        m5376D1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144k.AbstractC2171g
    /* JADX INFO: renamed from: x1 */
    public final boolean mo5381x1(KeyEvent keyEvent) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p224p1.InterfaceC3288c
    /* JADX INFO: renamed from: y0 */
    public final void mo5382y0() {
        m5373A1(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144k.AbstractC2171g
    /* JADX INFO: renamed from: y1 */
    public final void mo5383y1(KeyEvent keyEvent) {
        long jM7198b = AbstractC3424d.m7198b(keyEvent);
        C0968z c0968z = this.f7127R;
        boolean z9 = false;
        if (c0968z.m2390d(jM7198b) != null) {
            InterfaceC3596r0 interfaceC3596r0 = (InterfaceC3596r0) c0968z.m2390d(jM7198b);
            if (interfaceC3596r0 != null) {
                if (interfaceC3596r0.mo7486b()) {
                    interfaceC3596r0.mo7485a(null);
                } else {
                    z9 = true;
                }
            }
            c0968z.m2392f(jM7198b);
        }
        if (z9) {
            return;
        }
        this.f7191C.invoke();
    }

    @Override // p144k.AbstractC2171g
    /* JADX INFO: renamed from: n1 */
    public final void mo5378n1(InterfaceC1062y interfaceC1062y) {
    }
}
