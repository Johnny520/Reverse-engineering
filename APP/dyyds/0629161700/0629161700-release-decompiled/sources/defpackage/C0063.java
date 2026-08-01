package defpackage;

/* JADX INFO: renamed from: ᛱᛳᲇᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0063 extends defpackage.AbstractC1709 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final boolean f718;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f719;

    public C0063(java.lang.CharSequence r1) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = r1.toString()
            r0.f719 = r1
            r1 = 0
            r0.f718 = r1
            return
    }

    public C0063(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.f719 = r1
            r1 = 1
            r0.f718 = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.C0063
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᛱᛳᲇᛱ r4 = (defpackage.C0063) r4
            java.lang.Object r4 = r4.f719
            java.lang.Object r3 = r3.f719
            if (r3 == 0) goto L19
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
            goto L1c
        L19:
            if (r4 != 0) goto L1c
        L1b:
            return r0
        L1c:
            return r2
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.Object r0 = r0.f719
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final defpackage.AbstractC1709 m480() {
            r10 = this;
            java.lang.Object r0 = r10.m481()
            boolean r0 = r0 instanceof java.util.List
            if (r0 != 0) goto Lb
            ᛶᛸᛷ r10 = defpackage.InterfaceC1196.f5398
            return r10
        Lb:
            ᛳᛴᛳᲈ r0 = new ᛳᛴᛳᲈ
            java.lang.Object r10 = r10.m481()
            java.util.List r10 = (java.util.List) r10
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f2227 = r1
            java.util.Iterator r10 = r10.iterator()
        L25:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L13f
            java.lang.Object r1 = r10.next()
            java.util.ArrayList r2 = r0.f2227
            if (r1 != 0) goto L37
            ᲁᛵᛸᲇ r1 = defpackage.InterfaceC1196.f5400
            goto L132
        L37:
            boolean r3 = r1 instanceof defpackage.AbstractC1709
            if (r3 == 0) goto L3f
            ᲀᛷᛶ r1 = (defpackage.AbstractC1709) r1
            goto L132
        L3f:
            boolean r3 = r1 instanceof java.lang.Class
            if (r3 == 0) goto L4d
            java.lang.Class r1 = (java.lang.Class) r1
            ᛶᲈᛷᲈ r3 = new ᛶᲈᛷᲈ
            r3.<init>(r1)
        L4a:
            r1 = r3
            goto L132
        L4d:
            boolean r3 = r1 instanceof java.lang.String
            r4 = 0
            if (r3 != 0) goto L53
            goto L7d
        L53:
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = r5.trim()
            int r6 = r5.length()
            if (r6 > 0) goto L62
            goto L7d
        L62:
            char r6 = r5.charAt(r4)
            r7 = 64
            if (r6 == r7) goto L6e
            r7 = 36
            if (r6 != r7) goto L7d
        L6e:
            ᲀᛳᛴᛵ[] r6 = new defpackage.InterfaceC1644[r4]     // Catch: java.lang.Exception -> L7d
            defpackage.C0682.m1534(r5, r6)     // Catch: java.lang.Exception -> L7d
            ᛱᲈᛵᛶ r3 = new ᛱᲈᛵᛶ
            java.lang.String r1 = r1.toString()
            r3.<init>(r1, r4)
            goto L4a
        L7d:
            r5 = 1
            if (r3 != 0) goto L81
            goto Ld3
        L81:
            java.lang.String r6 = r1.toString()
            java.lang.String r6 = r6.trim()
            int r7 = r6.length()
            if (r7 > r5) goto L90
            goto Ld3
        L90:
            char r7 = r6.charAt(r4)
            int r8 = r6.length()
            int r8 = r8 - r5
            char r8 = r6.charAt(r8)
            r9 = 91
            if (r7 != r9) goto La5
            r9 = 93
            if (r8 == r9) goto Lad
        La5:
            r9 = 123(0x7b, float:1.72E-43)
            if (r7 != r9) goto Ld3
            r7 = 125(0x7d, float:1.75E-43)
            if (r8 != r7) goto Ld3
        Lad:
            ᛳᛲᲁ r7 = new ᛳᛲᲁ     // Catch: java.lang.Exception -> Ld3
            r8 = -8193(0xffffffffffffdfff, float:NaN)
            r7.<init>(r8)     // Catch: java.lang.Exception -> Ld3
            ᛱᛴᛲᛴ r9 = r7.f2125     // Catch: java.lang.Exception -> Ld3
            if (r9 != 0) goto Lbf
            ᛱᛴᛲᛴ r9 = new ᛱᛴᛲᛴ     // Catch: java.lang.Exception -> Ld3
            r9.<init>(r8)     // Catch: java.lang.Exception -> Ld3
            r7.f2125 = r9     // Catch: java.lang.Exception -> Ld3
        Lbf:
            ᛷᛸᛱᛸ r7 = defpackage.AbstractC2325.f9837     // Catch: java.lang.Exception -> Ld3
            java.lang.Object r7 = r7.f5857     // Catch: java.lang.Exception -> Ld3
            ᛳᛲᛵᛳ r7 = (defpackage.C0419) r7     // Catch: java.lang.Exception -> Ld3
            r9.m500(r6, r7)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r1 = r1.toString()
            ᛱᛳᲇᛱ r3 = new ᛱᛳᲇᛱ
            r3.<init>(r1)
            goto L4a
        Ld3:
            if (r3 == 0) goto Le0
            java.lang.String r1 = r1.toString()
            ᲇᛶᲀᲇ r3 = new ᲇᛶᲀᲇ
            r3.<init>(r1, r5)
            goto L4a
        Le0:
            boolean r3 = r1 instanceof java.lang.Character
            if (r3 == 0) goto Lef
            java.lang.String r1 = r1.toString()
            ᲇᛶᲀᲇ r3 = new ᲇᛶᲀᲇ
            r3.<init>(r1, r4)
            goto L4a
        Lef:
            boolean r3 = r1 instanceof java.lang.Number
            if (r3 == 0) goto Lfe
            java.lang.String r1 = r1.toString()
            ᲇᲇᲈᲀ r3 = new ᲇᲇᲈᲀ
            r3.<init>(r1)
            goto L4a
        Lfe:
            boolean r3 = r1 instanceof java.lang.Boolean
            if (r3 == 0) goto L116
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            if (r1 == 0) goto L113
            ᲈᛸᛶᛶ r1 = defpackage.InterfaceC1196.f5401
            goto L132
        L113:
            ᲈᛸᛶᛶ r1 = defpackage.InterfaceC1196.f5399
            goto L132
        L116:
            boolean r3 = r1 instanceof java.util.regex.Pattern
            if (r3 == 0) goto L123
            java.util.regex.Pattern r1 = (java.util.regex.Pattern) r1
            ᛴᛷᲈᛱ r3 = new ᛴᛷᲈᛱ
            r3.<init>(r1)
            goto L4a
        L123:
            boolean r3 = r1 instanceof java.time.OffsetDateTime
            if (r3 == 0) goto L137
            java.lang.String r1 = r1.toString()
            ᲀᲁᲁᛱ r3 = new ᲀᲁᲁᛱ
            r3.<init>(r1)
            goto L4a
        L132:
            r2.add(r1)
            goto L25
        L137:
            ᛸᛵᛳᲀ r10 = new ᛸᛵᛳᲀ
            java.lang.String r0 = "Could not determine value type"
            r10.<init>(r0)
            throw r10
        L13f:
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final java.lang.Object m481() {
            r3 = this;
            boolean r0 = r3.f718     // Catch: defpackage.C0026 -> L28
            java.lang.Object r3 = r3.f719
            if (r0 == 0) goto L7
            return r3
        L7:
            ᛳᛲᲁ r0 = new ᛳᛲᲁ     // Catch: defpackage.C0026 -> L28
            r1 = -8193(0xffffffffffffdfff, float:NaN)
            r0.<init>(r1)     // Catch: defpackage.C0026 -> L28
            java.lang.String r3 = r3.toString()     // Catch: defpackage.C0026 -> L28
            ᛱᛴᛲᛴ r2 = r0.f2125     // Catch: defpackage.C0026 -> L28
            if (r2 != 0) goto L1d
            ᛱᛴᛲᛴ r2 = new ᛱᛴᛲᛴ     // Catch: defpackage.C0026 -> L28
            r2.<init>(r1)     // Catch: defpackage.C0026 -> L28
            r0.f2125 = r2     // Catch: defpackage.C0026 -> L28
        L1d:
            ᛷᛸᛱᛸ r0 = defpackage.AbstractC2325.f9837     // Catch: defpackage.C0026 -> L28
            java.lang.Object r0 = r0.f5857     // Catch: defpackage.C0026 -> L28
            ᛳᛲᛵᛳ r0 = (defpackage.C0419) r0     // Catch: defpackage.C0026 -> L28
            java.lang.Object r3 = r2.m500(r3, r0)     // Catch: defpackage.C0026 -> L28
            return r3
        L28:
            r3 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
    }

    @Override // defpackage.AbstractC1709
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0063 mo482() {
            r0 = this;
            return r0
    }

    @Override // defpackage.AbstractC1709
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final java.lang.Class mo483(defpackage.C1412 r1) {
            r0 = this;
            java.lang.Object r1 = r0.m481()
            boolean r1 = r1 instanceof java.util.List
            if (r1 == 0) goto Lb
            java.lang.Class<java.util.List> r0 = java.util.List.class
            return r0
        Lb:
            java.lang.Object r1 = r0.m481()
            boolean r1 = r1 instanceof java.util.Map
            if (r1 == 0) goto L16
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            return r0
        L16:
            java.lang.Object r1 = r0.m481()
            boolean r1 = r1 instanceof java.lang.Number
            if (r1 == 0) goto L21
            java.lang.Class<java.lang.Number> r0 = java.lang.Number.class
            return r0
        L21:
            java.lang.Object r1 = r0.m481()
            boolean r1 = r1 instanceof java.lang.String
            if (r1 == 0) goto L2c
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            return r0
        L2c:
            java.lang.Object r0 = r0.m481()
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 == 0) goto L37
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            return r0
        L37:
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            return r0
    }
}
