.class public final Lh/Hchat/hooks/api/core/WeChatApis;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field private static final CONTACT_GROUP:Li8/a;

.field private static final INTERACTION_GROUP:Li8/b;

.field private static final MESSAGE_GROUP:Li8/c;

.field private static final PAYMENT_GROUP:Li8/d;

.field private static final RUNTIME_GROUP:Li8/e;

.field private static volatile accountApi:Lg8/a;

.field private static volatile activityStartApi:Lq8/i;

.field private static volatile chatPageApi:Lq8/m;

.field private static volatile chatroomApi:Lg8/d;

.field private static volatile chatroomChangeApi:Lg8/g;

.field private static volatile configApi:Lo8/a;

.field private static volatile contactApi:Lg8/i;

.field private static volatile contactChangeApi:Lg8/j;

.field private static volatile conversationApi:Lh8/a;

.field private static volatile conversationChangeApi:Lh8/b;

.field private static volatile currentActivityApi:Lq8/o;

.field private static volatile databaseApi:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

.field private static volatile databaseListenerApi:Lo8/d;

.field private static volatile diagnosticsApi:Lo8/e;

.field private static volatile lifecycleApi:Lq8/q;

.field private static volatile localMessageApi:Lk8/e;

.field private static volatile mediaApi:Lj8/p;

.field private static volatile messageApi:Lk8/g;

.field private static volatile messageChangeApi:Lk8/i;

.field private static volatile messageEventApi:Lk8/k;

.field private static volatile messageObserveApi:Lk8/p;

.field private static volatile messageParseApi:Lk8/q;

.field private static volatile messageStoreApi:Lk8/s;

.field private static volatile networkApi:Lm8/a;

.field private static volatile notifyApi:Lq8/r;

.field private static volatile permissionApi:Lo8/f;

.field private static volatile snsApi:Lp8/d0;

.field private static volatile storageApi:Lo8/g;

.field private static volatile taskApi:Lo8/j;

.field private static volatile transferApi:Ln8/c;

.field private static volatile uiApi:Lq8/s;

.field private static volatile userApi:Lg8/k;

.field private static volatile verifyUserApi:Lg8/l;

.field private static volatile versionApi:Lo8/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Li8/c;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->MESSAGE_GROUP:Li8/c;

    .line 7
    .line 8
    new-instance v0, Li8/a;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->CONTACT_GROUP:Li8/a;

    .line 14
    .line 15
    new-instance v0, Li8/e;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->RUNTIME_GROUP:Li8/e;

    .line 21
    .line 22
    new-instance v0, Li8/b;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->INTERACTION_GROUP:Li8/b;

    .line 28
    .line 29
    new-instance v0, Li8/d;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->PAYMENT_GROUP:Li8/d;

    .line 35
    .line 36
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic a()Lg8/a;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->accountApi:Lg8/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static account()Lg8/a;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->accountApi:Lg8/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static activityStart()Lq8/i;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->activityStartApi:Lq8/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic b()Lq8/m;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->chatPageApi:Lq8/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic c()Lg8/d;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->chatroomApi:Lg8/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public static chatPage()Lq8/m;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->chatPageApi:Lq8/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public static chatroomChanges()Lg8/g;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->chatroomChangeApi:Lg8/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public static chatrooms()Lg8/d;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->chatroomApi:Lg8/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public static clear()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageApi:Lk8/g;

    .line 3
    .line 4
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->databaseApi:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 5
    .line 6
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->accountApi:Lg8/a;

    .line 7
    .line 8
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->contactApi:Lg8/i;

    .line 9
    .line 10
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageStoreApi:Lk8/s;

    .line 11
    .line 12
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->conversationApi:Lh8/a;

    .line 13
    .line 14
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->notifyApi:Lq8/r;

    .line 15
    .line 16
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->configApi:Lo8/a;

    .line 17
    .line 18
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->networkApi:Lm8/a;

    .line 19
    .line 20
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->userApi:Lg8/k;

    .line 21
    .line 22
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->chatroomApi:Lg8/d;

    .line 23
    .line 24
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->storageApi:Lo8/g;

    .line 25
    .line 26
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageParseApi:Lk8/q;

    .line 27
    .line 28
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageEventApi:Lk8/k;

    .line 29
    .line 30
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->localMessageApi:Lk8/e;

    .line 31
    .line 32
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->uiApi:Lq8/s;

    .line 33
    .line 34
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->mediaApi:Lj8/p;

    .line 35
    .line 36
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->permissionApi:Lo8/f;

    .line 37
    .line 38
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->databaseListenerApi:Lo8/d;

    .line 39
    .line 40
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivityApi:Lq8/o;

    .line 41
    .line 42
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->activityStartApi:Lq8/i;

    .line 43
    .line 44
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageChangeApi:Lk8/i;

    .line 45
    .line 46
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->conversationChangeApi:Lh8/b;

    .line 47
    .line 48
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->contactChangeApi:Lg8/j;

    .line 49
    .line 50
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->chatroomChangeApi:Lg8/g;

    .line 51
    .line 52
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->lifecycleApi:Lq8/q;

    .line 53
    .line 54
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->diagnosticsApi:Lo8/e;

    .line 55
    .line 56
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->taskApi:Lo8/j;

    .line 57
    .line 58
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageObserveApi:Lk8/p;

    .line 59
    .line 60
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->chatPageApi:Lq8/m;

    .line 61
    .line 62
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->versionApi:Lo8/k;

    .line 63
    .line 64
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->transferApi:Ln8/c;

    .line 65
    .line 66
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->verifyUserApi:Lg8/l;

    .line 67
    .line 68
    sput-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi:Lp8/d0;

    .line 69
    .line 70
    return-void
.end method

.method public static config()Lo8/a;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->configApi:Lo8/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static contact()Li8/a;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->CONTACT_GROUP:Li8/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static contactChanges()Lg8/j;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->contactChangeApi:Lg8/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public static contacts()Lg8/i;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->contactApi:Lg8/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public static conversationChanges()Lh8/b;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->conversationChangeApi:Lh8/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public static conversations()Lh8/a;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->conversationApi:Lh8/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static currentActivity()Lq8/o;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivityApi:Lq8/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic d()Lg8/g;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->chatroomChangeApi:Lg8/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public static database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->databaseApi:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 2
    .line 3
    return-object v0
.end method

.method public static databaseChanges()Lo8/d;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->databaseListenerApi:Lo8/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public static diagnostics()Lo8/e;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->diagnosticsApi:Lo8/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic e()Lg8/i;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->contactApi:Lg8/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic f()Lh8/a;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->conversationApi:Lh8/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic g()Lo8/d;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->databaseListenerApi:Lo8/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic h()Lk8/e;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->localMessageApi:Lk8/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public static hasAccount()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->accountApi:Lg8/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->accountApi:Lg8/a;

    .line 6
    .line 7
    iget-object v0, v0, Lg8/a;->c:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 8
    .line 9
    invoke-virtual {v0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->isAvailable()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public static hasActivityStart()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->activityStartApi:Lq8/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->activityStartApi:Lq8/i;

    .line 6
    .line 7
    iget-boolean v0, v0, Lq8/i;->c:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public static hasChatPage()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->chatPageApi:Lq8/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->chatPageApi:Lq8/m;

    .line 6
    .line 7
    iget-boolean v0, v0, Lq8/m;->h:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public static hasChatroomChanges()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->chatroomChangeApi:Lg8/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->chatroomChangeApi:Lg8/g;

    .line 6
    .line 7
    iget-object v0, v0, Lg8/g;->a:Lo8/d;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lo8/d;->f()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public static hasChatrooms()Z
    .locals 2

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->chatroomApi:Lg8/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->chatroomApi:Lg8/d;

    .line 6
    .line 7
    iget-object v1, v0, Lg8/d;->a:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->isAvailable()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v0, v0, Lg8/d;->b:Lg8/i;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Lg8/i;->G()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    return v0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    return v0
.end method

.method public static hasConfig()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->configApi:Lo8/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->configApi:Lo8/a;

    .line 6
    .line 7
    iget-object v0, v0, Lo8/a;->a:Landroid/content/Context;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public static hasContactChanges()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->contactChangeApi:Lg8/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->contactChangeApi:Lg8/j;

    .line 6
    .line 7
    iget-object v0, v0, Lg8/j;->a:Lo8/d;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lo8/d;->f()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public static hasContacts()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->contactApi:Lg8/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->contactApi:Lg8/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Lg8/i;->G()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public static hasConversationChanges()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->conversationChangeApi:Lh8/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->conversationChangeApi:Lh8/b;

    .line 6
    .line 7
    iget-object v0, v0, Lh8/b;->a:Lo8/d;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lo8/d;->f()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public static hasConversations()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->conversationApi:Lh8/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->conversationApi:Lh8/a;

    .line 6
    .line 7
    iget-object v0, v0, Lh8/a;->a:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 8
    .line 9
    invoke-virtual {v0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->isAvailable()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public static hasCurrentActivity()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivityApi:Lq8/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivityApi:Lq8/o;

    .line 6
    .line 7
    iget-boolean v0, v0, Lq8/o;->c:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public static hasDatabase()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->databaseApi:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->databaseApi:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 6
    .line 7
    invoke-virtual {v0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->isAvailable()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public static hasDatabaseChanges()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->databaseListenerApi:Lo8/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->databaseListenerApi:Lo8/d;

    .line 6
    .line 7
    invoke-virtual {v0}, Lo8/d;->f()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public static hasDiagnostics()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->diagnosticsApi:Lo8/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->diagnosticsApi:Lo8/e;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
.end method

.method public static hasLifecycle()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->lifecycleApi:Lq8/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->lifecycleApi:Lq8/q;

    .line 6
    .line 7
    iget-boolean v0, v0, Lq8/q;->c:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public static hasLocalMessages()Z
    .locals 2

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->localMessageApi:Lk8/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->localMessageApi:Lk8/e;

    .line 6
    .line 7
    iget-object v0, v0, Lk8/e;->a:Lh/Hchat/dexkit/DexFinder;

    .line 8
    .line 9
    invoke-virtual {v0}, Lh/Hchat/dexkit/DexFinder;->hasLocalMessageApi()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public static hasMedia()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->mediaApi:Lj8/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->mediaApi:Lj8/p;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
.end method

.method public static hasMessageChanges()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageChangeApi:Lk8/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageChangeApi:Lk8/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Lk8/i;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public static hasMessageEvents()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageEventApi:Lk8/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageEventApi:Lk8/k;

    .line 6
    .line 7
    invoke-virtual {v0}, Lk8/k;->c()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public static hasMessageObserve()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageObserveApi:Lk8/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageObserveApi:Lk8/p;

    .line 6
    .line 7
    invoke-virtual {v0}, Lk8/p;->c()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public static hasMessageParser()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageParseApi:Lk8/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageParseApi:Lk8/q;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
.end method

.method public static hasMessageStore()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageStoreApi:Lk8/s;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageStoreApi:Lk8/s;

    .line 6
    .line 7
    invoke-virtual {v0}, Lk8/s;->h()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public static hasMessages()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageApi:Lk8/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageApi:Lk8/g;

    .line 6
    .line 7
    invoke-virtual {v0}, Lk8/g;->m()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public static hasNetwork()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->networkApi:Lm8/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->networkApi:Lm8/a;

    .line 6
    .line 7
    iget-object v0, v0, Lm8/a;->a:Lm8/c;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public static hasNotifyApi()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->notifyApi:Lq8/r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->notifyApi:Lq8/r;

    .line 6
    .line 7
    iget-object v0, v0, Lq8/r;->a:Landroid/content/Context;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public static hasPermissions()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->permissionApi:Lo8/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->permissionApi:Lo8/f;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
.end method

.method public static hasSnsApi()Z
    .locals 2

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi:Lp8/d0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi:Lp8/d0;

    .line 6
    .line 7
    iget-object v0, v0, Lp8/d0;->b:Lh/Hchat/dexkit/DexFinder;

    .line 8
    .line 9
    invoke-virtual {v0}, Lh/Hchat/dexkit/DexFinder;->hasSnsUploadApi()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public static hasStorage()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->storageApi:Lo8/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->storageApi:Lo8/g;

    .line 6
    .line 7
    iget-object v0, v0, Lo8/g;->a:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 8
    .line 9
    invoke-virtual {v0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->isAvailable()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public static hasTasks()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->taskApi:Lo8/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->taskApi:Lo8/j;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
.end method

.method public static hasTransfers()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->transferApi:Ln8/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->transferApi:Ln8/c;

    .line 6
    .line 7
    invoke-virtual {v0}, Ln8/c;->c()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public static hasUi()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->uiApi:Lq8/s;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->uiApi:Lq8/s;

    .line 6
    .line 7
    iget-object v0, v0, Lq8/s;->a:Landroid/content/Context;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public static hasUsers()Z
    .locals 2

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->userApi:Lg8/k;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->userApi:Lg8/k;

    .line 6
    .line 7
    iget-object v1, v0, Lg8/k;->a:Lg8/a;

    .line 8
    .line 9
    iget-object v1, v1, Lg8/a;->c:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 10
    .line 11
    invoke-virtual {v1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->isAvailable()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-object v0, v0, Lg8/k;->b:Lg8/i;

    .line 18
    .line 19
    invoke-virtual {v0}, Lg8/i;->G()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    :cond_0
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method public static hasVerifyUsers()Z
    .locals 2

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->verifyUserApi:Lg8/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->verifyUserApi:Lg8/l;

    .line 6
    .line 7
    iget-object v0, v0, Lg8/l;->a:Lh/Hchat/dexkit/DexFinder;

    .line 8
    .line 9
    invoke-virtual {v0}, Lh/Hchat/dexkit/DexFinder;->hasVerifyUserApi()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public static hasVersion()Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->versionApi:Lo8/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->versionApi:Lo8/k;

    .line 6
    .line 7
    iget-object v0, v0, Lo8/k;->a:Landroid/content/Context;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public static bridge synthetic i()Lj8/p;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->mediaApi:Lj8/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static init(Lk8/g;)V
    .locals 0

    .line 67
    sput-object p0, Lh/Hchat/hooks/api/core/WeChatApis;->messageApi:Lk8/g;

    return-void
.end method

.method public static init(Lk8/g;Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;Lg8/a;Lg8/i;)V
    .locals 0

    .line 53
    sput-object p0, Lh/Hchat/hooks/api/core/WeChatApis;->messageApi:Lk8/g;

    .line 54
    sput-object p1, Lh/Hchat/hooks/api/core/WeChatApis;->databaseApi:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 55
    sput-object p2, Lh/Hchat/hooks/api/core/WeChatApis;->accountApi:Lg8/a;

    .line 56
    sput-object p3, Lh/Hchat/hooks/api/core/WeChatApis;->contactApi:Lg8/i;

    return-void
.end method

.method public static init(Lk8/g;Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;Lg8/a;Lg8/i;Lk8/s;Lh8/a;Lq8/r;Lo8/a;Lm8/a;Lg8/k;)V
    .locals 0

    .line 57
    sput-object p0, Lh/Hchat/hooks/api/core/WeChatApis;->messageApi:Lk8/g;

    .line 58
    sput-object p1, Lh/Hchat/hooks/api/core/WeChatApis;->databaseApi:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 59
    sput-object p2, Lh/Hchat/hooks/api/core/WeChatApis;->accountApi:Lg8/a;

    .line 60
    sput-object p3, Lh/Hchat/hooks/api/core/WeChatApis;->contactApi:Lg8/i;

    .line 61
    sput-object p4, Lh/Hchat/hooks/api/core/WeChatApis;->messageStoreApi:Lk8/s;

    .line 62
    sput-object p5, Lh/Hchat/hooks/api/core/WeChatApis;->conversationApi:Lh8/a;

    .line 63
    sput-object p6, Lh/Hchat/hooks/api/core/WeChatApis;->notifyApi:Lq8/r;

    .line 64
    sput-object p7, Lh/Hchat/hooks/api/core/WeChatApis;->configApi:Lo8/a;

    .line 65
    sput-object p8, Lh/Hchat/hooks/api/core/WeChatApis;->networkApi:Lm8/a;

    .line 66
    sput-object p9, Lh/Hchat/hooks/api/core/WeChatApis;->userApi:Lg8/k;

    return-void
.end method

.method public static init(Lk8/g;Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;Lg8/a;Lg8/i;Lk8/s;Lh8/a;Lq8/r;Lo8/a;Lm8/a;Lg8/k;Lg8/d;Lo8/g;Lk8/q;Lk8/k;Lk8/e;Lq8/s;Lj8/p;Lo8/f;Lo8/d;Lq8/o;Lq8/i;Lk8/i;Lh8/b;Lg8/j;Lg8/g;Lq8/q;Lo8/e;Lo8/j;Lk8/p;Lq8/m;Lo8/k;Ln8/c;Lg8/l;Lp8/d0;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p9}, Lh/Hchat/hooks/api/core/WeChatApis;->init(Lk8/g;Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;Lg8/a;Lg8/i;Lk8/s;Lh8/a;Lq8/r;Lo8/a;Lm8/a;Lg8/k;)V

    .line 2
    .line 3
    .line 4
    sput-object p10, Lh/Hchat/hooks/api/core/WeChatApis;->chatroomApi:Lg8/d;

    .line 5
    .line 6
    sput-object p11, Lh/Hchat/hooks/api/core/WeChatApis;->storageApi:Lo8/g;

    .line 7
    .line 8
    sput-object p12, Lh/Hchat/hooks/api/core/WeChatApis;->messageParseApi:Lk8/q;

    .line 9
    .line 10
    sput-object p13, Lh/Hchat/hooks/api/core/WeChatApis;->messageEventApi:Lk8/k;

    .line 11
    .line 12
    sput-object p14, Lh/Hchat/hooks/api/core/WeChatApis;->localMessageApi:Lk8/e;

    .line 13
    .line 14
    sput-object p15, Lh/Hchat/hooks/api/core/WeChatApis;->uiApi:Lq8/s;

    .line 15
    .line 16
    sput-object p16, Lh/Hchat/hooks/api/core/WeChatApis;->mediaApi:Lj8/p;

    .line 17
    .line 18
    sput-object p17, Lh/Hchat/hooks/api/core/WeChatApis;->permissionApi:Lo8/f;

    .line 19
    .line 20
    sput-object p18, Lh/Hchat/hooks/api/core/WeChatApis;->databaseListenerApi:Lo8/d;

    .line 21
    .line 22
    sput-object p19, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivityApi:Lq8/o;

    .line 23
    .line 24
    sput-object p20, Lh/Hchat/hooks/api/core/WeChatApis;->activityStartApi:Lq8/i;

    .line 25
    .line 26
    sput-object p21, Lh/Hchat/hooks/api/core/WeChatApis;->messageChangeApi:Lk8/i;

    .line 27
    .line 28
    sput-object p22, Lh/Hchat/hooks/api/core/WeChatApis;->conversationChangeApi:Lh8/b;

    .line 29
    .line 30
    sput-object p23, Lh/Hchat/hooks/api/core/WeChatApis;->contactChangeApi:Lg8/j;

    .line 31
    .line 32
    sput-object p24, Lh/Hchat/hooks/api/core/WeChatApis;->chatroomChangeApi:Lg8/g;

    .line 33
    .line 34
    sput-object p25, Lh/Hchat/hooks/api/core/WeChatApis;->lifecycleApi:Lq8/q;

    .line 35
    .line 36
    sput-object p26, Lh/Hchat/hooks/api/core/WeChatApis;->diagnosticsApi:Lo8/e;

    .line 37
    .line 38
    sput-object p27, Lh/Hchat/hooks/api/core/WeChatApis;->taskApi:Lo8/j;

    .line 39
    .line 40
    sput-object p28, Lh/Hchat/hooks/api/core/WeChatApis;->messageObserveApi:Lk8/p;

    .line 41
    .line 42
    sput-object p29, Lh/Hchat/hooks/api/core/WeChatApis;->chatPageApi:Lq8/m;

    .line 43
    .line 44
    sput-object p30, Lh/Hchat/hooks/api/core/WeChatApis;->versionApi:Lo8/k;

    .line 45
    .line 46
    sput-object p31, Lh/Hchat/hooks/api/core/WeChatApis;->transferApi:Ln8/c;

    .line 47
    .line 48
    sput-object p32, Lh/Hchat/hooks/api/core/WeChatApis;->verifyUserApi:Lg8/l;

    .line 49
    .line 50
    sput-object p33, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi:Lp8/d0;

    .line 51
    .line 52
    return-void
.end method

.method public static interaction()Li8/b;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->INTERACTION_GROUP:Li8/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic j()Lk8/g;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageApi:Lk8/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic k()Lk8/i;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageChangeApi:Lk8/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic l()Lk8/p;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageObserveApi:Lk8/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static lifecycle()Lq8/q;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->lifecycleApi:Lq8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public static localMessages()Lk8/e;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->localMessageApi:Lk8/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic m()Lk8/s;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageStoreApi:Lk8/s;

    .line 2
    .line 3
    return-object v0
.end method

.method public static media()Lj8/p;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->mediaApi:Lj8/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static message()Li8/c;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->MESSAGE_GROUP:Li8/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public static messageChanges()Lk8/i;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageChangeApi:Lk8/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public static messageEvents()Lk8/k;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageEventApi:Lk8/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public static messageObserve()Lk8/p;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageObserveApi:Lk8/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static messageParser()Lk8/q;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageParseApi:Lk8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public static messageStore()Lk8/s;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageStoreApi:Lk8/s;

    .line 2
    .line 3
    return-object v0
.end method

.method public static messages()Lk8/g;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->messageApi:Lk8/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic n()Lq8/r;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->notifyApi:Lq8/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public static network()Lm8/a;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->networkApi:Lm8/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static notifyApi()Lq8/r;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->notifyApi:Lq8/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic o()Lp8/d0;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi:Lp8/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic p()Lo8/j;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->taskApi:Lo8/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public static payment()Li8/d;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->PAYMENT_GROUP:Li8/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public static permissions()Lo8/f;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->permissionApi:Lo8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic q()Ln8/c;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->transferApi:Ln8/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic r()Lg8/k;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->userApi:Lg8/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public static runtime()Li8/e;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->RUNTIME_GROUP:Li8/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic s()Lg8/l;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->verifyUserApi:Lg8/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public static snsApi()Lp8/d0;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi:Lp8/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public static storage()Lo8/g;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->storageApi:Lo8/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public static tasks()Lo8/j;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->taskApi:Lo8/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public static transfers()Ln8/c;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->transferApi:Ln8/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public static ui()Lq8/s;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->uiApi:Lq8/s;

    .line 2
    .line 3
    return-object v0
.end method

.method public static users()Lg8/k;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->userApi:Lg8/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public static verifyUsers()Lg8/l;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->verifyUserApi:Lg8/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public static version()Lo8/k;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/core/WeChatApis;->versionApi:Lo8/k;

    .line 2
    .line 3
    return-object v0
.end method
