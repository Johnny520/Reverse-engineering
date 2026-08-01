package xhss;

/* JADX INFO: renamed from: xhss.ᛱᲇᛴᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0107 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public int f485;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public java.lang.Object f486;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f487;

    public C0107(int r1) {
            r0 = this;
            r0.f487 = r1
            switch(r1) {
                case 4: goto L13;
                default: goto L5;
            }
        L5:
            r0.<init>()
            r1 = 1
            r0.f485 = r1
            r1 = 0
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.f486 = r1
            return
        L13:
            r0.<init>()
            r1 = 1
            r0.f485 = r1
            r1 = 0
            r0.f486 = r1
            return
    }

    public C0107(int r1, java.util.ArrayList r2) {
            r0 = this;
            r0.f487 = r1
            switch(r1) {
                case 6: goto Le;
                default: goto L5;
            }
        L5:
            r0.<init>()
            r1 = 0
            r0.f485 = r1
            r0.f486 = r2
            return
        Le:
            r0.<init>()
            r0.f486 = r2
            return
    }

    public /* synthetic */ C0107(int r1, boolean r2) {
            r0 = this;
            r0.f487 = r1
            r0.<init>()
            return
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.f487
            switch(r0) {
                case 3: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r3 = super.toString()
            return r3
        La:
            java.lang.String r0 = new java.lang.String
            java.lang.Object r1 = r3.f486
            char[] r1 = (char[]) r1
            int r3 = r3.f485
            int r3 = r3 + 1
            r2 = 0
            r0.<init>(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public void m292(char r5) {
            r4 = this;
            int r0 = r4.f485
            int r0 = r0 + 1
            r4.f485 = r0
            java.lang.Object r1 = r4.f486
            char[] r1 = (char[]) r1
            int r2 = r1.length
            if (r2 > r0) goto L1c
            int r0 = r1.length
            int r0 = r0 * 2
            int r0 = r0 + 1
            char[] r0 = new char[r0]
            int r2 = r1.length
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r0, r3, r2)
            r4.f486 = r0
            r1 = r0
        L1c:
            int r4 = r4.f485
            r1[r4] = r5
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public void m293(int r8, xhss.C1181 r9) {
            r7 = this;
        L0:
            int r0 = r8 >> 1
            if (r0 == 0) goto L1f
            java.lang.Object r1 = r7.f486
            xhss.ᲈᲀᲇᛶ[] r1 = (xhss.C1181[]) r1
            r2 = r1[r0]
            long r3 = r2.f3813
            long r5 = r9.f3813
            long r5 = r5 - r3
            r3 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L16
            goto L1f
        L16:
            if (r3 != 0) goto L19
            goto L1f
        L19:
            r2.f3814 = r8
            r1[r8] = r2
            r8 = r0
            goto L0
        L1f:
            java.lang.Object r7 = r7.f486
            xhss.ᲈᲀᲇᛶ[] r7 = (xhss.C1181[]) r7
            r7[r8] = r9
            r9.f3814 = r8
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public void m294(xhss.C0623 r5) {
            r4 = this;
        L0:
            if (r5 == 0) goto L3b
            r0 = 0
            r1 = r0
        L4:
            int r2 = r4.f485
            java.lang.Object r3 = r4.f486
            xhss.ᛷᛱᛳᲁ[] r3 = (xhss.C0623[]) r3
            if (r1 >= r2) goto L20
            r2 = r3[r1]
            java.lang.Object r2 = r2.f2151
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r5.f2151
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L1d
            goto L36
        L1d:
            int r1 = r1 + 1
            goto L4
        L20:
            int r1 = r3.length
            if (r2 < r1) goto L2e
            int r1 = r3.length
            int r1 = r1 + 6
            xhss.ᛷᛱᛳᲁ[] r1 = new xhss.C0623[r1]
            java.lang.System.arraycopy(r3, r0, r1, r0, r2)
            r4.f486 = r1
            r3 = r1
        L2e:
            int r0 = r4.f485
            int r1 = r0 + 1
            r4.f485 = r1
            r3[r0] = r5
        L36:
            java.lang.Object r5 = r5.f2152
            xhss.ᛷᛱᛳᲁ r5 = (xhss.C0623) r5
            goto L0
        L3b:
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public void m295(xhss.C1181 r13) {
            r12 = this;
            int r0 = r13.f3814
            r1 = -1
            if (r0 == r1) goto L7a
            int r2 = r12.f485
            java.lang.Object r3 = r12.f486
            xhss.ᲈᲀᲇᛶ[] r3 = (xhss.C1181[]) r3
            r4 = r3[r2]
            r13.f3814 = r1
            r5 = 0
            r3[r2] = r5
            r5 = 1
            int r2 = r2 - r5
            r12.f485 = r2
            if (r13 != r4) goto L19
            return
        L19:
            long r6 = r13.f3813
            long r8 = r4.f3813
            long r8 = r8 - r6
            r6 = 0
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 >= 0) goto L25
            goto L2a
        L25:
            if (r13 != 0) goto L29
            r1 = 0
            goto L2a
        L29:
            r1 = r5
        L2a:
            if (r1 != 0) goto L31
            r3[r0] = r4
            r4.f3814 = r0
            return
        L31:
            if (r1 >= 0) goto L76
        L33:
            int r13 = r0 << 1
            int r1 = r13 + 1
            int r2 = r12.f485
            if (r1 > r2) goto L4f
            java.lang.Object r2 = r12.f486
            xhss.ᲈᲀᲇᛶ[] r2 = (xhss.C1181[]) r2
            r13 = r2[r13]
            r1 = r2[r1]
            long r8 = r13.f3813
            long r10 = r1.f3813
            long r10 = r10 - r8
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 >= 0) goto L4d
            goto L58
        L4d:
            r13 = r1
            goto L58
        L4f:
            if (r13 > r2) goto L6d
            java.lang.Object r1 = r12.f486
            r2 = r1
            xhss.ᲈᲀᲇᛶ[] r2 = (xhss.C1181[]) r2
            r13 = r2[r13]
        L58:
            long r8 = r4.f3813
            long r10 = r13.f3813
            long r10 = r10 - r8
            int r1 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r1 >= 0) goto L62
            goto L6d
        L62:
            if (r1 != 0) goto L65
            goto L6d
        L65:
            int r1 = r13.f3814
            r13.f3814 = r0
            r2[r0] = r13
            r0 = r1
            goto L33
        L6d:
            java.lang.Object r12 = r12.f486
            xhss.ᲈᲀᲇᛶ[] r12 = (xhss.C1181[]) r12
            r12[r0] = r4
            r4.f3814 = r0
            return
        L76:
            r12.m293(r0, r4)
            return
        L7a:
            java.lang.String r12 = "Failed requirement."
            xhss.C0532.m959(r12)
            return
    }
}
