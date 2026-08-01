package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class a01 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f4 = null;

    /* JADX INFO: renamed from: β */
    public static final android.os.Handler f5 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicReference f6 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.atomic.AtomicReference f7 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.concurrent.atomic.AtomicInteger f8 = null;

    /* JADX INFO: renamed from: ζ */
    public static p000.fb0 f9;

    /* JADX INFO: renamed from: η */
    public static long f10;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.a01.f4 = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            p000.a01.f5 = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r2 = 0
            r0.<init>(r2)
            p000.a01.f6 = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            java.lang.String r2 = ""
            r0.<init>(r2)
            p000.a01.f7 = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            p000.a01.f8 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m4(android.view.View r12) {
            be0 r0 = p000.be0.f1670
            boolean r0 = r0.m938()
            if (r0 != 0) goto L9
            return
        L9:
            int r0 = r12.getWidth()
            r1 = 0
            if (r0 > 0) goto L13
        L10:
            r5 = r1
            goto L90
        L13:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            m7(r12, r12, r0)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L22
            goto L10
        L22:
            r2 = 2
            int[] r3 = new int[r2]
            r12.getLocationOnScreen(r3)
            int r12 = r12.getWidth()
            float r12 = (float) r12
            r4 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 / r4
            java.util.Iterator r0 = r0.iterator()
            boolean r5 = r0.hasNext()
            if (r5 != 0) goto L3c
            r5 = r1
            goto L8e
        L3c:
            java.lang.Object r5 = r0.next()
            boolean r6 = r0.hasNext()
            if (r6 != 0) goto L47
            goto L8e
        L47:
            r6 = r5
            android.widget.TextView r6 = (android.widget.TextView) r6
            int[] r7 = new int[r2]
            r6.getLocationOnScreen(r7)
            r8 = 0
            r7 = r7[r8]
            r9 = r3[r8]
            int r7 = r7 - r9
            float r7 = (float) r7
            int r6 = r6.getWidth()
            float r6 = (float) r6
            float r6 = r6 / r4
            float r6 = r6 + r7
            float r6 = r6 - r12
            float r6 = java.lang.Math.abs(r6)
        L62:
            java.lang.Object r7 = r0.next()
            r9 = r7
            android.widget.TextView r9 = (android.widget.TextView) r9
            int[] r10 = new int[r2]
            r9.getLocationOnScreen(r10)
            r10 = r10[r8]
            r11 = r3[r8]
            int r10 = r10 - r11
            float r10 = (float) r10
            int r9 = r9.getWidth()
            float r9 = (float) r9
            float r9 = r9 / r4
            float r9 = r9 + r10
            float r9 = r9 - r12
            float r9 = java.lang.Math.abs(r9)
            int r10 = java.lang.Float.compare(r6, r9)
            if (r10 <= 0) goto L88
            r5 = r7
            r6 = r9
        L88:
            boolean r7 = r0.hasNext()
            if (r7 != 0) goto L62
        L8e:
            android.widget.TextView r5 = (android.widget.TextView) r5
        L90:
            if (r5 != 0) goto L9a
            java.lang.String r12 = "rbe3d87ed96de26de"
            java.lang.String r0 = "未找到中央标题 TextView，跳过双击手势安装"
            p000.C0888ux.m5975(r12, r0)
            return
        L9a:
            java.lang.ref.WeakReference r12 = new java.lang.ref.WeakReference
            r12.<init>(r5)
            java.util.concurrent.atomic.AtomicReference r0 = p000.a01.f6
            r0.set(r12)
            java.util.concurrent.atomic.AtomicInteger r12 = p000.a01.f8
            int r12 = r12.get()
            if (r12 <= 0) goto Lb4
            java.lang.String r12 = m5(r12)
            r5.setText(r12)
            goto Lde
        Lb4:
            java.lang.CharSequence r12 = r5.getText()
            if (r12 == 0) goto Lbe
            java.lang.String r1 = r12.toString()
        Lbe:
            if (r1 != 0) goto Lc2
            java.lang.String r1 = ""
        Lc2:
            boolean r12 = p000.q02.m4671(r1)
            if (r12 != 0) goto Lde
            r12 = 40
            boolean r12 = p000.q02.m4655(r1, r12)
            if (r12 == 0) goto Ld9
            r12 = 41
            boolean r12 = p000.q02.m4655(r1, r12)
            if (r12 == 0) goto Ld9
            goto Lde
        Ld9:
            java.util.concurrent.atomic.AtomicReference r12 = p000.a01.f7
            r12.set(r1)
        Lde:
            r12 = 1
            r5.setClickable(r12)
            oi0 r12 = new oi0
            r0 = 1
            r12.<init>(r0)
            r5.setOnTouchListener(r12)
            lg r12 = new lg
            r0 = 5
            r12.<init>(r0)
            r5.addOnAttachStateChangeListener(r12)
            return
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.String m5(int r2) {
            java.util.concurrent.atomic.AtomicReference r0 = p000.a01.f7
            java.lang.Object r0 = r0.get()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r1 = p000.q02.m4671(r0)
            if (r1 == 0) goto L10
            java.lang.String r0 = "消息"
        L10:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public static void m6(boolean r2) {
            fb0 r0 = p000.a01.f9
            if (r0 == 0) goto L9
            android.os.Handler r1 = p000.a01.f5
            r1.removeCallbacks(r0)
        L9:
            r0 = 0
            p000.a01.f9 = r0
            java.util.concurrent.atomic.AtomicInteger r0 = p000.a01.f8
            r1 = 0
            r0.set(r1)
            if (r2 == 0) goto L1f
            be0 r0 = p000.be0.f1670
            boolean r1 = r0.m940()
            if (r1 == 0) goto L1f
            r0.m945()
        L1f:
            m9()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "临时显示已手动取消 restoreImmediately="
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "rbe3d87ed96de26de"
            p000.C0888ux.m5975(r0, r2)
            return
    }

    /* JADX INFO: renamed from: δ */
    public static void m7(android.view.View r3, android.view.View r4, java.util.ArrayList r5) {
            int r0 = r3.getVisibility()
            if (r0 == 0) goto L7
            goto L5d
        L7:
            boolean r0 = r3 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 == 0) goto L21
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
        L12:
            if (r1 >= r0) goto L5d
            android.view.View r2 = r3.getChildAt(r1)
            r2.getClass()
            m7(r2, r4, r5)
            int r1 = r1 + 1
            goto L12
        L21:
            boolean r0 = r3 instanceof android.widget.TextView
            if (r0 != 0) goto L26
            goto L5d
        L26:
            r0 = 2
            int[] r2 = new int[r0]
            r4.getLocationOnScreen(r2)
            int[] r0 = new int[r0]
            r3.getLocationOnScreen(r0)
            r0 = r0[r1]
            r1 = r2[r1]
            int r0 = r0 - r1
            float r0 = (float) r0
            r1 = r3
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r1 = r1.getWidth()
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r1 = r1 + r0
            int r4 = r4.getWidth()
            r0 = 1
            if (r4 >= r0) goto L4b
            r4 = r0
        L4b:
            float r4 = (float) r4
            float r1 = r1 / r4
            r4 = 1041865114(0x3e19999a, float:0.15)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 > 0) goto L5d
            r4 = 1061158912(0x3f400000, float:0.75)
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 > 0) goto L5d
            r5.add(r3)
        L5d:
            return
    }

    /* JADX INFO: renamed from: ε */
    public static void m8(java.lang.ClassLoader r2) {
            java.lang.Object r0 = p000.qe0.f8982
            java.lang.String r0 = "~788B5F4DE0E38014A7A1F3F88E7C9C04EDA5F6AEF63EFCCE655A148DE001A79FAC0ED051157FAA8B5C21A4618C1376FF67C513D2B9EA171EDDC206E1AAC617F550EF8436AABAFC"
            java.lang.String r1 = p000.jf0.m2957(r0)
            java.lang.Class r2 = p000.qe0.m4877(r2, r1)
            if (r2 == 0) goto L28
            oj0 r0 = new oj0
            r1 = 18
            r0.<init>(r1)
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r1 = "onViewCreated"
            p000.qe0.m4873(r2, r1, r0)
            java.lang.String r2 = "rbe3d87ed96de26de"
            java.lang.String r0 = "TitleBarUI 双击显示 Hook 已安装"
            p000.C0888ux.m5975(r2, r0)
            return
        L28:
            java.lang.ClassNotFoundException r2 = new java.lang.ClassNotFoundException
            java.lang.String r0 = p000.jf0.m2957(r0)
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ζ */
    public static void m9() {
            java.util.concurrent.atomic.AtomicReference r0 = p000.a01.f7
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            boolean r1 = p000.q02.m4671(r0)
            if (r1 == 0) goto L12
            goto L27
        L12:
            java.util.concurrent.atomic.AtomicReference r1 = p000.a01.f6
            java.lang.Object r1 = r1.get()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            if (r1 == 0) goto L27
            java.lang.Object r1 = r1.get()
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L27
            r1.setText(r0)
        L27:
            return
    }
}
