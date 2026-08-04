package yyds;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: yyds.ᛳᲈᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0745 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final ArrayDeque f3443 = new ArrayDeque(0);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public Object f3444;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C0745 m1698(Object obj) {
        C0745 c0745;
        ArrayDeque arrayDeque = f3443;
        synchronized (arrayDeque) {
            c0745 = (C0745) arrayDeque.poll();
        }
        if (c0745 == null) {
            c0745 = new C0745();
        }
        c0745.f3444 = obj;
        return c0745;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0745) && this.f3444.equals(((C0745) obj).f3444);
    }

    public final int hashCode() {
        return this.f3444.hashCode();
    }
}
