package h.Hchat.hooks.api.core;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatApis {
    private static final i8.a CONTACT_GROUP = null;
    private static final i8.b INTERACTION_GROUP = null;
    private static final i8.c MESSAGE_GROUP = null;
    private static final i8.d PAYMENT_GROUP = null;
    private static final i8.e RUNTIME_GROUP = null;
    private static volatile g8.a accountApi;
    private static volatile q8.i activityStartApi;
    private static volatile q8.m chatPageApi;
    private static volatile g8.d chatroomApi;
    private static volatile g8.g chatroomChangeApi;
    private static volatile o8.a configApi;
    private static volatile g8.i contactApi;
    private static volatile g8.j contactChangeApi;
    private static volatile h8.a conversationApi;
    private static volatile h8.b conversationChangeApi;
    private static volatile q8.o currentActivityApi;
    private static volatile h.Hchat.hooks.api.runtime.WeChatDatabaseApi databaseApi;
    private static volatile o8.d databaseListenerApi;
    private static volatile o8.e diagnosticsApi;
    private static volatile q8.q lifecycleApi;
    private static volatile k8.e localMessageApi;
    private static volatile j8.p mediaApi;
    private static volatile k8.g messageApi;
    private static volatile k8.i messageChangeApi;
    private static volatile k8.k messageEventApi;
    private static volatile k8.p messageObserveApi;
    private static volatile k8.q messageParseApi;
    private static volatile k8.s messageStoreApi;
    private static volatile m8.a networkApi;
    private static volatile q8.r notifyApi;
    private static volatile o8.f permissionApi;
    private static volatile p8.d0 snsApi;
    private static volatile o8.g storageApi;
    private static volatile o8.j taskApi;
    private static volatile n8.c transferApi;
    private static volatile q8.s uiApi;
    private static volatile g8.k userApi;
    private static volatile g8.l verifyUserApi;
    private static volatile o8.k versionApi;

    static {
            i8.c r0 = new i8.c
            r0.<init>()
            h.Hchat.hooks.api.core.WeChatApis.MESSAGE_GROUP = r0
            i8.a r0 = new i8.a
            r0.<init>()
            h.Hchat.hooks.api.core.WeChatApis.CONTACT_GROUP = r0
            i8.e r0 = new i8.e
            r0.<init>()
            h.Hchat.hooks.api.core.WeChatApis.RUNTIME_GROUP = r0
            i8.b r0 = new i8.b
            r0.<init>()
            h.Hchat.hooks.api.core.WeChatApis.INTERACTION_GROUP = r0
            i8.d r0 = new i8.d
            r0.<init>()
            h.Hchat.hooks.api.core.WeChatApis.PAYMENT_GROUP = r0
            return
    }

    private WeChatApis() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* bridge */ /* synthetic */ g8.a a() {
            g8.a r0 = h.Hchat.hooks.api.core.WeChatApis.accountApi
            return r0
    }

    public static g8.a account() {
            g8.a r0 = h.Hchat.hooks.api.core.WeChatApis.accountApi
            return r0
    }

    public static q8.i activityStart() {
            q8.i r0 = h.Hchat.hooks.api.core.WeChatApis.activityStartApi
            return r0
    }

    public static /* bridge */ /* synthetic */ q8.m b() {
            q8.m r0 = h.Hchat.hooks.api.core.WeChatApis.chatPageApi
            return r0
    }

    public static /* bridge */ /* synthetic */ g8.d c() {
            g8.d r0 = h.Hchat.hooks.api.core.WeChatApis.chatroomApi
            return r0
    }

    public static q8.m chatPage() {
            q8.m r0 = h.Hchat.hooks.api.core.WeChatApis.chatPageApi
            return r0
    }

    public static g8.g chatroomChanges() {
            g8.g r0 = h.Hchat.hooks.api.core.WeChatApis.chatroomChangeApi
            return r0
    }

    public static g8.d chatrooms() {
            g8.d r0 = h.Hchat.hooks.api.core.WeChatApis.chatroomApi
            return r0
    }

    public static void clear() {
            r0 = 0
            h.Hchat.hooks.api.core.WeChatApis.messageApi = r0
            h.Hchat.hooks.api.core.WeChatApis.databaseApi = r0
            h.Hchat.hooks.api.core.WeChatApis.accountApi = r0
            h.Hchat.hooks.api.core.WeChatApis.contactApi = r0
            h.Hchat.hooks.api.core.WeChatApis.messageStoreApi = r0
            h.Hchat.hooks.api.core.WeChatApis.conversationApi = r0
            h.Hchat.hooks.api.core.WeChatApis.notifyApi = r0
            h.Hchat.hooks.api.core.WeChatApis.configApi = r0
            h.Hchat.hooks.api.core.WeChatApis.networkApi = r0
            h.Hchat.hooks.api.core.WeChatApis.userApi = r0
            h.Hchat.hooks.api.core.WeChatApis.chatroomApi = r0
            h.Hchat.hooks.api.core.WeChatApis.storageApi = r0
            h.Hchat.hooks.api.core.WeChatApis.messageParseApi = r0
            h.Hchat.hooks.api.core.WeChatApis.messageEventApi = r0
            h.Hchat.hooks.api.core.WeChatApis.localMessageApi = r0
            h.Hchat.hooks.api.core.WeChatApis.uiApi = r0
            h.Hchat.hooks.api.core.WeChatApis.mediaApi = r0
            h.Hchat.hooks.api.core.WeChatApis.permissionApi = r0
            h.Hchat.hooks.api.core.WeChatApis.databaseListenerApi = r0
            h.Hchat.hooks.api.core.WeChatApis.currentActivityApi = r0
            h.Hchat.hooks.api.core.WeChatApis.activityStartApi = r0
            h.Hchat.hooks.api.core.WeChatApis.messageChangeApi = r0
            h.Hchat.hooks.api.core.WeChatApis.conversationChangeApi = r0
            h.Hchat.hooks.api.core.WeChatApis.contactChangeApi = r0
            h.Hchat.hooks.api.core.WeChatApis.chatroomChangeApi = r0
            h.Hchat.hooks.api.core.WeChatApis.lifecycleApi = r0
            h.Hchat.hooks.api.core.WeChatApis.diagnosticsApi = r0
            h.Hchat.hooks.api.core.WeChatApis.taskApi = r0
            h.Hchat.hooks.api.core.WeChatApis.messageObserveApi = r0
            h.Hchat.hooks.api.core.WeChatApis.chatPageApi = r0
            h.Hchat.hooks.api.core.WeChatApis.versionApi = r0
            h.Hchat.hooks.api.core.WeChatApis.transferApi = r0
            h.Hchat.hooks.api.core.WeChatApis.verifyUserApi = r0
            h.Hchat.hooks.api.core.WeChatApis.snsApi = r0
            return
    }

    public static o8.a config() {
            o8.a r0 = h.Hchat.hooks.api.core.WeChatApis.configApi
            return r0
    }

    public static i8.a contact() {
            i8.a r0 = h.Hchat.hooks.api.core.WeChatApis.CONTACT_GROUP
            return r0
    }

    public static g8.j contactChanges() {
            g8.j r0 = h.Hchat.hooks.api.core.WeChatApis.contactChangeApi
            return r0
    }

    public static g8.i contacts() {
            g8.i r0 = h.Hchat.hooks.api.core.WeChatApis.contactApi
            return r0
    }

    public static h8.b conversationChanges() {
            h8.b r0 = h.Hchat.hooks.api.core.WeChatApis.conversationChangeApi
            return r0
    }

    public static h8.a conversations() {
            h8.a r0 = h.Hchat.hooks.api.core.WeChatApis.conversationApi
            return r0
    }

    public static q8.o currentActivity() {
            q8.o r0 = h.Hchat.hooks.api.core.WeChatApis.currentActivityApi
            return r0
    }

    public static /* bridge */ /* synthetic */ g8.g d() {
            g8.g r0 = h.Hchat.hooks.api.core.WeChatApis.chatroomChangeApi
            return r0
    }

    public static h.Hchat.hooks.api.runtime.WeChatDatabaseApi database() {
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = h.Hchat.hooks.api.core.WeChatApis.databaseApi
            return r0
    }

    public static o8.d databaseChanges() {
            o8.d r0 = h.Hchat.hooks.api.core.WeChatApis.databaseListenerApi
            return r0
    }

    public static o8.e diagnostics() {
            o8.e r0 = h.Hchat.hooks.api.core.WeChatApis.diagnosticsApi
            return r0
    }

    public static /* bridge */ /* synthetic */ g8.i e() {
            g8.i r0 = h.Hchat.hooks.api.core.WeChatApis.contactApi
            return r0
    }

    public static /* bridge */ /* synthetic */ h8.a f() {
            h8.a r0 = h.Hchat.hooks.api.core.WeChatApis.conversationApi
            return r0
    }

    public static /* bridge */ /* synthetic */ o8.d g() {
            o8.d r0 = h.Hchat.hooks.api.core.WeChatApis.databaseListenerApi
            return r0
    }

    public static /* bridge */ /* synthetic */ k8.e h() {
            k8.e r0 = h.Hchat.hooks.api.core.WeChatApis.localMessageApi
            return r0
    }

    public static boolean hasAccount() {
            g8.a r0 = h.Hchat.hooks.api.core.WeChatApis.accountApi
            if (r0 == 0) goto L10
            g8.a r0 = h.Hchat.hooks.api.core.WeChatApis.accountApi
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = r0.f4340c
            boolean r0 = r0.isAvailable()
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public static boolean hasActivityStart() {
            q8.i r0 = h.Hchat.hooks.api.core.WeChatApis.activityStartApi
            if (r0 == 0) goto Lc
            q8.i r0 = h.Hchat.hooks.api.core.WeChatApis.activityStartApi
            boolean r0 = r0.f10709c
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public static boolean hasChatPage() {
            q8.m r0 = h.Hchat.hooks.api.core.WeChatApis.chatPageApi
            if (r0 == 0) goto Lc
            q8.m r0 = h.Hchat.hooks.api.core.WeChatApis.chatPageApi
            boolean r0 = r0.f10722h
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public static boolean hasChatroomChanges() {
            g8.g r0 = h.Hchat.hooks.api.core.WeChatApis.chatroomChangeApi
            if (r0 == 0) goto L12
            g8.g r0 = h.Hchat.hooks.api.core.WeChatApis.chatroomChangeApi
            o8.d r0 = r0.f4357a
            if (r0 == 0) goto L12
            boolean r0 = r0.f()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public static boolean hasChatrooms() {
            g8.d r0 = h.Hchat.hooks.api.core.WeChatApis.chatroomApi
            if (r0 == 0) goto L1c
            g8.d r0 = h.Hchat.hooks.api.core.WeChatApis.chatroomApi
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r1 = r0.f4348a
            if (r1 == 0) goto L1c
            boolean r1 = r1.isAvailable()
            if (r1 == 0) goto L1c
            g8.i r0 = r0.f4349b
            if (r0 == 0) goto L1c
            boolean r0 = r0.G()
            if (r0 == 0) goto L1c
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
    }

    public static boolean hasConfig() {
            o8.a r0 = h.Hchat.hooks.api.core.WeChatApis.configApi
            if (r0 == 0) goto La
            o8.a r0 = h.Hchat.hooks.api.core.WeChatApis.configApi
            android.content.Context r0 = r0.f9587a
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public static boolean hasContactChanges() {
            g8.j r0 = h.Hchat.hooks.api.core.WeChatApis.contactChangeApi
            if (r0 == 0) goto L12
            g8.j r0 = h.Hchat.hooks.api.core.WeChatApis.contactChangeApi
            o8.d r0 = r0.f4381a
            if (r0 == 0) goto L12
            boolean r0 = r0.f()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public static boolean hasContacts() {
            g8.i r0 = h.Hchat.hooks.api.core.WeChatApis.contactApi
            if (r0 == 0) goto Le
            g8.i r0 = h.Hchat.hooks.api.core.WeChatApis.contactApi
            boolean r0 = r0.G()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static boolean hasConversationChanges() {
            h8.b r0 = h.Hchat.hooks.api.core.WeChatApis.conversationChangeApi
            if (r0 == 0) goto L12
            h8.b r0 = h.Hchat.hooks.api.core.WeChatApis.conversationChangeApi
            o8.d r0 = r0.f5139a
            if (r0 == 0) goto L12
            boolean r0 = r0.f()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public static boolean hasConversations() {
            h8.a r0 = h.Hchat.hooks.api.core.WeChatApis.conversationApi
            if (r0 == 0) goto L10
            h8.a r0 = h.Hchat.hooks.api.core.WeChatApis.conversationApi
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = r0.f5135a
            boolean r0 = r0.isAvailable()
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public static boolean hasCurrentActivity() {
            q8.o r0 = h.Hchat.hooks.api.core.WeChatApis.currentActivityApi
            if (r0 == 0) goto Lc
            q8.o r0 = h.Hchat.hooks.api.core.WeChatApis.currentActivityApi
            boolean r0 = r0.f10731c
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public static boolean hasDatabase() {
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = h.Hchat.hooks.api.core.WeChatApis.databaseApi
            if (r0 == 0) goto Le
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = h.Hchat.hooks.api.core.WeChatApis.databaseApi
            boolean r0 = r0.isAvailable()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static boolean hasDatabaseChanges() {
            o8.d r0 = h.Hchat.hooks.api.core.WeChatApis.databaseListenerApi
            if (r0 == 0) goto Le
            o8.d r0 = h.Hchat.hooks.api.core.WeChatApis.databaseListenerApi
            boolean r0 = r0.f()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static boolean hasDiagnostics() {
            o8.e r0 = h.Hchat.hooks.api.core.WeChatApis.diagnosticsApi
            if (r0 == 0) goto Lb
            o8.e r0 = h.Hchat.hooks.api.core.WeChatApis.diagnosticsApi
            r0.getClass()
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static boolean hasLifecycle() {
            q8.q r0 = h.Hchat.hooks.api.core.WeChatApis.lifecycleApi
            if (r0 == 0) goto Lc
            q8.q r0 = h.Hchat.hooks.api.core.WeChatApis.lifecycleApi
            boolean r0 = r0.f10734c
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public static boolean hasLocalMessages() {
            k8.e r0 = h.Hchat.hooks.api.core.WeChatApis.localMessageApi
            if (r0 == 0) goto L10
            k8.e r0 = h.Hchat.hooks.api.core.WeChatApis.localMessageApi
            h.Hchat.dexkit.DexFinder r0 = r0.f7400a
            boolean r0 = r0.hasLocalMessageApi()
            r1 = 1
            if (r0 != r1) goto L10
            return r1
        L10:
            r0 = 0
            return r0
    }

    public static boolean hasMedia() {
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.mediaApi
            if (r0 == 0) goto Lb
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.mediaApi
            r0.getClass()
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static boolean hasMessageChanges() {
            k8.i r0 = h.Hchat.hooks.api.core.WeChatApis.messageChangeApi
            if (r0 == 0) goto Le
            k8.i r0 = h.Hchat.hooks.api.core.WeChatApis.messageChangeApi
            boolean r0 = r0.b()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static boolean hasMessageEvents() {
            k8.k r0 = h.Hchat.hooks.api.core.WeChatApis.messageEventApi
            if (r0 == 0) goto Le
            k8.k r0 = h.Hchat.hooks.api.core.WeChatApis.messageEventApi
            boolean r0 = r0.c()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static boolean hasMessageObserve() {
            k8.p r0 = h.Hchat.hooks.api.core.WeChatApis.messageObserveApi
            if (r0 == 0) goto Le
            k8.p r0 = h.Hchat.hooks.api.core.WeChatApis.messageObserveApi
            boolean r0 = r0.c()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static boolean hasMessageParser() {
            k8.q r0 = h.Hchat.hooks.api.core.WeChatApis.messageParseApi
            if (r0 == 0) goto Lb
            k8.q r0 = h.Hchat.hooks.api.core.WeChatApis.messageParseApi
            r0.getClass()
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static boolean hasMessageStore() {
            k8.s r0 = h.Hchat.hooks.api.core.WeChatApis.messageStoreApi
            if (r0 == 0) goto Le
            k8.s r0 = h.Hchat.hooks.api.core.WeChatApis.messageStoreApi
            boolean r0 = r0.h()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static boolean hasMessages() {
            k8.g r0 = h.Hchat.hooks.api.core.WeChatApis.messageApi
            if (r0 == 0) goto Le
            k8.g r0 = h.Hchat.hooks.api.core.WeChatApis.messageApi
            boolean r0 = r0.m()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static boolean hasNetwork() {
            m8.a r0 = h.Hchat.hooks.api.core.WeChatApis.networkApi
            if (r0 == 0) goto La
            m8.a r0 = h.Hchat.hooks.api.core.WeChatApis.networkApi
            m8.c r0 = r0.f8777a
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public static boolean hasNotifyApi() {
            q8.r r0 = h.Hchat.hooks.api.core.WeChatApis.notifyApi
            if (r0 == 0) goto La
            q8.r r0 = h.Hchat.hooks.api.core.WeChatApis.notifyApi
            android.content.Context r0 = r0.f10735a
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public static boolean hasPermissions() {
            o8.f r0 = h.Hchat.hooks.api.core.WeChatApis.permissionApi
            if (r0 == 0) goto Lb
            o8.f r0 = h.Hchat.hooks.api.core.WeChatApis.permissionApi
            r0.getClass()
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static boolean hasSnsApi() {
            p8.d0 r0 = h.Hchat.hooks.api.core.WeChatApis.snsApi
            if (r0 == 0) goto L10
            p8.d0 r0 = h.Hchat.hooks.api.core.WeChatApis.snsApi
            h.Hchat.dexkit.DexFinder r0 = r0.f10329b
            boolean r0 = r0.hasSnsUploadApi()
            r1 = 1
            if (r0 != r1) goto L10
            return r1
        L10:
            r0 = 0
            return r0
    }

    public static boolean hasStorage() {
            o8.g r0 = h.Hchat.hooks.api.core.WeChatApis.storageApi
            if (r0 == 0) goto L10
            o8.g r0 = h.Hchat.hooks.api.core.WeChatApis.storageApi
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = r0.f9594a
            boolean r0 = r0.isAvailable()
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public static boolean hasTasks() {
            o8.j r0 = h.Hchat.hooks.api.core.WeChatApis.taskApi
            if (r0 == 0) goto Lb
            o8.j r0 = h.Hchat.hooks.api.core.WeChatApis.taskApi
            r0.getClass()
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static boolean hasTransfers() {
            n8.c r0 = h.Hchat.hooks.api.core.WeChatApis.transferApi
            if (r0 == 0) goto Le
            n8.c r0 = h.Hchat.hooks.api.core.WeChatApis.transferApi
            boolean r0 = r0.c()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static boolean hasUi() {
            q8.s r0 = h.Hchat.hooks.api.core.WeChatApis.uiApi
            if (r0 == 0) goto La
            q8.s r0 = h.Hchat.hooks.api.core.WeChatApis.uiApi
            android.content.Context r0 = r0.f10736a
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public static boolean hasUsers() {
            g8.k r0 = h.Hchat.hooks.api.core.WeChatApis.userApi
            if (r0 == 0) goto L1a
            g8.k r0 = h.Hchat.hooks.api.core.WeChatApis.userApi
            g8.a r1 = r0.f4386a
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r1 = r1.f4340c
            boolean r1 = r1.isAvailable()
            if (r1 != 0) goto L18
            g8.i r0 = r0.f4387b
            boolean r0 = r0.G()
            if (r0 == 0) goto L1a
        L18:
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
    }

    public static boolean hasVerifyUsers() {
            g8.l r0 = h.Hchat.hooks.api.core.WeChatApis.verifyUserApi
            if (r0 == 0) goto L10
            g8.l r0 = h.Hchat.hooks.api.core.WeChatApis.verifyUserApi
            h.Hchat.dexkit.DexFinder r0 = r0.f4388a
            boolean r0 = r0.hasVerifyUserApi()
            r1 = 1
            if (r0 != r1) goto L10
            return r1
        L10:
            r0 = 0
            return r0
    }

    public static boolean hasVersion() {
            o8.k r0 = h.Hchat.hooks.api.core.WeChatApis.versionApi
            if (r0 == 0) goto La
            o8.k r0 = h.Hchat.hooks.api.core.WeChatApis.versionApi
            android.content.Context r0 = r0.f9614a
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public static /* bridge */ /* synthetic */ j8.p i() {
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.mediaApi
            return r0
    }

    public static void init(k8.g r0) {
            h.Hchat.hooks.api.core.WeChatApis.messageApi = r0
            return
    }

    public static void init(k8.g r0, h.Hchat.hooks.api.runtime.WeChatDatabaseApi r1, g8.a r2, g8.i r3) {
            h.Hchat.hooks.api.core.WeChatApis.messageApi = r0
            h.Hchat.hooks.api.core.WeChatApis.databaseApi = r1
            h.Hchat.hooks.api.core.WeChatApis.accountApi = r2
            h.Hchat.hooks.api.core.WeChatApis.contactApi = r3
            return
    }

    public static void init(k8.g r0, h.Hchat.hooks.api.runtime.WeChatDatabaseApi r1, g8.a r2, g8.i r3, k8.s r4, h8.a r5, q8.r r6, o8.a r7, m8.a r8, g8.k r9) {
            h.Hchat.hooks.api.core.WeChatApis.messageApi = r0
            h.Hchat.hooks.api.core.WeChatApis.databaseApi = r1
            h.Hchat.hooks.api.core.WeChatApis.accountApi = r2
            h.Hchat.hooks.api.core.WeChatApis.contactApi = r3
            h.Hchat.hooks.api.core.WeChatApis.messageStoreApi = r4
            h.Hchat.hooks.api.core.WeChatApis.conversationApi = r5
            h.Hchat.hooks.api.core.WeChatApis.notifyApi = r6
            h.Hchat.hooks.api.core.WeChatApis.configApi = r7
            h.Hchat.hooks.api.core.WeChatApis.networkApi = r8
            h.Hchat.hooks.api.core.WeChatApis.userApi = r9
            return
    }

    public static void init(k8.g r0, h.Hchat.hooks.api.runtime.WeChatDatabaseApi r1, g8.a r2, g8.i r3, k8.s r4, h8.a r5, q8.r r6, o8.a r7, m8.a r8, g8.k r9, g8.d r10, o8.g r11, k8.q r12, k8.k r13, k8.e r14, q8.s r15, j8.p r16, o8.f r17, o8.d r18, q8.o r19, q8.i r20, k8.i r21, h8.b r22, g8.j r23, g8.g r24, q8.q r25, o8.e r26, o8.j r27, k8.p r28, q8.m r29, o8.k r30, n8.c r31, g8.l r32, p8.d0 r33) {
            init(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            h.Hchat.hooks.api.core.WeChatApis.chatroomApi = r10
            h.Hchat.hooks.api.core.WeChatApis.storageApi = r11
            h.Hchat.hooks.api.core.WeChatApis.messageParseApi = r12
            h.Hchat.hooks.api.core.WeChatApis.messageEventApi = r13
            h.Hchat.hooks.api.core.WeChatApis.localMessageApi = r14
            h.Hchat.hooks.api.core.WeChatApis.uiApi = r15
            h.Hchat.hooks.api.core.WeChatApis.mediaApi = r16
            h.Hchat.hooks.api.core.WeChatApis.permissionApi = r17
            h.Hchat.hooks.api.core.WeChatApis.databaseListenerApi = r18
            h.Hchat.hooks.api.core.WeChatApis.currentActivityApi = r19
            h.Hchat.hooks.api.core.WeChatApis.activityStartApi = r20
            h.Hchat.hooks.api.core.WeChatApis.messageChangeApi = r21
            h.Hchat.hooks.api.core.WeChatApis.conversationChangeApi = r22
            h.Hchat.hooks.api.core.WeChatApis.contactChangeApi = r23
            h.Hchat.hooks.api.core.WeChatApis.chatroomChangeApi = r24
            h.Hchat.hooks.api.core.WeChatApis.lifecycleApi = r25
            h.Hchat.hooks.api.core.WeChatApis.diagnosticsApi = r26
            h.Hchat.hooks.api.core.WeChatApis.taskApi = r27
            h.Hchat.hooks.api.core.WeChatApis.messageObserveApi = r28
            h.Hchat.hooks.api.core.WeChatApis.chatPageApi = r29
            h.Hchat.hooks.api.core.WeChatApis.versionApi = r30
            h.Hchat.hooks.api.core.WeChatApis.transferApi = r31
            h.Hchat.hooks.api.core.WeChatApis.verifyUserApi = r32
            h.Hchat.hooks.api.core.WeChatApis.snsApi = r33
            return
    }

    public static i8.b interaction() {
            i8.b r0 = h.Hchat.hooks.api.core.WeChatApis.INTERACTION_GROUP
            return r0
    }

    public static /* bridge */ /* synthetic */ k8.g j() {
            k8.g r0 = h.Hchat.hooks.api.core.WeChatApis.messageApi
            return r0
    }

    public static /* bridge */ /* synthetic */ k8.i k() {
            k8.i r0 = h.Hchat.hooks.api.core.WeChatApis.messageChangeApi
            return r0
    }

    public static /* bridge */ /* synthetic */ k8.p l() {
            k8.p r0 = h.Hchat.hooks.api.core.WeChatApis.messageObserveApi
            return r0
    }

    public static q8.q lifecycle() {
            q8.q r0 = h.Hchat.hooks.api.core.WeChatApis.lifecycleApi
            return r0
    }

    public static k8.e localMessages() {
            k8.e r0 = h.Hchat.hooks.api.core.WeChatApis.localMessageApi
            return r0
    }

    public static /* bridge */ /* synthetic */ k8.s m() {
            k8.s r0 = h.Hchat.hooks.api.core.WeChatApis.messageStoreApi
            return r0
    }

    public static j8.p media() {
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.mediaApi
            return r0
    }

    public static i8.c message() {
            i8.c r0 = h.Hchat.hooks.api.core.WeChatApis.MESSAGE_GROUP
            return r0
    }

    public static k8.i messageChanges() {
            k8.i r0 = h.Hchat.hooks.api.core.WeChatApis.messageChangeApi
            return r0
    }

    public static k8.k messageEvents() {
            k8.k r0 = h.Hchat.hooks.api.core.WeChatApis.messageEventApi
            return r0
    }

    public static k8.p messageObserve() {
            k8.p r0 = h.Hchat.hooks.api.core.WeChatApis.messageObserveApi
            return r0
    }

    public static k8.q messageParser() {
            k8.q r0 = h.Hchat.hooks.api.core.WeChatApis.messageParseApi
            return r0
    }

    public static k8.s messageStore() {
            k8.s r0 = h.Hchat.hooks.api.core.WeChatApis.messageStoreApi
            return r0
    }

    public static k8.g messages() {
            k8.g r0 = h.Hchat.hooks.api.core.WeChatApis.messageApi
            return r0
    }

    public static /* bridge */ /* synthetic */ q8.r n() {
            q8.r r0 = h.Hchat.hooks.api.core.WeChatApis.notifyApi
            return r0
    }

    public static m8.a network() {
            m8.a r0 = h.Hchat.hooks.api.core.WeChatApis.networkApi
            return r0
    }

    public static q8.r notifyApi() {
            q8.r r0 = h.Hchat.hooks.api.core.WeChatApis.notifyApi
            return r0
    }

    public static /* bridge */ /* synthetic */ p8.d0 o() {
            p8.d0 r0 = h.Hchat.hooks.api.core.WeChatApis.snsApi
            return r0
    }

    public static /* bridge */ /* synthetic */ o8.j p() {
            o8.j r0 = h.Hchat.hooks.api.core.WeChatApis.taskApi
            return r0
    }

    public static i8.d payment() {
            i8.d r0 = h.Hchat.hooks.api.core.WeChatApis.PAYMENT_GROUP
            return r0
    }

    public static o8.f permissions() {
            o8.f r0 = h.Hchat.hooks.api.core.WeChatApis.permissionApi
            return r0
    }

    public static /* bridge */ /* synthetic */ n8.c q() {
            n8.c r0 = h.Hchat.hooks.api.core.WeChatApis.transferApi
            return r0
    }

    public static /* bridge */ /* synthetic */ g8.k r() {
            g8.k r0 = h.Hchat.hooks.api.core.WeChatApis.userApi
            return r0
    }

    public static i8.e runtime() {
            i8.e r0 = h.Hchat.hooks.api.core.WeChatApis.RUNTIME_GROUP
            return r0
    }

    public static /* bridge */ /* synthetic */ g8.l s() {
            g8.l r0 = h.Hchat.hooks.api.core.WeChatApis.verifyUserApi
            return r0
    }

    public static p8.d0 snsApi() {
            p8.d0 r0 = h.Hchat.hooks.api.core.WeChatApis.snsApi
            return r0
    }

    public static o8.g storage() {
            o8.g r0 = h.Hchat.hooks.api.core.WeChatApis.storageApi
            return r0
    }

    public static o8.j tasks() {
            o8.j r0 = h.Hchat.hooks.api.core.WeChatApis.taskApi
            return r0
    }

    public static n8.c transfers() {
            n8.c r0 = h.Hchat.hooks.api.core.WeChatApis.transferApi
            return r0
    }

    public static q8.s ui() {
            q8.s r0 = h.Hchat.hooks.api.core.WeChatApis.uiApi
            return r0
    }

    public static g8.k users() {
            g8.k r0 = h.Hchat.hooks.api.core.WeChatApis.userApi
            return r0
    }

    public static g8.l verifyUsers() {
            g8.l r0 = h.Hchat.hooks.api.core.WeChatApis.verifyUserApi
            return r0
    }

    public static o8.k version() {
            o8.k r0 = h.Hchat.hooks.api.core.WeChatApis.versionApi
            return r0
    }
}
