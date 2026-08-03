package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public final class b extends androidx.emoji2.text.c.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.emoji2.text.c.a f891a;

    public b(androidx.emoji2.text.c.a r1) {
            r0 = this;
            r0.<init>()
            r0.f891a = r1
            return
    }

    @Override // androidx.emoji2.text.c.h
    public final void a(java.lang.Throwable r2) {
            r1 = this;
            androidx.emoji2.text.c$a r0 = r1.f891a
            androidx.emoji2.text.c r0 = r0.f893a
            r0.d(r2)
            return
    }

    @Override // androidx.emoji2.text.c.h
    public final void b(a.C0230kb r7) {
            r6 = this;
            androidx.emoji2.text.c$a r0 = r6.f891a
            r0.c = r7
            a.Q5 r7 = new a.Q5
            a.kb r1 = r0.c
            androidx.emoji2.text.c r2 = r0.f893a
            androidx.emoji2.text.c$d r3 = r2.g
            a.P4 r2 = r2.i
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 34
            if (r4 < r5) goto L19
            java.util.Set r4 = a.M5.a()
            goto L1d
        L19:
            java.util.Set r4 = a.C0435w1.B()
        L1d:
            r7.<init>(r1, r3, r2, r4)
            r0.b = r7
            androidx.emoji2.text.c r7 = r0.f893a
            r7.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r7.f892a
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.lock()
            r1 = 1
            r7.c = r1     // Catch: java.lang.Throwable -> L59
            a.L1 r1 = r7.b     // Catch: java.lang.Throwable -> L59
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L59
            a.L1 r1 = r7.b     // Catch: java.lang.Throwable -> L59
            r1.clear()     // Catch: java.lang.Throwable -> L59
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r7.f892a
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            android.os.Handler r1 = r7.d
            androidx.emoji2.text.c$f r2 = new androidx.emoji2.text.c$f
            int r7 = r7.c
            r3 = 0
            r2.<init>(r0, r7, r3)
            r1.post(r2)
            return
        L59:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r7 = r7.f892a
            java.util.concurrent.locks.Lock r7 = r7.writeLock()
            r7.unlock()
            throw r0
    }
}
