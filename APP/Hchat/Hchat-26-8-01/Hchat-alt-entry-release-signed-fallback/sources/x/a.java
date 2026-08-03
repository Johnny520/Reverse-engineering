package x;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wb.sr f20814a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0.n f20815b = null;

    static {
            wb.sr r0 = new wb.sr
            r1 = 16
            r0.<init>(r1)
            x.a.f20814a = r0
            b0.n r0 = new b0.n
            r1 = 2
            r0.<init>(r1)
            x.a.f20815b = r0
            return
    }

    public static final void a(y.a r16, android.content.Context r17, boolean r18, java.lang.String r19, long r20) {
            r0 = r16
            boolean r1 = i2.m0.c(r20)
            if (r1 != 0) goto L64
            int r1 = r19.length()
            if (r1 != 0) goto Lf
            goto L64
        Lf:
            android.content.pm.PackageManager r1 = r17.getPackageManager()
            wb.sr r2 = x.a.f20814a
            r4 = r17
            java.lang.Object r2 = r2.invoke(r4)
            java.util.List r2 = (java.util.List) r2
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L24
            goto L64
        L24:
            f.f0 r3 = r0.f21788a
            f.f0 r0 = r0.f21788a
            z.f r10 = z.f.f22471b
            r3.a(r10)
            int r11 = r2.size()
            r12 = 0
            r13 = r12
        L33:
            if (r13 >= r11) goto L61
            java.lang.Object r3 = r2.get(r13)
            r5 = r3
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
            z.a r14 = new z.a
            r14.<init>(r13)
            java.lang.CharSequence r3 = r5.loadLabel(r1)
            java.lang.String r15 = r3.toString()
            x.b r3 = new x.b
            r6 = r18
            r7 = r19
            r8 = r20
            r3.<init>(r4, r5, r6, r7, r8)
            z.d r4 = new z.d
            r4.<init>(r14, r15, r12, r3)
            r0.a(r4)
            int r13 = r13 + 1
            r4 = r17
            goto L33
        L61:
            r0.a(r10)
        L64:
            return
    }
}
