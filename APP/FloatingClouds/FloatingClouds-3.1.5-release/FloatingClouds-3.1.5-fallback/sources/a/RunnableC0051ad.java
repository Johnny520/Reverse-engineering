package a;

/* JADX INFO: renamed from: a.ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0051ad<T> implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.P6 f402a;
    public a.Q6 b;
    public android.os.Handler c;

    /* JADX INFO: renamed from: a.ad$a */
    public class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.Q6 f403a;
        public final /* synthetic */ java.lang.Object b;

        public a(a.Q6 r1, java.lang.Object r2) {
                r0 = this;
                r0.<init>()
                r0.f403a = r1
                r0.b = r2
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                a.Q6 r0 = r2.f403a
                java.lang.Object r1 = r2.b
                r0.a(r1)
                return
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            a.P6 r0 = r3.f402a     // Catch: java.lang.Exception -> L7
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L7
            goto L8
        L7:
            r0 = 0
        L8:
            a.ad$a r1 = new a.ad$a
            a.Q6 r2 = r3.b
            r1.<init>(r2, r0)
            android.os.Handler r0 = r3.c
            r0.post(r1)
            return
    }
}
