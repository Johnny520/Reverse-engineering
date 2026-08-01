package defpackage;

/* JADX INFO: renamed from: ᛲᛱᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0240 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f1431;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.util.List f1432;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.util.List f1433;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C2080 f1434;

    public RunnableC0240(defpackage.C2080 r1, java.util.List r2, java.util.List r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f1434 = r1
            r0.f1433 = r2
            r0.f1432 = r3
            r0.f1431 = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r24 = this;
            r0 = r24
            ᛸᲈᛸᲈ r1 = new ᛸᲈᛸᲈ
            r2 = 5
            r1.<init>(r2, r0)
            java.util.List r2 = r0.f1433
            int r2 = r2.size()
            java.util.List r3 = r0.f1432
            int r3 = r3.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            ᲁᲈᛶᛴ r6 = new ᲁᲈᛶᛴ
            r6.<init>()
            r7 = 0
            r6.f8543 = r7
            r6.f8544 = r2
            r6.f8542 = r7
            r6.f8541 = r3
            r5.add(r6)
            int r2 = r2 + r3
            r3 = 1
            int r2 = r2 + r3
            int r2 = r2 / 2
            int r2 = r2 * 2
            int r2 = r2 + r3
            int[] r6 = new int[r2]
            int r8 = r2 / 2
            int[] r2 = new int[r2]
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L42:
            boolean r10 = r5.isEmpty()
            if (r10 != 0) goto L292
            int r10 = r5.size()
            int r10 = r10 - r3
            java.lang.Object r10 = r5.remove(r10)
            ᲁᲈᛶᛴ r10 = (defpackage.C1966) r10
            int r11 = r10.m3389()
            if (r11 < r3) goto L201
            int r11 = r10.m3388()
            if (r11 >= r3) goto L61
            goto L201
        L61:
            int r11 = r10.m3389()
            int r13 = r10.m3388()
            int r13 = r13 + r11
            int r13 = r13 + r3
            int r13 = r13 / 2
            int r11 = r10.f8543
            int r14 = r3 + r8
            r6[r14] = r11
            int r11 = r10.f8544
            r2[r14] = r11
            r11 = r7
        L78:
            if (r11 >= r13) goto L201
            int r14 = r10.m3389()
            int r15 = r10.m3388()
            int r14 = r14 - r15
            int r14 = java.lang.Math.abs(r14)
            int r14 = r14 % 2
            if (r14 != r3) goto L8d
            r14 = r3
            goto L8e
        L8d:
            r14 = r7
        L8e:
            int r15 = r10.m3389()
            int r16 = r10.m3388()
            int r15 = r15 - r16
            int r12 = -r11
            r3 = r12
        L9a:
            if (r3 > r11) goto L13c
            if (r3 == r12) goto Lbd
            if (r3 == r11) goto Lb1
            int r18 = r3 + 1
            int r18 = r18 + r8
            r7 = r6[r18]
            int r18 = r3 + (-1)
            int r18 = r18 + r8
            r19 = r3
            r3 = r6[r18]
            if (r7 <= r3) goto Lb3
            goto Lbf
        Lb1:
            r19 = r3
        Lb3:
            int r3 = r19 + (-1)
            int r3 = r3 + r8
            r3 = r6[r3]
            int r7 = r3 + 1
        Lba:
            r18 = r8
            goto Lc6
        Lbd:
            r19 = r3
        Lbf:
            int r3 = r19 + 1
            int r3 = r3 + r8
            r3 = r6[r3]
            r7 = r3
            goto Lba
        Lc6:
            int r8 = r10.f8542
            r20 = r8
            int r8 = r10.f8543
            int r8 = r7 - r8
            int r8 = r8 + r20
            int r8 = r8 - r19
            if (r11 == 0) goto Le0
            if (r7 == r3) goto Ld7
            goto Le0
        Ld7:
            int r20 = r8 + (-1)
            r23 = r20
            r20 = r7
            r7 = r23
            goto Le3
        Le0:
            r20 = r7
            r7 = r8
        Le3:
            r21 = r13
            r13 = r8
            r8 = r20
            r20 = r21
            r21 = r14
        Lec:
            int r14 = r10.f8544
            if (r8 >= r14) goto Lff
            int r14 = r10.f8541
            if (r13 >= r14) goto Lff
            boolean r14 = r1.m2899(r8, r13)
            if (r14 == 0) goto Lff
            int r8 = r8 + 1
            int r13 = r13 + 1
            goto Lec
        Lff:
            int r14 = r19 + r18
            r6[r14] = r8
            if (r21 == 0) goto L12a
            int r14 = r15 - r19
            r22 = r15
            int r15 = r12 + 1
            if (r14 < r15) goto L128
            int r15 = r11 + (-1)
            if (r14 > r15) goto L128
            int r14 = r14 + r18
            r14 = r2[r14]
            if (r14 > r8) goto L128
            ᲇᛱᛳᛲ r14 = new ᲇᛱᛳᛲ
            r14.<init>()
            r14.f8561 = r3
            r14.f8562 = r7
            r14.f8560 = r8
            r14.f8559 = r13
            r3 = 0
            r14.f8558 = r3
            goto L142
        L128:
            r3 = 0
            goto L12d
        L12a:
            r22 = r15
            goto L128
        L12d:
            int r7 = r19 + 2
            r8 = r7
            r7 = r3
            r3 = r8
            r8 = r18
            r13 = r20
            r14 = r21
            r15 = r22
            goto L9a
        L13c:
            r3 = r7
            r18 = r8
            r20 = r13
            r14 = 0
        L142:
            if (r14 == 0) goto L147
            r12 = r14
            goto L204
        L147:
            int r7 = r10.m3389()
            int r8 = r10.m3388()
            int r7 = r7 - r8
            int r7 = r7 % 2
            if (r7 != 0) goto L156
            r7 = 1
            goto L157
        L156:
            r7 = r3
        L157:
            int r8 = r10.m3389()
            int r13 = r10.m3388()
            int r8 = r8 - r13
            r13 = r12
        L161:
            if (r13 > r11) goto L1f2
            if (r13 == r12) goto L17f
            if (r13 == r11) goto L176
            int r14 = r13 + 1
            int r14 = r14 + r18
            r14 = r2[r14]
            int r15 = r13 + (-1)
            int r15 = r15 + r18
            r15 = r2[r15]
            if (r14 >= r15) goto L176
            goto L17f
        L176:
            int r14 = r13 + (-1)
            int r14 = r14 + r18
            r14 = r2[r14]
            int r15 = r14 + (-1)
            goto L186
        L17f:
            int r14 = r13 + 1
            int r14 = r14 + r18
            r14 = r2[r14]
            r15 = r14
        L186:
            int r3 = r10.f8541
            r19 = r3
            int r3 = r10.f8544
            int r3 = r3 - r15
            int r3 = r3 - r13
            int r3 = r19 - r3
            if (r11 == 0) goto L19e
            if (r15 == r14) goto L195
            goto L19e
        L195:
            int r19 = r3 + 1
            r23 = r19
            r19 = r3
            r3 = r23
            goto L1a0
        L19e:
            r19 = r3
        L1a0:
            r21 = r19
            r19 = r7
            r7 = r15
            r15 = r21
            r21 = r8
        L1a9:
            int r8 = r10.f8543
            if (r7 <= r8) goto L1c4
            int r8 = r10.f8542
            if (r15 <= r8) goto L1c4
            int r8 = r7 + (-1)
            r22 = r13
            int r13 = r15 + (-1)
            boolean r8 = r1.m2899(r8, r13)
            if (r8 == 0) goto L1c6
            int r7 = r7 + (-1)
            int r15 = r15 + (-1)
            r13 = r22
            goto L1a9
        L1c4:
            r22 = r13
        L1c6:
            int r13 = r22 + r18
            r2[r13] = r7
            if (r19 == 0) goto L1e9
            int r8 = r21 - r22
            if (r8 < r12) goto L1e9
            if (r8 > r11) goto L1e9
            int r8 = r8 + r18
            r8 = r6[r8]
            if (r8 < r7) goto L1e9
            ᲇᛱᛳᛲ r8 = new ᲇᛱᛳᛲ
            r8.<init>()
            r8.f8561 = r7
            r8.f8562 = r15
            r8.f8560 = r14
            r8.f8559 = r3
            r3 = 1
            r8.f8558 = r3
            goto L1f3
        L1e9:
            int r13 = r22 + 2
            r7 = r19
            r8 = r21
            r3 = 0
            goto L161
        L1f2:
            r8 = 0
        L1f3:
            if (r8 == 0) goto L1f7
            r12 = r8
            goto L204
        L1f7:
            int r11 = r11 + 1
            r8 = r18
            r13 = r20
            r3 = 1
            r7 = 0
            goto L78
        L201:
            r18 = r8
            r12 = 0
        L204:
            if (r12 == 0) goto L289
            int r3 = r12.m3391()
            if (r3 <= 0) goto L248
            int r3 = r12.f8559
            int r7 = r12.f8562
            int r3 = r3 - r7
            int r8 = r12.f8560
            int r11 = r12.f8561
            int r8 = r8 - r11
            if (r3 == r8) goto L240
            boolean r13 = r12.f8558
            if (r13 == 0) goto L226
            ᛸᛵᛵᛵ r3 = new ᛸᛵᛵᛵ
            int r8 = r12.m3391()
            r3.<init>(r11, r7, r8)
            goto L245
        L226:
            if (r3 <= r8) goto L234
            ᛸᛵᛵᛵ r3 = new ᛸᛵᛵᛵ
            int r7 = r7 + 1
            int r8 = r12.m3391()
            r3.<init>(r11, r7, r8)
            goto L245
        L234:
            ᛸᛵᛵᛵ r3 = new ᛸᛵᛵᛵ
            int r11 = r11 + 1
            int r8 = r12.m3391()
            r3.<init>(r11, r7, r8)
            goto L245
        L240:
            ᛸᛵᛵᛵ r3 = new ᛸᛵᛵᛵ
            r3.<init>(r11, r7, r8)
        L245:
            r4.add(r3)
        L248:
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L254
            ᲁᲈᛶᛴ r3 = new ᲁᲈᛶᛴ
            r3.<init>()
            goto L262
        L254:
            int r3 = r9.size()
            r17 = 1
            int r3 = r3 + (-1)
            java.lang.Object r3 = r9.remove(r3)
            ᲁᲈᛶᛴ r3 = (defpackage.C1966) r3
        L262:
            int r7 = r10.f8543
            r3.f8543 = r7
            int r7 = r10.f8542
            r3.f8542 = r7
            int r7 = r12.f8561
            r3.f8544 = r7
            int r7 = r12.f8562
            r3.f8541 = r7
            r5.add(r3)
            int r3 = r10.f8544
            r10.f8544 = r3
            int r3 = r10.f8541
            r10.f8541 = r3
            int r3 = r12.f8560
            r10.f8543 = r3
            int r3 = r12.f8559
            r10.f8542 = r3
            r5.add(r10)
            goto L28c
        L289:
            r9.add(r10)
        L28c:
            r8 = r18
            r3 = 1
            r7 = 0
            goto L42
        L292:
            ᲇᛵᲀᲇ r3 = defpackage.AbstractC2193.f9303
            java.util.Collections.sort(r4, r3)
            ᛸᛶᛸᛳ r3 = new ᛸᛶᛸᛳ
            r3.<init>(r1, r4, r6, r2)
            ᲇᛶᲇᲀ r1 = r0.f1434
            ᲈᲇᲇᲀ r1 = r1.f8919
            ᛱᲈᛷᲀ r2 = new ᛱᲈᛷᲀ
            r4 = 1
            r2.<init>(r0, r4, r3)
            r1.execute(r2)
            return
    }
}
