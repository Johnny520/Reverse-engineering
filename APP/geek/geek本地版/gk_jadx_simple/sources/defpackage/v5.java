package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class v5 implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r2) {
        new Thread(r2).start();
    }
}
