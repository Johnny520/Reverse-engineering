package p000;

import android.R;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: wj */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0849wj implements Cloneable {

    /* JADX INFO: renamed from: h */
    public int f12522h;

    /* JADX INFO: renamed from: k */
    public int f12525k;

    /* JADX INFO: renamed from: l */
    public int f12526l;

    /* JADX INFO: renamed from: q */
    public boolean f12531q;

    /* JADX INFO: renamed from: u */
    public boolean f12535u;

    /* JADX INFO: renamed from: v */
    public boolean f12536v;

    /* JADX INFO: renamed from: x */
    public boolean f12538x;

    /* JADX INFO: renamed from: i */
    public b90 f12523i = b90.f744d;

    /* JADX INFO: renamed from: j */
    public i32 f12524j = i32.f4253j;

    /* JADX INFO: renamed from: m */
    public boolean f12527m = true;

    /* JADX INFO: renamed from: n */
    public int f12528n = -1;

    /* JADX INFO: renamed from: o */
    public int f12529o = -1;

    /* JADX INFO: renamed from: p */
    public a51 f12530p = he0.f3972b;

    /* JADX INFO: renamed from: r */
    public ov1 f12532r = new ov1();

    /* JADX INFO: renamed from: s */
    public C0663ro f12533s = new C0663ro(0);

    /* JADX INFO: renamed from: t */
    public Class f12534t = Object.class;

    /* JADX INFO: renamed from: w */
    public boolean f12537w = true;

    /* JADX INFO: renamed from: k */
    public static boolean m5904k(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC0849wj mo4766a(AbstractC0849wj abstractC0849wj) {
        if (this.f12536v) {
            return clone().mo4766a(abstractC0849wj);
        }
        int i = abstractC0849wj.f12522h;
        if (m5904k(abstractC0849wj.f12522h, 1048576)) {
            this.f12538x = abstractC0849wj.f12538x;
        }
        if (m5904k(abstractC0849wj.f12522h, 4)) {
            this.f12523i = abstractC0849wj.f12523i;
        }
        if (m5904k(abstractC0849wj.f12522h, 8)) {
            this.f12524j = abstractC0849wj.f12524j;
        }
        if (m5904k(abstractC0849wj.f12522h, 16)) {
            this.f12525k = 0;
            this.f12522h &= -33;
        }
        if (m5904k(abstractC0849wj.f12522h, 32)) {
            this.f12525k = abstractC0849wj.f12525k;
            this.f12522h &= -17;
        }
        if (m5904k(abstractC0849wj.f12522h, 64)) {
            this.f12526l = 0;
            this.f12522h &= -129;
        }
        if (m5904k(abstractC0849wj.f12522h, 128)) {
            this.f12526l = abstractC0849wj.f12526l;
            this.f12522h &= -65;
        }
        if (m5904k(abstractC0849wj.f12522h, 256)) {
            this.f12527m = abstractC0849wj.f12527m;
        }
        if (m5904k(abstractC0849wj.f12522h, AIChatConfig.DefaultMaxTokens)) {
            this.f12529o = abstractC0849wj.f12529o;
            this.f12528n = abstractC0849wj.f12528n;
        }
        if (m5904k(abstractC0849wj.f12522h, 1024)) {
            this.f12530p = abstractC0849wj.f12530p;
        }
        if (m5904k(abstractC0849wj.f12522h, 4096)) {
            this.f12534t = abstractC0849wj.f12534t;
        }
        if (m5904k(abstractC0849wj.f12522h, 8192)) {
            this.f12522h &= -16385;
        }
        if (m5904k(abstractC0849wj.f12522h, 16384)) {
            this.f12522h &= -8193;
        }
        if (m5904k(abstractC0849wj.f12522h, 131072)) {
            this.f12531q = abstractC0849wj.f12531q;
        }
        if (m5904k(abstractC0849wj.f12522h, 2048)) {
            this.f12533s.putAll(abstractC0849wj.f12533s);
            this.f12537w = abstractC0849wj.f12537w;
        }
        this.f12522h |= abstractC0849wj.f12522h;
        this.f12532r.f7858b.mo4513g(abstractC0849wj.f12532r.f7858b);
        m5914p();
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC0849wj m5905d() {
        return m5918t(va0.f11857c, new C0630qs());
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC0849wj) {
            return m5909j((AbstractC0849wj) obj);
        }
        return false;
    }

    @Override // 
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public AbstractC0849wj clone() {
        try {
            AbstractC0849wj abstractC0849wj = (AbstractC0849wj) super.clone();
            ov1 ov1Var = new ov1();
            abstractC0849wj.f12532r = ov1Var;
            ov1Var.f7858b.mo4513g(this.f12532r.f7858b);
            C0663ro c0663ro = new C0663ro(0);
            abstractC0849wj.f12533s = c0663ro;
            c0663ro.putAll(this.f12533s);
            abstractC0849wj.f12535u = false;
            abstractC0849wj.f12536v = false;
            return abstractC0849wj;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC0849wj m5906g(Class cls) {
        if (this.f12536v) {
            return clone().m5906g(cls);
        }
        this.f12534t = cls;
        this.f12522h |= 4096;
        m5914p();
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC0849wj m5907h(b90 b90Var) {
        if (this.f12536v) {
            return clone().m5907h(b90Var);
        }
        this.f12523i = b90Var;
        this.f12522h |= 4;
        m5914p();
        return this;
    }

    public int hashCode() {
        char[] cArr = b93.f747a;
        return b93.m501h(b93.m501h(b93.m501h(b93.m501h(b93.m501h(b93.m501h(b93.m501h(b93.m500g(0, b93.m500g(0, b93.m500g(1, b93.m500g(this.f12531q ? 1 : 0, b93.m500g(this.f12529o, b93.m500g(this.f12528n, b93.m500g(this.f12527m ? 1 : 0, b93.m501h(b93.m500g(0, b93.m501h(b93.m500g(this.f12526l, b93.m501h(b93.m500g(this.f12525k, b93.m500g(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.f12523i), this.f12524j), this.f12532r), this.f12533s), this.f12534t), this.f12530p), null);
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC0849wj m5908i() {
        if (this.f12536v) {
            return clone().m5908i();
        }
        this.f12525k = R.color.transparent;
        this.f12522h = (this.f12522h | 32) & (-17);
        m5914p();
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m5909j(AbstractC0849wj abstractC0849wj) {
        abstractC0849wj.getClass();
        if (Float.compare(1.0f, 1.0f) != 0 || this.f12525k != abstractC0849wj.f12525k) {
            return false;
        }
        char[] cArr = b93.f747a;
        return this.f12526l == abstractC0849wj.f12526l && this.f12527m == abstractC0849wj.f12527m && this.f12528n == abstractC0849wj.f12528n && this.f12529o == abstractC0849wj.f12529o && this.f12531q == abstractC0849wj.f12531q && this.f12523i.equals(abstractC0849wj.f12523i) && this.f12524j == abstractC0849wj.f12524j && this.f12532r.equals(abstractC0849wj.f12532r) && this.f12533s.equals(abstractC0849wj.f12533s) && this.f12534t.equals(abstractC0849wj.f12534t) && this.f12530p.equals(abstractC0849wj.f12530p);
    }

    /* JADX INFO: renamed from: l */
    public final AbstractC0849wj m5910l(va0 va0Var, AbstractC0059bl abstractC0059bl) {
        if (this.f12536v) {
            return clone().m5910l(va0Var, abstractC0059bl);
        }
        m5915q(va0.f11861g, va0Var);
        return m5919u(abstractC0059bl, false);
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC0849wj m5911m(int i, int i2) {
        if (this.f12536v) {
            return clone().m5911m(i, i2);
        }
        this.f12529o = i;
        this.f12528n = i2;
        this.f12522h |= AIChatConfig.DefaultMaxTokens;
        m5914p();
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final AbstractC0849wj m5912n() {
        if (this.f12536v) {
            return clone().m5912n();
        }
        this.f12526l = R.color.transparent;
        this.f12522h = (this.f12522h | 128) & (-65);
        m5914p();
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC0849wj m5913o() {
        if (this.f12536v) {
            return clone().m5913o();
        }
        this.f12524j = i32.f4254k;
        this.f12522h |= 8;
        m5914p();
        return this;
    }

    /* JADX INFO: renamed from: p */
    public final void m5914p() {
        if (this.f12535u) {
            C0676s.m4653l("You cannot modify locked T, consider clone()");
        }
    }

    /* JADX INFO: renamed from: q */
    public final AbstractC0849wj m5915q(mv1 mv1Var, va0 va0Var) {
        if (this.f12536v) {
            return clone().m5915q(mv1Var, va0Var);
        }
        fg1.m1641p(mv1Var);
        this.f12532r.f7858b.put(mv1Var, va0Var);
        m5914p();
        return this;
    }

    /* JADX INFO: renamed from: r */
    public final AbstractC0849wj m5916r(is1 is1Var) {
        if (this.f12536v) {
            return clone().m5916r(is1Var);
        }
        this.f12530p = is1Var;
        this.f12522h |= 1024;
        m5914p();
        return this;
    }

    /* JADX INFO: renamed from: s */
    public final AbstractC0849wj m5917s() {
        if (this.f12536v) {
            return clone().m5917s();
        }
        this.f12527m = false;
        this.f12522h |= 256;
        m5914p();
        return this;
    }

    /* JADX INFO: renamed from: t */
    public final AbstractC0849wj m5918t(va0 va0Var, AbstractC0059bl abstractC0059bl) {
        if (this.f12536v) {
            return clone().m5918t(va0Var, abstractC0059bl);
        }
        m5915q(va0.f11861g, va0Var);
        return m5919u(abstractC0059bl, true);
    }

    /* JADX INFO: renamed from: u */
    public final AbstractC0849wj m5919u(n33 n33Var, boolean z) {
        if (this.f12536v) {
            return clone().m5919u(n33Var, z);
        }
        uc0 uc0Var = new uc0(n33Var, z);
        m5920v(Bitmap.class, n33Var, z);
        m5920v(Drawable.class, uc0Var, z);
        m5920v(BitmapDrawable.class, uc0Var, z);
        m5920v(yo0.class, new ap0(n33Var), z);
        m5914p();
        return this;
    }

    /* JADX INFO: renamed from: v */
    public final AbstractC0849wj m5920v(Class cls, n33 n33Var, boolean z) {
        if (this.f12536v) {
            return clone().m5920v(cls, n33Var, z);
        }
        fg1.m1641p(n33Var);
        this.f12533s.put(cls, n33Var);
        int i = this.f12522h;
        this.f12522h = 67584 | i;
        this.f12537w = false;
        if (z) {
            this.f12522h = i | 198656;
            this.f12531q = true;
        }
        m5914p();
        return this;
    }

    /* JADX INFO: renamed from: w */
    public final AbstractC0849wj m5921w() {
        if (this.f12536v) {
            return clone().m5921w();
        }
        this.f12538x = true;
        this.f12522h |= 1048576;
        m5914p();
        return this;
    }
}
