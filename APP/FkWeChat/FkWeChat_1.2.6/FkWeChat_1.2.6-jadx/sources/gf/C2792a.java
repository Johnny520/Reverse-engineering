package gf;

import java.util.ArrayList;
import java.util.List;
import p086ff.InterfaceC2436d;
import p086ff.InterfaceC2440h;

/* JADX INFO: renamed from: gf.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2792a implements InterfaceC2796e {

    /* JADX INFO: renamed from: a */
    public InterfaceC2436d f7276a;

    /* JADX INFO: renamed from: b */
    public EnumC2795d f7277b;

    /* JADX INFO: renamed from: c */
    public String f7278c;

    /* JADX INFO: renamed from: d */
    public List f7279d;

    /* JADX INFO: renamed from: e */
    public List f7280e;

    /* JADX INFO: renamed from: f */
    public List f7281f;

    /* JADX INFO: renamed from: g */
    public Throwable f7282g;

    /* JADX INFO: renamed from: h */
    public String f7283h;

    public C2792a(EnumC2795d enumC2795d, InterfaceC2436d interfaceC2436d) {
        this.f7276a = interfaceC2436d;
        this.f7277b = enumC2795d;
    }

    @Override // gf.InterfaceC2796e
    /* JADX INFO: renamed from: a */
    public List mo9944a() {
        return this.f7281f;
    }

    @Override // gf.InterfaceC2796e
    /* JADX INFO: renamed from: b */
    public String mo9945b() {
        return this.f7278c;
    }

    @Override // gf.InterfaceC2796e
    /* JADX INFO: renamed from: c */
    public String mo9946c() {
        return this.f7283h;
    }

    @Override // gf.InterfaceC2796e
    /* JADX INFO: renamed from: d */
    public Object[] mo9947d() {
        List list = this.f7280e;
        if (list == null) {
            return null;
        }
        return list.toArray();
    }

    @Override // gf.InterfaceC2796e
    /* JADX INFO: renamed from: e */
    public EnumC2795d mo9948e() {
        return this.f7277b;
    }

    @Override // gf.InterfaceC2796e
    /* JADX INFO: renamed from: f */
    public List mo9949f() {
        return this.f7279d;
    }

    @Override // gf.InterfaceC2796e
    /* JADX INFO: renamed from: g */
    public Throwable mo9950g() {
        return this.f7282g;
    }

    /* JADX INFO: renamed from: h */
    public void m9951h(Object obj) {
        m9954k().add(obj);
    }

    /* JADX INFO: renamed from: i */
    public void m9952i(String str, Object obj) {
        m9955l().add(new C2794c(str, obj));
    }

    /* JADX INFO: renamed from: j */
    public void m9953j(InterfaceC2440h interfaceC2440h) {
        if (this.f7279d == null) {
            this.f7279d = new ArrayList(2);
        }
        this.f7279d.add(interfaceC2440h);
    }

    /* JADX INFO: renamed from: k */
    public final List m9954k() {
        if (this.f7280e == null) {
            this.f7280e = new ArrayList(3);
        }
        return this.f7280e;
    }

    /* JADX INFO: renamed from: l */
    public final List m9955l() {
        if (this.f7281f == null) {
            this.f7281f = new ArrayList(4);
        }
        return this.f7281f;
    }

    /* JADX INFO: renamed from: m */
    public void m9956m(String str) {
        this.f7283h = str;
    }

    /* JADX INFO: renamed from: n */
    public void m9957n(String str) {
        this.f7278c = str;
    }

    /* JADX INFO: renamed from: o */
    public void m9958o(Throwable th) {
        this.f7282g = th;
    }
}
