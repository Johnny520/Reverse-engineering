package k8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements java.lang.reflect.InvocationHandler {
    @Override // java.lang.reflect.InvocationHandler
    public final java.lang.Object invoke(java.lang.Object r5, java.lang.reflect.Method r6, java.lang.Object[] r7) {
            r4 = this;
            java.lang.Class r0 = r6.getDeclaringClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2 = 0
            r3 = 0
            if (r0 != r1) goto L41
            java.lang.String r0 = r6.getName()
            java.lang.String r1 = "toString"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L19
            java.lang.String r5 = "HchatMessageClearCallback"
            return r5
        L19:
            java.lang.String r1 = "hashCode"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L2a
            int r5 = java.lang.System.identityHashCode(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L2a:
            java.lang.String r1 = "equals"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L41
            if (r7 == 0) goto L39
            int r6 = r7.length
            if (r6 <= 0) goto L39
            r2 = r7[r3]
        L39:
            if (r5 != r2) goto L3c
            r3 = 1
        L3c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L41:
            java.lang.Class r5 = r6.getReturnType()
            java.lang.Class r6 = java.lang.Boolean.TYPE
            if (r5 == r6) goto La5
            java.lang.Class<java.lang.Boolean> r7 = java.lang.Boolean.class
            if (r5 != r7) goto L4e
            goto La5
        L4e:
            if (r5 == 0) goto La4
            boolean r7 = r5.isPrimitive()
            if (r7 == 0) goto La4
            java.lang.Class r7 = java.lang.Void.TYPE
            if (r5 != r7) goto L5b
            goto La4
        L5b:
            if (r5 != r6) goto L60
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L60:
            java.lang.Class r6 = java.lang.Character.TYPE
            if (r5 != r6) goto L69
            java.lang.Character r5 = java.lang.Character.valueOf(r3)
            return r5
        L69:
            java.lang.Class r6 = java.lang.Byte.TYPE
            if (r5 != r6) goto L72
            java.lang.Byte r5 = java.lang.Byte.valueOf(r3)
            return r5
        L72:
            java.lang.Class r6 = java.lang.Short.TYPE
            if (r5 != r6) goto L7b
            java.lang.Short r5 = java.lang.Short.valueOf(r3)
            return r5
        L7b:
            java.lang.Class r6 = java.lang.Integer.TYPE
            if (r5 != r6) goto L84
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            return r5
        L84:
            java.lang.Class r6 = java.lang.Long.TYPE
            if (r5 != r6) goto L8f
            r5 = 0
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            return r5
        L8f:
            java.lang.Class r6 = java.lang.Float.TYPE
            if (r5 != r6) goto L99
            r5 = 0
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            return r5
        L99:
            java.lang.Class r6 = java.lang.Double.TYPE
            if (r5 != r6) goto La4
            r5 = 0
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            return r5
        La4:
            return r2
        La5:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
    }
}
