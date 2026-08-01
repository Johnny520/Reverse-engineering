.class public final Lcom/mr/elaris/HookEntry;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field private static final CONFIG:Lcom/mr/elaris/HookConfig;

.field private static final DECORATION_DONE:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final DEFAULT_DECORATION_UNHOOKS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;",
            ">;"
        }
    .end annotation
.end field

.field private static final FIELD_CACHE:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Field;",
            ">;"
        }
    .end annotation
.end field

.field private static final FIELD_MISS_CACHE:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final FILE_CARRIER_CLASSES:Lx4;

.field private static final HOST_APP_PREPARED:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final LOAD_DISPATCHED:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final QQ:Ljava/lang/String; = "com.tencent.mobileqq"

.field private static volatile sDefaultDecorationsHooked:Z

.field private static volatile sEmotionAsPicInstalled:Z

.field private static volatile sLastOriginalImageSendEntryLogAt:J

.field private static volatile sLastPicSummaryNoPicLogAt:J

.field private static volatile sMessageRepeaterInstallTried:Z

.field private static volatile sPicSummarySendHookInstalled:Z

.field private static volatile sQQShowInAioInstalled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/mr/elaris/HookConfig;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/mr/elaris/HookConfig;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lcom/mr/elaris/HookEntry;->LOAD_DISPATCHED:Ljava/util/Set;

    .line 18
    .line 19
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lcom/mr/elaris/HookEntry;->HOST_APP_PREPARED:Ljava/util/Set;

    .line 29
    .line 30
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/mr/elaris/HookEntry;->FIELD_CACHE:Ljava/util/Map;

    .line 36
    .line 37
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Lcom/mr/elaris/HookEntry;->FIELD_MISS_CACHE:Ljava/util/Set;

    .line 47
    .line 48
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, Lcom/mr/elaris/HookEntry;->DECORATION_DONE:Ljava/util/Set;

    .line 58
    .line 59
    new-instance v0, Lx4;

    .line 60
    .line 61
    invoke-direct {v0}, Lx4;-><init>()V

    .line 62
    .line 63
    .line 64
    sput-object v0, Lcom/mr/elaris/HookEntry;->FILE_CARRIER_CLASSES:Lx4;

    .line 65
    .line 66
    new-instance v0, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sput-object v0, Lcom/mr/elaris/HookEntry;->DEFAULT_DECORATION_UNHOOKS:Ljava/util/List;

    .line 76
    .line 77
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic a()Lcom/mr/elaris/HookConfig;
    .locals 1

    .line 1
    sget-object v0, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic b()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hasDefaultMsgDecorations()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public static bridge synthetic c([Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logOriginalImageSendEntry([Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static cacheClassList(Ljava/lang/String;Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    const-string p1, ""

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_1
    invoke-static {p0}, Lt2;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    invoke-static {p0, p1}, Lt2;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_2
    const-string v1, "\\|"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const/4 v2, 0x0

    .line 41
    :goto_1
    array-length v3, v1

    .line 42
    if-ge v2, v3, :cond_4

    .line 43
    .line 44
    aget-object v3, v1, v2

    .line 45
    .line 46
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_3

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v0, "|"

    .line 65
    .line 66
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-static {p0, p1}, Lt2;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_5
    :goto_2
    return-void
.end method

.method private static currentHostClassLoader()Ljava/lang/ClassLoader;
    .locals 2

    .line 1
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Li5;->v:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_1
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 15
    .line 16
    .line 17
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    return-object v0

    .line 19
    :catchall_0
    return-object v1
.end method

.method public static bridge synthetic d(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logPicSummaryNoPicSend(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic e(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->maybeInstallMessageRepeater(Ljava/lang/ClassLoader;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic f([Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->patchOriginalImageArgs([Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static findContactArg([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    array-length v1, p0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_3

    .line 8
    .line 9
    aget-object v3, p0, v2

    .line 10
    .line 11
    if-eqz v3, :cond_2

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    const-string v5, ".Contact"

    .line 22
    .line 23
    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-nez v5, :cond_1

    .line 28
    .line 29
    const-string v5, "nativeinterface.Contact"

    .line 30
    .line 31
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    :cond_1
    return-object v3

    .line 38
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_3
    return-object v0
.end method

.method private static findField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/reflect/Field;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_3

    .line 3
    .line 4
    if-eqz p1, :cond_3

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v2, "#"

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    sget-object v2, Lcom/mr/elaris/HookEntry;->FIELD_CACHE:Ljava/util/Map;

    .line 31
    .line 32
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/lang/reflect/Field;

    .line 37
    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    return-object v2

    .line 41
    :cond_0
    sget-object v2, Lcom/mr/elaris/HookEntry;->FIELD_MISS_CACHE:Ljava/util/Set;

    .line 42
    .line 43
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_1
    :goto_0
    if-eqz p0, :cond_2

    .line 51
    .line 52
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const/4 v3, 0x1

    .line 57
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 58
    .line 59
    .line 60
    sget-object v3, Lcom/mr/elaris/HookEntry;->FIELD_CACHE:Ljava/util/Map;

    .line 61
    .line 62
    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    .line 65
    return-object v2

    .line 66
    :catch_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    goto :goto_0

    .line 71
    :cond_2
    sget-object p0, Lcom/mr/elaris/HookEntry;->FIELD_MISS_CACHE:Ljava/util/Set;

    .line 72
    .line 73
    invoke-interface {p0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    :cond_3
    return-object v0
.end method

.method public static firstMsgRecordArg([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    array-length v1, p0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_2

    .line 8
    .line 9
    aget-object v3, p0, v2

    .line 10
    .line 11
    if-eqz v3, :cond_1

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-static {v4}, Lcom/mr/elaris/HookEntry;->isMsgRecordReturnType(Ljava/lang/Class;)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    return-object v3

    .line 24
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    return-object v0
.end method

.method private static firstNonNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    return-object p1
.end method

.method private static forceDefaultAttrMap(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "**>;)V"
        }
    .end annotation

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->forceDefaultMsgAttributeInfo(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    :goto_1
    return-void
.end method

.method private static forceDefaultMsgAttributeInfo(Ljava/lang/Object;)V
    .locals 5

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_0

    .line 15
    .line 16
    :cond_0
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->looksLikeFileCarrierObject(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    goto/16 :goto_0

    .line 23
    .line 24
    :cond_1
    const-string v2, "vasMsgInfo"

    .line 25
    .line 26
    invoke-static {p0, v2}, Lcom/mr/elaris/HookEntry;->getField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const-string v3, "vasMsgElement"

    .line 31
    .line 32
    invoke-static {p0, v3}, Lcom/mr/elaris/HookEntry;->getField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-static {v2, v3}, Lcom/mr/elaris/HookEntry;->firstNonNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    move-object p0, v2

    .line 43
    :cond_2
    sget-object v2, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 44
    .line 45
    const-string v3, "default_bubble"

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_4

    .line 52
    .line 53
    const-string v3, "bubbleInfo"

    .line 54
    .line 55
    invoke-static {p0, v3}, Lcom/mr/elaris/HookEntry;->getField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    const-string v4, "bubble"

    .line 60
    .line 61
    invoke-static {p0, v4}, Lcom/mr/elaris/HookEntry;->getField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-static {v3, v4}, Lcom/mr/elaris/HookEntry;->firstNonNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    if-nez v3, :cond_3

    .line 70
    .line 71
    move-object v3, p0

    .line 72
    :cond_3
    const-string v4, "bubbleId"

    .line 73
    .line 74
    invoke-static {v3, v4, v1}, Lcom/mr/elaris/HookEntry;->setFieldIfExists(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    const-string v4, "subBubbleId"

    .line 78
    .line 79
    invoke-static {v3, v4, v1}, Lcom/mr/elaris/HookEntry;->setFieldIfExists(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    const-string v4, "diyTextId"

    .line 83
    .line 84
    invoke-static {v3, v4, v1}, Lcom/mr/elaris/HookEntry;->setFieldIfExists(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    const-string v4, "vipFaceId"

    .line 88
    .line 89
    invoke-static {v3, v4, v1}, Lcom/mr/elaris/HookEntry;->setFieldIfExists(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :cond_4
    const-string v3, "default_font"

    .line 93
    .line 94
    invoke-virtual {v2, v3}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_6

    .line 99
    .line 100
    const-string v3, "vasFont"

    .line 101
    .line 102
    invoke-static {p0, v3}, Lcom/mr/elaris/HookEntry;->getField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    const-string v4, "font"

    .line 107
    .line 108
    invoke-static {p0, v4}, Lcom/mr/elaris/HookEntry;->getField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-static {v3, v4}, Lcom/mr/elaris/HookEntry;->firstNonNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    if-nez v3, :cond_5

    .line 117
    .line 118
    move-object v3, p0

    .line 119
    :cond_5
    const-string v4, "fontId"

    .line 120
    .line 121
    invoke-static {v3, v4, v1}, Lcom/mr/elaris/HookEntry;->setFieldIfExists(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    const-string v4, "subFontId"

    .line 125
    .line 126
    invoke-static {v3, v4, v0}, Lcom/mr/elaris/HookEntry;->setFieldIfExists(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    const-string v4, "magicFontType"

    .line 130
    .line 131
    invoke-static {v3, v4, v1}, Lcom/mr/elaris/HookEntry;->setFieldIfExists(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    const-string v4, "fontType"

    .line 135
    .line 136
    invoke-static {v3, v4, v1}, Lcom/mr/elaris/HookEntry;->setFieldIfExists(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_6
    const-string v3, "block_avatar_pendant"

    .line 140
    .line 141
    invoke-virtual {v2, v3}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-eqz v2, :cond_9

    .line 146
    .line 147
    const-string v2, "avatarPendantInfo"

    .line 148
    .line 149
    invoke-static {p0, v2}, Lcom/mr/elaris/HookEntry;->getField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    const-string v3, "avatarPendant"

    .line 154
    .line 155
    invoke-static {p0, v3}, Lcom/mr/elaris/HookEntry;->getField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    invoke-static {v2, v3}, Lcom/mr/elaris/HookEntry;->firstNonNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    if-nez v2, :cond_7

    .line 164
    .line 165
    const-string v2, "pendant"

    .line 166
    .line 167
    invoke-static {p0, v2}, Lcom/mr/elaris/HookEntry;->getField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    const-string v3, "avatarPendantElement"

    .line 172
    .line 173
    invoke-static {p0, v3}, Lcom/mr/elaris/HookEntry;->getField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-static {v2, v3}, Lcom/mr/elaris/HookEntry;->firstNonNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    :cond_7
    if-eqz v2, :cond_8

    .line 182
    .line 183
    move-object p0, v2

    .line 184
    :cond_8
    const-string v2, "pendantId"

    .line 185
    .line 186
    invoke-static {p0, v2, v0}, Lcom/mr/elaris/HookEntry;->setFieldIfExists(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    const-string v2, "pendantDiyInfoId"

    .line 190
    .line 191
    invoke-static {p0, v2, v1}, Lcom/mr/elaris/HookEntry;->setFieldIfExists(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    const-string v1, "id"

    .line 195
    .line 196
    invoke-static {p0, v1, v0}, Lcom/mr/elaris/HookEntry;->setFieldIfExists(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    :cond_9
    :goto_0
    return-void
.end method

.method private static forceDefaultMsgDecorationField(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/HookEntry;->getField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-static {p0, p1}, Lcom/mr/elaris/HookEntry;->forceDefaultMsgDecorationValue(Ljava/lang/Object;I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static forceDefaultMsgDecorationValue(Ljava/lang/Object;I)V
    .locals 4

    .line 1
    if-eqz p0, :cond_6

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    if-le p1, v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_1

    .line 7
    .line 8
    :cond_0
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->looksLikeFileCarrierObject(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    goto/16 :goto_1

    .line 15
    .line 16
    :cond_1
    instance-of v0, p0, Ljava/util/Map;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    check-cast p0, Ljava/util/Map;

    .line 21
    .line 22
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->forceDefaultAttrMap(Ljava/util/Map;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_2
    instance-of v0, p0, Ljava/lang/Iterable;

    .line 27
    .line 28
    const/16 v1, 0x50

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    check-cast p0, Ljava/lang/Iterable;

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_6

    .line 44
    .line 45
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    add-int/lit8 v3, p1, 0x1

    .line 50
    .line 51
    invoke-static {v0, v3}, Lcom/mr/elaris/HookEntry;->forceDefaultMsgDecorationValue(Ljava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    if-lt v2, v1, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_5

    .line 68
    .line 69
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    :goto_0
    if-ge v2, v0, :cond_6

    .line 78
    .line 79
    invoke-static {p0, v2}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    add-int/lit8 v3, p1, 0x1

    .line 84
    .line 85
    invoke-static {v1, v3}, Lcom/mr/elaris/HookEntry;->forceDefaultMsgDecorationValue(Ljava/lang/Object;I)V

    .line 86
    .line 87
    .line 88
    add-int/lit8 v2, v2, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_5
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->forceDefaultMsgAttributeInfo(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    add-int/lit8 p1, p1, 0x1

    .line 95
    .line 96
    const-string v0, "vasMsgInfo"

    .line 97
    .line 98
    invoke-static {p0, v0}, Lcom/mr/elaris/HookEntry;->getField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v0, p1}, Lcom/mr/elaris/HookEntry;->forceDefaultMsgDecorationValue(Ljava/lang/Object;I)V

    .line 103
    .line 104
    .line 105
    const-string v0, "vasMsgElement"

    .line 106
    .line 107
    invoke-static {p0, v0}, Lcom/mr/elaris/HookEntry;->getField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {v0, p1}, Lcom/mr/elaris/HookEntry;->forceDefaultMsgDecorationValue(Ljava/lang/Object;I)V

    .line 112
    .line 113
    .line 114
    const-string v0, "msgAttributeInfo"

    .line 115
    .line 116
    invoke-static {p0, v0}, Lcom/mr/elaris/HookEntry;->getField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-static {v0, p1}, Lcom/mr/elaris/HookEntry;->forceDefaultMsgDecorationValue(Ljava/lang/Object;I)V

    .line 121
    .line 122
    .line 123
    const-string v0, "avatarPendantInfo"

    .line 124
    .line 125
    invoke-static {p0, v0}, Lcom/mr/elaris/HookEntry;->getField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-static {p0, p1}, Lcom/mr/elaris/HookEntry;->forceDefaultMsgDecorationValue(Ljava/lang/Object;I)V

    .line 130
    .line 131
    .line 132
    :cond_6
    :goto_1
    return-void
.end method

.method public static bridge synthetic g(Landroid/app/Application;Ljava/lang/ClassLoader;Ly7;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/ClassLoader;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/mr/elaris/HookEntry;->prepareHostApplication(Landroid/app/Application;Ljava/lang/ClassLoader;Ly7;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/ClassLoader;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static getField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1, p1}, Lcom/mr/elaris/HookEntry;->findField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_1
    const/4 v1, 0x1

    .line 17
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    return-object p0

    .line 25
    :catchall_0
    return-object v0
.end method

.method public static getHostSourceDir()Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v0, v1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    :catchall_0
    :cond_0
    return-object v0
.end method

.method public static bridge synthetic h(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->stripOutgoingMsgDecorations(Ljava/util/ArrayList;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static handleHostPackage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V
    .locals 4

    .line 1
    const-string v0, "host hot update early entry failed: "

    .line 2
    .line 3
    const-string v1, "com.tencent.mobileqq"

    .line 4
    .line 5
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-eqz p2, :cond_1

    .line 12
    .line 13
    new-instance v1, Ly7;

    .line 14
    .line 15
    invoke-direct {v1, p0, p1}, Ly7;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance p1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v2, "@"

    .line 27
    .line 28
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v2, v1, Ly7;->a:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    sget-object v3, Lcom/mr/elaris/HookEntry;->LOAD_DISPATCHED:Ljava/util/Set;

    .line 41
    .line 42
    invoke-interface {v3, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_0

    .line 47
    .line 48
    const-string p0, "skip duplicated loader dispatch: "

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v3, "loaded in "

    .line 61
    .line 62
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string p0, ", process="

    .line 69
    .line 70
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :try_start_0
    invoke-static {p2, v2}, Lx7;->e(Ljava/lang/ClassLoader;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :catchall_0
    move-exception p0

    .line 88
    :try_start_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :goto_0
    const-class p0, Landroid/app/Instrumentation;

    .line 104
    .line 105
    const-string p1, "callApplicationOnCreate"

    .line 106
    .line 107
    new-instance v0, Lg7;

    .line 108
    .line 109
    invoke-direct {v0, p2, v1, v2}, Lg7;-><init>(Ljava/lang/ClassLoader;Ly7;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-static {p0, p1, v0}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Ljava/util/Set;

    .line 113
    .line 114
    .line 115
    const-class p0, Landroid/app/Application;

    .line 116
    .line 117
    const-string p1, "onCreate"

    .line 118
    .line 119
    new-instance v0, Lh7;

    .line 120
    .line 121
    invoke-direct {v0, p2, v1, v2}, Lh7;-><init>(Ljava/lang/ClassLoader;Ly7;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-static {p0, p1, v0}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Ljava/util/Set;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :catchall_1
    move-exception p0

    .line 129
    new-instance p1, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    const-string p2, "hook Application.onCreate failed: "

    .line 132
    .line 133
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :cond_1
    :goto_1
    return-void
.end method

.method private static hasDefaultMsgDecorations()Z
    .locals 2

    .line 1
    sget-object v0, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 2
    .line 3
    const-string v1, "default_bubble"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    const-string v1, "default_font"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    const-string v1, "block_avatar_pendant"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    return v0

    .line 30
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 31
    return v0
.end method

.method private static hasMsfProcessTargets()Z
    .locals 2

    .line 1
    sget-object v0, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 2
    .line 3
    const-string v1, "force_tablet_mode"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    const-string v1, "block_host_hot_update"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    const-string v1, "eq_message_guard"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    return v0

    .line 30
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 31
    return v0
.end method

.method private static hasOtherProcessTargets(Ljava/lang/String;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const-string v1, ":peak"

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    const-string v3, "block_host_hot_update"

    .line 13
    .line 14
    if-nez v1, :cond_5

    .line 15
    .line 16
    const-string v1, ":file"

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_5

    .line 23
    .line 24
    const-string v1, ":tool"

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const-string v1, "com.tencent.mobileqq:qqfav"

    .line 34
    .line 35
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_4

    .line 40
    .line 41
    sget-object p0, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 42
    .line 43
    invoke-virtual {p0, v3}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_3

    .line 48
    .line 49
    const-string v1, "external_browser"

    .line 50
    .line 51
    invoke-virtual {p0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_3

    .line 56
    .line 57
    const-string v1, "unblock_risk_web"

    .line 58
    .line 59
    invoke-virtual {p0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    return v0

    .line 67
    :cond_3
    :goto_0
    return v2

    .line 68
    :cond_4
    return v0

    .line 69
    :cond_5
    :goto_1
    sget-object p0, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 70
    .line 71
    invoke-virtual {p0, v3}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_7

    .line 76
    .line 77
    const-string v1, "media_click_to_load"

    .line 78
    .line 79
    invoke-virtual {p0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_7

    .line 84
    .line 85
    const-string v1, "legacy_group_file_layout"

    .line 86
    .line 87
    invoke-virtual {p0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_7

    .line 92
    .line 93
    const-string v1, "direct_download_write"

    .line 94
    .line 95
    invoke-virtual {p0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_7

    .line 100
    .line 101
    const-string v1, "rename_apk_file"

    .line 102
    .line 103
    invoke-virtual {p0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-nez v1, :cond_7

    .line 108
    .line 109
    const-string v1, "pic_summary_enabled"

    .line 110
    .line 111
    invoke-virtual {p0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-nez v1, :cond_7

    .line 116
    .line 117
    const-string v1, "original_image_default"

    .line 118
    .line 119
    invoke-virtual {p0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    if-eqz p0, :cond_6

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_6
    return v0

    .line 127
    :cond_7
    :goto_2
    return v2
.end method

.method private static hasToolProcessTargets()Z
    .locals 2

    .line 1
    sget-object v0, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 2
    .line 3
    const-string v1, "legacy_group_file_layout"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    const-string v1, "direct_download_write"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    const-string v1, "eq_web_kernel_fallback"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    const-string v1, "block_host_hot_update"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v0, 0x0

    .line 37
    return v0

    .line 38
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 39
    return v0
.end method

.method private static declared-synchronized hookDefaultMsgDecorations(Ljava/lang/ClassLoader;)V
    .locals 5

    .line 1
    const-string v0, "hookDefaultMsgDecorations failed: "

    .line 2
    .line 3
    const-string v1, "default msg decorations constructor hooked class="

    .line 4
    .line 5
    const-class v2, Lcom/mr/elaris/HookEntry;

    .line 6
    .line 7
    monitor-enter v2

    .line 8
    :try_start_0
    sget-boolean v3, Lcom/mr/elaris/HookEntry;->sDefaultDecorationsHooked:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    monitor-exit v2

    .line 13
    return-void

    .line 14
    :cond_0
    :try_start_1
    const-string v3, "com.tencent.mobileqq.aio.msg.AIOMsgItem"

    .line 15
    .line 16
    invoke-static {v3, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance v3, Li7;

    .line 21
    .line 22
    const/16 v4, 0x28

    .line 23
    .line 24
    invoke-direct {v3, v4}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v3}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookAllConstructors(Ljava/lang/Class;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-nez v4, :cond_1

    .line 38
    .line 39
    sget-object v4, Lcom/mr/elaris/HookEntry;->DEFAULT_DECORATION_UNHOOKS:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v4, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 42
    .line 43
    .line 44
    const/4 v4, 0x1

    .line 45
    sput-boolean v4, Lcom/mr/elaris/HookEntry;->sDefaultDecorationsHooked:Z

    .line 46
    .line 47
    new-instance v4, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string p0, " count="

    .line 60
    .line 61
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-interface {v3}, Ljava/util/Set;->size()I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :catchall_0
    move-exception p0

    .line 80
    goto :goto_0

    .line 81
    :cond_1
    const-string p0, "AIOMsgItem MsgRecord constructor not found"

    .line 82
    .line 83
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :goto_0
    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 100
    .line 101
    .line 102
    :goto_1
    monitor-exit v2

    .line 103
    return-void

    .line 104
    :catchall_1
    move-exception p0

    .line 105
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 106
    throw p0
.end method

.method private static declared-synchronized hookEmotionAsPic(Ljava/lang/ClassLoader;)V
    .locals 7

    .line 1
    const-class v0, Lcom/mr/elaris/HookEntry;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-boolean v1, Lcom/mr/elaris/HookEntry;->sEmotionAsPicInstalled:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_1
    const-string v1, "com.tencent.qqnt.aio.adapter.api.impl.RichMediaBrowserApiImpl"

    .line 11
    .line 12
    invoke-static {v1, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    array-length v1, p0

    .line 21
    const/4 v2, 0x0

    .line 22
    move v3, v2

    .line 23
    :goto_0
    if-ge v2, v1, :cond_2

    .line 24
    .line 25
    aget-object v4, p0, v2

    .line 26
    .line 27
    const-string v5, "checkIsFavPicAndShowPreview"

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    if-ne v5, v6, :cond_1

    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-nez v5, :cond_1

    .line 56
    .line 57
    new-instance v5, Lj7;

    .line 58
    .line 59
    const/16 v6, 0x3c

    .line 60
    .line 61
    invoke-direct {v5, v6}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-static {v4, v5}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 65
    .line 66
    .line 67
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    new-instance v5, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    const-string v6, "hooked emotion-as-pic: "

    .line 75
    .line 76
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-static {v4}, Lcom/mr/elaris/HookEntry;->methodSig(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-static {v4}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :catchall_0
    move-exception p0

    .line 95
    goto :goto_2

    .line 96
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    if-nez v3, :cond_3

    .line 100
    .line 101
    const-string p0, "emotion-as-pic method not found"

    .line 102
    .line 103
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :cond_3
    if-lez v3, :cond_4

    .line 107
    .line 108
    const/4 p0, 0x1

    .line 109
    sput-boolean p0, Lcom/mr/elaris/HookEntry;->sEmotionAsPicInstalled:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :goto_2
    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    .line 116
    .line 117
    const-string v2, "hookEmotionAsPic failed: "

    .line 118
    .line 119
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 130
    .line 131
    .line 132
    :cond_4
    :goto_3
    monitor-exit v0

    .line 133
    return-void

    .line 134
    :catchall_1
    move-exception p0

    .line 135
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 136
    throw p0
.end method

.method private static declared-synchronized hookPicSummarySendMsg(Ljava/lang/ClassLoader;)V
    .locals 12

    .line 1
    const-class v0, Lcom/mr/elaris/HookEntry;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-boolean v1, Lcom/mr/elaris/HookEntry;->sPicSummarySendHookInstalled:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_1
    const-string v1, "target.kernel.msg_service_classes"

    .line 11
    .line 12
    const-string v2, "com.tencent.qqnt.kernel.nativeinterface.IKernelMsgService$CppProxy"

    .line 13
    .line 14
    const-string v3, "com.tencent.qqnt.kernelpublic.nativeinterface.IKernelMsgService$CppProxy"

    .line 15
    .line 16
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {v1, v2, p0}, Lt2;->f(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/ClassLoader;)[Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/4 v2, 0x0

    .line 25
    move v3, v2

    .line 26
    move v4, v3

    .line 27
    :goto_0
    array-length v5, v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 28
    if-ge v3, v5, :cond_3

    .line 29
    .line 30
    :try_start_2
    aget-object v5, v1, v3

    .line 31
    .line 32
    invoke-static {v5, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    const-string v6, "target.kernel.msg_service_classes"

    .line 37
    .line 38
    invoke-static {v6, v5}, Lcom/mr/elaris/HookEntry;->cacheClassList(Ljava/lang/String;Ljava/lang/Class;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    array-length v6, v5

    .line 46
    move v7, v2

    .line 47
    :goto_1
    if-ge v7, v6, :cond_2

    .line 48
    .line 49
    aget-object v8, v5, v7

    .line 50
    .line 51
    const-class v9, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-static {v8, v9}, Lv4;->m(Ljava/lang/reflect/Method;Ljava/lang/Class;)I

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    const-string v10, "sendMsg"

    .line 58
    .line 59
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v11

    .line 63
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    if-eqz v10, :cond_1

    .line 68
    .line 69
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 70
    .line 71
    .line 72
    move-result v10

    .line 73
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 74
    .line 75
    .line 76
    move-result v10

    .line 77
    if-nez v10, :cond_1

    .line 78
    .line 79
    new-instance v10, Lcom/mr/elaris/d;

    .line 80
    .line 81
    invoke-direct {v10, v9}, Lcom/mr/elaris/d;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-static {v8, v10}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 85
    .line 86
    .line 87
    add-int/lit8 v4, v4, 0x1

    .line 88
    .line 89
    new-instance v9, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    const-string v10, "hooked pic summary sendMsg wide: "

    .line 95
    .line 96
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-static {v8}, Lcom/mr/elaris/HookEntry;->methodSig(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    invoke-static {v8}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 111
    .line 112
    .line 113
    :cond_1
    add-int/lit8 v7, v7, 0x1

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :catchall_0
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_3
    if-lez v4, :cond_4

    .line 120
    .line 121
    const/4 p0, 0x1

    .line 122
    :try_start_3
    sput-boolean p0, Lcom/mr/elaris/HookEntry;->sPicSummarySendHookInstalled:Z

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :catchall_1
    move-exception p0

    .line 126
    goto :goto_3

    .line 127
    :cond_4
    const-string p0, "pic summary sendMsg target not found"

    .line 128
    .line 129
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 130
    .line 131
    .line 132
    :goto_2
    monitor-exit v0

    .line 133
    return-void

    .line 134
    :goto_3
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 135
    throw p0
.end method

.method private static hookQQSettingEntry(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/QQSettingsEntryHooks;->hookProviderEntry(Ljava/lang/ClassLoader;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static declared-synchronized hookQQShowInAio(Ljava/lang/ClassLoader;)V
    .locals 8

    .line 1
    const-class v0, Lcom/mr/elaris/HookEntry;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-boolean v1, Lcom/mr/elaris/HookEntry;->sQQShowInAioInstalled:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v1, 0x1

    .line 11
    :try_start_1
    sput-boolean v1, Lcom/mr/elaris/HookEntry;->sQQShowInAioInstalled:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 12
    .line 13
    :try_start_2
    const-string v1, "mobile.api"

    .line 14
    .line 15
    const-string v2, "SwitchApiImpl"

    .line 16
    .line 17
    invoke-static {v1, v2}, Lrb;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    array-length v2, v1

    .line 30
    const/4 v3, 0x0

    .line 31
    move v4, v3

    .line 32
    :goto_0
    if-ge v3, v2, :cond_2

    .line 33
    .line 34
    aget-object v5, v1, v3

    .line 35
    .line 36
    const-string v6, "isQQShowEnableForAIO"

    .line 37
    .line 38
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-eqz v6, :cond_1

    .line 47
    .line 48
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 53
    .line 54
    if-ne v6, v7, :cond_1

    .line 55
    .line 56
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-nez v6, :cond_1

    .line 65
    .line 66
    new-instance v6, Lk7;

    .line 67
    .line 68
    const/16 v7, 0x3c

    .line 69
    .line 70
    invoke-direct {v6, v7}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 71
    .line 72
    .line 73
    invoke-static {v5, v6}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 74
    .line 75
    .line 76
    add-int/lit8 v4, v4, 0x1

    .line 77
    .line 78
    new-instance v6, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v7, "hooked QQShow in AIO runtime gate: "

    .line 84
    .line 85
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-static {v5}, Lcom/mr/elaris/HookEntry;->methodSig(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-static {v5}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :catchall_0
    move-exception v1

    .line 104
    goto :goto_2

    .line 105
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_2
    if-nez v4, :cond_3

    .line 109
    .line 110
    const-string v1, "isQQShowEnableForAIO not found"

    .line 111
    .line 112
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :goto_2
    :try_start_3
    new-instance v2, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    const-string v3, "hookQQShowInAio failed: "

    .line 122
    .line 123
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    :cond_3
    :goto_3
    invoke-static {p0}, Lv4;->x(Ljava/lang/ClassLoader;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 137
    .line 138
    .line 139
    monitor-exit v0

    .line 140
    return-void

    .line 141
    :catchall_1
    move-exception p0

    .line 142
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 143
    throw p0
.end method

.method public static hostContext()Landroid/content/Context;
    .locals 1

    .line 1
    sget-object v0, La8;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/content/Context;

    .line 12
    .line 13
    return-object v0
.end method

.method public static hostVersionSummary()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, La8;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static hotReloadGeneration()I
    .locals 2

    .line 1
    sget-object v0, La8;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    :try_start_0
    const-string v0, "com.mr.elaris.hot_reload_generation"

    .line 4
    .line 5
    const-string v1, "0"

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    return v0

    .line 16
    :catchall_0
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method public static declared-synchronized installHooks(Ljava/lang/ClassLoader;Ljava/lang/String;ZZZZZ)V
    .locals 6

    .line 1
    const-string v0, "hook install complete process="

    .line 2
    .line 3
    const-string v1, "hook install complete process="

    .line 4
    .line 5
    const-class v2, Lcom/mr/elaris/HookEntry;

    .line 6
    .line 7
    monitor-enter v2

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz p2, :cond_7

    .line 11
    .line 12
    :try_start_0
    sget-boolean p2, Lm7;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    monitor-exit v2

    .line 17
    return-void

    .line 18
    :cond_0
    :try_start_1
    sput-boolean v3, Lm7;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .line 19
    .line 20
    :try_start_2
    sget-object p2, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 21
    .line 22
    const-string p3, "force_tablet_mode"

    .line 23
    .line 24
    invoke-virtual {p2, p3}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    if-eqz p3, :cond_1

    .line 29
    .line 30
    const-string p3, "tablet mode main process skipped; MSF-only for setting entry stability"

    .line 31
    .line 32
    invoke-static {p3}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto/16 :goto_9

    .line 38
    .line 39
    :cond_1
    :goto_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 40
    .line 41
    .line 42
    move-result-wide p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    :try_start_3
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->hookQQSettingEntry(Ljava/lang/ClassLoader;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 44
    .line 45
    .line 46
    :try_start_4
    const-string p5, "settings_entry"

    .line 47
    .line 48
    invoke-static {p5, p3, p4}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 49
    .line 50
    .line 51
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 52
    .line 53
    .line 54
    move-result-wide p3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 55
    :try_start_5
    invoke-static {p0, p1}, Lcom/mr/elaris/HookEntry;->installMainImmediateSafeHooks(Ljava/lang/ClassLoader;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 56
    .line 57
    .line 58
    :try_start_6
    const-string p5, "main_immediate_total"

    .line 59
    .line 60
    invoke-static {p5, p3, p4}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 61
    .line 62
    .line 63
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 64
    .line 65
    .line 66
    move-result-wide p3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 67
    :try_start_7
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->installMainProfileHooksAsync(Ljava/lang/ClassLoader;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 68
    .line 69
    .line 70
    :try_start_8
    const-string p5, "profile_worker_schedule"

    .line 71
    .line 72
    invoke-static {p5, p3, p4}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 73
    .line 74
    .line 75
    const-string p3, "eq_home_pull_guard"

    .line 76
    .line 77
    invoke-virtual {p2, p3}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result p3

    .line 81
    if-eqz p3, :cond_2

    .line 82
    .line 83
    invoke-static {}, Lcom/mr/elaris/HookEntry;->getHostSourceDir()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p3

    .line 87
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 88
    .line 89
    .line 90
    move-result-wide p4

    .line 91
    const-string p6, "Elaris-home-pull-hooks"

    .line 92
    .line 93
    new-instance v5, Ll7;

    .line 94
    .line 95
    invoke-direct {v5, v4, p0, p3}, Ll7;-><init>(ILjava/lang/ClassLoader;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-static {p6, v5}, Lo7;->a(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 99
    .line 100
    .line 101
    const-string p3, "home_pull_guard_schedule"

    .line 102
    .line 103
    invoke-static {p3, p4, p5}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 104
    .line 105
    .line 106
    :cond_2
    const-string p3, "enable_auto_clock_in"

    .line 107
    .line 108
    invoke-virtual {p2, p3}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 109
    .line 110
    .line 111
    move-result p3

    .line 112
    if-eqz p3, :cond_4

    .line 113
    .line 114
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 115
    .line 116
    .line 117
    move-result-wide p3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 118
    if-eqz p0, :cond_3

    .line 119
    .line 120
    :try_start_9
    sput-object p0, La7;->c:Ljava/lang/ClassLoader;

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :catchall_1
    move-exception p0

    .line 124
    goto :goto_2

    .line 125
    :cond_3
    :goto_1
    invoke-static {}, La7;->z()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 126
    .line 127
    .line 128
    :try_start_a
    const-string p5, "group_clock_in"

    .line 129
    .line 130
    invoke-static {p5, p3, p4}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 131
    .line 132
    .line 133
    goto :goto_3

    .line 134
    :goto_2
    const-string p2, "group_clock_in"

    .line 135
    .line 136
    invoke-static {p2, p3, p4}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 137
    .line 138
    .line 139
    throw p0

    .line 140
    :cond_4
    :goto_3
    const-string p3, "keep_fire_enabled"

    .line 141
    .line 142
    invoke-virtual {p2, p3}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    if-eqz p2, :cond_16

    .line 147
    .line 148
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 149
    .line 150
    .line 151
    move-result-wide p2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 152
    if-eqz p0, :cond_5

    .line 153
    .line 154
    :try_start_b
    sput-object p0, Lcom/mr/elaris/f;->c:Ljava/lang/ClassLoader;

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :catchall_2
    move-exception p0

    .line 158
    goto :goto_5

    .line 159
    :cond_5
    sget-object p0, Lcom/mr/elaris/f;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 160
    .line 161
    :goto_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 162
    .line 163
    .line 164
    move-result-wide p4

    .line 165
    const-wide/32 v4, 0xea60

    .line 166
    .line 167
    .line 168
    add-long/2addr p4, v4

    .line 169
    sget-wide v4, Lcom/mr/elaris/f;->h:J

    .line 170
    .line 171
    cmp-long p0, p4, v4

    .line 172
    .line 173
    if-lez p0, :cond_6

    .line 174
    .line 175
    sput-wide p4, Lcom/mr/elaris/f;->h:J

    .line 176
    .line 177
    :cond_6
    invoke-static {}, Lcom/mr/elaris/f;->u()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 178
    .line 179
    .line 180
    :try_start_c
    const-string p0, "keep_fire"

    .line 181
    .line 182
    invoke-static {p0, p2, p3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 183
    .line 184
    .line 185
    goto/16 :goto_8

    .line 186
    .line 187
    :goto_5
    const-string p4, "keep_fire"

    .line 188
    .line 189
    invoke-static {p4, p2, p3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 190
    .line 191
    .line 192
    throw p0

    .line 193
    :catchall_3
    move-exception p0

    .line 194
    const-string p2, "profile_worker_schedule"

    .line 195
    .line 196
    invoke-static {p2, p3, p4}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 197
    .line 198
    .line 199
    throw p0

    .line 200
    :catchall_4
    move-exception p0

    .line 201
    const-string p2, "main_immediate_total"

    .line 202
    .line 203
    invoke-static {p2, p3, p4}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 204
    .line 205
    .line 206
    throw p0

    .line 207
    :catchall_5
    move-exception p0

    .line 208
    const-string p2, "settings_entry"

    .line 209
    .line 210
    invoke-static {p2, p3, p4}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 211
    .line 212
    .line 213
    throw p0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 214
    :goto_6
    move v3, v4

    .line 215
    goto/16 :goto_9

    .line 216
    .line 217
    :cond_7
    if-eqz p3, :cond_b

    .line 218
    .line 219
    :try_start_d
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hasMsfProcessTargets()Z

    .line 220
    .line 221
    .line 222
    move-result p2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 223
    if-nez p2, :cond_8

    .line 224
    .line 225
    monitor-exit v2

    .line 226
    return-void

    .line 227
    :cond_8
    :try_start_e
    sget-boolean p2, Lm7;->b:Z
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 228
    .line 229
    if-eqz p2, :cond_9

    .line 230
    .line 231
    monitor-exit v2

    .line 232
    return-void

    .line 233
    :cond_9
    :try_start_f
    sput-boolean v3, Lm7;->b:Z
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 234
    .line 235
    :try_start_10
    sget-object p2, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 236
    .line 237
    const-string p3, "force_tablet_mode"

    .line 238
    .line 239
    invoke-virtual {p2, p3}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 240
    .line 241
    .line 242
    move-result p2

    .line 243
    if-eqz p2, :cond_a

    .line 244
    .line 245
    invoke-static {p0}, Lh;->c(Ljava/lang/ClassLoader;)V

    .line 246
    .line 247
    .line 248
    :cond_a
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->installMsfProcessHooks(Ljava/lang/ClassLoader;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 249
    .line 250
    .line 251
    goto :goto_8

    .line 252
    :catchall_6
    move-exception p0

    .line 253
    goto :goto_6

    .line 254
    :cond_b
    if-eqz p4, :cond_e

    .line 255
    .line 256
    :try_start_11
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hasToolProcessTargets()Z

    .line 257
    .line 258
    .line 259
    move-result p2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_6

    .line 260
    if-nez p2, :cond_c

    .line 261
    .line 262
    monitor-exit v2

    .line 263
    return-void

    .line 264
    :cond_c
    :try_start_12
    sget-boolean p2, Lm7;->d:Z
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    .line 265
    .line 266
    if-eqz p2, :cond_d

    .line 267
    .line 268
    monitor-exit v2

    .line 269
    return-void

    .line 270
    :cond_d
    :try_start_13
    sput-boolean v3, Lm7;->d:Z
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    .line 271
    .line 272
    :try_start_14
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->installToolProcessHooks(Ljava/lang/ClassLoader;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_0

    .line 273
    .line 274
    .line 275
    goto :goto_8

    .line 276
    :cond_e
    if-eqz p5, :cond_11

    .line 277
    .line 278
    :try_start_15
    sget-object p2, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 279
    .line 280
    const-string p3, "eq_qr_confirm_fast"

    .line 281
    .line 282
    invoke-virtual {p2, p3}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 283
    .line 284
    .line 285
    move-result p2
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_6

    .line 286
    if-nez p2, :cond_f

    .line 287
    .line 288
    monitor-exit v2

    .line 289
    return-void

    .line 290
    :cond_f
    :try_start_16
    sget-boolean p2, Lm7;->c:Z
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_6

    .line 291
    .line 292
    if-eqz p2, :cond_10

    .line 293
    .line 294
    monitor-exit v2

    .line 295
    return-void

    .line 296
    :cond_10
    :try_start_17
    sput-boolean v3, Lm7;->c:Z
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_6

    .line 297
    .line 298
    :try_start_18
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->installOpenSdkProcessHooks(Ljava/lang/ClassLoader;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_0

    .line 299
    .line 300
    .line 301
    goto :goto_8

    .line 302
    :cond_11
    if-eqz p6, :cond_18

    .line 303
    .line 304
    :try_start_19
    invoke-static {p1}, Lcom/mr/elaris/HookEntry;->hasOtherProcessTargets(Ljava/lang/String;)Z

    .line 305
    .line 306
    .line 307
    move-result p2
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_6

    .line 308
    if-nez p2, :cond_12

    .line 309
    .line 310
    monitor-exit v2

    .line 311
    return-void

    .line 312
    :cond_12
    :try_start_1a
    const-string p2, "com.tencent.mobileqq"

    .line 313
    .line 314
    sget-object p3, Lm7;->e:Ljava/util/Set;

    .line 315
    .line 316
    if-eqz p1, :cond_14

    .line 317
    .line 318
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 319
    .line 320
    .line 321
    move-result p4

    .line 322
    if-nez p4, :cond_13

    .line 323
    .line 324
    goto :goto_7

    .line 325
    :cond_13
    move-object p2, p1

    .line 326
    :cond_14
    :goto_7
    invoke-interface {p3, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result p2
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_6

    .line 330
    if-nez p2, :cond_15

    .line 331
    .line 332
    monitor-exit v2

    .line 333
    return-void

    .line 334
    :cond_15
    :try_start_1b
    invoke-static {p0, p1}, Lcom/mr/elaris/HookEntry;->installOtherProcessHooks(Ljava/lang/ClassLoader;Ljava/lang/String;)V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_0

    .line 335
    .line 336
    .line 337
    :cond_16
    :goto_8
    :try_start_1c
    new-instance p0, Ljava/lang/StringBuilder;

    .line 338
    .line 339
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object p0

    .line 349
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_7

    .line 350
    .line 351
    .line 352
    goto :goto_b

    .line 353
    :catchall_7
    move-exception p0

    .line 354
    goto :goto_a

    .line 355
    :goto_9
    :try_start_1d
    throw p0
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_8

    .line 356
    :catchall_8
    move-exception p0

    .line 357
    if-eqz v3, :cond_17

    .line 358
    .line 359
    :try_start_1e
    new-instance p2, Ljava/lang/StringBuilder;

    .line 360
    .line 361
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object p1

    .line 371
    invoke-static {p1}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    :cond_17
    throw p0

    .line 375
    :goto_a
    monitor-exit v2
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_7

    .line 376
    throw p0

    .line 377
    :cond_18
    :goto_b
    monitor-exit v2

    .line 378
    return-void
.end method

.method private static installMainImmediateSafeHooks(Ljava/lang/ClassLoader;Ljava/lang/String;)V
    .locals 61

    .line 1
    const-string v1, "original_image_panel"

    .line 2
    .line 3
    const-string v2, "qq_show"

    .line 4
    .line 5
    const-string v3, "flash_pic"

    .line 6
    .line 7
    const-string v4, "media_click_load"

    .line 8
    .line 9
    const-string v5, "download_redirect"

    .line 10
    .line 11
    const-string v6, "apk_file_name"

    .line 12
    .line 13
    const-string v7, "official_center_time"

    .line 14
    .line 15
    const-string v8, "message_status_time"

    .line 16
    .line 17
    const-string v9, "unread_full_count"

    .line 18
    .line 19
    const-string v10, "message_decorations"

    .line 20
    .line 21
    const-string v11, "message_repeater_total"

    .line 22
    .line 23
    const-string v12, "qr_confirm_fast"

    .line 24
    .line 25
    const-string v13, "qr_gallery_gate"

    .line 26
    .line 27
    const-string v14, "anti_recall"

    .line 28
    .line 29
    const-string v15, "pic_summary"

    .line 30
    .line 31
    move-object/from16 v16, v12

    .line 32
    .line 33
    const-string v12, "aio_input_bar_cleanup"

    .line 34
    .line 35
    move-object/from16 v17, v13

    .line 36
    .line 37
    const-string v13, "favorite_emoticon_batch"

    .line 38
    .line 39
    move-object/from16 v18, v14

    .line 40
    .line 41
    const-string v14, "emoji_panel_cleanup"

    .line 42
    .line 43
    move-object/from16 v19, v15

    .line 44
    .line 45
    const-string v15, "host_hot_update"

    .line 46
    .line 47
    move-object/from16 v20, v1

    .line 48
    .line 49
    const-string v1, "annoying_popups"

    .line 50
    .line 51
    move-object/from16 v21, v3

    .line 52
    .line 53
    const-string v3, "notice_gate"

    .line 54
    .line 55
    move-object/from16 v22, v12

    .line 56
    .line 57
    const-string v12, "web_redirect"

    .line 58
    .line 59
    move-object/from16 v23, v13

    .line 60
    .line 61
    const-string v13, "chat_right_swipe"

    .line 62
    .line 63
    move-object/from16 v24, v14

    .line 64
    .line 65
    const-string v14, "reply_no_auto_at"

    .line 66
    .line 67
    move-object/from16 v25, v4

    .line 68
    .line 69
    const-string v4, "group_avatar_menu"

    .line 70
    .line 71
    move-object/from16 v26, v2

    .line 72
    .line 73
    const-string v2, "safe QR confirm fast-path hook failed: "

    .line 74
    .line 75
    move-object/from16 v27, v2

    .line 76
    .line 77
    const-string v2, "safe QR gallery gate hook failed: "

    .line 78
    .line 79
    move-object/from16 v28, v2

    .line 80
    .line 81
    const-string v2, "safe anti-recall hook failed: "

    .line 82
    .line 83
    move-object/from16 v29, v2

    .line 84
    .line 85
    const-string v2, "safe pic summary hook failed: "

    .line 86
    .line 87
    move-object/from16 v30, v2

    .line 88
    .line 89
    const-string v2, "safe flash pic hook failed: "

    .line 90
    .line 91
    move-object/from16 v31, v2

    .line 92
    .line 93
    const-string v2, "safe album video bubble hook failed: "

    .line 94
    .line 95
    move-object/from16 v32, v2

    .line 96
    .line 97
    const-string v2, "safe aio input bar cleanup hook failed: "

    .line 98
    .line 99
    move-object/from16 v33, v2

    .line 100
    .line 101
    const-string v2, "safe voice message action hook failed: "

    .line 102
    .line 103
    move-object/from16 v34, v2

    .line 104
    .line 105
    const-string v2, "safe cloud sticker panel hook failed: "

    .line 106
    .line 107
    move-object/from16 v35, v2

    .line 108
    .line 109
    const-string v2, "safe favorite emoticon batch hook failed: "

    .line 110
    .line 111
    move-object/from16 v36, v2

    .line 112
    .line 113
    const-string v2, "safe emoji panel cleanup hook failed: "

    .line 114
    .line 115
    move-object/from16 v37, v2

    .line 116
    .line 117
    const-string v2, "safe media click-load hook failed: "

    .line 118
    .line 119
    move-object/from16 v38, v2

    .line 120
    .line 121
    const-string v2, "safe emotion-as-pic hook failed: "

    .line 122
    .line 123
    move-object/from16 v39, v2

    .line 124
    .line 125
    const-string v2, "safe host hot update hooks failed: "

    .line 126
    .line 127
    move-object/from16 v40, v2

    .line 128
    .line 129
    const-string v2, "safe annoying popup hooks failed: "

    .line 130
    .line 131
    move-object/from16 v41, v15

    .line 132
    .line 133
    const-string v15, "safe download direct write hook failed: "

    .line 134
    .line 135
    move-object/from16 v42, v2

    .line 136
    .line 137
    const-string v2, "safe legacy group file layout hook failed: "

    .line 138
    .line 139
    move-object/from16 v43, v1

    .line 140
    .line 141
    const-string v1, "safe apk file name hooks failed: "

    .line 142
    .line 143
    move-object/from16 v44, v15

    .line 144
    .line 145
    const-string v15, "safe notice gate hooks failed: "

    .line 146
    .line 147
    move-object/from16 v45, v5

    .line 148
    .line 149
    const-string v5, "safe web redirect hooks failed: "

    .line 150
    .line 151
    move-object/from16 v46, v2

    .line 152
    .line 153
    const-string v2, "safe self message left-side hook failed: "

    .line 154
    .line 155
    move-object/from16 v47, v1

    .line 156
    .line 157
    const-string v1, "safe hide official center time hook failed: "

    .line 158
    .line 159
    move-object/from16 v48, v6

    .line 160
    .line 161
    const-string v6, "safe chat message corner time hook failed: "

    .line 162
    .line 163
    move-object/from16 v49, v15

    .line 164
    .line 165
    const-string v15, "safe unread hooks failed: "

    .line 166
    .line 167
    move-object/from16 v50, v3

    .line 168
    .line 169
    const-string v3, "safe chat right-swipe hooks failed: "

    .line 170
    .line 171
    move-object/from16 v51, v5

    .line 172
    .line 173
    const-string v5, "safe reply no-at hooks failed: "

    .line 174
    .line 175
    move-object/from16 v52, v12

    .line 176
    .line 177
    const-string v12, "safe default message decoration cleanup failed: "

    .line 178
    .line 179
    move-object/from16 v53, v2

    .line 180
    .line 181
    const-string v2, "safe repeater hook failed: "

    .line 182
    .line 183
    move-object/from16 v54, v1

    .line 184
    .line 185
    const-string v1, "safe group avatar menu hook failed: "

    .line 186
    .line 187
    move-object/from16 v55, v7

    .line 188
    .line 189
    new-instance v7, Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 192
    .line 193
    .line 194
    move-object/from16 v56, v6

    .line 195
    .line 196
    sget-object v6, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 197
    .line 198
    const-string v0, "group_admin_avatar_menu"

    .line 199
    .line 200
    invoke-virtual {v6, v0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    move-object/from16 v57, v8

    .line 205
    .line 206
    if-eqz v0, :cond_0

    .line 207
    .line 208
    move-object/from16 v58, v9

    .line 209
    .line 210
    const/16 v59, 0x1

    .line 211
    .line 212
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 213
    .line 214
    .line 215
    move-result-wide v8

    .line 216
    :try_start_0
    invoke-static/range {v59 .. v59}, Ls6;->D0(Z)V

    .line 217
    .line 218
    .line 219
    invoke-static/range {p0 .. p0}, Ls6;->I(Ljava/lang/ClassLoader;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 223
    .line 224
    .line 225
    invoke-static {v4, v8, v9}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 226
    .line 227
    .line 228
    move-object/from16 v60, v15

    .line 229
    .line 230
    goto :goto_0

    .line 231
    :catchall_0
    move-exception v0

    .line 232
    move-object/from16 v60, v15

    .line 233
    .line 234
    :try_start_1
    new-instance v15, Ljava/lang/StringBuilder;

    .line 235
    .line 236
    invoke-direct {v15, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 247
    .line 248
    .line 249
    invoke-static {v4, v8, v9}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 250
    .line 251
    .line 252
    goto :goto_0

    .line 253
    :catchall_1
    move-exception v0

    .line 254
    invoke-static {v4, v8, v9}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 255
    .line 256
    .line 257
    throw v0

    .line 258
    :cond_0
    move-object/from16 v58, v9

    .line 259
    .line 260
    move-object/from16 v60, v15

    .line 261
    .line 262
    const/16 v59, 0x1

    .line 263
    .line 264
    const/4 v0, 0x0

    .line 265
    invoke-static {v0}, Ls6;->D0(Z)V

    .line 266
    .line 267
    .line 268
    :goto_0
    const-string v0, "message_repeater"

    .line 269
    .line 270
    invoke-virtual {v6, v0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    if-nez v1, :cond_1

    .line 275
    .line 276
    const-string v1, "message_repeater_long_press_menu"

    .line 277
    .line 278
    invoke-virtual {v6, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    if-eqz v1, :cond_2

    .line 283
    .line 284
    :cond_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 285
    .line 286
    .line 287
    move-result-wide v8

    .line 288
    :try_start_2
    invoke-static/range {p0 .. p0}, Lcom/mr/elaris/HookEntry;->maybeInstallMessageRepeater(Ljava/lang/ClassLoader;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 292
    .line 293
    .line 294
    :goto_1
    invoke-static {v11, v8, v9}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 295
    .line 296
    .line 297
    goto :goto_2

    .line 298
    :catchall_2
    move-exception v0

    .line 299
    :try_start_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 300
    .line 301
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_47

    .line 312
    .line 313
    .line 314
    goto :goto_1

    .line 315
    :cond_2
    :goto_2
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hasDefaultMsgDecorations()Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    if-eqz v0, :cond_3

    .line 320
    .line 321
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 322
    .line 323
    .line 324
    move-result-wide v1

    .line 325
    :try_start_4
    invoke-static/range {p0 .. p0}, Lcom/mr/elaris/HookEntry;->hookDefaultMsgDecorations(Ljava/lang/ClassLoader;)V

    .line 326
    .line 327
    .line 328
    const-string v0, "default_msg_decorations"

    .line 329
    .line 330
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 331
    .line 332
    .line 333
    :goto_3
    invoke-static {v10, v1, v2}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 334
    .line 335
    .line 336
    goto :goto_4

    .line 337
    :catchall_3
    move-exception v0

    .line 338
    :try_start_5
    new-instance v4, Ljava/lang/StringBuilder;

    .line 339
    .line 340
    invoke-direct {v4, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 351
    .line 352
    .line 353
    goto :goto_3

    .line 354
    :catchall_4
    move-exception v0

    .line 355
    invoke-static {v10, v1, v2}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 356
    .line 357
    .line 358
    throw v0

    .line 359
    :cond_3
    :goto_4
    const-string v0, "disable_reply_auto_at"

    .line 360
    .line 361
    invoke-virtual {v6, v0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    if-eqz v0, :cond_4

    .line 366
    .line 367
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 368
    .line 369
    .line 370
    move-result-wide v1

    .line 371
    :try_start_6
    invoke-static/range {p0 .. p0}, Lv4;->y(Ljava/lang/ClassLoader;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 375
    .line 376
    .line 377
    :goto_5
    invoke-static {v14, v1, v2}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 378
    .line 379
    .line 380
    goto :goto_6

    .line 381
    :catchall_5
    move-exception v0

    .line 382
    :try_start_7
    new-instance v4, Ljava/lang/StringBuilder;

    .line 383
    .line 384
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 395
    .line 396
    .line 397
    goto :goto_5

    .line 398
    :catchall_6
    move-exception v0

    .line 399
    invoke-static {v14, v1, v2}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 400
    .line 401
    .line 402
    throw v0

    .line 403
    :cond_4
    :goto_6
    const-string v0, "eq_chat_edge_guard"

    .line 404
    .line 405
    invoke-virtual {v6, v0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 406
    .line 407
    .line 408
    move-result v0

    .line 409
    if-eqz v0, :cond_5

    .line 410
    .line 411
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 412
    .line 413
    .line 414
    move-result-wide v1

    .line 415
    :try_start_8
    invoke-static/range {p0 .. p0}, Lv4;->v(Ljava/lang/ClassLoader;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 419
    .line 420
    .line 421
    :goto_7
    invoke-static {v13, v1, v2}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 422
    .line 423
    .line 424
    goto :goto_8

    .line 425
    :catchall_7
    move-exception v0

    .line 426
    :try_start_9
    new-instance v4, Ljava/lang/StringBuilder;

    .line 427
    .line 428
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 439
    .line 440
    .line 441
    goto :goto_7

    .line 442
    :catchall_8
    move-exception v0

    .line 443
    invoke-static {v13, v1, v2}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 444
    .line 445
    .line 446
    throw v0

    .line 447
    :cond_5
    :goto_8
    const-string v0, "eq_unread_full_count"

    .line 448
    .line 449
    invoke-virtual {v6, v0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    if-eqz v0, :cond_6

    .line 454
    .line 455
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 456
    .line 457
    .line 458
    move-result-wide v1

    .line 459
    :try_start_a
    invoke-static/range {p0 .. p0}, Lv4;->A(Ljava/lang/ClassLoader;)V

    .line 460
    .line 461
    .line 462
    const-string v0, "unread_full_count_early"

    .line 463
    .line 464
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    .line 465
    .line 466
    .line 467
    move-object/from16 v3, v58

    .line 468
    .line 469
    :goto_9
    invoke-static {v3, v1, v2}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 470
    .line 471
    .line 472
    goto :goto_a

    .line 473
    :catchall_9
    move-exception v0

    .line 474
    move-object/from16 v3, v58

    .line 475
    .line 476
    :try_start_b
    new-instance v4, Ljava/lang/StringBuilder;

    .line 477
    .line 478
    move-object/from16 v5, v60

    .line 479
    .line 480
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    .line 491
    .line 492
    .line 493
    goto :goto_9

    .line 494
    :catchall_a
    move-exception v0

    .line 495
    invoke-static {v3, v1, v2}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 496
    .line 497
    .line 498
    throw v0

    .line 499
    :cond_6
    :goto_a
    const-string v0, "chat_message_corner_time"

    .line 500
    .line 501
    invoke-virtual {v6, v0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 502
    .line 503
    .line 504
    move-result v1

    .line 505
    if-eqz v1, :cond_7

    .line 506
    .line 507
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 508
    .line 509
    .line 510
    move-result-wide v1

    .line 511
    :try_start_c
    invoke-static/range {p0 .. p0}, Lr0;->j(Ljava/lang/ClassLoader;)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_b

    .line 515
    .line 516
    .line 517
    move-object/from16 v3, v57

    .line 518
    .line 519
    :goto_b
    invoke-static {v3, v1, v2}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 520
    .line 521
    .line 522
    goto :goto_c

    .line 523
    :catchall_b
    move-exception v0

    .line 524
    move-object/from16 v3, v57

    .line 525
    .line 526
    :try_start_d
    new-instance v4, Ljava/lang/StringBuilder;

    .line 527
    .line 528
    move-object/from16 v5, v56

    .line 529
    .line 530
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_c

    .line 541
    .line 542
    .line 543
    goto :goto_b

    .line 544
    :catchall_c
    move-exception v0

    .line 545
    invoke-static {v3, v1, v2}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 546
    .line 547
    .line 548
    throw v0

    .line 549
    :cond_7
    :goto_c
    const-string v0, "hide_official_center_time"

    .line 550
    .line 551
    invoke-virtual {v6, v0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 552
    .line 553
    .line 554
    move-result v1

    .line 555
    if-eqz v1, :cond_8

    .line 556
    .line 557
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 558
    .line 559
    .line 560
    move-result-wide v1

    .line 561
    :try_start_e
    invoke-static/range {p0 .. p0}, Ld7;->b(Ljava/lang/ClassLoader;)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_d

    .line 565
    .line 566
    .line 567
    move-object/from16 v3, v55

    .line 568
    .line 569
    :goto_d
    invoke-static {v3, v1, v2}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 570
    .line 571
    .line 572
    goto :goto_e

    .line 573
    :catchall_d
    move-exception v0

    .line 574
    move-object/from16 v3, v55

    .line 575
    .line 576
    :try_start_f
    new-instance v4, Ljava/lang/StringBuilder;

    .line 577
    .line 578
    move-object/from16 v5, v54

    .line 579
    .line 580
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_e

    .line 591
    .line 592
    .line 593
    goto :goto_d

    .line 594
    :catchall_e
    move-exception v0

    .line 595
    invoke-static {v3, v1, v2}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 596
    .line 597
    .line 598
    throw v0

    .line 599
    :cond_8
    :goto_e
    const-string v1, "self_message_left_side"

    .line 600
    .line 601
    invoke-virtual {v6, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 602
    .line 603
    .line 604
    move-result v0

    .line 605
    if-eqz v0, :cond_9

    .line 606
    .line 607
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 608
    .line 609
    .line 610
    move-result-wide v2

    .line 611
    :try_start_10
    invoke-static/range {p0 .. p0}, Lvc;->h(Ljava/lang/ClassLoader;)V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_f

    .line 615
    .line 616
    .line 617
    :goto_f
    invoke-static {v1, v2, v3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 618
    .line 619
    .line 620
    goto :goto_10

    .line 621
    :catchall_f
    move-exception v0

    .line 622
    :try_start_11
    new-instance v4, Ljava/lang/StringBuilder;

    .line 623
    .line 624
    move-object/from16 v5, v53

    .line 625
    .line 626
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_10

    .line 637
    .line 638
    .line 639
    goto :goto_f

    .line 640
    :catchall_10
    move-exception v0

    .line 641
    invoke-static {v1, v2, v3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 642
    .line 643
    .line 644
    throw v0

    .line 645
    :cond_9
    :goto_10
    const-string v0, "external_browser"

    .line 646
    .line 647
    invoke-virtual {v6, v0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 648
    .line 649
    .line 650
    move-result v0

    .line 651
    if-nez v0, :cond_a

    .line 652
    .line 653
    const-string v0, "unblock_risk_web"

    .line 654
    .line 655
    invoke-virtual {v6, v0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 656
    .line 657
    .line 658
    move-result v0

    .line 659
    if-eqz v0, :cond_b

    .line 660
    .line 661
    :cond_a
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 662
    .line 663
    .line 664
    move-result-wide v1

    .line 665
    :try_start_12
    invoke-static {}, Lv4;->B()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_12

    .line 666
    .line 667
    .line 668
    move-object/from16 v3, v52

    .line 669
    .line 670
    :try_start_13
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_11

    .line 671
    .line 672
    .line 673
    :goto_11
    invoke-static {v3, v1, v2}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 674
    .line 675
    .line 676
    goto :goto_13

    .line 677
    :catchall_11
    move-exception v0

    .line 678
    goto :goto_12

    .line 679
    :catchall_12
    move-exception v0

    .line 680
    move-object/from16 v3, v52

    .line 681
    .line 682
    :goto_12
    :try_start_14
    new-instance v4, Ljava/lang/StringBuilder;

    .line 683
    .line 684
    move-object/from16 v5, v51

    .line 685
    .line 686
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 687
    .line 688
    .line 689
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_46

    .line 697
    .line 698
    .line 699
    goto :goto_11

    .line 700
    :cond_b
    :goto_13
    const-string v0, "notice_block_at_all"

    .line 701
    .line 702
    invoke-virtual {v6, v0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 703
    .line 704
    .line 705
    move-result v0

    .line 706
    if-nez v0, :cond_c

    .line 707
    .line 708
    const-string v0, "notice_block_group_todo"

    .line 709
    .line 710
    invoke-virtual {v6, v0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 711
    .line 712
    .line 713
    move-result v0

    .line 714
    if-eqz v0, :cond_d

    .line 715
    .line 716
    :cond_c
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 717
    .line 718
    .line 719
    move-result-wide v1

    .line 720
    :try_start_15
    invoke-static/range {p0 .. p1}, Lr3;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_14

    .line 721
    .line 722
    .line 723
    move-object/from16 v3, v50

    .line 724
    .line 725
    :try_start_16
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_13

    .line 726
    .line 727
    .line 728
    :goto_14
    invoke-static {v3, v1, v2}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 729
    .line 730
    .line 731
    goto :goto_16

    .line 732
    :catchall_13
    move-exception v0

    .line 733
    goto :goto_15

    .line 734
    :catchall_14
    move-exception v0

    .line 735
    move-object/from16 v3, v50

    .line 736
    .line 737
    :goto_15
    :try_start_17
    new-instance v4, Ljava/lang/StringBuilder;

    .line 738
    .line 739
    move-object/from16 v5, v49

    .line 740
    .line 741
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 745
    .line 746
    .line 747
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_45

    .line 752
    .line 753
    .line 754
    goto :goto_14

    .line 755
    :cond_d
    :goto_16
    const-string v1, "rename_apk_file"

    .line 756
    .line 757
    invoke-virtual {v6, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 758
    .line 759
    .line 760
    move-result v0

    .line 761
    if-eqz v0, :cond_e

    .line 762
    .line 763
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 764
    .line 765
    .line 766
    move-result-wide v2

    .line 767
    :try_start_18
    invoke-static/range {p0 .. p0}, Lv4;->t(Ljava/lang/ClassLoader;)V

    .line 768
    .line 769
    .line 770
    const-string v0, "file_model_guards"

    .line 771
    .line 772
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_15

    .line 773
    .line 774
    .line 775
    move-object/from16 v4, v48

    .line 776
    .line 777
    :goto_17
    invoke-static {v4, v2, v3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 778
    .line 779
    .line 780
    goto :goto_18

    .line 781
    :catchall_15
    move-exception v0

    .line 782
    move-object/from16 v4, v48

    .line 783
    .line 784
    :try_start_19
    new-instance v5, Ljava/lang/StringBuilder;

    .line 785
    .line 786
    move-object/from16 v8, v47

    .line 787
    .line 788
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 789
    .line 790
    .line 791
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 792
    .line 793
    .line 794
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_16

    .line 799
    .line 800
    .line 801
    goto :goto_17

    .line 802
    :catchall_16
    move-exception v0

    .line 803
    invoke-static {v4, v2, v3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 804
    .line 805
    .line 806
    throw v0

    .line 807
    :cond_e
    :goto_18
    const-string v2, "legacy_group_file_layout"

    .line 808
    .line 809
    invoke-virtual {v6, v2}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 810
    .line 811
    .line 812
    move-result v0

    .line 813
    if-eqz v0, :cond_f

    .line 814
    .line 815
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 816
    .line 817
    .line 818
    move-result-wide v3

    .line 819
    :try_start_1a
    invoke-static/range {p0 .. p0}, Li9;->b(Ljava/lang/ClassLoader;)I

    .line 820
    .line 821
    .line 822
    invoke-static/range {p0 .. p0}, Lk9;->b(Ljava/lang/ClassLoader;)V

    .line 823
    .line 824
    .line 825
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_17

    .line 826
    .line 827
    .line 828
    :goto_19
    invoke-static {v2, v3, v4}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 829
    .line 830
    .line 831
    goto :goto_1a

    .line 832
    :catchall_17
    move-exception v0

    .line 833
    :try_start_1b
    new-instance v5, Ljava/lang/StringBuilder;

    .line 834
    .line 835
    move-object/from16 v8, v46

    .line 836
    .line 837
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 838
    .line 839
    .line 840
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 841
    .line 842
    .line 843
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v0

    .line 847
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_18

    .line 848
    .line 849
    .line 850
    goto :goto_19

    .line 851
    :catchall_18
    move-exception v0

    .line 852
    invoke-static {v2, v3, v4}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 853
    .line 854
    .line 855
    throw v0

    .line 856
    :cond_f
    :goto_1a
    const-string v0, "direct_download_write"

    .line 857
    .line 858
    invoke-virtual {v6, v0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 859
    .line 860
    .line 861
    move-result v0

    .line 862
    if-eqz v0, :cond_10

    .line 863
    .line 864
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 865
    .line 866
    .line 867
    move-result-wide v2

    .line 868
    :try_start_1c
    invoke-static/range {p0 .. p0}, La3;->i(Ljava/lang/ClassLoader;)V

    .line 869
    .line 870
    .line 871
    invoke-static/range {p0 .. p0}, Lh3;->s(Ljava/lang/ClassLoader;)V

    .line 872
    .line 873
    .line 874
    const-string v0, "download_direct_write"

    .line 875
    .line 876
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_19

    .line 877
    .line 878
    .line 879
    move-object/from16 v4, v45

    .line 880
    .line 881
    :goto_1b
    invoke-static {v4, v2, v3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 882
    .line 883
    .line 884
    goto :goto_1c

    .line 885
    :catchall_19
    move-exception v0

    .line 886
    move-object/from16 v4, v45

    .line 887
    .line 888
    :try_start_1d
    new-instance v5, Ljava/lang/StringBuilder;

    .line 889
    .line 890
    move-object/from16 v8, v44

    .line 891
    .line 892
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 893
    .line 894
    .line 895
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 896
    .line 897
    .line 898
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 899
    .line 900
    .line 901
    move-result-object v0

    .line 902
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_1a

    .line 903
    .line 904
    .line 905
    goto :goto_1b

    .line 906
    :catchall_1a
    move-exception v0

    .line 907
    invoke-static {v4, v2, v3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 908
    .line 909
    .line 910
    throw v0

    .line 911
    :cond_10
    :goto_1c
    sget-object v0, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 912
    .line 913
    const-string v2, "block_annoying_popups"

    .line 914
    .line 915
    invoke-virtual {v0, v2}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 916
    .line 917
    .line 918
    move-result v0

    .line 919
    if-eqz v0, :cond_11

    .line 920
    .line 921
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 922
    .line 923
    .line 924
    move-result-wide v2

    .line 925
    :try_start_1e
    invoke-static/range {p0 .. p0}, Lv4;->s(Ljava/lang/ClassLoader;)V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_1c

    .line 926
    .line 927
    .line 928
    move-object/from16 v4, v43

    .line 929
    .line 930
    :try_start_1f
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_1b

    .line 931
    .line 932
    .line 933
    :goto_1d
    invoke-static {v4, v2, v3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 934
    .line 935
    .line 936
    goto :goto_1f

    .line 937
    :catchall_1b
    move-exception v0

    .line 938
    goto :goto_1e

    .line 939
    :catchall_1c
    move-exception v0

    .line 940
    move-object/from16 v4, v43

    .line 941
    .line 942
    :goto_1e
    :try_start_20
    new-instance v5, Ljava/lang/StringBuilder;

    .line 943
    .line 944
    move-object/from16 v8, v42

    .line 945
    .line 946
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 947
    .line 948
    .line 949
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 950
    .line 951
    .line 952
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 953
    .line 954
    .line 955
    move-result-object v0

    .line 956
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_1d

    .line 957
    .line 958
    .line 959
    goto :goto_1d

    .line 960
    :catchall_1d
    move-exception v0

    .line 961
    invoke-static {v4, v2, v3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 962
    .line 963
    .line 964
    throw v0

    .line 965
    :cond_11
    :goto_1f
    const-string v0, "block_host_hot_update"

    .line 966
    .line 967
    invoke-virtual {v6, v0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 968
    .line 969
    .line 970
    move-result v0

    .line 971
    if-eqz v0, :cond_12

    .line 972
    .line 973
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 974
    .line 975
    .line 976
    move-result-wide v2

    .line 977
    :try_start_21
    invoke-static/range {p0 .. p1}, Lx7;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_1f

    .line 978
    .line 979
    .line 980
    move-object/from16 v4, v41

    .line 981
    .line 982
    :try_start_22
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_1e

    .line 983
    .line 984
    .line 985
    :goto_20
    invoke-static {v4, v2, v3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 986
    .line 987
    .line 988
    goto :goto_22

    .line 989
    :catchall_1e
    move-exception v0

    .line 990
    goto :goto_21

    .line 991
    :catchall_1f
    move-exception v0

    .line 992
    move-object/from16 v4, v41

    .line 993
    .line 994
    :goto_21
    :try_start_23
    new-instance v5, Ljava/lang/StringBuilder;

    .line 995
    .line 996
    move-object/from16 v8, v40

    .line 997
    .line 998
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v0

    .line 1008
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_20

    .line 1009
    .line 1010
    .line 1011
    goto :goto_20

    .line 1012
    :catchall_20
    move-exception v0

    .line 1013
    invoke-static {v4, v2, v3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1014
    .line 1015
    .line 1016
    throw v0

    .line 1017
    :cond_12
    :goto_22
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 1018
    .line 1019
    .line 1020
    move-result-wide v2

    .line 1021
    :try_start_24
    invoke-static/range {p0 .. p0}, Lcom/mr/elaris/HookEntry;->maybeHookQQShowInAio(Ljava/lang/ClassLoader;)V
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_44

    .line 1022
    .line 1023
    .line 1024
    move-object/from16 v4, v26

    .line 1025
    .line 1026
    invoke-static {v4, v2, v3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1027
    .line 1028
    .line 1029
    const-string v2, "emotion_as_pic"

    .line 1030
    .line 1031
    invoke-virtual {v6, v2}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 1032
    .line 1033
    .line 1034
    move-result v0

    .line 1035
    if-eqz v0, :cond_13

    .line 1036
    .line 1037
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 1038
    .line 1039
    .line 1040
    move-result-wide v3

    .line 1041
    :try_start_25
    invoke-static/range {p0 .. p0}, Lcom/mr/elaris/HookEntry;->hookEmotionAsPic(Ljava/lang/ClassLoader;)V

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_21

    .line 1045
    .line 1046
    .line 1047
    :goto_23
    invoke-static {v2, v3, v4}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1048
    .line 1049
    .line 1050
    goto :goto_24

    .line 1051
    :catchall_21
    move-exception v0

    .line 1052
    :try_start_26
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1053
    .line 1054
    move-object/from16 v8, v39

    .line 1055
    .line 1056
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v0

    .line 1066
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_22

    .line 1067
    .line 1068
    .line 1069
    goto :goto_23

    .line 1070
    :catchall_22
    move-exception v0

    .line 1071
    invoke-static {v2, v3, v4}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1072
    .line 1073
    .line 1074
    throw v0

    .line 1075
    :cond_13
    :goto_24
    const-string v0, "media_click_to_load"

    .line 1076
    .line 1077
    invoke-virtual {v6, v0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 1078
    .line 1079
    .line 1080
    move-result v2

    .line 1081
    if-eqz v2, :cond_14

    .line 1082
    .line 1083
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 1084
    .line 1085
    .line 1086
    move-result-wide v2

    .line 1087
    :try_start_27
    invoke-static/range {p0 .. p0}, Led;->i(Ljava/lang/ClassLoader;)V

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_23

    .line 1091
    .line 1092
    .line 1093
    move-object/from16 v4, v25

    .line 1094
    .line 1095
    :goto_25
    invoke-static {v4, v2, v3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1096
    .line 1097
    .line 1098
    goto :goto_26

    .line 1099
    :catchall_23
    move-exception v0

    .line 1100
    move-object/from16 v4, v25

    .line 1101
    .line 1102
    :try_start_28
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1103
    .line 1104
    move-object/from16 v8, v38

    .line 1105
    .line 1106
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1107
    .line 1108
    .line 1109
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1110
    .line 1111
    .line 1112
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v0

    .line 1116
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_24

    .line 1117
    .line 1118
    .line 1119
    goto :goto_25

    .line 1120
    :catchall_24
    move-exception v0

    .line 1121
    invoke-static {v4, v2, v3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1122
    .line 1123
    .line 1124
    throw v0

    .line 1125
    :cond_14
    :goto_26
    const-string v0, "clean_emoji_panel_entries"

    .line 1126
    .line 1127
    invoke-virtual {v6, v0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 1128
    .line 1129
    .line 1130
    move-result v0

    .line 1131
    if-eqz v0, :cond_15

    .line 1132
    .line 1133
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 1134
    .line 1135
    .line 1136
    move-result-wide v2

    .line 1137
    :try_start_29
    invoke-static/range {p0 .. p0}, Lz3;->j(Ljava/lang/ClassLoader;)V
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_26

    .line 1138
    .line 1139
    .line 1140
    move-object/from16 v4, v24

    .line 1141
    .line 1142
    :try_start_2a
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_25

    .line 1143
    .line 1144
    .line 1145
    :goto_27
    invoke-static {v4, v2, v3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1146
    .line 1147
    .line 1148
    goto :goto_29

    .line 1149
    :catchall_25
    move-exception v0

    .line 1150
    goto :goto_28

    .line 1151
    :catchall_26
    move-exception v0

    .line 1152
    move-object/from16 v4, v24

    .line 1153
    .line 1154
    :goto_28
    :try_start_2b
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1155
    .line 1156
    move-object/from16 v8, v37

    .line 1157
    .line 1158
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v0

    .line 1168
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_27

    .line 1169
    .line 1170
    .line 1171
    goto :goto_27

    .line 1172
    :catchall_27
    move-exception v0

    .line 1173
    invoke-static {v4, v2, v3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1174
    .line 1175
    .line 1176
    throw v0

    .line 1177
    :cond_15
    :goto_29
    const-string v0, "favorite_emoticon_batch_send"

    .line 1178
    .line 1179
    invoke-virtual {v6, v0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 1180
    .line 1181
    .line 1182
    move-result v0

    .line 1183
    if-eqz v0, :cond_16

    .line 1184
    .line 1185
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 1186
    .line 1187
    .line 1188
    move-result-wide v2

    .line 1189
    :try_start_2c
    invoke-static/range {p0 .. p0}, Lj4;->p(Ljava/lang/ClassLoader;)V
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_29

    .line 1190
    .line 1191
    .line 1192
    move-object/from16 v4, v23

    .line 1193
    .line 1194
    :try_start_2d
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2d
    .catchall {:try_start_2d .. :try_end_2d} :catchall_28

    .line 1195
    .line 1196
    .line 1197
    :goto_2a
    invoke-static {v4, v2, v3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1198
    .line 1199
    .line 1200
    goto :goto_2c

    .line 1201
    :catchall_28
    move-exception v0

    .line 1202
    goto :goto_2b

    .line 1203
    :catchall_29
    move-exception v0

    .line 1204
    move-object/from16 v4, v23

    .line 1205
    .line 1206
    :goto_2b
    :try_start_2e
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1207
    .line 1208
    move-object/from16 v8, v36

    .line 1209
    .line 1210
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1211
    .line 1212
    .line 1213
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1214
    .line 1215
    .line 1216
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v0

    .line 1220
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_2a

    .line 1221
    .line 1222
    .line 1223
    goto :goto_2a

    .line 1224
    :catchall_2a
    move-exception v0

    .line 1225
    invoke-static {v4, v2, v3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1226
    .line 1227
    .line 1228
    throw v0

    .line 1229
    :cond_16
    :goto_2c
    const-string v2, "cloud_sticker_panel"

    .line 1230
    .line 1231
    invoke-virtual {v6, v2}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 1232
    .line 1233
    .line 1234
    move-result v0

    .line 1235
    if-eqz v0, :cond_17

    .line 1236
    .line 1237
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 1238
    .line 1239
    .line 1240
    move-result-wide v3

    .line 1241
    :try_start_2f
    invoke-static/range {p0 .. p0}, Lg2;->i(Ljava/lang/ClassLoader;)V

    .line 1242
    .line 1243
    .line 1244
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2f
    .catchall {:try_start_2f .. :try_end_2f} :catchall_2b

    .line 1245
    .line 1246
    .line 1247
    :goto_2d
    invoke-static {v2, v3, v4}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1248
    .line 1249
    .line 1250
    goto :goto_2e

    .line 1251
    :catchall_2b
    move-exception v0

    .line 1252
    :try_start_30
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1253
    .line 1254
    move-object/from16 v8, v35

    .line 1255
    .line 1256
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1260
    .line 1261
    .line 1262
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v0

    .line 1266
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_30
    .catchall {:try_start_30 .. :try_end_30} :catchall_2c

    .line 1267
    .line 1268
    .line 1269
    goto :goto_2d

    .line 1270
    :catchall_2c
    move-exception v0

    .line 1271
    invoke-static {v2, v3, v4}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1272
    .line 1273
    .line 1274
    throw v0

    .line 1275
    :cond_17
    :goto_2e
    const-string v2, "voice_message_actions"

    .line 1276
    .line 1277
    invoke-virtual {v6, v2}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 1278
    .line 1279
    .line 1280
    move-result v0

    .line 1281
    if-eqz v0, :cond_18

    .line 1282
    .line 1283
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 1284
    .line 1285
    .line 1286
    move-result-wide v3

    .line 1287
    :try_start_31
    invoke-static/range {p0 .. p0}, Lcom/mr/elaris/w;->P(Ljava/lang/ClassLoader;)V

    .line 1288
    .line 1289
    .line 1290
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_31
    .catchall {:try_start_31 .. :try_end_31} :catchall_2d

    .line 1291
    .line 1292
    .line 1293
    :goto_2f
    invoke-static {v2, v3, v4}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1294
    .line 1295
    .line 1296
    goto :goto_30

    .line 1297
    :catchall_2d
    move-exception v0

    .line 1298
    :try_start_32
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1299
    .line 1300
    move-object/from16 v8, v34

    .line 1301
    .line 1302
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1303
    .line 1304
    .line 1305
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1306
    .line 1307
    .line 1308
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v0

    .line 1312
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_32
    .catchall {:try_start_32 .. :try_end_32} :catchall_2e

    .line 1313
    .line 1314
    .line 1315
    goto :goto_2f

    .line 1316
    :catchall_2e
    move-exception v0

    .line 1317
    invoke-static {v2, v3, v4}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1318
    .line 1319
    .line 1320
    throw v0

    .line 1321
    :cond_18
    :goto_30
    const-string v0, "aio_input_bar_hidden_ids"

    .line 1322
    .line 1323
    const-string v2, ""

    .line 1324
    .line 1325
    invoke-virtual {v6, v0, v2}, Lcom/mr/elaris/HookConfig;->string(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v0

    .line 1329
    const-string v2, "aio_input_bar_enabled"

    .line 1330
    .line 1331
    invoke-virtual {v6, v2}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 1332
    .line 1333
    .line 1334
    move-result v2

    .line 1335
    const-string v3, "aio_input_bar_migrated"

    .line 1336
    .line 1337
    invoke-virtual {v6, v3}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 1338
    .line 1339
    .line 1340
    move-result v3

    .line 1341
    const-string v4, "hide_aio_input_camera_entries"

    .line 1342
    .line 1343
    invoke-virtual {v6, v4}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 1344
    .line 1345
    .line 1346
    move-result v4

    .line 1347
    invoke-static {v0, v2, v3, v4}, Li5;->F0(Ljava/lang/String;ZZZ)Z

    .line 1348
    .line 1349
    .line 1350
    move-result v0

    .line 1351
    if-eqz v0, :cond_19

    .line 1352
    .line 1353
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 1354
    .line 1355
    .line 1356
    move-result-wide v2

    .line 1357
    :try_start_33
    invoke-static/range {p0 .. p0}, Lj;->c(Ljava/lang/ClassLoader;)V
    :try_end_33
    .catchall {:try_start_33 .. :try_end_33} :catchall_30

    .line 1358
    .line 1359
    .line 1360
    move-object/from16 v4, v22

    .line 1361
    .line 1362
    :try_start_34
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_34
    .catchall {:try_start_34 .. :try_end_34} :catchall_2f

    .line 1363
    .line 1364
    .line 1365
    :goto_31
    invoke-static {v4, v2, v3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1366
    .line 1367
    .line 1368
    goto :goto_33

    .line 1369
    :catchall_2f
    move-exception v0

    .line 1370
    goto :goto_32

    .line 1371
    :catchall_30
    move-exception v0

    .line 1372
    move-object/from16 v4, v22

    .line 1373
    .line 1374
    :goto_32
    :try_start_35
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1375
    .line 1376
    move-object/from16 v8, v33

    .line 1377
    .line 1378
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1379
    .line 1380
    .line 1381
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1382
    .line 1383
    .line 1384
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v0

    .line 1388
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_35
    .catchall {:try_start_35 .. :try_end_35} :catchall_31

    .line 1389
    .line 1390
    .line 1391
    goto :goto_31

    .line 1392
    :catchall_31
    move-exception v0

    .line 1393
    invoke-static {v4, v2, v3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1394
    .line 1395
    .line 1396
    throw v0

    .line 1397
    :cond_19
    :goto_33
    const-string v2, "album_video_bubble"

    .line 1398
    .line 1399
    invoke-virtual {v6, v2}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 1400
    .line 1401
    .line 1402
    move-result v0

    .line 1403
    if-eqz v0, :cond_1a

    .line 1404
    .line 1405
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 1406
    .line 1407
    .line 1408
    move-result-wide v3

    .line 1409
    :try_start_36
    invoke-static/range {p0 .. p0}, Ls;->g(Ljava/lang/ClassLoader;)V

    .line 1410
    .line 1411
    .line 1412
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_36
    .catchall {:try_start_36 .. :try_end_36} :catchall_32

    .line 1413
    .line 1414
    .line 1415
    :goto_34
    invoke-static {v2, v3, v4}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1416
    .line 1417
    .line 1418
    goto :goto_35

    .line 1419
    :catchall_32
    move-exception v0

    .line 1420
    :try_start_37
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1421
    .line 1422
    move-object/from16 v8, v32

    .line 1423
    .line 1424
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1425
    .line 1426
    .line 1427
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1428
    .line 1429
    .line 1430
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v0

    .line 1434
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_37
    .catchall {:try_start_37 .. :try_end_37} :catchall_33

    .line 1435
    .line 1436
    .line 1437
    goto :goto_34

    .line 1438
    :catchall_33
    move-exception v0

    .line 1439
    invoke-static {v2, v3, v4}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1440
    .line 1441
    .line 1442
    throw v0

    .line 1443
    :cond_1a
    :goto_35
    const-string v0, "flash_pic_as_image"

    .line 1444
    .line 1445
    invoke-virtual {v6, v0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 1446
    .line 1447
    .line 1448
    move-result v2

    .line 1449
    if-eqz v2, :cond_1b

    .line 1450
    .line 1451
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 1452
    .line 1453
    .line 1454
    move-result-wide v2

    .line 1455
    :try_start_38
    invoke-static/range {p0 .. p0}, La5;->f(Ljava/lang/ClassLoader;)V

    .line 1456
    .line 1457
    .line 1458
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_38
    .catchall {:try_start_38 .. :try_end_38} :catchall_34

    .line 1459
    .line 1460
    .line 1461
    move-object/from16 v4, v21

    .line 1462
    .line 1463
    :goto_36
    invoke-static {v4, v2, v3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1464
    .line 1465
    .line 1466
    goto :goto_37

    .line 1467
    :catchall_34
    move-exception v0

    .line 1468
    move-object/from16 v4, v21

    .line 1469
    .line 1470
    :try_start_39
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1471
    .line 1472
    move-object/from16 v8, v31

    .line 1473
    .line 1474
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1475
    .line 1476
    .line 1477
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1478
    .line 1479
    .line 1480
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v0

    .line 1484
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_39
    .catchall {:try_start_39 .. :try_end_39} :catchall_35

    .line 1485
    .line 1486
    .line 1487
    goto :goto_36

    .line 1488
    :catchall_35
    move-exception v0

    .line 1489
    invoke-static {v4, v2, v3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1490
    .line 1491
    .line 1492
    throw v0

    .line 1493
    :cond_1b
    :goto_37
    const-string v0, "original_image_default"

    .line 1494
    .line 1495
    invoke-virtual {v6, v0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 1496
    .line 1497
    .line 1498
    move-result v2

    .line 1499
    if-eqz v2, :cond_1c

    .line 1500
    .line 1501
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 1502
    .line 1503
    .line 1504
    move-result-wide v2

    .line 1505
    :try_start_3a
    invoke-static/range {p0 .. p0}, Lma;->g(Ljava/lang/ClassLoader;)V

    .line 1506
    .line 1507
    .line 1508
    const-string v4, "original_image_default_panel"

    .line 1509
    .line 1510
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3a
    .catchall {:try_start_3a .. :try_end_3a} :catchall_36

    .line 1511
    .line 1512
    .line 1513
    move-object/from16 v4, v20

    .line 1514
    .line 1515
    invoke-static {v4, v2, v3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1516
    .line 1517
    .line 1518
    goto :goto_38

    .line 1519
    :catchall_36
    move-exception v0

    .line 1520
    move-object/from16 v4, v20

    .line 1521
    .line 1522
    invoke-static {v4, v2, v3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1523
    .line 1524
    .line 1525
    throw v0

    .line 1526
    :cond_1c
    :goto_38
    const-string v2, "pic_summary_enabled"

    .line 1527
    .line 1528
    invoke-virtual {v6, v2}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 1529
    .line 1530
    .line 1531
    move-result v2

    .line 1532
    if-nez v2, :cond_1d

    .line 1533
    .line 1534
    invoke-virtual {v6, v0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 1535
    .line 1536
    .line 1537
    move-result v0

    .line 1538
    if-nez v0, :cond_1d

    .line 1539
    .line 1540
    invoke-virtual {v6, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 1541
    .line 1542
    .line 1543
    move-result v0

    .line 1544
    if-eqz v0, :cond_1e

    .line 1545
    .line 1546
    :cond_1d
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 1547
    .line 1548
    .line 1549
    move-result-wide v1

    .line 1550
    :try_start_3b
    invoke-static/range {p0 .. p0}, Lcom/mr/elaris/HookEntry;->hookPicSummarySendMsg(Ljava/lang/ClassLoader;)V
    :try_end_3b
    .catchall {:try_start_3b .. :try_end_3b} :catchall_38

    .line 1551
    .line 1552
    .line 1553
    move-object/from16 v3, v19

    .line 1554
    .line 1555
    :try_start_3c
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3c
    .catchall {:try_start_3c .. :try_end_3c} :catchall_37

    .line 1556
    .line 1557
    .line 1558
    :goto_39
    invoke-static {v3, v1, v2}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1559
    .line 1560
    .line 1561
    goto :goto_3b

    .line 1562
    :catchall_37
    move-exception v0

    .line 1563
    goto :goto_3a

    .line 1564
    :catchall_38
    move-exception v0

    .line 1565
    move-object/from16 v3, v19

    .line 1566
    .line 1567
    :goto_3a
    :try_start_3d
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1568
    .line 1569
    move-object/from16 v5, v30

    .line 1570
    .line 1571
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1572
    .line 1573
    .line 1574
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1575
    .line 1576
    .line 1577
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1578
    .line 1579
    .line 1580
    move-result-object v0

    .line 1581
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_3d
    .catchall {:try_start_3d .. :try_end_3d} :catchall_43

    .line 1582
    .line 1583
    .line 1584
    goto :goto_39

    .line 1585
    :cond_1e
    :goto_3b
    const-string v0, "eq_message_guard"

    .line 1586
    .line 1587
    invoke-virtual {v6, v0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 1588
    .line 1589
    .line 1590
    move-result v0

    .line 1591
    if-eqz v0, :cond_1f

    .line 1592
    .line 1593
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 1594
    .line 1595
    .line 1596
    move-result-wide v1

    .line 1597
    move-object/from16 v3, p0

    .line 1598
    .line 1599
    move/from16 v4, v59

    .line 1600
    .line 1601
    :try_start_3e
    invoke-static {v3, v4}, Lc0;->h(Ljava/lang/ClassLoader;Z)V
    :try_end_3e
    .catchall {:try_start_3e .. :try_end_3e} :catchall_3a

    .line 1602
    .line 1603
    .line 1604
    move-object/from16 v4, v18

    .line 1605
    .line 1606
    :try_start_3f
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3f
    .catchall {:try_start_3f .. :try_end_3f} :catchall_39

    .line 1607
    .line 1608
    .line 1609
    :goto_3c
    invoke-static {v4, v1, v2}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1610
    .line 1611
    .line 1612
    goto :goto_3e

    .line 1613
    :catchall_39
    move-exception v0

    .line 1614
    goto :goto_3d

    .line 1615
    :catchall_3a
    move-exception v0

    .line 1616
    move-object/from16 v4, v18

    .line 1617
    .line 1618
    :goto_3d
    :try_start_40
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1619
    .line 1620
    move-object/from16 v8, v29

    .line 1621
    .line 1622
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1623
    .line 1624
    .line 1625
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1626
    .line 1627
    .line 1628
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1629
    .line 1630
    .line 1631
    move-result-object v0

    .line 1632
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_40
    .catchall {:try_start_40 .. :try_end_40} :catchall_3b

    .line 1633
    .line 1634
    .line 1635
    goto :goto_3c

    .line 1636
    :catchall_3b
    move-exception v0

    .line 1637
    invoke-static {v4, v1, v2}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1638
    .line 1639
    .line 1640
    throw v0

    .line 1641
    :cond_1f
    move-object/from16 v3, p0

    .line 1642
    .line 1643
    :goto_3e
    const-string v0, "eq_qr_gallery_gate"

    .line 1644
    .line 1645
    invoke-virtual {v6, v0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 1646
    .line 1647
    .line 1648
    move-result v0

    .line 1649
    if-eqz v0, :cond_20

    .line 1650
    .line 1651
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 1652
    .line 1653
    .line 1654
    move-result-wide v1

    .line 1655
    :try_start_41
    invoke-static {v3}, Lt9;->f(Ljava/lang/ClassLoader;)V
    :try_end_41
    .catchall {:try_start_41 .. :try_end_41} :catchall_3d

    .line 1656
    .line 1657
    .line 1658
    move-object/from16 v4, v17

    .line 1659
    .line 1660
    :try_start_42
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_42
    .catchall {:try_start_42 .. :try_end_42} :catchall_3c

    .line 1661
    .line 1662
    .line 1663
    :goto_3f
    invoke-static {v4, v1, v2}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1664
    .line 1665
    .line 1666
    goto :goto_41

    .line 1667
    :catchall_3c
    move-exception v0

    .line 1668
    goto :goto_40

    .line 1669
    :catchall_3d
    move-exception v0

    .line 1670
    move-object/from16 v4, v17

    .line 1671
    .line 1672
    :goto_40
    :try_start_43
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1673
    .line 1674
    move-object/from16 v8, v28

    .line 1675
    .line 1676
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1677
    .line 1678
    .line 1679
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1680
    .line 1681
    .line 1682
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v0

    .line 1686
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_43
    .catchall {:try_start_43 .. :try_end_43} :catchall_3e

    .line 1687
    .line 1688
    .line 1689
    goto :goto_3f

    .line 1690
    :catchall_3e
    move-exception v0

    .line 1691
    invoke-static {v4, v1, v2}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1692
    .line 1693
    .line 1694
    throw v0

    .line 1695
    :cond_20
    :goto_41
    const-string v0, "eq_qr_confirm_fast"

    .line 1696
    .line 1697
    invoke-virtual {v6, v0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 1698
    .line 1699
    .line 1700
    move-result v0

    .line 1701
    if-eqz v0, :cond_22

    .line 1702
    .line 1703
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 1704
    .line 1705
    .line 1706
    move-result-wide v1

    .line 1707
    :try_start_44
    sget-boolean v0, Lt9;->d:Z

    .line 1708
    .line 1709
    if-eqz v0, :cond_21

    .line 1710
    .line 1711
    :goto_42
    move-object/from16 v3, v16

    .line 1712
    .line 1713
    goto :goto_43

    .line 1714
    :cond_21
    const/16 v59, 0x1

    .line 1715
    .line 1716
    sput-boolean v59, Lt9;->d:Z
    :try_end_44
    .catchall {:try_start_44 .. :try_end_44} :catchall_41

    .line 1717
    .line 1718
    :try_start_45
    invoke-static {v3}, Lt9;->c(Ljava/lang/ClassLoader;)V

    .line 1719
    .line 1720
    .line 1721
    invoke-static {v3}, Lt9;->d(Ljava/lang/ClassLoader;)V

    .line 1722
    .line 1723
    .line 1724
    const-string v0, "hooked QR confirm fast-path main precise targets"

    .line 1725
    .line 1726
    invoke-static {v0}, Lt9;->h(Ljava/lang/String;)V
    :try_end_45
    .catchall {:try_start_45 .. :try_end_45} :catchall_3f

    .line 1727
    .line 1728
    .line 1729
    goto :goto_42

    .line 1730
    :catchall_3f
    move-exception v0

    .line 1731
    :try_start_46
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1732
    .line 1733
    const-string v4, "hookQrConfirmFastPathMain failed: "

    .line 1734
    .line 1735
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1736
    .line 1737
    .line 1738
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1739
    .line 1740
    .line 1741
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1742
    .line 1743
    .line 1744
    move-result-object v0

    .line 1745
    invoke-static {v0}, Lt9;->h(Ljava/lang/String;)V
    :try_end_46
    .catchall {:try_start_46 .. :try_end_46} :catchall_41

    .line 1746
    .line 1747
    .line 1748
    goto :goto_42

    .line 1749
    :goto_43
    :try_start_47
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_47
    .catchall {:try_start_47 .. :try_end_47} :catchall_40

    .line 1750
    .line 1751
    .line 1752
    :goto_44
    invoke-static {v3, v1, v2}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1753
    .line 1754
    .line 1755
    goto :goto_46

    .line 1756
    :catchall_40
    move-exception v0

    .line 1757
    goto :goto_45

    .line 1758
    :catchall_41
    move-exception v0

    .line 1759
    move-object/from16 v3, v16

    .line 1760
    .line 1761
    :goto_45
    :try_start_48
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1762
    .line 1763
    move-object/from16 v5, v27

    .line 1764
    .line 1765
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1766
    .line 1767
    .line 1768
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1769
    .line 1770
    .line 1771
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v0

    .line 1775
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_48
    .catchall {:try_start_48 .. :try_end_48} :catchall_42

    .line 1776
    .line 1777
    .line 1778
    goto :goto_44

    .line 1779
    :catchall_42
    move-exception v0

    .line 1780
    invoke-static {v3, v1, v2}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1781
    .line 1782
    .line 1783
    throw v0

    .line 1784
    :cond_22
    :goto_46
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1785
    .line 1786
    .line 1787
    move-result v0

    .line 1788
    if-nez v0, :cond_23

    .line 1789
    .line 1790
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1791
    .line 1792
    const-string v1, "main immediate safe hooks installed: "

    .line 1793
    .line 1794
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1795
    .line 1796
    .line 1797
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1798
    .line 1799
    .line 1800
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1801
    .line 1802
    .line 1803
    move-result-object v0

    .line 1804
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 1805
    .line 1806
    .line 1807
    :cond_23
    return-void

    .line 1808
    :catchall_43
    move-exception v0

    .line 1809
    invoke-static {v3, v1, v2}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1810
    .line 1811
    .line 1812
    throw v0

    .line 1813
    :catchall_44
    move-exception v0

    .line 1814
    move-object/from16 v4, v26

    .line 1815
    .line 1816
    invoke-static {v4, v2, v3}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1817
    .line 1818
    .line 1819
    throw v0

    .line 1820
    :catchall_45
    move-exception v0

    .line 1821
    invoke-static {v3, v1, v2}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1822
    .line 1823
    .line 1824
    throw v0

    .line 1825
    :catchall_46
    move-exception v0

    .line 1826
    invoke-static {v3, v1, v2}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1827
    .line 1828
    .line 1829
    throw v0

    .line 1830
    :catchall_47
    move-exception v0

    .line 1831
    invoke-static {v11, v8, v9}, Lcom/mr/elaris/HookEntry;->logMainHookCost(Ljava/lang/String;J)V

    .line 1832
    .line 1833
    .line 1834
    throw v0
.end method

.method private static installMainProfileHooksAsync(Ljava/lang/ClassLoader;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 2
    .line 3
    const-string v1, "block_avatar_pendant"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const-string v1, "block_profile_card_decor"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    const-string v1, "allow_forbid_card"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    new-instance v0, Lcom/mr/elaris/e;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Lcom/mr/elaris/e;-><init>(Ljava/lang/ClassLoader;)V

    .line 31
    .line 32
    .line 33
    const-string p0, "Elaris-main-profile-hooks"

    .line 34
    .line 35
    invoke-static {p0, v0}, Lo7;->a(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method private static installMsfProcessHooks(Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hasMsfProcessTargets()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->runMsfProcessHooks(Ljava/lang/ClassLoader;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static installOpenSdkProcessHooks(Ljava/lang/ClassLoader;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 2
    .line 3
    const-string v1, "eq_qr_confirm_fast"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    :try_start_0
    invoke-static {p0}, Lt9;->e(Ljava/lang/ClassLoader;)V

    .line 13
    .line 14
    .line 15
    const-string p0, "openSdk hooks installed: qr_confirm_fast"

    .line 16
    .line 17
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v1, "openSdk QR confirm fast-path hook failed: "

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method private static installOtherProcessHooks(Ljava/lang/ClassLoader;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/mr/elaris/HookEntry;->hasOtherProcessTargets(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p0, p1}, Lcom/mr/elaris/HookEntry;->runOtherProcessHooks(Ljava/lang/ClassLoader;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static installToolProcessHooks(Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hasToolProcessTargets()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->runToolProcessHooks(Ljava/lang/ClassLoader;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static isCurrentHotReloadGeneration(I)Z
    .locals 3

    .line 1
    sget-object v0, La8;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    :try_start_0
    const-string v1, "com.mr.elaris.hot_reload_generation"

    .line 5
    .line 6
    const-string v2, "0"

    .line 7
    .line 8
    invoke-static {v1, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move v1, v0

    .line 18
    :goto_0
    if-ne v1, p0, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    return v0
.end method

.method private static isDefaultDecorationSetting(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "default_bubble"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "default_font"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-string v0, "block_avatar_pendant"

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 29
    return p0
.end method

.method private static isMsgRecordReturnType(Ljava/lang/Class;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v1, "com.tencent.qqnt.kernel.nativeinterface.MsgRecord"

    .line 10
    .line 11
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_2

    .line 16
    .line 17
    const-string v1, "com.tencent.qqnt.kernelpublic.nativeinterface.MsgRecord"

    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    const-string v1, ".MsgRecord"

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return v0

    .line 35
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 36
    return p0
.end method

.method private static isUsableActivity(Landroid/app/Activity;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public static log(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->shouldLogMessage(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v1, "Elaris: "

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Lcom/mr/elaris/xposedcompat/XposedBridge;->log(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public static logAlways(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->shouldLogMessage(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v1, "Elaris: "

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Lcom/mr/elaris/xposedcompat/XposedBridge;->logAlways(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method private static logMainHookCost(Ljava/lang/String;J)V
    .locals 0

    .line 1
    return-void
.end method

.method private static logOriginalImageSendEntry([Ljava/lang/Object;)V
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-wide v2, Lcom/mr/elaris/HookEntry;->sLastOriginalImageSendEntryLogAt:J

    .line 6
    .line 7
    sub-long v2, v0, v2

    .line 8
    .line 9
    const-wide/16 v4, 0x5dc

    .line 10
    .line 11
    cmp-long v2, v2, v4

    .line 12
    .line 13
    if-gez v2, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sput-wide v0, Lcom/mr/elaris/HookEntry;->sLastOriginalImageSendEntryLogAt:J

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "original image default send entry: args="

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->safeArgSummary([Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method private static logPicSummaryNoPicSend(Ljava/lang/Object;)V
    .locals 6

    .line 1
    const-string v0, "debug_log"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    sget-wide v2, Lcom/mr/elaris/HookEntry;->sLastPicSummaryNoPicLogAt:J

    .line 15
    .line 16
    sub-long v2, v0, v2

    .line 17
    .line 18
    const-wide/16 v4, 0x9c4

    .line 19
    .line 20
    cmp-long v2, v2, v4

    .line 21
    .line 22
    if-gez v2, :cond_1

    .line 23
    .line 24
    :goto_0
    return-void

    .line 25
    :cond_1
    sput-wide v0, Lcom/mr/elaris/HookEntry;->sLastPicSummaryNoPicLogAt:J

    .line 26
    .line 27
    if-nez p0, :cond_2

    .line 28
    .line 29
    const-string v0, "null"

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :goto_1
    instance-of v1, p0, Ljava/util/ArrayList;

    .line 41
    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    check-cast p0, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    goto :goto_2

    .line 51
    :cond_3
    const/4 p0, -0x1

    .line 52
    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v2, "pic summary send skipped no pic element type="

    .line 55
    .line 56
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v0, " size="

    .line 63
    .line 64
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method private static looksLikeFileCarrierObject(Ljava/lang/Object;)Z
    .locals 13

    .line 1
    sget-object v0, Lcom/mr/elaris/HookEntry;->FILE_CARRIER_CLASSES:Lx4;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p0, :cond_7

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iget-object v0, v0, Lx4;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Ljava/lang/Boolean;

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_0
    const-string v2, "qfile"

    .line 28
    .line 29
    const-string v4, "groupfile"

    .line 30
    .line 31
    const-string v5, "troopfile"

    .line 32
    .line 33
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 38
    .line 39
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-virtual {v6, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-nez v7, :cond_3

    .line 48
    .line 49
    invoke-virtual {v6, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-nez v7, :cond_3

    .line 54
    .line 55
    invoke-virtual {v6, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-nez v7, :cond_3

    .line 60
    .line 61
    const-string v7, "fileelement"

    .line 62
    .line 63
    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    if-nez v7, :cond_3

    .line 68
    .line 69
    const-string v7, "filemessage"

    .line 70
    .line 71
    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-nez v7, :cond_3

    .line 76
    .line 77
    const-string v7, "filemanager"

    .line 78
    .line 79
    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    if-nez v7, :cond_3

    .line 84
    .line 85
    const-string v7, ".file."

    .line 86
    .line 87
    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    if-eqz v6, :cond_1

    .line 92
    .line 93
    goto/16 :goto_2

    .line 94
    .line 95
    :cond_1
    move-object v6, p0

    .line 96
    move v7, v1

    .line 97
    :goto_0
    if-eqz v6, :cond_5

    .line 98
    .line 99
    const-class v8, Ljava/lang/Object;

    .line 100
    .line 101
    if-eq v6, v8, :cond_5

    .line 102
    .line 103
    const/16 v8, 0x60

    .line 104
    .line 105
    if-ge v7, v8, :cond_5

    .line 106
    .line 107
    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    array-length v9, v8

    .line 112
    rsub-int/lit8 v10, v7, 0x60

    .line 113
    .line 114
    invoke-static {v9, v10}, Ljava/lang/Math;->min(II)I

    .line 115
    .line 116
    .line 117
    move-result v9

    .line 118
    move v10, v1

    .line 119
    :goto_1
    if-ge v10, v9, :cond_4

    .line 120
    .line 121
    aget-object v11, v8, v10

    .line 122
    .line 123
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    sget-object v12, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 128
    .line 129
    invoke-virtual {v11, v12}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v11

    .line 133
    invoke-virtual {v11, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 134
    .line 135
    .line 136
    move-result v12

    .line 137
    if-nez v12, :cond_3

    .line 138
    .line 139
    invoke-virtual {v11, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 140
    .line 141
    .line 142
    move-result v12

    .line 143
    if-nez v12, :cond_3

    .line 144
    .line 145
    invoke-virtual {v11, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 146
    .line 147
    .line 148
    move-result v12

    .line 149
    if-nez v12, :cond_3

    .line 150
    .line 151
    const-string v12, "filename"

    .line 152
    .line 153
    invoke-virtual {v11, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 154
    .line 155
    .line 156
    move-result v12

    .line 157
    if-nez v12, :cond_3

    .line 158
    .line 159
    const-string v12, "filepath"

    .line 160
    .line 161
    invoke-virtual {v11, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 162
    .line 163
    .line 164
    move-result v12

    .line 165
    if-nez v12, :cond_3

    .line 166
    .line 167
    const-string v12, "filesize"

    .line 168
    .line 169
    invoke-virtual {v11, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 170
    .line 171
    .line 172
    move-result v12

    .line 173
    if-nez v12, :cond_3

    .line 174
    .line 175
    const-string v12, "fileuuid"

    .line 176
    .line 177
    invoke-virtual {v11, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 178
    .line 179
    .line 180
    move-result v12

    .line 181
    if-nez v12, :cond_3

    .line 182
    .line 183
    const-string v12, "fileid"

    .line 184
    .line 185
    invoke-virtual {v11, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 186
    .line 187
    .line 188
    move-result v12

    .line 189
    if-nez v12, :cond_3

    .line 190
    .line 191
    const-string v12, "downloadstatus"

    .line 192
    .line 193
    invoke-virtual {v11, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 194
    .line 195
    .line 196
    move-result v12

    .line 197
    if-nez v12, :cond_3

    .line 198
    .line 199
    const-string v12, "downloadurl"

    .line 200
    .line 201
    invoke-virtual {v11, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 202
    .line 203
    .line 204
    move-result v11

    .line 205
    if-eqz v11, :cond_2

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_2
    add-int/lit8 v10, v10, 0x1

    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_3
    :goto_2
    move v2, v3

    .line 212
    goto :goto_3

    .line 213
    :cond_4
    add-int/2addr v7, v9

    .line 214
    invoke-virtual {v6}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 218
    goto :goto_0

    .line 219
    :catchall_0
    :cond_5
    move v2, v1

    .line 220
    :goto_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    invoke-virtual {v0, p0, v4}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    check-cast p0, Ljava/lang/Boolean;

    .line 229
    .line 230
    if-nez p0, :cond_6

    .line 231
    .line 232
    move p0, v2

    .line 233
    goto :goto_4

    .line 234
    :cond_6
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 235
    .line 236
    .line 237
    move-result p0

    .line 238
    :goto_4
    if-eqz p0, :cond_8

    .line 239
    .line 240
    move v1, v3

    .line 241
    goto :goto_5

    .line 242
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    :cond_8
    :goto_5
    return v1
.end method

.method private static maybeHookDefaultMsgDecorations(Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hasDefaultMsgDecorations()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->hookDefaultMsgDecorations(Ljava/lang/ClassLoader;)V

    .line 11
    .line 12
    .line 13
    :cond_1
    :goto_0
    return-void
.end method

.method private static maybeHookQQShowInAio(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->hookQQShowInAio(Ljava/lang/ClassLoader;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private static maybeInstallMessageRepeater(Ljava/lang/ClassLoader;)V
    .locals 7

    .line 1
    const-string v0, "repeater hook install completed, repeater hook cost="

    .line 2
    .line 3
    sget-object v1, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 4
    .line 5
    const-string v2, "message_repeater"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const-string v3, "message_repeater_long_press_menu"

    .line 12
    .line 13
    invoke-virtual {v1, v3}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    sget-boolean v3, Lcom/mr/elaris/HookEntry;->sMessageRepeaterInstallTried:Z

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v3

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    :goto_0
    return-void

    .line 31
    :cond_1
    const/4 v1, 0x1

    .line 32
    sput-boolean v1, Lcom/mr/elaris/HookEntry;->sMessageRepeaterInstallTried:Z

    .line 33
    .line 34
    :try_start_0
    const-class v2, Lcom/mr/elaris/MessageRepeater;

    .line 35
    .line 36
    sget-object v5, Lcom/mr/elaris/MessageRepeater;->REPEATER_ICON_TAG:Ljava/lang/String;

    .line 37
    .line 38
    const-string v5, "install"

    .line 39
    .line 40
    const-class v6, Ljava/lang/ClassLoader;

    .line 41
    .line 42
    filled-new-array {v6}, [Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    invoke-virtual {v2, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 51
    .line 52
    .line 53
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const/4 v1, 0x0

    .line 58
    invoke-virtual {v2, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    new-instance p0, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    sub-long/2addr v0, v3

    .line 71
    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v0, "ms"

    .line 75
    .line 76
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :catchall_0
    move-exception p0

    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string v1, "repeater hook failed reason="

    .line 91
    .line 92
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    const-string v1, ": "

    .line 96
    .line 97
    invoke-static {p0, v0, v1}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method private static methodSig(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "."

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method public static openModuleSettings(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/QQSettingsEntryHooks;->openModuleSettings(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static patchOriginalImageArgs([Ljava/lang/Object;)V
    .locals 6

    .line 1
    if-eqz p0, :cond_b

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_4

    .line 7
    .line 8
    :cond_0
    invoke-static {p0}, Lqa;->l([Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto/16 :goto_4

    .line 15
    .line 16
    :cond_1
    sget-object v0, Lqa;->j:Ljava/lang/ThreadLocal;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lqa;->k:Ljava/lang/ThreadLocal;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 24
    .line 25
    .line 26
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->findContactArg([Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-nez v1, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    const-string v2, "chatType"

    .line 34
    .line 35
    invoke-static {v1, v2}, Lqa;->o(Ljava/lang/Object;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const/high16 v3, -0x80000000

    .line 40
    .line 41
    if-eq v2, v3, :cond_3

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_3
    const-string v2, "type"

    .line 45
    .line 46
    invoke-static {v1, v2}, Lqa;->o(Ljava/lang/Object;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-ne v2, v3, :cond_4

    .line 51
    .line 52
    :goto_0
    const/4 v2, -0x1

    .line 53
    :cond_4
    :goto_1
    const/4 v1, 0x2

    .line 54
    if-eq v2, v1, :cond_5

    .line 55
    .line 56
    const/4 v1, 0x4

    .line 57
    if-ne v2, v1, :cond_6

    .line 58
    .line 59
    :cond_5
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_6
    array-length v0, p0

    .line 65
    const/4 v1, 0x0

    .line 66
    move v2, v1

    .line 67
    :goto_2
    if-ge v2, v0, :cond_9

    .line 68
    .line 69
    aget-object v3, p0, v2

    .line 70
    .line 71
    const-string v4, "original_image_default"

    .line 72
    .line 73
    invoke-static {v4}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_8

    .line 78
    .line 79
    if-nez v3, :cond_7

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_7
    new-instance v4, Ljava/util/IdentityHashMap;

    .line 83
    .line 84
    invoke-direct {v4}, Ljava/util/IdentityHashMap;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-static {v4}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-static {v3, v1, v4}, Lqa;->j(Ljava/lang/Object;ILjava/util/Set;)I

    .line 92
    .line 93
    .line 94
    :cond_8
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_9
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 98
    .line 99
    sget-object v1, Lqa;->j:Ljava/lang/ThreadLocal;

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v0, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 110
    .line 111
    .line 112
    sget-object v1, Lqa;->k:Ljava/lang/ThreadLocal;

    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 115
    .line 116
    .line 117
    if-nez v0, :cond_b

    .line 118
    .line 119
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->safeArgSummary([Ljava/lang/Object;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 124
    .line 125
    .line 126
    move-result-wide v0

    .line 127
    sget-wide v2, Lqa;->d:J

    .line 128
    .line 129
    sub-long v2, v0, v2

    .line 130
    .line 131
    const-wide/16 v4, 0x708

    .line 132
    .line 133
    cmp-long v2, v2, v4

    .line 134
    .line 135
    if-gez v2, :cond_a

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_a
    sput-wide v0, Lqa;->d:J

    .line 139
    .line 140
    invoke-static {p0}, Lqa;->C(Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    const-string v0, "original image default no pic element: args="

    .line 145
    .line 146
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    :cond_b
    :goto_4
    return-void
.end method

.method private static prepareHostApplication(Landroid/app/Application;Ljava/lang/ClassLoader;Ly7;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/ClassLoader;
    .locals 8

    .line 1
    if-eqz p0, :cond_9

    .line 2
    .line 3
    const-string v0, "com.tencent.mobileqq"

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_3

    .line 16
    .line 17
    :cond_0
    sget-object v0, Li5;->u:Ljava/lang/ClassLoader;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 22
    .line 23
    .line 24
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    :catchall_0
    :cond_1
    if-nez v0, :cond_2

    .line 26
    .line 27
    move-object v1, p1

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    move-object v1, v0

    .line 30
    :goto_0
    if-eqz v1, :cond_3

    .line 31
    .line 32
    if-eq v1, p1, :cond_3

    .line 33
    .line 34
    const-string v0, "host runtime classloader selected source="

    .line 35
    .line 36
    const-string v2, " callback="

    .line 37
    .line 38
    invoke-static {v0, p4, v2}, La;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {p1}, Li5;->P0(Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p1, " runtime="

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-static {v1}, Li5;->P0(Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p1}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    if-eqz v1, :cond_4

    .line 69
    .line 70
    sput-object v1, Li5;->v:Ljava/lang/ClassLoader;

    .line 71
    .line 72
    :cond_4
    sget-object p1, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 73
    .line 74
    invoke-virtual {p1, p0, p4}, Lcom/mr/elaris/HookConfig;->reloadBlocking(Landroid/app/Application;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    sget-object p4, La8;->a:Ljava/lang/ref/WeakReference;

    .line 82
    .line 83
    new-instance p4, Ljava/lang/ref/WeakReference;

    .line 84
    .line 85
    invoke-direct {p4, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    sput-object p4, La8;->a:Ljava/lang/ref/WeakReference;

    .line 89
    .line 90
    sget-boolean p1, La8;->e:Z

    .line 91
    .line 92
    if-eqz p1, :cond_5

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_5
    const-class p4, La8;

    .line 96
    .line 97
    monitor-enter p4

    .line 98
    :try_start_1
    sget-boolean p1, La8;->e:Z

    .line 99
    .line 100
    if-eqz p1, :cond_6

    .line 101
    .line 102
    monitor-exit p4

    .line 103
    goto :goto_1

    .line 104
    :catchall_1
    move-exception v0

    .line 105
    move-object p0, v0

    .line 106
    goto :goto_2

    .line 107
    :cond_6
    new-instance p1, Lz7;

    .line 108
    .line 109
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, p1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 113
    .line 114
    .line 115
    const/4 p1, 0x1

    .line 116
    sput-boolean p1, La8;->e:Z

    .line 117
    .line 118
    monitor-exit p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 119
    :goto_1
    invoke-static {p0, p3}, Lcom/mr/elaris/HookEntry;->updateHostVersionSummary(Landroid/content/Context;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    sget-object p0, Lcom/mr/elaris/HookEntry;->HOST_APP_PREPARED:Ljava/util/Set;

    .line 123
    .line 124
    invoke-interface {p0, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    if-eqz p0, :cond_7

    .line 129
    .line 130
    new-instance p0, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    const-string p1, "module version loaded: 2.6.7 (1220), qq="

    .line 133
    .line 134
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostVersionSummary()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    :cond_7
    sget-boolean p0, La8;->c:Z

    .line 152
    .line 153
    if-nez p0, :cond_8

    .line 154
    .line 155
    new-instance p0, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const-string p1, "unsupported QQ version; minimum=9.3.0, business hooks skipped: "

    .line 158
    .line 159
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostVersionSummary()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    return-object v1

    .line 177
    :cond_8
    iget-boolean v3, p2, Ly7;->b:Z

    .line 178
    .line 179
    iget-boolean v4, p2, Ly7;->c:Z

    .line 180
    .line 181
    iget-boolean v5, p2, Ly7;->d:Z

    .line 182
    .line 183
    iget-boolean v6, p2, Ly7;->e:Z

    .line 184
    .line 185
    iget-boolean v7, p2, Ly7;->f:Z

    .line 186
    .line 187
    move-object v2, p3

    .line 188
    invoke-static/range {v1 .. v7}, Lcom/mr/elaris/HookEntry;->installHooks(Ljava/lang/ClassLoader;Ljava/lang/String;ZZZZZ)V

    .line 189
    .line 190
    .line 191
    return-object v1

    .line 192
    :goto_2
    :try_start_2
    monitor-exit p4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 193
    throw p0

    .line 194
    :cond_9
    :goto_3
    return-object p1
.end method

.method public static reinstallForHotReload()Z
    .locals 10

    .line 1
    invoke-static {}, La8;->a()Landroid/app/Application;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    :goto_0
    return v1

    .line 16
    :cond_1
    invoke-static {}, La8;->b()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    new-instance v5, Ljava/lang/ref/WeakReference;

    .line 25
    .line 26
    invoke-direct {v5, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    sput-object v5, La8;->a:Ljava/lang/ref/WeakReference;

    .line 30
    .line 31
    sput-object v2, Li5;->v:Ljava/lang/ClassLoader;

    .line 32
    .line 33
    invoke-static {v0, v3}, Lcom/mr/elaris/HookEntry;->updateHostVersionSummary(Landroid/content/Context;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    sget-boolean v4, La8;->c:Z

    .line 37
    .line 38
    if-nez v4, :cond_2

    .line 39
    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v2, "hot reload skipped for unsupported QQ version: "

    .line 43
    .line 44
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostVersionSummary()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return v1

    .line 62
    :cond_2
    sget-object v4, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 63
    .line 64
    const-string v5, "hot-reload"

    .line 65
    .line 66
    invoke-virtual {v4, v0, v5}, Lcom/mr/elaris/HookConfig;->reloadBlocking(Landroid/app/Application;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const-string v0, "hot reload reinstall in com.tencent.mobileqq, process="

    .line 70
    .line 71
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v3}, Lcom/mr/elaris/HookEntry;->resetInstallGuardsForHotReload(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    const-string v4, "com.tencent.mobileqq"

    .line 86
    .line 87
    if-nez v0, :cond_3

    .line 88
    .line 89
    move-object v0, v4

    .line 90
    move-object v5, v0

    .line 91
    goto :goto_1

    .line 92
    :cond_3
    move-object v0, v3

    .line 93
    move-object v5, v4

    .line 94
    :goto_1
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    const-string v6, ":MSF"

    .line 99
    .line 100
    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    const-string v7, ":tool"

    .line 109
    .line 110
    invoke-virtual {v5, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    const-string v8, ":openSdk"

    .line 119
    .line 120
    invoke-virtual {v5, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    const/4 v9, 0x1

    .line 129
    if-nez v4, :cond_4

    .line 130
    .line 131
    if-nez v6, :cond_4

    .line 132
    .line 133
    if-nez v7, :cond_4

    .line 134
    .line 135
    if-nez v0, :cond_4

    .line 136
    .line 137
    move v8, v9

    .line 138
    :goto_2
    move v5, v6

    .line 139
    move v6, v7

    .line 140
    move v7, v0

    .line 141
    goto :goto_3

    .line 142
    :cond_4
    move v8, v1

    .line 143
    goto :goto_2

    .line 144
    :goto_3
    invoke-static/range {v2 .. v8}, Lcom/mr/elaris/HookEntry;->installHooks(Ljava/lang/ClassLoader;Ljava/lang/String;ZZZZZ)V

    .line 145
    .line 146
    .line 147
    return v9
.end method

.method public static reloadRuntimeConfig(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lcom/mr/elaris/HookConfig;->reloadFromContext(Landroid/content/Context;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static resetInstallGuardsForHotReload(Ljava/lang/String;)V
    .locals 7

    .line 1
    sget-object v0, La8;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    :try_start_0
    const-string v1, "com.mr.elaris.hot_reload_generation"

    .line 5
    .line 6
    const-string v2, "0"

    .line 7
    .line 8
    invoke-static {v1, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move v1, v0

    .line 18
    :goto_0
    const v2, 0x7fffffff

    .line 19
    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    if-ne v1, v2, :cond_0

    .line 23
    .line 24
    move v1, v3

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    add-int/2addr v1, v3

    .line 27
    :goto_1
    :try_start_1
    const-string v2, "com.mr.elaris.hot_reload_generation"

    .line 28
    .line 29
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-static {v2, v4}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 34
    .line 35
    .line 36
    :catchall_1
    sget-object v2, Lo7;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    new-instance v2, Ljava/util/ArrayList;

    .line 39
    .line 40
    sget-object v4, Lo7;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 50
    .line 51
    .line 52
    move v4, v0

    .line 53
    :goto_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-ge v4, v5, :cond_2

    .line 58
    .line 59
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    check-cast v5, Ljava/util/concurrent/Future;

    .line 64
    .line 65
    if-eqz v5, :cond_1

    .line 66
    .line 67
    invoke-interface {v5, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 68
    .line 69
    .line 70
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_2
    sget-object v2, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 74
    .line 75
    const-string v3, "debug_log"

    .line 76
    .line 77
    invoke-virtual {v2, v3}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_3

    .line 82
    .line 83
    new-instance v2, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    const-string v3, "hot reload generation="

    .line 86
    .line 87
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :cond_3
    sget-object v1, Lcom/mr/elaris/HookEntry;->LOAD_DISPATCHED:Ljava/util/Set;

    .line 101
    .line 102
    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 103
    .line 104
    .line 105
    sget-object v1, Lcom/mr/elaris/HookEntry;->FIELD_CACHE:Ljava/util/Map;

    .line 106
    .line 107
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 108
    .line 109
    .line 110
    sget-object v1, Lcom/mr/elaris/HookEntry;->FIELD_MISS_CACHE:Ljava/util/Set;

    .line 111
    .line 112
    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 113
    .line 114
    .line 115
    sget-object v1, Lcom/mr/elaris/HookEntry;->DECORATION_DONE:Ljava/util/Set;

    .line 116
    .line 117
    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 118
    .line 119
    .line 120
    sget-object v1, Lcom/mr/elaris/HookEntry;->FILE_CARRIER_CLASSES:Lx4;

    .line 121
    .line 122
    iget-object v1, v1, Lx4;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 125
    .line 126
    .line 127
    sget-object v1, Lr0;->a:Ljava/util/Map;

    .line 128
    .line 129
    const-class v1, Lr0;

    .line 130
    .line 131
    monitor-enter v1

    .line 132
    :try_start_2
    sget-object v2, Lr0;->b:Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 133
    .line 134
    const/4 v3, 0x0

    .line 135
    sput-object v3, Lr0;->b:Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 136
    .line 137
    sput-boolean v0, Lr0;->c:Z

    .line 138
    .line 139
    sput-object v3, Lr0;->g:Lj0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 140
    .line 141
    if-eqz v2, :cond_4

    .line 142
    .line 143
    :try_start_3
    invoke-virtual {v2}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;->unhook()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :catchall_2
    move-exception v2

    .line 148
    :try_start_4
    const-string v4, "message-status-row"

    .line 149
    .line 150
    const-string v5, "hot-reload-unhook"

    .line 151
    .line 152
    invoke-static {v4, v5, v2}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :catchall_3
    move-exception p0

    .line 157
    goto/16 :goto_9

    .line 158
    .line 159
    :cond_4
    :goto_3
    invoke-static {}, Lr0;->d()V

    .line 160
    .line 161
    .line 162
    const-class v2, Lr0;

    .line 163
    .line 164
    monitor-enter v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 165
    :try_start_5
    sget-object v4, Lr0;->e:Lg0;

    .line 166
    .line 167
    sget-object v5, Lr0;->f:Landroid/content/Context;

    .line 168
    .line 169
    sput-object v3, Lr0;->e:Lg0;

    .line 170
    .line 171
    sput-object v3, Lr0;->f:Landroid/content/Context;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 172
    .line 173
    if-eqz v4, :cond_6

    .line 174
    .line 175
    if-nez v5, :cond_5

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_5
    :try_start_6
    invoke-virtual {v5, v4}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_6
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 179
    .line 180
    .line 181
    goto :goto_4

    .line 182
    :catchall_4
    move-exception v4

    .line 183
    :try_start_7
    const-string v5, "message-status-row"

    .line 184
    .line 185
    const-string v6, "unregister-status-receiver"

    .line 186
    .line 187
    invoke-static {v5, v6, v4}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 188
    .line 189
    .line 190
    goto :goto_4

    .line 191
    :catchall_5
    move-exception p0

    .line 192
    goto/16 :goto_8

    .line 193
    .line 194
    :catch_0
    :goto_4
    :try_start_8
    monitor-exit v2

    .line 195
    goto :goto_6

    .line 196
    :cond_6
    :goto_5
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 197
    :goto_6
    monitor-exit v1

    .line 198
    invoke-static {}, La5;->b()V

    .line 199
    .line 200
    .line 201
    sget-object v1, Ld7;->a:Ljava/util/Set;

    .line 202
    .line 203
    const-class v2, Ld7;

    .line 204
    .line 205
    monitor-enter v2

    .line 206
    :try_start_9
    sput-boolean v0, Ld7;->b:Z

    .line 207
    .line 208
    sget-object v1, Ld7;->a:Ljava/util/Set;

    .line 209
    .line 210
    monitor-enter v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 211
    :try_start_a
    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 212
    .line 213
    .line 214
    monitor-exit v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 215
    monitor-exit v2

    .line 216
    invoke-static {}, Lvc;->i()V

    .line 217
    .line 218
    .line 219
    sget-object v1, Led;->a:[Ljava/lang/String;

    .line 220
    .line 221
    const-class v4, Led;

    .line 222
    .line 223
    monitor-enter v4

    .line 224
    :try_start_b
    sput-boolean v0, Led;->f:Z

    .line 225
    .line 226
    sget-object v1, Led;->e:Ljava/util/Set;

    .line 227
    .line 228
    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 229
    .line 230
    .line 231
    const-wide/16 v1, 0x0

    .line 232
    .line 233
    sput-wide v1, Led;->g:J

    .line 234
    .line 235
    sput-wide v1, Led;->h:J
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 236
    .line 237
    monitor-exit v4

    .line 238
    invoke-static {}, Lz3;->m()V

    .line 239
    .line 240
    .line 241
    invoke-static {}, Lj4;->A()V

    .line 242
    .line 243
    .line 244
    sget-object v1, Lx7;->a:Ljava/util/Set;

    .line 245
    .line 246
    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 247
    .line 248
    .line 249
    sget-object v1, Lx7;->b:Ljava/util/Set;

    .line 250
    .line 251
    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 252
    .line 253
    .line 254
    sget-object v1, Lx7;->c:Ljava/util/Set;

    .line 255
    .line 256
    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 257
    .line 258
    .line 259
    sput-object v3, Li5;->u:Ljava/lang/ClassLoader;

    .line 260
    .line 261
    invoke-static {}, Lr3;->p()V

    .line 262
    .line 263
    .line 264
    const-string v1, "com.tencent.mobileqq"

    .line 265
    .line 266
    if-eqz p0, :cond_7

    .line 267
    .line 268
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    if-nez v2, :cond_8

    .line 273
    .line 274
    :cond_7
    move-object p0, v1

    .line 275
    :cond_8
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    const-string v3, ":MSF"

    .line 280
    .line 281
    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v3

    .line 289
    const-string v4, ":tool"

    .line 290
    .line 291
    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v4

    .line 299
    const-string v5, ":openSdk"

    .line 300
    .line 301
    invoke-virtual {v1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    sget-boolean v5, Lm7;->a:Z

    .line 310
    .line 311
    if-eqz v2, :cond_9

    .line 312
    .line 313
    sput-boolean v0, Lm7;->a:Z

    .line 314
    .line 315
    goto :goto_7

    .line 316
    :cond_9
    if-eqz v3, :cond_a

    .line 317
    .line 318
    sput-boolean v0, Lm7;->b:Z

    .line 319
    .line 320
    goto :goto_7

    .line 321
    :cond_a
    if-eqz v4, :cond_b

    .line 322
    .line 323
    sput-boolean v0, Lm7;->d:Z

    .line 324
    .line 325
    goto :goto_7

    .line 326
    :cond_b
    if-eqz v1, :cond_c

    .line 327
    .line 328
    sput-boolean v0, Lm7;->c:Z

    .line 329
    .line 330
    goto :goto_7

    .line 331
    :cond_c
    sget-object v1, Lm7;->e:Ljava/util/Set;

    .line 332
    .line 333
    invoke-interface {v1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    :goto_7
    if-eqz v2, :cond_d

    .line 337
    .line 338
    invoke-static {}, Lcom/mr/elaris/QQSettingsEntryHooks;->resetForHotReload()V

    .line 339
    .line 340
    .line 341
    invoke-static {}, Lcom/mr/elaris/HookEntry;->unhookDefaultMsgDecorations()V

    .line 342
    .line 343
    .line 344
    sput-boolean v0, Lcom/mr/elaris/HookEntry;->sDefaultDecorationsHooked:Z

    .line 345
    .line 346
    sput-boolean v0, Lcom/mr/elaris/HookEntry;->sEmotionAsPicInstalled:Z

    .line 347
    .line 348
    sput-boolean v0, Lcom/mr/elaris/HookEntry;->sMessageRepeaterInstallTried:Z

    .line 349
    .line 350
    sput-boolean v0, Lcom/mr/elaris/HookEntry;->sPicSummarySendHookInstalled:Z

    .line 351
    .line 352
    sput-boolean v0, Lcom/mr/elaris/HookEntry;->sQQShowInAioInstalled:Z

    .line 353
    .line 354
    :cond_d
    return-void

    .line 355
    :catchall_6
    move-exception p0

    .line 356
    :try_start_c
    monitor-exit v4
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 357
    throw p0

    .line 358
    :catchall_7
    move-exception p0

    .line 359
    :try_start_d
    monitor-exit v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 360
    :try_start_e
    throw p0

    .line 361
    :catchall_8
    move-exception p0

    .line 362
    monitor-exit v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 363
    throw p0

    .line 364
    :goto_8
    :try_start_f
    monitor-exit v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 365
    :try_start_10
    throw p0

    .line 366
    :goto_9
    monitor-exit v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    .line 367
    throw p0
.end method

.method public static rewriteOutgoingPicSummary(Ljava/util/ArrayList;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, v0}, Li5;->C1(Ljava/util/ArrayList;Ljava/lang/Object;Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static runMsfProcessHooks(Ljava/lang/ClassLoader;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 2
    .line 3
    const-string v1, "force_tablet_mode"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, Lh;->c(Ljava/lang/ClassLoader;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const-string v1, "block_host_hot_update"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    const-string v1, "com.tencent.mobileqq:MSF"

    .line 23
    .line 24
    invoke-static {p0, v1}, Lx7;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    const-string v1, "eq_message_guard"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-static {p0, v0}, Lc0;->h(Ljava/lang/ClassLoader;Z)V

    .line 37
    .line 38
    .line 39
    :cond_2
    return-void
.end method

.method public static runOtherProcessHooks(Ljava/lang/ClassLoader;Ljava/lang/String;)V
    .locals 6

    .line 1
    const-string v0, "other process media click-load hooks installed: "

    .line 2
    .line 3
    const-string v1, "block_host_hot_update"

    .line 4
    .line 5
    if-eqz p1, :cond_b

    .line 6
    .line 7
    const-string v2, ":peak"

    .line 8
    .line 9
    invoke-virtual {p1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    const-string v2, ":file"

    .line 16
    .line 17
    invoke-virtual {p1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    const-string v2, ":tool"

    .line 24
    .line 25
    invoke-virtual {p1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_b

    .line 30
    .line 31
    :cond_0
    sget-object v2, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    invoke-static {p0, p1}, Lx7;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    const-string v3, "media_click_to_load"

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    :try_start_0
    invoke-static {p0}, Led;->i(Ljava/lang/ClassLoader;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    new-instance v2, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v3, "other process media click-load hook failed: "

    .line 65
    .line 66
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v3, ": "

    .line 73
    .line 74
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    :goto_0
    sget-object v0, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 88
    .line 89
    const-string v2, "legacy_group_file_layout"

    .line 90
    .line 91
    invoke-virtual {v0, v2}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_3

    .line 96
    .line 97
    invoke-static {p0}, Li9;->b(Ljava/lang/ClassLoader;)I

    .line 98
    .line 99
    .line 100
    invoke-static {p0}, Lk9;->b(Ljava/lang/ClassLoader;)V

    .line 101
    .line 102
    .line 103
    :cond_3
    const-string v2, "direct_download_write"

    .line 104
    .line 105
    invoke-virtual {v0, v2}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_4

    .line 110
    .line 111
    invoke-static {p0}, La3;->i(Ljava/lang/ClassLoader;)V

    .line 112
    .line 113
    .line 114
    :cond_4
    const-string v2, "rename_apk_file"

    .line 115
    .line 116
    invoke-virtual {v0, v2}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    const-string v4, "pic_summary_enabled"

    .line 121
    .line 122
    invoke-virtual {v0, v4}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    const-string v5, "original_image_default"

    .line 127
    .line 128
    if-nez v4, :cond_6

    .line 129
    .line 130
    invoke-virtual {v0, v5}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-nez v4, :cond_6

    .line 135
    .line 136
    invoke-virtual {v0, v2}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-eqz v2, :cond_5

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_5
    const/4 v2, 0x0

    .line 144
    goto :goto_2

    .line 145
    :cond_6
    :goto_1
    const/4 v2, 0x1

    .line 146
    :goto_2
    if-nez v3, :cond_7

    .line 147
    .line 148
    if-eqz v2, :cond_b

    .line 149
    .line 150
    :cond_7
    if-eqz v3, :cond_8

    .line 151
    .line 152
    invoke-static {p0}, Lv4;->t(Ljava/lang/ClassLoader;)V

    .line 153
    .line 154
    .line 155
    :cond_8
    if-eqz v2, :cond_a

    .line 156
    .line 157
    invoke-virtual {v0, v5}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_9

    .line 162
    .line 163
    invoke-static {p0}, Lma;->g(Ljava/lang/ClassLoader;)V

    .line 164
    .line 165
    .line 166
    :cond_9
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->hookPicSummarySendMsg(Ljava/lang/ClassLoader;)V

    .line 167
    .line 168
    .line 169
    :cond_a
    const-string v0, "other process file/pic hooks installed: "

    .line 170
    .line 171
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    :cond_b
    const-string v0, "com.tencent.mobileqq:qqfav"

    .line 179
    .line 180
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_e

    .line 185
    .line 186
    sget-object v0, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 187
    .line 188
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-eqz v1, :cond_c

    .line 193
    .line 194
    invoke-static {p0, p1}, Lx7;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    :cond_c
    const-string p0, "external_browser"

    .line 198
    .line 199
    invoke-virtual {v0, p0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 200
    .line 201
    .line 202
    move-result p0

    .line 203
    if-nez p0, :cond_d

    .line 204
    .line 205
    const-string p0, "unblock_risk_web"

    .line 206
    .line 207
    invoke-virtual {v0, p0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 208
    .line 209
    .line 210
    move-result p0

    .line 211
    if-eqz p0, :cond_e

    .line 212
    .line 213
    :cond_d
    invoke-static {}, Lv4;->B()V

    .line 214
    .line 215
    .line 216
    :cond_e
    return-void
.end method

.method public static runToolProcessHooks(Ljava/lang/ClassLoader;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 2
    .line 3
    const-string v1, "legacy_group_file_layout"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, Li9;->b(Ljava/lang/ClassLoader;)I

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lk9;->b(Ljava/lang/ClassLoader;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const-string v1, "direct_download_write"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-static {p0}, La3;->i(Ljava/lang/ClassLoader;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    const-string v1, "eq_web_kernel_fallback"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    invoke-static {p0}, Lh;->d(Ljava/lang/ClassLoader;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    const-string v1, "block_host_hot_update"

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    const-string v0, "com.tencent.mobileqq:tool"

    .line 48
    .line 49
    invoke-static {p0, v0}, Lx7;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_3
    return-void
.end method

.method public static runtimeBool(Ljava/lang/String;)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static runtimeString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lcom/mr/elaris/HookConfig;->string(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method private static safeArgSummary([Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    array-length v1, p0

    .line 12
    const/16 v2, 0x8

    .line 13
    .line 14
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    move v3, v2

    .line 20
    :goto_0
    if-ge v3, v1, :cond_4

    .line 21
    .line 22
    if-lez v3, :cond_1

    .line 23
    .line 24
    const/16 v4, 0x2c

    .line 25
    .line 26
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    :cond_1
    aget-object v4, p0, v3

    .line 30
    .line 31
    if-nez v4, :cond_2

    .line 32
    .line 33
    const-string v4, "null"

    .line 34
    .line 35
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    instance-of v5, v4, Ljava/util/Collection;

    .line 51
    .line 52
    if-eqz v5, :cond_3

    .line 53
    .line 54
    const/16 v5, 0x23

    .line 55
    .line 56
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    check-cast v4, Ljava/util/Collection;

    .line 60
    .line 61
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    :cond_3
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    const/16 v1, 0xdc

    .line 76
    .line 77
    if-le p0, v1, :cond_5

    .line 78
    .line 79
    invoke-virtual {v0, v2, v1}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0
.end method

.method private static setFieldIfExists(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0, p1}, Lcom/mr/elaris/HookEntry;->findField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    const/4 v0, 0x1

    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    if-ne v1, v2, :cond_3

    .line 27
    .line 28
    instance-of v0, p2, Ljava/lang/Number;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    check-cast p2, Ljava/lang/Number;

    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    :cond_2
    invoke-virtual {p1, p0, v3}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_3
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 43
    .line 44
    if-ne v1, v2, :cond_5

    .line 45
    .line 46
    instance-of v0, p2, Ljava/lang/Number;

    .line 47
    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    check-cast p2, Ljava/lang/Number;

    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    goto :goto_0

    .line 57
    :cond_4
    const-wide/16 v0, 0x0

    .line 58
    .line 59
    :goto_0
    invoke-virtual {p1, p0, v0, v1}, Ljava/lang/reflect/Field;->setLong(Ljava/lang/Object;J)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_5
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 64
    .line 65
    if-eq v1, v2, :cond_6

    .line 66
    .line 67
    invoke-virtual {p1, p0, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_6
    instance-of v1, p2, Ljava/lang/Boolean;

    .line 72
    .line 73
    if-eqz v1, :cond_7

    .line 74
    .line 75
    check-cast p2, Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    if-nez p2, :cond_8

    .line 82
    .line 83
    :cond_7
    move v0, v3

    .line 84
    :cond_8
    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    :catchall_0
    :goto_1
    return-void
.end method

.method public static setRuntimeBool(Ljava/lang/String;Z)V
    .locals 8

    .line 1
    sget-object v0, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lcom/mr/elaris/HookConfig;->setBool(Ljava/lang/String;Z)V

    .line 4
    .line 5
    .line 6
    const-string v1, "debug_log"

    .line 7
    .line 8
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, Lcom/mr/elaris/xposedcompat/XposedBridge;->setLoggingEnabled(Z)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v2, "debug_log="

    .line 20
    .line 21
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const-string v1, "debug_log"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    new-instance v1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v2, "runtime bool changed: "

    .line 46
    .line 47
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v2, "="

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    :goto_0
    invoke-static {}, Lcom/mr/elaris/HookEntry;->currentHostClassLoader()Ljava/lang/ClassLoader;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    const-string v2, "external_browser"

    .line 73
    .line 74
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-nez v2, :cond_2

    .line 79
    .line 80
    const-string v2, "unblock_risk_web"

    .line 81
    .line 82
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_3

    .line 87
    .line 88
    :cond_2
    if-eqz p1, :cond_3

    .line 89
    .line 90
    invoke-static {}, Lv4;->B()V

    .line 91
    .line 92
    .line 93
    :cond_3
    const-string v2, "legacy_group_file_layout"

    .line 94
    .line 95
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_7

    .line 100
    .line 101
    if-eqz p1, :cond_5

    .line 102
    .line 103
    if-eqz v1, :cond_4

    .line 104
    .line 105
    invoke-static {v1}, Li9;->b(Ljava/lang/ClassLoader;)I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    new-instance v3, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    const-string v4, "legacy group file layout runtime enabled layout_count="

    .line 112
    .line 113
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-static {v2}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_4
    const-string v2, "legacy group file layout runtime enable deferred: classLoader=null"

    .line 128
    .line 129
    invoke-static {v2}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_5
    const-string v2, "runtime_disabled"

    .line 134
    .line 135
    sget-wide v3, Lk9;->c:J

    .line 136
    .line 137
    const-wide/16 v5, 0x0

    .line 138
    .line 139
    cmp-long v3, v3, v5

    .line 140
    .line 141
    if-nez v3, :cond_6

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_6
    sput-wide v5, Lk9;->c:J

    .line 145
    .line 146
    const-string v3, "legacy group file page cleared reason="

    .line 147
    .line 148
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-static {v2}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    :cond_7
    :goto_1
    const-string v2, "eq_unread_full_count"

    .line 156
    .line 157
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-eqz v2, :cond_8

    .line 162
    .line 163
    if-eqz p1, :cond_8

    .line 164
    .line 165
    if-eqz v1, :cond_8

    .line 166
    .line 167
    const-string v2, "full unread count runtime install deferred for UI stability; restart QQ to apply stable hooks"

    .line 168
    .line 169
    invoke-static {v2}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    :cond_8
    const-string v2, "disable_reply_auto_at"

    .line 173
    .line 174
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    const/4 v3, 0x0

    .line 179
    if-eqz v2, :cond_b

    .line 180
    .line 181
    if-eqz p1, :cond_9

    .line 182
    .line 183
    if-eqz v1, :cond_9

    .line 184
    .line 185
    invoke-static {v1}, Lv4;->y(Ljava/lang/ClassLoader;)V

    .line 186
    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_9
    if-nez p1, :cond_b

    .line 190
    .line 191
    :try_start_0
    sget-object v2, Loc;->a:Ljava/lang/Object;

    .line 192
    .line 193
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 194
    :try_start_1
    sget-wide v4, Loc;->h:J

    .line 195
    .line 196
    const-wide/16 v6, 0x1

    .line 197
    .line 198
    add-long/2addr v4, v6

    .line 199
    sput-wide v4, Loc;->h:J

    .line 200
    .line 201
    sget-object v4, Loc;->f:Landroid/os/Handler;

    .line 202
    .line 203
    if-eqz v4, :cond_a

    .line 204
    .line 205
    sget-object v5, Loc;->g:Lmc;

    .line 206
    .line 207
    if-eqz v5, :cond_a

    .line 208
    .line 209
    invoke-virtual {v4, v5}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 210
    .line 211
    .line 212
    goto :goto_2

    .line 213
    :catchall_0
    move-exception v4

    .line 214
    goto :goto_3

    .line 215
    :cond_a
    :goto_2
    sput-object v3, Loc;->g:Lmc;

    .line 216
    .line 217
    monitor-exit v2

    .line 218
    goto :goto_4

    .line 219
    :goto_3
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 220
    :try_start_2
    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 221
    :catchall_1
    move-exception v2

    .line 222
    const-string v4, "reply-no-at"

    .line 223
    .line 224
    const-string v5, "cancel-delayed-scrub"

    .line 225
    .line 226
    invoke-static {v4, v5, v2}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 227
    .line 228
    .line 229
    :cond_b
    :goto_4
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->isDefaultDecorationSetting(Ljava/lang/String;)Z

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    if-eqz v2, :cond_c

    .line 234
    .line 235
    sget-object v2, Lcom/mr/elaris/HookEntry;->DECORATION_DONE:Ljava/util/Set;

    .line 236
    .line 237
    invoke-interface {v2}, Ljava/util/Set;->clear()V

    .line 238
    .line 239
    .line 240
    if-eqz p1, :cond_c

    .line 241
    .line 242
    if-eqz v1, :cond_c

    .line 243
    .line 244
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->maybeHookDefaultMsgDecorations(Ljava/lang/ClassLoader;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->hookPicSummarySendMsg(Ljava/lang/ClassLoader;)V

    .line 248
    .line 249
    .line 250
    :cond_c
    const-string v2, "eq_home_pull_guard"

    .line 251
    .line 252
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    if-eqz v2, :cond_e

    .line 257
    .line 258
    if-eqz p1, :cond_d

    .line 259
    .line 260
    if-eqz v1, :cond_d

    .line 261
    .line 262
    invoke-static {}, Lcom/mr/elaris/HookEntry;->getHostSourceDir()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    invoke-static {v1, v2}, Lga;->i(Ljava/lang/ClassLoader;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    goto :goto_5

    .line 270
    :cond_d
    if-nez p1, :cond_e

    .line 271
    .line 272
    invoke-static {}, Lga;->c()V

    .line 273
    .line 274
    .line 275
    :cond_e
    :goto_5
    const-string v2, "message_repeater"

    .line 276
    .line 277
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    if-nez v2, :cond_f

    .line 282
    .line 283
    const-string v2, "message_repeater_long_press_menu"

    .line 284
    .line 285
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    if-eqz v2, :cond_10

    .line 290
    .line 291
    :cond_f
    invoke-static {v1}, Lcom/mr/elaris/MessageRepeater;->onRuntimeSettingsChanged(Ljava/lang/ClassLoader;)V

    .line 292
    .line 293
    .line 294
    if-eqz p1, :cond_10

    .line 295
    .line 296
    if-eqz v1, :cond_10

    .line 297
    .line 298
    new-instance v2, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    const-string v4, "repeater runtime switch enabled key="

    .line 301
    .line 302
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    invoke-static {v2}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    const-string v2, "Elaris-repeater-runtime"

    .line 316
    .line 317
    new-instance v4, Lf7;

    .line 318
    .line 319
    const/4 v5, 0x2

    .line 320
    invoke-direct {v4, v5, v1}, Lf7;-><init>(ILjava/lang/ClassLoader;)V

    .line 321
    .line 322
    .line 323
    invoke-static {v2, v4}, Lo7;->a(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 324
    .line 325
    .line 326
    :cond_10
    const-string v2, "keep_fire_enabled"

    .line 327
    .line 328
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    if-eqz v2, :cond_13

    .line 333
    .line 334
    if-eqz p1, :cond_13

    .line 335
    .line 336
    if-eqz v1, :cond_11

    .line 337
    .line 338
    sput-object v1, Lcom/mr/elaris/f;->c:Ljava/lang/ClassLoader;

    .line 339
    .line 340
    goto :goto_6

    .line 341
    :cond_11
    sget-object v2, Lcom/mr/elaris/f;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 342
    .line 343
    :goto_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 344
    .line 345
    .line 346
    move-result-wide v4

    .line 347
    const-wide/32 v6, 0xea60

    .line 348
    .line 349
    .line 350
    add-long/2addr v4, v6

    .line 351
    sget-wide v6, Lcom/mr/elaris/f;->h:J

    .line 352
    .line 353
    cmp-long v2, v4, v6

    .line 354
    .line 355
    if-lez v2, :cond_12

    .line 356
    .line 357
    sput-wide v4, Lcom/mr/elaris/f;->h:J

    .line 358
    .line 359
    :cond_12
    invoke-static {}, Lcom/mr/elaris/f;->u()V

    .line 360
    .line 361
    .line 362
    :cond_13
    const-string v2, "group_admin_avatar_menu"

    .line 363
    .line 364
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v2

    .line 368
    if-eqz v2, :cond_14

    .line 369
    .line 370
    invoke-static {p1}, Ls6;->D0(Z)V

    .line 371
    .line 372
    .line 373
    if-eqz p1, :cond_14

    .line 374
    .line 375
    invoke-static {v1}, Ls6;->I(Ljava/lang/ClassLoader;)V

    .line 376
    .line 377
    .line 378
    :cond_14
    const-string v2, "rename_apk_file"

    .line 379
    .line 380
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v2

    .line 384
    if-eqz v2, :cond_15

    .line 385
    .line 386
    if-eqz p1, :cond_15

    .line 387
    .line 388
    if-eqz v1, :cond_15

    .line 389
    .line 390
    invoke-static {v1}, Lv4;->t(Ljava/lang/ClassLoader;)V

    .line 391
    .line 392
    .line 393
    :cond_15
    const-string v2, "emotion_as_pic"

    .line 394
    .line 395
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v2

    .line 399
    if-eqz v2, :cond_16

    .line 400
    .line 401
    if-eqz p1, :cond_16

    .line 402
    .line 403
    if-eqz v1, :cond_16

    .line 404
    .line 405
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->hookEmotionAsPic(Ljava/lang/ClassLoader;)V

    .line 406
    .line 407
    .line 408
    :cond_16
    const-string v2, "media_click_to_load"

    .line 409
    .line 410
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move-result v2

    .line 414
    if-eqz v2, :cond_17

    .line 415
    .line 416
    if-eqz p1, :cond_17

    .line 417
    .line 418
    if-eqz v1, :cond_17

    .line 419
    .line 420
    invoke-static {v1}, Led;->i(Ljava/lang/ClassLoader;)V

    .line 421
    .line 422
    .line 423
    :cond_17
    const-string v2, "clean_emoji_panel_entries"

    .line 424
    .line 425
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    if-eqz v2, :cond_18

    .line 430
    .line 431
    if-eqz p1, :cond_18

    .line 432
    .line 433
    if-eqz v1, :cond_18

    .line 434
    .line 435
    invoke-static {v1}, Lz3;->j(Ljava/lang/ClassLoader;)V

    .line 436
    .line 437
    .line 438
    :cond_18
    const-string v2, "favorite_emoticon_batch_send"

    .line 439
    .line 440
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v2

    .line 444
    if-eqz v2, :cond_1a

    .line 445
    .line 446
    if-eqz p1, :cond_19

    .line 447
    .line 448
    if-eqz v1, :cond_19

    .line 449
    .line 450
    invoke-static {v1}, Lj4;->p(Ljava/lang/ClassLoader;)V

    .line 451
    .line 452
    .line 453
    goto :goto_7

    .line 454
    :cond_19
    if-nez p1, :cond_1a

    .line 455
    .line 456
    const-string v2, "runtime_disabled"

    .line 457
    .line 458
    invoke-static {v3, v2}, Ls4;->f(Lf2;Ljava/lang/String;)V

    .line 459
    .line 460
    .line 461
    :cond_1a
    :goto_7
    const-string v2, "cloud_sticker_panel"

    .line 462
    .line 463
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result v2

    .line 467
    if-eqz v2, :cond_1c

    .line 468
    .line 469
    if-eqz p1, :cond_1b

    .line 470
    .line 471
    invoke-static {v1}, Lg2;->i(Ljava/lang/ClassLoader;)V

    .line 472
    .line 473
    .line 474
    goto :goto_8

    .line 475
    :cond_1b
    sget-object v2, Lg2;->a:Ljava/util/Set;

    .line 476
    .line 477
    :cond_1c
    :goto_8
    const-string v2, "voice_message_actions"

    .line 478
    .line 479
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v2

    .line 483
    if-eqz v2, :cond_1d

    .line 484
    .line 485
    if-eqz p1, :cond_1d

    .line 486
    .line 487
    if-eqz v1, :cond_1d

    .line 488
    .line 489
    invoke-static {v1}, Lcom/mr/elaris/w;->P(Ljava/lang/ClassLoader;)V

    .line 490
    .line 491
    .line 492
    :cond_1d
    const-string v2, "aio_input_bar_enabled"

    .line 493
    .line 494
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    move-result v2

    .line 498
    if-eqz v2, :cond_1e

    .line 499
    .line 500
    if-nez p1, :cond_1f

    .line 501
    .line 502
    :cond_1e
    const-string v2, "hide_aio_input_camera_entries"

    .line 503
    .line 504
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move-result v2

    .line 508
    if-eqz v2, :cond_20

    .line 509
    .line 510
    if-eqz p1, :cond_20

    .line 511
    .line 512
    const-string v2, "aio_input_bar_migrated"

    .line 513
    .line 514
    invoke-virtual {v0, v2}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 515
    .line 516
    .line 517
    move-result v0

    .line 518
    if-nez v0, :cond_20

    .line 519
    .line 520
    :cond_1f
    invoke-static {v1}, Lj;->c(Ljava/lang/ClassLoader;)V

    .line 521
    .line 522
    .line 523
    :cond_20
    const-string v0, "album_video_bubble"

    .line 524
    .line 525
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result v0

    .line 529
    if-eqz v0, :cond_21

    .line 530
    .line 531
    if-eqz p1, :cond_21

    .line 532
    .line 533
    if-eqz v1, :cond_21

    .line 534
    .line 535
    invoke-static {v1}, Ls;->g(Ljava/lang/ClassLoader;)V

    .line 536
    .line 537
    .line 538
    :cond_21
    const-string v0, "original_image_default"

    .line 539
    .line 540
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    move-result v0

    .line 544
    if-eqz v0, :cond_22

    .line 545
    .line 546
    if-eqz p1, :cond_22

    .line 547
    .line 548
    const-string v0, "original image default embedded send mode enabled"

    .line 549
    .line 550
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    if-eqz v1, :cond_22

    .line 554
    .line 555
    invoke-static {v1}, Lma;->g(Ljava/lang/ClassLoader;)V

    .line 556
    .line 557
    .line 558
    :cond_22
    const-string v0, "flash_pic_as_image"

    .line 559
    .line 560
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    move-result v0

    .line 564
    if-eqz v0, :cond_24

    .line 565
    .line 566
    if-eqz p1, :cond_23

    .line 567
    .line 568
    if-eqz v1, :cond_23

    .line 569
    .line 570
    invoke-static {v1}, La5;->f(Ljava/lang/ClassLoader;)V

    .line 571
    .line 572
    .line 573
    goto :goto_9

    .line 574
    :cond_23
    if-nez p1, :cond_24

    .line 575
    .line 576
    invoke-static {}, La5;->b()V

    .line 577
    .line 578
    .line 579
    :cond_24
    :goto_9
    const-string v0, "pic_summary_enabled"

    .line 580
    .line 581
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    move-result v0

    .line 585
    if-nez v0, :cond_25

    .line 586
    .line 587
    const-string v0, "original_image_default"

    .line 588
    .line 589
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    if-nez v0, :cond_25

    .line 594
    .line 595
    const-string v0, "rename_apk_file"

    .line 596
    .line 597
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 598
    .line 599
    .line 600
    move-result v0

    .line 601
    if-eqz v0, :cond_26

    .line 602
    .line 603
    :cond_25
    if-eqz p1, :cond_26

    .line 604
    .line 605
    if-eqz v1, :cond_26

    .line 606
    .line 607
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->hookPicSummarySendMsg(Ljava/lang/ClassLoader;)V

    .line 608
    .line 609
    .line 610
    :cond_26
    const-string v0, "eq_message_guard"

    .line 611
    .line 612
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 613
    .line 614
    .line 615
    move-result v0

    .line 616
    const/4 v2, 0x1

    .line 617
    if-eqz v0, :cond_28

    .line 618
    .line 619
    if-eqz p1, :cond_27

    .line 620
    .line 621
    if-eqz v1, :cond_27

    .line 622
    .line 623
    invoke-static {v1, v2}, Lc0;->h(Ljava/lang/ClassLoader;Z)V

    .line 624
    .line 625
    .line 626
    :cond_27
    invoke-static {v1}, Lr0;->n(Ljava/lang/ClassLoader;)V

    .line 627
    .line 628
    .line 629
    :cond_28
    const-string v0, "chat_message_corner_time"

    .line 630
    .line 631
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 632
    .line 633
    .line 634
    move-result v0

    .line 635
    if-eqz v0, :cond_29

    .line 636
    .line 637
    invoke-static {v1}, Lr0;->n(Ljava/lang/ClassLoader;)V

    .line 638
    .line 639
    .line 640
    :cond_29
    const-string v0, "hide_official_center_time"

    .line 641
    .line 642
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 643
    .line 644
    .line 645
    move-result v0

    .line 646
    if-eqz v0, :cond_2a

    .line 647
    .line 648
    if-eqz p1, :cond_2a

    .line 649
    .line 650
    if-eqz v1, :cond_2a

    .line 651
    .line 652
    invoke-static {v1}, Ld7;->b(Ljava/lang/ClassLoader;)V

    .line 653
    .line 654
    .line 655
    :cond_2a
    const-string v0, "self_message_left_side"

    .line 656
    .line 657
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 658
    .line 659
    .line 660
    move-result v0

    .line 661
    if-eqz v0, :cond_2c

    .line 662
    .line 663
    if-eqz p1, :cond_2b

    .line 664
    .line 665
    if-eqz v1, :cond_2b

    .line 666
    .line 667
    invoke-static {v1}, Lvc;->h(Ljava/lang/ClassLoader;)V

    .line 668
    .line 669
    .line 670
    goto :goto_a

    .line 671
    :cond_2b
    if-nez p1, :cond_2c

    .line 672
    .line 673
    sget-object v0, Lvc;->d:Ljava/lang/ThreadLocal;

    .line 674
    .line 675
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 676
    .line 677
    .line 678
    invoke-static {}, Lyc;->b()V

    .line 679
    .line 680
    .line 681
    :cond_2c
    :goto_a
    const-string v0, "allow_forbid_card"

    .line 682
    .line 683
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 684
    .line 685
    .line 686
    move-result v0

    .line 687
    if-eqz v0, :cond_2d

    .line 688
    .line 689
    if-eqz p1, :cond_2d

    .line 690
    .line 691
    if-eqz v1, :cond_2d

    .line 692
    .line 693
    invoke-static {v1}, Lv4;->r(Ljava/lang/ClassLoader;)V

    .line 694
    .line 695
    .line 696
    :cond_2d
    const-string v0, "block_annoying_popups"

    .line 697
    .line 698
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 699
    .line 700
    .line 701
    move-result v0

    .line 702
    if-eqz v0, :cond_2e

    .line 703
    .line 704
    if-eqz p1, :cond_2e

    .line 705
    .line 706
    if-eqz v1, :cond_2e

    .line 707
    .line 708
    invoke-static {v1}, Lv4;->s(Ljava/lang/ClassLoader;)V

    .line 709
    .line 710
    .line 711
    :cond_2e
    const-string v0, "force_tablet_mode"

    .line 712
    .line 713
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 714
    .line 715
    .line 716
    move-result v0

    .line 717
    if-eqz v0, :cond_2f

    .line 718
    .line 719
    if-eqz p1, :cond_2f

    .line 720
    .line 721
    if-eqz v1, :cond_2f

    .line 722
    .line 723
    const-string v0, "tablet mode runtime enabled; restart QQ for MSF login/device-type handshake"

    .line 724
    .line 725
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 726
    .line 727
    .line 728
    :cond_2f
    const-string v0, "block_qq_show"

    .line 729
    .line 730
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 731
    .line 732
    .line 733
    move-result v0

    .line 734
    if-eqz v0, :cond_33

    .line 735
    .line 736
    if-eqz v1, :cond_30

    .line 737
    .line 738
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->hookQQShowInAio(Ljava/lang/ClassLoader;)V

    .line 739
    .line 740
    .line 741
    :cond_30
    if-eqz p1, :cond_31

    .line 742
    .line 743
    if-eqz v1, :cond_31

    .line 744
    .line 745
    invoke-static {v1}, Lv4;->x(Ljava/lang/ClassLoader;)V

    .line 746
    .line 747
    .line 748
    const-string v0, "runtime QQShow enabled with callback gate"

    .line 749
    .line 750
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 751
    .line 752
    .line 753
    goto :goto_c

    .line 754
    :cond_31
    if-nez p1, :cond_33

    .line 755
    .line 756
    sget-object v0, Lrb;->a:Ljava/lang/Object;

    .line 757
    .line 758
    monitor-enter v0

    .line 759
    :try_start_3
    new-instance v3, Ljava/util/HashMap;

    .line 760
    .line 761
    sget-object v4, Lrb;->c:Ljava/util/WeakHashMap;

    .line 762
    .line 763
    invoke-direct {v3, v4}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v4}, Ljava/util/WeakHashMap;->clear()V

    .line 767
    .line 768
    .line 769
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 770
    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 779
    .line 780
    .line 781
    move-result v3

    .line 782
    if-eqz v3, :cond_33

    .line 783
    .line 784
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v3

    .line 788
    check-cast v3, Ljava/util/Map$Entry;

    .line 789
    .line 790
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v4

    .line 794
    check-cast v4, Landroid/view/View;

    .line 795
    .line 796
    if-nez v4, :cond_32

    .line 797
    .line 798
    goto :goto_b

    .line 799
    :cond_32
    :try_start_4
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object v3

    .line 803
    check-cast v3, Ljava/lang/Runnable;

    .line 804
    .line 805
    invoke-virtual {v4, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 806
    .line 807
    .line 808
    goto :goto_b

    .line 809
    :catchall_2
    move-exception v3

    .line 810
    const-string v4, "qqshow-sidebar"

    .line 811
    .line 812
    const-string v5, "cleanup-cancel"

    .line 813
    .line 814
    invoke-static {v4, v5, v3}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 815
    .line 816
    .line 817
    goto :goto_b

    .line 818
    :catchall_3
    move-exception p0

    .line 819
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 820
    throw p0

    .line 821
    :cond_33
    :goto_c
    const-string v0, "notice_block_at_all"

    .line 822
    .line 823
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 824
    .line 825
    .line 826
    move-result v0

    .line 827
    if-nez v0, :cond_34

    .line 828
    .line 829
    const-string v0, "notice_block_group_todo"

    .line 830
    .line 831
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 832
    .line 833
    .line 834
    move-result v0

    .line 835
    if-eqz v0, :cond_35

    .line 836
    .line 837
    :cond_34
    if-eqz p1, :cond_35

    .line 838
    .line 839
    if-eqz v1, :cond_35

    .line 840
    .line 841
    const-string v0, "Elaris-notice-gate-runtime"

    .line 842
    .line 843
    new-instance v3, Lf7;

    .line 844
    .line 845
    const/4 v4, 0x0

    .line 846
    invoke-direct {v3, v4, v1}, Lf7;-><init>(ILjava/lang/ClassLoader;)V

    .line 847
    .line 848
    .line 849
    invoke-static {v0, v3}, Lo7;->a(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 850
    .line 851
    .line 852
    :cond_35
    const-string v0, "eq_chat_edge_guard"

    .line 853
    .line 854
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 855
    .line 856
    .line 857
    move-result v0

    .line 858
    if-eqz v0, :cond_36

    .line 859
    .line 860
    if-eqz p1, :cond_36

    .line 861
    .line 862
    if-eqz v1, :cond_36

    .line 863
    .line 864
    const-string v0, "Elaris-chat-right-swipe-runtime"

    .line 865
    .line 866
    new-instance v3, Lf7;

    .line 867
    .line 868
    invoke-direct {v3, v2, v1}, Lf7;-><init>(ILjava/lang/ClassLoader;)V

    .line 869
    .line 870
    .line 871
    invoke-static {v0, v3}, Lo7;->a(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 872
    .line 873
    .line 874
    :cond_36
    const-string v0, "eq_web_kernel_fallback"

    .line 875
    .line 876
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 877
    .line 878
    .line 879
    move-result v0

    .line 880
    if-eqz v0, :cond_37

    .line 881
    .line 882
    if-eqz p1, :cond_37

    .line 883
    .line 884
    if-eqz v1, :cond_37

    .line 885
    .line 886
    invoke-static {v1}, Lh;->d(Ljava/lang/ClassLoader;)V

    .line 887
    .line 888
    .line 889
    :cond_37
    const-string v0, "block_host_hot_update"

    .line 890
    .line 891
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 892
    .line 893
    .line 894
    move-result v0

    .line 895
    if-eqz v0, :cond_38

    .line 896
    .line 897
    if-eqz p1, :cond_38

    .line 898
    .line 899
    if-eqz v1, :cond_38

    .line 900
    .line 901
    invoke-static {}, La8;->b()Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v0

    .line 905
    invoke-static {v1, v0}, Lx7;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)V

    .line 906
    .line 907
    .line 908
    const-string v0, "host hot update runtime enabled; restart QQ for earliest Tinker/QFix blocking"

    .line 909
    .line 910
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 911
    .line 912
    .line 913
    :cond_38
    const-string v0, "block_profile_card_decor"

    .line 914
    .line 915
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 916
    .line 917
    .line 918
    move-result v0

    .line 919
    if-eqz v0, :cond_3a

    .line 920
    .line 921
    if-eqz p1, :cond_3a

    .line 922
    .line 923
    if-eqz v1, :cond_39

    .line 924
    .line 925
    invoke-static {v1}, Lv4;->w(Ljava/lang/ClassLoader;)V

    .line 926
    .line 927
    .line 928
    :cond_39
    const-string v0, "profile card decor runtime install uses bounded hooks only"

    .line 929
    .line 930
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 931
    .line 932
    .line 933
    :cond_3a
    const-string v0, "block_avatar_pendant"

    .line 934
    .line 935
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 936
    .line 937
    .line 938
    move-result p0

    .line 939
    if-eqz p0, :cond_3c

    .line 940
    .line 941
    if-eqz p1, :cond_3c

    .line 942
    .line 943
    if-eqz v1, :cond_3b

    .line 944
    .line 945
    invoke-static {v1}, Lv4;->u(Ljava/lang/ClassLoader;)V

    .line 946
    .line 947
    .line 948
    :cond_3b
    const-string p0, "avatar pendant runtime install uses bounded hooks only"

    .line 949
    .line 950
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 951
    .line 952
    .line 953
    :cond_3c
    return-void
.end method

.method public static setRuntimeString(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lcom/mr/elaris/HookConfig;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "direct_download_write_dir"

    .line 7
    .line 8
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const-string v1, ""

    .line 15
    .line 16
    sput-object v1, La3;->f:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    sput-object v2, La3;->g:Ljava/io/File;

    .line 20
    .line 21
    sput-object v1, La3;->h:Ljava/lang/String;

    .line 22
    .line 23
    :cond_0
    const-string v1, "aio_input_bar_hidden_ids"

    .line 24
    .line 25
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    const-string p0, "aio_input_bar_enabled"

    .line 32
    .line 33
    invoke-virtual {v0, p0}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    const-string v1, "aio_input_bar_migrated"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const-string v2, "hide_aio_input_camera_entries"

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-static {p1, p0, v1, v0}, Li5;->F0(Ljava/lang/String;ZZZ)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_1

    .line 54
    .line 55
    invoke-static {}, Lcom/mr/elaris/HookEntry;->currentHostClassLoader()Ljava/lang/ClassLoader;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {p0}, Lj;->c(Ljava/lang/ClassLoader;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    return-void
.end method

.method public static shouldLogMessage(Ljava/lang/String;)Z
    .locals 3

    .line 1
    sget-object v0, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 2
    .line 3
    const-string v1, "debug_log"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    if-nez p0, :cond_1

    .line 15
    .line 16
    return v0

    .line 17
    :cond_1
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string v2, "debug_log="

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_3

    .line 30
    .line 31
    const-string v2, "hot reload"

    .line 32
    .line 33
    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_3

    .line 38
    .line 39
    const-string v2, "modern dispatch failed"

    .line 40
    .line 41
    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_3

    .line 46
    .line 47
    const-string v2, "send failed"

    .line 48
    .line 49
    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-nez v2, :cond_3

    .line 54
    .line 55
    const-string v2, "auto clock-in failed"

    .line 56
    .line 57
    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-nez v2, :cond_3

    .line 62
    .line 63
    const-string v2, "keep-fire auto failed"

    .line 64
    .line 65
    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-nez v2, :cond_3

    .line 70
    .line 71
    const-string v2, "pending after max attempts"

    .line 72
    .line 73
    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-nez v2, :cond_3

    .line 78
    .line 79
    const-string v2, "fatal"

    .line 80
    .line 81
    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-nez v2, :cond_3

    .line 86
    .line 87
    const-string v2, "crash"

    .line 88
    .line 89
    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-nez v2, :cond_3

    .line 94
    .line 95
    const-string v2, "timeout"

    .line 96
    .line 97
    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    if-eqz p0, :cond_2

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_2
    return v0

    .line 105
    :cond_3
    :goto_0
    return v1
.end method

.method public static stripMsgRecordDecorations(Ljava/lang/Object;)V
    .locals 5

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sget-object v2, Lcom/mr/elaris/HookEntry;->DECORATION_DONE:Ljava/util/Set;

    .line 19
    .line 20
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const/16 v4, 0x1000

    .line 25
    .line 26
    if-lt v3, v4, :cond_1

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Set;->clear()V

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_4

    .line 36
    .line 37
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->looksLikeFileCarrierObject(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    sget-object v1, Lcom/mr/elaris/HookEntry;->CONFIG:Lcom/mr/elaris/HookConfig;

    .line 45
    .line 46
    const-string v2, "block_avatar_pendant"

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    const-string v1, "avatarPendant"

    .line 55
    .line 56
    const-string v2, ""

    .line 57
    .line 58
    invoke-static {p0, v1, v2}, Lcom/mr/elaris/HookEntry;->setFieldIfExists(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    const-string v1, "avatarPendantId"

    .line 62
    .line 63
    invoke-static {p0, v1, v0}, Lcom/mr/elaris/HookEntry;->setFieldIfExists(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    const-string v1, "pendantId"

    .line 67
    .line 68
    invoke-static {p0, v1, v0}, Lcom/mr/elaris/HookEntry;->setFieldIfExists(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hasDefaultMsgDecorations()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->forceDefaultMsgAttributeInfo(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    const-string v0, "msgAttrs"

    .line 81
    .line 82
    invoke-static {p0, v0}, Lcom/mr/elaris/HookEntry;->forceDefaultMsgDecorationField(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const-string v0, "msgAttr"

    .line 86
    .line 87
    invoke-static {p0, v0}, Lcom/mr/elaris/HookEntry;->forceDefaultMsgDecorationField(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const-string v0, "msgAttributeInfo"

    .line 91
    .line 92
    invoke-static {p0, v0}, Lcom/mr/elaris/HookEntry;->forceDefaultMsgDecorationField(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    const-string v0, "msgElements"

    .line 96
    .line 97
    invoke-static {p0, v0}, Lcom/mr/elaris/HookEntry;->forceDefaultMsgDecorationField(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    const-string v0, "elements"

    .line 101
    .line 102
    invoke-static {p0, v0}, Lcom/mr/elaris/HookEntry;->forceDefaultMsgDecorationField(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const-string v0, "elems"

    .line 106
    .line 107
    invoke-static {p0, v0}, Lcom/mr/elaris/HookEntry;->forceDefaultMsgDecorationField(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    const-string v0, "richText"

    .line 111
    .line 112
    invoke-static {p0, v0}, Lcom/mr/elaris/HookEntry;->forceDefaultMsgDecorationField(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    .line 115
    :catchall_0
    :cond_4
    :goto_0
    return-void
.end method

.method private static stripOutgoingMsgDecorations(Ljava/lang/Object;ILjava/util/Set;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "I",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_d

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    if-gt p1, v0, :cond_d

    .line 5
    .line 6
    if-eqz p2, :cond_d

    .line 7
    .line 8
    invoke-interface {p2, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_5

    .line 15
    .line 16
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    .line 17
    .line 18
    if-nez v0, :cond_d

    .line 19
    .line 20
    instance-of v0, p0, Ljava/lang/Number;

    .line 21
    .line 22
    if-nez v0, :cond_d

    .line 23
    .line 24
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 25
    .line 26
    if-nez v0, :cond_d

    .line 27
    .line 28
    instance-of v0, p0, Landroid/content/Context;

    .line 29
    .line 30
    if-nez v0, :cond_d

    .line 31
    .line 32
    instance-of v0, p0, Landroid/view/View;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->stripMsgRecordDecorations(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    instance-of v0, p0, Ljava/lang/Iterable;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    const/4 v2, 0x1

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    check-cast p0, Ljava/lang/Iterable;

    .line 50
    .line 51
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_d

    .line 60
    .line 61
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    add-int/lit8 v3, p1, 0x1

    .line 66
    .line 67
    invoke-static {v0, v3, p2}, Lcom/mr/elaris/HookEntry;->stripOutgoingMsgDecorations(Ljava/lang/Object;ILjava/util/Set;)V

    .line 68
    .line 69
    .line 70
    add-int/2addr v1, v2

    .line 71
    const/16 v0, 0x60

    .line 72
    .line 73
    if-lt v1, v0, :cond_2

    .line 74
    .line 75
    goto/16 :goto_5

    .line 76
    .line 77
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-nez v3, :cond_d

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-nez v3, :cond_d

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_4

    .line 98
    .line 99
    goto/16 :goto_5

    .line 100
    .line 101
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    const-string v4, "com.tencent."

    .line 106
    .line 107
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    if-nez v5, :cond_5

    .line 112
    .line 113
    const-string v5, "java.util."

    .line 114
    .line 115
    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-nez v3, :cond_5

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_5
    :goto_0
    if-eqz v0, :cond_d

    .line 123
    .line 124
    const-class v3, Ljava/lang/Object;

    .line 125
    .line 126
    if-eq v0, v3, :cond_d

    .line 127
    .line 128
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 129
    .line 130
    .line 131
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    goto :goto_1

    .line 133
    :catchall_0
    const/4 v3, 0x0

    .line 134
    :goto_1
    if-nez v3, :cond_6

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_6
    array-length v5, v3

    .line 138
    move v6, v1

    .line 139
    move v7, v6

    .line 140
    :goto_2
    if-ge v6, v5, :cond_c

    .line 141
    .line 142
    aget-object v8, v3, v6

    .line 143
    .line 144
    :try_start_1
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 149
    .line 150
    .line 151
    move-result v9

    .line 152
    if-nez v9, :cond_b

    .line 153
    .line 154
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    invoke-virtual {v9}, Ljava/lang/Class;->isPrimitive()Z

    .line 159
    .line 160
    .line 161
    move-result v9

    .line 162
    if-eqz v9, :cond_7

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_7
    invoke-virtual {v8, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v8, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    if-nez v8, :cond_8

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_8
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v9

    .line 183
    instance-of v10, v8, Ljava/lang/Iterable;

    .line 184
    .line 185
    if-nez v10, :cond_9

    .line 186
    .line 187
    invoke-virtual {v9, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 188
    .line 189
    .line 190
    move-result v9

    .line 191
    if-eqz v9, :cond_a

    .line 192
    .line 193
    :cond_9
    add-int/lit8 v9, p1, 0x1

    .line 194
    .line 195
    invoke-static {v8, v9, p2}, Lcom/mr/elaris/HookEntry;->stripOutgoingMsgDecorations(Ljava/lang/Object;ILjava/util/Set;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 196
    .line 197
    .line 198
    :cond_a
    add-int/lit8 v7, v7, 0x1

    .line 199
    .line 200
    const/16 v8, 0x30

    .line 201
    .line 202
    if-lt v7, v8, :cond_b

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :catchall_1
    :cond_b
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_c
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    goto :goto_0

    .line 213
    :cond_d
    :goto_5
    return-void
.end method

.method private static stripOutgoingMsgDecorations(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "*>;)V"
        }
    .end annotation

    if-eqz p0, :cond_2

    .line 214
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 215
    :cond_0
    :try_start_0
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    .line 216
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    move v2, v1

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 217
    invoke-static {v3, v1, v0}, Lcom/mr/elaris/HookEntry;->stripOutgoingMsgDecorations(Ljava/lang/Object;ILjava/util/Set;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v2, v2, 0x1

    const/16 v3, 0x60

    if-lt v2, v3, :cond_1

    :catchall_0
    :cond_2
    :goto_0
    return-void
.end method

.method public static topActivity()Landroid/app/Activity;
    .locals 3

    .line 1
    sget-object v0, La8;->d:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move-object v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroid/app/Activity;

    .line 13
    .line 14
    :goto_0
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->isUsableActivity(Landroid/app/Activity;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    return-object v1
.end method

.method private static unhookDefaultMsgDecorations()V
    .locals 5

    .line 1
    sget-object v0, Lcom/mr/elaris/HookEntry;->DEFAULT_DECORATION_UNHOOKS:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 19
    .line 20
    :try_start_1
    invoke-virtual {v2}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;->unhook()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v2

    .line 25
    :try_start_2
    const-string v3, "default-msg-decorations"

    .line 26
    .line 27
    const-string v4, "hot-reload-unhook"

    .line 28
    .line 29
    invoke-static {v3, v4, v2}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_1
    move-exception v1

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    sget-object v1, Lcom/mr/elaris/HookEntry;->DEFAULT_DECORATION_UNHOOKS:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 38
    .line 39
    .line 40
    monitor-exit v0

    .line 41
    return-void

    .line 42
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 43
    throw v1
.end method

.method private static updateHostVersionSummary(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "com.tencent.mobileqq"

    .line 2
    .line 3
    sget-object v1, La8;->a:Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_6

    .line 8
    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    iget-object v0, p0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object v0, p0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_5

    .line 34
    :cond_2
    :goto_0
    const-string v0, "unknown"

    .line 35
    .line 36
    :goto_1
    invoke-virtual {p0}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    new-instance p0, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v4, "("

    .line 49
    .line 50
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v2, "), process="

    .line 57
    .line 58
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    sput-object p0, La8;->b:Ljava/lang/String;

    .line 69
    .line 70
    if-nez v0, :cond_4

    .line 71
    .line 72
    :catch_0
    :cond_3
    :goto_2
    move v4, v1

    .line 73
    goto :goto_4

    .line 74
    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    const/16 v0, 0x2e

    .line 79
    .line 80
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-lez v2, :cond_3

    .line 85
    .line 86
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    const/4 v4, 0x1

    .line 91
    sub-int/2addr v3, v4

    .line 92
    if-ne v2, v3, :cond_5

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_5
    add-int/lit8 v3, v2, 0x1

    .line 96
    .line 97
    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->indexOf(II)I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    if-gez v0, :cond_6

    .line 106
    .line 107
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    goto :goto_3

    .line 112
    :cond_6
    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    :goto_3
    :try_start_1
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    move-result p0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    const/16 v2, 0x9

    .line 125
    .line 126
    if-gt v0, v2, :cond_7

    .line 127
    .line 128
    if-ne v0, v2, :cond_3

    .line 129
    .line 130
    const/4 v0, 0x3

    .line 131
    if-lt p0, v0, :cond_3

    .line 132
    .line 133
    :cond_7
    :goto_4
    :try_start_2
    sput-boolean v4, La8;->c:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 134
    .line 135
    goto :goto_6

    .line 136
    :goto_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    const-string v2, "unknown, process="

    .line 139
    .line 140
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    sput-object p1, La8;->b:Ljava/lang/String;

    .line 151
    .line 152
    sput-boolean v1, La8;->c:Z

    .line 153
    .line 154
    new-instance p1, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    const-string v0, "host version summary failed: "

    .line 157
    .line 158
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    :goto_6
    return-void
.end method
