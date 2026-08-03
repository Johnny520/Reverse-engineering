.class public final Ltop/mmjz/floatingclouds/XposedEntry;
.super Lio/github/libxposed/api/XposedModule;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/mmjz/floatingclouds/XposedEntry$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010%\n\u0002\u0008\u0005\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001f\u0010%\u001a\u00020\u00082\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0000\u00a2\u0006\u0004\u0008#\u0010$R \u0010\'\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020!0&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(\u00a8\u0006+"
    }
    d2 = {
        "Ltop/mmjz/floatingclouds/XposedEntry;",
        "Lio/github/libxposed/api/XposedModule;",
        "<init>",
        "()V",
        "Ljava/lang/ClassLoader;",
        "classLoader",
        "",
        "processName",
        "La/Wf;",
        "initWeChatHooks",
        "(Ljava/lang/ClassLoader;Ljava/lang/String;)V",
        "La/J8;",
        "session",
        "initPlugins",
        "(La/J8;)V",
        "Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;",
        "param",
        "onModuleLoaded",
        "(Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;)V",
        "Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;",
        "onPackageLoaded",
        "(Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;)V",
        "Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;",
        "onPackageReady",
        "(Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;)V",
        "Lio/github/libxposed/api/XposedModuleInterface$HotReloadingParam;",
        "",
        "onHotReloading",
        "(Lio/github/libxposed/api/XposedModuleInterface$HotReloadingParam;)Z",
        "Lio/github/libxposed/api/XposedModuleInterface$HotReloadedParam;",
        "onHotReloaded",
        "(Lio/github/libxposed/api/XposedModuleInterface$HotReloadedParam;)V",
        "id",
        "Lio/github/libxposed/api/XposedInterface$HookHandle;",
        "handle",
        "registerHookHandle$app_release",
        "(Ljava/lang/String;Lio/github/libxposed/api/XposedInterface$HookHandle;)V",
        "registerHookHandle",
        "",
        "hookHandles",
        "Ljava/util/Map;",
        "Companion",
        "a",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Ltop/mmjz/floatingclouds/XposedEntry$a;

.field private static final TARGET_PACKAGE:Ljava/lang/String; = "com.tencent.mm"

.field private static self:Ltop/mmjz/floatingclouds/XposedEntry;


# instance fields
.field private final hookHandles:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/github/libxposed/api/XposedInterface$HookHandle;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/mmjz/floatingclouds/XposedEntry$a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ltop/mmjz/floatingclouds/XposedEntry;->Companion:Ltop/mmjz/floatingclouds/XposedEntry$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lio/github/libxposed/api/XposedModule;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ltop/mmjz/floatingclouds/XposedEntry;->hookHandles:Ljava/util/Map;

    sput-object p0, Ltop/mmjz/floatingclouds/XposedEntry;->self:Ltop/mmjz/floatingclouds/XposedEntry;

    const-string v0, "Floatingclouds"

    const-string v1, "Floatingclouds XposedEntry constructed"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static synthetic a(Ltop/mmjz/floatingclouds/XposedEntry;La/J8;)V
    .locals 0

    invoke-static {p0, p1}, Ltop/mmjz/floatingclouds/XposedEntry;->initPlugins$lambda$12(Ltop/mmjz/floatingclouds/XposedEntry;La/J8;)V

    return-void
.end method

.method public static final synthetic access$getSelf$cp()Ltop/mmjz/floatingclouds/XposedEntry;
    .locals 1

    sget-object v0, Ltop/mmjz/floatingclouds/XposedEntry;->self:Ltop/mmjz/floatingclouds/XposedEntry;

    return-object v0
.end method

.method public static synthetic b(Ljava/util/concurrent/atomic/AtomicBoolean;La/J8;Ltop/mmjz/floatingclouds/XposedEntry;Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ltop/mmjz/floatingclouds/XposedEntry;->initWeChatHooks$lambda$6$lambda$5(Ljava/util/concurrent/atomic/AtomicBoolean;La/J8;Ltop/mmjz/floatingclouds/XposedEntry;Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ltop/mmjz/floatingclouds/XposedEntry;La/J8;)V
    .locals 0

    invoke-static {p0, p1}, Ltop/mmjz/floatingclouds/XposedEntry;->initWeChatHooks$doInit$lambda$1(Ltop/mmjz/floatingclouds/XposedEntry;La/J8;)V

    return-void
.end method

.method public static synthetic d(Ljava/util/concurrent/atomic/AtomicBoolean;La/J8;Ltop/mmjz/floatingclouds/XposedEntry;Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ltop/mmjz/floatingclouds/XposedEntry;->initWeChatHooks$lambda$2(Ljava/util/concurrent/atomic/AtomicBoolean;La/J8;Ltop/mmjz/floatingclouds/XposedEntry;Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/util/concurrent/atomic/AtomicBoolean;La/J8;Ltop/mmjz/floatingclouds/XposedEntry;Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ltop/mmjz/floatingclouds/XposedEntry;->initWeChatHooks$lambda$4$lambda$3(Ljava/util/concurrent/atomic/AtomicBoolean;La/J8;Ltop/mmjz/floatingclouds/XposedEntry;Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ltop/mmjz/floatingclouds/XposedEntry;Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;
    .locals 0

    invoke-static {p0, p1}, Ltop/mmjz/floatingclouds/XposedEntry;->initWeChatHooks$lambda$0(Ltop/mmjz/floatingclouds/XposedEntry;Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object p0

    return-object p0
.end method

.method private final initPlugins(La/J8;)V
    .locals 19

    move-object/from16 v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x2

    sget-object v0, La/K3;->a:La/K3$a;

    const-string v5, "Migration from "

    const-string v6, "Legacy package "

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->j()Landroid/content/SharedPreferences;

    move-result-object v0

    sget-object v7, La/K3;->g:Ljava/lang/String;

    invoke-interface {v0, v7, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    const/4 v7, 0x0

    const-string v8, "Floatingclouds_Migrate"

    if-eqz v0, :cond_0

    const-string v0, "Migration skipped (guard set by clearData)"

    invoke-static {v8, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_8

    :cond_0
    const-string v0, "com.lu.wxmask"

    const-string v9, "com.lu.wxmask272"

    const-string v10, "com.lu.floatingclouds"

    filled-new-array {v0, v9, v10}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/o3;->d0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {}, La/K3$a;->h()Landroid/content/SharedPreferences;

    move-result-object v9

    sget-object v10, La/K3;->c:Ljava/lang/String;

    invoke-interface {v9, v10, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_1

    invoke-static {}, La/K3$a;->j()Landroid/content/SharedPreferences;

    move-result-object v9

    invoke-interface {v9, v10, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    :cond_1
    invoke-static {}, La/K3$a;->j()Landroid/content/SharedPreferences;

    move-result-object v10

    sget-object v11, La/K3;->b:Ljava/lang/String;

    invoke-interface {v10, v11, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "{}"

    const-string v12, "[]"

    if-eqz v9, :cond_4

    invoke-static {v9}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v13

    if-eqz v13, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v9, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    if-eqz v10, :cond_4

    invoke-static {v10}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v10, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    const-string v0, "Current SP already has data, skipping migration"

    invoke-static {v8, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_8

    :cond_4
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move v10, v2

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/lang/String;

    :try_start_0
    sget-object v0, La/w1;->p:Landroid/content/Context;

    if-nez v0, :cond_5

    goto/16 :goto_4

    :cond_5
    invoke-virtual {v0, v13, v3}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v0

    const-string v14, "mask_wechat_config"

    const/4 v15, 0x4

    invoke-virtual {v0, v14, v15}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    sget-object v14, La/K3;->c:Ljava/lang/String;

    invoke-interface {v0, v14, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    sget-object v3, La/K3;->b:Ljava/lang/String;

    invoke-interface {v0, v3, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v15, :cond_b

    invoke-static {v15}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v17

    if-eqz v17, :cond_6

    goto/16 :goto_3

    :cond_6
    invoke-virtual {v15, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_b

    if-eqz v4, :cond_b

    invoke-static {v4}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v17

    if-eqz v17, :cond_7

    goto/16 :goto_3

    :cond_7
    invoke-virtual {v4, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_b

    invoke-static {}, La/K3$a;->j()Landroid/content/SharedPreferences;

    move-result-object v17

    invoke-interface/range {v17 .. v17}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2, v14, v15}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Migrated options("

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "B) + maskList("

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "B) from "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " \u2192 top.mmjz.floatingclouds"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v8, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, La/K3$a;->h()Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2, v14, v15}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    sget-object v2, La/K3;->e:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_9

    invoke-static {v4}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_2

    :cond_8
    invoke-virtual {v4, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    invoke-static {}, La/K3$a;->j()Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3, v2, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_5

    :cond_9
    :goto_2
    sget-object v2, La/K3;->d:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, La/K3$a;->j()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const/4 v3, 0x1

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_a
    const/16 v17, 0x0

    :try_start_1
    sput-object v17, La/K3;->j:La/jc;

    sput-object v17, La/K3;->k:Ljava/util/ArrayList;

    sput-object v17, La/K3;->l:Ljava/lang/Boolean;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " complete. Invalidate cache and reload."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    const/4 v10, 0x1

    goto :goto_7

    :catch_1
    move-exception v0

    const/4 v10, 0x1

    goto :goto_5

    :catch_2
    const/4 v10, 0x1

    goto :goto_6

    :cond_b
    :goto_3
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " has no data, skip"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :goto_4
    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v7, 0x0

    goto/16 :goto_1

    :goto_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " failed"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v8, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_4

    :catch_3
    :goto_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " not installed, skip"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :cond_c
    :goto_7
    if-nez v10, :cond_d

    const-string v0, "No legacy data found to migrate"

    invoke-static {v8, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_d
    move v2, v10

    :goto_8
    if-eqz v2, :cond_e

    const-string v0, "Legacy config migrated"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    :cond_e
    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v17, 0x0

    sput-object v17, La/K3;->j:La/jc;

    sput-object v17, La/K3;->k:Ljava/util/ArrayList;

    sput-object v17, La/K3;->l:Ljava/lang/Boolean;

    sget-object v0, La/Yc;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_9

    :cond_f
    sget-object v0, La/w1;->p:Landroid/content/Context;

    if-eqz v0, :cond_10

    const-string v0, "fc_remote_killswitch"

    invoke-static {v0}, La/n9;->s(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    sput-object v0, La/Yc;->e:Landroid/content/SharedPreferences;

    :cond_10
    new-instance v0, Ljava/lang/Thread;

    new-instance v2, La/l0;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, La/l0;-><init>(I)V

    const-string v3, "fc-remote-killswitch"

    invoke-direct {v0, v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Ljava/lang/Thread;->setDaemon(Z)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :goto_9
    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v0

    iget-boolean v2, v0, La/jc;->L:Z

    iget-boolean v3, v0, La/jc;->n:Z

    iget-boolean v4, v0, La/jc;->s:Z

    iget-boolean v5, v0, La/jc;->o:Z

    iget-boolean v0, v0, La/jc;->f:Z

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Loaded: master="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " hideConv="

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " blockChat="

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " hideContact="

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " hideSns="

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    new-instance v0, La/x3;

    invoke-direct {v0}, La/x3;-><init>()V

    new-instance v2, La/fh;

    invoke-direct {v2}, La/fh;-><init>()V

    const/4 v3, 0x2

    new-array v3, v3, [Ltop/mmjz/floatingclouds/plugin/IPlugin;

    const/16 v18, 0x0

    aput-object v0, v3, v18

    const/16 v16, 0x1

    aput-object v2, v3, v16

    invoke-static {v3}, La/o3;->d0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move/from16 v3, v18

    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 v4, v3, 0x1

    if-ltz v3, :cond_11

    move-object v5, v0

    check-cast v5, Ltop/mmjz/floatingclouds/plugin/IPlugin;

    :try_start_3
    sget-object v0, La/yc;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sget-object v6, La/yc;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v6, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "init plugin ["

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "]: "

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    invoke-interface {v5, v1}, Ltop/mmjz/floatingclouds/plugin/IPlugin;->handleHook(La/J8;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_b

    :catchall_0
    move-exception v0

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const-string v5, "init plugin failed: "

    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    :goto_b
    move v3, v4

    const/16 v16, 0x1

    goto :goto_a

    :cond_11
    new-instance v0, Ljava/lang/ArithmeticException;

    const-string v1, "Index overflow has happened."

    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    sget-boolean v0, La/n6;->a:Z

    sget-object v0, La/w1;->p:Landroid/content/Context;

    invoke-static {v0}, La/i9;->b(Ljava/lang/Object;)V

    iget-object v2, v1, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-static {v0}, La/n6;->a(Landroid/content/Context;)V

    :try_start_4
    sget-object v0, La/hg;->a:La/hg;

    iget-object v2, v1, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, La/hg;->c(Ljava/lang/ClassLoader;)La/ig;

    move-result-object v0

    iget-object v2, v0, La/ig;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_13

    const/4 v2, 0x1

    goto :goto_c

    :cond_13
    move/from16 v2, v18

    :goto_c
    if-eqz v2, :cond_14

    sget-object v2, La/K3;->a:La/K3$a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/K3$a;->p(La/ig;)V

    invoke-static {v0}, La/K3$a;->q(La/ig;)V

    iget-object v2, v0, La/ig;->b:Ljava/lang/String;

    invoke-virtual {v0}, La/ig;->a()Z

    move-result v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "VersionSnapshot captured: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " hotUpdated="

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    goto :goto_d

    :catchall_1
    move-exception v0

    goto :goto_e

    :cond_14
    :goto_d
    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_f

    :goto_e
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_f
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_15

    const-string v2, "VersionSnapshot collect failed"

    filled-new-array {v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    :cond_15
    sget-object v0, La/if;->a:La/if;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/if;->c()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, La/zh;

    const/4 v4, 0x1

    move-object/from16 v3, p0

    invoke-direct {v2, v3, v1, v4}, La/zh;-><init>(Ltop/mmjz/floatingclouds/XposedEntry;La/J8;I)V

    const-wide/16 v4, 0x3a98

    invoke-virtual {v0, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private static final initPlugins$lambda$12(Ltop/mmjz/floatingclouds/XposedEntry;La/J8;)V
    .locals 2

    const-string p0, "VersionSnapshot delayed re-collect: tag="

    :try_start_0
    sget-object v0, La/hg;->a:La/hg;

    iget-object p1, p1, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, La/hg;->c(Ljava/lang/ClassLoader;)La/ig;

    move-result-object p1

    iget-object v0, p1, La/ig;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez v0, :cond_0

    iget-object v0, p1, La/ig;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    :try_start_1
    sget-object v1, La/K3;->a:La/K3$a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, La/K3$a;->p(La/ig;)V

    invoke-static {p1}, La/K3$a;->q(La/ig;)V

    iget-object p1, p1, La/ig;->k:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " b.ver="

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->b([Ljava/lang/Object;)V

    :cond_0
    sget-object p0, La/Wf;->a:La/Wf;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object p0

    :goto_0
    invoke-static {p0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_1

    const-string p1, "VersionSnapshot delayed collect failed"

    filled-new-array {p1, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->e([Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method private final initWeChatHooks(Ljava/lang/ClassLoader;Ljava/lang/String;)V
    .locals 7

    const-string v0, "onCreate"

    const-string v1, "android.app.Application"

    const-string v2, "initWeChatHooks start process="

    invoke-static {v2, p2}, La/z;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, La/x1;->b([Ljava/lang/Object;)V

    sput-object p1, La/w1;->g:Ljava/lang/ClassLoader;

    :try_start_0
    new-instance v2, La/J8;

    new-instance v3, La/t;

    const/16 v4, 0x9

    invoke-direct {v3, v4, p0}, La/t;-><init>(ILjava/lang/Object;)V

    invoke-direct {v2, p1, p2, v3}, La/J8;-><init>(Ljava/lang/ClassLoader;Ljava/lang/String;La/t;)V

    sget-object p1, La/if;->a:La/if;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, La/if;->d(La/J8;)V

    invoke-static {}, La/if;->a()V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    const-string v3, "attach"

    const-class v4, Landroid/content/Context;

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v4

    new-instance v5, La/Ah;

    const/4 v6, 0x0

    invoke-direct {v5, p1, v2, p0, v6}, La/Ah;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;La/J8;Ltop/mmjz/floatingclouds/XposedEntry;I)V

    invoke-static {v2, v1, v3, v4, v5}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    const-string v3, "com.tencent.mm.app.GPApplication"

    new-array v4, p2, [Ljava/lang/Class;

    new-instance v5, La/Ah;

    const/4 v6, 0x1

    invoke-direct {v5, p1, v2, p0, v6}, La/Ah;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;La/J8;Ltop/mmjz/floatingclouds/XposedEntry;I)V

    invoke-static {v2, v3, v0, v4, v5}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v3

    :try_start_2
    invoke-static {v3}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v3

    :goto_0
    invoke-static {v3}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_0

    new-array p2, p2, [Ljava/lang/Class;

    new-instance v3, La/Ah;

    const/4 v4, 0x2

    invoke-direct {v3, p1, v2, p0, v4}, La/Ah;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;La/J8;Ltop/mmjz/floatingclouds/XposedEntry;I)V

    invoke-static {v2, v1, v0, p2, v3}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    const-string p2, "initWeChatHooks failed"

    filled-new-array {p2, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->a([Ljava/lang/Object;)V

    :cond_0
    :goto_1
    const-string p1, "initWeChatHooks done"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->b([Ljava/lang/Object;)V

    return-void
.end method

.method private static final initWeChatHooks$doInit(Ljava/util/concurrent/atomic/AtomicBoolean;La/J8;Ltop/mmjz/floatingclouds/XposedEntry;Landroid/content/Context;)V
    .locals 5

    const-string v0, "dexkit_scan_cache"

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    sput-object p3, La/w1;->p:Landroid/content/Context;

    invoke-static {p3}, La/w1;->D(Landroid/content/Context;)V

    invoke-virtual {p3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const-string v2, "AppContext attached, using WeChat context: "

    invoke-static {v2, p0}, La/z;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->b([Ljava/lang/Object;)V

    :try_start_0
    invoke-virtual {p3, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object p0

    const-string v2, "getAll(...)"

    invoke-static {p0, v2}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v3

    invoke-static {v3}, La/aa;->C(I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v2, La/Z5;->a:La/Z5;

    :cond_1
    sput-object v2, La/a5;->a:Ljava/lang/Object;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result p0

    const-string v2, "DexKitCache: self="

    const-string v3, " keys"

    invoke-static {p0, v2, v3}, La/z;->c(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->b([Ljava/lang/Object;)V

    sget-boolean p0, La/n6;->a:Z

    invoke-virtual {p3, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result p0

    invoke-static {}, La/a5;->f()Z

    move-result p3

    sput p0, La/n6;->l:I

    sput-boolean p3, La/n6;->m:Z

    if-eqz p3, :cond_2

    const-string v0, "OK"

    goto :goto_1

    :cond_2
    if-lez p0, :cond_3

    const-string v0, "WARN"

    goto :goto_1

    :cond_3
    const-string v0, "FAIL"

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "[DIAG-HEALTH] module=DexKitCache status="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " selfKeys="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " inkKeys=0 ready="

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->b([Ljava/lang/Object;)V

    :try_start_1
    new-instance p0, La/ch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, La/ch;->handleHook(La/J8;)V

    const-string p3, "WXDbPlugin"

    sget-object v0, La/yc;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v0, p3, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p0, "WXDbPlugin registered early (before delayed init)"

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->b([Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    const-string p3, "WXDbPlugin early register failed"

    filled-new-array {p3, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->a([Ljava/lang/Object;)V

    :goto_2
    new-instance p0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    invoke-direct {p0, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p3, La/zh;

    invoke-direct {p3, p2, p1, v1}, La/zh;-><init>(Ltop/mmjz/floatingclouds/XposedEntry;La/J8;I)V

    invoke-virtual {p0, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final initWeChatHooks$doInit$lambda$1(Ltop/mmjz/floatingclouds/XposedEntry;La/J8;)V
    .locals 0

    :try_start_0
    invoke-direct {p0, p1}, Ltop/mmjz/floatingclouds/XposedEntry;->initPlugins(La/J8;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    const-string p1, "initPlugins (delayed) failed"

    filled-new-array {p1, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->a([Ljava/lang/Object;)V

    return-void
.end method

.method private static final initWeChatHooks$lambda$0(Ltop/mmjz/floatingclouds/XposedEntry;Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;
    .locals 1

    const-string v0, "executable"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object p0

    const-string p1, "hook(...)"

    invoke-static {p0, p1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final initWeChatHooks$lambda$2(Ljava/util/concurrent/atomic/AtomicBoolean;La/J8;Ltop/mmjz/floatingclouds/XposedEntry;Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 2

    const-string v0, "chain"

    invoke-static {p3, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p3}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object p3

    const/4 v1, 0x0

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    instance-of v1, p3, Landroid/content/Context;

    if-eqz v1, :cond_0

    check-cast p3, Landroid/content/Context;

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    if-eqz p3, :cond_1

    invoke-static {p0, p1, p2, p3}, Ltop/mmjz/floatingclouds/XposedEntry;->initWeChatHooks$doInit(Ljava/util/concurrent/atomic/AtomicBoolean;La/J8;Ltop/mmjz/floatingclouds/XposedEntry;Landroid/content/Context;)V

    :cond_1
    return-object v0
.end method

.method private static final initWeChatHooks$lambda$4$lambda$3(Ljava/util/concurrent/atomic/AtomicBoolean;La/J8;Ltop/mmjz/floatingclouds/XposedEntry;Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 2

    const-string v0, "chain"

    invoke-static {p3, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p3}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object p3

    instance-of v1, p3, Landroid/app/Application;

    if-eqz v1, :cond_0

    check-cast p3, Landroid/app/Application;

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    if-eqz p3, :cond_1

    invoke-static {p0, p1, p2, p3}, Ltop/mmjz/floatingclouds/XposedEntry;->initWeChatHooks$doInit(Ljava/util/concurrent/atomic/AtomicBoolean;La/J8;Ltop/mmjz/floatingclouds/XposedEntry;Landroid/content/Context;)V

    :cond_1
    return-object v0
.end method

.method private static final initWeChatHooks$lambda$6$lambda$5(Ljava/util/concurrent/atomic/AtomicBoolean;La/J8;Ltop/mmjz/floatingclouds/XposedEntry;Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 2

    const-string v0, "chain"

    invoke-static {p3, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p3}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object p3

    instance-of v1, p3, Landroid/app/Application;

    if-eqz v1, :cond_0

    check-cast p3, Landroid/app/Application;

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    if-eqz p3, :cond_1

    invoke-static {p0, p1, p2, p3}, Ltop/mmjz/floatingclouds/XposedEntry;->initWeChatHooks$doInit(Ljava/util/concurrent/atomic/AtomicBoolean;La/J8;Ltop/mmjz/floatingclouds/XposedEntry;Landroid/content/Context;)V

    :cond_1
    return-object v0
.end method


# virtual methods
.method public onHotReloaded(Lio/github/libxposed/api/XposedModuleInterface$HotReloadedParam;)V
    .locals 5

    const-string v0, "param"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$HotReloadedParam;->getProcessName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "onHotReloaded: process="

    invoke-static {v0, p1}, La/z;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->b([Ljava/lang/Object;)V

    iget-object p1, p0, Ltop/mmjz/floatingclouds/XposedEntry;->hookHandles:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    sget-object p1, La/x8;->a:La/x8;

    sget-object v0, La/ca$c;->d:La/ca$c;

    invoke-virtual {p1, v0}, La/x8;->b(La/ca$c;)V

    const/4 p1, 0x0

    sput-boolean p1, La/s4;->F:Z

    sget-object v0, La/Rb;->a:La/Rb;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, La/Rb;->g:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    sput-object v1, La/Rb;->d:La/Rb$a;

    sput p1, La/Rb;->e:I

    const-wide/16 v2, 0x0

    sput-wide v2, La/Rb;->f:J

    sget-object v4, La/Wf;->a:La/Wf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    const-string v0, "ObfResolv: cache invalidated"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v4, 0x1

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    sget-object v0, La/Gb;->a:La/Gb;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, La/Gb;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_1
    sput-object v1, La/Gb;->h:La/Rb$a;

    sput p1, La/Gb;->i:I

    sput-wide v2, La/Gb;->j:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    sget-object v0, La/jf;->a:La/jf;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sput-object v1, La/jf;->c:La/kf;

    sput-boolean p1, La/jf;->d:Z

    const-string p1, "NONE"

    sput-object p1, La/jf;->e:Ljava/lang/String;

    sget-object p1, La/jg;->a:La/jg;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/jg;->e()La/kg;

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public onHotReloading(Lio/github/libxposed/api/XposedModuleInterface$HotReloadingParam;)Z
    .locals 1

    const-string v0, "param"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onHotReloading triggered \u2014 returning true to allow hot reload"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->b([Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onModuleLoaded(Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;)V
    .locals 4

    const-string v0, "param"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;->getProcessName()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "onModuleLoaded:"

    const-string v3, "pid="

    filled-new-array {v2, v0, v3, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;->getProcessName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.tencent.mm"

    invoke-static {v0, v1}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;->getProcessName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "top.mmjz.floatingclouds"

    invoke-static {v0, v1}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Skipping non-target process:"

    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;->getProcessName()Ljava/lang/String;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->b([Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onPackageLoaded(Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;)V
    .locals 3

    const-string v0, "param"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.tencent.mm"

    invoke-static {v0, v1}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "top.mmjz.floatingclouds"

    invoke-static {v0, v1}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;->isFirstPackage()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string v1, "onPackageLoaded:"

    const-string v2, "isFirst="

    filled-new-array {v1, v0, v2, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->b([Ljava/lang/Object;)V

    return-void
.end method

.method public onPackageReady(Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;)V
    .locals 6

    const-string v0, "param"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.tencent.mm"

    invoke-static {v0, v1}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "top.mmjz.floatingclouds"

    if-nez v0, :cond_0

    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->processName:Ljava/lang/String;

    if-nez v0, :cond_2

    :cond_1
    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "getPackageName(...)"

    invoke-static {v0, v2}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "classLoader ready"

    const-string v4, "onPackageReady:"

    const-string v5, "process="

    filled-new-array {v4, v2, v5, v0, v3}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, La/x1;->b([Ljava/lang/Object;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    const-string v1, "getClassLoader(...)"

    invoke-static {p1, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, v0}, Ltop/mmjz/floatingclouds/XposedEntry;->initWeChatHooks(Ljava/lang/ClassLoader;Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final registerHookHandle$app_release(Ljava/lang/String;Lio/github/libxposed/api/XposedInterface$HookHandle;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handle"

    invoke-static {p2, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ltop/mmjz/floatingclouds/XposedEntry;->hookHandles:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
