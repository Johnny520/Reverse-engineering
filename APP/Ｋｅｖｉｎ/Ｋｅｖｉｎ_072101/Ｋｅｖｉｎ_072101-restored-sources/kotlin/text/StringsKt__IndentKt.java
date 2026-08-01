package kotlin.text;

/* JADX INFO: compiled from: Indent.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u001a!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0002\b\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0002\b\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0082\b¢\u0006\u0002\b\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u001a\f\u0010\u0013\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0016\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0007¨\u0006\u0015"}, m115d2 = {"getIndentFunction", "Lkotlin/Function1;", "", "indent", "getIndentFunction$StringsKt__IndentKt", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "prependIndent", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "replaceIndent", "newIndent", "replaceIndentByMargin", "marginPrefix", "trimIndent", "trimMargin", "kotlin-stdlib"}, m116k = 5, m117mv = {1, 9, 0}, m119xi = 49, m120xs = "kotlin/text/StringsKt")
class StringsKt__IndentKt extends kotlin.text.StringsKt__AppendableKt {


    public StringsKt__IndentKt() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> getIndentFunction$StringsKt__IndentKt(java.lang.String r1) {
            r0 = r1
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L14
            kotlin.text.StringsKt__IndentKt$getIndentFunction$1 r0 = kotlin.text.StringsKt__IndentKt$getIndentFunction$1.INSTANCE
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            goto L1b
        L14:
            kotlin.text.StringsKt__IndentKt$getIndentFunction$2 r0 = new kotlin.text.StringsKt__IndentKt$getIndentFunction$2
            r0.<init>(r1)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
        L1b:
            return r0
    }

    private static final int indentWidth$StringsKt__IndentKt(java.lang.String r8) {
            r0 = r8
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 0
            r2 = 0
            int r3 = r0.length()
        L9:
            r4 = -1
            if (r2 >= r3) goto L1b
            char r5 = r0.charAt(r2)
            r6 = 0
            boolean r7 = kotlin.text.CharsKt.isWhitespace(r5)
            if (r7 != 0) goto L18
            goto L1c
        L18:
            int r2 = r2 + 1
            goto L9
        L1b:
            r2 = r4
        L1c:
            r0 = r2
            r1 = 0
            if (r0 != r4) goto L25
            int r2 = r8.length()
            r0 = r2
        L25:
            return r0
    }

    public static final java.lang.String prependIndent(java.lang.String r11, java.lang.String r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "indent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = r11
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            kotlin.sequences.Sequence r0 = kotlin.text.StringsKt.lineSequence(r0)
            kotlin.text.StringsKt__IndentKt$prependIndent$1 r1 = new kotlin.text.StringsKt__IndentKt$prependIndent$1
            r1.<init>(r12)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt.map(r0, r1)
            java.lang.String r0 = "\n"
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r9 = 62
            r10 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r0 = kotlin.sequences.SequencesKt.joinToString$default(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    public static /* synthetic */ java.lang.String prependIndent$default(java.lang.String r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = "    "
        L6:
            java.lang.String r0 = kotlin.text.StringsKt.prependIndent(r0, r1)
            return r0
    }

    private static final java.lang.String reindent$StringsKt__IndentKt(java.util.List<java.lang.String> r21, int r22, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> r23, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> r24) {
            r0 = 0
            int r1 = kotlin.collections.CollectionsKt.getLastIndex(r21)
            r2 = r21
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r2
            r6 = 0
            r7 = r5
            r8 = 0
            r9 = 0
            java.util.Iterator r10 = r7.iterator()
        L1a:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L80
            java.lang.Object r11 = r10.next()
            int r12 = r9 + 1
            if (r9 >= 0) goto L2b
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L2b:
            r13 = r11
            r14 = 0
            r15 = r13
            java.lang.String r15 = (java.lang.String) r15
            r16 = r9
            r17 = 0
            r18 = r0
            r0 = r16
            if (r0 == 0) goto L3c
            if (r0 != r1) goto L53
        L3c:
            r16 = r15
            java.lang.CharSequence r16 = (java.lang.CharSequence) r16
            boolean r16 = kotlin.text.StringsKt.isBlank(r16)
            if (r16 == 0) goto L53
            r16 = 0
            r19 = r1
            r1 = r23
            r20 = r16
            r16 = r0
            r0 = r20
            goto L73
        L53:
            r16 = r0
            r0 = r24
            java.lang.Object r19 = r0.invoke(r15)
            r0 = r19
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L6e
            r19 = r1
            r1 = r23
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L73
            goto L72
        L6e:
            r19 = r1
            r1 = r23
        L72:
            r0 = r15
        L73:
            if (r0 == 0) goto L7a
            r15 = 0
            r4.add(r0)
        L7a:
            r9 = r12
            r0 = r18
            r1 = r19
            goto L1a
        L80:
            r18 = r0
            r0 = r4
            java.util.List r0 = (java.util.List) r0
            r4 = r0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = r22
            r0.<init>(r2)
            r5 = r0
            java.lang.Appendable r5 = (java.lang.Appendable) r5
            java.lang.String r0 = "\n"
            r6 = r0
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r12 = 124(0x7c, float:1.74E-43)
            r13 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.Appendable r0 = kotlin.collections.CollectionsKt.joinTo$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            return r0
    }

    public static final java.lang.String replaceIndent(java.lang.String r27, java.lang.String r28) {
            r0 = r27
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "newIndent"
            r2 = r28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.util.List r1 = kotlin.text.StringsKt.lines(r1)
            r3 = r1
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r4 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r5 = (java.util.Collection) r5
            r6 = r3
            r7 = 0
            java.util.Iterator r8 = r6.iterator()
        L27:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L42
            java.lang.Object r9 = r8.next()
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            r11 = 0
            r12 = r10
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            boolean r12 = kotlin.text.StringsKt.isBlank(r12)
            if (r12 != 0) goto L27
            r5.add(r9)
            goto L27
        L42:
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r3 = r5
            r4 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r3, r6)
            r5.<init>(r6)
            java.util.Collection r5 = (java.util.Collection) r5
            r6 = r3
            r7 = 0
            java.util.Iterator r8 = r6.iterator()
        L5d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L77
            java.lang.Object r9 = r8.next()
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            r11 = 0
            int r10 = indentWidth$StringsKt__IndentKt(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r5.add(r10)
            goto L5d
        L77:
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.lang.Comparable r3 = kotlin.collections.CollectionsKt.minOrNull(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L8a
            int r3 = r3.intValue()
            goto L8b
        L8a:
            r3 = 0
        L8b:
            int r4 = r27.length()
            int r5 = r28.length()
            int r6 = r1.size()
            int r5 = r5 * r6
            int r4 = r4 + r5
            kotlin.jvm.functions.Function1 r5 = getIndentFunction$StringsKt__IndentKt(r28)
            r6 = r1
            r7 = 0
            int r8 = kotlin.collections.CollectionsKt.getLastIndex(r6)
            r9 = r6
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r10 = 0
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Collection r11 = (java.util.Collection) r11
            r12 = r9
            r13 = 0
            r14 = r12
            r15 = 0
            r16 = 0
            java.util.Iterator r17 = r14.iterator()
        Lb9:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L114
            java.lang.Object r18 = r17.next()
            int r19 = r16 + 1
            if (r16 >= 0) goto Lca
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        Lca:
            r20 = r18
            r21 = 0
            r22 = r20
            java.lang.String r22 = (java.lang.String) r22
            r23 = r16
            r24 = 0
            r0 = r23
            if (r0 == 0) goto Ldc
            if (r0 != r8) goto Leb
        Ldc:
            r23 = r22
            java.lang.CharSequence r23 = (java.lang.CharSequence) r23
            boolean r23 = kotlin.text.StringsKt.isBlank(r23)
            if (r23 == 0) goto Leb
            r23 = 0
            r26 = r0
            goto L105
        Leb:
            r23 = r22
            r25 = 0
            r26 = r0
            r0 = r23
            java.lang.String r0 = kotlin.text.StringsKt.drop(r0, r3)
            if (r0 == 0) goto L103
            java.lang.Object r0 = r5.invoke(r0)
            r23 = r0
            java.lang.String r23 = (java.lang.String) r23
            if (r23 != 0) goto L105
        L103:
            r23 = r22
        L105:
            if (r23 == 0) goto L10f
            r0 = r23
            r22 = 0
            r11.add(r0)
        L10f:
            r0 = r27
            r16 = r19
            goto Lb9
        L114:
            r0 = r11
            java.util.List r0 = (java.util.List) r0
            r11 = r0
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r12 = r0
            java.lang.Appendable r12 = (java.lang.Appendable) r12
            java.lang.String r0 = "\n"
            r13 = r0
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            r19 = 124(0x7c, float:1.74E-43)
            r20 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            java.lang.Appendable r0 = kotlin.collections.CollectionsKt.joinTo$default(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            java.lang.String r0 = r0.toString()
            java.lang.String r9 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r9)
            return r0
    }

    public static /* synthetic */ java.lang.String replaceIndent$default(java.lang.String r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = ""
        L6:
            java.lang.String r0 = kotlin.text.StringsKt.replaceIndent(r0, r1)
            return r0
    }

    public static final java.lang.String replaceIndentByMargin(java.lang.String r36, java.lang.String r37, java.lang.String r38) {
            r0 = r36
            r7 = r38
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "newIndent"
            r8 = r37
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            java.lang.String r1 = "marginPrefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            r1 = r7
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = kotlin.text.StringsKt.isBlank(r1)
            if (r1 != 0) goto L14a
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.util.List r9 = kotlin.text.StringsKt.lines(r1)
            int r1 = r36.length()
            int r2 = r37.length()
            int r3 = r9.size()
            int r2 = r2 * r3
            int r10 = r1 + r2
            kotlin.jvm.functions.Function1 r11 = getIndentFunction$StringsKt__IndentKt(r37)
            r12 = r9
            r13 = 0
            int r14 = kotlin.collections.CollectionsKt.getLastIndex(r12)
            r15 = r12
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            r16 = 0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6 = r1
            java.util.Collection r6 = (java.util.Collection) r6
            r17 = r15
            r18 = 0
            r19 = r17
            r20 = 0
            r1 = 0
            java.util.Iterator r21 = r19.iterator()
        L58:
            boolean r2 = r21.hasNext()
            if (r2 == 0) goto L112
            java.lang.Object r22 = r21.next()
            int r23 = r1 + 1
            if (r1 >= 0) goto L69
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L69:
            r24 = r22
            r25 = r1
            r26 = 0
            r27 = r24
            java.lang.String r27 = (java.lang.String) r27
            r5 = r25
            r28 = 0
            r29 = 0
            if (r5 == 0) goto L7d
            if (r5 != r14) goto L8c
        L7d:
            r1 = r27
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = kotlin.text.StringsKt.isBlank(r1)
            if (r1 == 0) goto L8c
            r33 = r5
            r7 = r6
            goto L100
        L8c:
            r4 = r27
            r30 = 0
            r1 = r4
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 0
            r3 = 0
            int r0 = r1.length()
        L99:
            r31 = r2
            r2 = -1
            if (r3 >= r0) goto Lb0
            char r32 = r1.charAt(r3)
            r33 = 0
            boolean r34 = kotlin.text.CharsKt.isWhitespace(r32)
            if (r34 != 0) goto Lab
            goto Lb1
        Lab:
            int r3 = r3 + 1
            r2 = r31
            goto L99
        Lb0:
            r3 = r2
        Lb1:
            r0 = r3
            if (r0 != r2) goto Lbc
            r3 = r4
            r33 = r5
            r7 = r6
            r1 = r29
            goto Lf1
        Lbc:
            r31 = 4
            r32 = 0
            r33 = 0
            r1 = r4
            r2 = r38
            r3 = r0
            r35 = r4
            r4 = r33
            r33 = r5
            r5 = r31
            r7 = r6
            r6 = r32
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto Led
            int r1 = r38.length()
            int r1 = r1 + r0
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r3 = r35
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r2)
            java.lang.String r1 = r3.substring(r1)
            java.lang.String r2 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            goto Lf1
        Led:
            r3 = r35
            r1 = r29
        Lf1:
            if (r1 == 0) goto Lfe
            java.lang.Object r0 = r11.invoke(r1)
            r29 = r0
            java.lang.String r29 = (java.lang.String) r29
            if (r29 != 0) goto L100
        Lfe:
            r29 = r27
        L100:
            if (r29 == 0) goto L109
            r0 = r29
            r1 = 0
            r7.add(r0)
        L109:
            r0 = r36
            r6 = r7
            r1 = r23
            r7 = r38
            goto L58
        L112:
            r7 = r6
            r0 = r7
            java.util.List r0 = (java.util.List) r0
            r17 = r0
            java.lang.Iterable r17 = (java.lang.Iterable) r17
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r10)
            r18 = r0
            java.lang.Appendable r18 = (java.lang.Appendable) r18
            java.lang.String r0 = "\n"
            r19 = r0
            java.lang.CharSequence r19 = (java.lang.CharSequence) r19
            r25 = 124(0x7c, float:1.74E-43)
            r26 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            java.lang.Appendable r0 = kotlin.collections.CollectionsKt.joinTo$default(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        L14a:
            r0 = 0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "marginPrefix must be non-blank string."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ java.lang.String replaceIndentByMargin$default(java.lang.String r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = ""
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.lang.String r2 = "|"
        Lc:
            java.lang.String r0 = kotlin.text.StringsKt.replaceIndentByMargin(r0, r1, r2)
            return r0
    }

    public static final java.lang.String trimIndent(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = ""
            java.lang.String r0 = kotlin.text.StringsKt.replaceIndent(r1, r0)
            return r0
    }

    public static final java.lang.String trimMargin(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "marginPrefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = ""
            java.lang.String r0 = kotlin.text.StringsKt.replaceIndentByMargin(r1, r0, r2)
            return r0
    }

    public static /* synthetic */ java.lang.String trimMargin$default(java.lang.String r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = "|"
        L6:
            java.lang.String r0 = kotlin.text.StringsKt.trimMargin(r0, r1)
            return r0
    }
}
