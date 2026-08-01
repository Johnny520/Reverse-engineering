.class public final Lx9;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public final a:Lp00;

.field public final b:J


# direct methods
.method public constructor <init>(Lp00;J)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e8\u06e8\u06e8"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const-string v0, "\u06e6\u06e6\u06e7"

    :goto_1
    invoke-static {v0}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    iput-object p1, p0, Lx9;->a:Lp00;

    sget v0, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    or-int/lit16 v2, v2, 0x210d

    or-int/2addr v0, v2

    if-gtz v0, :cond_1

    const/4 v0, 0x7

    sput v0, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    const-string v0, "\u06e8\u06e8\u06e8"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    div-int/2addr v0, v2

    const v2, 0x1aaf00

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    const-string v0, "w4"

    invoke-static {v0}, Landroid/app/۟ۡۧۦۡ;->ۣۡۧۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget v1, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v2, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    mul-int/2addr v1, v2

    const v2, 0x1b4f62

    add-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :sswitch_3
    sget v0, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    if-ltz v0, :cond_2

    const/16 v0, 0x24

    sput v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    const-string v0, "\u06e1\u06e6\u06e2"

    goto :goto_1

    :cond_2
    sget v0, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    or-int/2addr v0, v2

    const v2, 0x1acb0d

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sub-int/2addr v0, v2

    const v2, 0x1ac3bf

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    move-result v0

    if-ltz v0, :cond_0

    sget v0, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    or-int/lit16 v2, v2, -0xe96

    mul-int/2addr v0, v2

    if-gtz v0, :cond_3

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    const-string v0, "\u06e5\u06e7\u06e7"

    invoke-static {v0}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e5\u06e7\u06e7"

    goto :goto_1

    :sswitch_6
    iput-wide p2, p0, Lx9;->b:J

    sget v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    if-ltz v0, :cond_4

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    :cond_4
    const-string v0, "\u06e8\u06e8\u06e0"

    invoke-static {v0}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_7
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc08 -> :sswitch_0
        0x1aaf03 -> :sswitch_6
        0x1abe85 -> :sswitch_2
        0x1ac149 -> :sswitch_3
        0x1ac227 -> :sswitch_7
        0x1ac5e2 -> :sswitch_4
        0x1ac9e0 -> :sswitch_5
        0x1ac9e8 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 26

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v15, 0x0

    const/4 v6, 0x0

    const/4 v14, 0x0

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/16 v17, 0x0

    const/4 v3, 0x0

    const/16 v16, 0x0

    const/4 v7, 0x0

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v5, 0x0

    const-string v18, "\u06e4\u06e3\u06e0"

    invoke-static/range {v18 .. v18}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v21

    move-object/from16 v18, v2

    move-object/from16 v19, v8

    move-object/from16 v20, v10

    :goto_0
    sparse-switch v21, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-boolean v2, v12, Lo40;->e:Z

    if-nez v2, :cond_c

    iget-object v2, v12, Lo40;->j:Ljava/util/ArrayList;

    sget v8, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    if-ltz v8, :cond_16

    move-object v8, v14

    :goto_1
    const-string v10, "\u06e4\u06e6\u06e6"

    move-object v14, v8

    :goto_2
    invoke-static {v10}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v8

    move-object v13, v2

    move/from16 v21, v8

    goto :goto_0

    :sswitch_1
    move-object v2, v5

    :cond_0
    sget v5, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v8, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    mul-int/lit16 v8, v8, -0x15d4

    or-int/2addr v5, v8

    if-gtz v5, :cond_1

    const/16 v5, 0x60

    sput v5, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    const-string v5, "\u06e0\u06e6\u06e6"

    invoke-static {v5}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v8

    move-object v5, v2

    move/from16 v21, v8

    goto :goto_0

    :cond_1
    sget v5, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v8, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    rem-int/2addr v5, v8

    const v8, -0xdef5

    xor-int/2addr v8, v5

    move-object v5, v2

    move/from16 v21, v8

    goto :goto_0

    :sswitch_2
    const-string v2, "\u06e3\u06e5\u06e4"

    :goto_3
    invoke-static {v2}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto :goto_0

    :cond_2
    :sswitch_3
    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v8, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    add-int/lit16 v8, v8, 0x59c

    div-int/2addr v2, v8

    if-eqz v2, :cond_3

    const-string v2, "\u06e1\u06e0\u06e0"

    :goto_4
    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto :goto_0

    :cond_3
    const-string v2, "\u06e7\u06e4\u06e4"

    goto :goto_4

    :sswitch_4
    const v2, 0x3f19999a    # 0.6f

    invoke-virtual {v5, v2}, Lp40;->a(F)V

    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    move-result v2

    if-gtz v2, :cond_4

    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    const-string v2, "\u06e3\u06e2\u06e5"

    invoke-static {v2}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto :goto_0

    :cond_4
    const-string v2, "\u06e8\u06e6"

    invoke-static {v2}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto :goto_0

    :sswitch_5
    iget-object v2, v9, Lo40;->k:Lp40;

    if-eqz v2, :cond_0

    sget v5, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v8, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    or-int/lit16 v8, v8, 0xe2

    or-int/2addr v5, v8

    if-gtz v5, :cond_5

    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    const-string v5, "\u06e1\u06e5"

    invoke-static {v5}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v8

    move-object v5, v2

    move/from16 v21, v8

    goto/16 :goto_0

    :cond_5
    sget v5, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v8, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    add-int/2addr v5, v8

    const v8, 0x1ab96e

    add-int/2addr v8, v5

    move-object v5, v2

    move/from16 v21, v8

    goto/16 :goto_0

    :cond_6
    move-object v2, v6

    :goto_5
    sget v7, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v8, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    rem-int/lit16 v8, v8, -0x69a

    rem-int/2addr v7, v8

    if-gtz v7, :cond_7

    const-string v7, "\u06e6\u06e0\u06e1"

    move-object v8, v7

    move-object v10, v2

    :goto_6
    invoke-static {v8}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v7, v10

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_7
    sget v7, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v8, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    add-int/2addr v7, v8

    const v8, 0x1ac0f3

    add-int/2addr v8, v7

    move-object v7, v2

    move/from16 v21, v8

    goto/16 :goto_0

    :sswitch_6
    const/high16 v2, 0x3f800000    # 1.0f

    float-to-double v0, v2

    move-wide/from16 v22, v0

    move-wide/from16 v0, v22

    iput-wide v0, v5, Lp40;->i:D

    const/high16 v2, 0x43960000    # 300.0f

    invoke-virtual {v5, v2}, Lp40;->b(F)V

    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    move-result v2

    if-ltz v2, :cond_9

    :cond_8
    const-string v2, "\u06e6\u06e7\u06e0"

    invoke-static {v2}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_9
    sget v2, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v8, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    mul-int/2addr v2, v8

    const v8, -0x1a55c4

    xor-int/2addr v2, v8

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v0, v20

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    move/from16 v0, v17

    invoke-virtual {v2, v0, v12}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-static {}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۦۣ۠()I

    move-result v2

    if-ltz v2, :cond_a

    const/4 v2, 0x5

    sput v2, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    const-string v2, "\u06e3\u06e8\u06e4"

    invoke-static {v2}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v2

    move-object v9, v12

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_a
    sget v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v8, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    mul-int/2addr v2, v8

    const v8, 0x10f4e0

    add-int/2addr v2, v8

    move-object v9, v12

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_8
    const/4 v6, 0x0

    if-eqz v15, :cond_23

    const-string v2, "\u06e6\u06e4\u06e2"

    invoke-static {v2}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_9
    sget v2, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v8, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    div-int/lit16 v8, v8, 0x222

    sub-int/2addr v2, v8

    if-ltz v2, :cond_b

    const-string v2, "\u06e8\u06e6\u06e4"

    invoke-static {v2}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_b
    const-string v2, "\u06e7\u06e6\u06e1"

    move/from16 v8, v17

    :goto_7
    invoke-static {v2}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v17, v8

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_a
    new-instance v8, Lo40;

    move-object/from16 v0, v20

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    sget-object v10, Lo40;->o:Lsh;

    invoke-direct {v8, v2, v10}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    new-instance v2, Lp40;

    invoke-direct {v2}, Lp40;-><init>()V

    iput-object v2, v8, Lo40;->k:Lp40;

    const-string v2, "\u06e3\u06e8\u06e4"

    :goto_8
    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v12, v8

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_b
    new-instance v2, Lfo;

    sget v8, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    xor-int/lit16 v8, v8, -0x209

    move-object/from16 v0, v20

    invoke-direct {v2, v0, v9, v8}, Lfo;-><init>(Ljava/lang/Object;Lo40;I)V

    invoke-virtual {v9, v2}, Lo40;->a(Luh;)V

    invoke-virtual {v9}, Lo40;->h()V

    sget v2, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v8, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    add-int/2addr v2, v8

    const v8, 0x1ac1f1

    add-int/2addr v2, v8

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_c
    :sswitch_c
    sget v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    if-ltz v2, :cond_d

    const-string v2, "\u06e0\u06e1\u06e3"

    invoke-static {v2}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_d
    const-string v2, "\u06e4\u06df\u06e4"

    invoke-static {v2}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_d
    move-object/from16 v0, v20

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v8, 0x3f59999a    # 0.85f

    invoke-virtual {v2, v8}, Landroid/view/View;->setScaleX(F)V

    move-object/from16 v0, v20

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v8, 0x3f59999a    # 0.85f

    invoke-virtual {v2, v8}, Landroid/view/View;->setScaleY(F)V

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    move-result v2

    if-gtz v2, :cond_e

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    move-object v2, v11

    :goto_9
    const-string v8, "\u06e5\u06e8"

    invoke-static {v8}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v8

    move-object v11, v2

    move/from16 v21, v8

    goto/16 :goto_0

    :cond_e
    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v8, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    or-int/2addr v2, v8

    const v8, 0xdd31

    add-int/2addr v2, v8

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_e
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v22

    move-object/from16 v0, p0

    iget-wide v0, v0, Lx9;->b:J

    move-wide/from16 v24, v0

    cmp-long v2, v22, v24

    if-eqz v2, :cond_13

    const-string v2, "\u06e1\u06e1\u06e5"

    move-object v8, v12

    goto/16 :goto_8

    :cond_f
    move-object v9, v7

    :sswitch_f
    sget v2, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v8, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    xor-int/lit16 v8, v8, -0x1a11

    xor-int/2addr v2, v8

    if-gtz v2, :cond_10

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    const-string v2, "\u06e4\u06e3\u06e2"

    move-object v8, v12

    goto/16 :goto_8

    :cond_10
    const-string v2, "\u06e3\u06e2\u06e5"

    move-object v8, v2

    move-object v10, v7

    goto/16 :goto_6

    :sswitch_10
    if-nez v11, :cond_15

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    move-result v2

    if-ltz v2, :cond_8

    const-string v2, "\u06e6\u06e4\u06e7"

    invoke-static {v2}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_11
    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v7, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    or-int/lit16 v7, v7, 0x120c

    mul-int/2addr v2, v7

    if-gtz v2, :cond_11

    invoke-static {}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦۥۣۥ()I

    const-string v2, "\u06e7\u06e2\u06e0"

    invoke-static {v2}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v7, v16

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_11
    move-object/from16 v7, v16

    :cond_12
    const-string v2, "\u06e5\u06df\u06e6"

    invoke-static {v2}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_13
    :sswitch_12
    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    move-result v2

    if-gtz v2, :cond_14

    const-string v2, "\u06e6\u06e7\u06e8"

    invoke-static {v2}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_14
    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v8, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    div-int/2addr v2, v8

    const v8, 0x1aab64

    xor-int/2addr v2, v8

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_15
    :sswitch_13
    const-string v2, "\u06e8\u06e3\u06e0"

    invoke-static {v2}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_14
    new-instance v2, Ljava/lang/UnsupportedOperationException;

    const-string v3, "Error: Update listeners must be added beforethe animation."

    invoke-direct {v2, v3}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_16
    const-string v8, "\u06e6\u06e2\u06e2"

    invoke-static {v8}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v8

    move-object v13, v2

    move/from16 v21, v8

    goto/16 :goto_0

    :sswitch_15
    move-object v2, v3

    check-cast v2, Lo40;

    :goto_a
    const-string v8, "\u06e6\u06e4\u06e0"

    invoke-static {v8}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v16, v2

    move/from16 v21, v8

    goto/16 :goto_0

    :sswitch_16
    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v8, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    mul-int/lit16 v8, v8, -0x37c

    or-int/2addr v2, v8

    if-ltz v2, :cond_17

    const-string v2, "\u06e5\u06e8\u06e0"

    invoke-static {v2}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_17
    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v8, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    xor-int/2addr v2, v8

    const v8, 0x1ab275

    add-int/2addr v2, v8

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_17
    move-object/from16 v0, v18

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v8, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    xor-int/lit16 v8, v8, 0x11c5

    sub-int/2addr v2, v8

    if-gtz v2, :cond_18

    const/16 v2, 0x11

    sput v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    move-object/from16 v2, v16

    goto :goto_a

    :cond_18
    const-string v2, "\u06df\u06e5\u06e5"

    move-object v8, v12

    goto/16 :goto_8

    :sswitch_18
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۤ۠ۤۢ()I

    move-result v2

    if-ltz v2, :cond_19

    const/16 v2, 0x28

    sput v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    const-string v2, "\u06e4\u06e8\u06e7"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_19
    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v8, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    mul-int/2addr v2, v8

    const v8, 0x1b0e82

    add-int/2addr v2, v8

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_19
    move-object v2, v4

    check-cast v2, Ljava/lang/Long;

    goto/16 :goto_9

    :sswitch_1a
    move-object/from16 v0, v18

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v8, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    rem-int/lit16 v8, v8, -0x1016

    mul-int/2addr v2, v8

    if-lez v2, :cond_12

    const-string v2, "\u06e7\u06e4\u06e4"

    :goto_b
    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_1b
    const-string v2, "\u06e6\u06e7\u06e2"

    move-object v8, v12

    goto/16 :goto_8

    :sswitch_1c
    move-object/from16 v0, v20

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v4, 0x7e06038d

    sget v8, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    xor-int/2addr v4, v8

    invoke-virtual {v2, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v4

    instance-of v15, v4, Ljava/lang/Long;

    sget v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v8, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    add-int/lit16 v8, v8, 0x1fb8

    sub-int/2addr v2, v8

    if-ltz v2, :cond_1a

    const/16 v2, 0x1f

    sput v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    const-string v2, "\u06e1\u06e1\u06e5"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_1a
    const-string v8, "\u06e6\u06e4\u06e1"

    move-object v2, v13

    move-object v10, v8

    goto/16 :goto_2

    :sswitch_1d
    const v2, 0x3b03126f    # 0.002f

    invoke-virtual {v12, v2}, Lo40;->f(F)V

    new-instance v2, Lw9;

    const/4 v8, 0x0

    move-object/from16 v0, v20

    invoke-direct {v2, v8, v0}, Lw9;-><init>(ILjava/lang/Object;)V

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    move-result v8

    if-gtz v8, :cond_1b

    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    const-string v8, "\u06e4\u06e1\u06e6"

    invoke-static {v8}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v18, v2

    move/from16 v21, v8

    goto/16 :goto_0

    :cond_1b
    sget v8, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v10, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    xor-int/2addr v8, v10

    const v10, 0xd9d3

    add-int/2addr v8, v10

    move-object/from16 v18, v2

    move/from16 v21, v8

    goto/16 :goto_0

    :sswitch_1e
    if-nez v7, :cond_f

    sget v2, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v8, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    add-int/2addr v2, v8

    const v8, -0x1aa713

    xor-int/2addr v2, v8

    move-object v9, v7

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_1f
    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v8, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    div-int/lit16 v8, v8, -0x1394

    xor-int/2addr v2, v8

    if-ltz v2, :cond_1c

    const/16 v2, 0x42

    sput v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    const-string v2, "\u06e4\u06e1\u06e3"

    goto/16 :goto_3

    :cond_1c
    const-string v2, "\u06e4\u06e3\u06e0"

    goto/16 :goto_3

    :sswitch_20
    move-object/from16 v0, p0

    iget-object v8, v0, Lx9;->a:Lp00;

    iget-object v2, v8, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    move-result v2

    if-gtz v2, :cond_1d

    const/16 v2, 0x52

    sput v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    const-string v2, "\u06e0\u06e3\u06e8"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v20, v8

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_1d
    sget v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v10, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    xor-int/2addr v2, v10

    const v10, 0x1acdd7

    add-int/2addr v2, v10

    move-object/from16 v20, v8

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_21
    const/4 v2, 0x1

    :goto_c
    return v2

    :sswitch_22
    instance-of v2, v3, Lo40;

    if-eqz v2, :cond_6

    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v7, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    add-int/lit16 v7, v7, -0x16e

    add-int/2addr v2, v7

    if-ltz v2, :cond_1e

    const/16 v2, 0x9

    sput v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    const-string v2, "\u06e3\u06e1\u06df"

    invoke-static {v2}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v7, v6

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_1e
    sget v2, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v7, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    mul-int/2addr v2, v7

    const v7, 0x2411a4

    add-int/2addr v2, v7

    move-object v7, v6

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_23
    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    move-result v2

    if-gtz v2, :cond_1f

    :cond_1f
    const-string v2, "\u06e3\u06e5\u06e4"

    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v11, v14

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_24
    const/4 v2, 0x1

    goto :goto_c

    :sswitch_25
    const v2, -0x7e08001d

    sget v3, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    xor-int v8, v2, v3

    move-object/from16 v0, v19

    invoke-virtual {v0, v8}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    sget v2, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v10, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    add-int/lit16 v10, v10, -0x1bdc

    xor-int/2addr v2, v10

    if-gtz v2, :cond_20

    const/16 v2, 0x4b

    sput v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    const-string v2, "\u06e3\u06e2\u06e4"

    goto/16 :goto_7

    :cond_20
    sget v2, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v10, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    add-int/2addr v2, v10

    const v10, -0x1ac9ce

    xor-int/2addr v2, v10

    move/from16 v17, v8

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_26
    const/4 v8, 0x0

    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    if-ltz v2, :cond_21

    const-string v2, "\u06e7\u06e5\u06e4"

    move-object v14, v8

    goto/16 :goto_b

    :cond_21
    move-object v2, v13

    goto/16 :goto_1

    :sswitch_27
    move-object/from16 v0, v20

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const/4 v8, 0x0

    invoke-virtual {v2, v8}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const/4 v8, 0x0

    invoke-virtual {v2, v8}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-virtual {v2, v8}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const-wide/16 v22, 0x296

    sget v8, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    int-to-long v0, v8

    move-wide/from16 v24, v0

    xor-long v22, v22, v24

    move-wide/from16 v0, v22

    invoke-virtual {v2, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    move-object/from16 v0, v20

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    move-result v8

    if-gtz v8, :cond_22

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    const-string v8, "\u06e0\u06e4\u06e8"

    invoke-static {v8}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v19, v2

    move/from16 v21, v8

    goto/16 :goto_0

    :cond_22
    sget v8, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v10, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    div-int/2addr v8, v10

    const v10, 0x1ab62a

    add-int/2addr v8, v10

    move-object/from16 v19, v2

    move/from16 v21, v8

    goto/16 :goto_0

    :cond_23
    :sswitch_28
    sget v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v8, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    add-int/lit16 v8, v8, 0x714

    div-int/2addr v2, v8

    if-eqz v2, :cond_24

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    const-string v2, "\u06e7\u06e6\u06df"

    invoke-static {v2}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_24
    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v8, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sub-int/2addr v2, v8

    const v8, 0x1ab766

    xor-int/2addr v2, v8

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_29
    move-object v2, v7

    goto/16 :goto_5

    :sswitch_data_0
    .sparse-switch
        0xdc23 -> :sswitch_0
        0xdc24 -> :sswitch_5
        0xdca3 -> :sswitch_18
        0xdcfe -> :sswitch_b
        0x1aa707 -> :sswitch_12
        0x1aa783 -> :sswitch_a
        0x1aa7bf -> :sswitch_1a
        0x1aab45 -> :sswitch_16
        0x1aab64 -> :sswitch_27
        0x1aae84 -> :sswitch_28
        0x1aaec5 -> :sswitch_21
        0x1ab60a -> :sswitch_f
        0x1ab62b -> :sswitch_25
        0x1ab641 -> :sswitch_3
        0x1ab665 -> :sswitch_1
        0x1ab666 -> :sswitch_d
        0x1ab6bd -> :sswitch_26
        0x1ab6c2 -> :sswitch_10
        0x1ab6fd -> :sswitch_1f
        0x1ab71f -> :sswitch_1d
        0x1ab9c9 -> :sswitch_14
        0x1aba08 -> :sswitch_6
        0x1aba09 -> :sswitch_4
        0x1aba41 -> :sswitch_20
        0x1aba66 -> :sswitch_2
        0x1abaa4 -> :sswitch_23
        0x1abae3 -> :sswitch_2
        0x1abd8c -> :sswitch_1e
        0x1abde5 -> :sswitch_24
        0x1ac1a6 -> :sswitch_17
        0x1ac1e2 -> :sswitch_11
        0x1ac1e3 -> :sswitch_8
        0x1ac1e4 -> :sswitch_19
        0x1ac1e9 -> :sswitch_15
        0x1ac23f -> :sswitch_1b
        0x1ac241 -> :sswitch_16
        0x1ac52b -> :sswitch_13
        0x1ac565 -> :sswitch_9
        0x1ac5a7 -> :sswitch_7
        0x1ac5c6 -> :sswitch_c
        0x1ac5e1 -> :sswitch_29
        0x1ac5e2 -> :sswitch_f
        0x1ac945 -> :sswitch_e
        0x1ac9a6 -> :sswitch_22
        0x1ac9e3 -> :sswitch_1c
    .end sparse-switch
.end method
