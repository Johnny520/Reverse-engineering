package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f5229f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f5230g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f5231h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f5232i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final java.util.Set f5233j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final og.k f5234k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final og.k f5235l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final og.k f5236m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final og.k f5237n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final og.k f5238o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final og.k f5239p = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f5240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.SharedPreferences f5241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f5242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.Set f5243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.ThreadLocal f5244e;

    static {
            java.lang.String r0 = "h"
            java.lang.String r1 = "m"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            ha.j0.f5229f = r0
            java.lang.String r0 = "i"
            java.lang.String r2 = "n"
            java.lang.String[] r0 = new java.lang.String[]{r0, r2}
            ha.j0.f5230g = r0
            java.lang.String r0 = "o"
            java.lang.String r3 = "p"
            java.lang.String r4 = "j"
            java.lang.String[] r0 = new java.lang.String[]{r4, r1, r0, r2, r3}
            ha.j0.f5231h = r0
            java.lang.String r0 = "q"
            java.lang.String r1 = "t"
            java.lang.String r2 = "r"
            java.lang.String r3 = "u"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            ha.j0.f5232i = r0
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r0 = 5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r0 = 9
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r0 = 10
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r0 = 12
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r0 = 13
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r0 = 14
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r0 = 15
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r0 = 18
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r0 = 19
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r0 = 26
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            r0 = 28
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            r0 = 30
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
            r0 = 34
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            r0 = 36
            java.lang.Integer r18 = java.lang.Integer.valueOf(r0)
            r0 = 41
            java.lang.Integer r19 = java.lang.Integer.valueOf(r0)
            r0 = 42
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)
            r0 = 47
            java.lang.Integer r21 = java.lang.Integer.valueOf(r0)
            r0 = 54
            java.lang.Integer r22 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22}
            java.util.Set r0 = tf.d0.W(r0)
            ha.j0.f5233j = r0
            og.k r0 = new og.k
            og.l r1 = og.l.f9834h
            java.util.Set r2 = ac.p.N(r1)
            java.lang.String r3 = "select\\s+\\*,\\s*rowid\\s+from\\s+SnsInfo"
            r0.<init>(r3, r2)
            ha.j0.f5234k = r0
            og.k r0 = new og.k
            java.lang.String r2 = "\\bWHERE\\b[\\s\\S]*?(?:SnsInfo\\.)?userName\\s*="
            java.util.Set r3 = ac.p.N(r1)
            r0.<init>(r2, r3)
            ha.j0.f5235l = r0
            og.k r0 = new og.k
            java.lang.String r2 = "\\(\\s*(?:SnsInfo\\.)?sourceType\\s*&\\s*2\\s*!=\\s*0\\s*\\)"
            java.util.Set r3 = ac.p.N(r1)
            r0.<init>(r2, r3)
            ha.j0.f5236m = r0
            og.k r0 = new og.k
            java.lang.String r2 = "\\(\\s*(?:SnsInfo\\.)?sourceType\\s*&\\s*128\\s*!=\\s*0\\s*\\)"
            java.util.Set r3 = ac.p.N(r1)
            r0.<init>(r2, r3)
            ha.j0.f5237n = r0
            og.k r0 = new og.k
            java.lang.String r2 = "\\(\\s*snsId\\s*>="
            java.util.Set r3 = ac.p.N(r1)
            r0.<init>(r2, r3)
            ha.j0.f5238o = r0
            og.k r0 = new og.k
            java.lang.String r2 = "\\(\\s*((?:SnsInfo\\.)?sourceType)\\s+in\\s*\\(([^)]*)\\)\\s*\\)"
            java.util.Set r1 = ac.p.N(r1)
            r0.<init>(r2, r1)
            ha.j0.f5239p = r0
            return
    }

    public j0(r8.g r2) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.f5240a = r2
            android.content.Context r2 = r2.f11620a
            java.lang.String r0 = "Hchat_sns_anti_recall_config"
            android.content.SharedPreferences r0 = ub.b.c(r2, r0)
            r1.f5241b = r0
            java.lang.String r0 = "Hchat_sns_anti_recall_method_cache"
            android.content.SharedPreferences r2 = ub.b.c(r2, r0)
            r1.f5242c = r2
            java.util.Set r2 = j8.b.o()
            r1.f5243d = r2
            ha.p r2 = new ha.p
            r0 = 1
            r2.<init>(r0)
            java.lang.ThreadLocal r2 = java.lang.ThreadLocal.withInitial(r2)
            r1.f5244e = r2
            return
    }

    public static final void a(ha.j0 r6, java.lang.Object[] r7) {
            if (r7 != 0) goto L3
            goto L7
        L3:
            int r6 = r7.length
            r0 = 0
        L5:
            if (r0 < r6) goto L8
        L7:
            return
        L8:
            r1 = r7[r0]
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L11
            java.lang.String r1 = (java.lang.String) r1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L5d
            og.k r2 = ha.j0.f5234k
            boolean r2 = r2.a(r1)
            if (r2 != 0) goto L1e
            r2 = r1
            goto L54
        L1e:
            og.k r2 = ha.j0.f5235l
            boolean r2 = r2.a(r1)
            java.lang.String r3 = "(1=1)"
            if (r2 == 0) goto L4d
            g0.o r2 = new g0.o
            r4 = 8
            r2.<init>(r4)
            og.k r4 = ha.j0.f5239p
            java.lang.String r2 = r4.e(r1, r2)
            og.k r4 = ha.j0.f5237n
            java.lang.String r2 = r4.f(r2, r3)
            java.lang.String r4 = "1=1 or snsId"
            r5 = 1
            boolean r4 = og.m.h0(r2, r4, r5)
            if (r4 != 0) goto L4e
            og.k r4 = ha.j0.f5238o
            java.lang.String r5 = "(1=1 or snsId >="
            java.lang.String r2 = r4.f(r2, r5)
            goto L4e
        L4d:
            r2 = r1
        L4e:
            og.k r4 = ha.j0.f5236m
            java.lang.String r2 = r4.f(r2, r3)
        L54:
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L5d
            r7[r0] = r2
            return
        L5d:
            int r0 = r0 + 1
            goto L5
    }

    public static final void b(ha.j0 r22, java.lang.Object r23, java.lang.Object[] r24, boolean r25) {
            r1 = r22
            r2 = r23
            r3 = r24
            java.lang.String r4 = "CommentUserList"
            android.content.SharedPreferences r5 = r1.f5241b
            java.lang.String r0 = "SnsInfo"
            java.lang.String r6 = ""
            r8 = 0
            if (r3 == 0) goto L57
            int r9 = r3.length
            if (r9 != 0) goto L15
            goto L57
        L15:
            r9 = r3[r8]
            boolean r10 = r9 instanceof java.lang.String
            if (r10 == 0) goto L1e
            java.lang.String r9 = (java.lang.String) r9
            goto L1f
        L1e:
            r9 = 0
        L1f:
            if (r9 == 0) goto L23
            r6 = r9
            goto L57
        L23:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r10 = r3.length
            r11 = r8
        L2a:
            if (r11 >= r10) goto L38
            r12 = r3[r11]
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L35
            r9.add(r12)
        L35:
            int r11 = r11 + 1
            goto L2a
        L38:
            java.util.Iterator r9 = r9.iterator()
        L3c:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L50
            java.lang.Object r10 = r9.next()
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = og.t.X(r11, r0)
            if (r11 == 0) goto L3c
            goto L51
        L50:
            r10 = 0
        L51:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L56
            goto L57
        L56:
            r6 = r10
        L57:
            boolean r0 = og.t.X(r6, r0)
            if (r0 != 0) goto L5f
            goto L391
        L5f:
            if (r3 != 0) goto L63
        L61:
            r9 = 0
            goto L77
        L63:
            int r0 = r3.length
            r6 = r8
        L65:
            if (r6 >= r0) goto L61
            r9 = r3[r6]
            boolean r10 = r9 instanceof android.content.ContentValues
            if (r10 == 0) goto L70
            android.content.ContentValues r9 = (android.content.ContentValues) r9
            goto L71
        L70:
            r9 = 0
        L71:
            if (r9 == 0) goto L74
            goto L77
        L74:
            int r6 = r6 + 1
            goto L65
        L77:
            if (r9 == 0) goto L391
            java.lang.String r0 = "sns_comment_anti_recall_enable"
            boolean r0 = r5.getBoolean(r0, r8)
            java.lang.String r6 = "rowid"
            java.lang.String r10 = "snsId"
            java.lang.String r11 = "field_snsId"
            java.lang.String r12 = "=? LIMIT 1"
            java.lang.String r13 = " LIMIT 1"
            if (r0 == 0) goto L270
            java.lang.String r0 = "attrBuf"
            boolean r15 = r9.containsKey(r0)
            if (r15 == 0) goto L95
        L93:
            r15 = r0
            goto L9e
        L95:
            java.lang.String r0 = "field_attrBuf"
            boolean r15 = r9.containsKey(r0)
            if (r15 == 0) goto L270
            goto L93
        L9e:
            byte[] r0 = r9.getAsByteArray(r15)     // Catch: java.lang.Throwable -> La3
            goto Laa
        La3:
            r0 = move-exception
            sf.f r7 = new sf.f
            r7.<init>(r0)
            r0 = r7
        Laa:
            boolean r7 = r0 instanceof sf.f
            if (r7 == 0) goto Lb0
            r0 = 0
        Lb0:
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L270
            if (r2 == 0) goto Lb8
            if (r3 != 0) goto Lbc
        Lb8:
            r17 = r6
            goto L156
        Lbc:
            java.lang.String[] r7 = new java.lang.String[]{r10, r11}
            java.lang.Long r7 = n(r9, r7)
            java.lang.String r8 = "SELECT field_attrBuf FROM SnsInfo WHERE "
            java.lang.String r14 = "SELECT attrBuf FROM SnsInfo WHERE "
            if (r7 == 0) goto L10e
            java.lang.String[] r16 = new java.lang.String[]{r10, r11}
            r17 = r6
            r3 = 0
        Ld1:
            r6 = 2
            if (r3 < r6) goto Ld5
            goto L110
        Ld5:
            r6 = r16[r3]
            r18 = r3
            java.lang.String r3 = eh.a.n(r14, r6, r12)
            long r19 = r7.longValue()
            java.lang.String r19 = java.lang.String.valueOf(r19)
            r20 = r7
            java.lang.String[] r7 = new java.lang.String[]{r19}
            byte[] r3 = r1.s(r2, r3, r7)
            if (r3 == 0) goto Lf2
            goto L157
        Lf2:
            java.lang.String r3 = eh.a.n(r8, r6, r12)
            long r6 = r20.longValue()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String[] r6 = new java.lang.String[]{r6}
            byte[] r3 = r1.s(r2, r3, r6)
            if (r3 == 0) goto L109
            goto L157
        L109:
            int r3 = r18 + 1
            r7 = r20
            goto Ld1
        L10e:
            r17 = r6
        L110:
            java.lang.String[] r3 = new java.lang.String[]{r17}
            java.lang.Long r3 = n(r9, r3)
            if (r3 == 0) goto L12f
            long r6 = r3.longValue()
            java.lang.String r3 = java.lang.String.valueOf(r6)
            java.lang.String[] r3 = new java.lang.String[]{r3}
            java.lang.String r6 = "SELECT attrBuf FROM SnsInfo WHERE rowid=? LIMIT 1"
            byte[] r3 = r1.s(r2, r6, r3)
            if (r3 == 0) goto L12f
            goto L157
        L12f:
            java.lang.String r3 = x(r24)
            boolean r6 = og.m.t0(r3)
            if (r6 != 0) goto L13a
            goto L13b
        L13a:
            r3 = 0
        L13b:
            if (r3 == 0) goto L156
            java.lang.String[] r6 = v(r24)
            java.lang.String r7 = eh.a.n(r14, r3, r13)
            byte[] r7 = r1.s(r2, r7, r6)
            if (r7 == 0) goto L14d
            r3 = r7
            goto L157
        L14d:
            java.lang.String r3 = eh.a.n(r8, r3, r13)
            byte[] r3 = r1.s(r2, r3, r6)
            goto L157
        L156:
            r3 = 0
        L157:
            if (r3 == 0) goto L272
            java.lang.Object r3 = r1.r(r3)     // Catch: java.lang.Throwable -> L1b7
            if (r3 == 0) goto L197
            java.lang.Object r0 = r1.r(r0)     // Catch: java.lang.Throwable -> L1b7
            if (r0 == 0) goto L197
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r3, r4)     // Catch: java.lang.Throwable -> L1b7
            boolean r6 = gg.x.e(r3)     // Catch: java.lang.Throwable -> L1b7
            if (r6 == 0) goto L172
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L1b7
            goto L173
        L172:
            r3 = 0
        L173:
            if (r3 == 0) goto L176
            goto L17b
        L176:
            java.util.LinkedList r3 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L1b7
            r3.<init>()     // Catch: java.lang.Throwable -> L1b7
        L17b:
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r0, r4)     // Catch: java.lang.Throwable -> L1b7
            boolean r6 = gg.x.e(r4)     // Catch: java.lang.Throwable -> L1b7
            if (r6 == 0) goto L188
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L1b7
            goto L189
        L188:
            r4 = 0
        L189:
            if (r4 == 0) goto L18c
            goto L191
        L18c:
            java.util.LinkedList r4 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L1b7
            r4.<init>()     // Catch: java.lang.Throwable -> L1b7
        L191:
            boolean r6 = r3.isEmpty()     // Catch: java.lang.Throwable -> L1b7
            if (r6 == 0) goto L19c
        L197:
            r20 = r13
        L199:
            r0 = 0
            goto L26a
        L19c:
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L1b7
            r6.<init>()     // Catch: java.lang.Throwable -> L1b7
            java.util.Iterator r7 = r4.iterator()     // Catch: java.lang.Throwable -> L1b7
        L1a5:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L1b7
            if (r8 == 0) goto L1bc
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L1b7
            java.lang.String r8 = r1.e(r8)     // Catch: java.lang.Throwable -> L1b7
            r6.add(r8)     // Catch: java.lang.Throwable -> L1b7
            goto L1a5
        L1b7:
            r0 = move-exception
            r20 = r13
            goto L25f
        L1bc:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1b7
            r7.<init>()     // Catch: java.lang.Throwable -> L1b7
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L1b7
        L1c5:
            boolean r8 = r3.hasNext()     // Catch: java.lang.Throwable -> L1b7
            if (r8 == 0) goto L22c
            java.lang.Object r8 = r3.next()     // Catch: java.lang.Throwable -> L1b7
            r8.getClass()     // Catch: java.lang.Throwable -> L1b7
            r14 = 2
            boolean r16 = a7.a.z(r14, r8)     // Catch: java.lang.Throwable -> L1b7
            if (r16 == 0) goto L1e2
        L1d9:
            r18 = r3
            r19 = r6
            r20 = r13
        L1df:
            r16 = 0
            goto L21e
        L1e2:
            java.lang.String r14 = r1.e(r8)     // Catch: java.lang.Throwable -> L1b7
            boolean r14 = r6.contains(r14)     // Catch: java.lang.Throwable -> L1b7
            if (r14 != 0) goto L1d9
            java.lang.String r14 = c(r8)     // Catch: java.lang.Throwable -> L1b7
            r16 = 1
            if (r14 == 0) goto L215
            r18 = r3
            java.lang.String r3 = w(r8, r14)     // Catch: java.lang.Throwable -> L1b7
            r19 = r6
            java.lang.String r6 = r1.d()     // Catch: java.lang.Throwable -> L1b7
            r20 = r13
            r13 = 0
            boolean r21 = og.m.h0(r3, r6, r13)     // Catch: java.lang.Throwable -> L22a
            if (r21 == 0) goto L20c
            r3 = r16
            goto L21c
        L20c:
            java.lang.String r3 = p(r3, r6)     // Catch: java.lang.Throwable -> L22a
            boolean r3 = h.Hchat.utils.KavaReflector.writeField(r8, r14, r3)     // Catch: java.lang.Throwable -> L22a
            goto L21c
        L215:
            r18 = r3
            r19 = r6
            r20 = r13
            r3 = 0
        L21c:
            if (r3 == 0) goto L1df
        L21e:
            if (r16 == 0) goto L223
            r7.add(r8)     // Catch: java.lang.Throwable -> L22a
        L223:
            r3 = r18
            r6 = r19
            r13 = r20
            goto L1c5
        L22a:
            r0 = move-exception
            goto L25f
        L22c:
            r20 = r13
            boolean r3 = r7.isEmpty()     // Catch: java.lang.Throwable -> L22a
            if (r3 == 0) goto L236
            goto L199
        L236:
            r4.addAll(r7)     // Catch: java.lang.Throwable -> L22a
            int r3 = r4.size()     // Catch: java.lang.Throwable -> L22a
            java.lang.String r4 = "CommentCount"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L22a
            h.Hchat.utils.KavaReflector.writeField(r0, r4, r6)     // Catch: java.lang.Throwable -> L22a
            java.lang.String r4 = "CommentUserListCount"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L22a
            h.Hchat.utils.KavaReflector.writeField(r0, r4, r3)     // Catch: java.lang.Throwable -> L22a
            java.lang.String r3 = "toByteArray"
            r13 = 0
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L22a
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeMethod(r0, r3, r4)     // Catch: java.lang.Throwable -> L22a
            boolean r3 = r0 instanceof byte[]     // Catch: java.lang.Throwable -> L22a
            if (r3 == 0) goto L199
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L22a
            goto L26a
        L25f:
            java.lang.String r3 = r0.getMessage()
            java.lang.String r4 = "[Hchat:SnsAntiRecall] 合并朋友圈评论失败: "
            eh.a.x(r4, r3, r0)
            goto L199
        L26a:
            if (r0 == 0) goto L274
            r9.put(r15, r0)
            goto L274
        L270:
            r17 = r6
        L272:
            r20 = r13
        L274:
            if (r25 != 0) goto L278
            goto L391
        L278:
            java.lang.String r0 = "sns_anti_recall_enable"
            r13 = 0
            boolean r0 = r5.getBoolean(r0, r13)
            if (r0 != 0) goto L283
            goto L391
        L283:
            java.lang.String r0 = "type"
            java.lang.String r3 = "field_type"
            java.lang.String[] r4 = new java.lang.String[]{r0, r3}
            java.lang.Integer r4 = i(r9, r4)
            if (r4 == 0) goto L297
            int r0 = r4.intValue()
            goto L355
        L297:
            java.lang.String[] r0 = new java.lang.String[]{r0, r3}
            if (r2 == 0) goto L331
            if (r24 != 0) goto L2a1
            goto L331
        L2a1:
            java.lang.String[] r3 = new java.lang.String[]{r10, r11}
            java.lang.Long r3 = n(r9, r3)
            java.lang.String r4 = " FROM SnsInfo WHERE "
            java.lang.String r5 = "SELECT "
            if (r3 == 0) goto L2e6
            java.lang.String[] r6 = new java.lang.String[]{r10, r11}
            r7 = r13
        L2b4:
            r14 = 2
            if (r7 < r14) goto L2b8
            goto L2e6
        L2b8:
            r8 = r6[r7]
            r10 = r13
        L2bb:
            if (r10 < r14) goto L2c0
            int r7 = r7 + 1
            goto L2b4
        L2c0:
            r11 = r0[r10]
            java.lang.String r11 = bc.e.k(r5, r11, r4, r8, r12)
            long r14 = r3.longValue()
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String[] r14 = new java.lang.String[]{r14}
            java.lang.Integer r11 = r1.t(r2, r11, r14)
            if (r11 == 0) goto L2e2
            int r0 = r11.intValue()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            goto L34f
        L2e2:
            int r10 = r10 + 1
            r14 = 2
            goto L2bb
        L2e6:
            java.lang.String[] r3 = new java.lang.String[]{r17}
            java.lang.Long r3 = n(r9, r3)
            if (r3 == 0) goto L31b
            r6 = r13
        L2f1:
            r14 = 2
            if (r6 < r14) goto L2f5
            goto L31b
        L2f5:
            r7 = r0[r6]
            java.lang.String r8 = " FROM SnsInfo WHERE rowid=? LIMIT 1"
            java.lang.String r7 = eh.a.n(r5, r7, r8)
            long r10 = r3.longValue()
            java.lang.String r8 = java.lang.String.valueOf(r10)
            java.lang.String[] r8 = new java.lang.String[]{r8}
            java.lang.Integer r7 = r1.t(r2, r7, r8)
            if (r7 == 0) goto L318
            int r0 = r7.intValue()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            goto L34f
        L318:
            int r6 = r6 + 1
            goto L2f1
        L31b:
            java.lang.String r3 = x(r24)
            boolean r6 = og.m.t0(r3)
            if (r6 != 0) goto L326
            goto L327
        L326:
            r3 = 0
        L327:
            if (r3 == 0) goto L331
            java.lang.String[] r6 = v(r24)
            r8 = r13
            r14 = 2
        L32f:
            if (r8 < r14) goto L333
        L331:
            r7 = 0
            goto L34f
        L333:
            r7 = r0[r8]
            r10 = r20
            java.lang.String r7 = bc.e.k(r5, r7, r4, r3, r10)
            java.lang.Integer r7 = r1.t(r2, r7, r6)
            if (r7 == 0) goto L34a
            int r0 = r7.intValue()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            goto L34f
        L34a:
            int r8 = r8 + 1
            r20 = r10
            goto L32f
        L34f:
            if (r7 == 0) goto L391
            int r0 = r7.intValue()
        L355:
            java.util.Set r2 = ha.j0.f5233j
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L362
            goto L391
        L362:
            java.lang.String r0 = "sourceType"
            java.lang.String r2 = "field_sourceType"
            java.lang.String[] r3 = new java.lang.String[]{r0, r2}
            java.lang.Integer r3 = i(r9, r3)
            if (r3 == 0) goto L391
            int r3 = r3.intValue()
            if (r3 == 0) goto L377
            goto L391
        L377:
            r9.remove(r0)
            r9.remove(r2)
            java.lang.String r0 = "contentDesc"
            r1.q(r9, r0)
            java.lang.String r0 = "field_contentDesc"
            r1.q(r9, r0)
            java.lang.String r0 = "content"
            r1.o(r9, r0)
            java.lang.String r0 = "field_content"
            r1.o(r9, r0)
        L391:
            return
    }

    public static java.lang.String c(java.lang.Object r3) {
            r0 = 0
        L1:
            r1 = 2
            if (r0 >= r1) goto L14
            java.lang.String[] r1 = ha.j0.f5229f
            r1 = r1[r0]
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r3, r1)
            boolean r2 = r2 instanceof java.lang.String
            if (r2 == 0) goto L11
            return r1
        L11:
            int r0 = r0 + 1
            goto L1
        L14:
            r3 = 0
            return r3
    }

    public static int g(java.lang.Iterable r4, java.lang.Object r5) {
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L34
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r5, r0)
            boolean r3 = r0 instanceof java.lang.Number
            if (r3 == 0) goto L1d
            java.lang.Number r0 = (java.lang.Number) r0
            goto L1e
        L1d:
            r0 = r2
        L1e:
            if (r0 == 0) goto L25
            int r0 = r0.intValue()
            goto L26
        L25:
            r0 = r1
        L26:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            if (r0 <= 0) goto L2e
            r0 = 1
            goto L2f
        L2e:
            r0 = r1
        L2f:
            if (r0 == 0) goto L32
            r2 = r3
        L32:
            if (r2 == 0) goto L4
        L34:
            if (r2 == 0) goto L3b
            int r4 = r2.intValue()
            return r4
        L3b:
            return r1
    }

    public static java.lang.Integer i(android.content.ContentValues r6, java.lang.String... r7) {
            int r0 = r7.length
            r1 = 0
        L2:
            r2 = 0
            if (r1 < r0) goto L6
            return r2
        L6:
            r3 = r7[r1]
            boolean r4 = r6.containsKey(r3)
            if (r4 != 0) goto Lf
            goto L68
        Lf:
            java.lang.Integer r4 = r6.getAsInteger(r3)     // Catch: java.lang.Throwable -> L14
            goto L1b
        L14:
            r4 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r4)
            r4 = r5
        L1b:
            boolean r5 = r4 instanceof sf.f
            if (r5 == 0) goto L21
            r4 = r2
        L21:
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L2e
            int r6 = r4.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        L2e:
            java.lang.Object r3 = r6.get(r3)     // Catch: java.lang.Throwable -> L33
            goto L3a
        L33:
            r3 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L3a:
            boolean r4 = r3 instanceof sf.f
            if (r4 == 0) goto L40
            goto L41
        L40:
            r2 = r3
        L41:
            boolean r3 = r2 instanceof java.lang.Number
            if (r3 == 0) goto L51
            java.lang.Number r2 = (java.lang.Number) r2
            int r6 = r2.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        L51:
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L68
            java.lang.String r2 = (java.lang.String) r2
            r3 = 10
            java.lang.Integer r2 = og.t.e0(r3, r2)
            if (r2 == 0) goto L68
            int r6 = r2.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        L68:
            int r1 = r1 + 1
            goto L2
    }

    public static boolean k(java.lang.reflect.Method r5) {
            java.lang.String r0 = r5.getName()
            java.lang.String r1 = "rawQuery"
            boolean r1 = gg.l.a(r0, r1)
            r2 = 0
            if (r1 != 0) goto L16
            java.lang.String r1 = "rawQueryWithFactory"
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L16
            goto L30
        L16:
            java.lang.Class[] r5 = r5.getParameterTypes()
            r5.getClass()
            int r0 = r5.length
            r1 = r2
        L1f:
            if (r1 >= r0) goto L30
            r3 = r5[r1]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L2d
            r5 = 1
            return r5
        L2d:
            int r1 = r1 + 1
            goto L1f
        L30:
            return r2
    }

    public static boolean l(java.lang.reflect.Method r5) {
            java.lang.Class r0 = r5.getReturnType()
            java.lang.Class r1 = java.lang.Integer.TYPE
            boolean r0 = gg.l.a(r0, r1)
            r1 = 0
            if (r0 != 0) goto Le
            goto L41
        Le:
            java.lang.String r0 = r5.getName()
            java.lang.String r2 = "update"
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto L27
            java.lang.String r0 = r5.getName()
            java.lang.String r2 = "updateWithOnConflict"
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto L27
            goto L41
        L27:
            java.lang.Class[] r5 = r5.getParameterTypes()
            r5.getClass()
            int r0 = r5.length
            r2 = r1
        L30:
            if (r2 >= r0) goto L41
            r3 = r5[r2]
            java.lang.Class<android.content.ContentValues> r4 = android.content.ContentValues.class
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto L3e
            r5 = 1
            return r5
        L3e:
            int r2 = r2 + 1
            goto L30
        L41:
            return r1
    }

    public static boolean m(java.lang.reflect.Method r5) {
            boolean r0 = l(r5)
            if (r0 != 0) goto L53
            java.lang.Class r0 = r5.getReturnType()
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r0 = gg.l.a(r0, r1)
            r1 = 0
            if (r0 != 0) goto L14
            goto L52
        L14:
            java.lang.String r0 = r5.getName()
            java.lang.String r2 = "insert"
            boolean r2 = gg.l.a(r0, r2)
            if (r2 != 0) goto L39
            java.lang.String r2 = "insertWithOnConflict"
            boolean r2 = gg.l.a(r0, r2)
            if (r2 != 0) goto L39
            java.lang.String r2 = "replace"
            boolean r2 = gg.l.a(r0, r2)
            if (r2 != 0) goto L39
            java.lang.String r2 = "replaceOrThrow"
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto L39
            goto L52
        L39:
            java.lang.Class[] r5 = r5.getParameterTypes()
            r5.getClass()
            int r0 = r5.length
            r2 = r1
        L42:
            if (r2 >= r0) goto L52
            r3 = r5[r2]
            java.lang.Class<android.content.ContentValues> r4 = android.content.ContentValues.class
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto L4f
            goto L53
        L4f:
            int r2 = r2 + 1
            goto L42
        L52:
            return r1
        L53:
            r5 = 1
            return r5
    }

    public static java.lang.Long n(android.content.ContentValues r6, java.lang.String... r7) {
            int r0 = r7.length
            r1 = 0
        L2:
            r2 = 0
            if (r1 < r0) goto L6
            return r2
        L6:
            r3 = r7[r1]
            boolean r4 = r6.containsKey(r3)
            if (r4 != 0) goto Lf
            goto L66
        Lf:
            java.lang.Long r4 = r6.getAsLong(r3)     // Catch: java.lang.Throwable -> L14
            goto L1b
        L14:
            r4 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r4)
            r4 = r5
        L1b:
            boolean r5 = r4 instanceof sf.f
            if (r5 == 0) goto L21
            r4 = r2
        L21:
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L2e
            long r6 = r4.longValue()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            return r6
        L2e:
            java.lang.Object r3 = r6.get(r3)     // Catch: java.lang.Throwable -> L33
            goto L3a
        L33:
            r3 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L3a:
            boolean r4 = r3 instanceof sf.f
            if (r4 == 0) goto L40
            goto L41
        L40:
            r2 = r3
        L41:
            boolean r3 = r2 instanceof java.lang.Number
            if (r3 == 0) goto L51
            java.lang.Number r2 = (java.lang.Number) r2
            long r6 = r2.longValue()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            return r6
        L51:
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L66
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Long r2 = og.t.g0(r2)
            if (r2 == 0) goto L66
            long r6 = r2.longValue()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            return r6
        L66:
            int r1 = r1 + 1
            goto L2
    }

    public static java.lang.String p(java.lang.String r1, java.lang.String r2) {
            r0 = 0
            boolean r0 = og.m.h0(r1, r2, r0)
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = og.m.t0(r1)
            if (r0 == 0) goto Lf
            return r2
        Lf:
            java.lang.String r0 = " "
            java.lang.String r1 = wb.en.h(r2, r0, r1)
            return r1
    }

    public static ha.i0 u(byte[] r6, int r7) {
            r0 = 0
            r1 = 0
        L3:
            int r3 = r6.length
            if (r7 >= r3) goto L20
            r3 = 64
            if (r0 >= r3) goto L20
            r3 = r6[r7]
            int r7 = r7 + 1
            r4 = r3 & 127(0x7f, float:1.78E-43)
            long r4 = (long) r4
            long r4 = r4 << r0
            long r1 = r1 | r4
            r3 = r3 & 128(0x80, float:1.8E-43)
            if (r3 != 0) goto L1d
            ha.i0 r6 = new ha.i0
            r6.<init>(r1, r7)
            return r6
        L1d:
            int r0 = r0 + 7
            goto L3
        L20:
            r6 = 0
            return r6
    }

    public static java.lang.String[] v(java.lang.Object[] r7) {
            int r0 = r7.length
            r1 = 0
            r2 = r1
        L3:
            r3 = 0
            if (r2 >= r0) goto L25
            r4 = r7[r2]
            boolean r5 = r4 instanceof java.lang.Object[]
            if (r5 == 0) goto L1e
            java.lang.Class r5 = r4.getClass()
            java.lang.Class r5 = r5.getComponentType()
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto L1e
            r5 = 1
            goto L1f
        L1e:
            r5 = r1
        L1f:
            if (r5 == 0) goto L22
            goto L26
        L22:
            int r2 = r2 + 1
            goto L3
        L25:
            r4 = r3
        L26:
            boolean r7 = r4 instanceof java.lang.String[]
            if (r7 == 0) goto L2d
            java.lang.String[] r4 = (java.lang.String[]) r4
            return r4
        L2d:
            return r3
    }

    public static java.lang.String w(java.lang.Object r0, java.lang.String r1) {
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r0, r1)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto Lb
            java.lang.String r0 = (java.lang.String) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto Lf
            return r0
        Lf:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String x(java.lang.Object[] r5) {
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L3:
            if (r1 < r0) goto L8
            java.lang.String r5 = ""
            return r5
        L8:
            r3 = r5[r1]
            boolean r4 = r3 instanceof android.content.ContentValues
            if (r4 == 0) goto L10
            r2 = 1
            goto L19
        L10:
            if (r2 == 0) goto L19
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L19
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L19:
            int r1 = r1 + 1
            goto L3
    }

    public static void y(java.io.ByteArrayOutputStream r4, long r5) {
        L0:
            r0 = -128(0xffffffffffffff80, double:NaN)
            long r0 = r0 & r5
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Le
            int r5 = (int) r5
            r4.write(r5)
            return
        Le:
            r0 = 127(0x7f, double:6.27E-322)
            long r0 = r0 & r5
            r2 = 128(0x80, double:6.3E-322)
            long r0 = r0 | r2
            int r0 = (int) r0
            r4.write(r0)
            r0 = 7
            long r5 = r5 >>> r0
            goto L0
    }

    public final java.lang.String d() {
            r3 = this;
            java.lang.String r0 = "sns_comment_custom_mark_enable"
            r1 = 0
            android.content.SharedPreferences r2 = r3.f5241b
            boolean r0 = r2.getBoolean(r0, r1)
            java.lang.String r1 = "[已删除]"
            if (r0 == 0) goto L27
            java.lang.String r0 = "sns_comment_custom_mark_text"
            java.lang.String r0 = r2.getString(r0, r1)
            if (r0 != 0) goto L17
            java.lang.String r0 = ""
        L17:
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            boolean r2 = og.m.t0(r0)
            if (r2 == 0) goto L26
            return r1
        L26:
            return r0
        L27:
            return r1
    }

    public final java.lang.String e(java.lang.Object r11) {
            r10 = this;
            java.lang.String r0 = c(r11)
            gg.b r1 = new gg.b
            java.lang.String[] r2 = ha.j0.f5232i
            r1.<init>(r2)
        Lb:
            boolean r2 = r1.hasNext()
            r3 = 0
            r5 = 0
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r11, r2)
            boolean r6 = r2 instanceof java.lang.Number
            if (r6 == 0) goto L25
            java.lang.Number r2 = (java.lang.Number) r2
            goto L26
        L25:
            r2 = r5
        L26:
            if (r2 == 0) goto L2d
            long r6 = r2.longValue()
            goto L2e
        L2d:
            r6 = r3
        L2e:
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 <= 0) goto L37
            goto L38
        L37:
            r2 = r5
        L38:
            if (r2 == 0) goto Lb
            goto L3c
        L3b:
            r2 = r5
        L3c:
            if (r2 == 0) goto L43
            long r1 = r2.longValue()
            goto L44
        L43:
            r1 = r3
        L44:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 0
        L4a:
            r8 = 5
            if (r7 >= r8) goto L5d
            java.lang.String[] r8 = ha.j0.f5231h
            r8 = r8[r7]
            boolean r9 = gg.l.a(r8, r0)
            if (r9 != 0) goto L5a
            r6.add(r8)
        L5a:
            int r7 = r7 + 1
            goto L4a
        L5d:
            int r6 = g(r6, r11)
            ng.p r7 = new ng.p
            r8 = 1
            java.lang.String[] r9 = ha.j0.f5230g
            r7.<init>(r9, r8)
            int r7 = g(r7, r11)
            java.lang.String r8 = "d"
            java.lang.String r8 = w(r11, r8)
            if (r0 == 0) goto L79
            java.lang.String r5 = w(r11, r0)
        L79:
            if (r5 != 0) goto L7d
            java.lang.String r5 = ""
        L7d:
            java.lang.String r11 = r10.d()
            java.lang.String r11 = og.m.A0(r5, r11)
            java.lang.CharSequence r11 = og.m.V0(r11)
            java.lang.String r11 = r11.toString()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L98
            java.lang.String r11 = "svr:"
            java.lang.String r11 = bc.e.g(r1, r11)
            return r11
        L98:
            if (r6 <= 0) goto La1
            java.lang.String r11 = "local:"
            java.lang.String r11 = eh.a.l(r6, r11)
            return r11
        La1:
            java.lang.String r0 = "fallback:"
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = eh.a.u(r7, r0, r8, r1, r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            return r11
    }

    public final java.lang.String f() {
            r3 = this;
            java.lang.String r0 = "sns_custom_mark_enable"
            r1 = 0
            android.content.SharedPreferences r2 = r3.f5241b
            boolean r0 = r2.getBoolean(r0, r1)
            java.lang.String r1 = "[已删除]"
            if (r0 == 0) goto L27
            java.lang.String r0 = "sns_custom_mark_text"
            java.lang.String r0 = r2.getString(r0, r1)
            if (r0 != 0) goto L17
            java.lang.String r0 = ""
        L17:
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            boolean r2 = og.m.t0(r0)
            if (r2 == 0) goto L26
            return r1
        L26:
            return r0
        L27:
            return r1
    }

    public final int h(java.lang.Class r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.util.List r6 = h.Hchat.utils.KavaReflector.declaredMethods(r6)
            java.util.Iterator r6 = r6.iterator()
        Lc:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r6.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r2 = m(r1)
            if (r2 != 0) goto L25
            boolean r2 = k(r1)
            if (r2 != 0) goto L25
            goto Lc
        L25:
            java.util.Set r2 = r5.f5243d
            boolean r2 = r2.add(r1)
            if (r2 != 0) goto L2e
            goto Lc
        L2e:
            r8.i r2 = r8.i.f11631b
            c9.c2 r3 = new c9.c2
            r4 = 4
            r3.<init>(r5, r4, r1)
            r2.b(r1, r3)
            int r0 = r0 + 1
            goto Lc
        L3c:
            return r0
    }

    public final android.database.Cursor j(java.lang.Object r9, java.lang.String r10, java.lang.String[] r11) {
            r8 = this;
            r0 = 2
            java.io.Serializable[] r1 = new java.io.Serializable[r0]
            r2 = 0
            r1[r2] = r10
            r2 = 1
            r1[r2] = r11
            java.lang.Class r2 = r9.getClass()
            java.lang.String r3 = "rawQuery"
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r1, r0)
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.findCompatibleMethod(r2, r3, r4)
            java.lang.String r3 = "rawQueryWithFactory"
            r4 = 0
            if (r2 == 0) goto L1d
            goto L2b
        L1d:
            java.lang.Class r2 = r9.getClass()
            java.lang.Object[] r5 = new java.lang.Object[]{r4, r10, r11, r4}
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.findCompatibleMethod(r2, r3, r5)
            if (r2 == 0) goto L6b
        L2b:
            java.lang.ThreadLocal r5 = r8.f5244e
            java.lang.Object r6 = r5.get()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r5.set(r7)
            java.lang.String r7 = r2.getName()     // Catch: java.lang.Throwable -> L52
            boolean r3 = gg.l.a(r7, r3)     // Catch: java.lang.Throwable -> L52
            if (r3 == 0) goto L54
            java.lang.Object[] r10 = new java.lang.Object[]{r4, r10, r11, r4}     // Catch: java.lang.Throwable -> L52
            java.lang.Object r9 = h.Hchat.utils.KavaReflector.invoke(r2, r9, r10)     // Catch: java.lang.Throwable -> L52
            boolean r10 = r9 instanceof android.database.Cursor     // Catch: java.lang.Throwable -> L52
            if (r10 == 0) goto L63
            r4 = r9
            android.database.Cursor r4 = (android.database.Cursor) r4     // Catch: java.lang.Throwable -> L52
            goto L63
        L52:
            r9 = move-exception
            goto L67
        L54:
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r1, r0)     // Catch: java.lang.Throwable -> L52
            java.lang.Object r9 = h.Hchat.utils.KavaReflector.invoke(r2, r9, r10)     // Catch: java.lang.Throwable -> L52
            boolean r10 = r9 instanceof android.database.Cursor     // Catch: java.lang.Throwable -> L52
            if (r10 == 0) goto L63
            r4 = r9
            android.database.Cursor r4 = (android.database.Cursor) r4     // Catch: java.lang.Throwable -> L52
        L63:
            r5.set(r6)
            return r4
        L67:
            r5.set(r6)
            throw r9
        L6b:
            return r4
    }

    public final void o(android.content.ContentValues r17, java.lang.String r18) {
            r16 = this;
            boolean r0 = r17.containsKey(r18)
            if (r0 != 0) goto L8
            goto Lfc
        L8:
            byte[] r0 = r17.getAsByteArray(r18)     // Catch: java.lang.Throwable -> Ld
            goto L14
        Ld:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L14:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L1a
            r0 = 0
        L1a:
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto Lfc
            java.lang.String r1 = r16.f()     // Catch: java.lang.Throwable -> L60
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L60
            r3.getClass()     // Catch: java.lang.Throwable -> L60
            byte[] r1 = r1.getBytes(r3)     // Catch: java.lang.Throwable -> L60
            r1.getClass()     // Catch: java.lang.Throwable -> L60
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L60
            int r4 = r0.length     // Catch: java.lang.Throwable -> L60
            int r5 = r1.length     // Catch: java.lang.Throwable -> L60
            int r4 = r4 + r5
            r5 = 8
            int r4 = r4 + r5
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L60
            r4 = 0
            r6 = r4
            r7 = r6
            r8 = r7
        L3d:
            int r9 = r0.length     // Catch: java.lang.Throwable -> L60
            r10 = 1
            if (r6 >= r9) goto Ldd
            ha.i0 r6 = u(r0, r6)     // Catch: java.lang.Throwable -> L60
            if (r6 == 0) goto L60
            int r9 = r6.f5227b     // Catch: java.lang.Throwable -> L60
            long r11 = r6.f5226a     // Catch: java.lang.Throwable -> L60
            r6 = 3
            long r13 = r11 >>> r6
            int r6 = (int) r13     // Catch: java.lang.Throwable -> L60
            r13 = 7
            long r13 = r13 & r11
            int r13 = (int) r13     // Catch: java.lang.Throwable -> L60
            y(r3, r11)     // Catch: java.lang.Throwable -> L60
            if (r13 == 0) goto Lce
            if (r13 == r10) goto Lc2
            r11 = 2
            r12 = 5
            if (r13 == r11) goto L6e
            if (r13 == r12) goto L63
        L60:
            r2 = 0
            goto Lf3
        L63:
            int r6 = r9 + 4
            int r10 = r0.length     // Catch: java.lang.Throwable -> L60
            if (r6 <= r10) goto L69
            goto L60
        L69:
            r10 = 4
            r3.write(r0, r9, r10)     // Catch: java.lang.Throwable -> L60
            goto L3d
        L6e:
            ha.i0 r9 = u(r0, r9)     // Catch: java.lang.Throwable -> L60
            if (r9 == 0) goto L60
            int r11 = r9.f5227b     // Catch: java.lang.Throwable -> L60
            long r13 = r9.f5226a     // Catch: java.lang.Throwable -> L60
            int r9 = (int) r13     // Catch: java.lang.Throwable -> L60
            if (r9 < 0) goto L60
            int r15 = r11 + r9
            int r2 = r0.length     // Catch: java.lang.Throwable -> L60
            if (r15 <= r2) goto L81
            goto L60
        L81:
            if (r6 != r12) goto Lb9
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L60
            r2.getClass()     // Catch: java.lang.Throwable -> L60
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L60
            r6.<init>(r0, r11, r9, r2)     // Catch: java.lang.Throwable -> L60
            java.lang.String r7 = r16.f()     // Catch: java.lang.Throwable -> L60
            java.lang.String r6 = p(r6, r7)     // Catch: java.lang.Throwable -> L60
            byte[] r2 = r6.getBytes(r2)     // Catch: java.lang.Throwable -> L60
            r2.getClass()     // Catch: java.lang.Throwable -> L60
            int r6 = r2.length     // Catch: java.lang.Throwable -> L60
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L60
            y(r3, r6)     // Catch: java.lang.Throwable -> L60
            r3.write(r2)     // Catch: java.lang.Throwable -> L60
            if (r8 != 0) goto Lb6
            int r6 = r2.length     // Catch: java.lang.Throwable -> L60
            if (r6 != r9) goto Lb6
            byte[] r6 = tf.l.t0(r0, r11, r15)     // Catch: java.lang.Throwable -> L60
            boolean r2 = java.util.Arrays.equals(r2, r6)     // Catch: java.lang.Throwable -> L60
            if (r2 != 0) goto Lb4
            goto Lb6
        Lb4:
            r8 = r4
            goto Lb7
        Lb6:
            r8 = r10
        Lb7:
            r7 = r10
            goto Lbf
        Lb9:
            y(r3, r13)     // Catch: java.lang.Throwable -> L60
            r3.write(r0, r11, r9)     // Catch: java.lang.Throwable -> L60
        Lbf:
            r6 = r15
            goto L3d
        Lc2:
            int r2 = r9 + 8
            int r6 = r0.length     // Catch: java.lang.Throwable -> L60
            if (r2 <= r6) goto Lc8
            goto L60
        Lc8:
            r3.write(r0, r9, r5)     // Catch: java.lang.Throwable -> L60
            r6 = r2
            goto L3d
        Lce:
            ha.i0 r2 = u(r0, r9)     // Catch: java.lang.Throwable -> L60
            if (r2 == 0) goto L60
            int r6 = r2.f5227b     // Catch: java.lang.Throwable -> L60
            long r9 = r2.f5226a     // Catch: java.lang.Throwable -> L60
            y(r3, r9)     // Catch: java.lang.Throwable -> L60
            goto L3d
        Ldd:
            if (r7 != 0) goto Led
            r4 = 42
            y(r3, r4)     // Catch: java.lang.Throwable -> L60
            int r0 = r1.length     // Catch: java.lang.Throwable -> L60
            long r4 = (long) r0     // Catch: java.lang.Throwable -> L60
            y(r3, r4)     // Catch: java.lang.Throwable -> L60
            r3.write(r1)     // Catch: java.lang.Throwable -> L60
            r8 = r10
        Led:
            if (r8 == 0) goto L60
            byte[] r2 = r3.toByteArray()     // Catch: java.lang.Throwable -> L60
        Lf3:
            if (r2 == 0) goto Lfc
            r1 = r17
            r3 = r18
            r1.put(r3, r2)
        Lfc:
            return
    }

    public final void q(android.content.ContentValues r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = r3.containsKey(r4)
            if (r0 != 0) goto L7
            goto L30
        L7:
            java.lang.String r0 = r3.getAsString(r4)     // Catch: java.lang.Throwable -> Lc
            goto L13
        Lc:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L13:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L19
            r0 = 0
        L19:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L1f
            java.lang.String r0 = ""
        L1f:
            java.lang.String r1 = r2.f()
            java.lang.String r1 = p(r0, r1)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L30
            r3.put(r4, r1)
        L30:
            return
    }

    public final java.lang.Object r(byte[] r5) {
            r4 = this;
            r8.g r0 = r4.f5240a
            java.lang.ClassLoader r0 = r0.f11622c
            java.lang.String r1 = "com.tencent.mm.protocal.protobuf.SnsObject"
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r1, r0)
            if (r0 == 0) goto L39
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.reflect.Constructor r0 = h.Hchat.utils.KavaReflector.findConstructor(r0, r2)
            if (r0 == 0) goto L39
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.newInstance(r0, r1)
            if (r0 == 0) goto L39
            java.lang.Class r1 = r0.getClass()
            java.lang.String r2 = "parseFrom"
            java.lang.Object[] r3 = new java.lang.Object[]{r5}
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.findCompatibleMethod(r1, r2, r3)
            if (r1 == 0) goto L39
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            boolean r5 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r1, r0, r5)
            if (r5 != 0) goto L38
            goto L39
        L38:
            return r0
        L39:
            r5 = 0
            return r5
    }

    public final byte[] s(java.lang.Object r5, java.lang.String r6, java.lang.String[] r7) {
            r4 = this;
            r0 = 0
            android.database.Cursor r5 = r4.j(r5, r6, r7)     // Catch: java.lang.Throwable -> L70
            if (r5 == 0) goto L6a
            boolean r6 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L71
            if (r6 != 0) goto Le
            goto L6a
        Le:
            int r6 = r5.getColumnCount()     // Catch: java.lang.Throwable -> L71
            r7 = 0
            lg.d r6 = r9.e0.r0(r7, r6)     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L71
        L1b:
            r1 = r6
            lg.c r1 = (lg.c) r1     // Catch: java.lang.Throwable -> L71
            boolean r1 = r1.f8047i     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L59
            r1 = r6
            lg.c r1 = (lg.c) r1     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L71
            r2 = r1
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Throwable -> L71
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L71
            java.lang.String r2 = r5.getColumnName(r2)     // Catch: java.lang.Throwable -> L35
            goto L3c
        L35:
            r2 = move-exception
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> L71
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L71
            r2 = r3
        L3c:
            boolean r3 = r2 instanceof sf.f     // Catch: java.lang.Throwable -> L71
            if (r3 == 0) goto L42
            r2 = r0
        L42:
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L71
            if (r2 != 0) goto L48
            java.lang.String r2 = ""
        L48:
            java.lang.String r3 = "attrBuf"
            boolean r3 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L71
            if (r3 != 0) goto L5a
            java.lang.String r3 = "field_attrBuf"
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L71
            if (r2 == 0) goto L1b
            goto L5a
        L59:
            r1 = r0
        L5a:
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L62
            int r7 = r1.intValue()     // Catch: java.lang.Throwable -> L71
        L62:
            byte[] r0 = r5.getBlob(r7)     // Catch: java.lang.Throwable -> L71
        L66:
            r5.close()     // Catch: java.lang.Throwable -> L74
            goto L74
        L6a:
            if (r5 == 0) goto L6f
            r5.close()     // Catch: java.lang.Throwable -> L6f
        L6f:
            return r0
        L70:
            r5 = r0
        L71:
            if (r5 == 0) goto L74
            goto L66
        L74:
            return r0
    }

    public final java.lang.Integer t(java.lang.Object r2, java.lang.String r3, java.lang.String[] r4) {
            r1 = this;
            r0 = 0
            android.database.Cursor r2 = r1.j(r2, r3, r4)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L25
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L2c
            if (r3 != 0) goto Le
            goto L25
        Le:
            r3 = 0
            boolean r4 = r2.isNull(r3)     // Catch: java.lang.Throwable -> L2c
            if (r4 == 0) goto L19
            r2.close()     // Catch: java.lang.Throwable -> L18
        L18:
            return r0
        L19:
            int r3 = r2.getInt(r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L2c
        L21:
            r2.close()     // Catch: java.lang.Throwable -> L2f
            goto L2f
        L25:
            if (r2 == 0) goto L2a
            r2.close()     // Catch: java.lang.Throwable -> L2a
        L2a:
            return r0
        L2b:
            r2 = r0
        L2c:
            if (r2 == 0) goto L2f
            goto L21
        L2f:
            return r0
    }
}
