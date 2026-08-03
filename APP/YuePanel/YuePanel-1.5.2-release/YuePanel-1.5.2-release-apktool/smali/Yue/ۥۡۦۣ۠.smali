.class public LYue/ۥۡۦۣ۠;
.super LYue/ۥ۠ۥ۟;


# static fields
.field public static ۥ:Ljava/lang/Object;

.field public static ۥ۟:Ljava/lang/String;

.field public static ۥ۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۢ:Ljava/lang/String;

.field public static volatile synthetic ۥۣ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۤ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x451

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

.method public static native synthetic ۥ(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public static native synthetic ۥ۟()Ljava/lang/String;
.end method

.method public static native synthetic ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static ۥ۟۟۟()Z
    .locals 4

    :try_start_0
    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥۣ۟۟۟()Ljava/lang/ClassLoader;

    move-result-object v0

    sget-object v1, LYue/ۥۡۦۣ۠;->ۥ۟۟:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, LYue/ۥۡۦۢۨ;->ۥ۟۟۟(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LYue/ۥۡۦۣ۠;->ۥ:Ljava/lang/Object;

    sget-object v2, LYue/ۥۡۦۣ۠;->ۥ۟:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    :catchall_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x6

    invoke-static {v2}, LYue/ۥۡۦۣ۠;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۤ(Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public native dexKit(Lorg/luckypray/dexkit/DexKitBridge;)Lorg/luckypray/dexkit/result/MethodDataList;
.end method

.method public native info()Lcom/yuexin/panel/myClass/itemInfo;
.end method

.method public load(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
    .locals 5

    :try_start_0
    invoke-virtual {p1}, LYue/ۥ۟ۤۧ۠;->ۥ()Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥۡۦۣ۠;->ۥ۟:Ljava/lang/String;

    invoke-virtual {p1}, LYue/ۥ۟ۤۧ۠;->ۥ۟()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    new-instance v1, LYue/ۥۡۦۣ۠$ۥ;

    invoke-direct {v1, p0}, LYue/ۥۡۦۣ۠$ۥ;-><init>(LYue/ۥۡۦۣ۠;)V

    invoke-static {v0, v1}, LYue/ۥ۠ۤۦۢ;->ۥ۟۟۟ۥ(Ljava/lang/Class;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    invoke-virtual {p1}, LYue/ۥ۟ۤۧ۠;->ۥ۟()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LYue/ۥ۟ۤۧ۠;->ۥ()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {p1}, LYue/ۥ۟ۤۧ۠;->ۥ۟۟۟۟()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p2, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    new-instance v4, LYue/ۥۡۦۣ۠$ۥ۟;

    invoke-direct {v4, p0, p2, p1}, LYue/ۥۡۦۣ۠$ۥ۟;-><init>(LYue/ۥۡۦۣ۠;Ljava/lang/ClassLoader;LYue/ۥ۟ۤۧ۠;)V

    filled-new-array {v2, v3, v4}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p2, v1, p1}, LYue/ۥ۠ۤۦۢ;->ۥ۟۟۟۟(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)LYue/ۥ۠ۤۦۢ$ۥ۟;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    const/4 p2, 0x2

    invoke-static {p2}, LYue/ۥۡۦۣ۠;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, LYue/ۥ۠۟۟ۥ;->ۥ۟۟۠ۡ(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
