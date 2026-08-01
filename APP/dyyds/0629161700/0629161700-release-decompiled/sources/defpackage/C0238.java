package defpackage;

/* JADX INFO: renamed from: ᛲᛱᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0238 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.String f1423;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.InterfaceC1398 f1424;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC0933 f1425;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Class f1426;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.util.List f1427;

    public C0238(java.lang.Class r1, java.lang.Class r2, java.lang.Class r3, java.util.List r4, defpackage.InterfaceC0933 r5, defpackage.InterfaceC1398 r6) {
            r0 = this;
            r0.<init>()
            r0.f1426 = r1
            r0.f1427 = r4
            r0.f1425 = r5
            r0.f1424 = r6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed DecodePath{"
            r4.<init>(r5)
            java.lang.String r1 = r1.getSimpleName()
            r4.append(r1)
            java.lang.String r1 = "->"
            r4.append(r1)
            java.lang.String r2 = r2.getSimpleName()
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r3.getSimpleName()
            r4.append(r1)
            java.lang.String r1 = "}"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.f1423 = r1
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DecodePath{ dataClass="
            r0.<init>(r1)
            java.lang.Class r1 = r2.f1426
            r0.append(r1)
            java.lang.String r1 = ", decoders="
            r0.append(r1)
            java.util.List r1 = r2.f1427
            r0.append(r1)
            java.lang.String r1 = ", transcoder="
            r0.append(r1)
            ᛵᛷᛸᛲ r2 = r2.f1425
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.InterfaceC1901 m847(int r18, int r19, defpackage.C2073 r20, defpackage.InterfaceC0590 r21, defpackage.C0533 r22) {
            r17 = this;
            r0 = r17
            r6 = r20
            ᛷᲈᛲᛶ r7 = r0.f1424
            java.lang.Object r1 = r7.mo913()
            r5 = r1
            java.util.List r5 = (java.util.List) r5
            java.lang.String r1 = "Argument must not be null"
            defpackage.C0292.m944(r5, r1)
            r2 = r18
            r3 = r19
            r1 = r21
            r4 = r22
            ᲁᛸᛸ r1 = r0.m848(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L13e
            r7.mo914(r5)
            java.lang.Object r2 = r6.f8900
            ᛸᛱᲁᛵ r2 = (defpackage.RunnableC1425) r2
            int r3 = r6.f8901
            ᛴᛶᛱᛲ r4 = r2.f6269
            java.lang.Object r5 = r1.get()
            java.lang.Class r13 = r5.getClass()
            r5 = 4
            if (r3 == r5) goto L45
            ᛴᛴᲀᛶ r7 = r4.m1569(r13)
            ᛵᛶᛳᲇ r8 = r2.f6270
            int r9 = r2.f6271
            int r10 = r2.f6259
            ᲁᛸᛸ r8 = r7.mo1493(r8, r1, r9, r10)
            r12 = r7
            r15 = r8
            goto L47
        L45:
            r15 = r1
            r12 = 0
        L47:
            boolean r7 = r1.equals(r15)
            if (r7 != 0) goto L50
            r1.mo692()
        L50:
            ᛵᛶᛳᲇ r1 = r4.f3296
            ᲈᲈᛲᲇ r1 = r1.m1877()
            ᛳᲈᛳᛸ r1 = r1.f10237
            java.lang.Class r7 = r15.mo693()
            ᛶᛶᛴᲁ r1 = r1.m1389(r7)
            r7 = 3
            if (r1 == 0) goto L86
            ᛵᛶᛳᲇ r1 = r4.f3296
            ᲈᲈᛲᲇ r1 = r1.m1877()
            ᛳᲈᛳᛸ r1 = r1.f10237
            java.lang.Class r8 = r15.mo693()
            ᛶᛶᛴᲁ r1 = r1.m1389(r8)
            if (r1 == 0) goto L7c
            ᛳᛸᲁᛶ r8 = r2.f6276
            int r8 = r1.mo1358(r8)
            goto L88
        L7c:
            ᲇᲇᛳᲀ r0 = new ᲇᲇᛳᲀ
            java.lang.Class r1 = r15.mo693()
            r0.<init>(r1)
            throw r0
        L86:
            r8 = r7
            r1 = 0
        L88:
            ᲀᛷᛶᲈ r9 = r2.f6281
            java.util.ArrayList r10 = r4.m1573()
            int r11 = r10.size()
            r18 = 0
            r6 = 0
        L95:
            r5 = 1
            if (r6 >= r11) goto Lad
            java.lang.Object r16 = r10.get(r6)
            r14 = r16
            ᛳᛱᛱᛲ r14 = (defpackage.C0402) r14
            ᲀᛷᛶᲈ r14 = r14.f2057
            boolean r14 = r14.equals(r9)
            if (r14 == 0) goto Laa
            r6 = r5
            goto Lae
        Laa:
            int r6 = r6 + 1
            goto L95
        Lad:
            r6 = 0
        Lae:
            ᛸᛶᛵᛲ r9 = r2.f6280
            int r9 = r9.f6659
            r10 = 2
            switch(r9) {
                case 0: goto Lc2;
                case 1: goto Lc0;
                case 2: goto Lc0;
                default: goto Lb6;
            }
        Lb6:
            if (r6 != 0) goto Lba
            if (r3 == r7) goto Lbc
        Lba:
            if (r3 != r5) goto Lc0
        Lbc:
            if (r8 != r10) goto Lc0
        Lbe:
            r3 = r5
            goto Lc9
        Lc0:
            r3 = 0
            goto Lc9
        Lc2:
            r6 = 4
            if (r3 == r6) goto Lc0
            r6 = 5
            if (r3 == r6) goto Lc0
            goto Lbe
        Lc9:
            if (r3 == 0) goto L135
            if (r1 == 0) goto L127
            int r3 = defpackage.AbstractC0225.m812(r8)
            if (r3 == 0) goto L105
            if (r3 != r5) goto Lea
            ᛴᲈᲇᛶ r6 = new ᛴᲈᲇᛶ
            ᛵᛶᛳᲇ r3 = r4.f3296
            ᲇᛶᛳᛱ r7 = r3.f4138
            ᲀᛷᛶᲈ r8 = r2.f6281
            ᲀᛷᛶᲈ r9 = r2.f6252
            int r10 = r2.f6271
            int r11 = r2.f6259
            ᛳᛸᲁᛶ r14 = r2.f6276
            r3 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L10f
        Lea:
            if (r8 == r5) goto Lf9
            if (r8 == r10) goto Lf6
            if (r8 == r7) goto Lf3
            java.lang.String r0 = "null"
            goto Lfb
        Lf3:
            java.lang.String r0 = "NONE"
            goto Lfb
        Lf6:
            java.lang.String r0 = "TRANSFORMED"
            goto Lfb
        Lf9:
            java.lang.String r0 = "SOURCE"
        Lfb:
            java.lang.String r1 = "Unknown strategy: "
            java.lang.String r0 = r1.concat(r0)
            defpackage.C2264.m3684(r0)
            return r18
        L105:
            r3 = 0
            ᲈᛲᛴᲀ r6 = new ᲈᛲᛴᲀ
            ᲀᛷᛶᲈ r4 = r2.f6281
            ᲀᛷᛶᲈ r7 = r2.f6252
            r6.<init>(r4, r7)
        L10f:
            ᛷᛸᛱᛸ r4 = defpackage.C0822.f3784
            java.lang.Object r4 = r4.mo913()
            ᛵᛲᛲ r4 = (defpackage.C0822) r4
            r4.f3788 = r3
            r4.f3785 = r5
            r4.f3786 = r15
            ᛷᛸᛱᛸ r2 = r2.f6251
            r2.f5856 = r6
            r2.f5857 = r1
            r2.f5859 = r4
            r15 = r4
            goto L135
        L127:
            ᲇᲇᛳᲀ r0 = new ᲇᲇᛳᲀ
            java.lang.Object r1 = r15.get()
            java.lang.Class r1 = r1.getClass()
            r0.<init>(r1)
            throw r0
        L135:
            ᛵᛷᛸᛲ r0 = r0.f1425
            r4 = r22
            ᲁᛸᛸ r0 = r0.mo1886(r15, r4)
            return r0
        L13e:
            r0 = move-exception
            r7.mo914(r5)
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC1901 m848(defpackage.InterfaceC0590 r10, int r11, int r12, defpackage.C0533 r13, java.util.List r14) {
            r9 = this;
            java.util.List r0 = r9.f1427
            int r1 = r0.size()
            r2 = 0
            r3 = 0
        L8:
            if (r3 >= r1) goto L47
            java.lang.Object r4 = r0.get(r3)
            ᛲᲈᛷᛲ r4 = (defpackage.InterfaceC0391) r4
            java.lang.Object r5 = r10.mo229()     // Catch: java.lang.Throwable -> L23
            boolean r5 = r4.mo383(r5, r13)     // Catch: java.lang.Throwable -> L23
            if (r5 == 0) goto L41
            java.lang.Object r5 = r10.mo229()     // Catch: java.lang.Throwable -> L23
            ᲁᛸᛸ r2 = r4.mo382(r5, r11, r12, r13)     // Catch: java.lang.Throwable -> L23
            goto L41
        L23:
            r5 = move-exception
            r6 = 2
            java.lang.String r7 = "DecodePath"
            boolean r6 = android.util.Log.isLoggable(r7, r6)
            if (r6 == 0) goto L3e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to decode data for "
            r6.<init>(r8)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.util.Log.v(r7, r4, r5)
        L3e:
            r14.add(r5)
        L41:
            if (r2 == 0) goto L44
            goto L47
        L44:
            int r3 = r3 + 1
            goto L8
        L47:
            if (r2 == 0) goto L4a
            return r2
        L4a:
            ᛵᲈᛳᛲ r10 = new ᛵᲈᛳᛲ
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r14)
            java.lang.String r9 = r9.f1423
            r10.<init>(r11, r9)
            throw r10
    }
}
