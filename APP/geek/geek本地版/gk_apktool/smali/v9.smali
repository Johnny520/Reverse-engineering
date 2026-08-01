.class public final synthetic Lv9;
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

    iput p4, p0, Lv9;->a:I

    iput-object p1, p0, Lv9;->c:Ljava/lang/Object;

    iput-object p2, p0, Lv9;->d:Ljava/lang/Object;

    iput-object p3, p0, Lv9;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e6\u06e6\u06e0"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۦ۟ۥۣ()I

    move-result v1

    if-gtz v1, :cond_3

    invoke-static {}, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۢ۠ۨ۟()I

    const-string v1, "\u06e7\u06e2\u06e1"

    :goto_1
    invoke-static {v1}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    sget v1, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v2, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    or-int/2addr v1, v2

    const v2, -0x1ac52c

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۦ۟ۥۣ()I

    move-result v1

    if-gtz v1, :cond_1

    const-string v1, "\u06e8\u06df\u06e2"

    :goto_2
    invoke-static {v1}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_3
    const-string v0, "wKUSEvooPrfjRtm"

    invoke-static {v0}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟۠۠ۦۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    move-result v1

    if-ltz v1, :cond_0

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    const-string v1, "\u06e3\u06e6\u06e5"

    goto :goto_2

    :cond_0
    const-string v1, "\u06e4\u06e1\u06e0"

    goto :goto_2

    :cond_1
    :sswitch_4
    sget v1, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    if-gtz v1, :cond_2

    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    const-string v1, "\u06e6\u06e1\u06e7"

    :goto_3
    invoke-static {v1}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e7\u06df\u06e3"

    goto :goto_3

    :cond_3
    const-string v1, "\u06e6\u06e6\u06e0"

    goto :goto_1

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa760 -> :sswitch_0
        0x1ab6e2 -> :sswitch_4
        0x1aba03 -> :sswitch_1
        0x1ac220 -> :sswitch_2
        0x1ac50b -> :sswitch_5
        0x1ac8cb -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 36

    move-object/from16 v0, p0

    iget v5, v0, Lv9;->a:I

    move-object/from16 v0, p0

    iget-object v4, v0, Lv9;->b:Ljava/lang/Object;

    move-object/from16 v0, p0

    iget-object v3, v0, Lv9;->d:Ljava/lang/Object;

    move-object/from16 v0, p0

    iget-object v2, v0, Lv9;->c:Ljava/lang/Object;

    packed-switch v5, :pswitch_data_0

    check-cast v2, Landroid/app/Activity;

    check-cast v3, Landroid/widget/FrameLayout;

    check-cast v4, Landroid/widget/LinearLayout;

    const/4 v5, 0x0

    sput-object v5, Lq50;->d:Ljava/lang/Integer;

    const/4 v5, 0x0

    sput-object v5, Lq50;->e:Ljava/lang/Integer;

    :try_start_0
    sget-object v5, Lgn;->a:Lgn;

    const-string v6, "Qbi1+lhhOkd1sqI=\n"

    const-string v7, "Kt3MpTwIWSI=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x0

    invoke-static {v6, v5}, Lgn;->f(Ljava/lang/String;Z)V

    const-string v5, "9sOWw/1scTzyyA==\n"

    const-string v6, "nabvnI8cAmM=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v6}, Lgn;->f(Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    sget-object v5, Lgn;->a:Lgn;

    const-string v6, "GMpuhj9Y50p79A4CVwbPIxzKUQ==\n"

    const-string v7, "+lbrptrvVaw=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v6}, Lgn;->k(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    :goto_1
    return-void

    :catchall_0
    move-exception v5

    const-string v5, "Nwje\n"

    const-string v6, "Q2m5jaPP2Zc=\n"

    const-string v7, "fWsCFYtUR9Bbbzg/qQ==\n"

    const-string v8, "PgNndP8EJr4=\n"

    invoke-static {v7, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "Fg==\n"

    const-string v9, "c8HJlSTQVfc=\n"

    invoke-static {v5, v6, v7, v8, v9}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_0
    move-object v15, v2

    check-cast v15, Landroid/app/Activity;

    move-object v11, v3

    check-cast v11, Landroid/widget/TextView;

    check-cast v4, Li00;

    const-string v2, "oWaxgVj9XKW5Za2sc/xNpKVll7FC\n"

    const-string v3, "ygPI3iyPPcs=\n"

    sget-object v5, Lgn;->a:Lgn;

    invoke-static {v2, v3, v5}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

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

    sub-long v8, v6, v8

    sub-long v2, v8, v2

    const-wide/16 v8, 0xc

    add-long/2addr v2, v8

    const-wide/16 v8, 0x12c

    cmp-long v2, v2, v8

    if-gez v2, :cond_a

    const/4 v2, 0x1

    move-object/from16 v0, p1

    invoke-static {v0, v2}, Lgn;->i(Landroid/view/View;I)V

    iget-object v12, v4, Li00;->b:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    new-instance v13, Landroid/app/Dialog;

    const v2, 0x1030010

    invoke-direct {v13, v15, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v14, v2, Landroid/util/DisplayMetrics;->density:F

    const-string v2, "7adQUoXbVWg=\n"

    const-string v3, "sY8MNq6HfEw=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "pattern"

    invoke-static {v3, v2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    const-string v3, "compile(...)"

    invoke-static {v3, v2}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "input"

    invoke-static {v3, v12}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v2, v12}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "replaceAll(...)"

    invoke-static {v3, v2}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v2}, Lb50;->T(Ljava/lang/String;)Ljava/lang/CharSequence;

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

    invoke-static {v2, v3}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lg00;

    invoke-direct {v4}, Lg00;-><init>()V

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "top_title_color_"

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    invoke-static {v3, v5}, Lgn;->b(Ljava/lang/String;I)I

    move-result v3

    iput v3, v4, Lg00;->a:I

    new-instance v21, Landroid/widget/FrameLayout;

    move-object/from16 v0, v21

    invoke-direct {v0, v15}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const-string v3, "UfuMWZjFZAJC\n"

    const-string v5, "cs26aaj1VDI=\n"

    invoke-static {v3, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    move-object/from16 v0, v21

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v3, Lu6;

    const/16 v5, 0xf

    invoke-direct {v3, v13, v5}, Lu6;-><init>(Landroid/app/Dialog;I)V

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

    new-instance v5, Lu9;

    invoke-direct {v5}, Lu9;-><init>()V

    move-object/from16 v0, v22

    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, v15}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v6, "eJZttyPHregW3nnGSOjhrT+tP+cp\n"

    const-string v7, "kTfbXqBvS0g=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v6, 0x41900000    # 18.0f

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextSize(F)V

    const-string v6, "+rHeJrQiEA==\n"

    const-string v7, "2YLtFYcRI0U=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    iget v2, v4, Lg00;->a:I

    if-eqz v2, :cond_5

    :goto_5
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v2, 0x1

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-string v5, "RjXg61KNIQ==\n"

    const-string v7, "ZXPVrWfLFGs=\n"

    invoke-static {v5, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    const-string v7, "ocJvyx6P2g==\n"

    const-string v9, "goYrj1rLnpU=\n"

    invoke-static {v7, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    const-string v5, "UINx2DuC5Kk+6lqmWYme4TCx2BZVnKTtAYMchgrCuZFRrVwX\n"

    const-string v6, "uQP4PrArAgk=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v5, 0x41500000    # 13.0f

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextSize(F)V

    const-string v5, "ftKdFeQVuA==\n"

    const-string v6, "XeSrI9IjjnQ=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    const-string v3, "IiAhkNEn3g==\n"

    const-string v5, "AWUUp+IQ7Xw=\n"

    invoke-static {v3, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    aput v3, v19, v2

    const/4 v2, 0x2

    const-string v3, "+QttAKhjeA==\n"

    const-string v5, "2j1ZQp0lTkQ=\n"

    invoke-static {v3, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    aput v3, v19, v2

    const/4 v2, 0x3

    const-string v3, "/CkREwRZtw==\n"

    const-string v5, "3xEgUDNhgyw=\n"

    invoke-static {v3, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    aput v3, v19, v2

    const/4 v2, 0x4

    const-string v3, "fpfvjmsbsw==\n"

    const-string v5, "XdGpzFgrgz8=\n"

    invoke-static {v3, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    aput v3, v19, v2

    const/4 v2, 0x5

    const-string v3, "Fd7ddb/OQw==\n"

    const-string v5, "NpycQ4eNe3M=\n"

    invoke-static {v3, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    const-string v2, "3KUFfF7bHA==\n"

    const-string v23, "/+A1OW6eLC4=\n"

    move-object/from16 v0, v23

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    const-string v23, "eoAcXVWXmQ==\n"

    const-string v24, "WbklZGyuoJY=\n"

    invoke-static/range {v23 .. v24}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    const-string v20, "a2dC5YYZqw==\n"

    const-string v23, "SFRx1rUqmFQ=\n"

    move-object/from16 v0, v20

    move-object/from16 v1, v23

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v20

    move/from16 v0, v20

    invoke-virtual {v7, v2, v0}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    iget v2, v4, Lg00;->a:I

    if-ne v5, v2, :cond_7

    move-object v2, v7

    :goto_8
    invoke-virtual {v3, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v2, Li80;

    invoke-direct/range {v2 .. v8}, Li80;-><init>(Landroid/widget/FrameLayout;Lg00;ILjava/util/ArrayList;Landroid/graphics/drawable/GradientDrawable;Landroid/widget/EditText;)V

    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v18

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    add-int/lit8 v2, v9, -0x14

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v2, v2, 0x14

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

    const-string v5, "cMRltebD23YOrWn0\n"

    const-string v6, "lkXHUEJOMs0=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v5, 0x41700000    # 15.0f

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextSize(F)V

    const-string v5, "GXnZisV1Cg==\n"

    const-string v6, "Ok/vvPNDPIQ=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    const-string v6, "WqWnTgYifA==\n"

    const-string v7, "eeOXCDZkTCU=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    new-instance v9, Lx9;

    const/4 v14, 0x3

    invoke-direct/range {v9 .. v14}, Lx9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroid/app/Dialog;I)V

    invoke-virtual {v3, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v6, Landroid/widget/TextView;

    invoke-direct {v6, v15}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v7, "XsSPNdXH7gYlnYdY\n"

    const-string v9, "unsS0HhfCZI=\n"

    const/high16 v14, 0x41700000    # 15.0f

    const/4 v15, -0x1

    invoke-static {v7, v9, v6, v14, v15}, Lz30;->n(Ljava/lang/String;Ljava/lang/String;Landroid/widget/TextView;FI)V

    const/16 v7, 0x11

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setGravity(I)V

    const/4 v7, 0x0

    const/4 v9, 0x1

    invoke-virtual {v6, v7, v9}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v7}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-string v9, "H5DgxMaoqg==\n"

    const-string v14, "PKbWhvXu7EM=\n"

    invoke-static {v9, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    new-instance v14, Lw7;

    move-object v15, v8

    move-object/from16 v16, v12

    move-object/from16 v17, v4

    move-object/from16 v18, v10

    move-object/from16 v19, v11

    move-object/from16 v20, v13

    invoke-direct/range {v14 .. v20}, Lw7;-><init>(Landroid/widget/EditText;Ljava/lang/String;Lg00;Ljava/lang/String;Landroid/widget/TextView;Landroid/app/Dialog;)V

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
    check-cast v2, Lnv;

    check-cast v3, Lov;

    check-cast v4, Lmv;

    iget-object v5, v2, Lnv;->c:Ljava/util/LinkedHashSet;

    iget-object v3, v3, Lov;->a:Ljava/lang/String;

    invoke-interface {v5, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-interface {v5, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :goto_a
    iget-object v5, v4, Lmv;->a:Landroid/view/View;

    const v3, 0x7e060001

    invoke-virtual {v5, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lh40;

    if-eqz v4, :cond_11

    check-cast v3, Lh40;

    :goto_b
    if-nez v3, :cond_27

    new-instance v3, Lh40;

    sget-object v4, Lh40;->n:Lqh;

    invoke-direct {v3, v5, v4}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    const v4, 0x7e060001

    invoke-virtual {v5, v4, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    move-object v4, v3

    :goto_c
    const v3, 0x7e060002    # 4.452915E37f

    invoke-virtual {v5, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v6, v3, Lh40;

    if-eqz v6, :cond_12

    check-cast v3, Lh40;

    :goto_d
    if-nez v3, :cond_f

    new-instance v3, Lh40;

    sget-object v6, Lh40;->o:Lqh;

    invoke-direct {v3, v5, v6}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    const v6, 0x7e060002    # 4.452915E37f

    invoke-virtual {v5, v6, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_f
    const v6, 0x3f266666    # 0.65f

    invoke-virtual {v5, v6}, Landroid/view/View;->setScaleX(F)V

    const v6, 0x3f266666    # 0.65f

    invoke-virtual {v5, v6}, Landroid/view/View;->setScaleY(F)V

    new-instance v5, Li40;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-direct {v5, v6}, Li40;-><init>(F)V

    const v6, 0x44bb8000    # 1500.0f

    invoke-virtual {v5, v6}, Li40;->b(F)V

    const v6, 0x3ee66666    # 0.45f

    invoke-virtual {v5, v6}, Li40;->a(F)V

    iput-object v5, v4, Lh40;->j:Li40;

    const/high16 v5, 0x3f800000    # 1.0f

    const v6, 0x44bb8000    # 1500.0f

    const v7, 0x3ee66666    # 0.45f

    invoke-static {v5, v6, v7}, Lz30;->f(FFF)Li40;

    move-result-object v5

    iput-object v5, v3, Lh40;->j:Li40;

    invoke-virtual {v4}, Lh40;->h()V

    invoke-virtual {v3}, Lh40;->h()V

    invoke-virtual {v2}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    iget-object v2, v2, Lnv;->g:Liv;

    invoke-virtual {v2}, Liv;->a()Ljava/lang/Object;

    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    move-result v2

    if-gtz v2, :cond_0

    const-string v2, "yzDbojiYXlOaFvqoYQKB2DoKzEFa"

    invoke-static {v2}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۤۧۢۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(F)V

    goto/16 :goto_1

    :cond_10
    invoke-interface {v5, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_a

    :cond_11
    const/4 v3, 0x0

    goto/16 :goto_b

    :cond_12
    const/4 v3, 0x0

    goto :goto_d

    :pswitch_2
    check-cast v2, Lg00;

    check-cast v3, Lg00;

    check-cast v4, Landroid/content/Context;

    sget-object v5, Lgn;->a:Lgn;

    invoke-static/range {p1 .. p1}, Lip;->l(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x1

    move-object/from16 v0, p1

    invoke-static {v0, v5}, Lgn;->i(Landroid/view/View;I)V

    iget v2, v2, Lg00;->a:I

    if-eqz v2, :cond_13

    const/4 v2, 0x2

    iput v2, v3, Lg00;->a:I

    const-string v3, "TTWtSf/HTvsAYZMWoNYBihkFzBfatxHvQQCmRMzh\n"

    const-string v2, "qIUrrEVTqW8=\n"

    :goto_e
    invoke-static {v3, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Lgn;->k(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_13
    const-string v3, "AnxZg1MC/oVCN1bsMByi8GpaCt57Y7mFAlpc\n"

    const-string v2, "6tPuZtaKGxk=\n"

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

    sget-object v4, Lgn;->a:Lgn;

    invoke-static/range {p1 .. p1}, Lip;->l(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x1

    move-object/from16 v0, p1

    invoke-static {v0, v4}, Lgn;->i(Landroid/view/View;I)V

    :try_start_1
    sget-object v4, Lin;->g:Ljava/lang/reflect/Field;

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

    sget-object v2, Luv;->a:Landroid/os/Handler;

    sget-object v18, Ld9;->a:Ljava/lang/ClassLoader;

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
    new-instance v22, Lkv;

    const/4 v2, 0x0

    move-object/from16 v0, v22

    move-object/from16 v1, v17

    invoke-direct {v0, v1, v2}, Lkv;-><init>(Landroid/content/Context;I)V

    new-instance v23, Lkv;

    const/4 v2, 0x1

    move-object/from16 v0, v23

    move-object/from16 v1, v17

    invoke-direct {v0, v1, v2}, Lkv;-><init>(Landroid/content/Context;I)V

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
    sget-object v2, Lgn;->a:Lgn;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    const-string v3, "WHhar2yDRSNbeE6V\n"

    const-string v4, "Mx0j8BnqGlc=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-static {v3, v2}, Lgn;->b(Ljava/lang/String;I)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    move-result v2

    move/from16 v27, v2

    :goto_13
    new-instance v2, Lpv;

    const-string v3, "wPmbtb5ehw==\n"

    const-string v4, "47+s84kYsMs=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v4, "MjQ1GkMFOw==\n"

    const-string v5, "EXEAX3ZAejs=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const-string v5, "WXCjqxadYg==\n"

    const-string v6, "ekHgmlWsJ+k=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    const-string v6, "A89eDRYo6g==\n"

    const-string v7, "IPcbNVMR2Zs=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    const-string v7, "sK6ndgM98w==\n"

    const-string v8, "k56XQUJ7tc8=\n"

    invoke-static {v7, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    const-string v8, "nT3iCm5Hdw==\n"

    const-string v9, "vg3SP1gFRGk=\n"

    invoke-static {v8, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    const-string v9, "C1g02grZ7w==\n"

    const-string v10, "KBsCmTya10A=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v10, "qIw4bfcAN5C7\n"

    const-string v11, "i715XccwB6A=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-direct/range {v2 .. v10}, Lpv;-><init>(IIIIIIII)V

    new-instance v3, Lpv;

    const-string v4, "teCGCRnqnQ==\n"

    const-string v5, "lqbATymsqMA=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const-string v5, "kUoOr/aDZA==\n"

    const-string v6, "sgxI6sLGVUw=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    const-string v6, "Cwh+ibadgA==\n"

    const-string v7, "KD06vYaut5A=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    const-string v7, "kLlsXPx0SQ==\n"

    const-string v8, "s/hdZMRDDyM=\n"

    invoke-static {v7, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    const-string v8, "3Vsa6x6Akw==\n"

    const-string v9, "/h1c0yvBoYQ=\n"

    invoke-static {v8, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    const-string v9, "3BmoBpD31g==\n"

    const-string v10, "/1/uMKm14to=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v10, "+REzZZM31g==\n"

    const-string v11, "2lQDJtF0lGw=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    const-string v11, "JTKkPUMaozs3\n"

    const-string v12, "BgGXewVYlXg=\n"

    invoke-static {v11, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    invoke-direct/range {v3 .. v11}, Lpv;-><init>(IIIIIIII)V

    new-instance v4, Lpv;

    const-string v5, "26ZXCPF9TA==\n"

    const-string v6, "+JcUObJMCRM=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    const-string v6, "shINESkweg==\n"

    const-string v7, "kSBOI2oCP4A=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    const-string v7, "M/IVsFttIg==\n"

    const-string v8, "ELQg9m4rFyk=\n"

    invoke-static {v7, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    const-string v8, "k1+1HZ7dHQ==\n"

    const-string v9, "sGfwJdvkLnM=\n"

    invoke-static {v8, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    const-string v9, "oqeHdwtp4Q==\n"

    const-string v10, "gZfGTz8vpzQ=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v10, "nf+uQm/RKw==\n"

    const-string v11, "vs+ed1mTGN8=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    const-string v11, "U2xvAqvL4A==\n"

    const-string v12, "cFhXNpP/oXc=\n"

    invoke-static {v11, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    const-string v12, "7l7AHCDJsoaL\n"

    const-string v13, "zW3zWmaP9MA=\n"

    invoke-static {v12, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    invoke-direct/range {v4 .. v12}, Lpv;-><init>(IIIIIIII)V

    new-instance v5, Lpv;

    const-string v6, "WoyXu7CDRg==\n"

    const-string v7, "ecrR/fbFACw=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    const-string v7, "Mi1XgIRWVw==\n"

    const-string v8, "EWtlxrYQZZA=\n"

    invoke-static {v7, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    const-string v8, "KfFRqaJZ0A==\n"

    const-string v9, "CsJimpFq4+U=\n"

    invoke-static {v8, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    const-string v9, "sFsA8ChDXg==\n"

    const-string v10, "k202xh51aNw=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v10, "2j4fu7p+Bw==\n"

    const-string v11, "+Q4vgoxGP/A=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    const-string v11, "jPWvxzAGug==\n"

    const-string v12, "r8Wf8Akw+N4=\n"

    invoke-static {v11, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    const-string v12, "kcfsR7/xPg==\n"

    const-string v13, "soSvBPyyfbo=\n"

    invoke-static {v12, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    const-string v13, "xP0Xopdk2UHX\n"

    const-string v14, "58xWkqdU6XE=\n"

    invoke-static {v13, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v13

    invoke-direct/range {v5 .. v13}, Lpv;-><init>(IIIIIIII)V

    new-instance v6, Lpv;

    const-string v7, "XA/NzpaJHg==\n"

    const-string v8, "fz6O/9W4W2c=\n"

    invoke-static {v7, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    const-string v8, "GnBX6gknBA==\n"

    const-string v9, "OUIU2EoVQW0=\n"

    invoke-static {v8, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    const-string v9, "95Qet1OmQw==\n"

    const-string v10, "1NIr8Wbgdv8=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v10, "hseAyS8u3g==\n"

    const-string v11, "pf/F8WoX7f4=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    const-string v11, "V8Uvyx5nSQ==\n"

    const-string v12, "dPVu8yohD4Y=\n"

    invoke-static {v11, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    const-string v12, "DHCNij8AEw==\n"

    const-string v13, "L0C9vwlCIL8=\n"

    invoke-static {v12, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    const-string v13, "xjQMsTDGZw==\n"

    const-string v14, "5QA0hQjyJgQ=\n"

    invoke-static {v13, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v13

    const-string v14, "YBWE6Kfk198F\n"

    const-string v15, "Qya3ruGikZk=\n"

    invoke-static {v14, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v14

    invoke-direct/range {v6 .. v14}, Lpv;-><init>(IIIIIIII)V

    new-instance v7, Lpv;

    const-string v8, "69ckXBPaYw==\n"

    const-string v9, "yOYWbSHrUTQ=\n"

    invoke-static {v8, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    const-string v9, "Uj0DiqIeQg==\n"

    const-string v10, "cQxGu+cvB3g=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v10, "Vu+q50z+xg==\n"

    const-string v11, "daqaony79kk=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    const-string v11, "zlajTWo2qA==\n"

    const-string v12, "7W/mdC8P7Xk=\n"

    invoke-static {v11, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    const-string v12, "1LrpOP7aKQ==\n"

    const-string v13, "94LZe7yZHXo=\n"

    invoke-static {v12, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    const-string v13, "d95biYwLwQ==\n"

    const-string v14, "VO5rsLoz+R0=\n"

    invoke-static {v13, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v13

    const-string v14, "iza0paA7GA==\n"

    const-string v15, "qAKGkZIPKgo=\n"

    invoke-static {v14, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v14

    const-string v15, "fmal7eP3C18b\n"

    const-string v16, "XVWWq6WxTRk=\n"

    invoke-static/range {v15 .. v16}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v15

    invoke-direct/range {v7 .. v15}, Lpv;-><init>(IIIIIIII)V

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
    new-instance v3, Lg00;

    invoke-direct {v3}, Lg00;-><init>()V

    new-instance v11, Li00;

    invoke-direct {v11}, Li00;-><init>()V

    const-string v2, ""

    iput-object v2, v11, Li00;->b:Ljava/lang/Object;

    new-instance v14, Ljava/util/LinkedHashSet;

    invoke-direct {v14}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    new-instance v12, Li00;

    invoke-direct {v12}, Li00;-><init>()V

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
    const-string v2, "+u6G3vxqxInp\n"

    const-string v4, "2da27sxa9Lk=\n"

    :goto_15
    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    move-object/from16 v0, v31

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v2, Lu6;

    const/16 v4, 0xd

    move-object/from16 v0, v16

    invoke-direct {v2, v0, v4}, Lu6;-><init>(Landroid/app/Dialog;I)V

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

    iget v13, v7, Lpv;->a:I

    invoke-virtual {v4, v13}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 v2, 0x8

    new-array v5, v2, [F

    const/4 v6, 0x0

    move-object/from16 v0, v23

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    aput v2, v5, v6

    const/4 v6, 0x1

    move-object/from16 v0, v23

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    aput v2, v5, v6

    const/4 v6, 0x2

    move-object/from16 v0, v23

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    aput v2, v5, v6

    const/4 v6, 0x3

    move-object/from16 v0, v23

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {v0, v2}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

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

    iget v2, v7, Lpv;->g:I

    invoke-virtual {v5, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual/range {v23 .. v24}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {v0, v2}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v6

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-direct {v5, v6, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v2, 0x1

    iput v2, v5, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    move-object/from16 v0, v22

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iput v2, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    const/16 v2, 0xc

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

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

    iget v15, v7, Lpv;->c:I

    const-string v2, "Qquk17SiHUUi0Kqv3JJVJDuG\n"

    const-string v5, "pDUlPjQ9+M0=\n"

    const/high16 v6, 0x41900000    # 18.0f

    invoke-static {v2, v5, v4, v6, v15}, Lz30;->n(Ljava/lang/String;Ljava/lang/String;Landroid/widget/TextView;FI)V

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

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v5

    const/4 v6, 0x0

    move-object/from16 v0, v22

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v8

    move-object/from16 v0, v22

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

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

    const-string v2, "bpv7Mm+zGyt5sM1a6uhuOBUriAHrvQo9\n"

    const-string v5, "ngRvv09Vi7c=\n"

    invoke-static {v2, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v34

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    const/high16 v2, 0x41700000    # 15.0f

    move-object/from16 v0, v34

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    move-object/from16 v0, v34

    invoke-virtual {v0, v15}, Landroid/widget/TextView;->setTextColor(I)V

    iget v2, v7, Lpv;->d:I

    move-object/from16 v0, v34

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setHintTextColor(I)V

    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget v0, v7, Lpv;->b:I

    move/from16 v26, v0

    move/from16 v0, v26

    invoke-virtual {v5, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v2, 0x41600000    # 14.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    move-object/from16 v0, v23

    invoke-virtual {v0, v2}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {v5, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    move-object/from16 v0, v34

    invoke-virtual {v0, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v5

    move-object/from16 v0, v22

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v6

    move-object/from16 v0, v22

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v8

    move-object/from16 v0, v22

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v5

    const/4 v6, 0x0

    move-object/from16 v0, v22

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v8

    move-object/from16 v0, v22

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {v0, v2}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {v4, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    move-object/from16 v0, v21

    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v4

    move-object/from16 v0, v22

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v5

    move-object/from16 v0, v22

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v6

    move-object/from16 v0, v22

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

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

    const-string v4, "z1cLCbGh\n"

    const-string v6, "KtKj4DIJcKI=\n"

    invoke-static {v4, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v28, v2

    const/4 v2, 0x1

    const-string v4, "IEzej8TJ\n"

    const-string v6, "xeljaktC5mQ=\n"

    invoke-static {v4, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v28, v2

    const/4 v2, 0x2

    const-string v4, "xLf8JF6z\n"

    const-string v6, "IwlYzN8506Q=\n"

    invoke-static {v4, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v9

    const/16 v35, 0x0

    move-object/from16 v0, v22

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    move/from16 v0, v35

    invoke-virtual {v6, v8, v9, v0, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v2, Llv;

    move-object/from16 v8, v23

    move-object/from16 v9, v22

    invoke-direct/range {v2 .. v12}, Llv;-><init>(Lg00;I[Landroid/widget/TextView;Landroid/widget/TextView;Lpv;Lkv;Lkv;Ljava/util/ArrayList;Li00;Li00;)V

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
    const-string v2, "eiDSgPfhm6lp\n"

    const-string v4, "WRSWsMfRq5k=\n"

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

    invoke-virtual {v0, v2}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v4

    move-object/from16 v0, v22

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v9

    move-object/from16 v0, v22

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v15

    move-object/from16 v0, v22

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

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

    const-string v2, "vCH/pN1p\n"

    const-string v4, "Wa5uTV3op9Y=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    invoke-virtual {v0, v2}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-direct {v4, v9, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v15, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget-object v2, Landroid/graphics/drawable/GradientDrawable$Orientation;->LEFT_RIGHT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    iget v4, v7, Lpv;->f:I

    iget v9, v7, Lpv;->e:I

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

    invoke-virtual {v0, v2}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {v0, v2}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {v15, v2}, Landroid/view/View;->setTranslationY(F)V

    sget v28, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    move/from16 v0, v28

    if-lt v0, v2, :cond_21

    invoke-virtual/range {v23 .. v24}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {v15, v2}, Landroid/view/View;->setElevation(F)V

    invoke-static {v15, v9}, Lc0;->s(Landroid/widget/TextView;I)V

    invoke-static {v15, v9}, Lc0;->B(Landroid/widget/TextView;I)V

    :cond_21
    new-instance v13, Lw7;

    const/16 v20, 0x2

    invoke-direct/range {v13 .. v20}, Lw7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v15, v13}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v8, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v5, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v33

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v18, Lnv;

    new-instance v26, Liv;

    const/4 v2, 0x2

    move-object/from16 v0, v26

    move-object/from16 v1, v23

    invoke-direct {v0, v15, v14, v1, v2}, Liv;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v19, v17

    move-object/from16 v20, v10

    move-object/from16 v21, v14

    move-object/from16 v24, v7

    invoke-direct/range {v18 .. v26}, Lnv;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Ljava/util/LinkedHashSet;Lkv;Lkv;Lpv;ZLiv;)V

    move-object/from16 v0, v18

    iput-object v0, v12, Li00;->b:Ljava/lang/Object;

    move-object/from16 v0, v18

    invoke-virtual {v6, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    new-instance v2, Lqv;

    invoke-direct {v2, v3, v11, v12, v10}, Lqv;-><init>(Lg00;Li00;Li00;Ljava/util/ArrayList;)V

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

    invoke-static {v2}, Lp7;->u(Landroid/view/WindowManager$LayoutParams;)V

    const v2, 0x3e4ccccd    # 0.2f

    invoke-virtual {v5, v2}, Landroid/view/Window;->setDimAmount(F)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :cond_22
    :goto_18
    new-instance v2, Lmk;

    const/4 v4, 0x2

    move-object/from16 v0, v33

    move/from16 v1, v32

    invoke-direct {v2, v0, v1, v4}, Lmk;-><init>(Landroid/widget/LinearLayout;II)V

    move-object/from16 v0, v16

    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    :try_start_5
    invoke-virtual/range {v16 .. v16}, Landroid/app/Dialog;->show()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    sget-object v2, Lwg;->a:Lxf;

    sget-object v2, Lls;->a:Ljo;

    invoke-static {v2}, Lip;->c(Lge;)Lid;

    move-result-object v2

    const/4 v13, 0x0

    new-instance v4, Lsv;

    const/4 v9, 0x0

    move-object v5, v10

    move-object v6, v3

    move-object v7, v11

    move-object v8, v12

    invoke-direct/range {v4 .. v9}, Lsv;-><init>(Ljava/util/ArrayList;Lg00;Li00;Li00;Lld;)V

    const/4 v3, 0x3

    invoke-static {v2, v13, v4, v3}, La80;->r(Loe;Lge;Lwm;I)Lp40;

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

    const-string v2, "Nwje\n"

    const-string v3, "Q2m5jaPP2Zc=\n"

    const-string v4, "QJRCsmncprJ/uHaJY8WGvmyLSoY=\n"

    const-string v5, "Decl4Qyywtc=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "Fg==\n"

    const-string v6, "c8HJlSTQVfc=\n"

    invoke-static {v2, v3, v4, v5, v6}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_25
    sget-object v2, Lgn;->a:Lgn;

    const-string v3, "tgea7uFa9bHzYLK4hnuy++ANyK/fJKm7\n"

    const-string v4, "XoktC27MHR4=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v0, v17

    invoke-static {v0, v3}, Lgn;->k(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_1

    :catchall_5
    move-exception v2

    goto/16 :goto_17

    :cond_26
    move v2, v4

    goto :goto_19

    :cond_27
    move-object v4, v3

    goto/16 :goto_c

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
