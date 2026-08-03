package com.bumptech.glide.manager;

/* JADX INFO: loaded from: classes.dex */
final class SingletonConnectivityReceiver {
    private static final java.lang.String TAG = "ConnectivityMonitor";
    private static volatile com.bumptech.glide.manager.SingletonConnectivityReceiver instance;
    private final com.bumptech.glide.manager.SingletonConnectivityReceiver.FrameworkConnectivityMonitor frameworkConnectivityMonitor;

    @Yue.InterfaceC2947("this")
    private boolean isRegistered;

    @Yue.InterfaceC2947("this")
    final java.util.Set<com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener> listeners;



    public interface FrameworkConnectivityMonitor {
        boolean register();

        void unregister();
    }

    @Yue.InterfaceC5336(24)
    public static final class FrameworkConnectivityMonitorPostApi24 implements com.bumptech.glide.manager.SingletonConnectivityReceiver.FrameworkConnectivityMonitor {
        private final com.bumptech.glide.util.GlideSuppliers.GlideSupplier<android.net.ConnectivityManager> connectivityManager;
        boolean isConnected;
        final com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener listener;
        private final android.net.ConnectivityManager.NetworkCallback networkCallback;

        /* JADX INFO: renamed from: com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPostApi24$1, reason: invalid class name */
        public class AnonymousClass1 extends android.net.ConnectivityManager.NetworkCallback {
            final /* synthetic */ com.bumptech.glide.manager.SingletonConnectivityReceiver.FrameworkConnectivityMonitorPostApi24 this$0;


            public AnonymousClass1(com.bumptech.glide.manager.SingletonConnectivityReceiver.FrameworkConnectivityMonitorPostApi24 r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            private void postOnConnectivityChange(boolean r2) {
                    r1 = this;
                    com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPostApi24$1$1 r0 = new com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPostApi24$1$1
                    r0.<init>(r1, r2)
                    com.bumptech.glide.util.Util.postOnUiThread(r0)
                    return
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(@Yue.InterfaceC4410 android.net.Network r1) {
                    r0 = this;
                    r1 = 1
                    r0.postOnConnectivityChange(r1)
                    return
            }

            public void onConnectivityChange(boolean r3) {
                    r2 = this;
                    com.bumptech.glide.util.Util.assertMainThread()
                    com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPostApi24 r0 = r2.this$0
                    boolean r1 = r0.isConnected
                    r0.isConnected = r3
                    if (r1 == r3) goto L10
                    com.bumptech.glide.manager.ConnectivityMonitor$ConnectivityListener r0 = r0.listener
                    r0.onConnectivityChanged(r3)
                L10:
                    return
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(@Yue.InterfaceC4410 android.net.Network r1) {
                    r0 = this;
                    r1 = 0
                    r0.postOnConnectivityChange(r1)
                    return
            }
        }

        public FrameworkConnectivityMonitorPostApi24(com.bumptech.glide.util.GlideSuppliers.GlideSupplier<android.net.ConnectivityManager> r2, com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener r3) {
                r1 = this;
                r1.<init>()
                com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPostApi24$1 r0 = new com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPostApi24$1
                r0.<init>(r1)
                r1.networkCallback = r0
                r1.connectivityManager = r2
                r1.listener = r3
                return
        }

        @Override // com.bumptech.glide.manager.SingletonConnectivityReceiver.FrameworkConnectivityMonitor
        @android.annotation.SuppressLint({"MissingPermission"})
        public boolean register() {
                r4 = this;
                com.bumptech.glide.util.GlideSuppliers$GlideSupplier<android.net.ConnectivityManager> r0 = r4.connectivityManager
                java.lang.Object r0 = r0.get()
                android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
                android.net.Network r0 = r0.getActiveNetwork()
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L12
                r0 = r2
                goto L13
            L12:
                r0 = r1
            L13:
                r4.isConnected = r0
                com.bumptech.glide.util.GlideSuppliers$GlideSupplier<android.net.ConnectivityManager> r0 = r4.connectivityManager     // Catch: java.lang.RuntimeException -> L23
                java.lang.Object r0 = r0.get()     // Catch: java.lang.RuntimeException -> L23
                android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.RuntimeException -> L23
                android.net.ConnectivityManager$NetworkCallback r3 = r4.networkCallback     // Catch: java.lang.RuntimeException -> L23
                r0.registerDefaultNetworkCallback(r3)     // Catch: java.lang.RuntimeException -> L23
                return r2
            L23:
                r0 = move-exception
                r2 = 5
                java.lang.String r3 = "ConnectivityMonitor"
                boolean r2 = android.util.Log.isLoggable(r3, r2)
                if (r2 == 0) goto L32
                java.lang.String r2 = "Failed to register callback"
                android.util.Log.w(r3, r2, r0)
            L32:
                return r1
        }

        @Override // com.bumptech.glide.manager.SingletonConnectivityReceiver.FrameworkConnectivityMonitor
        public void unregister() {
                r2 = this;
                com.bumptech.glide.util.GlideSuppliers$GlideSupplier<android.net.ConnectivityManager> r0 = r2.connectivityManager
                java.lang.Object r0 = r0.get()
                android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
                android.net.ConnectivityManager$NetworkCallback r1 = r2.networkCallback
                r0.unregisterNetworkCallback(r1)
                return
        }
    }

    public static final class FrameworkConnectivityMonitorPreApi24 implements com.bumptech.glide.manager.SingletonConnectivityReceiver.FrameworkConnectivityMonitor {
        static final java.util.concurrent.Executor EXECUTOR = null;
        private final com.bumptech.glide.util.GlideSuppliers.GlideSupplier<android.net.ConnectivityManager> connectivityManager;
        final android.content.BroadcastReceiver connectivityReceiver;
        final android.content.Context context;
        volatile boolean isConnected;
        volatile boolean isRegistered;
        final com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener listener;






        static {
                java.util.concurrent.Executor r0 = android.os.AsyncTask.SERIAL_EXECUTOR
                com.bumptech.glide.manager.SingletonConnectivityReceiver.FrameworkConnectivityMonitorPreApi24.EXECUTOR = r0
                return
        }

        public FrameworkConnectivityMonitorPreApi24(android.content.Context r2, com.bumptech.glide.util.GlideSuppliers.GlideSupplier<android.net.ConnectivityManager> r3, com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener r4) {
                r1 = this;
                r1.<init>()
                com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$1 r0 = new com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$1
                r0.<init>(r1)
                r1.connectivityReceiver = r0
                android.content.Context r2 = r2.getApplicationContext()
                r1.context = r2
                r1.connectivityManager = r3
                r1.listener = r4
                return
        }

        @android.annotation.SuppressLint({"MissingPermission"})
        public boolean isConnected() {
                r4 = this;
                r0 = 1
                com.bumptech.glide.util.GlideSuppliers$GlideSupplier<android.net.ConnectivityManager> r1 = r4.connectivityManager     // Catch: java.lang.RuntimeException -> L18
                java.lang.Object r1 = r1.get()     // Catch: java.lang.RuntimeException -> L18
                android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.RuntimeException -> L18
                android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch: java.lang.RuntimeException -> L18
                if (r1 == 0) goto L16
                boolean r1 = r1.isConnected()
                if (r1 == 0) goto L16
                goto L17
            L16:
                r0 = 0
            L17:
                return r0
            L18:
                r1 = move-exception
                r2 = 5
                java.lang.String r3 = "ConnectivityMonitor"
                boolean r2 = android.util.Log.isLoggable(r3, r2)
                if (r2 == 0) goto L27
                java.lang.String r2 = "Failed to determine connectivity status when connectivity changed"
                android.util.Log.w(r3, r2, r1)
            L27:
                return r0
        }

        public void notifyChangeOnUiThread(boolean r2) {
                r1 = this;
                com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$5 r0 = new com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$5
                r0.<init>(r1, r2)
                com.bumptech.glide.util.Util.postOnUiThread(r0)
                return
        }

        public void onConnectivityChange() {
                r2 = this;
                java.util.concurrent.Executor r0 = com.bumptech.glide.manager.SingletonConnectivityReceiver.FrameworkConnectivityMonitorPreApi24.EXECUTOR
                com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$4 r1 = new com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$4
                r1.<init>(r2)
                r0.execute(r1)
                return
        }

        @Override // com.bumptech.glide.manager.SingletonConnectivityReceiver.FrameworkConnectivityMonitor
        public boolean register() {
                r2 = this;
                java.util.concurrent.Executor r0 = com.bumptech.glide.manager.SingletonConnectivityReceiver.FrameworkConnectivityMonitorPreApi24.EXECUTOR
                com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$2 r1 = new com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$2
                r1.<init>(r2)
                r0.execute(r1)
                r0 = 1
                return r0
        }

        @Override // com.bumptech.glide.manager.SingletonConnectivityReceiver.FrameworkConnectivityMonitor
        public void unregister() {
                r2 = this;
                java.util.concurrent.Executor r0 = com.bumptech.glide.manager.SingletonConnectivityReceiver.FrameworkConnectivityMonitorPreApi24.EXECUTOR
                com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$3 r1 = new com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$3
                r1.<init>(r2)
                r0.execute(r1)
                return
        }
    }

    private SingletonConnectivityReceiver(@Yue.InterfaceC4410 android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.listeners = r0
            com.bumptech.glide.manager.SingletonConnectivityReceiver$1 r0 = new com.bumptech.glide.manager.SingletonConnectivityReceiver$1
            r0.<init>(r2, r3)
            com.bumptech.glide.util.GlideSuppliers$GlideSupplier r3 = com.bumptech.glide.util.GlideSuppliers.memorize(r0)
            com.bumptech.glide.manager.SingletonConnectivityReceiver$2 r0 = new com.bumptech.glide.manager.SingletonConnectivityReceiver$2
            r0.<init>(r2)
            com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPostApi24 r1 = new com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPostApi24
            r1.<init>(r3, r0)
            r2.frameworkConnectivityMonitor = r1
            return
    }

    public static com.bumptech.glide.manager.SingletonConnectivityReceiver get(@Yue.InterfaceC4410 android.content.Context r2) {
            com.bumptech.glide.manager.SingletonConnectivityReceiver r0 = com.bumptech.glide.manager.SingletonConnectivityReceiver.instance
            if (r0 != 0) goto L1d
            java.lang.Class<com.bumptech.glide.manager.SingletonConnectivityReceiver> r0 = com.bumptech.glide.manager.SingletonConnectivityReceiver.class
            monitor-enter(r0)
            com.bumptech.glide.manager.SingletonConnectivityReceiver r1 = com.bumptech.glide.manager.SingletonConnectivityReceiver.instance     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            com.bumptech.glide.manager.SingletonConnectivityReceiver r1 = new com.bumptech.glide.manager.SingletonConnectivityReceiver     // Catch: java.lang.Throwable -> L17
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            com.bumptech.glide.manager.SingletonConnectivityReceiver.instance = r1     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r2 = move-exception
            goto L1b
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            goto L1d
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r2
        L1d:
            com.bumptech.glide.manager.SingletonConnectivityReceiver r2 = com.bumptech.glide.manager.SingletonConnectivityReceiver.instance
            return r2
    }

    @Yue.InterfaceC2947("this")
    private void maybeRegisterReceiver() {
            r1 = this;
            boolean r0 = r1.isRegistered
            if (r0 != 0) goto L15
            java.util.Set<com.bumptech.glide.manager.ConnectivityMonitor$ConnectivityListener> r0 = r1.listeners
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L15
        Ld:
            com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitor r0 = r1.frameworkConnectivityMonitor
            boolean r0 = r0.register()
            r1.isRegistered = r0
        L15:
            return
    }

    @Yue.InterfaceC2947("this")
    private void maybeUnregisterReceiver() {
            r1 = this;
            boolean r0 = r1.isRegistered
            if (r0 == 0) goto L15
            java.util.Set<com.bumptech.glide.manager.ConnectivityMonitor$ConnectivityListener> r0 = r1.listeners
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ld
            goto L15
        Ld:
            com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitor r0 = r1.frameworkConnectivityMonitor
            r0.unregister()
            r0 = 0
            r1.isRegistered = r0
        L15:
            return
    }

    @Yue.InterfaceC6959
    public static void reset() {
            r0 = 0
            com.bumptech.glide.manager.SingletonConnectivityReceiver.instance = r0
            return
    }

    public synchronized void register(com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Set<com.bumptech.glide.manager.ConnectivityMonitor$ConnectivityListener> r0 = r1.listeners     // Catch: java.lang.Throwable -> Lb
            r0.add(r2)     // Catch: java.lang.Throwable -> Lb
            r1.maybeRegisterReceiver()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    public synchronized void unregister(com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Set<com.bumptech.glide.manager.ConnectivityMonitor$ConnectivityListener> r0 = r1.listeners     // Catch: java.lang.Throwable -> Lb
            r0.remove(r2)     // Catch: java.lang.Throwable -> Lb
            r1.maybeUnregisterReceiver()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }
}
