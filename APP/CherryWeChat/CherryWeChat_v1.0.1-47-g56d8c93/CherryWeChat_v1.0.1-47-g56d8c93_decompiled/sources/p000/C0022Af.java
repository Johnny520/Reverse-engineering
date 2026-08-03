package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: Af */
/* JADX INFO: loaded from: classes.dex */
public final class C0022Af {

    /* JADX INFO: renamed from: a */
    public int f39a = 1;

    /* JADX INFO: renamed from: b */
    public final C0722Qr f40b;

    /* JADX INFO: renamed from: c */
    public C0722Qr f41c;

    /* JADX INFO: renamed from: d */
    public C0722Qr f42d;

    /* JADX INFO: renamed from: e */
    public int f43e;

    /* JADX INFO: renamed from: f */
    public int f44f;

    public C0022Af(C0722Qr c0722Qr) {
        this.f40b = c0722Qr;
        this.f41c = c0722Qr;
    }

    /* JADX INFO: renamed from: a */
    public final void m32a() {
        this.f39a = 1;
        this.f41c = this.f40b;
        this.f44f = 0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m33b() {
        C0636Or c0636OrM1992b = this.f41c.f2309b.m1992b();
        int iM4624a = c0636OrM1992b.m4624a(6);
        return !(iM4624a == 0 || ((ByteBuffer) c0636OrM1992b.f8037d).get(iM4624a + c0636OrM1992b.f8034a) == 0) || this.f43e == 65039;
    }
}
