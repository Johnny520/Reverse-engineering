package p029F0;

import p041H0.C0569N;
import p186k.C2439u;

/* JADX INFO: renamed from: F0.u0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0429u0 {

    /* JADX INFO: renamed from: a */
    public static final C2439u f1292a;

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0425s0[] f1293b;

    static {
        C2439u c2439u = new C2439u(8);
        InterfaceC0425s0.f1282a.getClass();
        C0427t0 c0427t0 = C0423r0.f1275g;
        c2439u.m4344h(1, c0427t0);
        C0427t0 c0427t02 = C0423r0.f1274f;
        c2439u.m4344h(2, c0427t02);
        C0427t0 c0427t03 = C0423r0.f1270b;
        c2439u.m4344h(4, c0427t03);
        C0427t0 c0427t04 = C0423r0.f1272d;
        c2439u.m4344h(8, c0427t04);
        C0427t0 c0427t05 = C0423r0.f1276h;
        c2439u.m4344h(16, c0427t05);
        C0427t0 c0427t06 = C0423r0.f1273e;
        c2439u.m4344h(32, c0427t06);
        C0427t0 c0427t07 = C0423r0.f1277i;
        c2439u.m4344h(64, c0427t07);
        C0427t0 c0427t08 = C0423r0.f1271c;
        c2439u.m4344h(128, c0427t08);
        f1292a = c2439u;
        f1293b = new InterfaceC0425s0[]{c0427t0, c0427t02, c0427t03, c0427t07, c0427t05, c0427t06, c0427t04, C0423r0.f1278j, c0427t08};
    }

    /* JADX INFO: renamed from: a */
    public static final void m686a(C0569N c0569n, C0416o c0416o, long j5, int i5, int i6) {
        if (AbstractC0435z.m692e(j5, -1L)) {
            return;
        }
        c0569n.m877a(c0416o.m677b(), (int) ((j5 >>> 48) & 65535));
        c0569n.m877a(c0416o.m679d(), (int) ((j5 >>> 32) & 65535));
        c0569n.m877a(c0416o.m678c(), i5 - ((int) ((j5 >>> 16) & 65535)));
        c0569n.m877a(c0416o.m676a(), i6 - ((int) (j5 & 65535)));
    }
}
