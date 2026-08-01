.class public final Lz20;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lz20;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "\u06e2\u06e7\u06df"

    invoke-static {v0}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    sget v0, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    mul-int/lit16 v1, v1, -0x2329

    sub-int/2addr v0, v1

    if-gtz v0, :cond_0

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    const-string v0, "\u06df\u06e4\u06e6"

    invoke-static {v0}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v1, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    xor-int/2addr v0, v1

    const v1, 0x1ab5d5

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    const-string v0, "mf1yIYbAH5yt/mcRlNwZhZXHbhCB2hGFkf0=\n"

    const-string v1, "8pgLfvWocOs=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "\u06e4\u06e0"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_3
    new-instance v0, Lz20;

    invoke-direct {v0}, Lz20;-><init>()V

    sput-object v0, Lz20;->a:Lz20;

    sget v0, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    if-gtz v0, :cond_1

    const-string v0, "\u06e2\u06e7\u06df"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v1, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    add-int/2addr v0, v1

    const v1, 0xe03b

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdc7b -> :sswitch_0
        0xdc7c -> :sswitch_3
        0x1ab33a -> :sswitch_2
        0x1ab684 -> :sswitch_1
    .end sparse-switch
.end method

.method public static a(Landroid/app/Activity;)V
    .locals 48

    const-string v4, "RarX\n"

    const-string v5, "JMmjVY0KLbg=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p0

    invoke-static {v4, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v4, Lkn;->a:Lkn;

    const-string v5, "+rIrdSA2FV3Ouj1OIQ==\n"

    const-string v6, "kddSKkRXZzY=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x0

    invoke-static {v5, v4}, Lkn;->b(Ljava/lang/String;I)I

    move-result v4

    const/4 v5, 0x1

    if-eq v4, v5, :cond_6

    const/4 v5, 0x2

    if-eq v4, v5, :cond_0

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1d

    if-lt v4, v5, :cond_6

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    iget v4, v4, Landroid/content/res/Configuration;->uiMode:I

    xor-int/lit8 v5, v4, -0x31

    and-int/2addr v4, v5

    const/16 v5, 0x20

    if-ne v4, v5, :cond_6

    :cond_0
    const/16 v20, 0x1

    :goto_0
    const-string v4, "jpiQRT213euEhIZvPIPx85yRjA==\n"

    const-string v5, "5f3pGkjcgoc=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lkn;->b(Ljava/lang/String;I)I

    move-result v4

    const/4 v5, 0x1

    if-lt v4, v5, :cond_7

    const/4 v4, 0x1

    :goto_1
    sget-object v5, Ltn;->a:[Ljava/lang/String;

    const-string v5, "3DY02aJ5zA==\n"

    const-string v6, "v1larccBuOo=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const/4 v5, 0x1

    if-lt v4, v5, :cond_8

    const/4 v5, 0x1

    :goto_2
    const-string v4, "cLkC6zE3H/x0sSTVMSEJ5m+DGNs+LR4=\n"

    const-string v6, "G9x7tFJCbIg=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "7A5kHnUBmw==\n"

    const-string v7, "zz5UX0FH3U8=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    :try_start_0
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v4

    :goto_3
    const-string v6, "HB9w6Fkoe+MaE2roXj557QU=\n"

    const-string v7, "d3oJtz1RFYI=\n"

    sget-object v8, Lkn;->a:Lkn;

    invoke-static {v6, v7, v8}, Lg40;->q(Ljava/lang/String;Ljava/lang/String;Lkn;)Z

    move-result v6

    if-eqz v6, :cond_29

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1f

    if-lt v6, v7, :cond_29

    :try_start_1
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x106003e

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v4

    move v6, v4

    :goto_4
    sget-object v4, Lkn;->a:Lkn;

    const-string v7, "kFDg8Uksgh6kXPrBVDc=\n"

    const-string v8, "+zWZrjpE7Wk=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x1

    invoke-static {v7, v4}, Lkn;->a(Ljava/lang/String;Z)Z

    move-result v18

    const-string v4, "0nEBglDppvzmYBGzTdWo8dpxFqk=\n"

    const-string v7, "uRR43TmKyZI=\n"

    invoke-static {v4, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x0

    invoke-static {v4, v7}, Lkn;->a(Ljava/lang/String;Z)Z

    move-result v19

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "_"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v0, v20

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v7, "_"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "_"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v0, v18

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v7, "_"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v0, v19

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    sget-object v22, Ltn;->b:Ljava/util/concurrent/ConcurrentHashMap;

    move-object/from16 v0, v22

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lsn;

    if-eqz v4, :cond_9

    move-object v5, v4

    :goto_5
    iget v0, v5, Lsn;->g:I

    move/from16 v16, v0

    iget v4, v5, Lsn;->f:I

    iget-boolean v0, v5, Lsn;->p:Z

    move/from16 v32, v0

    iget v15, v5, Lsn;->c:I

    iget v0, v5, Lsn;->a:I

    move/from16 v17, v0

    new-instance v33, Landroid/app/Dialog;

    const v6, 0x1030010

    move-object/from16 v0, v33

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v6}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    new-instance v34, Landroid/widget/FrameLayout;

    move-object/from16 v0, v34

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v6, Landroid/view/ViewGroup$LayoutParams;

    const/4 v7, -0x1

    const/4 v8, -0x1

    invoke-direct {v6, v7, v8}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    move-object/from16 v0, v34

    invoke-virtual {v0, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v6, 0x0

    move-object/from16 v0, v34

    invoke-virtual {v0, v6}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v6, Le7;

    const/16 v7, 0xe

    move-object/from16 v0, v33

    invoke-direct {v6, v0, v7}, Le7;-><init>(Landroid/app/Dialog;I)V

    move-object/from16 v0, v34

    invoke-virtual {v0, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-double v6, v6

    const-wide v8, 0x3fee666666666666L    # 0.95

    mul-double/2addr v6, v8

    double-to-int v0, v6

    move/from16 v35, v0

    const/4 v6, 0x1

    move-object/from16 v0, p0

    invoke-static {v0, v6}, Lg40;->g(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    move-result-object v36

    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v7, -0x1

    move/from16 v0, v35

    invoke-direct {v6, v7, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v7, 0x50

    iput v7, v6, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    move-object/from16 v0, v36

    invoke-virtual {v0, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v6, 0x1

    move-object/from16 v0, v36

    invoke-virtual {v0, v6}, Landroid/view/View;->setClickable(Z)V

    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget v7, v5, Lsn;->b:I

    invoke-virtual {v6, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    iget v7, v5, Lsn;->j:F

    const/16 v8, 0x8

    new-array v8, v8, [F

    const/4 v9, 0x0

    aput v7, v8, v9

    const/4 v9, 0x1

    aput v7, v8, v9

    const/4 v9, 0x2

    aput v7, v8, v9

    const/4 v9, 0x3

    aput v7, v8, v9

    const/4 v7, 0x4

    const/4 v9, 0x0

    aput v9, v8, v7

    const/4 v7, 0x5

    const/4 v9, 0x0

    aput v9, v8, v7

    const/4 v7, 0x6

    const/4 v9, 0x0

    aput v9, v8, v7

    const/4 v7, 0x7

    const/4 v9, 0x0

    aput v9, v8, v7

    invoke-virtual {v6, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    move-object/from16 v0, v36

    invoke-virtual {v0, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget v18, Landroid/os/Build$VERSION;->SDK_INT:I

    new-instance v6, Lg6;

    const/4 v7, 0x6

    invoke-direct {v6, v7, v5}, Lg6;-><init>(ILjava/lang/Object;)V

    move-object/from16 v0, v36

    invoke-virtual {v0, v6}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    const/4 v6, 0x1

    move-object/from16 v0, v36

    invoke-virtual {v0, v6}, Landroid/view/View;->setClipToOutline(Z)V

    new-instance v6, Landroid/widget/FrameLayout;

    move-object/from16 v0, p0

    invoke-direct {v6, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v8, -0x1

    const/4 v9, -0x2

    invoke-direct {v7, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v7, Landroid/view/View;

    move-object/from16 v0, p0

    invoke-direct {v7, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v8, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v9, 0x24

    invoke-static {v9}, Lmp;->q(I)I

    move-result v9

    const/4 v10, 0x5

    invoke-static {v10}, Lmp;->q(I)I

    move-result v10

    invoke-direct {v8, v9, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v9, 0x11

    iput v9, v8, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    const/16 v9, 0x10

    invoke-static {v9}, Lmp;->q(I)I

    move-result v9

    iput v9, v8, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    const/16 v9, 0x10

    invoke-static {v9}, Lmp;->q(I)I

    move-result v9

    iput v9, v8, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v7, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v8, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 v9, 0x50

    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setAlpha(I)V

    const/high16 v9, 0x41200000    # 10.0f

    invoke-static {v9}, Lmp;->p(F)F

    move-result v9

    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v7, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v36

    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v7, Ly20;

    move/from16 v0, v35

    move-object/from16 v1, v33

    move-object/from16 v2, v36

    invoke-direct {v7, v0, v1, v2}, Ly20;-><init>(ILandroid/app/Dialog;Landroid/widget/LinearLayout;)V

    invoke-virtual {v6, v7}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    new-instance v6, Landroid/widget/FrameLayout;

    move-object/from16 v0, p0

    invoke-direct {v6, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/16 v7, 0x18

    invoke-static {v7}, Lmp;->q(I)I

    move-result v7

    const/4 v8, 0x0

    invoke-static {v8}, Lmp;->q(I)I

    move-result v8

    const/16 v9, 0x18

    invoke-static {v9}, Lmp;->q(I)I

    move-result v9

    const/16 v10, 0x14

    invoke-static {v10}, Lmp;->q(I)I

    move-result v10

    invoke-virtual {v6, v7, v8, v9, v10}, Landroid/view/View;->setPadding(IIII)V

    new-instance v7, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v7, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v8, "wt2F2Q==\n"

    const-string v9, "hbjgsgZUJjo=\n"

    const/high16 v10, 0x41a00000    # 20.0f

    move/from16 v0, v16

    invoke-static {v8, v9, v7, v10, v0}, Lg40;->n(Ljava/lang/String;Ljava/lang/String;Landroid/widget/TextView;FI)V

    sget-object v8, Lqn;->a:Landroid/graphics/Typeface;

    const/4 v9, 0x3

    invoke-virtual {v7, v8, v9}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    const/16 v8, 0x14

    invoke-static {v8}, Lmp;->q(I)I

    move-result v8

    const/16 v9, 0x8

    invoke-static {v9}, Lmp;->q(I)I

    move-result v9

    const/16 v10, 0x14

    invoke-static {v10}, Lmp;->q(I)I

    move-result v10

    const/16 v11, 0x8

    invoke-static {v11}, Lmp;->q(I)I

    move-result v11

    invoke-virtual {v7, v8, v9, v10, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v8, v15}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v9, 0x42c80000    # 100.0f

    invoke-static {v9}, Lmp;->p(F)F

    move-result v9

    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v7, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v8, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v9, -0x2

    const/4 v10, -0x2

    invoke-direct {v8, v9, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const v9, 0x800013

    iput v9, v8, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {v7, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v8, Lf7;

    const/4 v9, 0x1

    move-object/from16 v0, v33

    invoke-direct {v8, v7, v0, v9}, Lf7;-><init>(Landroid/widget/TextView;Landroid/app/Dialog;I)V

    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v7, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v7, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v8, "Vwzv\n"

    const-string v9, "uItZbjc828c=\n"

    const/high16 v10, 0x41a00000    # 20.0f

    invoke-static {v8, v9, v7, v10, v4}, Lg40;->n(Ljava/lang/String;Ljava/lang/String;Landroid/widget/TextView;FI)V

    sget-object v4, Lbo;->a:Landroid/graphics/Typeface;

    sget-object v4, Lbo;->a:Landroid/graphics/Typeface;

    if-eqz v4, :cond_1

    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_1
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v4, v15}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/4 v8, 0x1

    invoke-virtual {v4, v8}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    invoke-virtual {v7, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/16 v4, 0x11

    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v8, 0x28

    invoke-static {v8}, Lmp;->q(I)I

    move-result v8

    const/16 v9, 0x28

    invoke-static {v9}, Lmp;->q(I)I

    move-result v9

    invoke-direct {v4, v8, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const v8, 0x800015

    iput v8, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {v7, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v4, Ly5;

    const/4 v8, 0x6

    move-object/from16 v0, p0

    invoke-direct {v4, v0, v8, v5}, Ly5;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v7, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-static {v7, v5}, Lbo;->c(Landroid/view/View;Lsn;)V

    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v36

    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v14, Landroid/widget/FrameLayout;

    move-object/from16 v0, p0

    invoke-direct {v14, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-direct {v4, v6, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v14, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    if-nez v17, :cond_1e

    const/16 v4, 0x78

    invoke-static {v4}, Lmp;->q(I)I

    move-result v4

    :goto_6
    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lz20;->b(Landroid/app/Activity;I)Landroid/widget/ScrollView;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lz20;->b(Landroid/app/Activity;I)Landroid/widget/ScrollView;

    move-result-object v7

    const/16 v8, 0x8

    invoke-virtual {v7, v8}, Landroid/view/View;->setVisibility(I)V

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lz20;->b(Landroid/app/Activity;I)Landroid/widget/ScrollView;

    move-result-object v8

    const/16 v9, 0x8

    invoke-virtual {v8, v9}, Landroid/view/View;->setVisibility(I)V

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lz20;->b(Landroid/app/Activity;I)Landroid/widget/ScrollView;

    move-result-object v9

    const/16 v4, 0x8

    invoke-virtual {v9, v4}, Landroid/view/View;->setVisibility(I)V

    const/4 v4, 0x1

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lg40;->g(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    move-result-object v10

    const/4 v4, 0x0

    const/16 v11, 0x8

    invoke-static {v11}, Lmp;->q(I)I

    move-result v11

    const/4 v12, 0x0

    const/16 v13, 0x18

    invoke-static {v13}, Lmp;->q(I)I

    move-result v13

    invoke-virtual {v10, v4, v11, v12, v13}, Landroid/view/View;->setPadding(IIII)V

    const/4 v4, 0x1

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lg40;->g(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    move-result-object v11

    const/4 v4, 0x0

    const/16 v12, 0x8

    invoke-static {v12}, Lmp;->q(I)I

    move-result v12

    const/4 v13, 0x0

    const/16 v19, 0x18

    invoke-static/range {v19 .. v19}, Lmp;->q(I)I

    move-result v19

    move/from16 v0, v19

    invoke-virtual {v11, v4, v12, v13, v0}, Landroid/view/View;->setPadding(IIII)V

    const/4 v4, 0x1

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lg40;->g(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    move-result-object v12

    const/4 v4, 0x0

    const/16 v13, 0x8

    invoke-static {v13}, Lmp;->q(I)I

    move-result v13

    const/16 v19, 0x0

    const/16 v20, 0x18

    invoke-static/range {v20 .. v20}, Lmp;->q(I)I

    move-result v20

    move/from16 v0, v19

    move/from16 v1, v20

    invoke-virtual {v12, v4, v13, v0, v1}, Landroid/view/View;->setPadding(IIII)V

    const/4 v4, 0x1

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lg40;->g(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    move-result-object v13

    const/4 v4, 0x0

    const/16 v19, 0x8

    invoke-static/range {v19 .. v19}, Lmp;->q(I)I

    move-result v19

    const/16 v20, 0x0

    const/16 v21, 0x18

    invoke-static/range {v21 .. v21}, Lmp;->q(I)I

    move-result v21

    move/from16 v0, v19

    move/from16 v1, v20

    move/from16 v2, v21

    invoke-virtual {v13, v4, v0, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    invoke-virtual {v6, v10}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    invoke-virtual {v7, v11}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    invoke-virtual {v8, v12}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    invoke-virtual {v9, v13}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    invoke-virtual {v14, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v14, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v14, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v14, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v36

    invoke-virtual {v0, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v4, "vOf5\n"

    const-string v14, "3YSNWfNYWOA=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v4, "hhksm6l/\n"

    const-string v14, "4nBN98YYP68=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v4, "U945KWo=\n"

    const-string v14, "J7ZcRA8QIiI=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v4, "NljZKikEp/M0XsUqGA==\n"

    const-string v14, "VTerT2pryYc=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v4, "mgoRdVzAP/2YCx5kbQ==\n"

    const-string v14, "+WJwAR+vUYk=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v4, "QWinu50xLPFDfZSxkjcs9k59pQ==\n"

    const-string v14, "IBjX3vxDTZ8=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v4, "QUu+0JJn1pNeV6PHmmrKog==\n"

    const-string v14, "MTnXpvMEr9A=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v4, "xEHZ/n5fa5bFFdyoel5vksJB3a97CWyT\n"

    const-string v14, "piK/zBg9CfA=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lg80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, La30;

    const/16 v19, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, v33

    move/from16 v2, v19

    invoke-direct {v14, v0, v5, v1, v2}, La30;-><init>(Landroid/app/Activity;Lsn;Landroid/app/Dialog;I)V

    move-object/from16 v0, p0

    invoke-static {v0, v10, v4, v5, v14}, Lbo;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lsn;Lum;)V

    const-string v4, "zL78h3fph5nL6P7fcL2ByMro+NR074PL\n"

    const-string v14, "rt2a5hLb5f8=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lg80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, Lf30;

    const/16 v19, 0x1

    move-object/from16 v0, p0

    move/from16 v1, v19

    invoke-direct {v14, v0, v5, v1}, Lf30;-><init>(Landroid/app/Activity;Lsn;I)V

    move-object/from16 v0, p0

    invoke-static {v0, v10, v4, v5, v14}, Lbo;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lsn;Lum;)V

    const-string v4, "3vejFuowgo3Y9aAR7DOF2djxpEToYoPf3qOlQ+ph\n"

    const-string v14, "vMXGIo5W4Os=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lg80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, La30;

    const/16 v19, 0x4

    move-object/from16 v0, p0

    move-object/from16 v1, v33

    move/from16 v2, v19

    invoke-direct {v14, v0, v5, v1, v2}, La30;-><init>(Landroid/app/Activity;Lsn;Landroid/app/Dialog;I)V

    move-object/from16 v0, p0

    invoke-static {v0, v10, v4, v5, v14}, Lbo;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lsn;Lum;)V

    const-string v4, "C7F99eaun/QN43yj4vCYpAqzeqbjr5mm\n"

    const-string v14, "adUYxYCW/ZI=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lg80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, La30;

    const/16 v19, 0x5

    move-object/from16 v0, p0

    move-object/from16 v1, v33

    move/from16 v2, v19

    invoke-direct {v14, v0, v5, v1, v2}, La30;-><init>(Landroid/app/Activity;Lsn;Landroid/app/Dialog;I)V

    move-object/from16 v0, p0

    invoke-static {v0, v10, v4, v5, v14}, Lbo;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lsn;Lum;)V

    const-string v4, "vqRxuQdeIj+59XSwBgImbrqgdeoAUiY+\n"

    const-string v14, "3MIXiWRmQFo=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lg80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, Lf30;

    const/16 v19, 0x2

    move-object/from16 v0, p0

    move/from16 v1, v19

    invoke-direct {v14, v0, v5, v1}, Lf30;-><init>(Landroid/app/Activity;Lsn;I)V

    move-object/from16 v0, p0

    invoke-static {v0, v10, v4, v5, v14}, Lbo;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lsn;Lum;)V

    const-string v4, "r74xbocY+eepvzI4gU/+tKu4NmiGGvi8\n"

    const-string v14, "zd1UDeMqm4Q=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lg80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, La30;

    const/16 v19, 0x6

    move-object/from16 v0, p0

    move-object/from16 v1, v33

    move/from16 v2, v19

    invoke-direct {v14, v0, v5, v1, v2}, La30;-><init>(Landroid/app/Activity;Lsn;Landroid/app/Dialog;I)V

    move-object/from16 v0, p0

    invoke-static {v0, v11, v4, v5, v14}, Lbo;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lsn;Lum;)V

    const-string v4, "a1YrWm5TBdFtVygMaAIDgWoHLF1sVQHQ\n"

    const-string v14, "CTVOOQphZ7I=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lg80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, Lf30;

    const/16 v19, 0x3

    move-object/from16 v0, p0

    move/from16 v1, v19

    invoke-direct {v14, v0, v5, v1}, Lf30;-><init>(Landroid/app/Activity;Lsn;I)V

    move-object/from16 v0, p0

    invoke-static {v0, v11, v4, v5, v14}, Lbo;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lsn;Lum;)V

    const-string v4, "sYRuAkW+pIrW7WxXM7Ha1NG0\n"

    const-string v14, "WAT05dobQDI=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, Lf30;

    const/16 v19, 0x4

    move-object/from16 v0, p0

    move/from16 v1, v19

    invoke-direct {v14, v0, v5, v1}, Lf30;-><init>(Landroid/app/Activity;Lsn;I)V

    move-object/from16 v0, p0

    invoke-static {v0, v11, v4, v5, v14}, Lbo;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lsn;Lum;)V

    const-string v4, "/J8dl3L2fzj7yx3IdfV7OP2fHMNx93ll\n"

    const-string v14, "nvx+8ReTHV0=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lg80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, La30;

    const/16 v19, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, v33

    move/from16 v2, v19

    invoke-direct {v14, v0, v5, v1, v2}, La30;-><init>(Landroid/app/Activity;Lsn;Landroid/app/Dialog;I)V

    move-object/from16 v0, p0

    invoke-static {v0, v12, v4, v5, v14}, Lbo;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lsn;Lum;)V

    const-string v4, "rMDuBZAAv4Grw+wCll+70a2W6AWQC7iG\n"

    const-string v14, "zqaKY/Q53eU=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lg80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, La30;

    const/16 v19, 0x2

    move-object/from16 v0, p0

    move-object/from16 v1, v33

    move/from16 v2, v19

    invoke-direct {v14, v0, v5, v1, v2}, La30;-><init>(Landroid/app/Activity;Lsn;Landroid/app/Dialog;I)V

    move-object/from16 v0, p0

    invoke-static {v0, v12, v4, v5, v14}, Lbo;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lsn;Lum;)V

    const-string v4, "U2ryiAVK4olVPPWPAx3j2VU789oHT+aNU2/3igQY\n"

    const-string v14, "MQmRvmF7gO8=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lg80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, Lf30;

    const/16 v19, 0x0

    move-object/from16 v0, p0

    move/from16 v1, v19

    invoke-direct {v14, v0, v5, v1}, Lf30;-><init>(Landroid/app/Activity;Lsn;I)V

    move-object/from16 v0, p0

    invoke-static {v0, v13, v4, v5, v14}, Lbo;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lsn;Lum;)V

    const-string v4, "7NW1wPCFhKXog7eX9tWFpevfscDy1oDx\n"

    const-string v14, "jufTpJTm5pc=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lg80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, La30;

    const/16 v19, 0x3

    move-object/from16 v0, p0

    move-object/from16 v1, v33

    move/from16 v2, v19

    invoke-direct {v14, v0, v5, v1, v2}, La30;-><init>(Landroid/app/Activity;Lsn;Landroid/app/Dialog;I)V

    move-object/from16 v0, p0

    invoke-static {v0, v13, v4, v5, v14}, Lbo;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lsn;Lum;)V

    new-instance v37, Landroid/widget/FrameLayout;

    move-object/from16 v0, v37

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v14, -0x1

    const/16 v19, -0x2

    move/from16 v0, v19

    invoke-direct {v4, v14, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v14, 0x50

    iput v14, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    move-object/from16 v0, v37

    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    if-nez v17, :cond_1f

    const/16 v4, 0x18

    invoke-static {v4}, Lmp;->q(I)I

    move-result v4

    const/4 v14, 0x0

    const/16 v19, 0x18

    invoke-static/range {v19 .. v19}, Lmp;->q(I)I

    move-result v19

    const/16 v20, 0x18

    invoke-static/range {v20 .. v20}, Lmp;->q(I)I

    move-result v20

    move-object/from16 v0, v37

    move/from16 v1, v19

    move/from16 v2, v20

    invoke-virtual {v0, v4, v14, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    :goto_7
    const/4 v4, 0x1

    move-object/from16 v0, v37

    invoke-virtual {v0, v4}, Landroid/view/View;->setClickable(Z)V

    const-string v4, "Mt0dgFQnHkAG2gurQiQGbTvZFg==\n"

    const-string v14, "Wbhk3zZLazI=\n"

    invoke-static {v4, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkn;->e(Ljava/lang/String;)Z

    move-result v19

    if-eqz v19, :cond_21

    if-eqz v32, :cond_20

    const/16 v4, 0x8c

    :goto_8
    new-instance v38, Landroid/widget/FrameLayout;

    move-object/from16 v0, v38

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    if-nez v17, :cond_22

    const/16 v14, 0x40

    invoke-static {v14}, Lmp;->q(I)I

    move-result v14

    :goto_9
    new-instance v20, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v21, -0x1

    move-object/from16 v0, v20

    move/from16 v1, v21

    invoke-direct {v0, v1, v14}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    move-object/from16 v0, v38

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v20, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct/range {v20 .. v20}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v15}, Landroid/graphics/Color;->red(I)I

    move-result v14

    invoke-static {v15}, Landroid/graphics/Color;->green(I)I

    move-result v21

    invoke-static {v15}, Landroid/graphics/Color;->blue(I)I

    move-result v15

    move/from16 v0, v21

    invoke-static {v4, v14, v0, v15}, Landroid/graphics/Color;->argb(IIII)I

    move-result v4

    move-object/from16 v0, v20

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    if-nez v17, :cond_2

    const/high16 v4, 0x42c80000    # 100.0f

    invoke-static {v4}, Lmp;->p(F)F

    move-result v4

    move-object/from16 v0, v20

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    if-eqz v19, :cond_2

    const/4 v4, 0x1

    invoke-static {v4}, Lmp;->q(I)I

    move-result v15

    if-eqz v32, :cond_23

    const-string v14, "yHDypQ8z2Ryt\n"

    const-string v4, "60Gz40l1n1o=\n"

    :goto_a
    invoke-static {v14, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    move-object/from16 v0, v20

    invoke-virtual {v0, v15, v4}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    :cond_2
    move-object/from16 v0, v38

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    if-nez v17, :cond_3

    iget-boolean v4, v5, Lsn;->l:Z

    if-eqz v4, :cond_3

    const/high16 v4, 0x41a00000    # 20.0f

    invoke-static {v4}, Lmp;->p(F)F

    move-result v4

    move-object/from16 v0, v38

    invoke-virtual {v0, v4}, Landroid/view/View;->setElevation(F)V

    new-instance v4, Ljy;

    const/4 v14, 0x1

    invoke-direct {v4, v14}, Ljy;-><init>(I)V

    move-object/from16 v0, v38

    invoke-virtual {v0, v4}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    const/16 v4, 0x1c

    move/from16 v0, v18

    if-lt v0, v4, :cond_3

    if-eqz v32, :cond_24

    const-string v14, "ErVtDDE6Hg==\n"

    const-string v4, "MYVdPAEKLvU=\n"

    :goto_b
    invoke-static {v14, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    move-object/from16 v0, v38

    invoke-static {v0, v4}, Lc0;->C(Landroid/widget/FrameLayout;I)V

    if-eqz v32, :cond_25

    const-string v14, "WjSHCk+lJQ==\n"

    const-string v4, "eQS3On+VFeg=\n"

    :goto_c
    invoke-static {v14, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    move-object/from16 v0, v38

    invoke-static {v0, v4}, Lc0;->D(Landroid/widget/FrameLayout;I)V

    :cond_3
    if-eqz v19, :cond_4

    const/4 v4, 0x1

    move-object/from16 v0, v38

    invoke-virtual {v0, v4}, Landroid/view/View;->setClipToOutline(Z)V

    :cond_4
    const/16 v4, 0x8

    invoke-static {v4}, Lmp;->q(I)I

    move-result v14

    const/16 v4, 0x8

    invoke-static {v4}, Lmp;->q(I)I

    move-result v15

    const/16 v4, 0x8

    invoke-static {v4}, Lmp;->q(I)I

    move-result v18

    if-nez v17, :cond_26

    const/16 v4, 0x8

    invoke-static {v4}, Lmp;->q(I)I

    move-result v4

    :goto_d
    move-object/from16 v0, v38

    move/from16 v1, v18

    invoke-virtual {v0, v14, v15, v1, v4}, Landroid/view/View;->setPadding(IIII)V

    new-instance v15, Landroid/view/View;

    move-object/from16 v0, p0

    invoke-direct {v15, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v14, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v14}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    move/from16 v0, v16

    invoke-virtual {v14, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v4, 0x42c80000    # 100.0f

    invoke-static {v4}, Lmp;->p(F)F

    move-result v4

    invoke-virtual {v14, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    const/4 v4, 0x1

    move/from16 v0, v17

    if-ne v0, v4, :cond_27

    const/16 v4, 0x28

    :goto_e
    invoke-virtual {v14, v4}, Landroid/graphics/drawable/GradientDrawable;->setAlpha(I)V

    invoke-virtual {v15, v14}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    move-object/from16 v0, v38

    invoke-virtual {v0, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v16, Lo40;

    sget-object v4, Lo40;->m:Lsh;

    move-object/from16 v0, v16

    invoke-direct {v0, v15, v4}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    new-instance v4, Lp40;

    invoke-direct {v4}, Lp40;-><init>()V

    const/high16 v14, 0x43480000    # 200.0f

    invoke-virtual {v4, v14}, Lp40;->b(F)V

    const v14, 0x3f266666    # 0.65f

    invoke-virtual {v4, v14}, Lp40;->a(F)V

    move-object/from16 v0, v16

    iput-object v4, v0, Lo40;->k:Lp40;

    new-instance v17, Lo40;

    sget-object v4, Lo40;->n:Lsh;

    move-object/from16 v0, v17

    invoke-direct {v0, v15, v4}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    new-instance v4, Lp40;

    invoke-direct {v4}, Lp40;-><init>()V

    const/high16 v14, 0x43480000    # 200.0f

    invoke-virtual {v4, v14}, Lp40;->b(F)V

    const v14, 0x3f266666    # 0.65f

    invoke-virtual {v4, v14}, Lp40;->a(F)V

    move-object/from16 v0, v17

    iput-object v4, v0, Lo40;->k:Lp40;

    const/4 v4, 0x0

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lg40;->g(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    move-result-object v14

    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v18, -0x1

    const/16 v19, -0x1

    move/from16 v0, v18

    move/from16 v1, v19

    invoke-direct {v4, v0, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v14, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v18, 0x0

    const-string v4, "jln7olj5dDiPDvij\n"

    const-string v19, "7DqdwDyaFls=\n"

    move-object/from16 v0, v19

    invoke-static {v4, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lg80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    const-string v4, "hSI0\n"

    const-string v20, "a5+BsoSYi+w=\n"

    move-object/from16 v0, v20

    invoke-static {v4, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    move-object/from16 v4, p0

    invoke-static/range {v4 .. v20}, Lz20;->c(Landroid/app/Activity;Lsn;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/view/View;Lo40;Lo40;ILjava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;

    move-result-object v4

    invoke-virtual {v14, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/16 v18, 0x1

    const-string v4, "I/zJcX/5tIUkqc95\n"

    const-string v19, "QZmsQRmc1uA=\n"

    move-object/from16 v0, v19

    invoke-static {v4, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lg80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    const-string v4, "EPMC\n"

    const-string v20, "/kioiUwRetI=\n"

    move-object/from16 v0, v20

    invoke-static {v4, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    move-object/from16 v4, p0

    invoke-static/range {v4 .. v20}, Lz20;->c(Landroid/app/Activity;Lsn;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/view/View;Lo40;Lo40;ILjava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;

    move-result-object v4

    invoke-virtual {v14, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/16 v18, 0x2

    const-string v4, "63aPIYR15iLqcokj\n"

    const-string v19, "iUXsFuJNhEE=\n"

    move-object/from16 v0, v19

    invoke-static {v4, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lg80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    const-string v4, "YBPA\n"

    const-string v20, "jr5tzcHiJJI=\n"

    move-object/from16 v0, v20

    invoke-static {v4, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    move-object/from16 v4, p0

    invoke-static/range {v4 .. v20}, Lz20;->c(Landroid/app/Activity;Lsn;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/view/View;Lo40;Lo40;ILjava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;

    move-result-object v4

    invoke-virtual {v14, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/16 v18, 0x3

    const-string v4, "8QxhjvlbTB73D2TZ\n"

    const-string v19, "kz8CvJxjLn0=\n"

    move-object/from16 v0, v19

    invoke-static {v4, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lg80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    const-string v4, "tJQr\n"

    const-string v20, "WxOo21DfQ9o=\n"

    move-object/from16 v0, v20

    invoke-static {v4, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    move-object/from16 v4, p0

    invoke-static/range {v4 .. v20}, Lz20;->c(Landroid/app/Activity;Lsn;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/view/View;Lo40;Lo40;ILjava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;

    move-result-object v4

    invoke-virtual {v14, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v38

    invoke-virtual {v0, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v18, Lu20;

    move-object/from16 v19, v6

    move-object/from16 v20, v7

    move-object/from16 v21, v8

    move-object/from16 v22, v9

    move-object/from16 v23, v10

    move-object/from16 v24, v11

    move-object/from16 v25, v12

    move-object/from16 v26, v13

    move-object/from16 v27, v14

    move-object/from16 v28, v5

    move-object/from16 v29, v15

    move-object/from16 v30, v16

    move-object/from16 v31, v17

    invoke-direct/range {v18 .. v31}, Lu20;-><init>(Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lsn;Landroid/view/View;Lo40;Lo40;)V

    move-object/from16 v0, v18

    invoke-virtual {v14, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    invoke-virtual/range {v37 .. v38}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v34

    move-object/from16 v1, v36

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v34

    move-object/from16 v1, v37

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual/range {v33 .. v34}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    invoke-virtual/range {v33 .. v33}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v5

    if-eqz v5, :cond_5

    const/4 v4, -0x1

    const/4 v6, -0x1

    invoke-virtual {v5, v4, v6}, Landroid/view/Window;->setLayout(II)V

    new-instance v4, Landroid/graphics/drawable/ColorDrawable;

    const/4 v6, 0x0

    invoke-direct {v4, v6}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v5, v4}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    const/high16 v4, -0x80000000

    invoke-virtual {v5, v4}, Landroid/view/Window;->addFlags(I)V

    const/16 v4, 0x200

    invoke-virtual {v5, v4}, Landroid/view/Window;->addFlags(I)V

    const/high16 v4, 0x4000000

    invoke-virtual {v5, v4}, Landroid/view/Window;->clearFlags(I)V

    const/4 v4, 0x0

    invoke-virtual {v5, v4}, Landroid/view/Window;->setStatusBarColor(I)V

    const/4 v4, 0x0

    invoke-virtual {v5, v4}, Landroid/view/Window;->setNavigationBarColor(I)V

    if-nez v32, :cond_28

    const/16 v4, 0x2700

    :goto_f
    invoke-virtual {v5}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_5
    new-instance v4, Lv20;

    move/from16 v0, v35

    move-object/from16 v1, v33

    move-object/from16 v2, v36

    invoke-direct {v4, v0, v1, v2}, Lv20;-><init>(ILandroid/app/Dialog;Landroid/widget/LinearLayout;)V

    move-object/from16 v0, v33

    invoke-virtual {v0, v4}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    invoke-virtual/range {v33 .. v33}, Landroid/app/Dialog;->show()V

    return-void

    :cond_6
    const/16 v20, 0x0

    goto/16 :goto_0

    :cond_7
    const/4 v4, 0x0

    goto/16 :goto_1

    :cond_8
    const/4 v5, 0x0

    goto/16 :goto_2

    :catch_0
    move-exception v4

    const-string v4, "06ke\n"

    const-string v6, "p8h5VTpLcuY=\n"

    const-string v7, "R0lmOhXS4GFrX3A6BNXqUH1sTyk=\n"

    const-string v8, "EgAgW3amjxM=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "tw==\n"

    const-string v9, "0vI8ySRxU5w=\n"

    invoke-static {v4, v6, v7, v8, v9}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "k9sxLQjeHA==\n"

    const-string v6, "sOsBbDyYWps=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    goto/16 :goto_3

    :catch_1
    move-exception v6

    const-string v6, "06ke\n"

    const-string v7, "p8h5VTpLcuY=\n"

    const-string v8, "3Ja7OYjfMlXwgK4hmOgyS+at\n"

    const-string v9, "id/9WOurXSc=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "tw==\n"

    const-string v10, "0vI8ySRxU5w=\n"

    invoke-static {v6, v7, v8, v9, v10}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move v6, v4

    goto/16 :goto_4

    :cond_9
    sget-object v4, Lkb0;->k:Lkb0;

    xor-int/lit16 v7, v6, -0x100

    and-int/2addr v7, v6

    const v8, -0xff0001

    xor-int/2addr v8, v6

    and-int/2addr v8, v6

    shr-int/lit8 v8, v8, 0x10

    invoke-static {v8}, Lg80;->w(I)D

    move-result-wide v8

    const v10, -0xff01

    xor-int/2addr v10, v6

    and-int/2addr v10, v6

    shr-int/lit8 v10, v10, 0x8

    invoke-static {v10}, Lg80;->w(I)D

    move-result-wide v10

    invoke-static {v7}, Lg80;->w(I)D

    move-result-wide v12

    const-wide v14, 0x3fd6e341ae4b2c79L    # 0.35762064

    mul-double/2addr v14, v10

    const-wide/high16 v16, 0x402c000000000000L    # 14.0

    sub-double v14, v14, v16

    const-wide v16, 0x3fda63c2e8477c96L    # 0.41233895

    mul-double v16, v16, v8

    add-double v14, v14, v16

    const-wide/high16 v16, 0x402c000000000000L    # 14.0

    add-double v14, v14, v16

    const-wide/16 v16, 0x0

    const-wide v24, 0x3fc71af7273e5d5eL    # 0.18051042

    mul-double v24, v24, v12

    sub-double v16, v16, v24

    sub-double v14, v14, v16

    const-wide v16, 0x3fe6e2eb1c432ca5L    # 0.7152

    mul-double v16, v16, v10

    const-wide/16 v24, 0x0

    const-wide v26, 0x3fcb367a0f9096bcL    # 0.2126

    mul-double v26, v26, v8

    sub-double v24, v24, v26

    sub-double v16, v16, v24

    const-wide/16 v24, 0x0

    const-wide v26, 0x3fb27bb2fec56d5dL    # 0.0722

    mul-double v26, v26, v12

    sub-double v24, v24, v26

    sub-double v16, v16, v24

    const-wide v24, 0x3fee693974c0c730L    # 0.95034478

    mul-double v12, v12, v24

    const-wide/high16 v24, 0x4022000000000000L    # 9.0

    add-double v12, v12, v24

    const-wide v24, 0x3fbe818525c434ceL    # 0.11916382

    mul-double v10, v10, v24

    const-wide/high16 v24, 0x4008000000000000L    # 3.0

    add-double v10, v10, v24

    const-wide v24, 0x3f93c8fde0401c25L    # 0.01932141

    mul-double v8, v8, v24

    add-double/2addr v8, v10

    const-wide/high16 v10, 0x4008000000000000L    # 3.0

    sub-double/2addr v8, v10

    add-double/2addr v8, v12

    const-wide/high16 v10, 0x4022000000000000L    # 9.0

    sub-double/2addr v8, v10

    sget-object v10, Lg80;->a:[[D

    const/4 v11, 0x0

    aget-object v11, v10, v11

    const/4 v12, 0x0

    aget-wide v12, v11, v12

    const/16 v23, 0x1

    aget-wide v24, v11, v23

    const/16 v23, 0x2

    aget-wide v26, v11, v23

    const/4 v11, 0x1

    aget-object v11, v10, v11

    const/16 v23, 0x0

    aget-wide v28, v11, v23

    const/16 v23, 0x1

    aget-wide v30, v11, v23

    const/16 v23, 0x2

    aget-wide v32, v11, v23

    const/4 v11, 0x2

    aget-object v10, v10, v11

    const/4 v11, 0x0

    aget-wide v34, v10, v11

    const/4 v11, 0x1

    aget-wide v36, v10, v11

    const/4 v11, 0x2

    aget-wide v10, v10, v11

    iget-object v0, v4, Lkb0;->g:[D

    move-object/from16 v23, v0

    iget-wide v0, v4, Lkb0;->i:D

    move-wide/from16 v38, v0

    iget-wide v0, v4, Lkb0;->d:D

    move-wide/from16 v40, v0

    iget-wide v0, v4, Lkb0;->a:D

    move-wide/from16 v42, v0

    const/16 v44, 0x0

    aget-wide v44, v23, v44

    mul-double v26, v26, v8

    const-wide/high16 v46, 0x4010000000000000L    # 4.0

    add-double v26, v26, v46

    mul-double v24, v24, v16

    const-wide/16 v46, 0x0

    add-double v24, v24, v46

    mul-double/2addr v12, v14

    add-double v12, v12, v24

    const-wide/16 v24, 0x0

    sub-double v12, v12, v24

    add-double v12, v12, v26

    const-wide/high16 v24, 0x4010000000000000L    # 4.0

    sub-double v12, v12, v24

    mul-double v12, v12, v44

    const/16 v24, 0x1

    aget-wide v24, v23, v24

    mul-double v26, v32, v8

    const-wide/16 v32, 0x0

    mul-double v30, v30, v16

    const-wide/high16 v44, 0x4033000000000000L    # 19.0

    add-double v30, v30, v44

    mul-double v28, v28, v14

    add-double v28, v28, v30

    const-wide/high16 v30, 0x4033000000000000L    # 19.0

    sub-double v28, v28, v30

    sub-double v28, v32, v28

    sub-double v26, v26, v28

    mul-double v24, v24, v26

    const/16 v26, 0x2

    aget-wide v26, v23, v26

    mul-double/2addr v8, v10

    const-wide/high16 v10, 0x4018000000000000L    # 6.0

    sub-double/2addr v8, v10

    mul-double v10, v16, v36

    const-wide/16 v16, 0x0

    mul-double v14, v14, v34

    sub-double v14, v16, v14

    sub-double/2addr v10, v14

    add-double/2addr v8, v10

    const-wide/high16 v10, 0x4018000000000000L    # 6.0

    add-double/2addr v8, v10

    mul-double v8, v8, v26

    iget-wide v10, v4, Lkb0;->h:D

    invoke-static {v12, v13}, Ljava/lang/Math;->abs(D)D

    move-result-wide v14

    mul-double/2addr v14, v10

    const-wide/high16 v16, 0x4059000000000000L    # 100.0

    div-double v14, v14, v16

    const-wide v16, 0x3fdae147ae147ae1L    # 0.42

    invoke-static/range {v14 .. v17}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v14

    invoke-static/range {v24 .. v25}, Ljava/lang/Math;->abs(D)D

    move-result-wide v16

    mul-double v16, v16, v10

    const-wide/high16 v26, 0x4059000000000000L    # 100.0

    div-double v16, v16, v26

    const-wide v26, 0x3fdae147ae147ae1L    # 0.42

    move-wide/from16 v0, v16

    move-wide/from16 v2, v26

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v16

    invoke-static {v8, v9}, Ljava/lang/Math;->abs(D)D

    move-result-wide v26

    mul-double v10, v10, v26

    const-wide/high16 v26, 0x4059000000000000L    # 100.0

    div-double v10, v10, v26

    const-wide v26, 0x3fdae147ae147ae1L    # 0.42

    move-wide/from16 v0, v26

    invoke-static {v10, v11, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v10

    invoke-static {v12, v13}, Ljava/lang/Math;->signum(D)D

    move-result-wide v12

    const-wide/high16 v26, 0x4079000000000000L    # 400.0

    mul-double v12, v12, v26

    mul-double/2addr v12, v14

    const-wide v26, 0x403b2147ae147ae1L    # 27.13

    const-wide/16 v28, 0x0

    sub-double v14, v28, v14

    sub-double v14, v26, v14

    div-double/2addr v12, v14

    invoke-static/range {v24 .. v25}, Ljava/lang/Math;->signum(D)D

    move-result-wide v14

    const-wide/high16 v24, 0x4079000000000000L    # 400.0

    mul-double v14, v14, v24

    mul-double v14, v14, v16

    const-wide/high16 v24, 0x402c000000000000L    # 14.0

    sub-double v16, v16, v24

    const-wide v24, 0x403b2147ae147ae1L    # 27.13

    add-double v16, v16, v24

    const-wide/high16 v24, 0x402c000000000000L    # 14.0

    add-double v16, v16, v24

    div-double v14, v14, v16

    invoke-static {v8, v9}, Ljava/lang/Math;->signum(D)D

    move-result-wide v8

    const-wide/high16 v16, 0x4079000000000000L    # 400.0

    mul-double v8, v8, v16

    mul-double/2addr v8, v10

    const-wide v16, 0x403b2147ae147ae1L    # 27.13

    const-wide/16 v24, 0x0

    sub-double v10, v24, v10

    sub-double v10, v16, v10

    div-double/2addr v8, v10

    const-wide/16 v10, 0x0

    const-wide/16 v16, 0x0

    const-wide/high16 v24, -0x3fd8000000000000L    # -12.0

    mul-double v24, v24, v14

    sub-double v16, v16, v24

    const-wide/high16 v24, 0x4026000000000000L    # 11.0

    mul-double v24, v24, v12

    sub-double v16, v16, v24

    sub-double v10, v10, v16

    const-wide/high16 v16, 0x4020000000000000L    # 8.0

    add-double v10, v10, v16

    add-double/2addr v10, v8

    const-wide/high16 v16, 0x4020000000000000L    # 8.0

    sub-double v10, v10, v16

    const-wide/high16 v16, 0x4026000000000000L    # 11.0

    div-double v16, v10, v16

    const-wide/high16 v10, 0x4010000000000000L    # 4.0

    add-double/2addr v10, v12

    add-double/2addr v10, v14

    const-wide/high16 v24, 0x4010000000000000L    # 4.0

    sub-double v10, v10, v24

    const-wide/high16 v24, 0x4039000000000000L    # 25.0

    add-double v10, v10, v24

    const-wide/high16 v24, 0x4000000000000000L    # 2.0

    mul-double v24, v24, v8

    sub-double v10, v10, v24

    const-wide/high16 v24, 0x4039000000000000L    # 25.0

    sub-double v10, v10, v24

    const-wide/high16 v24, 0x4022000000000000L    # 9.0

    div-double v24, v10, v24

    const-wide/high16 v10, 0x4034000000000000L    # 20.0

    mul-double/2addr v10, v14

    const-wide/high16 v14, 0x4035000000000000L    # 21.0

    mul-double/2addr v14, v8

    const-wide/high16 v26, 0x4014000000000000L    # 5.0

    add-double v14, v14, v26

    const-wide/16 v26, 0x0

    const-wide/16 v28, 0x0

    const-wide/high16 v30, 0x4034000000000000L    # 20.0

    mul-double v30, v30, v12

    sub-double v28, v28, v30

    sub-double v28, v28, v10

    sub-double v26, v26, v28

    add-double v14, v14, v26

    const-wide/high16 v26, 0x4014000000000000L    # 5.0

    sub-double v14, v14, v26

    const-wide/high16 v26, 0x4034000000000000L    # 20.0

    div-double v14, v14, v26

    const-wide/16 v26, 0x0

    const-wide/16 v28, 0x0

    const-wide/high16 v30, 0x4044000000000000L    # 40.0

    mul-double v12, v12, v30

    const-wide/high16 v30, 0x402a000000000000L    # 13.0

    add-double v12, v12, v30

    add-double/2addr v10, v12

    const-wide/high16 v12, 0x402a000000000000L    # 13.0

    sub-double/2addr v10, v12

    sub-double v10, v28, v10

    sub-double v8, v10, v8

    sub-double v8, v26, v8

    const-wide/high16 v10, 0x4034000000000000L    # 20.0

    div-double v10, v8, v10

    move-wide/from16 v0, v24

    move-wide/from16 v2, v16

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v8

    const-wide/16 v12, 0x0

    cmpg-double v12, v8, v12

    if-gez v12, :cond_c

    const-wide/16 v12, 0x0

    const-wide/16 v26, 0x0

    sub-double v8, v26, v8

    const-wide v26, 0x4076800000000000L    # 360.0

    sub-double v8, v8, v26

    sub-double v8, v12, v8

    :cond_a
    :goto_10
    invoke-static {v8, v9}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v12

    iget-wide v0, v4, Lkb0;->b:D

    move-wide/from16 v26, v0

    mul-double v10, v10, v26

    div-double v10, v10, v42

    iget-wide v0, v4, Lkb0;->j:D

    move-wide/from16 v26, v0

    mul-double v26, v26, v40

    move-wide/from16 v0, v26

    invoke-static {v10, v11, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v10

    const-wide/high16 v26, 0x4059000000000000L    # 100.0

    mul-double v10, v10, v26

    const-wide/high16 v26, 0x4059000000000000L    # 100.0

    div-double v26, v10, v26

    invoke-static/range {v26 .. v27}, Ljava/lang/Math;->sqrt(D)D

    const-wide v10, 0x403423d70a3d70a4L    # 20.14

    cmpg-double v10, v8, v10

    if-gez v10, :cond_d

    const-wide v10, 0x4076800000000000L    # 360.0

    const-wide/16 v28, 0x0

    sub-double v28, v28, v8

    sub-double v10, v10, v28

    :goto_11
    invoke-static {v10, v11}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v10

    const-wide/16 v28, 0x0

    const-wide/high16 v30, 0x4000000000000000L    # 2.0

    sub-double v28, v28, v30

    sub-double v10, v10, v28

    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    move-result-wide v10

    iget-wide v0, v4, Lkb0;->e:D

    move-wide/from16 v28, v0

    iget-wide v0, v4, Lkb0;->c:D

    move-wide/from16 v30, v0

    move-wide/from16 v0, v16

    move-wide/from16 v2, v24

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v16

    const-wide v24, 0x400e666666666666L    # 3.8

    const-wide/16 v32, 0x0

    sub-double v10, v32, v10

    sub-double v10, v24, v10

    const-wide/high16 v24, 0x3fd0000000000000L    # 0.25

    mul-double v10, v10, v24

    const-wide v24, 0x40ae0c4ec4ec4ec5L    # 3846.153846153846

    mul-double v10, v10, v24

    mul-double v10, v10, v28

    mul-double v10, v10, v30

    mul-double v10, v10, v16

    const-wide/16 v16, 0x0

    const-wide/16 v24, 0x0

    sub-double v14, v24, v14

    const-wide v24, 0x3fd3851eb851eb85L    # 0.305

    sub-double v14, v14, v24

    sub-double v14, v16, v14

    div-double/2addr v10, v14

    const-wide v14, 0x3ffa3d70a3d70a3dL    # 1.64

    const-wide/high16 v16, 0x403a000000000000L    # 26.0

    add-double v14, v14, v16

    const-wide v16, 0x3fd28f5c28f5c28fL    # 0.29

    iget-wide v0, v4, Lkb0;->f:D

    move-wide/from16 v24, v0

    move-wide/from16 v0, v16

    move-wide/from16 v2, v24

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v16

    sub-double v14, v14, v16

    const-wide/high16 v16, 0x403a000000000000L    # 26.0

    sub-double v14, v14, v16

    const-wide v16, 0x3fe75c28f5c28f5cL    # 0.73

    invoke-static/range {v14 .. v17}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v14

    const-wide v16, 0x3feccccccccccccdL    # 0.9

    move-wide/from16 v0, v16

    invoke-static {v10, v11, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v10

    mul-double/2addr v10, v14

    invoke-static/range {v26 .. v27}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v14

    mul-double/2addr v14, v10

    mul-double v10, v10, v40

    const-wide/high16 v16, 0x4010000000000000L    # 4.0

    const-wide/16 v24, 0x0

    sub-double v24, v24, v42

    sub-double v16, v16, v24

    div-double v10, v10, v16

    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    mul-double v10, v14, v38

    const-wide v16, 0x3f9758e219652bd4L    # 0.0228

    mul-double v10, v10, v16

    invoke-static {v10, v11}, Ljava/lang/Math;->log1p(D)D

    invoke-static {v12, v13}, Ljava/lang/Math;->cos(D)D

    invoke-static {v12, v13}, Ljava/lang/Math;->sin(D)D

    shr-int/lit8 v4, v6, 0x10

    xor-int/lit16 v10, v4, -0x100

    and-int/2addr v4, v10

    invoke-static {v4}, Lg80;->w(I)D

    move-result-wide v10

    shr-int/lit8 v4, v6, 0x8

    xor-int/lit16 v6, v4, -0x100

    and-int/2addr v4, v6

    invoke-static {v4}, Lg80;->w(I)D

    move-result-wide v12

    invoke-static {v7}, Lg80;->w(I)D

    move-result-wide v6

    sget-object v4, Lg80;->b:[[D

    const/16 v16, 0x3

    move/from16 v0, v16

    new-array v0, v0, [D

    move-object/from16 v16, v0

    const/16 v17, 0x0

    aput-wide v10, v16, v17

    const/4 v10, 0x1

    aput-wide v12, v16, v10

    const/4 v10, 0x2

    aput-wide v6, v16, v10

    move-object/from16 v0, v16

    invoke-static {v0, v4}, Lmu;->u([D[[D)[D

    move-result-object v4

    const/4 v6, 0x1

    aget-wide v6, v4, v6

    const-wide/high16 v10, 0x4059000000000000L    # 100.0

    div-double/2addr v6, v10

    const-wide v10, 0x3f822354d28f7cd6L    # 0.008856451679035631

    cmpl-double v4, v6, v10

    if-lez v4, :cond_b

    const-wide v10, 0x3fd5555555555555L    # 0.3333333333333333

    invoke-static {v6, v7, v10, v11}, Ljava/lang/Math;->pow(DD)D

    :cond_b
    const-wide/high16 v6, 0x4049000000000000L    # 50.0

    invoke-static {v14, v15, v6, v7}, Ljava/lang/Math;->max(DD)D

    move-result-wide v6

    invoke-static {v8, v9, v6, v7}, Lh70;->a(DD)Lh70;

    move-result-object v6

    const-wide/high16 v10, 0x4020000000000000L    # 8.0

    invoke-static {v8, v9, v10, v11}, Lh70;->a(DD)Lh70;

    move-result-object v10

    const-wide/high16 v12, 0x4028000000000000L    # 12.0

    invoke-static {v8, v9, v12, v13}, Lh70;->a(DD)Lh70;

    move-result-object v8

    if-eqz v20, :cond_e

    const/16 v4, 0x50

    :goto_12
    invoke-virtual {v6, v4}, Lh70;->b(I)I

    move-result v11

    const/4 v4, 0x1

    if-ne v5, v4, :cond_14

    if-eqz v20, :cond_f

    const/4 v4, 0x6

    :goto_13
    invoke-virtual {v10, v4}, Lh70;->b(I)I

    move-result v13

    const/16 v6, 0x5f

    if-eqz v20, :cond_10

    const/16 v4, 0xc

    :goto_14
    invoke-virtual {v10, v4}, Lh70;->b(I)I

    move-result v7

    if-eqz v20, :cond_11

    const/16 v4, 0x14

    :goto_15
    invoke-virtual {v8, v4}, Lh70;->b(I)I

    move-result v12

    if-eqz v20, :cond_12

    move v4, v6

    :goto_16
    invoke-virtual {v10, v4}, Lh70;->b(I)I

    move-result v9

    if-eqz v20, :cond_13

    const/16 v4, 0xa0

    const/16 v6, 0xff

    const/16 v8, 0xff

    const/16 v10, 0xff

    invoke-static {v4, v6, v8, v10}, Landroid/graphics/Color;->argb(IIII)I

    move-result v4

    :goto_17
    const/4 v8, 0x0

    move v10, v4

    move v6, v13

    :goto_18
    const/4 v4, 0x1

    if-ne v5, v4, :cond_1b

    const/16 v4, 0x23

    :goto_19
    invoke-static {v11}, Landroid/graphics/Color;->red(I)I

    move-result v13

    invoke-static {v11}, Landroid/graphics/Color;->green(I)I

    move-result v14

    invoke-static {v11}, Landroid/graphics/Color;->blue(I)I

    move-result v15

    invoke-static {v4, v13, v14, v15}, Landroid/graphics/Color;->argb(IIII)I

    move-result v13

    const/4 v4, 0x1

    if-ne v5, v4, :cond_1c

    const/high16 v4, 0x41e00000    # 28.0f

    :goto_1a
    invoke-static {v4}, Lmp;->p(F)F

    move-result v14

    const/4 v4, 0x1

    if-ne v5, v4, :cond_1d

    const/4 v15, 0x0

    :goto_1b
    xor-int/lit8 v4, v5, -0x1

    and-int/lit8 v4, v4, 0x1

    and-int/lit8 v16, v5, -0x2

    or-int v16, v16, v4

    new-instance v4, Lsn;

    move/from16 v17, v16

    invoke-direct/range {v4 .. v20}, Lsn;-><init>(IIIIIIIIIFFZZZZZ)V

    move-object/from16 v0, v22

    move-object/from16 v1, v21

    invoke-virtual {v0, v1, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v5, v4

    goto/16 :goto_5

    :cond_c
    const-wide v12, 0x4076800000000000L    # 360.0

    cmpl-double v12, v8, v12

    if-ltz v12, :cond_a

    const-wide/high16 v12, 0x4037000000000000L    # 23.0

    sub-double/2addr v8, v12

    const-wide v12, 0x4076800000000000L    # 360.0

    sub-double/2addr v8, v12

    const-wide/high16 v12, 0x4037000000000000L    # 23.0

    add-double/2addr v8, v12

    goto/16 :goto_10

    :cond_d
    move-wide v10, v8

    goto/16 :goto_11

    :cond_e
    const/16 v4, 0x2d

    goto/16 :goto_12

    :cond_f
    const/16 v4, 0x62

    goto/16 :goto_13

    :cond_10
    const/16 v4, 0x5f

    goto/16 :goto_14

    :cond_11
    const/16 v4, 0x5a

    goto :goto_15

    :cond_12
    const/16 v4, 0xf

    goto :goto_16

    :cond_13
    const/16 v4, 0x28

    invoke-virtual {v8, v4}, Lh70;->b(I)I

    move-result v4

    goto :goto_17

    :cond_14
    if-eqz v20, :cond_15

    const-string v4, "8f8V4oWeDg==\n"

    const-string v6, "0s8l0rWuPmQ=\n"

    :goto_1c
    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v13

    if-eqz v20, :cond_16

    const-string v6, "wfK+TUArqg==\n"

    const-string v4, "4sP9fAMa70Q=\n"

    :goto_1d
    invoke-static {v6, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    if-eqz v20, :cond_17

    const-string v6, "AqMSnowBCNNn\n"

    const-string v4, "IZIg2MpHTpU=\n"

    :goto_1e
    invoke-static {v6, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    if-eqz v20, :cond_18

    const-string v4, "Mz+z9aO6Cg==\n"

    const-string v6, "EA2Fx5WIMo8=\n"

    :goto_1f
    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    if-eqz v20, :cond_19

    const-string v6, "0YDf0CxjPQ==\n"

    const-string v4, "8saZlmole9g=\n"

    :goto_20
    invoke-static {v6, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    if-eqz v20, :cond_1a

    const/16 v4, 0xa0

    const/16 v6, 0xff

    const/16 v10, 0xff

    const/16 v14, 0xff

    invoke-static {v4, v6, v10, v14}, Landroid/graphics/Color;->argb(IIII)I

    move-result v4

    :goto_21
    move v10, v4

    move v6, v13

    goto/16 :goto_18

    :cond_15
    const-string v4, "Pc2V6S/Rlw==\n"

    const-string v6, "HoumrxuXoaE=\n"

    goto :goto_1c

    :cond_16
    const-string v6, "y41XrwBgPg==\n"

    const-string v4, "6MsR6UYmeDY=\n"

    goto :goto_1d

    :cond_17
    const-string v6, "oxKi1K5tXKKw\n"

    const-string v4, "gCLj5J5dbJI=\n"

    goto :goto_1e

    :cond_18
    const-string v4, "VSAt6oUVnA==\n"

    const-string v6, "dmUYr7BQ3cs=\n"

    goto :goto_1f

    :cond_19
    const-string v6, "dweTzqE7cg==\n"

    const-string v4, "VDai/5AKQ+I=\n"

    goto :goto_20

    :cond_1a
    const-string v4, "JNiKHWJ1Lg==\n"

    const-string v6, "B+DPJSdMHSg=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    goto :goto_21

    :cond_1b
    const/16 v4, 0x14

    goto/16 :goto_19

    :cond_1c
    const/high16 v4, 0x41c00000    # 24.0f

    goto/16 :goto_1a

    :cond_1d
    const/high16 v4, 0x41400000    # 12.0f

    invoke-static {v4}, Lmp;->p(F)F

    move-result v15

    goto/16 :goto_1b

    :cond_1e
    const/16 v4, 0x5a

    invoke-static {v4}, Lmp;->q(I)I

    move-result v4

    goto/16 :goto_6

    :cond_1f
    const/4 v4, 0x0

    const/4 v14, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v0, v37

    move/from16 v1, v19

    move/from16 v2, v20

    invoke-virtual {v0, v4, v14, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    goto/16 :goto_7

    :cond_20
    const/16 v4, 0xa0

    goto/16 :goto_8

    :cond_21
    const/16 v4, 0xff

    goto/16 :goto_8

    :cond_22
    const/16 v14, 0x50

    invoke-static {v14}, Lmp;->q(I)I

    move-result v14

    goto/16 :goto_9

    :cond_23
    const-string v14, "0kOkLcOyON+3\n"

    const-string v4, "8Xfga4X0fpk=\n"

    goto/16 :goto_a

    :cond_24
    const-string v14, "oKRF8qsw4dSz\n"

    const-string v4, "g5R2wpsA0eQ=\n"

    goto/16 :goto_b

    :cond_25
    const-string v14, "TvAi7gP6RJZd\n"

    const-string v4, "bcAU3jPKdKY=\n"

    goto/16 :goto_c

    :cond_26
    const/16 v4, 0x18

    invoke-static {v4}, Lmp;->q(I)I

    move-result v4

    goto/16 :goto_d

    :cond_27
    const/16 v4, 0x1e

    goto/16 :goto_e

    :cond_28
    const/16 v4, 0x700

    goto/16 :goto_f

    :cond_29
    move v6, v4

    goto/16 :goto_4
.end method

.method public static final b(Landroid/app/Activity;I)Landroid/widget/ScrollView;
    .locals 5

    const/4 v0, 0x0

    const/4 v4, 0x0

    const-string v1, "\u06e7\u06e2\u06e6"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v3

    move-object v1, v0

    move-object v2, v0

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v0, Lg7;

    sget v1, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    xor-int/lit16 v1, v1, 0x19c

    invoke-direct {v0, v1}, Lg7;-><init>(I)V

    sget v1, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    if-gtz v1, :cond_5

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    const-string v1, "\u06e0\u06e1\u06e1"

    invoke-static {v1}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v3

    move-object v1, v0

    goto :goto_0

    :sswitch_1
    sget v0, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    xor-int/lit16 v0, v0, -0xb5

    invoke-virtual {v2, v0}, Landroid/view/View;->setOverScrollMode(I)V

    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    const-string v0, "\u06e4\u06e5\u06e2"

    invoke-static {v0}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e5\u06e3\u06e3"

    invoke-static {v0}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    move-result v0

    if-gtz v0, :cond_1

    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    const-string v0, "\u06e2\u06e4\u06e8"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v3, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    div-int/2addr v0, v3

    const v3, 0x1ac56b

    xor-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :sswitch_3
    invoke-virtual {v2, v4}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    sget v0, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v3, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    div-int/2addr v0, v3

    const v3, 0x1abda3

    xor-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :sswitch_4
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    const-string v3, "\u06e0\u06e1\u06e1"

    move-object v0, v1

    :goto_1
    invoke-static {v3}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v3

    move-object v1, v0

    goto :goto_0

    :sswitch_5
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    invoke-static {}, Lcom/google/android/material/carousel/ۢۢۢۥ;->۟ۡ۟۠ۧ()I

    move-result v0

    if-gtz v0, :cond_2

    const/16 v0, 0x52

    sput v0, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    const-string v0, "\u06e5\u06e0\u06e4"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_2
    sget v0, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v3, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    rem-int/2addr v0, v3

    const v3, 0x1ab8e2

    add-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :sswitch_6
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, v1, Lg7;->c:F

    sget v0, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    if-gtz v0, :cond_3

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    const-string v0, "\u06e5\u06e4\u06df"

    :goto_2
    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e5\u06e7\u06e1"

    goto :goto_2

    :sswitch_7
    new-instance v2, Landroid/widget/ScrollView;

    invoke-direct {v2, p0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۥۥۢۧ()I

    move-result v0

    if-ltz v0, :cond_4

    invoke-static {}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۠ۢۧۡ()I

    const-string v3, "\u06e7\u06e2\u06e6"

    move-object v0, v1

    goto :goto_1

    :cond_4
    const-string v0, "\u06e2\u06e1\u06e3"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :sswitch_8
    invoke-virtual {v2, v4, v4, v4, p1}, Landroid/view/View;->setPadding(IIII)V

    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v3, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    add-int/2addr v0, v3

    const v3, 0x1aab51

    add-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06e5\u06e4\u06df"

    move-object v3, v1

    goto :goto_1

    :sswitch_9
    return-object v2

    :sswitch_data_0
    .sparse-switch
        0x1aa7dc -> :sswitch_0
        0x1aab00 -> :sswitch_8
        0x1aab9b -> :sswitch_2
        0x1ab284 -> :sswitch_3
        0x1aba81 -> :sswitch_9
        0x1abda9 -> :sswitch_1
        0x1abe05 -> :sswitch_4
        0x1abe20 -> :sswitch_6
        0x1abe7f -> :sswitch_5
        0x1ac56b -> :sswitch_7
    .end sparse-switch
.end method

.method public static final c(Landroid/app/Activity;Lsn;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/view/View;Lo40;Lo40;ILjava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;
    .locals 28

    const/16 v23, 0x0

    const/4 v5, 0x0

    const/16 v17, 0x0

    const/16 v21, 0x0

    const/16 v20, 0x0

    const/16 v19, 0x0

    const/16 v18, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v22, 0x0

    const/4 v4, 0x0

    const-string v6, "\u06e8\u06e7\u06e1"

    invoke-static {v6}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v24, v2

    move-object/from16 v25, v3

    move-object/from16 v26, v4

    move/from16 v27, v5

    :goto_0
    sparse-switch v6, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v2, Lo40;

    sget-object v3, Lo40;->o:Lsh;

    move-object/from16 v0, v23

    invoke-direct {v2, v0, v3}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    new-instance v3, Lp40;

    invoke-direct {v3}, Lp40;-><init>()V

    const-string v4, "\u06df\u06df\u06e7"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v24, v2

    move-object/from16 v25, v3

    move v6, v4

    goto :goto_0

    :cond_0
    :sswitch_1
    sget v2, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v3, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    or-int/lit16 v3, v3, -0x14e7

    xor-int/2addr v2, v3

    if-gtz v2, :cond_1

    const/16 v2, 0x30

    sput v2, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    const-string v2, "\u06e7\u06e2\u06e2"

    :goto_1
    invoke-static {v2}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto :goto_0

    :cond_1
    const-string v2, "\u06df\u06e7\u06e1"

    goto :goto_1

    :sswitch_2
    move-object/from16 v0, v17

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    move-object/from16 v0, v17

    move/from16 v1, v27

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    move-object/from16 v2, v22

    :goto_2
    const-string v3, "\u06e6\u06e1\u06e2"

    invoke-static {v3}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v22, v2

    move v6, v3

    goto :goto_0

    :cond_2
    :sswitch_3
    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v3, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    add-int/lit16 v3, v3, -0xa3b

    sub-int/2addr v2, v3

    if-gtz v2, :cond_3

    const/16 v2, 0x1c

    sput v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    const-string v3, "\u06df\u06e0\u06e1"

    move-object/from16 v2, v17

    :goto_3
    invoke-static {v3}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v17, v2

    move v6, v3

    goto :goto_0

    :cond_3
    sget v2, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v3, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    mul-int/2addr v2, v3

    const v3, 0x1a194b

    add-int/2addr v2, v3

    move v6, v2

    goto :goto_0

    :sswitch_4
    const v2, 0x44bb8000    # 1500.0f

    move-object/from16 v0, v25

    invoke-virtual {v0, v2}, Lp40;->b(F)V

    const/high16 v2, 0x3f000000    # 0.5f

    move-object/from16 v0, v25

    invoke-virtual {v0, v2}, Lp40;->a(F)V

    :goto_4
    const-string v2, "\u06e3\u06e1\u06e4"

    invoke-static {v2}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :sswitch_5
    move-object/from16 v0, v17

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const-string v2, "\u06df\u06e7\u06e1"

    :goto_5
    invoke-static {v2}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :sswitch_6
    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v3, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    or-int/lit16 v3, v3, -0xa38

    rem-int/2addr v2, v3

    if-gtz v2, :cond_4

    const/16 v2, 0x13

    sput v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    const-string v2, "\u06e6\u06e2\u06e2"

    :goto_6
    invoke-static {v2}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_4
    sget v2, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v3, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    or-int/2addr v2, v3

    const v3, 0x1acae6

    add-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_7
    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    xor-int/lit16 v2, v2, 0x1f3

    move-object/from16 v0, v23

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    sget v3, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v4, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    or-int/2addr v3, v4

    const v4, 0x1ac2aa

    add-int/2addr v3, v4

    move/from16 v27, v2

    move v6, v3

    goto/16 :goto_0

    :sswitch_8
    new-instance v2, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object/from16 v0, p15

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget v3, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v4, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    or-int/lit16 v4, v4, 0x21d5

    sub-int/2addr v3, v4

    if-ltz v3, :cond_5

    const-string v3, "\u06e4\u06e4\u06e0"

    :goto_7
    invoke-static {v3}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v18, v2

    move v6, v3

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e4\u06e1\u06e5"

    invoke-static {v3}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v18, v2

    move v6, v3

    goto/16 :goto_0

    :sswitch_9
    move-object/from16 v0, p1

    iget v5, v0, Lsn;->f:I

    move-object/from16 v0, p1

    iget v4, v0, Lsn;->a:I

    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    move-result v2

    if-gtz v2, :cond_6

    const-string v3, "\u06df\u06e7\u06e1"

    move-object/from16 v2, v19

    :goto_8
    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v19, v2

    move/from16 v20, v4

    move/from16 v21, v5

    move v6, v3

    goto/16 :goto_0

    :cond_6
    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v3, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    div-int/2addr v2, v3

    const v3, 0x1ab2ff

    xor-int/2addr v2, v3

    move/from16 v20, v4

    move/from16 v21, v5

    move v6, v2

    goto/16 :goto_0

    :sswitch_a
    move-object/from16 v0, v23

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v23

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v2, "\u06e7\u06e4\u06e4"

    goto/16 :goto_1

    :sswitch_b
    move-object/from16 v0, v25

    move-object/from16 v1, v24

    iput-object v0, v1, Lo40;->k:Lp40;

    new-instance v2, Lo40;

    sget-object v3, Lo40;->p:Lsh;

    move-object/from16 v0, v23

    invoke-direct {v2, v0, v3}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    move-result v3

    if-ltz v3, :cond_7

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    goto/16 :goto_2

    :cond_7
    sget v3, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v4, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    mul-int/2addr v3, v4

    const v4, 0x130bb7

    add-int/2addr v3, v4

    move-object/from16 v22, v2

    move v6, v3

    goto/16 :goto_0

    :sswitch_c
    if-eqz v19, :cond_0

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    move-result v2

    if-gtz v2, :cond_8

    const-string v2, "\u06e0\u06e0\u06df"

    invoke-static {v2}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e8\u06e8\u06e3"

    move-object/from16 v2, v18

    goto/16 :goto_7

    :sswitch_d
    move-object/from16 v0, v17

    move-object/from16 v1, p16

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v2, 0x41b00000    # 22.0f

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    sget v2, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v3, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    mul-int/lit16 v3, v3, 0x2662

    rem-int/2addr v2, v3

    if-ltz v2, :cond_9

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    :cond_9
    const-string v2, "\u06e5\u06e3\u06e0"

    invoke-static {v2}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_a
    :sswitch_e
    sget v2, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    if-gtz v2, :cond_b

    const-string v3, "\u06e8\u06e8\u06e8"

    move-object/from16 v2, v23

    :goto_9
    invoke-static {v3}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v23, v2

    move v6, v3

    goto/16 :goto_0

    :cond_b
    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v3, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    add-int/2addr v2, v3

    const v3, 0x1ab2b7

    add-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_f
    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2}, Lmp;->p(F)F

    move-result v2

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Landroid/view/View;->setElevation(F)V

    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    if-gtz v2, :cond_c

    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    const-string v2, "\u06e8\u06e8\u06e3"

    invoke-static {v2}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u06e2\u06e7\u06e5"

    goto/16 :goto_6

    :sswitch_10
    const/high16 v2, 0x3f000000    # 0.5f

    move-object/from16 v0, v26

    invoke-virtual {v0, v2}, Lp40;->a(F)V

    move-object/from16 v0, v26

    move-object/from16 v1, v22

    iput-object v0, v1, Lo40;->k:Lp40;

    invoke-static {}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦۥۣۥ()I

    move-result v2

    if-ltz v2, :cond_d

    const-string v2, "\u06e2\u06e0\u06e3"

    invoke-static {v2}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u06e4\u06df\u06e0"

    move-object/from16 v2, v17

    goto/16 :goto_3

    :sswitch_11
    new-instance v2, Lx20;

    move-object/from16 v0, v24

    move-object/from16 v1, v22

    invoke-direct {v2, v0, v1}, Lx20;-><init>(Lo40;Lo40;)V

    move-object/from16 v0, v23

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    if-gtz v2, :cond_e

    const-string v2, "\u06e7\u06e3\u06e0"

    goto/16 :goto_5

    :cond_e
    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v3, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    rem-int/2addr v2, v3

    const v3, 0x1aab6b

    add-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_12
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget v5, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    xor-int/lit8 v5, v5, 0x3

    invoke-static {v5}, Lmp;->q(I)I

    move-result v5

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3, v4, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    sget-object v2, Lbo;->a:Landroid/graphics/Typeface;

    invoke-static {}, Landroidx/activity/result/۟ۡۤۦۡ;->۟۟۟ۥۤ()I

    move-result v3

    if-gtz v3, :cond_f

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    const-string v3, "\u06e3\u06e2\u06e6"

    invoke-static {v3}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v19, v2

    move v6, v3

    goto/16 :goto_0

    :cond_f
    const-string v3, "\u06e5\u06e5\u06df"

    move/from16 v4, v20

    move/from16 v5, v21

    goto/16 :goto_8

    :sswitch_13
    move-object/from16 v0, v18

    move/from16 v1, v27

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    sget-object v2, Lqn;->a:Landroid/graphics/Typeface;

    const/4 v3, 0x1

    move-object/from16 v0, v18

    invoke-virtual {v0, v2, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    move-result v2

    if-ltz v2, :cond_11

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    :cond_10
    const-string v2, "\u06e0\u06e7\u06e8"

    invoke-static {v2}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_11
    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v3, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    mul-int/2addr v2, v3

    const v3, 0x1b9314

    add-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_14
    new-instance v2, Lw20;

    move/from16 v3, p14

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p1

    move-object/from16 v14, p11

    move-object/from16 v15, p12

    move-object/from16 v16, p13

    invoke-direct/range {v2 .. v16}, Lw20;-><init>(ILandroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lsn;Landroid/view/View;Lo40;Lo40;)V

    move-object/from16 v0, v23

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-nez v20, :cond_2

    invoke-static {}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->ۢۢۧۨ()I

    move-result v2

    if-gtz v2, :cond_12

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    const-string v2, "\u06df\u06df\u06e7"

    invoke-static {v2}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_12
    const-string v2, "\u06e3\u06e5"

    goto/16 :goto_1

    :sswitch_15
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-direct {v2, v3, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    move-object/from16 v0, v23

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v3, "\u06e0\u06e3\u06e7"

    goto/16 :goto_3

    :sswitch_16
    const/4 v2, 0x1

    move/from16 v0, v20

    if-ne v0, v2, :cond_a

    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v3, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    add-int/lit16 v3, v3, -0x1d90

    or-int/2addr v2, v3

    if-ltz v2, :cond_13

    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    goto/16 :goto_4

    :cond_13
    const-string v2, "\u06e4\u06e4\u06e0"

    goto/16 :goto_6

    :sswitch_17
    new-instance v2, Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const-string v3, "\u06e2\u06e0\u06e3"

    goto/16 :goto_9

    :sswitch_18
    new-instance v2, Lp40;

    invoke-direct {v2}, Lp40;-><init>()V

    const v3, 0x44bb8000    # 1500.0f

    invoke-virtual {v2, v3}, Lp40;->b(F)V

    sget v3, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v4, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    rem-int/2addr v3, v4

    const v4, 0x1abe36

    add-int/2addr v3, v4

    move-object/from16 v26, v2

    move v6, v3

    goto/16 :goto_0

    :sswitch_19
    const/high16 v2, 0x41300000    # 11.0f

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    move-object/from16 v0, v18

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    move-result v2

    if-gtz v2, :cond_10

    const/16 v2, 0x55

    sput v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    const-string v2, "\u06e6\u06e2\u06e5"

    invoke-static {v2}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :sswitch_1a
    return-object v23

    :sswitch_data_0
    .sparse-switch
        0xdc62 -> :sswitch_0
        0x1aa707 -> :sswitch_4
        0x1aa7f9 -> :sswitch_8
        0x1aaadf -> :sswitch_1a
        0x1aab44 -> :sswitch_d
        0x1aabc1 -> :sswitch_13
        0x1ab265 -> :sswitch_7
        0x1ab2fc -> :sswitch_2
        0x1ab320 -> :sswitch_1
        0x1ab340 -> :sswitch_a
        0x1ab646 -> :sswitch_b
        0x1ab667 -> :sswitch_6
        0x1ab702 -> :sswitch_18
        0x1ab9c5 -> :sswitch_11
        0x1aba08 -> :sswitch_19
        0x1aba60 -> :sswitch_f
        0x1abde9 -> :sswitch_10
        0x1abe02 -> :sswitch_9
        0x1abe3f -> :sswitch_c
        0x1ac187 -> :sswitch_12
        0x1ac1a9 -> :sswitch_15
        0x1ac23f -> :sswitch_e
        0x1ac52d -> :sswitch_3
        0x1ac584 -> :sswitch_16
        0x1ac5a7 -> :sswitch_14
        0x1ac9c2 -> :sswitch_17
        0x1ac9e3 -> :sswitch_5
    .end sparse-switch
.end method

.method public static final d(Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lsn;Landroid/view/View;Lo40;Lo40;IZ)V
    .locals 46

    const/16 v38, 0x0

    const/16 v25, 0x0

    const/4 v6, 0x0

    const/16 v31, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v12, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v23, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/16 v24, 0x0

    const/4 v5, 0x0

    const/16 v40, 0x0

    const/4 v3, 0x0

    const/4 v15, 0x0

    const/16 v21, 0x0

    const/4 v10, 0x0

    const/4 v8, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/16 v28, 0x0

    const/16 v32, 0x0

    const/16 v39, 0x0

    const/16 v37, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/4 v14, 0x0

    const/16 v22, 0x0

    const-wide/16 v16, 0x0

    const-string v33, "\u06e2\u06df\u06e5"

    invoke-static/range {v33 .. v33}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v41

    move-object/from16 v33, v2

    move-object/from16 v34, v5

    move-object/from16 v35, v24

    move-object/from16 v36, v25

    :goto_0
    sparse-switch v41, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual/range {v31 .. v31}, Landroid/view/View;->getX()F

    move-result v2

    invoke-virtual/range {v31 .. v31}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-float v5, v5

    const/high16 v24, 0x41900000    # 18.0f

    add-float v5, v5, v24

    sub-float v5, v5, v26

    const/high16 v24, 0x41900000    # 18.0f

    sub-float v5, v5, v24

    const/high16 v24, 0x40000000    # 2.0f

    div-float v25, v5, v24

    invoke-virtual/range {v31 .. v31}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    const/high16 v24, 0x41b00000    # 22.0f

    add-float v5, v5, v24

    sub-float v5, v5, v27

    const/high16 v24, 0x41b00000    # 22.0f

    sub-float v5, v5, v24

    const/high16 v24, 0x40000000    # 2.0f

    div-float v5, v5, v24

    const/high16 v24, 0x41000000    # 8.0f

    invoke-static/range {v24 .. v24}, Lmp;->p(F)F

    move-result v24

    new-instance v41, Landroid/widget/FrameLayout$LayoutParams;

    move/from16 v0, v26

    float-to-int v0, v0

    move/from16 v42, v0

    move/from16 v0, v27

    float-to-int v0, v0

    move/from16 v43, v0

    invoke-direct/range {v41 .. v43}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    move-object/from16 v0, p10

    move-object/from16 v1, v41

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v41, 0x0

    sub-float v25, v41, v25

    sub-float v2, v2, v25

    move-object/from16 v0, p11

    invoke-virtual {v0, v2}, Lo40;->b(F)V

    sget v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v25, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    move/from16 v0, v25

    mul-int/lit16 v0, v0, 0x8e4

    move/from16 v25, v0

    xor-int v2, v2, v25

    if-ltz v2, :cond_35

    const/4 v2, 0x4

    sput v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    const-string v2, "\u06e2\u06e7\u06df"

    invoke-static {v2}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v41, v2

    move/from16 v42, v5

    move/from16 v43, v24

    goto :goto_0

    :sswitch_1
    invoke-virtual {v14}, Lo40;->h()V

    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v5, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    xor-int/lit16 v5, v5, 0x23bf

    or-int/2addr v2, v5

    if-ltz v2, :cond_0

    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    const-string v5, "\u06e4\u06e2\u06e2"

    move-object v2, v7

    :goto_1
    invoke-static {v5}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v5

    move-object v7, v2

    move/from16 v41, v5

    goto/16 :goto_0

    :cond_0
    sget v2, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v5, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sub-int/2addr v2, v5

    const v5, 0x1ab4db

    add-int/2addr v2, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_2
    const/high16 v2, 0x41700000    # 15.0f

    sub-float v2, v42, v2

    sub-float v2, v2, v43

    const/high16 v5, 0x41700000    # 15.0f

    add-float/2addr v2, v5

    move-object/from16 v0, p12

    invoke-virtual {v0, v2}, Lo40;->b(F)V

    const-string v2, "\u06e3\u06e3\u06e3"

    move-object/from16 v24, v2

    move/from16 v25, v11

    :goto_2
    invoke-static/range {v24 .. v24}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v11, v25

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_3
    aget-object v2, v38, v22

    const/4 v5, 0x0

    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    aget-object v2, v36, v22

    const/high16 v5, 0x41f00000    # 30.0f

    invoke-static {v5}, Lmp;->p(F)F

    move-result v5

    invoke-virtual {v2, v5}, Landroid/view/View;->setTranslationY(F)V

    aget-object v2, v36, v22

    const/4 v5, 0x0

    invoke-virtual {v2, v5}, Landroid/view/View;->setAlpha(F)V

    aget-object v2, v36, v22

    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual {v2, v5}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const-wide/16 v24, -0x2b8

    sget v5, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    int-to-long v0, v5

    move-wide/from16 v44, v0

    xor-long v24, v24, v44

    move-wide/from16 v0, v24

    invoke-virtual {v2, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    aget-object v2, v36, v22

    const/high16 v5, 0x7e040000

    sget v19, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    xor-int v5, v5, v19

    sget v19, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v20, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    or-int/lit8 v20, v20, 0x4f

    sub-int v19, v19, v20

    if-ltz v19, :cond_13

    const/16 v19, 0x29

    sput v19, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    const-string v19, "\u06e4\u06e1\u06e8"

    invoke-static/range {v19 .. v19}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v24

    move-object/from16 v19, v2

    move/from16 v20, v5

    move/from16 v41, v24

    goto/16 :goto_0

    :sswitch_4
    const-string v2, "\u06e7\u06e4\u06e3"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v2

    move-object v9, v8

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_5
    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v5, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    add-int/lit16 v5, v5, -0x1794

    or-int/2addr v2, v5

    if-ltz v2, :cond_1

    const-string v2, "\u06e5\u06e1\u06e5"

    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_1
    const-string v2, "\u06e2\u06e1\u06e6"

    :goto_3
    invoke-static {v2}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_6
    move v2, v11

    move v5, v12

    :cond_2
    sget v11, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v12, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    rem-int/lit16 v12, v12, -0x17aa

    or-int/2addr v11, v12

    if-ltz v11, :cond_3

    const/16 v11, 0x40

    sput v11, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    const-string v11, "\u06df\u06e7\u06e2"

    :goto_4
    invoke-static {v11}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v24

    move v11, v2

    move v12, v5

    move/from16 v41, v24

    goto/16 :goto_0

    :cond_3
    const-string v11, "\u06e5\u06e7\u06e0"

    goto :goto_4

    :sswitch_7
    if-nez v30, :cond_17

    new-instance v2, Lo40;

    aget-object v5, v36, v22

    sget-object v14, Lo40;->n:Lsh;

    invoke-direct {v2, v5, v14}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    const/4 v5, 0x0

    const/high16 v14, 0x43480000    # 200.0f

    const v24, 0x3f333333    # 0.7f

    move/from16 v0, v24

    invoke-static {v5, v14, v0}, Lg40;->f(FFF)Lp40;

    move-result-object v5

    iput-object v5, v2, Lo40;->k:Lp40;

    aget-object v5, v36, v22

    move/from16 v0, v20

    invoke-virtual {v5, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    sget v5, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    if-ltz v5, :cond_4

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    :goto_5
    const-string v5, "\u06e4\u06e7\u06e6"

    invoke-static {v5}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v5

    move-object v14, v2

    move/from16 v41, v5

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u06e1\u06e7\u06df"

    move-object v14, v2

    :goto_6
    invoke-static {v5}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_5
    :sswitch_8
    sget v2, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v5, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    mul-int/2addr v2, v5

    const v5, 0x185a26

    add-int/2addr v2, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_9
    if-nez v10, :cond_33

    new-instance v8, Lo40;

    sget-object v2, Lo40;->o:Lsh;

    move-object/from16 v0, v33

    invoke-direct {v8, v0, v2}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    new-instance v2, Lp40;

    invoke-direct {v2}, Lp40;-><init>()V

    const/high16 v5, 0x43480000    # 200.0f

    invoke-virtual {v2, v5}, Lp40;->b(F)V

    const v5, 0x3f19999a    # 0.6f

    invoke-virtual {v2, v5}, Lp40;->a(F)V

    sget v5, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    if-ltz v5, :cond_6

    const/16 v5, 0x3b

    sput v5, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    const-string v5, "\u06e5\u06e7\u06e7"

    invoke-static {v5}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v5

    move-object v7, v2

    move-object v9, v10

    move/from16 v41, v5

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u06e0\u06e8"

    move-object v9, v10

    goto/16 :goto_1

    :cond_7
    :sswitch_a
    sget v2, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v5, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    or-int/lit16 v5, v5, -0x22f3

    add-int/2addr v2, v5

    if-ltz v2, :cond_8

    const/4 v2, 0x4

    sput v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    const-string v2, "\u06e8\u06e5\u06e2"

    invoke-static {v2}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_8
    const-string v2, "\u06e2\u06e8\u06e0"

    invoke-static {v2}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_b
    const-string v2, "\u06e7\u06e7\u06e7"

    move-object/from16 v5, v29

    :goto_7
    invoke-static {v2}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v30, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_c
    instance-of v2, v3, Lo40;

    const/4 v5, 0x0

    if-eqz v2, :cond_27

    move-object v2, v3

    check-cast v2, Lo40;

    sget v10, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    if-ltz v10, :cond_9

    const/16 v10, 0x23

    sput v10, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    :goto_8
    const-string v10, "\u06e8\u06e3\u06e8"

    invoke-static {v10}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v24

    move-object v15, v5

    move-object v10, v2

    move/from16 v41, v24

    goto/16 :goto_0

    :cond_9
    const-string v10, "\u06e2\u06e8\u06e3"

    invoke-static {v10}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v24

    move-object v15, v5

    move-object v10, v2

    move/from16 v41, v24

    goto/16 :goto_0

    :sswitch_d
    const/4 v2, 0x4

    new-array v5, v2, [Landroid/widget/ScrollView;

    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    xor-int/lit16 v2, v2, 0x1e2

    aput-object p0, v5, v2

    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    xor-int/lit16 v2, v2, -0xbf

    aput-object p1, v5, v2

    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    xor-int/lit16 v2, v2, -0x250

    aput-object p2, v5, v2

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    xor-int/lit8 v2, v2, -0x71

    aput-object p3, v5, v2

    const/4 v2, 0x4

    new-array v2, v2, [Landroid/widget/LinearLayout;

    sget v24, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    if-ltz v24, :cond_a

    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    const-string v24, "\u06e3\u06e1\u06e3"

    invoke-static/range {v24 .. v24}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v24

    move-object/from16 v36, v2

    move-object/from16 v38, v5

    move/from16 v41, v24

    goto/16 :goto_0

    :cond_a
    sget v24, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v25, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    rem-int v24, v24, v25

    const v25, 0x1acb4e

    add-int v24, v24, v25

    move-object/from16 v36, v2

    move-object/from16 v38, v5

    move/from16 v41, v24

    goto/16 :goto_0

    :sswitch_e
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v5, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    add-int/2addr v2, v5

    const v5, 0x1abcae

    xor-int/2addr v2, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_f
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v5, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    div-int/2addr v2, v5

    const v5, 0x1aaac1

    xor-int/2addr v2, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_10
    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v5, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    xor-int/2addr v2, v5

    const v5, 0x1aae54

    add-int/2addr v2, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_11
    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v5, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    div-int/2addr v2, v5

    const v5, -0x1ac968

    xor-int/2addr v2, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_12
    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    if-gtz v2, :cond_b

    const/16 v2, 0x1b

    sput v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    const-string v2, "\u06e2\u06df\u06e7"

    invoke-static {v2}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v10, v21

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_b
    sget v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v5, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    xor-int/2addr v2, v5

    const v5, -0x1abf97

    xor-int/2addr v2, v5

    move-object/from16 v10, v21

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_13
    move-object/from16 v0, p9

    iget v2, v0, Lsn;->a:I

    move-object/from16 v0, p9

    iget v13, v0, Lsn;->f:I

    move-object/from16 v0, p9

    iget v5, v0, Lsn;->g:I

    const/4 v11, 0x1

    if-ne v2, v11, :cond_2

    const/high16 v11, 0x42800000    # 64.0f

    invoke-static {v11}, Lmp;->p(F)F

    move-result v26

    const/high16 v11, 0x42000000    # 32.0f

    invoke-static {v11}, Lmp;->p(F)F

    move-result v27

    sget v11, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v12, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    add-int/lit16 v12, v12, -0x1efe

    or-int/2addr v11, v12

    if-ltz v11, :cond_c

    const/16 v11, 0x63

    sput v11, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    const-string v11, "\u06e8\u06e5\u06e7"

    invoke-static {v11}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v24

    move v11, v2

    move v12, v5

    move/from16 v41, v24

    goto/16 :goto_0

    :cond_c
    const-string v11, "\u06df\u06e3"

    move-object/from16 v24, v11

    move/from16 v25, v2

    move v12, v5

    goto/16 :goto_2

    :sswitch_14
    if-nez v32, :cond_31

    new-instance v5, Lo40;

    sget-object v2, Lo40;->p:Lsh;

    move-object/from16 v0, v33

    invoke-direct {v5, v0, v2}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    new-instance v2, Lp40;

    invoke-direct {v2}, Lp40;-><init>()V

    const/high16 v18, 0x43480000    # 200.0f

    move/from16 v0, v18

    invoke-virtual {v2, v0}, Lp40;->b(F)V

    const v18, 0x3f19999a    # 0.6f

    move/from16 v0, v18

    invoke-virtual {v2, v0}, Lp40;->a(F)V

    sget v18, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v24, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    rem-int v18, v18, v24

    const v24, 0x1ab757

    add-int v24, v24, v18

    move-object/from16 v37, v2

    move-object/from16 v39, v5

    move-object/from16 v18, v32

    move/from16 v41, v24

    goto/16 :goto_0

    :sswitch_15
    aget-object v2, v38, v22

    sget v5, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    xor-int/lit16 v5, v5, 0x297

    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v5, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    div-int/2addr v2, v5

    const v5, 0x1abe02

    add-int/2addr v2, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_d
    :sswitch_16
    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v5, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    div-int/2addr v2, v5

    const v5, 0x1ac989

    add-int/2addr v2, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_17
    iput-object v7, v8, Lo40;->k:Lp40;

    move-object/from16 v0, v33

    move/from16 v1, v40

    invoke-virtual {v0, v1, v8}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v5, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sub-int/2addr v2, v5

    const v5, 0x1ac9ab

    xor-int/2addr v2, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_18
    const/high16 v2, 0x3f800000    # 1.0f

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Lo40;->b(F)V

    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v5, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    div-int/2addr v2, v5

    const v5, 0x1aa71f

    add-int/2addr v2, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_19
    invoke-static {}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۥۧۤ۠()I

    move-result v2

    if-ltz v2, :cond_e

    const/16 v2, 0x54

    sput v2, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    const-string v2, "\u06e7\u06e7\u06e7"

    invoke-static {v2}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v18, v39

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_e
    sget v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v5, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    or-int/2addr v2, v5

    const v5, 0x1ab227

    add-int/2addr v2, v5

    move-object/from16 v18, v39

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_1a
    sget v2, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    xor-int/lit16 v2, v2, -0xc8

    aput-object p4, v36, v2

    sget v2, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    xor-int/lit16 v2, v2, -0x248

    aput-object p5, v36, v2

    sget v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    xor-int/lit16 v2, v2, 0x1f5

    aput-object p6, v36, v2

    sget v2, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    xor-int/lit16 v2, v2, -0x20a

    aput-object p7, v36, v2

    move-object/from16 v0, p8

    move/from16 v1, p13

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    const-string v2, "kRoHmpO2CKuRAB/W0bBJpp4cH9bHukmrkAFGmMa5BeWLFhuTk7QHoY0AApKdogChmAof2P+8B6Ce\nHSeXyrocsQ==\n"

    const-string v5, "/29r9rPVacU=\n"

    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v6}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v5, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    add-int/lit16 v5, v5, -0x1091

    or-int/2addr v2, v5

    if-ltz v2, :cond_f

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    const-string v2, "\u06e4\u06e5\u06e0"

    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_f
    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v5, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    rem-int/2addr v2, v5

    const v5, 0x1ab274

    add-int/2addr v2, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_1b
    move-object v2, v4

    check-cast v2, Landroid/widget/TextView;

    const/4 v3, 0x1

    move-object/from16 v0, v33

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    const-string v5, "2SXyuCcMD9PZP+r0ZQpO3tYj6vRzAE7T2D6zunIDAp3DKe6xJw4A2cU/97ApGAfZ0DXq+lMKFsnh\nOfuj\n"

    const-string v24, "t1Ce1Advbr0=\n"

    move-object/from16 v0, v24

    invoke-static {v5, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v5, v3

    check-cast v5, Landroid/widget/TextView;

    const v3, 0x7e0301a3

    sget v24, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    xor-int v24, v24, v3

    move-object/from16 v0, v33

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    sget v25, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v34, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    move/from16 v0, v34

    div-int/lit16 v0, v0, 0xc21

    move/from16 v34, v0

    xor-int v25, v25, v34

    if-ltz v25, :cond_10

    const/16 v25, 0x2c

    sput v25, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    const-string v25, "\u06e8\u06e1\u06e2"

    invoke-static/range {v25 .. v25}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v25

    move-object/from16 v34, v5

    move-object/from16 v35, v2

    move/from16 v40, v24

    move/from16 v41, v25

    goto/16 :goto_0

    :cond_10
    sget v25, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v34, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sub-int v25, v25, v34

    const v34, -0x1ab64d

    xor-int v25, v25, v34

    move-object/from16 v34, v5

    move-object/from16 v35, v2

    move/from16 v40, v24

    move/from16 v41, v25

    goto/16 :goto_0

    :sswitch_1c
    invoke-virtual/range {v19 .. v20}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Lo40;

    if-eqz v5, :cond_38

    check-cast v2, Lo40;

    const-string v5, "\u06df\u06e1\u06e5"

    move-object/from16 v24, v2

    move-object/from16 v25, v15

    :goto_9
    invoke-static {v5}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v29, v24

    move-object/from16 v30, v25

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_1d
    const/16 v23, 0x0

    sget v2, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    if-gtz v2, :cond_11

    const/16 v2, 0x5f

    sput v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    const-string v2, "\u06e1\u06e3\u06e1"

    invoke-static {v2}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_11
    const-string v2, "\u06e5\u06e1\u06e7"

    move-object/from16 v24, v2

    move-object/from16 v25, v21

    :goto_a
    invoke-static/range {v24 .. v24}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v21, v25

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_1e
    const/4 v2, 0x0

    move-object/from16 v0, p12

    invoke-virtual {v0, v2}, Lo40;->b(F)V

    const-string v5, "\u06e0\u06e8\u06e1"

    move-object v2, v7

    goto/16 :goto_1

    :sswitch_1f
    sget v2, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v5, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    add-int/lit16 v5, v5, 0x2601

    div-int/2addr v2, v5

    if-eqz v2, :cond_12

    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    const-string v2, "\u06df\u06e6"

    move-object/from16 v5, v18

    :goto_b
    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v18, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_12
    sget v2, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v5, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    add-int/2addr v2, v5

    const v5, 0x1aa886

    xor-int/2addr v2, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_20
    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    if-gtz v2, :cond_14

    move-object/from16 v2, v19

    move/from16 v5, v20

    :cond_13
    const-string v19, "\u06e7\u06e8\u06e8"

    invoke-static/range {v19 .. v19}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v24

    move-object/from16 v19, v2

    move/from16 v20, v5

    move/from16 v41, v24

    goto/16 :goto_0

    :cond_14
    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v5, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sub-int/2addr v2, v5

    const v5, 0x1aa69f

    add-int/2addr v2, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_21
    const/4 v2, 0x0

    sget v5, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    if-ltz v5, :cond_15

    move/from16 v5, v22

    :goto_c
    const-string v21, "\u06e5\u06e3\u06e6"

    move-object/from16 v24, v21

    move-object/from16 v25, v2

    move/from16 v22, v5

    goto :goto_a

    :cond_15
    sget v5, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v21, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    mul-int v5, v5, v21

    const v21, 0x1da039

    add-int v5, v5, v21

    move-object/from16 v21, v2

    move/from16 v41, v5

    goto/16 :goto_0

    :sswitch_22
    invoke-static {}, Landroidx/activity/result/۟ۡۤۦۡ;->۟۟۟ۥۤ()I

    move-result v2

    if-gtz v2, :cond_16

    const-string v2, "\u06e2\u06df\u06e0"

    :goto_d
    invoke-static {v2}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_16
    sget v2, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v5, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    div-int/2addr v2, v5

    const v5, 0x1abe01

    add-int/2addr v2, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_23
    move-object/from16 v0, v37

    move-object/from16 v1, v39

    iput-object v0, v1, Lo40;->k:Lp40;

    const v2, -0x7e0300e6

    sget v5, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    xor-int/2addr v2, v5

    move-object/from16 v0, v33

    move-object/from16 v1, v39

    invoke-virtual {v0, v2, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    const-string v2, "\u06e3\u06e6\u06df"

    invoke-static {v2}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_17
    :sswitch_24
    sget v2, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    if-ltz v2, :cond_18

    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    const-string v2, "\u06e6\u06e8\u06e2"

    invoke-static {v2}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_18
    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v5, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    add-int/2addr v2, v5

    const v5, -0x1ab93d

    xor-int/2addr v2, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_25
    sget v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    xor-int/lit16 v2, v2, 0x3d8

    add-int v22, v22, v2

    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v5, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    add-int/lit16 v5, v5, 0xfe7

    sub-int/2addr v2, v5

    if-ltz v2, :cond_19

    const-string v2, "\u06e8\u06e3\u06e3"

    invoke-static {v2}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_19
    move-object/from16 v2, v28

    :goto_e
    const-string v5, "\u06df\u06e7\u06e4"

    invoke-static {v5}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v28, v2

    move/from16 v41, v5

    goto/16 :goto_0

    :sswitch_26
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual/range {v31 .. v31}, Landroid/view/View;->getWidth()I

    move-result v5

    invoke-virtual/range {v31 .. v31}, Landroid/view/View;->getHeight()I

    move-result v24

    move/from16 v0, v24

    invoke-direct {v2, v5, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    move-object/from16 v0, p10

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual/range {v31 .. v31}, Landroid/view/View;->getX()F

    move-result v2

    move-object/from16 v0, p11

    invoke-virtual {v0, v2}, Lo40;->b(F)V

    sget v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    if-gtz v2, :cond_1a

    const-string v2, "\u06e2\u06e8\u06e8"

    goto/16 :goto_3

    :cond_1a
    const-string v2, "\u06e1\u06e2\u06df"

    goto/16 :goto_d

    :sswitch_27
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-wide/from16 v0, v16

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v5, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    or-int/lit16 v5, v5, -0x83a

    add-int/2addr v2, v5

    if-ltz v2, :cond_1b

    const/16 v2, 0x35

    sput v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    const-string v2, "\u06e2\u06df\u06e5"

    invoke-static {v2}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_1b
    const-string v2, "\u06e8\u06e5\u06e7"

    :goto_f
    invoke-static {v2}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_1c
    :sswitch_28
    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v5, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    add-int/lit16 v5, v5, -0x1bc6

    add-int/2addr v2, v5

    if-ltz v2, :cond_1d

    const-string v2, "\u06e3\u06e8\u06e3"

    move-object v5, v2

    goto/16 :goto_6

    :cond_1d
    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v5, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    or-int/2addr v2, v5

    const v5, 0x1ab008

    add-int/2addr v2, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_29
    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    move-result v2

    if-ltz v2, :cond_d

    const-string v2, "hVUtyyc1tcaTK5ACZFa8U"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣ۟ۧ۠۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v16

    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v5, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    add-int/lit16 v5, v5, -0xefe

    or-int/2addr v2, v5

    if-ltz v2, :cond_1e

    const/16 v2, 0x4b

    sput v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    const-string v2, "\u06df\u06e2\u06e6"

    invoke-static {v2}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_1e
    move-object v5, v15

    move-object v2, v10

    goto/16 :goto_8

    :sswitch_2a
    sget v2, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    if-gtz v2, :cond_1f

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    const-string v2, "\u06df\u06e5\u06df"

    move-object/from16 v24, v2

    move/from16 v25, v11

    goto/16 :goto_2

    :cond_1f
    const-string v2, "\u06e5\u06e3\u06e6"

    move-object v5, v2

    :goto_10
    invoke-static {v5}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_2b
    move-object v2, v6

    check-cast v2, Landroid/widget/LinearLayout;

    if-eqz p14, :cond_2a

    sget-object v5, Lkn;->a:Lkn;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "\u06e2\u06e8\u06e8"

    move-object/from16 v24, v32

    :goto_11
    invoke-static {v5}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v31, v2

    move-object/from16 v32, v24

    move/from16 v41, v5

    goto/16 :goto_0

    :sswitch_2c
    const/4 v2, 0x0

    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    move-result v5

    if-gtz v5, :cond_20

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    goto/16 :goto_e

    :cond_20
    sget v5, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v24, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sub-int v5, v5, v24

    const v24, -0x1aaa17

    xor-int v5, v5, v24

    move-object/from16 v28, v2

    move/from16 v41, v5

    goto/16 :goto_0

    :cond_21
    :sswitch_2d
    sget v2, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v5, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    add-int/2addr v2, v5

    const v5, 0x1aa5d6

    add-int/2addr v2, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_2e
    sget v2, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v5, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    xor-int/2addr v2, v5

    const v5, -0x1ab8fb

    xor-int/2addr v2, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_2f
    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    xor-int/lit16 v2, v2, -0x31b

    move-object/from16 v0, v31

    invoke-static {v0, v2}, Lkn;->i(Landroid/view/View;I)V

    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    if-gtz v2, :cond_22

    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    const-string v2, "\u06e5\u06e4\u06e7"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_22
    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v5, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    mul-int/2addr v2, v5

    const v5, 0x1a67e2

    add-int/2addr v2, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_30
    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    if-gtz v2, :cond_23

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    const-string v2, "\u06e1\u06e4\u06df"

    move-object v5, v2

    move-object/from16 v24, v29

    move-object/from16 v25, v30

    goto/16 :goto_9

    :cond_23
    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v5, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    add-int/2addr v2, v5

    const v5, 0x1abd78

    add-int/2addr v2, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_31
    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v5, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    rem-int/lit16 v5, v5, 0x1ca

    sub-int/2addr v2, v5

    if-ltz v2, :cond_24

    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    const-string v5, "\u06e5\u06e2"

    move-object/from16 v2, v31

    move-object/from16 v24, v28

    goto/16 :goto_11

    :cond_24
    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v5, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    mul-int/2addr v2, v5

    const v5, -0x1ac803

    xor-int/2addr v2, v5

    move-object/from16 v32, v28

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_32
    const/4 v2, 0x4

    move/from16 v0, v22

    if-ge v0, v2, :cond_1c

    move-object/from16 v0, p8

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    const-string v4, "nFotyy10vQOcQDWHb3L8DpNcNYd5ePwDnUFsyXh7sE2GVjHCLXayCYBAKMMjYLUJlUo1iUF+sgiT\nXQ3GdHipGQ==\n"

    const-string v5, "8i9Bpw0X3G0=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v2, Landroid/widget/LinearLayout;

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    const-string v5, "Bn+S7XvrzcsGZYqhOe2Mxgl5iqEv54zLB2TT7y7kwIUcc47ke+nCwRpll+V1/8XBD2+Krw/t1NE+\nY5v2\n"

    const-string v24, "aAr+gVuIrKU=\n"

    move-object/from16 v0, v24

    invoke-static {v5, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    sget v5, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v24, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    move/from16 v0, v24

    rem-int/lit16 v0, v0, 0x1a82

    move/from16 v24, v0

    sub-int v5, v5, v24

    if-ltz v5, :cond_25

    const-string v5, "\u06e5\u06e7\u06e0"

    invoke-static {v5}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v33, v2

    move/from16 v41, v5

    goto/16 :goto_0

    :cond_25
    sget v5, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v24, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    or-int v5, v5, v24

    const v24, -0x1ab064

    xor-int v5, v5, v24

    move-object/from16 v33, v2

    move/from16 v41, v5

    goto/16 :goto_0

    :sswitch_33
    move/from16 v0, v22

    move/from16 v1, p13

    if-ne v0, v1, :cond_5

    move-object/from16 v0, v35

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setTextColor(I)V

    move-object/from16 v0, v34

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setTextColor(I)V

    if-nez v11, :cond_29

    const v2, 0x3f933333    # 1.15f

    invoke-virtual {v9, v2}, Lo40;->b(F)V

    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    if-ltz v2, :cond_26

    const-string v2, "\u06e8\u06df\u06e4"

    invoke-static {v2}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_26
    move-object v2, v14

    goto/16 :goto_5

    :sswitch_34
    move-object v5, v15

    :cond_27
    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    move-result v2

    if-ltz v2, :cond_28

    const/16 v2, 0x2d

    sput v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    const-string v2, "\u06e7\u06e4\u06e5"

    :goto_12
    invoke-static {v2}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v2

    move-object v15, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_28
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v15, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sub-int/2addr v2, v15

    const v15, 0x1ab438

    xor-int/2addr v2, v15

    move-object v15, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_29
    :sswitch_35
    const-string v2, "\u06e4\u06e6\u06e5"

    move-object v5, v15

    goto :goto_12

    :sswitch_36
    move-object/from16 v2, v31

    :cond_2a
    sget v5, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    if-ltz v5, :cond_2b

    const-string v5, "\u06e3\u06e2\u06e2"

    move-object/from16 v31, v2

    goto/16 :goto_10

    :cond_2b
    sget v5, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v24, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    xor-int v5, v5, v24

    const v24, 0x1aab7b

    add-int v5, v5, v24

    move-object/from16 v31, v2

    move/from16 v41, v5

    goto/16 :goto_0

    :sswitch_37
    move-object/from16 v0, v35

    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setTextColor(I)V

    move-object/from16 v0, v34

    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setTextColor(I)V

    if-nez v11, :cond_21

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v9, v2}, Lo40;->b(F)V

    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    if-ltz v2, :cond_2c

    const-string v2, "\u06df\u06e3"

    invoke-static {v2}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_2c
    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v5, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    div-int/2addr v2, v5

    const v5, 0x1ac52c

    add-int/2addr v2, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_38
    sget v2, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    if-ltz v2, :cond_2d

    const-string v2, "\u06e7\u06e0\u06e2"

    goto/16 :goto_f

    :cond_2d
    const-string v2, "\u06e8\u06e3\u06e3"

    goto/16 :goto_f

    :sswitch_39
    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    move-result v2

    if-ltz v2, :cond_2e

    const-string v2, "\u06e7\u06e8"

    invoke-static {v2}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_2e
    sget v2, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v5, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    div-int/2addr v2, v5

    const v5, 0x1ab264

    add-int/2addr v2, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_3a
    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    if-gtz v2, :cond_2f

    const/16 v2, 0x1f

    sput v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    const-string v2, "\u06e1\u06e1\u06e3"

    invoke-static {v2}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v14, v30

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_2f
    const-string v2, "\u06e4\u06e5\u06e0"

    move-object/from16 v14, v30

    move-object/from16 v5, v30

    goto/16 :goto_7

    :sswitch_3b
    const v2, 0x3f933333    # 1.15f

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Lo40;->b(F)V

    sget v2, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v5, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    add-int/lit16 v5, v5, -0xd34

    add-int/2addr v2, v5

    if-ltz v2, :cond_30

    const-string v2, "\u06df\u06e5\u06e7"

    invoke-static {v2}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_30
    const-string v2, "\u06e4\u06e6\u06e5"

    :goto_13
    invoke-static {v2}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_31
    move-object/from16 v5, v32

    :goto_14
    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    move-result v2

    if-gtz v2, :cond_32

    const-string v2, "\u06e5\u06e0\u06e8"

    invoke-static {v2}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v18, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_32
    const-string v2, "\u06e1\u06e4\u06e6"

    goto/16 :goto_b

    :cond_33
    move-object v9, v10

    :sswitch_3c
    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    if-ltz v2, :cond_34

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    const-string v2, "\u06e6\u06e5"

    move-object/from16 v5, v30

    goto/16 :goto_7

    :cond_34
    sget v2, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v5, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    or-int/2addr v2, v5

    const v5, 0x1ac629

    add-int/2addr v2, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :cond_35
    sget v2, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v25, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    mul-int v2, v2, v25

    const v25, -0xe70f

    xor-int v2, v2, v25

    move/from16 v41, v2

    move/from16 v42, v5

    move/from16 v43, v24

    goto/16 :goto_0

    :sswitch_3d
    sget v2, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v5, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    mul-int/lit16 v5, v5, 0x3ff

    div-int/2addr v2, v5

    if-eqz v2, :cond_36

    const/16 v2, 0xd

    sput v2, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    const-string v2, "\u06e3\u06e3\u06e3"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v41, v2

    move/from16 v22, v23

    goto/16 :goto_0

    :cond_36
    move-object/from16 v2, v21

    move/from16 v5, v23

    goto/16 :goto_c

    :sswitch_3e
    const v2, 0x7e03015d

    sget v5, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    xor-int/2addr v2, v5

    move-object/from16 v0, v33

    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Lo40;

    if-eqz v5, :cond_7

    check-cast v2, Lo40;

    invoke-static {}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦۥۣۥ()I

    move-result v5

    if-ltz v5, :cond_37

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    const-string v5, "\u06e6\u06e3\u06e3"

    invoke-static {v5}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v32, v2

    move/from16 v41, v5

    goto/16 :goto_0

    :cond_37
    sget v5, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v24, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    add-int v5, v5, v24

    const v24, 0x1ab476

    xor-int v5, v5, v24

    move-object/from16 v32, v2

    move/from16 v41, v5

    goto/16 :goto_0

    :cond_38
    move-object/from16 v30, v15

    :sswitch_3f
    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    move-result v2

    if-ltz v2, :cond_39

    const-string v2, "\u06e5\u06e0\u06e6"

    goto/16 :goto_13

    :cond_39
    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v5, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    mul-int/2addr v2, v5

    const v5, 0x19f6e6

    add-int/2addr v2, v5

    move/from16 v41, v2

    goto/16 :goto_0

    :sswitch_40
    return-void

    :sswitch_41
    move-object/from16 v5, v18

    goto/16 :goto_14

    :sswitch_data_0
    .sparse-switch
        0xdbe4 -> :sswitch_0
        0xdc08 -> :sswitch_17
        0xdc24 -> :sswitch_16
        0xdc9d -> :sswitch_35
        0xdcbe -> :sswitch_2
        0xdce1 -> :sswitch_41
        0x1aa720 -> :sswitch_15
        0x1aa743 -> :sswitch_b
        0x1aa763 -> :sswitch_22
        0x1aa77b -> :sswitch_1f
        0x1aa7c1 -> :sswitch_12
        0x1aa7dc -> :sswitch_30
        0x1aa7fc -> :sswitch_2e
        0x1aa81a -> :sswitch_13
        0x1aaac1 -> :sswitch_22
        0x1aabd9 -> :sswitch_1d
        0x1aaea8 -> :sswitch_36
        0x1aaec3 -> :sswitch_34
        0x1aaec4 -> :sswitch_31
        0x1aaede -> :sswitch_1e
        0x1aaeff -> :sswitch_29
        0x1aaf23 -> :sswitch_33
        0x1aaf79 -> :sswitch_20
        0x1ab248 -> :sswitch_d
        0x1ab24a -> :sswitch_8
        0x1ab261 -> :sswitch_1b
        0x1ab264 -> :sswitch_11
        0x1ab280 -> :sswitch_2b
        0x1ab287 -> :sswitch_1f
        0x1ab33a -> :sswitch_24
        0x1ab35a -> :sswitch_2c
        0x1ab35d -> :sswitch_38
        0x1ab362 -> :sswitch_2f
        0x1ab609 -> :sswitch_c
        0x1ab645 -> :sswitch_21
        0x1ab662 -> :sswitch_39
        0x1ab683 -> :sswitch_5
        0x1ab69f -> :sswitch_f
        0x1ab6a2 -> :sswitch_23
        0x1ab6dc -> :sswitch_19
        0x1aba0b -> :sswitch_11
        0x1aba24 -> :sswitch_3a
        0x1aba7f -> :sswitch_1
        0x1abaa3 -> :sswitch_3
        0x1abac3 -> :sswitch_3b
        0x1abac5 -> :sswitch_2a
        0x1abdc9 -> :sswitch_e
        0x1abdcb -> :sswitch_3d
        0x1abe02 -> :sswitch_25
        0x1abe08 -> :sswitch_32
        0x1abe28 -> :sswitch_28
        0x1abe7e -> :sswitch_26
        0x1abe85 -> :sswitch_9
        0x1ac148 -> :sswitch_a
        0x1ac1c6 -> :sswitch_37
        0x1ac50e -> :sswitch_10
        0x1ac529 -> :sswitch_6
        0x1ac52c -> :sswitch_18
        0x1ac5a6 -> :sswitch_3e
        0x1ac607 -> :sswitch_7
        0x1ac61f -> :sswitch_2d
        0x1ac627 -> :sswitch_1c
        0x1ac8cd -> :sswitch_2a
        0x1ac8ed -> :sswitch_3c
        0x1ac909 -> :sswitch_3f
        0x1ac948 -> :sswitch_e
        0x1ac94d -> :sswitch_27
        0x1ac965 -> :sswitch_14
        0x1ac969 -> :sswitch_4
        0x1ac98a -> :sswitch_40
        0x1ac9c0 -> :sswitch_30
        0x1ac9c7 -> :sswitch_1a
    .end sparse-switch
.end method
