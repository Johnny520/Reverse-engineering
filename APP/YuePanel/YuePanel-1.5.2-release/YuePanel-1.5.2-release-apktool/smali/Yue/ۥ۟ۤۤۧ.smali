.class public LYue/ۥ۟ۤۤۧ;
.super LYue/ۥ۠ۥ۟;


# static fields
.field public static volatile synthetic ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۢ:Ljava/lang/String;

.field public static volatile synthetic ۥۣ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۦ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x426

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۠ۥ۟;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native synthetic ۥ(LYue/ۥ۟ۤۤۧ;Ljava/util/List;Ljava/lang/String;)V
.end method

.method public static native ۥ۟۟(Ljava/lang/String;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method


# virtual methods
.method public native dexKit(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;)Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitBridge;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/query/FindMethod;",
            ">;"
        }
    .end annotation
.end method

.method public native dexKit(Lorg/luckypray/dexkit/DexKitBridge;)Lorg/luckypray/dexkit/result/MethodDataList;
.end method

.method public native info()Lcom/yuexin/panel/myClass/itemInfo;
.end method

.method public load(LYue/ۥ۟ۤۧۡ;Ljava/lang/ClassLoader;)V
    .locals 3

    :try_start_0
    invoke-virtual {p1}, LYue/ۥ۟ۤۧۡ;->ۥ()Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1}, LYue/ۥ۟ۤۤۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۟ۤۧ۠;

    invoke-virtual {p1}, LYue/ۥ۟ۤۧۡ;->ۥ()Ljava/util/Map;

    move-result-object p1

    const/4 v1, 0x3

    invoke-static {v1}, LYue/ۥ۟ۤۤۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥ۟ۤۧ۠;

    invoke-virtual {p1}, LYue/ۥ۟ۤۧ۠;->ۥ۟()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p1}, LYue/ۥ۟ۤۧ۠;->ۥ()Ljava/lang/String;

    move-result-object v1

    new-instance v2, LYue/ۥ۟ۤۤۧ$ۥ;

    invoke-direct {v2, p0, p1, v0}, LYue/ۥ۟ۤۤۧ$ۥ;-><init>(LYue/ۥ۟ۤۤۧ;LYue/ۥ۟ۤۧ۠;LYue/ۥ۟ۤۧ۠;)V

    invoke-static {p2, v1, v2}, LYue/ۥ۠ۤۦۢ;->ۥ۟۟۟ۦ(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    const/4 p2, 0x0

    invoke-static {p2}, LYue/ۥ۟ۤۤۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, LYue/ۥ۠۟۟ۥ;->ۥ۟۟۠ۡ(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final ۥ۟(Ljava/util/List;Ljava/lang/String;)V
    .locals 6

    sget-object v0, LYue/ۥ۟ۦۨۦ;->ۥ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v1, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LYue/ۥۡۡۨ۠;

    invoke-direct {v2}, LYue/ۥۡۡۨ۠;-><init>()V

    const/4 v3, 0x4

    invoke-static {v3}, LYue/ۥ۟ۤۤۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {v0, v3, v5}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/4 v5, 0x5

    invoke-static {v5}, LYue/ۥ۟ۤۤۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v0, v5, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v1}, LYue/ۥ۟ۤۤۧ;->ۥ۟۟(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v2, v1}, LYue/ۥۡۡۨ۠;->ۥ۟۟۟(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v2, v0}, LYue/ۥۡۡۨ۠;->ۥ۟۟۟۟(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, LYue/ۥۡۡۨ۠;->ۥ۟۟۟۠(Ljava/lang/String;)V

    sget-object v0, LYue/ۥ۟ۦۨۦ;->ۥ:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-void
.end method
