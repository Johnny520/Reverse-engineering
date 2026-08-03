package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.Fg f943a;
    public final androidx.lifecycle.q.b b;
    public final a.A4 c;

    public static class a extends androidx.lifecycle.q.c {
        public static androidx.lifecycle.q.a c;
        public final android.app.Application b;

        public a(android.app.Application r1) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                return
        }

        @Override // androidx.lifecycle.q.c, androidx.lifecycle.q.b
        public final <T extends a.Dg> T a(java.lang.Class<T> r2) {
                r1 = this;
                android.app.Application r0 = r1.b
                if (r0 == 0) goto L9
                a.Dg r2 = r1.c(r2, r0)
                return r2
            L9:
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras)."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.lifecycle.q.b
        public final a.Dg b(java.lang.Class r2, a.Ab r3) {
                r1 = this;
                android.app.Application r0 = r1.b
                if (r0 == 0) goto L9
                a.Dg r2 = r1.a(r2)
                return r2
            L9:
                androidx.lifecycle.p r0 = androidx.lifecycle.p.f942a
                java.util.LinkedHashMap r3 = r3.f9a
                java.lang.Object r3 = r3.get(r0)
                android.app.Application r3 = (android.app.Application) r3
                if (r3 == 0) goto L1a
                a.Dg r2 = r1.c(r2, r3)
                return r2
            L1a:
                java.lang.Class<a.r0> r3 = a.C0344r0.class
                boolean r3 = r3.isAssignableFrom(r2)
                if (r3 != 0) goto L27
                a.Dg r2 = super.a(r2)
                return r2
            L27:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "CreationExtras must have an application by `APPLICATION_KEY`"
                r2.<init>(r3)
                throw r2
        }

        public final <T extends a.Dg> T c(java.lang.Class<T> r4, android.app.Application r5) {
                r3 = this;
                java.lang.String r0 = "Cannot create an instance of "
                java.lang.Class<a.r0> r1 = a.C0344r0.class
                boolean r1 = r1.isAssignableFrom(r4)
                if (r1 == 0) goto L74
                java.lang.Class<android.app.Application> r1 = android.app.Application.class
                java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.InstantiationException -> L26 java.lang.IllegalAccessException -> L28 java.lang.NoSuchMethodException -> L2a
                java.lang.reflect.Constructor r1 = r4.getConstructor(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.InstantiationException -> L26 java.lang.IllegalAccessException -> L28 java.lang.NoSuchMethodException -> L2a
                java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.InstantiationException -> L26 java.lang.IllegalAccessException -> L28 java.lang.NoSuchMethodException -> L2a
                java.lang.Object r5 = r1.newInstance(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.InstantiationException -> L26 java.lang.IllegalAccessException -> L28 java.lang.NoSuchMethodException -> L2a
                a.Dg r5 = (a.Dg) r5     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.InstantiationException -> L26 java.lang.IllegalAccessException -> L28 java.lang.NoSuchMethodException -> L2a
                java.lang.String r4 = "{\n                try {\n…          }\n            }"
                a.C0193i9.d(r5, r4)
                return r5
            L24:
                r5 = move-exception
                goto L2c
            L26:
                r5 = move-exception
                goto L3e
            L28:
                r5 = move-exception
                goto L50
            L2a:
                r5 = move-exception
                goto L62
            L2c:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r0)
                r2.append(r4)
                java.lang.String r4 = r2.toString()
                r1.<init>(r4, r5)
                throw r1
            L3e:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r0)
                r2.append(r4)
                java.lang.String r4 = r2.toString()
                r1.<init>(r4, r5)
                throw r1
            L50:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r0)
                r2.append(r4)
                java.lang.String r4 = r2.toString()
                r1.<init>(r4, r5)
                throw r1
            L62:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r0)
                r2.append(r4)
                java.lang.String r4 = r2.toString()
                r1.<init>(r4, r5)
                throw r1
            L74:
                a.Dg r4 = super.a(r4)
                return r4
        }
    }

    public interface b {
        default <T extends a.Dg> T a(java.lang.Class<T> r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method."
                r2.<init>(r0)
                throw r2
        }

        default a.Dg b(java.lang.Class r1, a.Ab r2) {
                r0 = this;
                a.Dg r1 = r0.a(r1)
                return r1
        }
    }

    public static class c implements androidx.lifecycle.q.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static androidx.lifecycle.q.c f944a;

        @Override // androidx.lifecycle.q.b
        public <T extends a.Dg> T a(java.lang.Class<T> r5) {
                r4 = this;
                java.lang.String r0 = "Cannot create an instance of "
                r1 = 0
                java.lang.reflect.Constructor r2 = r5.getDeclaredConstructor(r1)     // Catch: java.lang.IllegalAccessException -> L13 java.lang.InstantiationException -> L15 java.lang.NoSuchMethodException -> L17
                java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.IllegalAccessException -> L13 java.lang.InstantiationException -> L15 java.lang.NoSuchMethodException -> L17
                java.lang.String r2 = "{\n                modelC…wInstance()\n            }"
                a.C0193i9.d(r1, r2)     // Catch: java.lang.IllegalAccessException -> L13 java.lang.InstantiationException -> L15 java.lang.NoSuchMethodException -> L17
                a.Dg r1 = (a.Dg) r1     // Catch: java.lang.IllegalAccessException -> L13 java.lang.InstantiationException -> L15 java.lang.NoSuchMethodException -> L17
                return r1
            L13:
                r1 = move-exception
                goto L19
            L15:
                r1 = move-exception
                goto L2b
            L17:
                r1 = move-exception
                goto L3d
            L19:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r0)
                r3.append(r5)
                java.lang.String r5 = r3.toString()
                r2.<init>(r5, r1)
                throw r2
            L2b:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r0)
                r3.append(r5)
                java.lang.String r5 = r3.toString()
                r2.<init>(r5, r1)
                throw r2
            L3d:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r0)
                r3.append(r5)
                java.lang.String r5 = r3.toString()
                r2.<init>(r5, r1)
                throw r2
        }
    }

    public static class d {
        public d() {
                r0 = this;
                r0.<init>()
                return
        }

        public void c(a.Dg r1) {
                r0 = this;
                return
        }
    }

    public q(a.Fg r2, androidx.lifecycle.q.b r3) {
            r1 = this;
            java.lang.String r0 = "store"
            a.C0193i9.e(r2, r0)
            a.A4$a r0 = a.A4.a.b
            r1.<init>(r2, r3, r0)
            return
    }

    public q(a.Fg r2, androidx.lifecycle.q.b r3, a.A4 r4) {
            r1 = this;
            java.lang.String r0 = "store"
            a.C0193i9.e(r2, r0)
            java.lang.String r0 = "defaultCreationExtras"
            a.C0193i9.e(r4, r0)
            r1.<init>()
            r1.f943a = r2
            r1.b = r3
            r1.c = r4
            return
    }

    public final a.Dg a(java.lang.Class r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = "key"
            a.C0193i9.e(r7, r0)
            a.Fg r0 = r5.f943a
            r0.getClass()
            java.util.LinkedHashMap r0 = r0.f92a
            java.lang.Object r1 = r0.get(r7)
            a.Dg r1 = (a.Dg) r1
            boolean r2 = r6.isInstance(r1)
            androidx.lifecycle.q$b r3 = r5.b
            if (r2 == 0) goto L30
            boolean r6 = r3 instanceof androidx.lifecycle.q.d
            if (r6 == 0) goto L21
            androidx.lifecycle.q$d r3 = (androidx.lifecycle.q.d) r3
            goto L22
        L21:
            r3 = 0
        L22:
            if (r3 == 0) goto L2a
            a.C0193i9.b(r1)
            r3.c(r1)
        L2a:
            java.lang.String r6 = "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"
            a.C0193i9.c(r1, r6)
            return r1
        L30:
            a.Ab r1 = new a.Ab
            a.A4 r2 = r5.c
            r1.<init>(r2)
            androidx.lifecycle.r r2 = androidx.lifecycle.r.f945a
            java.util.LinkedHashMap r4 = r1.f9a
            r4.put(r2, r7)
            a.Dg r6 = r3.b(r6, r1)     // Catch: java.lang.AbstractMethodError -> L43
            goto L47
        L43:
            a.Dg r6 = r3.a(r6)
        L47:
            java.lang.String r1 = "viewModel"
            a.C0193i9.e(r6, r1)
            java.lang.Object r7 = r0.put(r7, r6)
            a.Dg r7 = (a.Dg) r7
            if (r7 == 0) goto L57
            r7.b()
        L57:
            return r6
    }
}
