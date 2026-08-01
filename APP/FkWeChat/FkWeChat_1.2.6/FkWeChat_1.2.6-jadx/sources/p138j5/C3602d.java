package p138j5;

import p154k5.C3975i;
import p239q5.C6271v;

/* JADX INFO: renamed from: j5.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3602d {

    /* JADX INFO: renamed from: a */
    public int f10005a = 0;

    /* JADX INFO: renamed from: b */
    public int f10006b = 0;

    /* JADX INFO: renamed from: c */
    public int f10007c = 0;

    /* JADX INFO: renamed from: d */
    public int f10008d = 0;

    /* JADX INFO: renamed from: e */
    public int f10009e = 0;

    /* JADX INFO: renamed from: f */
    public int f10010f = 0;

    /* JADX INFO: renamed from: g */
    public int f10011g = 0;

    /* JADX INFO: renamed from: a */
    public void m13475a(C3975i c3975i, C3975i c3975i2) {
        this.f10009e += c3975i2.m15762f().m15786E() - c3975i.m15762f().m15786E();
        this.f10008d += c3975i2.m15762f().m15789H() - c3975i.m15762f().m15789H();
        this.f10010f += c3975i2.m15762f().m15786E();
    }

    /* JADX INFO: renamed from: b */
    public void m13476b(int i10) {
        this.f10011g += i10;
    }

    /* JADX INFO: renamed from: c */
    public void m13477c(C6271v c6271v, C6271v c6271v2) {
        int iM24674M = c6271v.m24804b().m24674M();
        int iM24677P = c6271v.m24804b().m24677P();
        int iM24674M2 = c6271v2.m24804b().m24674M();
        this.f10006b += iM24674M2 - iM24674M;
        this.f10005a += c6271v2.m24804b().m24677P() - iM24677P;
        this.f10007c += iM24674M2;
    }
}
