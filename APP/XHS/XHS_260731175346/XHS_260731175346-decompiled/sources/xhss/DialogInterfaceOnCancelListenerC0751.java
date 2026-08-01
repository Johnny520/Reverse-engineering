package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛴᛴᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0751 implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener, android.content.ComponentCallbacks, android.view.View.OnCreateContextMenuListener, xhss.InterfaceC0386, xhss.InterfaceC0996, xhss.InterfaceC0114, xhss.InterfaceC0056 {

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public static final java.lang.Object f2515 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.String f2516;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0623 f2517;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public androidx.lifecycle.C0000 f2518;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final int f2519;

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public boolean f2520;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final xhss.DialogInterfaceOnDismissListenerC0240 f2521;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final xhss.C1037 f2522;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public int f2523;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final java.util.ArrayList f2524;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.EnumC0064 f2525;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public xhss.C0230 f2526;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public boolean f2527;

    static {
            return
    }

    public DialogInterfaceOnCancelListenerC0751() {
            r7 = this;
            r7.<init>()
            r0 = -1
            r7.f2519 = r0
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r7.f2516 = r1
            xhss.ᛷᛱᛳᲁ r1 = new xhss.ᛷᛱᛳᲁ
            r2 = 5
            r1.<init>(r2)
            r7.f2517 = r1
            xhss.ᛱᛷᛸᲁ r1 = xhss.EnumC0064.f356
            r7.f2525 = r1
            xhss.ᛲᲈᛱᛳ r1 = new xhss.ᛲᲈᛱᛳ
            r1.<init>()
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r7.f2524 = r1
            xhss.ᲇᛵᛲᲁ r1 = new xhss.ᲇᛵᛲᲁ
            r2 = 10
            r1.<init>(r2, r7)
            r7.f2522 = r1
            androidx.lifecycle.ᛷᛵᛵᲈ r1 = new androidx.lifecycle.ᛷᛵᛵᲈ
            r1.<init>(r7)
            r7.f2518 = r1
            xhss.ᛳᛱᛲᲀ r1 = new xhss.ᛳᛱᛲᲀ
            r1.<init>(r7)
            r7.f2526 = r1
            java.util.ArrayList r1 = r7.f2524
            xhss.ᲇᛵᛲᲁ r2 = r7.f2522
            boolean r3 = r1.contains(r2)
            if (r3 != 0) goto L94
            int r3 = r7.f2519
            if (r3 < 0) goto L91
            java.lang.Object r1 = r2.f3349
            xhss.ᛸᛴᛴᛶ r1 = (xhss.DialogInterfaceOnCancelListenerC0751) r1
            xhss.ᛳᛱᛲᲀ r2 = r1.f2526
            java.lang.Object r3 = r2.f893
            xhss.ᛱᛶᲁᛶ r3 = (xhss.InterfaceC0056) r3
            androidx.lifecycle.ᛷᛵᛵᲈ r4 = r3.mo63()
            xhss.ᛱᛷᛸᲁ r5 = r4.f64
            xhss.ᛱᛷᛸᲁ r6 = xhss.EnumC0064.f352
            if (r5 != r6) goto L88
            androidx.savedstate.Recreator r5 = new androidx.savedstate.Recreator
            r5.<init>(r3)
            r4.m26(r5)
            java.lang.Object r2 = r2.f894
            xhss.ᲇᛸᛲᲁ r2 = (xhss.C1061) r2
            boolean r3 = r2.f3422
            if (r3 != 0) goto L82
            xhss.ᲇᲁᛱᲈ r3 = new xhss.ᲇᲁᛱᲈ
            r3.<init>(r2)
            r4.m26(r3)
            r3 = 1
            r2.f3422 = r3
            goto L8d
        L82:
            java.lang.String r2 = "SavedStateRegistry was already attached."
            xhss.C0532.m950(r2)
            goto L8d
        L88:
            java.lang.String r2 = "Restarter must be created only during owner's initialization stage"
            xhss.C0532.m950(r2)
        L8d:
            xhss.AbstractC0775.m1309(r1)
            goto L94
        L91:
            r1.add(r2)
        L94:
            xhss.ᛴᲈᲀᲇ r1 = new xhss.ᛴᲈᲀᲇ
            r2 = 0
            r1.<init>(r2, r7)
            xhss.ᛳᛲᛶᛱ r1 = new xhss.ᛳᛲᛶᛱ
            r1.<init>()
            r7.f2521 = r1
            r7.f2523 = r0
            xhss.ᛳᛴᲀᲁ r0 = new xhss.ᛳᛴᲀᲁ
            r0.<init>(r7)
            return
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r0 == r1) goto L4
            r0 = 0
            return r0
        L4:
            r0 = 1
            return r0
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface r1) {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu r1, android.view.View r2, android.view.ContextMenu.ContextMenuInfo r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Fragment "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " not attached to an activity."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r1) {
            r0 = this;
            boolean r1 = r0.f2527
            if (r1 != 0) goto L11
            r1 = 3
            boolean r1 = xhss.C0623.m1085(r1)
            if (r1 == 0) goto Le
            r0.toString()
        Le:
            r0.m1291()
        L11:
            return
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
            r0 = this;
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "} ("
            r0.append(r1)
            java.lang.String r2 = r2.f2516
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // xhss.InterfaceC0114
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final xhss.AbstractC0007 mo309() {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = " not attached to a context."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // xhss.InterfaceC0996
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.AbstractC1178 mo1290() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't access ViewModels from detached fragment"
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final void m1291() {
            r11 = this;
            boolean r0 = r11.f2520
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r11.f2520 = r0
            r11.f2527 = r0
            int r1 = r11.f2523
            r2 = -1
            if (r1 < 0) goto L2d
            xhss.ᛷᛱᛳᲁ r0 = r11.m1292()
            int r1 = r11.f2523
            if (r1 < 0) goto L23
            java.lang.Object r0 = r0.f2151
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            r11.f2523 = r2
            return
        L20:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r11
        L23:
            java.lang.String r11 = "Bad id: "
            java.lang.String r11 = xhss.AbstractC0390.m774(r11, r1)
            xhss.C0532.m959(r11)
            return
        L2d:
            xhss.ᛷᛱᛳᲁ r1 = r11.m1292()
            xhss.ᲇᲀᛵᛵ r3 = new xhss.ᲇᲀᛵᛵ
            r3.<init>(r1)
            xhss.ᛲᛵᛸᲇ r1 = new xhss.ᛲᛵᛸᲇ
            r1.<init>()
            r4 = 3
            r1.f666 = r4
            r1.f663 = r11
            java.util.ArrayList r11 = r3.f3474
            r11.add(r1)
            r11 = 0
            r1.f664 = r11
            r1.f667 = r11
            r1.f665 = r11
            r1.f668 = r11
            xhss.ᛷᛱᛳᲁ r1 = r3.f3472
            boolean r4 = r3.f3473
            if (r4 != 0) goto L15c
            r4 = 2
            boolean r4 = xhss.C0623.m1085(r4)
            if (r4 == 0) goto L14e
            r3.toString()
            xhss.ᲁᲀᲈᛶ r4 = new xhss.ᲁᲀᲈᛶ
            r4.<init>()
            java.io.PrintWriter r5 = new java.io.PrintWriter
            r5.<init>(r4)
            java.lang.String r4 = "  "
            java.util.ArrayList r6 = r3.f3474
            r5.print(r4)
            java.lang.String r7 = "mName="
            r5.print(r7)
            r7 = 0
            r5.print(r7)
            java.lang.String r7 = " mIndex="
            r5.print(r7)
            int r7 = r3.f3475
            r5.print(r7)
            java.lang.String r7 = " mCommitted="
            r5.print(r7)
            boolean r7 = r3.f3473
            r5.println(r7)
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L14b
            r5.print(r4)
            java.lang.String r7 = "Operations:"
            r5.println(r7)
            int r7 = r6.size()
        L9e:
            if (r11 >= r7) goto L14b
            java.lang.Object r8 = r6.get(r11)
            xhss.ᛲᛵᛸᲇ r8 = (xhss.C0160) r8
            int r9 = r8.f666
            switch(r9) {
                case 0: goto Lda;
                case 1: goto Ld7;
                case 2: goto Ld4;
                case 3: goto Ld1;
                case 4: goto Lce;
                case 5: goto Lcb;
                case 6: goto Lc8;
                case 7: goto Lc5;
                case 8: goto Lc2;
                case 9: goto Lbf;
                case 10: goto Lbc;
                default: goto Lab;
            }
        Lab:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "cmd="
            r9.<init>(r10)
            int r10 = r8.f666
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            goto Ldc
        Lbc:
            java.lang.String r9 = "OP_SET_MAX_LIFECYCLE"
            goto Ldc
        Lbf:
            java.lang.String r9 = "UNSET_PRIMARY_NAV"
            goto Ldc
        Lc2:
            java.lang.String r9 = "SET_PRIMARY_NAV"
            goto Ldc
        Lc5:
            java.lang.String r9 = "ATTACH"
            goto Ldc
        Lc8:
            java.lang.String r9 = "DETACH"
            goto Ldc
        Lcb:
            java.lang.String r9 = "SHOW"
            goto Ldc
        Lce:
            java.lang.String r9 = "HIDE"
            goto Ldc
        Ld1:
            java.lang.String r9 = "REMOVE"
            goto Ldc
        Ld4:
            java.lang.String r9 = "REPLACE"
            goto Ldc
        Ld7:
            java.lang.String r9 = "ADD"
            goto Ldc
        Lda:
            java.lang.String r9 = "NULL"
        Ldc:
            r5.print(r4)
            java.lang.String r10 = "  Op #"
            r5.print(r10)
            r5.print(r11)
            java.lang.String r10 = ": "
            r5.print(r10)
            r5.print(r9)
            java.lang.String r9 = " "
            r5.print(r9)
            xhss.ᛸᛴᛴᛶ r9 = r8.f663
            r5.println(r9)
            int r9 = r8.f664
            if (r9 != 0) goto L101
            int r9 = r8.f667
            if (r9 == 0) goto L120
        L101:
            r5.print(r4)
            java.lang.String r9 = "enterAnim=#"
            r5.print(r9)
            int r9 = r8.f664
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r5.print(r9)
            java.lang.String r9 = " exitAnim=#"
            r5.print(r9)
            int r9 = r8.f667
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r5.println(r9)
        L120:
            int r9 = r8.f665
            if (r9 != 0) goto L128
            int r9 = r8.f668
            if (r9 == 0) goto L147
        L128:
            r5.print(r4)
            java.lang.String r9 = "popEnterAnim=#"
            r5.print(r9)
            int r9 = r8.f665
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r5.print(r9)
            java.lang.String r9 = " popExitAnim=#"
            r5.print(r9)
            int r8 = r8.f668
            java.lang.String r8 = java.lang.Integer.toHexString(r8)
            r5.println(r8)
        L147:
            int r11 = r11 + 1
            goto L9e
        L14b:
            r5.close()
        L14e:
            r3.f3473 = r0
            r3.f3475 = r2
            java.lang.Object r11 = r1.f2151
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            monitor-enter(r11)
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L159
            goto L161
        L159:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L159
            throw r0
        L15c:
            java.lang.String r11 = "commit already called"
            xhss.C0532.m950(r11)
        L161:
            return
    }

    @Override // xhss.InterfaceC0056
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final xhss.C1061 mo175() {
            r0 = this;
            xhss.ᛳᛱᛲᲀ r0 = r0.f2526
            java.lang.Object r0 = r0.f894
            xhss.ᲇᛸᛲᲁ r0 = (xhss.C1061) r0
            return r0
    }

    @Override // xhss.InterfaceC0386
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final androidx.lifecycle.C0000 mo63() {
            r0 = this;
            androidx.lifecycle.ᛷᛵᛵᲈ r0 = r0.f2518
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.C0623 m1292() {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = " not associated with a fragment manager."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }
}
