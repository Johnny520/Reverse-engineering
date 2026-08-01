.class public final Ljs;
.super Lde/robv/android/xposed/XC_MethodHook;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 3

    iput p1, p0, Ljs;->a:I

    iput-object p2, p0, Ljs;->b:Ljava/lang/Object;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e7\u06e6\u06e2"

    invoke-static {v1}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "vTuPdmaikXCu29ctUH"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟ۢۨۦۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۥۥۢۧ()I

    move-result v1

    if-ltz v1, :cond_2

    const-string v1, "\u06e1\u06e2\u06e8"

    :goto_1
    invoke-static {v1}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    :sswitch_1
    sget v1, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    if-ltz v1, :cond_1

    const-string v1, "\u06e2\u06e5\u06e4"

    :goto_2
    invoke-static {v1}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    rem-int/2addr v1, v2

    const v2, 0x1ab554

    add-int/2addr v1, v2

    goto :goto_0

    :cond_2
    const-string v1, "\u06e0\u06e2\u06e8"

    goto :goto_1

    :sswitch_2
    const-string v1, "\u06e7\u06e6\u06e2"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_3
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    if-ltz v1, :cond_3

    const-string v1, "\u06e7\u06e6\u06e2"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    const-string v1, "\u06e3\u06df\u06e7"

    goto :goto_2

    :sswitch_4
    invoke-static {}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۦۢۧۧ()I

    move-result v1

    if-gtz v1, :cond_0

    const-string v1, "\u06e3\u06e8"

    goto :goto_1

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc65 -> :sswitch_0
        0x1aab26 -> :sswitch_3
        0x1aaee7 -> :sswitch_1
        0x1ab265 -> :sswitch_2
        0x1ab60b -> :sswitch_5
        0x1ac5e3 -> :sswitch_4
    .end sparse-switch
.end method

.method private final a(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 12

    const/4 v11, 0x3

    const/4 v6, 0x0

    const/4 v10, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-string v0, "DML9wzQ=\n"

    const-string v1, "fKOPollEQpA=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const-string v1, "GvRnp06Ix6Qa7n/rDI6GqRXyf+sahIakG+8mpRuHyuoA+HuuTorIrgbuYq9Aita6WsB7uwKCxasA\n6GSl\n"

    const-string v2, "dIELy27rpso=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v0, Landroid/app/Application;

    sget-object v2, Lkn;->a:Lkn;

    iget-object v1, p0, Ljs;->b:Ljava/lang/Object;

    check-cast v1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    iget-object v3, v1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->processName:Ljava/lang/String;

    const-string v7, "y89lkaeuC6Pa0G8=\n"

    const-string v8, "u70K8sLdeO0=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "Kz+CnDVesw==\n"

    const-string v7, "SFDs6FAmx/U=\n"

    invoke-static {v2, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v2, "vDSca10=\n"

    const-string v7, "zHr9BjjJTsI=\n"

    invoke-static {v2, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sput-object v0, Lkn;->b:Landroid/app/Application;

    sput-object v3, Lkn;->d:Ljava/lang/String;

    const-string v2, "6KC2o5Nexo7uoa+jilY=\n"

    const-string v7, "i8/bjec7qO0=\n"

    invoke-static {v2, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getExternalMediaDirs()[Ljava/io/File;

    move-result-object v2

    const-string v3, "klpMk/Z7I12bXlSb62svTrFWSqWmIWgB3A==\n"

    const-string v7, "9T841o4PRi8=\n"

    invoke-static {v3, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v3, v2

    if-nez v3, :cond_8

    move-object v2, v6

    :goto_0
    if-nez v2, :cond_0

    new-instance v2, Ljava/io/File;

    const-string v3, "u2moe+pkcVW7f7Fh9GRiVfA17DvZa3JC+3O4O/Vgcln1Nb979StiVfp5uXrsK3td\n"

    const-string v7, "lBrcFJgFFjA=\n"

    invoke-static {v3, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    :cond_0
    new-instance v3, Ljava/io/File;

    const-string v7, "RlErxlg/YJoAR33GaS8=\n"

    const-string v8, "aCJStQdcAfk=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v3, v2, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    :cond_1
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_9

    new-instance v2, Lio/fastkv/FastKV$Builder;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    const-string v7, "DsSb2owU1v0S9Z7shRja0B7Li+2E\n"

    const-string v8, "faroheF9tY8=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v2, v3, v7}, Lio/fastkv/FastKV$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Lio/fastkv/FastKV$Builder;->build()Lio/fastkv/FastKV;

    move-result-object v2

    sput-object v2, Lkn;->c:Lio/fastkv/FastKV;

    :goto_1
    new-instance v7, Ljava/io/File;

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    const-string v3, "0R5zqQ==\n"

    const-string v8, "qXIczgS1IdM=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v7, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v2, Ljava/io/File;

    const-string v3, "frw7G4hrUyNjvjAZpVVONnKiPR+kJEgl\n"

    const-string v8, "BtBUfNcKI1M=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v7, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result v2

    if-eqz v2, :cond_3

    :try_start_1
    new-instance v2, Lio/fastkv/FastKV$Builder;

    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    const-string v8, "MK5V7gdIGDktrF7sKnYFLDywU+or\n"

    const-string v9, "SMI6iVgpaEk=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v2, v3, v8}, Lio/fastkv/FastKV$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Lio/fastkv/FastKV$Builder;->build()Lio/fastkv/FastKV;

    move-result-object v2

    invoke-virtual {v2}, Lio/fastkv/FastKV;->getAll()Ljava/util/Map;

    move-result-object v2

    const-string v3, "mspj2FV31grTgT4=\n"

    const-string v8, "/a8XmTkb/iQ=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_2
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v9, v2, Ljava/lang/Boolean;

    if-eqz v9, :cond_b

    sget-object v9, Lkn;->c:Lio/fastkv/FastKV;

    if-eqz v9, :cond_2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v9, v3, v2}, Lio/fastkv/FastKV;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v2

    :try_start_2
    const-string v2, "H2lHVykSqX4xa31/BhimdhFiVlkYE6Z0\n"

    const-string v3, "WAwiPGp9xxg=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "06ke\n"

    const-string v7, "p8h5VTpLcuY=\n"

    invoke-static {v3, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "tw==\n"

    const-string v3, "0vI8ySRxU5w=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :cond_3
    :goto_3
    const-string v2, "onmb94983DS1eYzDoGbcPrY=\n"

    const-string v3, "xRz+nNAUuVg=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v7

    sget-object v2, Lkn;->c:Lio/fastkv/FastKV;

    if-eqz v2, :cond_5

    const-string v3, "TV32KZve5K9QS80bhtbJo0FKwCWtyuKrRULdLA==\n"

    const-string v8, "JC6pRPK5ls4=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v8, 0x0

    invoke-virtual {v2, v3, v8}, Lio/fastkv/FastKV;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_5

    invoke-interface {v7}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v2

    const-string v3, "35EUtegEvAWW2kk=\n"

    const-string v8, "uPRg9IRolCs=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_4
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v9, v2, Ljava/lang/Boolean;

    if-eqz v9, :cond_12

    sget-object v9, Lkn;->c:Lio/fastkv/FastKV;

    if-eqz v9, :cond_4

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v9, v3, v2}, Lio/fastkv/FastKV;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v2

    const-string v2, "06ke\n"

    const-string v3, "p8h5VTpLcuY=\n"

    const-string v7, "MjRMVBlMyGwaPEt/EWj2Vhw=\n"

    const-string v8, "dFU/IFIalyU=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "tw==\n"

    const-string v9, "0vI8ySRxU5w=\n"

    invoke-static {v2, v3, v7, v8, v9}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :try_start_3
    new-instance v2, Ljava/io/File;

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    const-string v7, "TeSAmXKJ0GhD7ISGSKPafUbth5NOlw==\n"

    const-string v8, "KoHl8i38vBw=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v2, v3, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    new-instance v3, Lio/fastkv/FastKV$Builder;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const-string v7, "3y9/pGCglujDHnqSaayaxc8gb5No\n"

    const-string v8, "rEEM+w3J9Zo=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v3, v2, v7}, Lio/fastkv/FastKV$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3}, Lio/fastkv/FastKV$Builder;->build()Lio/fastkv/FastKV;

    move-result-object v2

    sput-object v2, Lkn;->c:Lio/fastkv/FastKV;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :cond_5
    :goto_5
    new-instance v2, Lhn;

    invoke-direct {v2}, Lhn;-><init>()V

    invoke-virtual {v0, v2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object v1, v1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->processName:Ljava/lang/String;

    const-string v2, "6VUvdufZJPfvVDZ2/tE=\n"

    const-string v3, "ijpCWJO8SpQ=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    :try_start_4
    sget-object v1, Lu6;->a:Lu6;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lu6;->d(Landroid/app/Application;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :goto_6
    sget-object v1, Lkn;->a:Lkn;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "44rX2aixog==\n"

    const-string v2, "gOW5rc3J1tc=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    new-instance v1, Landroid/content/IntentFilter;

    sget-object v2, Lkn;->l:Ljava/lang/String;

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    new-instance v2, Lcom/ljx/wechatmod/core/GeekConfig$registerUpdateReceiver$receiver$1;

    invoke-direct {v2}, Lcom/ljx/wechatmod/core/GeekConfig$registerUpdateReceiver$receiver$1;-><init>()V

    :try_start_5
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x21

    if-lt v3, v7, :cond_16

    const/4 v3, 0x2

    invoke-virtual {v0, v2, v1, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :goto_7
    :try_start_6
    const-string v1, "3uP89zieLhnK6fKxNYA7WNk=\n"

    const-string v2, "vYyR2VT0Vjc=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget-wide v8, v1, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    sget-object v1, Lkn;->a:Lkn;

    const-string v2, "ItanN/q3QygW2rAb4rdcMBbHtwXz\n"

    const-string v3, "SbPeaJbWMFw=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "KQ==\n"

    const-string v7, "GekofuEByPY=\n"

    invoke-static {v3, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v3}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Li50;->P(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_17

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    :goto_8
    cmp-long v1, v8, v2

    if-eqz v1, :cond_6

    const-string v1, "lW2dib7Hw7WufJ6NuA==\n"

    const-string v2, "wB356MqijtQ=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "5dwLN8REmJezmSNwlFLq+ozubEXuKtOW69wOOdBDmae5kDddlHPH+ovJYlb8KMCx5eUcNP54mae5\nX6i2FKoW\n"

    const-string v3, "A3+L0XHPfR8=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "ioxU\n"

    const-string v7, "/u0zZ+lqY9I=\n"

    invoke-static {v3, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "KFnE\n"

    const-string v3, "RSqjPIOV6WI=\n"

    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "WgI445y7MzZUEx7ZgaoiPW4ELtiK\n"

    const-string v2, "MWdBvO/eUEQ=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "L6Fhvjs=\n"

    const-string v3, "DMYE21AZdgM=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkn;->h(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "q7/VPJY43aefs8IQjjjCv5+uxQ6f\n"

    const-string v2, "wNqsY/pZrtM=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkn;->h(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    :try_start_7
    const-string v1, "MjdhfMnevW3oxeGgnZ+bBZ3xgfiT+vkN0LeLtMnsi2365e2QopGhJpHqvjcMEXntHg==\n"

    const-string v2, "dVIEFy92HIg=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    :cond_6
    :goto_9
    invoke-static {v0}, Lub0;->t(Landroid/app/Application;)V

    sget-object v3, Lkn;->a:Lkn;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, Lkn;->i:Lsd;

    sget-object v8, Lyg;->b:Lof;

    new-instance v1, Lss;

    invoke-direct {v1, v0, v6, v5}, Lss;-><init>(Landroid/content/ContextWrapper;Lvd;I)V

    invoke-static {v7, v8, v1, v10}, Lg80;->u(Lpe;Lhe;Lym;I)Lw40;

    const-string v1, "B5sqjWsXKR8VoT69ahw=\n"

    const-string v2, "bP5T0g55XW0=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v10}, Lkn;->b(Ljava/lang/String;I)I

    move-result v1

    if-eq v1, v4, :cond_19

    if-eq v1, v10, :cond_19

    :goto_a
    if-eqz v1, :cond_1a

    if-eq v1, v10, :cond_1a

    :goto_b
    sget-object v1, Lu6;->a:Lu6;

    const-string v2, "d+SGpbsBqnhz/w==\n"

    const-string v6, "FpHyzeR1xRM=\n"

    invoke-static {v2, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lu6;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_1b

    const-string v1, "nviYmwC/TK2x6A==\n"

    const-string v0, "343s80XRK8Q=\n"

    :goto_c
    invoke-static {v1, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_d
    const-string v1, "Access Denied. Core Hooks blocked for wxid: "

    sget-object v2, Lu6;->g:Ljava/lang/String;

    invoke-static {v1, v2}, Lg40;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ioxU\n"

    const-string v3, "/u0zZ+lqY9I=\n"

    const-string v4, "KFnE\n"

    const-string v5, "RSqjPIOV6WI=\n"

    invoke-static {v2, v3, v0, v4, v5}, Lg40;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_7
    :goto_e
    return-void

    :cond_8
    const/4 v3, 0x0

    :try_start_8
    aget-object v2, v2, v3

    goto/16 :goto_0

    :cond_9
    new-instance v2, Ljava/io/File;

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    const-string v7, "LqcM7Oj92MYloAjk3MTayyqqDA==\n"

    const-string v8, "ScJph7ebuao=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v2, v3, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_a

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    :cond_a
    new-instance v3, Lio/fastkv/FastKV$Builder;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const-string v7, "FfHgr7opSmIJwOWZsyVGTwX+8Jiy\n"

    const-string v8, "Zp+T8NdAKRA=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v3, v2, v7}, Lio/fastkv/FastKV$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3}, Lio/fastkv/FastKV$Builder;->build()Lio/fastkv/FastKV;

    move-result-object v2

    sput-object v2, Lkn;->c:Lio/fastkv/FastKV;

    const-string v2, "VcMqO9AKt8BxxSo4\n"

    const-string v3, "FqxEXblt8q4=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "5kCZh7SJ4x6gTNDrpOFYVeFnrI2EnSZAvj+d2eSyZhS4Vtzfvu9aduNgnoCLtSZ9gTO6wOq0Whyf\nSNzFlONBUw==\n"

    const-string v7, "BNo5aAwGw/s=\n"

    invoke-static {v3, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v7, "ioxU\n"

    const-string v8, "/u0zZ+lqY9I=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "KFnE\n"

    const-string v7, "RSqjPIOV6WI=\n"

    invoke-static {v2, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto/16 :goto_1

    :cond_b
    :try_start_9
    instance-of v9, v2, Ljava/lang/String;

    if-eqz v9, :cond_c

    sget-object v9, Lkn;->c:Lio/fastkv/FastKV;

    if-eqz v9, :cond_2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v9, v3, v2}, Lio/fastkv/FastKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto/16 :goto_2

    :cond_c
    instance-of v9, v2, Ljava/lang/Integer;

    if-eqz v9, :cond_2

    sget-object v9, Lkn;->c:Lio/fastkv/FastKV;

    if-eqz v9, :cond_2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v9, v3, v2}, Lio/fastkv/FastKV;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    goto/16 :goto_2

    :cond_d
    new-instance v2, Lhg;

    invoke-direct {v2, v7}, Lhg;-><init>(Ljava/io/File;)V

    new-instance v7, Lhk;

    invoke-direct {v7, v2}, Lhk;-><init>(Lhg;)V

    :cond_e
    move v3, v4

    :goto_f
    invoke-virtual {v7}, Lhk;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-virtual {v7}, Lhk;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v8

    if-nez v8, :cond_f

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_10

    :cond_f
    if-nez v3, :cond_e

    :cond_10
    move v3, v5

    goto :goto_f

    :cond_11
    const-string v2, "Joa1YsgpSKsCm7pwyCFr\n"

    const-string v3, "ZenbBKFOBcI=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "YSzhRUT9/ORYO+xPVv3i+EIq4EgFvP/lDCDrWECv/+BAaeZNRrX0oU8l4E1LuPWv\n"

    const-string v7, "LEmFLCXdkYE=\n"

    invoke-static {v3, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v7, "ioxU\n"

    const-string v8, "/u0zZ+lqY9I=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "KFnE\n"

    const-string v7, "RSqjPIOV6WI=\n"

    invoke-static {v2, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto/16 :goto_3

    :cond_12
    :try_start_a
    instance-of v9, v2, Ljava/lang/String;

    if-eqz v9, :cond_13

    sget-object v9, Lkn;->c:Lio/fastkv/FastKV;

    if-eqz v9, :cond_4

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v9, v3, v2}, Lio/fastkv/FastKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto/16 :goto_4

    :cond_13
    instance-of v9, v2, Ljava/lang/Integer;

    if-eqz v9, :cond_4

    sget-object v9, Lkn;->c:Lio/fastkv/FastKV;

    if-eqz v9, :cond_4

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v9, v3, v2}, Lio/fastkv/FastKV;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    goto/16 :goto_4

    :cond_14
    sget-object v2, Lkn;->c:Lio/fastkv/FastKV;

    if-eqz v2, :cond_15

    const-string v3, "1XbcuTsQA2nIYOeLJhguZdlh6rUNBAVt3Wn3vA==\n"

    const-string v8, "vAWD1FJ3cQg=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v8, 0x1

    invoke-virtual {v2, v3, v8}, Lio/fastkv/FastKV;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    :cond_15
    invoke-interface {v7}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    goto/16 :goto_5

    :catchall_2
    move-exception v2

    const-string v2, "06ke\n"

    const-string v3, "p8h5VTpLcuY=\n"

    const-string v7, "eutdcKKNW4BU6WdOjZZci1z6XV2AjlmEXO1T\n"

    const-string v8, "PY44G+HiNeY=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "tw==\n"

    const-string v9, "0vI8ySRxU5w=\n"

    invoke-static {v2, v3, v7, v8, v9}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_5

    :catchall_3
    move-exception v1

    const-string v1, "06ke\n"

    const-string v2, "p8h5VTpLcuY=\n"

    const-string v3, "SCeIlhWaY0huN46hEZVkXQ==\n"

    const-string v7, "CVL8/lj7DSk=\n"

    invoke-static {v3, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v7, "tw==\n"

    const-string v8, "0vI8ySRxU5w=\n"

    invoke-static {v1, v2, v3, v7, v8}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_6

    :cond_16
    :try_start_b
    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    goto/16 :goto_7

    :catchall_4
    move-exception v1

    const-string v1, "06ke\n"

    const-string v2, "p8h5VTpLcuY=\n"

    const-string v3, "dL/8ohkX4vhavcabPx/l7Ue/65s/G+n3Rb/r\n"

    const-string v7, "M9qZyVp4jJ4=\n"

    invoke-static {v3, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v7, "tw==\n"

    const-string v8, "0vI8ySRxU5w=\n"

    invoke-static {v1, v2, v3, v7, v8}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_7

    :cond_17
    const-wide/16 v2, 0x0

    goto/16 :goto_8

    :catchall_5
    move-exception v1

    sget-object v1, Lkn;->a:Lkn;

    const-string v2, "wcenjnETEMjP1oG0bAIBw/XBsbVn\n"

    const-string v3, "qqLe0QJ2c7o=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, ""

    invoke-static {v2, v1}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_18

    const-string v1, "ECpa5r0FbAkeO3zcoBR9AiQsTN2r\n"

    const-string v2, "e08juc5gD3s=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Q4XSHws=\n"

    const-string v3, "YOK3emBUNqI=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkn;->h(Ljava/lang/String;Ljava/lang/String;)V

    :cond_18
    const-string v1, "06ke\n"

    const-string v2, "p8h5VTpLcuY=\n"

    const-string v3, "R5h+ScF12nB8iX1Nxw==\n"

    const-string v7, "EugaKLUQlxE=\n"

    invoke-static {v3, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v7, "tw==\n"

    const-string v8, "0vI8ySRxU5w=\n"

    invoke-static {v1, v2, v3, v7, v8}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_9

    :cond_19
    const-string v2, "a2Ux75808XJMcivVlS/f\n"

    const-string v6, "OABSnfpAtBw=\n"

    invoke-static {v2, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v6, Lrs;

    invoke-direct {v6, v0, v5}, Lrs;-><init>(Landroid/app/Application;I)V

    invoke-static {v2, v6}, Lkn;->j(Ljava/lang/String;Ljm;)V

    goto/16 :goto_a

    :cond_1a
    const-string v1, "NHbTUcmWzVUAW9JL5w==\n"

    const-string v2, "eRO9JIz4uSc=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrs;

    invoke-direct {v2, v0, v4}, Lrs;-><init>(Landroid/app/Application;I)V

    invoke-static {v1, v2}, Lkn;->j(Ljava/lang/String;Ljm;)V

    goto/16 :goto_b

    :cond_1b
    invoke-static {v1}, Lju;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_1d

    :cond_1c
    const-string v1, "8fiqcIH9Gvve6A==\n"

    const-string v0, "sI3eGMSTfZI=\n"

    goto/16 :goto_c

    :cond_1d
    new-array v2, v4, [Ljava/lang/String;

    const-string v4, "Rg==\n"

    const-string v6, "OpSIIB0Yfgw=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v5

    invoke-static {v1, v2}, Li50;->J(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ne v2, v11, :cond_1c

    const/4 v2, 0x1

    :try_start_c
    new-array v2, v2, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "QA==\n"

    const-string v6, "PADkSf+JFYg=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v2, v4

    invoke-static {v1, v2}, Li50;->J(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    const/4 v1, 0x0

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v10

    const/4 v2, 0x2

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    sget-object v4, Lu6;->g:Ljava/lang/String;

    invoke-static {v1, v4}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    const-string v0, "QxnCQDKO8tJsCQ==\n"

    const-string v1, "Amy2KHfglbs=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v0, Lu6;->g:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Access Denied. Core Hooks blocked for wxid: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ioxU\n"

    const-string v3, "/u0zZ+lqY9I=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_10
    const-string v1, "KFnE\n"

    const-string v2, "RSqjPIOV6WI=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    goto/16 :goto_e

    :catch_0
    move-exception v0

    const-string v0, "H/Qy9WnbfGIw5A==\n"

    const-string v1, "XoFGnSy1Gws=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lu6;->a:Lu6;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_d

    :cond_1e
    :try_start_d
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    cmp-long v1, v4, v10

    if-lez v1, :cond_1f

    const-string v0, "K0zIfIWLSHcEXA==\n"

    const-string v1, "ajm8FMDlLx4=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v0, Lu6;->g:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Access Denied. Core Hooks blocked for wxid: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ioxU\n"

    const-string v3, "/u0zZ+lqY9I=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_10

    :cond_1f
    sget v1, Lu6;->c:I

    if-eq v2, v1, :cond_20

    const-string v0, "6APWMXEUo6zsGA==\n"

    const-string v1, "iXaiWS5gzMc=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lu6;->e(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ks9lGoTaGTq93w==\n"

    const-string v1, "07oRcsG0flM=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v0, Lu6;->g:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Access Denied. Core Hooks blocked for wxid: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ioxU\n"

    const-string v3, "/u0zZ+lqY9I=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_10

    :cond_20
    sget-object v1, Lfb;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lt6;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lt6;-><init>(Lvd;I)V

    const/4 v2, 0x2

    invoke-static {v7, v8, v1, v2}, Lg80;->u(Lpe;Lhe;Lym;I)Lw40;

    const-string v1, "yPB/HDoNWnX04g==\n"

    const-string v2, "m4kMaF9gEho=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lts;

    const/4 v3, 0x2

    invoke-direct {v2, v0, v3}, Lts;-><init>(Landroid/app/Application;I)V

    invoke-static {v1, v2}, Lkn;->j(Ljava/lang/String;Ljm;)V

    const-string v1, "zojS43wZ3/jxldA=\n"

    const-string v2, "nvq7lR16prA=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lts;

    const/4 v3, 0x3

    invoke-direct {v2, v0, v3}, Lts;-><init>(Landroid/app/Application;I)V

    invoke-static {v1, v2}, Lkn;->j(Ljava/lang/String;Ljm;)V

    const-string v1, "arXCFJnv\n"

    const-string v2, "P/yKe/aEgBY=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "bdYc\n"

    const-string v3, "Gbd7MCENE9g=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "MI5Od4o=\n"

    const-string v2, "UuIhFOEuZWs=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0

    :try_start_e
    const-string v1, "TKI4/lI2s18=\n"

    const-string v2, "I8xqmyFD3jo=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lw50;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lw50;-><init>(I)V

    const-class v3, Landroid/app/Activity;

    invoke-static {v3, v1, v2}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    :goto_11
    :try_start_f
    const-string v1, "tUp8qgVZvWqUTw==\n"

    const-string v2, "5iQP5GAtygU=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lts;

    const/4 v3, 0x4

    invoke-direct {v2, v0, v3}, Lts;-><init>(Landroid/app/Application;I)V

    invoke-static {v1, v2}, Lkn;->j(Ljava/lang/String;Ljm;)V

    const-string v1, "ByMpETSY1dw9JTIW\n"

    const-string v2, "SUxdeFLxtr0=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lts;

    const/4 v3, 0x5

    invoke-direct {v2, v0, v3}, Lts;-><init>(Landroid/app/Application;I)V

    invoke-static {v1, v2}, Lkn;->j(Ljava/lang/String;Ljm;)V

    const-string v1, "3rdjGlsObQ==\n"

    const-string v2, "jdkQUjRhBqo=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lts;

    const/4 v3, 0x6

    invoke-direct {v2, v0, v3}, Lts;-><init>(Landroid/app/Application;I)V

    invoke-static {v1, v2}, Lkn;->j(Ljava/lang/String;Ljm;)V

    const-string v1, "Xg/S2HeNpyc=\n"

    const-string v2, "HWezrD/iyEw=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lts;

    const/4 v3, 0x7

    invoke-direct {v2, v0, v3}, Lts;-><init>(Landroid/app/Application;I)V

    invoke-static {v1, v2}, Lkn;->j(Ljava/lang/String;Ljm;)V

    const-string v1, "OG9oOnYxsI83\n"

    const-string v2, "dQobSRdW1cs=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lts;

    const/16 v3, 0x8

    invoke-direct {v2, v0, v3}, Lts;-><init>(Landroid/app/Application;I)V

    invoke-static {v1, v2}, Lkn;->j(Ljava/lang/String;Ljm;)V

    const-string v1, "mzkn/1rFMxayNQ==\n"

    const-string v2, "10xElCOIXHg=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lts;

    const/16 v3, 0x9

    invoke-direct {v2, v0, v3}, Lts;-><init>(Landroid/app/Application;I)V

    invoke-static {v1, v2}, Lkn;->j(Ljava/lang/String;Ljm;)V

    const-string v1, "asORSA6A+H5IyQ==\n"

    const-string v2, "J6L4JlvJsBE=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lts;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lts;-><init>(Landroid/app/Application;I)V

    invoke-static {v1, v2}, Lkn;->j(Ljava/lang/String;Ljm;)V

    const-string v1, "h3S5gy0q6+6dfreE\n"

    const-string v2, "1RHY72NLhos=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lts;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lts;-><init>(Landroid/app/Application;I)V

    invoke-static {v1, v2}, Lkn;->j(Ljava/lang/String;Ljm;)V

    const-string v0, "iQ6vH98sRkimHg==\n"

    const-string v1, "yHvbd5pCISE=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Iibd9B9zf+IAMt31FXMr+wIg2vkeMSvjDDzC71p5bvsPPND5Hj145gw83fQWZCU=\n"

    const-string v2, "Y1OpnHodC4s=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ioxU\n"

    const-string v3, "/u0zZ+lqY9I=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "KFnE\n"

    const-string v2, "RSqjPIOV6WI=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v0, Lus;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lus;-><init>(Lvd;)V

    const/4 v1, 0x2

    invoke-static {v7, v8, v0, v1}, Lg80;->u(Lpe;Lhe;Lym;I)Lw40;

    goto/16 :goto_e

    :catchall_6
    move-exception v1

    const-string v1, "06ke\n"

    const-string v2, "p8h5VTpLcuY=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v1, "tw==\n"

    const-string v2, "0vI8ySRxU5w=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_0

    goto/16 :goto_11

    :catchall_7
    move-exception v1

    goto/16 :goto_9
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 74

    const/16 v40, 0x0

    const/4 v10, 0x0

    const/16 v41, 0x0

    const/16 v31, 0x0

    const/16 v30, 0x0

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/16 v69, 0x0

    const/16 v39, 0x0

    const/16 v66, 0x0

    const/4 v5, 0x0

    const/4 v11, 0x0

    const/16 v49, 0x0

    const/16 v55, 0x0

    const/16 v68, 0x0

    const/4 v9, 0x0

    const/16 v45, 0x0

    const/16 v50, 0x0

    const/16 v44, 0x0

    const/16 v32, 0x0

    const/16 v38, 0x0

    const/16 v48, 0x0

    const/16 v47, 0x0

    const/16 v46, 0x0

    const/16 v56, 0x0

    const/16 v64, 0x0

    const/4 v14, 0x0

    const/16 v57, 0x0

    const/4 v4, 0x0

    const/16 v42, 0x0

    const/16 v58, 0x0

    const/16 v61, 0x0

    const/16 v65, 0x0

    const/4 v12, 0x0

    const/16 v29, 0x0

    const/16 v43, 0x0

    const/16 v28, 0x0

    const/16 v35, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v60, 0x0

    const/16 v62, 0x0

    const/16 v22, 0x0

    const/4 v7, 0x0

    const/16 v37, 0x0

    const/16 v23, 0x0

    const/16 v36, 0x0

    const/4 v15, 0x0

    const/16 v63, 0x0

    const/4 v8, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v20, 0x0

    const/16 v33, 0x0

    const/16 v51, 0x0

    const/16 v34, 0x0

    const-wide/16 v70, 0x0

    const-wide/16 v16, 0x0

    const/16 v67, 0x0

    const/16 v27, 0x0

    const/16 v59, 0x0

    const/16 v18, 0x0

    const-string v52, "\u06e8\u06e0\u06e1"

    invoke-static/range {v52 .. v52}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v72

    move-object/from16 v52, v4

    move-object/from16 v53, v14

    move-object/from16 v54, v15

    :goto_0
    sparse-switch v72, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroid/app/۟ۡۧۦۡ;->ۥۣۨۧ()I

    move-result v4

    if-ltz v4, :cond_8a

    const-string v4, "\u06e5\u06e7\u06e1"

    :goto_1
    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto :goto_0

    :sswitch_1
    const-string v4, "\u06e1\u06e8\u06df"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto :goto_0

    :sswitch_2
    :try_start_0
    sget-object v4, Lls;->b:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v14, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object/from16 v0, v54

    invoke-virtual {v4, v0, v14}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_10

    move-object/from16 v0, p1

    iget-object v4, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const-string v14, "\u06df\u06e0\u06e5"

    invoke-static {v14}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v63, v4

    move/from16 v72, v14

    goto :goto_0

    :sswitch_3
    :try_start_1
    move-object v0, v5

    check-cast v0, Ljava/lang/String;

    move-object v4, v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v4, "\u06e8\u06e3\u06df"

    :goto_2
    invoke-static {v4}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto :goto_0

    :sswitch_4
    :try_start_2
    invoke-interface/range {v32 .. v32}, Ljava/util/Collection;->isEmpty()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_7

    move-result v4

    if-eqz v4, :cond_33

    sget v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v14, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    rem-int/2addr v4, v14

    const v14, 0x1ab2ed

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto :goto_0

    :sswitch_5
    const/16 v4, 0xd4

    move/from16 v0, v69

    if-ne v0, v4, :cond_2a

    sget v4, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v14, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    or-int/lit16 v14, v14, 0x9a7

    add-int/2addr v4, v14

    if-ltz v4, :cond_0

    const/4 v4, 0x6

    sput v4, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    const-string v4, "\u06e8\u06e5"

    invoke-static {v4}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto :goto_0

    :cond_0
    const-string v4, "\u06df\u06e2\u06e4"

    invoke-static {v4}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto :goto_0

    :catchall_0
    move-exception v4

    :try_start_3
    const-string v4, "crHn\n"

    const-string v14, "M/2rVH14qgc=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_7

    sget v4, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    if-gtz v4, :cond_1

    const-string v4, "\u06e4\u06df"

    invoke-static {v4}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_1
    const-string v4, "\u06e2\u06e5\u06e7"

    move-object v14, v4

    :goto_3
    invoke-static {v14}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_2
    :sswitch_6
    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v14, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    xor-int/2addr v4, v14

    const v14, 0x1aaed4

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_7
    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v14, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    rem-int/lit16 v14, v14, 0x24e8

    rem-int/2addr v4, v14

    if-gtz v4, :cond_3

    const-string v4, "\u06e6\u06e0\u06e1"

    invoke-static {v4}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v21, v19

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_3
    sget v4, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v14, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    xor-int/2addr v4, v14

    const v14, 0x1ac54c

    add-int/2addr v4, v14

    move-object/from16 v21, v19

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_8
    if-eqz v26, :cond_4e

    :try_start_4
    const-string v4, "mLfetr4qJ3Kxuw==\n"

    const-string v14, "1MK93cdnSBw=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "\u274c \u5e95\u5c42 Receive \u8fd4\u56de\u9519\u8bef\u7801: "

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    sget v15, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v60, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    move/from16 v0, v60

    or-int/lit16 v0, v0, -0xcbd

    move/from16 v60, v0

    rem-int v15, v15, v60

    if-gtz v15, :cond_4

    const-string v15, "\u06e1\u06e5\u06df"

    invoke-static {v15}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v15

    move-object/from16 v60, v4

    move-object/from16 v62, v14

    move/from16 v72, v15

    goto/16 :goto_0

    :cond_4
    sget v15, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v60, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    xor-int v15, v15, v60

    const v60, 0x1ac7d7

    add-int v15, v15, v60

    move-object/from16 v60, v4

    move-object/from16 v62, v14

    move/from16 v72, v15

    goto/16 :goto_0

    :sswitch_9
    :try_start_5
    instance-of v4, v9, Ljava/util/LinkedList;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-eqz v4, :cond_2e

    :goto_4
    const-string v4, "\u06e2\u06e5\u06e4"

    move-object/from16 v14, v42

    :goto_5
    invoke-static {v4}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v42, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_a
    :try_start_6
    move-object/from16 v0, p1

    iget-object v4, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const-string v14, "qo1HTbH48g==\n"

    const-string v15, "zegzGciIlzA=\n"

    invoke-static {v14, v15}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const/4 v15, 0x0

    new-array v15, v15, [Ljava/lang/Object;

    invoke-static {v4, v14, v15}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    move-result-object v6

    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    if-ltz v4, :cond_6

    const/16 v4, 0x49

    sput v4, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    move-wide/from16 v14, v16

    :cond_5
    const-string v4, "\u06e8\u06e1\u06e7"

    invoke-static {v4}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v4

    move-wide/from16 v16, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_6
    sget v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v14, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    xor-int/2addr v4, v14

    const v14, 0x1aabfc

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_b
    :try_start_7
    const-string v4, "\u26a0\ufe0f \u8b66\u544a: talkerCache \u672a\u547d\u4e2d sendId: "

    move-object/from16 v0, v20

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    move-result-object v14

    sget v4, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    if-gtz v4, :cond_7

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    const-string v4, "\u06e8\u06e2\u06e4"

    :goto_6
    invoke-static {v4}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v18, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06e3\u06e7\u06e3"

    move-object/from16 v18, v14

    :goto_7
    invoke-static {v4}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_c
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v14, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sub-int/2addr v4, v14

    const v14, -0x1aa78e

    xor-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->ۢۢۧۨ()I

    move-result v4

    if-gtz v4, :cond_8

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    const-string v4, "\u06e4\u06e7\u06e8"

    :goto_8
    invoke-static {v4}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e4\u06e7\u06e5"

    :goto_9
    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_e
    :try_start_8
    const-string v4, "KFnE\n"

    const-string v14, "RSqjPIOV6WI=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v46

    invoke-static {v4, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    move-result v4

    if-ltz v4, :cond_9

    const/16 v4, 0xa

    sput v4, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    const-string v4, "\u06e1\u06e3\u06e8"

    :goto_a
    invoke-static {v4}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06e1\u06e1\u06e7"

    move-object v15, v4

    :goto_b
    invoke-static {v15}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_f
    :try_start_9
    const-string v4, "DqDw579nUswOuuir/WETwQGm6KvraxPMD7ux5epoX4IUrOzuv29c1gy88qXWakc=\n"

    const-string v14, "YNWci58EM6I=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v6}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v0, v6

    check-cast v0, Ljava/lang/Integer;

    move-object v4, v0

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    move-result v4

    sget v14, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v15, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sub-int/2addr v14, v15

    const v15, 0x1aacf1

    add-int/2addr v14, v15

    move/from16 v69, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :cond_a
    :sswitch_10
    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v14, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    rem-int/2addr v4, v14

    const v14, 0x1ac412

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :catchall_1
    move-exception v4

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    move-result v4

    if-gtz v4, :cond_b

    const-string v4, "\u06e7\u06e2\u06e6"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06e7\u06df\u06e2"

    :goto_c
    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_11
    :try_start_a
    sget-object v4, Lub0;->V0:Ljava/lang/String;

    move-object/from16 v0, v36

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    move-result-object v4

    sget v14, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v15, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    rem-int/lit16 v15, v15, -0x2209

    add-int/2addr v14, v15

    if-gtz v14, :cond_c

    const-string v14, "\u06e4\u06e6\u06e7"

    invoke-static {v14}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v54, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :cond_c
    sget v14, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v15, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sub-int/2addr v14, v15

    const v15, 0x1ac0b7

    add-int/2addr v14, v15

    move-object/from16 v54, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :sswitch_12
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v14, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    add-int/lit16 v14, v14, -0x13d4

    xor-int/2addr v4, v14

    if-gtz v4, :cond_d

    const/16 v4, 0x22

    sput v4, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    const-string v4, "\u06e5\u06e3\u06e1"

    invoke-static {v4}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_d
    sget v4, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v14, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sub-int/2addr v4, v14

    const v14, 0x1ac6f9

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_13
    :try_start_b
    const-string v4, "ioxU\n"

    const-string v14, "/u0zZ+lqY9I=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v38

    invoke-static {v4, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    move-result v4

    if-gtz v4, :cond_e

    const/16 v4, 0x3b

    sput v4, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    move-object/from16 v4, v19

    :goto_d
    const-string v14, "\u06e0\u06e6\u06e1"

    invoke-static {v14}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v19, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :cond_e
    sget v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v14, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    xor-int/2addr v4, v14

    const v14, 0x1ac7a9

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_14
    :try_start_c
    instance-of v4, v7, Lorg/json/JSONObject;

    if-eqz v4, :cond_39

    move-object v0, v7

    check-cast v0, Lorg/json/JSONObject;

    move-object v4, v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    sget v14, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v15, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sub-int/2addr v14, v15

    const v15, 0x1aaa2b

    add-int/2addr v14, v15

    move-object/from16 v37, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :sswitch_15
    sget v4, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v14, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    xor-int/lit16 v14, v14, -0x16ee

    or-int/2addr v4, v14

    if-ltz v4, :cond_f

    const/16 v4, 0x59

    sput v4, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    const-string v4, "\u06e4\u06e0"

    invoke-static {v4}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_f
    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v14, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    mul-int/2addr v4, v14

    const v14, 0x1bfe6a

    xor-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_10
    :sswitch_16
    sget v4, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v14, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    or-int/lit16 v14, v14, 0x1ca9

    div-int/2addr v4, v14

    if-eqz v4, :cond_11

    const/16 v4, 0x63

    sput v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    const-string v4, "\u06e2\u06e5\u06e5"

    invoke-static {v4}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_11
    sget v4, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v14, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    mul-int/2addr v4, v14

    const v14, 0x1fb0f6

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_17
    move-object/from16 v28, v43

    :goto_e
    const-string v4, "\u06e3\u06e0"

    move-object v14, v4

    :goto_f
    invoke-static {v14}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_18
    sget v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    if-gtz v4, :cond_12

    const/4 v4, 0x1

    sput v4, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    const-string v4, "\u06e5\u06e5\u06e2"

    invoke-static {v4}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_12
    const-string v4, "\u06e1\u06df\u06e0"

    :goto_10
    invoke-static {v4}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_19
    :try_start_d
    instance-of v4, v8, Ljava/lang/String;

    if-eqz v4, :cond_a

    move-object v0, v8

    check-cast v0, Ljava/lang/String;

    move-object v4, v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    goto/16 :goto_d

    :sswitch_1a
    :try_start_e
    sget-object v4, Lkn;->a:Lkn;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lkn;->i:Lsd;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    sget v14, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v15, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    mul-int/2addr v14, v15

    const v15, -0x1a31c2

    xor-int/2addr v14, v15

    move-object/from16 v56, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :sswitch_1b
    :try_start_f
    const-string v4, "0TNrt1b2W7vrNn0=\n"

    const-string v14, "gl0Y9iOCNPc=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v15, "\ud83d\udca4 CGI "

    invoke-direct {v4, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    sget v15, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v52, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    xor-int v15, v15, v52

    const v52, 0x1ac174

    add-int v15, v15, v52

    move-object/from16 v52, v4

    move-object/from16 v57, v14

    move/from16 v72, v15

    goto/16 :goto_0

    :sswitch_1c
    move-object v4, v13

    :cond_13
    sget v13, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v14, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    rem-int/lit16 v14, v14, 0x2407

    or-int/2addr v13, v14

    if-gtz v13, :cond_14

    const-string v14, "\u06e4\u06e6\u06e5"

    move-object v13, v4

    :goto_11
    invoke-static {v14}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_14
    sget v13, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v14, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    add-int/2addr v13, v14

    const v14, -0x1ac44f

    xor-int/2addr v14, v13

    move-object v13, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :sswitch_1d
    move/from16 v0, v34

    int-to-long v0, v0

    move-wide/from16 v16, v0

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    move-result v4

    if-ltz v4, :cond_15

    const/4 v4, 0x5

    sput v4, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    move-object/from16 v4, v20

    :goto_12
    const-string v14, "\u06e8\u06e7\u06e8"

    move-object/from16 v20, v4

    goto/16 :goto_3

    :cond_15
    sget v4, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v14, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sub-int/2addr v4, v14

    const v14, 0x1ac008

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_1e
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-object/from16 v0, v41

    invoke-virtual {v4, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string v4, "\u06e2\u06e8"

    :goto_13
    invoke-static {v4}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_1f
    :try_start_10
    move-object/from16 v0, v66

    iget-object v4, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v4, Ljava/util/Collection;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    :goto_14
    const-string v14, "\u06e6\u06e1"

    invoke-static {v14}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v32, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :sswitch_20
    sget v4, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v14, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    or-int/lit16 v14, v14, 0x1f9d

    mul-int/2addr v4, v14

    if-ltz v4, :cond_16

    const/16 v4, 0x2c

    sput v4, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    const-string v4, "\u06e1\u06e4"

    invoke-static {v4}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_16
    sget v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v14, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    or-int/2addr v4, v14

    const v14, 0x1aa7e1

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_21
    const-string v4, "iK4xjZQ=\n"

    const-string v14, "+M9D7Pm1spE=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p1

    invoke-static {v4, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v4, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v14, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    div-int/lit16 v14, v14, -0x1f7d

    xor-int/2addr v4, v14

    if-ltz v4, :cond_17

    const-string v4, "\u06e0\u06e8\u06e0"

    invoke-static {v4}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_17
    const-string v4, "\u06e1\u06df\u06e0"

    goto/16 :goto_10

    :sswitch_22
    const/4 v15, 0x0

    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v14, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    rem-int/lit16 v14, v14, 0x1476

    mul-int/2addr v4, v14

    if-ltz v4, :cond_18

    const-string v4, "\u06e4\u06e7\u06e2"

    move-object/from16 v14, v22

    :goto_15
    invoke-static {v4}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v22, v14

    move-object/from16 v23, v15

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_18
    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v14, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    add-int/2addr v4, v14

    const v14, 0x1aaaf1

    add-int/2addr v4, v14

    move-object/from16 v23, v15

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_23
    if-eqz v33, :cond_37

    sget v4, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v14, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    xor-int/lit16 v14, v14, 0x21c5

    xor-int/2addr v4, v14

    if-gtz v4, :cond_19

    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    const-string v4, "\u06e2\u06e6\u06e2"

    goto/16 :goto_c

    :cond_19
    const-string v4, "\u06e3\u06e0\u06e0"

    :goto_16
    invoke-static {v4}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_24
    :try_start_11
    sget-object v4, Lub0;->r1:Ljava/lang/String;

    move-object/from16 v0, v39

    invoke-static {v0, v4}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    move-result-object v9

    sget v4, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    if-ltz v4, :cond_78

    :goto_17
    const-string v4, "\u06e5\u06e2\u06e1"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_25
    sget v4, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v14, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    mul-int/2addr v4, v14

    const v14, -0x190896

    xor-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_26
    sget v4, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v14, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    div-int/2addr v4, v14

    const v14, 0x1aa7f5

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_27
    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    move-result v4

    if-ltz v4, :cond_1a

    const/16 v4, 0x46

    sput v4, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    const-string v4, "\u06e8\u06e7"

    invoke-static {v4}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v20, v24

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_1a
    move-object/from16 v20, v24

    goto :goto_17

    :sswitch_28
    const-string v4, "\u06df\u06e6\u06e1"

    :goto_18
    invoke-static {v4}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_29
    sget v4, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v14, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    rem-int/2addr v4, v14

    const v14, 0x1ac7dc

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_2a
    sget v4, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    if-gtz v4, :cond_1b

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۢ۠۟ۨ()I

    move/from16 v4, v25

    move/from16 v14, v25

    :goto_19
    const-string v15, "\u06e6\u06e1\u06df"

    invoke-static {v15}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v15

    move/from16 v72, v15

    move/from16 v26, v4

    move/from16 v25, v14

    goto/16 :goto_0

    :cond_1b
    const-string v4, "\u06e4\u06e4\u06e6"

    move/from16 v26, v25

    :goto_1a
    invoke-static {v4}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_1c
    :sswitch_2b
    sget v4, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    if-ltz v4, :cond_1d

    const/4 v4, 0x5

    sput v4, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    const-string v4, "\u06e4\u06e1\u06e4"

    invoke-static {v4}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_1d
    const-string v4, "\u06e2\u06e1\u06df"

    :goto_1b
    invoke-static {v4}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_2c
    sget v4, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v14, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    mul-int/lit16 v14, v14, -0x171f

    sub-int/2addr v4, v14

    if-gtz v4, :cond_1e

    const-string v4, "\u06e0\u06e8\u06e1"

    invoke-static {v4}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_1e
    const-string v4, "\u06e2\u06e4\u06e8"

    goto/16 :goto_1

    :sswitch_2d
    :try_start_12
    const-string v4, "KFnE\n"

    const-string v14, "RSqjPIOV6WI=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v42

    invoke-static {v4, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    const-string v4, "\u06e3\u06e5"

    :goto_1c
    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_2e
    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    move-result v4

    if-ltz v4, :cond_1f

    const-string v4, "\u06e1\u06e8"

    move-object/from16 v14, v27

    move-object/from16 v15, v28

    :goto_1d
    invoke-static {v4}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v27, v14

    move-object/from16 v28, v15

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_1f
    const-string v4, "\u06e3\u06e0"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_2f
    packed-switch v69, :pswitch_data_0

    :sswitch_30
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v14, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    div-int/lit16 v14, v14, -0x2392

    xor-int/2addr v4, v14

    if-ltz v4, :cond_20

    const-string v4, "\u06e1\u06e3\u06e2"

    move/from16 v14, v30

    move/from16 v15, v31

    :goto_1e
    invoke-static {v4}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v30, v14

    move/from16 v31, v15

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_20
    sget v4, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v14, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    mul-int/2addr v4, v14

    const v14, 0x40380

    sub-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_31
    :try_start_13
    instance-of v4, v11, Ljava/util/LinkedList;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    if-eqz v4, :cond_43

    sget v4, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v14, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    rem-int/lit16 v14, v14, 0x1dc7

    or-int/2addr v4, v14

    if-ltz v4, :cond_8e

    const/16 v4, 0x4a

    sput v4, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    move-object/from16 v4, v32

    goto/16 :goto_14

    :sswitch_32
    if-eqz v32, :cond_2

    sget v4, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v14, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    add-int/lit16 v14, v14, 0x100a

    rem-int/2addr v4, v14

    if-gtz v4, :cond_21

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    const-string v4, "\u06e8\u06df\u06e5"

    :goto_1f
    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_21
    move-object/from16 v4, v47

    move/from16 v14, v48

    :goto_20
    const-string v15, "\u06e0\u06e3\u06e0"

    move-object/from16 v47, v4

    move/from16 v48, v14

    :goto_21
    invoke-static {v15}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_33
    :try_start_14
    move-object v0, v9

    check-cast v0, Ljava/util/LinkedList;

    move-object v4, v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_1

    sget v14, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v15, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    rem-int/lit16 v15, v15, 0x2056

    rem-int/2addr v14, v15

    if-gtz v14, :cond_22

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    const-string v14, "\u06e6\u06e3\u06e0"

    invoke-static {v14}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v45, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :cond_22
    const-string v14, "\u06e2\u06e6\u06e2"

    move-object/from16 v45, v4

    goto/16 :goto_f

    :sswitch_34
    sget v4, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v14, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    add-int/lit16 v14, v14, -0x1e11

    add-int/2addr v4, v14

    if-ltz v4, :cond_23

    const-string v4, "\u06e0\u06e2\u06e4"

    invoke-static {v4}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_23
    const-string v4, "\u06e6\u06df\u06df"

    goto/16 :goto_1

    :sswitch_35
    const/16 v4, 0xd3

    move/from16 v0, v69

    if-eq v0, v4, :cond_30

    const/16 v4, 0xd4

    move/from16 v0, v69

    if-eq v0, v4, :cond_60

    sget v4, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v14, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    add-int/lit16 v14, v14, -0xcdb

    or-int/2addr v4, v14

    if-ltz v4, :cond_25

    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    :cond_24
    const-string v4, "\u06e0\u06e3\u06e2"

    invoke-static {v4}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_25
    const-string v4, "\u06e4\u06e8\u06e0"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_36
    :try_start_15
    const-string v4, "/UrVCzLHOwbvcME7Otc=\n"

    const-string v14, "li+sVF6yWG0=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v14, 0x0

    invoke-static {v4, v14}, Lkn;->b(Ljava/lang/String;I)I
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_2

    move-result v4

    const/4 v14, 0x1

    if-eq v4, v14, :cond_1c

    sget v4, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v14, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    add-int/lit16 v14, v14, -0xec6

    or-int/2addr v4, v14

    if-ltz v4, :cond_50

    const/4 v4, 0x4

    sput v4, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    const-string v4, "\u06e7\u06e7\u06e1"

    move-object v14, v4

    :goto_22
    invoke-static {v14}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_37
    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    move-result v4

    if-gtz v4, :cond_26

    const/16 v4, 0x48

    sput v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    const-string v4, "\u06e5\u06e1\u06e3"

    :goto_23
    invoke-static {v4}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_26
    const-string v4, "\u06df\u06e1\u06e1"

    move-object v14, v4

    goto/16 :goto_11

    :sswitch_38
    :try_start_16
    move-object v0, v10

    check-cast v0, Ljava/lang/ClassLoader;

    move-object v4, v0

    new-instance v14, Lhi;

    const/4 v15, 0x1

    move-object/from16 v0, v63

    move-object/from16 v1, v54

    invoke-direct {v14, v4, v0, v1, v15}, Lhi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_2

    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v15, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    xor-int/lit16 v15, v15, -0x25c6

    rem-int/2addr v4, v15

    if-ltz v4, :cond_27

    const-string v4, "\u06e6\u06df\u06df"

    invoke-static {v4}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v27, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_27
    const-string v4, "\u06e3\u06df\u06e0"

    move-object/from16 v15, v28

    goto/16 :goto_1d

    :sswitch_39
    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    move-result v4

    if-ltz v4, :cond_29

    const/4 v4, 0x5

    sput v4, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    move-object/from16 v4, v33

    :cond_28
    const-string v14, "\u06e2\u06df\u06e5"

    invoke-static {v14}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v33, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :cond_29
    const-string v4, "\u06e7\u06e7\u06e1"

    :goto_24
    invoke-static {v4}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_2a
    :sswitch_3a
    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    move-result v4

    if-ltz v4, :cond_2b

    const/16 v4, 0x5e

    sput v4, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    const-string v4, "\u06e7\u06e4\u06e7"

    invoke-static {v4}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_2b
    const-string v4, "\u06e5\u06e7"

    invoke-static {v4}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :catchall_2
    move-exception v4

    const-string v4, "06ke\n"

    const-string v14, "p8h5VTpLcuY=\n"

    const-string v15, "5QZen0MZJVjMCn6VVjgoV8oY\n"

    const-string v72, "qXM99DpUSjY=\n"

    move-object/from16 v0, v72

    invoke-static {v15, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v72, "tw==\n"

    const-string v73, "0vI8ySRxU5w=\n"

    move-object/from16 v0, v72

    move-object/from16 v1, v73

    invoke-static {v4, v14, v15, v0, v1}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget v4, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v14, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    div-int/lit16 v14, v14, -0xd87

    add-int/2addr v4, v14

    if-ltz v4, :cond_2c

    const-string v4, "\u06e4\u06df\u06e7"

    invoke-static {v4}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_2c
    sget v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v14, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sub-int/2addr v4, v14

    const v14, 0x1abdcf

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_3b
    if-eqz v51, :cond_3b

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    move-result v4

    if-ltz v4, :cond_2d

    const-string v4, "\u06e5\u06e6\u06e5"

    invoke-static {v4}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_2d
    const-string v4, "\u06e7\u06e3\u06e0"

    invoke-static {v4}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_2e
    :sswitch_3c
    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    move-result v4

    if-gtz v4, :cond_2f

    const-string v4, "\u06e4\u06e2\u06e3"

    goto/16 :goto_1a

    :cond_2f
    const-string v4, "\u06e2\u06e1\u06e4"

    :goto_25
    invoke-static {v4}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_30
    :sswitch_3d
    sget v4, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    if-gtz v4, :cond_31

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    const-string v4, "\u06e0\u06e7"

    goto/16 :goto_10

    :cond_31
    const-string v4, "\u06e3\u06e4\u06e5"

    goto/16 :goto_10

    :sswitch_3e
    sget v4, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v14, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    or-int/lit16 v14, v14, 0x2339

    or-int/2addr v4, v14

    if-gtz v4, :cond_32

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    const-string v4, "\u06e7\u06e1\u06df"

    goto/16 :goto_18

    :cond_32
    sget v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v14, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    mul-int/2addr v4, v14

    const v14, 0x1a277b

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_33
    :sswitch_3f
    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    move-result v4

    if-ltz v4, :cond_34

    const-string v4, "\u06df\u06e0\u06e4"

    :goto_26
    invoke-static {v4}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_34
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v14, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    rem-int/2addr v4, v14

    const v14, 0x1ac584

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_40
    if-eqz v30, :cond_2a

    sget v4, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v14, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    rem-int/lit16 v14, v14, -0x1ee5

    div-int/2addr v4, v14

    if-ltz v4, :cond_36

    const/16 v4, 0x44

    sput v4, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    :cond_35
    const-string v4, "\u06e3\u06e0\u06e8"

    invoke-static {v4}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_36
    sget v4, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v14, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    mul-int/2addr v4, v14

    const v14, 0x179c73

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_37
    :sswitch_41
    sget v4, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v14, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    xor-int/2addr v4, v14

    const v14, 0x1acca0

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_42
    const/16 v4, 0xd3

    move/from16 v0, v69

    if-eq v0, v4, :cond_94

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    move-result v4

    if-ltz v4, :cond_38

    const-string v4, "\u06e5\u06df\u06e5"

    invoke-static {v4}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_38
    const-string v4, "\u06e1\u06e4\u06e8"

    :goto_27
    invoke-static {v4}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_43
    :try_start_17
    const-string v4, " \u6761\u4e0b\u53d1\u6570\u636e\uff0c\u6267\u884c\u70b9\u8d5e\u5224\u5b9a..."

    move-object/from16 v0, v47

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {v47 .. v47}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_7

    move-result-object v14

    const-string v4, "\u06e4\u06e8\u06e1"

    :goto_28
    invoke-static {v4}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v46, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_39
    :sswitch_44
    sget v4, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v14, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    xor-int/2addr v4, v14

    const v14, 0x1aa82a

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_45
    :try_start_18
    sget-object v4, Lls;->a:Lls;
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_2

    sget v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v14, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    mul-int/lit16 v14, v14, 0xd35

    mul-int/2addr v4, v14

    if-ltz v4, :cond_3a

    const/16 v4, 0x27

    sput v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    move/from16 v4, v34

    :goto_29
    const-string v14, "\u06e2\u06e4\u06e4"

    invoke-static {v14}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v14

    move/from16 v34, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :cond_3a
    sget v4, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v14, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    or-int/2addr v4, v14

    const v14, 0x1aaffa

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_3b
    :sswitch_46
    sget v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    if-gtz v4, :cond_3c

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    const-string v4, "\u06e4\u06e8\u06df"

    invoke-static {v4}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_3c
    const-string v4, "\u06e4\u06e2"

    :goto_2a
    invoke-static {v4}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_47
    const/4 v4, 0x2

    :try_start_19
    move-object/from16 v0, v56

    move-object/from16 v1, v64

    move-object/from16 v2, v53

    invoke-static {v0, v1, v2, v4}, Lg80;->u(Lpe;Lhe;Lym;I)Lw40;
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_7

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۥۥۢۧ()I

    move-result v4

    if-ltz v4, :cond_3d

    const/16 v4, 0x54

    sput v4, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    const-string v4, "\u06e4\u06e4\u06e1"

    invoke-static {v4}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_3d
    sget v4, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v14, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    or-int/2addr v4, v14

    const v14, 0xdd2a

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_48
    invoke-direct/range {p0 .. p1}, Ljs;->a(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    sget v4, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v14, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    xor-int/lit16 v14, v14, 0x16f2

    xor-int/2addr v4, v14

    if-ltz v4, :cond_35

    const/16 v4, 0x17

    sput v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    const-string v4, "\u06df\u06e7\u06e0"

    invoke-static {v4}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_49
    sget v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v14, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sub-int/2addr v4, v14

    const v14, 0xdbff

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_4a
    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    move-result v4

    if-gtz v4, :cond_3e

    const/4 v4, 0x7

    sput v4, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    const-string v4, "\u06e6\u06df\u06e6"

    goto/16 :goto_27

    :cond_3e
    const-string v4, "\u06e5\u06e0\u06e0"

    goto :goto_2a

    :sswitch_4b
    :try_start_1a
    invoke-virtual/range {v47 .. v48}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_7

    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    if-gtz v4, :cond_3f

    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    const-string v4, "\u06e2\u06e8\u06e4"

    invoke-static {v4}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_3f
    const-string v4, "\u06df\u06df\u06e7"

    goto/16 :goto_7

    :sswitch_4c
    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    if-ltz v4, :cond_40

    const-string v4, "\u06e0\u06e3\u06df"

    invoke-static {v4}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v68, v49

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_40
    sget v4, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v14, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    div-int/2addr v4, v14

    const v14, 0x1ac90b

    xor-int/2addr v4, v14

    move-object/from16 v68, v49

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_4d
    sget v4, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v14, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    div-int/lit16 v14, v14, -0x3d1

    xor-int/2addr v4, v14

    if-gtz v4, :cond_41

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    const-string v4, "\u06df\u06e6\u06e5"

    invoke-static {v4}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v68, v55

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_41
    sget v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v14, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sub-int/2addr v4, v14

    const v14, 0xddce

    add-int/2addr v4, v14

    move-object/from16 v68, v55

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_4e
    sget v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v14, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    rem-int/2addr v4, v14

    const v14, 0x1aa760

    add-int/2addr v4, v14

    move-object/from16 v44, v50

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_42
    :sswitch_4f
    sget v4, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v14, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    mul-int/2addr v4, v14

    const v14, 0x17a83b

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_43
    :sswitch_50
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v14, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    xor-int/2addr v4, v14

    const v14, 0x1ab1a9

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_51
    sget v4, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v14, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    add-int/lit16 v14, v14, 0x2324

    add-int/2addr v4, v14

    if-gtz v4, :cond_44

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۤ۠ۤۢ()I

    const-string v4, "\u06e6\u06e2"

    invoke-static {v4}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_44
    sget v4, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v14, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    or-int/2addr v4, v14

    const v14, 0x1ac8f2

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_52
    sget v4, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    if-gtz v4, :cond_45

    const-string v4, "\u06e4\u06e5\u06e3"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_45
    const-string v4, "\u06e4\u06e6\u06df"

    :goto_2b
    invoke-static {v4}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_53
    :try_start_1b
    move-object v0, v11

    check-cast v0, Ljava/util/LinkedList;

    move-object v4, v0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_4

    sget v14, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v15, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    xor-int/lit16 v15, v15, 0x5b3

    rem-int/2addr v14, v15

    if-ltz v14, :cond_46

    invoke-static {}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۠ۢۧۡ()I

    const-string v14, "\u06df\u06e6\u06df"

    invoke-static {v14}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v49, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :cond_46
    const-string v14, "\u06e8\u06e4\u06e5"

    move-object v15, v14

    move-object/from16 v49, v4

    goto/16 :goto_21

    :sswitch_54
    :try_start_1c
    invoke-static/range {v33 .. v33}, Lls;->c(Ljava/lang/String;)Z
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_2

    move-result v14

    move-object/from16 v4, v50

    :goto_2c
    const-string v15, "\u06e4\u06e7\u06e5"

    move-object/from16 v50, v4

    move/from16 v51, v14

    goto/16 :goto_b

    :sswitch_55
    if-nez v21, :cond_75

    :try_start_1d
    const-string v24, ""
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_2

    sget v4, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v14, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    xor-int/lit16 v14, v14, -0x17d4

    div-int/2addr v4, v14

    if-eqz v4, :cond_47

    const/16 v4, 0x2c

    sput v4, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    const-string v4, "\u06e7\u06df\u06e6"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_47
    sget v4, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v14, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    add-int/2addr v4, v14

    const v14, 0x1ab91e

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_56
    :try_start_1e
    const-string v4, " \u4e0b\u53d1\u6570\u636e\u4e3a\u7a7a\uff0c\u65e0\u65b0\u5185\u5bb9\u9700\u70b9\u8d5e\u3002"

    move-object/from16 v0, v52

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {v52 .. v52}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_7

    move-result-object v14

    sget v4, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v15, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    or-int/lit16 v15, v15, -0xeed

    mul-int/2addr v4, v15

    if-ltz v4, :cond_48

    const-string v4, "\u06e3\u06e2\u06e0"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v42, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_48
    const-string v4, "\u06e3\u06e4\u06e6"

    goto/16 :goto_5

    :sswitch_57
    sget v4, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v14, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    or-int/lit8 v14, v14, 0x78

    xor-int/2addr v4, v14

    if-gtz v4, :cond_49

    const-string v4, "\u06e1\u06df\u06e3"

    move/from16 v26, v35

    goto/16 :goto_2

    :cond_49
    const-string v4, "\u06e7\u06e6"

    move/from16 v26, v35

    :goto_2d
    invoke-static {v4}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_58
    move/from16 v14, v30

    move/from16 v15, v31

    :cond_4a
    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    move-result v4

    if-gtz v4, :cond_4b

    const-string v4, "\u06e8\u06e8\u06e4"

    :goto_2e
    invoke-static {v4}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v30, v14

    move/from16 v31, v15

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_4b
    sget v4, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v30, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    div-int v4, v4, v30

    const v30, 0x1aaf06

    xor-int v4, v4, v30

    move/from16 v30, v14

    move/from16 v31, v15

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_59
    :try_start_1f
    sget-object v4, Lub0;->r1:Ljava/lang/String;

    move-object/from16 v0, v39

    invoke-static {v0, v4}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_4

    move-result-object v11

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣۣ۟ۡ()I

    move-result v4

    if-gtz v4, :cond_4c

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣۣ۟ۡ()I

    const-string v4, "\u06df\u06e1\u06e0"

    move-object/from16 v14, v38

    :goto_2f
    invoke-static {v4}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v38, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_4c
    const-string v4, "\u06e0\u06e6\u06e8"

    move-object v14, v4

    goto/16 :goto_f

    :sswitch_5a
    const-string v4, "yw==\n"

    const-string v14, "uyX0j3mYiiE=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p1

    invoke-static {v4, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v4, "L7nAUTu/BIAbr9d9BbUVhSGo3A==\n"

    const-string v14, "RNy5DlrRcOk=\n"

    sget-object v15, Lkn;->a:Lkn;

    invoke-static {v4, v14, v15}, Lg40;->q(Ljava/lang/String;Ljava/lang/String;Lkn;)Z

    move-result v15

    const-string v4, "61WBaQXFMY7fQ5ZFO9wsiuU=\n"

    const-string v14, "gDD4NmSwReE=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkn;->e(Ljava/lang/String;)Z

    move-result v14

    if-nez v15, :cond_4a

    if-nez v14, :cond_4a

    sget v4, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v30, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    move/from16 v0, v30

    xor-int/lit16 v0, v0, 0x1342

    move/from16 v30, v0

    sub-int v4, v4, v30

    if-gtz v4, :cond_4d

    const-string v4, "\u06e8\u06e3\u06df"

    invoke-static {v4}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v30, v14

    move/from16 v31, v15

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_4d
    const-string v4, "\u06e0\u06e3\u06df"

    goto/16 :goto_1e

    :cond_4e
    :sswitch_5b
    sget v4, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v14, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    mul-int/lit16 v14, v14, 0x1bbe

    rem-int/2addr v4, v14

    if-ltz v4, :cond_4f

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    const-string v4, "\u06e4\u06e3\u06e0"

    move-object/from16 v14, v39

    :goto_30
    invoke-static {v4}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v39, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_4f
    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v14, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    mul-int/2addr v4, v14

    const v14, -0x1babb3

    xor-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_5c
    :try_start_20
    sget-object v4, Lln;->a:Lln;
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_7

    sget v4, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v14, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    add-int/lit16 v14, v14, -0xe79

    add-int/2addr v4, v14

    if-ltz v4, :cond_51

    const/4 v4, 0x2

    sput v4, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    :cond_50
    const-string v4, "\u06e3\u06e8\u06e8"

    goto/16 :goto_7

    :cond_51
    sget v4, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v14, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    or-int/2addr v4, v14

    const v14, -0x1ac953

    xor-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_5d
    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    move-result v4

    if-gtz v4, :cond_52

    const/16 v4, 0x15

    sput v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    const-string v4, "\u06e7\u06e5\u06e6"

    invoke-static {v4}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v28, v29

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_52
    const-string v4, "\u06e8\u06e3\u06e8"

    move-object/from16 v14, v27

    move-object/from16 v15, v29

    goto/16 :goto_1d

    :sswitch_5e
    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    move-result v4

    if-gtz v4, :cond_53

    const/16 v4, 0x16

    sput v4, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    const-string v4, "\u06e2\u06e8\u06e0"

    invoke-static {v4}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_53
    const-string v4, "\u06e7\u06e1\u06e8"

    goto/16 :goto_8

    :sswitch_5f
    if-eqz v28, :cond_7d

    :try_start_21
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Integer;->intValue()I
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_2

    move-result v35

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    move-result v4

    if-ltz v4, :cond_90

    const-string v4, "\u06e1\u06e1\u06e7"

    move-object v14, v4

    :goto_31
    invoke-static {v14}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_60
    sget v4, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v14, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    or-int/lit16 v14, v14, 0xb42

    rem-int/2addr v4, v14

    if-ltz v4, :cond_54

    invoke-static {}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->۟ۢ۟ۥۣ()I

    const-string v4, "\u06e5\u06e7\u06e2"

    invoke-static {v4}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_54
    sget v4, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v14, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    mul-int/2addr v4, v14

    const v14, 0x1f7791

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :pswitch_0
    :sswitch_61
    sget v4, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v14, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    add-int/lit16 v14, v14, 0x2707

    add-int/2addr v4, v14

    if-gtz v4, :cond_55

    const/16 v4, 0x62

    sput v4, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    const-string v4, "\u06e3\u06e7\u06e2"

    goto/16 :goto_24

    :cond_55
    sget v4, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v14, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    add-int/2addr v4, v14

    const v14, 0x1aa3cc

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_62
    sget v4, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v14, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    xor-int/lit16 v14, v14, 0x1494

    mul-int/2addr v4, v14

    if-gtz v4, :cond_56

    const/16 v4, 0x62

    sput v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    const-string v4, "\u06e4\u06df\u06e5"

    invoke-static {v4}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_56
    const-string v4, "\u06e7\u06e7\u06df"

    move-object v14, v4

    :goto_32
    invoke-static {v14}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_63
    packed-switch v40, :pswitch_data_1

    :sswitch_64
    sget v4, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v14, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    div-int/lit16 v14, v14, -0x26c7

    xor-int/2addr v4, v14

    if-ltz v4, :cond_57

    const/16 v4, 0x26

    sput v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    const-string v4, "\u06e2\u06e3\u06e5"

    :goto_33
    invoke-static {v4}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_57
    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v14, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    xor-int/2addr v4, v14

    const v14, 0x1aa8d7

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_65
    :try_start_22
    invoke-static/range {v54 .. v54}, Lmp;->d(Ljava/lang/Object;)V
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_2

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    move-result v4

    if-gtz v4, :cond_59

    const/16 v4, 0x3c

    sput v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    move/from16 v4, v40

    :cond_58
    const-string v14, "\u06e8\u06df\u06e1"

    invoke-static {v14}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v14

    move/from16 v40, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :cond_59
    sget v4, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v14, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    rem-int/2addr v4, v14

    const v14, 0x1aba76

    xor-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_66
    invoke-super/range {p0 .. p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    move-result v4

    if-ltz v4, :cond_67

    const-string v4, "zmEv"

    invoke-static {v4}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟۟ۥۥۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    const-string v14, "\u06e1\u06e6\u06e3"

    :goto_34
    invoke-static {v14}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v41, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :sswitch_67
    :try_start_23
    move-object/from16 v0, v44

    move-object/from16 v1, v66

    iput-object v0, v1, Lp00;->b:Ljava/lang/Object;
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_7

    sget v4, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v14, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sub-int/2addr v4, v14

    const v14, 0x1ac3bc

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_68
    invoke-static {}, Lkotlinx/coroutines/۠ۥۣۧ;->۠ۧۥ()I

    move-result v4

    if-ltz v4, :cond_5a

    invoke-static {}, Landroidx/activity/result/۟ۡۧ۠ۥ;->۟ۥۥۧ۟()I

    const-string v4, "\u06e4\u06e4\u06e6"

    invoke-static {v4}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_5a
    const-string v4, "\u06e7\u06e2\u06e2"

    invoke-static {v4}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_69
    sget v4, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v14, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    div-int/2addr v4, v14

    const v14, 0x1abd8c

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_6a
    const/16 v25, 0x0

    sget v4, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v14, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    add-int/lit16 v14, v14, 0x20ad

    rem-int/2addr v4, v14

    if-ltz v4, :cond_5b

    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    const-string v4, "\u06e0\u06df\u06e2"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_5b
    move/from16 v4, v26

    move/from16 v14, v25

    goto/16 :goto_19

    :sswitch_6b
    sget v4, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    if-ltz v4, :cond_5c

    const/16 v4, 0x10

    sput v4, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    const-string v4, "\u06e4\u06e7\u06e3"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_5c
    sget v4, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v14, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    or-int/2addr v4, v14

    const v14, 0x1ac9ac

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_6c
    :try_start_24
    invoke-virtual/range {v61 .. v61}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_2

    sget v4, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    if-ltz v4, :cond_5d

    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    const-string v14, "\u06e0\u06e0\u06e7"

    move-object/from16 v4, v41

    goto/16 :goto_34

    :cond_5d
    const-string v4, "\u06e0\u06e0\u06e7"

    goto/16 :goto_26

    :sswitch_6d
    sget v4, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v14, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    or-int/2addr v4, v14

    const v14, -0x1ab33f

    xor-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_6e
    :try_start_25
    const-string v4, "AcWxBu5EkKo7wKc=\n"

    const-string v14, "UqvCR5sw/+Y=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_7

    move-result-object v14

    const-string v4, "\u06e8\u06e8\u06e0"

    goto/16 :goto_2f

    :cond_5e
    :sswitch_6f
    sget v4, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v14, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    rem-int/2addr v4, v14

    const v14, 0x1abf53

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :pswitch_1
    :sswitch_70
    sget v4, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    if-ltz v4, :cond_5f

    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    const-string v4, "\u06e8\u06e7\u06e3"

    :goto_35
    invoke-static {v4}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_5f
    sget v4, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v14, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sub-int/2addr v4, v14

    const v14, 0x1ab123

    xor-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_60
    :sswitch_71
    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    move-result v4

    if-gtz v4, :cond_61

    const/16 v4, 0x48

    sput v4, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    const-string v4, "\u06e0\u06e4"

    goto/16 :goto_13

    :cond_61
    const-string v4, "\u06e2\u06e6\u06e1"

    goto :goto_35

    :pswitch_2
    :sswitch_72
    sget v4, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v14, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    div-int/2addr v4, v14

    const v14, -0x1ab629

    xor-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :catchall_3
    move-exception v4

    :try_start_26
    sget-object v4, Lkn;->a:Lkn;

    const-string v14, "XJJj0BUCCntOqH7qFRYQ\n"

    const-string v15, "N/caj3l3aRA=\n"

    invoke-static {v14, v15}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v15, "wA==\n"

    const-string v72, "8E1+73z7/bI=\n"

    move-object/from16 v0, v72

    invoke-static {v15, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v14, v15}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_5

    move-result-wide v14

    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v70, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    mul-int v4, v4, v70

    const v70, -0x2a996

    xor-int v4, v4, v70

    move-wide/from16 v70, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_73
    :try_start_27
    const-string v4, "egK1GRt2CDR6GK1VWXBJOXUErVVPekk0exn0G055BXpgDqkQG34GLnget1toYRszehA=\n"

    const-string v14, "FHfZdTsVaVo=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_0

    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    if-ltz v4, :cond_82

    const/16 v4, 0x13

    sput v4, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    const-string v4, "\u06e3\u06e4\u06e5"

    invoke-static {v4}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_74
    sget v4, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v14, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    xor-int/lit16 v14, v14, -0x9f1

    xor-int/2addr v4, v14

    if-gtz v4, :cond_62

    const/16 v4, 0x3c

    sput v4, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    const-string v4, "\u06e8\u06e4\u06e1"

    invoke-static {v4}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_62
    sget v4, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v14, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    mul-int/2addr v4, v14

    const v14, 0x155aed

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_75
    const-string v4, "\u06e4\u06e7\u06e2"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_76
    :try_start_28
    invoke-virtual/range {v54 .. v54}, Ljava/lang/String;->length()I
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_2

    move-result v4

    if-lez v4, :cond_10

    sget v4, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v14, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    xor-int/lit16 v14, v14, -0x1744

    sub-int/2addr v4, v14

    if-ltz v4, :cond_63

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    goto/16 :goto_4

    :cond_63
    const-string v4, "\u06e1\u06e0"

    goto/16 :goto_23

    :sswitch_77
    sget v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    if-gtz v4, :cond_64

    const/16 v4, 0x31

    sput v4, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    const-string v4, "\u06df\u06e1\u06e2"

    invoke-static {v4}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_64
    sget v4, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v14, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    xor-int/2addr v4, v14

    const v14, 0x1ac241

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_78
    sget v4, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    if-ltz v4, :cond_65

    const/16 v4, 0x48

    sput v4, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    const-string v4, "\u06e4\u06e7\u06e7"

    :goto_36
    invoke-static {v4}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_65
    sget v4, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v14, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    xor-int/2addr v4, v14

    const v14, 0x1ab845

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_79
    const/4 v4, 0x0

    sget v14, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    if-gtz v14, :cond_66

    const-string v14, "\u06e8\u06e3\u06e8"

    invoke-static {v14}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v43, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :cond_66
    move-object/from16 v14, v44

    :goto_37
    const-string v15, "\u06e8\u06df\u06e8"

    invoke-static {v15}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v15

    move-object/from16 v43, v4

    move-object/from16 v44, v14

    move/from16 v72, v15

    goto/16 :goto_0

    :cond_67
    :sswitch_7a
    sget v4, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v14, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    add-int/2addr v4, v14

    const v14, 0xdf22

    xor-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_7b
    :try_start_29
    const-string v4, "mbuFar+ZSsiwtw==\n"

    const-string v14, "1c7mAcbUJaY=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_2

    move-result-object v4

    sget v14, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    if-ltz v14, :cond_68

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    const-string v14, "\u06e3\u06e0\u06e0"

    invoke-static {v14}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v59, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :cond_68
    sget v14, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v15, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    or-int/2addr v14, v15

    const v15, 0x1ac298

    xor-int/2addr v14, v15

    move-object/from16 v59, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :sswitch_7c
    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    move-result v4

    if-gtz v4, :cond_69

    const/16 v4, 0x4c

    sput v4, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    const-string v4, "\u06e4\u06e2"

    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v21, v58

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_69
    sget v4, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v14, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sub-int/2addr v4, v14

    const v14, 0x1aba94

    add-int/2addr v4, v14

    move-object/from16 v21, v58

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_7d
    sget v4, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v14, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    xor-int/lit16 v14, v14, -0x1b25

    add-int/2addr v4, v14

    if-gtz v4, :cond_6a

    const-string v4, "\u06e4\u06e2\u06e7"

    invoke-static {v4}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_6a
    sget v4, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v14, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    or-int/2addr v4, v14

    const v14, 0xdd04

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :pswitch_3
    :sswitch_7e
    sget v4, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v14, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    add-int/lit16 v14, v14, -0xb4

    sub-int/2addr v4, v14

    if-gtz v4, :cond_6b

    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    const-string v4, "\u06e5\u06e4\u06e6"

    goto/16 :goto_2a

    :cond_6b
    const-string v4, "\u06e8\u06e1\u06df"

    goto/16 :goto_1

    :sswitch_7f
    sget v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v14, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    rem-int/lit16 v14, v14, 0x128e

    div-int/2addr v4, v14

    if-eqz v4, :cond_6c

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    const-string v4, "\u06e0\u06e5\u06e7"

    invoke-static {v4}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v36, v23

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_6c
    const-string v4, "\u06e3\u06e6\u06e5"

    move-object/from16 v36, v23

    goto/16 :goto_13

    :sswitch_80
    :try_start_2a
    sget-object v4, Lkn;->a:Lkn;
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_2

    sget v14, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v15, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    div-int/2addr v14, v15

    const v15, 0x1ab249

    add-int/2addr v14, v15

    move-object/from16 v61, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :sswitch_81
    sget v4, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v14, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    or-int/lit16 v14, v14, -0x1f82

    div-int/2addr v4, v14

    if-eqz v4, :cond_6d

    const/16 v4, 0x2f

    sput v4, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    const-string v4, "\u06e7\u06e0\u06e4"

    goto/16 :goto_2b

    :cond_6d
    const-string v4, "\u06e3\u06e5"

    goto/16 :goto_1

    :cond_6e
    :sswitch_82
    sget v4, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v14, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    mul-int/lit16 v14, v14, -0x5e9

    or-int/2addr v4, v14

    if-ltz v4, :cond_6f

    const-string v4, "\u06e8\u06e7\u06e0"

    goto/16 :goto_9

    :cond_6f
    sget v4, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v14, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    div-int/2addr v4, v14

    const v14, 0x1ac9a3

    xor-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :catchall_4
    move-exception v4

    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    move-result v4

    if-ltz v4, :cond_70

    const-string v4, "\u06e5\u06e7"

    invoke-static {v4}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_70
    sget v4, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v14, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    or-int/2addr v4, v14

    const v14, 0x1aa79c

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_83
    sget v4, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v14, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    add-int/lit16 v14, v14, 0x2381

    mul-int/2addr v4, v14

    if-gtz v4, :cond_71

    const-string v4, "\u06e1\u06e6\u06e5"

    goto/16 :goto_2d

    :cond_71
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v14, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    xor-int/2addr v4, v14

    const v14, 0xd9b1

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_84
    :try_start_2b
    invoke-static/range {v65 .. v65}, Lkn;->e(Ljava/lang/String;)Z
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_2

    move-result v4

    if-eqz v4, :cond_10

    sget v4, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    if-ltz v4, :cond_7a

    const-string v4, "\u06e8\u06e8\u06e0"

    invoke-static {v4}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_85
    :try_start_2c
    sget-object v4, Lo9;->b:Landroid/os/Handler;
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_2

    const-string v14, "\u06df\u06e4\u06e8"

    invoke-static {v14}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v67, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :cond_72
    :sswitch_86
    invoke-static {}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۥۧۤ۠()I

    move-result v4

    if-ltz v4, :cond_73

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    const-string v4, "\u06e5\u06e2\u06e5"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_73
    const-string v4, "\u06e8\u06e1\u06e1"

    goto/16 :goto_9

    :sswitch_87
    :try_start_2d
    move-object/from16 v0, v62

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual/range {v62 .. v62}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_2d
    .catchall {:try_start_2d .. :try_end_2d} :catchall_2

    move-result-object v14

    const-string v4, "\u06e5\u06e8\u06e2"

    move-object/from16 v15, v23

    goto/16 :goto_15

    :sswitch_88
    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    move-result v4

    if-ltz v4, :cond_74

    const-string v4, "\u06e1\u06e0\u06e1"

    invoke-static {v4}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_74
    sget v4, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v14, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    rem-int/2addr v4, v14

    const v14, 0x1aac09

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_75
    :sswitch_89
    sget v4, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v14, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    xor-int/lit16 v14, v14, 0x11b3

    add-int/2addr v4, v14

    if-ltz v4, :cond_76

    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    const-string v4, "\u06e6\u06e5\u06e4"

    invoke-static {v4}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_76
    sget v4, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v14, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    or-int/2addr v4, v14

    const v14, 0x1ac067

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_8a
    :try_start_2e
    move-object/from16 v0, p1

    iget-object v4, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const-string v14, "MIR76m8MB0Y2jGo=\n"

    const-string v15, "V+EPvxxpdQg=\n"

    invoke-static {v14, v15}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const/4 v15, 0x0

    new-array v15, v15, [Ljava/lang/Object;

    invoke-static {v4, v14, v15}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_0

    move-result-object v5

    sget v4, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v14, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    or-int/lit16 v14, v14, 0x11a6

    rem-int/2addr v4, v14

    if-gtz v4, :cond_77

    const/16 v4, 0x38

    sput v4, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    const-string v4, "\u06e7\u06e8\u06e2"

    invoke-static {v4}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_77
    const-string v4, "\u06e4\u06e0\u06e1"

    goto/16 :goto_1c

    :sswitch_8b
    const/4 v4, 0x0

    const-string v14, "\u06e2\u06e6\u06e3"

    invoke-static {v14}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v55, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :sswitch_8c
    :try_start_2f
    sget-object v4, Lls;->c:Ljava/util/concurrent/ConcurrentHashMap;

    move-object/from16 v0, v20

    invoke-virtual {v4, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;
    :try_end_2f
    .catchall {:try_start_2f .. :try_end_2f} :catchall_2

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    move-result v14

    if-ltz v14, :cond_28

    const/16 v14, 0x43

    sput v14, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    move-object/from16 v33, v4

    :cond_78
    const-string v4, "\u06e6\u06e4\u06e6"

    invoke-static {v4}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_8d
    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    move-result v4

    if-gtz v4, :cond_79

    const/16 v4, 0x47

    sput v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    move-object/from16 v4, v43

    move-object/from16 v14, v45

    goto/16 :goto_37

    :cond_79
    sget v4, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v14, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    add-int/2addr v4, v14

    const v14, 0x1aae16

    add-int/2addr v4, v14

    move-object/from16 v44, v45

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_8e
    sget v4, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v14, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    xor-int/lit16 v14, v14, -0x257f

    rem-int/2addr v4, v14

    if-gtz v4, :cond_7b

    :cond_7a
    const-string v4, "\u06e1\u06e1\u06e5"

    invoke-static {v4}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_7b
    const-string v4, "\u06e5\u06e6\u06e8"

    invoke-static {v4}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_8f
    :try_start_30
    const-string v4, "KFnE\n"

    const-string v14, "RSqjPIOV6WI=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v18

    invoke-static {v4, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_30
    .catchall {:try_start_30 .. :try_end_30} :catchall_2

    sget v4, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v14, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    div-int/lit16 v14, v14, -0x1324

    xor-int/2addr v4, v14

    if-ltz v4, :cond_7c

    const-string v4, "\u06e3\u06e3\u06e1"

    invoke-static {v4}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_7c
    const-string v4, "\u06e2\u06e4\u06e8"

    goto/16 :goto_24

    :sswitch_90
    :try_start_31
    move-object/from16 v0, p1

    iget-object v4, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v14, 0x0

    aget-object v12, v4, v14
    :try_end_31
    .catchall {:try_start_31 .. :try_end_31} :catchall_2

    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v14, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    div-int/lit16 v14, v14, 0x1492

    xor-int/2addr v4, v14

    if-ltz v4, :cond_24

    const/16 v4, 0x28

    sput v4, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    const-string v4, "\u06e8\u06e2\u06e7"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_91
    :try_start_32
    const-string v4, "ioxU\n"

    const-string v14, "/u0zZ+lqY9I=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v57

    invoke-static {v4, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_32
    .catchall {:try_start_32 .. :try_end_32} :catchall_7

    sget v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v14, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    xor-int/2addr v4, v14

    const v14, 0xdddb

    xor-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_7d
    :sswitch_92
    sget v4, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v14, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    mul-int/lit16 v14, v14, -0xd78

    mul-int/2addr v4, v14

    if-ltz v4, :cond_7e

    const-string v4, "\u06e3\u06e0\u06df"

    invoke-static {v4}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_7e
    const-string v4, "\u06e4\u06df\u06e7"

    move-object v14, v4

    goto/16 :goto_11

    :sswitch_93
    :try_start_33
    move-object/from16 v0, v68

    move-object/from16 v1, v66

    iput-object v0, v1, Lp00;->b:Ljava/lang/Object;
    :try_end_33
    .catchall {:try_start_33 .. :try_end_33} :catchall_7

    sget v4, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v14, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    xor-int/2addr v4, v14

    const v14, -0x1aa7ab

    xor-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_94
    sget v4, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v14, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    xor-int/lit16 v14, v14, 0x234c

    xor-int/2addr v4, v14

    if-gtz v4, :cond_7f

    const/16 v4, 0x41

    sput v4, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    goto/16 :goto_e

    :cond_7f
    const-string v4, "\u06e8\u06e7\u06e7"

    goto/16 :goto_18

    :sswitch_95
    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    move-result v4

    if-gtz v4, :cond_80

    const-string v4, "\u06e4\u06e8\u06e7"

    goto/16 :goto_1c

    :cond_80
    sget v4, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v14, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    xor-int/2addr v4, v14

    const v14, 0xd96e    # 7.7999E-41f

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_96
    :try_start_34
    instance-of v4, v12, Ljava/lang/Integer;

    if-eqz v4, :cond_42

    move-object v0, v12

    check-cast v0, Ljava/lang/Integer;

    move-object v4, v0
    :try_end_34
    .catchall {:try_start_34 .. :try_end_34} :catchall_2

    sget v14, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v15, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    mul-int/lit16 v15, v15, 0xc88

    div-int/2addr v14, v15

    if-eqz v14, :cond_81

    const-string v14, "\u06e0\u06e8\u06e4"

    invoke-static {v14}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v29, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :cond_81
    const-string v14, "\u06e8\u06e4\u06e1"

    move-object/from16 v29, v4

    goto/16 :goto_22

    :catchall_5
    move-exception v4

    const-wide/16 v14, 0x0

    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    move-result v4

    if-ltz v4, :cond_5

    const-string v4, "\u06e4\u06e0\u06e3"

    invoke-static {v4}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v4

    move-wide/from16 v16, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_82
    const-string v4, "\u06e7\u06e5\u06e1"

    invoke-static {v4}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_97
    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v14, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    add-int/lit16 v14, v14, -0x3e6

    or-int/2addr v4, v14

    if-ltz v4, :cond_83

    const-string v4, "\u06e1\u06e6\u06e2"

    goto/16 :goto_1b

    :cond_83
    const-string v4, "\u06e7\u06e2\u06e8"

    goto/16 :goto_1

    :pswitch_4
    :sswitch_98
    sget v4, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v14, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    add-int/lit16 v14, v14, 0x1e6e

    xor-int/2addr v4, v14

    if-ltz v4, :cond_84

    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    const-string v4, "\u06e5\u06e7\u06e7"

    goto/16 :goto_25

    :cond_84
    sget v4, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v14, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sub-int/2addr v4, v14

    const v14, 0x1aafea

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_99
    :try_start_35
    const-string v4, "ioxU\n"

    const-string v14, "/u0zZ+lqY9I=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v60

    invoke-static {v4, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_35
    .catchall {:try_start_35 .. :try_end_35} :catchall_2

    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    move-result v4

    if-ltz v4, :cond_85

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۤ۠ۤۢ()I

    const-string v4, "\u06df\u06e4\u06e1"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_85
    sget v4, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v14, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sub-int/2addr v4, v14

    const v14, 0x1abe40

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_9a
    if-nez v36, :cond_72

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    move-result v4

    if-gtz v4, :cond_86

    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    const-string v4, "\u06e7\u06e5\u06e3"

    move-object/from16 v14, v46

    goto/16 :goto_28

    :cond_86
    sget v4, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v14, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    xor-int/2addr v4, v14

    const v14, -0x1aaeae

    xor-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_9b
    :try_start_36
    sget-object v4, Lub0;->z:Ljava/lang/String;

    move-object/from16 v0, v63

    invoke-static {v0, v4}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_36
    .catchall {:try_start_36 .. :try_end_36} :catchall_2

    move-result-object v8

    sget v4, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v14, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    div-int/lit16 v14, v14, -0x26ce

    mul-int/2addr v4, v14

    if-eqz v4, :cond_87

    const/16 v4, 0x2e

    sput v4, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    const-string v4, "\u06e2\u06e1\u06e4"

    goto/16 :goto_16

    :cond_87
    sget v4, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v14, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    rem-int/2addr v4, v14

    const v14, 0x1ab9cb

    xor-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_9c
    :try_start_37
    invoke-virtual/range {v33 .. v33}, Ljava/lang/String;->length()I
    :try_end_37
    .catchall {:try_start_37 .. :try_end_37} :catchall_2

    move-result v4

    if-nez v4, :cond_5e

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    move-result v4

    if-ltz v4, :cond_88

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    const-string v4, "\u06df\u06e8\u06e4"

    invoke-static {v4}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_88
    const-string v4, "\u06df\u06e5\u06e4"

    move-object/from16 v14, v27

    move-object/from16 v15, v28

    goto/16 :goto_1d

    :sswitch_9d
    :try_start_38
    const-string v4, "TU2d\n"

    const-string v14, "DAHRcm/LTMc=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_38
    .catchall {:try_start_38 .. :try_end_38} :catchall_7

    const-string v4, "\u06e7\u06e2\u06e6"

    move-object/from16 v14, v18

    goto/16 :goto_6

    :sswitch_9e
    :try_start_39
    move-object/from16 v0, p1

    iget-object v4, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v14, 0x2

    aget-object v7, v4, v14
    :try_end_39
    .catchall {:try_start_39 .. :try_end_39} :catchall_2

    const-string v4, "\u06e1\u06e2\u06e7"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_9f
    :try_start_3a
    sget-object v15, Lyg;->b:Lof;

    new-instance v14, Lf40;

    move-object v0, v10

    check-cast v0, Ljava/lang/ClassLoader;

    move-object v4, v0

    const/16 v72, 0x0

    move-object/from16 v0, v66

    move-object/from16 v1, v72

    invoke-direct {v14, v0, v4, v1}, Lf40;-><init>(Lp00;Ljava/lang/ClassLoader;Lvd;)V
    :try_end_3a
    .catchall {:try_start_3a .. :try_end_3a} :catchall_7

    sget v4, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v53, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    rem-int v4, v4, v53

    const v53, -0x1ab8a2

    xor-int v4, v4, v53

    move-object/from16 v53, v14

    move-object/from16 v64, v15

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_a0
    sget v4, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    if-gtz v4, :cond_89

    invoke-static {}, Lkotlinx/coroutines/۠ۥۣۧ;->۠ۧۥ()I

    const-string v4, "\u06e1\u06e1\u06e1"

    invoke-static {v4}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v4

    move-wide/from16 v16, v70

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_89
    const-string v4, "\u06e6\u06e0"

    invoke-static {v4}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move-wide/from16 v16, v70

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_8a
    const-string v4, "\u06e8\u06e0\u06e1"

    goto/16 :goto_1

    :sswitch_a1
    :try_start_3b
    const-string v4, "JC24F/mYEMU2\n"

    const-string v14, "T0jBSJXtc64=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_3b
    .catchall {:try_start_3b .. :try_end_3b} :catchall_2

    move-result-object v4

    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    move-result v14

    if-ltz v14, :cond_8b

    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    const-string v14, "\u06e1\u06e5\u06e7"

    invoke-static {v14}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v65, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :cond_8b
    const-string v14, "\u06e7\u06e5\u06e7"

    invoke-static {v14}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v65, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :sswitch_a2
    if-eqz v31, :cond_6e

    sget v4, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v14, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    add-int/lit16 v14, v14, 0x691

    div-int/2addr v4, v14

    if-eqz v4, :cond_8c

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    const-string v4, "\u06e8\u06e7\u06e7"

    invoke-static {v4}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_8c
    const-string v4, "\u06e0\u06e7\u06e0"

    move-object/from16 v14, v42

    goto/16 :goto_5

    :catchall_6
    move-exception v4

    sget v4, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v14, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    rem-int/lit16 v14, v14, -0x1c7f

    div-int/2addr v4, v14

    if-eqz v4, :cond_8d

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    const-string v4, "\u06df\u06e1\u06e5"

    invoke-static {v4}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_8d
    const-string v4, "\u06e0\u06e4\u06e0"

    goto/16 :goto_a

    :sswitch_a3
    sget v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v14, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    add-int/2addr v4, v14

    const v14, 0x1abb16

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_a4
    sget v4, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    if-ltz v4, :cond_8f

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟ۡۡۦ()I

    :cond_8e
    const-string v4, "\u06e7\u06e4"

    invoke-static {v4}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_8f
    const-string v4, "\u06e2\u06e2\u06e0"

    goto/16 :goto_36

    :sswitch_a5
    :try_start_3c
    move-object/from16 v0, v52

    move/from16 v1, v69

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_3c
    .catchall {:try_start_3c .. :try_end_3c} :catchall_7

    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    move-result v4

    if-gtz v4, :cond_91

    const/16 v4, 0x5c

    sput v4, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    :cond_90
    const-string v4, "\u06e7\u06e8\u06e1"

    invoke-static {v4}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_91
    const-string v4, "\u06df\u06e8\u06e4"

    goto/16 :goto_33

    :sswitch_a6
    :try_start_3d
    const-string v4, "TZpLk8PHPipfoFapw9Mk\n"

    const-string v14, "Jv8yzK+yXUE=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v14, 0x0

    invoke-static {v4, v14}, Lkn;->b(Ljava/lang/String;I)I
    :try_end_3d
    .catchall {:try_start_3d .. :try_end_3d} :catchall_3

    move-result v4

    goto/16 :goto_29

    :sswitch_a7
    move-object/from16 v0, p0

    iget v4, v0, Ljs;->a:I

    move-object/from16 v0, p0

    iget-object v10, v0, Ljs;->b:Ljava/lang/Object;

    sget v14, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v15, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    add-int/lit16 v15, v15, 0x1d37

    mul-int/2addr v14, v15

    if-gtz v14, :cond_58

    invoke-static {}, Landroidx/activity/result/۟ۡۤۦۡ;->۟۟۟ۥۤ()I

    const-string v14, "\u06df\u06df\u06e5"

    invoke-static {v14}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v14

    move/from16 v40, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :sswitch_a8
    const/4 v4, 0x0

    sget v14, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v15, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    div-int/lit16 v15, v15, -0x1735

    sub-int/2addr v14, v15

    if-gtz v14, :cond_92

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    const-string v14, "\u06e0\u06e3\u06e4"

    invoke-static {v14}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v58, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :cond_92
    sget v14, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v15, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    div-int/2addr v14, v15

    const v15, 0x1aba69

    xor-int/2addr v14, v15

    move-object/from16 v58, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :sswitch_a9
    :try_start_3e
    const-string v4, "ioxU\n"

    const-string v14, "/u0zZ+lqY9I=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v59

    invoke-static {v4, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3e
    .catchall {:try_start_3e .. :try_end_3e} :catchall_2

    sget v4, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v14, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    mul-int/2addr v4, v14

    const v14, -0x17bb92

    xor-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_aa
    :try_start_3f
    move-object/from16 v0, v66

    iget-object v4, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v4, Ljava/util/LinkedList;

    invoke-virtual {v4}, Ljava/util/LinkedList;->size()I

    move-result v14

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v15, "\ud83d\udd0d \u6355\u83b7\u5230 "

    invoke-direct {v4, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    :try_end_3f
    .catchall {:try_start_3f .. :try_end_3f} :catchall_7

    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    move-result v15

    if-gtz v15, :cond_93

    const/16 v15, 0x60

    sput v15, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    goto/16 :goto_20

    :cond_93
    sget v15, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v47, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    mul-int v15, v15, v47

    const v47, 0x19c4fb

    add-int v15, v15, v47

    move-object/from16 v47, v4

    move/from16 v48, v14

    move/from16 v72, v15

    goto/16 :goto_0

    :sswitch_ab
    :try_start_40
    new-instance v4, Lp00;

    invoke-direct {v4}, Lp00;-><init>()V
    :try_end_40
    .catchall {:try_start_40 .. :try_end_40} :catchall_7

    const-string v14, "\u06e5\u06e0\u06e0"

    invoke-static {v14}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v66, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :cond_94
    :sswitch_ac
    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    move-result v4

    if-gtz v4, :cond_95

    const/16 v4, 0x44

    sput v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    const-string v4, "\u06e7\u06e0"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_95
    sget v4, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v14, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sub-int/2addr v4, v14

    const v14, 0x1aa84c

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_ad
    const/4 v4, 0x0

    sget v14, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    if-gtz v14, :cond_96

    move/from16 v14, v51

    goto/16 :goto_2c

    :cond_96
    sget v14, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v15, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    div-int/2addr v14, v15

    const v15, 0x1ab9e6

    xor-int/2addr v14, v15

    move-object/from16 v50, v4

    move/from16 v72, v14

    goto/16 :goto_0

    :sswitch_ae
    sget v4, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v14, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    div-int/lit16 v14, v14, 0x630

    or-int/2addr v4, v14

    if-gtz v4, :cond_97

    const/16 v4, 0x3f

    sput v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    const-string v4, "\u06e3\u06e5"

    invoke-static {v4}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_97
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v14, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sub-int/2addr v4, v14

    const v14, 0x1ab144

    add-int/2addr v4, v14

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_af
    :try_start_41
    sget-object v4, Lub0;->p1:Ljava/lang/String;

    invoke-static {v13, v4}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    sget-object v14, Lub0;->q1:Ljava/lang/String;

    invoke-static {v4, v14}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_41
    .catchall {:try_start_41 .. :try_end_41} :catchall_6

    move-result-object v14

    const-string v4, "\u06e3\u06e2\u06e0"

    goto/16 :goto_30

    :sswitch_b0
    :try_start_42
    move-object/from16 v0, v67

    move-object/from16 v1, v27

    move-wide/from16 v2, v16

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_42
    .catchall {:try_start_42 .. :try_end_42} :catchall_2

    sget v4, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    if-ltz v4, :cond_98

    const/16 v4, 0x2e

    sput v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    const-string v4, "\u06e3\u06e0\u06e4"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_98
    const-string v4, "\u06e7\u06e5\u06e3"

    goto/16 :goto_2a

    :sswitch_b1
    sget v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    if-gtz v4, :cond_99

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    const-string v4, "\u06e5\u06e2\u06e6"

    invoke-static {v4}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_99
    const-string v4, "\u06e7\u06df"

    goto/16 :goto_1f

    :sswitch_b2
    const-string v4, "\u06e7\u06e8\u06e2"

    move-object/from16 v36, v37

    move/from16 v14, v30

    move/from16 v15, v31

    goto/16 :goto_2e

    :sswitch_b3
    sget v4, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    if-ltz v4, :cond_9a

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۤ۠ۤۢ()I

    const-string v4, "\u06e1\u06e8\u06e1"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v20, v21

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_9a
    move-object/from16 v4, v21

    goto/16 :goto_12

    :sswitch_b4
    :try_start_43
    const-string v4, "KFnE\n"

    const-string v14, "RSqjPIOV6WI=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v22

    invoke-static {v4, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_43
    .catchall {:try_start_43 .. :try_end_43} :catchall_2

    sget v4, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v14, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    div-int/lit16 v14, v14, 0x1958

    xor-int/2addr v4, v14

    if-gtz v4, :cond_9b

    const-string v4, "\u06e5\u06e5\u06e4"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :cond_9b
    const-string v4, "\u06e1\u06e8\u06e1"

    goto/16 :goto_26

    :sswitch_b5
    move-object/from16 v0, p1

    iget-object v4, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v13, 0x4

    aget-object v4, v4, v13

    if-nez v4, :cond_13

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    move-result v13

    if-ltz v13, :cond_9c

    const/16 v13, 0x5f

    sput v13, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    const-string v14, "\u06e8\u06e0\u06e1"

    move-object v13, v4

    goto/16 :goto_32

    :cond_9c
    const-string v14, "\u06e2\u06e3\u06e2"

    move-object v13, v4

    goto/16 :goto_31

    :catchall_7
    move-exception v4

    const-string v4, "06ke\n"

    const-string v14, "p8h5VTpLcuY=\n"

    const-string v15, "e9138tkUinZa2EzT0wuiUEbdYc75Eo92Wg==\n"

    const-string v72, "KLMEvLxg/Rk=\n"

    move-object/from16 v0, v72

    invoke-static {v15, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v72, "tw==\n"

    const-string v73, "0vI8ySRxU5w=\n"

    move-object/from16 v0, v72

    move-object/from16 v1, v73

    invoke-static {v4, v14, v15, v0, v1}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "\u06e3\u06e5\u06e4"

    invoke-static {v4}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v72, v4

    goto/16 :goto_0

    :sswitch_b6
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe9 -> :sswitch_0
        0xdc06 -> :sswitch_88
        0xdc1f -> :sswitch_2
        0xdc21 -> :sswitch_39
        0xdc23 -> :sswitch_12
        0xdc46 -> :sswitch_b6
        0xdc5d -> :sswitch_5f
        0xdc62 -> :sswitch_8e
        0xdc7b -> :sswitch_85
        0xdc7c -> :sswitch_62
        0xdc7e -> :sswitch_a6
        0xdca2 -> :sswitch_b6
        0xdcba -> :sswitch_49
        0xdcbb -> :sswitch_32
        0xdcbc -> :sswitch_83
        0xdcbf -> :sswitch_93
        0xdcc0 -> :sswitch_2d
        0xdcc2 -> :sswitch_18
        0xdcd8 -> :sswitch_3a
        0xdcdd -> :sswitch_53
        0xdcdf -> :sswitch_5e
        0xdcf8 -> :sswitch_3f
        0xdcfd -> :sswitch_95
        0xdcff -> :sswitch_6f
        0x1aa705 -> :sswitch_78
        0x1aa707 -> :sswitch_43
        0x1aa724 -> :sswitch_9b
        0x1aa73e -> :sswitch_22
        0x1aa73f -> :sswitch_77
        0x1aa740 -> :sswitch_28
        0x1aa743 -> :sswitch_7f
        0x1aa761 -> :sswitch_1f
        0x1aa780 -> :sswitch_6
        0x1aa79b -> :sswitch_50
        0x1aa79c -> :sswitch_71
        0x1aa79d -> :sswitch_16
        0x1aa7a3 -> :sswitch_38
        0x1aa7be -> :sswitch_52
        0x1aa7d8 -> :sswitch_2b
        0x1aa7da -> :sswitch_67
        0x1aa7de -> :sswitch_af
        0x1aa7f8 -> :sswitch_2c
        0x1aa7ff -> :sswitch_6
        0x1aa81b -> :sswitch_56
        0x1aa81c -> :sswitch_b2
        0x1aaac3 -> :sswitch_61
        0x1aaac7 -> :sswitch_64
        0x1aaae7 -> :sswitch_84
        0x1aab04 -> :sswitch_f
        0x1aab22 -> :sswitch_4f
        0x1aab26 -> :sswitch_1
        0x1aab3c -> :sswitch_b1
        0x1aab3d -> :sswitch_4
        0x1aab3f -> :sswitch_96
        0x1aab41 -> :sswitch_a0
        0x1aab5c -> :sswitch_3a
        0x1aab5d -> :sswitch_1c
        0x1aab82 -> :sswitch_72
        0x1aab9b -> :sswitch_7
        0x1aaba2 -> :sswitch_31
        0x1aabb9 -> :sswitch_5c
        0x1aabbf -> :sswitch_20
        0x1aabd8 -> :sswitch_1b
        0x1aabdc -> :sswitch_d
        0x1aabe0 -> :sswitch_58
        0x1aae82 -> :sswitch_80
        0x1aae85 -> :sswitch_8b
        0x1aaea3 -> :sswitch_6d
        0x1aaea7 -> :sswitch_82
        0x1aaec1 -> :sswitch_83
        0x1aaec5 -> :sswitch_36
        0x1aaec7 -> :sswitch_1a
        0x1aaee0 -> :sswitch_34
        0x1aaee6 -> :sswitch_14
        0x1aaf01 -> :sswitch_9f
        0x1aaf06 -> :sswitch_b5
        0x1aaf25 -> :sswitch_5
        0x1aaf3b -> :sswitch_97
        0x1aaf3f -> :sswitch_2f
        0x1aaf43 -> :sswitch_54
        0x1aaf5e -> :sswitch_1e
        0x1aaf98 -> :sswitch_66
        0x1aaf9a -> :sswitch_c
        0x1aafa1 -> :sswitch_28
        0x1ab247 -> :sswitch_a1
        0x1ab248 -> :sswitch_23
        0x1ab264 -> :sswitch_86
        0x1ab267 -> :sswitch_25
        0x1ab280 -> :sswitch_90
        0x1ab284 -> :sswitch_8f
        0x1ab285 -> :sswitch_ad
        0x1ab2a0 -> :sswitch_16
        0x1ab2a5 -> :sswitch_81
        0x1ab2c1 -> :sswitch_69
        0x1ab2e2 -> :sswitch_1d
        0x1ab2e5 -> :sswitch_48
        0x1ab2e6 -> :sswitch_75
        0x1ab2fd -> :sswitch_26
        0x1ab300 -> :sswitch_92
        0x1ab301 -> :sswitch_33
        0x1ab304 -> :sswitch_a3
        0x1ab31d -> :sswitch_8a
        0x1ab31e -> :sswitch_8d
        0x1ab31f -> :sswitch_4d
        0x1ab33b -> :sswitch_16
        0x1ab35a -> :sswitch_29
        0x1ab35e -> :sswitch_89
        0x1ab604 -> :sswitch_b0
        0x1ab623 -> :sswitch_9c
        0x1ab627 -> :sswitch_98
        0x1ab628 -> :sswitch_a8
        0x1ab62b -> :sswitch_b6
        0x1ab642 -> :sswitch_3c
        0x1ab647 -> :sswitch_46
        0x1ab661 -> :sswitch_9d
        0x1ab681 -> :sswitch_37
        0x1ab6a4 -> :sswitch_24
        0x1ab6a5 -> :sswitch_91
        0x1ab6c2 -> :sswitch_3a
        0x1ab6e2 -> :sswitch_9a
        0x1ab6ff -> :sswitch_a9
        0x1ab723 -> :sswitch_15
        0x1ab9ca -> :sswitch_7c
        0x1ab9cc -> :sswitch_6a
        0x1ab9e5 -> :sswitch_73
        0x1ab9e7 -> :sswitch_4e
        0x1ab9eb -> :sswitch_70
        0x1ab9ec -> :sswitch_b4
        0x1aba29 -> :sswitch_76
        0x1aba61 -> :sswitch_21
        0x1aba66 -> :sswitch_8
        0x1aba82 -> :sswitch_47
        0x1aba9d -> :sswitch_41
        0x1abaa5 -> :sswitch_95
        0x1ababf -> :sswitch_16
        0x1abac0 -> :sswitch_60
        0x1abac2 -> :sswitch_3b
        0x1abac3 -> :sswitch_59
        0x1abadc -> :sswitch_74
        0x1abadd -> :sswitch_13
        0x1abade -> :sswitch_7a
        0x1abd88 -> :sswitch_3a
        0x1abd8a -> :sswitch_19
        0x1abd8b -> :sswitch_44
        0x1abda4 -> :sswitch_42
        0x1abda5 -> :sswitch_35
        0x1abde4 -> :sswitch_8c
        0x1abde9 -> :sswitch_2e
        0x1abe07 -> :sswitch_50
        0x1abe09 -> :sswitch_27
        0x1abe23 -> :sswitch_7e
        0x1abe3f -> :sswitch_97
        0x1abe44 -> :sswitch_41
        0x1abe64 -> :sswitch_ac
        0x1abe67 -> :sswitch_3a
        0x1abe86 -> :sswitch_9e
        0x1abe9f -> :sswitch_99
        0x1ac146 -> :sswitch_16
        0x1ac14a -> :sswitch_5b
        0x1ac167 -> :sswitch_b
        0x1ac16d -> :sswitch_3d
        0x1ac16e -> :sswitch_65
        0x1ac184 -> :sswitch_2a
        0x1ac186 -> :sswitch_97
        0x1ac1ac -> :sswitch_16
        0x1ac1c3 -> :sswitch_45
        0x1ac1e8 -> :sswitch_9
        0x1ac1e9 -> :sswitch_30
        0x1ac228 -> :sswitch_ae
        0x1ac25d -> :sswitch_b3
        0x1ac50a -> :sswitch_3c
        0x1ac50e -> :sswitch_b6
        0x1ac510 -> :sswitch_6e
        0x1ac54c -> :sswitch_a5
        0x1ac54e -> :sswitch_25
        0x1ac567 -> :sswitch_a3
        0x1ac56b -> :sswitch_ab
        0x1ac56c -> :sswitch_10
        0x1ac56d -> :sswitch_a2
        0x1ac584 -> :sswitch_a4
        0x1ac5a8 -> :sswitch_4a
        0x1ac5c3 -> :sswitch_3
        0x1ac5c5 -> :sswitch_94
        0x1ac5c8 -> :sswitch_a
        0x1ac5c9 -> :sswitch_6c
        0x1ac5ff -> :sswitch_3a
        0x1ac601 -> :sswitch_3a
        0x1ac620 -> :sswitch_57
        0x1ac621 -> :sswitch_6b
        0x1ac8ca -> :sswitch_63
        0x1ac8ce -> :sswitch_3e
        0x1ac8d1 -> :sswitch_17
        0x1ac8e9 -> :sswitch_a7
        0x1ac8ef -> :sswitch_2e
        0x1ac906 -> :sswitch_5a
        0x1ac908 -> :sswitch_11
        0x1ac90b -> :sswitch_7d
        0x1ac90e -> :sswitch_83
        0x1ac92a -> :sswitch_87
        0x1ac92d -> :sswitch_e
        0x1ac944 -> :sswitch_68
        0x1ac94d -> :sswitch_51
        0x1ac965 -> :sswitch_5d
        0x1ac969 -> :sswitch_4c
        0x1ac96b -> :sswitch_78
        0x1ac96c -> :sswitch_79
        0x1ac9a2 -> :sswitch_40
        0x1ac9c5 -> :sswitch_7b
        0x1ac9c8 -> :sswitch_16
        0x1ac9c9 -> :sswitch_55
        0x1ac9e0 -> :sswitch_aa
        0x1ac9e6 -> :sswitch_4b
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xd2
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 13

    iget v0, p0, Ljs;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Ljs;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/ClassLoader;

    const-string v1, "4Q==\n"

    const-string v2, "kew4VVFaCMA=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v2, 0x0

    aget-object v1, v1, v2

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_2

    check-cast v1, Ljava/lang/String;

    move-object v6, v1

    :goto_1
    if-nez v6, :cond_3

    :cond_1
    :goto_2
    invoke-static {}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->ۢۢۧۨ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "Ng"

    invoke-static {v0}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟۠ۨۤۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    move-object v6, v1

    goto :goto_1

    :cond_3
    sget-object v1, Lub0;->C0:Ljava/lang/String;

    invoke-virtual {v6, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    sget-object v1, Lub0;->D0:Ljava/lang/String;

    invoke-virtual {v6, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_4
    const-string v1, "Y76XlVGno9RXqIC5b62y0W2viw==\n"

    const-string v2, "CNvuyjDJ170=\n"

    sget-object v3, Lkn;->a:Lkn;

    invoke-static {v1, v2, v3}, Lg40;->q(Ljava/lang/String;Ljava/lang/String;Lkn;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v3, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v1, 0x1

    aget-object v1, v3, v1

    instance-of v2, v1, Landroid/content/ContentValues;

    if-eqz v2, :cond_8

    check-cast v1, Landroid/content/ContentValues;

    move-object v5, v1

    :goto_3
    if-eqz v5, :cond_1

    array-length v1, v3

    const/4 v2, 0x2

    if-le v1, v2, :cond_9

    const/4 v1, 0x2

    aget-object v1, v3, v1

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_9

    check-cast v1, Ljava/lang/String;

    move-object v2, v1

    :goto_4
    array-length v1, v3

    const/4 v4, 0x3

    if-le v1, v4, :cond_a

    const/4 v1, 0x3

    aget-object v1, v3, v1

    instance-of v3, v1, [Ljava/lang/String;

    if-eqz v3, :cond_a

    check-cast v1, [Ljava/lang/String;

    move-object v3, v1

    :goto_5
    sget-object v1, Lub0;->C0:Ljava/lang/String;

    invoke-virtual {v6, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_17

    const-string v1, "JqsusQ==\n"

    const-string v4, "UtJe1FnpJuo=\n"

    invoke-static {v1, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :goto_6
    const-string v4, "3QYroqPG7uveDA==\n"

    const-string v8, "rmle0MCjupI=\n"

    invoke-static {v4, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    const-string v8, "Opm2Gb9uj8Ix\n"

    const-string v9, "VvbVeNMo46M=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v8

    const/4 v9, 0x4

    new-array v9, v9, [Ljava/lang/Integer;

    const/4 v10, 0x0

    const/4 v11, 0x1

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v9, v10

    const/4 v10, 0x1

    const/4 v11, 0x2

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v9, v10

    const/4 v10, 0x2

    const/4 v11, 0x3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v9, v10

    const/4 v10, 0x3

    const/16 v11, 0xf

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v9, v10

    invoke-static {v9}, Ljb;->a0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    if-eqz v4, :cond_c

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v1

    xor-int/lit8 v4, v1, -0x3

    and-int/2addr v1, v4

    if-nez v1, :cond_c

    const/4 v1, 0x1

    :goto_7
    if-eqz v8, :cond_5

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v8, 0x4

    if-ne v4, v8, :cond_5

    const/4 v1, 0x1

    :cond_5
    if-eqz v1, :cond_6

    const-string v1, "WNXef/GVcutb3w==\n"

    const-string v4, "K7qrDZLwJpI=\n"

    invoke-static {v1, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v1, "smOzsg==\n"

    const-string v4, "xhrD10LLLYc=\n"

    invoke-static {v1, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v1, "ZZH8kb/DtAFu\n"

    const-string v4, "Cf6f8NOF2GA=\n"

    invoke-static {v1, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v4, 0x63

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v5, v1, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v1, "SOxCVEUu+g==\n"

    const-string v4, "K4MsICBAjrg=\n"

    invoke-static {v1, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/content/ContentValues;->getAsByteArray(Ljava/lang/String;)[B

    move-result-object v4

    if-nez v4, :cond_27

    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const-string v8, "yvkIgxuCiEo=\n"

    const-string v9, "uJh/0m7n+jM=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "SELECT content FROM "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, " WHERE "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v10, 0x2

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v10, v11

    const/4 v9, 0x1

    aput-object v3, v10, v9

    invoke-static {v1, v8, v10}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_27

    :try_start_0
    const-string v1, "IiriWhPFL249NuA=\n"

    const-string v9, "T0WUP0eqaQc=\n"

    invoke-static {v1, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v9, 0x0

    new-array v9, v9, [Ljava/lang/Object;

    invoke-static {v8, v1, v9}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v9, "lZAdb/rP/eGVigUjuMm87JqWBSOuw7zhlItcba/A8K+PnAFm+sfz+5eMHy2Yw/PjnoQf\n"

    const-string v10, "++VxA9qsnI8=\n"

    invoke-static {v9, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v1}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_26

    const-string v1, "ZKyqJRlTEA==\n"

    const-string v4, "A8neZ3U8cjU=\n"

    invoke-static {v1, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object v7, v4, v9

    invoke-static {v8, v1, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v4, v1, [B

    if-eqz v4, :cond_d

    check-cast v1, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_8
    :try_start_1
    const-string v4, "JpRXuCs=\n"

    const-string v9, "Rfg4y07SBhU=\n"

    invoke-static {v4, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v9, 0x0

    new-array v9, v9, [Ljava/lang/Object;

    invoke-static {v8, v4, v9}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_e

    :goto_9
    if-eqz v1, :cond_6

    const-string v4, "pSWlVYidnA==\n"

    const-string v8, "xkrLIe3z6Pg=\n"

    invoke-static {v4, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v0}, Lxh;->r([BLjava/lang/ClassLoader;)[B

    move-result-object v1

    invoke-virtual {v5, v4, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    :cond_6
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const-string v4, "YvwWp2zgWkh14A==\n"

    const-string v8, "FpR/1COCMC0=\n"

    invoke-static {v4, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v1}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v4, "emmhQ/J75Q==\n"

    const-string v8, "Gx3VMbAOg80=\n"

    invoke-static {v4, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Landroid/content/ContentValues;->getAsByteArray(Ljava/lang/String;)[B

    move-result-object v4

    if-eqz v4, :cond_1

    :try_start_2
    const-string v8, "NtmRm+wgN+w=\n"

    const-string v9, "RLjmyplFRZU=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "SELECT attrBuf FROM "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " WHERE "

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v2, v6

    const/4 v6, 0x1

    aput-object v3, v2, v6

    invoke-static {v1, v8, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result-object v2

    if-eqz v2, :cond_f

    :try_start_3
    const-string v1, "y5bSDoXJQOXUitA=\n"

    const-string v3, "pvmka9GmBow=\n"

    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v2, v1, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v3, "H2T+2gnwPf0ffuaWS/Z88BBi5pZd/Hz9Hn+/2Fz/MLMFaOLTCfgz5x14/Jhr/DP/FHD8\n"

    const-string v6, "cRGStimTXJM=\n"

    invoke-static {v3, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v1}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_e

    const-string v1, "+2F0Zvx6zw==\n"

    const-string v3, "nAQAJJAVrds=\n"

    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v7, v3, v6

    invoke-static {v2, v1, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, [B

    if-eqz v3, :cond_e

    check-cast v1, [B
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_a
    :try_start_4
    const-string v3, "iCuLFvs=\n"

    const-string v6, "60fkZZ6ZA6E=\n"

    invoke-static {v3, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v2, v3, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_c

    :goto_b
    if-eqz v1, :cond_1

    :try_start_5
    sget-object v2, Lub0;->j1:Ljava/lang/String;

    invoke-static {v2, v0}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lub0;->h1:Ljava/lang/String;

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v1, v6, v7

    invoke-static {v2, v3, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    sget-object v0, Lub0;->h1:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v4, v1, v6

    invoke-static {v3, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lub0;->k1:Ljava/lang/String;

    invoke-static {v2, v0}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/util/LinkedList;

    if-eqz v1, :cond_10

    check-cast v0, Ljava/util/LinkedList;

    move-object v2, v0

    :goto_c
    if-eqz v2, :cond_1

    sget-object v0, Lub0;->k1:Ljava/lang/String;

    invoke-static {v3, v0}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/util/LinkedList;

    if-eqz v1, :cond_11

    check-cast v0, Ljava/util/LinkedList;

    move-object v1, v0

    :goto_d
    if-eqz v1, :cond_1

    invoke-virtual {v2}, Ljava/util/LinkedList;->size()I

    move-result v0

    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    move-result v4

    if-le v0, v4, :cond_1

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const-string v0, "UglXH5ZQiUQTUxxD3g==\n"

    const-string v4, "O30ybfck5jY=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    const-string v0, "IuskpPgGV+Nl\n"

    const-string v6, "TI5c0NAoec0=\n"

    invoke-static {v0, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v0, Lub0;->m1:Ljava/lang/String;

    invoke-static {v4, v0}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const-string v7, "u4laBX+nA6z60xFZNw==\n"

    const-string v8, "0v0/dx7TbN4=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v6}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_12

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    const-string v8, "eQKrTkwYot0+\n"

    const-string v9, "F2fTOmQ2jPM=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v7}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v8, Lub0;->m1:Ljava/lang/String;

    invoke-static {v7, v8}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    move-result v7

    if-ne v0, v7, :cond_7

    if-eqz v0, :cond_7

    goto :goto_e

    :cond_8
    const/4 v1, 0x0

    move-object v5, v1

    goto/16 :goto_3

    :cond_9
    const/4 v1, 0x0

    move-object v2, v1

    goto/16 :goto_4

    :cond_a
    const/4 v1, 0x0

    move-object v3, v1

    goto/16 :goto_5

    :cond_b
    const/4 v1, 0x0

    goto/16 :goto_6

    :cond_c
    const/4 v1, 0x0

    goto/16 :goto_7

    :cond_d
    const/4 v1, 0x0

    goto/16 :goto_8

    :catchall_0
    move-exception v0

    :try_start_6
    const-string v1, "L4hQH/w=\n"

    const-string v2, "TOQ/bJmkqWI=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v8, v1, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_d

    :goto_f
    throw v0

    :cond_e
    const/4 v1, 0x0

    goto/16 :goto_a

    :catchall_1
    move-exception v0

    :try_start_7
    const-string v1, "ayZH36s=\n"

    const-string v3, "CEoorM6kSzM=\n"

    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v2, v1, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_b

    :goto_10
    :try_start_8
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_2
    move-exception v0

    const-string v0, "06ke\n"

    const-string v1, "p8h5VTpLcuY=\n"

    const-string v2, "LIUloeqfu3YWjTCg65a/\n"

    const-string v3, "f+tW6IT51DI=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "tw==\n"

    const-string v4, "0vI8ySRxU5w=\n"

    invoke-static {v0, v1, v2, v3, v4}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_f
    const/4 v1, 0x0

    goto/16 :goto_b

    :cond_10
    const/4 v0, 0x0

    move-object v2, v0

    goto/16 :goto_c

    :cond_11
    const/4 v0, 0x0

    move-object v1, v0

    goto/16 :goto_d

    :cond_12
    :try_start_9
    sget-object v0, Lub0;->l1:Ljava/lang/String;

    invoke-static {v4, v0}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v6, v0, Ljava/lang/String;

    if-eqz v6, :cond_15

    check-cast v0, Ljava/lang/String;

    :goto_11
    if-nez v0, :cond_13

    const-string v0, ""

    :cond_13
    sget-object v6, Lub0;->e1:Ljava/lang/String;

    invoke-static {v0, v6}, Li50;->K(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_14

    sget-object v6, Lub0;->l1:Ljava/lang/String;

    sget-object v7, Lub0;->e1:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v6, v0}, Lde/robv/android/xposed/XposedHelpers;->setObjectField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_14
    invoke-virtual {v1, v4}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_e

    :cond_15
    const/4 v0, 0x0

    goto :goto_11

    :cond_16
    sget-object v0, Lub0;->i1:Ljava/lang/String;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v3, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "rRGXjSo+7qGtC4/BaDivrKIXj8F+Mq+hrArWj38x4++3HYuEKjbgu68Nlc9IJPuqghaJgHM=\n"

    const-string v2, "w2T74Qpdj88=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v0, [B

    const-string v1, "0mwlGyYyjA==\n"

    const-string v2, "sxhRaWRH6rA=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    goto/16 :goto_2

    :cond_17
    sget-object v1, Lub0;->D0:Ljava/lang/String;

    invoke-virtual {v6, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "anWwKL7VJl9le7o=\n"

    const-string v2, "CRrdRdu7Ujk=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    const-string v1, "anG75QwLvuZlf7E=\n"

    const-string v2, "CR7WiGllyoA=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v1, "X7fxaG+AOsxSgPZP\n"

    const-string v2, "PMKDKQz0U6M=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/content/ContentValues;->getAsByteArray(Ljava/lang/String;)[B

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v2, "2+H4cFcbCF7W1v9X\n"

    const-string v3, "uJSKMTRvYTE=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0}, Lxh;->f([BLjava/lang/ClassLoader;)[B

    move-result-object v0

    invoke-virtual {v5, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    goto/16 :goto_2

    :pswitch_1
    iget-object v0, p0, Ljs;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/ClassLoader;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v1, "ng==\n"

    const-string v2, "7lPmYKYLOPM=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v2, 0x0

    aget-object v1, v1, v2

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_1c

    check-cast v1, Ljava/lang/String;

    move-object v3, v1

    :goto_12
    if-eqz v3, :cond_0

    sget-object v1, Lub0;->C0:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    sget-object v1, Lub0;->D0:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_18
    const-string v1, "ebNBGlY7x7tNpVY2aDHWvneiXQ==\n"

    const-string v2, "EtY4RTdVs9I=\n"

    sget-object v6, Lkn;->a:Lkn;

    invoke-static {v1, v2, v6}, Lg40;->q(Ljava/lang/String;Ljava/lang/String;Lkn;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v6, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    iget-object v7, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v1, 0x1

    aget-object v1, v7, v1

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_1d

    check-cast v1, Ljava/lang/String;

    :goto_13
    if-nez v1, :cond_25

    const-string v1, ""

    move-object v2, v1

    :goto_14
    const/4 v1, 0x2

    aget-object v1, v7, v1

    instance-of v7, v1, [Ljava/lang/String;

    if-eqz v7, :cond_1e

    check-cast v1, [Ljava/lang/String;

    :goto_15
    if-eqz v1, :cond_0

    sget-object v7, Lub0;->C0:Ljava/lang/String;

    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_20

    const-string v7, "k3IKThC3xb8=\n"

    const-string v8, "4RN9H2XSt8Y=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "SELECT rowid, content FROM "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " WHERE "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v9, 0x0

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v2, v9

    const/4 v8, 0x1

    aput-object v1, v2, v8

    invoke-static {v6, v7, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1b

    :try_start_a
    const-string v1, "A3kPMYC4f7UcZQ0=\n"

    const-string v7, "bhZ5VNTXOdw=\n"

    invoke-static {v1, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x0

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {v2, v1, v7}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v7, "cKsABORrq89wsRhIpm3qwn+tGEiwZ+rPcbBBBrFkpoFqpxwN5GOl1XK3AkaGZ6XNe78C\n"

    const-string v8, "Ht5saMQIyqE=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v1}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1a

    :cond_19
    const-string v1, "uHg07xagWA==\n"

    const-string v7, "3x1Ao3nOPwc=\n"

    invoke-static {v1, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v5, v7, v8

    invoke-static {v2, v1, v7}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v7, "BFkU2marCUgEQwyWJK1IRQtfDJYyp0hIBUJV2DOkBAYeVQjTZqMHUgZFFpgKpwZB\n"

    const-string v8, "aix4tkbIaCY=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v1}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    const-string v1, "0y+ouT8+3w==\n"

    const-string v7, "tErc+1NRvdg=\n"

    invoke-static {v1, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object v4, v7, v10

    invoke-static {v2, v1, v7}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v7, v1, [B

    if-eqz v7, :cond_1f

    check-cast v1, [B

    :goto_16
    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    const-string v10, "aW1YSPWNiw==\n"

    const-string v11, "CgI2PJDj/wc=\n"

    invoke-static {v10, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v1, v0}, Lxh;->r([BLjava/lang/ClassLoader;)[B

    move-result-object v1

    invoke-virtual {v7, v10, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    const-string v1, "VDCO1Nbzoaxf\n"

    const-string v10, "OF/ttbq1zc0=\n"

    invoke-static {v1, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v10, 0x63

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v7, v1, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v1, "C6Yxmk6z\n"

    const-string v10, "ftZV+zrWLsw=\n"

    invoke-static {v1, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v10, 0x4

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    aput-object v3, v10, v11

    const/4 v11, 0x1

    aput-object v7, v10, v11

    const/4 v7, 0x2

    const-string v11, "S87WDD7lfA==\n"

    const-string v12, "OaGhZVrYQ7c=\n"

    invoke-static {v11, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v7

    const/4 v7, 0x3

    const/4 v11, 0x1

    new-array v11, v11, [Ljava/lang/String;

    const/4 v12, 0x0

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v11, v12

    aput-object v11, v10, v7

    invoke-static {v6, v1, v10}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "UoDGWnKQY7BHmw==\n"

    const-string v7, "P++wPyb/LdU=\n"

    invoke-static {v1, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x0

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {v2, v1, v7}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v7, "XSmRQTfjyWNdM4kNdeWIblIviQ1j74hjXDLQQ2LsxC1HJY1IN+vHeV81kwNV78dhVj2T\n"

    const-string v8, "M1z9LReAqA0=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v1}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    move-result v1

    if-nez v1, :cond_19

    :cond_1a
    :try_start_b
    const-string v0, "LdGb3TA=\n"

    const-string v1, "Tr30rlX0d/4=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v2, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    :cond_1b
    :goto_17
    invoke-virtual {p1, v4}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_1c
    const/4 v1, 0x0

    move-object v3, v1

    goto/16 :goto_12

    :cond_1d
    const/4 v1, 0x0

    goto/16 :goto_13

    :cond_1e
    const/4 v1, 0x0

    goto/16 :goto_15

    :cond_1f
    const/4 v1, 0x0

    goto/16 :goto_16

    :catchall_3
    move-exception v0

    :try_start_c
    const-string v0, "LXT11BzwpAAbU+j2FtSuGxU=\n"

    const-string v1, "fhqGkHmcwXQ=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "06ke\n"

    const-string v3, "p8h5VTpLcuY=\n"

    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "tw==\n"

    const-string v1, "0vI8ySRxU5w=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    :try_start_d
    const-string v0, "gZ+nfwU=\n"

    const-string v1, "4vPIDGDSjPY=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v2, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    goto :goto_17

    :catchall_4
    move-exception v0

    goto :goto_17

    :catchall_5
    move-exception v0

    :try_start_e
    const-string v1, "Jv3wzVA=\n"

    const-string v3, "RZGfvjWvfe0=\n"

    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v2, v1, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_a

    :goto_18
    throw v0

    :cond_20
    sget-object v7, Lub0;->D0:Ljava/lang/String;

    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const-string v7, "Ob0VdHovz8U=\n"

    const-string v8, "S9xiJQ9Kvbw=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "SELECT rowid, curActionBuf FROM "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " WHERE "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v9, 0x0

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v2, v9

    const/4 v8, 0x1

    aput-object v1, v2, v8

    invoke-static {v6, v7, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_23

    :try_start_f
    const-string v1, "i4QNfR2cMFuUmA8=\n"

    const-string v7, "5ut7GEnzdjI=\n"

    invoke-static {v1, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x0

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {v2, v1, v7}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v7, "nZ0uAqFD75qdhzZO40Wul5KbNk71T66anIZvAPRM4tSHkTILoUvhgJ+BLEDDT+GYloks\n"

    const-string v8, "8+hCboEgjvQ=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v1}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_22

    :cond_21
    const-string v1, "E9lQQpQE+g==\n"

    const-string v7, "dLwkDvtqnao=\n"

    invoke-static {v1, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v5, v7, v8

    invoke-static {v2, v1, v7}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v7, "sti4c2sdfNuywqA/KRs91r3eoD8/ET3bs8P5cT4ScZWo1KR6axVywbDEujEHEXPS\n"

    const-string v8, "3K3UH0t+HbU=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v1}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    const-string v1, "KV09yO4uRg==\n"

    const-string v7, "TjhJioJBJFI=\n"

    invoke-static {v1, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object v4, v7, v10

    invoke-static {v2, v1, v7}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v7, v1, [B

    if-eqz v7, :cond_24

    check-cast v1, [B

    :goto_19
    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    const-string v10, "7Cuncya6s/HhHKBU\n"

    const-string v11, "j17VMkXO2p4=\n"

    invoke-static {v10, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v1, v0}, Lxh;->f([BLjava/lang/ClassLoader;)[B

    move-result-object v1

    invoke-virtual {v7, v10, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    const-string v1, "4odTJQL8QeTtiVk=\n"

    const-string v10, "geg+SGeSNYI=\n"

    invoke-static {v1, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v1, "bBT69BUj\n"

    const-string v10, "GWSelWFGX3Y=\n"

    invoke-static {v1, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v10, 0x4

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    aput-object v3, v10, v11

    const/4 v11, 0x1

    aput-object v7, v10, v11

    const/4 v7, 0x2

    const-string v11, "b8HSM3r0XA==\n"

    const-string v12, "Ha6lWh7JYzM=\n"

    invoke-static {v11, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v7

    const/4 v7, 0x3

    const/4 v11, 0x1

    new-array v11, v11, [Ljava/lang/String;

    const/4 v12, 0x0

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v11, v12

    aput-object v11, v10, v7

    invoke-static {v6, v1, v10}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "5Ld9jpim+mLxrA==\n"

    const-string v7, "idgL68zJtAc=\n"

    invoke-static {v1, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x0

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {v2, v1, v7}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v7, "ibpZZe9kZlmJoEEprWInVIa8QSm7aCdZiKEYZ7praxeTtkVs72xoQ4umWyeNaGhbgq5b\n"

    const-string v8, "5881Cc8HBzc=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v1}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    move-result v1

    if-nez v1, :cond_21

    :cond_22
    :try_start_10
    const-string v0, "6wdIG44=\n"

    const-string v1, "iGsnaOu7ZTg=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v2, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    :cond_23
    :goto_1a
    invoke-virtual {p1, v4}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_24
    const/4 v1, 0x0

    goto/16 :goto_19

    :catchall_6
    move-exception v0

    :try_start_11
    const-string v0, "BtVf8zggGjww+EPaMCkRPB3UQ9w=\n"

    const-string v1, "Vbsst11Mf0g=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "06ke\n"

    const-string v3, "p8h5VTpLcuY=\n"

    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "tw==\n"

    const-string v1, "0vI8ySRxU5w=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    :try_start_12
    const-string v0, "0b+9PF8=\n"

    const-string v1, "stPSTzqieOc=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v2, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    goto :goto_1a

    :catchall_7
    move-exception v0

    goto :goto_1a

    :catchall_8
    move-exception v0

    :try_start_13
    const-string v1, "dUNULDA=\n"

    const-string v3, "Fi87X1UaFcA=\n"

    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v2, v1, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    :goto_1b
    throw v0

    :catchall_9
    move-exception v1

    goto :goto_1b

    :catchall_a
    move-exception v1

    goto/16 :goto_18

    :catchall_b
    move-exception v1

    goto/16 :goto_10

    :catchall_c
    move-exception v2

    goto/16 :goto_b

    :catchall_d
    move-exception v1

    goto/16 :goto_f

    :catchall_e
    move-exception v4

    goto/16 :goto_9

    :cond_25
    move-object v2, v1

    goto/16 :goto_14

    :cond_26
    move-object v1, v4

    goto/16 :goto_8

    :cond_27
    move-object v1, v4

    goto/16 :goto_9

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
