package p000;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: renamed from: Jh */
/* JADX INFO: loaded from: classes.dex */
public final class C0411Jh implements Comparator {

    /* JADX INFO: renamed from: a */
    public final Rect f1377a;

    /* JADX INFO: renamed from: b */
    public final Rect f1378b;

    /* JADX INFO: renamed from: c */
    public final boolean f1379c;

    /* JADX INFO: renamed from: d */
    public final C0668Pg f1380d;

    public C0411Jh(boolean r2, C0668Pg r3) {
        this.f1377a = new Rect();
        this.f1378b = new Rect();
        this.f1379c = r2;
        this.f1380d = r3;
    }

    @Override // java.util.Comparator
    public final int compare(Object r4, Object r5) {
        this.f1380d.getClass();
        Rect r0 = this.f1377a;
        ((C1118a0) r4).m2044f(r0);
        Rect r42 = this.f1378b;
        ((C1118a0) r5).m2044f(r42);
        int r52 = r0.top;
        int r1 = r42.top;
        if (r52 < r1) goto L33;
        if (r52 > r1) goto L37;
        int r53 = r0.left;
        int r12 = r42.left;
        boolean r2 = this.f1379c;
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
