.class public final Ls20;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ls20;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "\u06e6\u06e8\u06e8"

    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v0, Ls20;

    invoke-direct {v0}, Ls20;-><init>()V

    sput-object v0, Ls20;->a:Ls20;

    sget v0, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    or-int/lit16 v1, v1, 0x245

    div-int/2addr v0, v1

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    const-string v0, "\u06e6\u06e8\u06e8"

    invoke-static {v0}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    const-string v0, "5oIDjgoYF5zSgRa+GAQRheq4H78NAhmF7oI=\n"

    const-string v1, "jed60XlweOs=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget v0, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v1, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    mul-int/2addr v0, v1

    const v1, -0x197d0a

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->۟ۡۨۢ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\u06e3\u06e0\u06e0"

    :goto_1
    invoke-static {v0}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v1, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    add-int/2addr v0, v1

    const v1, 0x1ac410

    add-int/2addr v0, v1

    goto :goto_0

    :cond_1
    const-string v0, "\u06e6\u06e5\u06e4"

    goto :goto_1

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aaea6 -> :sswitch_0
        0x1aaf5a -> :sswitch_2
        0x1ac205 -> :sswitch_3
        0x1ac266 -> :sswitch_1
    .end sparse-switch
.end method

.method public static a(Landroid/app/Activity;)V
    .locals 50

    const-string v4, "JAz6\n"

    const-string v5, "RW+OG+3uB6Q=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p0

    invoke-static {v4, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v4, Lgn;->a:Lgn;

    const-string v5, "ia53nixGv8S9pmGlLQ==\n"

    const-string v6, "4ssOwUgnza8=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x0

    invoke-static {v5, v4}, Lgn;->b(Ljava/lang/String;I)I

    move-result v4

    const/4 v5, 0x1

    if-eq v4, v5, :cond_7

    const/4 v5, 0x2

    if-eq v4, v5, :cond_0

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1d

    if-lt v4, v5, :cond_7

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    iget v4, v4, Landroid/content/res/Configuration;->uiMode:I

    xor-int/lit8 v5, v4, -0x31

    and-int/2addr v4, v5

    const/16 v5, 0x20

    if-ne v4, v5, :cond_7

    :cond_0
    const/16 v20, 0x1

    :goto_0
    const-string v4, "4qKXZXH50bHovoFPcM/9qfCriw==\n"

    const-string v5, "icfuOgSQjt0=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lgn;->b(Ljava/lang/String;I)I

    move-result v4

    const/4 v5, 0x1

    if-lt v4, v5, :cond_8

    const/4 v4, 0x1

    :goto_1
    sget-object v5, Lpn;->a:[Ljava/lang/String;

    const-string v5, "oBPrf5KgNA==\n"

    const-string v6, "w3yFC/fYQP0=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const/4 v5, 0x1

    if-lt v4, v5, :cond_9

    const/4 v5, 0x1

    :goto_2
    const-string v4, "NZ67LrV8FPcxlp0QtWoC7SqkoR66ZhU=\n"

    const-string v6, "XvvCcdYJZ4M=\n"

    invoke-static {v4, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "7yVrl6AKhg==\n"

    const-string v7, "zBVb1pRMwAA=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    :try_start_0
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v4

    :goto_3
    const-string v6, "jh3JsDwgDOaIEdOwOzYO6Jc=\n"

    const-string v7, "5Xiw71hZYoc=\n"

    sget-object v8, Lgn;->a:Lgn;

    invoke-static {v6, v7, v8}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v6

    if-eqz v6, :cond_2a

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1f

    if-lt v6, v7, :cond_2a

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
    sget-object v4, Lgn;->a:Lgn;

    const-string v7, "jut+0uQ86dK652Ti+Sc=\n"

    const-string v8, "5Y4HjZdUhqU=\n"

    invoke-static {v7, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x1

    invoke-static {v7, v4}, Lgn;->a(Ljava/lang/String;Z)Z

    move-result v18

    const-string v4, "CrkcgD9waFc+qAyxIkxmWgK5C6s=\n"

    const-string v7, "Ydxl31YTBzk=\n"

    invoke-static {v4, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x0

    invoke-static {v4, v7}, Lgn;->a(Ljava/lang/String;Z)Z

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

    sget-object v22, Lpn;->b:Ljava/util/concurrent/ConcurrentHashMap;

    move-object/from16 v0, v22

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lon;

    if-eqz v4, :cond_a

    move-object v5, v4

    :goto_5
    iget v0, v5, Lon;->g:I

    move/from16 v16, v0

    iget v4, v5, Lon;->f:I

    iget-boolean v0, v5, Lon;->p:Z

    move/from16 v32, v0

    iget v15, v5, Lon;->c:I

    iget v0, v5, Lon;->a:I

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

    new-instance v6, Lu6;

    const/16 v7, 0xe

    move-object/from16 v0, v33

    invoke-direct {v6, v0, v7}, Lu6;-><init>(Landroid/app/Dialog;I)V

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

    invoke-static {v0, v6}, Lz30;->g(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

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

    iget v7, v5, Lon;->b:I

    invoke-virtual {v6, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    iget v7, v5, Lon;->j:F

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

    invoke-static {v9}, Lff;->q(I)I

    move-result v9

    const/4 v10, 0x5

    invoke-static {v10}, Lff;->q(I)I

    move-result v10

    invoke-direct {v8, v9, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v9, 0x11

    iput v9, v8, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    const/16 v9, 0x10

    invoke-static {v9}, Lff;->q(I)I

    move-result v9

    iput v9, v8, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    const/16 v9, 0x10

    invoke-static {v9}, Lff;->q(I)I

    move-result v9

    iput v9, v8, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v7, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v8, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 v9, 0x50

    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setAlpha(I)V

    const/high16 v9, 0x41200000    # 10.0f

    invoke-static {v9}, Lff;->p(F)F

    move-result v9

    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v7, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v36

    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v7, Lr20;

    move/from16 v0, v35

    move-object/from16 v1, v33

    move-object/from16 v2, v36

    invoke-direct {v7, v0, v1, v2}, Lr20;-><init>(ILandroid/app/Dialog;Landroid/widget/LinearLayout;)V

    invoke-virtual {v6, v7}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    new-instance v6, Landroid/widget/FrameLayout;

    move-object/from16 v0, p0

    invoke-direct {v6, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/16 v7, 0x18

    invoke-static {v7}, Lff;->q(I)I

    move-result v7

    const/4 v8, 0x0

    invoke-static {v8}, Lff;->q(I)I

    move-result v8

    const/16 v9, 0x18

    invoke-static {v9}, Lff;->q(I)I

    move-result v9

    const/16 v10, 0x14

    invoke-static {v10}, Lff;->q(I)I

    move-result v10

    invoke-virtual {v6, v7, v8, v9, v10}, Landroid/view/View;->setPadding(IIII)V

    new-instance v7, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v7, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v8, "DzVIeg==\n"

    const-string v9, "SFAtEYnsH4w=\n"

    const/high16 v10, 0x41a00000    # 20.0f

    move/from16 v0, v16

    invoke-static {v8, v9, v7, v10, v0}, Lz30;->n(Ljava/lang/String;Ljava/lang/String;Landroid/widget/TextView;FI)V

    sget-object v8, Lmn;->a:Landroid/graphics/Typeface;

    const/4 v9, 0x3

    invoke-virtual {v7, v8, v9}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    const/16 v8, 0x14

    invoke-static {v8}, Lff;->q(I)I

    move-result v8

    const/16 v9, 0x8

    invoke-static {v9}, Lff;->q(I)I

    move-result v9

    const/16 v10, 0x14

    invoke-static {v10}, Lff;->q(I)I

    move-result v10

    const/16 v11, 0x8

    invoke-static {v11}, Lff;->q(I)I

    move-result v11

    invoke-virtual {v7, v8, v9, v10, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v8, v15}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v9, 0x42c80000    # 100.0f

    invoke-static {v9}, Lff;->p(F)F

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

    new-instance v8, Lv6;

    const/4 v9, 0x1

    move-object/from16 v0, v33

    invoke-direct {v8, v7, v0, v9}, Lv6;-><init>(Landroid/widget/TextView;Landroid/app/Dialog;I)V

    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v7, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v7, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v8, "wL7a\n"

    const-string v9, "LzlsMVMe3co=\n"

    const/high16 v10, 0x41a00000    # 20.0f

    invoke-static {v8, v9, v7, v10, v4}, Lz30;->n(Ljava/lang/String;Ljava/lang/String;Landroid/widget/TextView;FI)V

    sget-object v4, Lxn;->a:Landroid/graphics/Typeface;

    sget-object v4, Lxn;->a:Landroid/graphics/Typeface;

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

    invoke-static {v8}, Lff;->q(I)I

    move-result v8

    const/16 v9, 0x28

    invoke-static {v9}, Lff;->q(I)I

    move-result v9

    invoke-direct {v4, v8, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const v8, 0x800015

    iput v8, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {v7, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v4, Ly5;

    const/4 v8, 0x5

    move-object/from16 v0, p0

    invoke-direct {v4, v0, v8, v5}, Ly5;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v7, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-static {v7, v5}, Lxn;->c(Landroid/view/View;Lon;)V

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

    if-nez v17, :cond_1f

    const/16 v4, 0x78

    invoke-static {v4}, Lff;->q(I)I

    move-result v4

    :goto_6
    move-object/from16 v0, p0

    invoke-static {v0, v4}, Ls20;->b(Landroid/app/Activity;I)Landroid/widget/ScrollView;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Ls20;->b(Landroid/app/Activity;I)Landroid/widget/ScrollView;

    move-result-object v7

    const/16 v8, 0x8

    invoke-virtual {v7, v8}, Landroid/view/View;->setVisibility(I)V

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Ls20;->b(Landroid/app/Activity;I)Landroid/widget/ScrollView;

    move-result-object v8

    const/16 v9, 0x8

    invoke-virtual {v8, v9}, Landroid/view/View;->setVisibility(I)V

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Ls20;->b(Landroid/app/Activity;I)Landroid/widget/ScrollView;

    move-result-object v9

    const/16 v4, 0x8

    invoke-virtual {v9, v4}, Landroid/view/View;->setVisibility(I)V

    const/4 v4, 0x1

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lz30;->g(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    move-result-object v10

    const/4 v4, 0x0

    const/16 v11, 0x8

    invoke-static {v11}, Lff;->q(I)I

    move-result v11

    const/4 v12, 0x0

    const/16 v13, 0x18

    invoke-static {v13}, Lff;->q(I)I

    move-result v13

    invoke-virtual {v10, v4, v11, v12, v13}, Landroid/view/View;->setPadding(IIII)V

    const/4 v4, 0x1

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lz30;->g(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    move-result-object v11

    const/4 v4, 0x0

    const/16 v12, 0x8

    invoke-static {v12}, Lff;->q(I)I

    move-result v12

    const/4 v13, 0x0

    const/16 v19, 0x18

    invoke-static/range {v19 .. v19}, Lff;->q(I)I

    move-result v19

    move/from16 v0, v19

    invoke-virtual {v11, v4, v12, v13, v0}, Landroid/view/View;->setPadding(IIII)V

    const/4 v4, 0x1

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lz30;->g(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    move-result-object v12

    const/4 v4, 0x0

    const/16 v13, 0x8

    invoke-static {v13}, Lff;->q(I)I

    move-result v13

    const/16 v19, 0x0

    const/16 v20, 0x18

    invoke-static/range {v20 .. v20}, Lff;->q(I)I

    move-result v20

    move/from16 v0, v19

    move/from16 v1, v20

    invoke-virtual {v12, v4, v13, v0, v1}, Landroid/view/View;->setPadding(IIII)V

    const/4 v4, 0x1

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lz30;->g(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    move-result-object v13

    const/4 v4, 0x0

    const/16 v19, 0x8

    invoke-static/range {v19 .. v19}, Lff;->q(I)I

    move-result v19

    const/16 v20, 0x0

    const/16 v21, 0x18

    invoke-static/range {v21 .. v21}, Lff;->q(I)I

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

    const-string v4, "fmPJ\n"

    const-string v14, "HwC9IgZ88Gc=\n"

    invoke-static {v4, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v4, "98Mg0ePP\n"

    const-string v14, "k6pBvYyotto=\n"

    invoke-static {v4, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v4, "yzm0354=\n"

    const-string v14, "v1HRsvuyxno=\n"

    invoke-static {v4, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v4, "XY0udkXn/BdfizJ2dA==\n"

    const-string v14, "PuJcEwaIkmM=\n"

    invoke-static {v4, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v4, "Njby0yOzJqA0N/3CEg==\n"

    const-string v14, "VV6Tp2DcSNQ=\n"

    invoke-static {v4, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v4, "rBNXiRtWsjOuBmSDFFCyNKMGVQ==\n"

    const-string v14, "zWMn7Hok010=\n"

    invoke-static {v4, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v4, "XeNX/kkC0L5C/0rpQQ/Mjw==\n"

    const-string v14, "LZE+iChhqf0=\n"

    invoke-static {v4, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v4, "7XimI6nnslHsLKN1rea2Vet4onKssbVU\n"

    const-string v14, "jxvAEc+F0Dc=\n"

    invoke-static {v4, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, La80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, Lt20;

    const/16 v19, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, v33

    move/from16 v2, v19

    invoke-direct {v14, v0, v5, v1, v2}, Lt20;-><init>(Landroid/app/Activity;Lon;Landroid/app/Dialog;I)V

    move-object/from16 v0, p0

    invoke-static {v0, v10, v4, v5, v14}, Lxn;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lon;Lsm;)V

    const-string v4, "ALRHxxy+4n8H4kWfG+rkLgbiQ5QfuOYt\n"

    const-string v14, "YtchpnmMgBk=\n"

    invoke-static {v4, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, La80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, Lu20;

    const/16 v19, 0x2

    move-object/from16 v0, p0

    move/from16 v1, v19

    invoke-direct {v14, v0, v5, v1}, Lu20;-><init>(Landroid/app/Activity;Lon;I)V

    move-object/from16 v0, p0

    invoke-static {v0, v10, v4, v5, v14}, Lxn;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lon;Lsm;)V

    const-string v4, "nxRIBHOEa5uZFksDdYdsz5kST1Zx1mrJn0BOUXPV\n"

    const-string v14, "/SYtMBfiCf0=\n"

    invoke-static {v4, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, La80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, Lt20;

    const/16 v19, 0x5

    move-object/from16 v0, p0

    move-object/from16 v1, v33

    move/from16 v2, v19

    invoke-direct {v14, v0, v5, v1, v2}, Lt20;-><init>(Landroid/app/Activity;Lon;Landroid/app/Dialog;I)V

    move-object/from16 v0, p0

    invoke-static {v0, v10, v4, v5, v14}, Lxn;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lon;Lsm;)V

    const-string v4, "mHo2esuOfZKeKDcsz9B6wpl4MSnOj3vA\n"

    const-string v14, "+h5TSq22H/Q=\n"

    invoke-static {v4, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, La80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, Lt20;

    const/16 v19, 0x6

    move-object/from16 v0, p0

    move-object/from16 v1, v33

    move/from16 v2, v19

    invoke-direct {v14, v0, v5, v1, v2}, Lt20;-><init>(Landroid/app/Activity;Lon;Landroid/app/Dialog;I)V

    move-object/from16 v0, p0

    invoke-static {v0, v10, v4, v5, v14}, Lxn;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lon;Lsm;)V

    const-string v4, "5DxnI34z5dXjbWIqf2/hhOA4Y3B5P+HU\n"

    const-string v14, "hloBEx0Lh7A=\n"

    invoke-static {v4, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, La80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, Lu20;

    const/16 v19, 0x3

    move-object/from16 v0, p0

    move/from16 v1, v19

    invoke-direct {v14, v0, v5, v1}, Lu20;-><init>(Landroid/app/Activity;Lon;I)V

    move-object/from16 v0, p0

    invoke-static {v0, v10, v4, v5, v14}, Lxn;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lon;Lsm;)V

    const-string v4, "Ymu8Mj4ynB9kar9kOGWbTGZtuzQ/MJ1E\n"

    const-string v14, "AAjZUVoA/nw=\n"

    invoke-static {v4, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, La80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, Lt20;

    const/16 v19, 0x7

    move-object/from16 v0, p0

    move-object/from16 v1, v33

    move/from16 v2, v19

    invoke-direct {v14, v0, v5, v1, v2}, Lt20;-><init>(Landroid/app/Activity;Lon;Landroid/app/Dialog;I)V

    move-object/from16 v0, p0

    invoke-static {v0, v11, v4, v5, v14}, Lxn;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lon;Lsm;)V

    const-string v4, "U6TpOPHooF5Vpepu97mmDlL17j/z7qRf\n"

    const-string v14, "MceMW5Xawj0=\n"

    invoke-static {v4, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, La80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, Lu20;

    const/16 v19, 0x4

    move-object/from16 v0, p0

    move/from16 v1, v19

    invoke-direct {v14, v0, v5, v1}, Lu20;-><init>(Landroid/app/Activity;Lon;I)V

    move-object/from16 v0, p0

    invoke-static {v0, v11, v4, v5, v14}, Lxn;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lon;Lsm;)V

    const-string v4, "je0b3rNLvU7qhBmLxUTDEO3d\n"

    const-string v14, "ZG2BOSzuWfY=\n"

    invoke-static {v4, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, Lu20;

    const/16 v19, 0x0

    move-object/from16 v0, p0

    move/from16 v1, v19

    invoke-direct {v14, v0, v5, v1}, Lu20;-><init>(Landroid/app/Activity;Lon;I)V

    move-object/from16 v0, p0

    invoke-static {v0, v11, v4, v5, v14}, Lxn;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lon;Lsm;)V

    const-string v4, "imwKt4A7aynxPDLjxCwQRtJu\n"

    const-string v14, "btSxXiGOjqM=\n"

    invoke-static {v4, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, Lt20;

    const/16 v19, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, v33

    move/from16 v2, v19

    invoke-direct {v14, v0, v5, v1, v2}, Lt20;-><init>(Landroid/app/Activity;Lon;Landroid/app/Dialog;I)V

    move-object/from16 v0, p0

    invoke-static {v0, v11, v4, v5, v14}, Lxn;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lon;Lsm;)V

    const-string v4, "PtjhWrZMORA5jOEFsU89ED/Y4A61TT9N\n"

    const-string v14, "XLuCPNMpW3U=\n"

    invoke-static {v4, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, La80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, Lt20;

    const/16 v19, 0x2

    move-object/from16 v0, p0

    move-object/from16 v1, v33

    move/from16 v2, v19

    invoke-direct {v14, v0, v5, v1, v2}, Lt20;-><init>(Landroid/app/Activity;Lon;Landroid/app/Dialog;I)V

    move-object/from16 v0, p0

    invoke-static {v0, v12, v4, v5, v14}, Lxn;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lon;Lsm;)V

    const-string v4, "kb4MP26VCbCWvQ44aMoN4JDoCj9ung63\n"

    const-string v14, "89hoWQqsa9Q=\n"

    invoke-static {v4, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, La80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, Lt20;

    const/16 v19, 0x3

    move-object/from16 v0, p0

    move-object/from16 v1, v33

    move/from16 v2, v19

    invoke-direct {v14, v0, v5, v1, v2}, Lt20;-><init>(Landroid/app/Activity;Lon;Landroid/app/Dialog;I)V

    move-object/from16 v0, p0

    invoke-static {v0, v12, v4, v5, v14}, Lxn;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lon;Lsm;)V

    const-string v4, "ZTX5t9g5LJtjY/6w3m4ty2Nk+OXaPCifZTD8tdlr\n"

    const-string v14, "B1aagbwITv0=\n"

    invoke-static {v4, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, La80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, Lu20;

    const/16 v19, 0x1

    move-object/from16 v0, p0

    move/from16 v1, v19

    invoke-direct {v14, v0, v5, v1}, Lu20;-><init>(Landroid/app/Activity;Lon;I)V

    move-object/from16 v0, p0

    invoke-static {v0, v13, v4, v5, v14}, Lxn;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lon;Lsm;)V

    const-string v4, "NZ3XF61bbC0xy9VAqwttLTKX0xevCGh5\n"

    const-string v14, "V6+xc8k4Dh8=\n"

    invoke-static {v4, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, La80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, Lt20;

    const/16 v19, 0x4

    move-object/from16 v0, p0

    move-object/from16 v1, v33

    move/from16 v2, v19

    invoke-direct {v14, v0, v5, v1, v2}, Lt20;-><init>(Landroid/app/Activity;Lon;Landroid/app/Dialog;I)V

    move-object/from16 v0, p0

    invoke-static {v0, v13, v4, v5, v14}, Lxn;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lon;Lsm;)V

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

    if-nez v17, :cond_20

    const/16 v4, 0x18

    invoke-static {v4}, Lff;->q(I)I

    move-result v4

    const/4 v14, 0x0

    const/16 v19, 0x18

    invoke-static/range {v19 .. v19}, Lff;->q(I)I

    move-result v19

    const/16 v20, 0x18

    invoke-static/range {v20 .. v20}, Lff;->q(I)I

    move-result v20

    move-object/from16 v0, v37

    move/from16 v1, v19

    move/from16 v2, v20

    invoke-virtual {v0, v4, v14, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    :goto_7
    const/4 v4, 0x1

    move-object/from16 v0, v37

    invoke-virtual {v0, v4}, Landroid/view/View;->setClickable(Z)V

    const-string v4, "R0R6ktiEFvJzQ2y5zocO305AcQ==\n"

    const-string v14, "LCEDzbroY4A=\n"

    invoke-static {v4, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lgn;->e(Ljava/lang/String;)Z

    move-result v19

    if-eqz v19, :cond_22

    if-eqz v32, :cond_21

    const/16 v4, 0x8c

    :goto_8
    new-instance v38, Landroid/widget/FrameLayout;

    move-object/from16 v0, v38

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    if-nez v17, :cond_23

    const/16 v14, 0x40

    invoke-static {v14}, Lff;->q(I)I

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

    invoke-static {v4}, Lff;->p(F)F

    move-result v4

    move-object/from16 v0, v20

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    if-eqz v19, :cond_2

    const/4 v4, 0x1

    invoke-static {v4}, Lff;->q(I)I

    move-result v15

    if-eqz v32, :cond_24

    const-string v14, "olZAavh+C4zH\n"

    const-string v4, "gWcBLL44Tco=\n"

    :goto_a
    invoke-static {v14, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    iget-boolean v4, v5, Lon;->l:Z

    if-eqz v4, :cond_3

    const/high16 v4, 0x41a00000    # 20.0f

    invoke-static {v4}, Lff;->p(F)F

    move-result v4

    move-object/from16 v0, v38

    invoke-virtual {v0, v4}, Landroid/view/View;->setElevation(F)V

    new-instance v4, Lay;

    const/4 v14, 0x1

    invoke-direct {v4, v14}, Lay;-><init>(I)V

    move-object/from16 v0, v38

    invoke-virtual {v0, v4}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    const/16 v4, 0x1c

    move/from16 v0, v18

    if-lt v0, v4, :cond_3

    if-eqz v32, :cond_25

    const-string v4, "vnmBsZDdcQ==\n"

    const-string v14, "nUmxgaDtQYo=\n"

    :goto_b
    invoke-static {v4, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    move-object/from16 v0, v38

    invoke-static {v0, v4}, Lc0;->C(Landroid/widget/FrameLayout;I)V

    if-eqz v32, :cond_26

    const-string v4, "aUb0Ur+Qdw==\n"

    const-string v14, "SnbEYo+gR7E=\n"

    :goto_c
    invoke-static {v4, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    invoke-static {v4}, Lff;->q(I)I

    move-result v14

    const/16 v4, 0x8

    invoke-static {v4}, Lff;->q(I)I

    move-result v15

    const/16 v4, 0x8

    invoke-static {v4}, Lff;->q(I)I

    move-result v18

    if-nez v17, :cond_27

    const/16 v4, 0x8

    invoke-static {v4}, Lff;->q(I)I

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

    invoke-static {v4}, Lff;->p(F)F

    move-result v4

    invoke-virtual {v14, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    const/4 v4, 0x1

    move/from16 v0, v17

    if-ne v0, v4, :cond_28

    const/16 v4, 0x28

    :goto_e
    invoke-virtual {v14, v4}, Landroid/graphics/drawable/GradientDrawable;->setAlpha(I)V

    invoke-virtual {v15, v14}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    move-object/from16 v0, v38

    invoke-virtual {v0, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v16, Lh40;

    sget-object v4, Lh40;->l:Lqh;

    move-object/from16 v0, v16

    invoke-direct {v0, v15, v4}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    new-instance v4, Li40;

    invoke-direct {v4}, Li40;-><init>()V

    const/high16 v14, 0x43480000    # 200.0f

    invoke-virtual {v4, v14}, Li40;->b(F)V

    const v14, 0x3f266666    # 0.65f

    invoke-virtual {v4, v14}, Li40;->a(F)V

    move-object/from16 v0, v16

    iput-object v4, v0, Lh40;->j:Li40;

    new-instance v17, Lh40;

    sget-object v4, Lh40;->m:Lqh;

    move-object/from16 v0, v17

    invoke-direct {v0, v15, v4}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    new-instance v4, Li40;

    invoke-direct {v4}, Li40;-><init>()V

    const/high16 v14, 0x43480000    # 200.0f

    invoke-virtual {v4, v14}, Li40;->b(F)V

    const v14, 0x3f266666    # 0.65f

    invoke-virtual {v4, v14}, Li40;->a(F)V

    move-object/from16 v0, v17

    iput-object v4, v0, Lh40;->j:Li40;

    const/4 v4, 0x0

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lz30;->g(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    move-result-object v14

    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v18, -0x1

    const/16 v19, -0x1

    move/from16 v0, v18

    move/from16 v1, v19

    invoke-direct {v4, v0, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v14, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v18, 0x0

    const-string v4, "GMJvzgAHaTEZlWzP\n"

    const-string v19, "eqEJrGRkC1I=\n"

    move-object/from16 v0, v19

    invoke-static {v4, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, La80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    const-string v4, "gmsl\n"

    const-string v20, "bNaQaFuAjR0=\n"

    move-object/from16 v0, v20

    invoke-static {v4, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    move-object/from16 v4, p0

    invoke-static/range {v4 .. v20}, Ls20;->c(Landroid/app/Activity;Lon;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/view/View;Lh40;Lh40;ILjava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;

    move-result-object v4

    invoke-virtual {v14, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/16 v18, 0x1

    const-string v4, "da50gNqfSUVy+3KI\n"

    const-string v19, "F8sRsLz6KyA=\n"

    move-object/from16 v0, v19

    invoke-static {v4, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, La80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    const-string v4, "I2Nu\n"

    const-string v20, "zdjEgWgwBjw=\n"

    move-object/from16 v0, v20

    invoke-static {v4, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    move-object/from16 v4, p0

    invoke-static/range {v4 .. v20}, Ls20;->c(Landroid/app/Activity;Lon;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/view/View;Lh40;Lh40;ILjava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;

    move-result-object v4

    invoke-virtual {v14, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/16 v18, 0x2

    const-string v4, "n0A24TDzvneeRDDj\n"

    const-string v19, "/XNV1lbL3BQ=\n"

    move-object/from16 v0, v19

    invoke-static {v4, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, La80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    const-string v4, "4j8I\n"

    const-string v20, "DJKl4x7C+iw=\n"

    move-object/from16 v0, v20

    invoke-static {v4, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    move-object/from16 v4, p0

    invoke-static/range {v4 .. v20}, Ls20;->c(Landroid/app/Activity;Lon;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/view/View;Lh40;Lh40;ILjava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;

    move-result-object v4

    invoke-virtual {v14, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/16 v18, 0x3

    const-string v4, "mvvPVdEoyrec+MoC\n"

    const-string v19, "+MisZ7QQqNQ=\n"

    move-object/from16 v0, v19

    invoke-static {v4, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, La80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    const-string v4, "jQ7h\n"

    const-string v20, "YolikdHDqCM=\n"

    move-object/from16 v0, v20

    invoke-static {v4, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    move-object/from16 v4, p0

    invoke-static/range {v4 .. v20}, Ls20;->c(Landroid/app/Activity;Lon;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/view/View;Lh40;Lh40;ILjava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;

    move-result-object v4

    invoke-virtual {v14, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v38

    invoke-virtual {v0, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v18, Ln20;

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

    invoke-direct/range {v18 .. v31}, Ln20;-><init>(Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lon;Landroid/view/View;Lh40;Lh40;)V

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

    if-nez v32, :cond_29

    const/16 v4, 0x2700

    :goto_f
    invoke-virtual {v5}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_5
    new-instance v4, Lo20;

    move/from16 v0, v35

    move-object/from16 v1, v33

    move-object/from16 v2, v36

    invoke-direct {v4, v0, v1, v2}, Lo20;-><init>(ILandroid/app/Dialog;Landroid/widget/LinearLayout;)V

    move-object/from16 v0, v33

    invoke-virtual {v0, v4}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    invoke-virtual/range {v33 .. v33}, Landroid/app/Dialog;->show()V

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    move-result v4

    if-ltz v4, :cond_6

    const-string v4, "t8MiQol6bQ373sptCG58Eth"

    invoke-static {v4}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۦ۟ۧۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v5, v4}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :cond_6
    return-void

    :cond_7
    const/16 v20, 0x0

    goto/16 :goto_0

    :cond_8
    const/4 v4, 0x0

    goto/16 :goto_1

    :cond_9
    const/4 v5, 0x0

    goto/16 :goto_2

    :catch_0
    move-exception v4

    const-string v4, "Nwje\n"

    const-string v6, "Q2m5jaPP2Zc=\n"

    const-string v7, "Nk6oqAnKIW0aWL6oGM0rXAxrgbs=\n"

    const-string v8, "YwfuyWq+Th8=\n"

    invoke-static {v7, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "Fg==\n"

    const-string v9, "c8HJlSTQVfc=\n"

    invoke-static {v4, v6, v7, v8, v9}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "dNCG0GvOKQ==\n"

    const-string v6, "V+C2kV+Ib7g=\n"

    invoke-static {v4, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    goto/16 :goto_3

    :catch_1
    move-exception v6

    const-string v6, "Nwje\n"

    const-string v7, "Q2m5jaPP2Zc=\n"

    const-string v8, "KT2Okj8mwdQFK5uKLxHByhMG\n"

    const-string v9, "fHTI81xSrqY=\n"

    invoke-static {v8, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "Fg==\n"

    const-string v10, "c8HJlSTQVfc=\n"

    invoke-static {v6, v7, v8, v9, v10}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move v6, v4

    goto/16 :goto_4

    :cond_a
    sget-object v4, Lfb0;->k:Lfb0;

    xor-int/lit16 v7, v6, -0x100

    and-int/2addr v7, v6

    const v8, -0xff0001

    xor-int/2addr v8, v6

    and-int/2addr v8, v6

    shr-int/lit8 v8, v8, 0x10

    invoke-static {v8}, La80;->s(I)D

    move-result-wide v8

    const v10, -0xff01

    xor-int/2addr v10, v6

    and-int/2addr v10, v6

    shr-int/lit8 v10, v10, 0x8

    invoke-static {v10}, La80;->s(I)D

    move-result-wide v10

    invoke-static {v7}, La80;->s(I)D

    move-result-wide v12

    const-wide v14, 0x3fc71af7273e5d5eL    # 0.18051042

    mul-double/2addr v14, v12

    const-wide/high16 v16, 0x4031000000000000L    # 17.0

    add-double v14, v14, v16

    const-wide v16, 0x3fd6e341ae4b2c79L    # 0.35762064

    mul-double v16, v16, v10

    const-wide/high16 v24, 0x4014000000000000L    # 5.0

    sub-double v16, v16, v24

    const-wide v24, 0x3fda63c2e8477c96L    # 0.41233895

    mul-double v24, v24, v8

    add-double v16, v16, v24

    const-wide/high16 v24, 0x4014000000000000L    # 5.0

    add-double v16, v16, v24

    add-double v14, v14, v16

    const-wide/high16 v16, 0x4031000000000000L    # 17.0

    sub-double v14, v14, v16

    const-wide v16, 0x3fb27bb2fec56d5dL    # 0.0722

    mul-double v16, v16, v12

    const-wide/16 v24, 0x0

    const-wide v26, 0x3fe6e2eb1c432ca5L    # 0.7152

    mul-double v26, v26, v10

    const-wide/16 v28, 0x0

    const-wide v30, 0x3fcb367a0f9096bcL    # 0.2126

    mul-double v30, v30, v8

    sub-double v28, v28, v30

    sub-double v26, v26, v28

    sub-double v24, v24, v26

    sub-double v16, v16, v24

    const-wide/16 v24, 0x0

    const-wide/16 v26, 0x0

    const-wide v28, 0x3fee693974c0c730L    # 0.95034478

    mul-double v12, v12, v28

    sub-double v12, v26, v12

    const-wide v26, 0x3fbe818525c434ceL    # 0.11916382

    mul-double v10, v10, v26

    const-wide/16 v26, 0x0

    const-wide v28, 0x3f93c8fde0401c25L    # 0.01932141

    mul-double v8, v8, v28

    sub-double v8, v26, v8

    sub-double v8, v10, v8

    sub-double v8, v12, v8

    sub-double v8, v24, v8

    sget-object v10, La80;->a:[[D

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

    iget-object v0, v4, Lfb0;->g:[D

    move-object/from16 v23, v0

    iget-wide v0, v4, Lfb0;->i:D

    move-wide/from16 v38, v0

    iget-wide v0, v4, Lfb0;->d:D

    move-wide/from16 v40, v0

    iget-wide v0, v4, Lfb0;->a:D

    move-wide/from16 v42, v0

    const/16 v44, 0x0

    aget-wide v44, v23, v44

    const-wide/16 v46, 0x0

    const-wide/16 v48, 0x0

    mul-double v26, v26, v8

    sub-double v26, v48, v26

    mul-double/2addr v12, v14

    const-wide/16 v48, 0x0

    mul-double v24, v24, v16

    sub-double v24, v48, v24

    sub-double v12, v12, v24

    sub-double v12, v26, v12

    sub-double v12, v46, v12

    mul-double v12, v12, v44

    const/16 v24, 0x1

    aget-wide v24, v23, v24

    mul-double v26, v28, v14

    const-wide/16 v28, 0x0

    mul-double v30, v30, v16

    sub-double v28, v28, v30

    sub-double v26, v26, v28

    const-wide/16 v28, 0x0

    mul-double v30, v32, v8

    sub-double v28, v28, v30

    sub-double v26, v26, v28

    mul-double v24, v24, v26

    const/16 v26, 0x2

    aget-wide v26, v23, v26

    const-wide/16 v28, 0x0

    const-wide/16 v30, 0x0

    mul-double/2addr v8, v10

    sub-double v8, v30, v8

    mul-double v10, v16, v36

    const-wide/16 v16, 0x0

    mul-double v14, v14, v34

    sub-double v14, v16, v14

    sub-double/2addr v10, v14

    sub-double/2addr v8, v10

    sub-double v8, v28, v8

    mul-double v8, v8, v26

    iget-wide v10, v4, Lfb0;->h:D

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

    const-wide/16 v26, 0x0

    const-wide v28, 0x403b2147ae147ae1L    # 27.13

    sub-double v26, v26, v28

    sub-double v14, v14, v26

    div-double/2addr v12, v14

    invoke-static/range {v24 .. v25}, Ljava/lang/Math;->signum(D)D

    move-result-wide v14

    const-wide/high16 v24, 0x4079000000000000L    # 400.0

    mul-double v14, v14, v24

    mul-double v14, v14, v16

    const-wide v24, 0x403b2147ae147ae1L    # 27.13

    const-wide/16 v26, 0x0

    sub-double v16, v26, v16

    sub-double v16, v24, v16

    div-double v14, v14, v16

    invoke-static {v8, v9}, Ljava/lang/Math;->signum(D)D

    move-result-wide v8

    const-wide/high16 v16, 0x4079000000000000L    # 400.0

    mul-double v8, v8, v16

    mul-double/2addr v8, v10

    const-wide/high16 v16, 0x402e000000000000L    # 15.0

    add-double v10, v10, v16

    const-wide v16, 0x403b2147ae147ae1L    # 27.13

    add-double v10, v10, v16

    const-wide/high16 v16, 0x402e000000000000L    # 15.0

    sub-double v10, v10, v16

    div-double/2addr v8, v10

    const-wide/16 v10, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v24, 0x0

    const-wide/high16 v26, -0x3fd8000000000000L    # -12.0

    mul-double v26, v26, v14

    sub-double v24, v24, v26

    const-wide/high16 v26, 0x4026000000000000L    # 11.0

    mul-double v26, v26, v12

    sub-double v24, v24, v26

    sub-double v16, v16, v24

    sub-double v10, v10, v16

    sub-double v10, v8, v10

    const-wide/high16 v16, 0x4026000000000000L    # 11.0

    div-double v16, v10, v16

    const-wide/high16 v10, 0x4035000000000000L    # 21.0

    add-double/2addr v10, v12

    add-double/2addr v10, v14

    const-wide/high16 v24, 0x4035000000000000L    # 21.0

    sub-double v10, v10, v24

    const-wide/high16 v24, 0x4035000000000000L    # 21.0

    add-double v10, v10, v24

    const-wide/high16 v24, 0x4000000000000000L    # 2.0

    mul-double v24, v24, v8

    sub-double v10, v10, v24

    const-wide/high16 v24, 0x4035000000000000L    # 21.0

    sub-double v10, v10, v24

    const-wide/high16 v24, 0x4022000000000000L    # 9.0

    div-double v24, v10, v24

    const-wide/high16 v10, 0x4034000000000000L    # 20.0

    mul-double/2addr v10, v14

    const-wide/16 v14, 0x0

    const-wide/16 v26, 0x0

    const-wide/high16 v28, 0x4035000000000000L    # 21.0

    mul-double v28, v28, v8

    sub-double v26, v26, v28

    const-wide/high16 v28, 0x4034000000000000L    # 20.0

    mul-double v28, v28, v12

    const-wide/high16 v30, 0x403d000000000000L    # 29.0

    add-double v28, v28, v30

    add-double v28, v28, v10

    const-wide/high16 v30, 0x403d000000000000L    # 29.0

    sub-double v28, v28, v30

    sub-double v26, v26, v28

    sub-double v14, v14, v26

    const-wide/high16 v26, 0x4034000000000000L    # 20.0

    div-double v14, v14, v26

    const-wide/16 v26, 0x0

    const-wide/high16 v28, 0x4044000000000000L    # 40.0

    mul-double v12, v12, v28

    const-wide/high16 v28, 0x403f000000000000L    # 31.0

    sub-double v12, v12, v28

    add-double/2addr v10, v12

    const-wide/high16 v12, 0x403f000000000000L    # 31.0

    add-double/2addr v10, v12

    sub-double v10, v26, v10

    sub-double/2addr v8, v10

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

    if-gez v12, :cond_d

    const-wide v12, 0x4076800000000000L    # 360.0

    const-wide/16 v26, 0x0

    sub-double v8, v26, v8

    sub-double v8, v12, v8

    :cond_b
    :goto_10
    invoke-static {v8, v9}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v12

    iget-wide v0, v4, Lfb0;->b:D

    move-wide/from16 v26, v0

    mul-double v10, v10, v26

    div-double v10, v10, v42

    iget-wide v0, v4, Lfb0;->j:D

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

    if-gez v10, :cond_e

    const-wide/16 v10, 0x0

    const-wide v28, 0x4076800000000000L    # 360.0

    sub-double v10, v10, v28

    sub-double v10, v8, v10

    :goto_11
    const-wide/high16 v28, 0x4000000000000000L    # 2.0

    const-wide/16 v30, 0x0

    invoke-static {v10, v11}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v10

    sub-double v10, v30, v10

    sub-double v10, v28, v10

    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    move-result-wide v10

    iget-wide v0, v4, Lfb0;->e:D

    move-wide/from16 v28, v0

    iget-wide v0, v4, Lfb0;->c:D

    move-wide/from16 v30, v0

    move-wide/from16 v0, v16

    move-wide/from16 v2, v24

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v16

    const-wide/16 v24, 0x0

    const-wide/16 v32, 0x0

    sub-double v10, v32, v10

    const-wide v32, 0x400e666666666666L    # 3.8

    sub-double v10, v10, v32

    sub-double v10, v24, v10

    const-wide/high16 v24, 0x3fd0000000000000L    # 0.25

    mul-double v10, v10, v24

    const-wide v24, 0x40ae0c4ec4ec4ec5L    # 3846.153846153846

    mul-double v10, v10, v24

    mul-double v10, v10, v28

    mul-double v10, v10, v30

    mul-double v10, v10, v16

    const-wide/high16 v16, 0x4000000000000000L    # 2.0

    sub-double v14, v14, v16

    const-wide v16, 0x3fd3851eb851eb85L    # 0.305

    add-double v14, v14, v16

    const-wide/high16 v16, 0x4000000000000000L    # 2.0

    add-double v14, v14, v16

    div-double/2addr v10, v14

    const-wide v14, 0x3ffa3d70a3d70a3dL    # 1.64

    const-wide/high16 v16, 0x4039000000000000L    # 25.0

    add-double v14, v14, v16

    const-wide v16, 0x3fd28f5c28f5c28fL    # 0.29

    iget-wide v0, v4, Lfb0;->f:D

    move-wide/from16 v24, v0

    move-wide/from16 v0, v16

    move-wide/from16 v2, v24

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v16

    sub-double v14, v14, v16

    const-wide/high16 v16, 0x4039000000000000L    # 25.0

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

    const-wide/16 v16, 0x0

    const-wide/high16 v24, 0x4010000000000000L    # 4.0

    sub-double v16, v16, v24

    sub-double v16, v42, v16

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

    invoke-static {v4}, La80;->s(I)D

    move-result-wide v10

    shr-int/lit8 v4, v6, 0x8

    xor-int/lit16 v6, v4, -0x100

    and-int/2addr v4, v6

    invoke-static {v4}, La80;->s(I)D

    move-result-wide v12

    invoke-static {v7}, La80;->s(I)D

    move-result-wide v6

    sget-object v4, La80;->b:[[D

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

    invoke-static {v0, v4}, Lzt;->F([D[[D)[D

    move-result-object v4

    const/4 v6, 0x1

    aget-wide v6, v4, v6

    const-wide/high16 v10, 0x4059000000000000L    # 100.0

    div-double/2addr v6, v10

    const-wide v10, 0x3f822354d28f7cd6L    # 0.008856451679035631

    cmpl-double v4, v6, v10

    if-lez v4, :cond_c

    const-wide v10, 0x3fd5555555555555L    # 0.3333333333333333

    invoke-static {v6, v7, v10, v11}, Ljava/lang/Math;->pow(DD)D

    :cond_c
    const-wide/high16 v6, 0x4049000000000000L    # 50.0

    invoke-static {v14, v15, v6, v7}, Ljava/lang/Math;->max(DD)D

    move-result-wide v6

    invoke-static {v8, v9, v6, v7}, Lb70;->a(DD)Lb70;

    move-result-object v6

    const-wide/high16 v10, 0x4020000000000000L    # 8.0

    invoke-static {v8, v9, v10, v11}, Lb70;->a(DD)Lb70;

    move-result-object v10

    const-wide/high16 v12, 0x4028000000000000L    # 12.0

    invoke-static {v8, v9, v12, v13}, Lb70;->a(DD)Lb70;

    move-result-object v8

    if-eqz v20, :cond_f

    const/16 v4, 0x50

    :goto_12
    invoke-virtual {v6, v4}, Lb70;->b(I)I

    move-result v11

    const/4 v4, 0x1

    if-ne v5, v4, :cond_15

    if-eqz v20, :cond_10

    const/4 v4, 0x6

    :goto_13
    invoke-virtual {v10, v4}, Lb70;->b(I)I

    move-result v13

    const/16 v6, 0x5f

    if-eqz v20, :cond_11

    const/16 v4, 0xc

    :goto_14
    invoke-virtual {v10, v4}, Lb70;->b(I)I

    move-result v7

    if-eqz v20, :cond_12

    const/16 v4, 0x14

    :goto_15
    invoke-virtual {v8, v4}, Lb70;->b(I)I

    move-result v12

    if-eqz v20, :cond_13

    move v4, v6

    :goto_16
    invoke-virtual {v10, v4}, Lb70;->b(I)I

    move-result v9

    if-eqz v20, :cond_14

    const/16 v4, 0xa0

    const/16 v6, 0xff

    const/16 v8, 0xff

    const/16 v10, 0xff

    invoke-static {v4, v6, v8, v10}, Landroid/graphics/Color;->argb(IIII)I

    move-result v4

    :goto_17
    const/4 v8, 0x0

    move v6, v13

    move v10, v4

    :goto_18
    const/4 v4, 0x1

    if-ne v5, v4, :cond_1c

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

    if-ne v5, v4, :cond_1d

    const/high16 v4, 0x41e00000    # 28.0f

    :goto_1a
    invoke-static {v4}, Lff;->p(F)F

    move-result v14

    const/4 v4, 0x1

    if-ne v5, v4, :cond_1e

    const/4 v15, 0x0

    :goto_1b
    xor-int/lit8 v4, v5, -0x1

    and-int/lit8 v4, v4, 0x1

    and-int/lit8 v16, v5, -0x2

    or-int v16, v16, v4

    new-instance v4, Lon;

    move/from16 v17, v16

    invoke-direct/range {v4 .. v20}, Lon;-><init>(IIIIIIIIIFFZZZZZ)V

    move-object/from16 v0, v22

    move-object/from16 v1, v21

    invoke-virtual {v0, v1, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v5, v4

    goto/16 :goto_5

    :cond_d
    const-wide v12, 0x4076800000000000L    # 360.0

    cmpl-double v12, v8, v12

    if-ltz v12, :cond_b

    const-wide/high16 v12, 0x4026000000000000L    # 11.0

    add-double/2addr v8, v12

    const-wide v12, 0x4076800000000000L    # 360.0

    sub-double/2addr v8, v12

    const-wide/high16 v12, 0x4026000000000000L    # 11.0

    sub-double/2addr v8, v12

    goto/16 :goto_10

    :cond_e
    move-wide v10, v8

    goto/16 :goto_11

    :cond_f
    const/16 v4, 0x2d

    goto/16 :goto_12

    :cond_10
    const/16 v4, 0x62

    goto/16 :goto_13

    :cond_11
    const/16 v4, 0x5f

    goto/16 :goto_14

    :cond_12
    const/16 v4, 0x5a

    goto :goto_15

    :cond_13
    const/16 v4, 0xf

    goto :goto_16

    :cond_14
    const/16 v4, 0x28

    invoke-virtual {v8, v4}, Lb70;->b(I)I

    move-result v4

    goto :goto_17

    :cond_15
    if-eqz v20, :cond_16

    const-string v4, "RRvmj3SlBA==\n"

    const-string v6, "ZivWv0SVNA4=\n"

    :goto_1c
    invoke-static {v4, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v13

    if-eqz v20, :cond_17

    const-string v4, "Svz3k8Oo8A==\n"

    const-string v6, "ac20ooCZtXA=\n"

    :goto_1d
    invoke-static {v4, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    if-eqz v20, :cond_18

    const-string v4, "iP8rEbHUnsft\n"

    const-string v6, "q84ZV/eS2IE=\n"

    :goto_1e
    invoke-static {v4, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    if-eqz v20, :cond_19

    const-string v4, "ni4gbYT66A==\n"

    const-string v6, "vRwWX7LI0Hg=\n"

    :goto_1f
    invoke-static {v4, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    if-eqz v20, :cond_1a

    const-string v6, "ES+GIVCOLQ==\n"

    const-string v4, "MmnAZxbIa6o=\n"

    :goto_20
    invoke-static {v6, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    if-eqz v20, :cond_1b

    const/16 v4, 0xa0

    const/16 v6, 0xff

    const/16 v10, 0xff

    const/16 v14, 0xff

    invoke-static {v4, v6, v10, v14}, Landroid/graphics/Color;->argb(IIII)I

    move-result v4

    :goto_21
    move v6, v13

    move v10, v4

    goto/16 :goto_18

    :cond_16
    const-string v4, "M1jAtL2vjw==\n"

    const-string v6, "EB7z8onpubI=\n"

    goto :goto_1c

    :cond_17
    const-string v4, "FCP8aJtyYw==\n"

    const-string v6, "N2W6Lt00JUE=\n"

    goto :goto_1d

    :cond_18
    const-string v4, "LxODVoCy2Z48\n"

    const-string v6, "DCPCZrCC6a4=\n"

    goto :goto_1e

    :cond_19
    const-string v4, "D3y4QF7ekw==\n"

    const-string v6, "LDmNBWub0tc=\n"

    goto :goto_1f

    :cond_1a
    const-string v6, "ciQYlT1wCw==\n"

    const-string v4, "URUppAxBOnY=\n"

    goto :goto_20

    :cond_1b
    const-string v4, "7c0rozT1Sw==\n"

    const-string v6, "zvVum3HMePE=\n"

    invoke-static {v4, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    goto :goto_21

    :cond_1c
    const/16 v4, 0x14

    goto/16 :goto_19

    :cond_1d
    const/high16 v4, 0x41c00000    # 24.0f

    goto/16 :goto_1a

    :cond_1e
    const/high16 v4, 0x41400000    # 12.0f

    invoke-static {v4}, Lff;->p(F)F

    move-result v15

    goto/16 :goto_1b

    :cond_1f
    const/16 v4, 0x5a

    invoke-static {v4}, Lff;->q(I)I

    move-result v4

    goto/16 :goto_6

    :cond_20
    const/4 v4, 0x0

    const/4 v14, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v0, v37

    move/from16 v1, v19

    move/from16 v2, v20

    invoke-virtual {v0, v4, v14, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    goto/16 :goto_7

    :cond_21
    const/16 v4, 0xa0

    goto/16 :goto_8

    :cond_22
    const/16 v4, 0xff

    goto/16 :goto_8

    :cond_23
    const/16 v14, 0x50

    invoke-static {v14}, Lff;->q(I)I

    move-result v14

    goto/16 :goto_9

    :cond_24
    const-string v14, "915QR/4fsIeS\n"

    const-string v4, "1GoUAbhZ9sE=\n"

    goto/16 :goto_a

    :cond_25
    const-string v4, "pUc/YIMGH262\n"

    const-string v14, "hncMULM2L14=\n"

    goto/16 :goto_b

    :cond_26
    const-string v4, "VFrkDlei7wJH\n"

    const-string v14, "d2rSPmeS3zI=\n"

    goto/16 :goto_c

    :cond_27
    const/16 v4, 0x18

    invoke-static {v4}, Lff;->q(I)I

    move-result v4

    goto/16 :goto_d

    :cond_28
    const/16 v4, 0x1e

    goto/16 :goto_e

    :cond_29
    const/16 v4, 0x700

    goto/16 :goto_f

    :cond_2a
    move v6, v4

    goto/16 :goto_4
.end method

.method public static final b(Landroid/app/Activity;I)Landroid/widget/ScrollView;
    .locals 5

    const/4 v1, 0x0

    const/4 v4, 0x0

    const-string v0, "\u06e7\u06e8\u06df"

    invoke-static {v0}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v3

    move-object v0, v1

    move-object v2, v1

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v3, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    xor-int/2addr v1, v3

    const v3, 0x1aac23

    add-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :sswitch_1
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    const-string v1, "\u06e1\u06e5\u06e6"

    :goto_1
    invoke-static {v1}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->۟ۡۨۢ()I

    move-result v1

    if-gtz v1, :cond_0

    const/16 v1, 0x1d

    sput v1, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    const-string v1, "\u06e0\u06e8\u06e3"

    goto :goto_1

    :cond_0
    const-string v1, "\u06e7\u06e8\u06df"

    goto :goto_1

    :sswitch_3
    new-instance v0, Landroid/widget/ScrollView;

    invoke-direct {v0, p0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    const-string v1, "\u06e3\u06e3\u06df"

    goto :goto_1

    :sswitch_4
    invoke-virtual {v0, v4, v4, v4, p1}, Landroid/view/View;->setPadding(IIII)V

    sget v1, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v3, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sub-int/2addr v1, v3

    const v3, 0x1acbd8

    add-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :sswitch_5
    new-instance v1, Lw6;

    sget v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    xor-int/lit16 v2, v2, -0x1ba

    invoke-direct {v1, v2}, Lw6;-><init>(I)V

    sget v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v3, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sub-int/2addr v2, v3

    const v3, -0x1ab971

    xor-int/2addr v3, v2

    move-object v2, v1

    goto :goto_0

    :sswitch_6
    sget v1, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    xor-int/lit16 v1, v1, -0x1b9

    invoke-virtual {v0, v1}, Landroid/view/View;->setOverScrollMode(I)V

    sget v1, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    if-ltz v1, :cond_1

    :cond_1
    const-string v1, "\u06e3\u06e8\u06e1"

    invoke-static {v1}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :sswitch_7
    invoke-virtual {v0, v4}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    const-string v1, "\u06e8\u06e7\u06e0"

    goto :goto_1

    :sswitch_8
    const/high16 v1, -0x40800000    # -1.0f

    iput v1, v2, Lw6;->c:F

    const-string v1, "\u06e0\u06e5"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :sswitch_9
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc05 -> :sswitch_0
        0x1aab06 -> :sswitch_9
        0x1aaf42 -> :sswitch_4
        0x1ab2bf -> :sswitch_2
        0x1ab67f -> :sswitch_7
        0x1ab71c -> :sswitch_1
        0x1abae2 -> :sswitch_8
        0x1ac61e -> :sswitch_3
        0x1ac8ee -> :sswitch_5
        0x1ac9c1 -> :sswitch_6
    .end sparse-switch
.end method

.method public static final c(Landroid/app/Activity;Lon;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/view/View;Lh40;Lh40;ILjava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;
    .locals 28

    const/16 v19, 0x0

    const/16 v24, 0x0

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v17, 0x0

    const/16 v21, 0x0

    const/4 v4, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v23, 0x0

    const/16 v20, 0x0

    const-string v5, "\u06df\u06df"

    invoke-static {v5}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    move-object/from16 v27, v4

    :goto_0
    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v2, Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    sget v3, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    if-gtz v3, :cond_1

    const-string v4, "\u06e6\u06e1"

    move-object/from16 v3, v20

    :goto_1
    invoke-static {v4}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v19, v2

    move-object/from16 v20, v3

    move v5, v4

    goto :goto_0

    :sswitch_1
    move-object/from16 v0, v19

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v19

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v3, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    or-int/2addr v2, v3

    const v3, 0x1ac0ed

    add-int/2addr v2, v3

    move v5, v2

    goto :goto_0

    :sswitch_2
    move-object/from16 v0, p1

    iget v3, v0, Lon;->f:I

    move-object/from16 v0, p1

    iget v2, v0, Lon;->a:I

    sget v4, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    if-ltz v4, :cond_0

    const/16 v4, 0x25

    sput v4, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    :goto_2
    const-string v4, "\u06df\u06e7"

    :goto_3
    invoke-static {v4}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v17, v2

    move/from16 v18, v3

    move v5, v4

    goto :goto_0

    :cond_0
    const-string v4, "\u06e2\u06df\u06e0"

    goto :goto_3

    :cond_1
    sget v3, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v4, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    or-int/2addr v3, v4

    const v4, 0x1aac25

    add-int/2addr v3, v4

    move-object/from16 v19, v2

    move v5, v3

    goto :goto_0

    :cond_2
    :sswitch_3
    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    move-result v2

    if-gtz v2, :cond_3

    const/16 v2, 0x50

    sput v2, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    const-string v3, "\u06df\u06e3\u06e7"

    move-object/from16 v2, v21

    :goto_4
    invoke-static {v3}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v21, v2

    move v5, v3

    goto :goto_0

    :cond_3
    const-string v2, "\u06df\u06e7"

    invoke-static {v2}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :sswitch_4
    sget v2, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v3, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    add-int/2addr v2, v3

    const v3, 0xdc26

    add-int/2addr v2, v3

    move v5, v2

    goto/16 :goto_0

    :sswitch_5
    sget v2, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    xor-int/lit16 v4, v2, 0xc7

    move-object/from16 v0, v19

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    const-string v3, "\u06df\u06e4\u06e8"

    move-object/from16 v2, v23

    :goto_5
    invoke-static {v3}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v23, v2

    move/from16 v24, v4

    move v5, v3

    goto/16 :goto_0

    :sswitch_6
    new-instance v2, Lh40;

    sget-object v3, Lh40;->n:Lqh;

    move-object/from16 v0, v19

    invoke-direct {v2, v0, v3}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    new-instance v3, Li40;

    invoke-direct {v3}, Li40;-><init>()V

    const-string v4, "\u06e5\u06e0\u06e7"

    invoke-static {v4}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    move v5, v4

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v0, v22

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    move-object/from16 v0, v22

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    invoke-static {}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۦۧۢ۟()I

    move-result v2

    if-ltz v2, :cond_5

    const/16 v2, 0x49

    sput v2, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    move-object/from16 v2, v22

    :cond_4
    const-string v3, "\u06e3\u06e0\u06e1"

    move-object/from16 v22, v2

    :goto_6
    invoke-static {v3}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :cond_5
    const-string v2, "\u06e6\u06e0\u06df"

    move-object v3, v2

    goto :goto_6

    :sswitch_8
    new-instance v2, Lp20;

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

    invoke-direct/range {v2 .. v16}, Lp20;-><init>(ILandroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lon;Landroid/view/View;Lh40;Lh40;)V

    move-object/from16 v0, v19

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-nez v17, :cond_2

    sget v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    xor-int/lit16 v3, v3, -0x1ea3

    rem-int/2addr v2, v3

    if-ltz v2, :cond_7

    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    :cond_6
    const-string v2, "\u06e5\u06e3\u06e7"

    invoke-static {v2}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :cond_7
    const-string v2, "\u06e6\u06e0\u06e3"

    invoke-static {v2}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :sswitch_9
    const/high16 v2, 0x3f000000    # 0.5f

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Li40;->a(F)V

    move-object/from16 v0, v20

    move-object/from16 v1, v23

    iput-object v0, v1, Lh40;->j:Li40;

    sget v2, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v3, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    div-int/lit16 v3, v3, 0xede

    add-int/2addr v2, v3

    if-gtz v2, :cond_6

    const/16 v2, 0x1e

    sput v2, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    const-string v2, "\u06e0\u06e2\u06e5"

    invoke-static {v2}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :cond_8
    :sswitch_a
    sget v2, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v3, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sub-int/2addr v2, v3

    const v3, 0x1aab3d

    add-int/2addr v2, v3

    move v5, v2

    goto/16 :goto_0

    :sswitch_b
    new-instance v2, Lq20;

    move-object/from16 v0, v25

    move-object/from16 v1, v23

    invoke-direct {v2, v0, v1}, Lq20;-><init>(Lh40;Lh40;)V

    move-object/from16 v0, v19

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v3, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    xor-int/lit16 v3, v3, -0x1665

    sub-int/2addr v2, v3

    if-gtz v2, :cond_9

    const/16 v2, 0x8

    sput v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    const-string v2, "\u06e3\u06e6\u06e8"

    invoke-static {v2}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :cond_9
    move/from16 v2, v17

    move/from16 v3, v18

    goto/16 :goto_2

    :sswitch_c
    if-eqz v21, :cond_11

    sget v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v3, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    xor-int/lit16 v3, v3, 0x1891

    sub-int/2addr v2, v3

    if-ltz v2, :cond_e

    const/16 v2, 0x45

    sput v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    const-string v2, "\u06e2\u06e1\u06e1"

    invoke-static {v2}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :sswitch_d
    move-object/from16 v0, v22

    move-object/from16 v1, p16

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v2, 0x41b00000    # 22.0f

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    if-ltz v2, :cond_a

    const-string v2, "\u06e0\u06e2\u06e6"

    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u06e8\u06e8\u06e3"

    :goto_7
    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :sswitch_e
    move-object/from16 v0, v26

    move-object/from16 v1, v25

    iput-object v0, v1, Lh40;->j:Li40;

    new-instance v2, Lh40;

    sget-object v3, Lh40;->o:Lqh;

    move-object/from16 v0, v19

    invoke-direct {v2, v0, v3}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    sget v3, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v4, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    add-int/lit16 v4, v4, 0x277

    add-int/2addr v3, v4

    if-ltz v3, :cond_b

    const-string v3, "\u06e8\u06e8\u06e3"

    move/from16 v4, v24

    goto/16 :goto_5

    :cond_b
    const-string v3, "\u06e3\u06e3\u06e3"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v23, v2

    move v5, v3

    goto/16 :goto_0

    :sswitch_f
    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2}, Lff;->p(F)F

    move-result v2

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Landroid/view/View;->setElevation(F)V

    sget v2, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v3, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    rem-int/lit16 v3, v3, -0xf9b

    add-int/2addr v2, v3

    if-ltz v2, :cond_c

    const/16 v2, 0x47

    sput v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    const-string v2, "\u06e0\u06e1\u06e4"

    invoke-static {v2}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :cond_c
    sget v2, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v3, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    mul-int/2addr v2, v3

    const v3, 0x1a876f

    xor-int/2addr v2, v3

    move v5, v2

    goto/16 :goto_0

    :sswitch_10
    const/4 v2, 0x1

    move/from16 v0, v17

    if-ne v0, v2, :cond_8

    const-string v2, "\u06e0\u06e1\u06e4"

    move-object v3, v2

    :goto_8
    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :sswitch_11
    move-object/from16 v0, v22

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v3, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    or-int/lit16 v3, v3, -0x9ab

    rem-int/2addr v2, v3

    if-gtz v2, :cond_d

    const-string v2, "\u06df\u06e4\u06e8"

    invoke-static {v2}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :cond_d
    sget v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v3, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    add-int/2addr v2, v3

    const v3, 0x1ab2d5

    add-int/2addr v2, v3

    move v5, v2

    goto/16 :goto_0

    :sswitch_12
    new-instance v3, Li40;

    invoke-direct {v3}, Li40;-><init>()V

    const v2, 0x44bb8000    # 1500.0f

    invoke-virtual {v3, v2}, Li40;->b(F)V

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    move-result v2

    if-ltz v2, :cond_f

    move-object/from16 v20, v3

    :cond_e
    const-string v2, "\u06e4\u06e4\u06e2"

    goto/16 :goto_7

    :cond_f
    const-string v4, "\u06e6\u06e5\u06df"

    move-object/from16 v2, v19

    goto/16 :goto_1

    :sswitch_13
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    xor-int/lit8 v5, v5, 0x5f

    invoke-static {v5}, Lff;->q(I)I

    move-result v5

    move-object/from16 v0, v22

    invoke-virtual {v0, v2, v3, v4, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    sget-object v2, Lxn;->a:Landroid/graphics/Typeface;

    sget v3, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v4, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    or-int/lit16 v4, v4, -0x25f2

    add-int/2addr v3, v4

    if-ltz v3, :cond_10

    const-string v3, "\u06e1\u06e8\u06e8"

    move-object/from16 v21, v2

    goto :goto_8

    :cond_10
    const-string v3, "\u06e1\u06e8\u06e8"

    goto/16 :goto_4

    :cond_11
    :sswitch_14
    sget v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v3, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    rem-int/lit16 v3, v3, -0x18be

    sub-int/2addr v2, v3

    if-ltz v2, :cond_12

    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    const-string v2, "\u06e6\u06df\u06e6"

    invoke-static {v2}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :cond_12
    sget v2, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v3, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    div-int/2addr v2, v3

    const v3, 0x1ab283

    xor-int/2addr v2, v3

    move v5, v2

    goto/16 :goto_0

    :sswitch_15
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-direct {v2, v3, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    move-object/from16 v0, v19

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    sget v3, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v4, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    rem-int/lit16 v4, v4, 0x238e

    mul-int/2addr v3, v4

    if-gtz v3, :cond_4

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    const-string v3, "\u06e3\u06e3\u06e3"

    invoke-static {v3}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v22, v2

    move v5, v3

    goto/16 :goto_0

    :sswitch_16
    const v2, 0x44bb8000    # 1500.0f

    move-object/from16 v0, v26

    invoke-virtual {v0, v2}, Li40;->b(F)V

    const/high16 v2, 0x3f000000    # 0.5f

    move-object/from16 v0, v26

    invoke-virtual {v0, v2}, Li40;->a(F)V

    sget v2, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v3, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    rem-int/lit16 v3, v3, -0x23b9

    xor-int/2addr v2, v3

    if-gtz v2, :cond_13

    const/16 v2, 0x23

    sput v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    const-string v2, "\u06e6\u06e5\u06df"

    invoke-static {v2}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :cond_13
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v3, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sub-int/2addr v2, v3

    const v3, 0x1ab517

    add-int/2addr v2, v3

    move v5, v2

    goto/16 :goto_0

    :sswitch_17
    move-object/from16 v0, v27

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    sget-object v2, Lmn;->a:Landroid/graphics/Typeface;

    const/4 v3, 0x1

    move-object/from16 v0, v27

    invoke-virtual {v0, v2, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    sget v2, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v3, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    rem-int/lit16 v3, v3, 0x306

    add-int/2addr v2, v3

    if-ltz v2, :cond_14

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    const-string v2, "\u06e4\u06e8\u06e4"

    invoke-static {v2}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :cond_14
    const-string v3, "\u06e6\u06e2\u06e3"

    move-object/from16 v2, v23

    move/from16 v4, v24

    goto/16 :goto_5

    :sswitch_18
    const/high16 v2, 0x41300000    # 11.0f

    move-object/from16 v0, v27

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    move-object/from16 v0, v27

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v3, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    or-int/2addr v2, v3

    const v3, -0x1ab869

    xor-int/2addr v2, v3

    move v5, v2

    goto/16 :goto_0

    :sswitch_19
    new-instance v2, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object/from16 v0, p15

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget v3, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    if-gtz v3, :cond_15

    const-string v3, "\u06df\u06e3\u06e3"

    invoke-static {v3}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v27, v2

    move v5, v3

    goto/16 :goto_0

    :cond_15
    sget v3, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v4, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    or-int/2addr v3, v4

    const v4, 0x1ab6ef

    add-int/2addr v3, v4

    move-object/from16 v27, v2

    move v5, v3

    goto/16 :goto_0

    :sswitch_1a
    return-object v19

    :sswitch_data_0
    .sparse-switch
        0xdbe0 -> :sswitch_0
        0xdbe8 -> :sswitch_1a
        0xdcbb -> :sswitch_4
        0x1aa77f -> :sswitch_3
        0x1aa7a3 -> :sswitch_15
        0x1aab03 -> :sswitch_f
        0x1aab23 -> :sswitch_1
        0x1aab24 -> :sswitch_5
        0x1aafa1 -> :sswitch_c
        0x1ab243 -> :sswitch_7
        0x1ab282 -> :sswitch_19
        0x1ab2a2 -> :sswitch_14
        0x1ab35a -> :sswitch_a
        0x1ab624 -> :sswitch_d
        0x1ab683 -> :sswitch_12
        0x1ab6c5 -> :sswitch_18
        0x1ab6e5 -> :sswitch_e
        0x1aba62 -> :sswitch_11
        0x1abae0 -> :sswitch_17
        0x1abdac -> :sswitch_16
        0x1abe09 -> :sswitch_b
        0x1ac14c -> :sswitch_8
        0x1ac165 -> :sswitch_13
        0x1ac169 -> :sswitch_6
        0x1ac1a7 -> :sswitch_10
        0x1ac200 -> :sswitch_9
        0x1ac9e3 -> :sswitch_2
    .end sparse-switch
.end method

.method public static final d(Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lon;Landroid/view/View;Lh40;Lh40;IZ)V
    .locals 50

    const/16 v30, 0x0

    const/16 v18, 0x0

    const/16 v29, 0x0

    const/4 v12, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v44, 0x0

    const/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v17, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v14, 0x0

    const/4 v4, 0x0

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v7, 0x0

    const/16 v19, 0x0

    const/16 v25, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v22, 0x0

    const/16 v20, 0x0

    const/16 v28, 0x0

    const/4 v2, 0x0

    const/16 v21, 0x0

    const/4 v13, 0x0

    const/16 v37, 0x0

    const/16 v16, 0x0

    const/4 v15, 0x0

    const/16 v31, 0x0

    const/16 v27, 0x0

    const/16 v23, 0x0

    const-string v38, "\u06e0\u06e7\u06e0"

    invoke-static/range {v38 .. v38}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v43

    move-object/from16 v38, v4

    move-object/from16 v39, v2

    move-object/from16 v40, v13

    move-object/from16 v41, v14

    move-object/from16 v42, v28

    :goto_0
    sparse-switch v43, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v2, "\u06e4\u06e2\u06e7"

    move-object v4, v2

    move-object/from16 v20, v22

    :goto_1
    invoke-static {v4}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    goto :goto_0

    :sswitch_1
    move-object v2, v8

    move v4, v9

    :cond_0
    sget v8, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v9, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    div-int/2addr v8, v9

    const v9, 0x1abde7

    add-int v13, v8, v9

    move-object v8, v2

    move v9, v4

    move/from16 v43, v13

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    move-result v2

    if-ltz v2, :cond_1

    const/16 v2, 0x27

    sput v2, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    const-string v2, "\u06e6\u06e6\u06e8"

    :goto_2
    invoke-static {v2}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    goto :goto_0

    :cond_1
    const-string v2, "\u06e4\u06df\u06e3"

    goto :goto_2

    :sswitch_3
    const/4 v4, 0x0

    sget v2, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v7, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    rem-int/lit16 v7, v7, -0xe0c

    div-int/2addr v2, v7

    if-gtz v2, :cond_2

    const/16 v2, 0x57

    sput v2, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    const-string v2, "\u06e0\u06e7\u06e7"

    invoke-static {v2}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v2

    move-object v7, v4

    move/from16 v43, v2

    goto :goto_0

    :cond_2
    move-object v2, v6

    :goto_3
    const-string v6, "\u06e3\u06e5"

    invoke-static {v6}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v13

    move-object v6, v2

    move-object v7, v4

    move/from16 v43, v13

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    move-result v2

    if-ltz v2, :cond_3

    const/16 v2, 0x44

    sput v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    const-string v2, "\u06e7\u06e1\u06df"

    invoke-static {v2}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    move/from16 v23, v17

    goto :goto_0

    :cond_3
    const-string v2, "\u06e1\u06e2\u06e0"

    move/from16 v4, v17

    :goto_4
    invoke-static {v2}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    move/from16 v23, v4

    goto :goto_0

    :sswitch_5
    move v2, v10

    move v4, v11

    :cond_4
    sget v10, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v11, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    rem-int/lit16 v11, v11, -0xf2f

    rem-int/2addr v10, v11

    if-ltz v10, :cond_5

    invoke-static {}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۢۨۤ۟()I

    const-string v10, "\u06e2\u06df\u06e1"

    move-object v13, v10

    move v14, v2

    :goto_5
    invoke-static {v13}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v2

    move v10, v14

    move v11, v4

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_5
    sget v10, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v11, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sub-int/2addr v10, v11

    const v11, -0x1aa759

    xor-int v13, v10, v11

    move v10, v2

    move v11, v4

    move/from16 v43, v13

    goto/16 :goto_0

    :sswitch_6
    if-nez v20, :cond_f

    new-instance v4, Lh40;

    sget-object v2, Lh40;->o:Lqh;

    invoke-direct {v4, v6, v2}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    new-instance v2, Li40;

    invoke-direct {v2}, Li40;-><init>()V

    const/high16 v13, 0x43480000    # 200.0f

    invoke-virtual {v2, v13}, Li40;->b(F)V

    sget v13, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v14, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    mul-int/2addr v13, v14

    const v14, 0x1f4d2e

    add-int/2addr v13, v14

    move-object/from16 v39, v2

    move-object/from16 v42, v4

    move-object/from16 v21, v20

    move/from16 v43, v13

    goto/16 :goto_0

    :sswitch_7
    const-string v2, "\u06e7\u06e1\u06e1"

    :goto_6
    invoke-static {v2}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    goto/16 :goto_0

    :sswitch_8
    sget v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v4, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    xor-int/2addr v2, v4

    const v4, 0x1abc36

    add-int/2addr v2, v4

    move/from16 v43, v2

    goto/16 :goto_0

    :sswitch_9
    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v4, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    add-int/lit16 v4, v4, 0x9f3

    or-int/2addr v2, v4

    if-ltz v2, :cond_6

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۢ۟ۡۧ()I

    const-string v2, "\u06e3\u06e6\u06e1"

    invoke-static {v2}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_6
    const-string v2, "\u06e0\u06df\u06e5"

    move-object/from16 v28, v2

    move-object/from16 v4, v25

    :goto_7
    invoke-static/range {v28 .. v28}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v25, v4

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_7
    :sswitch_a
    sget v2, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v4, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    mul-int/lit16 v4, v4, 0x2162

    or-int/2addr v2, v4

    if-ltz v2, :cond_8

    const-string v2, "\u06e2\u06e8\u06e6"

    move-object v4, v15

    :goto_8
    invoke-static {v2}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v2

    move-object v15, v4

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_8
    const-string v2, "\u06e1\u06e7\u06e2"

    move-object v4, v2

    :goto_9
    invoke-static {v4}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_9
    :sswitch_b
    sget v2, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v4, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    mul-int/lit16 v4, v4, -0x1cf3

    xor-int/2addr v2, v4

    if-gtz v2, :cond_a

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    const-string v2, "\u06e7\u06e4\u06e4"

    invoke-static {v2}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_a
    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v4, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sub-int/2addr v2, v4

    const v4, 0x1ab1ec

    add-int/2addr v2, v4

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_b
    :sswitch_c
    sget v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v4, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    div-int/lit16 v4, v4, 0x536

    mul-int/2addr v2, v4

    if-eqz v2, :cond_c

    const/16 v2, 0x48

    sput v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    const-string v2, "\u06e5\u06e8\u06e5"

    move/from16 v4, v17

    :goto_a
    invoke-static {v2}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v17, v4

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u06e7\u06e2\u06e7"

    move-object v4, v2

    goto :goto_9

    :sswitch_d
    const/4 v2, 0x4

    new-array v2, v2, [Landroid/widget/LinearLayout;

    sget v4, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    xor-int/lit16 v4, v4, -0x1bb

    aput-object p4, v2, v4

    sget v4, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    xor-int/lit16 v4, v4, 0x356

    aput-object p5, v2, v4

    sget v4, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    xor-int/lit16 v4, v4, -0x1ad

    aput-object p6, v2, v4

    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    xor-int/lit16 v4, v4, -0x291

    aput-object p7, v2, v4

    sget v4, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    if-ltz v4, :cond_d

    const/16 v4, 0x3c

    sput v4, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    move-object v4, v2

    move-object/from16 v13, v19

    :goto_b
    const-string v2, "\u06e6\u06e3\u06e7"

    :goto_c
    invoke-static {v2}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v18, v4

    move-object/from16 v19, v13

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_d
    sget v4, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v13, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sub-int/2addr v4, v13

    const v13, 0x1ac66a

    xor-int/2addr v4, v13

    move-object/from16 v18, v2

    move/from16 v43, v4

    goto/16 :goto_0

    :sswitch_e
    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    if-ltz v2, :cond_e

    const-string v2, "\u06e6\u06e2\u06e7"

    invoke-static {v2}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_e
    sget v2, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v4, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    mul-int/2addr v2, v4

    const v4, 0x1bd989

    xor-int/2addr v2, v4

    move/from16 v43, v2

    goto/16 :goto_0

    :sswitch_f
    sget v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v4, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    xor-int/2addr v2, v4

    const v4, 0x1ac219

    add-int/2addr v2, v4

    move-object/from16 v19, v7

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_f
    move-object/from16 v2, v20

    :goto_d
    sget v4, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    if-ltz v4, :cond_10

    const-string v4, "\u06e3\u06e8\u06e5"

    :goto_e
    invoke-static {v4}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v21, v2

    move/from16 v43, v4

    goto/16 :goto_0

    :cond_10
    const-string v4, "\u06e6\u06e4\u06e5"

    goto :goto_e

    :sswitch_10
    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    if-ltz v2, :cond_11

    const/16 v2, 0x5b

    sput v2, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    const-string v2, "\u06e8\u06e2\u06e6"

    goto/16 :goto_6

    :cond_11
    const-string v2, "\u06e0\u06e7\u06e0"

    goto/16 :goto_6

    :sswitch_11
    const/4 v2, 0x0

    sget v4, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v13, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    rem-int/lit16 v13, v13, 0x89a

    add-int/2addr v4, v13

    if-ltz v4, :cond_12

    const/16 v4, 0x13

    sput v4, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    :goto_f
    const-string v4, "\u06e4\u06df\u06e3"

    invoke-static {v4}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v22, v2

    move/from16 v43, v4

    goto/16 :goto_0

    :cond_12
    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v13, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sub-int/2addr v4, v13

    const v13, 0xdfb5

    xor-int/2addr v4, v13

    move-object/from16 v22, v2

    move/from16 v43, v4

    goto/16 :goto_0

    :sswitch_12
    sget v2, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v4, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    div-int/2addr v2, v4

    const v4, 0x1ac987

    add-int/2addr v2, v4

    move/from16 v43, v2

    goto/16 :goto_0

    :sswitch_13
    const/4 v2, 0x0

    move-object/from16 v0, p12

    invoke-virtual {v0, v2}, Lh40;->b(F)V

    sget v2, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    or-int/lit16 v4, v4, 0x2521

    div-int/2addr v2, v4

    if-eqz v2, :cond_13

    const-string v2, "\u06df\u06e4\u06e3"

    invoke-static {v2}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_13
    move-object/from16 v2, v22

    goto :goto_f

    :sswitch_14
    const v2, 0x3f19999a    # 0.6f

    move-object/from16 v0, v39

    invoke-virtual {v0, v2}, Li40;->a(F)V

    move-object/from16 v0, v39

    move-object/from16 v1, v42

    iput-object v0, v1, Lh40;->j:Li40;

    const v2, -0x7e030361

    sget v4, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    xor-int/2addr v2, v4

    move-object/from16 v0, v42

    invoke-virtual {v6, v2, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    move-result v2

    if-gtz v2, :cond_14

    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    const-string v2, "\u06e5\u06df\u06e7"

    invoke-static {v2}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_14
    const-string v2, "\u06e6\u06e4\u06e0"

    move-object v13, v2

    move v14, v10

    move v4, v11

    goto/16 :goto_5

    :sswitch_15
    sget v2, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    if-ltz v2, :cond_15

    invoke-static {}, Lkotlinx/coroutines/ۦۡۧۧ;->۟ۤۧۨۦ()I

    const-string v2, "\u06e4\u06e7\u06e1"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_15
    const-string v2, "\u06e3\u06e1"

    invoke-static {v2}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    goto/16 :goto_0

    :sswitch_16
    sget v2, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    xor-int/lit8 v2, v2, 0x0

    move-object/from16 v0, v29

    invoke-static {v0, v2}, Lgn;->i(Landroid/view/View;I)V

    const-string v2, "\u06e5\u06e2"

    move-object/from16 v4, v18

    move-object/from16 v13, v19

    goto/16 :goto_c

    :sswitch_17
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual/range {v29 .. v29}, Landroid/view/View;->getWidth()I

    move-result v4

    invoke-virtual/range {v29 .. v29}, Landroid/view/View;->getHeight()I

    move-result v13

    invoke-direct {v2, v4, v13}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    move-object/from16 v0, p10

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual/range {v29 .. v29}, Landroid/view/View;->getX()F

    move-result v2

    move-object/from16 v0, p11

    invoke-virtual {v0, v2}, Lh40;->b(F)V

    sget v2, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v4, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    add-int/lit16 v4, v4, 0x2020

    rem-int/2addr v2, v4

    if-gtz v2, :cond_16

    const/16 v2, 0x59

    sput v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    const-string v2, "\u06e6\u06e8\u06e4"

    move/from16 v4, v23

    goto/16 :goto_4

    :cond_16
    const-string v2, "\u06e3\u06e4\u06e5"

    :goto_10
    invoke-static {v2}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_17
    :sswitch_18
    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v4, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    xor-int/lit16 v4, v4, 0x26a4

    or-int/2addr v2, v4

    if-ltz v2, :cond_18

    const/16 v2, 0x1d

    sput v2, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    const-string v2, "\u06e3\u06e0\u06e8"

    invoke-static {v2}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_18
    sget v2, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v4, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    div-int/2addr v2, v4

    const v4, 0x1ac5c1

    add-int/2addr v2, v4

    move/from16 v43, v2

    goto/16 :goto_0

    :sswitch_19
    const v2, -0x7e03018a

    sget v4, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    xor-int/2addr v4, v2

    invoke-virtual {v6, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v5

    instance-of v8, v5, Lh40;

    const/4 v2, 0x0

    if-eqz v8, :cond_0

    sget v8, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v9, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    mul-int/lit16 v9, v9, 0xd3d

    or-int/2addr v8, v9

    if-ltz v8, :cond_19

    const-string v8, "\u06e2\u06e2\u06e0"

    invoke-static {v8}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v13

    move-object v8, v2

    move v9, v4

    move/from16 v43, v13

    goto/16 :goto_0

    :cond_19
    const-string v8, "\u06e3\u06e3\u06e7"

    invoke-static {v8}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v13

    move-object v8, v2

    move v9, v4

    move/from16 v43, v13

    goto/16 :goto_0

    :cond_1a
    :sswitch_1a
    sget v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v4, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    xor-int/lit16 v4, v4, 0x201a

    div-int/2addr v2, v4

    if-eqz v2, :cond_1b

    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    const-string v2, "\u06e1\u06df\u06e8"

    goto :goto_10

    :cond_1b
    sget v2, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v4, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    add-int/2addr v2, v4

    const v4, -0x1abb50

    xor-int/2addr v2, v4

    move/from16 v43, v2

    goto/16 :goto_0

    :sswitch_1b
    const/4 v4, 0x0

    const-string v2, "\u06e0\u06df\u06e7"

    goto/16 :goto_a

    :sswitch_1c
    if-nez v19, :cond_2a

    new-instance v4, Lh40;

    sget-object v2, Lh40;->n:Lqh;

    invoke-direct {v4, v6, v2}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    new-instance v2, Li40;

    invoke-direct {v2}, Li40;-><init>()V

    const/high16 v13, 0x43480000    # 200.0f

    invoke-virtual {v2, v13}, Li40;->b(F)V

    sget v13, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    if-ltz v13, :cond_1c

    const/16 v13, 0x8

    sput v13, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    move-object/from16 v13, v19

    move-object/from16 v14, v27

    :goto_11
    const-string v25, "\u06e3\u06e1"

    move-object/from16 v24, v2

    move-object/from16 v28, v25

    move-object/from16 v26, v13

    move-object/from16 v27, v14

    goto/16 :goto_7

    :cond_1c
    move-object/from16 v13, v30

    move-object/from16 v25, v4

    move-object/from16 v26, v19

    :goto_12
    const-string v4, "\u06e5\u06e6\u06e5"

    invoke-static {v4}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v24, v2

    move-object/from16 v30, v13

    move/from16 v43, v4

    goto/16 :goto_0

    :sswitch_1d
    move-object/from16 v2, v29

    :cond_1d
    sget v4, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v13, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    xor-int/lit16 v13, v13, -0x26cf

    xor-int/2addr v4, v13

    if-ltz v4, :cond_1e

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    const-string v4, "\u06e3\u06e3\u06df"

    move-object/from16 v29, v2

    goto/16 :goto_9

    :cond_1e
    sget v4, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v13, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    add-int/2addr v4, v13

    const v13, 0xdc08

    xor-int/2addr v4, v13

    move-object/from16 v29, v2

    move/from16 v43, v4

    goto/16 :goto_0

    :sswitch_1e
    const/4 v2, 0x4

    new-array v4, v2, [Landroid/widget/ScrollView;

    sget v2, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    xor-int/lit16 v2, v2, -0x383

    aput-object p0, v4, v2

    sget v2, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    xor-int/lit16 v2, v2, -0x36e

    aput-object p1, v4, v2

    sget v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    xor-int/lit16 v2, v2, 0x3bc

    aput-object p2, v4, v2

    sget v2, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    xor-int/lit16 v2, v2, -0x27e

    aput-object p3, v4, v2

    sget v2, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v13, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    rem-int/lit16 v13, v13, -0x1987

    xor-int/2addr v2, v13

    if-eqz v2, :cond_1f

    const/16 v2, 0x42

    sput v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    move-object/from16 v2, v24

    move-object v13, v4

    goto :goto_12

    :cond_1f
    sget v2, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v13, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    rem-int/2addr v2, v13

    const v13, 0x1ac42a

    add-int/2addr v2, v13

    move-object/from16 v30, v4

    move/from16 v43, v2

    goto/16 :goto_0

    :sswitch_1f
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    move/from16 v0, v44

    float-to-int v4, v0

    move/from16 v0, v34

    float-to-int v13, v0

    invoke-direct {v2, v4, v13}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    move-object/from16 v0, p10

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/high16 v2, 0x40800000    # 4.0f

    sub-float v2, v32, v2

    add-float v2, v2, v36

    const/high16 v4, 0x40800000    # 4.0f

    add-float/2addr v2, v4

    move-object/from16 v0, p11

    invoke-virtual {v0, v2}, Lh40;->b(F)V

    const/high16 v2, 0x41900000    # 18.0f

    sub-float v2, v33, v2

    sub-float v2, v2, v35

    const/high16 v4, 0x41900000    # 18.0f

    add-float/2addr v2, v4

    move-object/from16 v0, p12

    invoke-virtual {v0, v2}, Lh40;->b(F)V

    sget v2, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v4, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    xor-int/lit16 v4, v4, -0x1459

    div-int/2addr v2, v4

    if-eqz v2, :cond_20

    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    const-string v2, "\u06e4\u06e3"

    invoke-static {v2}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_20
    const-string v2, "\u06e0\u06e8\u06e7"

    invoke-static {v2}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    goto/16 :goto_0

    :sswitch_20
    const-string v2, "\u06e2\u06e3\u06e1"

    move-object/from16 v4, v16

    goto/16 :goto_8

    :sswitch_21
    const v2, 0x7e0301b4

    sget v4, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    xor-int/2addr v2, v4

    invoke-virtual {v6, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v4, v2, Lh40;

    if-eqz v4, :cond_9

    check-cast v2, Lh40;

    invoke-static {}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۥۧۧ()I

    move-result v4

    if-gtz v4, :cond_21

    const/16 v4, 0x31

    sput v4, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    const-string v4, "\u06e7\u06e1\u06e1"

    invoke-static {v4}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v20, v2

    move/from16 v43, v4

    goto/16 :goto_0

    :cond_21
    const-string v4, "\u06e7\u06e4\u06e6"

    move-object/from16 v20, v2

    goto/16 :goto_1

    :sswitch_22
    sget v2, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v4, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    rem-int/2addr v2, v4

    const v4, 0x1aba2a

    xor-int/2addr v2, v4

    move/from16 v43, v2

    goto/16 :goto_0

    :sswitch_23
    move-object/from16 v0, v41

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setTextColor(I)V

    move-object/from16 v0, v38

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setTextColor(I)V

    if-nez v12, :cond_17

    const/high16 v2, 0x3f800000    # 1.0f

    move-object/from16 v0, v26

    invoke-virtual {v0, v2}, Lh40;->b(F)V

    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v4, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    add-int/2addr v2, v4

    const v4, -0x1abf30

    xor-int/2addr v2, v4

    move/from16 v43, v2

    goto/16 :goto_0

    :sswitch_24
    const v2, 0x3f933333    # 1.15f

    move-object/from16 v0, v21

    invoke-virtual {v0, v2}, Lh40;->b(F)V

    const-string v2, "\u06e7\u06e2\u06e7"

    move-object v4, v15

    goto/16 :goto_8

    :sswitch_25
    const/high16 v2, 0x42000000    # 32.0f

    invoke-static {v2}, Lff;->p(F)F

    move-result v28

    invoke-virtual/range {v29 .. v29}, Landroid/view/View;->getX()F

    move-result v36

    invoke-virtual/range {v29 .. v29}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    const/high16 v4, 0x41980000    # 19.0f

    add-float/2addr v2, v4

    sub-float v2, v2, v44

    const/high16 v4, 0x41980000    # 19.0f

    sub-float/2addr v2, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v13, v2, v4

    invoke-virtual/range {v29 .. v29}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/high16 v4, 0x40800000    # 4.0f

    add-float/2addr v2, v4

    sub-float v2, v2, v28

    const/high16 v4, 0x40800000    # 4.0f

    sub-float/2addr v2, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v14, v2, v4

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v2}, Lff;->p(F)F

    move-result v35

    sget v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v4, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    add-int/lit16 v4, v4, -0x2239

    xor-int/2addr v2, v4

    if-gtz v2, :cond_22

    const-string v2, "\u06e4\u06e1\u06e4"

    move-object/from16 v4, v31

    :goto_13
    invoke-static {v2}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v31, v4

    move/from16 v43, v2

    move/from16 v32, v13

    move/from16 v33, v14

    move/from16 v34, v28

    goto/16 :goto_0

    :cond_22
    const-string v2, "\u06df\u06e5\u06e0"

    invoke-static {v2}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    move/from16 v32, v13

    move/from16 v33, v14

    move/from16 v34, v28

    goto/16 :goto_0

    :sswitch_26
    sget v2, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    xor-int/lit16 v2, v2, 0x346

    add-int v23, v23, v2

    sget v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    if-gtz v2, :cond_23

    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    const-string v2, "\u06e7\u06e2\u06e7"

    :goto_14
    invoke-static {v2}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_23
    sget v2, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v4, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sub-int/2addr v2, v4

    const v4, 0x1aac7e

    add-int/2addr v2, v4

    move/from16 v43, v2

    goto/16 :goto_0

    :sswitch_27
    const-string v2, "sdQRAjTew6OxzglOdtiCrr7SCU5g0oKjsM9QAGHRzu2r2A0LNNzMqa3OFAo6ysupuMQJQEDY2rmJ\nyBgZ\n"

    const-string v4, "36F9bhS9os0=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v2, v3

    check-cast v2, Landroid/widget/TextView;

    const/4 v4, 0x1

    invoke-virtual {v6, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    const-string v13, "FTcR71ih2VIVLQmjGqeYXxoxCaMMrZhSFCxQ7Q2u1BwPOw3mWKPWWAktFOdWtdFYHCcJrSynwEgt\nKxj0\n"

    const-string v14, "e0J9g3jCuDw=\n"

    invoke-static {v13, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v4}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v4, Landroid/widget/TextView;

    invoke-static {}, Lkotlinx/coroutines/ۦۡۧۧ;->۟ۤۧۨۦ()I

    move-result v13

    if-ltz v13, :cond_24

    const/16 v13, 0x58

    sput v13, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    const-string v13, "\u06e0\u06e7\u06e3"

    invoke-static {v13}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v38, v4

    move-object/from16 v41, v2

    move/from16 v43, v13

    goto/16 :goto_0

    :cond_24
    const-string v13, "\u06e7\u06e8\u06e1"

    invoke-static {v13}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v38, v4

    move-object/from16 v41, v2

    move/from16 v43, v13

    goto/16 :goto_0

    :sswitch_28
    invoke-virtual/range {v27 .. v27}, Lh40;->h()V

    const-string v2, "\u06e4\u06e4\u06e7"

    move-object v4, v2

    goto/16 :goto_1

    :cond_25
    move-object v15, v8

    move v2, v4

    :goto_15
    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v13, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    xor-int/2addr v4, v13

    const v13, 0x1ab20d

    xor-int/2addr v4, v13

    move/from16 v37, v2

    move/from16 v43, v4

    goto/16 :goto_0

    :sswitch_29
    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v4, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    div-int/lit16 v4, v4, -0x182

    mul-int/2addr v2, v4

    if-eqz v2, :cond_26

    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    const-string v2, "\u06e3\u06df\u06e1"

    invoke-static {v2}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_26
    const-string v2, "\u06e2\u06e6\u06e3"

    goto/16 :goto_14

    :sswitch_2a
    aget-object v2, v30, v23

    sget v4, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    xor-int/lit16 v4, v4, 0x36d

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    sget v2, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v4, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    or-int/lit16 v4, v4, 0x115a

    add-int/2addr v2, v4

    if-gtz v2, :cond_27

    const/16 v2, 0x3c

    sput v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    const-string v2, "\u06e5\u06e7\u06e2"

    invoke-static {v2}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_27
    sget v2, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v4, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    xor-int/2addr v2, v4

    const v4, 0x1ac97d    # 2.460003E-39f

    add-int/2addr v2, v4

    move/from16 v43, v2

    goto/16 :goto_0

    :sswitch_2b
    if-nez v15, :cond_7

    new-instance v4, Lh40;

    aget-object v2, v18, v23

    sget-object v13, Lh40;->m:Lqh;

    invoke-direct {v4, v2, v13}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    const/4 v2, 0x0

    const/high16 v13, 0x43480000    # 200.0f

    const v14, 0x3f333333    # 0.7f

    invoke-static {v2, v13, v14}, Lz30;->f(FFF)Li40;

    move-result-object v2

    iput-object v2, v4, Lh40;->j:Li40;

    aget-object v2, v18, v23

    move/from16 v0, v37

    invoke-virtual {v2, v0, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    sget v2, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v13, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    or-int/lit16 v13, v13, 0x1f0a

    mul-int/2addr v2, v13

    if-ltz v2, :cond_28

    const/16 v2, 0x2c

    sput v2, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    const-string v2, "\u06e3\u06df\u06e3"

    invoke-static {v2}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v31, v4

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_28
    const-string v2, "\u06e2\u06e6\u06e5"

    move/from16 v13, v32

    move/from16 v14, v33

    move/from16 v28, v34

    goto/16 :goto_13

    :sswitch_2c
    const-string v2, "\u06e7\u06e1\u06df"

    invoke-static {v2}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v27, v31

    move/from16 v43, v2

    goto/16 :goto_0

    :sswitch_2d
    const v2, -0x7e040334

    sget v4, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    xor-int/2addr v4, v2

    move-object/from16 v0, v40

    invoke-virtual {v0, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v13, v2, Lh40;

    if-eqz v13, :cond_25

    check-cast v2, Lh40;

    sget v13, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v14, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sub-int/2addr v13, v14

    const v14, 0x1aa5a1

    add-int/2addr v13, v14

    move-object/from16 v16, v2

    move-object v15, v8

    move/from16 v37, v4

    move/from16 v43, v13

    goto/16 :goto_0

    :sswitch_2e
    move-object/from16 v0, p8

    move/from16 v1, p13

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    const-string v4, "UvU6Me1vjnVS7yJ9r2nPeF3zIn25Y891U+57M7hggztI+SY47W2Bf07vPznje4Z/W+Uic4FlgX5d\n8ho8tGOabw==\n"

    const-string v13, "PIBWXc0M7xs=\n"

    invoke-static {v4, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v2, Landroid/widget/LinearLayout;

    if-eqz p14, :cond_1d

    sget-object v4, Lgn;->a:Lgn;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "\u06e2\u06e8\u06e5"

    invoke-static {v4}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v29, v2

    move/from16 v43, v4

    goto/16 :goto_0

    :sswitch_2f
    aget-object v2, v30, v23

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    aget-object v2, v18, v23

    const/high16 v4, 0x41f00000    # 30.0f

    invoke-static {v4}, Lff;->p(F)F

    move-result v4

    invoke-virtual {v2, v4}, Landroid/view/View;->setTranslationY(F)V

    aget-object v2, v18, v23

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Landroid/view/View;->setAlpha(F)V

    aget-object v2, v18, v23

    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {v2, v4}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const-wide/16 v46, 0xf9

    sget v4, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    int-to-long v0, v4

    move-wide/from16 v48, v0

    xor-long v46, v46, v48

    move-wide/from16 v0, v46

    invoke-virtual {v2, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    aget-object v2, v18, v23

    sget v4, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v13, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    mul-int/lit16 v13, v13, -0x808

    mul-int/2addr v4, v13

    if-gtz v4, :cond_29

    const/16 v4, 0x5b

    sput v4, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    const-string v4, "\u06e4\u06e4\u06e7"

    invoke-static {v4}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v40, v2

    move/from16 v43, v4

    goto/16 :goto_0

    :cond_29
    const-string v4, "\u06e0\u06e7\u06e3"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v40, v2

    move/from16 v43, v4

    goto/16 :goto_0

    :cond_2a
    move-object/from16 v26, v19

    :sswitch_30
    sget v2, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v4, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    mul-int/2addr v2, v4

    const v4, 0x1f70e7

    add-int/2addr v2, v4

    move/from16 v43, v2

    goto/16 :goto_0

    :sswitch_31
    const/high16 v2, 0x3f800000    # 1.0f

    move-object/from16 v0, v21

    invoke-virtual {v0, v2}, Lh40;->b(F)V

    sget v2, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v4, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    div-int/lit8 v4, v4, -0x4e

    xor-int/2addr v2, v4

    if-gtz v2, :cond_2b

    const-string v2, "\u06e3\u06e0\u06e1"

    invoke-static {v2}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_2b
    const-string v2, "\u06e7\u06e5\u06df"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_2c
    :sswitch_32
    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    move-result v2

    if-ltz v2, :cond_2d

    const-string v2, "\u06e4\u06e3\u06e0"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_2d
    sget v2, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v4, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sub-int/2addr v2, v4

    const v4, 0x1ab2b4

    add-int/2addr v2, v4

    move/from16 v43, v2

    goto/16 :goto_0

    :sswitch_33
    move-object v2, v5

    check-cast v2, Lh40;

    sget v4, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v13, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    add-int/lit16 v13, v13, -0x232d

    sub-int/2addr v4, v13

    if-gtz v4, :cond_2e

    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    const-string v4, "\u06e2\u06df\u06e0"

    invoke-static {v4}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v19, v2

    move/from16 v43, v4

    goto/16 :goto_0

    :cond_2e
    move-object/from16 v4, v18

    move-object v13, v2

    goto/16 :goto_b

    :sswitch_34
    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v4, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    or-int/lit16 v4, v4, -0x12c5

    div-int/2addr v2, v4

    if-gtz v2, :cond_2f

    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    const-string v2, "\u06e1\u06e7\u06e5"

    invoke-static {v2}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v27, v15

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_2f
    move-object/from16 v2, v24

    move-object/from16 v4, v25

    move-object/from16 v13, v26

    move-object v14, v15

    goto/16 :goto_11

    :sswitch_35
    const v2, 0x3f19999a    # 0.6f

    move-object/from16 v0, v24

    invoke-virtual {v0, v2}, Li40;->a(F)V

    move-object/from16 v0, v24

    move-object/from16 v1, v25

    iput-object v0, v1, Lh40;->j:Li40;

    move-object/from16 v0, v25

    invoke-virtual {v6, v9, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    sget v2, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    if-gtz v2, :cond_30

    const/16 v2, 0x2e

    sput v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    const-string v2, "\u06df\u06e0\u06e1"

    invoke-static {v2}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_30
    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v4, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    div-int/2addr v2, v4

    const v4, 0x1aa7dd

    add-int/2addr v2, v4

    move/from16 v43, v2

    goto/16 :goto_0

    :sswitch_36
    sget v2, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v4, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    div-int/lit16 v4, v4, -0x161b

    xor-int/2addr v2, v4

    if-ltz v2, :cond_31

    const-string v2, "\u06e2\u06e8\u06e5"

    move-object v4, v2

    goto/16 :goto_1

    :cond_31
    const-string v2, "\u06e2\u06e2\u06e0"

    invoke-static {v2}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    goto/16 :goto_0

    :sswitch_37
    sget v2, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v4, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    mul-int/lit16 v4, v4, 0x1bf2

    mul-int/2addr v2, v4

    if-gtz v2, :cond_32

    const/16 v2, 0x52

    sput v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    const-string v2, "\u06e4\u06e2\u06e7"

    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_32
    const-string v2, "\u06e0\u06e1\u06e2"

    move-object/from16 v28, v2

    move-object/from16 v4, v25

    goto/16 :goto_7

    :sswitch_38
    move/from16 v0, v23

    move/from16 v1, p13

    if-ne v0, v1, :cond_1a

    move-object/from16 v0, v41

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setTextColor(I)V

    move-object/from16 v0, v38

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setTextColor(I)V

    if-nez v12, :cond_b

    const v2, 0x3f933333    # 1.15f

    move-object/from16 v0, v26

    invoke-virtual {v0, v2}, Lh40;->b(F)V

    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    move-result v2

    if-ltz v2, :cond_33

    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    const-string v2, "\u06e5\u06e2\u06e4"

    invoke-static {v2}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_33
    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v4, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    xor-int/2addr v2, v4

    const v4, -0x1ac2d3

    xor-int/2addr v2, v4

    move/from16 v43, v2

    goto/16 :goto_0

    :sswitch_39
    sget v2, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    if-ltz v2, :cond_34

    const-string v2, "\u06e0\u06e5\u06e5"

    invoke-static {v2}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v26, v25

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_34
    sget v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v4, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    mul-int/2addr v2, v4

    const v4, 0x2160e6

    add-int/2addr v2, v4

    move-object/from16 v26, v25

    move/from16 v43, v2

    goto/16 :goto_0

    :sswitch_3a
    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    move-result v2

    if-ltz v2, :cond_35

    const/16 v2, 0x47

    sput v2, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    const-string v2, "\u06e3\u06e3\u06e7"

    invoke-static {v2}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v21, v42

    move/from16 v43, v2

    goto/16 :goto_0

    :cond_35
    sget v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v4, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    add-int/2addr v2, v4

    const v4, 0x1ac0ca

    add-int/2addr v2, v4

    move-object/from16 v21, v42

    move/from16 v43, v2

    goto/16 :goto_0

    :sswitch_3b
    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v4, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    add-int/2addr v2, v4

    const v4, 0x1ab56b

    add-int/2addr v2, v4

    move/from16 v43, v2

    goto/16 :goto_0

    :sswitch_3c
    const/4 v2, 0x4

    move/from16 v0, v23

    if-ge v0, v2, :cond_2c

    move-object/from16 v0, p8

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    const-string v3, "NUCGog4omd01Wp7uTC7Y0DpGnu5aJNjdNFvHoFsnlJMvTJqrDiqW1ylag6oAPJHXPFCe4GIiltY6\nR6avVySNxw==\n"

    const-string v4, "WzXqzi5L+LM=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v2, Landroid/widget/LinearLayout;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    sget v4, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v6, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    mul-int/lit16 v6, v6, -0x1687

    or-int/2addr v4, v6

    if-ltz v4, :cond_36

    move-object v4, v7

    goto/16 :goto_3

    :cond_36
    sget v4, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v6, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    or-int/2addr v4, v6

    const v6, 0x1aae45

    add-int/2addr v4, v6

    move-object v6, v2

    move/from16 v43, v4

    goto/16 :goto_0

    :sswitch_3d
    move-object/from16 v0, p9

    iget v12, v0, Lon;->a:I

    move-object/from16 v0, p9

    iget v2, v0, Lon;->f:I

    move-object/from16 v0, p9

    iget v4, v0, Lon;->g:I

    const/4 v10, 0x1

    if-ne v12, v10, :cond_4

    const/high16 v10, 0x42800000    # 64.0f

    invoke-static {v10}, Lff;->p(F)F

    move-result v14

    sget v10, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v11, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    mul-int/2addr v10, v11

    const v11, 0x1ac8de

    add-int v13, v10, v11

    move v10, v2

    move v11, v4

    move/from16 v43, v13

    move/from16 v44, v14

    goto/16 :goto_0

    :sswitch_3e
    return-void

    :sswitch_3f
    move-object/from16 v2, v21

    goto/16 :goto_d

    :sswitch_40
    move/from16 v2, v37

    goto/16 :goto_15

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc04 -> :sswitch_0
        0xdc5e -> :sswitch_28
        0xdc62 -> :sswitch_f
        0xdc7f -> :sswitch_22
        0xdc9d -> :sswitch_3d
        0x1aa720 -> :sswitch_40
        0x1aa75d -> :sswitch_17
        0x1aa79e -> :sswitch_37
        0x1aa7ba -> :sswitch_1f
        0x1aa7dd -> :sswitch_39
        0x1aa7df -> :sswitch_21
        0x1aa7e1 -> :sswitch_20
        0x1aaac6 -> :sswitch_7
        0x1aaac8 -> :sswitch_4
        0x1aab01 -> :sswitch_e
        0x1aab5e -> :sswitch_11
        0x1aab80 -> :sswitch_14
        0x1aabb9 -> :sswitch_1e
        0x1aabbc -> :sswitch_2d
        0x1aabc0 -> :sswitch_12
        0x1aabdf -> :sswitch_36
        0x1aaedf -> :sswitch_3c
        0x1aaf7c -> :sswitch_34
        0x1aaf7f -> :sswitch_e
        0x1ab243 -> :sswitch_27
        0x1ab2a0 -> :sswitch_2
        0x1ab2c0 -> :sswitch_2b
        0x1ab31f -> :sswitch_22
        0x1ab321 -> :sswitch_2c
        0x1ab35f -> :sswitch_16
        0x1ab605 -> :sswitch_15
        0x1ab607 -> :sswitch_10
        0x1ab624 -> :sswitch_32
        0x1ab665 -> :sswitch_3e
        0x1ab687 -> :sswitch_33
        0x1ab6a4 -> :sswitch_13
        0x1ab6de -> :sswitch_12
        0x1ab9c8 -> :sswitch_1b
        0x1aba06 -> :sswitch_25
        0x1aba07 -> :sswitch_23
        0x1aba09 -> :sswitch_30
        0x1aba29 -> :sswitch_6
        0x1aba65 -> :sswitch_31
        0x1aba67 -> :sswitch_3b
        0x1abac1 -> :sswitch_7
        0x1abadb -> :sswitch_18
        0x1abae3 -> :sswitch_3f
        0x1abd8d -> :sswitch_1a
        0x1abdcc -> :sswitch_b
        0x1abde7 -> :sswitch_3
        0x1abe64 -> :sswitch_35
        0x1abe80 -> :sswitch_15
        0x1ac16a -> :sswitch_1
        0x1ac1c7 -> :sswitch_24
        0x1ac1ca -> :sswitch_9
        0x1ac1e2 -> :sswitch_3a
        0x1ac1e7 -> :sswitch_38
        0x1ac262 -> :sswitch_2e
        0x1ac52a -> :sswitch_a
        0x1ac52d -> :sswitch_1d
        0x1ac545 -> :sswitch_8
        0x1ac547 -> :sswitch_1c
        0x1ac56c -> :sswitch_2f
        0x1ac5a9 -> :sswitch_29
        0x1ac5c1 -> :sswitch_2a
        0x1ac608 -> :sswitch_d
        0x1ac620 -> :sswitch_19
        0x1ac8ed -> :sswitch_2
        0x1ac92e -> :sswitch_5
        0x1ac984 -> :sswitch_c
        0x1ac987 -> :sswitch_26
    .end sparse-switch
.end method
