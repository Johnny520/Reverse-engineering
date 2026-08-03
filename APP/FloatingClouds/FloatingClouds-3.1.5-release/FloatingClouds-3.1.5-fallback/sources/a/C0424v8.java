package a;

/* JADX INFO: renamed from: a.v8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0424v8 implements io.github.libxposed.api.XposedInterface.Hooker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f735a;

    public /* synthetic */ C0424v8() {
            r1 = this;
            r0 = 6
            r1.f735a = r0
            r1.<init>()
            return
    }

    public /* synthetic */ C0424v8(top.mmjz.floatingclouds.plugin.IPlugin r1, int r2) {
            r0 = this;
            r0.f735a = r2
            r0.<init>()
            return
    }

    public final java.lang.Object intercept(io.github.libxposed.api.XposedInterface.Chain r15) {
            r14 = this;
            r0 = 1
            java.lang.String r1 = "getArgs(...)"
            r2 = 0
            r3 = 0
            java.lang.String r4 = "chain"
            int r5 = r14.f735a
            switch(r5) {
                case 0: goto L2dd;
                case 1: goto L29d;
                case 2: goto L260;
                case 3: goto L223;
                case 4: goto L1df;
                case 5: goto L19d;
                default: goto Lc;
            }
        Lc:
            a.C0193i9.e(r15, r4)
            java.lang.Object r1 = r15.proceed()
            a.K3$a r4 = a.K3.f148a
            r4.getClass()
            a.jc r4 = a.K3.a.i()
            boolean r4 = r4.c
            if (r4 == 0) goto L39
            java.util.List r5 = r15.getArgs()
            java.lang.Object r5 = r5.get(r0)
            boolean r6 = r5 instanceof byte[]
            if (r6 == 0) goto L2f
            byte[] r5 = (byte[]) r5
            goto L30
        L2f:
            r5 = r3
        L30:
            if (r5 == 0) goto L39
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r7 = a.V2.f298a
            r6.<init>(r5, r7)
        L39:
            java.util.List r15 = r15.getArgs()
            java.lang.Object r15 = r15.get(r2)
            boolean r5 = r15 instanceof java.lang.String
            if (r5 == 0) goto L48
            java.lang.String r15 = (java.lang.String) r15
            goto L49
        L48:
            r15 = r3
        L49:
            if (r15 != 0) goto L4d
            java.lang.String r15 = ""
        L4d:
            if (r1 == 0) goto L51
            r5 = r0
            goto L52
        L51:
            r5 = r2
        L52:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "opened="
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "hook db"
            java.lang.Object[] r5 = new java.lang.Object[]{r6, r15, r5}
            a.C0282n9.m(r5)
            int r5 = r15.length()
            if (r5 <= 0) goto L19c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.G4> r5 = a.xh.f764a
            a.G4 r6 = new a.G4
            r6.<init>()
            r6.f96a = r1
            r5.put(r15, r6)
            if (r4 == 0) goto L19c
            java.lang.String r4 = "EnMicroMsg"
            boolean r6 = a.Be.I(r15, r4, r2)
            if (r6 == 0) goto L19c
            java.lang.String r6 = "columns user="
            boolean r4 = a.Be.I(r15, r4, r2)
            if (r4 != 0) goto L8f
            goto L19c
        L8f:
            java.lang.Object r4 = r5.get(r15)
            a.G4 r4 = (a.G4) r4
            if (r4 == 0) goto L9a
            java.lang.Object r4 = r4.f96a
            goto L9b
        L9a:
            r4 = r3
        L9b:
            java.lang.String r5 = "FCloud_DB"
            if (r4 != 0) goto Laa
            java.lang.String r0 = "Store has no DB instance for "
            java.lang.String r15 = r0.concat(r15)
            android.util.Log.e(r5, r15)
            goto L19c
        Laa:
            java.lang.String r15 = "SELECT username, conRemark, nickname, alias FROM rcontact"
            android.database.Cursor r15 = a.xh.a.a(r4, r15, r3)     // Catch: java.lang.Throwable -> Lb9
            if (r15 != 0) goto Lbc
            java.lang.String r15 = "rawQuery returned null cursor"
            android.util.Log.e(r5, r15)     // Catch: java.lang.Throwable -> Lb9
            goto L19c
        Lb9:
            r15 = move-exception
            goto L187
        Lbc:
            java.lang.String r4 = "username"
            int r4 = r15.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L180
            java.lang.String r7 = "conRemark"
            int r7 = r15.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L180
            java.lang.String r8 = "nickname"
            int r8 = r15.getColumnIndex(r8)     // Catch: java.lang.Throwable -> L180
            java.lang.String r9 = "alias"
            int r9 = r15.getColumnIndex(r9)     // Catch: java.lang.Throwable -> L180
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L180
            r10.<init>(r6)     // Catch: java.lang.Throwable -> L180
            r10.append(r4)     // Catch: java.lang.Throwable -> L180
            java.lang.String r6 = " remark="
            r10.append(r6)     // Catch: java.lang.Throwable -> L180
            r10.append(r7)     // Catch: java.lang.Throwable -> L180
            java.lang.String r6 = " nick="
            r10.append(r6)     // Catch: java.lang.Throwable -> L180
            r10.append(r8)     // Catch: java.lang.Throwable -> L180
            java.lang.String r6 = " alias="
            r10.append(r6)     // Catch: java.lang.Throwable -> L180
            r10.append(r9)     // Catch: java.lang.Throwable -> L180
            java.lang.String r6 = r10.toString()     // Catch: java.lang.Throwable -> L180
            android.util.Log.e(r5, r6)     // Catch: java.lang.Throwable -> L180
        Lfb:
            boolean r6 = r15.moveToNext()     // Catch: java.lang.Throwable -> L180
            if (r6 == 0) goto L161
            if (r4 < 0) goto L108
            java.lang.String r6 = r15.getString(r4)     // Catch: java.lang.Throwable -> Lfb
            goto L109
        L108:
            r6 = r3
        L109:
            if (r6 == 0) goto Lfb
            boolean r10 = a.Be.P(r6)     // Catch: java.lang.Throwable -> Lfb
            if (r10 == 0) goto L112
            goto Lfb
        L112:
            if (r7 < 0) goto L119
            java.lang.String r10 = r15.getString(r7)     // Catch: java.lang.Throwable -> Lfb
            goto L11a
        L119:
            r10 = r3
        L11a:
            if (r8 < 0) goto L121
            java.lang.String r11 = r15.getString(r8)     // Catch: java.lang.Throwable -> Lfb
            goto L122
        L121:
            r11 = r3
        L122:
            if (r9 < 0) goto L129
            java.lang.String r12 = r15.getString(r9)     // Catch: java.lang.Throwable -> Lfb
            goto L12a
        L129:
            r12 = r3
        L12a:
            if (r10 == 0) goto L139
            boolean r13 = a.Be.P(r10)     // Catch: java.lang.Throwable -> Lfb
            if (r13 != 0) goto L133
            goto L134
        L133:
            r10 = r3
        L134:
            if (r10 != 0) goto L137
            goto L139
        L137:
            r12 = r10
            goto L151
        L139:
            if (r11 == 0) goto L142
            boolean r10 = a.Be.P(r11)     // Catch: java.lang.Throwable -> Lfb
            if (r10 != 0) goto L142
            goto L143
        L142:
            r11 = r3
        L143:
            if (r11 != 0) goto L150
            if (r12 == 0) goto L14e
            boolean r10 = a.Be.P(r12)     // Catch: java.lang.Throwable -> Lfb
            if (r10 != 0) goto L14e
            goto L151
        L14e:
            r12 = r3
            goto L151
        L150:
            r12 = r11
        L151:
            if (r12 == 0) goto Lfb
            boolean r10 = a.Be.P(r12)     // Catch: java.lang.Throwable -> Lfb
            if (r10 == 0) goto L15a
            goto Lfb
        L15a:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r10 = a.xh.b     // Catch: java.lang.Throwable -> Lfb
            r10.put(r6, r12)     // Catch: java.lang.Throwable -> Lfb
            int r2 = r2 + r0
            goto Lfb
        L161:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L180
            r15.close()     // Catch: java.lang.Throwable -> Lb9
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb9
            r15.<init>()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r0 = "loaded "
            r15.append(r0)     // Catch: java.lang.Throwable -> Lb9
            r15.append(r2)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r0 = " contacts into cache"
            r15.append(r0)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r15 = r15.toString()     // Catch: java.lang.Throwable -> Lb9
            android.util.Log.e(r5, r15)     // Catch: java.lang.Throwable -> Lb9
            goto L19c
        L180:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L182
        L182:
            r2 = move-exception
            a.C0435w1.e(r15, r0)     // Catch: java.lang.Throwable -> Lb9
            throw r2     // Catch: java.lang.Throwable -> Lb9
        L187:
            java.lang.String r15 = r15.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "loadAllContacts failed: "
            r0.<init>(r2)
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            android.util.Log.e(r5, r15)
        L19c:
            return r1
        L19d:
            a.C0193i9.e(r15, r4)
            boolean r0 = a.R8.k()
            if (r0 != 0) goto L1ab
            java.lang.Object r15 = r15.proceed()
            goto L1de
        L1ab:
            java.util.List r0 = r15.getArgs()
            a.C0193i9.d(r0, r1)
            java.lang.Object r0 = a.C0383t3.o0(r0, r2)
            if (r0 != 0) goto L1bd
            java.lang.Object r15 = r15.proceed()
            goto L1de
        L1bd:
            java.lang.String r0 = a.C0055ah.a(r0)
            if (r0 == 0) goto L1da
            java.util.concurrent.ExecutorService r1 = a.fh.G
            boolean r1 = a.fh.a.a(r0)
            if (r1 == 0) goto L1da
            java.lang.String r15 = "intercept incoming call manager for wxid="
            java.lang.String r15 = r15.concat(r0)
            a.R8.r(r15)
            a.C0074bh.g(r0)
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            goto L1de
        L1da:
            java.lang.Object r15 = r15.proceed()
        L1de:
            return r15
        L1df:
            a.C0193i9.e(r15, r4)
            boolean r0 = a.R8.k()
            if (r0 != 0) goto L1ed
            java.lang.Object r3 = r15.proceed()
            goto L222
        L1ed:
            java.util.List r0 = r15.getArgs()
            a.C0193i9.d(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L1f8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L207
            java.lang.Object r1 = r0.next()
            boolean r2 = r1 instanceof android.content.Intent
            if (r2 == 0) goto L1f8
            goto L208
        L207:
            r1 = r3
        L208:
            boolean r0 = r1 instanceof android.content.Intent
            if (r0 == 0) goto L20f
            android.content.Intent r1 = (android.content.Intent) r1
            goto L210
        L20f:
            r1 = r3
        L210:
            if (r1 == 0) goto L21e
            boolean r0 = a.R8.t(r1)
            if (r0 == 0) goto L21e
            java.lang.String r15 = "intercept Flutter global for VOIP intent"
            a.R8.r(r15)
            goto L222
        L21e:
            java.lang.Object r3 = r15.proceed()
        L222:
            return r3
        L223:
            a.C0193i9.e(r15, r4)
            boolean r2 = a.R8.k()
            if (r2 != 0) goto L231
            java.lang.Object r3 = r15.proceed()
            goto L25f
        L231:
            java.util.List r2 = r15.getArgs()
            a.C0193i9.d(r2, r1)
            java.lang.Object r0 = a.C0383t3.o0(r2, r0)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L243
            java.lang.String r0 = (java.lang.String) r0
            goto L244
        L243:
            r0 = r3
        L244:
            if (r0 == 0) goto L25b
            java.util.concurrent.ExecutorService r1 = a.fh.G
            boolean r1 = a.fh.a.a(r0)
            if (r1 == 0) goto L25b
            java.lang.String r15 = "intercept incoming call UI for wxid="
            java.lang.String r15 = r15.concat(r0)
            a.R8.r(r15)
            a.C0074bh.g(r0)
            goto L25f
        L25b:
            java.lang.Object r3 = r15.proceed()
        L25f:
            return r3
        L260:
            a.C0193i9.e(r15, r4)
            boolean r0 = a.R8.k()
            if (r0 != 0) goto L26e
            java.lang.Object r3 = r15.proceed()
            goto L29c
        L26e:
            java.util.List r0 = r15.getArgs()
            a.C0193i9.d(r0, r1)
            java.lang.Object r0 = a.C0383t3.o0(r0, r2)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L280
            java.lang.String r0 = (java.lang.String) r0
            goto L281
        L280:
            r0 = r3
        L281:
            if (r0 == 0) goto L298
            java.util.concurrent.ExecutorService r1 = a.fh.G
            boolean r1 = a.fh.a.a(r0)
            if (r1 == 0) goto L298
            java.lang.String r15 = "intercept voip bind for user="
            java.lang.String r15 = r15.concat(r0)
            a.R8.r(r15)
            a.C0074bh.g(r0)
            goto L29c
        L298:
            java.lang.Object r3 = r15.proceed()
        L29c:
            return r3
        L29d:
            a.C0193i9.e(r15, r4)
            boolean r0 = a.R8.k()
            if (r0 != 0) goto L2ab
            java.lang.Object r3 = r15.proceed()
            goto L2dc
        L2ab:
            java.util.List r0 = r15.getArgs()
            a.C0193i9.d(r0, r1)
            java.lang.Object r0 = a.C0383t3.o0(r0, r2)
            if (r0 != 0) goto L2bd
            java.lang.Object r3 = r15.proceed()
            goto L2dc
        L2bd:
            java.lang.String r0 = a.C0055ah.a(r0)
            if (r0 == 0) goto L2d8
            java.util.concurrent.ExecutorService r1 = a.fh.G
            boolean r1 = a.fh.a.a(r0)
            if (r1 == 0) goto L2d8
            java.lang.String r15 = "intercept incoming call handler for wxid="
            java.lang.String r15 = r15.concat(r0)
            a.R8.r(r15)
            a.C0074bh.g(r0)
            goto L2dc
        L2d8:
            java.lang.Object r3 = r15.proceed()
        L2dc:
            return r3
        L2dd:
            a.C0193i9.e(r15, r4)
            boolean r1 = a.C0442w8.c()
            if (r1 != 0) goto L2eb
            java.lang.Object r15 = r15.proceed()
            goto L316
        L2eb:
            java.util.HashSet r1 = a.C0442w8.e()
            java.util.List r4 = r15.getArgs()
            int r4 = r4.size()
        L2f7:
            if (r2 >= r4) goto L312
            java.util.List r5 = r15.getArgs()
            java.lang.Object r5 = r5.get(r2)
            boolean r6 = a.Kf.b(r5)
            if (r6 == 0) goto L30a
            java.util.List r5 = (java.util.List) r5
            goto L30b
        L30a:
            r5 = r3
        L30b:
            if (r5 == 0) goto L310
            a.C0442w8.b(r5, r1)
        L310:
            int r2 = r2 + r0
            goto L2f7
        L312:
            java.lang.Object r15 = r15.proceed()
        L316:
            return r15
    }
}
