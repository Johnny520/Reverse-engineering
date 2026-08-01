package p000;

/* JADX INFO: renamed from: pr */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0697pr {

    /* JADX INFO: renamed from: α */
    public final android.view.ViewGroup f8663;

    /* JADX INFO: renamed from: β */
    public final java.util.ArrayList f8664;

    /* JADX INFO: renamed from: γ */
    public final java.util.ArrayList f8665;

    /* JADX INFO: renamed from: δ */
    public boolean f8666;

    /* JADX INFO: renamed from: ε */
    public boolean f8667;

    public C0697pr(android.view.ViewGroup r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f8663 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f8664 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f8665 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m4570(java.util.ArrayList r9, boolean r10) {
            r8 = this;
            java.util.Iterator r10 = r9.iterator()
            boolean r0 = r10.hasNext()
            if (r0 != 0) goto L15c
            int r10 = r9.size()
            java.util.ListIterator r10 = r9.listIterator(r10)
            boolean r0 = r10.hasPrevious()
            if (r0 != 0) goto L151
            r10 = 2
            boolean r0 = p000.b70.m751(r10)
            java.lang.String r1 = "FragmentManager"
            if (r0 == 0) goto L26
            java.lang.String r0 = "Executing operations from null to null"
            android.util.Log.v(r1, r0)
        L26:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r9)
            java.lang.Object r4 = p000.AbstractC0984xh.m6645(r9)
            mz1 r4 = (p000.mz1) r4
            r4.getClass()
            java.util.Iterator r4 = r9.iterator()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L146
            java.util.Iterator r9 = r9.iterator()
            boolean r4 = r9.hasNext()
            if (r4 != 0) goto L13b
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r2.iterator()
            boolean r6 = r5.hasNext()
            r7 = 0
            if (r6 != 0) goto L131
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L70:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L80
            java.lang.Object r6 = r4.next()
            nr r6 = (p000.C0596nr) r6
            r6.getClass()
            goto L70
        L80:
            java.util.Iterator r4 = r5.iterator()
        L84:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L94
            java.lang.Object r5 = r4.next()
            nr r5 = (p000.C0596nr) r5
            r5.getClass()
            goto L84
        L94:
            java.util.Iterator r2 = r2.iterator()
        L98:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Lb1
            java.lang.Object r4 = r2.next()
            nr r4 = (p000.C0596nr) r4
            r4.getClass()
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r6 = 0
            r9.put(r6, r5)
            r4.m2767()
            goto L98
        Lb1:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r9 = r9.containsValue(r2)
            android.view.ViewGroup r8 = r8.f8663
            r8.getContext()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r0 = r0.iterator()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L127
            java.util.Iterator r8 = r8.iterator()
        Lcf:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L103
            java.lang.Object r0 = r8.next()
            mr r0 = (p000.C0559mr) r0
            r0.getClass()
            if (r9 == 0) goto L101
            boolean r2 = p000.b70.m751(r10)
            if (r2 == 0) goto Lfd
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Ignoring Animation set on "
            r2.<init>(r4)
            r4 = 0
            r2.append(r4)
            java.lang.String r4 = " as Animations cannot run alongside Transitions."
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r1, r2)
        Lfd:
            r0.m2767()
            goto Lcf
        L101:
            r8 = 0
            throw r8
        L103:
            java.util.Iterator r8 = r3.iterator()
            boolean r9 = r8.hasNext()
            if (r9 != 0) goto L11c
            r3.clear()
            boolean r8 = p000.b70.m751(r10)
            if (r8 == 0) goto L11b
            java.lang.String r8 = "Completed executing operations from null to null"
            android.util.Log.v(r1, r8)
        L11b:
            return
        L11c:
            java.lang.Object r8 = r8.next()
            mz1 r8 = (p000.mz1) r8
            r8.getClass()
            r8 = 0
            throw r8
        L127:
            java.lang.Object r8 = r0.next()
            mr r8 = (p000.C0559mr) r8
            r8.m2768()
            throw r7
        L131:
            java.lang.Object r8 = r5.next()
            nr r8 = (p000.C0596nr) r8
            r8.m2768()
            throw r7
        L13b:
            java.lang.Object r8 = r9.next()
            mz1 r8 = (p000.mz1) r8
            r8.m3914()
            r8 = 0
            throw r8
        L146:
            java.lang.Object r8 = r4.next()
            mz1 r8 = (p000.mz1) r8
            r8.getClass()
            r8 = 0
            throw r8
        L151:
            java.lang.Object r8 = r10.previous()
            mz1 r8 = (p000.mz1) r8
            r8.getClass()
            r8 = 0
            throw r8
        L15c:
            java.lang.Object r8 = r10.next()
            mz1 r8 = (p000.mz1) r8
            r8.getClass()
            r8 = 0
            throw r8
    }

    /* JADX INFO: renamed from: β */
    public final void m4571() {
            r7 = this;
            boolean r0 = r7.f8667
            if (r0 == 0) goto L5
            return
        L5:
            android.view.ViewGroup r0 = r7.f8663
            java.util.WeakHashMap r1 = p000.b92.f1572
            boolean r0 = r0.isAttachedToWindow()
            r1 = 0
            if (r0 != 0) goto L16
            r7.m4572()
            r7.f8666 = r1
            return
        L16:
            java.util.ArrayList r0 = r7.f8664
            monitor-enter(r0)
            java.util.ArrayList r2 = r7.f8664     // Catch: java.lang.Throwable -> L5a
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L5a
            if (r2 != 0) goto Lad
            java.util.ArrayList r2 = r7.f8665     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayList r2 = p000.AbstractC0984xh.m6668(r2)     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayList r3 = r7.f8665     // Catch: java.lang.Throwable -> L5a
            r3.clear()     // Catch: java.lang.Throwable -> L5a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L5a
        L30:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L5a
            r4 = 2
            if (r3 == 0) goto L65
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L5a
            mz1 r3 = (p000.mz1) r3     // Catch: java.lang.Throwable -> L5a
            boolean r4 = p000.b70.m751(r4)     // Catch: java.lang.Throwable -> L5a
            if (r4 == 0) goto L5c
            java.lang.String r4 = "FragmentManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r5.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = "SpecialEffectsController: Cancelling operation "
            r5.append(r6)     // Catch: java.lang.Throwable -> L5a
            r5.append(r3)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5a
            android.util.Log.v(r4, r5)     // Catch: java.lang.Throwable -> L5a
            goto L5c
        L5a:
            r7 = move-exception
            goto Laf
        L5c:
            r3.m3912()     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayList r4 = r7.f8665     // Catch: java.lang.Throwable -> L5a
            r4.add(r3)     // Catch: java.lang.Throwable -> L5a
            goto L30
        L65:
            r7.m4573()     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayList r2 = r7.f8664     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayList r2 = p000.AbstractC0984xh.m6668(r2)     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayList r3 = r7.f8664     // Catch: java.lang.Throwable -> L5a
            r3.clear()     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayList r3 = r7.f8665     // Catch: java.lang.Throwable -> L5a
            r3.addAll(r2)     // Catch: java.lang.Throwable -> L5a
            boolean r3 = p000.b70.m751(r4)     // Catch: java.lang.Throwable -> L5a
            if (r3 == 0) goto L85
            java.lang.String r3 = "FragmentManager"
            java.lang.String r5 = "SpecialEffectsController: Executing pending operations"
            android.util.Log.v(r3, r5)     // Catch: java.lang.Throwable -> L5a
        L85:
            java.util.Iterator r3 = r2.iterator()     // Catch: java.lang.Throwable -> L5a
        L89:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L5a
            if (r5 == 0) goto L99
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L5a
            mz1 r5 = (p000.mz1) r5     // Catch: java.lang.Throwable -> L5a
            r5.m3914()     // Catch: java.lang.Throwable -> L5a
            goto L89
        L99:
            boolean r3 = r7.f8666     // Catch: java.lang.Throwable -> L5a
            r7.m4570(r2, r3)     // Catch: java.lang.Throwable -> L5a
            r7.f8666 = r1     // Catch: java.lang.Throwable -> L5a
            boolean r7 = p000.b70.m751(r4)     // Catch: java.lang.Throwable -> L5a
            if (r7 == 0) goto Lad
            java.lang.String r7 = "FragmentManager"
            java.lang.String r1 = "SpecialEffectsController: Finished executing pending operations"
            android.util.Log.v(r7, r1)     // Catch: java.lang.Throwable -> L5a
        Lad:
            monitor-exit(r0)
            return
        Laf:
            monitor-exit(r0)
            throw r7
    }

    /* JADX INFO: renamed from: γ */
    public final void m4572() {
            r9 = this;
            r0 = 2
            boolean r1 = p000.b70.m751(r0)
            if (r1 == 0) goto Le
            java.lang.String r1 = "FragmentManager"
            java.lang.String r2 = "SpecialEffectsController: Forcing all operations to complete"
            android.util.Log.v(r1, r2)
        Le:
            android.view.ViewGroup r1 = r9.f8663
            java.util.WeakHashMap r2 = p000.b92.f1572
            boolean r1 = r1.isAttachedToWindow()
            java.util.ArrayList r2 = r9.f8664
            monitor-enter(r2)
            r9.m4573()     // Catch: java.lang.Throwable -> L32
            java.util.ArrayList r3 = r9.f8664     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L32
        L22:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L35
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L32
            mz1 r4 = (p000.mz1) r4     // Catch: java.lang.Throwable -> L32
            r4.m3914()     // Catch: java.lang.Throwable -> L32
            goto L22
        L32:
            r9 = move-exception
            goto Led
        L35:
            java.util.ArrayList r3 = r9.f8665     // Catch: java.lang.Throwable -> L32
            java.util.ArrayList r3 = p000.AbstractC0984xh.m6668(r3)     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L32
        L3f:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L90
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L32
            mz1 r4 = (p000.mz1) r4     // Catch: java.lang.Throwable -> L32
            boolean r5 = p000.b70.m751(r0)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L8c
            if (r1 == 0) goto L56
            java.lang.String r5 = ""
            goto L6e
        L56:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r5.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.String r6 = "Container "
            r5.append(r6)     // Catch: java.lang.Throwable -> L32
            android.view.ViewGroup r6 = r9.f8663     // Catch: java.lang.Throwable -> L32
            r5.append(r6)     // Catch: java.lang.Throwable -> L32
            java.lang.String r6 = " is not attached to window. "
            r5.append(r6)     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L32
        L6e:
            java.lang.String r6 = "FragmentManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r7.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.String r8 = "SpecialEffectsController: "
            r7.append(r8)     // Catch: java.lang.Throwable -> L32
            r7.append(r5)     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = "Cancelling running operation "
            r7.append(r5)     // Catch: java.lang.Throwable -> L32
            r7.append(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L32
            android.util.Log.v(r6, r5)     // Catch: java.lang.Throwable -> L32
        L8c:
            r4.m3912()     // Catch: java.lang.Throwable -> L32
            goto L3f
        L90:
            java.util.ArrayList r3 = r9.f8664     // Catch: java.lang.Throwable -> L32
            java.util.ArrayList r3 = p000.AbstractC0984xh.m6668(r3)     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L32
        L9a:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto Leb
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L32
            mz1 r4 = (p000.mz1) r4     // Catch: java.lang.Throwable -> L32
            boolean r5 = p000.b70.m751(r0)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto Le7
            if (r1 == 0) goto Lb1
            java.lang.String r5 = ""
            goto Lc9
        Lb1:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r5.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.String r6 = "Container "
            r5.append(r6)     // Catch: java.lang.Throwable -> L32
            android.view.ViewGroup r6 = r9.f8663     // Catch: java.lang.Throwable -> L32
            r5.append(r6)     // Catch: java.lang.Throwable -> L32
            java.lang.String r6 = " is not attached to window. "
            r5.append(r6)     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L32
        Lc9:
            java.lang.String r6 = "FragmentManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r7.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.String r8 = "SpecialEffectsController: "
            r7.append(r8)     // Catch: java.lang.Throwable -> L32
            r7.append(r5)     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = "Cancelling pending operation "
            r7.append(r5)     // Catch: java.lang.Throwable -> L32
            r7.append(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L32
            android.util.Log.v(r6, r5)     // Catch: java.lang.Throwable -> L32
        Le7:
            r4.m3912()     // Catch: java.lang.Throwable -> L32
            goto L9a
        Leb:
            monitor-exit(r2)
            return
        Led:
            monitor-exit(r2)
            throw r9
    }

    /* JADX INFO: renamed from: δ */
    public final void m4573() {
            r1 = this;
            java.util.ArrayList r1 = r1.f8664
            java.util.Iterator r1 = r1.iterator()
        L6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r1.next()
            mz1 r0 = (p000.mz1) r0
            r0.getClass()
            goto L6
        L16:
            return
    }
}
