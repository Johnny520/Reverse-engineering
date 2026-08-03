package androidx.room;

/* JADX INFO: loaded from: classes.dex */
public class MultiInstanceInvalidationService extends android.app.Service {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int f0;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.HashMap<java.lang.Integer, java.lang.String> f1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final androidx.room.MultiInstanceInvalidationService.a f2;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final androidx.room.MultiInstanceInvalidationService.b f3;

    public class a extends android.os.RemoteCallbackList<p000.y3> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.room.MultiInstanceInvalidationService f4;

        public a(androidx.room.MultiInstanceInvalidationService r1) {
                r0 = this;
                r0.f4 = r1
                r0.<init>()
                return
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(android.os.IInterface r1, java.lang.Object r2) {
                r0 = this;
                ۟.y3 r1 = (p000.y3) r1
                androidx.room.MultiInstanceInvalidationService r1 = r0.f4
                java.util.HashMap<java.lang.Integer, java.lang.String> r1 = r1.f1
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.remove(r2)
                return
        }
    }

    public class b extends p000.z3 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.room.MultiInstanceInvalidationService f5;

        public b(androidx.room.MultiInstanceInvalidationService r1) {
                r0 = this;
                r0.f5 = r1
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final void m0(int r8, java.lang.String[] r9) {
                r7 = this;
                androidx.room.MultiInstanceInvalidationService r0 = r7.f5
                androidx.room.MultiInstanceInvalidationService$a r0 = r0.f2
                monitor-enter(r0)
                androidx.room.MultiInstanceInvalidationService r1 = r7.f5     // Catch: java.lang.Throwable -> L79
                java.util.HashMap<java.lang.Integer, java.lang.String> r1 = r1.f1     // Catch: java.lang.Throwable -> L79
                java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L79
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L79
                java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L79
                if (r1 != 0) goto L1e
                java.lang.String r8 = "ROOM"
                java.lang.String r9 = "Remote invalidation client ID not registered"
                android.util.Log.w(r8, r9)     // Catch: java.lang.Throwable -> L79
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L79
                return
            L1e:
                androidx.room.MultiInstanceInvalidationService r2 = r7.f5     // Catch: java.lang.Throwable -> L79
                androidx.room.MultiInstanceInvalidationService$a r2 = r2.f2     // Catch: java.lang.Throwable -> L79
                int r2 = r2.beginBroadcast()     // Catch: java.lang.Throwable -> L79
                r3 = 0
            L27:
                if (r3 >= r2) goto L70
                androidx.room.MultiInstanceInvalidationService r4 = r7.f5     // Catch: java.lang.Throwable -> L67
                androidx.room.MultiInstanceInvalidationService$a r4 = r4.f2     // Catch: java.lang.Throwable -> L67
                java.lang.Object r4 = r4.getBroadcastCookie(r3)     // Catch: java.lang.Throwable -> L67
                java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L67
                int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L67
                androidx.room.MultiInstanceInvalidationService r5 = r7.f5     // Catch: java.lang.Throwable -> L67
                java.util.HashMap<java.lang.Integer, java.lang.String> r5 = r5.f1     // Catch: java.lang.Throwable -> L67
                java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L67
                java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Throwable -> L67
                java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L67
                if (r8 == r4) goto L64
                boolean r4 = r1.equals(r5)     // Catch: java.lang.Throwable -> L67
                if (r4 != 0) goto L4e
                goto L64
            L4e:
                androidx.room.MultiInstanceInvalidationService r4 = r7.f5     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L67
                androidx.room.MultiInstanceInvalidationService$a r4 = r4.f2     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L67
                android.os.IInterface r4 = r4.getBroadcastItem(r3)     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L67
                ۟.y3 r4 = (p000.y3) r4     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L67
                r4.mo474(r9)     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L67
                goto L64
            L5c:
                r4 = move-exception
                java.lang.String r5 = "ROOM"
                java.lang.String r6 = "Error invoking a remote callback"
                android.util.Log.w(r5, r6, r4)     // Catch: java.lang.Throwable -> L67
            L64:
                int r3 = r3 + 1
                goto L27
            L67:
                r8 = move-exception
                androidx.room.MultiInstanceInvalidationService r9 = r7.f5     // Catch: java.lang.Throwable -> L79
                androidx.room.MultiInstanceInvalidationService$a r9 = r9.f2     // Catch: java.lang.Throwable -> L79
                r9.finishBroadcast()     // Catch: java.lang.Throwable -> L79
                throw r8     // Catch: java.lang.Throwable -> L79
            L70:
                androidx.room.MultiInstanceInvalidationService r8 = r7.f5     // Catch: java.lang.Throwable -> L79
                androidx.room.MultiInstanceInvalidationService$a r8 = r8.f2     // Catch: java.lang.Throwable -> L79
                r8.finishBroadcast()     // Catch: java.lang.Throwable -> L79
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L79
                return
            L79:
                r8 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L79
                throw r8
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m1(p000.y3 r6, java.lang.String r7) {
                r5 = this;
                r0 = 0
                if (r7 != 0) goto L4
                return r0
            L4:
                androidx.room.MultiInstanceInvalidationService r1 = r5.f5
                androidx.room.MultiInstanceInvalidationService$a r1 = r1.f2
                monitor-enter(r1)
                androidx.room.MultiInstanceInvalidationService r2 = r5.f5     // Catch: java.lang.Throwable -> L34
                int r3 = r2.f0     // Catch: java.lang.Throwable -> L34
                int r3 = r3 + 1
                r2.f0 = r3     // Catch: java.lang.Throwable -> L34
                androidx.room.MultiInstanceInvalidationService$a r2 = r2.f2     // Catch: java.lang.Throwable -> L34
                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L34
                boolean r6 = r2.register(r6, r4)     // Catch: java.lang.Throwable -> L34
                if (r6 == 0) goto L2a
                androidx.room.MultiInstanceInvalidationService r6 = r5.f5     // Catch: java.lang.Throwable -> L34
                java.util.HashMap<java.lang.Integer, java.lang.String> r6 = r6.f1     // Catch: java.lang.Throwable -> L34
                java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L34
                r6.put(r0, r7)     // Catch: java.lang.Throwable -> L34
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
                return r3
            L2a:
                androidx.room.MultiInstanceInvalidationService r6 = r5.f5     // Catch: java.lang.Throwable -> L34
                int r7 = r6.f0     // Catch: java.lang.Throwable -> L34
                int r7 = r7 + (-1)
                r6.f0 = r7     // Catch: java.lang.Throwable -> L34
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
                return r0
            L34:
                r6 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
                throw r6
        }
    }

    public MultiInstanceInvalidationService() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f0 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f1 = r0
            androidx.room.MultiInstanceInvalidationService$a r0 = new androidx.room.MultiInstanceInvalidationService$a
            r0.<init>(r1)
            r1.f2 = r0
            androidx.room.MultiInstanceInvalidationService$b r0 = new androidx.room.MultiInstanceInvalidationService$b
            r0.<init>(r1)
            r1.f3 = r0
            return
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            androidx.room.MultiInstanceInvalidationService$b r1 = r0.f3
            return r1
    }
}
