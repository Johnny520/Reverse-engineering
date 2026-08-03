.class public LYue/ۥ۠ۤۥۧ;
.super LYue/ۥ۠ۥ۟;


# static fields
.field public static ۥ:LYue/ۥ۟ۤۧ۠;

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

.field public static volatile synthetic ۥ۟۟۟ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۨ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۢ:Ljava/lang/String;

.field public static volatile synthetic ۥۣ۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۨ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ۟:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xd6

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

.method public static synthetic ۥ(Ljava/lang/Object;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 0

    invoke-static {p0, p1, p2}, LYue/ۥ۠ۤۥۧ;->ۥ۟۟۟۟(Ljava/lang/Object;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    return-void
.end method

.method public static synthetic ۥ۟(ILorg/json/JSONObject;[ILjava/lang/Object;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lcom/kongzue/dialogx/dialogs/MessageMenu;Ljava/lang/CharSequence;I)Z
    .locals 0

    invoke-static/range {p0 .. p7}, LYue/ۥ۠ۤۥۧ;->ۥ۟۟۟(ILorg/json/JSONObject;[ILjava/lang/Object;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lcom/kongzue/dialogx/dialogs/MessageMenu;Ljava/lang/CharSequence;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟۟(LYue/ۥ۠ۤۥۧ;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۤۥۧ;->ۥ۟۟۟ۡ(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟(ILorg/json/JSONObject;[ILjava/lang/Object;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lcom/kongzue/dialogx/dialogs/MessageMenu;Ljava/lang/CharSequence;I)Z
    .locals 0

    const/4 p5, 0x1

    const/4 p6, 0x0

    if-ne p0, p5, :cond_0

    :try_start_0
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    aget p1, p2, p7

    invoke-static {p0, p1}, LYue/ۥۡۢ۟ۤ;->ۥ۟۟۟ۥ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    aget p1, p2, p7

    invoke-static {p0, p1}, LYue/ۥۡۢ۟ۤ;->ۥ۟۟۟ۤ(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    :goto_0
    if-nez p0, :cond_1

    const/16 p0, 0x16

    invoke-static {p0}, LYue/ۥ۠ۤۥۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۤ(Ljava/lang/String;)V

    return p6

    :cond_1
    const/16 p1, 0x17

    invoke-static {p1}, LYue/ۥ۠ۤۥۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p3, p1, p0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, p4, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const/16 p1, 0x18

    invoke-static {p1}, LYue/ۥ۠ۤۥۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, p1, p2}, Lde/robv/android/xposed/XposedHelpers;->setAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, p4, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    sget-object p1, LYue/ۥ۠ۤۥۧ;->ۥ:LYue/ۥ۟ۤۧ۠;

    invoke-virtual {p1}, LYue/ۥ۟ۤۧ۠;->ۥ()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p4, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 p2, 0x19

    invoke-static {p2}, LYue/ۥ۠ۤۥۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۤ(Ljava/lang/String;)V

    :goto_2
    return p6
.end method

.method public static synthetic ۥ۟۟۟۟(Ljava/lang/Object;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 17

    const/4 v0, 0x6

    const/4 v1, 0x2

    const/4 v2, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x4

    :try_start_0
    invoke-static {v4}, LYue/ۥ۠ۤۥۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    move-object/from16 v10, p0

    invoke-static {v10, v4, v5}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move/from16 v4, p1

    if-ne v4, v3, :cond_0

    filled-new-array {v3, v1, v2}, [I

    move-result-object v0

    const/16 v1, 0xb

    invoke-static {v1}, LYue/ۥ۠ۤۥۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xc

    invoke-static {v2}, LYue/ۥ۠ۤۥۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xd

    invoke-static {v3}, LYue/ۥ۠ۤۥۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    move-result-object v1

    :goto_0
    move-object v9, v0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    new-array v0, v0, [I

    fill-array-data v0, :array_0

    const/16 v1, 0xe

    invoke-static {v1}, LYue/ۥ۠ۤۥۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v11

    const/16 v1, 0xf

    invoke-static {v1}, LYue/ۥ۠ۤۥۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v12

    const/16 v1, 0x10

    invoke-static {v1}, LYue/ۥ۠ۤۥۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v13

    const/16 v1, 0x11

    invoke-static {v1}, LYue/ۥ۠ۤۥۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v14

    const/16 v1, 0x12

    invoke-static {v1}, LYue/ۥ۠ۤۥۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v15

    const/16 v1, 0x13

    invoke-static {v1}, LYue/ۥ۠ۤۥۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v16

    filled-new-array/range {v11 .. v16}, [Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :goto_1
    invoke-static {v1}, Lcom/kongzue/dialogx/dialogs/MessageMenu;->show([Ljava/lang/String;)Lcom/kongzue/dialogx/dialogs/MessageMenu;

    move-result-object v0

    const/16 v1, 0x14

    invoke-static {v1}, LYue/ۥ۠ۤۥۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kongzue/dialogx/dialogs/MessageMenu;->setTitle(Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/MessageMenu;

    move-result-object v0

    new-instance v1, LYue/ۥ۠ۤۥۦ;

    move-object v6, v1

    move/from16 v7, p1

    move-object/from16 v10, p0

    move-object/from16 v11, p2

    invoke-direct/range {v6 .. v11}, LYue/ۥ۠ۤۥۦ;-><init>(ILorg/json/JSONObject;[ILjava/lang/Object;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    invoke-virtual {v0, v1}, Lcom/kongzue/dialogx/dialogs/MessageMenu;->setOnMenuItemClickListener(Lcom/kongzue/dialogx/interfaces/OnMenuItemClickListener;)Lcom/kongzue/dialogx/dialogs/MessageMenu;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x15

    invoke-static {v2}, LYue/ۥ۠ۤۥۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۤ(Ljava/lang/String;)V

    :goto_3
    return-void

    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
    .end array-data
.end method


# virtual methods
.method public native dexKit(Lorg/luckypray/dexkit/DexKitBridge;)Lorg/luckypray/dexkit/result/MethodDataList;
.end method

.method public native info()Lcom/yuexin/panel/myClass/itemInfo;
.end method

.method public load(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
    .locals 1

    :try_start_0
    sput-object p1, LYue/ۥ۠ۤۥۧ;->ۥ:LYue/ۥ۟ۤۧ۠;

    invoke-virtual {p1}, LYue/ۥ۟ۤۧ۠;->ۥ۟()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p1}, LYue/ۥ۟ۤۧ۠;->ۥ()Ljava/lang/String;

    move-result-object p1

    new-instance v0, LYue/ۥ۠ۤۥۧ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥ۠ۤۥۧ$ۥ;-><init>(LYue/ۥ۠ۤۥۧ;)V

    invoke-static {p2, p1, v0}, LYue/ۥ۠ۤۦۢ;->ۥ۟۟۟ۦ(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    const/4 p2, 0x0

    invoke-static {p2}, LYue/ۥ۠ۤۥۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, LYue/ۥ۠۟۟ۥ;->ۥ۟۟۠ۡ(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final ۥ۟۟۟۠(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/Object;I)V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, LYue/ۥ۠ۤۥۥ;

    invoke-direct {v1, p2, p3, p1}, LYue/ۥ۠ۤۥۥ;-><init>(Ljava/lang/Object;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final ۥ۟۟۟ۡ(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x4

    :try_start_0
    invoke-static {v0}, LYue/ۥ۠ۤۥۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x5

    invoke-static {v0}, LYue/ۥ۠ۤۥۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/16 v2, 0x1fb

    if-ne v0, v2, :cond_2

    const/4 v0, 0x6

    invoke-static {v0}, LYue/ۥ۠ۤۥۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    invoke-static {v1}, LYue/ۥ۠ۤۥۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, LYue/ۥ۠ۤۥۧ;->ۥ۟۟۟۠(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/Object;I)V

    invoke-virtual {p1, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const/16 v1, 0x8

    invoke-static {v1}, LYue/ۥ۠ۤۥۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x2

    invoke-virtual {p0, p1, p2, v0}, LYue/ۥ۠ۤۥۧ;->ۥ۟۟۟۠(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/Object;I)V

    invoke-virtual {p1, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_2
    :goto_0
    return-void
.end method
