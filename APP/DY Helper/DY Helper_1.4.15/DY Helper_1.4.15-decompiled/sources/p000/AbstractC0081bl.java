package p000;

/* JADX INFO: renamed from: bl */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0081bl {

    /* JADX INFO: renamed from: α */
    public static final java.util.Set f1772 = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r0.getClass()
            p000.AbstractC0081bl.f1772 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m976(java.lang.reflect.Method r8, java.lang.String r9, p000.a80 r10, p000.a80 r11) {
            java.lang.String r0 = "rc108c6a5c31674e3"
            java.lang.String r1 = "已安装 "
            java.lang.Class r2 = r8.getDeclaringClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = r8.getName()
            java.lang.Class[] r4 = r8.getParameterTypes()
            r4.getClass()
            wj r5 = new wj
            r6 = 18
            r5.<init>(r6)
            r6 = 31
            r7 = 0
            java.lang.String r4 = p000.AbstractC0312g7.m2256(r4, r7, r7, r5, r6)
            java.lang.Class r5 = r8.getReturnType()
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "#"
            java.lang.String r7 = "("
            java.lang.StringBuilder r2 = p000.AbstractC0602nx.m4138(r2, r6, r3, r7, r4)
            java.lang.String r3 = "):"
            java.lang.String r2 = p000.lz1.m3691(r2, r3, r5)
            java.util.Set r3 = p000.AbstractC0081bl.f1772
            boolean r4 = r3.add(r2)
            if (r4 != 0) goto L44
            goto L8f
        L44:
            xq0 r4 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L68
            al r5 = new al     // Catch: java.lang.Throwable -> L68
            r5.<init>(r10, r9, r11)     // Catch: java.lang.Throwable -> L68
            r4.m6775(r8, r5)     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L68
            r8.append(r9)     // Catch: java.lang.Throwable -> L68
            java.lang.String r10 = " -> "
            r8.append(r10)     // Catch: java.lang.Throwable -> L68
            r8.append(r2)     // Catch: java.lang.Throwable -> L68
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L68
            p000.C0888ux.m5975(r0, r8)     // Catch: java.lang.Throwable -> L68
            s62 r8 = p000.s62.f9751     // Catch: java.lang.Throwable -> L68
            goto L6f
        L68:
            r8 = move-exception
            eo1 r10 = new eo1
            r10.<init>(r8)
            r8 = r10
        L6f:
            java.lang.Throwable r8 = p000.fo1.m2190(r8)
            if (r8 == 0) goto L8f
            r3.remove(r2)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r9 = " Hook 安装失败: "
            r10.append(r9)
            r10.append(r2)
            java.lang.String r9 = r10.toString()
            p000.C0888ux.m5977(r0, r9, r8)
        L8f:
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m977(java.lang.ClassLoader r12) {
            r12.getClass()
            ll r0 = p000.C0516ll.f6699
            hl r0 = p000.pd2.m4458()
            p000.C0516ll.f6704 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.C0516ll.f6701
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto L16
            goto L27
        L16:
            java.lang.Object r0 = p000.ui1.f10844
            wj r0 = p000.C0516ll.f6705
            p000.ui1.m5882(r0)
            wj r0 = p000.C0516ll.f6706
            r0.getClass()
            java.util.concurrent.CopyOnWriteArrayList r3 = p000.ui1.f10852
            r3.add(r0)
        L27:
            kk r0 = p000.C0472kk.f5953     // Catch: java.lang.Throwable -> L2e
            jk r12 = r0.m3305(r12, r1)     // Catch: java.lang.Throwable -> L2e
            goto L36
        L2e:
            r0 = move-exception
            r12 = r0
            eo1 r0 = new eo1
            r0.<init>(r12)
            r12 = r0
        L36:
            java.lang.Throwable r0 = p000.fo1.m2190(r12)
            java.lang.String r3 = "rc108c6a5c31674e3"
            if (r0 == 0) goto L43
            java.lang.String r4 = "评论控件目标解析失败"
            p000.C0888ux.m5977(r3, r4, r0)
        L43:
            boolean r0 = r12 instanceof p000.eo1
            r4 = 0
            if (r0 == 0) goto L49
            r12 = r4
        L49:
            jk r12 = (p000.C0434jk) r12
            if (r12 != 0) goto L4e
            return
        L4e:
            java.lang.Object r0 = r12.f5491
            java.util.Iterator r0 = r0.iterator()
        L54:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L80
            java.lang.Object r5 = r0.next()
            bk r5 = (p000.C0080bk) r5
            java.lang.reflect.Method r6 = r5.f1750
            zj r7 = r5.f1748
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "component:"
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            zk r8 = new zk
            r8.<init>(r5, r12, r1)
            zk r9 = new zk
            r9.<init>(r5, r12, r2)
            m976(r6, r7, r8, r9)
            goto L54
        L80:
            java.util.ArrayList r0 = r12.f5492
            java.util.Iterator r0 = r0.iterator()
        L86:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Le2
            java.lang.Object r5 = r0.next()
            ik r5 = (p000.C0398ik) r5
            java.lang.reflect.Method r6 = r5.f5100
            hk r7 = r5.f5098
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "holder-bind:"
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            vk r9 = new vk
            r9.<init>(r5, r12, r1)
            vk r10 = new vk
            r10.<init>(r5, r12, r2)
            m976(r6, r8, r9, r10)
            java.lang.Object r6 = r5.f5101
            java.util.Iterator r6 = r6.iterator()
        Lb7:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L86
            java.lang.Object r8 = r6.next()
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "holder-update:"
            r9.<init>(r10)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            r8.getClass()
            vk r10 = new vk
            r10.<init>(r5, r12, r1)
            vk r11 = new vk
            r11.<init>(r5, r12, r2)
            m976(r8, r9, r10, r11)
            goto Lb7
        Le2:
            java.util.ArrayList r0 = r12.f5493
            java.util.Iterator r0 = r0.iterator()
        Le8:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L120
            java.lang.Object r5 = r0.next()
            fk r5 = (p000.C0288fk) r5
            java.util.ArrayList r6 = r5.f3973
            java.util.Iterator r6 = r6.iterator()
        Lfa:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Le8
            java.lang.Object r7 = r6.next()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.Class r8 = r5.f3972
            java.lang.String r8 = r8.getSimpleName()
            java.lang.String r9 = "expand:"
            java.lang.String r8 = r9.concat(r8)
            xk r9 = new xk
            r9.<init>(r5, r1)
            xk r10 = new xk
            r10.<init>(r5, r2)
            m976(r7, r8, r9, r10)
            goto Lfa
        L120:
            java.util.ArrayList r0 = r12.f5494
            java.util.Iterator r0 = r0.iterator()
        L126:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L151
            java.lang.Object r5 = r0.next()
            dk r5 = (p000.C0215dk) r5
            java.lang.reflect.Method r6 = r5.f3192
            if (r6 != 0) goto L137
            goto L126
        L137:
            java.lang.Class r7 = r5.f3191
            java.lang.String r7 = r7.getSimpleName()
            java.lang.String r8 = "digg-update:"
            java.lang.String r7 = r8.concat(r7)
            yk r8 = new yk
            r8.<init>(r5, r1)
            yk r9 = new yk
            r9.<init>(r5, r2)
            m976(r6, r7, r8, r9)
            goto L126
        L151:
            java.util.ArrayList r0 = r12.f5495
            java.util.Iterator r0 = r0.iterator()
        L157:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L182
            java.lang.Object r5 = r0.next()
            yj r5 = (p000.C1023yj) r5
            java.lang.reflect.Method r6 = r5.f12644
            if (r6 != 0) goto L168
            goto L157
        L168:
            java.lang.Class r7 = r5.f12643
            java.lang.String r7 = r7.getSimpleName()
            java.lang.String r8 = "bury-update:"
            java.lang.String r7 = r8.concat(r7)
            wk r8 = new wk
            r8.<init>(r5, r1)
            wk r9 = new wk
            r9.<init>(r5, r2)
            m976(r6, r7, r8, r9)
            goto L157
        L182:
            java.lang.Object r0 = r12.f5491
            int r0 = r0.size()
            java.util.ArrayList r5 = r12.f5492
            wj r10 = new wj
            r1 = 17
            r10.<init>(r1)
            r11 = 31
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r1 = p000.AbstractC0984xh.m6644(r5, r6, r7, r8, r9, r10, r11)
            java.util.ArrayList r5 = r12.f5493
            wj r10 = new wj
            r2 = 19
            r10.<init>(r2)
            java.lang.String r2 = p000.AbstractC0984xh.m6644(r5, r6, r7, r8, r9, r10, r11)
            java.util.ArrayList r5 = r12.f5494
            int r5 = r5.size()
            java.util.ArrayList r12 = r12.f5495
            int r12 = r12.size()
            java.lang.String r6 = ", holders="
            java.lang.String r7 = ", expand="
            java.lang.String r8 = "精准分支安装完成 components="
            java.lang.StringBuilder r0 = p000.a12.m20(r0, r8, r6, r1, r7)
            r0.append(r2)
            java.lang.String r1 = ", digg="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ", bury="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r0 = 4
            p000.C0888ux.m5988(r3, r12, r4, r0, r4)
            return
    }
}
