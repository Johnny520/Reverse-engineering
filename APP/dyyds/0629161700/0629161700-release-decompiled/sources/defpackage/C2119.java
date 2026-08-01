package defpackage;

/* JADX INFO: renamed from: ᲇᲀᛴᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2119 extends defpackage.AbstractC1804 {

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final defpackage.C1929 f9085 = null;

    static {
            ᲁᲁᛷᲈ r0 = new ᲁᲁᛷᲈ
            r1 = 7
            r0.<init>(r1)
            defpackage.C2119.f9085 = r0
            return
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static void m3547(defpackage.AbstractC1804 r11, java.lang.String r12, defpackage.AbstractC1109 r13, java.lang.Object r14, defpackage.C0323 r15, defpackage.InterfaceC0953 r16) {
            r4 = r15
            r5 = r16
            ᛶᲈᛵᛲ r6 = r4.f1684
            ᛸᲈᛸᲈ r0 = r6.f5376
            r0.getClass()
            boolean r0 = r14 instanceof java.util.Map
            if (r0 == 0) goto L6b
            boolean r0 = r5.mo1902(r14)
            if (r0 == 0) goto L17
            r11.mo788(r12, r13, r14, r15)
        L17:
            ᛸᲈᛸᲈ r13 = r6.f5376
            java.util.Set r13 = r13.m2904(r14)
            java.util.Iterator r13 = r13.iterator()
        L21:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto Lf8
            java.lang.Object r0 = r13.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r2 = "['"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = "']"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            ᛸᲈᛸᲈ r2 = r6.f5376
            r2.getClass()
            r2 = r14
            java.util.Map r2 = (java.util.Map) r2
            boolean r3 = r2.containsKey(r0)
            java.lang.Object r7 = defpackage.C1606.f7100
            if (r3 != 0) goto L58
            r3 = r7
            goto L5d
        L58:
            java.lang.Object r2 = r2.get(r0)
            r3 = r2
        L5d:
            if (r3 == r7) goto L21
            ᛴᛴᲁᛲ r2 = new ᛴᛴᲁᛲ
            r2.<init>(r14)
            r2.f3218 = r0
            r0 = r11
            m3547(r0, r1, r2, r3, r4, r5)
            goto L21
        L6b:
            ᛸᲈᛸᲈ r0 = r6.f5376
            ᛸᲈᛸᲈ r1 = r6.f5376
            r0.getClass()
            boolean r0 = r14 instanceof java.util.List
            if (r0 == 0) goto Lf8
            boolean r0 = r5.mo1902(r14)
            java.lang.String r6 = "]"
            java.lang.String r7 = "["
            r2 = 0
            if (r0 == 0) goto Lbf
            boolean r0 = r11.m3196()
            if (r0 == 0) goto L8b
            r11.mo788(r12, r13, r14, r15)
            goto Lbf
        L8b:
            ᲁᛱᲈᲁ r0 = r11.m3195()
            java.lang.Iterable r3 = r1.m2893(r14)
            java.util.Iterator r3 = r3.iterator()
            r8 = r2
        L98:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto Lbf
            java.lang.Object r9 = r3.next()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r12)
            r10.append(r7)
            r10.append(r8)
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            r0.f7903 = r8
            r0.mo788(r10, r13, r9, r15)
            int r8 = r8 + 1
            goto L98
        Lbf:
            java.lang.Iterable r13 = r1.m2893(r14)
            java.util.Iterator r13 = r13.iterator()
            r8 = r2
        Lc8:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto Lf8
            java.lang.Object r3 = r13.next()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r7)
            r0.append(r8)
            r0.append(r6)
            java.lang.String r1 = r0.toString()
            ᛵᛴᛷᛱ r2 = new ᛵᛴᛷᛱ
            r2.<init>(r14)
            r2.f3945 = r8
            r0 = r11
            m3547(r0, r1, r2, r3, r4, r5)
            int r8 = r8 + 1
            r4 = r15
            r5 = r16
            goto Lc8
        Lf8:
            return
    }

    @Override // defpackage.AbstractC1804
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo788(java.lang.String r7, defpackage.AbstractC1109 r8, java.lang.Object r9, defpackage.C0323 r10) {
            r6 = this;
            ᲁᛱᲈᲁ r0 = r6.m3195()
            boolean r6 = r0 instanceof defpackage.C2371
            if (r6 == 0) goto L17
            ᲁᛷᛵ r6 = new ᲁᛷᛵ
            r1 = r0
            ᲈᲈᲀᛴ r1 = (defpackage.C2371) r1
            r2 = 6
            r6.<init>(r1, r2, r10)
        L11:
            r5 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            goto L3c
        L17:
            boolean r6 = r0 instanceof defpackage.AbstractC2160
            if (r6 == 0) goto L21
            ᛶᲈᛱᲈ r6 = new ᛶᲈᛱᲈ
            r6.<init>(r10)
            goto L11
        L21:
            boolean r6 = r0 instanceof defpackage.C0491
            if (r6 == 0) goto L2b
            ᛸᛵᛴᛲ r6 = new ᛸᛵᛴᛲ
            r6.<init>()
            goto L11
        L2b:
            boolean r6 = r0 instanceof defpackage.C0830
            if (r6 == 0) goto L39
            ᲁᛷᛵ r6 = new ᲁᛷᛵ
            r1 = r0
            ᛵᛲᛶᲇ r1 = (defpackage.C0830) r1
            r2 = 5
            r6.<init>(r1, r2, r10)
            goto L11
        L39:
            ᲁᲁᛷᲈ r6 = defpackage.C2119.f9085
            goto L11
        L3c:
            m3547(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // defpackage.AbstractC1804
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.String mo789() {
            r0 = this;
            java.lang.String r0 = ".."
            return r0
    }

    @Override // defpackage.AbstractC1804
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final boolean mo790() {
            r0 = this;
            r0 = 0
            return r0
    }
}
