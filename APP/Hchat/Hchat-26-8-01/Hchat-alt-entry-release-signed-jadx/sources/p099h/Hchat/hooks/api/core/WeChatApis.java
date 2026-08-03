package p099h.Hchat.hooks.api.core;

import android.content.Context;
import p096g8.C1360a;
import p096g8.C1363d;
import p096g8.C1366g;
import p096g8.C1368i;
import p096g8.C1369j;
import p096g8.C1370k;
import p096g8.C1371l;
import p099h.Hchat.hooks.api.runtime.WeChatDatabaseApi;
import p106h8.C1624a;
import p106h8.C1625b;
import p125i8.C1997a;
import p125i8.C1998b;
import p125i8.C1999c;
import p125i8.C2000d;
import p125i8.C2001e;
import p136j8.C2105p;
import p153k8.C2341e;
import p153k8.C2343g;
import p153k8.C2345i;
import p153k8.C2347k;
import p153k8.C2352p;
import p153k8.C2353q;
import p153k8.C2355s;
import p183m8.C2813a;
import p183m8.C2815c;
import p196n8.C2911c;
import p210o8.C3077a;
import p210o8.C3080d;
import p210o8.C3081e;
import p210o8.C3082f;
import p210o8.C3083g;
import p210o8.C3086j;
import p210o8.C3087k;
import p230p8.C3351d0;
import p242q8.C3454i;
import p242q8.C3458m;
import p242q8.C3460o;
import p242q8.C3462q;
import p242q8.C3463r;
import p242q8.C3464s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatApis {
    private static volatile C1360a accountApi;
    private static volatile C3454i activityStartApi;
    private static volatile C3458m chatPageApi;
    private static volatile C1363d chatroomApi;
    private static volatile C1366g chatroomChangeApi;
    private static volatile C3077a configApi;
    private static volatile C1368i contactApi;
    private static volatile C1369j contactChangeApi;
    private static volatile C1624a conversationApi;
    private static volatile C1625b conversationChangeApi;
    private static volatile C3460o currentActivityApi;
    private static volatile WeChatDatabaseApi databaseApi;
    private static volatile C3080d databaseListenerApi;
    private static volatile C3081e diagnosticsApi;
    private static volatile C3462q lifecycleApi;
    private static volatile C2341e localMessageApi;
    private static volatile C2105p mediaApi;
    private static volatile C2343g messageApi;
    private static volatile C2345i messageChangeApi;
    private static volatile C2347k messageEventApi;
    private static volatile C2352p messageObserveApi;
    private static volatile C2353q messageParseApi;
    private static volatile C2355s messageStoreApi;
    private static volatile C2813a networkApi;
    private static volatile C3463r notifyApi;
    private static volatile C3082f permissionApi;
    private static volatile C3351d0 snsApi;
    private static volatile C3083g storageApi;
    private static volatile C3086j taskApi;
    private static volatile C2911c transferApi;
    private static volatile C3464s uiApi;
    private static volatile C1370k userApi;
    private static volatile C1371l verifyUserApi;
    private static volatile C3087k versionApi;
    private static final C1999c MESSAGE_GROUP = new C1999c();
    private static final C1997a CONTACT_GROUP = new C1997a();
    private static final C2001e RUNTIME_GROUP = new C2001e();
    private static final C1998b INTERACTION_GROUP = new C1998b();
    private static final C2000d PAYMENT_GROUP = new C2000d();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private WeChatApis() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1360a account() {
        return accountApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C3454i activityStart() {
        return activityStartApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C3458m chatPage() {
        return chatPageApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1366g chatroomChanges() {
        return chatroomChangeApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1363d chatrooms() {
        return chatroomApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void clear() {
        messageApi = null;
        databaseApi = null;
        accountApi = null;
        contactApi = null;
        messageStoreApi = null;
        conversationApi = null;
        notifyApi = null;
        configApi = null;
        networkApi = null;
        userApi = null;
        chatroomApi = null;
        storageApi = null;
        messageParseApi = null;
        messageEventApi = null;
        localMessageApi = null;
        uiApi = null;
        mediaApi = null;
        permissionApi = null;
        databaseListenerApi = null;
        currentActivityApi = null;
        activityStartApi = null;
        messageChangeApi = null;
        conversationChangeApi = null;
        contactChangeApi = null;
        chatroomChangeApi = null;
        lifecycleApi = null;
        diagnosticsApi = null;
        taskApi = null;
        messageObserveApi = null;
        chatPageApi = null;
        versionApi = null;
        transferApi = null;
        verifyUserApi = null;
        snsApi = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C3077a config() {
        return configApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1997a contact() {
        return CONTACT_GROUP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1369j contactChanges() {
        return contactChangeApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1368i contacts() {
        return contactApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1625b conversationChanges() {
        return conversationChangeApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1624a conversations() {
        return conversationApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C3460o currentActivity() {
        return currentActivityApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static WeChatDatabaseApi database() {
        return databaseApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C3080d databaseChanges() {
        return databaseListenerApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C3081e diagnostics() {
        return diagnosticsApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasAccount() {
        return accountApi != null && accountApi.f4508c.isAvailable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasActivityStart() {
        return activityStartApi != null && activityStartApi.f11205c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasChatPage() {
        return chatPageApi != null && chatPageApi.f11218h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasChatroomChanges() {
        C3080d c3080d;
        return (chatroomChangeApi == null || (c3080d = chatroomChangeApi.f4525a) == null || !c3080d.m6548f()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasChatrooms() {
        C1363d c1363d;
        WeChatDatabaseApi weChatDatabaseApi;
        C1368i c1368i;
        return (chatroomApi == null || (weChatDatabaseApi = (c1363d = chatroomApi).f4516a) == null || !weChatDatabaseApi.isAvailable() || (c1368i = c1363d.f4517b) == null || !c1368i.m3704G()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasConfig() {
        if (configApi == null) {
            return false;
        }
        Context context = configApi.f9950a;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasContactChanges() {
        C3080d c3080d;
        return (contactChangeApi == null || (c3080d = contactChangeApi.f4549a) == null || !c3080d.m6548f()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasContacts() {
        return contactApi != null && contactApi.m3704G();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasConversationChanges() {
        C3080d c3080d;
        return (conversationChangeApi == null || (c3080d = conversationChangeApi.f5321a) == null || !c3080d.m6548f()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasConversations() {
        return conversationApi != null && conversationApi.f5317a.isAvailable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasCurrentActivity() {
        return currentActivityApi != null && currentActivityApi.f11227c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasDatabase() {
        return databaseApi != null && databaseApi.isAvailable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasDatabaseChanges() {
        return databaseListenerApi != null && databaseListenerApi.m6548f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasDiagnostics() {
        if (diagnosticsApi == null) {
            return false;
        }
        diagnosticsApi.getClass();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasLifecycle() {
        return lifecycleApi != null && lifecycleApi.f11230c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasLocalMessages() {
        return localMessageApi != null && localMessageApi.f7669a.hasLocalMessageApi();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasMedia() {
        if (mediaApi == null) {
            return false;
        }
        mediaApi.getClass();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasMessageChanges() {
        return messageChangeApi != null && messageChangeApi.m5607b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasMessageEvents() {
        return messageEventApi != null && messageEventApi.m5612c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasMessageObserve() {
        return messageObserveApi != null && messageObserveApi.m5638c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasMessageParser() {
        if (messageParseApi == null) {
            return false;
        }
        messageParseApi.getClass();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasMessageStore() {
        return messageStoreApi != null && messageStoreApi.m5665h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasMessages() {
        return messageApi != null && messageApi.m5594m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasNetwork() {
        if (networkApi == null) {
            return false;
        }
        C2815c c2815c = networkApi.f9079a;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasNotifyApi() {
        if (notifyApi == null) {
            return false;
        }
        Context context = notifyApi.f11231a;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasPermissions() {
        if (permissionApi == null) {
            return false;
        }
        permissionApi.getClass();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasSnsApi() {
        return snsApi != null && snsApi.f10782b.hasSnsUploadApi();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasStorage() {
        return storageApi != null && storageApi.f9957a.isAvailable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasTasks() {
        if (taskApi == null) {
            return false;
        }
        taskApi.getClass();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasTransfers() {
        return transferApi != null && transferApi.m6316c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasUi() {
        if (uiApi == null) {
            return false;
        }
        Context context = uiApi.f11232a;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasUsers() {
        if (userApi == null) {
            return false;
        }
        C1370k c1370k = userApi;
        return c1370k.f4554a.f4508c.isAvailable() || c1370k.f4555b.m3704G();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasVerifyUsers() {
        return verifyUserApi != null && verifyUserApi.f4556a.hasVerifyUserApi();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasVersion() {
        if (versionApi == null) {
            return false;
        }
        Context context = versionApi.f9977a;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void init(C2343g c2343g, WeChatDatabaseApi weChatDatabaseApi, C1360a c1360a, C1368i c1368i, C2355s c2355s, C1624a c1624a, C3463r c3463r, C3077a c3077a, C2813a c2813a, C1370k c1370k, C1363d c1363d, C3083g c3083g, C2353q c2353q, C2347k c2347k, C2341e c2341e, C3464s c3464s, C2105p c2105p, C3082f c3082f, C3080d c3080d, C3460o c3460o, C3454i c3454i, C2345i c2345i, C1625b c1625b, C1369j c1369j, C1366g c1366g, C3462q c3462q, C3081e c3081e, C3086j c3086j, C2352p c2352p, C3458m c3458m, C3087k c3087k, C2911c c2911c, C1371l c1371l, C3351d0 c3351d0) {
        init(c2343g, weChatDatabaseApi, c1360a, c1368i, c2355s, c1624a, c3463r, c3077a, c2813a, c1370k);
        chatroomApi = c1363d;
        storageApi = c3083g;
        messageParseApi = c2353q;
        messageEventApi = c2347k;
        localMessageApi = c2341e;
        uiApi = c3464s;
        mediaApi = c2105p;
        permissionApi = c3082f;
        databaseListenerApi = c3080d;
        currentActivityApi = c3460o;
        activityStartApi = c3454i;
        messageChangeApi = c2345i;
        conversationChangeApi = c1625b;
        contactChangeApi = c1369j;
        chatroomChangeApi = c1366g;
        lifecycleApi = c3462q;
        diagnosticsApi = c3081e;
        taskApi = c3086j;
        messageObserveApi = c2352p;
        chatPageApi = c3458m;
        versionApi = c3087k;
        transferApi = c2911c;
        verifyUserApi = c1371l;
        snsApi = c3351d0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1998b interaction() {
        return INTERACTION_GROUP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C3462q lifecycle() {
        return lifecycleApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C2341e localMessages() {
        return localMessageApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C2105p media() {
        return mediaApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1999c message() {
        return MESSAGE_GROUP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C2345i messageChanges() {
        return messageChangeApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C2347k messageEvents() {
        return messageEventApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C2352p messageObserve() {
        return messageObserveApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C2353q messageParser() {
        return messageParseApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C2355s messageStore() {
        return messageStoreApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C2343g messages() {
        return messageApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C2813a network() {
        return networkApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C3463r notifyApi() {
        return notifyApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C2000d payment() {
        return PAYMENT_GROUP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C3082f permissions() {
        return permissionApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C2001e runtime() {
        return RUNTIME_GROUP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C3351d0 snsApi() {
        return snsApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C3083g storage() {
        return storageApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C3086j tasks() {
        return taskApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C2911c transfers() {
        return transferApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ui */
    public static C3464s m3890ui() {
        return uiApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1370k users() {
        return userApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1371l verifyUsers() {
        return verifyUserApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C3087k version() {
        return versionApi;
    }

    public static void init(C2343g c2343g, WeChatDatabaseApi weChatDatabaseApi, C1360a c1360a, C1368i c1368i) {
        messageApi = c2343g;
        databaseApi = weChatDatabaseApi;
        accountApi = c1360a;
        contactApi = c1368i;
    }

    public static void init(C2343g c2343g, WeChatDatabaseApi weChatDatabaseApi, C1360a c1360a, C1368i c1368i, C2355s c2355s, C1624a c1624a, C3463r c3463r, C3077a c3077a, C2813a c2813a, C1370k c1370k) {
        messageApi = c2343g;
        databaseApi = weChatDatabaseApi;
        accountApi = c1360a;
        contactApi = c1368i;
        messageStoreApi = c2355s;
        conversationApi = c1624a;
        notifyApi = c3463r;
        configApi = c3077a;
        networkApi = c2813a;
        userApi = c1370k;
    }

    public static void init(C2343g c2343g) {
        messageApi = c2343g;
    }
}
