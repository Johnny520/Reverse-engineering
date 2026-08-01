package p183m6;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: m6.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5047q {

    /* JADX INFO: renamed from: a */
    public static volatile Executor f15358a;

    /* JADX INFO: renamed from: a */
    public static Executor m20407a() {
        if (f15358a == null) {
            synchronized (AbstractC5047q.class) {
                try {
                    if (f15358a == null) {
                        f15358a = Executors.newCachedThreadPool();
                    }
                } finally {
                }
            }
        }
        return f15358a;
    }
}
