package yyds;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: yyds.ᛲᛵᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0362 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final ArrayDeque f1876;

    public C0362(int i) {
        switch (i) {
            case 1:
                this.f1876 = new ArrayDeque();
                break;
            default:
                this.f1876 = new ArrayDeque(0);
                break;
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public synchronized void m1060(C1929 c1929) {
        c1929.f9724 = null;
        c1929.f9725 = null;
        this.f1876.offer(c1929);
    }
}
