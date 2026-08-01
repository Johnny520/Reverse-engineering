.class public final synthetic Lda;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final a:Ln00;

.field public final b:I

.field public final c:Ljava/util/ArrayList;

.field public final d:Landroid/widget/FrameLayout;

.field public final e:Landroid/graphics/drawable/GradientDrawable;

.field public final f:Ln00;

.field public final g:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Ln00;ILjava/util/ArrayList;Landroid/widget/FrameLayout;Landroid/graphics/drawable/GradientDrawable;Ln00;Landroid/widget/EditText;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e5\u06e7\u06e8"

    invoke-static {v1}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p5, p0, Lda;->e:Landroid/graphics/drawable/GradientDrawable;

    sget v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    add-int/2addr v0, v2

    const v2, -0x1ac715

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_1
    iput-object p3, p0, Lda;->c:Ljava/util/ArrayList;

    sget v0, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    add-int/lit16 v2, v2, 0xba9

    div-int/2addr v0, v2

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    const-string v0, "\u06e0\u06e0"

    invoke-static {v0}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sub-int/2addr v0, v2

    const v2, 0x1acd8f

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    move-result v0

    if-ltz v0, :cond_2

    const/16 v0, 0x48

    sput v0, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    :cond_1
    const-string v0, "\u06e2\u06e0\u06e5"

    invoke-static {v0}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    sget v0, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    or-int/2addr v0, v2

    const v2, 0x1aba37

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->۟ۢ۟ۥۣ()I

    move-result v0

    if-ltz v0, :cond_5

    sget v0, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    mul-int/lit16 v2, v2, -0x22a2

    mul-int/2addr v0, v2

    if-ltz v0, :cond_3

    const-string v0, "\u06e0\u06e8\u06e0"

    invoke-static {v0}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e4\u06e6"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_4
    const-string v0, "mGfD6FYelQYaJ"

    invoke-static {v0}, Landroidx/core/widget/۟ۡۦۢۥ;->ۢ۟ۥ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget v1, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    or-int/lit16 v2, v2, -0xec5

    div-int/2addr v1, v2

    if-gtz v1, :cond_4

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    const-string v1, "\u06e8\u06e8\u06e5"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :cond_4
    sget v1, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v2, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    rem-int/2addr v1, v2

    const v2, 0x1aa903

    add-int/2addr v2, v1

    move-object v1, v0

    goto/16 :goto_0

    :cond_5
    :sswitch_5
    sget v0, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    if-gtz v0, :cond_6

    const-string v0, "\u06e0\u06e6\u06e4"

    :goto_1
    invoke-static {v0}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v2, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    rem-int/2addr v0, v2

    const v2, -0x1ab933

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_6
    iput-object p6, p0, Lda;->f:Ln00;

    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    move-result v0

    if-gtz v0, :cond_1

    const/4 v0, 0x4

    sput v0, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    const-string v0, "\u06e4\u06e2\u06df"

    invoke-static {v0}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_7
    iput-object p4, p0, Lda;->d:Landroid/widget/FrameLayout;

    const-string v0, "\u06e0\u06e0"

    goto :goto_1

    :sswitch_8
    iput-object p1, p0, Lda;->a:Ln00;

    sget v0, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sub-int/2addr v0, v2

    const v2, 0x1ac8ec

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_9
    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v2, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    add-int/2addr v0, v2

    const v2, 0x1abe18

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_a
    iput p2, p0, Lda;->b:I

    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    rem-int/2addr v0, v2

    const v2, 0x1abafe

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_b
    iput-object p7, p0, Lda;->g:Landroid/widget/EditText;

    const-string v0, "\u06e8\u06e1\u06df"

    goto :goto_1

    :sswitch_c
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc00 -> :sswitch_0
        0xdc82 -> :sswitch_4
        0x1aa73e -> :sswitch_5
        0x1aa763 -> :sswitch_2
        0x1aabd8 -> :sswitch_9
        0x1ab267 -> :sswitch_b
        0x1aba21 -> :sswitch_c
        0x1aba63 -> :sswitch_1
        0x1abe86 -> :sswitch_8
        0x1ac5a8 -> :sswitch_6
        0x1ac906 -> :sswitch_3
        0x1ac909 -> :sswitch_a
        0x1ac9e5 -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 19

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/4 v1, 0x0

    const/4 v8, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v10, "\u06e5\u06e0\u06e0"

    invoke-static {v10}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v10

    move/from16 v16, v1

    move/from16 v17, v8

    move/from16 v18, v10

    :goto_0
    sparse-switch v18, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {v7, v5}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    sget v1, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v8, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    or-int/lit16 v8, v8, -0x1020

    or-int/2addr v1, v8

    if-ltz v1, :cond_a

    :cond_0
    const-string v8, "\u06e0\u06df"

    move-object v1, v7

    move v10, v11

    :goto_1
    invoke-static {v8}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v8

    move-object v7, v1

    move v11, v10

    move/from16 v18, v8

    goto :goto_0

    :sswitch_1
    const v1, -0x7e120100

    xor-int/2addr v1, v9

    invoke-virtual {v7, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    sget v1, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v5, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    xor-int/lit16 v5, v5, 0xeaa

    or-int/2addr v1, v5

    if-ltz v1, :cond_1

    const-string v1, "\u06e7\u06e0"

    invoke-static {v1}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v1

    move-object v5, v6

    move/from16 v18, v1

    goto :goto_0

    :cond_1
    const-string v5, "\u06e4\u06e5\u06e2"

    move-object v1, v15

    move-object v8, v5

    move-object v10, v6

    :goto_2
    invoke-static {v8}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v8

    move-object v15, v1

    move-object v5, v10

    move/from16 v18, v8

    goto :goto_0

    :sswitch_2
    move-object v1, v4

    :goto_3
    const-string v5, "\u06e0\u06e2\u06e7"

    move-object v8, v5

    move-object v10, v4

    move-object v14, v1

    :goto_4
    invoke-static {v8}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v1

    move-object v4, v10

    move-object v5, v14

    move/from16 v18, v1

    goto :goto_0

    :sswitch_3
    invoke-virtual {v7, v5}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    sget v1, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v8, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    mul-int/2addr v1, v8

    const v8, -0x1a3948

    xor-int/2addr v1, v8

    move/from16 v18, v1

    goto :goto_0

    :sswitch_4
    sget v1, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v8, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    or-int/lit16 v8, v8, -0x658

    or-int/2addr v1, v8

    if-ltz v1, :cond_2

    const/16 v1, 0x2e

    sput v1, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    const-string v1, "\u06e1\u06df\u06e6"

    invoke-static {v1}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v18, v1

    move/from16 v12, v17

    goto :goto_0

    :cond_2
    sget v1, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v8, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    div-int/2addr v1, v8

    const v8, 0x1aab3e

    add-int/2addr v1, v8

    move/from16 v18, v1

    move/from16 v12, v17

    goto/16 :goto_0

    :cond_3
    :sswitch_5
    sget v1, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    if-ltz v1, :cond_4

    const/4 v1, 0x7

    sput v1, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    const-string v1, "\u06e6\u06e8\u06e6"

    invoke-static {v1}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v18, v1

    goto/16 :goto_0

    :cond_4
    const-string v1, "\u06e0\u06e2\u06e7"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v18, v1

    goto/16 :goto_0

    :sswitch_6
    sget v9, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    move-object/from16 v0, p0

    iget-object v1, v0, Lda;->g:Landroid/widget/EditText;

    const-string v7, "\u06e2\u06e0\u06e7"

    move-object v8, v7

    move v10, v11

    goto/16 :goto_1

    :sswitch_7
    invoke-virtual {v15, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    sget v1, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    xor-int/lit16 v1, v1, 0x2bf

    add-int v10, v12, v1

    invoke-static {}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦۥۣۥ()I

    move-result v1

    if-ltz v1, :cond_5

    const-string v1, "\u06e5\u06e0\u06e0"

    invoke-static {v1}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v1

    move v11, v10

    move/from16 v18, v1

    goto/16 :goto_0

    :cond_5
    const-string v8, "\u06e4\u06e3\u06e1"

    move-object v1, v7

    goto/16 :goto_1

    :sswitch_8
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v8, 0x0

    sget v10, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v14, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    xor-int/2addr v10, v14

    const v14, 0x1ac825

    add-int/2addr v10, v14

    move/from16 v16, v1

    move/from16 v17, v8

    move/from16 v18, v10

    goto/16 :goto_0

    :sswitch_9
    if-eqz v5, :cond_e

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    move-result v1

    if-ltz v1, :cond_0

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    const-string v1, "\u06e0\u06e3\u06e0"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v18, v1

    goto/16 :goto_0

    :sswitch_a
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    move-object/from16 v0, p1

    invoke-static {v0, v1}, Lkn;->i(Landroid/view/View;I)V

    sget v1, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v8, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    xor-int/lit16 v8, v8, 0x2bf

    div-int/2addr v1, v8

    if-eqz v1, :cond_6

    const/16 v1, 0x40

    sput v1, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    move-object v1, v5

    goto/16 :goto_3

    :cond_6
    const-string v8, "\u06e6\u06e6"

    move-object v1, v15

    move-object v10, v5

    goto/16 :goto_2

    :sswitch_b
    move-object v1, v2

    check-cast v1, Landroid/view/View;

    const/4 v8, 0x0

    invoke-virtual {v1, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    move-result v1

    if-gtz v1, :cond_7

    const/16 v1, 0x17

    sput v1, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    const-string v1, "\u06e4\u06e5\u06e2"

    invoke-static {v1}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v18, v1

    move v12, v11

    goto/16 :goto_0

    :cond_7
    const-string v8, "\u06e0\u06e3"

    move-object v1, v7

    move v10, v11

    move v12, v11

    goto/16 :goto_1

    :sswitch_c
    move-object v1, v6

    :cond_8
    sget v6, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    if-ltz v6, :cond_9

    const/16 v6, 0x48

    sput v6, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    const-string v6, "\u06e6\u06e1\u06e3"

    :goto_5
    invoke-static {v6}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v8

    move-object v6, v1

    move/from16 v18, v8

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u06e1\u06df\u06e6"

    goto :goto_5

    :cond_a
    sget v1, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v8, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    mul-int/2addr v1, v8

    const v8, 0x1f7381

    add-int/2addr v1, v8

    move/from16 v18, v1

    goto/16 :goto_0

    :sswitch_d
    const-string v1, "\u06e5\u06e0\u06e0"

    invoke-static {v1}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v18, v1

    goto/16 :goto_0

    :sswitch_e
    sget-object v1, Lkn;->a:Lkn;

    invoke-static/range {p1 .. p1}, Lmp;->d(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/activity/result/۟ۡۤۦۡ;->۟۟۟ۥۤ()I

    move-result v8

    if-gtz v8, :cond_b

    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    const-string v8, "\u06e4\u06e3\u06e1"

    invoke-static {v8}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v8

    move-object v13, v1

    move/from16 v18, v8

    goto/16 :goto_0

    :cond_b
    const-string v8, "\u06e2\u06e0\u06e3"

    :goto_6
    invoke-static {v8}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v8

    move-object v13, v1

    move/from16 v18, v8

    goto/16 :goto_0

    :sswitch_f
    const/4 v1, 0x0

    move/from16 v0, v16

    if-ge v12, v0, :cond_8

    const-string v6, "\u06e2\u06e5\u06e5"

    goto :goto_5

    :sswitch_10
    move-object/from16 v0, p0

    iget-object v1, v0, Lda;->d:Landroid/widget/FrameLayout;

    move-object/from16 v0, p0

    iget-object v8, v0, Lda;->e:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v1, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    move-object/from16 v0, p0

    iget-object v1, v0, Lda;->f:Ln00;

    const/4 v8, -0x1

    iput v8, v1, Ln00;->a:I

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    move-result v1

    if-ltz v1, :cond_c

    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    const-string v1, "\u06e1\u06e7\u06e7"

    invoke-static {v1}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v18, v1

    goto/16 :goto_0

    :cond_c
    const-string v1, "\u06e7\u06e7\u06e2"

    invoke-static {v1}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v18, v1

    goto/16 :goto_0

    :sswitch_11
    const-string v1, "\u06e4\u06e8\u06e5"

    invoke-static {v1}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v18, v1

    goto/16 :goto_0

    :sswitch_12
    move-object/from16 v0, p0

    iget-object v1, v0, Lda;->a:Ln00;

    move-object/from16 v0, p0

    iget v8, v0, Lda;->b:I

    iput v8, v1, Ln00;->a:I

    move-object/from16 v0, p0

    iget-object v1, v0, Lda;->c:Ljava/util/ArrayList;

    sget v8, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v10, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    add-int/lit16 v10, v10, 0x96b

    add-int/2addr v8, v10

    if-gtz v8, :cond_d

    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    const-string v8, "\u06e8\u06e7\u06e8"

    invoke-static {v8}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v8

    move-object v15, v1

    move/from16 v18, v8

    goto/16 :goto_0

    :cond_d
    const-string v8, "\u06e1\u06e7\u06e7"

    move-object v10, v5

    goto/16 :goto_2

    :cond_e
    :sswitch_13
    sget v1, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    if-gtz v1, :cond_f

    const/16 v1, 0x31

    sput v1, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    const-string v8, "\u06e4\u06e6\u06e6"

    move-object v1, v13

    goto :goto_6

    :cond_f
    const-string v1, "\u06e8\u06e7\u06e8"

    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v18, v1

    goto/16 :goto_0

    :sswitch_14
    instance-of v1, v3, Landroid/text/TextWatcher;

    if-eqz v1, :cond_3

    move-object v1, v3

    check-cast v1, Landroid/text/TextWatcher;

    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v8, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    add-int/lit16 v8, v8, 0x1056

    or-int/2addr v4, v8

    if-ltz v4, :cond_10

    const-string v4, "\u06e3\u06e5\u06e1"

    invoke-static {v4}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v8

    move-object v4, v1

    move/from16 v18, v8

    goto/16 :goto_0

    :cond_10
    const-string v4, "\u06e7\u06e0"

    move-object v8, v4

    move-object v10, v1

    move-object v14, v5

    goto/16 :goto_4

    :cond_11
    :sswitch_15
    sget v1, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    if-ltz v1, :cond_12

    const/16 v1, 0x40

    sput v1, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    const-string v1, "\u06df\u06e0\u06e2"

    invoke-static {v1}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v18, v1

    goto/16 :goto_0

    :cond_12
    sget v1, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v8, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    div-int/2addr v1, v8

    const v8, -0x1ab71c

    xor-int/2addr v1, v8

    move/from16 v18, v1

    goto/16 :goto_0

    :sswitch_16
    sget v1, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v8, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    mul-int/lit16 v8, v8, 0x26c3

    div-int/2addr v1, v8

    if-eqz v1, :cond_13

    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    const-string v8, "\u06e5\u06e7\u06e3"

    move-object v1, v15

    move-object v10, v5

    goto/16 :goto_2

    :cond_13
    const-string v8, "\u06e0\u06e3\u06e0"

    move-object v1, v15

    move-object v10, v5

    goto/16 :goto_2

    :sswitch_17
    const-string v1, ""

    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v5, :cond_11

    sget v1, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    if-ltz v1, :cond_14

    const-string v1, "\u06e6\u06e6"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v18, v1

    goto/16 :goto_0

    :cond_14
    sget v1, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v8, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    xor-int/2addr v1, v8

    const v8, 0x1abd54

    xor-int/2addr v1, v8

    move/from16 v18, v1

    goto/16 :goto_0

    :sswitch_18
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbff -> :sswitch_0
        0xdc03 -> :sswitch_11
        0xdc3f -> :sswitch_c
        0xdcc0 -> :sswitch_12
        0xdcd9 -> :sswitch_2
        0x1aab25 -> :sswitch_9
        0x1aab3d -> :sswitch_f
        0x1aab5d -> :sswitch_d
        0x1aae88 -> :sswitch_10
        0x1aaf81 -> :sswitch_8
        0x1ab265 -> :sswitch_a
        0x1ab269 -> :sswitch_1
        0x1ab302 -> :sswitch_7
        0x1ab6bf -> :sswitch_16
        0x1ab71b -> :sswitch_18
        0x1aba42 -> :sswitch_b
        0x1aba81 -> :sswitch_14
        0x1abae1 -> :sswitch_16
        0x1abda5 -> :sswitch_e
        0x1abe01 -> :sswitch_3
        0x1ac226 -> :sswitch_15
        0x1ac5a7 -> :sswitch_5
        0x1ac602 -> :sswitch_6
        0x1ac8cf -> :sswitch_13
        0x1ac9c6 -> :sswitch_4
        0x1ac9c9 -> :sswitch_17
    .end sparse-switch
.end method
