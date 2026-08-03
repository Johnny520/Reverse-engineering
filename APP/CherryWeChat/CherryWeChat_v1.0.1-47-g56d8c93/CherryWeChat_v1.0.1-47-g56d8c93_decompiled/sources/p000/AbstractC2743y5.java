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

    /* JADX INFO: renamed from: d */
    public int f9355d;

    /* JADX INFO: renamed from: e */
    public int f9356e;

    /* JADX INFO: renamed from: j */
    public boolean f9361j;

    /* JADX INFO: renamed from: n */
    public boolean f9365n;

    /* JADX INFO: renamed from: o */
    public boolean f9366o;

    /* JADX INFO: renamed from: q */
    public boolean f9368q;

    /* JADX INFO: renamed from: b */
    public C0922Vd f9353b = C0922Vd.f2881e;

    /* JADX INFO: renamed from: c */
    public EnumC2688wu f9354c = EnumC2688wu.f9253c;

    /* JADX INFO: renamed from: f */
    public boolean f9357f = true;

    /* JADX INFO: renamed from: g */
    public int f9358g = -1;

    /* JADX INFO: renamed from: h */
    public int f9359h = -1;

    /* JADX INFO: renamed from: i */
    public InterfaceC0802Sm f9360i = C0581Nf.f1878b;

    /* JADX INFO: renamed from: k */
    public C2644vt f9362k = new C2644vt();

    /* JADX INFO: renamed from: l */
    public C0007A6 f9363l = new C0007A6(0);

    /* JADX INFO: renamed from: m */
    public Class f9364m = Object.class;

    /* JADX INFO: renamed from: p */
    public boolean f9367p = true;

    /* JADX INFO: renamed from: h */
    public static boolean m5308h(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC2743y5 mo2301a(AbstractC2743y5 abstractC2743y5) {
        if (this.f9366o) {
            return clone().mo2301a(abstractC2743y5);
        }
        int i = abstractC2743y5.f9352a;
        if (m5308h(abstractC2743y5.f9352a, 1048576)) {
            this.f9368q = abstractC2743y5.f9368q;
        }
        if (m5308h(abstractC2743y5.f9352a, 4)) {
            this.f9353b = abstractC2743y5.f9353b;
        }
        if (m5308h(abstractC2743y5.f9352a, 8)) {
            this.f9354c = abstractC2743y5.f9354c;
        }
        if (m5308h(abstractC2743y5.f9352a, 16)) {
            this.f9355d = 0;
            this.f9352a &= -33;
        }
        if (m5308h(abstractC2743y5.f9352a, 32)) {
            this.f9355d = abstractC2743y5.f9355d;
            this.f9352a &= -17;
        }
        if (m5308h(abstractC2743y5.f9352a, 64)) {
            this.f9356e = 0;
            this.f9352a &= -129;
        }
        if (m5308h(abstractC2743y5.f9352a, 128)) {
            this.f9356e = abstractC2743y5.f9356e;
            this.f9352a &= -65;
        }
        if (m5308h(abstractC2743y5.f9352a, 256)) {
            this.f9357f = abstractC2743y5.f9357f;
        }
        if (m5308h(abstractC2743y5.f9352a, 512)) {
            this.f9359h = abstractC2743y5.f9359h;
            this.f9358g = abstractC2743y5.f9358g;
        }
        if (m5308h(abstractC2743y5.f9352a, 1024)) {
            this.f9360i = abstractC2743y5.f9360i;
        }
        if (m5308h(abstractC2743y5.f9352a, 4096)) {
            this.f9364m = abstractC2743y5.f9364m;
        }
        if (m5308h(abstractC2743y5.f9352a, 8192)) {
            this.f9352a &= -16385;
        }
        if (m5308h(abstractC2743y5.f9352a, 16384)) {
            this.f9352a &= -8193;
        }
        if (m5308h(abstractC2743y5.f9352a, 131072)) {
            this.f9361j = abstractC2743y5.f9361j;
        }
        if (m5308h(abstractC2743y5.f9352a, 2048)) {
            this.f9363l.putAll(abstractC2743y5.f9363l);
            this.f9367p = abstractC2743y5.f9367p;
        }
        this.f9352a |= abstractC2743y5.f9352a;
        this.f9362k.f9156b.mo3g(abstractC2743y5.f9362k.f9156b);
        m5319n();
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC2743y5 m5309b() {
        return m5323r(C2457re.f8658d, new C1205b7());
    }

    @Override // 
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC2743y5 clone() {
        try {
            AbstractC2743y5 abstractC2743y5 = (AbstractC2743y5) super.clone();
            C2644vt c2644vt = new C2644vt();
            abstractC2743y5.f9362k = c2644vt;
            c2644vt.f9156b.mo3g(this.f9362k.f9156b);
            C0007A6 c0007a6 = new C0007A6(0);
            abstractC2743y5.f9363l = c0007a6;
            c0007a6.putAll(this.f9363l);
            abstractC2743y5.f9365n = false;
            abstractC2743y5.f9366o = false;
            return abstractC2743y5;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC2743y5 m5310d(Class cls) {
        if (this.f9366o) {
            return clone().m5310d(cls);
        }
        this.f9364m = cls;
        this.f9352a |= 4096;
        m5319n();
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC2743y5 m5311e(C0922Vd c0922Vd) {
        if (this.f9366o) {
            return clone().m5311e(c0922Vd);
        }
        this.f9353b = c0922Vd;
        this.f9352a |= 4;
        m5319n();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC2743y5) {
            return m5313g((AbstractC2743y5) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC2743y5 m5312f(int i) {
        if (this.f9366o) {
            return clone().m5312f(i);
        }
        this.f9355d = i;
        this.f9352a = (this.f9352a | 32) & (-17);
        m5319n();
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m5313g(AbstractC2743y5 abstractC2743y5) {
        abstractC2743y5.getClass();
        if (Float.compare(1.0f, 1.0f) != 0 || this.f9355d != abstractC2743y5.f9355d) {
            return false;
        }
        char[] cArr = AbstractC2622vD.f9104a;
        return this.f9356e == abstractC2743y5.f9356e && this.f9357f == abstractC2743y5.f9357f && this.f9358g == abstractC2743y5.f9358g && this.f9359h == abstractC2743y5.f9359h && this.f9361j == abstractC2743y5.f9361j && this.f9353b.equals(abstractC2743y5.f9353b) && this.f9354c == abstractC2743y5.f9354c && this.f9362k.equals(abstractC2743y5.f9362k) && this.f9363l.equals(abstractC2743y5.f9363l) && this.f9364m.equals(abstractC2743y5.f9364m) && this.f9360i.equals(abstractC2743y5.f9360i);
    }

    public int hashCode() {
        char[] cArr = AbstractC2622vD.f9104a;
        return AbstractC2622vD.m5137h(AbstractC2622vD.m5137h(AbstractC2622vD.m5137h(AbstractC2622vD.m5137h(AbstractC2622vD.m5137h(AbstractC2622vD.m5137h(AbstractC2622vD.m5137h(AbstractC2622vD.m5136g(0, AbstractC2622vD.m5136g(0, AbstractC2622vD.m5136g(1, AbstractC2622vD.m5136g(this.f9361j ? 1 : 0, AbstractC2622vD.m5136g(this.f9359h, AbstractC2622vD.m5136g(this.f9358g, AbstractC2622vD.m5136g(this.f9357f ? 1 : 0, AbstractC2622vD.m5137h(AbstractC2622vD.m5136g(0, AbstractC2622vD.m5137h(AbstractC2622vD.m5136g(this.f9356e, AbstractC2622vD.m5137h(AbstractC2622vD.m5136g(this.f9355d, AbstractC2622vD.m5136g(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.f9353b), this.f9354c), this.f9362k), this.f9363l), this.f9364m), this.f9360i), null);
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC2743y5 m5314i(C2457re c2457re, AbstractC0651P5 abstractC0651P5) {
        if (this.f9366o) {
            return clone().m5314i(c2457re, abstractC0651P5);
        }
        m5320o(C2457re.f8661g, c2457re);
        return m5324s(abstractC0651P5, false);
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC2743y5 m5315j(int i, int i2) {
        if (this.f9366o) {
            return clone().m5315j(i, i2);
        }
        this.f9359h = i;
        this.f9358g = i2;
        this.f9352a |= 512;
        m5319n();
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final AbstractC2743y5 m5316k() {
        if (this.f9366o) {
            return clone().m5316k();
        }
        this.f9356e = R.drawable.ic_theme;
        this.f9352a = (this.f9352a | 128) & (-65);
        m5319n();
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final AbstractC2743y5 m5317l() {
        if (this.f9366o) {
            return clone().m5317l();
        }
        this.f9354c = EnumC2688wu.f9254d;
        this.f9352a |= 8;
        m5319n();
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC2743y5 m5318m(C2457re c2457re, AbstractC0651P5 abstractC0651P5, boolean z) {
        AbstractC2743y5 abstractC2743y5M5323r = z ? m5323r(c2457re, abstractC0651P5) : m5314i(c2457re, abstractC0651P5);
        abstractC2743y5M5323r.f9367p = true;
        return abstractC2743y5M5323r;
    }

    /* JADX INFO: renamed from: n */
    public final void m5319n() {
        if (this.f9365n) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC2743y5 m5320o(C2601ut c2601ut, C2457re c2457re) {
        if (this.f9366o) {
            return clone().m5320o(c2601ut, c2457re);
        }
        AbstractC0714Qj.m1487i(c2601ut);
        this.f9362k.f9156b.put(c2601ut, c2457re);
        m5319n();
        return this;
    }

    /* JADX INFO: renamed from: p */
    public final AbstractC2743y5 m5321p(C1382et c1382et) {
        if (this.f9366o) {
            return clone().m5321p(c1382et);
        }
        this.f9360i = c1382et;
        this.f9352a |= 1024;
        m5319n();
        return this;
    }

    /* JADX INFO: renamed from: q */
    public final AbstractC2743y5 m5322q() {
        if (this.f9366o) {
            return clone().m5322q();
        }
        this.f9357f = false;
        this.f9352a |= 256;
        m5319n();
        return this;
    }

    /* JADX INFO: renamed from: r */
    public final AbstractC2743y5 m5323r(C2457re c2457re, AbstractC0651P5 abstractC0651P5) {
        if (this.f9366o) {
            return clone().m5323r(c2457re, abstractC0651P5);
        }
        m5320o(C2457re.f8661g, c2457re);
        return m5324s(abstractC0651P5, true);
    }

    /* JADX INFO: renamed from: s */
    public final AbstractC2743y5 m5324s(InterfaceC0098CB interfaceC0098CB, boolean z) {
        if (this.f9366o) {
            return clone().m5324s(interfaceC0098CB, z);
        }
        C2715xe c2715xe = new C2715xe(interfaceC0098CB, z);
        m5325t(Bitmap.class, interfaceC0098CB, z);
        m5325t(Drawable.class, c2715xe, z);
        m5325t(BitmapDrawable.class, c2715xe, z);
        m5325t(C0026Aj.class, new C0112Cj(interfaceC0098CB), z);
        m5319n();
        return this;
    }

    /* JADX INFO: renamed from: t */
    public final AbstractC2743y5 m5325t(Class cls, InterfaceC0098CB interfaceC0098CB, boolean z) {
        if (this.f9366o) {
            return clone().m5325t(cls, interfaceC0098CB, z);
        }
        AbstractC0714Qj.m1487i(interfaceC0098CB);
        this.f9363l.put(cls, interfaceC0098CB);
        int i = this.f9352a;
        this.f9352a = 67584 | i;
        this.f9367p = false;
        if (z) {
            this.f9352a = i | 198656;
            this.f9361j = true;
        }
        m5319n();
        return this;
    }

    /* JADX INFO: renamed from: u */
    public final AbstractC2743y5 m5326u() {
        if (this.f9366o) {
            return clone().m5326u();
        }
        this.f9368q = true;
        this.f9352a |= 1048576;
        m5319n();
        return this;
    }
}
