.class public final synthetic Lp80;
.super Ljava/lang/Object;

# interfaces
.implements Ljm;


# instance fields
.field public final a:I

.field public final b:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;I)V
    .locals 4

    iput p2, p0, Lp80;->a:I

    iput-object p1, p0, Lp80;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    const-string v2, "\u06df\u06e7"

    invoke-static {v2}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v2

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    move-result v2

    if-ltz v2, :cond_0

    const-string v2, "\u06e4\u06e0"

    :goto_1
    invoke-static {v2}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_1
    sget v2, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v3, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    div-int/2addr v2, v3

    const v3, 0xdbe9

    add-int/2addr v2, v3

    goto :goto_0

    :cond_0
    :sswitch_2
    sget v2, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v3, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    rem-int/lit16 v3, v3, 0x19b

    xor-int/2addr v2, v3

    if-ltz v2, :cond_1

    const-string v2, "\u06df\u06e3\u06df"

    :goto_2
    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_1
    const-string v2, "\u06e7\u06e1\u06e4"

    goto :goto_2

    :sswitch_3
    const-string v0, "7gf"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۢ۠ۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-string v2, "\u06e1\u06e1\u06e0"

    goto :goto_2

    :sswitch_4
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    if-gtz v2, :cond_2

    const/16 v2, 0x2a

    sput v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    const-string v2, "\u06e4\u06e0"

    goto :goto_1

    :cond_2
    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v3, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    div-int/2addr v2, v3

    const v3, 0x1ac549

    xor-int/2addr v2, v3

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe8 -> :sswitch_0
        0xdc7c -> :sswitch_3
        0x1aaec0 -> :sswitch_4
        0x1ac1e7 -> :sswitch_1
        0x1ac54a -> :sswitch_5
        0x1ac54d -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 24

    const/4 v2, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v14, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x0

    const/4 v15, 0x0

    const-string v17, "\u06e1\u06df\u06e6"

    invoke-static/range {v17 .. v17}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v22

    move-object/from16 v17, v5

    move-object/from16 v18, v6

    move-object/from16 v19, v7

    :goto_0
    sparse-switch v22, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v5, "WOz2dZM=\n"

    const-string v6, "unZ3VaEI1oU=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "F6csFQ==\n"

    const-string v7, "c85PcHw0mi8=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "gw==\n"

    const-string v17, "saD1lxNuUeQ=\n"

    move-object/from16 v0, v17

    invoke-static {v7, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lxh;->s(Landroid/app/Activity;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v10, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v5, "vTEJoSg=\n"

    const-string v6, "X6uLgRuKuBo=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "HKvqWQ==\n"

    const-string v7, "eMKJPMzkC9Q=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "Rg==\n"

    const-string v17, "ddwwlJ3Vx0s=\n"

    move-object/from16 v0, v17

    invoke-static {v7, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lxh;->s(Landroid/app/Activity;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v10, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    sget v6, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v7, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    rem-int/lit16 v7, v7, -0x29c

    sub-int/2addr v6, v7

    if-gtz v6, :cond_14

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    const-string v6, "\u06e8\u06e2\u06e3"

    invoke-static {v6}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v17, v5

    move/from16 v22, v6

    goto :goto_0

    :sswitch_1
    if-nez v3, :cond_10

    sget v5, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    if-gtz v5, :cond_0

    const-string v5, "\u06e4\u06e2\u06e0"

    :goto_1
    invoke-static {v5}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v22, v5

    goto :goto_0

    :cond_0
    const-string v5, "\u06e4\u06e6\u06e1"

    goto :goto_1

    :sswitch_2
    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    move-result v5

    if-ltz v5, :cond_1

    const-string v5, "\u06e7\u06e2\u06e7"

    invoke-static {v5}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v22, v5

    goto/16 :goto_0

    :cond_1
    sget v5, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v6, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    div-int/2addr v5, v6

    const v6, 0x1aaf05

    add-int/2addr v5, v6

    move/from16 v22, v5

    goto/16 :goto_0

    :sswitch_3
    const/4 v5, 0x0

    invoke-static {v2, v5}, Lg40;->g(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    move-result-object v11

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual {v11, v5, v14, v6, v7}, Landroid/view/View;->setPadding(IIII)V

    const-string v5, "c0v2UdWT3zEYfZ827Q==\n"

    const-string v6, "kdd6vm0c/9Q=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "oVFx\n"

    const-string v7, "0yECTMnxmtc=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "hQ==\n"

    const-string v22, "tM3RiFV//lc=\n"

    move-object/from16 v0, v22

    invoke-static {v7, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lxh;->s(Landroid/app/Activity;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v11, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget v5, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v6, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    rem-int/lit16 v6, v6, 0x1cee

    sub-int/2addr v5, v6

    if-ltz v5, :cond_2

    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    move-object v5, v11

    :goto_2
    const-string v6, "\u06e7\u06df\u06e5"

    invoke-static {v6}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v6

    move-object v11, v5

    move/from16 v22, v6

    goto/16 :goto_0

    :cond_2
    sget v5, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v6, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sub-int/2addr v5, v6

    const v6, 0x1aba9e

    add-int/2addr v5, v6

    move/from16 v22, v5

    goto/16 :goto_0

    :sswitch_4
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    iget v6, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-double v6, v6

    const-wide v22, 0x3feb333333333333L    # 0.85

    mul-double v6, v6, v22

    double-to-int v6, v6

    sget v7, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    xor-int/lit16 v7, v7, 0x283

    invoke-direct {v5, v6, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v6, 0x31

    iput v6, v5, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    const/16 v6, 0x12c

    iput v6, v5, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    const-string v6, "\u06e3\u06e1\u06e3"

    move-object v7, v6

    :goto_3
    invoke-static {v7}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v6

    move-object v15, v5

    move/from16 v22, v6

    goto/16 :goto_0

    :sswitch_5
    move-object/from16 v0, p0

    iget v5, v0, Lp80;->a:I

    packed-switch v5, :pswitch_data_0

    :sswitch_6
    sget v5, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    if-ltz v5, :cond_3

    const-string v5, "\u06e2\u06e6\u06e8"

    invoke-static {v5}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v22, v5

    goto/16 :goto_0

    :cond_3
    sget v5, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v6, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    xor-int/2addr v5, v6

    const v6, 0x1ab3a1

    add-int/2addr v5, v6

    move/from16 v22, v5

    goto/16 :goto_0

    :sswitch_7
    new-instance v10, Landroid/widget/LinearLayout;

    invoke-direct {v10, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x0

    invoke-virtual {v10, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const-string v5, "R7yBUSA=\n"

    const-string v6, "pSYBcRE8J4E=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "Rv/VXA==\n"

    const-string v7, "Ipa2ObaNsZs=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "5Q==\n"

    const-string v22, "1NFlgN/nGMQ=\n"

    move-object/from16 v0, v22

    invoke-static {v7, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lxh;->s(Landroid/app/Activity;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v10, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v7, "\u06e2\u06e8"

    move-object v5, v9

    move-object v6, v10

    :goto_4
    invoke-static {v7}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v7

    move-object v9, v5

    move-object v10, v6

    move/from16 v22, v7

    goto/16 :goto_0

    :sswitch_8
    const/high16 v5, 0x41600000    # 14.0f

    move-object/from16 v0, v21

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setTextSize(F)V

    const-string v5, "UZMObZz8cA==\n"

    const-string v6, "cqtLVdnFQ3c=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    move-object/from16 v0, v21

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object/from16 v0, v21

    invoke-virtual {v0, v5, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    sget v5, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    if-gtz v5, :cond_5

    const/16 v5, 0x4e

    sput v5, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    :cond_4
    const-string v5, "\u06e0\u06e8\u06e3"

    invoke-static {v5}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v22, v5

    goto/16 :goto_0

    :cond_5
    sget v5, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v6, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    add-int/2addr v5, v6

    const v6, 0x1aca7e

    xor-int/2addr v5, v6

    move/from16 v22, v5

    goto/16 :goto_0

    :sswitch_9
    sget v3, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v5, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    rem-int/lit16 v5, v5, 0xb6b

    mul-int/2addr v3, v5

    if-gtz v3, :cond_6

    invoke-static {}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۠ۢۧۡ()I

    const-string v3, "\u06e0\u06e2\u06df"

    invoke-static {v3}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v5

    move-object v3, v13

    move/from16 v22, v5

    goto/16 :goto_0

    :cond_6
    sget v3, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v5, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    rem-int/2addr v3, v5

    const v5, 0x1aba6e

    add-int/2addr v5, v3

    move-object v3, v13

    move/from16 v22, v5

    goto/16 :goto_0

    :sswitch_a
    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-string v6, "azjSUL0s1w==\n"

    const-string v7, "SH7gFo9q4Fs=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v6, 0x42480000    # 50.0f

    invoke-virtual {v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    sget v6, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v7, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sub-int/2addr v6, v7

    const v7, 0x1ab83e

    xor-int/2addr v6, v7

    move-object/from16 v18, v5

    move/from16 v22, v6

    goto/16 :goto_0

    :sswitch_b
    const/4 v5, 0x0

    sget v6, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    xor-int/lit16 v6, v6, -0x1ed

    const/4 v7, 0x0

    const/16 v22, 0x0

    move-object/from16 v0, v21

    move/from16 v1, v22

    invoke-virtual {v0, v5, v6, v7, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    move-object/from16 v0, v21

    invoke-virtual {v9, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v4, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget v5, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v6, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    mul-int/2addr v5, v6

    const v6, 0x21a073

    add-int/2addr v5, v6

    move/from16 v22, v5

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    move-result v5

    if-gtz v5, :cond_7

    const-string v5, "\u06e5\u06e4\u06e1"

    :goto_5
    invoke-static {v5}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v22, v5

    goto/16 :goto_0

    :cond_7
    sget v5, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v6, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    xor-int/2addr v5, v6

    const v6, 0x1aabb4

    add-int/2addr v5, v6

    move/from16 v22, v5

    goto/16 :goto_0

    :sswitch_d
    const-string v5, "SNSlQ9Y=\n"

    const-string v6, "qk4gY+Ao5Bw=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "DGYJ8g==\n"

    const-string v7, "aA9ql95hydk=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "5g==\n"

    const-string v22, "0PdlZy5o2og=\n"

    move-object/from16 v0, v22

    invoke-static {v7, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lxh;->s(Landroid/app/Activity;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v5

    move-object/from16 v0, v17

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v4, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v17

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    move-result v5

    if-gtz v5, :cond_8

    const/16 v5, 0x1b

    sput v5, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    const-string v5, "\u06e4\u06e0\u06e5"

    :goto_6
    invoke-static {v5}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v22, v5

    goto/16 :goto_0

    :cond_8
    sget v5, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v6, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    mul-int/2addr v5, v6

    const v6, 0x163ab3

    add-int/2addr v5, v6

    move/from16 v22, v5

    goto/16 :goto_0

    :sswitch_e
    sget-object v2, Lxh;->n:Lxh;

    :goto_7
    return-object v2

    :sswitch_f
    const/4 v5, 0x0

    move-object/from16 v0, v17

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const-string v5, "mHjrUpQ=\n"

    const-string v6, "euJocqDQipo=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "0lQT7Q==\n"

    const-string v7, "tj1wiJw5njY=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "vg==\n"

    const-string v22, "inyvCDCxVUQ=\n"

    move-object/from16 v0, v22

    invoke-static {v7, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lxh;->s(Landroid/app/Activity;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v5

    move-object/from16 v0, v17

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v5, "vRkukUc=\n"

    const-string v6, "X4OqsXKbbsg=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "wU9u8Q==\n"

    const-string v7, "pSYNlHnLch8=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "bg==\n"

    const-string v22, "W/gv909URXQ=\n"

    move-object/from16 v0, v22

    invoke-static {v7, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lxh;->s(Landroid/app/Activity;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v5

    move-object/from16 v0, v17

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    move-result v5

    if-ltz v5, :cond_9

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    const-string v5, "\u06e2\u06e4\u06e2"

    invoke-static {v5}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v22, v5

    goto/16 :goto_0

    :cond_9
    move-object v5, v11

    goto/16 :goto_2

    :cond_a
    :sswitch_10
    sget v5, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v6, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    rem-int/lit16 v6, v6, -0x1e31

    div-int/2addr v5, v6

    if-ltz v5, :cond_b

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    const-string v5, "\u06e4\u06e1\u06e3"

    move v6, v12

    :goto_8
    invoke-static {v5}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v5

    move v12, v6

    move/from16 v22, v5

    goto/16 :goto_0

    :cond_b
    sget v5, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v6, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    add-int/2addr v5, v6

    const v6, 0x1aac0a

    add-int/2addr v5, v6

    move/from16 v22, v5

    goto/16 :goto_0

    :sswitch_11
    const-string v5, "eVpZaa2Ycw==\n"

    const-string v6, "WhwfXZmsR1A=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    move-object/from16 v0, v16

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object/from16 v0, v16

    invoke-virtual {v0, v5, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    sget v7, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    xor-int/lit8 v7, v7, 0x1a

    move-object/from16 v0, v16

    invoke-virtual {v0, v5, v12, v6, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    sget v5, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    if-gtz v5, :cond_c

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    const-string v5, "\u06e2\u06e8\u06e4"

    invoke-static {v5}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v22, v5

    goto/16 :goto_0

    :cond_c
    move v5, v14

    :cond_d
    const-string v6, "\u06df\u06e2\u06e3"

    :goto_9
    invoke-static {v6}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v6

    move v14, v5

    move/from16 v22, v6

    goto/16 :goto_0

    :sswitch_12
    sget v5, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v6, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    div-int/2addr v5, v6

    const v6, 0x1ac56c

    add-int/2addr v5, v6

    move/from16 v22, v5

    goto/16 :goto_0

    :sswitch_13
    invoke-virtual {v3, v4, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    sget v5, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v6, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    xor-int/lit16 v6, v6, 0x22b7

    xor-int/2addr v5, v6

    if-ltz v5, :cond_e

    const/16 v5, 0x1f

    sput v5, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    const-string v5, "\u06e1\u06e8\u06e7"

    invoke-static {v5}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v22, v5

    goto/16 :goto_0

    :cond_e
    sget v5, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v6, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    rem-int/2addr v5, v6

    const v6, 0xdb59

    add-int/2addr v5, v6

    move/from16 v22, v5

    goto/16 :goto_0

    :sswitch_14
    new-instance v5, Lz6;

    new-instance v6, Lm00;

    invoke-direct {v6}, Lm00;-><init>()V

    new-instance v7, Lm00;

    invoke-direct {v7}, Lm00;-><init>()V

    const/16 v22, 0x1

    move/from16 v0, v22

    invoke-direct {v5, v6, v4, v7, v0}, Lz6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v9, v5}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    sget v5, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v6, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    rem-int/lit16 v6, v6, 0x1827

    or-int/2addr v5, v6

    if-ltz v5, :cond_f

    const-string v5, "\u06e3\u06e1\u06e3"

    move-object v6, v13

    :goto_a
    invoke-static {v5}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v5

    move-object v13, v6

    move/from16 v22, v5

    goto/16 :goto_0

    :cond_f
    const-string v5, "\u06e7\u06e2\u06e7"

    goto/16 :goto_6

    :cond_10
    :sswitch_15
    sget v5, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v6, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    mul-int/lit16 v6, v6, 0x2459

    sub-int/2addr v5, v6

    if-gtz v5, :cond_11

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣۣ۟ۡ()I

    const-string v5, "\u06e5\u06e1"

    invoke-static {v5}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v22, v5

    goto/16 :goto_0

    :cond_11
    sget v5, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v6, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    div-int/2addr v5, v6

    const v6, 0x1aba0a

    add-int/2addr v5, v6

    move/from16 v22, v5

    goto/16 :goto_0

    :sswitch_16
    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    move-result v5

    if-gtz v5, :cond_12

    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    const-string v5, "\u06e6\u06e1\u06e4"

    invoke-static {v5}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v22, v5

    goto/16 :goto_0

    :cond_12
    sget v5, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v6, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    mul-int/2addr v5, v6

    const v6, 0x1be9ae

    xor-int/2addr v5, v6

    move/from16 v22, v5

    goto/16 :goto_0

    :sswitch_17
    const/4 v6, 0x0

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    move-result v5

    if-gtz v5, :cond_13

    const-string v5, "\u06e3\u06e1\u06e6"

    invoke-static {v5}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v5

    move-object v13, v6

    move/from16 v22, v5

    goto/16 :goto_0

    :cond_13
    const-string v5, "\u06e7\u06e4\u06e7"

    goto :goto_a

    :cond_14
    sget v6, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v7, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    div-int/2addr v6, v7

    const v7, 0x1abadd

    add-int/2addr v6, v7

    move-object/from16 v17, v5

    move/from16 v22, v6

    goto/16 :goto_0

    :sswitch_18
    sget-object v5, Lz20;->a:Lz20;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v0, p0

    iget-object v5, v0, Lp80;->b:Landroid/app/Activity;

    invoke-static {v5}, Lz20;->a(Landroid/app/Activity;)V

    sget v5, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    if-ltz v5, :cond_4

    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    const-string v5, "\u06e6\u06e6\u06e6"

    invoke-static {v5}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v5

    move/from16 v22, v5

    goto/16 :goto_0

    :sswitch_19
    const-string v5, "\u06e4\u06e3\u06e8"

    goto/16 :goto_5

    :sswitch_1a
    const-string v5, "ZSbpzEM/qQ==\n"

    const-string v6, "RmPciXZ66Dw=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    sget v6, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    xor-int/lit16 v6, v6, -0x246

    move-object/from16 v0, v18

    invoke-virtual {v0, v6, v5}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    move-object/from16 v0, v18

    invoke-virtual {v4, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget v5, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    if-ltz v5, :cond_15

    const/4 v5, 0x4

    sput v5, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    const-string v5, "\u06e0\u06e0\u06e2"

    invoke-static {v5}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v22, v5

    goto/16 :goto_0

    :cond_15
    const-string v5, "\u06e2\u06e0\u06e7"

    goto/16 :goto_1

    :sswitch_1b
    move-object/from16 v0, p0

    iget-object v2, v0, Lp80;->b:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v8

    instance-of v5, v8, Landroid/widget/FrameLayout;

    if-eqz v5, :cond_19

    const-string v5, "\u06e4\u06e2\u06e0"

    :goto_b
    invoke-static {v5}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v22, v5

    goto/16 :goto_0

    :sswitch_1c
    sget v5, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    xor-int/lit16 v6, v5, 0x3b9

    sget v5, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    xor-int/lit16 v5, v5, 0x26f

    invoke-virtual {v4, v6, v5, v6, v6}, Landroid/view/View;->setPadding(IIII)V

    sget v6, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    if-gez v6, :cond_d

    const-string v6, "\u06e1\u06e5\u06e4"

    goto/16 :goto_9

    :sswitch_1d
    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v6, "U07EuHjYsp0VXq8rJb6r51hJx34C4w==\n"

    const-string v7, "sdNImJ5ZEHg=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v6, 0x41700000    # 15.0f

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextSize(F)V

    sget v6, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    if-gtz v6, :cond_16

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    const-string v6, "\u06e6\u06e2\u06e4"

    invoke-static {v6}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v16, v5

    move/from16 v22, v6

    goto/16 :goto_0

    :cond_16
    const-string v6, "\u06e8\u06e6\u06df"

    :goto_c
    invoke-static {v6}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v16, v5

    move/from16 v22, v6

    goto/16 :goto_0

    :sswitch_1e
    const-string v5, "Z69mlfaWcx9hvlyOyJt+Fg==\n"

    const-string v6, "AMoD/qn1G3o=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_a

    const-string v5, "\u06e1\u06e8\u06e7"

    invoke-static {v5}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v22, v5

    goto/16 :goto_0

    :sswitch_1f
    sget v5, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    xor-int/lit16 v5, v5, 0x27d

    invoke-virtual {v9, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    sget v5, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    xor-int/lit16 v6, v5, -0x2ef

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-virtual {v9, v5, v14, v7, v6}, Landroid/view/View;->setPadding(IIII)V

    sget v5, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    if-ltz v5, :cond_17

    const-string v7, "\u06e2\u06df\u06e1"

    move-object v5, v15

    move v12, v6

    goto/16 :goto_3

    :cond_17
    const-string v5, "\u06e2\u06df\u06e1"

    goto/16 :goto_8

    :sswitch_20
    const-string v5, "GfqNvSWbUkhf0g==\n"

    const-string v6, "+2YHncIE4a0=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "T0h8\n"

    const-string v7, "PTgP/IzLujA=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "VA==\n"

    const-string v22, "ZlhsSQhpXAw=\n"

    move-object/from16 v0, v22

    invoke-static {v7, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lxh;->s(Landroid/app/Activity;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v11, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v5, "XYUo7B9O4Qs=\n"

    const-string v6, "rRq+fD+rWYg=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "c/w7\n"

    const-string v7, "AYxIWM0ff88=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "fA==\n"

    const-string v22, "Tyv9QiF3lKg=\n"

    move-object/from16 v0, v22

    invoke-static {v7, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lxh;->s(Landroid/app/Activity;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v11, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v4, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget v5, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v6, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    add-int/lit16 v6, v6, 0x231a

    or-int/2addr v5, v6

    if-ltz v5, :cond_18

    const-string v5, "\u06e7\u06e4\u06e8"

    invoke-static {v5}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v22, v5

    goto/16 :goto_0

    :cond_18
    const-string v5, "\u06e6\u06e2\u06e4"

    :goto_d
    invoke-static {v5}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v22, v5

    goto/16 :goto_0

    :sswitch_21
    sget v5, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v6, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    add-int/2addr v5, v6

    const v6, 0x1ab2e1

    add-int/2addr v5, v6

    move/from16 v22, v5

    goto/16 :goto_0

    :cond_19
    :sswitch_22
    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    move-result v5

    if-ltz v5, :cond_1a

    const-string v5, "\u06e1\u06e3\u06e2"

    goto :goto_d

    :cond_1a
    const-string v5, "\u06e2\u06e4\u06e7"

    goto :goto_d

    :pswitch_0
    :sswitch_23
    sget v5, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v6, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    mul-int/2addr v5, v6

    const v6, 0x14af14

    add-int/2addr v5, v6

    move/from16 v22, v5

    goto/16 :goto_0

    :sswitch_24
    sget v5, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    xor-int/lit8 v5, v5, -0x5e

    move-object/from16 v0, v16

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v5, Lx6;

    sget v6, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    xor-int/lit16 v6, v6, 0x2bb

    invoke-direct {v5, v2, v3, v4, v6}, Lx6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v0, v16

    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    move-object/from16 v0, v16

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget v5, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v6, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    div-int/lit16 v6, v6, -0x1225

    add-int/2addr v5, v6

    if-ltz v5, :cond_1b

    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    const-string v6, "\u06e4\u06e6\u06e1"

    move-object/from16 v5, v16

    goto/16 :goto_c

    :cond_1b
    sget v5, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v6, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    mul-int/2addr v5, v6

    const v6, 0x1baadf

    add-int/2addr v5, v6

    move/from16 v22, v5

    goto/16 :goto_0

    :sswitch_25
    move-object v3, v8

    check-cast v3, Landroid/widget/FrameLayout;

    sget v5, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    if-ltz v5, :cond_1c

    const-string v5, "\u06df\u06e6\u06e5"

    invoke-static {v5}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v22, v5

    goto/16 :goto_0

    :cond_1c
    const-string v5, "\u06e0\u06e2\u06df"

    invoke-static {v5}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v22, v5

    goto/16 :goto_0

    :sswitch_26
    new-instance v4, Landroid/widget/LinearLayout;

    invoke-direct {v4, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const-string v5, "ukjittSDbna8Wdit6o5jfw==\n"

    const-string v6, "3S2H3YvgBhM=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    sget v5, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    if-gtz v5, :cond_1d

    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    const-string v5, "\u06e3\u06e8\u06e2"

    invoke-static {v5}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v22, v5

    goto/16 :goto_0

    :cond_1d
    sget v5, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v6, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    mul-int/2addr v5, v6

    const v6, 0x180ff2

    xor-int/2addr v5, v6

    move/from16 v22, v5

    goto/16 :goto_0

    :sswitch_27
    move-object/from16 v0, v19

    invoke-virtual {v9, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v6, "EWmrmesV4XlzbO4EkW7cGhpuqF+QNA==\n"

    const-string v7, "8/MKuQ2LYJA=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget v6, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v7, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    add-int/lit16 v7, v7, 0x1d9e

    mul-int/2addr v6, v7

    if-ltz v6, :cond_1e

    const/16 v6, 0x40

    sput v6, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    const-string v6, "\u06e7\u06e4\u06e7"

    invoke-static {v6}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v21, v5

    move/from16 v22, v6

    goto/16 :goto_0

    :cond_1e
    sget v6, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v7, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sub-int/2addr v6, v7

    const v7, 0x1ab110

    add-int/2addr v6, v7

    move-object/from16 v21, v5

    move/from16 v22, v6

    goto/16 :goto_0

    :sswitch_28
    new-instance v5, Landroid/view/View;

    invoke-direct {v5, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-string v7, "tDXbVQqxRw==\n"

    const-string v19, "l3btFjzyf/g=\n"

    move-object/from16 v0, v19

    invoke-static {v7, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v6, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    move-result v7

    if-ltz v7, :cond_1f

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    const-string v7, "\u06e2\u06e4\u06e7"

    invoke-static {v7}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v19, v5

    move-object/from16 v20, v6

    move/from16 v22, v7

    goto/16 :goto_0

    :cond_1f
    sget v7, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v19, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    or-int v7, v7, v19

    const v19, -0x1ac40b

    xor-int v7, v7, v19

    move-object/from16 v19, v5

    move-object/from16 v20, v6

    move/from16 v22, v7

    goto/16 :goto_0

    :sswitch_29
    const/high16 v5, 0x41200000    # 10.0f

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual/range {v19 .. v20}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    sget v6, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    xor-int/lit16 v6, v6, -0x369

    sget v7, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    xor-int/lit16 v7, v7, -0x23c

    invoke-direct {v5, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    move-object/from16 v0, v19

    invoke-virtual {v0, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    move-result v5

    if-ltz v5, :cond_20

    const-string v5, "\u06e4\u06e7\u06e5"

    goto/16 :goto_b

    :cond_20
    const-string v6, "\u06e3\u06e1\u06e6"

    move-object v5, v15

    move-object v7, v6

    goto/16 :goto_3

    :sswitch_2a
    const/high16 v5, 0x41f00000    # 30.0f

    invoke-virtual {v4, v5}, Landroid/view/View;->setElevation(F)V

    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    sget v6, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v7, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    rem-int/lit16 v7, v7, 0x12f5

    xor-int/2addr v6, v7

    if-gtz v6, :cond_21

    const-string v7, "\u06e8\u06e4\u06e1"

    move-object v6, v10

    goto/16 :goto_4

    :cond_21
    sget v6, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v7, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    rem-int/2addr v6, v7

    const v7, 0x1aaa8d

    add-int/2addr v6, v7

    move-object v9, v5

    move/from16 v22, v6

    goto/16 :goto_0

    :sswitch_2b
    sget-object v2, Lxh;->n:Lxh;

    goto/16 :goto_7

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc46 -> :sswitch_0
        0xdc81 -> :sswitch_14
        0xdcbe -> :sswitch_10
        0x1aa71e -> :sswitch_19
        0x1aa760 -> :sswitch_24
        0x1aa762 -> :sswitch_4
        0x1aa7de -> :sswitch_26
        0x1aaac2 -> :sswitch_1c
        0x1aaae2 -> :sswitch_19
        0x1aab1d -> :sswitch_16
        0x1aab3d -> :sswitch_1f
        0x1aab62 -> :sswitch_8
        0x1aabdb -> :sswitch_e
        0x1aae88 -> :sswitch_5
        0x1aaf05 -> :sswitch_12
        0x1aaf22 -> :sswitch_12
        0x1aaf40 -> :sswitch_a
        0x1aafa0 -> :sswitch_21
        0x1ab244 -> :sswitch_28
        0x1ab269 -> :sswitch_2a
        0x1ab2e0 -> :sswitch_15
        0x1ab2e5 -> :sswitch_17
        0x1ab35e -> :sswitch_1b
        0x1ab622 -> :sswitch_23
        0x1ab645 -> :sswitch_13
        0x1ab648 -> :sswitch_27
        0x1ab71d -> :sswitch_20
        0x1ab9e9 -> :sswitch_1a
        0x1aba0a -> :sswitch_1e
        0x1aba22 -> :sswitch_25
        0x1aba49 -> :sswitch_1
        0x1aba9f -> :sswitch_2
        0x1abac2 -> :sswitch_18
        0x1abade -> :sswitch_f
        0x1abae3 -> :sswitch_6
        0x1ac189 -> :sswitch_c
        0x1ac1a8 -> :sswitch_1d
        0x1ac226 -> :sswitch_22
        0x1ac509 -> :sswitch_29
        0x1ac50d -> :sswitch_d
        0x1ac56c -> :sswitch_2b
        0x1ac5aa -> :sswitch_9
        0x1ac5ab -> :sswitch_12
        0x1ac627 -> :sswitch_7
        0x1ac929 -> :sswitch_3
        0x1ac965 -> :sswitch_b
        0x1ac9a1 -> :sswitch_11
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
