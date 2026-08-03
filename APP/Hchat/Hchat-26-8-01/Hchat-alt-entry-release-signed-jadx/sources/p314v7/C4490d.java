package p314v7;

import java.io.ByteArrayOutputStream;
import okhttp3.internal.http2.Settings;
import okio.C3193a;
import p075f6.C1075b;
import p135j7.C2087c;
import p152k7.AbstractC2331a;
import p166l7.C2518f;
import p166l7.C2522j;
import p166l7.C2525m;
import p209o7.C3069c;
import p209o7.C3076j;
import p229p7.C3341k;
import p241q7.C3445b;
import p257r7.AbstractC3721k;
import p257r7.C3715e;
import p257r7.C3726p;
import p257r7.C3727q;
import p273s7.C3933b;
import p273s7.C3934c;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: v7.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4490d extends AbstractC2331a {

    /* JADX INFO: renamed from: l */
    public static final C3193a f14845l = new C3193a(22);

    /* JADX INFO: renamed from: k */
    public AbstractC4497g0 f14846k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) {
        AbstractC4497g0 c4487b0;
        int i9 = c3445b.f11162k;
        c3445b.m7228c(2);
        boolean z9 = (c3445b.readShort() & 1) == 1;
        c3445b.m7230g(i9);
        if (z9) {
            C2087c c2087c = new C2087c();
            C4494f c4494f = new C4494f(16);
            byte[] bArr = c4494f.f12076k;
            bArr[2] = (byte) (1 | (bArr[2] & 254));
            c4487b0 = new C4489c0(c2087c, c4494f);
        } else {
            c4487b0 = new C4487b0(new C4491d0(8, 0), new C4492e(8));
        }
        m8927N(c4487b0);
        c4487b0.m5545G(c3445b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: C */
    public final int mo5544C(ByteArrayOutputStream byteArrayOutputStream) {
        if (mo5555y()) {
            return 0;
        }
        return this.f14846k.m5549K(byteArrayOutputStream);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: I */
    public final void mo5547I(boolean z9) {
        if (z9) {
            m8927N(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final int m8925L() {
        int i9 = this.f7657g;
        C3933b c3933b = (C3933b) m5554v(C3933b.class);
        if (c3933b == null) {
            return i9;
        }
        C3069c c3069c = c3933b.f12915n;
        return ((C3934c) c3069c).f9927l == AbstractC3721k.f12090p ? ((AbstractC3721k) ((C3934c) c3069c).m6524Q(i9)).mo7729N() : i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public final int m8926M() {
        C2525m c2525m = (C2525m) m5553u(C2525m.class);
        if (c2525m == null) {
            return 0;
        }
        C3076j c3076j = (C3076j) c2525m.m5553u(C3076j.class);
        C2518f c2518f = c3076j != null ? (C2518f) c3076j.m5553u(C2518f.class) : null;
        if (c2518f == null) {
            return 0;
        }
        return (((C3341k) c2525m.f8138m).f10751r.get() << 16) | (c2518f.mo5913U() << 24) | m8925L();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public final void m8927N(AbstractC4497g0 abstractC4497g0) {
        AbstractC4497g0 abstractC4497g02 = this.f14846k;
        if (abstractC4497g0 == abstractC4497g02) {
            return;
        }
        if (abstractC4497g02 != null) {
            abstractC4497g02.mo8921N();
            abstractC4497g02.m5546H(-1);
            abstractC4497g02.m5548J(null);
            this.f14846k = null;
        }
        if (abstractC4497g0 == null) {
            return;
        }
        abstractC4497g0.m5546H(0);
        abstractC4497g0.m5548J(this);
        this.f14846k = abstractC4497g0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: p */
    public final int mo5551p() {
        if (mo5555y()) {
            return 0;
        }
        return this.f14846k.mo5551p();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: r */
    public final byte[] mo5552r() {
        if (mo5555y()) {
            return null;
        }
        return this.f14846k.mo5552r();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        C3715e c3715e;
        C2518f c2518f;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC5999a.m10748k(m8926M(), 8));
        sb2.append(' ');
        C2525m c2525m = (C2525m) m5553u(C2525m.class);
        C4519y c4519y = c2525m != null ? ((C3341k) c2525m.f8138m).f10755v : null;
        if (c4519y != null) {
            sb2.append(c4519y);
            sb2.append(' ');
        }
        C2525m c2525m2 = (C2525m) m5553u(C2525m.class);
        C3076j c3076j = c2525m2 != null ? (C3076j) c2525m2.m5553u(C3076j.class) : null;
        C2522j c2522j = c3076j != null ? c3076j.f9948l : null;
        if (c2522j == null) {
            c3715e = null;
        } else {
            int iM8925L = m8925L();
            C3726p c3726p = (C3726p) c2522j.f8152p;
            int i9 = iM8925L & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            if (i9 < c3726p.f12076k.length / 4) {
                c3715e = new C3715e(c3726p, i9 * 4, 1);
            }
        }
        if (c3715e != null) {
            sb2.append(c3715e);
            sb2.append(' ');
        }
        if (mo5555y()) {
            sb2.append("NULL ");
        }
        sb2.append('@');
        C2525m c2525m3 = (C2525m) m5553u(C2525m.class);
        sb2.append(c2525m3 != null ? c2525m3.m5934V() : null);
        sb2.append('/');
        AbstractC4497g0 abstractC4497g0 = this.f14846k;
        int iM8934N = abstractC4497g0 != null ? abstractC4497g0.f14849k.m8934N() : -1;
        C3727q c3727q = (iM8934N >= 0 && (c2518f = (C2518f) m5553u(C2518f.class)) != null) ? (C3727q) c2518f.f8146p.m8600V(iM8934N) : null;
        sb2.append(c3727q != null ? c3727q.f12101m : null);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: y */
    public final boolean mo5555y() {
        return this.f14846k == null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: z */
    public final void mo5556z(C1075b c1075b) {
        if (c1075b.f3459b) {
            return;
        }
        if (((AbstractC2331a) c1075b.f3461d) == this) {
            c1075b.f3459b = true;
        } else {
            if (mo5555y()) {
                return;
            }
            this.f14846k.mo5556z(c1075b);
        }
    }
}
