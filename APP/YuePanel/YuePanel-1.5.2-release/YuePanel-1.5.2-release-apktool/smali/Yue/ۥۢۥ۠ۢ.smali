.class public LYue/ۥۢۥ۠ۢ;
.super Ljava/lang/Object;


# static fields
.field public static ۥ:LYue/ۥ۟ۤۧۡ;

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


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x30c

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native synthetic ۥ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
.end method

.method public static synthetic ۥ۟(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    filled-new-array {p2, p3}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ۥ۟۟(Ljava/lang/String;Ljava/lang/String;)V
    .locals 17

    move-object/from16 v0, p1

    const-class v1, Ljava/lang/String;

    invoke-static {}, LYue/ۥ۟ۦۣۨ;->ۥ()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x3

    if-nez v2, :cond_0

    invoke-static {v3}, LYue/ۥۢۥ۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۢ(Ljava/lang/String;I)V

    return-void

    :cond_0
    sget-object v5, LYue/ۥۢۥ۠ۢ;->ۥ:LYue/ۥ۟ۤۧۡ;

    const/4 v6, 0x1

    if-nez v5, :cond_1

    invoke-static {v6}, LYue/ۥۢۥ۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۢ(Ljava/lang/String;I)V

    return-void

    :cond_1
    invoke-static/range {p1 .. p1}, LYue/ۥ۟ۢۡ۟;->ۥ۟۟۟(Ljava/lang/String;)J

    move-result-wide v7

    const/4 v5, 0x2

    :try_start_0
    invoke-static {v5}, LYue/ۥۢۥ۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-static {v4}, LYue/ۥۢۥ۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟۟۟(Ljava/lang/String;)I

    move-result v4

    int-to-long v7, v4

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_1

    :cond_2
    :goto_0
    sget-object v4, LYue/ۥۢۥ۠ۢ;->ۥ:LYue/ۥ۟ۤۧۡ;

    invoke-virtual {v4}, LYue/ۥ۟ۤۧۡ;->ۥ()Ljava/util/Map;

    move-result-object v4

    const/4 v5, 0x4

    invoke-static {v5}, LYue/ۥۢۥ۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v4, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LYue/ۥ۟ۤۧ۠;

    invoke-virtual {v4}, LYue/ۥ۟ۤۧ۠;->ۥ۟()Ljava/lang/String;

    move-result-object v4

    sget-object v9, LYue/ۥۢۥ۠ۢ;->ۥ:LYue/ۥ۟ۤۧۡ;

    invoke-virtual {v9}, LYue/ۥ۟ۤۧۡ;->ۥ()Ljava/util/Map;

    move-result-object v9

    invoke-static {v5}, LYue/ۥۢۥ۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LYue/ۥ۟ۤۧ۠;

    invoke-virtual {v9}, LYue/ۥ۟ۤۧ۠;->ۥ۟۟۟۟()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    sget-object v10, LYue/ۥۢۥ۠ۢ;->ۥ:LYue/ۥ۟ۤۧۡ;

    invoke-virtual {v10}, LYue/ۥ۟ۤۧۡ;->ۥ()Ljava/util/Map;

    move-result-object v10

    invoke-static {v5}, LYue/ۥۢۥ۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LYue/ۥ۟ۤۧ۠;

    invoke-virtual {v10}, LYue/ۥ۟ۤۧ۠;->ۥ()Ljava/lang/String;

    move-result-object v10

    sget-object v11, LYue/ۥۢۥ۠ۢ;->ۥ:LYue/ۥ۟ۤۧۡ;

    invoke-virtual {v11}, LYue/ۥ۟ۤۧۡ;->ۥ()Ljava/util/Map;

    move-result-object v11

    invoke-static {v5}, LYue/ۥۢۥ۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v11, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LYue/ۥ۟ۤۧ۠;

    invoke-virtual {v5}, LYue/ۥ۟ۤۧ۠;->ۥ۟۟۟۟()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥۣ۟۟۟()Ljava/lang/ClassLoader;

    move-result-object v5

    new-instance v11, Ljava/io/File;

    invoke-direct {v11, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x5

    invoke-static {v12}, LYue/ۥۢۥ۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x6

    invoke-static {v13}, LYue/ۥۢۥ۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11, v12, v13}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v11

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, LYue/ۥۡۡۤۤ;->ۥ۟۟۟۠()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v13, 0x7

    invoke-static {v13}, LYue/ۥۢۥ۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v0, v11}, LYue/ۥ۠ۢ۟;->ۥ۟۟۟ۡ(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x8

    invoke-static {v0}, LYue/ۥۢۥ۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v3, v5}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v12

    const/16 v13, 0x9

    invoke-static {v13}, LYue/ۥۢۥ۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v14

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v15

    const/16 v16, 0xa

    invoke-static/range {v16 .. v16}, LYue/ۥۢۥ۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v16

    filled-new-array/range {v16 .. v16}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v12, v14, v15, v6}, Lde/robv/android/xposed/XposedHelpers;->callStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v3, v5}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v3

    invoke-static {v13}, LYue/ۥۢۥ۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v12

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v1

    const/16 v13, 0xb

    invoke-static {v13}, LYue/ۥۢۥ۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v13

    filled-new-array {v13}, [Ljava/lang/Object;

    move-result-object v13

    invoke-static {v3, v12, v1, v13}, Lde/robv/android/xposed/XposedHelpers;->callStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v5, v9}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    const/16 v3, 0xc

    invoke-static {v3}, LYue/ۥۢۥ۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    const-wide/32 v4, 0x2151b4a

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v2, v3, v4}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟ۦ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v3, 0xd

    :try_start_1
    invoke-static {v3}, LYue/ۥۢۥ۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v6, v2}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v0, v4, v5}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    :try_start_2
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, LYue/ۥۢۥ۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v4}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟ۦ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/16 v4, 0xe

    invoke-static {v4}, LYue/ۥۢۥ۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4, v3}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟ۦ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    const/16 v3, 0xf

    invoke-static {v3}, LYue/ۥۢۥ۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v2, v3, v4}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟ۦ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v4, LYue/ۥۢۥ۠۠;

    invoke-direct {v4, v0, v10, v1, v2}, LYue/ۥۢۥ۠۠;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x10

    invoke-static {v2}, LYue/ۥۢۥ۠ۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۢ(Ljava/lang/String;I)V

    :goto_2
    return-void
.end method
