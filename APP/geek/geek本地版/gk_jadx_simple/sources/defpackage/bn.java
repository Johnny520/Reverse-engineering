package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bn {
    public int a;
    public int b;
    public int[] c;
    public int d;

    public final void a(int r6, int r7) {
        if (r6 < 0) goto L15;
        if (r7 < 0) goto L13;
        int r0 = this.d;
        int r1 = r0 * 2;
        int[] r2 = this.c;
        if (r2 != null) goto L8;
        int[] r02 = new int[4];
        this.c = r02;
        Arrays.fill(r02, -1);
    L10:
        int[] r03 = this.c;
        r03[r1] = r6;
        r03[r1 + 1] = r7;
        this.d++;
        return;
    L8:
        if (r1 < r2.length) goto L10;
        int[] r04 = new int[r0 * 4];
        this.c = r04;
        System.arraycopy(r2, 0, r04, 0, r2.length);
        goto L10
    L13:
        throw new IllegalArgumentException("Pixel distance must be non-negative");
    L15:
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }

    public final void b(RecyclerView r5, boolean r6) {
        this.d = 0;
        int[] r0 = this.c;
        if (r0 == null) goto L5;
        Arrays.fill(r0, -1);
    L5:
        nz r02 = r5.l;
        if (r5.k == null) goto L21;
        if (r02 != null) goto L9;
        return;
    L9:
        if (r02.i == false) goto L23;
        if (r6 == false) goto L15;
        if (r5.d.f() == true) goto L17;
        r02.i(r5.k.a(), this);
    L17:
        int r1 = this.d;
        if (r1 <= r02.j) goto L24;
        r02.j = r1;
        r02.k = r6;
        r5.b.k();
        return;
    L24:
        return;
    L15:
        if (r5.K() == true) goto L17;
        r02.h(this.a, this.b, r5.c0, this);
        goto L17
    L23:
        return;
    }
}
