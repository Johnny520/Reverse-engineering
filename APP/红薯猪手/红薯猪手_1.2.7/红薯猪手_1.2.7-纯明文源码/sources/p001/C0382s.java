package p001;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۟.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0382s extends AbstractC0342ob {

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile C0382s f1066;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final a f1767 = new a();

    /* JADX INFO: renamed from: ۥ */
    public C0234h1 f1067 = new C0234h1();

    /* JADX INFO: renamed from: ۟.s$a */
    public static class a implements Executor {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            if (C0382s.f1066 == null) {
                synchronized (C0382s.class) {
                    if (C0382s.f1066 == null) {
                        C0382s.f1066 = new C0382s();
                    }
                }
            }
            C0382s.f1066.f1067.f821.execute(runnable);
        }
    }
}
