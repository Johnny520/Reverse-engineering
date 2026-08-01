.class public final synthetic Les;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Ljava/lang/ClassLoader;

.field public final b:Li00;

.field public final c:Li00;

.field public final d:Li00;

.field public final e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/ClassLoader;Li00;Li00;Li00;Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e2\u06e6"

    invoke-static {v0}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p1, p0, Les;->a:Ljava/lang/ClassLoader;

    sget v0, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    xor-int/lit16 v2, v2, 0x1e85

    rem-int/2addr v0, v2

    if-ltz v0, :cond_4

    const-string v0, "\u06e6\u06df\u06e6"

    invoke-static {v0}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    iput-object p5, p0, Les;->e:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    move-result v0

    if-ltz v0, :cond_0

    const/16 v0, 0x8

    sput v0, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    const-string v0, "\u06e7\u06e7\u06e5"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    div-int/2addr v0, v2

    const v2, 0x1abdc5

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :cond_1
    :sswitch_2
    sget v0, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    rem-int/lit16 v2, v2, -0x6b8

    add-int/2addr v0, v2

    if-ltz v0, :cond_2

    const-string v0, "\u06e2\u06e1\u06e4"

    invoke-static {v0}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v2, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sub-int/2addr v0, v2

    const v2, 0x1abff1

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    sget v0, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    or-int/lit16 v2, v2, -0x25c3

    add-int/2addr v0, v2

    if-ltz v0, :cond_3

    const-string v0, "\u06e2\u06e4\u06e6"

    :goto_1
    invoke-static {v0}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e2\u06e6"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    sget v0, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v2, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    or-int/2addr v0, v2

    const v2, 0x1ab8fc

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v2, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    xor-int/lit16 v2, v2, -0x1ffa

    rem-int/2addr v0, v2

    if-gtz v0, :cond_5

    const-string v0, "\u06e0\u06e3\u06e5"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_5
    sget v0, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v2, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    rem-int/2addr v0, v2

    const v2, 0x1abe9e

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_5
    const-string v0, "jR4vwxy2AYJP"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟۠ۡ۠ۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    move-result v1

    if-ltz v1, :cond_6

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    const-string v1, "\u06e6\u06e8\u06e1"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_6
    iput-object p2, p0, Les;->b:Li00;

    const-string v0, "\u06e7\u06e7\u06e5"

    goto :goto_1

    :sswitch_7
    iput-object p3, p0, Les;->c:Li00;

    sget v0, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v2, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    mul-int/lit16 v2, v2, 0x1bc9

    mul-int/2addr v0, v2

    if-gtz v0, :cond_7

    const/16 v0, 0x1c

    sput v0, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    move-object v0, v1

    :cond_6
    const-string v1, "\u06e2\u06e5\u06e0"

    move-object v2, v1

    :goto_2
    invoke-static {v2}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :cond_7
    const-string v0, "\u06e6\u06df\u06e6"

    goto :goto_1

    :sswitch_8
    iput-object p4, p0, Les;->d:Li00;

    invoke-static {}, Landroidx/core/content/ۣ۟ۧ۠;->۟۟۠ۢۨ()I

    move-result v0

    if-ltz v0, :cond_8

    invoke-static {}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟ۤۦۡ()I

    :cond_8
    const-string v0, "\u06df\u06df\u06e5"

    invoke-static {v0}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Landroid/app/۠ۨۥۨ;->ۣۣ۟ۨۧ()I

    move-result v0

    if-gtz v0, :cond_1

    const-string v2, "\u06e0\u06e3\u06e5"

    move-object v0, v1

    goto :goto_2

    :sswitch_a
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc44 -> :sswitch_0
        0x1aa705 -> :sswitch_1
        0x1aab42 -> :sswitch_5
        0x1ab2fd -> :sswitch_4
        0x1ab687 -> :sswitch_6
        0x1abdc6 -> :sswitch_9
        0x1abe28 -> :sswitch_a
        0x1ac14d -> :sswitch_8
        0x1ac222 -> :sswitch_2
        0x1ac25f -> :sswitch_3
        0x1ac605 -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 21

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v14, 0x0

    const/4 v12, 0x0

    const/16 v19, 0x0

    const/4 v1, 0x0

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v9, 0x0

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v7, 0x0

    const-string v16, "\u06e1\u06e8\u06e8"

    invoke-static/range {v16 .. v16}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v16, v1

    move-object/from16 v17, v4

    move-object/from16 v18, v12

    :goto_0
    sparse-switch v20, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "\u06e4\u06df\u06e0"

    move-object v4, v1

    move v11, v10

    :goto_1
    invoke-static {v4}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto :goto_0

    :sswitch_1
    sget v1, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v4, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    add-int/lit16 v4, v4, -0x2585

    or-int/2addr v1, v4

    if-ltz v1, :cond_0

    const-string v1, "\u06e3\u06e8\u06e0"

    invoke-static {v1}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto :goto_0

    :cond_0
    const-string v1, "\u06e1\u06e3\u06e0"

    invoke-static {v1}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto :goto_0

    :sswitch_2
    :try_start_0
    sget-object v1, Lpb0;->W0:Ljb;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual/range {v1 .. v6}, Ljb;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v4, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v8, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    or-int/lit16 v8, v8, 0x5fc

    or-int/2addr v4, v8

    if-gtz v4, :cond_14

    const-string v4, "\u06e4\u06df\u06e0"

    move-object v8, v1

    :goto_2
    invoke-static {v4}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto :goto_0

    :sswitch_3
    sget v1, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    if-gtz v1, :cond_1

    const-string v1, "\u06e5\u06e7\u06e2"

    move-object v4, v9

    :goto_3
    invoke-static {v1}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    move-object v9, v4

    move/from16 v20, v1

    goto :goto_0

    :cond_1
    sget v1, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v4, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    add-int/2addr v1, v4

    const v4, -0x1aac3f

    xor-int/2addr v1, v4

    move/from16 v20, v1

    goto :goto_0

    :sswitch_4
    move-object/from16 v0, p0

    iget-object v1, v0, Les;->d:Li00;

    iget-object v1, v1, Li00;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v5, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    mul-int/lit16 v5, v5, 0x18fe

    add-int/2addr v4, v5

    if-ltz v4, :cond_2

    invoke-static {}, Landroidx/versionedparcelable/ۣۢۥ;->ۦۦۡۤ()I

    const-string v4, "\u06e0\u06e8\u06e6"

    :goto_4
    invoke-static {v4}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move-object v5, v1

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_2
    const-string v4, "\u06e7\u06e2\u06e1"

    goto :goto_4

    :sswitch_5
    move v11, v10

    :cond_3
    const-string v1, "\u06e0\u06e5\u06df"

    :goto_5
    invoke-static {v1}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto/16 :goto_0

    :sswitch_6
    sget v1, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v4, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    add-int/2addr v1, v4

    const v4, 0x1aaa87

    add-int/2addr v1, v4

    move/from16 v20, v1

    goto/16 :goto_0

    :sswitch_7
    sget-object v1, Lhs;->a:Lhs;

    move-object/from16 v0, p0

    iget-object v1, v0, Les;->b:Li00;

    iget-object v1, v1, Li00;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    add-int/lit16 v4, v4, -0x11bd

    div-int/2addr v2, v4

    if-eqz v2, :cond_4

    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    move v4, v11

    :goto_6
    const-string v2, "\u06e4\u06df\u06e5"

    move-object v12, v2

    move v11, v4

    :goto_7
    invoke-static {v12}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v4

    move-object v2, v1

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_4
    sget v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    add-int/2addr v2, v4

    const v4, 0x1abd29

    add-int/2addr v4, v2

    move-object v2, v1

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_8
    :try_start_1
    invoke-static {v13, v7}, Lhs;->e(Ljava/lang/ClassLoader;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget v1, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    if-gez v1, :cond_3

    const-string v4, "\u06e1\u06e3\u06e0"

    move-object v1, v2

    move-object v12, v4

    goto :goto_7

    :sswitch_9
    :try_start_2
    new-instance v1, Li00;

    const-string v4, "gjAAnVvVw+fHHwPCCw==\n"

    const-string v12, "70Nn6SKlpto=\n"

    invoke-static {v4, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Li00;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    sget v4, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    if-ltz v4, :cond_5

    const/16 v4, 0x38

    sput v4, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    const-string v4, "\u06e1\u06e3\u06e0"

    invoke-static {v4}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v18, v1

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_5
    sget v4, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v12, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    mul-int/2addr v4, v12

    const v12, 0x143228

    add-int/2addr v4, v12

    move-object/from16 v18, v1

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_a
    const-string v1, "\u06e7\u06e2\u06e1"

    move-object v4, v9

    goto/16 :goto_3

    :sswitch_b
    const/4 v10, 0x1

    const-string v1, "\u06e4\u06e6"

    move-object v4, v9

    goto/16 :goto_3

    :sswitch_c
    if-eqz v17, :cond_e

    :try_start_3
    invoke-static/range {v17 .. v17}, Lb50;->R(Ljava/lang/String;)Ljava/lang/Integer;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v4

    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    if-gtz v1, :cond_6

    const-string v1, "\u06e4\u06e6\u06e0"

    invoke-static {v1}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v1

    move-object v9, v4

    move/from16 v20, v1

    goto/16 :goto_0

    :cond_6
    const-string v1, "\u06e1\u06e1\u06e1"

    goto/16 :goto_3

    :sswitch_d
    :try_start_4
    sget-object v1, Lpb0;->m:Ljava/lang/String;

    invoke-static {v1, v13}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result-object v1

    sget v4, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v12, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    add-int/lit16 v12, v12, -0xc44

    div-int/2addr v4, v12

    if-eqz v4, :cond_c

    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    const-string v4, "\u06e6\u06e8\u06e8"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v4

    move-object v14, v1

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_e
    if-nez v14, :cond_9

    sget v1, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    div-int/lit16 v4, v4, 0x1335

    mul-int/2addr v1, v4

    if-eqz v1, :cond_7

    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    const-string v1, "\u06e7\u06e2\u06e1"

    invoke-static {v1}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto/16 :goto_0

    :cond_7
    const-string v1, "\u06e0\u06e8\u06e2"

    invoke-static {v1}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto/16 :goto_0

    :sswitch_f
    :try_start_5
    array-length v1, v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-nez v1, :cond_11

    sget v1, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v4, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    add-int/lit16 v4, v4, -0x2613

    div-int/2addr v1, v4

    if-eqz v1, :cond_8

    invoke-static {}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۦ۟ۥۣ()I

    move-object v1, v13

    :goto_8
    const-string v4, "\u06e8\u06e1\u06df"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v4

    move-object v13, v1

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_8
    sget v1, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v4, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    rem-int/2addr v1, v4

    const v4, 0xdc8d

    add-int/2addr v1, v4

    move/from16 v20, v1

    goto/16 :goto_0

    :cond_9
    :sswitch_10
    sget v1, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    if-ltz v1, :cond_a

    const/16 v1, 0x61

    sput v1, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    const-string v1, "\u06e8\u06e8\u06e4"

    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto/16 :goto_0

    :cond_a
    sget v1, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v4, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    add-int/2addr v1, v4

    const v4, -0x1ac501

    xor-int/2addr v1, v4

    move/from16 v20, v1

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    move-result v1

    if-gtz v1, :cond_b

    const/16 v1, 0x5f

    sput v1, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    const-string v1, "\u06e4\u06e6\u06e8"

    invoke-static {v1}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto/16 :goto_0

    :cond_b
    sget v1, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v4, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    rem-int/2addr v1, v4

    const v4, -0xdc9d

    xor-int/2addr v1, v4

    move/from16 v20, v1

    goto/16 :goto_0

    :sswitch_12
    move-object/from16 v0, p0

    iget-object v1, v0, Les;->a:Ljava/lang/ClassLoader;

    move-object/from16 v0, p0

    iget-object v6, v0, Les;->e:Ljava/lang/String;

    goto :goto_8

    :sswitch_13
    :try_start_6
    array-length v1, v8

    invoke-static {v8, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v14, v1}, Lde/robv/android/xposed/XposedHelpers;->newInstance(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-result-object v7

    const-string v1, "\u06e6\u06e0\u06df"

    move-object v4, v1

    goto/16 :goto_2

    :sswitch_14
    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    move-result v1

    if-ltz v1, :cond_d

    move-object v1, v14

    move v11, v10

    :cond_c
    const-string v4, "\u06e7\u06e1\u06e3"

    invoke-static {v4}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v4

    move-object v14, v1

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_d
    move-object v1, v2

    move v4, v10

    goto/16 :goto_6

    :cond_e
    :sswitch_15
    sget v1, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v4, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    xor-int/lit16 v4, v4, 0x1df0

    xor-int/2addr v1, v4

    if-ltz v1, :cond_f

    const-string v1, "\u06df\u06e3\u06e6"

    invoke-static {v1}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto/16 :goto_0

    :cond_f
    sget v1, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v4, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    add-int/2addr v1, v4

    const v4, 0x1aabe7

    xor-int/2addr v1, v4

    move/from16 v20, v1

    goto/16 :goto_0

    :sswitch_16
    :try_start_7
    const-string v1, "zLNQKW7cFgzZr3luN5dKZg==\n"

    const-string v4, "uNwcRhm5ZE8=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v0, v19

    invoke-static {v1, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static/range {v18 .. v19}, Li00;->a(Li00;Ljava/lang/String;)Ld4;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    move-result-object v1

    sget v4, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v12, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    xor-int/2addr v4, v12

    const v12, 0x1abf50

    add-int/2addr v4, v12

    move-object/from16 v16, v1

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_17
    :try_start_8
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    move-result-object v1

    sget v4, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v12, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    div-int/2addr v4, v12

    const v12, 0x1aaeff

    add-int/2addr v4, v12

    move-object/from16 v19, v1

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_18
    if-eqz v16, :cond_e

    :try_start_9
    invoke-virtual/range {v16 .. v16}, Ld4;->t()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lft;

    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Lft;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    move-result v4

    if-ltz v4, :cond_10

    const-string v4, "\u06e6\u06e5\u06e8"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v17, v1

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_10
    sget v4, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v12, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    rem-int/2addr v4, v12

    const v12, 0x1aabdf

    xor-int/2addr v4, v12

    move-object/from16 v17, v1

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_19
    :try_start_a
    invoke-static {v7}, Lip;->l(Ljava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    sget v1, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v4, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    mul-int/2addr v1, v4

    const v4, 0x15c29b

    add-int/2addr v1, v4

    move/from16 v20, v1

    goto/16 :goto_0

    :cond_11
    :sswitch_1a
    sget v1, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v4, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    rem-int/lit16 v4, v4, -0x1c9f

    div-int/2addr v1, v4

    if-ltz v1, :cond_12

    const-string v1, "\u06e5\u06e0\u06e7"

    invoke-static {v1}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto/16 :goto_0

    :cond_12
    sget v1, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v4, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    xor-int/2addr v1, v4

    const v4, 0x1abe30

    add-int/2addr v1, v4

    move/from16 v20, v1

    goto/16 :goto_0

    :sswitch_1b
    if-eqz v9, :cond_e

    :try_start_b
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    move-result v15

    sget v1, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v4, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    add-int/lit16 v4, v4, 0x6bb

    or-int/2addr v1, v4

    if-ltz v1, :cond_13

    const/16 v1, 0x40

    sput v1, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    const-string v1, "\u06e6\u06e2\u06e8"

    invoke-static {v1}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto/16 :goto_0

    :cond_13
    const-string v1, "\u06e7\u06e7\u06e4"

    invoke-static {v1}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto/16 :goto_0

    :sswitch_1c
    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    move-result v1

    if-ltz v1, :cond_15

    move-object v1, v8

    move v11, v15

    :cond_14
    const-string v4, "\u06e1\u06e8\u06e3"

    move-object v8, v1

    goto/16 :goto_1

    :cond_15
    sget v1, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v4, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    add-int/2addr v1, v4

    const v4, -0x1aae8e

    xor-int/2addr v1, v4

    move/from16 v20, v1

    move v11, v15

    goto/16 :goto_0

    :catchall_0
    move-exception v1

    const-string v1, "\u06e3\u06e5\u06e7"

    goto/16 :goto_5

    :sswitch_1d
    move-object/from16 v0, p0

    iget-object v1, v0, Les;->c:Li00;

    iget-object v1, v1, Li00;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    sget v3, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v4, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    add-int/lit16 v4, v4, 0x1e65

    mul-int/2addr v3, v4

    if-gtz v3, :cond_16

    const/16 v3, 0x3c

    sput v3, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    const-string v3, "\u06e8\u06e0"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v1

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_16
    sget v3, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v4, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    rem-int/2addr v3, v4

    const v4, 0x1abda1

    add-int/2addr v4, v3

    move-object v3, v1

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_1e
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc82 -> :sswitch_0
        0xdc9c -> :sswitch_1
        0xdcf8 -> :sswitch_11
        0x1aa727 -> :sswitch_3
        0x1aa7a3 -> :sswitch_1
        0x1aab5c -> :sswitch_2
        0x1aab7a -> :sswitch_c
        0x1aabc0 -> :sswitch_5
        0x1aabda -> :sswitch_6
        0x1aabde -> :sswitch_8
        0x1aaec1 -> :sswitch_14
        0x1aaefe -> :sswitch_1e
        0x1aaeff -> :sswitch_16
        0x1aaf9c -> :sswitch_f
        0x1aafa1 -> :sswitch_12
        0x1ab6c5 -> :sswitch_1
        0x1ab9c5 -> :sswitch_18
        0x1ab9ca -> :sswitch_1b
        0x1aba9d -> :sswitch_15
        0x1aba9e -> :sswitch_1d
        0x1abaa6 -> :sswitch_1
        0x1abadd -> :sswitch_13
        0x1abe28 -> :sswitch_4
        0x1ac165 -> :sswitch_19
        0x1ac184 -> :sswitch_b
        0x1ac1ac -> :sswitch_10
        0x1ac209 -> :sswitch_a
        0x1ac266 -> :sswitch_17
        0x1ac549 -> :sswitch_e
        0x1ac566 -> :sswitch_d
        0x1ac585 -> :sswitch_9
        0x1ac5e3 -> :sswitch_1a
        0x1ac604 -> :sswitch_1c
        0x1ac906 -> :sswitch_7
    .end sparse-switch
.end method
