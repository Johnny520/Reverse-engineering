package defpackage;

/* JADX INFO: renamed from: ᲁᛱᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1804 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f7903;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.lang.Boolean f7904;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public java.lang.Boolean f7905;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public defpackage.AbstractC1804 f7906;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public defpackage.AbstractC1804 f7907;

    public AbstractC1804() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f7905 = r0
            r1.f7904 = r0
            r0 = -1
            r1.f7903 = r0
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
            boolean r0 = r2.m3196()
            if (r0 == 0) goto Lb
            java.lang.String r2 = r2.mo789()
            return r2
        Lb:
            java.lang.String r0 = r2.mo789()
            ᲁᛱᲈᲁ r2 = r2.m3195()
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final boolean m3194() {
            r1 = this;
            java.lang.Boolean r0 = r1.f7904
            if (r0 != 0) goto L20
            ᲁᛱᲈᲁ r0 = r1.f7906
            if (r0 != 0) goto L9
            goto L17
        L9:
            boolean r0 = r0.mo790()
            if (r0 == 0) goto L19
            ᲁᛱᲈᲁ r0 = r1.f7906
            boolean r0 = r0.m3194()
            if (r0 == 0) goto L19
        L17:
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.f7904 = r0
        L20:
            boolean r1 = r0.booleanValue()
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final defpackage.AbstractC1804 m3195() {
            r1 = this;
            boolean r0 = r1.m3196()
            if (r0 != 0) goto L9
            ᲁᛱᲈᲁ r1 = r1.f7907
            return r1
        L9:
            java.lang.String r1 = "Current path token is a leaf"
            defpackage.C2264.m3676(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final boolean m3196() {
            r0 = this;
            ᲁᛱᲈᲁ r0 = r0.f7907
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m3197(java.lang.String r18, java.lang.Object r19, defpackage.C0323 r20, java.util.List r21) {
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            ᛶᲈᛵᛲ r4 = r2.f1684
            int r5 = r3.size()
            java.lang.String r6 = "]"
            java.lang.String r7 = "["
            ᲈᛴᛸᛴ r8 = defpackage.AbstractC1109.f4975
            java.lang.String r9 = "Missing property in path "
            java.lang.Object r10 = defpackage.C1606.f7100
            ᛸᛳᲇ r11 = defpackage.EnumC1463.f6486
            r12 = 0
            ᛸᛳᲇ r13 = defpackage.EnumC1463.f6484
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
            java.lang.String r0 = defpackage.AbstractC1849.m3254(r15)
            ᛸᲈᛸᲈ r5 = r4.f5376
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
            boolean r1 = r17.m3196()
            ᛸᛳᲇ r3 = defpackage.EnumC1463.f6485
            if (r1 == 0) goto L86
            java.util.Set r1 = r4.f5375
            java.util.Set r4 = r4.f5375
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
            ᛸᲇᛱᛵ r1 = new ᛸᲇᛱᛵ
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "No results for path: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L86:
            boolean r1 = r17.m3194()
            if (r1 == 0) goto L92
            boolean r1 = r17.mo790()
            if (r1 != 0) goto L9a
        L92:
            java.util.Set r1 = r4.f5375
            boolean r1 = r1.contains(r11)
            if (r1 == 0) goto Le3
        L9a:
            java.util.Set r1 = r4.f5375
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto La3
            goto Le3
        La3:
            ᛸᲇᛱᛵ r1 = new ᛸᲇᛱᛵ
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r9)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        Lb5:
            r12 = r1
        Lb6:
            boolean r1 = r17.m3196()
            if (r1 == 0) goto Le8
            r1 = r17
            int r1 = r1.f7903
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = defpackage.AbstractC0225.m817(r7, r1, r6)
            java.lang.String r3 = "[-1]"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Le4
            ᛶᛱᛳᲁ r3 = r2.f1682
            ᲀᛳᲁᛵ r3 = r3.f4461
            ᲁᛱᲈᲁ r3 = r3.f7345
            ᲁᛱᲈᲁ r3 = r3.f7906
            java.lang.String r3 = r3.mo789()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto Le3
            goto Le4
        Le3:
            return
        Le4:
            r2.m996(r0, r8, r12)
            return
        Le8:
            r1 = r17
            ᲁᛱᲈᲁ r1 = r1.m3195()
            r1.mo788(r0, r8, r12, r2)
            return
        Lf2:
            java.lang.String r5 = ", "
            java.lang.String r14 = "'"
            java.lang.String r5 = defpackage.AbstractC1849.m3251(r5, r14, r3)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r0)
            r14.append(r7)
            r14.append(r5)
            r14.append(r6)
            java.lang.String r0 = r14.toString()
            ᛸᲈᛸᲈ r5 = r4.f5376
            java.lang.Object r5 = r5.f7101
            ᛳᛲᛵᛳ r5 = (defpackage.C0419) r5
            r5.getClass()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L121:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L17c
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            ᛸᲈᛸᲈ r7 = r4.f5376
            ᛸᲈᛸᲈ r14 = r4.f5376
            java.util.Set r15 = r4.f5375
            java.util.Set r7 = r7.m2904(r1)
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
            ᛸᲇᛱᛵ r1 = new ᛸᲇᛱᛵ
            java.lang.String r0 = r9.concat(r0)
            r1.<init>(r0)
            throw r1
        L17c:
            r2.m996(r0, r8, r5)
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m3198(int r4, java.lang.String r5, java.lang.Object r6, defpackage.C0323 r7) {
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
            java.lang.String r5 = defpackage.AbstractC1849.m3254(r1)
            ᛶᲈᛵᛲ r0 = r7.f1684
            if (r4 >= 0) goto L26
            ᛸᲈᛸᲈ r1 = r0.f5376
            int r1 = r1.m2902(r6)
            int r4 = r4 + r1
        L26:
            ᛸᲈᛸᲈ r0 = r0.f5376     // Catch: java.lang.IndexOutOfBoundsException -> L44
            r0.getClass()     // Catch: java.lang.IndexOutOfBoundsException -> L44
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.IndexOutOfBoundsException -> L44
            java.lang.Object r4 = r6.get(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L44
            boolean r6 = r3.m3196()     // Catch: java.lang.IndexOutOfBoundsException -> L44
            ᲈᛴᛸᛴ r0 = defpackage.AbstractC1109.f4975
            if (r6 == 0) goto L3d
            r7.m996(r5, r0, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L44
            return
        L3d:
            ᲁᛱᲈᲁ r3 = r3.m3195()     // Catch: java.lang.IndexOutOfBoundsException -> L44
            r3.mo788(r5, r0, r4, r7)     // Catch: java.lang.IndexOutOfBoundsException -> L44
        L44:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public abstract void mo788(java.lang.String r1, defpackage.AbstractC1109 r2, java.lang.Object r3, defpackage.C0323 r4);

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public abstract java.lang.String mo789();

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final boolean m3199() {
            r2 = this;
            java.lang.Boolean r0 = r2.f7905
            if (r0 == 0) goto L9
            boolean r2 = r0.booleanValue()
            return r2
        L9:
            boolean r0 = r2.mo790()
            if (r0 == 0) goto L1b
            boolean r1 = r2.m3196()
            if (r1 != 0) goto L1b
            ᲁᛱᲈᲁ r0 = r2.f7907
            boolean r0 = r0.m3199()
        L1b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r2.f7905 = r1
            return r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public abstract boolean mo790();
}
