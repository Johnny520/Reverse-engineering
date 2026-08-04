package yyds;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: yyds.ᲇᛸᛵᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2499 extends C2170 {
    @Override // yyds.C2170
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo1478(Object obj, Object obj2) {
        C0745 c0745 = (C0745) obj;
        c0745.getClass();
        ArrayDeque arrayDeque = C0745.f3443;
        synchronized (arrayDeque) {
            arrayDeque.offer(c0745);
        }
    }
}
