package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3670 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f11696 = "LocalBroadcastManager";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final boolean f11697 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f11698 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final java.lang.Object f11699 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static Yue.C3670 f11700;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.content.Context f11701;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<Yue.C3670.C3673>> f11702;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.util.HashMap<java.lang.String, java.util.ArrayList<Yue.C3670.C3673>> f11703;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final java.util.ArrayList<Yue.C3670.C3672> f11704;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final android.os.Handler f11705;

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۤۢ$ۥ, reason: contains not printable characters */
    public class HandlerC3671 extends android.os.Handler {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C3670 f11706;

        public HandlerC3671(Yue.C3670 r1, android.os.Looper r2) {
                r0 = this;
                r0.f11706 = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = 1
                if (r0 == r1) goto L9
                super.handleMessage(r3)
                goto Le
            L9:
                Yue.ۥ۠ۧۤۢ r3 = r2.f11706
                r3.m14841()
            Le:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۤۢ$ۥ۟, reason: contains not printable characters */
    public static final class C3672 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.content.Intent f11707;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.util.ArrayList<Yue.C3670.C3673> f11708;

        public C3672(android.content.Intent r1, java.util.ArrayList<Yue.C3670.C3673> r2) {
                r0 = this;
                r0.<init>()
                r0.f11707 = r1
                r0.f11708 = r2
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۤۢ$ۥ۟۟, reason: contains not printable characters */
    public static final class C3673 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.content.IntentFilter f11709;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final android.content.BroadcastReceiver f11710;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f11711;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f11712;

        public C3673(android.content.IntentFilter r1, android.content.BroadcastReceiver r2) {
                r0 = this;
                r0.<init>()
                r0.f11709 = r1
                r0.f11710 = r2
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 128(0x80, float:1.8E-43)
                r0.<init>(r1)
                java.lang.String r1 = "Receiver{"
                r0.append(r1)
                android.content.BroadcastReceiver r1 = r2.f11710
                r0.append(r1)
                java.lang.String r1 = " filter="
                r0.append(r1)
                android.content.IntentFilter r1 = r2.f11709
                r0.append(r1)
                boolean r1 = r2.f11712
                if (r1 == 0) goto L24
                java.lang.String r1 = " DEAD"
                r0.append(r1)
            L24:
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            Yue.C3670.f11699 = r0
            return
    }

    public C3670(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f11702 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f11703 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f11704 = r0
            r1.f11701 = r2
            Yue.ۥ۠ۧۤۢ$ۥ r0 = new Yue.ۥ۠ۧۤۢ$ۥ
            android.os.Looper r2 = r2.getMainLooper()
            r0.<init>(r1, r2)
            r1.f11705 = r0
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.C3670 m14840(@Yue.InterfaceC4410 android.content.Context r2) {
            java.lang.Object r0 = Yue.C3670.f11699
            monitor-enter(r0)
            Yue.ۥ۠ۧۤۢ r1 = Yue.C3670.f11700     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            Yue.ۥ۠ۧۤۢ r1 = new Yue.ۥ۠ۧۤۢ     // Catch: java.lang.Throwable -> L13
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            Yue.C3670.f11700 = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L19
        L15:
            Yue.ۥ۠ۧۤۢ r2 = Yue.C3670.f11700     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r2
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m14841() {
            r10 = this;
        L0:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<Yue.ۥ۠ۧۤۢ$ۥ۟۟>> r0 = r10.f11702
            monitor-enter(r0)
            java.util.ArrayList<Yue.ۥ۠ۧۤۢ$ۥ۟> r1 = r10.f11704     // Catch: java.lang.Throwable -> Ld
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Ld
            if (r1 > 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r1 = move-exception
            goto L46
        Lf:
            Yue.ۥ۠ۧۤۢ$ۥ۟[] r2 = new Yue.C3670.C3672[r1]     // Catch: java.lang.Throwable -> Ld
            java.util.ArrayList<Yue.ۥ۠ۧۤۢ$ۥ۟> r3 = r10.f11704     // Catch: java.lang.Throwable -> Ld
            r3.toArray(r2)     // Catch: java.lang.Throwable -> Ld
            java.util.ArrayList<Yue.ۥ۠ۧۤۢ$ۥ۟> r3 = r10.f11704     // Catch: java.lang.Throwable -> Ld
            r3.clear()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            r0 = 0
            r3 = r0
        L1e:
            if (r3 >= r1) goto L0
            r4 = r2[r3]
            java.util.ArrayList<Yue.ۥ۠ۧۤۢ$ۥ۟۟> r5 = r4.f11708
            int r5 = r5.size()
            r6 = r0
        L29:
            if (r6 >= r5) goto L43
            java.util.ArrayList<Yue.ۥ۠ۧۤۢ$ۥ۟۟> r7 = r4.f11708
            java.lang.Object r7 = r7.get(r6)
            Yue.ۥ۠ۧۤۢ$ۥ۟۟ r7 = (Yue.C3670.C3673) r7
            boolean r8 = r7.f11712
            if (r8 != 0) goto L40
            android.content.BroadcastReceiver r7 = r7.f11710
            android.content.Context r8 = r10.f11701
            android.content.Intent r9 = r4.f11707
            r7.onReceive(r8, r9)
        L40:
            int r6 = r6 + 1
            goto L29
        L43:
            int r3 = r3 + 1
            goto L1e
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m14842(@Yue.InterfaceC4410 android.content.BroadcastReceiver r7, @Yue.InterfaceC4410 android.content.IntentFilter r8) {
            r6 = this;
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<Yue.ۥ۠ۧۤۢ$ۥ۟۟>> r0 = r6.f11702
            monitor-enter(r0)
            Yue.ۥ۠ۧۤۢ$ۥ۟۟ r1 = new Yue.ۥ۠ۧۤۢ$ۥ۟۟     // Catch: java.lang.Throwable -> L1e
            r1.<init>(r8, r7)     // Catch: java.lang.Throwable -> L1e
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<Yue.ۥ۠ۧۤۢ$ۥ۟۟>> r2 = r6.f11702     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Throwable -> L1e
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L1e
            r3 = 1
            if (r2 != 0) goto L20
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1e
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<Yue.ۥ۠ۧۤۢ$ۥ۟۟>> r4 = r6.f11702     // Catch: java.lang.Throwable -> L1e
            r4.put(r7, r2)     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r7 = move-exception
            goto L4a
        L20:
            r2.add(r1)     // Catch: java.lang.Throwable -> L1e
            r7 = 0
        L24:
            int r2 = r8.countActions()     // Catch: java.lang.Throwable -> L1e
            if (r7 >= r2) goto L48
            java.lang.String r2 = r8.getAction(r7)     // Catch: java.lang.Throwable -> L1e
            java.util.HashMap<java.lang.String, java.util.ArrayList<Yue.ۥ۠ۧۤۢ$ۥ۟۟>> r4 = r6.f11703     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L1e
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.lang.Throwable -> L1e
            if (r4 != 0) goto L42
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1e
            java.util.HashMap<java.lang.String, java.util.ArrayList<Yue.ۥ۠ۧۤۢ$ۥ۟۟>> r5 = r6.f11703     // Catch: java.lang.Throwable -> L1e
            r5.put(r2, r4)     // Catch: java.lang.Throwable -> L1e
        L42:
            r4.add(r1)     // Catch: java.lang.Throwable -> L1e
            int r7 = r7 + 1
            goto L24
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m14843(@Yue.InterfaceC4410 android.content.Intent r22) {
            r21 = this;
            r1 = r21
            r0 = r22
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<Yue.ۥ۠ۧۤۢ$ۥ۟۟>> r2 = r1.f11702
            monitor-enter(r2)
            java.lang.String r10 = r22.getAction()     // Catch: java.lang.Throwable -> L57
            android.content.Context r3 = r1.f11701     // Catch: java.lang.Throwable -> L57
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L57
            java.lang.String r11 = r0.resolveTypeIfNeeded(r3)     // Catch: java.lang.Throwable -> L57
            android.net.Uri r12 = r22.getData()     // Catch: java.lang.Throwable -> L57
            java.lang.String r13 = r22.getScheme()     // Catch: java.lang.Throwable -> L57
            java.util.Set r14 = r22.getCategories()     // Catch: java.lang.Throwable -> L57
            int r3 = r22.getFlags()     // Catch: java.lang.Throwable -> L57
            r3 = r3 & 8
            if (r3 == 0) goto L2c
            r16 = 1
            goto L2e
        L2c:
            r16 = 0
        L2e:
            if (r16 == 0) goto L5a
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r4.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = "Resolving type "
            r4.append(r5)     // Catch: java.lang.Throwable -> L57
            r4.append(r11)     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = " scheme "
            r4.append(r5)     // Catch: java.lang.Throwable -> L57
            r4.append(r13)     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = " of intent "
            r4.append(r5)     // Catch: java.lang.Throwable -> L57
            r4.append(r0)     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L57
            android.util.Log.v(r3, r4)     // Catch: java.lang.Throwable -> L57
            goto L5a
        L57:
            r0 = move-exception
            goto L179
        L5a:
            java.util.HashMap<java.lang.String, java.util.ArrayList<Yue.ۥ۠ۧۤۢ$ۥ۟۟>> r3 = r1.f11703     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = r22.getAction()     // Catch: java.lang.Throwable -> L57
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L57
            r8 = r3
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch: java.lang.Throwable -> L57
            if (r8 == 0) goto L176
            if (r16 == 0) goto L81
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r4.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = "Action list: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L57
            r4.append(r8)     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L57
            android.util.Log.v(r3, r4)     // Catch: java.lang.Throwable -> L57
        L81:
            r3 = 0
            r7 = r3
            r6 = 0
        L84:
            int r3 = r8.size()     // Catch: java.lang.Throwable -> L57
            if (r6 >= r3) goto L146
            java.lang.Object r3 = r8.get(r6)     // Catch: java.lang.Throwable -> L57
            r5 = r3
            Yue.ۥ۠ۧۤۢ$ۥ۟۟ r5 = (Yue.C3670.C3673) r5     // Catch: java.lang.Throwable -> L57
            if (r16 == 0) goto Lab
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r4.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r9 = "Matching against filter "
            r4.append(r9)     // Catch: java.lang.Throwable -> L57
            android.content.IntentFilter r9 = r5.f11709     // Catch: java.lang.Throwable -> L57
            r4.append(r9)     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L57
            android.util.Log.v(r3, r4)     // Catch: java.lang.Throwable -> L57
        Lab:
            boolean r3 = r5.f11711     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto Lc4
            if (r16 == 0) goto Lb8
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.String r4 = "  Filter's target already added"
            android.util.Log.v(r3, r4)     // Catch: java.lang.Throwable -> L57
        Lb8:
            r17 = r6
            r19 = r8
            r18 = r10
            r20 = r11
            r11 = 1
            r10 = r7
            goto L13b
        Lc4:
            android.content.IntentFilter r3 = r5.f11709     // Catch: java.lang.Throwable -> L57
            java.lang.String r9 = "LocalBroadcastManager"
            r4 = r10
            r15 = r5
            r5 = r11
            r17 = r6
            r6 = r13
            r18 = r10
            r10 = r7
            r7 = r12
            r19 = r8
            r8 = r14
            r20 = r11
            r11 = 1
            int r3 = r3.match(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L57
            if (r3 < 0) goto L109
            if (r16 == 0) goto Lfa
            java.lang.String r4 = "LocalBroadcastManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r5.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r6 = "  Filter matched!  match=0x"
            r5.append(r6)     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch: java.lang.Throwable -> L57
            r5.append(r3)     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L57
            android.util.Log.v(r4, r3)     // Catch: java.lang.Throwable -> L57
        Lfa:
            if (r10 != 0) goto L102
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L57
            r7.<init>()     // Catch: java.lang.Throwable -> L57
            goto L103
        L102:
            r7 = r10
        L103:
            r7.add(r15)     // Catch: java.lang.Throwable -> L57
            r15.f11711 = r11     // Catch: java.lang.Throwable -> L57
            goto L13c
        L109:
            if (r16 == 0) goto L13b
            r4 = -4
            if (r3 == r4) goto L123
            r4 = -3
            if (r3 == r4) goto L120
            r4 = -2
            if (r3 == r4) goto L11d
            r4 = -1
            if (r3 == r4) goto L11a
            java.lang.String r3 = "unknown reason"
            goto L125
        L11a:
            java.lang.String r3 = "type"
            goto L125
        L11d:
            java.lang.String r3 = "data"
            goto L125
        L120:
            java.lang.String r3 = "action"
            goto L125
        L123:
            java.lang.String r3 = "category"
        L125:
            java.lang.String r4 = "LocalBroadcastManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r5.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r6 = "  Filter did not match: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L57
            r5.append(r3)     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L57
            android.util.Log.v(r4, r3)     // Catch: java.lang.Throwable -> L57
        L13b:
            r7 = r10
        L13c:
            int r6 = r17 + 1
            r10 = r18
            r8 = r19
            r11 = r20
            goto L84
        L146:
            r10 = r7
            r11 = 1
            if (r10 == 0) goto L176
            r3 = 0
        L14b:
            int r4 = r10.size()     // Catch: java.lang.Throwable -> L57
            if (r3 >= r4) goto L15d
            java.lang.Object r4 = r10.get(r3)     // Catch: java.lang.Throwable -> L57
            Yue.ۥ۠ۧۤۢ$ۥ۟۟ r4 = (Yue.C3670.C3673) r4     // Catch: java.lang.Throwable -> L57
            r5 = 0
            r4.f11711 = r5     // Catch: java.lang.Throwable -> L57
            int r3 = r3 + 1
            goto L14b
        L15d:
            java.util.ArrayList<Yue.ۥ۠ۧۤۢ$ۥ۟> r3 = r1.f11704     // Catch: java.lang.Throwable -> L57
            Yue.ۥ۠ۧۤۢ$ۥ۟ r4 = new Yue.ۥ۠ۧۤۢ$ۥ۟     // Catch: java.lang.Throwable -> L57
            r4.<init>(r0, r10)     // Catch: java.lang.Throwable -> L57
            r3.add(r4)     // Catch: java.lang.Throwable -> L57
            android.os.Handler r0 = r1.f11705     // Catch: java.lang.Throwable -> L57
            boolean r0 = r0.hasMessages(r11)     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L174
            android.os.Handler r0 = r1.f11705     // Catch: java.lang.Throwable -> L57
            r0.sendEmptyMessage(r11)     // Catch: java.lang.Throwable -> L57
        L174:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L57
            return r11
        L176:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L57
            r0 = 0
            return r0
        L179:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L57
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m14844(@Yue.InterfaceC4410 android.content.Intent r1) {
            r0 = this;
            boolean r1 = r0.m14843(r1)
            if (r1 == 0) goto L9
            r0.m14841()
        L9:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m14845(@Yue.InterfaceC4410 android.content.BroadcastReceiver r12) {
            r11 = this;
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<Yue.ۥ۠ۧۤۢ$ۥ۟۟>> r0 = r11.f11702
            monitor-enter(r0)
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<Yue.ۥ۠ۧۤۢ$ۥ۟۟>> r1 = r11.f11702     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r1 = r1.remove(r12)     // Catch: java.lang.Throwable -> Lf
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r12 = move-exception
            goto L66
        L11:
            int r2 = r1.size()     // Catch: java.lang.Throwable -> Lf
            r3 = 1
            int r2 = r2 - r3
        L17:
            if (r2 < 0) goto L64
            java.lang.Object r4 = r1.get(r2)     // Catch: java.lang.Throwable -> Lf
            Yue.ۥ۠ۧۤۢ$ۥ۟۟ r4 = (Yue.C3670.C3673) r4     // Catch: java.lang.Throwable -> Lf
            r4.f11712 = r3     // Catch: java.lang.Throwable -> Lf
            r5 = 0
        L22:
            android.content.IntentFilter r6 = r4.f11709     // Catch: java.lang.Throwable -> Lf
            int r6 = r6.countActions()     // Catch: java.lang.Throwable -> Lf
            if (r5 >= r6) goto L61
            android.content.IntentFilter r6 = r4.f11709     // Catch: java.lang.Throwable -> Lf
            java.lang.String r6 = r6.getAction(r5)     // Catch: java.lang.Throwable -> Lf
            java.util.HashMap<java.lang.String, java.util.ArrayList<Yue.ۥ۠ۧۤۢ$ۥ۟۟>> r7 = r11.f11703     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r7 = r7.get(r6)     // Catch: java.lang.Throwable -> Lf
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch: java.lang.Throwable -> Lf
            if (r7 == 0) goto L5e
            int r8 = r7.size()     // Catch: java.lang.Throwable -> Lf
            int r8 = r8 - r3
        L3f:
            if (r8 < 0) goto L53
            java.lang.Object r9 = r7.get(r8)     // Catch: java.lang.Throwable -> Lf
            Yue.ۥ۠ۧۤۢ$ۥ۟۟ r9 = (Yue.C3670.C3673) r9     // Catch: java.lang.Throwable -> Lf
            android.content.BroadcastReceiver r10 = r9.f11710     // Catch: java.lang.Throwable -> Lf
            if (r10 != r12) goto L50
            r9.f11712 = r3     // Catch: java.lang.Throwable -> Lf
            r7.remove(r8)     // Catch: java.lang.Throwable -> Lf
        L50:
            int r8 = r8 + (-1)
            goto L3f
        L53:
            int r7 = r7.size()     // Catch: java.lang.Throwable -> Lf
            if (r7 > 0) goto L5e
            java.util.HashMap<java.lang.String, java.util.ArrayList<Yue.ۥ۠ۧۤۢ$ۥ۟۟>> r7 = r11.f11703     // Catch: java.lang.Throwable -> Lf
            r7.remove(r6)     // Catch: java.lang.Throwable -> Lf
        L5e:
            int r5 = r5 + 1
            goto L22
        L61:
            int r2 = r2 + (-1)
            goto L17
        L64:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        L66:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r12
    }
}
