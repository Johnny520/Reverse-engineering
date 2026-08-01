package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class CommentBookmarkNetCompat {
    public static final int $stable = 0;
    private static final java.lang.String COMMENT_API_HOST = "https://aweme.snssdk.com";
    public static final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat INSTANCE = null;
    private static final java.lang.String TAG = "r441d0028c4f889b";

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class ArgPlan {
        public static final int $stable = 8;
        private final java.lang.Object[] args;
        private final java.lang.String name;

        public ArgPlan(java.lang.String r1, java.lang.Object[] r2) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                r0.<init>()
                r0.name = r1
                r0.args = r2
                return
        }

        public static /* synthetic */ com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.ArgPlan copy$default(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.ArgPlan r0, java.lang.String r1, java.lang.Object[] r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                java.lang.String r1 = r0.name
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                java.lang.Object[] r2 = r0.args
            Lc:
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat$ArgPlan r0 = r0.copy(r1, r2)
                return r0
        }

        public final java.lang.String component1() {
                r0 = this;
                java.lang.String r0 = r0.name
                return r0
        }

        public final java.lang.Object[] component2() {
                r0 = this;
                java.lang.Object[] r0 = r0.args
                return r0
        }

        public final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.ArgPlan copy(java.lang.String r1, java.lang.Object[] r2) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat$ArgPlan r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat$ArgPlan
                r0.<init>(r1, r2)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.ArgPlan
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat$ArgPlan r5 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.ArgPlan) r5
                java.lang.String r1 = r4.name
                java.lang.String r3 = r5.name
                boolean r1 = p000.ln0.m3626(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.Object[] r4 = r4.args
                java.lang.Object[] r5 = r5.args
                boolean r4 = p000.ln0.m3626(r4, r5)
                if (r4 != 0) goto L22
                return r2
            L22:
                return r0
        }

        public final java.lang.Object[] getArgs() {
                r0 = this;
                java.lang.Object[] r0 = r0.args
                return r0
        }

        public final java.lang.String getName() {
                r0 = this;
                java.lang.String r0 = r0.name
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.String r0 = r1.name
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.Object[] r1 = r1.args
                int r1 = java.util.Arrays.hashCode(r1)
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.String r0 = r4.name
                java.lang.Object[] r4 = r4.args
                java.lang.String r4 = java.util.Arrays.toString(r4)
                java.lang.String r1 = ", args="
                java.lang.String r2 = ")"
                java.lang.String r3 = "ArgPlan(name="
                java.lang.String r4 = p000.lz1.m3689(r3, r0, r1, r4, r2)
                return r4
        }
    }

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class CapturedProfile {
        public static final int $stable = 8;
        private final java.util.List<java.lang.Object> args;
        private final java.lang.String methodKey;
        private final java.util.List<java.lang.String> paramNames;
        private final long timestamp;

        public CapturedProfile(java.lang.String r1, java.util.List<? extends java.lang.Object> r2, java.util.List<java.lang.String> r3, long r4) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                r3.getClass()
                r0.<init>()
                r0.methodKey = r1
                r0.args = r2
                r0.paramNames = r3
                r0.timestamp = r4
                return
        }

        public /* synthetic */ CapturedProfile(java.lang.String r7, java.util.List r8, java.util.List r9, long r10, int r12, p000.AbstractC1067zq r13) {
                r6 = this;
                r12 = r12 & 8
                if (r12 == 0) goto L8
                long r10 = java.lang.System.currentTimeMillis()
            L8:
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r0.<init>(r1, r2, r3, r4)
                return
        }

        public static /* synthetic */ com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.CapturedProfile copy$default(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.CapturedProfile r0, java.lang.String r1, java.util.List r2, java.util.List r3, long r4, int r6, java.lang.Object r7) {
                r7 = r6 & 1
                if (r7 == 0) goto L6
                java.lang.String r1 = r0.methodKey
            L6:
                r7 = r6 & 2
                if (r7 == 0) goto Lc
                java.util.List<java.lang.Object> r2 = r0.args
            Lc:
                r7 = r6 & 4
                if (r7 == 0) goto L12
                java.util.List<java.lang.String> r3 = r0.paramNames
            L12:
                r6 = r6 & 8
                if (r6 == 0) goto L18
                long r4 = r0.timestamp
            L18:
                r6 = r4
                r4 = r2
                r5 = r3
                r2 = r0
                r3 = r1
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat$CapturedProfile r0 = r2.copy(r3, r4, r5, r6)
                return r0
        }

        public final java.lang.String component1() {
                r0 = this;
                java.lang.String r0 = r0.methodKey
                return r0
        }

        public final java.util.List<java.lang.Object> component2() {
                r0 = this;
                java.util.List<java.lang.Object> r0 = r0.args
                return r0
        }

        public final java.util.List<java.lang.String> component3() {
                r0 = this;
                java.util.List<java.lang.String> r0 = r0.paramNames
                return r0
        }

        public final long component4() {
                r2 = this;
                long r0 = r2.timestamp
                return r0
        }

        public final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.CapturedProfile copy(java.lang.String r1, java.util.List<? extends java.lang.Object> r2, java.util.List<java.lang.String> r3, long r4) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                r3.getClass()
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat$CapturedProfile r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat$CapturedProfile
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        public boolean equals(java.lang.Object r6) {
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L4
                return r0
            L4:
                boolean r1 = r6 instanceof com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.CapturedProfile
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat$CapturedProfile r6 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.CapturedProfile) r6
                java.lang.String r1 = r5.methodKey
                java.lang.String r3 = r6.methodKey
                boolean r1 = p000.ln0.m3626(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.util.List<java.lang.Object> r1 = r5.args
                java.util.List<java.lang.Object> r3 = r6.args
                boolean r1 = p000.ln0.m3626(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                java.util.List<java.lang.String> r1 = r5.paramNames
                java.util.List<java.lang.String> r3 = r6.paramNames
                boolean r1 = p000.ln0.m3626(r1, r3)
                if (r1 != 0) goto L2d
                return r2
            L2d:
                long r3 = r5.timestamp
                long r5 = r6.timestamp
                int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r5 == 0) goto L36
                return r2
            L36:
                return r0
        }

        public final java.util.List<java.lang.Object> getArgs() {
                r0 = this;
                java.util.List<java.lang.Object> r0 = r0.args
                return r0
        }

        public final java.lang.String getMethodKey() {
                r0 = this;
                java.lang.String r0 = r0.methodKey
                return r0
        }

        public final java.util.List<java.lang.String> getParamNames() {
                r0 = this;
                java.util.List<java.lang.String> r0 = r0.paramNames
                return r0
        }

        public final long getTimestamp() {
                r2 = this;
                long r0 = r2.timestamp
                return r0
        }

        public int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.methodKey
                int r0 = r0.hashCode()
                r1 = 31
                int r0 = r0 * r1
                java.util.List<java.lang.Object> r2 = r3.args
                int r0 = p000.a12.m16(r2, r0, r1)
                java.util.List<java.lang.String> r2 = r3.paramNames
                int r0 = p000.a12.m16(r2, r0, r1)
                long r1 = r3.timestamp
                int r3 = java.lang.Long.hashCode(r1)
                int r3 = r3 + r0
                return r3
        }

        public java.lang.String toString() {
                r6 = this;
                java.lang.String r0 = r6.methodKey
                java.util.List<java.lang.Object> r1 = r6.args
                java.util.List<java.lang.String> r2 = r6.paramNames
                long r3 = r6.timestamp
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r5 = "CapturedProfile(methodKey="
                r6.<init>(r5)
                r6.append(r0)
                java.lang.String r0 = ", args="
                r6.append(r0)
                r6.append(r1)
                java.lang.String r0 = ", paramNames="
                r6.append(r0)
                r6.append(r2)
                java.lang.String r0 = ", timestamp="
                r6.append(r0)
                r6.append(r3)
                java.lang.String r0 = ")"
                r6.append(r0)
                java.lang.String r6 = r6.toString()
                return r6
        }
    }

    static {
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE = r0
            return
    }

    private CommentBookmarkNetCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.util.List<java.lang.reflect.Field> allFields(java.lang.Class<?> r2) {
            r1 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L5:
            if (r2 == 0) goto L14
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L14
            java.lang.Class r2 = p000.lz1.m3684(r2, r1)
            goto L5
        L14:
            return r1
    }

    private final java.lang.Object awaitBoltsTask(java.lang.Object r11) {
            r10 = this;
            java.lang.Class r10 = r11.getClass()
            r0 = 0
            java.lang.String r1 = "isCompleted"
            java.lang.reflect.Method r1 = r10.getMethod(r1, r0)     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r1.invoke(r11, r0)     // Catch: java.lang.Throwable -> L16
            boolean r2 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L18
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L16
            goto L20
        L16:
            r1 = move-exception
            goto L1a
        L18:
            r1 = r0
            goto L20
        L1a:
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L20:
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L25
            r1 = r0
        L25:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r2 = 0
            if (r1 == 0) goto L2f
            boolean r1 = r1.booleanValue()
            goto L30
        L2f:
            r1 = r2
        L30:
            if (r1 != 0) goto Lc1
            java.lang.reflect.Method[] r1 = r10.getMethods()
            r1.getClass()
            int r3 = r1.length
            r4 = r2
        L3b:
            java.lang.String r5 = "waitForCompletion"
            r6 = 1
            if (r4 >= r3) goto L79
            r7 = r1[r4]
            java.lang.String r8 = r7.getName()
            boolean r8 = p000.ln0.m3626(r8, r5)
            if (r8 == 0) goto L72
            java.lang.Class[] r8 = r7.getParameterTypes()
            int r8 = r8.length
            r9 = 2
            if (r8 != r9) goto L72
            java.lang.Class[] r8 = r7.getParameterTypes()
            r8 = r8[r2]
            java.lang.Class r9 = java.lang.Long.TYPE
            boolean r8 = p000.ln0.m3626(r8, r9)
            if (r8 == 0) goto L72
            java.lang.Class[] r8 = r7.getParameterTypes()
            r8 = r8[r6]
            java.lang.Class<java.util.concurrent.TimeUnit> r9 = java.util.concurrent.TimeUnit.class
            boolean r8 = p000.ln0.m3626(r8, r9)
            if (r8 == 0) goto L72
            r8 = r6
            goto L73
        L72:
            r8 = r2
        L73:
            if (r8 == 0) goto L76
            goto L7a
        L76:
            int r4 = r4 + 1
            goto L3b
        L79:
            r7 = r0
        L7a:
            if (r7 == 0) goto L8c
            r3 = 12
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r3}
            r7.invoke(r11, r1)
            goto Lc1
        L8c:
            java.lang.reflect.Method[] r1 = r10.getMethods()
            r1.getClass()
            int r3 = r1.length
            r4 = r2
        L95:
            if (r4 >= r3) goto Lbb
            r7 = r1[r4]
            java.lang.String r8 = r7.getName()
            boolean r8 = p000.ln0.m3626(r8, r5)
            if (r8 == 0) goto Lb4
            java.lang.Class[] r8 = r7.getParameterTypes()
            r8.getClass()
            int r8 = r8.length
            if (r8 != 0) goto Laf
            r8 = r6
            goto Lb0
        Laf:
            r8 = r2
        Lb0:
            if (r8 == 0) goto Lb4
            r8 = r6
            goto Lb5
        Lb4:
            r8 = r2
        Lb5:
            if (r8 == 0) goto Lb8
            goto Lbc
        Lb8:
            int r4 = r4 + 1
            goto L95
        Lbb:
            r7 = r0
        Lbc:
            if (r7 == 0) goto Lc1
            r7.invoke(r11, r0)
        Lc1:
            java.lang.String r1 = "isFaulted"
            java.lang.reflect.Method r1 = r10.getMethod(r1, r0)     // Catch: java.lang.Throwable -> Ld2
            java.lang.Object r1 = r1.invoke(r11, r0)     // Catch: java.lang.Throwable -> Ld2
            boolean r3 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> Ld2
            if (r3 == 0) goto Ld4
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> Ld2
            goto Ldc
        Ld2:
            r1 = move-exception
            goto Ld6
        Ld4:
            r1 = r0
            goto Ldc
        Ld6:
            eo1 r3 = new eo1
            r3.<init>(r1)
            r1 = r3
        Ldc:
            boolean r3 = r1 instanceof p000.eo1
            if (r3 == 0) goto Le1
            r1 = r0
        Le1:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto Lea
            boolean r1 = r1.booleanValue()
            goto Leb
        Lea:
            r1 = r2
        Leb:
            if (r1 == 0) goto L11a
            java.lang.String r1 = "getError"
            java.lang.reflect.Method r10 = r10.getMethod(r1, r0)     // Catch: java.lang.Throwable -> Lfe
            java.lang.Object r10 = r10.invoke(r11, r0)     // Catch: java.lang.Throwable -> Lfe
            boolean r11 = r10 instanceof java.lang.Throwable     // Catch: java.lang.Throwable -> Lfe
            if (r11 == 0) goto L100
            java.lang.Throwable r10 = (java.lang.Throwable) r10     // Catch: java.lang.Throwable -> Lfe
            goto L108
        Lfe:
            r10 = move-exception
            goto L102
        L100:
            r10 = r0
            goto L108
        L102:
            eo1 r11 = new eo1
            r11.<init>(r10)
            r10 = r11
        L108:
            boolean r11 = r10 instanceof p000.eo1
            if (r11 == 0) goto L10d
            goto L10e
        L10d:
            r0 = r10
        L10e:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 != 0) goto L119
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r10 = "Task faulted"
            r0.<init>(r10)
        L119:
            throw r0
        L11a:
            java.lang.String r1 = "isCancelled"
            java.lang.reflect.Method r1 = r10.getMethod(r1, r0)     // Catch: java.lang.Throwable -> L12b
            java.lang.Object r1 = r1.invoke(r11, r0)     // Catch: java.lang.Throwable -> L12b
            boolean r3 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L12b
            if (r3 == 0) goto L12d
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L12b
            goto L135
        L12b:
            r1 = move-exception
            goto L12f
        L12d:
            r1 = r0
            goto L135
        L12f:
            eo1 r3 = new eo1
            r3.<init>(r1)
            r1 = r3
        L135:
            boolean r3 = r1 instanceof p000.eo1
            if (r3 == 0) goto L13a
            r1 = r0
        L13a:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L142
            boolean r2 = r1.booleanValue()
        L142:
            if (r2 != 0) goto L14f
            java.lang.String r1 = "getResult"
            java.lang.reflect.Method r10 = r10.getMethod(r1, r0)
            java.lang.Object r10 = r10.invoke(r11, r0)
            return r10
        L14f:
            java.lang.String r10 = "Task cancelled"
            p000.C1080.m7279(r10)
            r10 = 0
            return r10
    }

    private final java.lang.Object blockingFirst(java.lang.Object r10) {
            r9 = this;
            r0 = 0
            r1 = 0
            java.lang.Class r2 = r10.getClass()     // Catch: java.lang.Throwable -> L45
            java.lang.reflect.Method[] r2 = r2.getMethods()     // Catch: java.lang.Throwable -> L45
            r2.getClass()     // Catch: java.lang.Throwable -> L45
            int r3 = r2.length     // Catch: java.lang.Throwable -> L45
            r4 = r1
        Lf:
            if (r4 >= r3) goto L4a
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L45
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L45
            java.lang.String r7 = "timeout"
            boolean r6 = p000.ln0.m3626(r6, r7)     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L47
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L45
            int r6 = r6.length     // Catch: java.lang.Throwable -> L45
            r7 = 2
            if (r6 != r7) goto L47
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L45
            r6 = r6[r1]     // Catch: java.lang.Throwable -> L45
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L45
            boolean r6 = p000.ln0.m3626(r6, r7)     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L47
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L45
            r7 = 1
            r6 = r6[r7]     // Catch: java.lang.Throwable -> L45
            java.lang.Class<java.util.concurrent.TimeUnit> r7 = java.util.concurrent.TimeUnit.class
            boolean r6 = p000.ln0.m3626(r6, r7)     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L47
            goto L4b
        L45:
            r2 = move-exception
            goto L60
        L47:
            int r4 = r4 + 1
            goto Lf
        L4a:
            r5 = r0
        L4b:
            if (r5 != 0) goto L4f
            r2 = r10
            goto L66
        L4f:
            r2 = 12
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L45
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L45
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}     // Catch: java.lang.Throwable -> L45
            java.lang.Object r2 = r9.invokeUnwrap(r5, r10, r2)     // Catch: java.lang.Throwable -> L45
            goto L66
        L60:
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L66:
            java.lang.Throwable r3 = p000.fo1.m2190(r2)
            if (r3 != 0) goto L6d
            goto L6e
        L6d:
            r2 = r10
        L6e:
            if (r2 == 0) goto La4
            java.lang.Class r3 = r2.getClass()
            java.lang.reflect.Method[] r3 = r3.getMethods()
            if (r3 == 0) goto La4
            int r4 = r3.length
            r5 = r1
        L7c:
            if (r5 >= r4) goto L9b
            r6 = r3[r5]
            java.lang.String r7 = r6.getName()
            java.lang.String r8 = "blockingFirst"
            boolean r7 = p000.ln0.m3626(r7, r8)
            if (r7 == 0) goto L98
            java.lang.Class[] r7 = r6.getParameterTypes()
            r7.getClass()
            int r7 = r7.length
            if (r7 != 0) goto L98
            r0 = r6
            goto L9b
        L98:
            int r5 = r5 + 1
            goto L7c
        L9b:
            if (r0 == 0) goto La4
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.Object r9 = r9.invokeUnwrap(r0, r2, r10)
            return r9
        La4:
            java.lang.Class r9 = r10.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r10 = ".blockingFirst"
            java.lang.String r9 = r9.concat(r10)
            p000.ql1.m4936(r9)
            r9 = 0
            return r9
    }

    private final java.lang.Object blockingGet(java.lang.Object r10) {
            r9 = this;
            r0 = 0
            r1 = 0
            java.lang.Class r2 = r10.getClass()     // Catch: java.lang.Throwable -> L45
            java.lang.reflect.Method[] r2 = r2.getMethods()     // Catch: java.lang.Throwable -> L45
            r2.getClass()     // Catch: java.lang.Throwable -> L45
            int r3 = r2.length     // Catch: java.lang.Throwable -> L45
            r4 = r1
        Lf:
            if (r4 >= r3) goto L4a
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L45
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L45
            java.lang.String r7 = "timeout"
            boolean r6 = p000.ln0.m3626(r6, r7)     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L47
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L45
            int r6 = r6.length     // Catch: java.lang.Throwable -> L45
            r7 = 2
            if (r6 != r7) goto L47
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L45
            r6 = r6[r1]     // Catch: java.lang.Throwable -> L45
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L45
            boolean r6 = p000.ln0.m3626(r6, r7)     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L47
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L45
            r7 = 1
            r6 = r6[r7]     // Catch: java.lang.Throwable -> L45
            java.lang.Class<java.util.concurrent.TimeUnit> r7 = java.util.concurrent.TimeUnit.class
            boolean r6 = p000.ln0.m3626(r6, r7)     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L47
            goto L4b
        L45:
            r2 = move-exception
            goto L60
        L47:
            int r4 = r4 + 1
            goto Lf
        L4a:
            r5 = r0
        L4b:
            if (r5 != 0) goto L4f
            r2 = r10
            goto L66
        L4f:
            r2 = 12
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L45
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L45
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}     // Catch: java.lang.Throwable -> L45
            java.lang.Object r2 = r9.invokeUnwrap(r5, r10, r2)     // Catch: java.lang.Throwable -> L45
            goto L66
        L60:
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L66:
            java.lang.Throwable r3 = p000.fo1.m2190(r2)
            if (r3 != 0) goto L6d
            goto L6e
        L6d:
            r2 = r10
        L6e:
            if (r2 == 0) goto La4
            java.lang.Class r3 = r2.getClass()
            java.lang.reflect.Method[] r3 = r3.getMethods()
            if (r3 == 0) goto La4
            int r4 = r3.length
            r5 = r1
        L7c:
            if (r5 >= r4) goto L9b
            r6 = r3[r5]
            java.lang.String r7 = r6.getName()
            java.lang.String r8 = "blockingGet"
            boolean r7 = p000.ln0.m3626(r7, r8)
            if (r7 == 0) goto L98
            java.lang.Class[] r7 = r6.getParameterTypes()
            r7.getClass()
            int r7 = r7.length
            if (r7 != 0) goto L98
            r0 = r6
            goto L9b
        L98:
            int r5 = r5 + 1
            goto L7c
        L9b:
            if (r0 == 0) goto La4
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.Object r9 = r9.invokeUnwrap(r0, r2, r10)
            return r9
        La4:
            java.lang.Class r9 = r10.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r10 = ".blockingGet"
            java.lang.String r9 = r9.concat(r10)
            p000.ql1.m4936(r9)
            r9 = 0
            return r9
    }

    private final java.lang.Object callNoArgOrBooleanStatic(java.lang.Class<?> r5) {
            r4 = this;
            java.lang.reflect.Method[] r4 = r5.getDeclaredMethods()
            r4.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r0 = r4.length
            r1 = 0
        Le:
            if (r1 >= r0) goto L22
            r2 = r4[r1]
            int r3 = r2.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)
            if (r3 == 0) goto L1f
            r5.add(r2)
        L1f:
            int r1 = r1 + 1
            goto Le
        L22:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r5.iterator()
        L2b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r5.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Class r1 = r1.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 != 0) goto L2b
            r4.add(r0)
            goto L2b
        L48:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L51:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r4.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Class[] r2 = r1.getParameterTypes()
            r2.getClass()
            int r2 = r2.length
            if (r2 != 0) goto L69
            goto L79
        L69:
            java.lang.Class[] r1 = r1.getParameterTypes()
            java.lang.Class r2 = java.lang.Boolean.TYPE
            java.lang.Class[] r2 = new java.lang.Class[]{r2}
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto L51
        L79:
            r5.add(r0)
            goto L51
        L7d:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat$callNoArgOrBooleanStatic$$inlined$sortedByDescending$1 r4 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat$callNoArgOrBooleanStatic$$inlined$sortedByDescending$1
            r4.<init>()
            java.util.List r4 = p000.AbstractC0984xh.m6658(r5, r4)
            java.util.Iterator r4 = r4.iterator()
        L8a:
            boolean r5 = r4.hasNext()
            r0 = 0
            if (r5 == 0) goto Lc5
            java.lang.Object r5 = r4.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            r1 = 1
            r5.setAccessible(r1)     // Catch: java.lang.Throwable -> Laa
            java.lang.Class[] r1 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> Laa
            r1.getClass()     // Catch: java.lang.Throwable -> Laa
            int r1 = r1.length     // Catch: java.lang.Throwable -> Laa
            if (r1 != 0) goto Lac
            java.lang.Object r5 = r5.invoke(r0, r0)     // Catch: java.lang.Throwable -> Laa
            goto Lbd
        Laa:
            r5 = move-exception
            goto Lb7
        Lac:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Laa
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r5 = r5.invoke(r0, r1)     // Catch: java.lang.Throwable -> Laa
            goto Lbd
        Lb7:
            eo1 r1 = new eo1
            r1.<init>(r5)
            r5 = r1
        Lbd:
            boolean r1 = r5 instanceof p000.eo1
            if (r1 == 0) goto Lc2
            goto Lc3
        Lc2:
            r0 = r5
        Lc3:
            if (r0 == 0) goto L8a
        Lc5:
            return r0
    }

    private final java.lang.Object createApiByRetrofitFactory(java.lang.Class<?> r4) {
            r3 = this;
            r0 = 0
            java.lang.ClassLoader r1 = r4.getClassLoader()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "~7958639031A1A3555FFBD7E3E2CA3675A90331AF12679BCEE74C7B4CF8875EBD979E21CD04FF0562ED8FD423439F4080CE784C"
            java.lang.String r2 = p000.jf0.m2957(r2)     // Catch: java.lang.Throwable -> L42
            java.lang.Class r1 = p000.qe0.m4877(r1, r2)     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L15
        L13:
            r3 = r0
            goto L49
        L15:
            java.lang.Object r3 = r3.callNoArgOrBooleanStatic(r1)     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L1c
            goto L13
        L1c:
            java.lang.String r1 = "createBuilder"
            java.lang.String r2 = "https://aweme.snssdk.com"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L42
            java.lang.Object r3 = p000.qe0.m4869(r3, r1, r2)     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L2b
            goto L13
        L2b:
            java.lang.String r1 = "build"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L42
            java.lang.Object r3 = p000.qe0.m4869(r3, r1, r2)     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L37
            goto L13
        L37:
            java.lang.String r1 = "create"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L42
            java.lang.Object r3 = p000.qe0.m4869(r3, r1, r4)     // Catch: java.lang.Throwable -> L42
            goto L49
        L42:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L49:
            java.lang.Throwable r4 = p000.fo1.m2190(r3)
            if (r4 == 0) goto L5f
            java.lang.String r4 = r4.getMessage()
            java.lang.String r1 = "createApiByRetrofitFactory optional unavailable: "
            java.lang.String r4 = p000.lz1.m3687(r1, r4)
            r1 = 4
            java.lang.String r2 = "r441d0028c4f889b"
            p000.C0888ux.m5988(r2, r4, r0, r1, r0)
        L5f:
            boolean r4 = r3 instanceof p000.eo1
            if (r4 == 0) goto L64
            goto L65
        L64:
            r0 = r3
        L65:
            return r0
    }

    private final java.lang.Object createApiByRetrofitService(java.lang.Class<?> r5) {
            r4 = this;
            r0 = 0
            java.lang.ClassLoader r1 = r5.getClassLoader()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = "~79504AF3C39B11021DAC8210F33C72EF521D7099C0A60F0CD8107C8BB77EA1388D4B0E93EAAB5799C72D08C663B6E6BA8F"
            java.lang.String r2 = p000.jf0.m2957(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.Class r2 = p000.qe0.m4877(r1, r2)     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto L15
        L13:
            r4 = r0
            goto L5f
        L15:
            java.lang.String r3 = "~7934B87CE184340F84F7127372E5F7BF0B2DC4F258E8184B046CCF32E81952B14DB7A14B89C8BB89"
            java.lang.String r3 = p000.jf0.m2957(r3)     // Catch: java.lang.Throwable -> L33
            java.lang.Class r1 = p000.qe0.m4877(r1, r3)     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L22
            goto L13
        L22:
            java.lang.String r3 = "LIZIZ"
            java.lang.reflect.Field r1 = p000.qe0.m4878(r1, r3)     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L33
            boolean r3 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L35
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L33
            goto L36
        L33:
            r4 = move-exception
            goto L59
        L35:
            r1 = r0
        L36:
            if (r1 != 0) goto L3a
            java.lang.String r1 = "https://aweme.snssdk.com"
        L3a:
            java.lang.Object r4 = r4.callNoArgOrBooleanStatic(r2)     // Catch: java.lang.Throwable -> L33
            if (r4 != 0) goto L41
            goto L13
        L41:
            java.lang.String r2 = "createNewRetrofit"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L33
            java.lang.Object r4 = p000.qe0.m4869(r4, r2, r1)     // Catch: java.lang.Throwable -> L33
            if (r4 != 0) goto L4e
            goto L13
        L4e:
            java.lang.String r1 = "create"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L33
            java.lang.Object r4 = p000.qe0.m4869(r4, r1, r5)     // Catch: java.lang.Throwable -> L33
            goto L5f
        L59:
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L5f:
            java.lang.Throwable r5 = p000.fo1.m2190(r4)
            if (r5 == 0) goto L75
            java.lang.String r5 = r5.getMessage()
            java.lang.String r1 = "createApiByRetrofitService optional unavailable: "
            java.lang.String r5 = p000.lz1.m3687(r1, r5)
            r1 = 4
            java.lang.String r2 = "r441d0028c4f889b"
            p000.C0888ux.m5988(r2, r5, r0, r1, r0)
        L75:
            boolean r5 = r4 instanceof p000.eo1
            if (r5 == 0) goto L7a
            goto L7b
        L7a:
            r0 = r4
        L7b:
            return r0
    }

    private final java.lang.Object executeRetrofitCall(java.lang.Object r9) {
            r8 = this;
            java.lang.Class r0 = r9.getClass()
            java.lang.reflect.Method[] r0 = r0.getMethods()
            r0.getClass()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Le:
            r4 = 0
            if (r3 >= r1) goto L2d
            r5 = r0[r3]
            java.lang.String r6 = r5.getName()
            java.lang.String r7 = "execute"
            boolean r6 = p000.ln0.m3626(r6, r7)
            if (r6 == 0) goto L2a
            java.lang.Class[] r6 = r5.getParameterTypes()
            r6.getClass()
            int r6 = r6.length
            if (r6 != 0) goto L2a
            goto L2e
        L2a:
            int r3 = r3 + 1
            goto Le
        L2d:
            r5 = r4
        L2e:
            if (r5 != 0) goto L31
            return r9
        L31:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Object r9 = r8.invokeUnwrap(r5, r9, r0)
            if (r9 != 0) goto L3a
            return r4
        L3a:
            java.lang.Class r0 = r9.getClass()
            java.lang.reflect.Method[] r0 = r0.getMethods()
            r0.getClass()
            int r1 = r0.length
            r3 = r2
        L47:
            if (r3 >= r1) goto L66
            r5 = r0[r3]
            java.lang.String r6 = r5.getName()
            java.lang.String r7 = "body"
            boolean r6 = p000.ln0.m3626(r6, r7)
            if (r6 == 0) goto L63
            java.lang.Class[] r6 = r5.getParameterTypes()
            r6.getClass()
            int r6 = r6.length
            if (r6 != 0) goto L63
            r4 = r5
            goto L66
        L63:
            int r3 = r3 + 1
            goto L47
        L66:
            if (r4 != 0) goto L69
            return r9
        L69:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Object r8 = r8.invokeUnwrap(r4, r9, r0)
            return r8
    }

    private final boolean hasMethod(java.lang.Class<?> r5, java.lang.String r6) {
            r4 = this;
            java.lang.reflect.Method[] r4 = r5.getMethods()
            r4.getClass()
            int r5 = r4.length
            r0 = 0
            r1 = r0
        La:
            if (r1 >= r5) goto L27
            r2 = r4[r1]
            java.lang.String r3 = r2.getName()
            boolean r3 = p000.ln0.m3626(r3, r6)
            if (r3 == 0) goto L24
            java.lang.Class[] r2 = r2.getParameterTypes()
            r2.getClass()
            int r2 = r2.length
            if (r2 != 0) goto L24
            r4 = 1
            return r4
        L24:
            int r1 = r1 + 1
            goto La
        L27:
            return r0
    }

    private final boolean isBoltsTask(java.lang.Object r2) {
            r1 = this;
            java.lang.Class r1 = r2.getClass()
        L4:
            if (r1 == 0) goto L21
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L21
            java.lang.String r2 = r1.getName()
            java.lang.String r0 = "bolts.Task"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L1c
            r1 = 1
            return r1
        L1c:
            java.lang.Class r1 = r1.getSuperclass()
            goto L4
        L21:
            r1 = 0
            return r1
    }

    private final java.lang.Object primitiveDefaultForParam(java.lang.String r3, java.lang.Class<?> r4) {
            r2 = this;
            boolean r2 = r4.isPrimitive()
            r0 = 0
            if (r2 != 0) goto L8
            return r0
        L8:
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = r4.equals(r2)
            r1 = 0
            if (r2 == 0) goto L4a
            if (r3 == 0) goto L45
            int r2 = r3.hashCode()
            switch(r2) {
                case -1930808873: goto L3b;
                case -1112970844: goto L30;
                case -977092112: goto L27;
                case 94851343: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto L45
        L1b:
            java.lang.String r2 = "count"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L24
            goto L45
        L24:
            r1 = 20
            goto L45
        L27:
            java.lang.String r2 = "forward_page_type"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L44
            goto L45
        L30:
            java.lang.String r2 = "comment_level"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L39
            goto L45
        L39:
            r1 = 2
            goto L45
        L3b:
            java.lang.String r2 = "channel_id"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L44
            goto L45
        L44:
            r1 = -1
        L45:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            return r2
        L4a:
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L59
            r2 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            return r2
        L59:
            java.lang.Class r2 = java.lang.Boolean.TYPE
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L64
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            return r2
        L64:
            java.lang.Class r2 = java.lang.Float.TYPE
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L72
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
        L72:
            java.lang.Class r2 = java.lang.Double.TYPE
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L81
            r2 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            return r2
        L81:
            java.lang.Class r2 = java.lang.Short.TYPE
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L8e
            java.lang.Short r2 = java.lang.Short.valueOf(r1)
            return r2
        L8e:
            java.lang.Class r2 = java.lang.Byte.TYPE
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L9b
            java.lang.Byte r2 = java.lang.Byte.valueOf(r1)
            return r2
        L9b:
            java.lang.Class r2 = java.lang.Character.TYPE
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto La8
            java.lang.Character r2 = java.lang.Character.valueOf(r1)
            return r2
        La8:
            return r0
    }

    private final java.lang.String queryNameOf(java.lang.annotation.Annotation[] r8, java.util.List<java.lang.String> r9) {
            r7 = this;
            int r7 = r8.length
            r0 = 0
            r1 = r0
        L3:
            r2 = 0
            if (r1 >= r7) goto L77
            r3 = r8[r1]
            wf r4 = p000.ln0.m3599(r3)
            java.lang.Class r4 = p000.ln0.m3604(r4)
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = ".ExtraInfo"
            boolean r4 = p000.x02.m6479(r4, r5, r0)
            if (r4 == 0) goto L1f
            java.lang.String r7 = "__extra_info__"
            return r7
        L1f:
            wf r4 = p000.ln0.m3599(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.Class r4 = p000.ln0.m3604(r4)     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = "value"
            java.lang.reflect.Method r4 = r4.getMethod(r5, r2)     // Catch: java.lang.Throwable -> L38
            java.lang.Object r4 = r4.invoke(r3, r2)     // Catch: java.lang.Throwable -> L38
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L3a
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L38
            goto L42
        L38:
            r4 = move-exception
            goto L3c
        L3a:
            r4 = r2
            goto L42
        L3c:
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L42:
            boolean r5 = r4 instanceof p000.eo1
            if (r5 == 0) goto L47
            r4 = r2
        L47:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L53
            boolean r5 = p000.q02.m4671(r4)
            if (r5 == 0) goto L52
            goto L53
        L52:
            return r4
        L53:
            java.lang.String r3 = r3.toString()
            java.util.Iterator r4 = r9.iterator()
        L5b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L6f
            java.lang.Object r5 = r4.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = p000.q02.m4654(r3, r6, r0)
            if (r6 == 0) goto L5b
            r2 = r5
        L6f:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L74
            return r2
        L74:
            int r1 = r1 + 1
            goto L3
        L77:
            return r2
    }

    private final java.lang.Object scanHolderForApi(java.lang.Class<?> r3, java.lang.Class<?> r4, java.lang.Object r5) {
            r2 = this;
            java.util.List r2 = r2.allFields(r4)
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r4 = r2.hasNext()
            r0 = 0
            if (r4 == 0) goto L36
            java.lang.Object r4 = r2.next()
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r1 = 1
            r4.setAccessible(r1)     // Catch: java.lang.Throwable -> L8
            int r1 = r4.getModifiers()     // Catch: java.lang.Throwable -> L8
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)     // Catch: java.lang.Throwable -> L8
            if (r1 == 0) goto L24
            goto L28
        L24:
            if (r5 != 0) goto L27
            goto L8
        L27:
            r0 = r5
        L28:
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L8
            if (r4 != 0) goto L2f
            goto L8
        L2f:
            boolean r0 = r3.isInstance(r4)     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto L8
            return r4
        L36:
            return r0
    }

    private final java.lang.Object scanStaticApi(java.lang.Class<?> r7) {
            r6 = this;
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0 = 0
            java.lang.reflect.Field[] r1 = r7.getDeclaredFields()     // Catch: java.lang.Throwable -> L35
            r1.getClass()     // Catch: java.lang.Throwable -> L35
            int r2 = r1.length     // Catch: java.lang.Throwable -> L35
            r3 = 0
        Lf:
            if (r3 >= r2) goto L35
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L35
            int r5 = r4.getModifiers()     // Catch: java.lang.Throwable -> L35
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto L32
            r5 = 1
            r4.setAccessible(r5)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L35
            if (r4 != 0) goto L28
            goto L32
        L28:
            boolean r5 = r7.isInstance(r4)     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto L2f
            return r4
        L2f:
            r6.add(r4)     // Catch: java.lang.Throwable -> L35
        L32:
            int r3 = r3 + 1
            goto Lf
        L35:
            java.util.Iterator r6 = r6.iterator()
        L39:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L50
            java.lang.Object r1 = r6.next()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r2 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE
            java.lang.Class r3 = r1.getClass()
            java.lang.Object r1 = r2.scanHolderForApi(r7, r3, r1)
            if (r1 == 0) goto L39
            return r1
        L50:
            return r0
    }

    private static final java.lang.CharSequence stableKey$lambda$1$lambda$0(java.lang.Class r0) {
            java.lang.String r0 = r0.getName()
            return r0
    }

    /* JADX INFO: renamed from: α */
    public static /* synthetic */ java.lang.CharSequence m1419(java.lang.Class r0) {
            java.lang.CharSequence r0 = stableKey$lambda$1$lambda$0(r0)
            return r0
    }

    public final java.lang.Object awaitNetworkResult(java.lang.Object r4) {
            r3 = this;
            r4.getClass()
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "Observable"
            r2 = 0
            boolean r1 = p000.q02.m4654(r0, r1, r2)
            if (r1 == 0) goto L19
            java.lang.Object r3 = r3.blockingFirst(r4)
            return r3
        L19:
            java.lang.String r1 = "Flowable"
            boolean r1 = p000.q02.m4654(r0, r1, r2)
            if (r1 == 0) goto L26
            java.lang.Object r3 = r3.blockingFirst(r4)
            return r3
        L26:
            java.lang.String r1 = "Single"
            boolean r1 = p000.q02.m4654(r0, r1, r2)
            if (r1 == 0) goto L33
            java.lang.Object r3 = r3.blockingGet(r4)
            return r3
        L33:
            java.lang.String r1 = "Maybe"
            boolean r1 = p000.q02.m4654(r0, r1, r2)
            if (r1 == 0) goto L40
            java.lang.Object r3 = r3.blockingGet(r4)
            return r3
        L40:
            boolean r1 = r3.isBoltsTask(r4)
            if (r1 == 0) goto L4b
            java.lang.Object r3 = r3.awaitBoltsTask(r4)
            return r3
        L4b:
            java.lang.String r1 = "retrofit2.Call"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L61
            java.lang.Class r0 = r4.getClass()
            java.lang.String r1 = "execute"
            boolean r0 = r3.hasMethod(r0, r1)
            if (r0 == 0) goto L60
            goto L61
        L60:
            return r4
        L61:
            java.lang.Object r3 = r3.executeRetrofitCall(r4)
            return r3
    }

    public final java.lang.Object coerceValue(java.lang.Object r6, java.lang.Class<?> r7, java.lang.String r8) {
            r5 = this;
            r7.getClass()
            r0 = 0
            if (r6 != 0) goto L11
            boolean r6 = r7.isPrimitive()
            if (r6 == 0) goto Lc3
            java.lang.Object r5 = r5.primitiveDefaultForParam(r8, r7)
            return r5
        L11:
            boolean r1 = r7.isPrimitive()
            if (r1 != 0) goto L1f
            boolean r1 = r7.isInstance(r6)
            if (r1 == 0) goto L1f
            goto Lbc
        L1f:
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L2c
            java.lang.String r5 = r6.toString()
            return r5
        L2c:
            java.lang.Class r1 = java.lang.Integer.TYPE
            boolean r1 = r7.equals(r1)
            r2 = 1
            r3 = 10
            r4 = 0
            if (r1 != 0) goto L1ea
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L42
            goto L1ea
        L42:
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L1b7
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L54
            goto L1b7
        L54:
            java.lang.Class r1 = java.lang.Boolean.TYPE
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L182
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L66
            goto L182
        L66:
            java.lang.Class r1 = java.lang.Float.TYPE
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L155
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L78
            goto L155
        L78:
            java.lang.Class r1 = java.lang.Double.TYPE
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L131
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L8a
            goto L131
        L8a:
            java.lang.Class r1 = java.lang.Short.TYPE
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto Lfd
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L9b
            goto Lfd
        L9b:
            java.lang.Class r1 = java.lang.Byte.TYPE
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto Lc9
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto Lac
            goto Lc9
        Lac:
            boolean r1 = r7.isPrimitive()
            if (r1 != 0) goto Lbd
            java.lang.Class r1 = r6.getClass()
            boolean r1 = r7.isAssignableFrom(r1)
            if (r1 == 0) goto Lbd
        Lbc:
            return r6
        Lbd:
            boolean r6 = r7.isPrimitive()
            if (r6 != 0) goto Lc4
        Lc3:
            return r0
        Lc4:
            java.lang.Object r5 = r5.primitiveDefaultForParam(r8, r7)
            return r5
        Lc9:
            boolean r5 = r6 instanceof java.lang.Number
            if (r5 == 0) goto Ld4
            java.lang.Number r6 = (java.lang.Number) r6
            byte r4 = r6.byteValue()
            goto Lf8
        Ld4:
            boolean r5 = r6 instanceof java.lang.String
            if (r5 == 0) goto Lf8
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Integer r5 = p000.x02.m6487(r6, r3)
            if (r5 == 0) goto Lf2
            int r5 = r5.intValue()
            r6 = -128(0xffffffffffffff80, float:NaN)
            if (r5 < r6) goto Lf2
            r6 = 127(0x7f, float:1.78E-43)
            if (r5 <= r6) goto Led
            goto Lf2
        Led:
            byte r5 = (byte) r5
            java.lang.Byte r0 = java.lang.Byte.valueOf(r5)
        Lf2:
            if (r0 == 0) goto Lf8
            byte r4 = r0.byteValue()
        Lf8:
            java.lang.Byte r5 = java.lang.Byte.valueOf(r4)
            return r5
        Lfd:
            boolean r5 = r6 instanceof java.lang.Number
            if (r5 == 0) goto L108
            java.lang.Number r6 = (java.lang.Number) r6
            short r4 = r6.shortValue()
            goto L12c
        L108:
            boolean r5 = r6 instanceof java.lang.String
            if (r5 == 0) goto L12c
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Integer r5 = p000.x02.m6487(r6, r3)
            if (r5 == 0) goto L126
            int r5 = r5.intValue()
            r6 = -32768(0xffffffffffff8000, float:NaN)
            if (r5 < r6) goto L126
            r6 = 32767(0x7fff, float:4.5916E-41)
            if (r5 <= r6) goto L121
            goto L126
        L121:
            short r5 = (short) r5
            java.lang.Short r0 = java.lang.Short.valueOf(r5)
        L126:
            if (r0 == 0) goto L12c
            short r4 = r0.shortValue()
        L12c:
            java.lang.Short r5 = java.lang.Short.valueOf(r4)
            return r5
        L131:
            boolean r5 = r6 instanceof java.lang.Number
            if (r5 == 0) goto L13c
            java.lang.Number r6 = (java.lang.Number) r6
            double r5 = r6.doubleValue()
            goto L150
        L13c:
            boolean r5 = r6 instanceof java.lang.String
            r7 = 0
            if (r5 == 0) goto L14f
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Double r5 = p000.w02.m6298(r6)
            if (r5 == 0) goto L14f
            double r5 = r5.doubleValue()
            goto L150
        L14f:
            r5 = r7
        L150:
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            return r5
        L155:
            boolean r5 = r6 instanceof java.lang.Number
            if (r5 == 0) goto L160
            java.lang.Number r6 = (java.lang.Number) r6
            float r5 = r6.floatValue()
            goto L17d
        L160:
            boolean r5 = r6 instanceof java.lang.String
            r7 = 0
            if (r5 == 0) goto L17c
            java.lang.String r6 = (java.lang.String) r6
            boolean r5 = p000.w02.m6297(r6)     // Catch: java.lang.NumberFormatException -> L175
            if (r5 == 0) goto L175
            float r5 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.NumberFormatException -> L175
            java.lang.Float r0 = java.lang.Float.valueOf(r5)     // Catch: java.lang.NumberFormatException -> L175
        L175:
            if (r0 == 0) goto L17c
            float r5 = r0.floatValue()
            goto L17d
        L17c:
            r5 = r7
        L17d:
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            return r5
        L182:
            boolean r5 = r6 instanceof java.lang.Boolean
            if (r5 == 0) goto L18d
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r2 = r6.booleanValue()
            goto L1b2
        L18d:
            boolean r5 = r6 instanceof java.lang.Number
            if (r5 == 0) goto L19c
            java.lang.Number r6 = (java.lang.Number) r6
            int r5 = r6.intValue()
            if (r5 == 0) goto L19a
            goto L1b2
        L19a:
            r2 = r4
            goto L1b2
        L19c:
            boolean r5 = r6 instanceof java.lang.String
            if (r5 == 0) goto L19a
            java.lang.String r5 = "1"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L1b2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r5 = "true"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L19a
        L1b2:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        L1b7:
            boolean r5 = r6 instanceof java.lang.Number
            if (r5 == 0) goto L1c2
            java.lang.Number r6 = (java.lang.Number) r6
            long r5 = r6.longValue()
            goto L1e5
        L1c2:
            boolean r5 = r6 instanceof java.lang.String
            r7 = 0
            if (r5 == 0) goto L1d7
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Long r5 = p000.x02.m6489(r6, r3)
            if (r5 == 0) goto L1d5
            long r5 = r5.longValue()
            goto L1e5
        L1d5:
            r5 = r7
            goto L1e5
        L1d7:
            boolean r5 = r6 instanceof java.lang.Boolean
            if (r5 == 0) goto L1d5
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 == 0) goto L1d5
            r5 = 1
        L1e5:
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            return r5
        L1ea:
            boolean r5 = r6 instanceof java.lang.Number
            if (r5 == 0) goto L1f5
            java.lang.Number r6 = (java.lang.Number) r6
            int r2 = r6.intValue()
            goto L214
        L1f5:
            boolean r5 = r6 instanceof java.lang.String
            if (r5 == 0) goto L208
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Integer r5 = p000.x02.m6487(r6, r3)
            if (r5 == 0) goto L206
            int r2 = r5.intValue()
            goto L214
        L206:
            r2 = r4
            goto L214
        L208:
            boolean r5 = r6 instanceof java.lang.Boolean
            if (r5 == 0) goto L206
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 == 0) goto L206
        L214:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            return r5
    }

    public final java.lang.Object invokeUnwrap(java.lang.reflect.Method r1, java.lang.Object r2, java.lang.Object... r3) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            int r0 = r3.length     // Catch: java.lang.reflect.InvocationTargetException -> L10
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L10
            java.lang.Object r0 = r1.invoke(r2, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L10
            return r0
        L10:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getTargetException()
            if (r1 != 0) goto L18
            goto L19
        L18:
            r0 = r1
        L19:
            throw r0
    }

    public final boolean isIntCompat(java.lang.Class<?> r1) {
            r0 = this;
            r1.getClass()
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L16
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L14
            goto L16
        L14:
            r0 = 0
            return r0
        L16:
            r0 = 1
            return r0
    }

    public final boolean isInvalidParamServerError(java.lang.Throwable r5) {
            r4 = this;
            r5.getClass()
            r4 = 0
            r0 = r4
        L5:
            if (r5 == 0) goto L52
            r1 = 8
            if (r0 >= r1) goto L52
            java.lang.Class r1 = r5.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = r5.getMessage()
            if (r2 != 0) goto L1b
            java.lang.String r2 = ""
        L1b:
            java.lang.String r3 = ":"
            java.lang.String r1 = p000.lz1.m3688(r1, r3, r2)
            java.lang.String r2 = "ApiServerException"
            boolean r2 = p000.q02.m4654(r1, r2, r4)
            if (r2 == 0) goto L4b
            java.lang.String r2 = "error_code = 5"
            boolean r2 = p000.q02.m4654(r1, r2, r4)
            if (r2 != 0) goto L49
            java.lang.String r2 = "error_code=5"
            boolean r2 = p000.q02.m4654(r1, r2, r4)
            if (r2 != 0) goto L49
            java.lang.String r2 = "status_code = 5"
            boolean r2 = p000.q02.m4654(r1, r2, r4)
            if (r2 != 0) goto L49
            java.lang.String r2 = "status_code=5"
            boolean r1 = p000.q02.m4654(r1, r2, r4)
            if (r1 == 0) goto L4b
        L49:
            r4 = 1
            return r4
        L4b:
            java.lang.Throwable r5 = r5.getCause()
            int r0 = r0 + 1
            goto L5
        L52:
            return r4
    }

    public final boolean isLongCompat(java.lang.Class<?> r1) {
            r0 = this;
            r1.getClass()
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L16
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L14
            goto L16
        L14:
            r0 = 0
            return r0
        L16:
            r0 = 1
            return r0
    }

    public final boolean isNetworkReturn(java.lang.Class<?> r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r1 = r2.getName()
            java.lang.String r2 = "Observable"
            r0 = 0
            boolean r2 = p000.q02.m4654(r1, r2, r0)
            if (r2 != 0) goto L3a
            java.lang.String r2 = "Single"
            boolean r2 = p000.q02.m4654(r1, r2, r0)
            if (r2 != 0) goto L3a
            java.lang.String r2 = "Maybe"
            boolean r2 = p000.q02.m4654(r1, r2, r0)
            if (r2 != 0) goto L3a
            java.lang.String r2 = "Flowable"
            boolean r2 = p000.q02.m4654(r1, r2, r0)
            if (r2 != 0) goto L3a
            java.lang.String r2 = "bolts.Task"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L3a
            java.lang.String r2 = "retrofit2.Call"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L39
            goto L3a
        L39:
            return r0
        L3a:
            r1 = 1
            return r1
    }

    public final java.lang.Object resolveApiInstance(java.lang.Class<?> r2) {
            r1 = this;
            r2.getClass()
            java.lang.Object r0 = r1.createApiByRetrofitService(r2)
            if (r0 == 0) goto La
            return r0
        La:
            java.lang.Object r0 = r1.scanStaticApi(r2)
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.Object r1 = r1.createApiByRetrofitFactory(r2)
            if (r1 == 0) goto L18
            return r1
        L18:
            r1 = 0
            return r1
    }

    public final java.util.List<java.lang.String> resolveParamNames(java.lang.reflect.Method r5, java.util.List<java.lang.String> r6) {
            r4 = this;
            r5.getClass()
            r6.getClass()
            java.lang.annotation.Annotation[][] r4 = r5.getParameterAnnotations()
            java.lang.Class[] r5 = r5.getParameterTypes()
            r5.getClass()
            xm0 r5 = p000.AbstractC0312g7.m2251(r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L24:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L52
            r1 = r5
            wm0 r1 = (p000.wm0) r1
            int r1 = r1.nextInt()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r2 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE
            r4.getClass()
            java.lang.Object r3 = p000.AbstractC0312g7.m2253(r1, r4)
            java.lang.annotation.Annotation[] r3 = (java.lang.annotation.Annotation[]) r3
            if (r3 != 0) goto L41
            r3 = 0
            java.lang.annotation.Annotation[] r3 = new java.lang.annotation.Annotation[r3]
        L41:
            java.lang.String r2 = r2.queryNameOf(r3, r6)
            if (r2 != 0) goto L4e
            java.lang.Object r1 = p000.AbstractC0984xh.m6641(r1, r6)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
        L4e:
            r0.add(r2)
            goto L24
        L52:
            return r0
    }

    public final java.util.List<java.lang.String> resolveParamNames(java.lang.reflect.Method r1, java.lang.String[] r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            java.util.List r2 = p000.AbstractC0312g7.m2262(r2)
            java.util.List r0 = r0.resolveParamNames(r1, r2)
            return r0
    }

    public final java.lang.String stableKey(java.lang.reflect.Method r6) {
            r5 = this;
            r6.getClass()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.Class r0 = r6.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            r5.append(r0)
            r0 = 35
            r5.append(r0)
            java.lang.String r0 = r6.getName()
            r5.append(r0)
            r0 = 40
            r5.append(r0)
            java.lang.Class[] r0 = r6.getParameterTypes()
            r0.getClass()
            uj r1 = new uj
            r2 = 9
            r1.<init>(r2)
            r2 = 30
            java.lang.String r3 = ","
            r4 = 0
            java.lang.String r0 = p000.AbstractC0312g7.m2256(r0, r3, r4, r1, r2)
            java.lang.String r1 = "):"
            java.lang.String r5 = p000.lz1.m3692(r5, r0, r1, r6)
            return r5
    }
}
