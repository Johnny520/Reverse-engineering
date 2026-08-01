.class public final Lw6;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final a:I

.field public b:Lh40;

.field public c:F

.field public d:Z


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 4

    iput p1, p0, Lw6;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v2, 0x0

    const-string v0, "\u06e8\u06e8\u06e4"

    invoke-static {v0}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    if-gtz v0, :cond_2

    const-string v0, "\u06e5\u06e2\u06e8"

    invoke-static {v0}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    :sswitch_1
    sget v0, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v1, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    div-int/lit16 v1, v1, 0x2223

    mul-int/2addr v0, v1

    if-eqz v0, :cond_1

    const/16 v0, 0x1d

    sput v0, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    const-string v0, "\u06e3\u06e8\u06df"

    invoke-static {v0}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v1, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    or-int/2addr v0, v1

    const v1, 0x1ac7d0

    add-int/2addr v0, v1

    goto :goto_0

    :cond_2
    sget v0, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v1, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    mul-int/2addr v0, v1

    const v1, 0x1a3dc4

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    const-string v0, "4FKmzqGNrKpfmp531cBAY0"

    invoke-static {v0}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟ۢۡۥۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    const-string v0, "\u06e2\u06e3\u06e0"

    :goto_1
    invoke-static {v0}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v2, v3}, Ljava/io/PrintStream;->println(J)V

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    move-result v0

    if-gtz v0, :cond_3

    const/16 v0, 0x31

    sput v0, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    const-string v0, "\u06e8\u06e8\u06e4"

    goto :goto_1

    :cond_3
    sget v0, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sub-int/2addr v0, v1

    const v1, 0x1ac255

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    move-result v0

    if-gtz v0, :cond_0

    sget v0, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v1, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sub-int/2addr v0, v1

    const v1, 0x1ab51f

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aaf1f -> :sswitch_0
        0x1ab2bf -> :sswitch_3
        0x1ab2c7 -> :sswitch_1
        0x1ab666 -> :sswitch_2
        0x1ac586 -> :sswitch_5
        0x1ac9e4 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 39

    const/16 v25, 0x0

    const/4 v14, 0x0

    const/16 v34, 0x0

    const/4 v2, 0x0

    const/4 v13, 0x0

    const/4 v12, 0x0

    const/16 v33, 0x0

    const/16 v24, 0x0

    const/16 v23, 0x0

    const/4 v15, 0x0

    const/16 v28, 0x0

    const/16 v16, 0x0

    const/16 v22, 0x0

    const/16 v31, 0x0

    const/16 v30, 0x0

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v11, 0x0

    const/16 v32, 0x0

    const/16 v36, 0x0

    const/16 v20, 0x0

    const/16 v19, 0x0

    const/16 v27, 0x0

    const/16 v26, 0x0

    const/4 v3, 0x0

    const/16 v21, 0x0

    const/16 v35, 0x0

    const/4 v6, 0x0

    const/4 v5, 0x0

    const/4 v10, 0x0

    const/16 v29, 0x0

    const-string v7, "\u06e4\u06e8\u06e7"

    invoke-static {v7}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v37, v2

    move/from16 v38, v7

    :goto_0
    sparse-switch v38, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    move-object/from16 v2, v32

    :cond_0
    sget v7, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v8, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sub-int/2addr v7, v8

    const v8, -0x1aca73

    xor-int/2addr v7, v8

    move-object/from16 v32, v2

    move/from16 v38, v7

    goto :goto_0

    :sswitch_1
    move-object v2, v4

    :cond_1
    sget v4, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v7, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    or-int/lit16 v7, v7, 0x362

    or-int/2addr v4, v7

    if-ltz v4, :cond_2

    const/16 v4, 0x28

    sput v4, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    const-string v4, "\u06e4\u06e7"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v7

    move-object v4, v2

    move/from16 v38, v7

    goto :goto_0

    :cond_2
    const-string v7, "\u06e7\u06e6"

    move-object v4, v2

    move-object v8, v7

    :goto_1
    invoke-static {v8}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto :goto_0

    :sswitch_2
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    if-eqz v2, :cond_26

    const/4 v7, 0x1

    if-eq v2, v7, :cond_4c

    const/4 v7, 0x2

    if-eq v2, v7, :cond_4b

    const/4 v7, 0x3

    if-eq v2, v7, :cond_4c

    sget v2, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v7, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    mul-int/lit16 v7, v7, -0x1ed3

    sub-int/2addr v2, v7

    if-ltz v2, :cond_3

    const/16 v2, 0x37

    sput v2, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    const-string v2, "\u06df\u06e5\u06e6"

    invoke-static {v2}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto :goto_0

    :cond_3
    sget v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v7, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    xor-int/2addr v2, v7

    const v7, 0x1aadad

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto :goto_0

    :cond_4
    :sswitch_3
    const-string v2, "\u06e1\u06e7\u06e1"

    invoke-static {v2}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto :goto_0

    :sswitch_4
    move-object/from16 v0, p0

    iget-object v2, v0, Lw6;->b:Lh40;

    if-eqz v2, :cond_24

    const-string v7, "\u06e0\u06e4\u06e8"

    move-object/from16 v24, v2

    move-object v8, v7

    goto :goto_1

    :sswitch_5
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lw6;->d:Z

    if-nez v2, :cond_2c

    invoke-virtual/range {v32 .. v32}, Landroid/view/View;->getTranslationY()F

    move-result v2

    const/4 v7, 0x0

    cmpg-float v2, v2, v7

    if-nez v2, :cond_2c

    const-string v2, "\u06e5\u06e7\u06e5"

    invoke-static {v2}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_6
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lw6;->d:Z

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v7, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    add-int/lit16 v7, v7, 0x1d3c

    div-int/2addr v2, v7

    if-eqz v2, :cond_5

    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    const-string v2, "\u06e6\u06e2\u06e8"

    invoke-static {v2}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_5
    sget v2, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v7, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    mul-int/2addr v2, v7

    const v7, 0x186dac

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_6
    move v6, v5

    :goto_2
    sget v5, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    if-gtz v5, :cond_7

    const/16 v5, 0x61

    sput v5, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    const-string v5, "\u06e8\u06df\u06e1"

    move-object v7, v5

    move v8, v2

    :goto_3
    invoke-static {v7}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v2

    move v5, v8

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_7
    sget v5, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v7, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    div-int/2addr v5, v7

    const v7, 0x1ac5ea

    add-int/2addr v7, v5

    move v5, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :sswitch_7
    const/4 v2, 0x0

    invoke-virtual {v11, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v7, v0, Lw6;->b:Lh40;

    if-nez v7, :cond_0

    new-instance v7, Lh40;

    sget-object v8, Lh40;->m:Lqh;

    invoke-direct {v7, v2, v8}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    const/4 v8, 0x0

    const/high16 v17, 0x43160000    # 150.0f

    const v18, 0x3f333333    # 0.7f

    move/from16 v0, v17

    move/from16 v1, v18

    invoke-static {v8, v0, v1}, Lz30;->f(FFF)Li40;

    move-result-object v8

    iput-object v8, v7, Lh40;->j:Li40;

    new-instance v8, Lc6;

    sget v17, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    move/from16 v0, v17

    xor-int/lit16 v0, v0, -0x1f9

    move/from16 v17, v0

    move/from16 v0, v17

    invoke-direct {v8, v2, v0}, Lc6;-><init>(Landroid/view/KeyEvent$Callback;I)V

    invoke-virtual {v7, v8}, Lh40;->a(Lsh;)V

    move-object/from16 v32, v2

    move-object v8, v7

    :goto_4
    const-string v2, "\u06e8\u06e2\u06e6"

    invoke-static {v2}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v36, v8

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_8
    :sswitch_8
    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    move-result v2

    if-gtz v2, :cond_9

    invoke-static {}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۡۢۡۥ()I

    const-string v2, "\u06e5\u06e2\u06e0"

    :goto_5
    invoke-static {v2}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u06e2\u06df\u06e1"

    :goto_6
    invoke-static {v2}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_9
    sget v2, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v7, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    div-int/2addr v2, v7

    const v7, -0x1ab621

    xor-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_a
    sget v2, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    if-gtz v2, :cond_a

    invoke-static {}, Landroidx/core/content/ۣ۟ۧ۠;->۟۟۠ۢۨ()I

    const-string v2, "\u06e2\u06e4"

    invoke-static {v2}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_a
    sget v2, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v7, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    or-int/2addr v2, v7

    const v7, 0x1ac44c

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    move-result v2

    if-gtz v2, :cond_b

    const-string v2, "\u06e0\u06e5\u06e3"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_b
    sget v2, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v7, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    xor-int/2addr v2, v7

    const v7, 0x1aadae

    xor-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_c
    move-object/from16 v0, p0

    iget-object v2, v0, Lw6;->b:Lh40;

    if-eqz v2, :cond_1

    sget v4, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v7, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sub-int/2addr v4, v7

    const v7, 0x1aaf2d

    add-int/2addr v7, v4

    move-object v4, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :sswitch_d
    move-object/from16 v0, p0

    iget v2, v0, Lw6;->a:I

    packed-switch v2, :pswitch_data_0

    :sswitch_e
    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v7, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    add-int/lit16 v7, v7, 0xcfe

    mul-int/2addr v2, v7

    if-ltz v2, :cond_c

    const/16 v2, 0x3a

    sput v2, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    const-string v7, "\u06df\u06e6\u06e8"

    move-object v2, v9

    :goto_7
    invoke-static {v7}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v7

    move-object v9, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :cond_c
    sget v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v7, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    rem-int/2addr v2, v7

    const v7, 0x1aa6d9

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_f
    move-object v2, v10

    :cond_d
    sget v7, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v8, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    add-int/lit16 v8, v8, -0xcf1

    rem-int/2addr v7, v8

    if-ltz v7, :cond_e

    const/16 v7, 0x1f

    sput v7, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    const-string v7, "\u06e8\u06e5\u06e7"

    :goto_8
    invoke-static {v7}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v7

    move-object v10, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :cond_e
    sget v7, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v8, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    xor-int/2addr v7, v8

    const v8, 0x1ab044

    add-int/2addr v7, v8

    move-object v10, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :sswitch_10
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    if-eqz v2, :cond_8b

    const/4 v7, 0x1

    if-eq v2, v7, :cond_3d

    const/4 v7, 0x2

    if-eq v2, v7, :cond_94

    const/4 v7, 0x3

    if-eq v2, v7, :cond_3d

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v7, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    mul-int/2addr v2, v7

    const v7, 0x1b9c25

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_11
    invoke-virtual/range {v29 .. v29}, Lh40;->c()V

    sget v2, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v7, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    or-int/lit16 v7, v7, -0x2398

    mul-int/2addr v2, v7

    if-gtz v2, :cond_f

    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    const-string v2, "\u06e3\u06e2\u06e2"

    :goto_9
    invoke-static {v2}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_f
    sget v2, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v7, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    div-int/2addr v2, v7

    const v7, 0x1abadc

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_12
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lw6;->d:Z

    sget v2, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v7, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    rem-int/lit8 v7, v7, -0x21

    or-int/2addr v2, v7

    if-ltz v2, :cond_10

    const/16 v2, 0x4e

    sput v2, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    const-string v2, "\u06df\u06e1\u06e1"

    invoke-static {v2}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_10
    const-string v2, "\u06e2\u06df\u06e5"

    :goto_a
    invoke-static {v2}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_13
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lw6;->d:Z

    sget v2, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v7, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    or-int/lit16 v7, v7, 0x1cf0

    div-int/2addr v2, v7

    if-gtz v2, :cond_11

    const/16 v2, 0x5b

    sput v2, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    const-string v2, "\u06e7\u06e5"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_11
    const-string v2, "\u06e4\u06e5\u06e8"

    :goto_b
    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_14
    sget v2, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v7, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    xor-int/lit16 v7, v7, -0xfb4

    sub-int/2addr v2, v7

    if-gtz v2, :cond_13

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    :cond_12
    const-string v2, "\u06e3\u06e0"

    :goto_c
    invoke-static {v2}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_13
    sget v2, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v7, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    or-int/2addr v2, v7

    const v7, 0x1aafd2

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_15
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lw6;->d:Z

    sget v2, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v7, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    or-int/lit16 v7, v7, 0xa0c

    add-int/2addr v2, v7

    if-gtz v2, :cond_14

    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    const-string v2, "\u06e2\u06e7\u06e0"

    invoke-static {v2}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_14
    const-string v2, "\u06e7\u06e1\u06e2"

    goto/16 :goto_5

    :sswitch_16
    const-string v2, "9g==\n"

    const-string v7, "gOOTEA9nsvI=\n"

    invoke-static {v2, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "rVdLQmc=\n"

    const-string v7, "yCEuLBOOzGY=\n"

    invoke-static {v2, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p2

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v2, p1

    check-cast v2, Landroid/widget/ScrollView;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v7

    if-nez v7, :cond_67

    sget v7, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v8, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    or-int/lit16 v8, v8, 0x17c8

    or-int/2addr v7, v8

    if-ltz v7, :cond_15

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    :goto_d
    const-string v7, "\u06e5\u06e4\u06e3"

    invoke-static {v7}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v7

    move-object v11, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :cond_15
    const-string v7, "\u06e0\u06e3\u06e0"

    move-object v11, v2

    :goto_e
    invoke-static {v7}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_16
    move v8, v14

    :goto_f
    sget v12, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v13, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    add-int/lit16 v13, v13, -0x2686

    mul-int/2addr v12, v13

    if-gtz v12, :cond_17

    const-string v12, "\u06e4\u06e6\u06e2"

    move-object/from16 v17, v12

    move/from16 v18, v2

    move v13, v7

    move v15, v8

    :goto_10
    invoke-static/range {v17 .. v17}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v12, v18

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_17
    sget v12, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v13, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    or-int/2addr v12, v13

    const v13, 0x1aac9b

    add-int v17, v12, v13

    move v12, v2

    move v13, v7

    move v15, v8

    move/from16 v38, v17

    goto/16 :goto_0

    :sswitch_17
    const/4 v2, 0x0

    cmpg-float v2, v20, v2

    if-gez v2, :cond_6f

    const-string v2, "\u06e7\u06e7\u06df"

    :goto_11
    invoke-static {v2}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_18
    :sswitch_18
    sget v2, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v7, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    div-int/lit16 v7, v7, -0xe8a

    xor-int/2addr v2, v7

    if-gtz v2, :cond_19

    const/16 v2, 0x10

    sput v2, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    const-string v2, "\u06e6\u06e1\u06e3"

    invoke-static {v2}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_19
    const-string v2, "\u06e5\u06e4\u06e3"

    move-object v7, v2

    :goto_12
    invoke-static {v7}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_19
    move/from16 v2, v19

    move/from16 v7, v20

    :cond_1a
    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۣۡۧۢ()I

    move-result v8

    if-gtz v8, :cond_1b

    const-string v8, "\u06e4\u06e8\u06e6"

    invoke-static {v8}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v19, v2

    move/from16 v38, v8

    move/from16 v20, v7

    goto/16 :goto_0

    :cond_1b
    sget v8, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v17, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    mul-int v8, v8, v17

    const v17, 0x130d77

    add-int v8, v8, v17

    move/from16 v19, v2

    move/from16 v38, v8

    move/from16 v20, v7

    goto/16 :goto_0

    :cond_1c
    :sswitch_1a
    const-string v2, "\u06e4\u06e7\u06e0"

    move-object v8, v2

    :goto_13
    invoke-static {v8}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_1b
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lw6;->d:Z

    if-eqz v2, :cond_91

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lw6;->c:F

    const/4 v2, 0x0

    move-object/from16 v0, v21

    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationY(F)V

    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lw6;->d:Z

    sget v2, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v7, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    add-int/lit16 v7, v7, -0x1853

    add-int/2addr v2, v7

    if-ltz v2, :cond_1d

    const/16 v2, 0x16

    sput v2, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    const-string v2, "\u06df\u06e2\u06e0"

    invoke-static {v2}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_1d
    sget v2, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v7, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    div-int/2addr v2, v7

    const v7, 0x1abaa1

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_1c
    move-object/from16 v2, v21

    :cond_1e
    sget v7, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    if-ltz v7, :cond_1f

    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    const-string v7, "\u06e7\u06e4\u06e7"

    move-object/from16 v21, v2

    move-object v8, v7

    goto :goto_13

    :cond_1f
    const-string v7, "\u06e4\u06e0\u06e0"

    :goto_14
    invoke-static {v7}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v21, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :sswitch_1d
    sget v2, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    if-gtz v2, :cond_21

    move-object/from16 v2, v22

    :cond_20
    const-string v7, "\u06e2\u06e0\u06e3"

    invoke-static {v7}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v22, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :cond_21
    const-string v2, "\u06e3\u06e2\u06e2"

    move-object v7, v2

    move v8, v5

    goto/16 :goto_3

    :sswitch_1e
    move-object/from16 v2, v23

    :cond_22
    sget v7, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v8, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    add-int/2addr v7, v8

    const v8, -0x1aa41e

    xor-int/2addr v7, v8

    move-object/from16 v23, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :sswitch_1f
    const/4 v2, 0x0

    cmpl-float v2, v33, v2

    if-gtz v2, :cond_63

    sget v2, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v7, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    or-int/lit16 v7, v7, 0x1c41

    sub-int/2addr v2, v7

    if-ltz v2, :cond_23

    const/4 v2, 0x5

    sput v2, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    const-string v2, "\u06e3\u06e8\u06e5"

    invoke-static {v2}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_23
    sget v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v7, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sub-int/2addr v2, v7

    const v7, 0x1ab95e

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_20
    move-object/from16 v2, v24

    :cond_24
    sget v7, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v8, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    mul-int/lit16 v8, v8, -0x1ba

    div-int/2addr v7, v8

    if-eqz v7, :cond_25

    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    const-string v7, "\u06e7\u06e5\u06e0"

    move-object/from16 v24, v2

    goto/16 :goto_12

    :cond_25
    const-string v7, "\u06e1\u06e7\u06e3"

    invoke-static {v7}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v24, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :cond_26
    :sswitch_21
    invoke-static {}, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۢ۠ۨ۟()I

    move-result v2

    if-ltz v2, :cond_27

    const/16 v2, 0x27

    sput v2, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    const-string v2, "\u06e4\u06e7\u06e7"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_27
    const-string v2, "\u06df\u06e2\u06e5"

    invoke-static {v2}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_22
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lw6;->d:Z

    if-eqz v2, :cond_2b

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lw6;->c:F

    const/4 v2, 0x0

    move-object/from16 v0, v16

    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationY(F)V

    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lw6;->d:Z

    sget v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v7, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    add-int/lit16 v7, v7, 0x25eb

    rem-int/2addr v2, v7

    if-gtz v2, :cond_28

    const-string v2, "\u06e5\u06e6\u06e6"

    invoke-static {v2}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_28
    const-string v7, "\u06e3\u06e4\u06e3"

    move-object v2, v9

    goto/16 :goto_7

    :sswitch_23
    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    move-result v2

    if-ltz v2, :cond_29

    invoke-static {}, Landroidx/core/content/ۣ۟ۧ۠;->۟۟۠ۢۨ()I

    const-string v7, "\u06e3\u06df\u06e5"

    move-object/from16 v2, v25

    :goto_15
    invoke-static {v7}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v25, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :cond_29
    sget v2, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v7, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sub-int/2addr v2, v7

    const v7, 0x1ab590

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_24
    invoke-static {}, Lۣ۟ۢ۠۠;->۠۟ۥ۠()I

    move-result v2

    if-gtz v2, :cond_2a

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    const-string v2, "\u06e6\u06df"

    invoke-static {v2}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_2a
    sget v2, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v7, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    div-int/2addr v2, v7

    const v7, 0xdca1

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_2b
    :sswitch_25
    const-string v2, "\u06e5\u06e3\u06e5"

    move-object v7, v2

    :goto_16
    invoke-static {v7}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_2c
    :sswitch_26
    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    move-result v2

    if-ltz v2, :cond_2d

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    const-string v7, "\u06e8\u06df\u06e5"

    move-object/from16 v2, v21

    goto/16 :goto_14

    :cond_2d
    const-string v2, "\u06e3\u06e1\u06e4"

    invoke-static {v2}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_27
    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v7, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    rem-int/2addr v2, v7

    const v7, 0x1accab

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_28
    move-object v2, v9

    :cond_2e
    sget v7, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v8, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    xor-int/lit16 v8, v8, -0x791

    mul-int/2addr v7, v8

    if-gtz v7, :cond_2f

    const/16 v7, 0x48

    sput v7, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    const-string v7, "\u06e6\u06df\u06e3"

    move-object v9, v2

    goto :goto_16

    :cond_2f
    sget v7, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v8, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sub-int/2addr v7, v8

    const v8, 0x1ab24d

    add-int/2addr v7, v8

    move-object v9, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :sswitch_29
    const/4 v2, 0x2

    const/4 v7, 0x0

    move-object/from16 v0, v32

    invoke-virtual {v0, v2, v7}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    sget v2, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v7, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    add-int/lit16 v7, v7, 0x184c

    xor-int/2addr v2, v7

    if-gtz v2, :cond_30

    const-string v2, "\u06e8\u06e1\u06e2"

    invoke-static {v2}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_30
    const-string v2, "\u06e0\u06e0\u06e5"

    goto/16 :goto_9

    :sswitch_2a
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lw6;->d:Z

    if-nez v2, :cond_61

    invoke-virtual/range {v21 .. v21}, Landroid/view/View;->getTranslationY()F

    move-result v2

    const/4 v7, 0x0

    cmpg-float v2, v2, v7

    if-nez v2, :cond_61

    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v7, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    or-int/2addr v2, v7

    const v7, 0x1ab6b6

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_31
    :sswitch_2b
    sget v2, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    if-ltz v2, :cond_32

    const/16 v2, 0x4e

    sput v2, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    const-string v2, "\u06e4\u06e7\u06e1"

    goto/16 :goto_6

    :cond_32
    sget v2, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v7, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    add-int/2addr v2, v7

    const v7, 0x1abb48

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_2c
    move-object/from16 v2, v26

    :cond_33
    sget v7, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    if-ltz v7, :cond_34

    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    const-string v7, "\u06e2\u06e5\u06e4"

    :goto_17
    invoke-static {v7}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v26, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :cond_34
    sget v7, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v8, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sub-int/2addr v7, v8

    const v8, 0x1ab2dc

    add-int/2addr v7, v8

    move-object/from16 v26, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :sswitch_2d
    sget v2, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v7, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    add-int/lit16 v7, v7, -0x1b3f

    sub-int/2addr v2, v7

    if-gtz v2, :cond_35

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    const-string v2, "\u06e2\u06e6\u06e6"

    :goto_18
    invoke-static {v2}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_35
    const-string v2, "\u06df\u06df\u06e2"

    move-object v7, v2

    goto/16 :goto_16

    :sswitch_2e
    sget v2, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v7, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    add-int/lit16 v7, v7, 0x25f1

    add-int/2addr v2, v7

    if-gtz v2, :cond_36

    const/16 v2, 0x1e

    sput v2, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    const-string v2, "\u06e7\u06e6\u06e0"

    invoke-static {v2}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_36
    sget v2, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v7, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    mul-int/2addr v2, v7

    const v7, -0x1cf637

    xor-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_2f
    move-object/from16 v0, v22

    move-object/from16 v1, p0

    iput-object v0, v1, Lw6;->b:Lh40;

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v7, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    rem-int/lit16 v7, v7, 0xcfb

    mul-int/2addr v2, v7

    if-gtz v2, :cond_37

    const/16 v2, 0x1b

    sput v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    const-string v2, "\u06e3\u06e0\u06df"

    invoke-static {v2}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_37
    sget v2, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v7, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    div-int/2addr v2, v7

    const v7, 0x1ac1c6

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_38
    :sswitch_30
    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    if-ltz v2, :cond_39

    const/16 v2, 0x28

    sput v2, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    const-string v7, "\u06e0\u06e1\u06e5"

    move-object/from16 v2, v27

    :goto_19
    invoke-static {v7}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v27, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :cond_39
    const-string v2, "\u06e1\u06e7\u06e7"

    move-object v8, v2

    goto/16 :goto_1

    :sswitch_31
    const v2, 0x3eb33333    # 0.35f

    mul-float/2addr v2, v6

    move-object/from16 v0, v21

    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationY(F)V

    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lw6;->d:Z

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    move-result v2

    if-gtz v2, :cond_3a

    const/16 v2, 0x2d

    sput v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    const-string v2, "\u06e4\u06e6"

    invoke-static {v2}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_3a
    const-string v2, "\u06e4\u06e1\u06e0"

    move-object v8, v2

    goto/16 :goto_1

    :sswitch_32
    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    move-result v2

    if-gtz v2, :cond_3c

    :cond_3b
    const-string v2, "\u06e5\u06df\u06e2"

    :goto_1a
    invoke-static {v2}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_3c
    const-string v2, "\u06e3\u06e6\u06e5"

    invoke-static {v2}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_33
    const/4 v2, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v16

    move-object/from16 v0, p0

    iget-object v2, v0, Lw6;->b:Lh40;

    if-nez v2, :cond_52

    new-instance v2, Lh40;

    sget-object v7, Lh40;->m:Lqh;

    move-object/from16 v0, v16

    invoke-direct {v2, v0, v7}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    const/4 v7, 0x0

    const v8, 0x44bb8000    # 1500.0f

    const/high16 v17, 0x3f000000    # 0.5f

    move/from16 v0, v17

    invoke-static {v7, v8, v0}, Lz30;->f(FFF)Li40;

    move-result-object v7

    iput-object v7, v2, Lh40;->j:Li40;

    sget v7, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    if-ltz v7, :cond_20

    const/16 v7, 0x16

    sput v7, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    const-string v7, "\u06e7\u06e1\u06e5"

    invoke-static {v7}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v22, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :cond_3d
    :sswitch_34
    sget v2, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v7, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    add-int/2addr v2, v7

    const v7, 0xdc19

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_35
    const/4 v2, 0x0

    cmpg-float v2, v31, v2

    if-gez v2, :cond_89

    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    move-result v2

    if-ltz v2, :cond_3e

    const-string v2, "\u06e1\u06e4\u06e0"

    invoke-static {v2}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_3e
    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v7, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    xor-int/2addr v2, v7

    const v7, 0x1aaa35

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_3f
    :sswitch_36
    sget v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v7, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    or-int/lit16 v7, v7, -0x70b

    xor-int/2addr v2, v7

    if-gtz v2, :cond_40

    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    const-string v2, "\u06e4\u06e3\u06e1"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_40
    sget v2, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v7, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    mul-int/2addr v2, v7

    const v7, 0x19070d

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_37
    move-object/from16 v0, v37

    move-object/from16 v1, p0

    iput-object v0, v1, Lw6;->b:Lh40;

    const-string v2, "\u06e3\u06e5\u06e8"

    invoke-static {v2}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_38
    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v7, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    mul-int/2addr v2, v7

    const v7, 0x1aa72b

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_41
    :sswitch_39
    sget v2, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    if-ltz v2, :cond_42

    const-string v2, "\u06e1\u06e2\u06e7"

    move-object v7, v2

    move v8, v5

    move/from16 v17, v6

    :goto_1b
    invoke-static {v7}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v2

    move v5, v8

    move/from16 v38, v2

    move/from16 v6, v17

    goto/16 :goto_0

    :cond_42
    const-string v7, "\u06e1\u06e1\u06e8"

    move-object/from16 v2, v26

    goto/16 :goto_17

    :sswitch_3a
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lw6;->d:Z

    sget v2, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v7, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    div-int/lit16 v7, v7, 0x7ae

    xor-int/2addr v2, v7

    if-gtz v2, :cond_43

    const/16 v2, 0x45

    sput v2, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    const-string v2, "\u06e2\u06e2\u06e8"

    invoke-static {v2}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v2

    move v15, v14

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_43
    move v15, v14

    :goto_1c
    const-string v2, "\u06df\u06e6\u06e5"

    goto/16 :goto_a

    :sswitch_3b
    move-object/from16 v0, p0

    iget v2, v0, Lw6;->c:F

    const/high16 v7, -0x40800000    # -1.0f

    cmpg-float v2, v2, v7

    if-nez v2, :cond_31

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lw6;->c:F

    sget v2, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v7, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    add-int/lit16 v7, v7, 0x17d0

    sub-int/2addr v2, v7

    if-ltz v2, :cond_44

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    const-string v2, "\u06e3\u06e3\u06e4"

    invoke-static {v2}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v2

    move v15, v14

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_44
    move v15, v14

    :goto_1d
    const-string v2, "\u06e8\u06e8\u06e8"

    invoke-static {v2}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_3c
    invoke-virtual {v4}, Lh40;->c()V

    sget v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v7, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    xor-int/2addr v2, v7

    const v7, 0xdae9

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_3d
    move-object/from16 v0, p0

    iget-object v2, v0, Lw6;->b:Lh40;

    if-eqz v2, :cond_55

    sget v7, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v8, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    mul-int/lit16 v8, v8, -0x1ce5

    xor-int/2addr v7, v8

    if-ltz v7, :cond_45

    const-string v7, "\u06e5\u06e8\u06e3"

    invoke-static {v7}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v29, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :cond_45
    const-string v7, "\u06e1\u06e2\u06e6"

    invoke-static {v7}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v29, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :sswitch_3e
    const/4 v2, 0x0

    cmpg-float v2, v6, v2

    if-gez v2, :cond_7a

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v7, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    add-int/lit16 v7, v7, 0x157c

    rem-int/2addr v2, v7

    if-gtz v2, :cond_46

    const/16 v2, 0x8

    sput v2, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    const-string v2, "\u06e4\u06e2\u06e0"

    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_46
    move-object v2, v11

    goto/16 :goto_d

    :sswitch_3f
    move-object/from16 v0, p0

    iget-object v2, v0, Lw6;->b:Lh40;

    if-eqz v2, :cond_8f

    const-string v7, "\u06e8\u06df"

    goto/16 :goto_19

    :sswitch_40
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lw6;->d:Z

    if-nez v2, :cond_76

    invoke-virtual/range {v16 .. v16}, Landroid/view/View;->getTranslationY()F

    move-result v2

    const/4 v7, 0x0

    cmpg-float v2, v2, v7

    if-nez v2, :cond_76

    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    if-ltz v2, :cond_12

    const/16 v2, 0x16

    sput v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    const-string v2, "\u06e4\u06e1\u06e8"

    invoke-static {v2}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_41
    const v2, 0x3eb33333    # 0.35f

    mul-float v2, v2, v31

    move-object/from16 v0, v16

    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationY(F)V

    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lw6;->d:Z

    :goto_1e
    const-string v2, "\u06e5\u06e4"

    invoke-static {v2}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_42
    move-object/from16 v0, v36

    move-object/from16 v1, p0

    iput-object v0, v1, Lw6;->b:Lh40;

    sget v2, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    if-ltz v2, :cond_47

    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    const-string v2, "\u06e2\u06df\u06e6"

    invoke-static {v2}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_47
    sget v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v7, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    or-int/2addr v2, v7

    const v7, 0x1ac617

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_43
    move-object/from16 v0, v35

    move-object/from16 v1, p0

    iput-object v0, v1, Lw6;->b:Lh40;

    sget v2, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v7, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    xor-int/2addr v2, v7

    const v7, 0x1abc9e

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_44
    move-object/from16 v2, v28

    :cond_48
    sget v7, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v8, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    mul-int/lit16 v8, v8, 0x14fb

    xor-int/2addr v7, v8

    if-ltz v7, :cond_49

    const/16 v7, 0x3a

    sput v7, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    const-string v7, "\u06e2\u06e5\u06e7"

    :goto_1f
    invoke-static {v7}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v28, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :cond_49
    sget v7, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v8, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    xor-int/2addr v7, v8

    const v8, 0x1aae86

    add-int/2addr v7, v8

    move-object/from16 v28, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :cond_4a
    :sswitch_45
    const-string v7, "\u06e0\u06e0\u06e5"

    move-object/from16 v2, v28

    goto :goto_1f

    :cond_4b
    :sswitch_46
    const-string v2, "\u06e7\u06e7\u06e6"

    move-object v8, v2

    goto/16 :goto_1

    :sswitch_47
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    const/high16 v7, 0x40a00000    # 5.0f

    add-float/2addr v2, v7

    move-object/from16 v0, p0

    iget v7, v0, Lw6;->c:F

    sub-float/2addr v2, v7

    const/high16 v7, 0x40a00000    # 5.0f

    sub-float v7, v2, v7

    sget v2, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    xor-int/lit16 v2, v2, 0x27e

    invoke-virtual {v11, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v8

    const/4 v2, 0x1

    invoke-virtual {v11, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v2

    if-nez v8, :cond_1a

    const-string v8, "\u06df\u06e8\u06e3"

    move/from16 v19, v2

    move/from16 v20, v7

    goto/16 :goto_13

    :cond_4c
    :sswitch_48
    sget v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v7, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    div-int/lit16 v7, v7, 0x2044

    xor-int/2addr v2, v7

    if-ltz v2, :cond_4d

    const-string v2, "\u06e7\u06e0\u06e5"

    :goto_20
    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_4d
    const-string v2, "\u06e3\u06e3\u06e4"

    goto/16 :goto_b

    :sswitch_49
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lw6;->c:F

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    move-result v2

    if-gtz v2, :cond_4e

    const-string v2, "\u06df\u06e8\u06e3"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_4e
    const-string v7, "\u06e1\u06e8\u06e4"

    move-object/from16 v2, v27

    goto/16 :goto_19

    :cond_4f
    :sswitch_4a
    invoke-static {}, Landroid/app/۠ۨۥۨ;->ۣۣ۟ۨۧ()I

    move-result v2

    if-gtz v2, :cond_50

    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    const-string v2, "\u06e7\u06df\u06e1"

    invoke-static {v2}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_50
    const-string v2, "\u06e0\u06e1\u06e6"

    invoke-static {v2}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_4b
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-static/range {v33 .. v33}, Ljava/lang/Math;->abs(F)F

    move-result v7

    div-float/2addr v7, v2

    invoke-static/range {v33 .. v33}, Ljava/lang/Math;->signum(F)F

    move-result v8

    const/high16 v15, 0x3f800000    # 1.0f

    const/high16 v17, 0x41980000    # 19.0f

    add-float v15, v15, v17

    const/high16 v17, 0x3f800000    # 1.0f

    const/high16 v18, 0x3fc00000    # 1.5f

    mul-float v7, v7, v18

    const/high16 v18, 0x41600000    # 14.0f

    sub-float v7, v7, v18

    const/high16 v18, 0x3f800000    # 1.0f

    add-float v7, v7, v18

    const/high16 v18, 0x41600000    # 14.0f

    add-float v7, v7, v18

    div-float v7, v17, v7

    sub-float v7, v15, v7

    const/high16 v15, 0x41980000    # 19.0f

    sub-float/2addr v7, v15

    mul-float/2addr v2, v8

    mul-float/2addr v2, v7

    const/high16 v7, 0x3e800000    # 0.25f

    mul-float/2addr v2, v7

    move-object/from16 v0, v34

    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationY(F)V

    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lw6;->d:Z

    const/4 v15, 0x1

    const-string v2, "\u06e5\u06e6\u06e6"

    move-object v7, v2

    goto/16 :goto_16

    :sswitch_4c
    const/4 v15, 0x0

    :goto_21
    :sswitch_4d
    return v15

    :sswitch_4e
    invoke-static {}, Landroidx/versionedparcelable/ۣۢۥ;->ۦۦۡۤ()I

    move-result v2

    if-gtz v2, :cond_51

    const/16 v2, 0xa

    sput v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    const-string v2, "\u06e4\u06df\u06e6"

    invoke-static {v2}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_51
    const-string v2, "\u06e0\u06df\u06e4"

    move-object v7, v2

    goto/16 :goto_e

    :cond_52
    :sswitch_4f
    move-object/from16 v2, v16

    const-string v7, "\u06e6\u06e3\u06e2"

    move-object/from16 v16, v2

    move-object/from16 v17, v7

    move/from16 v18, v12

    goto/16 :goto_10

    :sswitch_50
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lw6;->d:Z

    invoke-static {}, Landroidx/savedstate/۠ۡۢ۠;->ۣ۟ۨۤۨ()I

    move-result v2

    if-gtz v2, :cond_3b

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    goto/16 :goto_1d

    :sswitch_51
    const/4 v2, 0x0

    invoke-virtual {v9, v2}, Lh40;->b(F)V

    sget v2, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v7, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sub-int/2addr v2, v7

    const v7, 0x1ab3ef

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_52
    invoke-virtual/range {v32 .. v32}, Landroid/view/View;->getLayerType()I

    move-result v2

    const/4 v7, 0x2

    if-eq v2, v7, :cond_4a

    sget v2, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    if-ltz v2, :cond_5b

    const-string v2, "\u06e0\u06df\u06e4"

    invoke-static {v2}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_53
    invoke-virtual/range {v26 .. v26}, Lh40;->c()V

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v7, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    add-int/lit16 v7, v7, -0x1e97

    add-int/2addr v2, v7

    if-ltz v2, :cond_53

    const/16 v2, 0x33

    sput v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    const-string v2, "\u06e1\u06e7\u06e1"

    goto/16 :goto_11

    :cond_53
    sget v2, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v7, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sub-int/2addr v2, v7

    const v7, -0x1ab298

    xor-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_54
    const/4 v2, 0x0

    move-object/from16 v0, v25

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v7, v0, Lw6;->b:Lh40;

    if-nez v7, :cond_7c

    new-instance v7, Lh40;

    sget-object v8, Lh40;->m:Lqh;

    invoke-direct {v7, v2, v8}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    const/4 v8, 0x0

    const v17, 0x44bb8000    # 1500.0f

    const v18, 0x3f333333    # 0.7f

    move/from16 v0, v17

    move/from16 v1, v18

    invoke-static {v8, v0, v1}, Lz30;->f(FFF)Li40;

    move-result-object v8

    iput-object v8, v7, Lh40;->j:Li40;

    sget v8, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v17, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    xor-int v8, v8, v17

    const v17, 0x1ab6eb

    add-int v8, v8, v17

    move-object/from16 v37, v7

    move-object/from16 v34, v2

    move/from16 v38, v8

    goto/16 :goto_0

    :sswitch_55
    move-object/from16 v0, p0

    iget-object v2, v0, Lw6;->b:Lh40;

    if-eqz v2, :cond_d

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    move-result v7

    if-ltz v7, :cond_54

    const-string v7, "\u06e1\u06e1\u06e7"

    invoke-static {v7}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v7

    move-object v10, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :cond_54
    const-string v7, "\u06e1\u06e8"

    invoke-static {v7}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v7

    move-object v10, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :sswitch_56
    move-object/from16 v2, v29

    :cond_55
    sget v7, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v8, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    xor-int/lit16 v8, v8, -0x477

    sub-int/2addr v7, v8

    if-ltz v7, :cond_56

    const-string v7, "\u06e3\u06e6\u06e6"

    invoke-static {v7}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v29, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :cond_56
    sget v7, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v8, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    xor-int/2addr v7, v8

    const v8, 0x1ab743

    add-int/2addr v7, v8

    move-object/from16 v29, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :sswitch_57
    sget v2, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v7, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    add-int/2addr v2, v7

    const v7, 0x1ac966

    xor-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_57
    const-string v7, "\u06e6\u06e0\u06e5"

    invoke-static {v7}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v7

    move/from16 v38, v7

    move/from16 v33, v2

    goto/16 :goto_0

    :sswitch_58
    const/high16 v2, -0x40800000    # -1.0f

    move-object/from16 v0, p0

    iput v2, v0, Lw6;->c:F

    move-object/from16 v0, p0

    iget-boolean v2, v0, Lw6;->d:Z

    if-nez v2, :cond_8d

    invoke-virtual/range {v34 .. v34}, Landroid/view/View;->getTranslationY()F

    move-result v2

    const/4 v7, 0x0

    cmpg-float v2, v2, v7

    if-nez v2, :cond_8d

    sget v2, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v7, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    xor-int/lit16 v7, v7, -0x1449

    or-int/2addr v2, v7

    if-ltz v2, :cond_58

    const/16 v2, 0x45

    sput v2, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    const-string v2, "\u06e1\u06e1\u06e8"

    invoke-static {v2}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v2

    move v15, v14

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_58
    sget v2, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v7, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    mul-int/2addr v2, v7

    const v7, -0x1a9cb3

    xor-int/2addr v2, v7

    move v15, v14

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_59
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    const/high16 v7, 0x40a00000    # 5.0f

    add-float/2addr v2, v7

    move-object/from16 v0, p0

    iget v7, v0, Lw6;->c:F

    sub-float/2addr v2, v7

    const/high16 v7, 0x40a00000    # 5.0f

    sub-float v7, v2, v7

    sget v2, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    xor-int/lit16 v2, v2, 0xeb

    move-object/from16 v0, v28

    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v8

    const/4 v2, 0x1

    move-object/from16 v0, v28

    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v2

    if-nez v8, :cond_5a

    const-string v8, "\u06df\u06e6\u06e4"

    move/from16 v30, v2

    move/from16 v31, v7

    :goto_22
    invoke-static {v8}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_5a
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lw6;->c:F

    sget v2, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    if-ltz v2, :cond_59

    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    const-string v2, "\u06df\u06e3\u06e5"

    invoke-static {v2}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_59
    const-string v2, "\u06e6\u06e2\u06e8"

    goto/16 :goto_18

    :sswitch_5b
    move/from16 v2, v30

    move/from16 v7, v31

    :cond_5a
    const-string v8, "\u06e2\u06df\u06e7"

    move/from16 v30, v2

    move/from16 v31, v7

    goto/16 :goto_1

    :sswitch_5c
    if-nez v30, :cond_89

    sget v2, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v7, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    div-int/lit16 v7, v7, -0x220f

    or-int/2addr v2, v7

    if-gtz v2, :cond_5c

    :cond_5b
    const-string v2, "\u06e3\u06e1\u06df"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_5c
    const-string v2, "\u06e2\u06e7\u06e0"

    goto/16 :goto_20

    :sswitch_5d
    move-object/from16 v0, p0

    iget-object v2, v0, Lw6;->b:Lh40;

    if-eqz v2, :cond_22

    const-string v7, "\u06e5\u06e3\u06e1"

    :goto_23
    invoke-static {v7}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v23, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :sswitch_5e
    const/4 v2, 0x0

    invoke-virtual {v10, v2}, Lh40;->b(F)V

    :goto_24
    const-string v2, "\u06e2\u06e5\u06e1"

    invoke-static {v2}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_5f
    const-string v2, "dg==\n"

    const-string v7, "AKBP1LU65ZA=\n"

    invoke-static {v2, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "MFGOPwM=\n"

    const-string v7, "VSfrUXeqD50=\n"

    invoke-static {v2, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p2

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v2, p1

    check-cast v2, Landroid/widget/ScrollView;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v8

    const/4 v7, 0x0

    if-nez v8, :cond_60

    sget v8, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v14, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    add-int/lit16 v14, v14, 0x283

    add-int/2addr v8, v14

    if-gtz v8, :cond_5d

    invoke-static {}, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۢ۠ۨ۟()I

    const-string v8, "\u06e3\u06e2\u06e1"

    invoke-static {v8}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v25, v2

    move v14, v7

    move v15, v7

    move/from16 v38, v8

    goto/16 :goto_0

    :cond_5d
    move v8, v7

    move v15, v7

    :goto_25
    const-string v7, "\u06e7\u06e1\u06e3"

    invoke-static {v7}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v25, v2

    move v14, v8

    move/from16 v38, v7

    goto/16 :goto_0

    :sswitch_60
    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    if-ltz v2, :cond_5e

    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    const-string v2, "\u06e3\u06e5\u06e2"

    invoke-static {v2}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_5e
    sget v2, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v7, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    div-int/2addr v2, v7

    const v7, 0x1aaefd

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :pswitch_0
    :sswitch_61
    sget v2, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v7, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sub-int/2addr v2, v7

    const v7, 0x1aac7a

    xor-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_62
    const/4 v2, 0x0

    cmpl-float v2, v31, v2

    if-gtz v2, :cond_4f

    sget v2, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v7, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    rem-int/lit16 v7, v7, 0x44f

    sub-int/2addr v2, v7

    if-ltz v2, :cond_5f

    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    const-string v2, "\u06e7\u06e5\u06df"

    invoke-static {v2}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_5f
    sget v2, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v7, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sub-int/2addr v2, v7

    const v7, 0x1ab112

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_60
    move v14, v7

    :goto_26
    const-string v7, "\u06e2\u06e2\u06e3"

    goto/16 :goto_15

    :cond_61
    :sswitch_63
    sget v2, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v7, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    rem-int/lit16 v7, v7, -0x1443

    add-int/2addr v2, v7

    if-ltz v2, :cond_62

    const/4 v2, 0x4

    sput v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    const-string v7, "\u06df\u06df\u06df"

    move-object/from16 v2, v23

    goto/16 :goto_23

    :cond_62
    sget v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v7, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    mul-int/2addr v2, v7

    const v7, 0x1a87b0

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_64
    sget v2, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v7, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    xor-int/2addr v2, v7

    const v7, 0x1aab2b

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_63
    :sswitch_65
    invoke-static {}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۢ۟ۡۧ()I

    move-result v2

    if-ltz v2, :cond_64

    invoke-static {}, Landroidx/activity/ۣ۟۠ۤۢ;->۟۠۠ۤۥ()I

    const-string v2, "\u06e3\u06e5\u06e0"

    invoke-static {v2}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_64
    const-string v2, "\u06e1\u06e6\u06e0"

    goto/16 :goto_6

    :sswitch_66
    const/4 v2, 0x0

    move-object/from16 v0, v24

    invoke-virtual {v0, v2}, Lh40;->b(F)V

    sget v2, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v7, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    or-int/lit16 v7, v7, -0x91

    div-int/2addr v2, v7

    if-ltz v2, :cond_65

    const/16 v2, 0x1b

    sput v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    const-string v2, "\u06e4\u06e0\u06e3"

    invoke-static {v2}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_65
    sget v2, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v7, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    or-int/2addr v2, v7

    const v7, -0x1aafde

    xor-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_67
    const/4 v2, 0x0

    cmpg-float v2, v33, v2

    if-gez v2, :cond_4

    sget v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v7, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    mul-int/lit16 v7, v7, -0xc2

    sub-int/2addr v2, v7

    if-ltz v2, :cond_66

    const/16 v2, 0x19

    sput v2, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    const-string v2, "\u06e6\u06e3\u06e2"

    :goto_27
    invoke-static {v2}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_66
    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v7, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    add-int/2addr v2, v7

    const v7, 0x1ab3f9

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_67
    move-object v11, v2

    :sswitch_68
    const-string v2, "\u06e8\u06e0\u06e5"

    move-object/from16 v17, v2

    move/from16 v18, v12

    goto/16 :goto_10

    :sswitch_69
    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    move-result v2

    if-gtz v2, :cond_68

    const-string v2, "\u06e0\u06e3\u06e0"

    :goto_28
    invoke-static {v2}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_68
    const-string v2, "\u06e6\u06e0\u06df"

    move-object v7, v2

    :goto_29
    invoke-static {v7}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_6a
    if-nez v19, :cond_6f

    sget v2, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    if-ltz v2, :cond_69

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    const-string v2, "\u06df\u06df\u06e2"

    invoke-static {v2}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_69
    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v7, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    xor-int/2addr v2, v7

    const v7, 0x1aabb9

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_6b
    const/high16 v2, -0x40800000    # -1.0f

    move-object/from16 v0, p0

    iput v2, v0, Lw6;->c:F

    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lw6;->d:Z

    sget v2, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    if-ltz v2, :cond_6a

    const/16 v2, 0x42

    sput v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    const-string v2, "\u06e4\u06e7\u06e6"

    invoke-static {v2}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_6a
    sget v2, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v7, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    rem-int/2addr v2, v7

    const v7, 0x1ab0e0

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :pswitch_1
    :sswitch_6c
    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    move-result v2

    if-ltz v2, :cond_6b

    const/16 v2, 0xd

    sput v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    const-string v2, "\u06e6\u06e6\u06e5"

    invoke-static {v2}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_6b
    sget v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v7, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    xor-int/2addr v2, v7

    const v7, 0x1ac417

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_6d
    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    move-result v2

    if-ltz v2, :cond_6c

    const/4 v2, 0x3

    sput v2, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    const-string v2, "\u06e1\u06e2\u06e5"

    invoke-static {v2}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_6c
    const-string v2, "\u06e2\u06df\u06e6"

    :goto_2a
    invoke-static {v2}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_6e
    const/4 v2, 0x0

    cmpl-float v2, v20, v2

    if-gtz v2, :cond_86

    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    move-result v2

    if-gtz v2, :cond_6d

    const-string v2, "\u06e4\u06e8\u06e1"

    invoke-static {v2}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_6d
    const-string v2, "\u06df\u06e2\u06e0"

    goto/16 :goto_28

    :sswitch_6f
    sget v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v7, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    xor-int/lit16 v7, v7, -0x1482

    div-int/2addr v2, v7

    if-eqz v2, :cond_6e

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    goto/16 :goto_1e

    :cond_6e
    sget v2, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v7, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    add-int/2addr v2, v7

    const v7, -0x1aaf73

    xor-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_6f
    :sswitch_70
    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v7, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    xor-int/2addr v2, v7

    const v7, -0xdfb8

    xor-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_71
    const/4 v2, 0x0

    cmpl-float v2, v6, v2

    if-gtz v2, :cond_18

    sget v2, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v7, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    div-int/lit16 v7, v7, 0x731

    xor-int/2addr v2, v7

    if-ltz v2, :cond_70

    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    const-string v2, "\u06e4\u06e5\u06e8"

    invoke-static {v2}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_70
    sget v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v7, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    xor-int/2addr v2, v7

    const v7, 0x1ac96d

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_72
    const v2, 0x3eb33333    # 0.35f

    mul-float v2, v2, v20

    move-object/from16 v0, v32

    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationY(F)V

    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lw6;->d:Z

    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v7, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    add-int/lit8 v7, v7, -0x41

    or-int/2addr v2, v7

    if-ltz v2, :cond_71

    invoke-static {}, Landroidx/core/content/ۣ۟ۧ۠;->۟۟۠ۢۨ()I

    const-string v2, "\u06e8\u06e4\u06e8"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_71
    sget v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v7, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    div-int/2addr v2, v7

    const v7, 0x1abd8b

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_73
    move v2, v12

    move v7, v13

    :cond_72
    sget v8, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v12, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    xor-int/lit16 v12, v12, -0x2479

    add-int/2addr v8, v12

    if-ltz v8, :cond_73

    const-string v8, "\u06e4\u06e6\u06e0"

    move v12, v2

    move v13, v7

    goto/16 :goto_22

    :cond_73
    sget v8, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v12, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    mul-int/2addr v8, v12

    const v12, 0x212731

    add-int/2addr v8, v12

    move v12, v2

    move v13, v7

    move/from16 v38, v8

    goto/16 :goto_0

    :cond_74
    :sswitch_74
    sget v2, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v7, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    add-int/lit16 v7, v7, 0x165c

    div-int/2addr v2, v7

    if-eqz v2, :cond_75

    const/16 v2, 0x25

    sput v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    const-string v2, "\u06e1\u06df\u06e7"

    move-object v8, v2

    :goto_2b
    invoke-static {v8}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_75
    const-string v2, "\u06e5\u06e0\u06e3"

    move-object/from16 v17, v2

    move/from16 v18, v12

    goto/16 :goto_10

    :cond_76
    :sswitch_75
    sget v2, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v7, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    mul-int/lit16 v7, v7, 0x1e16

    or-int/2addr v2, v7

    if-ltz v2, :cond_77

    const-string v2, "\u06e8\u06e3\u06e6"

    invoke-static {v2}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_77
    const-string v2, "\u06e1\u06df\u06e5"

    move-object v8, v2

    goto/16 :goto_22

    :sswitch_76
    move/from16 v2, v33

    :cond_78
    invoke-static {}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۡۢۡۥ()I

    move-result v7

    if-gtz v7, :cond_79

    const/16 v7, 0x34

    sput v7, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    const-string v7, "\u06e5\u06e1\u06e1"

    move/from16 v33, v2

    goto/16 :goto_29

    :cond_79
    sget v7, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v8, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    or-int/2addr v7, v8

    const v8, 0x1ab11b

    add-int/2addr v7, v8

    move/from16 v38, v7

    move/from16 v33, v2

    goto/16 :goto_0

    :sswitch_77
    const/4 v2, 0x0

    move-object/from16 v0, v27

    invoke-virtual {v0, v2}, Lh40;->b(F)V

    sget v2, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v7, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    div-int/2addr v2, v7

    const v7, 0x1abe7e

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_7a
    :sswitch_78
    sget v2, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v7, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    xor-int/lit16 v7, v7, -0x2f2

    add-int/2addr v2, v7

    if-ltz v2, :cond_7b

    const-string v2, "\u06df\u06e5\u06e4"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_7b
    sget v2, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v7, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sub-int/2addr v2, v7

    const v7, 0x1aaf23

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_79
    move-object/from16 v2, v34

    :cond_7c
    sget v7, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v8, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    xor-int/lit16 v8, v8, 0x1bd7

    div-int/2addr v7, v8

    if-eqz v7, :cond_7d

    const/16 v7, 0x4a

    sput v7, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    const-string v7, "\u06e4\u06e4\u06e2"

    move-object/from16 v34, v2

    move-object v8, v7

    goto/16 :goto_1

    :cond_7d
    sget v7, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v8, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    add-int/2addr v7, v8

    const v8, 0x1ab898

    add-int/2addr v7, v8

    move-object/from16 v34, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :sswitch_7a
    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v7, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    rem-int/lit16 v7, v7, -0x1320

    rem-int/2addr v2, v7

    if-ltz v2, :cond_7e

    const/16 v2, 0x54

    sput v2, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    const-string v2, "\u06e3\u06e4\u06e3"

    invoke-static {v2}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_7e
    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v7, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    xor-int/2addr v2, v7

    const v7, 0x1aafd9

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_7b
    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    if-ltz v2, :cond_7f

    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    const-string v2, "\u06e8\u06e3\u06e8"

    invoke-static {v2}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_7f
    const-string v2, "\u06e0\u06e2"

    move-object v7, v2

    goto/16 :goto_16

    :sswitch_7c
    move-object/from16 v0, p0

    iget-object v2, v0, Lw6;->b:Lh40;

    if-eqz v2, :cond_33

    sget v7, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v8, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    add-int/lit16 v8, v8, 0x35d

    rem-int/2addr v7, v8

    if-gtz v7, :cond_80

    const/16 v7, 0x43

    sput v7, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    move-object/from16 v26, v2

    move-object/from16 v7, v35

    :goto_2c
    const-string v2, "\u06df\u06e4\u06e2"

    invoke-static {v2}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v35, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_80
    sget v7, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v8, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    xor-int/2addr v7, v8

    const v8, 0x1abd83

    add-int/2addr v7, v8

    move-object/from16 v26, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :sswitch_7d
    const-string v2, "\u06e8\u06e2"

    goto/16 :goto_c

    :sswitch_7e
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lw6;->d:Z

    if-eqz v2, :cond_74

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lw6;->c:F

    const/4 v2, 0x0

    move-object/from16 v0, v32

    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationY(F)V

    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lw6;->d:Z

    const/4 v2, 0x0

    const/4 v7, 0x0

    move-object/from16 v0, v32

    invoke-virtual {v0, v2, v7}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    sget v2, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    if-gtz v2, :cond_81

    const/16 v2, 0x33

    sput v2, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    const-string v2, "\u06e6\u06e8\u06e3"

    invoke-static {v2}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_81
    sget v2, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v7, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    mul-int/2addr v2, v7

    const v7, 0xb628a

    xor-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_7f
    sget v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v7, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    div-int/lit16 v7, v7, -0x8ac

    xor-int/2addr v2, v7

    if-ltz v2, :cond_82

    const-string v2, "\u06e6\u06e1\u06e0"

    invoke-static {v2}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_82
    const-string v7, "\u06e1\u06e1\u06e2"

    move-object v2, v10

    goto/16 :goto_8

    :sswitch_80
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lw6;->c:F

    sget v2, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v7, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    or-int/lit16 v7, v7, -0x23b6

    add-int/2addr v2, v7

    if-ltz v2, :cond_83

    const/16 v2, 0x5d

    sput v2, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    const-string v2, "\u06e3\u06e0\u06e2"

    invoke-static {v2}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_83
    const-string v2, "\u06e4\u06e5\u06e0"

    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_81
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    if-eqz v2, :cond_41

    const/4 v7, 0x1

    if-eq v2, v7, :cond_3f

    const/4 v7, 0x2

    if-eq v2, v7, :cond_1c

    const/4 v7, 0x3

    if-eq v2, v7, :cond_3f

    sget v2, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v7, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    rem-int/2addr v2, v7

    const v7, 0x1aba7c

    xor-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_82
    const/4 v2, 0x0

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v7, v0, Lw6;->b:Lh40;

    if-nez v7, :cond_1e

    new-instance v7, Lh40;

    sget-object v8, Lh40;->m:Lqh;

    invoke-direct {v7, v2, v8}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    const/4 v8, 0x0

    const v17, 0x44bb8000    # 1500.0f

    const/high16 v18, 0x3f000000    # 0.5f

    move/from16 v0, v17

    move/from16 v1, v18

    invoke-static {v8, v0, v1}, Lz30;->f(FFF)Li40;

    move-result-object v8

    iput-object v8, v7, Lh40;->j:Li40;

    sget v8, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    if-ltz v8, :cond_84

    const/16 v8, 0x4e

    sput v8, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    const-string v8, "\u06e8\u06e0\u06e5"

    invoke-static {v8}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v21, v2

    move-object/from16 v35, v7

    move/from16 v38, v8

    goto/16 :goto_0

    :cond_84
    move-object/from16 v21, v2

    goto/16 :goto_2c

    :pswitch_2
    :sswitch_83
    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v7, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    mul-int/2addr v2, v7

    const v7, -0x1a11bc

    xor-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_84
    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    move-result v2

    if-gtz v2, :cond_85

    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    const-string v2, "\u06e5\u06e7\u06e5"

    invoke-static {v2}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_85
    sget v2, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v7, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    mul-int/2addr v2, v7

    const v7, 0x1ab34c

    xor-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_86
    :sswitch_85
    const-string v2, "\u06e7\u06e7\u06df"

    :goto_2d
    invoke-static {v2}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_86
    sget v2, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v7, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    add-int/lit16 v7, v7, 0x11f2

    mul-int/2addr v2, v7

    if-ltz v2, :cond_87

    const/16 v2, 0x12

    sput v2, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    const-string v2, "\u06e7\u06e6"

    goto/16 :goto_2a

    :cond_87
    const-string v2, "\u06e6\u06e0\u06e4"

    goto/16 :goto_27

    :sswitch_87
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lw6;->d:Z

    if-eqz v2, :cond_9b

    const/4 v2, 0x0

    move-object/from16 v0, v34

    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationY(F)V

    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lw6;->d:Z

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lw6;->c:F

    sget v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v7, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    xor-int/lit16 v7, v7, 0x79a

    xor-int/2addr v2, v7

    if-ltz v2, :cond_88

    const-string v2, "\u06e0\u06e5\u06e6"

    invoke-static {v2}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v2

    move v15, v14

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_88
    sget v2, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v7, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    div-int/2addr v2, v7

    const v7, 0x1abadd

    add-int/2addr v2, v7

    move v15, v14

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_89
    :sswitch_88
    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v7, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    add-int/lit16 v7, v7, -0x22b8

    mul-int/2addr v2, v7

    if-gtz v2, :cond_8a

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    const-string v2, "\u06e0\u06e5\u06e7"

    move-object v7, v2

    goto/16 :goto_e

    :cond_8a
    sget v2, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v7, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    xor-int/2addr v2, v7

    const v7, 0x1aab2a

    xor-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_8b
    :sswitch_89
    sget v2, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v7, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sub-int/2addr v2, v7

    const v7, 0x1aad2b

    xor-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_8a
    sget v2, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v7, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    xor-int/2addr v2, v7

    const v7, 0xdcd5

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_8b
    move-object/from16 v0, p0

    iget-object v2, v0, Lw6;->b:Lh40;

    if-eqz v2, :cond_2e

    sget v7, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v8, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    or-int/lit16 v8, v8, 0x161e

    sub-int/2addr v7, v8

    if-ltz v7, :cond_8c

    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    move-object v9, v2

    goto/16 :goto_1c

    :cond_8c
    const-string v7, "\u06e2\u06e4"

    goto/16 :goto_7

    :sswitch_8c
    const/4 v15, 0x0

    goto/16 :goto_21

    :cond_8d
    :sswitch_8d
    sget v2, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v7, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    or-int/lit16 v7, v7, -0x1dac

    sub-int/2addr v2, v7

    if-gtz v2, :cond_8e

    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    const-string v2, "\u06e6\u06e7\u06e0"

    goto/16 :goto_2d

    :cond_8e
    const-string v2, "\u06e2\u06df\u06e4"

    move-object v8, v2

    goto/16 :goto_1

    :sswitch_8e
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    const/high16 v5, 0x41900000    # 18.0f

    sub-float/2addr v2, v5

    move-object/from16 v0, p0

    iget v5, v0, Lw6;->c:F

    sub-float/2addr v2, v5

    const/high16 v5, 0x41900000    # 18.0f

    add-float/2addr v5, v2

    sget v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    xor-int/lit16 v2, v2, 0x97

    invoke-virtual {v3, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v6

    const/4 v2, 0x1

    invoke-virtual {v3, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v2

    if-nez v6, :cond_6

    const-string v6, "\u06df\u06e1\u06e1"

    move-object v7, v6

    move v8, v2

    move/from16 v17, v5

    goto/16 :goto_1b

    :sswitch_8f
    if-nez v5, :cond_7a

    sget v2, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v7, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    or-int/2addr v2, v7

    const v7, -0x1ac6b5

    xor-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_90
    move-object/from16 v2, v27

    :cond_8f
    sget v7, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v8, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    mul-int/2addr v7, v8

    const v8, 0x1e6dd1

    add-int/2addr v7, v8

    move-object/from16 v27, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :sswitch_91
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    const/high16 v7, 0x41f00000    # 30.0f

    add-float/2addr v2, v7

    move-object/from16 v0, p0

    iget v7, v0, Lw6;->c:F

    sub-float/2addr v2, v7

    const/high16 v7, 0x41f00000    # 30.0f

    sub-float/2addr v2, v7

    if-nez v13, :cond_78

    sget v7, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v8, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    add-int/lit16 v8, v8, 0x11b9

    xor-int/2addr v7, v8

    if-gtz v7, :cond_57

    const-string v7, "\u06e6\u06e0\u06df"

    invoke-static {v7}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v38, v7

    move/from16 v33, v2

    goto/16 :goto_0

    :sswitch_92
    if-nez v12, :cond_4

    const-string v2, "\u06e3\u06e7\u06df"

    goto/16 :goto_1a

    :sswitch_93
    invoke-virtual/range {v23 .. v23}, Lh40;->c()V

    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v7, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    div-int/2addr v2, v7

    const v7, -0x1aa781

    xor-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_94
    const-string v2, "Uw==\n"

    const-string v7, "JVNdz8Q/geU=\n"

    invoke-static {v2, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "i20bWD0=\n"

    const-string v7, "7ht+NklJ6Pg=\n"

    invoke-static {v2, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p2

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v2, p1

    check-cast v2, Landroid/widget/ScrollView;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v7

    if-nez v7, :cond_48

    sget v7, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v8, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    mul-int/2addr v7, v8

    const v8, -0x1f32cf

    xor-int/2addr v7, v8

    move-object/from16 v28, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :sswitch_95
    sget v2, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v7, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    mul-int/2addr v2, v7

    const v7, 0x1a3637

    add-int/2addr v2, v7

    move v15, v14

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_96
    sget v2, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    xor-int/lit8 v2, v2, -0x4

    move-object/from16 v0, v25

    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v7

    const/4 v2, 0x1

    move-object/from16 v0, v25

    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v2

    if-eqz v7, :cond_72

    if-eqz v2, :cond_72

    const/high16 v8, -0x40800000    # -1.0f

    move-object/from16 v0, p0

    iput v8, v0, Lw6;->c:F

    move-object/from16 v0, p0

    iget-boolean v8, v0, Lw6;->d:Z

    if-eqz v8, :cond_16

    const/4 v8, 0x0

    move-object/from16 v0, v34

    invoke-virtual {v0, v8}, Landroid/view/View;->setTranslationY(F)V

    const/4 v8, 0x0

    move-object/from16 v0, p0

    iput-boolean v8, v0, Lw6;->d:Z

    sget v8, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v12, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    or-int/lit16 v12, v12, -0x8c8

    rem-int/2addr v8, v12

    if-gtz v8, :cond_90

    move-object/from16 v8, v36

    move v12, v2

    move v13, v7

    move v15, v14

    goto/16 :goto_4

    :cond_90
    const-string v8, "\u06e8\u06e4\u06e5"

    move v12, v2

    move v13, v7

    move v15, v14

    goto/16 :goto_2b

    :sswitch_97
    const/4 v15, 0x0

    goto/16 :goto_21

    :cond_91
    :sswitch_98
    const-string v2, "\u06e4\u06e5\u06e8"

    goto/16 :goto_5

    :cond_92
    :sswitch_99
    sget v2, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v7, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    add-int/lit16 v7, v7, 0x360

    mul-int/2addr v2, v7

    if-gtz v2, :cond_93

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    const-string v2, "\u06e5\u06e2"

    invoke-static {v2}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_93
    sget v2, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v7, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    or-int/2addr v2, v7

    const v7, 0x1ac2c4

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_94
    :sswitch_9a
    sget v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v7, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    rem-int/lit16 v7, v7, 0x485

    rem-int/2addr v2, v7

    if-ltz v2, :cond_95

    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    const-string v2, "\u06e1\u06e0\u06e2"

    goto/16 :goto_b

    :cond_95
    sget v2, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v7, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    mul-int/2addr v2, v7

    const v7, 0x14b30c

    add-int/2addr v2, v7

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_9b
    sget v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v7, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    add-int/lit16 v7, v7, 0x6b3

    add-int/2addr v2, v7

    if-gtz v2, :cond_96

    const/16 v2, 0x1f

    sput v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    const-string v2, "\u06df\u06df\u06e8"

    invoke-static {v2}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_96
    const-string v2, "\u06e6\u06e5"

    invoke-static {v2}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_9c
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    if-eqz v2, :cond_38

    const/4 v7, 0x1

    if-eq v2, v7, :cond_8

    const/4 v7, 0x2

    if-eq v2, v7, :cond_92

    const/4 v7, 0x3

    if-eq v2, v7, :cond_8

    sget v2, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v7, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    mul-int/lit16 v7, v7, 0x9d0

    div-int/2addr v2, v7

    if-eqz v2, :cond_97

    const/4 v2, 0x6

    sput v2, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    move-object/from16 v2, v25

    move v8, v14

    move v15, v14

    goto/16 :goto_25

    :cond_97
    sget v2, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v7, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    rem-int/2addr v2, v7

    const v7, 0x1aba39

    add-int/2addr v2, v7

    move v15, v14

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_9d
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lw6;->d:Z

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v7, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    mul-int/lit16 v7, v7, 0x250d

    add-int/2addr v2, v7

    if-gtz v2, :cond_98

    const/16 v2, 0x36

    sput v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    const-string v2, "\u06e6\u06e2\u06e7"

    invoke-static {v2}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :cond_98
    const-string v2, "\u06e5\u06e3\u06e5"

    invoke-static {v2}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v38, v2

    goto/16 :goto_0

    :sswitch_9e
    move-object v2, v3

    :cond_99
    const-string v3, "\u06e1\u06e4\u06e6"

    invoke-static {v3}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v7

    move-object v3, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :sswitch_9f
    const-string v2, "IQ==\n"

    const-string v3, "V98tjexnzxk=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "Ri1uZCQ=\n"

    const-string v3, "I1sLClC7x+c=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p2

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v2, p1

    check-cast v2, Landroid/widget/ScrollView;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    if-nez v3, :cond_99

    invoke-static {}, Lkotlinx/coroutines/ۦۡۧۧ;->۟ۤۧۨۦ()I

    move-result v3

    if-ltz v3, :cond_9a

    move-object v3, v2

    goto/16 :goto_24

    :cond_9a
    sget v3, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v7, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    add-int/2addr v3, v7

    const v7, 0x1ac753

    xor-int/2addr v7, v3

    move-object v3, v2

    move/from16 v38, v7

    goto/16 :goto_0

    :cond_9b
    move v2, v12

    move v7, v13

    move v8, v14

    goto/16 :goto_f

    :sswitch_a0
    move v2, v5

    goto/16 :goto_2

    :sswitch_a1
    move v2, v12

    move v7, v13

    move v8, v15

    goto/16 :goto_f

    :sswitch_a2
    move-object/from16 v2, v25

    goto/16 :goto_26

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe8 -> :sswitch_0
        0xdbe9 -> :sswitch_48
        0xdc02 -> :sswitch_25
        0xdc22 -> :sswitch_8
        0xdc27 -> :sswitch_5e
        0xdc42 -> :sswitch_51
        0xdc45 -> :sswitch_98
        0xdc5d -> :sswitch_7b
        0xdc82 -> :sswitch_b
        0xdc9f -> :sswitch_84
        0xdca1 -> :sswitch_a1
        0xdca2 -> :sswitch_90
        0xdcb9 -> :sswitch_7e
        0xdcbb -> :sswitch_70
        0xdcbe -> :sswitch_40
        0xdcbf -> :sswitch_98
        0xdcde -> :sswitch_78
        0xdcdf -> :sswitch_49
        0xdcf7 -> :sswitch_77
        0xdcfa -> :sswitch_a1
        0xdcfc -> :sswitch_a2
        0x1aa702 -> :sswitch_25
        0x1aa707 -> :sswitch_68
        0x1aa708 -> :sswitch_1
        0x1aa726 -> :sswitch_5f
        0x1aa73e -> :sswitch_4f
        0x1aa73f -> :sswitch_71
        0x1aa740 -> :sswitch_2c
        0x1aa75d -> :sswitch_6a
        0x1aa75e -> :sswitch_20
        0x1aa75f -> :sswitch_a1
        0x1aa761 -> :sswitch_73
        0x1aa762 -> :sswitch_7c
        0x1aa77f -> :sswitch_98
        0x1aa781 -> :sswitch_6b
        0x1aa79d -> :sswitch_43
        0x1aa7a1 -> :sswitch_79
        0x1aa7b9 -> :sswitch_f
        0x1aa7c0 -> :sswitch_55
        0x1aa7dd -> :sswitch_62
        0x1aa7de -> :sswitch_7a
        0x1aa81a -> :sswitch_6e
        0x1aa81d -> :sswitch_65
        0x1aaac2 -> :sswitch_5b
        0x1aaac5 -> :sswitch_74
        0x1aaae5 -> :sswitch_72
        0x1aaaff -> :sswitch_39
        0x1aab05 -> :sswitch_41
        0x1aab1d -> :sswitch_25
        0x1aab21 -> :sswitch_1b
        0x1aab3d -> :sswitch_86
        0x1aab3f -> :sswitch_1e
        0x1aab5b -> :sswitch_36
        0x1aab64 -> :sswitch_66
        0x1aab7e -> :sswitch_4e
        0x1aab7f -> :sswitch_25
        0x1aab81 -> :sswitch_a0
        0x1aab83 -> :sswitch_17
        0x1aab9f -> :sswitch_22
        0x1aabd9 -> :sswitch_2a
        0x1aae87 -> :sswitch_8b
        0x1aaea0 -> :sswitch_a1
        0x1aaea8 -> :sswitch_9f
        0x1aaea9 -> :sswitch_46
        0x1aaec2 -> :sswitch_25
        0x1aaec7 -> :sswitch_4a
        0x1aaec8 -> :sswitch_3d
        0x1aaee2 -> :sswitch_83
        0x1aaee4 -> :sswitch_3c
        0x1aaee5 -> :sswitch_11
        0x1aaefd -> :sswitch_74
        0x1aaf1d -> :sswitch_69
        0x1aaf23 -> :sswitch_82
        0x1aaf25 -> :sswitch_74
        0x1aaf41 -> :sswitch_a1
        0x1aaf44 -> :sswitch_89
        0x1aaf5a -> :sswitch_c
        0x1aaf5b -> :sswitch_4b
        0x1aaf7a -> :sswitch_4d
        0x1aaf7b -> :sswitch_87
        0x1aaf7d -> :sswitch_3a
        0x1aaf81 -> :sswitch_5d
        0x1aaf9d -> :sswitch_9d
        0x1ab243 -> :sswitch_99
        0x1ab244 -> :sswitch_58
        0x1ab247 -> :sswitch_4
        0x1ab248 -> :sswitch_2d
        0x1ab249 -> :sswitch_98
        0x1ab24a -> :sswitch_5c
        0x1ab265 -> :sswitch_2f
        0x1ab267 -> :sswitch_19
        0x1ab282 -> :sswitch_33
        0x1ab29f -> :sswitch_34
        0x1ab2a3 -> :sswitch_54
        0x1ab2a8 -> :sswitch_5a
        0x1ab2c3 -> :sswitch_12
        0x1ab2fe -> :sswitch_50
        0x1ab302 -> :sswitch_94
        0x1ab322 -> :sswitch_a1
        0x1ab33b -> :sswitch_35
        0x1ab359 -> :sswitch_95
        0x1ab35a -> :sswitch_92
        0x1ab622 -> :sswitch_1c
        0x1ab624 -> :sswitch_74
        0x1ab625 -> :sswitch_a1
        0x1ab62b -> :sswitch_27
        0x1ab641 -> :sswitch_29
        0x1ab646 -> :sswitch_3f
        0x1ab648 -> :sswitch_23
        0x1ab662 -> :sswitch_18
        0x1ab663 -> :sswitch_98
        0x1ab682 -> :sswitch_85
        0x1ab684 -> :sswitch_5
        0x1ab6a2 -> :sswitch_2e
        0x1ab6a5 -> :sswitch_8d
        0x1ab6c0 -> :sswitch_e
        0x1ab6c5 -> :sswitch_88
        0x1ab6c6 -> :sswitch_9c
        0x1ab6e1 -> :sswitch_6c
        0x1ab6e2 -> :sswitch_74
        0x1ab6fb -> :sswitch_67
        0x1ab720 -> :sswitch_26
        0x1ab9cb -> :sswitch_76
        0x1ab9e4 -> :sswitch_81
        0x1ab9e7 -> :sswitch_9a
        0x1aba02 -> :sswitch_91
        0x1aba03 -> :sswitch_8a
        0x1aba0b -> :sswitch_37
        0x1aba22 -> :sswitch_a
        0x1aba64 -> :sswitch_14
        0x1aba7f -> :sswitch_13
        0x1aba87 -> :sswitch_8c
        0x1abaa2 -> :sswitch_1d
        0x1ababd -> :sswitch_8e
        0x1abac3 -> :sswitch_64
        0x1abadc -> :sswitch_80
        0x1abadd -> :sswitch_7d
        0x1abae3 -> :sswitch_d
        0x1abd88 -> :sswitch_6d
        0x1abd89 -> :sswitch_32
        0x1abda8 -> :sswitch_97
        0x1abe01 -> :sswitch_7f
        0x1abe02 -> :sswitch_53
        0x1abe03 -> :sswitch_93
        0x1abe07 -> :sswitch_4c
        0x1abe24 -> :sswitch_31
        0x1abe65 -> :sswitch_38
        0x1abe7e -> :sswitch_15
        0x1abe83 -> :sswitch_9
        0x1abe9d -> :sswitch_75
        0x1abea0 -> :sswitch_59
        0x1ac165 -> :sswitch_25
        0x1ac16a -> :sswitch_74
        0x1ac16b -> :sswitch_1f
        0x1ac185 -> :sswitch_45
        0x1ac18a -> :sswitch_61
        0x1ac1ab -> :sswitch_3b
        0x1ac1ac -> :sswitch_6
        0x1ac1c5 -> :sswitch_10
        0x1ac201 -> :sswitch_98
        0x1ac242 -> :sswitch_56
        0x1ac261 -> :sswitch_96
        0x1ac548 -> :sswitch_60
        0x1ac549 -> :sswitch_57
        0x1ac54b -> :sswitch_28
        0x1ac58b -> :sswitch_74
        0x1ac5a9 -> :sswitch_1a
        0x1ac5c1 -> :sswitch_63
        0x1ac5c4 -> :sswitch_25
        0x1ac5e1 -> :sswitch_16
        0x1ac5e2 -> :sswitch_30
        0x1ac5e9 -> :sswitch_8f
        0x1ac5ff -> :sswitch_52
        0x1ac604 -> :sswitch_3e
        0x1ac606 -> :sswitch_47
        0x1ac626 -> :sswitch_9b
        0x1ac8ec -> :sswitch_a1
        0x1ac8ed -> :sswitch_7
        0x1ac909 -> :sswitch_a1
        0x1ac92c -> :sswitch_42
        0x1ac94d -> :sswitch_44
        0x1ac964 -> :sswitch_98
        0x1ac966 -> :sswitch_21
        0x1ac969 -> :sswitch_6f
        0x1ac96a -> :sswitch_9e
        0x1ac96c -> :sswitch_2b
        0x1ac9a7 -> :sswitch_2
        0x1ac9e6 -> :sswitch_3
        0x1ac9e8 -> :sswitch_24
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
