package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public final class d extends androidx.emoji2.text.c.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.emoji2.text.c.h f896a;
    public final /* synthetic */ java.util.concurrent.ThreadPoolExecutor b;

    public d(androidx.emoji2.text.c.h r1, java.util.concurrent.ThreadPoolExecutor r2) {
            r0 = this;
            r0.<init>()
            r0.f896a = r1
            r0.b = r2
            return
    }

    @Override // androidx.emoji2.text.c.h
    public final void a(java.lang.Throwable r3) {
            r2 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r2.b
            androidx.emoji2.text.c$h r1 = r2.f896a     // Catch: java.lang.Throwable -> Lb
            r1.a(r3)     // Catch: java.lang.Throwable -> Lb
            r0.shutdown()
            return
        Lb:
            r3 = move-exception
            r0.shutdown()
            throw r3
    }

    @Override // androidx.emoji2.text.c.h
    public final void b(a.C0230kb r3) {
            r2 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r2.b
            androidx.emoji2.text.c$h r1 = r2.f896a     // Catch: java.lang.Throwable -> Lb
            r1.b(r3)     // Catch: java.lang.Throwable -> Lb
            r0.shutdown()
            return
        Lb:
            r3 = move-exception
            r0.shutdown()
            throw r3
    }
}
