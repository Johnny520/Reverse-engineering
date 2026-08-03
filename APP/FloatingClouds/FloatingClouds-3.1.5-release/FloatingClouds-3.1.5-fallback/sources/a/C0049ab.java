package a;

/* JADX INFO: renamed from: a.ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0049ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Runnable f400a;
    public final java.util.concurrent.CopyOnWriteArrayList<a.InterfaceC0159gb> b;
    public final java.util.HashMap c;

    /* JADX INFO: renamed from: a.ab$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.lifecycle.e f401a;
        public androidx.lifecycle.g b;

        public a(androidx.lifecycle.e r1, androidx.lifecycle.g r2) {
                r0 = this;
                r0.<init>()
                r0.f401a = r1
                r0.b = r2
                r1.a(r2)
                return
        }
    }

    public C0049ab(java.lang.Runnable r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.c = r0
            r1.f400a = r2
            return
    }

    public final void a(a.InterfaceC0159gb r3) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<a.gb> r0 = r2.b
            r0.remove(r3)
            java.util.HashMap r0 = r2.c
            java.lang.Object r3 = r0.remove(r3)
            a.ab$a r3 = (a.C0049ab.a) r3
            if (r3 == 0) goto L19
            androidx.lifecycle.e r0 = r3.f401a
            androidx.lifecycle.g r1 = r3.b
            r0.c(r1)
            r0 = 0
            r3.b = r0
        L19:
            java.lang.Runnable r3 = r2.f400a
            r3.run()
            return
    }
}
