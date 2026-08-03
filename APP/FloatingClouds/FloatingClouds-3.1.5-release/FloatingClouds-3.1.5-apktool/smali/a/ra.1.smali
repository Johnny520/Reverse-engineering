.class public final La/ra;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/ra$a;,
        La/ra$b;
    }
.end annotation


# instance fields
.field public final a:Landroid/app/Activity;

.field public final b:La/ra$a;

.field public final c:Z

.field public d:Landroid/app/AlertDialog;

.field public e:Landroid/widget/LinearLayout;

.field public f:Landroid/widget/ScrollView;

.field public g:I

.field public h:Landroid/widget/Switch;

.field public i:Z

.field public j:La/j2;

.field public final k:La/Me;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 13

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ra;->a:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget p1, p1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p1, p1, 0x30

    const/16 v0, 0x20

    const-string v1, "#FA5151"

    if-ne p1, v0, :cond_0

    new-instance v2, La/ra$a;

    const-string p1, "#111111"

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string p1, "#1E1E1E"

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const-string p1, "#2C2C2C"

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    const-string p1, "#F2F2F2"

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    const-string p1, "#B3B3B3"

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    const-string p1, "#666666"

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    const-string p1, "#8FB2DC"

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    const/4 v11, 0x1

    invoke-direct/range {v2 .. v11}, La/ra$a;-><init>(IIIIIIIIZ)V

    goto :goto_0

    :cond_0
    new-instance v3, La/ra$a;

    const-string p1, "#EDEDED"

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const-string p1, "#FFFFFF"

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    const-string p1, "#DDDDDD"

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    const-string p1, "#191919"

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    const-string p1, "#888888"

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    const-string p1, "#B0B0B0"

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string p1, "#576B95"

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    const/4 v12, 0x0

    invoke-direct/range {v3 .. v12}, La/ra$a;-><init>(IIIIIIIIZ)V

    move-object v2, v3

    :goto_0
    iput-object v2, p0, La/ra;->b:La/ra$a;

    iget-boolean p1, v2, La/ra$a;->i:Z

    iput-boolean p1, p0, La/ra;->c:Z

    const/4 p1, -0x1

    iput p1, p0, La/ra;->g:I

    new-instance p1, La/da;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, La/da;-><init>(La/ra;I)V

    new-instance v0, La/Me;

    invoke-direct {v0, p1}, La/Me;-><init>(La/s7;)V

    iput-object v0, p0, La/ra;->k:La/Me;

    return-void
.end method

.method public static c(J)Ljava/lang/String;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-gtz v0, :cond_0

    const-string p0, "\u672a\u77e5"

    return-object p0

    :cond_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd HH:mm:ss"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, p0, p1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "format(...)"

    invoke-static {p0, p1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static i(La/jc;)V
    .locals 1

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, La/K3$a;->t(La/jc;)V

    const/4 p0, 0x0

    sput-object p0, La/K3;->j:La/jc;

    sput-object p0, La/K3;->k:Ljava/util/ArrayList;

    sput-object p0, La/K3;->l:Ljava/lang/Boolean;

    return-void
.end method

.method public static k(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "null"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xc

    if-le v0, v1, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string v0, "substring(...)"

    invoke-static {p0, v0}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "..."

    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_2
    return-object p0

    :cond_3
    :goto_0
    const-string p0, "\u5c1a\u672a\u52a0\u8f7d"

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;La/s7;)Landroid/widget/LinearLayout;
    .locals 8

    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v3, 0x10

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/16 v3, 0xe

    invoke-virtual {p0, v3}, La/ra;->b(I)I

    move-result v4

    invoke-virtual {p0, v3}, La/ra;->b(I)I

    move-result v5

    invoke-virtual {p0, v3}, La/ra;->b(I)I

    move-result v6

    invoke-virtual {p0, v3}, La/ra;->b(I)I

    move-result v3

    invoke-virtual {v0, v4, v5, v6, v3}, Landroid/view/View;->setPadding(IIII)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget-object v4, p0, La/ra;->b:La/ra$a;

    iget v5, v4, La/ra$a;->b:I

    invoke-virtual {v3, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 v5, 0xc

    invoke-virtual {p0, v5}, La/ra;->b(I)I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v3, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v5, -0x1

    const/4 v6, -0x2

    invoke-direct {v3, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v5, 0x3

    invoke-virtual {p0, v5}, La/ra;->b(I)I

    move-result v7

    invoke-virtual {p0, v5}, La/ra;->b(I)I

    move-result v5

    invoke-virtual {v3, v2, v7, v2, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p1, 0x2

    const/high16 v5, 0x41700000    # 15.0f

    invoke-virtual {v3, p1, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    iget v5, v4, La/ra$a;->d:I

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-direct {v5, v2, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v3, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v1, ">"

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v1, 0x41800000    # 16.0f

    invoke-virtual {v2, p1, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    iget p1, v4, La/ra$a;->f:I

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance p1, La/h3;

    const/4 v1, 0x3

    invoke-direct {p1, v1, p2}, La/h3;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object v0
.end method

.method public final b(I)I
    .locals 2

    int-to-float p1, p1

    iget-object v0, p0, La/ra;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    float-to-int p1, p1

    return p1
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;ILa/D7;)Landroid/widget/LinearLayout;
    .locals 16

    move-object/from16 v4, p0

    new-instance v6, Landroid/widget/LinearLayout;

    iget-object v0, v4, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v6, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-virtual {v6, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v2, 0xe

    invoke-virtual {v4, v2}, La/ra;->b(I)I

    move-result v3

    const/16 v5, 0xa

    invoke-virtual {v4, v5}, La/ra;->b(I)I

    move-result v7

    invoke-virtual {v4, v2}, La/ra;->b(I)I

    move-result v2

    invoke-virtual {v4, v5}, La/ra;->b(I)I

    move-result v8

    invoke-virtual {v6, v3, v7, v2, v8}, Landroid/view/View;->setPadding(IIII)V

    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget-object v3, v4, La/ra;->b:La/ra$a;

    iget v7, v3, La/ra$a;->b:I

    invoke-virtual {v2, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 v7, 0xc

    invoke-virtual {v4, v7}, La/ra;->b(I)I

    move-result v8

    int-to-float v8, v8

    invoke-virtual {v2, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v6, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v8, -0x1

    const/4 v9, -0x2

    invoke-direct {v2, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v8, 0x3

    invoke-virtual {v4, v8}, La/ra;->b(I)I

    move-result v10

    invoke-virtual {v4, v8}, La/ra;->b(I)I

    move-result v8

    const/4 v11, 0x0

    invoke-virtual {v2, v11, v10, v11, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v6, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v8, 0x10

    invoke-virtual {v2, v8}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v8, Landroid/widget/TextView;

    invoke-direct {v8, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object/from16 v10, p1

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v10, 0x2

    const/high16 v12, 0x41600000    # 14.0f

    invoke-virtual {v8, v10, v12}, Landroid/widget/TextView;->setTextSize(IF)V

    iget v13, v3, La/ra$a;->d:I

    invoke-virtual {v8, v13}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-direct {v14, v11, v9, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v8, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v2, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v8, Landroid/widget/TextView;

    invoke-direct {v8, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v9, "\u4fdd\u5b58"

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v9, 0x41300000    # 11.0f

    invoke-virtual {v8, v10, v9}, Landroid/widget/TextView;->setTextSize(IF)V

    iget v9, v3, La/ra$a;->b:I

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v9, 0x11

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setGravity(I)V

    invoke-virtual {v4, v5}, La/ra;->b(I)I

    move-result v9

    const/4 v11, 0x4

    invoke-virtual {v4, v11}, La/ra;->b(I)I

    move-result v14

    invoke-virtual {v4, v5}, La/ra;->b(I)I

    move-result v5

    invoke-virtual {v4, v11}, La/ra;->b(I)I

    move-result v11

    invoke-virtual {v8, v9, v14, v5, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget v9, v3, La/ra$a;->g:I

    invoke-virtual {v5, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/4 v9, 0x6

    invoke-virtual {v4, v9}, La/ra;->b(I)I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v5, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v8, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v2, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v6, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/EditText;

    invoke-direct {v2, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    move-object/from16 v0, p2

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v2, v10, v12}, Landroid/widget/TextView;->setTextSize(IF)V

    invoke-virtual {v2, v13}, Landroid/widget/TextView;->setTextColor(I)V

    iget v0, v3, La/ra$a;->f:I

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setHintTextColor(I)V

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget v3, v3, La/ra$a;->a:I

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 v3, 0x8

    invoke-virtual {v4, v3}, La/ra;->b(I)I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v0, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v4, v7}, La/ra;->b(I)I

    move-result v0

    invoke-virtual {v4, v3}, La/ra;->b(I)I

    move-result v5

    invoke-virtual {v4, v7}, La/ra;->b(I)I

    move-result v7

    invoke-virtual {v4, v3}, La/ra;->b(I)I

    move-result v3

    invoke-virtual {v2, v0, v5, v7, v3}, Landroid/view/View;->setPadding(IIII)V

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    move/from16 v0, p3

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setInputType(I)V

    invoke-virtual {v2, v1}, Landroid/view/View;->setFocusable(Z)V

    invoke-virtual {v2, v1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    new-instance v0, La/na;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    invoke-virtual {v6, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v0, La/oa;

    const/4 v5, 0x0

    move-object/from16 v1, p4

    move-object v3, v8

    invoke-direct/range {v0 .. v5}, La/oa;-><init>(Ljava/lang/Object;Landroid/view/View;Landroid/widget/TextView;Ljava/lang/Object;I)V

    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object v6
.end method

.method public final e()V
    .locals 7

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->c()Ljava/util/LinkedHashSet;

    move-result-object v0

    invoke-static {v0}, La/t3;->y0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/CharSequence;

    new-instance v2, La/Sc;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v3, Landroid/app/AlertDialog$Builder;

    iget-object v4, p0, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v3, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "\u5df2\u9690\u85cf\u7684\u670b\u53cb\u5708\uff08\u5171 "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " \u6761\uff09"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v3

    array-length v4, v1

    if-nez v4, :cond_1

    const-string v0, "\u6682\u65e0\u5df2\u9690\u85cf\u7684\u670b\u53cb\u5708"

    invoke-virtual {v3, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    goto :goto_1

    :cond_1
    new-instance v4, La/qa;

    const/4 v5, 0x0

    invoke-direct {v4, v5, p0, v2, v0}, La/qa;-><init>(ILa/ra;La/Sc;Ljava/util/ArrayList;)V

    invoke-virtual {v3, v1, v4}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    new-instance v1, La/qa;

    const/4 v4, 0x1

    invoke-direct {v1, v4, p0, v2, v0}, La/qa;-><init>(ILa/ra;La/Sc;Ljava/util/ArrayList;)V

    const-string v0, "\u6e05\u7a7a"

    invoke-virtual {v3, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    :goto_1
    new-instance v0, La/pa;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, La/pa;-><init>(La/ra;I)V

    const-string v1, "\u6dfb\u52a0"

    invoke-virtual {v3, v1, v0}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "\u5173\u95ed"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    invoke-virtual {p0, v0}, La/ra;->o(Landroid/app/AlertDialog;)V

    move-object v3, v0

    :cond_2
    iput-object v3, v2, La/Sc;->a:Ljava/lang/Object;

    return-void
.end method

.method public final f()V
    .locals 21

    move-object/from16 v1, p0

    const/4 v2, 0x2

    const/4 v3, 0x1

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->f()Ljava/util/ArrayList;

    move-result-object v0

    new-instance v4, Landroid/widget/ScrollView;

    iget-object v5, v1, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v4, v5}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget-object v7, v1, La/ra;->b:La/ra$a;

    iget v8, v7, La/ra$a;->a:I

    invoke-virtual {v6, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 v8, 0x10

    invoke-virtual {v1, v8}, La/ra;->b(I)I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v6, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v4, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/16 v6, 0xc

    invoke-virtual {v1, v6}, La/ra;->b(I)I

    move-result v9

    const/4 v10, 0x0

    invoke-virtual {v4, v10, v10, v10, v9}, Landroid/view/View;->setPadding(IIII)V

    new-instance v9, Landroid/widget/LinearLayout;

    invoke-direct {v9, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v9, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v1, v8}, La/ra;->b(I)I

    move-result v11

    const/16 v12, 0x14

    invoke-virtual {v1, v12}, La/ra;->b(I)I

    move-result v12

    invoke-virtual {v1, v8}, La/ra;->b(I)I

    move-result v8

    const/16 v13, 0x24

    invoke-virtual {v1, v13}, La/ra;->b(I)I

    move-result v13

    invoke-virtual {v9, v11, v12, v8, v13}, Landroid/view/View;->setPadding(IIII)V

    new-instance v8, Landroid/widget/TextView;

    invoke-direct {v8, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v11

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "\u914d\u7f6e\u540d\u5355\uff08"

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, " \u4e2a\uff09"

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v12, 0x41500000    # 13.0f

    invoke-virtual {v8, v2, v12}, Landroid/widget/TextView;->setTextSize(IF)V

    sget-object v12, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v8, v12}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget v12, v7, La/ra$a;->e:I

    invoke-virtual {v8, v12}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v13, 0x4

    invoke-virtual {v1, v13}, La/ra;->b(I)I

    move-result v14

    const/16 v15, 0x8

    invoke-virtual {v1, v15}, La/ra;->b(I)I

    move-result v3

    invoke-virtual {v1, v13}, La/ra;->b(I)I

    move-result v10

    invoke-virtual {v1, v15}, La/ra;->b(I)I

    move-result v13

    invoke-virtual {v8, v14, v3, v10, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v9, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    const/high16 v8, 0x41600000    # 14.0f

    const/16 v10, 0x11

    if-eqz v3, :cond_0

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v13, "\u6682\u65e0\u4f2a\u88c5"

    invoke-virtual {v3, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v3, v2, v8}, Landroid/widget/TextView;->setTextSize(IF)V

    invoke-virtual {v3, v12}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setGravity(I)V

    invoke-virtual {v1, v6}, La/ra;->b(I)I

    move-result v13

    invoke-virtual {v1, v15}, La/ra;->b(I)I

    move-result v14

    const/4 v8, 0x0

    invoke-virtual {v3, v8, v13, v8, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v9, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-virtual {v4, v9}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    new-instance v3, La/Sc;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v8, La/n5;

    const/4 v13, 0x1

    invoke-direct {v8, v3, v13, v1}, La/n5;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_19

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    iget v14, v7, La/ra$a;->h:I

    const/16 v10, 0xe

    if-eqz v0, :cond_18

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Ltop/mmjz/floatingclouds/bean/MaskItemBean;

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v6, 0x1

    invoke-virtual {v2, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v1, v10}, La/ra;->b(I)I

    move-result v0

    move-object/from16 v16, v13

    const/16 v6, 0xc

    invoke-virtual {v1, v6}, La/ra;->b(I)I

    move-result v13

    invoke-virtual {v1, v10}, La/ra;->b(I)I

    move-result v10

    move-object/from16 v17, v3

    invoke-virtual {v1, v6}, La/ra;->b(I)I

    move-result v3

    invoke-virtual {v2, v0, v13, v10, v3}, Landroid/view/View;->setPadding(IIII)V

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget v3, v7, La/ra$a;->b:I

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v1, v6}, La/ra;->b(I)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v3, -0x1

    const/4 v6, -0x2

    invoke-direct {v0, v3, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v3, 0x2

    invoke-virtual {v1, v3}, La/ra;->b(I)I

    move-result v6

    invoke-virtual {v1, v3}, La/ra;->b(I)I

    move-result v10

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v6, v3, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v15}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    move-result-object v6

    sget-object v0, La/xh;->a:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v6, :cond_4

    invoke-static {v6}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_1
    goto :goto_2

    :cond_1
    const-string v0, "gh_"

    invoke-static {v6, v0, v3}, La/Ae;->H(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "@"

    invoke-static {v6, v0, v3}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    sget-object v0, La/xh;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_3

    move-object/from16 v18, v4

    move-object/from16 v20, v9

    move-object/from16 v19, v11

    goto/16 :goto_11

    :cond_3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v3

    const-string v10, "FCloud_DB"

    if-nez v3, :cond_5

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v13, "cache miss for "

    invoke-direct {v3, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " (cache="

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " entries, no fallback)"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    :goto_2
    move-object/from16 v18, v4

    move-object/from16 v20, v9

    move-object/from16 v19, v11

    const/4 v3, 0x0

    goto/16 :goto_11

    :cond_5
    sget-object v0, La/xh;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    const-string v3, "<get-entries>(...)"

    invoke-static {v0, v3}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Ljava/util/Map$Entry;

    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v18, v0

    const-string v0, "<get-key>(...)"

    invoke-static {v13, v0}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v13, Ljava/lang/CharSequence;

    const-string v0, "EnMicroMsg"

    move-object/from16 v19, v3

    const/4 v3, 0x0

    invoke-static {v13, v0, v3}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_6

    move-object/from16 v3, v19

    goto :goto_4

    :cond_6
    move-object/from16 v0, v18

    goto :goto_3

    :cond_7
    const/4 v3, 0x0

    :goto_4
    check-cast v3, Ljava/util/Map$Entry;

    if-nez v3, :cond_8

    sget-object v0, La/xh;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0

    new-instance v13, Ljava/lang/StringBuilder;

    move-object/from16 v18, v3

    const-string v3, "no EnMicroMsg in Store (Store size="

    invoke-direct {v13, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_5

    :cond_8
    move-object/from16 v18, v3

    :goto_5
    if-eqz v18, :cond_9

    invoke-interface/range {v18 .. v18}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/G4;

    if-eqz v0, :cond_9

    iget-object v0, v0, La/G4;->a:Ljava/lang/Object;

    goto :goto_6

    :cond_9
    const/4 v0, 0x0

    :goto_6
    const-string v3, "no row for "

    const-string v13, "row found but blank for "

    move-object/from16 v18, v4

    const-string v4, "cursor null for "

    if-nez v0, :cond_a

    const-string v0, "db null for "

    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-object/from16 v20, v9

    move-object/from16 v19, v11

    :goto_7
    const/4 v3, 0x0

    goto/16 :goto_f

    :cond_a
    move-object/from16 v19, v11

    :try_start_0
    const-string v11, "select nickname, alias, conRemark from rcontact where username=?"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    move-object/from16 v20, v9

    :try_start_1
    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v9

    invoke-static {v0, v11, v9}, La/xh$a;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;

    move-result-object v9

    if-nez v9, :cond_b

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_7

    :catchall_0
    move-exception v0

    goto/16 :goto_e

    :cond_b
    :try_start_2
    invoke-interface {v9}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_11

    const/4 v4, 0x2

    invoke-interface {v9, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-static {v0}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_c

    goto :goto_8

    :cond_c
    const/4 v0, 0x0

    :goto_8
    if-nez v0, :cond_10

    :cond_d
    const/4 v3, 0x0

    goto :goto_9

    :catchall_1
    move-exception v0

    move-object v3, v0

    goto :goto_d

    :goto_9
    invoke-interface {v9, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-static {v0}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_e

    goto :goto_a

    :cond_e
    const/4 v0, 0x0

    :goto_a
    if-nez v0, :cond_10

    const/4 v3, 0x1

    invoke-interface {v9, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-static {v0}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_f

    goto :goto_b

    :cond_f
    const/4 v0, 0x0

    :cond_10
    :goto_b
    if-nez v0, :cond_12

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v10, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_c

    :cond_11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/4 v0, 0x0

    :cond_12
    :goto_c
    :try_start_3
    invoke-interface {v9}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object v3, v0

    goto :goto_f

    :goto_d
    :try_start_4
    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    :try_start_5
    invoke-static {v9, v3}, La/w1;->e(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_3
    move-exception v0

    move-object/from16 v20, v9

    :goto_e
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "query failed for "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ": "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_7

    :goto_f
    if-nez v3, :cond_13

    const-string v0, "null"

    goto :goto_10

    :cond_13
    move-object v0, v3

    :goto_10
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v9, "single query for "

    invoke-direct {v4, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " -> "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_11
    if-eqz v3, :cond_14

    invoke-virtual {v15}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->getTagName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_16

    invoke-virtual {v15}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->getTagName()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\uff08"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\uff09"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_12

    :cond_14
    invoke-virtual {v15}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->getTagName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_15

    invoke-virtual {v15}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    move-result-object v0

    :cond_15
    move-object v3, v0

    :cond_16
    :goto_12
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v3, 0x41700000    # 15.0f

    const/4 v4, 0x2

    invoke-virtual {v0, v4, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    iget v3, v7, La/ra$a;->d:I

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v15}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v6, 0xa

    if-gt v4, v6, :cond_17

    const/16 v4, 0x8

    const/4 v11, 0x4

    goto :goto_13

    :cond_17
    const/16 v4, 0x8

    invoke-static {v3, v4}, La/Ce;->X(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x4

    invoke-static {v3, v11}, La/Ce;->Y(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "\u2026"

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_13
    invoke-virtual {v15}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->getMapId()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v13, "\u4f2a\u88c5ID: "

    invoke-direct {v10, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\n\u6620\u5c04ID: "

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v3, 0x41300000    # 11.0f

    const/4 v9, 0x2

    invoke-virtual {v0, v9, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v1, v9}, La/ra;->b(I)I

    move-result v3

    const/4 v10, 0x6

    invoke-virtual {v1, v10}, La/ra;->b(I)I

    move-result v13

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v3, v4, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v3, "\u79fb\u9664\u4f2a\u88c5"

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v3, 0x41400000    # 12.0f

    invoke-virtual {v0, v9, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    invoke-virtual {v0, v14}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v3, 0x11

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setGravity(I)V

    invoke-virtual {v1, v6}, La/ra;->b(I)I

    move-result v3

    const/4 v4, 0x5

    invoke-virtual {v1, v4}, La/ra;->b(I)I

    move-result v9

    invoke-virtual {v1, v6}, La/ra;->b(I)I

    move-result v6

    invoke-virtual {v1, v4}, La/ra;->b(I)I

    move-result v4

    invoke-virtual {v0, v3, v9, v6, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v6, 0x1

    invoke-virtual {v3, v6, v14}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual {v1, v10}, La/ra;->b(I)I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v3, La/Y9;

    invoke-direct {v3, v15, v6, v8}, La/Y9;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v3, v20

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object v9, v3

    move-object/from16 v13, v16

    move-object/from16 v3, v17

    move-object/from16 v4, v18

    move-object/from16 v11, v19

    const/4 v2, 0x2

    const/16 v6, 0xc

    const/16 v10, 0x11

    const/16 v15, 0x8

    goto/16 :goto_0

    :cond_18
    move-object/from16 v17, v3

    move-object/from16 v18, v4

    move-object v3, v9

    move-object/from16 v19, v11

    invoke-virtual {v1, v6}, La/ra;->b(I)I

    move-result v0

    invoke-virtual {v1, v0}, La/ra;->n(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    sget-object v2, La/K3;->a:La/K3$a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->f()Ljava/util/ArrayList;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "\u4e00\u952e\u6e05\u7a7a\u5168\u90e8\u4f2a\u88c5\uff08"

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v2, v19

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v2, 0x41600000    # 14.0f

    const/4 v4, 0x2

    invoke-virtual {v0, v4, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    invoke-virtual {v0, v14}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v2, 0x11

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setGravity(I)V

    invoke-virtual {v1, v10}, La/ra;->b(I)I

    move-result v2

    invoke-virtual {v1, v10}, La/ra;->b(I)I

    move-result v4

    const/4 v6, 0x0

    invoke-virtual {v0, v6, v2, v6, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v13, 0x1

    invoke-virtual {v2, v13, v14}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    const/16 v4, 0xc

    invoke-virtual {v1, v4}, La/ra;->b(I)I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v2, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v2, La/Y9;

    const/4 v4, 0x2

    invoke-direct {v2, v1, v4, v8}, La/Y9;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_14

    :cond_19
    move-object/from16 v17, v3

    move-object/from16 v18, v4

    :goto_14
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, v5}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    move-object/from16 v2, v18

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    if-eqz v0, :cond_1c

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v2

    if-eqz v2, :cond_1a

    const v3, 0x106000d

    invoke-virtual {v2, v3}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    const/4 v3, 0x3

    invoke-virtual {v2, v3}, Landroid/view/Window;->setSoftInputMode(I)V

    :cond_1a
    const/4 v6, 0x1

    invoke-virtual {v0, v6}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v2

    if-eqz v2, :cond_1b

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v4

    iget v5, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-double v5, v5

    const-wide v7, 0x3fee147ae147ae14L    # 0.94

    mul-double/2addr v5, v7

    double-to-int v5, v5

    iput v5, v4, Landroid/view/WindowManager$LayoutParams;->width:I

    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-double v5, v3

    const-wide v7, 0x3fea3d70a3d70a3dL    # 0.82

    mul-double/2addr v5, v7

    double-to-int v3, v5

    iput v3, v4, Landroid/view/WindowManager$LayoutParams;->height:I

    const/16 v3, 0x11

    iput v3, v4, Landroid/view/WindowManager$LayoutParams;->gravity:I

    iget v3, v4, Landroid/view/WindowManager$LayoutParams;->flags:I

    or-int/lit8 v3, v3, 0x20

    iput v3, v4, Landroid/view/WindowManager$LayoutParams;->flags:I

    invoke-virtual {v2, v4}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    :cond_1b
    move-object v14, v0

    :goto_15
    move-object/from16 v2, v17

    goto :goto_16

    :cond_1c
    const/4 v14, 0x0

    goto :goto_15

    :goto_16
    iput-object v14, v2, La/Sc;->a:Ljava/lang/Object;

    return-void
.end method

.method public final g()V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, La/ra;->e:Landroid/widget/LinearLayout;

    if-nez v1, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    const/4 v2, -0x1

    iput v2, v0, La/ra;->g:I

    const/4 v3, 0x0

    iput-object v3, v0, La/ra;->h:Landroid/widget/Switch;

    sget-object v3, La/K3;->a:La/K3$a;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    new-instance v3, Landroid/widget/TextView;

    iget-object v4, v0, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v3, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v5, "@mmjz"

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v5, 0x2

    const/high16 v6, 0x41900000    # 18.0f

    invoke-virtual {v3, v5, v6}, Landroid/widget/TextView;->setTextSize(IF)V

    sget-object v6, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object v6, v0, La/ra;->b:La/ra$a;

    iget v7, v6, La/ra$a;->g:I

    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v7, 0x11

    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setGravity(I)V

    const/4 v8, 0x4

    invoke-virtual {v0, v8}, La/ra;->b(I)I

    move-result v9

    invoke-virtual {v0, v8}, La/ra;->b(I)I

    move-result v10

    const/4 v11, 0x0

    invoke-virtual {v3, v11, v9, v11, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v9, "https://t.me/tkwx123"

    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v9, 0x41400000    # 12.0f

    invoke-virtual {v3, v5, v9}, Landroid/widget/TextView;->setTextSize(IF)V

    iget v10, v6, La/ra$a;->g:I

    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setGravity(I)V

    const/16 v7, 0xc

    invoke-virtual {v0, v7}, La/ra;->b(I)I

    move-result v7

    invoke-virtual {v3, v11, v11, v11, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v7, La/ga;

    const/4 v10, 0x0

    invoke-direct {v7, v0, v10}, La/ga;-><init>(La/ra;I)V

    invoke-virtual {v3, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, La/ra;->b(I)I

    move-result v7

    new-instance v10, Landroid/view/View;

    invoke-direct {v10, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v12, v2, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v10, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget v7, v6, La/ra$a;->c:I

    invoke-virtual {v10, v7}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {v1, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/16 v7, 0xa

    invoke-virtual {v0, v7}, La/ra;->b(I)I

    move-result v7

    invoke-virtual {v0, v7}, La/ra;->n(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v7, v0, La/ra;->k:La/Me;

    invoke-virtual {v7}, La/Me;->a()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move v10, v11

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_2

    add-int/lit8 v12, v10, 0x1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, La/ra$b;

    new-instance v14, Landroid/widget/LinearLayout;

    invoke-direct {v14, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v14, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v15, 0x10

    invoke-virtual {v14, v15}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/16 v15, 0xe

    invoke-virtual {v0, v15}, La/ra;->b(I)I

    move-result v9

    const/16 v5, 0xd

    invoke-virtual {v0, v5}, La/ra;->b(I)I

    move-result v11

    invoke-virtual {v0, v15}, La/ra;->b(I)I

    move-result v8

    invoke-virtual {v0, v5}, La/ra;->b(I)I

    move-result v5

    invoke-virtual {v14, v9, v11, v8, v5}, Landroid/view/View;->setPadding(IIII)V

    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget v8, v6, La/ra$a;->b:I

    invoke-virtual {v5, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v0, v15}, La/ra;->b(I)I

    move-result v8

    int-to-float v8, v8

    invoke-virtual {v5, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    iget-boolean v8, v0, La/ra;->c:Z

    if-eqz v8, :cond_1

    const/16 v8, 0x21

    const/16 v9, 0xff

    invoke-static {v8, v9, v9, v9}, Landroid/graphics/Color;->argb(IIII)I

    move-result v8

    invoke-virtual {v5, v3, v8}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    :cond_1
    invoke-virtual {v14, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v8, -0x2

    invoke-direct {v5, v2, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v9, 0x4

    invoke-virtual {v0, v9}, La/ra;->b(I)I

    move-result v11

    invoke-virtual {v0, v9}, La/ra;->b(I)I

    move-result v15

    const/4 v2, 0x0

    invoke-virtual {v5, v2, v11, v2, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v14, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-direct {v11, v2, v8, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v5, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-object v8, v13, La/ra$b;->a:Ljava/lang/String;

    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v8, 0x41700000    # 15.0f

    const/4 v11, 0x2

    invoke-virtual {v2, v11, v8}, Landroid/widget/TextView;->setTextSize(IF)V

    sget-object v8, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-static {v8, v3}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v8

    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget v8, v6, La/ra$a;->d:I

    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-object v8, v13, La/ra$b;->b:Ljava/lang/String;

    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v8, 0x41400000    # 12.0f

    const/4 v11, 0x2

    invoke-virtual {v2, v11, v8}, Landroid/widget/TextView;->setTextSize(IF)V

    iget v11, v6, La/ra$a;->e:I

    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v11, 0x3

    invoke-virtual {v0, v11}, La/ra;->b(I)I

    move-result v11

    const/4 v13, 0x0

    invoke-virtual {v2, v13, v11, v13, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v14, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v5, ">"

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v5, 0x41800000    # 16.0f

    const/4 v11, 0x2

    invoke-virtual {v2, v11, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    iget v5, v6, La/ra$a;->f:I

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v14, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, La/la;

    invoke-direct {v2, v0, v10}, La/la;-><init>(La/ra;I)V

    invoke-virtual {v14, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v1, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move v2, v9

    move v9, v8

    move v8, v2

    move v5, v11

    move v10, v12

    move v11, v13

    const/4 v2, -0x1

    goto/16 :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final h()V
    .locals 10

    const/4 v0, 0x1

    iget-object v1, p0, La/ra;->a:Landroid/app/Activity;

    const-string v2, "\u6b63\u5728\u91cd\u542f\u5fae\u4fe1\u2026"

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    iget-object v2, p0, La/ra;->d:Landroid/app/AlertDialog;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    const-string v5, "com.tencent.mm"

    const-string v6, "com.tencent.mm.ui.LauncherUI"

    invoke-virtual {v4, v5, v6}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v5, 0x14000000

    invoke-virtual {v4, v5}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/high16 v5, 0xc000000

    :try_start_1
    invoke-static {v2, v3, v4, v5}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v3

    const-string v5, "alarm"

    invoke-virtual {v2, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    const-string v6, "null cannot be cast to non-null type android.app.AlarmManager"

    invoke-static {v5, v6}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroid/app/AlarmManager;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    const-wide/16 v8, 0x5dc

    add-long/2addr v6, v8

    const/4 v8, 0x2

    invoke-virtual {v5, v8, v6, v7, v3}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    sget-object v3, La/Wf;->a:La/Wf;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v3

    :try_start_2
    invoke-static {v3}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :goto_0
    :try_start_3
    invoke-virtual {v2, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    sget-object v2, La/Wf;->a:La/Wf;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v2

    :try_start_4
    invoke-static {v2}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_1
    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, La/l0;

    invoke-direct {v3, v0}, La/l0;-><init>(I)V

    const-wide/16 v4, 0x320

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_2

    :catch_0
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "\u91cd\u542f\u5931\u8d25: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_2
    return-void
.end method

.method public final j(Ljava/lang/String;Ljava/lang/String;ILa/D7;La/A3;)Landroid/widget/LinearLayout;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p3

    move-object/from16 v2, p5

    new-instance v3, Landroid/widget/LinearLayout;

    iget-object v4, v0, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v3, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x1

    invoke-virtual {v3, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v5, 0xe

    invoke-virtual {v0, v5}, La/ra;->b(I)I

    move-result v6

    const/16 v7, 0xa

    invoke-virtual {v0, v7}, La/ra;->b(I)I

    move-result v7

    invoke-virtual {v0, v5}, La/ra;->b(I)I

    move-result v5

    const/16 v8, 0xc

    invoke-virtual {v0, v8}, La/ra;->b(I)I

    move-result v9

    invoke-virtual {v3, v6, v7, v5, v9}, Landroid/view/View;->setPadding(IIII)V

    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget-object v6, v0, La/ra;->b:La/ra$a;

    iget v7, v6, La/ra$a;->b:I

    invoke-virtual {v5, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v0, v8}, La/ra;->b(I)I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {v5, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v3, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v7, -0x1

    const/4 v9, -0x2

    invoke-direct {v5, v7, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v7, 0x3

    invoke-virtual {v0, v7}, La/ra;->b(I)I

    move-result v10

    invoke-virtual {v0, v7}, La/ra;->b(I)I

    move-result v7

    const/4 v11, 0x0

    invoke-virtual {v5, v11, v10, v11, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v3, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v7, 0x10

    invoke-virtual {v5, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v7, Landroid/widget/TextView;

    invoke-direct {v7, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object/from16 v10, p1

    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v10, 0x2

    const/high16 v12, 0x41600000    # 14.0f

    invoke-virtual {v7, v10, v12}, Landroid/widget/TextView;->setTextSize(IF)V

    iget v12, v6, La/ra$a;->d:I

    invoke-virtual {v7, v12}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-direct {v12, v11, v9, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v7, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v7, Landroid/widget/TextView;

    invoke-direct {v7, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v12, "%"

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v9, 0x41500000    # 13.0f

    invoke-virtual {v7, v10, v9}, Landroid/widget/TextView;->setTextSize(IF)V

    iget v9, v6, La/ra$a;->g:I

    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/4 v12, 0x6

    if-eqz v2, :cond_0

    new-instance v13, Landroid/widget/TextView;

    invoke-direct {v13, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v14, "\u6d4b\u8bd5"

    invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v14, 0x41400000    # 12.0f

    invoke-virtual {v13, v10, v14}, Landroid/widget/TextView;->setTextSize(IF)V

    iget v14, v6, La/ra$a;->b:I

    invoke-virtual {v13, v14}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v14, 0x11

    invoke-virtual {v13, v14}, Landroid/widget/TextView;->setGravity(I)V

    invoke-virtual {v0, v8}, La/ra;->b(I)I

    move-result v14

    const/4 v15, 0x5

    invoke-virtual {v0, v15}, La/ra;->b(I)I

    move-result v11

    invoke-virtual {v0, v8}, La/ra;->b(I)I

    move-result v8

    invoke-virtual {v0, v15}, La/ra;->b(I)I

    move-result v15

    invoke-virtual {v13, v14, v11, v8, v15}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v0, v12}, La/ra;->b(I)I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v13, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v8, La/h3;

    const/4 v9, 0x5

    invoke-direct {v8, v9, v2}, La/h3;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v13, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v5, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object/from16 v5, p2

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v5, 0x41300000    # 11.0f

    invoke-virtual {v2, v10, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    iget v5, v6, La/ra$a;->e:I

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v5, 0x4

    invoke-virtual {v0, v5}, La/ra;->b(I)I

    move-result v5

    invoke-virtual {v0, v12}, La/ra;->b(I)I

    move-result v6

    const/4 v8, 0x0

    invoke-virtual {v2, v8, v5, v8, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/SeekBar;

    invoke-direct {v2, v4}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;)V

    const/16 v4, 0x64

    invoke-virtual {v2, v4}, Landroid/widget/ProgressBar;->setMax(I)V

    invoke-static {v1, v8, v4}, La/Oc;->C(III)I

    move-result v1

    invoke-virtual {v2, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    new-instance v1, La/sa;

    move-object/from16 v4, p4

    invoke-direct {v1, v7, v4}, La/sa;-><init>(Landroid/widget/TextView;La/D7;)V

    invoke-virtual {v2, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object v3
.end method

.method public final l()V
    .locals 13

    iget-object v0, p0, La/ra;->j:La/j2;

    if-eqz v0, :cond_0

    sget-object v1, La/ca;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, La/ra;->j:La/j2;

    iget-object v1, p0, La/ra;->a:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v3, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-double v3, v3

    const-wide v5, 0x3fee147ae147ae14L    # 0.94

    mul-double/2addr v3, v5

    double-to-int v3, v3

    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-double v4, v2

    const-wide v6, 0x3fe999999999999aL    # 0.8

    mul-double/2addr v4, v6

    double-to-int v2, v4

    new-instance v4, Landroid/widget/FrameLayout;

    invoke-direct {v4, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget-object v6, p0, La/ra;->b:La/ra$a;

    iget v6, v6, La/ra$a;->a:I

    invoke-virtual {v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 v6, 0x10

    invoke-virtual {p0, v6}, La/ra;->b(I)I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {v5, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    iget-boolean v7, p0, La/ra;->c:Z

    const/4 v8, 0x1

    if-eqz v7, :cond_1

    const/16 v9, 0x29

    const/16 v10, 0xff

    invoke-static {v9, v10, v10, v10}, Landroid/graphics/Color;->argb(IIII)I

    move-result v9

    invoke-virtual {v5, v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    :cond_1
    invoke-virtual {v4, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    if-eqz v7, :cond_2

    const/high16 v5, 0x41c00000    # 24.0f

    goto :goto_0

    :cond_2
    const/high16 v5, 0x41400000    # 12.0f

    :goto_0
    invoke-virtual {v4, v5}, Landroid/view/View;->setElevation(F)V

    new-instance v5, Landroid/widget/ScrollView;

    invoke-direct {v5, v1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    const/16 v9, 0xc

    invoke-virtual {p0, v9}, La/ra;->b(I)I

    move-result v9

    const/4 v10, 0x0

    invoke-virtual {v5, v10, v10, v10, v9}, Landroid/view/View;->setPadding(IIII)V

    new-instance v9, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v10, -0x1

    invoke-direct {v9, v10, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v5, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iput-object v5, p0, La/ra;->f:Landroid/widget/ScrollView;

    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {p0, v6}, La/ra;->b(I)I

    move-result v9

    invoke-virtual {p0, v6}, La/ra;->b(I)I

    move-result v10

    invoke-virtual {p0, v6}, La/ra;->b(I)I

    move-result v11

    const/16 v12, 0x18

    invoke-virtual {p0, v12}, La/ra;->b(I)I

    move-result v12

    invoke-virtual {v5, v9, v10, v11, v12}, Landroid/view/View;->setPadding(IIII)V

    iput-object v5, p0, La/ra;->e:Landroid/widget/LinearLayout;

    iget-object v5, p0, La/ra;->f:Landroid/widget/ScrollView;

    invoke-static {v5}, La/i9;->b(Ljava/lang/Object;)V

    iget-object v9, p0, La/ra;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v5, v9}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    iget-object v5, p0, La/ra;->f:Landroid/widget/ScrollView;

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0}, La/ra;->g()V

    new-instance v5, Landroid/app/AlertDialog$Builder;

    invoke-direct {v5, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, v4}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_4

    const v4, 0x106000d

    invoke-virtual {v0, v4}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    invoke-virtual {v0, v6}, Landroid/view/Window;->setSoftInputMode(I)V

    if-eqz v7, :cond_3

    const v4, 0x3f19999a    # 0.6f

    :goto_1
    invoke-virtual {v0, v4}, Landroid/view/Window;->setDimAmount(F)V

    goto :goto_2

    :cond_3
    const v4, 0x3ee66666    # 0.45f

    goto :goto_1

    :cond_4
    :goto_2
    invoke-virtual {v1, v8}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    new-instance v0, La/ia;

    invoke-direct {v0, p0}, La/ia;-><init>(La/ra;)V

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    new-instance v0, La/ja;

    invoke-direct {v0, p0}, La/ja;-><init>(La/ra;)V

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v0, p0, La/ra;->j:La/j2;

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    new-instance v0, La/j2;

    const/4 v4, 0x4

    invoke-direct {v0, v4, p0}, La/j2;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, La/ra;->j:La/j2;

    invoke-static {v0}, La/ca;->b(La/ca$d;)V

    :goto_3
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v4

    iput v3, v4, Landroid/view/WindowManager$LayoutParams;->width:I

    iput v2, v4, Landroid/view/WindowManager$LayoutParams;->height:I

    const/16 v2, 0x11

    iput v2, v4, Landroid/view/WindowManager$LayoutParams;->gravity:I

    iget v2, v4, Landroid/view/WindowManager$LayoutParams;->flags:I

    or-int/lit8 v2, v2, 0x20

    const v3, -0x20009

    and-int/2addr v2, v3

    iput v2, v4, Landroid/view/WindowManager$LayoutParams;->flags:I

    invoke-virtual {v0, v4}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    invoke-virtual {v0, v6}, Landroid/view/Window;->setSoftInputMode(I)V

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/view/View;->setFocusable(Z)V

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    :cond_6
    move-object v0, v1

    :cond_7
    iput-object v0, p0, La/ra;->d:Landroid/app/AlertDialog;

    return-void
.end method

.method public final m()V
    .locals 35

    move-object/from16 v1, p0

    const-string v3, "<this>"

    const/16 v7, 0xa

    const/4 v9, 0x0

    const/4 v10, 0x1

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v0

    iget-boolean v11, v0, La/jc;->M:Z

    sget-object v12, La/w1;->g:Ljava/lang/ClassLoader;

    if-eqz v12, :cond_1

    :try_start_0
    sget-object v0, La/hg;->a:La/hg;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v12}, La/hg;->c(Ljava/lang/ClassLoader;)La/ig;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_0
    instance-of v13, v0, La/wd$a;

    if-eqz v13, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, La/ig;

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_2

    iget-object v13, v0, La/ig;->b:Ljava/lang/String;

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v13

    if-lez v13, :cond_2

    sget-object v13, La/K3;->a:La/K3$a;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/K3$a;->p(La/ig;)V

    invoke-static {v0}, La/K3$a;->q(La/ig;)V

    :cond_2
    if-eqz v0, :cond_4

    iget-object v13, v0, La/ig;->b:Ljava/lang/String;

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v13

    if-lez v13, :cond_3

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    if-nez v0, :cond_5

    :cond_4
    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->e()La/ig;

    move-result-object v0

    :cond_5
    sget-object v13, La/K3;->a:La/K3$a;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->d()La/ig;

    move-result-object v13

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "\u2501\u2501\u2501 \u70ed\u66f4\u65b0\u5c4f\u853d\u72b6\u6001 \u2501\u2501\u2501\n"

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz v11, :cond_6

    const-string v11, "\u2705 \u70ed\u66f4\u65b0\u5df2\u88ab\u5c4f\u853d\n"

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_6
    const-string v11, "\u26a0\ufe0f \u70ed\u66f4\u65b0\u5c4f\u853d\u5df2\u5173\u95ed\n"

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_3
    sget-object v11, La/if;->a:La/if;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La/if;->b:Ljava/lang/String;

    new-instance v15, Ljava/lang/StringBuilder;

    const-wide/16 v16, 0x0

    const-string v4, "\u7b26\u53f7\u5b9a\u4f4d\uff1a"

    invoke-direct {v15, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object v4, La/gh;->b:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    const-string v5, ")"

    if-nez v4, :cond_7

    sget-object v4, La/gh;->b:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    const-string v11, "\u5df2\u5c31\u7eea("

    invoke-static {v4, v11, v5}, La/z;->c(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_4

    :cond_7
    const-string v4, "\u672a\u5c31\u7eea"

    :goto_4
    new-instance v11, Ljava/lang/StringBuilder;

    const-string v15, "\u8def\u5f84\u6bb5\uff1a"

    invoke-direct {v11, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\n\n"

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, La/Y5;->a:La/Y5;

    :try_start_1
    new-instance v11, Ljava/io/File;

    invoke-static {}, La/gh;->b()Ljava/io/File;

    move-result-object v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/16 v18, 0x0

    :try_start_2
    const-string v8, "hotupdate_intercept_events.log"

    invoke-direct {v11, v15, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v11}, Ljava/io/File;->isFile()Z

    move-result v8

    if-nez v8, :cond_8

    goto :goto_5

    :cond_8
    invoke-static {v11}, La/w1;->R(Ljava/io/File;)Ljava/util/ArrayList;

    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_5

    :catchall_1
    const/16 v18, 0x0

    :catchall_2
    :goto_5
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    const-string v19, "|"

    filled-new-array/range {v19 .. v19}, [Ljava/lang/String;

    move-result-object v19

    invoke-static {v11, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    aget-object v2, v19, v9

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v20

    if-nez v20, :cond_9

    invoke-static/range {v19 .. v19}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v15, "asList(...)"

    invoke-static {v2, v15}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v15, La/S4;

    new-instance v6, La/i0;

    invoke-direct {v6, v10, v2}, La/i0;-><init>(ILjava/lang/Object;)V

    invoke-direct {v15, v11, v6}, La/S4;-><init>(Ljava/lang/String;La/i0;)V

    new-instance v2, La/Sd;

    invoke-direct {v2, v15}, La/Sd;-><init>(La/S4;)V

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v2, v7}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v6, v15}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, La/Sd;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_7
    move-object v15, v2

    check-cast v15, La/S4$a;

    invoke-virtual {v15}, La/S4$a;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_d

    invoke-virtual {v15}, La/S4$a;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, La/f9;

    const-string v7, "range"

    invoke-static {v15, v7}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget v7, v15, La/d9;->b:I

    add-int/2addr v7, v10

    iget v15, v15, La/d9;->a:I

    invoke-virtual {v11, v15, v7}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v7, 0xa

    goto :goto_7

    :cond_9
    invoke-static {v11, v2, v9, v9}, La/Be;->L(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I

    move-result v6

    const/4 v7, -0x1

    if-eq v6, v7, :cond_c

    new-instance v7, Ljava/util/ArrayList;

    const/4 v15, 0x4

    invoke-direct {v7, v15}, Ljava/util/ArrayList;-><init>(I)V

    move v15, v9

    :goto_8
    invoke-virtual {v11, v15, v6}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v7, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v15

    add-int/2addr v15, v6

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v10, 0x3

    if-eq v6, v10, :cond_b

    invoke-static {v11, v2, v15, v9}, La/Be;->L(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I

    move-result v6

    const/4 v10, -0x1

    if-ne v6, v10, :cond_a

    goto :goto_9

    :cond_a
    const/4 v10, 0x1

    goto :goto_8

    :cond_b
    :goto_9
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v11, v15, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v6, v7

    goto :goto_a

    :cond_c
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, La/w1;->K(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    :cond_d
    :goto_a
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v2

    const/4 v15, 0x4

    if-ge v2, v15, :cond_e

    move-object v15, v3

    move-object/from16 v29, v4

    move-object/from16 v2, v18

    goto/16 :goto_13

    :cond_e
    new-instance v23, La/if$a;

    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_f

    :goto_b
    move-object v15, v3

    move-object/from16 v29, v4

    goto/16 :goto_f

    :cond_f
    invoke-virtual {v2, v9}, Ljava/lang/String;->charAt(I)C

    move-result v10

    const/16 v11, 0x30

    if-ge v10, v11, :cond_10

    const/4 v11, -0x1

    goto :goto_c

    :cond_10
    if-ne v10, v11, :cond_11

    move v11, v9

    goto :goto_c

    :cond_11
    const/4 v11, 0x1

    :goto_c
    const-wide v24, -0x7fffffffffffffffL    # -4.9E-324

    if-gez v11, :cond_15

    const/4 v11, 0x1

    if-ne v7, v11, :cond_12

    goto :goto_b

    :cond_12
    const/16 v11, 0x2b

    if-eq v10, v11, :cond_14

    const/16 v11, 0x2d

    if-eq v10, v11, :cond_13

    goto :goto_b

    :cond_13
    const-wide/high16 v24, -0x8000000000000000L

    const/4 v10, 0x1

    const/4 v11, 0x1

    goto :goto_d

    :cond_14
    move v11, v9

    const/4 v10, 0x1

    goto :goto_d

    :cond_15
    move v10, v9

    move v11, v10

    :goto_d
    const-wide v26, -0x38e38e38e38e38eL    # -2.772000429909333E291

    move-object v15, v3

    move-object/from16 v29, v4

    move-wide/from16 v3, v16

    move-wide/from16 v30, v26

    :goto_e
    if-ge v10, v7, :cond_1b

    invoke-virtual {v2, v10}, Ljava/lang/String;->charAt(I)C

    move-result v9

    move-object/from16 v19, v2

    const/16 v2, 0xa

    invoke-static {v9, v2}, Ljava/lang/Character;->digit(II)I

    move-result v9

    if-gez v9, :cond_16

    goto :goto_f

    :cond_16
    cmp-long v21, v3, v30

    if-gez v21, :cond_17

    cmp-long v21, v30, v26

    if-nez v21, :cond_19

    move/from16 v32, v10

    move/from16 v28, v11

    int-to-long v10, v2

    div-long v30, v24, v10

    cmp-long v10, v3, v30

    if-gez v10, :cond_18

    goto :goto_f

    :cond_17
    move/from16 v32, v10

    move/from16 v28, v11

    :cond_18
    int-to-long v10, v2

    mul-long/2addr v3, v10

    int-to-long v9, v9

    add-long v33, v24, v9

    cmp-long v2, v3, v33

    if-gez v2, :cond_1a

    :cond_19
    :goto_f
    move-object/from16 v2, v18

    goto :goto_10

    :cond_1a
    sub-long/2addr v3, v9

    const/16 v22, 0x1

    add-int/lit8 v10, v32, 0x1

    move-object/from16 v2, v19

    move/from16 v11, v28

    const/4 v9, 0x0

    goto :goto_e

    :cond_1b
    move/from16 v28, v11

    if-eqz v28, :cond_1c

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    goto :goto_10

    :cond_1c
    neg-long v2, v3

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :goto_10
    if-eqz v2, :cond_1d

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-wide/from16 v24, v2

    :goto_11
    const/4 v11, 0x1

    goto :goto_12

    :cond_1d
    move-wide/from16 v24, v16

    goto :goto_11

    :goto_12
    invoke-interface {v6, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v26, v2

    check-cast v26, Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "1"

    invoke-static {v2, v3}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v27

    const/4 v10, 0x3

    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, La/Be;->V(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v28

    invoke-direct/range {v23 .. v28}, La/if$a;-><init>(JLjava/lang/String;ZLjava/lang/String;)V

    move-object/from16 v2, v23

    :goto_13
    if-eqz v2, :cond_1e

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1e
    move-object v3, v15

    move-object/from16 v4, v29

    const/16 v7, 0xa

    const/4 v9, 0x0

    const/4 v10, 0x1

    goto/16 :goto_6

    :cond_1f
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_20

    const/4 v3, 0x0

    goto :goto_15

    :cond_20
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :cond_21
    :goto_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_23

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/if$a;

    iget-boolean v4, v4, La/if$a;->c:Z

    if-eqz v4, :cond_21

    const/16 v22, 0x1

    add-int/lit8 v3, v3, 0x1

    if-ltz v3, :cond_22

    goto :goto_14

    :cond_22
    invoke-static {}, La/o3;->f0()V

    throw v18

    :cond_23
    :goto_15
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_24

    move-object/from16 v4, v18

    goto :goto_17

    :cond_24
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/if$a;

    iget-wide v6, v4, La/if$a;->a:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    :cond_25
    :goto_16
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_26

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La/if$a;

    iget-wide v6, v6, La/if$a;->a:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/Long;->compareTo(Ljava/lang/Object;)I

    move-result v7

    if-gez v7, :cond_25

    move-object v4, v6

    goto :goto_16

    :cond_26
    :goto_17
    if-eqz v4, :cond_27

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    goto :goto_18

    :cond_27
    move-wide/from16 v6, v16

    :goto_18
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v3

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/16 v9, 0x14

    if-lt v9, v4, :cond_28

    invoke-static {v8}, La/t3;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    :goto_19
    const/4 v11, 0x1

    goto :goto_1b

    :cond_28
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10, v9}, Ljava/util/ArrayList;-><init>(I)V

    add-int/lit8 v9, v4, -0x14

    :goto_1a
    if-ge v9, v4, :cond_29

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v11, 0x1

    add-int/2addr v9, v11

    goto :goto_1a

    :cond_29
    move-object v4, v10

    goto :goto_19

    :goto_1b
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v8

    if-gt v8, v11, :cond_2a

    invoke-static {v4}, La/t3;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    goto :goto_1c

    :cond_2a
    invoke-static {v4}, La/t3;->z0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    :goto_1c
    const-string v8, "\u2501\u2501\u2501 \u62e6\u622a\u8bb0\u5f55 \u2501\u2501\u2501\n"

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "\u62e6\u622a\u6210\u529f\uff1a"

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " \u6b21"

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v8, 0xa

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "\u62e6\u622a\u5931\u8d25\uff08\u7ed5\u8fc7\uff09\uff1a"

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v6, v7}, La/ra;->c(J)Ljava/lang/String;

    move-result-object v2

    const-string v3, "\u6700\u8fd1\u62e6\u622a\uff1a"

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\n\n\u2501\u2501\u2501 \u5f53\u524d\u8fd0\u884c\u7248\u672c \u2501\u2501\u2501\n"

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_3c

    iget-object v2, v0, La/ig;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_3c

    iget-object v2, v0, La/ig;->b:Ljava/lang/String;

    iget v3, v0, La/ig;->c:I

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "\u7248\u672c\u53f7\uff1a"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " ("

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v8, 0xa

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-wide v6, v0, La/ig;->a:J

    invoke-static {v6, v7}, La/ra;->c(J)Ljava/lang/String;

    move-result-object v3

    const-string v6, "\u91c7\u96c6\u65f6\u95f4\uff1a"

    invoke-virtual {v6, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v3, v0, La/ig;->d:Ljava/lang/String;

    const-string v6, "\u5c1a\u672a\u52a0\u8f7d"

    if-nez v3, :cond_2b

    move-object v3, v6

    :cond_2b
    const-string v7, "\u5f53\u524d Tag\uff1a"

    invoke-virtual {v7, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v3, v0, La/ig;->f:Ljava/lang/String;

    if-nez v3, :cond_2c

    move-object v3, v6

    :cond_2c
    const-string v7, "\u5f53\u524d\u6784\u5efa\uff1a"

    invoke-virtual {v7, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v3, v0, La/ig;->h:Ljava/lang/String;

    invoke-static {v3}, La/ra;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v9, "\u5f53\u524d Rev\uff1a"

    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v3, v0, La/ig;->l:Ljava/lang/Boolean;

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v7}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2d

    const-string v3, "\u542f\u7528"

    goto :goto_1d

    :cond_2d
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3, v7}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2e

    const-string v3, "\u7981\u7528"

    goto :goto_1d

    :cond_2e
    if-nez v3, :cond_3b

    const-string v3, "\u672a\u77e5"

    :goto_1d
    const-string v7, "\u8865\u4e01\u72b6\u6001\uff1a"

    invoke-virtual {v7, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\n\n\u2501\u2501\u2501 \u57fa\u7ebf\u7248\u672c\uff08\u70ed\u66f4\u65b0\u524d\uff09 \u2501\u2501\u2501\n"

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, La/ig;->a()Z

    move-result v3

    const-string v7, "\u57fa\u7ebf\u7248\u672c\uff1a"

    if-nez v3, :cond_31

    invoke-virtual {v0}, La/ig;->a()Z

    move-result v3

    if-eqz v3, :cond_2f

    goto :goto_1e

    :cond_2f
    const-string v3, "\ud83d\udfe2 \u672a\u68c0\u6d4b\u5230\u70ed\u66f4\u65b0\uff08\u5f53\u524d = \u57fa\u7ebf\uff09\n"

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, La/ig;->k:Ljava/lang/String;

    if-nez v3, :cond_30

    const-string v3, "null\uff08\u65e0\u70ed\u66f4\u65b0\u8bb0\u5f55\uff09"

    :cond_30
    invoke-virtual {v7, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v8, 0xa

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_20

    :cond_31
    :goto_1e
    const-string v3, "\ud83d\udd34 \u5f53\u524d\u7248\u672c\u5df2\u88ab\u70ed\u66f4\u65b0\n"

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, La/ig;->k:Ljava/lang/String;

    if-nez v3, :cond_32

    move-object v3, v6

    :cond_32
    invoke-virtual {v7, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v8, 0xa

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v3, v0, La/ig;->e:Ljava/lang/String;

    if-nez v3, :cond_33

    move-object v3, v6

    :cond_33
    const-string v7, "\u57fa\u7ebf Tag\uff1a"

    invoke-virtual {v7, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v3, v0, La/ig;->g:Ljava/lang/String;

    if-nez v3, :cond_34

    goto :goto_1f

    :cond_34
    move-object v6, v3

    :goto_1f
    const-string v3, "\u57fa\u7ebf\u6784\u5efa\uff1a"

    invoke-virtual {v3, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v3, v0, La/ig;->i:Ljava/lang/String;

    invoke-static {v3}, La/ra;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "\u57fa\u7ebf Rev\uff1a"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v3, v0, La/ig;->j:Ljava/lang/String;

    invoke-static {v3}, La/ra;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "\u8865\u4e01 Rev\uff1a"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_20
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-eqz v13, :cond_3a

    iget-wide v6, v13, La/ig;->a:J

    cmp-long v3, v6, v16

    if-lez v3, :cond_3a

    const-string v3, "\u2501\u2501\u2501 \u521d\u59cb\u5feb\u7167\u5bf9\u6bd4 \u2501\u2501\u2501\n"

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v6, v13, La/ig;->a:J

    invoke-static {v6, v7}, La/ra;->c(J)Ljava/lang/String;

    move-result-object v3

    const-string v6, "\u521d\u59cb\u8bb0\u5f55\uff1a"

    invoke-virtual {v6, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v8, 0xa

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v3, v13, La/ig;->b:Ljava/lang/String;

    iget v6, v13, La/ig;->c:I

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "\u521d\u59cb\u7248\u672c\uff1a"

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v8, 0xa

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, v13, La/ig;->b:Ljava/lang/String;

    iget-object v3, v0, La/ig;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "\ud83d\udfe2 \u7248\u672c\u672a\u53d8\u52a8\n"

    if-eqz v2, :cond_36

    iget-object v2, v13, La/ig;->h:Ljava/lang/String;

    iget-object v5, v0, La/ig;->h:Ljava/lang/String;

    invoke-static {v2, v5}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_35

    goto :goto_21

    :cond_35
    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_24

    :cond_36
    :goto_21
    iget-object v2, v13, La/ig;->h:Ljava/lang/String;

    if-eqz v2, :cond_37

    iget-object v5, v0, La/ig;->h:Ljava/lang/String;

    if-eqz v5, :cond_37

    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_37

    const/4 v2, 0x1

    goto :goto_22

    :cond_37
    const/4 v2, 0x0

    :goto_22
    iget-object v5, v13, La/ig;->b:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_38

    iget-object v5, v0, La/ig;->b:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_38

    iget-object v5, v13, La/ig;->b:Ljava/lang/String;

    iget-object v6, v0, La/ig;->b:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_38

    goto :goto_23

    :cond_38
    if-eqz v2, :cond_39

    :goto_23
    const-string v2, "\ud83d\udfe1 \u7248\u672c\u5df2\u53d8\u52a8\uff08\u7591\u4f3c\u70ed\u66f4\u65b0\u6216 APK \u66f4\u65b0\uff09\n"

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v13, La/ig;->h:Ljava/lang/String;

    invoke-static {v2}, La/ra;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "  \u521d\u59cb Rev\uff1a"

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v8, 0xa

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v0, v0, La/ig;->h:Ljava/lang/String;

    invoke-static {v0}, La/ra;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "  \u5f53\u524d Rev\uff1a"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_24

    :cond_39
    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_24

    :cond_3a
    const-string v0, "\u2501\u2501\u2501 \u521d\u59cb\u5feb\u7167 \u2501\u2501\u2501\n\u5c1a\u672a\u8bb0\u5f55\uff08\u672c\u6b21\u91c7\u96c6\u5c06\u4f5c\u4e3a\u521d\u59cb\u5feb\u7167\uff09\n"

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_24

    :cond_3b
    new-instance v0, La/Ob;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_3c
    const-string v0, "\u26a0\ufe0f \u5c1a\u672a\u91c7\u96c6\u5230\u7248\u672c\u4fe1\u606f\n\uff08\u8bf7\u786e\u4fdd\u5fae\u4fe1\u5df2\u5b8c\u5168\u542f\u52a8\u540e\u91cd\u8bd5\uff09\n"

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v12, :cond_3d

    const-string v0, "\uff08ClassLoader \u672a\u5c31\u7eea\uff0c\u6a21\u5757\u53ef\u80fd\u672a\u5728\u5fae\u4fe1\u8fdb\u7a0b\u52a0\u8f7d\uff09\n"

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3d
    sget-object v0, La/Wf;->a:La/Wf;

    :goto_24
    new-instance v0, Landroid/widget/ScrollView;

    iget-object v2, v1, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v0, v2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget-object v3, v1, La/ra;->b:La/ra$a;

    iget v3, v3, La/ra$a;->a:I

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 v3, 0xc

    invoke-virtual {v1, v3}, La/ra;->b(I)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v2, Landroid/widget/LinearLayout;

    iget-object v3, v1, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v2, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v11, 0x1

    invoke-virtual {v2, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v3, 0x10

    invoke-virtual {v1, v3}, La/ra;->b(I)I

    move-result v5

    invoke-virtual {v1, v3}, La/ra;->b(I)I

    move-result v6

    invoke-virtual {v1, v3}, La/ra;->b(I)I

    move-result v7

    invoke-virtual {v1, v3}, La/ra;->b(I)I

    move-result v3

    invoke-virtual {v2, v5, v6, v7, v3}, Landroid/view/View;->setPadding(IIII)V

    new-instance v3, Landroid/widget/TextView;

    iget-object v5, v1, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v3, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v5, 0x41400000    # 12.0f

    const/4 v6, 0x2

    invoke-virtual {v3, v6, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v6, v1, La/ra;->b:La/ra$a;

    iget v6, v6, La/ra$a;->d:I

    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object v6, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const/4 v7, 0x0

    const v8, 0x3fa66666    # 1.3f

    invoke-virtual {v3, v7, v8}, Landroid/widget/TextView;->setLineSpacing(FF)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/16 v8, 0xa

    invoke-static {v8, v4}, La/t3;->s0(ILjava/util/Collection;)Ljava/util/List;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_42

    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v4, "HH:mm:ss"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v8

    invoke-direct {v3, v4, v8}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v12, Landroid/widget/TextView;

    iget-object v4, v1, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v12, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v4

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "\u25b8 \u6700\u8fd1\u4e8b\u4ef6\uff08"

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " \u6761\uff09\u70b9\u51fb\u5c55\u5f00"

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v12, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v4, 0x2

    invoke-virtual {v12, v4, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v4, v1, La/ra;->b:La/ra$a;

    iget v4, v4, La/ra$a;->g:I

    invoke-virtual {v12, v4}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v12, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const/16 v4, 0x8

    invoke-virtual {v1, v4}, La/ra;->b(I)I

    move-result v6

    const/4 v15, 0x4

    invoke-virtual {v1, v15}, La/ra;->b(I)I

    move-result v8

    const/4 v9, 0x0

    invoke-virtual {v12, v9, v6, v9, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    const/4 v11, 0x1

    invoke-virtual {v12, v11}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v2, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v6, Landroid/widget/LinearLayout;

    iget-object v8, v1, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v6, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v6, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_25
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_41

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La/if$a;

    iget-wide v10, v9, La/if$a;->a:J

    cmp-long v10, v10, v16

    if-lez v10, :cond_3e

    new-instance v10, Ljava/util/Date;

    iget-wide v14, v9, La/if$a;->a:J

    invoke-direct {v10, v14, v15}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v3, v10}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v10

    goto :goto_26

    :cond_3e
    const-string v10, "--:--:--"

    :goto_26
    iget-boolean v11, v9, La/if$a;->c:Z

    if-eqz v11, :cond_3f

    const-string v11, "\u62e6\u622a"

    goto :goto_27

    :cond_3f
    const-string v11, "\u7ed5\u8fc7"

    :goto_27
    iget-object v14, v9, La/if$a;->d:Ljava/lang/String;

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v14

    const/16 v15, 0x28

    if-le v14, v15, :cond_40

    iget-object v14, v9, La/if$a;->d:Ljava/lang/String;

    const/16 v15, 0x25

    invoke-static {v14, v15}, La/Ce;->Y(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v14

    const-string v15, "..."

    invoke-virtual {v15, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    goto :goto_28

    :cond_40
    iget-object v14, v9, La/if$a;->d:Ljava/lang/String;

    :goto_28
    new-instance v15, Landroid/widget/TextView;

    iget-object v4, v1, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v15, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-object v4, v9, La/if$a;->b:Ljava/lang/String;

    const-string v9, "["

    const-string v7, "] "

    const-string v5, " "

    invoke-static {v9, v10, v7, v4, v5}, La/z;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v4, 0x2

    const/high16 v5, 0x41400000    # 12.0f

    invoke-virtual {v15, v4, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v7, v1, La/ra;->b:La/ra$a;

    iget v7, v7, La/ra$a;->d:I

    invoke-virtual {v15, v7}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object v7, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {v15, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const/4 v10, 0x3

    invoke-virtual {v1, v10}, La/ra;->b(I)I

    move-result v7

    invoke-virtual {v1, v10}, La/ra;->b(I)I

    move-result v9

    const/4 v11, 0x0

    invoke-virtual {v15, v11, v7, v11, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    const v7, 0x3f99999a    # 1.2f

    const/4 v9, 0x0

    invoke-virtual {v15, v9, v7}, Landroid/widget/TextView;->setLineSpacing(FF)V

    invoke-virtual {v6, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move v7, v9

    const/16 v4, 0x8

    goto/16 :goto_25

    :cond_41
    new-instance v11, Landroid/widget/ScrollView;

    iget-object v3, v1, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v11, v3}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v4, 0xa0

    invoke-virtual {v1, v4}, La/ra;->b(I)I

    move-result v4

    const/4 v7, -0x1

    invoke-direct {v3, v7, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v11, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v3, 0x1

    invoke-virtual {v11, v3}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    const/16 v3, 0x8

    invoke-virtual {v11, v3}, Landroid/view/View;->setVisibility(I)V

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget-object v5, v1, La/ra;->b:La/ra$a;

    iget v5, v5, La/ra$a;->b:I

    invoke-virtual {v4, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v1, v3}, La/ra;->b(I)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v4, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v11, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v11, v6}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    invoke-virtual {v2, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v10, La/Qc;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    new-instance v9, La/oa;

    const/4 v14, 0x1

    invoke-direct/range {v9 .. v14}, La/oa;-><init>(Ljava/lang/Object;Landroid/view/View;Landroid/widget/TextView;Ljava/lang/Object;I)V

    invoke-virtual {v12, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_42
    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/app/AlertDialog$Builder;

    iget-object v3, v1, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v2, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v3, "\u7248\u672c\u8be6\u60c5"

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v2, La/pa;

    const/4 v9, 0x0

    invoke-direct {v2, v1, v9}, La/pa;-><init>(La/ra;I)V

    const-string v3, "\u5237\u65b0"

    invoke-virtual {v0, v3, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v2, La/pa;

    const/4 v11, 0x1

    invoke-direct {v2, v1, v11}, La/pa;-><init>(La/ra;I)V

    const-string v3, "\u91cd\u7f6e\u5feb\u7167"

    invoke-virtual {v0, v3, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v2, "\u5173\u95ed"

    move-object/from16 v3, v18

    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    invoke-virtual {v1, v0}, La/ra;->o(Landroid/app/AlertDialog;)V

    return-void
.end method

.method public final n(I)Landroid/view/View;
    .locals 3

    new-instance v0, Landroid/view/View;

    iget-object v1, p0, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, p1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public final o(Landroid/app/AlertDialog;)V
    .locals 4

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    iget-object v1, p0, La/ra;->b:La/ra$a;

    if-eqz v0, :cond_0

    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget v3, v1, La/ra$a;->a:I

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 v3, 0x10

    invoke-virtual {p0, v3}, La/ra;->b(I)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v0, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v0

    if-eqz v0, :cond_1

    iget v2, v1, La/ra$a;->g:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_1
    const/4 v0, -0x2

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v0

    if-eqz v0, :cond_2

    iget v2, v1, La/ra$a;->g:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_2
    const/4 v0, -0x3

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v0

    if-eqz v0, :cond_3

    iget v2, v1, La/ra$a;->g:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_3
    const v0, 0x1020016

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_4

    iget v2, v1, La/ra$a;->d:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_4
    const v0, 0x102000b

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_5

    iget v0, v1, La/ra$a;->e:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_5
    return-void
.end method

.method public final p(Ljava/lang/String;Ljava/lang/String;Landroid/widget/Switch;La/D7;)Landroid/widget/LinearLayout;
    .locals 9

    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v3, 0x10

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/16 v3, 0xe

    invoke-virtual {p0, v3}, La/ra;->b(I)I

    move-result v3

    const/16 v4, 0xc

    invoke-virtual {p0, v4}, La/ra;->b(I)I

    move-result v5

    const/16 v6, 0xa

    invoke-virtual {p0, v6}, La/ra;->b(I)I

    move-result v6

    invoke-virtual {p0, v4}, La/ra;->b(I)I

    move-result v7

    invoke-virtual {v0, v3, v5, v6, v7}, Landroid/view/View;->setPadding(IIII)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget-object v5, p0, La/ra;->b:La/ra$a;

    iget v6, v5, La/ra$a;->b:I

    invoke-virtual {v3, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {p0, v4}, La/ra;->b(I)I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    iget-boolean v4, p0, La/ra;->c:Z

    const/4 v6, 0x1

    if-eqz v4, :cond_0

    const/16 v4, 0x21

    const/16 v7, 0xff

    invoke-static {v4, v7, v7, v7}, Landroid/graphics/Color;->argb(IIII)I

    move-result v4

    invoke-virtual {v3, v6, v4}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    :cond_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x1

    const/4 v7, -0x2

    invoke-direct {v3, v4, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v4, 0x3

    invoke-virtual {p0, v4}, La/ra;->b(I)I

    move-result v8

    invoke-virtual {p0, v4}, La/ra;->b(I)I

    move-result v4

    invoke-virtual {v3, v2, v8, v2, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-direct {v4, v2, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p1, 0x2

    const/high16 v4, 0x41700000    # 15.0f

    invoke-virtual {v2, p1, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    iget v4, v5, La/ra$a;->d:I

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setSingleLine(Z)V

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 p2, 0x41400000    # 12.0f

    invoke-virtual {v2, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    iget p1, v5, La/ra$a;->e:I

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance p1, La/X2;

    const/4 p2, 0x1

    invoke-direct {p1, p2, p4}, La/X2;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p3, p1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v0, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object v0
.end method

.method public final q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;
    .locals 2

    new-instance v0, Landroid/widget/Switch;

    iget-object v1, p0, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/Switch;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p3}, Landroid/widget/Switch;->setChecked(Z)V

    sget-object p3, La/Wf;->a:La/Wf;

    invoke-virtual {p0, p1, p2, v0, p4}, La/ra;->p(Ljava/lang/String;Ljava/lang/String;Landroid/widget/Switch;La/D7;)Landroid/widget/LinearLayout;

    move-result-object p1

    return-object p1
.end method
