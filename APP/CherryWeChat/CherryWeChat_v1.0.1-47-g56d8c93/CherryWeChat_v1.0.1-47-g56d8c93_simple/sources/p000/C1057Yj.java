package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: renamed from: Yj */
/* JADX INFO: loaded from: classes.dex */
public final class C1057Yj implements InterfaceC0802Sm {

    /* JADX INFO: renamed from: b */
    public final InterfaceC2506sk f3359b;

    /* JADX INFO: renamed from: c */
    public final URL f3360c;

    /* JADX INFO: renamed from: d */
    public final String f3361d;

    /* JADX INFO: renamed from: e */
    public String f3362e;

    /* JADX INFO: renamed from: f */
    public URL f3363f;

    /* JADX INFO: renamed from: g */
    public volatile byte[] f3364g;

    /* JADX INFO: renamed from: h */
    public int f3365h;

    public C1057Yj(URL r3) {
        C0288Gn r0 = InterfaceC2506sk.f8794a;
        AbstractC0714Qj.m1488j("Argument must not be null", r3);
        this.f3360c = r3;
        this.f3361d = null;
        AbstractC0714Qj.m1488j("Argument must not be null", r0);
        this.f3359b = r0;
    }

    @Override // p000.InterfaceC0802Sm
    /* JADX INFO: renamed from: b */
    public final void mo172b(MessageDigest r3) {
        if (this.f3364g != null) goto L5;
        this.f3364g = m2000c().getBytes(InterfaceC0802Sm.f2524a);
    L5:
        r3.update(this.f3364g);
    }

    /* JADX INFO: renamed from: c */
    public final String m2000c() {
        String r0 = this.f3361d;
        if (r0 == null) goto L5;
        return r0;
    L5:
        URL r1 = this.f3360c;
        AbstractC0714Qj.m1488j("Argument must not be null", r1);
        return r1.toString();
    }

    /* JADX INFO: renamed from: d */
    public final URL m2001d() {
        if (this.f3363f != null) goto L12;
        if (TextUtils.isEmpty(this.f3362e) == false) goto L10;
        String r1 = this.f3361d;
        if (TextUtils.isEmpty(r1) == false) goto L9;
        URL r2 = this.f3360c;
        AbstractC0714Qj.m1488j("Argument must not be null", r2);
        r1 = r2.toString();
    L9:
        this.f3362e = Uri.encode(r1, "@#&=*+-_.,:!?()/~'%;$");
    L10:
        this.f3363f = new URL(this.f3362e);
    L12:
        return this.f3363f;
    }

    @Override // p000.InterfaceC0802Sm
    public final boolean equals(Object r4) {
        if ((r4 instanceof C1057Yj) == false) goto L10;
        C1057Yj r42 = (C1057Yj) r4;
        if (m2000c().equals(r42.m2000c()) == false) goto L10;
        if (this.f3359b.equals(r42.f3359b) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // p000.InterfaceC0802Sm
    public final int hashCode() {
        if (this.f3365h != 0) goto L6;
        int r0 = m2000c().hashCode();
        this.f3365h = r0;
        int r1 = this.f3359b.hashCode();
        this.f3365h = r1 + (r0 * 31);
    L6:
        return this.f3365h;
    }

    public final String toString() {
        return m2000c();
    }

    public C1057Yj(String r3) {
        C0288Gn r0 = InterfaceC2506sk.f8794a;
        this.f3360c = null;
        if (TextUtils.isEmpty(r3) == true) goto L7;
        this.f3361d = r3;
        AbstractC0714Qj.m1488j("Argument must not be null", r0);
        this.f3359b = r0;
        return;
    L7:
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
