package kd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements java.util.function.IntConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f7583b;

    public /* synthetic */ c(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f7582a = r2
            r0.f7583b = r1
            r0.<init>()
            return
    }

    public /* synthetic */ c(xe.q r1, java.lang.StringBuilder r2) {
            r0 = this;
            r1 = 2
            r0.f7582a = r1
            r0.<init>()
            r0.f7583b = r2
            return
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int r6) {
            r5 = this;
            int r0 = r5.f7582a
            r1 = 1
            java.lang.Object r2 = r5.f7583b
            switch(r0) {
                case 0: goto L8d;
                case 1: goto L7b;
                case 2: goto L1b;
                default: goto L8;
            }
        L8:
            b5.k r2 = (b5.k) r2
            boolean r6 = java.lang.Character.isDigit(r6)
            if (r6 == 0) goto L15
            int r6 = r2.f489c
            int r6 = r6 + r1
            r2.f489c = r6
        L15:
            int r6 = r2.f488b
            int r6 = r6 + r1
            r2.f488b = r6
            return
        L1b:
            java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
            java.lang.String r0 = xe.q.f(r6)
            if (r0 == 0) goto L27
            r2.append(r0)
            goto L7a
        L27:
            r0 = 32
            if (r6 >= r0) goto L2c
            goto L5e
        L2c:
            r3 = 127(0x7f, float:1.78E-43)
            r4 = 0
            if (r6 >= r3) goto L33
            r1 = r4
            goto L5e
        L33:
            java.util.regex.Pattern r3 = kd.d.f7584a
            boolean r3 = java.lang.Character.isISOControl(r6)
            if (r3 == 0) goto L3c
            goto L5d
        L3c:
            boolean r3 = java.lang.Character.isWhitespace(r6)
            if (r3 == 0) goto L46
            if (r6 != r0) goto L5d
        L44:
            r4 = r1
            goto L5d
        L46:
            int r0 = java.lang.Character.getType(r6)
            if (r0 == 0) goto L5d
            r3 = 15
            if (r0 == r3) goto L5d
            r3 = 16
            if (r0 == r3) goto L5d
            r3 = 18
            if (r0 == r3) goto L5d
            r3 = 19
            if (r0 == r3) goto L5d
            goto L44
        L5d:
            r1 = r1 ^ r4
        L5e:
            if (r1 == 0) goto L77
            java.lang.String r0 = "\\u"
            r2.append(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r0 = "%04x"
            java.lang.String r6 = java.lang.String.format(r0, r6)
            r2.append(r6)
            goto L7a
        L77:
            r2.appendCodePoint(r6)
        L7a:
            return
        L7b:
            java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
            boolean r0 = kd.d.b(r6)
            if (r0 == 0) goto L8c
            boolean r0 = java.lang.Character.isJavaIdentifierPart(r6)
            if (r0 == 0) goto L8c
            r2.appendCodePoint(r6)
        L8c:
            return
        L8d:
            java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
            boolean r0 = kd.d.b(r6)
            if (r0 == 0) goto L98
            r2.appendCodePoint(r6)
        L98:
            return
    }
}
