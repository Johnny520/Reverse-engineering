.class public abstract Luv;
.super Ljava/lang/Object;


# static fields
.field public static final a:Landroid/os/Handler;

.field public static b:Ljava/lang/Object;

.field public static final c:Ljava/util/LinkedHashMap;

.field public static d:Ljava/lang/Object;

.field public static e:Ljava/lang/reflect/Method;

.field public static f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "\u06e8\u06e1"

    invoke-static {v0}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Luv;->c:Ljava/util/LinkedHashMap;

    sget v0, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    if-gtz v0, :cond_0

    const-string v0, "\u06e8\u06e1"

    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e6\u06e4\u06e1"

    :goto_1
    invoke-static {v0}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    sget v0, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    add-int/lit16 v1, v1, 0x33e

    or-int/2addr v0, v1

    if-gtz v0, :cond_1

    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    const-string v0, "\u06e2\u06e2\u06e1"

    goto :goto_1

    :cond_1
    sget v0, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v1, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    xor-int/2addr v0, v1

    const v1, 0xe0b0

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Luv;->a:Landroid/os/Handler;

    sget v0, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v1, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    or-int/lit16 v1, v1, 0x60b

    sub-int/2addr v0, v1

    if-ltz v0, :cond_2

    const/16 v0, 0x47

    sput v0, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    const-string v0, "\u06e1\u06e6\u06e2"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    sget v0, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v1, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    or-int/2addr v0, v1

    const v1, 0xdcfd

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc7c -> :sswitch_0
        0xdcf9 -> :sswitch_2
        0x1aaf5d -> :sswitch_1
        0x1ac1e3 -> :sswitch_3
    .end sparse-switch
.end method

.method public static a(Ljava/lang/ClassLoader;)Ljava/lang/String;
    .locals 44

    const/16 v22, 0x0

    const/16 v20, 0x0

    const/16 v19, 0x0

    const/4 v3, 0x0

    const/16 v27, 0x0

    const/4 v14, 0x0

    const/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v35, 0x0

    const/16 v28, 0x0

    const/4 v8, 0x0

    const/16 v17, 0x0

    const/4 v4, 0x0

    const/4 v2, 0x0

    const/16 v29, 0x0

    const/16 v26, 0x0

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/16 v18, 0x0

    const/16 v23, 0x0

    const/16 v39, 0x0

    const/16 v21, 0x0

    const/16 v38, 0x0

    const/16 v37, 0x0

    const/16 v43, 0x0

    const/16 v42, 0x0

    const/4 v5, 0x0

    const/16 v40, 0x0

    const/16 v25, 0x0

    const/16 v24, 0x0

    const/16 v30, 0x0

    const/16 v16, 0x0

    const-string v31, "\u06e8\u06e4\u06e6"

    invoke-static/range {v31 .. v31}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v41

    move-object/from16 v31, v3

    move-object/from16 v32, v5

    move-object/from16 v33, v6

    :goto_0
    sparse-switch v41, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v3, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v5, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    mul-int/2addr v3, v5

    const v5, -0x1b94a0

    xor-int/2addr v3, v5

    move/from16 v41, v3

    goto :goto_0

    :sswitch_1
    sget v3, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v5, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    div-int/lit16 v5, v5, -0x100c

    xor-int/2addr v3, v5

    if-ltz v3, :cond_1

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    const-string v3, "\u06e5\u06e3\u06df"

    move-object v6, v3

    :goto_1
    invoke-static {v6}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto :goto_0

    :cond_1
    sget v3, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v5, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    add-int/2addr v3, v5

    const v5, -0x1ac24c

    xor-int/2addr v3, v5

    move/from16 v41, v3

    goto :goto_0

    :sswitch_2
    :try_start_0
    sget-object v3, Lpb0;->q:Ljava/lang/String;

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    move-object/from16 v0, v34

    invoke-static {v0, v3, v5}, Lde/robv/android/xposed/XposedHelpers;->callStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lpb0;->r:Ljava/lang/String;

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v3, v5, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    move-result-object v8

    sget v3, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v5, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    add-int/lit16 v5, v5, -0x163b

    or-int/2addr v3, v5

    if-ltz v3, :cond_3

    :cond_2
    const-string v5, "\u06df\u06e3\u06e7"

    move-object v3, v9

    :goto_2
    invoke-static {v5}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v5

    move-object v9, v3

    move/from16 v41, v5

    goto :goto_0

    :cond_3
    const-string v3, "\u06e1\u06e8\u06e6"

    invoke-static {v3}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto :goto_0

    :sswitch_3
    const-string v2, "tKn3K9SX88qToOS8H2F7Ak0=\n"

    const-string v3, "98WWWKfbnKs=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    :goto_3
    :sswitch_4
    return-object v9

    :sswitch_5
    sget v3, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v5, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    add-int/lit16 v5, v5, 0x1723

    add-int/2addr v3, v5

    if-gtz v3, :cond_4

    invoke-static {}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۥۧۧ()I

    const-string v3, "\u06e2\u06e6\u06e5"

    invoke-static {v3}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v3

    move-object v7, v13

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_4
    sget v3, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v5, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    xor-int/2addr v3, v5

    const v5, 0x1ac5d5

    add-int/2addr v3, v5

    move-object v7, v13

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_6
    :try_start_1
    const-string v3, "ZZAf+pxHew==\n"

    const-string v5, "NsVcudkUKI4=\n"

    invoke-static {v3, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v9

    goto :goto_3

    :sswitch_7
    sget v3, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v5, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    mul-int/lit16 v5, v5, 0x1ec

    mul-int/2addr v3, v5

    if-gtz v3, :cond_5

    const/16 v3, 0x8

    sput v3, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    const-string v3, "\u06e0\u06e4\u06e6"

    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v37, v14

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_5
    sget v3, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v5, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    mul-int/2addr v3, v5

    const v5, -0x1cce9e

    xor-int/2addr v3, v5

    move-object/from16 v37, v14

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_6
    :sswitch_8
    const-string v3, "\u06e7\u06e8"

    :goto_4
    invoke-static {v3}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    move-result v3

    if-ltz v3, :cond_7

    const-string v3, "\u06e7\u06e1"

    invoke-static {v3}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v3

    move-object v11, v7

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_7
    move-object v3, v7

    :goto_5
    const-string v6, "\u06e3\u06e3\u06e0"

    move-object/from16 v5, v21

    move-object v11, v3

    :goto_6
    invoke-static {v6}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v21, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_8
    :sswitch_a
    const-string v3, "\u06e2\u06e6\u06e5"

    :goto_7
    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_b
    if-nez v37, :cond_49

    :try_start_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    move-result v5

    if-ltz v5, :cond_9

    invoke-static {}, Landroidx/recyclerview/widget/ۧۧۦۢ;->ۣۢۦۨ()I

    const-string v5, "\u06e8\u06e1\u06e3"

    invoke-static {v5}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v32, v3

    move/from16 v41, v5

    goto/16 :goto_0

    :cond_9
    sget v5, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v6, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    add-int/2addr v5, v6

    const v6, 0x1aac3b

    add-int/2addr v5, v6

    move-object/from16 v32, v3

    move/from16 v41, v5

    goto/16 :goto_0

    :catchall_0
    move-exception v3

    :try_start_3
    const-string v3, "r+kXlEPNEFOQxT6iUuAbRIc=\n"

    const-string v5, "4ppwxyajdDY=\n"

    invoke-static {v3, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "Nwje\n"

    const-string v6, "Q2m5jaPP2Zc=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "Fg==\n"

    const-string v5, "c8HJlSTQVfc=\n"

    invoke-static {v3, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const/4 v7, 0x0

    sget v3, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v5, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    add-int/lit16 v5, v5, -0xe6a

    mul-int/2addr v3, v5

    if-ltz v3, :cond_a

    const-string v3, "\u06e0\u06df\u06e6"

    invoke-static {v3}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u06e7\u06e0\u06e8"

    move-object/from16 v3, v19

    move-object/from16 v5, v20

    :goto_8
    invoke-static {v6}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v19, v3

    move-object/from16 v20, v5

    move/from16 v41, v6

    goto/16 :goto_0

    :sswitch_c
    :try_start_4
    invoke-virtual/range {v39 .. v39}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    const/4 v5, 0x0

    aget-object v3, v3, v5

    move-object/from16 v0, v22

    invoke-virtual {v3, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-result v3

    if-eqz v3, :cond_43

    sget v3, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v5, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    or-int/2addr v3, v5

    const v5, -0x1aab22

    xor-int/2addr v3, v5

    move-object/from16 v38, v39

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_d
    :try_start_5
    const-string v3, "NeXh0efxoaJqvc+1ucL+6mP5mLjriMiUN/zB3ujI\n"

    const-string v5, "0lhwNlxtRwI=\n"

    invoke-static {v3, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-result-object v3

    sget v5, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    if-ltz v5, :cond_b

    const-string v5, "\u06e7\u06e2\u06e5"

    :goto_9
    invoke-static {v5}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v5

    move-object v9, v3

    move/from16 v41, v5

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u06df\u06df\u06e1"

    goto/16 :goto_2

    :sswitch_e
    :try_start_6
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    move-result-object v29

    sget v3, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v5, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    or-int/2addr v3, v5

    const v5, -0x1ac892

    xor-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_f
    :try_start_7
    sput-boolean v24, Luv;->f:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    sget v3, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v5, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    add-int/lit16 v5, v5, 0x1812

    xor-int/2addr v3, v5

    if-ltz v3, :cond_c

    const/16 v3, 0x2a

    sput v3, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    const-string v3, "\u06e5\u06e0\u06e4"

    invoke-static {v3}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e2\u06df\u06e0"

    move-object v5, v3

    :goto_a
    invoke-static {v5}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_10
    sget v3, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v5, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    or-int/2addr v3, v5

    const v5, 0x1abd54

    xor-int/2addr v3, v5

    move-object/from16 v37, v38

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_11
    sget v3, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v5, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    rem-int/lit16 v5, v5, 0x1a3c

    sub-int/2addr v3, v5

    if-ltz v3, :cond_d

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    const-string v3, "\u06e6\u06e0"

    invoke-static {v3}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v24, v40

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_d
    sget v3, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v5, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    or-int/2addr v3, v5

    const v5, -0xdd81

    xor-int/2addr v3, v5

    move/from16 v24, v40

    move/from16 v41, v3

    goto/16 :goto_0

    :catchall_1
    move-exception v3

    sget v5, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    if-ltz v5, :cond_e

    const/16 v5, 0x11

    sput v5, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    const-string v5, "\u06e6\u06e3\u06e4"

    invoke-static {v5}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v31, v3

    move/from16 v41, v5

    goto/16 :goto_0

    :cond_e
    sget v5, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v6, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    or-int/2addr v5, v6

    const v6, 0xda37

    add-int/2addr v5, v6

    move-object/from16 v31, v3

    move/from16 v41, v5

    goto/16 :goto_0

    :sswitch_12
    sget v3, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v5, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    mul-int/lit16 v5, v5, 0x125b

    div-int/2addr v3, v5

    if-eqz v3, :cond_f

    const-string v3, "\u06e3\u06df\u06e4"

    invoke-static {v3}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    move/from16 v42, v23

    goto/16 :goto_0

    :cond_f
    const-string v3, "\u06e5\u06e2\u06df"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    move/from16 v42, v23

    goto/16 :goto_0

    :sswitch_13
    :try_start_8
    const-string v3, "IiG+Cs95AIAgMK8o+nIRiDZs5HSAIg==\n"

    const-string v5, "RUTKWq4LYe0=\n"

    invoke-static {v3, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v21

    invoke-static {v3, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    sget v3, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v5, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    div-int/2addr v3, v5

    const v5, 0x1ac58b

    add-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_14
    sget v3, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v5, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    xor-int/lit16 v5, v5, 0x7eb

    rem-int/2addr v3, v5

    if-gtz v3, :cond_10

    const-string v3, "\u06e6\u06e8\u06e5"

    :goto_b
    invoke-static {v3}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_10
    const-string v3, "\u06e8\u06e4\u06e6"

    goto :goto_b

    :sswitch_15
    if-nez v34, :cond_1e

    :try_start_9
    sget-object v5, Lpb0;->p:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "\u627e\u4e0d\u5230\u5185\u6838\u7c7b: "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    sget v6, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    if-gtz v6, :cond_11

    const-string v6, "\u06e5\u06df"

    invoke-static {v6}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v35, v3

    move-object/from16 v36, v5

    move/from16 v41, v6

    goto/16 :goto_0

    :cond_11
    const-string v6, "\u06e3\u06e1\u06e2"

    invoke-static {v6}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v35, v3

    move-object/from16 v36, v5

    move/from16 v41, v6

    goto/16 :goto_0

    :sswitch_16
    :try_start_a
    sget-object v3, Lpb0;->L0:Ljava/lang/String;

    const/4 v5, 0x0

    move-object/from16 v0, v17

    invoke-virtual {v0, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    move-result-object v3

    :goto_c
    const-string v5, "\u06e2\u06e6\u06df"

    move-object/from16 v26, v3

    move/from16 v6, v27

    :goto_d
    invoke-static {v5}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v27, v6

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_12
    :sswitch_17
    sget v3, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    if-gtz v3, :cond_13

    const-string v5, "\u06e1\u06e5\u06e4"

    move-object v3, v10

    :goto_e
    invoke-static {v5}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v5

    move-object v10, v3

    move/from16 v41, v5

    goto/16 :goto_0

    :cond_13
    const-string v3, "\u06e4\u06e8\u06e6"

    move/from16 v5, v18

    :goto_f
    invoke-static {v3}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v18, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_18
    :try_start_b
    invoke-virtual/range {v35 .. v35}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    move-result-object v28

    const-string v3, "\u06e5\u06e2\u06e4"

    invoke-static {v3}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_19
    if-nez p0, :cond_22

    const-string v3, "\u06e1\u06e1\u06e1"

    :goto_10
    invoke-static {v3}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_14
    :sswitch_1a
    sget v3, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v5, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    rem-int/lit16 v5, v5, 0x2417

    div-int/2addr v3, v5

    if-eqz v3, :cond_15

    const-string v3, "\u06e4\u06e5\u06e1"

    move-object v5, v11

    :goto_11
    invoke-static {v3}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v3

    move-object v11, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_15
    sget v3, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v5, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    rem-int/2addr v3, v5

    const v5, 0x1ac18d

    add-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_1b
    :try_start_c
    invoke-virtual/range {v37 .. v37}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    array-length v3, v3
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    const/4 v5, 0x2

    if-ne v3, v5, :cond_37

    const/16 v40, 0x1

    sget v3, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v5, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    add-int/lit16 v5, v5, -0x1bbd

    add-int/2addr v3, v5

    if-ltz v3, :cond_16

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    const-string v3, "\u06e2\u06df\u06e0"

    invoke-static {v3}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_16
    const-string v3, "\u06e8\u06e1\u06e3"

    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_1c
    const/4 v3, 0x0

    const/4 v5, 0x0

    :try_start_d
    move-object/from16 v0, v26

    invoke-virtual {v0, v3, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    move-result-object v3

    sget v5, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v6, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    div-int/lit16 v6, v6, -0x1663

    xor-int/2addr v5, v6

    if-ltz v5, :cond_17

    :goto_12
    const-string v5, "\u06e7\u06e6\u06e0"

    invoke-static {v5}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v5

    move-object v13, v3

    move/from16 v41, v5

    goto/16 :goto_0

    :cond_17
    sget v5, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v6, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    div-int/2addr v5, v6

    const v6, 0x1aa704

    add-int/2addr v5, v6

    move-object v13, v3

    move/from16 v41, v5

    goto/16 :goto_0

    :sswitch_1d
    const-string v3, "\u06e6\u06e3\u06e1"

    move-object v11, v15

    :goto_13
    invoke-static {v3}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_18
    :sswitch_1e
    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    move-result v3

    if-ltz v3, :cond_19

    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    const-string v3, "\u06e1\u06e1\u06e0"

    invoke-static {v3}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_19
    sget v3, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v5, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    xor-int/2addr v3, v5

    const v5, -0xde91

    xor-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_1f
    const/4 v3, 0x0

    sget v5, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v6, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    mul-int/lit16 v6, v6, 0x1d3c

    mul-int/2addr v5, v6

    if-gtz v5, :cond_1a

    :goto_14
    const-string v5, "\u06e4\u06e6\u06e5"

    move-object v14, v3

    goto/16 :goto_a

    :cond_1a
    const-string v5, "\u06e8\u06e7\u06e3"

    invoke-static {v5}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v5

    move-object v14, v3

    move/from16 v41, v5

    goto/16 :goto_0

    :sswitch_20
    sget v3, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v5, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    xor-int/lit16 v5, v5, 0x1f7d

    xor-int/2addr v3, v5

    if-gtz v3, :cond_1b

    const-string v3, "\u06df\u06df\u06e2"

    invoke-static {v3}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_1b
    sget v3, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v5, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    or-int/2addr v3, v5

    const v5, -0xdcad

    xor-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_1c
    :sswitch_21
    sget v3, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v5, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    add-int/lit16 v5, v5, -0x1625

    add-int/2addr v3, v5

    if-ltz v3, :cond_1d

    const-string v3, "\u06e4\u06e3\u06e2"

    :goto_15
    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_1d
    sget v3, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v5, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    or-int/2addr v3, v5

    const v5, -0x1abd8a

    xor-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_22
    :try_start_e
    invoke-virtual/range {v39 .. v39}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v10}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_43

    invoke-virtual/range {v39 .. v39}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    move-result-object v3

    const-string v6, "\u06e1\u06e1\u06e8"

    move-object v5, v3

    goto/16 :goto_6

    :cond_1e
    :sswitch_23
    sget v3, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    if-ltz v3, :cond_1f

    const/16 v3, 0x12

    sput v3, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    const-string v3, "\u06e8\u06e3\u06e2"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_1f
    const-string v3, "\u06e7\u06df\u06e7"

    goto/16 :goto_4

    :sswitch_24
    sget v3, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    if-ltz v3, :cond_20

    const/16 v3, 0x55

    sput v3, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    const-string v3, "\u06e7\u06e3\u06e1"

    invoke-static {v3}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_20
    const-string v5, "\u06e2\u06e5\u06df"

    move-object v3, v9

    goto/16 :goto_9

    :sswitch_25
    if-nez v11, :cond_12

    sget v3, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v5, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    rem-int/2addr v3, v5

    const v5, 0x1ac60c

    add-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_26
    :try_start_f
    sget-object v3, Lpb0;->Z:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_25

    sget-object v3, Lpb0;->Z:Ljava/lang/String;

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v7, v3, v5}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    move-result-object v3

    sget v5, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v6, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    div-int/lit16 v6, v6, 0x1976

    or-int/2addr v5, v6

    if-ltz v5, :cond_21

    const/16 v5, 0x2d

    sput v5, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    :goto_16
    const-string v5, "\u06e1\u06e2"

    invoke-static {v5}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v5

    move-object v15, v3

    move/from16 v41, v5

    goto/16 :goto_0

    :cond_21
    sget v5, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v6, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    div-int/2addr v5, v6

    const v6, 0x1ac5ce

    add-int/2addr v5, v6

    move-object v15, v3

    move/from16 v41, v5

    goto/16 :goto_0

    :sswitch_27
    :try_start_10
    sget-object v3, Lpb0;->s:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_0

    sget-object v3, Lpb0;->s:Ljava/lang/String;

    invoke-static {v7, v3}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    move-result-object v12

    const-string v3, "\u06e7\u06e1\u06e8"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_28
    :try_start_11
    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    const-string v3, "\u06e3\u06e2\u06e8"

    move-object v5, v3

    goto/16 :goto_a

    :cond_22
    :sswitch_29
    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    move-result v3

    if-gtz v3, :cond_23

    const-string v3, "\u06e7\u06e2\u06e4"

    goto/16 :goto_7

    :cond_23
    const-string v3, "\u06e0\u06e6\u06e8"

    invoke-static {v3}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_2a
    :try_start_12
    invoke-virtual/range {v35 .. v36}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    sget v3, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v5, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    add-int/lit16 v5, v5, 0x1baa

    div-int/2addr v3, v5

    if-eqz v3, :cond_24

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۣۡۧۢ()I

    const-string v3, "\u06e3\u06e6\u06e1"

    invoke-static {v3}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_24
    sget v3, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v5, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sub-int/2addr v3, v5

    const v5, 0x1aabe4

    add-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_25
    :sswitch_2b
    sget v3, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v5, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    div-int/2addr v3, v5

    const v5, -0x1ac1cf

    xor-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_2c
    const-string v3, "Nwje\n"

    const-string v5, "Q2m5jaPP2Zc=\n"

    const-string v6, "/lLZzMGyqdPBfvfxzag=\n"

    const-string v16, "syG+n6TczbY=\n"

    move-object/from16 v0, v16

    invoke-static {v6, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v16, "Fg==\n"

    const-string v41, "c8HJlSTQVfc=\n"

    move-object/from16 v0, v16

    move-object/from16 v1, v41

    invoke-static {v3, v5, v6, v0, v1}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {v31 .. v31}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "\u521d\u59cb\u5316\u5d29\u6e83: "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v5, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    if-gtz v5, :cond_26

    const-string v6, "\u06e3\u06e3\u06e5"

    move-object/from16 v5, v17

    :goto_17
    invoke-static {v6}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v16, v3

    move-object/from16 v17, v5

    move/from16 v41, v6

    goto/16 :goto_0

    :cond_26
    sget v5, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v6, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    or-int/2addr v5, v6

    const v6, 0x1ab344

    add-int/2addr v5, v6

    move-object/from16 v16, v3

    move/from16 v41, v5

    goto/16 :goto_0

    :sswitch_2d
    :try_start_13
    sget-object v3, Lpb0;->b:Ljava/lang/String;

    move-object/from16 v0, p0

    invoke-static {v3, v0}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_1

    move-result-object v5

    const-string v6, "\u06df\u06e6\u06e0"

    move-object/from16 v3, v16

    goto :goto_17

    :sswitch_2e
    sget v3, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v5, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    mul-int/2addr v3, v5

    const v5, 0x1c8c2f

    add-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_2f
    const/4 v3, 0x1

    :try_start_14
    move-object/from16 v0, v26

    invoke-virtual {v0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_0

    sget v3, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    if-gtz v3, :cond_27

    const/16 v3, 0x20

    sput v3, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    const-string v3, "\u06e4\u06e8\u06e6"

    goto/16 :goto_10

    :cond_27
    sget v3, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v5, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    mul-int/2addr v3, v5

    const v5, -0x1bf0c7

    xor-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_30
    if-nez v7, :cond_2b

    sget v3, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v5, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    or-int/lit16 v5, v5, -0x1bff

    mul-int/2addr v3, v5

    if-ltz v3, :cond_29

    :cond_28
    const-string v3, "\u06e4\u06e3\u06e0"

    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_29
    move-object v3, v14

    goto/16 :goto_14

    :sswitch_31
    :try_start_15
    const-string v3, "vBMm5Z3gDeq/BXqG1rpM\n"

    const-string v5, "23ZSqPiUZYU=\n"

    invoke-static {v3, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v33

    invoke-static {v3, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, v33

    array-length v5, v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_1

    sget v3, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v6, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    mul-int/lit16 v6, v6, -0x15df

    mul-int/2addr v3, v6

    if-gtz v3, :cond_2a

    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    const-string v3, "\u06e5\u06e7"

    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v18, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_2a
    const-string v3, "\u06e6\u06e0\u06e0"

    goto/16 :goto_f

    :cond_2b
    :sswitch_32
    sget v3, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    if-gtz v3, :cond_2c

    const/16 v3, 0x3b

    sput v3, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    const-string v3, "\u06df\u06e7\u06e4"

    move/from16 v5, v18

    goto/16 :goto_f

    :cond_2c
    sget v3, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v5, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    add-int/2addr v3, v5

    const v5, 0xd6a3

    add-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_33
    const/16 v25, 0x0

    sget v3, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v5, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    mul-int/lit16 v5, v5, -0x1dae

    mul-int/2addr v3, v5

    if-ltz v3, :cond_2d

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    const-string v3, "\u06e7\u06df\u06e7"

    invoke-static {v3}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_2d
    sget v3, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v5, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    or-int/2addr v3, v5

    const v5, 0x1ac7cc

    add-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_34
    move-object/from16 v9, v28

    goto/16 :goto_3

    :sswitch_35
    sget v3, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v5, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    add-int/lit16 v5, v5, -0x12b7

    div-int/2addr v3, v5

    if-eqz v3, :cond_2e

    const-string v3, "\u06e8\u06e5\u06e2"

    invoke-static {v3}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_2e
    sget v3, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v5, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    xor-int/2addr v3, v5

    const v5, 0x1aab24

    add-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_36
    const-string v3, "\u06df\u06df\u06e5"

    goto/16 :goto_4

    :sswitch_37
    add-int/lit8 v43, v42, 0x1

    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    move-result v3

    if-gtz v3, :cond_2f

    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    const-string v3, "\u06e1\u06df\u06df"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_2f
    sget v3, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v5, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    div-int/2addr v3, v5

    const v5, 0x1ab9f3

    add-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_38
    :try_start_16
    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    goto/16 :goto_3

    :sswitch_39
    sget-object v3, Lpb0;->r:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_1

    move-result v6

    sget v3, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    if-ltz v3, :cond_30

    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    const-string v3, "\u06e4\u06e0\u06e1"

    invoke-static {v3}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v27, v6

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_30
    const-string v3, "\u06e0\u06df\u06e0"

    move-object v5, v3

    goto/16 :goto_d

    :sswitch_3a
    :try_start_17
    sget-object v3, Lpb0;->a:Ljava/lang/String;

    move-object/from16 v0, p0

    invoke-static {v3, v0}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_1

    move-result-object v3

    invoke-static {}, Landroidx/appcompat/app/ۥۦۣ۠;->ۨۤ۠ۨ()I

    move-result v5

    if-gtz v5, :cond_31

    const/16 v5, 0x39

    sput v5, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    const-string v5, "\u06e7\u06e0\u06e8"

    invoke-static {v5}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v22, v3

    move/from16 v41, v5

    goto/16 :goto_0

    :cond_31
    move/from16 v5, v23

    :goto_18
    const-string v6, "\u06e1\u06e4\u06e7"

    move-object/from16 v22, v3

    move/from16 v23, v5

    :goto_19
    invoke-static {v6}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_3b
    :try_start_18
    move-object/from16 v0, v21

    array-length v3, v0
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_1

    if-eqz v3, :cond_2

    :sswitch_3c
    sget v3, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    if-ltz v3, :cond_48

    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    const-string v3, "\u06e3\u06e5\u06e0"

    :goto_1a
    invoke-static {v3}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_3d
    sget v3, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    if-gtz v3, :cond_32

    const/16 v3, 0x2d

    sput v3, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    const-string v3, "\u06e6\u06e8\u06e0"

    invoke-static {v3}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_32
    sget v3, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v5, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    add-int/2addr v3, v5

    const v5, 0xdc24

    add-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_3e
    :try_start_19
    invoke-virtual/range {v32 .. v32}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_1

    move-result-object v9

    goto/16 :goto_3

    :sswitch_3f
    sget v3, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v5, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    mul-int/2addr v3, v5

    const v5, 0x1fd078

    add-int/2addr v3, v5

    move/from16 v41, v3

    move/from16 v42, v43

    goto/16 :goto_0

    :sswitch_40
    sget v3, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v5, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    rem-int/lit16 v5, v5, 0x813

    mul-int/2addr v3, v5

    if-gtz v3, :cond_33

    invoke-static {}, Landroidx/activity/ۣ۟۠ۤۢ;->۟۠۠ۤۥ()I

    const-string v3, "\u06e6\u06e5"

    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_33
    const-string v3, "\u06e8\u06e1\u06e8"

    move/from16 v5, v24

    :goto_1b
    invoke-static {v3}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v24, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_41
    :try_start_1a
    const-string v3, "\u5728\u961f\u5217\u91cc\u627e\u4e0d\u5230\u5b57\u5178\u6307\u5b9a\u7684\u5206\u53d1\u65b9\u6cd5\uff1a"

    move-object/from16 v0, v32

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_1

    sget v3, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v5, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    add-int/2addr v3, v5

    const v5, 0x1abf41

    add-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_42
    sget v3, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v5, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    xor-int/lit16 v5, v5, 0x240c

    sub-int/2addr v3, v5

    if-ltz v3, :cond_34

    const-string v3, "\u06e3\u06e1\u06e7"

    invoke-static {v3}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_34
    sget v3, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v5, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    rem-int/2addr v3, v5

    const v5, 0x1aaf12

    add-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_43
    sget v3, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v5, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    add-int/lit16 v5, v5, 0x1871

    mul-int/2addr v3, v5

    if-ltz v3, :cond_35

    invoke-static {}, Landroidx/savedstate/۠ۡۢ۠;->ۣ۟ۨۤۨ()I

    const-string v3, "\u06e5\u06e6\u06e6"

    invoke-static {v3}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_35
    const-string v3, "\u06df\u06e8\u06e5"

    goto/16 :goto_1a

    :sswitch_44
    move/from16 v0, v42

    move/from16 v1, v18

    if-ge v0, v1, :cond_18

    :try_start_1b
    aget-object v39, v33, v42
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_1

    const-string v3, "\u06e0\u06df\u06e6"

    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_45
    const-string v2, "v0HACepviA==\n"

    const-string v3, "7BSDSq88274=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto/16 :goto_3

    :sswitch_46
    :try_start_1c
    move-object/from16 v0, v32

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_1

    sget v3, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    if-gtz v3, :cond_36

    const/16 v3, 0x4d

    sput v3, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    const-string v3, "\u06e8\u06e2\u06e6"

    invoke-static {v3}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_36
    const-string v3, "\u06e2\u06e3\u06e1"

    move-object v6, v3

    goto/16 :goto_19

    :cond_37
    :sswitch_47
    const-string v3, "\u06e3\u06df\u06e4"

    goto/16 :goto_4

    :sswitch_48
    if-nez v22, :cond_1c

    :try_start_1d
    sget-object v5, Lpb0;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "\u627e\u4e0d\u5230\u53d1\u5305\u57fa\u7c7b: "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_1

    sget v6, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v19, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    move/from16 v0, v19

    add-int/lit16 v0, v0, -0xc56

    move/from16 v19, v0

    xor-int v6, v6, v19

    if-ltz v6, :cond_38

    const-string v6, "\u06e8\u06e4\u06e6"

    goto/16 :goto_8

    :cond_38
    sget v6, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v19, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sub-int v6, v6, v19

    const v19, -0x1aabdf

    xor-int v6, v6, v19

    move-object/from16 v19, v3

    move-object/from16 v20, v5

    move/from16 v41, v6

    goto/16 :goto_0

    :catchall_2
    move-exception v3

    :try_start_1e
    const-string v3, "LE/NS8tC3joTY/tty1nfEANW\n"

    const-string v5, "YTyqGK4sul8=\n"

    invoke-static {v3, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "Nwje\n"

    const-string v6, "Q2m5jaPP2Zc=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "Fg==\n"

    const-string v5, "c8HJlSTQVfc=\n"

    invoke-static {v3, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget-object v3, Lpb0;->s:Ljava/lang/String;

    sget-object v5, Lpb0;->Z:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v41, "\u961f\u5217\u63d0\u53d6\u5f02\u5e38(\u5b57\u6bb5"

    move-object/from16 v0, v41

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/\u65b9\u6cd5"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_1

    move-result-object v30

    sget v3, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v5, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    div-int/lit16 v5, v5, 0x4a7

    sub-int/2addr v3, v5

    if-ltz v3, :cond_39

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    const-string v3, "\u06e4\u06e6\u06e1"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_39
    sget v3, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v5, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    rem-int/2addr v3, v5

    const v5, 0x1ac5e2

    xor-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_49
    sget v3, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v5, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    rem-int/lit16 v5, v5, 0x23b4

    div-int/2addr v3, v5

    if-ltz v3, :cond_3a

    move-object v3, v12

    goto/16 :goto_5

    :cond_3a
    const-string v3, "\u06e3\u06e6\u06e1"

    move-object v5, v12

    goto/16 :goto_11

    :sswitch_4a
    invoke-static {}, Landroidx/activity/ۣ۟۠ۤۢ;->۟۠۠ۤۥ()I

    move-result v3

    if-ltz v3, :cond_3b

    const/16 v3, 0x9

    sput v3, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    const-string v3, "\u06df\u06e2\u06e4"

    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_3b
    sget v3, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v5, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    rem-int/2addr v3, v5

    const v5, -0x1aaf7c

    xor-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_4b
    move-object/from16 v9, v29

    goto/16 :goto_3

    :sswitch_4c
    :try_start_1f
    sput-object v11, Luv;->d:Ljava/lang/Object;
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_1

    sget v3, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v5, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    add-int/2addr v3, v5

    const v5, -0xddfd

    xor-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_4d
    sget v3, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    if-gtz v3, :cond_3c

    const/16 v3, 0x54

    sput v3, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    const-string v3, "\u06e1\u06e8\u06e6"

    invoke-static {v3}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_3c
    sget v3, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v5, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    or-int/2addr v3, v5

    const v5, 0x1abaa0

    add-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_4e
    :try_start_20
    sget-object v3, Lpb0;->H:Ljava/lang/String;
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_1

    sget v5, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v6, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    add-int/lit16 v6, v6, 0x412

    xor-int/2addr v5, v6

    if-gtz v5, :cond_3d

    const/16 v5, 0xc

    sput v5, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    const-string v5, "\u06df\u06df\u06e5"

    invoke-static {v5}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v5

    move-object v10, v3

    move/from16 v41, v5

    goto/16 :goto_0

    :cond_3d
    const-string v5, "\u06e2\u06e7\u06e7"

    goto/16 :goto_e

    :sswitch_4f
    const/4 v5, 0x0

    sget v3, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v6, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    add-int/lit16 v6, v6, -0x17a7

    sub-int/2addr v3, v6

    if-gtz v3, :cond_3e

    move-object/from16 v3, v22

    goto/16 :goto_18

    :cond_3e
    sget v3, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v6, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    or-int/2addr v3, v6

    const v6, 0x1ab5ee

    add-int/2addr v3, v6

    move/from16 v41, v3

    move/from16 v23, v5

    goto/16 :goto_0

    :sswitch_50
    :try_start_21
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_1

    move-object v3, v15

    goto/16 :goto_16

    :sswitch_51
    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    goto/16 :goto_3

    :catchall_3
    move-exception v3

    :try_start_22
    sget-object v3, Lpb0;->q:Ljava/lang/String;

    sget-object v5, Lpb0;->r:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v31, "\u5185\u6838\u7f51\u7edc\u65b9\u6cd5("

    move-object/from16 v0, v31

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " -> "

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ")\u8c03\u7528\u5931\u8d25"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_1

    move-result-object v9

    goto/16 :goto_3

    :sswitch_52
    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    move-result v3

    if-ltz v3, :cond_3f

    const-string v3, "\u06e3\u06e0\u06e7"

    :goto_1c
    invoke-static {v3}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_3f
    sget v3, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v5, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    rem-int/2addr v3, v5

    const v5, 0x1ac9f9

    add-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_53
    :try_start_23
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_1

    move-result-object v3

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    move-result v5

    if-gtz v5, :cond_40

    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    const-string v5, "\u06df\u06e6\u06e0"

    invoke-static {v5}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v33, v3

    move/from16 v41, v5

    goto/16 :goto_0

    :cond_40
    sget v5, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v6, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    div-int/2addr v5, v6

    const v6, 0x1ac568

    add-int/2addr v5, v6

    move-object/from16 v33, v3

    move/from16 v41, v5

    goto/16 :goto_0

    :sswitch_54
    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    move-result v3

    if-gtz v3, :cond_41

    const/16 v3, 0x43

    sput v3, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    const-string v3, "\u06e8\u06e3\u06e5"

    invoke-static {v3}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v3

    move-object v7, v8

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_41
    const-string v3, "\u06e8\u06e2\u06e6"

    move-object v6, v3

    move-object v7, v8

    goto/16 :goto_1

    :sswitch_55
    sget v3, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v5, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    add-int/lit16 v5, v5, -0x5db

    div-int/2addr v3, v5

    if-eqz v3, :cond_42

    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    const-string v3, "\u06e1\u06e5\u06e1"

    invoke-static {v3}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_42
    sget v3, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v5, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    div-int/2addr v3, v5

    const v5, 0x1aabdf

    add-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_43
    :sswitch_56
    invoke-static {}, Landroidx/core/content/ۥۨۤۦ;->۟۠۠۠ۥ()I

    move-result v3

    if-ltz v3, :cond_44

    invoke-static {}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۥۧۧ()I

    const-string v3, "\u06e7\u06e3\u06e7"

    invoke-static {v3}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_44
    const-string v3, "\u06e3\u06e7\u06e3"

    goto/16 :goto_4

    :sswitch_57
    sget-object v3, Luv;->d:Ljava/lang/Object;

    if-eqz v3, :cond_8

    sget-object v3, Luv;->e:Ljava/lang/reflect/Method;

    if-eqz v3, :cond_8

    sget v3, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    if-gtz v3, :cond_28

    const/16 v3, 0x19

    sput v3, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    const-string v3, "\u06e7\u06e8\u06e0"

    invoke-static {v3}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_58
    :try_start_24
    const-string v3, "sGfn4uo8YODIP/6StA8wkOZ7kr3rRyDC\n"

    const-string v5, "V9p2BVGgiXg=\n"

    invoke-static {v3, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_1

    move-result-object v9

    goto/16 :goto_3

    :sswitch_59
    sget v3, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v5, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    mul-int/lit16 v5, v5, 0x1772

    add-int/2addr v3, v5

    if-ltz v3, :cond_45

    const-string v3, "\u06e3\u06e5\u06e8"

    goto/16 :goto_13

    :cond_45
    const-string v3, "\u06e5\u06e2\u06df"

    goto/16 :goto_1c

    :sswitch_5a
    move-object/from16 v9, v30

    goto/16 :goto_3

    :sswitch_5b
    sget v3, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    if-ltz v3, :cond_46

    const/16 v3, 0x11

    sput v3, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    const-string v3, "\u06e0\u06df\u06e0"

    move/from16 v5, v25

    goto/16 :goto_1b

    :cond_46
    sget v3, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v5, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    xor-int/2addr v3, v5

    const v5, 0x1aab7a

    xor-int/2addr v3, v5

    move/from16 v24, v25

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_5c
    sget v3, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    if-gtz v3, :cond_47

    const-string v3, "\u06df\u06e8\u06e3"

    invoke-static {v3}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_47
    sget v3, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    add-int/2addr v3, v5

    const v5, 0x1ab84c

    xor-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_5d
    if-lez v27, :cond_14

    :try_start_25
    sget-object v3, Lpb0;->p:Ljava/lang/String;

    move-object/from16 v0, p0

    invoke-static {v3, v0}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_1

    move-result-object v3

    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v6, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    xor-int/2addr v5, v6

    const v6, -0x1aa841

    xor-int/2addr v5, v6

    move-object/from16 v34, v3

    move/from16 v41, v5

    goto/16 :goto_0

    :cond_48
    sget v3, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v5, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    xor-int/2addr v3, v5

    const v5, 0xdc9e

    add-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_49
    :sswitch_5e
    sget v3, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v5, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    add-int/lit16 v5, v5, 0xb7b

    div-int/2addr v3, v5

    if-eqz v3, :cond_4a

    const/16 v3, 0x3a

    sput v3, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    const-string v3, "\u06df\u06e6\u06e1"

    invoke-static {v3}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :cond_4a
    const-string v3, "\u06e6\u06e1\u06e2"

    invoke-static {v3}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_5f
    const-string v3, "\u06e7\u06e3\u06e2"

    goto/16 :goto_15

    :sswitch_60
    :try_start_26
    sput-object v37, Luv;->e:Ljava/lang/reflect/Method;
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_1

    sget v3, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    if-gtz v3, :cond_4b

    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    move-object/from16 v3, v26

    goto/16 :goto_c

    :cond_4b
    move-object v3, v13

    goto/16 :goto_12

    :sswitch_61
    invoke-static {}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟ۤۦۡ()I

    move-result v3

    if-ltz v3, :cond_4c

    const-string v3, "\u06e8\u06df\u06e1"

    goto/16 :goto_4

    :cond_4c
    sget v3, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v5, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    or-int/2addr v3, v5

    const v5, 0x1abe0a

    add-int/2addr v3, v5

    move/from16 v41, v3

    goto/16 :goto_0

    :sswitch_62
    if-nez v17, :cond_6

    :try_start_27
    sget-object v5, Lpb0;->b:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "\u627e\u4e0d\u5230\u7f51\u7edc\u6838\u5fc3\u7c7b: "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_1

    const-string v6, "\u06e5\u06e4\u06e5"

    move-object v2, v3

    move-object v4, v5

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe2 -> :sswitch_0
        0xdbe5 -> :sswitch_27
        0xdc21 -> :sswitch_e
        0xdc40 -> :sswitch_1
        0xdc82 -> :sswitch_42
        0xdc9a -> :sswitch_60
        0xdc9e -> :sswitch_4a
        0xdca2 -> :sswitch_5a
        0xdcba -> :sswitch_b
        0xdcbf -> :sswitch_30
        0xdcda -> :sswitch_1a
        0xdce1 -> :sswitch_16
        0xdcf8 -> :sswitch_c
        0x1aa701 -> :sswitch_4
        0x1aa705 -> :sswitch_5
        0x1aa783 -> :sswitch_4d
        0x1aa7d9 -> :sswitch_62
        0x1aa7e1 -> :sswitch_59
        0x1aa81a -> :sswitch_5f
        0x1aa81c -> :sswitch_20
        0x1aaac1 -> :sswitch_1f
        0x1aaac7 -> :sswitch_22
        0x1aab04 -> :sswitch_28
        0x1aab62 -> :sswitch_55
        0x1aab7f -> :sswitch_15
        0x1aaba2 -> :sswitch_57
        0x1aabb9 -> :sswitch_10
        0x1aabdf -> :sswitch_f
        0x1aae81 -> :sswitch_18
        0x1aaea9 -> :sswitch_1c
        0x1aaec1 -> :sswitch_3
        0x1aaec8 -> :sswitch_13
        0x1aaf24 -> :sswitch_48
        0x1aaf25 -> :sswitch_55
        0x1aaf9f -> :sswitch_54
        0x1ab243 -> :sswitch_6
        0x1ab244 -> :sswitch_41
        0x1ab281 -> :sswitch_8
        0x1ab2c0 -> :sswitch_3e
        0x1ab2fc -> :sswitch_2b
        0x1ab301 -> :sswitch_44
        0x1ab303 -> :sswitch_51
        0x1ab31b -> :sswitch_2f
        0x1ab321 -> :sswitch_3a
        0x1ab342 -> :sswitch_53
        0x1ab608 -> :sswitch_33
        0x1ab60a -> :sswitch_1
        0x1ab644 -> :sswitch_2a
        0x1ab649 -> :sswitch_21
        0x1ab669 -> :sswitch_38
        0x1ab680 -> :sswitch_26
        0x1ab681 -> :sswitch_12
        0x1ab685 -> :sswitch_3c
        0x1ab6de -> :sswitch_24
        0x1ab6ff -> :sswitch_37
        0x1ab71a -> :sswitch_17
        0x1ab720 -> :sswitch_36
        0x1ab9c6 -> :sswitch_2b
        0x1ab9e5 -> :sswitch_3f
        0x1aba05 -> :sswitch_20
        0x1aba41 -> :sswitch_45
        0x1aba65 -> :sswitch_61
        0x1aba9f -> :sswitch_56
        0x1abaa3 -> :sswitch_d
        0x1abae1 -> :sswitch_32
        0x1abae2 -> :sswitch_4e
        0x1abda9 -> :sswitch_39
        0x1abdab -> :sswitch_40
        0x1abde2 -> :sswitch_7
        0x1abde7 -> :sswitch_34
        0x1abe0a -> :sswitch_2d
        0x1abe26 -> :sswitch_50
        0x1abe65 -> :sswitch_52
        0x1abe66 -> :sswitch_46
        0x1ac166 -> :sswitch_4f
        0x1ac187 -> :sswitch_4c
        0x1ac1c4 -> :sswitch_25
        0x1ac1c7 -> :sswitch_23
        0x1ac205 -> :sswitch_59
        0x1ac266 -> :sswitch_5e
        0x1ac50f -> :sswitch_2
        0x1ac52f -> :sswitch_20
        0x1ac54e -> :sswitch_49
        0x1ac568 -> :sswitch_31
        0x1ac56a -> :sswitch_2e
        0x1ac585 -> :sswitch_3b
        0x1ac586 -> :sswitch_58
        0x1ac588 -> :sswitch_3d
        0x1ac5c3 -> :sswitch_43
        0x1ac5ca -> :sswitch_1d
        0x1ac5e1 -> :sswitch_1b
        0x1ac61f -> :sswitch_29
        0x1ac626 -> :sswitch_2c
        0x1ac8ce -> :sswitch_9
        0x1ac8d1 -> :sswitch_4b
        0x1ac8e8 -> :sswitch_a
        0x1ac90a -> :sswitch_11
        0x1ac90b -> :sswitch_5b
        0x1ac90f -> :sswitch_1e
        0x1ac92c -> :sswitch_5c
        0x1ac94a -> :sswitch_14
        0x1ac94c -> :sswitch_1e
        0x1ac96a -> :sswitch_19
        0x1ac984 -> :sswitch_35
        0x1ac985 -> :sswitch_56
        0x1ac9c4 -> :sswitch_5d
        0x1ac9c6 -> :sswitch_47
    .end sparse-switch
.end method

.method public static b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/String;
    .locals 12

    const/4 v11, 0x0

    const/4 v8, 0x0

    const-string v1, "\u06e5\u06e0\u06df"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v1

    move-object v7, v8

    move-object v2, v8

    move-object v9, v8

    move-object v10, v8

    move-object v6, v8

    move-object v5, v8

    move v3, v11

    move v4, v1

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    :try_start_0
    sget v1, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    xor-int/lit16 v1, v1, 0x12d

    aput-object v10, v7, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    move-result v1

    if-ltz v1, :cond_18

    const/16 v1, 0x39

    sput v1, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    const-string v1, "\u06e4\u06e1\u06e2"

    invoke-static {v1}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto :goto_0

    :cond_0
    :sswitch_1
    const-string v1, "\u06e5\u06e3\u06df"

    move-object v4, v1

    :goto_1
    invoke-static {v4}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    move-result v1

    if-gtz v1, :cond_1

    const/16 v1, 0x1e

    sput v1, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    const-string v1, "\u06e7\u06e0\u06e0"

    invoke-static {v1}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v1

    move-object v6, v5

    move v4, v1

    goto :goto_0

    :cond_1
    sget v1, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v4, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    or-int/2addr v1, v4

    const v4, -0x1aad41

    xor-int/2addr v1, v4

    move-object v6, v5

    move v4, v1

    goto :goto_0

    :sswitch_3
    move-object p1, v6

    :goto_2
    :sswitch_4
    return-object p1

    :catchall_0
    move-exception v1

    const-string v1, "Nwje\n"

    const-string v2, "Q2m5jaPP2Zc=\n"

    const-string v3, "T7vAHZLzb2Fwl/EohNgz\n"

    const-string v4, "AsinTvedCwQ=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Fg==\n"

    const-string v5, "c8HJlSTQVfc=\n"

    invoke-static {v1, v2, v3, v4, v5}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :sswitch_5
    if-nez v3, :cond_17

    sget v1, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v4, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    div-int/lit16 v4, v4, 0x19c8

    mul-int/2addr v1, v4

    if-eqz v1, :cond_2

    const/16 v1, 0x40

    sput v1, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    const-string v1, "\u06e6\u06e3\u06e4"

    invoke-static {v1}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto :goto_0

    :cond_2
    sget v1, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v4, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    div-int/2addr v1, v4

    const v4, 0x1aba05

    add-int/2addr v1, v4

    move v4, v1

    goto :goto_0

    :sswitch_6
    :try_start_1
    instance-of v1, v2, Ljava/lang/String;

    if-eqz v1, :cond_9

    move-object v0, v2

    check-cast v0, Ljava/lang/String;

    move-object v1, v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v4, "\u06e8\u06e7\u06e0"

    move-object v5, v1

    goto :goto_1

    :cond_3
    :sswitch_7
    sget v1, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    if-ltz v1, :cond_4

    const-string v1, "\u06df\u06e5\u06df"

    invoke-static {v1}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :cond_4
    const-string v1, "\u06e6\u06df\u06e3"

    move-object v4, v1

    goto :goto_1

    :sswitch_8
    const/4 v1, 0x0

    :try_start_2
    invoke-virtual {v9, v1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v2

    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    move-result v1

    if-gtz v1, :cond_5

    const-string v1, "\u06e0\u06e3\u06e7"

    :goto_3
    invoke-static {v1}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06e3\u06e7\u06df"

    :goto_4
    invoke-static {v1}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :sswitch_9
    const-string v1, "XjXme2Yk\n"

    const-string v4, "KVaAQUkLOIM=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1, v11}, Lb50;->N(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_b

    sget v1, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    if-ltz v1, :cond_6

    const-string v1, "\u06e0\u06e0\u06e1"

    invoke-static {v1}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :cond_6
    sget v1, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v4, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    div-int/2addr v1, v4

    const v4, 0xdc65

    xor-int/2addr v1, v4

    move v4, v1

    goto/16 :goto_0

    :sswitch_a
    if-nez p1, :cond_12

    sget v1, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v4, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    div-int/2addr v1, v4

    const v4, 0x1abe26

    add-int/2addr v1, v4

    move v4, v1

    goto/16 :goto_0

    :cond_7
    :sswitch_b
    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۣۡۧۢ()I

    move-result v1

    if-gtz v1, :cond_8

    const-string v1, "\u06e8\u06e3\u06e3"

    invoke-static {v1}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :cond_8
    sget v1, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v4, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    div-int/2addr v1, v4

    const v4, 0x1aa745

    add-int/2addr v1, v4

    move v4, v1

    goto/16 :goto_0

    :cond_9
    :sswitch_c
    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    move-result v1

    if-gtz v1, :cond_a

    const-string v1, "\u06e6\u06e4\u06df"

    invoke-static {v1}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :cond_a
    const-string v1, "\u06e1\u06e3\u06e8"

    move-object v4, v1

    goto/16 :goto_1

    :sswitch_d
    sget v1, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v4, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    mul-int/2addr v1, v4

    const v4, 0x175c89

    add-int/2addr v1, v4

    move v4, v1

    goto/16 :goto_0

    :cond_b
    :sswitch_e
    sget v1, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v4, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    or-int/2addr v1, v4

    const v4, 0x1abed2

    add-int/2addr v1, v4

    move v4, v1

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    move-result v1

    if-gtz v1, :cond_c

    const/4 v1, 0x6

    sput v1, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    const-string v1, "\u06e6\u06e3\u06e5"

    :goto_5
    invoke-static {v1}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :cond_c
    sget v1, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v4, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    div-int/2addr v1, v4

    const v4, 0x1aa705

    add-int/2addr v1, v4

    move v4, v1

    goto/16 :goto_0

    :sswitch_10
    sget v1, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v4, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    div-int/2addr v1, v4

    const v4, 0x1abe46

    add-int/2addr v1, v4

    move v4, v1

    goto/16 :goto_0

    :sswitch_11
    :try_start_3
    invoke-virtual {v6}, Ljava/lang/String;->length()I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result v3

    sget v1, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v4, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    or-int/lit16 v4, v4, -0x1722

    mul-int/2addr v1, v4

    if-ltz v1, :cond_d

    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    const-string v1, "\u06e3\u06e7\u06df"

    invoke-static {v1}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :cond_d
    const-string v1, "\u06df\u06df\u06e5"

    goto/16 :goto_3

    :sswitch_12
    :try_start_4
    sget v1, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    xor-int/lit16 v1, v1, -0xec

    aput-object p1, v7, v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-static {}, Landroidx/core/content/ۣ۟ۧ۠;->۟۟۠ۢۨ()I

    move-result v1

    if-ltz v1, :cond_e

    const-string v1, "\u06e6\u06e1\u06e8"

    invoke-static {v1}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :cond_e
    const-string v1, "\u06e7\u06e0\u06e0"

    :goto_6
    invoke-static {v1}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :sswitch_13
    :try_start_5
    sget v1, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    xor-int/lit8 v1, v1, 0x72

    aput-object v10, v7, v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    sget v1, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v4, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    add-int/lit16 v4, v4, 0x207c

    xor-int/2addr v1, v4

    if-gtz v1, :cond_f

    const-string v1, "\u06e3\u06e4\u06e1"

    invoke-static {v1}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :cond_f
    const-string v1, "\u06df\u06e3"

    goto :goto_6

    :cond_10
    :sswitch_14
    invoke-static {}, Landroidx/versionedparcelable/ۣۢۥ;->ۦۦۡۤ()I

    move-result v1

    if-gtz v1, :cond_11

    const-string v1, "\u06e4\u06e8\u06df"

    goto :goto_6

    :cond_11
    const-string v1, "\u06e8\u06e5\u06e6"

    invoke-static {v1}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :sswitch_15
    if-nez p0, :cond_10

    const-string v1, "\u06e6\u06e3\u06e4"

    invoke-static {v1}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :sswitch_16
    :try_start_6
    sget-object v1, Lin;->r:Ljava/lang/reflect/Method;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    const-string v4, "\u06e7\u06df\u06e6"

    invoke-static {v4}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v4

    move-object v9, v1

    goto/16 :goto_0

    :cond_12
    :sswitch_17
    sget v1, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v4, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    or-int/lit16 v4, v4, -0x1900

    rem-int/2addr v1, v4

    if-ltz v1, :cond_13

    invoke-static {}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۢۨۤ۟()I

    const-string v1, "\u06e2\u06e7\u06e6"

    goto/16 :goto_4

    :cond_13
    sget v1, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v4, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    rem-int/2addr v1, v4

    const v4, -0x1aabba

    xor-int/2addr v1, v4

    move v4, v1

    goto/16 :goto_0

    :sswitch_18
    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    move-result v1

    if-ltz v1, :cond_14

    const-string v1, "\u06e2\u06e0\u06e8"

    move-object v4, v1

    goto/16 :goto_1

    :cond_14
    sget v1, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v4, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    or-int/2addr v1, v4

    const v4, 0x1ac019

    add-int/2addr v1, v4

    move v4, v1

    goto/16 :goto_0

    :sswitch_19
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v4, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    xor-int/lit16 v4, v4, 0x193d

    div-int/2addr v1, v4

    if-eqz v1, :cond_15

    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    const-string v1, "\u06e8\u06e5\u06e6"

    invoke-static {v1}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :cond_15
    const-string v1, "\u06e6\u06e1\u06e3"

    goto/16 :goto_6

    :sswitch_1a
    sget v1, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v4, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    add-int/lit16 v4, v4, -0x8f5

    sub-int/2addr v1, v4

    if-gtz v1, :cond_16

    invoke-static {}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۢۨۤ۟()I

    const-string v1, "\u06e8\u06e5\u06e1"

    invoke-static {v1}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :cond_16
    sget v1, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v4, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    mul-int/2addr v1, v4

    const v4, 0x1f403a

    add-int/2addr v1, v4

    move v4, v1

    goto/16 :goto_0

    :sswitch_1b
    const-string p1, ""

    goto/16 :goto_2

    :cond_17
    :sswitch_1c
    const-string v1, "\u06e6\u06e1\u06e8"

    goto/16 :goto_5

    :sswitch_1d
    if-eqz v9, :cond_7

    :try_start_7
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    const-string v4, "\u06df\u06e1\u06e8"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v4

    move-object v10, v1

    goto/16 :goto_0

    :sswitch_1e
    sget v1, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v4, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    rem-int/2addr v1, v4

    const v4, -0x1ab64c

    xor-int/2addr v1, v4

    move-object v6, v8

    move v4, v1

    goto/16 :goto_0

    :sswitch_1f
    sget v1, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    if-ltz v1, :cond_19

    const/16 v1, 0x47

    sput v1, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    :cond_18
    const-string v1, "\u06e8\u06e8\u06e3"

    invoke-static {v1}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :cond_19
    sget v1, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v4, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    or-int/2addr v1, v4

    const v4, 0x1aaa60

    xor-int/2addr v1, v4

    move v4, v1

    goto/16 :goto_0

    :sswitch_20
    const/4 v1, 0x3

    :try_start_8
    new-array v1, v1, [Ljava/lang/Object;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    sget v4, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v7, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    or-int/2addr v4, v7

    const v7, 0x1ab6a3

    add-int/2addr v4, v7

    move-object v7, v1

    goto/16 :goto_0

    :sswitch_21
    if-eqz v6, :cond_7

    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v4, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    rem-int/lit16 v4, v4, 0x1482

    add-int/2addr v1, v4

    if-gtz v1, :cond_1a

    const-string v1, "\u06e5\u06e4\u06e5"

    invoke-static {v1}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :cond_1a
    sget v1, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sub-int/2addr v1, v4

    const v4, 0x1abea1

    add-int/2addr v1, v4

    move v4, v1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdbe4 -> :sswitch_0
        0xdc65 -> :sswitch_10
        0x1aa705 -> :sswitch_5
        0x1aa721 -> :sswitch_17
        0x1aa745 -> :sswitch_4
        0x1aa746 -> :sswitch_20
        0x1aa81d -> :sswitch_f
        0x1aaae1 -> :sswitch_b
        0x1aab3c -> :sswitch_7
        0x1aab44 -> :sswitch_4
        0x1aab9f -> :sswitch_b
        0x1aaf06 -> :sswitch_21
        0x1ab2fe -> :sswitch_7
        0x1ab669 -> :sswitch_6
        0x1ab6a0 -> :sswitch_12
        0x1ab6fb -> :sswitch_1e
        0x1aba05 -> :sswitch_1f
        0x1aba22 -> :sswitch_1
        0x1abda4 -> :sswitch_19
        0x1abe01 -> :sswitch_15
        0x1abe26 -> :sswitch_1b
        0x1abe41 -> :sswitch_14
        0x1abe46 -> :sswitch_b
        0x1abe47 -> :sswitch_11
        0x1ac14a -> :sswitch_a
        0x1ac185 -> :sswitch_18
        0x1ac188 -> :sswitch_1a
        0x1ac18d -> :sswitch_3
        0x1ac1c7 -> :sswitch_d
        0x1ac221 -> :sswitch_16
        0x1ac241 -> :sswitch_e
        0x1ac50e -> :sswitch_1d
        0x1ac527 -> :sswitch_13
        0x1ac984 -> :sswitch_1c
        0x1ac985 -> :sswitch_c
        0x1ac989 -> :sswitch_9
        0x1ac9c1 -> :sswitch_2
        0x1ac9e2 -> :sswitch_7
        0x1ac9e3 -> :sswitch_8
    .end sparse-switch
.end method

.method public static c(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 30

    const/16 v21, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/16 v19, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/16 v22, 0x0

    const/4 v14, 0x0

    const/16 v18, 0x0

    const/16 v16, 0x0

    const/16 v20, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v28, 0x0

    const/16 v27, 0x0

    const/16 v23, 0x0

    const-string v24, "\u06e5\u06e5\u06e3"

    invoke-static/range {v24 .. v24}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v29

    move-object/from16 v24, v2

    move-object/from16 v25, v6

    move-object/from16 v26, v15

    :goto_0
    sparse-switch v29, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    if-eqz v19, :cond_e

    :try_start_0
    invoke-virtual/range {v19 .. v19}, Ld4;->t()Ljava/util/List;

    move-result-object v2

    check-cast v2, Lft;

    const/4 v6, 0x1

    invoke-virtual {v2, v6}, Lft;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v6, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    if-ltz v6, :cond_1c

    const/16 v6, 0x2f

    sput v6, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    const-string v6, "\u06e6\u06e6\u06e4"

    invoke-static {v6}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v6

    move-object v7, v2

    move/from16 v29, v6

    goto :goto_0

    :sswitch_1
    invoke-static {}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۥۧۧ()I

    move-result v2

    if-gtz v2, :cond_0

    const/16 v2, 0x62

    sput v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    move-object v2, v4

    :goto_1
    const-string v5, "\u06e6\u06e0\u06e7"

    invoke-static {v5}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v6

    move-object v5, v2

    move/from16 v29, v6

    goto :goto_0

    :cond_0
    sget v2, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v5, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    mul-int/2addr v2, v5

    const v5, 0x4d206

    add-int/2addr v2, v5

    move-object v5, v4

    move/from16 v29, v2

    goto :goto_0

    :sswitch_2
    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v6, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    rem-int/lit16 v6, v6, -0x12b5

    rem-int/2addr v2, v6

    if-ltz v2, :cond_1

    const-string v2, "\u06e7\u06e0\u06e6"

    move-object v6, v2

    :goto_2
    invoke-static {v6}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto :goto_0

    :cond_1
    const-string v2, "\u06e0\u06df\u06e0"

    invoke-static {v2}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto :goto_0

    :sswitch_3
    :try_start_1
    invoke-virtual/range {v27 .. v27}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v23

    :goto_3
    :sswitch_4
    return-object v23

    :sswitch_5
    const-string v2, "\u5728 "

    move-object/from16 v0, v27

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget v2, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    if-gtz v2, :cond_2

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    const-string v2, "\u06df\u06df\u06e7"

    invoke-static {v2}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto :goto_0

    :cond_2
    sget v2, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v6, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    xor-int/2addr v2, v6

    const v6, 0x1ab8b6

    add-int/2addr v2, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_6
    :try_start_2
    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    xor-int/lit16 v2, v2, -0x347

    aput-object p2, v3, v2

    move-object/from16 v0, v25

    invoke-static {v13, v0, v3}, Lde/robv/android/xposed/XposedHelpers;->callStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v2

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    move-result v6

    if-gtz v6, :cond_3

    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    :goto_4
    const-string v6, "\u06e6\u06e4\u06e3"

    move-object v8, v2

    :goto_5
    invoke-static {v6}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_3
    sget v6, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v8, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    xor-int/2addr v6, v8

    const v8, 0x1ab540

    add-int/2addr v6, v8

    move-object v8, v2

    move/from16 v29, v6

    goto/16 :goto_0

    :sswitch_7
    const-string v2, "g7uXMUjL\n"

    const-string v6, "99TCQi25kRM=\n"

    const-string v15, "lNIFZyhLbtKCyw==\n"

    const-string v29, "7L9pJEclGrc=\n"

    move-object/from16 v0, p1

    move-object/from16 v1, v29

    invoke-static {v2, v6, v0, v15, v1}, Lz30;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p2

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    if-eqz p0, :cond_11

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_33

    const-string v2, "\u06e8\u06e8\u06e1"

    :goto_6
    invoke-static {v2}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_8
    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v6, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    xor-int/lit16 v6, v6, 0x2449

    xor-int/2addr v2, v6

    if-ltz v2, :cond_4

    const/16 v2, 0x2e

    sput v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    const-string v2, "\u06e1\u06e4\u06e0"

    invoke-static {v2}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_4
    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v6, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    mul-int/2addr v2, v6

    const v6, 0x1ea682

    xor-int/2addr v2, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_9
    if-nez v5, :cond_2a

    :try_start_3
    move-object/from16 v0, v26

    array-length v6, v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    sget v15, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    if-gtz v15, :cond_5

    const/16 v15, 0x63

    sput v15, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    const-string v15, "\u06e6\u06e3\u06df"

    invoke-static {v15}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v15

    move-object/from16 v27, v2

    move/from16 v28, v6

    move/from16 v29, v15

    goto/16 :goto_0

    :cond_5
    const-string v15, "\u06e1\u06e3\u06e8"

    invoke-static {v15}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v15

    move-object/from16 v27, v2

    move/from16 v28, v6

    move/from16 v29, v15

    goto/16 :goto_0

    :cond_6
    :sswitch_a
    sget v2, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v6, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    xor-int/2addr v2, v6

    const v6, 0x1ab227

    add-int/2addr v2, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_b
    :try_start_4
    const-string v2, " \u7684\u65b9\u6cd5"

    move-object/from16 v0, v27

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    sget v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v6, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    xor-int/lit16 v6, v6, 0x5b5

    add-int/2addr v2, v6

    if-ltz v2, :cond_23

    const/16 v2, 0x1b

    sput v2, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    const-string v2, "\u06e5\u06e6\u06df"

    invoke-static {v2}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_7
    :sswitch_c
    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v6, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    add-int/lit16 v6, v6, 0x1104

    rem-int/2addr v2, v6

    if-ltz v2, :cond_8

    const-string v2, "\u06e0\u06e3\u06e8"

    move-object v6, v10

    :goto_7
    invoke-static {v2}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v10, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_8
    sget v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v6, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    rem-int/2addr v2, v6

    const v6, 0x1ac147

    add-int/2addr v2, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_d
    sget v2, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v6, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    mul-int/lit16 v6, v6, 0x14dc

    rem-int/2addr v2, v6

    if-gtz v2, :cond_9

    const-string v2, "\u06e8\u06e8\u06e4"

    invoke-static {v2}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v12, v11

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u06e6\u06e0\u06e8"

    move-object v6, v11

    :goto_8
    invoke-static {v2}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v2

    move-object v12, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_e
    if-nez v13, :cond_25

    sget v2, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    if-ltz v2, :cond_a

    const/16 v2, 0x50

    sput v2, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    const-string v2, "\u06e4\u06e6\u06e1"

    invoke-static {v2}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u06df\u06df\u06e7"

    move-object v6, v2

    goto/16 :goto_2

    :cond_b
    :sswitch_f
    sget v2, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    if-gtz v2, :cond_c

    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    const-string v2, "\u06e0\u06e8\u06e6"

    :goto_9
    invoke-static {v2}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u06e5\u06df\u06e7"

    :goto_a
    invoke-static {v2}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_10
    :try_start_5
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-result-object v9

    const-string v2, "\u06e7\u06df\u06e5"

    move-object v6, v2

    goto/16 :goto_5

    :sswitch_11
    :try_start_6
    const-string v6, ""
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    move-result v2

    if-gtz v2, :cond_d

    const/16 v2, 0x2a

    sput v2, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    const-string v2, "\u06e1\u06e5\u06e1"

    :goto_b
    invoke-static {v2}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v11, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_d
    sget v2, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v11, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    mul-int/2addr v2, v11

    const v11, 0x167ee2

    add-int/2addr v2, v11

    move-object v11, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_e
    :sswitch_12
    sget v2, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v6, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    add-int/lit8 v6, v6, 0x18

    xor-int/2addr v2, v6

    if-gtz v2, :cond_f

    const-string v2, "\u06e0\u06e7\u06e2"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_f
    sget v2, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v6, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    rem-int/2addr v2, v6

    const v6, 0xda0b

    add-int/2addr v2, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_13
    :try_start_7
    const-string v2, "\u627e\u4e0d\u5230\u5361\u7247\u5185\u5bb9\u7c7b: "

    move-object/from16 v0, v21

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    move-result-object v23

    goto/16 :goto_3

    :sswitch_14
    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v6, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    div-int/lit16 v6, v6, -0x8fe

    add-int/2addr v2, v6

    if-ltz v2, :cond_10

    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    const-string v2, "\u06e7\u06e4"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_10
    const-string v2, "\u06e4\u06e1\u06e6"

    move-object/from16 v6, v23

    :goto_c
    invoke-static {v2}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v23, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_11
    :sswitch_15
    sget v2, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v6, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    xor-int/lit16 v6, v6, -0xa5b

    xor-int/2addr v2, v6

    if-ltz v2, :cond_12

    const-string v2, "\u06e6\u06e2\u06e6"

    invoke-static {v2}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_12
    sget v2, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v6, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    rem-int/2addr v2, v6

    const v6, 0x1aa7b1

    xor-int/2addr v2, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_16
    sget v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v6, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    xor-int/lit16 v6, v6, -0xdcc

    add-int/2addr v2, v6

    if-gtz v2, :cond_13

    const/16 v2, 0x1b

    sput v2, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    const-string v2, "\u06e3\u06e0\u06e7"

    move-object v6, v12

    goto/16 :goto_8

    :cond_13
    sget v2, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v6, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    mul-int/2addr v2, v6

    const v6, 0x1f179f

    xor-int/2addr v2, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_17
    sget v2, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    if-gtz v2, :cond_14

    const-string v2, "\u06e4\u06e8\u06e1"

    invoke-static {v2}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    move/from16 v20, v16

    goto/16 :goto_0

    :cond_14
    const-string v2, "\u06e6\u06df\u06e5"

    move/from16 v6, v16

    :goto_d
    invoke-static {v2}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    move/from16 v20, v6

    goto/16 :goto_0

    :sswitch_18
    :try_start_8
    move-object/from16 v0, v21

    move-object/from16 v1, p0

    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    move-result-object v6

    sget v2, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    if-gtz v2, :cond_15

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    const-string v2, "\u06e8\u06e3\u06e3"

    invoke-static {v2}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v13, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_15
    const-string v2, "\u06e4\u06e2\u06e8"

    :goto_e
    invoke-static {v2}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v13, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_19
    :try_start_9
    invoke-virtual/range {v18 .. v18}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v2

    array-length v2, v2

    move-object/from16 v0, v26

    array-length v6, v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    if-ne v2, v6, :cond_3e

    sget v2, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v5, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    or-int/2addr v2, v5

    const v5, -0x1abab8

    xor-int/2addr v2, v5

    move-object/from16 v5, v18

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_1a
    :try_start_a
    const-string v2, "miwnbn6Eag==\n"

    const-string v6, "yXlkLTvXOa8=\n"

    invoke-static {v2, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    move-result-object v6

    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    move-result v2

    if-ltz v2, :cond_16

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    const-string v2, "\u06e1\u06e5\u06e0"

    invoke-static {v2}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v23, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_16
    const-string v2, "\u06e0\u06df\u06e0"

    goto/16 :goto_c

    :sswitch_1b
    :try_start_b
    const-string v2, "Cxh1Y10eB7rDsJ06EglE\n"

    const-string v3, "U1U5i/q94SQ=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    move-result-object v23

    goto/16 :goto_3

    :sswitch_1c
    const-string v2, "\u06e8\u06e3\u06e3"

    move-object v6, v11

    goto/16 :goto_b

    :sswitch_1d
    :try_start_c
    const-string v2, " \u4e14\u53c2\u6570\u4e2a\u6570\u4e3a "

    move-object/from16 v0, v27

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    sget v2, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v6, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    or-int/lit16 v6, v6, 0x19d7

    sub-int/2addr v2, v6

    if-ltz v2, :cond_17

    const-string v2, "\u06e5\u06e7\u06e1"

    move-object v6, v13

    goto :goto_e

    :cond_17
    const-string v2, "\u06e5\u06e6\u06e6"

    move-object/from16 v6, v19

    :goto_f
    invoke-static {v2}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v19, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_1e
    sget v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v6, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    xor-int/2addr v2, v6

    const v6, 0xe060

    add-int/2addr v2, v6

    move/from16 v29, v2

    move/from16 v20, v14

    goto/16 :goto_0

    :cond_18
    :sswitch_1f
    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    move-result v2

    if-ltz v2, :cond_19

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    const-string v2, "\u06e7\u06e3\u06e5"

    invoke-static {v2}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_19
    const-string v2, "\u06e1\u06e5\u06e1"

    invoke-static {v2}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_20
    :try_start_d
    sget-object v6, Lpb0;->g0:Ljava/lang/String;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    sget v2, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v10, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    add-int/lit16 v10, v10, 0x2077

    mul-int/2addr v2, v10

    if-ltz v2, :cond_1a

    const/16 v2, 0x5b

    sput v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    move v2, v14

    :goto_10
    const-string v10, "\u06e4\u06e4\u06e1"

    move-object v15, v10

    move v14, v2

    :goto_11
    invoke-static {v15}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v2

    move-object v10, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_1a
    const-string v2, "\u06e7\u06e4\u06e1"

    goto/16 :goto_7

    :sswitch_21
    :try_start_e
    move-object/from16 v0, v27

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    :goto_12
    const-string v2, "\u06e0\u06df\u06e1"

    invoke-static {v2}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_22
    const-string v2, "wtMApXxW8Jyduyv5\n"

    const-string v3, "J1yCQ+nmFCQ=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v23

    goto/16 :goto_3

    :sswitch_23
    if-nez v7, :cond_7

    sget v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    if-gtz v2, :cond_1b

    const/4 v2, 0x6

    sput v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    goto :goto_12

    :cond_1b
    sget v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v6, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    div-int/2addr v2, v6

    const v6, 0xdc82

    add-int/2addr v2, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_1c
    const-string v6, "\u06e5\u06e7"

    move-object v7, v2

    goto/16 :goto_2

    :sswitch_24
    sget v2, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v6, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    rem-int/lit16 v6, v6, -0xbb8

    mul-int/2addr v2, v6

    if-ltz v2, :cond_1d

    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    const-string v2, "\u06df\u06e5"

    move/from16 v6, v16

    :goto_13
    invoke-static {v2}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    move/from16 v16, v6

    goto/16 :goto_0

    :cond_1d
    sget v2, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v6, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    mul-int/2addr v2, v6

    const v6, 0x18bfa

    add-int/2addr v2, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_25
    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    move-result v2

    if-gtz v2, :cond_1e

    const-string v2, "\u06e5\u06e5\u06e3"

    invoke-static {v2}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_1e
    const-string v2, "\u06e7\u06e6\u06df"

    invoke-static {v2}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_26
    const/4 v2, 0x0

    :try_start_f
    move-object/from16 v0, v26

    array-length v6, v0

    move-object/from16 v0, v26

    invoke-static {v0, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v2, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    invoke-static {}, Landroidx/savedstate/۠ۡۢ۠;->ۣ۟ۨۤۨ()I

    move-result v2

    if-gtz v2, :cond_1f

    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    const-string v2, "\u06e1\u06df\u06e6"

    invoke-static {v2}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_1f
    sget v2, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v6, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    add-int/2addr v2, v6

    const v6, -0x1ac90b

    xor-int/2addr v2, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_27
    move/from16 v0, v20

    move/from16 v1, v22

    if-ge v0, v1, :cond_6

    :try_start_10
    aget-object v6, v9, v20
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    sget v2, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v15, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    div-int/lit16 v15, v15, 0xb1d

    sub-int/2addr v2, v15

    if-ltz v2, :cond_20

    const/16 v2, 0x42

    sput v2, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    move-object/from16 v2, v17

    :goto_14
    const-string v15, "\u06e2\u06e6"

    invoke-static {v15}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v15

    move-object/from16 v17, v2

    move-object/from16 v18, v6

    move/from16 v29, v15

    goto/16 :goto_0

    :cond_20
    sget v2, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v15, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sub-int/2addr v2, v15

    const v15, 0x1ac450

    xor-int/2addr v2, v15

    move-object/from16 v18, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_28
    :try_start_11
    sget-object v2, Lpb0;->d0:Ljava/lang/String;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    sget v6, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v15, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sub-int/2addr v6, v15

    const v15, 0x1aaab6

    xor-int/2addr v6, v15

    move-object/from16 v24, v2

    move/from16 v29, v6

    goto/16 :goto_0

    :sswitch_29
    sget v2, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v6, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    div-int/lit16 v6, v6, -0x17d2

    or-int/2addr v2, v6

    if-gtz v2, :cond_21

    const/4 v2, 0x7

    sput v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    const-string v2, "\u06e1\u06e2"

    invoke-static {v2}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v12, v7

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_21
    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v6, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    div-int/2addr v2, v6

    const v6, 0xdca3

    add-int/2addr v2, v6

    move-object v12, v7

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_2a
    :try_start_12
    sget-object v2, Lpb0;->h0:Ljb;

    move-object/from16 v0, p1

    invoke-virtual {v2, v8, v12, v0}, Ljb;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/Object;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    sget v6, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v15, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    add-int/2addr v6, v15

    const v15, 0x1abd2d

    add-int/2addr v6, v15

    move-object/from16 v26, v2

    move/from16 v29, v6

    goto/16 :goto_0

    :sswitch_2b
    :try_start_13
    new-instance v2, Li00;

    const-string v6, "VKOw6Ajnd9VujeLcR/N3\n"

    const-string v15, "NdPAgWzaVf0=\n"

    invoke-static {v6, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v2, v6}, Li00;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p2

    invoke-static {v2, v0}, Li00;->a(Li00;Ljava/lang/String;)Ld4;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    move-result-object v6

    sget v2, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v15, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    mul-int/lit16 v15, v15, 0x1dbb

    or-int/2addr v2, v15

    if-ltz v2, :cond_22

    const/16 v2, 0x60

    sput v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    const-string v2, "\u06e8\u06e2\u06e3"

    goto/16 :goto_f

    :cond_22
    const-string v2, "\u06e0\u06e0"

    move/from16 v15, v22

    :goto_15
    invoke-static {v2}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v19, v6

    move/from16 v22, v15

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_2c
    :try_start_14
    sget-object v2, Lpb0;->f0:Ljava/lang/String;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_0

    sget v6, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v15, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    rem-int/2addr v6, v15

    const v15, 0x1aaf7f

    add-int/2addr v6, v15

    move-object/from16 v25, v2

    move/from16 v29, v6

    goto/16 :goto_0

    :sswitch_2d
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_28

    sget v2, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v6, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    rem-int/lit16 v6, v6, 0x64c

    add-int/2addr v2, v6

    if-gtz v2, :cond_24

    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    :cond_23
    const-string v2, "\u06e7\u06e1\u06e3"

    invoke-static {v2}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_24
    const-string v2, "\u06e7\u06e2\u06e6"

    invoke-static {v2}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_25
    :sswitch_2e
    sget v2, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    if-ltz v2, :cond_26

    const-string v2, "\u06e3\u06e7"

    goto/16 :goto_a

    :cond_26
    sget v2, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v6, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    div-int/2addr v2, v6

    const v6, 0x1aab23

    add-int/2addr v2, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_2f
    :try_start_15
    invoke-virtual/range {v25 .. v25}, Ljava/lang/String;->length()I
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    move-result v2

    if-nez v2, :cond_18

    sget v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v6, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    div-int/lit8 v6, v6, -0x1e

    div-int/2addr v2, v6

    if-gtz v2, :cond_27

    const/16 v2, 0x4e

    sput v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    const-string v2, "\u06df\u06e4\u06e1"

    move/from16 v6, v20

    goto/16 :goto_d

    :cond_27
    const-string v2, "\u06e8\u06e8\u06e4"

    goto/16 :goto_9

    :cond_28
    :sswitch_30
    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    if-gtz v2, :cond_29

    const-string v2, "\u06df\u06e2\u06e0"

    invoke-static {v2}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_29
    const-string v2, "\u06e7\u06e4"

    goto/16 :goto_6

    :sswitch_31
    :try_start_16
    const-string v2, "\u627e\u4e0d\u5230\u5361\u7247\u903b\u8f91\u7c7b: "

    move-object/from16 v0, v24

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v23

    goto/16 :goto_3

    :sswitch_32
    sget-object v6, Lpb0;->e0:Ljava/lang/String;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_0

    const-string v2, "\u06df\u06e8\u06df"

    :goto_16
    invoke-static {v2}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v21, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_2a
    :sswitch_33
    const-string v2, "\u06e5\u06e0\u06e8"

    invoke-static {v2}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_34
    :try_start_17
    invoke-virtual {v10}, Ljava/lang/String;->length()I
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    move-result v2

    if-nez v2, :cond_37

    move-object v2, v8

    goto/16 :goto_4

    :cond_2b
    :sswitch_35
    sget v2, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v6, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    mul-int/2addr v2, v6

    const v6, 0x1d1694

    add-int/2addr v2, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_36
    const/4 v4, 0x0

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    move-result v2

    if-ltz v2, :cond_2c

    const-string v2, "\u06e6\u06e0\u06e8"

    move-object/from16 v6, v21

    goto :goto_16

    :cond_2c
    sget v2, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v6, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    xor-int/2addr v2, v6

    const v6, -0x1ab9d6

    xor-int/2addr v2, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_37
    :try_start_18
    const-string v2, "Ayed/z5uXeTPsl02q5USjvLmCgnnM5iO78AIN/XvJMGr0mBV8Kddxc6yaBo=\n"

    const-string v3, "Qlftsk0JuGs=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_0

    move-result-object v23

    goto/16 :goto_3

    :sswitch_38
    if-nez v17, :cond_45

    sget v2, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v6, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    rem-int/lit16 v6, v6, 0x8bf

    rem-int/2addr v2, v6

    if-ltz v2, :cond_2d

    invoke-static {}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۢۨۤ۟()I

    const-string v2, "\u06e4\u06e7\u06e8"

    invoke-static {v2}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_2d
    const-string v2, "\u06e5\u06df\u06e5"

    invoke-static {v2}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_39
    :try_start_19
    sget v2, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_0

    xor-int/lit16 v2, v2, 0x12e

    add-int v6, v20, v2

    sget v2, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v15, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    or-int/lit16 v15, v15, 0x1cd2

    div-int/2addr v2, v15

    if-eqz v2, :cond_2e

    const-string v2, "\u06e7\u06e0\u06df"

    invoke-static {v2}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    move/from16 v16, v6

    goto/16 :goto_0

    :cond_2e
    const-string v2, "\u06e2\u06e1\u06e8"

    goto/16 :goto_13

    :sswitch_3a
    :try_start_1a
    const-string v2, "nYwjcrFFaZGemn8R+h8o\n"

    const-string v6, "+ulXP9QxAf4=\n"

    invoke-static {v2, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v9}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v15, v9
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_0

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    move-result v2

    if-gtz v2, :cond_2f

    const/16 v2, 0x35

    sput v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    const-string v2, "\u06e0\u06e0"

    move-object/from16 v6, v19

    goto/16 :goto_15

    :cond_2f
    sget v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v6, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    add-int/2addr v2, v6

    const v6, -0x1ac6a9

    xor-int/2addr v2, v6

    move/from16 v22, v15

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_3b
    :try_start_1b
    const-string v2, " \u4e2d\u627e\u4e0d\u5230\u540d\u4e3a "

    move-object/from16 v0, v27

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_0

    const-string v2, "\u06e3\u06e5\u06e7"

    invoke-static {v2}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_3c
    sget v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    if-ltz v2, :cond_30

    const/16 v2, 0x61

    sput v2, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    const-string v2, "\u06e5\u06e0\u06e8"

    invoke-static {v2}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_30
    sget v2, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v6, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    add-int/2addr v2, v6

    const v6, -0x1ac435

    xor-int/2addr v2, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_3d
    :try_start_1c
    invoke-virtual/range {v27 .. v28}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_0

    invoke-static {}, Landroidx/appcompat/app/ۥۦۣ۠;->ۨۤ۠ۨ()I

    move-result v2

    if-gtz v2, :cond_31

    const-string v2, "\u06e5\u06e5\u06e0"

    :goto_17
    invoke-static {v2}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_31
    const-string v2, "\u06e1\u06e4\u06e0"

    goto :goto_17

    :sswitch_3e
    sget v2, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v6, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    add-int/lit16 v6, v6, -0x2403

    div-int/2addr v2, v6

    if-eqz v2, :cond_32

    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    const-string v2, "\u06e7\u06e1\u06df"

    move-object/from16 v6, v23

    goto/16 :goto_c

    :cond_32
    sget v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v6, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sub-int/2addr v2, v6

    const v6, 0x1abe64

    add-int/2addr v2, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_33
    :sswitch_3f
    sget v2, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v6, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    add-int/lit16 v6, v6, 0x60c

    rem-int/2addr v2, v6

    if-gtz v2, :cond_34

    const/16 v2, 0x51

    sput v2, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    const-string v2, "\u06e5\u06e0\u06e4"

    goto/16 :goto_6

    :cond_34
    sget v2, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v6, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    rem-int/2addr v2, v6

    const v6, 0x1ac6cb

    add-int/2addr v2, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_35
    :sswitch_40
    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    if-ltz v2, :cond_36

    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    const-string v2, "\u06e4\u06e6\u06e6"

    move-object v6, v2

    move-object v15, v3

    :goto_18
    invoke-static {v6}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v2

    move-object v3, v15

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_36
    const-string v2, "\u06e6\u06e3\u06df"

    goto/16 :goto_6

    :cond_37
    :sswitch_41
    sget v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v6, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    add-int/lit16 v6, v6, 0xf86

    div-int/2addr v2, v6

    if-eqz v2, :cond_38

    const/16 v2, 0x1f

    sput v2, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    const-string v2, "\u06e0\u06e0\u06e7"

    invoke-static {v2}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_38
    sget v2, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v6, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    rem-int/2addr v2, v6

    const v6, 0x1ab76b

    add-int/2addr v2, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :catchall_0
    move-exception v2

    const-string v3, "Nwje\n"

    const-string v4, "Q2m5jaPP2Zc=\n"

    const-string v5, "nm23iE3nxy2hQZGrWMTQLw==\n"

    const-string v6, "0x7Q2yiJo0g=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "Fg==\n"

    const-string v7, "c8HJlSTQVfc=\n"

    invoke-static {v3, v4, v5, v6, v7}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "AppMsg\u53d1\u5305\u5f02\u5e38: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v23

    goto/16 :goto_3

    :sswitch_42
    const/4 v2, 0x0

    move-object v6, v10

    goto/16 :goto_10

    :sswitch_43
    :try_start_1d
    invoke-virtual/range {v21 .. v21}, Ljava/lang/String;->length()I
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_0

    move-result v2

    if-nez v2, :cond_35

    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v6, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    or-int/lit16 v6, v6, -0x70d

    mul-int/2addr v2, v6

    if-gtz v2, :cond_39

    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    const-string v2, "\u06e7\u06e8\u06df"

    invoke-static {v2}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_39
    sget v2, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v6, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    add-int/2addr v2, v6

    const v6, 0x1abd77

    xor-int/2addr v2, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_3a
    :sswitch_44
    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v6, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    mul-int/lit16 v6, v6, -0x254b

    div-int/2addr v2, v6

    if-eqz v2, :cond_3b

    const-string v2, "\u06e6\u06e8\u06e5"

    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_3b
    sget v2, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v6, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    div-int/2addr v2, v6

    const v6, 0x1aae88

    add-int/2addr v2, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_45
    const/4 v2, 0x1

    :try_start_1e
    invoke-virtual {v5, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_0

    const-string v2, "\u06e3\u06e2\u06e5"

    goto/16 :goto_9

    :sswitch_46
    sget v2, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v6, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    or-int/lit16 v6, v6, 0xd8e

    xor-int/2addr v2, v6

    if-ltz v2, :cond_3c

    const-string v2, "\u06e2\u06e8\u06e8"

    invoke-static {v2}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_3c
    sget v2, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v6, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sub-int/2addr v2, v6

    const v6, -0xda2d

    xor-int/2addr v2, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_47
    :try_start_1f
    move-object/from16 v0, v26

    array-length v2, v0
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_0

    if-nez v2, :cond_3a

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    if-gtz v2, :cond_3d

    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    const-string v2, "\u06e7\u06e1\u06e7"

    invoke-static {v2}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_3d
    move-object v2, v3

    :goto_19
    const-string v3, "\u06e7\u06df\u06e6"

    invoke-static {v3}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v6

    move-object v3, v2

    move/from16 v29, v6

    goto/16 :goto_0

    :cond_3e
    :sswitch_48
    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v6, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    div-int/2addr v2, v6

    const v6, 0x1aba49

    add-int/2addr v2, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_49
    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v6, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    div-int/lit16 v6, v6, 0xe27

    xor-int/2addr v2, v6

    if-gtz v2, :cond_3f

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۣۡۧۢ()I

    const-string v2, "\u06e8\u06e1\u06e5"

    invoke-static {v2}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_3f
    const-string v2, "\u06e3\u06e8\u06df"

    move-object v15, v2

    move-object v6, v10

    goto/16 :goto_11

    :sswitch_4a
    sget v2, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v6, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    or-int/lit16 v6, v6, 0x12eb

    or-int/2addr v2, v6

    if-ltz v2, :cond_40

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    const-string v2, "\u06e3\u06e1\u06e3"

    invoke-static {v2}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_40
    const-string v2, "\u06e5\u06e6\u06df"

    invoke-static {v2}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_4b
    :try_start_20
    invoke-virtual/range {v24 .. v24}, Ljava/lang/String;->length()I
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_0

    move-result v2

    if-nez v2, :cond_2b

    sget v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v6, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    rem-int/lit16 v6, v6, -0x267c

    mul-int/2addr v2, v6

    if-ltz v2, :cond_41

    const/16 v2, 0x58

    sput v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    const-string v2, "\u06e5\u06e6\u06e4"

    invoke-static {v2}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_41
    move-object v2, v5

    goto/16 :goto_1

    :sswitch_4c
    :try_start_21
    move-object/from16 v0, v24

    move-object/from16 v1, p0

    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_0

    move-result-object v2

    sget v6, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v15, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    mul-int/lit16 v15, v15, -0xae2

    div-int/2addr v6, v15

    if-eqz v6, :cond_42

    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    const-string v6, "\u06e2\u06e8\u06e4"

    invoke-static {v6}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v17, v2

    move/from16 v29, v6

    goto/16 :goto_0

    :cond_42
    move-object/from16 v6, v18

    goto/16 :goto_14

    :sswitch_4d
    :try_start_22
    move-object/from16 v0, v27

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_0

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    move-result v2

    if-gtz v2, :cond_43

    invoke-static {}, Landroid/app/۠ۨۥۨ;->ۣۣ۟ۨۧ()I

    const-string v2, "\u06e0\u06e6"

    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_43
    sget v2, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v6, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sub-int/2addr v2, v6

    const v6, -0x1ac1fc

    xor-int/2addr v2, v6

    move/from16 v29, v2

    goto/16 :goto_0

    :sswitch_4e
    :try_start_23
    invoke-virtual/range {v18 .. v18}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v10}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_0

    move-result v2

    if-eqz v2, :cond_3e

    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    move-result v2

    if-ltz v2, :cond_44

    const-string v2, "\u06e4\u06e3\u06e8"

    invoke-static {v2}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_44
    const-string v2, "\u06e2\u06e8\u06e4"

    move/from16 v6, v20

    goto/16 :goto_d

    :cond_45
    :sswitch_4f
    const-string v2, "\u06e7\u06e0\u06df"

    move-object v6, v12

    goto/16 :goto_8

    :sswitch_50
    if-nez v8, :cond_b

    sget v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v6, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    add-int/lit16 v6, v6, 0x1af0

    sub-int/2addr v2, v6

    if-ltz v2, :cond_46

    invoke-static {}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۥۧۧ()I

    const-string v2, "\u06e8\u06e6\u06e1"

    invoke-static {v2}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v29, v2

    goto/16 :goto_0

    :cond_46
    const-string v2, "\u06e1\u06df\u06e7"

    goto/16 :goto_9

    :sswitch_51
    const/4 v2, 0x1

    :try_start_24
    new-array v2, v2, [Ljava/lang/Object;
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_0

    sget v3, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v6, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    add-int/lit16 v6, v6, 0xeae

    xor-int/2addr v3, v6

    if-gtz v3, :cond_47

    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    goto/16 :goto_19

    :cond_47
    const-string v3, "\u06df\u06e6\u06e0"

    move-object v6, v3

    move-object v15, v2

    goto/16 :goto_18

    :sswitch_52
    :try_start_25
    const-string v2, "d8ZybJcDSwI/jXkj+z4iXS/FAASzXCY9d+R0bJ4+SjUQjXA5+hwrXxry\n"

    const-string v3, "kmvliRK7r7o=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_0

    move-result-object v23

    goto/16 :goto_3

    :sswitch_data_0
    .sparse-switch
        0xdc00 -> :sswitch_0
        0xdc06 -> :sswitch_2e
        0xdc07 -> :sswitch_3e
        0xdc21 -> :sswitch_24
        0xdc44 -> :sswitch_38
        0xdc84 -> :sswitch_11
        0xdca2 -> :sswitch_29
        0xdca3 -> :sswitch_23
        0xdcc2 -> :sswitch_27
        0xdcdd -> :sswitch_32
        0xdcde -> :sswitch_9
        0x1aa707 -> :sswitch_13
        0x1aa79c -> :sswitch_22
        0x1aa7d9 -> :sswitch_6
        0x1aa7db -> :sswitch_16
        0x1aa816 -> :sswitch_28
        0x1aaac1 -> :sswitch_4
        0x1aaac2 -> :sswitch_3b
        0x1aab26 -> :sswitch_4c
        0x1aab7c -> :sswitch_35
        0x1aabda -> :sswitch_48
        0x1aabdf -> :sswitch_33
        0x1aae88 -> :sswitch_10
        0x1aae89 -> :sswitch_1b
        0x1aaec0 -> :sswitch_2c
        0x1aaee2 -> :sswitch_20
        0x1aaf06 -> :sswitch_5
        0x1aaf1d -> :sswitch_b
        0x1aaf3c -> :sswitch_36
        0x1aaf3d -> :sswitch_34
        0x1aaf42 -> :sswitch_a
        0x1aaf44 -> :sswitch_12
        0x1ab289 -> :sswitch_17
        0x1ab35a -> :sswitch_50
        0x1ab35e -> :sswitch_19
        0x1ab645 -> :sswitch_21
        0x1ab666 -> :sswitch_26
        0x1ab69e -> :sswitch_46
        0x1ab6c5 -> :sswitch_4d
        0x1ab71a -> :sswitch_16
        0x1ab9e4 -> :sswitch_18
        0x1ab9e8 -> :sswitch_d
        0x1aba09 -> :sswitch_16
        0x1aba2a -> :sswitch_e
        0x1aba49 -> :sswitch_39
        0x1aba61 -> :sswitch_1e
        0x1aba81 -> :sswitch_1
        0x1aba9f -> :sswitch_4a
        0x1abac5 -> :sswitch_30
        0x1abadd -> :sswitch_f
        0x1abd8b -> :sswitch_31
        0x1abd8d -> :sswitch_2b
        0x1abda7 -> :sswitch_1c
        0x1abdab -> :sswitch_47
        0x1abdad -> :sswitch_45
        0x1abe20 -> :sswitch_c
        0x1abe40 -> :sswitch_2
        0x1abe43 -> :sswitch_7
        0x1abe5e -> :sswitch_46
        0x1abe63 -> :sswitch_15
        0x1abe65 -> :sswitch_3d
        0x1abe7f -> :sswitch_2f
        0x1ac14c -> :sswitch_3c
        0x1ac14e -> :sswitch_40
        0x1ac16d -> :sswitch_49
        0x1ac16e -> :sswitch_2a
        0x1ac1c2 -> :sswitch_4b
        0x1ac1ca -> :sswitch_4f
        0x1ac1e4 -> :sswitch_1d
        0x1ac1e5 -> :sswitch_37
        0x1ac224 -> :sswitch_3f
        0x1ac50d -> :sswitch_3a
        0x1ac50e -> :sswitch_52
        0x1ac526 -> :sswitch_51
        0x1ac549 -> :sswitch_3
        0x1ac54d -> :sswitch_24
        0x1ac56b -> :sswitch_8
        0x1ac5a4 -> :sswitch_43
        0x1ac5e0 -> :sswitch_15
        0x1ac5e1 -> :sswitch_42
        0x1ac5e3 -> :sswitch_4e
        0x1ac600 -> :sswitch_41
        0x1ac61e -> :sswitch_2d
        0x1ac90c -> :sswitch_44
        0x1ac929 -> :sswitch_1f
        0x1ac948 -> :sswitch_16
        0x1ac983 -> :sswitch_1a
        0x1ac9a3 -> :sswitch_15
        0x1ac9e1 -> :sswitch_25
        0x1ac9e4 -> :sswitch_14
    .end sparse-switch
.end method

.method public static d(Ljava/lang/ClassLoader;Ljava/lang/Object;)V
    .locals 9

    const/4 v0, 0x0

    const-string v1, "\u06e3\u06e7\u06df"

    invoke-static {v1}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v5

    move-object v3, v0

    move-object v2, v0

    move-object v4, v0

    move-object v1, v0

    :goto_0
    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v0, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v5, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    add-int/lit16 v5, v5, 0x896

    rem-int/2addr v0, v5

    if-ltz v0, :cond_6

    const-string v0, "\u06e4\u06e5\u06e0"

    :goto_1
    invoke-static {v0}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :sswitch_1
    const-string v0, "U5jlokVkRXZJ\n"

    const-string v5, "I/mGySAQChQ=\n"

    invoke-static {v0, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget v0, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v5, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    or-int/2addr v0, v5

    const v5, 0x1ab78c

    add-int/2addr v0, v5

    move v5, v0

    goto :goto_0

    :sswitch_2
    sget v0, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v5, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    div-int/lit16 v5, v5, 0x82b

    add-int/2addr v0, v5

    if-ltz v0, :cond_1

    const-string v0, "\u06e6\u06e2\u06e0"

    invoke-static {v0}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v5, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    xor-int/2addr v0, v5

    const v5, 0x1ac5dc

    add-int/2addr v0, v5

    move v5, v0

    goto :goto_0

    :sswitch_3
    if-eqz v3, :cond_b

    sget v0, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    if-gtz v0, :cond_2

    :goto_2
    const-string v0, "\u06e7\u06e2\u06e0"

    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :cond_2
    sget v0, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v5, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    mul-int/2addr v0, v5

    const v5, 0x1b7c5c

    xor-int/2addr v0, v5

    move v5, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    const-string v0, "Nwje\n"

    const-string v5, "Q2m5jaPP2Zc=\n"

    const-string v6, "ZQImGxjwyMJaLgYkEvzNy3sULyw=\n"

    const-string v7, "KHFBSH2erKc=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "Fg==\n"

    const-string v8, "c8HJlSTQVfc=\n"

    invoke-static {v0, v5, v6, v7, v8}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget v0, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    if-gtz v0, :cond_3

    const-string v0, "\u06e8\u06e3\u06e0"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :cond_3
    sget v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v5, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    rem-int/2addr v0, v5

    const v5, 0x1aba6a

    add-int/2addr v0, v5

    move v5, v0

    goto/16 :goto_0

    :sswitch_4
    sget v0, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v5, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    xor-int/lit16 v5, v5, -0xb0c

    add-int/2addr v0, v5

    if-gtz v0, :cond_4

    const-string v0, "\u06e8\u06e8\u06e2"

    :goto_3
    invoke-static {v0}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06e2\u06df\u06e4"

    goto/16 :goto_1

    :sswitch_5
    :try_start_0
    sget-boolean v0, Luv;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_d

    sget v0, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    if-gtz v0, :cond_5

    const-string v0, "\u06e8\u06df\u06e3"

    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e7\u06e6\u06e1"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06e5\u06e2\u06e2"

    goto/16 :goto_1

    :sswitch_6
    :try_start_1
    invoke-virtual {v3, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {}, Lۣ۟ۢ۠۠;->۠۟ۥ۠()I

    move-result v0

    if-gtz v0, :cond_7

    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    const-string v0, "\u06e5\u06e6\u06e1"

    invoke-static {v0}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :cond_7
    const-string v0, "\u06e0\u06e8\u06e3"

    goto :goto_3

    :sswitch_7
    sget-object v0, Luv;->e:Ljava/lang/reflect/Method;

    const-string v3, "\u06e5\u06e5\u06e3"

    invoke-static {v3}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v5

    move-object v3, v0

    goto/16 :goto_0

    :sswitch_8
    const/4 v0, 0x1

    :try_start_2
    new-array v0, v0, [Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    sget v4, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v5, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    div-int/lit16 v5, v5, -0x488

    xor-int/2addr v4, v5

    if-ltz v4, :cond_8

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    const-string v4, "\u06e2\u06e2\u06e4"

    invoke-static {v4}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v5

    move-object v4, v0

    goto/16 :goto_0

    :cond_8
    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v5, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    or-int/2addr v4, v5

    const v5, 0x1acbd5

    add-int/2addr v5, v4

    move-object v4, v0

    goto/16 :goto_0

    :sswitch_9
    sget v0, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v5, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sub-int/2addr v0, v5

    const v5, 0x1aaa4d

    add-int/2addr v0, v5

    move v5, v0

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    move-result v0

    if-gtz v0, :cond_9

    invoke-static {}, Landroidx/core/content/ۥۨۤۦ;->۟۠۠۠ۥ()I

    const-string v0, "\u06df\u06e3\u06df"

    :goto_4
    invoke-static {v0}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :cond_9
    const-string v0, "\u06e3\u06e7\u06df"

    goto :goto_4

    :sswitch_b
    :try_start_3
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    xor-int/lit16 v0, v0, 0x163

    aput-object p1, v4, v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    sget v0, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v5, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    add-int/lit16 v5, v5, 0x2bd

    xor-int/2addr v0, v5

    if-ltz v0, :cond_a

    const-string v0, "\u06e2\u06df\u06e4"

    invoke-static {v0}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :cond_a
    sget v0, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v5, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sub-int/2addr v0, v5

    const v5, -0x1aba90

    xor-int/2addr v0, v5

    move v5, v0

    goto/16 :goto_0

    :cond_b
    :sswitch_c
    sget v0, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v5, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    add-int/lit16 v5, v5, -0x128c

    or-int/2addr v0, v5

    if-ltz v0, :cond_c

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    const-string v0, "\u06e0\u06df\u06e2"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :cond_c
    sget v0, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v5, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    xor-int/2addr v0, v5

    const v5, 0x1abcdb

    add-int/2addr v0, v5

    move v5, v0

    goto/16 :goto_0

    :cond_d
    :sswitch_d
    sget v0, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v5, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    or-int/lit16 v5, v5, -0x180f

    or-int/2addr v0, v5

    if-ltz v0, :cond_e

    const-string v0, "\u06e5\u06df"

    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :cond_e
    sget v0, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v5, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sub-int/2addr v0, v5

    const v5, 0x1abe0d

    xor-int/2addr v0, v5

    move v5, v0

    goto/16 :goto_0

    :sswitch_e
    sget-object v0, Luv;->d:Ljava/lang/Object;

    sget v2, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v5, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    add-int/lit16 v5, v5, -0x1efd

    rem-int/2addr v2, v5

    if-ltz v2, :cond_f

    const/16 v2, 0x4f

    sput v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    :goto_5
    const-string v2, "\u06e8\u06df\u06df"

    invoke-static {v2}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v5

    move-object v2, v0

    goto/16 :goto_0

    :cond_f
    sget v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v5, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    or-int/2addr v2, v5

    const v5, -0x1ac20a

    xor-int/2addr v5, v2

    move-object v2, v0

    goto/16 :goto_0

    :sswitch_f
    :try_start_4
    sget v0, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    xor-int/lit16 v0, v0, -0x111

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v1, v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const-string v0, "\u06e0\u06e0\u06e3"

    :goto_6
    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :sswitch_10
    invoke-static {p0}, Luv;->a(Ljava/lang/ClassLoader;)Ljava/lang/String;

    move-result-object v0

    const-string v5, "icv9qQjjqA==\n"

    const-string v6, "2p6+6k2w+3U=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget v0, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    div-int/lit16 v5, v5, -0xe40

    or-int/2addr v0, v5

    if-gtz v0, :cond_10

    const-string v0, "\u06df\u06e3\u06e8"

    invoke-static {v0}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :cond_10
    const-string v0, "\u06e4\u06e6\u06e0"

    goto/16 :goto_1

    :sswitch_11
    :try_start_5
    sget v0, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    xor-int/lit16 v0, v0, 0x12f

    aput-object p1, v1, v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-static {}, Lۣ۟ۢ۠۠;->۠۟ۥ۠()I

    move-result v0

    if-gtz v0, :cond_11

    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    :cond_11
    const-string v0, "\u06e2\u06e4\u06e8"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :sswitch_12
    const/4 v0, 0x2

    :try_start_6
    new-array v1, v0, [Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    sget v0, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v5, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    xor-int/lit16 v5, v5, 0x110f

    xor-int/2addr v0, v5

    if-gtz v0, :cond_12

    const/16 v0, 0x38

    sput v0, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    const-string v0, "\u06e0\u06e0\u06e3"

    goto :goto_6

    :cond_12
    const-string v0, "\u06e7\u06e6\u06df"

    goto/16 :goto_4

    :sswitch_13
    :try_start_7
    invoke-virtual {v3, v2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    move-object v0, v2

    goto/16 :goto_5

    :sswitch_14
    if-eqz v2, :cond_b

    goto/16 :goto_2

    :sswitch_15
    sget v0, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v5, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    xor-int/2addr v0, v5

    const v5, 0x1ac562

    add-int/2addr v0, v5

    move v5, v0

    goto/16 :goto_0

    :sswitch_16
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa784 -> :sswitch_0
        0x1aaae3 -> :sswitch_6
        0x1aab3f -> :sswitch_2
        0x1aabdb -> :sswitch_9
        0x1ab247 -> :sswitch_5
        0x1ab2a4 -> :sswitch_a
        0x1ab2e6 -> :sswitch_f
        0x1ab6fb -> :sswitch_1
        0x1ab9cd -> :sswitch_13
        0x1aba06 -> :sswitch_10
        0x1aba9e -> :sswitch_15
        0x1abadd -> :sswitch_c
        0x1abda5 -> :sswitch_16
        0x1abde5 -> :sswitch_e
        0x1abe43 -> :sswitch_3
        0x1abe60 -> :sswitch_8
        0x1ac208 -> :sswitch_14
        0x1ac221 -> :sswitch_2
        0x1ac565 -> :sswitch_7
        0x1ac5e0 -> :sswitch_11
        0x1ac5e2 -> :sswitch_12
        0x1ac5e7 -> :sswitch_c
        0x1ac8c8 -> :sswitch_16
        0x1ac8cc -> :sswitch_4
        0x1ac945 -> :sswitch_d
        0x1ac9a4 -> :sswitch_b
    .end sparse-switch
.end method

.method public static e(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 11

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    const-string v0, "4q7OmaKRPXeEy/rNxbR9GIG/u/Ov5k1L5Zbkm4S6\n"

    const-string v1, "AS5efC0A2Ps=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    :goto_0
    return-object v0

    :cond_2
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p0}, Luv;->a(Ljava/lang/ClassLoader;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "uFvEWQyQsQ==\n"

    const-string v2, "6w6HGknD4lQ=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    move-result v1

    if-eqz v1, :cond_1

    :try_start_1
    sget-object v0, Lin;->o:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_4

    const/4 v1, 0x0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-result-object v1

    if-eqz v1, :cond_4

    :try_start_2
    sget-object v0, Lpb0;->v:Ljava/lang/String;

    invoke-static {v1, v0}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v0

    :goto_1
    if-gtz v0, :cond_3

    const/16 v0, 0x3e8

    :cond_3
    :try_start_3
    sget-object v2, Lpb0;->w:Ljava/lang/String;

    invoke-static {v1, v2}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result v1

    move v5, v1

    :goto_2
    :try_start_4
    sget-object v1, Lgn;->a:Lgn;

    const-string v2, "ZyzoIJjlo2FqFucQgvapUWMn\n"

    const-string v3, "DEmRf+uVzA4=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lgn;->e(Ljava/lang/String;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    move-result v1

    if-eqz v1, :cond_1f

    :try_start_5
    const-string v1, "BAVPsC8v6LoJP0CANTziigMFWA==\n"

    const-string v2, "b2A271xfh9U=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lgn;->b(Ljava/lang/String;I)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    move-result v1

    :goto_3
    if-lez v1, :cond_1f

    mul-int/lit16 v0, v1, 0x3e8

    move v4, v0

    :goto_4
    const/4 v0, 0x1

    if-ne v5, v0, :cond_6

    :try_start_6
    const-string v0, "vt44JQ==\n"

    const-string v1, "37NKeoQNbH8=\n"

    :goto_5
    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lin;->p:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_7

    const/4 v2, 0x0

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object p1, v3, v6

    const/4 v6, 0x1

    aput-object v0, v3, v6

    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_6
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_8

    check-cast v0, Ljava/lang/String;

    move-object v3, v0

    :goto_7
    if-nez v3, :cond_9

    const-string v0, "/injByOS0gGuTNdiZJCAe7kYm1sp3LsP+j3sCQSv3QitT+VoaISNe40klXk12YgL+A3CCRm3\n"

    const-string v1, "Halz74w/O54=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    move-result-object v0

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    :try_start_7
    const-string v0, "pDLPOOZ5GfubHv4E6nQY0owv\n"

    const-string v2, "6UGoa4MXfZ4=\n"

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
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    const/16 v0, 0x3e8

    goto :goto_1

    :catchall_1
    move-exception v1

    :try_start_8
    const-string v1, "R0oJG3xe3Oh4ZjgncFPdy2dN\n"

    const-string v2, "CjluSBkwuI0=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Nwje\n"

    const-string v3, "Q2m5jaPP2Zc=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "Fg==\n"

    const-string v2, "c8HJlSTQVfc=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_d

    :goto_8
    const/4 v1, 0x4

    move v5, v1

    goto/16 :goto_2

    :catchall_2
    move-exception v0

    const/16 v0, 0x3e8

    :goto_9
    :try_start_9
    const-string v1, "eUh9kLH1m2tGZFWvsM2QZ1de\n"

    const-string v2, "NDsaw9Sb/w4=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Nwje\n"

    const-string v3, "Q2m5jaPP2Zc=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "Fg==\n"

    const-string v2, "c8HJlSTQVfc=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_8

    :catchall_3
    move-exception v0

    const-string v1, "Nwje\n"

    const-string v2, "Q2m5jaPP2Zc=\n"

    const-string v3, "g1BFboPbetS8fHRSj9Z79qJMQFyK\n"

    const-string v4, "ziMiPea1HrE=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Fg==\n"

    const-string v5, "c8HJlSTQVfc=\n"

    invoke-static {v1, v2, v3, v4, v5}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u3010\u8bed\u97f3\u53d1\u5305\u5931\u8d25\u3011\u5168\u5c40\u5d29\u6e83: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_4
    const/4 v1, 0x4

    const/16 v0, 0x3e8

    move v5, v1

    goto/16 :goto_2

    :catchall_4
    move-exception v1

    :try_start_a
    sget-object v1, Lgn;->a:Lgn;

    const-string v2, "knfjdrF9ATKfTexGq24LApV39A==\n"

    const-string v3, "+RKaKcINbl0=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Tw==\n"

    const-string v4, "fx1NcQXhFwE=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v3}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lb50;->R(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    move-result v1

    goto/16 :goto_3

    :cond_5
    const/4 v1, 0x0

    goto/16 :goto_3

    :catchall_5
    move-exception v1

    :try_start_b
    const-string v1, "Ja5lS47uBQgaglFohO8H\n"

    const-string v2, "aN0CGOuAYW0=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Nwje\n"

    const-string v3, "Q2m5jaPP2Zc=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "Fg==\n"

    const-string v2, "c8HJlSTQVfc=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move v4, v0

    goto/16 :goto_4

    :cond_6
    const-string v0, "+vS0eNY=\n"

    const-string v1, "iZ3YE4nu4zo=\n"

    goto/16 :goto_5

    :cond_7
    const/4 v0, 0x0

    goto/16 :goto_6

    :cond_8
    const/4 v0, 0x0

    move-object v3, v0

    goto/16 :goto_7

    :cond_9
    new-instance v6, Li00;

    invoke-direct {v6}, Li00;-><init>()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :try_start_c
    sget-object v0, Lpb0;->S:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_d

    sget-object v0, Lpb0;->S:Ljava/lang/String;

    invoke-static {v0, p0}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    if-eqz v2, :cond_d

    sget-object v0, Lpb0;->I0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const/4 v1, 0x0

    :goto_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, p0}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    move-result-object v8

    if-eqz v8, :cond_1d

    :try_start_d
    sget-object v0, Lpb0;->t:Ljava/lang/String;

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object v2, v9, v10

    invoke-static {v8, v0, v9}, Lde/robv/android/xposed/XposedHelpers;->callStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    move-result-object v0

    :goto_b
    if-nez v0, :cond_a

    :try_start_e
    sget-object v1, Lpb0;->u:Ljava/lang/String;

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object v2, v9, v10

    invoke-static {v8, v1, v9}, Lde/robv/android/xposed/XposedHelpers;->callStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    move-result-object v0

    :cond_a
    :goto_c
    if-eqz v0, :cond_c

    move-object v2, v0

    :goto_d
    if-eqz v2, :cond_10

    :try_start_f
    sget-object v0, Lpb0;->T:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    move-result v0

    if-lez v0, :cond_10

    :try_start_10
    sget-object v0, Lpb0;->T:Ljava/lang/String;

    invoke-static {v0, p0}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_10

    sget-object v1, Lpb0;->U:Ljava/lang/String;

    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedHelpers;->getStaticObjectField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    sget-object v0, Lpb0;->V:Ljava/lang/String;

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object v7, v1, v9

    const/4 v9, 0x1

    aput-object p2, v1, v9

    const/4 v9, 0x2

    aput-object v8, v1, v9

    invoke-static {v2, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_e

    check-cast v0, Ljava/lang/String;

    move-object v1, v0

    :goto_e
    sget-object v0, Lpb0;->V:Ljava/lang/String;

    const/4 v9, 0x3

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object v7, v9, v10

    const/4 v7, 0x1

    aput-object v3, v9, v7

    const/4 v7, 0x2

    aput-object v8, v9, v7

    invoke-static {v2, v0, v9}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/String;

    if-eqz v2, :cond_f

    check-cast v0, Ljava/lang/String;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    :goto_f
    if-eqz v1, :cond_b

    :try_start_11
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_11

    :cond_b
    const-string v0, "LjPk5aFX6ahIVtCxxnKpx00ikpeOIL+xJDPu6JFB6atAVsSExmGvwlMjkY6xI6uvJRzZ6bF15JNi\nVsqEwXqNzGIEkqOuIJOBKB7j5at+5aFAVMmu\n"

    const-string v1, "zbN0AC7GDCQ=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :catchall_6
    move-exception v0

    const-string v0, "PsQfQW8F3+8B6DR9aSg=\n"

    const-string v9, "c7d4Egpru4o=\n"

    invoke-static {v0, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v9, "Nwje\n"

    const-string v10, "Q2m5jaPP2Zc=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "Fg==\n"

    const-string v9, "c8HJlSTQVfc=\n"

    invoke-static {v0, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-object v0, v1

    goto/16 :goto_b

    :catchall_7
    move-exception v1

    const-string v1, "G6WC/Y62GfkkianBiJkF\n"

    const-string v8, "VtblruvYfZw=\n"

    invoke-static {v1, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v8, "Nwje\n"

    const-string v9, "Q2m5jaPP2Zc=\n"

    invoke-static {v8, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "Fg==\n"

    const-string v8, "c8HJlSTQVfc=\n"

    invoke-static {v1, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    goto/16 :goto_c

    :catchall_8
    move-exception v0

    :try_start_12
    const-string v1, "erTF2nDExQ1FmPTPRunOGE4=\n"

    const-string v2, "N8eiiRWqoWg=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Nwje\n"

    const-string v3, "Q2m5jaPP2Zc=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "Fg==\n"

    const-string v2, "c8HJlSTQVfc=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u3010\u53d1\u5305\u5931\u8d25\u3011VFS \u5f02\u5e38: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    move-result-object v0

    goto/16 :goto_0

    :cond_c
    move-object v1, v0

    goto/16 :goto_a

    :cond_d
    const/4 v0, 0x0

    move-object v2, v0

    goto/16 :goto_d

    :cond_e
    const/4 v1, 0x0

    goto/16 :goto_e

    :cond_f
    const/4 v0, 0x0

    goto/16 :goto_f

    :catchall_9
    move-exception v0

    :try_start_13
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u3010\u53d1\u5305\u5931\u8d25\u3011VFS \u786c\u7f16\u7801\u89e3\u6790\u5f02\u5e38: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_10
    const/4 v0, 0x0

    const/4 v1, 0x0

    goto/16 :goto_f

    :cond_11
    if-eqz v0, :cond_b

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_b

    invoke-static {p0, v1}, Luv;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0}, Luv;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_12

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u3010\u53d1\u5305\u5931\u8d25\u3011\u6e90\u6587\u4ef6\u4e0d\u5b58\u5728: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_12
    invoke-virtual {v2}, Ljava/io/File;->canRead()Z

    move-result v0

    if-nez v0, :cond_13

    const-string v0, "hkkV/+eljengLCGrgIDNhuVYY43I3MfegEYT/PW3gfz14WOo8dPz94NCI/zgnkE=\n"

    const-string v1, "ZcmFGmg0aGU=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    move-result-object v0

    goto/16 :goto_0

    :cond_13
    :try_start_14
    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/16 v8, 0x0

    cmp-long v0, v0, v8

    if-lez v0, :cond_1c

    invoke-virtual {v7}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_14
    invoke-static {v2, v7}, Lik;->K(Ljava/io/File;Ljava/io/File;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_c

    :try_start_15
    sget-object v2, Lpb0;->s0:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1b

    sget-object v0, Lpb0;->c:Ljava/lang/String;

    invoke-static {v0, p0}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_3

    move-result-object v0

    if-eqz v0, :cond_16

    :try_start_16
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v7

    if-eqz v7, :cond_16

    array-length v8, v7

    const/4 v0, 0x0

    move v1, v0

    :goto_10
    if-ge v1, v8, :cond_16

    aget-object v0, v7, v1

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v2}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_15

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v9

    array-length v9, v9

    const/4 v10, 0x4

    if-ne v9, v10, :cond_15

    :goto_11
    if-eqz v0, :cond_1a

    const/4 v1, 0x0

    const/4 v7, 0x4

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v3, v7, v8

    const/4 v8, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v7, v8

    const/4 v4, 0x2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v7, v4

    const/4 v4, 0x3

    const/4 v5, 0x0

    aput-object v5, v7, v4

    invoke-virtual {v0, v1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v3, v6, Li00;->b:Ljava/lang/Object;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_b

    :try_start_17
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_17

    const-string v0, "vhxAopU1fgTYeXT28hA+a90NOPC1QSUMtTJgoqcxfizsdGTi\n"

    const-string v1, "XZzQRxqkm4g=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_15
    rsub-int/lit8 v0, v1, 0x0

    rsub-int/lit8 v0, v0, 0x1

    move v1, v0

    goto :goto_10

    :cond_16
    const/4 v0, 0x0

    goto :goto_11

    :cond_17
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const-string v1, "KEENz/Q2sGd4JBK2vhfcHW9wdZP+eNlpI3EewuE9sHhRKBy0vifbHXN5\n"

    const-string v2, "y8GdJ1ubWfg=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    new-instance v1, Lhv;

    const/4 v2, 0x1

    invoke-direct {v1, v6, v2, v0}, Lhv;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-static {v2, v3}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-virtual {v1}, Lhv;->a()Ljava/lang/Object;

    :goto_12
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "62RJGrJWD4M=\n"

    const-string v2, "jAE9Mpx4Iao=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/String;

    goto/16 :goto_0

    :cond_18
    new-instance v2, Ljava/util/concurrent/CountDownLatch;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    sget-object v3, Luv;->a:Landroid/os/Handler;

    new-instance v4, Lt5;

    const/4 v5, 0x7

    invoke-direct {v4, v1, v5, v2}, Lt5;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_3

    move-result v1

    if-eqz v1, :cond_19

    :try_start_18
    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_a

    goto :goto_12

    :catchall_a
    move-exception v1

    :try_start_19
    const-string v1, "iEbeniknMOK3avWsOCo8\n"

    const-string v2, "xTW5zUxJVIc=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Nwje\n"

    const-string v3, "Q2m5jaPP2Zc=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "Fg==\n"

    const-string v2, "c8HJlSTQVfc=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_12

    :cond_19
    const-string v1, "naK10os/k3DBxY291SnPI+qjxraiYM5BmpmT0Ic6kUXvx4GH2zDR\n"

    const-string v2, "fiIlNjOEdMo=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_3

    goto :goto_12

    :cond_1a
    :try_start_1a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u3010\u8bed\u97f3\u53d1\u5305\u5931\u8d25\u3011\u672a\u627e\u5230\u5177\u67094\u4e2a\u53c2\u6570\u7684 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " \u65b9\u6cd5"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_b

    move-result-object v0

    goto/16 :goto_0

    :catchall_b
    move-exception v0

    :try_start_1b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u3010\u8bed\u97f3\u53d1\u5305\u5931\u8d25\u3011\u5165\u5e93\u65b9\u6cd5("

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")\u8c03\u7528\u5f02\u5e38: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_1b
    const-string v0, "qJGSJoohnDD49I1fwADwSu+g6nqAb/U+rryVK6A0kzPh+IdDwjHbjz1+a61AwBrIInJPq1HkGssZ\ndGGhV+g=\n"

    const-string v1, "SxECziWMda8=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_3

    move-result-object v0

    goto/16 :goto_0

    :cond_1c
    :try_start_1c
    const-string v0, "STAg/JgHXKovVRSo/yIcxSohV7CtcC+hTgsG\n"

    const-string v1, "qrCwGReWuSY=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_c

    move-result-object v0

    goto/16 :goto_0

    :catchall_c
    move-exception v0

    :try_start_1d
    const-string v1, "UOAb4MHysKVvzDrayPmXr23q\n"

    const-string v2, "HZN8s6Sc1MA=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Nwje\n"

    const-string v3, "Q2m5jaPP2Zc=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "Fg==\n"

    const-string v2, "c8HJlSTQVfc=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u3010\u53d1\u5305\u5931\u8d25\u3011\u6c99\u76d2\u6587\u4ef6\u62f7\u8d1d\u88ab\u7cfb\u7edf\u62e6\u622a: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_8

    move-result-object v0

    goto/16 :goto_0

    :catchall_d
    move-exception v1

    goto/16 :goto_9

    :cond_1d
    move-object v0, v1

    goto/16 :goto_c

    :cond_1e
    move-object v2, v1

    goto/16 :goto_d

    :cond_1f
    move v4, v0

    goto/16 :goto_4
.end method

.method public static f(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 60

    const/4 v7, 0x0

    const/4 v6, 0x0

    const/16 v45, 0x0

    const/16 v36, 0x0

    const/4 v4, 0x0

    const/16 v51, 0x0

    const/16 v29, 0x0

    const/4 v14, 0x0

    const/16 v24, 0x0

    const/16 v44, 0x0

    const/16 v49, 0x0

    const/4 v11, 0x0

    const/16 v43, 0x0

    const/16 v33, 0x0

    const/16 v50, 0x0

    const/16 v34, 0x0

    const/16 v30, 0x0

    const/16 v18, 0x0

    const/16 v28, 0x0

    const/16 v56, 0x0

    const/4 v5, 0x0

    const/16 v21, 0x0

    const/16 v31, 0x0

    const/16 v52, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v54, 0x0

    const/16 v32, 0x0

    const/16 v38, 0x0

    const/16 v35, 0x0

    const/16 v39, 0x0

    const/16 v17, 0x0

    const/16 v16, 0x0

    const/16 v23, 0x0

    const/16 v22, 0x0

    const/16 v42, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/16 v53, 0x0

    const/4 v13, 0x0

    const/16 v19, 0x0

    const/16 v27, 0x0

    const/4 v15, 0x0

    const/16 v20, 0x0

    const/16 v37, 0x0

    const/16 v26, 0x0

    const/16 v25, 0x0

    const-string v46, "\u06e7\u06e2\u06df"

    invoke-static/range {v46 .. v46}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v55

    move-object/from16 v46, v4

    move-object/from16 v47, v8

    move-object/from16 v48, v24

    :goto_0
    sparse-switch v55, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const/4 v8, 0x0

    sget v4, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    if-ltz v4, :cond_49

    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    const-string v4, "\u06e1\u06e7\u06e2"

    :goto_1
    invoke-static {v4}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    move/from16 v32, v8

    goto :goto_0

    :sswitch_1
    const/4 v4, 0x3

    move/from16 v0, v40

    if-eq v0, v4, :cond_55

    const-string v4, "\u06e3\u06e7\u06e1"

    move-object v8, v4

    :goto_2
    invoke-static {v8}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto :goto_0

    :sswitch_2
    const-string v4, "\u06df\u06e4\u06e0"

    move-object v8, v11

    :goto_3
    invoke-static {v4}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v33, v8

    move/from16 v55, v4

    goto :goto_0

    :sswitch_3
    const/4 v5, 0x0

    sget v4, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v8, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    div-int/lit16 v8, v8, -0x1137

    xor-int/2addr v4, v8

    if-ltz v4, :cond_0

    const/16 v4, 0x9

    sput v4, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    const-string v4, "\u06e6\u06e3\u06e7"

    :goto_4
    invoke-static {v4}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto :goto_0

    :cond_0
    sget v4, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v8, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    xor-int/2addr v4, v8

    const v8, 0x1ab9e0

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto :goto_0

    :cond_1
    :sswitch_4
    sget v4, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    if-ltz v4, :cond_2

    const-string v4, "\u06df\u06e8\u06df"

    :goto_5
    invoke-static {v4}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto :goto_0

    :cond_2
    const-string v8, "\u06e4\u06df\u06e7"

    move-object v4, v6

    :goto_6
    invoke-static {v8}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v8

    move-object v6, v4

    move/from16 v55, v8

    goto :goto_0

    :cond_3
    move-object v7, v6

    :goto_7
    sget v6, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    if-gtz v6, :cond_4

    const/16 v6, 0x39

    sput v6, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    const-string v6, "\u06e6\u06e6\u06e7"

    invoke-static {v6}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v8

    move-object v6, v4

    move/from16 v55, v8

    goto :goto_0

    :cond_4
    sget v6, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v8, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sub-int/2addr v6, v8

    const v8, 0x1ac33d

    add-int/2addr v8, v6

    move-object v6, v4

    move/from16 v55, v8

    goto/16 :goto_0

    :sswitch_5
    const-wide/16 v58, 0x0

    :try_start_0
    invoke-static/range {v58 .. v59}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v9

    sget v4, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v8, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    div-int/lit16 v8, v8, 0x1e5d

    mul-int/2addr v4, v8

    if-eqz v4, :cond_5

    const/16 v4, 0x61

    sput v4, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    const-string v4, "\u06e3\u06e7\u06e1"

    invoke-static {v4}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_5
    sget v4, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v8, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    xor-int/2addr v4, v8

    const v8, 0x1aa630

    xor-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_6
    :sswitch_6
    move-object v4, v6

    :goto_8
    sget v6, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    if-gtz v6, :cond_7

    const/16 v6, 0x4a

    sput v6, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    const-string v8, "\u06e7\u06df\u06e4"

    move-object v6, v4

    :goto_9
    invoke-static {v8}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u06e5\u06e5\u06e4"

    invoke-static {v6}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v8

    move-object v6, v4

    move/from16 v55, v8

    goto/16 :goto_0

    :sswitch_7
    :try_start_1
    const-string v4, "9rsRjBKJfw==\n"

    const-string v8, "pe5Sz1faLHs=\n"

    invoke-static {v4, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v45

    invoke-static {v0, v4}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v4

    if-nez v4, :cond_8

    sget v4, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v8, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    rem-int/lit16 v8, v8, 0xef3

    div-int/2addr v4, v8

    if-ltz v4, :cond_39

    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    const-string v4, "\u06e1\u06e1\u06e5"

    invoke-static {v4}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_8
    :sswitch_8
    sget v4, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v8, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    add-int/2addr v4, v8

    const v8, -0x1aa1cb

    xor-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_9
    const/4 v4, 0x1

    :try_start_2
    new-array v4, v4, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v44, v4, v8

    move-object/from16 v0, v21

    invoke-virtual {v0, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result-object v52

    sget v4, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v8, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    div-int/2addr v4, v8

    const v8, 0x1aa77e

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_a
    sget v4, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v8, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    add-int/lit16 v8, v8, 0x257d

    xor-int/2addr v4, v8

    if-gtz v4, :cond_9

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    const-string v4, "\u06e7\u06e0\u06e4"

    invoke-static {v4}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_9
    sget v4, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v8, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sub-int/2addr v4, v8

    const v8, -0x1abb8b

    xor-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_b
    sget v4, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v8, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    add-int/lit16 v8, v8, -0x1327

    rem-int/2addr v4, v8

    if-gtz v4, :cond_a

    const/16 v4, 0x4f

    sput v4, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    const-string v4, "\u06e2\u06e3\u06df"

    invoke-static {v4}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e3\u06e5\u06e3"

    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_c
    if-eqz v15, :cond_50

    :try_start_3
    sget-object v8, Luv;->e:Ljava/lang/reflect/Method;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v20, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    move/from16 v0, v20

    div-int/lit16 v0, v0, -0x1928

    move/from16 v20, v0

    sub-int v4, v4, v20

    if-gtz v4, :cond_b

    const-string v4, "\u06e3\u06e6\u06e1"

    invoke-static {v4}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v20, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06e1\u06e5\u06e2"

    :goto_a
    invoke-static {v4}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v20, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    move-result v4

    if-gtz v4, :cond_c

    move-object v4, v9

    :goto_b
    const-string v8, "\u06e5\u06e7\u06e0"

    invoke-static {v8}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v8

    move-object v10, v4

    move/from16 v55, v8

    goto/16 :goto_0

    :cond_c
    sget v4, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v8, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    rem-int/2addr v4, v8

    const v8, 0x1ac629

    add-int/2addr v4, v8

    move-object v10, v9

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    move-result v4

    if-gtz v4, :cond_e

    const/16 v4, 0x5a

    sput v4, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    move-object v4, v11

    :cond_d
    const-string v8, "\u06e6\u06df\u06e5"

    invoke-static {v8}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v8

    move-object v11, v4

    move/from16 v55, v8

    goto/16 :goto_0

    :cond_e
    const-string v4, "\u06e2\u06e1"

    move-object v8, v4

    goto/16 :goto_9

    :sswitch_f
    const/4 v14, 0x0

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    if-gtz v4, :cond_f

    const/4 v4, 0x6

    sput v4, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    const-string v4, "\u06e7\u06e1\u06e6"

    invoke-static {v4}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_f
    move-object v4, v15

    :cond_10
    const-string v8, "\u06e8\u06e2"

    move-object v15, v4

    goto/16 :goto_2

    :sswitch_10
    :try_start_4
    const-string v4, " \u672a\u77e5"

    move-object/from16 v0, v42

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    const-string v4, "\u06e2\u06df\u06e1"

    :goto_c
    invoke-static {v4}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_11
    :try_start_5
    move-object/from16 v0, v51

    move-object/from16 v1, p0

    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-result-object v4

    sget v8, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v24, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    div-int v8, v8, v24

    const v24, 0x1ac222

    add-int v8, v8, v24

    move-object/from16 v48, v4

    move/from16 v55, v8

    goto/16 :goto_0

    :sswitch_12
    sget v4, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v8, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    rem-int/lit16 v8, v8, -0x1624

    or-int/2addr v4, v8

    if-ltz v4, :cond_11

    const/16 v4, 0x56

    sput v4, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    const-string v8, "\u06e3\u06e0\u06e1"

    move-object v4, v6

    goto/16 :goto_6

    :cond_11
    const-string v4, "\u06e8\u06e6\u06e0"

    invoke-static {v4}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_13
    sget v4, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v8, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    or-int/lit16 v8, v8, 0x215e

    xor-int/2addr v4, v8

    if-gtz v4, :cond_12

    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    const-string v4, "\u06e3\u06e2"

    move-object v8, v12

    :goto_d
    invoke-static {v4}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v4

    move-object v13, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_12
    const-string v4, "\u06e3\u06e4\u06e4"

    move-object v13, v12

    :goto_e
    invoke-static {v4}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_14
    rsub-int/lit8 v4, v39, 0x0

    rsub-int/lit8 v8, v4, 0x1

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v24, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    move/from16 v0, v24

    add-int/lit16 v0, v0, -0xa25

    move/from16 v24, v0

    rem-int v4, v4, v24

    if-gtz v4, :cond_13

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    const-string v4, "\u06df\u06e1\u06e8"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    move/from16 v35, v8

    goto/16 :goto_0

    :cond_13
    const-string v4, "\u06e4\u06e0\u06df"

    :goto_f
    invoke-static {v4}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    move/from16 v35, v8

    goto/16 :goto_0

    :sswitch_15
    sget v4, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v8, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    xor-int/lit16 v8, v8, -0x2f1

    rem-int/2addr v4, v8

    if-ltz v4, :cond_14

    const-string v4, "\u06e6\u06df"

    :goto_10
    invoke-static {v4}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_14
    sget v4, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v8, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    rem-int/2addr v4, v8

    const v8, 0x1ac68d

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_16
    sget v4, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v8, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    add-int/lit16 v8, v8, -0x18c8

    xor-int/2addr v4, v8

    if-ltz v4, :cond_15

    invoke-static {}, Landroidx/core/content/ۥۨۤۦ;->۟۠۠۠ۥ()I

    :goto_11
    const-string v4, "\u06e7\u06e6\u06e8"

    invoke-static {v4}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_15
    const-string v4, "\u06e2\u06e8"

    move-object/from16 v24, v4

    :goto_12
    invoke-static/range {v24 .. v24}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_17
    const-string v4, "Nwje\n"

    const-string v8, "Q2m5jaPP2Zc=\n"

    const-string v24, "/4bdwvDDQanAqu707dk=\n"

    const-string v25, "svW6kZWtJcw=\n"

    invoke-static/range {v24 .. v25}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    const-string v25, "Fg==\n"

    const-string v55, "c8HJlSTQVfc=\n"

    move-object/from16 v0, v24

    move-object/from16 v1, v25

    move-object/from16 v2, v55

    invoke-static {v4, v8, v0, v1, v2}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {v46 .. v46}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v25

    if-nez v25, :cond_40

    const-string v4, "B+29mG2xLwlgh5TF\n"

    const-string v8, "4mIsfeE0yrU=\n"

    invoke-static {v4, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v26

    sget v4, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v8, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    or-int/2addr v4, v8

    const v8, 0x1aaeb5

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_18
    :try_start_6
    sget-object v4, Luv;->d:Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    sget v8, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v15, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    add-int/lit16 v15, v15, -0xe9a

    rem-int/2addr v8, v15

    if-gez v8, :cond_10

    sget v8, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v15, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    div-int/2addr v8, v15

    const v15, 0x1ac5e5

    add-int/2addr v8, v15

    move-object v15, v4

    move/from16 v55, v8

    goto/16 :goto_0

    :sswitch_19
    sget v4, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v8, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    or-int/2addr v4, v8

    const v8, 0x1ab054

    add-int/2addr v4, v8

    move/from16 v55, v4

    move/from16 v39, v32

    goto/16 :goto_0

    :sswitch_1a
    move/from16 v0, v56

    move/from16 v1, v34

    if-ge v0, v1, :cond_1

    :try_start_7
    aget-object v8, v50, v56
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    invoke-static {}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟ۤۦۡ()I

    move-result v4

    if-ltz v4, :cond_16

    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    move-object/from16 v4, v16

    :goto_13
    const-string v16, "\u06e3\u06e1\u06e7"

    invoke-static/range {v16 .. v16}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v24

    move-object/from16 v16, v4

    move-object/from16 v18, v8

    move/from16 v55, v24

    goto/16 :goto_0

    :cond_16
    const-string v4, "\u06df\u06e0\u06df"

    move-object/from16 v18, v8

    :goto_14
    invoke-static {v4}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_1b
    :try_start_8
    sget-object v4, Lpb0;->a:Ljava/lang/String;

    move-object/from16 v0, p0

    invoke-static {v4, v0}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    move-result-object v4

    sget v8, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    if-gtz v8, :cond_56

    const-string v8, "\u06e5\u06e4\u06e4"

    invoke-static {v8}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v36, v4

    move/from16 v55, v8

    goto/16 :goto_0

    :sswitch_1c
    :try_start_9
    move-object/from16 v0, v22

    move/from16 v1, v40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    const-string v4, "\u06df\u06e7\u06e5"

    move-object v8, v13

    goto/16 :goto_d

    :sswitch_1d
    :try_start_a
    const-string v4, "\u5728\u5b57\u5178\u914d\u7f6e\u4e2d\u627e\u4e0d\u5230\u53c2\u6570\u5b9e\u4f53\u7c7b: "

    move-object/from16 v0, v51

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v25

    :goto_15
    :sswitch_1e
    return-object v25

    :sswitch_1f
    array-length v4, v13

    invoke-static {v13, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v0, v16

    invoke-virtual {v0, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    move-result-object v8

    sget v4, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    if-gtz v4, :cond_17

    const/16 v4, 0x5d

    sput v4, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    const-string v4, "\u06e0\u06e4\u06e3"

    :goto_16
    invoke-static {v4}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v19, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_17
    sget v4, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v19, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    xor-int v4, v4, v19

    const v19, 0x1aabbc

    add-int v4, v4, v19

    move-object/from16 v19, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_20
    move/from16 v0, v39

    move/from16 v1, v54

    if-ge v0, v1, :cond_75

    :try_start_b
    aget-object v38, v41, v39
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    sget v4, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v8, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    rem-int/lit16 v8, v8, -0x1242

    rem-int/2addr v4, v8

    if-ltz v4, :cond_18

    const/16 v4, 0x43

    sput v4, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    const-string v4, "\u06e6\u06e1\u06e8"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_18
    const-string v4, "\u06df\u06e3\u06e7"

    :goto_17
    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_21
    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    move-result v4

    if-ltz v4, :cond_19

    const/16 v4, 0x63

    sput v4, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    const-string v4, "\u06e5\u06e5\u06e4"

    invoke-static {v4}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_19
    sget v4, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v8, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sub-int/2addr v4, v8

    const v8, -0x1ab023

    xor-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_22
    :try_start_c
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    move-result-object v4

    sget v8, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v24, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    move/from16 v0, v24

    xor-int/lit16 v0, v0, 0x151a

    move/from16 v24, v0

    add-int v8, v8, v24

    if-ltz v8, :cond_1a

    const-string v8, "\u06e7\u06e2\u06e6"

    invoke-static {v8}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v50, v4

    move/from16 v55, v8

    goto/16 :goto_0

    :cond_1a
    sget v8, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v24, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    rem-int v8, v8, v24

    const v24, 0x1ab990

    add-int v8, v8, v24

    move-object/from16 v50, v4

    move/from16 v55, v8

    goto/16 :goto_0

    :cond_1b
    :sswitch_23
    sget v4, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v8, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    mul-int/2addr v4, v8

    const v8, 0x1a8076

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :catchall_0
    move-exception v4

    :try_start_d
    const-string v4, "K4GbEHr2cHIUra4mbs9mdhaCmTE=\n"

    const-string v8, "ZvL8Qx+YFBc=\n"

    invoke-static {v4, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v8, "Nwje\n"

    const-string v24, "Q2m5jaPP2Zc=\n"

    move-object/from16 v0, v24

    invoke-static {v8, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v4}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v4, "Fg==\n"

    const-string v8, "c8HJlSTQVfc=\n"

    invoke-static {v4, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v4, "YO28l1xdU3U3s4vsN2ImCCnowPJvOhFRb+KA\n"

    const-string v8, "h1YlctPfteA=\n"

    invoke-static {v4, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v25

    goto/16 :goto_15

    :sswitch_24
    invoke-virtual/range {v18 .. v18}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    const/4 v8, 0x0

    aget-object v4, v4, v8

    move-object/from16 v0, v48

    invoke-static {v4, v0}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    move-result v4

    if-eqz v4, :cond_47

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    move-result v4

    if-gtz v4, :cond_1c

    const-string v4, "\u06e7\u06df\u06e3"

    move-object/from16 v8, v20

    move-object/from16 v21, v18

    goto/16 :goto_a

    :cond_1c
    sget v4, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v8, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    add-int/2addr v4, v8

    const v8, 0x1ab0d4

    add-int/2addr v4, v8

    move-object/from16 v21, v18

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_25
    if-eqz v20, :cond_50

    sget v4, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v8, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    add-int/lit16 v8, v8, -0xb8e

    or-int/2addr v4, v8

    if-ltz v4, :cond_1d

    const-string v4, "\u06e4\u06e3\u06e1"

    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_1d
    const-string v4, "\u06e2\u06e5\u06df"

    goto/16 :goto_14

    :sswitch_26
    sget v4, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    if-gtz v4, :cond_1e

    const/16 v4, 0x4b

    sput v4, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    const-string v4, "\u06e7\u06e4\u06e3"

    move-object/from16 v8, v22

    :goto_18
    invoke-static {v4}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v22, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_1e
    sget v4, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v8, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    mul-int/2addr v4, v8

    const v8, 0x1b3b6a

    xor-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_27
    :try_start_e
    invoke-virtual/range {v51 .. v51}, Ljava/lang/String;->length()I
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    move-result v4

    sget v8, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v24, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    move/from16 v0, v24

    add-int/lit16 v0, v0, 0x909

    move/from16 v24, v0

    div-int v8, v8, v24

    if-eqz v8, :cond_1f

    const/16 v8, 0x60

    sput v8, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    const-string v8, "\u06e5\u06e0"

    invoke-static {v8}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v29, v4

    move/from16 v55, v8

    goto/16 :goto_0

    :cond_1f
    move/from16 v8, v30

    :goto_19
    const-string v24, "\u06e1\u06e8\u06e2"

    move/from16 v29, v4

    move/from16 v30, v8

    goto/16 :goto_12

    :sswitch_28
    :try_start_f
    const-class v4, Ljava/lang/Long;

    move-object/from16 v0, v47

    invoke-static {v0, v4}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    move-result v4

    if-eqz v4, :cond_4b

    invoke-static {}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->۟ۡۨۢ()I

    move-result v4

    if-gtz v4, :cond_20

    const-string v4, "\u06e0\u06e7\u06e2"

    move-object/from16 v8, v25

    :goto_1a
    invoke-static {v4}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v25, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_20
    const-string v4, "\u06e2\u06e6\u06e2"

    move-object/from16 v8, v31

    :goto_1b
    invoke-static {v4}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v31, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_21
    :sswitch_29
    sget v4, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v8, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    add-int/lit16 v8, v8, 0x203e

    add-int/2addr v4, v8

    if-gtz v4, :cond_22

    const-string v4, "\u06e4\u06e7\u06e8"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_22
    const-string v4, "\u06e5\u06e1\u06e7"

    :goto_1c
    invoke-static {v4}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_2a
    move-object/from16 v25, v45

    goto/16 :goto_15

    :sswitch_2b
    if-nez v11, :cond_24

    sget v4, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v8, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    div-int/lit16 v8, v8, 0x2566

    or-int/2addr v4, v8

    if-ltz v4, :cond_23

    const/16 v4, 0x2f

    sput v4, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    const-string v4, "\u06e2\u06e5\u06e0"

    invoke-static {v4}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_23
    sget v4, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v8, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    mul-int/2addr v4, v8

    const v8, 0x11fd7f

    xor-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_24
    :sswitch_2c
    invoke-static {}, Landroidx/activity/ۣ۟۠ۤۢ;->۟۠۠ۤۥ()I

    move-result v4

    if-ltz v4, :cond_25

    const-string v4, "\u06e4\u06e6"

    :goto_1d
    invoke-static {v4}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_25
    const-string v4, "\u06e3\u06e3\u06e2"

    move/from16 v8, v39

    :goto_1e
    invoke-static {v4}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    move/from16 v39, v8

    goto/16 :goto_0

    :sswitch_2d
    sget v4, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v8, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    div-int/lit16 v8, v8, 0x882

    add-int/2addr v4, v8

    if-gtz v4, :cond_26

    const/16 v4, 0x9

    sput v4, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    const-string v4, "\u06e3\u06e3\u06e0"

    move-object/from16 v8, v19

    move/from16 v24, v28

    :goto_1f
    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v27, v8

    move/from16 v55, v4

    move/from16 v28, v24

    goto/16 :goto_0

    :cond_26
    const-string v4, "\u06e6\u06e3\u06e3"

    move-object/from16 v24, v4

    move-object/from16 v27, v19

    goto/16 :goto_12

    :sswitch_2e
    const/4 v8, 0x0

    sget v4, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    if-gtz v4, :cond_27

    move/from16 v4, v29

    goto/16 :goto_19

    :cond_27
    sget v4, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v24, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    xor-int v4, v4, v24

    const v24, 0x1ac62e

    add-int v4, v4, v24

    move/from16 v55, v4

    move/from16 v30, v8

    goto/16 :goto_0

    :cond_28
    :sswitch_2f
    sget v4, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v8, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    div-int/lit16 v8, v8, -0x16d4

    xor-int/2addr v4, v8

    if-gtz v4, :cond_29

    invoke-static {}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟ۢۡ۠ۦ()I

    const-string v4, "\u06e8\u06e5\u06e1"

    invoke-static {v4}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_29
    const-string v4, "\u06df\u06e2\u06e8"

    :goto_20
    invoke-static {v4}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_30
    :try_start_10
    sget-object v4, Lpb0;->o0:Ljava/lang/String;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    sget v8, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v24, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sub-int v8, v8, v24

    const v24, 0xdc39

    add-int v8, v8, v24

    move-object/from16 v49, v4

    move/from16 v55, v8

    goto/16 :goto_0

    :sswitch_31
    sget v4, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v8, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    div-int/lit16 v8, v8, 0x1bbc

    xor-int/2addr v4, v8

    if-ltz v4, :cond_2a

    const-string v4, "\u06df\u06e0\u06df"

    invoke-static {v4}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_2a
    const-string v4, "\u06e8\u06e8\u06df"

    move/from16 v8, v32

    goto/16 :goto_1

    :sswitch_32
    :try_start_11
    sget-object v4, Lpb0;->n0:Ljava/lang/String;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    sget v8, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v24, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    add-int v8, v8, v24

    const v24, 0x1aaed9

    xor-int v8, v8, v24

    move-object/from16 v51, v4

    move/from16 v55, v8

    goto/16 :goto_0

    :sswitch_33
    sget v4, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v8, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    add-int/lit16 v8, v8, 0x577

    div-int/2addr v4, v8

    if-eqz v4, :cond_2b

    const/16 v4, 0x21

    sput v4, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    const-string v4, "\u06e1\u06e1\u06e3"

    invoke-static {v4}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_2b
    sget v4, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v8, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    rem-int/2addr v4, v8

    const v8, 0x1ab720

    xor-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_34
    if-nez v21, :cond_4e

    :try_start_12
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    const-string v4, "\u06e7\u06e0\u06e5"

    goto/16 :goto_1b

    :sswitch_35
    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    if-eqz p0, :cond_7a

    if-eqz p1, :cond_7a

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_3

    const-string v8, "\u06e2\u06e7\u06df"

    move-object v7, v6

    goto/16 :goto_6

    :sswitch_36
    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    move-result v4

    if-ltz v4, :cond_2c

    invoke-static {}, Landroid/app/۠ۨۥۨ;->ۣۣ۟ۨۧ()I

    const-string v4, "\u06e8\u06df\u06e4"

    move-object/from16 v8, v31

    goto/16 :goto_1b

    :cond_2c
    sget v4, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v8, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    or-int/2addr v4, v8

    const v8, 0x1ac7d1

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_37
    :try_start_13
    sget-object v4, Lpb0;->q0:Ljava/lang/String;

    move-object/from16 v0, v33

    move-object/from16 v1, p2

    invoke-static {v0, v4, v1}, Lde/robv/android/xposed/XposedHelpers;->setObjectField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    sget v4, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v8, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    mul-int/lit16 v8, v8, 0x2405

    or-int/2addr v4, v8

    if-ltz v4, :cond_2d

    const/16 v4, 0x5b

    sput v4, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    const-string v4, "\u06e7\u06e7\u06e5"

    invoke-static {v4}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_2d
    move-object v4, v10

    goto/16 :goto_b

    :sswitch_38
    :try_start_14
    sget-boolean v4, Luv;->f:Z
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_1

    if-eqz v4, :cond_53

    sget v4, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v8, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    xor-int/lit16 v8, v8, 0x17eb

    div-int/2addr v4, v8

    if-eqz v4, :cond_2e

    const/16 v4, 0x4e

    sput v4, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    const-string v4, "\u06e3\u06e1\u06e0"

    invoke-static {v4}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_2e
    sget v4, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v8, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    xor-int/2addr v4, v8

    const v8, -0x1aa9a8

    xor-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_39
    const/4 v4, 0x3

    :try_start_15
    new-array v4, v4, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object p1, v4, v8

    const/4 v8, 0x1

    aput-object p2, v4, v8

    const/4 v8, 0x2

    aput-object v6, v4, v8
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_1

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    move-result v8

    if-ltz v8, :cond_2f

    const/16 v8, 0x23

    sput v8, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    const-string v8, "\u06e0\u06df\u06e8"

    invoke-static {v8}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v53, v4

    move/from16 v55, v8

    goto/16 :goto_0

    :cond_2f
    sget v8, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v24, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sub-int v8, v8, v24

    const v24, 0x1ab106

    add-int v8, v8, v24

    move-object/from16 v53, v4

    move/from16 v55, v8

    goto/16 :goto_0

    :sswitch_3a
    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v8, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    or-int/lit16 v8, v8, 0x3cc

    div-int/2addr v4, v8

    if-gtz v4, :cond_30

    const-string v4, "\u06e2\u06e7\u06e7"

    invoke-static {v4}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_30
    sget v4, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v8, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    xor-int/2addr v4, v8

    const v8, 0x1aaaf5

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_3b
    :try_start_16
    const-string v4, "\u5b57\u5178\u914d\u7f6e\u7684\u53c2\u6570\u4e2a\u6570 "

    move-object/from16 v0, v42

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_1

    sget v4, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    if-gtz v4, :cond_31

    const-string v4, "\u06e3\u06df\u06e1"

    invoke-static {v4}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_31
    const-string v4, "\u06e5\u06e2\u06e5"

    move-object/from16 v8, v19

    goto/16 :goto_16

    :cond_32
    :sswitch_3c
    sget v4, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    if-gtz v4, :cond_33

    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    const-string v4, "\u06e4\u06e8\u06e3"

    invoke-static {v4}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_33
    sget v4, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v8, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    mul-int/2addr v4, v8

    const v8, 0xc470

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_3d
    sget v4, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v8, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    mul-int/2addr v4, v8

    const v8, 0x18c31f

    xor-int/2addr v4, v8

    move-object/from16 v13, v53

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_34
    :sswitch_3e
    sget v4, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    if-ltz v4, :cond_35

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    const-string v4, "\u06e5\u06e2\u06e4"

    :goto_21
    invoke-static {v4}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_35
    const-string v4, "\u06e2\u06e1\u06e6"

    goto :goto_21

    :sswitch_3f
    sget v4, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v8, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    div-int/2addr v4, v8

    const v8, 0x1aa708

    xor-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_40
    rsub-int/lit8 v4, v56, 0x0

    rsub-int/lit8 v24, v4, 0x1

    invoke-static {}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟ۤۦۡ()I

    move-result v4

    if-ltz v4, :cond_36

    const-string v4, "\u06e3\u06e0\u06e6"

    invoke-static {v4}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    move/from16 v28, v24

    goto/16 :goto_0

    :cond_36
    const-string v4, "\u06e3\u06df\u06e2"

    move-object/from16 v8, v27

    goto/16 :goto_1f

    :sswitch_41
    invoke-static {}, Landroidx/core/content/ۥۨۤۦ;->۟۠۠۠ۥ()I

    move-result v4

    if-ltz v4, :cond_37

    invoke-static {}, Landroidx/versionedparcelable/ۣۢۥ;->ۦۦۡۤ()I

    const-string v4, "\u06e0\u06e0\u06e1"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    move/from16 v56, v28

    goto/16 :goto_0

    :cond_37
    sget v4, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v8, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sub-int/2addr v4, v8

    const v8, 0x1aa493

    add-int/2addr v4, v8

    move/from16 v55, v4

    move/from16 v56, v28

    goto/16 :goto_0

    :sswitch_42
    if-lez v29, :cond_32

    sget v4, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v8, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    xor-int/lit16 v8, v8, 0x1e71

    div-int/2addr v4, v8

    if-eqz v4, :cond_38

    const-string v4, "\u06e5\u06e2\u06e5"

    invoke-static {v4}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_38
    const-string v4, "\u06df\u06e1\u06e8"

    goto/16 :goto_4

    :sswitch_43
    const/4 v4, 0x5

    move/from16 v0, v40

    if-eq v0, v4, :cond_3c

    :try_start_17
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_1

    sget v8, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v24, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    move/from16 v0, v24

    add-int/lit16 v0, v0, 0x117a

    move/from16 v24, v0

    or-int v8, v8, v24

    if-ltz v8, :cond_76

    const-string v8, "\u06e8\u06e4\u06e8"

    invoke-static {v8}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v42, v4

    move/from16 v55, v8

    goto/16 :goto_0

    :sswitch_44
    :try_start_18
    sget-object v4, Lpb0;->r0:Ljava/lang/String;

    const/4 v8, 0x1

    move-object/from16 v0, v33

    invoke-static {v0, v4, v8}, Lde/robv/android/xposed/XposedHelpers;->setIntField(Ljava/lang/Object;Ljava/lang/String;I)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_2

    sget v4, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v8, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    add-int/lit16 v8, v8, -0x2280

    or-int/2addr v4, v8

    if-ltz v4, :cond_3a

    :cond_39
    const-string v4, "\u06e8\u06e4\u06e1"

    invoke-static {v4}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_3a
    sget v4, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v8, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    mul-int/2addr v4, v8

    const v8, 0x1b91cd

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_45
    const/4 v4, 0x2

    :try_start_19
    new-array v4, v4, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v27, v4, v8

    const/4 v8, 0x1

    aput-object v7, v4, v8

    move-object/from16 v0, v20

    invoke-virtual {v0, v15, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_1

    const-string v8, "\u06e3\u06e3\u06e0"

    move-object v4, v6

    goto/16 :goto_6

    :sswitch_46
    sget v4, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v8, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    xor-int/lit16 v8, v8, -0x23a8

    add-int/2addr v4, v8

    if-ltz v4, :cond_3b

    const-string v4, "\u06e6\u06e2\u06e8"

    move-object/from16 v8, v33

    goto/16 :goto_3

    :cond_3b
    const-string v4, "\u06df\u06e1\u06e8"

    move-object/from16 v8, v31

    goto/16 :goto_1b

    :sswitch_47
    :try_start_1a
    invoke-virtual/range {v38 .. v38}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    array-length v4, v4
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_1

    move/from16 v0, v40

    if-ne v4, v0, :cond_21

    const-string v4, "\u06e3\u06e2"

    move-object/from16 v16, v38

    :goto_22
    invoke-static {v4}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_3c
    :sswitch_48
    sget v4, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v8, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    add-int/lit16 v8, v8, 0x19fe

    add-int/2addr v4, v8

    if-gtz v4, :cond_3d

    const/16 v4, 0x27

    sput v4, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    const-string v4, "\u06e0\u06e0"

    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_3d
    sget v4, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v8, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    rem-int/2addr v4, v8

    const v8, -0x1aaef7

    xor-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_49
    :try_start_1b
    const-string v4, "TzisUbrgZw==\n"

    const-string v8, "HG3vEv+zNNY=\n"

    invoke-static {v4, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_1

    move-result-object v25

    goto/16 :goto_15

    :sswitch_4a
    if-eqz p2, :cond_6

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_1b

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    move-result v4

    if-gtz v4, :cond_3e

    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    const-string v4, "\u06e3\u06e3\u06e2"

    move/from16 v8, v34

    :goto_23
    invoke-static {v4}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v34, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_3e
    sget v4, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v8, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    xor-int/2addr v4, v8

    const v8, -0x1abf76

    xor-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_4b
    invoke-static {}, Landroidx/core/content/ۥۨۤۦ;->۟۠۠۠ۥ()I

    move-result v4

    if-ltz v4, :cond_3f

    const/16 v4, 0x3f

    sput v4, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    const-string v4, "\u06e0\u06e1\u06e7"

    invoke-static {v4}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v27, v52

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_3f
    const-string v4, "\u06e3\u06e2\u06e1"

    invoke-static {v4}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v27, v52

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_40
    :sswitch_4c
    sget v4, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v8, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    xor-int/lit16 v8, v8, 0x34b

    sub-int/2addr v4, v8

    if-ltz v4, :cond_41

    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    const-string v4, "\u06e2\u06e2\u06e3"

    invoke-static {v4}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_41
    sget v4, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v8, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    add-int/2addr v4, v8

    const v8, -0x1ab7ab

    xor-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_4d
    sget v4, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v8, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    div-int/lit16 v8, v8, -0xcdc

    add-int/2addr v4, v8

    if-gtz v4, :cond_42

    const/16 v4, 0x43

    sput v4, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    const-string v4, "\u06e7\u06e2\u06e1"

    invoke-static {v4}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_42
    sget v4, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v8, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    xor-int/2addr v4, v8

    const v8, 0x1aac3b

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_4e
    if-nez v16, :cond_5d

    :try_start_1c
    sget-object v24, Lpb0;->a:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_1

    sget v4, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    if-ltz v4, :cond_43

    const/16 v4, 0x1d

    sput v4, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    const-string v4, "\u06e2\u06df\u06e1"

    move-object/from16 v22, v8

    move-object/from16 v23, v24

    goto/16 :goto_e

    :cond_43
    const-string v4, "\u06e8\u06e8\u06e8"

    move-object/from16 v23, v24

    goto/16 :goto_18

    :sswitch_4f
    sget v4, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    if-ltz v4, :cond_44

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    const-string v4, "\u06e7\u06df\u06e6"

    :goto_24
    invoke-static {v4}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_44
    sget v4, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v8, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    or-int/2addr v4, v8

    const v8, 0x1aace5

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_50
    :try_start_1d
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    const/4 v8, 0x4

    aget-object v4, v4, v8
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_1

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    move-result v8

    if-gtz v8, :cond_45

    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    const-string v8, "\u06e2\u06e0\u06e2"

    invoke-static {v8}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v47, v4

    move/from16 v55, v8

    goto/16 :goto_0

    :cond_45
    sget v8, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v24, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    mul-int v8, v8, v24

    const v24, 0x190abd

    add-int v8, v8, v24

    move-object/from16 v47, v4

    move/from16 v55, v8

    goto/16 :goto_0

    :sswitch_51
    const/4 v4, 0x1

    :try_start_1e
    new-array v4, v4, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v27, v4, v8

    move-object/from16 v0, v20

    invoke-virtual {v0, v15, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_1

    sget v4, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v8, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    add-int/2addr v4, v8

    const v8, 0x1ab6ef

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_52
    :try_start_1f
    sget-object v4, Lpb0;->p0:Ljava/lang/String;

    move-object/from16 v0, v33

    move-object/from16 v1, p1

    invoke-static {v0, v4, v1}, Lde/robv/android/xposed/XposedHelpers;->setObjectField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_0

    sget v4, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    if-ltz v4, :cond_46

    const/16 v4, 0x44

    sput v4, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    const-string v4, "\u06e8\u06e8\u06df"

    invoke-static {v4}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_46
    sget v4, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v8, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    or-int/2addr v4, v8

    const v8, 0x1ac9e4

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_47
    :sswitch_53
    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v8, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    rem-int/lit16 v8, v8, 0x407

    add-int/2addr v4, v8

    if-ltz v4, :cond_48

    const-string v4, "\u06e6\u06df\u06e3"

    goto/16 :goto_1c

    :cond_48
    sget v4, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v8, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    add-int/2addr v4, v8

    const v8, 0x1ab9df

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_54
    :try_start_20
    sget v4, Lpb0;->O:I
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_1

    :goto_25
    const-string v8, "\u06e5\u06e3\u06e7"

    invoke-static {v8}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v40, v4

    move/from16 v55, v8

    goto/16 :goto_0

    :sswitch_55
    sget v4, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v8, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    rem-int/2addr v4, v8

    const v8, -0x1aaae1

    xor-int/2addr v4, v8

    move/from16 v55, v4

    move/from16 v56, v30

    goto/16 :goto_0

    :sswitch_56
    :try_start_21
    const-string v4, "dZ/u6xLjl+c4x/eRTNj6nh60\n"

    const-string v8, "kiJ/DKl/cXs=\n"

    invoke-static {v4, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_1

    move-result-object v4

    :goto_26
    const-string v8, "\u06e3\u06e5\u06e3"

    move-object/from16 v37, v4

    :goto_27
    invoke-static {v8}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_57
    invoke-static {}, Lۣ۟ۢ۠۠;->۠۟ۥ۠()I

    move-result v4

    if-gtz v4, :cond_4a

    move/from16 v8, v32

    :cond_49
    const-string v4, "\u06e5\u06e3\u06e1"

    invoke-static {v4}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    move/from16 v32, v8

    goto/16 :goto_0

    :cond_4a
    const-string v4, "\u06e1\u06e1\u06e3"

    :goto_28
    invoke-static {v4}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_58
    move-object/from16 v25, v37

    goto/16 :goto_15

    :cond_4b
    :sswitch_59
    sget v4, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v8, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    mul-int/lit16 v8, v8, -0xca2

    rem-int/2addr v4, v8

    if-ltz v4, :cond_4c

    const-string v4, "\u06e7\u06e3\u06e3"

    invoke-static {v4}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_4c
    sget v4, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v8, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    add-int/2addr v4, v8

    const v8, 0x1aaa1a

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_5a
    :try_start_22
    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_1

    move-result-object v25

    goto/16 :goto_15

    :sswitch_5b
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    move-result v4

    if-gtz v4, :cond_4d

    const-string v4, "\u06e0\u06e8\u06e7"

    goto/16 :goto_20

    :cond_4d
    sget v4, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v8, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    add-int/2addr v4, v8

    const v8, 0x1ab410

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_4e
    :sswitch_5c
    sget v4, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    if-gtz v4, :cond_4f

    const-string v4, "\u06e1\u06e2\u06df"

    :goto_29
    invoke-static {v4}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_4f
    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v8, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    or-int/2addr v4, v8

    const v8, 0x1ab44a

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_5d
    sget v4, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v8, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    rem-int/2addr v4, v8

    const v8, 0x1abe7d

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_50
    :sswitch_5e
    sget v4, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v8, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    add-int/lit16 v8, v8, 0x20a

    sub-int/2addr v4, v8

    if-ltz v4, :cond_51

    const-string v4, "\u06e4\u06df\u06e2"

    :goto_2a
    invoke-static {v4}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_51
    sget v4, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v8, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    or-int/2addr v4, v8

    const v8, 0x1aa853

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_5f
    :try_start_23
    move-object/from16 v0, v42

    move/from16 v1, v40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_1

    sget v4, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v8, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    div-int/2addr v4, v8

    const v8, -0x1ac90c

    xor-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_60
    :try_start_24
    invoke-static/range {p0 .. p0}, Luv;->a(Ljava/lang/ClassLoader;)Ljava/lang/String;
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_1

    move-result-object v45

    sget v4, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    if-ltz v4, :cond_52

    const-string v4, "\u06e2\u06e2\u06e8"

    invoke-static {v4}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_52
    sget v4, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v8, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    add-int/2addr v4, v8

    const v8, 0x1acb86

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_53
    :sswitch_61
    invoke-static {}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۦۤۨۢ()I

    move-result v4

    if-gtz v4, :cond_54

    const/16 v4, 0x12

    sput v4, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    const-string v4, "\u06e8\u06e1\u06e3"

    move/from16 v8, v35

    goto/16 :goto_f

    :cond_54
    const-string v4, "\u06e1\u06e6\u06e8"

    goto/16 :goto_10

    :cond_55
    :sswitch_62
    const-string v4, "\u06e1\u06e4\u06e5"

    goto/16 :goto_5

    :sswitch_63
    :try_start_25
    move-object/from16 v0, v31

    move-object/from16 v1, v51

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_1

    sget v4, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v8, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sub-int/2addr v4, v8

    const v8, 0x1aadc9

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :catchall_1
    move-exception v4

    sget v8, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v24, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sub-int v8, v8, v24

    const v24, 0x1aaea5

    add-int v8, v8, v24

    move-object/from16 v46, v4

    move/from16 v55, v8

    goto/16 :goto_0

    :sswitch_64
    sget v4, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v8, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    or-int/lit16 v8, v8, -0x1a2f

    xor-int/2addr v4, v8

    if-ltz v4, :cond_57

    const/16 v4, 0x38

    sput v4, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    move-object/from16 v4, v36

    :cond_56
    const-string v8, "\u06e3\u06e8\u06e4"

    invoke-static {v8}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v36, v4

    move/from16 v55, v8

    goto/16 :goto_0

    :cond_57
    const-string v4, "\u06e2\u06e3\u06e8"

    invoke-static {v4}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_65
    sget v4, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v8, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    div-int/lit16 v8, v8, 0xa21

    mul-int/2addr v4, v8

    if-eqz v4, :cond_58

    const/16 v4, 0x13

    sput v4, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    move-object/from16 v4, v37

    goto/16 :goto_26

    :cond_58
    sget v4, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v8, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    div-int/2addr v4, v8

    const v8, 0x1ab9c7

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_59
    :sswitch_66
    const-string v4, "\u06e3\u06e6\u06e1"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_67
    :try_start_26
    const-string v4, "\u627e\u4e0d\u5230\u63a5\u6536 "

    move-object/from16 v0, v31

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_1

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    move-result v4

    if-ltz v4, :cond_5a

    invoke-static {}, Landroidx/core/content/ۥۨۤۦ;->۟۠۠۠ۥ()I

    const-string v4, "\u06e0\u06e7\u06e4"

    invoke-static {v4}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_5a
    sget v4, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v8, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    add-int/2addr v4, v8

    const v8, 0x1ac04a

    xor-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_68
    :try_start_27
    invoke-virtual/range {v31 .. v31}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_1

    move-result-object v25

    goto/16 :goto_15

    :sswitch_69
    const-string v4, "\u06e3\u06e6\u06e6"

    move-object/from16 v8, v26

    goto/16 :goto_1a

    :sswitch_6a
    :try_start_28
    const-string v4, " \u7684\u6784\u9020\u5668"

    move-object/from16 v0, v22

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_1

    sget v4, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v8, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    div-int/2addr v4, v8

    const v8, 0x1abe24

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_6b
    sget v4, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v8, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    or-int/2addr v4, v8

    const v8, 0x1abc9f

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_6c
    :try_start_29
    const-string v4, "Snbq/2z5UrpfZv3IbOVS5gM9sJU=\n"

    const-string v8, "LROevAOXIc4=\n"

    invoke-static {v4, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v41

    invoke-static {v4, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, v41

    array-length v4, v0
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_1

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    move-result v8

    if-gtz v8, :cond_5b

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    const-string v8, "\u06e2\u06e8"

    invoke-static {v8}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v54, v4

    move/from16 v55, v8

    goto/16 :goto_0

    :cond_5b
    sget v8, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v24, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    rem-int v8, v8, v24

    const v24, 0xdb6f

    add-int v8, v8, v24

    move/from16 v54, v4

    move/from16 v55, v8

    goto/16 :goto_0

    :sswitch_6d
    invoke-static {}, Lkotlinx/coroutines/ۦۡۧۧ;->۟ۤۧۨۦ()I

    move-result v4

    if-ltz v4, :cond_5c

    const/16 v4, 0x52

    sput v4, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    const-string v4, "\u06e7\u06e1\u06e7"

    invoke-static {v4}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_5c
    const-string v4, "\u06df\u06e3"

    goto/16 :goto_10

    :cond_5d
    :sswitch_6e
    const-string v4, "\u06e0\u06e4\u06e3"

    goto/16 :goto_1d

    :sswitch_6f
    const/16 v17, 0x0

    sget v4, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v8, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    xor-int/lit16 v8, v8, 0x25e5

    xor-int/2addr v4, v8

    if-ltz v4, :cond_5e

    const/4 v4, 0x6

    sput v4, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    const-string v4, "\u06e4\u06df\u06e3"

    invoke-static {v4}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_5e
    const-string v4, "\u06e7\u06df\u06e3"

    goto/16 :goto_1c

    :sswitch_70
    invoke-static {}, Landroidx/core/content/ۣ۟ۧ۠;->۟۟۠ۢۨ()I

    move-result v4

    if-ltz v4, :cond_5f

    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    const-string v4, "\u06e6\u06e6\u06e1"

    goto/16 :goto_22

    :cond_5f
    const-string v4, "\u06e0\u06e1\u06df"

    goto/16 :goto_29

    :sswitch_71
    sget v4, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v8, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    xor-int/lit16 v8, v8, -0x1804

    rem-int/2addr v4, v8

    if-gtz v4, :cond_60

    const/16 v4, 0x5a

    sput v4, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    const-string v4, "\u06df\u06e3\u06e7"

    move-object/from16 v16, v17

    goto/16 :goto_c

    :cond_60
    move-object/from16 v4, v17

    move-object/from16 v8, v18

    goto/16 :goto_13

    :catchall_2
    move-exception v4

    :try_start_2a
    sget-object v4, Lpb0;->r0:Ljava/lang/String;

    move-object/from16 v0, v33

    invoke-static {v0, v4, v6}, Lde/robv/android/xposed/XposedHelpers;->setObjectField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_0

    sget v4, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v8, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    div-int/lit16 v8, v8, 0x4bb

    xor-int/2addr v4, v8

    if-gtz v4, :cond_69

    const/16 v4, 0x39

    sput v4, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    const-string v4, "\u06e0\u06e0\u06e7"

    invoke-static {v4}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_72
    :try_start_2b
    invoke-virtual/range {v42 .. v42}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_1

    move-result-object v25

    goto/16 :goto_15

    :sswitch_73
    sget v4, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    if-ltz v4, :cond_61

    const-string v4, "\u06e1\u06e7\u06e4"

    move/from16 v8, v39

    goto/16 :goto_1e

    :cond_61
    sget v4, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v8, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    or-int/2addr v4, v8

    const v8, 0x1ac192

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_74
    :try_start_2c
    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_1

    sget v4, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v8, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    div-int/lit16 v8, v8, -0x1ef9

    sub-int/2addr v4, v8

    if-gtz v4, :cond_62

    const/16 v4, 0x34

    sput v4, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    const-string v4, "\u06df\u06e2\u06e8"

    goto/16 :goto_14

    :cond_62
    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v8, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    mul-int/2addr v4, v8

    const v8, 0x1ae6cf

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_75
    sget v4, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v8, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    xor-int/lit16 v8, v8, -0x2213

    sub-int/2addr v4, v8

    if-ltz v4, :cond_63

    const-string v4, "\u06e4\u06e2\u06df"

    invoke-static {v4}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v21, v5

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_63
    sget v4, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v8, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    div-int/2addr v4, v8

    const v8, 0xdbe4

    add-int/2addr v4, v8

    move-object/from16 v21, v5

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_76
    const-string v4, "\u06e0\u06e8"

    invoke-static {v4}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_77
    sget v4, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    if-gtz v4, :cond_64

    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    const-string v4, "\u06e8\u06df\u06e7"

    invoke-static {v4}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_64
    sget v4, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v8, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sub-int/2addr v4, v8

    const v8, 0x1ab52e

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_78
    sget v4, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    if-gtz v4, :cond_65

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۦۥ()I

    const-string v4, "\u06e1\u06e0\u06e7"

    goto/16 :goto_28

    :cond_65
    sget v4, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v8, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    add-int/2addr v4, v8

    const v8, -0x1ac8fa

    xor-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_79
    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    move-result v4

    if-gtz v4, :cond_66

    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    const-string v4, "\u06e0\u06e3\u06e8"

    invoke-static {v4}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_66
    sget v4, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v8, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    div-int/2addr v4, v8

    const v8, 0x1ac1c3

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_7a
    :try_start_2d
    const-string v4, "kbmYSzgj3qGEqY98OD/e/djywiE=\n"

    const-string v8, "9tzsCFdNrdU=\n"

    invoke-static {v4, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v50

    invoke-static {v4, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, v50

    array-length v8, v0
    :try_end_2d
    .catchall {:try_start_2d .. :try_end_2d} :catchall_1

    sget v4, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    if-ltz v4, :cond_67

    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    const-string v4, "\u06e8\u06e2\u06e4"

    invoke-static {v4}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v34, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_67
    const-string v4, "\u06e7\u06e7\u06e5"

    goto/16 :goto_23

    :cond_68
    :sswitch_7b
    const-string v4, "\u06e8\u06e8\u06e6"

    invoke-static {v4}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_7c
    :try_start_2e
    const-string v4, " \u4e2d\u627e\u4e0d\u5230\u53c2\u6570\u4e2a\u6570\u4e3a "

    move-object/from16 v0, v22

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_1

    const-string v4, "\u06e0\u06e6\u06df"

    move-object v8, v4

    goto/16 :goto_27

    :sswitch_7d
    :try_start_2f
    invoke-virtual/range {v49 .. v49}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_28

    move-object/from16 v0, v44

    move-object/from16 v1, v49

    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_2f
    .catchall {:try_start_2f .. :try_end_2f} :catchall_0

    move-result-object v4

    sget v8, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v11, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    add-int/lit16 v11, v11, -0x1a80

    sub-int/2addr v8, v11

    if-gtz v8, :cond_d

    invoke-static {}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۦۧۢ۟()I

    move-object v11, v4

    :cond_69
    const-string v4, "\u06e6\u06e3\u06e5"

    invoke-static {v4}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_7e
    const-string v4, "goFrahAmqYTd6UA2\n"

    const-string v5, "Zw7pjIWWTTw=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v25

    goto/16 :goto_15

    :sswitch_7f
    sget v4, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    if-gtz v4, :cond_6a

    const-string v4, "\u06df\u06e4\u06e8"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_6a
    sget v4, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v8, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    mul-int/2addr v4, v8

    const v8, 0x12967f

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_80
    :try_start_30
    const-string v4, " \u7684\u6784\u9020\u5668"

    move-object/from16 v0, v31

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_30
    .catchall {:try_start_30 .. :try_end_30} :catchall_1

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v8, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    rem-int/lit16 v8, v8, -0x26d5

    add-int/2addr v4, v8

    if-gtz v4, :cond_6b

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    const-string v4, "\u06e5\u06e4\u06e2"

    invoke-static {v4}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_6b
    sget v4, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v8, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    div-int/2addr v4, v8

    const v8, 0x1ab346

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_81
    :try_start_31
    invoke-virtual/range {v18 .. v18}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    array-length v4, v4
    :try_end_31
    .catchall {:try_start_31 .. :try_end_31} :catchall_1

    const/4 v8, 0x1

    if-ne v4, v8, :cond_47

    const-string v4, "\u06e5\u06e7\u06df"

    goto/16 :goto_2a

    :sswitch_82
    sget v4, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    if-gtz v4, :cond_6c

    const/16 v4, 0x19

    sput v4, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    const-string v4, "\u06e4\u06df\u06e7"

    move-object/from16 v33, v43

    move-object/from16 v8, v43

    :goto_2b
    invoke-static {v4}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v43, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_6c
    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v8, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    add-int/2addr v4, v8

    const v8, -0x1ab109

    xor-int/2addr v4, v8

    move-object/from16 v33, v43

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_83
    if-nez v48, :cond_68

    sget v4, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v8, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    add-int/lit16 v8, v8, 0x1ed8

    sub-int/2addr v4, v8

    if-ltz v4, :cond_6d

    move/from16 v4, v40

    goto/16 :goto_25

    :cond_6d
    const-string v4, "\u06e8\u06e3\u06e3"

    move-object v8, v4

    goto/16 :goto_9

    :sswitch_84
    const-string v4, "\u06e6\u06e3"

    move-object/from16 v8, v41

    :goto_2c
    invoke-static {v4}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v41, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_85
    :try_start_32
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;
    :try_end_32
    .catchall {:try_start_32 .. :try_end_32} :catchall_1

    move-result-object v8

    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    move-result v4

    if-gtz v4, :cond_6e

    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    const-string v4, "\u06e8\u06e3\u06e3"

    goto :goto_2c

    :cond_6e
    sget v4, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v24, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    rem-int v4, v4, v24

    const v24, 0x1aad39

    add-int v4, v4, v24

    move-object/from16 v41, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_86
    :try_start_33
    invoke-virtual/range {v48 .. v48}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
    :try_end_33
    .catchall {:try_start_33 .. :try_end_33} :catchall_1

    move-result-object v44

    sget v4, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    if-ltz v4, :cond_6f

    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    const-string v4, "\u06df\u06e0\u06e8"

    invoke-static {v4}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_6f
    sget v4, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v8, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    xor-int/2addr v4, v8

    const v8, 0x1ac093

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_87
    :try_start_34
    const-string v4, "\u5728 "

    move-object/from16 v0, v22

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_34
    .catchall {:try_start_34 .. :try_end_34} :catchall_1

    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v8, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    add-int/lit16 v8, v8, 0x1e95

    sub-int/2addr v4, v8

    if-ltz v4, :cond_70

    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    const-string v4, "\u06e7\u06e5\u06e4"

    invoke-static {v4}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_70
    const-string v4, "\u06e7\u06e4\u06e3"

    move-object/from16 v8, v22

    goto/16 :goto_18

    :sswitch_88
    sget v4, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v8, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    div-int/lit16 v8, v8, -0xdef

    xor-int/2addr v4, v8

    if-gtz v4, :cond_71

    const-string v4, "\u06e0\u06e6\u06e7"

    move/from16 v39, v35

    goto/16 :goto_17

    :cond_71
    const-string v4, "\u06e7\u06e2\u06e3"

    move/from16 v8, v35

    goto/16 :goto_1e

    :sswitch_89
    :try_start_35
    const-string v4, "3l9HFOWG0uSCBm5+u7etsKVK\n"

    const-string v8, "OeLW814aNVU=\n"

    invoke-static {v4, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_35
    .catchall {:try_start_35 .. :try_end_35} :catchall_1

    move-result-object v25

    goto/16 :goto_15

    :sswitch_8a
    sget v4, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    if-gtz v4, :cond_72

    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    const-string v4, "\u06e1\u06e2\u06e2"

    invoke-static {v4}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_72
    const-string v4, "\u06e5\u06e1"

    goto/16 :goto_24

    :sswitch_8b
    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v8, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    add-int/lit16 v8, v8, 0x124e

    xor-int/2addr v4, v8

    if-gtz v4, :cond_73

    const/16 v4, 0x16

    sput v4, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    const-string v4, "\u06e0\u06e6\u06df"

    invoke-static {v4}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_73
    sget v4, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v8, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    mul-int/2addr v4, v8

    const v8, 0x1b5576

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :sswitch_8c
    const/4 v4, 0x5

    :try_start_36
    new-array v8, v4, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v8, v4

    const/4 v4, 0x1

    aput-object p2, v8, v4

    const/4 v4, 0x2

    aput-object v6, v8, v4

    const/4 v4, 0x3

    aput-object v7, v8, v4

    const/4 v4, 0x4

    aput-object v10, v8, v4
    :try_end_36
    .catchall {:try_start_36 .. :try_end_36} :catchall_1

    sget v4, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v12, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    div-int/lit16 v12, v12, 0x1cde

    sub-int/2addr v4, v12

    if-ltz v4, :cond_74

    const/16 v4, 0x31

    sput v4, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    const-string v4, "\u06e4\u06e0\u06e1"

    invoke-static {v4}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v4

    move-object v12, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_74
    const-string v4, "\u06e7\u06e2\u06e6"

    move-object v12, v8

    goto/16 :goto_2a

    :sswitch_8d
    :try_start_37
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    move-object/from16 v0, v47

    invoke-static {v0, v4}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_37
    .catchall {:try_start_37 .. :try_end_37} :catchall_1

    move-result v4

    if-nez v4, :cond_59

    move-object v10, v14

    goto/16 :goto_11

    :cond_75
    :sswitch_8e
    const-string v4, "\u06e8\u06e4\u06e8"

    goto/16 :goto_29

    :sswitch_8f
    if-nez v36, :cond_34

    sget v4, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    if-ltz v4, :cond_77

    move-object/from16 v4, v42

    :cond_76
    const-string v8, "\u06e3\u06df\u06e8"

    invoke-static {v8}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v42, v4

    move/from16 v55, v8

    goto/16 :goto_0

    :cond_77
    const-string v4, "\u06e1\u06e7\u06df"

    goto/16 :goto_29

    :sswitch_90
    sget v4, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v8, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    or-int/lit16 v8, v8, -0x19c4

    div-int/2addr v4, v8

    if-eqz v4, :cond_78

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    const-string v4, "\u06e7\u06e2\u06e0"

    invoke-static {v4}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v43, v44

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_78
    const-string v4, "\u06e5\u06e5\u06df"

    move-object/from16 v8, v44

    goto/16 :goto_2b

    :sswitch_91
    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    move-result v4

    if-gtz v4, :cond_79

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    const-string v4, "\u06e6\u06e7\u06e4"

    invoke-static {v4}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_79
    sget v4, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v8, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    or-int/2addr v4, v8

    const v8, 0x1ab6ca

    add-int/2addr v4, v8

    move/from16 v55, v4

    goto/16 :goto_0

    :cond_7a
    move-object v7, v6

    goto/16 :goto_8

    :sswitch_92
    move-object v4, v6

    goto/16 :goto_7

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe2 -> :sswitch_0
        0xdbe4 -> :sswitch_34
        0xdc08 -> :sswitch_6
        0xdc3f -> :sswitch_77
        0xdc41 -> :sswitch_8
        0xdc46 -> :sswitch_6d
        0xdc5f -> :sswitch_5d
        0xdc63 -> :sswitch_12
        0xdc64 -> :sswitch_7d
        0xdc7f -> :sswitch_23
        0xdc9b -> :sswitch_78
        0xdc9c -> :sswitch_79
        0xdca3 -> :sswitch_54
        0xdcbd -> :sswitch_7f
        0xdcf8 -> :sswitch_7b
        0xdcfa -> :sswitch_42
        0x1aa708 -> :sswitch_22
        0x1aa71e -> :sswitch_81
        0x1aa727 -> :sswitch_d
        0x1aa743 -> :sswitch_1b
        0x1aa746 -> :sswitch_11
        0x1aa765 -> :sswitch_90
        0x1aa77e -> :sswitch_4b
        0x1aa783 -> :sswitch_47
        0x1aa79b -> :sswitch_2b
        0x1aa7b9 -> :sswitch_64
        0x1aa7ba -> :sswitch_5e
        0x1aa7d8 -> :sswitch_8b
        0x1aa7fd -> :sswitch_6a
        0x1aa81e -> :sswitch_45
        0x1aaac2 -> :sswitch_1a
        0x1aaac4 -> :sswitch_6c
        0x1aaac9 -> :sswitch_3c
        0x1aaae1 -> :sswitch_8c
        0x1aaae7 -> :sswitch_36
        0x1aaafe -> :sswitch_1f
        0x1aab02 -> :sswitch_29
        0x1aab06 -> :sswitch_4c
        0x1aab1e -> :sswitch_80
        0x1aab5f -> :sswitch_1
        0x1aab99 -> :sswitch_1c
        0x1aab9f -> :sswitch_6b
        0x1aaba0 -> :sswitch_69
        0x1aaba1 -> :sswitch_16
        0x1aabbb -> :sswitch_4
        0x1aabbd -> :sswitch_56
        0x1aaec3 -> :sswitch_3f
        0x1aaec5 -> :sswitch_6
        0x1aaec8 -> :sswitch_77
        0x1aaee1 -> :sswitch_27
        0x1aaefe -> :sswitch_50
        0x1aaf20 -> :sswitch_4f
        0x1aaf22 -> :sswitch_39
        0x1aaf3e -> :sswitch_25
        0x1aaf3f -> :sswitch_48
        0x1aaf63 -> :sswitch_51
        0x1aaf79 -> :sswitch_89
        0x1aaf7c -> :sswitch_2d
        0x1aaf81 -> :sswitch_2c
        0x1aaf9b -> :sswitch_f
        0x1aaf9f -> :sswitch_20
        0x1ab244 -> :sswitch_72
        0x1ab249 -> :sswitch_91
        0x1ab264 -> :sswitch_53
        0x1ab287 -> :sswitch_32
        0x1ab2a8 -> :sswitch_15
        0x1ab2c2 -> :sswitch_78
        0x1ab2c7 -> :sswitch_4f
        0x1ab2e6 -> :sswitch_7f
        0x1ab2fc -> :sswitch_38
        0x1ab2fd -> :sswitch_4d
        0x1ab31e -> :sswitch_65
        0x1ab33a -> :sswitch_3a
        0x1ab33b -> :sswitch_b
        0x1ab33f -> :sswitch_68
        0x1ab342 -> :sswitch_33
        0x1ab35f -> :sswitch_49
        0x1ab605 -> :sswitch_46
        0x1ab606 -> :sswitch_41
        0x1ab60c -> :sswitch_3b
        0x1ab629 -> :sswitch_9
        0x1ab642 -> :sswitch_3d
        0x1ab649 -> :sswitch_4e
        0x1ab662 -> :sswitch_8a
        0x1ab680 -> :sswitch_e
        0x1ab682 -> :sswitch_21
        0x1ab6a3 -> :sswitch_31
        0x1ab6c1 -> :sswitch_58
        0x1ab6de -> :sswitch_5
        0x1ab6e3 -> :sswitch_1e
        0x1ab6fc -> :sswitch_2f
        0x1ab6fd -> :sswitch_43
        0x1ab701 -> :sswitch_2c
        0x1ab71f -> :sswitch_8f
        0x1ab721 -> :sswitch_7a
        0x1ab9c8 -> :sswitch_66
        0x1ab9cc -> :sswitch_3
        0x1ab9e3 -> :sswitch_88
        0x1ab9e5 -> :sswitch_40
        0x1ab9eb -> :sswitch_2f
        0x1aba21 -> :sswitch_5b
        0x1aba42 -> :sswitch_6e
        0x1aba63 -> :sswitch_75
        0x1aba66 -> :sswitch_92
        0x1aba81 -> :sswitch_7c
        0x1abdcb -> :sswitch_14
        0x1abde5 -> :sswitch_91
        0x1abde8 -> :sswitch_5f
        0x1abe03 -> :sswitch_19
        0x1abe09 -> :sswitch_85
        0x1abe23 -> :sswitch_76
        0x1abe24 -> :sswitch_5a
        0x1abe25 -> :sswitch_59
        0x1abe3f -> :sswitch_82
        0x1abe43 -> :sswitch_8d
        0x1abe44 -> :sswitch_7e
        0x1abe7d -> :sswitch_24
        0x1abe7e -> :sswitch_44
        0x1abe84 -> :sswitch_59
        0x1ac14c -> :sswitch_2
        0x1ac166 -> :sswitch_a
        0x1ac185 -> :sswitch_63
        0x1ac18d -> :sswitch_30
        0x1ac1c6 -> :sswitch_18
        0x1ac1c8 -> :sswitch_3f
        0x1ac1ca -> :sswitch_6
        0x1ac222 -> :sswitch_83
        0x1ac265 -> :sswitch_55
        0x1ac50a -> :sswitch_73
        0x1ac50b -> :sswitch_71
        0x1ac52b -> :sswitch_26
        0x1ac52c -> :sswitch_67
        0x1ac52f -> :sswitch_3e
        0x1ac548 -> :sswitch_61
        0x1ac54c -> :sswitch_4a
        0x1ac564 -> :sswitch_35
        0x1ac565 -> :sswitch_52
        0x1ac568 -> :sswitch_84
        0x1ac56b -> :sswitch_13
        0x1ac56d -> :sswitch_66
        0x1ac58c -> :sswitch_60
        0x1ac5a5 -> :sswitch_70
        0x1ac5a6 -> :sswitch_74
        0x1ac5c6 -> :sswitch_15
        0x1ac5e4 -> :sswitch_c
        0x1ac5e9 -> :sswitch_28
        0x1ac605 -> :sswitch_2e
        0x1ac607 -> :sswitch_79
        0x1ac61e -> :sswitch_8e
        0x1ac620 -> :sswitch_6d
        0x1ac8c8 -> :sswitch_7
        0x1ac8e9 -> :sswitch_62
        0x1ac8ed -> :sswitch_17
        0x1ac90b -> :sswitch_10
        0x1ac92a -> :sswitch_5c
        0x1ac948 -> :sswitch_1d
        0x1ac965 -> :sswitch_2a
        0x1ac969 -> :sswitch_4d
        0x1ac96c -> :sswitch_6f
        0x1ac9a2 -> :sswitch_57
        0x1ac9df -> :sswitch_70
        0x1ac9e2 -> :sswitch_37
        0x1ac9e6 -> :sswitch_86
        0x1ac9e8 -> :sswitch_87
    .end sparse-switch
.end method

.method public static final g(Lg00;Li00;Li00;Ljava/util/ArrayList;)V
    .locals 24

    const/4 v7, 0x0

    const/16 v16, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/16 v18, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v11, 0x0

    const/4 v9, 0x0

    const/4 v8, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const-string v20, "\u06e3\u06df\u06e3"

    invoke-static/range {v20 .. v20}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v23

    move-object/from16 v20, v1

    move-object/from16 v21, v4

    move-object/from16 v22, v6

    :goto_0
    sparse-switch v23, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v1, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v4, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    add-int/lit16 v4, v4, -0x29d

    mul-int/2addr v1, v4

    if-ltz v1, :cond_1f

    invoke-static {}, Landroidx/core/content/ۣ۟ۧ۠;->۟۟۠ۢۨ()I

    const-string v1, "\u06e2\u06e8\u06e5"

    move-object v4, v1

    :goto_1
    invoke-static {v4}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto :goto_0

    :cond_1
    :sswitch_1
    sget v1, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    if-ltz v1, :cond_2

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    const-string v1, "\u06e1\u06e1\u06e8"

    invoke-static {v1}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto :goto_0

    :cond_2
    sget v1, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v4, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    rem-int/2addr v1, v4

    const v4, 0x1aca28

    add-int/2addr v1, v4

    move/from16 v23, v1

    goto :goto_0

    :sswitch_2
    sget v1, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v4, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    or-int/lit16 v4, v4, 0x1ea1

    div-int/2addr v1, v4

    if-gtz v1, :cond_3

    const/16 v1, 0x30

    sput v1, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    const-string v1, "\u06e7\u06e5\u06e8"

    :goto_2
    invoke-static {v1}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto :goto_0

    :cond_3
    const-string v1, "\u06e3\u06df\u06e3"

    goto :goto_2

    :sswitch_3
    sget v1, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v4, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    mul-int/lit16 v4, v4, -0x2522

    or-int/2addr v1, v4

    if-gtz v1, :cond_4

    const/16 v1, 0x21

    sput v1, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    const-string v1, "\u06e0\u06e3\u06e8"

    invoke-static {v1}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v1

    move-object/from16 v15, v16

    move/from16 v23, v1

    goto :goto_0

    :cond_4
    const-string v1, "\u06e1\u06e6\u06e8"

    invoke-static {v1}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v1

    move-object/from16 v15, v16

    move/from16 v23, v1

    goto :goto_0

    :sswitch_4
    move-object/from16 v0, p0

    iget v1, v0, Lg00;->a:I

    const/4 v4, 0x1

    if-ne v1, v4, :cond_27

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    sget v1, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v6, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    div-int/lit16 v6, v6, 0x78c

    xor-int/2addr v1, v6

    if-ltz v1, :cond_5

    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    const-string v1, "\u06e5\u06e1\u06e2"

    invoke-static {v1}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v1

    move-object/from16 v16, v4

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06e1\u06df\u06e8"

    :goto_3
    invoke-static {v1}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v1

    move-object/from16 v16, v4

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_5
    move-object v1, v2

    check-cast v1, Lov;

    iget v1, v1, Lov;->c:I

    if-nez v1, :cond_11

    move-object/from16 v0, v16

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget v1, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    div-int/lit16 v4, v4, 0x16d4

    xor-int/2addr v1, v4

    if-ltz v1, :cond_6

    const/16 v1, 0x5a

    sput v1, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    const-string v1, "\u06e8\u06df\u06e5"

    invoke-static {v1}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_6
    const-string v1, "\u06e2\u06e6\u06e3"

    invoke-static {v1}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_6
    sget v1, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v4, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    add-int/lit16 v4, v4, 0x711

    sub-int/2addr v1, v4

    if-ltz v1, :cond_7

    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    const-string v1, "\u06e4\u06e5\u06e6"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_7
    const-string v1, "\u06e2\u06e2\u06e2"

    :goto_4
    invoke-static {v1}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v1, v18

    move-object/from16 v13, v19

    :goto_5
    const-string v4, "\u06e4\u06e1\u06e8"

    invoke-static {v4}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v18, v1

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_8
    move-object v1, v3

    check-cast v1, Lov;

    iget-object v6, v1, Lov;->b:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-object v4, v0, Li00;->b:Ljava/lang/Object;

    check-cast v4, Ljava/lang/CharSequence;

    const/4 v11, 0x1

    invoke-static {v6, v4, v11}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_13

    sget v4, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v6, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    rem-int/lit16 v6, v6, 0x14bb

    add-int/2addr v4, v6

    if-ltz v4, :cond_8

    const/16 v4, 0x51

    sput v4, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    const-string v4, "\u06e3\u06e3\u06df"

    invoke-static {v4}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v4

    move-object v11, v1

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_8
    sget v4, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v6, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    mul-int/2addr v4, v6

    const v6, 0x159f58

    add-int/2addr v4, v6

    move-object v11, v1

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_9
    sget v1, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v4, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    add-int/lit16 v4, v4, 0x2586

    rem-int/2addr v1, v4

    if-ltz v1, :cond_9

    const/16 v1, 0x2a

    sput v1, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    const-string v1, "\u06e0\u06e3\u06e2"

    invoke-static {v1}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v1

    move-object v10, v15

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_9
    const-string v1, "\u06e2\u06e2\u06e5"

    move-object v4, v1

    move-object v10, v15

    :goto_6
    invoke-static {v4}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_a
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1d

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    sget v1, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    if-ltz v1, :cond_1a

    const-string v1, "\u06e8\u06e3\u06e1"

    invoke-static {v1}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_b
    sget v1, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v4, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    mul-int/lit16 v4, v4, 0x525

    add-int/2addr v1, v4

    if-ltz v1, :cond_a

    const-string v1, "\u06e6\u06e8\u06e8"

    invoke-static {v1}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v1

    move-object/from16 v9, v22

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_a
    sget v1, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v4, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sub-int/2addr v1, v4

    const v4, 0xdcb2

    xor-int/2addr v1, v4

    move-object/from16 v9, v22

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_c
    invoke-static/range {p3 .. p3}, Lab;->l0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v6

    sget v1, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v4, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    mul-int/lit16 v4, v4, -0x248

    xor-int/2addr v1, v4

    if-ltz v1, :cond_b

    const/16 v1, 0x63

    sput v1, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    const-string v1, "\u06e7\u06e2\u06e7"

    move-object v4, v6

    move-object v10, v6

    :goto_7
    invoke-static {v1}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v1

    move-object v7, v4

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_b
    sget v1, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v4, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    or-int/2addr v1, v4

    const v4, -0x1aca5b

    xor-int/2addr v1, v4

    move-object v7, v6

    move-object v10, v6

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_d
    move-object v1, v5

    check-cast v1, Lov;

    iget v1, v1, Lov;->c:I

    const/4 v4, 0x1

    if-ne v1, v4, :cond_1

    move-object/from16 v0, v18

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget v1, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v4, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    add-int/lit16 v4, v4, 0x11f9

    rem-int/2addr v1, v4

    if-gtz v1, :cond_c

    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    const-string v1, "\u06e4\u06e8\u06e4"

    invoke-static {v1}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_c
    sget v1, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v4, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    or-int/2addr v1, v4

    const v4, 0x1ac3e7    # 2.458E-39f

    add-int/2addr v1, v4

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_e
    iget-object v4, v11, Lov;->a:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-object v1, v0, Li00;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v6, 0x1

    invoke-static {v4, v1, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_2b

    invoke-static {}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->۟ۡۨۢ()I

    move-result v1

    if-gtz v1, :cond_21

    invoke-static {}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟ۢۡ۠ۦ()I

    const-string v1, "\u06e8\u06e2\u06e8"

    invoke-static {v1}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_f
    move-object/from16 v0, p2

    iget-object v1, v0, Li00;->b:Ljava/lang/Object;

    check-cast v1, Lnv;

    if-eqz v1, :cond_18

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۦۤۨۢ()I

    move-result v4

    if-gtz v4, :cond_d

    const/16 v4, 0x5a

    sput v4, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    const-string v4, "\u06df\u06e4"

    invoke-static {v4}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v4

    move-object v14, v1

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_d
    sget v4, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v6, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    xor-int/2addr v4, v6

    const v6, -0xdc9b

    xor-int/2addr v4, v6

    move-object v14, v1

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_10
    move-object/from16 v0, p0

    iget v1, v0, Lg00;->a:I

    const/4 v4, 0x2

    if-ne v1, v4, :cond_23

    sget v1, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v4, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sub-int/2addr v1, v4

    const v4, 0x1ac9f7

    add-int/2addr v1, v4

    move-object v13, v10

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_11
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    sget v4, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v6, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sub-int/2addr v4, v6

    const v6, 0x1ac16f

    add-int/2addr v4, v6

    move-object/from16 v20, v1

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_12
    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget v1, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v4, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    add-int/lit16 v4, v4, 0x1ccb

    sub-int/2addr v1, v4

    if-ltz v1, :cond_e

    const-string v1, "\u06e4\u06e0\u06e5"

    invoke-static {v1}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_e
    sget v1, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v4, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    div-int/2addr v1, v4

    const v4, 0x1aba82

    add-int/2addr v1, v4

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_f
    :sswitch_13
    sget v1, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v4, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    rem-int/lit16 v4, v4, 0x2c6

    mul-int/2addr v1, v4

    if-gtz v1, :cond_10

    const-string v1, "\u06e0\u06e1\u06e5"

    invoke-static {v1}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_10
    const-string v1, "\u06e0\u06e3\u06e2"

    invoke-static {v1}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_11
    :sswitch_14
    sget v1, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    mul-int/lit16 v4, v4, 0x26a

    or-int/2addr v1, v4

    if-gtz v1, :cond_12

    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    const-string v1, "\u06e8\u06e6\u06e6"

    invoke-static {v1}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_12
    sget v1, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    add-int/2addr v1, v4

    const v4, 0x1ac289

    add-int/2addr v1, v4

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_15
    move-object v1, v11

    :cond_13
    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    move-result v4

    if-gtz v4, :cond_14

    const/16 v4, 0x5f

    sput v4, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    const-string v6, "\u06e2\u06e4\u06e2"

    move-object v4, v12

    move-object v11, v1

    :goto_8
    invoke-static {v6}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v1

    move-object v12, v4

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_14
    sget v4, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v6, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    or-int/2addr v4, v6

    const v6, 0xdbfc

    add-int/2addr v4, v6

    move-object v11, v1

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_15
    move-object v8, v13

    :sswitch_16
    sget v1, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    mul-int/lit16 v4, v4, -0x8d4

    or-int/2addr v1, v4

    if-ltz v1, :cond_16

    const-string v4, "\u06e3\u06e1\u06e1"

    move-object v1, v14

    :goto_9
    invoke-static {v4}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v4

    move-object v14, v1

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_16
    const-string v4, "\u06e8\u06df\u06e5"

    move-object v1, v14

    goto :goto_9

    :sswitch_17
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    sget v4, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v6, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    div-int/lit16 v6, v6, -0x76c

    add-int/2addr v4, v6

    if-gtz v4, :cond_17

    const-string v4, "\u06e1\u06e2\u06df"

    invoke-static {v4}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v4

    move-object v12, v1

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_17
    const-string v6, "\u06e8\u06e2\u06e7"

    move-object v4, v1

    goto :goto_8

    :sswitch_18
    move-object v1, v14

    :cond_18
    sget v4, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    if-gtz v4, :cond_19

    const-string v4, "\u06e2\u06e7\u06df"

    move-object v14, v1

    goto/16 :goto_6

    :cond_19
    const-string v4, "\u06e0\u06e3\u06e8"

    goto :goto_9

    :sswitch_19
    sget v1, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    if-gtz v1, :cond_1b

    const/16 v1, 0x54

    sput v1, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    :cond_1a
    const-string v1, "\u06e7\u06e1\u06e2"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_1b
    const-string v1, "\u06e5\u06e1\u06e2"

    goto/16 :goto_2

    :sswitch_1a
    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۦۥ()I

    move-result v1

    if-gtz v1, :cond_1c

    const-string v1, "\u06e0\u06e3\u06e5"

    goto/16 :goto_4

    :cond_1c
    const-string v1, "\u06e7\u06e0\u06e5"

    invoke-static {v1}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_1d
    :sswitch_1b
    sget v1, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    div-int/lit16 v4, v4, -0x1168

    sub-int/2addr v1, v4

    if-gtz v1, :cond_1e

    const-string v1, "\u06e1\u06e3\u06e5"

    move-object/from16 v4, v16

    goto/16 :goto_3

    :cond_1e
    sget v1, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v4, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    div-int/2addr v1, v4

    const v4, 0x1abae0

    xor-int/2addr v1, v4

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_1c
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sget v4, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v6, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    or-int/2addr v4, v6

    const v6, 0x1aad4f

    add-int/2addr v4, v6

    move-object/from16 v22, v1

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_1f
    const-string v1, "\u06e3\u06e6\u06e6"

    invoke-static {v1}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_1d
    move-object/from16 v0, p2

    iget-object v1, v0, Li00;->b:Ljava/lang/Object;

    check-cast v1, Lnv;

    if-eqz v1, :cond_26

    sget v4, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v6, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    mul-int/2addr v4, v6

    const v6, 0x1c173e

    add-int/2addr v4, v6

    move-object/from16 v17, v1

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_1e
    iput-object v8, v14, Lnv;->b:Ljava/util/List;

    sget v1, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v4, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    add-int/lit16 v4, v4, 0x85d

    xor-int/2addr v1, v4

    if-ltz v1, :cond_20

    const/16 v1, 0x34

    sput v1, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    const-string v1, "\u06e2\u06e2\u06e5"

    invoke-static {v1}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_20
    sget v1, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v4, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    mul-int/2addr v1, v4

    const v4, 0x1a1e54

    add-int/2addr v1, v4

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_1f
    invoke-virtual/range {v17 .. v17}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۣۡۧۢ()I

    move-result v1

    if-gtz v1, :cond_22

    const/16 v1, 0x22

    sput v1, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    :cond_21
    const-string v1, "\u06df\u06e8"

    invoke-static {v1}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_22
    const-string v1, "\u06e2\u06e7\u06e0"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_20
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    sget v1, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v4, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    add-int/2addr v1, v4

    const v4, -0x1abda8

    xor-int/2addr v1, v4

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_21
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    const-string v1, "\u06e3\u06df\u06e6"

    :goto_a
    invoke-static {v1}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_23
    move-object v13, v10

    :sswitch_22
    sget v1, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v4, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sub-int/2addr v1, v4

    const v4, 0x1aba93

    add-int/2addr v1, v4

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_23
    sget v1, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v4, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    mul-int/lit16 v4, v4, 0x1f79

    xor-int/2addr v1, v4

    if-ltz v1, :cond_24

    const/16 v1, 0x51

    sput v1, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    const-string v1, "\u06e7\u06e0\u06e5"

    invoke-static {v1}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v1

    move-object v8, v9

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_24
    const-string v1, "\u06e8\u06df\u06e5"

    move-object v4, v7

    move-object v8, v9

    goto/16 :goto_7

    :sswitch_24
    move-object/from16 v0, p1

    iget-object v1, v0, Li00;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_15

    sget v1, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    if-gtz v1, :cond_25

    const/4 v1, 0x7

    sput v1, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    const-string v1, "\u06e6\u06e3\u06e7"

    invoke-static {v1}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v1

    move-object v8, v13

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_25
    sget v1, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v4, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    div-int/2addr v1, v4

    const v4, 0x1aba62

    xor-int/2addr v1, v4

    move-object v8, v13

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_25
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    sget v4, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v6, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    add-int/2addr v4, v6

    const v6, 0x1aca71

    xor-int/2addr v4, v6

    move-object/from16 v21, v1

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_26
    move-object/from16 v1, v17

    :cond_26
    sget v4, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v6, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    div-int/2addr v4, v6

    const v6, 0x1ab33b

    xor-int/2addr v4, v6

    move-object/from16 v17, v1

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_27
    :sswitch_27
    sget v1, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v4, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    xor-int/2addr v1, v4

    const v4, 0x1aafbc

    add-int/2addr v1, v4

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_28
    const-string v1, "n1ZPGmLJPw==\n"

    const-string v4, "oyUqbk/2AVM=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget v1, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    if-ltz v1, :cond_28

    const/16 v1, 0x51

    sput v1, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    const-string v1, "\u06e6\u06e3\u06e3"

    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_28
    sget v1, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sub-int/2addr v1, v4

    const v4, 0x1aaace

    xor-int/2addr v1, v4

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_29
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sget v4, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v6, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    rem-int/lit16 v6, v6, 0x7fc

    div-int/2addr v4, v6

    if-gtz v4, :cond_29

    const/16 v4, 0x2e

    sput v4, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    goto/16 :goto_5

    :cond_29
    const-string v4, "\u06e8\u06e3\u06e1"

    move-object/from16 v18, v1

    goto/16 :goto_1

    :sswitch_2a
    sget v1, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v4, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    add-int/lit16 v4, v4, -0x24f6

    div-int/2addr v1, v4

    if-eqz v1, :cond_2a

    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    const-string v1, "\u06e7\u06e0\u06df"

    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v1

    move-object/from16 v19, v18

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_2a
    sget v1, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v4, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    div-int/2addr v1, v4

    const v4, 0x1ab667

    add-int/2addr v1, v4

    move-object/from16 v19, v18

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_2b
    :sswitch_2b
    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    move-result v1

    if-ltz v1, :cond_2c

    const-string v1, "\u06e5\u06e8\u06e3"

    goto/16 :goto_a

    :cond_2c
    const-string v1, "\u06e8\u06e2\u06e7"

    move-object v4, v1

    goto/16 :goto_1

    :sswitch_2c
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe5 -> :sswitch_0
        0xdbe9 -> :sswitch_12
        0xdc42 -> :sswitch_28
        0xdcde -> :sswitch_23
        0xdcf8 -> :sswitch_26
        0x1aa7e1 -> :sswitch_22
        0x1aab3f -> :sswitch_b
        0x1aab42 -> :sswitch_17
        0x1aab45 -> :sswitch_1d
        0x1aab82 -> :sswitch_1e
        0x1aae8a -> :sswitch_11
        0x1aaede -> :sswitch_1b
        0x1aaf63 -> :sswitch_9
        0x1ab2a2 -> :sswitch_1
        0x1ab2a5 -> :sswitch_10
        0x1ab2fe -> :sswitch_16
        0x1ab2ff -> :sswitch_1
        0x1ab31f -> :sswitch_19
        0x1ab33b -> :sswitch_2c
        0x1ab607 -> :sswitch_c
        0x1ab60a -> :sswitch_8
        0x1ab668 -> :sswitch_7
        0x1ab67f -> :sswitch_13
        0x1ab6e3 -> :sswitch_3
        0x1ab9e9 -> :sswitch_2
        0x1aba0b -> :sswitch_24
        0x1aba62 -> :sswitch_1c
        0x1aba80 -> :sswitch_e
        0x1aba85 -> :sswitch_1a
        0x1abae0 -> :sswitch_2a
        0x1abda7 -> :sswitch_5
        0x1abdc6 -> :sswitch_14
        0x1abe9d -> :sswitch_15
        0x1ac1c2 -> :sswitch_1f
        0x1ac1c6 -> :sswitch_18
        0x1ac1ca -> :sswitch_6
        0x1ac266 -> :sswitch_27
        0x1ac526 -> :sswitch_14
        0x1ac52c -> :sswitch_2b
        0x1ac548 -> :sswitch_d
        0x1ac56c -> :sswitch_20
        0x1ac5ff -> :sswitch_2b
        0x1ac8ce -> :sswitch_f
        0x1ac92d -> :sswitch_21
        0x1ac92e -> :sswitch_29
        0x1ac946 -> :sswitch_25
        0x1ac96a -> :sswitch_4
        0x1ac983 -> :sswitch_a
    .end sparse-switch
.end method
