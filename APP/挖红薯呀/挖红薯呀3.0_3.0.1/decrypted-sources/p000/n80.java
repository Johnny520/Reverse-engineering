package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class n80 implements f70 {

    /* JADX INFO: renamed from: a */
    public final c90 f4206a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n80(c90 c90Var) {
        this.f4206a = c90Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f70
    /* JADX INFO: renamed from: a */
    public final int mo1044a() {
        return this.f4206a.m506g().f6458n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f70
    /* JADX INFO: renamed from: b */
    public final int mo1045b() {
        return Math.min(mo1044a() - 1, ((w80) AbstractC0960ye.m5246P(this.f4206a.m506g().f6455k)).f7031a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f70
    /* JADX INFO: renamed from: c */
    public final boolean mo1046c() {
        return !this.f4206a.m506g().f6455k.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f70
    /* JADX INFO: renamed from: d */
    public final int mo1047d() {
        int i;
        c90 c90Var = this.f4206a;
        int size = 0;
        if (c90Var.m506g().f6455k.isEmpty()) {
            return 0;
        }
        v80 v80VarM506g = c90Var.m506g();
        int iM4421g = (int) (v80VarM506g.f6459o == um0.f6264d ? v80VarM506g.m4421g() & 4294967295L : v80VarM506g.m4421g() >> 32);
        v80 v80VarM506g2 = c90Var.m506g();
        List list = v80VarM506g2.f6455k;
        if (!list.isEmpty()) {
            int size2 = list.size();
            int i2 = 0;
            while (size < size2) {
                i2 += ((w80) list.get(size)).f7040j;
                size++;
            }
            size = (i2 / list.size()) + v80VarM506g2.f6461q;
        }
        if (size != 0 && (i = iM4421g / size) >= 1) {
            return i;
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f70
    /* JADX INFO: renamed from: e */
    public final int mo1048e() {
        return Math.max(0, ((dp0) this.f4206a.f743e.f1697b).m720g());
    }
}
