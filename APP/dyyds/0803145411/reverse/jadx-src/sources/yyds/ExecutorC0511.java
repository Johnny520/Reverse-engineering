package yyds;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: yyds.ᛳᛱᛳᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0511 implements Executor {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f2461;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2461) {
            case 0:
                C1798.m3577().f9067.f6864.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
