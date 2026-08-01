package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class jr0 {

    /* JADX INFO: renamed from: α */
    public final boolean f5556;

    /* JADX INFO: renamed from: β */
    public p000.k00 f5557;

    /* JADX INFO: renamed from: γ */
    public p000.cr0 f5558;

    /* JADX INFO: renamed from: δ */
    public final java.lang.ref.WeakReference f5559;

    /* JADX INFO: renamed from: ε */
    public int f5560;

    /* JADX INFO: renamed from: ζ */
    public boolean f5561;

    /* JADX INFO: renamed from: η */
    public boolean f5562;

    /* JADX INFO: renamed from: θ */
    public final java.util.ArrayList f5563;

    /* JADX INFO: renamed from: ι */
    public final p000.f02 f5564;

    public jr0(p000.hr0 r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>(r0)
            r0 = 1
            r2.f5556 = r0
            k00 r0 = new k00
            r0.<init>()
            r2.f5557 = r0
            cr0 r0 = p000.cr0.f2725
            r2.f5558 = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.f5563 = r1
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r2.f5559 = r1
            f02 r3 = p000.ln0.m3621(r0)
            r2.f5564 = r3
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m2980(p000.gr0 r10) {
            r9 = this;
            r10.getClass()
            java.lang.String r0 = "addObserver"
            r9.m2982(r0)
            cr0 r0 = r9.f5558
            cr0 r1 = p000.cr0.f2724
            if (r0 != r1) goto Lf
            goto L11
        Lf:
            cr0 r1 = p000.cr0.f2725
        L11:
            ir0 r0 = new ir0
            r0.<init>()
            java.util.HashMap r2 = p000.nr0.f7709
            boolean r2 = r10 instanceof p000.fr0
            boolean r3 = r10 instanceof p000.InterfaceC0332gr
            r4 = 2
            r5 = 0
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L30
            if (r3 == 0) goto L30
            ir r2 = new ir
            r3 = r10
            gr r3 = (p000.InterfaceC0332gr) r3
            r8 = r10
            fr0 r8 = (p000.fr0) r8
            r2.<init>(r3, r8)
            goto L83
        L30:
            if (r3 == 0) goto L3b
            ir r2 = new ir
            r3 = r10
            gr r3 = (p000.InterfaceC0332gr) r3
            r2.<init>(r3, r5)
            goto L83
        L3b:
            if (r2 == 0) goto L41
            r2 = r10
            fr0 r2 = (p000.fr0) r2
            goto L83
        L41:
            java.lang.Class r2 = r10.getClass()
            int r3 = p000.nr0.m4089(r2)
            if (r3 != r4) goto L7e
            java.util.HashMap r3 = p000.nr0.f7710
            java.lang.Object r2 = r3.get(r2)
            r2.getClass()
            java.util.List r2 = (java.util.List) r2
            int r3 = r2.size()
            if (r3 == r7) goto L74
            int r3 = r2.size()
            e90[] r8 = new p000.e90[r3]
            if (r3 > 0) goto L6a
            ll1 r2 = new ll1
            r2.<init>(r7, r8)
            goto L83
        L6a:
            java.lang.Object r9 = r2.get(r6)
            java.lang.reflect.Constructor r9 = (java.lang.reflect.Constructor) r9
            p000.nr0.m4088(r9, r10)
            throw r5
        L74:
            java.lang.Object r9 = r2.get(r6)
            java.lang.reflect.Constructor r9 = (java.lang.reflect.Constructor) r9
            p000.nr0.m4088(r9, r10)
            throw r5
        L7e:
            ir r2 = new ir
            r2.<init>(r10)
        L83:
            r0.f5173 = r2
            r0.f5172 = r1
            k00 r1 = r9.f5557
            rp1 r2 = r1.mo3105(r10)
            if (r2 == 0) goto L92
            java.lang.Object r1 = r2.f9433
            goto Lb1
        L92:
            java.util.HashMap r2 = r1.f5689
            rp1 r3 = new rp1
            r3.<init>(r10, r0)
            int r8 = r1.f10928
            int r8 = r8 + r7
            r1.f10928 = r8
            rp1 r8 = r1.f10926
            if (r8 != 0) goto La7
            r1.f10925 = r3
            r1.f10926 = r3
            goto Lad
        La7:
            r8.f9434 = r3
            r3.f9435 = r8
            r1.f10926 = r3
        Lad:
            r2.put(r10, r3)
            r1 = r5
        Lb1:
            ir0 r1 = (p000.ir0) r1
            if (r1 == 0) goto Lb6
            goto Lc0
        Lb6:
            java.lang.ref.WeakReference r1 = r9.f5559
            java.lang.Object r1 = r1.get()
            hr0 r1 = (p000.hr0) r1
            if (r1 != 0) goto Lc1
        Lc0:
            return
        Lc1:
            int r2 = r9.f5560
            if (r2 != 0) goto Lc9
            boolean r2 = r9.f5561
            if (r2 == 0) goto Lca
        Lc9:
            r6 = r7
        Lca:
            cr0 r2 = r9.m2981(r10)
            int r3 = r9.f5560
            int r3 = r3 + r7
            r9.f5560 = r3
        Ld3:
            cr0 r3 = r0.f5172
            int r2 = r3.compareTo(r2)
            if (r2 >= 0) goto L125
            k00 r2 = r9.f5557
            java.util.HashMap r2 = r2.f5689
            boolean r2 = r2.containsKey(r10)
            if (r2 == 0) goto L125
            cr0 r2 = r0.f5172
            java.util.ArrayList r3 = r9.f5563
            r3.add(r2)
            zq0 r2 = p000.br0.Companion
            cr0 r8 = r0.f5172
            r2.getClass()
            r8.getClass()
            int r2 = r8.ordinal()
            if (r2 == r7) goto L109
            if (r2 == r4) goto L106
            r8 = 3
            if (r2 == r8) goto L103
            r2 = r5
            goto L10b
        L103:
            br0 r2 = p000.br0.ON_RESUME
            goto L10b
        L106:
            br0 r2 = p000.br0.ON_START
            goto L10b
        L109:
            br0 r2 = p000.br0.ON_CREATE
        L10b:
            if (r2 == 0) goto L11d
            r0.m2798(r1, r2)
            int r2 = r3.size()
            int r2 = r2 - r7
            r3.remove(r2)
            cr0 r2 = r9.m2981(r10)
            goto Ld3
        L11d:
            java.lang.String r9 = "no event up from "
            cr0 r10 = r0.f5172
            p000.C1080.m7280(r10, r9)
            return
        L125:
            if (r6 != 0) goto L12a
            r9.m2986()
        L12a:
            int r10 = r9.f5560
            int r10 = r10 + (-1)
            r9.f5560 = r10
            return
    }

    /* JADX INFO: renamed from: β */
    public final p000.cr0 m2981(p000.gr0 r4) {
            r3 = this;
            k00 r0 = r3.f5557
            java.util.HashMap r0 = r0.f5689
            boolean r1 = r0.containsKey(r4)
            r2 = 0
            if (r1 == 0) goto L14
            java.lang.Object r4 = r0.get(r4)
            rp1 r4 = (p000.rp1) r4
            rp1 r4 = r4.f9435
            goto L15
        L14:
            r4 = r2
        L15:
            if (r4 == 0) goto L1e
            java.lang.Object r4 = r4.f9433
            ir0 r4 = (p000.ir0) r4
            cr0 r4 = r4.f5172
            goto L1f
        L1e:
            r4 = r2
        L1f:
            java.util.ArrayList r0 = r3.f5563
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L34
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            cr0 r2 = (p000.cr0) r2
        L34:
            cr0 r3 = r3.f5558
            r3.getClass()
            if (r4 == 0) goto L42
            int r0 = r4.compareTo(r3)
            if (r0 >= 0) goto L42
            goto L43
        L42:
            r4 = r3
        L43:
            if (r2 == 0) goto L4c
            int r3 = r2.compareTo(r4)
            if (r3 >= 0) goto L4c
            return r2
        L4c:
            return r4
    }

    /* JADX INFO: renamed from: γ */
    public final void m2982(java.lang.String r2) {
            r1 = this;
            boolean r1 = r1.f5556
            if (r1 == 0) goto L29
            q6 r1 = p000.C0713q6.m4766()
            java.lang.Object r1 = r1.f8884
            q6 r1 = (p000.C0713q6) r1
            r1.getClass()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r1 != r0) goto L1e
            return
        L1e:
            java.lang.String r1 = "Method "
            java.lang.String r0 = " must be called on the main thread"
            java.lang.String r1 = p000.lz1.m3674(r1, r2, r0)
            p000.C1080.m7273(r1)
        L29:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m2983(p000.br0 r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r0 = "handleLifecycleEvent"
            r1.m2982(r0)
            cr0 r2 = r2.m1004()
            r1.m2984(r2)
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m2984(p000.cr0 r5) {
            r4 = this;
            cr0 r0 = r4.f5558
            if (r0 != r5) goto L6
            goto L92
        L6:
            java.lang.ref.WeakReference r0 = r4.f5559
            java.lang.Object r0 = r0.get()
            hr0 r0 = (p000.hr0) r0
            cr0 r1 = r4.f5558
            r1.getClass()
            cr0 r2 = p000.cr0.f2725
            cr0 r3 = p000.cr0.f2724
            if (r1 != r2) goto L46
            if (r5 == r3) goto L1c
            goto L46
        L1c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "State must be at least '"
            r1.<init>(r2)
            cr0 r2 = p000.cr0.f2726
            r1.append(r2)
            java.lang.String r2 = "' to be moved to '"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = "' in component "
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L46:
            if (r1 != r3) goto L73
            if (r1 != r5) goto L4b
            goto L73
        L4b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "State is '"
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = "' and cannot be moved to `"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = "` in component "
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L73:
            r4.f5558 = r5
            boolean r5 = r4.f5561
            r0 = 1
            if (r5 != 0) goto L93
            int r5 = r4.f5560
            if (r5 == 0) goto L7f
            goto L93
        L7f:
            r4.f5561 = r0
            r4.m2986()
            r5 = 0
            r4.f5561 = r5
            cr0 r5 = r4.f5558
            if (r5 != r3) goto L92
            k00 r5 = new k00
            r5.<init>()
            r4.f5557 = r5
        L92:
            return
        L93:
            r4.f5562 = r0
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final void m2985(p000.gr0 r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r0 = "removeObserver"
            r1.m2982(r0)
            k00 r1 = r1.f5557
            r1.mo3106(r2)
            return
    }

    /* JADX INFO: renamed from: η */
    public final void m2986() {
            r11 = this;
            java.lang.ref.WeakReference r0 = r11.f5559
            java.lang.Object r0 = r0.get()
            hr0 r0 = (p000.hr0) r0
            if (r0 == 0) goto L173
        La:
            k00 r1 = r11.f5557
            int r2 = r1.f10928
            r3 = 0
            if (r2 != 0) goto L12
            goto L30
        L12:
            rp1 r1 = r1.f10925
            r1.getClass()
            java.lang.Object r1 = r1.f9433
            ir0 r1 = (p000.ir0) r1
            cr0 r1 = r1.f5172
            k00 r2 = r11.f5557
            rp1 r2 = r2.f10926
            r2.getClass()
            java.lang.Object r2 = r2.f9433
            ir0 r2 = (p000.ir0) r2
            cr0 r2 = r2.f5172
            if (r1 != r2) goto L3a
            cr0 r1 = r11.f5558
            if (r1 != r2) goto L3a
        L30:
            r11.f5562 = r3
            f02 r0 = r11.f5564
            cr0 r11 = r11.f5558
            r0.m1987(r11)
            return
        L3a:
            r11.f5562 = r3
            cr0 r1 = r11.f5558
            k00 r2 = r11.f5557
            rp1 r2 = r2.f10925
            r2.getClass()
            java.lang.Object r2 = r2.f9433
            ir0 r2 = (p000.ir0) r2
            cr0 r2 = r2.f5172
            int r1 = r1.compareTo(r2)
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            java.util.ArrayList r6 = r11.f5563
            if (r1 >= 0) goto Ldd
            k00 r1 = r11.f5557
            qp1 r7 = new qp1
            rp1 r8 = r1.f10926
            rp1 r9 = r1.f10925
            r10 = 1
            r7.<init>(r8, r9, r10)
            java.util.WeakHashMap r1 = r1.f10927
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r1.put(r7, r8)
        L6a:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Ldd
            boolean r1 = r11.f5562
            if (r1 != 0) goto Ldd
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r1.getClass()
            java.lang.Object r8 = r1.getKey()
            gr0 r8 = (p000.gr0) r8
            java.lang.Object r1 = r1.getValue()
            ir0 r1 = (p000.ir0) r1
        L89:
            cr0 r9 = r1.f5172
            cr0 r10 = r11.f5558
            int r9 = r9.compareTo(r10)
            if (r9 <= 0) goto L6a
            boolean r9 = r11.f5562
            if (r9 != 0) goto L6a
            k00 r9 = r11.f5557
            java.util.HashMap r9 = r9.f5689
            boolean r9 = r9.containsKey(r8)
            if (r9 == 0) goto L6a
            zq0 r9 = p000.br0.Companion
            cr0 r10 = r1.f5172
            r9.getClass()
            r10.getClass()
            int r9 = r10.ordinal()
            if (r9 == r4) goto Lbe
            if (r9 == r3) goto Lbb
            r10 = 4
            if (r9 == r10) goto Lb8
            r9 = r2
            goto Lc0
        Lb8:
            br0 r9 = p000.br0.ON_PAUSE
            goto Lc0
        Lbb:
            br0 r9 = p000.br0.ON_STOP
            goto Lc0
        Lbe:
            br0 r9 = p000.br0.ON_DESTROY
        Lc0:
            if (r9 == 0) goto Ld5
            cr0 r10 = r9.m1004()
            r6.add(r10)
            r1.m2798(r0, r9)
            int r9 = r6.size()
            int r9 = r9 - r5
            r6.remove(r9)
            goto L89
        Ld5:
            java.lang.String r11 = "no event down from "
            cr0 r0 = r1.f5172
            p000.C1080.m7280(r0, r11)
            return
        Ldd:
            k00 r1 = r11.f5557
            rp1 r1 = r1.f10926
            boolean r7 = r11.f5562
            if (r7 != 0) goto La
            if (r1 == 0) goto La
            cr0 r7 = r11.f5558
            java.lang.Object r1 = r1.f9433
            ir0 r1 = (p000.ir0) r1
            cr0 r1 = r1.f5172
            int r1 = r7.compareTo(r1)
            if (r1 <= 0) goto La
            k00 r1 = r11.f5557
            r1.getClass()
            sp1 r7 = new sp1
            r7.<init>(r1)
            java.util.WeakHashMap r1 = r1.f10927
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r1.put(r7, r8)
        L106:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto La
            boolean r1 = r11.f5562
            if (r1 != 0) goto La
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r8 = r1.getKey()
            gr0 r8 = (p000.gr0) r8
            java.lang.Object r1 = r1.getValue()
            ir0 r1 = (p000.ir0) r1
        L122:
            cr0 r9 = r1.f5172
            cr0 r10 = r11.f5558
            int r9 = r9.compareTo(r10)
            if (r9 >= 0) goto L106
            boolean r9 = r11.f5562
            if (r9 != 0) goto L106
            k00 r9 = r11.f5557
            java.util.HashMap r9 = r9.f5689
            boolean r9 = r9.containsKey(r8)
            if (r9 == 0) goto L106
            cr0 r9 = r1.f5172
            r6.add(r9)
            zq0 r9 = p000.br0.Companion
            cr0 r10 = r1.f5172
            r9.getClass()
            r10.getClass()
            int r9 = r10.ordinal()
            if (r9 == r5) goto L15b
            if (r9 == r4) goto L158
            if (r9 == r3) goto L155
            r9 = r2
            goto L15d
        L155:
            br0 r9 = p000.br0.ON_RESUME
            goto L15d
        L158:
            br0 r9 = p000.br0.ON_START
            goto L15d
        L15b:
            br0 r9 = p000.br0.ON_CREATE
        L15d:
            if (r9 == 0) goto L16b
            r1.m2798(r0, r9)
            int r9 = r6.size()
            int r9 = r9 - r5
            r6.remove(r9)
            goto L122
        L16b:
            java.lang.String r11 = "no event up from "
            cr0 r0 = r1.f5172
            p000.C1080.m7280(r0, r11)
            return
        L173:
            java.lang.String r11 = "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."
            p000.C1080.m7279(r11)
            return
    }
}
