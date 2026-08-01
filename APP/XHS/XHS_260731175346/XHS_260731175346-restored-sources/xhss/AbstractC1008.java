package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛱᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1008 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0380 f3296;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0380 f3297;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0380 f3298;

    public AbstractC1008() {
            r2 = this;
            r2.<init>()
            xhss.ᛴᛶᛲᛶ r0 = new xhss.ᛴᛶᛲᛶ
            r1 = 0
            r0.<init>(r1)
            xhss.ᛴᛷᛱ r1 = new xhss.ᛴᛷᛱ
            r1.<init>(r0)
            r2.f3298 = r1
            xhss.ᛴᛶᛲᛶ r0 = new xhss.ᛴᛶᛲᛶ
            r1 = 1
            r0.<init>(r1)
            xhss.ᛴᛷᛱ r1 = new xhss.ᛴᛷᛱ
            r1.<init>(r0)
            r2.f3296 = r1
            xhss.ᛴᛶᛲᛶ r0 = new xhss.ᛴᛶᛲᛶ
            r1 = 2
            r0.<init>(r1)
            xhss.ᛴᛷᛱ r1 = new xhss.ᛴᛷᛱ
            r1.<init>(r0)
            r2.f3297 = r1
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static java.lang.Object m1649(java.lang.Object r3, java.lang.String r4) {
            r0 = 0
            if (r4 == 0) goto L39
            boolean r1 = xhss.AbstractC0120.m342(r4)
            if (r1 == 0) goto La
            goto L39
        La:
            if (r3 != 0) goto Ld
            goto L39
        Ld:
            int r1 = xhss.AbstractC1080.f3479
            xhss.ᲇᛵᛲᲁ r3 = xhss.C0915.m1509(r3)
            java.lang.Object r1 = r3.f3349
            xhss.ᛸᛵᲇᲈ r1 = (xhss.C0772) r1
            r2 = 2
            r1.f2551 = r2
            xhss.ᛵᛸᲈᛲ r3 = r3.m1695()
            r3.m898()
            r3.f1862 = r4
            java.util.List r3 = r3.m920()
            java.lang.Object r3 = xhss.AbstractC0713.m1240(r3)
            xhss.ᛸᛴᲁᛸ r3 = (xhss.C0759) r3
            if (r3 == 0) goto L34
            java.lang.Object r3 = r3.m1302()
            goto L35
        L34:
            r3 = r0
        L35:
            if (r3 != 0) goto L38
            goto L39
        L38:
            return r3
        L39:
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static java.lang.Object m1650(xhss.C0623 r4, io.github.libxposed.api.XposedInterface.Chain r5) {
            r0 = -316079989950533(0xfffee086e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r0 = -316118644656197(0xfffee07de47a77bb, double:NaN)
        /* removed unused decoded string */ 
            java.util.List r0 = r5.getArgs()
            r1 = -316144414459973(0xfffee077e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.addAll(r0)
            xhss.ᛸᲀᲇᛱ r0 = new xhss.ᛸᲀᲇᛱ
            java.lang.Object r2 = r5.getThisObject()
            java.lang.reflect.Executable r3 = r5.getExecutable()
            r0.<init>(r2, r1, r3)
            r4.mo373(r0)
            boolean r2 = r0.f2619
            if (r2 == 0) goto L3b
            java.lang.Object r4 = r0.f2621
            return r4
        L3b:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.Object r0 = r5.proceed(r0)
            xhss.ᛵᛴᛲᛵ r2 = new xhss.ᛵᛴᛲᛵ
            java.lang.Object r5 = r5.getThisObject()
            r2.<init>(r5, r1, r0)
            r4.mo374(r2)
            java.lang.Object r4 = r2.f1683
            return r4
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public static void m1651(java.lang.String r2, java.lang.Throwable r3) {
            r0 = -316002680539205(0xfffee098e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r0 = -316037040277573(0xfffee090e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            xhss.ᲇᲁᛱᛸ r0 = xhss.C1085.f3497
            r0.getClass()
            xhss.C1085.m1764(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public static void m1652(java.lang.Object r2, java.lang.String r3, java.lang.Object... r4) {
            r0 = -317441494583365(0xfffedf49e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r0 = -317488739223621(0xfffedf3ee47a77bb, double:NaN)
        /* removed unused decoded string */ 
            if (r2 == 0) goto L3c
            int r0 = xhss.AbstractC1080.f3479
            xhss.ᲇᛵᛲᲁ r2 = xhss.C0915.m1509(r2)
            java.lang.Object r0 = r2.f3349
            xhss.ᛸᛵᲇᲈ r0 = (xhss.C0772) r0
            r1 = 2
            r0.f2551 = r1
            xhss.ᛷᛴᲀᛳ r2 = r2.m1687()
            r2.m898()
            r2.f1795 = r3
            java.util.List r2 = r2.m1144()
            java.lang.Object r2 = xhss.AbstractC0713.m1240(r2)
            xhss.ᛲᲀᛱ r2 = (xhss.C0200) r2
            if (r2 == 0) goto L3c
            int r3 = r4.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r3)
            r2.m462(r3)
        L3c:
            return
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public static void m1653(java.lang.String r2) {
            r0 = -315968320800837(0xfffee0a0e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            xhss.ᲇᲁᛱᛸ r0 = xhss.C1085.f3497
            r0.getClass()
            xhss.C1085.m1750(r2)
            return
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final void m1654(java.lang.reflect.Member r4, xhss.InterfaceC0142 r5) {
            r3 = this;
            r0 = -316380637661253(0xfffee040e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r0 = -316410702432325(0xfffee039e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            java.lang.Class r0 = r4.getDeclaringClass()
            java.lang.String r1 = r4.getName()
            xhss.ᛷᛱᛳᲁ r2 = new xhss.ᛷᛱᛳᲁ
            r2.<init>(r5, r3, r0, r1)
            r0 = -316200249034821(0xfffee06ae47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r0 = -316230313805893(0xfffee063e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            boolean r5 = r4 instanceof java.lang.reflect.Method
            if (r5 == 0) goto L4a
            xhss.ᲇᲁᛱᛸ r5 = xhss.C1085.f3497
            r5.getClass()
            com.xingin.xhss.ModuleMain r5 = xhss.C1085.m1755()
            java.lang.reflect.Executable r4 = (java.lang.reflect.Executable) r4
            io.github.libxposed.api.XposedInterface$HookBuilder r4 = r5.hook(r4)
            xhss.ᲇᛶᛶᲀ r5 = new xhss.ᲇᛶᛶᲀ
            r0 = 0
            r5.<init>(r3, r2, r0)
            r4.intercept(r5)
            return
        L4a:
            boolean r5 = r4 instanceof java.lang.reflect.Constructor
            if (r5 == 0) goto L67
            xhss.ᲇᲁᛱᛸ r5 = xhss.C1085.f3497
            r5.getClass()
            com.xingin.xhss.ModuleMain r5 = xhss.C1085.m1755()
            java.lang.reflect.Executable r4 = (java.lang.reflect.Executable) r4
            io.github.libxposed.api.XposedInterface$HookBuilder r4 = r5.hook(r4)
            xhss.ᲇᛶᛶᲀ r5 = new xhss.ᲇᛶᛶᲀ
            r0 = 1
            r5.<init>(r3, r2, r0)
            r4.intercept(r5)
            return
        L67:
            r0 = -316268968511557(0xfffee05ae47a77bb, double:NaN)
            java.lang.String r3 = "Unsupported member type: "
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r3 = r3.concat(r4)
            xhss.C0532.m959(r3)
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.ClassLoader m1655() {
            r0 = this;
            xhss.ᛴᛷᛱ r0 = r0.f3298
            java.lang.Object r0 = r0.m734()
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final void m1656(xhss.C1035 r3, xhss.InterfaceC0645 r4) {
            r2 = this;
            r0 = -316908918638661(0xfffedfc5e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            if (r3 != 0) goto Lb
            goto L5d
        Lb:
            java.lang.String r0 = r3.f3340     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "<init>"
            boolean r0 = xhss.AbstractC0007.m97(r0, r1)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L21
            java.lang.ClassLoader r0 = r2.m1655()     // Catch: java.lang.Throwable -> L2f
            java.lang.reflect.Constructor r3 = r3.m1686(r0)     // Catch: java.lang.Throwable -> L2f
            r2.m1657(r3, r4)     // Catch: java.lang.Throwable -> L2f
            goto L2c
        L21:
            java.lang.ClassLoader r0 = r2.m1655()     // Catch: java.lang.Throwable -> L2f
            java.lang.reflect.Method r3 = xhss.C1035.m1684(r3, r0)     // Catch: java.lang.Throwable -> L2f
            r2.m1657(r3, r4)     // Catch: java.lang.Throwable -> L2f
        L2c:
            xhss.ᛵᛷᲈᛶ r2 = xhss.C0500.f1817     // Catch: java.lang.Throwable -> L2f
            goto L36
        L2f:
            r2 = move-exception
            xhss.ᲈᛳᛱᲇ r3 = new xhss.ᲈᛳᛱᲇ
            r3.<init>(r2)
            r2 = r3
        L36:
            java.lang.Throwable r2 = xhss.AbstractC0134.m364(r2)
            if (r2 == 0) goto L5d
            r3 = -316964753213509(0xfffedfb8e47a77bb, double:NaN)
            java.lang.String r3 = "DexMethod?.hookBefore error"
            r0 = -278279982778437(0xffff02e7e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r0 = -278314342516805(0xffff02dfe47a77bb, double:NaN)
        /* removed unused decoded string */ 
            xhss.ᲇᲁᛱᛸ r4 = xhss.C1085.f3497
            r4.getClass()
            xhss.C1085.m1764(r3, r2)
        L5d:
            return
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final void m1657(java.lang.reflect.Member r3, xhss.InterfaceC0645 r4) {
            r2 = this;
            r0 = -316608270927941(0xfffee00be47a77bb, double:NaN)
        /* removed unused decoded string */ 
            if (r3 == 0) goto L13
            xhss.ᛶᛶᛸᛵ r0 = new xhss.ᛶᛶᛸᛵ
            r1 = 1
            r0.<init>(r4, r2, r1)
            r2.m1654(r3, r0)
        L13:
            return
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public final void m1658() {
            r4 = this;
            r4.mo213()     // Catch: java.lang.Throwable -> L6
            xhss.ᛵᛷᲈᛶ r0 = xhss.C0500.f1817     // Catch: java.lang.Throwable -> L6
            goto Ld
        L6:
            r0 = move-exception
            xhss.ᲈᛳᛱᲇ r1 = new xhss.ᲈᛳᛱᲇ
            r1.<init>(r0)
            r0 = r1
        Ld:
            java.lang.Throwable r0 = xhss.AbstractC0134.m364(r0)
            if (r0 == 0) goto L4c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = -315835176814661(0xfffee0bfe47a77bb, double:NaN)
            java.lang.String r2 = "run "
            r1.<init>(r2)
            r1.append(r4)
            r2 = -315856651651141(0xfffee0bae47a77bb, double:NaN)
            java.lang.String r4 = " hook error"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r1 = -278279982778437(0xffff02e7e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r1 = -278314342516805(0xffff02dfe47a77bb, double:NaN)
        /* removed unused decoded string */ 
            xhss.ᲇᲁᛱᛸ r1 = xhss.C1085.f3497
            r1.getClass()
            xhss.C1085.m1764(r4, r0)
        L4c:
            return
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final void m1659(xhss.C1035 r3, xhss.InterfaceC0645 r4) {
            r2 = this;
            r0 = -317106487134277(0xfffedf97e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            if (r3 == 0) goto L59
            java.lang.String r0 = r3.f3340     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "<init>"
            boolean r0 = xhss.AbstractC0007.m97(r0, r1)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L1d
            java.lang.ClassLoader r0 = r2.m1655()     // Catch: java.lang.Throwable -> L2b
            java.lang.reflect.Constructor r3 = r3.m1686(r0)     // Catch: java.lang.Throwable -> L2b
            goto L25
        L1d:
            java.lang.ClassLoader r0 = r2.m1655()     // Catch: java.lang.Throwable -> L2b
            java.lang.reflect.Method r3 = xhss.C1035.m1684(r3, r0)     // Catch: java.lang.Throwable -> L2b
        L25:
            r2.m1660(r3, r4)     // Catch: java.lang.Throwable -> L2b
            xhss.ᛵᛷᲈᛶ r2 = xhss.C0500.f1817     // Catch: java.lang.Throwable -> L2b
            goto L32
        L2b:
            r2 = move-exception
            xhss.ᲈᛳᛱᲇ r3 = new xhss.ᲈᛳᛱᲇ
            r3.<init>(r2)
            r2 = r3
        L32:
            java.lang.Throwable r2 = xhss.AbstractC0134.m364(r2)
            if (r2 == 0) goto L59
            r3 = -317162321709125(0xfffedf8ae47a77bb, double:NaN)
            java.lang.String r3 = "DexMethod?.hookAfter error"
            r0 = -278279982778437(0xffff02e7e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r0 = -278314342516805(0xffff02dfe47a77bb, double:NaN)
        /* removed unused decoded string */ 
            xhss.ᲇᲁᛱᛸ r4 = xhss.C1085.f3497
            r4.getClass()
            xhss.C1085.m1764(r3, r2)
        L59:
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public abstract void mo213();

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final void m1660(java.lang.reflect.Member r3, xhss.InterfaceC0645 r4) {
            r2 = this;
            r0 = -316664105502789(0xfffedffee47a77bb, double:NaN)
        /* removed unused decoded string */ 
            if (r3 == 0) goto L13
            xhss.ᛶᛶᛸᛵ r0 = new xhss.ᛶᛶᛸᛵ
            r1 = 0
            r0.<init>(r4, r2, r1)
            r2.m1654(r3, r0)
        L13:
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public final java.lang.reflect.Method m1661(xhss.C1035 r1) {
            r0 = this;
            if (r1 == 0) goto Lb
            java.lang.ClassLoader r0 = r0.m1655()
            java.lang.reflect.Method r0 = xhss.C1035.m1684(r1, r0)
            return r0
        Lb:
            r0 = 0
            return r0
    }
}
