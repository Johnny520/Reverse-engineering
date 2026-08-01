package bsh;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: renamed from: bsh.d2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1163d2 extends Exception {

    /* JADX INFO: renamed from: q */
    public InterfaceC1188h3 f3518q;

    /* JADX INFO: renamed from: r */
    public String f3519r;

    /* JADX INFO: renamed from: s */
    public final C1174f1 f3520s;

    public C1163d2(String str, InterfaceC1188h3 interfaceC1188h3, C1174f1 c1174f1) {
        this.f3519r = str;
        this.f3518q = interfaceC1188h3;
        this.f3520s = c1174f1 == null ? null : c1174f1.m4313b();
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC1188h3 m4271a() {
        return this.f3518q;
    }

    /* JADX INFO: renamed from: b */
    public String m4272b() {
        return this.f3519r;
    }

    /* JADX INFO: renamed from: c */
    public String m4273c() {
        C1174f1 c1174f1 = this.f3520s;
        if (c1174f1 == null) {
            return "<Unknown>";
        }
        C1174f1 c1174f1M4313b = c1174f1.m4313b();
        String str = _UrlKt.FRAGMENT_ENCODE_SET;
        while (c1174f1M4313b.m4314c() > 0) {
            C1182g3 c1182g3M4316e = c1174f1M4313b.m4316e();
            InterfaceC1188h3 interfaceC1188h3M4346H = c1182g3M4316e.m4346H();
            if (c1182g3M4316e.f3569F) {
                str = str + "\nCalled from method: " + c1182g3M4316e.getName();
                if (interfaceC1188h3M4346H != null) {
                    str = str + " : at Line: " + interfaceC1188h3M4346H.getLineNumber() + " : in file: " + interfaceC1188h3M4346H.mo4038a() + " : " + interfaceC1188h3M4346H.getText();
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: d */
    public void m4274d(String str) {
        if (str == null) {
            return;
        }
        if (this.f3519r == null) {
            this.f3519r = str;
            return;
        }
        this.f3519r = str + " : " + this.f3519r;
    }

    /* JADX INFO: renamed from: e */
    public C1163d2 mo4275e(String str) {
        m4274d(str);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public void m4276f(InterfaceC1188h3 interfaceC1188h3) {
        this.f3518q = interfaceC1188h3;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        if (this.f3518q != null) {
            str = " : at Line: " + this.f3518q.getLineNumber() + " : in file: " + this.f3518q.mo4038a() + " : " + this.f3518q.getText();
        } else {
            str = ": <at unknown location>";
        }
        if (this.f3520s != null) {
            str = str + "\n" + m4273c();
        }
        return m4272b() + str;
    }

    public C1163d2(String str, InterfaceC1188h3 interfaceC1188h3, C1174f1 c1174f1, Throwable th) {
        this(str, interfaceC1188h3, c1174f1);
        initCause(th);
    }
}
