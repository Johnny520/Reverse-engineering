package defpackage;

/* JADX INFO: renamed from: ᛱᛳᲈᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0066 extends android.database.Observable {
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m486(int r7, int r8) {
            r6 = this;
            java.util.ArrayList r0 = r6.mObservers
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L3b
            java.util.ArrayList r2 = r6.mObservers
            java.lang.Object r2 = r2.get(r0)
            ᛷᛷᲇᛳ r2 = (defpackage.AbstractC1319) r2
            ᛸᛱᲇ r2 = (defpackage.C1426) r2
            ᛱᛳᛶᛱ r3 = r2.f6284
            r4 = 0
            r3.m416(r4)
            ᛵᛴᛴᛳ r3 = r3.f686
            java.lang.Object r5 = r3.f3923
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            if (r8 >= r1) goto L23
            goto L38
        L23:
            ᲀᛵᛳᛵ r4 = r3.m1825(r4, r1, r7, r8)
            r5.add(r4)
            int r4 = r3.f3924
            r4 = r4 | r1
            r3.f3924 = r4
            int r3 = r5.size()
            if (r3 != r1) goto L38
            r2.m2618()
        L38:
            int r0 = r0 + (-1)
            goto L8
        L3b:
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m487(int r8, int r9, java.lang.Object r10) {
            r7 = this;
            java.util.ArrayList r0 = r7.mObservers
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L3c
            java.util.ArrayList r2 = r7.mObservers
            java.lang.Object r2 = r2.get(r0)
            ᛷᛷᲇᛳ r2 = (defpackage.AbstractC1319) r2
            ᛸᛱᲇ r2 = (defpackage.C1426) r2
            ᛱᛳᛶᛱ r3 = r2.f6284
            r4 = 0
            r3.m416(r4)
            ᛵᛴᛴᛳ r3 = r3.f686
            java.lang.Object r4 = r3.f3923
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r9 >= r1) goto L23
            goto L39
        L23:
            r5 = 4
            ᲀᛵᛳᛵ r6 = r3.m1825(r10, r5, r8, r9)
            r4.add(r6)
            int r6 = r3.f3924
            r5 = r5 | r6
            r3.f3924 = r5
            int r3 = r4.size()
            if (r3 != r1) goto L39
            r2.m2618()
        L39:
            int r0 = r0 + (-1)
            goto L8
        L3c:
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m488(int r8, int r9) {
            r7 = this;
            java.util.ArrayList r0 = r7.mObservers
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L3d
            java.util.ArrayList r2 = r7.mObservers
            java.lang.Object r2 = r2.get(r0)
            ᛷᛷᲇᛳ r2 = (defpackage.AbstractC1319) r2
            ᛸᛱᲇ r2 = (defpackage.C1426) r2
            ᛱᛳᛶᛱ r3 = r2.f6284
            r4 = 0
            r3.m416(r4)
            ᛵᛴᛴᛳ r3 = r3.f686
            java.lang.Object r5 = r3.f3923
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            if (r8 != r9) goto L23
            goto L3a
        L23:
            r6 = 8
            ᲀᛵᛳᛵ r4 = r3.m1825(r4, r6, r8, r9)
            r5.add(r4)
            int r4 = r3.f3924
            r4 = r4 | r6
            r3.f3924 = r4
            int r3 = r5.size()
            if (r3 != r1) goto L3a
            r2.m2618()
        L3a:
            int r0 = r0 + (-1)
            goto L8
        L3d:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean m489() {
            r0 = this;
            java.util.ArrayList r0 = r0.mObservers
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m490() {
            r4 = this;
            java.util.ArrayList r0 = r4.mObservers
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L2f
            java.util.ArrayList r2 = r4.mObservers
            java.lang.Object r2 = r2.get(r0)
            ᛷᛷᲇᛳ r2 = (defpackage.AbstractC1319) r2
            ᛸᛱᲇ r2 = (defpackage.C1426) r2
            ᛱᛳᛶᛱ r2 = r2.f6284
            r3 = 0
            r2.m416(r3)
            ᛵᲈᲁᲀ r3 = r2.f623
            r3.f4457 = r1
            r2.m447(r1)
            ᛵᛴᛴᛳ r3 = r2.f686
            boolean r3 = r3.m1837()
            if (r3 != 0) goto L2c
            r2.requestLayout()
        L2c:
            int r0 = r0 + (-1)
            goto L8
        L2f:
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void m491(int r8, int r9) {
            r7 = this;
            java.util.ArrayList r0 = r7.mObservers
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L3c
            java.util.ArrayList r2 = r7.mObservers
            java.lang.Object r2 = r2.get(r0)
            ᛷᛷᲇᛳ r2 = (defpackage.AbstractC1319) r2
            ᛸᛱᲇ r2 = (defpackage.C1426) r2
            ᛱᛳᛶᛱ r3 = r2.f6284
            r4 = 0
            r3.m416(r4)
            ᛵᛴᛴᛳ r3 = r3.f686
            java.lang.Object r5 = r3.f3923
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            if (r9 >= r1) goto L23
            goto L39
        L23:
            r6 = 2
            ᲀᛵᛳᛵ r4 = r3.m1825(r4, r6, r8, r9)
            r5.add(r4)
            int r4 = r3.f3924
            r4 = r4 | r6
            r3.f3924 = r4
            int r3 = r5.size()
            if (r3 != r1) goto L39
            r2.m2618()
        L39:
            int r0 = r0 + (-1)
            goto L8
        L3c:
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final void m492() {
            r3 = this;
            java.util.ArrayList r0 = r3.mObservers
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L2b
            java.util.ArrayList r1 = r3.mObservers
            java.lang.Object r1 = r1.get(r0)
            ᛷᛷᲇᛳ r1 = (defpackage.AbstractC1319) r1
            ᛸᛱᲇ r1 = (defpackage.C1426) r1
            ᛱᛳᛶᛱ r1 = r1.f6284
            ᛱᲀᲁᛴ r2 = r1.f681
            if (r2 != 0) goto L1b
            goto L28
        L1b:
            ᛶᲈᲀᲇ r2 = r1.f633
            if (r2 == 0) goto L28
            boolean r2 = r2.canRestoreState()
            if (r2 == 0) goto L28
            r1.requestLayout()
        L28:
            int r0 = r0 + (-1)
            goto L8
        L2b:
            return
    }
}
