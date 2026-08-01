.class public final Lq80;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final a:Landroid/widget/TextView;

.field public final b:Lp00;

.field public final c:I


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Lp00;I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e3\u06e6\u06e3"

    invoke-static {v1}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v2, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    xor-int/lit16 v2, v2, -0x32b

    div-int/2addr v1, v2

    if-gtz v1, :cond_0

    const-string v1, "\u06e0\u06e3\u06e7"

    invoke-static {v1}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    sget v1, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v2, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    xor-int/2addr v1, v2

    const v2, 0xdea9

    add-int/2addr v1, v2

    goto :goto_0

    :cond_1
    :sswitch_2
    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    move-result v1

    if-ltz v1, :cond_2

    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    const-string v1, "\u06df\u06e6"

    :goto_1
    invoke-static {v1}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    sget v1, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    mul-int/2addr v1, v2

    const v2, 0x3fada

    sub-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    sget v1, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    mul-int/2addr v1, v2

    const v2, 0x1aff10

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    const-string v0, "ANwdOwB2x3BoartJHcqPE126bHC"

    invoke-static {v0}, Landroid/window/ۣۤ۠ۢ;->۟۟ۦۤۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget v1, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    if-ltz v1, :cond_4

    :cond_3
    const-string v1, "\u06e6\u06e8\u06e6"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_4
    const-string v1, "\u06e0\u06e3\u06e7"

    goto :goto_1

    :sswitch_5
    iput p3, p0, Lq80;->c:I

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    move-result v1

    if-ltz v1, :cond_5

    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    const-string v1, "\u06e1\u06df\u06e7"

    invoke-static {v1}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_5
    sget v1, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    rem-int/2addr v1, v2

    const v2, 0x1ab9bc

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_6
    iput-object p1, p0, Lq80;->a:Landroid/widget/TextView;

    sget v1, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    or-int/lit16 v2, v2, -0x13ad

    sub-int/2addr v1, v2

    if-ltz v1, :cond_7

    const/16 v1, 0x1b

    sput v1, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    const-string v1, "\u06e3\u06e6\u06e3"

    invoke-static {v1}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_7
    iput-object p2, p0, Lq80;->b:Lp00;

    sget v1, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    xor-int/lit16 v2, v2, 0x63e

    sub-int/2addr v1, v2

    if-gtz v1, :cond_6

    const/16 v1, 0x35

    sput v1, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    :cond_6
    const-string v1, "\u06df\u06e6\u06e2"

    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    move-result v1

    if-ltz v1, :cond_1

    sget v1, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    if-ltz v1, :cond_3

    :cond_7
    const-string v1, "\u06e1\u06e2\u06df"

    invoke-static {v1}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdcf7 -> :sswitch_0
        0x1aa7db -> :sswitch_5
        0x1aab44 -> :sswitch_1
        0x1aae89 -> :sswitch_3
        0x1aaede -> :sswitch_7
        0x1ab264 -> :sswitch_2
        0x1ab6e0 -> :sswitch_6
        0x1aba64 -> :sswitch_8
        0x1ac264 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 20

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v15, 0x0

    const/4 v8, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v6, 0x0

    const/16 v16, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v12, "\u06e2\u06e2\u06e5"

    invoke-static {v12}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v19

    move-object v12, v4

    move-object v13, v7

    :goto_0
    sparse-switch v19, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v7, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    add-int/2addr v4, v7

    const v7, 0x1ab3b2

    add-int/2addr v4, v7

    move/from16 v19, v4

    goto :goto_0

    :sswitch_1
    invoke-virtual {v10, v11}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v4

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget v12, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v15, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    add-int/lit16 v15, v15, -0x25ee

    xor-int/2addr v12, v15

    if-ltz v12, :cond_0

    const-string v12, "\u06e5\u06e0\u06e3"

    invoke-static {v12}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v19

    move-object v12, v4

    move-object v15, v7

    goto :goto_0

    :cond_0
    sget v12, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v15, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sub-int/2addr v12, v15

    const v15, -0x1ab270

    xor-int v19, v12, v15

    move-object v12, v4

    move-object v15, v7

    goto :goto_0

    :sswitch_2
    sget v4, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v7, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    add-int/lit16 v7, v7, -0x2541

    or-int/2addr v4, v7

    if-ltz v4, :cond_1

    const-string v4, "\u06e2\u06e3\u06e4"

    invoke-static {v4}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v18, v17

    move/from16 v19, v4

    goto :goto_0

    :cond_1
    sget v4, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v7, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sub-int/2addr v4, v7

    const v7, 0x1ab3cc

    add-int/2addr v4, v7

    move-object/from16 v18, v17

    move/from16 v19, v4

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    move-result v4

    if-ltz v4, :cond_2

    const-string v4, "\u06df\u06e0\u06e5"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto :goto_0

    :cond_2
    const-string v4, "\u06e6\u06e0"

    invoke-static {v4}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto :goto_0

    :cond_3
    :sswitch_4
    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    move-result v4

    if-gtz v4, :cond_4

    const-string v4, "\u06e2\u06e6\u06e0"

    :goto_1
    invoke-static {v4}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto :goto_0

    :cond_4
    sget v4, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v7, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sub-int/2addr v4, v7

    const v7, 0x1ac143

    xor-int/2addr v4, v7

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_5
    :sswitch_5
    sget v4, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v7, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    mul-int/2addr v4, v7

    const v7, 0x1be00c

    xor-int/2addr v4, v7

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_6
    invoke-static {v12, v15}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1b

    :goto_2
    const-string v4, "\u06e2\u06e8\u06e7"

    invoke-static {v4}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_6
    :sswitch_7
    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v7, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    mul-int/lit16 v7, v7, 0x93c

    or-int/2addr v4, v7

    if-ltz v4, :cond_7

    invoke-static {}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۦۢۧۧ()I

    const-string v4, "\u06e2\u06e2\u06df"

    invoke-static {v4}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_7
    sget v4, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v7, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    mul-int/2addr v4, v7

    const v7, 0x14823b

    add-int/2addr v4, v7

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_8
    sget v4, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v7, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    rem-int/2addr v4, v7

    const v7, 0x1aa997

    add-int/2addr v4, v7

    move-object/from16 v18, v8

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_9
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "top_title_color_"

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v7, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    if-gtz v7, :cond_8

    const-string v7, "\u06e4\u06e0\u06e2"

    invoke-static {v7}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v7

    move-object v9, v4

    move/from16 v19, v7

    goto/16 :goto_0

    :cond_8
    const-string v7, "\u06e1\u06df\u06e6"

    :goto_3
    invoke-static {v7}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v7

    move-object v9, v4

    move/from16 v19, v7

    goto/16 :goto_0

    :sswitch_a
    const-string v4, ""

    sget v7, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v17, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sub-int v7, v7, v17

    const v17, 0x1ab2c1

    add-int v7, v7, v17

    move-object/from16 v17, v4

    move/from16 v19, v7

    goto/16 :goto_0

    :cond_9
    :sswitch_b
    sget v4, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v7, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    add-int/lit16 v7, v7, 0x2253

    rem-int/2addr v4, v7

    if-gtz v4, :cond_a

    const/16 v4, 0x4f

    sput v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    const-string v4, "\u06e0\u06e8\u06e8"

    invoke-static {v4}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_a
    sget v4, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v7, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    mul-int/2addr v4, v7

    const v7, 0x1a3cff

    add-int/2addr v4, v7

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_c
    sget v4, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v7, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    add-int/2addr v4, v7

    const v7, 0x1ab67d

    add-int/2addr v4, v7

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_d
    sget v4, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v5, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    div-int/lit16 v5, v5, -0x1264

    mul-int/2addr v4, v5

    if-eqz v4, :cond_b

    const-string v4, "\u06e5\u06e2\u06e7"

    move v5, v1

    :goto_4
    invoke-static {v4}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_b
    move-object v4, v8

    move v5, v1

    :cond_c
    const-string v7, "\u06e8\u06e4\u06e8"

    invoke-static {v7}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v7

    move-object v8, v4

    move/from16 v19, v7

    goto/16 :goto_0

    :sswitch_e
    invoke-virtual {v10, v5}, Landroid/widget/TextView;->setTextColor(I)V

    sget v4, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v7, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    or-int/lit16 v7, v7, -0x21e0

    div-int/2addr v4, v7

    if-eqz v4, :cond_e

    :cond_d
    const-string v4, "\u06e3\u06e0\u06e4"

    invoke-static {v4}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_e
    sget v4, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v7, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    add-int/2addr v4, v7

    const v7, 0x1ac848

    add-int/2addr v4, v7

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_f
    sget v4, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v7, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    div-int/2addr v4, v7

    const v7, 0x1ab2c9

    add-int/2addr v4, v7

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_10
    invoke-static {v14}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v4

    const-string v6, "compile(...)"

    invoke-static {v6, v4}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    sget v6, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v7, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    xor-int/lit16 v7, v7, -0x2602

    add-int/2addr v6, v7

    if-ltz v6, :cond_f

    const/16 v6, 0x23

    sput v6, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    const-string v6, "\u06e3\u06e4\u06e0"

    invoke-static {v6}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v7

    move-object v6, v4

    move/from16 v19, v7

    goto/16 :goto_0

    :cond_f
    const-string v6, "\u06e7\u06e0\u06e7"

    move-object v7, v6

    :goto_5
    invoke-static {v7}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v7

    move-object v6, v4

    move/from16 v19, v7

    goto/16 :goto_0

    :sswitch_11
    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v7, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    or-int/lit16 v7, v7, 0x1097

    add-int/2addr v4, v7

    if-ltz v4, :cond_10

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    const-string v4, "\u06e1\u06e7\u06e6"

    invoke-static {v4}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_10
    sget v4, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v7, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sub-int/2addr v4, v7

    const v7, 0xdcbd

    add-int/2addr v4, v7

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_12
    const-string v4, "yoyuYexKEeA=\n"

    const-string v7, "lqTyBccWOMQ=\n"

    invoke-static {v4, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v7, "pattern"

    invoke-static {v7, v4}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v7, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    if-gtz v7, :cond_11

    const/16 v7, 0x24

    sput v7, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    const-string v7, "\u06e1\u06e5\u06e4"

    invoke-static {v7}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v7

    move-object v14, v4

    move/from16 v19, v7

    goto/16 :goto_0

    :cond_11
    sget v7, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v14, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    add-int/2addr v7, v14

    const v14, 0x1abe3b

    add-int/2addr v7, v14

    move-object v14, v4

    move/from16 v19, v7

    goto/16 :goto_0

    :cond_12
    :sswitch_13
    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v7, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    or-int/lit16 v7, v7, -0x180b

    mul-int/2addr v4, v7

    if-ltz v4, :cond_13

    const/16 v4, 0xc

    sput v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    const-string v7, "\u06e3\u06e7"

    move-object v4, v6

    goto :goto_5

    :cond_13
    sget v4, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v7, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    div-int/2addr v4, v7

    const v7, 0x1ac546

    xor-int/2addr v4, v7

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_14
    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    move-result v4

    if-gtz v4, :cond_14

    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    const-string v4, "\u06e0\u06e3\u06e1"

    :goto_6
    invoke-static {v4}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_14
    sget v4, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v7, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    or-int/2addr v4, v7

    const v7, 0x1aca8d

    add-int/2addr v4, v7

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_15
    :sswitch_15
    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    move-result v4

    if-ltz v4, :cond_16

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    const-string v4, "\u06e1\u06e4\u06e5"

    :goto_7
    invoke-static {v4}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_16
    sget v4, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v7, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    or-int/2addr v4, v7

    const v7, 0x1ab670

    add-int/2addr v4, v7

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_16
    invoke-virtual {v10, v11, v15}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_5

    const-string v4, "\u06e0\u06e4\u06df"

    goto/16 :goto_4

    :sswitch_17
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_1a

    sget v4, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v7, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    xor-int/lit16 v7, v7, -0x222a

    sub-int/2addr v4, v7

    if-gtz v4, :cond_17

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    const-string v4, "\u06e8\u06e7\u06e1"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_17
    sget v4, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v7, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sub-int/2addr v4, v7

    const v7, 0x1aad15

    add-int/2addr v4, v7

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_18
    if-eqz v1, :cond_20

    sget v4, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    if-gtz v4, :cond_d

    invoke-static {}, Landroidx/activity/result/۟ۡۤۦۡ;->۟۟۟ۥۤ()I

    const-string v4, "\u06e4\u06df\u06e4"

    invoke-static {v4}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_19
    invoke-static {}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۥۧۤ۠()I

    move-result v4

    if-ltz v4, :cond_18

    const/16 v4, 0x15

    sput v4, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    const-string v4, "\u06e3\u06df\u06e3"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_18
    const-string v4, "\u06e8\u06e6\u06e1"

    goto/16 :goto_6

    :sswitch_1a
    move-object/from16 v0, p0

    iget-object v4, v0, Lq80;->a:Landroid/widget/TextView;

    const v7, -0x7e120045

    sget v10, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    xor-int v11, v7, v10

    sget v7, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    if-gtz v7, :cond_19

    invoke-static {}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->۟ۦۥۨ۠()I

    const-string v7, "\u06e8\u06e1\u06e1"

    :goto_8
    invoke-static {v7}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v7

    move-object v10, v4

    move/from16 v19, v7

    goto/16 :goto_0

    :cond_19
    const-string v7, "\u06e8\u06e7\u06e1"

    invoke-static {v7}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v7

    move-object v10, v4

    move/from16 v19, v7

    goto/16 :goto_0

    :cond_1a
    :sswitch_1b
    sget v4, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v7, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    div-int/2addr v4, v7

    const v7, 0x1aa79e

    xor-int/2addr v4, v7

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_1b
    :sswitch_1c
    sget v4, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v7, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    or-int/lit16 v7, v7, -0x41d

    mul-int/2addr v4, v7

    if-gtz v4, :cond_1c

    const-string v4, "\u06e4\u06e2\u06e5"

    invoke-static {v4}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_1c
    sget v4, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v7, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    xor-int/2addr v4, v7

    const v7, 0x1aaac3

    add-int/2addr v4, v7

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_1d
    if-eqz p1, :cond_12

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    move-result v7

    if-gez v7, :cond_c

    const-string v7, "\u06e6\u06e2\u06e6"

    invoke-static {v7}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v7

    move-object v8, v4

    move/from16 v19, v7

    goto/16 :goto_0

    :sswitch_1e
    move-object/from16 v0, p0

    iget-object v4, v0, Lq80;->b:Lp00;

    move-object/from16 v0, v18

    iput-object v0, v4, Lp00;->b:Ljava/lang/Object;

    const-string v4, "VtBTeh8ifmRO009XNCNvZVLTdUoF\n"

    const-string v7, "PbUqJWtQHwo=\n"

    sget-object v19, Lkn;->a:Lkn;

    move-object/from16 v0, v19

    invoke-static {v4, v7, v0}, Lg40;->q(Ljava/lang/String;Ljava/lang/String;Lkn;)Z

    move-result v4

    if-nez v4, :cond_6

    const-string v7, "\u06e2\u06e0\u06e6"

    move-object v4, v6

    goto/16 :goto_5

    :sswitch_1f
    move-object/from16 v0, v18

    invoke-virtual {v6, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    const-string v7, ""

    invoke-virtual {v4, v7}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v7, "replaceAll(...)"

    invoke-static {v7, v4}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۥۧۤ۠()I

    move-result v7

    if-ltz v7, :cond_1d

    const/4 v7, 0x2

    sput v7, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    const-string v7, "\u06e6\u06e8\u06e7"

    invoke-static {v7}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v16, v4

    move/from16 v19, v7

    goto/16 :goto_0

    :cond_1d
    sget v7, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v16, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sub-int v7, v7, v16

    const v16, 0x1ac437

    add-int v7, v7, v16

    move-object/from16 v16, v4

    move/from16 v19, v7

    goto/16 :goto_0

    :sswitch_20
    sget v4, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v7, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    xor-int/lit16 v7, v7, -0x26de

    rem-int/2addr v4, v7

    if-ltz v4, :cond_1e

    const/16 v4, 0x5d

    sput v4, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    const-string v4, "\u06e3\u06e2"

    :goto_9
    invoke-static {v4}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_1e
    const-string v4, "\u06e2\u06e2\u06e5"

    goto :goto_9

    :sswitch_21
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {v1, v4}, Lkn;->b(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_3

    sget v4, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v7, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    add-int/lit16 v7, v7, -0x1f5

    mul-int/2addr v4, v7

    if-ltz v4, :cond_1f

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    :cond_1f
    const-string v7, "\u06e8\u06e5"

    move-object v4, v9

    goto/16 :goto_3

    :cond_20
    :sswitch_22
    sget v4, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v7, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sub-int/2addr v4, v7

    const v7, -0x1abccd

    xor-int/2addr v4, v7

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_23
    move-object/from16 v0, p0

    iget v5, v0, Lq80;->c:I

    sget v4, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v7, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    add-int/lit16 v7, v7, -0x22b0

    or-int/2addr v4, v7

    if-ltz v4, :cond_21

    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    const-string v4, "\u06e3\u06e2\u06e7"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_21
    sget v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v7, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    mul-int/2addr v4, v7

    const v7, 0x15e5a6

    add-int/2addr v4, v7

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_24
    invoke-static/range {v16 .. v16}, Li50;->Q(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "top_title_text_"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, "\u06e4\u06e2\u06e4"

    goto/16 :goto_1

    :sswitch_25
    if-nez v8, :cond_15

    sget v4, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v7, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    mul-int/lit16 v7, v7, -0x1807

    xor-int/2addr v4, v7

    if-ltz v4, :cond_22

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    const-string v4, "\u06e8\u06e3\u06e4"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_22
    const-string v7, "\u06e7\u06e1\u06e0"

    move-object v4, v9

    goto/16 :goto_3

    :sswitch_26
    invoke-virtual {v10, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget v4, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v7, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    add-int/2addr v4, v7

    const v7, 0x1aab97

    add-int/2addr v4, v7

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_27
    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    if-gtz v4, :cond_23

    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    goto/16 :goto_2

    :cond_23
    sget v4, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v7, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    rem-int/2addr v4, v7

    const v7, 0x1aaf7f

    add-int/2addr v4, v7

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_28
    if-eqz v1, :cond_9

    sget v4, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v7, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    add-int/lit16 v7, v7, -0x910

    mul-int/2addr v4, v7

    if-gtz v4, :cond_24

    const-string v4, "\u06e2\u06e2\u06e5"

    invoke-static {v4}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_24
    sget v4, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v7, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    div-int/2addr v4, v7

    const v7, 0x1ab280

    add-int/2addr v4, v7

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_29
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v10, v11, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    sget v4, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    if-ltz v4, :cond_25

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    const-string v4, "\u06e1\u06e7\u06e2"

    invoke-static {v4}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_25
    const-string v4, "\u06e5\u06e1\u06e5"

    goto/16 :goto_7

    :sswitch_2a
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v7, ""

    invoke-static {v4, v7}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget v7, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v13, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    or-int/2addr v7, v13

    const v13, 0x1aa53e    # 2.447E-39f

    add-int/2addr v7, v13

    move-object v13, v4

    move/from16 v19, v7

    goto/16 :goto_0

    :sswitch_2b
    sget v4, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    if-ltz v4, :cond_26

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣۣ۟ۡ()I

    const-string v4, "\u06e7\u06e0\u06e7"

    invoke-static {v4}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_26
    const-string v7, "\u06e5\u06e1\u06e1"

    move-object v4, v10

    goto/16 :goto_8

    :sswitch_2c
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc02 -> :sswitch_0
        0xdcba -> :sswitch_b
        0xdcfd -> :sswitch_c
        0x1aa706 -> :sswitch_b
        0x1aa724 -> :sswitch_1d
        0x1aa79e -> :sswitch_1e
        0x1aa7fc -> :sswitch_9
        0x1aab00 -> :sswitch_25
        0x1aab5b -> :sswitch_26
        0x1aae88 -> :sswitch_21
        0x1aaf40 -> :sswitch_3
        0x1aaf7c -> :sswitch_4
        0x1aaf80 -> :sswitch_b
        0x1ab268 -> :sswitch_27
        0x1ab288 -> :sswitch_16
        0x1ab2a5 -> :sswitch_1a
        0x1ab2c3 -> :sswitch_18
        0x1ab33e -> :sswitch_6
        0x1ab361 -> :sswitch_2b
        0x1ab607 -> :sswitch_22
        0x1ab627 -> :sswitch_d
        0x1ab668 -> :sswitch_17
        0x1ab69f -> :sswitch_29
        0x1ab6a1 -> :sswitch_f
        0x1ab722 -> :sswitch_14
        0x1ab9c9 -> :sswitch_2
        0x1ab9e6 -> :sswitch_7
        0x1aba26 -> :sswitch_2a
        0x1aba7e -> :sswitch_1b
        0x1abac5 -> :sswitch_20
        0x1abda8 -> :sswitch_13
        0x1abdc5 -> :sswitch_b
        0x1abdc9 -> :sswitch_2c
        0x1abdca -> :sswitch_12
        0x1abdea -> :sswitch_23
        0x1abe02 -> :sswitch_5
        0x1abe08 -> :sswitch_10
        0x1ac1aa -> :sswitch_8
        0x1ac1cb -> :sswitch_1c
        0x1ac243 -> :sswitch_f
        0x1ac265 -> :sswitch_28
        0x1ac52e -> :sswitch_1f
        0x1ac546 -> :sswitch_a
        0x1ac54a -> :sswitch_19
        0x1ac5c6 -> :sswitch_11
        0x1ac8ef -> :sswitch_24
        0x1ac908 -> :sswitch_15
        0x1ac949 -> :sswitch_0
        0x1ac96c -> :sswitch_e
        0x1ac9a3 -> :sswitch_14
        0x1ac9c2 -> :sswitch_1
    .end sparse-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    const-string v0, "\u06e5\u06e0\u06e1"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v1, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    xor-int/lit16 v1, v1, -0x1f81

    xor-int/2addr v0, v1

    if-gtz v0, :cond_0

    const/16 v0, 0x31

    sput v0, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    const-string v0, "\u06e4\u06df\u06e5"

    :goto_1
    invoke-static {v0}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e5\u06e0\u06e1"

    goto :goto_1

    :sswitch_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdcdf -> :sswitch_0
        0x1abda6 -> :sswitch_1
    .end sparse-switch
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    const-string v0, "\u06e8\u06e1\u06e5"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v1, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    xor-int/lit16 v1, v1, -0x10a0

    xor-int/2addr v0, v1

    if-ltz v0, :cond_0

    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    const-string v0, "\u06e8\u06e3\u06e0"

    :goto_1
    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e8\u06e1\u06e5"

    goto :goto_1

    :sswitch_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa75f -> :sswitch_0
        0x1ac90c -> :sswitch_1
    .end sparse-switch
.end method
