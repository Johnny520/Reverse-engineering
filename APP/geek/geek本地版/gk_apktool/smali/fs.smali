.class public final Lfs;
.super Lde/robv/android/xposed/XC_MethodHook;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/ClassLoader;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/ClassLoader;I)V
    .locals 3

    iput p2, p0, Lfs;->a:I

    iput-object p1, p0, Lfs;->b:Ljava/lang/ClassLoader;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e1\u06e4"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    move-result v0

    if-gtz v0, :cond_1

    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    move-result v0

    if-ltz v0, :cond_3

    const/16 v0, 0x46

    sput v0, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    const-string v0, "\u06e8\u06e3\u06e6"

    invoke-static {v0}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    xor-int/lit16 v2, v2, -0x207

    xor-int/2addr v0, v2

    if-gtz v0, :cond_0

    :cond_0
    const-string v0, "\u06e7\u06e8"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    :sswitch_2
    sget v0, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v2, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    add-int/lit16 v2, v2, 0xe8b

    add-int/2addr v0, v2

    if-gtz v0, :cond_2

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    const-string v0, "\u06e7\u06e7\u06e8"

    :goto_1
    invoke-static {v0}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e7\u06e8"

    goto :goto_1

    :sswitch_3
    const-string v0, "zzJoJ0AA8GenB"

    invoke-static {v0}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۠ۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget v1, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v2, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    mul-int/2addr v1, v2

    const v2, 0x1b48ba

    xor-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :cond_3
    sget v0, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v2, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    or-int/2addr v0, v2

    const v2, 0x1ac1c4

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    sget v0, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v2, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    div-int/2addr v0, v2

    const v2, 0xdc22

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc23 -> :sswitch_0
        0xdce1 -> :sswitch_5
        0x1ac1cb -> :sswitch_2
        0x1ac241 -> :sswitch_1
        0x1ac243 -> :sswitch_3
        0x1ac94b -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 74

    const/16 v20, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v24, 0x0

    const/16 v21, 0x0

    const/16 v40, 0x0

    const/4 v10, 0x0

    const/16 v28, 0x0

    const/16 v41, 0x0

    const/16 v55, 0x0

    const/4 v6, 0x0

    const/4 v5, 0x0

    const/4 v14, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/4 v7, 0x0

    const/16 v39, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v65, 0x0

    const/16 v47, 0x0

    const/16 v69, 0x0

    const/16 v60, 0x0

    const/16 v62, 0x0

    const/16 v54, 0x0

    const/16 v30, 0x0

    const/16 v29, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/4 v4, 0x0

    const/16 v61, 0x0

    const/16 v64, 0x0

    const/4 v9, 0x0

    const/16 v50, 0x0

    const/4 v13, 0x0

    const/16 v18, 0x0

    const/16 v25, 0x0

    const/16 v31, 0x0

    const/16 v26, 0x0

    const/4 v8, 0x0

    const/16 v38, 0x0

    const/16 v52, 0x0

    const/16 v37, 0x0

    const/16 v63, 0x0

    const/16 v27, 0x0

    const/16 v51, 0x0

    const/16 v36, 0x0

    const/16 v43, 0x0

    const/4 v11, 0x0

    const/16 v56, 0x0

    const/16 v19, 0x0

    const/16 v67, 0x0

    const/16 v66, 0x0

    const/16 v42, 0x0

    const/16 v72, 0x0

    const/16 v53, 0x0

    const/16 v71, 0x0

    const/16 v46, 0x0

    const/16 v68, 0x0

    const-wide/16 v32, 0x0

    const-wide/16 v22, 0x0

    const/16 v16, 0x0

    const/4 v12, 0x0

    const-string v57, "\u06e7\u06e0"

    invoke-static/range {v57 .. v57}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v70

    move-object/from16 v57, v4

    move-object/from16 v58, v12

    move-object/from16 v59, v16

    :goto_0
    sparse-switch v70, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v4, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v12, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    add-int/2addr v4, v12

    const v12, 0x1ab438

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto :goto_0

    :cond_0
    :sswitch_1
    sget v4, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v12, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    div-int/lit16 v12, v12, -0x15fe

    mul-int/2addr v4, v12

    if-eqz v4, :cond_1

    const/16 v4, 0x43

    sput v4, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    const-string v4, "\u06e3\u06e4\u06e6"

    :goto_1
    invoke-static {v4}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto :goto_0

    :cond_1
    const-string v4, "\u06df\u06e8\u06e1"

    goto :goto_1

    :sswitch_2
    const/16 v4, 0xd3

    move/from16 v0, v28

    if-eq v0, v4, :cond_47

    const-string v4, "\u06e6\u06e1\u06e4"

    invoke-static {v4}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto :goto_0

    :cond_2
    :sswitch_3
    invoke-static {}, Landroidx/core/content/ۣ۟ۧ۠;->۟۟۠ۢۨ()I

    move-result v4

    if-ltz v4, :cond_3

    const/16 v4, 0x3d

    sput v4, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    const-string v4, "\u06e4\u06e7\u06e7"

    invoke-static {v4}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto :goto_0

    :cond_3
    const-string v4, "\u06df\u06e5\u06e6"

    move-object/from16 v16, v4

    :goto_2
    invoke-static/range {v16 .. v16}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto :goto_0

    :sswitch_4
    sget v4, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v12, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    add-int/lit16 v12, v12, 0x16d3

    xor-int/2addr v4, v12

    if-ltz v4, :cond_4

    const-string v4, "\u06e8\u06e7"

    invoke-static {v4}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto :goto_0

    :cond_4
    sget v4, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v12, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    or-int/2addr v4, v12

    const v12, -0x1aba24

    xor-int/2addr v4, v12

    move/from16 v70, v4

    goto :goto_0

    :sswitch_5
    sget v4, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v12, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    add-int/2addr v4, v12

    const v12, 0x1ac235

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto :goto_0

    :sswitch_6
    packed-switch v28, :pswitch_data_0

    :sswitch_7
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v12, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    rem-int/2addr v4, v12

    const v12, 0x1ac864

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_8
    sget v4, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v12, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    or-int/lit16 v12, v12, 0x195a

    or-int/2addr v4, v12

    if-ltz v4, :cond_5

    const-string v4, "\u06e2\u06e1\u06e7"

    invoke-static {v4}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v4

    move-wide/from16 v22, v32

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_5
    sget v4, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v12, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    rem-int/2addr v4, v12

    const v12, 0x1ac9a4

    add-int/2addr v4, v12

    move-wide/from16 v22, v32

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    move-result v4

    if-gtz v4, :cond_6

    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    const-string v4, "\u06e3\u06e5\u06e8"

    invoke-static {v4}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06e0\u06e5\u06e4"

    invoke-static {v4}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_7
    :sswitch_a
    sget v4, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v12, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    add-int/lit16 v12, v12, 0x1785

    sub-int/2addr v4, v12

    if-ltz v4, :cond_8

    const/16 v4, 0x5a

    sput v4, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    const-string v4, "\u06e7\u06e4\u06e1"

    move-object v12, v4

    :goto_3
    invoke-static {v12}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e0\u06e2\u06e5"

    :goto_4
    invoke-static {v4}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Landroid/app/۠ۨۥۨ;->ۣۣ۟ۨۧ()I

    move-result v4

    if-gtz v4, :cond_9

    const-string v12, "\u06e3\u06e1\u06e7"

    move-object v4, v15

    move-object/from16 v16, v17

    move-object/from16 v18, v13

    :goto_5
    invoke-static {v12}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v12

    move-object v15, v4

    move-object/from16 v17, v16

    move/from16 v70, v12

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06e1\u06e4\u06e6"

    move-object/from16 v18, v13

    :goto_6
    invoke-static {v4}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_c
    const-string v4, "\u06e3\u06e6\u06e5"

    move/from16 v12, v25

    :goto_7
    invoke-static {v4}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    move/from16 v26, v12

    goto/16 :goto_0

    :sswitch_d
    if-nez v71, :cond_2

    :try_start_0
    sget-object v4, Lhs;->a:Lhs;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v4, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v12, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    rem-int/lit16 v12, v12, -0x168d

    add-int/2addr v4, v12

    if-ltz v4, :cond_a

    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    :goto_8
    const-string v4, "\u06e5\u06e6\u06e6"

    invoke-static {v4}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e7\u06e6\u06e5"

    :goto_9
    invoke-static {v4}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_e
    :try_start_1
    invoke-interface/range {v65 .. v65}, Ljava/util/Collection;->isEmpty()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    move-result v4

    if-eqz v4, :cond_28

    sget v4, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v12, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    mul-int/2addr v4, v12

    const v12, 0x1e2d6e

    xor-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_f
    move/from16 v0, v68

    int-to-long v0, v0

    move-wide/from16 v22, v0

    sget v4, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v12, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    or-int/lit16 v12, v12, -0x5c0

    sub-int/2addr v4, v12

    if-gtz v4, :cond_b

    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    :goto_a
    const-string v4, "\u06e8\u06df\u06e8"

    :goto_b
    invoke-static {v4}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06e7\u06df\u06e4"

    :goto_c
    invoke-static {v4}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_10
    move/from16 v4, v21

    move/from16 v12, v24

    :cond_c
    sget v16, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    if-ltz v16, :cond_d

    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    const-string v16, "\u06e3\u06e2\u06e7"

    move/from16 v21, v4

    move/from16 v24, v12

    goto/16 :goto_2

    :cond_d
    const-string v16, "\u06e8\u06e2\u06e6"

    invoke-static/range {v16 .. v16}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v16

    move/from16 v21, v4

    move/from16 v24, v12

    move/from16 v70, v16

    goto/16 :goto_0

    :sswitch_11
    :try_start_2
    new-instance v12, Li00;

    invoke-direct {v12}, Li00;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_7

    const-string v4, "\u06e8\u06e4\u06e4"

    :goto_d
    invoke-static {v4}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v55, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_12
    invoke-static {}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟ۤۦۡ()I

    move-result v4

    if-ltz v4, :cond_e

    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    const-string v4, "\u06e2\u06e1\u06e5"

    move/from16 v12, v26

    goto/16 :goto_7

    :cond_e
    sget v4, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v12, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    add-int/2addr v4, v12

    const v12, 0x1ab7d7

    xor-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_13
    :try_start_3
    sget-object v4, Lhs;->c:Ljava/util/concurrent/ConcurrentHashMap;

    move-object/from16 v0, v66

    invoke-virtual {v4, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    move-result v12

    if-ltz v12, :cond_f

    const-string v12, "\u06e7\u06e3\u06e8"

    invoke-static {v12}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v42, v4

    move/from16 v70, v12

    goto/16 :goto_0

    :cond_f
    const-string v12, "\u06e5\u06e0\u06e6"

    move-object/from16 v16, v4

    :goto_e
    invoke-static {v12}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v42, v16

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_14
    sget v4, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v12, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    div-int/2addr v4, v12

    const v12, 0xdc9c

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_15
    sget v4, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v12, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sub-int/2addr v4, v12

    const v12, 0x1ab2c6

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_10
    :sswitch_16
    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    move-result v4

    if-gtz v4, :cond_11

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    const-string v4, "\u06e3\u06e7\u06e8"

    goto/16 :goto_9

    :cond_11
    sget v4, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v12, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    or-int/2addr v4, v12

    const v12, -0xde47

    xor-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_17
    :try_start_4
    const-string v4, " \u4e0b\u53d1\u6570\u636e\u4e3a\u7a7a\uff0c\u65e0\u65b0\u5185\u5bb9\u9700\u70b9\u8d5e\u3002"

    move-object/from16 v0, v49

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {v49 .. v49}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_7

    move-result-object v4

    sget v12, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v16, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sub-int v12, v12, v16

    const v16, -0x1ac560

    xor-int v12, v12, v16

    move-object/from16 v57, v4

    move/from16 v70, v12

    goto/16 :goto_0

    :catchall_0
    move-exception v4

    sget v4, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v12, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    xor-int/lit16 v12, v12, -0x1e7c

    sub-int/2addr v4, v12

    if-gtz v4, :cond_12

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    const-string v4, "\u06e6\u06e6\u06e4"

    invoke-static {v4}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_12
    sget v4, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v12, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sub-int/2addr v4, v12

    const v12, 0x1ab7ff

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_18
    :try_start_5
    move-object/from16 v0, v55

    iget-object v4, v0, Li00;->b:Ljava/lang/Object;

    check-cast v4, Ljava/util/Collection;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_7

    sget v12, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v16, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    mul-int v12, v12, v16

    const v16, 0x11de5d

    add-int v12, v12, v16

    move-object/from16 v65, v4

    move/from16 v70, v12

    goto/16 :goto_0

    :sswitch_19
    :try_start_6
    const-string v4, "xwGO\n"

    const-string v12, "s2Dpd1+FjZU=\n"

    invoke-static {v4, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v47

    invoke-static {v4, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    sget v4, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v12, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    add-int/lit16 v12, v12, 0x207f

    rem-int/2addr v4, v12

    if-gtz v4, :cond_13

    const/16 v4, 0x20

    sput v4, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    const-string v4, "\u06e4\u06e0\u06e7"

    invoke-static {v4}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_13
    const-string v4, "\u06e0\u06df\u06e7"

    move-object/from16 v12, v54

    :goto_f
    invoke-static {v4}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v54, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :catchall_1
    move-exception v4

    const-string v4, "\u06e0\u06e6"

    invoke-static {v4}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_1a
    :try_start_7
    sget-object v4, Lpb0;->r1:Ljava/lang/String;

    move-object/from16 v0, v41

    invoke-static {v0, v4}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    move-result-object v7

    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    move-result v4

    if-ltz v4, :cond_14

    const/16 v4, 0x5f

    sput v4, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    const-string v4, "\u06e6\u06e4\u06e4"

    invoke-static {v4}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_14
    sget v4, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v12, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    mul-int/2addr v4, v12

    const v12, 0x13b5b4

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_1b
    packed-switch v20, :pswitch_data_1

    :pswitch_0
    :sswitch_1c
    sget v4, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    if-ltz v4, :cond_15

    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    const-string v4, "\u06e8\u06e1\u06e8"

    :goto_10
    invoke-static {v4}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_15
    const-string v4, "\u06e6\u06e0\u06e1"

    goto :goto_10

    :sswitch_1d
    if-eqz v46, :cond_7

    :goto_11
    const-string v4, "\u06e0\u06e5\u06e0"

    invoke-static {v4}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_1e
    :try_start_8
    sget-object v4, Lin;->a:Lin;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    sget v4, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v12, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    rem-int/2addr v4, v12

    const v12, 0x1aac7c

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_1f
    sget v4, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v12, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    add-int/lit16 v12, v12, -0x2365

    xor-int/2addr v4, v12

    if-gtz v4, :cond_16

    const-string v4, "\u06e1\u06e2\u06e7"

    invoke-static {v4}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v45, v14

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_16
    sget v4, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v12, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    mul-int/2addr v4, v12

    const v12, 0x1abb05

    add-int/2addr v4, v12

    move-object/from16 v45, v14

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_20
    sget v4, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v12, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    xor-int/lit16 v12, v12, 0x577

    xor-int/2addr v4, v12

    if-gtz v4, :cond_17

    const-string v4, "\u06e4\u06e4\u06e7"

    invoke-static {v4}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_17
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v12, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    add-int/2addr v4, v12

    const v12, 0x1abc0d

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_21
    :try_start_9
    move-object v0, v5

    check-cast v0, Ljava/util/LinkedList;

    move-object v4, v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    sget v12, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v14, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    add-int/lit16 v14, v14, 0x897

    rem-int/2addr v12, v14

    if-ltz v12, :cond_18

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    const-string v12, "\u06e2\u06e3\u06e6"

    move-object v14, v4

    move/from16 v16, v27

    :goto_12
    invoke-static {v12}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    move/from16 v27, v16

    goto/16 :goto_0

    :cond_18
    const-string v12, "\u06e3\u06e5\u06e8"

    move-object v14, v4

    goto/16 :goto_3

    :sswitch_22
    sget v4, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v12, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    xor-int/lit8 v12, v12, 0x5f

    sub-int/2addr v4, v12

    if-gtz v4, :cond_19

    const/16 v4, 0x10

    sput v4, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    const-string v4, "\u06e3\u06e7\u06e2"

    :goto_13
    invoke-static {v4}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_19
    const-string v4, "\u06e3\u06e2\u06df"

    goto/16 :goto_4

    :cond_1a
    :sswitch_23
    sget v4, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v12, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    rem-int/lit16 v12, v12, -0x1b6

    or-int/2addr v4, v12

    if-ltz v4, :cond_1b

    const-string v4, "\u06df\u06e8"

    move/from16 v12, v28

    :goto_14
    invoke-static {v4}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v28, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_1b
    sget v4, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v12, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    mul-int/2addr v4, v12

    const v12, 0x1b7458

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_24
    :try_start_a
    sget-object v12, Lwg;->b:Lnf;

    new-instance v4, Ly30;

    const/16 v16, 0x0

    move-object/from16 v0, v55

    move-object/from16 v1, v16

    invoke-direct {v4, v0, v15, v1}, Ly30;-><init>(Li00;Ljava/lang/ClassLoader;Lld;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    sget v16, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    if-gtz v16, :cond_1c

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    :goto_15
    const-string v16, "\u06e0\u06e6\u06e0"

    invoke-static/range {v16 .. v16}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v16

    move-object/from16 v29, v4

    move-object/from16 v30, v12

    move/from16 v70, v16

    goto/16 :goto_0

    :cond_1c
    sget v16, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v29, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sub-int v16, v16, v29

    const v29, 0x1aac29

    add-int v16, v16, v29

    move-object/from16 v29, v4

    move-object/from16 v30, v12

    move/from16 v70, v16

    goto/16 :goto_0

    :sswitch_25
    sget v4, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v12, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    mul-int/2addr v4, v12

    const v12, 0x11e9a5

    xor-int/2addr v4, v12

    move/from16 v70, v4

    move/from16 v71, v72

    goto/16 :goto_0

    :sswitch_26
    :try_start_b
    const-string v4, "wtIlnHk+6IfQ\n"

    const-string v12, "qbdcwxVLi+w=\n"

    invoke-static {v4, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    move-result-object v4

    const-string v12, "\u06e8\u06e8\u06e3"

    invoke-static {v12}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v64, v4

    move/from16 v70, v12

    goto/16 :goto_0

    :sswitch_27
    :try_start_c
    const-string v4, "53vj\n"

    const-string v12, "igiEy7e+YPk=\n"

    invoke-static {v4, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v57

    invoke-static {v4, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v12, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    or-int/lit16 v12, v12, 0x851

    or-int/2addr v4, v12

    if-gtz v4, :cond_1e

    :cond_1d
    const-string v4, "\u06e7\u06e0\u06e5"

    :goto_16
    invoke-static {v4}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_1e
    const-string v4, "\u06e3\u06e6\u06e8"

    goto :goto_16

    :cond_1f
    :sswitch_28
    const-string v4, "\u06e2\u06e7\u06e5"

    :goto_17
    invoke-static {v4}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_29
    const-string v4, "\u06e1\u06e0\u06e5"

    goto/16 :goto_13

    :sswitch_2a
    sget v4, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v12, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    rem-int/lit16 v12, v12, -0x1852

    rem-int/2addr v4, v12

    if-ltz v4, :cond_20

    const/4 v4, 0x2

    sput v4, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    const-string v4, "\u06e3\u06e6\u06e1"

    invoke-static {v4}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_20
    sget v4, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v12, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    xor-int/2addr v4, v12

    const v12, 0x1ab38a

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_2b
    sget v4, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    if-ltz v4, :cond_21

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    const-string v4, "\u06e6\u06e1\u06e4"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_21
    const-string v4, "\u06e3\u06e7\u06e3"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_2c
    :try_start_d
    sget-object v4, Lhs;->b:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object/from16 v0, v63

    invoke-virtual {v4, v0, v12}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_2

    move-object/from16 v0, p1

    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    move-object/from16 v43, v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    sget v4, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    if-ltz v4, :cond_22

    const/16 v4, 0x8

    sput v4, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    const-string v4, "\u06e1\u06e6\u06e3"

    invoke-static {v4}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_22
    const-string v4, "\u06e8\u06e2\u06e0"

    move-object v12, v4

    move-object/from16 v16, v42

    goto/16 :goto_e

    :sswitch_2d
    sget v4, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v12, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    rem-int/2addr v4, v12

    const v12, 0xda72

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_2e
    invoke-static {}, Lkotlinx/coroutines/ۦۡۧۧ;->۟ۤۧۨۦ()I

    move-result v4

    if-ltz v4, :cond_23

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    const-string v4, "\u06e8\u06e3"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_23
    const-string v4, "\u06e4\u06df"

    move-object/from16 v16, v4

    goto/16 :goto_2

    :sswitch_2f
    sget v4, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v12, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    or-int/lit16 v12, v12, 0x345

    sub-int/2addr v4, v12

    if-gtz v4, :cond_24

    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    const-string v4, "\u06e4\u06e3\u06e6"

    :goto_18
    invoke-static {v4}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_24
    const-string v4, "\u06e4\u06e8\u06e5"

    goto :goto_18

    :sswitch_30
    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    move-result v4

    if-gtz v4, :cond_25

    const/16 v4, 0x47

    sput v4, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    const-string v4, "\u06e1\u06e5\u06e3"

    :goto_19
    invoke-static {v4}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_25
    sget v4, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v12, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    mul-int/2addr v4, v12

    const v12, 0x1cbe4e

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_31
    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    move-result v4

    if-ltz v4, :cond_26

    const/16 v4, 0x25

    sput v4, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    move-object/from16 v16, v34

    :goto_1a
    const-string v4, "\u06e0\u06e3\u06e0"

    invoke-static {v4}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v35, v16

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_26
    sget v4, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v12, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    div-int/2addr v4, v12

    const v12, 0xdc21

    add-int/2addr v4, v12

    move-object/from16 v35, v34

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_32
    sget v4, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v12, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    div-int/lit16 v12, v12, -0x1d18

    or-int/2addr v4, v12

    if-ltz v4, :cond_27

    const-string v4, "\u06e6\u06e6\u06e3"

    invoke-static {v4}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_27
    const-string v4, "\u06e8\u06e4\u06e4"

    invoke-static {v4}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :catchall_2
    move-exception v4

    sget v4, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v12, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    mul-int/2addr v4, v12

    const v12, 0x1a28f3

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_28
    :sswitch_33
    const-string v4, "\u06df\u06e3\u06e6"

    invoke-static {v4}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_34
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v12, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    add-int/2addr v4, v12

    const v12, 0x1aada3

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_35
    :try_start_e
    move-object/from16 v0, p1

    iget-object v4, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v12, 0x0

    aget-object v9, v4, v12
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    sget v4, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v12, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    rem-int/lit16 v12, v12, 0x180e

    rem-int/2addr v4, v12

    if-ltz v4, :cond_29

    const-string v4, "\u06e3\u06e1\u06e1"

    invoke-static {v4}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_29
    const-string v4, "\u06e5\u06e3\u06e6"

    invoke-static {v4}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_2a
    :sswitch_36
    invoke-static {}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۦۤۨۢ()I

    move-result v4

    if-gtz v4, :cond_2b

    const-string v4, "\u06e0\u06e0\u06e3"

    move/from16 v12, v36

    :goto_1b
    invoke-static {v4}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    move/from16 v36, v12

    goto/16 :goto_0

    :cond_2b
    const-string v4, "\u06e2\u06e6\u06e1"

    invoke-static {v4}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_37
    sget v4, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    if-gtz v4, :cond_2c

    const/4 v4, 0x4

    sput v4, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    const-string v4, "\u06e5\u06e8\u06e0"

    move-object/from16 v12, v37

    :goto_1c
    invoke-static {v4}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v37, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_2c
    const-string v4, "\u06df\u06e8\u06e3"

    invoke-static {v4}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_2d
    :sswitch_38
    sget v4, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v12, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    xor-int/2addr v4, v12

    const v12, 0x1ab357

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_39
    :try_start_f
    invoke-virtual/range {v61 .. v61}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    if-gtz v4, :cond_2e

    const-string v4, "\u06e4\u06df\u06e8"

    invoke-static {v4}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_2e
    const-string v4, "\u06e6\u06e6\u06e4"

    :goto_1d
    invoke-static {v4}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_3a
    const-string v4, "\u06e4\u06e5\u06e1"

    invoke-static {v4}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_3b
    const/4 v13, 0x0

    const-string v4, "\u06e4\u06e5"

    move-object v12, v4

    goto/16 :goto_3

    :sswitch_3c
    if-eqz v18, :cond_2d

    :try_start_10
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Integer;->intValue()I
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    move-result v25

    const-string v12, "\u06e2\u06e1\u06e8"

    move-object v4, v15

    move-object/from16 v16, v17

    :goto_1e
    invoke-static {v12}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    move-object v15, v4

    move-object/from16 v17, v16

    move/from16 v70, v12

    goto/16 :goto_0

    :sswitch_3d
    sget v4, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v12, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    or-int/2addr v4, v12

    const v12, -0x1aae51

    xor-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_2f
    :sswitch_3e
    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۦۥ()I

    move-result v4

    if-gtz v4, :cond_30

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۢ۟ۡۧ()I

    const-string v4, "\u06e0\u06df"

    goto/16 :goto_6

    :cond_30
    sget v4, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v12, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    mul-int/2addr v4, v12

    const v12, 0x1a46f0

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_3f
    sget v4, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v12, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    add-int/lit16 v12, v12, -0x24e8

    or-int/2addr v4, v12

    if-ltz v4, :cond_31

    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    const-string v4, "\u06e2\u06df\u06e4"

    invoke-static {v4}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v66, v19

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_31
    sget v4, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v12, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    xor-int/2addr v4, v12

    const v12, -0x1abe5b

    xor-int/2addr v4, v12

    move-object/from16 v66, v19

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_40
    :try_start_11
    sget-object v4, Lpb0;->r1:Ljava/lang/String;

    move-object/from16 v0, v41

    invoke-static {v0, v4}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    move-result-object v5

    sget v4, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v12, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    rem-int/lit16 v12, v12, 0x19b0

    mul-int/2addr v4, v12

    if-gtz v4, :cond_32

    const/16 v4, 0x16

    sput v4, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    const-string v4, "\u06e7\u06e8\u06e5"

    invoke-static {v4}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_32
    const-string v4, "\u06e3\u06e8\u06df"

    :goto_1f
    invoke-static {v4}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_41
    sget v4, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v12, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    rem-int/lit16 v12, v12, 0x14d5

    sub-int/2addr v4, v12

    if-gtz v4, :cond_33

    invoke-static {}, Landroidx/activity/ۣ۟۠ۤۢ;->۟۠۠ۤۥ()I

    const-string v4, "\u06df\u06e7\u06e4"

    move-object v12, v4

    :goto_20
    invoke-static {v12}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_33
    const-string v4, "\u06e1\u06e2"

    invoke-static {v4}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_34
    :sswitch_42
    invoke-static {}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۡۢۡۥ()I

    move-result v4

    if-gtz v4, :cond_35

    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    const-string v4, "\u06df\u06e6\u06e4"

    invoke-static {v4}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_35
    sget v4, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v12, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    add-int/2addr v4, v12

    const v12, 0x1aba1c

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_43
    const-string v4, "wQ7ctDQ=\n"

    const-string v12, "sW+u1Vm+ZQA=\n"

    invoke-static {v4, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p1

    invoke-static {v4, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_a

    :sswitch_44
    :try_start_12
    move-object/from16 v0, p1

    iget-object v4, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const-string v12, "hVqXReMGLw==\n"

    const-string v16, "4j/jEZp2Sj0=\n"

    move-object/from16 v0, v16

    invoke-static {v12, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const/16 v16, 0x0

    move/from16 v0, v16

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    invoke-static {v4, v12, v0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_5

    move-result-object v10

    invoke-static {}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->۟ۡۨۢ()I

    move-result v4

    if-gtz v4, :cond_36

    invoke-static {}, Lۣ۟ۢ۠۠;->۠۟ۥ۠()I

    const-string v4, "\u06e2\u06e3\u06e1"

    :goto_21
    invoke-static {v4}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_36
    const-string v4, "\u06e1\u06e7"

    :goto_22
    invoke-static {v4}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_45
    const/16 v34, 0x0

    const-string v4, "\u06e2\u06e8\u06e2"

    invoke-static {v4}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_46
    const-string v4, "\u06e6\u06e4\u06e0"

    goto/16 :goto_19

    :sswitch_47
    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v12, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    xor-int/2addr v4, v12

    const v12, -0x1aa804

    xor-int/2addr v4, v12

    move-object/from16 v37, v52

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_37
    :sswitch_48
    const-string v4, "\u06e4\u06e6\u06e4"

    invoke-static {v4}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_49
    invoke-super/range {p0 .. p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    sget v4, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v12, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    div-int/lit16 v12, v12, 0x2058

    sub-int/2addr v4, v12

    if-gtz v4, :cond_38

    const/16 v4, 0x55

    sput v4, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    const-string v4, "\u06e3\u06e4\u06e8"

    invoke-static {v4}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_38
    sget v4, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v12, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    add-int/2addr v4, v12

    const v12, 0x1ac30a

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_4a
    const/16 v44, 0x0

    sget v4, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v12, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sub-int/2addr v4, v12

    const v12, 0x1aac53

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_4b
    const-string v4, "\u06e4\u06e0\u06e3"

    move-object/from16 v12, v38

    goto/16 :goto_1c

    :sswitch_4c
    invoke-static {}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->۟ۡۨۢ()I

    move-result v4

    if-gtz v4, :cond_39

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    const-string v4, "\u06e5\u06e2\u06df"

    invoke-static {v4}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_39
    sget v4, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v12, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    rem-int/2addr v4, v12

    const v12, 0x1ac93c

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_4d
    const-string v4, "1Q==\n"

    const-string v12, "pc7Qv/tSck0=\n"

    invoke-static {v4, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p1

    invoke-static {v4, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v4, "nIDVYjGQVj2olsJOD5pHOJKRyQ==\n"

    const-string v12, "9+WsPVD+IlQ=\n"

    sget-object v16, Lgn;->a:Lgn;

    move-object/from16 v0, v16

    invoke-static {v4, v12, v0}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v12

    const-string v4, "XXktxETiwcVpbzroevvcwVM=\n"

    const-string v16, "NhxUmyWXtao=\n"

    move-object/from16 v0, v16

    invoke-static {v4, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lgn;->e(Ljava/lang/String;)Z

    move-result v4

    if-nez v12, :cond_c

    if-nez v4, :cond_c

    sget v16, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v21, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    move/from16 v0, v21

    add-int/lit16 v0, v0, -0x1cb7

    move/from16 v21, v0

    xor-int v16, v16, v21

    if-ltz v16, :cond_3a

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    :goto_23
    const-string v16, "\u06e5\u06e6\u06e1"

    invoke-static/range {v16 .. v16}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v16

    move/from16 v21, v4

    move/from16 v24, v12

    move/from16 v70, v16

    goto/16 :goto_0

    :cond_3a
    move-object/from16 v16, v35

    move/from16 v21, v4

    move/from16 v24, v12

    goto/16 :goto_1a

    :sswitch_4e
    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v12, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    rem-int/lit16 v12, v12, -0x23ef

    rem-int/2addr v4, v12

    if-ltz v4, :cond_3b

    const/16 v4, 0x52

    sput v4, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    const-string v4, "\u06e4\u06e5\u06e3"

    goto/16 :goto_22

    :cond_3b
    sget v4, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v12, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    xor-int/2addr v4, v12

    const v12, 0xde64

    xor-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_4f
    :try_start_13
    move-object v0, v6

    check-cast v0, Ljava/lang/String;

    move-object v4, v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v12, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    or-int/2addr v4, v12

    const v12, 0x1ac66d

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_3c
    :sswitch_50
    sget v4, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v12, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    xor-int/lit16 v12, v12, 0xe8c

    div-int/2addr v4, v12

    if-eqz v4, :cond_3d

    const/16 v4, 0x11

    sput v4, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    const-string v4, "\u06e1\u06e1\u06e5"

    goto/16 :goto_1f

    :cond_3d
    const-string v4, "\u06e3\u06e3\u06e7"

    move-object v12, v4

    goto/16 :goto_20

    :sswitch_51
    const/16 v4, 0xd4

    move/from16 v0, v28

    if-ne v0, v4, :cond_69

    sget v4, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v12, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    or-int/lit16 v12, v12, 0xc4b

    xor-int/2addr v4, v12

    if-ltz v4, :cond_3e

    const-string v4, "\u06e7\u06df\u06e4"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_3e
    const-string v4, "\u06e1\u06e6\u06e7"

    goto/16 :goto_b

    :sswitch_52
    sget v4, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v12, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sub-int/2addr v4, v12

    const v12, 0x1ab9d0

    xor-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_53
    :try_start_14
    const-string v4, "8KpS\n"

    const-string v12, "seYeakckjHs=\n"

    invoke-static {v4, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_7

    sget v4, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    if-ltz v4, :cond_40

    invoke-static {}, Landroidx/core/content/ۣ۟ۧ۠;->۟۟۠ۢۨ()I

    :cond_3f
    const-string v4, "\u06e1\u06e2\u06e1"

    invoke-static {v4}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_40
    const-string v4, "\u06e5\u06df\u06e7"

    :goto_24
    invoke-static {v4}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_54
    :try_start_15
    move-object/from16 v0, p1

    iget-object v4, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v12, 0x2

    aget-object v8, v4, v12
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    sget v4, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v12, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    or-int/2addr v4, v12

    const v12, 0x1abde6

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_55
    move-object/from16 v0, p1

    iget-object v4, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v12, 0x4

    aget-object v4, v4, v12

    if-nez v4, :cond_67

    sget v12, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v16, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    move/from16 v0, v16

    rem-int/lit16 v0, v0, 0x14e2

    move/from16 v16, v0

    add-int v12, v12, v16

    if-ltz v12, :cond_41

    const-string v12, "\u06e0\u06e8\u06e4"

    move-object/from16 v16, v41

    :goto_25
    invoke-static {v12}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v40, v4

    move-object/from16 v41, v16

    move/from16 v70, v12

    goto/16 :goto_0

    :cond_41
    sget v12, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v16, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    add-int v12, v12, v16

    const v16, -0x1ac60d

    xor-int v12, v12, v16

    move-object/from16 v40, v4

    move/from16 v70, v12

    goto/16 :goto_0

    :sswitch_56
    if-eqz v24, :cond_79

    invoke-static {}, Lkotlinx/coroutines/ۦۡۧۧ;->۟ۤۧۨۦ()I

    move-result v4

    if-ltz v4, :cond_42

    const-string v4, "\u06e2\u06e7\u06e3"

    goto/16 :goto_c

    :cond_42
    const-string v4, "\u06e4\u06e2\u06e8"

    invoke-static {v4}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_57
    sget v4, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v12, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    or-int/lit16 v12, v12, 0x10f0

    sub-int/2addr v4, v12

    if-ltz v4, :cond_43

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    const-string v4, "\u06e7\u06e5\u06e3"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_43
    const-string v4, "\u06e4\u06df\u06e8"

    goto/16 :goto_1f

    :sswitch_58
    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    move-result v4

    if-ltz v4, :cond_44

    const-string v4, "\u06e7\u06e7\u06e0"

    invoke-static {v4}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_44
    sget v4, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v12, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    xor-int/2addr v4, v12

    const v12, 0x1aab21

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_59
    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    move-result v4

    if-ltz v4, :cond_45

    const-string v4, "\u06e3\u06e1\u06df"

    invoke-static {v4}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v35, v39

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_45
    const-string v4, "\u06e8\u06e3"

    move-object/from16 v35, v39

    goto/16 :goto_21

    :sswitch_5a
    :try_start_16
    instance-of v4, v7, Ljava/util/LinkedList;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_1

    if-eqz v4, :cond_87

    sget v4, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    if-gtz v4, :cond_46

    const/16 v4, 0x2e

    sput v4, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    const-string v4, "\u06e2\u06df\u06e3"

    invoke-static {v4}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_46
    const-string v4, "\u06e2\u06e3\u06e1"

    move-object/from16 v16, v4

    goto/16 :goto_2

    :cond_47
    :sswitch_5b
    sget v4, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    if-ltz v4, :cond_48

    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    const-string v4, "\u06e8\u06df\u06e0"

    move-object v12, v4

    move-object/from16 v16, v42

    goto/16 :goto_e

    :cond_48
    sget v4, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v12, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    add-int/2addr v4, v12

    const v12, 0x1aafe3

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_5c
    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    move-result v4

    if-gtz v4, :cond_49

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    const-string v4, "\u06e4\u06df\u06e7"

    invoke-static {v4}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_49
    sget v4, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v12, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    or-int/2addr v4, v12

    const v12, 0x1abfd8

    xor-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_5d
    sget v4, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v12, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    or-int/2addr v4, v12

    const v12, 0x1aac27

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_5e
    :try_start_17
    const-string v4, "53vj\n"

    const-string v12, "igiEy7e+YPk=\n"

    invoke-static {v4, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v62

    invoke-static {v4, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_7

    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    move-result v4

    if-ltz v4, :cond_4a

    const/16 v4, 0xd

    sput v4, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    const-string v4, "\u06e5\u06e0\u06e6"

    invoke-static {v4}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_4a
    move-object/from16 v4, v29

    move-object/from16 v12, v30

    goto/16 :goto_15

    :sswitch_5f
    :try_start_18
    invoke-virtual/range {v42 .. v42}, Ljava/lang/String;->length()I
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_0

    move-result v4

    if-nez v4, :cond_57

    sget v4, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    if-ltz v4, :cond_4b

    const-string v4, "\u06e3\u06e2\u06df"

    invoke-static {v4}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_4b
    sget v4, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v12, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    xor-int/2addr v4, v12

    const v12, 0xda1a

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_60
    if-eqz v65, :cond_5d

    invoke-static {}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟ۢۡ۠ۦ()I

    move-result v4

    if-ltz v4, :cond_4c

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    const-string v4, "\u06e2\u06e3\u06e5"

    invoke-static {v4}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_4c
    sget v4, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v12, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    or-int/2addr v4, v12

    const v12, 0x1aaccf

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_61
    :try_start_19
    sget-object v4, Lgn;->a:Lgn;
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_0

    sget v12, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v16, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    rem-int v12, v12, v16

    const v16, 0x1aa7d9

    add-int v12, v12, v16

    move-object/from16 v61, v4

    move/from16 v70, v12

    goto/16 :goto_0

    :catchall_3
    move-exception v4

    :try_start_1a
    sget-object v4, Lgn;->a:Lgn;

    const-string v12, "WTFaLjA76w1LC0cUMC/x\n"

    const-string v16, "MlQjcVxOiGY=\n"

    move-object/from16 v0, v16

    invoke-static {v12, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v16, "Qg==\n"

    const-string v70, "chrynql3WXk=\n"

    move-object/from16 v0, v16

    move-object/from16 v1, v70

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v0, v16

    invoke-static {v12, v0}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_4

    move-result-wide v32

    sget v4, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v12, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    or-int/lit16 v12, v12, -0xaa4

    add-int/2addr v4, v12

    if-ltz v4, :cond_1d

    const/16 v4, 0x60

    sput v4, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    const-string v4, "\u06e6\u06e8\u06e3"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_62
    :try_start_1b
    sget-object v12, Ld9;->b:Landroid/os/Handler;

    new-instance v4, Lfi;

    const/16 v16, 0x1

    move-object/from16 v0, v43

    move-object/from16 v1, v63

    move/from16 v2, v16

    invoke-direct {v4, v15, v0, v1, v2}, Lfi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_0

    sget v16, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v58, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    mul-int v16, v16, v58

    const v58, 0x129b78

    add-int v16, v16, v58

    move-object/from16 v58, v4

    move-object/from16 v59, v12

    move/from16 v70, v16

    goto/16 :goto_0

    :sswitch_63
    sget v4, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    if-gtz v4, :cond_4d

    const/16 v4, 0xd

    sput v4, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    const-string v4, "\u06e4\u06e2\u06e8"

    invoke-static {v4}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_4d
    const-string v4, "\u06e0\u06e8\u06e4"

    goto/16 :goto_1d

    :sswitch_64
    :try_start_1c
    const-string v4, "Z+wZLEm3tD111gQWSaOu\n"

    const-string v12, "DIlgcyXC11Y=\n"

    invoke-static {v4, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v12, 0x0

    invoke-static {v4, v12}, Lgn;->b(Ljava/lang/String;I)I
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_3

    move-result v4

    sget v12, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v16, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    move/from16 v0, v16

    add-int/lit16 v0, v0, -0x734

    move/from16 v16, v0

    xor-int v12, v12, v16

    if-gtz v12, :cond_4e

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    const-string v12, "\u06e2\u06e8\u06e0"

    invoke-static {v12}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v12

    move/from16 v68, v4

    move/from16 v70, v12

    goto/16 :goto_0

    :cond_4e
    sget v12, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v16, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    div-int v12, v12, v16

    const v16, 0x1ab2c3

    xor-int v12, v12, v16

    move/from16 v68, v4

    move/from16 v70, v12

    goto/16 :goto_0

    :sswitch_65
    sget v4, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v12, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    or-int/lit16 v12, v12, 0x16fa

    xor-int/2addr v4, v12

    if-ltz v4, :cond_4f

    const/16 v4, 0x26

    sput v4, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    const-string v4, "\u06e6\u06e3\u06e7"

    invoke-static {v4}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_4f
    sget v4, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v12, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    rem-int/2addr v4, v12

    const v12, -0x1aae86

    xor-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_66
    if-nez v19, :cond_3c

    :try_start_1d
    const-string v67, ""
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_0

    sget v4, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    if-gtz v4, :cond_50

    const-string v4, "\u06e4\u06e0\u06e1"

    invoke-static {v4}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_50
    sget v4, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v12, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    rem-int/2addr v4, v12

    const v12, 0x1aae6a

    xor-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_67
    :try_start_1e
    move-object/from16 v0, v45

    move-object/from16 v1, v55

    iput-object v0, v1, Li00;->b:Ljava/lang/Object;
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_7

    sget v4, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v12, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    add-int/lit16 v12, v12, -0xf1f

    div-int/2addr v4, v12

    if-eqz v4, :cond_52

    :cond_51
    const-string v4, "\u06df\u06e4\u06e2"

    invoke-static {v4}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_52
    sget v4, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v12, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    or-int/2addr v4, v12

    const v12, 0x1aa970

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_68
    :try_start_1f
    invoke-static/range {v63 .. v63}, Lip;->l(Ljava/lang/Object;)V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_0

    sget v4, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v12, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    add-int/lit16 v12, v12, -0x16a

    sub-int/2addr v4, v12

    if-gtz v4, :cond_53

    const-string v4, "\u06e4\u06e5\u06e1"

    invoke-static {v4}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_53
    const-string v4, "\u06df\u06df\u06e7"

    invoke-static {v4}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_69
    :try_start_20
    invoke-static/range {v64 .. v64}, Lgn;->e(Ljava/lang/String;)Z
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_0

    move-result v4

    if-eqz v4, :cond_2

    sget v4, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    if-ltz v4, :cond_54

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    const-string v4, "\u06df\u06e1\u06df"

    :goto_26
    invoke-static {v4}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_54
    const-string v4, "\u06e1\u06e1\u06e1"

    goto :goto_26

    :sswitch_6a
    :try_start_21
    const-string v4, "5UqNA5A5iv7fT5s=\n"

    const-string v12, "tiT+QuVN5bI=\n"

    invoke-static {v4, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    new-instance v16, Ljava/lang/StringBuilder;

    const-string v4, "\ud83d\udca4 CGI "

    move-object/from16 v0, v16

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_7

    const-string v4, "\u06e3\u06e8\u06e8"

    :goto_27
    invoke-static {v4}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v48, v12

    move-object/from16 v49, v16

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_6b
    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    move-result v4

    if-ltz v4, :cond_55

    invoke-static {}, Landroidx/recyclerview/widget/ۧۧۦۢ;->ۣۢۦۨ()I

    move-object/from16 v4, v44

    move/from16 v12, v46

    :goto_28
    const-string v16, "\u06e0\u06e1\u06e0"

    invoke-static/range {v16 .. v16}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v16

    move-object/from16 v45, v4

    move/from16 v46, v12

    move/from16 v70, v16

    goto/16 :goto_0

    :cond_55
    sget v4, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v12, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    or-int/2addr v4, v12

    const v12, 0x1aad39

    add-int/2addr v4, v12

    move-object/from16 v45, v44

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_6c
    const-string v4, "\u06e4\u06e6\u06e0"

    goto/16 :goto_13

    :sswitch_6d
    :try_start_22
    move-object/from16 v0, v59

    move-object/from16 v1, v58

    move-wide/from16 v2, v22

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_0

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    if-gtz v4, :cond_56

    const-string v4, "\u06e8\u06e2\u06e0"

    invoke-static {v4}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_56
    const-string v4, "\u06df\u06e5\u06e6"

    :goto_29
    invoke-static {v4}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_6e
    const-string v12, "\u06e5\u06e7\u06df"

    move-object v4, v15

    move-object/from16 v16, v17

    move-object/from16 v19, v17

    goto/16 :goto_5

    :cond_57
    :sswitch_6f
    const-string v4, "\u06e2\u06df\u06e0"

    goto/16 :goto_4

    :cond_58
    :sswitch_70
    sget v4, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v12, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    add-int/2addr v4, v12

    const v12, 0x1ab86d

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_71
    :try_start_23
    sget-object v4, Lpb0;->p1:Ljava/lang/String;

    move-object/from16 v0, v40

    invoke-static {v0, v4}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    sget-object v12, Lpb0;->q1:Ljava/lang/String;

    invoke-static {v4, v12}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_5

    move-result-object v16

    const-string v12, "\u06e5\u06e4\u06e2"

    move-object/from16 v4, v40

    goto/16 :goto_25

    :sswitch_72
    sget v4, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v12, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    rem-int/lit16 v12, v12, -0x109f

    xor-int/2addr v4, v12

    if-ltz v4, :cond_59

    const-string v4, "\u06e5\u06e2\u06e4"

    move-object/from16 v12, v47

    :goto_2a
    invoke-static {v4}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v47, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_59
    const-string v4, "\u06e3\u06e1\u06df"

    goto/16 :goto_1

    :sswitch_73
    :try_start_24
    move-object v0, v7

    check-cast v0, Ljava/util/LinkedList;

    move-object v4, v0
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_1

    sget v12, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v16, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    move/from16 v0, v16

    xor-int/lit16 v0, v0, -0x114

    move/from16 v16, v0

    add-int v12, v12, v16

    if-ltz v12, :cond_5a

    :goto_2b
    const-string v12, "\u06e3\u06e8\u06e0"

    invoke-static {v12}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v39, v4

    move/from16 v70, v12

    goto/16 :goto_0

    :cond_5a
    sget v12, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v16, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    mul-int v12, v12, v16

    const v16, 0x1d3f8

    xor-int v12, v12, v16

    move-object/from16 v39, v4

    move/from16 v70, v12

    goto/16 :goto_0

    :sswitch_74
    sget v4, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    if-ltz v4, :cond_5b

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    const-string v4, "\u06e3\u06df\u06df"

    invoke-static {v4}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    move/from16 v71, v53

    goto/16 :goto_0

    :cond_5b
    const-string v4, "\u06e4\u06df\u06e8"

    invoke-static {v4}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    move/from16 v71, v53

    goto/16 :goto_0

    :sswitch_75
    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    move-result v4

    if-ltz v4, :cond_5c

    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    const-string v4, "\u06e2\u06e0\u06e7"

    invoke-static {v4}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v18, v50

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_5c
    sget v4, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v12, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    div-int/2addr v4, v12

    const v12, -0x1ab9ec

    xor-int/2addr v4, v12

    move-object/from16 v18, v50

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_76
    :try_start_25
    move-object/from16 v0, p1

    iget-object v4, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const-string v12, "43feBJDOCUblf88=\n"

    const-string v16, "hBKqUeOrewg=\n"

    move-object/from16 v0, v16

    invoke-static {v12, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const/16 v16, 0x0

    move/from16 v0, v16

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    invoke-static {v4, v12, v0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_6

    move-result-object v6

    move-object/from16 v4, v39

    goto :goto_2b

    :catchall_4
    move-exception v4

    const-wide/16 v22, 0x0

    move/from16 v4, v21

    move/from16 v12, v24

    goto/16 :goto_23

    :sswitch_77
    if-eqz v42, :cond_7e

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    move-result v4

    if-gtz v4, :cond_51

    const-string v4, "\u06e8\u06e8\u06e8"

    invoke-static {v4}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_5d
    :sswitch_78
    sget v4, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v12, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    xor-int/lit16 v12, v12, -0x961

    add-int/2addr v4, v12

    if-gtz v4, :cond_5e

    const/4 v4, 0x7

    sput v4, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    const-string v4, "\u06e3\u06e2\u06e2"

    invoke-static {v4}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_5e
    const-string v4, "\u06e4\u06e2\u06e4"

    :goto_2c
    invoke-static {v4}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_79
    if-nez v37, :cond_10

    sget v4, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v12, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    add-int/lit16 v12, v12, -0x16b2

    mul-int/2addr v4, v12

    if-gtz v4, :cond_5f

    const-string v4, "\u06e5\u06e3\u06e5"

    invoke-static {v4}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_5f
    const-string v4, "\u06e4\u06e0\u06e1"

    goto/16 :goto_4

    :sswitch_7a
    if-eqz v36, :cond_2

    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    if-ltz v4, :cond_60

    const-string v4, "\u06e8\u06e3\u06e1"

    move-object/from16 v12, v48

    move-object/from16 v16, v49

    goto/16 :goto_27

    :cond_60
    sget v4, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v12, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    xor-int/2addr v4, v12

    const v12, -0x1ab5e8

    xor-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_7b
    :try_start_26
    const-string v4, "iwX2iIxe3I6ZP+K4hE4=\n"

    const-string v12, "4GCP1+Arv+U=\n"

    invoke-static {v4, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v12, 0x0

    invoke-static {v4, v12}, Lgn;->b(Ljava/lang/String;I)I
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_0

    move-result v4

    const/4 v12, 0x1

    if-eq v4, v12, :cond_1f

    goto/16 :goto_8

    :sswitch_7c
    :try_start_27
    const-string v4, "xwGO\n"

    const-string v12, "s2Dpd1+FjZU=\n"

    invoke-static {v4, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v48

    invoke-static {v4, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_7

    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    move-result v4

    if-ltz v4, :cond_61

    const-string v4, "\u06e4\u06e6\u06e2"

    invoke-static {v4}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_61
    const-string v4, "\u06e7\u06e4\u06e6"

    move/from16 v12, v36

    goto/16 :goto_1b

    :sswitch_7d
    sget v4, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    if-gtz v4, :cond_62

    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    const-string v4, "\u06e3\u06e3\u06e0"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_62
    sget v4, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v12, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    rem-int/2addr v4, v12

    const v12, -0x1ac988

    xor-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_7e
    const/4 v4, 0x2

    :try_start_28
    move-object/from16 v0, v54

    move-object/from16 v1, v30

    move-object/from16 v2, v29

    invoke-static {v0, v1, v2, v4}, La80;->r(Loe;Lge;Lwm;I)Lp40;
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_7

    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    move-result v4

    if-ltz v4, :cond_3f

    const-string v4, "\u06e0\u06e4\u06e7"

    invoke-static {v4}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_7f
    sget v4, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v12, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    mul-int/lit16 v12, v12, -0xc6f

    add-int/2addr v4, v12

    if-ltz v4, :cond_63

    invoke-static {}, Landroidx/appcompat/app/ۥۦۣ۠;->ۨۤ۠ۨ()I

    const-string v4, "\u06e0\u06e0\u06e0"

    invoke-static {v4}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_63
    sget v4, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v12, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    mul-int/2addr v4, v12

    const v12, 0x10f202

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_80
    sget v4, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    if-ltz v4, :cond_64

    invoke-static {}, Landroid/app/۠ۨۥۨ;->ۣۣ۟ۨۧ()I

    const-string v4, "\u06e7\u06e3\u06e2"

    goto/16 :goto_17

    :cond_64
    sget v4, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v12, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    mul-int/2addr v4, v12

    const v12, 0x15bffc

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_81
    :try_start_29
    const-string v4, "lUAhgx2tCIuvRTc=\n"

    const-string v12, "xi5SwmjZZ8c=\n"

    invoke-static {v4, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_7

    move-result-object v12

    const-string v4, "\u06e8\u06e1\u06e0"

    goto/16 :goto_2a

    :sswitch_82
    invoke-static {}, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۢ۠ۨ۟()I

    move-result v4

    if-ltz v4, :cond_65

    const-string v4, "\u06df\u06e5\u06e6"

    invoke-static {v4}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_65
    sget v4, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v12, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sub-int/2addr v4, v12

    const v12, 0x1ab5d4

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_83
    const/16 v4, 0xd3

    move/from16 v0, v28

    if-eq v0, v4, :cond_58

    const/16 v4, 0xd4

    move/from16 v0, v28

    if-eq v0, v4, :cond_1a

    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    move-result v4

    if-gtz v4, :cond_66

    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    const-string v4, "\u06e2\u06e3\u06e7"

    move-object v12, v4

    move-object/from16 v16, v50

    :goto_2d
    invoke-static {v12}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v50, v16

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_66
    sget v4, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v12, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    xor-int/2addr v4, v12

    const v12, 0x1aafff

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_84
    sget v4, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v12, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    or-int/2addr v4, v12

    const v12, 0x1ac64b

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_85
    move-object/from16 v4, v40

    :cond_67
    invoke-static {}, Landroidx/versionedparcelable/ۣۢۥ;->ۦۦۡۤ()I

    move-result v12

    if-gtz v12, :cond_68

    const/4 v12, 0x0

    sput v12, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    const-string v12, "\u06e4\u06e6\u06df"

    invoke-static {v12}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v40, v4

    move/from16 v70, v12

    goto/16 :goto_0

    :cond_68
    sget v12, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v16, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sub-int v12, v12, v16

    const v16, 0x1ab7f5

    xor-int v12, v12, v16

    move-object/from16 v40, v4

    move/from16 v70, v12

    goto/16 :goto_0

    :cond_69
    :sswitch_86
    sget v4, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v12, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    rem-int/2addr v4, v12

    const v12, 0x1aaf7e

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_87
    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    move-result v4

    if-ltz v4, :cond_6a

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    const-string v4, "\u06e1\u06df\u06df"

    invoke-static {v4}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v66, v67

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_6a
    sget v4, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v12, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    rem-int/2addr v4, v12

    const v12, 0x1ab48b

    add-int/2addr v4, v12

    move-object/from16 v66, v67

    move/from16 v70, v4

    goto/16 :goto_0

    :pswitch_1
    :sswitch_88
    sget v4, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    if-ltz v4, :cond_6b

    const/16 v4, 0x4a

    sput v4, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    const-string v4, "\u06e3\u06e5\u06e2"

    goto/16 :goto_4

    :cond_6b
    const-string v4, "\u06e8\u06e3\u06e7"

    goto/16 :goto_10

    :sswitch_89
    :try_start_2a
    move-object/from16 v0, v55

    iget-object v4, v0, Li00;->b:Ljava/lang/Object;

    check-cast v4, Ljava/util/LinkedList;

    invoke-virtual {v4}, Ljava/util/LinkedList;->size()I

    move-result v12

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v16, "\ud83d\udd0d \u6355\u83b7\u5230 "

    move-object/from16 v0, v16

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_7

    sget v16, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    if-ltz v16, :cond_6c

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    const-string v16, "\u06e4\u06e2"

    invoke-static/range {v16 .. v16}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v16

    move-object/from16 v60, v4

    move/from16 v69, v12

    move/from16 v70, v16

    goto/16 :goto_0

    :cond_6c
    sget v16, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v60, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    xor-int v16, v16, v60

    const v60, 0x1ab534

    xor-int v16, v16, v60

    move-object/from16 v60, v4

    move/from16 v69, v12

    move/from16 v70, v16

    goto/16 :goto_0

    :sswitch_8a
    sget v4, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v12, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    or-int/lit16 v12, v12, 0x1efe

    or-int/2addr v4, v12

    if-ltz v4, :cond_6d

    const/16 v4, 0x39

    sput v4, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    move/from16 v36, v51

    goto/16 :goto_11

    :cond_6d
    sget v4, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v12, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    div-int/2addr v4, v12

    const v12, 0x1aabd7

    add-int/2addr v4, v12

    move/from16 v70, v4

    move/from16 v36, v51

    goto/16 :goto_0

    :sswitch_8b
    if-eqz v26, :cond_85

    sget v4, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    if-ltz v4, :cond_6e

    const/16 v4, 0x29

    sput v4, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    const-string v4, "\u06e1\u06e0\u06df"

    invoke-static {v4}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_6e
    const-string v4, "\u06e0\u06e4"

    goto/16 :goto_1

    :sswitch_8c
    move-object/from16 v0, p0

    iget v0, v0, Lfs;->a:I

    move/from16 v17, v0

    move-object/from16 v0, p0

    iget-object v4, v0, Lfs;->b:Ljava/lang/ClassLoader;

    const/4 v15, 0x0

    sget v12, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v16, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    move/from16 v0, v16

    add-int/lit16 v0, v0, 0xf9a

    move/from16 v16, v0

    sub-int v12, v12, v16

    if-ltz v12, :cond_6f

    const/16 v12, 0x57

    sput v12, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    const-string v12, "\u06e4\u06e3\u06df"

    move-object/from16 v16, v15

    move/from16 v20, v17

    goto/16 :goto_1e

    :cond_6f
    const-string v12, "\u06e4\u06e5\u06e8"

    move-object/from16 v16, v15

    move/from16 v20, v17

    goto/16 :goto_5

    :sswitch_8d
    sget v4, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v12, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    or-int/lit16 v12, v12, 0xd7c

    div-int/2addr v4, v12

    if-eqz v4, :cond_70

    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    const-string v4, "\u06e2\u06df\u06e1"

    invoke-static {v4}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_70
    const-string v4, "\u06e8\u06e3\u06e2"

    :goto_2e
    invoke-static {v4}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_8e
    :try_start_2b
    move-object/from16 v0, v60

    move/from16 v1, v69

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_7

    sget v4, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    if-ltz v4, :cond_71

    const-string v4, "\u06e8\u06e2"

    goto/16 :goto_29

    :cond_71
    sget v4, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v12, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    div-int/2addr v4, v12

    const v12, 0x1ab648

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_8f
    const-string v4, "\u06e1\u06df\u06df"

    move/from16 v26, v31

    goto/16 :goto_19

    :sswitch_90
    sget v4, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v12, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    mul-int/lit16 v12, v12, -0x2427

    div-int/2addr v4, v12

    if-eqz v4, :cond_72

    const-string v4, "\u06e7\u06e6"

    goto/16 :goto_1d

    :cond_72
    const-string v4, "\u06e2\u06e8\u06e7"

    invoke-static {v4}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_91
    sget v4, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v12, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    mul-int/lit16 v12, v12, 0xed5

    or-int/2addr v4, v12

    if-gtz v4, :cond_73

    const/16 v4, 0x59

    sput v4, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    const-string v4, "\u06e6\u06e2\u06df"

    invoke-static {v4}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_73
    const-string v4, "\u06e1\u06e0\u06e8"

    goto/16 :goto_19

    :sswitch_92
    const/16 v51, 0x0

    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    move-result v4

    if-gtz v4, :cond_75

    const/16 v4, 0x5a

    sput v4, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    :cond_74
    const-string v4, "\u06e2\u06e6\u06e3"

    invoke-static {v4}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_75
    sget v4, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v12, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    or-int/2addr v4, v12

    const v12, 0x1ab703

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_93
    :try_start_2c
    instance-of v4, v5, Ljava/util/LinkedList;
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_2

    if-eqz v4, :cond_0

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v12, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    add-int/lit16 v12, v12, 0x14d6

    xor-int/2addr v4, v12

    if-gtz v4, :cond_76

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    const-string v4, "\u06e7\u06e6\u06e7"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_76
    sget v4, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v12, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    or-int/2addr v4, v12

    const v12, 0x1abfc8

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_94
    :try_start_2d
    instance-of v4, v8, Lorg/json/JSONObject;

    if-eqz v4, :cond_2f

    move-object v0, v8

    check-cast v0, Lorg/json/JSONObject;

    move-object v4, v0
    :try_end_2d
    .catchall {:try_start_2d .. :try_end_2d} :catchall_0

    sget v12, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v16, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    move/from16 v0, v16

    rem-int/lit16 v0, v0, -0xaa1

    move/from16 v16, v0

    xor-int v12, v12, v16

    if-gtz v12, :cond_77

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    const-string v12, "\u06e8\u06e8\u06e3"

    invoke-static {v12}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v38, v4

    move/from16 v70, v12

    goto/16 :goto_0

    :cond_77
    const-string v12, "\u06e3\u06e5\u06e7"

    move-object/from16 v38, v4

    goto/16 :goto_20

    :catchall_5
    move-exception v4

    sget v4, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v12, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    rem-int/lit16 v12, v12, 0x13df

    rem-int/2addr v4, v12

    if-ltz v4, :cond_78

    const-string v4, "\u06e2\u06e8\u06e7"

    invoke-static {v4}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_78
    sget v4, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v12, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    or-int/2addr v4, v12

    const v12, 0x1ac290

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_79
    :sswitch_95
    const-string v4, "\u06e1\u06e2\u06e4"

    invoke-static {v4}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_96
    :try_start_2e
    invoke-virtual/range {v63 .. v63}, Ljava/lang/String;->length()I
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_0

    move-result v4

    if-lez v4, :cond_37

    const/16 v16, 0x1

    sget v4, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    if-ltz v4, :cond_7a

    const/16 v4, 0x44

    sput v4, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    const-string v4, "\u06e7\u06e4\u06e2"

    invoke-static {v4}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    move/from16 v27, v16

    goto/16 :goto_0

    :cond_7a
    const-string v4, "\u06e4\u06df\u06e2"

    move-object v12, v4

    goto/16 :goto_12

    :sswitch_97
    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    move-result v4

    if-gtz v4, :cond_7b

    const-string v4, "\u06e1\u06e3\u06e0"

    move/from16 v36, v27

    goto/16 :goto_24

    :cond_7b
    const-string v4, "\u06df\u06e1\u06df"

    move/from16 v12, v27

    goto/16 :goto_1b

    :catchall_6
    move-exception v4

    :try_start_2f
    const-string v4, "Q4wS\n"

    const-string v12, "AsBeospW0AQ=\n"

    invoke-static {v4, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_2f
    .catchall {:try_start_2f .. :try_end_2f} :catchall_7

    invoke-static {}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۢۨۤ۟()I

    move-result v4

    if-gtz v4, :cond_7c

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۣۡۧۢ()I

    const-string v4, "\u06e0\u06e2\u06e6"

    invoke-static {v4}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_7c
    const-string v4, "\u06e8\u06e2"

    goto/16 :goto_18

    :sswitch_98
    :try_start_30
    instance-of v4, v9, Ljava/lang/Integer;

    if-eqz v4, :cond_2a

    move-object v0, v9

    check-cast v0, Ljava/lang/Integer;

    move-object v4, v0
    :try_end_30
    .catchall {:try_start_30 .. :try_end_30} :catchall_0

    sget v12, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v16, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    move/from16 v0, v16

    xor-int/lit16 v0, v0, -0x14ce

    move/from16 v16, v0

    rem-int v12, v12, v16

    if-gtz v12, :cond_7d

    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    const-string v12, "\u06e5\u06e8\u06e1"

    invoke-static {v12}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v50, v4

    move/from16 v70, v12

    goto/16 :goto_0

    :cond_7d
    const-string v12, "\u06e1\u06e6\u06e3"

    move-object/from16 v16, v4

    goto/16 :goto_2d

    :cond_7e
    :sswitch_99
    sget v4, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v12, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    or-int/2addr v4, v12

    const v12, -0x1aa4fe

    xor-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_9a
    :try_start_31
    move-object/from16 v0, v49

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_31
    .catchall {:try_start_31 .. :try_end_31} :catchall_7

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    move-result v4

    if-gtz v4, :cond_7f

    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    const-string v4, "\u06e4\u06e6\u06e3"

    invoke-static {v4}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_7f
    sget v4, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v12, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    mul-int/2addr v4, v12

    const v12, 0x2046d5

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_9b
    const/16 v52, 0x0

    sget v4, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    if-gtz v4, :cond_80

    const-string v4, "\u06e0\u06e7\u06e6"

    invoke-static {v4}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_80
    const-string v12, "\u06e1\u06df\u06e2"

    move-object v4, v15

    move-object/from16 v16, v17

    goto/16 :goto_1e

    :catchall_7
    move-exception v4

    const-string v4, "Nwje\n"

    const-string v12, "Q2m5jaPP2Zc=\n"

    const-string v16, "spCCAhWCphWTlbkjH52OM4+QlD41hKMVkw==\n"

    const-string v70, "4f7xTHD20Xo=\n"

    move-object/from16 v0, v16

    move-object/from16 v1, v70

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    const-string v70, "Fg==\n"

    const-string v73, "c8HJlSTQVfc=\n"

    move-object/from16 v0, v16

    move-object/from16 v1, v70

    move-object/from16 v2, v73

    invoke-static {v4, v12, v0, v1, v2}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget v4, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    if-gtz v4, :cond_74

    invoke-static {}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۦۧۢ۟()I

    const-string v4, "\u06e2\u06e5\u06e7"

    invoke-static {v4}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :pswitch_2
    :sswitch_9c
    sget v4, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    if-gtz v4, :cond_81

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    const-string v4, "\u06e1\u06e6\u06e8"

    goto/16 :goto_2c

    :cond_81
    const-string v4, "\u06e0\u06e0\u06e0"

    invoke-static {v4}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_9d
    if-eqz v21, :cond_69

    sget v4, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v12, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    rem-int/2addr v4, v12

    const v12, 0x1ac988

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_9e
    sget v4, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v12, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    rem-int/lit16 v12, v12, 0x75f

    div-int/2addr v4, v12

    if-ltz v4, :cond_82

    const/16 v4, 0x3b

    sput v4, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    const-string v4, "\u06e0\u06e8\u06e8"

    goto/16 :goto_2e

    :cond_82
    const-string v4, "\u06e2\u06e1\u06e1"

    goto/16 :goto_9

    :sswitch_9f
    :try_start_32
    sget-object v4, Lpb0;->z:Ljava/lang/String;

    move-object/from16 v0, v43

    invoke-static {v0, v4}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_32
    .catchall {:try_start_32 .. :try_end_32} :catchall_0

    move-result-object v11

    sget v4, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v12, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    rem-int/2addr v4, v12

    const v12, 0x1aaa9f

    xor-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_a0
    :try_start_33
    const-string v4, "wP2t3iWpA0TA57WSZ69CSc/7tZJxpUJEwebs3HCmDgra8bHXJaENXsLhr5xMpBY=\n"

    const-string v12, "rojBsgXKYio=\n"

    invoke-static {v4, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v10}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v0, v10

    check-cast v0, Ljava/lang/Integer;

    move-object v4, v0

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I
    :try_end_33
    .catchall {:try_start_33 .. :try_end_33} :catchall_5

    move-result v12

    sget v4, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v16, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    move/from16 v0, v16

    or-int/lit16 v0, v0, 0x4ea

    move/from16 v16, v0

    add-int v4, v4, v16

    if-gtz v4, :cond_83

    const/16 v4, 0xa

    sput v4, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    move/from16 v4, v53

    :goto_2f
    const-string v16, "\u06e7\u06e3\u06df"

    invoke-static/range {v16 .. v16}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v16

    move/from16 v28, v12

    move/from16 v70, v16

    move/from16 v53, v4

    goto/16 :goto_0

    :cond_83
    const-string v4, "\u06e6\u06e8\u06df"

    goto/16 :goto_14

    :sswitch_a1
    const-string v4, "\u06e0\u06e1\u06e0"

    goto/16 :goto_17

    :sswitch_a2
    :try_start_34
    sget-object v4, Lgn;->a:Lgn;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, Lgn;->i:Lid;
    :try_end_34
    .catchall {:try_start_34 .. :try_end_34} :catchall_7

    sget v4, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v16, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    move/from16 v0, v16

    or-int/lit16 v0, v0, 0xa75

    move/from16 v16, v0

    add-int v4, v4, v16

    if-gtz v4, :cond_84

    const/16 v4, 0x3d

    sput v4, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    const-string v4, "\u06df\u06e2\u06e4"

    goto/16 :goto_f

    :cond_84
    sget v4, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v16, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    add-int v4, v4, v16

    const v16, 0x1aadfd

    xor-int v4, v4, v16

    move-object/from16 v54, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_a3
    :try_start_35
    instance-of v4, v11, Ljava/lang/String;

    if-eqz v4, :cond_34

    move-object v0, v11

    check-cast v0, Ljava/lang/String;

    move-object v4, v0
    :try_end_35
    .catchall {:try_start_35 .. :try_end_35} :catchall_0

    const-string v12, "\u06e8\u06e3\u06e1"

    move-object/from16 v16, v4

    :goto_30
    invoke-static {v12}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v56, v16

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_85
    :sswitch_a4
    const-string v4, "\u06e0\u06e2\u06e3"

    move/from16 v12, v26

    goto/16 :goto_7

    :sswitch_a5
    sget v4, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v12, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    mul-int/2addr v4, v12

    const v12, 0x1b08a7

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_a6
    :try_start_36
    move-object/from16 v0, v35

    move-object/from16 v1, v55

    iput-object v0, v1, Li00;->b:Ljava/lang/Object;
    :try_end_36
    .catchall {:try_start_36 .. :try_end_36} :catchall_7

    sget v4, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v12, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    xor-int/lit16 v12, v12, -0x1bac

    rem-int/2addr v4, v12

    if-ltz v4, :cond_86

    const-string v4, "\u06e4\u06e1\u06e0"

    invoke-static {v4}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_86
    const-string v4, "\u06df\u06e8\u06e3"

    invoke-static {v4}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_87
    :sswitch_a7
    sget v4, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v12, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    add-int/lit16 v12, v12, -0x1d1d

    rem-int/2addr v4, v12

    if-ltz v4, :cond_88

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    const-string v4, "\u06e1\u06e6"

    invoke-static {v4}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_88
    sget v4, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v12, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sub-int/2addr v4, v12

    const v12, 0x1ab643

    xor-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_a8
    :try_start_37
    const-string v4, "fESSfZTqTLt8Xoox1uwNtnNCijHA5g27fV/Tf8HlQfVmSI50lOJCoX5YkD/n/V+8fFY=\n"

    const-string v12, "EjH+EbSJLdU=\n"

    invoke-static {v4, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v6}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_37
    .catchall {:try_start_37 .. :try_end_37} :catchall_6

    sget v4, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v12, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    rem-int/lit16 v12, v12, 0x1778

    div-int/2addr v4, v12

    if-ltz v4, :cond_89

    const/16 v4, 0x39

    sput v4, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    const-string v4, "\u06e5\u06e2\u06e8"

    invoke-static {v4}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_89
    const-string v4, "\u06e1\u06e1\u06e7"

    invoke-static {v4}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_a9
    const/16 v31, 0x0

    sget v4, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v12, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    add-int/lit16 v12, v12, 0xc1

    xor-int/2addr v4, v12

    if-ltz v4, :cond_8a

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    const-string v4, "\u06e1\u06e8\u06e5"

    invoke-static {v4}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_8a
    const-string v4, "\u06e2\u06e1\u06e7"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_aa
    :try_start_38
    sget-object v4, Lpb0;->V0:Ljava/lang/String;

    move-object/from16 v0, v37

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_38
    .catchall {:try_start_38 .. :try_end_38} :catchall_0

    move-result-object v4

    invoke-static {}, Lۣ۟ۢ۠۠;->۠۟ۥ۠()I

    move-result v12

    if-gtz v12, :cond_8b

    const/16 v12, 0x26

    sput v12, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    const-string v12, "\u06e1\u06e6\u06e7"

    invoke-static {v12}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v63, v4

    move/from16 v70, v12

    goto/16 :goto_0

    :cond_8b
    const-string v12, "\u06e3\u06df\u06e7"

    invoke-static {v12}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v63, v4

    move/from16 v70, v12

    goto/16 :goto_0

    :sswitch_ab
    sget v4, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v12, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    add-int/lit16 v12, v12, -0x18be

    rem-int/2addr v4, v12

    if-ltz v4, :cond_8c

    const/16 v4, 0x12

    sput v4, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    const-string v4, "\u06e8\u06e7\u06e7"

    invoke-static {v4}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v70, v4

    goto/16 :goto_0

    :cond_8c
    sget v4, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v12, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    xor-int/2addr v4, v12

    const v12, 0x1ab4c5

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_ac
    const/4 v4, 0x1

    sget v12, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v16, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    move/from16 v0, v16

    div-int/lit16 v0, v0, -0x14a2

    move/from16 v16, v0

    or-int v12, v12, v16

    if-gtz v12, :cond_8d

    const-string v12, "\u06e3\u06e8\u06df"

    invoke-static {v12}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v12

    move/from16 v70, v12

    move/from16 v53, v4

    goto/16 :goto_0

    :cond_8d
    move/from16 v12, v28

    goto/16 :goto_2f

    :sswitch_ad
    const/16 v72, 0x0

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v12, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    rem-int/2addr v4, v12

    const v12, 0x1aa8da

    xor-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_ae
    :try_start_39
    invoke-static/range {v42 .. v42}, Lhs;->c(Ljava/lang/String;)Z
    :try_end_39
    .catchall {:try_start_39 .. :try_end_39} :catchall_0

    move-result v12

    move-object/from16 v4, v45

    goto/16 :goto_28

    :sswitch_af
    :try_start_3a
    const-string v4, " \u6761\u4e0b\u53d1\u6570\u636e\uff0c\u6267\u884c\u70b9\u8d5e\u5224\u5b9a..."

    move-object/from16 v0, v60

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {v60 .. v60}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_3a
    .catchall {:try_start_3a .. :try_end_3a} :catchall_7

    move-result-object v4

    sget v12, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v16, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    move/from16 v0, v16

    xor-int/lit16 v0, v0, -0x1546

    move/from16 v16, v0

    or-int v12, v12, v16

    if-gtz v12, :cond_8e

    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    const-string v12, "\u06e7\u06e6\u06e1"

    invoke-static {v12}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v62, v4

    move/from16 v70, v12

    goto/16 :goto_0

    :cond_8e
    sget v12, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v16, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    rem-int v12, v12, v16

    const v16, -0x1ac180

    xor-int v12, v12, v16

    move-object/from16 v62, v4

    move/from16 v70, v12

    goto/16 :goto_0

    :pswitch_3
    :sswitch_b0
    sget v4, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    if-gtz v4, :cond_8f

    const/16 v4, 0x48

    sput v4, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    const-string v4, "\u06e6\u06e0\u06e4"

    move-object/from16 v12, v55

    goto/16 :goto_d

    :cond_8f
    sget v4, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v12, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    div-int/2addr v4, v12

    const v12, 0x1aaf1f

    add-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_b1
    sget v4, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v12, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    div-int/2addr v4, v12

    const v12, 0x1aba60

    xor-int/2addr v4, v12

    move-object/from16 v19, v56

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_b2
    sget v4, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v12, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    mul-int/lit16 v12, v12, 0x1002

    xor-int/2addr v4, v12

    if-gtz v4, :cond_90

    const-string v4, "\u06e0\u06df\u06e7"

    move-object v12, v4

    move-object/from16 v16, v56

    goto/16 :goto_30

    :cond_90
    sget v4, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v12, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    mul-int/2addr v4, v12

    const v12, -0x1a30de

    xor-int/2addr v4, v12

    move/from16 v70, v4

    goto/16 :goto_0

    :sswitch_b3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc04 -> :sswitch_0
        0xdc06 -> :sswitch_a7
        0xdc21 -> :sswitch_a6
        0xdc24 -> :sswitch_59
        0xdc26 -> :sswitch_a0
        0xdc45 -> :sswitch_aa
        0xdc61 -> :sswitch_a5
        0xdc7b -> :sswitch_86
        0xdc7e -> :sswitch_16
        0xdc81 -> :sswitch_b
        0xdc9b -> :sswitch_3
        0xdcd9 -> :sswitch_8c
        0xdcda -> :sswitch_5d
        0xdcde -> :sswitch_30
        0xdce0 -> :sswitch_63
        0xdcfa -> :sswitch_2f
        0xdcfb -> :sswitch_6c
        0xdcff -> :sswitch_90
        0x1aa707 -> :sswitch_96
        0x1aa73d -> :sswitch_8d
        0x1aa761 -> :sswitch_ac
        0x1aa782 -> :sswitch_81
        0x1aa79d -> :sswitch_5f
        0x1aa7c0 -> :sswitch_b3
        0x1aa7d9 -> :sswitch_26
        0x1aa7df -> :sswitch_84
        0x1aa7f9 -> :sswitch_7e
        0x1aa817 -> :sswitch_25
        0x1aa818 -> :sswitch_4a
        0x1aa81a -> :sswitch_56
        0x1aaac1 -> :sswitch_6f
        0x1aaac8 -> :sswitch_5e
        0x1aaae0 -> :sswitch_71
        0x1aaaff -> :sswitch_1d
        0x1aab21 -> :sswitch_54
        0x1aab23 -> :sswitch_64
        0x1aab24 -> :sswitch_67
        0x1aab3d -> :sswitch_9
        0x1aab60 -> :sswitch_ab
        0x1aab63 -> :sswitch_6e
        0x1aab7b -> :sswitch_5
        0x1aab7d -> :sswitch_34
        0x1aab7f -> :sswitch_86
        0x1aab9a -> :sswitch_a2
        0x1aabbf -> :sswitch_79
        0x1aabd7 -> :sswitch_7a
        0x1aabdc -> :sswitch_99
        0x1aae81 -> :sswitch_8b
        0x1aae82 -> :sswitch_87
        0x1aae84 -> :sswitch_47
        0x1aaea0 -> :sswitch_76
        0x1aaea1 -> :sswitch_6b
        0x1aaea4 -> :sswitch_1
        0x1aaea6 -> :sswitch_5d
        0x1aaea9 -> :sswitch_e
        0x1aaec0 -> :sswitch_86
        0x1aaec1 -> :sswitch_7b
        0x1aaec7 -> :sswitch_4f
        0x1aaee0 -> :sswitch_3d
        0x1aaee3 -> :sswitch_9d
        0x1aaee6 -> :sswitch_b3
        0x1aaefe -> :sswitch_a4
        0x1aaf06 -> :sswitch_50
        0x1aaf1c -> :sswitch_1
        0x1aaf1f -> :sswitch_43
        0x1aaf22 -> :sswitch_24
        0x1aaf23 -> :sswitch_3c
        0x1aaf5a -> :sswitch_10
        0x1aaf5e -> :sswitch_75
        0x1aaf62 -> :sswitch_18
        0x1aaf7c -> :sswitch_12
        0x1aaf9e -> :sswitch_23
        0x1ab242 -> :sswitch_95
        0x1ab243 -> :sswitch_ad
        0x1ab244 -> :sswitch_4c
        0x1ab246 -> :sswitch_a
        0x1ab247 -> :sswitch_91
        0x1ab261 -> :sswitch_9c
        0x1ab269 -> :sswitch_32
        0x1ab26a -> :sswitch_a1
        0x1ab282 -> :sswitch_8
        0x1ab288 -> :sswitch_8f
        0x1ab289 -> :sswitch_c
        0x1ab29f -> :sswitch_5a
        0x1ab2c0 -> :sswitch_73
        0x1ab2c4 -> :sswitch_82
        0x1ab2c5 -> :sswitch_a9
        0x1ab2c6 -> :sswitch_f
        0x1ab2e3 -> :sswitch_b0
        0x1ab2fd -> :sswitch_22
        0x1ab2ff -> :sswitch_2b
        0x1ab302 -> :sswitch_3
        0x1ab304 -> :sswitch_88
        0x1ab31d -> :sswitch_3b
        0x1ab31f -> :sswitch_86
        0x1ab33e -> :sswitch_15
        0x1ab340 -> :sswitch_35
        0x1ab35a -> :sswitch_1a
        0x1ab35c -> :sswitch_31
        0x1ab361 -> :sswitch_60
        0x1ab603 -> :sswitch_4e
        0x1ab60b -> :sswitch_68
        0x1ab624 -> :sswitch_2c
        0x1ab625 -> :sswitch_8e
        0x1ab641 -> :sswitch_3
        0x1ab643 -> :sswitch_5c
        0x1ab644 -> :sswitch_af
        0x1ab647 -> :sswitch_65
        0x1ab649 -> :sswitch_45
        0x1ab660 -> :sswitch_62
        0x1ab680 -> :sswitch_3
        0x1ab687 -> :sswitch_13
        0x1ab688 -> :sswitch_44
        0x1ab6a7 -> :sswitch_37
        0x1ab6c5 -> :sswitch_4b
        0x1ab6c6 -> :sswitch_1f
        0x1ab6de -> :sswitch_8a
        0x1ab6e2 -> :sswitch_4
        0x1ab6e5 -> :sswitch_46
        0x1ab6ff -> :sswitch_78
        0x1ab701 -> :sswitch_58
        0x1ab71a -> :sswitch_93
        0x1ab71b -> :sswitch_a8
        0x1ab720 -> :sswitch_41
        0x1ab723 -> :sswitch_9a
        0x1ab9c6 -> :sswitch_42
        0x1ab9c7 -> :sswitch_97
        0x1ab9c8 -> :sswitch_3e
        0x1ab9cd -> :sswitch_d
        0x1ab9e5 -> :sswitch_14
        0x1ab9e7 -> :sswitch_20
        0x1ab9eb -> :sswitch_29
        0x1aba03 -> :sswitch_30
        0x1aba05 -> :sswitch_17
        0x1aba26 -> :sswitch_6a
        0x1aba29 -> :sswitch_34
        0x1aba2a -> :sswitch_1e
        0x1aba40 -> :sswitch_9b
        0x1aba48 -> :sswitch_65
        0x1aba61 -> :sswitch_3f
        0x1aba63 -> :sswitch_2f
        0x1aba67 -> :sswitch_37
        0x1aba80 -> :sswitch_57
        0x1aba87 -> :sswitch_1b
        0x1aba9e -> :sswitch_41
        0x1abaa0 -> :sswitch_85
        0x1abaa1 -> :sswitch_36
        0x1abaa2 -> :sswitch_92
        0x1abae1 -> :sswitch_40
        0x1abd87 -> :sswitch_7f
        0x1abd8d -> :sswitch_11
        0x1abda6 -> :sswitch_66
        0x1abdab -> :sswitch_77
        0x1abde7 -> :sswitch_28
        0x1abdeb -> :sswitch_57
        0x1abe02 -> :sswitch_86
        0x1abe03 -> :sswitch_b3
        0x1abe07 -> :sswitch_3
        0x1abe08 -> :sswitch_98
        0x1abe23 -> :sswitch_53
        0x1abe3f -> :sswitch_21
        0x1abe41 -> :sswitch_78
        0x1abe60 -> :sswitch_22
        0x1abe65 -> :sswitch_72
        0x1abe7d -> :sswitch_a3
        0x1abe9e -> :sswitch_33
        0x1abea0 -> :sswitch_6d
        0x1ac167 -> :sswitch_49
        0x1ac189 -> :sswitch_51
        0x1ac1a5 -> :sswitch_48
        0x1ac1a8 -> :sswitch_2d
        0x1ac1aa -> :sswitch_86
        0x1ac1ac -> :sswitch_7c
        0x1ac1e2 -> :sswitch_86
        0x1ac1e5 -> :sswitch_94
        0x1ac1e6 -> :sswitch_3
        0x1ac1e8 -> :sswitch_19
        0x1ac221 -> :sswitch_70
        0x1ac224 -> :sswitch_69
        0x1ac225 -> :sswitch_80
        0x1ac228 -> :sswitch_5b
        0x1ac25d -> :sswitch_6
        0x1ac261 -> :sswitch_7
        0x1ac50c -> :sswitch_2a
        0x1ac52c -> :sswitch_9e
        0x1ac52f -> :sswitch_a7
        0x1ac583 -> :sswitch_74
        0x1ac58c -> :sswitch_38
        0x1ac5a5 -> :sswitch_99
        0x1ac5a9 -> :sswitch_27
        0x1ac5e2 -> :sswitch_1c
        0x1ac5e6 -> :sswitch_ae
        0x1ac5e8 -> :sswitch_37
        0x1ac624 -> :sswitch_b2
        0x1ac8d1 -> :sswitch_61
        0x1ac907 -> :sswitch_89
        0x1ac926 -> :sswitch_9f
        0x1ac92c -> :sswitch_55
        0x1ac946 -> :sswitch_b1
        0x1ac947 -> :sswitch_a5
        0x1ac94c -> :sswitch_4d
        0x1ac968 -> :sswitch_83
        0x1ac986 -> :sswitch_22
        0x1ac988 -> :sswitch_2
        0x1ac9a6 -> :sswitch_3a
        0x1ac9c0 -> :sswitch_7d
        0x1ac9c7 -> :sswitch_2e
        0x1ac9e3 -> :sswitch_39
        0x1ac9e8 -> :sswitch_52
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xd2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 13

    iget v0, p0, Lfs;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    const-string v0, "zw==\n"

    const-string v1, "v/tTD73Frj8=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v1, 0x0

    aget-object v0, v0, v1

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_5

    check-cast v0, Ljava/lang/String;

    move-object v5, v0

    :goto_1
    if-eqz v5, :cond_0

    sget-object v0, Lpb0;->C0:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lpb0;->D0:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_1
    const-string v0, "WMFA2h+Lk9xs11f2IYGC2VbQXA==\n"

    const-string v1, "M6Q5hX7l57U=\n"

    sget-object v2, Lgn;->a:Lgn;

    invoke-static {v0, v1, v2}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v0, 0x1

    aget-object v0, v2, v0

    instance-of v1, v0, Landroid/content/ContentValues;

    if-eqz v1, :cond_6

    check-cast v0, Landroid/content/ContentValues;

    move-object v4, v0

    :goto_2
    if-eqz v4, :cond_0

    array-length v0, v2

    const/4 v1, 0x2

    if-le v0, v1, :cond_7

    const/4 v0, 0x2

    aget-object v0, v2, v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_7

    check-cast v0, Ljava/lang/String;

    move-object v1, v0

    :goto_3
    array-length v0, v2

    const/4 v3, 0x3

    if-le v0, v3, :cond_8

    const/4 v0, 0x3

    aget-object v0, v2, v0

    instance-of v2, v0, [Ljava/lang/String;

    if-eqz v2, :cond_8

    check-cast v0, [Ljava/lang/String;

    move-object v2, v0

    :goto_4
    sget-object v0, Lpb0;->C0:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v7, p0, Lfs;->b:Ljava/lang/ClassLoader;

    if-eqz v0, :cond_15

    const-string v0, "MNS2mg==\n"

    const-string v3, "RK3G/wCF85Y=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_5
    const-string v3, "CuAlRsjmI04J6g==\n"

    const-string v8, "eY9QNKuDdzc=\n"

    invoke-static {v3, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    const-string v8, "j5vMN+gzwa+E\n"

    const-string v9, "4/SvVoR1rc4=\n"

    invoke-static {v8, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

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

    invoke-static {v9}, Lbb;->f0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    xor-int/lit8 v3, v0, -0x3

    and-int/2addr v0, v3

    if-nez v0, :cond_a

    const/4 v0, 0x1

    :goto_6
    if-eqz v8, :cond_2

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v8, 0x4

    if-ne v3, v8, :cond_2

    const/4 v0, 0x1

    :cond_2
    if-eqz v0, :cond_3

    const-string v0, "l25aNJh1B0SUZA==\n"

    const-string v3, "5AEvRvsQUz0=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v0, "KKGWvw==\n"

    const-string v3, "XNjm2q76NA0=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v0, "m3zyiJUDfzKQ\n"

    const-string v3, "9xOR6flFE1M=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0x63

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v4, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v0, "4sdVP/GHYg==\n"

    const-string v3, "gag7S5TpFgw=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/ContentValues;->getAsByteArray(Ljava/lang/String;)[B

    move-result-object v3

    if-nez v3, :cond_25

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const-string v8, "Dqu0RCJmV7w=\n"

    const-string v9, "fMrDFVcDJcU=\n"

    invoke-static {v8, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "SELECT content FROM "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, " WHERE "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v10, 0x2

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v10, v11

    const/4 v9, 0x1

    aput-object v2, v10, v9

    invoke-static {v0, v8, v10}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_25

    :try_start_0
    const-string v0, "y8rMDHfi5UnU1s4=\n"

    const-string v9, "pqW6aSONoyA=\n"

    invoke-static {v0, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v9, 0x0

    new-array v9, v9, [Ljava/lang/Object;

    invoke-static {v8, v0, v9}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v9, "Wi+dxi1ay05aNYWKb1yKQ1UphYp5VopOWzTcxHhVxgBAI4HPLVLFVFgzn4RPVsVMUTuf\n"

    const-string v10, "NFrxqg05qiA=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v0}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_24

    const-string v0, "bHiYN7K0ug==\n"

    const-string v3, "Cx3sdd7b2J8=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object v6, v3, v9

    invoke-static {v8, v0, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, [B

    if-eqz v3, :cond_b

    check-cast v0, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_7
    :try_start_1
    const-string v3, "fOdi49M=\n"

    const-string v9, "H4sNkLaoaPk=\n"

    invoke-static {v3, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v9, 0x0

    new-array v9, v9, [Ljava/lang/Object;

    invoke-static {v8, v3, v9}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_e

    :goto_8
    if-eqz v0, :cond_3

    const-string v3, "1CTppqm3Jw==\n"

    const-string v8, "t0uH0szZU74=\n"

    invoke-static {v3, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v7}, Lvh;->k([BLjava/lang/ClassLoader;)[B

    move-result-object v0

    invoke-virtual {v4, v3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    :cond_3
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const-string v3, "eK1akuB2AJdvsQ==\n"

    const-string v8, "DMUz4a8UavI=\n"

    invoke-static {v3, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "BPHdU7eauA==\n"

    const-string v8, "ZYWpIfXv3hA=\n"

    invoke-static {v3, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Landroid/content/ContentValues;->getAsByteArray(Ljava/lang/String;)[B

    move-result-object v3

    if-eqz v3, :cond_0

    :try_start_2
    const-string v8, "AOvSeZGItb8=\n"

    const-string v9, "coqlKOTtx8Y=\n"

    invoke-static {v8, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "SELECT attrBuf FROM "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " WHERE "

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v1, v5

    const/4 v5, 0x1

    aput-object v2, v1, v5

    invoke-static {v0, v8, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result-object v1

    if-eqz v1, :cond_d

    :try_start_3
    const-string v0, "xD42qsrJZkXbIjQ=\n"

    const-string v2, "qVFAz56mICw=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "KZpva0VXCV8pgHcnB1FIUiacdycRW0hfKIEuaRBYBBEzlnNiRV8HRSuGbSknWwddIo5t\n"

    const-string v5, "R+8DB2U0aDE=\n"

    invoke-static {v2, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_c

    const-string v0, "lkWnBUvzqA==\n"

    const-string v2, "8SDTRyecymM=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v6, v2, v5

    invoke-static {v1, v0, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, [B

    if-eqz v2, :cond_c

    check-cast v0, [B
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_9
    :try_start_4
    const-string v2, "LEAGuxM=\n"

    const-string v5, "TyxpyHbeSvI=\n"

    invoke-static {v2, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v1, v2, v5}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_c

    :goto_a
    if-eqz v0, :cond_0

    :try_start_5
    sget-object v1, Lpb0;->j1:Ljava/lang/String;

    invoke-static {v1, v7}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    sget-object v5, Lpb0;->h1:Ljava/lang/String;

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v0, v6, v7

    invoke-static {v2, v5, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v5

    sget-object v0, Lpb0;->h1:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v3, v1, v6

    invoke-static {v5, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lpb0;->k1:Ljava/lang/String;

    invoke-static {v2, v0}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/util/LinkedList;

    if-eqz v1, :cond_e

    check-cast v0, Ljava/util/LinkedList;

    move-object v2, v0

    :goto_b
    if-eqz v2, :cond_0

    sget-object v0, Lpb0;->k1:Ljava/lang/String;

    invoke-static {v5, v0}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/util/LinkedList;

    if-eqz v1, :cond_f

    check-cast v0, Ljava/util/LinkedList;

    move-object v1, v0

    :goto_c
    if-eqz v1, :cond_0

    invoke-virtual {v2}, Ljava/util/LinkedList;->size()I

    move-result v0

    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    move-result v3

    if-le v0, v3, :cond_0

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const-string v0, "rI7G45G5xR/t1I2/2Q==\n"

    const-string v3, "xfqjkfDNqm0=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    const-string v0, "wxmFbt5MkryE\n"

    const-string v6, "rXz9GvZivJI=\n"

    invoke-static {v0, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v0, Lpb0;->m1:Ljava/lang/String;

    invoke-static {v3, v0}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const-string v7, "k0tleDXmoVjSES4kfQ==\n"

    const-string v8, "+j8AClSSzio=\n"

    invoke-static {v7, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v6}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_10

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    const-string v8, "Y8e9ikmYq6Mk\n"

    const-string v9, "DaLF/mG2hY0=\n"

    invoke-static {v8, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v7}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v8, Lpb0;->m1:Ljava/lang/String;

    invoke-static {v7, v8}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    move-result v7

    if-ne v0, v7, :cond_4

    if-eqz v0, :cond_4

    goto :goto_d

    :cond_5
    const/4 v0, 0x0

    move-object v5, v0

    goto/16 :goto_1

    :cond_6
    const/4 v0, 0x0

    move-object v4, v0

    goto/16 :goto_2

    :cond_7
    const/4 v0, 0x0

    move-object v1, v0

    goto/16 :goto_3

    :cond_8
    const/4 v0, 0x0

    move-object v2, v0

    goto/16 :goto_4

    :cond_9
    const/4 v0, 0x0

    goto/16 :goto_5

    :cond_a
    const/4 v0, 0x0

    goto/16 :goto_6

    :cond_b
    const/4 v0, 0x0

    goto/16 :goto_7

    :catchall_0
    move-exception v0

    :try_start_6
    const-string v1, "LU2wCwo=\n"

    const-string v2, "TiHfeG+ny74=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v8, v1, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_d

    :goto_e
    throw v0

    :cond_c
    const/4 v0, 0x0

    goto/16 :goto_9

    :catchall_1
    move-exception v0

    :try_start_7
    const-string v2, "Sm9VDMo=\n"

    const-string v3, "KQM6f683Uvs=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_b

    :goto_f
    :try_start_8
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_2
    move-exception v0

    const-string v0, "Nwje\n"

    const-string v1, "Q2m5jaPP2Zc=\n"

    const-string v2, "Lt/r/CusLKIU1/79KqUo\n"

    const-string v3, "fbGYtUXKQ+Y=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Fg==\n"

    const-string v4, "c8HJlSTQVfc=\n"

    invoke-static {v0, v1, v2, v3, v4}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_d
    const/4 v0, 0x0

    goto/16 :goto_a

    :cond_e
    const/4 v0, 0x0

    move-object v2, v0

    goto/16 :goto_b

    :cond_f
    const/4 v0, 0x0

    move-object v1, v0

    goto/16 :goto_c

    :cond_10
    :try_start_9
    sget-object v0, Lpb0;->l1:Ljava/lang/String;

    invoke-static {v3, v0}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v6, v0, Ljava/lang/String;

    if-eqz v6, :cond_13

    check-cast v0, Ljava/lang/String;

    :goto_10
    if-nez v0, :cond_11

    const-string v0, ""

    :cond_11
    sget-object v6, Lpb0;->e1:Ljava/lang/String;

    const/4 v7, 0x0

    invoke-static {v0, v6, v7}, Lb50;->N(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-nez v6, :cond_12

    sget-object v6, Lpb0;->l1:Ljava/lang/String;

    sget-object v7, Lpb0;->e1:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v6, v0}, Lde/robv/android/xposed/XposedHelpers;->setObjectField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_12
    invoke-virtual {v1, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_d

    :cond_13
    const/4 v0, 0x0

    goto :goto_10

    :cond_14
    sget-object v0, Lpb0;->i1:Ljava/lang/String;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v5, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "2/rZIww+/d/b4MFvTji80tT8wW9YMrzf2uGYIVkx8JHB9sUqDDbzxdnm22FuJOjU9P3HLlU=\n"

    const-string v2, "tY+1TyxdnLE=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v0, [B

    const-string v1, "3Fm6JO5lsg==\n"

    const-string v2, "vS3OVqwQ1Ps=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    goto/16 :goto_0

    :cond_15
    sget-object v0, Lpb0;->D0:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "GsaEsC4oVAgVyI4=\n"

    const-string v1, "eanp3UtGIG4=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const-string v0, "pjZGMj09crCpOEw=\n"

    const-string v1, "xVkrX1hTBtY=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v0, "IO+/zmSjTF4t2Ljp\n"

    const-string v1, "Q5rNjwfXJTE=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/ContentValues;->getAsByteArray(Ljava/lang/String;)[B

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "eHNexxlqzsV1RFng\n"

    const-string v2, "GwYshnoep6o=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v7}, Lvh;->e([BLjava/lang/ClassLoader;)[B

    move-result-object v0

    invoke-virtual {v4, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    goto/16 :goto_0

    :pswitch_1
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v0, "7Q==\n"

    const-string v1, "nYJhS8SV1P0=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v1, 0x0

    aget-object v0, v0, v1

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_1a

    check-cast v0, Ljava/lang/String;

    move-object v2, v0

    :goto_11
    if-eqz v2, :cond_0

    sget-object v0, Lpb0;->C0:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    sget-object v0, Lpb0;->D0:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_16
    const-string v0, "9C/uQ1Z5KiPAOflvaHM7Jvo+8g==\n"

    const-string v1, "n0qXHDcXXko=\n"

    sget-object v5, Lgn;->a:Lgn;

    invoke-static {v0, v1, v5}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v5, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    iget-object v6, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v0, 0x1

    aget-object v0, v6, v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_1b

    check-cast v0, Ljava/lang/String;

    :goto_12
    if-nez v0, :cond_23

    const-string v0, ""

    move-object v1, v0

    :goto_13
    const/4 v0, 0x2

    aget-object v0, v6, v0

    instance-of v6, v0, [Ljava/lang/String;

    if-eqz v6, :cond_1c

    check-cast v0, [Ljava/lang/String;

    :goto_14
    if-eqz v0, :cond_0

    sget-object v6, Lpb0;->C0:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    iget-object v7, p0, Lfs;->b:Ljava/lang/ClassLoader;

    if-eqz v6, :cond_1e

    const-string v6, "gnnAr1Ps/hg=\n"

    const-string v8, "8Bi3/iaJjGE=\n"

    invoke-static {v6, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "SELECT rowid, content FROM "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " WHERE "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v9, 0x0

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v1, v9

    const/4 v8, 0x1

    aput-object v0, v1, v8

    invoke-static {v5, v6, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_19

    :try_start_a
    const-string v0, "5qb4Yu4krD35uvo=\n"

    const-string v6, "i8mOB7pL6lQ=\n"

    invoke-static {v0, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v1, v0, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v6, "c2AFH7H8gQhzeh1T8/rABXxmHVPl8MAIcntEHeTzjEZpbBkWsfSPEnF8B13T8I8KeHQH\n"

    const-string v8, "HRVpc5Gf4GY=\n"

    invoke-static {v6, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_18

    :cond_17
    const-string v0, "ONFxd1RJiQ==\n"

    const-string v6, "X7QFOzsn7gM=\n"

    invoke-static {v0, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v4, v6, v8

    invoke-static {v1, v0, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v6, "zY5tgUk4PEjNlHXNCz59RcKIdc0dNH1IzJUsgxw3MQbXgnGISTAyUs+Sb8MlNDNB\n"

    const-string v8, "o/sB7WlbXSY=\n"

    invoke-static {v6, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    const-string v0, "N+JiDCGq5A==\n"

    const-string v6, "UIcWTk3FhrI=\n"

    invoke-static {v0, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object v3, v6, v10

    invoke-static {v1, v0, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v6, v0, [B

    if-eqz v6, :cond_1d

    check-cast v0, [B

    :goto_15
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    const-string v10, "whkEYwdRuA==\n"

    const-string v11, "oXZqF2I/zPk=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v0, v7}, Lvh;->k([BLjava/lang/ClassLoader;)[B

    move-result-object v0

    invoke-virtual {v6, v10, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    const-string v0, "H+0AcwxWZn8U\n"

    const-string v10, "c4JjEmAQCh4=\n"

    invoke-static {v0, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/16 v10, 0x63

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v6, v0, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v0, "ctsHIA1I\n"

    const-string v10, "B6tjQXktqDE=\n"

    invoke-static {v0, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v10, 0x4

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    aput-object v2, v10, v11

    const/4 v11, 0x1

    aput-object v6, v10, v11

    const/4 v6, 0x2

    const-string v11, "B8PCe96JyQ==\n"

    const-string v12, "day1Erq09iw=\n"

    invoke-static {v11, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v6

    const/4 v6, 0x3

    const/4 v11, 0x1

    new-array v11, v11, [Ljava/lang/String;

    const/4 v12, 0x0

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v11, v12

    aput-object v11, v10, v6

    invoke-static {v5, v0, v10}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "jpKaD7gdktqbiQ==\n"

    const-string v6, "4/3sauxy3L8=\n"

    invoke-static {v0, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v1, v0, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v6, "oYB89ShAKtGhmmS5akZr3K6GZLl8TGvRoJs9931PJ5+7jGD8KEgky6OcfrdKTCTTqpR+\n"

    const-string v8, "z/UQmQgjS78=\n"

    invoke-static {v6, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    move-result v0

    if-nez v0, :cond_17

    :cond_18
    :try_start_b
    const-string v0, "ju+UZ8c=\n"

    const-string v2, "7YP7FKLC508=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    :cond_19
    :goto_16
    invoke-virtual {p1, v3}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_1a
    const/4 v0, 0x0

    move-object v2, v0

    goto/16 :goto_11

    :cond_1b
    const/4 v0, 0x0

    goto/16 :goto_12

    :cond_1c
    const/4 v0, 0x0

    goto/16 :goto_14

    :cond_1d
    const/4 v0, 0x0

    goto/16 :goto_15

    :catchall_3
    move-exception v0

    :try_start_c
    const-string v0, "M7W/+EKPefkFkqLaSKtz4gs=\n"

    const-string v2, "YNvMvCfjHI0=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Nwje\n"

    const-string v4, "Q2m5jaPP2Zc=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "Fg==\n"

    const-string v2, "c8HJlSTQVfc=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    :try_start_d
    const-string v0, "9C1L4gw=\n"

    const-string v2, "l0EkkWkia/s=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    goto :goto_16

    :catchall_4
    move-exception v0

    goto :goto_16

    :catchall_5
    move-exception v0

    :try_start_e
    const-string v2, "NqLllNQ=\n"

    const-string v3, "Vc6K57GC4FE=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_a

    :goto_17
    throw v0

    :cond_1e
    sget-object v6, Lpb0;->D0:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const-string v6, "qtu0Sty0CTI=\n"

    const-string v8, "2LrDG6nRe0s=\n"

    invoke-static {v6, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "SELECT rowid, curActionBuf FROM "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " WHERE "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v9, 0x0

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v1, v9

    const/4 v8, 0x1

    aput-object v0, v1, v8

    invoke-static {v5, v6, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_21

    :try_start_f
    const-string v0, "REj0Bu6Oca5bVPY=\n"

    const-string v6, "KSeCY7rhN8c=\n"

    invoke-static {v0, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v1, v0, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v6, "/goWt7ldP6L+EA77+1t+r/EMDvvtUX6i/xFXtexSMuzkBgq+uVUxuPwWFPXbUTGg9R4U\n"

    const-string v8, "kH9625k+Xsw=\n"

    invoke-static {v6, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_20

    :cond_1f
    const-string v0, "Hp+XV8DY+w==\n"

    const-string v6, "efrjG6+2nDo=\n"

    invoke-static {v0, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v4, v6, v8

    invoke-static {v1, v0, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v6, "6qra9yz68XHqsMK7bvywfOWswrt49rBx67Gb9Xn1/D/wpsb+LPL/a+i22LVA9v54\n"

    const-string v8, "hN+2mwyZkB8=\n"

    invoke-static {v6, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    const-string v0, "cP0gDfgBYg==\n"

    const-string v6, "F5hUT5RuAKo=\n"

    invoke-static {v0, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object v3, v6, v10

    invoke-static {v1, v0, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v6, v0, [B

    if-eqz v6, :cond_22

    check-cast v0, [B

    :goto_18
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    const-string v10, "QDip7IRa0ohND67L\n"

    const-string v11, "I03brecuu+c=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v0, v7}, Lvh;->e([BLjava/lang/ClassLoader;)[B

    move-result-object v0

    invoke-virtual {v6, v10, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    const-string v0, "a0TSixLuNttkStg=\n"

    const-string v10, "CCu/5neAQr0=\n"

    invoke-static {v0, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v0, "xgaX8xSJ\n"

    const-string v10, "s3bzkmDsy7c=\n"

    invoke-static {v0, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v10, 0x4

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    aput-object v2, v10, v11

    const/4 v11, 0x1

    aput-object v6, v10, v11

    const/4 v6, 0x2

    const-string v11, "oG7x7PTtnQ==\n"

    const-string v12, "0gGGhZDQolE=\n"

    invoke-static {v11, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v6

    const/4 v6, 0x3

    const/4 v11, 0x1

    new-array v11, v11, [Ljava/lang/String;

    const/4 v12, 0x0

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v11, v12

    aput-object v11, v10, v6

    invoke-static {v5, v0, v10}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "5o8eHzPH4dvzlA==\n"

    const-string v6, "i+Boemeor74=\n"

    invoke-static {v0, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v1, v0, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v6, "MSBmzRnuGiExOn6BW+hbLD4mfoFN4lshMDsnz0zhF28rLHrEGeYUOzM8ZI974hQjOjRk\n"

    const-string v8, "X1UKoTmNe08=\n"

    invoke-static {v6, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    move-result v0

    if-nez v0, :cond_1f

    :cond_20
    :try_start_10
    const-string v0, "5kmjsFc=\n"

    const-string v2, "hSXMwzJkxhc=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    :cond_21
    :goto_19
    invoke-virtual {p1, v3}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_22
    const/4 v0, 0x0

    goto/16 :goto_18

    :catchall_6
    move-exception v0

    :try_start_11
    const-string v0, "Dpp+B3GF+ug4t2IueYzx6BWbYig=\n"

    const-string v2, "XfQNQxTpn5w=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Nwje\n"

    const-string v4, "Q2m5jaPP2Zc=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "Fg==\n"

    const-string v2, "c8HJlSTQVfc=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    :try_start_12
    const-string v0, "UUh751c=\n"

    const-string v2, "MiQUlDJiWxE=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    goto :goto_19

    :catchall_7
    move-exception v0

    goto :goto_19

    :catchall_8
    move-exception v0

    :try_start_13
    const-string v2, "ehoov3c=\n"

    const-string v3, "GXZHzBJqRl8=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    :goto_1a
    throw v0

    :catchall_9
    move-exception v1

    goto :goto_1a

    :catchall_a
    move-exception v1

    goto/16 :goto_17

    :catchall_b
    move-exception v1

    goto/16 :goto_f

    :catchall_c
    move-exception v1

    goto/16 :goto_a

    :catchall_d
    move-exception v1

    goto/16 :goto_e

    :catchall_e
    move-exception v3

    goto/16 :goto_8

    :cond_23
    move-object v1, v0

    goto/16 :goto_13

    :cond_24
    move-object v0, v3

    goto/16 :goto_7

    :cond_25
    move-object v0, v3

    goto/16 :goto_8

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
