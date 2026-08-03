package a;

/* JADX INFO: renamed from: a.i5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0189i5 implements top.mmjz.floatingclouds.plugin.IPlugin {

    /* JADX INFO: renamed from: a.i5$a */
    public static final class a<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T r1, T r2) {
                r0 = this;
                java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
                java.lang.String r1 = r1.getName()
                java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
                java.lang.String r2 = r2.getName()
                int r1 = a.C0435w1.f(r1, r2)
                return r1
        }
    }

    public static void a(java.lang.Object r7, java.lang.String r8) {
            java.lang.String r0 = "\""
            if (r7 != 0) goto L6
            goto L115
        L6:
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.Throwable -> L111
            java.lang.reflect.Field[] r1 = r1.getDeclaredFields()     // Catch: java.lang.Throwable -> L111
            java.lang.String r2 = "getDeclaredFields(...)"
            a.C0193i9.d(r1, r2)     // Catch: java.lang.Throwable -> L111
            a.i5$a r2 = new a.i5$a     // Catch: java.lang.Throwable -> L111
            r2.<init>()     // Catch: java.lang.Throwable -> L111
            java.util.List r1 = a.N1.f0(r1, r2)     // Catch: java.lang.Throwable -> L111
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L111
            r2.<init>()     // Catch: java.lang.Throwable -> L111
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L111
        L25:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L111
            r4 = 1
            if (r3 == 0) goto Le1
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L111
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3     // Catch: java.lang.Throwable -> L111
            r3.setAccessible(r4)     // Catch: java.lang.Throwable -> L62
            java.lang.Object r4 = r3.get(r7)     // Catch: java.lang.Throwable -> L62
            if (r4 == 0) goto Ld8
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L62
            if (r5 == 0) goto L7a
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L62
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L62
            r6 = 30
            if (r5 <= r6) goto L65
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = a.Ce.X(r4, r6)     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r5.<init>()     // Catch: java.lang.Throwable -> L62
            r5.append(r4)     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = "…"
            r5.append(r4)     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L62
            goto L67
        L62:
            r3 = move-exception
            goto Ldc
        L65:
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L62
        L67:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r5.<init>()     // Catch: java.lang.Throwable -> L62
            r5.append(r0)     // Catch: java.lang.Throwable -> L62
            r5.append(r4)     // Catch: java.lang.Throwable -> L62
            r5.append(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L62
            goto Lbd
        L7a:
            boolean r5 = r4 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L62
            if (r5 == 0) goto L85
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L62
            goto Lbd
        L85:
            boolean r5 = r4 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L62
            if (r5 == 0) goto L94
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L62
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L62
            goto Lbd
        L94:
            boolean r5 = r4 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L62
            if (r5 == 0) goto Lb5
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L62
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r5.<init>()     // Catch: java.lang.Throwable -> L62
            java.lang.String r6 = "[size="
            r5.append(r6)     // Catch: java.lang.Throwable -> L62
            r5.append(r4)     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = "]"
            r5.append(r4)     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L62
            goto Lbd
        Lb5:
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = r4.getSimpleName()     // Catch: java.lang.Throwable -> L62
        Lbd:
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r5.<init>()     // Catch: java.lang.Throwable -> L62
            r5.append(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r3 = "="
            r5.append(r3)     // Catch: java.lang.Throwable -> L62
            r5.append(r4)     // Catch: java.lang.Throwable -> L62
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L62
            r2.add(r3)     // Catch: java.lang.Throwable -> L62
        Ld8:
            a.Wf r3 = a.Wf.f330a     // Catch: java.lang.Throwable -> L62
            goto L25
        Ldc:
            a.C0465xd.a(r3)     // Catch: java.lang.Throwable -> L111
            goto L25
        Le1:
            java.lang.String r7 = "\n  "
            r0 = 62
            r1 = 0
            java.lang.String r7 = a.C0383t3.p0(r2, r7, r1, r0)     // Catch: java.lang.Throwable -> L111
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L111
            r0.<init>()     // Catch: java.lang.Throwable -> L111
            java.lang.String r1 = "[DIAG-SNS] "
            r0.append(r1)     // Catch: java.lang.Throwable -> L111
            r0.append(r8)     // Catch: java.lang.Throwable -> L111
            java.lang.String r8 = " fields: "
            r0.append(r8)     // Catch: java.lang.Throwable -> L111
            r0.append(r7)     // Catch: java.lang.Throwable -> L111
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> L111
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> L111
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r4)     // Catch: java.lang.Throwable -> L111
            a.C0453x1.b(r7)     // Catch: java.lang.Throwable -> L111
            a.Wf r7 = a.Wf.f330a     // Catch: java.lang.Throwable -> L111
            goto L115
        L111:
            r7 = move-exception
            a.C0465xd.a(r7)
        L115:
            return
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r9) {
            r8 = this;
            java.lang.String r0 = "session"
            a.C0193i9.e(r9, r0)
            java.lang.String r0 = "[DIAG-SNS] handleHook START"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.b(r0)
            java.lang.ClassLoader r0 = r9.f136a
            if (r0 != 0) goto L18
            goto L83
        L18:
            java.lang.String r2 = "com.tencent.mm.ui.contact.mb"
            java.lang.Class r0 = a.A1.b(r0, r2)     // Catch: java.lang.Throwable -> L72
            if (r0 != 0) goto L21
            goto L6f
        L21:
            java.lang.String r2 = r0.getName()     // Catch: java.lang.Throwable -> L72
            java.lang.String r3 = "getView"
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L72
            java.lang.Class<android.view.View> r5 = android.view.View.class
            java.lang.Class<android.view.ViewGroup> r6 = android.view.ViewGroup.class
            java.lang.Class[] r5 = new java.lang.Class[]{r4, r5, r6}     // Catch: java.lang.Throwable -> L72
            a.g2 r6 = new a.g2     // Catch: java.lang.Throwable -> L72
            r7 = 11
            r6.<init>(r7, r8)     // Catch: java.lang.Throwable -> L72
            a.J8.a(r9, r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L72
            java.lang.String r2 = r0.getName()     // Catch: java.lang.Throwable -> L72
            java.lang.String r3 = "getItem"
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> L72
            a.g2 r5 = new a.g2     // Catch: java.lang.Throwable -> L72
            r6 = 12
            r5.<init>(r6, r8)     // Catch: java.lang.Throwable -> L72
            a.J8.a(r9, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L72
            java.lang.String r2 = "getCount"
            r3 = 0
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L72
            a.g2 r4 = new a.g2     // Catch: java.lang.Throwable -> L72
            r5 = 13
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L72
            a.J8.a(r9, r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L72
            java.lang.String r9 = "[DIAG-LABEL] hooked mb adapter"
            java.lang.Object[] r9 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L72
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r1)     // Catch: java.lang.Throwable -> L72
            a.C0453x1.b(r9)     // Catch: java.lang.Throwable -> L72
        L6f:
            a.Wf r9 = a.Wf.f330a     // Catch: java.lang.Throwable -> L72
            goto L76
        L72:
            r9 = move-exception
            a.C0465xd.a(r9)
        L76:
            java.lang.String r9 = "[DIAG-SNS] handleHook DONE"
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r1)
            a.C0453x1.b(r9)
        L83:
            return
    }
}
