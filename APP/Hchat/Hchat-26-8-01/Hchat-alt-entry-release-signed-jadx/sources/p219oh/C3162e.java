package p219oh;

import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import mh.InterfaceC2844b;
import p200nh.C3023a;
import p200nh.C3024b;

/* JADX INFO: renamed from: oh.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3162e implements InterfaceC2844b {

    /* JADX INFO: renamed from: g */
    public final String f10218g;

    /* JADX INFO: renamed from: h */
    public volatile InterfaceC2844b f10219h;

    /* JADX INFO: renamed from: i */
    public Boolean f10220i;

    /* JADX INFO: renamed from: j */
    public Method f10221j;

    /* JADX INFO: renamed from: k */
    public C3023a f10222k;

    /* JADX INFO: renamed from: l */
    public final Queue f10223l;

    /* JADX INFO: renamed from: m */
    public final boolean f10224m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3162e(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z9) {
        this.f10218g = str;
        this.f10223l = linkedBlockingQueue;
        this.f10224m = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final InterfaceC2844b m6747A() {
        if (this.f10219h != null) {
            return this.f10219h;
        }
        if (this.f10224m) {
            return C3159b.f10213g;
        }
        if (this.f10222k == null) {
            Queue queue = this.f10223l;
            C3023a c3023a = new C3023a();
            c3023a.f9825h = this;
            c3023a.f9824g = this.f10218g;
            c3023a.f9826i = queue;
            this.f10222k = c3023a;
        }
        return this.f10222k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final boolean m6748B() {
        Boolean bool = this.f10220i;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f10221j = this.f10219h.getClass().getMethod("log", C3024b.class);
            this.f10220i = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f10220i = Boolean.FALSE;
        }
        return this.f10220i.booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: a */
    public final void mo6247a(Object obj, String str) {
        m6747A().mo6247a(obj, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: b */
    public final void mo6248b() {
        m6747A().mo6248b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: c */
    public final boolean mo6249c() {
        return m6747A().mo6249c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: d */
    public final boolean mo6250d() {
        return m6747A().mo6250d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: e */
    public final void mo6251e(String str, Throwable th2) {
        m6747A().mo6251e(str, th2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C3162e.class == obj.getClass() && this.f10218g.equals(((C3162e) obj).f10218g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: f */
    public final void mo6252f(Integer num, Object obj) {
        m6747A().mo6252f(num, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: g */
    public final boolean mo6253g() {
        return m6747A().mo6253g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    public final String getName() {
        return this.f10218g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: h */
    public final void mo6254h(Object obj, String str) {
        m6747A().mo6254h(obj, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10218g.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: i */
    public final void mo6255i(String str, Object... objArr) {
        m6747A().mo6255i(str, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: j */
    public final boolean mo6256j() {
        return m6747A().mo6256j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: k */
    public final void mo6257k(String str, Long l10) {
        m6747A().mo6257k(str, l10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: l */
    public final void mo6258l(String str) {
        m6747A().mo6258l(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: m */
    public final boolean mo6259m() {
        return m6747A().mo6259m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: n */
    public final void mo6260n(Object obj, String str, Object obj2) {
        m6747A().mo6260n(obj, str, obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: o */
    public final void mo6261o(String str, Object... objArr) {
        m6747A().mo6261o(str, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: p */
    public final void mo6262p(Object obj, String str, Object obj2) {
        m6747A().mo6262p(obj, str, obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: q */
    public final void mo6263q(Object... objArr) {
        m6747A().mo6263q(objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: r */
    public final void mo6264r(Object obj, String str) {
        m6747A().mo6264r(obj, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: s */
    public final void mo6265s(Object obj, String str, Object obj2) {
        m6747A().mo6265s(obj, str, obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: t */
    public final void mo6266t(String str, Throwable th2) {
        m6747A().mo6266t(str, th2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: u */
    public final void mo6267u(Exception exc) {
        m6747A().mo6267u(exc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: v */
    public final void mo6268v(String str) {
        m6747A().mo6268v(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: w */
    public final boolean mo6269w(int i9) {
        return m6747A().mo6269w(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: x */
    public final void mo6270x(Object obj, String str) {
        m6747A().mo6270x(obj, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: y */
    public final void mo6271y(Object obj, String str, Object obj2) {
        m6747A().mo6271y(obj, str, obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: z */
    public final void mo6272z(Object... objArr) {
        m6747A().mo6272z(objArr);
    }
}
