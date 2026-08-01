package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class cq0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f875a;

    /* JADX INFO: renamed from: b */
    public final int f876b;

    /* JADX INFO: renamed from: c */
    public int f877c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f878d;

    /* JADX INFO: renamed from: e */
    public final ug0 f879e;

    /* JADX INFO: renamed from: f */
    public final x51 f880f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cq0(int i, ArrayList arrayList) {
        this.f875a = arrayList;
        this.f876b = i;
        if (i < 0) {
            wr0.m5024a("Invalid start index");
        }
        this.f878d = new ArrayList();
        ug0 ug0Var = new ug0();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            z40 z40Var = (z40) this.f875a.get(i3);
            int i4 = z40Var.f7796c;
            int i5 = z40Var.f7797d;
            ug0Var.m4330i(i4, new C0109cy(i3, i2, i5));
            i2 += i5;
        }
        this.f879e = ug0Var;
        this.f880f = new x51(new bq0(this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m598a(int i, int i2) {
        C0109cy c0109cy;
        int i3;
        int i4;
        ug0 ug0Var = this.f879e;
        C0109cy c0109cy2 = (C0109cy) ug0Var.m4248b(i);
        if (c0109cy2 == null) {
            return false;
        }
        int i5 = c0109cy2.f911b;
        int i6 = i2 - c0109cy2.f912c;
        c0109cy2.f912c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = ug0Var.f6113c;
        long[] jArr = ug0Var.f6111a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (c0109cy = (C0109cy) objArr[(i7 << 3) + i9]).f911b) >= i5 && c0109cy != c0109cy2 && (i4 = i3 + i6) >= 0) {
                        c0109cy.f911b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
