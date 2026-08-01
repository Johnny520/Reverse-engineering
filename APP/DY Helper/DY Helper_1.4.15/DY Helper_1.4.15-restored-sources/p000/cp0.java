package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class cp0 {

    /* JADX INFO: renamed from: α */
    public static final java.util.Set f2703 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f2704 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.Set f2705 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.Set f2706 = null;

    /* JADX INFO: renamed from: ε */
    public static volatile p000.C0585ng f2707;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.List f2708 = null;

    static {
            java.lang.String r0 = "LandscapeEntranceModule"
            java.lang.String r1 = "FeedLandscapeEntranceModule"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            p000.cp0.f2703 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.cp0.f2704 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r0.getClass()
            p000.cp0.f2705 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r0.getClass()
            p000.cp0.f2706 = r0
            java.lang.String r0 = "~78ABF9C3EBB978C766D1EEE85DA4659DFA297141942A5334E9F0CE7DC02DBAECD2D4F1C293E6904E624CF4AC12A0270674B672DEF2B2ED42D16F33ED92D8908DD3B7A48299DC77678D41F23C647694"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "~782EF7E56DAA90CE216196979186EE07173230C07EC7B955655F4BCD0D5E71D74F6A36838C5E475B53D77C91F38447A2B51C065CAF8B02097308BD66513FBAA4A8BD1D7FB924256C8CF9371C70D1BFC92A026FA090F83DE1A5A68AE8B5D34CAB64963BCD289895CED47F041B64EF"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.cp0.f2708 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m1602(android.view.View r4) {
            r0 = 2131618529(0x7f0deae1, float:1.886407E38)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r4.setTag(r0, r1)
            java.util.Set r0 = p000.cp0.f2706
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            wk0 r2 = new wk0
            r3 = 1
            r2.<init>(r4, r3)
            p000.AbstractC0984xh.m6652(r1, r2)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r4)
            r0.add(r1)
            ng r0 = p000.cp0.f2707
            if (r0 != 0) goto L23
            goto L4b
        L23:
            r0.invoke(r4)     // Catch: java.lang.Throwable -> L29
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L29
            goto L30
        L29:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L30:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L4b
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "clean mode view callback failed: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            m1606(r0)
        L4b:
            r0 = 2131618530(0x7f0deae2, float:1.8864073E38)
            java.lang.Object r1 = r4.getTag(r0)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L5b
            goto L67
        L5b:
            r4.setTag(r0, r2)
            lg r0 = new lg
            r1 = 4
            r0.<init>(r1)
            r4.addOnAttachStateChangeListener(r0)
        L67:
            return
    }

    /* JADX INFO: renamed from: β */
    public static java.util.ArrayList m1603(java.lang.Class r8) {
            java.lang.reflect.Method[] r8 = r8.getDeclaredMethods()
            r8.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r8.length
            r2 = 0
            r3 = r2
        Lf:
            if (r3 >= r1) goto L4e
            r4 = r8[r3]
            int r5 = r4.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 == 0) goto L1e
            goto L4b
        L1e:
            java.lang.Class<android.view.View> r5 = android.view.View.class
            java.lang.Class r6 = r4.getReturnType()
            boolean r5 = r5.isAssignableFrom(r6)
            if (r5 != 0) goto L2b
            goto L4b
        L2b:
            java.lang.Class[] r5 = r4.getParameterTypes()
            int r6 = r5.length
            r7 = 2
            if (r6 != r7) goto L4b
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r7 = r5[r2]
            boolean r6 = r6.isAssignableFrom(r7)
            if (r6 == 0) goto L4b
            java.lang.Class<android.view.ViewGroup> r6 = android.view.ViewGroup.class
            r7 = 1
            r5 = r5[r7]
            boolean r5 = r6.isAssignableFrom(r5)
            if (r5 == 0) goto L4b
            r0.add(r4)
        L4b:
            int r3 = r3 + 1
            goto Lf
        L4e:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static void m1604(p000.z81 r3, p000.C0585ng r4) {
            r3.getClass()
            p000.cp0.f2707 = r4
            java.util.concurrent.atomic.AtomicBoolean r4 = p000.cp0.f2704
            r0 = 1
            r1 = 0
            boolean r4 = r4.compareAndSet(r1, r0)
            if (r4 != 0) goto L10
            goto L2d
        L10:
            java.util.concurrent.ConcurrentHashMap r4 = p000.C0777rx.f9562
            wj0 r4 = new wj0
            r0 = 25
            r4.<init>(r0)
            java.lang.String r0 = "landscape_entrance_misc_control"
            p000.C0777rx.m5178(r0, r4)
            wj0 r4 = new wj0
            r2 = 26
            r4.<init>(r2)
            p000.C0777rx.m5177(r0, r4)
            java.lang.String r4 = "DexKit provider registered"
            m1606(r4)
        L2d:
            java.lang.ClassLoader r3 = r3.f13011
            m1605(r3, r1)
            return
    }

    /* JADX INFO: renamed from: δ */
    public static void m1605(java.lang.ClassLoader r13, boolean r14) {
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r1 = p000.EnumC0491kx.f6293
            java.util.List r0 = p000.C0666ox.m4321(r1, r13)
            r2 = 900(0x384, float:1.261E-42)
            r3 = 0
            if (r0 == 0) goto L56
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L2d
            java.lang.Object r5 = r0.next()
            r6 = r5
            java.lang.Class r6 = (java.lang.Class) r6
            int r6 = m1607(r6)
            if (r6 < r2) goto L16
            r4.add(r5)
            goto L16
        L2d:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L3b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L57
            java.lang.Object r6 = r4.next()
            r7 = r6
            java.lang.Class r7 = (java.lang.Class) r7
            java.lang.String r7 = r7.getName()
            boolean r7 = r0.add(r7)
            if (r7 == 0) goto L3b
            r5.add(r6)
            goto L3b
        L56:
            r5 = r3
        L57:
            jz r4 = p000.C0450jz.f5672
            if (r5 != 0) goto L5d
            r6 = r4
            goto L5e
        L5d:
            r6 = r5
        L5e:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L81
            wj0 r11 = new wj0
            r13 = 27
            r11.<init>(r13)
            r12 = 31
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r13 = p000.AbstractC0984xh.m6644(r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r14 = "resolve class from cache: "
            java.lang.String r13 = r14.concat(r13)
            m1606(r13)
            r4 = r6
            goto L1b5
        L81:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r0 = p000.cp0.f2708
            java.util.Iterator r6 = r0.iterator()
        L8c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lb2
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            r7 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0, r7, r13)     // Catch: java.lang.Throwable -> L9e
            goto La5
        L9e:
            r0 = move-exception
            eo1 r7 = new eo1
            r7.<init>(r0)
            r0 = r7
        La5:
            boolean r7 = r0 instanceof p000.eo1
            if (r7 == 0) goto Laa
            r0 = r3
        Laa:
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L8c
            r5.add(r0)
            goto L8c
        Lb2:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r5.iterator()
        Lbb:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Ld2
            java.lang.Object r5 = r3.next()
            r6 = r5
            java.lang.Class r6 = (java.lang.Class) r6
            int r6 = m1607(r6)
            if (r6 < r2) goto Lbb
            r0.add(r5)
            goto Lbb
        Ld2:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        Le0:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto Lfb
            java.lang.Object r6 = r0.next()
            r7 = r6
            java.lang.Class r7 = (java.lang.Class) r7
            java.lang.String r7 = r7.getName()
            boolean r7 = r3.add(r7)
            if (r7 == 0) goto Le0
            r5.add(r6)
            goto Le0
        Lfb:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L123
            java.lang.Object r13 = p000.C0666ox.f8297     // Catch: java.lang.Throwable -> L106
            p000.C0666ox.m4325(r1, r5)     // Catch: java.lang.Throwable -> L106
        L106:
            wj0 r10 = new wj0
            r13 = 28
            r10.<init>(r13)
            r11 = 31
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r13 = p000.AbstractC0984xh.m6644(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r14 = "resolve class from reflection fallback: "
            java.lang.String r13 = r14.concat(r13)
            m1606(r13)
            r4 = r5
            goto L1b5
        L123:
            if (r14 != 0) goto L127
            goto L1b5
        L127:
            java.lang.Object r14 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r14 = p000.C0666ox.f8305
            boolean r14 = r14.get()
            if (r14 != 0) goto L138
            java.lang.String r13 = "DexKitManager not initialized"
            m1606(r13)
            goto L1b5
        L138:
            t20 r14 = new t20
            r0 = 11
            r14.<init>(r13, r0)
            java.lang.String r0 = "定位全屏观看入口模块"
            java.util.List r13 = p000.C0666ox.m4314(r1, r13, r0, r14)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r13 = r13.iterator()
        L14e:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L165
            java.lang.Object r0 = r13.next()
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            int r1 = m1607(r1)
            if (r1 < r2) goto L14e
            r14.add(r0)
            goto L14e
        L165:
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r14 = r14.iterator()
        L173:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L18e
            java.lang.Object r1 = r14.next()
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.String r2 = r2.getName()
            boolean r2 = r13.add(r2)
            if (r2 == 0) goto L173
            r0.add(r1)
            goto L173
        L18e:
            boolean r13 = r0.isEmpty()
            if (r13 != 0) goto L1af
            wj0 r5 = new wj0
            r13 = 29
            r5.<init>(r13)
            r6 = 31
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r13 = p000.AbstractC0984xh.m6644(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r14 = "resolve class from DexKit: "
            java.lang.String r13 = r14.concat(r13)
            m1606(r13)
            goto L1b4
        L1af:
            java.lang.String r13 = "DexKit did not find LandscapeEntranceModule"
            m1606(r13)
        L1b4:
            r4 = r0
        L1b5:
            boolean r13 = r4.isEmpty()
            if (r13 == 0) goto L1c1
            java.lang.String r13 = "installHooks skipped, no LandscapeEntranceModule class"
            m1606(r13)
            return
        L1c1:
            java.util.Iterator r13 = r4.iterator()
        L1c5:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L258
            java.lang.Object r14 = r13.next()
            java.lang.Class r14 = (java.lang.Class) r14
            java.lang.String r0 = r14.getName()
            java.lang.ClassLoader r1 = r14.getClassLoader()
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.String r2 = "@"
            java.lang.String r0 = p000.AbstractC0602nx.m4130(r0, r2, r1)
            java.util.Set r1 = p000.cp0.f2705
            boolean r2 = r1.add(r0)
            if (r2 != 0) goto L1ec
            goto L1c5
        L1ec:
            java.util.ArrayList r3 = m1603(r14)
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L207
            r1.remove(r0)
            java.lang.String r14 = r14.getName()
            java.lang.String r0 = "no onCreateView method found in "
            java.lang.String r14 = r0.concat(r14)
            m1606(r14)
            goto L1c5
        L207:
            java.util.Iterator r0 = r3.iterator()
        L20b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L228
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r2 = 1
            r1.setAccessible(r2)
            xq0 r2 = p000.xq0.f12253
            oj0 r4 = new oj0
            r5 = 12
            r4.<init>(r5)
            r2.m6775(r1, r4)
            goto L20b
        L228:
            java.lang.String r14 = r14.getName()
            wj0 r8 = new wj0
            r0 = 24
            r8.<init>(r0)
            r9 = 31
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r3, r4, r5, r6, r7, r8, r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "hook success: "
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r14 = ", methods="
            r1.append(r14)
            r1.append(r0)
            java.lang.String r14 = r1.toString()
            m1606(r14)
            goto L1c5
        L258:
            return
    }

    /* JADX INFO: renamed from: ε */
    public static void m1606(java.lang.String r1) {
            java.lang.String r0 = "r79e6cea2fdbd1358"
            p000.C0888ux.m5975(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static int m1607(java.lang.Class r6) {
            java.lang.String r0 = r6.getName()
            java.lang.String r1 = r6.getSimpleName()
            java.util.List r2 = p000.cp0.f2708
            boolean r2 = r2.contains(r0)
            r3 = 0
            if (r2 == 0) goto L14
            r2 = 1200(0x4b0, float:1.682E-42)
            goto L15
        L14:
            r2 = r3
        L15:
            java.util.Set r4 = p000.cp0.f2703
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L1f
            int r2 = r2 + 800
        L1f:
            java.lang.String r1 = "longervideo"
            r4 = 1
            boolean r1 = p000.q02.m4654(r0, r1, r4)
            if (r1 == 0) goto L3a
            java.lang.String r1 = "landscape"
            boolean r1 = p000.q02.m4654(r0, r1, r4)
            if (r1 == 0) goto L3a
            java.lang.String r1 = "entrance"
            boolean r0 = p000.q02.m4654(r0, r1, r4)
            if (r0 == 0) goto L3a
            int r2 = r2 + 500
        L3a:
            java.lang.String r0 = "~793C911F02B4DC5CCCA55B8C6F59F423EC7383D78869998D7006CEB3BBADA10C0A0191636D8AE260E631"
            java.lang.String r0 = p000.jf0.m2957(r0)
            r1 = r6
        L41:
            if (r1 == 0) goto L5d
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L5d
            java.lang.String r4 = r1.getName()
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L58
            int r2 = r2 + 500
            goto L5d
        L58:
            java.lang.Class r1 = r1.getSuperclass()
            goto L41
        L5d:
            java.util.ArrayList r0 = m1603(r6)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L69
            int r2 = r2 + 700
        L69:
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            r6.getClass()
            int r0 = r6.length
        L71:
            if (r3 >= r0) goto La7
            r1 = r6[r3]
            int r4 = r1.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 != 0) goto La4
            java.lang.Class[] r4 = r1.getParameterTypes()
            r4.getClass()
            int r4 = r4.length
            if (r4 != 0) goto La4
            java.lang.Class r4 = r1.getReturnType()
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 == 0) goto La4
            java.lang.String r1 = r1.getName()
            java.lang.String r4 = "moduleName"
            boolean r1 = p000.ln0.m3626(r1, r4)
            if (r1 == 0) goto La4
            int r2 = r2 + 200
            return r2
        La4:
            int r3 = r3 + 1
            goto L71
        La7:
            return r2
    }
}
