package okio.internal;

/* JADX INFO: renamed from: okio.internal.-FileSystem$commonDeleteRecursively$sequence$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
@yf.e(c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", f = "FileSystem.kt", l = {75}, m = "invokeSuspend")
public final class FileSystem$commonDeleteRecursively$sequence$1 extends yf.h implements fg.p {
    final /* synthetic */ okio.Path $fileOrDirectory;
    final /* synthetic */ okio.FileSystem $this_commonDeleteRecursively;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    public FileSystem$commonDeleteRecursively$sequence$1(okio.FileSystem r1, okio.Path r2, wf.c r3) {
            r0 = this;
            r0.$this_commonDeleteRecursively = r1
            r0.$fileOrDirectory = r2
            r0.<init>(r3)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            okio.internal.-FileSystem$commonDeleteRecursively$sequence$1 r0 = new okio.internal.-FileSystem$commonDeleteRecursively$sequence$1
            okio.FileSystem r1 = r3.$this_commonDeleteRecursively
            okio.Path r2 = r3.$fileOrDirectory
            r0.<init>(r1, r2, r5)
            r0.L$0 = r4
            return r0
    }

    @Override // fg.p
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            ng.l r1 = (ng.l) r1
            wf.c r2 = (wf.c) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    public final java.lang.Object invoke(ng.l r1, wf.c r2) {
            r0 = this;
            wf.c r1 = r0.create(r1, r2)
            okio.internal.-FileSystem$commonDeleteRecursively$sequence$1 r1 = (okio.internal.FileSystem$commonDeleteRecursively$sequence$1) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.label
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 != r1) goto Lb
            f8.i.I0(r10)
            goto L31
        Lb:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r10)
            r10 = 0
            return r10
        L12:
            f8.i.I0(r10)
            java.lang.Object r10 = r9.L$0
            r2 = r10
            ng.l r2 = (ng.l) r2
            okio.FileSystem r3 = r9.$this_commonDeleteRecursively
            tf.k r4 = new tf.k
            r4.<init>()
            okio.Path r5 = r9.$fileOrDirectory
            r9.label = r1
            r6 = 0
            r7 = 1
            r8 = r9
            java.lang.Object r10 = okio.internal.FileSystem.collectRecursively(r2, r3, r4, r5, r6, r7, r8)
            xf.a r0 = xf.a.f21579g
            if (r10 != r0) goto L31
            return r0
        L31:
            sf.n r10 = sf.n.f12433a
            return r10
    }
}
