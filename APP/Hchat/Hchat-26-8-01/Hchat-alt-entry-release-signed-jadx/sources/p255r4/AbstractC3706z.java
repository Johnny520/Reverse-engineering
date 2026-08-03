package p255r4;

import bsh.C0353j;

/* JADX INFO: renamed from: r4.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3706z extends AbstractC3660a0 {

    /* JADX INFO: renamed from: g */
    public int f12039g = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m7709e() {
        int i9 = this.f12039g;
        if (i9 >= 0) {
            return i9;
        }
        C0353j.m1309g("index not yet set");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final String m7710f() {
        return "[" + Integer.toHexString(this.f12039g) + ']';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m7711g(int i9) {
        if (this.f12039g == -1) {
            this.f12039g = i9;
        } else {
            C0353j.m1309g("index already set");
        }
    }
}
