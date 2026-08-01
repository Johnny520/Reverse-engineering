package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class yz0 {

    /* JADX INFO: renamed from: a */
    public final sz0 f7742a;

    /* JADX INFO: renamed from: b */
    public final vg0 f7743b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yz0(xz0 xz0Var, u20 u20Var) {
        this.f7742a = xz0Var.f7471d;
        this.f7743b = new vg0(xz0.m5178j(4, xz0Var).size());
        List listM5178j = xz0.m5178j(4, xz0Var);
        int size = listM5178j.size();
        for (int i = 0; i < size; i++) {
            xz0 xz0Var2 = (xz0) listM5178j.get(i);
            if (u20Var.m4247a(xz0Var2.f7474g)) {
                this.f7743b.m4744a(xz0Var2.f7474g);
            }
        }
    }
}
