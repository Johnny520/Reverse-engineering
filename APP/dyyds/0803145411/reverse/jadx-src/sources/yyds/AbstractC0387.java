package yyds;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: yyds.ᛲᛷᛱᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0387 extends AbstractC0359 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C0399 f1986;

    public AbstractC0387(C2810 c2810) {
        ExecutorService executorServiceNewFixedThreadPool;
        C2806 c2806 = new C2806(this);
        C0052 c0052 = new C0052(4, this);
        synchronized (C2810.f13697) {
            try {
                executorServiceNewFixedThreadPool = C2810.f13698;
                if (executorServiceNewFixedThreadPool == null) {
                    executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2);
                    C2810.f13698 = executorServiceNewFixedThreadPool;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0399 c0399 = new C0399(c0052, new C2133(executorServiceNewFixedThreadPool, 7, c2810));
        this.f1986 = c0399;
        c0399.f2107.add(c2806);
    }

    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final int mo531() {
        return this.f1986.f2106.size();
    }
}
