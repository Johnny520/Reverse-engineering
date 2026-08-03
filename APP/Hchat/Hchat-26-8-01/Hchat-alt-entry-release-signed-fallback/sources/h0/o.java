package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public yg.b f4949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h0.p f4950i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.lang.CharSequence f4951j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f4952k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4953l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4954m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f4955n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f4956o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h0.p f4957p;

    public o(java.lang.CharSequence r1, long r2, h0.p r4, wf.c r5) {
            r0 = this;
            r0.f4955n = r1
            r0.f4956o = r2
            r0.f4957p = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r7, wf.c r8) {
            r6 = this;
            h0.o r0 = new h0.o
            long r2 = r6.f4956o
            h0.p r4 = r6.f4957p
            java.lang.CharSequence r1 = r6.f4955n
            r5 = r8
            r0.<init>(r1, r2, r4, r5)
            r0.f4954m = r7
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            android.view.textclassifier.TextClassifier r1 = (android.view.textclassifier.TextClassifier) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            h0.o r1 = (h0.o) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.f4953l
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 == r2) goto L18
            if (r0 != r1) goto L11
            long r0 = r11.f4952k
            f8.i.I0(r12)
            goto Lba
        L11:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r12)
            r12 = 0
            return r12
        L18:
            long r0 = r11.f4952k
            java.lang.CharSequence r2 = r11.f4951j
            h0.p r3 = r11.f4950i
            yg.b r4 = r11.f4949h
            java.lang.Object r5 = r11.f4954m
            android.view.textclassifier.TextSelection r5 = (android.view.textclassifier.TextSelection) r5
            f8.i.I0(r12)
            goto L8d
        L28:
            f8.i.I0(r12)
            java.lang.Object r12 = r11.f4954m
            r7 = r12
            android.view.textclassifier.TextClassifier r7 = (android.view.textclassifier.TextClassifier) r7
            b0.b0.z()
            long r3 = r11.f4956o
            int r12 = i2.m0.f(r3)
            int r0 = i2.m0.e(r3)
            java.lang.CharSequence r3 = r11.f4955n
            android.view.textclassifier.TextSelection$Request$Builder r12 = b0.b0.n(r3, r12, r0)
            h0.p r0 = r11.f4957p
            android.os.LocaleList r4 = r0.b()
            android.view.textclassifier.TextSelection$Request$Builder r12 = b0.b0.m(r12, r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L56
            a1.c.C(r12)
        L56:
            android.view.textclassifier.TextSelection$Request r12 = b0.b0.o(r12)
            android.view.textclassifier.TextSelection r12 = b0.b0.p(r7, r12)
            int r6 = r12.getSelectionStartIndex()
            int r8 = r12.getSelectionEndIndex()
            long r8 = i2.e0.b(r6, r8)
            xf.a r10 = xf.a.f21579g
            if (r4 < r5) goto La8
            android.view.textclassifier.TextClassification r4 = a1.c.m(r12)
            if (r4 == 0) goto La8
            yg.b r4 = r0.f4964e
            r11.f4954m = r12
            r11.f4949h = r4
            r11.f4950i = r0
            r11.f4951j = r3
            r11.f4952k = r8
            r11.f4953l = r2
            java.lang.Object r1 = r4.d(r11)
            if (r1 != r10) goto L89
            goto Lb8
        L89:
            r5 = r12
            r2 = r3
            r3 = r0
            r0 = r8
        L8d:
            r12 = 0
            h0.r0 r6 = new h0.r0     // Catch: java.lang.Throwable -> La3
            android.view.textclassifier.TextClassification r5 = a1.c.m(r5)     // Catch: java.lang.Throwable -> La3
            r5.getClass()     // Catch: java.lang.Throwable -> La3
            r6.<init>(r2, r0, r5)     // Catch: java.lang.Throwable -> La3
            i0.j1 r2 = r3.f4966g     // Catch: java.lang.Throwable -> La3
            r2.setValue(r6)     // Catch: java.lang.Throwable -> La3
            r4.f(r12)
            goto Lba
        La3:
            r0 = move-exception
            r4.f(r12)
            throw r0
        La8:
            r11.f4952k = r8
            r11.f4953l = r1
            h0.p r3 = r11.f4957p
            java.lang.CharSequence r4 = r11.f4955n
            r5 = r8
            r8 = r11
            java.lang.Object r12 = h0.p.a(r3, r4, r5, r7, r8)
            if (r12 != r10) goto Lb9
        Lb8:
            return r10
        Lb9:
            r0 = r5
        Lba:
            i2.m0 r12 = new i2.m0
            r12.<init>(r0)
            return r12
    }
}
