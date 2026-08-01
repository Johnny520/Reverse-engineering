package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f40 implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.g40 b;
    public final /* synthetic */ defpackage.cg c;

    public /* synthetic */ f40(defpackage.cg r1, defpackage.g40 r2, int r3) {
            r0 = this;
            r0.a = r3
            r0.c = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            cg r0 = r3.c
            java.util.ArrayList r1 = r0.b
            g40 r2 = r3.b
            r1.remove(r2)
            java.util.ArrayList r0 = r0.c
            r0.remove(r2)
            return
        L14:
            cg r0 = r3.c
            java.util.ArrayList r0 = r0.b
            g40 r1 = r3.b
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L29
            int r0 = r1.a
            ml r1 = r1.c
            android.view.View r1 = r1.E
            defpackage.z30.a(r1, r0)
        L29:
            return
    }
}
