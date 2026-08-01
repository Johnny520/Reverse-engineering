package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class b80 {

    /* JADX INFO: renamed from: a */
    public final int f445a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f446b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ d80 f447c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b80(d80 d80Var, int i) {
        this.f447c = d80Var;
        this.f445a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m325a(int i) {
        d80 d80Var = this.f447c;
        d50 d50Var = d80Var.f991c;
        if (d50Var == null) {
            return;
        }
        this.f446b.add(new bs0(d50Var, i, d80Var.f990b, null));
    }
}
