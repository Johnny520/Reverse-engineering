package j8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f6779a = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            j8.e.f6779a = r0
            return
    }

    public static long a(java.lang.Object r10) {
            java.lang.String r0 = "getMsgID"
            java.lang.String r1 = "getId"
            java.lang.String r2 = "getMsgId"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            r1 = 0
            r2 = r1
        Lc:
            r3 = 0
            r4 = 0
            r6 = 1
            r7 = 3
            if (r2 < r7) goto L49
            java.lang.String r0 = "msgID"
            java.lang.String r2 = "id"
            java.lang.String r7 = "field_msgId"
            java.lang.String r8 = "msgId"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8, r0, r2}
            r0 = r1
        L20:
            r2 = 4
            if (r0 < r2) goto L24
            return r4
        L24:
            r2 = r7[r0]
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r10, r2)
            java.lang.Long r2 = c(r2)
            if (r2 == 0) goto L46
            long r8 = r2.longValue()
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 <= 0) goto L3a
            r8 = r6
            goto L3b
        L3a:
            r8 = r1
        L3b:
            if (r8 == 0) goto L3e
            goto L3f
        L3e:
            r2 = r3
        L3f:
            if (r2 == 0) goto L46
            long r0 = r2.longValue()
            return r0
        L46:
            int r0 = r0 + 1
            goto L20
        L49:
            r7 = r0[r2]
            java.lang.Class r8 = r10.getClass()
            java.lang.Class[] r9 = new java.lang.Class[r1]
            java.lang.reflect.Method r7 = h.Hchat.utils.KavaReflector.findMethod(r8, r7, r9)
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invoke(r7, r10, r8)
            java.lang.Long r7 = c(r7)
            if (r7 == 0) goto L75
            long r8 = r7.longValue()
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 <= 0) goto L6a
            goto L6b
        L6a:
            r6 = r1
        L6b:
            if (r6 == 0) goto L6e
            r3 = r7
        L6e:
            if (r3 == 0) goto L75
            long r0 = r3.longValue()
            return r0
        L75:
            int r2 = r2 + 1
            goto Lc
    }

    public static java.lang.Integer b(java.lang.Long r4) {
            if (r4 == 0) goto L2a
            long r0 = r4.longValue()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto Ld
            goto L2a
        Ld:
            r2 = 1
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L1c
            r2 = 601(0x259, double:2.97E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L1c
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
        L1c:
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L24
            r0 = r2
        L24:
            int r4 = (int) r0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
        L2a:
            r4 = 0
            return r4
    }

    public static java.lang.Long c(java.lang.Object r2) {
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto Lf
            java.lang.Number r2 = (java.lang.Number) r2
            long r0 = r2.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        Lf:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L22
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            java.lang.Long r2 = og.t.g0(r2)
            return r2
        L22:
            r2 = 0
            return r2
    }

    public static int d(java.lang.Object r19, java.lang.String r20, long r21, java.util.List r23, int r24) {
            r0 = r19
            r1 = r20
            r2 = r21
            r1.getClass()
            r23.getClass()
            boolean r4 = og.m.t0(r1)
            java.lang.String r5 = "msg:"
            java.lang.String r6 = "file:"
            r7 = 0
            java.util.concurrent.ConcurrentHashMap r10 = j8.e.f6779a
            if (r4 != 0) goto L2f
            java.lang.String r4 = r6.concat(r1)
            java.lang.Object r4 = r10.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L2f
            int r4 = r4.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L51
        L2f:
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 <= 0) goto L50
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            java.lang.Object r4 = r10.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L50
            int r4 = r4.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L51
        L50:
            r4 = 0
        L51:
            if (r4 == 0) goto L58
            int r0 = r4.intValue()
            return r0
        L58:
            r4 = 0
            if (r0 == 0) goto L10b
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r11.add(r0)
            java.lang.Long r12 = java.lang.Long.valueOf(r2)
            int r13 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r13 <= 0) goto L6c
            goto L6d
        L6c:
            r12 = 0
        L6d:
            if (r12 == 0) goto L74
            long r12 = r12.longValue()
            goto L78
        L74:
            long r12 = a(r0)
        L78:
            java.lang.Class r14 = r0.getClass()
        L7c:
            if (r14 == 0) goto L108
            java.lang.Class<java.lang.Object> r15 = java.lang.Object.class
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto L108
            java.util.List r15 = h.Hchat.utils.KavaReflector.declaredFields(r14)
            java.util.Iterator r15 = r15.iterator()
        L8e:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L100
            java.lang.Object r16 = r15.next()
            r17 = r7
            r7 = r16
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            java.lang.Class r8 = r7.getType()
            boolean r16 = r8.isPrimitive()
            if (r16 != 0) goto Lbf
            boolean r16 = r8.isArray()
            if (r16 != 0) goto Lbf
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto Lb7
            goto Lbf
        Lb7:
            java.lang.Class<java.lang.Number> r9 = java.lang.Number.class
            boolean r8 = r9.isAssignableFrom(r8)
            if (r8 == 0) goto Lc2
        Lbf:
            r7 = r17
            goto L8e
        Lc2:
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.readField(r7, r0)
            if (r7 == 0) goto Lbf
            if (r7 == r0) goto Lbf
            boolean r8 = r11.isEmpty()
            if (r8 == 0) goto Ld1
            goto Le2
        Ld1:
            java.util.Iterator r8 = r11.iterator()
        Ld5:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Le2
            java.lang.Object r9 = r8.next()
            if (r9 != r7) goto Ld5
            goto Lbf
        Le2:
            java.lang.String r8 = "com.tencent.mm.storage."
            boolean r8 = eh.a.z(r8, r7, r4)
            if (r8 != 0) goto Lef
            int r8 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r8 > 0) goto Lef
            goto Lbf
        Lef:
            int r8 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r8 <= 0) goto Lfc
            long r8 = a(r7)
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 == 0) goto Lfc
            goto Lbf
        Lfc:
            r11.add(r7)
            goto Lbf
        L100:
            r17 = r7
            java.lang.Class r14 = r14.getSuperclass()
            goto L7c
        L108:
            r17 = r7
            goto L10f
        L10b:
            r17 = r7
            tf.t r11 = tf.t.f13167g
        L10f:
            java.util.Iterator r0 = r11.iterator()
        L113:
            boolean r7 = r0.hasNext()
            java.lang.String r8 = "VoiceLength"
            if (r7 == 0) goto L195
            java.lang.Object r7 = r0.next()
            java.lang.String r9 = "getVoiceLen"
            java.lang.String r12 = "getDuration"
            java.lang.String r13 = "getVoiceLength"
            java.lang.String[] r9 = new java.lang.String[]{r13, r9, r12}
            r12 = r4
        L12a:
            r13 = 3
            if (r12 < r13) goto L15b
            java.lang.String r9 = "duration"
            java.lang.String r12 = "field_duration"
            java.lang.String r13 = "field_voiceLength"
            java.lang.String r14 = "voiceLength"
            java.lang.String[] r13 = new java.lang.String[]{r13, r14, r8, r9, r12}
            r9 = r4
        L13a:
            r12 = 5
            if (r9 < r12) goto L13f
            r7 = 0
            goto L18f
        L13f:
            r12 = r13[r9]
            java.lang.Object r12 = h.Hchat.utils.KavaReflector.readField(r7, r12)
            java.lang.Long r12 = c(r12)
            java.lang.Integer r12 = b(r12)
            if (r12 == 0) goto L158
            int r7 = r12.intValue()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L18f
        L158:
            int r9 = r9 + 1
            goto L13a
        L15b:
            r13 = r9[r12]
            java.lang.Class r14 = r7.getClass()
            java.lang.Class[] r15 = new java.lang.Class[r4]
            java.lang.reflect.Method r13 = h.Hchat.utils.KavaReflector.findMethod(r14, r13, r15)
            if (r13 == 0) goto L192
            java.lang.Class[] r14 = r13.getParameterTypes()
            r14.getClass()
            int r14 = r14.length
            if (r14 != 0) goto L174
            goto L175
        L174:
            r13 = 0
        L175:
            if (r13 == 0) goto L192
            java.lang.Object[] r14 = new java.lang.Object[r4]
            java.lang.Object r13 = h.Hchat.utils.KavaReflector.invoke(r13, r7, r14)
            java.lang.Long r13 = c(r13)
            java.lang.Integer r13 = b(r13)
            if (r13 == 0) goto L192
            int r7 = r13.intValue()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
        L18f:
            if (r7 == 0) goto L113
            goto L196
        L192:
            int r12 = r12 + 1
            goto L12a
        L195:
            r7 = 0
        L196:
            if (r7 == 0) goto L19b
        L198:
            r9 = r7
            goto L256
        L19b:
            java.util.Iterator r0 = r23.iterator()
        L19f:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L1b2
            java.lang.Object r7 = r0.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Integer r7 = e(r7, r1)
            if (r7 == 0) goto L19f
            goto L1b3
        L1b2:
            r7 = 0
        L1b3:
            if (r7 == 0) goto L1b6
            goto L198
        L1b6:
            dg.n r0 = new dg.n
            r7 = 6
            r0.<init>(r11, r7)
            i2.z r7 = new i2.z
            r9 = 9
            r7.<init>(r9)
            dg.j r9 = new dg.j
            ng.q r11 = ng.q.f9453n
            r9.<init>(r0, r7, r11)
            ng.h r0 = new ng.h
            r0.<init>(r9)
        L1cf:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L1e2
            java.lang.Object r7 = r0.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Integer r7 = e(r7, r1)
            if (r7 == 0) goto L1cf
            goto L1e3
        L1e2:
            r7 = 0
        L1e3:
            if (r7 == 0) goto L1e6
            goto L198
        L1e6:
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r0 == 0) goto L254
            j8.y r0 = r0.f6816b
            if (r0 == 0) goto L254
            h.Hchat.dexkit.DexFinder r7 = r0.f6841a
            java.lang.reflect.Method r7 = r7.voiceInfoQueryMethod
            boolean r9 = android.text.TextUtils.isEmpty(r1)
            if (r9 != 0) goto L247
            if (r7 == 0) goto L247
            boolean r9 = h.Hchat.utils.KavaReflector.isStatic(r7)
            if (r9 != 0) goto L203
            goto L247
        L203:
            java.lang.Object[] r9 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L247
            r11 = 0
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invoke(r7, r11, r9)     // Catch: java.lang.Throwable -> L20e
            if (r7 != 0) goto L210
        L20e:
            r0 = r4
            goto L249
        L210:
            java.lang.Class r9 = r7.getClass()     // Catch: java.lang.Throwable -> L20e
            java.lang.reflect.Method r0 = r0.w(r9)     // Catch: java.lang.Throwable -> L20e
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L20e
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r7, r9)     // Catch: java.lang.Throwable -> L20e
            android.content.ContentValues r0 = (android.content.ContentValues) r0     // Catch: java.lang.Throwable -> L20e
            if (r0 != 0) goto L223
            goto L20e
        L223:
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L20e
            boolean r7 = r0 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L20e
            if (r7 == 0) goto L232
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L20e
            long r7 = r0.longValue()     // Catch: java.lang.Throwable -> L20e
            goto L23a
        L232:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L20e
            long r7 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> L20e
        L23a:
            int r0 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r0 <= 0) goto L20e
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r7 = java.lang.Math.min(r12, r7)     // Catch: java.lang.Throwable -> L20e
            int r0 = (int) r7
            goto L249
        L247:
            r11 = 0
            goto L20e
        L249:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            if (r0 <= 0) goto L250
            r4 = 1
        L250:
            if (r4 == 0) goto L255
            goto L198
        L254:
            r11 = 0
        L255:
            r9 = r11
        L256:
            if (r9 == 0) goto L28f
            int r0 = r9.intValue()
            if (r0 > 0) goto L25f
            goto L28a
        L25f:
            int r4 = r10.size()
            r7 = 2048(0x800, float:2.87E-42)
            if (r4 <= r7) goto L26a
            r10.clear()
        L26a:
            boolean r4 = og.m.t0(r1)
            if (r4 != 0) goto L27b
            java.lang.String r1 = r6.concat(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r10.put(r1, r4)
        L27b:
            int r1 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r1 <= 0) goto L28a
            java.lang.String r1 = bc.e.g(r2, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.put(r1, r0)
        L28a:
            int r0 = r9.intValue()
            goto L291
        L28f:
            r0 = r24
        L291:
            return r0
    }

    public static java.lang.Integer e(java.lang.String r6, java.lang.String r7) {
            r0 = 2
            char[] r0 = new char[r0]
            r0 = {x0092: FILL_ARRAY_DATA , data: [10, 13} // fill-array
            java.lang.String r6 = og.m.U0(r6, r0)
            boolean r0 = og.m.t0(r6)
            r1 = 0
            if (r0 != 0) goto L90
            r0 = 60
            r2 = 0
            r3 = 6
            int r0 = og.m.q0(r6, r0, r2, r3)
            if (r0 < 0) goto L1d
            goto L90
        L1d:
            r0 = 1
            char[] r4 = new char[r0]
            r5 = 58
            r4[r2] = r5
            java.util.List r6 = og.m.F0(r6, r4, r3)
            int r3 = r6.size()
            r4 = 3
            if (r3 >= r4) goto L30
            goto L90
        L30:
            java.lang.Object r3 = r6.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            java.lang.Object r6 = tf.m.w1(r0, r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L55
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r6 = r6.toString()
            if (r6 == 0) goto L55
            java.lang.Long r6 = og.t.g0(r6)
            goto L56
        L55:
            r6 = r1
        L56:
            java.lang.Integer r6 = b(r6)
            if (r6 == 0) goto L90
            boolean r4 = og.m.t0(r7)
            if (r4 != 0) goto L8f
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto L69
            goto L8f
        L69:
            boolean r4 = r3.equals(r7)
            if (r4 != 0) goto L8f
            boolean r4 = og.t.W(r7, r3, r2)
            if (r4 != 0) goto L8f
            boolean r7 = og.t.W(r3, r7, r2)
            if (r7 == 0) goto L7c
            goto L8f
        L7c:
            r7 = 47
            boolean r7 = og.m.i0(r3, r7)
            if (r7 != 0) goto L8d
            r7 = 92
            boolean r7 = og.m.i0(r3, r7)
            if (r7 != 0) goto L8d
            r2 = r0
        L8d:
            if (r2 == 0) goto L90
        L8f:
            return r6
        L90:
            return r1
    }
}
