package a;

/* JADX INFO: renamed from: a.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0134f4 {
    public static int a(java.util.ArrayList r5, boolean r6, a.A3 r7) {
            java.util.Iterator r0 = r5.iterator()
            r1 = 0
        L5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L7c
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r7 == 0) goto L59
            java.lang.Object r3 = r7.a()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L59
            int r5 = r5.size()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "setHiddenBatch: state changed, abort batch (done="
            r7.<init>(r0)
            r7.append(r1)
            java.lang.String r0 = "/"
            r7.append(r0)
            r7.append(r5)
            java.lang.String r5 = ", hide="
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = ")"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.String r6 = "msg"
            a.C0193i9.e(r5, r6)
            java.lang.String r6 = "[ConvHideRepo] "
            java.lang.String r5 = r6.concat(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            a.C0453x1.b(r5)
            return r1
        L59:
            boolean r3 = b(r2, r6)
            if (r3 == 0) goto L61
            int r1 = r1 + 1
        L61:
            a.Gb r3 = a.Gb.f99a
            r3.getClass()
            java.lang.String r3 = "wxid"
            a.C0193i9.e(r2, r3)
            a.Me r3 = a.Gb.l
            java.lang.Object r3 = r3.a()
            android.os.Handler r3 = (android.os.Handler) r3
            a.Fb r4 = new a.Fb
            r4.<init>(r2, r6)
            r3.post(r4)
            goto L5
        L7c:
            return r1
    }

    public static boolean b(java.lang.String r14, boolean r15) {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1 = 0
            r2 = 0
            r4 = r1
            r3 = r2
        L6:
            java.lang.String r5 = "] "
            java.lang.String r6 = "["
            java.lang.String r7 = "ConvHideRepo"
            r8 = 2
            java.lang.String r9 = "msg"
            if (r3 >= r8) goto L103
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.G4> r4 = a.xh.f764a     // Catch: java.lang.Throwable -> L41
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> L41
            java.lang.String r8 = "<get-entries>(...)"
            a.C0193i9.d(r4, r8)     // Catch: java.lang.Throwable -> L41
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L41
        L20:
            boolean r8 = r4.hasNext()     // Catch: java.lang.Throwable -> L41
            if (r8 == 0) goto L44
            java.lang.Object r8 = r4.next()     // Catch: java.lang.Throwable -> L41
            r10 = r8
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch: java.lang.Throwable -> L41
            java.lang.Object r10 = r10.getKey()     // Catch: java.lang.Throwable -> L41
            java.lang.String r11 = "<get-key>(...)"
            a.C0193i9.d(r10, r11)     // Catch: java.lang.Throwable -> L41
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch: java.lang.Throwable -> L41
            java.lang.String r11 = "EnMicroMsg"
            boolean r10 = a.Be.I(r10, r11, r2)     // Catch: java.lang.Throwable -> L41
            if (r10 == 0) goto L20
            goto L45
        L41:
            r4 = move-exception
            goto Lff
        L44:
            r8 = r1
        L45:
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch: java.lang.Throwable -> L41
            if (r8 == 0) goto Lf7
            java.lang.Object r4 = r8.getValue()     // Catch: java.lang.Throwable -> L41
            a.G4 r4 = (a.G4) r4     // Catch: java.lang.Throwable -> L41
            if (r4 == 0) goto Lf7
            java.lang.Object r4 = r4.f96a     // Catch: java.lang.Throwable -> L41
            if (r4 == 0) goto Lf7
            if (r15 == 0) goto L5a
            java.lang.String r8 = "hidden_conv_parent"
            goto L5c
        L5a:
            java.lang.String r8 = ""
        L5c:
            java.lang.Class r10 = r4.getClass()     // Catch: java.lang.Throwable -> L41 java.lang.NoSuchMethodException -> L75
            java.lang.String r11 = "update"
            java.lang.Class<android.content.ContentValues> r12 = android.content.ContentValues.class
            java.lang.Object r13 = java.lang.reflect.Array.newInstance(r0, r2)     // Catch: java.lang.Throwable -> L41 java.lang.NoSuchMethodException -> L75
            java.lang.Class r13 = r13.getClass()     // Catch: java.lang.Throwable -> L41 java.lang.NoSuchMethodException -> L75
            java.lang.Class[] r12 = new java.lang.Class[]{r0, r12, r0, r13}     // Catch: java.lang.Throwable -> L41 java.lang.NoSuchMethodException -> L75
            java.lang.reflect.Method r10 = r10.getMethod(r11, r12)     // Catch: java.lang.Throwable -> L41 java.lang.NoSuchMethodException -> L75
            goto L76
        L75:
            r10 = r1
        L76:
            if (r10 == 0) goto Ld8
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L41
            r11.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r12 = "parentRef"
            r11.put(r12, r8)     // Catch: java.lang.Throwable -> L41
            java.lang.String r8 = "rconversation"
            java.lang.String r12 = "username=?"
            java.lang.String[] r13 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L41
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r11, r12, r13}     // Catch: java.lang.Throwable -> L41
            java.lang.Object r4 = r10.invoke(r4, r8)     // Catch: java.lang.Throwable -> L41
            boolean r8 = r4 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L41
            if (r8 == 0) goto L99
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L41
            goto L9a
        L99:
            r4 = r1
        L9a:
            if (r4 == 0) goto La1
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L41
            goto La2
        La1:
            r4 = -1
        La2:
            if (r4 <= 0) goto La5
            goto Lf5
        La5:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r4.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r8 = "setHideViaDb: rconversation row not found for "
            r4.append(r8)     // Catch: java.lang.Throwable -> L41
            r4.append(r14)     // Catch: java.lang.Throwable -> L41
            java.lang.String r8 = " (0 rows updated)"
            r4.append(r8)     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L41
            a.C0193i9.e(r4, r9)     // Catch: java.lang.Throwable -> L41
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L41
            r8.append(r7)     // Catch: java.lang.Throwable -> L41
            r8.append(r5)     // Catch: java.lang.Throwable -> L41
            r8.append(r4)     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = r8.toString()     // Catch: java.lang.Throwable -> L41
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L41
            a.C0453x1.e(r4)     // Catch: java.lang.Throwable -> L41
            goto L137
        Ld8:
            java.lang.Class r5 = r4.getClass()     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = "execSQL"
            java.lang.Class<java.lang.Object[]> r7 = java.lang.Object[].class
            java.lang.Class[] r7 = new java.lang.Class[]{r0, r7}     // Catch: java.lang.Throwable -> L41
            java.lang.reflect.Method r5 = r5.getMethod(r6, r7)     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = "UPDATE rconversation SET parentRef = ? WHERE username = ?"
            java.lang.String[] r7 = new java.lang.String[]{r8, r14}     // Catch: java.lang.Throwable -> L41
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7}     // Catch: java.lang.Throwable -> L41
            r5.invoke(r4, r6)     // Catch: java.lang.Throwable -> L41
        Lf5:
            r14 = 1
            return r14
        Lf7:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = "EnMicroMsg db not found"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L41
            throw r4     // Catch: java.lang.Throwable -> L41
        Lff:
            int r3 = r3 + 1
            goto L6
        L103:
            if (r4 == 0) goto L109
            java.lang.String r1 = r4.getMessage()
        L109:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "🚨 LEAK-RISK: setHideViaDb FAILED after 2 retries: wxid="
            r0.<init>(r3)
            r0.append(r14)
            java.lang.String r14 = " hide="
            r0.append(r14)
            r0.append(r15)
            java.lang.String r14 = " err="
            r0.append(r14)
            r0.append(r1)
            java.lang.String r14 = r0.toString()
            a.C0193i9.e(r14, r9)
            java.lang.String r15 = "[ConvHideRepo] "
            java.lang.String r14 = r15.concat(r14)
            java.lang.Object[] r14 = new java.lang.Object[]{r14}
            a.C0453x1.a(r14)
        L137:
            return r2
    }
}
