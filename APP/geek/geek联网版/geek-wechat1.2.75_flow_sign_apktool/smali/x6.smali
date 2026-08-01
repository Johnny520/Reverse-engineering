.class public final synthetic Lx6;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 3

    iput p4, p0, Lx6;->a:I

    iput-object p1, p0, Lx6;->b:Ljava/lang/Object;

    iput-object p2, p0, Lx6;->c:Ljava/lang/Object;

    iput-object p3, p0, Lx6;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e3\u06e4"

    invoke-static {v0}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    move-result v0

    if-gtz v0, :cond_2

    sget v0, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    div-int/lit16 v2, v2, -0x2545

    xor-int/2addr v0, v2

    if-ltz v0, :cond_1

    :cond_0
    const-string v0, "\u06e3\u06e2\u06e2"

    invoke-static {v0}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    rem-int/2addr v0, v2

    const v2, 0x1ab80c

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_1
    sget v0, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v2, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    add-int/2addr v0, v2

    const v2, 0xdf9f

    add-int/2addr v0, v2

    goto :goto_0

    :cond_2
    :sswitch_2
    sget v0, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    rem-int/lit16 v2, v2, -0x129c

    or-int/2addr v0, v2

    if-ltz v0, :cond_3

    const-string v0, "\u06e0\u06df\u06e3"

    :goto_1
    invoke-static {v0}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e3\u06e2\u06e2"

    goto :goto_1

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟ۡۡۦ()I

    move-result v0

    if-gtz v0, :cond_0

    const/16 v0, 0x3d

    sput v0, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    const-string v0, "\u06e4\u06e0\u06e5"

    invoke-static {v0}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_4
    const-string v0, "xgFNBUnDTA7"

    invoke-static {v0}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۥ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sub-int/2addr v0, v2

    const v2, -0x1ac329

    xor-int/2addr v0, v2

    goto :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc61 -> :sswitch_0
        0x1ab647 -> :sswitch_4
        0x1ab663 -> :sswitch_5
        0x1ab9e9 -> :sswitch_2
        0x1abe65 -> :sswitch_1
        0x1ac1e2 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 36

    move-object/from16 v0, p0

    iget v5, v0, Lx6;->a:I

    move-object/from16 v0, p0

    iget-object v4, v0, Lx6;->d:Ljava/lang/Object;

    move-object/from16 v0, p0

    iget-object v3, v0, Lx6;->c:Ljava/lang/Object;

    move-object/from16 v0, p0

    iget-object v2, v0, Lx6;->b:Ljava/lang/Object;

    packed-switch v5, :pswitch_data_0

    check-cast v2, Landroid/app/Activity;

    check-cast v3, Landroid/widget/FrameLayout;

    check-cast v4, Landroid/widget/LinearLayout;

    const/4 v5, 0x0

    sput-object v5, Lx50;->d:Ljava/lang/Integer;

    const/4 v5, 0x0

    sput-object v5, Lx50;->e:Ljava/lang/Integer;

    :try_start_0
    sget-object v5, Lkn;->a:Lkn;

    const-string v6, "Ro466gxgpV9yhC0=\n"

    const-string v7, "LetDtWgJxjo=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x0

    invoke-static {v6, v5}, Lkn;->f(Ljava/lang/String;Z)V

    const-string v5, "IzjL3Bi1YRknMw==\n"

    const-string v6, "SF2yg2rFEkY=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v6}, Lkn;->f(Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    sget-object v5, Lkn;->a:Lkn;

    const-string v6, "sNaUEb3hllXT6PSV1b++PLTWqw==\n"

    const-string v7, "UkoRMVhWJLM=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v6}, Lkn;->k(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    :goto_1
    return-void

    :catchall_0
    move-exception v5

    const-string v5, "06ke\n"

    const-string v6, "p8h5VTpLcuY=\n"

    const-string v7, "cR/p4BmIhxVXG9PKOw==\n"

    const-string v8, "MneMgW3Y5ns=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "tw==\n"

    const-string v9, "0vI8ySRxU5w=\n"

    invoke-static {v5, v6, v7, v8, v9}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_0
    move-object v15, v2

    check-cast v15, Landroid/app/Activity;

    move-object v11, v3

    check-cast v11, Landroid/widget/TextView;

    check-cast v4, Lp00;

    const-string v2, "Ubd0T1p25VRJtGhicXf0VVW0Un9A\n"

    const-string v3, "OtINEC4EhDo=\n"

    sget-object v5, Lkn;->a:Lkn;

    invoke-static {v2, v3, v5}, Lg40;->q(Ljava/lang/String;Ljava/lang/String;Lkn;)Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    const v2, 0x7e120012

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/Long;

    if-eqz v3, :cond_2

    check-cast v2, Ljava/lang/Long;

    :goto_2
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    :goto_3
    const-wide/16 v8, 0xc

    add-long/2addr v8, v6

    sub-long v2, v8, v2

    const-wide/16 v8, 0xc

    sub-long/2addr v2, v8

    const-wide/16 v8, 0x12c

    cmp-long v2, v2, v8

    if-gez v2, :cond_a

    const/4 v2, 0x1

    move-object/from16 v0, p1

    invoke-static {v0, v2}, Lkn;->i(Landroid/view/View;I)V

    iget-object v12, v4, Lp00;->b:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    new-instance v13, Landroid/app/Dialog;

    const v2, 0x1030010

    invoke-direct {v13, v15, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v14, v2, Landroid/util/DisplayMetrics;->density:F

    const-string v2, "6Fp4Ohuy69k=\n"

    const-string v3, "tHIkXjDuwv0=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "pattern"

    invoke-static {v3, v2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    const-string v3, "compile(...)"

    invoke-static {v3, v2}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "input"

    invoke-static {v3, v12}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v2, v12}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "replaceAll(...)"

    invoke-static {v3, v2}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v2}, Li50;->Q(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "top_title_text_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    invoke-static {v2, v3}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ln00;

    invoke-direct {v4}, Ln00;-><init>()V

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "top_title_color_"

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    invoke-static {v3, v5}, Lkn;->b(Ljava/lang/String;I)I

    move-result v3

    iput v3, v4, Ln00;->a:I

    new-instance v21, Landroid/widget/FrameLayout;

    move-object/from16 v0, v21

    invoke-direct {v0, v15}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const-string v3, "Ji7Gxs4uHzI1\n"

    const-string v5, "BRjw9v4eLwI=\n"

    invoke-static {v3, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    move-object/from16 v0, v21

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v3, Le7;

    const/16 v5, 0xf

    invoke-direct {v3, v13, v5}, Le7;-><init>(Landroid/app/Dialog;I)V

    move-object/from16 v0, v21

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v22, Landroid/widget/LinearLayout;

    move-object/from16 v0, v22

    invoke-direct {v0, v15}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x1

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v5, -0x1

    invoke-virtual {v3, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v5, 0x41800000    # 16.0f

    mul-float/2addr v5, v14

    invoke-virtual {v3, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/high16 v3, 0x41a00000    # 20.0f

    mul-float/2addr v3, v14

    float-to-int v3, v3

    move-object/from16 v0, v22

    invoke-virtual {v0, v3, v3, v3, v3}, Landroid/view/View;->setPadding(IIII)V

    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v6, -0x1

    const/4 v7, -0x2

    invoke-direct {v5, v6, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v6, 0x11

    iput v6, v5, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    const/high16 v6, 0x41f00000    # 30.0f

    mul-float/2addr v6, v14

    float-to-int v6, v6

    iput v6, v5, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    iput v6, v5, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    move-object/from16 v0, v22

    invoke-virtual {v0, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Ly6;

    invoke-direct {v5}, Ly6;-><init>()V

    move-object/from16 v0, v22

    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, v15}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v6, "WMX80FCLHps2jeihO6RS3h/+roBa\n"

    const-string v7, "sWRKOdMj+Ds=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v6, 0x41900000    # 18.0f

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextSize(F)V

    const-string v6, "70tBufeX4w==\n"

    const-string v7, "zHhyisSk0Ic=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-virtual {v5, v6, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    const/high16 v6, 0x41700000    # 15.0f

    mul-float/2addr v6, v14

    float-to-int v6, v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual {v5, v7, v8, v9, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    move-object/from16 v0, v22

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v8, Landroid/widget/EditText;

    invoke-direct {v8, v15}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_4

    :goto_4
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v2, 0x41800000    # 16.0f

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextSize(F)V

    iget v2, v4, Ln00;->a:I

    if-eqz v2, :cond_5

    :goto_5
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v2, 0x1

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-string v5, "m/Z/9U/Sug==\n"

    const-string v7, "uLBKs3qUjz8=\n"

    invoke-static {v5, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v2, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v5, 0x41000000    # 8.0f

    mul-float v16, v5, v14

    move/from16 v0, v16

    invoke-virtual {v2, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    const/high16 v5, 0x3f800000    # 1.0f

    mul-float/2addr v5, v14

    float-to-int v5, v5

    const-string v7, "ZYk44tdlkQ==\n"

    const-string v9, "Rs18ppMh1WM=\n"

    invoke-static {v7, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v2, v5, v7}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual {v8, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/high16 v2, 0x41400000    # 12.0f

    mul-float/2addr v2, v14

    float-to-int v2, v2

    const/high16 v5, 0x41200000    # 10.0f

    mul-float/2addr v5, v14

    float-to-int v5, v5

    invoke-virtual {v8, v2, v5, v2, v5}, Landroid/view/View;->setPadding(IIII)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v5, -0x1

    const/4 v7, -0x2

    invoke-direct {v2, v5, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput v6, v2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v8, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v8}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-virtual {v8, v2}, Landroid/widget/EditText;->setSelection(I)V

    move-object/from16 v0, v22

    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, v15}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v5, "iW647gCVb7fnB5OQYp4V/+lcESBuiy/z2G7VsDHVMo+IQJUh\n"

    const-string v6, "YO4xCIs8iRc=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v5, 0x41500000    # 13.0f

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextSize(F)V

    const-string v5, "GEaRtI1DeQ==\n"

    const-string v6, "O3Cngrt1TzU=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    move/from16 v0, v16

    float-to-int v0, v0

    move/from16 v17, v0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move/from16 v0, v17

    invoke-virtual {v2, v5, v6, v7, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v18, Landroid/widget/LinearLayout;

    move-object/from16 v0, v18

    invoke-direct {v0, v15}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x0

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v5, -0x1

    const/4 v6, -0x2

    invoke-direct {v2, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v2, 0x6

    new-array v0, v2, [I

    move-object/from16 v19, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    aput v3, v19, v2

    const/4 v2, 0x1

    const-string v3, "Lrgsc59QJg==\n"

    const-string v5, "Df0ZRKxnFS4=\n"

    invoke-static {v3, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    aput v3, v19, v2

    const/4 v2, 0x2

    const-string v3, "ojJzxOC3sQ==\n"

    const-string v5, "gQRHhtXxh18=\n"

    invoke-static {v3, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    aput v3, v19, v2

    const/4 v2, 0x3

    const-string v3, "aNZHF/EZLg==\n"

    const-string v5, "S+52VMYhGo0=\n"

    invoke-static {v3, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    aput v3, v19, v2

    const/4 v2, 0x4

    const-string v3, "nHYsy85qGw==\n"

    const-string v5, "vzBqif1aKxI=\n"

    invoke-static {v3, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    aput v3, v19, v2

    const/4 v2, 0x5

    const-string v3, "TPj5Il8K3g==\n"

    const-string v5, "b7q4FGdJ5nw=\n"

    invoke-static {v3, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    aput v3, v19, v2

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    move v9, v2

    :goto_6
    const/4 v2, 0x6

    if-ge v9, v2, :cond_8

    aget v5, v19, v9

    new-instance v3, Landroid/widget/FrameLayout;

    invoke-direct {v3, v15}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v7, 0x0

    const/high16 v20, 0x42100000    # 36.0f

    mul-float v20, v20, v14

    move/from16 v0, v20

    float-to-int v0, v0

    move/from16 v20, v0

    const/high16 v23, 0x3f800000    # 1.0f

    move/from16 v0, v20

    move/from16 v1, v23

    invoke-direct {v2, v7, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    const/high16 v7, 0x40800000    # 4.0f

    mul-float/2addr v7, v14

    float-to-int v7, v7

    const/16 v20, 0x0

    const/16 v23, 0x0

    move/from16 v0, v20

    move/from16 v1, v23

    invoke-virtual {v2, v7, v0, v7, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v3, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v7, Landroid/view/View;

    invoke-direct {v7, v15}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v20, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct/range {v20 .. v20}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v2, 0x1

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    if-nez v5, :cond_6

    const-string v2, "J3dHWs/DBg==\n"

    const-string v23, "BDJ3H/+GNvM=\n"

    move-object/from16 v0, v23

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    :goto_7
    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    move-object/from16 v0, v20

    invoke-virtual {v7, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/high16 v2, 0x41e00000    # 28.0f

    mul-float/2addr v2, v14

    float-to-int v2, v2

    new-instance v20, Landroid/widget/FrameLayout$LayoutParams;

    move-object/from16 v0, v20

    invoke-direct {v0, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v2, 0x11

    move-object/from16 v0, v20

    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    move-object/from16 v0, v20

    invoke-virtual {v7, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    if-nez v5, :cond_1

    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/16 v20, 0x1

    move/from16 v0, v20

    invoke-virtual {v2, v0}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    const/16 v20, 0x0

    move/from16 v0, v20

    invoke-virtual {v2, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v20, 0x3fc00000    # 1.5f

    mul-float v20, v20, v14

    move/from16 v0, v20

    float-to-int v0, v0

    move/from16 v20, v0

    const-string v23, "71dePVcYJQ==\n"

    const-string v24, "zG5nBG4hHP8=\n"

    invoke-static/range {v23 .. v24}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v23

    invoke-static/range {v23 .. v23}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v23

    move/from16 v0, v20

    move/from16 v1, v23

    invoke-virtual {v2, v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual {v7, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v7}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v7, v2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    const/4 v2, 0x0

    invoke-virtual {v7, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, v14

    float-to-int v2, v2

    const-string v20, "LxhlglQtDQ==\n"

    const-string v23, "DCtWsWcePow=\n"

    move-object/from16 v0, v20

    move-object/from16 v1, v23

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v20

    move/from16 v0, v20

    invoke-virtual {v7, v2, v0}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    iget v2, v4, Ln00;->a:I

    if-ne v5, v2, :cond_7

    move-object v2, v7

    :goto_8
    invoke-virtual {v3, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v2, Ln80;

    invoke-direct/range {v2 .. v8}, Ln80;-><init>(Landroid/widget/FrameLayout;Ln00;ILjava/util/ArrayList;Landroid/graphics/drawable/GradientDrawable;Landroid/widget/EditText;)V

    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v18

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    rsub-int/lit8 v2, v9, 0x0

    rsub-int/lit8 v2, v2, 0x1

    move v9, v2

    goto/16 :goto_6

    :cond_2
    const/4 v2, 0x0

    goto/16 :goto_2

    :cond_3
    const-wide/16 v2, 0x0

    goto/16 :goto_3

    :cond_4
    move-object v2, v12

    goto/16 :goto_4

    :cond_5
    const/high16 v2, -0x1000000

    goto/16 :goto_5

    :cond_6
    move v2, v5

    goto/16 :goto_7

    :cond_7
    const/4 v2, 0x0

    goto :goto_8

    :cond_8
    move-object/from16 v0, v22

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v15}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v5, -0x1

    const/4 v6, -0x2

    invoke-direct {v3, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, v15}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v5, "Bee4JaeNSoh7jrRk\n"

    const-string v6, "42YawAMAozM=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v5, 0x41700000    # 15.0f

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextSize(F)V

    const-string v5, "aZoixrWZlA==\n"

    const-string v6, "SqwU8IOvoq8=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v5, 0x11

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setGravity(I)V

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-virtual {v3, v5, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-string v6, "E0rG1L4XAA==\n"

    const-string v7, "MAz2ko5RMNo=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    move/from16 v0, v16

    invoke-virtual {v5, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v3, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/high16 v5, 0x42280000    # 42.0f

    mul-float/2addr v5, v14

    float-to-int v5, v5

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v7, 0x0

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-direct {v6, v7, v5, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    move/from16 v0, v17

    iput v0, v6, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    invoke-virtual {v3, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v9, Lea;

    const/4 v14, 0x3

    invoke-direct/range {v9 .. v14}, Lea;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroid/app/Dialog;I)V

    invoke-virtual {v3, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v6, Landroid/widget/TextView;

    invoke-direct {v6, v15}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v7, "6C7lz9dFzpCTd+2i\n"

    const-string v9, "DJF4KnrdKQQ=\n"

    const/high16 v14, 0x41700000    # 15.0f

    const/4 v15, -0x1

    invoke-static {v7, v9, v6, v14, v15}, Lg40;->n(Ljava/lang/String;Ljava/lang/String;Landroid/widget/TextView;FI)V

    const/16 v7, 0x11

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setGravity(I)V

    const/4 v7, 0x0

    const/4 v9, 0x1

    invoke-virtual {v6, v7, v9}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v7}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-string v9, "3M3b8IaYQQ==\n"

    const-string v14, "//vtsrXeBzo=\n"

    invoke-static {v9, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    invoke-virtual {v7, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    move/from16 v0, v16

    invoke-virtual {v7, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v6, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v9, 0x0

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v7, v9, v5, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    move/from16 v0, v17

    iput v0, v7, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v14, Lg8;

    move-object v15, v8

    move-object/from16 v16, v12

    move-object/from16 v17, v4

    move-object/from16 v18, v10

    move-object/from16 v19, v11

    move-object/from16 v20, v13

    invoke-direct/range {v14 .. v20}, Lg8;-><init>(Landroid/widget/EditText;Ljava/lang/String;Ln00;Ljava/lang/String;Landroid/widget/TextView;Landroid/app/Dialog;)V

    invoke-virtual {v6, v14}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual/range {v21 .. v22}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v21

    invoke-virtual {v13, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    invoke-virtual {v13}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v2

    if-eqz v2, :cond_9

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Landroid/view/Window;->setSoftInputMode(I)V

    :cond_9
    invoke-virtual {v13}, Landroid/app/Dialog;->show()V

    const v2, 0x7e120012

    const-wide/16 v4, 0x0

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    move-object/from16 v0, p1

    invoke-virtual {v0, v2, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_a
    const v2, 0x7e120012

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    move-object/from16 v0, p1

    invoke-virtual {v0, v2, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_b
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v3, v2, Landroid/view/View;

    if-eqz v3, :cond_d

    check-cast v2, Landroid/view/View;

    :goto_9
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/view/View;->isClickable()Z

    move-result v3

    if-nez v3, :cond_c

    invoke-virtual {v2}, Landroid/view/View;->hasOnClickListeners()Z

    move-result v3

    if-eqz v3, :cond_e

    :cond_c
    invoke-virtual {v2}, Landroid/view/View;->performClick()Z

    goto/16 :goto_1

    :cond_d
    const/4 v2, 0x0

    goto :goto_9

    :cond_e
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v3, v2, Landroid/view/View;

    if-eqz v3, :cond_d

    check-cast v2, Landroid/view/View;

    goto :goto_9

    :pswitch_1
    check-cast v2, Lvv;

    check-cast v3, Lwv;

    check-cast v4, Luv;

    iget-object v5, v2, Lvv;->c:Ljava/util/LinkedHashSet;

    iget-object v3, v3, Lwv;->a:Ljava/lang/String;

    invoke-interface {v5, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-interface {v5, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :goto_a
    iget-object v5, v4, Luv;->a:Landroid/view/View;

    const v3, 0x7e060001

    invoke-virtual {v5, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lo40;

    if-eqz v4, :cond_11

    check-cast v3, Lo40;

    :goto_b
    if-nez v3, :cond_27

    new-instance v3, Lo40;

    sget-object v4, Lo40;->o:Lsh;

    invoke-direct {v3, v5, v4}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    const v4, 0x7e060001

    invoke-virtual {v5, v4, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    move-object v4, v3

    :goto_c
    const v3, 0x7e060002    # 4.452915E37f

    invoke-virtual {v5, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v6, v3, Lo40;

    if-eqz v6, :cond_12

    check-cast v3, Lo40;

    :goto_d
    if-nez v3, :cond_f

    new-instance v3, Lo40;

    sget-object v6, Lo40;->p:Lsh;

    invoke-direct {v3, v5, v6}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    const v6, 0x7e060002    # 4.452915E37f

    invoke-virtual {v5, v6, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_f
    const v6, 0x3f266666    # 0.65f

    invoke-virtual {v5, v6}, Landroid/view/View;->setScaleX(F)V

    const v6, 0x3f266666    # 0.65f

    invoke-virtual {v5, v6}, Landroid/view/View;->setScaleY(F)V

    new-instance v5, Lp40;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-direct {v5, v6}, Lp40;-><init>(F)V

    const v6, 0x44bb8000    # 1500.0f

    invoke-virtual {v5, v6}, Lp40;->b(F)V

    const v6, 0x3ee66666    # 0.45f

    invoke-virtual {v5, v6}, Lp40;->a(F)V

    iput-object v5, v4, Lo40;->k:Lp40;

    const/high16 v5, 0x3f800000    # 1.0f

    const v6, 0x44bb8000    # 1500.0f

    const v7, 0x3ee66666    # 0.45f

    invoke-static {v5, v6, v7}, Lg40;->f(FFF)Lp40;

    move-result-object v5

    iput-object v5, v3, Lo40;->k:Lp40;

    invoke-virtual {v4}, Lo40;->h()V

    invoke-virtual {v3}, Lo40;->h()V

    invoke-virtual {v2}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    iget-object v2, v2, Lvv;->g:Lqv;

    invoke-virtual {v2}, Lqv;->a()Ljava/lang/Object;

    goto/16 :goto_1

    :cond_10
    invoke-interface {v5, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_11
    const/4 v3, 0x0

    goto :goto_b

    :cond_12
    const/4 v3, 0x0

    goto :goto_d

    :pswitch_2
    check-cast v2, Ln00;

    check-cast v3, Ln00;

    check-cast v4, Landroid/content/Context;

    sget-object v5, Lkn;->a:Lkn;

    invoke-static/range {p1 .. p1}, Lmp;->d(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x1

    move-object/from16 v0, p1

    invoke-static {v0, v5}, Lkn;->i(Landroid/view/View;I)V

    iget v2, v2, Ln00;->a:I

    if-eqz v2, :cond_13

    const/4 v2, 0x2

    iput v2, v3, Ln00;->a:I

    const-string v3, "Ap4nbQzpPotPyhkyU/hx+lauRjMpmWGfDqssYD/P\n"

    const-string v2, "5y6hiLZ92R8=\n"

    :goto_e
    invoke-static {v3, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Lkn;->k(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_13
    const-string v3, "nuYExAk1jdrerQuraivRr/bAV5khVMransAB\n"

    const-string v2, "dkmzIYy9aEY=\n"

    goto :goto_e

    :pswitch_3
    check-cast v3, Landroid/app/Dialog;

    move-object/from16 v17, v4

    check-cast v17, Landroid/content/Context;

    const/16 v4, 0x8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v20

    const/16 v4, 0xa

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v21

    sget-object v4, Lkn;->a:Lkn;

    invoke-static/range {p1 .. p1}, Lmp;->d(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x1

    move-object/from16 v0, p1

    invoke-static {v0, v4}, Lkn;->i(Landroid/view/View;I)V

    :try_start_1
    sget-object v4, Lln;->g:Ljava/lang/reflect/Field;

    if-eqz v4, :cond_18

    invoke-virtual {v4, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    :goto_f
    instance-of v4, v2, Ljava/lang/String;

    if-eqz v4, :cond_19

    check-cast v2, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_10
    if-nez v2, :cond_14

    const-string v2, ""

    :cond_14
    move-object/from16 v19, v2

    :goto_11
    invoke-virtual {v3}, Landroid/app/Dialog;->dismiss()V

    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_25

    sget-object v2, Lbw;->a:Landroid/os/Handler;

    sget-object v18, Lo9;->a:Ljava/lang/ClassLoader;

    const/high16 v2, 0x41200000    # 10.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v24

    const/high16 v2, 0x42000000    # 32.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v26

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v28

    const/16 v2, 0x18

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v29

    const/16 v2, 0x10

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v30

    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    if-eqz v18, :cond_0

    move-object/from16 v0, v17

    instance-of v2, v0, Landroid/app/Activity;

    if-eqz v2, :cond_15

    move-object/from16 v2, v17

    check-cast v2, Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Landroid/app/Activity;->isDestroyed()Z

    move-result v2

    if-nez v2, :cond_0

    :cond_15
    new-instance v22, Lsv;

    const/4 v2, 0x0

    move-object/from16 v0, v22

    move-object/from16 v1, v17

    invoke-direct {v0, v1, v2}, Lsv;-><init>(Landroid/content/Context;I)V

    new-instance v23, Lsv;

    const/4 v2, 0x1

    move-object/from16 v0, v23

    move-object/from16 v1, v17

    invoke-direct {v0, v1, v2}, Lsv;-><init>(Landroid/content/Context;I)V

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-lt v2, v3, :cond_1a

    invoke-virtual/range {v17 .. v17}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    iget v2, v2, Landroid/content/res/Configuration;->uiMode:I

    xor-int/lit8 v3, v2, -0x31

    and-int/2addr v2, v3

    const/16 v3, 0x20

    if-ne v2, v3, :cond_1a

    const/16 v25, 0x1

    :goto_12
    :try_start_2
    sget-object v2, Lkn;->a:Lkn;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    const-string v3, "uNcmWuzfGcu71zJg\n"

    const-string v4, "07JfBZm2Rr8=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-static {v3, v2}, Lkn;->b(Ljava/lang/String;I)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    move-result v2

    move/from16 v27, v2

    :goto_13
    new-instance v2, Lxv;

    const-string v3, "w3/OI6OgEQ==\n"

    const-string v4, "4Dn5ZZTmJrY=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v4, "OSzb2S+FeA==\n"

    const-string v5, "GmnunBrAOco=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const-string v5, "98FKv7vFPA==\n"

    const-string v6, "1PAJjvj0eTQ=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    const-string v6, "BDDtUudtTQ==\n"

    const-string v7, "JwioaqJUfrw=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    const-string v7, "OSu1P1KfVQ==\n"

    const-string v8, "GhuFCBPZE/Y=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    const-string v8, "dC0sdN2rlQ==\n"

    const-string v9, "Vx0cQevppgI=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    const-string v9, "hqpxTJcc8w==\n"

    const-string v10, "pelHD6Ffy6k=\n"

    invoke-static {v9, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v10, "Gti0TdxAt0AJ\n"

    const-string v11, "Oen1fexwh3A=\n"

    invoke-static {v10, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-direct/range {v2 .. v10}, Lxv;-><init>(IIIIIIII)V

    new-instance v3, Lxv;

    const-string v4, "SujUV67whQ==\n"

    const-string v5, "aa6SEZ62sMY=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const-string v5, "hMYxe60h0g==\n"

    const-string v6, "p4B3Pplk45M=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    const-string v6, "bCs3WYraug==\n"

    const-string v7, "Tx5zbbrpjYI=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    const-string v7, "XhY3aQvu5g==\n"

    const-string v8, "fVcGUTPZoPM=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    const-string v8, "iaeQWqzVKA==\n"

    const-string v9, "quHWYpmUGo0=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    const-string v9, "8XLY4WBkQg==\n"

    const-string v10, "0jSe11kmdlc=\n"

    invoke-static {v9, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v10, "UvOeDXxGQQ==\n"

    const-string v11, "cbauTj4FA00=\n"

    invoke-static {v10, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    const-string v11, "rmzpudq9WkW8\n"

    const-string v12, "jV/a/5z/bAY=\n"

    invoke-static {v11, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    invoke-direct/range {v3 .. v11}, Lxv;-><init>(IIIIIIII)V

    new-instance v4, Lxv;

    const-string v5, "LFDlnvU9Vw==\n"

    const-string v6, "D2Gmr7YMEhM=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    const-string v6, "vWbkUZMGtw==\n"

    const-string v7, "nlSnY9A08vE=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    const-string v7, "EtPj2iLdYw==\n"

    const-string v8, "MZXWnBebVtg=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    const-string v8, "eW54W40BRw==\n"

    const-string v9, "WlY9Y8g4dMc=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    const-string v9, "PGXbjKYozg==\n"

    const-string v10, "H1WatJJuiGg=\n"

    invoke-static {v9, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v10, "8YWF4mnD5Q==\n"

    const-string v11, "0rW111+B1ho=\n"

    invoke-static {v10, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    const-string v11, "Hj3WtpO2eg==\n"

    const-string v12, "PQnugquCO3E=\n"

    invoke-static {v11, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    const-string v12, "J+xg48qPIk9C\n"

    const-string v13, "BN9TpYzJZAk=\n"

    invoke-static {v12, v13}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    invoke-direct/range {v4 .. v12}, Lxv;-><init>(IIIIIIII)V

    new-instance v5, Lxv;

    const-string v6, "VSjL9x92qw==\n"

    const-string v7, "dm6NsVkw7To=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    const-string v7, "+AjNWzmwuw==\n"

    const-string v8, "207/HQv2iec=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    const-string v8, "Rvpi7MHNZQ==\n"

    const-string v9, "ZclR3/L+VrM=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    const-string v9, "l0mFXwiDWg==\n"

    const-string v10, "tH+zaT61bFU=\n"

    invoke-static {v9, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v10, "XSz4ARtICw==\n"

    const-string v11, "fhzIOC1wM7I=\n"

    invoke-static {v10, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    const-string v11, "9hKbsdlWuw==\n"

    const-string v12, "1SKrhuBg+Rk=\n"

    invoke-static {v11, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    const-string v12, "XUdUyUoMqg==\n"

    const-string v13, "fgQXiglP6U4=\n"

    invoke-static {v12, v13}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    const-string v13, "3zxS0KOJnrvM\n"

    const-string v14, "/A0T4JO5ros=\n"

    invoke-static {v13, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v13

    invoke-direct/range {v5 .. v13}, Lxv;-><init>(IIIIIIII)V

    new-instance v6, Lxv;

    const-string v7, "1eQI60oQcQ==\n"

    const-string v8, "9tVL2gkhNAg=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    const-string v8, "EcQpWwRspA==\n"

    const-string v9, "MvZqaUde4eQ=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    const-string v9, "nanr7qm/yg==\n"

    const-string v10, "vu/eqJz5/7Y=\n"

    invoke-static {v9, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v10, "dsdBTMk2Lg==\n"

    const-string v11, "Vf8EdIwPHTc=\n"

    invoke-static {v10, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    const-string v11, "isjK7YD2Ww==\n"

    const-string v12, "qfiL1bSwHRQ=\n"

    invoke-static {v11, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    const-string v12, "B1XYcKodZw==\n"

    const-string v13, "JGXoRZxfVME=\n"

    invoke-static {v12, v13}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    const-string v13, "VItwTjrXCw==\n"

    const-string v14, "d79IegLjSkA=\n"

    invoke-static {v13, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v13

    const-string v14, "mhOwd0mQnZD/\n"

    const-string v15, "uSCDMQ/W29Y=\n"

    invoke-static {v14, v15}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v14

    invoke-direct/range {v6 .. v14}, Lxv;-><init>(IIIIIIII)V

    new-instance v7, Lxv;

    const-string v8, "zrxpeea9QA==\n"

    const-string v9, "7Y1bSNSMcp0=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    const-string v9, "CEVvAcfdzw==\n"

    const-string v10, "K3QqMILsih4=\n"

    invoke-static {v9, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v10, "nrynpPdErw==\n"

    const-string v11, "vfmX4ccBn2A=\n"

    invoke-static {v10, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    const-string v11, "s39n+sE0Wg==\n"

    const-string v12, "kEYiw4QNHw0=\n"

    invoke-static {v11, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    const-string v12, "ZXth80UbBw==\n"

    const-string v13, "RkNRsAdYM2k=\n"

    invoke-static {v12, v13}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    const-string v13, "6VE6tFlsiw==\n"

    const-string v14, "ymEKjW9Uszw=\n"

    invoke-static {v13, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v13

    const-string v14, "75Hbc/bAxQ==\n"

    const-string v15, "zKXpR8T0968=\n"

    invoke-static {v14, v15}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v14

    const-string v15, "+eLoseG6wZ6c\n"

    const-string v16, "2tHb96f8h9g=\n"

    invoke-static/range {v15 .. v16}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v15

    invoke-direct/range {v7 .. v15}, Lxv;-><init>(IIIIIIII)V

    const/4 v8, 0x1

    move/from16 v0, v27

    if-eq v0, v8, :cond_1e

    const/4 v3, 0x2

    move/from16 v0, v27

    if-eq v0, v3, :cond_1d

    const/4 v3, 0x3

    move/from16 v0, v27

    if-eq v0, v3, :cond_1c

    if-eqz v25, :cond_1b

    move-object v7, v6

    :cond_16
    :goto_14
    new-instance v3, Ln00;

    invoke-direct {v3}, Ln00;-><init>()V

    new-instance v11, Lp00;

    invoke-direct {v11}, Lp00;-><init>()V

    const-string v2, ""

    iput-object v2, v11, Lp00;->b:Ljava/lang/Object;

    new-instance v14, Ljava/util/LinkedHashSet;

    invoke-direct {v14}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    new-instance v12, Lp00;

    invoke-direct {v12}, Lp00;-><init>()V

    new-instance v16, Landroid/app/Dialog;

    const v2, 0x1030010

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    invoke-direct {v0, v1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    new-instance v31, Landroid/widget/FrameLayout;

    move-object/from16 v0, v31

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v4, -0x1

    const/4 v5, -0x1

    invoke-direct {v2, v4, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    move-object/from16 v0, v31

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v2, 0x2

    move/from16 v0, v27

    if-eq v0, v2, :cond_17

    if-eqz v25, :cond_1f

    :cond_17
    const-string v4, "L6JQdYLWgTs8\n"

    const-string v2, "DJpgRbLmsQs=\n"

    :goto_15
    invoke-static {v4, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    move-object/from16 v0, v31

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v2, Le7;

    const/16 v4, 0xd

    move-object/from16 v0, v16

    invoke-direct {v2, v0, v4}, Le7;-><init>(Landroid/app/Dialog;I)V

    move-object/from16 v0, v31

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual/range {v17 .. v17}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-double v4, v2

    const-wide v8, 0x3fec28f5c28f5c29L    # 0.88

    mul-double/2addr v4, v8

    double-to-int v0, v4

    move/from16 v32, v0

    new-instance v33, Landroid/widget/LinearLayout;

    move-object/from16 v0, v33

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x1

    move-object/from16 v0, v33

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v4, -0x1

    move/from16 v0, v32

    invoke-direct {v2, v4, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v4, 0x50

    iput v4, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    move-object/from16 v0, v33

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget v13, v7, Lxv;->a:I

    invoke-virtual {v4, v13}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 v2, 0x8

    new-array v5, v2, [F

    const/4 v6, 0x0

    move-object/from16 v0, v23

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    aput v2, v5, v6

    const/4 v6, 0x1

    move-object/from16 v0, v23

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    aput v2, v5, v6

    const/4 v6, 0x2

    move-object/from16 v0, v23

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    aput v2, v5, v6

    const/4 v6, 0x3

    move-object/from16 v0, v23

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    aput v2, v5, v6

    const/4 v2, 0x4

    const/4 v6, 0x0

    aput v6, v5, v2

    const/4 v2, 0x5

    const/4 v6, 0x0

    aput v6, v5, v2

    const/4 v2, 0x6

    const/4 v6, 0x0

    aput v6, v5, v2

    const/4 v2, 0x7

    const/4 v6, 0x0

    aput v6, v5, v2

    invoke-virtual {v4, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    move-object/from16 v0, v33

    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/high16 v2, 0x41c00000    # 24.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    move-object/from16 v0, v23

    invoke-virtual {v0, v2}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    move-object/from16 v0, v33

    invoke-virtual {v0, v2}, Landroid/view/View;->setElevation(F)V

    const/4 v2, 0x1

    move-object/from16 v0, v33

    invoke-virtual {v0, v2}, Landroid/view/View;->setClickable(Z)V

    new-instance v4, Landroid/view/View;

    move-object/from16 v0, v17

    invoke-direct {v4, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget v2, v7, Lxv;->g:I

    invoke-virtual {v5, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual/range {v23 .. v24}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {v5, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v2, 0x28

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v6

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-direct {v5, v6, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v2, 0x1

    iput v2, v5, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    move-object/from16 v0, v22

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iput v2, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    const/16 v2, 0xc

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iput v2, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    move-object/from16 v0, v33

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/TextView;

    move-object/from16 v0, v17

    invoke-direct {v4, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget v15, v7, Lxv;->c:I

    const-string v2, "lPhF9GOr6fD0g0uMC5uhke3V\n"

    const-string v5, "cmbEHeM0DHg=\n"

    const/high16 v6, 0x41900000    # 18.0f

    invoke-static {v2, v5, v4, v6, v15}, Lg40;->n(Ljava/lang/String;Ljava/lang/String;Landroid/widget/TextView;FI)V

    const/4 v2, 0x0

    const/4 v5, 0x1

    invoke-virtual {v4, v2, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    const/16 v2, 0x11

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v6, -0x2

    invoke-direct {v5, v2, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    move-object/from16 v0, v22

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iput v2, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    move-object/from16 v0, v33

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/LinearLayout;

    move-object/from16 v0, v17

    invoke-direct {v4, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v5

    const/4 v6, 0x0

    move-object/from16 v0, v22

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v8

    move-object/from16 v0, v22

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v4, v5, v6, v8, v2}, Landroid/view/View;->setPadding(IIII)V

    const/4 v2, 0x1

    invoke-virtual {v4, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v34, Landroid/widget/EditText;

    move-object/from16 v0, v34

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    const-string v2, "aznJdxtO0258Ev8fnhWmfRCJukSfQMJ4\n"

    const-string v5, "m6Zd+juoQ/I=\n"

    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v34

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    const/high16 v2, 0x41700000    # 15.0f

    move-object/from16 v0, v34

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    move-object/from16 v0, v34

    invoke-virtual {v0, v15}, Landroid/widget/TextView;->setTextColor(I)V

    iget v2, v7, Lxv;->d:I

    move-object/from16 v0, v34

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setHintTextColor(I)V

    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget v0, v7, Lxv;->b:I

    move/from16 v26, v0

    move/from16 v0, v26

    invoke-virtual {v5, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v2, 0x41600000    # 14.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    move-object/from16 v0, v23

    invoke-virtual {v0, v2}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {v5, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    move-object/from16 v0, v34

    invoke-virtual {v0, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v5

    move-object/from16 v0, v22

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v6

    move-object/from16 v0, v22

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v8

    move-object/from16 v0, v22

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    move-object/from16 v0, v34

    invoke-virtual {v0, v5, v6, v8, v2}, Landroid/view/View;->setPadding(IIII)V

    const/4 v2, 0x1

    move-object/from16 v0, v34

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    move-object/from16 v0, v34

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v33

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v21, Landroid/widget/LinearLayout;

    move-object/from16 v0, v21

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x0

    move-object/from16 v0, v21

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v5, -0x2

    invoke-direct {v4, v2, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    move-object/from16 v0, v22

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v5

    const/4 v6, 0x0

    move-object/from16 v0, v22

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v8

    move-object/from16 v0, v22

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v4, v5, v6, v8, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    move-object/from16 v0, v21

    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    move/from16 v0, v26

    invoke-virtual {v4, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    move-object/from16 v0, v23

    invoke-virtual {v0, v2}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {v4, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    move-object/from16 v0, v21

    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v4

    move-object/from16 v0, v22

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v5

    move-object/from16 v0, v22

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v6

    move-object/from16 v0, v22

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    move-object/from16 v0, v21

    invoke-virtual {v0, v4, v5, v6, v2}, Landroid/view/View;->setPadding(IIII)V

    new-instance v2, Landroid/widget/TextView;

    move-object/from16 v0, v17

    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    new-instance v4, Landroid/widget/TextView;

    move-object/from16 v0, v17

    invoke-direct {v4, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    new-instance v6, Landroid/widget/TextView;

    move-object/from16 v0, v17

    invoke-direct {v6, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x3

    new-array v5, v5, [Landroid/widget/TextView;

    const/4 v8, 0x0

    aput-object v2, v5, v8

    const/4 v2, 0x1

    aput-object v4, v5, v2

    const/4 v2, 0x2

    aput-object v6, v5, v2

    const/4 v2, 0x3

    new-array v0, v2, [Ljava/lang/String;

    move-object/from16 v28, v0

    const/4 v2, 0x0

    const-string v4, "tKMeSBGX\n"

    const-string v6, "USa2oZI/1fU=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v28, v2

    const/4 v2, 0x1

    const-string v4, "gl2aG4xO\n"

    const-string v6, "Z/gn/gPFi88=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v28, v2

    const/4 v2, 0x2

    const-string v4, "CQF6cc2F\n"

    const-string v6, "7r/emUwPLrU=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v28, v2

    const/4 v4, 0x0

    :goto_16
    const/4 v2, 0x3

    if-ge v4, v2, :cond_20

    aget-object v6, v5, v4

    aget-object v2, v28, v4

    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v2, 0x41600000    # 14.0f

    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v6, v15}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v2, 0x11

    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v8, 0x0

    const/4 v9, -0x2

    const/high16 v35, 0x3f800000    # 1.0f

    move/from16 v0, v35

    invoke-direct {v2, v8, v9, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v6, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v8, 0x0

    move-object/from16 v0, v22

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v9

    const/16 v35, 0x0

    move-object/from16 v0, v22

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    move/from16 v0, v35

    invoke-virtual {v6, v8, v9, v0, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v2, Ltv;

    move-object/from16 v8, v23

    move-object/from16 v9, v22

    invoke-direct/range {v2 .. v12}, Ltv;-><init>(Ln00;I[Landroid/widget/TextView;Landroid/widget/TextView;Lxv;Lsv;Lsv;Ljava/util/ArrayList;Lp00;Lp00;)V

    invoke-virtual {v6, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    aget-object v2, v5, v4

    move-object/from16 v0, v21

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    rsub-int/lit8 v2, v4, 0x0

    rsub-int/lit8 v4, v2, 0x1

    goto :goto_16

    :cond_18
    const/4 v2, 0x0

    goto/16 :goto_f

    :cond_19
    const/4 v2, 0x0

    goto/16 :goto_10

    :catchall_1
    move-exception v2

    const-string v19, ""

    goto/16 :goto_11

    :cond_1a
    const/16 v25, 0x0

    goto/16 :goto_12

    :catchall_2
    move-exception v2

    :goto_17
    const/4 v2, 0x0

    move/from16 v27, v2

    goto/16 :goto_13

    :cond_1b
    move-object v7, v2

    goto/16 :goto_14

    :cond_1c
    if-nez v25, :cond_16

    move-object v7, v5

    goto/16 :goto_14

    :cond_1d
    move-object v7, v4

    goto/16 :goto_14

    :cond_1e
    move-object v7, v3

    goto/16 :goto_14

    :cond_1f
    const-string v4, "GDKm0PqVn7cL\n"

    const-string v2, "Owbi4Mqlr4c=\n"

    goto/16 :goto_15

    :cond_20
    const/4 v2, 0x0

    aget-object v2, v5, v2

    invoke-virtual {v2}, Landroid/view/View;->performClick()Z

    move-object/from16 v0, v33

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/view/View;

    move-object/from16 v0, v17

    invoke-direct {v4, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, -0x1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-direct {v5, v6, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    move/from16 v0, v26

    invoke-virtual {v4, v0}, Landroid/view/View;->setBackgroundColor(I)V

    move-object/from16 v0, v33

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v5, Landroid/widget/LinearLayout;

    move-object/from16 v0, v17

    invoke-direct {v5, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x1

    invoke-virtual {v5, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x1

    const/4 v6, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-direct {v2, v4, v6, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v5, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v6, Landroid/widget/ListView;

    move-object/from16 v0, v17

    invoke-direct {v6, v0}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x1

    const/4 v8, 0x0

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-direct {v2, v4, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v6, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    const/4 v4, 0x0

    invoke-direct {v2, v4}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v6, v2}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    const/4 v2, 0x0

    invoke-virtual {v6, v2}, Landroid/widget/ListView;->setDividerHeight(I)V

    const/4 v2, 0x0

    invoke-virtual {v6, v2}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    new-instance v8, Landroid/widget/LinearLayout;

    move-object/from16 v0, v17

    invoke-direct {v8, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x0

    invoke-virtual {v8, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x1

    const/4 v9, -0x2

    invoke-direct {v2, v4, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v8, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v4

    move-object/from16 v0, v22

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v9

    move-object/from16 v0, v22

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v15

    move-object/from16 v0, v22

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v8, v4, v9, v15, v2}, Landroid/view/View;->setPadding(IIII)V

    const/4 v2, 0x0

    invoke-static {v13}, Landroid/graphics/Color;->red(I)I

    move-result v4

    invoke-static {v13}, Landroid/graphics/Color;->green(I)I

    move-result v9

    invoke-static {v13}, Landroid/graphics/Color;->blue(I)I

    move-result v15

    invoke-static {v2, v4, v9, v15}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    const/16 v4, 0xff

    invoke-static {v13}, Landroid/graphics/Color;->red(I)I

    move-result v9

    invoke-static {v13}, Landroid/graphics/Color;->green(I)I

    move-result v15

    invoke-static {v13}, Landroid/graphics/Color;->blue(I)I

    move-result v13

    invoke-static {v4, v9, v15, v13}, Landroid/graphics/Color;->argb(IIII)I

    move-result v4

    new-instance v9, Landroid/graphics/drawable/GradientDrawable;

    sget-object v13, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    const/4 v15, 0x2

    new-array v15, v15, [I

    const/16 v20, 0x0

    aput v2, v15, v20

    const/4 v2, 0x1

    aput v4, v15, v2

    invoke-direct {v9, v13, v15}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    invoke-virtual {v8, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v15, Landroid/widget/TextView;

    move-object/from16 v0, v17

    invoke-direct {v15, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v2, "X8nq8Qxo\n"

    const-string v4, "ukZ7GIzpbeg=\n"

    invoke-static {v2, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v2, 0x41800000    # 16.0f

    invoke-virtual {v15, v2}, Landroid/widget/TextView;->setTextSize(F)V

    const/16 v2, 0x11

    invoke-virtual {v15, v2}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v9, -0x1

    const/16 v2, 0x32

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-direct {v4, v9, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v15, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget-object v2, Landroid/graphics/drawable/GradientDrawable$Orientation;->LEFT_RIGHT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    iget v4, v7, Lxv;->f:I

    iget v9, v7, Lxv;->e:I

    new-instance v13, Landroid/graphics/drawable/GradientDrawable;

    const/16 v20, 0x2

    move/from16 v0, v20

    new-array v0, v0, [I

    move-object/from16 v20, v0

    const/16 v21, 0x0

    aput v9, v20, v21

    const/16 v21, 0x1

    aput v4, v20, v21

    move-object/from16 v0, v20

    invoke-direct {v13, v2, v0}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    const/high16 v2, 0x41c80000    # 25.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    move-object/from16 v0, v23

    invoke-virtual {v0, v2}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {v13, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v15, v13}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v2, -0x1

    invoke-virtual {v15, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v2, 0x0

    const/4 v4, 0x1

    invoke-virtual {v15, v2, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    const/high16 v4, 0x3f000000    # 0.5f

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-virtual {v15, v2}, Landroid/view/View;->setAlpha(F)V

    const/4 v2, 0x0

    invoke-virtual {v15, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    const/high16 v2, 0x41700000    # 15.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    move-object/from16 v0, v23

    invoke-virtual {v0, v2}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {v15, v2}, Landroid/view/View;->setTranslationY(F)V

    sget v28, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    move/from16 v0, v28

    if-lt v0, v2, :cond_21

    invoke-virtual/range {v23 .. v24}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {v15, v2}, Landroid/view/View;->setElevation(F)V

    invoke-static {v15, v9}, Lc0;->s(Landroid/widget/TextView;I)V

    invoke-static {v15, v9}, Lc0;->B(Landroid/widget/TextView;I)V

    :cond_21
    new-instance v13, Lg8;

    const/16 v20, 0x2

    invoke-direct/range {v13 .. v20}, Lg8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v15, v13}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v8, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v5, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v33

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v18, Lvv;

    new-instance v26, Lqv;

    const/4 v2, 0x2

    move-object/from16 v0, v26

    move-object/from16 v1, v23

    invoke-direct {v0, v15, v14, v1, v2}, Lqv;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v19, v17

    move-object/from16 v20, v10

    move-object/from16 v21, v14

    move-object/from16 v24, v7

    invoke-direct/range {v18 .. v26}, Lvv;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Ljava/util/LinkedHashSet;Lsv;Lsv;Lxv;ZLqv;)V

    move-object/from16 v0, v18

    iput-object v0, v12, Lp00;->b:Ljava/lang/Object;

    move-object/from16 v0, v18

    invoke-virtual {v6, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    new-instance v2, Lyv;

    invoke-direct {v2, v3, v11, v12, v10}, Lyv;-><init>(Ln00;Lp00;Lp00;Ljava/util/ArrayList;)V

    move-object/from16 v0, v34

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    move-object/from16 v0, v31

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v16

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    invoke-virtual/range {v16 .. v16}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v5

    if-eqz v5, :cond_22

    const/4 v2, -0x1

    const/4 v6, -0x1

    invoke-virtual {v5, v2, v6}, Landroid/view/Window;->setLayout(II)V

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    const/4 v6, 0x0

    invoke-direct {v2, v6}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v5, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    const/high16 v2, -0x80000000

    invoke-virtual {v5, v2}, Landroid/view/Window;->addFlags(I)V

    const/16 v2, 0x200

    invoke-virtual {v5, v2}, Landroid/view/Window;->addFlags(I)V

    const/high16 v2, 0x4000000

    invoke-virtual {v5, v2}, Landroid/view/Window;->clearFlags(I)V

    const/4 v2, 0x0

    invoke-virtual {v5, v2}, Landroid/view/Window;->setStatusBarColor(I)V

    const/4 v2, 0x0

    invoke-virtual {v5, v2}, Landroid/view/Window;->setNavigationBarColor(I)V

    const/16 v2, 0x1f

    move/from16 v0, v28

    if-lt v0, v2, :cond_23

    const/4 v2, 0x4

    :try_start_4
    invoke-virtual {v5, v2}, Landroid/view/Window;->addFlags(I)V

    invoke-virtual {v5}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    invoke-static {v2}, Lz7;->u(Landroid/view/WindowManager$LayoutParams;)V

    const v2, 0x3e4ccccd    # 0.2f

    invoke-virtual {v5, v2}, Landroid/view/Window;->setDimAmount(F)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :cond_22
    :goto_18
    new-instance v2, Lok;

    const/4 v4, 0x2

    move-object/from16 v0, v33

    move/from16 v1, v32

    invoke-direct {v2, v0, v1, v4}, Lok;-><init>(Landroid/widget/LinearLayout;II)V

    move-object/from16 v0, v16

    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    :try_start_5
    invoke-virtual/range {v16 .. v16}, Landroid/app/Dialog;->show()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    sget-object v2, Lyg;->a:Lyf;

    sget-object v2, Lps;->a:Lno;

    invoke-static {v2}, Lgf;->c(Lhe;)Lsd;

    move-result-object v2

    const/4 v13, 0x0

    new-instance v4, Lzv;

    const/4 v9, 0x0

    move-object v5, v10

    move-object v6, v3

    move-object v7, v11

    move-object v8, v12

    invoke-direct/range {v4 .. v9}, Lzv;-><init>(Ljava/util/ArrayList;Ln00;Lp00;Lp00;Lvd;)V

    const/4 v3, 0x3

    invoke-static {v2, v13, v4, v3}, Lg80;->u(Lpe;Lhe;Lym;I)Lw40;

    goto/16 :goto_1

    :catchall_3
    move-exception v2

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-virtual {v5, v2}, Landroid/view/Window;->setDimAmount(F)V

    goto :goto_18

    :cond_23
    const/4 v2, 0x2

    move/from16 v0, v27

    if-eq v0, v2, :cond_26

    if-eqz v25, :cond_24

    move v2, v4

    :goto_19
    invoke-virtual {v5, v2}, Landroid/view/Window;->setDimAmount(F)V

    goto :goto_18

    :cond_24
    const v2, 0x3ecccccd    # 0.4f

    goto :goto_19

    :catchall_4
    move-exception v2

    const-string v2, "06ke\n"

    const-string v3, "p8h5VTpLcuY=\n"

    const-string v4, "3c1MIwqPnhPi4XgYAJa+H/HSRBc=\n"

    const-string v5, "kL4rcG/h+nY=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "tw==\n"

    const-string v6, "0vI8ySRxU5w=\n"

    invoke-static {v2, v3, v4, v5, v6}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_25
    sget-object v2, Lkn;->a:Lkn;

    const-string v3, "uVOcUcIZrHr8NLQHpTjrMO9ZzhD8Z/Bw\n"

    const-string v4, "Ud0rtE2PRNU=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v0, v17

    invoke-static {v0, v3}, Lkn;->k(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_1

    :pswitch_4
    check-cast v2, Landroid/view/ViewGroup;

    check-cast v3, Landroid/widget/FrameLayout;

    check-cast v4, Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v5

    const-wide/16 v6, 0xc8

    invoke-virtual {v5, v6, v7}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v5

    new-instance v6, Lt5;

    const/4 v7, 0x1

    invoke-direct {v6, v2, v7, v3}, Lt5;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v5, v6}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    new-instance v2, Lo40;

    sget-object v3, Lo40;->n:Lsh;

    const/high16 v5, 0x447a0000    # 1000.0f

    invoke-direct {v2, v4, v3, v5}, Lo40;-><init>(Landroid/view/View;Lgf;F)V

    iget-object v3, v2, Lo40;->k:Lp40;

    const/high16 v4, 0x43480000    # 200.0f

    invoke-virtual {v3, v4}, Lp40;->b(F)V

    invoke-virtual {v2}, Lo40;->h()V

    invoke-static {}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->۟ۢ۟ۥۣ()I

    move-result v2

    if-ltz v2, :cond_0

    const-string v2, "vt4a81tOPqzmJ2Iws5NJfb8XOy"

    invoke-static {v2}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۧ۟ۢ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(F)V

    goto/16 :goto_1

    :catchall_5
    move-exception v2

    goto/16 :goto_17

    :cond_26
    move v2, v4

    goto/16 :goto_19

    :cond_27
    move-object v4, v3

    goto/16 :goto_c

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
