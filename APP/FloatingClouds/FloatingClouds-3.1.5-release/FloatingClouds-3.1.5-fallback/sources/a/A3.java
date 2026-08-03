package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A3 implements a.InterfaceC0369s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ A3(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f8a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // a.InterfaceC0369s7
    public final java.lang.Object a() {
            r12 = this;
            r0 = 2
            r1 = 0
            r2 = 0
            r3 = 1
            int r4 = r12.f8a
            switch(r4) {
                case 0: goto L1a1;
                case 1: goto L174;
                case 2: goto L16a;
                case 3: goto L152;
                case 4: goto L10f;
                case 5: goto Le;
                default: goto L9;
            }
        L9:
            java.lang.Object r0 = r12.b
            java.lang.Class r0 = (java.lang.Class) r0
            return r0
        Le:
            java.lang.Object r0 = r12.b
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            java.lang.Object r4 = r0.proceed()
            if (r4 != 0) goto L1c
            java.lang.Object r4 = r0.getThisObject()
        L1c:
            if (r4 == 0) goto L10e
            java.lang.Object r0 = a.Gb.g
            if (r0 == 0) goto L24
            goto L10e
        L24:
            a.Gb r0 = a.Gb.f99a
            java.lang.Class r5 = r4.getClass()
            r0.getClass()
            boolean r0 = a.Gb.e(r5)
            if (r0 == 0) goto L10e
            a.Gb.g = r4
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r5 = "captureLiveStorageInstance: captured "
            java.lang.String r0 = r5.concat(r0)
            a.Gb.j(r0)
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = r5.concat(r0)
            java.lang.String r5 = "ConvHide"
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r0}
            a.C0453x1.b(r0)
            boolean r0 = a.Gb.b
            if (r0 != 0) goto L10e
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Throwable -> La8
            java.lang.reflect.Method r0 = a.Gb.c(r0)     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto L10e
            a.Gb.c = r4     // Catch: java.lang.Throwable -> La8
            a.Gb.d = r0     // Catch: java.lang.Throwable -> La8
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Throwable -> La8
            a.O8 r6 = new a.O8     // Catch: java.lang.Throwable -> La8
            r7 = 19
            r6.<init>(r7)     // Catch: java.lang.Throwable -> La8
        L78:
            if (r0 == 0) goto La1
            java.lang.reflect.Method[] r7 = r0.getDeclaredMethods()     // Catch: java.lang.Throwable -> La8
            java.lang.String r8 = "getDeclaredMethods(...)"
            a.C0193i9.d(r7, r8)     // Catch: java.lang.Throwable -> La8
            int r8 = r7.length     // Catch: java.lang.Throwable -> La8
            r9 = r1
        L85:
            if (r9 >= r8) goto L98
            r10 = r7[r9]     // Catch: java.lang.Throwable -> La8
            java.lang.Object r11 = r6.f(r10)     // Catch: java.lang.Throwable -> La8
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> La8
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> La8
            if (r11 == 0) goto L96
            goto L99
        L96:
            int r9 = r9 + r3
            goto L85
        L98:
            r10 = r2
        L99:
            if (r10 == 0) goto L9c
            goto La2
        L9c:
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Throwable -> La8
            goto L78
        La1:
            r10 = r2
        La2:
            if (r10 == 0) goto Laa
            r10.setAccessible(r3)     // Catch: java.lang.Throwable -> La8
            goto Lab
        La8:
            r0 = move-exception
            goto Lf4
        Laa:
            r10 = r2
        Lab:
            a.Gb.e = r10     // Catch: java.lang.Throwable -> La8
            if (r10 == 0) goto Lde
            java.lang.String r0 = "filehelper"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r0 = r10.invoke(r4, r0)     // Catch: java.lang.Throwable -> Lba
            goto Lbf
        Lba:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> La8
        Lbf:
            boolean r1 = r0 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto Lc4
            goto Lc5
        Lc4:
            r2 = r0
        Lc5:
            if (r2 == 0) goto Lde
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> La8
        Lcb:
            if (r0 == 0) goto Lde
            java.lang.String r1 = "field_parentRef"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> La8 java.lang.NoSuchFieldException -> Ld9
            r1.setAccessible(r3)     // Catch: java.lang.Throwable -> La8 java.lang.NoSuchFieldException -> Ld9
            a.Gb.f = r1     // Catch: java.lang.Throwable -> La8 java.lang.NoSuchFieldException -> Ld9
            goto Lde
        Ld9:
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Throwable -> La8
            goto Lcb
        Lde:
            a.Gb.b = r3     // Catch: java.lang.Throwable -> La8
            a.Gb r0 = a.Gb.f99a     // Catch: java.lang.Throwable -> La8
            java.lang.String r1 = "captureLiveStorageInstance: IMMEDIATE resolve OK, methodsReady=true"
            r0.getClass()     // Catch: java.lang.Throwable -> La8
            a.Gb.j(r1)     // Catch: java.lang.Throwable -> La8
            java.lang.String r0 = "captureLiveStorageInstance: immediate resolve OK"
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r0}     // Catch: java.lang.Throwable -> La8
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> La8
            goto L10e
        Lf4:
            a.Gb r1 = a.Gb.f99a
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "captureLiveStorageInstance: immediate resolve failed: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.getClass()
            a.Gb.j(r0)
        L10e:
            return r4
        L10f:
            java.lang.Object r1 = r12.b
            a.jc r1 = (a.C0213jc) r1
            a.va$a r3 = a.C0426va.g
            int r1 = r1.K
            r3.getClass()
            android.content.Context r3 = a.C0435w1.p     // Catch: java.lang.Throwable -> L12d
            if (r3 != 0) goto L11f
            goto L14f
        L11f:
            java.lang.String r4 = "vibrator"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch: java.lang.Throwable -> L12d
            boolean r4 = r3 instanceof android.os.Vibrator     // Catch: java.lang.Throwable -> L12d
            if (r4 == 0) goto L12f
            r2 = r3
            android.os.Vibrator r2 = (android.os.Vibrator) r2     // Catch: java.lang.Throwable -> L12d
            goto L12f
        L12d:
            r1 = move-exception
            goto L138
        L12f:
            if (r2 != 0) goto L132
            goto L14f
        L132:
            a.C0426va.a.a(r2, r1)     // Catch: java.lang.Throwable -> L12d
            a.Wf r1 = a.Wf.f330a     // Catch: java.lang.Throwable -> L12d
            goto L13c
        L138:
            a.wd$a r1 = a.C0465xd.a(r1)
        L13c:
            java.lang.Throwable r1 = a.C0447wd.a(r1)
            if (r1 == 0) goto L14f
            java.lang.String r2 = "[MaskedMsgVibrate] preview vibrate fail"
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            a.C0453x1.a(r0)
        L14f:
            a.Wf r0 = a.Wf.f330a
            return r0
        L152:
            a.m0 r0 = a.C0255m0.f569a
            java.lang.Object r1 = r12.b
            a.X9 r1 = (a.X9) r1
            a.X6 r1 = r1.z()
            r0.getClass()
            boolean r0 = a.C0255m0.c
            if (r0 == 0) goto L164
            goto L167
        L164:
            a.C0255m0.c(r1)
        L167:
            a.Wf r0 = a.Wf.f330a
            return r0
        L16a:
            java.lang.Object r0 = r12.b
            a.h8 r0 = (a.C0174h8) r0
            r0.j()
            a.Wf r0 = a.Wf.f330a
            return r0
        L174:
            java.lang.Object r2 = r12.b
            a.s4$a$a$a r2 = (a.C0366s4.a.C0005a.EnumC0006a) r2
            java.lang.String r4 = "expected"
            a.C0193i9.e(r2, r4)
            a.x8 r4 = a.C0460x8.f762a
            int r2 = r2.ordinal()
            if (r2 == 0) goto L195
            if (r2 == r3) goto L192
            if (r2 != r0) goto L18c
            a.ca$b r0 = a.C0086ca.b.c
            goto L197
        L18c:
            a.Ob r0 = new a.Ob
            r0.<init>()
            throw r0
        L192:
            a.ca$b r0 = a.C0086ca.b.b
            goto L197
        L195:
            a.ca$b r0 = a.C0086ca.b.f424a
        L197:
            a.ca$b r2 = a.C0460x8.b
            if (r2 != r0) goto L19c
            r1 = r3
        L19c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L1a1:
            java.lang.Object r0 = r12.b
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            a.Wf r0 = androidx.activity.ComponentActivity.c(r0)
            return r0
    }
}
