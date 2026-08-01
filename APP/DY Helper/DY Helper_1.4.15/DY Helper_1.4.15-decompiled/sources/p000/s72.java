package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class s72 {

    /* JADX INFO: renamed from: α */
    public static final java.util.List f9760 = null;

    static {
            java.lang.String r0 = "https://ghproxy.net/"
            java.lang.String r1 = "https://gh.jasonzeng.dev/"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.s72.f9760 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.r72 m5372(java.lang.String r12, java.io.OutputStream r13, p000.C1054zd r14) {
            t41 r0 = p000.C0963wx.f11880
            l91 r0 = new l91
            java.lang.String r1 = "Cache-Control"
            java.lang.String r2 = "no-cache"
            r0.<init>(r1, r2)
            java.util.Map r0 = p000.ex0.m1971(r0)
            java.lang.String r1 = "*/*"
            r2 = 12
            vx r1 = p000.C0963wx.m6411(r12, r0, r1, r2)
            java.lang.String r4 = r1.f11457
            long r5 = r1.f11461
            java.io.BufferedInputStream r0 = r1.f11459     // Catch: java.lang.Throwable -> L5f
            r2 = 32768(0x8000, float:4.5918E-41)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L5f
            int r3 = r0.read(r2)     // Catch: java.lang.Throwable -> L5f
            if (r3 < 0) goto L78
            r7 = 2
            if (r3 < r7) goto L70
            r7 = 0
            r8 = r2[r7]     // Catch: java.lang.Throwable -> L5f
            r9 = 80
            if (r8 != r9) goto L70
            r8 = 1
            r8 = r2[r8]     // Catch: java.lang.Throwable -> L5f
            r9 = 75
            if (r8 != r9) goto L70
            r13.write(r2, r7, r3)     // Catch: java.lang.Throwable -> L5f
            long r8 = (long) r3     // Catch: java.lang.Throwable -> L5f
            java.lang.Long r3 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L5f
            java.lang.Long r10 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L5f
            r14.mo10(r3, r10, r4)     // Catch: java.lang.Throwable -> L5f
        L48:
            int r3 = r0.read(r2)     // Catch: java.lang.Throwable -> L5f
            if (r3 < 0) goto L62
            r13.write(r2, r7, r3)     // Catch: java.lang.Throwable -> L5f
            long r10 = (long) r3     // Catch: java.lang.Throwable -> L5f
            long r8 = r8 + r10
            java.lang.Long r3 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L5f
            java.lang.Long r10 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L5f
            r14.mo10(r3, r10, r4)     // Catch: java.lang.Throwable -> L5f
            goto L48
        L5f:
            r0 = move-exception
            r12 = r0
            goto L80
        L62:
            r1.m6283()
            r13.flush()
            r72 r2 = new r72
            r3 = r12
            r7 = r8
            r2.<init>(r3, r4, r5, r7)
            return r2
        L70:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5f
            java.lang.String r13 = "下载内容不是APK文件"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L5f
            throw r12     // Catch: java.lang.Throwable -> L5f
        L78:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5f
            java.lang.String r13 = "下载内容为空"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L5f
            throw r12     // Catch: java.lang.Throwable -> L5f
        L80:
            r1.m6283()
            throw r12
    }

    /* JADX INFO: renamed from: β */
    public static void m5373(java.lang.String r6, p000.z61 r7, p000.C1054zd r8) {
            java.lang.String r0 = "r5cb9c9b314235f5"
            java.lang.String r1 = "download success url="
            r6.getClass()
            java.lang.CharSequence r6 = p000.q02.m4660(r6)
            java.lang.String r6 = r6.toString()
            boolean r2 = p000.q02.m4671(r6)
            if (r2 != 0) goto L6e
            r2 = 4
            r3 = 0
            java.lang.Object r7 = r7.invoke()     // Catch: java.lang.Throwable -> L41
            java.io.Closeable r7 = (java.io.Closeable) r7     // Catch: java.lang.Throwable -> L41
            r4 = r7
            java.io.OutputStream r4 = (java.io.OutputStream) r4     // Catch: java.lang.Throwable -> L43
            r72 r8 = m5372(r6, r4, r8)     // Catch: java.lang.Throwable -> L43
            long r4 = r8.f9284     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L43
            r8.append(r6)     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = " total="
            r8.append(r1)     // Catch: java.lang.Throwable -> L43
            r8.append(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L43
            p000.C0888ux.m5988(r0, r8, r3, r2, r3)     // Catch: java.lang.Throwable -> L43
            r7.close()     // Catch: java.lang.Throwable -> L41
            return
        L41:
            r7 = move-exception
            goto L4a
        L43:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L45
        L45:
            r1 = move-exception
            p000.AbstractC0978xb.m6584(r7, r8)     // Catch: java.lang.Throwable -> L41
            throw r1     // Catch: java.lang.Throwable -> L41
        L4a:
            java.lang.String r8 = r7.getMessage()
            java.lang.String r1 = "download failed url="
            java.lang.String r4 = " msg="
            java.lang.String r6 = p000.a12.m18(r1, r6, r4, r8)
            p000.C0888ux.m5988(r0, r6, r3, r2, r3)
            java.lang.String r6 = r7.getMessage()
            if (r6 == 0) goto L66
            java.lang.String r7 = "下载失败："
            java.lang.String r6 = r7.concat(r6)
            goto L68
        L66:
            java.lang.String r6 = "下载失败"
        L68:
            uw1 r7 = new uw1
            r7.<init>(r6)
            throw r7
        L6e:
            uw1 r6 = new uw1
            java.lang.String r7 = "下载链接为空"
            r6.<init>(r7)
            throw r6
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.String m5374(int r12, java.util.List r13) {
            java.lang.String r0 = "r5cb9c9b314235f5"
            r13.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r13 = r13.iterator()
        Le:
            boolean r2 = r13.hasNext()
            r3 = 1
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r13.next()
            java.lang.String r2 = (java.lang.String) r2
            r2.getClass()
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            boolean r4 = p000.q02.m4671(r2)
            if (r4 == 0) goto L2f
            jz r2 = p000.C0450jz.f5672
            goto L87
        L2f:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r5 = p000.s72.f9760
            if (r5 == 0) goto L3f
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L3f
            goto L59
        L3f:
            java.util.Iterator r6 = r5.iterator()
        L43:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L59
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = p000.x02.m6485(r2, r7, r3)
            if (r7 == 0) goto L43
            r4.add(r2)
            goto L7f
        L59:
            r4.add(r2)
            java.util.Iterator r3 = r5.iterator()
        L60:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L7f
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r2)
            java.lang.String r5 = r6.toString()
            r4.add(r5)
            goto L60
        L7f:
            java.util.Set r2 = p000.AbstractC0984xh.m6670(r4)
            java.util.List r2 = p000.AbstractC0984xh.m6666(r2)
        L87:
            p000.AbstractC0984xh.m6660(r1, r2)
            goto Le
        L8b:
            java.util.Set r13 = p000.AbstractC0984xh.m6670(r1)
            java.util.List r13 = p000.AbstractC0984xh.m6666(r13)
            java.lang.String r1 = ""
            if (r3 > r12) goto L106
        L97:
            java.util.Iterator r2 = r13.iterator()
            r4 = 0
        L9c:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto Lfa
            int r5 = r4 + 1
            java.lang.Object r6 = r2.next()
            java.lang.String r6 = (java.lang.String) r6
            r7 = 4
            r8 = 0
            t41 r9 = p000.C0963wx.f11880     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r9 = "Cache-Control"
            java.lang.String r10 = "no-cache"
            l91 r11 = new l91     // Catch: java.lang.Throwable -> Lc8
            r11.<init>(r9, r10)     // Catch: java.lang.Throwable -> Lc8
            java.util.Map r9 = p000.ex0.m1971(r11)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r9 = p000.C0963wx.m6407(r6, r9)     // Catch: java.lang.Throwable -> Lc8
            java.lang.CharSequence r9 = p000.q02.m4660(r9)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> Lc8
            goto Ld9
        Lc8:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            java.lang.String r10 = "fetch json failed url="
            java.lang.String r11 = " msg="
            java.lang.String r6 = p000.a12.m18(r10, r6, r11, r9)
            p000.C0888ux.m5988(r0, r6, r8, r7, r8)
            r6 = r1
        Ld9:
            boolean r9 = p000.q02.m4671(r6)
            if (r9 != 0) goto Lf8
            int r12 = r6.length()
            java.lang.String r13 = " attempt="
            java.lang.String r1 = " length="
            java.lang.String r2 = "json fetched urlIndex="
            java.lang.StringBuilder r13 = p000.AbstractC0602nx.m4136(r2, r4, r13, r3, r1)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            p000.C0888ux.m5988(r0, r12, r8, r7, r8)
            return r6
        Lf8:
            r4 = r5
            goto L9c
        Lfa:
            if (r3 >= r12) goto L101
            r4 = 5000(0x1388, double:2.4703E-320)
            java.lang.Thread.sleep(r4)     // Catch: java.lang.Throwable -> L101
        L101:
            if (r3 == r12) goto L106
            int r3 = r3 + 1
            goto L97
        L106:
            return r1
    }
}
