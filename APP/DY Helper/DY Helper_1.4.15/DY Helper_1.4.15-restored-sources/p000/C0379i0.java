package p000;

/* JADX INFO: renamed from: i0 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0379i0 implements p000.InterfaceC0899v7, p000.lx1, p000.n72 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4856;

    /* JADX INFO: renamed from: ζ */
    public java.lang.Object f4857;

    /* JADX INFO: renamed from: η */
    public java.lang.Object f4858;

    /* JADX INFO: renamed from: θ */
    public java.lang.Object f4859;

    /* JADX INFO: renamed from: ι */
    public java.lang.Object f4860;

    public C0379i0(int r1) {
            r0 = this;
            r0.f4856 = r1
            switch(r1) {
                case 3: goto L40;
                case 4: goto L5;
                case 5: goto L1e;
                default: goto L5;
            }
        L5:
            r0.<init>()
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.f4858 = r1
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.f4859 = r1
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.f4860 = r1
            return
        L1e:
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f4857 = r1
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r0.f4858 = r1
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r0.f4859 = r1
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            java.util.Map r1 = java.util.Collections.synchronizedMap(r1)
            r0.f4860 = r1
            return
        L40:
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f4857 = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f4858 = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f4859 = r1
            return
    }

    public C0379i0(android.content.Context r2, android.view.ActionMode.Callback r3) {
            r1 = this;
            r0 = 7
            r1.f4856 = r0
            r1.<init>()
            r1.f4858 = r2
            r1.f4857 = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f4859 = r2
            fw1 r2 = new fw1
            r3 = 0
            r2.<init>(r3)
            r1.f4860 = r2
            return
    }

    public C0379i0(android.graphics.Typeface r8, p000.h01 r9) {
            r7 = this;
            r0 = 6
            r7.f4856 = r0
            r7.<init>()
            r7.f4860 = r8
            r7.f4857 = r9
            i01 r8 = new i01
            r0 = 1024(0x400, float:1.435E-42)
            r8.<init>(r0)
            r7.f4859 = r8
            r8 = 6
            int r0 = r9.m7040(r8)
            r1 = 0
            if (r0 == 0) goto L30
            int r2 = r9.f12857
            int r0 = r0 + r2
            java.lang.Object r2 = r9.f12860
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r2.getInt(r0)
            int r2 = r2 + r0
            java.lang.Object r0 = r9.f12860
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r0 = r0.getInt(r2)
            goto L31
        L30:
            r0 = r1
        L31:
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            r7.f4858 = r0
            int r8 = r9.m7040(r8)
            if (r8 == 0) goto L52
            int r0 = r9.f12857
            int r8 = r8 + r0
            java.lang.Object r0 = r9.f12860
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r0 = r0.getInt(r8)
            int r0 = r0 + r8
            java.lang.Object r8 = r9.f12860
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            int r8 = r8.getInt(r0)
            goto L53
        L52:
            r8 = r1
        L53:
            r9 = r1
        L54:
            if (r9 >= r8) goto Ld8
            k62 r0 = new k62
            r0.<init>(r7, r9)
            g01 r2 = r0.m3167()
            r3 = 4
            int r3 = r2.m7040(r3)
            if (r3 == 0) goto L72
            java.lang.Object r4 = r2.f12860
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r2 = r2.f12857
            int r3 = r3 + r2
            int r2 = r4.getInt(r3)
            goto L73
        L72:
            r2 = r1
        L73:
            java.lang.Object r3 = r7.f4858
            char[] r3 = (char[]) r3
            int r4 = r9 * 2
            java.lang.Character.toChars(r2, r3, r4)
            g01 r2 = r0.m3167()
            r3 = 16
            int r4 = r2.m7040(r3)
            if (r4 == 0) goto L9d
            int r5 = r2.f12857
            int r4 = r4 + r5
            java.lang.Object r5 = r2.f12860
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            int r5 = r5.getInt(r4)
            int r5 = r5 + r4
            java.lang.Object r2 = r2.f12860
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r2.getInt(r5)
            goto L9e
        L9d:
            r2 = r1
        L9e:
            r4 = 1
            if (r2 <= 0) goto La3
            r2 = r4
            goto La4
        La3:
            r2 = r1
        La4:
            if (r2 == 0) goto Ld1
            java.lang.Object r2 = r7.f4859
            i01 r2 = (p000.i01) r2
            g01 r5 = r0.m3167()
            int r3 = r5.m7040(r3)
            if (r3 == 0) goto Lc9
            int r6 = r5.f12857
            int r3 = r3 + r6
            java.lang.Object r6 = r5.f12860
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            int r6 = r6.getInt(r3)
            int r6 = r6 + r3
            java.lang.Object r3 = r5.f12860
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r6)
            goto Lca
        Lc9:
            r3 = r1
        Lca:
            int r3 = r3 - r4
            r2.m2577(r0, r1, r3)
            int r9 = r9 + 1
            goto L54
        Ld1:
            java.lang.String r7 = "invalid metadata codepoint length"
            p000.C1080.m7275(r7)
            r7 = 0
            throw r7
        Ld8:
            return
    }

    public C0379i0(androidx.compose.p001ui.platform.AndroidComposeView r2, p000.C1011y7 r3) {
            r1 = this;
            r0 = 0
            r1.f4856 = r0
            r1.<init>()
            r1.f4857 = r2
            r1.f4858 = r3
            android.content.Context r3 = r2.getContext()
            java.lang.Class<android.view.autofill.AutofillManager> r0 = android.view.autofill.AutofillManager.class
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.autofill.AutofillManager r3 = (android.view.autofill.AutofillManager) r3
            if (r3 == 0) goto L2e
            r1.f4859 = r3
            r3 = 1
            r2.setImportantForAutofill(r3)
            android.view.autofill.AutofillId r2 = r2.getAutofillId()
            if (r2 == 0) goto L27
            r1.f4860 = r2
            return
        L27:
            java.lang.String r1 = "Required value was null."
            pm r1 = p000.lz1.m3680(r1)
            throw r1
        L2e:
            java.lang.String r1 = "Autofill service could not be located."
            p000.C1080.m7279(r1)
            r1 = 0
            throw r1
    }

    public C0379i0(p000.InterfaceC0199d4 r2) {
            r1 = this;
            r0 = 8
            r1.f4856 = r0
            r1.<init>()
            r1.f4857 = r2
            return
    }

    public C0379i0(p000.dj0 r2, p000.cj0 r3, java.util.concurrent.atomic.AtomicBoolean r4, p000.xi0 r5) {
            r1 = this;
            r0 = 4
            r1.f4856 = r0
            r1.<init>()
            r1.f4857 = r2
            r1.f4858 = r3
            r1.f4859 = r4
            r1.f4860 = r5
            return
    }

    public C0379i0(java.net.Socket r2) {
            r1 = this;
            r0 = 1
            r1.f4856 = r0
            r1.<init>()
            r1.f4857 = r2
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>()
            r1.f4858 = r2
            lr r2 = new lr
            r2.<init>(r1)
            r1.f4859 = r2
            kr r2 = new kr
            r2.<init>(r1)
            r1.f4860 = r2
            return
    }

    public C0379i0(p000.q92 r2, p000.p92 r3, p000.AbstractC0368hq r4) {
            r1 = this;
            r0 = 9
            r1.f4856 = r0
            r2.getClass()
            r4.getClass()
            r1.<init>()
            r1.f4857 = r2
            r1.f4858 = r3
            r1.f4859 = r4
            zz1 r2 = new zz1
            r3 = 2
            r4 = 0
            r2.<init>(r3, r4)
            r1.f4860 = r2
            return
    }

    /* JADX INFO: renamed from: α */
    public static final int m2547(p000.C0379i0 r4, android.view.View r5) {
            r4.getClass()
            boolean r0 = r5.isAttachedToWindow()
            if (r0 != 0) goto Le
            int r4 = r5.getLeft()
            return r4
        Le:
            r0 = 2
            int[] r0 = new int[r0]     // Catch: java.lang.Throwable -> L1c
            r5.getLocationOnScreen(r0)     // Catch: java.lang.Throwable -> L1c
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L1c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L1c
            goto L23
        L1c:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L23:
            java.lang.Throwable r1 = p000.fo1.m2190(r0)
            if (r1 == 0) goto L3c
            java.lang.Class r2 = r5.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "position:"
            java.lang.String r2 = r3.concat(r2)
            java.lang.String r3 = "读取宿主 Tab 坐标失败"
            r4.m2550(r2, r3, r1)
        L3c:
            int r4 = r5.getLeft()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r5 = r0 instanceof p000.eo1
            if (r5 == 0) goto L49
            r0 = r4
        L49:
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            return r4
    }

    /* JADX INFO: renamed from: δ */
    public static java.util.ArrayList m2548(android.view.View r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r4 instanceof android.widget.ImageView
            if (r1 == 0) goto Lc
            r0.add(r4)
        Lc:
            boolean r1 = r4 instanceof android.view.ViewGroup
            if (r1 == 0) goto L13
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            goto L14
        L13:
            r4 = 0
        L14:
            if (r4 != 0) goto L17
            goto L2f
        L17:
            int r1 = r4.getChildCount()
            r2 = 0
        L1c:
            if (r2 >= r1) goto L2f
            android.view.View r3 = r4.getChildAt(r2)
            r3.getClass()
            java.util.ArrayList r3 = m2548(r3)
            p000.AbstractC0984xh.m6660(r0, r3)
            int r2 = r2 + 1
            goto L1c
        L2f:
            return r0
    }

    /* JADX INFO: renamed from: μ */
    public static java.util.ArrayList m2549(android.view.View r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r4 instanceof android.widget.TextView
            if (r1 == 0) goto Lc
            r0.add(r4)
        Lc:
            boolean r1 = r4 instanceof android.view.ViewGroup
            if (r1 == 0) goto L13
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            goto L14
        L13:
            r4 = 0
        L14:
            if (r4 != 0) goto L17
            goto L2f
        L17:
            int r1 = r4.getChildCount()
            r2 = 0
        L1c:
            if (r2 >= r1) goto L2f
            android.view.View r3 = r4.getChildAt(r2)
            r3.getClass()
            java.util.ArrayList r3 = m2549(r3)
            p000.AbstractC0984xh.m6660(r0, r3)
            int r2 = r2 + 1
            goto L1c
        L2f:
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.f4856
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = super.toString()
            return r1
        La:
            java.lang.Object r1 = r1.f4857
            java.net.Socket r1 = (java.net.Socket) r1
            java.lang.String r1 = r1.toString()
            r1.getClass()
            return r1
    }

    /* JADX INFO: renamed from: Α */
    public void m2550(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            r0 = this;
            java.lang.Object r0 = r0.f4859
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = (java.util.concurrent.ConcurrentHashMap.KeySetView) r0
            boolean r0 = r0.add(r1)
            if (r0 == 0) goto Lf
            java.lang.String r0 = "rcc2da37d9ce3401d"
            p000.C0888ux.m5977(r0, r2, r3)
        Lf:
            return
    }

    /* JADX INFO: renamed from: Β */
    public void m2551(p000.i70 r3) {
            r2 = this;
            n60 r0 = r3.f4942
            java.lang.String r1 = r0.f7426
            java.lang.Object r2 = r2.f4858
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r1 = r2.get(r1)
            if (r1 == 0) goto Lf
            return
        Lf:
            java.lang.String r1 = r0.f7426
            r2.put(r1, r3)
            r2 = 2
            boolean r2 = p000.b70.m751(r2)
            if (r2 == 0) goto L2e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Added fragment to active set "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r2)
        L2e:
            return
    }

    /* JADX INFO: renamed from: Γ */
    public void m2552(p000.i70 r4) {
            r3 = this;
            java.lang.Object r0 = r3.f4858
            java.util.HashMap r0 = (java.util.HashMap) r0
            n60 r1 = r4.f4942
            boolean r2 = r1.f7406
            if (r2 == 0) goto L11
            java.lang.Object r3 = r3.f4860
            e70 r3 = (p000.e70) r3
            r3.m1856(r1)
        L11:
            java.lang.String r3 = r1.f7426
            java.lang.Object r3 = r0.get(r3)
            if (r3 == r4) goto L1a
            goto L40
        L1a:
            java.lang.String r3 = r1.f7426
            r4 = 0
            java.lang.Object r3 = r0.put(r3, r4)
            i70 r3 = (p000.i70) r3
            if (r3 != 0) goto L26
            goto L40
        L26:
            r3 = 2
            boolean r3 = p000.b70.m751(r3)
            if (r3 == 0) goto L40
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Removed fragment from active set "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "FragmentManager"
            android.util.Log.v(r4, r3)
        L40:
            return
    }

    /* JADX INFO: renamed from: Δ */
    public boolean m2553(p000.AbstractC1153 r3, android.view.MenuItem r4) {
            r2 = this;
            java.lang.Object r0 = r2.f4857
            android.view.ActionMode$Callback r0 = (android.view.ActionMode.Callback) r0
            p12 r3 = r2.m2570(r3)
            androidx.appcompat.view.menu.α r1 = new androidx.appcompat.view.menu.α
            java.lang.Object r2 = r2.f4858
            android.content.Context r2 = (android.content.Context) r2
            t12 r4 = (p000.t12) r4
            r1.<init>(r2, r4)
            boolean r2 = r0.onActionItemClicked(r3, r1)
            return r2
    }

    /* JADX INFO: renamed from: Ε */
    public boolean m2554(p000.AbstractC1153 r5, android.view.Menu r6) {
            r4 = this;
            java.lang.Object r0 = r4.f4857
            android.view.ActionMode$Callback r0 = (android.view.ActionMode.Callback) r0
            p12 r5 = r4.m2570(r5)
            java.lang.Object r1 = r4.f4860
            fw1 r1 = (p000.fw1) r1
            java.lang.Object r2 = r1.get(r6)
            android.view.Menu r2 = (android.view.Menu) r2
            if (r2 != 0) goto L23
            xz0 r2 = new xz0
            java.lang.Object r4 = r4.f4858
            android.content.Context r4 = (android.content.Context) r4
            r3 = r6
            iz0 r3 = (p000.iz0) r3
            r2.<init>(r4, r3)
            r1.put(r6, r2)
        L23:
            boolean r4 = r0.onCreateActionMode(r5, r2)
            return r4
    }

    /* JADX INFO: renamed from: Ζ */
    public android.os.Bundle m2555(android.os.Bundle r1, java.lang.String r2) {
            r0 = this;
            java.lang.Object r0 = r0.f4859
            java.util.HashMap r0 = (java.util.HashMap) r0
            if (r1 == 0) goto Ld
            java.lang.Object r0 = r0.put(r2, r1)
            android.os.Bundle r0 = (android.os.Bundle) r0
            return r0
        Ld:
            java.lang.Object r0 = r0.remove(r2)
            android.os.Bundle r0 = (android.os.Bundle) r0
            return r0
    }

    @Override // p000.lx1
    /* JADX INFO: renamed from: β */
    public p000.rx1 mo2556() {
            r0 = this;
            java.lang.Object r0 = r0.f4859
            lr r0 = (p000.C0522lr) r0
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public void m2557(p000.n60 r2) {
            r1 = this;
            java.lang.Object r0 = r1.f4857
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L1e
            java.lang.Object r0 = r1.f4857
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            monitor-enter(r0)
            java.lang.Object r1 = r1.f4857     // Catch: java.lang.Throwable -> L1b
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L1b
            r1.add(r2)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            r1 = 1
            r2.f7432 = r1
            return
        L1b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
        L1e:
            java.lang.String r1 = "Fragment already added: "
            p000.C1080.m7268(r2, r1)
            return
    }

    /* JADX INFO: renamed from: ε */
    public void m2558(android.view.View r19, android.view.ViewGroup r20, int r21, java.util.ArrayList r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = 12
            if (r3 <= r5) goto L10
            goto La1
        L10:
            r5 = 0
            if (r1 == r2) goto L81
            java.lang.Class r6 = r1.getClass()
            java.lang.Object r7 = r0.f4858
            java.util.concurrent.ConcurrentHashMap$KeySetView r7 = (java.util.concurrent.ConcurrentHashMap.KeySetView) r7
            java.lang.Object r8 = r0.f4857
            java.util.concurrent.ConcurrentHashMap r8 = (java.util.concurrent.ConcurrentHashMap) r8
            java.lang.Object r9 = r8.get(r6)
            jt0 r9 = (p000.jt0) r9
            if (r9 == 0) goto L28
            goto L76
        L28:
            boolean r9 = r7.contains(r6)
            if (r9 == 0) goto L30
        L2e:
            r9 = r5
            goto L76
        L30:
            java.lang.Class<android.view.View> r9 = android.view.View.class
            boolean r9 = r9.isAssignableFrom(r6)
            if (r9 != 0) goto L3c
            r7.add(r6)
            goto L2e
        L3c:
            java.lang.String r9 = "getTabType"
            java.lang.reflect.Method r9 = r0.m2568(r6, r9)
            java.lang.String r10 = "getCurrentTabId"
            if (r9 != 0) goto L4a
            java.lang.reflect.Method r9 = r0.m2568(r6, r10)
        L4a:
            r12 = r9
            if (r12 != 0) goto L51
            r7.add(r6)
            goto L2e
        L51:
            jt0 r11 = new jt0
            java.lang.reflect.Method r13 = r0.m2568(r6, r10)
            java.lang.String r7 = "getTabTitle"
            java.lang.reflect.Method r14 = r0.m2568(r6, r7)
            java.lang.String r7 = "isSelected"
            java.lang.reflect.Method r15 = r0.m2568(r6, r7)
            java.lang.String r7 = "getTabCountDot"
            java.lang.reflect.Method r16 = r0.m2568(r6, r7)
            java.lang.String r7 = "getTabDot"
            java.lang.reflect.Method r17 = r0.m2568(r6, r7)
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r8.put(r6, r11)
            r9 = r11
        L76:
            if (r9 == 0) goto L81
            l91 r0 = new l91
            r0.<init>(r1, r9)
            r4.add(r0)
            return
        L81:
            boolean r6 = r1 instanceof android.view.ViewGroup
            if (r6 == 0) goto L88
            r5 = r1
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
        L88:
            if (r5 != 0) goto L8b
            goto La1
        L8b:
            int r1 = r5.getChildCount()
            r6 = 0
        L90:
            if (r6 >= r1) goto La1
            android.view.View r7 = r5.getChildAt(r6)
            r7.getClass()
            int r8 = r3 + 1
            r0.m2558(r7, r2, r8, r4)
            int r6 = r6 + 1
            goto L90
        La1:
            return
    }

    @Override // p000.n72
    /* JADX INFO: renamed from: ζ */
    public p000.AbstractC0100c4 mo2559(long r17, p000.AbstractC0100c4 r19, p000.AbstractC0100c4 r20, p000.AbstractC0100c4 r21) {
            r16 = this;
            r0 = r16
            java.lang.Object r1 = r0.f4859
            c4 r1 = (p000.AbstractC0100c4) r1
            if (r1 != 0) goto Le
            c4 r1 = r21.mo29()
            r0.f4859 = r1
        Le:
            java.lang.Object r1 = r0.f4859
            c4 r1 = (p000.AbstractC0100c4) r1
            r2 = 0
            java.lang.String r3 = "velocityVector"
            if (r1 == 0) goto L67
            int r1 = r1.mo28()
            r4 = 0
        L1c:
            java.lang.Object r5 = r0.f4859
            c4 r5 = (p000.AbstractC0100c4) r5
            if (r4 >= r1) goto L60
            if (r5 == 0) goto L5c
            java.lang.Object r6 = r0.f4857
            d4 r6 = (p000.InterfaceC0199d4) r6
            e40 r6 = r6.get(r4)
            r7 = r19
            float r8 = r7.mo27(r4)
            r9 = r20
            float r10 = r9.mo27(r4)
            r11 = r21
            float r12 = r11.mo27(r4)
            r13 = 1000000(0xf4240, double:4.940656E-318)
            long r13 = r17 / r13
            oz1 r6 = r6.f3404
            r6.f8361 = r10
            long r12 = r6.m4338(r8, r12, r13)
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r14
            int r6 = (int) r12
            float r6 = java.lang.Float.intBitsToFloat(r6)
            r5.mo31(r4, r6)
            int r4 = r4 + 1
            goto L1c
        L5c:
            p000.ln0.m3650(r3)
            throw r2
        L60:
            if (r5 == 0) goto L63
            return r5
        L63:
            p000.ln0.m3650(r3)
            throw r2
        L67:
            p000.ln0.m3650(r3)
            throw r2
    }

    /* JADX INFO: renamed from: η */
    public java.util.List m2560(android.view.ViewGroup r30) {
            r29 = this;
            r1 = r29
            r2 = r30
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3 = 0
            r1.m2558(r2, r2, r3, r0)
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L16
            jz r0 = p000.C0450jz.f5672
            return r0
        L16:
            ye r4 = new ye
            r5 = 19
            r4.<init>(r5, r1)
            ye r5 = new ye
            r6 = 20
            r5.<init>(r6, r4)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r0, r5)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r0.iterator()
        L36:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L69a
            java.lang.Object r0 = r6.next()
            l91 r0 = (p000.l91) r0
            java.lang.Object r7 = r0.f6502
            r9 = r7
            android.view.View r9 = (android.view.View) r9
            java.lang.Object r0 = r0.f6503
            jt0 r0 = (p000.jt0) r0
            java.lang.reflect.Method r7 = r0.f5575
            java.lang.Object r7 = r1.m2575(r9, r7)
            if (r7 == 0) goto L58
            java.lang.String r7 = r7.toString()
            goto L59
        L58:
            r7 = 0
        L59:
            java.lang.String r10 = ""
            if (r7 != 0) goto L5e
            r7 = r10
        L5e:
            java.lang.CharSequence r7 = p000.q02.m4660(r7)
            java.lang.String r7 = r7.toString()
            boolean r11 = p000.q02.m4671(r7)
            if (r11 != 0) goto L6d
            goto L86
        L6d:
            java.lang.reflect.Method r7 = r0.f5574
            java.lang.Object r7 = r1.m2575(r9, r7)
            if (r7 == 0) goto L7a
            java.lang.String r7 = r7.toString()
            goto L7b
        L7a:
            r7 = 0
        L7b:
            if (r7 != 0) goto L7e
            r7 = r10
        L7e:
            java.lang.CharSequence r7 = p000.q02.m4660(r7)
            java.lang.String r7 = r7.toString()
        L86:
            boolean r11 = p000.q02.m4671(r7)
            if (r11 == 0) goto L93
            r21 = r4
            r22 = r6
            r8 = 0
            goto L688
        L93:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            java.lang.Object r11 = r4.getOrDefault(r7, r11)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            int r12 = r11 + 1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r4.put(r7, r12)
            if (r11 != 0) goto Lae
            r11 = r7
            goto Lb4
        Lae:
            java.lang.String r12 = "#"
            java.lang.String r11 = p000.AbstractC0602nx.m4130(r7, r12, r11)
        Lb4:
            java.lang.reflect.Method r12 = r0.f5576
            java.lang.Object r12 = r1.m2575(r9, r12)
            boolean r13 = r12 instanceof android.widget.TextView
            if (r13 == 0) goto Ld0
            android.widget.TextView r12 = (android.widget.TextView) r12
            java.lang.CharSequence r12 = r12.getText()
            if (r12 == 0) goto Lcb
            java.lang.String r12 = r12.toString()
            goto Lcc
        Lcb:
            r12 = 0
        Lcc:
            if (r12 != 0) goto Ld8
        Lce:
            r12 = r10
            goto Ld8
        Ld0:
            boolean r13 = r12 instanceof java.lang.CharSequence
            if (r13 == 0) goto Lce
            java.lang.String r12 = r12.toString()
        Ld8:
            java.lang.CharSequence r12 = p000.q02.m4660(r12)
            java.lang.String r12 = r12.toString()
            boolean r13 = p000.q02.m4671(r12)
            r14 = 1
            if (r13 != 0) goto Le9
            goto L226
        Le9:
            java.util.ArrayList r12 = m2549(r9)
            f7 r13 = new f7
            r15 = 1
            r13.<init>(r15, r12)
            gp0 r12 = new gp0
            r15 = 3
            r12.<init>(r15)
            y30 r15 = new y30
            r15.<init>(r13, r14, r12)
            gp0 r12 = new gp0
            r13 = 4
            r12.<init>(r13)
            t52 r13 = new t52
            r13.<init>(r15, r12)
            gp0 r12 = new gp0
            r15 = 5
            r12.<init>(r15)
            y30 r15 = new y30
            r15.<init>(r13, r14, r12)
            x30 r12 = new x30
            r12.<init>(r15)
            boolean r13 = r12.hasNext()
            if (r13 != 0) goto L121
            r13 = 0
            goto L14a
        L121:
            java.lang.Object r13 = r12.next()
            boolean r15 = r12.hasNext()
            if (r15 != 0) goto L12c
            goto L14a
        L12c:
            r15 = r13
            java.lang.String r15 = (java.lang.String) r15
            int r15 = r15.length()
        L133:
            java.lang.Object r16 = r12.next()
            r17 = r16
            java.lang.String r17 = (java.lang.String) r17
            int r8 = r17.length()
            if (r15 >= r8) goto L144
            r15 = r8
            r13 = r16
        L144:
            boolean r8 = r12.hasNext()
            if (r8 != 0) goto L133
        L14a:
            r12 = r13
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L155
            boolean r8 = p000.q02.m4671(r12)
            if (r8 == 0) goto L226
        L155:
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r8 = r7.toLowerCase(r8)
            r8.getClass()
            java.lang.String r12 = "publish"
            boolean r12 = p000.q02.m4654(r8, r12, r3)
            if (r12 != 0) goto L224
            java.lang.String r12 = "create"
            boolean r12 = p000.q02.m4654(r8, r12, r3)
            if (r12 == 0) goto L170
            goto L224
        L170:
            java.lang.String r12 = "familiar"
            boolean r12 = p000.q02.m4654(r8, r12, r3)
            if (r12 != 0) goto L221
            java.lang.String r12 = "friend"
            boolean r12 = p000.q02.m4654(r8, r12, r3)
            if (r12 == 0) goto L182
            goto L221
        L182:
            java.lang.String r12 = "follow"
            boolean r12 = p000.q02.m4654(r8, r12, r3)
            if (r12 == 0) goto L18e
            java.lang.String r12 = "关注"
            goto L226
        L18e:
            java.lang.String r12 = "notification"
            boolean r12 = p000.q02.m4654(r8, r12, r3)
            if (r12 != 0) goto L21e
            java.lang.String r12 = "message"
            boolean r12 = p000.q02.m4654(r8, r12, r3)
            if (r12 == 0) goto L1a0
            goto L21e
        L1a0:
            java.lang.String r12 = "profile"
            boolean r12 = p000.q02.m4654(r8, r12, r3)
            if (r12 != 0) goto L21b
            java.lang.String r12 = "user"
            boolean r12 = p000.q02.m4654(r8, r12, r3)
            if (r12 != 0) goto L21b
            java.lang.String r12 = "mine"
            boolean r12 = p000.q02.m4654(r8, r12, r3)
            if (r12 == 0) goto L1b9
            goto L21b
        L1b9:
            java.lang.String r12 = "mall"
            boolean r12 = p000.q02.m4654(r8, r12, r3)
            if (r12 != 0) goto L218
            java.lang.String r12 = "shop"
            boolean r12 = p000.q02.m4654(r8, r12, r3)
            if (r12 == 0) goto L1ca
            goto L218
        L1ca:
            java.lang.String r12 = "nearby"
            boolean r12 = p000.q02.m4654(r8, r12, r3)
            if (r12 != 0) goto L215
            java.lang.String r12 = "city"
            boolean r12 = p000.q02.m4654(r8, r12, r3)
            if (r12 == 0) goto L1db
            goto L215
        L1db:
            java.lang.String r12 = "explore"
            boolean r12 = p000.q02.m4654(r8, r12, r3)
            if (r12 != 0) goto L212
            java.lang.String r12 = "discover"
            boolean r12 = p000.q02.m4654(r8, r12, r3)
            if (r12 == 0) goto L1ec
            goto L212
        L1ec:
            java.lang.String r12 = "home"
            boolean r12 = p000.q02.m4654(r8, r12, r3)
            if (r12 != 0) goto L20f
            java.lang.String r12 = "recommend"
            boolean r8 = p000.q02.m4654(r8, r12, r3)
            if (r8 == 0) goto L1fd
            goto L20f
        L1fd:
            r8 = 95
            java.lang.String r8 = p000.q02.m4687(r7, r8, r7)
            r12 = 46
            java.lang.String r8 = p000.q02.m4687(r8, r12, r8)
            r12 = 6
            java.lang.String r12 = p000.q02.m4693(r8, r12)
            goto L226
        L20f:
            java.lang.String r12 = "首页"
            goto L226
        L212:
            java.lang.String r12 = "探索"
            goto L226
        L215:
            java.lang.String r12 = "同城"
            goto L226
        L218:
            java.lang.String r12 = "商城"
            goto L226
        L21b:
            java.lang.String r12 = "我"
            goto L226
        L21e:
            java.lang.String r12 = "消息"
            goto L226
        L221:
            java.lang.String r12 = "朋友"
            goto L226
        L224:
            java.lang.String r12 = "发布"
        L226:
            java.lang.reflect.Method r8 = r0.f5578
            java.lang.Object r8 = r1.m2575(r9, r8)
            boolean r13 = r8 instanceof android.view.View
            if (r13 == 0) goto L233
            android.view.View r8 = (android.view.View) r8
            goto L234
        L233:
            r8 = 0
        L234:
            java.lang.reflect.Method r13 = r0.f5579
            java.lang.Object r13 = r1.m2575(r9, r13)
            boolean r15 = r13 instanceof android.view.View
            if (r15 == 0) goto L241
            android.view.View r13 = (android.view.View) r13
            goto L242
        L241:
            r13 = 0
        L242:
            android.view.View[] r8 = new android.view.View[]{r8, r13}
            java.util.ArrayList r8 = p000.AbstractC0312g7.m2248(r8)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r8 = r8.iterator()
        L253:
            boolean r15 = r8.hasNext()
            r3 = 0
            if (r15 == 0) goto L275
            java.lang.Object r15 = r8.next()
            r16 = r15
            android.view.View r16 = (android.view.View) r16
            int r17 = r16.getVisibility()
            if (r17 != 0) goto L273
            float r16 = r16.getAlpha()
            int r3 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r3 <= 0) goto L273
            r13.add(r15)
        L273:
            r3 = 0
            goto L253
        L275:
            f7 r8 = new f7
            r15 = 1
            r8.<init>(r15, r13)
            θ r15 = new θ
            r3 = 23
            r15.<init>(r3, r1)
            c40 r3 = new c40
            vs1 r14 = p000.vs1.f11382
            r3.<init>(r8, r15, r14)
            java.util.Iterator r3 = r3.iterator()
        L28d:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L2ba
            java.lang.Object r8 = r3.next()
            android.widget.TextView r8 = (android.widget.TextView) r8
            r8.getClass()
            java.lang.CharSequence r8 = r8.getText()
            if (r8 == 0) goto L2a7
            java.lang.String r8 = r8.toString()
            goto L2a8
        L2a7:
            r8 = 0
        L2a8:
            if (r8 != 0) goto L2ab
            r8 = r10
        L2ab:
            java.lang.CharSequence r8 = p000.q02.m4660(r8)
            java.lang.String r8 = r8.toString()
            boolean r14 = p000.q02.m4671(r8)
            if (r14 != 0) goto L28d
            goto L2bb
        L2ba:
            r8 = 0
        L2bb:
            boolean r3 = r13.isEmpty()
            java.lang.reflect.Method r0 = r0.f5577
            java.lang.Object r0 = r1.m2575(r9, r0)
            boolean r10 = r0 instanceof java.lang.Boolean
            if (r10 == 0) goto L2cc
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L2cd
        L2cc:
            r0 = 0
        L2cd:
            if (r0 == 0) goto L2d6
            boolean r0 = r0.booleanValue()
        L2d3:
            r10 = r0
            r13 = r8
            goto L2db
        L2d6:
            boolean r0 = r9.isSelected()
            goto L2d3
        L2db:
            st0 r8 = new st0
            if (r3 != 0) goto L2e9
            if (r13 == 0) goto L2e7
            boolean r0 = p000.q02.m4671(r13)
            if (r0 == 0) goto L2e9
        L2e7:
            r14 = 1
            goto L2ea
        L2e9:
            r14 = 0
        L2ea:
            java.lang.Object r0 = r1.f4860
            r3 = r0
            java.util.Map r3 = (java.util.Map) r3
            android.content.res.Resources r0 = r9.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r19 = 1065353216(0x3f800000, float:1.0)
            int r15 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r15 >= 0) goto L301
            r0 = r19
        L301:
            r15 = 1092616192(0x41200000, float:10.0)
            float r15 = r15 * r0
            r20 = 1116733440(0x42900000, float:72.0)
            float r0 = r0 * r20
            java.util.ArrayList r20 = m2548(r9)
            r21 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r20 = r20.iterator()
        L317:
            boolean r22 = r20.hasNext()
            if (r22 == 0) goto L348
            r22 = r6
            java.lang.Object r6 = r20.next()
            r23 = r6
            android.widget.ImageView r23 = (android.widget.ImageView) r23
            android.graphics.drawable.Drawable r24 = r23.getDrawable()
            if (r24 == 0) goto L343
            r24 = r8
            int r8 = r23.getVisibility()
            r23 = r11
            r11 = 8
            if (r8 == r11) goto L33c
            r4.add(r6)
        L33c:
            r6 = r22
            r11 = r23
            r8 = r24
            goto L317
        L343:
            r24 = r8
            r23 = r11
            goto L33c
        L348:
            r22 = r6
            r24 = r8
            r23 = r11
            java.util.Iterator r4 = r4.iterator()
            boolean r6 = r4.hasNext()
            if (r6 != 0) goto L35b
            r6 = 0
            goto L430
        L35b:
            java.lang.Object r6 = r4.next()
            boolean r8 = r4.hasNext()
            if (r8 != 0) goto L367
            goto L430
        L367:
            r8 = r6
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            int r11 = r8.getWidth()
            java.lang.Integer r20 = java.lang.Integer.valueOf(r11)
            if (r11 <= 0) goto L375
            goto L377
        L375:
            r20 = 0
        L377:
            if (r20 == 0) goto L37e
            int r11 = r20.intValue()
            goto L382
        L37e:
            int r11 = r8.getMeasuredWidth()
        L382:
            int r20 = r8.getHeight()
            java.lang.Integer r25 = java.lang.Integer.valueOf(r20)
            if (r20 <= 0) goto L38d
            goto L38f
        L38d:
            r25 = 0
        L38f:
            if (r25 == 0) goto L396
            int r8 = r25.intValue()
            goto L39a
        L396:
            int r8 = r8.getMeasuredHeight()
        L39a:
            int r15 = (int) r15
            int r0 = (int) r0
            if (r11 > r0) goto L3a7
            if (r15 > r11) goto L3a7
            if (r8 > r0) goto L3a7
            if (r15 > r8) goto L3a7
            r20 = 1
            goto L3a9
        L3a7:
            r20 = 0
        L3a9:
            int r25 = r11 - r8
            int r25 = java.lang.Math.abs(r25)
            r26 = 1000000(0xf4240, float:1.401298E-39)
            if (r20 == 0) goto L3b7
            r20 = r26
            goto L3b9
        L3b7:
            r20 = 0
        L3b9:
            int r11 = r11 * r8
            int r11 = r11 + r20
            int r25 = r25 * 10
            int r11 = r11 - r25
        L3c0:
            java.lang.Object r8 = r4.next()
            r20 = r8
            android.widget.ImageView r20 = (android.widget.ImageView) r20
            int r25 = r20.getWidth()
            java.lang.Integer r27 = java.lang.Integer.valueOf(r25)
            if (r25 <= 0) goto L3d3
            goto L3d5
        L3d3:
            r27 = 0
        L3d5:
            if (r27 == 0) goto L3e0
            int r25 = r27.intValue()
        L3db:
            r27 = r4
            r4 = r25
            goto L3e5
        L3e0:
            int r25 = r20.getMeasuredWidth()
            goto L3db
        L3e5:
            int r25 = r20.getHeight()
            java.lang.Integer r28 = java.lang.Integer.valueOf(r25)
            if (r25 <= 0) goto L3f0
            goto L3f2
        L3f0:
            r28 = 0
        L3f2:
            if (r28 == 0) goto L3fd
            int r20 = r28.intValue()
        L3f8:
            r25 = r6
            r6 = r20
            goto L402
        L3fd:
            int r20 = r20.getMeasuredHeight()
            goto L3f8
        L402:
            if (r4 > r0) goto L40d
            if (r15 > r4) goto L40d
            if (r6 > r0) goto L40d
            if (r15 > r6) goto L40d
            r20 = 1
            goto L40f
        L40d:
            r20 = 0
        L40f:
            int r28 = r4 - r6
            int r28 = java.lang.Math.abs(r28)
            if (r20 == 0) goto L41a
            r20 = r26
            goto L41c
        L41a:
            r20 = 0
        L41c:
            int r4 = r4 * r6
            int r4 = r4 + r20
            int r28 = r28 * 10
            int r4 = r4 - r28
            if (r11 >= r4) goto L428
            r11 = r4
            r6 = r8
            goto L42a
        L428:
            r6 = r25
        L42a:
            boolean r4 = r27.hasNext()
            if (r4 != 0) goto L694
        L430:
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            if (r6 == 0) goto L43a
            android.graphics.drawable.Drawable r0 = r6.getDrawable()
            r4 = r0
            goto L43b
        L43a:
            r4 = 0
        L43b:
            int r0 = java.lang.System.identityHashCode(r4)
            if (r4 == 0) goto L44c
            int[] r8 = r4.getState()
            if (r8 == 0) goto L44c
            int r8 = java.util.Arrays.hashCode(r8)
            goto L44d
        L44c:
            r8 = 0
        L44d:
            if (r6 == 0) goto L45a
            android.content.res.ColorStateList r6 = r6.getImageTintList()
            if (r6 == 0) goto L45a
            int r6 = r6.getDefaultColor()
            goto L45b
        L45a:
            r6 = 0
        L45b:
            int r11 = r9.getWidth()
            int r15 = r9.getHeight()
            if (r4 == 0) goto L472
            int r20 = r4.getLevel()
            r25 = r20
            r20 = r13
            r13 = r25
        L46f:
            r25 = r14
            goto L476
        L472:
            r20 = r13
            r13 = 0
            goto L46f
        L476:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r7)
            java.lang.String r7 = "|"
            r14.append(r7)
            r14.append(r12)
            r14.append(r7)
            r14.append(r10)
            r14.append(r7)
            r14.append(r11)
            java.lang.String r11 = "x"
            r14.append(r11)
            r14.append(r15)
            r14.append(r7)
            r14.append(r0)
            r14.append(r7)
            r14.append(r8)
            r14.append(r7)
            r14.append(r13)
            r14.append(r7)
            r14.append(r6)
            java.lang.String r6 = r14.toString()
            java.lang.Object r0 = r3.get(r9)
            it0 r0 = (p000.it0) r0
            r7 = 32
            if (r0 == 0) goto L4d1
            java.lang.String r8 = r0.f5181
            boolean r8 = r8.equals(r6)
            if (r8 == 0) goto L4c9
            goto L4ca
        L4c9:
            r0 = 0
        L4ca:
            if (r0 == 0) goto L4d1
            android.graphics.Bitmap r0 = r0.f5182
        L4ce:
            r15 = r0
            goto L5fe
        L4d1:
            android.content.res.Resources r0 = r9.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r8 = 1107296256(0x42000000, float:32.0)
            float r0 = r0 * r8
            int r0 = (int) r0
            r8 = 128(0x80, float:1.8E-43)
            int r0 = p000.j81.m2906(r0, r7, r8)
            if (r4 == 0) goto L580
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L505
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r0, r0, r8)     // Catch: java.lang.Throwable -> L505
            android.graphics.Canvas r11 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L505
            r11.<init>(r8)     // Catch: java.lang.Throwable -> L505
            int r13 = r4.getIntrinsicWidth()     // Catch: java.lang.Throwable -> L505
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L505
            if (r13 <= 0) goto L4fd
            goto L4fe
        L4fd:
            r14 = 0
        L4fe:
            if (r14 == 0) goto L507
            int r13 = r14.intValue()     // Catch: java.lang.Throwable -> L505
            goto L508
        L505:
            r0 = move-exception
            goto L558
        L507:
            r13 = r0
        L508:
            int r14 = r4.getIntrinsicHeight()     // Catch: java.lang.Throwable -> L505
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> L505
            if (r14 <= 0) goto L513
            goto L514
        L513:
            r15 = 0
        L514:
            if (r15 == 0) goto L51b
            int r14 = r15.intValue()     // Catch: java.lang.Throwable -> L505
            goto L51c
        L51b:
            r14 = r0
        L51c:
            float r15 = (float) r0     // Catch: java.lang.Throwable -> L505
            float r13 = (float) r13     // Catch: java.lang.Throwable -> L505
            float r7 = r15 / r13
            float r14 = (float) r14     // Catch: java.lang.Throwable -> L505
            float r15 = r15 / r14
            float r7 = java.lang.Math.min(r7, r15)     // Catch: java.lang.Throwable -> L505
            float r13 = r13 * r7
            int r13 = (int) r13     // Catch: java.lang.Throwable -> L505
            r15 = 1
            if (r13 >= r15) goto L52c
            r13 = r15
        L52c:
            float r14 = r14 * r7
            int r7 = (int) r14     // Catch: java.lang.Throwable -> L505
            if (r7 >= r15) goto L532
            r15 = 1
            goto L533
        L532:
            r15 = r7
        L533:
            int r7 = r0 - r13
            int r7 = r7 / 2
            int r0 = r0 - r15
            int r0 = r0 / 2
            android.graphics.Rect r14 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L505
            r16 = r8
            android.graphics.Rect r8 = r4.getBounds()     // Catch: java.lang.Throwable -> L505
            r14.<init>(r8)     // Catch: java.lang.Throwable -> L505
            int r13 = r13 + r7
            int r15 = r15 + r0
            r4.setBounds(r7, r0, r13, r15)     // Catch: java.lang.Throwable -> L553
            r4.draw(r11)     // Catch: java.lang.Throwable -> L553
            r4.setBounds(r14)     // Catch: java.lang.Throwable -> L505
            r8 = r16
            goto L55d
        L553:
            r0 = move-exception
            r4.setBounds(r14)     // Catch: java.lang.Throwable -> L505
            throw r0     // Catch: java.lang.Throwable -> L505
        L558:
            eo1 r8 = new eo1
            r8.<init>(r0)
        L55d:
            java.lang.Throwable r0 = p000.fo1.m2190(r8)
            if (r0 == 0) goto L576
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r7 = "drawable:"
            java.lang.String r4 = r7.concat(r4)
            java.lang.String r7 = "渲染宿主 Tab Drawable 失败"
            r1.m2550(r4, r7, r0)
        L576:
            boolean r0 = r8 instanceof p000.eo1
            if (r0 == 0) goto L57b
            r8 = 0
        L57b:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            r0 = r8
            goto L5f4
        L580:
            int r4 = r9.getWidth()
            if (r4 <= 0) goto L5f2
            int r4 = r9.getHeight()
            if (r4 > 0) goto L58d
            goto L5f2
        L58d:
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L5cb
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r0, r0, r4)     // Catch: java.lang.Throwable -> L5cb
            android.graphics.Canvas r7 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L5cb
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L5cb
            int r8 = r9.getHeight()     // Catch: java.lang.Throwable -> L5cb
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L5cb
            r11 = 1059984507(0x3f2e147b, float:0.68)
            float r8 = r8 * r11
            int r11 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r11 >= 0) goto L5a6
            goto L5a8
        L5a6:
            r19 = r8
        L5a8:
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L5cb
            int r8 = r9.getWidth()     // Catch: java.lang.Throwable -> L5cb
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L5cb
            float r8 = r0 / r8
            float r11 = r0 / r19
            float r8 = java.lang.Math.min(r8, r11)     // Catch: java.lang.Throwable -> L5cb
            int r11 = r9.getWidth()     // Catch: java.lang.Throwable -> L5cb
            float r11 = (float) r11     // Catch: java.lang.Throwable -> L5cb
            float r11 = r11 * r8
            float r0 = r0 - r11
            r11 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r11
            r14 = 0
            r7.translate(r0, r14)     // Catch: java.lang.Throwable -> L5cb
            r7.scale(r8, r8)     // Catch: java.lang.Throwable -> L5cb
            r9.draw(r7)     // Catch: java.lang.Throwable -> L5cb
            goto L5d1
        L5cb:
            r0 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r0)
        L5d1:
            java.lang.Throwable r0 = p000.fo1.m2190(r4)
            if (r0 == 0) goto L5ea
            java.lang.Class r7 = r9.getClass()
            java.lang.String r7 = r7.getName()
            java.lang.String r8 = "view_icon:"
            java.lang.String r7 = r8.concat(r7)
            java.lang.String r8 = "渲染宿主自绘 Tab 图标失败"
            r1.m2550(r7, r8, r0)
        L5ea:
            boolean r0 = r4 instanceof p000.eo1
            if (r0 == 0) goto L5ef
            r4 = 0
        L5ef:
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            goto L5f3
        L5f2:
            r4 = 0
        L5f3:
            r0 = r4
        L5f4:
            it0 r4 = new it0
            r4.<init>(r6, r0)
            r3.put(r9, r4)
            goto L4ce
        L5fe:
            r0 = r9
        L5ff:
            if (r0 == 0) goto L619
            if (r0 == r2) goto L619
            int r3 = r0.getVisibility()
            if (r3 == 0) goto L60c
        L609:
            r16 = 0
            goto L61d
        L60c:
            android.view.ViewParent r0 = r0.getParent()
            boolean r3 = r0 instanceof android.view.View
            if (r3 == 0) goto L617
            android.view.View r0 = (android.view.View) r0
            goto L5ff
        L617:
            r0 = 0
            goto L5ff
        L619:
            if (r0 != r2) goto L609
            r16 = 1
        L61d:
            java.util.ArrayList r0 = m2549(r9)
            java.util.Iterator r0 = r0.iterator()
        L625:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L645
            java.lang.Object r3 = r0.next()
            r4 = r3
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.CharSequence r4 = r4.getText()
            if (r4 == 0) goto L643
            boolean r4 = p000.q02.m4671(r4)
            r8 = 1
            r4 = r4 ^ r8
            if (r4 != r8) goto L625
            r18 = r3
            goto L648
        L643:
            r8 = 1
            goto L625
        L645:
            r8 = 1
            r18 = 0
        L648:
            android.widget.TextView r18 = (android.widget.TextView) r18
            if (r18 == 0) goto L672
            int r0 = r18.getCurrentTextColor()
            float r0 = android.graphics.Color.luminance(r0)
            r3 = 1057803469(0x3f0ccccd, float:0.55)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L668
        L65b:
            r17 = r8
            r11 = r12
            r13 = r20
            r8 = r24
            r14 = r25
        L664:
            r12 = r10
            r10 = r23
            goto L683
        L668:
            r11 = r12
            r13 = r20
            r8 = r24
            r14 = r25
            r17 = 0
            goto L664
        L672:
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r3 = 32
            if (r0 != r3) goto L668
            goto L65b
        L683:
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r24 = r8
        L688:
            if (r8 == 0) goto L68d
            r5.add(r8)
        L68d:
            r4 = r21
            r6 = r22
            r3 = 0
            goto L36
        L694:
            r25 = r14
            r4 = r27
            goto L3c0
        L69a:
            return r5
    }

    @Override // p000.n72
    /* JADX INFO: renamed from: θ */
    public p000.AbstractC0100c4 mo2561(long r15, p000.AbstractC0100c4 r17, p000.AbstractC0100c4 r18, p000.AbstractC0100c4 r19) {
            r14 = this;
            java.lang.Object r0 = r14.f4858
            c4 r0 = (p000.AbstractC0100c4) r0
            if (r0 != 0) goto Lc
            c4 r0 = r17.mo29()
            r14.f4858 = r0
        Lc:
            java.lang.Object r0 = r14.f4858
            c4 r0 = (p000.AbstractC0100c4) r0
            r1 = 0
            java.lang.String r2 = "valueVector"
            if (r0 == 0) goto L62
            int r0 = r0.mo28()
            r3 = 0
        L1a:
            java.lang.Object r4 = r14.f4858
            c4 r4 = (p000.AbstractC0100c4) r4
            if (r3 >= r0) goto L5b
            if (r4 == 0) goto L57
            java.lang.Object r5 = r14.f4857
            d4 r5 = (p000.InterfaceC0199d4) r5
            e40 r5 = r5.get(r3)
            r6 = r17
            float r7 = r6.mo27(r3)
            r8 = r18
            float r9 = r8.mo27(r3)
            r10 = r19
            float r11 = r10.mo27(r3)
            r12 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r15 / r12
            oz1 r5 = r5.f3404
            r5.f8361 = r9
            long r11 = r5.m4338(r7, r11, r12)
            r5 = 32
            long r11 = r11 >> r5
            int r5 = (int) r11
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r4.mo31(r3, r5)
            int r3 = r3 + 1
            goto L1a
        L57:
            p000.ln0.m3650(r2)
            throw r1
        L5b:
            if (r4 == 0) goto L5e
            return r4
        L5e:
            p000.ln0.m3650(r2)
            throw r1
        L62:
            p000.ln0.m3650(r2)
            throw r1
    }

    @Override // p000.n72
    /* JADX INFO: renamed from: ι */
    public p000.AbstractC0100c4 mo2562(p000.AbstractC0100c4 r7, p000.AbstractC0100c4 r8, p000.AbstractC0100c4 r9) {
            r6 = this;
            java.lang.Object r0 = r6.f4860
            c4 r0 = (p000.AbstractC0100c4) r0
            if (r0 != 0) goto Lc
            c4 r0 = r9.mo29()
            r6.f4860 = r0
        Lc:
            java.lang.Object r0 = r6.f4860
            c4 r0 = (p000.AbstractC0100c4) r0
            r1 = 0
            java.lang.String r2 = "endVelocityVector"
            if (r0 == 0) goto L48
            int r0 = r0.mo28()
            r3 = 0
        L1a:
            java.lang.Object r4 = r6.f4860
            c4 r4 = (p000.AbstractC0100c4) r4
            if (r3 >= r0) goto L41
            if (r4 == 0) goto L3d
            java.lang.Object r5 = r6.f4857
            d4 r5 = (p000.InterfaceC0199d4) r5
            e40 r5 = r5.get(r3)
            r7.getClass()
            r8.getClass()
            r9.getClass()
            r5.getClass()
            r5 = 0
            r4.mo31(r3, r5)
            int r3 = r3 + 1
            goto L1a
        L3d:
            p000.ln0.m3650(r2)
            throw r1
        L41:
            if (r4 == 0) goto L44
            return r4
        L44:
            p000.ln0.m3650(r2)
            throw r1
        L48:
            p000.ln0.m3650(r2)
            throw r1
    }

    @Override // p000.n72
    /* JADX INFO: renamed from: κ */
    public long mo2563(p000.AbstractC0100c4 r42, p000.AbstractC0100c4 r43, p000.AbstractC0100c4 r44) {
            r41 = this;
            int r0 = r42.mo28()
            r4 = 0
            r5 = 0
        L7:
            if (r4 >= r0) goto L29c
            r7 = r41
            java.lang.Object r8 = r7.f4857
            d4 r8 = (p000.InterfaceC0199d4) r8
            e40 r8 = r8.get(r4)
            r9 = r42
            float r10 = r9.mo27(r4)
            r11 = r43
            float r12 = r11.mo27(r4)
            r13 = r44
            float r14 = r13.mo27(r4)
            oz1 r15 = r8.f3404
            double r1 = r15.f8362
            double r1 = r1 * r1
            float r1 = (float) r1
            float r2 = r15.f8363
            float r10 = r10 - r12
            float r8 = r8.f3403
            float r10 = r10 / r8
            float r14 = r14 / r8
            r8 = 0
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 != 0) goto L43
            r1 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            r16 = r0
            r12 = r4
            r37 = r5
            goto L28c
        L43:
            r12 = r4
            double r3 = (double) r1
            double r1 = (double) r2
            double r14 = (double) r14
            double r8 = (double) r10
            r10 = 1065353216(0x3f800000, float:1.0)
            r16 = r0
            r17 = r1
            double r0 = (double) r10
            r19 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r21 = r17 * r19
            double r23 = java.lang.Math.sqrt(r3)
            r25 = r3
            double r2 = r23 * r21
            double r21 = r2 * r2
            r23 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r23 = r23 * r25
            double r21 = r21 - r23
            r23 = 0
            int r4 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r4 >= 0) goto L6c
            r25 = r23
            goto L70
        L6c:
            double r25 = java.lang.Math.sqrt(r21)
        L70:
            if (r4 >= 0) goto L7b
            double r21 = java.lang.Math.abs(r21)
            double r21 = java.lang.Math.sqrt(r21)
            goto L7d
        L7b:
            r21 = r23
        L7d:
            double r2 = -r2
            double r27 = r2 + r25
            r29 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r27 = r27 * r29
            double r21 = r21 * r29
            double r2 = r2 - r25
            double r2 = r2 * r29
            int r4 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r4 != 0) goto L98
            int r10 = (r14 > r23 ? 1 : (r14 == r23 ? 0 : -1))
            if (r10 != 0) goto L98
            r37 = r5
            r1 = 0
            goto L28c
        L98:
            if (r4 >= 0) goto L9b
            double r14 = -r14
        L9b:
            double r8 = java.lang.Math.abs(r8)
            r25 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r17 > r25 ? 1 : (r17 == r25 ? 0 : -1))
            r29 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            r31 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r33 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            r35 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r4 <= 0) goto L1a8
            double r17 = r27 * r8
            double r17 = r17 - r14
            double r14 = r27 - r2
            double r10 = r17 / r14
            double r8 = r8 - r10
            double r17 = r0 / r8
            double r17 = java.lang.Math.abs(r17)
            double r17 = java.lang.Math.log(r17)
            r37 = r5
            double r4 = r17 / r27
            double r17 = r0 / r10
            double r17 = java.lang.Math.abs(r17)
            double r17 = java.lang.Math.log(r17)
            double r6 = r17 / r2
            long r17 = java.lang.Double.doubleToRawLongBits(r4)
            long r17 = r17 & r35
            int r17 = (r17 > r33 ? 1 : (r17 == r33 ? 0 : -1))
            if (r17 >= 0) goto Lf2
            long r17 = java.lang.Double.doubleToRawLongBits(r6)
            long r17 = r17 & r35
            int r17 = (r17 > r33 ? 1 : (r17 == r33 ? 0 : -1))
            if (r17 >= 0) goto Lf3
            double r4 = java.lang.Math.max(r4, r6)
            goto Lf3
        Lf2:
            r4 = r6
        Lf3:
            double r6 = r8 * r27
            r39 = r2
            double r2 = -r10
            double r2 = r2 * r39
            double r2 = r6 / r2
            double r2 = java.lang.Math.log(r2)
            double r17 = r39 - r27
            double r2 = r2 / r17
            boolean r17 = java.lang.Double.isNaN(r2)
            if (r17 != 0) goto L147
            int r17 = (r2 > r23 ? 1 : (r2 == r23 ? 0 : -1))
            if (r17 > 0) goto L10f
            goto L147
        L10f:
            int r17 = (r2 > r23 ? 1 : (r2 == r23 ? 0 : -1))
            if (r17 <= 0) goto L138
            double r17 = r27 * r2
            double r17 = java.lang.Math.exp(r17)
            double r17 = r17 * r8
            double r2 = r2 * r39
            double r2 = java.lang.Math.exp(r2)
            double r2 = r2 * r10
            double r2 = r2 + r17
            double r2 = -r2
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L138
            int r2 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r2 <= 0) goto L132
            int r2 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r2 >= 0) goto L132
            goto L134
        L132:
            r23 = r4
        L134:
            double r0 = -r0
            r4 = r23
            goto L148
        L138:
            double r2 = r10 * r39
            double r2 = r2 * r39
            double r2 = -r2
            double r4 = r6 * r27
            double r2 = r2 / r4
            double r2 = java.lang.Math.log(r2)
            double r4 = r2 / r14
            goto L148
        L147:
            double r0 = -r0
        L148:
            double r2 = r27 * r4
            double r2 = java.lang.Math.exp(r2)
            double r2 = r2 * r6
            double r14 = r10 * r39
            double r17 = r39 * r4
            double r17 = java.lang.Math.exp(r17)
            double r17 = r17 * r14
            double r17 = r17 + r2
            double r2 = java.lang.Math.abs(r17)
            r17 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r2 >= 0) goto L16a
            goto L285
        L16a:
            r2 = r4
            r5 = 0
        L16c:
            int r4 = (r31 > r29 ? 1 : (r31 == r29 ? 0 : -1))
            if (r4 <= 0) goto L1a5
            r4 = 100
            if (r5 >= r4) goto L1a5
            int r5 = r5 + 1
            double r17 = r27 * r2
            double r19 = java.lang.Math.exp(r17)
            double r19 = r19 * r8
            double r21 = r39 * r2
            double r23 = java.lang.Math.exp(r21)
            double r23 = r23 * r10
            double r23 = r23 + r19
            double r23 = r23 + r0
            double r17 = java.lang.Math.exp(r17)
            double r17 = r17 * r6
            double r19 = java.lang.Math.exp(r21)
            double r19 = r19 * r14
            double r19 = r19 + r17
            double r23 = r23 / r19
            double r17 = r2 - r23
            double r2 = r2 - r17
            double r31 = java.lang.Math.abs(r2)
            r2 = r17
            goto L16c
        L1a5:
            r4 = r2
            goto L285
        L1a8:
            r37 = r5
            int r2 = (r17 > r25 ? 1 : (r17 == r25 ? 0 : -1))
            if (r2 >= 0) goto L1c3
            double r2 = r27 * r8
            double r14 = r14 - r2
            double r14 = r14 / r21
            double r8 = r8 * r8
            double r14 = r14 * r14
            double r14 = r14 + r8
            double r2 = java.lang.Math.sqrt(r14)
            double r0 = r0 / r2
            double r0 = java.lang.Math.log(r0)
            double r4 = r0 / r27
            goto L285
        L1c3:
            double r2 = r27 * r8
            double r14 = r14 - r2
            double r5 = r0 / r8
            double r5 = java.lang.Math.abs(r5)
            double r5 = java.lang.Math.log(r5)
            double r5 = r5 / r27
            double r10 = r0 / r14
            double r10 = java.lang.Math.abs(r10)
            double r10 = java.lang.Math.log(r10)
            r17 = r10
            r7 = 0
        L1df:
            r4 = 6
            if (r7 >= r4) goto L1f1
            double r17 = r17 / r27
            double r17 = java.lang.Math.abs(r17)
            double r17 = java.lang.Math.log(r17)
            double r17 = r10 - r17
            int r7 = r7 + 1
            goto L1df
        L1f1:
            double r10 = r17 / r27
            long r17 = java.lang.Double.doubleToRawLongBits(r5)
            long r17 = r17 & r35
            int r4 = (r17 > r33 ? 1 : (r17 == r33 ? 0 : -1))
            if (r4 >= 0) goto L20c
            long r17 = java.lang.Double.doubleToRawLongBits(r10)
            long r17 = r17 & r35
            int r4 = (r17 > r33 ? 1 : (r17 == r33 ? 0 : -1))
            if (r4 >= 0) goto L20d
            double r5 = java.lang.Math.max(r5, r10)
            goto L20d
        L20c:
            r5 = r10
        L20d:
            double r10 = r2 + r14
            double r10 = -r10
            double r17 = r27 * r14
            double r10 = r10 / r17
            double r17 = r27 * r10
            double r25 = java.lang.Math.exp(r17)
            double r25 = r25 * r8
            double r33 = r14 * r10
            double r17 = java.lang.Math.exp(r17)
            double r17 = r17 * r33
            r33 = r2
            double r2 = r17 + r25
            boolean r4 = java.lang.Double.isNaN(r10)
            if (r4 != 0) goto L253
            int r4 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r4 > 0) goto L233
            goto L253
        L233:
            int r4 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r4 <= 0) goto L24b
            double r2 = -r2
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L24b
            int r2 = (r14 > r23 ? 1 : (r14 == r23 ? 0 : -1))
            if (r2 >= 0) goto L245
            int r2 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r2 <= 0) goto L245
            goto L247
        L245:
            r23 = r5
        L247:
            double r0 = -r0
            r5 = r23
            goto L254
        L24b:
            double r2 = r19 / r27
            double r2 = -r2
            double r4 = r8 / r14
            double r5 = r2 - r4
            goto L254
        L253:
            double r0 = -r0
        L254:
            r4 = r5
            r2 = 0
        L256:
            int r3 = (r31 > r29 ? 1 : (r31 == r29 ? 0 : -1))
            if (r3 <= 0) goto L285
            r6 = 100
            if (r2 >= r6) goto L285
            int r2 = r2 + 1
            double r10 = r14 * r4
            double r10 = r10 + r8
            double r17 = r27 * r4
            double r19 = java.lang.Math.exp(r17)
            double r19 = r19 * r10
            double r19 = r19 + r0
            r3 = 1
            double r10 = (double) r3
            double r10 = r17 + r10
            double r10 = r10 * r14
            double r10 = r10 + r33
            double r17 = java.lang.Math.exp(r17)
            double r17 = r17 * r10
            double r19 = r19 / r17
            double r10 = r4 - r19
            double r4 = r4 - r10
            double r31 = java.lang.Math.abs(r4)
            r4 = r10
            goto L256
        L285:
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r4 = r4 * r0
            long r1 = (long) r4
        L28c:
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 * r3
            r3 = r37
            long r5 = java.lang.Math.max(r3, r1)
            int r4 = r12 + 1
            r0 = r16
            goto L7
        L29c:
            r3 = r5
            return r3
    }

    @Override // p000.lx1
    /* JADX INFO: renamed from: λ */
    public p000.iw1 mo2564() {
            r0 = this;
            java.lang.Object r0 = r0.f4860
            kr r0 = (p000.C0485kr) r0
            return r0
    }

    /* JADX INFO: renamed from: ξ */
    public synchronized java.util.concurrent.ExecutorService m2565() {
            r9 = this;
            monitor-enter(r9)
            java.lang.Object r0 = r9.f4857     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.ThreadPoolExecutor r0 = (java.util.concurrent.ThreadPoolExecutor) r0     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L37
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.SynchronousQueue r7 = new java.util.concurrent.SynchronousQueue     // Catch: java.lang.Throwable -> L35
            r7.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r0.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = p000.ud2.f10710     // Catch: java.lang.Throwable -> L35
            r0.append(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = " Dispatcher"
            r0.append(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L35
            td2 r8 = new td2     // Catch: java.lang.Throwable -> L35
            r2 = 0
            r8.<init>(r0, r2)     // Catch: java.lang.Throwable -> L35
            r2 = 0
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 60
            r1.<init>(r2, r3, r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L35
            r9.f4857 = r1     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r0 = move-exception
            goto L40
        L37:
            java.lang.Object r0 = r9.f4857     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.ThreadPoolExecutor r0 = (java.util.concurrent.ThreadPoolExecutor) r0     // Catch: java.lang.Throwable -> L35
            r0.getClass()     // Catch: java.lang.Throwable -> L35
            monitor-exit(r9)
            return r0
        L40:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L35
            throw r0
    }

    /* JADX INFO: renamed from: ο */
    public p000.n60 m2566(java.lang.String r1) {
            r0 = this;
            java.lang.Object r0 = r0.f4858
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r1)
            i70 r0 = (p000.i70) r0
            if (r0 == 0) goto Lf
            n60 r0 = r0.f4942
            return r0
        Lf:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: π */
    public p000.n60 m2567(java.lang.String r3) {
            r2 = this;
            java.lang.Object r2 = r2.f4858
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r2.next()
            i70 r0 = (p000.i70) r0
            if (r0 == 0) goto Lc
            n60 r0 = r0.f4942
            java.lang.String r1 = r0.f7426
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L25
            goto L2d
        L25:
            b70 r0 = r0.f7441
            i0 r0 = r0.f1520
            n60 r0 = r0.m2567(r3)
        L2d:
            if (r0 == 0) goto Lc
            return r0
        L30:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ρ */
    public java.lang.reflect.Method m2568(java.lang.Class r7, java.lang.String r8) {
            r6 = this;
            r0 = 0
            java.lang.reflect.Method[] r1 = r7.getMethods()     // Catch: java.lang.Throwable -> L23
            r1.getClass()     // Catch: java.lang.Throwable -> L23
            int r2 = r1.length     // Catch: java.lang.Throwable -> L23
            r3 = 0
        La:
            if (r3 >= r2) goto L28
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L23
            java.lang.String r5 = r4.getName()     // Catch: java.lang.Throwable -> L23
            boolean r5 = p000.ln0.m3626(r5, r8)     // Catch: java.lang.Throwable -> L23
            if (r5 == 0) goto L25
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L23
            r5.getClass()     // Catch: java.lang.Throwable -> L23
            int r5 = r5.length     // Catch: java.lang.Throwable -> L23
            if (r5 != 0) goto L25
            goto L29
        L23:
            r1 = move-exception
            goto L32
        L25:
            int r3 = r3 + 1
            goto La
        L28:
            r4 = r0
        L29:
            if (r4 == 0) goto L30
            r1 = 1
            r4.setAccessible(r1)     // Catch: java.lang.Throwable -> L23
            goto L37
        L30:
            r4 = r0
            goto L37
        L32:
            eo1 r4 = new eo1
            r4.<init>(r1)
        L37:
            java.lang.Throwable r1 = p000.fo1.m2190(r4)
            if (r1 == 0) goto L4e
            java.lang.String r7 = r7.getName()
            java.lang.String r2 = "method:"
            java.lang.String r3 = ":"
            java.lang.String r7 = p000.a12.m18(r2, r7, r3, r8)
            java.lang.String r8 = "解析宿主 Tab 方法失败"
            r6.m2550(r7, r8, r1)
        L4e:
            boolean r6 = r4 instanceof p000.eo1
            if (r6 == 0) goto L53
            goto L54
        L53:
            r0 = r4
        L54:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            return r0
    }

    /* JADX INFO: renamed from: σ */
    public void m2569(p000.uk1 r6) {
            r5 = this;
            java.util.TimeZone r0 = p000.ud2.f10709
            java.util.concurrent.ExecutorService r0 = r5.m2565()
            java.util.concurrent.ThreadPoolExecutor r0 = (java.util.concurrent.ThreadPoolExecutor) r0
            boolean r0 = r0.isShutdown()
            monitor-enter(r5)
            java.lang.Object r1 = r5.f4860     // Catch: java.lang.Throwable -> L24
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> L24
            boolean r6 = r1.remove(r6)     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L9f
            if (r0 != 0) goto L27
            java.lang.Object r6 = r5.f4859     // Catch: java.lang.Throwable -> L24
            java.util.ArrayDeque r6 = (java.util.ArrayDeque) r6     // Catch: java.lang.Throwable -> L24
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L2f
            goto L27
        L24:
            r6 = move-exception
            goto La7
        L27:
            java.lang.Object r6 = r5.f4860     // Catch: java.lang.Throwable -> L24
            java.util.ArrayDeque r6 = (java.util.ArrayDeque) r6     // Catch: java.lang.Throwable -> L24
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L24
        L2f:
            r6 = 13
            r1 = 0
            if (r0 == 0) goto L49
            java.lang.Object r2 = r5.f4858     // Catch: java.lang.Throwable -> L24
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2     // Catch: java.lang.Throwable -> L24
            java.util.List r2 = p000.AbstractC0984xh.m6666(r2)     // Catch: java.lang.Throwable -> L24
            java.lang.Object r3 = r5.f4858     // Catch: java.lang.Throwable -> L24
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L24
            r3.clear()     // Catch: java.lang.Throwable -> L24
            n r3 = new n     // Catch: java.lang.Throwable -> L24
            r3.<init>(r6, r2)     // Catch: java.lang.Throwable -> L24
            goto L7e
        L49:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L24
            r2.<init>()     // Catch: java.lang.Throwable -> L24
            java.lang.Object r3 = r5.f4858     // Catch: java.lang.Throwable -> L24
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L24
            r3.getClass()     // Catch: java.lang.Throwable -> L24
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L79
            java.lang.Object r3 = r3.next()     // Catch: java.lang.Throwable -> L24
            if (r3 != 0) goto L73
            java.lang.Object r3 = r5.f4859     // Catch: java.lang.Throwable -> L24
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L24
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L24
            r4 = 64
            if (r3 < r4) goto L72
            goto L79
        L72:
            throw r1     // Catch: java.lang.Throwable -> L24
        L73:
            java.lang.ClassCastException r6 = new java.lang.ClassCastException     // Catch: java.lang.Throwable -> L24
            r6.<init>()     // Catch: java.lang.Throwable -> L24
            throw r6     // Catch: java.lang.Throwable -> L24
        L79:
            n r3 = new n     // Catch: java.lang.Throwable -> L24
            r3.<init>(r6, r2)     // Catch: java.lang.Throwable -> L24
        L7e:
            monitor-exit(r5)
            java.lang.Object r6 = r3.f7336
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            if (r6 <= 0) goto L9e
            java.lang.Object r6 = r3.f7336
            java.util.List r6 = (java.util.List) r6
            r2 = 0
            java.lang.Object r6 = r6.get(r2)
            if (r6 != 0) goto L9b
            if (r0 == 0) goto L97
            throw r1
        L97:
            r5.m2565()
            throw r1
        L9b:
            p000.C1080.m7264()
        L9e:
            return
        L9f:
            java.lang.String r6 = "Call wasn't in-flight!"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L24
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L24
            throw r0     // Catch: java.lang.Throwable -> L24
        La7:
            monitor-exit(r5)
            throw r6
    }

    /* JADX INFO: renamed from: τ */
    public p000.p12 m2570(p000.AbstractC1153 r6) {
            r5 = this;
            java.lang.Object r0 = r5.f4859
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            r2 = 0
        L9:
            if (r2 >= r1) goto L1b
            java.lang.Object r3 = r0.get(r2)
            p12 r3 = (p000.p12) r3
            if (r3 == 0) goto L18
            ｗ r4 = r3.f8394
            if (r4 != r6) goto L18
            return r3
        L18:
            int r2 = r2 + 1
            goto L9
        L1b:
            p12 r1 = new p12
            java.lang.Object r5 = r5.f4858
            android.content.Context r5 = (android.content.Context) r5
            r1.<init>(r5, r6)
            r0.add(r1)
            return r1
    }

    /* JADX INFO: renamed from: υ */
    public java.util.ArrayList m2571() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r2 = r2.f4858
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L11:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r2.next()
            i70 r1 = (p000.i70) r1
            if (r1 == 0) goto L11
            r0.add(r1)
            goto L11
        L23:
            return r0
    }

    /* JADX INFO: renamed from: φ */
    public java.util.ArrayList m2572() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r2 = r2.f4858
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L11:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r2.next()
            i70 r1 = (p000.i70) r1
            if (r1 == 0) goto L25
            n60 r1 = r1.f4942
            r0.add(r1)
            goto L11
        L25:
            r1 = 0
            r0.add(r1)
            goto L11
        L2a:
            return r0
    }

    /* JADX INFO: renamed from: χ */
    public java.util.List m2573() {
            r2 = this;
            java.lang.Object r0 = r2.f4857
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            return r2
        Ld:
            java.lang.Object r0 = r2.f4857
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r2 = r2.f4857     // Catch: java.lang.Throwable -> L1d
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return r1
        L1d:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r2
    }

    /* JADX INFO: renamed from: ψ */
    public p000.m92 m2574(p000.C0945wf r5, java.lang.String r6) {
            r4 = this;
            java.lang.Object r0 = r4.f4860
            zz1 r0 = (p000.zz1) r0
            monitor-enter(r0)
            java.lang.Object r1 = r4.f4857     // Catch: java.lang.Throwable -> L4f
            q92 r1 = (p000.q92) r1     // Catch: java.lang.Throwable -> L4f
            r1.getClass()     // Catch: java.lang.Throwable -> L4f
            java.util.LinkedHashMap r1 = r1.f8929     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L4f
            m92 r1 = (p000.m92) r1     // Catch: java.lang.Throwable -> L4f
            java.lang.Class r2 = r5.f11701     // Catch: java.lang.Throwable -> L4f
            r2.getClass()     // Catch: java.lang.Throwable -> L4f
            java.util.Map r3 = p000.C0945wf.f11700     // Catch: java.lang.Throwable -> L4f
            r3.getClass()     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L4f
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L2f
            int r2 = r3.intValue()     // Catch: java.lang.Throwable -> L4f
            boolean r2 = p000.h62.m2430(r2, r1)     // Catch: java.lang.Throwable -> L4f
            goto L41
        L2f:
            boolean r3 = r2.isPrimitive()     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L3d
            wf r2 = p000.vm1.m6272(r2)     // Catch: java.lang.Throwable -> L4f
            java.lang.Class r2 = p000.ln0.m3605(r2)     // Catch: java.lang.Throwable -> L4f
        L3d:
            boolean r2 = r2.isInstance(r1)     // Catch: java.lang.Throwable -> L4f
        L41:
            if (r2 == 0) goto L55
            java.lang.Object r4 = r4.f4858     // Catch: java.lang.Throwable -> L4f
            p92 r4 = (p000.p92) r4     // Catch: java.lang.Throwable -> L4f
            boolean r4 = r4 instanceof p000.lq1     // Catch: java.lang.Throwable -> L4f
            if (r4 == 0) goto L51
            r1.getClass()     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r4 = move-exception
            goto L9a
        L51:
            r1.getClass()     // Catch: java.lang.Throwable -> L4f
            goto L98
        L55:
            k11 r1 = new k11     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r2 = r4.f4859     // Catch: java.lang.Throwable -> L4f
            hq r2 = (p000.AbstractC0368hq) r2     // Catch: java.lang.Throwable -> L4f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4f
            zz1 r2 = p000.AbstractC0978xb.f12113     // Catch: java.lang.Throwable -> L4f
            java.util.LinkedHashMap r3 = r1.f4786     // Catch: java.lang.Throwable -> L4f
            r3.put(r2, r6)     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r2 = r4.f4858     // Catch: java.lang.Throwable -> L4f
            p92 r2 = (p000.p92) r2     // Catch: java.lang.Throwable -> L4f
            m92 r5 = r2.mo1613(r5, r1)     // Catch: java.lang.Throwable -> L4f java.lang.AbstractMethodError -> L6f
        L6d:
            r1 = r5
            goto L81
        L6f:
            java.lang.Class r3 = p000.ln0.m3604(r5)     // Catch: java.lang.Throwable -> L4f java.lang.AbstractMethodError -> L78
            m92 r5 = r2.mo4439(r3, r1)     // Catch: java.lang.Throwable -> L4f java.lang.AbstractMethodError -> L78
            goto L6d
        L78:
            java.lang.Class r5 = p000.ln0.m3604(r5)     // Catch: java.lang.Throwable -> L4f
            m92 r5 = r2.mo1670(r5)     // Catch: java.lang.Throwable -> L4f
            goto L6d
        L81:
            java.lang.Object r4 = r4.f4857     // Catch: java.lang.Throwable -> L4f
            q92 r4 = (p000.q92) r4     // Catch: java.lang.Throwable -> L4f
            r4.getClass()     // Catch: java.lang.Throwable -> L4f
            r1.getClass()     // Catch: java.lang.Throwable -> L4f
            java.util.LinkedHashMap r4 = r4.f8929     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r4 = r4.put(r6, r1)     // Catch: java.lang.Throwable -> L4f
            m92 r4 = (p000.m92) r4     // Catch: java.lang.Throwable -> L4f
            if (r4 == 0) goto L98
            r4.m3800()     // Catch: java.lang.Throwable -> L4f
        L98:
            monitor-exit(r0)
            return r1
        L9a:
            monitor-exit(r0)
            throw r4
    }

    /* JADX INFO: renamed from: ω */
    public java.lang.Object m2575(android.view.View r6, java.lang.reflect.Method r7) {
            r5 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.Object r1 = r7.invoke(r6, r0)     // Catch: java.lang.Throwable -> L9
            goto L10
        L9:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L10:
            java.lang.Throwable r2 = p000.fo1.m2190(r1)
            if (r2 == 0) goto L2f
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = r7.getName()
            java.lang.String r3 = "invoke:"
            java.lang.String r4 = ":"
            java.lang.String r6 = p000.a12.m18(r3, r6, r4, r7)
            java.lang.String r7 = "调用宿主 Tab getter 失败"
            r5.m2550(r6, r7, r2)
        L2f:
            boolean r5 = r1 instanceof p000.eo1
            if (r5 == 0) goto L34
            goto L35
        L34:
            r0 = r1
        L35:
            return r0
    }
}
