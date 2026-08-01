package defpackage;

/* JADX INFO: renamed from: ᲀᛲᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1633 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0055 f7309;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f7310;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.util.List f7311;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.ArrayList f7312;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.ArrayList f7313;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public java.util.ArrayList f7314;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f7315;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.C1882 f7316;

    public C1633(defpackage.C0055 r2) {
            r1 = this;
            r1.<init>()
            r1.f7309 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f7313 = r2
            r0 = 0
            r1.f7314 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f7312 = r0
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f7311 = r2
            r2 = 2
            r1.f7310 = r2
            r1.f7315 = r2
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final void m2999(android.view.View r4) {
            r3 = this;
            ᲈᛸᲈᛷ r0 = defpackage.C0055.m405(r4)
            boolean r1 = r0.m3777()
            ᛱᛳᛶᛱ r2 = r3.f7309
            if (r1 == 0) goto L10
            r1 = 0
            r2.removeDetachedView(r4, r1)
        L10:
            boolean r4 = r0.m3776()
            if (r4 == 0) goto L1c
            ᲀᛲᲁᛳ r4 = r0.f9793
            r4.m3001(r0)
            goto L28
        L1c:
            boolean r4 = r0.m3788()
            if (r4 == 0) goto L28
            int r4 = r0.f9792
            r4 = r4 & (-33)
            r0.f9792 = r4
        L28:
            r3.m3002(r0)
            ᛱᛳᛸᛶ r3 = r2.f658
            if (r3 == 0) goto L3a
            boolean r3 = r0.m3778()
            if (r3 != 0) goto L3a
            ᛱᛳᛸᛶ r3 = r2.f658
            r3.mo472(r0)
        L3a:
            return
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final defpackage.AbstractC2316 m3000(long r31, int r33) {
            r30 = this;
            r0 = r30
            r1 = r33
            ᛱᛳᛶᛱ r2 = r0.f7309
            ᛵᲈᲁᲀ r3 = r2.f623
            if (r1 < 0) goto L569
            int r4 = r3.m1957()
            if (r1 >= r4) goto L569
            boolean r4 = r3.f4458
            r5 = 32
            r6 = 0
            r8 = 0
            if (r4 == 0) goto L83
            java.util.ArrayList r4 = r0.f7314
            if (r4 == 0) goto L7e
            int r4 = r4.size()
            if (r4 != 0) goto L23
            goto L7e
        L23:
            r9 = r8
        L24:
            if (r9 >= r4) goto L41
            java.util.ArrayList r10 = r0.f7314
            java.lang.Object r10 = r10.get(r9)
            ᲈᛸᲈᛷ r10 = (defpackage.AbstractC2316) r10
            boolean r11 = r10.m3788()
            if (r11 != 0) goto L3e
            int r11 = r10.m3782()
            if (r11 != r1) goto L3e
            r10.m3784(r5)
            goto L7f
        L3e:
            int r9 = r9 + 1
            goto L24
        L41:
            ᛶᲈᲀᲇ r9 = r2.f633
            boolean r9 = r9.hasStableIds()
            if (r9 == 0) goto L7e
            ᛵᛴᛴᛳ r9 = r2.f686
            int r9 = r9.m1843(r1, r8)
            if (r9 <= 0) goto L7e
            ᛶᲈᲀᲇ r10 = r2.f633
            int r10 = r10.getItemCount()
            if (r9 >= r10) goto L7e
            ᛶᲈᲀᲇ r10 = r2.f633
            long r9 = r10.getItemId(r9)
            r11 = r8
        L60:
            if (r11 >= r4) goto L7e
            java.util.ArrayList r12 = r0.f7314
            java.lang.Object r12 = r12.get(r11)
            ᲈᛸᲈᛷ r12 = (defpackage.AbstractC2316) r12
            boolean r13 = r12.m3788()
            if (r13 != 0) goto L7b
            long r13 = r12.f9787
            int r13 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r13 != 0) goto L7b
            r12.m3784(r5)
            r10 = r12
            goto L7f
        L7b:
            int r11 = r11 + 1
            goto L60
        L7e:
            r10 = r6
        L7f:
            if (r10 == 0) goto L84
            r4 = 1
            goto L85
        L83:
            r10 = r6
        L84:
            r4 = r8
        L85:
            java.util.ArrayList r9 = r0.f7313
            java.util.ArrayList r11 = r0.f7312
            java.lang.String r12 = "RecyclerView"
            if (r10 != 0) goto L262
            int r10 = r9.size()
            r13 = r8
        L92:
            if (r13 >= r10) goto Lc1
            java.lang.Object r14 = r9.get(r13)
            ᲈᛸᲈᛷ r14 = (defpackage.AbstractC2316) r14
            boolean r15 = r14.m3788()
            if (r15 != 0) goto Lbe
            int r15 = r14.m3782()
            if (r15 != r1) goto Lbe
            boolean r15 = r14.m3775()
            if (r15 != 0) goto Lbe
            boolean r15 = r3.f4458
            if (r15 != 0) goto Lb6
            boolean r15 = r14.m3785()
            if (r15 != 0) goto Lbe
        Lb6:
            r14.m3784(r5)
            r10 = r14
            r17 = 1
            goto L1c4
        Lbe:
            int r13 = r13 + 1
            goto L92
        Lc1:
            ᲈᛷᲀᲀ r10 = r2.f611
            java.lang.Object r10 = r10.f9714
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r13 = r10.size()
            r14 = r8
        Lcc:
            if (r14 >= r13) goto Lf0
            java.lang.Object r15 = r10.get(r14)
            android.view.View r15 = (android.view.View) r15
            ᲈᛸᲈᛷ r16 = defpackage.C0055.m405(r15)
            r17 = 1
            int r7 = r16.m3782()
            if (r7 != r1) goto Led
            boolean r7 = r16.m3775()
            if (r7 != 0) goto Led
            boolean r7 = r16.m3785()
            if (r7 != 0) goto Led
            goto Lf3
        Led:
            int r14 = r14 + 1
            goto Lcc
        Lf0:
            r17 = 1
            r15 = r6
        Lf3:
            if (r15 == 0) goto L17f
            ᲈᛸᲈᛷ r7 = defpackage.C0055.m405(r15)
            ᲈᛷᲀᲀ r10 = r2.f611
            java.lang.Object r13 = r10.f9710
            ᛱᲀᛸᛴ r13 = (defpackage.C0167) r13
            java.lang.Object r14 = r10.f9711
            ᲀᛴᛴᛸ r14 = (defpackage.C1662) r14
            ᛱᛳᛶᛱ r14 = r14.f7409
            int r14 = r14.indexOfChild(r15)
            if (r14 < 0) goto L179
            boolean r16 = r13.m699(r14)
            if (r16 == 0) goto L165
            r13.m701(r14)
            r10.m3724(r15)
            ᲈᛷᲀᲀ r10 = r2.f611
            java.lang.Object r13 = r10.f9710
            ᛱᲀᛸᛴ r13 = (defpackage.C0167) r13
            java.lang.Object r10 = r10.f9711
            ᲀᛴᛴᛸ r10 = (defpackage.C1662) r10
            ᛱᛳᛶᛱ r10 = r10.f7409
            int r10 = r10.indexOfChild(r15)
            r14 = -1
            if (r10 != r14) goto L12b
            goto L131
        L12b:
            boolean r16 = r13.m699(r10)
            if (r16 == 0) goto L133
        L131:
            r10 = r14
            goto L138
        L133:
            int r13 = r13.m702(r10)
            int r10 = r10 - r13
        L138:
            if (r10 == r14) goto L14a
            ᲈᛷᲀᲀ r13 = r2.f611
            r13.m3720(r10)
            r0.m3008(r15)
            r10 = 8224(0x2020, float:1.1524E-41)
            r7.m3784(r10)
            r10 = r7
            goto L1c4
        L14a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "layout index should not be -1 after unhiding a view:"
            r1.<init>(r3)
            r1.append(r7)
            java.lang.String r2 = r2.m457()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L165:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "trying to unhide a view that was not hidden"
            r1.<init>(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L179:
            java.lang.String r0 = "view is not a child, cannot hide "
            defpackage.C2264.m3685(r15, r0)
            return r6
        L17f:
            int r7 = r11.size()
            r10 = r8
        L184:
            if (r10 >= r7) goto L1c3
            java.lang.Object r13 = r11.get(r10)
            ᲈᛸᲈᛷ r13 = (defpackage.AbstractC2316) r13
            boolean r14 = r13.m3775()
            if (r14 != 0) goto L1c0
            int r14 = r13.m3782()
            if (r14 != r1) goto L1c0
            boolean r14 = r13.m3790()
            if (r14 != 0) goto L1c0
            r11.remove(r10)
            boolean r7 = defpackage.C0055.f605
            if (r7 == 0) goto L1be
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r10 = "getScrapOrHiddenOrCachedHolderForPosition("
            r7.<init>(r10)
            r7.append(r1)
            java.lang.String r10 = ") found match in cache: "
            r7.append(r10)
            r7.append(r13)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r12, r7)
        L1be:
            r10 = r13
            goto L1c4
        L1c0:
            int r10 = r10 + 1
            goto L184
        L1c3:
            r10 = r6
        L1c4:
            if (r10 == 0) goto L264
            boolean r7 = r10.m3785()
            if (r7 == 0) goto L1e6
            boolean r7 = defpackage.C0055.f603
            if (r7 == 0) goto L1e3
            boolean r7 = r3.f4458
            if (r7 == 0) goto L1d5
            goto L1e3
        L1d5:
            java.lang.String r0 = r2.m457()
            java.lang.String r1 = "should not receive a removed view unless it is pre layout"
            java.lang.String r0 = r1.concat(r0)
            defpackage.C2264.m3676(r0)
            return r6
        L1e3:
            boolean r7 = r3.f4458
            goto L21c
        L1e6:
            int r7 = r10.f9790
            if (r7 < 0) goto L247
            ᛶᲈᲀᲇ r13 = r2.f633
            int r13 = r13.getItemCount()
            if (r7 >= r13) goto L247
            boolean r7 = r3.f4458
            if (r7 != 0) goto L204
            ᛶᲈᲀᲇ r7 = r2.f633
            int r13 = r10.f9790
            int r7 = r7.getItemViewType(r13)
            int r13 = r10.f9797
            if (r7 == r13) goto L204
        L202:
            r7 = r8
            goto L21c
        L204:
            ᛶᲈᲀᲇ r7 = r2.f633
            boolean r7 = r7.hasStableIds()
            if (r7 == 0) goto L21a
            long r13 = r10.f9787
            ᛶᲈᲀᲇ r7 = r2.f633
            int r15 = r10.f9790
            long r15 = r7.getItemId(r15)
            int r7 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r7 != 0) goto L202
        L21a:
            r7 = r17
        L21c:
            if (r7 != 0) goto L244
            r7 = 4
            r10.m3784(r7)
            boolean r7 = r10.m3776()
            if (r7 == 0) goto L233
            android.view.View r7 = r10.f9791
            r2.removeDetachedView(r7, r8)
            ᲀᛲᲁᛳ r7 = r10.f9793
            r7.m3001(r10)
            goto L23f
        L233:
            boolean r7 = r10.m3788()
            if (r7 == 0) goto L23f
            int r7 = r10.f9792
            r7 = r7 & (-33)
            r10.f9792 = r7
        L23f:
            r0.m3002(r10)
            r10 = r6
            goto L264
        L244:
            r4 = r17
            goto L264
        L247:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Inconsistency detected. Invalid view holder adapter position"
            r1.<init>(r3)
            r1.append(r10)
            java.lang.String r2 = r2.m457()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L262:
            r17 = 1
        L264:
            r18 = 0
            r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r10 != 0) goto L40c
            ᛵᛴᛴᛳ r7 = r2.f686
            int r7 = r7.m1843(r1, r8)
            if (r7 < 0) goto L3dc
            r22 = 3
            ᛶᲈᲀᲇ r13 = r2.f633
            int r13 = r13.getItemCount()
            if (r7 >= r13) goto L3dc
            ᛶᲈᲀᲇ r13 = r2.f633
            int r13 = r13.getItemViewType(r7)
            ᛶᲈᲀᲇ r14 = r2.f633
            boolean r14 = r14.hasStableIds()
            if (r14 == 0) goto L324
            ᛶᲈᲀᲇ r10 = r2.f633
            long r24 = r10.getItemId(r7)
            int r10 = r9.size()
            int r10 = r10 + (-1)
        L299:
            if (r10 < 0) goto L2ec
            java.lang.Object r14 = r9.get(r10)
            ᲈᛸᲈᛷ r14 = (defpackage.AbstractC2316) r14
            r27 = r7
            long r6 = r14.f9787
            r28 = 4
            android.view.View r15 = r14.f9791
            int r6 = (r6 > r24 ? 1 : (r6 == r24 ? 0 : -1))
            if (r6 != 0) goto L2e6
            boolean r6 = r14.m3788()
            if (r6 != 0) goto L2e6
            int r6 = r14.f9797
            if (r13 != r6) goto L2ce
            r14.m3784(r5)
            boolean r5 = r14.m3785()
            if (r5 == 0) goto L2cc
            boolean r5 = r3.f4458
            if (r5 != 0) goto L2cc
            int r5 = r14.f9792
            r5 = r5 & (-15)
            r5 = r5 | 2
            r14.f9792 = r5
        L2cc:
            r10 = r14
            goto L31b
        L2ce:
            r9.remove(r10)
            r2.removeDetachedView(r15, r8)
            ᲈᛸᲈᛷ r6 = defpackage.C0055.m405(r15)
            r7 = 0
            r6.f9793 = r7
            r6.f9785 = r8
            int r7 = r6.f9792
            r7 = r7 & (-33)
            r6.f9792 = r7
            r0.m3002(r6)
        L2e6:
            int r10 = r10 + (-1)
            r7 = r27
            r6 = 0
            goto L299
        L2ec:
            r27 = r7
            r28 = 4
            int r5 = r11.size()
            int r5 = r5 + (-1)
        L2f6:
            if (r5 < 0) goto L316
            java.lang.Object r6 = r11.get(r5)
            ᲈᛸᲈᛷ r6 = (defpackage.AbstractC2316) r6
            long r9 = r6.f9787
            int r7 = (r9 > r24 ? 1 : (r9 == r24 ? 0 : -1))
            if (r7 != 0) goto L318
            boolean r7 = r6.m3790()
            if (r7 != 0) goto L318
            int r7 = r6.f9797
            if (r13 != r7) goto L313
            r11.remove(r5)
            r10 = r6
            goto L31b
        L313:
            r0.m3011(r5)
        L316:
            r10 = 0
            goto L31b
        L318:
            int r5 = r5 + (-1)
            goto L2f6
        L31b:
            if (r10 == 0) goto L326
            r5 = r27
            r10.f9790 = r5
            r4 = r17
            goto L326
        L324:
            r28 = 4
        L326:
            if (r10 != 0) goto L37f
            boolean r5 = defpackage.C0055.f605
            if (r5 == 0) goto L342
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "tryGetViewHolderForPositionByDeadline("
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r6 = ") fetching from shared pool"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r12, r5)
        L342:
            ᲁᛷᛴᲀ r5 = r0.m3006()
            android.util.SparseArray r5 = r5.f8171
            java.lang.Object r5 = r5.get(r13)
            ᛴᲇᲈᛵ r5 = (defpackage.C0790) r5
            if (r5 == 0) goto L376
            java.util.ArrayList r5 = r5.f3664
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L376
            int r6 = r5.size()
            int r6 = r6 + (-1)
        L35e:
            if (r6 < 0) goto L376
            java.lang.Object r7 = r5.get(r6)
            ᲈᛸᲈᛷ r7 = (defpackage.AbstractC2316) r7
            boolean r7 = r7.m3790()
            if (r7 != 0) goto L373
            java.lang.Object r5 = r5.remove(r6)
            ᲈᛸᲈᛷ r5 = (defpackage.AbstractC2316) r5
            goto L377
        L373:
            int r6 = r6 + (-1)
            goto L35e
        L376:
            r5 = 0
        L377:
            if (r5 == 0) goto L37e
            r5.m3779()
            boolean r6 = defpackage.C0055.f603
        L37e:
            r10 = r5
        L37f:
            if (r10 != 0) goto L410
            long r5 = r2.getNanoTime()
            int r7 = (r31 > r20 ? 1 : (r31 == r20 ? 0 : -1))
            if (r7 == 0) goto L39e
            ᲁᛷᛴᲀ r7 = r0.f7316
            ᛴᲇᲈᛵ r7 = r7.m3291(r13)
            long r9 = r7.f3665
            int r7 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r7 == 0) goto L39e
            long r9 = r9 + r5
            int r7 = (r9 > r31 ? 1 : (r9 == r31 ? 0 : -1))
            if (r7 >= 0) goto L39b
            goto L39e
        L39b:
            r26 = 0
            return r26
        L39e:
            ᛶᲈᲀᲇ r7 = r2.f633
            ᲈᛸᲈᛷ r10 = r7.createViewHolder(r2, r13)
            boolean r7 = defpackage.C0055.f608
            if (r7 == 0) goto L3b7
            android.view.View r7 = r10.f9791
            ᛱᛳᛶᛱ r7 = defpackage.C0055.m401(r7)
            if (r7 == 0) goto L3b7
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r7)
            r10.f9796 = r9
        L3b7:
            long r14 = r2.getNanoTime()
            ᲁᛷᛴᲀ r7 = r0.f7316
            long r14 = r14 - r5
            ᛴᲇᲈᛵ r5 = r7.m3291(r13)
            long r6 = r5.f3665
            int r9 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r9 != 0) goto L3c9
            goto L3d0
        L3c9:
            long r6 = r6 / r28
            long r6 = r6 * r22
            long r14 = r14 / r28
            long r14 = r14 + r6
        L3d0:
            r5.f3665 = r14
            boolean r5 = defpackage.C0055.f605
            if (r5 == 0) goto L410
            java.lang.String r5 = "tryGetViewHolderForPositionByDeadline created new ViewHolder"
            android.util.Log.d(r12, r5)
            goto L410
        L3dc:
            r5 = r7
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            int r3 = r3.m1957()
            java.lang.String r2 = r2.m457()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Inconsistency detected. Invalid item position "
            r4.<init>(r6)
            r4.append(r1)
            java.lang.String r1 = "(offset:"
            r4.append(r1)
            r4.append(r5)
            java.lang.String r1 = ").state:"
            r4.append(r1)
            r4.append(r3)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        L40c:
            r22 = 3
            r28 = 4
        L410:
            if (r4 == 0) goto L43a
            boolean r5 = r3.f4458
            if (r5 != 0) goto L43a
            int r5 = r10.f9792
            r6 = r5 & 8192(0x2000, float:1.148E-41)
            if (r6 == 0) goto L43a
            r5 = r5 & (-8193(0xffffffffffffdfff, float:NaN))
            r10.f9792 = r5
            boolean r5 = r3.f4454
            if (r5 == 0) goto L43a
            defpackage.AbstractC0059.m470(r10)
            ᛱᛳᛸᛶ r5 = r2.f658
            r10.m3780()
            r5.getClass()
            ᛱᛵᛳᲈ r5 = new ᛱᛵᛳᲈ
            r5.<init>()
            r5.m563(r10)
            r2.m427(r10, r5)
        L43a:
            boolean r5 = r3.f4458
            if (r5 == 0) goto L447
            boolean r5 = r10.m3792()
            if (r5 == 0) goto L447
            r10.f9799 = r1
            goto L45b
        L447:
            boolean r5 = r10.m3792()
            if (r5 == 0) goto L460
            int r5 = r10.f9792
            r5 = r5 & 2
            if (r5 == 0) goto L454
            goto L460
        L454:
            boolean r5 = r10.m3775()
            if (r5 == 0) goto L45b
            goto L460
        L45b:
            r1 = r8
            r0 = r17
            goto L538
        L460:
            boolean r5 = defpackage.C0055.f603
            if (r5 == 0) goto L486
            boolean r5 = r10.m3785()
            if (r5 != 0) goto L46b
            goto L486
        L46b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Removed holder should be bound and it should come here only in pre-layout. Holder: "
            r1.<init>(r3)
            r1.append(r10)
            java.lang.String r2 = r2.m457()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L486:
            ᛵᛴᛴᛳ r5 = r2.f686
            int r5 = r5.m1843(r1, r8)
            r7 = 0
            r10.f9786 = r7
            android.view.View r6 = r10.f9791
            r10.f9795 = r2
            int r9 = r10.f9797
            long r11 = r2.getNanoTime()
            int r13 = (r31 > r20 ? 1 : (r31 == r20 ? 0 : -1))
            if (r13 == 0) goto L4ae
            ᲁᛷᛴᲀ r13 = r0.f7316
            ᛴᲇᲈᛵ r9 = r13.m3291(r9)
            long r13 = r9.f3663
            int r9 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r9 == 0) goto L4ae
            long r13 = r13 + r11
            int r9 = (r13 > r31 ? 1 : (r13 == r31 ? 0 : -1))
            if (r9 >= 0) goto L45b
        L4ae:
            boolean r9 = r10.m3777()
            if (r9 == 0) goto L4c2
            int r9 = r2.getChildCount()
            android.view.ViewGroup$LayoutParams r13 = r6.getLayoutParams()
            defpackage.C0055.m402(r2, r6, r9, r13)
            r9 = r17
            goto L4c3
        L4c2:
            r9 = r8
        L4c3:
            ᛶᲈᲀᲇ r13 = r2.f633
            r13.bindViewHolder(r10, r5)
            if (r9 == 0) goto L4cd
            defpackage.C0055.m399(r2, r6)
        L4cd:
            long r13 = r2.getNanoTime()
            ᲁᛷᛴᲀ r0 = r0.f7316
            int r5 = r10.f9797
            long r13 = r13 - r11
            ᛴᲇᲈᛵ r0 = r0.m3291(r5)
            long r11 = r0.f3663
            int r5 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r5 != 0) goto L4e1
            goto L4e8
        L4e1:
            long r11 = r11 / r28
            long r11 = r11 * r22
            long r13 = r13 / r28
            long r13 = r13 + r11
        L4e8:
            r0.f3663 = r13
            android.view.accessibility.AccessibilityManager r0 = r2.f670
            if (r0 == 0) goto L52f
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L52f
            int r0 = r6.getImportantForAccessibility()
            if (r0 != 0) goto L500
            r0 = r17
            r6.setImportantForAccessibility(r0)
            goto L502
        L500:
            r0 = r17
        L502:
            ᲀᛸᲈᛶ r5 = r2.f613
            if (r5 != 0) goto L507
            goto L531
        L507:
            ᛲᛶᛴ r5 = r5.f7649
            if (r5 == 0) goto L52b
            java.util.WeakHashMap r9 = defpackage.AbstractC0858.f3911
            android.view.View$AccessibilityDelegate r9 = defpackage.AbstractC0756.m1675(r6)
            if (r9 != 0) goto L514
            goto L522
        L514:
            boolean r7 = r9 instanceof defpackage.C0256
            if (r7 == 0) goto L51d
            ᛲᛲᛸᲈ r9 = (defpackage.C0256) r9
            ᛶᲈᲈᛸ r7 = r9.f1508
            goto L522
        L51d:
            ᛶᲈᲈᛸ r7 = new ᛶᲈᲈᛸ
            r7.<init>(r9)
        L522:
            if (r7 == 0) goto L52b
            if (r7 == r5) goto L52b
            java.util.WeakHashMap r9 = r5.f1625
            r9.put(r6, r7)
        L52b:
            defpackage.AbstractC0858.m1813(r6, r5)
            goto L531
        L52f:
            r0 = r17
        L531:
            boolean r3 = r3.f4458
            if (r3 == 0) goto L537
            r10.f9799 = r1
        L537:
            r1 = r0
        L538:
            android.view.View r3 = r10.f9791
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            if (r5 != 0) goto L54a
            android.view.ViewGroup$LayoutParams r2 = r2.generateDefaultLayoutParams()
            ᛵᛲᲁᛴ r2 = (defpackage.C0840) r2
            r3.setLayoutParams(r2)
            goto L55d
        L54a:
            boolean r6 = r2.checkLayoutParams(r5)
            if (r6 != 0) goto L55a
            android.view.ViewGroup$LayoutParams r2 = r2.generateLayoutParams(r5)
            ᛵᛲᲁᛴ r2 = (defpackage.C0840) r2
            r3.setLayoutParams(r2)
            goto L55d
        L55a:
            r2 = r5
            ᛵᛲᲁᛴ r2 = (defpackage.C0840) r2
        L55d:
            r2.f3863 = r10
            if (r4 == 0) goto L565
            if (r1 == 0) goto L565
            r7 = r0
            goto L566
        L565:
            r7 = r8
        L566:
            r2.f3861 = r7
            return r10
        L569:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            int r3 = r3.m1957()
            java.lang.String r2 = r2.m457()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Invalid item position "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r5 = "("
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = "). Item count:"
            r4.append(r1)
            r4.append(r3)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final void m3001(defpackage.AbstractC2316 r2) {
            r1 = this;
            boolean r0 = r2.f9785
            if (r0 == 0) goto La
            java.util.ArrayList r1 = r1.f7314
            r1.remove(r2)
            goto Lf
        La:
            java.util.ArrayList r1 = r1.f7313
            r1.remove(r2)
        Lf:
            r1 = 0
            r2.f9793 = r1
            r1 = 0
            r2.f9785 = r1
            int r1 = r2.f9792
            r1 = r1 & (-33)
            r2.f9792 = r1
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final void m3002(defpackage.AbstractC2316 r13) {
            r12 = this;
            ᛱᛳᛶᛱ r0 = r12.f7309
            ᛱᛷᛴᲁ r1 = r0.f669
            boolean r2 = r13.m3776()
            android.view.View r3 = r13.f9791
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L11e
            android.view.ViewParent r2 = r3.getParent()
            if (r2 == 0) goto L16
            goto L11e
        L16:
            boolean r2 = r13.m3777()
            if (r2 != 0) goto L10c
            boolean r2 = r13.m3787()
            if (r2 != 0) goto Lfe
            int r2 = r13.f9792
            r2 = r2 & 16
            if (r2 != 0) goto L32
            java.util.WeakHashMap r2 = defpackage.AbstractC0858.f3911
            boolean r2 = r3.hasTransientState()
            if (r2 == 0) goto L32
            r2 = r5
            goto L33
        L32:
            r2 = r4
        L33:
            ᛶᲈᲀᲇ r6 = r0.f633
            if (r6 == 0) goto L41
            if (r2 == 0) goto L41
            boolean r6 = r6.onFailedToRecycleView(r13)
            if (r6 == 0) goto L41
            r6 = r5
            goto L42
        L41:
            r6 = r4
        L42:
            boolean r7 = defpackage.C0055.f603
            java.util.ArrayList r8 = r12.f7312
            if (r7 == 0) goto L61
            boolean r7 = r8.contains(r13)
            if (r7 != 0) goto L4f
            goto L61
        L4f:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r1 = "cached view received recycle internal? "
            r12.<init>(r1)
            r12.append(r13)
            java.lang.String r13 = r0.m457()
            defpackage.C2264.m3670(r12, r13)
            return
        L61:
            if (r6 != 0) goto L80
            boolean r6 = r13.m3778()
            if (r6 == 0) goto L6a
            goto L80
        L6a:
            boolean r12 = defpackage.C0055.f605
            if (r12 == 0) goto L7d
            java.lang.String r12 = r0.m457()
            java.lang.String r1 = "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists"
            java.lang.String r12 = r1.concat(r12)
            java.lang.String r1 = "RecyclerView"
            android.util.Log.d(r1, r12)
        L7d:
            r5 = r4
            goto Lea
        L80:
            int r6 = r12.f7315
            if (r6 <= 0) goto Le0
            int r6 = r13.f9792
            r6 = r6 & 526(0x20e, float:7.37E-43)
            if (r6 == 0) goto L8b
            goto Le0
        L8b:
            int r6 = r8.size()
            int r7 = r12.f7315
            if (r6 < r7) goto L9a
            if (r6 <= 0) goto L9a
            r12.m3011(r4)
            int r6 = r6 + (-1)
        L9a:
            boolean r7 = defpackage.C0055.f608
            if (r7 == 0) goto Ldb
            if (r6 <= 0) goto Ldb
            int r7 = r13.f9790
            int[] r9 = r1.f1059
            if (r9 == 0) goto Lb7
            int r9 = r1.f1058
            int r9 = r9 * 2
            r10 = r4
        Lab:
            if (r10 >= r9) goto Lb7
            int[] r11 = r1.f1059
            r11 = r11[r10]
            if (r11 != r7) goto Lb4
            goto Ldb
        Lb4:
            int r10 = r10 + 2
            goto Lab
        Lb7:
            int r6 = r6 + (-1)
        Lb9:
            if (r6 < 0) goto Lda
            java.lang.Object r7 = r8.get(r6)
            ᲈᛸᲈᛷ r7 = (defpackage.AbstractC2316) r7
            int r7 = r7.f9790
            int[] r9 = r1.f1059
            if (r9 == 0) goto Lda
            int r9 = r1.f1058
            int r9 = r9 * 2
            r10 = r4
        Lcc:
            if (r10 >= r9) goto Lda
            int[] r11 = r1.f1059
            r11 = r11[r10]
            if (r11 != r7) goto Ld7
            int r6 = r6 + (-1)
            goto Lb9
        Ld7:
            int r10 = r10 + 2
            goto Lcc
        Lda:
            int r6 = r6 + r5
        Ldb:
            r8.add(r6, r13)
            r1 = r5
            goto Le1
        Le0:
            r1 = r4
        Le1:
            if (r1 != 0) goto Le8
            r12.m3007(r13, r5)
        Le6:
            r4 = r1
            goto Lea
        Le8:
            r5 = r4
            goto Le6
        Lea:
            ᲁᛷᛵ r12 = r0.f618
            r12.m3306(r13)
            if (r4 != 0) goto Lfd
            if (r5 != 0) goto Lfd
            if (r2 == 0) goto Lfd
            defpackage.AbstractC0729.m1648(r3)
            r12 = 0
            r13.f9786 = r12
            r13.f9795 = r12
        Lfd:
            return
        Lfe:
            java.lang.String r12 = r0.m457()
            java.lang.String r13 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
            java.lang.String r12 = r13.concat(r12)
            defpackage.C2264.m3684(r12)
            return
        L10c:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r1 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
            r12.<init>(r1)
            r12.append(r13)
            java.lang.String r13 = r0.m457()
            defpackage.C2264.m3670(r12, r13)
            return
        L11e:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Scrapped or attached views may not be recycled. isScrap:"
            r1.<init>(r2)
            boolean r13 = r13.m3776()
            r1.append(r13)
            java.lang.String r13 = " isAttached:"
            r1.append(r13)
            android.view.ViewParent r13 = r3.getParent()
            if (r13 == 0) goto L13a
            r4 = r5
        L13a:
            r1.append(r4)
            java.lang.String r13 = r0.m457()
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r12.<init>(r13)
            throw r12
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m3003(defpackage.AbstractC1191 r4, boolean r5) {
            r3 = this;
            ᲁᛷᛴᲀ r3 = r3.f7316
            if (r3 == 0) goto L3f
            android.util.SparseArray r0 = r3.f8171
            java.util.Set r3 = r3.f8170
            r3.remove(r4)
            int r3 = r3.size()
            if (r3 != 0) goto L3f
            if (r5 != 0) goto L3f
            r3 = 0
            r4 = r3
        L15:
            int r5 = r0.size()
            if (r4 >= r5) goto L3f
            int r5 = r0.keyAt(r4)
            java.lang.Object r5 = r0.get(r5)
            ᛴᲇᲈᛵ r5 = (defpackage.C0790) r5
            java.util.ArrayList r5 = r5.f3664
            r1 = r3
        L28:
            int r2 = r5.size()
            if (r1 >= r2) goto L3c
            java.lang.Object r2 = r5.get(r1)
            ᲈᛸᲈᛷ r2 = (defpackage.AbstractC2316) r2
            android.view.View r2 = r2.f9791
            defpackage.AbstractC0729.m1648(r2)
            int r1 = r1 + 1
            goto L28
        L3c:
            int r4 = r4 + 1
            goto L15
        L3f:
            return
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final void m3004() {
            r4 = this;
            ᛱᛳᛶᛱ r0 = r4.f7309
            ᛷᛵᛱᲀ r0 = r0.f682
            if (r0 == 0) goto L9
            int r0 = r0.f5689
            goto La
        L9:
            r0 = 0
        La:
            int r1 = r4.f7310
            int r1 = r1 + r0
            r4.f7315 = r1
            java.util.ArrayList r0 = r4.f7312
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L17:
            if (r1 < 0) goto L27
            int r2 = r0.size()
            int r3 = r4.f7315
            if (r2 <= r3) goto L27
            r4.m3011(r1)
            int r1 = r1 + (-1)
            goto L17
        L27:
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m3005() {
            r2 = this;
            ᲁᛷᛴᲀ r0 = r2.f7316
            if (r0 == 0) goto L13
            ᛱᛳᛶᛱ r2 = r2.f7309
            ᛶᲈᲀᲇ r1 = r2.f633
            if (r1 == 0) goto L13
            boolean r2 = r2.f622
            if (r2 == 0) goto L13
            java.util.Set r2 = r0.f8170
            r2.add(r1)
        L13:
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1882 m3006() {
            r2 = this;
            ᲁᛷᛴᲀ r0 = r2.f7316
            if (r0 != 0) goto L23
            ᲁᛷᛴᲀ r0 = new ᲁᛷᛴᲀ
            r0.<init>()
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.f8171 = r1
            r1 = 0
            r0.f8172 = r1
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
            r0.f8170 = r1
            r2.f7316 = r0
            r2.m3005()
        L23:
            ᲁᛷᛴᲀ r2 = r2.f7316
            return r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m3007(defpackage.AbstractC2316 r5, boolean r6) {
            r4 = this;
            defpackage.C0055.m406(r5)
            android.view.View r0 = r5.f9791
            ᛱᛳᛶᛱ r1 = r4.f7309
            ᲀᛸᲈᛶ r2 = r1.f613
            r3 = 0
            if (r2 == 0) goto L1d
            ᛲᛶᛴ r2 = r2.f7649
            if (r2 == 0) goto L19
            java.util.WeakHashMap r2 = r2.f1625
            java.lang.Object r2 = r2.remove(r0)
            ᛶᲈᲈᛸ r2 = (defpackage.C1195) r2
            goto L1a
        L19:
            r2 = r3
        L1a:
            defpackage.AbstractC0858.m1813(r0, r2)
        L1d:
            if (r6 == 0) goto L5b
            java.util.ArrayList r6 = r1.f676
            int r2 = r6.size()
            if (r2 > 0) goto L4f
            ᛶᲈᲀᲇ r6 = r1.f633
            if (r6 == 0) goto L2e
            r6.onViewRecycled(r5)
        L2e:
            ᛵᲈᲁᲀ r6 = r1.f623
            if (r6 == 0) goto L37
            ᲁᛷᛵ r6 = r1.f618
            r6.m3306(r5)
        L37:
            boolean r6 = defpackage.C0055.f605
            if (r6 == 0) goto L5b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "dispatchViewRecycled: "
            r6.<init>(r1)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.d(r1, r6)
            goto L5b
        L4f:
            r4 = 0
            java.lang.Object r4 = r6.get(r4)
            r4.getClass()
            defpackage.C2264.m3679()
            return
        L5b:
            r5.f9786 = r3
            r5.f9795 = r3
            ᲁᛷᛴᲀ r4 = r4.m3006()
            r4.getClass()
            int r6 = r5.f9797
            ᛴᲇᲈᛵ r1 = r4.m3291(r6)
            java.util.ArrayList r1 = r1.f3664
            android.util.SparseArray r4 = r4.f8171
            java.lang.Object r4 = r4.get(r6)
            ᛴᲇᲈᛵ r4 = (defpackage.C0790) r4
            r4.getClass()
            r4 = 5
            int r6 = r1.size()
            if (r4 > r6) goto L84
            defpackage.AbstractC0729.m1648(r0)
            return
        L84:
            boolean r4 = defpackage.C0055.f603
            if (r4 == 0) goto L95
            boolean r4 = r1.contains(r5)
            if (r4 != 0) goto L8f
            goto L95
        L8f:
            java.lang.String r4 = "this scrap item already exists"
            defpackage.C2264.m3684(r4)
            return
        L95:
            r5.m3779()
            r1.add(r5)
            return
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final void m3008(android.view.View r4) {
            r3 = this;
            ᲈᛸᲈᛷ r4 = defpackage.C0055.m405(r4)
            int r0 = r4.f9792
            r0 = r0 & 12
            ᛱᛳᛶᛱ r1 = r3.f7309
            if (r0 == 0) goto Ld
            goto L42
        Ld:
            boolean r0 = r4.m3781()
            if (r0 == 0) goto L42
            ᛱᛳᛸᛶ r0 = r1.f658
            if (r0 == 0) goto L42
            java.util.List r2 = r4.m3780()
            ᛵᛳᲁᛳ r0 = (defpackage.C0857) r0
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L42
            boolean r0 = r0.f3909
            if (r0 == 0) goto L42
            boolean r0 = r4.m3775()
            if (r0 == 0) goto L2e
            goto L42
        L2e:
            java.util.ArrayList r0 = r3.f7314
            if (r0 != 0) goto L39
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f7314 = r0
        L39:
            r4.f9793 = r3
            r3 = 1
            r4.f9785 = r3
            r0.add(r4)
            return
        L42:
            boolean r0 = r4.m3775()
            if (r0 == 0) goto L65
            boolean r0 = r4.m3785()
            if (r0 != 0) goto L65
            ᛶᲈᲀᲇ r0 = r1.f633
            boolean r0 = r0.hasStableIds()
            if (r0 == 0) goto L57
            goto L65
        L57:
            java.lang.String r3 = r1.m457()
            java.lang.String r4 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
            java.lang.String r3 = r4.concat(r3)
            defpackage.C2264.m3684(r3)
            return
        L65:
            r4.f9793 = r3
            r0 = 0
            r4.f9785 = r0
            java.util.ArrayList r3 = r3.f7313
            r3.add(r4)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int m3009(int r5) {
            r4 = this;
            ᛱᛳᛶᛱ r4 = r4.f7309
            ᛵᲈᲁᲀ r0 = r4.f623
            if (r5 < 0) goto L19
            int r1 = r0.m1957()
            if (r5 >= r1) goto L19
            boolean r0 = r0.f4458
            if (r0 != 0) goto L11
            return r5
        L11:
            ᛵᛴᛴᛳ r4 = r4.f686
            r0 = 0
            int r4 = r4.m1843(r5, r0)
            return r4
        L19:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            int r0 = r0.m1957()
            java.lang.String r4 = r4.m457()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "invalid position "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = ". State item count is "
            r2.append(r5)
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void m3010() {
            r2 = this;
            java.util.ArrayList r0 = r2.f7312
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L8:
            if (r1 < 0) goto L10
            r2.m3011(r1)
            int r1 = r1 + (-1)
            goto L8
        L10:
            r0.clear()
            boolean r0 = defpackage.C0055.f608
            if (r0 == 0) goto L26
            ᛱᛳᛶᛱ r2 = r2.f7309
            ᛱᛷᛴᲁ r2 = r2.f669
            int[] r0 = r2.f1059
            if (r0 == 0) goto L23
            r1 = -1
            java.util.Arrays.fill(r0, r1)
        L23:
            r0 = 0
            r2.f1058 = r0
        L26:
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final void m3011(int r6) {
            r5 = this;
            boolean r0 = defpackage.C0055.f605
            java.lang.String r1 = "RecyclerView"
            if (r0 == 0) goto L17
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Recycling cached view at index "
            r0.<init>(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L17:
            java.util.ArrayList r0 = r5.f7312
            java.lang.Object r2 = r0.get(r6)
            ᲈᛸᲈᛷ r2 = (defpackage.AbstractC2316) r2
            boolean r3 = defpackage.C0055.f605
            if (r3 == 0) goto L34
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "CachedViewHolder to be recycled: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r1, r3)
        L34:
            r1 = 1
            r5.m3007(r2, r1)
            r0.remove(r6)
            return
    }
}
