package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class pn0 {

    /* JADX INFO: renamed from: a */
    public final ug0 f4931a;

    /* JADX INFO: renamed from: b */
    public final ug0 f4932b;

    /* JADX INFO: renamed from: c */
    public int f4933c;

    /* JADX INFO: renamed from: d */
    public int f4934d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pn0(jo0 jo0Var, d80 d80Var, go0 go0Var) {
        ug0 ug0Var = v20.f6389a;
        this.f4931a = new ug0();
        new vg0();
        this.f4932b = new ug0();
        this.f4933c = Integer.MAX_VALUE;
        this.f4934d = Integer.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m3144a() {
        this.f4933c = Integer.MAX_VALUE;
        this.f4934d = Integer.MIN_VALUE;
        this.f4932b.m4324c();
        ug0 ug0Var = this.f4931a;
        long[] jArr = ug0Var.f6111a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = ug0Var.f6112b[i4];
                        List list = (List) ug0Var.f6113c[i4];
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((c80) list.get(i6)).cancel();
                        }
                        ug0Var.m4329h(i4);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
