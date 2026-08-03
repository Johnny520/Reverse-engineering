package okio.internal;

/* JADX INFO: renamed from: okio.internal.-FileSystem, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class FileSystem {

    /* JADX INFO: renamed from: okio.internal.-FileSystem$collectRecursively$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    @yf.e(c = "okio.internal.-FileSystem", f = "FileSystem.kt", l = {116, 135, 145}, m = "collectRecursively")
    public static final class AnonymousClass1 extends yf.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass1(wf.c r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // yf.a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                r7 = this;
                r7.result = r8
                int r8 = r7.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r8 = r8 | r0
                r7.label = r8
                r4 = 0
                r5 = 0
                r0 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r6 = r7
                java.lang.Object r8 = okio.internal.FileSystem.collectRecursively(r0, r1, r2, r3, r4, r5, r6)
                return r8
        }
    }

    /* JADX INFO: renamed from: okio.internal.-FileSystem$commonListRecursively$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    @yf.e(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", l = {96}, m = "invokeSuspend")
    public static final class C00061 extends yf.h implements fg.p {
        final /* synthetic */ okio.Path $dir;
        final /* synthetic */ boolean $followSymlinks;
        final /* synthetic */ okio.FileSystem $this_commonListRecursively;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        public C00061(okio.Path r1, okio.FileSystem r2, boolean r3, wf.c r4) {
                r0 = this;
                r0.$dir = r1
                r0.$this_commonListRecursively = r2
                r0.$followSymlinks = r3
                r0.<init>(r4)
                return
        }

        @Override // yf.a
        public final wf.c create(java.lang.Object r5, wf.c r6) {
                r4 = this;
                okio.internal.-FileSystem$commonListRecursively$1 r0 = new okio.internal.-FileSystem$commonListRecursively$1
                okio.Path r1 = r4.$dir
                okio.FileSystem r2 = r4.$this_commonListRecursively
                boolean r3 = r4.$followSymlinks
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
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
                okio.internal.-FileSystem$commonListRecursively$1 r1 = (okio.internal.FileSystem.C00061) r1
                sf.n r2 = sf.n.f12433a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // yf.a
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                r10 = this;
                int r0 = r10.label
                r1 = 1
                if (r0 == 0) goto L1f
                if (r0 != r1) goto L18
                java.lang.Object r0 = r10.L$2
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r2 = r10.L$1
                tf.k r2 = (tf.k) r2
                java.lang.Object r3 = r10.L$0
                ng.l r3 = (ng.l) r3
                f8.i.I0(r11)
                r5 = r2
                goto L3f
            L18:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                j8.o.A(r11)
                r11 = 0
                return r11
            L1f:
                f8.i.I0(r11)
                java.lang.Object r11 = r10.L$0
                ng.l r11 = (ng.l) r11
                tf.k r0 = new tf.k
                r0.<init>()
                okio.Path r2 = r10.$dir
                r0.addLast(r2)
                okio.FileSystem r2 = r10.$this_commonListRecursively
                okio.Path r3 = r10.$dir
                java.util.List r2 = r2.list(r3)
                java.util.Iterator r2 = r2.iterator()
                r3 = r11
                r5 = r0
                r0 = r2
            L3f:
                boolean r11 = r0.hasNext()
                if (r11 == 0) goto L63
                java.lang.Object r11 = r0.next()
                r6 = r11
                okio.Path r6 = (okio.Path) r6
                okio.FileSystem r4 = r10.$this_commonListRecursively
                boolean r7 = r10.$followSymlinks
                r10.L$0 = r3
                r10.L$1 = r5
                r10.L$2 = r0
                r10.label = r1
                r8 = 0
                r9 = r10
                java.lang.Object r11 = okio.internal.FileSystem.collectRecursively(r3, r4, r5, r6, r7, r8, r9)
                xf.a r2 = xf.a.f21579g
                if (r11 != r2) goto L3f
                return r2
            L63:
                sf.n r11 = sf.n.f12433a
                return r11
        }
    }

    public static final java.lang.Object collectRecursively(ng.l r16, okio.FileSystem r17, tf.k r18, okio.Path r19, boolean r20, boolean r21, wf.c r22) {
            r0 = r16
            r1 = r19
            r2 = r21
            r3 = r22
            boolean r4 = r3 instanceof okio.internal.FileSystem.AnonymousClass1
            if (r4 == 0) goto L1b
            r4 = r3
            okio.internal.-FileSystem$collectRecursively$1 r4 = (okio.internal.FileSystem.AnonymousClass1) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.label = r5
            goto L20
        L1b:
            okio.internal.-FileSystem$collectRecursively$1 r4 = new okio.internal.-FileSystem$collectRecursively$1
            r4.<init>(r3)
        L20:
            java.lang.Object r3 = r4.result
            int r5 = r4.label
            sf.n r6 = sf.n.f12433a
            r7 = 3
            r8 = 2
            r9 = 1
            xf.a r10 = xf.a.f21579g
            if (r5 == 0) goto L81
            if (r5 == r9) goto L65
            if (r5 == r8) goto L3e
            if (r5 != r7) goto L37
            f8.i.I0(r3)
            return r6
        L37:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r0)
        L3c:
            r0 = 0
            return r0
        L3e:
            boolean r0 = r4.Z$1
            boolean r1 = r4.Z$0
            java.lang.Object r2 = r4.L$4
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r4.L$3
            okio.Path r5 = (okio.Path) r5
            java.lang.Object r9 = r4.L$2
            tf.k r9 = (tf.k) r9
            java.lang.Object r11 = r4.L$1
            okio.FileSystem r11 = (okio.FileSystem) r11
            java.lang.Object r12 = r4.L$0
            ng.l r12 = (ng.l) r12
            f8.i.I0(r3)     // Catch: java.lang.Throwable -> L62
            r3 = r1
            r1 = r0
            r0 = r3
            r3 = r5
        L5d:
            r5 = r9
            r9 = r11
            r11 = r12
            goto Le1
        L62:
            r0 = move-exception
            goto L132
        L65:
            boolean r0 = r4.Z$1
            boolean r1 = r4.Z$0
            java.lang.Object r2 = r4.L$3
            okio.Path r2 = (okio.Path) r2
            java.lang.Object r5 = r4.L$2
            tf.k r5 = (tf.k) r5
            java.lang.Object r9 = r4.L$1
            okio.FileSystem r9 = (okio.FileSystem) r9
            java.lang.Object r11 = r4.L$0
            ng.l r11 = (ng.l) r11
            f8.i.I0(r3)
            r15 = r2
            r2 = r0
            r0 = r1
            r1 = r15
            goto La8
        L81:
            f8.i.I0(r3)
            if (r2 != 0) goto L9e
            r4.L$0 = r0
            r3 = r17
            r4.L$1 = r3
            r5 = r18
            r4.L$2 = r5
            r4.L$3 = r1
            r11 = r20
            r4.Z$0 = r11
            r4.Z$1 = r2
            r4.label = r9
            r0.a(r1, r4)
            return r10
        L9e:
            r3 = r17
            r5 = r18
            r11 = r20
            r9 = r11
            r11 = r0
            r0 = r9
            r9 = r3
        La8:
            java.util.List r3 = r9.listOrNull(r1)
            if (r3 != 0) goto Lb0
            tf.t r3 = tf.t.f13167g
        Lb0:
            boolean r12 = r3.isEmpty()
            if (r12 != 0) goto L13b
            r12 = 0
            r13 = r1
        Lb8:
            if (r0 == 0) goto Lcc
            boolean r14 = r5.contains(r13)
            if (r14 != 0) goto Lc1
            goto Lcc
        Lc1:
            java.lang.String r0 = "symlink cycle at "
            java.lang.String r0 = j8.b.m(r1, r0)
            j8.o.y(r0)
            goto L3c
        Lcc:
            okio.Path r14 = symlinkTarget(r9, r13)
            if (r14 != 0) goto L136
            if (r0 != 0) goto Ld6
            if (r12 != 0) goto L13b
        Ld6:
            r5.addLast(r13)
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L126
            r15 = r3
            r3 = r1
            r1 = r2
            r2 = r15
        Le1:
            boolean r12 = r2.hasNext()     // Catch: java.lang.Throwable -> L126
            if (r12 == 0) goto L129
            java.lang.Object r12 = r2.next()     // Catch: java.lang.Throwable -> L126
            okio.Path r12 = (okio.Path) r12     // Catch: java.lang.Throwable -> L126
            r4.L$0 = r11     // Catch: java.lang.Throwable -> L126
            r4.L$1 = r9     // Catch: java.lang.Throwable -> L126
            r4.L$2 = r5     // Catch: java.lang.Throwable -> L126
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L126
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L126
            r4.Z$0 = r0     // Catch: java.lang.Throwable -> L126
            r4.Z$1 = r1     // Catch: java.lang.Throwable -> L126
            r4.label = r8     // Catch: java.lang.Throwable -> L126
            r20 = r0
            r21 = r1
            r22 = r4
            r18 = r5
            r17 = r9
            r16 = r11
            r19 = r12
            java.lang.Object r0 = collectRecursively(r16, r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> L122
            r12 = r16
            r11 = r17
            r9 = r18
            r4 = r20
            r1 = r21
            r5 = r22
            if (r0 != r10) goto L11e
            return r10
        L11e:
            r0 = r4
            r4 = r5
            goto L5d
        L122:
            r0 = move-exception
            r9 = r18
            goto L132
        L126:
            r0 = move-exception
            r9 = r5
            goto L132
        L129:
            r9 = r5
            r12 = r11
            r5 = r4
            r9.removeLast()
            r2 = r1
            r1 = r3
            goto L13b
        L132:
            r9.removeLast()
            throw r0
        L136:
            int r12 = r12 + 1
            r13 = r14
            goto Lb8
        L13b:
            if (r2 == 0) goto L14e
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.L$2 = r0
            r4.L$3 = r0
            r4.L$4 = r0
            r4.label = r7
            r11.a(r1, r4)
            return r10
        L14e:
            return r6
    }

    public static final void commonCopy(okio.FileSystem r4, okio.Path r5, okio.Path r6) {
            r4.getClass()
            r5.getClass()
            r6.getClass()
            okio.Source r5 = r4.source(r5)
            r0 = 0
            okio.Sink r4 = r4.sink(r6)     // Catch: java.lang.Throwable -> L34
            okio.BufferedSink r4 = okio.Okio.buffer(r4)     // Catch: java.lang.Throwable -> L34
            long r1 = r4.writeAll(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.Long r6 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L26
            r4.close()     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r4 = move-exception
            goto L38
        L26:
            r4 = r0
            goto L38
        L28:
            r6 = move-exception
            if (r4 == 0) goto L36
            r4.close()     // Catch: java.lang.Throwable -> L2f
            goto L36
        L2f:
            r4 = move-exception
            ac.p.e(r6, r4)     // Catch: java.lang.Throwable -> L34
            goto L36
        L34:
            r4 = move-exception
            goto L4e
        L36:
            r4 = r6
            r6 = r0
        L38:
            if (r4 != 0) goto L4d
            r6.getClass()     // Catch: java.lang.Throwable -> L34
            long r1 = r6.longValue()     // Catch: java.lang.Throwable -> L34
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L34
            if (r5 == 0) goto L5b
            r5.close()     // Catch: java.lang.Throwable -> L4b
            goto L5b
        L4b:
            r0 = move-exception
            goto L5b
        L4d:
            throw r4     // Catch: java.lang.Throwable -> L34
        L4e:
            if (r5 == 0) goto L58
            r5.close()     // Catch: java.lang.Throwable -> L54
            goto L58
        L54:
            r5 = move-exception
            ac.p.e(r4, r5)
        L58:
            r3 = r0
            r0 = r4
            r4 = r3
        L5b:
            if (r0 != 0) goto L61
            r4.getClass()
            return
        L61:
            throw r0
    }

    public static final void commonCreateDirectories(okio.FileSystem r3, okio.Path r4, boolean r5) {
            r3.getClass()
            r4.getClass()
            tf.k r0 = new tf.k
            r0.<init>()
            r1 = r4
        Lc:
            if (r1 == 0) goto L1c
            boolean r2 = r3.exists(r1)
            if (r2 != 0) goto L1c
            r0.addFirst(r1)
            okio.Path r1 = r1.parent()
            goto Lc
        L1c:
            if (r5 == 0) goto L2b
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L25
            goto L2b
        L25:
            java.lang.String r3 = " already exists."
            j8.o.h(r4, r3)
            return
        L2b:
            java.util.Iterator r4 = r0.iterator()
        L2f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L3f
            java.lang.Object r5 = r4.next()
            okio.Path r5 = (okio.Path) r5
            r3.createDirectory(r5)
            goto L2f
        L3f:
            return
    }

    public static final void commonDeleteRecursively(okio.FileSystem r2, okio.Path r3, boolean r4) {
            r2.getClass()
            r3.getClass()
            okio.internal.-FileSystem$commonDeleteRecursively$sequence$1 r0 = new okio.internal.-FileSystem$commonDeleteRecursively$sequence$1
            r1 = 0
            r0.<init>(r2, r3, r1)
            ng.k r3 = fb.v0.B(r0)
        L10:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r3.next()
            okio.Path r0 = (okio.Path) r0
            if (r4 == 0) goto L26
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L26
            r1 = 1
            goto L27
        L26:
            r1 = 0
        L27:
            r2.delete(r0, r1)
            goto L10
        L2b:
            return
    }

    public static final boolean commonExists(okio.FileSystem r0, okio.Path r1) {
            r0.getClass()
            r1.getClass()
            okio.FileMetadata r0 = r0.metadataOrNull(r1)
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static final ng.j commonListRecursively(okio.FileSystem r2, okio.Path r3, boolean r4) {
            r2.getClass()
            r3.getClass()
            okio.internal.-FileSystem$commonListRecursively$1 r0 = new okio.internal.-FileSystem$commonListRecursively$1
            r1 = 0
            r0.<init>(r3, r2, r4, r1)
            dg.n r2 = new dg.n
            r2.<init>(r0)
            return r2
    }

    public static final okio.FileMetadata commonMetadata(okio.FileSystem r1, okio.Path r2) {
            r1.getClass()
            r2.getClass()
            okio.FileMetadata r1 = r1.metadataOrNull(r2)
            if (r1 == 0) goto Ld
            return r1
        Ld:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.String r0 = "no such file: "
            java.lang.String r2 = j8.b.m(r2, r0)
            r1.<init>(r2)
            throw r1
    }

    public static final okio.Path symlinkTarget(okio.FileSystem r0, okio.Path r1) {
            r0.getClass()
            r1.getClass()
            okio.FileMetadata r0 = r0.metadata(r1)
            okio.Path r0 = r0.getSymlinkTarget()
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            okio.Path r1 = r1.parent()
            r1.getClass()
            okio.Path r0 = r1.resolve(r0)
            return r0
    }
}
