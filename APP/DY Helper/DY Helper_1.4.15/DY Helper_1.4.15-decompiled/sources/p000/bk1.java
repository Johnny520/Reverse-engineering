package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class bk1 {

    /* JADX INFO: renamed from: β */
    public static final p000.C0208dd f1768 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.List f1769 = null;

    /* JADX INFO: renamed from: δ */
    public static final p000.bk1 f1770 = null;

    /* JADX INFO: renamed from: α */
    public final p000.C0384i5 f1771;

    static {
            r0 = 1
            byte[] r1 = new byte[r0]
            r2 = 42
            r3 = 0
            r1[r3] = r2
            dd r2 = new dd
            byte[] r1 = java.util.Arrays.copyOf(r1, r0)
            r2.<init>(r1)
            p000.bk1.f1768 = r2
            java.lang.String r1 = "*"
            java.util.List r1 = p000.AbstractC1021yh.m6896(r1)
            p000.bk1.f1769 = r1
            bk1 r1 = new bk1
            i5 r2 = new i5
            r2.<init>(r0)
            r1.<init>(r2)
            p000.bk1.f1770 = r1
            return
    }

    public bk1(p000.C0384i5 r1) {
            r0 = this;
            r0.<init>()
            r0.f1771 = r1
            return
    }

    /* JADX INFO: renamed from: β */
    public static java.util.List m974(java.lang.String r3) {
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 0
            r2 = 46
            r0[r1] = r2
            r2 = 6
            java.util.List r3 = p000.q02.m4682(r3, r0, r1, r2)
            java.lang.Object r0 = p000.AbstractC0984xh.m6645(r3)
            java.lang.String r1 = ""
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L1d
            java.util.List r3 = p000.AbstractC0984xh.m6635(r3)
        L1d:
            return r3
    }

    /* JADX INFO: renamed from: α */
    public final java.lang.String m975(java.lang.String r13) {
            r12 = this;
            java.lang.String r0 = java.net.IDN.toUnicode(r13)
            r0.getClass()
            java.util.List r0 = m974(r0)
            i5 r12 = r12.f1771
            java.lang.Object r1 = r12.f4914
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            boolean r2 = r1.get()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L44
            boolean r1 = r1.compareAndSet(r4, r3)
            if (r1 == 0) goto L44
            r1 = r4
        L20:
            r12.m2621()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f java.io.InterruptedIOException -> L35
            if (r1 == 0) goto L53
        L25:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            goto L53
        L2d:
            r12 = move-exception
            goto L3a
        L2f:
            r2 = move-exception
            r12.f4918 = r2     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L53
            goto L25
        L35:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L2d
            r1 = r3
            goto L20
        L3a:
            if (r1 == 0) goto L43
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            r13.interrupt()
        L43:
            throw r12
        L44:
            java.lang.Object r1 = r12.f4915     // Catch: java.lang.InterruptedException -> L4c
            java.util.concurrent.CountDownLatch r1 = (java.util.concurrent.CountDownLatch) r1     // Catch: java.lang.InterruptedException -> L4c
            r1.await()     // Catch: java.lang.InterruptedException -> L4c
            goto L53
        L4c:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L53:
            java.lang.Object r1 = r12.f4916
            dd r1 = (p000.C0208dd) r1
            if (r1 == 0) goto L17e
            int r1 = r0.size()
            dd[] r2 = new p000.C0208dd[r1]
            r5 = r4
        L60:
            if (r5 >= r1) goto L73
            dd r6 = p000.C0208dd.f3085
            java.lang.Object r6 = r0.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            dd r6 = p000.C0381i2.m2592(r6)
            r2[r5] = r6
            int r5 = r5 + 1
            goto L60
        L73:
            r5 = r4
        L74:
            java.lang.String r6 = "bytes"
            r7 = 0
            if (r5 >= r1) goto L8d
            java.lang.Object r8 = r12.f4916
            dd r8 = (p000.C0208dd) r8
            if (r8 == 0) goto L89
            java.lang.String r8 = p000.rk0.m5101(r8, r2, r5)
            if (r8 == 0) goto L86
            goto L8e
        L86:
            int r5 = r5 + 1
            goto L74
        L89:
            p000.ln0.m3650(r6)
            throw r7
        L8d:
            r8 = r7
        L8e:
            if (r1 <= r3) goto Lb3
            java.lang.Object r5 = r2.clone()
            dd[] r5 = (p000.C0208dd[]) r5
            int r9 = r5.length
            int r9 = r9 - r3
            r10 = r4
        L99:
            if (r10 >= r9) goto Lb3
            dd r11 = p000.bk1.f1768
            r5[r10] = r11
            java.lang.Object r11 = r12.f4916
            dd r11 = (p000.C0208dd) r11
            if (r11 == 0) goto Laf
            java.lang.String r11 = p000.rk0.m5101(r11, r5, r10)
            if (r11 == 0) goto Lac
            goto Lb4
        Lac:
            int r10 = r10 + 1
            goto L99
        Laf:
            p000.ln0.m3650(r6)
            throw r7
        Lb3:
            r11 = r7
        Lb4:
            if (r11 == 0) goto Ld0
            int r1 = r1 - r3
            r5 = r4
        Lb8:
            if (r5 >= r1) goto Ld0
            java.lang.Object r6 = r12.f4917
            dd r6 = (p000.C0208dd) r6
            if (r6 == 0) goto Lca
            java.lang.String r6 = p000.rk0.m5101(r6, r2, r5)
            if (r6 == 0) goto Lc7
            goto Ld1
        Lc7:
            int r5 = r5 + 1
            goto Lb8
        Lca:
            java.lang.String r12 = "exceptionBytes"
            p000.ln0.m3650(r12)
            throw r7
        Ld0:
            r6 = r7
        Ld1:
            r12 = 6
            r1 = 46
            if (r6 == 0) goto Le5
            java.lang.String r2 = "!"
            java.lang.String r2 = r2.concat(r6)
            char[] r5 = new char[r3]
            r5[r4] = r1
            java.util.List r12 = p000.q02.m4682(r2, r5, r4, r12)
            goto L111
        Le5:
            if (r8 != 0) goto Lec
            if (r11 != 0) goto Lec
            java.util.List r12 = p000.bk1.f1769
            goto L111
        Lec:
            jz r2 = p000.C0450jz.f5672
            if (r8 == 0) goto Lf9
            char[] r5 = new char[r3]
            r5[r4] = r1
            java.util.List r5 = p000.q02.m4682(r8, r5, r4, r12)
            goto Lfa
        Lf9:
            r5 = r2
        Lfa:
            if (r11 == 0) goto L104
            char[] r2 = new char[r3]
            r2[r4] = r1
            java.util.List r2 = p000.q02.m4682(r11, r2, r4, r12)
        L104:
            int r12 = r5.size()
            int r1 = r2.size()
            if (r12 <= r1) goto L110
            r12 = r5
            goto L111
        L110:
            r12 = r2
        L111:
            int r1 = r0.size()
            int r2 = r12.size()
            r5 = 33
            if (r1 != r2) goto L12a
            java.lang.Object r1 = r12.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            char r1 = r1.charAt(r4)
            if (r1 == r5) goto L12a
            return r7
        L12a:
            java.lang.Object r1 = r12.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            char r1 = r1.charAt(r4)
            if (r1 != r5) goto L140
            int r0 = r0.size()
            int r12 = r12.size()
        L13e:
            int r0 = r0 - r12
            goto L14a
        L140:
            int r0 = r0.size()
            int r12 = r12.size()
            int r12 = r12 + r3
            goto L13e
        L14a:
            java.util.List r12 = m974(r13)
            f7 r13 = new f7
            r13.<init>(r3, r12)
            if (r0 < 0) goto L172
            if (r0 != 0) goto L158
            goto L169
        L158:
            boolean r12 = r13 instanceof p000.InterfaceC0850tw
            if (r12 == 0) goto L163
            tw r13 = (p000.InterfaceC0850tw) r13
            ss1 r13 = r13.mo1106(r0)
            goto L169
        L163:
            sw r12 = new sw
            r12.<init>(r13, r0, r4)
            r13 = r12
        L169:
            java.lang.String r12 = "."
            r0 = 62
            java.lang.String r12 = p000.us1.m5955(r13, r12, r7, r0)
            return r12
        L172:
            java.lang.String r12 = "Requested element count "
            java.lang.String r13 = " is less than zero."
            java.lang.String r12 = p000.AbstractC0602nx.m4127(r12, r0, r13)
            p000.C1080.m7266(r12)
            return r7
        L17e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to load "
            r0.<init>(r1)
            java.lang.Object r1 = r12.f4919
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r1 = " resource."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            java.lang.Object r12 = r12.f4918
            java.io.IOException r12 = (java.io.IOException) r12
            r13.initCause(r12)
            throw r13
    }
}
