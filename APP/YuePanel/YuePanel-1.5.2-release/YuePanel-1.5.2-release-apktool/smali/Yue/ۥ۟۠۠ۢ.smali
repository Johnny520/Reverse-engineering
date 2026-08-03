.class public LYue/ۥ۟۠۠ۢ;
.super LYue/ۥ۠ۥ۟;


# static fields
.field public static ۥ:LYue/ۥ۟ۤۧ۠;

.field public static ۥ۟:Ljava/lang/String;

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

.field public static volatile synthetic ۥ۟۟۟ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۨ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۢ:Ljava/lang/String;

.field public static volatile synthetic ۥۣ۟۟۠:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x316

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

.method public static native synthetic ۥ(Ljava/lang/Object;)V
.end method

.method public static native synthetic ۥ۟(Ljava/lang/String;)V
.end method

.method public static synthetic ۥ۟۟(Ljava/lang/Object;)V
    .locals 2

    const/16 v0, 0x11

    invoke-static {v0}, LYue/ۥ۟۠۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic ۥ۟۟۟(Ljava/lang/String;)V
    .locals 19

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥۣ۟۟۟()Ljava/lang/ClassLoader;

    move-result-object v0

    :try_start_0
    sget v1, LYue/ۥۢۤ۠ۧ;->ۥ:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    sget-object v3, LYue/ۥ۟ۦۣۨ;->ۥ۟۟:Ljava/lang/Object;

    sget-object v4, LYue/ۥ۟۠۠ۢ;->ۥ:LYue/ۥ۟ۤۧ۠;

    invoke-virtual {v4}, LYue/ۥ۟ۤۧ۠;->ۥ۟()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sget-object v4, LYue/ۥ۟۠۠ۢ;->ۥ:LYue/ۥ۟ۤۧ۠;

    invoke-virtual {v4}, LYue/ۥ۟ۤۧ۠;->ۥ()Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0xb

    invoke-static {v5}, LYue/ۥ۟۠۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v7

    const/16 v5, 0xc

    invoke-static {v5}, LYue/ۥ۟۠۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/16 v5, 0xd

    invoke-static {v5}, LYue/ۥ۟۠۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v10

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/16 v2, 0xe

    invoke-static {v2}, LYue/ۥ۟۠۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v14

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    invoke-static {v2}, LYue/ۥ۟۠۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v17

    invoke-static {v2}, LYue/ۥ۟۠۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v18

    const/4 v15, 0x0

    move-object/from16 v6, p0

    filled-new-array/range {v6 .. v18}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v4, v2}, Lde/robv/android/xposed/XposedHelpers;->callStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/16 v2, 0xf

    invoke-static {v2}, LYue/ۥ۟۠۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    new-array v4, v5, [Ljava/lang/Object;

    invoke-static {v3, v2, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/16 v3, 0x10

    invoke-static {v3}, LYue/ۥ۟۠۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    new-array v4, v5, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    sget-object v4, LYue/ۥ۟۠۠ۢ;->ۥ۟:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v5, v0}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v2, v4, v5}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v3, v1, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    sget-object v3, LYue/ۥ۠ۢۡۢ;->ۥ۟۟:Ljava/util/List;

    if-eqz v3, :cond_0

    invoke-interface {v3, v1, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, LYue/ۥ۟۠۠ۡ;

    invoke-direct {v1, v2}, LYue/ۥ۟۠۠ۡ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static native ۥ۟۟۟۟(Ljava/lang/String;)V
.end method

.method public static native ۥ۟۟۟۠(Ljava/lang/String;)V
.end method

.method public static native ۥ۟۟۟ۡ(Ljava/lang/String;)V
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
