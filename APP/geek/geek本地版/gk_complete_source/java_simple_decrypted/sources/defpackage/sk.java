package defpackage;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class sk implements Comparator {
    public final Rect a;
    public final Rect b;
    public final boolean c;
    public final vh d;

    public sk(vh r2, boolean r3) {
        this.a = new Rect();
        this.b = new Rect();
        this.c = r3;
        this.d = r2;
    }

    @Override // java.util.Comparator
    public final int compare(Object r4, Object r5) {
        this.d.getClass();
        Rect r0 = this.a;
        ((j0) r4).d(r0);
        Rect r42 = this.b;
        ((j0) r5).d(r42);
        int r52 = r0.top;
        int r1 = r42.top;
        if (r52 < r1) goto L33;
        if (r52 > r1) goto L37;
        int r53 = r0.left;
        int r12 = r42.left;
        boolean r2 = this.c;
        if (r53 >= r12) goto L11;
        if (r2 == true) goto L38;
        return -1;
    L38:
        return 1;
    L11:
        if (r53 <= r12) goto L14;
        if (r2 == true) goto L34;
        return 1;
    L34:
        return -1;
    L14:
        int r54 = r0.bottom;
        int r13 = r42.bottom;
        if (r54 < r13) goto L35;
        if (r54 > r13) goto L39;
        int r55 = r0.right;
        int r43 = r42.right;
        if (r55 >= r43) goto L23;
        if (r2 == true) goto L40;
        return -1;
    L40:
        return 1;
    L23:
        if (r55 <= r43) goto L29;
        if (r2 == false) goto L36;
        return -1;
    L36:
        return 1;
    L29:
        return 0;
    L39:
        return 1;
    L35:
        return -1;
    L37:
        return 1;
    L33:
        return -1;
    }
}
