package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class vd0 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.ConcurrentHashMap f11239 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.ConcurrentHashMap f11240 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.ConcurrentHashMap f11241 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.ConcurrentHashMap f11242 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.concurrent.ConcurrentHashMap f11243 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.concurrent.ConcurrentHashMap f11244 = null;

    /* JADX INFO: renamed from: η */
    public static final java.util.concurrent.ConcurrentHashMap f11245 = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.vd0.f11239 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.vd0.f11240 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.vd0.f11241 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.vd0.f11242 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.vd0.f11243 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.vd0.f11244 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.vd0.f11245 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.util.List m6174(java.lang.Class r3) {
            zb0 r0 = new zb0
            r1 = 15
            r0.<init>(r1)
            c8 r1 = new c8
            r2 = 9
            r1.<init>(r0, r2)
            java.util.concurrent.ConcurrentHashMap r0 = p000.vd0.f11239
            java.lang.Object r3 = r0.computeIfAbsent(r3, r1)
            r3.getClass()
            java.util.List r3 = (java.util.List) r3
            return r3
    }

    /* JADX INFO: renamed from: β */
    public static java.util.ArrayList m6175(java.util.List r10) {
            be0 r0 = p000.be0.f1670
            boolean r0 = r0.m939()
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r10)
            return r0
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L17:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L151
            java.lang.Object r1 = r10.next()
            r2 = 0
            if (r1 != 0) goto L26
            goto L14a
        L26:
            java.lang.Class r3 = r1.getClass()
            zb0 r4 = new zb0
            r5 = 7
            r4.<init>(r5)
            c8 r5 = new c8
            r6 = 5
            r5.<init>(r4, r6)
            java.util.concurrent.ConcurrentHashMap r4 = p000.vd0.f11245
            java.lang.Object r3 = r4.computeIfAbsent(r3, r5)
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            if (r3 != 0) goto L42
            goto L14a
        L42:
            java.lang.Object r3 = m6188(r1, r3)
            if (r3 != 0) goto L4a
            goto L14a
        L4a:
            java.lang.String r4 = "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC48734CE58758BC918F2FCD3BF51575EEC7F41A46914D80C06941"
            java.lang.String r4 = p000.jf0.m2957(r4)
            boolean r4 = m6186(r3, r4)
            if (r4 == 0) goto L5c
            boolean r2 = m6184(r3)
            goto L14a
        L5c:
            java.lang.String r4 = "~7934B87CF08E6E0B8EF20E7F7EAFB0B14A20D8F45CA801574E4ACC71C619528447ABA15E9CCFA094"
            java.lang.String r5 = p000.jf0.m2957(r4)
            boolean r5 = m6186(r3, r5)
            if (r5 == 0) goto L6e
            boolean r2 = m6183(r3)
            goto L14a
        L6e:
            java.lang.Class r5 = r3.getClass()
            java.util.List r5 = m6174(r5)
            java.util.Iterator r5 = r5.iterator()
        L7a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Le9
            java.lang.Object r6 = r5.next()
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            int r7 = r6.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 != 0) goto L7a
            java.lang.Object r6 = m6188(r3, r6)
            if (r6 != 0) goto L97
            goto L7a
        L97:
            java.lang.String r7 = "~7954D7E14DB7341B6A011C494738772667DB63664E455DD5DA57E5C48FD7B3E094AA60E23CF26DE3BAC25A60400A2726"
            java.lang.String r7 = p000.jf0.m2957(r7)
            boolean r7 = m6186(r6, r7)
            if (r7 == 0) goto Lab
            boolean r6 = m6185(r6)
            if (r6 == 0) goto L7a
            goto L149
        Lab:
            java.lang.String r7 = "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56F83D74BBFAB7CBEE7B406BF862183B85AF1AA5D7AE7DCC2D4430DE0A216FBE"
            java.lang.String r7 = p000.jf0.m2957(r7)
            boolean r7 = m6186(r6, r7)
            if (r7 == 0) goto Ld8
            p000.vh0.m6217(r6)
            java.lang.String r7 = "getConversationId"
            java.util.List r7 = p000.AbstractC1021yh.m6896(r7)
            java.lang.String r8 = "mConversationId"
            java.lang.String r9 = "conversationId"
            java.lang.String[] r8 = new java.lang.String[]{r8, r9}
            java.util.List r8 = p000.AbstractC1021yh.m6897(r8)
            java.lang.String r6 = m6191(r6, r7, r8)
            boolean r6 = m6182(r6)
            if (r6 == 0) goto L7a
            goto L149
        Ld8:
            java.lang.String r7 = p000.jf0.m2957(r4)
            boolean r7 = m6186(r6, r7)
            if (r7 == 0) goto L7a
            boolean r6 = m6183(r6)
            if (r6 == 0) goto L7a
            goto L149
        Le9:
            java.lang.Class r4 = r3.getClass()
            java.util.List r4 = m6174(r4)
            java.util.Iterator r4 = r4.iterator()
        Lf5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L14a
            java.lang.Object r5 = r4.next()
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            java.lang.Class r6 = r5.getType()
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r6 = p000.ln0.m3626(r6, r7)
            if (r6 == 0) goto Lf5
            int r6 = r5.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 == 0) goto L118
            goto Lf5
        L118:
            java.lang.Object r5 = m6188(r3, r5)
            boolean r6 = r5 instanceof java.lang.String
            r7 = 0
            if (r6 == 0) goto L124
            java.lang.String r5 = (java.lang.String) r5
            goto L125
        L124:
            r5 = r7
        L125:
            if (r5 == 0) goto L12f
            java.lang.CharSequence r5 = p000.q02.m4660(r5)
            java.lang.String r7 = r5.toString()
        L12f:
            if (r7 != 0) goto L133
            java.lang.String r7 = ""
        L133:
            int r5 = r7.length()
            if (r5 != 0) goto L13a
            goto Lf5
        L13a:
            be0 r5 = p000.be0.f1670
            boolean r5 = r5.m941(r7, r7)
            if (r5 == 0) goto L143
            goto L149
        L143:
            boolean r5 = m6182(r7)
            if (r5 == 0) goto Lf5
        L149:
            r2 = 1
        L14a:
            if (r2 != 0) goto L17
            r0.add(r1)
            goto L17
        L151:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static java.util.ArrayList m6176(java.util.List r12) {
            be0 r0 = p000.be0.f1670
            boolean r0 = r0.m939()
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r12)
            return r0
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r12 = r12.iterator()
        L17:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto Le4
            java.lang.Object r1 = r12.next()
            r2 = 0
            if (r1 == 0) goto Ldd
            java.lang.String r3 = "~796896D9EC90C3E7F565E47CF96AEE6ECAB297EC32DB18E8427A65EEFF84845523AE5F9F05C4B8424B66BFF468C398FA2E71B8AA9B4B8984287D629DE63783"
            java.lang.String r3 = p000.jf0.m2957(r3)
            boolean r3 = m6186(r1, r3)
            if (r3 != 0) goto L32
            goto Ldd
        L32:
            java.lang.String r3 = "getId"
            java.util.List r3 = p000.AbstractC1021yh.m6896(r3)
            java.lang.String r4 = "id"
            java.util.List r4 = p000.AbstractC1021yh.m6896(r4)
            java.lang.String r3 = m6191(r1, r3, r4)
            boolean r4 = m6182(r3)
            r5 = 1
            if (r4 == 0) goto L4c
        L49:
            r2 = r5
            goto Ldd
        L4c:
            r4 = 0
            if (r3 == 0) goto L58
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            goto L59
        L58:
            r3 = r4
        L59:
            if (r3 != 0) goto L5d
            java.lang.String r3 = ""
        L5d:
            int r6 = r3.length()
            if (r6 != 0) goto L65
            goto Ldd
        L65:
            char[] r6 = new char[r5]
            r7 = 58
            r6[r2] = r7
            r7 = 6
            java.util.List r3 = p000.q02.m4682(r3, r6, r2, r7)
            int r6 = r3.size()
            r8 = 3
            if (r6 >= r8) goto L79
            goto Ldd
        L79:
            vh0 r6 = p000.vh0.f11270
            long r8 = p000.vh0.m6231()
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            r10 = 0
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 <= 0) goto L8a
            goto L8b
        L8a:
            r6 = r4
        L8b:
            boolean r8 = r3.isEmpty()
            if (r8 == 0) goto L92
            goto Ldd
        L92:
            java.util.Iterator r3 = r3.iterator()
        L96:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto Ldd
            java.lang.Object r8 = r3.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.CharSequence r8 = p000.q02.m4660(r8)
            java.lang.String r8 = r8.toString()
            int r9 = r8.length()
            if (r9 < r7) goto Ld1
            r9 = r2
        Lb1:
            int r10 = r8.length()
            if (r9 >= r10) goto Lc5
            char r10 = r8.charAt(r9)
            boolean r10 = java.lang.Character.isDigit(r10)
            if (r10 != 0) goto Lc2
            goto Ld1
        Lc2:
            int r9 = r9 + 1
            goto Lb1
        Lc5:
            if (r6 == 0) goto Ld3
            java.lang.String r9 = r6.toString()
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto Ld3
        Ld1:
            r8 = r2
            goto Ld9
        Ld3:
            be0 r9 = p000.be0.f1670
            boolean r8 = r9.m941(r8, r4)
        Ld9:
            if (r8 == 0) goto L96
            goto L49
        Ldd:
            if (r2 != 0) goto L17
            r0.add(r1)
            goto L17
        Le4:
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static int m6177(java.lang.Object r7) {
            r0 = 0
            if (r7 == 0) goto L90
            be0 r1 = p000.be0.f1670
            boolean r1 = r1.m939()
            if (r1 != 0) goto Ld
            goto L90
        Ld:
            java.lang.Class r1 = r7.getClass()
            java.util.List r1 = m6174(r1)
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L90
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            int r3 = r2.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)
            if (r3 != 0) goto L19
            java.lang.Class<java.util.List> r3 = java.util.List.class
            java.lang.Class r4 = r2.getType()
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 != 0) goto L3c
            goto L19
        L3c:
            java.lang.Object r3 = m6188(r7, r2)
            boolean r4 = r3 instanceof java.util.List
            if (r4 == 0) goto L47
            java.util.List r3 = (java.util.List) r3
            goto L48
        L47:
            r3 = 0
        L48:
            if (r3 != 0) goto L4b
            goto L19
        L4b:
            td0 r4 = m6178(r3)
            java.util.ArrayList r5 = r4.f10321
            boolean r6 = r4.f10322
            if (r6 == 0) goto L19
            boolean r4 = r4.f10323
            if (r4 != 0) goto L5a
            goto L19
        L5a:
            int r4 = r3.size()
            boolean r3 = m6195(r3, r5)
            if (r3 != 0) goto L89
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L73
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L73
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L73
            r2.set(r7, r3)     // Catch: java.lang.Throwable -> L73
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L73
            goto L7a
        L73:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L7a:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r6 = r2 instanceof p000.eo1
            if (r6 == 0) goto L81
            r2 = r3
        L81:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L19
        L89:
            int r2 = r5.size()
            int r4 = r4 - r2
            int r0 = r0 + r4
            goto L19
        L90:
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static p000.td0 m6178(java.util.List r17) {
            r1 = r17
            be0 r0 = p000.be0.f1670
            boolean r0 = r0.m939()
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L17
            td0 r0 = new td0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            r0.<init>(r4, r2, r3)
            return r0
        L17:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r0 = r1.size()
            r4.<init>(r0)
            java.util.Iterator r5 = r1.iterator()
            r0 = r3
            r6 = r0
        L26:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L1d5
            java.lang.Object r7 = r5.next()
            if (r7 != 0) goto L35
        L32:
            r8 = 0
            goto L100
        L35:
            java.lang.String r9 = "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC48734CE58758BC918F2FCD3BF51575EEC7F41A46914D80C06941"
            java.lang.String r10 = p000.jf0.m2957(r9)
            boolean r10 = m6186(r7, r10)
            if (r10 == 0) goto L44
            r8 = r7
            goto L100
        L44:
            java.lang.Class r10 = r7.getClass()
            zb0 r11 = new zb0
            r12 = 9
            r11.<init>(r12)
            c8 r12 = new c8
            r13 = 3
            r12.<init>(r11, r13)
            java.util.concurrent.ConcurrentHashMap r11 = p000.vd0.f11242
            java.lang.Object r10 = r11.computeIfAbsent(r10, r12)
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            if (r10 == 0) goto L72
            java.lang.Object r10 = m6188(r7, r10)
            if (r10 == 0) goto L72
            java.lang.String r11 = p000.jf0.m2957(r9)
            boolean r11 = m6186(r10, r11)
            if (r11 == 0) goto L72
            r8 = r10
            goto L100
        L72:
            java.lang.Class r10 = r7.getClass()
            java.util.List r10 = m6174(r10)
            java.util.Iterator r10 = r10.iterator()
        L7e:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L32
            java.lang.Object r11 = r10.next()
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            int r12 = r11.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isStatic(r12)
            if (r12 == 0) goto L96
        L94:
            r2 = 0
            goto Lf9
        L96:
            java.lang.Class r12 = r11.getType()
            java.lang.Class<java.lang.Object> r13 = java.lang.Object.class
            boolean r13 = p000.ln0.m3626(r12, r13)
            if (r13 != 0) goto Le9
            r12.getClass()
            boolean r13 = r12.isPrimitive()
            if (r13 != 0) goto L94
            boolean r13 = r12.isArray()
            if (r13 == 0) goto Lb2
            goto L94
        Lb2:
            if (r12 == 0) goto L94
            java.lang.String r13 = r12.getName()
            java.lang.String r14 = p000.jf0.m2957(r9)
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto Lc3
            goto Le9
        Lc3:
            java.lang.Class[] r13 = r12.getInterfaces()
            r13.getClass()
            int r14 = r13.length
            r15 = r3
        Lcc:
            if (r15 >= r14) goto Le3
            r16 = r13[r15]
            java.lang.String r8 = r16.getName()
            java.lang.String r2 = p000.jf0.m2957(r9)
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto Ldf
            goto Le9
        Ldf:
            int r15 = r15 + 1
            r2 = 1
            goto Lcc
        Le3:
            java.lang.Class r12 = r12.getSuperclass()
            r2 = 1
            goto Lb2
        Le9:
            java.lang.Object r2 = m6188(r7, r11)
            if (r2 == 0) goto L94
            java.lang.String r8 = p000.jf0.m2957(r9)
            boolean r8 = m6186(r2, r8)
            if (r8 == 0) goto L94
        Lf9:
            if (r2 == 0) goto Lfd
            r8 = r2
            goto L100
        Lfd:
            r2 = 1
            goto L7e
        L100:
            if (r8 != 0) goto L107
            r4.add(r7)
            goto L1d2
        L107:
            java.lang.String r0 = "~78A3D0A0088990942E83A71740186617157A6B7152A0CBE49DB7CBA683D5417FD817F1D014BBDDA343FC05171594CB3A30753677FC60778CCEFBF88097CF34DA018CF4383A5E3B9FD91FE03A77"
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r0 = m6186(r8, r0)
            if (r0 == 0) goto L1c6
            java.lang.Class r0 = r8.getClass()
            java.util.List r0 = m6174(r0)
            java.util.Iterator r0 = r0.iterator()
            r9 = 0
            r10 = r9
            r11 = 0
        L122:
            boolean r12 = r0.hasNext()
            r13 = 1
            if (r12 == 0) goto L14d
            java.lang.Object r12 = r0.next()
            r14 = r12
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            java.lang.Class<java.util.List> r15 = java.util.List.class
            java.lang.Class r2 = r14.getType()
            boolean r2 = r15.isAssignableFrom(r2)
            if (r2 == 0) goto L122
            int r2 = r14.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
            if (r2 != 0) goto L122
            if (r10 == 0) goto L14a
        L148:
            r11 = 0
            goto L150
        L14a:
            r11 = r12
            r10 = r13
            goto L122
        L14d:
            if (r10 != 0) goto L150
            goto L148
        L150:
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            if (r11 != 0) goto L155
            goto L1b2
        L155:
            java.lang.Object r0 = m6188(r8, r11)
            boolean r2 = r0 instanceof java.util.List
            if (r2 == 0) goto L161
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            goto L162
        L161:
            r2 = 0
        L162:
            if (r2 != 0) goto L165
            goto L1b2
        L165:
            td0 r0 = m6178(r2)
            java.util.ArrayList r10 = r0.f10321
            boolean r12 = r0.f10322
            if (r12 == 0) goto L1b2
            boolean r0 = r0.f10323
            if (r0 != 0) goto L174
            goto L1b2
        L174:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L180
            rd0 r0 = new rd0
            r0.<init>(r13, r13)
            goto L1b4
        L180:
            boolean r0 = m6195(r2, r10)
            if (r0 != 0) goto L1ac
            r11.setAccessible(r13)     // Catch: java.lang.Throwable -> L194
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L194
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L194
            r11.set(r8, r0)     // Catch: java.lang.Throwable -> L194
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L194
            goto L19b
        L194:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L19b:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r8 = r0 instanceof p000.eo1
            if (r8 == 0) goto L1a2
            r0 = r2
        L1a2:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1ab
            goto L1ac
        L1ab:
            r13 = r9
        L1ac:
            rd0 r0 = new rd0
            r0.<init>(r9, r13)
            goto L1b4
        L1b2:
            rd0 r0 = p000.rd0.f9340
        L1b4:
            if (r6 != 0) goto L1bd
            boolean r2 = r0.f9342
            if (r2 == 0) goto L1bb
            goto L1bd
        L1bb:
            r6 = r3
            goto L1be
        L1bd:
            r6 = 1
        L1be:
            boolean r0 = r0.f9341
            if (r0 != 0) goto L1d1
            r4.add(r7)
            goto L1d1
        L1c6:
            boolean r0 = m6184(r8)
            if (r0 == 0) goto L1ce
            r6 = 1
            goto L1d1
        L1ce:
            r4.add(r7)
        L1d1:
            r0 = 1
        L1d2:
            r2 = 1
            goto L26
        L1d5:
            if (r0 != 0) goto L1e8
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L1e8
            td0 r0 = new td0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r0.<init>(r2, r3, r3)
            return r0
        L1e8:
            td0 r0 = new td0
            r1 = 1
            r0.<init>(r4, r1, r6)
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static java.util.ArrayList m6179(java.util.List r11) {
            be0 r0 = p000.be0.f1670
            boolean r0 = r0.m939()
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r11)
            return r0
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r11, r1)
            r0.<init>(r1)
            java.util.Iterator r1 = r11.iterator()
        L1d:
            boolean r2 = r1.hasNext()
            r3 = 0
            r4 = 0
            if (r2 == 0) goto Led
            java.lang.Object r2 = r1.next()
            if (r2 != 0) goto L2d
            goto Le8
        L2d:
            java.lang.String r5 = "~78B71E7541C477E838C50BCD302E054C40CC02248AA0B9F3FD7794A79052902A0400E7382B432A21F9BF55FC8DD1C91F779AE1AD73D0213F7D3D3C563A611FB7F94B387B6050B751"
            java.lang.String r6 = p000.jf0.m2957(r5)
            boolean r6 = m6186(r2, r6)
            if (r6 == 0) goto L3a
            goto L87
        L3a:
            java.lang.Class r6 = r2.getClass()
            java.util.List r6 = m6174(r6)
            java.util.Iterator r6 = r6.iterator()
            r7 = r4
        L47:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L77
            java.lang.Object r8 = r6.next()
            r9 = r8
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            int r10 = r9.getModifiers()
            boolean r10 = java.lang.reflect.Modifier.isStatic(r10)
            if (r10 != 0) goto L47
            java.lang.Class r9 = r9.getType()
            java.lang.String r9 = r9.getName()
            java.lang.String r10 = p000.jf0.m2957(r5)
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L47
            if (r3 == 0) goto L74
        L72:
            r7 = r4
            goto L7a
        L74:
            r3 = 1
            r7 = r8
            goto L47
        L77:
            if (r3 != 0) goto L7a
            goto L72
        L7a:
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            if (r7 != 0) goto L80
            goto Le8
        L80:
            java.lang.Object r2 = m6188(r2, r7)
            if (r2 != 0) goto L87
            goto Le8
        L87:
            java.lang.String r3 = "~78C7222F2A96B599B7D83774C1C1E3514447820FDCE5C5B541FB7200C7B8B58C13E0601077DF20A4511CEFDB666A7C308F65EADD9E5D7F6FE5C50366CDF3E0BA29023913819125DDE52F1B8EB33897ECF5CA15C1"
            java.lang.String r3 = p000.jf0.m2957(r3)
            boolean r3 = m6186(r2, r3)
            if (r3 != 0) goto L94
            goto Le8
        L94:
            java.lang.Class r3 = r2.getClass()
            zb0 r5 = new zb0
            r6 = 11
            r5.<init>(r6)
            c8 r6 = new c8
            r7 = 4
            r6.<init>(r5, r7)
            java.util.concurrent.ConcurrentHashMap r5 = p000.vd0.f11243
            java.lang.Object r3 = r5.computeIfAbsent(r3, r6)
            r3.getClass()
            sd0 r3 = (p000.sd0) r3
            ud0 r5 = new ud0
            java.lang.reflect.Field r6 = r3.f9843
            java.lang.String r6 = m6189(r2, r6)
            java.lang.String r7 = ""
            if (r6 != 0) goto Lbd
            r6 = r7
        Lbd:
            java.lang.reflect.Field r8 = r3.f9844
            java.lang.String r8 = m6189(r2, r8)
            if (r8 != 0) goto Lc6
            r8 = r7
        Lc6:
            java.lang.reflect.Field r3 = r3.f9845
            java.lang.String r2 = m6189(r2, r3)
            if (r2 != 0) goto Lcf
            goto Ld0
        Lcf:
            r7 = r2
        Ld0:
            r5.<init>(r6, r8, r7)
            int r2 = r6.length()
            if (r2 <= 0) goto Lda
            goto Le7
        Lda:
            int r2 = r8.length()
            if (r2 <= 0) goto Le1
            goto Le7
        Le1:
            int r2 = r7.length()
            if (r2 <= 0) goto Le8
        Le7:
            r4 = r5
        Le8:
            r0.add(r4)
            goto L1d
        Led:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lf4
            goto L144
        Lf4:
            java.util.Iterator r1 = r0.iterator()
        Lf8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L144
            java.lang.Object r2 = r1.next()
            ud0 r2 = (p000.ud0) r2
            if (r2 == 0) goto Lf8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r11 = r11.iterator()
        L10f:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L143
            java.lang.Object r2 = r11.next()
            int r5 = r3 + 1
            if (r3 < 0) goto L13f
            java.lang.Object r3 = r0.get(r3)
            ud0 r3 = (p000.ud0) r3
            if (r3 == 0) goto L13a
            be0 r6 = p000.be0.f1670
            java.lang.String r7 = r3.f10701
            java.lang.String r8 = r3.f10702
            boolean r6 = r6.m941(r7, r8)
            if (r6 != 0) goto L13d
            java.lang.String r3 = r3.f10703
            boolean r3 = m6182(r3)
            if (r3 == 0) goto L13a
            goto L13d
        L13a:
            r1.add(r2)
        L13d:
            r3 = r5
            goto L10f
        L13f:
            p000.AbstractC1021yh.m6917()
            throw r4
        L143:
            return r1
        L144:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L150
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r11)
            return r0
        L150:
            return r4
    }

    /* JADX INFO: renamed from: η */
    public static java.util.ArrayList m6180(java.util.List r5) {
            be0 r0 = p000.be0.f1670
            boolean r0 = r0.m939()
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r5)
            return r0
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L17:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r5.next()
            xd0 r2 = m6192(r1)
            if (r2 != 0) goto L29
            r2 = 0
            goto L33
        L29:
            be0 r3 = p000.be0.f1670
            java.lang.String r4 = r2.f12133
            java.lang.String r2 = r2.f12134
            boolean r2 = r3.m941(r4, r2)
        L33:
            if (r2 != 0) goto L17
            r0.add(r1)
            goto L17
        L39:
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static java.lang.Object m6181(java.lang.Object r4) {
            if (r4 != 0) goto L3
            goto L38
        L3:
            java.lang.String r0 = "~79380C0D8C98F945BB08C5D5DB5DF1EAD9B59028068ACB54724044B8894FBBCB0991F2748ACD993981847A"
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r0 = m6186(r4, r0)
            if (r0 != 0) goto L3e
            java.lang.String r0 = "~7954D7E14DB7341B6A011C494738772667DB63664E455DD5DA57E5C48FD7B3E094AA60E23CF26DE3BAC25A60400A2726"
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r0 = m6186(r4, r0)
            if (r0 == 0) goto L1c
            goto L3e
        L1c:
            java.lang.Class r0 = r4.getClass()
            zb0 r1 = new zb0
            r2 = 14
            r1.<init>(r2)
            c8 r2 = new c8
            r3 = 8
            r2.<init>(r1, r3)
            java.util.concurrent.ConcurrentHashMap r1 = p000.vd0.f11241
            java.lang.Object r0 = r1.computeIfAbsent(r0, r2)
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            if (r0 != 0) goto L3a
        L38:
            r4 = 0
            return r4
        L3a:
            java.lang.Object r4 = m6188(r4, r0)
        L3e:
            return r4
    }

    /* JADX INFO: renamed from: ι */
    public static boolean m6182(java.lang.String r5) {
            r0 = 0
            if (r5 == 0) goto Lc
            java.lang.CharSequence r5 = p000.q02.m4660(r5)
            java.lang.String r5 = r5.toString()
            goto Ld
        Lc:
            r5 = r0
        Ld:
            if (r5 != 0) goto L11
            java.lang.String r5 = ""
        L11:
            int r1 = r5.length()
            if (r1 != 0) goto L18
            goto L32
        L18:
            vh0 r1 = p000.vh0.f11270
            long r1 = p000.vh0.m6233(r5)
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L32
            be0 r5 = p000.be0.f1670
            java.lang.String r1 = java.lang.String.valueOf(r1)
            boolean r5 = r5.m941(r1, r0)
            if (r5 == 0) goto L32
            r5 = 1
            return r5
        L32:
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: κ */
    public static boolean m6183(java.lang.Object r4) {
            vh0 r0 = p000.vh0.f11270
            th0 r0 = p000.vh0.m6217(r4)
            if (r0 == 0) goto L1c
            long r0 = r0.f10375
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1c
            be0 r4 = p000.be0.f1670
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1 = 0
            boolean r4 = r4.m941(r0, r1)
            return r4
        L1c:
            java.lang.String r0 = "getConversationId"
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
            java.lang.String r1 = "conversationId"
            java.util.List r1 = p000.AbstractC1021yh.m6896(r1)
            java.lang.String r4 = m6191(r4, r0, r1)
            boolean r4 = m6182(r4)
            return r4
    }

    /* JADX INFO: renamed from: λ */
    public static boolean m6184(java.lang.Object r3) {
            java.lang.String r0 = "~7954D7E14DB7341B6A011C494738772667DB63664E455DD5DA57E5C48FD7B3E094AA60E23CF26DE3BAC25A60400A2726"
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r0 = m6186(r3, r0)
            if (r0 == 0) goto L11
            boolean r3 = m6185(r3)
            return r3
        L11:
            java.lang.String r0 = "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56F83D74BBFAB7CBEE7B406BF862183B85AF1AA5D7AE7DCC2D4430DE0A216FBE"
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r0 = m6186(r3, r0)
            if (r0 == 0) goto L3b
            p000.vh0.m6217(r3)
            java.lang.String r0 = "getConversationId"
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
            java.lang.String r1 = "mConversationId"
            java.lang.String r2 = "conversationId"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r1)
            java.lang.String r3 = m6191(r3, r0, r1)
            boolean r3 = m6182(r3)
            return r3
        L3b:
            java.lang.Object r0 = m6181(r3)
            if (r0 != 0) goto L42
            goto L4b
        L42:
            if (r0 != r3) goto L45
            goto L4b
        L45:
            xd0 r3 = m6194(r0)
            if (r3 != 0) goto L4d
        L4b:
            r3 = 0
            return r3
        L4d:
            be0 r0 = p000.be0.f1670
            java.lang.String r1 = r3.f12133
            java.lang.String r3 = r3.f12134
            boolean r3 = r0.m941(r1, r3)
            return r3
    }

    /* JADX INFO: renamed from: μ */
    public static boolean m6185(java.lang.Object r3) {
            java.lang.String r0 = "getUid"
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
            java.lang.String r1 = "uid"
            java.util.List r1 = p000.AbstractC1021yh.m6896(r1)
            java.lang.String r0 = m6191(r3, r0, r1)
            java.lang.String r1 = "getSecUid"
            java.util.List r1 = p000.AbstractC1021yh.m6896(r1)
            java.lang.String r2 = "secUid"
            java.util.List r2 = p000.AbstractC1021yh.m6896(r2)
            java.lang.String r3 = m6191(r3, r1, r2)
            be0 r1 = p000.be0.f1670
            boolean r3 = r1.m941(r0, r3)
            return r3
    }

    /* JADX INFO: renamed from: ν */
    public static boolean m6186(java.lang.Object r4, java.lang.String r5) {
            java.lang.Class r4 = r4.getClass()
        L4:
            r0 = 0
            if (r4 == 0) goto L32
            java.lang.String r1 = r4.getName()
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L12
            goto L28
        L12:
            java.lang.Class[] r1 = r4.getInterfaces()
            r1.getClass()
            int r2 = r1.length
        L1a:
            if (r0 >= r2) goto L2d
            r3 = r1[r0]
            java.lang.String r3 = r3.getName()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L2a
        L28:
            r4 = 1
            return r4
        L2a:
            int r0 = r0 + 1
            goto L1a
        L2d:
            java.lang.Class r4 = r4.getSuperclass()
            goto L4
        L32:
            return r0
    }

    /* JADX INFO: renamed from: ξ */
    public static java.lang.String m6187(java.lang.Object r2) {
            boolean r0 = r2 instanceof java.lang.CharSequence
            r1 = 0
            if (r0 == 0) goto L8
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            goto L9
        L8:
            r2 = r1
        L9:
            if (r2 == 0) goto L1a
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L1a
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            goto L1b
        L1a:
            r2 = r1
        L1b:
            if (r2 != 0) goto L1f
            java.lang.String r2 = ""
        L1f:
            int r0 = r2.length()
            if (r0 <= 0) goto L2e
            java.lang.String r0 = "null"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 != 0) goto L2e
            return r2
        L2e:
            return r1
    }

    /* JADX INFO: renamed from: ο */
    public static java.lang.Object m6188(java.lang.Object r4, java.lang.reflect.Field r5) {
            r0 = 1
            r5.setAccessible(r0)     // Catch: java.lang.Throwable -> L9
            java.lang.Object r5 = r5.get(r4)     // Catch: java.lang.Throwable -> L9
            goto L10
        L9:
            r5 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r5)
            r5 = r0
        L10:
            java.lang.Throwable r0 = p000.fo1.m2190(r5)
            if (r0 == 0) goto L2b
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "field read failed type="
            java.lang.String r2 = ": "
            java.lang.String r3 = "rc07e5468ae05b71f"
            p000.AbstractC0602nx.m4144(r1, r4, r2, r0, r3)
        L2b:
            boolean r4 = r5 instanceof p000.eo1
            if (r4 == 0) goto L30
            r5 = 0
        L30:
            return r5
    }

    /* JADX INFO: renamed from: π */
    public static java.lang.String m6189(java.lang.Object r0, java.lang.reflect.Field r1) {
            if (r1 == 0) goto L1f
            java.lang.Object r0 = m6188(r0, r1)
            if (r0 != 0) goto L9
            goto L1f
        L9:
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L1a
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "0"
            boolean r1 = p000.ln0.m3626(r0, r1)
            if (r1 != 0) goto L1f
            return r0
        L1a:
            java.lang.String r0 = m6187(r0)
            return r0
        L1f:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ρ */
    public static java.lang.String m6190(java.lang.Object r0, java.lang.reflect.Field r1) {
            if (r1 == 0) goto Lb
            java.lang.Object r0 = m6188(r0, r1)
            java.lang.String r0 = m6187(r0)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: σ */
    public static java.lang.String m6191(java.lang.Object r6, java.util.List r7, java.util.List r8) {
            java.util.Iterator r7 = r7.iterator()
        L4:
            boolean r0 = r7.hasNext()
            r1 = 0
            if (r0 == 0) goto L81
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Class r2 = r6.getClass()
            zb0 r3 = new zb0
            r4 = 12
            r3.<init>(r4)
            c8 r4 = new c8
            r5 = 6
            r4.<init>(r3, r5)
            java.util.concurrent.ConcurrentHashMap r3 = p000.vd0.f11240
            java.lang.Object r2 = r3.computeIfAbsent(r2, r4)
            r2.getClass()
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L31:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5f
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r5 = r4.getName()
            boolean r5 = p000.ln0.m3626(r5, r0)
            if (r5 == 0) goto L31
            java.lang.Class[] r5 = r4.getParameterTypes()
            r5.getClass()
            int r5 = r5.length
            if (r5 != 0) goto L31
            java.lang.Class<java.lang.CharSequence> r5 = java.lang.CharSequence.class
            java.lang.Class r4 = r4.getReturnType()
            boolean r4 = r5.isAssignableFrom(r4)
            if (r4 == 0) goto L31
            goto L60
        L5f:
            r3 = r1
        L60:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L4
            r0 = 1
            r3.setAccessible(r0)     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r3.invoke(r6, r1)     // Catch: java.lang.Throwable -> L6d
            goto L74
        L6d:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L74:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L79
            goto L7a
        L79:
            r1 = r0
        L7a:
            java.lang.String r0 = m6187(r1)
            if (r0 == 0) goto L4
            return r0
        L81:
            java.util.Iterator r7 = r8.iterator()
        L85:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lc5
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Class r0 = r6.getClass()
            java.util.List r0 = m6174(r0)
            java.util.Iterator r0 = r0.iterator()
        L9d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.String r3 = r3.getName()
            boolean r3 = p000.ln0.m3626(r3, r8)
            if (r3 == 0) goto L9d
            goto Lb6
        Lb5:
            r2 = r1
        Lb6:
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            if (r2 == 0) goto L85
            java.lang.Object r8 = m6188(r6, r2)
            java.lang.String r8 = m6187(r8)
            if (r8 == 0) goto L85
            return r8
        Lc5:
            return r1
    }

    /* JADX INFO: renamed from: τ */
    public static p000.xd0 m6192(java.lang.Object r4) {
            if (r4 != 0) goto L3
            goto L36
        L3:
            java.lang.Object r0 = m6181(r4)
            if (r0 == 0) goto Le
            xd0 r4 = m6194(r0)
            return r4
        Le:
            xd0 r0 = m6193(r4)
            if (r0 != 0) goto L3d
            java.lang.Class r0 = r4.getClass()
            zb0 r1 = new zb0
            r2 = 8
            r1.<init>(r2)
            c8 r2 = new c8
            r3 = 2
            r2.<init>(r1, r3)
            java.util.concurrent.ConcurrentHashMap r1 = p000.vd0.f11244
            java.lang.Object r0 = r1.computeIfAbsent(r0, r2)
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            if (r0 != 0) goto L30
            goto L36
        L30:
            java.lang.Object r4 = m6188(r4, r0)
            if (r4 != 0) goto L38
        L36:
            r4 = 0
            return r4
        L38:
            xd0 r4 = m6193(r4)
            return r4
        L3d:
            return r0
    }

    /* JADX INFO: renamed from: υ */
    public static p000.xd0 m6193(java.lang.Object r13) {
            java.lang.Class r0 = r13.getClass()
            zb0 r1 = new zb0
            r2 = 13
            r1.<init>(r2)
            c8 r2 = new c8
            r3 = 7
            r2.<init>(r1, r3)
            java.util.concurrent.ConcurrentHashMap r1 = p000.vd0.f11243
            java.lang.Object r0 = r1.computeIfAbsent(r0, r2)
            r0.getClass()
            sd0 r0 = (p000.sd0) r0
            java.lang.reflect.Field r1 = r0.f9843
            java.lang.String r1 = m6190(r13, r1)
            java.lang.reflect.Field r2 = r0.f9844
            java.lang.String r2 = m6190(r13, r2)
            r3 = 0
            if (r1 == 0) goto L31
            boolean r4 = p000.q02.m4671(r1)
            if (r4 == 0) goto L3b
        L31:
            if (r2 == 0) goto L9d
            boolean r4 = p000.q02.m4671(r2)
            if (r4 == 0) goto L3b
            goto L9d
        L3b:
            java.lang.reflect.Field r4 = r0.f9848
            java.lang.String r4 = m6190(r13, r4)
            java.lang.reflect.Field r5 = r0.f9849
            java.lang.String r5 = m6190(r13, r5)
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            ss1 r4 = p000.AbstractC0312g7.m2232(r4)
            java.util.Iterator r4 = r4.iterator()
        L53:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L6a
            java.lang.Object r5 = r4.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L53
            boolean r6 = p000.q02.m4671(r6)
            if (r6 == 0) goto L69
            goto L53
        L69:
            r3 = r5
        L6a:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = ""
            if (r3 != 0) goto L72
            r12 = r4
            goto L73
        L72:
            r12 = r3
        L73:
            xd0 r5 = new xd0
            if (r1 != 0) goto L79
            r8 = r4
            goto L7a
        L79:
            r8 = r1
        L7a:
            if (r2 != 0) goto L7e
            r9 = r4
            goto L7f
        L7e:
            r9 = r2
        L7f:
            java.lang.reflect.Field r1 = r0.f9846
            java.lang.String r1 = m6190(r13, r1)
            if (r1 != 0) goto L89
            r10 = r4
            goto L8a
        L89:
            r10 = r1
        L8a:
            java.lang.reflect.Field r0 = r0.f9847
            java.lang.String r13 = m6190(r13, r0)
            if (r13 != 0) goto L94
            r11 = r4
            goto L95
        L94:
            r11 = r13
        L95:
            long r6 = java.lang.System.currentTimeMillis()
            r5.<init>(r6, r8, r9, r10, r11, r12)
            return r5
        L9d:
            return r3
    }

    /* JADX INFO: renamed from: φ */
    public static p000.xd0 m6194(java.lang.Object r12) {
            java.lang.String r0 = "getUid"
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
            java.lang.String r1 = "uid"
            java.util.List r1 = p000.AbstractC1021yh.m6896(r1)
            java.lang.String r0 = m6191(r12, r0, r1)
            java.lang.String r1 = "getSecUid"
            java.util.List r1 = p000.AbstractC1021yh.m6896(r1)
            java.lang.String r2 = "secUid"
            java.util.List r2 = p000.AbstractC1021yh.m6896(r2)
            java.lang.String r1 = m6191(r12, r1, r2)
            r2 = 0
            if (r0 == 0) goto L29
            boolean r3 = p000.q02.m4671(r0)
            if (r3 == 0) goto L33
        L29:
            if (r1 == 0) goto Lc9
            boolean r3 = p000.q02.m4671(r1)
            if (r3 == 0) goto L33
            goto Lc9
        L33:
            java.lang.String r3 = "getRemarkName"
            java.util.List r3 = p000.AbstractC1021yh.m6896(r3)
            java.lang.String r4 = "remarkName"
            java.util.List r4 = p000.AbstractC1021yh.m6896(r4)
            java.lang.String r3 = m6191(r12, r3, r4)
            java.lang.String r4 = "getNickname"
            java.lang.String r5 = "getNickName"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.util.List r4 = p000.AbstractC1021yh.m6897(r4)
            java.lang.String r5 = "nickname"
            java.lang.String r6 = "nickName"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            java.util.List r5 = p000.AbstractC1021yh.m6897(r5)
            java.lang.String r4 = m6191(r12, r4, r5)
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            ss1 r3 = p000.AbstractC0312g7.m2232(r3)
            java.util.Iterator r3 = r3.iterator()
        L6b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L82
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L6b
            boolean r5 = p000.q02.m4671(r5)
            if (r5 == 0) goto L81
            goto L6b
        L81:
            r2 = r4
        L82:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = ""
            if (r2 != 0) goto L8a
            r11 = r3
            goto L8b
        L8a:
            r11 = r2
        L8b:
            xd0 r4 = new xd0
            if (r0 != 0) goto L91
            r7 = r3
            goto L92
        L91:
            r7 = r0
        L92:
            if (r1 != 0) goto L96
            r8 = r3
            goto L97
        L96:
            r8 = r1
        L97:
            java.lang.String r0 = "getUniqueId"
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
            java.lang.String r1 = "uniqueId"
            java.util.List r1 = p000.AbstractC1021yh.m6896(r1)
            java.lang.String r0 = m6191(r12, r0, r1)
            if (r0 != 0) goto Lab
            r9 = r3
            goto Lac
        Lab:
            r9 = r0
        Lac:
            java.lang.String r0 = "getShortId"
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
            java.lang.String r1 = "shortId"
            java.util.List r1 = p000.AbstractC1021yh.m6896(r1)
            java.lang.String r12 = m6191(r12, r0, r1)
            if (r12 != 0) goto Lc0
            r10 = r3
            goto Lc1
        Lc0:
            r10 = r12
        Lc1:
            long r5 = java.lang.System.currentTimeMillis()
            r4.<init>(r5, r7, r8, r9, r10, r11)
            return r4
        Lc9:
            return r2
    }

    /* JADX INFO: renamed from: χ */
    public static boolean m6195(java.util.List r1, java.util.ArrayList r2) {
            p000.h62.m2391(r1)     // Catch: java.lang.Throwable -> Lc
            r1.clear()     // Catch: java.lang.Throwable -> Lc
            r1.addAll(r2)     // Catch: java.lang.Throwable -> Lc
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lc
            goto L13
        Lc:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L13:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r0 = r1 instanceof p000.eo1
            if (r0 == 0) goto L1a
            r1 = r2
        L1a:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
    }

    /* JADX INFO: renamed from: ψ */
    public static p000.sd0 m6196(java.lang.Class r8) {
            java.util.List r8 = m6174(r8)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        Ld:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r8.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r2 = r1.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
            r3 = 0
            if (r2 == 0) goto L25
            goto L30
        L25:
            java.lang.String r2 = m6197(r1)
            if (r2 == 0) goto L30
            l91 r3 = new l91
            r3.<init>(r2, r1)
        L30:
            if (r3 == 0) goto Ld
            r0.add(r3)
            goto Ld
        L36:
            java.util.Map r8 = p000.ex0.m1974(r0)
            sd0 r0 = new sd0
            java.lang.String r1 = "uid"
            java.lang.Object r1 = r8.get(r1)
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            if (r1 != 0) goto L58
            java.lang.String r1 = "user_id"
            java.lang.Object r1 = r8.get(r1)
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            if (r1 != 0) goto L58
            java.lang.String r1 = "rich_sug_user_id"
            java.lang.Object r1 = r8.get(r1)
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L58:
            java.lang.String r2 = "sec_uid"
            java.lang.Object r2 = r8.get(r2)
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            if (r2 != 0) goto L6a
            java.lang.String r2 = "rich_sug_sec_uid"
            java.lang.Object r2 = r8.get(r2)
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
        L6a:
            java.lang.String r3 = "conversation_id"
            java.lang.Object r3 = r8.get(r3)
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.String r4 = "unique_id"
            java.lang.Object r4 = r8.get(r4)
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.String r5 = "short_id"
            java.lang.Object r5 = r8.get(r5)
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            if (r5 != 0) goto L8c
            java.lang.String r5 = "rich_sug_short_id"
            java.lang.Object r5 = r8.get(r5)
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
        L8c:
            java.lang.String r6 = "remark_name"
            java.lang.Object r6 = r8.get(r6)
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            if (r6 != 0) goto L9e
            java.lang.String r6 = "rich_sug_remarkname"
            java.lang.Object r6 = r8.get(r6)
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
        L9e:
            java.lang.String r7 = "nickname"
            java.lang.Object r7 = r8.get(r7)
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            if (r7 != 0) goto Lb1
            java.lang.String r7 = "rich_sug_nickname"
            java.lang.Object r8 = r8.get(r7)
            r7 = r8
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
        Lb1:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    /* JADX INFO: renamed from: ω */
    public static java.lang.String m6197(java.lang.reflect.Field r10) {
            java.lang.annotation.Annotation[] r10 = r10.getDeclaredAnnotations()
            r10.getClass()
            int r0 = r10.length
            r1 = 0
            r2 = r1
        La:
            r3 = 0
            if (r2 >= r0) goto L27
            r4 = r10[r2]
            wf r5 = p000.ln0.m3599(r4)
            java.lang.Class r5 = p000.ln0.m3604(r5)
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "com.google.gson.annotations.SerializedName"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L24
            goto L28
        L24:
            int r2 = r2 + 1
            goto La
        L27:
            r4 = r3
        L28:
            if (r4 != 0) goto L2b
            goto L72
        L2b:
            wf r10 = p000.ln0.m3599(r4)
            java.lang.Class r10 = p000.ln0.m3604(r10)
            java.lang.reflect.Method[] r10 = r10.getDeclaredMethods()
            r10.getClass()
            int r0 = r10.length
            r2 = r1
            r5 = r3
        L3d:
            r6 = 1
            if (r1 >= r0) goto L6d
            r7 = r10[r1]
            java.lang.String r8 = r7.getName()
            java.lang.String r9 = "value"
            boolean r8 = p000.ln0.m3626(r8, r9)
            if (r8 == 0) goto L6a
            java.lang.Class[] r8 = r7.getParameterTypes()
            r8.getClass()
            int r8 = r8.length
            if (r8 != 0) goto L6a
            java.lang.Class<java.lang.CharSequence> r8 = java.lang.CharSequence.class
            java.lang.Class r9 = r7.getReturnType()
            boolean r8 = r8.isAssignableFrom(r9)
            if (r8 == 0) goto L6a
            if (r2 == 0) goto L68
        L66:
            r5 = r3
            goto L70
        L68:
            r2 = r6
            r5 = r7
        L6a:
            int r1 = r1 + 1
            goto L3d
        L6d:
            if (r2 != 0) goto L70
            goto L66
        L70:
            if (r5 != 0) goto L73
        L72:
            return r3
        L73:
            r5.setAccessible(r6)     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r10 = r5.invoke(r4, r3)     // Catch: java.lang.Throwable -> L7b
            goto L82
        L7b:
            r10 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r10)
            r10 = r0
        L82:
            boolean r0 = r10 instanceof p000.eo1
            if (r0 == 0) goto L87
            goto L88
        L87:
            r3 = r10
        L88:
            java.lang.String r10 = m6187(r3)
            return r10
    }
}
