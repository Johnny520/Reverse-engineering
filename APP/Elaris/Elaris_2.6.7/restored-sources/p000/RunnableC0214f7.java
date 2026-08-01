package p000;

import com.p001mr.elaris.HookEntry;

/* JADX INFO: renamed from: f7 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0214f7 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f256a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ClassLoader f257b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0214f7(int i, ClassLoader classLoader) {
        this.f256a = i;
        this.f257b = classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f256a;
        ClassLoader classLoader = this.f257b;
        switch (i) {
            case 0:
                AbstractC0432r3.m854l(classLoader, AbstractC0009a8.m71b());
                break;
            case 1:
                AbstractC0497v4.m1103v(classLoader);
                break;
            default:
                HookEntry.maybeInstallMessageRepeater(classLoader);
                break;
        }
    }
}
