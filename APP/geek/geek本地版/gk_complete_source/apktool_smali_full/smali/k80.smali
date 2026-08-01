.class public final synthetic Lk80;
.super Ljava/lang/Object;

# interfaces
.implements Lhm;


# instance fields
.field public final a:I

.field public final b:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;I)V
    .locals 3

    iput p2, p0, Lk80;->a:I

    iput-object p1, p0, Lk80;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e3\u06e8"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    move-result v1

    if-gtz v1, :cond_0

    invoke-static {}, Landroidx/savedstate/۠ۡۢ۠;->ۣ۟ۨۤۨ()I

    move-result v1

    if-gtz v1, :cond_3

    const/16 v1, 0x2b

    sput v1, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    const-string v1, "\u06e2\u06e6\u06e2"

    :goto_1
    invoke-static {v1}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    const-string v0, "QqWJfmZFt3qXjXu35jq1Ewn"

    invoke-static {v0}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۦۡۨۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    const-string v1, "\u06e6\u06df\u06e4"

    goto :goto_1

    :cond_0
    :sswitch_2
    sget v1, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v2, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    div-int/lit16 v2, v2, -0x153e

    mul-int/2addr v1, v2

    if-eqz v1, :cond_1

    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    const-string v1, "\u06e8\u06e3\u06e4"

    :goto_2
    invoke-static {v1}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e6\u06e0\u06e4"

    goto :goto_2

    :sswitch_3
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    if-gtz v1, :cond_2

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    const-string v1, "\u06e1\u06e5\u06e2"

    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e6\u06e0\u06e4"

    invoke-static {v1}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_4
    sget v1, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v2, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    div-int/2addr v1, v2

    const v2, 0xdc65

    add-int/2addr v1, v2

    goto :goto_0

    :cond_3
    const-string v1, "\u06e1\u06e5\u06e2"

    goto :goto_2

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc65 -> :sswitch_0
        0x1aaf3e -> :sswitch_1
        0x1ab31e -> :sswitch_2
        0x1abac0 -> :sswitch_4
        0x1ac14b -> :sswitch_3
        0x1ac16a -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 28

    const/4 v15, 0x0

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/16 v16, 0x0

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v14, 0x0

    const/4 v11, 0x0

    const/4 v10, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/4 v7, 0x0

    const/16 v18, 0x0

    const/4 v6, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    const/4 v5, 0x0

    const-string v19, "\u06e7\u06e7\u06e1"

    invoke-static/range {v19 .. v19}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v25

    move-object/from16 v19, v5

    move-object/from16 v20, v6

    move-object/from16 v21, v7

    move-object/from16 v22, v18

    :goto_0
    sparse-switch v25, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    move-object/from16 v3, v16

    :goto_1
    const-string v5, "\u06e6\u06e1\u06e4"

    :goto_2
    invoke-static {v5}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v5

    move/from16 v25, v5

    goto :goto_0

    :pswitch_0
    :sswitch_1
    invoke-static {}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۢۨۤ۟()I

    move-result v5

    if-gtz v5, :cond_0

    const/16 v5, 0x50

    sput v5, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    const-string v5, "\u06e3\u06e1\u06df"

    :goto_3
    invoke-static {v5}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v25, v5

    goto :goto_0

    :cond_0
    const-string v5, "\u06e8\u06e2\u06e4"

    :goto_4
    invoke-static {v5}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v25, v5

    goto :goto_0

    :sswitch_2
    sget v5, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v6, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    add-int/lit16 v6, v6, -0x26d

    add-int/2addr v5, v6

    if-gtz v5, :cond_1

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    const-string v5, "\u06e1\u06e0\u06e7"

    move-object v6, v3

    :goto_5
    invoke-static {v5}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v5

    move-object v3, v6

    move/from16 v25, v5

    goto :goto_0

    :cond_1
    sget v5, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v6, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    or-int/2addr v5, v6

    const v6, 0x1ab59a

    xor-int/2addr v5, v6

    move/from16 v25, v5

    goto :goto_0

    :cond_2
    :sswitch_3
    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    move-result v5

    if-gtz v5, :cond_3

    const/16 v5, 0x4e

    sput v5, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    const-string v6, "\u06e1\u06e6\u06e4"

    move-object v5, v10

    move v7, v11

    :goto_6
    invoke-static {v6}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v6

    move-object v10, v5

    move v11, v7

    move/from16 v25, v6

    goto :goto_0

    :cond_3
    sget v5, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v6, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sub-int/2addr v5, v6

    const v6, 0x1aae60

    xor-int/2addr v5, v6

    move/from16 v25, v5

    goto :goto_0

    :sswitch_4
    sget v5, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v6, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sub-int/2addr v5, v6

    const v6, 0x1ac301

    add-int/2addr v5, v6

    move/from16 v25, v5

    goto :goto_0

    :cond_4
    move-object v2, v6

    :sswitch_5
    sget v5, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    if-gtz v5, :cond_5

    const-string v5, "\u06e6\u06e8\u06e7"

    :goto_7
    invoke-static {v5}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v25, v5

    goto/16 :goto_0

    :cond_5
    sget v5, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v6, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    add-int/2addr v5, v6

    const v6, 0x1abd62

    add-int/2addr v5, v6

    move/from16 v25, v5

    goto/16 :goto_0

    :sswitch_6
    const-string v5, "DqDbzs8=\n"

    const-string v6, "7Dpa7v0m4y8=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "tJ+/Ag==\n"

    const-string v7, "0PbcZ5A+c/E=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "+w==\n"

    const-string v13, "yV5F4gQvBJo=\n"

    invoke-static {v7, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lvh;->l(Landroid/app/Activity;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v12, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v5, "s6P6H34=\n"

    const-string v6, "UTl4P01nf5s=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "J7NrEQ==\n"

    const-string v7, "Q9oIdIwBTWM=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "Pw==\n"

    const-string v13, "DGAzwq6Dcp8=\n"

    invoke-static {v7, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lvh;->l(Landroid/app/Activity;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v12, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v6, Landroid/widget/LinearLayout;

    invoke-direct {v6, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x0

    invoke-virtual {v6, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    sget v5, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v7, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    xor-int/lit16 v7, v7, 0x2621

    rem-int/2addr v5, v7

    if-gtz v5, :cond_6

    const/16 v5, 0xc

    sput v5, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    const-string v5, "\u06e4\u06e1\u06e0"

    invoke-static {v5}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v5

    move-object v13, v6

    move/from16 v25, v5

    goto/16 :goto_0

    :cond_6
    const-string v7, "\u06df\u06e4\u06e1"

    move-object v5, v12

    :goto_8
    invoke-static {v7}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v7

    move-object v12, v5

    move-object v13, v6

    move/from16 v25, v7

    goto/16 :goto_0

    :sswitch_7
    new-instance v4, Landroid/widget/LinearLayout;

    invoke-direct {v4, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const-string v5, "5Zdz9+8BR83jhkns0QxKxA==\n"

    const-string v6, "gvIWnLBiL6g=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    sget v5, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    xor-int/lit16 v14, v5, -0x31b

    sget v5, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    if-ltz v5, :cond_7

    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    const-string v7, "\u06e7\u06e4\u06e6"

    move-object v5, v12

    move-object v6, v13

    goto :goto_8

    :cond_7
    const-string v5, "\u06e0\u06e8\u06e7"

    :goto_9
    invoke-static {v5}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v25, v5

    goto/16 :goto_0

    :sswitch_8
    if-nez v3, :cond_2

    const-string v7, "\u06df\u06e4\u06e6"

    move-object v5, v12

    move-object v6, v13

    goto :goto_8

    :sswitch_9
    const/4 v5, 0x0

    const/4 v6, 0x0

    sget v7, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    xor-int/lit16 v7, v7, -0x369

    move-object/from16 v0, v19

    move/from16 v1, v24

    invoke-virtual {v0, v5, v1, v6, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    sget v5, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    xor-int/lit16 v5, v5, -0x137

    move-object/from16 v0, v19

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v5, Lv9;

    sget v6, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    xor-int/lit16 v6, v6, -0x337

    invoke-direct {v5, v2, v3, v4, v6}, Lv9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v0, v19

    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    move-object/from16 v0, v19

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget v5, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v6, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    add-int/lit16 v6, v6, 0x16c1

    or-int/2addr v5, v6

    if-ltz v5, :cond_8

    const-string v5, "\u06e6\u06e5\u06e0"

    invoke-static {v5}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v5

    move/from16 v25, v5

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06e3\u06e1\u06e4"

    move-object v6, v5

    :goto_a
    invoke-static {v6}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v25, v5

    goto/16 :goto_0

    :sswitch_a
    const/high16 v5, 0x42480000    # 50.0f

    invoke-virtual {v10, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    const-string v5, "itZ9l2udMA==\n"

    const-string v6, "qZNI0l7YcUU=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    sget v6, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    xor-int/lit16 v6, v6, -0x1fa

    invoke-virtual {v10, v6, v5}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual {v4, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget v5, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v6, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    xor-int/lit16 v6, v6, 0x53c

    xor-int/2addr v5, v6

    if-gtz v5, :cond_9

    const-string v5, "\u06e5\u06e6\u06e8"

    invoke-static {v5}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v25, v5

    goto/16 :goto_0

    :cond_9
    sget v5, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v6, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    add-int/2addr v5, v6

    const v6, 0x1ac338

    xor-int/2addr v5, v6

    move/from16 v25, v5

    goto/16 :goto_0

    :sswitch_b
    move-object/from16 v0, p0

    iget-object v6, v0, Lk80;->b:Landroid/app/Activity;

    invoke-virtual {v6}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    instance-of v5, v2, Landroid/widget/FrameLayout;

    if-eqz v5, :cond_4

    move-object v5, v2

    check-cast v5, Landroid/widget/FrameLayout;

    sget v2, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v7, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    add-int/lit16 v7, v7, -0x534

    add-int/2addr v2, v7

    if-ltz v2, :cond_a

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۣۡۧۢ()I

    const-string v2, "\u06e4\u06e2\u06e6"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v7

    move-object v2, v6

    move-object/from16 v16, v5

    move/from16 v25, v7

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u06e6\u06e0"

    invoke-static {v2}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v7

    move-object v2, v6

    move-object/from16 v16, v5

    move/from16 v25, v7

    goto/16 :goto_0

    :sswitch_c
    const-string v5, "CM34ulM=\n"

    const-string v6, "6ld7mmeAoqc=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "15dhPA==\n"

    const-string v7, "s/4CWbSkEzk=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "rw==\n"

    const-string v18, "m7itvNhxE4w=\n"

    move-object/from16 v0, v18

    invoke-static {v7, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lvh;->l(Landroid/app/Activity;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v13, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v5, "4FjBdVE=\n"

    const-string v6, "AsJFVWRX/2s=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "NDow7g==\n"

    const-string v7, "UFNTiw1Jwu4=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "Bw==\n"

    const-string v18, "MutDCW6Eclo=\n"

    move-object/from16 v0, v18

    invoke-static {v7, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lvh;->l(Landroid/app/Activity;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v13, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v5, "CQ5AqCk=\n"

    const-string v6, "65TFiB9LWSo=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "/vpDfQ==\n"

    const-string v7, "mpMgGG4nXfI=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "/Q==\n"

    const-string v18, "y3F65DHzoM4=\n"

    move-object/from16 v0, v18

    invoke-static {v7, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lvh;->l(Landroid/app/Activity;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v13, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v4, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    move-result v5

    if-gtz v5, :cond_b

    const/16 v5, 0x3f

    sput v5, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    const-string v5, "\u06e7\u06e2\u06e2"

    invoke-static {v5}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v25, v5

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u06e5\u06e6\u06e2"

    invoke-static {v5}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v25, v5

    goto/16 :goto_0

    :sswitch_d
    move-object/from16 v0, v23

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v6, "vZtH5W6RUi/fngJ4FOpvTLacRCMVsA==\n"

    const-string v7, "XwHmxYgP08Y=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v6, 0x41600000    # 14.0f

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextSize(F)V

    sget v6, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v7, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    xor-int/lit16 v7, v7, -0x136d

    add-int/2addr v6, v7

    if-ltz v6, :cond_c

    const/16 v6, 0x59

    sput v6, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    const-string v6, "\u06e8\u06e6\u06df"

    invoke-static {v6}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v20, v5

    move/from16 v25, v6

    goto/16 :goto_0

    :cond_c
    sget v6, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v7, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    add-int/2addr v6, v7

    const v7, 0x1ab1f5

    add-int/2addr v6, v7

    move-object/from16 v20, v5

    move/from16 v25, v6

    goto/16 :goto_0

    :sswitch_e
    const-string v5, "Alwis0Nz8w==\n"

    const-string v6, "IWRniwZKwIg=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object/from16 v0, v20

    invoke-virtual {v0, v5, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    const/4 v5, 0x0

    sget v6, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    xor-int/lit16 v6, v6, 0x1f3

    const/4 v7, 0x0

    const/16 v18, 0x0

    move-object/from16 v0, v20

    move/from16 v1, v18

    invoke-virtual {v0, v5, v6, v7, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    move-object/from16 v0, v23

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget v5, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    if-gtz v5, :cond_d

    const-string v5, "\u06e8\u06e2\u06e1"

    invoke-static {v5}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v25, v5

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u06df\u06df\u06e6"

    goto/16 :goto_7

    :sswitch_f
    sget v5, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v6, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    rem-int/lit16 v6, v6, 0x2673

    rem-int/2addr v5, v6

    if-ltz v5, :cond_e

    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    const-string v5, "\u06e7\u06df\u06e0"

    goto/16 :goto_4

    :cond_e
    sget v5, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v6, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    or-int/2addr v5, v6

    const v6, 0x1ac6d2

    add-int/2addr v5, v6

    move/from16 v25, v5

    goto/16 :goto_0

    :sswitch_10
    const-string v5, "QInVlsam9TIGoQ==\n"

    const-string v6, "ohVftiE5Rtc=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "a5zl\n"

    const-string v7, "GeyWIL4SA2E=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "3w==\n"

    const-string v18, "7dsFaAUl2CY=\n"

    move-object/from16 v0, v18

    invoke-static {v7, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lvh;->l(Landroid/app/Activity;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v5

    move-object/from16 v0, v17

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v5, "uFUTBJL/b/Y=\n"

    const-string v6, "SMqFlLIa13U=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "bPa9\n"

    const-string v7, "HobOlHGl5wY=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "+Q==\n"

    const-string v18, "yoG/pY+rNTg=\n"

    move-object/from16 v0, v18

    invoke-static {v7, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lvh;->l(Landroid/app/Activity;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v5

    move-object/from16 v0, v17

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v17

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    sget v6, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v7, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    or-int/lit16 v7, v7, 0x1985

    or-int/2addr v6, v7

    if-ltz v6, :cond_f

    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    const-string v6, "\u06e5\u06e6\u06e2"

    invoke-static {v6}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v19, v5

    move/from16 v25, v6

    goto/16 :goto_0

    :cond_f
    sget v6, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v7, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sub-int/2addr v6, v7

    const v7, -0x1aae38

    xor-int/2addr v6, v7

    move-object/from16 v19, v5

    move/from16 v25, v6

    goto/16 :goto_0

    :sswitch_11
    new-instance v5, Lh80;

    new-instance v6, Lf00;

    invoke-direct {v6}, Lf00;-><init>()V

    new-instance v7, Lf00;

    invoke-direct {v7}, Lf00;-><init>()V

    invoke-direct {v5, v6, v4, v7}, Lh80;-><init>(Lf00;Landroid/widget/LinearLayout;Lf00;)V

    move-object/from16 v0, v23

    invoke-virtual {v0, v5}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    sget v5, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    if-gtz v5, :cond_10

    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    const-string v5, "\u06df\u06e4\u06e1"

    invoke-static {v5}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v25, v5

    goto/16 :goto_0

    :cond_10
    move v5, v15

    :goto_b
    const-string v6, "\u06e4\u06e7\u06e2"

    move v15, v5

    goto/16 :goto_a

    :sswitch_12
    const-string v5, "jsLWkUcotzOI0+yKeSW6Og==\n"

    const-string v6, "6aez+hhL31Y=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_11

    const-string v5, "\u06e4\u06e2\u06e2"

    invoke-static {v5}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v25, v5

    goto/16 :goto_0

    :sswitch_13
    move-object v5, v8

    check-cast v5, Landroidx/activity/ComponentActivity;

    sget v6, Landroidx/activity/ComponentActivity;->r:I

    invoke-virtual {v5}, Landroidx/activity/ComponentActivity;->reportFullyDrawn()V

    const-string v5, "\u06df\u06e6\u06e6"

    goto/16 :goto_2

    :cond_11
    :sswitch_14
    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    move-result v5

    if-gtz v5, :cond_12

    const-string v5, "\u06e7\u06e3\u06e8"

    :goto_c
    invoke-static {v5}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v5

    move/from16 v25, v5

    goto/16 :goto_0

    :cond_12
    sget v5, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v6, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    rem-int/2addr v5, v6

    const v6, 0x1aba0a

    xor-int/2addr v5, v6

    move/from16 v25, v5

    goto/16 :goto_0

    :sswitch_15
    sget v5, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v6, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    or-int/2addr v5, v6

    const v6, 0x1ac00b

    add-int/2addr v5, v6

    move/from16 v25, v5

    goto/16 :goto_0

    :sswitch_16
    const-string v5, "\u06e4\u06e7\u06e2"

    goto/16 :goto_3

    :sswitch_17
    move-object/from16 v0, p0

    iget v5, v0, Lk80;->a:I

    move-object/from16 v0, p0

    iget-object v8, v0, Lk80;->b:Landroid/app/Activity;

    sget v6, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v7, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    div-int/lit16 v7, v7, -0x142

    sub-int/2addr v6, v7

    if-gtz v6, :cond_13

    const/16 v6, 0x35

    sput v6, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    goto :goto_b

    :cond_13
    sget v6, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v7, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    xor-int/2addr v6, v7

    const v7, 0x1ab391

    add-int/2addr v6, v7

    move v15, v5

    move/from16 v25, v6

    goto/16 :goto_0

    :sswitch_18
    sget-object v5, Ls20;->a:Ls20;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8}, Ls20;->a(Landroid/app/Activity;)V

    sget v5, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v6, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    mul-int/lit16 v6, v6, 0x2300

    or-int/2addr v5, v6

    if-ltz v5, :cond_14

    const/16 v5, 0x1e

    sput v5, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    const-string v5, "\u06e3\u06e1\u06e4"

    invoke-static {v5}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v25, v5

    goto/16 :goto_0

    :cond_14
    const-string v7, "\u06e8\u06e2\u06e1"

    move-object v5, v12

    move-object v6, v13

    goto/16 :goto_8

    :sswitch_19
    packed-switch v15, :pswitch_data_0

    :sswitch_1a
    sget v5, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v6, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    add-int/lit16 v6, v6, -0x12c6

    div-int/2addr v5, v6

    if-eqz v5, :cond_1c

    const-string v5, "\u06e3\u06e8\u06e8"

    goto/16 :goto_9

    :sswitch_1b
    const-string v5, "/iU/8g1YkA==\n"

    const-string v6, "3WYJsTsbqK4=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    move-object/from16 v0, v22

    invoke-virtual {v0, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v5, 0x41200000    # 10.0f

    move-object/from16 v0, v22

    invoke-virtual {v0, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual/range {v21 .. v22}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    sget v6, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    xor-int/lit16 v6, v6, 0xe9

    sget v7, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    xor-int/lit16 v7, v7, -0x1a1

    invoke-direct {v5, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    move-object/from16 v0, v21

    invoke-virtual {v0, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget v5, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    if-ltz v5, :cond_15

    invoke-static {}, Lkotlinx/coroutines/ۦۡۧۧ;->۟ۤۧۨۦ()I

    const-string v5, "\u06e0\u06e8\u06e7"

    invoke-static {v5}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v25, v5

    goto/16 :goto_0

    :cond_15
    const-string v5, "\u06e3\u06e2\u06e1"

    move-object/from16 v6, v17

    move-object/from16 v18, v5

    move v7, v11

    :goto_d
    invoke-static/range {v18 .. v18}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v17, v6

    move v11, v7

    move/from16 v25, v5

    goto/16 :goto_0

    :sswitch_1c
    sget v5, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    xor-int/lit16 v7, v5, 0xc8

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v0, v23

    invoke-virtual {v0, v5, v11, v6, v7}, Landroid/view/View;->setPadding(IIII)V

    new-instance v5, Landroid/view/View;

    invoke-direct {v5, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    sget v18, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v21, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    or-int v18, v18, v21

    const v21, 0x1ab0c7

    add-int v18, v18, v21

    move-object/from16 v21, v5

    move-object/from16 v22, v6

    move/from16 v24, v7

    move/from16 v25, v18

    goto/16 :goto_0

    :sswitch_1d
    invoke-virtual {v4, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/4 v5, 0x0

    invoke-static {v2, v5}, Lz30;->g(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    move-result-object v17

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v0, v17

    invoke-virtual {v0, v5, v11, v6, v7}, Landroid/view/View;->setPadding(IIII)V

    const-string v5, "yTYNCA3rHsCiAGRvNQ==\n"

    const-string v6, "K6qB57VkPiU=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "gOSr\n"

    const-string v7, "8pTYQImPLF8=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "ZA==\n"

    const-string v18, "VWptoTPAuxE=\n"

    move-object/from16 v0, v18

    invoke-static {v7, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lvh;->l(Landroid/app/Activity;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v5

    move-object/from16 v0, v17

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-static {}, Landroid/app/۠ۨۥۨ;->ۣۣ۟ۨۧ()I

    move-result v5

    if-gtz v5, :cond_16

    const/16 v5, 0x4c

    sput v5, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    const-string v5, "\u06e8\u06e1\u06e0"

    invoke-static {v5}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v25, v5

    goto/16 :goto_0

    :cond_16
    const-string v5, "\u06e5\u06df\u06e5"

    move-object/from16 v6, v17

    move-object/from16 v18, v5

    move v7, v11

    goto/16 :goto_d

    :sswitch_1e
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    iget v6, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-double v6, v6

    const-wide v26, 0x3feb333333333333L    # 0.85

    mul-double v6, v6, v26

    double-to-int v6, v6

    sget v7, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    xor-int/lit8 v7, v7, -0x39

    invoke-direct {v5, v6, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v6, 0x31

    iput v6, v5, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    const/16 v6, 0x12c

    iput v6, v5, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    invoke-virtual {v3, v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    move-result v5

    if-gtz v5, :cond_17

    const/16 v5, 0x51

    sput v5, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    goto/16 :goto_1

    :cond_17
    sget v5, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v6, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    or-int/2addr v5, v6

    const v6, 0x1abee1

    add-int/2addr v5, v6

    move/from16 v25, v5

    goto/16 :goto_0

    :pswitch_1
    :sswitch_1f
    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    move-result v5

    if-gtz v5, :cond_18

    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    const-string v5, "\u06e5\u06e2\u06e8"

    invoke-static {v5}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v25, v5

    goto/16 :goto_0

    :cond_18
    const-string v5, "\u06e0\u06e2\u06e5"

    goto/16 :goto_3

    :sswitch_20
    const/4 v2, 0x0

    :goto_e
    return-object v2

    :sswitch_21
    sget v3, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    if-ltz v3, :cond_19

    const-string v3, "\u06e5\u06e6\u06e1"

    invoke-static {v3}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v5

    move-object v3, v9

    move/from16 v25, v5

    goto/16 :goto_0

    :cond_19
    const-string v3, "\u06e8\u06e6\u06df"

    move-object v5, v3

    move-object v6, v9

    goto/16 :goto_5

    :sswitch_22
    sget v5, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    xor-int/lit16 v7, v5, -0x389

    invoke-virtual {v4, v14, v7, v14, v14}, Landroid/view/View;->setPadding(IIII)V

    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-string v6, "vIHojOaD+A==\n"

    const-string v10, "n8faytTFzzM=\n"

    invoke-static {v6, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    sget v6, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v10, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    div-int/lit16 v10, v10, -0x11a4

    xor-int/2addr v6, v10

    if-gtz v6, :cond_1a

    const/16 v6, 0x52

    sput v6, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    const-string v11, "\u06e5\u06df\u06e5"

    move-object v10, v5

    move-object/from16 v6, v17

    move-object/from16 v18, v11

    goto/16 :goto_d

    :cond_1a
    const-string v6, "\u06e8\u06e1\u06e0"

    goto/16 :goto_6

    :sswitch_23
    move-object/from16 v0, v23

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v12, Landroid/widget/LinearLayout;

    invoke-direct {v12, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x0

    invoke-virtual {v12, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const-string v5, "sXVfeoU=\n"

    const-string v6, "U+/fWrRqa3w=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "7I38jw==\n"

    const-string v7, "iOSf6gJgZzc=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "sQ==\n"

    const-string v18, "gIPnZfpDIdI=\n"

    move-object/from16 v0, v18

    invoke-static {v7, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lvh;->l(Landroid/app/Activity;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v12, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v7, "\u06e8\u06e4"

    move-object v5, v12

    move-object v6, v13

    goto/16 :goto_8

    :sswitch_24
    const-string v5, "xGrZmpHHE2KCerIJzKEKGM9t2lzr/A==\n"

    const-string v6, "JvdVundGsYc=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, v19

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v5, 0x41700000    # 15.0f

    move-object/from16 v0, v19

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setTextSize(F)V

    const-string v5, "tDvHdU6oCg==\n"

    const-string v6, "l32BQXqcPss=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    move-object/from16 v0, v19

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object/from16 v0, v19

    invoke-virtual {v0, v5, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    sget v5, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v6, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    div-int/lit16 v6, v6, -0x218

    or-int/2addr v5, v6

    if-gtz v5, :cond_1b

    const-string v5, "\u06e2\u06df\u06e2"

    invoke-static {v5}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v25, v5

    goto/16 :goto_0

    :cond_1b
    sget v5, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v6, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    div-int/2addr v5, v6

    const v6, 0x1aba28

    xor-int/2addr v5, v6

    move/from16 v25, v5

    goto/16 :goto_0

    :sswitch_25
    sget-object v2, Lvh;->n:Lvh;

    goto/16 :goto_e

    :cond_1c
    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v6, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sub-int/2addr v5, v6

    const v6, -0x1aaa92

    xor-int/2addr v5, v6

    move/from16 v25, v5

    goto/16 :goto_0

    :sswitch_26
    sget v5, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v6, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    rem-int/lit16 v6, v6, -0x69e

    add-int/2addr v5, v6

    if-gtz v5, :cond_1d

    const-string v5, "\u06e8\u06e8\u06e3"

    invoke-static {v5}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v25, v5

    goto/16 :goto_0

    :cond_1d
    sget v5, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v6, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sub-int/2addr v5, v6

    const v6, 0x1ac7b5

    add-int/2addr v5, v6

    move/from16 v25, v5

    goto/16 :goto_0

    :sswitch_27
    const/4 v9, 0x0

    sget v5, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    if-ltz v5, :cond_1e

    const/16 v5, 0x1e

    sput v5, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    const-string v5, "\u06e4\u06e5\u06e0"

    invoke-static {v5}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v25, v5

    goto/16 :goto_0

    :cond_1e
    const-string v5, "\u06e7\u06e2\u06e2"

    goto/16 :goto_c

    :sswitch_28
    sget-object v2, Lvh;->n:Lvh;

    goto/16 :goto_e

    :sswitch_29
    const/high16 v5, 0x41f00000    # 30.0f

    invoke-virtual {v4, v5}, Landroid/view/View;->setElevation(F)V

    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    sget v6, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    xor-int/lit16 v6, v6, -0x30e

    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setGravity(I)V

    sget v6, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    if-ltz v6, :cond_1f

    const/16 v6, 0x2c

    sput v6, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    const-string v6, "\u06e3\u06e2\u06e1"

    invoke-static {v6}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v23, v5

    move/from16 v25, v6

    goto/16 :goto_0

    :cond_1f
    sget v6, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v7, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    mul-int/2addr v6, v7

    const v7, 0x19d88a

    add-int/2addr v6, v7

    move-object/from16 v23, v5

    move/from16 v25, v6

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcba -> :sswitch_0
        0xdcfc -> :sswitch_6
        0x1aa706 -> :sswitch_23
        0x1aa77f -> :sswitch_1
        0x1aa79c -> :sswitch_c
        0x1aa7a1 -> :sswitch_2
        0x1aa7df -> :sswitch_20
        0x1aab23 -> :sswitch_18
        0x1aabdd -> :sswitch_13
        0x1aabdf -> :sswitch_22
        0x1aaea8 -> :sswitch_12
        0x1aaf1d -> :sswitch_5
        0x1aaf9c -> :sswitch_24
        0x1ab245 -> :sswitch_1b
        0x1ab2a1 -> :sswitch_e
        0x1ab2e1 -> :sswitch_19
        0x1ab323 -> :sswitch_f
        0x1ab646 -> :sswitch_1e
        0x1ab662 -> :sswitch_d
        0x1ab6e5 -> :sswitch_16
        0x1ab702 -> :sswitch_16
        0x1aba03 -> :sswitch_7
        0x1aba24 -> :sswitch_15
        0x1aba28 -> :sswitch_9
        0x1aba7f -> :sswitch_27
        0x1ababf -> :sswitch_28
        0x1abd8b -> :sswitch_10
        0x1abe60 -> :sswitch_11
        0x1abe61 -> :sswitch_1d
        0x1abe67 -> :sswitch_1f
        0x1ac16e -> :sswitch_29
        0x1ac189 -> :sswitch_4
        0x1ac1c9 -> :sswitch_26
        0x1ac1e2 -> :sswitch_1c
        0x1ac201 -> :sswitch_16
        0x1ac52a -> :sswitch_26
        0x1ac54d -> :sswitch_3
        0x1ac567 -> :sswitch_21
        0x1ac5a9 -> :sswitch_1a
        0x1ac601 -> :sswitch_17
        0x1ac907 -> :sswitch_a
        0x1ac927 -> :sswitch_25
        0x1ac92a -> :sswitch_b
        0x1ac96a -> :sswitch_14
        0x1ac9a1 -> :sswitch_8
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
