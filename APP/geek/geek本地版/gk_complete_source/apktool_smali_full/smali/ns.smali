.class public final synthetic Lns;
.super Ljava/lang/Object;

# interfaces
.implements Lhm;


# instance fields
.field public final a:I

.field public final b:Landroid/app/Application;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Application;I)V
    .locals 3

    iput p2, p0, Lns;->a:I

    iput-object p1, p0, Lns;->b:Landroid/app/Application;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e0\u06e3\u06e4"

    invoke-static {v1}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v0, "\u06df\u06e5\u06df"

    :goto_1
    invoke-static {v0}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    move-result v0

    if-gtz v0, :cond_1

    sget v0, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    add-int/lit16 v2, v2, 0x2647

    add-int/2addr v0, v2

    if-gtz v0, :cond_0

    const/16 v0, 0x3e

    sput v0, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    const-string v0, "\u06e1\u06e2"

    goto :goto_1

    :cond_0
    const-string v0, "\u06e3\u06e3"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    const-string v0, "wXm"

    invoke-static {v0}, Landroidx/fragment/app/۟ۧۡۦ;->ۣۣ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget v1, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v2, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    add-int/2addr v1, v2

    const v2, 0xde80

    add-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :cond_1
    :sswitch_3
    sget v0, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v2, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    add-int/lit16 v2, v2, -0x769

    div-int/2addr v0, v2

    if-eqz v0, :cond_2

    const/16 v0, 0x12

    sput v0, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    const-string v0, "\u06e5\u06e4\u06e4"

    :goto_2
    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06df\u06e5\u06df"

    goto :goto_2

    :sswitch_4
    sget v0, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sub-int/2addr v0, v2

    const v2, 0x1aab41

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc21 -> :sswitch_0
        0xdc60 -> :sswitch_2
        0x1aa7b9 -> :sswitch_5
        0x1aab41 -> :sswitch_1
        0x1ab646 -> :sswitch_3
        0x1ac96b -> :sswitch_4
    .end sparse-switch
.end method

.method private final b()Ljava/lang/Object;
    .locals 30

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v18, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v22, 0x0

    const/4 v14, 0x0

    const/4 v13, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v7, 0x0

    const/4 v5, 0x0

    const/16 v25, 0x0

    const/16 v24, 0x0

    const/4 v4, 0x0

    const-string v15, "\u06e7\u06e8"

    invoke-static {v15}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v28

    move-object v15, v3

    move-object/from16 v16, v6

    move-object/from16 v17, v10

    :goto_0
    sparse-switch v28, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v6, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    div-int/lit16 v6, v6, 0xb99

    mul-int/2addr v3, v6

    if-eqz v3, :cond_1

    const/16 v3, 0x54

    sput v3, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    const-string v3, "\u06e1\u06e1\u06e3"

    :goto_1
    invoke-static {v3}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto :goto_0

    :sswitch_1
    :try_start_0
    const-string v3, "JqlVhZrI57U2rn2Fl8LEqA==\n"

    const-string v6, "U9kx5O6tsdw=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v11, v3, v12}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    sget v3, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v6, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    rem-int/2addr v3, v6

    const v6, 0x1ac0b2

    xor-int/2addr v3, v6

    move/from16 v28, v3

    goto :goto_0

    :sswitch_2
    :try_start_1
    const-string v3, "8Y7TX7FHJbT7\n"

    const-string v6, "nv6nG94yR9g=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v22

    invoke-static {v15, v3, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    move-result v3

    if-gtz v3, :cond_0

    const/16 v3, 0x4b

    sput v3, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    const-string v3, "\u06e6\u06e4\u06e0"

    invoke-static {v3}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto :goto_0

    :cond_0
    sget v3, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v6, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sub-int/2addr v3, v6

    const v6, 0x1abc53

    xor-int/2addr v3, v6

    move/from16 v28, v3

    goto :goto_0

    :sswitch_3
    sget-object v3, Lq50;->a:Landroid/util/SparseIntArray;

    move-object/from16 v0, p0

    iget-object v3, v0, Lns;->b:Landroid/app/Application;

    invoke-virtual {v3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    const-string v3, "5bZQ4SVx49DOvEXGLGK4jaz9DQ==\n"

    const-string v10, "gtMkokkQkKM=\n"

    invoke-static {v3, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v6}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-class v3, Lorg/json/JSONObject;

    sget v10, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v15, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    add-int/2addr v10, v15

    const v15, 0x1acac1

    xor-int/2addr v10, v15

    move-object v15, v3

    move-object/from16 v16, v6

    move/from16 v28, v10

    goto/16 :goto_0

    :cond_1
    const-string v3, "\u06e1\u06df\u06e7"

    :goto_2
    invoke-static {v3}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_4
    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    move-result v3

    if-ltz v3, :cond_2

    const-string v3, "\u06e5\u06e8\u06e7"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_2
    sget v3, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v6, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    mul-int/2addr v3, v6

    const v6, 0x19f000

    add-int/2addr v3, v6

    move/from16 v28, v3

    goto/16 :goto_0

    :catchall_0
    move-exception v3

    const-string v3, "Nwje\n"

    const-string v6, "Q2m5jaPP2Zc=\n"

    const-string v10, "YqUkZXiZdR9etwhJKKNYEme1MmY=\n"

    const-string v28, "MdxXER30PXA=\n"

    move-object/from16 v0, v28

    invoke-static {v10, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v28, "Fg==\n"

    const-string v29, "c8HJlSTQVfc=\n"

    move-object/from16 v0, v28

    move-object/from16 v1, v29

    invoke-static {v3, v6, v10, v0, v1}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Landroidx/core/content/ۥۨۤۦ;->۟۠۠۠ۥ()I

    move-result v3

    if-ltz v3, :cond_3

    :goto_3
    const-string v3, "\u06e0\u06e2"

    invoke-static {v3}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_3
    sget v3, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v6, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sub-int/2addr v3, v6

    const v6, 0x1ab353

    add-int/2addr v3, v6

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_5
    :try_start_2
    const-string v3, "+Y8RrOe5QjjkngCV9qhFMuifApzrtWYS5IsHl+e/\n"

    const-string v6, "iupl+4LbAVc=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v24

    invoke-static {v0, v3, v5}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_4
    const-string v3, "\u06e0\u06e3\u06e0"

    invoke-static {v3}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_6
    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    move-result v3

    if-gtz v3, :cond_4

    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    const-string v3, "\u06e8\u06e7\u06e5"

    invoke-static {v3}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_4
    sget v3, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v6, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sub-int/2addr v3, v6

    const v6, 0x1aa6be

    xor-int/2addr v3, v6

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_7
    :try_start_3
    const-string v3, "HmE0tnrmEMEJZjWzO9gdgRtgJ4l04RWIGn0ZqWXj\n"

    const-string v6, "fw9QxBWPdO8=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v16

    invoke-static {v3, v0}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result-object v3

    sget v6, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    if-ltz v6, :cond_15

    const-string v6, "\u06e8\u06e4\u06e8"

    invoke-static {v6}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v6

    move-object v11, v3

    move/from16 v28, v6

    goto/16 :goto_0

    :sswitch_8
    :try_start_4
    const-string v3, "pQuI2q4w\n"

    const-string v6, "12rmvsFdX0g=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v6, Lk9;

    const/16 v10, 0x18

    invoke-direct {v6, v10}, Lk9;-><init>(I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    sget v10, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    if-gtz v10, :cond_5

    const-string v10, "\u06e8\u06e2\u06e2"

    invoke-static {v10}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v10

    move-object/from16 v26, v3

    move-object/from16 v27, v6

    move/from16 v28, v10

    goto/16 :goto_0

    :cond_5
    sget v10, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v26, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    xor-int v10, v10, v26

    const v26, -0x1aacb6

    xor-int v10, v10, v26

    move-object/from16 v26, v3

    move-object/from16 v27, v6

    move/from16 v28, v10

    goto/16 :goto_0

    :sswitch_9
    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v6, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    xor-int/lit16 v6, v6, -0xea5

    div-int/2addr v3, v6

    if-eqz v3, :cond_6

    const-string v3, "\u06df\u06e4\u06df"

    invoke-static {v3}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_6
    sget v3, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v6, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    xor-int/2addr v3, v6

    const v6, 0x1ab74d

    add-int/2addr v3, v6

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_a
    const-class v3, Landroid/view/Window;

    const-string v6, "H2HmnFbiY50Ocea4UQ==\n"

    const-string v10, "bASS3SKWEfQ=\n"

    invoke-static {v6, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6, v12}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    sget v3, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v6, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    xor-int/lit16 v6, v6, 0x5ba

    xor-int/2addr v3, v6

    if-ltz v3, :cond_7

    const/16 v3, 0x29

    sput v3, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    const-string v3, "\u06e6\u06e4\u06e6"

    invoke-static {v3}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_7
    sget v3, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v6, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    rem-int/2addr v3, v6

    const v6, 0x1abc9d

    add-int/2addr v3, v6

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_b
    const-string v3, "j0tsZdovu6qcXHk=\n"

    const-string v4, "6C4YLLRb/tI=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v6, Lk9;

    const/16 v3, 0x1d

    invoke-direct {v6, v3}, Lk9;-><init>(I)V

    const-class v3, Landroid/content/Intent;

    invoke-static {v3, v4, v6}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    sget v4, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v6, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    add-int/lit16 v6, v6, -0x1c5

    div-int/2addr v4, v6

    if-gtz v4, :cond_8

    const-string v4, "\u06e2\u06e3\u06e7"

    move-object v6, v4

    :goto_5
    invoke-static {v6}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v6

    move-object v4, v3

    move/from16 v28, v6

    goto/16 :goto_0

    :cond_8
    sget v4, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v6, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    xor-int/2addr v4, v6

    const v6, 0xdc07

    add-int/2addr v6, v4

    move-object v4, v3

    move/from16 v28, v6

    goto/16 :goto_0

    :sswitch_c
    sget v3, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v6, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    or-int/lit16 v6, v6, 0x24e0

    or-int/2addr v3, v6

    if-ltz v3, :cond_9

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    const-string v3, "\u06e6\u06e5\u06e0"

    :goto_6
    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06e0\u06e1\u06df"

    goto :goto_6

    :sswitch_d
    const-string v3, "jIjPVvKd2IKLmN9/\n"

    const-string v6, "/+27Gp3zv+s=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v13, v3, v14}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    new-instance v3, Lp50;

    const/4 v6, 0x2

    invoke-direct {v3, v6}, Lp50;-><init>(I)V

    const-string v6, "vzQFlbhjEhytNRQ=\n"

    const-string v10, "2FFx2dkXe2g=\n"

    invoke-static {v6, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v13, v6, v3}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    const-string v6, "DHNV2sCEjQQfY0Xz\n"

    const-string v10, "axYhlq/q6m0=\n"

    invoke-static {v6, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v13, v6, v3}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    sget v3, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v6, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    add-int/lit16 v6, v6, -0x1f5c

    or-int/2addr v3, v6

    if-ltz v3, :cond_b

    const/16 v3, 0x19

    sput v3, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    move-object v3, v7

    :cond_a
    const-string v6, "\u06e1\u06e7\u06e3"

    invoke-static {v6}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v6

    move-object v7, v3

    move/from16 v28, v6

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06e2\u06e1\u06e1"

    :goto_7
    invoke-static {v3}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_e
    const/4 v3, 0x5

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v18, v3, v6

    const/4 v6, 0x1

    const-class v10, [F

    aput-object v10, v3, v6

    const/4 v6, 0x2

    aput-object v18, v3, v6

    const/4 v6, 0x3

    sget-object v10, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v10, v3, v6

    const/4 v6, 0x4

    aput-object v7, v3, v6

    invoke-static {v8, v9, v3}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    sget v3, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v6, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    div-int/lit16 v6, v6, 0x18fe

    xor-int/2addr v3, v6

    if-gtz v3, :cond_c

    const/16 v3, 0x4f

    sput v3, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    const-string v3, "\u06e5\u06e7\u06e4"

    invoke-static {v3}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e8\u06e4\u06e8"

    invoke-static {v3}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_f
    const-string v3, "\u06df\u06e0\u06e1"

    :goto_8
    invoke-static {v3}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_10
    new-instance v6, Lp50;

    const/4 v3, 0x5

    invoke-direct {v6, v3}, Lp50;-><init>(I)V

    const-string v3, "IBD33vgLg4ImEeY=\n"

    const-string v10, "U3WDkpl/6vY=\n"

    invoke-static {v3, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-class v3, Landroid/location/Location;

    invoke-static {v3, v10, v6}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    move-result v10

    if-ltz v10, :cond_1b

    const/4 v10, 0x7

    sput v10, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    const-string v10, "\u06df\u06e5\u06e2"

    invoke-static {v10}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v10

    move-object v13, v3

    move-object v14, v6

    move/from16 v28, v10

    goto/16 :goto_0

    :sswitch_11
    const-string v3, "\u06e0\u06df\u06df"

    goto/16 :goto_2

    :sswitch_12
    :try_start_5
    const-string v3, "yqi/1hfuQhLI\n"

    const-string v6, "rc3LknibIH4=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v22

    invoke-static {v15, v3, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    sget v3, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v6, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    add-int/lit16 v6, v6, -0x525

    add-int/2addr v3, v6

    if-ltz v3, :cond_d

    const-string v3, "\u06e7\u06e5\u06e0"

    invoke-static {v3}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_d
    sget v3, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v6, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    div-int/2addr v3, v6

    const v6, 0x1ac8cb

    add-int/2addr v3, v6

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_13
    const-string v3, "u/hxo3rdHHS980CZYcAR\n"

    const-string v6, "3J0F4RWycBE=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v6, Lk9;

    const/16 v10, 0x16

    invoke-direct {v6, v10}, Lk9;-><init>(I)V

    invoke-static {v4, v3, v6}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    move-result v3

    if-ltz v3, :cond_e

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    const-string v3, "\u06e0\u06df\u06df"

    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_e
    sget v3, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v6, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    or-int/2addr v3, v6

    const v6, -0x1ac508

    xor-int/2addr v3, v6

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_14
    :try_start_6
    const-string v3, "VZ8Cs8t7o/pTnhuzzHO57RiDC/aRSaj7YJkK6g==\n"

    const-string v6, "NvBvnb8ezZk=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v16

    invoke-static {v3, v0}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-result-object v3

    sget v6, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v10, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    or-int/lit16 v10, v10, 0xc8b

    add-int/2addr v6, v10

    if-gtz v6, :cond_f

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    const-string v6, "\u06e4\u06e5\u06e6"

    invoke-static {v6}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v24, v3

    move/from16 v28, v6

    goto/16 :goto_0

    :cond_f
    sget v6, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v10, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    rem-int/2addr v6, v10

    const v10, -0x1aa72d

    xor-int/2addr v6, v10

    move-object/from16 v24, v3

    move/from16 v28, v6

    goto/16 :goto_0

    :sswitch_15
    move-object v3, v8

    :cond_10
    sget v6, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v8, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    xor-int/2addr v6, v8

    const v8, -0x1ac928

    xor-int/2addr v6, v8

    move-object v8, v3

    move/from16 v28, v6

    goto/16 :goto_0

    :sswitch_16
    :try_start_7
    const-string v3, "P1fNW9jAAKo3\n"

    const-string v6, "UCe5CKyyacQ=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v22

    invoke-static {v15, v3, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    move-result v3

    if-ltz v3, :cond_11

    const/16 v3, 0x30

    sput v3, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    const-string v3, "\u06e8\u06e6\u06e1"

    invoke-static {v3}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_11
    sget v3, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v6, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    or-int/2addr v3, v6

    const v6, -0x1aaf94

    xor-int/2addr v3, v6

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_17
    sget v3, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v6, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    rem-int/2addr v3, v6

    const v6, 0x1ac997

    add-int/2addr v3, v6

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_18
    sget v3, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v6, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    xor-int/2addr v3, v6

    const v6, 0x1abfb2

    add-int/2addr v3, v6

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_19
    const-string v6, "\u06e8\u06e0\u06e6"

    move-object v3, v4

    goto/16 :goto_5

    :sswitch_1a
    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    move-result v3

    if-gtz v3, :cond_12

    const/16 v3, 0x30

    sput v3, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    const-string v3, "\u06df\u06e3\u06e2"

    :goto_9
    invoke-static {v3}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_12
    const-string v3, "\u06e6\u06e4\u06e6"

    invoke-static {v3}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_1b
    :try_start_8
    const-string v3, "0J4Yp4Yiaw==\n"

    const-string v6, "sfp88e9HHPk=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v11, v3, v12}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    invoke-static {}, Landroidx/savedstate/۠ۡۢ۠;->ۣ۟ۨۤۨ()I

    move-result v3

    if-gtz v3, :cond_13

    invoke-static {}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۥۧۧ()I

    const-string v3, "\u06e1\u06e3\u06e4"

    move-object v6, v9

    move-object v10, v3

    :goto_a
    invoke-static {v10}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v3

    move-object v9, v6

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_13
    sget v3, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v6, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    xor-int/2addr v3, v6

    const v6, -0x1acb93

    xor-int/2addr v3, v6

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_1c
    :try_start_9
    const-string v3, "jOdvVOyEovKM\n"

    const-string v6, "64IbB5j2y5w=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v22

    invoke-static {v15, v3, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    const-string v3, "\u06e1\u06e0\u06df"

    goto/16 :goto_1

    :sswitch_1d
    :try_start_a
    const-string v3, "E8c6nFiYEnsO1iulSYkVcQLXKaxUlDZRDsMsp1ie\n"

    const-string v6, "YKJOyz36URQ=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v25

    invoke-static {v0, v3, v5}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    sget v3, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    if-gtz v3, :cond_14

    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    goto/16 :goto_4

    :cond_14
    const-string v3, "\u06df\u06e0\u06e1"

    goto :goto_9

    :sswitch_1e
    new-instance v5, Lp50;

    const/4 v3, 0x3

    invoke-direct {v5, v3}, Lp50;-><init>(I)V

    sget v3, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v6, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    mul-int/lit16 v6, v6, -0x17aa

    div-int/2addr v3, v6

    if-eqz v3, :cond_16

    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    move-object v3, v11

    :cond_15
    const-string v6, "\u06e3\u06e5"

    invoke-static {v6}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v6

    move-object v11, v3

    move/from16 v28, v6

    goto/16 :goto_0

    :cond_16
    const-string v6, "\u06e0\u06e1\u06df"

    move-object v3, v4

    goto/16 :goto_5

    :sswitch_1f
    const-class v3, Ljava/util/Random;

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object v18, v6, v10

    const/4 v10, 0x1

    aput-object v23, v6, v10

    move-object/from16 v0, v21

    invoke-static {v3, v0, v6}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    sget v3, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    if-gtz v3, :cond_17

    const-string v3, "\u06e3\u06e7\u06e2"

    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_17
    const-string v3, "\u06e4\u06e5\u06e1"

    invoke-static {v3}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_18
    :sswitch_20
    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v6, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    add-int/lit16 v6, v6, 0x1fd7

    or-int/2addr v3, v6

    if-gtz v3, :cond_19

    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    const-string v6, "\u06df\u06e2\u06e2"

    move-object v3, v12

    :goto_b
    invoke-static {v6}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v6

    move-object v12, v3

    move/from16 v28, v6

    goto/16 :goto_0

    :cond_19
    const-string v3, "\u06e7\u06e5\u06e0"

    goto/16 :goto_9

    :sswitch_21
    move-object/from16 v0, v17

    move-object/from16 v1, v20

    move-object/from16 v2, v19

    invoke-static {v0, v1, v2}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    const-string v3, "fc/mtEMtWKZ1yfODTy5a\n"

    const-string v6, "GqqS9yZBNOo=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v6, Lk9;

    const/16 v10, 0x1a

    invoke-direct {v6, v10}, Lk9;-><init>(I)V

    move-object/from16 v0, v17

    invoke-static {v0, v3, v6}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    new-instance v3, Lp50;

    const/4 v6, 0x0

    invoke-direct {v3, v6}, Lp50;-><init>(I)V

    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    move-result v6

    if-gtz v6, :cond_1a

    const-string v6, "\u06e3\u06e4\u06e7"

    invoke-static {v6}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v6

    move-object v12, v3

    move/from16 v28, v6

    goto/16 :goto_0

    :cond_1a
    const-string v6, "\u06e7\u06e3\u06df"

    goto :goto_b

    :sswitch_22
    :try_start_b
    const-class v3, Ljava/lang/Math;

    move-object/from16 v0, v26

    move-object/from16 v1, v27

    invoke-static {v3, v0, v1}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    sget v3, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v6, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    add-int/lit16 v6, v6, 0x512

    add-int/2addr v3, v6

    if-gtz v3, :cond_22

    const/16 v3, 0x20

    sput v3, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    move-object v3, v13

    move-object v6, v14

    :cond_1b
    const-string v10, "\u06e6\u06e4\u06e8"

    :goto_c
    invoke-static {v10}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v10

    move-object v13, v3

    move-object v14, v6

    move/from16 v28, v10

    goto/16 :goto_0

    :sswitch_23
    if-eqz v24, :cond_24

    sget v3, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    if-gtz v3, :cond_1c

    const/16 v3, 0x14

    sput v3, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    const-string v3, "\u06e7\u06e3\u06df"

    invoke-static {v3}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_1c
    const-string v3, "\u06e7\u06e5\u06e5"

    invoke-static {v3}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_24
    sget v3, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v6, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    or-int/lit16 v6, v6, -0xb59

    or-int/2addr v3, v6

    if-ltz v3, :cond_1d

    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    const-string v3, "\u06e5\u06e3\u06e6"

    goto/16 :goto_8

    :cond_1d
    sget v3, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v6, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    div-int/2addr v3, v6

    const v6, 0x1aba80

    xor-int/2addr v3, v6

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_25
    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    move-result v3

    if-gtz v3, :cond_1e

    const/16 v3, 0x37

    sput v3, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    const-string v3, "\u06e2\u06df"

    :goto_d
    invoke-static {v3}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_1e
    const-string v3, "\u06e0\u06e3\u06e0"

    goto/16 :goto_1

    :sswitch_26
    const-string v3, "TO7Yomx6\n"

    const-string v6, "IIG5xgkIYUU=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v3, "wnGJCCoZ5w==\n"

    const-string v6, "rBTxfGN3k3s=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-instance v10, Lk9;

    const/16 v3, 0x17

    invoke-direct {v10, v3}, Lk9;-><init>(I)V

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    sget v18, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v21, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    xor-int v18, v18, v21

    const v21, -0x1acbbc

    xor-int v28, v18, v21

    move-object/from16 v18, v3

    move-object/from16 v21, v6

    move-object/from16 v23, v10

    goto/16 :goto_0

    :sswitch_27
    sget v3, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v6, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sub-int/2addr v3, v6

    const v6, 0x1ab46b

    add-int/2addr v3, v6

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_28
    :try_start_c
    const-string v3, "T4RjVQI7TXtZj2VMBCYHAkuIUU4IJQ==\n"

    const-string v6, "LuoHJ21SKVU=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v16

    invoke-static {v3, v0}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    move-result-object v3

    sget v6, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v10, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    xor-int/2addr v6, v10

    const v10, 0x1aaee3

    add-int/2addr v6, v10

    move-object/from16 v25, v3

    move/from16 v28, v6

    goto/16 :goto_0

    :sswitch_29
    if-eqz v25, :cond_18

    sget v3, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v6, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    or-int/2addr v3, v6

    const v6, 0x1abf05

    add-int/2addr v3, v6

    move/from16 v28, v3

    goto/16 :goto_0

    :catchall_1
    move-exception v3

    const-string v3, "Nwje\n"

    const-string v6, "Q2m5jaPP2Zc=\n"

    const-string v10, "L2G5vXDRQZcTc5WeWA==\n"

    const-string v28, "fBjKyRW8Cfg=\n"

    move-object/from16 v0, v28

    invoke-static {v10, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v28, "Fg==\n"

    const-string v29, "c8HJlSTQVfc=\n"

    move-object/from16 v0, v28

    move-object/from16 v1, v29

    invoke-static {v3, v6, v10, v0, v1}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v10, "\u06e8\u06e5\u06df"

    move-object v3, v13

    move-object v6, v14

    goto/16 :goto_c

    :catchall_2
    move-exception v3

    const-string v3, "Nwje\n"

    const-string v6, "Q2m5jaPP2Zc=\n"

    const-string v10, "6c44+fUDajXV3BTa9Qx0M9/A\n"

    const-string v28, "urdLjZBuIlo=\n"

    move-object/from16 v0, v28

    invoke-static {v10, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v28, "Fg==\n"

    const-string v29, "c8HJlSTQVfc=\n"

    move-object/from16 v0, v28

    move-object/from16 v1, v29

    invoke-static {v3, v6, v10, v0, v1}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget v3, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v6, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    or-int/2addr v3, v6

    const v6, 0x1aa7ff

    add-int/2addr v3, v6

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_2a
    const-class v3, Landroid/hardware/SensorManager;

    const-string v6, "lw9GJ/gy4fqpA1I67ijh+g==\n"

    const-string v8, "5WohTotGhIg=\n"

    invoke-static {v6, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-instance v8, Lk9;

    const/16 v10, 0x1b

    invoke-direct {v8, v10}, Lk9;-><init>(I)V

    invoke-static {v3, v6, v8}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    const-string v3, "TMNMSpSf/sFFzFpcjJfoigP+UUuPk/e8SMNbV4m7+4FMyk1K36X/gV7CWn2Nk/SbfNhNTZ4=\n"

    const-string v6, "La0oOPv2mu8=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    invoke-static {v3, v6}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v3

    if-eqz v3, :cond_10

    const-string v6, "x7EcyjXWI5HwvQHJO9AFj8a2Gw==\n"

    const-string v8, "o9hvulSiQPk=\n"

    invoke-static {v6, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    sget v8, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    if-ltz v8, :cond_1f

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    const-string v8, "\u06df\u06e0\u06e1"

    invoke-static {v8}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v10

    move-object v8, v3

    move-object v9, v6

    move/from16 v28, v10

    goto/16 :goto_0

    :cond_1f
    const-string v9, "\u06e5\u06e5\u06e0"

    move-object v8, v3

    move-object v10, v9

    goto/16 :goto_a

    :sswitch_2b
    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    if-gtz v3, :cond_20

    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    const-string v3, "\u06e2\u06e2\u06e6"

    invoke-static {v3}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_20
    const-string v3, "\u06e4\u06e5\u06e6"

    goto/16 :goto_8

    :sswitch_2c
    sget v3, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v6, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    add-int/lit16 v6, v6, -0xc65

    sub-int/2addr v3, v6

    if-gtz v3, :cond_21

    const-string v3, "\u06e0\u06e5\u06e0"

    goto/16 :goto_2

    :cond_21
    const-string v3, "\u06e4\u06df\u06e1"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :catchall_3
    move-exception v3

    const-string v3, "Nwje\n"

    const-string v6, "Q2m5jaPP2Zc=\n"

    const-string v10, "82xUF/ta4RXPfngu/0PB\n"

    const-string v28, "oBUnY543qXo=\n"

    move-object/from16 v0, v28

    invoke-static {v10, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v28, "Fg==\n"

    const-string v29, "c8HJlSTQVfc=\n"

    move-object/from16 v0, v28

    move-object/from16 v1, v29

    invoke-static {v3, v6, v10, v0, v1}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget v3, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v6, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    div-int/2addr v3, v6

    const v6, 0x1aaf98

    xor-int/2addr v3, v6

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_2d
    sget v3, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v6, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    div-int/lit16 v6, v6, -0xfa7

    xor-int/2addr v3, v6

    if-ltz v3, :cond_23

    const/16 v3, 0x2f

    sput v3, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    :cond_22
    const-string v3, "\u06e4\u06df\u06e1"

    goto/16 :goto_7

    :cond_23
    const-string v3, "\u06e6\u06e4\u06e0"

    goto/16 :goto_2

    :sswitch_2e
    new-instance v3, Lk9;

    const/16 v6, 0x1c

    invoke-direct {v3, v6}, Lk9;-><init>(I)V

    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    move-result v6

    if-gtz v6, :cond_a

    const-string v6, "\u06e7\u06e8"

    invoke-static {v6}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v6

    move-object v7, v3

    move/from16 v28, v6

    goto/16 :goto_0

    :catchall_4
    move-exception v3

    const-string v3, "Nwje\n"

    const-string v6, "Q2m5jaPP2Zc=\n"

    const-string v10, "f12C0ChNFKhDT67uHm8S\n"

    const-string v28, "LCTxpE0gXMc=\n"

    move-object/from16 v0, v28

    invoke-static {v10, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v28, "Fg==\n"

    const-string v29, "c8HJlSTQVfc=\n"

    move-object/from16 v0, v28

    move-object/from16 v1, v29

    invoke-static {v3, v6, v10, v0, v1}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_3

    :sswitch_2f
    sget v3, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v6, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    xor-int/2addr v3, v6

    const v6, 0xd988

    add-int/2addr v3, v6

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_24
    :sswitch_30
    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v6, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    add-int/lit16 v6, v6, -0xf71

    xor-int/2addr v3, v6

    if-ltz v3, :cond_25

    const-string v3, "\u06e7\u06e0\u06e3"

    invoke-static {v3}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_25
    const-string v3, "\u06e4\u06e0\u06e2"

    goto/16 :goto_d

    :sswitch_31
    new-instance v3, Lp50;

    const/4 v6, 0x4

    invoke-direct {v3, v6}, Lp50;-><init>(I)V

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۣۡۧۢ()I

    move-result v6

    if-gtz v6, :cond_26

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    const-string v6, "\u06e2\u06e7\u06df"

    invoke-static {v6}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v22, v3

    move/from16 v28, v6

    goto/16 :goto_0

    :cond_26
    sget v6, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v10, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    div-int/2addr v6, v10

    const v10, 0x1ac928

    add-int/2addr v6, v10

    move-object/from16 v22, v3

    move/from16 v28, v6

    goto/16 :goto_0

    :sswitch_32
    const-class v3, Landroid/net/wifi/WifiManager;

    const-string v6, "JwoqX6gnkkolHCtgvzU=\n"

    const-string v10, "QG9eDMtG/Bg=\n"

    invoke-static {v6, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-instance v10, Lk9;

    const/16 v17, 0x19

    move/from16 v0, v17

    invoke-direct {v10, v0}, Lk9;-><init>(I)V

    invoke-static {v3, v6, v10}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    new-instance v6, Lp50;

    const/4 v3, 0x1

    invoke-direct {v6, v3}, Lp50;-><init>(I)V

    const-string v3, "H0JQl6WbORIUS224r5g=\n"

    const-string v10, "eCck1sn3enc=\n"

    invoke-static {v3, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-class v3, Landroid/telephony/TelephonyManager;

    sget v17, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v19, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sub-int v17, v17, v19

    const v19, 0x1aba81

    add-int v28, v17, v19

    move-object/from16 v17, v3

    move-object/from16 v19, v6

    move-object/from16 v20, v10

    goto/16 :goto_0

    :sswitch_33
    sget-object v3, Lvh;->n:Lvh;

    return-object v3

    :sswitch_data_0
    .sparse-switch
        0xdc02 -> :sswitch_0
        0xdc46 -> :sswitch_17
        0xdc5d -> :sswitch_13
        0xdc62 -> :sswitch_1b
        0xdce1 -> :sswitch_3
        0x1aa720 -> :sswitch_2d
        0x1aa7bc -> :sswitch_23
        0x1aa7e0 -> :sswitch_2a
        0x1aa7fe -> :sswitch_20
        0x1aaac0 -> :sswitch_31
        0x1aaafe -> :sswitch_28
        0x1aab3d -> :sswitch_18
        0x1aab3f -> :sswitch_1a
        0x1aae89 -> :sswitch_10
        0x1aaea0 -> :sswitch_16
        0x1aaea2 -> :sswitch_f
        0x1aaefe -> :sswitch_29
        0x1aaf02 -> :sswitch_22
        0x1aaf1f -> :sswitch_4
        0x1aaf7d -> :sswitch_e
        0x1aaf98 -> :sswitch_11
        0x1ab282 -> :sswitch_32
        0x1ab2a6 -> :sswitch_9
        0x1ab2c6 -> :sswitch_0
        0x1ab33a -> :sswitch_27
        0x1ab35b -> :sswitch_30
        0x1ab661 -> :sswitch_24
        0x1ab6a6 -> :sswitch_2f
        0x1ab6fe -> :sswitch_c
        0x1ab9c6 -> :sswitch_19
        0x1ab9e6 -> :sswitch_b
        0x1aba80 -> :sswitch_8
        0x1aba85 -> :sswitch_6
        0x1abaa2 -> :sswitch_7
        0x1abdad -> :sswitch_21
        0x1abe04 -> :sswitch_1d
        0x1abe22 -> :sswitch_1c
        0x1abe40 -> :sswitch_2e
        0x1abe82 -> :sswitch_30
        0x1abea4 -> :sswitch_25
        0x1ac1e2 -> :sswitch_20
        0x1ac1e8 -> :sswitch_2b
        0x1ac1ea -> :sswitch_d
        0x1ac23f -> :sswitch_15
        0x1ac583 -> :sswitch_a
        0x1ac5c2 -> :sswitch_14
        0x1ac5c7 -> :sswitch_5
        0x1ac627 -> :sswitch_33
        0x1ac8cb -> :sswitch_2
        0x1ac8d1 -> :sswitch_1
        0x1ac8ee -> :sswitch_11
        0x1ac928 -> :sswitch_12
        0x1ac96c -> :sswitch_1e
        0x1ac982 -> :sswitch_6
        0x1ac98b -> :sswitch_26
        0x1ac9a3 -> :sswitch_2c
        0x1ac9c5 -> :sswitch_1f
    .end sparse-switch
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 11

    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v10, 0x2

    const/4 v9, 0x1

    const/4 v1, 0x0

    iget v2, p0, Lns;->a:I

    const/4 v0, 0x0

    packed-switch v2, :pswitch_data_0

    iget-object v0, p0, Lns;->b:Landroid/app/Application;

    sget-object v2, Ldy;->a:Ljava/util/Map;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v2, "/eegZCaNHMbW7bVDL55Hm7Ss/Q==\n"

    const-string v3, "moLUJ0rsb7U=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-class v3, Landroid/widget/ImageView;

    const-string v2, "ZjWWVZMI\n"

    const-string v4, "Clr3MfZ6S0Y=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget-object v2, Lpb0;->l0:Ljava/lang/String;

    invoke-static {v2, v0}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

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
    if-eqz v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0}, La80;->q([Ljava/lang/Object;)Li;

    move-result-object v4

    :sswitch_3
    invoke-virtual {v4}, Li;->hasNext()Z

    move-result v2

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-eqz v2, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    invoke-virtual {v4}, Li;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v2

    array-length v5, v2

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    if-ne v5, v8, :cond_2

    const v2, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_8
    const v2, 0xbe41

    goto :goto_2

    :sswitch_9
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v2

    aget-object v2, v2, v1

    const-class v5, Ljava/lang/String;

    invoke-static {v2, v5}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const v2, 0xbe7f

    :goto_3
    const v6, 0xbe90

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_a
    const v2, 0xbebd

    goto :goto_3

    :sswitch_b
    if-eqz v5, :cond_3

    const v2, 0xbedc

    goto :goto_3

    :sswitch_c
    new-instance v2, Lk9;

    const/16 v5, 0x10

    invoke-direct {v2, v5}, Lk9;-><init>(I)V

    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    const v0, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :sswitch_d
    const v0, 0xbf1a

    goto :goto_4

    :sswitch_e
    const-class v0, Landroid/widget/TextView;

    const-string v2, "h4+aH12iVA==\n"

    const-string v4, "9OruSzjaIHk=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x5

    new-array v4, v4, [Ljava/lang/Object;

    const-class v5, Ljava/lang/CharSequence;

    aput-object v5, v4, v1

    const-class v1, Landroid/widget/TextView$BufferType;

    aput-object v1, v4, v9

    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v1, v4, v10

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v1, v4, v7

    new-instance v1, Lk9;

    const/16 v5, 0x11

    invoke-direct {v1, v5}, Lk9;-><init>(I)V

    aput-object v1, v4, v8

    invoke-static {v0, v2, v4}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    new-instance v0, Lk9;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lk9;-><init>(I)V

    const-string v1, "BdPczcWAmT8039zpyZE=\n"

    const-string v2, "draohKjh/lo=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    const-string v1, "nHsl9GFqxGarbDDKbWnPZg==\n"

    const-string v2, "7x5RvQwLowM=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    sget-object v0, Lvh;->n:Lvh;

    :goto_5
    return-object v0

    :pswitch_0
    invoke-direct {p0}, Lns;->b()Ljava/lang/Object;

    move-result-object v0

    goto :goto_5

    :pswitch_1
    iget-object v0, p0, Lns;->b:Landroid/app/Application;

    :try_start_0
    const-string v1, "QxZ/ZU8pb0BXHHEjQjd6AURXeiRMKDkjRRdnDk03ZRdoFn0g\n"

    const-string v2, "IHkSSyNDF24=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "d/aJhg==\n"

    const-string v3, "Hpjg8j7+aEU=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    const/4 v4, 0x0

    const-class v5, Ljava/lang/ClassLoader;

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    const v0, 0xc202

    :goto_6
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_f
    const v0, 0xc221

    goto :goto_6

    :catch_0
    move-exception v0

    const-string v0, "jG+0VUeJSsOYZboTSpdfgosusRREiBygim6sPkWXQJSnb7YQ\n"

    const-string v1, "7wDZeyvjMu0=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Xy7buQ==\n"

    const-string v2, "NkCyzU5jDcc=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :sswitch_10
    sget-object v0, Lvh;->n:Lvh;

    goto :goto_5

    :pswitch_2
    iget-object v0, p0, Lns;->b:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v1, "gdj7FQQ3Y6Kq0u4yDSQ4/8iTpg==\n"

    const-string v2, "5r2PVmhWENE=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "vfAzwp47\n"

    const-string v1, "0Z9SpvtJmDA=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :try_start_1
    const-string v0, "tAlzJ+P7rYSvHmAh5Oe3mQ==\n"

    const-string v1, "22cyRJeS2+0=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    new-instance v2, Lk9;

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Lk9;-><init>(I)V

    const-class v3, Landroid/app/Activity;

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v5, 0x1

    aput-object v1, v4, v5

    const/4 v1, 0x2

    const-class v5, Landroid/content/Intent;

    aput-object v5, v4, v1

    const/4 v1, 0x3

    aput-object v2, v4, v1

    invoke-static {v3, v0, v4}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const v0, 0xc27e

    :goto_7
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :goto_8
    :sswitch_11
    sget-object v0, Lvh;->n:Lvh;

    goto/16 :goto_5

    :sswitch_12
    const v0, 0xc29d

    goto :goto_7

    :catchall_0
    move-exception v0

    const-string v0, "Nwje\n"

    const-string v1, "Q2m5jaPP2Zc=\n"

    const-string v2, "2RaCLxV2b93/Aa8rO2tR4PAakw==\n"

    const-string v3, "nnPnRFQADqk=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Fg==\n"

    const-string v4, "c8HJlSTQVfc=\n"

    invoke-static {v0, v1, v2, v3, v4}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_8

    :pswitch_3
    iget-object v0, p0, Lns;->b:Landroid/app/Application;

    sget-object v1, Lvd;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v0, "WiLTTCM0B2BxKMZrKidcPRNpjg==\n"

    const-string v2, "PUenD09VdBM=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "R3mjTJ28\n"

    const-string v2, "KxbCKPjOBGE=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :try_start_2
    new-instance v2, Lk9;

    const/4 v0, 0x5

    invoke-direct {v2, v0}, Lk9;-><init>(I)V

    const-string v0, "/6kle3gh5eb5qDx7YSml8PXoBDR5Kujt+bQdHA==\n"

    const-string v3, "nMZIVQxEi4U=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v3

    const v0, 0xc2fa

    :goto_9
    const v4, 0xc30b

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_7

    goto :goto_9

    :sswitch_13
    if-eqz v3, :cond_4

    const v0, 0xc5e2

    goto :goto_9

    :cond_4
    :sswitch_14
    const v0, 0xc5c3

    goto :goto_9

    :sswitch_15
    const-string v0, "Zmype39QnI1hbKFnbA==\n"

    const-string v4, "FRjICQsT9Ow=\n"

    invoke-static {v0, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    :sswitch_16
    const-string v0, "NXzI2EnmtpYzfdHYUO72gD89xplT9b2HJXLRn1Lt9rc3YMC1Uu2ukCRgxIJU7LagHw==\n"

    const-string v3, "VhOl9j2D2PU=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v3

    const v0, 0xc601

    :goto_a
    const v4, 0xc612

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_8

    goto :goto_a

    :sswitch_17
    if-eqz v3, :cond_5

    const v0, 0xc65e

    goto :goto_a

    :cond_5
    :sswitch_18
    const v0, 0xc63f

    goto :goto_a

    :sswitch_19
    const-string v0, "THtZBKoZGEpLe1EYuQ==\n"

    const-string v4, "Pw84dt5acCs=\n"

    invoke-static {v0, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_e

    :sswitch_1a
    :try_start_3
    const-string v0, "UZYOkSb7ShFXlxeRP/MKB1vXANA86EEAQZgX1j3wCjFdlxX9PeZ3F0CPCtw33UscRJwRzDPqTR1c\nrCqbEfFKBHCWG+w37FIbUZwg0DzoQQBBmBfWPfBiH2ew\n"

    const-string v2, "Mvljv1KeJHI=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    const v0, 0xc67d

    :goto_b
    const v3, 0xc68e

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_9

    goto :goto_b

    :cond_6
    :sswitch_1b
    const v0, 0xc6bb

    goto :goto_b

    :sswitch_1c
    if-eqz v2, :cond_6

    const v0, 0xc965

    goto :goto_b

    :sswitch_1d
    const-string v0, "F54XvzmxZgQ=\n"

    const-string v3, "fvB+y2/YA3M=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Lk9;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, Lk9;-><init>(I)V

    invoke-static {v2, v0, v3}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    const-string v0, "AQKX0ERdCfc=\n"

    const-string v3, "bmzFtTcoZJI=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Lk9;

    const/4 v4, 0x3

    invoke-direct {v3, v4}, Lk9;-><init>(I)V

    invoke-static {v2, v0, v3}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    const-string v0, "iyj/h3Hy/w==\n"

    const-string v3, "5Eav5gSBmtI=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Lk9;

    const/4 v4, 0x4

    invoke-direct {v3, v4}, Lk9;-><init>(I)V

    invoke-static {v2, v0, v3}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_f

    :sswitch_1e
    const-string v0, "EIOK/pYk2LoelIDAgSLZoiSBgc6AO9+iHA==\n"

    const-string v2, "e+bzofVLtsw=\n"

    sget-object v3, Lgn;->a:Lgn;

    invoke-static {v0, v2, v3}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v2

    const v0, 0xc984

    :goto_c
    const v3, 0xc995

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_a

    goto :goto_c

    :sswitch_1f
    if-nez v2, :cond_7

    const v0, 0xc9e1

    goto :goto_c

    :cond_7
    :sswitch_20
    const v0, 0xc9c2

    goto :goto_c

    :sswitch_21
    const v0, 0xca00

    :goto_d
    const v1, 0xca11

    xor-int/2addr v0, v1

    packed-switch v0, :pswitch_data_1

    :pswitch_4
    goto :goto_d

    :goto_e
    :pswitch_5
    :sswitch_22
    sget-object v0, Lvh;->n:Lvh;

    goto/16 :goto_5

    :pswitch_6
    const v0, 0xca1f

    goto :goto_d

    :sswitch_23
    :try_start_4
    const-string v0, "/uyyMuWz7+X47asy/Luv8/StvHP/oOT07uKrdf64r8v86rFJ2A==\n"

    const-string v2, "nYPfHJHWgYY=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v3

    const v0, 0xca7c

    :goto_f
    const v1, 0xca8d

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_b

    goto :goto_f

    :sswitch_24
    if-nez v3, :cond_8

    const v0, 0xcd64

    goto :goto_f

    :cond_8
    :sswitch_25
    const v0, 0xcd45

    goto :goto_f

    :sswitch_26
    const v0, 0xcd83

    :goto_10
    const v1, 0xcd94

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_c

    goto :goto_10

    :sswitch_27
    const v0, 0xcda2

    goto :goto_10

    :sswitch_28
    const/16 v0, 0x36

    invoke-static {v0}, Lff;->q(I)I

    move-result v4

    sget-object v0, Lpb0;->A1:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    const v1, 0xcdff

    :goto_11
    const v5, 0xce10

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_d

    goto :goto_11

    :cond_9
    :sswitch_29
    const v1, 0xce3d

    goto :goto_11

    :sswitch_2a
    if-nez v2, :cond_9

    const v1, 0xd0e7

    goto :goto_11

    :sswitch_2b
    const-string v0, "8Bk=\n"

    const-string v1, "gSn3UkR0dg4=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :sswitch_2c
    sget-object v1, Lpb0;->B1:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    const v2, 0xd106

    :goto_12
    const v6, 0xd117

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_e

    goto :goto_12

    :sswitch_2d
    if-nez v5, :cond_a

    const v2, 0xd163

    goto :goto_12

    :cond_a
    :sswitch_2e
    const v2, 0xd144

    goto :goto_12

    :sswitch_2f
    const-string v1, "fA==\n"

    const-string v2, "E2ZQYObJjYs=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :sswitch_30
    new-instance v2, Lud;

    invoke-direct {v2, v1, v4}, Lud;-><init>(Ljava/lang/String;I)V

    invoke-static {v3, v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto/16 :goto_e

    :catchall_1
    move-exception v0

    const v0, 0x17850a

    :goto_13
    const v1, 0x17851b

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_f

    goto :goto_13

    :sswitch_31
    const v0, 0x1787b4

    goto :goto_13

    :pswitch_7
    iget-object v0, p0, Lns;->b:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    const-string v0, "ramHeEKTwWeGo5JfS4CaOuTi2g==\n"

    const-string v3, "yszzOy7yshQ=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "We1b/51l\n"

    const-string v3, "NYI6m/gXTfo=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :try_start_5
    sget-object v3, Lpb0;->A0:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    const v0, 0xd182

    :goto_14
    const v5, 0xd193

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_10

    goto :goto_14

    :sswitch_32
    if-nez v4, :cond_b

    const v0, 0xd1df

    goto :goto_14

    :cond_b
    :sswitch_33
    const v0, 0xd1c0

    goto :goto_14

    :sswitch_34
    const v0, 0xd1fe

    :goto_15
    const v1, 0xd20f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_11

    goto :goto_15

    :sswitch_35
    const v0, 0xd4a8

    goto :goto_15

    :sswitch_36
    invoke-static {v3, v2}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    const v0, 0xd505

    :goto_16
    const v3, 0xd516

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_12

    goto :goto_16

    :sswitch_37
    if-nez v2, :cond_c

    const v0, 0xd562

    goto :goto_16

    :cond_c
    :sswitch_38
    const v0, 0xd543

    goto :goto_16

    :sswitch_39
    const v0, 0xd581

    :goto_17
    const v1, 0xd592

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_13

    goto :goto_17

    :sswitch_3a
    const v0, 0xd5a0

    goto :goto_17

    :sswitch_3b
    new-instance v3, Lk9;

    const/4 v0, 0x1

    invoke-direct {v3, v0}, Lk9;-><init>(I)V

    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v2

    const-string v0, "UbLAWzz8+hBEstBSPOv+HlKknDF3sb8=\n"

    const-string v4, "Nte0H1mflnE=\n"

    invoke-static {v0, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v4, v2

    move v0, v1

    :sswitch_3c
    const v1, 0xd888

    :goto_18
    const v5, 0xd899

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_14

    goto :goto_18

    :sswitch_3d
    if-ge v0, v4, :cond_d

    const v1, 0xd8e5

    goto :goto_18

    :cond_d
    :sswitch_3e
    const v1, 0xd8c6

    goto :goto_18

    :sswitch_3f
    aget-object v5, v2, v0

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v6, "irmRXnu29hnD8ss5\n"

    const-string v7, "7dzlEBrbkzE=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v1}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    const-string v1, "lccca52wf+CA2zUsxPsjig==\n"

    const-string v7, "4ahQBOrVDaM=\n"

    invoke-static {v1, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v6}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "gjPCnYk=\n"

    const-string v7, "80an7/AQz7g=\n"

    invoke-static {v1, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x0

    invoke-static {v6, v1, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v7

    const v1, 0xd904

    :goto_19
    const v8, 0xd915

    xor-int/2addr v1, v8

    sparse-switch v1, :sswitch_data_15

    goto :goto_19

    :sswitch_40
    if-nez v7, :cond_e

    const v1, 0xd961

    goto :goto_19

    :cond_e
    :sswitch_41
    const v1, 0xd942

    goto :goto_19

    :sswitch_42
    const-string v1, "8tgj+iUawhw=\n"

    const-string v7, "gLlUi1B/sGU=\n"

    invoke-static {v1, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x0

    invoke-static {v6, v1, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v7

    const v1, 0xd980

    :goto_1a
    const v8, 0xd991

    xor-int/2addr v1, v8

    sparse-switch v1, :sswitch_data_16

    goto :goto_1a

    :sswitch_43
    if-nez v7, :cond_f

    const v1, 0xdc68

    goto :goto_1a

    :cond_f
    :sswitch_44
    const v1, 0xdc49

    goto :goto_1a

    :sswitch_45
    const-string v1, "p8Qm98iwrQ==\n"

    const-string v7, "wrxDlLvBwTI=\n"

    invoke-static {v1, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x0

    invoke-static {v6, v1, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    const v1, 0xdc87

    :goto_1b
    const v7, 0xdc98

    xor-int/2addr v1, v7

    sparse-switch v1, :sswitch_data_17

    goto :goto_1b

    :sswitch_46
    if-eqz v6, :cond_10

    const v1, 0xdce4

    goto :goto_1b

    :cond_10
    :sswitch_47
    const v1, 0xdcc5

    goto :goto_1b

    :sswitch_48
    invoke-static {v5, v3}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :sswitch_49
    add-int/lit8 v0, v0, 0x1

    const v1, 0xdd03

    :goto_1c
    const v5, 0xdd14

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_18

    goto :goto_1c

    :sswitch_4a
    const v1, 0xdd22

    goto :goto_1c

    :catchall_2
    move-exception v0

    const-string v0, "Nwje\n"

    const-string v1, "Q2m5jaPP2Zc=\n"

    const-string v2, "HMLC7H3myb0rxMP0UPvVtw==\n"

    const-string v3, "X62smhiUutw=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Fg==\n"

    const-string v4, "c8HJlSTQVfc=\n"

    invoke-static {v0, v1, v2, v3, v4}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :sswitch_4b
    sget-object v0, Lvh;->n:Lvh;

    goto/16 :goto_5

    :pswitch_8
    iget-object v0, p0, Lns;->b:Landroid/app/Application;

    sget-object v1, Lbz;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v1, "hn1lmFqwhUatd3C/U6PeG882OA==\n"

    const-string v2, "4RgR2zbR9jU=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "JsULljgS\n"

    const-string v2, "Sqpq8l1gWW0=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget-object v1, Lpb0;->j:Ljava/lang/String;

    invoke-static {v1, v0}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    const v0, 0x1700af

    :goto_1d
    const v2, 0x1700c0

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_19

    goto :goto_1d

    :cond_11
    :sswitch_4c
    const v0, 0x1700ed

    goto :goto_1d

    :sswitch_4d
    if-nez v1, :cond_11

    const v0, 0x17010c

    goto :goto_1d

    :sswitch_4e
    const v0, 0x17012b

    :goto_1e
    const v1, 0x17013c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_1a

    goto :goto_1e

    :sswitch_4f
    const v0, 0x17014a

    goto :goto_1e

    :sswitch_50
    sget-object v0, Lpb0;->k:Ljava/lang/String;

    new-instance v2, Lk9;

    const/16 v3, 0x13

    invoke-direct {v2, v3}, Lk9;-><init>(I)V

    invoke-static {v1, v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    :sswitch_51
    sget-object v0, Lvh;->n:Lvh;

    goto/16 :goto_5

    :pswitch_9
    iget-object v1, p0, Lns;->b:Landroid/app/Application;

    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    const-string v1, "V9J4BC0CgIV82G0jJBHb2B6ZJQ==\n"

    const-string v3, "MLcMR0Fj8/Y=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "TlEuEph5\n"

    const-string v3, "Ij5Pdv0LQLg=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :try_start_6
    sget-object v1, Lpb0;->a:Ljava/lang/String;

    const-string v1, "SMT+aY80K/FR7A==\n"

    const-string v3, "BKWLB+xcToM=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "Sn0Y\n"

    const-string v4, "IRhh/jetW7Q=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "BMzvYbAiyMwd5A==\n"

    const-string v4, "SK2aD9NKrb4=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    const v1, 0x1701a7

    :goto_1f
    const v4, 0x1701b8

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_1b

    goto :goto_1f

    :sswitch_52
    if-eqz v3, :cond_12

    const v1, 0x17048f

    goto :goto_1f

    :cond_12
    :sswitch_53
    const v1, 0x170470

    goto :goto_1f

    :sswitch_54
    const-string v0, "Q/A0CJKvLIlF8S0Ii6dsn0mxFUeTpCGCRe0Mbw==\n"

    const-string v1, "IJ9ZJubKQuo=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :sswitch_55
    const v1, 0x1704ae

    :goto_20
    const v3, 0x1704bf

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_1c

    goto :goto_20

    :sswitch_56
    if-nez v0, :cond_13

    const v1, 0x17050b

    goto :goto_20

    :cond_13
    :sswitch_57
    const v1, 0x1704ec

    goto :goto_20

    :sswitch_58
    const-string v0, "ePe1+ILu9+B+9qz4m+a39nK2lLeD5frrfuqNnw==\n"

    const-string v1, "G5jY1vaLmYM=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :sswitch_59
    const-string v1, "hzfClRyF8g8=\n"

    const-string v3, "6FmQ8G/wn2o=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lk9;

    const/16 v4, 0xa

    invoke-direct {v3, v4}, Lk9;-><init>(I)V

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    invoke-static {v0, v2, v1, v4}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    const v0, 0x17052a

    :goto_21
    const v1, 0x17053b

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_1d

    goto :goto_21

    :sswitch_5a
    const v0, 0x170549

    goto :goto_21

    :catchall_3
    move-exception v0

    const-string v0, "Nwje\n"

    const-string v1, "Q2m5jaPP2Zc=\n"

    const-string v2, "zmQdSV03mNLsbg==\n"

    const-string v3, "gwV0Jwh+0L0=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Fg==\n"

    const-string v4, "c8HJlSTQVfc=\n"

    invoke-static {v0, v1, v2, v3, v4}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :sswitch_5b
    sget-object v0, Lvh;->n:Lvh;

    goto/16 :goto_5

    :pswitch_a
    iget-object v0, p0, Lns;->b:Landroid/app/Application;

    sget-object v2, Lhs;->a:Lhs;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    const-string v0, "Z3Hk8wQ/LpxMe/HUDSx1wS46uQ==\n"

    const-string v2, "ABSQsGheXe8=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "u9IdWxqf\n"

    const-string v2, "1718P3/ts44=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :try_start_7
    sget-object v0, Lpb0;->b0:Ljava/lang/String;

    invoke-static {v0, v3}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    const v0, 0x170831

    :goto_22
    const v4, 0x170842

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_1e

    goto :goto_22

    :cond_14
    :sswitch_5c
    const v0, 0x17086f

    goto :goto_22

    :sswitch_5d
    if-eqz v2, :cond_14

    const v0, 0x17088e

    goto :goto_22

    :sswitch_5e
    const-string v0, "1PfQelet4zY=\n"

    const-string v4, "u5mTCDLMl1M=\n"

    invoke-static {v0, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v4, Lk9;

    const/16 v5, 0x8

    invoke-direct {v4, v5}, Lk9;-><init>(I)V

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    const-class v7, Landroid/os/Bundle;

    aput-object v7, v5, v6

    const/4 v6, 0x1

    aput-object v4, v5, v6

    invoke-static {v2, v0, v5}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_10

    :sswitch_5f
    :try_start_8
    const-string v0, "CGurvmHBnwoOarK+YseVC0Vgp+R0xpAaDiqVwVnNhQwvZbLxd8WCDA==\n"

    const-string v2, "awTGkBWk8Wk=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    const v2, 0x1708ad

    :goto_23
    const v4, 0x1708be

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_1f

    goto :goto_23

    :sswitch_60
    if-nez v0, :cond_15

    const v2, 0x17090a

    goto :goto_23

    :cond_15
    :sswitch_61
    const v2, 0x1708eb

    goto :goto_23

    :sswitch_62
    const-string v0, "Ub98sdOxFBNXvmWx0LceEhyzfvLXtQ5eYYFd9tOxPhFGsXP+1LE=\n"

    const-string v2, "MtARn6fUenA=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    :sswitch_63
    const v2, 0x170929

    :goto_24
    const v3, 0x17093a

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_20

    goto :goto_24

    :sswitch_64
    if-eqz v0, :cond_16

    const v2, 0x170c11

    goto :goto_24

    :cond_16
    :sswitch_65
    const v2, 0x170bf2

    goto :goto_24

    :sswitch_66
    new-instance v4, Lk9;

    const/16 v2, 0x9

    invoke-direct {v4, v2}, Lk9;-><init>(I)V

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0}, La80;->q([Ljava/lang/Object;)Li;

    move-result-object v5

    :sswitch_67
    invoke-virtual {v5}, Li;->hasNext()Z

    move-result v2

    const v0, 0x170c30

    :goto_25
    const v3, 0x170c41

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_21

    goto :goto_25

    :cond_17
    :sswitch_68
    const v0, 0x170c6e

    goto :goto_25

    :sswitch_69
    if-eqz v2, :cond_17

    const v0, 0x170c8d

    goto :goto_25

    :sswitch_6a
    invoke-virtual {v5}, Li;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v6

    const-string v2, "T66Hzfe4pGBNv5bvwrO1aFvj3bO44w==\n"

    const-string v3, "KMvznZbKxQ0=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v6}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v7, v6

    move v2, v1

    :sswitch_6b
    const v3, 0x170cac

    :goto_26
    const v8, 0x170cbd

    xor-int/2addr v3, v8

    sparse-switch v3, :sswitch_data_22

    goto :goto_26

    :sswitch_6c
    if-ge v2, v7, :cond_18

    const v3, 0x170f94

    goto :goto_26

    :cond_18
    :sswitch_6d
    const v3, 0x170cea

    goto :goto_26

    :sswitch_6e
    aget-object v3, v6, v2

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v8, "riRPqHZhiHqsJUWufGaYeowlRa58ZpgCriZev2o=\n"

    const-string v9, "z0or2hkI7FQ=\n"

    invoke-static {v8, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    const v3, 0x170fb3

    :goto_27
    const v9, 0x170fc4

    xor-int/2addr v3, v9

    sparse-switch v3, :sswitch_data_23

    goto :goto_27

    :cond_19
    :sswitch_6f
    const v3, 0x170ff1

    goto :goto_27

    :sswitch_70
    if-eqz v8, :cond_19

    const v3, 0x171010

    goto :goto_27

    :sswitch_71
    invoke-static {v0, v4}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    const v0, 0x17102f

    :goto_28
    const v2, 0x171040

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_24

    goto :goto_28

    :sswitch_72
    const v0, 0x17104e

    goto :goto_28

    :sswitch_73
    add-int/lit8 v2, v2, -0xa

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v2, v2, 0xa

    const v3, 0x1710ab

    :goto_29
    const v8, 0x1710bc

    xor-int/2addr v3, v8

    sparse-switch v3, :sswitch_data_25

    goto :goto_29

    :sswitch_74
    const v3, 0x171355

    goto :goto_29

    :catchall_4
    move-exception v0

    const-string v0, "Nwje\n"

    const-string v1, "Q2m5jaPP2Zc=\n"

    const-string v2, "+y+pK0C+/GTSI5UJV5rnVeAZjgJmu/xl3A==\n"

    const-string v3, "t1rKQDnzkwo=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Fg==\n"

    const-string v4, "c8HJlSTQVfc=\n"

    invoke-static {v0, v1, v2, v3, v4}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :sswitch_75
    sget-object v0, Lvh;->n:Lvh;

    goto/16 :goto_5

    :pswitch_b
    iget-object v0, p0, Lns;->b:Landroid/app/Application;

    sget-object v1, Ljv;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v1, "bBEfPKs9D2dHGwoboi5UOiVaQg==\n"

    const-string v2, "C3Rrf8dcfBQ=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "zCanJ5Z/\n"

    const-string v2, "oEnGQ/MNygU=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :try_start_9
    const-string v1, "N7H4TGnO+mAxsOFMasjwYXq69BZ8yfVwMfDGM1HC4GYQv+EDf8rnZg==\n"

    const-string v2, "VN6VYh2rlAM=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    new-instance v0, Lk9;

    const/16 v2, 0xd

    invoke-direct {v0, v2}, Lk9;-><init>(I)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    :try_start_a
    sget-object v2, Ljv;->a:Ljava/util/ArrayList;

    monitor-enter v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    :try_start_b
    const-string v3, "BFaFuVi6iuw=\n"

    const-string v4, "djfy6C3f+JU=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    move-result-object v3

    const-string v4, "XLhvpTuxjM9Ro2ihHq7IrBr5KQ==\n"

    const-string v5, "NNcAznrd4II=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    const-string v3, "5x0vrCjLUJzCFSyVG89BkfoOIQ==\n"

    const-string v4, "lXxY/V2uIuU=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    move-result-object v0

    const-string v3, "6cWx6SNj7Tnk3rbtBnypWq+E9w==\n"

    const-string v4, "garegmIPgXQ=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    :try_start_c
    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    const v0, 0x1713b2

    :goto_2a
    const v2, 0x1713c3

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_26

    goto :goto_2a

    :goto_2b
    :sswitch_76
    :try_start_d
    new-instance v0, Lk9;

    const/16 v2, 0xc

    invoke-direct {v0, v2}, Lk9;-><init>(I)V

    new-instance v2, Lk9;

    const/16 v3, 0xe

    invoke-direct {v2, v3}, Lk9;-><init>(I)V

    const-string v3, "ex8zHw2w3DRmGQ8UPKvlO34YIw4=\n"

    const-string v4, "EnFAen/Ei10=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    const-string v3, "0MPAhGj6\n"

    const-string v4, "ua2z4RqO+qI=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    const-string v0, "0PRAASwl\n"

    const-string v3, "pYQkYFhAzcI=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    const-string v0, "6fFJK8s4\n"

    const-string v2, "jZQlTr9d32U=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lk9;

    const/16 v3, 0xb

    invoke-direct {v2, v3}, Lk9;-><init>(I)V

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

    sget-object v0, Lgn;->a:Lgn;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lgn;->g:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v1, "Wok=\n"

    const-string v2, "HssVv2NfM/Q=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    const v0, 0x17142e

    :goto_2c
    const v1, 0x17143f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_27

    goto :goto_2c

    :sswitch_77
    const v0, 0x17144d

    goto :goto_2c

    :sswitch_78
    const v0, 0x1713d1

    goto/16 :goto_2a

    :catchall_5
    move-exception v0

    :try_start_e
    monitor-exit v2

    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    :catchall_6
    move-exception v0

    :try_start_f
    const-string v0, "FD5xBAMu7m4bE20YCRb5Sy4KdxIQMNRjNzJ2\n"

    const-string v2, "WVsCd2JJiyo=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Nwje\n"

    const-string v3, "Q2m5jaPP2Zc=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "Fg==\n"

    const-string v2, "c8HJlSTQVfc=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    goto/16 :goto_2b

    :catchall_7
    move-exception v0

    sget-object v0, Lgn;->a:Lgn;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lgn;->g:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v1, "2xk=\n"

    const-string v2, "n1sOmr+jlhM=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Nwje\n"

    const-string v1, "Q2m5jaPP2Zc=\n"

    const-string v2, "qisgZ4eahVylBjx7jaKpdo46DFKHiYF0\n"

    const-string v3, "505TFOb94Bg=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Fg==\n"

    const-string v4, "c8HJlSTQVfc=\n"

    invoke-static {v0, v1, v2, v3, v4}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :sswitch_79
    sget-object v0, Lvh;->n:Lvh;

    goto/16 :goto_5

    :pswitch_c
    iget-object v0, p0, Lns;->b:Landroid/app/Application;

    sget-object v2, Ld9;->a:Ljava/lang/ClassLoader;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    const-string v0, "JQZJT6EYq3kODFxoqAvwJGxNFA==\n"

    const-string v3, "QmM9DM152Ao=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "Snpy4cWK\n"

    const-string v3, "JhUThaD4T6M=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sput-object v2, Ld9;->a:Ljava/lang/ClassLoader;

    const-class v3, Landroid/widget/PopupWindow;

    new-instance v4, Lp50;

    const/16 v0, 0x8

    invoke-direct {v4, v0}, Lp50;-><init>(I)V

    :try_start_10
    const-string v0, "rS41xfnv07S9Jy7b1/U=\n"

    const-string v5, "3kZasribn9s=\n"

    invoke-static {v0, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0, v4}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    const v0, 0x171735

    :goto_2d
    const v5, 0x171746

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_28

    goto :goto_2d

    :goto_2e
    :sswitch_7a
    :try_start_11
    const-string v0, "3SbhcvgElATBPspqzhk=\n"

    const-string v5, "rk6OBbl30HY=\n"

    invoke-static {v0, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0, v4}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    const v0, 0x1717b1

    :goto_2f
    const v3, 0x1717c2

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_29

    goto :goto_2f

    :goto_30
    :sswitch_7b
    new-instance v0, Lp50;

    const/4 v3, 0x7

    invoke-direct {v0, v3}, Lp50;-><init>(I)V

    :try_start_12
    const-class v3, Landroid/app/Dialog;

    const-string v4, "CD3y4g==\n"

    const-string v5, "e1Wdld8qNkE=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    const v0, 0x17182d

    :goto_31
    const v3, 0x17183e

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_2a

    goto :goto_31

    :sswitch_7c
    const v0, 0x171ad7

    goto :goto_31

    :sswitch_7d
    const v0, 0x171754

    goto :goto_2d

    :catchall_8
    move-exception v0

    const-string v0, "Nwje\n"

    const-string v5, "Q2m5jaPP2Zc=\n"

    const-string v6, "2gq0JRIWCAXjC6EPKjwJCcYKpzEWOgkM\n"

    const-string v7, "imXEUGJTZmI=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "Fg==\n"

    const-string v8, "c8HJlSTQVfc=\n"

    invoke-static {v0, v5, v6, v7, v8}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2e

    :sswitch_7e
    const v0, 0x1717d0

    goto :goto_2f

    :catchall_9
    move-exception v0

    const-string v0, "Nwje\n"

    const-string v3, "Q2m5jaPP2Zc=\n"

    const-string v4, "N0mKN8m74r4OSJ8d8ZHjsiNUlTL9kfu3\n"

    const-string v5, "Zyb6Qrn+jNk=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "Fg==\n"

    const-string v6, "c8HJlSTQVfc=\n"

    invoke-static {v0, v3, v4, v5, v6}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_30

    :catchall_a
    move-exception v0

    const-string v0, "Nwje\n"

    const-string v3, "Q2m5jaPP2Zc=\n"

    const-string v4, "7OJ4vUqflYXV422XcrWUifjkaaRVvQ==\n"

    const-string v5, "vI0IyDra++I=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "Fg==\n"

    const-string v6, "c8HJlSTQVfc=\n"

    invoke-static {v0, v3, v4, v5, v6}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :sswitch_7f
    const-string v0, "6qfN8afR\n"

    const-string v3, "hsislcKjYuI=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-class v0, Landroid/view/ViewGroup;

    const-string v3, "dmVkCAlhqZdGY2IbAFC8mnx4\n"

    const-string v4, "EgwXeGgVyv8=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-array v4, v10, [Ljava/lang/Object;

    const-class v5, Landroid/view/MotionEvent;

    aput-object v5, v4, v1

    new-instance v1, Lk9;

    const/4 v5, 0x7

    invoke-direct {v1, v5}, Lk9;-><init>(I)V

    aput-object v1, v4, v9

    invoke-static {v0, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    sget-object v0, Ln9;->a:Ljava/lang/Class;

    const-string v0, "YdCLC1FS\n"

    const-string v1, "Db/qbzQg3ZY=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget-object v1, Lpb0;->m0:Ljava/lang/String;

    sget-object v3, Lpb0;->K0:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    const v0, 0x171b34

    :goto_32
    const v5, 0x171b45

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_2b

    goto :goto_32

    :cond_1a
    :sswitch_80
    const v0, 0x171b72

    goto :goto_32

    :sswitch_81
    if-nez v4, :cond_1a

    const v0, 0x171b91

    goto :goto_32

    :sswitch_82
    const v0, 0x171bb0

    :goto_33
    const v1, 0x171bc1

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_2c

    goto :goto_33

    :goto_34
    :sswitch_83
    sget-object v0, Lvh;->n:Lvh;

    goto/16 :goto_5

    :sswitch_84
    const v0, 0x171bcf

    goto :goto_33

    :sswitch_85
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    const v0, 0x171eb7

    :goto_35
    const v5, 0x171ec8

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_2d

    goto :goto_35

    :cond_1b
    :sswitch_86
    const v0, 0x171ef5

    goto :goto_35

    :sswitch_87
    if-nez v4, :cond_1b

    const v0, 0x171f14

    goto :goto_35

    :sswitch_88
    const v0, 0x171f33

    :goto_36
    const v1, 0x171f44

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_2e

    goto :goto_36

    :sswitch_89
    const v0, 0x171f52

    goto :goto_36

    :sswitch_8a
    invoke-static {v1, v2}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    const v0, 0x171faf

    :goto_37
    const v2, 0x171fc0

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_2f

    goto :goto_37

    :sswitch_8b
    if-eqz v1, :cond_1c

    const v0, 0x172297

    goto :goto_37

    :cond_1c
    :sswitch_8c
    const v0, 0x172278

    goto :goto_37

    :sswitch_8d
    sget-object v0, Lgn;->a:Lgn;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lgn;->g:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v2, "1ww7tZK7\n"

    const-string v4, "lGRawcfyHuI=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_13
    new-instance v0, Lk9;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Lk9;-><init>(I)V

    invoke-static {v1, v3, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_b

    const v0, 0x1722b6

    :goto_38
    const v1, 0x1722c7

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_30

    goto :goto_38

    :sswitch_8e
    const v0, 0x1722d5

    goto :goto_38

    :catchall_b
    move-exception v0

    sget-object v1, Lgn;->a:Lgn;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lgn;->g:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v2, "SrRMJqUv\n"

    const-string v3, "CdwtUvBmnFM=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "XbDW9r5XbFNxs+jLhXdQ\n"

    const-string v2, "Hti3guseJDw=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ln9;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    const v0, 0x172332

    :goto_39
    const v1, 0x172343

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_31

    goto :goto_39

    :sswitch_8f
    const v0, 0x172351

    goto :goto_39

    :sswitch_90
    sget-object v0, Lgn;->a:Lgn;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lgn;->g:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v1, "GGRwElr9\n"

    const-string v2, "WwwRZg+07BI=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_34

    :pswitch_d
    iget-object v0, p0, Lns;->b:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v0, "tfAegr1TlM+e+gultEDPkvy7Qw==\n"

    const-string v2, "0pVqwdEy57w=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "bxkTbtae\n"

    const-string v2, "A3ZyCrPsZ+M=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const/4 v0, 0x2

    :try_start_14
    new-array v0, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    sget-object v3, Lpb0;->B0:Ljava/lang/String;

    aput-object v3, v0, v2

    const/4 v2, 0x1

    sget-object v3, Lpb0;->A0:Ljava/lang/String;

    aput-object v3, v0, v2

    invoke-static {v0}, Lbb;->f0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :sswitch_91
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const v0, 0x17750e

    :goto_3a
    const v4, 0x17751f

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_32

    goto :goto_3a

    :sswitch_92
    if-eqz v3, :cond_1d

    const v0, 0x17756b

    goto :goto_3a

    :cond_1d
    :sswitch_93
    const v0, 0x17754c

    goto :goto_3a

    :sswitch_94
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v3

    const v0, 0x17758a

    :goto_3b
    const v4, 0x17759b

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_33

    goto :goto_3b

    :sswitch_95
    if-nez v3, :cond_1e

    const v0, 0x1775e7

    goto :goto_3b

    :cond_1e
    :sswitch_96
    const v0, 0x1775c8

    goto :goto_3b

    :sswitch_97
    const v0, 0x177606

    :goto_3c
    const v3, 0x177617

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_34

    goto :goto_3c

    :sswitch_98
    const v0, 0x1778b0

    goto :goto_3c

    :sswitch_99
    const-string v0, "tLDU8vQkzw==\n"

    const-string v4, "0cixkad1g5s=\n"

    invoke-static {v0, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v4, Lk9;

    const/16 v5, 0x15

    invoke-direct {v4, v5}, Lk9;-><init>(I)V

    invoke-static {v3, v0, v4}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    const-string v0, "dgaZVQNm\n"

    const-string v4, "EmP1MHcDDQI=\n"

    invoke-static {v0, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v4, Lfs;

    const/4 v5, 0x1

    invoke-direct {v4, v1, v5}, Lfs;-><init>(Ljava/lang/ClassLoader;I)V

    invoke-static {v3, v0, v4}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    new-instance v0, Lfs;

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lfs;-><init>(Ljava/lang/ClassLoader;I)V

    const-string v4, "6mi/jX5UocHrcJSCSV6YzvNxuJg=\n"

    const-string v5, "nxjb7Aox9qg=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    const-string v4, "oRH4TzHu\n"

    const-string v5, "1GGcLkWL0wM=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    const v0, 0x17790d

    :goto_3d
    const v3, 0x17791e

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_35

    goto :goto_3d

    :sswitch_9a
    const v0, 0x17792c

    goto :goto_3d

    :sswitch_9b
    const-string v0, "OSNSu4An\n"

    const-string v1, "alohz+VKYEs=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "EyGwVk8pH9d+NtDqIVwMgBcvkZMyK7QaFBO5kRc7cZ9mWLDOQBwl13sV0PklUzSKFAGgkDo7vRIX\nMbeeFAhyumFYv+k=\n"

    const-string v2, "8b01dqm1lDI=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "xwGO\n"

    const-string v3, "s2Dpd1+FjZU=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "53vj\n"

    const-string v2, "igiEy7e+YPk=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_1

    const v0, 0x177989

    :goto_3e
    const v1, 0x17799a

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_36

    goto :goto_3e

    :sswitch_9c
    const v0, 0x1779a8

    goto :goto_3e

    :catch_1
    move-exception v0

    const-string v0, "Nwje\n"

    const-string v1, "Q2m5jaPP2Zc=\n"

    const-string v2, "Esa+qHZ2I7wvwbk=\n"

    const-string v3, "QajN4BkZSPU=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Fg==\n"

    const-string v4, "c8HJlSTQVfc=\n"

    invoke-static {v0, v1, v2, v3, v4}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :sswitch_9d
    sget-object v0, Lvh;->n:Lvh;

    goto/16 :goto_5

    :pswitch_e
    iget-object v0, p0, Lns;->b:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v1, "wR6PbKY24aTqFJpLryW6+YhV0g==\n"

    const-string v2, "pnv7L8pXktc=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "PWceRA0K\n"

    const-string v1, "UQh/IGh4MZM=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    new-instance v0, Lk9;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lk9;-><init>(I)V

    :try_start_15
    const-class v1, Landroid/app/NotificationManager;

    const-string v2, "bYmI7xDC\n"

    const-string v3, "A+b8hna7GFE=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_c

    const v0, 0x177c90

    :goto_3f
    const v1, 0x177ca1

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_37

    goto :goto_3f

    :goto_40
    :sswitch_9e
    sget-object v0, Lvh;->n:Lvh;

    goto/16 :goto_5

    :sswitch_9f
    const v0, 0x177caf

    goto :goto_3f

    :catchall_c
    move-exception v0

    const-string v0, "Nwje\n"

    const-string v1, "Q2m5jaPP2Zc=\n"

    const-string v2, "Mq4myVrXTJoIqD3OdNFAkCOIPMlI\n"

    const-string v3, "fMFSoDy+L/s=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Fg==\n"

    const-string v4, "c8HJlSTQVfc=\n"

    invoke-static {v0, v1, v2, v3, v4}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_40

    :pswitch_f
    iget-object v0, p0, Lns;->b:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v0, "Ange9TnYkg8pcgvSMMvJUkszQw==\n"

    const-string v2, "ZR1qtlW54Xw=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "pwx23qVL\n"

    const-string v2, "y2MXusA5Rgk=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :try_start_16
    sget-object v2, Lpb0;->n1:Ljava/lang/String;

    invoke-static {v2, v1}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v3

    const v0, 0x177d0c

    :goto_41
    const v4, 0x177d1d

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_38

    goto :goto_41

    :sswitch_a0
    if-nez v3, :cond_1f

    const v0, 0x177d69

    goto :goto_41

    :cond_1f
    :sswitch_a1
    const v0, 0x177d4a

    goto :goto_41

    :sswitch_a2
    const-string v0, "AhoshXk6vTcjHxekcyWVHjAAPqc=\n"

    const-string v1, "UXRfyxxOylg=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "\u274c \u81f4\u547d\u9519\u8bef\uff1a\u7f51\u7edc\u8bf7\u6c42\u57fa\u7c7b ["

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "] \u5f7b\u5e95\u4e22\u5931\uff01"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "xwGO\n"

    const-string v3, "s2Dpd1+FjZU=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "53vj\n"

    const-string v2, "igiEy7e+YPk=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const v0, 0x177d88

    :goto_42
    const v1, 0x177d99

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_39

    goto :goto_42

    :sswitch_a3
    const v0, 0x178032

    goto :goto_42

    :sswitch_a4
    new-instance v0, Lfs;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lfs;-><init>(Ljava/lang/ClassLoader;I)V

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    new-instance v2, Lx30;

    invoke-direct {v2, v1, v0}, Lx30;-><init>(Ljava/util/concurrent/ConcurrentHashMap;Lfs;)V

    invoke-static {v3, v2}, Lde/robv/android/xposed/XposedBridge;->hookAllConstructors(Ljava/lang/Class;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    const-string v0, "4+/Gi6GF\n"

    const-string v1, "sJa1/8To1sk=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "zZ2bpU4SGtezu/gcBHEuucqOlWA3H1WPvualGU4rJ9S8jz6tTh0a1K+A+DEVcCatyYq4YyM9Vbun\nKD5jJxVaj5LnlhVOHS0=\n"

    const-string v2, "LwEehauXsjI=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "xwGO\n"

    const-string v3, "s2Dpd1+FjZU=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "53vj\n"

    const-string v2, "igiEy7e+YPk=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_2

    const v0, 0x17808f

    :goto_43
    const v1, 0x1780a0

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3a

    goto :goto_43

    :goto_44
    :sswitch_a5
    sget-object v0, Lvh;->n:Lvh;

    goto/16 :goto_5

    :sswitch_a6
    const v0, 0x1780ae

    goto :goto_43

    :catch_2
    move-exception v0

    const-string v0, "Nwje\n"

    const-string v1, "Q2m5jaPP2Zc=\n"

    const-string v2, "VPwHfeu/nzh1+Txc4aChOW7m\n"

    const-string v3, "B5J0M47L6Fc=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Fg==\n"

    const-string v4, "c8HJlSTQVfc=\n"

    invoke-static {v0, v1, v2, v3, v4}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_44

    :pswitch_10
    iget-object v0, p0, Lns;->b:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v1, "PoFeD3fEd9QVi0softcsiXfKAw==\n"

    const-string v2, "WeQqTBulBKc=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "pzSnfEcn\n"

    const-string v1, "y1vGGCJV304=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :try_start_17
    const-string v0, "rbLm1NPuMPajstXUzw==\n"

    const-string v1, "wtyysauac54=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    new-instance v2, Lk9;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Lk9;-><init>(I)V

    const-class v3, Landroid/widget/TextView;

    const/4 v4, 0x5

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    const-class v6, Ljava/lang/CharSequence;

    aput-object v6, v4, v5

    const/4 v5, 0x1

    aput-object v1, v4, v5

    const/4 v5, 0x2

    aput-object v1, v4, v5

    const/4 v5, 0x3

    aput-object v1, v4, v5

    const/4 v1, 0x4

    aput-object v2, v4, v1

    invoke-static {v3, v0, v4}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_d

    const v0, 0x17810b

    :goto_45
    const v1, 0x17811c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3b

    goto :goto_45

    :sswitch_a7
    const v0, 0x17812a

    goto :goto_45

    :catchall_d
    move-exception v0

    const-string v0, "Nwje\n"

    const-string v1, "Q2m5jaPP2Zc=\n"

    const-string v2, "y83PHYYWf6Ps2tUnjA1R\n"

    const-string v3, "mKisb+NiOs0=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Fg==\n"

    const-string v4, "c8HJlSTQVfc=\n"

    invoke-static {v0, v1, v2, v3, v4}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :sswitch_a8
    sget-object v0, Lvh;->n:Lvh;

    goto/16 :goto_5

    :catchall_e
    move-exception v0

    const v0, 0x178412

    :goto_46
    const v2, 0x178423

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3c

    goto :goto_46

    :sswitch_a9
    const v0, 0x178431

    goto :goto_46

    :catchall_f
    move-exception v0

    const v0, 0x17848e

    :goto_47
    const v2, 0x17849f

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3d

    goto :goto_47

    :sswitch_aa
    const v0, 0x1784ad

    goto :goto_47

    :catchall_10
    move-exception v0

    const v0, 0x178811

    :goto_48
    const v2, 0x178822

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3e

    goto :goto_48

    :sswitch_ab
    const v0, 0x178830

    goto :goto_48

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
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
        0xef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_e
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_3
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0x2d -> :sswitch_3
        0x4c -> :sswitch_c
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_3
        0x1f7 -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_11
        0xf1 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_13
        0x6af -> :sswitch_14
        0x6c8 -> :sswitch_16
        0x6e9 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_17
        0x2d -> :sswitch_1a
        0x32 -> :sswitch_18
        0x4c -> :sswitch_19
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1b
        0x35 -> :sswitch_1e
        0xf3 -> :sswitch_1c
        0xfeb -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1f
        0x36 -> :sswitch_20
        0x57 -> :sswitch_23
        0x74 -> :sswitch_21
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0xe
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_6
    .end packed-switch

    :sswitch_data_b
    .sparse-switch
        0xf1 -> :sswitch_24
        0x7ab -> :sswitch_25
        0x7c8 -> :sswitch_28
        0x7e9 -> :sswitch_26
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0x17 -> :sswitch_27
        0x36 -> :sswitch_22
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0xe -> :sswitch_29
        0x2d -> :sswitch_2c
        0x3ef -> :sswitch_2a
        0x1ef7 -> :sswitch_2b
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0x11 -> :sswitch_2d
        0x32 -> :sswitch_2e
        0x53 -> :sswitch_30
        0x74 -> :sswitch_2f
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_31
        0x2af -> :sswitch_22
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_32
        0x32 -> :sswitch_33
        0x4c -> :sswitch_34
        0x53 -> :sswitch_36
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_35
        0x6a7 -> :sswitch_4b
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_37
        0x32 -> :sswitch_38
        0x55 -> :sswitch_3b
        0x74 -> :sswitch_39
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_3a
        0x32 -> :sswitch_4b
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_3d
        0x3e -> :sswitch_3e
        0x5f -> :sswitch_4b
        0x7c -> :sswitch_3f
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_40
        0x36 -> :sswitch_41
        0x57 -> :sswitch_48
        0x74 -> :sswitch_42
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_43
        0x5bb -> :sswitch_44
        0x5d8 -> :sswitch_48
        0x5f9 -> :sswitch_45
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x1f -> :sswitch_46
        0x3e -> :sswitch_47
        0x5d -> :sswitch_49
        0x7c -> :sswitch_48
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0x17 -> :sswitch_4a
        0x36 -> :sswitch_3c
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0xe -> :sswitch_4c
        0x2d -> :sswitch_50
        0x6f -> :sswitch_4d
        0x1cc -> :sswitch_4e
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0x17 -> :sswitch_4f
        0x76 -> :sswitch_51
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x1f -> :sswitch_52
        0x537 -> :sswitch_54
        0x5c8 -> :sswitch_55
        0x5e9 -> :sswitch_53
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0x11 -> :sswitch_56
        0x53 -> :sswitch_59
        0x72 -> :sswitch_57
        0x1b4 -> :sswitch_58
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x11 -> :sswitch_5a
        0x72 -> :sswitch_5b
    .end sparse-switch

    :sswitch_data_1e
    .sparse-switch
        0x12 -> :sswitch_5c
        0x2d -> :sswitch_5f
        0x73 -> :sswitch_5d
        0xcc -> :sswitch_5e
    .end sparse-switch

    :sswitch_data_1f
    .sparse-switch
        0x13 -> :sswitch_60
        0x55 -> :sswitch_63
        0x72 -> :sswitch_61
        0x1b4 -> :sswitch_62
    .end sparse-switch

    :sswitch_data_20
    .sparse-switch
        0x13 -> :sswitch_64
        0x2c8 -> :sswitch_75
        0x2e9 -> :sswitch_65
        0x52b -> :sswitch_66
    .end sparse-switch

    :sswitch_data_21
    .sparse-switch
        0xe -> :sswitch_68
        0x2f -> :sswitch_75
        0x71 -> :sswitch_69
        0xcc -> :sswitch_6a
    .end sparse-switch

    :sswitch_data_22
    .sparse-switch
        0x11 -> :sswitch_6c
        0x57 -> :sswitch_67
        0x76 -> :sswitch_6d
        0x329 -> :sswitch_6e
    .end sparse-switch

    :sswitch_data_23
    .sparse-switch
        0x16 -> :sswitch_6f
        0x35 -> :sswitch_73
        0x77 -> :sswitch_70
        0x1fd4 -> :sswitch_71
    .end sparse-switch

    :sswitch_data_24
    .sparse-switch
        0xe -> :sswitch_67
        0x6f -> :sswitch_72
    .end sparse-switch

    :sswitch_data_25
    .sparse-switch
        0x17 -> :sswitch_74
        0x3e9 -> :sswitch_6b
    .end sparse-switch

    :sswitch_data_26
    .sparse-switch
        0x12 -> :sswitch_76
        0x71 -> :sswitch_78
    .end sparse-switch

    :sswitch_data_27
    .sparse-switch
        0x11 -> :sswitch_77
        0x72 -> :sswitch_79
    .end sparse-switch

    :sswitch_data_28
    .sparse-switch
        0x12 -> :sswitch_7a
        0x73 -> :sswitch_7d
    .end sparse-switch

    :sswitch_data_29
    .sparse-switch
        0x12 -> :sswitch_7b
        0x73 -> :sswitch_7e
    .end sparse-switch

    :sswitch_data_2a
    .sparse-switch
        0x13 -> :sswitch_7c
        0x2e9 -> :sswitch_7f
    .end sparse-switch

    :sswitch_data_2b
    .sparse-switch
        0x16 -> :sswitch_80
        0x37 -> :sswitch_85
        0x71 -> :sswitch_81
        0xd4 -> :sswitch_82
    .end sparse-switch

    :sswitch_data_2c
    .sparse-switch
        0xe -> :sswitch_83
        0x71 -> :sswitch_84
    .end sparse-switch

    :sswitch_data_2d
    .sparse-switch
        0x1e -> :sswitch_86
        0x3d -> :sswitch_8a
        0x7f -> :sswitch_87
        0x1dc -> :sswitch_88
    .end sparse-switch

    :sswitch_data_2e
    .sparse-switch
        0x16 -> :sswitch_83
        0x77 -> :sswitch_89
    .end sparse-switch

    :sswitch_data_2f
    .sparse-switch
        0x6f -> :sswitch_8b
        0x3d57 -> :sswitch_8d
        0x3d99 -> :sswitch_8c
        0x3db8 -> :sswitch_90
    .end sparse-switch

    :sswitch_data_30
    .sparse-switch
        0x12 -> :sswitch_83
        0x71 -> :sswitch_8e
    .end sparse-switch

    :sswitch_data_31
    .sparse-switch
        0x12 -> :sswitch_83
        0x71 -> :sswitch_8f
    .end sparse-switch

    :sswitch_data_32
    .sparse-switch
        0x11 -> :sswitch_92
        0x32 -> :sswitch_93
        0x53 -> :sswitch_9b
        0x74 -> :sswitch_94
    .end sparse-switch

    :sswitch_data_33
    .sparse-switch
        0x11 -> :sswitch_95
        0x32 -> :sswitch_96
        0x53 -> :sswitch_99
        0x7c -> :sswitch_97
    .end sparse-switch

    :sswitch_data_34
    .sparse-switch
        0x11 -> :sswitch_98
        0xea7 -> :sswitch_91
    .end sparse-switch

    :sswitch_data_35
    .sparse-switch
        0x13 -> :sswitch_9a
        0x32 -> :sswitch_91
    .end sparse-switch

    :sswitch_data_36
    .sparse-switch
        0x13 -> :sswitch_9c
        0x32 -> :sswitch_9d
    .end sparse-switch

    :sswitch_data_37
    .sparse-switch
        0xe -> :sswitch_9e
        0x31 -> :sswitch_9f
    .end sparse-switch

    :sswitch_data_38
    .sparse-switch
        0x11 -> :sswitch_a0
        0x36 -> :sswitch_a1
        0x57 -> :sswitch_a4
        0x74 -> :sswitch_a2
    .end sparse-switch

    :sswitch_data_39
    .sparse-switch
        0x11 -> :sswitch_a3
        0xfdab -> :sswitch_a5
    .end sparse-switch

    :sswitch_data_3a
    .sparse-switch
        0xe -> :sswitch_a5
        0x2f -> :sswitch_a6
    .end sparse-switch

    :sswitch_data_3b
    .sparse-switch
        0x17 -> :sswitch_a7
        0x36 -> :sswitch_a8
    .end sparse-switch

    :sswitch_data_3c
    .sparse-switch
        0x12 -> :sswitch_1a
        0x31 -> :sswitch_a9
    .end sparse-switch

    :sswitch_data_3d
    .sparse-switch
        0x11 -> :sswitch_aa
        0x32 -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_3e
    .sparse-switch
        0x12 -> :sswitch_5f
        0x33 -> :sswitch_ab
    .end sparse-switch
.end method
