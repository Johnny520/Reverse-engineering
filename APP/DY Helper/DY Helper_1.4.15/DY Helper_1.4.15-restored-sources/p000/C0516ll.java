package p000;

/* JADX INFO: renamed from: ll */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0516ll {

    /* JADX INFO: renamed from: α */
    public static final p000.C0516ll f6699 = null;

    /* JADX INFO: renamed from: β */
    public static final android.os.Handler f6700 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicBoolean f6701 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.ConcurrentHashMap f6702 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.WeakHashMap f6703 = null;

    /* JADX INFO: renamed from: ζ */
    public static volatile p000.C0363hl f6704;

    /* JADX INFO: renamed from: η */
    public static final p000.C0949wj f6705 = null;

    /* JADX INFO: renamed from: θ */
    public static final p000.C0949wj f6706 = null;

    static {
            ll r0 = new ll
            r0.<init>()
            p000.C0516ll.f6699 = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            p000.C0516ll.f6700 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.C0516ll.f6701 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.C0516ll.f6702 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            p000.C0516ll.f6703 = r0
            hl r0 = new hl
            kz r2 = p000.C0493kz.f6332
            r0.<init>(r1, r1, r2)
            p000.C0516ll.f6704 = r0
            wj r0 = new wj
            r1 = 20
            r0.<init>(r1)
            p000.C0516ll.f6705 = r0
            wj r0 = new wj
            r1 = 21
            r0.<init>(r1)
            p000.C0516ll.f6706 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m3579(java.util.ArrayList r1, java.lang.Object r2, p000.EnumC0117cl r3, p000.C0326gl r4) {
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L7
            android.view.View r2 = (android.view.View) r2
            goto L8
        L7:
            r2 = 0
        L8:
            if (r2 == 0) goto L12
            fl r0 = new fl
            r0.<init>(r2, r3, r4)
            r1.add(r0)
        L12:
            return
    }

    /* JADX INFO: renamed from: β */
    public static /* synthetic */ void m3580(java.util.ArrayList r1, java.lang.Object r2, p000.EnumC0117cl r3) {
            gl r0 = p000.C0326gl.f4402
            m3579(r1, r2, r3, r0)
            return
    }

    /* JADX INFO: renamed from: δ */
    public static void m3581(java.util.List r4) {
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r4.next()
            fl r0 = (p000.C0289fl) r0
            android.view.View r1 = r0.f4002
            dl r2 = new dl
            r3 = 1
            r2.<init>(r0, r3)
            m3591(r1, r2)
            goto L4
        L1c:
            return
    }

    /* JADX INFO: renamed from: ε */
    public static java.util.List m3582(java.lang.Object r4, p000.C1023yj r5) {
            boolean r0 = r4 instanceof android.view.View
            if (r0 == 0) goto L8
            r0 = r4
            android.view.View r0 = (android.view.View) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 != 0) goto Le
            jz r4 = p000.C0450jz.f5672
            return r4
        Le:
            fl r1 = new fl
            gl r2 = p000.C0326gl.f4403
            cl r3 = p000.EnumC0117cl.f2192
            r1.<init>(r0, r3, r2)
            fl[] r0 = new p000.C0289fl[]{r1}
            java.util.ArrayList r0 = p000.AbstractC1021yh.m6879(r0)
            kk r1 = p000.C0472kk.f5953
            java.lang.reflect.Field r5 = r5.f12645
            java.lang.Object r4 = p000.C0472kk.m3300(r4, r5)
            gl r5 = p000.C0326gl.f4405
            m3579(r0, r4, r3, r5)
            java.util.ArrayList r4 = m3585(r0)
            return r4
    }

    /* JADX INFO: renamed from: ζ */
    public static p000.C0252el m3583(android.view.View r8) {
            el r0 = new el
            int r1 = r8.getVisibility()
            float r2 = r8.getAlpha()
            boolean r3 = r8 instanceof android.widget.TextView
            r4 = 0
            if (r3 == 0) goto L13
            r5 = r8
            android.widget.TextView r5 = (android.widget.TextView) r5
            goto L14
        L13:
            r5 = r4
        L14:
            if (r5 == 0) goto L1b
            android.content.res.ColorStateList r5 = r5.getTextColors()
            goto L1c
        L1b:
            r5 = r4
        L1c:
            if (r3 == 0) goto L22
            r3 = r8
            android.widget.TextView r3 = (android.widget.TextView) r3
            goto L23
        L22:
            r3 = r4
        L23:
            if (r3 == 0) goto L2a
            java.lang.CharSequence r3 = r3.getText()
            goto L2b
        L2a:
            r3 = r4
        L2b:
            boolean r6 = r8 instanceof android.widget.ImageView
            if (r6 == 0) goto L32
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            goto L33
        L32:
            r8 = r4
        L33:
            if (r8 == 0) goto L39
            android.graphics.ColorFilter r4 = r8.getColorFilter()
        L39:
            r7 = r4
            r4 = r3
            r3 = r5
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    /* JADX INFO: renamed from: η */
    public static java.util.List m3584(java.lang.Object r9, p000.C0080bk r10, p000.C0434jk r11) {
            kk r0 = p000.C0472kk.f5953
            java.lang.reflect.Field r0 = r10.f1751
            java.lang.reflect.Field r1 = r10.f1753
            java.lang.Class r2 = r10.f1749
            java.lang.Object r0 = p000.C0472kk.m3300(r9, r0)
            if (r0 != 0) goto L10
            goto Ld9
        L10:
            zj r3 = r10.f1748
            int r3 = r3.ordinal()
            r4 = 0
            gl r5 = p000.C0326gl.f4402
            gl r6 = p000.C0326gl.f4403
            java.lang.String r7 = ".template."
            r8 = 0
            switch(r3) {
                case 0: goto L12a;
                case 1: goto Lff;
                case 2: goto Lf8;
                case 3: goto Lf1;
                case 4: goto Lea;
                case 5: goto Le1;
                case 6: goto L7d;
                case 7: goto L25;
                default: goto L21;
            }
        L21:
            p000.C1080.m7272()
            return r8
        L25:
            java.lang.String r10 = r2.getName()
            boolean r10 = p000.q02.m4654(r10, r7, r4)
            if (r10 == 0) goto L57
            boolean r10 = r0 instanceof android.view.View
            if (r10 == 0) goto L36
            r8 = r0
            android.view.View r8 = (android.view.View) r8
        L36:
            if (r8 != 0) goto L3a
            goto Ld9
        L3a:
            fl r10 = new fl
            cl r11 = p000.EnumC0117cl.f2192
            r10.<init>(r8, r11, r6)
            fl[] r10 = new p000.C0289fl[]{r10}
            java.util.ArrayList r10 = p000.AbstractC1021yh.m6879(r10)
            java.lang.Object r9 = p000.C0472kk.m3300(r9, r1)
            gl r0 = p000.C0326gl.f4405
            m3579(r10, r9, r11, r0)
            java.util.ArrayList r9 = m3585(r10)
            return r9
        L57:
            java.util.ArrayList r9 = r11.f5495
            java.util.Iterator r9 = r9.iterator()
        L5d:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L73
            java.lang.Object r10 = r9.next()
            r11 = r10
            yj r11 = (p000.C1023yj) r11
            java.lang.Class r11 = r11.f12643
            boolean r11 = r11.isInstance(r0)
            if (r11 == 0) goto L5d
            r8 = r10
        L73:
            yj r8 = (p000.C1023yj) r8
            if (r8 != 0) goto L78
            goto Ld9
        L78:
            java.util.List r9 = m3582(r0, r8)
            return r9
        L7d:
            java.lang.String r2 = r2.getName()
            boolean r2 = p000.q02.m4654(r2, r7, r4)
            if (r2 == 0) goto Lb9
            boolean r11 = r0 instanceof android.view.View
            if (r11 == 0) goto L8e
            r8 = r0
            android.view.View r8 = (android.view.View) r8
        L8e:
            if (r8 != 0) goto L91
            goto Ld9
        L91:
            fl r11 = new fl
            cl r0 = p000.EnumC0117cl.f2189
            r11.<init>(r8, r0, r6)
            fl[] r11 = new p000.C0289fl[]{r11}
            java.util.ArrayList r11 = p000.AbstractC1021yh.m6879(r11)
            java.lang.reflect.Field r10 = r10.f1754
            java.lang.Object r10 = p000.C0472kk.m3300(r9, r10)
            cl r0 = p000.EnumC0117cl.f2191
            m3580(r11, r10, r0)
            java.lang.Object r9 = p000.C0472kk.m3300(r9, r1)
            cl r10 = p000.EnumC0117cl.f2190
            m3580(r11, r9, r10)
            java.util.ArrayList r9 = m3585(r11)
            return r9
        Lb9:
            java.util.ArrayList r9 = r11.f5494
            java.util.Iterator r9 = r9.iterator()
        Lbf:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Ld5
            java.lang.Object r10 = r9.next()
            r11 = r10
            dk r11 = (p000.C0215dk) r11
            java.lang.Class r11 = r11.f3191
            boolean r11 = r11.isInstance(r0)
            if (r11 == 0) goto Lbf
            r8 = r10
        Ld5:
            dk r8 = (p000.C0215dk) r8
            if (r8 != 0) goto Ldc
        Ld9:
            jz r9 = p000.C0450jz.f5672
            return r9
        Ldc:
            java.util.List r9 = m3586(r0, r8)
            return r9
        Le1:
            cl r9 = p000.EnumC0117cl.f2187
            gl r10 = p000.C0326gl.f4404
            java.util.List r9 = m3592(r0, r9, r10)
            return r9
        Lea:
            cl r9 = p000.EnumC0117cl.f2186
            java.util.List r9 = m3592(r0, r9, r5)
            return r9
        Lf1:
            cl r9 = p000.EnumC0117cl.f2185
            java.util.List r9 = m3592(r0, r9, r5)
            return r9
        Lf8:
            cl r9 = p000.EnumC0117cl.f2184
            java.util.List r9 = m3592(r0, r9, r5)
            return r9
        Lff:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            cl r1 = p000.EnumC0117cl.f2183
            m3580(r11, r0, r1)
            java.util.ArrayList r10 = r10.f1752
            java.util.Iterator r10 = r10.iterator()
        L10f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L125
            java.lang.Object r0 = r10.next()
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            kk r2 = p000.C0472kk.f5953
            java.lang.Object r0 = p000.C0472kk.m3300(r9, r0)
            m3580(r11, r0, r1)
            goto L10f
        L125:
            java.util.ArrayList r9 = m3585(r11)
            return r9
        L12a:
            cl r9 = p000.EnumC0117cl.f2182
            java.util.List r9 = m3592(r0, r9, r5)
            return r9
    }

    /* JADX INFO: renamed from: θ */
    public static java.util.ArrayList m3585(java.util.ArrayList r4) {
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        L12:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r4.next()
            r3 = r2
            fl r3 = (p000.C0289fl) r3
            android.view.View r3 = r3.f4002
            boolean r3 = r0.add(r3)
            if (r3 == 0) goto L12
            r1.add(r2)
            goto L12
        L2b:
            return r1
    }

    /* JADX INFO: renamed from: ι */
    public static java.util.List m3586(java.lang.Object r4, p000.C0215dk r5) {
            boolean r0 = r4 instanceof android.view.View
            if (r0 == 0) goto L8
            r0 = r4
            android.view.View r0 = (android.view.View) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 != 0) goto Le
            jz r4 = p000.C0450jz.f5672
            return r4
        Le:
            fl r1 = new fl
            cl r2 = p000.EnumC0117cl.f2189
            gl r3 = p000.C0326gl.f4403
            r1.<init>(r0, r2, r3)
            fl[] r0 = new p000.C0289fl[]{r1}
            java.util.ArrayList r0 = p000.AbstractC1021yh.m6879(r0)
            kk r1 = p000.C0472kk.f5953
            java.lang.reflect.Field r1 = r5.f3193
            java.lang.Object r1 = p000.C0472kk.m3300(r4, r1)
            cl r2 = p000.EnumC0117cl.f2191
            m3580(r0, r1, r2)
            java.lang.reflect.Field r5 = r5.f3194
            java.lang.Object r4 = p000.C0472kk.m3300(r4, r5)
            cl r5 = p000.EnumC0117cl.f2190
            m3580(r0, r4, r5)
            java.util.ArrayList r4 = m3585(r0)
            return r4
    }

    /* JADX INFO: renamed from: κ */
    public static java.util.List m3587(java.lang.Object r7, p000.C0398ik r8, p000.C0434jk r9) {
            if (r7 != 0) goto L5
            jz r7 = p000.C0450jz.f5672
            return r7
        L5:
            gk r0 = r8.f5102
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            kk r2 = p000.C0472kk.f5953
            java.lang.reflect.Field r2 = r0.f4388
            java.lang.Object r2 = p000.C0472kk.m3300(r7, r2)
            cl r3 = p000.EnumC0117cl.f2182
            m3580(r1, r2, r3)
            java.lang.reflect.Field r2 = r0.f4389
            java.lang.Object r2 = p000.C0472kk.m3300(r7, r2)
            cl r3 = p000.EnumC0117cl.f2183
            m3580(r1, r2, r3)
            java.lang.reflect.Field r2 = r0.f4390
            java.lang.Object r2 = p000.C0472kk.m3300(r7, r2)
            cl r3 = p000.EnumC0117cl.f2184
            m3580(r1, r2, r3)
            java.lang.reflect.Field r2 = r0.f4391
            java.lang.Object r2 = p000.C0472kk.m3300(r7, r2)
            cl r3 = p000.EnumC0117cl.f2185
            m3580(r1, r2, r3)
            java.lang.reflect.Field r2 = r0.f4392
            java.lang.Object r2 = p000.C0472kk.m3300(r7, r2)
            cl r3 = p000.EnumC0117cl.f2186
            m3580(r1, r2, r3)
            java.lang.reflect.Field r2 = r0.f4393
            java.lang.Object r2 = p000.C0472kk.m3300(r7, r2)
            cl r3 = p000.EnumC0117cl.f2189
            gl r4 = p000.C0326gl.f4403
            m3579(r1, r2, r3, r4)
            java.lang.reflect.Field r2 = r0.f4394
            java.lang.Object r2 = p000.C0472kk.m3300(r7, r2)
            cl r3 = p000.EnumC0117cl.f2190
            m3580(r1, r2, r3)
            java.lang.reflect.Field r2 = r0.f4395
            java.lang.Object r2 = p000.C0472kk.m3300(r7, r2)
            cl r3 = p000.EnumC0117cl.f2191
            m3580(r1, r2, r3)
            java.lang.reflect.Field r0 = r0.f4396
            java.lang.Object r7 = p000.C0472kk.m3300(r7, r0)
            ck r8 = r8.f5103
            if (r7 == 0) goto Lf1
            if (r8 == 0) goto Lf1
            java.lang.reflect.Field r0 = r8.f2173
            java.lang.reflect.Field r2 = r8.f2174
            java.lang.reflect.Field[] r0 = new java.lang.reflect.Field[]{r0, r2}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L84:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto Lc2
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            kk r4 = p000.C0472kk.f5953
            java.lang.Object r2 = p000.C0472kk.m3300(r7, r2)
            if (r2 != 0) goto L9a
            goto L84
        L9a:
            java.util.ArrayList r4 = r9.f5494
            java.util.Iterator r4 = r4.iterator()
        La0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lb6
            java.lang.Object r5 = r4.next()
            r6 = r5
            dk r6 = (p000.C0215dk) r6
            java.lang.Class r6 = r6.f3191
            boolean r6 = r6.isInstance(r2)
            if (r6 == 0) goto La0
            r3 = r5
        Lb6:
            dk r3 = (p000.C0215dk) r3
            if (r3 == 0) goto L84
            java.util.List r2 = m3586(r2, r3)
            p000.AbstractC0984xh.m6660(r1, r2)
            goto L84
        Lc2:
            kk r0 = p000.C0472kk.f5953
            java.lang.reflect.Field r8 = r8.f2175
            java.lang.Object r7 = p000.C0472kk.m3300(r7, r8)
            java.util.ArrayList r8 = r9.f5495
            java.util.Iterator r8 = r8.iterator()
        Ld0:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Le6
            java.lang.Object r9 = r8.next()
            r0 = r9
            yj r0 = (p000.C1023yj) r0
            java.lang.Class r0 = r0.f12643
            boolean r0 = r0.isInstance(r7)
            if (r0 == 0) goto Ld0
            r3 = r9
        Le6:
            yj r3 = (p000.C1023yj) r3
            if (r3 == 0) goto Lf1
            java.util.List r7 = m3582(r7, r3)
            p000.AbstractC0984xh.m6660(r1, r7)
        Lf1:
            java.util.ArrayList r7 = m3585(r1)
            return r7
    }

    /* JADX INFO: renamed from: λ */
    public static void m3588(java.util.List r4) {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto Lf
            goto L2b
        Lf:
            java.util.Iterator r4 = r4.iterator()
        L13:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r4.next()
            fl r0 = (p000.C0289fl) r0
            android.view.View r1 = r0.f4002
            dl r2 = new dl
            r3 = 0
            r2.<init>(r0, r3)
            m3591(r1, r2)
            goto L13
        L2b:
            return
    }

    /* JADX INFO: renamed from: μ */
    public static void m3589() {
            ll r0 = p000.C0516ll.f6699
            hl r1 = p000.pd2.m4458()
            p000.C0516ll.f6704 = r1
            java.util.WeakHashMap r1 = p000.C0516ll.f6703
            java.util.Set r1 = r1.entrySet()
            r1.getClass()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = p000.AbstractC1021yh.m6889(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L22:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L43
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            kl r3 = (p000.C0473kl) r3
            fl r3 = r3.f5991
            l91 r5 = new l91
            r5.<init>(r4, r3)
            r2.add(r5)
            goto L22
        L43:
            java.util.Iterator r1 = r2.iterator()
        L47:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L70
            java.lang.Object r2 = r1.next()
            l91 r2 = (p000.l91) r2
            java.lang.Object r3 = r2.f6502
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r2 = r2.f6503
            fl r2 = (p000.C0289fl) r2
            java.util.WeakHashMap r4 = p000.C0516ll.f6703
            java.lang.Object r4 = r4.get(r3)
            kl r4 = (p000.C0473kl) r4
            if (r4 == 0) goto L6b
            r3.getClass()
            m3590(r3, r4)
        L6b:
            r3 = 0
            r0.m3593(r2, r3)
            goto L47
        L70:
            return
    }

    /* JADX INFO: renamed from: ν */
    public static void m3590(android.view.View r5, p000.C0473kl r6) {
            boolean r0 = r6.f5993
            java.util.List r1 = r6.f5994
            if (r0 != 0) goto L11
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L11
            boolean r0 = r6.f5995
            if (r0 != 0) goto L11
            return
        L11:
            el r0 = r6.f5992
            fl r2 = r6.f5991
            gl r2 = r2.f4004
            boolean r2 = r2.f4406
            if (r2 == 0) goto L26
            int r2 = r5.getVisibility()
            int r3 = r0.f3584
            if (r2 == r3) goto L26
            r5.setVisibility(r3)
        L26:
            fl r2 = r6.f5991
            gl r2 = r2.f4004
            boolean r2 = r2.f4407
            if (r2 == 0) goto L3c
            float r2 = r5.getAlpha()
            float r3 = r0.f3585
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L39
            goto L3c
        L39:
            r5.setAlpha(r3)
        L3c:
            boolean r2 = r5 instanceof android.widget.TextView
            if (r2 == 0) goto L7c
            boolean r2 = r6.f5995
            if (r2 == 0) goto L4d
            r2 = r5
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.CharSequence r3 = r0.f3587
            r2.setText(r3)
            goto L72
        L4d:
            r2 = r5
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.CharSequence r2 = r2.getText()
            boolean r3 = r2 instanceof android.text.Spannable
            if (r3 == 0) goto L5b
            android.text.Spannable r2 = (android.text.Spannable) r2
            goto L5c
        L5b:
            r2 = 0
        L5c:
            java.util.Iterator r3 = r1.iterator()
        L60:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L72
            java.lang.Object r4 = r3.next()
            il r4 = (p000.C0399il) r4
            if (r2 == 0) goto L60
            r2.removeSpan(r4)
            goto L60
        L72:
            android.content.res.ColorStateList r0 = r0.f3586
            if (r0 == 0) goto L8d
            android.widget.TextView r5 = (android.widget.TextView) r5
            r5.setTextColor(r0)
            goto L8d
        L7c:
            boolean r2 = r5 instanceof android.widget.ImageView
            if (r2 == 0) goto L8d
            android.graphics.ColorFilter r0 = r0.f3588
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r0 != 0) goto L8a
            r5.clearColorFilter()
            goto L8d
        L8a:
            r5.setColorFilter(r0)
        L8d:
            r1.clear()
            r5 = 0
            r6.f5995 = r5
            r6.f5993 = r5
            return
    }

    /* JADX INFO: renamed from: ξ */
    public static void m3591(android.view.View r2, p000.p70 r3) {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L34
            java.lang.Object r3 = r3.invoke()     // Catch: java.lang.Throwable -> L13
            goto L1a
        L13:
            r3 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r3)
            r3 = r0
        L1a:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto L33
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = "评论控件样式处理失败: "
            java.lang.String r2 = r0.concat(r2)
            java.lang.String r0 = "r8dc155644f53e174"
            p000.C0888ux.m5977(r0, r2, r3)
        L33:
            return
        L34:
            w1 r0 = new w1
            r1 = 9
            r0.<init>(r3, r1, r2)
            r2.post(r0)
            return
    }

    /* JADX INFO: renamed from: ο */
    public static java.util.List m3592(java.lang.Object r1, p000.EnumC0117cl r2, p000.C0326gl r3) {
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L7
            android.view.View r1 = (android.view.View) r1
            goto L8
        L7:
            r1 = 0
        L8:
            if (r1 != 0) goto Ld
            jz r1 = p000.C0450jz.f5672
            return r1
        Ld:
            fl r0 = new fl
            r0.<init>(r1, r2, r3)
            java.util.List r1 = p000.AbstractC1021yh.m6896(r0)
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public final void m3593(p000.C0289fl r18, boolean r19) {
            r17 = this;
            r0 = r18
            jz r1 = p000.C0450jz.f5672
            java.util.WeakHashMap r2 = p000.C0516ll.f6703
            android.view.View r3 = r0.f4002
            java.lang.Object r3 = r2.get(r3)
            kl r3 = (p000.C0473kl) r3
            if (r3 == 0) goto L19
            boolean r4 = r3.f5993
            if (r4 == 0) goto L19
            android.view.View r4 = r0.f4002
            m3590(r4, r3)
        L19:
            if (r3 != 0) goto L2c
            kl r3 = new kl
            android.view.View r4 = r0.f4002
            el r4 = m3583(r4)
            r3.<init>(r0, r4)
            android.view.View r4 = r0.f4002
            r2.put(r4, r3)
            goto L38
        L2c:
            r3.f5991 = r0
            if (r19 == 0) goto L38
            android.view.View r2 = r0.f4002
            el r2 = m3583(r2)
            r3.f5992 = r2
        L38:
            hl r2 = p000.C0516ll.f6704
            boolean r4 = r2.f4758
            if (r4 != 0) goto L3f
            goto L4b
        L3f:
            java.lang.Object r2 = r2.f4760
            cl r4 = r0.f4003
            java.lang.Object r2 = r2.get(r4)
            jl r2 = (p000.C0435jl) r2
            if (r2 != 0) goto L4c
        L4b:
            return
        L4c:
            gl r4 = r0.f4004
            boolean r4 = r4.f4406
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L69
            boolean r4 = r2.f5503
            if (r4 != 0) goto L69
            android.view.View r4 = r0.f4002
            int r4 = r4.getVisibility()
            r7 = 8
            if (r4 == r7) goto L69
            android.view.View r4 = r0.f4002
            r4.setVisibility(r7)
            r4 = r6
            goto L6a
        L69:
            r4 = r5
        L6a:
            gl r7 = r0.f4004
            boolean r7 = r7.f4407
            if (r7 == 0) goto L8f
            el r7 = r3.f5992
            float r7 = r7.f3585
            float r8 = r2.f5504
            float r7 = r7 * r8
            r8 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            float r7 = p000.j81.m2905(r7, r8, r9)
            android.view.View r8 = r0.f4002
            float r8 = r8.getAlpha()
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 != 0) goto L89
            goto L8f
        L89:
            android.view.View r4 = r0.f4002
            r4.setAlpha(r7)
            r4 = r6
        L8f:
            gl r7 = r0.f4004
            boolean r7 = r7.f4408
            if (r7 == 0) goto L214
            java.lang.Integer r2 = r2.f5505
            if (r2 == 0) goto L214
            android.view.View r7 = r0.f4002
            cl r0 = r0.f4003
            int r2 = r2.intValue()
            boolean r8 = r7 instanceof android.widget.TextView
            if (r8 == 0) goto L201
            cl r8 = p000.EnumC0117cl.f2184
            if (r0 != r8) goto L1fa
            hl r0 = p000.C0516ll.f6704
            boolean r0 = r0.f4759
            if (r0 == 0) goto L1fa
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.CharSequence r0 = r7.getText()
            if (r0 != 0) goto Lba
        Lb7:
            r0 = r5
            goto L20e
        Lba:
            int r8 = r0.length()
            if (r8 != 0) goto Lc6
            r7.setTextColor(r2)
        Lc3:
            r0 = r6
            goto L20e
        Lc6:
            boolean r8 = r0 instanceof android.text.Spanned
            if (r8 != 0) goto Lcc
            goto L189
        Lcc:
            r8 = r0
            android.text.Spanned r8 = (android.text.Spanned) r8
            int r9 = r0.length()
            java.lang.Class<android.text.style.ClickableSpan> r10 = android.text.style.ClickableSpan.class
            java.lang.Object[] r8 = r8.getSpans(r5, r9, r10)
            r8.getClass()
            ss1 r8 = p000.AbstractC0312g7.m2232(r8)
            ng r9 = new ng
            r15 = 0
            r16 = 3
            r10 = 1
            java.lang.Class<ll> r12 = p000.C0516ll.class
            java.lang.String r13 = "isHostMentionSpan"
            java.lang.String r14 = "isHostMentionSpan(Landroid/text/style/ClickableSpan;)Z"
            r11 = r17
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            y30 r10 = new y30
            r10.<init>(r8, r6, r9)
            θ r8 = new θ
            r9 = 11
            r8.<init>(r9, r0)
            y30 r8 = p000.us1.m5943(r10, r8)
            tf r9 = new tf
            r10 = 18
            r9.<init>(r10)
            ye r10 = new ye
            r11 = 1
            r10.<init>(r11, r9)
            java.util.List r8 = p000.us1.m5949(r8)
            p000.AbstractC0019ai.m168(r8, r10)
            java.util.Iterator r8 = r8.iterator()
            boolean r9 = r8.hasNext()
            if (r9 != 0) goto L121
            r8 = r1
            goto L143
        L121:
            java.lang.Object r9 = r8.next()
            boolean r10 = r8.hasNext()
            if (r10 != 0) goto L130
            java.util.List r8 = p000.AbstractC1021yh.m6896(r9)
            goto L143
        L130:
            java.util.ArrayList r9 = p000.lz1.m3696(r9)
        L134:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L142
            java.lang.Object r10 = r8.next()
            r9.add(r10)
            goto L134
        L142:
            r8 = r9
        L143:
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L14a
            goto L189
        L14a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L153:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L189
            java.lang.Object r9 = r8.next()
            xm0 r9 = (p000.xm0) r9
            java.lang.Object r10 = p000.AbstractC0984xh.m6646(r1)
            xm0 r10 = (p000.xm0) r10
            if (r10 == 0) goto L185
            int r11 = r10.f11348
            int r12 = r9.f11347
            int r13 = r11 + 1
            if (r12 > r13) goto L185
            int r12 = r1.size()
            int r12 = r12 - r6
            xm0 r13 = new xm0
            int r10 = r10.f11347
            int r9 = r9.f11348
            int r9 = java.lang.Math.max(r11, r9)
            r13.<init>(r10, r9, r6)
            r1.set(r12, r13)
            goto L153
        L185:
            r1.add(r9)
            goto L153
        L189:
            boolean r8 = r1.isEmpty()
            if (r8 == 0) goto L194
            r7.setTextColor(r2)
            goto Lc3
        L194:
            boolean r8 = r0 instanceof android.text.Spannable
            if (r8 == 0) goto L19b
            android.text.Spannable r0 = (android.text.Spannable) r0
            goto L1a8
        L19b:
            android.text.SpannableString r8 = new android.text.SpannableString
            r8.<init>(r0)
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            r7.setText(r8, r0)
            r3.f5995 = r6
            r0 = r8
        L1a8:
            java.util.Iterator r1 = r1.iterator()
            r7 = r5
        L1ad:
            boolean r8 = r1.hasNext()
            r9 = 8323105(0x7f0021, float:1.1663154E-38)
            if (r8 == 0) goto L1d8
            java.lang.Object r8 = r1.next()
            xm0 r8 = (p000.xm0) r8
            int r10 = r8.f11347
            if (r7 >= r10) goto L1d0
            if (r10 > r7) goto L1c3
            goto L1d0
        L1c3:
            il r11 = new il
            r11.<init>(r2)
            r0.setSpan(r11, r7, r10, r9)
            java.util.List r9 = r3.f5994
            r9.add(r11)
        L1d0:
            int r8 = r8.f11348
            int r8 = r8 + r6
            int r7 = java.lang.Math.max(r7, r8)
            goto L1ad
        L1d8:
            int r1 = r0.length()
            if (r7 >= r1) goto L1f2
            int r1 = r0.length()
            if (r1 > r7) goto L1e5
            goto L1f2
        L1e5:
            il r8 = new il
            r8.<init>(r2)
            r0.setSpan(r8, r7, r1, r9)
            java.util.List r0 = r3.f5994
            r0.add(r8)
        L1f2:
            java.util.List r0 = r3.f5994
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r6
            goto L20e
        L1fa:
            android.widget.TextView r7 = (android.widget.TextView) r7
            r7.setTextColor(r2)
            goto Lc3
        L201:
            boolean r0 = r7 instanceof android.widget.ImageView
            if (r0 == 0) goto Lb7
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r7.setColorFilter(r2, r0)
            goto Lc3
        L20e:
            if (r0 != 0) goto L212
            if (r4 == 0) goto L213
        L212:
            r5 = r6
        L213:
            r4 = r5
        L214:
            r3.f5993 = r4
            return
    }
}
