package k8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f7394a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f7395b = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            k8.b.f7394a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            k8.b.f7395b = r0
            return
    }

    public static java.util.List a(java.lang.Object r12) {
            boolean r0 = r12 instanceof java.util.List
            r1 = 0
            if (r0 == 0) goto L8
            java.util.List r12 = (java.util.List) r12
            goto L9
        L8:
            r12 = r1
        L9:
            if (r12 == 0) goto L12c
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L13
            goto L12c
        L13:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r12.iterator()
        L1c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r2.next()
            if (r3 == 0) goto L1c
            r0.add(r3)
            goto L1c
        L2c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L35:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L121
            java.lang.Object r3 = r0.next()
            java.lang.String r4 = "com.tencent.mm.storage."
            r5 = 0
            boolean r4 = eh.a.z(r4, r3, r5)
            java.lang.String r6 = "getMsgID"
            java.lang.String r7 = "getMsgId"
            if (r4 == 0) goto L4d
            goto La5
        L4d:
            java.lang.Class r4 = r3.getClass()
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredMethods(r4)
            if (r4 == 0) goto L5f
            boolean r8 = r4.isEmpty()
            if (r8 == 0) goto L5f
            goto L11a
        L5f:
            java.util.Iterator r4 = r4.iterator()
        L63:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L11a
            java.lang.Object r8 = r4.next()
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.Class[] r9 = r8.getParameterTypes()
            r9.getClass()
            int r9 = r9.length
            if (r9 != 0) goto L63
            java.lang.String r9 = r8.getName()
            boolean r9 = gg.l.a(r9, r7)
            if (r9 != 0) goto L8d
            java.lang.String r9 = r8.getName()
            boolean r9 = gg.l.a(r9, r6)
            if (r9 == 0) goto L63
        L8d:
            java.lang.Class r9 = r8.getReturnType()
            java.lang.Class r10 = java.lang.Long.TYPE
            boolean r9 = gg.l.a(r9, r10)
            if (r9 != 0) goto La5
            java.lang.Class r8 = r8.getReturnType()
            java.lang.Class<java.lang.Long> r9 = java.lang.Long.class
            boolean r8 = gg.l.a(r8, r9)
            if (r8 == 0) goto L63
        La5:
            java.lang.String r4 = "getId"
            java.lang.String[] r8 = new java.lang.String[]{r7, r6, r4}
            r4 = r5
        Lac:
            r6 = 0
            r9 = 3
            if (r4 < r9) goto Leb
            java.lang.String r4 = "msgID"
            java.lang.String r8 = "id"
            java.lang.String r9 = "field_msgId"
            java.lang.String r10 = "msgId"
            java.lang.String[] r9 = new java.lang.String[]{r9, r10, r4, r8}
            r4 = r5
        Lbe:
            r8 = 4
            if (r4 < r8) goto Lc3
            r8 = r6
            goto L111
        Lc3:
            r8 = r9[r4]
            java.lang.Object r8 = h.Hchat.utils.KavaReflector.readField(r3, r8)
            boolean r10 = r8 instanceof java.lang.Number
            if (r10 == 0) goto Ld0
            java.lang.Number r8 = (java.lang.Number) r8
            goto Ld1
        Ld0:
            r8 = r1
        Ld1:
            if (r8 == 0) goto Le8
            long r10 = r8.longValue()
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 <= 0) goto Le0
            goto Le1
        Le0:
            r8 = r1
        Le1:
            if (r8 == 0) goto Le8
            long r8 = r8.longValue()
            goto L111
        Le8:
            int r4 = r4 + 1
            goto Lbe
        Leb:
            r9 = r8[r4]
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.Object r9 = h.Hchat.utils.KavaReflector.invokeMethod(r3, r9, r10)
            boolean r10 = r9 instanceof java.lang.Number
            if (r10 == 0) goto Lfa
            java.lang.Number r9 = (java.lang.Number) r9
            goto Lfb
        Lfa:
            r9 = r1
        Lfb:
            if (r9 == 0) goto L117
            long r9 = r9.longValue()
            java.lang.Long r11 = java.lang.Long.valueOf(r9)
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 <= 0) goto L10a
            goto L10b
        L10a:
            r11 = r1
        L10b:
            if (r11 == 0) goto L117
            long r8 = r11.longValue()
        L111:
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 <= 0) goto L11a
            r5 = 1
            goto L11a
        L117:
            int r4 = r4 + 1
            goto Lac
        L11a:
            if (r5 == 0) goto L35
            r2.add(r3)
            goto L35
        L121:
            int r0 = r2.size()
            int r12 = r12.size()
            if (r0 != r12) goto L12c
            return r2
        L12c:
            tf.t r12 = tf.t.f13167g
            return r12
    }

    public static final java.util.List b(java.lang.Object r14) {
            tf.t r0 = tf.t.f13167g
            if (r14 != 0) goto L6
            goto L1bd
        L6:
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.add(r14)
            k8.a r3 = new k8.a
            r4 = 0
            r3.<init>(r14, r4)
            r2.add(r3)
        L20:
            boolean r14 = r2.isEmpty()
            if (r14 != 0) goto L1bd
            java.lang.Object r14 = r2.removeFirst()
            k8.a r14 = (k8.a) r14
            java.lang.Object r3 = r14.f7392a
            int r14 = r14.f7393b
            java.lang.Class r5 = r3.getClass()
            java.util.concurrent.ConcurrentHashMap r6 = k8.b.f7394a
            java.lang.Object r5 = r6.get(r5)
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            java.lang.Class<java.util.List> r7 = java.util.List.class
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            r9 = 0
            if (r5 == 0) goto L56
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.readField(r5, r3)
            java.util.List r5 = a(r5)
            boolean r10 = r5.isEmpty()
            if (r10 != 0) goto L52
            goto L53
        L52:
            r5 = r9
        L53:
            if (r5 == 0) goto L56
            goto La8
        L56:
            java.lang.Class r5 = r3.getClass()
        L5a:
            if (r5 == 0) goto La7
            boolean r10 = r5.equals(r8)
            if (r10 != 0) goto La7
            java.util.List r10 = h.Hchat.utils.KavaReflector.declaredFields(r5)
            java.util.Iterator r10 = r10.iterator()
        L6a:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto La2
            java.lang.Object r11 = r10.next()
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            int r12 = r11.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isStatic(r12)
            if (r12 != 0) goto L6a
            java.lang.Class r12 = r11.getType()
            boolean r12 = r7.isAssignableFrom(r12)
            if (r12 != 0) goto L8b
            goto L6a
        L8b:
            java.lang.Object r12 = h.Hchat.utils.KavaReflector.readField(r11, r3)
            java.util.List r12 = a(r12)
            boolean r13 = r12.isEmpty()
            if (r13 != 0) goto L6a
            java.lang.Class r5 = r3.getClass()
            r6.put(r5, r11)
            r5 = r12
            goto La8
        La2:
            java.lang.Class r5 = r5.getSuperclass()
            goto L5a
        La7:
            r5 = r0
        La8:
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto Laf
            goto Lb0
        Laf:
            r5 = r9
        Lb0:
            if (r5 == 0) goto Lb3
            return r5
        Lb3:
            java.lang.Class r5 = r3.getClass()
            java.util.concurrent.ConcurrentHashMap r6 = k8.b.f7395b
            java.lang.Object r5 = r6.get(r5)
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r5 == 0) goto Ld6
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invoke(r5, r3, r10)
            java.util.List r5 = a(r5)
            boolean r10 = r5.isEmpty()
            if (r10 != 0) goto Ld2
            goto Ld3
        Ld2:
            r5 = r9
        Ld3:
            if (r5 == 0) goto Ld6
            goto L134
        Ld6:
            java.lang.Class r5 = r3.getClass()
        Lda:
            if (r5 == 0) goto L133
            boolean r10 = r5.equals(r8)
            if (r10 != 0) goto L133
            java.util.List r10 = h.Hchat.utils.KavaReflector.declaredMethods(r5)
            java.util.Iterator r10 = r10.iterator()
        Lea:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L12e
            java.lang.Object r11 = r10.next()
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            int r12 = r11.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isStatic(r12)
            if (r12 != 0) goto Lea
            java.lang.Class[] r12 = r11.getParameterTypes()
            r12.getClass()
            int r12 = r12.length
            if (r12 != 0) goto Lea
            java.lang.Class r12 = r11.getReturnType()
            boolean r12 = r7.isAssignableFrom(r12)
            if (r12 != 0) goto L115
            goto Lea
        L115:
            java.lang.Object[] r12 = new java.lang.Object[r4]
            java.lang.Object r12 = h.Hchat.utils.KavaReflector.invoke(r11, r3, r12)
            java.util.List r12 = a(r12)
            boolean r13 = r12.isEmpty()
            if (r13 != 0) goto Lea
            java.lang.Class r5 = r3.getClass()
            r6.put(r5, r11)
            r5 = r12
            goto L134
        L12e:
            java.lang.Class r5 = r5.getSuperclass()
            goto Lda
        L133:
            r5 = r0
        L134:
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L13b
            r9 = r5
        L13b:
            if (r9 == 0) goto L13e
            return r9
        L13e:
            r5 = 4
            if (r14 < r5) goto L143
            goto L20
        L143:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Class r6 = r3.getClass()
        L14c:
            if (r6 == 0) goto L19e
            boolean r7 = r6.equals(r8)
            if (r7 != 0) goto L19e
            java.util.List r7 = h.Hchat.utils.KavaReflector.declaredFields(r6)
            java.util.Iterator r7 = r7.iterator()
        L15c:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L199
            java.lang.Object r9 = r7.next()
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            int r10 = r9.getModifiers()
            boolean r10 = java.lang.reflect.Modifier.isStatic(r10)
            if (r10 != 0) goto L15c
            java.lang.Class r10 = r9.getType()
            boolean r10 = r10.isPrimitive()
            if (r10 != 0) goto L15c
            java.lang.Class r10 = r9.getType()
            boolean r10 = r10.isArray()
            if (r10 == 0) goto L187
            goto L15c
        L187:
            java.lang.Object r9 = h.Hchat.utils.KavaReflector.readField(r9, r3)
            if (r9 == 0) goto L15c
            java.lang.String r10 = "com.tencent.mm.ui.chatting.component."
            boolean r10 = eh.a.z(r10, r9, r4)
            if (r10 == 0) goto L15c
            r5.add(r9)
            goto L15c
        L199:
            java.lang.Class r6 = r6.getSuperclass()
            goto L14c
        L19e:
            java.util.Iterator r3 = r5.iterator()
        L1a2:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L20
            java.lang.Object r5 = r3.next()
            boolean r6 = r1.add(r5)
            if (r6 == 0) goto L1a2
            k8.a r6 = new k8.a
            int r7 = r14 + 1
            r6.<init>(r5, r7)
            r2.add(r6)
            goto L1a2
        L1bd:
            return r0
    }
}
