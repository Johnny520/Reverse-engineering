.class public final synthetic Lyn;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final a:Ll00;

.field public final b:I

.field public final c:Landroid/view/View;

.field public final d:Ll00;

.field public final e:F

.field public final f:Landroid/widget/FrameLayout;

.field public final g:Lo00;

.field public final h:Ld6;

.field public final i:Lp00;

.field public final j:I

.field public final k:Lsn;

.field public final l:Z


# direct methods
.method public synthetic constructor <init>(FIILd6;Lsn;Ll00;Ll00;Lo00;Lp00;Landroid/view/View;Landroid/widget/FrameLayout;Z)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e2\u06e6\u06df"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p10, p0, Lyn;->c:Landroid/view/View;

    iput-object p7, p0, Lyn;->d:Ll00;

    sget v1, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    or-int/lit16 v2, v2, 0x1d11

    xor-int/2addr v1, v2

    if-gtz v1, :cond_1

    const/16 v1, 0x1c

    sput v1, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    const-string v1, "\u06e1\u06e7\u06e5"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۤ۠ۤۢ()I

    move-result v1

    if-ltz v1, :cond_0

    const/16 v1, 0x32

    sput v1, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    const-string v1, "\u06e2\u06e6\u06df"

    invoke-static {v1}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    const-string v1, "\u06e5\u06e3\u06e3"

    :goto_1
    invoke-static {v1}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_2
    iput-object p5, p0, Lyn;->k:Lsn;

    iput-boolean p12, p0, Lyn;->l:Z

    const-string v1, "\u06e5\u06df\u06e8"

    goto :goto_1

    :cond_1
    const-string v1, "\u06e4\u06e4\u06e0"

    invoke-static {v1}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_3
    iput p1, p0, Lyn;->e:F

    iput-object p11, p0, Lyn;->f:Landroid/widget/FrameLayout;

    sget v1, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    add-int/lit16 v2, v2, 0x1bf5

    xor-int/2addr v1, v2

    if-ltz v1, :cond_2

    const-string v1, "\u06e2\u06e6\u06e7"

    invoke-static {v1}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    sget v1, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    or-int/2addr v1, v2

    const v2, 0x1aca1c

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    iput-object p6, p0, Lyn;->a:Ll00;

    iput p2, p0, Lyn;->b:I

    sget v1, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    rem-int/2addr v1, v2

    const v2, -0x1aa7fd

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    iput-object p9, p0, Lyn;->i:Lp00;

    iput p3, p0, Lyn;->j:I

    invoke-static {}, Landroid/window/۟ۤ۟ۡۧ;->ۢۦۣۨ()I

    move-result v1

    if-gtz v1, :cond_4

    const/16 v1, 0x49

    sput v1, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    const-string v1, "\u06e4\u06e4\u06e0"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_6
    sget v1, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v2, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    div-int/lit16 v2, v2, -0x345

    xor-int/2addr v1, v2

    if-ltz v1, :cond_3

    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    const-string v1, "\u06e8\u06e6\u06e6"

    goto :goto_1

    :cond_3
    sget v1, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    mul-int/2addr v1, v2

    const v2, -0x1f1cdd

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_7
    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    move-result v1

    if-gtz v1, :cond_6

    const-string v0, "HAXngXBeIpripPNJis"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۥ۠ۧۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    move-result v1

    if-gtz v1, :cond_5

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    :cond_4
    const-string v1, "\u06e4\u06df\u06e8"

    invoke-static {v1}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_5
    sget v1, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    div-int/2addr v1, v2

    const v2, 0x1ab329

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :cond_6
    :sswitch_8
    sget v1, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    if-gtz v1, :cond_7

    const/16 v1, 0x36

    sput v1, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    const-string v1, "\u06e3\u06e6\u06df"

    invoke-static {v1}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_7
    sget v1, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v2, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    add-int/2addr v1, v2

    const v2, 0x1ab96f

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_9
    iput-object p8, p0, Lyn;->g:Lo00;

    iput-object p4, p0, Lyn;->h:Ld6;

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    move-result v1

    if-gtz v1, :cond_8

    const/16 v1, 0x38

    sput v1, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    const-string v1, "\u06e0\u06e1\u06e1"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_8
    sget v1, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v2, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    or-int/2addr v1, v2

    const v2, 0x1aac80

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_a
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa7fc -> :sswitch_0
        0x1aab00 -> :sswitch_8
        0x1aaec2 -> :sswitch_6
        0x1aaf7f -> :sswitch_5
        0x1ab31b -> :sswitch_4
        0x1ab323 -> :sswitch_1
        0x1ab9cd -> :sswitch_2
        0x1aba60 -> :sswitch_3
        0x1abd8e -> :sswitch_7
        0x1abe05 -> :sswitch_a
        0x1ac9c8 -> :sswitch_9
    .end sparse-switch
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 36

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v10, 0x0

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v12, 0x0

    const/16 v23, 0x0

    const/16 v16, 0x0

    const/16 v25, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/16 v20, 0x0

    const/4 v13, 0x0

    const/16 v24, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v15, 0x0

    const-string v11, "\u06df\u06e6\u06e6"

    invoke-static {v11}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v11

    move-object/from16 v26, v2

    move-object/from16 v27, v3

    move-object/from16 v28, v5

    move/from16 v29, v6

    move/from16 v30, v8

    :goto_0
    sparse-switch v11, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v3, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    mul-int/lit16 v3, v3, 0x1af2

    add-int/2addr v2, v3

    if-ltz v2, :cond_1

    const-string v2, "\u06e3\u06e8"

    invoke-static {v2}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto :goto_0

    :sswitch_1
    sget v2, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    if-gtz v2, :cond_0

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    :cond_0
    const-string v2, "\u06df\u06e5\u06e3"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    move/from16 v22, v21

    goto :goto_0

    :cond_1
    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v3, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sub-int/2addr v2, v3

    const v3, -0x1aa5a5

    xor-int/2addr v2, v3

    move v11, v2

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    move-result v2

    if-gtz v2, :cond_2

    invoke-static {}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟ۥۦۧۡ()I

    const-string v2, "\u06e0\u06e5\u06e2"

    :goto_1
    invoke-static {v2}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto :goto_0

    :cond_2
    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v3, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    xor-int/2addr v2, v3

    const v3, -0xd92f

    xor-int/2addr v2, v3

    move v11, v2

    goto :goto_0

    :sswitch_3
    const-wide/16 v2, 0x13

    sget v5, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    int-to-long v0, v5

    move-wide/from16 v32, v0

    xor-long v2, v2, v32

    move-object/from16 v0, v28

    invoke-virtual {v0, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    sget-object v2, Lbo;->c:Lwn;

    move-object/from16 v0, v28

    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    invoke-virtual/range {v28 .. v28}, Landroid/animation/ValueAnimator;->start()V

    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v3, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    or-int/lit16 v3, v3, 0x17ff

    sub-int/2addr v2, v3

    if-ltz v2, :cond_3

    const/16 v2, 0x46

    sput v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    const-string v2, "\u06df\u06e8\u06df"

    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto :goto_0

    :cond_3
    const-string v2, "\u06e1\u06df\u06df"

    :goto_2
    invoke-static {v2}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :sswitch_4
    const/4 v2, 0x1

    :goto_3
    return v2

    :sswitch_5
    sget v2, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    xor-int/lit16 v2, v2, -0x188

    aput v10, v25, v2

    invoke-static/range {v25 .. v25}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v2

    new-instance v3, Lun;

    const/4 v5, 0x1

    invoke-direct {v3, v9, v5}, Lun;-><init>(Landroid/view/View;I)V

    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    sget v3, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v5, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    add-int/lit16 v5, v5, -0x36e

    or-int/2addr v3, v5

    if-ltz v3, :cond_4

    const/16 v3, 0xb

    sput v3, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    const-string v3, "\u06e0\u06e5\u06df"

    invoke-static {v3}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v28, v2

    move v11, v3

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e4\u06e4\u06df"

    invoke-static {v3}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v28, v2

    move v11, v3

    goto/16 :goto_0

    :sswitch_6
    move-object v2, v13

    check-cast v2, Lo40;

    sget v3, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    if-gtz v3, :cond_5

    const-string v3, "\u06e2\u06e3\u06e7"

    invoke-static {v3}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v3

    move v11, v3

    move-object/from16 v17, v2

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e5\u06e8\u06e3"

    move-object v5, v3

    move-object v6, v2

    :goto_4
    invoke-static {v5}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    move-object/from16 v17, v6

    goto/16 :goto_0

    :sswitch_7
    sget v2, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v3, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    xor-int/lit16 v3, v3, 0x1631

    or-int/2addr v2, v3

    if-ltz v2, :cond_6

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    const-string v2, "\u06e7\u06e8\u06e8"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :cond_6
    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v3, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    add-int/2addr v2, v3

    const v3, 0x1ac13d

    add-int/2addr v2, v3

    move v11, v2

    goto/16 :goto_0

    :sswitch_8
    iget-boolean v2, v4, Ll00;->a:Z

    if-eqz v2, :cond_29

    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    if-ltz v2, :cond_7

    const-string v2, "\u06e4\u06e0\u06e7"

    invoke-static {v2}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    move/from16 v22, v12

    goto/16 :goto_0

    :cond_7
    const-string v2, "\u06e7\u06e1\u06df"

    move-object v3, v2

    move v5, v12

    :goto_5
    invoke-static {v3}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    move/from16 v22, v5

    goto/16 :goto_0

    :cond_8
    :sswitch_9
    sget v2, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v3, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    rem-int/lit16 v3, v3, -0x1561

    xor-int/2addr v2, v3

    if-gtz v2, :cond_9

    const/16 v2, 0x32

    sput v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    const-string v2, "\u06e8\u06e3\u06e6"

    :goto_6
    invoke-static {v2}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u06e6\u06e4\u06e7"

    invoke-static {v2}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :sswitch_a
    const-string v2, "\u06e8\u06e8\u06e4"

    move/from16 v16, v23

    :goto_7
    invoke-static {v2}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :sswitch_b
    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    if-gtz v2, :cond_a

    const-string v2, "\u06e2\u06e2\u06e0"

    invoke-static {v2}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v18, v19

    move v11, v2

    goto/16 :goto_0

    :cond_a
    move-object/from16 v18, v19

    :cond_b
    const-string v2, "\u06e2\u06e2\u06e7"

    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :sswitch_c
    sget v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    xor-int/lit8 v2, v2, 0x5f

    aput v10, v26, v2

    sget v2, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    xor-int/lit16 v2, v2, -0x188

    rsub-int/lit8 v3, v30, 0x0

    sub-int/2addr v3, v10

    rsub-int/lit8 v3, v3, 0x0

    aput v3, v26, v2

    invoke-static/range {v26 .. v26}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v2

    sget v3, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v5, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    add-int/lit16 v5, v5, -0x11d3

    xor-int/2addr v3, v5

    if-ltz v3, :cond_c

    const/16 v3, 0x1b

    sput v3, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    move/from16 v3, v16

    :goto_8
    const-string v5, "\u06e1\u06e1\u06e5"

    move-object v15, v2

    move/from16 v16, v3

    move-object/from16 v6, v17

    goto/16 :goto_4

    :cond_c
    move/from16 v3, v20

    :goto_9
    const-string v5, "\u06e2\u06e6"

    move-object v15, v2

    move/from16 v20, v3

    :goto_a
    invoke-static {v5}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :sswitch_d
    const/16 v24, 0x0

    sget v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v3, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    or-int/lit16 v3, v3, -0x107e

    xor-int/2addr v2, v3

    if-ltz v2, :cond_d

    const-string v2, "\u06e3\u06e3\u06e7"

    invoke-static {v2}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :cond_d
    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v3, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    add-int/2addr v2, v3

    const v3, 0x1ac0f5

    add-int/2addr v2, v3

    move v11, v2

    goto/16 :goto_0

    :sswitch_e
    if-nez v17, :cond_18

    new-instance v19, Lo40;

    sget-object v2, Lo40;->m:Lsh;

    move-object/from16 v0, v19

    invoke-direct {v0, v9, v2}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    invoke-static {}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->۟ۢ۟ۥۣ()I

    move-result v2

    if-ltz v2, :cond_e

    const-string v2, "\u06e8\u06e8\u06e4"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v18, v17

    move v11, v2

    goto/16 :goto_0

    :cond_e
    const-string v2, "\u06e7\u06e2\u06e6"

    move-object/from16 v18, v17

    :goto_b
    invoke-static {v2}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :sswitch_f
    invoke-virtual {v15}, Landroid/animation/ValueAnimator;->start()V

    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v3, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    xor-int/lit16 v3, v3, 0x2692

    div-int/2addr v2, v3

    if-eqz v2, :cond_f

    const-string v2, "\u06e6\u06e4\u06e7"

    invoke-static {v2}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :cond_f
    const-string v2, "\u06e0\u06e5\u06df"

    move-object v5, v2

    goto :goto_a

    :sswitch_10
    const/4 v2, 0x1

    goto/16 :goto_3

    :sswitch_11
    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v3, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    or-int/lit16 v3, v3, 0x32b

    add-int/2addr v2, v3

    if-gtz v2, :cond_10

    const-string v2, "\u06e1\u06e2\u06e8"

    invoke-static {v2}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :cond_10
    const-string v2, "\u06e7\u06df\u06e1"

    goto/16 :goto_1

    :sswitch_12
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    move-object/from16 v0, p0

    iget-object v2, v0, Lyn;->a:Ll00;

    move-object/from16 v0, p0

    iget v10, v0, Lyn;->b:I

    sget v5, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v6, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    xor-int/lit16 v6, v6, -0x756

    or-int/2addr v5, v6

    if-gtz v5, :cond_11

    const-string v5, "\u06e1\u06e0\u06e5"

    invoke-static {v5}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v27, v2

    move/from16 v29, v3

    move v11, v5

    goto/16 :goto_0

    :cond_11
    const-string v5, "\u06e4\u06df\u06e0"

    invoke-static {v5}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v27, v2

    move/from16 v29, v3

    move v11, v5

    goto/16 :goto_0

    :sswitch_13
    move/from16 v0, v20

    move-object/from16 v1, v19

    invoke-virtual {v9, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v3, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    mul-int/lit16 v3, v3, 0x273

    xor-int/2addr v2, v3

    if-ltz v2, :cond_12

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    const-string v2, "\u06e0\u06e2\u06e1"

    invoke-static {v2}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :cond_12
    const-string v2, "\u06df\u06e7\u06e5"

    :goto_c
    invoke-static {v2}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :sswitch_14
    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    move-result v2

    if-ltz v2, :cond_13

    const-string v2, "\u06e6\u06e7\u06e3"

    invoke-static {v2}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    move-object/from16 v17, v24

    goto/16 :goto_0

    :cond_13
    const-string v2, "\u06e5\u06e3\u06e1"

    move-object/from16 v17, v24

    goto/16 :goto_7

    :cond_14
    :sswitch_15
    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v3, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    or-int/lit16 v3, v3, -0x21e2

    add-int/2addr v2, v3

    if-ltz v2, :cond_15

    invoke-static {}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟ۥۦۧۡ()I

    const-string v2, "\u06e8\u06e1"

    invoke-static {v2}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :cond_15
    sget v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v3, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    rem-int/2addr v2, v3

    const v3, -0x1ac566

    xor-int/2addr v2, v3

    move v11, v2

    goto/16 :goto_0

    :cond_16
    :sswitch_16
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v3, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    rem-int/lit16 v3, v3, 0x22f8

    or-int/2addr v2, v3

    if-ltz v2, :cond_17

    const-string v2, "\u06e7\u06e6"

    :goto_d
    invoke-static {v2}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :cond_17
    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v3, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sub-int/2addr v2, v3

    const v3, 0x1aa986

    xor-int/2addr v2, v3

    move v11, v2

    goto/16 :goto_0

    :cond_18
    move-object/from16 v2, v17

    :goto_e
    const-string v3, "\u06e2\u06e2\u06e7"

    invoke-static {v3}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v18, v2

    move v11, v3

    goto/16 :goto_0

    :sswitch_17
    invoke-virtual/range {v18 .. v18}, Lo40;->h()V

    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v3, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    xor-int/lit16 v3, v3, -0x95e

    div-int/2addr v2, v3

    if-nez v2, :cond_b

    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v3, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sub-int/2addr v2, v3

    const v3, 0x1aa93e

    add-int/2addr v2, v3

    move v11, v2

    goto/16 :goto_0

    :sswitch_18
    sget v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v3, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    mul-int/lit16 v3, v3, 0x2166

    or-int/2addr v2, v3

    if-ltz v2, :cond_19

    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    const-string v2, "\u06e8\u06e5"

    :goto_f
    invoke-static {v2}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :cond_19
    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v3, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    xor-int/2addr v2, v3

    const v3, 0x1aa547

    add-int/2addr v2, v3

    move v11, v2

    goto/16 :goto_0

    :sswitch_19
    const/4 v2, 0x1

    move-object/from16 v0, v27

    iput-boolean v2, v0, Ll00;->a:Z

    sget v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    xor-int/lit16 v2, v2, 0x396

    invoke-static {v2}, Lmp;->q(I)I

    move-result v3

    const/4 v2, 0x2

    new-array v2, v2, [I

    sget v5, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v6, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    mul-int/2addr v5, v6

    const v6, 0x1819f1

    xor-int/2addr v5, v6

    move-object/from16 v26, v2

    move/from16 v30, v3

    move v11, v5

    goto/16 :goto_0

    :sswitch_1a
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v3, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    or-int/lit16 v3, v3, 0x1234

    or-int/2addr v2, v3

    if-ltz v2, :cond_1a

    invoke-static {}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->ۢۢۧۨ()I

    const-string v2, "\u06e1\u06e6\u06df"

    move-object v3, v7

    :goto_10
    invoke-static {v2}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v2

    move-object v7, v3

    move v11, v2

    goto/16 :goto_0

    :cond_1a
    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v3, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    or-int/2addr v2, v3

    const v3, 0x1aaba2

    add-int/2addr v2, v3

    move v11, v2

    goto/16 :goto_0

    :sswitch_1b
    new-instance v2, Lvn;

    invoke-direct {v2, v9, v4, v12, v10}, Lvn;-><init>(Landroid/view/View;Ll00;FI)V

    invoke-virtual {v15, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-wide/16 v2, -0x18a

    sget v5, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    int-to-long v0, v5

    move-wide/from16 v32, v0

    xor-long v2, v2, v32

    invoke-virtual {v15, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v15, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v3, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    mul-int/lit16 v3, v3, 0x155b

    rem-int/2addr v2, v3

    if-ltz v2, :cond_1b

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    const-string v2, "\u06e6\u06e1\u06e2"

    invoke-static {v2}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :cond_1b
    const-string v3, "\u06e4\u06e3\u06e0"

    move-object v2, v14

    :goto_11
    invoke-static {v3}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v3

    move-object v14, v2

    move v11, v3

    goto/16 :goto_0

    :sswitch_1c
    if-eqz v29, :cond_14

    const/4 v2, 0x1

    move/from16 v0, v29

    if-eq v0, v2, :cond_16

    const/4 v2, 0x3

    move/from16 v0, v29

    if-eq v0, v2, :cond_16

    sget v2, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v3, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    or-int/2addr v2, v3

    const v3, 0x1ab3a1

    add-int/2addr v2, v3

    move v11, v2

    goto/16 :goto_0

    :sswitch_1d
    invoke-virtual {v9}, Landroid/view/View;->getWidth()I

    move-result v3

    const/4 v2, 0x2

    new-array v2, v2, [I

    sget v5, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    xor-int/lit16 v5, v5, 0x143

    aput v3, v2, v5

    invoke-static {}, Landroidx/activity/result/۟ۡۧ۠ۥ;->۟ۥۥۧ۟()I

    move-result v3

    if-gtz v3, :cond_1c

    const/16 v3, 0x42

    sput v3, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    const-string v3, "\u06e7\u06e1\u06e3"

    invoke-static {v3}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v25, v2

    move v11, v3

    goto/16 :goto_0

    :cond_1c
    const-string v5, "\u06e0\u06df\u06e5"

    move-object v3, v2

    :goto_12
    invoke-static {v5}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v25, v3

    move v11, v2

    goto/16 :goto_0

    :sswitch_1e
    move-object/from16 v0, p0

    iget-object v9, v0, Lyn;->c:Landroid/view/View;

    move-object/from16 v0, p0

    iget-object v4, v0, Lyn;->d:Ll00;

    move-object/from16 v0, p0

    iget v12, v0, Lyn;->e:F

    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    if-gtz v2, :cond_1d

    const-string v2, "\u06df\u06e7\u06e5"

    goto/16 :goto_c

    :cond_1d
    const-string v2, "\u06e0\u06e4\u06e3"

    goto/16 :goto_6

    :sswitch_1f
    const/16 v23, 0x0

    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    move-result v2

    if-gtz v2, :cond_1e

    const/16 v2, 0x43

    sput v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    const-string v2, "\u06e3\u06df\u06e6"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :cond_1e
    sget v2, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v3, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    div-int/2addr v2, v3

    const v3, 0x1ab35e

    xor-int/2addr v2, v3

    move v11, v2

    goto/16 :goto_0

    :sswitch_20
    new-instance v2, Lx8;

    sget v3, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    xor-int/lit16 v3, v3, -0x1cd

    move-object/from16 v0, v27

    invoke-direct {v2, v3, v0}, Lx8;-><init>(ILjava/lang/Object;)V

    const-wide/16 v32, 0x82

    sget v3, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    int-to-long v0, v3

    move-wide/from16 v34, v0

    xor-long v32, v32, v34

    move-wide/from16 v0, v32

    invoke-virtual {v7, v2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    move-result v2

    if-ltz v2, :cond_1f

    const/16 v2, 0x46

    sput v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    const-string v2, "\u06e3\u06e5\u06e2"

    invoke-static {v2}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :cond_1f
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v3, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    xor-int/2addr v2, v3

    const v3, 0x1ab83e

    add-int/2addr v2, v3

    move v11, v2

    goto/16 :goto_0

    :sswitch_21
    const v2, 0x7e0902cd

    sget v3, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    xor-int/2addr v3, v2

    invoke-virtual {v9, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v13

    instance-of v2, v13, Lo40;

    if-eqz v2, :cond_2b

    sget v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    if-gtz v2, :cond_20

    const/16 v2, 0x1d

    sput v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    move-object v2, v15

    goto/16 :goto_9

    :cond_20
    const-string v2, "\u06e0\u06e5\u06e2"

    invoke-static {v2}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v3

    move v11, v2

    goto/16 :goto_0

    :sswitch_22
    const/4 v2, 0x0

    sget v3, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    if-ltz v3, :cond_21

    :goto_13
    const-string v3, "\u06e5\u06e0\u06e7"

    move/from16 v21, v2

    move/from16 v5, v22

    goto/16 :goto_5

    :cond_21
    sget v3, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v5, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sub-int/2addr v3, v5

    const v5, 0x1abf1a

    xor-int/2addr v3, v5

    move v11, v3

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_23
    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v3, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    div-int/lit16 v3, v3, 0x47a

    sub-int/2addr v2, v3

    if-gtz v2, :cond_22

    const-string v2, "\u06e7\u06e1\u06df"

    invoke-static {v2}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :cond_22
    const-string v2, "\u06e0\u06e6\u06e4"

    goto/16 :goto_f

    :sswitch_24
    const/4 v2, 0x1

    goto/16 :goto_3

    :sswitch_25
    move-object/from16 v0, p0

    iget-object v3, v0, Lyn;->f:Landroid/widget/FrameLayout;

    if-eqz v16, :cond_24

    move-object/from16 v0, p0

    iget-object v2, v0, Lyn;->g:Lo00;

    move-object/from16 v0, p0

    iget-object v5, v0, Lyn;->h:Ld6;

    move-object/from16 v0, p0

    iget-object v6, v0, Lyn;->i:Lp00;

    move-object/from16 v0, p0

    iget v7, v0, Lyn;->j:I

    move-object/from16 v0, p0

    iget-object v8, v0, Lyn;->k:Lsn;

    move-object/from16 v0, p0

    iget-boolean v11, v0, Lyn;->l:Z

    invoke-static/range {v2 .. v12}, Lbo;->d(Lo00;Landroid/widget/FrameLayout;Ll00;Ld6;Lp00;ILsn;Landroid/view/View;IZF)V

    const-string v2, "\u06df\u06e1\u06e3"

    goto/16 :goto_10

    :sswitch_26
    move-object/from16 v0, v18

    iput-object v14, v0, Lo40;->k:Lp40;

    sget v2, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v3, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    add-int/lit16 v3, v3, -0x3d2

    or-int/2addr v2, v3

    if-ltz v2, :cond_23

    const-string v2, "\u06e2\u06e1\u06e0"

    invoke-static {v2}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :cond_23
    move/from16 v2, v21

    goto :goto_13

    :sswitch_27
    const-string v2, "\u06e8\u06e8\u06e4"

    goto/16 :goto_d

    :sswitch_28
    move-object v3, v7

    :cond_24
    sget v2, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v5, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    add-int/lit16 v5, v5, 0x139d

    xor-int/2addr v2, v5

    if-gtz v2, :cond_25

    const-string v2, "\u06e0\u06e6\u06e3"

    move-object v7, v3

    goto/16 :goto_7

    :cond_25
    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v5, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    or-int/2addr v2, v5

    const v5, 0x1aa8cc

    add-int/2addr v2, v5

    move-object v7, v3

    move v11, v2

    goto/16 :goto_0

    :sswitch_29
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_8

    const/4 v3, 0x1

    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v5, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    xor-int/lit16 v5, v5, 0xde8

    mul-int/2addr v2, v5

    if-gtz v2, :cond_26

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    const-string v2, "\u06e6\u06e1"

    invoke-static {v2}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    move/from16 v16, v3

    goto/16 :goto_0

    :cond_26
    move-object v2, v15

    goto/16 :goto_8

    :sswitch_2a
    sget v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v3, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    div-int/lit16 v3, v3, -0x1ff0

    add-int/2addr v2, v3

    if-gtz v2, :cond_27

    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    const-string v2, "\u06e7\u06e2\u06e6"

    move-object/from16 v3, v25

    move-object v5, v2

    goto/16 :goto_12

    :cond_27
    const-string v2, "\u06e8\u06e1\u06e0"

    goto/16 :goto_6

    :sswitch_2b
    new-instance v2, Lp40;

    move/from16 v0, v22

    invoke-direct {v2, v0}, Lp40;-><init>(F)V

    const/high16 v3, 0x43480000    # 200.0f

    invoke-virtual {v2, v3}, Lp40;->b(F)V

    const v3, 0x3f266666    # 0.65f

    invoke-virtual {v2, v3}, Lp40;->a(F)V

    sget v3, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v5, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    add-int/lit16 v5, v5, -0xd23

    sub-int/2addr v3, v5

    if-gtz v3, :cond_28

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    const-string v3, "\u06e0\u06df\u06e5"

    goto/16 :goto_11

    :cond_28
    const-string v5, "\u06e2\u06e1\u06e0"

    move-object/from16 v3, v25

    move-object v14, v2

    goto/16 :goto_12

    :cond_29
    :sswitch_2c
    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    if-ltz v2, :cond_2a

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    const-string v2, "\u06e4\u06e5\u06e0"

    goto/16 :goto_2

    :cond_2a
    sget v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v3, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    div-int/2addr v2, v3

    const v3, 0x1aab59

    add-int/2addr v2, v3

    move v11, v2

    goto/16 :goto_0

    :cond_2b
    move/from16 v20, v3

    :sswitch_2d
    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v3, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    rem-int/lit16 v3, v3, 0x1a96

    rem-int/2addr v2, v3

    if-ltz v2, :cond_2c

    const-string v2, "\u06e0\u06e2"

    goto/16 :goto_b

    :cond_2c
    const-string v2, "\u06e6\u06e7\u06e3"

    goto/16 :goto_7

    :sswitch_2e
    move-object/from16 v2, v18

    goto/16 :goto_e

    :sswitch_data_0
    .sparse-switch
        0xdbe8 -> :sswitch_0
        0xdc44 -> :sswitch_1b
        0xdcbb -> :sswitch_0
        0x1aa741 -> :sswitch_11
        0x1aa7a2 -> :sswitch_21
        0x1aa7bd -> :sswitch_2b
        0x1aa7df -> :sswitch_12
        0x1aa7fd -> :sswitch_b
        0x1aa816 -> :sswitch_29
        0x1aaac6 -> :sswitch_5
        0x1aab1f -> :sswitch_20
        0x1aab5b -> :sswitch_22
        0x1aab5f -> :sswitch_1c
        0x1aab7a -> :sswitch_4
        0x1aab7d -> :sswitch_6
        0x1aab9e -> :sswitch_7
        0x1aabba -> :sswitch_1a
        0x1aae81 -> :sswitch_25
        0x1aaea6 -> :sswitch_9
        0x1aaec5 -> :sswitch_2a
        0x1aaee7 -> :sswitch_2e
        0x1ab281 -> :sswitch_26
        0x1ab2a0 -> :sswitch_24
        0x1ab2a7 -> :sswitch_8
        0x1ab2c6 -> :sswitch_2d
        0x1ab2c7 -> :sswitch_27
        0x1ab35e -> :sswitch_a
        0x1ab60a -> :sswitch_28
        0x1ab687 -> :sswitch_18
        0x1ab6c0 -> :sswitch_15
        0x1ab9c5 -> :sswitch_1e
        0x1ab9eb -> :sswitch_16
        0x1aba41 -> :sswitch_f
        0x1aba5f -> :sswitch_3
        0x1aba84 -> :sswitch_10
        0x1abdac -> :sswitch_17
        0x1abe03 -> :sswitch_e
        0x1abe20 -> :sswitch_c
        0x1abe83 -> :sswitch_1
        0x1abea0 -> :sswitch_23
        0x1ac187 -> :sswitch_7
        0x1ac1e9 -> :sswitch_1f
        0x1ac242 -> :sswitch_d
        0x1ac507 -> :sswitch_19
        0x1ac509 -> :sswitch_1a
        0x1ac545 -> :sswitch_2
        0x1ac549 -> :sswitch_2c
        0x1ac56b -> :sswitch_13
        0x1ac5e3 -> :sswitch_14
        0x1ac907 -> :sswitch_27
        0x1ac9e4 -> :sswitch_1d
    .end sparse-switch
.end method
