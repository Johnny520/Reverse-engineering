package bc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements java.io.Closeable {
    public static final mh.b X = null;
    public static final int Y = 0;
    public static final java.lang.String Z = null;
    public final kd.a A;
    public boolean B;
    public final boolean C;
    public final java.util.EnumSet D;
    public final bc.b E;
    public final java.lang.String F;
    public final java.lang.String G;
    public final bc.a H;
    public final int I;
    public final ve.b J;
    public final ad.c K;
    public final java.util.ArrayList L;
    public final java.util.HashMap M;
    public final java.util.HashSet N;
    public uc.b O;
    public boolean P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.io.File f713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.io.File f714i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.io.File f715j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public bc.c f716k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public bd.a f717l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ae.d f718m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f719n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f720o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f721p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f722q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f723r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f724s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f725t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f726u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f727v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f728w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f729x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f730y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final java.util.List f731z;

    static {
            java.lang.Class<bc.g> r0 = bc.g.class
            mh.b r0 = mh.d.b(r0)
            bc.g.X = r0
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            int r0 = r0 / 2
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            bc.g.Y = r0
            java.lang.String r0 = java.lang.System.lineSeparator()
            bc.g.Z = r0
            return
    }

    public g() {
            r5 = this;
            r5.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r5.f712g = r0
            fc.c r0 = new fc.c
            r0.<init>()
            r5.f716k = r0
            cd.b r0 = new cd.b
            r0.<init>()
            r5.f717l = r0
            ae.d r0 = new ae.d
            r2 = 3
            r0.<init>(r2)
            r5.f718m = r0
            int r0 = bc.g.Y
            r5.f719n = r0
            r0 = 0
            r5.f720o = r0
            r5.f721p = r1
            r5.f722q = r1
            r5.f723r = r1
            r5.f724s = r1
            r5.f725t = r1
            r5.f726u = r1
            r5.f727v = r1
            r5.f728w = r0
            r5.Q = r1
            r5.R = r2
            r2 = 10
            r5.f729x = r2
            r5.S = r1
            r5.T = r1
            r3 = 2147483647(0x7fffffff, float:NaN)
            r5.f730y = r3
            java.util.List r3 = ld.b.f8011a
            r5.f731z = r3
            kd.a r3 = new kd.a
            r3.<init>()
            r3.f7570a = r0
            r3.f7571b = r0
            r3.f7572c = r0
            r3.f7573d = r0
            r5.A = r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ld.a r3 = new ld.a
            r3.<init>()
            r0.add(r3)
            ld.b r3 = new ld.b
            r3.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r0.add(r3)
            ld.a r3 = new ld.a
            r3.<init>()
            r0.add(r3)
            ld.a r3 = new ld.a
            r3.<init>()
            r0.add(r3)
            ld.a r3 = new ld.a
            r3.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r0.add(r3)
            l3.w r3 = new l3.w
            r4 = 1
            r3.<init>(r4)
            r0.add(r3)
            a2.a r3 = new a2.a
            r3.<init>(r0)
            r5.B = r1
            r5.C = r1
            java.lang.Class<bc.f> r0 = bc.f.class
            java.util.EnumSet r0 = java.util.EnumSet.allOf(r0)
            r5.D = r0
            r5.U = r1
            bc.b r0 = bc.b.f703g
            r5.E = r0
            java.lang.String r0 = bc.g.Z
            r5.F = r0
            java.lang.String r0 = "    "
            r5.G = r0
            bc.a r0 = bc.a.f700k
            r5.H = r0
            r5.V = r1
            r5.I = r2
            r0 = 2
            r5.W = r0
            ve.b r0 = ve.b.f14313a
            r5.J = r0
            ad.c r0 = new ad.c
            java.lang.Class<zc.a> r2 = zc.a.class
            java.util.EnumSet r2 = java.util.EnumSet.allOf(r2)
            r0.<init>(r2)
            r5.K = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.L = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.M = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r5.N = r0
            uc.a r0 = new uc.a
            r0.<init>()
            r5.O = r0
            r5.P = r1
            return
    }

    public final boolean a() {
            r2 = this;
            java.util.EnumSet r0 = r2.D
            bc.f r1 = bc.f.f709h
            boolean r0 = r0.contains(r1)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r4 = this;
            r0 = 0
            r4.f712g = r0     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> Ld
            bc.c r1 = r4.f716k     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> Ld
            if (r1 == 0) goto Lf
            r1.close()     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> Ld
            goto Lf
        Lb:
            r1 = move-exception
            goto L2a
        Ld:
            r1 = move-exception
            goto L22
        Lf:
            bd.a r1 = r4.f717l     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> Ld
            if (r1 == 0) goto L16
            r1.close()     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> Ld
        L16:
            uc.b r1 = r4.O     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> Ld
            if (r1 == 0) goto L1d
            r1.close()     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> Ld
        L1d:
            r4.f716k = r0
            r4.f717l = r0
            return
        L22:
            mh.b r2 = bc.g.X     // Catch: java.lang.Throwable -> Lb
            java.lang.String r3 = "Failed to close JadxArgs"
            r2.e(r3, r1)     // Catch: java.lang.Throwable -> Lb
            goto L1d
        L2a:
            r4.f716k = r0
            r4.f717l = r0
            throw r1
    }

    public final java.lang.String toString() {
            r25 = this;
            r0 = r25
            java.util.ArrayList r1 = r0.f712g
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.io.File r2 = r0.f713h
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.io.File r3 = r0.f714i
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.io.File r4 = r0.f715j
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r5 = r0.f719n
            bc.b r6 = r0.E
            java.lang.String r6 = java.lang.String.valueOf(r6)
            boolean r7 = r0.f720o
            boolean r8 = r0.f728w
            r9 = 1
            int r10 = r0.Q
            if (r10 == r9) goto L40
            r9 = 2
            if (r10 == r9) goto L3d
            r9 = 3
            if (r10 == r9) goto L3a
            r9 = 4
            if (r10 == r9) goto L37
            java.lang.String r9 = "null"
            goto L42
        L37:
            java.lang.String r9 = "IGNORE"
            goto L42
        L3a:
            java.lang.String r9 = "READ_AND_AUTOSAVE_BEFORE_CLOSING"
            goto L42
        L3d:
            java.lang.String r9 = "READ_AND_AUTOSAVE_EVERY_CHANGE"
            goto L42
        L40:
            java.lang.String r9 = "READ"
        L42:
            r10 = 1
            int r11 = r0.S
            if (r11 == r10) goto L5c
            r10 = 2
            if (r11 == r10) goto L59
            r10 = 3
            if (r11 == r10) goto L56
            r10 = 4
            if (r11 == r10) goto L53
            java.lang.String r10 = "null"
            goto L5e
        L53:
            java.lang.String r10 = "IGNORE"
            goto L5e
        L56:
            java.lang.String r10 = "OVERWRITE"
            goto L5e
        L59:
            java.lang.String r10 = "READ_OR_SAVE"
            goto L5e
        L5c:
            java.lang.String r10 = "READ"
        L5e:
            int r11 = r0.T
            java.lang.String r11 = bc.e.w(r11)
            int r12 = r0.R
            java.lang.String r12 = bc.e.x(r12)
            r13 = 1
            int r14 = r0.W
            if (r14 == r13) goto L7e
            r13 = 2
            if (r14 == r13) goto L7b
            r13 = 3
            if (r14 == r13) goto L78
            java.lang.String r13 = "null"
            goto L80
        L78:
            java.lang.String r13 = "APPLY_AND_HIDE"
            goto L80
        L7b:
            java.lang.String r13 = "APPLY"
            goto L80
        L7e:
            java.lang.String r13 = "DISABLE"
        L80:
            java.util.List r14 = r0.f731z
            java.lang.String r14 = java.lang.String.valueOf(r14)
            boolean r15 = r0.B
            r16 = r15
            java.util.EnumSet r15 = r0.D
            java.lang.String r15 = java.lang.String.valueOf(r15)
            r17 = r15
            r15 = 1
            r18 = r14
            int r14 = r0.U
            if (r14 == r15) goto La2
            r15 = 2
            if (r14 == r15) goto L9f
            java.lang.String r14 = "null"
            goto La4
        L9f:
            java.lang.String r14 = "JSON"
            goto La4
        La2:
            java.lang.String r14 = "JAVA"
        La4:
            bc.a r15 = r0.H
            java.lang.String r15 = java.lang.String.valueOf(r15)
            r19 = r15
            bc.c r15 = r0.f716k
            java.lang.String r15 = java.lang.String.valueOf(r15)
            r20 = r15
            ae.d r15 = r0.f718m
            r15.getClass()
            fc.b r15 = new fc.b
            r15.<init>(r0)
            java.lang.Class r15 = r15.getClass()
            java.lang.String r15 = r15.getSimpleName()
            r21 = r15
            java.util.HashMap r15 = r0.M
            java.lang.String r15 = java.lang.String.valueOf(r15)
            r22 = r15
            java.lang.String r15 = ", outDir="
            r23 = r14
            java.lang.String r14 = ", outDirSrc="
            r24 = r13
            java.lang.String r13 = "JadxArgs{inputFiles="
            java.lang.StringBuilder r1 = bc.e.p(r13, r1, r15, r2, r14)
            java.lang.String r2 = ", outDirRes="
            java.lang.String r13 = ", threadsCount="
            j8.b.t(r1, r3, r2, r4, r13)
            r1.append(r5)
            java.lang.String r2 = ", decompilationMode="
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = ", showInconsistentCode="
            r1.append(r2)
            java.lang.String r2 = ", useImports="
            java.lang.String r3 = ", skipResources="
            boolean r4 = r0.f721p
            p.a.x(r1, r7, r2, r4, r3)
            r1.append(r8)
            java.lang.String r2 = ", skipSources=false, includeDependencies=false, userRenamesMappingsPath=null, userRenamesMappingsMode="
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = ", deobfuscationOn=false, generatedRenamesMappingFile=null, generatedRenamesMappingFileMode="
            r1.append(r2)
            java.lang.String r2 = ", resourceNameSource="
            java.lang.String r3 = ", useSourceNameAsClassNameAlias="
            j8.b.t(r1, r10, r2, r11, r3)
            r1.append(r12)
            java.lang.String r2 = ", sourceNameRepeatLimit="
            r1.append(r2)
            int r2 = r0.f729x
            r1.append(r2)
            java.lang.String r2 = ", useKotlinMethodsForVarNames="
            r1.append(r2)
            r13 = r24
            r1.append(r13)
            java.lang.String r2 = ", insertDebugLines=false, extractFinally="
            r1.append(r2)
            boolean r2 = r0.f723r
            r1.append(r2)
            java.lang.String r2 = ", deobfuscationMinLength=0, deobfuscationMaxLength="
            r1.append(r2)
            int r2 = r0.f730y
            r1.append(r2)
            java.lang.String r2 = ", deobfuscationWhitelist="
            r1.append(r2)
            r2 = r18
            r1.append(r2)
            java.lang.String r2 = ", escapeUnicode=false, replaceConsts="
            r1.append(r2)
            java.lang.String r2 = ", restoreSwitchOverString="
            java.lang.String r3 = ", respectBytecodeAccModifiers=false, exportGradleType=null, skipXmlPrettyPrint=false, fsCaseSensitive=false, renameFlags="
            boolean r4 = r0.C
            r5 = r16
            p.a.x(r1, r5, r2, r4, r3)
            java.lang.String r2 = ", outputFormat="
            java.lang.String r3 = ", commentsLevel="
            r4 = r17
            r14 = r23
            j8.b.t(r1, r4, r2, r14, r3)
            java.lang.String r2 = ", codeCache="
            java.lang.String r3 = ", codeWriter="
            r4 = r19
            r5 = r20
            j8.b.t(r1, r4, r2, r5, r3)
            java.lang.String r2 = ", useDxInput=false, pluginOptions="
            java.lang.String r3 = ", cfgOutput=false, rawCFGOutput=false, useHeadersForDetectResourceExtensions=false, typeUpdatesLimitCount="
            r4 = r21
            r5 = r22
            j8.b.t(r1, r4, r2, r5, r3)
            java.lang.String r2 = "}"
            int r3 = r0.I
            java.lang.String r1 = j8.b.j(r1, r3, r2)
            return r1
    }
}
