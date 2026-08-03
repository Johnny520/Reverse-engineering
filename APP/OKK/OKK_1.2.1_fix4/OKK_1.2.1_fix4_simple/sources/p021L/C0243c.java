package p021L;

import android.graphics.Rect;
import java.util.Comparator;
import p008E.C0156j;
import p089x0.C1121e;

/* JADX INFO: renamed from: L.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0243c implements Comparator {

    /* JADX INFO: renamed from: a */
    public final Rect f497a;

    /* JADX INFO: renamed from: b */
    public final Rect f498b;

    /* JADX INFO: renamed from: c */
    public final boolean f499c;

    /* JADX INFO: renamed from: d */
    public final C1121e f500d;

    public C0243c(boolean r2, C1121e r3) {
        this.f497a = new Rect();
        this.f498b = new Rect();
        this.f499c = r2;
        this.f500d = r3;
    }

    @Override // java.util.Comparator
    public final int compare(Object r6, Object r7) {
        this.f500d.getClass();
        Rect r02 = this.f497a;
        ((C0156j) r6).m509f(r02);
        Rect r62 = this.f498b;
        ((C0156j) r7).m509f(r62);
        int r72 = r02.top;
        int r1 = r62.top;
        if (r72 >= r1) goto L6;
        return -1;
    L6:
        if (r72 <= r1) goto L8;
        return 1;
    L8:
        int r73 = r02.left;
        int r12 = r62.left;
        boolean r4 = this.f499c;
        if (r73 >= r12) goto L13;
        if (r4 == true) goto L12;
        return -1;
    L12:
        return 1;
    L13:
        if (r73 <= r12) goto L18;
        if (r4 == false) goto L17;
        return -1;
    L17:
        return 1;
    L18:
        int r74 = r02.bottom;
        int r13 = r62.bottom;
        if (r74 >= r13) goto L21;
        return -1;
    L21:
        if (r74 <= r13) goto L23;
        return 1;
    L23:
        int r75 = r02.right;
        int r63 = r62.right;
        if (r75 >= r63) goto L28;
        if (r4 == true) goto L27;
        return -1;
    L27:
        return 1;
    L28:
        if (r75 <= r63) goto L33;
        if (r4 == false) goto L32;
        return -1;
    L32:
        return 1;
    L33:
        return 0;
    }
}
