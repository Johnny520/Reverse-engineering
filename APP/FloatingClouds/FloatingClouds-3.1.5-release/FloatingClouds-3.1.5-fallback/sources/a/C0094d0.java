package a;

/* JADX INFO: renamed from: a.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0094d0 extends a.AbstractC0057b0<java.lang.Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429a;
    public final /* synthetic */ a.Y b;
    public final /* synthetic */ androidx.activity.result.a c;

    public C0094d0(androidx.activity.result.a r1, java.lang.String r2, a.Y r3) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r0.f429a = r2
            r0.b = r3
            return
    }

    public final void a(java.lang.Object r6) {
            r5 = this;
            androidx.activity.result.a r0 = r5.c
            java.util.HashMap r1 = r0.b
            java.lang.String r2 = r5.f429a
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            a.Y r3 = r5.b
            if (r1 == 0) goto L26
            java.util.ArrayList<java.lang.String> r4 = r0.d
            r4.add(r2)
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L1f
            android.os.Parcelable r6 = (android.os.Parcelable) r6     // Catch: java.lang.Exception -> L1f
            r0.b(r1, r3, r6)     // Catch: java.lang.Exception -> L1f
            return
        L1f:
            r6 = move-exception
            java.util.ArrayList<java.lang.String> r0 = r0.d
            r0.remove(r2)
            throw r6
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Attempting to launch an unregistered ActivityResultLauncher with contract "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = " and input "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = ". You must ensure the ActivityResultLauncher is registered before calling launch()."
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }
}
