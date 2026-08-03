package h.Hchat.hooks.items.script;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ScriptPluginRuntime {
    public static final int $stable = 0;
    private static final og.k AGENT_TRANSACTION_DIRECTORY = null;
    private static final int IMAGE_DOWNLOAD_CALLBACK_QUEUE_CAPACITY = 32;
    private static final long IMAGE_DOWNLOAD_DROP_LOG_COOLDOWN_MS = 10000;
    private static final java.lang.String INFO_FILE = "info.prop";
    private static final long INITIAL_LOAD_POLL_MAX_MS = 2000;
    private static final long INITIAL_LOAD_POLL_MIN_MS = 250;
    private static final long INITIAL_LOAD_READY_TIMEOUT_MS = 30000;
    public static final h.Hchat.hooks.items.script.ScriptPluginRuntime INSTANCE = null;
    private static final java.lang.String MAIN_FILE = "main.java";
    private static final java.lang.String PROCESS_APPBRAND = "appbrand";
    private static final java.lang.String PROCESS_MAIN = "main";
    private static final int PROTOBUF_CALLBACK_QUEUE_CAPACITY = 128;
    private static final long PROTOBUF_DROP_LOG_COOLDOWN_MS = 10000;
    private static final java.lang.String README_FILE = "README.md";
    private static final long RELOAD_DEBOUNCE_MS = 500;
    private static final og.k SCRIPT_FUNCTION_NAME = null;
    private static final long SEND_BUTTON_DIAGNOSTIC_LOG_COOLDOWN_MS = 10000;
    private static final long SEND_BUTTON_SLOW_CALLBACK_MS = 50;
    private static final java.lang.String SNAPSHOT_SUFFIX = ".bshs";
    private static final int SNS_PREPARE_QUEUE_CAPACITY = 32;
    private static final java.lang.String TAG = "[Hchat:Script]";
    private static volatile android.content.Context appContext;
    private static volatile h.Hchat.hooks.items.script.ScriptPluginBridge bridge;
    private static final java.util.concurrent.ThreadPoolExecutor imageDownloadCallbackExecutor = null;
    private static final java.util.concurrent.atomic.AtomicLong imageDownloadDropLogAt = null;
    private static final java.util.concurrent.atomic.AtomicLong imageDownloadDroppedCount = null;
    private static final java.util.concurrent.atomic.AtomicBoolean initialLoadStarted = null;
    private static final java.util.WeakHashMap<bsh.Interpreter, java.util.concurrent.locks.ReentrantLock> interpreterLocks = null;
    private static final java.util.concurrent.ConcurrentHashMap.KeySetView<java.lang.String, java.lang.Boolean> invalidProcessWarnings = null;
    private static final java.util.ArrayList<eb.z> loadedNativeLibraries = null;
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, eb.a0> loadedPlugins = null;
    private static final android.os.Handler mainHandler = null;
    private static final java.lang.Object nativeLoadLock = null;
    private static final java.util.concurrent.atomic.AtomicLong nativeLoadSequence = null;
    private static final java.util.concurrent.CopyOnWriteArrayList<fg.a> pluginCatalogListeners = null;
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, android.os.FileObserver> pluginDirObservers = null;
    private static final java.util.concurrent.ThreadPoolExecutor protobufCallbackExecutor = null;
    private static final java.util.concurrent.atomic.AtomicLong protobufDropLogAt = null;
    private static final java.util.concurrent.atomic.AtomicLong protobufDroppedPacketCount = null;
    private static final java.lang.Object protobufListenerLock = null;
    private static final java.util.concurrent.atomic.AtomicBoolean protobufListenerRegistered = null;
    private static final wa.i protobufPacketListener = null;
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Runnable> reloadTasks = null;
    private static volatile java.lang.String runtimeProcess;
    private static volatile java.lang.String runtimeProcessName;
    private static volatile android.os.FileObserver scriptRootObserver;
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> sendButtonDiagnosticLogAt = null;
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.atomic.AtomicBoolean> snsPrepareCancellations = null;
    private static final java.util.concurrent.ThreadPoolExecutor snsPrepareExecutor = null;
    private static final java.util.concurrent.atomic.AtomicLong snsPrepareSequence = null;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class SendResult {
        public static final int $stable = 0;
        private final java.lang.String message;
        private final boolean success;

        public SendResult(boolean r1, java.lang.String r2) {
                r0 = this;
                r2.getClass()
                r0.<init>()
                r0.success = r1
                r0.message = r2
                return
        }

        public final java.lang.String getMessage() {
                r1 = this;
                java.lang.String r0 = r1.message
                return r0
        }

        public final boolean isSuccess() {
                r1 = this;
                boolean r0 = r1.success
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                boolean r0 = r4.success
                java.lang.String r1 = r4.message
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "SendResult(success="
                r2.<init>(r3)
                r2.append(r0)
                java.lang.String r0 = ", message="
                r2.append(r0)
                r2.append(r1)
                java.lang.String r0 = ")"
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                return r0
        }
    }

    static {
            h.Hchat.hooks.items.script.ScriptPluginRuntime r0 = new h.Hchat.hooks.items.script.ScriptPluginRuntime
            r0.<init>()
            h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE = r0
            og.k r0 = new og.k
            java.lang.String r1 = "^\\..+\\.agent-(?:new|old|copy)-[A-Za-z0-9]+$"
            r0.<init>(r1)
            h.Hchat.hooks.items.script.ScriptPluginRuntime.AGENT_TRANSACTION_DIRECTORY = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            h.Hchat.hooks.items.script.ScriptPluginRuntime.nativeLoadLock = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedNativeLibraries = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            h.Hchat.hooks.items.script.ScriptPluginRuntime.nativeLoadSequence = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r0.<init>(r3)
            h.Hchat.hooks.items.script.ScriptPluginRuntime.initialLoadStarted = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            h.Hchat.hooks.items.script.ScriptPluginRuntime.invalidProcessWarnings = r0
            og.k r0 = new og.k
            java.lang.String r4 = "[A-Za-z_][A-Za-z0-9_]*"
            r0.<init>(r4)
            h.Hchat.hooks.items.script.ScriptPluginRuntime.SCRIPT_FUNCTION_NAME = r0
            java.lang.String r0 = "main"
            h.Hchat.hooks.items.script.ScriptPluginRuntime.runtimeProcess = r0
            java.lang.String r0 = ""
            h.Hchat.hooks.items.script.ScriptPluginRuntime.runtimeProcessName = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedPlugins = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            h.Hchat.hooks.items.script.ScriptPluginRuntime.pluginDirObservers = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            h.Hchat.hooks.items.script.ScriptPluginRuntime.pluginCatalogListeners = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            h.Hchat.hooks.items.script.ScriptPluginRuntime.reloadTasks = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            h.Hchat.hooks.items.script.ScriptPluginRuntime.interpreterLocks = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            h.Hchat.hooks.items.script.ScriptPluginRuntime.sendButtonDiagnosticLogAt = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r0.<init>(r4)
            h.Hchat.hooks.items.script.ScriptPluginRuntime.mainHandler = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            h.Hchat.hooks.items.script.ScriptPluginRuntime.protobufListenerLock = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r3)
            h.Hchat.hooks.items.script.ScriptPluginRuntime.protobufListenerRegistered = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>(r1)
            h.Hchat.hooks.items.script.ScriptPluginRuntime.protobufDroppedPacketCount = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>(r1)
            h.Hchat.hooks.items.script.ScriptPluginRuntime.protobufDropLogAt = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>(r1)
            h.Hchat.hooks.items.script.ScriptPluginRuntime.imageDownloadDroppedCount = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>(r1)
            h.Hchat.hooks.items.script.ScriptPluginRuntime.imageDownloadDropLogAt = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>(r1)
            h.Hchat.hooks.items.script.ScriptPluginRuntime.snsPrepareSequence = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            h.Hchat.hooks.items.script.ScriptPluginRuntime.snsPrepareCancellations = r0
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.ArrayBlockingQueue r7 = new java.util.concurrent.ArrayBlockingQueue
            r0 = 32
            r7.<init>(r0)
            c9.q r8 = new c9.q
            r2 = 6
            r8.<init>(r2)
            java.util.concurrent.ThreadPoolExecutor$AbortPolicy r9 = new java.util.concurrent.ThreadPoolExecutor$AbortPolicy
            r9.<init>()
            r2 = 2
            r3 = 2
            r4 = 0
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MILLISECONDS
            r6 = r15
            r1.<init>(r2, r3, r4, r6, r7, r8, r9)
            h.Hchat.hooks.items.script.ScriptPluginRuntime.snsPrepareExecutor = r1
            java.util.concurrent.ThreadPoolExecutor r10 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.ArrayBlockingQueue r1 = new java.util.concurrent.ArrayBlockingQueue
            r2 = 128(0x80, float:1.8E-43)
            r1.<init>(r2)
            c9.q r2 = new c9.q
            r3 = 7
            r2.<init>(r3)
            java.util.concurrent.ThreadPoolExecutor$AbortPolicy r18 = new java.util.concurrent.ThreadPoolExecutor$AbortPolicy
            r18.<init>()
            r11 = 1
            r12 = 1
            r13 = 0
            r16 = r1
            r17 = r2
            r10.<init>(r11, r12, r13, r15, r16, r17, r18)
            h.Hchat.hooks.items.script.ScriptPluginRuntime.protobufCallbackExecutor = r10
            java.util.concurrent.ThreadPoolExecutor r10 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.ArrayBlockingQueue r1 = new java.util.concurrent.ArrayBlockingQueue
            r1.<init>(r0)
            c9.q r0 = new c9.q
            r2 = 8
            r0.<init>(r2)
            java.util.concurrent.ThreadPoolExecutor$AbortPolicy r18 = new java.util.concurrent.ThreadPoolExecutor$AbortPolicy
            r18.<init>()
            r11 = 2
            r12 = 2
            r17 = r0
            r16 = r1
            r10.<init>(r11, r12, r13, r15, r16, r17, r18)
            h.Hchat.hooks.items.script.ScriptPluginRuntime.imageDownloadCallbackExecutor = r10
            eb.x r0 = new eb.x
            r0.<init>()
            h.Hchat.hooks.items.script.ScriptPluginRuntime.protobufPacketListener = r0
            return
    }

    private ScriptPluginRuntime() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(h.Hchat.hooks.items.protobuf.ProtobufPacketRuntime$Packet r0) {
            protobufPacketListener$lambda$0(r0)
            return
    }

    public static final /* synthetic */ java.util.concurrent.CopyOnWriteArrayList access$getPluginCatalogListeners$p() {
            java.util.concurrent.CopyOnWriteArrayList<fg.a> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.pluginCatalogListeners
            return r0
    }

    public static final /* synthetic */ boolean access$isPluginDirectory(h.Hchat.hooks.items.script.ScriptPluginRuntime r0, java.io.File r1) {
            boolean r0 = r0.isPluginDirectory(r1)
            return r0
    }

    public static final /* synthetic */ void access$notifyPluginCatalogChanged(h.Hchat.hooks.items.script.ScriptPluginRuntime r0) {
            r0.notifyPluginCatalogChanged()
            return
    }

    public static final /* synthetic */ void access$refreshPluginDirObservers(h.Hchat.hooks.items.script.ScriptPluginRuntime r0, java.io.File r1) {
            r0.refreshPluginDirObservers(r1)
            return
    }

    public static final /* synthetic */ void access$schedulePluginReload(h.Hchat.hooks.items.script.ScriptPluginRuntime r0, java.lang.String r1) {
            r0.schedulePluginReload(r1)
            return
    }

    private final boolean awaitScriptApiReady(android.content.Context r8) {
            r7 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 30000(0x7530, double:1.4822E-319)
            long r0 = r0 + r2
            r2 = 250(0xfa, double:1.235E-321)
        L9:
            long r4 = android.os.SystemClock.elapsedRealtime()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r5 = 0
            if (r4 >= 0) goto L2f
            boolean r4 = r7.isPluginRuntimeEnabled(r8)
            if (r4 != 0) goto L19
            return r5
        L19:
            boolean r4 = r7.isScriptApiReady()
            if (r4 == 0) goto L21
            r8 = 1
            return r8
        L21:
            android.os.SystemClock.sleep(r2)
            r4 = 2
            long r2 = r2 * r4
            r4 = 2000(0x7d0, double:9.88E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L9
            r2 = r4
            goto L9
        L2f:
            return r5
    }

    public static /* synthetic */ java.lang.Long b(eb.u r0, java.lang.Object r1, java.lang.Object r2) {
            java.lang.Long r0 = logSendButtonDiagnostic$lambda$1(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.Thread c(java.lang.Runnable r0) {
            java.lang.Thread r0 = imageDownloadCallbackExecutor$lambda$0(r0)
            return r0
    }

    private final void callLifecycle(bsh.Interpreter r3, java.lang.String r4) {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.interpreterLock(r3)     // Catch: java.lang.Throwable -> L20
            r0.lock()     // Catch: java.lang.Throwable -> L20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            r1.append(r4)     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = "();"
            r1.append(r4)     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L22
            java.lang.Object r3 = r3.eval(r4)     // Catch: java.lang.Throwable -> L22
            r0.unlock()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r3 = move-exception
            goto L27
        L22:
            r3 = move-exception
            r0.unlock()     // Catch: java.lang.Throwable -> L20
            throw r3     // Catch: java.lang.Throwable -> L20
        L27:
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L2d:
            java.lang.Throwable r3 = sf.g.b(r3)
            if (r3 == 0) goto L56
            java.lang.String r4 = r3.getMessage()
            if (r4 != 0) goto L3b
            java.lang.String r4 = ""
        L3b:
            java.lang.String r0 = "Command not found"
            r1 = 1
            boolean r0 = og.m.h0(r4, r0, r1)
            if (r0 != 0) goto L56
            java.lang.String r0 = "undefined"
            boolean r0 = og.m.h0(r4, r0, r1)
            if (r0 != 0) goto L56
            java.lang.String r0 = "not found"
            boolean r4 = og.m.h0(r4, r0, r1)
            if (r4 == 0) goto L55
            goto L56
        L55:
            throw r3
        L56:
            return
    }

    private final java.lang.String callbackWrapper(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            og.k r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.SCRIPT_FUNCTION_NAME
            boolean r0 = r0.d(r4)
            if (r0 == 0) goto Lc2
            boolean r0 = gg.l.a(r3, r4)
            if (r0 != 0) goto Lb7
            int r0 = r3.hashCode()
            java.lang.String r1 = "(); }"
            switch(r0) {
                case -1013170331: goto L9d;
                case -1000790721: goto L8c;
                case -846243918: goto L7b;
                case -644272284: goto L6a;
                case -372024179: goto L5b;
                case 33320218: goto L4a;
                case 207634059: goto L39;
                case 1110522473: goto L28;
                case 1557968318: goto L19;
                default: goto L17;
            }
        L17:
            goto Lac
        L19:
            java.lang.String r0 = "onUnload"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lac
            java.lang.String r3 = "void onUnload() { "
            java.lang.String r3 = eh.a.n(r3, r4, r1)
            return r3
        L28:
            java.lang.String r0 = "onMemberChange"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lac
            java.lang.String r3 = "void onMemberChange(String type, String groupWxid, String userWxid, String userName) { "
            java.lang.String r0 = "(type, groupWxid, userWxid, userName); }"
            java.lang.String r3 = eh.a.n(r3, r4, r0)
            return r3
        L39:
            java.lang.String r0 = "onClickSendBtn"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lac
            java.lang.String r3 = "boolean onClickSendBtn(String text) { return Boolean.TRUE.equals("
            java.lang.String r0 = "(text)); }"
            java.lang.String r3 = eh.a.n(r3, r4, r0)
            return r3
        L4a:
            java.lang.String r0 = "onHandleMsg"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lac
            java.lang.String r3 = "void onHandleMsg(Object msg) { "
            java.lang.String r0 = "(msg); }"
            java.lang.String r3 = eh.a.n(r3, r4, r0)
            return r3
        L5b:
            java.lang.String r0 = "openSettings"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lac
            java.lang.String r3 = "void openSettings() { "
            java.lang.String r3 = eh.a.n(r3, r4, r1)
            return r3
        L6a:
            java.lang.String r0 = "onImageDownload"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lac
            java.lang.String r3 = "void onImageDownload(Object msg, String imagePath, String talker, String senderWxid) { "
            java.lang.String r0 = "(msg, imagePath, talker, senderWxid); }"
            java.lang.String r3 = eh.a.n(r3, r4, r0)
            return r3
        L7b:
            java.lang.String r0 = "onProtobufPacket"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lac
            java.lang.String r3 = "void onProtobufPacket(Object packet) { "
            java.lang.String r0 = "(packet); }"
            java.lang.String r3 = eh.a.n(r3, r4, r0)
            return r3
        L8c:
            java.lang.String r0 = "onNewFriend"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lac
            java.lang.String r3 = "void onNewFriend(String wxid, String ticket, int scene) { "
            java.lang.String r0 = "(wxid, ticket, scene); }"
            java.lang.String r3 = eh.a.n(r3, r4, r0)
            return r3
        L9d:
            java.lang.String r0 = "onLoad"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lac
            java.lang.String r3 = "void onLoad() { "
            java.lang.String r3 = eh.a.n(r3, r4, r1)
            return r3
        Lac:
            java.lang.String r4 = "不支持的回调名: "
            java.lang.String r3 = r4.concat(r3)
            j8.o.t(r3)
            r3 = 0
            return r3
        Lb7:
            java.lang.String r4 = "回调别名不能指向自身: "
            java.lang.String r3 = wb.en.g(r4, r3)
            j8.o.q(r3)
            r3 = 0
            return r3
        Lc2:
            java.lang.String r3 = "非法函数名: "
            java.lang.String r3 = wb.en.g(r3, r4)
            j8.o.q(r3)
            r3 = 0
            return r3
    }

    private final void cancelSnsPrepareTasks(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = ":"
            java.lang.String r5 = bc.e.i(r5, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.atomic.AtomicBoolean> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.snsPrepareCancellations
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            r3 = 0
            boolean r2 = og.t.d0(r2, r5, r3)
            if (r2 == 0) goto L10
            r2 = 1
            r1.set(r2)
            goto L10
        L34:
            return
    }

    private final void copyNativeLibrary(java.io.File r12, java.io.File r13, java.lang.String r14) {
            r11 = this;
            java.lang.String r0 = "无法写入Native缓存: "
            java.lang.String r1 = "无法替换Native缓存: "
            java.lang.String r2 = "Native缓存复制校验失败: "
            java.lang.String r3 = "Native缓存复制不完整: "
            java.io.File r4 = new java.io.File
            java.io.File r5 = r13.getParentFile()
            java.lang.String r6 = r13.getName()
            int r7 = android.os.Process.myPid()
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            long r8 = r8.getId()
            java.lang.String r10 = "."
            java.lang.StringBuilder r6 = eh.a.u(r7, r10, r6, r10, r10)
            java.lang.String r7 = ".tmp"
            java.lang.String r6 = eh.a.p(r6, r8, r7)
            r4.<init>(r5, r6)
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L8e
            r6 = 0
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> L8e
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Le4
            r6.<init>(r12)     // Catch: java.lang.Throwable -> Le4
            g4.a.j(r6, r5)     // Catch: java.lang.Throwable -> Le6
            r6.close()     // Catch: java.lang.Throwable -> Le4
            java.io.FileDescriptor r6 = r5.getFD()     // Catch: java.lang.Throwable -> Le4
            r6.sync()     // Catch: java.lang.Throwable -> Le4
            r5.close()     // Catch: java.lang.Throwable -> L8e
            long r5 = r4.length()     // Catch: java.lang.Throwable -> L8e
            long r7 = r12.length()     // Catch: java.lang.Throwable -> L8e
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto Lca
            java.lang.String r3 = r11.sha256(r4)     // Catch: java.lang.Throwable -> L8e
            boolean r14 = gg.l.a(r3, r14)     // Catch: java.lang.Throwable -> L8e
            if (r14 == 0) goto Lb0
            java.lang.String r12 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r14 = r13.getAbsolutePath()     // Catch: java.lang.Throwable -> L6a
            android.system.Os.rename(r12, r14)     // Catch: java.lang.Throwable -> L6a
            goto L96
        L6a:
            r12 = move-exception
            boolean r14 = r13.exists()     // Catch: java.lang.Throwable -> L8e
            if (r14 == 0) goto L90
            boolean r14 = r13.delete()     // Catch: java.lang.Throwable -> L8e
            if (r14 == 0) goto L78
            goto L90
        L78:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8e
            java.lang.String r13 = r13.getAbsolutePath()     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L8e
            r0.append(r13)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r13 = r0.toString()     // Catch: java.lang.Throwable -> L8e
            r14.<init>(r13, r12)     // Catch: java.lang.Throwable -> L8e
            throw r14     // Catch: java.lang.Throwable -> L8e
        L8e:
            r12 = move-exception
            goto Lf3
        L90:
            boolean r14 = r4.renameTo(r13)     // Catch: java.lang.Throwable -> L8e
            if (r14 == 0) goto L9a
        L96:
            r4.delete()
            return
        L9a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8e
            java.lang.String r13 = r13.getAbsolutePath()     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L8e
            r1.append(r13)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r13 = r1.toString()     // Catch: java.lang.Throwable -> L8e
            r14.<init>(r13, r12)     // Catch: java.lang.Throwable -> L8e
            throw r14     // Catch: java.lang.Throwable -> L8e
        Lb0:
            java.lang.String r12 = r12.getName()     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r13.<init>(r2)     // Catch: java.lang.Throwable -> L8e
            r13.append(r12)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r12 = r13.toString()     // Catch: java.lang.Throwable -> L8e
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L8e
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L8e
            r13.<init>(r12)     // Catch: java.lang.Throwable -> L8e
            throw r13     // Catch: java.lang.Throwable -> L8e
        Lca:
            java.lang.String r12 = r12.getName()     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r13.<init>(r3)     // Catch: java.lang.Throwable -> L8e
            r13.append(r12)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r12 = r13.toString()     // Catch: java.lang.Throwable -> L8e
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L8e
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L8e
            r13.<init>(r12)     // Catch: java.lang.Throwable -> L8e
            throw r13     // Catch: java.lang.Throwable -> L8e
        Le4:
            r12 = move-exception
            goto Led
        Le6:
            r12 = move-exception
            throw r12     // Catch: java.lang.Throwable -> Le8
        Le8:
            r13 = move-exception
            ig.a.i(r6, r12)     // Catch: java.lang.Throwable -> Le4
            throw r13     // Catch: java.lang.Throwable -> Le4
        Led:
            throw r12     // Catch: java.lang.Throwable -> Lee
        Lee:
            r13 = move-exception
            ig.a.i(r5, r12)     // Catch: java.lang.Throwable -> L8e
            throw r13     // Catch: java.lang.Throwable -> L8e
        Lf3:
            r4.delete()
            throw r12
    }

    private final h.Hchat.hooks.items.script.ScriptPluginBridge currentBridge(android.content.Context r9) {
            r8 = this;
            h.Hchat.hooks.items.script.ScriptPluginBridge r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.bridge
            if (r0 == 0) goto L5
            return r0
        L5:
            h.Hchat.hooks.items.script.ScriptPluginBridge r1 = new h.Hchat.hooks.items.script.ScriptPluginBridge
            android.content.Context r0 = r9.getApplicationContext()
            if (r0 == 0) goto Lf
            r2 = r0
            goto L10
        Lf:
            r2 = r9
        L10:
            java.lang.ClassLoader r3 = r9.getClassLoader()
            r3.getClass()
            java.io.File r4 = r8.scriptDir(r9)
            r6 = 8
            r7 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            h.Hchat.hooks.items.script.ScriptPluginRuntime.bridge = r1
            return r1
    }

    public static /* synthetic */ void d(android.content.Context r0, h.Hchat.hooks.items.script.ScriptPluginBridge r1) {
            installAppBrandProcess$lambda$0(r0, r1)
            return
    }

    private final void deliverProtobufSendResult(java.util.function.Consumer<h.Hchat.hooks.items.script.ScriptPluginRuntime.SendResult> r2, boolean r3, java.lang.String r4) {
            r1 = this;
            if (r2 != 0) goto L3
            goto L2a
        L3:
            h.Hchat.hooks.items.script.ScriptPluginRuntime$SendResult r0 = new h.Hchat.hooks.items.script.ScriptPluginRuntime$SendResult     // Catch: java.lang.Throwable -> La
            if (r4 != 0) goto Lc
            java.lang.String r4 = ""
            goto Lc
        La:
            r2 = move-exception
            goto L15
        Lc:
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> La
            r2.accept(r0)     // Catch: java.lang.Throwable -> La
            sf.n r2 = sf.n.f12433a     // Catch: java.lang.Throwable -> La
            goto L1b
        L15:
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L1b:
            java.lang.Throwable r2 = sf.g.b(r2)
            if (r2 == 0) goto L2a
            java.lang.String r3 = r2.getMessage()
            java.lang.String r4 = "[Hchat:Script] 数据包发送结果回调失败: "
            eh.a.x(r4, r3, r2)
        L2a:
            return
    }

    private final eb.y detectCallbacks(bsh.Interpreter r9) {
            r8 = this;
            bsh.NameSpace r9 = r9.getNameSpace()     // Catch: java.lang.Throwable -> L21
            bsh.BshMethod[] r9 = r9.getMethods()     // Catch: java.lang.Throwable -> L21
            r9.getClass()     // Catch: java.lang.Throwable -> L21
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L21
            int r1 = r9.length     // Catch: java.lang.Throwable -> L21
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L21
            int r1 = r9.length     // Catch: java.lang.Throwable -> L21
            r2 = 0
        L13:
            if (r2 >= r1) goto L24
            r3 = r9[r2]     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L21
            r0.add(r3)     // Catch: java.lang.Throwable -> L21
            int r2 = r2 + 1
            goto L13
        L21:
            r0 = move-exception
            r9 = r0
            goto L29
        L24:
            java.util.Set r9 = tf.m.U1(r0)     // Catch: java.lang.Throwable -> L21
            goto L2f
        L29:
            sf.f r0 = new sf.f
            r0.<init>(r9)
            r9 = r0
        L2f:
            boolean r0 = r9 instanceof sf.f
            if (r0 == 0) goto L36
            tf.v r9 = tf.v.f13169g
        L36:
            java.util.Set r9 = (java.util.Set) r9
            eb.y r0 = new eb.y
            java.lang.String r1 = "onClickSendBtn"
            boolean r1 = r9.contains(r1)
            java.lang.String r2 = "onHandleMsg"
            boolean r2 = r9.contains(r2)
            java.lang.String r3 = "openSettings"
            boolean r3 = r9.contains(r3)
            java.lang.String r4 = "onMemberChange"
            boolean r4 = r9.contains(r4)
            java.lang.String r5 = "onNewFriend"
            boolean r5 = r9.contains(r5)
            java.lang.String r6 = "onProtobufPacket"
            boolean r6 = r9.contains(r6)
            java.lang.String r7 = "onImageDownload"
            boolean r7 = r9.contains(r7)
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    private final eb.y detectCallbacks(java.lang.String r11) {
            r10 = this;
            java.lang.String r0 = "onClickSendBtn"
            java.lang.String r1 = "useOnClickSendBtn"
            boolean r3 = r10.scriptHasCallback(r11, r0, r1)
            java.lang.String r0 = "onHandleMsg"
            java.lang.String r1 = "useOnHandleMsg"
            boolean r4 = r10.scriptHasCallback(r11, r0, r1)
            java.lang.String r0 = "openSettings"
            java.lang.String r1 = "useOpenSettings"
            boolean r5 = r10.scriptHasCallback(r11, r0, r1)
            java.lang.String r0 = "onMemberChange"
            java.lang.String r1 = "useOnMemberChange"
            boolean r6 = r10.scriptHasCallback(r11, r0, r1)
            java.lang.String r0 = "onNewFriend"
            java.lang.String r1 = "useOnNewFriend"
            boolean r7 = r10.scriptHasCallback(r11, r0, r1)
            java.lang.String r0 = "onProtobufPacket"
            java.lang.String r1 = "useOnProtobufPacket"
            boolean r8 = r10.scriptHasCallback(r11, r0, r1)
            java.lang.String r0 = "onImageDownload"
            java.lang.String r1 = "useOnImageDownload"
            boolean r9 = r10.scriptHasCallback(r11, r0, r1)
            eb.y r2 = new eb.y
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
    }

    private static final boolean dispatchOnClickSendBtn$lambda$0(eb.a0 r0) {
            r0.getClass()
            boolean r0 = r0.f2488c
            return r0
    }

    private static final boolean dispatchOnHandleMsg$lambda$0(eb.a0 r0) {
            r0.getClass()
            boolean r0 = r0.f2489d
            return r0
    }

    private static final void dispatchOnImageDownload$lambda$2(h.Hchat.hooks.items.script.ScriptPluginBridge r8, h.Hchat.hooks.items.script.ScriptMessageBean r9, java.lang.Object r10) {
            h.Hchat.hooks.items.script.ScriptPluginRuntime r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            java.lang.String r8 = r0.downloadCallbackImage(r8, r9, r10)
            if (r8 == 0) goto L111
            java.util.concurrent.ConcurrentHashMap<java.lang.String, eb.a0> r10 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedPlugins
            java.util.Collection r10 = r10.values()
            r10.getClass()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            dg.n r0 = new dg.n
            r1 = 6
            r0.<init>(r10, r1)
            e9.h r10 = new e9.h
            r1 = 14
            r10.<init>(r1)
            ng.i r1 = new ng.i
            r2 = 1
            r1.<init>(r0, r2, r10)
            a9.h r10 = new a9.h
            r0 = 13
            r10.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ng.m.a0(r1, r0)
            tf.q.g1(r0, r10)
            java.util.Iterator r10 = r0.iterator()
            boolean r0 = r10.hasNext()
            if (r0 != 0) goto L45
            tf.t r10 = tf.t.f13167g
            goto L6b
        L45:
            java.lang.Object r0 = r10.next()
            boolean r1 = r10.hasNext()
            if (r1 != 0) goto L54
            java.util.List r10 = a.a.x0(r0)
            goto L6b
        L54:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
        L5c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r10.next()
            r1.add(r0)
            goto L5c
        L6a:
            r10 = r1
        L6b:
            java.lang.String r0 = r9.getTalker()
            java.lang.String r1 = r9.getSendTalker()
            java.util.Iterator r10 = r10.iterator()
        L77:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L111
            java.lang.Object r2 = r10.next()
            r2.getClass()
            eb.a0 r2 = (eb.a0) r2
            java.util.concurrent.ConcurrentHashMap<java.lang.String, eb.a0> r3 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedPlugins
            eb.c0 r4 = r2.f2486a
            java.lang.String r4 = r4.f2506a
            java.lang.Object r4 = r3.get(r4)
            if (r4 == r2) goto L93
            goto L77
        L93:
            h.Hchat.hooks.items.script.ScriptPluginRuntime r4 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE     // Catch: java.lang.Throwable -> Ld0
            bsh.Interpreter r5 = r2.f2487b     // Catch: java.lang.Throwable -> Ld0
            java.util.concurrent.locks.ReentrantLock r4 = r4.interpreterLock(r5)     // Catch: java.lang.Throwable -> Ld0
            r4.lock()     // Catch: java.lang.Throwable -> Ld0
            eb.c0 r5 = r2.f2486a     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r5 = r5.f2506a     // Catch: java.lang.Throwable -> Ld2
            java.lang.Object r3 = r3.get(r5)     // Catch: java.lang.Throwable -> Ld2
            if (r3 == r2) goto La9
            goto Lcc
        La9:
            bsh.Interpreter r3 = r2.f2487b     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r5 = "__hchat_image_msg_info"
            r3.set(r5, r9)     // Catch: java.lang.Throwable -> Ld2
            bsh.Interpreter r3 = r2.f2487b     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r5 = "__hchat_image_path"
            r3.set(r5, r8)     // Catch: java.lang.Throwable -> Ld2
            bsh.Interpreter r3 = r2.f2487b     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r5 = "__hchat_image_talker"
            r3.set(r5, r0)     // Catch: java.lang.Throwable -> Ld2
            bsh.Interpreter r3 = r2.f2487b     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r5 = "__hchat_image_sender"
            r3.set(r5, r1)     // Catch: java.lang.Throwable -> Ld2
            bsh.Interpreter r3 = r2.f2487b     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r5 = "onImageDownload(__hchat_image_msg_info, __hchat_image_path, __hchat_image_talker, __hchat_image_sender);"
            r3.eval(r5)     // Catch: java.lang.Throwable -> Ld2
        Lcc:
            r4.unlock()     // Catch: java.lang.Throwable -> Ld0
            goto L77
        Ld0:
            r3 = move-exception
            goto Ld7
        Ld2:
            r3 = move-exception
            r4.unlock()     // Catch: java.lang.Throwable -> Ld0
            throw r3     // Catch: java.lang.Throwable -> Ld0
        Ld7:
            h.Hchat.hooks.items.script.ScriptPluginRuntime r4 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            java.lang.String r5 = "onImageDownload"
            boolean r4 = r4.isMissingCallbackError(r3, r5)
            if (r4 != 0) goto L77
            eb.c0 r4 = r2.f2486a
            java.lang.String r4 = r4.f2507b
            java.lang.String r5 = r3.getMessage()
            java.lang.String r6 = "[Hchat:Script] 图片下载回调失败: "
            java.lang.String r7 = " "
            eh.a.w(r6, r4, r7, r5, r3)
            h.Hchat.hooks.items.script.ScriptPluginBridge r4 = h.Hchat.hooks.items.script.ScriptPluginRuntime.bridge
            if (r4 == 0) goto L77
            eb.c0 r2 = r2.f2486a
            java.lang.String r5 = r2.f2507b
            java.io.File r2 = r2.f2508c
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "图片下载回调失败: "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r4.log(r5, r2, r3)
            goto L77
        L111:
            return
    }

    private static final boolean dispatchOnImageDownload$lambda$2$0(eb.a0 r0) {
            r0.getClass()
            boolean r0 = r0.f2494i
            return r0
    }

    private static final boolean dispatchOnMemberChange$lambda$0(eb.a0 r0) {
            r0.getClass()
            boolean r0 = r0.f2491f
            return r0
    }

    private static final boolean dispatchOnNewFriend$lambda$0(eb.a0 r0) {
            r0.getClass()
            boolean r0 = r0.f2492g
            return r0
    }

    private static final void dispatchOnProtobufPacket$lambda$1(h.Hchat.hooks.items.protobuf.ProtobufPacketRuntime$Packet r7) {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, eb.a0> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedPlugins
            java.util.Collection r0 = r0.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            dg.n r1 = new dg.n
            r2 = 6
            r1.<init>(r0, r2)
            e9.h r0 = new e9.h
            r2 = 18
            r0.<init>(r2)
            ng.i r2 = new ng.i
            r3 = 1
            r2.<init>(r1, r3, r0)
            a9.h r0 = new a9.h
            r1 = 16
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            ng.m.a0(r2, r1)
            tf.q.g1(r1, r0)
            java.util.Iterator r0 = r1.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L3d
            tf.t r0 = tf.t.f13167g
            goto L63
        L3d:
            java.lang.Object r1 = r0.next()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L4c
            java.util.List r0 = a.a.x0(r1)
            goto L63
        L4c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r1)
        L54:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L62
            java.lang.Object r1 = r0.next()
            r2.add(r1)
            goto L54
        L62:
            r0 = r2
        L63:
            java.util.Iterator r0 = r0.iterator()
        L67:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ldc
            java.lang.Object r1 = r0.next()
            r1.getClass()
            eb.a0 r1 = (eb.a0) r1
            java.util.concurrent.ConcurrentHashMap<java.lang.String, eb.a0> r2 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedPlugins
            eb.c0 r3 = r1.f2486a
            java.lang.String r3 = r3.f2506a
            java.lang.Object r2 = r2.get(r3)
            if (r2 == r1) goto L83
            goto L67
        L83:
            h.Hchat.hooks.items.script.ScriptPluginRuntime r2 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE     // Catch: java.lang.Throwable -> La0
            bsh.Interpreter r3 = r1.f2487b     // Catch: java.lang.Throwable -> La0
            java.util.concurrent.locks.ReentrantLock r2 = r2.interpreterLock(r3)     // Catch: java.lang.Throwable -> La0
            r2.lock()     // Catch: java.lang.Throwable -> La0
            bsh.Interpreter r3 = r1.f2487b     // Catch: java.lang.Throwable -> La2
            java.lang.String r4 = "__hchat_protobuf_packet"
            r3.set(r4, r7)     // Catch: java.lang.Throwable -> La2
            bsh.Interpreter r3 = r1.f2487b     // Catch: java.lang.Throwable -> La2
            java.lang.String r4 = "onProtobufPacket(__hchat_protobuf_packet);"
            r3.eval(r4)     // Catch: java.lang.Throwable -> La2
            r2.unlock()     // Catch: java.lang.Throwable -> La0
            goto L67
        La0:
            r2 = move-exception
            goto La7
        La2:
            r3 = move-exception
            r2.unlock()     // Catch: java.lang.Throwable -> La0
            throw r3     // Catch: java.lang.Throwable -> La0
        La7:
            h.Hchat.hooks.items.script.ScriptPluginRuntime r3 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            java.lang.String r4 = "onProtobufPacket"
            boolean r3 = r3.isMissingCallbackError(r2, r4)
            if (r3 != 0) goto L67
            eb.c0 r3 = r1.f2486a
            java.lang.String r3 = r3.f2507b
            java.lang.String r4 = r2.getMessage()
            java.lang.String r5 = "[Hchat:Script] 数据包监听回调失败: "
            java.lang.String r6 = " "
            eh.a.w(r5, r3, r6, r4, r2)
            h.Hchat.hooks.items.script.ScriptPluginBridge r3 = h.Hchat.hooks.items.script.ScriptPluginRuntime.bridge
            if (r3 == 0) goto L67
            eb.c0 r1 = r1.f2486a
            java.lang.String r4 = r1.f2507b
            java.io.File r1 = r1.f2508c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "数据包监听回调失败: "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r3.log(r4, r1, r2)
            goto L67
        Ldc:
            return
    }

    private static final boolean dispatchOnProtobufPacket$lambda$1$0(eb.a0 r0) {
            r0.getClass()
            boolean r0 = r0.f2493h
            return r0
    }

    private final java.lang.String downloadCallbackImage(h.Hchat.hooks.items.script.ScriptPluginBridge r15, h.Hchat.hooks.items.script.ScriptMessageBean r16, java.lang.Object r17) {
            r14 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r15.getScriptDir()
            java.io.File r1 = r1.getParentFile()
            if (r1 == 0) goto Ld
            goto L11
        Ld:
            java.io.File r1 = r15.getScriptDir()
        L11:
            java.lang.String r2 = "Cache"
            r0.<init>(r1, r2)
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto L1f
            r0.mkdirs()
        L1f:
            long r1 = r16.getMsgId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            long r2 = r1.longValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r6 = 1
            if (r2 <= 0) goto L35
            r2 = r6
            goto L36
        L35:
            r2 = r3
        L36:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r2.booleanValue()
            r7 = 0
            if (r2 == 0) goto L42
            goto L43
        L42:
            r1 = r7
        L43:
            if (r1 == 0) goto L4a
        L45:
            long r1 = r1.longValue()
            goto L70
        L4a:
            long r1 = r16.getCreateTime()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            long r8 = r1.longValue()
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 <= 0) goto L5c
            r2 = r6
            goto L5d
        L5c:
            r2 = r3
        L5d:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L68
            goto L69
        L68:
            r1 = r7
        L69:
            if (r1 == 0) goto L6c
            goto L45
        L6c:
            long r1 = java.lang.System.currentTimeMillis()
        L70:
            java.lang.String r8 = r16.getSendTalker()
            boolean r9 = og.m.t0(r8)
            if (r9 == 0) goto L7e
            java.lang.String r8 = r16.getSender()
        L7e:
            java.lang.String r8 = r14.safeCallbackFilePart(r8)
            java.io.File r9 = new java.io.File
            long r10 = java.lang.System.currentTimeMillis()
            java.lang.String r12 = "Hchat_ImageCallback_"
            java.lang.String r13 = "_"
            java.lang.StringBuilder r1 = eh.a.v(r12, r8, r13, r1)
            r1.append(r13)
            r1.append(r10)
            java.lang.String r2 = ".jpg"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.<init>(r0, r1)
            h.Hchat.hooks.items.script.ScriptWaBridge r0 = new h.Hchat.hooks.items.script.ScriptWaBridge
            r0.<init>(r15)
            java.lang.String r1 = r9.getAbsolutePath()
            r2 = r17
            r0.downloadImg(r2, r1)
            boolean r0 = r9.isFile()
            if (r0 == 0) goto Lbf
            long r0 = r9.length()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lbf
            r3 = r6
        Lbf:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lca
            goto Lcb
        Lca:
            r9 = r7
        Lcb:
            if (r9 == 0) goto Ld2
            java.lang.String r0 = r9.getAbsolutePath()
            return r0
        Ld2:
            return r7
    }

    public static /* synthetic */ boolean e(eb.a0 r0) {
            boolean r0 = dispatchOnProtobufPacket$lambda$1$0(r0)
            return r0
    }

    public static /* synthetic */ void f(java.util.function.Consumer r0, boolean r1, java.lang.String r2) {
            sendProtobufPacket$lambda$1(r0, r1, r2)
            return
    }

    public static /* synthetic */ boolean g(eb.a0 r0) {
            boolean r0 = dispatchOnClickSendBtn$lambda$0(r0)
            return r0
    }

    public static /* synthetic */ boolean h(eb.a0 r0) {
            boolean r0 = dispatchOnNewFriend$lambda$0(r0)
            return r0
    }

    public static /* synthetic */ void i(android.content.Context r0) {
            loadEnabledPluginsWhenReady$lambda$0(r0)
            return
    }

    private static final java.lang.Thread imageDownloadCallbackExecutor$lambda$0(java.lang.Runnable r2) {
            java.lang.String r0 = "Hchat-Script-ImageDownload"
            r1 = 1
            java.lang.Thread r2 = j8.b.n(r0, r1, r2)
            return r2
    }

    public static final void installAppBrandProcess(android.content.Context r9, java.lang.ClassLoader r10, java.lang.String r11) {
            r9.getClass()
            r10.getClass()
            android.content.Context r0 = r9.getApplicationContext()
            if (r0 == 0) goto Le
            r2 = r0
            goto Lf
        Le:
            r2 = r9
        Lf:
            h.Hchat.hooks.items.script.ScriptPluginRuntime r9 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            boolean r0 = r9.isPluginRuntimeEnabled(r2)
            if (r0 != 0) goto L18
            goto L22
        L18:
            java.util.concurrent.atomic.AtomicBoolean r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.initialLoadStarted
            r1 = 0
            r8 = 1
            boolean r0 = r0.compareAndSet(r1, r8)
            if (r0 != 0) goto L23
        L22:
            return
        L23:
            h.Hchat.hooks.items.script.ScriptPluginRuntime.appContext = r2
            java.lang.String r0 = "appbrand"
            h.Hchat.hooks.items.script.ScriptPluginRuntime.runtimeProcess = r0
            if (r11 != 0) goto L2d
            java.lang.String r11 = ""
        L2d:
            h.Hchat.hooks.items.script.ScriptPluginRuntime.runtimeProcessName = r11
            h.Hchat.hooks.items.script.ScriptPluginBridge r1 = new h.Hchat.hooks.items.script.ScriptPluginBridge
            java.io.File r4 = r9.scriptDir(r2)
            r6 = 8
            r7 = 0
            r5 = 0
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            h.Hchat.hooks.items.script.ScriptPluginRuntime.bridge = r1
            java.lang.Thread r9 = new java.lang.Thread
            a1.d r10 = new a1.d
            r11 = 8
            r10.<init>(r2, r11, r1)
            java.lang.String r11 = "Hchat-Script-AppBrand"
            r9.<init>(r10, r11)
            r9.setDaemon(r8)
            r9.start()
            return
    }

    private static final void installAppBrandProcess$lambda$0(android.content.Context r4, h.Hchat.hooks.items.script.ScriptPluginBridge r5) {
            java.lang.String r0 = " "
            java.lang.String r1 = "[Hchat:Script] 小程序进程插件加载失败: "
            h.Hchat.hooks.items.script.ScriptPluginRuntime r2 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r4 = r2.m6loadEnabledAppBrandPluginsgIAlus(r4, r5)     // Catch: java.lang.Throwable -> L1b
            boolean r5 = r4 instanceof sf.f     // Catch: java.lang.Throwable -> L1b
            if (r5 == 0) goto L37
            java.lang.String r5 = h.Hchat.hooks.items.script.ScriptPluginRuntime.runtimeProcessName     // Catch: java.lang.Throwable -> L1b
            java.lang.Throwable r2 = sf.g.b(r4)     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1d
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            r4 = move-exception
            goto L38
        L1d:
            r2 = 0
        L1e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L1b
            r3.append(r5)     // Catch: java.lang.Throwable -> L1b
            r3.append(r0)     // Catch: java.lang.Throwable -> L1b
            r3.append(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L1b
            java.lang.Throwable r4 = sf.g.b(r4)     // Catch: java.lang.Throwable -> L1b
            fb.v0.n(r5, r4)     // Catch: java.lang.Throwable -> L1b
        L37:
            return
        L38:
            java.lang.String r5 = h.Hchat.hooks.items.script.ScriptPluginRuntime.runtimeProcessName
            java.lang.String r1 = r4.getMessage()
            java.lang.String r2 = "[Hchat:Script] 小程序进程插件加载线程异常: "
            eh.a.w(r2, r5, r0, r1, r4)
            return
    }

    private final java.util.concurrent.locks.ReentrantLock interpreterLock(bsh.Interpreter r3) {
            r2 = this;
            java.util.WeakHashMap<bsh.Interpreter, java.util.concurrent.locks.ReentrantLock> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.interpreterLocks
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r3)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            java.util.concurrent.locks.ReentrantLock r1 = new java.util.concurrent.locks.ReentrantLock     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r3 = move-exception
            goto L18
        L14:
            java.util.concurrent.locks.ReentrantLock r1 = (java.util.concurrent.locks.ReentrantLock) r1     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r1
        L18:
            monitor-exit(r0)
            throw r3
    }

    private final boolean isMissingCallbackError(java.lang.Throwable r3, java.lang.String r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.getMessage()
            if (r1 != 0) goto Ld
            java.lang.String r1 = ""
        Ld:
            r0.append(r1)
            java.lang.Throwable r3 = r3.getCause()
            if (r3 == 0) goto L24
            java.lang.String r3 = r3.getMessage()
            if (r3 == 0) goto L24
            r1 = 10
            r0.append(r1)
            r0.append(r3)
        L24:
            java.lang.String r3 = r0.toString()
            r0 = 1
            boolean r4 = og.m.h0(r3, r4, r0)
            r1 = 0
            if (r4 != 0) goto L31
            return r1
        L31:
            java.lang.String r4 = "Command not found"
            boolean r4 = og.m.h0(r3, r4, r0)
            if (r4 != 0) goto L4b
            java.lang.String r4 = "undefined"
            boolean r4 = og.m.h0(r3, r4, r0)
            if (r4 != 0) goto L4b
            java.lang.String r4 = "not found"
            boolean r3 = og.m.h0(r3, r4, r0)
            if (r3 == 0) goto L4a
            goto L4b
        L4a:
            return r1
        L4b:
            return r0
    }

    private final boolean isPluginDirectory(java.io.File r2) {
            r1 = this;
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L17
            og.k r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.AGENT_TRANSACTION_DIRECTORY
            java.lang.String r2 = r2.getName()
            r2.getClass()
            boolean r2 = r0.d(r2)
            if (r2 != 0) goto L17
            r2 = 1
            return r2
        L17:
            r2 = 0
            return r2
    }

    private final boolean isPluginRuntimeEnabled(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "Hchat_script_plugin_config"
            android.content.SharedPreferences r3 = ub.b.c(r3, r0)
            java.lang.String r0 = "script_plugin_enable"
            r1 = 0
            boolean r3 = r3.getBoolean(r0, r1)
            return r3
    }

    private final boolean isScriptApiReady() {
            r5 = this;
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = h.Hchat.hooks.api.core.WeChatApis.database()
            r1 = 0
            if (r0 == 0) goto Le
            java.lang.String r2 = "SELECT name FROM sqlite_master WHERE type='table' AND name IN ('rcontact','chatroom')"
            java.util.List r0 = r0.query(r2, r1)
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 != 0) goto L13
            tf.t r0 = tf.t.f13167g
        L13:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L3c
            java.lang.Object r3 = r0.next()
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r4 = "name"
            java.lang.Object r3 = r3.get(r4)
            if (r3 == 0) goto L35
            java.lang.String r3 = r3.toString()
            goto L36
        L35:
            r3 = r1
        L36:
            if (r3 == 0) goto L1c
            r2.add(r3)
            goto L1c
        L3c:
            java.util.Set r0 = tf.m.U1(r2)
            java.lang.String r1 = "rcontact"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L52
            java.lang.String r1 = "chatroom"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L52
            r0 = 1
            return r0
        L52:
            r0 = 0
            return r0
    }

    public static /* synthetic */ void j(java.util.function.Consumer r0, boolean r1, java.lang.String r2) {
            sendProtobufPacket$lambda$0(r0, r1, r2)
            return
    }

    public static /* synthetic */ void k(h.Hchat.hooks.items.script.ScriptPluginBridge r0, h.Hchat.hooks.items.script.ScriptMessageBean r1, java.lang.Object r2) {
            dispatchOnImageDownload$lambda$2(r0, r1, r2)
            return
    }

    public static /* synthetic */ eb.c0 l(java.io.File r0) {
            eb.c0 r0 = listPlugins$lambda$0(r0)
            return r0
    }

    private static final eb.c0 listPlugins$lambda$0(java.io.File r11) {
            java.io.File r4 = new java.io.File
            java.lang.String r0 = "main.java"
            r4.<init>(r11, r0)
            boolean r0 = r4.isFile()
            r1 = 0
            if (r0 == 0) goto L82
            h.Hchat.hooks.items.script.ScriptPluginRuntime r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            r11.getClass()
            java.util.Properties r2 = r0.readPluginMeta(r11)
            r3 = r1
            java.lang.String r1 = r11.getName()
            r1.getClass()
            java.lang.String r5 = "name"
            java.lang.String r6 = r2.getProperty(r5)
            if (r6 == 0) goto L32
            boolean r7 = og.m.t0(r6)
            if (r7 != 0) goto L2e
            goto L2f
        L2e:
            r6 = r3
        L2f:
            if (r6 == 0) goto L32
            goto L36
        L32:
            java.lang.String r6 = r11.getName()
        L36:
            r6.getClass()
            java.lang.String r7 = "author"
            java.lang.String r7 = r2.getProperty(r7)
            java.lang.String r8 = ""
            if (r7 != 0) goto L44
            r7 = r8
        L44:
            java.lang.String r9 = "version"
            java.lang.String r9 = r2.getProperty(r9)
            if (r9 != 0) goto L4d
            r9 = r8
        L4d:
            java.lang.String r10 = "updateTime"
            java.lang.String r10 = r2.getProperty(r10)
            if (r10 != 0) goto L56
            goto L57
        L56:
            r8 = r10
        L57:
            java.lang.String r5 = r2.getProperty(r5)
            if (r5 == 0) goto L64
            boolean r10 = og.m.t0(r5)
            if (r10 != 0) goto L64
            r3 = r5
        L64:
            r5 = r7
            r7 = r8
            r8 = r3
            java.lang.String r3 = r11.getName()
            r3.getClass()
            java.lang.String r10 = "process"
            java.lang.String r2 = r2.getProperty(r10)
            java.util.Set r0 = r0.parseProcessScope(r3, r2)
            r2 = r6
            r6 = r9
            r9 = r0
            eb.c0 r0 = new eb.c0
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L82:
            r3 = r1
            return r3
    }

    /* JADX INFO: renamed from: loadEnabledAppBrandPlugins-gIAlu-s, reason: not valid java name */
    private final synchronized java.lang.Object m6loadEnabledAppBrandPluginsgIAlus(android.content.Context r11, h.Hchat.hooks.items.script.ScriptPluginBridge r12) {
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = "Hchat_script_plugin_config"
            android.content.SharedPreferences r0 = ub.b.c(r11, r0)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = "script_plugin_enable"
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)     // Catch: java.lang.Throwable -> L8b
            if (r1 != 0) goto L13
        L10:
            r4 = r10
            goto L8e
        L13:
            java.util.List r1 = r10.listPlugins(r11)     // Catch: java.lang.Throwable -> L8b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L8b
        L1b:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L10
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L8b
            r7 = r3
            eb.c0 r7 = (eb.c0) r7     // Catch: java.lang.Throwable -> L8b
            java.lang.String r3 = "appbrand"
            boolean r3 = r10.supportsProcess(r7, r3)     // Catch: java.lang.Throwable -> L8b
            if (r3 != 0) goto L31
            goto L1b
        L31:
            java.lang.String r3 = r7.f2506a     // Catch: java.lang.Throwable -> L8b
            java.lang.String r4 = "script_plugin_item_"
            java.lang.String r3 = r4.concat(r3)     // Catch: java.lang.Throwable -> L8b
            boolean r3 = r0.getBoolean(r3, r2)     // Catch: java.lang.Throwable -> L8b
            if (r3 != 0) goto L40
            goto L1b
        L40:
            r8 = 0
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r12
            java.lang.Object r11 = r4.m8loadPluginyxL6bBk(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L5c
            boolean r12 = r11 instanceof sf.f     // Catch: java.lang.Throwable -> L5c
            if (r12 == 0) goto L88
            java.lang.String r12 = r7.f2507b     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = h.Hchat.hooks.items.script.ScriptPluginRuntime.runtimeProcessName     // Catch: java.lang.Throwable -> L5c
            java.lang.Throwable r7 = sf.g.b(r11)     // Catch: java.lang.Throwable -> L5c
            if (r7 == 0) goto L5f
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L5c
            goto L60
        L5c:
            r0 = move-exception
        L5d:
            r11 = r0
            goto L91
        L5f:
            r7 = 0
        L60:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r8.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r9 = "[Hchat:Script] 小程序进程插件加载失败: "
            r8.append(r9)     // Catch: java.lang.Throwable -> L5c
            r8.append(r12)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r12 = " process="
            r8.append(r12)     // Catch: java.lang.Throwable -> L5c
            r8.append(r3)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r12 = " "
            r8.append(r12)     // Catch: java.lang.Throwable -> L5c
            r8.append(r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r12 = r8.toString()     // Catch: java.lang.Throwable -> L5c
            java.lang.Throwable r11 = sf.g.b(r11)     // Catch: java.lang.Throwable -> L5c
            fb.v0.n(r12, r11)     // Catch: java.lang.Throwable -> L5c
        L88:
            r11 = r5
            r12 = r6
            goto L1b
        L8b:
            r0 = move-exception
            r4 = r10
            goto L5d
        L8e:
            sf.n r11 = sf.n.f12433a     // Catch: java.lang.Throwable -> L5c
            goto L97
        L91:
            sf.f r12 = new sf.f     // Catch: java.lang.Throwable -> L9b
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L9b
            r11 = r12
        L97:
            monitor-exit(r10)
            return r11
        L99:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L9b
            throw r11
        L9b:
            r0 = move-exception
            r11 = r0
            goto L99
    }

    /* JADX INFO: renamed from: loadEnabledPlugins-gIAlu-s, reason: not valid java name */
    private final synchronized java.lang.Object m7loadEnabledPluginsgIAlus(android.content.Context r14, h.Hchat.hooks.items.script.ScriptPluginBridge r15) {
            r13 = this;
            monitor-enter(r13)
            r13.ensureDirs(r14)     // Catch: java.lang.Throwable -> L93
            r13.startPluginObservers(r14)     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = "Hchat_script_plugin_config"
            android.content.SharedPreferences r0 = ub.b.c(r14, r0)     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = "script_plugin_enable"
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)     // Catch: java.lang.Throwable -> L93
            if (r1 != 0) goto L19
            r5 = r13
            goto L99
        L19:
            java.util.List r1 = r13.listPlugins(r14)     // Catch: java.lang.Throwable -> L93
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L93
            r3 = 0
        L22:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L93
            if (r4 == 0) goto L96
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L93
            r8 = r4
            eb.c0 r8 = (eb.c0) r8     // Catch: java.lang.Throwable -> L93
            java.lang.String r4 = "main"
            boolean r4 = r13.supportsProcess(r8, r4)     // Catch: java.lang.Throwable -> L93
            if (r4 != 0) goto L38
            goto L22
        L38:
            java.lang.String r4 = r8.f2506a     // Catch: java.lang.Throwable -> L93
            java.lang.String r5 = "script_plugin_item_"
            java.lang.String r4 = r5.concat(r4)     // Catch: java.lang.Throwable -> L93
            boolean r4 = r0.getBoolean(r4, r2)     // Catch: java.lang.Throwable -> L93
            if (r4 != 0) goto L47
            goto L22
        L47:
            r11 = 16
            r12 = 0
            r9 = 0
            r10 = 0
            r5 = r13
            r6 = r14
            r7 = r15
            java.lang.Object r14 = m9loadPluginyxL6bBk$default(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L8d
            boolean r15 = r14 instanceof sf.f     // Catch: java.lang.Throwable -> L8d
            if (r15 == 0) goto L90
            android.content.SharedPreferences$Editor r15 = r0.edit()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = r8.f2506a     // Catch: java.lang.Throwable -> L8d
            java.lang.String r9 = "script_plugin_item_"
            java.lang.String r4 = r9.concat(r4)     // Catch: java.lang.Throwable -> L8d
            android.content.SharedPreferences$Editor r15 = r15.putBoolean(r4, r2)     // Catch: java.lang.Throwable -> L8d
            r15.apply()     // Catch: java.lang.Throwable -> L8d
            if (r3 != 0) goto L90
            java.lang.Throwable r14 = sf.g.b(r14)     // Catch: java.lang.Throwable -> L8d
            if (r14 == 0) goto L73
            goto L8b
        L73:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8d
            java.lang.String r15 = r8.f2507b     // Catch: java.lang.Throwable -> L8d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r3.<init>()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = "插件加载失败: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L8d
            r3.append(r15)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r15 = r3.toString()     // Catch: java.lang.Throwable -> L8d
            r14.<init>(r15)     // Catch: java.lang.Throwable -> L8d
        L8b:
            r3 = r14
            goto L90
        L8d:
            r0 = move-exception
        L8e:
            r14 = r0
            goto L9d
        L90:
            r14 = r6
            r15 = r7
            goto L22
        L93:
            r0 = move-exception
            r5 = r13
            goto L8e
        L96:
            r5 = r13
            if (r3 != 0) goto L9c
        L99:
            sf.n r14 = sf.n.f12433a     // Catch: java.lang.Throwable -> L8d
            goto La3
        L9c:
            throw r3     // Catch: java.lang.Throwable -> L8d
        L9d:
            sf.f r15 = new sf.f     // Catch: java.lang.Throwable -> La7
            r15.<init>(r14)     // Catch: java.lang.Throwable -> La7
            r14 = r15
        La3:
            monitor-exit(r13)
            return r14
        La5:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> La7
            throw r14
        La7:
            r0 = move-exception
            r14 = r0
            goto La5
    }

    private static final void loadEnabledPluginsWhenReady$lambda$0(android.content.Context r3) {
            java.lang.String r0 = "[Hchat:Script] 自动加载已启用插件失败: "
            h.Hchat.hooks.items.script.ScriptPluginRuntime r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE     // Catch: java.lang.Throwable -> L42
            boolean r2 = r1.awaitScriptApiReady(r3)     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L16
            boolean r3 = r1.isPluginRuntimeEnabled(r3)     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L41
            java.lang.String r3 = "[Hchat:Script] 等待联系人数据库就绪超时，跳过本次自动加载"
            fb.v0.m(r3)     // Catch: java.lang.Throwable -> L42
            return
        L16:
            h.Hchat.hooks.items.script.ScriptPluginBridge r2 = r1.currentBridge(r3)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r3 = r1.m7loadEnabledPluginsgIAlus(r3, r2)     // Catch: java.lang.Throwable -> L42
            boolean r1 = r3 instanceof sf.f     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L41
            java.lang.Throwable r1 = sf.g.b(r3)     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L2d
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L42
            goto L2e
        L2d:
            r1 = 0
        L2e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L42
            r2.append(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L42
            java.lang.Throwable r3 = sf.g.b(r3)     // Catch: java.lang.Throwable -> L42
            fb.v0.n(r0, r3)     // Catch: java.lang.Throwable -> L42
        L41:
            return
        L42:
            r3 = move-exception
            java.lang.String r0 = r3.getMessage()
            java.lang.String r1 = "[Hchat:Script] 自动加载线程异常: "
            eh.a.x(r1, r0, r3)
            return
    }

    private final void loadNativeLibrary(java.io.File r8, java.lang.ClassLoader r9) {
            r7 = this;
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L28
            r2 = 29
            java.lang.Class<java.lang.ClassLoader> r3 = java.lang.ClassLoader.class
            java.lang.String r4 = "nativeLoad"
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.Class<java.lang.Runtime> r6 = java.lang.Runtime.class
            if (r1 < r2) goto L33
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            java.lang.Class[] r1 = new java.lang.Class[]{r5, r3, r1}     // Catch: java.lang.Throwable -> L28
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r6, r4, r1)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L2b
            java.lang.String r2 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L28
            java.lang.Object[] r9 = new java.lang.Object[]{r2, r9, r0}     // Catch: java.lang.Throwable -> L28
            java.lang.Object r9 = h.Hchat.utils.KavaReflector.invokeOrThrow(r1, r0, r9)     // Catch: java.lang.Throwable -> L28
            goto L78
        L28:
            r8 = move-exception
            goto Lb7
        L2b:
            java.lang.NoSuchMethodException r8 = new java.lang.NoSuchMethodException     // Catch: java.lang.Throwable -> L28
            java.lang.String r9 = "Runtime.nativeLoad(String, ClassLoader, Class)"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L28
            throw r8     // Catch: java.lang.Throwable -> L28
        L33:
            r2 = 28
            if (r1 < r2) goto L56
            java.lang.Class[] r1 = new java.lang.Class[]{r5, r3}     // Catch: java.lang.Throwable -> L28
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r6, r4, r1)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L4e
            java.lang.String r2 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L28
            java.lang.Object[] r9 = new java.lang.Object[]{r2, r9}     // Catch: java.lang.Throwable -> L28
            java.lang.Object r9 = h.Hchat.utils.KavaReflector.invokeOrThrow(r1, r0, r9)     // Catch: java.lang.Throwable -> L28
            goto L78
        L4e:
            java.lang.NoSuchMethodException r8 = new java.lang.NoSuchMethodException     // Catch: java.lang.Throwable -> L28
            java.lang.String r9 = "Runtime.nativeLoad(String, ClassLoader)"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L28
            throw r8     // Catch: java.lang.Throwable -> L28
        L56:
            java.lang.Class[] r1 = new java.lang.Class[]{r5, r3, r5}     // Catch: java.lang.Throwable -> L28
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r6, r4, r1)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto Laf
            java.lang.String r2 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L28
            java.io.File r3 = r8.getParentFile()     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L6f
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L28
            goto L70
        L6f:
            r3 = r0
        L70:
            java.lang.Object[] r9 = new java.lang.Object[]{r2, r9, r3}     // Catch: java.lang.Throwable -> L28
            java.lang.Object r9 = h.Hchat.utils.KavaReflector.invokeOrThrow(r1, r0, r9)     // Catch: java.lang.Throwable -> L28
        L78:
            boolean r1 = r9 instanceof java.lang.String
            if (r1 == 0) goto L7f
            r0 = r9
            java.lang.String r0 = (java.lang.String) r0
        L7f:
            if (r0 == 0) goto Lae
            boolean r9 = og.m.t0(r0)
            if (r9 == 0) goto L88
            goto Lae
        L88:
            boolean r9 = android.os.Process.is64Bit()
            if (r9 == 0) goto L91
            java.lang.String r9 = "arm64-v8a"
            goto L93
        L91:
            java.lang.String r9 = "armeabi-v7a"
        L93:
            java.lang.UnsatisfiedLinkError r1 = new java.lang.UnsatisfiedLinkError
            java.lang.String r8 = r8.getAbsolutePath()
            java.lang.String r2 = "): "
            java.lang.String r3 = ": "
            java.lang.String r4 = "SO加载失败("
            java.lang.StringBuilder r8 = bc.e.p(r4, r9, r2, r8, r3)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r1.<init>(r8)
            throw r1
        Lae:
            return
        Laf:
            java.lang.NoSuchMethodException r8 = new java.lang.NoSuchMethodException     // Catch: java.lang.Throwable -> L28
            java.lang.String r9 = "Runtime.nativeLoad(String, ClassLoader, String)"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L28
            throw r8     // Catch: java.lang.Throwable -> L28
        Lb7:
            boolean r9 = r8 instanceof java.lang.reflect.InvocationTargetException
            if (r9 == 0) goto Lbe
            r0 = r8
            java.lang.reflect.InvocationTargetException r0 = (java.lang.reflect.InvocationTargetException) r0
        Lbe:
            if (r0 == 0) goto Lc7
            java.lang.Throwable r9 = r0.getTargetException()
            if (r9 == 0) goto Lc7
            r8 = r9
        Lc7:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = r8.getMessage()
            java.lang.String r1 = "无法调用Android Native加载入口: "
            java.lang.String r0 = wb.en.g(r1, r0)
            r9.<init>(r0, r8)
            throw r9
    }

    /* JADX INFO: renamed from: loadPlugin-yxL6bBk, reason: not valid java name */
    private final synchronized java.lang.Object m8loadPluginyxL6bBk(android.content.Context r17, h.Hchat.hooks.items.script.ScriptPluginBridge r18, eb.c0 r19, boolean r20, boolean r21) {
            r16 = this;
            r1 = r16
            r2 = r18
            r4 = r19
            java.lang.String r13 = "[Hchat:Script] 插件加载失败: "
            java.lang.String r3 = "读取脚本失败: "
            monitor-enter(r16)
            if (r21 == 0) goto L24
            boolean r0 = r1.isScriptApiReady()     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L24
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "微信联系人数据库尚未就绪，请稍后重试"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L21
            sf.f r2 = new sf.f     // Catch: java.lang.Throwable -> L21
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r16)
            return r2
        L21:
            r0 = move-exception
            goto L10f
        L24:
            if (r20 == 0) goto L2b
            java.lang.String r0 = r4.f2506a     // Catch: java.lang.Throwable -> L21
            r1.m11unloadPluginIoAF18A(r0)     // Catch: java.lang.Throwable -> L21
        L2b:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, eb.a0> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedPlugins     // Catch: java.lang.Throwable -> L21
            java.lang.String r5 = r4.f2506a     // Catch: java.lang.Throwable -> L21
            boolean r0 = r0.containsKey(r5)     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L39
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L21
            monitor-exit(r16)
            return r0
        L39:
            java.lang.String r0 = "Hchat_script_plugin_config"
            r5 = r17
            android.content.SharedPreferences r0 = ub.b.c(r5, r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r5 = "script_plugin_enable"
            r6 = 0
            boolean r0 = r0.getBoolean(r5, r6)     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto Lcf
            java.io.File r0 = r4.f2509d     // Catch: java.lang.Throwable -> L53
            java.nio.charset.Charset r5 = og.a.f9804a     // Catch: java.lang.Throwable -> L53
            java.lang.String r0 = dg.l.h0(r0, r5)     // Catch: java.lang.Throwable -> L53
            goto L5a
        L53:
            r0 = move-exception
            sf.f r5 = new sf.f     // Catch: java.lang.Throwable -> Lb2
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Lb2
            r0 = r5
        L5a:
            java.lang.Throwable r5 = sf.g.b(r0)     // Catch: java.lang.Throwable -> Lb2
            if (r5 != 0) goto Lb9
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lb2
            bsh.Interpreter r5 = r1.newInterpreter(r2, r4)     // Catch: java.lang.Throwable -> Lb2
            java.util.concurrent.locks.ReentrantLock r3 = r1.interpreterLock(r5)     // Catch: java.lang.Throwable -> Lb2
            r3.lock()     // Catch: java.lang.Throwable -> Lb2
            java.io.File r6 = r4.f2509d     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> Lb4
            r5.source(r6)     // Catch: java.lang.Throwable -> Lb4
            r3.unlock()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r3 = "onLoad"
            r1.callLifecycle(r5, r3)     // Catch: java.lang.Throwable -> Lb2
            eb.y r0 = r1.detectCallbacks(r0)     // Catch: java.lang.Throwable -> Lb2
            eb.y r3 = r1.detectCallbacks(r5)     // Catch: java.lang.Throwable -> Lb2
            eb.y r0 = r0.a(r3)     // Catch: java.lang.Throwable -> Lb2
            java.util.concurrent.ConcurrentHashMap<java.lang.String, eb.a0> r14 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedPlugins     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r15 = r4.f2506a     // Catch: java.lang.Throwable -> Lb2
            eb.a0 r3 = new eb.a0     // Catch: java.lang.Throwable -> Lb2
            boolean r6 = r0.f2685a     // Catch: java.lang.Throwable -> Lb2
            boolean r7 = r0.f2686b     // Catch: java.lang.Throwable -> Lb2
            boolean r8 = r0.f2687c     // Catch: java.lang.Throwable -> Lb2
            boolean r9 = r0.f2688d     // Catch: java.lang.Throwable -> Lb2
            boolean r10 = r0.f2689e     // Catch: java.lang.Throwable -> Lb2
            boolean r11 = r0.f2690f     // Catch: java.lang.Throwable -> Lb2
            boolean r12 = r0.f2691g     // Catch: java.lang.Throwable -> Lb2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lb2
            r14.put(r15, r3)     // Catch: java.lang.Throwable -> Lb2
            r1.updateProtobufPacketListener()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = r4.f2506a     // Catch: java.lang.Throwable -> Lb2
            r1.refreshCallbacks(r0, r5)     // Catch: java.lang.Throwable -> Lb2
            r1.notifyPluginCatalogChanged()     // Catch: java.lang.Throwable -> Lb2
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> Lb2
            goto Ldd
        Lb2:
            r0 = move-exception
            goto Ld7
        Lb4:
            r0 = move-exception
            r3.unlock()     // Catch: java.lang.Throwable -> Lb2
            throw r0     // Catch: java.lang.Throwable -> Lb2
        Lb9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r6 = r5.getMessage()     // Catch: java.lang.Throwable -> Lb2
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            r7.<init>(r3)     // Catch: java.lang.Throwable -> Lb2
            r7.append(r6)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Throwable -> Lb2
            r0.<init>(r3, r5)     // Catch: java.lang.Throwable -> Lb2
            throw r0     // Catch: java.lang.Throwable -> Lb2
        Lcf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r3 = "脚本插件总开关未开启"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lb2
            throw r0     // Catch: java.lang.Throwable -> Lb2
        Ld7:
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> L21
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L21
            r0 = r3
        Ldd:
            java.lang.Throwable r3 = sf.g.b(r0)     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L10d
            java.lang.String r5 = r4.f2506a     // Catch: java.lang.Throwable -> L21
            r2.unhookPlugin(r5)     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = r4.f2507b     // Catch: java.lang.Throwable -> L21
            java.lang.String r5 = r3.getMessage()     // Catch: java.lang.Throwable -> L21
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            r6.<init>(r13)     // Catch: java.lang.Throwable -> L21
            r6.append(r2)     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = " "
            r6.append(r2)     // Catch: java.lang.Throwable -> L21
            r6.append(r5)     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L21
            fb.v0.n(r2, r3)     // Catch: java.lang.Throwable -> L21
            h.Hchat.hooks.items.script.ScriptPluginRuntime r2 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE     // Catch: java.lang.Throwable -> L21
            r2.writePluginLoadError(r4, r3)     // Catch: java.lang.Throwable -> L21
            r2.notifyPluginCatalogChanged()     // Catch: java.lang.Throwable -> L21
        L10d:
            monitor-exit(r16)
            return r0
        L10f:
            monitor-exit(r16)     // Catch: java.lang.Throwable -> L21
            throw r0
    }

    /* JADX INFO: renamed from: loadPlugin-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m9loadPluginyxL6bBk$default(h.Hchat.hooks.items.script.ScriptPluginRuntime r6, android.content.Context r7, h.Hchat.hooks.items.script.ScriptPluginBridge r8, eb.c0 r9, boolean r10, boolean r11, int r12, java.lang.Object r13) {
            r12 = r12 & 16
            if (r12 == 0) goto L5
            r11 = 1
        L5:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r6 = r0.m8loadPluginyxL6bBk(r1, r2, r3, r4, r5)
            return r6
    }

    private final void logBusySendButtonPlugin(eb.a0 r3) {
            r2 = this;
            eb.c0 r0 = r3.f2486a
            java.lang.String r0 = r0.f2506a
            java.lang.String r1 = "busy:"
            java.lang.String r0 = r1.concat(r0)
            eb.c0 r3 = r3.f2486a
            java.lang.String r3 = r3.f2507b
            java.lang.String r1 = "发送按钮跳过忙碌插件: "
            java.lang.String r3 = r1.concat(r3)
            r2.logSendButtonDiagnostic(r0, r3)
            return
    }

    private final void logDroppedImageDownload() {
            r12 = this;
            java.util.concurrent.atomic.AtomicLong r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.imageDownloadDroppedCount
            r0.incrementAndGet()
            long r1 = android.os.SystemClock.elapsedRealtime()
            java.util.concurrent.atomic.AtomicLong r3 = h.Hchat.hooks.items.script.ScriptPluginRuntime.imageDownloadDropLogAt
            long r4 = r3.get()
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L1e
            long r8 = r1 - r4
            r10 = 10000(0x2710, double:4.9407E-320)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L1e
            goto L24
        L1e:
            boolean r1 = r3.compareAndSet(r4, r1)
            if (r1 != 0) goto L25
        L24:
            return
        L25:
            long r0 = r0.getAndSet(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[Hchat:Script] 图片下载回调队列已满，已丢弃 "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " 个事件"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            fb.v0.m(r0)
            return
    }

    private final void logDroppedProtobufPacket() {
            r12 = this;
            java.util.concurrent.atomic.AtomicLong r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.protobufDroppedPacketCount
            r0.incrementAndGet()
            long r1 = android.os.SystemClock.elapsedRealtime()
            java.util.concurrent.atomic.AtomicLong r3 = h.Hchat.hooks.items.script.ScriptPluginRuntime.protobufDropLogAt
            long r4 = r3.get()
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L1e
            long r8 = r1 - r4
            r10 = 10000(0x2710, double:4.9407E-320)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L1e
            goto L24
        L1e:
            boolean r1 = r3.compareAndSet(r4, r1)
            if (r1 != 0) goto L25
        L24:
            return
        L25:
            long r0 = r0.getAndSet(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[Hchat:Script] 数据包回调队列已满，已丢弃 "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " 个事件"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            fb.v0.m(r0)
            return
    }

    private final void logSendButtonDiagnostic(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            gg.q r2 = new gg.q
            r2.<init>()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r3 = h.Hchat.hooks.items.script.ScriptPluginRuntime.sendButtonDiagnosticLogAt
            eb.u r4 = new eb.u
            r5 = 0
            r4.<init>(r0, r2, r5)
            eb.v r0 = new eb.v
            r1 = 0
            r0.<init>(r1, r4)
            r3.compute(r7, r0)
            boolean r7 = r2.f4560g
            if (r7 == 0) goto L2f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "[Hchat:Script] "
            r7.<init>(r0)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            fb.v0.m(r7)
        L2f:
            return
    }

    private static final java.lang.Long logSendButtonDiagnostic$lambda$0(long r4, gg.q r6, java.lang.String r7, java.lang.Long r8) {
            r7.getClass()
            if (r8 == 0) goto L13
            long r0 = r8.longValue()
            long r0 = r4 - r0
            r2 = 10000(0x2710, double:4.9407E-320)
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L12
            goto L13
        L12:
            return r8
        L13:
            r7 = 1
            r6.f4560g = r7
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
    }

    private static final java.lang.Long logSendButtonDiagnostic$lambda$1(fg.p r0, java.lang.Object r1, java.lang.Object r2) {
            java.lang.Object r0 = r0.invoke(r1, r2)
            java.lang.Long r0 = (java.lang.Long) r0
            return r0
    }

    public static /* synthetic */ java.lang.Thread m(java.lang.Runnable r0) {
            java.lang.Thread r0 = protobufCallbackExecutor$lambda$0(r0)
            return r0
    }

    public static /* synthetic */ void n(android.content.Context r0, java.lang.String r1) {
            reloadPluginFromFileChange$lambda$0(r0, r1)
            return
    }

    private final bsh.Interpreter newInterpreter(h.Hchat.hooks.items.script.ScriptPluginBridge r13, eb.c0 r14) {
            r12 = this;
            java.io.File r0 = r14.f2508c
            java.io.File r1 = new java.io.File
            java.io.File r2 = r13.getScriptDir()
            java.io.File r2 = r2.getParentFile()
            if (r2 == 0) goto Lf
            goto L13
        Lf:
            java.io.File r2 = r13.getScriptDir()
        L13:
            java.lang.String r3 = "Cache"
            r1.<init>(r2, r3)
            h.Hchat.hooks.items.script.ScriptWaBridge r2 = new h.Hchat.hooks.items.script.ScriptWaBridge
            r2.<init>(r13)
            java.lang.String r3 = r14.f2507b
            r2.bindPluginLog(r3, r0)
            h.Hchat.hooks.items.script.ScriptAudioBridge r3 = new h.Hchat.hooks.items.script.ScriptAudioBridge
            r3.<init>(r13)
            r4 = 0
            o8.k r5 = h.Hchat.hooks.api.core.WeChatApis.version()     // Catch: java.lang.Throwable -> L33
            if (r5 == 0) goto L35
            l8.i r5 = r5.b()     // Catch: java.lang.Throwable -> L33
            goto L3d
        L33:
            r5 = move-exception
            goto L37
        L35:
            r5 = r4
            goto L3d
        L37:
            sf.f r6 = new sf.f
            r6.<init>(r5)
            r5 = r6
        L3d:
            boolean r6 = r5 instanceof sf.f
            if (r6 == 0) goto L43
            r5 = r4
        L43:
            l8.i r5 = (l8.i) r5
            if (r5 == 0) goto L48
            goto L64
        L48:
            android.content.Context r5 = r13.getHostContext()     // Catch: java.lang.Throwable -> L55
            java.lang.ClassLoader r6 = r13.getClassLoader()     // Catch: java.lang.Throwable -> L55
            l8.i r5 = o8.k.a(r5, r6)     // Catch: java.lang.Throwable -> L55
            goto L5c
        L55:
            r5 = move-exception
            sf.f r6 = new sf.f
            r6.<init>(r5)
            r5 = r6
        L5c:
            boolean r6 = r5 instanceof sf.f
            if (r6 == 0) goto L62
            r5 = r4
        L62:
            l8.i r5 = (l8.i) r5
        L64:
            if (r5 == 0) goto L69
            java.lang.String r6 = r5.f7929d
            goto L6a
        L69:
            r6 = r4
        L6a:
            java.lang.String r7 = ""
            if (r6 != 0) goto L6f
            r6 = r7
        L6f:
            if (r5 == 0) goto L74
            long r8 = r5.f7926a
            goto L76
        L74:
            r8 = 0
        L76:
            if (r5 == 0) goto L7b
            java.lang.String r5 = r5.f7930e
            goto L7c
        L7b:
            r5 = r4
        L7c:
            if (r5 != 0) goto L7f
            goto L80
        L7f:
            r7 = r5
        L80:
            bsh.Interpreter r5 = new bsh.Interpreter
            r5.<init>()
            java.lang.ClassLoader r10 = r13.getClassLoader()
            r5.addClassLoader(r10)
            java.lang.String r10 = "context"
            android.content.Context r11 = r13.getHostContext()
            r5.set(r10, r11)
            java.lang.String r10 = "hostContext"
            android.content.Context r11 = r13.getHostContext()
            r5.set(r10, r11)
            java.lang.String r10 = "classLoader"
            java.lang.ClassLoader r11 = r13.getClassLoader()
            r5.set(r10, r11)
            java.io.File r10 = r13.getScriptDir()
            java.lang.String r10 = r10.getAbsolutePath()
            java.lang.String r11 = "scriptDir"
            r5.set(r11, r10)
            java.lang.String r10 = "scriptDirFile"
            java.io.File r11 = r13.getScriptDir()
            r5.set(r10, r11)
            java.lang.String r10 = "pluginDir"
            java.lang.String r11 = r0.getAbsolutePath()
            r5.set(r10, r11)
            java.lang.String r10 = "pluginDirFile"
            r5.set(r10, r0)
            java.lang.String r0 = "cacheDir"
            java.lang.String r10 = r1.getAbsolutePath()
            r5.set(r0, r10)
            java.lang.String r0 = "cacheDirFile"
            r5.set(r0, r1)
            java.lang.String r0 = "pluginId"
            java.lang.String r1 = r14.f2506a
            r5.set(r0, r1)
            java.lang.String r0 = "pluginName"
            java.lang.String r1 = r14.f2507b
            r5.set(r0, r1)
            java.lang.String r0 = "pluginAuthor"
            java.lang.String r1 = r14.f2510e
            r5.set(r0, r1)
            java.lang.String r0 = "pluginVersion"
            java.lang.String r1 = r14.f2511f
            r5.set(r0, r1)
            java.lang.String r0 = "pluginUpdateTime"
            java.lang.String r14 = r14.f2512g
            r5.set(r0, r14)
            java.lang.String r14 = "processName"
            java.lang.String r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.runtimeProcessName
            r5.set(r14, r0)
            java.lang.String r14 = "pluginProcess"
            java.lang.String r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.runtimeProcess
            r5.set(r14, r0)
            java.lang.String r14 = h.Hchat.hooks.items.script.ScriptPluginRuntime.runtimeProcess
            java.lang.String r0 = "main"
            boolean r14 = gg.l.a(r14, r0)
            java.lang.String r0 = "isMainProcess"
            r5.set(r0, r14)
            java.lang.String r14 = h.Hchat.hooks.items.script.ScriptPluginRuntime.runtimeProcess
            java.lang.String r0 = "appbrand"
            boolean r14 = gg.l.a(r14, r0)
            java.lang.String r0 = "isAppBrandProcess"
            r5.set(r0, r14)
            java.lang.String r14 = "hostVerName"
            r5.set(r14, r6)
            java.lang.String r14 = "hostVerCode"
            r5.set(r14, r8)
            java.lang.String r14 = "hostVerClient"
            r5.set(r14, r7)
            java.lang.String r14 = "moduleVer"
            java.lang.String r0 = "5.5.6"
            r5.set(r14, r0)
            java.lang.String r14 = "bridge"
            r5.set(r14, r13)
            java.lang.String r14 = "wa"
            r5.set(r14, r2)
            java.lang.String r14 = "waBridge"
            r5.set(r14, r2)
            java.lang.String r14 = "audio"
            r5.set(r14, r3)
            java.lang.String r14 = "audioBridge"
            r5.set(r14, r3)
            java.lang.String r14 = "http"
            r5.set(r14, r2)
            java.lang.String r14 = "httpClient"
            r5.set(r14, r2)
            java.lang.String r14 = "__hchat_runtime"
            h.Hchat.hooks.items.script.ScriptPluginRuntime r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            r5.set(r14, r0)
            java.lang.String r14 = "__hchat_interpreter"
            r5.set(r14, r5)
            java.lang.String r14 = "apis"
            java.lang.Class r0 = r13.getApis()
            r5.set(r14, r0)
            java.lang.String r14 = "dexKit"
            h.Hchat.hooks.items.script.ScriptDexKitBridge r0 = r13.getDexKit()
            r5.set(r14, r0)
            h.Hchat.hooks.items.script.ScriptDexKitBridge r14 = r13.getDexKit()
            if (r14 == 0) goto L186
            org.luckypray.dexkit.DexKitBridge r14 = r14.bridge()
            goto L187
        L186:
            r14 = r4
        L187:
            java.lang.String r0 = "dexKitBridge"
            r5.set(r0, r14)
            h.Hchat.hooks.items.script.ScriptDexKitBridge r14 = r13.getDexKit()
            if (r14 == 0) goto L19d
            h.Hchat.dexkit.DexBridgeHolder r14 = r14.holder()
            if (r14 == 0) goto L19d
            h.Hchat.dexkit.DexFinder r14 = r14.getDexFinder()
            goto L19e
        L19d:
            r14 = r4
        L19e:
            java.lang.String r0 = "dexFinder"
            r5.set(r0, r14)
            h.Hchat.hooks.items.script.ScriptDexKitBridge r13 = r13.getDexKit()
            if (r13 == 0) goto L1ad
            h.Hchat.dexkit.DexBridgeHolder r4 = r13.holder()
        L1ad:
            java.lang.String r13 = "dexBridgeHolder"
            r5.set(r13, r4)
            java.lang.String r13 = "WeChatApisClass"
            java.lang.Class<h.Hchat.hooks.api.core.WeChatApis> r14 = h.Hchat.hooks.api.core.WeChatApis.class
            r5.set(r13, r14)
            java.lang.String r13 = "XposedBridgeClass"
            java.lang.Class<de.robv.android.xposed.XposedBridge> r14 = de.robv.android.xposed.XposedBridge.class
            r5.set(r13, r14)
            java.lang.String r13 = "XposedHelpersClass"
            java.lang.Class<de.robv.android.xposed.XposedHelpers> r14 = de.robv.android.xposed.XposedHelpers.class
            r5.set(r13, r14)
            java.lang.String r13 = "XC_MethodHookClass"
            java.lang.Class<de.robv.android.xposed.XC_MethodHook> r14 = de.robv.android.xposed.XC_MethodHook.class
            r5.set(r13, r14)
            java.lang.String r13 = "DexKitBridgeClass"
            java.lang.Class<org.luckypray.dexkit.DexKitBridge> r14 = org.luckypray.dexkit.DexKitBridge.class
            r5.set(r13, r14)
            java.lang.String r13 = "DexFinderClass"
            java.lang.Class<h.Hchat.dexkit.DexFinder> r14 = h.Hchat.dexkit.DexFinder.class
            r5.set(r13, r14)
            java.lang.String r13 = "DexBridgeHolderClass"
            java.lang.Class<h.Hchat.dexkit.DexBridgeHolder> r14 = h.Hchat.dexkit.DexBridgeHolder.class
            r5.set(r13, r14)
            java.lang.String r13 = "KavaReflectorClass"
            java.lang.Class<h.Hchat.utils.KavaReflector> r14 = h.Hchat.utils.KavaReflector.class
            r5.set(r13, r14)
            java.lang.String r13 = "ScriptAudioBridgeClass"
            java.lang.Class<h.Hchat.hooks.items.script.ScriptAudioBridge> r14 = h.Hchat.hooks.items.script.ScriptAudioBridge.class
            r5.set(r13, r14)
            java.lang.String r13 = "SilkCodecClass"
            java.lang.Class<me.yun.silk.SilkCodec> r14 = me.yun.silk.SilkCodec.class
            r5.set(r13, r14)
            java.lang.String r13 = "AacCodecClass"
            java.lang.Class<me.yun.silk.AacCodec> r14 = me.yun.silk.AacCodec.class
            r5.set(r13, r14)
            java.lang.String r13 = "ConversionClass"
            java.lang.Class<me.yun.silk.utils.Conversion> r14 = me.yun.silk.utils.Conversion.class
            r5.set(r13, r14)
            java.lang.String r13 = "FieldClass"
            java.lang.Class<java.lang.reflect.Field> r14 = java.lang.reflect.Field.class
            r5.set(r13, r14)
            java.lang.String r13 = "MethodClass"
            java.lang.Class<java.lang.reflect.Method> r14 = java.lang.reflect.Method.class
            r5.set(r13, r14)
            java.lang.String r13 = "ConstructorClass"
            java.lang.Class<java.lang.reflect.Constructor> r14 = java.lang.reflect.Constructor.class
            r5.set(r13, r14)
            java.text.SimpleDateFormat r13 = new java.text.SimpleDateFormat
            java.lang.String r14 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r0 = java.util.Locale.US
            r13.<init>(r14, r0)
            java.util.Date r14 = new java.util.Date
            r14.<init>()
            java.lang.String r13 = r13.format(r14)
            java.lang.String r14 = "startedAt"
            r5.set(r14, r13)
            java.lang.String r13 = "import de.robv.android.xposed.XC_MethodHook;\nimport de.robv.android.xposed.XposedBridge;\nimport de.robv.android.xposed.XposedHelpers;\nimport h.Hchat.dexkit.DexBridgeHolder;\nimport h.Hchat.dexkit.DexFinder;\nimport h.Hchat.hooks.api.core.WeChatApis;\nimport h.Hchat.hooks.items.script.ScriptDexKitBridge;\nimport h.Hchat.hooks.items.script.ScriptPluginBridge;\nimport h.Hchat.hooks.items.script.ScriptAudioBridge;\nimport h.Hchat.hooks.items.script.ScriptWaBridge;\nimport h.Hchat.hooks.api.model.ContactLabelBean;\nimport h.Hchat.utils.KavaReflector;\nimport java.io.File;\nimport java.io.InputStream;\nimport java.lang.reflect.Constructor;\nimport java.lang.reflect.Field;\nimport org.luckypray.dexkit.DexKitBridge;\nimport java.lang.reflect.Member;\nimport java.lang.reflect.Method;\nimport java.util.Map;\nimport java.util.List;\nimport java.util.Set;\nimport java.util.function.Consumer;\nimport java.util.function.Function;\nimport android.content.ContentValues;\nimport android.database.Cursor;\nimport android.view.View;\nimport me.hd.wauxv.data.bean.MsgInfoBean;\nimport me.hd.wauxv.plugin.api.callback.PluginCallBack;\nimport me.yun.silk.AacCodec;\nimport me.yun.silk.SilkCodec;\nimport me.yun.silk.utils.Conversion;\nvoid log(Object msg) { bridge.log(pluginName, pluginDirFile, msg); }\nvoid toast(Object msg) { bridge.toast(pluginName, msg); }\nboolean showModuleDialog(String title, String message) { return bridge.showModuleDialog(title, message); }\nboolean showModuleDialog(String title, String message, String position) { return bridge.showModuleDialog(title, message, position); }\nboolean showModuleConfirmDialog(String title, String message, Consumer callback) { return bridge.showModuleConfirmDialog(title, message, callback); }\nboolean showModuleConfirmDialog(String title, String message, String position, Consumer callback) { return bridge.showModuleConfirmDialog(title, message, position, callback); }\nboolean showModuleInputDialog(String title, String summary, String initialValue, String placeholder, Consumer callback) { return bridge.showModuleInputDialog(title, summary, initialValue, placeholder, callback); }\nboolean showModuleInputDialog(String title, String summary, String initialValue, String placeholder, String position, Consumer callback) { return bridge.showModuleInputDialog(title, summary, initialValue, placeholder, position, callback); }\nboolean showModuleChoiceDialog(String title, String summary, List choices, Consumer callback) { return bridge.showModuleChoiceDialog(title, summary, choices, callback); }\nboolean showModuleChoiceDialog(String title, String summary, List choices, String position, Consumer callback) { return bridge.showModuleChoiceDialog(title, summary, choices, position, callback); }\nboolean showModuleMultiChoiceDialog(String title, String summary, List choices, Set initialSelected, Consumer callback) { return bridge.showModuleMultiChoiceDialog(title, summary, choices, initialSelected, callback); }\nboolean showModuleMultiChoiceDialog(String title, String summary, List choices, Set initialSelected, String position, Consumer callback) { return bridge.showModuleMultiChoiceDialog(title, summary, choices, initialSelected, position, callback); }\nObject applyModuleFloatingGlassBar(View bottomBar) { return bridge.applyModuleFloatingGlassBar(pluginId, bottomBar); }\nObject applyModuleFloatingGlassBar(View bottomBar, Map options) { return bridge.applyModuleFloatingGlassBar(pluginId, bottomBar, options); }\nString getString(String key, String __hchat_default_string) { return bridge.getString(pluginDirFile, key, __hchat_default_string); }\nSet getStringSet(String key, Set __hchat_default_set) { return bridge.getStringSet(pluginDirFile, key, __hchat_default_set); }\nboolean getBoolean(String key, boolean __hchat_default_boolean) { return bridge.getBoolean(pluginDirFile, key, __hchat_default_boolean); }\nint getInt(String key, int __hchat_default_int) { return bridge.getInt(pluginDirFile, key, __hchat_default_int); }\nfloat getFloat(String key, float __hchat_default_float) { return bridge.getFloat(pluginDirFile, key, __hchat_default_float); }\nlong getLong(String key, long __hchat_default_long) { return bridge.getLong(pluginDirFile, key, __hchat_default_long); }\nvoid putString(String key, String value) { bridge.putString(pluginDirFile, key, value); }\nvoid putStringSet(String key, Set value) { bridge.putStringSet(pluginDirFile, key, value); }\nvoid putBoolean(String key, boolean value) { bridge.putBoolean(pluginDirFile, key, value); }\nvoid putInt(String key, int value) { bridge.putInt(pluginDirFile, key, value); }\nvoid putFloat(String key, float value) { bridge.putFloat(pluginDirFile, key, value); }\nvoid putLong(String key, long value) { bridge.putLong(pluginDirFile, key, value); }\nClass findClass(String className) { return bridge.findClass(className); }\nObject findClassList(String usingString) { return dexKit == null ? new java.util.ArrayList() : dexKit.findClassList(usingString); }\nObject findClassList(String[] usingStrings) { return dexKit == null ? new java.util.ArrayList() : dexKit.findClassList(usingStrings); }\nObject findClassList(Object[] usingStrings) { return dexKit == null ? new java.util.ArrayList() : dexKit.findClassList(usingStrings); }\nObject findClassList(List usingStrings) { return dexKit == null ? new java.util.ArrayList() : dexKit.findClassList(usingStrings); }\nObject findClassList(Object usingStrings) { return dexKit == null ? new java.util.ArrayList() : dexKit.findClassList(usingStrings); }\nObject findMemberList(String usingString) { return dexKit == null ? new java.util.ArrayList() : dexKit.findMemberList(usingString); }\nObject findMemberList(String[] usingStrings) { return dexKit == null ? new java.util.ArrayList() : dexKit.findMemberList(usingStrings); }\nObject findMemberList(Object[] usingStrings) { return dexKit == null ? new java.util.ArrayList() : dexKit.findMemberList(usingStrings); }\nObject findMemberList(List usingStrings) { return dexKit == null ? new java.util.ArrayList() : dexKit.findMemberList(usingStrings); }\nObject findMemberList(Object usingStrings) { return dexKit == null ? new java.util.ArrayList() : dexKit.findMemberList(usingStrings); }\nMethod firstMethod(Object instance, String methodName) { return bridge.firstMethod(instance, methodName); }\nMethod firstMethod(Object instance, String methodName, int paramCount) { return bridge.firstMethod(instance, methodName, paramCount); }\nConstructor firstConstructor(Object instance, int paramCount) { return bridge.firstConstructor(instance, paramCount); }\nField firstField(Object instance, String fieldName) { return bridge.firstField(instance, fieldName); }\nObject invokeMethod(Object instance, String methodName) { return bridge.invokeMethod(instance, methodName); }\nObject invokeMethod(Object instance, String methodName, Object[] params) { return bridge.invokeMethod(instance, methodName, params); }\nObject invokeMethod(Object instance, String methodName, int paramCount) { return bridge.invokeMethod(instance, methodName, paramCount); }\nObject invokeMethod(Object instance, String methodName, int paramCount, Object[] params) { return bridge.invokeMethod(instance, methodName, paramCount, params); }\nObject createInstance(Object instance, int paramCount) { return bridge.createInstance(instance, paramCount); }\nObject createInstance(Object instance, int paramCount, Object[] params) { return bridge.createInstance(instance, paramCount, params); }\nObject getField(Object instance, String fieldName) { return bridge.getField(instance, fieldName); }\nvoid setField(Object instance, String fieldName, Object value) { bridge.setField(instance, fieldName, value); }\nObject hookBefore(Member member, Consumer callback) { return bridge.hookBefore(pluginId, member, callback); }\nObject hookAfter(Member member, Consumer callback) { return bridge.hookAfter(pluginId, member, callback); }\nObject hookReplace(Member member, Function callback) { return bridge.hookReplace(pluginId, member, callback); }\nvoid unhook(Object handle) { bridge.unhook(pluginId, handle); }\nvoid reloadPlugin() { __hchat_runtime.reloadPluginAsync(hostContext, pluginId); }\nString compileSnapshot(String path) { return __hchat_runtime.compileSnapshot(pluginId, pluginDirFile, __hchat_interpreter, path); }\nObject evalSnapshot(String path) { return __hchat_runtime.evalSnapshot(pluginId, pluginDirFile, __hchat_interpreter, path); }\nObject evalSnapshot(InputStream inputStream) { return __hchat_runtime.evalSnapshot(pluginId, __hchat_interpreter, inputStream); }\nObject evalSnapshot(byte[] data) { return __hchat_runtime.evalSnapshot(pluginId, __hchat_interpreter, data); }\nvoid eval(String code) { __hchat_runtime.evalCode(pluginId, __hchat_interpreter, code); }\nvoid loadJava(String path) { __hchat_runtime.loadJava(pluginId, pluginDirFile, __hchat_interpreter, path); }\nvoid useCallback(String callbackName, String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, callbackName, methodName); }\nvoid useOnLoad(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"onLoad\", methodName); }\nvoid useOnUnload(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"onUnload\", methodName); }\nvoid useOpenSettings(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"openSettings\", methodName); }\nvoid useOnClickSendBtn(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"onClickSendBtn\", methodName); }\nvoid useOnHandleMsg(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"onHandleMsg\", methodName); }\nvoid useOnImageDownload(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"onImageDownload\", methodName); }\nvoid useOnMemberChange(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"onMemberChange\", methodName); }\nvoid useOnNewFriend(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"onNewFriend\", methodName); }\nvoid useOnProtobufPacket(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"onProtobufPacket\", methodName); }\nClassLoader loadDex(String path) { return __hchat_runtime.loadDex(pluginId, pluginDirFile, __hchat_interpreter, classLoader, path); }\nvoid loadSo(String path) { __hchat_runtime.loadSo(pluginId, pluginDirFile, classLoader, path); }\nvoid loadSo(String path, ClassLoader loader) { __hchat_runtime.loadSo(pluginId, pluginDirFile, loader, path); }\nString getLoginWxid() { return wa.getLoginWxid(); }\nString getLoginAlias() { return wa.getLoginAlias(); }\nString getTargetTalker() { return wa.getTargetTalker(); }\nandroid.app.Activity getTopActivity() { return wa.getTopActivity(); }\nObject getDatabaseApi() { return wa.getDatabaseApi(); }\nObject getOfficialList() { return wa.getOfficialList(); }\nObject getFriendList() { return wa.getFriendList(); }\nObject getFriendListInfo() { return wa.getFriendListInfo(); }\nObject getGroupList() { return wa.getGroupList(); }\nObject getGroupListInfo() { return wa.getGroupListInfo(); }\nObject getGroupMemberListInfo(String groupWxid) { return wa.getGroupMemberListInfo(groupWxid); }\nList getContactLabelList() { return wa.getContactLabelList(); }\nList getContactLabelListInfo() { return wa.getContactLabelListInfo(); }\nList getContactByLabelId(String labelId) { return wa.getContactByLabelId(labelId); }\nList getContactByLabelName(String labelName) { return wa.getContactByLabelName(labelName); }\nString addContactLabel(String labelName) { return wa.addContactLabel(labelName); }\nvoid modifyContactLabelList(String username, String labelName) { wa.modifyContactLabelList(username, labelName); }\nvoid modifyContactLabelList(String username, List labelNames) { wa.modifyContactLabelList(username, labelNames); }\nvoid verifyUser(String wxid, String ticket, int scene) { wa.verifyUser(wxid, ticket, scene); }\nvoid verifyUser(String wxid, String ticket, int scene, int privacy) { wa.verifyUser(wxid, ticket, scene, privacy); }\nObject getGroupMemberList(String groupWxid) { return wa.getGroupMemberList(groupWxid); }\nint getGroupMemberCount(String groupWxid) { return wa.getGroupMemberCount(groupWxid); }\nString getGroupName(String groupWxid) { return wa.getGroupName(groupWxid); }\nString getChatroomName(String chatroomId) { return wa.getChatroomName(chatroomId); }\nString getGroupRemarkName(String groupWxid) { return wa.getGroupRemarkName(groupWxid); }\nString getGroupMemberName(String groupWxid, String memberWxid) { return wa.getGroupMemberName(groupWxid, memberWxid); }\nString getGroupNickName(String groupWxid, String memberWxid) { return wa.getGroupNickName(groupWxid, memberWxid); }\nString getFriendNickName(String friendWxid) { return wa.getFriendNickName(friendWxid); }\nString getFriendRemarkName(String friendWxid) { return wa.getFriendRemarkName(friendWxid); }\nint getFriendGender(String friendWxid) { return wa.getFriendGender(friendWxid); }\nString getFriendProvince(String friendWxid) { return wa.getFriendProvince(friendWxid); }\nString getFriendCity(String friendWxid) { return wa.getFriendCity(friendWxid); }\nString getFriendRegion(String friendWxid) { return wa.getFriendRegion(friendWxid); }\nString getFriendDisplayName(String friendWxid, String roomId) { return wa.getFriendDisplayName(friendWxid, roomId); }\nString getFriendName(String friendWxid) { return wa.getFriendName(friendWxid); }\nString getFriendName(String friendWxid, String roomId) { return wa.getFriendName(friendWxid, roomId); }\nint getGroupMemberGender(String groupWxid, String memberWxid) { return wa.getGroupMemberGender(groupWxid, memberWxid); }\nString getGroupMemberProvince(String groupWxid, String memberWxid) { return wa.getGroupMemberProvince(groupWxid, memberWxid); }\nString getGroupMemberCity(String groupWxid, String memberWxid) { return wa.getGroupMemberCity(groupWxid, memberWxid); }\nString getGroupMemberRegion(String groupWxid, String memberWxid) { return wa.getGroupMemberRegion(groupWxid, memberWxid); }\nvoid addChatroomMember(String chatroomId, String addMember) { wa.addChatroomMember(chatroomId, addMember); }\nvoid addChatroomMember(String chatroomId, List addMemberList) { wa.addChatroomMember(chatroomId, addMemberList); }\nvoid inviteChatroomMember(String chatroomId, String inviteMember) { wa.inviteChatroomMember(chatroomId, inviteMember); }\nvoid inviteChatroomMember(String chatroomId, List inviteMemberList) { wa.inviteChatroomMember(chatroomId, inviteMemberList); }\nvoid delChatroomMember(String chatroomId, String delMember) { wa.delChatroomMember(chatroomId, delMember); }\nvoid delChatroomMember(String chatroomId, List delMemberList) { wa.delChatroomMember(chatroomId, delMemberList); }\nString getAvatarUrl(String username) { return wa.getAvatarUrl(username); }\nString getAvatarUrl(String username, boolean isBigHeadImg) { return wa.getAvatarUrl(username, isBigHeadImg); }\nvoid sendText(String talker, String content) { wa.sendText(talker, content); }\nvoid sendText(String talker, String content, Consumer callback) { wa.sendText(talker, content, callback); }\nboolean sendProtobufPacket(String uri, int cgiId, String json) { return __hchat_runtime.sendProtobufPacket(uri, cgiId, json, null); }\nboolean sendProtobufPacket(String uri, int cgiId, String json, Consumer callback) { return __hchat_runtime.sendProtobufPacket(uri, cgiId, json, callback); }\nboolean sendProtobufPacket(String uri, int cgiId, JSONObject json) { return __hchat_runtime.sendProtobufPacket(uri, cgiId, json == null ? \"{}\" : json.toString(), null); }\nboolean sendProtobufPacket(String uri, int cgiId, JSONObject json, Consumer callback) { return __hchat_runtime.sendProtobufPacket(uri, cgiId, json == null ? \"{}\" : json.toString(), callback); }\nboolean sendProtobufPacket(String uri, int cgiId, int funcId, int routeId, String json) { return __hchat_runtime.sendProtobufPacket(uri, cgiId, funcId, routeId, json, null); }\nboolean sendProtobufPacket(String uri, int cgiId, int funcId, int routeId, String json, Consumer callback) { return __hchat_runtime.sendProtobufPacket(uri, cgiId, funcId, routeId, json, callback); }\nboolean sendProtobufPacket(String uri, int cgiId, int funcId, int routeId, JSONObject json) { return __hchat_runtime.sendProtobufPacket(uri, cgiId, funcId, routeId, json == null ? \"{}\" : json.toString(), null); }\nboolean sendProtobufPacket(String uri, int cgiId, int funcId, int routeId, JSONObject json, Consumer callback) { return __hchat_runtime.sendProtobufPacket(uri, cgiId, funcId, routeId, json == null ? \"{}\" : json.toString(), callback); }\nvoid sendQuoteMsg(String talker, long msgId, String content) { wa.sendQuoteMsg(talker, msgId, content); }\nvoid sendQuoteMsg(String talker, String content, long msgId) { wa.sendQuoteMsg(talker, content, msgId); }\nvoid revokeMsg(long msgId) { wa.revokeMsg(msgId); }\nvoid uploadDeviceStep(long step) { wa.uploadDeviceStep(step); }\nObject getSnsPostList() { return wa.getSnsPostList(); }\nObject getSnsPostList(int limit) { return wa.getSnsPostList(limit); }\nObject getSnsPostList(String userName, int limit) { return wa.getSnsPostList(userName, limit); }\nObject getSnsPost(String snsId) { return wa.getSnsPost(snsId); }\nboolean prepareSnsPostMedia(String snsId, Consumer callback) { return __hchat_runtime.prepareSnsPostMedia(pluginId, __hchat_interpreter, snsId, callback); }\nboolean publishSnsPost(Object prepared) { return wa.publishSnsPost(prepared); }\nboolean refreshSnsTimeline() { return wa.refreshSnsTimeline(); }\nvoid uploadText(String content) { wa.uploadText(content); }\nvoid uploadText(String content, String sdkId, String sdkAppName) { wa.uploadText(content, sdkId, sdkAppName); }\nvoid uploadText(JSONObject jsonObj) { wa.uploadText(jsonObj); }\nvoid uploadTextAndPicList(String content, String picPath) { wa.uploadTextAndPicList(content, picPath); }\nvoid uploadTextAndPicList(String content, String picPath, String sdkId, String sdkAppName) { wa.uploadTextAndPicList(content, picPath, sdkId, sdkAppName); }\nvoid uploadTextAndPicList(String content, List picPathList) { wa.uploadTextAndPicList(content, picPathList); }\nvoid uploadTextAndPicList(String content, List picPathList, String sdkId, String sdkAppName) { wa.uploadTextAndPicList(content, picPathList, sdkId, sdkAppName); }\nvoid uploadTextAndPicList(JSONObject jsonObj) { wa.uploadTextAndPicList(jsonObj); }\nvoid uploadLivePhoto(String livePhotoPath) { wa.uploadLivePhoto(livePhotoPath); }\nvoid uploadLivePhoto(String imagePath, String videoPath) { wa.uploadLivePhoto(imagePath, videoPath); }\nvoid uploadLivePhoto(JSONObject jsonObj) { wa.uploadLivePhoto(jsonObj); }\nvoid uploadTextAndLivePhoto(String content, String livePhotoPath) { wa.uploadTextAndLivePhoto(content, livePhotoPath); }\nvoid uploadTextAndLivePhoto(String content, String livePhotoPath, String sdkId, String sdkAppName) { wa.uploadTextAndLivePhoto(content, livePhotoPath, sdkId, sdkAppName); }\nvoid uploadTextAndLivePhoto(String content, String imagePath, String videoPath) { wa.uploadTextAndLivePhoto(content, imagePath, videoPath); }\nvoid uploadTextAndLivePhoto(String content, String imagePath, String videoPath, String sdkId, String sdkAppName) { wa.uploadTextAndLivePhoto(content, imagePath, videoPath, sdkId, sdkAppName); }\nvoid uploadTextAndLivePhoto(JSONObject jsonObj) { wa.uploadTextAndLivePhoto(jsonObj); }\nvoid uploadVideo(String videoPath) { wa.uploadVideo(videoPath); }\nvoid uploadVideo(JSONObject jsonObj) { wa.uploadVideo(jsonObj); }\nvoid uploadTextAndVideo(String content, String videoPath) { wa.uploadTextAndVideo(content, videoPath); }\nvoid uploadTextAndVideo(String content, String videoPath, String sdkId, String sdkAppName) { wa.uploadTextAndVideo(content, videoPath, sdkId, sdkAppName); }\nvoid uploadTextAndVideo(JSONObject jsonObj) { wa.uploadTextAndVideo(jsonObj); }\nvoid sendPat(String talker, String pattedUser) { wa.sendPat(talker, pattedUser); }\nvoid sendShareCard(String talker, String wxid) { wa.sendShareCard(talker, wxid); }\nboolean sendImage(String talker, String sendPath) { return wa.sendImage(talker, sendPath); }\nboolean sendImage(String talker, String sendPath, String appId) { return wa.sendImage(talker, sendPath, appId); }\nboolean sendOriginalImage(String talker, String sendPath) { return wa.sendOriginalImage(talker, sendPath); }\nboolean sendVoice(String talker, String sendPath) { return wa.sendVoice(talker, sendPath); }\nboolean sendVoice(String talker, String sendPath, int duration) { return wa.sendVoice(talker, sendPath, duration); }\nboolean sendVideo(String talker, String sendPath) { return wa.sendVideo(talker, sendPath); }\nboolean sendEmoji(String talker, String sendPath) { return wa.sendEmoji(talker, sendPath); }\nboolean sendFile(String talker, String sendPath) { return wa.sendFile(talker, sendPath); }\nboolean sendFile(String talker, String sendPath, String title) { return wa.sendFile(talker, sendPath, title); }\nObject getFavoriteList(int limit) { return wa.getFavoriteList(limit); }\nObject getFavorite(long localId) { return wa.getFavorite(localId); }\nboolean sendFavorite(String talker, long localId) { return wa.sendFavorite(talker, localId); }\nboolean sendFavorite(String talker, String localId) { return wa.sendFavorite(talker, localId); }\nvoid sendMediaMsg(String talker, Object mediaMessage, String appId) { wa.sendMediaMsg(talker, mediaMessage, appId); }\nvoid shareFile(String talker, String title, String filePath, String appId) { wa.shareFile(talker, title, filePath, appId); }\nvoid shareMiniProgram(String talker, String title, String description, String userName, String path, byte[] thumbData, String appId) { wa.shareMiniProgram(talker, title, description, userName, path, thumbData, appId); }\nvoid sendAppBrandMsg(String talker, String title, String pagePath, String ghName) { wa.sendAppBrandMsg(talker, title, pagePath, ghName); }\nvoid shareMusic(String talker, String title, String description, String musicUrl, String musicDataUrl, byte[] thumbData, String appId) { wa.shareMusic(talker, title, description, musicUrl, musicDataUrl, thumbData, appId); }\nvoid shareMusicVideo(String talker, String title, String description, String musicUrl, String musicDataUrl, String singerName, int duration, String songLyric, byte[] thumbData, String appId) { wa.shareMusicVideo(talker, title, description, musicUrl, musicDataUrl, singerName, duration, songLyric, thumbData, appId); }\nvoid shareText(String talker, String text, String appId) { wa.shareText(talker, text, appId); }\nvoid shareVideo(String talker, String title, String description, String videoUrl, byte[] thumbData, String appId) { wa.shareVideo(talker, title, description, videoUrl, thumbData, appId); }\nvoid shareWebpage(String talker, String title, String description, String webpageUrl, byte[] thumbData, String appId) { wa.shareWebpage(talker, title, description, webpageUrl, thumbData, appId); }\nvoid sendXmlMsg(String talker, String content) { wa.sendXmlMsg(talker, content); }\nvoid sendLocation(String talker, String poiName, String label, String x, String y, String scale) { wa.sendLocation(talker, poiName, label, x, y, scale); }\nvoid sendLocation(String talker, JSONObject jsonObj) { wa.sendLocation(talker, jsonObj); }\nlong insertSystemMsg(String talker, String content, long createTime) { return wa.insertSystemMsg(talker, content, createTime); }\nList queryHistoryMsg(String talker, long startTime, int count) { return wa.queryHistoryMsg(talker, startTime, count); }\nint getUnreadCount(String talker) { return wa.getUnreadCount(talker); }\nboolean deleteConversation(String talker) { return wa.deleteConversation(talker); }\nint getAllUnreadCount() { return wa.getAllUnreadCount(); }\nboolean clearUnread(String talker) { return wa.clearUnread(talker); }\nboolean clearAllUnread() { return wa.clearAllUnread(); }\nvoid delay(long millis, Runnable action) { wa.delay(millis, action); }\nvoid notify(String title, String text) { wa.notify(title, text); }\nint getFileType(String filePath) { return audio.getFileType(filePath); }\nint mp3ToSilk(String mp3Path, String silkPath) { return audio.mp3ToSilk(mp3Path, silkPath); }\nint mp3ToSilk(String mp3Path, String silkPath, int hz) { return audio.mp3ToSilk(mp3Path, silkPath, hz); }\nint wavToSilk(String wavPath, String silkPath, int hz) { return audio.wavToSilk(wavPath, silkPath, hz); }\nint flacToSilk(String flacPath, String silkPath, int hz) { return audio.flacToSilk(flacPath, silkPath, hz); }\nint oggToSilk(String oggPath, String silkPath, int hz) { return audio.oggToSilk(oggPath, silkPath, hz); }\nint pcmToSilk(String pcmPath, String silkPath, int hz, int pcmHz, int channels) { return audio.pcmToSilk(pcmPath, silkPath, hz, pcmHz, channels); }\nint autoToSilk(String audioPath, String silkPath, int hz) { return audio.autoToSilk(audioPath, silkPath, hz); }\nint silkToMp3(String silkPath, String mp3Path) { return audio.silkToMp3(silkPath, mp3Path); }\nint silkToMp3(String silkPath, String mp3Path, int hz) { return audio.silkToMp3(silkPath, mp3Path, hz); }\nint silkToPcm(String silkPath, String pcmPath, int hz) { return audio.silkToPcm(silkPath, pcmPath, hz); }\nint mp3ToPcm(String mp3Path, String pcmPath) { return audio.mp3ToPcm(mp3Path, pcmPath); }\nint wavToPcm(String wavPath, String pcmPath) { return audio.wavToPcm(wavPath, pcmPath); }\nint flacToPcm(String flacPath, String pcmPath) { return audio.flacToPcm(flacPath, pcmPath); }\nint oggToPcm(String oggPath, String pcmPath) { return audio.oggToPcm(oggPath, pcmPath); }\nint autoToPcm(String audioPath, String pcmPath) { return audio.autoToPcm(audioPath, pcmPath); }\nMap getAudioInfo(String filePath) { return audio.getAudioInfo(filePath); }\nint decodeAacFile(String aacPath, String pcmPath) { return audio.decodeAacFile(aacPath, pcmPath); }\nint encodePcmToAac(String pcmPath, String aacPath, int sampleRate, int channels) { return audio.encodePcmToAac(pcmPath, aacPath, sampleRate, channels); }\nint encodePcmToM4a(String pcmPath, String m4aPath, int sampleRate, int channels) { return audio.encodePcmToM4a(pcmPath, m4aPath, sampleRate, channels); }\nint mp4ToSilk(String mp4Path, String silkPath, int hz) { return audio.mp4ToSilk(mp4Path, silkPath, hz); }\nint silkToM4a(String silkPath, String m4aPath, int hz) { return audio.silkToM4a(silkPath, m4aPath, hz); }\nint mp4ToM4a(String mp4Path, String m4aPath, int hz) { return audio.mp4ToM4a(mp4Path, m4aPath, hz); }\nint mp4ToAac(String mp4Path, String aacPath, int hz) { return audio.mp4ToAac(mp4Path, aacPath, hz); }\nint m4aToSilk(String m4aPath, String silkPath, int hz) { return audio.m4aToSilk(m4aPath, silkPath, hz); }\nint aacToSilk(String aacPath, String silkPath, int hz) { return audio.aacToSilk(aacPath, silkPath, hz); }\nint m4aToAac(String m4aPath, String aacPath, int hz) { return audio.m4aToAac(m4aPath, aacPath, hz); }\nint m4aToM4a(String m4aPath, String m4aPathOut, int hz) { return audio.m4aToM4a(m4aPath, m4aPathOut, hz); }\nint autoToAac(String inputPath, String aacPath, int hz) { return audio.autoToAac(inputPath, aacPath, hz); }\nint autoToM4a(String inputPath, String m4aPath, int hz) { return audio.autoToM4a(inputPath, m4aPath, hz); }\nint autoAacToSilk(String inputPath, String silkPath, int hz) { return audio.autoAacToSilk(inputPath, silkPath, hz); }\nint silkToAac(String silkPath, String aacPath, int hz) { return audio.silkToAac(silkPath, aacPath, hz); }\nint aacToPcm(String aacPath, String pcmPath) { return audio.aacToPcm(aacPath, pcmPath); }\nint pcmToAac(String pcmPath, String aacPath, int sampleRate, int channels) { return audio.pcmToAac(pcmPath, aacPath, sampleRate, channels); }\nint pcmToM4a(String pcmPath, String m4aPath, int sampleRate, int channels) { return audio.pcmToM4a(pcmPath, m4aPath, sampleRate, channels); }\nint m4aToPcm(String m4aPath, String pcmPath) { return audio.m4aToPcm(m4aPath, pcmPath); }\nint decodeM4aFile(String m4aPath, String pcmPath) { return audio.decodeM4aFile(m4aPath, pcmPath); }\nlong getDuration(String filePath) { return audio.getDuration(filePath); }\nlong getDurationLimited(String filePath) { return audio.getDurationLimited(filePath); }\nString getErrorMessage(int code) { return audio.getErrorMessage(code); }\nvoid startTransform(int type, String inputPath, String outputPath, int sampleRate, Consumer callback) { audio.startTransform(type, inputPath, outputPath, sampleRate, callback); }\nvoid get(String url, Map headerMap, Consumer callback) { wa.get(url, headerMap, callback); }\nvoid get(String url, Map headerMap, long timeout, Consumer callback) { wa.get(url, headerMap, timeout, callback); }\nvoid get(String url, Map headerMap, PluginCallBack.HttpCallback callback) {\n    wa.get(url, headerMap, new Consumer() {\n        public void accept(Object body) {\n            if (body != null) callback.onSuccess(200, String.valueOf(body));\n            else callback.onError(new Exception(\"GET failed: \" + url));\n        }\n    });\n}\nvoid get(String url, Map headerMap, long timeout, PluginCallBack.HttpCallback callback) {\n    wa.get(url, headerMap, timeout, new Consumer() {\n        public void accept(Object body) {\n            if (body != null) callback.onSuccess(200, String.valueOf(body));\n            else callback.onError(new Exception(\"GET failed: \" + url));\n        }\n    });\n}\nvoid post(String url, Map paramMap, Map headerMap, Consumer callback) { wa.post(url, paramMap, headerMap, callback); }\nvoid post(String url, Map paramMap, Map headerMap, long timeout, Consumer callback) { wa.post(url, paramMap, headerMap, timeout, callback); }\nvoid post(String url, Map paramMap, Map headerMap, PluginCallBack.HttpCallback callback) {\n    wa.post(url, paramMap, headerMap, new Consumer() {\n        public void accept(Object body) {\n            if (body != null) callback.onSuccess(200, String.valueOf(body));\n            else callback.onError(new Exception(\"POST failed: \" + url));\n        }\n    });\n}\nvoid post(String url, Map paramMap, Map headerMap, long timeout, PluginCallBack.HttpCallback callback) {\n    wa.post(url, paramMap, headerMap, timeout, new Consumer() {\n        public void accept(Object body) {\n            if (body != null) callback.onSuccess(200, String.valueOf(body));\n            else callback.onError(new Exception(\"POST failed: \" + url));\n        }\n    });\n}\nvoid download(String url, String path, Map headerMap, Consumer callback) { wa.download(url, path, headerMap, callback); }\nvoid download(String url, String path, Map headerMap, long timeout, Consumer callback) { wa.download(url, path, headerMap, timeout, callback); }\nvoid download(String url, String path, Map headerMap, PluginCallBack.DownloadCallback callback) {\n    wa.download(url, path, headerMap, new Consumer() {\n        public void accept(Object file) {\n            if (file instanceof File) callback.onSuccess((File) file);\n            else callback.onError(new Exception(\"Download failed: \" + url));\n        }\n    });\n}\nvoid download(String url, String path, Map headerMap, long timeout, PluginCallBack.DownloadCallback callback) {\n    wa.download(url, path, headerMap, timeout, new Consumer() {\n        public void accept(Object file) {\n            if (file instanceof File) callback.onSuccess((File) file);\n            else callback.onError(new Exception(\"Download failed: \" + url));\n        }\n    });\n}\nvoid downloadImage(String url, Consumer callback) { wa.downloadImage(url, callback); }\nvoid downloadImage(String url, String fileName, Consumer callback) { wa.downloadImage(url, fileName, callback); }\nvoid downloadImg(String md5, String cdnUrl, String aesKey, String savePath) { wa.downloadImg(md5, cdnUrl, aesKey, savePath); }\nvoid downloadImg(Object imageMsg, String savePath) { wa.downloadImg(imageMsg, savePath); }\nvoid downloadImg(Object imageMsg, String savePath, PluginCallBack.DownloadCallback callback) { wa.downloadImg(imageMsg, savePath, callback); }\nvoid downloadImages(List urlList, Consumer callback) { wa.downloadImages(urlList, callback); }\nvoid downloadImages(List urlList, String prefix, Consumer callback) { wa.downloadImages(urlList, prefix, callback); }\nvoid downloadVideo(String md5, String cdnUrl, String aesKey, String savePath, PluginCallBack.DownloadCallback callback) { wa.downloadVideo(md5, cdnUrl, aesKey, savePath, callback); }\nvoid downloadVideo(Object videoMessage, String savePath, PluginCallBack.DownloadCallback callback) { wa.downloadVideo(videoMessage, savePath, callback); }"
            r5.eval(r13)
            return r5
    }

    private final void notifyPluginCatalogChanged() {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<fg.a> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.pluginCatalogListeners
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L9
            goto L1d
        L9:
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            fg.a r1 = (fg.a) r1
            r1.invoke()     // Catch: java.lang.Throwable -> Ld
            goto Ld
        L1d:
            return
    }

    public static /* synthetic */ boolean o(eb.a0 r0) {
            boolean r0 = dispatchOnMemberChange$lambda$0(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Long p(long r0, gg.q r2, java.lang.String r3, java.lang.Long r4) {
            java.lang.Long r0 = logSendButtonDiagnostic$lambda$0(r0, r2, r3, r4)
            return r0
    }

    private final java.util.Set<java.lang.String> parseProcessScope(java.lang.String r12, java.lang.String r13) {
            r11 = this;
            java.lang.String r0 = "main"
            if (r13 == 0) goto L152
            boolean r1 = og.m.t0(r13)
            if (r1 == 0) goto Lc
            goto L152
        Lc:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r2 = j8.b.l(r2, r13, r2)
            java.lang.String r3 = "[,;|\\s]+"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            r3.getClass()
            r4 = 0
            og.m.D0(r4)
            java.util.regex.Matcher r3 = r3.matcher(r2)
            boolean r5 = r3.find()
            if (r5 != 0) goto L37
            java.lang.String r2 = r2.toString()
            java.util.List r2 = a.a.x0(r2)
            goto L68
        L37:
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            r5.<init>(r6)
            r6 = r4
        L3f:
            int r7 = r3.start()
            java.lang.CharSequence r6 = r2.subSequence(r6, r7)
            java.lang.String r6 = r6.toString()
            r5.add(r6)
            int r6 = r3.end()
            boolean r7 = r3.find()
            if (r7 != 0) goto L3f
            int r3 = r2.length()
            java.lang.CharSequence r2 = r2.subSequence(r6, r3)
            java.lang.String r2 = r2.toString()
            r5.add(r2)
            r2 = r5
        L68:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L71:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L88
            java.lang.Object r5 = r2.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = og.m.t0(r6)
            if (r6 != 0) goto L71
            r3.add(r5)
            goto L71
        L88:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r5 = r3.iterator()
        L91:
            boolean r6 = r5.hasNext()
            java.lang.String r7 = "all"
            java.lang.String r8 = "appbrand"
            if (r6 == 0) goto Lbe
            java.lang.Object r6 = r5.next()
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = gg.l.a(r9, r0)
            if (r10 != 0) goto Lb7
            boolean r8 = gg.l.a(r9, r8)
            if (r8 != 0) goto Lb7
            boolean r7 = gg.l.a(r9, r7)
            if (r7 == 0) goto Lb5
            goto Lb7
        Lb5:
            r7 = r4
            goto Lb8
        Lb7:
            r7 = 1
        Lb8:
            if (r7 != 0) goto L91
            r2.add(r6)
            goto L91
        Lbe:
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lfe
            java.lang.CharSequence r0 = og.m.R0(r13)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = ":"
            java.lang.String r0 = wb.en.h(r12, r1, r0)
            java.util.concurrent.ConcurrentHashMap$KeySetView<java.lang.String, java.lang.Boolean> r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.invalidProcessWarnings
            boolean r0 = r1.add(r0)
            if (r0 == 0) goto Lfb
            java.lang.CharSequence r13 = og.m.R0(r13)
            java.lang.String r13 = r13.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[Hchat:Script] 插件进程配置无效，已拒绝加载: plugin="
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r12 = " process="
            r0.append(r12)
            r0.append(r13)
            java.lang.String r12 = r0.toString()
            fb.v0.m(r12)
        Lfb:
            tf.v r12 = tf.v.f13169g
            return r12
        Lfe:
            java.util.Iterator r12 = r3.iterator()
        L102:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L146
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            int r2 = r13.hashCode()
            r3 = 96673(0x179a1, float:1.35468E-40)
            if (r2 == r3) goto L138
            r3 = 3343801(0x3305b9, float:4.685663E-39)
            if (r2 == r3) goto L12d
            r3 = 1170537990(0x45c4fe06, float:6303.753)
            if (r2 == r3) goto L122
            goto L102
        L122:
            boolean r13 = r13.equals(r8)
            if (r13 != 0) goto L129
            goto L102
        L129:
            r1.add(r8)
            goto L102
        L12d:
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L134
            goto L102
        L134:
            r1.add(r0)
            goto L102
        L138:
            boolean r13 = r13.equals(r7)
            if (r13 != 0) goto L13f
            goto L102
        L13f:
            r1.add(r0)
            r1.add(r8)
            goto L102
        L146:
            boolean r12 = r1.isEmpty()
            if (r12 == 0) goto L151
            java.util.Set r12 = ac.p.N(r0)
            return r12
        L151:
            return r1
        L152:
            java.util.Set r12 = ac.p.N(r0)
            return r12
    }

    private static final void prepareSnsPostMedia$lambda$0(p8.d0 r3, java.lang.String r4, java.util.concurrent.atomic.AtomicBoolean r5, java.lang.String r6, bsh.Interpreter r7, java.lang.String r8, java.util.function.Consumer r9) {
            java.lang.String r0 = "[Hchat:Script] 朋友圈媒体准备回调失败: "
            h.Hchat.hooks.api.model.WeChatSnsPrepareResult r3 = r3.p(r4, r5)     // Catch: java.lang.Throwable -> L19
            boolean r4 = r5.get()     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L6c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, eb.a0> r4 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedPlugins     // Catch: java.lang.Throwable -> L19
            java.lang.Object r1 = r4.get(r6)     // Catch: java.lang.Throwable -> L19
            eb.a0 r1 = (eb.a0) r1     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1b
            bsh.Interpreter r2 = r1.f2487b     // Catch: java.lang.Throwable -> L19
            goto L1c
        L19:
            r3 = move-exception
            goto L72
        L1b:
            r2 = 0
        L1c:
            if (r2 != r7) goto L6c
            h.Hchat.hooks.items.script.ScriptPluginRuntime r2 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.locks.ReentrantLock r7 = r2.interpreterLock(r7)     // Catch: java.lang.Throwable -> L3f
            r7.lock()     // Catch: java.lang.Throwable -> L3f
            boolean r2 = r5.get()     // Catch: java.lang.Throwable -> L37
            if (r2 != 0) goto L39
            java.lang.Object r4 = r4.get(r6)     // Catch: java.lang.Throwable -> L37
            if (r4 != r1) goto L39
            r9.accept(r3)     // Catch: java.lang.Throwable -> L37
            goto L39
        L37:
            r3 = move-exception
            goto L41
        L39:
            r7.unlock()     // Catch: java.lang.Throwable -> L3f
            sf.n r3 = sf.n.f12433a     // Catch: java.lang.Throwable -> L3f
            goto L4b
        L3f:
            r3 = move-exception
            goto L45
        L41:
            r7.unlock()     // Catch: java.lang.Throwable -> L3f
            throw r3     // Catch: java.lang.Throwable -> L3f
        L45:
            sf.f r4 = new sf.f     // Catch: java.lang.Throwable -> L19
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L19
            r3 = r4
        L4b:
            java.lang.Throwable r3 = sf.g.b(r3)     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L6c
            java.lang.String r4 = r3.getMessage()     // Catch: java.lang.Throwable -> L19
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L19
            r7.append(r6)     // Catch: java.lang.Throwable -> L19
            java.lang.String r6 = " "
            r7.append(r6)     // Catch: java.lang.Throwable -> L19
            r7.append(r4)     // Catch: java.lang.Throwable -> L19
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> L19
            fb.v0.n(r4, r3)     // Catch: java.lang.Throwable -> L19
        L6c:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.atomic.AtomicBoolean> r3 = h.Hchat.hooks.items.script.ScriptPluginRuntime.snsPrepareCancellations
            r3.remove(r8, r5)
            return
        L72:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.atomic.AtomicBoolean> r4 = h.Hchat.hooks.items.script.ScriptPluginRuntime.snsPrepareCancellations
            r4.remove(r8, r5)
            throw r3
    }

    private final java.io.File processScopedCacheRoot(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.io.File r3 = r3.getCodeCacheDir()
            r0.<init>(r3, r4)
            java.lang.String r3 = h.Hchat.hooks.items.script.ScriptPluginRuntime.runtimeProcess
            java.lang.String r4 = "appbrand"
            boolean r3 = gg.l.a(r3, r4)
            if (r3 != 0) goto L14
            return r0
        L14:
            java.lang.String r3 = h.Hchat.hooks.items.script.ScriptPluginRuntime.runtimeProcessName
            boolean r1 = og.m.t0(r3)
            if (r1 == 0) goto L1d
            goto L1e
        L1d:
            r4 = r3
        L1e:
            java.lang.String r3 = r2.safeFileName(r4)
            java.io.File r4 = new java.io.File
            r4.<init>(r0, r3)
            return r4
    }

    private static final java.lang.Thread protobufCallbackExecutor$lambda$0(java.lang.Runnable r2) {
            java.lang.String r0 = "Hchat-Script-Protobuf"
            r1 = 1
            java.lang.Thread r2 = j8.b.n(r0, r1, r2)
            return r2
    }

    private static final void protobufPacketListener$lambda$0(h.Hchat.hooks.items.protobuf.ProtobufPacketRuntime$Packet r1) {
            h.Hchat.hooks.items.script.ScriptPluginRuntime r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            r1.getClass()
            r0.dispatchOnProtobufPacket(r1)
            return
    }

    public static /* synthetic */ java.lang.Thread q(java.lang.Runnable r0) {
            java.lang.Thread r0 = snsPrepareExecutor$lambda$0(r0)
            return r0
    }

    public static /* synthetic */ boolean r(eb.a0 r0) {
            boolean r0 = dispatchOnHandleMsg$lambda$0(r0)
            return r0
    }

    private final java.util.Properties readPluginMeta(java.io.File r6) {
            r5 = this;
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "info.prop"
            r1.<init>(r6, r2)
            boolean r2 = r1.isFile()
            if (r2 != 0) goto L13
            goto L4c
        L13:
            java.nio.charset.Charset r2 = og.a.f9804a     // Catch: java.lang.Throwable -> L28
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L28
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L28
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L28
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L28
            r0.load(r3)     // Catch: java.lang.Throwable -> L2a
            r3.close()     // Catch: java.lang.Throwable -> L28
            sf.n r1 = sf.n.f12433a     // Catch: java.lang.Throwable -> L28
            goto L37
        L28:
            r1 = move-exception
            goto L31
        L2a:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L2c
        L2c:
            r2 = move-exception
            ig.a.i(r3, r1)     // Catch: java.lang.Throwable -> L28
            throw r2     // Catch: java.lang.Throwable -> L28
        L31:
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L37:
            java.lang.Throwable r1 = sf.g.b(r1)
            if (r1 == 0) goto L4c
            java.lang.String r6 = r6.getName()
            java.lang.String r2 = r1.getMessage()
            java.lang.String r3 = "[Hchat:Script] 读取插件信息失败: "
            java.lang.String r4 = " "
            eh.a.w(r3, r6, r4, r2, r1)
        L4c:
            return r0
    }

    private final synchronized void refreshPluginDirObservers(java.io.File r11) {
            r10 = this;
            monitor-enter(r10)
            java.io.File[] r0 = r11.listFiles()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L44
            ng.j r0 = tf.l.k0(r0)     // Catch: java.lang.Throwable -> L41
            c0.f r1 = new c0.f     // Catch: java.lang.Throwable -> L41
            java.lang.Class<h.Hchat.hooks.items.script.ScriptPluginRuntime> r2 = h.Hchat.hooks.items.script.ScriptPluginRuntime.class
            gg.f r2 = gg.v.a(r2)     // Catch: java.lang.Throwable -> L41
            java.lang.Class r4 = r2.a()     // Catch: java.lang.Throwable -> L41
            r4.getClass()     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = "isPluginDirectory"
            java.lang.String r6 = "isPluginDirectory(Ljava/io/File;)Z"
            r8 = 0
            r9 = 13
            r2 = 1
            r7 = 0
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L3d
            ng.i r2 = new ng.i     // Catch: java.lang.Throwable -> L3d
            r4 = 1
            r2.<init>(r0, r4, r1)     // Catch: java.lang.Throwable -> L3d
            e9.h r0 = new e9.h     // Catch: java.lang.Throwable -> L3d
            r1 = 15
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3d
            ng.t r0 = ng.m.W(r2, r0)     // Catch: java.lang.Throwable -> L3d
            java.util.Set r0 = ng.m.c0(r0)     // Catch: java.lang.Throwable -> L3d
            goto L47
        L3d:
            r0 = move-exception
        L3e:
            r11 = r0
            goto Lf3
        L41:
            r0 = move-exception
            r3 = r10
            goto L3e
        L44:
            r3 = r10
            tf.v r0 = tf.v.f13169g     // Catch: java.lang.Throwable -> L3d
        L47:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, android.os.FileObserver> r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.pluginDirObservers     // Catch: java.lang.Throwable -> L3d
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L3d
            r1.getClass()     // Catch: java.lang.Throwable -> L3d
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L3d
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3d
            r2.<init>()     // Catch: java.lang.Throwable -> L3d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3d
        L5b:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L3d
            if (r4 == 0) goto L72
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L3d
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L3d
            boolean r5 = r0.contains(r5)     // Catch: java.lang.Throwable -> L3d
            if (r5 != 0) goto L5b
            r2.add(r4)     // Catch: java.lang.Throwable -> L3d
            goto L5b
        L72:
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L3d
        L76:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto La2
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3d
            r1.getClass()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L3d
            java.util.concurrent.ConcurrentHashMap<java.lang.String, android.os.FileObserver> r2 = h.Hchat.hooks.items.script.ScriptPluginRuntime.pluginDirObservers     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r2 = r2.remove(r1)     // Catch: java.lang.Throwable -> L3d
            android.os.FileObserver r2 = (android.os.FileObserver) r2     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L92
            r2.stopWatching()     // Catch: java.lang.Throwable -> L3d
        L92:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Runnable> r2 = h.Hchat.hooks.items.script.ScriptPluginRuntime.reloadTasks     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r1 = r2.remove(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L76
            android.os.Handler r2 = h.Hchat.hooks.items.script.ScriptPluginRuntime.mainHandler     // Catch: java.lang.Throwable -> L3d
            r2.removeCallbacks(r1)     // Catch: java.lang.Throwable -> L3d
            goto L76
        La2:
            java.io.File[] r11 = r11.listFiles()     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto Lf1
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3d
            r0.<init>()     // Catch: java.lang.Throwable -> L3d
            int r1 = r11.length     // Catch: java.lang.Throwable -> L3d
            r2 = 0
        Laf:
            if (r2 >= r1) goto Lbf
            r4 = r11[r2]     // Catch: java.lang.Throwable -> L3d
            boolean r5 = r10.isPluginDirectory(r4)     // Catch: java.lang.Throwable -> L3d
            if (r5 == 0) goto Lbc
            r0.add(r4)     // Catch: java.lang.Throwable -> L3d
        Lbc:
            int r2 = r2 + 1
            goto Laf
        Lbf:
            java.util.Iterator r11 = r0.iterator()     // Catch: java.lang.Throwable -> L3d
        Lc3:
            boolean r0 = r11.hasNext()     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto Lf1
            java.lang.Object r0 = r11.next()     // Catch: java.lang.Throwable -> L3d
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Throwable -> L3d
            java.util.concurrent.ConcurrentHashMap<java.lang.String, android.os.FileObserver> r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.pluginDirObservers     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = r0.getName()     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto Ldc
            goto Lc3
        Ldc:
            java.lang.String r2 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L3d
            eb.e0 r4 = new eb.e0     // Catch: java.lang.Throwable -> L3d
            r5 = 0
            r4.<init>(r0, r2, r5)     // Catch: java.lang.Throwable -> L3d
            r4.startWatching()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L3d
            r1.put(r0, r4)     // Catch: java.lang.Throwable -> L3d
            goto Lc3
        Lf1:
            monitor-exit(r10)
            return
        Lf3:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L3d
            throw r11
    }

    private static final java.lang.String refreshPluginDirObservers$lambda$0(java.io.File r0) {
            java.lang.String r0 = r0.getName()
            return r0
    }

    private static final void reloadPluginAsync$lambda$0(android.content.Context r3, java.lang.String r4) {
            h.Hchat.hooks.items.script.ScriptPluginRuntime r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            java.lang.Object r3 = r0.m14reloadPlugingIAlus(r3, r4)
            boolean r0 = r3 instanceof sf.f
            if (r0 == 0) goto L25
            java.lang.Throwable r0 = sf.g.b(r3)
            if (r0 == 0) goto L15
            java.lang.String r0 = r0.getMessage()
            goto L16
        L15:
            r0 = 0
        L16:
            java.lang.String r1 = "[Hchat:Script] 插件重载失败: "
            java.lang.String r2 = " "
            java.lang.String r4 = bc.e.j(r1, r4, r2, r0)
            java.lang.Throwable r3 = sf.g.b(r3)
            fb.v0.n(r4, r3)
        L25:
            return
    }

    private final void reloadPluginFromFileChange(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            java.lang.Thread r0 = new java.lang.Thread
            eb.w r1 = new eb.w
            r2 = 2
            r1.<init>(r4, r5, r2)
            java.lang.String r4 = "Hchat-Script-AutoReload-"
            java.lang.String r4 = wb.en.g(r4, r5)
            r0.<init>(r1, r4)
            r0.start()
            return
    }

    private static final void reloadPluginFromFileChange$lambda$0(android.content.Context r3, java.lang.String r4) {
            h.Hchat.hooks.items.script.ScriptPluginRuntime r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            java.lang.Object r1 = r0.m14reloadPlugingIAlus(r3, r4)
            boolean r1 = r1 instanceof sf.f
            if (r1 == 0) goto L58
            java.util.List r0 = r0.listPlugins(r3)
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            r2 = r1
            eb.c0 r2 = (eb.c0) r2
            java.lang.String r2 = r2.f2506a
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L12
            goto L29
        L28:
            r1 = 0
        L29:
            eb.c0 r1 = (eb.c0) r1
            java.lang.String r0 = "Hchat_script_plugin_config"
            android.content.SharedPreferences r0 = ub.b.c(r3, r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r4.getClass()
            java.lang.String r2 = "script_plugin_item_"
            java.lang.String r4 = r2.concat(r4)
            r2 = 0
            android.content.SharedPreferences$Editor r4 = r0.putBoolean(r4, r2)
            r4.apply()
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r4.<init>(r0)
            a1.d r0 = new a1.d
            r2 = 7
            r0.<init>(r3, r2, r1)
            r4.post(r0)
        L58:
            h.Hchat.hooks.items.script.ScriptPluginRuntime r3 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            r3.notifyPluginCatalogChanged()
            return
    }

    private static final void reloadPluginFromFileChange$lambda$0$1(android.content.Context r2, eb.c0 r3) {
            if (r3 == 0) goto L7
            java.lang.String r3 = r3.f2513h
            if (r3 == 0) goto L7
            goto L9
        L7:
            java.lang.String r3 = "未知"
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "加载["
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = "]失败，已自动关闭"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r0)
            r2.show()
            return
    }

    private final java.io.File resolvePluginFile(java.io.File r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = og.m.t0(r4)
            if (r0 != 0) goto L18
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r1 = r0.isAbsolute()
            if (r1 == 0) goto L12
            return r0
        L12:
            java.io.File r0 = new java.io.File
            r0.<init>(r3, r4)
            return r0
        L18:
            java.lang.String r3 = "路径不能为空"
            j8.o.t(r3)
            r3 = 0
            return r3
    }

    public static /* synthetic */ void s(p8.d0 r0, java.lang.String r1, java.util.concurrent.atomic.AtomicBoolean r2, java.lang.String r3, bsh.Interpreter r4, java.lang.String r5, java.util.function.Consumer r6) {
            prepareSnsPostMedia$lambda$0(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    private final java.lang.String safeCallbackFilePart(java.lang.String r3) {
            r2 = this;
            if (r3 != 0) goto L4
            java.lang.String r3 = ""
        L4:
            java.lang.String r0 = "[^A-Za-z0-9._-]"
            java.lang.String r1 = "_"
            java.lang.String r3 = j8.b.h(r0, r3, r1)
            boolean r0 = og.m.t0(r3)
            if (r0 == 0) goto L14
            java.lang.String r3 = "unknown"
        L14:
            return r3
    }

    private final java.lang.String safeFileName(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "[^A-Za-z0-9._-]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            r2.getClass()
            java.util.regex.Matcher r2 = r0.matcher(r2)
            java.lang.String r0 = "_"
            java.lang.String r2 = r2.replaceAll(r0)
            r2.getClass()
            boolean r0 = og.m.t0(r2)
            if (r0 == 0) goto L21
            java.lang.String r2 = "plugin"
        L21:
            return r2
    }

    private final void schedulePluginReload(java.lang.String r5) {
            r4 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, eb.a0> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedPlugins
            boolean r0 = r0.containsKey(r5)
            if (r0 != 0) goto L9
            goto L29
        L9:
            android.content.Context r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.appContext
            if (r0 == 0) goto L29
            eb.w r1 = new eb.w
            r2 = 1
            r1.<init>(r5, r0, r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Runnable> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.reloadTasks
            java.lang.Object r5 = r0.put(r5, r1)
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            if (r5 == 0) goto L22
            android.os.Handler r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.mainHandler
            r0.removeCallbacks(r5)
        L22:
            android.os.Handler r5 = h.Hchat.hooks.items.script.ScriptPluginRuntime.mainHandler
            r2 = 500(0x1f4, double:2.47E-321)
            r5.postDelayed(r1, r2)
        L29:
            return
    }

    private static final void schedulePluginReload$lambda$0(java.lang.String r1, android.content.Context r2) {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Runnable> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.reloadTasks
            r0.remove(r1)
            h.Hchat.hooks.items.script.ScriptPluginRuntime r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            r0.reloadPluginFromFileChange(r2, r1)
            return
    }

    private final boolean scriptHasCallback(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            r5.getClass()
            java.lang.String r0 = java.util.regex.Pattern.quote(r5)
            r0.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "\\b"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "\\s*\\("
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r1.getClass()
            r4.getClass()
            java.util.regex.Matcher r1 = r1.matcher(r4)
            boolean r1 = r1.find()
            if (r1 != 0) goto L89
            r6.getClass()
            java.lang.String r6 = java.util.regex.Pattern.quote(r6)
            r6.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r6)
            r1.append(r0)
            java.lang.String r6 = r1.toString()
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)
            r6.getClass()
            java.util.regex.Matcher r6 = r6.matcher(r4)
            boolean r6 = r6.find()
            if (r6 != 0) goto L89
            java.lang.String r5 = java.util.regex.Pattern.quote(r5)
            r5.getClass()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "\\buseCallback\\s*\\(\\s*[\"']"
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r5 = "[\"']\\s*,"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            r5.getClass()
            java.util.regex.Matcher r4 = r5.matcher(r4)
            boolean r4 = r4.find()
            if (r4 == 0) goto L87
            goto L89
        L87:
            r4 = 0
            return r4
        L89:
            r4 = 1
            return r4
    }

    private static final void sendProtobufPacket$lambda$0(java.util.function.Consumer r1, boolean r2, java.lang.String r3) {
            h.Hchat.hooks.items.script.ScriptPluginRuntime r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            r0.deliverProtobufSendResult(r1, r2, r3)
            return
    }

    private static final void sendProtobufPacket$lambda$1(java.util.function.Consumer r1, boolean r2, java.lang.String r3) {
            h.Hchat.hooks.items.script.ScriptPluginRuntime r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            r0.deliverProtobufSendResult(r1, r2, r3)
            return
    }

    private final java.lang.String sha256(java.io.File r8) {
            r7 = this;
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r8)
            r8 = 8192(0x2000, float:1.148E-41)
            byte[] r8 = new byte[r8]     // Catch: java.lang.Throwable -> L4d
        Lf:
            int r2 = r1.read(r8)     // Catch: java.lang.Throwable -> L4d
            r3 = 0
            if (r2 > 0) goto L49
            r1.close()
            byte[] r8 = r0.digest()
            r8.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            int r2 = r8.length
            r4 = r3
        L2c:
            if (r3 >= r2) goto L41
            r5 = r8[r3]
            r6 = 1
            int r4 = r4 + r6
            if (r4 <= r6) goto L37
            r0.append(r1)
        L37:
            java.lang.CharSequence r5 = sha256$lambda$1(r5)
            r0.append(r5)
            int r3 = r3 + 1
            goto L2c
        L41:
            r0.append(r1)
            java.lang.String r8 = r0.toString()
            return r8
        L49:
            r0.update(r8, r3, r2)     // Catch: java.lang.Throwable -> L4d
            goto Lf
        L4d:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L4f
        L4f:
            r0 = move-exception
            ig.a.i(r1, r8)
            throw r0
    }

    private static final java.lang.CharSequence sha256$lambda$1(byte r1) {
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r0 = 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = "%02x"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            return r1
    }

    private final javax.crypto.SecretKey snapshotKey(java.lang.String r3) {
            r2 = this;
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec
            byte[] r0 = r2.snapshotKeyBytes()
            java.lang.String r1 = "AES"
            r3.<init>(r0, r1)
            return r3
    }

    private final byte[] snapshotKeyBytes() {
            r5 = this;
            r0 = 16
            byte[] r1 = new byte[r0]
            r1 = {x0018: FILL_ARRAY_DATA , data: [106, 107, 104, 105, 110, 111, 108, 109, 98, 99, 59, 56, 57, 62, 63, 60} // fill-array
            byte[] r2 = new byte[r0]
            r3 = 0
        La:
            if (r3 >= r0) goto L16
            r4 = r1[r3]
            r4 = r4 ^ 90
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r3 + 1
            goto La
        L16:
            return r2
    }

    private static final java.lang.Thread snsPrepareExecutor$lambda$0(java.lang.Runnable r2) {
            java.lang.String r0 = "Hchat-Script-SnsPrepare"
            r1 = 1
            java.lang.Thread r2 = j8.b.n(r0, r1, r2)
            return r2
    }

    private final synchronized void startPluginObservers(android.content.Context r4) {
            r3 = this;
            monitor-enter(r3)
            java.io.File r4 = r3.ensureDirs(r4)     // Catch: java.lang.Throwable -> L19
            android.os.FileObserver r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.scriptRootObserver     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L1b
            java.lang.String r0 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L19
            eb.e0 r1 = new eb.e0     // Catch: java.lang.Throwable -> L19
            r2 = 1
            r1.<init>(r4, r0, r2)     // Catch: java.lang.Throwable -> L19
            r1.startWatching()     // Catch: java.lang.Throwable -> L19
            h.Hchat.hooks.items.script.ScriptPluginRuntime.scriptRootObserver = r1     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r4 = move-exception
            goto L20
        L1b:
            r3.refreshPluginDirObservers(r4)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r3)
            return
        L20:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L19
            throw r4
    }

    private final boolean supportsProcess(eb.c0 r1, java.lang.String r2) {
            r0 = this;
            java.util.Set r1 = r1.f2514i
            boolean r1 = r1.contains(r2)
            return r1
    }

    public static /* synthetic */ void t(h.Hchat.hooks.items.protobuf.ProtobufPacketRuntime$Packet r0) {
            dispatchOnProtobufPacket$lambda$1(r0)
            return
    }

    public static /* synthetic */ void u(android.content.Context r0, eb.c0 r1) {
            reloadPluginFromFileChange$lambda$0$1(r0, r1)
            return
    }

    /* JADX INFO: renamed from: unloadAllPlugins-d1pmJ48, reason: not valid java name */
    private final synchronized java.lang.Object m10unloadAllPluginsd1pmJ48() {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, eb.a0> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedPlugins     // Catch: java.lang.Throwable -> L2c
            java.util.Enumeration r0 = r0.keys()     // Catch: java.lang.Throwable -> L2c
            r0.getClass()     // Catch: java.lang.Throwable -> L2c
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch: java.lang.Throwable -> L2c
            r0.getClass()     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2c
        L15:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L2c
            r1.getClass()     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r1 = r2.m11unloadPluginIoAF18A(r1)     // Catch: java.lang.Throwable -> L2c
            f8.i.I0(r1)     // Catch: java.lang.Throwable -> L2c
            goto L15
        L2c:
            r0 = move-exception
            goto L31
        L2e:
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L2c
            goto L37
        L31:
            sf.f r1 = new sf.f     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3b
            r0 = r1
        L37:
            monitor-exit(r2)
            return r0
        L39:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3b
            throw r0
        L3b:
            r0 = move-exception
            goto L39
    }

    /* JADX INFO: renamed from: unloadPlugin-IoAF18A, reason: not valid java name */
    private final synchronized java.lang.Object m11unloadPluginIoAF18A(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "[Hchat:Script] 插件卸载回调失败: "
            monitor-enter(r5)
            r5.cancelSnsPrepareTasks(r6)     // Catch: java.lang.Throwable -> L4a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, eb.a0> r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedPlugins     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r1 = r1.remove(r6)     // Catch: java.lang.Throwable -> L4a
            eb.a0 r1 = (eb.a0) r1     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L5a
            r5.updateProtobufPacketListener()     // Catch: java.lang.Throwable -> L4a
            bsh.Interpreter r2 = r1.f2487b     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "onUnload"
            r5.callLifecycle(r2, r3)     // Catch: java.lang.Throwable -> L1d
            sf.n r2 = sf.n.f12433a     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r2 = move-exception
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> L4a
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L4a
            r2 = r3
        L24:
            java.lang.Throwable r2 = sf.g.b(r2)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L4c
            eb.c0 r1 = r1.f2486a     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = r1.f2507b     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = r2.getMessage()     // Catch: java.lang.Throwable -> L4a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L4a
            r4.append(r1)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = " "
            r4.append(r0)     // Catch: java.lang.Throwable -> L4a
            r4.append(r3)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L4a
            fb.v0.n(r0, r2)     // Catch: java.lang.Throwable -> L4a
            goto L4c
        L4a:
            r6 = move-exception
            goto L5e
        L4c:
            h.Hchat.hooks.items.script.ScriptPluginBridge r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.bridge     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L53
            r0.unhookPlugin(r6)     // Catch: java.lang.Throwable -> L4a
        L53:
            r5.notifyPluginCatalogChanged()     // Catch: java.lang.Throwable -> L4a
            sf.n r6 = sf.n.f12433a     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r5)
            return r6
        L5a:
            sf.n r6 = sf.n.f12433a     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r5)
            return r6
        L5e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4a
            throw r6
    }

    private final void updateProtobufPacketListener() {
            r5 = this;
            java.lang.Object r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.protobufListenerLock
            monitor-enter(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, eb.a0> r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedPlugins     // Catch: java.lang.Throwable -> L1e
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L1e
            r1.getClass()     // Catch: java.lang.Throwable -> L1e
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L1e
            boolean r2 = r1 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L1e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L21
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L1e
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L21
            goto L80
        L1e:
            r1 = move-exception
            goto Lcb
        L21:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1e
        L25:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L80
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1e
            eb.a0 r2 = (eb.a0) r2     // Catch: java.lang.Throwable -> L1e
            boolean r2 = r2.f2493h     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L25
            java.util.concurrent.atomic.AtomicBoolean r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.protobufListenerRegistered     // Catch: java.lang.Throwable -> L1e
            boolean r1 = r1.compareAndSet(r4, r3)     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L3f
            monitor-exit(r0)
            return
        L3f:
            wa.i r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.protobufPacketListener     // Catch: java.lang.Throwable -> L54
            if (r1 == 0) goto L4c
            java.util.concurrent.CopyOnWriteArrayList r2 = wa.j.f14927c     // Catch: java.lang.Throwable -> L54
            boolean r1 = r2.addIfAbsent(r1)     // Catch: java.lang.Throwable -> L54
            if (r1 == 0) goto L4e
            goto L4f
        L4c:
            wa.g r1 = wa.j.f14925a     // Catch: java.lang.Throwable -> L54
        L4e:
            r3 = r4
        L4f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L54
            goto L5b
        L54:
            r1 = move-exception
            sf.f r2 = new sf.f     // Catch: java.lang.Throwable -> L1e
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1e
            r1 = r2
        L5b:
            java.lang.Throwable r1 = sf.g.b(r1)     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L7e
            java.util.concurrent.atomic.AtomicBoolean r2 = h.Hchat.hooks.items.script.ScriptPluginRuntime.protobufListenerRegistered     // Catch: java.lang.Throwable -> L1e
            r2.set(r4)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = r1.getMessage()     // Catch: java.lang.Throwable -> L1e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r3.<init>()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = "[Hchat:Script] 注册数据包监听器失败: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1e
            r3.append(r2)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L1e
            fb.v0.n(r2, r1)     // Catch: java.lang.Throwable -> L1e
        L7e:
            monitor-exit(r0)
            return
        L80:
            java.util.concurrent.atomic.AtomicBoolean r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.protobufListenerRegistered     // Catch: java.lang.Throwable -> L1e
            boolean r1 = r1.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L8a
            monitor-exit(r0)
            return
        L8a:
            wa.i r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.protobufPacketListener     // Catch: java.lang.Throwable -> L9f
            if (r1 == 0) goto L98
            java.util.concurrent.CopyOnWriteArrayList r2 = wa.j.f14927c     // Catch: java.lang.Throwable -> L9f
            boolean r1 = r2.remove(r1)     // Catch: java.lang.Throwable -> L9f
            if (r1 == 0) goto L9a
            r4 = r3
            goto L9a
        L98:
            wa.g r1 = wa.j.f14925a     // Catch: java.lang.Throwable -> L9f
        L9a:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L9f
            goto La6
        L9f:
            r1 = move-exception
            sf.f r2 = new sf.f     // Catch: java.lang.Throwable -> L1e
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1e
            r1 = r2
        La6:
            java.lang.Throwable r1 = sf.g.b(r1)     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto Lc9
            java.util.concurrent.atomic.AtomicBoolean r2 = h.Hchat.hooks.items.script.ScriptPluginRuntime.protobufListenerRegistered     // Catch: java.lang.Throwable -> L1e
            r2.set(r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = r1.getMessage()     // Catch: java.lang.Throwable -> L1e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r3.<init>()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = "[Hchat:Script] 注销数据包监听器失败: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1e
            r3.append(r2)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L1e
            fb.v0.n(r2, r1)     // Catch: java.lang.Throwable -> L1e
        Lc9:
            monitor-exit(r0)
            return
        Lcb:
            monitor-exit(r0)
            throw r1
    }

    public static /* synthetic */ void v(android.content.Context r0, java.lang.String r1) {
            reloadPluginAsync$lambda$0(r0, r1)
            return
    }

    private final void validateNativeLibrary(java.io.File r7) {
            r6 = this;
            r0 = 20
            byte[] r1 = new byte[r0]
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r7)
            int r3 = r2.read(r1)     // Catch: java.lang.Throwable -> Lb2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lb2
            r2.close()
            int r2 = r3.intValue()
            if (r2 != r0) goto La4
            r0 = 0
            r2 = r1[r0]
            r3 = 127(0x7f, float:1.78E-43)
            if (r2 != r3) goto La4
            r2 = 1
            r3 = r1[r2]
            r4 = 69
            if (r3 != r4) goto La4
            r3 = 2
            r4 = r1[r3]
            r5 = 76
            if (r4 != r5) goto La4
            r4 = 3
            r4 = r1[r4]
            r5 = 70
            if (r4 != r5) goto La4
            boolean r4 = android.os.Process.is64Bit()
            if (r4 == 0) goto L3e
            r4 = r3
            goto L3f
        L3e:
            r4 = r2
        L3f:
            r5 = 4
            r5 = r1[r5]
            if (r5 != r4) goto L96
            r4 = 5
            r4 = r1[r4]
            if (r4 != r2) goto L4a
            r0 = r2
        L4a:
            if (r0 != 0) goto L5d
            if (r4 != r3) goto L4f
            goto L5d
        L4f:
            java.lang.String r7 = r7.getName()
            java.lang.String r0 = "SO字节序无效: "
            java.lang.String r7 = wb.en.g(r0, r7)
            j8.o.q(r7)
            return
        L5d:
            r2 = 19
            r3 = 18
            if (r0 == 0) goto L6f
            r0 = r1[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
        L6d:
            r0 = r0 | r1
            goto L7a
        L6f:
            r0 = r1[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            goto L6d
        L7a:
            boolean r1 = android.os.Process.is64Bit()
            if (r1 == 0) goto L83
            r1 = 183(0xb7, float:2.56E-43)
            goto L85
        L83:
            r1 = 40
        L85:
            if (r0 != r1) goto L88
            return
        L88:
            java.lang.String r7 = r7.getName()
            java.lang.String r0 = "SO架构与微信进程不匹配: "
            java.lang.String r7 = wb.en.g(r0, r7)
            j8.o.q(r7)
            return
        L96:
            java.lang.String r7 = r7.getName()
            java.lang.String r0 = "SO位数与微信进程不匹配: "
            java.lang.String r7 = wb.en.g(r0, r7)
            j8.o.q(r7)
            return
        La4:
            java.lang.String r7 = r7.getName()
            java.lang.String r0 = "不是有效的ELF文件: "
            java.lang.String r7 = wb.en.g(r0, r7)
            j8.o.q(r7)
            return
        Lb2:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> Lb4
        Lb4:
            r0 = move-exception
            ig.a.i(r2, r7)
            throw r0
    }

    public static /* synthetic */ java.lang.String w(java.io.File r0) {
            java.lang.String r0 = refreshPluginDirObservers$lambda$0(r0)
            return r0
    }

    private final <T> T withInterpreterLock(bsh.Interpreter r1, fg.a r2) {
            r0 = this;
            java.util.concurrent.locks.ReentrantLock r1 = r0.interpreterLock(r1)
            r1.lock()
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> Lf
            r1.unlock()
            return r2
        Lf:
            r2 = move-exception
            r1.unlock()
            throw r2
    }

    private final void writePluginLoadError(eb.c0 r7, java.lang.Throwable r8) {
            r6 = this;
            java.lang.String r0 = "] ERROR 插件加载失败\n"
            java.lang.String r1 = "["
            java.io.File r2 = r7.f2508c     // Catch: java.lang.Throwable -> L10
            boolean r3 = r2.isDirectory()     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L12
            r2.mkdirs()     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r8 = move-exception
            goto L60
        L12:
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L10
            java.lang.String r4 = "yyyy-MM-dd HH:mm:ss.SSS"
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L10
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L10
            java.util.Date r4 = new java.util.Date     // Catch: java.lang.Throwable -> L10
            r4.<init>()     // Catch: java.lang.Throwable -> L10
            java.lang.String r3 = r3.format(r4)     // Catch: java.lang.Throwable -> L10
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L10
            java.lang.String r5 = "log.txt"
            r4.<init>(r2, r5)     // Catch: java.lang.Throwable -> L10
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L10
            r2.append(r3)     // Catch: java.lang.Throwable -> L10
            r2.append(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L10
            r2.append(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = ": "
            r2.append(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L10
            if (r8 != 0) goto L4e
            java.lang.String r8 = ""
        L4e:
            r2.append(r8)     // Catch: java.lang.Throwable -> L10
            r8 = 10
            r2.append(r8)     // Catch: java.lang.Throwable -> L10
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L10
            dg.l.Z(r4, r8)     // Catch: java.lang.Throwable -> L10
            sf.n r8 = sf.n.f12433a     // Catch: java.lang.Throwable -> L10
            goto L66
        L60:
            sf.f r0 = new sf.f
            r0.<init>(r8)
            r8 = r0
        L66:
            java.lang.Throwable r8 = sf.g.b(r8)
            if (r8 == 0) goto L79
            java.lang.String r7 = r7.f2507b
            java.lang.String r0 = r8.getMessage()
            java.lang.String r1 = "[Hchat:Script] 写入插件加载错误日志失败: "
            java.lang.String r2 = " "
            eh.a.w(r1, r7, r2, r0, r8)
        L79:
            return
    }

    public static /* synthetic */ void x(android.content.Context r0, java.lang.String r1) {
            schedulePluginReload$lambda$0(r1, r0)
            return
    }

    public static /* synthetic */ boolean y(eb.a0 r0) {
            boolean r0 = dispatchOnImageDownload$lambda$2$0(r0)
            return r0
    }

    /* JADX INFO: renamed from: callOpenSettings-IoAF18A, reason: not valid java name */
    public final java.lang.Object m12callOpenSettingsIoAF18A(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, eb.a0> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedPlugins
            java.lang.Object r7 = r0.get(r7)
            eb.a0 r7 = (eb.a0) r7
            if (r7 == 0) goto L7a
            boolean r0 = r7.f2490e
            if (r0 != 0) goto L1e
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "插件没有设置入口"
            r7.<init>(r0)
            sf.f r0 = new sf.f
            r0.<init>(r7)
            return r0
        L1e:
            bsh.Interpreter r0 = r7.f2487b     // Catch: java.lang.Throwable -> L33
            java.util.concurrent.locks.ReentrantLock r0 = r6.interpreterLock(r0)     // Catch: java.lang.Throwable -> L33
            r0.lock()     // Catch: java.lang.Throwable -> L33
            bsh.Interpreter r1 = r7.f2487b     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "openSettings();"
            java.lang.Object r1 = r1.eval(r2)     // Catch: java.lang.Throwable -> L35
            r0.unlock()     // Catch: java.lang.Throwable -> L33
            goto L3f
        L33:
            r0 = move-exception
            goto L3a
        L35:
            r1 = move-exception
            r0.unlock()     // Catch: java.lang.Throwable -> L33
            throw r1     // Catch: java.lang.Throwable -> L33
        L3a:
            sf.f r1 = new sf.f
            r1.<init>(r0)
        L3f:
            boolean r0 = r1 instanceof sf.f
            if (r0 != 0) goto L45
            sf.n r1 = sf.n.f12433a
        L45:
            java.lang.Throwable r0 = sf.g.b(r1)
            if (r0 == 0) goto L79
            eb.c0 r2 = r7.f2486a
            java.lang.String r2 = r2.f2507b
            java.lang.String r3 = r0.getMessage()
            java.lang.String r4 = "[Hchat:Script] 插件设置入口失败: "
            java.lang.String r5 = " "
            eh.a.w(r4, r2, r5, r3, r0)
            h.Hchat.hooks.items.script.ScriptPluginBridge r2 = h.Hchat.hooks.items.script.ScriptPluginRuntime.bridge
            if (r2 == 0) goto L79
            eb.c0 r7 = r7.f2486a
            java.lang.String r3 = r7.f2507b
            java.io.File r7 = r7.f2508c
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "设置入口失败: "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.log(r3, r7, r0)
        L79:
            return r1
        L7a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "插件未开启"
            r7.<init>(r0)
            sf.f r0 = new sf.f
            r0.<init>(r7)
            return r0
    }

    /* JADX INFO: renamed from: callPluginFunction-0E7RQCE, reason: not valid java name */
    public final java.lang.Object m13callPluginFunction0E7RQCE(java.lang.String r9, java.lang.String r10, java.lang.Object... r11) {
            r8 = this;
            r9.getClass()
            r10.getClass()
            r11.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, eb.a0> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedPlugins
            java.lang.Object r0 = r0.get(r9)
            r1 = r0
            eb.a0 r1 = (eb.a0) r1
            if (r1 == 0) goto L10a
            java.lang.String r9 = "[A-Za-z_][A-Za-z0-9_]*"
            java.util.regex.Pattern r9 = java.util.regex.Pattern.compile(r9)
            r9.getClass()
            java.util.regex.Matcher r9 = r9.matcher(r10)
            boolean r9 = r9.matches()
            if (r9 != 0) goto L38
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "非法函数名: "
            java.lang.String r10 = r11.concat(r10)
            r9.<init>(r10)
            sf.f r10 = new sf.f
            r10.<init>(r9)
            return r10
        L38:
            bsh.Interpreter r9 = r1.f2487b     // Catch: java.lang.Throwable -> Lc4
            java.util.concurrent.locks.ReentrantLock r9 = r8.interpreterLock(r9)     // Catch: java.lang.Throwable -> Lc4
            r9.lock()     // Catch: java.lang.Throwable -> Lc4
            lg.d r0 = tf.l.A0(r11)     // Catch: java.lang.Throwable -> L7b
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7b
            int r3 = tf.n.e1(r0)     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L7b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L7b
        L52:
            r3 = r0
            lg.c r3 = (lg.c) r3     // Catch: java.lang.Throwable -> L7b
            boolean r3 = r3.f8047i     // Catch: java.lang.Throwable -> L7b
            if (r3 == 0) goto L7e
            r3 = r0
            lg.c r3 = (lg.c) r3     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r3 = r3.next()     // Catch: java.lang.Throwable -> L7b
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L7b
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L7b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r4.<init>()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r5 = "__hchat_call_arg_"
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b
            r4.append(r3)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L7b
            r2.add(r3)     // Catch: java.lang.Throwable -> L7b
            goto L52
        L7b:
            r0 = move-exception
            r11 = r0
            goto Lc7
        L7e:
            int r0 = r11.length     // Catch: java.lang.Throwable -> L7b
            r3 = 0
            r4 = r3
        L81:
            if (r3 >= r0) goto L96
            r5 = r11[r3]     // Catch: java.lang.Throwable -> L7b
            int r6 = r4 + 1
            bsh.Interpreter r7 = r1.f2487b     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L7b
            r7.set(r4, r5)     // Catch: java.lang.Throwable -> L7b
            int r3 = r3 + 1
            r4 = r6
            goto L81
        L96:
            bsh.Interpreter r11 = r1.f2487b     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = ","
            r6 = 0
            r7 = 62
            r4 = 0
            r5 = 0
            java.lang.String r0 = tf.m.A1(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L7b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r2.<init>()     // Catch: java.lang.Throwable -> L7b
            r2.append(r10)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "("
            r2.append(r3)     // Catch: java.lang.Throwable -> L7b
            r2.append(r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r0 = ");"
            r2.append(r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r11 = r11.eval(r0)     // Catch: java.lang.Throwable -> L7b
            r9.unlock()     // Catch: java.lang.Throwable -> Lc4
            goto Ld0
        Lc4:
            r0 = move-exception
            r9 = r0
            goto Lcb
        Lc7:
            r9.unlock()     // Catch: java.lang.Throwable -> Lc4
            throw r11     // Catch: java.lang.Throwable -> Lc4
        Lcb:
            sf.f r11 = new sf.f
            r11.<init>(r9)
        Ld0:
            java.lang.Throwable r9 = sf.g.b(r11)
            if (r9 == 0) goto L109
            eb.c0 r0 = r1.f2486a
            java.lang.String r0 = r0.f2507b
            java.lang.String r2 = r9.getMessage()
            java.lang.String r3 = "[Hchat:Script] 调用插件函数失败: "
            java.lang.String r4 = "#"
            java.lang.String r5 = " "
            java.lang.StringBuilder r0 = bc.e.p(r3, r0, r4, r10, r5)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            fb.v0.n(r0, r9)
            h.Hchat.hooks.items.script.ScriptPluginBridge r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.bridge
            if (r0 == 0) goto L109
            eb.c0 r1 = r1.f2486a
            java.lang.String r2 = r1.f2507b
            java.io.File r1 = r1.f2508c
            java.lang.String r9 = r9.getMessage()
            java.lang.String r3 = "调用插件函数失败: "
            java.lang.String r9 = bc.e.j(r3, r10, r5, r9)
            r0.log(r2, r1, r9)
        L109:
            return r11
        L10a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "插件未开启: "
            java.lang.String r9 = r11.concat(r9)
            r10.<init>(r9)
            sf.f r9 = new sf.f
            r9.<init>(r10)
            return r9
    }

    public final boolean canOpenSettings(eb.c0 r3) {
            r2 = this;
            r3.getClass()
            java.lang.String r0 = "main"
            boolean r0 = r2.supportsProcess(r3, r0)
            if (r0 != 0) goto Ld
            r3 = 0
            return r3
        Ld:
            java.lang.String r0 = r3.f2506a
            boolean r0 = r2.hasOpenSettings(r0)
            if (r0 == 0) goto L17
            r3 = 1
            return r3
        L17:
            java.io.File r3 = r3.f2509d     // Catch: java.lang.Throwable -> L2a
            java.nio.charset.Charset r0 = og.a.f9804a     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = dg.l.h0(r3, r0)     // Catch: java.lang.Throwable -> L2a
            eb.y r3 = r2.detectCallbacks(r3)     // Catch: java.lang.Throwable -> L2a
            boolean r3 = r3.f2687c     // Catch: java.lang.Throwable -> L2a
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L2a
            goto L31
        L2a:
            r3 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r3)
            r3 = r0
        L31:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r3 instanceof sf.f
            if (r1 == 0) goto L38
            r3 = r0
        L38:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
    }

    public final java.lang.String compileSnapshot(java.lang.String r4, java.io.File r5, bsh.Interpreter r6, java.lang.String r7) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r7.getClass()
            java.io.File r5 = r3.resolvePluginFile(r5, r7)
            boolean r7 = r5.isFile()
            if (r7 == 0) goto L4d
            java.io.File r7 = new java.io.File
            java.lang.String r0 = r5.getAbsolutePath()
            java.lang.String r1 = ".bshs"
            java.lang.String r0 = bc.e.i(r0, r1)
            r7.<init>(r0)
            java.util.concurrent.locks.ReentrantLock r0 = r3.interpreterLock(r6)
            r0.lock()
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L48
            h.Hchat.hooks.items.script.ScriptPluginRuntime r2 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE     // Catch: java.lang.Throwable -> L48
            javax.crypto.SecretKey r4 = r2.snapshotKey(r4)     // Catch: java.lang.Throwable -> L48
            r6.compileSnapshot(r5, r1, r4)     // Catch: java.lang.Throwable -> L48
            r0.unlock()
            java.lang.String r4 = r7.getAbsolutePath()
            r4.getClass()
            return r4
        L48:
            r4 = move-exception
            r0.unlock()
            throw r4
        L4d:
            java.lang.String r4 = r5.getAbsolutePath()
            java.lang.String r5 = "源脚本不存在: "
            java.lang.String r4 = wb.en.g(r5, r4)
            j8.o.q(r4)
            r4 = 0
            return r4
    }

    public final java.lang.String compileSnapshot(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, eb.a0> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedPlugins
            java.lang.Object r0 = r0.get(r3)
            eb.a0 r0 = (eb.a0) r0
            if (r0 == 0) goto L1b
            eb.c0 r1 = r0.f2486a
            java.io.File r1 = r1.f2508c
            bsh.Interpreter r0 = r0.f2487b
            java.lang.String r3 = r2.compileSnapshot(r3, r1, r0, r4)
            return r3
        L1b:
            java.lang.String r3 = "插件未开启"
            j8.o.A(r3)
            r3 = 0
            return r3
    }

    public final eb.d0 dispatchOnClickSendBtn(java.lang.String r23) {
            r22 = this;
            r1 = r22
            java.lang.String r2 = "slow:"
            tf.t r0 = tf.t.f13167g
            java.lang.String r3 = "ms"
            java.lang.String r4 = "发送按钮回调耗时: "
            java.lang.String r5 = " "
            r23.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, eb.a0> r6 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedPlugins
            boolean r7 = r6.isEmpty()
            r8 = 0
            if (r7 == 0) goto L1e
            eb.d0 r2 = new eb.d0
            r2.<init>(r0, r8)
            return r2
        L1e:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Collection r6 = r6.values()
            r6.getClass()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            dg.n r9 = new dg.n
            r10 = 6
            r9.<init>(r6, r10)
            e9.h r6 = new e9.h
            r10 = 17
            r6.<init>(r10)
            ng.i r10 = new ng.i
            r11 = 1
            r10.<init>(r9, r11, r6)
            a9.h r6 = new a9.h
            r9 = 11
            r6.<init>(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            ng.m.a0(r10, r9)
            tf.q.g1(r9, r6)
            java.util.Iterator r6 = r9.iterator()
            boolean r9 = r6.hasNext()
            if (r9 != 0) goto L5d
            r6 = r0
            goto L83
        L5d:
            java.lang.Object r9 = r6.next()
            boolean r10 = r6.hasNext()
            if (r10 != 0) goto L6c
            java.util.List r6 = a.a.x0(r9)
            goto L83
        L6c:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r10.add(r9)
        L74:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L82
            java.lang.Object r9 = r6.next()
            r10.add(r9)
            goto L74
        L82:
            r6 = r10
        L83:
            boolean r9 = r6.isEmpty()
            if (r9 == 0) goto L8f
            eb.d0 r2 = new eb.d0
            r2.<init>(r0, r8)
            return r2
        L8f:
            java.util.Iterator r6 = r6.iterator()
        L93:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L1db
            java.lang.Object r0 = r6.next()
            r0.getClass()
            r9 = r0
            eb.a0 r9 = (eb.a0) r9
            bsh.Interpreter r0 = r9.f2487b
            java.util.concurrent.locks.ReentrantLock r10 = r1.interpreterLock(r0)
            boolean r0 = r10.tryLock()
            if (r0 != 0) goto Lb3
            r1.logBusySendButtonPlugin(r9)
            goto L93
        Lb3:
            long r12 = android.os.SystemClock.elapsedRealtime()
            bsh.Interpreter r0 = r9.f2487b     // Catch: java.lang.Throwable -> L10f
            r16 = 50
            java.lang.String r14 = "__hchat_send_text"
            r15 = r23
            r0.set(r14, r15)     // Catch: java.lang.Throwable -> L109
            bsh.Interpreter r0 = r9.f2487b     // Catch: java.lang.Throwable -> L109
            java.lang.String r14 = "onClickSendBtn(__hchat_send_text);"
            java.lang.Object r0 = r0.eval(r14)     // Catch: java.lang.Throwable -> L109
            java.lang.Boolean r14 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L109
            boolean r0 = gg.l.a(r0, r14)     // Catch: java.lang.Throwable -> L109
            if (r0 == 0) goto Lde
            eb.c0 r0 = r9.f2486a     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r0 = r0.f2507b     // Catch: java.lang.Throwable -> Ldb
            r7.add(r0)     // Catch: java.lang.Throwable -> Ldb
            r8 = r11
            goto Lde
        Ldb:
            r0 = move-exception
            r8 = r11
            goto L114
        Lde:
            r10.unlock()
            long r18 = android.os.SystemClock.elapsedRealtime()
            long r12 = r18 - r12
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 < 0) goto L105
            eb.c0 r0 = r9.f2486a
            java.lang.String r0 = r0.f2506a
            java.lang.String r0 = r2.concat(r0)
            eb.c0 r9 = r9.f2486a
            java.lang.String r9 = r9.f2507b
            java.lang.StringBuilder r9 = eh.a.v(r4, r9, r5, r12)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            r1.logSendButtonDiagnostic(r0, r9)
        L105:
            r18 = r6
            goto L1af
        L109:
            r0 = move-exception
            goto L114
        L10b:
            r0 = move-exception
            r15 = r23
            goto L114
        L10f:
            r0 = move-exception
            r15 = r23
            r16 = 50
        L114:
            java.lang.String r14 = r0.getMessage()     // Catch: java.lang.Throwable -> L11f
            if (r14 != 0) goto L11c
            java.lang.String r14 = ""
        L11c:
            r18 = r6
            goto L124
        L11f:
            r0 = move-exception
            r21 = r10
            goto L1b4
        L124:
            java.lang.String r6 = "Command not found"
            boolean r6 = og.m.h0(r14, r6, r11)     // Catch: java.lang.Throwable -> L11f
            if (r6 != 0) goto L183
            java.lang.String r6 = "undefined"
            boolean r6 = og.m.h0(r14, r6, r11)     // Catch: java.lang.Throwable -> L11f
            if (r6 != 0) goto L183
            java.lang.String r6 = "not found"
            boolean r6 = og.m.h0(r14, r6, r11)     // Catch: java.lang.Throwable -> L11f
            if (r6 != 0) goto L183
            eb.c0 r6 = r9.f2486a     // Catch: java.lang.Throwable -> L11f
            java.lang.String r6 = r6.f2507b     // Catch: java.lang.Throwable -> L11f
            java.lang.String r14 = r0.getMessage()     // Catch: java.lang.Throwable -> L11f
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11f
            r11.<init>()     // Catch: java.lang.Throwable -> L11f
            r20 = r8
            java.lang.String r8 = "[Hchat:Script] 发送按钮回调失败: "
            r11.append(r8)     // Catch: java.lang.Throwable -> L11f
            r11.append(r6)     // Catch: java.lang.Throwable -> L11f
            r11.append(r5)     // Catch: java.lang.Throwable -> L11f
            r11.append(r14)     // Catch: java.lang.Throwable -> L11f
            java.lang.String r6 = r11.toString()     // Catch: java.lang.Throwable -> L11f
            fb.v0.n(r6, r0)     // Catch: java.lang.Throwable -> L11f
            h.Hchat.hooks.items.script.ScriptPluginBridge r6 = h.Hchat.hooks.items.script.ScriptPluginRuntime.bridge     // Catch: java.lang.Throwable -> L11f
            if (r6 == 0) goto L185
            eb.c0 r8 = r9.f2486a     // Catch: java.lang.Throwable -> L11f
            java.lang.String r11 = r8.f2507b     // Catch: java.lang.Throwable -> L11f
            java.io.File r8 = r8.f2508c     // Catch: java.lang.Throwable -> L11f
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11f
            r14.<init>()     // Catch: java.lang.Throwable -> L11f
            r21 = r10
            java.lang.String r10 = "发送按钮回调失败: "
            r14.append(r10)     // Catch: java.lang.Throwable -> L181
            r14.append(r0)     // Catch: java.lang.Throwable -> L181
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Throwable -> L181
            r6.log(r11, r8, r0)     // Catch: java.lang.Throwable -> L181
            goto L187
        L181:
            r0 = move-exception
            goto L1b4
        L183:
            r20 = r8
        L185:
            r21 = r10
        L187:
            r21.unlock()
            long r10 = android.os.SystemClock.elapsedRealtime()
            long r10 = r10 - r12
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r0 < 0) goto L1ad
            eb.c0 r0 = r9.f2486a
            java.lang.String r0 = r0.f2506a
            java.lang.String r0 = r2.concat(r0)
            eb.c0 r6 = r9.f2486a
            java.lang.String r6 = r6.f2507b
            java.lang.StringBuilder r6 = eh.a.v(r4, r6, r5, r10)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            r1.logSendButtonDiagnostic(r0, r6)
        L1ad:
            r8 = r20
        L1af:
            r6 = r18
            r11 = 1
            goto L93
        L1b4:
            r21.unlock()
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r6 = r6 - r12
            int r8 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r8 < 0) goto L1da
            eb.c0 r8 = r9.f2486a
            java.lang.String r8 = r8.f2506a
            java.lang.String r2 = r2.concat(r8)
            eb.c0 r8 = r9.f2486a
            java.lang.String r8 = r8.f2507b
            java.lang.StringBuilder r4 = eh.a.v(r4, r8, r5, r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r1.logSendButtonDiagnostic(r2, r3)
        L1da:
            throw r0
        L1db:
            eb.d0 r0 = new eb.d0
            r0.<init>(r7, r8)
            return r0
    }

    public final void dispatchOnHandleMsg(h.Hchat.hooks.items.script.ScriptMessageBean r8) {
            r7 = this;
            r8.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, eb.a0> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedPlugins
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Ld
            goto Ldd
        Ld:
            java.util.Collection r0 = r0.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            dg.n r1 = new dg.n
            r2 = 6
            r1.<init>(r0, r2)
            e9.h r0 = new e9.h
            r2 = 11
            r0.<init>(r2)
            ng.i r2 = new ng.i
            r3 = 1
            r2.<init>(r1, r3, r0)
            a9.h r0 = new a9.h
            r1 = 12
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            ng.m.a0(r2, r1)
            tf.q.g1(r1, r0)
            java.util.Iterator r0 = r1.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L48
            tf.t r0 = tf.t.f13167g
            goto L6e
        L48:
            java.lang.Object r1 = r0.next()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L57
            java.util.List r0 = a.a.x0(r1)
            goto L6e
        L57:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r1)
        L5f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r0.next()
            r2.add(r1)
            goto L5f
        L6d:
            r0 = r2
        L6e:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L75
            goto Ldd
        L75:
            java.util.Iterator r0 = r0.iterator()
        L79:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ldd
            java.lang.Object r1 = r0.next()
            r1.getClass()
            eb.a0 r1 = (eb.a0) r1
            bsh.Interpreter r2 = r1.f2487b     // Catch: java.lang.Throwable -> La3
            java.util.concurrent.locks.ReentrantLock r2 = r7.interpreterLock(r2)     // Catch: java.lang.Throwable -> La3
            r2.lock()     // Catch: java.lang.Throwable -> La3
            bsh.Interpreter r3 = r1.f2487b     // Catch: java.lang.Throwable -> La5
            java.lang.String r4 = "__hchat_msg_info"
            r3.set(r4, r8)     // Catch: java.lang.Throwable -> La5
            bsh.Interpreter r3 = r1.f2487b     // Catch: java.lang.Throwable -> La5
            java.lang.String r4 = "onHandleMsg(__hchat_msg_info);"
            r3.eval(r4)     // Catch: java.lang.Throwable -> La5
            r2.unlock()     // Catch: java.lang.Throwable -> La3
            goto L79
        La3:
            r2 = move-exception
            goto Laa
        La5:
            r3 = move-exception
            r2.unlock()     // Catch: java.lang.Throwable -> La3
            throw r3     // Catch: java.lang.Throwable -> La3
        Laa:
            java.lang.String r3 = "onHandleMsg"
            boolean r3 = r7.isMissingCallbackError(r2, r3)
            if (r3 != 0) goto L79
            eb.c0 r3 = r1.f2486a
            java.lang.String r3 = r3.f2507b
            java.lang.String r4 = r2.getMessage()
            java.lang.String r5 = "[Hchat:Script] 消息监听回调失败: "
            java.lang.String r6 = " "
            eh.a.w(r5, r3, r6, r4, r2)
            h.Hchat.hooks.items.script.ScriptPluginBridge r3 = h.Hchat.hooks.items.script.ScriptPluginRuntime.bridge
            if (r3 == 0) goto L79
            eb.c0 r1 = r1.f2486a
            java.lang.String r4 = r1.f2507b
            java.io.File r1 = r1.f2508c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "消息监听回调失败: "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r3.log(r4, r1, r2)
            goto L79
        Ldd:
            return
    }

    public final void dispatchOnImageDownload(h.Hchat.hooks.items.script.ScriptMessageBean r6) {
            r5 = this;
            r6.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, eb.a0> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedPlugins
            java.util.Collection r0 = r0.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L1c
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1c
            goto L5f
        L1c:
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5f
            java.lang.Object r1 = r0.next()
            eb.a0 r1 = (eb.a0) r1
            boolean r1 = r1.f2494i
            if (r1 == 0) goto L20
            boolean r0 = r6.isImage()
            if (r0 != 0) goto L37
            goto L5f
        L37:
            java.lang.Object r0 = r6.getImageMsg()     // Catch: java.lang.Throwable -> L3c
            goto L43
        L3c:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L43:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L49
            r0 = 0
        L49:
            if (r0 == 0) goto L5f
            h.Hchat.hooks.items.script.ScriptPluginBridge r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.bridge
            if (r1 == 0) goto L5f
            java.util.concurrent.ThreadPoolExecutor r2 = h.Hchat.hooks.items.script.ScriptPluginRuntime.imageDownloadCallbackExecutor     // Catch: java.util.concurrent.RejectedExecutionException -> L5c
            ac.l r3 = new ac.l     // Catch: java.util.concurrent.RejectedExecutionException -> L5c
            r4 = 13
            r3.<init>(r1, r6, r0, r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L5c
            r2.execute(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L5c
            goto L5f
        L5c:
            r5.logDroppedImageDownload()
        L5f:
            return
    }

    public final void dispatchOnMemberChange(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r8 = this;
            r9.getClass()
            r10.getClass()
            r11.getClass()
            r12.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, eb.a0> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedPlugins
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L16
            goto L119
        L16:
            java.util.Collection r0 = r0.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            dg.n r1 = new dg.n
            r2 = 6
            r1.<init>(r0, r2)
            e9.h r0 = new e9.h
            r2 = 16
            r0.<init>(r2)
            ng.i r2 = new ng.i
            r3 = 1
            r2.<init>(r1, r3, r0)
            a9.h r0 = new a9.h
            r1 = 14
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            ng.m.a0(r2, r1)
            tf.q.g1(r1, r0)
            java.util.Iterator r0 = r1.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L51
            tf.t r0 = tf.t.f13167g
            goto L77
        L51:
            java.lang.Object r1 = r0.next()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L60
            java.util.List r0 = a.a.x0(r1)
            goto L77
        L60:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r1)
        L68:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r0.next()
            r2.add(r1)
            goto L68
        L76:
            r0 = r2
        L77:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L7f
            goto L119
        L7f:
            java.util.Iterator r0 = r0.iterator()
        L83:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L119
            java.lang.Object r1 = r0.next()
            r1.getClass()
            eb.a0 r1 = (eb.a0) r1
            bsh.Interpreter r2 = r1.f2487b     // Catch: java.lang.Throwable -> Lc2
            java.util.concurrent.locks.ReentrantLock r2 = r8.interpreterLock(r2)     // Catch: java.lang.Throwable -> Lc2
            r2.lock()     // Catch: java.lang.Throwable -> Lc2
            bsh.Interpreter r4 = r1.f2487b     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r5 = "__hchat_member_change_type"
            r4.set(r5, r9)     // Catch: java.lang.Throwable -> Lc4
            bsh.Interpreter r4 = r1.f2487b     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r5 = "__hchat_member_change_group"
            r4.set(r5, r10)     // Catch: java.lang.Throwable -> Lc4
            bsh.Interpreter r4 = r1.f2487b     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r5 = "__hchat_member_change_user"
            r4.set(r5, r11)     // Catch: java.lang.Throwable -> Lc4
            bsh.Interpreter r4 = r1.f2487b     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r5 = "__hchat_member_change_name"
            r4.set(r5, r12)     // Catch: java.lang.Throwable -> Lc4
            bsh.Interpreter r4 = r1.f2487b     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r5 = "onMemberChange(__hchat_member_change_type, __hchat_member_change_group, __hchat_member_change_user, __hchat_member_change_name);"
            r4.eval(r5)     // Catch: java.lang.Throwable -> Lc4
            r2.unlock()     // Catch: java.lang.Throwable -> Lc2
            goto L83
        Lc2:
            r2 = move-exception
            goto Lc9
        Lc4:
            r4 = move-exception
            r2.unlock()     // Catch: java.lang.Throwable -> Lc2
            throw r4     // Catch: java.lang.Throwable -> Lc2
        Lc9:
            java.lang.String r4 = r2.getMessage()
            if (r4 != 0) goto Ld1
            java.lang.String r4 = ""
        Ld1:
            java.lang.String r5 = "Command not found"
            boolean r5 = og.m.h0(r4, r5, r3)
            if (r5 != 0) goto L83
            java.lang.String r5 = "undefined"
            boolean r5 = og.m.h0(r4, r5, r3)
            if (r5 != 0) goto L83
            java.lang.String r5 = "not found"
            boolean r4 = og.m.h0(r4, r5, r3)
            if (r4 != 0) goto L83
            eb.c0 r4 = r1.f2486a
            java.lang.String r4 = r4.f2507b
            java.lang.String r5 = r2.getMessage()
            java.lang.String r6 = "[Hchat:Script] 成员变动回调失败: "
            java.lang.String r7 = " "
            eh.a.w(r6, r4, r7, r5, r2)
            h.Hchat.hooks.items.script.ScriptPluginBridge r4 = h.Hchat.hooks.items.script.ScriptPluginRuntime.bridge
            if (r4 == 0) goto L83
            eb.c0 r1 = r1.f2486a
            java.lang.String r5 = r1.f2507b
            java.io.File r1 = r1.f2508c
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "成员变动回调失败: "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r4.log(r5, r1, r2)
            goto L83
        L119:
            return
    }

    public final void dispatchOnNewFriend(java.lang.String r9, java.lang.String r10, int r11) {
            r8 = this;
            r9.getClass()
            r10.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, eb.a0> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedPlugins
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L10
            goto L12c
        L10:
            java.lang.CharSequence r9 = og.m.R0(r9)
            java.lang.String r9 = r9.toString()
            java.lang.CharSequence r10 = og.m.R0(r10)
            java.lang.String r10 = r10.toString()
            int r1 = r9.length()
            if (r1 != 0) goto L28
            goto L12c
        L28:
            int r1 = r10.length()
            if (r1 != 0) goto L30
            goto L12c
        L30:
            java.util.Collection r0 = r0.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            dg.n r1 = new dg.n
            r2 = 6
            r1.<init>(r0, r2)
            e9.h r0 = new e9.h
            r2 = 12
            r0.<init>(r2)
            ng.i r2 = new ng.i
            r3 = 1
            r2.<init>(r1, r3, r0)
            a9.h r0 = new a9.h
            r1 = 15
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            ng.m.a0(r2, r1)
            tf.q.g1(r1, r0)
            java.util.Iterator r0 = r1.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L6b
            tf.t r0 = tf.t.f13167g
            goto L91
        L6b:
            java.lang.Object r1 = r0.next()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L7a
            java.util.List r0 = a.a.x0(r1)
            goto L91
        L7a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r1)
        L82:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L90
            java.lang.Object r1 = r0.next()
            r2.add(r1)
            goto L82
        L90:
            r0 = r2
        L91:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L99
            goto L12c
        L99:
            java.util.Iterator r0 = r0.iterator()
        L9d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L12c
            java.lang.Object r1 = r0.next()
            r1.getClass()
            eb.a0 r1 = (eb.a0) r1
            bsh.Interpreter r2 = r1.f2487b     // Catch: java.lang.Throwable -> Ld5
            java.util.concurrent.locks.ReentrantLock r2 = r8.interpreterLock(r2)     // Catch: java.lang.Throwable -> Ld5
            r2.lock()     // Catch: java.lang.Throwable -> Ld5
            bsh.Interpreter r4 = r1.f2487b     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r5 = "__hchat_new_friend_wxid"
            r4.set(r5, r9)     // Catch: java.lang.Throwable -> Ld7
            bsh.Interpreter r4 = r1.f2487b     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r5 = "__hchat_new_friend_ticket"
            r4.set(r5, r10)     // Catch: java.lang.Throwable -> Ld7
            bsh.Interpreter r4 = r1.f2487b     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r5 = "__hchat_new_friend_scene"
            r4.set(r5, r11)     // Catch: java.lang.Throwable -> Ld7
            bsh.Interpreter r4 = r1.f2487b     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r5 = "onNewFriend(__hchat_new_friend_wxid, __hchat_new_friend_ticket, __hchat_new_friend_scene);"
            r4.eval(r5)     // Catch: java.lang.Throwable -> Ld7
            r2.unlock()     // Catch: java.lang.Throwable -> Ld5
            goto L9d
        Ld5:
            r2 = move-exception
            goto Ldc
        Ld7:
            r4 = move-exception
            r2.unlock()     // Catch: java.lang.Throwable -> Ld5
            throw r4     // Catch: java.lang.Throwable -> Ld5
        Ldc:
            java.lang.String r4 = r2.getMessage()
            if (r4 != 0) goto Le4
            java.lang.String r4 = ""
        Le4:
            java.lang.String r5 = "Command not found"
            boolean r5 = og.m.h0(r4, r5, r3)
            if (r5 != 0) goto L9d
            java.lang.String r5 = "undefined"
            boolean r5 = og.m.h0(r4, r5, r3)
            if (r5 != 0) goto L9d
            java.lang.String r5 = "not found"
            boolean r4 = og.m.h0(r4, r5, r3)
            if (r4 != 0) goto L9d
            eb.c0 r4 = r1.f2486a
            java.lang.String r4 = r4.f2507b
            java.lang.String r5 = r2.getMessage()
            java.lang.String r6 = "[Hchat:Script] 好友申请回调失败: "
            java.lang.String r7 = " "
            eh.a.w(r6, r4, r7, r5, r2)
            h.Hchat.hooks.items.script.ScriptPluginBridge r4 = h.Hchat.hooks.items.script.ScriptPluginRuntime.bridge
            if (r4 == 0) goto L9d
            eb.c0 r1 = r1.f2486a
            java.lang.String r5 = r1.f2507b
            java.io.File r1 = r1.f2508c
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "好友申请回调失败: "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r4.log(r5, r1, r2)
            goto L9d
        L12c:
            return
    }

    public final void dispatchOnProtobufPacket(h.Hchat.hooks.items.protobuf.ProtobufPacketRuntime$Packet r4) {
            r3 = this;
            r4.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, eb.a0> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedPlugins
            java.util.Collection r0 = r0.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L1c
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1c
            goto L40
        L1c:
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r0.next()
            eb.a0 r1 = (eb.a0) r1
            boolean r1 = r1.f2493h
            if (r1 == 0) goto L20
            java.util.concurrent.ThreadPoolExecutor r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.protobufCallbackExecutor     // Catch: java.util.concurrent.RejectedExecutionException -> L3d
            a1.a r1 = new a1.a     // Catch: java.util.concurrent.RejectedExecutionException -> L3d
            r2 = 8
            r1.<init>(r4, r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L3d
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L3d
            return
        L3d:
            r3.logDroppedProtobufPacket()
        L40:
            return
    }

    public final java.io.File ensureDirs(android.content.Context r2) {
            r1 = this;
            r2.getClass()
            java.io.File r2 = r1.scriptDir(r2)
            boolean r0 = r2.isDirectory()
            if (r0 != 0) goto L10
            r2.mkdirs()
        L10:
            return r2
    }

    public final java.lang.Object evalCode(java.lang.String r3, bsh.Interpreter r4, java.lang.String r5) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            r5.getClass()
            java.util.concurrent.locks.ReentrantLock r0 = r2.interpreterLock(r4)
            r0.lock()
            java.lang.Object r5 = r4.eval(r5)     // Catch: java.lang.Throwable -> L1d
            h.Hchat.hooks.items.script.ScriptPluginRuntime r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE     // Catch: java.lang.Throwable -> L1d
            r1.refreshCallbacks(r3, r4)     // Catch: java.lang.Throwable -> L1d
            r0.unlock()
            return r5
        L1d:
            r3 = move-exception
            r0.unlock()
            throw r3
    }

    public final java.lang.Object evalSnapshot(java.lang.String r3, bsh.Interpreter r4, java.io.InputStream r5) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            r5.getClass()
            java.util.concurrent.locks.ReentrantLock r0 = r2.interpreterLock(r4)
            r0.lock()
            h.Hchat.hooks.items.script.ScriptPluginRuntime r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE     // Catch: java.lang.Throwable -> L21
            javax.crypto.SecretKey r1 = r1.snapshotKey(r3)     // Catch: java.lang.Throwable -> L21
            java.lang.Object r5 = r4.evalSnapshot(r5, r1)     // Catch: java.lang.Throwable -> L21
            r0.unlock()
            r2.refreshCallbacks(r3, r4)
            return r5
        L21:
            r3 = move-exception
            r0.unlock()
            throw r3
    }

    public final java.lang.Object evalSnapshot(java.lang.String r2, bsh.Interpreter r3, byte[] r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            r4.getClass()
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r4)
            java.lang.Object r2 = r1.evalSnapshot(r2, r3, r0)
            return r2
    }

    public final java.lang.Object evalSnapshot(java.lang.String r2, java.io.File r3, bsh.Interpreter r4, java.lang.String r5) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            java.io.File r3 = r1.resolvePluginFile(r3, r5)
            boolean r5 = r3.isFile()
            if (r5 == 0) goto L37
            java.util.concurrent.locks.ReentrantLock r5 = r1.interpreterLock(r4)
            r5.lock()
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L32
            h.Hchat.hooks.items.script.ScriptPluginRuntime r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE     // Catch: java.lang.Throwable -> L32
            javax.crypto.SecretKey r0 = r0.snapshotKey(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r3 = r4.evalSnapshot(r3, r0)     // Catch: java.lang.Throwable -> L32
            r5.unlock()
            r1.refreshCallbacks(r2, r4)
            return r3
        L32:
            r2 = move-exception
            r5.unlock()
            throw r2
        L37:
            java.lang.String r2 = r3.getAbsolutePath()
            java.lang.String r3 = "快照文件不存在: "
            java.lang.String r2 = wb.en.g(r3, r2)
            j8.o.q(r2)
            r2 = 0
            return r2
    }

    public final java.lang.Object evalSnapshot(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, eb.a0> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedPlugins
            java.lang.Object r0 = r0.get(r3)
            eb.a0 r0 = (eb.a0) r0
            if (r0 == 0) goto L1b
            eb.c0 r1 = r0.f2486a
            java.io.File r1 = r1.f2508c
            bsh.Interpreter r0 = r0.f2487b
            java.lang.Object r3 = r2.evalSnapshot(r3, r1, r0, r4)
            return r3
        L1b:
            java.lang.String r3 = "插件未开启"
            j8.o.A(r3)
            r3 = 0
            return r3
    }

    public final boolean hasImageDownloadCallback() {
            r3 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, eb.a0> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedPlugins
            java.util.Collection r0 = r0.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L1a
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1a
            return r2
        L1a:
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r0.next()
            eb.a0 r1 = (eb.a0) r1
            boolean r1 = r1.f2494i
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L1e
            r0 = 1
            return r0
        L38:
            return r2
    }

    public final boolean hasOpenSettings(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, eb.a0> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedPlugins
            java.lang.Object r3 = r0.get(r3)
            eb.a0 r3 = (eb.a0) r3
            r0 = 0
            if (r3 == 0) goto L14
            boolean r3 = r3.f2490e
            r1 = 1
            if (r3 != r1) goto L14
            return r1
        L14:
            return r0
    }

    public final void install(r8.g r8) {
            r7 = this;
            r8.getClass()
            android.content.Context r0 = r8.f11620a
            android.content.Context r0 = r0.getApplicationContext()
            if (r0 == 0) goto Lc
            goto Le
        Lc:
            android.content.Context r0 = r8.f11620a
        Le:
            h.Hchat.hooks.items.script.ScriptPluginRuntime.appContext = r0
            java.lang.String r1 = "main"
            h.Hchat.hooks.items.script.ScriptPluginRuntime.runtimeProcess = r1
            java.lang.String r1 = r0.getPackageName()
            r1.getClass()
            h.Hchat.hooks.items.script.ScriptPluginRuntime.runtimeProcessName = r1
            eb.q r1 = h.Hchat.hooks.items.script.ScriptPluginBridge.Companion
            r1.getClass()
            h.Hchat.hooks.items.script.ScriptPluginBridge r1 = new h.Hchat.hooks.items.script.ScriptPluginBridge
            android.content.Context r2 = r8.f11620a
            java.lang.ClassLoader r3 = r8.f11622c
            h.Hchat.hooks.items.script.ScriptPluginRuntime r4 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            java.io.File r4 = r4.scriptDir(r2)
            h.Hchat.hooks.items.script.ScriptDexKitBridge r5 = new h.Hchat.hooks.items.script.ScriptDexKitBridge
            org.luckypray.dexkit.DexKitBridge r6 = r8.f11623d
            h.Hchat.dexkit.DexBridgeHolder r8 = r8.f11627h
            r5.<init>(r6, r8, r3)
            r1.<init>(r2, r3, r4, r5)
            h.Hchat.hooks.items.script.ScriptPluginRuntime.bridge = r1
            r7.ensureDirs(r0)
            r7.startPluginObservers(r0)
            return
    }

    public final boolean isPluginEnabled(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            java.lang.String r0 = "Hchat_script_plugin_config"
            android.content.SharedPreferences r2 = ub.b.c(r2, r0)
            java.lang.String r0 = "script_plugin_item_"
            java.lang.String r3 = r0.concat(r3)
            r0 = 0
            boolean r2 = r2.getBoolean(r3, r0)
            return r2
    }

    public final java.util.List<eb.c0> listPlugins(android.content.Context r12) {
            r11 = this;
            r12.getClass()
            java.io.File r12 = r11.scriptDir(r12)
            boolean r0 = r12.isDirectory()
            tf.t r1 = tf.t.f13167g
            if (r0 != 0) goto L11
            goto L82
        L11:
            java.io.File[] r12 = r12.listFiles()
            if (r12 == 0) goto L82
            ng.j r12 = tf.l.k0(r12)
            c0.f r2 = new c0.f
            java.lang.Class<h.Hchat.hooks.items.script.ScriptPluginRuntime> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.class
            java.lang.Class r5 = eh.a.i(r0)
            r9 = 0
            r10 = 12
            r3 = 1
            java.lang.String r6 = "isPluginDirectory"
            java.lang.String r7 = "isPluginDirectory(Ljava/io/File;)Z"
            r8 = 0
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            ng.i r0 = new ng.i
            r0.<init>(r12, r3, r2)
            e9.h r12 = new e9.h
            r2 = 13
            r12.<init>(r2)
            ng.i r12 = ng.m.X(r0, r12)
            a9.h r0 = new a9.h
            r2 = 17
            r0.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            ng.m.a0(r12, r2)
            tf.q.g1(r2, r0)
            java.util.Iterator r12 = r2.iterator()
            boolean r0 = r12.hasNext()
            if (r0 != 0) goto L5d
            goto L82
        L5d:
            java.lang.Object r0 = r12.next()
            boolean r1 = r12.hasNext()
            if (r1 != 0) goto L6c
            java.util.List r1 = a.a.x0(r0)
            goto L82
        L6c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
        L74:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r0 = r12.next()
            r1.add(r0)
            goto L74
        L82:
            return r1
    }

    public final java.lang.ClassLoader loadDex(java.lang.String r7, java.io.File r8, bsh.Interpreter r9, java.lang.ClassLoader r10, java.lang.String r11) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r9.getClass()
            r10.getClass()
            r11.getClass()
            java.io.File r8 = r6.resolvePluginFile(r8, r11)
            boolean r11 = r8.isFile()
            if (r11 == 0) goto Lb5
            android.content.Context r11 = h.Hchat.hooks.items.script.ScriptPluginRuntime.appContext
            if (r11 == 0) goto Lae
            java.lang.String r0 = "hchat_plugin_dex"
            java.io.File r11 = r6.processScopedCacheRoot(r11, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r7 = r6.safeFileName(r7)
            r0.<init>(r11, r7)
            r0.mkdirs()
            java.io.File r7 = new java.io.File
            java.lang.String r11 = "opt"
            r7.<init>(r0, r11)
            r7.mkdirs()
            java.lang.String r11 = r6.sha256(r8)
            r1 = 16
            java.lang.String r11 = og.m.P0(r1, r11)
            java.lang.String r1 = dg.l.e0(r8)
            java.lang.String r2 = dg.l.c0(r8)
            boolean r3 = og.m.t0(r2)
            if (r3 == 0) goto L53
            java.lang.String r2 = "dex"
        L53:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "_"
            r3.append(r1)
            r3.append(r11)
            java.lang.String r11 = "."
            r3.append(r11)
            r3.append(r2)
            java.lang.String r11 = r3.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r11)
            boolean r11 = r1.isFile()
            if (r11 == 0) goto L86
            long r2 = r1.length()
            long r4 = r8.length()
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 == 0) goto L89
        L86:
            dg.l.a0(r8, r1)
        L89:
            r8 = 0
            r1.setWritable(r8, r8)
            dalvik.system.DexClassLoader r8 = new dalvik.system.DexClassLoader
            java.lang.String r11 = r1.getAbsolutePath()
            java.lang.String r7 = r7.getAbsolutePath()
            r0 = 0
            r8.<init>(r11, r7, r0, r10)
            java.util.concurrent.locks.ReentrantLock r7 = r6.interpreterLock(r9)
            r7.lock()
            r9.addClassLoader(r8)     // Catch: java.lang.Throwable -> La9
            r7.unlock()
            return r8
        La9:
            r8 = move-exception
            r7.unlock()
            throw r8
        Lae:
            java.lang.String r7 = "宿主Context不可用"
            j8.o.A(r7)
        Lb3:
            r7 = 0
            return r7
        Lb5:
            java.lang.String r7 = r8.getAbsolutePath()
            java.lang.String r8 = "Dex文件不存在: "
            java.lang.String r7 = wb.en.g(r8, r7)
            j8.o.q(r7)
            goto Lb3
    }

    public final void loadEnabledPluginsWhenReady(android.content.Context r5) {
            r4 = this;
            r5.getClass()
            android.content.Context r0 = r5.getApplicationContext()
            if (r0 == 0) goto La
            r5 = r0
        La:
            java.lang.String r0 = "Hchat_script_plugin_config"
            android.content.SharedPreferences r0 = ub.b.c(r5, r0)
            java.lang.String r1 = "script_plugin_enable"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto L1a
            goto L23
        L1a:
            java.util.concurrent.atomic.AtomicBoolean r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.initialLoadStarted
            r1 = 1
            boolean r0 = r0.compareAndSet(r2, r1)
            if (r0 != 0) goto L24
        L23:
            return
        L24:
            java.lang.Thread r0 = new java.lang.Thread
            c9.p1 r2 = new c9.p1
            r3 = 1
            r2.<init>(r5, r3)
            java.lang.String r5 = "Hchat-Script-InitialLoad"
            r0.<init>(r2, r5)
            r0.setDaemon(r1)
            r0.start()
            return
    }

    public final void loadJava(java.lang.String r1, java.io.File r2, bsh.Interpreter r3, java.lang.String r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            java.io.File r2 = r0.resolvePluginFile(r2, r4)
            java.util.concurrent.locks.ReentrantLock r4 = r0.interpreterLock(r3)
            r4.lock()
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L27
            r3.source(r2)     // Catch: java.lang.Throwable -> L27
            h.Hchat.hooks.items.script.ScriptPluginRuntime r2 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE     // Catch: java.lang.Throwable -> L27
            r2.refreshCallbacks(r1, r3)     // Catch: java.lang.Throwable -> L27
            r4.unlock()
            return
        L27:
            r1 = move-exception
            r4.unlock()
            throw r1
    }

    public final void loadSo(java.lang.String r9, java.io.File r10, java.lang.ClassLoader r11, java.lang.String r12) {
            r8 = this;
            r9.getClass()
            r10.getClass()
            r11.getClass()
            r12.getClass()
            java.io.File r10 = r8.resolvePluginFile(r10, r12)
            java.io.File r10 = r10.getCanonicalFile()
            boolean r12 = r10.isFile()
            if (r12 == 0) goto L163
            java.lang.String r12 = dg.l.c0(r10)
            java.lang.String r0 = "so"
            boolean r12 = r12.equalsIgnoreCase(r0)
            if (r12 == 0) goto L155
            r8.validateNativeLibrary(r10)
            android.content.Context r12 = h.Hchat.hooks.items.script.ScriptPluginRuntime.appContext
            if (r12 == 0) goto L14f
            java.lang.String r0 = r8.sha256(r10)
            java.lang.String r1 = "hchat_plugin_native"
            java.io.File r12 = r8.processScopedCacheRoot(r12, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r9 = r8.safeFileName(r9)
            r1.<init>(r12, r9)
            boolean r9 = r1.isDirectory()
            if (r9 != 0) goto L5b
            boolean r9 = r1.mkdirs()
            if (r9 == 0) goto L4d
            goto L5b
        L4d:
            java.lang.String r9 = r1.getAbsolutePath()
            java.lang.String r10 = "无法创建Native缓存目录: "
            java.lang.String r9 = wb.en.g(r10, r9)
            j8.o.q(r9)
            return
        L5b:
            java.lang.Object r9 = h.Hchat.hooks.items.script.ScriptPluginRuntime.nativeLoadLock
            monitor-enter(r9)
            java.lang.String r12 = r10.getAbsolutePath()     // Catch: java.lang.Throwable -> L83
            java.util.ArrayList<eb.z> r2 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedNativeLibraries     // Catch: java.lang.Throwable -> L83
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L83
        L68:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L83
            if (r3 == 0) goto L8a
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L83
            r4 = r3
            eb.z r4 = (eb.z) r4     // Catch: java.lang.Throwable -> L83
            java.lang.String r5 = r4.f2697a     // Catch: java.lang.Throwable -> L83
            boolean r5 = r5.equals(r12)     // Catch: java.lang.Throwable -> L83
            if (r5 == 0) goto L86
            java.lang.ClassLoader r4 = r4.f2699c     // Catch: java.lang.Throwable -> L83
            if (r4 != r11) goto L86
            r4 = 1
            goto L87
        L83:
            r10 = move-exception
            goto L14d
        L86:
            r4 = 0
        L87:
            if (r4 == 0) goto L68
            goto L8b
        L8a:
            r3 = 0
        L8b:
            eb.z r3 = (eb.z) r3     // Catch: java.lang.Throwable -> L83
            if (r3 == 0) goto Lb8
            java.lang.String r11 = r3.f2698b     // Catch: java.lang.Throwable -> L83
            boolean r11 = gg.l.a(r11, r0)     // Catch: java.lang.Throwable -> L83
            if (r11 == 0) goto L99
            monitor-exit(r9)
            return
        L99:
            java.lang.String r10 = r10.getAbsolutePath()     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r11.<init>()     // Catch: java.lang.Throwable -> L83
            java.lang.String r12 = "SO内容已更新，但JNI ClassLoader未变化；请重新加载插件并传入新JNI类的ClassLoader，宿主ClassLoader无法热更新: "
            r11.append(r12)     // Catch: java.lang.Throwable -> L83
            r11.append(r10)     // Catch: java.lang.Throwable -> L83
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> L83
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L83
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L83
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L83
            throw r11     // Catch: java.lang.Throwable -> L83
        Lb8:
            java.util.concurrent.atomic.AtomicLong r2 = h.Hchat.hooks.items.script.ScriptPluginRuntime.nativeLoadSequence     // Catch: java.lang.Throwable -> L83
            long r2 = r2.incrementAndGet()     // Catch: java.lang.Throwable -> L83
            r4 = 36
            a.a.w(r4)     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = java.lang.Long.toString(r2, r4)     // Catch: java.lang.Throwable -> L83
            r2.getClass()     // Catch: java.lang.Throwable -> L83
            int r3 = java.lang.System.identityHashCode(r11)     // Catch: java.lang.Throwable -> L83
            java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch: java.lang.Throwable -> L83
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L83
            h.Hchat.hooks.items.script.ScriptPluginRuntime r5 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = dg.l.e0(r10)     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = r5.safeFileName(r6)     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r7.<init>()     // Catch: java.lang.Throwable -> L83
            r7.append(r6)     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = "_"
            r7.append(r6)     // Catch: java.lang.Throwable -> L83
            r7.append(r0)     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = "_"
            r7.append(r6)     // Catch: java.lang.Throwable -> L83
            r7.append(r3)     // Catch: java.lang.Throwable -> L83
            java.lang.String r3 = "_"
            r7.append(r3)     // Catch: java.lang.Throwable -> L83
            r7.append(r2)     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = ".so"
            r7.append(r2)     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> L83
            r4.<init>(r1, r2)     // Catch: java.lang.Throwable -> L83
            r5.copyNativeLibrary(r10, r4, r0)     // Catch: java.lang.Throwable -> L83
            java.lang.String r10 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L83
            r1 = 292(0x124, float:4.09E-43)
            android.system.Os.chmod(r10, r1)     // Catch: java.lang.Throwable -> L83
            boolean r10 = r4.canWrite()     // Catch: java.lang.Throwable -> L83
            if (r10 != 0) goto L12e
            r5.loadNativeLibrary(r4, r11)     // Catch: java.lang.Throwable -> L83
            java.util.ArrayList<eb.z> r10 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedNativeLibraries     // Catch: java.lang.Throwable -> L83
            eb.z r1 = new eb.z     // Catch: java.lang.Throwable -> L83
            r12.getClass()     // Catch: java.lang.Throwable -> L83
            r1.<init>(r12, r11, r0)     // Catch: java.lang.Throwable -> L83
            r10.add(r1)     // Catch: java.lang.Throwable -> L83
            monitor-exit(r9)
            return
        L12e:
            java.lang.String r10 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r11.<init>()     // Catch: java.lang.Throwable -> L83
            java.lang.String r12 = "Native缓存无法设为只读: "
            r11.append(r12)     // Catch: java.lang.Throwable -> L83
            r11.append(r10)     // Catch: java.lang.Throwable -> L83
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> L83
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L83
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L83
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L83
            throw r11     // Catch: java.lang.Throwable -> L83
        L14d:
            monitor-exit(r9)
            throw r10
        L14f:
            java.lang.String r9 = "宿主Context不可用"
            j8.o.A(r9)
            return
        L155:
            java.lang.String r9 = r10.getName()
            java.lang.String r10 = "SO文件扩展名必须是 .so: "
            java.lang.String r9 = wb.en.g(r10, r9)
            j8.o.q(r9)
            return
        L163:
            java.lang.String r9 = r10.getAbsolutePath()
            java.lang.String r10 = "SO文件不存在: "
            java.lang.String r9 = wb.en.g(r10, r9)
            j8.o.q(r9)
            return
    }

    public final boolean prepareSnsPostMedia(java.lang.String r11, bsh.Interpreter r12, java.lang.String r13, java.util.function.Consumer<java.lang.Object> r14) {
            r10 = this;
            r11.getClass()
            r12.getClass()
            if (r13 != 0) goto La
            java.lang.String r13 = ""
        La:
            java.lang.CharSequence r13 = og.m.R0(r13)
            java.lang.String r2 = r13.toString()
            int r13 = r2.length()
            r9 = 0
            if (r13 != 0) goto L1a
            goto L62
        L1a:
            if (r14 != 0) goto L1d
            goto L62
        L1d:
            p8.d0 r1 = bc.e.q()
            if (r1 == 0) goto L62
            java.util.concurrent.atomic.AtomicLong r13 = h.Hchat.hooks.items.script.ScriptPluginRuntime.snsPrepareSequence
            long r3 = r13.incrementAndGet()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            java.lang.String r0 = ":"
            r13.append(r0)
            r13.append(r2)
            r13.append(r0)
            r13.append(r3)
            java.lang.String r6 = r13.toString()
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r3.<init>(r9)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.atomic.AtomicBoolean> r13 = h.Hchat.hooks.items.script.ScriptPluginRuntime.snsPrepareCancellations
            r13.put(r6, r3)
            java.util.concurrent.ThreadPoolExecutor r13 = h.Hchat.hooks.items.script.ScriptPluginRuntime.snsPrepareExecutor     // Catch: java.util.concurrent.RejectedExecutionException -> L5d
            ca.j r0 = new ca.j     // Catch: java.util.concurrent.RejectedExecutionException -> L5d
            r8 = 2
            r4 = r11
            r5 = r12
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.util.concurrent.RejectedExecutionException -> L5d
            r13.execute(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L5d
            r11 = 1
            return r11
        L5d:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.atomic.AtomicBoolean> r11 = h.Hchat.hooks.items.script.ScriptPluginRuntime.snsPrepareCancellations
            r11.remove(r6, r3)
        L62:
            return r9
    }

    public final void refreshCallbacks(java.lang.String r4, bsh.Interpreter r5) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, eb.a0> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.loadedPlugins
            java.lang.Object r4 = r0.get(r4)
            eb.a0 r4 = (eb.a0) r4
            if (r4 == 0) goto L8b
            java.util.concurrent.locks.ReentrantLock r0 = r3.interpreterLock(r5)
            r0.lock()
            h.Hchat.hooks.items.script.ScriptPluginRuntime r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE     // Catch: java.lang.Throwable -> L86
            eb.y r5 = r1.detectCallbacks(r5)     // Catch: java.lang.Throwable -> L86
            r0.unlock()
            boolean r0 = r4.f2488c
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L2d
            boolean r0 = r5.f2685a
            if (r0 == 0) goto L2b
            goto L2d
        L2b:
            r0 = r2
            goto L2e
        L2d:
            r0 = r1
        L2e:
            r4.f2488c = r0
            boolean r0 = r4.f2489d
            if (r0 != 0) goto L3b
            boolean r0 = r5.f2686b
            if (r0 == 0) goto L39
            goto L3b
        L39:
            r0 = r2
            goto L3c
        L3b:
            r0 = r1
        L3c:
            r4.f2489d = r0
            boolean r0 = r4.f2490e
            if (r0 != 0) goto L49
            boolean r0 = r5.f2687c
            if (r0 == 0) goto L47
            goto L49
        L47:
            r0 = r2
            goto L4a
        L49:
            r0 = r1
        L4a:
            r4.f2490e = r0
            boolean r0 = r4.f2491f
            if (r0 != 0) goto L57
            boolean r0 = r5.f2688d
            if (r0 == 0) goto L55
            goto L57
        L55:
            r0 = r2
            goto L58
        L57:
            r0 = r1
        L58:
            r4.f2491f = r0
            boolean r0 = r4.f2492g
            if (r0 != 0) goto L65
            boolean r0 = r5.f2689e
            if (r0 == 0) goto L63
            goto L65
        L63:
            r0 = r2
            goto L66
        L65:
            r0 = r1
        L66:
            r4.f2492g = r0
            boolean r0 = r4.f2493h
            if (r0 != 0) goto L73
            boolean r0 = r5.f2690f
            if (r0 == 0) goto L71
            goto L73
        L71:
            r0 = r2
            goto L74
        L73:
            r0 = r1
        L74:
            r4.f2493h = r0
            boolean r0 = r4.f2494i
            if (r0 != 0) goto L80
            boolean r5 = r5.f2691g
            if (r5 == 0) goto L7f
            goto L80
        L7f:
            r1 = r2
        L80:
            r4.f2494i = r1
            r3.updateProtobufPacketListener()
            return
        L86:
            r4 = move-exception
            r0.unlock()
            throw r4
        L8b:
            return
    }

    public final synchronized void refreshPluginObserver(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            monitor-enter(r1)
            r2.getClass()     // Catch: java.lang.Throwable -> L15
            r3.getClass()     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.ConcurrentHashMap<java.lang.String, android.os.FileObserver> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.pluginDirObservers     // Catch: java.lang.Throwable -> L15
            java.lang.Object r0 = r0.remove(r3)     // Catch: java.lang.Throwable -> L15
            android.os.FileObserver r0 = (android.os.FileObserver) r0     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            r0.stopWatching()     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r2 = move-exception
            goto L32
        L17:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Runnable> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.reloadTasks     // Catch: java.lang.Throwable -> L15
            java.lang.Object r3 = r0.remove(r3)     // Catch: java.lang.Throwable -> L15
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L26
            android.os.Handler r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.mainHandler     // Catch: java.lang.Throwable -> L15
            r0.removeCallbacks(r3)     // Catch: java.lang.Throwable -> L15
        L26:
            android.content.Context r3 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L2d
            r2 = r3
        L2d:
            r1.startPluginObservers(r2)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)
            return
        L32:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r2
    }

    /* JADX INFO: renamed from: reloadPlugin-gIAlu-s, reason: not valid java name */
    public final synchronized java.lang.Object m14reloadPlugingIAlus(android.content.Context r8, java.lang.String r9) {
            r7 = this;
            monitor-enter(r7)
            r8.getClass()     // Catch: java.lang.Throwable -> L91
            r9.getClass()     // Catch: java.lang.Throwable -> L91
            android.content.Context r0 = r8.getApplicationContext()     // Catch: java.lang.Throwable -> L91
            if (r0 == 0) goto Lf
            r2 = r0
            goto L10
        Lf:
            r2 = r8
        L10:
            h.Hchat.hooks.items.script.ScriptPluginRuntime.appContext = r2     // Catch: java.lang.Throwable -> L91
            java.lang.String r8 = "Hchat_script_plugin_config"
            android.content.SharedPreferences r8 = ub.b.c(r2, r8)     // Catch: java.lang.Throwable -> L91
            java.lang.String r0 = "script_plugin_enable"
            r1 = 0
            boolean r0 = r8.getBoolean(r0, r1)     // Catch: java.lang.Throwable -> L91
            if (r0 == 0) goto L2d
            java.lang.String r0 = "script_plugin_item_"
            java.lang.String r0 = r0.concat(r9)     // Catch: java.lang.Throwable -> L91
            boolean r8 = r8.getBoolean(r0, r1)     // Catch: java.lang.Throwable -> L91
            if (r8 != 0) goto L30
        L2d:
            r1 = r7
            goto Lb2
        L30:
            java.util.List r8 = r7.listPlugins(r2)     // Catch: java.lang.Throwable -> L91
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L91
        L38:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> L91
            if (r0 == 0) goto L52
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Throwable -> L4e
            r1 = r0
            eb.c0 r1 = (eb.c0) r1     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = r1.f2506a     // Catch: java.lang.Throwable -> L4e
            boolean r1 = r1.equals(r9)     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L38
            goto L53
        L4e:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto Lb6
        L52:
            r0 = 0
        L53:
            r4 = r0
            eb.c0 r4 = (eb.c0) r4     // Catch: java.lang.Throwable -> L91
            if (r4 == 0) goto L94
            java.util.Set r8 = r4.f2514i     // Catch: java.lang.Throwable -> L91
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> L91
            if (r8 == 0) goto L6e
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L4e
            java.lang.String r9 = "插件 process 配置无效"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L4e
            sf.f r9 = new sf.f     // Catch: java.lang.Throwable -> L4e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r7)
            return r9
        L6e:
            java.lang.String r8 = h.Hchat.hooks.items.script.ScriptPluginRuntime.runtimeProcess     // Catch: java.lang.Throwable -> L91
            boolean r8 = r7.supportsProcess(r4, r8)     // Catch: java.lang.Throwable -> L91
            if (r8 != 0) goto L7a
            sf.n r8 = sf.n.f12433a     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r7)
            return r8
        L7a:
            h.Hchat.hooks.items.script.ScriptPluginBridge r3 = r7.currentBridge(r2)     // Catch: java.lang.Throwable -> L91
            java.lang.String r8 = h.Hchat.hooks.items.script.ScriptPluginRuntime.runtimeProcess     // Catch: java.lang.Throwable -> L91
            java.lang.String r9 = "main"
            boolean r6 = gg.l.a(r8, r9)     // Catch: java.lang.Throwable -> L91
            r5 = 1
            r1 = r7
            java.lang.Object r8 = r1.m8loadPluginyxL6bBk(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r7)
            return r8
        L8e:
            r0 = move-exception
        L8f:
            r8 = r0
            goto Lb6
        L91:
            r0 = move-exception
            r1 = r7
            goto L8f
        L94:
            r1 = r7
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r0.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = "未找到插件: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L8e
            r0.append(r9)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L8e
            sf.f r9 = new sf.f     // Catch: java.lang.Throwable -> L8e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r7)
            return r9
        Lb2:
            sf.n r8 = sf.n.f12433a     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r7)
            return r8
        Lb6:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L8e
            throw r8
    }

    public final void reloadPluginAsync(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            java.lang.Thread r0 = new java.lang.Thread
            eb.w r1 = new eb.w
            r2 = 0
            r1.<init>(r4, r5, r2)
            java.lang.String r4 = "Hchat-Script-Reload-"
            java.lang.String r4 = r4.concat(r5)
            r0.<init>(r1, r4)
            r0.start()
            return
    }

    public final java.io.File scriptDir(android.content.Context r8) {
            r7 = this;
            r8.getClass()
            android.content.Context r0 = r8.getApplicationContext()
            if (r0 == 0) goto La
            r8 = r0
        La:
            r0 = 0
            java.io.File[] r1 = r8.getExternalMediaDirs()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L2c
            int r2 = r1.length     // Catch: java.lang.Throwable -> L2c
            r3 = 0
            r4 = r3
        L14:
            if (r4 >= r2) goto L2c
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L2c
            if (r5 == 0) goto L1c
            r6 = 1
            goto L1d
        L1c:
            r6 = r3
        L1d:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L2c
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L2c
            if (r6 == 0) goto L29
            r0 = r5
            goto L2c
        L29:
            int r4 = r4 + 1
            goto L14
        L2c:
            if (r0 == 0) goto L2f
            goto L3e
        L2f:
            java.io.File r0 = new java.io.File
            java.lang.String r8 = r8.getPackageName()
            java.lang.String r1 = "/storage/emulated/0/Android/media/"
            java.lang.String r8 = wb.en.g(r1, r8)
            r0.<init>(r8)
        L3e:
            java.io.File r8 = new java.io.File
            java.lang.String r1 = "Hchat/脚本插件"
            r8.<init>(r0, r1)
            return r8
    }

    public final boolean sendProtobufPacket(java.lang.String r3, int r4, int r5, int r6, java.lang.String r7, java.util.function.Consumer<h.Hchat.hooks.items.script.ScriptPluginRuntime.SendResult> r8) {
            r2 = this;
            r3.getClass()
            r7.getClass()
            r0 = r8
            eb.t r8 = new eb.t
            r1 = 0
            r8.<init>(r0, r1)
            boolean r3 = wa.j.a(r3, r4, r5, r6, r7, r8)
            return r3
    }

    public final boolean sendProtobufPacket(java.lang.String r7, int r8, java.lang.String r9, java.util.function.Consumer<h.Hchat.hooks.items.script.ScriptPluginRuntime.SendResult> r10) {
            r6 = this;
            r7.getClass()
            r9.getClass()
            eb.t r5 = new eb.t
            r0 = 1
            r5.<init>(r10, r0)
            r2 = 0
            r3 = 0
            r0 = r7
            r1 = r8
            r4 = r9
            boolean r7 = wa.j.a(r0, r1, r2, r3, r4, r5)
            return r7
    }

    /* JADX INFO: renamed from: setGlobalEnabled-gIAlu-s, reason: not valid java name */
    public final synchronized java.lang.Object m15setGlobalEnabledgIAlus(android.content.Context r5, boolean r6) {
            r4 = this;
            monitor-enter(r4)
            r5.getClass()     // Catch: java.lang.Throwable -> L29
            android.content.Context r0 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto Lb
            r5 = r0
        Lb:
            h.Hchat.hooks.items.script.ScriptPluginRuntime.appContext = r5     // Catch: java.lang.Throwable -> L29
            r4.ensureDirs(r5)     // Catch: java.lang.Throwable -> L29
            r4.startPluginObservers(r5)     // Catch: java.lang.Throwable -> L29
            if (r6 == 0) goto L2b
            boolean r0 = r4.isScriptApiReady()     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L29
            java.lang.String r6 = "微信联系人数据库尚未就绪，请稍后重试"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L29
            sf.f r6 = new sf.f     // Catch: java.lang.Throwable -> L29
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r4)
            return r6
        L29:
            r5 = move-exception
            goto L75
        L2b:
            java.lang.String r0 = "Hchat_script_plugin_config"
            android.content.SharedPreferences r0 = ub.b.c(r5, r0)     // Catch: java.lang.Throwable -> L29
            if (r6 == 0) goto L4a
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "script_plugin_enable"
            r3 = 1
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r2, r3)     // Catch: java.lang.Throwable -> L29
            r1.apply()     // Catch: java.lang.Throwable -> L29
            h.Hchat.hooks.items.script.ScriptPluginBridge r1 = r4.currentBridge(r5)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r5 = r4.m7loadEnabledPluginsgIAlus(r5, r1)     // Catch: java.lang.Throwable -> L29
            goto L4e
        L4a:
            java.lang.Object r5 = r4.m10unloadAllPluginsd1pmJ48()     // Catch: java.lang.Throwable -> L29
        L4e:
            boolean r1 = r5 instanceof sf.f     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L60
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "script_plugin_enable"
            android.content.SharedPreferences$Editor r6 = r0.putBoolean(r1, r6)     // Catch: java.lang.Throwable -> L29
            r6.apply()     // Catch: java.lang.Throwable -> L29
            goto L73
        L60:
            if (r6 == 0) goto L73
            r4.m10unloadAllPluginsd1pmJ48()     // Catch: java.lang.Throwable -> L29
            android.content.SharedPreferences$Editor r6 = r0.edit()     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = "script_plugin_enable"
            r1 = 0
            android.content.SharedPreferences$Editor r6 = r6.putBoolean(r0, r1)     // Catch: java.lang.Throwable -> L29
            r6.apply()     // Catch: java.lang.Throwable -> L29
        L73:
            monitor-exit(r4)
            return r5
        L75:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L29
            throw r5
    }

    /* JADX INFO: renamed from: setPluginEnabled-0E7RQCE, reason: not valid java name */
    public final synchronized java.lang.Object m16setPluginEnabled0E7RQCE(android.content.Context r10, java.lang.String r11, boolean r12) {
            r9 = this;
            monitor-enter(r9)
            r10.getClass()     // Catch: java.lang.Throwable -> Ld7
            r11.getClass()     // Catch: java.lang.Throwable -> Ld7
            android.content.Context r0 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto Lf
            r2 = r0
            goto L10
        Lf:
            r2 = r10
        L10:
            h.Hchat.hooks.items.script.ScriptPluginRuntime.appContext = r2     // Catch: java.lang.Throwable -> Ld7
            r9.ensureDirs(r2)     // Catch: java.lang.Throwable -> Ld7
            r9.startPluginObservers(r2)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r10 = "Hchat_script_plugin_config"
            android.content.SharedPreferences r10 = ub.b.c(r2, r10)     // Catch: java.lang.Throwable -> Ld7
            r0 = 0
            if (r12 == 0) goto L49
            java.util.List r1 = r9.listPlugins(r2)     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L40
        L29:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L45
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L40
            r4 = r3
            eb.c0 r4 = (eb.c0) r4     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = r4.f2506a     // Catch: java.lang.Throwable -> L40
            boolean r4 = r4.equals(r11)     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L29
            r0 = r3
            goto L45
        L40:
            r0 = move-exception
            r10 = r0
            r1 = r9
            goto L111
        L45:
            eb.c0 r0 = (eb.c0) r0     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L4b
        L49:
            r4 = r0
            goto L68
        L4b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r12.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = "未找到插件: "
            r12.append(r0)     // Catch: java.lang.Throwable -> L40
            r12.append(r11)     // Catch: java.lang.Throwable -> L40
            java.lang.String r11 = r12.toString()     // Catch: java.lang.Throwable -> L40
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L40
            sf.f r11 = new sf.f     // Catch: java.lang.Throwable -> L40
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r9)
            return r11
        L68:
            r0 = 0
            if (r12 == 0) goto L94
            java.lang.String r1 = "script_plugin_enable"
            boolean r1 = r10.getBoolean(r1, r0)     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L94
            if (r4 == 0) goto L94
            h.Hchat.hooks.items.script.ScriptPluginRuntime r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = "main"
            boolean r1 = r1.supportsProcess(r4, r3)     // Catch: java.lang.Throwable -> L40
            r3 = 1
            if (r1 != r3) goto L94
            boolean r1 = r9.isScriptApiReady()     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L94
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L40
            java.lang.String r11 = "微信联系人数据库尚未就绪，请稍后重试"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L40
            sf.f r11 = new sf.f     // Catch: java.lang.Throwable -> L40
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r9)
            return r11
        L94:
            if (r12 == 0) goto Le3
            if (r4 == 0) goto Lda
            java.util.Set r1 = r4.f2514i     // Catch: java.lang.Throwable -> Ld7
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Ld7
            if (r1 == 0) goto Laf
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "插件 process 配置无效"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L40
            sf.f r1 = new sf.f     // Catch: java.lang.Throwable -> L40
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L40
        Lac:
            r0 = r1
            r1 = r9
            goto Lf7
        Laf:
            java.lang.String r1 = "script_plugin_enable"
            boolean r0 = r10.getBoolean(r1, r0)     // Catch: java.lang.Throwable -> Ld7
            if (r0 != 0) goto Lba
            sf.n r1 = sf.n.f12433a     // Catch: java.lang.Throwable -> L40
            goto Lac
        Lba:
            java.lang.String r0 = "main"
            boolean r0 = r9.supportsProcess(r4, r0)     // Catch: java.lang.Throwable -> Ld7
            if (r0 != 0) goto Lc5
            sf.n r1 = sf.n.f12433a     // Catch: java.lang.Throwable -> L40
            goto Lac
        Lc5:
            h.Hchat.hooks.items.script.ScriptPluginBridge r3 = r9.currentBridge(r2)     // Catch: java.lang.Throwable -> Ld7
            r7 = 16
            r8 = 0
            r5 = 1
            r6 = 0
            r1 = r9
            java.lang.Object r0 = m9loadPluginyxL6bBk$default(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Ld4
            goto Lf7
        Ld4:
            r0 = move-exception
        Ld5:
            r10 = r0
            goto L111
        Ld7:
            r0 = move-exception
            r1 = r9
            goto Ld5
        Lda:
            r1 = r9
            java.lang.String r10 = "Required value was null."
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Ld4
            r11.<init>(r10)     // Catch: java.lang.Throwable -> Ld4
            throw r11     // Catch: java.lang.Throwable -> Ld4
        Le3:
            r1 = r9
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Runnable> r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.reloadTasks     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object r0 = r0.remove(r11)     // Catch: java.lang.Throwable -> Ld4
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> Ld4
            if (r0 == 0) goto Lf3
            android.os.Handler r2 = h.Hchat.hooks.items.script.ScriptPluginRuntime.mainHandler     // Catch: java.lang.Throwable -> Ld4
            r2.removeCallbacks(r0)     // Catch: java.lang.Throwable -> Ld4
        Lf3:
            java.lang.Object r0 = r9.m11unloadPluginIoAF18A(r11)     // Catch: java.lang.Throwable -> Ld4
        Lf7:
            boolean r2 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> Ld4
            if (r2 != 0) goto L10c
            android.content.SharedPreferences$Editor r10 = r10.edit()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = "script_plugin_item_"
            java.lang.String r11 = r2.concat(r11)     // Catch: java.lang.Throwable -> Ld4
            android.content.SharedPreferences$Editor r10 = r10.putBoolean(r11, r12)     // Catch: java.lang.Throwable -> Ld4
            r10.apply()     // Catch: java.lang.Throwable -> Ld4
        L10c:
            r9.notifyPluginCatalogChanged()     // Catch: java.lang.Throwable -> Ld4
            monitor-exit(r9)
            return r0
        L111:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Ld4
            throw r10
    }

    public final eb.b0 subscribePluginCatalog(android.content.Context r2, fg.a r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            android.content.Context r0 = r2.getApplicationContext()
            if (r0 == 0) goto Ld
            r2 = r0
        Ld:
            h.Hchat.hooks.items.script.ScriptPluginRuntime.appContext = r2
            r1.ensureDirs(r2)
            r1.startPluginObservers(r2)
            java.util.concurrent.CopyOnWriteArrayList<fg.a> r2 = h.Hchat.hooks.items.script.ScriptPluginRuntime.pluginCatalogListeners
            r2.add(r3)
            eb.b0 r2 = new eb.b0
            r2.<init>(r3)
            return r2
    }

    public final void useCallback(java.lang.String r3, bsh.Interpreter r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            r0 = 0
            if (r5 == 0) goto L12
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            goto L13
        L12:
            r5 = r0
        L13:
            java.lang.String r1 = ""
            if (r5 != 0) goto L18
            r5 = r1
        L18:
            if (r6 == 0) goto L22
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r0 = r6.toString()
        L22:
            if (r0 != 0) goto L25
            goto L26
        L25:
            r1 = r0
        L26:
            java.lang.String r5 = r2.callbackWrapper(r5, r1)
            java.util.concurrent.locks.ReentrantLock r6 = r2.interpreterLock(r4)
            r6.lock()
            r4.eval(r5)     // Catch: java.lang.Throwable -> L3d
            h.Hchat.hooks.items.script.ScriptPluginRuntime r5 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE     // Catch: java.lang.Throwable -> L3d
            r5.refreshCallbacks(r3, r4)     // Catch: java.lang.Throwable -> L3d
            r6.unlock()
            return
        L3d:
            r3 = move-exception
            r6.unlock()
            throw r3
    }
}
