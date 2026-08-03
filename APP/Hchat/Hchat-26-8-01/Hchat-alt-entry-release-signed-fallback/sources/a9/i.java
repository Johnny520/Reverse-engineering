package a9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.Map f102a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.Map f103b = null;

    static {
            java.util.Map r0 = p.a.p()
            a9.i.f102a = r0
            java.util.Map r0 = p.a.p()
            a9.i.f103b = r0
            return
    }

    public static void a(a9.c r12) {
            android.widget.TextView r0 = r12.f83a
            a9.d r12 = e(r12)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
            a9.g r2 = r12.f86c
            java.lang.String r3 = r2.f95a
            fg.a r4 = r2.f100f
            int r3 = r3.length()
            java.lang.String r5 = " "
            r6 = 33
            if (r3 <= 0) goto L45
            int r3 = r1.length()
            java.lang.String r7 = r2.f95a
            r1.append(r7)
            int r7 = r1.length()
            a9.f r8 = new a9.f
            int r9 = r2.f96b
            int r10 = r2.f97c
            int r11 = r2.f98d
            int r2 = r2.f99e
            r8.<init>(r9, r10, r11, r2)
            r1.setSpan(r8, r3, r7, r6)
            if (r4 == 0) goto L42
            a9.b r2 = new a9.b
            r2.<init>(r4)
            r1.setSpan(r2, r3, r7, r6)
        L42:
            r1.append(r5)
        L45:
            int r2 = r1.length()
            java.lang.CharSequence r3 = r12.f84a
            r1.append(r3)
            int r3 = r1.length()
            a9.a r7 = r12.f85b
            r8 = 0
            r9 = 0
            if (r7 == 0) goto L6f
            if (r3 <= r2) goto L5c
            r10 = 1
            goto L5d
        L5c:
            r10 = r9
        L5d:
            if (r10 == 0) goto L60
            goto L61
        L60:
            r7 = r8
        L61:
            if (r7 == 0) goto L6f
            a9.e r10 = new a9.e
            y9.f r11 = r7.f79a
            int r7 = r7.f80b
            r10.<init>(r11, r7)
            r1.setSpan(r10, r2, r3, r6)
        L6f:
            java.lang.CharSequence r2 = r12.f87d
            int r2 = r2.length()
            if (r2 <= 0) goto L7f
            r1.append(r5)
            java.lang.CharSequence r2 = r12.f87d
            r1.append(r2)
        L7f:
            if (r4 == 0) goto L86
            android.text.method.MovementMethod r2 = android.text.method.LinkMovementMethod.getInstance()
            goto L87
        L86:
            r2 = r8
        L87:
            r0.setMovementMethod(r2)
            r0.setHighlightColor(r9)
            r0.setText(r1)
            java.lang.String r1 = r1.toString()
            r1.getClass()
            r12.f88e = r1
            r0.setSingleLine(r9)
            r12 = 2147483647(0x7fffffff, float:NaN)
            r0.setMaxLines(r12)
            r0.setEllipsize(r8)
            r0.requestLayout()
            return
    }

    public static a9.c b(android.widget.TextView r1) {
            java.util.Map r0 = a9.i.f102a
            r0.getClass()
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> Le
            a9.c r1 = (a9.c) r1     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public static java.lang.CharSequence c(android.widget.TextView r4) {
            java.util.Map r0 = a9.i.f103b
            r0.getClass()
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r4)     // Catch: java.lang.Throwable -> L21
            a9.d r1 = (a9.d) r1     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L30
            java.lang.String r2 = r1.f88e     // Catch: java.lang.Throwable -> L21
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L21
            if (r2 <= 0) goto L30
            java.lang.CharSequence r2 = r4.getText()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L23
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L21
            goto L24
        L21:
            r4 = move-exception
            goto L3a
        L23:
            r2 = 0
        L24:
            java.lang.String r3 = r1.f88e     // Catch: java.lang.Throwable -> L21
            boolean r2 = gg.l.a(r2, r3)     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L30
            java.lang.CharSequence r4 = r1.f84a     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)
            return r4
        L30:
            monitor-exit(r0)
            java.lang.CharSequence r4 = r4.getText()
            java.lang.CharSequence r4 = g(r4)
            return r4
        L3a:
            monitor-exit(r0)
            throw r4
    }

    public static a9.c d(android.widget.TextView r5) {
            java.util.Map r0 = a9.i.f102a
            r0.getClass()
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r5)     // Catch: java.lang.Throwable -> L45
            a9.c r1 = (a9.c) r1     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L10
            monitor-exit(r0)
            return r1
        L10:
            a9.c r1 = new a9.c     // Catch: java.lang.Throwable -> L45
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L45
            r2 = r0
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L45
            r2.put(r5, r1)     // Catch: java.lang.Throwable -> L45
            java.util.Map r2 = a9.i.f103b     // Catch: java.lang.Throwable -> L45
            r2.getClass()     // Catch: java.lang.Throwable -> L45
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L45
            a9.d r3 = new a9.d     // Catch: java.lang.Throwable -> L45
            java.lang.CharSequence r4 = r5.getText()     // Catch: java.lang.Throwable -> L45
            java.lang.CharSequence r4 = g(r4)     // Catch: java.lang.Throwable -> L45
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L45
            r2.put(r5, r3)     // Catch: java.lang.Throwable -> L45
            r2 = 0
            r5.setSingleLine(r2)     // Catch: java.lang.Throwable -> L45
            r3 = 2147483647(0x7fffffff, float:NaN)
            r5.setMaxLines(r3)     // Catch: java.lang.Throwable -> L45
            r3 = 0
            r5.setEllipsize(r3)     // Catch: java.lang.Throwable -> L45
            r5.setHighlightColor(r2)     // Catch: java.lang.Throwable -> L45
            monitor-exit(r0)
            return r1
        L45:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
    }

    public static a9.d e(a9.c r4) {
            java.util.Map r0 = a9.i.f103b
            r0.getClass()
            monitor-enter(r0)
            r1 = r0
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L24
            android.widget.TextView r2 = r4.f83a     // Catch: java.lang.Throwable -> L24
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L24
            if (r3 != 0) goto L26
            a9.d r3 = new a9.d     // Catch: java.lang.Throwable -> L24
            android.widget.TextView r4 = r4.f83a     // Catch: java.lang.Throwable -> L24
            java.lang.CharSequence r4 = r4.getText()     // Catch: java.lang.Throwable -> L24
            java.lang.CharSequence r4 = g(r4)     // Catch: java.lang.Throwable -> L24
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L24
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r4 = move-exception
            goto L2a
        L26:
            a9.d r3 = (a9.d) r3     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)
            return r3
        L2a:
            monitor-exit(r0)
            throw r4
    }

    public static a9.d f(a9.c r3) {
            a9.d r0 = e(r3)
            android.widget.TextView r3 = r3.f83a
            java.lang.CharSequence r3 = r3.getText()
            if (r3 == 0) goto L11
            java.lang.String r1 = r3.toString()
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 != 0) goto L16
            java.lang.String r1 = ""
        L16:
            java.lang.String r2 = r0.f88e
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L24
            java.lang.CharSequence r3 = g(r3)
            r0.f84a = r3
        L24:
            return r0
    }

    public static java.lang.CharSequence g(java.lang.CharSequence r7) {
            if (r7 != 0) goto L5
            java.lang.String r7 = ""
            return r7
        L5:
            boolean r0 = r7 instanceof android.text.Spanned
            if (r0 != 0) goto La
            goto L32
        La:
            r0 = r7
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r1 = r0.length()
            java.lang.Class<a9.f> r2 = a9.f.class
            r3 = 0
            java.lang.Object[] r1 = r0.getSpans(r3, r1, r2)
            a9.f[] r1 = (a9.f[]) r1
            int r2 = r0.length()
            java.lang.Class<a9.e> r4 = a9.e.class
            java.lang.Object[] r0 = r0.getSpans(r3, r2, r4)
            a9.e[] r0 = (a9.e[]) r0
            r1.getClass()
            int r2 = r1.length
            if (r2 != 0) goto L33
            r0.getClass()
            int r2 = r0.length
            if (r2 != 0) goto L33
        L32:
            return r7
        L33:
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>(r7)
            r0.getClass()
            int r7 = r0.length
            r4 = r3
        L3d:
            if (r4 >= r7) goto L47
            r5 = r0[r4]
            r2.removeSpan(r5)
            int r4 = r4 + 1
            goto L3d
        L47:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r0 = r1.length
        L4d:
            if (r3 >= r0) goto L74
            r4 = r1[r3]
            int r5 = r2.getSpanStart(r4)
            int r4 = r2.getSpanEnd(r4)
            if (r5 < 0) goto L6b
            if (r4 < r5) goto L6b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            sf.e r6 = new sf.e
            r6.<init>(r5, r4)
            goto L6c
        L6b:
            r6 = 0
        L6c:
            if (r6 == 0) goto L71
            r7.add(r6)
        L71:
            int r3 = r3 + 1
            goto L4d
        L74:
            a9.h r0 = new a9.h
            r1 = 0
            r0.<init>(r1)
            java.util.List r7 = tf.m.K1(r7, r0)
            java.util.Iterator r7 = r7.iterator()
        L82:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lab
            java.lang.Object r0 = r7.next()
            sf.e r0 = (sf.e) r0
            java.lang.Object r1 = r0.f12418g
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.f12419h
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = r0 + 1
            int r3 = r2.length()
            if (r0 <= r3) goto La7
            r0 = r3
        La7:
            r2.delete(r1, r0)
            goto L82
        Lab:
            return r2
    }
}
