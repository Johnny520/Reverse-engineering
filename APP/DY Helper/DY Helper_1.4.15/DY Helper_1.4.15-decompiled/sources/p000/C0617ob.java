package p000;

/* JADX INFO: renamed from: ob */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0617ob implements io.github.libxposed.api.XposedInterface.Hooker {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f8018;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.Object f8019;

    public /* synthetic */ C0617ob(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f8018 = r1
            r0.f8019 = r2
            r0.<init>()
            return
    }

    public final java.lang.Object intercept(io.github.libxposed.api.XposedInterface.Chain r10) {
            r9 = this;
            int r0 = r9.f8018
            java.lang.Object r9 = r9.f8019
            switch(r0) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            m01 r9 = (p000.m01) r9
            java.lang.Object r9 = r9.dispatch$app(r10)
            return r9
        Le:
            eb r9 = (p000.C0242eb) r9
            sb r0 = p000.C0792sb.f9786
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r10.getClass()
            int r2 = p000.C0792sb.f9804
            if (r2 > 0) goto Ldf
            boolean r2 = p000.C0792sb.f9798
            if (r2 != 0) goto L24
            goto Ldf
        L24:
            java.lang.Object r2 = r10.getThisObject()
            boolean r3 = r2 instanceof android.view.View
            r4 = 0
            if (r3 == 0) goto L30
            android.view.View r2 = (android.view.View) r2
            goto L31
        L30:
            r2 = r4
        L31:
            if (r2 != 0) goto L39
            java.lang.Object r4 = r10.proceed()
            goto Le3
        L39:
            java.util.List r3 = r10.getArgs()
            r3.getClass()
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.Object[] r3 = r3.toArray(r5)
            db r5 = r9.f3465
            int r5 = r5.ordinal()
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L80
            r8 = 7
            if (r5 == r7) goto L6a
            if (r5 != r6) goto L65
            p000.C0792sb.m5393(r2, r8)
            boolean r5 = p000.C0792sb.m5387()
            if (r5 == 0) goto L90
            int r5 = r3.length
            if (r5 != 0) goto L62
            goto L90
        L62:
            r3[r0] = r1
            goto L90
        L65:
            p000.C1080.m7272()
            goto Le3
        L6a:
            p000.C0792sb.m5393(r2, r8)
            boolean r1 = p000.C0792sb.m5387()
            if (r1 == 0) goto L90
            int r1 = r3.length
            if (r1 != 0) goto L77
            goto L90
        L77:
            r1 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r0] = r1
            goto L90
        L80:
            r5 = 3
            p000.C0792sb.m5393(r2, r5)
            boolean r5 = p000.C0792sb.m5387()
            if (r5 == 0) goto L90
            int r5 = r3.length
            if (r5 != 0) goto L8e
            goto L90
        L8e:
            r3[r0] = r1
        L90:
            java.lang.Object r10 = r10.proceed(r3)     // Catch: java.lang.Throwable -> Lbc
            int r0 = p000.C0792sb.f9804
            if (r0 > 0) goto Lb6
            boolean r0 = p000.C0792sb.f9798
            if (r0 == 0) goto Lb6
            db r9 = r9.f3465
            int r9 = r9.ordinal()
            if (r9 == 0) goto Lb8
            if (r9 == r7) goto Lad
            if (r9 != r6) goto La9
            goto Lad
        La9:
            p000.C1080.m7272()
            goto Le3
        Lad:
            boolean r9 = p000.C0792sb.m5387()
            if (r9 == 0) goto Lb6
            p000.C0792sb.m5415(r2)
        Lb6:
            r4 = r10
            goto Le3
        Lb8:
            p000.C0792sb.m5427(r2)
            goto Lb6
        Lbc:
            r10 = move-exception
            int r0 = p000.C0792sb.f9804
            if (r0 > 0) goto Lde
            boolean r0 = p000.C0792sb.f9798
            if (r0 == 0) goto Lde
            db r9 = r9.f3465
            int r9 = r9.ordinal()
            if (r9 == 0) goto Ldb
            if (r9 == r7) goto Ld1
            if (r9 != r6) goto La9
        Ld1:
            boolean r9 = p000.C0792sb.m5387()
            if (r9 == 0) goto Lde
            p000.C0792sb.m5415(r2)
            goto Lde
        Ldb:
            p000.C0792sb.m5427(r2)
        Lde:
            throw r10
        Ldf:
            java.lang.Object r4 = r10.proceed()
        Le3:
            return r4
    }
}
