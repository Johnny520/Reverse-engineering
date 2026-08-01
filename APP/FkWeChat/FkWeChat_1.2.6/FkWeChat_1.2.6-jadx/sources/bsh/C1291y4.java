package bsh;

import bsh.C1281x0;
import java.io.Serializable;

/* JADX INFO: renamed from: bsh.y4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1291y4 implements Serializable, C1281x0.a, Cloneable {

    /* JADX INFO: renamed from: q */
    public String f3884q;

    /* JADX INFO: renamed from: r */
    public Class f3885r;

    /* JADX INFO: renamed from: s */
    public String f3886s;

    /* JADX INFO: renamed from: t */
    public Object f3887t;

    /* JADX INFO: renamed from: u */
    public C1283x2 f3888u;

    /* JADX INFO: renamed from: v */
    public C1265u2 f3889v;

    public C1291y4(String str, Class cls, Object obj, C1283x2 c1283x2) {
        this.f3884q = str;
        this.f3885r = cls;
        m5228j(c1283x2);
        m5229k(obj, 0);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1291y4 clone() {
        try {
            C1291y4 c1291y4 = (C1291y4) super.clone();
            C1283x2 c1283x2 = c1291y4.f3888u;
            c1291y4.f3888u = c1283x2 != null ? c1283x2.clone() : null;
            return c1291y4;
        } catch (CloneNotSupportedException e10) {
            throw new IllegalArgumentException(e10.getMessage(), e10);
        }
    }

    @Override // bsh.C1281x0.a
    /* JADX INFO: renamed from: b */
    public void mo4283b() {
        if (AbstractC1143c4.m4174i0(this.f3885r)) {
            try {
                this.f3885r = AbstractC1143c4.m4147Q(this.f3885r).m4396t(this.f3885r.getName());
            } catch (C1279w4 unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public C1283x2 m5222c() {
        if (this.f3888u == null) {
            m5228j(new C1283x2(3));
        }
        return this.f3888u;
    }

    /* JADX INFO: renamed from: d */
    public Class m5223d() {
        return this.f3885r;
    }

    /* JADX INFO: renamed from: f */
    public String m5224f() {
        if (this.f3886s == null) {
            Class<Object> cls = this.f3885r;
            if (cls == null) {
                cls = Object.class;
            }
            this.f3886s = C1221n0.m4923y(cls);
        }
        return this.f3886s;
    }

    /* JADX INFO: renamed from: g */
    public Object m5225g() {
        C1265u2 c1265u2 = this.f3889v;
        return c1265u2 != null ? this.f3885r == null ? c1265u2.m5101d() : Primitive.wrap(c1265u2.m5101d(), (Class<?>) this.f3885r) : this.f3887t;
    }

    public String getName() {
        return this.f3884q;
    }

    /* JADX INFO: renamed from: h */
    public boolean m5226h(String str) {
        return m5222c().m5200j(str);
    }

    /* JADX INFO: renamed from: i */
    public void m5227i() {
        if (!m5226h("private") && !m5226h("protected")) {
            m5222c().m5202l();
            return;
        }
        throw new IllegalArgumentException("Illegal modifier for interface field " + getName() + ". Only public static & final are permitted.");
    }

    /* JADX INFO: renamed from: j */
    public final void m5228j(C1283x2 c1283x2) {
        this.f3888u = c1283x2;
    }

    /* JADX INFO: renamed from: k */
    public void m5229k(Object obj, int i10) {
        if (m5226h("final")) {
            if (this.f3887t != null) {
                throw new C1279w4("Cannot re-assign final variable " + this.f3884q + ".");
            }
            if (obj == null) {
                return;
            }
        }
        Class cls = this.f3885r;
        if (cls != null && cls != Object.class && obj != null) {
            obj = AbstractC1273v4.m5138h(obj, cls, i10 == 0 ? 0 : 1);
            this.f3887t = obj;
        }
        this.f3887t = obj;
        if (obj == null && i10 != 0) {
            this.f3887t = Primitive.getDefaultValue(this.f3885r);
        }
        C1265u2 c1265u2 = this.f3889v;
        if (c1265u2 != null) {
            this.f3887t = c1265u2.m5099b(this.f3887t, false);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m5230l(boolean z10) {
        if (m5226h("final") && this.f3887t == null && z10 == m5226h("static")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z10 ? "Static f" : "F");
            sb2.append("inal variable ");
            sb2.append(this.f3884q);
            sb2.append(" is not initialized.");
            throw new RuntimeException(sb2.toString());
        }
    }

    public String toString() {
        return "Variable: " + AbstractC1225n4.m4985x(this) + ", value:" + this.f3887t + ", lhs = " + this.f3889v;
    }

    public C1291y4(String str, Class cls, C1265u2 c1265u2) {
        this.f3884q = str;
        this.f3889v = c1265u2;
        this.f3885r = cls;
    }
}
