.class public final Lg7;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final a:I

.field public b:Lo40;

.field public c:F

.field public d:Z


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 3

    iput p1, p0, Lg7;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e2\u06e7\u06e8"

    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v0, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    mul-int/lit16 v2, v2, -0x1031

    or-int/2addr v0, v2

    if-ltz v0, :cond_1

    const/16 v0, 0x35

    sput v0, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    const-string v0, "\u06e6\u06e7\u06e2"

    :goto_1
    invoke-static {v0}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    add-int/2addr v0, v2

    const v2, 0x1ab79d

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Landroidx/activity/result/۟ۡۤۦۡ;->۟۟۟ۥۤ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\u06e8\u06df\u06e1"

    goto :goto_1

    :sswitch_2
    sget v0, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    if-gtz v0, :cond_2

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    const-string v0, "\u06e3\u06df\u06df"

    invoke-static {v0}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    sget v0, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    rem-int/2addr v0, v2

    const v2, 0x1ab31c

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    const-string v0, "RO3EkIp5"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟ۧۧۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۥۥۢۧ()I

    move-result v1

    if-ltz v1, :cond_3

    const/16 v1, 0x49

    sput v1, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    const-string v1, "\u06e2\u06e7\u06e8"

    move-object v2, v1

    :goto_2
    invoke-static {v2}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_3
    sget v1, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    xor-int/2addr v1, v2

    const v2, 0x1aac4c

    xor-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :sswitch_4
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string v2, "\u06e4\u06e1\u06e7"

    move-object v0, v1

    goto :goto_2

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aaee7 -> :sswitch_0
        0x1aaf43 -> :sswitch_4
        0x1ab343 -> :sswitch_1
        0x1aba0a -> :sswitch_5
        0x1ac8ca -> :sswitch_3
        0x1ac8e9 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 40

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/16 v33, 0x0

    const/16 v30, 0x0

    const/16 v29, 0x0

    const/16 v22, 0x0

    const/16 v16, 0x0

    const/4 v14, 0x0

    const/4 v12, 0x0

    const/16 v17, 0x0

    const/16 v27, 0x0

    const/4 v5, 0x0

    const/16 v32, 0x0

    const/16 v31, 0x0

    const/16 v20, 0x0

    const/4 v3, 0x0

    const/16 v25, 0x0

    const/16 v18, 0x0

    const/4 v2, 0x0

    const/16 v24, 0x0

    const/16 v23, 0x0

    const/16 v28, 0x0

    const/4 v15, 0x0

    const/4 v6, 0x0

    const/4 v11, 0x0

    const/16 v26, 0x0

    const/4 v8, 0x0

    const/4 v7, 0x0

    const/16 v21, 0x0

    const/16 v34, 0x0

    const-string v9, "\u06e7\u06e2\u06e4"

    invoke-static {v9}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v35, v2

    move-object/from16 v36, v5

    move/from16 v37, v9

    :goto_0
    sparse-switch v37, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    move/from16 v2, v29

    move/from16 v5, v30

    :goto_1
    const-string v9, "\u06e0\u06e6\u06e4"

    move/from16 v29, v2

    move/from16 v30, v5

    :goto_2
    invoke-static {v9}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto :goto_0

    :sswitch_1
    invoke-virtual {v3}, Lo40;->c()V

    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v5, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    add-int/2addr v2, v5

    const v5, 0xdac0

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto :goto_0

    :sswitch_2
    move-object/from16 v0, p0

    iget-object v2, v0, Lg7;->b:Lo40;

    if-eqz v2, :cond_62

    const-string v9, "\u06e5\u06df\u06e7"

    move-object v5, v2

    :goto_3
    invoke-static {v9}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v28, v5

    move/from16 v37, v2

    goto :goto_0

    :sswitch_3
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    const/high16 v5, 0x40400000    # 3.0f

    sub-float/2addr v2, v5

    move-object/from16 v0, p0

    iget v5, v0, Lg7;->c:F

    sub-float/2addr v2, v5

    const/high16 v5, 0x40400000    # 3.0f

    add-float/2addr v5, v2

    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    xor-int/lit8 v2, v2, -0x11

    invoke-virtual {v6, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v7

    const/4 v2, 0x1

    invoke-virtual {v6, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v2

    if-nez v7, :cond_5

    sget v7, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v8, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    or-int/lit16 v8, v8, 0x17ce

    sub-int/2addr v7, v8

    if-ltz v7, :cond_0

    const/16 v7, 0x52

    sput v7, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    const-string v7, "\u06e2\u06e1\u06e2"

    invoke-static {v7}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v9

    move v7, v2

    move/from16 v37, v9

    move v8, v5

    goto :goto_0

    :cond_0
    const-string v7, "\u06e7\u06e2\u06e1"

    move-object v9, v7

    move v10, v2

    move v8, v5

    :goto_4
    invoke-static {v9}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v2

    move v7, v10

    move/from16 v37, v2

    goto :goto_0

    :sswitch_4
    move-object v2, v6

    :cond_1
    sget v5, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v6, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    or-int/2addr v5, v6

    const v6, 0x1ac706

    add-int/2addr v5, v6

    move-object v6, v2

    move/from16 v37, v5

    goto/16 :goto_0

    :sswitch_5
    move-object v2, v4

    :cond_2
    sget v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v5, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    or-int/lit16 v5, v5, 0x236c

    or-int/2addr v4, v5

    if-gtz v4, :cond_3

    const-string v5, "\u06e8\u06e2\u06e4"

    move-object v4, v2

    :goto_5
    invoke-static {v5}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_3
    sget v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v5, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    div-int/2addr v4, v5

    const v5, 0x1aab60

    add-int/2addr v5, v4

    move-object v4, v2

    move/from16 v37, v5

    goto/16 :goto_0

    :cond_4
    :sswitch_6
    const-string v2, "\u06e8\u06e6"

    move-object v5, v2

    :goto_6
    invoke-static {v5}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_7
    move v2, v7

    move v5, v8

    :cond_5
    sget v7, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v8, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    div-int/lit16 v8, v8, -0x1bde

    sub-int/2addr v7, v8

    if-ltz v7, :cond_6

    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    const-string v7, "\u06e4\u06e1\u06e0"

    move-object v9, v7

    move v10, v2

    :goto_7
    invoke-static {v9}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v2

    move v7, v10

    move/from16 v37, v2

    move v8, v5

    goto/16 :goto_0

    :cond_6
    sget v7, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v8, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    add-int/2addr v7, v8

    const v8, 0x1aa766

    add-int v9, v7, v8

    move v7, v2

    move/from16 v37, v9

    move v8, v5

    goto/16 :goto_0

    :sswitch_8
    const/4 v2, 0x0

    invoke-virtual {v6, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v5, v0, Lg7;->b:Lo40;

    if-nez v5, :cond_d

    new-instance v5, Lo40;

    sget-object v9, Lo40;->n:Lsh;

    invoke-direct {v5, v2, v9}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    const/4 v9, 0x0

    const v10, 0x44bb8000    # 1500.0f

    const/high16 v11, 0x3f000000    # 0.5f

    invoke-static {v9, v10, v11}, Lg40;->f(FFF)Lp40;

    move-result-object v9

    iput-object v9, v5, Lo40;->k:Lp40;

    sget v9, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    if-gtz v9, :cond_7

    const-string v9, "\u06e6\u06e2\u06e1"

    invoke-static {v9}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v26, v5

    move-object v11, v2

    move/from16 v37, v9

    goto/16 :goto_0

    :cond_7
    const-string v9, "\u06df\u06e2\u06e3"

    move-object v11, v2

    :goto_8
    invoke-static {v9}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v26, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_9
    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v5, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    rem-int/lit16 v5, v5, 0x1931

    or-int/2addr v2, v5

    if-ltz v2, :cond_8

    const-string v2, "\u06e4\u06e0\u06e1"

    invoke-static {v2}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_8
    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v5, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    div-int/2addr v2, v5

    const v5, 0x1ab609

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_a
    move-object/from16 v0, v33

    move-object/from16 v1, p0

    iput-object v0, v1, Lg7;->b:Lo40;

    const-string v2, "\u06e0\u06e4\u06e4"

    move-object v5, v2

    :goto_9
    invoke-static {v5}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_b
    const-string v2, "fQ==\n"

    const-string v5, "CzjLBdmsnSg=\n"

    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "PVn8CkM=\n"

    const-string v5, "WC+ZZDcvoyA=\n"

    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p2

    invoke-static {v2, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v2, p1

    check-cast v2, Landroid/widget/ScrollView;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v5

    if-nez v5, :cond_1

    sget v5, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v6, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    mul-int/lit16 v6, v6, -0xcb

    sub-int/2addr v5, v6

    if-ltz v5, :cond_9

    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    const-string v5, "\u06e1\u06e6"

    invoke-static {v5}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v5

    move-object v6, v2

    move/from16 v37, v5

    goto/16 :goto_0

    :cond_9
    sget v5, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v6, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    div-int/2addr v5, v6

    const v6, 0x1abdad

    add-int/2addr v5, v6

    move-object v6, v2

    move/from16 v37, v5

    goto/16 :goto_0

    :cond_a
    :sswitch_c
    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v5, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    rem-int/lit16 v5, v5, -0x1742

    add-int/2addr v2, v5

    if-ltz v2, :cond_b

    const-string v2, "\u06e7\u06e4\u06e4"

    :goto_a
    invoke-static {v2}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_b
    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v5, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    div-int/2addr v2, v5

    const v5, 0x1ab9cb

    xor-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_d
    const/4 v2, 0x2

    const/4 v5, 0x0

    move-object/from16 v0, v18

    invoke-virtual {v0, v2, v5}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    sget v2, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v5, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    add-int/lit16 v5, v5, -0x1cf0

    sub-int/2addr v2, v5

    if-gtz v2, :cond_c

    const/16 v2, 0x13

    sput v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    const-string v2, "\u06e2\u06df"

    invoke-static {v2}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_c
    sget v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v5, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    mul-int/2addr v2, v5

    const v5, 0x137eeb

    xor-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_e
    const-string v2, "\u06e1\u06e6\u06e6"

    :goto_b
    invoke-static {v2}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :pswitch_0
    :sswitch_f
    const-string v2, "\u06e6\u06e2\u06e1"

    :goto_c
    invoke-static {v2}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_10
    move-object v2, v11

    :cond_d
    sget v5, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v9, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    div-int/lit16 v9, v9, 0x113d

    or-int/2addr v5, v9

    if-ltz v5, :cond_e

    const/16 v5, 0x5d

    sput v5, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    const-string v5, "\u06e4\u06e5\u06e1"

    move-object v11, v2

    move v9, v12

    :goto_d
    invoke-static {v5}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v2

    move v12, v9

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_e
    sget v5, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v9, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    rem-int/2addr v5, v9

    const v9, 0xd8b9

    add-int/2addr v5, v9

    move-object v11, v2

    move/from16 v37, v5

    goto/16 :goto_0

    :sswitch_11
    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    if-ltz v2, :cond_f

    const-string v2, "\u06df\u06df\u06e3"

    invoke-static {v2}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_f
    const-string v2, "\u06e1\u06e1"

    :goto_e
    invoke-static {v2}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_12
    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    move-result v2

    if-gtz v2, :cond_10

    const/16 v2, 0x24

    sput v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    const-string v2, "\u06e2\u06df\u06e0"

    :goto_f
    invoke-static {v2}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_10
    const-string v2, "\u06e2\u06e1\u06e1"

    :goto_10
    invoke-static {v2}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_13
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lg7;->d:Z

    if-nez v2, :cond_2a

    invoke-virtual/range {v27 .. v27}, Landroid/view/View;->getTranslationY()F

    move-result v2

    const/4 v5, 0x0

    cmpg-float v2, v2, v5

    if-nez v2, :cond_2a

    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    if-ltz v2, :cond_11

    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    const-string v2, "\u06e4\u06e7\u06e4"

    invoke-static {v2}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_11
    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v5, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    add-int/2addr v2, v5

    const v5, 0x1aacd1

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_14
    move-object v2, v14

    :cond_12
    const-string v5, "\u06df\u06e6\u06e0"

    move-object v14, v2

    move-object v9, v5

    goto/16 :goto_2

    :sswitch_15
    if-nez v29, :cond_1c

    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v5, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    xor-int/lit16 v5, v5, 0xd06

    or-int/2addr v2, v5

    if-gtz v2, :cond_13

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    const-string v2, "\u06e1\u06e4\u06e1"

    invoke-static {v2}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_13
    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v5, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sub-int/2addr v2, v5

    const v5, -0x1aaead

    xor-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_16
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    if-eqz v2, :cond_40

    const/4 v5, 0x1

    if-eq v2, v5, :cond_1e

    const/4 v5, 0x2

    if-eq v2, v5, :cond_46

    const/4 v5, 0x3

    if-eq v2, v5, :cond_1e

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    move-result v2

    if-ltz v2, :cond_14

    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    const-string v2, "\u06e1\u06df\u06e7"

    invoke-static {v2}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_14
    const-string v2, "\u06e2\u06e8\u06e0"

    :goto_11
    invoke-static {v2}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_17
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    if-eqz v2, :cond_72

    const/4 v5, 0x1

    if-eq v2, v5, :cond_9c

    const/4 v5, 0x2

    if-eq v2, v5, :cond_82

    const/4 v5, 0x3

    if-eq v2, v5, :cond_9c

    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v5, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    or-int/lit16 v5, v5, 0x1323

    rem-int/2addr v2, v5

    if-ltz v2, :cond_15

    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    const-string v2, "\u06e8\u06e6\u06df"

    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_15
    const-string v2, "\u06e2\u06e2\u06e2"

    :goto_12
    invoke-static {v2}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_18
    move-object v2, v15

    :cond_16
    sget v5, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v9, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    xor-int/lit16 v9, v9, 0xf04

    xor-int/2addr v5, v9

    if-ltz v5, :cond_17

    const-string v5, "\u06e4\u06e6\u06e5"

    invoke-static {v5}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v5

    move-object v15, v2

    move/from16 v37, v5

    goto/16 :goto_0

    :cond_17
    sget v5, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v9, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sub-int/2addr v5, v9

    const v9, 0xdaaa

    add-int/2addr v5, v9

    move-object v15, v2

    move/from16 v37, v5

    goto/16 :goto_0

    :sswitch_19
    move-object/from16 v2, v16

    :cond_18
    sget v5, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v9, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    or-int/2addr v5, v9

    const v9, 0xdf53

    add-int/2addr v5, v9

    move-object/from16 v16, v2

    move/from16 v37, v5

    goto/16 :goto_0

    :cond_19
    :sswitch_1a
    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    if-ltz v2, :cond_1a

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    const-string v9, "\u06e4\u06e1"

    move-object/from16 v2, v17

    move-object/from16 v5, v18

    :goto_13
    invoke-static {v9}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v17, v2

    move-object/from16 v18, v5

    move/from16 v37, v9

    goto/16 :goto_0

    :cond_1a
    sget v2, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v5, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    xor-int/2addr v2, v5

    const v5, 0x1ab91d

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_1b
    const v2, 0x3eb33333    # 0.35f

    mul-float v2, v2, v32

    move-object/from16 v0, v27

    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationY(F)V

    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lg7;->d:Z

    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    move-result v2

    if-ltz v2, :cond_1b

    const/4 v2, 0x0

    sput v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    const-string v2, "\u06e5\u06e0\u06e8"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_1b
    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v5, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    div-int/2addr v2, v5

    const v5, 0x1aba23

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_1c
    :sswitch_1c
    sget v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v5, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    xor-int/lit16 v5, v5, -0x9f3

    xor-int/2addr v2, v5

    if-ltz v2, :cond_1d

    const-string v2, "\u06e7\u06e3\u06e4"

    goto/16 :goto_c

    :cond_1d
    const-string v2, "\u06e1\u06e5\u06e6"

    :goto_14
    invoke-static {v2}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_1e
    :sswitch_1d
    sget v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v5, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    or-int/lit16 v5, v5, -0x191d

    div-int/2addr v2, v5

    if-ltz v2, :cond_1f

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    const-string v2, "\u06e2\u06e6\u06e6"

    move-object v5, v2

    :goto_15
    invoke-static {v5}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_1f
    const-string v2, "\u06df\u06e8\u06e8"

    :goto_16
    invoke-static {v2}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_1e
    const v2, 0x3eb33333    # 0.35f

    mul-float v2, v2, v24

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationY(F)V

    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lg7;->d:Z

    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    if-ltz v2, :cond_20

    const/16 v2, 0x4f

    sput v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    const-string v2, "\u06e1\u06e7\u06e5"

    invoke-static {v2}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_20
    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v5, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    add-int/2addr v2, v5

    const v5, 0x1ac173

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_21
    :sswitch_1f
    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v5, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    mul-int/2addr v2, v5

    const v5, 0x199272

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_20
    move-object/from16 v0, v35

    move-object/from16 v1, p0

    iput-object v0, v1, Lg7;->b:Lo40;

    sget v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    if-gtz v2, :cond_22

    const-string v2, "\u06e4\u06e4\u06e4"

    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_22
    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v5, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    xor-int/2addr v2, v5

    const v5, 0x1ac640

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_21
    const/4 v2, 0x0

    cmpg-float v2, v32, v2

    if-gez v2, :cond_4

    const-string v2, "\u06e1\u06e5\u06e0"

    invoke-static {v2}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_22
    move-object/from16 v0, p0

    iget-object v5, v0, Lg7;->b:Lo40;

    if-eqz v5, :cond_7a

    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    if-gtz v2, :cond_23

    const/16 v2, 0x4b

    sput v2, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    move-object/from16 v2, v19

    :goto_17
    const-string v9, "\u06e2\u06e5\u06e7"

    invoke-static {v9}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v19, v2

    move-object/from16 v20, v5

    move/from16 v37, v9

    goto/16 :goto_0

    :cond_23
    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v9, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    or-int/2addr v2, v9

    const v9, 0x1ab64e

    add-int/2addr v2, v9

    move-object/from16 v20, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_23
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lg7;->d:Z

    if-eqz v2, :cond_95

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lg7;->c:F

    const/4 v2, 0x0

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationY(F)V

    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lg7;->d:Z

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object/from16 v0, v18

    invoke-virtual {v0, v2, v5}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    if-gtz v2, :cond_24

    const/16 v2, 0x22

    sput v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    const-string v2, "\u06e7\u06e5\u06df"

    invoke-static {v2}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_24
    const-string v2, "\u06e0\u06df\u06df"

    move-object v9, v2

    :goto_18
    invoke-static {v9}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_24
    const/4 v12, 0x0

    :goto_19
    :sswitch_25
    return v12

    :sswitch_26
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lg7;->d:Z

    if-nez v2, :cond_8d

    invoke-virtual/range {v18 .. v18}, Landroid/view/View;->getTranslationY()F

    move-result v2

    const/4 v5, 0x0

    cmpg-float v2, v2, v5

    if-nez v2, :cond_8d

    const-string v2, "\u06e7\u06e4\u06e3"

    move-object v5, v2

    :goto_1a
    invoke-static {v5}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_25
    :sswitch_27
    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    move-result v2

    if-gtz v2, :cond_26

    const/16 v2, 0x47

    sput v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    const-string v2, "\u06e0\u06e1\u06e7"

    invoke-static {v2}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_26
    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v5, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    xor-int/2addr v2, v5

    const v5, 0x1ab2af

    xor-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_28
    if-nez v23, :cond_5b

    sget v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v5, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    div-int/lit16 v5, v5, -0x1bb4

    or-int/2addr v2, v5

    if-gtz v2, :cond_27

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    const-string v2, "\u06e2\u06e0\u06e3"

    goto/16 :goto_b

    :cond_27
    const-string v2, "\u06e3\u06e1\u06e2"

    move-object v5, v2

    goto/16 :goto_5

    :sswitch_29
    if-nez v7, :cond_87

    invoke-static {}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->ۢۢۧۨ()I

    move-result v2

    if-gtz v2, :cond_29

    invoke-static {}, Landroidx/activity/result/۟ۡۧ۠ۥ;->۟ۥۥۧ۟()I

    :cond_28
    const-string v2, "\u06e7\u06e4\u06e1"

    goto/16 :goto_10

    :cond_29
    const-string v2, "\u06e1\u06e0\u06e3"

    invoke-static {v2}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_2a
    :sswitch_2a
    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v5, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    add-int/lit16 v5, v5, -0x1e3d

    add-int/2addr v2, v5

    if-ltz v2, :cond_2b

    const-string v2, "\u06df\u06e8\u06e4"

    goto/16 :goto_e

    :cond_2b
    const-string v2, "\u06e8\u06e6\u06df"

    move-object v9, v2

    goto/16 :goto_2

    :sswitch_2b
    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    if-gtz v2, :cond_2d

    :cond_2c
    const-string v2, "\u06df\u06e7\u06e4"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_2d
    const-string v2, "\u06e2\u06df\u06df"

    :goto_1b
    invoke-static {v2}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_2c
    const v2, 0x3eb33333    # 0.35f

    mul-float/2addr v2, v8

    invoke-virtual {v11, v2}, Landroid/view/View;->setTranslationY(F)V

    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lg7;->d:Z

    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v5, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    or-int/lit16 v5, v5, -0xee0

    add-int/2addr v2, v5

    if-gtz v2, :cond_2e

    const-string v2, "\u06e6\u06df\u06e3"

    goto/16 :goto_12

    :cond_2e
    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v5, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    add-int/2addr v2, v5

    const v5, 0x1abf2c

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_2d
    const/4 v2, 0x0

    cmpl-float v2, v8, v2

    if-gtz v2, :cond_5f

    sget v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v5, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    div-int/lit16 v5, v5, 0x1c70

    mul-int/2addr v2, v5

    if-eqz v2, :cond_2f

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    const-string v2, "\u06e1\u06e4\u06e0"

    invoke-static {v2}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_2f
    const-string v2, "\u06e0\u06e2\u06e0"

    move-object/from16 v5, v33

    move-object v9, v2

    :goto_1c
    invoke-static {v9}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v33, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_2e
    move-object/from16 v2, v19

    move v9, v13

    :cond_30
    invoke-static {}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->ۢۢۧۨ()I

    move-result v5

    if-gtz v5, :cond_31

    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    const-string v5, "\u06df\u06e5\u06e1"

    invoke-static {v5}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v19, v2

    move v13, v9

    move/from16 v37, v5

    goto/16 :goto_0

    :cond_31
    const-string v5, "\u06e6\u06df\u06e8"

    move-object/from16 v19, v2

    move/from16 v10, v31

    move v13, v9

    :goto_1d
    invoke-static {v5}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v10

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_2f
    move-object/from16 v0, p0

    iget-object v2, v0, Lg7;->b:Lo40;

    if-eqz v2, :cond_76

    sget v5, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v9, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    or-int/lit16 v9, v9, -0x211

    mul-int/2addr v5, v9

    if-ltz v5, :cond_32

    :goto_1e
    const-string v5, "\u06e6\u06e1\u06e4"

    invoke-static {v5}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v21, v2

    move/from16 v37, v5

    goto/16 :goto_0

    :cond_32
    const-string v5, "\u06e4\u06e2\u06e7"

    move-object/from16 v21, v2

    :goto_1f
    invoke-static {v5}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_30
    move-object/from16 v0, p0

    iget-object v2, v0, Lg7;->b:Lo40;

    if-eqz v2, :cond_18

    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    move-result v5

    if-gtz v5, :cond_33

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    const-string v5, "\u06e7\u06e2\u06e2"

    invoke-static {v5}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v16, v2

    move/from16 v37, v5

    goto/16 :goto_0

    :cond_33
    sget v5, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v9, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    xor-int/2addr v5, v9

    const v9, 0x1abc7b

    xor-int/2addr v5, v9

    move-object/from16 v16, v2

    move/from16 v37, v5

    goto/16 :goto_0

    :sswitch_31
    move-object/from16 v0, p0

    iget-object v2, v0, Lg7;->b:Lo40;

    if-eqz v2, :cond_88

    sget v5, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v9, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    xor-int/lit16 v9, v9, 0x65b

    xor-int/2addr v5, v9

    if-gtz v5, :cond_34

    const-string v5, "\u06df\u06e1"

    invoke-static {v5}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v34, v2

    move/from16 v37, v5

    goto/16 :goto_0

    :cond_34
    const-string v5, "\u06e6\u06e4\u06e4"

    move-object/from16 v34, v2

    move-object v9, v5

    goto/16 :goto_2

    :sswitch_32
    move-object/from16 v0, v36

    move-object/from16 v1, p0

    iput-object v0, v1, Lg7;->b:Lo40;

    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v5, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    rem-int/lit16 v5, v5, -0xe77

    div-int/2addr v2, v5

    if-eqz v2, :cond_35

    invoke-static {}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۦۣ۠()I

    const-string v2, "\u06e1\u06e1\u06e7"

    goto/16 :goto_11

    :cond_35
    const-string v2, "\u06e7\u06e0\u06e8"

    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_33
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lg7;->c:F

    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v5, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    div-int/lit16 v5, v5, 0x24bf

    mul-int/2addr v2, v5

    if-eqz v2, :cond_36

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    const-string v2, "\u06e1\u06e5\u06e6"

    invoke-static {v2}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_36
    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v5, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    or-int/2addr v2, v5

    const v5, 0x1ac50b

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_34
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lg7;->d:Z

    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v5, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    add-int/lit16 v5, v5, 0xaf

    div-int/2addr v2, v5

    if-gtz v2, :cond_38

    const/16 v2, 0x1c

    sput v2, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    move v12, v13

    :cond_37
    const-string v2, "\u06e2\u06e0\u06e1"

    invoke-static {v2}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_38
    const-string v2, "\u06e4\u06e0\u06e2"

    move-object v5, v2

    move v9, v13

    goto/16 :goto_d

    :sswitch_35
    const/4 v2, 0x0

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Lo40;->b(F)V

    const-string v2, "\u06e1\u06e7\u06e5"

    move-object v5, v2

    move v9, v12

    goto/16 :goto_d

    :sswitch_36
    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    if-ltz v2, :cond_39

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    const-string v2, "\u06e8\u06e6"

    invoke-static {v2}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_39
    sget v2, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v5, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    div-int/2addr v2, v5

    const v5, 0x1aa703

    xor-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_37
    const/4 v12, 0x0

    goto/16 :goto_19

    :sswitch_38
    const/4 v2, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v2}, Lo40;->b(F)V

    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v5, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    mul-int/lit16 v5, v5, 0xbce

    add-int/2addr v2, v5

    if-ltz v2, :cond_37

    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    const-string v2, "\u06e0\u06e8\u06e0"

    invoke-static {v2}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :pswitch_1
    :sswitch_39
    invoke-static {}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->۟ۦۥۨ۠()I

    move-result v2

    if-ltz v2, :cond_3a

    const/4 v2, 0x4

    sput v2, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    const-string v2, "\u06e3\u06e3\u06e8"

    invoke-static {v2}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_3a
    sget v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v5, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    xor-int/2addr v2, v5

    const v5, 0x1ab3a3

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_3a
    move/from16 v2, v22

    :cond_3b
    sget v5, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v9, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    or-int/lit16 v9, v9, -0x1ac0

    div-int/2addr v5, v9

    if-ltz v5, :cond_3c

    const/16 v5, 0x60

    sput v5, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    const-string v5, "\u06e5\u06e5\u06e3"

    move/from16 v22, v2

    goto/16 :goto_6

    :cond_3c
    const-string v5, "\u06e1\u06e6\u06e1"

    invoke-static {v5}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v37, v5

    move/from16 v22, v2

    goto/16 :goto_0

    :sswitch_3b
    sget v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v5, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    or-int/2addr v2, v5

    const v5, 0xdbe3

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_3c
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    const/high16 v5, 0x41f00000    # 30.0f

    add-float/2addr v2, v5

    move-object/from16 v0, p0

    iget v5, v0, Lg7;->c:F

    sub-float/2addr v2, v5

    const/high16 v5, 0x41f00000    # 30.0f

    sub-float v32, v2, v5

    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    xor-int/lit16 v2, v2, -0xb7

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v2

    const/4 v5, 0x1

    move-object/from16 v0, v17

    invoke-virtual {v0, v5}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v9

    if-nez v2, :cond_69

    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v5, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    xor-int/lit16 v5, v5, 0x2618

    or-int/2addr v2, v5

    if-ltz v2, :cond_3d

    const-string v2, "\u06e7\u06e2\u06e4"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v9

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_3d
    const-string v2, "\u06e7\u06e4\u06e5"

    move-object v5, v2

    move v10, v9

    goto/16 :goto_1d

    :sswitch_3d
    move/from16 v2, v23

    move/from16 v5, v24

    :cond_3e
    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    move-result v9

    if-ltz v9, :cond_3f

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    const-string v9, "\u06e7\u06df"

    move/from16 v23, v2

    move/from16 v24, v5

    :goto_20
    invoke-static {v9}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_3f
    sget v9, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v10, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    xor-int/2addr v9, v10

    const v10, 0x1ab228

    add-int/2addr v9, v10

    move/from16 v23, v2

    move/from16 v37, v9

    move/from16 v24, v5

    goto/16 :goto_0

    :cond_40
    :sswitch_3e
    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    move-result v2

    if-gtz v2, :cond_41

    invoke-static {}, Landroidx/activity/result/۟ۡۧ۠ۥ;->۟ۥۥۧ۟()I

    const-string v2, "\u06e3\u06e4\u06e7"

    invoke-static {v2}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_41
    sget v2, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v5, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    xor-int/2addr v2, v5

    const v5, 0x1abdb3

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_3f
    move-object/from16 v2, v25

    :cond_42
    sget v5, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v9, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    add-int/lit16 v9, v9, -0x23d6

    sub-int/2addr v5, v9

    if-gtz v5, :cond_43

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    const-string v9, "\u06e6\u06e4\u06df"

    move-object/from16 v25, v2

    move-object/from16 v5, v26

    goto/16 :goto_8

    :cond_43
    sget v5, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v9, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    or-int/2addr v5, v9

    const v9, 0x1aa7fb

    add-int/2addr v5, v9

    move-object/from16 v25, v2

    move/from16 v37, v5

    goto/16 :goto_0

    :sswitch_40
    const/high16 v2, -0x40800000    # -1.0f

    move-object/from16 v0, p0

    iput v2, v0, Lg7;->c:F

    move-object/from16 v0, p0

    iget-boolean v2, v0, Lg7;->d:Z

    if-nez v2, :cond_44

    invoke-virtual {v4}, Landroid/view/View;->getTranslationY()F

    move-result v2

    const/4 v5, 0x0

    cmpg-float v2, v2, v5

    if-nez v2, :cond_44

    sget v2, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v5, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    xor-int/2addr v2, v5

    const v5, 0x1ab0f9

    add-int/2addr v2, v5

    move v12, v13

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_41
    const-string v2, "\u06e0\u06e6\u06e4"

    move v12, v13

    goto/16 :goto_e

    :cond_44
    :sswitch_42
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v5, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    xor-int/2addr v2, v5

    const v5, 0x1ac9cc

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_43
    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v5, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    mul-int/lit16 v5, v5, 0x21c6

    sub-int/2addr v2, v5

    if-ltz v2, :cond_45

    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    const-string v2, "\u06df\u06e2\u06e2"

    invoke-static {v2}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_45
    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v5, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    div-int/2addr v2, v5

    const v5, 0x1abe5f

    xor-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_46
    :sswitch_44
    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    if-ltz v2, :cond_47

    const/16 v2, 0x19

    sput v2, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    const-string v2, "\u06e1\u06e1\u06e6"

    :goto_21
    invoke-static {v2}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_47
    sget v2, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v5, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    div-int/2addr v2, v5

    const v5, 0x1ab343

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_45
    move-object v2, v3

    :cond_48
    const-string v5, "\u06e2\u06e6"

    move-object v3, v2

    goto/16 :goto_5

    :sswitch_46
    move-object/from16 v0, p0

    iget-object v2, v0, Lg7;->b:Lo40;

    if-eqz v2, :cond_12

    sget v5, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v9, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    xor-int/lit16 v9, v9, -0x2262

    mul-int/2addr v5, v9

    if-ltz v5, :cond_49

    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    const-string v5, "\u06e5\u06e0\u06e1"

    invoke-static {v5}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v5

    move-object v14, v2

    move/from16 v37, v5

    goto/16 :goto_0

    :cond_49
    const-string v5, "\u06e6\u06df\u06e3"

    move-object v14, v2

    move-object v9, v5

    goto/16 :goto_2

    :sswitch_47
    const/4 v2, 0x0

    cmpl-float v2, v24, v2

    if-gtz v2, :cond_85

    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v5, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    mul-int/lit16 v5, v5, -0x1fb0

    sub-int/2addr v2, v5

    if-ltz v2, :cond_4a

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟ۡۡۦ()I

    const-string v2, "\u06e5\u06e4\u06e5"

    invoke-static {v2}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_4a
    const-string v2, "\u06e1\u06e4\u06e5"

    :goto_22
    invoke-static {v2}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_48
    invoke-virtual {v14}, Lo40;->c()V

    sget v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    if-gtz v2, :cond_4b

    const-string v2, "\u06df\u06e1\u06e4"

    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_4b
    sget v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v5, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    xor-int/2addr v2, v5

    const v5, -0x1aa6cb

    xor-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_49
    invoke-virtual/range {v18 .. v18}, Landroid/view/View;->getLayerType()I

    move-result v2

    const/4 v5, 0x2

    if-eq v2, v5, :cond_a

    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v5, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    add-int/lit16 v5, v5, 0x12a

    div-int/2addr v2, v5

    if-ltz v2, :cond_4c

    const/16 v2, 0x62

    sput v2, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    :cond_4c
    const-string v2, "\u06e1\u06e4\u06df"

    invoke-static {v2}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_4a
    const/4 v2, 0x0

    move-object/from16 v0, v16

    invoke-virtual {v0, v2}, Lo40;->b(F)V

    sget v2, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v5, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    rem-int/lit16 v5, v5, 0x3b9

    add-int/2addr v2, v5

    if-ltz v2, :cond_4d

    const/16 v2, 0x54

    sput v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    const-string v2, "\u06e5\u06df\u06e8"

    invoke-static {v2}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_4d
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v5, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    xor-int/2addr v2, v5

    const v5, 0xdd8f

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_4b
    move-object/from16 v2, v17

    :cond_4e
    sget v5, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v9, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    div-int/lit16 v9, v9, -0x83d

    xor-int/2addr v5, v9

    if-ltz v5, :cond_4f

    const/16 v5, 0x1e

    sput v5, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    const-string v5, "\u06df\u06e6"

    move-object/from16 v17, v2

    goto/16 :goto_1f

    :cond_4f
    sget v5, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v9, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    rem-int/2addr v5, v9

    const v9, 0x1aaae8

    add-int/2addr v5, v9

    move-object/from16 v17, v2

    move/from16 v37, v5

    goto/16 :goto_0

    :cond_50
    :sswitch_4c
    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v5, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    mul-int/lit16 v5, v5, -0x4df

    or-int/2addr v2, v5

    if-gtz v2, :cond_51

    const/16 v2, 0x4b

    sput v2, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    const-string v2, "\u06e0\u06e7\u06e4"

    invoke-static {v2}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_51
    const-string v2, "\u06e1\u06e5\u06e0"

    goto/16 :goto_1b

    :sswitch_4d
    move-object/from16 v2, v27

    :cond_52
    sget v5, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v9, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    xor-int/lit16 v9, v9, 0x1dd9

    xor-int/2addr v5, v9

    if-gtz v5, :cond_53

    const/16 v5, 0x53

    sput v5, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    const-string v9, "\u06e7\u06df\u06e6"

    move-object/from16 v27, v2

    move-object/from16 v5, v28

    goto/16 :goto_3

    :cond_53
    sget v5, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v9, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    mul-int/2addr v5, v9

    const v9, 0x16c646

    add-int/2addr v5, v9

    move-object/from16 v27, v2

    move/from16 v37, v5

    goto/16 :goto_0

    :sswitch_4e
    sget v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v5, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    rem-int/2addr v2, v5

    const v5, 0x1ab6ff

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_4f
    const-string v2, "dg==\n"

    const-string v5, "AIsN+rIe7l4=\n"

    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "czjAqtk=\n"

    const-string v5, "Fk6lxK1pbaw=\n"

    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p2

    invoke-static {v2, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v2, p1

    check-cast v2, Landroid/widget/ScrollView;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v5

    if-nez v5, :cond_4e

    const-string v9, "\u06e1\u06e1\u06e7"

    move-object/from16 v5, v18

    goto/16 :goto_13

    :sswitch_50
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lg7;->d:Z

    if-nez v2, :cond_98

    invoke-virtual {v11}, Landroid/view/View;->getTranslationY()F

    move-result v2

    const/4 v5, 0x0

    cmpg-float v2, v2, v5

    if-nez v2, :cond_98

    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    move-result v2

    if-gtz v2, :cond_28

    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    const-string v2, "\u06e2\u06e7\u06e8"

    invoke-static {v2}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_51
    if-nez v31, :cond_4

    const-string v2, "\u06df\u06e1\u06e4"

    invoke-static {v2}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_52
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lg7;->d:Z

    sget v2, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v5, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    add-int/lit16 v5, v5, 0x1ab5

    or-int/2addr v2, v5

    if-ltz v2, :cond_2c

    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    const-string v2, "\u06e3\u06e8\u06e4"

    invoke-static {v2}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_53
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lg7;->d:Z

    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v5, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    add-int/lit16 v5, v5, -0x18cc

    mul-int/2addr v2, v5

    if-ltz v2, :cond_54

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    const-string v2, "\u06e7\u06e4\u06e5"

    :goto_23
    invoke-static {v2}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_54
    const-string v2, "\u06e8\u06e0\u06e3"

    move-object v5, v2

    goto/16 :goto_1a

    :cond_55
    :sswitch_54
    sget v2, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v5, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    rem-int/lit16 v5, v5, 0x1547

    xor-int/2addr v2, v5

    if-ltz v2, :cond_56

    const/16 v2, 0x48

    sput v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    const-string v2, "\u06e8\u06e1\u06e8"

    goto/16 :goto_14

    :cond_56
    const-string v2, "\u06e8\u06e1\u06e4"

    move-object v5, v2

    goto/16 :goto_5

    :sswitch_55
    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    move-result v2

    if-gtz v2, :cond_57

    const/16 v2, 0x8

    sput v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    const-string v2, "\u06e6\u06e4\u06e5"

    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_57
    sget v2, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v5, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    or-int/2addr v2, v5

    const v5, -0xdc46

    xor-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_56
    const/4 v2, 0x0

    cmpl-float v2, v32, v2

    if-gtz v2, :cond_50

    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    if-gtz v2, :cond_58

    const/4 v2, 0x1

    sput v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    const-string v2, "\u06e0\u06e8\u06e5"

    invoke-static {v2}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_58
    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v5, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    rem-int/2addr v2, v5

    const v5, -0x1ab747

    xor-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_57
    const/4 v2, 0x0

    move-object/from16 v0, v25

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    move-object/from16 v0, p0

    iget-object v2, v0, Lg7;->b:Lo40;

    if-nez v2, :cond_8e

    new-instance v2, Lo40;

    sget-object v9, Lo40;->n:Lsh;

    invoke-direct {v2, v5, v9}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    const/4 v9, 0x0

    const/high16 v10, 0x43160000    # 150.0f

    const v18, 0x3f333333    # 0.7f

    move/from16 v0, v18

    invoke-static {v9, v10, v0}, Lg40;->f(FFF)Lp40;

    move-result-object v9

    iput-object v9, v2, Lo40;->k:Lp40;

    new-instance v9, Lc6;

    sget v10, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    xor-int/lit16 v10, v10, 0x386

    invoke-direct {v9, v5, v10}, Lc6;-><init>(Landroid/view/KeyEvent$Callback;I)V

    invoke-virtual {v2, v9}, Lo40;->a(Luh;)V

    sget v9, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v10, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    add-int/lit16 v10, v10, -0x6cc

    add-int/2addr v9, v10

    if-ltz v9, :cond_59

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    const-string v9, "\u06e4\u06e2\u06e1"

    invoke-static {v9}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v35, v2

    move-object/from16 v18, v5

    move/from16 v37, v9

    goto/16 :goto_0

    :cond_59
    sget v9, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v10, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    xor-int/2addr v9, v10

    const v10, 0x1abac2

    add-int/2addr v9, v10

    move-object/from16 v35, v2

    move-object/from16 v18, v5

    move/from16 v37, v9

    goto/16 :goto_0

    :sswitch_58
    sget v2, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v5, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    or-int/lit16 v5, v5, 0x1f6f

    sub-int/2addr v2, v5

    if-ltz v2, :cond_5a

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    const-string v2, "\u06e7\u06e8\u06e8"

    move-object v5, v2

    move/from16 v10, v31

    goto/16 :goto_1d

    :cond_5a
    sget v2, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v5, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    mul-int/2addr v2, v5

    const v5, 0x221cf1

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_59
    const-string v2, "\u06e3\u06e8\u06e6"

    goto/16 :goto_23

    :cond_5b
    :sswitch_5a
    const-string v2, "\u06e6\u06e7\u06e3"

    move-object/from16 v5, v26

    move-object v9, v2

    goto/16 :goto_8

    :sswitch_5b
    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    if-gtz v2, :cond_5c

    const-string v2, "\u06e0\u06e6\u06e4"

    invoke-static {v2}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_5c
    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v5, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    mul-int/2addr v2, v5

    const v5, 0x1aa7a7

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_5d
    :sswitch_5c
    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v5, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    xor-int/2addr v2, v5

    const v5, 0x1aaeb0

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_5d
    sget v2, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v5, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    mul-int/lit16 v5, v5, -0x2150

    or-int/2addr v2, v5

    if-gtz v2, :cond_5e

    const-string v2, "\u06e6\u06df\u06e7"

    invoke-static {v2}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_5e
    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v5, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    or-int/2addr v2, v5

    const v5, -0x1ac6bb

    xor-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_5e
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lg7;->d:Z

    sget v2, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v5, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    or-int/2addr v2, v5

    const v5, 0x1ab6e1

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_5f
    :sswitch_5f
    const-string v2, "\u06e6\u06e1\u06e4"

    goto/16 :goto_21

    :sswitch_60
    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v5, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    xor-int/lit16 v5, v5, -0x414

    add-int/2addr v2, v5

    if-ltz v2, :cond_60

    const/16 v2, 0x42

    sput v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    const-string v2, "\u06e1\u06e3\u06e4"

    invoke-static {v2}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_60
    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v5, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sub-int/2addr v2, v5

    const v5, 0x1ac082

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_61
    const/4 v2, 0x0

    cmpl-float v2, v22, v2

    if-gtz v2, :cond_19

    sget v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v5, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    xor-int/2addr v2, v5

    const v5, 0x1aad25

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_62
    move-object/from16 v0, v26

    move-object/from16 v1, p0

    iput-object v0, v1, Lg7;->b:Lo40;

    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v5, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    or-int/lit16 v5, v5, 0x42b

    mul-int/2addr v2, v5

    if-gtz v2, :cond_61

    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    :goto_24
    const-string v2, "\u06e3\u06df\u06e1"

    invoke-static {v2}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_61
    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v5, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sub-int/2addr v2, v5

    const v5, 0xd912

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_63
    move-object/from16 v2, v28

    :cond_62
    sget v5, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v9, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    mul-int/lit16 v9, v9, 0x2092

    mul-int/2addr v5, v9

    if-gtz v5, :cond_63

    const/16 v5, 0x9

    sput v5, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    const-string v5, "\u06df\u06df\u06e1"

    move-object/from16 v28, v2

    goto/16 :goto_9

    :cond_63
    sget v5, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v9, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    or-int/2addr v5, v9

    const v9, 0x1ab35c

    add-int/2addr v5, v9

    move-object/from16 v28, v2

    move/from16 v37, v5

    goto/16 :goto_0

    :sswitch_64
    move-object/from16 v0, p0

    iget-object v2, v0, Lg7;->b:Lo40;

    if-eqz v2, :cond_16

    sget v5, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v9, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    add-int/lit16 v9, v9, 0x2209

    sub-int/2addr v5, v9

    if-ltz v5, :cond_64

    const-string v5, "\u06e0\u06e1\u06e3"

    :goto_25
    invoke-static {v5}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v5

    move-object v15, v2

    move/from16 v37, v5

    goto/16 :goto_0

    :cond_64
    const-string v5, "\u06e1\u06e2\u06e5"

    move-object v15, v2

    goto/16 :goto_15

    :sswitch_65
    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v5, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    mul-int/2addr v2, v5

    const v5, 0x1920c9

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_66
    const/4 v2, 0x0

    move-object/from16 v0, v21

    invoke-virtual {v0, v2}, Lo40;->b(F)V

    const-string v2, "\u06e8\u06e6\u06e3"

    goto/16 :goto_10

    :sswitch_67
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    xor-int/lit8 v2, v2, 0x73

    move-object/from16 v0, v19

    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v5

    const/4 v2, 0x1

    move-object/from16 v0, v19

    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v2

    if-eqz v5, :cond_9a

    if-eqz v2, :cond_9a

    const/high16 v9, -0x40800000    # -1.0f

    move-object/from16 v0, p0

    iput v9, v0, Lg7;->c:F

    move-object/from16 v0, p0

    iget-boolean v9, v0, Lg7;->d:Z

    if-eqz v9, :cond_a3

    const/4 v9, 0x0

    invoke-virtual {v4, v9}, Landroid/view/View;->setTranslationY(F)V

    const/4 v9, 0x0

    move-object/from16 v0, p0

    iput-boolean v9, v0, Lg7;->d:Z

    sget v9, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v10, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    add-int/lit16 v10, v10, 0x2414

    rem-int/2addr v9, v10

    if-ltz v9, :cond_65

    const/16 v9, 0x38

    sput v9, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    const-string v9, "\u06df\u06e3"

    move/from16 v29, v2

    move/from16 v30, v5

    move v12, v13

    goto/16 :goto_18

    :cond_65
    move/from16 v29, v2

    move/from16 v30, v5

    move v12, v13

    goto/16 :goto_24

    :sswitch_68
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    if-eqz v2, :cond_25

    const/4 v5, 0x1

    if-eq v2, v5, :cond_8a

    const/4 v5, 0x2

    if-eq v2, v5, :cond_92

    const/4 v5, 0x3

    if-eq v2, v5, :cond_8a

    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v5, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    or-int/lit16 v5, v5, -0xed5

    xor-int/2addr v2, v5

    if-gtz v2, :cond_66

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    const-string v2, "\u06df\u06e6\u06e0"

    invoke-static {v2}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v2

    move v12, v13

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_66
    move v12, v13

    :cond_67
    const-string v2, "\u06e8\u06df\u06e2"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_69
    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    move-result v2

    if-ltz v2, :cond_68

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    const-string v2, "\u06e1\u06e8\u06e5"

    invoke-static {v2}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_68
    const-string v2, "\u06e1\u06e4\u06e1"

    invoke-static {v2}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_6a
    move/from16 v9, v31

    :cond_69
    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    if-ltz v2, :cond_6a

    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    const-string v2, "\u06e3\u06e0\u06e3"

    :goto_26
    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v9

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_6a
    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v5, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    or-int/2addr v2, v5

    const v5, -0x1ab7bc

    xor-int/2addr v2, v5

    move/from16 v31, v9

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_6b
    :sswitch_6b
    sget v2, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    if-ltz v2, :cond_6c

    const/4 v2, 0x0

    sput v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    const-string v2, "\u06e3\u06e1\u06e7"

    invoke-static {v2}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_6c
    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v5, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    or-int/2addr v2, v5

    const v5, -0x1aba21

    xor-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_6c
    const/4 v2, 0x0

    cmpg-float v2, v8, v2

    if-gez v2, :cond_87

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    move-result v2

    if-gtz v2, :cond_6d

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    const-string v2, "\u06e7\u06e8"

    invoke-static {v2}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_6d
    move-object/from16 v2, v21

    goto/16 :goto_1e

    :sswitch_6d
    invoke-static {}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->۟ۦۥۨ۠()I

    move-result v2

    if-ltz v2, :cond_6e

    const-string v2, "\u06e5\u06e8\u06df"

    invoke-static {v2}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_6e
    const-string v2, "\u06e6\u06e2\u06e8"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_6e
    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v5, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    or-int/lit16 v5, v5, -0x1d61

    div-int/2addr v2, v5

    if-eqz v2, :cond_6f

    const/16 v2, 0x2f

    sput v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    const-string v2, "\u06e3\u06e4\u06df"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_6f
    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v5, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    rem-int/2addr v2, v5

    const v5, 0x1ac1f0

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_6f
    const/high16 v2, -0x40800000    # -1.0f

    move-object/from16 v0, p0

    iput v2, v0, Lg7;->c:F

    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lg7;->d:Z

    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v5, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    rem-int/lit16 v5, v5, -0x21fd

    rem-int/2addr v2, v5

    if-gtz v2, :cond_70

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟ۡۡۦ()I

    const-string v2, "\u06e8\u06e3\u06e3"

    invoke-static {v2}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_70
    sget v2, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v5, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    add-int/2addr v2, v5

    const v5, 0x1ab87c

    xor-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_70
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lg7;->d:Z

    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    if-gtz v2, :cond_71

    const/16 v2, 0x8

    sput v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    const-string v2, "\u06e1\u06e0\u06e3"

    invoke-static {v2}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_71
    const-string v2, "\u06e1\u06e3\u06e4"

    goto/16 :goto_11

    :sswitch_71
    move-object/from16 v0, p0

    iget v2, v0, Lg7;->a:I

    packed-switch v2, :pswitch_data_0

    :sswitch_72
    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v5, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    rem-int/lit16 v5, v5, -0x1bd4

    xor-int/2addr v2, v5

    if-eqz v2, :cond_78

    const-string v2, "\u06e8\u06e4\u06e1"

    invoke-static {v2}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_73
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lg7;->d:Z

    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v5, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    xor-int/2addr v2, v5

    const v5, -0x1ac1a5

    xor-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_72
    :sswitch_74
    sget v2, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v5, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    add-int/lit16 v5, v5, 0x40d

    xor-int/2addr v2, v5

    if-gtz v2, :cond_73

    const/16 v2, 0x1c

    sput v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    const-string v2, "\u06e3\u06e2\u06e0"

    goto/16 :goto_22

    :cond_73
    const-string v2, "\u06e0\u06e8\u06e2"

    goto/16 :goto_a

    :sswitch_75
    const/4 v2, 0x0

    cmpg-float v2, v22, v2

    if-gez v2, :cond_1c

    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    if-gtz v2, :cond_74

    const/16 v2, 0x17

    sput v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    const-string v2, "\u06e5\u06e5\u06df"

    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_74
    const-string v2, "\u06e3\u06e7\u06e5"

    move-object v5, v2

    goto/16 :goto_1a

    :sswitch_76
    invoke-virtual/range {v34 .. v34}, Lo40;->c()V

    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v5, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    mul-int/2addr v2, v5

    const v5, 0x1a6dff

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_77
    sget v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    if-gtz v2, :cond_75

    const/16 v2, 0x2e

    sput v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    const-string v2, "\u06e7\u06e4\u06e3"

    invoke-static {v2}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_75
    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v5, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    add-int/2addr v2, v5

    const v5, 0x1aa7a2

    xor-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_78
    move-object/from16 v2, v21

    :cond_76
    sget v5, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v9, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    div-int/lit16 v9, v9, 0xed9

    xor-int/2addr v5, v9

    if-gtz v5, :cond_77

    const-string v5, "\u06e0\u06e0"

    move-object/from16 v21, v2

    goto/16 :goto_1a

    :cond_77
    sget v5, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v9, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    div-int/2addr v5, v9

    const v9, 0x1ac9a5

    add-int/2addr v5, v9

    move-object/from16 v21, v2

    move/from16 v37, v5

    goto/16 :goto_0

    :cond_78
    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v5, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    xor-int/2addr v2, v5

    const v5, 0x1ab8a3

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_79
    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v5, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    div-int/2addr v2, v5

    const v5, 0x1aa704

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_7a
    const-string v5, "\u06e2\u06e6\u06e8"

    move-object v2, v15

    goto/16 :goto_25

    :sswitch_7b
    sget v2, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    if-gtz v2, :cond_79

    const/16 v2, 0x58

    sput v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    const-string v2, "\u06e1\u06e4\u06e5"

    invoke-static {v2}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_79
    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v5, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sub-int/2addr v2, v5

    const v5, 0x1aaf13

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_7a
    move-object/from16 v20, v5

    :sswitch_7c
    const-string v2, "\u06e1\u06e7\u06e5"

    move/from16 v9, v31

    goto/16 :goto_26

    :pswitch_2
    :sswitch_7d
    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    move-result v2

    if-gtz v2, :cond_7b

    const-string v2, "\u06e4\u06e8\u06e8"

    goto/16 :goto_16

    :cond_7b
    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v5, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    div-int/2addr v2, v5

    const v5, 0x1ac9c1

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_7e
    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    if-ltz v2, :cond_7c

    const/16 v2, 0x5a

    sput v2, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    const-string v2, "\u06df\u06e5\u06e5"

    invoke-static {v2}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_7c
    const-string v2, "\u06e0\u06e6\u06e3"

    move-object v9, v2

    move v10, v7

    goto/16 :goto_4

    :sswitch_7f
    const/4 v2, 0x0

    cmpg-float v2, v24, v2

    if-gez v2, :cond_5b

    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v5, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    or-int/lit16 v5, v5, 0x22c4

    sub-int/2addr v2, v5

    if-ltz v2, :cond_7d

    const/16 v2, 0x3e

    sput v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    const-string v2, "\u06e4\u06e5\u06e7"

    :goto_27
    invoke-static {v2}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_7d
    const-string v2, "\u06e1\u06df\u06e7"

    move-object v9, v2

    move v10, v7

    move v5, v8

    goto/16 :goto_7

    :sswitch_80
    const/4 v2, 0x0

    move-object/from16 v0, v19

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v4, v0, Lg7;->b:Lo40;

    if-nez v4, :cond_2

    new-instance v5, Lo40;

    sget-object v4, Lo40;->n:Lsh;

    invoke-direct {v5, v2, v4}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    const/4 v4, 0x0

    const v9, 0x44bb8000    # 1500.0f

    const v10, 0x3f333333    # 0.7f

    invoke-static {v4, v9, v10}, Lg40;->f(FFF)Lp40;

    move-result-object v4

    iput-object v4, v5, Lo40;->k:Lp40;

    sget v4, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v9, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    or-int/lit16 v9, v9, -0x82

    sub-int/2addr v4, v9

    if-gtz v4, :cond_7e

    const-string v9, "\u06e2\u06e8\u06e0"

    move-object v4, v2

    goto/16 :goto_1c

    :cond_7e
    const-string v4, "\u06df\u06e8\u06e0"

    invoke-static {v4}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v33, v5

    move-object v4, v2

    move/from16 v37, v9

    goto/16 :goto_0

    :sswitch_81
    move-object/from16 v0, p0

    iget v2, v0, Lg7;->c:F

    const/high16 v5, -0x40800000    # -1.0f

    cmpg-float v2, v2, v5

    if-nez v2, :cond_55

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lg7;->c:F

    sget v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v5, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    add-int/2addr v2, v5

    const v5, 0x1ac0e4

    add-int/2addr v2, v5

    move v12, v13

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_82
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lg7;->d:Z

    sget v2, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v5, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    mul-int/lit16 v5, v5, 0x10d1

    rem-int/2addr v2, v5

    if-gtz v2, :cond_7f

    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    const-string v2, "\u06df\u06e8\u06e8"

    invoke-static {v2}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_7f
    sget v2, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v5, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    div-int/2addr v2, v5

    const v5, 0x1ab71f

    xor-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_80
    :sswitch_83
    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    if-ltz v2, :cond_81

    const-string v2, "\u06e0\u06e1\u06e4"

    :goto_28
    invoke-static {v2}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_81
    sget v2, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v5, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    rem-int/2addr v2, v5

    const v5, -0xdb29

    xor-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_82
    :sswitch_84
    sget v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    if-gtz v2, :cond_83

    const/16 v2, 0x11

    sput v2, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    const-string v2, "\u06e2\u06e4"

    invoke-static {v2}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_83
    const-string v2, "\u06e4\u06e4\u06e4"

    move-object v5, v2

    goto/16 :goto_1f

    :sswitch_85
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lg7;->d:Z

    if-eqz v2, :cond_a2

    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Landroid/view/View;->setTranslationY(F)V

    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lg7;->d:Z

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lg7;->c:F

    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    if-ltz v2, :cond_84

    const/16 v2, 0x4f

    sput v2, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    const-string v2, "\u06e8\u06e3\u06e7"

    invoke-static {v2}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v2

    move v12, v13

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_84
    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v5, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    add-int/2addr v2, v5

    const v5, 0x1abe54

    xor-int/2addr v2, v5

    move v12, v13

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_85
    :sswitch_86
    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v5, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    rem-int/lit16 v5, v5, 0x13b1

    sub-int/2addr v2, v5

    if-gtz v2, :cond_86

    const/16 v2, 0x5d

    sput v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    const-string v2, "\u06df\u06e6\u06e7"

    :goto_29
    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_86
    const-string v2, "\u06e1\u06df\u06e7"

    invoke-static {v2}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_87
    const/4 v2, 0x0

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v5, v0, Lg7;->b:Lo40;

    if-nez v5, :cond_52

    new-instance v5, Lo40;

    sget-object v9, Lo40;->n:Lsh;

    invoke-direct {v5, v2, v9}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    const/4 v9, 0x0

    const v10, 0x44bb8000    # 1500.0f

    const/high16 v27, 0x3f000000    # 0.5f

    move/from16 v0, v27

    invoke-static {v9, v10, v0}, Lg40;->f(FFF)Lp40;

    move-result-object v9

    iput-object v9, v5, Lo40;->k:Lp40;

    sget v9, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v10, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    or-int/2addr v9, v10

    const v10, 0x1aa93f

    add-int/2addr v9, v10

    move-object/from16 v36, v5

    move-object/from16 v27, v2

    move/from16 v37, v9

    goto/16 :goto_0

    :sswitch_88
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-static/range {v22 .. v22}, Ljava/lang/Math;->abs(F)F

    move-result v5

    div-float/2addr v5, v2

    invoke-static/range {v22 .. v22}, Ljava/lang/Math;->signum(F)F

    move-result v9

    const/high16 v10, 0x3f800000    # 1.0f

    const/high16 v12, 0x41500000    # 13.0f

    add-float/2addr v10, v12

    const/high16 v12, 0x3f800000    # 1.0f

    const/high16 v37, 0x3f800000    # 1.0f

    const/16 v38, 0x0

    const/high16 v39, 0x3fc00000    # 1.5f

    mul-float v5, v5, v39

    sub-float v5, v38, v5

    sub-float v5, v37, v5

    div-float v5, v12, v5

    sub-float v5, v10, v5

    const/high16 v10, 0x41500000    # 13.0f

    sub-float/2addr v5, v10

    mul-float/2addr v2, v9

    mul-float/2addr v2, v5

    const/high16 v5, 0x3e800000    # 0.25f

    mul-float/2addr v2, v5

    invoke-virtual {v4, v2}, Landroid/view/View;->setTranslationY(F)V

    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lg7;->d:Z

    const/4 v12, 0x1

    sget v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v5, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    xor-int/lit16 v5, v5, -0x14af

    rem-int/2addr v2, v5

    if-gtz v2, :cond_9f

    const-string v2, "\u06e0\u06e1\u06e8"

    invoke-static {v2}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_87
    :sswitch_89
    sget v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v5, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    mul-int/2addr v2, v5

    const v5, 0x1fb637

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_8a
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    const/high16 v5, 0x40a00000    # 5.0f

    add-float/2addr v2, v5

    move-object/from16 v0, p0

    iget v5, v0, Lg7;->c:F

    sub-float/2addr v2, v5

    const/high16 v5, 0x40a00000    # 5.0f

    sub-float v5, v2, v5

    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    xor-int/lit16 v2, v2, 0x282

    move-object/from16 v0, v25

    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v9

    const/4 v2, 0x1

    move-object/from16 v0, v25

    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v2

    if-nez v9, :cond_3e

    :goto_2a
    const-string v9, "\u06df\u06e0\u06e6"

    invoke-static {v9}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v23, v2

    move/from16 v37, v9

    move/from16 v24, v5

    goto/16 :goto_0

    :sswitch_8b
    move-object/from16 v2, v34

    :cond_88
    sget v5, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v9, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    div-int/lit16 v9, v9, 0x35d

    xor-int/2addr v5, v9

    if-gtz v5, :cond_89

    const-string v5, "\u06e4\u06e4\u06e5"

    move-object/from16 v34, v2

    move-object v9, v5

    move v10, v7

    goto/16 :goto_4

    :cond_89
    sget v5, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v9, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    or-int/2addr v5, v9

    const v9, -0x1aa53a

    xor-int/2addr v5, v9

    move-object/from16 v34, v2

    move/from16 v37, v5

    goto/16 :goto_0

    :cond_8a
    :sswitch_8c
    sget v2, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v5, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    div-int/lit16 v5, v5, 0x21e8

    sub-int/2addr v2, v5

    if-ltz v2, :cond_8b

    const-string v2, "\u06e3\u06e3\u06e0"

    move-object v9, v2

    goto/16 :goto_2

    :cond_8b
    const-string v2, "\u06e0\u06e7\u06e8"

    goto/16 :goto_1b

    :sswitch_8d
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lg7;->c:F

    sget v2, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v5, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    mul-int/lit16 v5, v5, -0x236f

    mul-int/2addr v2, v5

    if-gtz v2, :cond_8c

    invoke-static {}, Lcom/google/android/material/carousel/ۢۢۢۥ;->۟ۡ۟۠ۧ()I

    move/from16 v2, v23

    move/from16 v5, v24

    goto :goto_2a

    :cond_8c
    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v5, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    xor-int/2addr v2, v5

    const v5, 0x1ab69c

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_8d
    :sswitch_8e
    const-string v2, "\u06e0\u06e7"

    goto/16 :goto_14

    :sswitch_8f
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    if-eqz v2, :cond_5d

    const/4 v5, 0x1

    if-eq v2, v5, :cond_80

    const/4 v5, 0x2

    if-eq v2, v5, :cond_9d

    const/4 v5, 0x3

    if-eq v2, v5, :cond_80

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    move-result v2

    if-lez v2, :cond_67

    const-string v2, "\u06e7\u06e3\u06e3"

    goto/16 :goto_27

    :sswitch_90
    move-object/from16 v5, v18

    :cond_8e
    sget v2, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v9, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    rem-int/lit16 v9, v9, -0x2362

    xor-int/2addr v2, v9

    if-gtz v2, :cond_8f

    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    const-string v2, "\u06e8\u06e0\u06e4"

    invoke-static {v2}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v18, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_8f
    const-string v9, "\u06e7\u06e5\u06e2"

    move-object/from16 v2, v17

    goto/16 :goto_13

    :sswitch_91
    const-string v2, "mg==\n"

    const-string v5, "7ItFyqbQH/g=\n"

    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "cXr5Nu0=\n"

    const-string v5, "FAycWJk9otU=\n"

    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p2

    invoke-static {v2, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v2, p1

    check-cast v2, Landroid/widget/ScrollView;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v5

    if-nez v5, :cond_42

    sget v5, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v9, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    div-int/lit16 v9, v9, -0xc81

    xor-int/2addr v5, v9

    if-ltz v5, :cond_90

    const/16 v5, 0x5b

    sput v5, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    const-string v5, "\u06e0\u06e4\u06e5"

    invoke-static {v5}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v25, v2

    move/from16 v37, v5

    goto/16 :goto_0

    :cond_90
    const-string v5, "\u06e6\u06e3\u06e5"

    move-object/from16 v25, v2

    move/from16 v10, v31

    goto/16 :goto_1d

    :sswitch_92
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lg7;->c:F

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    move-result v2

    if-ltz v2, :cond_91

    invoke-static {}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->۟ۦۥۨ۠()I

    const-string v2, "\u06e0\u06df\u06e1"

    invoke-static {v2}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_91
    const-string v2, "\u06e0\u06e0\u06e6"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_92
    :sswitch_93
    sget v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    if-gtz v2, :cond_93

    const-string v2, "\u06e5\u06df"

    goto/16 :goto_1b

    :cond_93
    const-string v2, "\u06e2\u06e2\u06e6"

    invoke-static {v2}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_94
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lg7;->d:Z

    if-eqz v2, :cond_6b

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lg7;->c:F

    const/4 v2, 0x0

    move-object/from16 v0, v27

    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationY(F)V

    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lg7;->d:Z

    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v5, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sub-int/2addr v2, v5

    const v5, 0x1ab3eb

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_95
    invoke-virtual {v15}, Lo40;->c()V

    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    if-ltz v2, :cond_94

    const-string v2, "\u06e6\u06df\u06e4"

    invoke-static {v2}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_94
    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v5, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    div-int/2addr v2, v5

    const v5, 0xdcb7

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_95
    :sswitch_96
    sget v2, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v5, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    add-int/lit16 v5, v5, -0x1b2a

    sub-int/2addr v2, v5

    if-gtz v2, :cond_96

    invoke-static {}, Landroidx/activity/ۣۢۦۨ;->۟ۦۣ۠ۢ()I

    const-string v2, "\u06e1\u06e1\u06e5"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_96
    const-string v2, "\u06e6\u06e3\u06e8"

    goto/16 :goto_29

    :sswitch_97
    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v5, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    add-int/lit16 v5, v5, 0x140b

    div-int/2addr v2, v5

    if-eqz v2, :cond_97

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    const-string v2, "\u06e8\u06df\u06e0"

    invoke-static {v2}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_97
    sget v2, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v5, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    xor-int/2addr v2, v5

    const v5, 0x1ac14e

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_98
    const-string v2, "8g==\n"

    const-string v5, "hCPp6k9MJdU=\n"

    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "Z4GJKr4=\n"

    const-string v5, "AvfsRMqYg9E=\n"

    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p2

    invoke-static {v2, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v2, p1

    check-cast v2, Landroid/widget/ScrollView;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v5

    const/4 v9, 0x0

    if-nez v5, :cond_30

    move-object/from16 v5, v20

    move v13, v9

    move v12, v9

    goto/16 :goto_17

    :sswitch_99
    const/4 v12, 0x0

    goto/16 :goto_19

    :sswitch_9a
    move-object/from16 v0, p0

    iget-object v2, v0, Lg7;->b:Lo40;

    if-eqz v2, :cond_48

    sget v3, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v5, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    div-int/2addr v3, v5

    const v5, 0x1aa77a

    add-int/2addr v5, v3

    move-object v3, v2

    move/from16 v37, v5

    goto/16 :goto_0

    :sswitch_9b
    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v5, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sub-int/2addr v2, v5

    const v5, 0x1aab5b

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_98
    :sswitch_9c
    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v5, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    rem-int/lit16 v5, v5, 0xfb8

    mul-int/2addr v2, v5

    if-gtz v2, :cond_99

    invoke-static {}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۥۧۤ۠()I

    const-string v2, "\u06e0\u06df\u06e7"

    invoke-static {v2}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_99
    const-string v2, "\u06e0\u06e1\u06e8"

    goto/16 :goto_28

    :sswitch_9d
    move/from16 v2, v29

    move/from16 v5, v30

    :cond_9a
    sget v9, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    if-gtz v9, :cond_9b

    const/16 v9, 0x28

    sput v9, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    const-string v9, "\u06e8\u06e7\u06e8"

    invoke-static {v9}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v29, v2

    move/from16 v30, v5

    move/from16 v37, v9

    goto/16 :goto_0

    :cond_9b
    const-string v9, "\u06e2\u06e4\u06e3"

    invoke-static {v9}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v29, v2

    move/from16 v30, v5

    move/from16 v37, v9

    goto/16 :goto_0

    :cond_9c
    :sswitch_9e
    sget v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v5, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    div-int/2addr v2, v5

    const v5, 0x1ac94c

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_9d
    :sswitch_9f
    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    if-gtz v2, :cond_9e

    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    const-string v2, "\u06e2\u06e4\u06e5"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_9e
    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v5, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    div-int/2addr v2, v5

    const v5, 0xdc05

    add-int/2addr v2, v5

    move/from16 v37, v2

    goto/16 :goto_0

    :sswitch_a0
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lg7;->d:Z

    if-eqz v2, :cond_21

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lg7;->c:F

    const/4 v2, 0x0

    invoke-virtual {v11, v2}, Landroid/view/View;->setTranslationY(F)V

    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lg7;->d:Z

    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v5, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    or-int/lit16 v5, v5, 0xe83

    xor-int/2addr v2, v5

    if-ltz v2, :cond_a0

    const/16 v2, 0x4a

    sput v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    :cond_9f
    const-string v2, "\u06e4\u06e0\u06e6"

    invoke-static {v2}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v37, v2

    goto/16 :goto_0

    :cond_a0
    const-string v2, "\u06df\u06e5\u06e8"

    move-object v5, v2

    goto/16 :goto_5

    :sswitch_a1
    const-string v2, "\u06e4\u06e7\u06e4"

    goto/16 :goto_f

    :sswitch_a2
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    const/high16 v5, 0x41d80000    # 27.0f

    sub-float/2addr v2, v5

    move-object/from16 v0, p0

    iget v5, v0, Lg7;->c:F

    sub-float/2addr v2, v5

    const/high16 v5, 0x41d80000    # 27.0f

    add-float/2addr v2, v5

    if-nez v30, :cond_3b

    sget v5, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    if-gtz v5, :cond_a1

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    const-string v5, "\u06e0\u06e8\u06e2"

    invoke-static {v5}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v37, v5

    move/from16 v22, v2

    goto/16 :goto_0

    :cond_a1
    const-string v5, "\u06e3\u06e7\u06e4"

    move-object v9, v5

    move/from16 v22, v2

    goto/16 :goto_20

    :cond_a2
    move/from16 v2, v29

    move/from16 v5, v30

    move v12, v13

    goto/16 :goto_1

    :cond_a3
    move v12, v13

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        0xdbe2 -> :sswitch_0
        0xdbe4 -> :sswitch_26
        0xdc05 -> :sswitch_8a
        0xdc07 -> :sswitch_2
        0xdc20 -> :sswitch_0
        0xdc25 -> :sswitch_1f
        0xdc3d -> :sswitch_17
        0xdc44 -> :sswitch_8d
        0xdc62 -> :sswitch_34
        0xdc7c -> :sswitch_18
        0xdcb9 -> :sswitch_92
        0xdcbb -> :sswitch_86
        0xdce1 -> :sswitch_84
        0xdcfe -> :sswitch_94
        0x1aa703 -> :sswitch_6b
        0x1aa704 -> :sswitch_6b
        0x1aa705 -> :sswitch_96
        0x1aa708 -> :sswitch_33
        0x1aa71e -> :sswitch_6
        0x1aa722 -> :sswitch_3e
        0x1aa725 -> :sswitch_47
        0x1aa73d -> :sswitch_42
        0x1aa73e -> :sswitch_32
        0x1aa742 -> :sswitch_21
        0x1aa75f -> :sswitch_9e
        0x1aa760 -> :sswitch_62
        0x1aa77b -> :sswitch_1
        0x1aa782 -> :sswitch_3d
        0x1aa7a0 -> :sswitch_27
        0x1aa7bf -> :sswitch_63
        0x1aa7c2 -> :sswitch_60
        0x1aa7d9 -> :sswitch_6f
        0x1aa7f7 -> :sswitch_14
        0x1aa7fc -> :sswitch_69
        0x1aa817 -> :sswitch_a
        0x1aa818 -> :sswitch_6b
        0x1aa81a -> :sswitch_7c
        0x1aa81f -> :sswitch_13
        0x1aaac0 -> :sswitch_59
        0x1aaac2 -> :sswitch_8e
        0x1aaac7 -> :sswitch_10
        0x1aaae6 -> :sswitch_73
        0x1aaae8 -> :sswitch_87
        0x1aab02 -> :sswitch_7d
        0x1aab07 -> :sswitch_2f
        0x1aab1e -> :sswitch_29
        0x1aab23 -> :sswitch_64
        0x1aab24 -> :sswitch_44
        0x1aab26 -> :sswitch_2e
        0x1aab5c -> :sswitch_54
        0x1aab60 -> :sswitch_68
        0x1aab61 -> :sswitch_93
        0x1aab99 -> :sswitch_1a
        0x1aab9d -> :sswitch_6b
        0x1aab9e -> :sswitch_25
        0x1aabc0 -> :sswitch_75
        0x1aabc1 -> :sswitch_40
        0x1aabd7 -> :sswitch_1c
        0x1aabd8 -> :sswitch_57
        0x1aabda -> :sswitch_31
        0x1aabdd -> :sswitch_7
        0x1aae89 -> :sswitch_49
        0x1aaea4 -> :sswitch_6c
        0x1aaec7 -> :sswitch_65
        0x1aaee1 -> :sswitch_f
        0x1aaee4 -> :sswitch_95
        0x1aaf02 -> :sswitch_99
        0x1aaf1c -> :sswitch_d
        0x1aaf1d -> :sswitch_9d
        0x1aaf1e -> :sswitch_96
        0x1aaf20 -> :sswitch_36
        0x1aaf22 -> :sswitch_28
        0x1aaf23 -> :sswitch_79
        0x1aaf3c -> :sswitch_1b
        0x1aaf42 -> :sswitch_85
        0x1aaf5c -> :sswitch_15
        0x1aaf61 -> :sswitch_1f
        0x1aaf7f -> :sswitch_82
        0x1aaf80 -> :sswitch_89
        0x1aaf9e -> :sswitch_3f
        0x1ab242 -> :sswitch_0
        0x1ab243 -> :sswitch_12
        0x1ab244 -> :sswitch_9f
        0x1ab263 -> :sswitch_52
        0x1ab265 -> :sswitch_39
        0x1ab269 -> :sswitch_45
        0x1ab282 -> :sswitch_0
        0x1ab283 -> :sswitch_0
        0x1ab2a2 -> :sswitch_e
        0x1ab2a4 -> :sswitch_46
        0x1ab2a6 -> :sswitch_67
        0x1ab2bf -> :sswitch_4
        0x1ab2de -> :sswitch_83
        0x1ab2e1 -> :sswitch_81
        0x1ab2fd -> :sswitch_c
        0x1ab304 -> :sswitch_3b
        0x1ab324 -> :sswitch_96
        0x1ab33b -> :sswitch_3a
        0x1ab33d -> :sswitch_35
        0x1ab343 -> :sswitch_3c
        0x1ab35a -> :sswitch_9b
        0x1ab605 -> :sswitch_2b
        0x1ab60a -> :sswitch_1f
        0x1ab644 -> :sswitch_7f
        0x1ab662 -> :sswitch_19
        0x1ab664 -> :sswitch_1f
        0x1ab69e -> :sswitch_4b
        0x1ab6e2 -> :sswitch_b
        0x1ab700 -> :sswitch_61
        0x1ab701 -> :sswitch_88
        0x1ab71a -> :sswitch_5e
        0x1ab71b -> :sswitch_1f
        0x1ab71d -> :sswitch_51
        0x1ab71f -> :sswitch_a1
        0x1ab721 -> :sswitch_96
        0x1ab9cb -> :sswitch_1e
        0x1ab9e5 -> :sswitch_4d
        0x1ab9e6 -> :sswitch_7b
        0x1ab9ea -> :sswitch_6e
        0x1aba04 -> :sswitch_41
        0x1aba23 -> :sswitch_7e
        0x1aba29 -> :sswitch_66
        0x1aba43 -> :sswitch_98
        0x1aba46 -> :sswitch_8b
        0x1aba64 -> :sswitch_3
        0x1aba86 -> :sswitch_5
        0x1abac0 -> :sswitch_24
        0x1abac1 -> :sswitch_6b
        0x1abac2 -> :sswitch_20
        0x1abac5 -> :sswitch_9c
        0x1abd8d -> :sswitch_38
        0x1abd8e -> :sswitch_9a
        0x1abda6 -> :sswitch_55
        0x1abdad -> :sswitch_9
        0x1abde9 -> :sswitch_6b
        0x1abe26 -> :sswitch_77
        0x1abe3f -> :sswitch_0
        0x1abe42 -> :sswitch_11
        0x1abe5f -> :sswitch_0
        0x1abe62 -> :sswitch_74
        0x1abe83 -> :sswitch_96
        0x1abe9c -> :sswitch_4a
        0x1ac14a -> :sswitch_48
        0x1ac14b -> :sswitch_6a
        0x1ac14e -> :sswitch_1f
        0x1ac14f -> :sswitch_80
        0x1ac189 -> :sswitch_2c
        0x1ac1a5 -> :sswitch_91
        0x1ac1a9 -> :sswitch_70
        0x1ac1ab -> :sswitch_1d
        0x1ac1ac -> :sswitch_96
        0x1ac1c8 -> :sswitch_7a
        0x1ac1cb -> :sswitch_37
        0x1ac1e6 -> :sswitch_76
        0x1ac1e7 -> :sswitch_5f
        0x1ac205 -> :sswitch_1f
        0x1ac241 -> :sswitch_0
        0x1ac242 -> :sswitch_23
        0x1ac243 -> :sswitch_4c
        0x1ac260 -> :sswitch_2a
        0x1ac508 -> :sswitch_0
        0x1ac50b -> :sswitch_5d
        0x1ac526 -> :sswitch_72
        0x1ac52f -> :sswitch_16
        0x1ac566 -> :sswitch_2d
        0x1ac567 -> :sswitch_90
        0x1ac568 -> :sswitch_78
        0x1ac569 -> :sswitch_71
        0x1ac587 -> :sswitch_5b
        0x1ac5a4 -> :sswitch_97
        0x1ac5a6 -> :sswitch_6d
        0x1ac5a8 -> :sswitch_56
        0x1ac5c1 -> :sswitch_8c
        0x1ac5c4 -> :sswitch_8f
        0x1ac61f -> :sswitch_8
        0x1ac623 -> :sswitch_5a
        0x1ac8c9 -> :sswitch_a0
        0x1ac8cb -> :sswitch_43
        0x1ac8eb -> :sswitch_4e
        0x1ac908 -> :sswitch_30
        0x1ac90b -> :sswitch_a2
        0x1ac90d -> :sswitch_5c
        0x1ac948 -> :sswitch_58
        0x1ac949 -> :sswitch_6b
        0x1ac94c -> :sswitch_50
        0x1ac9a1 -> :sswitch_22
        0x1ac9a5 -> :sswitch_53
        0x1ac9c1 -> :sswitch_4f
        0x1ac9e8 -> :sswitch_96
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
