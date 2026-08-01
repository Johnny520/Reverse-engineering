package p116hf;

import gf.C2793b;
import gf.EnumC2795d;
import gf.InterfaceC2796e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import p086ff.InterfaceC2436d;
import p086ff.InterfaceC2440h;
import p147jf.InterfaceC3860b;

/* JADX INFO: renamed from: hf.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3031n implements InterfaceC2436d {

    /* JADX INFO: renamed from: q */
    public final String f8038q;

    /* JADX INFO: renamed from: r */
    public volatile InterfaceC2436d f8039r;

    /* JADX INFO: renamed from: s */
    public Boolean f8040s;

    /* JADX INFO: renamed from: t */
    public Method f8041t;

    /* JADX INFO: renamed from: u */
    public C2793b f8042u;

    /* JADX INFO: renamed from: v */
    public final Queue f8043v;

    /* JADX INFO: renamed from: w */
    public final boolean f8044w;

    public C3031n(String str, Queue queue, boolean z10) {
        this.f8038q = str;
        this.f8043v = queue;
        this.f8044w = z10;
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: A */
    public void mo8797A(String str) {
        m11198G().mo8797A(str);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: B */
    public void mo8798B(String str, Object... objArr) {
        m11198G().mo8798B(str, objArr);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: C */
    public void mo8799C(InterfaceC2440h interfaceC2440h, String str, Throwable th) {
        m11198G().mo8799C(interfaceC2440h, str, th);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: D */
    public void mo8800D(InterfaceC2440h interfaceC2440h, String str, Throwable th) {
        m11198G().mo8800D(interfaceC2440h, str, th);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: E */
    public boolean mo8801E(InterfaceC2440h interfaceC2440h) {
        return m11198G().mo8801E(interfaceC2440h);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: F */
    public void mo8802F(InterfaceC2440h interfaceC2440h, String str, Throwable th) {
        m11198G().mo8802F(interfaceC2440h, str, th);
    }

    /* JADX INFO: renamed from: G */
    public InterfaceC2436d m11198G() {
        return this.f8039r != null ? this.f8039r : this.f8044w ? C3024g.f8021q : m11199H();
    }

    /* JADX INFO: renamed from: H */
    public final InterfaceC2436d m11199H() {
        if (this.f8042u == null) {
            this.f8042u = new C2793b(this, this.f8043v);
        }
        return this.f8042u;
    }

    /* JADX INFO: renamed from: I */
    public String m11200I() {
        return this.f8038q;
    }

    /* JADX INFO: renamed from: J */
    public boolean m11201J() {
        Boolean bool = this.f8040s;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f8041t = this.f8039r.getClass().getMethod("log", InterfaceC2796e.class);
            this.f8040s = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f8040s = Boolean.FALSE;
        }
        return this.f8040s.booleanValue();
    }

    /* JADX INFO: renamed from: K */
    public boolean m11202K() {
        return this.f8039r instanceof C3024g;
    }

    /* JADX INFO: renamed from: L */
    public boolean m11203L() {
        return this.f8039r == null;
    }

    /* JADX INFO: renamed from: M */
    public void m11204M(InterfaceC2796e interfaceC2796e) {
        if (m11201J()) {
            try {
                this.f8041t.invoke(this.f8039r, interfaceC2796e);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public void m11205N(InterfaceC2436d interfaceC2436d) {
        this.f8039r = interfaceC2436d;
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: a */
    public boolean mo8803a() {
        return m11198G().mo8803a();
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: b */
    public boolean mo8804b() {
        return m11198G().mo8804b();
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: c */
    public boolean mo8805c(InterfaceC2440h interfaceC2440h) {
        return m11198G().mo8805c(interfaceC2440h);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: d */
    public boolean mo8806d(InterfaceC2440h interfaceC2440h) {
        return m11198G().mo8806d(interfaceC2440h);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: e */
    public InterfaceC3860b mo8807e(EnumC2795d enumC2795d) {
        return m11198G().mo8807e(enumC2795d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f8038q.equals(((C3031n) obj).f8038q);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: f */
    public void mo8808f(String str, Throwable th) {
        m11198G().mo8808f(str, th);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: g */
    public boolean mo8809g(EnumC2795d enumC2795d) {
        return m11198G().mo8809g(enumC2795d);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: h */
    public boolean mo8810h() {
        return m11198G().mo8810h();
    }

    public int hashCode() {
        return this.f8038q.hashCode();
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: i */
    public boolean mo8811i(InterfaceC2440h interfaceC2440h) {
        return m11198G().mo8811i(interfaceC2440h);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: j */
    public void mo8812j(String str, Object... objArr) {
        m11198G().mo8812j(str, objArr);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: k */
    public boolean mo8813k() {
        return m11198G().mo8813k();
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: l */
    public boolean mo8814l(InterfaceC2440h interfaceC2440h) {
        return m11198G().mo8814l(interfaceC2440h);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: m */
    public void mo8815m(String str) {
        m11198G().mo8815m(str);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: n */
    public boolean mo8816n() {
        return m11198G().mo8816n();
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: o */
    public void mo8817o(String str, Object... objArr) {
        m11198G().mo8817o(str, objArr);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: p */
    public void mo8818p(InterfaceC2440h interfaceC2440h, String str, Throwable th) {
        m11198G().mo8818p(interfaceC2440h, str, th);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: q */
    public void mo8819q(InterfaceC2440h interfaceC2440h, String str, Throwable th) {
        m11198G().mo8819q(interfaceC2440h, str, th);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: r */
    public void mo8820r(String str, Object obj) {
        m11198G().mo8820r(str, obj);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: s */
    public void mo8821s(String str, Object... objArr) {
        m11198G().mo8821s(str, objArr);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: t */
    public void mo8822t(String str, Throwable th) {
        m11198G().mo8822t(str, th);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: u */
    public void mo8823u(String str, Throwable th) {
        m11198G().mo8823u(str, th);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: v */
    public InterfaceC3860b mo8824v(EnumC2795d enumC2795d) {
        return m11198G().mo8824v(enumC2795d);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: w */
    public void mo8825w(String str, Throwable th) {
        m11198G().mo8825w(str, th);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: x */
    public void mo8826x(String str) {
        m11198G().mo8826x(str);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: y */
    public void mo8827y(String str) {
        m11198G().mo8827y(str);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: z */
    public void mo8828z(String str, Object... objArr) {
        m11198G().mo8828z(str, objArr);
    }
}
