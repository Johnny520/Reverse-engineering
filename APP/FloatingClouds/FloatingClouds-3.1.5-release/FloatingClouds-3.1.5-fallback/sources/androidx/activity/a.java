package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public final class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f798a;
    public final /* synthetic */ a.Y.a b;
    public final /* synthetic */ androidx.activity.ComponentActivity.a c;

    public a(androidx.activity.ComponentActivity.a r1, int r2, a.Y.a r3) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r0.f798a = r2
            r0.b = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            a.Y$a r0 = r4.b
            T r0 = r0.f346a
            androidx.activity.ComponentActivity$a r1 = r4.c
            java.util.HashMap r2 = r1.f801a
            int r3 = r4.f798a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L17
            goto L31
        L17:
            java.util.HashMap r3 = r1.e
            java.lang.Object r3 = r3.get(r2)
            androidx.activity.result.a$a r3 = (androidx.activity.result.a.C0008a) r3
            if (r3 == 0) goto L32
            a.X<O> r3 = r3.f802a
            if (r3 != 0) goto L26
            goto L32
        L26:
            java.util.ArrayList<java.lang.String> r1 = r1.d
            boolean r1 = r1.remove(r2)
            if (r1 == 0) goto L31
            r3.a(r0)
        L31:
            return
        L32:
            android.os.Bundle r3 = r1.g
            r3.remove(r2)
            java.util.HashMap r1 = r1.f
            r1.put(r2, r0)
            return
    }
}
