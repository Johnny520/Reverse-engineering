package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ java.lang.String A(int r1) {
            r0 = 1
            if (r1 == r0) goto L1e
            r0 = 2
            if (r1 == r0) goto L1b
            r0 = 3
            if (r1 == r0) goto L18
            r0 = 4
            if (r1 == r0) goto L15
            r0 = 5
            if (r1 == r0) goto L12
            java.lang.String r1 = "null"
            return r1
        L12:
            java.lang.String r1 = "GENERATED_AND_UNLOADED"
            return r1
        L15:
            java.lang.String r1 = "PROCESS_COMPLETE"
            return r1
        L18:
            java.lang.String r1 = "PROCESS_STARTED"
            return r1
        L1b:
            java.lang.String r1 = "LOADED"
            return r1
        L1e:
            java.lang.String r1 = "NOT_LOADED"
            return r1
    }

    public static final int a(int r4) {
            int r0 = t3.c.b(r4)
            r1 = 2
            if (r0 == 0) goto L3d
            r2 = 1
            if (r0 == r2) goto L3c
            if (r0 == r1) goto L3a
            r1 = 5
            r2 = 3
            if (r0 == r2) goto L39
            r3 = 4
            if (r0 == r3) goto L38
            if (r0 != r1) goto L16
            return r2
        L16:
            switch(r4) {
                case 1: goto L2b;
                case 2: goto L28;
                case 3: goto L25;
                case 4: goto L22;
                case 5: goto L1f;
                case 6: goto L1c;
                default: goto L19;
            }
        L19:
            java.lang.String r4 = "null"
            goto L2d
        L1c:
            java.lang.String r4 = "GE"
            goto L2d
        L1f:
            java.lang.String r4 = "GT"
            goto L2d
        L22:
            java.lang.String r4 = "LE"
            goto L2d
        L25:
            java.lang.String r4 = "LT"
            goto L2d
        L28:
            java.lang.String r4 = "NE"
            goto L2d
        L2b:
            java.lang.String r4 = "EQ"
        L2d:
            java.lang.String r0 = "Unknown if operations type: "
            java.lang.String r4 = r0.concat(r4)
            ah.a.k(r4)
            r4 = 0
            return r4
        L38:
            return r3
        L39:
            return r1
        L3a:
            r4 = 6
            return r4
        L3c:
            return r2
        L3d:
            return r1
    }

    public static final boolean b(int r1) {
            int r1 = t3.c.b(r1)
            r0 = 5
            if (r1 == r0) goto Lf
            r0 = 6
            if (r1 == r0) goto Lf
            r0 = 7
            if (r1 == r0) goto Lf
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public static /* synthetic */ java.lang.String c(int r1) {
            r0 = 1
            if (r1 == r0) goto L17
            r0 = 2
            if (r1 == r0) goto L14
            r0 = 3
            if (r1 == r0) goto L11
            r0 = 4
            if (r1 != r0) goto Lf
            java.lang.String r1 = "embedded"
            return r1
        Lf:
            r1 = 0
            throw r1
        L11:
            java.lang.String r1 = "system"
            return r1
        L14:
            java.lang.String r1 = "build"
            return r1
        L17:
            java.lang.String r1 = "runtime"
            return r1
    }

    public static /* synthetic */ java.lang.String d(int r1) {
            r0 = 1
            if (r1 == r0) goto L11
            r0 = 2
            if (r1 == r0) goto Le
            r0 = 3
            if (r1 != r0) goto Lc
            java.lang.String r1 = "? super "
            return r1
        Lc:
            r1 = 0
            throw r1
        Le:
            java.lang.String r1 = "?"
            return r1
        L11:
            java.lang.String r1 = "? extends "
            return r1
    }

    public static /* synthetic */ java.lang.String e(int r0) {
            switch(r0) {
                case 1: goto L23;
                case 2: goto L20;
                case 3: goto L1d;
                case 4: goto L1a;
                case 5: goto L17;
                case 6: goto L14;
                case 7: goto L11;
                case 8: goto Le;
                case 9: goto Lb;
                case 10: goto L8;
                case 11: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            throw r0
        L5:
            java.lang.String r0 = ">>>"
            return r0
        L8:
            java.lang.String r0 = ">>"
            return r0
        Lb:
            java.lang.String r0 = "<<"
            return r0
        Le:
            java.lang.String r0 = "^"
            return r0
        L11:
            java.lang.String r0 = "|"
            return r0
        L14:
            java.lang.String r0 = "&"
            return r0
        L17:
            java.lang.String r0 = "%"
            return r0
        L1a:
            java.lang.String r0 = "/"
            return r0
        L1d:
            java.lang.String r0 = "*"
            return r0
        L20:
            java.lang.String r0 = "-"
            return r0
        L23:
            java.lang.String r0 = "+"
            return r0
    }

    public static /* synthetic */ java.lang.String f(int r0) {
            switch(r0) {
                case 1: goto L14;
                case 2: goto L11;
                case 3: goto Le;
                case 4: goto Lb;
                case 5: goto L8;
                case 6: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            throw r0
        L5:
            java.lang.String r0 = ">="
            return r0
        L8:
            java.lang.String r0 = ">"
            return r0
        Lb:
            java.lang.String r0 = "<="
            return r0
        Le:
            java.lang.String r0 = "<"
            return r0
        L11:
            java.lang.String r0 = "!="
            return r0
        L14:
            java.lang.String r0 = "=="
            return r0
    }

    public static int g(int r0, int r1, int r2, int r3) {
            int r0 = r0 * r1
            int r0 = r0 + r2
            int r0 = r0 + r3
            return r0
    }

    public static i0.j1 h(boolean r0, i0.h0 r1) {
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            i0.j1 r0 = i0.r.u(r0)
            r1.k0(r0)
            return r0
    }

    public static java.lang.String i(int r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String j(int r1, java.lang.String r2, java.lang.String r3, int r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String k(java.lang.Class r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String l(java.lang.String r0, java.lang.String r1) {
            r0.getClass()
            java.lang.CharSequence r0 = og.m.R0(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String m(java.lang.String r0, java.lang.StringBuilder r1, boolean r2) {
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public static java.lang.String n(java.lang.StringBuilder r0, int r1, char r2) {
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.StringBuilder o(long r1, java.lang.String r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r1)
            r0.append(r4)
            return r0
    }

    public static java.util.Map p() {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            return r0
    }

    public static k8.g q() {
            i8.c r0 = h.Hchat.hooks.api.core.WeChatApis.message()
            r0.getClass()
            k8.g r0 = h.Hchat.hooks.api.core.WeChatApis.j()
            return r0
    }

    public static void r(int r0, int r1, int r2, int r3, int r4) {
            q1.d.a(r0)
            q1.d.a(r1)
            q1.d.a(r2)
            q1.d.a(r3)
            q1.d.a(r4)
            return
    }

    public static void s(j8.x r0, j8.x r1, j8.x r2, j8.x r3, j8.x r4) {
            s4.a.a(r0)
            s4.a.a(r1)
            s4.a.a(r2)
            s4.a.a(r3)
            s4.a.a(r4)
            return
    }

    public static /* synthetic */ void t(java.lang.AutoCloseable r5) {
            boolean r0 = r5 instanceof java.lang.AutoCloseable
            if (r0 == 0) goto L8
            r5.close()
            return
        L8:
            boolean r0 = r5 instanceof java.util.concurrent.ExecutorService
            if (r0 == 0) goto L3b
            java.util.concurrent.ExecutorService r5 = (java.util.concurrent.ExecutorService) r5
            java.util.concurrent.ForkJoinPool r0 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r5 != r0) goto L15
            goto L3a
        L15:
            boolean r0 = r5.isTerminated()
            if (r0 != 0) goto L3a
            r5.shutdown()
            r1 = 0
        L1f:
            if (r0 != 0) goto L31
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.InterruptedException -> L2a
            r3 = 1
            boolean r0 = r5.awaitTermination(r3, r2)     // Catch: java.lang.InterruptedException -> L2a
            goto L1f
        L2a:
            if (r1 != 0) goto L1f
            r5.shutdownNow()
            r1 = 1
            goto L1f
        L31:
            if (r1 == 0) goto L3a
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L3a:
            return
        L3b:
            boolean r0 = r5 instanceof android.content.res.TypedArray
            if (r0 == 0) goto L45
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r5.recycle()
            return
        L45:
            boolean r0 = r5 instanceof android.media.MediaMetadataRetriever
            if (r0 == 0) goto L4f
            android.media.MediaMetadataRetriever r5 = (android.media.MediaMetadataRetriever) r5
            r5.release()
            return
        L4f:
            boolean r0 = r5 instanceof android.media.MediaDrm
            if (r0 == 0) goto L59
            android.media.MediaDrm r5 = (android.media.MediaDrm) r5
            r5.release()
            return
        L59:
            j8.o.o()
            return
    }

    public static void u(java.lang.Number r0, int r1, i0.a1 r2) {
            int r0 = r0.intValue()
            int r0 = r0 + r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.setValue(r0)
            return
    }

    public static void v(java.lang.String r1) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            r0.delete()
            return
    }

    public static void w(java.lang.String r1, java.lang.String r2, tb.c r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            r3.log(r1)
            return
    }

    public static void x(java.lang.StringBuilder r0, boolean r1, java.lang.String r2, boolean r3, java.lang.String r4) {
            r0.append(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            return
    }

    public static void y(p4.j r0, p4.j r1, p4.j r2, p4.j r3, p4.j r4) {
            p4.k.a(r0)
            p4.k.a(r1)
            p4.k.a(r2)
            p4.k.a(r3)
            p4.k.a(r4)
            return
    }

    public static int z(int r0, int r1, int r2, int r3) {
            int r0 = r0 - r1
            int r0 = r0 * r2
            int r0 = r0 + r3
            return r0
    }
}
