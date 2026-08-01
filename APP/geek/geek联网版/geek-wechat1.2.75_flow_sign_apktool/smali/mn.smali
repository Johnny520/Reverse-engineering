.class public final synthetic Lmn;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final a:Landroid/view/Window;

.field public final b:Z

.field public final c:I


# direct methods
.method public synthetic constructor <init>(Landroid/view/Window;ZI)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e2\u06e7\u06df"

    invoke-static {v1}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput p3, p0, Lmn;->c:I

    sget v0, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    if-gtz v0, :cond_4

    const/16 v0, 0x4e

    sput v0, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    const-string v0, "\u06df\u06e6\u06e5"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(I)V

    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    rem-int/2addr v0, v2

    const v2, 0x1ac03e

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    sget v0, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    if-gtz v0, :cond_0

    const-string v0, "\u06e2\u06e1\u06e6"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    mul-int/2addr v0, v2

    const v2, 0x2306d2

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    iput-boolean p2, p0, Lmn;->b:Z

    sget v0, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    if-ltz v0, :cond_1

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    const-string v0, "\u06e5\u06e5\u06e5"

    invoke-static {v0}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v2, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    rem-int/2addr v0, v2

    const v2, 0x1aa707

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    move-result v0

    if-ltz v0, :cond_2

    const-string v0, "\u06e8\u06e2\u06e6"

    goto :goto_1

    :cond_2
    :sswitch_5
    sget v0, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    div-int/2addr v0, v2

    const v2, 0x1abe45

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_6
    iput-object p1, p0, Lmn;->a:Landroid/view/Window;

    sget v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v2, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    div-int/lit16 v2, v2, 0xa5d

    xor-int/2addr v0, v2

    if-gtz v0, :cond_3

    const-string v0, "\u06e8\u06e2\u06e6"

    invoke-static {v0}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e2\u06e7\u06e4"

    invoke-static {v0}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06df\u06e6\u06e5"

    goto :goto_1

    :sswitch_7
    const-string v0, "D1BcmawECglwQUgqbqjLcHx9Pav"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦ۠۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget v1, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v2, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    add-int/2addr v1, v2

    const v2, 0x1ac80c

    add-int/2addr v2, v1

    move v1, v0

    goto/16 :goto_0

    :sswitch_8
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa708 -> :sswitch_0
        0x1aa7de -> :sswitch_4
        0x1ab33a -> :sswitch_6
        0x1ab33f -> :sswitch_3
        0x1ab6de -> :sswitch_2
        0x1aba04 -> :sswitch_5
        0x1abe45 -> :sswitch_8
        0x1ac92c -> :sswitch_7
        0x1ac984 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 18

    const/4 v2, 0x0

    const/16 v17, 0x0

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/16 v16, 0x0

    const/4 v10, 0x0

    const-string v4, "\u06e2\u06e1\u06e3"

    invoke-static {v4}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v4

    move-object v14, v1

    move v15, v4

    :goto_0
    sparse-switch v15, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    move-result v1

    if-gtz v1, :cond_5

    const-string v1, "\u06e2\u06e1\u06e3"

    :goto_1
    invoke-static {v1}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    move/from16 v16, v8

    goto :goto_0

    :sswitch_1
    const-string v1, "xnY0gA==\n"

    const-string v2, "pxhd7V7C2S0=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v0, p1

    invoke-static {v1, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۥۥۢۧ()I

    move-result v1

    if-ltz v1, :cond_0

    const-string v1, "\u06e2\u06e7\u06e8"

    invoke-static {v1}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    goto :goto_0

    :cond_0
    sget v1, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    or-int/2addr v1, v4

    const v4, 0x1ac5b9

    add-int/2addr v1, v4

    move v15, v1

    goto :goto_0

    :sswitch_2
    if-eqz v5, :cond_10

    move-object/from16 v0, p0

    iget v4, v0, Lmn;->c:I

    sget v1, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v9, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    xor-int/lit16 v9, v9, 0x25db

    mul-int/2addr v1, v9

    if-gtz v1, :cond_1

    const-string v1, "\u06df\u06e2\u06e2"

    invoke-static {v1}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v1

    move v9, v4

    move v15, v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e6\u06e1\u06e6"

    :goto_2
    invoke-static {v1}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v1

    move v9, v4

    move v15, v1

    goto :goto_0

    :sswitch_3
    const-string v1, "\u06e3\u06e3\u06e3"

    move v4, v12

    :goto_3
    invoke-static {v1}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    move v13, v4

    goto :goto_0

    :sswitch_4
    sget v1, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    div-int/2addr v1, v4

    const v4, 0x1aa75d

    add-int/2addr v1, v4

    move v15, v1

    goto :goto_0

    :sswitch_5
    const-string v1, "EmuzQx/cuOAScasPXdr57R1tqw9L0PngE3DyQUrTta4IZ69KH9S2+hB3sQF507bvCA==\n"

    const-string v4, "fB7fLz+/2Y4=\n"

    invoke-static {v1, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v1, v2

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v4

    sget v1, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v15, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    or-int/lit16 v15, v15, 0xee3

    xor-int/2addr v1, v15

    if-ltz v1, :cond_2

    :cond_2
    const-string v1, "\u06e2\u06e1\u06e2"

    invoke-static {v1}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    move/from16 v17, v4

    goto/16 :goto_0

    :sswitch_6
    move-object/from16 v0, p0

    iget-boolean v5, v0, Lmn;->b:Z

    sget v1, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    xor-int/lit8 v6, v1, -0x67

    sget v1, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v4, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    mul-int/lit16 v4, v4, -0x21b9

    xor-int/2addr v1, v4

    if-gtz v1, :cond_3

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    const-string v4, "\u06e7\u06e4\u06e7"

    move-object v1, v3

    :goto_4
    invoke-static {v4}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v1

    move v15, v4

    goto/16 :goto_0

    :cond_3
    sget v1, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v4, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sub-int/2addr v1, v4

    const v4, 0x1aa716

    xor-int/2addr v1, v4

    move v15, v1

    goto/16 :goto_0

    :sswitch_7
    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    move-result v1

    if-gtz v1, :cond_4

    const/16 v1, 0x1f

    sput v1, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    const-string v1, "\u06e8\u06df\u06e2"

    :goto_5
    invoke-static {v1}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    goto/16 :goto_0

    :cond_4
    const-string v1, "\u06e2\u06e1\u06e3"

    goto :goto_5

    :cond_5
    const-string v1, "\u06e6\u06e0\u06e3"

    goto/16 :goto_1

    :sswitch_8
    const/4 v1, 0x1

    if-ge v7, v1, :cond_e

    const/4 v12, 0x1

    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    move-result v1

    if-gtz v1, :cond_6

    const-string v1, "\u06e3\u06e1\u06e8"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    goto/16 :goto_0

    :cond_6
    sget v1, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v4, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sub-int/2addr v1, v4

    const v4, 0x1aa8dd

    xor-int/2addr v1, v4

    move v15, v1

    goto/16 :goto_0

    :sswitch_9
    const/4 v11, 0x1

    sget v1, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v4, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    or-int/lit16 v4, v4, -0x150f

    div-int/2addr v1, v4

    if-gtz v1, :cond_8

    move v13, v7

    :cond_7
    const-string v1, "\u06df\u06e4\u06e8"

    invoke-static {v1}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    goto/16 :goto_0

    :cond_8
    const-string v1, "\u06df\u06e1\u06e3"

    invoke-static {v1}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    move v13, v7

    goto/16 :goto_0

    :sswitch_a
    move v1, v8

    :cond_9
    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v8, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    mul-int/2addr v4, v8

    const v8, -0x1bd07c

    xor-int/2addr v4, v8

    move v8, v1

    move v15, v4

    goto/16 :goto_0

    :sswitch_b
    sget v1, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v4, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    mul-int/lit16 v4, v4, 0x7bf

    rem-int/2addr v1, v4

    if-gtz v1, :cond_a

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    const-string v1, "\u06df\u06e6\u06e6"

    move v4, v9

    move v10, v11

    goto/16 :goto_2

    :cond_a
    sget v1, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v4, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sub-int/2addr v1, v4

    const v4, 0x1ab338

    add-int/2addr v1, v4

    move v15, v1

    move v10, v11

    goto/16 :goto_0

    :sswitch_c
    if-lez v9, :cond_10

    invoke-virtual {v14, v6}, Landroid/view/Window;->addFlags(I)V

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    move-result v1

    if-gtz v1, :cond_b

    const-string v1, "\u06e7\u06e7\u06e8"

    invoke-static {v1}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    goto/16 :goto_0

    :cond_b
    const-string v1, "\u06e7\u06e7\u06e8"

    :goto_6
    invoke-static {v1}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    goto/16 :goto_0

    :sswitch_d
    sget v1, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    if-gtz v1, :cond_c

    const/4 v1, 0x0

    sput v1, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    :cond_c
    const-string v1, "\u06df\u06e0\u06e8"

    invoke-static {v1}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    move/from16 v10, v16

    goto/16 :goto_0

    :sswitch_e
    invoke-static {v3, v10}, Lz7;->n(Landroid/view/WindowManager$LayoutParams;I)V

    invoke-virtual {v14, v3}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    sget v1, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    if-ltz v1, :cond_d

    const/16 v1, 0x2b

    sput v1, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    :goto_7
    const-string v1, "\u06e0\u06e6\u06e6"

    move v4, v13

    goto/16 :goto_3

    :cond_d
    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    mul-int/2addr v1, v4

    const v4, 0x1a377b

    add-int/2addr v1, v4

    move v15, v1

    goto/16 :goto_0

    :sswitch_f
    move-object/from16 v0, p0

    iget-object v1, v0, Lmn;->a:Landroid/view/Window;

    const v4, 0x3ecccccd    # 0.4f

    mul-float v4, v4, v17

    invoke-virtual {v1, v4}, Landroid/view/Window;->setDimAmount(F)V

    sget v4, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v14, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    xor-int/2addr v4, v14

    const v14, 0x1ac2d3

    xor-int/2addr v4, v14

    move-object v14, v1

    move v15, v4

    goto/16 :goto_0

    :cond_e
    :sswitch_10
    sget v1, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v4, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sub-int/2addr v1, v4

    const v4, 0x1ab59d

    add-int/2addr v1, v4

    move v15, v1

    goto/16 :goto_0

    :sswitch_11
    sget v1, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v4, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    rem-int/lit16 v4, v4, 0x1344

    add-int/2addr v1, v4

    if-ltz v1, :cond_f

    const-string v1, "\u06e2\u06e0\u06e3"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    goto/16 :goto_0

    :cond_f
    const-string v1, "\u06df\u06e0\u06e8"

    goto/16 :goto_5

    :cond_10
    :sswitch_12
    sget v1, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v4, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    or-int/2addr v1, v4

    const v4, 0x1aa981

    add-int/2addr v1, v4

    move v15, v1

    goto/16 :goto_0

    :sswitch_13
    invoke-virtual {v14}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    int-to-float v3, v9

    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v3, v4

    sget v4, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    xor-int/lit16 v4, v4, -0x1fb

    int-to-float v4, v4

    mul-float/2addr v3, v4

    float-to-int v7, v3

    const-string v3, "\u06e4\u06e1\u06e5"

    move-object v4, v3

    goto/16 :goto_4

    :sswitch_14
    invoke-virtual {v14, v6}, Landroid/view/Window;->clearFlags(I)V

    sget v1, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    if-gtz v1, :cond_7

    const/16 v1, 0x47

    sput v1, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    const-string v1, "\u06df\u06df\u06e7"

    goto/16 :goto_6

    :sswitch_15
    int-to-float v1, v13

    mul-float v1, v1, v17

    float-to-int v1, v1

    const/4 v4, 0x1

    if-ge v1, v4, :cond_9

    sget v4, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    if-gtz v4, :cond_11

    const-string v4, "\u06e6\u06e0\u06e3"

    invoke-static {v4}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v4

    move v8, v1

    move v15, v4

    goto/16 :goto_0

    :cond_11
    move v8, v1

    goto/16 :goto_7

    :sswitch_16
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa707 -> :sswitch_0
        0x1aa727 -> :sswitch_e
        0x1aa741 -> :sswitch_8
        0x1aa75f -> :sswitch_11
        0x1aa77f -> :sswitch_14
        0x1aa7a3 -> :sswitch_16
        0x1aa7df -> :sswitch_2
        0x1aa81f -> :sswitch_3
        0x1aaba0 -> :sswitch_b
        0x1ab283 -> :sswitch_f
        0x1ab284 -> :sswitch_1
        0x1ab2c0 -> :sswitch_16
        0x1ab343 -> :sswitch_4
        0x1ab64a -> :sswitch_7
        0x1ab683 -> :sswitch_15
        0x1ab6de -> :sswitch_10
        0x1aba08 -> :sswitch_9
        0x1abd8a -> :sswitch_12
        0x1ac14c -> :sswitch_6
        0x1ac169 -> :sswitch_d
        0x1ac18b -> :sswitch_c
        0x1ac5aa -> :sswitch_a
        0x1ac5ab -> :sswitch_5
        0x1ac608 -> :sswitch_13
        0x1ac9e8 -> :sswitch_11
    .end sparse-switch
.end method
