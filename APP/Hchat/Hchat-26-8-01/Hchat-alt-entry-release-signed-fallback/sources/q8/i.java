package q8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i8.f f10707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f10708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f10709c;

    public i(i8.f r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.f10708b = r0
            r1.f10707a = r2
            return
    }

    public final int a(java.lang.Class r9) {
            r8 = this;
            java.util.List r9 = h.Hchat.utils.KavaReflector.declaredMethods(r9)
            java.util.Iterator r9 = r9.iterator()
            r0 = 0
            r1 = r0
        La:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L55
            java.lang.Object r2 = r9.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 != 0) goto L19
            goto La
        L19:
            java.lang.String r3 = r2.getName()
            java.lang.String r4 = "startActivity"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L2e
            java.lang.String r4 = "startActivityForResult"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L2e
            goto La
        L2e:
            java.lang.Class[] r3 = r2.getParameterTypes()
            if (r3 == 0) goto La
            int r4 = r3.length
            if (r4 != 0) goto L38
            goto La
        L38:
            int r4 = r3.length
            r5 = r0
        L3a:
            if (r5 >= r4) goto La
            r6 = r3[r5]
            java.lang.Class<android.content.Intent> r7 = android.content.Intent.class
            if (r6 != r7) goto L52
            r8.i r3 = r8.i.f11631b
            c9.c2 r4 = new c9.c2
            r5 = 11
            r6 = 0
            r4.<init>(r5, r8, r2, r6)
            r3.b(r2, r4)
            int r1 = r1 + 1
            goto La
        L52:
            int r5 = r5 + 1
            goto L3a
        L55:
            return r1
    }
}
