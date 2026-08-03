package a;

/* JADX INFO: renamed from: a.je, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0215je {
    public static a.C0215je b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f534a;

    /* JADX INFO: renamed from: a.je$a */
    public class a implements android.os.Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.C0215je f535a;

        public a(a.C0215je r1) {
                r0 = this;
                r0.<init>()
                r0.f535a = r1
                return
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(android.os.Message r2) {
                r1 = this;
                int r0 = r2.what
                if (r0 == 0) goto L6
                r2 = 0
                return r2
            L6:
                a.je r0 = r1.f535a
                java.lang.Object r2 = r2.obj
                a.je$b r2 = (a.C0215je.b) r2
                java.lang.Object r0 = r0.f534a
                monitor-enter(r0)
                if (r2 == 0) goto L18
                if (r2 == 0) goto L18
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                r2 = 1
                return r2
            L16:
                r2 = move-exception
                goto L1d
            L18:
                r2.getClass()     // Catch: java.lang.Throwable -> L16
                r2 = 0
                throw r2     // Catch: java.lang.Throwable -> L16
            L1d:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                throw r2
        }
    }

    /* JADX INFO: renamed from: a.je$b */
    public static class b {
    }

    public C0215je() {
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.f534a = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            a.je$a r2 = new a.je$a
            r2.<init>(r3)
            r0.<init>(r1, r2)
            return
    }

    public static a.C0215je a() {
            a.je r0 = a.C0215je.b
            if (r0 != 0) goto Lb
            a.je r0 = new a.je
            r0.<init>()
            a.C0215je.b = r0
        Lb:
            a.je r0 = a.C0215je.b
            return r0
    }
}
