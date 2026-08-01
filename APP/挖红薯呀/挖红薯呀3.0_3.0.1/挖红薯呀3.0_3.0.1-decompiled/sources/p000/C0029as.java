package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: as */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0029as {

    /* JADX INFO: renamed from: a */
    public int f248a = 1;

    /* JADX INFO: renamed from: b */
    public final he0 f249b;

    /* JADX INFO: renamed from: c */
    public he0 f250c;

    /* JADX INFO: renamed from: d */
    public he0 f251d;

    /* JADX INFO: renamed from: e */
    public int f252e;

    /* JADX INFO: renamed from: f */
    public int f253f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0029as(he0 he0Var) {
        this.f249b = he0Var;
        this.f250c = he0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m199a() {
        this.f248a = 1;
        this.f250c = this.f249b;
        this.f253f = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m200b() {
        fe0 fe0VarM5225b = this.f250c.f2222b.m5225b();
        int iM925a = fe0VarM5225b.m925a(6);
        return !(iM925a == 0 || ((ByteBuffer) fe0VarM5225b.f1423g).get(iM925a + fe0VarM5225b.f1420d) == 0) || this.f252e == 65039;
    }
}
