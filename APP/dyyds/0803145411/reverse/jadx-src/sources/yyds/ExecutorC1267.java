package yyds;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: yyds.ᛶᛱᛷᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC1267 implements Executor {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f5838;

    public /* synthetic */ ExecutorC1267(int i) {
        this.f5838 = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f5838) {
            case 0:
                new Thread(runnable).start();
                break;
            case 1:
                AbstractC0181.m743().post(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
