.class public final LQk;
.super Lde/robv/android/xposed/XC_MethodHook;
.source ""


# instance fields
.field public final synthetic a:Lio/github/cherrywechat/HookEntry;

.field public final synthetic b:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;


# direct methods
.method public constructor <init>(Lio/github/cherrywechat/HookEntry;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 0

    iput-object p1, p0, LQk;->a:Lio/github/cherrywechat/HookEntry;

    iput-object p2, p0, LQk;->b:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    invoke-super/range {p0 .. p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    const-wide v3, -0x1cfd1fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/app/Application;

    sget-object v3, LgG;->c:Ljava/lang/ClassLoader;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0x1cf8efffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const-wide v4, -0x1cf9bfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v3, v4, v5}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    const-wide v6, -0x1cfa3fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    const-wide v6, -0x20e19fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    sput-object v3, LgG;->c:Ljava/lang/ClassLoader;

    :cond_1
    sput-object v0, Lgf;->p:Landroid/app/Application;

    iget-object v0, v1, LQk;->b:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    iget-object v3, v0, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->processName:Ljava/lang/String;

    const-wide v6, -0x1cfb7fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->appInfo:Landroid/content/pm/ApplicationInfo;

    const-wide v6, -0x1ce43fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    const-wide v6, -0x20ed8fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    const-wide v6, -0x20ee4fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    const-wide v6, -0x20ec0fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    sput-object v3, LgG;->e:Ljava/lang/String;

    const-wide v3, -0x20ed0fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    sput-object v0, LgG;->f:Landroid/content/pm/ApplicationInfo;

    sget-object v3, Lio/github/cherrywechat/application/MainApplication;->a:Lio/github/cherrywechat/application/MainApplication;

    const-wide v6, -0x2f91cfffff835L

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    sget-object v3, Lgf;->p:Landroid/app/Application;

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {}, Landroid/app/AndroidAppHelper;->currentApplication()Landroid/app/Application;

    move-result-object v3

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    :goto_1
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v3, v0, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    move-result-wide v3

    long-to-int v3, v3

    sput v3, LgG;->a:I

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    const-wide v3, -0x20e11fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    sput-object v0, LgG;->b:Ljava/lang/String;

    const-wide v3, -0x20e94fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-class v3, Ljava/lang/String;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    const-class v4, Landroid/content/res/AssetManager;

    invoke-virtual {v4, v0, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    sget-object v4, Lio/github/cherrywechat/application/MainApplication;->a:Lio/github/cherrywechat/application/MainApplication;

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    sget-object v4, Lgf;->p:Landroid/app/Application;

    if-eqz v4, :cond_5

    goto :goto_2

    :cond_5
    invoke-static {}, Landroid/app/AndroidAppHelper;->currentApplication()Landroid/app/Application;

    move-result-object v4

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    :goto_2
    invoke-virtual {v4}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    sget-object v8, LgG;->d:Ljava/lang/String;

    if-eqz v8, :cond_6

    goto :goto_3

    :cond_6
    const-wide v8, -0x20e21fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-object v8, v2

    :goto_3
    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v0, v4, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    const-wide v8, -0x2fe3cfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-wide v8, -0x2fed4fffff835L

    :try_start_0
    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v4, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v4

    sput v4, LTB;->f:I

    const-wide v8, -0x2fed9fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v4, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v4

    sput v4, LTB;->g:I

    const-wide v8, -0x2fedefffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0

    sput v0, LTB;->h:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    sget-object v0, Lio/github/cherrywechat/application/MainApplication;->a:Lio/github/cherrywechat/application/MainApplication;

    if-eqz v0, :cond_7

    goto :goto_4

    :cond_7
    sget-object v0, Lgf;->p:Landroid/app/Application;

    if-eqz v0, :cond_8

    goto :goto_4

    :cond_8
    invoke-static {}, Landroid/app/AndroidAppHelper;->currentApplication()Landroid/app/Application;

    move-result-object v0

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    :goto_4
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const-wide v7, -0x2fee4fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    const-wide v8, -0x2fefffffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const-wide v7, -0x2fe82fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    const-wide v8, -0x2fe99fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v6

    sput v6, LTB;->i:I

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const-wide v7, -0x2fe9cfffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    const-wide v8, -0x2fea4fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v6

    sput v6, LTB;->j:I

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const-wide v7, -0x2fea7fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    const-wide v8, -0x2febafffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const-wide v7, -0x2febefffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    const-wide v8, -0x2fd57fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-wide v6, -0x2fd5bfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    const-wide v7, -0x2fd70fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v6, v7, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    const/16 v0, 0x14

    :try_start_1
    sget-object v4, LcG;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->clear()V

    invoke-static {}, LcG;->d()Landroid/content/SharedPreferences;

    move-result-object v6

    const-wide v7, -0x21372fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    const/4 v8, -0x1

    invoke-interface {v6, v7, v8}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v6

    sput v6, LcG;->b:I

    const-wide v6, -0x21377fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LZF;

    const/4 v8, 0x4

    invoke-direct {v7, v8}, LZF;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x2131efffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LH7;

    const/16 v9, 0x11

    invoke-direct {v7, v9}, LH7;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x2132efffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LH7;

    const/16 v10, 0x1c

    invoke-direct {v7, v10}, LH7;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x213d3fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LZF;

    const/16 v11, 0xa

    invoke-direct {v7, v11}, LZF;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x213e9fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LZF;

    const/16 v11, 0x16

    invoke-direct {v7, v11}, LZF;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x2138efffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LZF;

    const/16 v12, 0x18

    invoke-direct {v7, v12}, LZF;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x213b0fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LZF;

    const/16 v13, 0x19

    invoke-direct {v7, v13}, LZF;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x2124ffffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LZF;

    const/16 v14, 0x1b

    invoke-direct {v7, v14}, LZF;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x2126cfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LZF;

    invoke-direct {v7, v10}, LZF;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x2120cfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LZF;

    const/16 v10, 0x1d

    invoke-direct {v7, v10}, LZF;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x21225fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LZF;

    const/16 v15, 0xf

    invoke-direct {v7, v15}, LZF;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x212c3fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LZF;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    const/16 v2, 0x1a

    :try_start_2
    invoke-direct {v7, v2}, LZF;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x212e4fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LaG;

    invoke-direct {v7, v5}, LaG;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x212fbfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LaG;

    invoke-direct {v7, v3}, LaG;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x21295fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LaG;

    const/4 v9, 0x2

    invoke-direct {v7, v9}, LaG;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x212b1fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LaG;

    const/4 v9, 0x3

    invoke-direct {v7, v9}, LaG;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x21150fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LaG;

    invoke-direct {v7, v8}, LaG;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x2116bfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LH7;

    const/16 v8, 0xe

    invoke-direct {v7, v8}, LH7;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x21107fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LH7;

    invoke-direct {v7, v15}, LH7;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x2111efffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LH7;

    const/16 v15, 0x10

    invoke-direct {v7, v15}, LH7;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x21137fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LH7;

    const/16 v15, 0x12

    invoke-direct {v7, v15}, LH7;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x211d0fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LH7;

    const/16 v15, 0x13

    invoke-direct {v7, v15}, LH7;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x211f5fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LH7;

    invoke-direct {v7, v0}, LH7;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x21194fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LH7;

    const/16 v0, 0x15

    invoke-direct {v7, v0}, LH7;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x211b1fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LH7;

    invoke-direct {v7, v11}, LH7;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x21046fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LH7;

    const/16 v11, 0x17

    invoke-direct {v7, v11}, LH7;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x21066fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LH7;

    invoke-direct {v7, v12}, LH7;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x21006fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LH7;

    invoke-direct {v7, v13}, LH7;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x21021fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LH7;

    invoke-direct {v7, v2}, LH7;-><init>(I)V

    invoke-static {v6, v7}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x210c1fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v6, LH7;

    invoke-direct {v6, v14}, LH7;-><init>(I)V

    invoke-static {v2, v6}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x210e0fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v6, LH7;

    invoke-direct {v6, v10}, LH7;-><init>(I)V

    invoke-static {v2, v6}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v6, -0x21080fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v6, LZF;

    invoke-direct {v6, v5}, LZF;-><init>(I)V

    invoke-static {v2, v6}, LcG;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v5, -0x21096fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v5, LZF;

    invoke-direct {v5, v3}, LZF;-><init>(I)V

    invoke-static {v2, v5}, LcG;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v2, -0x210b0fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, LZF;

    const/4 v5, 0x2

    invoke-direct {v3, v5}, LZF;-><init>(I)V

    invoke-static {v2, v3}, LcG;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v2, -0x21f43fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, LZF;

    invoke-direct {v3, v9}, LZF;-><init>(I)V

    invoke-static {v2, v3}, LcG;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v2, -0x21f51fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, LZF;

    const/4 v5, 0x5

    invoke-direct {v3, v5}, LZF;-><init>(I)V

    invoke-static {v2, v3}, LcG;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v2, -0x21f6afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, LZF;

    const/4 v5, 0x6

    invoke-direct {v3, v5}, LZF;-><init>(I)V

    invoke-static {v2, v3}, LcG;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v2, -0x21f78fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, LZF;

    const/4 v5, 0x7

    invoke-direct {v3, v5}, LZF;-><init>(I)V

    invoke-static {v2, v3}, LcG;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v2, -0x21f09fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, LZF;

    const/16 v5, 0x8

    invoke-direct {v3, v5}, LZF;-><init>(I)V

    invoke-static {v2, v3}, LcG;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v2, -0x21f1dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, LZF;

    const/16 v5, 0x9

    invoke-direct {v3, v5}, LZF;-><init>(I)V

    invoke-static {v2, v3}, LcG;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v2, -0x21f26fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, LZF;

    const/16 v5, 0xb

    invoke-direct {v3, v5}, LZF;-><init>(I)V

    invoke-static {v2, v3}, LcG;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v2, -0x21f39fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, LZF;

    const/16 v5, 0xc

    invoke-direct {v3, v5}, LZF;-><init>(I)V

    invoke-static {v2, v3}, LcG;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v2, -0x21fc5fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, LZF;

    const/16 v5, 0xd

    invoke-direct {v3, v5}, LZF;-><init>(I)V

    invoke-static {v2, v3}, LcG;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v2, -0x21fdffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, LZF;

    invoke-direct {v3, v8}, LZF;-><init>(I)V

    invoke-static {v2, v3}, LcG;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v2, -0x21ff7fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, LZF;

    const/16 v5, 0x10

    invoke-direct {v3, v5}, LZF;-><init>(I)V

    invoke-static {v2, v3}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v2, -0x21f9dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, LZF;

    const/16 v5, 0x11

    invoke-direct {v3, v5}, LZF;-><init>(I)V

    invoke-static {v2, v3}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v2, -0x21fb9fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, LZF;

    const/16 v5, 0x12

    invoke-direct {v3, v5}, LZF;-><init>(I)V

    invoke-static {v2, v3}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v2, -0x21e64fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, LZF;

    invoke-direct {v3, v15}, LZF;-><init>(I)V

    invoke-static {v2, v3}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v2, -0x21e7ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, LZF;

    const/16 v5, 0x14

    invoke-direct {v3, v5}, LZF;-><init>(I)V

    invoke-static {v2, v3}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v2, -0x21e2bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, LZF;

    invoke-direct {v3, v0}, LZF;-><init>(I)V

    invoke-static {v2, v3}, LcG;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    const-wide v2, -0x21ec5fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    new-instance v2, LZF;

    invoke-direct {v2, v11}, LZF;-><init>(I)V

    invoke-static {}, LcG;->d()Landroid/content/SharedPreferences;

    move-result-object v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    const/4 v5, 0x0

    :try_start_3
    invoke-interface {v3, v0, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v6, LbG;

    invoke-direct {v6, v3, v0, v2}, LbG;-><init>(Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v4, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_6

    :catch_1
    const/4 v5, 0x0

    goto :goto_5

    :catch_2
    move-object v5, v2

    :catch_3
    :goto_5
    const-wide v2, -0x21ed7fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    :goto_6
    sget v0, LcG;->b:I

    const/16 v2, 0x73

    if-eq v0, v2, :cond_9

    const-wide v2, -0x1d7dbfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v2, -0x20df5fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    sget v3, LgG;->a:I

    invoke-static {v0}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v2, v0}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v3, -0x1d7f8fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, LiG;->f(Ljava/lang/String;)V

    new-instance v0, LMx;

    const/16 v5, 0x14

    invoke-direct {v0, v5}, LMx;-><init>(I)V

    invoke-virtual {v2, v0}, LiG;->a(Lfj;)V

    goto/16 :goto_b

    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v2, LgG;->e:Ljava/lang/String;

    const-wide v3, -0x20e34fffff835L

    if-eqz v2, :cond_a

    goto :goto_7

    :cond_a
    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-object v2, v5

    :goto_7
    iget-object v6, v1, LQk;->a:Lio/github/cherrywechat/HookEntry;

    iget-object v7, v6, Lio/github/cherrywechat/HookEntry;->a:Ljava/lang/String;

    invoke-static {v2, v7}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    sget-object v2, LgG;->e:Ljava/lang/String;

    if-eqz v2, :cond_b

    goto :goto_8

    :cond_b
    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-object v2, v5

    :goto_8
    iget-object v3, v6, Lio/github/cherrywechat/HookEntry;->b:Ljava/lang/String;

    invoke-static {v2, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    :cond_c
    sget-object v2, LEA;->a:LEA;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, LEA;->f:Landroid/content/SharedPreferences;

    const-wide v3, -0x2d386fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v6, -0x2d38dfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v2, v5, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-wide v8, -0x2d38ffffff835L

    if-nez v5, :cond_d

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    :cond_d
    const-wide v10, -0x1ce4bfffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_10

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_e

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    :cond_e
    invoke-static {v2}, LEA;->k(Ljava/lang/String;)V

    sget-object v2, LXA;->a:Ljava/util/HashMap;

    invoke-static {}, LEA;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LEA;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x2d1dffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    sget-object v3, LXA;->a:Ljava/util/HashMap;

    sget-object v4, LXA;->b:Ljava/util/HashMap;

    invoke-static {v2, v3, v4}, Lio/github/cherrywechat/theme/ThemeProvider;->installTheme(Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;)Z

    move-result v2

    if-eqz v2, :cond_f

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    sget-object v3, Lk5;->b:Lk5;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lk5;->l:Lk5;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lk5;->k:Lk5;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lk5;->d:Lk5;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lk5;->f:Lk5;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lk5;->e:Lk5;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lk5;->j:Lk5;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lk5;->g:Lk5;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lk5;->c:Lk5;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, LbF;->a:LbF;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lk5;->i:Lk5;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lk5;->h:Lk5;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Ldu;->a:Ldu;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_9

    :cond_f
    const-wide v2, -0x1ce4dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LEA;->k(Ljava/lang/String;)V

    goto :goto_9

    :cond_10
    const-wide v2, -0x1ce4ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LEA;->k(Ljava/lang/String;)V

    :cond_11
    :goto_9
    sget-object v2, LO0;->a:LO0;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    sget-object v3, Lds;->a:Lds;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Ljp;->d:Ljp;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Ljp;->c:Ljp;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Ljp;->b:Ljp;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Ljp;->e:Ljp;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-static {}, LQj;->u()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lx5;

    :try_start_4
    invoke-virtual {v3}, Lx5;->a()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_a

    :catchall_0
    move-exception v0

    sget v4, LgG;->a:I

    sget-object v4, LgG;->g:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-wide v4, -0x1ce51fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v3}, Lx5;->b()Ljava/lang/String;

    goto :goto_a

    :cond_12
    :goto_b
    return-void
.end method

.method public final beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 6

    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    const-wide v0, -0x1cf00fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/content/Context;

    sget v0, LgG;->a:I

    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    const-wide v0, -0x1cf3dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x20e19fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sput-object p1, LgG;->c:Ljava/lang/ClassLoader;

    const-wide v0, -0x1cee8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    const-wide v0, -0x20df5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    invoke-static {p1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    invoke-direct {v2, p1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v3, -0x1cea1fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, LiG;->f(Ljava/lang/String;)V

    sget-object p1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, p1}, LiG;->i(Ljava/lang/Class;)V

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v2, v3}, LiG;->h(Ljava/lang/Object;)V

    const-wide v4, -0x1cd45fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, LiG;

    invoke-static {v2}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v1, -0x1cd7efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LiG;->f(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, LiG;->i(Ljava/lang/Class;)V

    invoke-virtual {v0, v3}, LiG;->h(Ljava/lang/Object;)V

    return-void
.end method
