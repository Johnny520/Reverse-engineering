.class public final Lts;
.super Ljava/lang/Object;

# interfaces
.implements Ljm;


# instance fields
.field public final a:I

.field public final b:Landroid/app/Application;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Application;I)V
    .locals 3

    iput p2, p0, Lts;->a:I

    iput-object p1, p0, Lts;->b:Landroid/app/Application;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e1\u06df\u06e0"

    invoke-static {v1}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(I)V

    sget v0, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    div-int/lit16 v2, v2, 0x1811

    mul-int/2addr v0, v2

    if-eqz v0, :cond_3

    const-string v0, "\u06e7\u06e4\u06e0"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    :sswitch_1
    sget v0, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v2, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    rem-int/lit16 v2, v2, -0x14f2

    mul-int/2addr v0, v2

    if-gtz v0, :cond_1

    const-string v0, "\u06e5\u06e4\u06e1"

    :goto_1
    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e4\u06e3\u06df"

    goto :goto_1

    :sswitch_2
    const-string v0, "ZyQ5FJboh72PjVIgbIbtHhT"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣۢۧۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget v1, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    if-gtz v1, :cond_2

    const/16 v1, 0x4f

    sput v1, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    const-string v1, "\u06e1\u06df\u06e0"

    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    goto :goto_0

    :cond_2
    const-string v1, "\u06df\u06e0\u06e0"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    goto :goto_0

    :cond_3
    sget v0, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    xor-int/2addr v0, v2

    const v2, -0x1abb61

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۥۥۢۧ()I

    move-result v0

    if-ltz v0, :cond_0

    sget v0, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    if-ltz v0, :cond_4

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    const-string v0, "\u06df\u06e0\u06e0"

    invoke-static {v0}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    const-string v0, "\u06e1\u06e7\u06e8"

    invoke-static {v0}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_4
    sget v0, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    or-int/2addr v0, v2

    const v2, 0x1aae87

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa71f -> :sswitch_0
        0x1aab1e -> :sswitch_1
        0x1aae82 -> :sswitch_3
        0x1aaf82 -> :sswitch_2
        0x1aba40 -> :sswitch_5
        0x1ac5a3 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lts;->a:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lls;->a:Lls;

    iget-object v0, p0, Lts;->b:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v0, "MjJ9NfMTVKoZOGgS+gAP93t5IA==\n"

    const-string v2, "VVcJdp9yJ9k=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    const-class v2, Ljava/lang/String;

    const-string v0, "Rv3SMrZs\n"

    const-string v3, "KpKzVtMe1xo=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :try_start_0
    sget-object v0, Lub0;->b0:Ljava/lang/String;

    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v3

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v3, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "n7SPoX4GvSg=\n"

    const-string v4, "8NrM0xtnyU0=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v4, Lv9;

    const/4 v5, 0x2

    invoke-direct {v4, v5}, Lv9;-><init>(I)V

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    const-class v7, Landroid/os/Bundle;

    aput-object v7, v5, v6

    const/4 v6, 0x1

    aput-object v4, v5, v6

    invoke-static {v3, v0, v5}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :catchall_0
    move-exception v0

    const-string v0, "06ke\n"

    const-string v3, "p8h5VTpLcuY=\n"

    const-string v4, "utR9ZWaMidWT2EFHcaiS5KPoQUZwro0=\n"

    const-string v5, "9qEeDh/B5rs=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "tw==\n"

    const-string v6, "0vI8ySRxU5w=\n"

    invoke-static {v0, v3, v4, v5, v6}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :sswitch_4
    :try_start_1
    const-string v0, "5+k1ZUeUGHbh6CxlRJISd6riOT9Skxdm4agLGn+YAnDA5ywqUZAFcA==\n"

    const-string v3, "hIZYSzPxdhU=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    if-eqz v1, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_6
    const v0, 0xbe41

    goto :goto_2

    :sswitch_7
    const-string v0, "HEgzdim2DkEBTg99GK03ThlPI2c=\n"

    const-string v3, "dSZAE1vCWSg=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    new-instance v4, Lv9;

    const/4 v5, 0x3

    invoke-direct {v4, v5}, Lv9;-><init>(I)V

    const/4 v5, 0x5

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    const/4 v6, 0x1

    aput-object v2, v5, v6

    const/4 v2, 0x2

    const-class v6, Landroid/content/ContentValues;

    aput-object v6, v5, v2

    const/4 v2, 0x3

    aput-object v3, v5, v2

    const/4 v2, 0x4

    aput-object v4, v5, v2

    invoke-static {v1, v0, v5}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_8
    sget-object v0, Lxh;->n:Lxh;

    :goto_5
    return-object v0

    :sswitch_9
    const v0, 0xbe9e

    goto :goto_3

    :catchall_1
    move-exception v0

    const-string v0, "06ke\n"

    const-string v1, "p8h5VTpLcuY=\n"

    const-string v2, "11NwvkBAYZn+X0ycV2R6qMxlV5dmRWGY8A==\n"

    const-string v3, "myYT1TkNDvc=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "tw==\n"

    const-string v4, "0vI8ySRxU5w=\n"

    invoke-static {v0, v1, v2, v3, v4}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    :pswitch_0
    sget-object v0, Lrv;->a:Ljava/util/ArrayList;

    iget-object v0, p0, Lts;->b:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v1, "wZbzFlg41zfqnOYxUSuMaojdrg==\n"

    const-string v2, "pvOHVTRZpEQ=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "w9cSo3O1\n"

    const-string v2, "r7hzxxbHves=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :try_start_2
    const-string v1, "eUdimuSqkRV/Rnua56ybFDRMbsDxrZ4FfwZc5dymixNeSXvV8q6MEw==\n"

    const-string v2, "GigPtJDP/3Y=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    new-instance v0, Lv9;

    const/16 v2, 0x8

    invoke-direct {v0, v2}, Lv9;-><init>(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    :try_start_3
    sget-object v2, Lrv;->a:Ljava/util/ArrayList;

    monitor-enter v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :try_start_4
    const-string v3, "RcCXdoVv3jk=\n"

    const-string v4, "N6HgJ/AKrEA=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    move-result-object v3

    const-string v4, "8l6+7kwJemb/RbnqaRY+BbQf+A==\n"

    const-string v5, "mjHRhQ1lFis=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    const-string v3, "T9FbbFGNKPVq2VhVYok5+FLCVQ==\n"

    const-string v4, "PbAsPSToWow=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    move-result-object v0

    const-string v3, "fWi/CkiOlIRwc7gObZHQ5zsp+Q==\n"

    const-string v4, "FQfQYQni+Mk=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    const v0, 0xbefb

    :goto_6
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_6

    :goto_7
    :sswitch_a
    :try_start_6
    new-instance v0, Lv9;

    const/4 v2, 0x7

    invoke-direct {v0, v2}, Lv9;-><init>(I)V

    new-instance v2, Lv9;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Lv9;-><init>(I)V

    const-string v3, "J1yJl5NDOMg6WrWcolgBxyJbmYY=\n"

    const-string v4, "TjL68uE3b6E=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x5

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    const-class v6, Ljava/lang/String;

    aput-object v6, v4, v5

    const/4 v5, 0x1

    const-class v6, Ljava/lang/String;

    aput-object v6, v4, v5

    const/4 v5, 0x2

    const-class v6, Landroid/content/ContentValues;

    aput-object v6, v4, v5

    const/4 v5, 0x3

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v6, v4, v5

    const/4 v5, 0x4

    aput-object v0, v4, v5

    invoke-static {v1, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    const-string v3, "egOWi/DX\n"

    const-string v4, "E23l7oKjxHc=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    const-class v6, Ljava/lang/String;

    aput-object v6, v4, v5

    const/4 v5, 0x1

    const-class v6, Ljava/lang/String;

    aput-object v6, v4, v5

    const/4 v5, 0x2

    const-class v6, Landroid/content/ContentValues;

    aput-object v6, v4, v5

    const/4 v5, 0x3

    aput-object v0, v4, v5

    invoke-static {v1, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    const-string v0, "61r3iEd4\n"

    const-string v3, "niqT6TMdadA=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x5

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-class v5, Ljava/lang/String;

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-class v5, Landroid/content/ContentValues;

    aput-object v5, v3, v4

    const/4 v4, 0x2

    const-class v5, Ljava/lang/String;

    aput-object v5, v3, v4

    const/4 v4, 0x3

    const-class v5, [Ljava/lang/String;

    aput-object v5, v3, v4

    const/4 v4, 0x4

    aput-object v2, v3, v4

    invoke-static {v1, v0, v3}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    const-string v0, "tToOKuUh\n"

    const-string v2, "0V9iT5FEEGc=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lv9;

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Lv9;-><init>(I)V

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-class v5, Ljava/lang/String;

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-class v5, Ljava/lang/String;

    aput-object v5, v3, v4

    const/4 v4, 0x2

    const-class v5, [Ljava/lang/String;

    aput-object v5, v3, v4

    const/4 v4, 0x3

    aput-object v2, v3, v4

    invoke-static {v1, v0, v3}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    sget-object v0, Lkn;->a:Lkn;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lkn;->g:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v1, "pC0=\n"

    const-string v2, "4G9MQy0g8B4=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    const v0, 0xc202

    :goto_8
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_8

    :sswitch_b
    const v0, 0xc221

    goto :goto_8

    :sswitch_c
    const v0, 0xbf1a

    goto/16 :goto_6

    :catchall_2
    move-exception v0

    :try_start_7
    monitor-exit v2

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :catchall_3
    move-exception v0

    :try_start_8
    const-string v0, "93rDHhCj+4T4V98CGpvsoc1OxQgDvcGJ1HbE\n"

    const-string v2, "uh+wbXHEnsA=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "06ke\n"

    const-string v3, "p8h5VTpLcuY=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "tw==\n"

    const-string v2, "0vI8ySRxU5w=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    goto/16 :goto_7

    :catchall_4
    move-exception v0

    sget-object v0, Lkn;->a:Lkn;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lkn;->g:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v1, "8a0=\n"

    const-string v2, "te/URKwrfKI=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "06ke\n"

    const-string v1, "p8h5VTpLcuY=\n"

    const-string v2, "BFZmP5LI+ccLe3ojmPDV7SBHSgqS2/3v\n"

    const-string v3, "STMVTPOvnIM=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "tw==\n"

    const-string v4, "0vI8ySRxU5w=\n"

    invoke-static {v0, v1, v2, v3, v4}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :sswitch_d
    sget-object v0, Lxh;->n:Lxh;

    goto/16 :goto_5

    :pswitch_1
    sget-object v0, Lo9;->a:Ljava/lang/ClassLoader;

    iget-object v0, p0, Lts;->b:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v0, "uzyryfhKgFWQNr7u8VnbCPJ39g==\n"

    const-string v2, "3FnfipQr8yY=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "RkIkNAeX\n"

    const-string v2, "Ki1FUGLleec=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sput-object v1, Lo9;->a:Ljava/lang/ClassLoader;

    const-class v2, Landroid/widget/PopupWindow;

    new-instance v3, Lw50;

    const/4 v0, 0x3

    invoke-direct {v3, v0}, Lw50;-><init>(I)V

    :try_start_9
    const-string v0, "IL85cBN2DQwwtiJuPWw=\n"

    const-string v4, "U9dWB1ICQWM=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, v3}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    const v0, 0xc27e

    :goto_9
    const v4, 0xc28f

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_6

    goto :goto_9

    :goto_a
    :sswitch_e
    :try_start_a
    const-string v0, "XfJeuwPg0tFB6nWjNf0=\n"

    const-string v4, "LpoxzEKTlqM=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, v3}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    const v0, 0xc2fa

    :goto_b
    const v2, 0xc30b

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_7

    goto :goto_b

    :sswitch_f
    const v0, 0xc5a4

    goto :goto_b

    :sswitch_10
    const v0, 0xc29d

    goto :goto_9

    :catchall_5
    move-exception v0

    const-string v0, "06ke\n"

    const-string v4, "p8h5VTpLcuY=\n"

    const-string v5, "96xckFg6eZrOrUm6YBB4luusT4RcFniT\n"

    const-string v6, "p8Ms5Sh/F/0=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "tw==\n"

    const-string v7, "0vI8ySRxU5w=\n"

    invoke-static {v0, v4, v5, v6, v7}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_a

    :catchall_6
    move-exception v0

    const-string v0, "06ke\n"

    const-string v2, "p8h5VTpLcuY=\n"

    const-string v3, "mptKS6g6SPujml9hkBBJ946GVU6cEFHy\n"

    const-string v4, "yvQ6Pth/Jpw=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "tw==\n"

    const-string v5, "0vI8ySRxU5w=\n"

    invoke-static {v0, v2, v3, v4, v5}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :sswitch_11
    new-instance v0, Lw50;

    const/4 v2, 0x2

    invoke-direct {v0, v2}, Lw50;-><init>(I)V

    :try_start_b
    const-class v2, Landroid/app/Dialog;

    const-string v3, "QoDpfQ==\n"

    const-string v4, "MeiGCnIACzc=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    const v0, 0xc601

    :goto_c
    const v2, 0xc612

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_8

    goto :goto_c

    :sswitch_12
    const v0, 0xc620

    goto :goto_c

    :catchall_7
    move-exception v0

    const-string v0, "06ke\n"

    const-string v2, "p8h5VTpLcuY=\n"

    const-string v3, "d/6zVdaErM9O/6Z/7q6tw2P4okzJpg==\n"

    const-string v4, "J5HDIKbBwqg=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "tw==\n"

    const-string v5, "0vI8ySRxU5w=\n"

    invoke-static {v0, v2, v3, v4, v5}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :sswitch_13
    const-string v0, "KO9CPJVe\n"

    const-string v2, "RIAjWPAse4k=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-class v0, Landroid/view/ViewGroup;

    const-string v2, "gx0C+dH1dMGzGwTq2MRhzIkA\n"

    const-string v3, "53RxibCBF6k=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-class v5, Landroid/view/MotionEvent;

    aput-object v5, v3, v4

    const/4 v4, 0x1

    new-instance v5, Lv9;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Lv9;-><init>(I)V

    aput-object v5, v3, v4

    invoke-static {v0, v2, v3}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    sget-object v0, Ly9;->a:Ljava/lang/Class;

    const-string v0, "9p8MBtEA\n"

    const-string v2, "mvBtYrRyzJg=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget-object v2, Lub0;->m0:Ljava/lang/String;

    sget-object v3, Lub0;->K0:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    const v0, 0xc67d

    :goto_d
    const v5, 0xc68e

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_9

    goto :goto_d

    :cond_2
    :sswitch_14
    const v0, 0xc6bb

    goto :goto_d

    :sswitch_15
    if-nez v4, :cond_2

    const v0, 0xc965

    goto :goto_d

    :sswitch_16
    const v0, 0xc984

    :goto_e
    const v1, 0xc995

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_a

    goto :goto_e

    :sswitch_17
    const v0, 0xc9a3

    goto :goto_e

    :sswitch_18
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    const v0, 0xca00

    :goto_f
    const v5, 0xca11

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_b

    goto :goto_f

    :cond_3
    :sswitch_19
    const v0, 0xca3e

    goto :goto_f

    :sswitch_1a
    if-nez v4, :cond_3

    const v0, 0xca5d

    goto :goto_f

    :sswitch_1b
    const v0, 0xca7c

    :goto_10
    const v1, 0xca8d

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_c

    goto :goto_10

    :sswitch_1c
    const v0, 0xcd26

    goto :goto_10

    :sswitch_1d
    invoke-static {v2, v1}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    const v0, 0xcd83

    :goto_11
    const v2, 0xcd94

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_d

    goto :goto_11

    :sswitch_1e
    if-eqz v1, :cond_4

    const v0, 0xcde0

    goto :goto_11

    :cond_4
    :sswitch_1f
    const v0, 0xcdc1

    goto :goto_11

    :sswitch_20
    sget-object v0, Lkn;->a:Lkn;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lkn;->g:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v2, "loc5kzyq\n"

    const-string v4, "1e9Y52njgFM=\n"

    invoke-static {v2, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_c
    new-instance v0, Lv9;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Lv9;-><init>(I)V

    invoke-static {v1, v3, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    const v0, 0xcdff

    :goto_12
    const v1, 0xce10

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_e

    goto :goto_12

    :goto_13
    :sswitch_21
    sget-object v0, Lxh;->n:Lxh;

    goto/16 :goto_5

    :sswitch_22
    const v0, 0xce1e

    goto :goto_12

    :catchall_8
    move-exception v0

    sget-object v1, Lkn;->a:Lkn;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lkn;->g:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v2, "V/7V0Zp9\n"

    const-string v3, "FJa0pc80hi4=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "5s0I91BJur/KzjbKa2mG\n"

    const-string v2, "paVpgwUA8tA=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ly9;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    const v0, 0xd106

    :goto_14
    const v1, 0xd117

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_f

    goto :goto_14

    :sswitch_23
    const v0, 0xd125

    goto :goto_14

    :sswitch_24
    sget-object v0, Lkn;->a:Lkn;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lkn;->g:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v1, "hOiVH8BE\n"

    const-string v2, "x4D0a5UNzBI=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_13

    :pswitch_2
    iget-object v0, p0, Lts;->b:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v0, "9vHdkRZWDILd+8i2H0VX37+6gA==\n"

    const-string v2, "kZSp0no3f/E=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "ak2iUq1h\n"

    const-string v2, "BiLDNsgT15A=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const/4 v0, 0x2

    :try_start_d
    new-array v0, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    sget-object v3, Lub0;->B0:Ljava/lang/String;

    aput-object v3, v0, v2

    const/4 v2, 0x1

    sget-object v3, Lub0;->A0:Ljava/lang/String;

    aput-object v3, v0, v2

    invoke-static {v0}, Ljb;->a0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :sswitch_25
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const v0, 0xd182

    :goto_15
    const v4, 0xd193

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_10

    goto :goto_15

    :sswitch_26
    if-eqz v3, :cond_5

    const v0, 0xd1df

    goto :goto_15

    :cond_5
    :sswitch_27
    const v0, 0xd1c0

    goto :goto_15

    :sswitch_28
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v3

    const v0, 0xd1fe

    :goto_16
    const v4, 0xd20f

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_11

    goto :goto_16

    :sswitch_29
    if-nez v3, :cond_6

    const v0, 0xd4e6

    goto :goto_16

    :cond_6
    :sswitch_2a
    const v0, 0xd4c7

    goto :goto_16

    :sswitch_2b
    const v0, 0xd505

    :goto_17
    const v3, 0xd516

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_12

    goto :goto_17

    :sswitch_2c
    const v0, 0xd524

    goto :goto_17

    :sswitch_2d
    const-string v0, "sRYW7eM7tQ==\n"

    const-string v4, "1G5zjrBq+Ws=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v4, Lv9;

    const/16 v5, 0x10

    invoke-direct {v4, v5}, Lv9;-><init>(I)V

    invoke-static {v3, v0, v4}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    const-string v0, "68Y4U2a8\n"

    const-string v4, "j6NUNhLZoYU=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljs;

    const/4 v5, 0x1

    invoke-direct {v4, v5, v1}, Ljs;-><init>(ILjava/lang/Object;)V

    invoke-static {v3, v0, v4}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    new-instance v0, Ljs;

    const/4 v4, 0x2

    invoke-direct {v0, v4, v1}, Ljs;-><init>(ILjava/lang/Object;)V

    const-string v4, "q71G7oSmOkaqpW3hs6wDSbKkQfs=\n"

    const-string v5, "3s0ij/DDbS8=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    const-string v4, "m3GSHfqN\n"

    const-string v5, "7gH2fI7o0+I=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    const v0, 0xd581

    :goto_18
    const v3, 0xd592

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_13

    goto :goto_18

    :sswitch_2e
    const v0, 0xd5a0

    goto :goto_18

    :sswitch_2f
    const-string v0, "L1/WGYBu\n"

    const-string v1, "fCalbeUD+Kc=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "mDNedkRxKQj1JD7KKgQ6X5w9f7M5c4LFnwFXsRxjR0DtSl7uS0QTCPAHPtkuCwJVnxNOsDFji82c\nI1m+H1BEZepKUck=\n"

    const-string v2, "eq/bVqLtou0=\n"

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
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0

    const v0, 0xd888

    :goto_19
    const v1, 0xd899

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_14

    goto :goto_19

    :sswitch_30
    const v0, 0xd8a7

    goto :goto_19

    :catch_0
    move-exception v0

    const-string v0, "06ke\n"

    const-string v1, "p8h5VTpLcuY=\n"

    const-string v2, "8L6E12bjsjLNuYM=\n"

    const-string v3, "o9D3nwmM2Xs=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "tw==\n"

    const-string v4, "0vI8ySRxU5w=\n"

    invoke-static {v0, v1, v2, v3, v4}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :sswitch_31
    sget-object v0, Lxh;->n:Lxh;

    goto/16 :goto_5

    :pswitch_3
    iget-object v0, p0, Lts;->b:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v1, "TPMwkLRgg5Rn+SW3vXPYyQW4bQ==\n"

    const-string v2, "K5ZE09gB8Oc=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "zpavTRe5\n"

    const-string v1, "ovnOKXLLEfU=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    new-instance v0, Lv9;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lv9;-><init>(I)V

    :try_start_e
    const-class v1, Landroid/app/NotificationManager;

    const-string v2, "tpIhX7Ln\n"

    const-string v3, "2P1VNtSe0Mk=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    const v0, 0xd904

    :goto_1a
    const v1, 0xd915

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_15

    goto :goto_1a

    :sswitch_32
    const v0, 0xd923

    goto :goto_1a

    :catchall_9
    move-exception v0

    const-string v0, "06ke\n"

    const-string v1, "p8h5VTpLcuY=\n"

    const-string v2, "h332EM3j2xq9e+0X4+XXEJZb7BDf\n"

    const-string v3, "yRKCeauKuHs=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "tw==\n"

    const-string v4, "0vI8ySRxU5w=\n"

    invoke-static {v0, v1, v2, v3, v4}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :sswitch_33
    sget-object v0, Lxh;->n:Lxh;

    goto/16 :goto_5

    :pswitch_4
    iget-object v0, p0, Lts;->b:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v0, "1ZcbgCN5/VH+nQ6nKmqmDJzcRg==\n"

    const-string v2, "svJvw08YjiI=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "M/AFFTDU\n"

    const-string v2, "X59kcVWm/ys=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :try_start_f
    sget-object v2, Lub0;->n1:Ljava/lang/String;

    invoke-static {v2, v1}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v3

    const v0, 0xd980

    :goto_1b
    const v4, 0xd991

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_16

    goto :goto_1b

    :sswitch_34
    if-nez v3, :cond_7

    const v0, 0xdc68

    goto :goto_1b

    :cond_7
    :sswitch_35
    const v0, 0xdc49

    goto :goto_1b

    :sswitch_36
    const-string v0, "LkMOyYtB4L8PRjXogV7IlhxZHOs=\n"

    const-string v1, "fS19h+41l9A=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "\u274c \u81f4\u547d\u9519\u8bef\uff1a\u7f51\u7edc\u8bf7\u6c42\u57fa\u7c7b ["

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "] \u5f7b\u5e95\u4e22\u5931\uff01"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

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

    const v0, 0xdc87

    :goto_1c
    const v1, 0xdc98

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_17

    goto :goto_1c

    :sswitch_37
    const v0, 0xdca6

    goto :goto_1c

    :sswitch_38
    new-instance v0, Ljs;

    const/4 v2, 0x3

    invoke-direct {v0, v2, v1}, Ljs;-><init>(ILjava/lang/Object;)V

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    new-instance v2, Le40;

    invoke-direct {v2, v1, v0}, Le40;-><init>(Ljava/util/concurrent/ConcurrentHashMap;Ljs;)V

    invoke-static {v3, v2}, Lde/robv/android/xposed/XposedBridge;->hookAllConstructors(Ljava/lang/Class;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    const-string v0, "dSaj5VkK\n"

    const-string v1, "Jl/QkTxnokA=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "LfUgthKtI8hT00MPWM4XpirmLnNroGyQXo4eChKUHstc54W+EqIjy0/oQyJJzx+yKeIDcH+CbKRH\nQIVwe6pjkHKPLQYSohQ=\n"

    const-string v2, "z2mllvcoiy0=\n"

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
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_1

    const v0, 0xdd03

    :goto_1d
    const v1, 0xdd14

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_18

    goto :goto_1d

    :sswitch_39
    const v0, 0xdd22

    goto :goto_1d

    :catch_1
    move-exception v0

    const-string v0, "06ke\n"

    const-string v1, "p8h5VTpLcuY=\n"

    const-string v2, "DupOGCEiJLgv73U5Kz0auTTw\n"

    const-string v3, "XYQ9VkRWU9c=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "tw==\n"

    const-string v4, "0vI8ySRxU5w=\n"

    invoke-static {v0, v1, v2, v3, v4}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :sswitch_3a
    sget-object v0, Lxh;->n:Lxh;

    goto/16 :goto_5

    :pswitch_5
    sget-object v0, Lly;->a:Ljava/util/Map;

    iget-object v0, p0, Lts;->b:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v1, "oUHT1seHvAaKS8bxzpTnW+gKjg==\n"

    const-string v2, "xiSnlavmz3U=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    const-class v2, Landroid/widget/ImageView;

    const-string v1, "XSZF323p\n"

    const-string v3, "MUkkuwibwuM=\n"

    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget-object v1, Lub0;->l0:Ljava/lang/String;

    invoke-static {v1, v0}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    const v0, 0x1700af

    :goto_1e
    const v3, 0x1700c0

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_19

    goto :goto_1e

    :cond_8
    :sswitch_3b
    const v0, 0x1700ed

    goto :goto_1e

    :sswitch_3c
    if-eqz v1, :cond_8

    const v0, 0x17010c

    goto :goto_1e

    :sswitch_3d
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0}, Lg80;->t([Ljava/lang/Object;)Li;

    move-result-object v3

    :sswitch_3e
    invoke-virtual {v3}, Li;->hasNext()Z

    move-result v1

    const v0, 0x17012b

    :goto_1f
    const v4, 0x17013c

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_1a

    goto :goto_1f

    :sswitch_3f
    if-eqz v1, :cond_9

    const v0, 0x170188

    goto :goto_1f

    :cond_9
    :sswitch_40
    const v0, 0x170169

    goto :goto_1f

    :sswitch_41
    invoke-virtual {v3}, Li;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    array-length v4, v1

    const v1, 0x1701a7

    :goto_20
    const v5, 0x1701b8

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_1b

    goto :goto_20

    :sswitch_42
    const/4 v1, 0x4

    if-ne v4, v1, :cond_a

    const v1, 0x17048f

    goto :goto_20

    :cond_a
    :sswitch_43
    const v1, 0x170470

    goto :goto_20

    :sswitch_44
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    const/4 v4, 0x0

    aget-object v1, v1, v4

    const-class v4, Ljava/lang/String;

    invoke-static {v1, v4}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const v1, 0x1704ae

    :goto_21
    const v5, 0x1704bf

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_1c

    goto :goto_21

    :sswitch_45
    if-eqz v4, :cond_b

    const v1, 0x17050b

    goto :goto_21

    :cond_b
    :sswitch_46
    const v1, 0x1704ec

    goto :goto_21

    :sswitch_47
    new-instance v1, Lv9;

    const/16 v4, 0xb

    invoke-direct {v1, v4}, Lv9;-><init>(I)V

    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    const v0, 0x17052a

    :goto_22
    const v1, 0x17053b

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_1d

    goto :goto_22

    :sswitch_48
    const v0, 0x170549

    goto :goto_22

    :sswitch_49
    const-class v0, Landroid/widget/TextView;

    const-string v1, "o/piYBAdig==\n"

    const-string v3, "0J8WNHVl/sM=\n"

    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x5

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-class v5, Ljava/lang/CharSequence;

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-class v5, Landroid/widget/TextView$BufferType;

    aput-object v5, v3, v4

    const/4 v4, 0x2

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v5, v3, v4

    const/4 v4, 0x3

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v3, v4

    const/4 v4, 0x4

    new-instance v5, Lv9;

    const/16 v6, 0xc

    invoke-direct {v5, v6}, Lv9;-><init>(I)V

    aput-object v5, v3, v4

    invoke-static {v0, v1, v3}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    new-instance v0, Lv9;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lv9;-><init>(I)V

    const-string v1, "kTsKefvOpcWgNwpd998=\n"

    const-string v3, "4l5+MJavwqA=\n"

    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    const-string v1, "MoJRlCO0438FlUSqL7fofw==\n"

    const-string v3, "Qecl3U7VhBo=\n"

    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    sget-object v0, Lxh;->n:Lxh;

    goto/16 :goto_5

    :pswitch_6
    sget-object v0, Lx50;->a:Landroid/util/SparseIntArray;

    iget-object v0, p0, Lts;->b:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v0, "q94fTa8trFmA1Apqpj73BOKVQg==\n"

    const-string v2, "zLtrDsNM3yo=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    const-class v2, Landroid/content/Intent;

    const-class v3, Landroid/telephony/TelephonyManager;

    const-class v4, Landroid/location/Location;

    const-class v5, Lorg/json/JSONObject;

    const-string v0, "FJnXE1TN\n"

    const-string v6, "ePa2dzG/ark=\n"

    invoke-static {v0, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "yTkglI/+HA==\n"

    const-string v6, "p1xY4MaQaFc=\n"

    invoke-static {v0, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v7, Ljava/util/Random;

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object v6, v8, v9

    const/4 v9, 0x1

    new-instance v10, Lv9;

    const/16 v11, 0x12

    invoke-direct {v10, v11}, Lv9;-><init>(I)V

    aput-object v10, v8, v9

    invoke-static {v7, v0, v8}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    :try_start_10
    const-string v0, "dsvl/sJ1\n"

    const-string v7, "BKqLmq0YJJo=\n"

    invoke-static {v0, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v7, Lv9;

    const/16 v8, 0x13

    invoke-direct {v7, v8}, Lv9;-><init>(I)V

    const-class v8, Ljava/lang/Math;

    invoke-static {v8, v0, v7}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_a

    const v0, 0x170831

    :goto_23
    const v7, 0x170842

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_1e

    goto :goto_23

    :goto_24
    :sswitch_4a
    new-instance v0, Lv9;

    const/16 v7, 0x1d

    invoke-direct {v0, v7}, Lv9;-><init>(I)V

    :try_start_11
    const-string v7, "/kY9+1/kknf8\n"

    const-string v8, "mSNJvzCR8Bs=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    const-string v7, "cwuwZ3iPJE15\n"

    const-string v8, "HHvEIxf6RiE=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    const-string v7, "Wb9D4fMqsV5Z\n"

    const-string v8, "Pto3sodY2DA=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    const-string v7, "YOPwJAUP9mZo\n"

    const-string v8, "D5OEd3F9nwg=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_b

    const v0, 0x1708ad

    :goto_25
    const v5, 0x1708be

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_1f

    goto :goto_25

    :sswitch_4b
    const v0, 0x1708cc

    goto :goto_25

    :sswitch_4c
    const v0, 0x170850

    goto :goto_23

    :catchall_a
    move-exception v0

    const-string v0, "06ke\n"

    const-string v7, "p8h5VTpLcuY=\n"

    const-string v8, "aaxbdOzReWFVvndN6MhZ\n"

    const-string v9, "OtUoAIm8MQ4=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "tw==\n"

    const-string v10, "0vI8ySRxU5w=\n"

    invoke-static {v0, v7, v8, v9, v10}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_24

    :catchall_b
    move-exception v0

    const-string v0, "06ke\n"

    const-string v5, "p8h5VTpLcuY=\n"

    const-string v7, "iFxl9SOvD/K0TknLFY0J\n"

    const-string v8, "2yUWgUbCR50=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "tw==\n"

    const-string v9, "0vI8ySRxU5w=\n"

    invoke-static {v0, v5, v7, v8, v9}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :sswitch_4d
    new-instance v0, Lw50;

    const/4 v5, 0x0

    invoke-direct {v0, v5}, Lw50;-><init>(I)V

    const-string v5, "TXO02XE7LJtLcqU=\n"

    const-string v7, "PhbAlRBPRe8=\n"

    invoke-static {v5, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    const-string v5, "vjiEa7yw6Mi5KJRC\n"

    const-string v7, "zV3wJ9Pej6E=\n"

    invoke-static {v5, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    new-instance v0, Lv9;

    const/16 v5, 0x1b

    invoke-direct {v0, v5}, Lv9;-><init>(I)V

    const-string v5, "zm9mK/o8E5fcbnc=\n"

    const-string v7, "qQoSZ5tIeuM=\n"

    invoke-static {v5, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    const-string v5, "bYVUjuMiF79+lUSn\n"

    const-string v7, "CuAgwoxMcNY=\n"

    invoke-static {v5, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    const-class v0, Landroid/net/wifi/WifiManager;

    const-string v4, "fKgvmGnPZSl+vi6nft0=\n"

    const-string v5, "G81bywquC3s=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lv9;

    const/16 v7, 0x14

    invoke-direct {v5, v7}, Lv9;-><init>(I)V

    invoke-static {v0, v4, v5}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    new-instance v0, Lv9;

    const/16 v4, 0x1a

    invoke-direct {v0, v4}, Lv9;-><init>(I)V

    const-string v4, "mBg6ofoPeb6TEQeO8Aw=\n"

    const-string v5, "/31O4JZjOts=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    const-string v0, "EFSYAiMlxgIYUo01LybE\n"

    const-string v4, "dzHsQUZJqk4=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v4, Lv9;

    const/16 v5, 0x15

    invoke-direct {v4, v5}, Lv9;-><init>(I)V

    invoke-static {v3, v0, v4}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    new-instance v0, Lv9;

    const/16 v3, 0x19

    invoke-direct {v0, v3}, Lv9;-><init>(I)V

    const-class v3, Landroid/view/Window;

    const-string v4, "UJ1a2ipTsBJBjVr+LQ==\n"

    const-string v5, "I/gum14nwns=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    :try_start_12
    const-string v3, "kVQS47PfWbOGUxPm8uFU85RVAdy92Fz6lUg//Kza\n"

    const-string v4, "8Dp2kdy2PZ0=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v1}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v3

    const-string v4, "+x6hHndrjA==\n"

    const-string v5, "mnrFSB4O+4E=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    const-string v4, "DpOMf6SU5cMelKR/qZ7G3g==\n"

    const-string v5, "e+PoHtDxs6o=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_c

    const v0, 0x170929

    :goto_26
    const v3, 0x17093a

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_20

    goto :goto_26

    :sswitch_4e
    const v0, 0x170bd3

    goto :goto_26

    :catchall_c
    move-exception v0

    const-string v0, "06ke\n"

    const-string v3, "p8h5VTpLcuY=\n"

    const-string v4, "ZQvOUM9Rh3tZGeJz5w==\n"

    const-string v5, "NnK9JKo8zxQ=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "tw==\n"

    const-string v7, "0vI8ySRxU5w=\n"

    invoke-static {v0, v3, v4, v5, v7}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :sswitch_4f
    const-class v0, Landroid/hardware/SensorManager;

    const-string v3, "lsowrq6nCsioxiSzuL0KyA==\n"

    const-string v4, "5K9Xx93Tb7o=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lv9;

    const/16 v5, 0x16

    invoke-direct {v4, v5}, Lv9;-><init>(I)V

    invoke-static {v0, v3, v4}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    const-string v0, "Qwx1ZwTfgAhKA2NxHNeWQwwxaGYf04l1Rwxiehn7hUhDBXRnT+WBSFENY1Ad04pScxd0YA4=\n"

    const-string v3, "ImIRFWu25CY=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v0, v3}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v3

    const v0, 0x170c30

    :goto_27
    const v4, 0x170c41

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_21

    goto :goto_27

    :cond_c
    :sswitch_50
    const v0, 0x170c6e

    goto :goto_27

    :sswitch_51
    if-eqz v3, :cond_c

    const v0, 0x170c8d

    goto :goto_27

    :sswitch_52
    const-string v0, "n0112mPEjEuoQWjZbcKqVZ5Kcg==\n"

    const-string v4, "+yQGqgKw7yM=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x5

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v6, v4, v5

    const/4 v5, 0x1

    const-class v7, [F

    aput-object v7, v4, v5

    const/4 v5, 0x2

    aput-object v6, v4, v5

    const/4 v5, 0x3

    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v6, v4, v5

    const/4 v5, 0x4

    new-instance v6, Lv9;

    const/16 v7, 0x17

    invoke-direct {v6, v7}, Lv9;-><init>(I)V

    aput-object v6, v4, v5

    invoke-static {v3, v0, v4}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    :sswitch_53
    new-instance v3, Lv9;

    const/16 v0, 0x1c

    invoke-direct {v3, v0}, Lv9;-><init>(I)V

    :try_start_13
    const-string v0, "Yq/UfjSCNDN0pNJnMp9+Smaj5mU+nA==\n"

    const-string v4, "A8GwDFvrUB0=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v4

    const v0, 0x170cac

    :goto_28
    const v5, 0x170cbd

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_22

    goto :goto_28

    :sswitch_54
    if-eqz v4, :cond_d

    const v0, 0x170f94

    goto :goto_28

    :cond_d
    :sswitch_55
    const v0, 0x170cea

    goto :goto_28

    :sswitch_56
    const-string v0, "A3nI/4Wx9C0eaNnGlKDzJxJp28+JvdAHHn3exIW3\n"

    const-string v5, "cBy8qODTt0I=\n"

    invoke-static {v0, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0, v3}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_d

    const v0, 0x170fb3

    :goto_29
    const v4, 0x170fc4

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_23

    goto :goto_29

    :goto_2a
    :sswitch_57
    :try_start_14
    const-string v0, "UaZxO3zjejJXp2g7e+tgJRy6eH4m0XEzZKB5Yg==\n"

    const-string v4, "MskcFQiGFFE=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_e

    move-result-object v1

    const v0, 0x17102f

    :goto_2b
    const v4, 0x171040

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_24

    goto :goto_2b

    :cond_e
    :sswitch_58
    const v0, 0x17106d

    goto :goto_2b

    :sswitch_59
    const v0, 0x170fd2

    goto :goto_29

    :catchall_d
    move-exception v0

    const-string v0, "06ke\n"

    const-string v4, "p8h5VTpLcuY=\n"

    const-string v5, "GhwoSloQoJ0mDgRpWh++mywS\n"

    const-string v6, "SWVbPj996PI=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "tw==\n"

    const-string v7, "0vI8ySRxU5w=\n"

    invoke-static {v0, v4, v5, v6, v7}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2a

    :sswitch_5a
    if-eqz v1, :cond_e

    const v0, 0x17108c

    goto :goto_2b

    :sswitch_5b
    :try_start_15
    const-string v0, "PQLoA+8QFkYgE/k6/gERTCwS+zPjHDJsIAb+OO8W\n"

    const-string v4, "TmecVIpyVSk=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0, v3}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_e

    const v0, 0x1710ab

    :goto_2c
    const v1, 0x1710bc

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_25

    goto :goto_2c

    :sswitch_5c
    const v0, 0x171355

    goto :goto_2c

    :catchall_e
    move-exception v0

    const-string v0, "06ke\n"

    const-string v1, "p8h5VTpLcuY=\n"

    const-string v3, "UcqE9qvEO4xt2Kja+/4WgVTakvU=\n"

    const-string v4, "ArP3gs6pc+M=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "tw==\n"

    const-string v5, "0vI8ySRxU5w=\n"

    invoke-static {v0, v1, v3, v4, v5}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :sswitch_5d
    const-string v0, "npZ50Ak4OzmNgWw=\n"

    const-string v1, "+fMNmWdMfkE=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lv9;

    const/16 v3, 0x18

    invoke-direct {v1, v3}, Lv9;-><init>(I)V

    invoke-static {v2, v0, v1}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    const-string v0, "TV4gNM1CYEZLVREO1l9t\n"

    const-string v1, "KjtUdqItDCM=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lv9;

    const/16 v3, 0x11

    invoke-direct {v1, v3}, Lv9;-><init>(I)V

    invoke-static {v2, v0, v1}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    sget-object v0, Lxh;->n:Lxh;

    goto/16 :goto_5

    :pswitch_7
    sget-object v0, Liz;->a:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v0, p0, Lts;->b:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v1, "juqWMQ1kxKml4IMWBHef9Mehyw==\n"

    const-string v2, "6Y/icmEFt9o=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "nN3K/ECz\n"

    const-string v2, "8LKrmCXBRKc=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget-object v1, Lub0;->j:Ljava/lang/String;

    invoke-static {v1, v0}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    const v0, 0x1713b2

    :goto_2d
    const v2, 0x1713c3

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_26

    goto :goto_2d

    :cond_f
    :sswitch_5e
    const v0, 0x1713f0

    goto :goto_2d

    :sswitch_5f
    if-nez v1, :cond_f

    const v0, 0x17140f

    goto :goto_2d

    :sswitch_60
    const v0, 0x17142e

    :goto_2e
    const v1, 0x17143f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_27

    goto :goto_2e

    :sswitch_61
    const v0, 0x17144d

    goto :goto_2e

    :sswitch_62
    sget-object v0, Lub0;->k:Ljava/lang/String;

    new-instance v2, Lv9;

    const/16 v3, 0xe

    invoke-direct {v2, v3}, Lv9;-><init>(I)V

    invoke-static {v1, v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    :sswitch_63
    sget-object v0, Lxh;->n:Lxh;

    goto/16 :goto_5

    :pswitch_8
    iget-object v0, p0, Lts;->b:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    const-string v0, "6geRwl9uv/7BDYTlVn3ko6NMzA==\n"

    const-string v1, "jWLlgTMPzI0=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "F+8RGZqa\n"

    const-string v1, "e4Bwff/oSkE=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :try_start_16
    sget-object v0, Lub0;->a:Ljava/lang/String;

    const-string v0, "nRwRaHvc0cCENA==\n"

    const-string v1, "0X1kBhi0tLI=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "JkRf\n"

    const-string v3, "TSEm98BsBDQ=\n"

    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "haHe1O3QEpKciQ==\n"

    const-string v3, "ycCruo64d+A=\n"

    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0x171735

    :goto_2f
    const v3, 0x171746

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_28

    goto :goto_2f

    :cond_10
    :sswitch_64
    const v0, 0x171773

    goto :goto_2f

    :sswitch_65
    if-eqz v1, :cond_10

    const v0, 0x171792

    goto :goto_2f

    :sswitch_66
    const-string v0, "IPF4hxQO+Rcm8GGHDQa5ASqwWcgVBfQcJuxA4A==\n"

    const-string v1, "Q54VqWBrl3Q=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const v1, 0x1717b1

    :goto_30
    const v3, 0x1717c2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_29

    goto :goto_30

    :goto_31
    :sswitch_67
    const v1, 0x17182d

    :goto_32
    const v3, 0x17183e

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_2a

    goto :goto_32

    :sswitch_68
    if-nez v0, :cond_11

    const v1, 0x171b15

    goto :goto_32

    :sswitch_69
    const v1, 0x1717d0

    goto :goto_30

    :sswitch_6a
    const/4 v0, 0x0

    goto :goto_31

    :cond_11
    :sswitch_6b
    const v1, 0x171af6

    goto :goto_32

    :sswitch_6c
    const-string v0, "GnoZlnryjp8cewCWY/rOiRA7ONl7+YOUHGch8Q==\n"

    const-string v1, "eRV0uA6X4Pw=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :sswitch_6d
    const-string v1, "Nrk+GGLCcQM=\n"

    const-string v3, "WddsfRG3HGY=\n"

    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lv9;

    const/4 v4, 0x4

    invoke-direct {v3, v4}, Lv9;-><init>(I)V

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    invoke-static {v0, v2, v1, v4}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_f

    const v0, 0x171b34

    :goto_33
    const v1, 0x171b45

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_2b

    goto :goto_33

    :goto_34
    :sswitch_6e
    sget-object v0, Lxh;->n:Lxh;

    goto/16 :goto_5

    :sswitch_6f
    const v0, 0x171b53

    goto :goto_33

    :catchall_f
    move-exception v0

    const-string v0, "06ke\n"

    const-string v1, "p8h5VTpLcuY=\n"

    const-string v2, "3YcM6s4KMIr/jQ==\n"

    const-string v3, "kOZlhJtDeOU=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "tw==\n"

    const-string v4, "0vI8ySRxU5w=\n"

    invoke-static {v0, v1, v2, v3, v4}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_34

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_8
        0xb939 -> :sswitch_7
        0xb97b -> :sswitch_6
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_a
        0x1f7 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_b
        0x32 -> :sswitch_d
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_e
        0xf1 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_f
        0x6af -> :sswitch_11
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_12
        0x32 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_14
        0x35 -> :sswitch_18
        0xf3 -> :sswitch_15
        0xfeb -> :sswitch_16
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_17
        0x36 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_19
        0x11 -> :sswitch_1a
        0x2f -> :sswitch_1d
        0x4c -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_1c
        0x7ab -> :sswitch_21
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_1e
        0x36 -> :sswitch_1f
        0x55 -> :sswitch_24
        0x74 -> :sswitch_20
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_21
        0x3ef -> :sswitch_22
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_23
        0x32 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_26
        0x32 -> :sswitch_27
        0x4c -> :sswitch_28
        0x53 -> :sswitch_2f
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_29
        0x6a7 -> :sswitch_2a
        0x6c8 -> :sswitch_2d
        0x6e9 -> :sswitch_2b
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_2c
        0x32 -> :sswitch_25
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_2e
        0x32 -> :sswitch_25
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_30
        0x3e -> :sswitch_31
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_32
        0x36 -> :sswitch_33
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_34
        0x5bb -> :sswitch_35
        0x5d8 -> :sswitch_38
        0x5f9 -> :sswitch_36
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x1f -> :sswitch_37
        0x3e -> :sswitch_3a
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0x17 -> :sswitch_39
        0x36 -> :sswitch_3a
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0xe -> :sswitch_3b
        0x2d -> :sswitch_49
        0x6f -> :sswitch_3c
        0x1cc -> :sswitch_3d
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0x17 -> :sswitch_3f
        0x55 -> :sswitch_49
        0x76 -> :sswitch_40
        0xb4 -> :sswitch_41
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x1f -> :sswitch_42
        0x537 -> :sswitch_44
        0x5c8 -> :sswitch_3e
        0x5e9 -> :sswitch_43
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0x11 -> :sswitch_45
        0x53 -> :sswitch_3e
        0x72 -> :sswitch_46
        0x1b4 -> :sswitch_47
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x11 -> :sswitch_48
        0x72 -> :sswitch_3e
    .end sparse-switch

    :sswitch_data_1e
    .sparse-switch
        0x12 -> :sswitch_4a
        0x73 -> :sswitch_4c
    .end sparse-switch

    :sswitch_data_1f
    .sparse-switch
        0x13 -> :sswitch_4b
        0x72 -> :sswitch_4d
    .end sparse-switch

    :sswitch_data_20
    .sparse-switch
        0x13 -> :sswitch_4e
        0x2e9 -> :sswitch_4f
    .end sparse-switch

    :sswitch_data_21
    .sparse-switch
        0xe -> :sswitch_50
        0x2f -> :sswitch_53
        0x71 -> :sswitch_51
        0xcc -> :sswitch_52
    .end sparse-switch

    :sswitch_data_22
    .sparse-switch
        0x11 -> :sswitch_54
        0x57 -> :sswitch_57
        0x76 -> :sswitch_55
        0x329 -> :sswitch_56
    .end sparse-switch

    :sswitch_data_23
    .sparse-switch
        0x16 -> :sswitch_57
        0x77 -> :sswitch_59
    .end sparse-switch

    :sswitch_data_24
    .sparse-switch
        0xe -> :sswitch_58
        0x2d -> :sswitch_5d
        0x6f -> :sswitch_5a
        0xcc -> :sswitch_5b
    .end sparse-switch

    :sswitch_data_25
    .sparse-switch
        0x17 -> :sswitch_5c
        0x3e9 -> :sswitch_5d
    .end sparse-switch

    :sswitch_data_26
    .sparse-switch
        0x12 -> :sswitch_5e
        0x33 -> :sswitch_62
        0x71 -> :sswitch_5f
        0x7cc -> :sswitch_60
    .end sparse-switch

    :sswitch_data_27
    .sparse-switch
        0x11 -> :sswitch_61
        0x72 -> :sswitch_63
    .end sparse-switch

    :sswitch_data_28
    .sparse-switch
        0x12 -> :sswitch_64
        0x35 -> :sswitch_6a
        0x73 -> :sswitch_65
        0xd4 -> :sswitch_66
    .end sparse-switch

    :sswitch_data_29
    .sparse-switch
        0x12 -> :sswitch_67
        0x73 -> :sswitch_69
    .end sparse-switch

    :sswitch_data_2a
    .sparse-switch
        0x13 -> :sswitch_68
        0x2c8 -> :sswitch_6d
        0x2e9 -> :sswitch_6b
        0x32b -> :sswitch_6c
    .end sparse-switch

    :sswitch_data_2b
    .sparse-switch
        0x16 -> :sswitch_6e
        0x71 -> :sswitch_6f
    .end sparse-switch
.end method
