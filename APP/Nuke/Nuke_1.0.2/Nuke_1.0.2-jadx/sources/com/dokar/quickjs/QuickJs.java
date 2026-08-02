package com.dokar.quickjs;

import com.dokar.quickjs.binding.JsFunction;
import com.dokar.quickjs.binding.JsObject;
import com.dokar.quickjs.binding.JsProperty;
import defpackage.a2;
import defpackage.a83;
import defpackage.b2;
import defpackage.c20;
import defpackage.c50;
import defpackage.c80;
import defpackage.d2;
import defpackage.d20;
import defpackage.d72;
import defpackage.es1;
import defpackage.fg1;
import defpackage.il1;
import defpackage.in0;
import defpackage.iu;
import defpackage.j20;
import defpackage.k20;
import defpackage.k21;
import defpackage.kl1;
import defpackage.mn0;
import defpackage.op0;
import defpackage.ow1;
import defpackage.p7;
import defpackage.rc;
import defpackage.s;
import defpackage.s42;
import defpackage.sk;
import defpackage.sn;
import defpackage.t00;
import defpackage.t11;
import defpackage.t42;
import defpackage.te;
import defpackage.u42;
import defpackage.ug;
import defpackage.v42;
import defpackage.vi0;
import defpackage.w42;
import defpackage.x42;
import defpackage.xe1;
import defpackage.xn0;
import defpackage.y42;
import defpackage.y53;
import defpackage.yc0;
import defpackage.z53;
import defpackage.zc0;
import defpackage.zt2;
import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.UByteArray;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class QuickJs implements Closeable {
    public static final s42 Companion = new s42();
    private final List<k21> asyncJobs;
    private long context;
    private final j20 coroutineScope;
    private Throwable evalException;
    private final d20 exceptionHandler;
    private final Map<String, sk> globalFunctions;
    private long globals;
    private boolean isClosed;
    private final c20 jobDispatcher;
    private final il1 jobsMutex;
    private final il1 jsMutex;
    private final il1 jsResultMutex;
    private long maxStackSize;
    private long memoryLimit;
    private final List<byte[]> modules;
    private final Map<Long, es1> objectBindings;
    private long runtime;
    private final z53 typeConverters;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        synchronized (sn.N) {
            String property = System.getProperty("com.dokar.quickjs.library.path");
            String property2 = System.getProperty("com.dokar.quickjs.library.name");
            if (property == null || property2 == null) {
                System.loadLibrary("quickjs");
                return;
            }
            File file = new File(property, property2);
            if (file.exists()) {
                System.load(file.getAbsolutePath());
                return;
            }
            throw new IllegalStateException(("Cannot find a suitable QuickJS binary at the configured path (com.dokar.quickjs.library.path = " + property + "). File " + file + " does not exist.").toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private QuickJs(c20 c20Var) throws QuickJsException {
        this.jobDispatcher = c20Var;
        this.objectBindings = new LinkedHashMap();
        this.globalFunctions = new LinkedHashMap();
        this.modules = new ArrayList();
        y42 y42Var = new y42(this);
        this.exceptionHandler = y42Var;
        c20Var.getClass();
        this.coroutineScope = te.e(xe1.f0(c20Var, y42Var));
        this.jsMutex = new kl1();
        this.jsResultMutex = new kl1();
        this.jobsMutex = new kl1();
        this.asyncJobs = new ArrayList();
        this.typeConverters = new z53();
        this.memoryLimit = -1L;
        this.maxStackSize = 262144L;
        try {
            long jNewRuntime = newRuntime();
            this.runtime = jNewRuntime;
            this.context = newContext(jNewRuntime);
            this.globals = initGlobals(this.runtime, new Class[]{a83.class, UByteArray.class});
        } catch (QuickJsException e) {
            close();
            throw e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r12 == r6) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e A[Catch: all -> 0x009f, TryCatch #1 {all -> 0x009f, blocks: (B:32:0x007d, B:33:0x0088, B:35:0x008e, B:37:0x009b), top: B:54:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007d A[EXC_TOP_SPLITTER, PHI: r1
  0x007d: PHI (r1v6 il1) = (r1v17 il1), (r1v18 il1) binds: [B:30:0x007a, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00b7 -> B:29:0x006d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitAsyncJobs(t00<? super a83> t00Var) {
        t42 t42Var;
        il1 il1Var;
        il1 il1Var2;
        ArrayList arrayList;
        Object objD;
        if (t00Var instanceof t42) {
            t42Var = (t42) t00Var;
            int i = t42Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                t42Var.n = i - Integer.MIN_VALUE;
            } else {
                t42Var = new t42(this, t00Var);
            }
        }
        Object obj = t42Var.l;
        int i2 = t42Var.n;
        k20 k20Var = k20.h;
        try {
            if (i2 == 0) {
                fg1.T(obj);
                il1 il1Var3 = this.jsMutex;
                t42Var.k = il1Var3;
                t42Var.n = 1;
                kl1 kl1Var = (kl1) il1Var3;
                Object objD2 = kl1Var.d(t42Var);
                il1Var = kl1Var;
            } else if (i2 == 1) {
                il1 il1Var4 = t42Var.k;
                fg1.T(obj);
                il1Var = il1Var4;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.T(obj);
                    il1 il1Var5 = this.jobsMutex;
                    t42Var.k = il1Var5;
                    t42Var.n = 2;
                    kl1 kl1Var2 = (kl1) il1Var5;
                    objD = kl1Var2.d(t42Var);
                    il1Var2 = kl1Var2;
                    if (objD != k20Var) {
                        try {
                            List<k21> list = this.asyncJobs;
                            arrayList = new ArrayList();
                            for (Object obj2 : list) {
                                if (((k21) obj2).b()) {
                                    arrayList.add(obj2);
                                }
                            }
                            ((kl1) il1Var2).f(null);
                            if (!arrayList.isEmpty()) {
                                return a83.a;
                            }
                            t42Var.k = null;
                            t42Var.n = 3;
                            if (op0.t(arrayList, t42Var) != k20Var) {
                                il1 il1Var52 = this.jobsMutex;
                                t42Var.k = il1Var52;
                                t42Var.n = 2;
                                kl1 kl1Var22 = (kl1) il1Var52;
                                objD = kl1Var22.d(t42Var);
                                il1Var2 = kl1Var22;
                                if (objD != k20Var) {
                                }
                            }
                        } finally {
                        }
                    }
                    return k20Var;
                }
                il1 il1Var6 = t42Var.k;
                fg1.T(obj);
                il1Var2 = il1Var6;
                List<k21> list2 = this.asyncJobs;
                arrayList = new ArrayList();
                while (r12.hasNext()) {
                }
                ((kl1) il1Var2).f(null);
                if (!arrayList.isEmpty()) {
                }
            }
            if (!this.isClosed) {
                do {
                } while (executePendingJob(this.context, this.globals));
            }
            il1 il1Var522 = this.jobsMutex;
            t42Var.k = il1Var522;
            t42Var.n = 2;
            kl1 kl1Var222 = (kl1) il1Var522;
            objD = kl1Var222.d(t42Var);
            il1Var2 = kl1Var222;
            if (objD != k20Var) {
            }
            return k20Var;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void clearHandledPromiseRejection() {
        if (this.isClosed) {
            return;
        }
        this.evalException = null;
    }

    private final native byte[] compile(long j, long j2, String str, String str2, boolean z);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ byte[] compile$default(QuickJs quickJs, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "main.js";
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return quickJs.compile(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: defineBinding-NW8rdx8$default, reason: not valid java name */
    public static /* synthetic */ long m10defineBindingNW8rdx8$default(QuickJs quickJs, String str, es1 es1Var, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = -1;
        }
        return quickJs.m11defineBindingNW8rdx8(str, es1Var, j);
    }

    private final native void defineFunction(long j, long j2, String str, boolean z);

    private final native long defineObject(long j, long j2, long j3, String str, JsProperty[] jsPropertyArr, JsFunction[] jsFunctionArr);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void ensureNotClosed() throws QuickJsException {
        if (this.isClosed || this.runtime == 0 || this.context == 0 || this.globals == 0) {
            throw new QuickJsException("Already closed.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x0032 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:83:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:86:0x0020 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011d A[Catch: all -> 0x0133, TRY_LEAVE, TryCatch #5 {all -> 0x0133, blocks: (B:57:0x0119, B:59:0x011d, B:65:0x0135, B:66:0x013c), top: B:89:0x0119, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0135 A[Catch: all -> 0x0133, TRY_ENTER, TryCatch #5 {all -> 0x0133, blocks: (B:57:0x0119, B:59:0x011d, B:65:0x0135, B:66:0x013c), top: B:89:0x0119, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, t00, u00, u42] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v17, types: [kl1] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v4, types: [kl1] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v5, types: [kl1] */
    /* JADX WARN: Type inference failed for: r11v6, types: [il1] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [il1] */
    /* JADX WARN: Type inference failed for: r5v16, types: [il1] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v5, types: [il1] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v2, types: [il1] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [il1] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r8v3, types: [in0] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.dokar.quickjs.QuickJs] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object evalAndAwait(in0 in0Var, t00<Object> t00Var) throws Throwable {
        ?? u42Var;
        ?? r11;
        in0 in0Var2;
        int i;
        ?? r112;
        ?? r10;
        ?? r7;
        int i2;
        int i3;
        ?? r5;
        int i4;
        ?? r8;
        int i5;
        ?? r6;
        int i6;
        ?? r52;
        ?? r53;
        ?? r54;
        ?? r102;
        ?? r103;
        if (t00Var instanceof u42) {
            u42 u42Var2 = (u42) t00Var;
            int i7 = u42Var2.s;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                u42Var2.s = i7 - Integer.MIN_VALUE;
                u42Var = u42Var2;
            } else {
                u42Var = new u42(this, t00Var);
            }
        }
        Object obj = u42Var.q;
        int i8 = u42Var.s;
        k20 k20Var = k20.h;
        try {
            switch (i8) {
                case 0:
                    fg1.T(obj);
                    ensureNotClosed();
                    this.evalException = null;
                    u42Var.k = in0Var;
                    u42Var.s = 1;
                    if (loadModules(u42Var) != k20Var) {
                        il1 il1Var = this.jsResultMutex;
                        u42Var.k = in0Var;
                        u42Var.l = il1Var;
                        u42Var.n = 0;
                        u42Var.s = 2;
                        r11 = (kl1) il1Var;
                        if (r11.d(u42Var) != k20Var) {
                            in0Var2 = in0Var;
                            i = 0;
                            r112 = r11;
                            try {
                                il1 il1Var2 = this.jsMutex;
                                u42Var.k = in0Var2;
                                u42Var.l = r112;
                                u42Var.m = il1Var2;
                                u42Var.n = i;
                                u42Var.o = 0;
                                u42Var.p = 0;
                                u42Var.s = 3;
                                r10 = (kl1) il1Var2;
                                if (r10.d(u42Var) != k20Var) {
                                    r7 = r112;
                                    i2 = 0;
                                    i3 = i;
                                    r5 = r10;
                                    i4 = 0;
                                    r8 = in0Var2;
                                    try {
                                        u42Var.k = null;
                                        u42Var.l = r7;
                                        u42Var.m = r5;
                                        u42Var.n = i3;
                                        u42Var.o = i2;
                                        u42Var.p = i4;
                                        u42Var.s = 4;
                                        if (r8.j(u42Var) != k20Var) {
                                            i5 = i2;
                                            r6 = r7;
                                            i6 = i3;
                                            r53 = r5;
                                            try {
                                                ((kl1) r53).f(null);
                                                u42Var.k = null;
                                                u42Var.l = r6;
                                                u42Var.m = null;
                                                u42Var.n = i6;
                                                u42Var.o = i5;
                                                u42Var.s = 5;
                                                if (awaitAsyncJobs(u42Var) != k20Var) {
                                                    r54 = r6;
                                                    il1 il1Var3 = this.jsMutex;
                                                    u42Var.k = null;
                                                    u42Var.l = r54;
                                                    u42Var.m = il1Var3;
                                                    u42Var.n = i6;
                                                    u42Var.o = i5;
                                                    u42Var.p = 0;
                                                    u42Var.s = 6;
                                                    r102 = (kl1) il1Var3;
                                                    if (r102.d(u42Var) != k20Var) {
                                                        u42Var = r54;
                                                        r103 = r102;
                                                        try {
                                                            if (!this.isClosed) {
                                                                throw new CancellationException("Already closed.");
                                                            }
                                                            Object evaluateResult = getEvaluateResult(this.context, this.globals);
                                                            ((kl1) u42Var).f(null);
                                                            handleException();
                                                            return evaluateResult;
                                                        } finally {
                                                            ((kl1) r103).f(null);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                u42Var = r6;
                                                ((kl1) u42Var).f(null);
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r52 = r5;
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                u42Var = r112;
                                ((kl1) u42Var).f(null);
                                throw th;
                            }
                        }
                    }
                    return k20Var;
                case 1:
                    in0Var = u42Var.k;
                    fg1.T(obj);
                    il1 il1Var4 = this.jsResultMutex;
                    u42Var.k = in0Var;
                    u42Var.l = il1Var4;
                    u42Var.n = 0;
                    u42Var.s = 2;
                    r11 = (kl1) il1Var4;
                    if (r11.d(u42Var) != k20Var) {
                    }
                    return k20Var;
                case 2:
                    int i9 = u42Var.n;
                    il1 il1Var5 = u42Var.l;
                    in0 in0Var3 = u42Var.k;
                    fg1.T(obj);
                    r112 = il1Var5;
                    in0Var2 = in0Var3;
                    i = i9;
                    il1 il1Var22 = this.jsMutex;
                    u42Var.k = in0Var2;
                    u42Var.l = r112;
                    u42Var.m = il1Var22;
                    u42Var.n = i;
                    u42Var.o = 0;
                    u42Var.p = 0;
                    u42Var.s = 3;
                    r10 = (kl1) il1Var22;
                    if (r10.d(u42Var) != k20Var) {
                    }
                    return k20Var;
                case 3:
                    i4 = u42Var.p;
                    i2 = u42Var.o;
                    int i10 = u42Var.n;
                    il1 il1Var6 = u42Var.m;
                    il1 il1Var7 = u42Var.l;
                    in0 in0Var4 = u42Var.k;
                    try {
                        fg1.T(obj);
                        i3 = i10;
                        r5 = il1Var6;
                        r7 = il1Var7;
                        r8 = in0Var4;
                        u42Var.k = null;
                        u42Var.l = r7;
                        u42Var.m = r5;
                        u42Var.n = i3;
                        u42Var.o = i2;
                        u42Var.p = i4;
                        u42Var.s = 4;
                        if (r8.j(u42Var) != k20Var) {
                        }
                        return k20Var;
                    } catch (Throwable th4) {
                        th = th4;
                        u42Var = il1Var7;
                        ((kl1) u42Var).f(null);
                        throw th;
                    }
                case 4:
                    i5 = u42Var.o;
                    i6 = u42Var.n;
                    il1 il1Var8 = u42Var.m;
                    il1 il1Var9 = u42Var.l;
                    try {
                        fg1.T(obj);
                        r53 = il1Var8;
                        r6 = il1Var9;
                        ((kl1) r53).f(null);
                        u42Var.k = null;
                        u42Var.l = r6;
                        u42Var.m = null;
                        u42Var.n = i6;
                        u42Var.o = i5;
                        u42Var.s = 5;
                        if (awaitAsyncJobs(u42Var) != k20Var) {
                        }
                        return k20Var;
                    } catch (Throwable th5) {
                        th = th5;
                        r52 = il1Var8;
                        throw th;
                    }
                case 5:
                    i5 = u42Var.o;
                    i6 = u42Var.n;
                    r54 = u42Var.l;
                    try {
                        fg1.T(obj);
                        r54 = r54;
                        il1 il1Var32 = this.jsMutex;
                        u42Var.k = null;
                        u42Var.l = r54;
                        u42Var.m = il1Var32;
                        u42Var.n = i6;
                        u42Var.o = i5;
                        u42Var.p = 0;
                        u42Var.s = 6;
                        r102 = (kl1) il1Var32;
                        if (r102.d(u42Var) != k20Var) {
                        }
                        return k20Var;
                    } catch (Throwable th6) {
                        th = th6;
                        u42Var = r54;
                        ((kl1) u42Var).f(null);
                        throw th;
                    }
                case AIChatConfig.DefaultContextRounds /* 6 */:
                    il1 il1Var10 = u42Var.m;
                    il1 il1Var11 = u42Var.l;
                    fg1.T(obj);
                    u42Var = il1Var11;
                    r103 = il1Var10;
                    if (!this.isClosed) {
                    }
                    break;
                default:
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native Object evaluate(long j, long j2, String str, String str2, boolean z);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object evaluate$default(QuickJs quickJs, String str, String str2, boolean z, t00 t00Var, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "main.js";
        }
        if ((i & 4) != 0) {
            z = false;
        }
        quickJs.evaluateInternal(str, str2, z, t00Var);
        t11.R();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native Object evaluateBytecode(long j, long j2, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean executePendingJob(long j, long j2);

    private final native void gc(long j, long j2);

    private final native Object getEvaluateResult(long j, long j2);

    private final native MemoryUsage getMemoryUsage(long j, long j2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void handleException() throws Throwable {
        Throwable th = this.evalException;
        if (th == null) {
            return;
        }
        this.evalException = null;
        throw th;
    }

    private final native long initGlobals(long j, Class<?>[] clsArr);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final a83 invokeAsyncFunction$lambda$1(QuickJs quickJs, k21 k21Var, Throwable th) {
        il1 il1Var = quickJs.jobsMutex;
        do {
            try {
            } catch (Throwable th2) {
                ((kl1) il1Var).f(null);
                throw th2;
            }
        } while (!((kl1) il1Var).e());
        quickJs.asyncJobs.remove(k21Var);
        ((kl1) il1Var).f(null);
        return a83.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native void invokeJsFunction(long j, long j2, long j3, Object[] objArr);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadModules(t00<? super a83> t00Var) {
        x42 x42Var;
        il1 il1Var;
        if (t00Var instanceof x42) {
            x42Var = (x42) t00Var;
            int i = x42Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                x42Var.n = i - Integer.MIN_VALUE;
            } else {
                x42Var = new x42(this, t00Var);
            }
        }
        Object obj = x42Var.l;
        int i2 = x42Var.n;
        if (i2 == 0) {
            fg1.T(obj);
            il1 il1Var2 = this.jsMutex;
            x42Var.k = il1Var2;
            x42Var.n = 1;
            kl1 kl1Var = (kl1) il1Var2;
            Object objD = kl1Var.d(x42Var);
            k20 k20Var = k20.h;
            il1Var = kl1Var;
            if (objD == k20Var) {
                return k20Var;
            }
        } else {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            il1 il1Var3 = x42Var.k;
            fg1.T(obj);
            il1Var = il1Var3;
        }
        try {
            Iterator<byte[]> it = this.modules.iterator();
            while (it.hasNext()) {
                QuickJs quickJs = this;
                quickJs.evaluateBytecode(this.context, this.globals, it.next());
                this = quickJs;
            }
            this.modules.clear();
            a83 a83Var = a83.a;
            ((kl1) il1Var).f(null);
            return a83Var;
        } catch (Throwable th) {
            ((kl1) il1Var).f(null);
            throw th;
        }
    }

    private final native String nativeGetVersion();

    private final native long newContext(long j);

    private final native long newRuntime();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Object onCallFunction(long j, String str, Object[] objArr) throws QuickJsException {
        ensureNotClosed();
        Object objB = a83.a;
        t00 t00Var = null;
        if (j == -1) {
            sk skVar = this.globalFunctions.get(str);
            if (skVar == null) {
                throw new QuickJsException(vi0.j("'", str, "()' does not found in global functions."));
            }
            if (skVar instanceof ug) {
                invokeAsyncFunction$quickjs_release(objArr, new a2(skVar, t00Var, 22));
                return objB;
            }
            if (skVar instanceof xn0) {
                return ((xn0) skVar).b(objArr);
            }
            if (skVar instanceof es1) {
                throw new QuickJsException("Object call not be invoked.");
            }
            c80.s();
            return null;
        }
        es1 es1Var = this.objectBindings.get(Long.valueOf(j));
        if (es1Var == null) {
            throw new QuickJsException(vi0.j("JavaScript called function '", str, "' on an unknown binding"));
        }
        zc0 zc0Var = (zc0) es1Var;
        QuickJs quickJs = zc0Var.b;
        str.getClass();
        objArr.getClass();
        yc0 yc0Var = (yc0) zc0Var.d.get(str);
        if (yc0Var == null) {
            throw new QuickJsException(vi0.k("Function '", str, "' not found on object '", zc0Var.a.a, "'"));
        }
        sk skVar2 = yc0Var.b;
        if (skVar2 instanceof ug) {
            quickJs.invokeAsyncFunction$quickjs_release(objArr, new b2(skVar2, zc0Var, t00Var, 7));
        } else {
            if (!(skVar2 instanceof xn0)) {
                if (skVar2 instanceof es1) {
                    throw new QuickJsException("Object cannot be invoked!");
                }
                c80.s();
                return null;
            }
            objB = ((xn0) skVar2).b(objArr);
        }
        if (te.o0(objB) != null) {
            return objB;
        }
        z53 z53Var = quickJs.typeConverters;
        z53Var.a(objB, te.n0(z53Var, objB), d72.c(JsObject.class));
        return objB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Object onCallGetter(long j, String str) throws QuickJsException {
        ensureNotClosed();
        es1 es1Var = this.objectBindings.get(Long.valueOf(j));
        if (es1Var == null) {
            throw new QuickJsException(vi0.j("JavaScript called getter of '", str, "' on an unknown binding"));
        }
        zc0 zc0Var = (zc0) es1Var;
        str.getClass();
        if (zc0Var.c.get(str) == null) {
            throw new QuickJsException(vi0.k("Property '", str, "' not found on object '", zc0Var.a.a, "'"));
        }
        throw new ClassCastException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void onCallSetter(long j, String str, Object obj) throws QuickJsException {
        ensureNotClosed();
        es1 es1Var = this.objectBindings.get(Long.valueOf(j));
        if (es1Var == null) {
            throw new QuickJsException(vi0.j("JavaScript called setter of '", str, "' on an unknown binding"));
        }
        zc0 zc0Var = (zc0) es1Var;
        str.getClass();
        if (zc0Var.c.get(str) != null) {
            throw new ClassCastException();
        }
        throw new QuickJsException(vi0.k("Property '", str, "' not found on object '", zc0Var.a.a, "'"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final ow1 promiseHandlesFromArgs(Object[] objArr) {
        if (objArr.length < 2) {
            s.j("Invoking async functions requires resolve and reject handles.");
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof Long)) {
            s.c(vi0.j("Unexpected resolve handle type ", obj != null ? d72.a(obj.getClass()).b() : null, ", expected: Long"));
            return null;
        }
        Object obj2 = objArr[1];
        if (obj2 instanceof Long) {
            return new ow1(obj, obj2);
        }
        s.c(vi0.j("Unexpected reject handle type ", obj2 != null ? d72.a(obj2.getClass()).b() : null, ", expected: Long"));
        return null;
    }

    private final native void releaseContext(long j);

    private final native void releaseGlobals(long j, long j2);

    private final native void releaseRuntime(long j);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setEvalException(Throwable th) throws QuickJsException {
        ensureNotClosed();
        this.evalException = th;
    }

    private final native void setMaxStackSize(long j, long j2, long j3);

    private final native void setMemoryLimit(long j, long j2, long j3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setUnhandledPromiseRejection(Object obj) {
        if (this.isClosed) {
            return;
        }
        if (this.evalException == null) {
            Throwable quickJsException = obj instanceof Throwable ? (Throwable) obj : null;
            if (quickJsException == null) {
                quickJsException = new QuickJsException(String.valueOf(obj));
            }
            this.evalException = quickJsException;
        }
        il1 il1Var = this.jobsMutex;
        do {
            try {
            } finally {
                ((kl1) il1Var).f(null);
            }
        } while (!((kl1) il1Var).e());
        Iterator<T> it = this.asyncJobs.iterator();
        while (it.hasNext()) {
            ((k21) it.next()).c(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addModule(String str, String str2) throws QuickJsException {
        str.getClass();
        str2.getClass();
        ensureNotClosed();
        this.modules.add(compile(str2, str, true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addTypeConverters(y53... y53VarArr) {
        y53VarArr.getClass();
        z53 z53Var = this.typeConverters;
        y53[] y53VarArr2 = (y53[]) Arrays.copyOf(y53VarArr, y53VarArr.length);
        z53Var.getClass();
        ArrayList arrayList = z53Var.a;
        iu.h0(arrayList, y53VarArr2);
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            c80.g();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        il1 il1Var = this.jobsMutex;
        do {
            try {
            } catch (Throwable th) {
                ((kl1) il1Var).f(null);
                throw th;
            }
        } while (!((kl1) il1Var).e());
        Iterator<T> it = this.asyncJobs.iterator();
        while (it.hasNext()) {
            ((k21) it.next()).c(null);
        }
        this.asyncJobs.clear();
        ((kl1) il1Var).f(null);
        il1 il1Var2 = this.jsMutex;
        do {
            try {
            } finally {
                ((kl1) il1Var2).f(null);
            }
        } while (!((kl1) il1Var2).e());
        this.objectBindings.clear();
        this.globalFunctions.clear();
        this.modules.clear();
        long j = this.globals;
        if (j != 0) {
            releaseGlobals(this.context, j);
            this.globals = 0L;
        }
        long j2 = this.context;
        if (j2 != 0) {
            releaseContext(j2);
            this.context = 0L;
        }
        long j3 = this.runtime;
        if (j3 != 0) {
            releaseRuntime(j3);
            this.runtime = 0L;
        }
        ((kl1) il1Var2).f(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte[] compile(String str, String str2, boolean z) throws QuickJsException {
        str.getClass();
        str2.getClass();
        ensureNotClosed();
        il1 il1Var = this.jsMutex;
        do {
            try {
            } finally {
                ((kl1) il1Var).f(null);
            }
        } while (!((kl1) il1Var).e());
        return compile(this.context, this.globals, str2, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final <R> void defineBinding(String str, xn0 xn0Var) {
        str.getClass();
        xn0Var.getClass();
        il1 il1Var = this.jsMutex;
        do {
            try {
            } finally {
                ((kl1) il1Var).f(null);
            }
        } while (!((kl1) il1Var).e());
        ensureNotClosed();
        defineFunction(this.globals, this.context, str, false);
        this.globalFunctions.put(str, xn0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: defineBinding-NW8rdx8, reason: not valid java name */
    public final long m11defineBindingNW8rdx8(String str, es1 es1Var, long j) {
        str.getClass();
        es1Var.getClass();
        il1 il1Var = this.jsMutex;
        do {
            try {
            } finally {
                ((kl1) il1Var).f(null);
            }
        } while (!((kl1) il1Var).e());
        ensureNotClosed();
        long jDefineObject = defineObject(this.globals, this.context, j, str, (JsProperty[]) ((zc0) es1Var).e.toArray(new JsProperty[0]), (JsFunction[]) ((zc0) es1Var).f.toArray(new JsFunction[0]));
        if (jDefineObject >= 0) {
            this.objectBindings.put(Long.valueOf(jDefineObject), es1Var);
            return jDefineObject;
        }
        throw new QuickJsException("Failed to define object '" + str + "'.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final <T> Object evaluate(byte[] bArr, t00<? super T> t00Var) {
        evaluateInternal(bArr, t00Var);
        t11.R();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object evaluateInternal(String str, String str2, boolean z, t00<Object> t00Var) {
        return evalAndAwait(new v42(this, str2, str, z, null), t00Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void gc() throws QuickJsException {
        ensureNotClosed();
        gc(this.runtime, this.globals);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getMaxStackSize() {
        return this.maxStackSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getMemoryLimit() {
        return this.memoryLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MemoryUsage getMemoryUsage() throws QuickJsException {
        ensureNotClosed();
        getMemoryUsage(this.runtime, this.globals);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final z53 getTypeConverters() {
        return this.typeConverters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getVersion() {
        return nativeGetVersion();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void invokeAsyncFunction$quickjs_release(Object[] objArr, mn0 mn0Var) {
        objArr.getClass();
        mn0Var.getClass();
        if (this.isClosed) {
            return;
        }
        ow1 ow1VarPromiseHandlesFromArgs = promiseHandlesFromArgs(objArr);
        zt2 zt2VarA = p7.A(this.coroutineScope, null, new w42(mn0Var, objArr, this, ((Number) ow1VarPromiseHandlesFromArgs.h).longValue(), ((Number) ow1VarPromiseHandlesFromArgs.i).longValue(), null), 3);
        il1 il1Var = this.jobsMutex;
        do {
            try {
            } catch (Throwable th) {
                ((kl1) il1Var).f(null);
                throw th;
            }
        } while (!((kl1) il1Var).e());
        this.asyncJobs.add(zt2VarA);
        ((kl1) il1Var).f(null);
        zt2VarA.t(new d2(28, this, zt2VarA));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isClosed() {
        return this.isClosed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setMaxStackSize(long j) throws QuickJsException {
        ensureNotClosed();
        this.maxStackSize = j;
        setMaxStackSize(this.runtime, this.globals, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setMemoryLimit(long j) throws QuickJsException {
        ensureNotClosed();
        this.memoryLimit = j;
        setMemoryLimit(this.runtime, this.globals, j);
    }

    public final <T> Object evaluate(String str, String str2, boolean z, t00<? super T> t00Var) {
        evaluateInternal(str, str2, z, t00Var);
        t11.R();
        throw null;
    }

    public final Object evaluateInternal(byte[] bArr, t00<Object> t00Var) {
        return evalAndAwait(new rc(this, bArr, null, 1), t00Var);
    }

    public final void addModule(byte[] bArr) throws QuickJsException {
        bArr.getClass();
        ensureNotClosed();
        this.modules.add(bArr);
    }

    public static /* synthetic */ void getTypeConverters$annotations() {
    }

    public final <R> void defineBinding(String str, ug ugVar) {
        str.getClass();
        ugVar.getClass();
        il1 il1Var = this.jsMutex;
        do {
            try {
            } finally {
                ((kl1) il1Var).f(null);
            }
        } while (!((kl1) il1Var).e());
        ensureNotClosed();
        defineFunction(this.globals, this.context, str, true);
        this.globalFunctions.put(str, ugVar);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 c20) A[MD:(c20):void throws com.dokar.quickjs.QuickJsException (m)] (LINE:125) call: com.dokar.quickjs.QuickJs.<init>(c20):void type: THIS */
    public /* synthetic */ QuickJs(c20 c20Var, c50 c50Var) {
        this(c20Var);
    }
}
