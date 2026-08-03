package a;

/* JADX INFO: renamed from: a.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0203j2 implements a.C0086ca.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f520a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ C0203j2(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f520a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // a.C0086ca.d
    public final void a(a.C0086ca.a r9) {
            r8 = this;
            r0 = 0
            r1 = 1
            int r2 = r8.f520a
            switch(r2) {
                case 0: goto L153;
                case 1: goto L9f;
                case 2: goto L69;
                case 3: goto L1a;
                default: goto L7;
            }
        L7:
            boolean r9 = r9 instanceof a.C0086ca.a.C0002a
            if (r9 == 0) goto L19
            java.lang.Object r9 = r8.b
            a.ra r9 = (a.C0354ra) r9
            android.app.Activity r1 = r9.f669a
            a.ma r2 = new a.ma
            r2.<init>(r9, r0)
            r1.runOnUiThread(r2)
        L19:
            return
        L1a:
            java.lang.Object r0 = r8.b
            a.h8 r0 = (a.C0174h8) r0
            boolean r2 = r9 instanceof a.C0086ca.a.C0002a
            if (r2 == 0) goto L68
            java.lang.Object r2 = r0.f495a
            if (r2 == 0) goto L68
            a.K3$a r2 = a.K3.f148a
            r2.getClass()
            boolean r2 = a.K3.a.l()
            if (r2 == 0) goto L68
            a.jc r2 = a.K3.a.i()
            boolean r2 = r2.o
            if (r2 == 0) goto L68
            a.ca$a$a r9 = (a.C0086ca.a.C0002a) r9
            a.ca$b r2 = r9.b
            a.ca$b r9 = r9.f422a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "HideContactList: HideStateChanged "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = " -> "
            r3.append(r2)
            r3.append(r9)
            java.lang.String r9 = ", refresh contact list"
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r1)
            a.C0453x1.b(r9)
            r0.j()
        L68:
            return
        L69:
            java.lang.Object r2 = r8.b
            a.v5 r2 = (a.C0421v5) r2
            boolean r3 = r9 instanceof a.C0086ca.a.b
            if (r3 != 0) goto L72
            goto L9e
        L72:
            boolean r3 = a.C0421v5.f()     // Catch: java.lang.Throwable -> L9e
            if (r3 == 0) goto L9e
            r3 = r9
            a.ca$a$b r3 = (a.C0086ca.a.b) r3     // Catch: java.lang.Throwable -> L9e
            boolean r3 = r3.b     // Catch: java.lang.Throwable -> L9e
            if (r3 != 0) goto L9e
            java.util.LinkedHashSet r3 = r2.b     // Catch: java.lang.Throwable -> L9e
            a.ca$a$b r9 = (a.C0086ca.a.b) r9     // Catch: java.lang.Throwable -> L9e
            java.lang.String r9 = r9.f423a     // Catch: java.lang.Throwable -> L9e
            r3.add(r9)     // Catch: java.lang.Throwable -> L9e
            boolean r9 = r2.f732a     // Catch: java.lang.Throwable -> L9e
            if (r9 != 0) goto L9b
            r2.f732a = r1     // Catch: java.lang.Throwable -> L9e
            android.view.View r9 = r2.c     // Catch: java.lang.Throwable -> L9e
            if (r9 != 0) goto L93
            goto L9b
        L93:
            a.t5 r1 = new a.t5     // Catch: java.lang.Throwable -> L9e
            r1.<init>(r9, r0)     // Catch: java.lang.Throwable -> L9e
            r9.post(r1)     // Catch: java.lang.Throwable -> L9e
        L9b:
            r2.i()     // Catch: java.lang.Throwable -> L9e
        L9e:
            return
        L9f:
            java.lang.Object r0 = r8.b
            a.s4 r0 = (a.C0366s4) r0
            java.lang.String r2 = "MSG-REHIDE talker="
            java.lang.String r3 = "MSG-REHIDE deferred: dbWriteInProgress=true, talker="
            boolean r4 = r9 instanceof a.C0086ca.a.b
            if (r4 != 0) goto Lad
            goto L152
        Lad:
            a.K3$a r4 = a.K3.f148a     // Catch: java.lang.Throwable -> L152
            r4.getClass()     // Catch: java.lang.Throwable -> L152
            boolean r4 = a.K3.a.l()     // Catch: java.lang.Throwable -> L152
            if (r4 == 0) goto L152
            a.jc r4 = a.K3.a.i()     // Catch: java.lang.Throwable -> L152
            boolean r4 = r4.n     // Catch: java.lang.Throwable -> L152
            if (r4 != 0) goto Lc2
            goto L152
        Lc2:
            a.x8 r4 = a.C0460x8.f762a     // Catch: java.lang.Throwable -> L152
            boolean r4 = a.C0460x8.a()     // Catch: java.lang.Throwable -> L152
            if (r4 == 0) goto Lcc
            goto L152
        Lcc:
            r4 = r9
            a.ca$a$b r4 = (a.C0086ca.a.b) r4     // Catch: java.lang.Throwable -> L152
            boolean r4 = r4.b     // Catch: java.lang.Throwable -> L152
            if (r4 == 0) goto Ld5
            goto L152
        Ld5:
            a.ca$a$b r9 = (a.C0086ca.a.b) r9     // Catch: java.lang.Throwable -> L152
            java.lang.String r9 = r9.f423a     // Catch: java.lang.Throwable -> L152
            boolean r4 = a.C0366s4.J     // Catch: java.lang.Throwable -> L152
            java.lang.String r5 = "[ConvRV] "
            java.lang.String r6 = "msg"
            if (r4 == 0) goto L101
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L152
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L152
            r1.append(r9)     // Catch: java.lang.Throwable -> L152
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L152
            a.C0193i9.e(r1, r6)     // Catch: java.lang.Throwable -> L152
            java.lang.String r1 = r5.concat(r1)     // Catch: java.lang.Throwable -> L152
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L152
            a.C0453x1.b(r1)     // Catch: java.lang.Throwable -> L152
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r0 = r0.B     // Catch: java.lang.Throwable -> L152
            r0.add(r9)     // Catch: java.lang.Throwable -> L152
            goto L152
        L101:
            java.lang.String r3 = "wxid"
            a.C0193i9.e(r9, r3)     // Catch: java.lang.Throwable -> L152
            boolean r3 = a.C0134f4.b(r9, r1)     // Catch: java.lang.Throwable -> L152
            a.Gb r4 = a.Gb.f99a     // Catch: java.lang.Throwable -> L152
            r4.getClass()     // Catch: java.lang.Throwable -> L152
            a.Me r4 = a.Gb.l     // Catch: java.lang.Throwable -> L152
            java.lang.Object r4 = r4.a()     // Catch: java.lang.Throwable -> L152
            android.os.Handler r4 = (android.os.Handler) r4     // Catch: java.lang.Throwable -> L152
            a.Fb r7 = new a.Fb     // Catch: java.lang.Throwable -> L152
            r7.<init>(r9, r1)     // Catch: java.lang.Throwable -> L152
            r4.post(r7)     // Catch: java.lang.Throwable -> L152
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L152
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L152
            r1.append(r9)     // Catch: java.lang.Throwable -> L152
            java.lang.String r2 = " ok="
            r1.append(r2)     // Catch: java.lang.Throwable -> L152
            r1.append(r3)     // Catch: java.lang.Throwable -> L152
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L152
            a.C0193i9.e(r1, r6)     // Catch: java.lang.Throwable -> L152
            java.lang.String r1 = r5.concat(r1)     // Catch: java.lang.Throwable -> L152
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L152
            a.C0453x1.b(r1)     // Catch: java.lang.Throwable -> L152
            if (r3 == 0) goto L152
            java.lang.ClassLoader r1 = r0.k     // Catch: java.lang.Throwable -> L152
            if (r1 == 0) goto L152
            android.os.Handler r0 = r0.f     // Catch: java.lang.Throwable -> L152
            a.P0 r2 = new a.P0     // Catch: java.lang.Throwable -> L152
            r3 = 3
            r2.<init>(r1, r3, r9)     // Catch: java.lang.Throwable -> L152
            r0.post(r2)     // Catch: java.lang.Throwable -> L152
        L152:
            return
        L153:
            java.lang.Object r0 = r8.b
            a.o2 r0 = (a.C0293o2) r0
            boolean r1 = r9 instanceof a.C0086ca.a.b
            if (r1 != 0) goto L15c
            goto L17c
        L15c:
            boolean r1 = a.C0293o2.e()     // Catch: java.lang.Throwable -> L17c
            if (r1 == 0) goto L17c
            r1 = r9
            a.ca$a$b r1 = (a.C0086ca.a.b) r1     // Catch: java.lang.Throwable -> L17c
            boolean r1 = r1.b     // Catch: java.lang.Throwable -> L17c
            if (r1 != 0) goto L17c
            java.util.LinkedHashSet r1 = r0.c     // Catch: java.lang.Throwable -> L17c
            a.ca$a$b r9 = (a.C0086ca.a.b) r9     // Catch: java.lang.Throwable -> L17c
            java.lang.String r9 = r9.f423a     // Catch: java.lang.Throwable -> L17c
            r1.add(r9)     // Catch: java.lang.Throwable -> L17c
            boolean r9 = r0.f615a     // Catch: java.lang.Throwable -> L17c
            if (r9 != 0) goto L179
            r0.g()     // Catch: java.lang.Throwable -> L17c
        L179:
            r0.i()     // Catch: java.lang.Throwable -> L17c
        L17c:
            return
    }
}
