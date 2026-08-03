package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: y5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2743y5 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public int f9352a;

    /* JADX INFO: renamed from: b */
    public C0922Vd f9353b;

    /* JADX INFO: renamed from: c */
    public EnumC2688wu f9354c;

    /* JADX INFO: renamed from: d */
    public int f9355d;

    /* JADX INFO: renamed from: e */
    public int f9356e;

    /* JADX INFO: renamed from: f */
    public boolean f9357f;

    /* JADX INFO: renamed from: g */
    public int f9358g;

    /* JADX INFO: renamed from: h */
    public int f9359h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0802Sm f9360i;

    /* JADX INFO: renamed from: j */
    public boolean f9361j;

    /* JADX INFO: renamed from: k */
    public C2644vt f9362k;

    /* JADX INFO: renamed from: l */
    public C0007A6 f9363l;

    /* JADX INFO: renamed from: m */
    public Class f9364m;

    /* JADX INFO: renamed from: n */
    public boolean f9365n;

    /* JADX INFO: renamed from: o */
    public boolean f9366o;

    /* JADX INFO: renamed from: p */
    public boolean f9367p;

    /* JADX INFO: renamed from: q */
    public boolean f9368q;

    public AbstractC2743y5() {
        this.f9353b = C0922Vd.f2881e;
        this.f9354c = EnumC2688wu.f9253c;
        this.f9357f = true;
        this.f9358g = -1;
        this.f9359h = -1;
        this.f9360i = C0581Nf.f1878b;
        this.f9362k = new C2644vt();
        this.f9363l = new C0007A6(0);
        this.f9364m = Object.class;
        this.f9367p = true;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m5308h(int r0, int r1) {
        if ((r0 & r1) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC2743y5 mo2301a(AbstractC2743y5 r4) {
        if (this.f9366o == true) goto L5;
        int r0 = r4.f9352a;
        if (m5308h(r4.f9352a, 1048576) == false) goto L10;
        this.f9368q = r4.f9368q;
    L10:
        if (m5308h(r4.f9352a, 4) == false) goto L13;
        this.f9353b = r4.f9353b;
    L13:
        if (m5308h(r4.f9352a, 8) == false) goto L16;
        this.f9354c = r4.f9354c;
    L16:
        if (m5308h(r4.f9352a, 16) == false) goto L19;
        this.f9355d = 0;
        this.f9352a &= -33;
    L19:
        if (m5308h(r4.f9352a, 32) == false) goto L22;
        this.f9355d = r4.f9355d;
        this.f9352a &= -17;
    L22:
        if (m5308h(r4.f9352a, 64) == false) goto L25;
        this.f9356e = 0;
        this.f9352a &= -129;
    L25:
        if (m5308h(r4.f9352a, 128) == false) goto L28;
        this.f9356e = r4.f9356e;
        this.f9352a &= -65;
    L28:
        if (m5308h(r4.f9352a, 256) == false) goto L31;
        this.f9357f = r4.f9357f;
    L31:
        if (m5308h(r4.f9352a, 512) == false) goto L34;
        this.f9359h = r4.f9359h;
        this.f9358g = r4.f9358g;
    L34:
        if (m5308h(r4.f9352a, 1024) == false) goto L37;
        this.f9360i = r4.f9360i;
    L37:
        if (m5308h(r4.f9352a, 4096) == false) goto L40;
        this.f9364m = r4.f9364m;
    L40:
        if (m5308h(r4.f9352a, 8192) == false) goto L43;
        this.f9352a &= -16385;
    L43:
        if (m5308h(r4.f9352a, 16384) == false) goto L46;
        this.f9352a &= -8193;
    L46:
        if (m5308h(r4.f9352a, 131072) == false) goto L49;
        this.f9361j = r4.f9361j;
    L49:
        if (m5308h(r4.f9352a, 2048) == false) goto L51;
        this.f9363l.putAll(r4.f9363l);
        this.f9367p = r4.f9367p;
    L51:
        this.f9352a |= r4.f9352a;
        this.f9362k.f9156b.mo3g(r4.f9362k.f9156b);
        m5319n();
        return this;
    L5:
        return mo2302c().mo2301a(r4);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC2743y5 m5309b() {
        return m5323r(C2457re.f8658d, new C1205b7());
    }

    /* JADX INFO: renamed from: c */
    public AbstractC2743y5 mo2302c() {
        AbstractC2743y5 r0 = (AbstractC2743y5) super.clone();     // Catch: CloneNotSupportedException -> L4
        C2644vt r1 = new C2644vt();     // Catch: CloneNotSupportedException -> L4
        r0.f9362k = r1;     // Catch: CloneNotSupportedException -> L4
        C2644vt r2 = this.f9362k;     // Catch: CloneNotSupportedException -> L4
        r1.f9156b.mo3g(r2.f9156b);     // Catch: CloneNotSupportedException -> L4
        C0007A6 r12 = new C0007A6(0);     // Catch: CloneNotSupportedException -> L4
        r0.f9363l = r12;     // Catch: CloneNotSupportedException -> L4
        r12.putAll(this.f9363l);     // Catch: CloneNotSupportedException -> L4
        r0.f9365n = false;     // Catch: CloneNotSupportedException -> L4
        r0.f9366o = false;     // Catch: CloneNotSupportedException -> L4
        return r0;
    L4:
        e = move-exception;
        throw new RuntimeException(e);
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return mo2302c();
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC2743y5 m5310d(Class r2) {
        if (this.f9366o == true) goto L5;
        this.f9364m = r2;
        this.f9352a |= 4096;
        m5319n();
        return this;
    L5:
        return mo2302c().m5310d(r2);
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC2743y5 m5311e(C0922Vd r2) {
        if (this.f9366o == true) goto L5;
        this.f9353b = r2;
        this.f9352a |= 4;
        m5319n();
        return this;
    L5:
        return mo2302c().m5311e(r2);
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof AbstractC2743y5) == true) goto L5;
        return false;
    L5:
        return m5313g((AbstractC2743y5) r2);
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC2743y5 m5312f(int r2) {
        if (this.f9366o == true) goto L5;
        this.f9355d = r2;
        this.f9352a = (this.f9352a | 32) & (-17);
        m5319n();
        return this;
    L5:
        return mo2302c().m5312f(r2);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m5313g(AbstractC2743y5 r3) {
        r3.getClass();
        if (Float.compare(1.0f, 1.0f) == 0) goto L5;
        return false;
    L5:
        if (this.f9355d != r3.f9355d) goto L32;
        char[] r0 = AbstractC2622vD.f9104a;
        if (this.f9356e == r3.f9356e) goto L9;
        return false;
    L9:
        if (this.f9357f == r3.f9357f) goto L11;
        return false;
    L11:
        if (this.f9358g == r3.f9358g) goto L13;
        return false;
    L13:
        if (this.f9359h == r3.f9359h) goto L15;
        return false;
    L15:
        if (this.f9361j == r3.f9361j) goto L17;
        return false;
    L17:
        if (this.f9353b.equals(r3.f9353b) == true) goto L19;
        return false;
    L19:
        if (this.f9354c == r3.f9354c) goto L21;
        return false;
    L21:
        if (this.f9362k.equals(r3.f9362k) == true) goto L23;
        return false;
    L23:
        if (this.f9363l.equals(r3.f9363l) == true) goto L25;
        return false;
    L25:
        if (this.f9364m.equals(r3.f9364m) == true) goto L27;
        return false;
    L27:
        if (this.f9360i.equals(r3.f9360i) == false) goto L43;
        return true;
    L43:
        return false;
    L32:
        return false;
    }

    public int hashCode() {
        char[] r0 = AbstractC2622vD.f9104a;
        int r02 = AbstractC2622vD.m5136g(Float.floatToIntBits(1.0f), 17);
        int r03 = AbstractC2622vD.m5137h(AbstractC2622vD.m5136g(this.f9355d, r02), null);
        int r04 = AbstractC2622vD.m5137h(AbstractC2622vD.m5136g(0, AbstractC2622vD.m5137h(AbstractC2622vD.m5136g(this.f9356e, r03), null)), null);
        int r05 = AbstractC2622vD.m5136g(this.f9357f ? 1 : 0, r04);
        int r06 = AbstractC2622vD.m5136g(this.f9358g, r05);
        int r07 = AbstractC2622vD.m5136g(this.f9359h, r06);
        return AbstractC2622vD.m5137h(AbstractC2622vD.m5137h(AbstractC2622vD.m5137h(AbstractC2622vD.m5137h(AbstractC2622vD.m5137h(AbstractC2622vD.m5137h(AbstractC2622vD.m5137h(AbstractC2622vD.m5136g(0, AbstractC2622vD.m5136g(0, AbstractC2622vD.m5136g(1, AbstractC2622vD.m5136g(this.f9361j ? 1 : 0, r07)))), this.f9353b), this.f9354c), this.f9362k), this.f9363l), this.f9364m), this.f9360i), null);
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC2743y5 m5314i(C2457re r2, AbstractC0651P5 r3) {
        if (this.f9366o == true) goto L5;
        m5320o(C2457re.f8661g, r2);
        return m5324s(r3, false);
    L5:
        return mo2302c().m5314i(r2, r3);
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC2743y5 m5315j(int r2, int r3) {
        if (this.f9366o == true) goto L5;
        this.f9359h = r2;
        this.f9358g = r3;
        this.f9352a |= 512;
        m5319n();
        return this;
    L5:
        return mo2302c().m5315j(r2, r3);
    }

    /* JADX INFO: renamed from: k */
    public final AbstractC2743y5 m5316k() {
        if (this.f9366o == true) goto L5;
        this.f9356e = R.drawable.ic_theme;
        this.f9352a = (this.f9352a | 128) & (-65);
        m5319n();
        return this;
    L5:
        return mo2302c().m5316k();
    }

    /* JADX INFO: renamed from: l */
    public final AbstractC2743y5 m5317l() {
        if (this.f9366o == true) goto L5;
        this.f9354c = EnumC2688wu.f9254d;
        this.f9352a |= 8;
        m5319n();
        return this;
    L5:
        return mo2302c().m5317l();
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC2743y5 m5318m(C2457re r1, AbstractC0651P5 r2, boolean r3) {
        if (r3 == false) goto L4;
        AbstractC2743y5 r12 = m5323r(r1, r2);
    L5:
        r12.f9367p = true;
        return r12;
    L4:
        r12 = m5314i(r1, r2);
        goto L5
    }

    /* JADX INFO: renamed from: n */
    public final void m5319n() {
        if (this.f9365n == true) goto L6;
        return;
    L6:
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC2743y5 m5320o(C2601ut r2, C2457re r3) {
        if (this.f9366o == true) goto L5;
        AbstractC0714Qj.m1487i(r2);
        this.f9362k.f9156b.put(r2, r3);
        m5319n();
        return this;
    L5:
        return mo2302c().m5320o(r2, r3);
    }

    /* JADX INFO: renamed from: p */
    public final AbstractC2743y5 m5321p(C1382et r2) {
        if (this.f9366o == true) goto L5;
        this.f9360i = r2;
        this.f9352a |= 1024;
        m5319n();
        return this;
    L5:
        return mo2302c().m5321p(r2);
    }

    /* JADX INFO: renamed from: q */
    public final AbstractC2743y5 m5322q() {
        if (this.f9366o == true) goto L5;
        this.f9357f = false;
        this.f9352a |= 256;
        m5319n();
        return this;
    L5:
        return mo2302c().m5322q();
    }

    /* JADX INFO: renamed from: r */
    public final AbstractC2743y5 m5323r(C2457re r2, AbstractC0651P5 r3) {
        if (this.f9366o == true) goto L5;
        m5320o(C2457re.f8661g, r2);
        return m5324s(r3, true);
    L5:
        return mo2302c().m5323r(r2, r3);
    }

    /* JADX INFO: renamed from: s */
    public final AbstractC2743y5 m5324s(InterfaceC0098CB r3, boolean r4) {
        if (this.f9366o == true) goto L5;
        C2715xe r0 = new C2715xe(r3, r4);
        m5325t(Bitmap.class, r3, r4);
        m5325t(Drawable.class, r0, r4);
        m5325t(BitmapDrawable.class, r0, r4);
        m5325t(C0026Aj.class, new C0112Cj(r3), r4);
        m5319n();
        return this;
    L5:
        return mo2302c().m5324s(r3, r4);
    }

    /* JADX INFO: renamed from: t */
    public final AbstractC2743y5 m5325t(Class r2, InterfaceC0098CB r3, boolean r4) {
        if (this.f9366o == true) goto L5;
        AbstractC0714Qj.m1487i(r3);
        this.f9363l.put(r2, r3);
        int r22 = this.f9352a;
        this.f9352a = 67584 | r22;
        this.f9367p = false;
        if (r4 == false) goto L9;
        this.f9352a = r22 | 198656;
        this.f9361j = true;
    L9:
        m5319n();
        return this;
    L5:
        return mo2302c().m5325t(r2, r3, r4);
    }

    /* JADX INFO: renamed from: u */
    public final AbstractC2743y5 m5326u() {
        if (this.f9366o == true) goto L5;
        this.f9368q = true;
        this.f9352a |= 1048576;
        m5319n();
        return this;
    L5:
        return mo2302c().m5326u();
    }
}
