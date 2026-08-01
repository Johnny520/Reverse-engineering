package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛳᛵᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0252 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public xhss.AbstractC0252 f936;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public java.lang.Boolean f937;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public int f938;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public xhss.AbstractC0252 f939;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public java.lang.Boolean f940;

    public AbstractC0252() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f937 = r0
            r1.f940 = r0
            r0 = -1
            r1.f938 = r0
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

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.toString()
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            boolean r0 = r2.m559()
            if (r0 == 0) goto Lb
            java.lang.String r2 = r2.mo130()
            return r2
        Lb:
            java.lang.String r0 = r2.mo130()
            xhss.ᛳᛳᛵᛱ r2 = r2.m560()
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public abstract java.lang.String mo130();

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final void m558(int r4, java.lang.String r5, java.lang.Object r6, xhss.C0530 r7) {
            r3 = this;
            java.lang.String r0 = java.lang.String.valueOf(r4)
            r1 = 4
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r1]
            r2 = 0
            r1[r2] = r5
            java.lang.String r5 = "["
            r2 = 1
            r1[r2] = r5
            r5 = 2
            r1[r5] = r0
            java.lang.String r5 = "]"
            r0 = 3
            r1[r0] = r5
            java.lang.String r5 = xhss.AbstractC0473.m860(r1)
            xhss.ᲀᛲᲇ r0 = r7.f1940
            if (r4 >= 0) goto L26
            xhss.ᲇᛵᛲᲁ r1 = r0.f2745
            int r1 = r1.m1696(r6)
            int r4 = r4 + r1
        L26:
            xhss.ᲇᛵᛲᲁ r0 = r0.f2745     // Catch: java.lang.IndexOutOfBoundsException -> L44
            r0.getClass()     // Catch: java.lang.IndexOutOfBoundsException -> L44
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.IndexOutOfBoundsException -> L44
            java.lang.Object r4 = r6.get(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L44
            boolean r6 = r3.m559()     // Catch: java.lang.IndexOutOfBoundsException -> L44
            xhss.ᲀᛱᛸᛳ r0 = xhss.AbstractC0356.f1319
            if (r6 == 0) goto L3d
            r7.m944(r5, r0, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L44
            return
        L3d:
            xhss.ᛳᛳᛵᛱ r3 = r3.m560()     // Catch: java.lang.IndexOutOfBoundsException -> L44
            r3.mo131(r5, r0, r4, r7)     // Catch: java.lang.IndexOutOfBoundsException -> L44
        L44:
            return
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final boolean m559() {
            r0 = this;
            xhss.ᛳᛳᛵᛱ r0 = r0.f936
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public abstract void mo131(java.lang.String r1, xhss.AbstractC0356 r2, java.lang.Object r3, xhss.C0530 r4);

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final xhss.AbstractC0252 m560() {
            r1 = this;
            boolean r0 = r1.m559()
            if (r0 != 0) goto L9
            xhss.ᛳᛳᛵᛱ r1 = r1.f936
            return r1
        L9:
            java.lang.String r1 = "Current path token is a leaf"
            xhss.C0532.m950(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final boolean m561() {
            r1 = this;
            java.lang.Boolean r0 = r1.f940
            if (r0 != 0) goto L20
            xhss.ᛳᛳᛵᛱ r0 = r1.f939
            if (r0 != 0) goto L9
            goto L17
        L9:
            boolean r0 = r0.mo133()
            if (r0 == 0) goto L19
            xhss.ᛳᛳᛵᛱ r0 = r1.f939
            boolean r0 = r0.m561()
            if (r0 == 0) goto L19
        L17:
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.f940 = r0
        L20:
            boolean r1 = r0.booleanValue()
            return r1
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public abstract boolean mo133();

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final void m562(java.lang.String r18, java.lang.Object r19, xhss.C0530 r20, java.util.List r21) {
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            xhss.ᲀᛲᲇ r4 = r2.f1940
            int r5 = r3.size()
            java.lang.String r6 = "]"
            java.lang.String r7 = "["
            xhss.ᲀᛱᛸᛳ r8 = xhss.AbstractC0356.f1319
            java.lang.String r9 = "Missing property in path "
            java.lang.Object r10 = xhss.C1037.f3347
            xhss.ᛳᛳᛱᛳ r11 = xhss.EnumC0250.f933
            r12 = 0
            xhss.ᛳᛳᛱᛳ r13 = xhss.EnumC0250.f928
            r14 = 1
            if (r5 != r14) goto Lf2
            r5 = 0
            java.lang.Object r3 = r3.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            r15 = 4
            java.lang.CharSequence[] r15 = new java.lang.CharSequence[r15]
            r15[r5] = r0
            java.lang.String r0 = "['"
            r15[r14] = r0
            r0 = 2
            r15[r0] = r3
            java.lang.String r0 = "']"
            r5 = 3
            r15[r5] = r0
            java.lang.String r0 = xhss.AbstractC0473.m860(r15)
            xhss.ᲇᛵᛲᲁ r5 = r4.f2745
            r5.getClass()
            java.util.Map r1 = (java.util.Map) r1
            boolean r5 = r1.containsKey(r3)
            if (r5 != 0) goto L4b
            r1 = r10
            goto L4f
        L4b:
            java.lang.Object r1 = r1.get(r3)
        L4f:
            if (r1 != r10) goto Lb5
            boolean r1 = r17.m559()
            xhss.ᛳᛳᛱᛳ r3 = xhss.EnumC0250.f930
            if (r1 == 0) goto L86
            java.util.Set r1 = r4.f2744
            java.util.Set r4 = r4.f2744
            boolean r1 = r1.contains(r13)
            if (r1 == 0) goto L64
            goto Lb6
        L64:
            boolean r1 = r4.contains(r3)
            if (r1 != 0) goto Le3
            boolean r1 = r4.contains(r11)
            if (r1 != 0) goto L72
            goto Le3
        L72:
            xhss.ᛸᲁᛴᛷ r1 = new xhss.ᛸᲁᛴᛷ
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "No results for path: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L86:
            boolean r1 = r17.m561()
            if (r1 == 0) goto L92
            boolean r1 = r17.mo133()
            if (r1 != 0) goto L9a
        L92:
            java.util.Set r1 = r4.f2744
            boolean r1 = r1.contains(r11)
            if (r1 == 0) goto Le3
        L9a:
            java.util.Set r1 = r4.f2744
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto La3
            goto Le3
        La3:
            xhss.ᛸᲁᛴᛷ r1 = new xhss.ᛸᲁᛴᛷ
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r9)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        Lb5:
            r12 = r1
        Lb6:
            boolean r1 = r17.m559()
            if (r1 == 0) goto Le8
            r1 = r17
            int r1 = r1.f938
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = xhss.AbstractC0390.m781(r7, r1, r6)
            java.lang.String r3 = "[-1]"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Le4
            xhss.ᛴᲇᲀᛴ r3 = r2.f1943
            xhss.ᲀᛷᲈᛳ r3 = r3.f1479
            xhss.ᛳᛳᛵᛱ r3 = r3.f2840
            xhss.ᛳᛳᛵᛱ r3 = r3.f939
            java.lang.String r3 = r3.mo130()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto Le3
            goto Le4
        Le3:
            return
        Le4:
            r2.m944(r0, r8, r12)
            return
        Le8:
            r1 = r17
            xhss.ᛳᛳᛵᛱ r1 = r1.m560()
            r1.mo131(r0, r8, r12, r2)
            return
        Lf2:
            java.lang.String r5 = ", "
            java.lang.String r14 = "'"
            java.lang.String r5 = xhss.AbstractC0473.m868(r5, r14, r3)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r0)
            r14.append(r7)
            r14.append(r5)
            r14.append(r6)
            java.lang.String r0 = r14.toString()
            xhss.ᲇᛵᛲᲁ r5 = r4.f2745
            java.lang.Object r5 = r5.f3349
            xhss.ᛸᛵᛷᲁ r5 = (xhss.C0768) r5
            r5.getClass()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L121:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L17c
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            xhss.ᲇᛵᛲᲁ r7 = r4.f2745
            xhss.ᲇᛵᛲᲁ r14 = r4.f2745
            java.util.Set r15 = r4.f2744
            java.util.Set r7 = r7.m1690(r1)
            boolean r7 = r7.contains(r6)
            if (r7 == 0) goto L159
            r14.getClass()
            r7 = r1
            java.util.Map r7 = (java.util.Map) r7
            boolean r16 = r7.containsKey(r6)
            if (r16 != 0) goto L14b
            r7 = r10
            goto L14f
        L14b:
            java.lang.Object r7 = r7.get(r6)
        L14f:
            if (r7 != r10) goto L160
            boolean r7 = r15.contains(r13)
            if (r7 == 0) goto L121
        L157:
            r7 = r12
            goto L160
        L159:
            boolean r7 = r15.contains(r13)
            if (r7 == 0) goto L16b
            goto L157
        L160:
            r14.getClass()
            java.lang.String r6 = r6.toString()
            r5.put(r6, r7)
            goto L121
        L16b:
            boolean r6 = r15.contains(r11)
            if (r6 != 0) goto L172
            goto L121
        L172:
            xhss.ᛸᲁᛴᛷ r1 = new xhss.ᛸᲁᛴᛷ
            java.lang.String r0 = r9.concat(r0)
            r1.<init>(r0)
            throw r1
        L17c:
            r2.m944(r0, r8, r5)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final boolean m563() {
            r2 = this;
            java.lang.Boolean r0 = r2.f937
            if (r0 == 0) goto L9
            boolean r2 = r0.booleanValue()
            return r2
        L9:
            boolean r0 = r2.mo133()
            if (r0 == 0) goto L1b
            boolean r1 = r2.m559()
            if (r1 != 0) goto L1b
            xhss.ᛳᛳᛵᛱ r0 = r2.f936
            boolean r0 = r0.m563()
        L1b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r2.f937 = r1
            return r0
    }
}
