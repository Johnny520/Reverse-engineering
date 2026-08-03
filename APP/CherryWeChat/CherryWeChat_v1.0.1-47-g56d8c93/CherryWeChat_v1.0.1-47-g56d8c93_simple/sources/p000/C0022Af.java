package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: Af */
/* JADX INFO: loaded from: classes.dex */
public final class C0022Af {

    /* JADX INFO: renamed from: a */
    public int f39a;

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

    public C0022Af(C0722Qr r2) {
        this.f39a = 1;
        this.f40b = r2;
        this.f41c = r2;
    }

    /* JADX INFO: renamed from: a */
    public final void m32a() {
        this.f39a = 1;
        this.f41c = this.f40b;
        this.f44f = 0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m33b() {
        C0636Or r0 = this.f41c.f2309b.m1992b();
        int r1 = r0.m4624a(6);
        if (r1 == 0) goto L8;
        if (((ByteBuffer) r0.f8037d).get(r1 + r0.f8034a) == 0) goto L8;
        return true;
    L8:
        if (this.f43e != 65039) goto L10;
        return true;
    L10:
        return false;
    }
}
