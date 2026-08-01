package defpackage;

/* JADX INFO: renamed from: ᲈᲇᛵᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC2351 extends defpackage.AbstractComponentCallbacksC0293 implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public int f10144;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final defpackage.DialogInterfaceOnDismissListenerC0625 f10145;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public boolean f10146;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public boolean f10147;

    public DialogInterfaceOnCancelListenerC2351() {
            r2 = this;
            r2.<init>()
            ᛳᛳᛵᛲ r0 = new ᛳᛳᛵᛲ
            r1 = 4
            r0.<init>(r1, r2)
            ᛴᛲᛵᲈ r0 = new ᛴᛲᛵᲈ
            r0.<init>()
            r2.f10145 = r0
            r0 = -1
            r2.f10144 = r0
            ᛸᛶᛱᛵ r0 = new ᛸᛶᛱᛵ
            r0.<init>(r2)
            return
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface r1) {
            r0 = this;
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r2) {
            r1 = this;
            boolean r2 = r1.f10147
            if (r2 != 0) goto L21
            r2 = 3
            boolean r2 = defpackage.C2295.m3711(r2)
            if (r2 == 0) goto L1e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "onDismiss called for DialogFragment "
            r2.<init>(r0)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r2)
        L1e:
            r1.m3850()
        L21:
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final void m3850() {
            r11 = this;
            boolean r0 = r11.f10146
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r11.f10146 = r0
            r11.f10147 = r0
            int r1 = r11.f10144
            r2 = -1
            if (r1 < 0) goto L2d
            ᲈᛷᲀᲀ r0 = r11.m953()
            int r1 = r11.f10144
            if (r1 < 0) goto L23
            java.lang.Object r0 = r0.f9714
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            r11.f10144 = r2
            return
        L20:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r11
        L23:
            java.lang.String r11 = "Bad id: "
            java.lang.String r11 = defpackage.AbstractC1124.m2145(r1, r11)
            defpackage.C2264.m3684(r11)
            return
        L2d:
            ᲈᛷᲀᲀ r1 = r11.m953()
            ᲀᲀᛴᛵ r3 = new ᲀᲀᛴᛵ
            r3.<init>(r1)
            ᛷᲈᛵᛶ r1 = new ᛷᲈᛵᛶ
            r4 = 3
            r1.<init>(r4, r11)
            java.util.ArrayList r11 = r3.f7695
            r11.add(r1)
            r11 = 0
            r1.f6062 = r11
            r1.f6061 = r11
            r1.f6060 = r11
            r1.f6065 = r11
            ᲈᛷᲀᲀ r1 = r3.f7696
            java.lang.String r4 = "FragmentManager"
            boolean r5 = r3.f7694
            if (r5 != 0) goto L168
            r5 = 2
            boolean r5 = defpackage.C2295.m3711(r5)
            if (r5 == 0) goto L15a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Commit: "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r4, r5)
            ᛶᛸᲈᲇ r4 = new ᛶᛸᲈᲇ
            r4.<init>()
            java.io.PrintWriter r5 = new java.io.PrintWriter
            r5.<init>(r4)
            java.lang.String r4 = "  "
            java.util.ArrayList r6 = r3.f7695
            r5.print(r4)
            java.lang.String r7 = "mName="
            r5.print(r7)
            r7 = 0
            r5.print(r7)
            java.lang.String r7 = " mIndex="
            r5.print(r7)
            int r7 = r3.f7693
            r5.print(r7)
            java.lang.String r7 = " mCommitted="
            r5.print(r7)
            boolean r7 = r3.f7694
            r5.println(r7)
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L157
            r5.print(r4)
            java.lang.String r7 = "Operations:"
            r5.println(r7)
            int r7 = r6.size()
        Laa:
            if (r11 >= r7) goto L157
            java.lang.Object r8 = r6.get(r11)
            ᛷᲈᛵᛶ r8 = (defpackage.C1400) r8
            int r9 = r8.f6063
            switch(r9) {
                case 0: goto Le6;
                case 1: goto Le3;
                case 2: goto Le0;
                case 3: goto Ldd;
                case 4: goto Lda;
                case 5: goto Ld7;
                case 6: goto Ld4;
                case 7: goto Ld1;
                case 8: goto Lce;
                case 9: goto Lcb;
                case 10: goto Lc8;
                default: goto Lb7;
            }
        Lb7:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "cmd="
            r9.<init>(r10)
            int r10 = r8.f6063
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            goto Le8
        Lc8:
            java.lang.String r9 = "OP_SET_MAX_LIFECYCLE"
            goto Le8
        Lcb:
            java.lang.String r9 = "UNSET_PRIMARY_NAV"
            goto Le8
        Lce:
            java.lang.String r9 = "SET_PRIMARY_NAV"
            goto Le8
        Ld1:
            java.lang.String r9 = "ATTACH"
            goto Le8
        Ld4:
            java.lang.String r9 = "DETACH"
            goto Le8
        Ld7:
            java.lang.String r9 = "SHOW"
            goto Le8
        Lda:
            java.lang.String r9 = "HIDE"
            goto Le8
        Ldd:
            java.lang.String r9 = "REMOVE"
            goto Le8
        Le0:
            java.lang.String r9 = "REPLACE"
            goto Le8
        Le3:
            java.lang.String r9 = "ADD"
            goto Le8
        Le6:
            java.lang.String r9 = "NULL"
        Le8:
            r5.print(r4)
            java.lang.String r10 = "  Op #"
            r5.print(r10)
            r5.print(r11)
            java.lang.String r10 = ": "
            r5.print(r10)
            r5.print(r9)
            java.lang.String r9 = " "
            r5.print(r9)
            ᛲᛵᛴᲁ r9 = r8.f6064
            r5.println(r9)
            int r9 = r8.f6062
            if (r9 != 0) goto L10d
            int r9 = r8.f6061
            if (r9 == 0) goto L12c
        L10d:
            r5.print(r4)
            java.lang.String r9 = "enterAnim=#"
            r5.print(r9)
            int r9 = r8.f6062
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r5.print(r9)
            java.lang.String r9 = " exitAnim=#"
            r5.print(r9)
            int r9 = r8.f6061
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r5.println(r9)
        L12c:
            int r9 = r8.f6060
            if (r9 != 0) goto L134
            int r9 = r8.f6065
            if (r9 == 0) goto L153
        L134:
            r5.print(r4)
            java.lang.String r9 = "popEnterAnim=#"
            r5.print(r9)
            int r9 = r8.f6060
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r5.print(r9)
            java.lang.String r9 = " popExitAnim=#"
            r5.print(r9)
            int r8 = r8.f6065
            java.lang.String r8 = java.lang.Integer.toHexString(r8)
            r5.println(r8)
        L153:
            int r11 = r11 + 1
            goto Laa
        L157:
            r5.close()
        L15a:
            r3.f7694 = r0
            r3.f7693 = r2
            java.lang.Object r11 = r1.f9714
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            monitor-enter(r11)
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L165
            goto L16d
        L165:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L165
            throw r0
        L168:
            java.lang.String r11 = "commit already called"
            defpackage.C2264.m3676(r11)
        L16d:
            return
    }
}
