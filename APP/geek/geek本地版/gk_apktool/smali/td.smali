.class public final Ltd;
.super Lde/robv/android/xposed/XC_MethodHook;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 3

    iput p1, p0, Ltd;->a:I

    iput-object p2, p0, Ltd;->b:Ljava/lang/Object;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e2\u06e6\u06e2"

    invoke-static {v1}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    const-string v0, "6qyQB7nwOdBCO"

    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۢ۠ۡ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget v1, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    if-ltz v1, :cond_0

    const-string v1, "\u06e4\u06df\u06df"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_0
    sget v1, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v2, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    mul-int/2addr v1, v2

    const v2, 0x1a3a70

    add-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :cond_1
    :sswitch_2
    sget v0, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v2, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    add-int/lit16 v2, v2, 0x243c

    or-int/2addr v0, v2

    if-ltz v0, :cond_2

    const-string v0, "\u06e6\u06e0\u06e5"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    sget v0, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    rem-int/2addr v0, v2

    const v2, 0x1aa71c

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    move-result v0

    if-gtz v0, :cond_1

    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v2, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    xor-int/lit16 v2, v2, 0x796

    xor-int/2addr v0, v2

    if-ltz v0, :cond_3

    const-string v0, "\u06e2\u06e6\u06e2"

    invoke-static {v0}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    sget v0, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sub-int/2addr v0, v2

    const v2, 0x1ab90d

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    sget v0, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v2, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    or-int/lit16 v2, v2, 0xa09

    add-int/2addr v0, v2

    if-gtz v0, :cond_4

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    const-string v0, "\u06e1\u06e1"

    invoke-static {v0}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    sget v0, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v2, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sub-int/2addr v0, v2

    const v2, 0x1ab6e0

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_5
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    if-gtz v0, :cond_5

    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    const-string v0, "\u06df\u06e2\u06e7"

    :goto_1
    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06df\u06e2\u06e7"

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa764 -> :sswitch_0
        0x1ab31e -> :sswitch_3
        0x1ab685 -> :sswitch_4
        0x1ab9c4 -> :sswitch_1
        0x1abe40 -> :sswitch_5
        0x1ac606 -> :sswitch_2
    .end sparse-switch
.end method

.method private final a(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 29

    const/4 v6, 0x0

    const/16 v17, 0x0

    const/4 v5, 0x0

    const/16 v19, 0x0

    const/4 v10, 0x0

    const/4 v8, 0x0

    const/16 v27, 0x0

    const/4 v7, 0x0

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/16 v26, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x0

    const/16 v21, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v20, 0x0

    const/16 v18, 0x0

    const-string v22, "\u06e7\u06e8\u06e4"

    invoke-static/range {v22 .. v22}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v28

    move-object/from16 v22, v3

    move-object/from16 v23, v14

    move-object/from16 v24, v15

    move-object/from16 v25, v18

    :goto_0
    sparse-switch v28, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    move-object v3, v11

    :goto_1
    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    move-result v11

    if-gtz v11, :cond_5

    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    const-string v11, "\u06df\u06e2\u06e1"

    invoke-static {v11}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v14

    move-object v11, v3

    move/from16 v28, v14

    goto :goto_0

    :sswitch_1
    move-object v3, v4

    check-cast v3, Ljava/lang/String;

    sget v14, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v15, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    rem-int/lit16 v15, v15, -0x1e34

    rem-int/2addr v14, v15

    if-gtz v14, :cond_0

    const-string v14, "\u06e1\u06e1\u06e1"

    invoke-static {v14}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v26, v3

    move/from16 v28, v14

    goto :goto_0

    :cond_0
    sget v14, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v15, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    div-int/2addr v14, v15

    const v15, 0x1abda4

    add-int/2addr v14, v15

    move-object/from16 v26, v3

    move/from16 v28, v14

    goto :goto_0

    :sswitch_2
    new-instance v3, Lqd;

    invoke-direct {v3}, Lqd;-><init>()V

    move-object/from16 v0, v16

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget v3, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v14, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    xor-int/2addr v3, v14

    const v14, 0x1ac853

    xor-int/2addr v3, v14

    move/from16 v28, v3

    goto :goto_0

    :sswitch_3
    move-object/from16 v0, p1

    iget-object v15, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const-string v3, "BJFC524xBA==\n"

    const-string v14, "Y/Q2rhpUaQ8=\n"

    invoke-static {v3, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v14, 0x1

    new-array v14, v14, [Ljava/lang/Object;

    sget v18, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    if-ltz v18, :cond_1

    const/16 v18, 0x38

    sput v18, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    const-string v18, "\u06e8\u06e6\u06e2"

    invoke-static/range {v18 .. v18}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v18

    move-object/from16 v22, v3

    move-object/from16 v23, v14

    move-object/from16 v24, v15

    move/from16 v28, v18

    goto :goto_0

    :cond_1
    sget v18, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v22, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sub-int v18, v18, v22

    const v22, 0x1ab800

    xor-int v18, v18, v22

    move-object/from16 v22, v3

    move-object/from16 v23, v14

    move-object/from16 v24, v15

    move/from16 v28, v18

    goto/16 :goto_0

    :sswitch_4
    sget v3, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v11, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    or-int/2addr v3, v11

    const v11, 0x1aaf09

    add-int/2addr v3, v11

    move-object/from16 v11, v26

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_5
    const-string v3, "njEXpPf4SN+dCw==\n"

    const-string v14, "+VRyz6ieJ7M=\n"

    invoke-static {v3, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v14, 0x0

    invoke-static {v11, v3, v14}, Lb50;->N(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-static {v7}, Lvd;->a(Landroid/view/View;)Landroid/widget/ImageView;

    move-result-object v3

    if-eqz v3, :cond_11

    sget v14, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v15, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    add-int/lit16 v15, v15, 0x291

    add-int/2addr v14, v15

    if-gtz v14, :cond_2

    const/16 v14, 0x2e

    sput v14, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    const-string v14, "\u06e0\u06e5\u06e1"

    invoke-static {v14}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v16, v3

    move/from16 v28, v14

    goto/16 :goto_0

    :cond_2
    const-string v14, "\u06e8\u06e5\u06e5"

    invoke-static {v14}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v16, v3

    move/from16 v28, v14

    goto/16 :goto_0

    :sswitch_6
    move-object v3, v9

    :cond_3
    sget v9, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    if-ltz v9, :cond_4

    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    const-string v9, "\u06e0\u06e0\u06e5"

    invoke-static {v9}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v14

    move-object v9, v3

    move/from16 v28, v14

    goto/16 :goto_0

    :cond_4
    const-string v15, "\u06e3\u06e3\u06e4"

    move-object v9, v3

    move-object/from16 v14, v17

    move-object/from16 v18, v8

    :goto_2
    invoke-static {v15}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v17, v14

    move-object/from16 v8, v18

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_5
    sget v11, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v14, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    div-int/2addr v11, v14

    const v14, 0x1aaff1

    xor-int/2addr v14, v11

    move-object v11, v3

    move/from16 v28, v14

    goto/16 :goto_0

    :catchall_0
    move-exception v3

    new-instance v3, Lqd;

    invoke-direct {v3}, Lqd;-><init>()V

    move-object/from16 v0, v16

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    move-result v3

    if-gtz v3, :cond_9

    const-string v3, "Pzxerqa7iwR4yPomtG"

    invoke-static {v3}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۣۣۣۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v3

    sget-object v14, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v14, v3}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v3, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    if-gtz v3, :cond_6

    const/16 v3, 0x28

    sput v3, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    const-string v3, "\u06e6\u06e2\u06e3"

    invoke-static {v3}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_6
    sget v3, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v14, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    or-int/2addr v3, v14

    const v14, -0x1aab00

    xor-int/2addr v3, v14

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_7
    sget v3, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v13, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v14, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    or-int/lit16 v14, v14, -0x1a0b

    or-int/2addr v13, v14

    if-ltz v13, :cond_c

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    const-string v13, "\u06e0\u06e1\u06e3"

    move-object v14, v13

    move v15, v3

    :goto_3
    invoke-static {v14}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v3

    move v13, v15

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_8
    sget v3, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v14, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    add-int/lit16 v14, v14, -0x248d

    sub-int/2addr v3, v14

    if-gtz v3, :cond_7

    const/16 v3, 0x50

    sput v3, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    const-string v3, "\u06e8\u06e3\u06df"

    :goto_4
    invoke-static {v3}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_7
    sget v3, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v14, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    add-int/2addr v3, v14

    const v14, 0x1abb04

    add-int/2addr v3, v14

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_9
    const/4 v3, 0x0

    sget v14, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v15, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    mul-int/2addr v14, v15

    const v15, 0x1a8697

    add-int/2addr v14, v15

    move-object/from16 v27, v3

    move/from16 v28, v14

    goto/16 :goto_0

    :sswitch_a
    const/4 v10, 0x0

    if-eqz v19, :cond_13

    move-object v3, v5

    check-cast v3, Landroid/view/View;

    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    move-result v8

    if-ltz v8, :cond_8

    const/16 v8, 0x4a

    sput v8, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    const-string v8, "\u06e5\u06df\u06e7"

    invoke-static {v8}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v14

    move-object v8, v3

    move/from16 v28, v14

    goto/16 :goto_0

    :cond_8
    const-string v8, "\u06e6\u06e2\u06e3"

    move-object/from16 v14, v17

    move-object v15, v8

    move-object/from16 v18, v3

    goto/16 :goto_2

    :cond_9
    :sswitch_b
    const-string v3, "\u06e2\u06e8\u06e0"

    invoke-static {v3}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_a
    :sswitch_c
    const-string v3, "\u06e5\u06df\u06e7"

    move-object/from16 v14, v17

    move-object v15, v3

    move-object/from16 v18, v8

    goto/16 :goto_2

    :sswitch_d
    move-object v3, v12

    :cond_b
    sget v12, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v14, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    add-int/2addr v12, v14

    const v14, -0x1ac438

    xor-int/2addr v14, v12

    move-object v12, v3

    move/from16 v28, v14

    goto/16 :goto_0

    :sswitch_e
    sget v3, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    if-ltz v3, :cond_d

    const/16 v3, 0x10

    sput v3, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    move v3, v13

    :cond_c
    const-string v13, "\u06e4\u06e2\u06e6"

    move-object v14, v13

    move v15, v3

    :goto_5
    invoke-static {v14}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v3

    move v13, v15

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u06e0\u06e5\u06e1"

    move-object v14, v3

    move v15, v13

    goto :goto_5

    :sswitch_f
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    move-result v3

    if-gtz v3, :cond_e

    invoke-static {}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۦ۟ۥۣ()I

    const-string v3, "\u06e0\u06e0\u06e1"

    :goto_6
    invoke-static {v3}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_e
    const-string v3, "\u06e6\u06e1\u06e0"

    goto :goto_6

    :sswitch_10
    const-string v3, "lDKJwMOr/wWXKYLNypE=\n"

    const-string v4, "8lvsrKf0inY=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v9, v3}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    instance-of v3, v4, Ljava/lang/String;

    if-eqz v3, :cond_20

    sget v3, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    if-gtz v3, :cond_f

    const/16 v3, 0x5b

    sput v3, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    const-string v3, "\u06e0\u06e1\u06e4"

    invoke-static {v3}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v3

    move-object v11, v10

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_f
    const-string v3, "\u06e1\u06e4\u06e8"

    move-object v11, v10

    goto/16 :goto_4

    :sswitch_11
    const-string v3, "qroLAEI=\n"

    const-string v6, "2tt5YS/PgfI=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p1

    invoke-static {v3, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, p1

    iget-object v3, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v6, 0x0

    aget-object v6, v3, v6

    const-string v3, "ZHiP2Dhpc5pkYpeUem8yl2t+l5RsZTKaZWPO2m1mftR+dJPROGF9gGZkjZpRZGY=\n"

    const-string v14, "Cg3jtBgKEvQ=\n"

    invoke-static {v3, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v6}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "\u06e6\u06e6\u06e6"

    goto/16 :goto_4

    :sswitch_12
    sget v3, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v7, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    rem-int/2addr v3, v7

    const v7, 0x1aa905

    add-int/2addr v3, v7

    move-object/from16 v7, v27

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_13
    :try_start_0
    move-object/from16 v0, v16

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v3, "\u06e6\u06e1\u06e0"

    move-object v14, v3

    :goto_7
    invoke-static {v14}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_10
    :sswitch_14
    move-object/from16 v3, v16

    :cond_11
    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    move-result v14

    if-ltz v14, :cond_12

    const-string v14, "\u06e4\u06e2\u06e5"

    move-object/from16 v16, v3

    goto :goto_7

    :cond_12
    sget v14, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v15, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    add-int/2addr v14, v15

    const v15, 0x1ac7a3

    add-int/2addr v14, v15

    move-object/from16 v16, v3

    move/from16 v28, v14

    goto/16 :goto_0

    :cond_13
    :sswitch_15
    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    move-result v3

    if-gtz v3, :cond_14

    const-string v3, "\u06e0\u06e2\u06e1"

    move-object/from16 v14, v17

    move-object v15, v3

    move-object/from16 v18, v8

    goto/16 :goto_2

    :cond_14
    const-string v3, "\u06e4\u06e2\u06e1"

    move-object/from16 v14, v17

    move-object v15, v3

    move-object/from16 v18, v8

    goto/16 :goto_2

    :sswitch_16
    sget v3, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    xor-int/lit16 v3, v3, -0x26c

    aput-object v17, v23, v3

    move-object/from16 v0, v24

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-static {v0, v1, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_3

    move-object/from16 v14, v20

    :goto_8
    const-string v9, "\u06e2\u06df\u06e8"

    invoke-static {v9}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v15

    move-object v9, v3

    move-object/from16 v20, v14

    move/from16 v28, v15

    goto/16 :goto_0

    :sswitch_17
    sget v3, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v14, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    rem-int/lit16 v14, v14, -0x24ff

    rem-int/2addr v3, v14

    if-gtz v3, :cond_15

    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    const-string v3, "\u06e7\u06e8\u06e1"

    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_15
    const-string v3, "\u06df\u06e6\u06e0"

    move-object/from16 v14, v17

    move-object v15, v3

    move-object/from16 v18, v8

    goto/16 :goto_2

    :sswitch_18
    sget v3, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v14, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    or-int/2addr v3, v14

    const v14, -0x1ab2c5

    xor-int/2addr v3, v14

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_19
    if-nez v7, :cond_19

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    move-result v3

    if-gtz v3, :cond_16

    const/16 v3, 0x51

    sput v3, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    const-string v3, "\u06e7\u06e4\u06df"

    invoke-static {v3}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_16
    sget v3, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v14, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    mul-int/2addr v3, v14

    const v14, 0x19eaf8

    xor-int/2addr v3, v14

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_1a
    xor-int/lit8 v3, v13, 0x1

    :try_start_1
    invoke-static {v12, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v14

    sget v3, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v15, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    or-int/lit16 v15, v15, -0xbaa

    or-int/2addr v3, v15

    if-ltz v3, :cond_17

    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    move-object v3, v9

    goto :goto_8

    :cond_17
    sget v3, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v15, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    xor-int/2addr v3, v15

    const v15, 0xdc5e

    add-int/2addr v3, v15

    move-object/from16 v20, v14

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_1b
    const/4 v3, 0x0

    :try_start_2
    move-object/from16 v0, v20

    array-length v14, v0

    move-object/from16 v0, v20

    invoke-static {v0, v3, v14}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v15

    new-instance v14, Lsd;

    move-object/from16 v0, p0

    iget-object v3, v0, Ltd;->b:Ljava/lang/Object;

    check-cast v3, Landroid/content/Context;

    invoke-direct {v14, v15, v3}, Lsd;-><init>(Landroid/graphics/Bitmap;Landroid/content/Context;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    sget v3, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v15, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    rem-int/lit16 v15, v15, -0x2403

    div-int/2addr v3, v15

    if-eqz v3, :cond_18

    const-string v3, "\u06e6\u06e3\u06e8"

    invoke-static {v3}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v25, v14

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_18
    sget v3, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v15, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    div-int/2addr v3, v15

    const v15, 0x1aab03

    xor-int/2addr v3, v15

    move-object/from16 v25, v14

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_19
    :sswitch_1c
    sget v3, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v14, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    div-int/lit16 v14, v14, 0x189

    xor-int/2addr v3, v14

    if-ltz v3, :cond_1a

    const-string v3, "\u06e4\u06e0\u06e7"

    :goto_9
    invoke-static {v3}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_1a
    sget v3, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v14, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sub-int/2addr v3, v14

    const v14, 0x1ab09f

    add-int/2addr v3, v14

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_1d
    move-object v3, v6

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual/range {p1 .. p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object v5

    instance-of v0, v5, Landroid/view/View;

    move/from16 v17, v0

    const-string v15, "\u06e2\u06e6\u06e3"

    move-object v14, v3

    move-object/from16 v18, v8

    move/from16 v19, v17

    goto/16 :goto_2

    :sswitch_1e
    const-string v3, ""

    move-object/from16 v0, v21

    invoke-static {v0, v3}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v12

    if-lez v12, :cond_b

    sget v12, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    if-ltz v12, :cond_1b

    const/16 v12, 0x1b

    sput v12, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    const-string v12, "\u06e7\u06e8\u06e4"

    move-object/from16 v14, v21

    move-object v15, v12

    :goto_a
    invoke-static {v15}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v15

    move-object v12, v3

    move-object/from16 v21, v14

    move/from16 v28, v15

    goto/16 :goto_0

    :cond_1b
    sget v12, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v14, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    or-int/2addr v12, v14

    const v14, -0x1aab15

    xor-int/2addr v14, v12

    move-object v12, v3

    move/from16 v28, v14

    goto/16 :goto_0

    :sswitch_1f
    sget-object v3, Lgn;->a:Lgn;

    const-string v14, "geek_avatar_"

    invoke-virtual {v14, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v3, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v15, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    add-int/lit16 v15, v15, -0x2398

    add-int/2addr v3, v15

    if-ltz v3, :cond_1c

    const-string v3, "\u06e2\u06e8\u06e0"

    invoke-static {v3}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v21, v14

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_1c
    const-string v15, "\u06e6\u06e3\u06e8"

    move-object v3, v12

    goto :goto_a

    :sswitch_20
    sget v3, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v14, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    add-int/2addr v3, v14

    const v14, 0x1ac640

    add-int/2addr v3, v14

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_21
    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    move-result v3

    if-gtz v3, :cond_1d

    const-string v3, "\u06e7\u06e8"

    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_1d
    const-string v3, "\u06e8\u06e5\u06df"

    goto/16 :goto_6

    :sswitch_22
    const-string v3, "\u06e3\u06e1\u06df"

    move-object v7, v8

    goto/16 :goto_9

    :sswitch_23
    if-nez v11, :cond_a

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۦۤۨۢ()I

    move-result v3

    if-gtz v3, :cond_1e

    const/16 v3, 0x3d

    sput v3, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    :cond_1e
    const-string v3, "\u06e5\u06e7\u06e5"

    invoke-static {v3}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :sswitch_24
    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    move-result v3

    if-ltz v3, :cond_1f

    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    const-string v3, "\u06e5\u06e5\u06e4"

    invoke-static {v3}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_0

    :cond_1f
    const-string v3, "\u06e7\u06e3\u06e5"

    move-object v14, v3

    move v15, v13

    goto/16 :goto_3

    :sswitch_25
    return-void

    :cond_20
    move-object v3, v10

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        0xdc07 -> :sswitch_0
        0xdc44 -> :sswitch_f
        0xdce1 -> :sswitch_8
        0xdcf8 -> :sswitch_1b
        0x1aa723 -> :sswitch_d
        0x1aa7d9 -> :sswitch_19
        0x1aaadf -> :sswitch_b
        0x1aab02 -> :sswitch_7
        0x1aab03 -> :sswitch_13
        0x1aab7c -> :sswitch_14
        0x1aab81 -> :sswitch_20
        0x1aabe0 -> :sswitch_15
        0x1aaec1 -> :sswitch_17
        0x1aaedf -> :sswitch_c
        0x1aaee2 -> :sswitch_1c
        0x1aaee6 -> :sswitch_23
        0x1aaf25 -> :sswitch_1
        0x1ab247 -> :sswitch_17
        0x1ab24b -> :sswitch_e
        0x1ab263 -> :sswitch_3
        0x1ab31f -> :sswitch_a
        0x1ab35a -> :sswitch_25
        0x1ab641 -> :sswitch_18
        0x1ab684 -> :sswitch_10
        0x1ab69f -> :sswitch_6
        0x1aba23 -> :sswitch_9
        0x1aba28 -> :sswitch_1a
        0x1aba62 -> :sswitch_16
        0x1abd8d -> :sswitch_5
        0x1abda4 -> :sswitch_4
        0x1abe44 -> :sswitch_21
        0x1abe83 -> :sswitch_24
        0x1ac185 -> :sswitch_25
        0x1ac1a7 -> :sswitch_22
        0x1ac1cb -> :sswitch_1e
        0x1ac226 -> :sswitch_1d
        0x1ac589 -> :sswitch_14
        0x1ac5a2 -> :sswitch_2
        0x1ac5e5 -> :sswitch_12
        0x1ac623 -> :sswitch_11
        0x1ac982 -> :sswitch_14
        0x1ac988 -> :sswitch_1f
        0x1ac9a2 -> :sswitch_25
        0x1ac9a4 -> :sswitch_14
    .end sparse-switch
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 28

    move-object/from16 v0, p0

    iget v4, v0, Ltd;->a:I

    packed-switch v4, :pswitch_data_0

    const-string v8, ""

    const-string v4, "CxI4a/E=\n"

    const-string v5, "e3NKCpym6Fo=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p1

    invoke-static {v4, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, p1

    iget-object v4, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const-string v5, "JqfzMVNjqH0mvet9EWXpcCmh630Hb+l9J7yyMwZspTM8q+84U2Gndzq99jldYbljZpPvLR9pqnI8\nu/Az\n"

    const-string v6, "SNKfXXMAyRM=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v4, Landroid/app/Application;

    sget-object v6, Lgn;->a:Lgn;

    move-object/from16 v0, p0

    iget-object v5, v0, Ltd;->b:Ljava/lang/Object;

    check-cast v5, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    iget-object v7, v5, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->processName:Ljava/lang/String;

    const-string v9, "jItRYcqfxCKdlFs=\n"

    const-string v10, "/Pk+Aq/st2w=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v7}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "TVKs84BDLw==\n"

    const-string v9, "Lj3Ch+U7W5A=\n"

    invoke-static {v6, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v6, "Vo9bP/A=\n"

    const-string v9, "JsE6UpXmut0=\n"

    invoke-static {v6, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sput-object v4, Lgn;->b:Landroid/app/Application;

    sput-object v7, Lgn;->d:Ljava/lang/String;

    const-string v6, "y+Uub83qJ9HN5Ddv1OI=\n"

    const-string v9, "qIpDQbmPSbI=\n"

    invoke-static {v6, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    :try_start_0
    invoke-virtual {v4}, Landroid/content/Context;->getExternalMediaDirs()[Ljava/io/File;

    move-result-object v6

    const-string v7, "73aaCyXPuY3mcoIDON+1nsx6nD11lfLRoQ==\n"

    const-string v9, "iBPuTl273P8=\n"

    invoke-static {v7, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v6}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v7, v6

    if-nez v7, :cond_8

    const/4 v6, 0x0

    :goto_0
    if-nez v6, :cond_0

    new-instance v6, Ljava/io/File;

    const-string v7, "l8PDkDnr6JiX1dqKJ+v7mNyfh9AK5OuP19nT0Cbv65TZn9SQJqT7mNbT0pE/pOKQ\n"

    const-string v9, "uLC3/0uKj/0=\n"

    invoke-static {v7, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    :cond_0
    new-instance v7, Ljava/io/File;

    const-string v9, "EfDxroOdV69X5qeuso0=\n"

    const-string v10, "P4OI3dz+Nsw=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v7, v6, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {v7}, Ljava/io/File;->mkdirs()Z

    :cond_1
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_9

    new-instance v6, Lio/fastkv/FastKV$Builder;

    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    const-string v9, "vEOXKW/dVeCgcpIfZtFZzaxMhx5n\n"

    const-string v10, "zy3kdgK0NpI=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v6, v7, v9}, Lio/fastkv/FastKV$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6}, Lio/fastkv/FastKV$Builder;->build()Lio/fastkv/FastKV;

    move-result-object v6

    sput-object v6, Lgn;->c:Lio/fastkv/FastKV;

    :goto_1
    new-instance v9, Ljava/io/File;

    invoke-virtual {v4}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v6

    const-string v7, "ywyQmQ==\n"

    const-string v10, "s2D//sM2ekc=\n"

    invoke-static {v7, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v9, v6, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v6, Ljava/io/File;

    const-string v7, "javBzvzREtWQqcrM0e8PwIG1x8rQngnT\n"

    const-string v10, "9ceuqaOwYqU=\n"

    invoke-static {v7, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v9, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->exists()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result v6

    if-eqz v6, :cond_3

    :try_start_1
    new-instance v6, Lio/fastkv/FastKV$Builder;

    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    const-string v10, "2P+cjeAmXlPF/ZePzRhDRtThmonM\n"

    const-string v11, "oJPz6r9HLiM=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-direct {v6, v7, v10}, Lio/fastkv/FastKV$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6}, Lio/fastkv/FastKV$Builder;->build()Lio/fastkv/FastKV;

    move-result-object v6

    invoke-virtual {v6}, Lio/fastkv/FastKV;->getAll()Ljava/util/Map;

    move-result-object v6

    const-string v7, "TT7amP87dLEEdYc=\n"

    const-string v10, "Kluu2ZNXXJ8=\n"

    invoke-static {v7, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v6}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_2
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    instance-of v11, v6, Ljava/lang/Boolean;

    if-eqz v11, :cond_b

    sget-object v11, Lgn;->c:Lio/fastkv/FastKV;

    if-eqz v11, :cond_2

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    invoke-virtual {v11, v7, v6}, Lio/fastkv/FastKV;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v6

    :try_start_2
    const-string v6, "sWcBq5eZkJmfZTuDuJOfkb9sEKWmmJ+T\n"

    const-string v7, "9gJkwNT2/v8=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "Nwje\n"

    const-string v9, "Q2m5jaPP2Zc=\n"

    invoke-static {v7, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v6}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v6, "Fg==\n"

    const-string v7, "c8HJlSTQVfc=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :cond_3
    :goto_3
    const-string v6, "UmnOaREQNqxFadldPgo2pkY=\n"

    const-string v7, "NQyrAk54U8A=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v4, v6, v7}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v9

    sget-object v6, Lgn;->c:Lio/fastkv/FastKV;

    if-eqz v6, :cond_5

    const-string v7, "9UENyQxwGNjoVzb7EXg11PlWO8U6ZB7c/V4mzA==\n"

    const-string v10, "nDJSpGUXark=\n"

    invoke-static {v7, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v10, 0x0

    invoke-virtual {v6, v7, v10}, Lio/fastkv/FastKV;->getBoolean(Ljava/lang/String;Z)Z

    move-result v6

    if-nez v6, :cond_5

    invoke-interface {v9}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v6

    const-string v7, "gS71Rr1oodjIZag=\n"

    const-string v10, "5kuBB9EEifY=\n"

    invoke-static {v7, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v6}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_4
    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_14

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    instance-of v11, v6, Ljava/lang/Boolean;

    if-eqz v11, :cond_12

    sget-object v11, Lgn;->c:Lio/fastkv/FastKV;

    if-eqz v11, :cond_4

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    invoke-virtual {v11, v7, v6}, Lio/fastkv/FastKV;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v6

    const-string v6, "Nwje\n"

    const-string v7, "Q2m5jaPP2Zc=\n"

    const-string v9, "ieDf593G+aih6NjM1eLHkqc=\n"

    const-string v10, "z4Gsk5aQpuE=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "Fg==\n"

    const-string v11, "c8HJlSTQVfc=\n"

    invoke-static {v6, v7, v9, v10, v11}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :try_start_3
    new-instance v6, Ljava/io/File;

    invoke-virtual {v4}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v7

    const-string v9, "UeqJQd0Hbslf4o1e5y1k3FrjjkvhGQ==\n"

    const-string v10, "No/sKoJyAr0=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v6, v7, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    new-instance v7, Lio/fastkv/FastKV$Builder;

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    const-string v9, "ZPVLSZMTxpJ4xE5/mh/Kv3T6W36b\n"

    const-string v10, "F5s4Fv56peA=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v7, v6, v9}, Lio/fastkv/FastKV$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7}, Lio/fastkv/FastKV$Builder;->build()Lio/fastkv/FastKV;

    move-result-object v6

    sput-object v6, Lgn;->c:Lio/fastkv/FastKV;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :cond_5
    :goto_5
    new-instance v6, Len;

    invoke-direct {v6}, Len;-><init>()V

    invoke-virtual {v4, v6}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object v5, v5, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->processName:Ljava/lang/String;

    const-string v6, "TT/W37jf5VlLPs/fodc=\n"

    const-string v7, "LlC78cy6izo=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_21

    :try_start_4
    invoke-static {v4}, Lt6;->a(Landroid/app/Application;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :goto_6
    sget-object v5, Lgn;->a:Lgn;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "6n8cphFpgQ==\n"

    const-string v6, "iRBy0nQR9TU=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    new-instance v5, Landroid/content/IntentFilter;

    sget-object v6, Lgn;->k:Ljava/lang/String;

    invoke-direct {v5, v6}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    new-instance v6, Lcom/ljx/wechatmod/core/GeekConfig$registerUpdateReceiver$receiver$1;

    invoke-direct {v6}, Lcom/ljx/wechatmod/core/GeekConfig$registerUpdateReceiver$receiver$1;-><init>()V

    :try_start_5
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0x21

    if-lt v7, v9, :cond_16

    const/4 v7, 0x2

    invoke-virtual {v4, v6, v5, v7}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :goto_7
    :try_start_6
    const-string v5, "vy50HVCUd4+rJHpbXYpizrg=\n"

    const-string v6, "3EEZMzz+D6E=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v6, v5, v7}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v5

    iget-wide v10, v5, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    sget-object v5, Lgn;->a:Lgn;

    const-string v6, "t4jfcO73KvuDhMhc9vc144OZz0Ln\n"

    const-string v7, "3O2mL4KWWY8=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "VA==\n"

    const-string v9, "ZKkUf89frcI=\n"

    invoke-static {v7, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v7}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lb50;->S(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v5

    if-eqz v5, :cond_17

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    :goto_8
    cmp-long v5, v10, v6

    if-eqz v5, :cond_6

    const-string v5, "tX4+VrqjnPeObz1SvA==\n"

    const-string v6, "4A5aN87G0ZY=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "dNSOkeJsGC8ikabWsnpqQh3m6ePIAlMuetSLn/ZrGR8omLL7sltHQhrB5/DaAEAJdO2ZkthQGR8o\nVy0QMoKW\n"

    const-string v7, "kncOd1fn/ac=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "xwGO\n"

    const-string v9, "s2Dpd1+FjZU=\n"

    invoke-static {v7, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v5}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v5, "53vj\n"

    const-string v7, "igiEy7e+YPk=\n"

    invoke-static {v5, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v6}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v5, "/gB7hhBIiErwEV28DVmZQcoGbb0G\n"

    const-string v6, "lWUC2WMt6zg=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "pUJh+p4=\n"

    const-string v7, "hiUEn/UuRFE=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lgn;->h(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "Z+oKz0rHfThT5h3jUsdiIFP7Gv1D\n"

    const-string v6, "DI9zkCamDkw=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lgn;->h(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    :try_start_7
    const-string v5, "vg8/CcsdMrZk/b/Vn1wU3hHJ342ROXbWXI/VwcsvBLZ23bPloFIu/R3S4EIO0vY2kg==\n"

    const-string v6, "+WpaYi21k1M=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    invoke-static {v4, v5, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v5

    invoke-virtual {v5}, Landroid/widget/Toast;->show()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_9

    :cond_6
    :goto_9
    sget-object v5, Lpb0;->a:Ljava/lang/String;

    const-string v5, "SBzXPuGSbg==\n"

    const-string v6, "K3O5SoTqGqg=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :try_start_8
    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    const-string v6, "Wj+i4gIJld9cPrviGwE=\n"

    const-string v7, "OVDPzHZs+7w=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v5, v6, v7}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v5

    if-eqz v5, :cond_27

    iget-object v5, v5, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    if-nez v5, :cond_7

    move-object v5, v8

    :cond_7
    :goto_a
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_19

    const-string v5, "sFee6wxnfw==\n"

    const-string v6, "xTn1hWMQEaQ=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :goto_b
    const-string v6, "qEDepl+Y\n"

    const-string v7, "kG7uiGip7zk=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v5, v6, v7}, Lb50;->N(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_1a

    sget-object v5, Li90;->a:Ldd0;

    :goto_c
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, v5, Ldd0;->G1:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->b:Ljava/lang/String;

    sput-object v7, Lpb0;->a:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->c:Ljava/lang/String;

    sput-object v7, Lpb0;->b:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->d:Ljava/lang/String;

    sput-object v7, Lpb0;->c:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->e:Ljava/lang/String;

    sput-object v7, Lpb0;->d:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->f:Ljava/lang/String;

    sput-object v7, Lpb0;->e:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->g:Ljava/lang/String;

    sput-object v7, Lpb0;->f:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->h:Ljava/lang/String;

    sput-object v7, Lpb0;->g:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->i:Ljava/lang/String;

    sput-object v7, Lpb0;->h:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->j:Ljava/lang/String;

    sput-object v7, Lpb0;->i:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->k:Ljava/lang/String;

    sput-object v7, Lpb0;->j:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->l:Ljava/lang/String;

    sput-object v7, Lpb0;->k:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->m:Ljava/lang/String;

    sput-object v7, Lpb0;->l:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->n:Ljava/lang/String;

    sput-object v7, Lpb0;->m:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->o:Ljava/lang/String;

    sput-object v7, Lpb0;->n:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->p:Ljava/lang/String;

    sput-object v7, Lpb0;->o:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->q:Ljava/lang/String;

    sput-object v7, Lpb0;->p:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->r:Ljava/lang/String;

    sput-object v7, Lpb0;->q:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->s:Ljava/lang/String;

    sput-object v7, Lpb0;->r:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->t:Ljava/lang/String;

    sput-object v7, Lpb0;->s:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->u:Ljava/lang/String;

    sput-object v7, Lpb0;->t:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->v:Ljava/lang/String;

    sput-object v7, Lpb0;->u:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->w:Ljava/lang/String;

    sput-object v7, Lpb0;->v:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->x:Ljava/lang/String;

    sput-object v7, Lpb0;->w:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->y:Ljava/lang/String;

    sput-object v7, Lpb0;->x:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->z:Ljava/lang/String;

    sput-object v7, Lpb0;->y:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->A:Ljava/lang/String;

    sput-object v7, Lpb0;->z:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->B:Ljava/lang/String;

    sput-object v7, Lpb0;->A:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->C:Ljava/lang/String;

    sput-object v7, Lpb0;->B:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->D:Ljava/lang/String;

    sput-object v7, Lpb0;->C:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->F:Ljava/lang/String;

    sput-object v7, Lpb0;->D:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->G:Ljava/lang/String;

    sput-object v7, Lpb0;->E:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->H:Ljava/lang/String;

    sput-object v7, Lpb0;->F:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->J:Ljava/lang/String;

    sput-object v7, Lpb0;->G:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->K:Ljava/lang/String;

    sput-object v7, Lpb0;->H:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->L:Ljava/lang/String;

    sput-object v7, Lpb0;->I:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->M:Ljava/lang/String;

    sput-object v7, Lpb0;->J:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->N:Ljava/lang/String;

    sput-object v7, Lpb0;->K:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->O:Ljava/lang/String;

    sput-object v7, Lpb0;->L:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->P:Ljava/lang/String;

    sput-object v7, Lpb0;->M:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->Q:Ljava/lang/String;

    sput-object v7, Lpb0;->N:Ljava/lang/String;

    iget v7, v5, Ldd0;->R:I

    sput v7, Lpb0;->O:I

    iget v7, v5, Ldd0;->S:I

    sput v7, Lpb0;->P:I

    iget v7, v5, Ldd0;->U:I

    sput v7, Lpb0;->Q:I

    iget v7, v5, Ldd0;->V:I

    sput v7, Lpb0;->R:I

    iget-object v7, v5, Ldd0;->W:Ljava/lang/String;

    sput-object v7, Lpb0;->S:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->X:Ljava/lang/String;

    sput-object v7, Lpb0;->T:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->Y:Ljava/lang/String;

    sput-object v7, Lpb0;->U:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->Z:Ljava/lang/String;

    sput-object v7, Lpb0;->V:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->a0:Ljava/lang/String;

    sput-object v7, Lpb0;->W:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->b0:Ljava/lang/String;

    sput-object v7, Lpb0;->X:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->c0:Ljava/lang/String;

    sput-object v7, Lpb0;->Y:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->x0:Ljava/lang/String;

    sput-object v7, Lpb0;->Z:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->y0:Ljava/lang/String;

    sput-object v7, Lpb0;->a0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->z0:Ljava/lang/String;

    sput-object v7, Lpb0;->b0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->A0:Ljava/lang/String;

    sput-object v7, Lpb0;->c0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->B0:Ljava/lang/String;

    sput-object v7, Lpb0;->d0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->C0:Ljava/lang/String;

    sput-object v7, Lpb0;->e0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->D0:Ljava/lang/String;

    sput-object v7, Lpb0;->f0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->E0:Ljava/lang/String;

    sput-object v7, Lpb0;->g0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->F0:Ljb;

    sput-object v7, Lpb0;->h0:Ljb;

    iget-object v7, v5, Ldd0;->G0:Ljava/lang/String;

    sput-object v7, Lpb0;->i0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->H0:Ljava/lang/String;

    sput-object v7, Lpb0;->j0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->I0:Ljava/lang/String;

    sput-object v7, Lpb0;->k0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->K0:Ljava/lang/String;

    sput-object v7, Lpb0;->l0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->M0:Ljava/lang/String;

    sput-object v7, Lpb0;->m0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->N0:Ljava/lang/String;

    sput-object v7, Lpb0;->n0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->O0:Ljava/lang/String;

    sput-object v7, Lpb0;->o0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->P0:Ljava/lang/String;

    sput-object v7, Lpb0;->p0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->Q0:Ljava/lang/String;

    sput-object v7, Lpb0;->q0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->R0:Ljava/lang/String;

    sput-object v7, Lpb0;->r0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->S0:Ljava/lang/String;

    sput-object v7, Lpb0;->s0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->T0:Ljava/lang/String;

    sput-object v7, Lpb0;->t0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->U0:Ljava/lang/String;

    sput-object v7, Lpb0;->u0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->W0:Ljava/lang/String;

    sput-object v7, Lpb0;->v0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->X0:Ljava/lang/String;

    sput-object v7, Lpb0;->w0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->Y0:Ljava/lang/String;

    sput-object v7, Lpb0;->x0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->Z0:Ljava/lang/String;

    sput-object v7, Lpb0;->y0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->b1:Ljava/lang/String;

    sput-object v7, Lpb0;->z0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->c1:Ljava/lang/String;

    sput-object v7, Lpb0;->A0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->d1:Ljava/lang/String;

    sput-object v7, Lpb0;->B0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->g1:Ljava/lang/String;

    sput-object v7, Lpb0;->C0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->h1:Ljava/lang/String;

    sput-object v7, Lpb0;->D0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->i1:Ljava/lang/String;

    sput-object v7, Lpb0;->E0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->r1:Ljava/util/List;

    sput-object v7, Lpb0;->F0:Ljava/util/List;

    iget-object v7, v5, Ldd0;->s1:Ljava/util/List;

    sput-object v7, Lpb0;->G0:Ljava/util/List;

    iget-object v7, v5, Ldd0;->t1:Ljava/util/List;

    sput-object v7, Lpb0;->H0:Ljava/util/List;

    iget-object v7, v5, Ldd0;->u1:Ljava/util/List;

    sput-object v7, Lpb0;->I0:Ljava/util/List;

    iget-object v7, v5, Ldd0;->d0:Ljava/lang/String;

    sput-object v7, Lpb0;->J0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->j0:Ljava/lang/String;

    sput-object v7, Lpb0;->K0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->k0:Ljava/lang/String;

    sput-object v7, Lpb0;->L0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->l0:Ljava/lang/String;

    sput-object v7, Lpb0;->M0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->n0:Ljava/lang/String;

    sput-object v7, Lpb0;->N0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->h0:Ljava/lang/String;

    sput-object v7, Lpb0;->O0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->i0:Ljava/lang/String;

    sput-object v7, Lpb0;->P0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->o0:Ljava/lang/String;

    sput-object v7, Lpb0;->Q0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->p0:Ljava/lang/String;

    sput-object v7, Lpb0;->R0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->q0:Ljava/lang/String;

    sput-object v7, Lpb0;->S0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->r0:Ljava/lang/String;

    sput-object v7, Lpb0;->T0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->s0:Ljava/lang/String;

    sput-object v7, Lpb0;->U0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->t0:Ljava/lang/String;

    sput-object v7, Lpb0;->V0:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->u0:Ljb;

    sput-object v7, Lpb0;->W0:Ljb;

    iget-object v7, v5, Ldd0;->v0:Ljb;

    sput-object v7, Lpb0;->X0:Ljb;

    iget-object v7, v5, Ldd0;->w0:Ljb;

    sput-object v7, Lpb0;->Y0:Ljb;

    iget-object v7, v5, Ldd0;->x1:Lsm;

    sput-object v7, Lpb0;->Z0:Lsm;

    iget-object v7, v5, Ldd0;->y1:Ljava/lang/String;

    sput-object v7, Lpb0;->a1:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->z1:Ljava/lang/String;

    sput-object v7, Lpb0;->b1:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->A1:Ljava/lang/String;

    sput-object v7, Lpb0;->c1:Ljava/lang/String;

    iget-object v7, v5, Ldd0;->B1:Ljava/lang/String;

    sput-object v7, Lpb0;->d1:Ljava/lang/String;

    sput-object v6, Lpb0;->e1:Ljava/lang/String;

    sget-object v7, Lc9;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v6, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v6

    const-string v7, "T69kX+lXgBcA5D4zuQ==\n"

    const-string v8, "KMoQHZAj5WQ=\n"

    invoke-static {v7, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v6}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v6, v5, Ldd0;->H1:Ljava/lang/String;

    sput-object v6, Lpb0;->f1:Ljava/lang/String;

    iget-object v6, v5, Ldd0;->I1:Ljava/lang/String;

    sput-object v6, Lpb0;->g1:Ljava/lang/String;

    iget-object v6, v5, Ldd0;->J1:Ljava/lang/String;

    sput-object v6, Lpb0;->h1:Ljava/lang/String;

    iget-object v6, v5, Ldd0;->K1:Ljava/lang/String;

    sput-object v6, Lpb0;->i1:Ljava/lang/String;

    iget-object v6, v5, Ldd0;->L1:Ljava/lang/String;

    sput-object v6, Lpb0;->j1:Ljava/lang/String;

    iget-object v6, v5, Ldd0;->M1:Ljava/lang/String;

    sput-object v6, Lpb0;->k1:Ljava/lang/String;

    iget-object v6, v5, Ldd0;->O1:Ljava/lang/String;

    sput-object v6, Lpb0;->l1:Ljava/lang/String;

    iget-object v6, v5, Ldd0;->P1:Ljava/lang/String;

    sput-object v6, Lpb0;->m1:Ljava/lang/String;

    iget-object v6, v5, Ldd0;->Q1:Ljava/lang/String;

    sput-object v6, Lpb0;->n1:Ljava/lang/String;

    iget-object v6, v5, Ldd0;->R1:Ljava/lang/String;

    sput-object v6, Lpb0;->o1:Ljava/lang/String;

    iget-object v6, v5, Ldd0;->S1:Ljava/lang/String;

    sput-object v6, Lpb0;->p1:Ljava/lang/String;

    iget-object v6, v5, Ldd0;->T1:Ljava/lang/String;

    sput-object v6, Lpb0;->q1:Ljava/lang/String;

    iget-object v6, v5, Ldd0;->U1:Ljava/lang/String;

    sput-object v6, Lpb0;->r1:Ljava/lang/String;

    iget-object v6, v5, Ldd0;->V1:Ljava/lang/String;

    sput-object v6, Lpb0;->s1:Ljava/lang/String;

    iget-object v6, v5, Ldd0;->b2:Ljava/lang/String;

    sput-object v6, Lpb0;->t1:Ljava/lang/String;

    iget-object v6, v5, Ldd0;->d2:Ljava/lang/String;

    sput-object v6, Lpb0;->u1:Ljava/lang/String;

    iget-object v6, v5, Ldd0;->e2:Ljava/lang/String;

    sput-object v6, Lpb0;->v1:Ljava/lang/String;

    iget-object v6, v5, Ldd0;->f2:Ljava/lang/String;

    sput-object v6, Lpb0;->w1:Ljava/lang/String;

    iget-object v6, v5, Ldd0;->g2:Ljava/lang/String;

    sput-object v6, Lpb0;->x1:Ljava/lang/String;

    iget-object v6, v5, Ldd0;->h2:Lsm;

    sput-object v6, Lpb0;->y1:Lsm;

    iget-object v6, v5, Ldd0;->j2:Ljava/lang/String;

    sput-object v6, Lpb0;->z1:Ljava/lang/String;

    iget-object v6, v5, Ldd0;->k2:Ljava/lang/String;

    sput-object v6, Lpb0;->A1:Ljava/lang/String;

    iget-object v6, v5, Ldd0;->l2:Ljava/lang/String;

    sput-object v6, Lpb0;->B1:Ljava/lang/String;

    iget-object v5, v5, Ldd0;->o2:Ljava/lang/String;

    sput-object v5, Lpb0;->C1:Ljava/lang/String;

    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v7

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Lkx;

    const-string v5, "wNqtk+AD4GPhz7yuzxPtbdfytq7mHw==\n"

    const-string v9, "rr/ZwINmjgY=\n"

    invoke-static {v5, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v9, Lpb0;->n:Ljava/lang/String;

    invoke-direct {v6, v5, v9}, Lkx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v9, Lkx;

    const-string v5, "5xz4rAGHtdfbHO+aC5S+/vwa54YvjbXX8A==\n"

    const-string v10, "iXmM/2Li27I=\n"

    invoke-static {v5, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v10, Lpb0;->m:Ljava/lang/String;

    invoke-direct {v9, v5, v10}, Lkx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v10, Lkx;

    const-string v5, "wFT0m/eKQDftXu6u/Z1DBtxQ7rvyilwRwlDzuw==\n"

    const-string v11, "rjGAyJTvLlI=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v11, Lpb0;->l:Ljava/lang/String;

    invoke-direct {v10, v5, v11}, Lkx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v11, Lkx;

    const-string v5, "0WwqR9waJC4=\n"

    const-string v12, "vB9NBLB7V10=\n"

    invoke-static {v5, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v12, Lpb0;->o:Ljava/lang/String;

    invoke-direct {v11, v5, v12}, Lkx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v12, Lkx;

    const-string v5, "zMapRm3Xk6/DwrxlavO8od7F\n"

    const-string v13, "rbbZCx6w0MA=\n"

    invoke-static {v5, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v13, Lpb0;->e0:Ljava/lang/String;

    invoke-direct {v12, v5, v13}, Lkx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, Lkx;

    const-string v5, "DCihe2XEnr8LBb5VdN0=\n"

    const-string v14, "f0bSNAeu+9w=\n"

    invoke-static {v5, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v14, Lpb0;->j1:Ljava/lang/String;

    invoke-direct {v13, v5, v14}, Lkx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, Lkx;

    const-string v5, "XX90HFgPNi5mdHMcdxIbJ0hlag==\n"

    const-string v15, "KRYZeRRmWEs=\n"

    invoke-static {v5, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v15, Lpb0;->a1:Ljava/lang/String;

    invoke-direct {v14, v5, v15}, Lkx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v15, Lkx;

    const-string v5, "8TL4vOvVL/vwJemI6MY3yw==\n"

    const-string v16, "n1eMy4SnRLg=\n"

    move-object/from16 v0, v16

    invoke-static {v5, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v16, Lpb0;->b:Ljava/lang/String;

    move-object/from16 v0, v16

    invoke-direct {v15, v5, v0}, Lkx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v16, Lkx;

    const-string v5, "PUeNaEfcrJM3UYw=\n"

    const-string v17, "ViL/BiKw7/8=\n"

    move-object/from16 v0, v17

    invoke-static {v5, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v17, Lpb0;->p:Ljava/lang/String;

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    invoke-direct {v0, v5, v1}, Lkx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v17, Lkx;

    const-string v5, "1FGAKSthbrDLXaomL15y\n"

    const-string v18, "oj7pSk4tAdc=\n"

    move-object/from16 v0, v18

    invoke-static {v5, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v18, Lpb0;->c:Ljava/lang/String;

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-direct {v0, v5, v1}, Lkx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v18, Lkx;

    const-string v5, "hKpNUTigyYGxoF90JA==\n"

    const-string v19, "8sw+B1fJquQ=\n"

    move-object/from16 v0, v19

    invoke-static {v5, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v19, Lpb0;->T:Ljava/lang/String;

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-direct {v0, v5, v1}, Lkx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v19, Lkx;

    const-string v5, "mlElsR/q4iWJVSm+NdXmJIw=\n"

    const-string v20, "/zxK23a5h1c=\n"

    move-object/from16 v0, v20

    invoke-static {v5, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v20, Lpb0;->g:Ljava/lang/String;

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-direct {v0, v5, v1}, Lkx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v20, Lkx;

    const-string v5, "RYmtH2xjbzRDkL4Rc2VQKA==\n"

    const-string v21, "JPndUh8EI1s=\n"

    move-object/from16 v0, v21

    invoke-static {v5, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v21, Lpb0;->d0:Ljava/lang/String;

    move-object/from16 v0, v20

    move-object/from16 v1, v21

    invoke-direct {v0, v5, v1}, Lkx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v21, Lkx;

    const-string v5, "mHoCwwMayTW6dgLHAxbVEZdzEMQ=\n"

    const-string v22, "+xJjt3dzp1I=\n"

    move-object/from16 v0, v22

    invoke-static {v5, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v22, Lpb0;->m0:Ljava/lang/String;

    move-object/from16 v0, v21

    move-object/from16 v1, v22

    invoke-direct {v0, v5, v1}, Lkx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v22, Lkx;

    const-string v5, "13Xob7qbVyn0Y/t/tZ9KPw==\n"

    const-string v23, "uRCcPNn+OUw=\n"

    move-object/from16 v0, v23

    invoke-static {v5, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v23, Lpb0;->a:Ljava/lang/String;

    move-object/from16 v0, v22

    move-object/from16 v1, v23

    invoke-direct {v0, v5, v1}, Lkx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v23, Lkx;

    const-string v5, "JuPKRGn+sHIb6M1UZfazciby/Xtr6K0=\n"

    const-string v24, "SIa+Fwqb3hc=\n"

    move-object/from16 v0, v24

    invoke-static {v5, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v24, Lpb0;->u1:Ljava/lang/String;

    move-object/from16 v0, v23

    move-object/from16 v1, v24

    invoke-direct {v0, v5, v1}, Lkx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v24, Lkx;

    const-string v5, "nk68bUGws6mDVJ1LX56yrZ5T\n"

    const-string v25, "7SDPLi7d3sw=\n"

    move-object/from16 v0, v25

    invoke-static {v5, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v25, Lpb0;->v1:Ljava/lang/String;

    move-object/from16 v0, v24

    move-object/from16 v1, v25

    invoke-direct {v0, v5, v1}, Lkx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v25, Ljava/util/LinkedHashMap;

    const/16 v5, 0x11

    invoke-static {v5}, Ldt;->z(I)I

    move-result v5

    move-object/from16 v0, v25

    invoke-direct {v0, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    const/4 v5, 0x0

    :goto_d
    const/16 v26, 0x11

    move/from16 v0, v26

    if-ge v5, v0, :cond_1c

    const/16 v26, 0x11

    move/from16 v0, v26

    new-array v0, v0, [Lkx;

    move-object/from16 v26, v0

    const/16 v27, 0x0

    aput-object v6, v26, v27

    const/16 v27, 0x1

    aput-object v9, v26, v27

    const/16 v27, 0x2

    aput-object v10, v26, v27

    const/16 v27, 0x3

    aput-object v11, v26, v27

    const/16 v27, 0x4

    aput-object v12, v26, v27

    const/16 v27, 0x5

    aput-object v13, v26, v27

    const/16 v27, 0x6

    aput-object v14, v26, v27

    const/16 v27, 0x7

    aput-object v15, v26, v27

    const/16 v27, 0x8

    aput-object v16, v26, v27

    const/16 v27, 0x9

    aput-object v17, v26, v27

    const/16 v27, 0xa

    aput-object v18, v26, v27

    const/16 v27, 0xb

    aput-object v19, v26, v27

    const/16 v27, 0xc

    aput-object v20, v26, v27

    const/16 v27, 0xd

    aput-object v21, v26, v27

    const/16 v27, 0xe

    aput-object v22, v26, v27

    const/16 v27, 0xf

    aput-object v23, v26, v27

    const/16 v27, 0x10

    aput-object v24, v26, v27

    aget-object v26, v26, v5

    move-object/from16 v0, v26

    iget-object v0, v0, Lkx;->a:Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, v26

    iget-object v0, v0, Lkx;->b:Ljava/lang/Object;

    move-object/from16 v26, v0

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    move-object/from16 v2, v26

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, -0xb

    add-int/lit8 v5, v5, 0x1

    add-int/lit8 v5, v5, 0xb

    goto :goto_d

    :cond_8
    const/4 v7, 0x0

    :try_start_9
    aget-object v6, v6, v7

    goto/16 :goto_0

    :cond_9
    new-instance v6, Ljava/io/File;

    invoke-virtual {v4}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v7

    const-string v9, "IKVDAQWO0qgrokcJMbfQpSSoQw==\n"

    const-string v10, "R8Amalros8Q=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v6, v7, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v7

    if-nez v7, :cond_a

    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    :cond_a
    new-instance v7, Lio/fastkv/FastKV$Builder;

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    const-string v9, "eaGo+LuPMlZlkK3OsoM+e2muuM+z\n"

    const-string v10, "Cs/bp9bmUSQ=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v7, v6, v9}, Lio/fastkv/FastKV$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7}, Lio/fastkv/FastKV$Builder;->build()Lio/fastkv/FastKV;

    move-result-object v6

    sput-object v6, Lgn;->c:Lio/fastkv/FastKV;

    const-string v6, "grZkyswyzFamsGTJ\n"

    const-string v7, "wdkKrKVViTg=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "GQvn4RyoxlpfB66NDMB9ER4s0ussvAMEQXTjv0yTQ1BHHaK5Fs5/Mhwr4OYjlAM5fnjEpkKVf1hg\nA6KjPMJkFw==\n"

    const-string v9, "+5FHDqQn5r8=\n"

    invoke-static {v7, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v9, "xwGO\n"

    const-string v10, "s2Dpd1+FjZU=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v6}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v6, "53vj\n"

    const-string v9, "igiEy7e+YPk=\n"

    invoke-static {v6, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v7}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    goto/16 :goto_1

    :cond_b
    :try_start_a
    instance-of v11, v6, Ljava/lang/String;

    if-eqz v11, :cond_c

    sget-object v11, Lgn;->c:Lio/fastkv/FastKV;

    if-eqz v11, :cond_2

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v11, v7, v6}, Lio/fastkv/FastKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto/16 :goto_2

    :cond_c
    instance-of v11, v6, Ljava/lang/Integer;

    if-eqz v11, :cond_2

    sget-object v11, Lgn;->c:Lio/fastkv/FastKV;

    if-eqz v11, :cond_2

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-virtual {v11, v7, v6}, Lio/fastkv/FastKV;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    goto/16 :goto_2

    :cond_d
    new-instance v6, Lgg;

    invoke-direct {v6, v9}, Lgg;-><init>(Ljava/io/File;)V

    new-instance v9, Lfk;

    invoke-direct {v9, v6}, Lfk;-><init>(Lgg;)V

    :cond_e
    const/4 v6, 0x1

    move v7, v6

    :goto_e
    invoke-virtual {v9}, Lfk;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-virtual {v9}, Lfk;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/io/File;

    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    move-result v10

    if-nez v10, :cond_f

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_10

    :cond_f
    if-nez v7, :cond_e

    :cond_10
    const/4 v6, 0x0

    move v7, v6

    goto :goto_e

    :cond_11
    const-string v6, "obaJRQk1fNqFq4ZXCT1f\n"

    const-string v7, "4tnnI2BSMbM=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "PVVyWVRt8z8EQn9TRm3tIx5Tc1QVLPA+UFl4RFA/8DscEHVRViX7ehNcc1FbKPp0\n"

    const-string v9, "cDAWMDVNnlo=\n"

    invoke-static {v7, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v9, "xwGO\n"

    const-string v10, "s2Dpd1+FjZU=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v6}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v6, "53vj\n"

    const-string v9, "igiEy7e+YPk=\n"

    invoke-static {v6, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v7}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    goto/16 :goto_3

    :cond_12
    :try_start_b
    instance-of v11, v6, Ljava/lang/String;

    if-eqz v11, :cond_13

    sget-object v11, Lgn;->c:Lio/fastkv/FastKV;

    if-eqz v11, :cond_4

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v11, v7, v6}, Lio/fastkv/FastKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto/16 :goto_4

    :cond_13
    instance-of v11, v6, Ljava/lang/Integer;

    if-eqz v11, :cond_4

    sget-object v11, Lgn;->c:Lio/fastkv/FastKV;

    if-eqz v11, :cond_4

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-virtual {v11, v7, v6}, Lio/fastkv/FastKV;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    goto/16 :goto_4

    :cond_14
    sget-object v6, Lgn;->c:Lio/fastkv/FastKV;

    if-eqz v6, :cond_15

    const-string v7, "Edh8iCpuk9wMzke6N2a+0B3PSoQcepXYGcdXjQ==\n"

    const-string v10, "eKsj5UMJ4b0=\n"

    invoke-static {v7, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v10, 0x1

    invoke-virtual {v6, v7, v10}, Lio/fastkv/FastKV;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    :cond_15
    invoke-interface {v9}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    goto/16 :goto_5

    :catchall_2
    move-exception v6

    const-string v6, "Nwje\n"

    const-string v7, "Q2m5jaPP2Zc=\n"

    const-string v9, "WQ6+l0yFyM93DISpY57PxH8fvrpuhsrLfwiw\n"

    const-string v10, "Hmvb/A/qpqk=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "Fg==\n"

    const-string v11, "c8HJlSTQVfc=\n"

    invoke-static {v6, v7, v9, v10, v11}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_5

    :catchall_3
    move-exception v5

    const-string v5, "Nwje\n"

    const-string v6, "Q2m5jaPP2Zc=\n"

    const-string v7, "XEcxvAhSVmF6VzeLDF1RdA==\n"

    const-string v9, "HTJF1EUzOAA=\n"

    invoke-static {v7, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v9, "Fg==\n"

    const-string v10, "c8HJlSTQVfc=\n"

    invoke-static {v5, v6, v7, v9, v10}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_6

    :cond_16
    :try_start_c
    invoke-virtual {v4, v6, v5}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    goto/16 :goto_7

    :catchall_4
    move-exception v5

    const-string v5, "Nwje\n"

    const-string v6, "Q2m5jaPP2Zc=\n"

    const-string v7, "RVMWnDW0LdVrUSylE7wqwHZTAaUTuCbadFMB\n"

    const-string v9, "AjZz93bbQ7M=\n"

    invoke-static {v7, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v9, "Fg==\n"

    const-string v10, "c8HJlSTQVfc=\n"

    invoke-static {v5, v6, v7, v9, v10}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_7

    :cond_17
    const-wide/16 v6, 0x0

    goto/16 :goto_8

    :catchall_5
    move-exception v5

    sget-object v5, Lgn;->a:Lgn;

    const-string v6, "yl0hO7/i+0zETAcBovPqR/5bNwCp\n"

    const-string v7, "oThYZMyHmD4=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, ""

    invoke-static {v6, v5}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_18

    const-string v5, "j8EkyoFqdk6B0ALwnHtnRbvHMvGX\n"

    const-string v6, "5KRdlfIPFTw=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "F3AyrHo=\n"

    const-string v7, "NBdXyREDn7s=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lgn;->h(Ljava/lang/String;Ljava/lang/String;)V

    :cond_18
    const-string v5, "Nwje\n"

    const-string v6, "Q2m5jaPP2Zc=\n"

    const-string v7, "BKv6aURi8KE/uvltQg==\n"

    const-string v9, "UdueCDAHvcA=\n"

    invoke-static {v7, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v9, "Fg==\n"

    const-string v10, "c8HJlSTQVfc=\n"

    invoke-static {v5, v6, v7, v9, v10}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_9

    :catchall_6
    move-exception v5

    :try_start_d
    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v5, v6, v7}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v5

    if-eqz v5, :cond_27

    iget-object v5, v5, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    if-nez v5, :cond_7

    move-object v5, v8

    goto/16 :goto_a

    :catchall_7
    move-exception v5

    const-string v5, "Nwje\n"

    const-string v6, "Q2m5jaPP2Zc=\n"

    const-string v7, "/7PkNpgFk8Papc4xlzyk1tiz1QG+FLHwzaTUN5Yf\n"

    const-string v9, "qNanXvlxxaY=\n"

    invoke-static {v7, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v9, "Fg==\n"

    const-string v10, "c8HJlSTQVfc=\n"

    invoke-static {v5, v6, v7, v9, v10}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v5, v8

    goto/16 :goto_a

    :cond_19
    const-string v6, "nNFq901V\n"

    const-string v7, "z6gZgyg41bA=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "\u68c0\u6d4b\u5230\u5fae\u4fe1\u7248\u672c: "

    invoke-virtual {v7, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "xwGO\n"

    const-string v9, "s2Dpd1+FjZU=\n"

    const-string v10, "53vj\n"

    const-string v11, "igiEy7e+YPk=\n"

    invoke-static {v8, v9, v6, v10, v11}, Lz30;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v7}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_b

    :cond_1a
    const-string v6, "LJPXe2b8\n"

    const-string v7, "FL3nVVHMliQ=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v5, v6, v7}, Lb50;->N(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_1b

    sget-object v5, Lh90;->a:Ldd0;

    goto/16 :goto_c

    :cond_1b
    const-string v6, "S94c7N5s\n"

    const-string v7, "c/AswuhVbgM=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v5, v6, v7}, Lb50;->N(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_24

    sget-object v5, Lg90;->a:Ldd0;

    goto/16 :goto_c

    :cond_1c
    invoke-virtual/range {v25 .. v25}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_1d
    :goto_f
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1f

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v10

    if-nez v10, :cond_1e

    :goto_10
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_1e
    invoke-static {v5, v7}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v5

    if-nez v5, :cond_1d

    goto :goto_10

    :cond_1f
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_23

    const-string v5, "ObVaK1x5E3EVuF4z\n"

    const-string v6, "dNQqWzkLWxQ=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v9, 0x3f

    invoke-static {v8, v6, v7, v9}, Lab;->j0(Ljava/util/Collection;Ljava/lang/String;Lsm;I)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "\u9759\u6001\u5b57\u5178\u5b58\u5728\u5931\u6548\u8282\u70b9: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "xwGO\n"

    const-string v8, "s2Dpd1+FjZU=\n"

    const-string v9, "53vj\n"

    const-string v10, "igiEy7e+YPk=\n"

    invoke-static {v7, v8, v5, v9, v10}, Lz30;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v6}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_11
    sget-object v5, Lgn;->a:Lgn;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lgn;->i:Lid;

    sget-object v6, Lwg;->b:Lnf;

    new-instance v7, Los;

    const/4 v8, 0x0

    invoke-direct {v7, v4, v8}, Los;-><init>(Landroid/app/Application;Lld;)V

    const/4 v8, 0x2

    invoke-static {v5, v6, v7, v8}, La80;->r(Loe;Lge;Lwm;I)Lp40;

    const-string v5, "CZs8RSNGxskboSh1Ik0=\n"

    const-string v6, "Yv5FGkYosrs=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x2

    invoke-static {v5, v6}, Lgn;->b(Ljava/lang/String;I)I

    move-result v5

    const/4 v6, 0x1

    if-eq v5, v6, :cond_25

    const/4 v6, 0x2

    if-eq v5, v6, :cond_25

    :goto_12
    if-eqz v5, :cond_26

    const/4 v6, 0x2

    if-eq v5, v6, :cond_26

    :goto_13
    sget-object v5, Lxa;->a:Ljava/util/concurrent/ConcurrentHashMap;

    :try_start_e
    sget-object v5, Lt6;->a:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_20

    const-string v6, "LNAmTXBRWWkuxiRH\n"

    const-string v7, "eZ5tAz8GFzY=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_20

    sget-object v6, Lxa;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v6}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    new-instance v7, Lwa;

    const-string v8, "6hChjUFwCJk=\n"

    const-string v9, "rXXE5mEgevY=\n"

    invoke-static {v8, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "lflRk4GtZQ==\n"

    const-string v10, "trxp1bToXAc=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v10, "fFMcYbeHkg==\n"

    const-string v11, "X2dfIPGyoqk=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-direct {v7, v8, v9, v10}, Lwa;-><init>(Ljava/lang/String;II)V

    invoke-virtual {v6, v5, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0

    :cond_20
    :goto_14
    const-string v5, "lo1tgNcTkL6qnw==\n"

    const-string v6, "xfQe9LJ+2NE=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lns;

    const/16 v7, 0xd

    invoke-direct {v6, v4, v7}, Lns;-><init>(Landroid/app/Application;I)V

    invoke-static {v5, v6}, Lgn;->j(Ljava/lang/String;Lhm;)V

    const-string v5, "snTSWfVPZZONadA=\n"

    const-string v6, "4ga7L5QsHNs=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lns;

    const/16 v7, 0xe

    invoke-direct {v6, v4, v7}, Lns;-><init>(Landroid/app/Application;I)V

    invoke-static {v5, v6}, Lgn;->j(Ljava/lang/String;Lhm;)V

    const-string v5, "ddas\n"

    const-string v6, "AbfL95mQedY=\n"

    const-string v7, "HZyZKXl7\n"

    const-string v8, "SNXRRhYQEJU=\n"

    invoke-static {v7, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "ITa66yE=\n"

    const-string v9, "Q1rViEo8ya8=\n"

    invoke-static {v5, v6, v7, v8, v9}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :try_start_f
    const-string v5, "KeqpUkBkass=\n"

    const-string v6, "RoT7NzMRB64=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lp50;

    const/4 v7, 0x6

    invoke-direct {v6, v7}, Lp50;-><init>(I)V

    const-class v7, Landroid/app/Activity;

    invoke-static {v7, v5, v6}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    :goto_15
    const-string v5, "zN7BlNgo1SHt2w==\n"

    const-string v6, "n7Cy2r1cok4=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lns;

    const/4 v7, 0x1

    invoke-direct {v6, v4, v7}, Lns;-><init>(Landroid/app/Application;I)V

    invoke-static {v5, v6}, Lgn;->j(Ljava/lang/String;Lhm;)V

    const-string v5, "cstFx8wJ73BIzV7A\n"

    const-string v6, "PKQxrqpgjBE=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lns;

    const/4 v7, 0x2

    invoke-direct {v6, v4, v7}, Lns;-><init>(Landroid/app/Application;I)V

    invoke-static {v5, v6}, Lgn;->j(Ljava/lang/String;Lhm;)V

    const-string v5, "IizsByzlWw==\n"

    const-string v6, "cUKfT0OKMKo=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lns;

    const/4 v7, 0x3

    invoke-direct {v6, v4, v7}, Lns;-><init>(Landroid/app/Application;I)V

    invoke-static {v5, v6}, Lgn;->j(Ljava/lang/String;Lhm;)V

    const-string v5, "wnvzgoBKKZc=\n"

    const-string v6, "gROS9sglRvw=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lns;

    const/4 v7, 0x4

    invoke-direct {v6, v4, v7}, Lns;-><init>(Landroid/app/Application;I)V

    invoke-static {v5, v6}, Lgn;->j(Ljava/lang/String;Lhm;)V

    const-string v5, "QIXVyOaGKgpP\n"

    const-string v6, "DeCmu4fhT04=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lns;

    const/4 v7, 0x5

    invoke-direct {v6, v4, v7}, Lns;-><init>(Landroid/app/Application;I)V

    invoke-static {v5, v6}, Lgn;->j(Ljava/lang/String;Lhm;)V

    const-string v5, "TD0bKTbqCyJlMQ==\n"

    const-string v6, "AEh4Qk+nZEw=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lns;

    const/4 v7, 0x6

    invoke-direct {v6, v4, v7}, Lns;-><init>(Landroid/app/Application;I)V

    invoke-static {v5, v6}, Lgn;->j(Ljava/lang/String;Lhm;)V

    const-string v5, "k15orw6lTtixVA==\n"

    const-string v6, "3j8BwVvsBrc=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lns;

    const/4 v7, 0x7

    invoke-direct {v6, v4, v7}, Lns;-><init>(Landroid/app/Application;I)V

    invoke-static {v5, v6}, Lgn;->j(Ljava/lang/String;Lhm;)V

    const-string v5, "jIyrsE0hwI6WhqW3\n"

    const-string v6, "3unK3ANAres=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lns;

    const/16 v7, 0x8

    invoke-direct {v6, v4, v7}, Lns;-><init>(Landroid/app/Application;I)V

    invoke-static {v5, v6}, Lgn;->j(Ljava/lang/String;Lhm;)V

    const-string v5, "Xeiv12/e1aBq7q7PQsPJqg==\n"

    const-string v6, "HofBoQqspsE=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lns;

    const/16 v7, 0x9

    invoke-direct {v6, v4, v7}, Lns;-><init>(Landroid/app/Application;I)V

    invoke-static {v5, v6}, Lgn;->j(Ljava/lang/String;Lhm;)V

    const-string v5, "x92/wOuVPOHw277Y264H7+vZ\n"

    const-string v6, "hLLRto7nT4A=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lns;

    const/16 v7, 0xa

    invoke-direct {v6, v4, v7}, Lns;-><init>(Landroid/app/Application;I)V

    invoke-static {v5, v6}, Lgn;->j(Ljava/lang/String;Lhm;)V

    const-string v5, "h/9iab5RZBWp4g==\n"

    const-string v6, "xokDHd8jLHo=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lns;

    const/16 v7, 0xb

    invoke-direct {v6, v4, v7}, Lns;-><init>(Landroid/app/Application;I)V

    invoke-static {v5, v6}, Lgn;->j(Ljava/lang/String;Lhm;)V

    const-string v4, "4fiegXe91xLO6A==\n"

    const-string v5, "oI3q6TLTsHs=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "6SZJtoZqIc/LMkm3jGp1xNEjXK2QYTGKiDtSsYh3dcLNI1GxmmExhts+UrGXbDnfiDVSrMNhI8Pa\nKlKwhio=\n"

    const-string v6, "qFM93uMEVaY=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "xwGO\n"

    const-string v7, "s2Dpd1+FjZU=\n"

    const-string v8, "53vj\n"

    const-string v9, "igiEy7e+YPk=\n"

    invoke-static {v6, v7, v4, v8, v9}, Lz30;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_21
    invoke-static {}, Landroidx/recyclerview/widget/ۧۧۦۢ;->ۣۢۦۨ()I

    move-result v4

    if-ltz v4, :cond_22

    const-string v4, "0bGBGaOkSvh5QW3Jn"

    invoke-static {v4}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۤۥۨۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    sget-object v6, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v6, v4, v5}, Ljava/io/PrintStream;->println(J)V

    :cond_22
    :goto_16
    return-void

    :cond_23
    const-string v5, "gEGBQin1BuSsTIVa\n"

    const-string v6, "zSDxMkyHToE=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "pqNAoeNqxwrY21z/hH+9Qt6DPfrwDpwmqJZqos1xwSfN\n"

    const-string v7, "Tz7ZR2PrIqc=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "xwGO\n"

    const-string v8, "s2Dpd1+FjZU=\n"

    const-string v9, "53vj\n"

    const-string v10, "igiEy7e+YPk=\n"

    invoke-static {v7, v8, v5, v9, v10}, Lz30;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v6}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_11

    :cond_24
    const-string v6, "PM+9rSIc\n"

    const-string v7, "b7bO2UdxYZU=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "\u26a0\ufe0f \u8b66\u544a\uff1a\u5f53\u524d\u5fae\u4fe1\u7248\u672c "

    const-string v8, " \u672a\u9002\u914d\u3002\u5df2\u5b89\u5168\u8df3\u8fc7 Hook \u6d41\u7a0b\u3002"

    invoke-static {v7, v5, v8}, Lz30;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v7, "xwGO\n"

    const-string v8, "s2Dpd1+FjZU=\n"

    const-string v9, "53vj\n"

    const-string v10, "igiEy7e+YPk=\n"

    invoke-static {v7, v8, v6, v9, v10}, Lz30;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v5}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_11

    :cond_25
    const-string v6, "gDEMHKg8G2ynJhYmoic1\n"

    const-string v7, "01Rvbs1IXgI=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lns;

    const/4 v8, 0x0

    invoke-direct {v7, v4, v8}, Lns;-><init>(Landroid/app/Application;I)V

    invoke-static {v6, v7}, Lgn;->j(Ljava/lang/String;Lhm;)V

    goto/16 :goto_12

    :cond_26
    const-string v5, "wDJN8v1JL+P0H0zo0w==\n"

    const-string v6, "jVcjh7gnW5E=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lns;

    const/16 v7, 0xc

    invoke-direct {v6, v4, v7}, Lns;-><init>(Landroid/app/Application;I)V

    invoke-static {v5, v6}, Lgn;->j(Ljava/lang/String;Lhm;)V

    goto/16 :goto_13

    :catchall_8
    move-exception v5

    const-string v5, "Nwje\n"

    const-string v6, "Q2m5jaPP2Zc=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v5, "Fg==\n"

    const-string v6, "c8HJlSTQVfc=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    goto/16 :goto_15

    :pswitch_0
    invoke-direct/range {p0 .. p1}, Ltd;->a(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    goto :goto_16

    :catch_0
    move-exception v5

    goto/16 :goto_14

    :catchall_9
    move-exception v5

    goto/16 :goto_9

    :cond_27
    move-object v5, v8

    goto/16 :goto_a

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
