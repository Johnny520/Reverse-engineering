.class public final synthetic Lb6;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final a:I

.field public final b:Landroid/app/Dialog;

.field public final c:Landroid/widget/LinearLayout;


# direct methods
.method public synthetic constructor <init>(ILandroid/app/Dialog;Landroid/widget/LinearLayout;)V
    .locals 3

    iput p1, p0, Lb6;->a:I

    iput-object p2, p0, Lb6;->b:Landroid/app/Dialog;

    iput-object p3, p0, Lb6;->c:Landroid/widget/LinearLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e4\u06e4\u06e0"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "Zk4NhBPL6yo31CqC08cf"

    invoke-static {v0}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۡۡۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    const-string v1, "\u06e3\u06e0\u06e0"

    :goto_1
    invoke-static {v1}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    rem-int/lit16 v2, v2, 0x1f0d

    or-int/2addr v1, v2

    if-ltz v1, :cond_0

    const-string v1, "\u06e3\u06e0\u06e0"

    invoke-static {v1}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    sget v1, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    div-int/2addr v1, v2

    const v2, 0x1ac5c5

    add-int/2addr v1, v2

    goto :goto_0

    :cond_1
    :sswitch_2
    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    move-result v1

    if-ltz v1, :cond_2

    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    const-string v1, "\u06df\u06e1\u06e8"

    invoke-static {v1}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    sget v1, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sub-int/2addr v1, v2

    const v2, 0x1ac9f0

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    move-result v1

    if-ltz v1, :cond_3

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    const-string v1, "\u06e8\u06e4\u06e7"

    goto :goto_1

    :cond_3
    const-string v1, "\u06e4\u06e4\u06e0"

    goto :goto_1

    :sswitch_4
    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    move-result v1

    if-ltz v1, :cond_1

    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    move-result v1

    if-gtz v1, :cond_4

    invoke-static {}, Lcom/google/android/material/button/ۥۤ۠;->۠۠ۨۢ()I

    const-string v1, "\u06e3\u06e2\u06df"

    invoke-static {v1}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_4
    sget v1, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    div-int/2addr v1, v2

    const v2, -0x1aa77e

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa77d -> :sswitch_0
        0x1ab342 -> :sswitch_3
        0x1ab623 -> :sswitch_1
        0x1ab660 -> :sswitch_2
        0x1aba60 -> :sswitch_4
        0x1ac5c3 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 20

    const/4 v14, 0x0

    const/4 v3, 0x0

    const/4 v15, 0x0

    const/4 v7, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v4, 0x0

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const-string v10, "\u06e5\u06e0\u06e5"

    invoke-static {v10}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v16

    move-object v10, v2

    move-object v11, v9

    :goto_0
    sparse-switch v16, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v9, 0x43480000    # 200.0f

    const v16, 0x3f19999a    # 0.6f

    move/from16 v0, v16

    invoke-static {v2, v9, v0}, Lg40;->f(FFF)Lp40;

    move-result-object v2

    iput-object v2, v10, Lo40;->k:Lp40;

    new-instance v2, Lon;

    sget v9, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    xor-int/lit16 v9, v9, -0x31c

    invoke-direct {v2, v4, v9}, Lon;-><init>(Landroid/widget/LinearLayout;I)V

    invoke-virtual {v10, v2}, Lo40;->a(Luh;)V

    invoke-virtual {v10}, Lo40;->h()V

    invoke-static {}, Landroidx/activity/result/۟ۡۤۦۡ;->۟۟۟ۥۤ()I

    move-result v2

    if-gtz v2, :cond_1

    const/16 v2, 0x15

    sput v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    const-string v2, "\u06e0\u06e2\u06e2"

    invoke-static {v2}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v16, v2

    goto :goto_0

    :sswitch_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lb6;->b:Landroid/app/Dialog;

    invoke-static {v2}, Lqn;->a(Landroid/app/Dialog;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lb6;->c:Landroid/widget/LinearLayout;

    const/high16 v9, 0x44fa0000    # 2000.0f

    invoke-virtual {v2, v9}, Landroid/view/View;->setTranslationY(F)V

    sget v9, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v14, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    mul-int/2addr v9, v14

    const v14, 0x1c671d

    xor-int/2addr v9, v14

    move-object v14, v2

    move/from16 v16, v9

    goto :goto_0

    :sswitch_2
    new-instance v2, Lo40;

    sget-object v9, Lo40;->o:Lsh;

    invoke-direct {v2, v13, v9}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    const/high16 v9, 0x3f800000    # 1.0f

    const/high16 v16, 0x43480000    # 200.0f

    const v17, 0x3f19999a    # 0.6f

    move/from16 v0, v16

    move/from16 v1, v17

    invoke-static {v9, v0, v1}, Lg40;->f(FFF)Lp40;

    move-result-object v9

    iput-object v9, v2, Lo40;->k:Lp40;

    invoke-virtual {v2}, Lo40;->h()V

    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v9, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    rem-int/lit16 v9, v9, 0x1a9f

    xor-int/2addr v2, v9

    if-ltz v2, :cond_0

    const/16 v2, 0x58

    sput v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    const-string v2, "\u06e8\u06e0\u06e6"

    invoke-static {v2}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v16, v2

    goto/16 :goto_0

    :cond_0
    const-string v2, "\u06e5\u06e6\u06e3"

    :goto_1
    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v16, v2

    goto/16 :goto_0

    :cond_1
    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v9, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    rem-int/2addr v2, v9

    const v9, 0x1ac584

    add-int/2addr v2, v9

    move/from16 v16, v2

    goto/16 :goto_0

    :sswitch_3
    move-object/from16 v0, p0

    iget-object v2, v0, Lb6;->b:Landroid/app/Dialog;

    invoke-static {v2}, Lqn;->a(Landroid/app/Dialog;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lb6;->c:Landroid/widget/LinearLayout;

    const v9, 0x3f19999a    # 0.6f

    invoke-virtual {v2, v9}, Landroid/view/View;->setScaleX(F)V

    const-string v9, "\u06e1\u06e2\u06df"

    invoke-static {v9}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v9

    move-object v15, v2

    move/from16 v16, v9

    goto/16 :goto_0

    :sswitch_4
    xor-int/lit16 v2, v7, 0xb2

    const/4 v8, 0x0

    invoke-virtual {v6, v2, v8}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    const/high16 v2, 0x44480000    # 800.0f

    invoke-virtual {v6, v2}, Landroid/view/View;->setTranslationY(F)V

    new-instance v2, Lo40;

    sget-object v8, Lo40;->n:Lsh;

    invoke-direct {v2, v6, v8}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    sget v8, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    if-ltz v8, :cond_2

    const/16 v8, 0xb

    sput v8, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    const-string v8, "\u06e5\u06e0\u06e4"

    invoke-static {v8}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v9

    move-object v8, v2

    move/from16 v16, v9

    goto/16 :goto_0

    :cond_2
    const-string v9, "\u06df\u06e8\u06e3"

    move-object v8, v2

    :goto_2
    invoke-static {v9}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v16, v2

    goto/16 :goto_0

    :sswitch_5
    new-instance v2, Lo40;

    sget-object v9, Lo40;->p:Lsh;

    invoke-direct {v2, v15, v9}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    const/high16 v9, 0x3f800000    # 1.0f

    const/high16 v16, 0x43480000    # 200.0f

    const v17, 0x3f19999a    # 0.6f

    move/from16 v0, v16

    move/from16 v1, v17

    invoke-static {v9, v0, v1}, Lg40;->f(FFF)Lp40;

    move-result-object v9

    iput-object v9, v2, Lo40;->k:Lp40;

    invoke-virtual {v2}, Lo40;->h()V

    invoke-static {}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۥۧۤ۠()I

    move-result v2

    if-ltz v2, :cond_3

    const/16 v2, 0x9

    sput v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    const-string v2, "\u06e0\u06e2\u06df"

    invoke-static {v2}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v16, v2

    goto/16 :goto_0

    :cond_3
    const-string v2, "\u06e1\u06e7\u06df"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v16, v2

    goto/16 :goto_0

    :cond_4
    :sswitch_6
    const-string v2, "\u06e7\u06e2\u06e5"

    :goto_3
    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v16, v2

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v0, p0

    iget v2, v0, Lb6;->a:I

    packed-switch v2, :pswitch_data_0

    :sswitch_8
    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    move-result v2

    if-ltz v2, :cond_5

    const/4 v2, 0x7

    sput v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    const-string v2, "\u06e2\u06e1\u06e4"

    :goto_4
    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v16, v2

    goto/16 :goto_0

    :cond_5
    const-string v2, "\u06e5\u06e4\u06e5"

    invoke-static {v2}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v16, v2

    goto/16 :goto_0

    :sswitch_9
    const v2, 0x3f19999a    # 0.6f

    invoke-virtual {v15, v2}, Landroid/view/View;->setScaleY(F)V

    const/4 v2, 0x0

    invoke-virtual {v15, v2}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {v15}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-virtual {v2, v9}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const-wide/16 v16, -0x103

    sget v9, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    int-to-long v0, v9

    move-wide/from16 v18, v0

    xor-long v16, v16, v18

    move-wide/from16 v0, v16

    invoke-virtual {v2, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    sget v2, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    if-ltz v2, :cond_12

    const/16 v2, 0x22

    sput v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    const-string v2, "\u06e4\u06e1\u06e8"

    invoke-static {v2}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v16, v2

    goto/16 :goto_0

    :sswitch_a
    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v9, 0x43480000    # 200.0f

    const v10, 0x3f19999a    # 0.6f

    invoke-static {v2, v9, v10}, Lg40;->f(FFF)Lp40;

    move-result-object v2

    iput-object v2, v12, Lo40;->k:Lp40;

    invoke-virtual {v12}, Lo40;->h()V

    new-instance v2, Lo40;

    sget-object v9, Lo40;->p:Lsh;

    invoke-direct {v2, v4, v9}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۢ۠۟ۨ()I

    move-result v9

    if-ltz v9, :cond_6

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۤ۠ۤۢ()I

    const-string v9, "\u06e2\u06e7\u06e0"

    invoke-static {v9}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v9

    move-object v10, v2

    move/from16 v16, v9

    goto/16 :goto_0

    :cond_6
    sget v9, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v10, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sub-int/2addr v9, v10

    const v10, -0xdb0f

    xor-int/2addr v9, v10

    move-object v10, v2

    move/from16 v16, v9

    goto/16 :goto_0

    :pswitch_0
    :sswitch_b
    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v9, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    xor-int/lit16 v9, v9, 0xf6b

    or-int/2addr v2, v9

    if-ltz v2, :cond_7

    const/16 v2, 0x4a

    sput v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    const-string v2, "\u06e2\u06e8\u06e1"

    :goto_5
    invoke-static {v2}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v16, v2

    goto/16 :goto_0

    :cond_7
    const-string v2, "\u06e0\u06e2\u06e2"

    goto :goto_5

    :sswitch_c
    move-object/from16 v0, p0

    iget-object v2, v0, Lb6;->b:Landroid/app/Dialog;

    invoke-static {v2}, Lqn;->a(Landroid/app/Dialog;)V

    sget v5, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    move-object/from16 v0, p0

    iget-object v4, v0, Lb6;->c:Landroid/widget/LinearLayout;

    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    if-ltz v2, :cond_9

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    move-object v2, v3

    :cond_8
    const-string v3, "\u06e6\u06e4\u06df"

    invoke-static {v3}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v9

    move-object v3, v2

    move/from16 v16, v9

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u06e8\u06e8\u06e1"

    :goto_6
    invoke-static {v2}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v16, v2

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    move-result v2

    if-ltz v2, :cond_4

    const-string v2, "XG"

    invoke-static {v2}, Landroidx/activity/۟ۥۥۧ۠;->ۦۡ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    if-ltz v3, :cond_8

    const/16 v3, 0x56

    sput v3, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    const-string v3, "\u06e8\u06e7\u06df"

    invoke-static {v3}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v9

    move-object v3, v2

    move/from16 v16, v9

    goto/16 :goto_0

    :pswitch_1
    :sswitch_e
    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    if-ltz v2, :cond_a

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    const-string v2, "\u06e4\u06e4\u06e5"

    invoke-static {v2}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v16, v2

    goto/16 :goto_0

    :cond_a
    sget v2, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v9, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sub-int/2addr v2, v9

    const v9, 0x1aacc3

    add-int/2addr v2, v9

    move/from16 v16, v2

    goto/16 :goto_0

    :sswitch_f
    xor-int/lit8 v2, v5, 0x12

    const/4 v9, 0x0

    invoke-virtual {v4, v2, v9}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    const v2, 0x3f19999a    # 0.6f

    invoke-virtual {v4, v2}, Landroid/view/View;->setScaleX(F)V

    const v2, 0x3f19999a    # 0.6f

    invoke-virtual {v4, v2}, Landroid/view/View;->setScaleY(F)V

    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v9, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    add-int/lit16 v9, v9, -0x706

    rem-int/2addr v2, v9

    if-gtz v2, :cond_b

    const-string v2, "\u06e4\u06e3\u06e3"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v16, v2

    goto/16 :goto_0

    :cond_b
    sget v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v9, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    xor-int/2addr v2, v9

    const v9, 0x1ab364

    add-int/2addr v2, v9

    move/from16 v16, v2

    goto/16 :goto_0

    :sswitch_10
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v9, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    div-int/lit16 v9, v9, -0x11a1

    xor-int/2addr v2, v9

    if-ltz v2, :cond_c

    const/16 v2, 0x4e

    sput v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    const-string v2, "\u06e5\u06e0\u06e5"

    goto/16 :goto_6

    :cond_c
    sget v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v9, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    rem-int/2addr v2, v9

    const v9, 0x1ac4f3

    add-int/2addr v2, v9

    move/from16 v16, v2

    goto/16 :goto_0

    :sswitch_11
    const v2, 0x3f19999a    # 0.6f

    invoke-virtual {v11, v2}, Landroid/view/View;->setScaleY(F)V

    const/4 v2, 0x0

    invoke-virtual {v11, v2}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {v11}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-virtual {v2, v9}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const-wide/16 v16, 0x337

    sget v9, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    int-to-long v0, v9

    move-wide/from16 v18, v0

    xor-long v16, v16, v18

    move-wide/from16 v0, v16

    invoke-virtual {v2, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v9, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    add-int/lit16 v9, v9, -0xc86

    add-int/2addr v2, v9

    if-ltz v2, :cond_e

    const/16 v2, 0x2a

    sput v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    move-object v2, v6

    :cond_d
    const-string v9, "\u06e1\u06e8\u06e0"

    move-object v6, v2

    goto/16 :goto_2

    :cond_e
    const-string v2, "\u06e1\u06e2\u06e4"

    goto/16 :goto_4

    :sswitch_12
    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {v4}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-virtual {v2, v9}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const-wide/16 v16, 0x36b

    sget v9, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    int-to-long v0, v9

    move-wide/from16 v18, v0

    xor-long v16, v16, v18

    move-wide/from16 v0, v16

    invoke-virtual {v2, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    new-instance v2, Lo40;

    sget-object v9, Lo40;->o:Lsh;

    invoke-direct {v2, v4, v9}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    const-string v9, "\u06e4\u06e1\u06e8"

    invoke-static {v9}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v9

    move-object v12, v2

    move/from16 v16, v9

    goto/16 :goto_0

    :sswitch_13
    new-instance v2, Lo40;

    sget-object v9, Lo40;->p:Lsh;

    invoke-direct {v2, v13, v9}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    const/high16 v9, 0x3f800000    # 1.0f

    const/high16 v16, 0x43480000    # 200.0f

    const v17, 0x3f19999a    # 0.6f

    move/from16 v0, v16

    move/from16 v1, v17

    invoke-static {v9, v0, v1}, Lg40;->f(FFF)Lp40;

    move-result-object v9

    iput-object v9, v2, Lo40;->k:Lp40;

    invoke-virtual {v2}, Lo40;->h()V

    sget v2, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v9, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    rem-int/2addr v2, v9

    const v9, 0x1aaf62

    add-int/2addr v2, v9

    move/from16 v16, v2

    goto/16 :goto_0

    :sswitch_14
    move-object/from16 v0, p0

    iget-object v2, v0, Lb6;->b:Landroid/app/Dialog;

    invoke-static {v2}, Lqn;->a(Landroid/app/Dialog;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lb6;->c:Landroid/widget/LinearLayout;

    const v9, 0x3f19999a    # 0.6f

    invoke-virtual {v2, v9}, Landroid/view/View;->setScaleX(F)V

    sget v9, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v11, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    rem-int/2addr v9, v11

    const v11, 0x1ac26f

    add-int/2addr v9, v11

    move-object v11, v2

    move/from16 v16, v9

    goto/16 :goto_0

    :sswitch_15
    new-instance v2, Lo40;

    sget-object v9, Lo40;->p:Lsh;

    invoke-direct {v2, v11, v9}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    const/high16 v9, 0x3f800000    # 1.0f

    const/high16 v16, 0x43480000    # 200.0f

    const v17, 0x3f19999a    # 0.6f

    move/from16 v0, v16

    move/from16 v1, v17

    invoke-static {v9, v0, v1}, Lg40;->f(FFF)Lp40;

    move-result-object v9

    iput-object v9, v2, Lo40;->k:Lp40;

    invoke-virtual {v2}, Lo40;->h()V

    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v9, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    div-int/lit16 v9, v9, -0xf1c

    add-int/2addr v2, v9

    if-ltz v2, :cond_f

    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    const-string v2, "\u06e5\u06e2\u06e2"

    invoke-static {v2}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v16, v2

    goto/16 :goto_0

    :cond_f
    const-string v2, "\u06e0\u06e2\u06df"

    goto/16 :goto_3

    :sswitch_16
    move-object/from16 v0, p0

    iget-object v2, v0, Lb6;->b:Landroid/app/Dialog;

    invoke-static {v2}, Lqn;->a(Landroid/app/Dialog;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lb6;->c:Landroid/widget/LinearLayout;

    const v9, 0x3f19999a    # 0.6f

    invoke-virtual {v2, v9}, Landroid/view/View;->setScaleX(F)V

    invoke-static {}, Lcom/google/android/material/carousel/ۢۢۢۥ;->۟ۡ۟۠ۧ()I

    move-result v9

    if-gtz v9, :cond_10

    const/4 v9, 0x7

    sput v9, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    const-string v9, "\u06e5\u06e4\u06e5"

    invoke-static {v9}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v9

    move-object v13, v2

    move/from16 v16, v9

    goto/16 :goto_0

    :cond_10
    sget v9, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v13, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    or-int/2addr v9, v13

    const v13, 0x1ab31e

    add-int/2addr v9, v13

    move-object v13, v2

    move/from16 v16, v9

    goto/16 :goto_0

    :sswitch_17
    new-instance v2, Lo40;

    sget-object v9, Lo40;->o:Lsh;

    invoke-direct {v2, v15, v9}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    const/high16 v9, 0x3f800000    # 1.0f

    const/high16 v16, 0x43480000    # 200.0f

    const v17, 0x3f19999a    # 0.6f

    move/from16 v0, v16

    move/from16 v1, v17

    invoke-static {v9, v0, v1}, Lg40;->f(FFF)Lp40;

    move-result-object v9

    iput-object v9, v2, Lo40;->k:Lp40;

    invoke-virtual {v2}, Lo40;->h()V

    const-string v2, "\u06df\u06e3\u06e3"

    goto/16 :goto_5

    :pswitch_2
    :sswitch_18
    const-string v2, "\u06e2\u06e1\u06df"

    goto/16 :goto_5

    :sswitch_19
    const/4 v2, 0x0

    const/high16 v9, 0x43480000    # 200.0f

    const v16, 0x3f333333    # 0.7f

    move/from16 v0, v16

    invoke-static {v2, v9, v0}, Lg40;->f(FFF)Lp40;

    move-result-object v2

    iput-object v2, v8, Lo40;->k:Lp40;

    new-instance v2, Lon;

    const/4 v9, 0x0

    invoke-direct {v2, v6, v9}, Lon;-><init>(Landroid/widget/LinearLayout;I)V

    invoke-virtual {v8, v2}, Lo40;->a(Luh;)V

    invoke-virtual {v8}, Lo40;->h()V

    const-string v2, "\u06e1\u06e7\u06e1"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v16, v2

    goto/16 :goto_0

    :sswitch_1a
    move-object/from16 v0, p0

    iget-object v2, v0, Lb6;->b:Landroid/app/Dialog;

    invoke-static {v2}, Lqn;->a(Landroid/app/Dialog;)V

    sget v7, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    move-object/from16 v0, p0

    iget-object v2, v0, Lb6;->c:Landroid/widget/LinearLayout;

    sget v6, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v9, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    mul-int/lit16 v9, v9, -0x1617

    sub-int/2addr v6, v9

    if-gtz v6, :cond_d

    const-string v6, "\u06e0\u06e5\u06df"

    invoke-static {v6}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v9

    move-object v6, v2

    move/from16 v16, v9

    goto/16 :goto_0

    :pswitch_3
    :sswitch_1b
    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v9, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    add-int/lit16 v9, v9, 0x1929

    add-int/2addr v2, v9

    if-gtz v2, :cond_11

    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    const-string v2, "\u06e6\u06e0\u06e0"

    invoke-static {v2}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v16, v2

    goto/16 :goto_0

    :cond_11
    sget v2, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v9, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    or-int/2addr v2, v9

    const v9, 0x1abdcc

    add-int/2addr v2, v9

    move/from16 v16, v2

    goto/16 :goto_0

    :sswitch_1c
    new-instance v2, Lo40;

    sget-object v9, Lo40;->o:Lsh;

    invoke-direct {v2, v11, v9}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    const/high16 v9, 0x3f800000    # 1.0f

    const/high16 v16, 0x43480000    # 200.0f

    const v17, 0x3f19999a    # 0.6f

    move/from16 v0, v16

    move/from16 v1, v17

    invoke-static {v9, v0, v1}, Lg40;->f(FFF)Lp40;

    move-result-object v9

    iput-object v9, v2, Lo40;->k:Lp40;

    invoke-virtual {v2}, Lo40;->h()V

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    move-result v2

    if-ltz v2, :cond_13

    const/16 v2, 0x14

    sput v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    :cond_12
    const-string v2, "\u06e5\u06e6\u06e1"

    goto/16 :goto_1

    :cond_13
    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v9, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    rem-int/2addr v2, v9

    const v9, -0x1ab3f8

    xor-int/2addr v2, v9

    move/from16 v16, v2

    goto/16 :goto_0

    :sswitch_1d
    sget v2, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v9, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    xor-int/lit16 v9, v9, -0x25c2

    xor-int/2addr v2, v9

    if-ltz v2, :cond_14

    const-string v2, "\u06e4\u06e0\u06e7"

    goto/16 :goto_3

    :cond_14
    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v9, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sub-int/2addr v2, v9

    const v9, 0x1ac049

    add-int/2addr v2, v9

    move/from16 v16, v2

    goto/16 :goto_0

    :sswitch_1e
    const v2, 0x3f19999a    # 0.6f

    invoke-virtual {v13, v2}, Landroid/view/View;->setScaleY(F)V

    const/4 v2, 0x0

    invoke-virtual {v13, v2}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {v13}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-virtual {v2, v9}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const-wide/16 v16, -0x99

    sget v9, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    int-to-long v0, v9

    move-wide/from16 v18, v0

    xor-long v16, v16, v18

    move-wide/from16 v0, v16

    invoke-virtual {v2, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    sget v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    if-gtz v2, :cond_15

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟ۡۡۦ()I

    const-string v2, "\u06e8\u06e0\u06e3"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v16, v2

    goto/16 :goto_0

    :cond_15
    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v9, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    div-int/2addr v2, v9

    const v9, 0x1ab9c9

    add-int/2addr v2, v9

    move/from16 v16, v2

    goto/16 :goto_0

    :sswitch_1f
    new-instance v2, Lo40;

    sget-object v9, Lo40;->n:Lsh;

    invoke-direct {v2, v14, v9}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    const/4 v9, 0x0

    const/high16 v16, 0x43480000    # 200.0f

    const/high16 v17, 0x3f400000    # 0.75f

    move/from16 v0, v16

    move/from16 v1, v17

    invoke-static {v9, v0, v1}, Lg40;->f(FFF)Lp40;

    move-result-object v9

    iput-object v9, v2, Lo40;->k:Lp40;

    invoke-virtual {v2}, Lo40;->h()V

    const-string v2, "\u06e5\u06e0\u06e4"

    goto/16 :goto_4

    :pswitch_4
    :sswitch_20
    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    move-result v2

    if-ltz v2, :cond_16

    const-string v2, "\u06e2\u06e7\u06e7"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v16, v2

    goto/16 :goto_0

    :cond_16
    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v9, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    rem-int/2addr v2, v9

    const v9, -0x1ac8e5

    xor-int/2addr v2, v9

    move/from16 v16, v2

    goto/16 :goto_0

    :sswitch_21
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbff -> :sswitch_0
        0xdcb9 -> :sswitch_b
        0x1aa77f -> :sswitch_5
        0x1aa81a -> :sswitch_19
        0x1aab1d -> :sswitch_21
        0x1aab20 -> :sswitch_3
        0x1aab5b -> :sswitch_1a
        0x1aab7a -> :sswitch_18
        0x1aaede -> :sswitch_9
        0x1aaee3 -> :sswitch_1c
        0x1aaf62 -> :sswitch_21
        0x1aaf79 -> :sswitch_21
        0x1aaf7b -> :sswitch_21
        0x1aaf99 -> :sswitch_4
        0x1ab267 -> :sswitch_1d
        0x1ab280 -> :sswitch_c
        0x1ab31d -> :sswitch_1e
        0x1ab322 -> :sswitch_12
        0x1ab33b -> :sswitch_15
        0x1ab9c5 -> :sswitch_2
        0x1ab9e3 -> :sswitch_1b
        0x1aba0b -> :sswitch_a
        0x1aba44 -> :sswitch_8
        0x1abda7 -> :sswitch_e
        0x1abda9 -> :sswitch_d
        0x1abdaa -> :sswitch_7
        0x1abde5 -> :sswitch_1f
        0x1abe26 -> :sswitch_1
        0x1abe60 -> :sswitch_17
        0x1abe62 -> :sswitch_13
        0x1ac1ab -> :sswitch_16
        0x1ac1e1 -> :sswitch_10
        0x1ac222 -> :sswitch_11
        0x1ac56a -> :sswitch_21
        0x1ac56d -> :sswitch_21
        0x1ac8eb -> :sswitch_6
        0x1ac8ee -> :sswitch_20
        0x1ac9c0 -> :sswitch_14
        0x1ac9e1 -> :sswitch_f
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
