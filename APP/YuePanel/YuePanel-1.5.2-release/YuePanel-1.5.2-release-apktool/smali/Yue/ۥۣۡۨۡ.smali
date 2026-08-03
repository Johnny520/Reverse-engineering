.class public LYue/ۥۣۡۨۡ;
.super LYue/ۥ۠ۥ۟;


# static fields
.field public static ۥ:LYue/ۥ۟ۤۧۡ;

.field public static volatile synthetic ۥ۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۢ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3c5

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

.method public static ۥ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    const-class v0, Ljava/lang/String;

    sget-object v1, LYue/ۥۣۡۨۡ;->ۥ:LYue/ۥ۟ۤۧۡ;

    invoke-virtual {v1}, LYue/ۥ۟ۤۧۡ;->ۥ()Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v2}, LYue/ۥۣۡۨۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥ۟ۤۧ۠;

    invoke-virtual {v1}, LYue/ۥ۟ۤۧ۠;->ۥ۟()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥۣ۟۟۟()Ljava/lang/ClassLoader;

    move-result-object v2

    const/4 v3, 0x1

    :try_start_0
    invoke-static {v1, v2}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v4, Ljava/lang/Object;

    filled-new-array {v0, v0, v2, v2, v4}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-wide/16 v4, 0x0

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    filled-new-array {p0, p1, v1, v2, v4}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۡۢۢۥ;->ۥ(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    const/4 p1, 0x5

    invoke-static {p1}, LYue/ۥۣۡۨۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۢ(Ljava/lang/String;I)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/4 p0, 0x6

    invoke-static {p0}, LYue/ۥۣۡۨۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠ۨۡۢ;->ۥ(Ljava/lang/String;)V

    :goto_0
    return-void
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

.method public native info()Lcom/yuexin/panel/myClass/itemInfo;
.end method

.method public native load(LYue/ۥ۟ۤۧۡ;Ljava/lang/ClassLoader;)V
.end method
