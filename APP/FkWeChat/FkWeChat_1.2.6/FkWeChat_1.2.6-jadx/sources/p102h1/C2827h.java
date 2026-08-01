package p102h1;

import androidx.compose.runtime.InterfaceC0472c4;
import java.util.Arrays;
import okhttp3.C5754i;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1061t;
import p102h1.InterfaceC2837r;
import p376zd.C9987e;

/* JADX INFO: renamed from: h1.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2827h implements InterfaceC2821b0, InterfaceC0472c4 {

    /* JADX INFO: renamed from: q */
    public InterfaceC2843x f7371q;

    /* JADX INFO: renamed from: r */
    public InterfaceC2837r f7372r;

    /* JADX INFO: renamed from: s */
    public String f7373s;

    /* JADX INFO: renamed from: t */
    public Object f7374t;

    /* JADX INFO: renamed from: u */
    public Object[] f7375u;

    /* JADX INFO: renamed from: v */
    public InterfaceC2837r.a f7376v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC0173a f7377w = new InterfaceC0173a() { // from class: h1.g
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return C2827h.m10056c(this.f7370q);
        }
    };

    public C2827h(InterfaceC2843x interfaceC2843x, InterfaceC2837r interfaceC2837r, String str, Object obj, Object[] objArr) {
        this.f7371q = interfaceC2843x;
        this.f7372r = interfaceC2837r;
        this.f7373s = str;
        this.f7374t = obj;
        this.f7375u = objArr;
    }

    /* JADX INFO: renamed from: c */
    public static Object m10056c(C2827h c2827h) {
        InterfaceC2843x interfaceC2843x = c2827h.f7371q;
        Object obj = c2827h.f7374t;
        if (obj != null) {
            return interfaceC2843x.mo10038b(c2827h, obj);
        }
        C9987e.m38645a("Value should be initialized");
        return null;
    }

    @Override // p102h1.InterfaceC2821b0
    /* JADX INFO: renamed from: a */
    public boolean mo10041a(Object obj) {
        InterfaceC2837r interfaceC2837r = this.f7372r;
        return interfaceC2837r == null || interfaceC2837r.mo1346a(obj);
    }

    @Override // androidx.compose.runtime.InterfaceC0472c4
    /* JADX INFO: renamed from: b */
    public void mo1532b() {
        InterfaceC2837r.a aVar = this.f7376v;
        if (aVar != null) {
            aVar.mo10077a();
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m10057d(Object[] objArr) {
        if (Arrays.equals(objArr, this.f7375u)) {
            return this.f7374t;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m10058e() {
        InterfaceC2837r interfaceC2837r = this.f7372r;
        if (this.f7376v != null) {
            C5754i.m23255a("entry(", this.f7376v, ") is not null");
        } else if (interfaceC2837r != null) {
            AbstractC2825f.m10055n(interfaceC2837r, this.f7377w.invoke());
            this.f7376v = interfaceC2837r.mo1349d(this.f7373s, this.f7377w);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m10059f(InterfaceC2843x interfaceC2843x, InterfaceC2837r interfaceC2837r, String str, Object obj, Object[] objArr) {
        boolean z10;
        boolean z11 = true;
        if (this.f7372r != interfaceC2837r) {
            this.f7372r = interfaceC2837r;
            z10 = true;
        } else {
            z10 = false;
        }
        if (AbstractC1061t.m3842c(this.f7373s, str)) {
            z11 = z10;
        } else {
            this.f7373s = str;
        }
        this.f7371q = interfaceC2843x;
        this.f7374t = obj;
        this.f7375u = objArr;
        InterfaceC2837r.a aVar = this.f7376v;
        if (aVar == null || !z11) {
            return;
        }
        if (aVar != null) {
            aVar.mo10077a();
        }
        this.f7376v = null;
        m10058e();
    }

    @Override // androidx.compose.runtime.InterfaceC0472c4
    /* JADX INFO: renamed from: g */
    public void mo1533g() {
        InterfaceC2837r.a aVar = this.f7376v;
        if (aVar != null) {
            aVar.mo10077a();
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0472c4
    /* JADX INFO: renamed from: i */
    public void mo1534i() {
        m10058e();
    }
}
