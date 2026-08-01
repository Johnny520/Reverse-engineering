package gf;

import java.util.ArrayList;
import java.util.List;
import p086ff.InterfaceC2440h;
import p116hf.C3031n;

/* JADX INFO: renamed from: gf.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2797f implements InterfaceC2796e {

    /* JADX INFO: renamed from: a */
    public EnumC2795d f7297a;

    /* JADX INFO: renamed from: b */
    public List f7298b;

    /* JADX INFO: renamed from: c */
    public String f7299c;

    /* JADX INFO: renamed from: d */
    public C3031n f7300d;

    /* JADX INFO: renamed from: e */
    public String f7301e;

    /* JADX INFO: renamed from: f */
    public String f7302f;

    /* JADX INFO: renamed from: g */
    public Object[] f7303g;

    /* JADX INFO: renamed from: h */
    public List f7304h;

    /* JADX INFO: renamed from: i */
    public long f7305i;

    /* JADX INFO: renamed from: j */
    public Throwable f7306j;

    @Override // gf.InterfaceC2796e
    /* JADX INFO: renamed from: a */
    public List mo9944a() {
        return this.f7304h;
    }

    @Override // gf.InterfaceC2796e
    /* JADX INFO: renamed from: b */
    public String mo9945b() {
        return this.f7302f;
    }

    @Override // gf.InterfaceC2796e
    /* JADX INFO: renamed from: d */
    public Object[] mo9947d() {
        return this.f7303g;
    }

    @Override // gf.InterfaceC2796e
    /* JADX INFO: renamed from: e */
    public EnumC2795d mo9948e() {
        return this.f7297a;
    }

    @Override // gf.InterfaceC2796e
    /* JADX INFO: renamed from: f */
    public List mo9949f() {
        return this.f7298b;
    }

    @Override // gf.InterfaceC2796e
    /* JADX INFO: renamed from: g */
    public Throwable mo9950g() {
        return this.f7306j;
    }

    /* JADX INFO: renamed from: h */
    public void m9962h(InterfaceC2440h interfaceC2440h) {
        if (interfaceC2440h == null) {
            return;
        }
        if (this.f7298b == null) {
            this.f7298b = new ArrayList(2);
        }
        this.f7298b.add(interfaceC2440h);
    }

    /* JADX INFO: renamed from: i */
    public C3031n m9963i() {
        return this.f7300d;
    }

    /* JADX INFO: renamed from: j */
    public void m9964j(Object[] objArr) {
        this.f7303g = objArr;
    }

    /* JADX INFO: renamed from: k */
    public void m9965k(EnumC2795d enumC2795d) {
        this.f7297a = enumC2795d;
    }

    /* JADX INFO: renamed from: l */
    public void m9966l(C3031n c3031n) {
        this.f7300d = c3031n;
    }

    /* JADX INFO: renamed from: m */
    public void m9967m(String str) {
        this.f7299c = str;
    }

    /* JADX INFO: renamed from: n */
    public void m9968n(String str) {
        this.f7302f = str;
    }

    /* JADX INFO: renamed from: o */
    public void m9969o(String str) {
        this.f7301e = str;
    }

    /* JADX INFO: renamed from: p */
    public void m9970p(Throwable th) {
        this.f7306j = th;
    }

    /* JADX INFO: renamed from: q */
    public void m9971q(long j10) {
        this.f7305i = j10;
    }
}
