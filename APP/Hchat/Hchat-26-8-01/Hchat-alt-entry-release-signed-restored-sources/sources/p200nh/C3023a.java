package p200nh;

import java.io.Serializable;
import java.util.Queue;
import mh.InterfaceC2844b;
import p136j8.C2104o;
import p219oh.C3162e;

/* JADX INFO: renamed from: nh.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3023a implements InterfaceC2844b, Serializable {

    /* JADX INFO: renamed from: g */
    public String f9824g;

    /* JADX INFO: renamed from: h */
    public C3162e f9825h;

    /* JADX INFO: renamed from: i */
    public Queue f9826i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final void m6420A(int i9, Object obj, Object obj2, String str) {
        if (obj2 instanceof Throwable) {
            m6422C(i9, new Object[]{obj});
        } else {
            m6422C(i9, new Object[]{obj, obj2});
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6421B(int i9, String str, Object[] objArr) {
        Throwable th2;
        if (objArr.length == 0) {
            th2 = null;
        } else {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                th2 = (Throwable) obj;
            }
        }
        if (th2 == null) {
            m6422C(i9, objArr);
            return;
        }
        if (objArr.length == 0) {
            C2104o.m5276A("non-sensical empty or null argument array");
            return;
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        if (length > 0) {
            System.arraycopy(objArr, 0, objArr2, 0, length);
        }
        m6422C(i9, objArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final void m6422C(int i9, Object[] objArr) {
        C3024b c3024b = new C3024b();
        System.currentTimeMillis();
        c3024b.f9827a = i9;
        c3024b.f9828b = this.f9825h;
        Thread.currentThread().getName();
        c3024b.f9829c = objArr;
        this.f9826i.add(c3024b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: a */
    public final void mo6247a(Object obj, String str) {
        m6422C(3, new Object[]{obj});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: b */
    public final void mo6248b() {
        m6422C(3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: c */
    public final boolean mo6249c() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: d */
    public final boolean mo6250d() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: e */
    public final void mo6251e(String str, Throwable th2) {
        m6422C(1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: f */
    public final void mo6252f(Integer num, Object obj) {
        m6420A(3, obj, num, "Found resource shared library {}, pkgId: {}");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: g */
    public final boolean mo6253g() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    public final String getName() {
        return this.f9824g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: h */
    public final void mo6254h(Object obj, String str) {
        m6422C(2, new Object[]{obj});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: i */
    public final void mo6255i(String str, Object... objArr) {
        m6421B(2, str, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: j */
    public final boolean mo6256j() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: k */
    public final void mo6257k(String str, Long l10) {
        m6422C(5, new Object[]{l10});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: l */
    public final void mo6258l(String str) {
        m6422C(4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: m */
    public final boolean mo6259m() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: n */
    public final void mo6260n(Object obj, String str, Object obj2) {
        m6420A(1, obj, obj2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: o */
    public final void mo6261o(String str, Object... objArr) {
        m6421B(4, str, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: p */
    public final void mo6262p(Object obj, String str, Object obj2) {
        m6420A(5, obj, obj2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: q */
    public final void mo6263q(Object... objArr) {
        m6421B(1, "Potential zip bomb attack detected, invalid sizes: compressed {}, uncompressed {}, name {}", objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: r */
    public final void mo6264r(Object obj, String str) {
        m6422C(1, new Object[]{obj});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: s */
    public final void mo6265s(Object obj, String str, Object obj2) {
        m6420A(2, obj, obj2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: t */
    public final void mo6266t(String str, Throwable th2) {
        m6422C(4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: u */
    public final void mo6267u(Exception exc) {
        m6422C(2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: v */
    public final void mo6268v(String str) {
        m6422C(2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: x */
    public final void mo6270x(Object obj, String str) {
        m6422C(4, new Object[]{obj});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: y */
    public final void mo6271y(Object obj, String str, Object obj2) {
        m6420A(4, obj, obj2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2844b
    /* JADX INFO: renamed from: z */
    public final void mo6272z(Object... objArr) {
        m6421B(3, "Loaded classes: {}, methods: {}, instructions: {}", objArr);
    }
}
