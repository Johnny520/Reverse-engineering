package p000;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: n6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2263n6 {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f7981a;

    public C2263n6(int i) {
        switch (i) {
            case 1:
                this.f7981a = new ArrayDeque();
                break;
            default:
                char[] cArr = AbstractC2622vD.f9104a;
                this.f7981a = new ArrayDeque(0);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m4602a(C0413Jj c0413Jj) {
        c0413Jj.f1383b = null;
        c0413Jj.f1384c = null;
        this.f7981a.offer(c0413Jj);
    }
}
