.class public final synthetic La30;
.super Ljava/lang/Object;

# interfaces
.implements Lhm;


# instance fields
.field public final a:I

.field public final b:Landroid/app/Activity;

.field public final c:Lon;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lon;I)V
    .locals 3

    iput p3, p0, La30;->a:I

    iput-object p1, p0, La30;->b:Landroid/app/Activity;

    iput-object p2, p0, La30;->c:Lon;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e8\u06e3\u06df"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "vO9LpzxfU13qHGlu345oY0ouq"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۣۧۨۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget v1, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    add-int/lit16 v2, v2, 0xac2

    add-int/2addr v1, v2

    if-gtz v1, :cond_0

    const/16 v1, 0x4a

    sput v1, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    :cond_0
    const-string v1, "\u06e5\u06e6\u06e2"

    :goto_1
    invoke-static {v1}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string v1, "\u06e7\u06e8\u06e7"

    goto :goto_1

    :sswitch_2
    sget v1, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v2, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    rem-int/2addr v1, v2

    const v2, -0x1ac856

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    move-result v1

    if-gtz v1, :cond_2

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    move-result v1

    if-ltz v1, :cond_1

    const/16 v1, 0xb

    sput v1, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    const-string v1, "\u06e8\u06e3\u06df"

    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e0\u06e8\u06e4"

    goto :goto_1

    :cond_2
    :sswitch_4
    sget v1, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v2, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    add-int/lit16 v2, v2, 0x126f

    add-int/2addr v1, v2

    if-gtz v1, :cond_3

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    const-string v1, "\u06e5\u06e3\u06e3"

    invoke-static {v1}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    sget v1, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v2, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    xor-int/2addr v1, v2

    const v2, 0x1ac4cf

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aabdc -> :sswitch_0
        0x1aba60 -> :sswitch_2
        0x1abe61 -> :sswitch_1
        0x1ac626 -> :sswitch_5
        0x1ac8ee -> :sswitch_4
        0x1ac944 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 65

    const/16 v37, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/4 v2, 0x0

    const/16 v48, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v38, 0x0

    const/4 v14, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v40, 0x0

    const/16 v47, 0x0

    const/16 v46, 0x0

    const/16 v45, 0x0

    const/16 v39, 0x0

    const/16 v25, 0x0

    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v12, 0x0

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/16 v31, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v41, 0x0

    const/4 v15, 0x0

    const/16 v42, 0x0

    const/16 v44, 0x0

    const/16 v43, 0x0

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v17, 0x0

    const/4 v8, 0x0

    const/16 v50, 0x0

    const/16 v49, 0x0

    const/16 v27, 0x0

    const/16 v26, 0x0

    const/4 v10, 0x0

    const/16 v19, 0x0

    const/4 v9, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/4 v13, 0x0

    const/16 v20, 0x0

    const/16 v16, 0x0

    const-string v24, "\u06e6\u06e2\u06e0"

    invoke-static/range {v24 .. v24}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v24

    move-object/from16 v51, v5

    move-object/from16 v52, v11

    move-object/from16 v53, v12

    move-object/from16 v54, v13

    move-object/from16 v55, v14

    move-object/from16 v56, v15

    move-object/from16 v57, v16

    move-object/from16 v58, v17

    move-object/from16 v59, v18

    move-object/from16 v60, v19

    move-object/from16 v61, v20

    move-object/from16 v62, v21

    move-object/from16 v63, v22

    move/from16 v64, v23

    :goto_0
    sparse-switch v24, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v5, Lg6;

    sget v11, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    xor-int/lit8 v11, v11, 0x21

    move-object/from16 v0, v41

    invoke-direct {v5, v11, v0}, Lg6;-><init>(ILjava/lang/Object;)V

    move-object/from16 v0, v31

    invoke-virtual {v0, v5}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    const/4 v5, 0x1

    move-object/from16 v0, v31

    invoke-virtual {v0, v5}, Landroid/view/View;->setClipToOutline(Z)V

    new-instance v5, Landroid/widget/ScrollView;

    move-object/from16 v0, v53

    invoke-direct {v5, v0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v12, -0x1

    const/4 v13, 0x0

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v11, v12, v13, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v5, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v11, 0x0

    invoke-virtual {v5, v11}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    const/4 v11, 0x2

    invoke-virtual {v5, v11}, Landroid/view/View;->setOverScrollMode(I)V

    const/4 v11, 0x0

    invoke-virtual {v5, v11}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    new-instance v11, Lw6;

    const/4 v12, 0x1

    invoke-direct {v11, v12}, Lw6;-><init>(I)V

    invoke-virtual {v5, v11}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    sget v11, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v12, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    xor-int/2addr v11, v12

    const v12, 0x1ab453

    add-int/2addr v11, v12

    move-object/from16 v56, v5

    move/from16 v24, v11

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    move-result v5

    if-gtz v5, :cond_0

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۦۤۨۢ()I

    const-string v5, "\u06e8\u06df\u06e6"

    :goto_1
    invoke-static {v5}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto :goto_0

    :cond_0
    sget v5, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v11, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    xor-int/2addr v5, v11

    const v11, 0x1aadc2

    add-int/2addr v5, v11

    move/from16 v24, v5

    goto :goto_0

    :sswitch_2
    const/16 v5, 0x18

    invoke-static {v5}, Lff;->q(I)I

    move-result v5

    const/16 v11, 0x10

    invoke-static {v11}, Lff;->q(I)I

    move-result v11

    const/16 v12, 0x18

    invoke-static {v12}, Lff;->q(I)I

    move-result v12

    const/16 v13, 0x18

    invoke-static {v13}, Lff;->q(I)I

    move-result v13

    move-object/from16 v0, v54

    invoke-virtual {v0, v5, v11, v12, v13}, Landroid/view/View;->setPadding(IIII)V

    new-instance v11, Landroid/widget/TextView;

    invoke-direct {v11, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v5, "r4SSNJv1bQDHzaN8\n"

    const-string v12, "Sioe0hNlhIU=\n"

    const/high16 v13, 0x41600000    # 14.0f

    const/4 v14, -0x1

    invoke-static {v5, v12, v11, v13, v14}, Lz30;->n(Ljava/lang/String;Ljava/lang/String;Landroid/widget/TextView;FI)V

    const/4 v5, 0x1

    move-object/from16 v0, v29

    invoke-virtual {v11, v0, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    sget v5, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    xor-int/lit16 v5, v5, 0x16d

    invoke-virtual {v11, v5}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget v12, v10, Lon;->g:I

    invoke-virtual {v5, v12}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v12, 0x42c80000    # 100.0f

    invoke-static {v12}, Lff;->p(F)F

    move-result v12

    invoke-virtual {v5, v12}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    sget v12, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v13, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    add-int/lit16 v13, v13, -0x3e7

    xor-int/2addr v12, v13

    if-gtz v12, :cond_1

    const-string v12, "\u06e6\u06e5\u06e7"

    invoke-static {v12}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v57, v5

    move-object/from16 v61, v11

    move/from16 v24, v12

    goto/16 :goto_0

    :cond_1
    sget v12, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v13, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    mul-int/2addr v12, v13

    const v13, 0x10b039

    xor-int/2addr v12, v13

    move-object/from16 v57, v5

    move-object/from16 v61, v11

    move/from16 v24, v12

    goto/16 :goto_0

    :pswitch_0
    :sswitch_3
    const-string v12, "\u06e6\u06e5\u06e7"

    move-object/from16 v5, v26

    move-object/from16 v11, v27

    :goto_2
    invoke-static {v12}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v26, v5

    move-object/from16 v27, v11

    move/from16 v24, v12

    goto/16 :goto_0

    :pswitch_1
    :sswitch_4
    sget v5, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v11, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    add-int/lit16 v11, v11, 0xc0e

    sub-int/2addr v5, v11

    if-ltz v5, :cond_2

    const/16 v5, 0x54

    sput v5, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    const-string v5, "\u06e5\u06e6\u06e0"

    :goto_3
    invoke-static {v5}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto/16 :goto_0

    :cond_2
    const-string v5, "\u06e7\u06e5\u06e3"

    invoke-static {v5}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto/16 :goto_0

    :sswitch_5
    packed-switch v37, :pswitch_data_0

    :sswitch_6
    sget v5, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v11, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    div-int/lit16 v11, v11, 0x21ae

    mul-int/2addr v5, v11

    if-eqz v5, :cond_1f

    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    const-string v5, "\u06e1\u06e6\u06df"

    invoke-static {v5}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto/16 :goto_0

    :cond_3
    const-string v13, "\u06e0\u06df\u06e8"

    invoke-static {v13}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v58, v5

    move-object/from16 v59, v11

    move-object/from16 v63, v12

    move/from16 v24, v13

    goto/16 :goto_0

    :sswitch_7
    new-instance v11, Landroid/widget/LinearLayout;

    invoke-direct {v11, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x1

    invoke-virtual {v11, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v10, -0x1

    sget v12, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    xor-int/lit16 v12, v12, -0x1e4

    invoke-direct {v5, v10, v12}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v10, 0x11

    iput v10, v5, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    const/16 v10, 0x18

    invoke-static {v10}, Lff;->q(I)I

    move-result v10

    const/16 v12, 0x28

    invoke-static {v12}, Lff;->q(I)I

    move-result v12

    const/16 v13, 0x18

    invoke-static {v13}, Lff;->q(I)I

    move-result v13

    const/16 v14, 0x28

    invoke-static {v14}, Lff;->q(I)I

    move-result v14

    invoke-virtual {v5, v10, v12, v13, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v11, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    move-object/from16 v0, p0

    iget-object v10, v0, La30;->c:Lon;

    const-string v12, "\u06e1\u06e1"

    goto/16 :goto_2

    :sswitch_8
    new-instance v5, Landroid/widget/LinearLayout;

    move-object/from16 v0, v53

    invoke-direct {v5, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v11, 0x1

    invoke-virtual {v5, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-static/range {v32 .. v32}, Lff;->q(I)I

    move-result v11

    const/16 v12, 0x20

    invoke-static {v12}, Lff;->q(I)I

    move-result v12

    invoke-static/range {v32 .. v32}, Lff;->q(I)I

    move-result v13

    const/16 v14, 0x10

    invoke-static {v14}, Lff;->q(I)I

    move-result v14

    invoke-virtual {v5, v11, v12, v13, v14}, Landroid/view/View;->setPadding(IIII)V

    new-instance v12, Landroid/widget/TextView;

    move-object/from16 v0, v53

    invoke-direct {v12, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v11, "qCdTMTHvRm/TS0ZcROYgNNoeE1Msjh98\n"

    const-string v13, "T6761qFpotI=\n"

    invoke-static {v11, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v12, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v11, 0x41b00000    # 22.0f

    invoke-virtual {v12, v11}, Landroid/widget/TextView;->setTextSize(F)V

    move-object/from16 v0, v41

    iget v11, v0, Lon;->e:I

    invoke-virtual {v12, v11}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object v11, Lmn;->a:Landroid/graphics/Typeface;

    sget v13, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v14, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    div-int/lit16 v14, v14, -0x386

    mul-int/2addr v13, v14

    if-eqz v13, :cond_4

    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    const-string v13, "\u06e8\u06e5\u06e6"

    invoke-static {v13}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v42, v5

    move-object/from16 v43, v11

    move-object/from16 v44, v12

    move/from16 v24, v13

    goto/16 :goto_0

    :cond_4
    const-string v13, "\u06e0\u06e6\u06e8"

    :goto_4
    invoke-static {v13}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v42, v5

    move-object/from16 v43, v11

    move-object/from16 v44, v12

    move/from16 v24, v13

    goto/16 :goto_0

    :sswitch_9
    sget v5, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v11, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    add-int/lit16 v11, v11, -0x1db4

    add-int/2addr v5, v11

    if-ltz v5, :cond_5

    const-string v5, "\u06df\u06e6\u06e0"

    invoke-static {v5}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto/16 :goto_0

    :cond_5
    sget v5, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v11, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    div-int/2addr v5, v11

    const v11, 0x1aab25

    add-int/2addr v5, v11

    move/from16 v24, v5

    goto/16 :goto_0

    :cond_6
    :sswitch_a
    sget v5, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v11, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    mul-int/lit16 v11, v11, 0x1bc8

    rem-int/2addr v5, v11

    if-gtz v5, :cond_7

    const-string v5, "\u06e5\u06e5\u06e5"

    :goto_5
    invoke-static {v5}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u06df\u06e6\u06e0"

    invoke-static {v5}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto/16 :goto_0

    :sswitch_b
    const-string v2, "Gm6K\n"

    const-string v5, "ew3+B5kBtb8=\n"

    invoke-static {v2, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v13, v0, La30;->b:Landroid/app/Activity;

    invoke-static {v2, v13}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "kX+7vn8=\n"

    const-string v5, "5Rfe0xq3pq8=\n"

    invoke-static {v2, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget-object v2, Lgn;->a:Lgn;

    const-string v5, "EgErdedKezwmAj1G5EpsCBAAIQ==\n"

    const-string v11, "eWRSKoAvHlc=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, ""

    invoke-static {v5, v2}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v14, "\u06e5\u06e3\u06e0"

    move-object v5, v2

    move-object/from16 v11, v49

    move-object/from16 v12, v50

    :goto_6
    invoke-static {v14}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v48, v5

    move-object/from16 v49, v11

    move-object/from16 v50, v12

    move-object v2, v13

    move/from16 v24, v14

    goto/16 :goto_0

    :pswitch_2
    :sswitch_c
    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    move-result v5

    if-ltz v5, :cond_8

    const-string v13, "\u06e7\u06e4\u06e6"

    move-object/from16 v5, v28

    move-object/from16 v11, v29

    move-object v12, v9

    :goto_7
    invoke-static {v13}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v28, v5

    move-object/from16 v29, v11

    move-object v9, v12

    move/from16 v24, v13

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06e7\u06e8\u06e2"

    :goto_8
    invoke-static {v5}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto/16 :goto_0

    :sswitch_d
    new-instance v5, Ljava/util/ArrayList;

    move-object/from16 v0, v34

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v12

    const/16 v40, 0x0

    const-string v13, "\u06e3\u06df\u06df"

    invoke-static {v13}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v55, v5

    move-object/from16 v62, v11

    move/from16 v64, v12

    move/from16 v24, v13

    goto/16 :goto_0

    :sswitch_e
    move-object/from16 v0, v52

    move-object/from16 v1, v51

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    new-instance v5, Lb6;

    const/4 v11, 0x2

    move-object/from16 v0, v52

    move-object/from16 v1, v31

    invoke-direct {v5, v11, v0, v1}, Lb6;-><init>(ILandroid/app/Dialog;Landroid/widget/LinearLayout;)V

    move-object/from16 v0, v52

    invoke-virtual {v0, v5}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    invoke-virtual/range {v52 .. v52}, Landroid/app/Dialog;->show()V

    const-string v5, "\u06e0\u06e7\u06e8"

    goto/16 :goto_3

    :sswitch_f
    const-string v5, "btS47zmYQeoFroSNTJ4Snyzx\n"

    const-string v11, "iEgSCqglpHo=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v46 .. v46}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v0, v45

    invoke-static {v0, v5}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, v62

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    if-gtz v5, :cond_9

    const-string v5, "\u06e7\u06e6\u06e1"

    invoke-static {v5}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    move/from16 v39, v47

    goto/16 :goto_0

    :cond_9
    sget v5, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v11, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sub-int/2addr v5, v11

    const v11, 0x1ac555

    add-int/2addr v5, v11

    move/from16 v24, v5

    move/from16 v39, v47

    goto/16 :goto_0

    :sswitch_10
    sget v5, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v11, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    mul-int/lit16 v11, v11, -0x1ed6

    rem-int/2addr v5, v11

    if-gtz v5, :cond_a

    const-string v12, "\u06e5\u06e0\u06e0"

    move-object/from16 v5, v30

    move-object/from16 v11, v31

    move/from16 v13, v32

    :goto_9
    invoke-static {v12}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v30, v5

    move-object/from16 v31, v11

    move/from16 v32, v13

    move/from16 v24, v12

    goto/16 :goto_0

    :cond_a
    sget v5, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v11, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    add-int/2addr v5, v11

    const v11, 0x1abcdf

    add-int/2addr v5, v11

    move/from16 v24, v5

    goto/16 :goto_0

    :sswitch_11
    sget v5, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    xor-int/lit8 v5, v5, -0x49

    invoke-static/range {v2 .. v7}, Lmn;->c(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILon;Lsm;)V

    sget v5, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    if-gtz v5, :cond_b

    const/16 v5, 0x15

    sput v5, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    const-string v5, "\u06e7\u06e5\u06e3"

    invoke-static {v5}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto/16 :goto_0

    :cond_b
    sget v5, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v11, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sub-int/2addr v5, v11

    const v11, 0x1abcfb

    xor-int/2addr v5, v11

    move/from16 v24, v5

    goto/16 :goto_0

    :sswitch_12
    sget-object v2, Lvh;->n:Lvh;

    return-object v2

    :sswitch_13
    const-string v5, "/Q==\n"

    const-string v11, "0WOEj8yhnXM=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v11, 0x1

    new-array v11, v11, [Ljava/lang/String;

    sget v12, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    xor-int/lit16 v12, v12, 0x15a

    aput-object v5, v11, v12

    move-object/from16 v0, v48

    invoke-static {v0, v11}, Lb50;->M(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    sget v12, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v13, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    xor-int/lit16 v13, v13, 0x8bd

    rem-int/2addr v12, v13

    if-ltz v12, :cond_c

    const/16 v12, 0x62

    sput v12, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    :cond_c
    const-string v12, "\u06e1\u06e2\u06e0"

    :goto_a
    invoke-static {v12}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v33, v5

    move-object/from16 v34, v11

    move/from16 v24, v12

    goto/16 :goto_0

    :sswitch_14
    const/high16 v5, 0x42c80000    # 100.0f

    invoke-static {v5}, Lff;->p(F)F

    move-result v5

    move-object/from16 v0, v58

    invoke-virtual {v0, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    move-object/from16 v0, v59

    move-object/from16 v1, v58

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v11, -0x1

    const/16 v12, 0x2c

    invoke-static {v12}, Lff;->q(I)I

    move-result v12

    invoke-direct {v5, v11, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    move-object/from16 v0, v59

    invoke-virtual {v0, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Lu6;

    sget v11, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    xor-int/lit16 v11, v11, -0x190

    move-object/from16 v0, v52

    invoke-direct {v5, v0, v11}, Lu6;-><init>(Landroid/app/Dialog;I)V

    move-object/from16 v0, v59

    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    move-object/from16 v0, v59

    move-object/from16 v1, v41

    invoke-static {v0, v1}, Lxn;->c(Landroid/view/View;Lon;)V

    move-object/from16 v0, v63

    move-object/from16 v1, v59

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v31

    move-object/from16 v1, v63

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v51

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget v5, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v11, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    add-int/lit16 v11, v11, 0xfed

    div-int/2addr v5, v11

    if-eqz v5, :cond_d

    const-string v12, "\u06e1\u06e6\u06e3"

    move-object/from16 v5, v35

    move-object/from16 v11, v36

    move/from16 v13, v37

    :goto_b
    invoke-static {v12}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v35, v5

    move-object/from16 v36, v11

    move/from16 v37, v13

    move/from16 v24, v12

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u06e1\u06e2\u06e5"

    :goto_c
    invoke-static {v5}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto/16 :goto_0

    :sswitch_15
    new-instance v5, Lg6;

    const/4 v11, 0x1

    invoke-direct {v5, v11, v10}, Lg6;-><init>(ILjava/lang/Object;)V

    move-object/from16 v0, v27

    invoke-virtual {v0, v5}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    const/4 v5, 0x1

    move-object/from16 v0, v27

    invoke-virtual {v0, v5}, Landroid/view/View;->setClipToOutline(Z)V

    new-instance v5, Landroid/widget/ScrollView;

    invoke-direct {v5, v8}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v12, -0x1

    const/4 v13, 0x0

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v11, v12, v13, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v5, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v11, 0x0

    invoke-virtual {v5, v11}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    const/4 v11, 0x2

    invoke-virtual {v5, v11}, Landroid/view/View;->setOverScrollMode(I)V

    const/4 v11, 0x0

    invoke-virtual {v5, v11}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    new-instance v11, Lw6;

    const/4 v12, 0x0

    invoke-direct {v11, v12}, Lw6;-><init>(I)V

    invoke-virtual {v5, v11}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    sget v11, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v12, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    or-int/2addr v11, v12

    const v12, 0x1ab17d

    add-int/2addr v11, v12

    move-object/from16 v60, v5

    move/from16 v24, v11

    goto/16 :goto_0

    :sswitch_16
    sget-object v5, Lxc;->a:[I

    const/4 v5, 0x1

    const-string v11, "sBLhF/GTuj63HvMt3Z+lALgc9CHxiQ==\n"

    const-string v12, "23eYSIL9yWE=\n"

    invoke-static {v11, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "O2bvhykj3NZbAu3LeS25jFFx\n"

    const-string v13, "3ORWb5y9NGk=\n"

    invoke-static {v12, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v0, v36

    move-object/from16 v1, v35

    invoke-static {v0, v1, v5, v11, v12}, Lxc;->a(Landroid/app/Activity;Lon;ILjava/lang/String;Ljava/lang/String;)V

    sget v5, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v11, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    div-int/lit16 v11, v11, -0x1caf

    xor-int/2addr v5, v11

    if-gtz v5, :cond_29

    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    const-string v5, "\u06e5\u06e7\u06e1"

    invoke-static {v5}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto/16 :goto_0

    :sswitch_17
    const/high16 v5, 0x41f00000    # 30.0f

    invoke-static {v5}, Lff;->p(F)F

    move-result v5

    move-object/from16 v0, v27

    invoke-virtual {v0, v5}, Landroid/view/View;->setElevation(F)V

    sget v5, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    if-ltz v5, :cond_e

    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    const-string v5, "\u06df\u06df\u06df"

    invoke-static {v5}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto/16 :goto_0

    :cond_e
    const-string v14, "\u06e7\u06e0\u06e7"

    move-object/from16 v5, v48

    move-object/from16 v11, v49

    move-object/from16 v12, v50

    move-object v13, v2

    goto/16 :goto_6

    :sswitch_18
    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    move-result v5

    if-gtz v5, :cond_f

    const/4 v5, 0x3

    sput v5, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    const-string v5, "\u06e3\u06e0\u06e3"

    :goto_d
    invoke-static {v5}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto/16 :goto_0

    :cond_f
    const-string v5, "\u06e5\u06e4\u06e6"

    invoke-static {v5}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto/16 :goto_0

    :sswitch_19
    move-object/from16 v0, p0

    iget v13, v0, La30;->a:I

    move-object/from16 v0, p0

    iget-object v5, v0, La30;->c:Lon;

    move-object/from16 v0, p0

    iget-object v11, v0, La30;->b:Landroid/app/Activity;

    sget v12, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v14, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    add-int/lit16 v14, v14, -0x10f

    xor-int/2addr v12, v14

    if-gtz v12, :cond_10

    invoke-static {}, Landroid/app/۠ۨۥۨ;->ۣۣ۟ۨۧ()I

    const-string v12, "\u06e5\u06e7"

    invoke-static {v12}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v35, v5

    move-object/from16 v36, v11

    move/from16 v37, v13

    move/from16 v24, v12

    goto/16 :goto_0

    :cond_10
    const-string v12, "\u06e3\u06e2\u06e2"

    goto/16 :goto_b

    :sswitch_1a
    invoke-interface/range {v33 .. v33}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    move-result v11

    if-gtz v11, :cond_11

    const-string v11, "\u06e3\u06e1\u06e7"

    :goto_e
    invoke-static {v11}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v11

    move-object/from16 v38, v5

    move/from16 v24, v11

    goto/16 :goto_0

    :cond_11
    sget v11, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v12, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sub-int/2addr v11, v12

    const v12, 0x1aa347

    add-int/2addr v11, v12

    move-object/from16 v38, v5

    move/from16 v24, v11

    goto/16 :goto_0

    :sswitch_1b
    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/String;

    move-object/from16 v0, v62

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    const-string v11, "YOrdaG0JODo5zqDPIXomRWbNwa4dGGxkNJHs8Q==\n"

    const-string v12, "gnRISIufiN8=\n"

    invoke-static {v11, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x1

    new-array v12, v12, [Ljava/lang/String;

    sget v13, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    xor-int/lit16 v13, v13, 0x267

    aput-object v11, v12, v13

    const-string v11, "<this>"

    invoke-static {v11, v5}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v11, v5

    sget v13, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    xor-int/lit16 v13, v13, -0xf1

    add-int/2addr v13, v11

    invoke-static {v5, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v25

    const/4 v5, 0x0

    const/4 v13, 0x1

    move-object/from16 v0, v25

    invoke-static {v12, v5, v0, v11, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    move-result v5

    if-ltz v5, :cond_12

    const/16 v5, 0x2d

    sput v5, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    const-string v5, "\u06e8\u06e2\u06e2"

    invoke-static {v5}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto/16 :goto_0

    :cond_12
    move/from16 v5, v39

    :goto_f
    const-string v11, "\u06e8\u06e2\u06e6"

    invoke-static {v11}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v11

    move/from16 v24, v11

    move/from16 v39, v5

    goto/16 :goto_0

    :sswitch_1c
    sget v5, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    if-gtz v5, :cond_13

    move/from16 v5, v40

    goto :goto_f

    :cond_13
    sget v5, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v11, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    add-int/2addr v5, v11

    const v11, 0x1ac440

    xor-int/2addr v5, v11

    move/from16 v24, v5

    move/from16 v39, v40

    goto/16 :goto_0

    :sswitch_1d
    const-string v5, "\u06df\u06e7\u06e1"

    move-object v12, v9

    move-object v11, v5

    :goto_10
    invoke-static {v11}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v5

    move-object v9, v12

    move/from16 v24, v5

    goto/16 :goto_0

    :sswitch_1e
    new-instance v5, Lb6;

    const/4 v11, 0x1

    move-object/from16 v0, v50

    move-object/from16 v1, v27

    invoke-direct {v5, v11, v0, v1}, Lb6;-><init>(ILandroid/app/Dialog;Landroid/widget/LinearLayout;)V

    move-object/from16 v0, v50

    invoke-virtual {v0, v5}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    invoke-virtual/range {v50 .. v50}, Landroid/app/Dialog;->show()V

    sget v5, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    if-ltz v5, :cond_14

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    const-string v5, "\u06e2\u06e8\u06e6"

    invoke-static {v5}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto/16 :goto_0

    :cond_14
    const-string v12, "\u06e8\u06e2\u06e2"

    move-object/from16 v5, v33

    move-object/from16 v11, v34

    goto/16 :goto_a

    :sswitch_1f
    move-object/from16 v0, v31

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v11, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v11}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    move-object/from16 v0, p0

    iget-object v5, v0, La30;->c:Lon;

    iget v12, v5, Lon;->c:I

    invoke-virtual {v11, v12}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    iget v12, v5, Lon;->j:F

    invoke-virtual {v11, v12}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    move-object/from16 v0, v31

    invoke-virtual {v0, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v11, 0x1

    move-object/from16 v0, v31

    invoke-virtual {v0, v11}, Landroid/view/View;->setClickable(Z)V

    iget-boolean v11, v5, Lon;->l:Z

    if-eqz v11, :cond_15

    const-string v11, "\u06e5\u06e4\u06e3"

    invoke-static {v11}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v11

    move-object/from16 v41, v5

    move/from16 v24, v11

    goto/16 :goto_0

    :sswitch_20
    iget v5, v10, Lon;->c:I

    move-object/from16 v0, v26

    invoke-virtual {v0, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    iget v5, v10, Lon;->j:F

    move-object/from16 v0, v26

    invoke-virtual {v0, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    move-object/from16 v0, v27

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v5, 0x1

    move-object/from16 v0, v27

    invoke-virtual {v0, v5}, Landroid/view/View;->setClickable(Z)V

    iget-boolean v5, v10, Lon;->l:Z

    if-eqz v5, :cond_1b

    const-string v11, "\u06e3\u06e3\u06e4"

    move-object/from16 v5, v38

    goto/16 :goto_e

    :sswitch_21
    move-object/from16 v5, v41

    :cond_15
    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    move-result v11

    if-ltz v11, :cond_16

    const-string v11, "\u06e2\u06e8\u06e2"

    invoke-static {v11}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v11

    move-object/from16 v41, v5

    move/from16 v24, v11

    goto/16 :goto_0

    :cond_16
    sget v11, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v12, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    div-int/2addr v11, v12

    const v12, 0xdc07

    xor-int/2addr v11, v12

    move-object/from16 v41, v5

    move/from16 v24, v11

    goto/16 :goto_0

    :sswitch_22
    sget v5, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    xor-int/lit16 v12, v5, 0x107

    new-instance v5, Lu6;

    sget v11, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    xor-int/lit16 v11, v11, -0x335

    move-object/from16 v0, v52

    invoke-direct {v5, v0, v11}, Lu6;-><init>(Landroid/app/Dialog;I)V

    move-object/from16 v0, v51

    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v11, Landroid/widget/LinearLayout;

    move-object/from16 v0, v53

    invoke-direct {v11, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x1

    invoke-virtual {v11, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v13, -0x1

    const/4 v14, -0x2

    invoke-direct {v5, v13, v14}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v13, 0x11

    iput v13, v5, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    sget v13, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    xor-int/lit8 v13, v13, -0x12

    invoke-static {v13}, Lff;->q(I)I

    move-result v14

    invoke-static {v12}, Lff;->q(I)I

    move-result v15

    invoke-static {v13}, Lff;->q(I)I

    move-result v16

    invoke-static {v12}, Lff;->q(I)I

    move-result v12

    move/from16 v0, v16

    invoke-virtual {v5, v14, v15, v0, v12}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    sget v12, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    if-ltz v12, :cond_17

    const-string v12, "\u06e5\u06e4\u06e3"

    invoke-static {v12}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v30, v5

    move-object/from16 v31, v11

    move/from16 v32, v13

    move/from16 v24, v12

    goto/16 :goto_0

    :cond_17
    const-string v12, "\u06e5\u06e0\u06e0"

    goto/16 :goto_9

    :sswitch_23
    invoke-interface/range {v38 .. v38}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface/range {v38 .. v38}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v5, v11

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Lb50;->H(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_22

    move-object/from16 v0, v34

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget v5, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    if-gtz v5, :cond_18

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    const-string v5, "\u06e0\u06e6\u06e8"

    invoke-static {v5}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto/16 :goto_0

    :cond_18
    const-string v5, "\u06e8\u06df\u06e6"

    goto/16 :goto_d

    :sswitch_24
    const-string v5, "Zfgi\n"

    const-string v11, "i1WJEossD+w=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v5, "3AiBXtUsh1qHRrMVshLv\n"

    const-string v12, "NK8nu1q9Yt8=\n"

    invoke-static {v5, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v5, "SvDYl/TLIxB+58S4+ccIFETs1qfn2g==\n"

    const-string v13, "IZWhyJW+V38=\n"

    invoke-static {v5, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x1

    const-string v5, "naMmia7Pa/L14CjF/+UUuPewWeWQjBnJ\n"

    const-string v15, "eAe8bRZlg10=\n"

    invoke-static {v5, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v5, "q+8mNZVKUn7z02t1uA==\n"

    const-string v16, "TnOO0AXdfpo=\n"

    move-object/from16 v0, v16

    invoke-static {v5, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1c00

    invoke-static/range {v8 .. v21}, Lxn;->b(Landroid/app/Activity;Landroid/widget/LinearLayout;Lon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLsm;Lhm;Lsm;I)Landroid/widget/LinearLayout;

    const-string v5, "vXWL\n"

    const-string v11, "U8orE9MUiLA=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v5, "Uyeio83v/lw7R4LHvPuCFSAl9+vR\n"

    const-string v12, "tqIRSllBFvM=\n"

    invoke-static {v5, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v5, "C51647nAj1s/imbMtMykXwWBdNOq0aRABYB3\n"

    const-string v13, "YPgDvNi1+zQ=\n"

    invoke-static {v5, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x1

    const/4 v15, 0x0

    const-string v5, "mLWF9vqcOBvD+7e9naJQdve4xpnd6EYAlbau\n"

    const-string v16, "cBIjE3UN3Z4=\n"

    move-object/from16 v0, v16

    invoke-static {v5, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1c00

    invoke-static/range {v8 .. v21}, Lxn;->b(Landroid/app/Activity;Landroid/widget/LinearLayout;Lon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLsm;Lhm;Lsm;I)Landroid/widget/LinearLayout;

    const-string v5, "CtI8\n"

    const-string v11, "5GSJ5XlKXvo=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v5, "01He97LtuBinCsuBE08cgNF89/qJ83U=\n"

    const-string v12, "NO96HzNnXKA=\n"

    invoke-static {v5, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v5, "3w592BjCYA3rGWH3Fc5LA8A=\n"

    const-string v13, "tGsEh3m3FGI=\n"

    invoke-static {v5, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x0

    const-string v5, "EpE/iH1tGHdSwjvnCWdU6bYKXPpXLVhvE6UrhWZvGkNezyHzBGFy\n"

    const-string v15, "9iq6beHF/8k=\n"

    invoke-static {v5, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v16, ""

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1c00

    invoke-static/range {v8 .. v21}, Lxn;->b(Landroid/app/Activity;Landroid/widget/LinearLayout;Lon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLsm;Lhm;Lsm;I)Landroid/widget/LinearLayout;

    const-string v5, "eJDB\n"

    const-string v11, "lwNpfiXXbpI=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v5, "RNIv+Z3ACpgCsTqwByKr\n"

    const-string v12, "rFWFESdr7yY=\n"

    invoke-static {v5, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v5, "8f4D9CX5ejfi8h4=\n"

    const-string v13, "mpt6q0iAJUA=\n"

    invoke-static {v5, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x1

    const-string v5, "5SkBZixzDoKmWAcYf2B17KI6TAUQFWK05TQQZCB1DYut\n"

    const-string v15, "Ar2pgpb96wo=\n"

    invoke-static {v5, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v16, ""

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1c00

    invoke-static/range {v8 .. v21}, Lxn;->b(Landroid/app/Activity;Landroid/widget/LinearLayout;Lon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLsm;Lhm;Lsm;I)Landroid/widget/LinearLayout;

    const-string v5, "Bz2U\n"

    const-string v11, "6YI0SoaPFgY=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v5, "2N0CiHN4ukGK609eEQ2WLA==\n"

    const-string v12, "MH+pyJbrN6Q=\n"

    invoke-static {v5, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v5, "xJqN4mMm1JPwjZHNbir/iMqHgA==\n"

    const-string v13, "r//0vQJToPw=\n"

    invoke-static {v5, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x1

    const/4 v15, 0x0

    const-string v5, "+G8bz1rn\n"

    const-string v16, "HvutKtJXRXk=\n"

    move-object/from16 v0, v16

    invoke-static {v5, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1c00

    invoke-static/range {v8 .. v21}, Lxn;->b(Landroid/app/Activity;Landroid/widget/LinearLayout;Lon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLsm;Lhm;Lsm;I)Landroid/widget/LinearLayout;

    move-object/from16 v0, v60

    invoke-virtual {v0, v9}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    move-object/from16 v0, v27

    move-object/from16 v1, v60

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    sget v11, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v12, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    or-int/2addr v11, v12

    const v12, 0x1abbf0

    add-int/2addr v11, v12

    move-object/from16 v54, v5

    move/from16 v24, v11

    goto/16 :goto_0

    :sswitch_25
    const-string v5, "KCm4\n"

    const-string v11, "xpYYh1XO7e8=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v5, "x0YKAikkfnWbFzlXibJwXZIUAXeA\n"

    const-string v11, "IvGs56mamfc=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v5, "fpnc2ViLoVVKkMDgSA==\n"

    const-string v11, "FfylhjziwjA=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    const/16 v17, 0x1

    const-string v5, "MYgz2Gc0grz0AIDZWxpLGm3ROrkEBBJodKE=\n"

    const-string v11, "2TagPeKRoo0=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    const-string v5, "RQ==\n"

    const-string v11, "dLWO01GLPT4=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x1c00

    move-object/from16 v11, v53

    move-object/from16 v12, v42

    move-object/from16 v13, v41

    invoke-static/range {v11 .. v24}, Lxn;->b(Landroid/app/Activity;Landroid/widget/LinearLayout;Lon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLsm;Lhm;Lsm;I)Landroid/widget/LinearLayout;

    const-string v5, "s9vs\n"

    const-string v11, "XWRM5y69w3k=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v5, "IMCJSEjT5oJ8qa8d6EXoqnWqlz3h\n"

    const-string v11, "xU86rchtAQA=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v5, "u5FfqUEE4TOPhk+RTRk=\n"

    const-string v11, "0PQm9iVtglY=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    const/16 v17, 0x1

    const-string v5, "rJexood/oAlpHwKju1Fpr/DOuMPkTzDd6b4=\n"

    const-string v11, "RCkiRwLagDg=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    const-string v5, "XA==\n"

    const-string v11, "atkVvH6kNok=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x1c00

    move-object/from16 v11, v53

    move-object/from16 v12, v42

    move-object/from16 v13, v41

    invoke-static/range {v11 .. v24}, Lxn;->b(Landroid/app/Activity;Landroid/widget/LinearLayout;Lon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLsm;Lhm;Lsm;I)Landroid/widget/LinearLayout;

    const-string v5, "aoYr\n"

    const-string v11, "hDmLzUiRh7s=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v5, "yQTLsU5ZMW+VW+3n+s8/R5xY1cfz\n"

    const-string v11, "LL14V9rn1u0=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v5, "6iRciqaZ1pjeJ0m0tg==\n"

    const-string v11, "gUEl1cLwtf0=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    const/16 v17, 0x1

    const-string v5, "tk6tC/Ody9lzxh4Kz7MCf+oXpGqQrVsN82c=\n"

    const-string v11, "XvA+7nY46+g=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    const-string v5, "AQ==\n"

    const-string v11, "MsHfub+zBcY=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x1c00

    move-object/from16 v11, v53

    move-object/from16 v12, v42

    move-object/from16 v13, v41

    invoke-static/range {v11 .. v24}, Lxn;->b(Landroid/app/Activity;Landroid/widget/LinearLayout;Lon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLsm;Lhm;Lsm;I)Landroid/widget/LinearLayout;

    const-string v5, "I0Ft\n"

    const-string v11, "zf7NzSaSigg=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v5, "2mF9z5mj89+MM2aIOTXy2KMwUJkw\n"

    const-string v11, "P9bbKhkdFVQ=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v5, "KC2tmdRyAJYvLbKy\n"

    const-string v11, "Q0jUxqYCc8k=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    const/16 v17, 0x1

    const-string v5, "NPpI0SX0704l9ZC/EKKCarHnnmVqqeQ=\n"

    const-string v11, "BcetWI8RZ84=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    const-string v5, "HA==\n"

    const-string v11, "LcdLbTtV8j8=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x1c00

    move-object/from16 v11, v53

    move-object/from16 v12, v42

    move-object/from16 v13, v41

    invoke-static/range {v11 .. v24}, Lxn;->b(Landroid/app/Activity;Landroid/widget/LinearLayout;Lon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLsm;Lhm;Lsm;I)Landroid/widget/LinearLayout;

    const-string v5, "B6Yk\n"

    const-string v11, "6RmExLToHRo=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v5, "35I8snQR2NiJ+DL11IfZ36b7BOTd\n"

    const-string v11, "Oh2PV/SvPlM=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v5, "4VgixVUoyuD4VDzyUw==\n"

    const-string v11, "ij1bmidYub8=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    const/16 v17, 0x1

    const-string v5, "Vxq2+iVWEvNGFW6UEAB/19IHYE5qCxk=\n"

    const-string v11, "ZidTc4+zmnM=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    const-string v5, "+w==\n"

    const-string v11, "yD9EMRLt7P4=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x1c00

    move-object/from16 v11, v53

    move-object/from16 v12, v42

    move-object/from16 v13, v41

    invoke-static/range {v11 .. v24}, Lxn;->b(Landroid/app/Activity;Landroid/widget/LinearLayout;Lon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLsm;Lhm;Lsm;I)Landroid/widget/LinearLayout;

    const-string v5, "x8gH\n"

    const-string v11, "KXenkcQCDRk=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v5, "KWZAJKwwS1l/Ok5gGKZKXlA5eHER\n"

    const-string v11, "zN/zwjiOrdI=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v5, "9zbB9zAwNxL6P9nc\n"

    const-string v11, "nFO4qEJARE0=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    const/16 v17, 0x1

    const-string v5, "nFEG2f4BxMONXt63y1ep5xlM0G2xXM8=\n"

    const-string v11, "rWzjUFTkTEM=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    const-string v5, "hg==\n"

    const-string v11, "tPzXm84oiPI=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x1c00

    move-object/from16 v11, v53

    move-object/from16 v12, v42

    move-object/from16 v13, v41

    invoke-static/range {v11 .. v24}, Lxn;->b(Landroid/app/Activity;Landroid/widget/LinearLayout;Lon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLsm;Lhm;Lsm;I)Landroid/widget/LinearLayout;

    move-object/from16 v0, v56

    move-object/from16 v1, v42

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    move-object/from16 v0, v31

    move-object/from16 v1, v56

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget v5, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v11, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    div-int/2addr v5, v11

    const v11, 0x1ac510

    add-int/2addr v5, v11

    move/from16 v24, v5

    goto/16 :goto_0

    :sswitch_26
    invoke-static/range {v25 .. v25}, Lip;->l(Ljava/lang/Object;)V

    move-object/from16 v12, v25

    check-cast v12, [Ljava/lang/String;

    sget-object v3, Lmn;->a:Landroid/graphics/Typeface;

    const-string v3, "o8G+6C5j6qPOirumWHOFxv/Z+qsH\n"

    const-string v4, "RG8fD77lAiI=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, p0

    iget-object v14, v0, La30;->c:Lon;

    new-instance v11, Lhn;

    const/16 v17, 0x0

    move-object v13, v2

    move-object/from16 v15, v55

    move-object/from16 v16, v62

    invoke-direct/range {v11 .. v17}, Lhn;-><init>(Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;Ljava/io/Serializable;I)V

    sget v3, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v4, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    add-int/lit16 v4, v4, 0x606

    sub-int/2addr v3, v4

    if-ltz v3, :cond_19

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    const-string v3, "\u06df\u06e7\u06e1"

    :goto_11
    invoke-static {v3}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v13

    move-object v6, v14

    move-object v7, v11

    move-object v3, v5

    move-object v4, v12

    move/from16 v24, v13

    goto/16 :goto_0

    :cond_19
    const-string v3, "\u06e1\u06e6\u06e3"

    goto :goto_11

    :sswitch_27
    sget v5, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    if-gtz v5, :cond_1a

    const/4 v5, 0x1

    sput v5, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    const-string v13, "\u06e8\u06e8\u06e4"

    move-object/from16 v5, v42

    move-object/from16 v11, v43

    move-object/from16 v12, v44

    goto/16 :goto_4

    :cond_1a
    const-string v13, "\u06e6\u06e2\u06e0"

    move-object/from16 v5, v42

    move-object/from16 v11, v43

    move-object/from16 v12, v44

    goto/16 :goto_4

    :cond_1b
    :sswitch_28
    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    move-result v5

    if-gtz v5, :cond_1c

    const/16 v5, 0x9

    sput v5, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    const-string v5, "\u06e7\u06e1\u06e0"

    invoke-static {v5}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto/16 :goto_0

    :cond_1c
    const-string v5, "\u06e7\u06e0\u06e7"

    goto/16 :goto_5

    :sswitch_29
    sget v5, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    if-gtz v5, :cond_1d

    const/16 v5, 0x2a

    sput v5, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    const-string v5, "\u06e1\u06df\u06e3"

    invoke-static {v5}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto/16 :goto_0

    :cond_1d
    const-string v5, "\u06e7\u06e2\u06e4"

    goto/16 :goto_5

    :sswitch_2a
    sget-object v5, Lxc;->a:[I

    const/4 v5, 0x0

    const-string v11, "yDpHVOydXbjaAFxn4YtVv8osSg==\n"

    const-string v12, "o18+C4DoPtM=\n"

    invoke-static {v11, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "RaAGqG9AfTob8hXsC3ofcxm+\n"

    const-string v13, "ohqkTePFmJU=\n"

    invoke-static {v12, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v0, v36

    move-object/from16 v1, v35

    invoke-static {v0, v1, v5, v11, v12}, Lxc;->a(Landroid/app/Activity;Lon;ILjava/lang/String;Ljava/lang/String;)V

    sget v5, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v11, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    or-int/lit16 v11, v11, -0x1291

    div-int/2addr v5, v11

    if-eqz v5, :cond_1e

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    const-string v5, "\u06e5\u06e4\u06e6"

    invoke-static {v5}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto/16 :goto_0

    :cond_1e
    const-string v5, "\u06e5\u06e6\u06e3"

    goto/16 :goto_1

    :cond_1f
    sget v5, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v11, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    or-int/2addr v5, v11

    const v11, 0x1acb7c

    add-int/2addr v5, v11

    move/from16 v24, v5

    goto/16 :goto_0

    :sswitch_2b
    new-instance v12, Landroid/widget/LinearLayout;

    invoke-direct {v12, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x1

    invoke-virtual {v12, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v5, 0x18

    invoke-static {v5}, Lff;->q(I)I

    move-result v5

    const/16 v9, 0x20

    invoke-static {v9}, Lff;->q(I)I

    move-result v9

    const/16 v11, 0x18

    invoke-static {v11}, Lff;->q(I)I

    move-result v11

    const/16 v13, 0x10

    invoke-static {v13}, Lff;->q(I)I

    move-result v13

    invoke-virtual {v12, v5, v9, v11, v13}, Landroid/view/View;->setPadding(IIII)V

    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v9, "bGH+OslhgWISMNh9oUvqDDd5\n"

    const-string v11, "itd23EjOZ+s=\n"

    invoke-static {v9, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v9, 0x41b00000    # 22.0f

    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setTextSize(F)V

    iget v9, v10, Lon;->e:I

    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object v9, Lmn;->a:Landroid/graphics/Typeface;

    sget v11, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v13, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    xor-int/lit16 v13, v13, 0x23d

    xor-int/2addr v11, v13

    if-ltz v11, :cond_20

    const-string v11, "\u06e3\u06e2\u06e2"

    move-object/from16 v28, v5

    move-object/from16 v29, v9

    goto/16 :goto_10

    :cond_20
    const-string v13, "\u06e7\u06e6\u06e1"

    move-object v11, v9

    goto/16 :goto_7

    :sswitch_2c
    const/high16 v5, 0x41f00000    # 30.0f

    invoke-static {v5}, Lff;->p(F)F

    move-result v5

    move-object/from16 v0, v31

    invoke-virtual {v0, v5}, Landroid/view/View;->setElevation(F)V

    sget v5, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    if-ltz v5, :cond_21

    const-string v5, "\u06e0\u06e0\u06e7"

    invoke-static {v5}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto/16 :goto_0

    :cond_21
    sget v5, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v11, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    div-int/2addr v5, v11

    const v11, 0xdc08

    add-int/2addr v5, v11

    move/from16 v24, v5

    goto/16 :goto_0

    :cond_22
    :sswitch_2d
    sget v5, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v11, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    or-int/lit16 v11, v11, -0x9b6

    sub-int/2addr v5, v11

    if-gtz v5, :cond_23

    const/16 v5, 0x14

    sput v5, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    const-string v12, "\u06df\u06e5\u06e7"

    move-object/from16 v5, v45

    move-object/from16 v11, v46

    move/from16 v13, v47

    :goto_12
    invoke-static {v12}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v45, v5

    move-object/from16 v46, v11

    move/from16 v47, v13

    move/from16 v24, v12

    goto/16 :goto_0

    :cond_23
    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v11, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    or-int/2addr v5, v11

    const v11, -0x1aa486

    xor-int/2addr v5, v11

    move/from16 v24, v5

    goto/16 :goto_0

    :sswitch_2e
    sget-object v5, Lmn;->a:Landroid/graphics/Typeface;

    const-string v5, "t7UM\n"

    const-string v11, "1tZ4JZnTLJI=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, p0

    iget-object v12, v0, La30;->b:Landroid/app/Activity;

    invoke-static {v5, v12}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v5, "SdtQ4XE=\n"

    const-string v11, "PbM1jBSjgVc=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    new-instance v11, Landroid/app/Dialog;

    const v5, 0x1030010

    invoke-direct {v11, v12, v5}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    new-instance v5, Landroid/widget/FrameLayout;

    invoke-direct {v5, v12}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v13, Landroid/view/ViewGroup$LayoutParams;

    const/4 v14, -0x1

    const/4 v15, -0x1

    invoke-direct {v13, v14, v15}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v5, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget v13, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v14, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    div-int/lit16 v14, v14, 0x1b12

    mul-int/2addr v13, v14

    if-eqz v13, :cond_24

    const-string v13, "\u06e5\u06e0\u06e7"

    invoke-static {v13}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v51, v5

    move-object/from16 v52, v11

    move-object/from16 v53, v12

    move/from16 v24, v13

    goto/16 :goto_0

    :cond_24
    sget v13, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v14, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sub-int/2addr v13, v14

    const v14, 0x1aa5b2

    xor-int/2addr v13, v14

    move-object/from16 v51, v5

    move-object/from16 v52, v11

    move-object/from16 v53, v12

    move/from16 v24, v13

    goto/16 :goto_0

    :sswitch_2f
    const/4 v5, 0x1

    move-object/from16 v0, v28

    move-object/from16 v1, v29

    invoke-virtual {v0, v1, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    sget v5, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    xor-int/lit16 v5, v5, -0xd8

    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v11, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v5, 0x18

    invoke-static {v5}, Lff;->q(I)I

    move-result v5

    iput v5, v11, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    move-object/from16 v0, v28

    invoke-virtual {v0, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    move-object/from16 v0, v28

    invoke-virtual {v9, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v5, Lxn;->a:Landroid/graphics/Typeface;

    const-string v5, "vnpn\n"

    const-string v11, "UfHQBJv4hsE=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v5, "ww9dIynqwlOrYklsWMu7\n"

    const-string v12, "Joruyr1EKvw=\n"

    invoke-static {v5, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v5, "ojnBol+xSaWWLt2NUr1ioawlz5JMoGKlpw==\n"

    const-string v13, "yVy4/T7EPco=\n"

    invoke-static {v5, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x0

    const-string v5, "EsIhm6SVuKdPnzLH/IrY7WbSQ/eg4/OSE/wXl42otad7nzPI/J3D7VL0\n"

    const-string v15, "9nmkfhkGXQg=\n"

    invoke-static {v5, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v16, ""

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1c00

    invoke-static/range {v8 .. v21}, Lxn;->b(Landroid/app/Activity;Landroid/widget/LinearLayout;Lon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLsm;Lhm;Lsm;I)Landroid/widget/LinearLayout;

    sget v5, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v11, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    xor-int/lit16 v11, v11, -0x1dab

    xor-int/2addr v5, v11

    if-gtz v5, :cond_25

    const-string v5, "\u06e7\u06e8\u06e2"

    invoke-static {v5}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto/16 :goto_0

    :cond_25
    const-string v12, "\u06e0\u06e0\u06e7"

    move-object/from16 v5, v30

    move-object/from16 v11, v31

    move/from16 v13, v32

    goto/16 :goto_9

    :sswitch_30
    new-instance v12, Landroid/widget/LinearLayout;

    move-object/from16 v0, v53

    invoke-direct {v12, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-static/range {v32 .. v32}, Lff;->q(I)I

    move-result v5

    const/16 v11, 0x10

    invoke-static {v11}, Lff;->q(I)I

    move-result v11

    invoke-static/range {v32 .. v32}, Lff;->q(I)I

    move-result v13

    invoke-static/range {v32 .. v32}, Lff;->q(I)I

    move-result v14

    invoke-virtual {v12, v5, v11, v13, v14}, Landroid/view/View;->setPadding(IIII)V

    new-instance v11, Landroid/widget/TextView;

    move-object/from16 v0, v53

    invoke-direct {v11, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v5, "icQhUkaAD6LSjRAa\n"

    const-string v13, "bGqttM4Q5ww=\n"

    const/high16 v14, 0x41600000    # 14.0f

    const/4 v15, -0x1

    invoke-static {v5, v13, v11, v14, v15}, Lz30;->n(Ljava/lang/String;Ljava/lang/String;Landroid/widget/TextView;FI)V

    const/4 v5, 0x1

    move-object/from16 v0, v43

    invoke-virtual {v11, v0, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    sget v5, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    xor-int/lit8 v5, v5, 0x59

    invoke-virtual {v11, v5}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    move-object/from16 v0, v41

    iget v13, v0, Lon;->g:I

    invoke-virtual {v5, v13}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    sget v13, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    if-ltz v13, :cond_3

    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    const-string v13, "\u06e3\u06e4\u06e8"

    invoke-static {v13}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v58, v5

    move-object/from16 v59, v11

    move-object/from16 v63, v12

    move/from16 v24, v13

    goto/16 :goto_0

    :sswitch_31
    sget v5, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    if-gtz v5, :cond_26

    invoke-static {}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->۟ۡۨۢ()I

    const-string v5, "\u06e0\u06e7\u06e8"

    invoke-static {v5}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto/16 :goto_0

    :cond_26
    sget v5, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v11, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    xor-int/2addr v5, v11

    const v11, 0xdde2

    add-int/2addr v5, v11

    move/from16 v24, v5

    goto/16 :goto_0

    :sswitch_32
    const-string v5, "bAsr\n"

    const-string v8, "DWhfqa3LOes=\n"

    invoke-static {v5, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, p0

    iget-object v8, v0, La30;->b:Landroid/app/Activity;

    invoke-static {v5, v8}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v5, "E+0NrPU=\n"

    const-string v11, "Z4VowZA64LQ=\n"

    invoke-static {v5, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    new-instance v50, Landroid/app/Dialog;

    const v5, 0x1030010

    move-object/from16 v0, v50

    invoke-direct {v0, v8, v5}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    new-instance v49, Landroid/widget/FrameLayout;

    move-object/from16 v0, v49

    invoke-direct {v0, v8}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v5, Landroid/view/ViewGroup$LayoutParams;

    const/4 v11, -0x1

    const/4 v12, -0x1

    invoke-direct {v5, v11, v12}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    move-object/from16 v0, v49

    invoke-virtual {v0, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Lu6;

    const/4 v11, 0x0

    move-object/from16 v0, v50

    invoke-direct {v5, v0, v11}, Lu6;-><init>(Landroid/app/Dialog;I)V

    move-object/from16 v0, v49

    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v5, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v11, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    add-int/lit16 v11, v11, -0x25c9

    div-int/2addr v5, v11

    if-eqz v5, :cond_27

    const/16 v5, 0x28

    sput v5, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    move-object/from16 v11, v49

    move-object/from16 v12, v50

    :goto_13
    const-string v14, "\u06e1\u06e3\u06e8"

    move-object/from16 v5, v48

    move-object v13, v2

    goto/16 :goto_6

    :cond_27
    const-string v5, "\u06e1\u06e0\u06e7"

    goto/16 :goto_c

    :sswitch_33
    const/4 v5, 0x1

    move-object/from16 v0, v44

    move-object/from16 v1, v43

    invoke-virtual {v0, v1, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    sget v5, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    xor-int/lit16 v5, v5, 0xfc

    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v11, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static/range {v32 .. v32}, Lff;->q(I)I

    move-result v5

    iput v5, v11, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    move-object/from16 v0, v44

    invoke-virtual {v0, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v5, 0x3d4ccccd    # 0.05f

    move-object/from16 v0, v44

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setLetterSpacing(F)V

    move-object/from16 v0, v42

    move-object/from16 v1, v44

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v5, Lxn;->a:Landroid/graphics/Typeface;

    sget v5, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    if-ltz v5, :cond_28

    invoke-static {}, Landroidx/versionedparcelable/ۣۢۥ;->ۦۦۡۤ()I

    const-string v5, "\u06e3\u06e4\u06e4"

    invoke-static {v5}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto/16 :goto_0

    :cond_28
    sget v5, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v11, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    div-int/2addr v5, v11

    const v11, 0xdc40

    add-int/2addr v5, v11

    move/from16 v24, v5

    goto/16 :goto_0

    :sswitch_34
    move/from16 v0, v39

    move/from16 v1, v64

    if-ge v0, v1, :cond_2c

    move-object/from16 v0, v55

    move/from16 v1, v39

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    sget v11, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    xor-int/lit8 v11, v11, 0x5c

    add-int v13, v39, v11

    check-cast v5, Ljava/lang/String;

    sget-object v11, Lgn;->a:Lgn;

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v14, "key_geek_folder_name_"

    invoke-direct {v12, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    sget v12, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    if-gtz v12, :cond_2a

    const/16 v12, 0x30

    sput v12, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    move-object/from16 v45, v5

    move-object/from16 v46, v11

    move/from16 v47, v13

    :cond_29
    const-string v5, "\u06e2\u06e3\u06e6"

    invoke-static {v5}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto/16 :goto_0

    :cond_2a
    const-string v12, "\u06e4\u06e8\u06e5"

    goto/16 :goto_12

    :sswitch_35
    sget v5, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v11, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    div-int/lit16 v11, v11, 0x1a1f

    xor-int/2addr v5, v11

    if-ltz v5, :cond_2b

    invoke-static {}, Landroid/app/۠ۨۥۨ;->ۣۣ۟ۨۧ()I

    const-string v5, "\u06e1\u06e2\u06e5"

    goto/16 :goto_c

    :cond_2b
    sget v5, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v11, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    add-int/2addr v5, v11

    const v11, 0x1acc0a

    xor-int/2addr v5, v11

    move/from16 v24, v5

    goto/16 :goto_0

    :cond_2c
    :sswitch_36
    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    move-result v5

    if-ltz v5, :cond_2d

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    const-string v12, "\u06e5\u06e1\u06e2"

    move-object/from16 v5, v26

    move-object/from16 v11, v27

    goto/16 :goto_2

    :cond_2d
    sget v5, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v11, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    mul-int/2addr v5, v11

    const v11, 0x1efb52

    add-int/2addr v5, v11

    move/from16 v24, v5

    goto/16 :goto_0

    :pswitch_3
    :sswitch_37
    sget v5, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v11, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    add-int/lit16 v11, v11, 0x7ca

    mul-int/2addr v5, v11

    if-ltz v5, :cond_2e

    invoke-static {}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۦۧۢ۟()I

    const-string v5, "\u06df\u06e2"

    goto/16 :goto_8

    :cond_2e
    const-string v5, "\u06e5\u06e1"

    invoke-static {v5}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v5

    move/from16 v24, v5

    goto/16 :goto_0

    :sswitch_38
    move-object/from16 v0, v61

    move-object/from16 v1, v57

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v11, -0x1

    const/16 v12, 0x2c

    invoke-static {v12}, Lff;->q(I)I

    move-result v12

    invoke-direct {v5, v11, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    move-object/from16 v0, v61

    invoke-virtual {v0, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Lv6;

    const/4 v11, 0x0

    move-object/from16 v0, v61

    move-object/from16 v1, v50

    invoke-direct {v5, v0, v1, v11}, Lv6;-><init>(Landroid/widget/TextView;Landroid/app/Dialog;I)V

    move-object/from16 v0, v61

    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    move-object/from16 v0, v61

    invoke-static {v0, v10}, Lxn;->c(Landroid/view/View;Lon;)V

    move-object/from16 v0, v54

    move-object/from16 v1, v61

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v27

    move-object/from16 v1, v54

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v49

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v50

    move-object/from16 v1, v49

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    move-object/from16 v11, v49

    move-object/from16 v12, v50

    goto/16 :goto_13

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc06 -> :sswitch_0
        0xdc20 -> :sswitch_20
        0xdc40 -> :sswitch_25
        0xdc9c -> :sswitch_2e
        0xdca2 -> :sswitch_18
        0xdcc2 -> :sswitch_18
        0x1aa6ff -> :sswitch_22
        0x1aa707 -> :sswitch_23
        0x1aa71e -> :sswitch_4
        0x1aa7d9 -> :sswitch_d
        0x1aa7f9 -> :sswitch_18
        0x1aaac2 -> :sswitch_21
        0x1aaac9 -> :sswitch_14
        0x1aaae7 -> :sswitch_24
        0x1aab24 -> :sswitch_28
        0x1aab25 -> :sswitch_38
        0x1aab26 -> :sswitch_29
        0x1aab61 -> :sswitch_18
        0x1aaba2 -> :sswitch_33
        0x1aabc1 -> :sswitch_31
        0x1aae88 -> :sswitch_3
        0x1aaea8 -> :sswitch_7
        0x1aaedf -> :sswitch_1a
        0x1aaee4 -> :sswitch_e
        0x1aaf06 -> :sswitch_1e
        0x1aaf5b -> :sswitch_2b
        0x1aaf5e -> :sswitch_11
        0x1ab264 -> :sswitch_27
        0x1ab283 -> :sswitch_a
        0x1ab2c5 -> :sswitch_35
        0x1ab360 -> :sswitch_36
        0x1ab603 -> :sswitch_1c
        0x1ab60a -> :sswitch_6
        0x1ab649 -> :sswitch_c
        0x1ab663 -> :sswitch_5
        0x1ab684 -> :sswitch_17
        0x1ab6a3 -> :sswitch_1b
        0x1ab6a7 -> :sswitch_8
        0x1aba28 -> :sswitch_2d
        0x1abaa1 -> :sswitch_29
        0x1abadc -> :sswitch_37
        0x1abae1 -> :sswitch_f
        0x1abda5 -> :sswitch_1f
        0x1abdac -> :sswitch_2d
        0x1abe02 -> :sswitch_13
        0x1abe24 -> :sswitch_2c
        0x1abe27 -> :sswitch_12
        0x1abe62 -> :sswitch_1d
        0x1abe7f -> :sswitch_2
        0x1ac1a4 -> :sswitch_19
        0x1ac208 -> :sswitch_32
        0x1ac50f -> :sswitch_30
        0x1ac52e -> :sswitch_15
        0x1ac569 -> :sswitch_34
        0x1ac5c5 -> :sswitch_2a
        0x1ac5e2 -> :sswitch_2f
        0x1ac621 -> :sswitch_16
        0x1ac8cf -> :sswitch_10
        0x1ac906 -> :sswitch_18
        0x1ac928 -> :sswitch_1
        0x1ac92c -> :sswitch_26
        0x1ac989 -> :sswitch_b
        0x1ac9e0 -> :sswitch_9
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method
