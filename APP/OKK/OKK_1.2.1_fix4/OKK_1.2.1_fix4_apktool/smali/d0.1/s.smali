.class public final Ld0/s;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final H:Ljava/util/List;


# instance fields
.field public A:I

.field public B:Landroid/animation/ValueAnimator;

.field public final C:[I

.field public final D:[Z

.field public final E:Landroid/view/animation/PathInterpolator;

.field public final F:Landroid/animation/ArgbEvaluator;

.field public volatile G:Z

.field public final a:Ljava/util/List;

.field public final b:Z

.field public final c:Z

.field public final d:LP0/l;

.field public final e:LP0/l;

.field public final f:F

.field public final g:Z

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:Landroid/graphics/Paint;

.field public final l:Landroid/graphics/Paint;

.field public final m:Landroid/graphics/Paint;

.field public final n:Landroid/graphics/Paint;

.field public final o:Landroid/graphics/Paint;

.field public final p:Landroid/graphics/RectF;

.field public final q:Landroid/graphics/RectF;

.field public final r:Landroid/graphics/RectF;

.field public final s:Landroid/graphics/RectF;

.field public final t:[Landroid/widget/TextView;

.field public final u:[Landroid/widget/TextView;

.field public final v:[Landroid/view/View;

.field public w:F

.field public x:F

.field public y:F

.field public z:F


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "\u53d1\u73b0"

    const-string v1, "\u6211"

    const-string v2, "\u5fae\u4fe1"

    const-string v3, "\u901a\u8baf\u5f55"

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ld0/s;->H:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;ZZLc0/A;Lc0/A;)V
    .locals 9

    const/4 v0, 0x4

    const-string v1, "labels"

    invoke-static {p2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Ld0/s;->a:Ljava/util/List;

    iput-boolean p3, p0, Ld0/s;->b:Z

    iput-boolean p4, p0, Ld0/s;->c:Z

    iput-object p5, p0, Ld0/s;->d:LP0/l;

    iput-object p6, p0, Ld0/s;->e:LP0/l;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    iput p2, p0, Ld0/s;->f:F

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p3

    iget p3, p3, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p3, p3, 0x30

    const/16 p4, 0x20

    const/4 p5, 0x1

    const/4 p6, 0x0

    if-ne p3, p4, :cond_0

    move p3, p5

    goto :goto_0

    :cond_0
    move p3, p6

    :goto_0
    iput-boolean p3, p0, Ld0/s;->g:Z

    if-eqz p3, :cond_1

    const-string p4, "#F21C1C1E"

    :goto_1
    invoke-static {p4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p4

    goto :goto_2

    :cond_1
    const-string p4, "#F7FFFFFF"

    goto :goto_1

    :goto_2
    if-eqz p3, :cond_2

    const-string v1, "#33A8C7FF"

    :goto_3
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    goto :goto_4

    :cond_2
    const-string v1, "#332B7FFF"

    goto :goto_3

    :goto_4
    if-eqz p3, :cond_3

    const-string v2, "#18FFFFFF"

    :goto_5
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    goto :goto_6

    :cond_3
    const-string v2, "#22FFFFFF"

    goto :goto_5

    :goto_6
    if-eqz p3, :cond_4

    const-string v3, "#8BB8FF"

    :goto_7
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    goto :goto_8

    :cond_4
    const-string v3, "#3A7AFA"

    goto :goto_7

    :goto_8
    iput v3, p0, Ld0/s;->h:I

    if-eqz p3, :cond_5

    const-string v3, "#99EBEBF5"

    :goto_9
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    goto :goto_a

    :cond_5
    const-string v3, "#8A3C3C43"

    goto :goto_9

    :goto_a
    iput v3, p0, Ld0/s;->i:I

    const-string v3, "#FF453A"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    iput v3, p0, Ld0/s;->j:I

    if-eqz p3, :cond_6

    const-string v3, "#1AFFFFFF"

    :goto_b
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    goto :goto_c

    :cond_6
    const-string v3, "#0F000000"

    goto :goto_b

    :goto_c
    if-eqz p3, :cond_7

    const-string p3, "#40000000"

    :goto_d
    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p3

    goto :goto_e

    :cond_7
    const-string p3, "#14000000"

    goto :goto_d

    :goto_e
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4, p5}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {v4, p4}, Landroid/graphics/Paint;->setColor(I)V

    sget-object p4, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v4, p4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iput-object v4, p0, Ld0/s;->k:Landroid/graphics/Paint;

    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4, p5}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const v3, 0x3f19999a    # 0.6f

    mul-float/2addr v3, p2

    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iput-object v4, p0, Ld0/s;->l:Landroid/graphics/Paint;

    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2, p5}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iput-object p2, p0, Ld0/s;->m:Landroid/graphics/Paint;

    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2, p5}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iput-object p2, p0, Ld0/s;->n:Landroid/graphics/Paint;

    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2, p5}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iput-object p2, p0, Ld0/s;->o:Landroid/graphics/Paint;

    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, Ld0/s;->p:Landroid/graphics/RectF;

    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, Ld0/s;->q:Landroid/graphics/RectF;

    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, Ld0/s;->r:Landroid/graphics/RectF;

    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, Ld0/s;->s:Landroid/graphics/RectF;

    new-array p2, v0, [Landroid/widget/TextView;

    iput-object p2, p0, Ld0/s;->t:[Landroid/widget/TextView;

    new-array p2, v0, [Landroid/widget/TextView;

    iput-object p2, p0, Ld0/s;->u:[Landroid/widget/TextView;

    new-array p2, v0, [Landroid/view/View;

    iput-object p2, p0, Ld0/s;->v:[Landroid/view/View;

    const/high16 p2, 0x3f800000    # 1.0f

    iput p2, p0, Ld0/s;->x:F

    new-array p3, v0, [I

    iput-object p3, p0, Ld0/s;->C:[I

    new-array p3, v0, [Z

    fill-array-data p3, :array_0

    iput-object p3, p0, Ld0/s;->D:[Z

    new-instance p3, Landroid/view/animation/PathInterpolator;

    const p4, 0x3f666666    # 0.9f

    const v1, 0x3e4ccccd    # 0.2f

    invoke-direct {p3, v1, p4, v1, p2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    iput-object p3, p0, Ld0/s;->E:Landroid/view/animation/PathInterpolator;

    new-instance p3, Landroid/animation/ArgbEvaluator;

    invoke-direct {p3}, Landroid/animation/ArgbEvaluator;-><init>()V

    iput-object p3, p0, Ld0/s;->F:Landroid/animation/ArgbEvaluator;

    invoke-virtual {p0, p6}, Landroid/view/View;->setWillNotDraw(Z)V

    const/4 p3, 0x0

    invoke-virtual {p0, p6, p3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    invoke-virtual {p0, p6}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-virtual {p0, p6}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    invoke-virtual {p0, p6}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p0, p6}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {p0, p6}, Landroid/view/View;->setFocusable(Z)V

    const/high16 p3, 0x41e00000    # 28.0f

    invoke-virtual {p0, p3}, Ld0/s;->c(F)I

    move-result p3

    const/high16 p4, 0x41000000    # 8.0f

    invoke-virtual {p0, p4}, Ld0/s;->c(F)I

    move-result p4

    const/high16 v1, 0x41600000    # 14.0f

    invoke-virtual {p0, v1}, Ld0/s;->c(F)I

    move-result v1

    invoke-virtual {p0, p3, p4, p3, v1}, Landroid/view/View;->setPadding(IIII)V

    new-instance p3, Landroid/widget/LinearLayout;

    invoke-direct {p3, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {p3, p6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 p1, 0x10

    invoke-virtual {p3, p1}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    const/high16 p4, 0x42480000    # 50.0f

    invoke-virtual {p0, p4}, Ld0/s;->c(F)I

    move-result p4

    const/4 v1, -0x1

    invoke-direct {p1, v1, p4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 p4, 0x31

    iput p4, p1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {p3, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/high16 p1, 0x40a00000    # 5.0f

    invoke-virtual {p0, p1}, Ld0/s;->c(F)I

    move-result p4

    const/high16 v2, 0x40400000    # 3.0f

    invoke-virtual {p0, v2}, Ld0/s;->c(F)I

    move-result v3

    invoke-virtual {p0, p1}, Ld0/s;->c(F)I

    move-result v4

    invoke-virtual {p0, v2}, Ld0/s;->c(F)I

    move-result v5

    invoke-virtual {p3, p4, v3, v4, v5}, Landroid/view/View;->setPadding(IIII)V

    invoke-virtual {p3, p6}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {p3, p6}, Landroid/view/View;->setFocusable(Z)V

    invoke-virtual {p3, p6}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-virtual {p3, p6}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    move p4, p6

    :goto_f
    if-ge p4, v0, :cond_b

    new-instance v3, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, p6, v1, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v3, p5}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v3, p5}, Landroid/view/View;->setFocusable(Z)V

    new-instance v4, Ld0/r;

    invoke-direct {v4, p0, p4}, Ld0/r;-><init>(Ld0/s;I)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/high16 v4, 0x42600000    # 56.0f

    invoke-virtual {p0, v4}, Ld0/s;->c(F)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/view/View;->setMinimumWidth(I)V

    invoke-virtual {v3, p6}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-virtual {v3, p6}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    iget-object v4, p0, Ld0/s;->v:[Landroid/view/View;

    aput-object v3, v4, p4

    new-instance v4, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v6, -0x2

    const/16 v7, 0x11

    invoke-direct {v5, v6, v6, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    if-ltz p4, :cond_8

    iget-object v5, p0, Ld0/s;->a:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    if-ge p4, v8, :cond_8

    invoke-interface {v5, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    goto :goto_11

    :cond_8
    if-ltz p4, :cond_9

    sget-object v5, Ld0/s;->H:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    if-ge p4, v8, :cond_9

    invoke-interface {v5, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    goto :goto_10

    :cond_9
    const-string v5, ""

    :goto_10
    check-cast v5, Ljava/lang/String;

    :goto_11
    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v5, 0x41580000    # 13.5f

    const/4 v8, 0x2

    invoke-virtual {v4, v8, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    iget v5, p0, Ld0/s;->i:I

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v4, p5}, Landroid/widget/TextView;->setMaxLines(I)V

    invoke-virtual {v4, p6}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    const-string v5, "sans-serif-medium"

    invoke-static {v5, p6}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-boolean v5, p0, Ld0/s;->b:Z

    if-eqz v5, :cond_a

    move v5, p6

    goto :goto_12

    :cond_a
    move v5, v0

    :goto_12
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object v5, p0, Ld0/s;->t:[Landroid/widget/TextView;

    aput-object v4, v5, p4

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v5, v6, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const v6, 0x800035

    iput v6, v5, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {p0, v2}, Ld0/s;->c(F)I

    move-result v6

    iput v6, v5, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    invoke-virtual {p0, p1}, Ld0/s;->c(F)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/high16 v5, 0x41200000    # 10.0f

    invoke-virtual {v4, v8, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setGravity(I)V

    const/high16 v5, 0x41800000    # 16.0f

    invoke-virtual {p0, v5}, Ld0/s;->c(F)I

    move-result v6

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setMinWidth(I)V

    invoke-virtual {p0, v5}, Ld0/s;->c(F)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setMinHeight(I)V

    const/16 v5, 0x8

    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v4, p6}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    sget-object v5, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-static {v5, p5}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v5, p6}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    iget v6, p0, Ld0/s;->f:F

    const/high16 v7, 0x41100000    # 9.0f

    mul-float/2addr v7, v6

    invoke-virtual {v5, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    iget v6, p0, Ld0/s;->j:I

    invoke-virtual {v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/high16 v5, 0x40800000    # 4.0f

    invoke-virtual {p0, v5}, Ld0/s;->c(F)I

    move-result v6

    invoke-virtual {p0, p2}, Ld0/s;->c(F)I

    move-result v7

    invoke-virtual {p0, v5}, Ld0/s;->c(F)I

    move-result v5

    invoke-virtual {p0, p2}, Ld0/s;->c(F)I

    move-result v8

    invoke-virtual {v4, v6, v7, v5, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    iget-object v5, p0, Ld0/s;->u:[Landroid/widget/TextView;

    aput-object v4, v5, p4

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p3, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    add-int/2addr p4, p5

    goto/16 :goto_f

    :cond_b
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0, p5}, Ld0/s;->b(Z)V

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method


# virtual methods
.method public final a(F)V
    .locals 5

    const/4 v0, 0x1

    iget-object v1, p0, Ld0/s;->B:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    iget v1, p0, Ld0/s;->w:F

    sub-float v2, v1, p1

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const v3, 0x3a83126f    # 0.001f

    cmpg-float v2, v2, v3

    const/high16 v3, 0x3f800000    # 1.0f

    if-gez v2, :cond_1

    iput p1, p0, Ld0/s;->w:F

    iput v3, p0, Ld0/s;->x:F

    invoke-virtual {p0, v0}, Ld0/s;->b(Z)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    :cond_1
    iput v1, p0, Ld0/s;->y:F

    iput p1, p0, Ld0/s;->z:F

    const/4 v2, 0x0

    iput v2, p0, Ld0/s;->x:F

    sub-float/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    const-wide/16 v1, 0x1a4

    long-to-float v1, v1

    const-wide/16 v2, 0x28

    long-to-float v2, v2

    mul-float/2addr p1, v2

    add-float/2addr p1, v1

    float-to-long v1, p1

    const-wide/16 v3, 0x168

    cmp-long p1, v1, v3

    if-gez p1, :cond_2

    :goto_0
    move-wide v1, v3

    goto :goto_1

    :cond_2
    const-wide/16 v3, 0x208

    cmp-long p1, v1, v3

    if-lez p1, :cond_3

    goto :goto_0

    :cond_3
    :goto_1
    const/4 p1, 0x2

    new-array p1, p1, [F

    fill-array-data p1, :array_0

    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    invoke-virtual {p1, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object v1, p0, Ld0/s;->E:Landroid/view/animation/PathInterpolator;

    invoke-virtual {p1, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v1, LA0/j;

    invoke-direct {v1, v0, p0}, LA0/j;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    iput-object p1, p0, Ld0/s;->B:Landroid/animation/ValueAnimator;

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final b(Z)V
    .locals 10

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v2, 0x4

    if-ge v1, v2, :cond_6

    iget-object v2, p0, Ld0/s;->t:[Landroid/widget/TextView;

    aget-object v2, v2, v1

    if-nez v2, :cond_0

    goto/16 :goto_5

    :cond_0
    iget v3, p0, Ld0/s;->A:I

    const/4 v4, 0x1

    if-ne v1, v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    iget v5, p0, Ld0/s;->w:F

    int-to-float v6, v1

    sub-float/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v5}, Ljava/lang/Math;->min(FF)F

    move-result v5

    sub-float v5, v6, v5

    if-eqz p1, :cond_3

    if-eqz v3, :cond_2

    move v5, v6

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    goto :goto_2

    :cond_3
    mul-float/2addr v5, v5

    :goto_2
    iget v7, p0, Ld0/s;->i:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iget v8, p0, Ld0/s;->h:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iget-object v9, p0, Ld0/s;->F:Landroid/animation/ArgbEvaluator;

    invoke-virtual {v9, v5, v7, v8}, Landroid/animation/ArgbEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    const-string v8, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {v7, v8}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setTextColor(I)V

    const-string v7, "sans-serif-medium"

    if-nez v3, :cond_5

    const v3, 0x3f0ccccd    # 0.55f

    cmpl-float v3, v5, v3

    if-lez v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-static {v7, v0}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v3

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {v7, v4}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v3

    :goto_4
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const v3, 0x3e8f5c29    # 0.28f

    mul-float/2addr v3, v5

    const v4, 0x3f3851ec    # 0.72f

    add-float/2addr v3, v4

    invoke-virtual {v2, v3}, Landroid/view/View;->setAlpha(F)V

    const v3, 0x3d23d70a    # 0.04f

    mul-float/2addr v3, v5

    add-float/2addr v3, v6

    invoke-virtual {v2, v3}, Landroid/view/View;->setScaleX(F)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setScaleY(F)V

    const v3, 0x3f4ccccd    # 0.8f

    mul-float/2addr v5, v3

    const v3, 0x41533333    # 13.2f

    add-float/2addr v5, v3

    const/4 v3, 0x2

    invoke-virtual {v2, v3, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    :goto_5
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method public final c(F)I
    .locals 1

    iget v0, p0, Ld0/s;->f:F

    mul-float/2addr p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    return p1
.end method

.method public final d(I)V
    .locals 7

    iget-boolean v0, p0, Ld0/s;->c:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ld0/s;->u:[Landroid/widget/TextView;

    aget-object v0, v0, p1

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Ld0/s;->C:[I

    aget v1, v1, p1

    const/4 v2, 0x0

    if-lez v1, :cond_7

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    const/16 p1, 0x63

    if-le v1, p1, :cond_2

    const-string v2, "99+"

    goto :goto_0

    :cond_2
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v2, 0x41800000    # 16.0f

    const/16 v3, 0x9

    if-le v1, p1, :cond_3

    const/high16 p1, 0x41d00000    # 26.0f

    invoke-virtual {p0, p1}, Ld0/s;->c(F)I

    move-result p1

    goto :goto_1

    :cond_3
    if-le v1, v3, :cond_4

    const/high16 p1, 0x41a00000    # 20.0f

    invoke-virtual {p0, p1}, Ld0/s;->c(F)I

    move-result p1

    goto :goto_1

    :cond_4
    invoke-virtual {p0, v2}, Ld0/s;->c(F)I

    move-result p1

    :goto_1
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setMinWidth(I)V

    invoke-virtual {p0, v2}, Ld0/s;->c(F)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setMinHeight(I)V

    const/high16 p1, 0x40800000    # 4.0f

    const/high16 v2, 0x40a00000    # 5.0f

    if-le v1, v3, :cond_5

    invoke-virtual {p0, v2}, Ld0/s;->c(F)I

    move-result v4

    goto :goto_2

    :cond_5
    invoke-virtual {p0, p1}, Ld0/s;->c(F)I

    move-result v4

    :goto_2
    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual {p0, v5}, Ld0/s;->c(F)I

    move-result v6

    if-le v1, v3, :cond_6

    invoke-virtual {p0, v2}, Ld0/s;->c(F)I

    move-result p1

    goto :goto_3

    :cond_6
    invoke-virtual {p0, p1}, Ld0/s;->c(F)I

    move-result p1

    :goto_3
    invoke-virtual {p0, v5}, Ld0/s;->c(F)I

    move-result v1

    invoke-virtual {v0, v4, v6, p1, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    goto :goto_4

    :cond_7
    iget-object v1, p0, Ld0/s;->D:[Z

    aget-boolean p1, v1, p1

    if-eqz p1, :cond_8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    const-string p1, ""

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 p1, 0x41000000    # 8.0f

    invoke-virtual {p0, p1}, Ld0/s;->c(F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMinWidth(I)V

    invoke-virtual {p0, p1}, Ld0/s;->c(F)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setMinHeight(I)V

    invoke-virtual {v0, v2, v2, v2, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    goto :goto_4

    :cond_8
    const/16 p1, 0x8

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    :goto_4
    return-void
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 14

    const-string v0, "canvas"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x42480000    # 50.0f

    iget v4, p0, Ld0/s;->f:F

    mul-float/2addr v3, v4

    add-float/2addr v3, v2

    cmpl-float v5, v1, v0

    if-lez v5, :cond_3

    cmpl-float v5, v3, v2

    if-lez v5, :cond_3

    iget-object v5, p0, Ld0/s;->o:Landroid/graphics/Paint;

    iget-boolean v6, p0, Ld0/s;->g:Z

    if-eqz v6, :cond_0

    const/16 v6, 0x24

    goto :goto_0

    :cond_0
    const/16 v6, 0x12

    :goto_0
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v6, p0, Ld0/s;->s:Landroid/graphics/RectF;

    const v7, 0x3f99999a    # 1.2f

    mul-float/2addr v7, v4

    add-float/2addr v7, v2

    const v8, 0x400ccccd    # 2.2f

    mul-float/2addr v8, v4

    add-float/2addr v8, v3

    invoke-virtual {v6, v0, v7, v1, v8}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {v6}, Landroid/graphics/RectF;->height()F

    move-result v7

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    invoke-virtual {p1, v6, v7, v7, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    iget-object v5, p0, Ld0/s;->p:Landroid/graphics/RectF;

    invoke-virtual {v5, v0, v2, v1, v3}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v6

    div-float/2addr v6, v8

    iget-object v7, p0, Ld0/s;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, v5, v6, v6, v7}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    iget-object v7, p0, Ld0/s;->l:Landroid/graphics/Paint;

    invoke-virtual {p1, v5, v6, v6, v7}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    const/high16 v5, 0x40800000    # 4.0f

    mul-float/2addr v5, v4

    sub-float v6, v1, v0

    const/4 v7, 0x2

    int-to-float v7, v7

    mul-float v9, v5, v7

    sub-float/2addr v6, v9

    const/4 v9, 0x4

    int-to-float v9, v9

    div-float/2addr v6, v9

    const/high16 v9, 0x40600000    # 3.5f

    mul-float/2addr v9, v4

    const/high16 v10, 0x40400000    # 3.0f

    mul-float/2addr v10, v4

    iget v11, p0, Ld0/s;->x:F

    const v12, 0x40490fdb    # (float)Math.PI

    mul-float/2addr v11, v12

    float-to-double v11, v11

    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    move-result-wide v11

    double-to-float v11, v11

    iget v12, p0, Ld0/s;->z:F

    iget v13, p0, Ld0/s;->y:F

    sub-float/2addr v12, v13

    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    move-result v12

    mul-float/2addr v12, v11

    mul-float/2addr v12, v6

    const v11, 0x3e6147ae    # 0.22f

    mul-float/2addr v12, v11

    add-float/2addr v0, v5

    iget v11, p0, Ld0/s;->w:F

    mul-float/2addr v11, v6

    add-float/2addr v11, v0

    div-float v13, v6, v8

    add-float/2addr v13, v11

    mul-float/2addr v10, v7

    sub-float/2addr v6, v10

    div-float/2addr v6, v8

    div-float/2addr v12, v8

    add-float/2addr v12, v6

    sub-float v6, v13, v12

    const/high16 v7, 0x3f800000    # 1.0f

    mul-float v10, v7, v4

    add-float/2addr v0, v10

    cmpg-float v11, v6, v0

    if-gez v11, :cond_1

    move v6, v0

    :cond_1
    add-float/2addr v13, v12

    sub-float/2addr v1, v5

    sub-float/2addr v1, v10

    cmpl-float v0, v13, v1

    if-lez v0, :cond_2

    move v13, v1

    :cond_2
    iget-object v0, p0, Ld0/s;->q:Landroid/graphics/RectF;

    add-float/2addr v2, v9

    sub-float/2addr v3, v9

    invoke-virtual {v0, v6, v2, v13, v3}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v1

    div-float/2addr v1, v8

    iget-object v2, p0, Ld0/s;->m:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    iget-object v1, p0, Ld0/s;->r:Landroid/graphics/RectF;

    iget v2, v0, Landroid/graphics/RectF;->left:F

    add-float/2addr v2, v5

    iget v3, v0, Landroid/graphics/RectF;->top:F

    const/high16 v6, 0x3fc00000    # 1.5f

    mul-float/2addr v6, v4

    add-float/2addr v6, v3

    iget v4, v0, Landroid/graphics/RectF;->right:F

    sub-float/2addr v4, v5

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    const v5, 0x3ec28f5c    # 0.38f

    mul-float/2addr v0, v5

    add-float/2addr v0, v3

    invoke-virtual {v1, v2, v6, v4, v0}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v0

    div-float/2addr v0, v8

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v2

    cmpl-float v2, v2, v7

    if-lez v2, :cond_3

    iget-object v2, p0, Ld0/s;->n:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v0, v0, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :cond_3
    invoke-super {p0, p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public final e(IZ)V
    .locals 2

    iget-boolean v0, p0, Ld0/s;->G:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ld0/s;->f()V

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {p1, v0, v1}, LA0/p;->p(III)I

    move-result p1

    iget v0, p0, Ld0/s;->A:I

    if-ne p1, v0, :cond_1

    iget v0, p0, Ld0/s;->w:F

    int-to-float v1, p1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x3c23d70a    # 0.01f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    return-void

    :cond_1
    iput p1, p0, Ld0/s;->A:I

    if-eqz p2, :cond_2

    int-to-float p1, p1

    invoke-virtual {p0, p1}, Ld0/s;->a(F)V

    goto :goto_0

    :cond_2
    iget-object p2, p0, Ld0/s;->B:Landroid/animation/ValueAnimator;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_3
    int-to-float p1, p1

    iput p1, p0, Ld0/s;->w:F

    iput p1, p0, Ld0/s;->y:F

    iput p1, p0, Ld0/s;->z:F

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Ld0/s;->x:F

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ld0/s;->b(Z)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :goto_0
    return-void
.end method

.method public final f()V
    .locals 5

    iget-boolean v0, p0, Ld0/s;->G:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Ld0/s;->G:Z

    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v2, 0xdc

    invoke-virtual {v0, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v2, Landroid/view/animation/PathInterpolator;

    const/high16 v3, 0x3f800000    # 1.0f

    const v4, 0x3e4ccccd    # 0.2f

    invoke-direct {v2, v4, v1, v4, v3}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    const-string v0, "ev"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final onMeasure(II)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    add-int/2addr v0, p2

    const/high16 p2, 0x42480000    # 50.0f

    invoke-virtual {p0, p2}, Ld0/s;->c(F)I

    move-result p2

    add-int/2addr p2, v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    if-gtz p1, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of v0, p1, Landroid/view/View;

    if-eqz v0, :cond_0

    check-cast p1, Landroid/view/View;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :cond_2
    :goto_1
    if-gtz p1, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getMinimumWidth()I

    move-result v0

    if-ge v0, p1, :cond_4

    invoke-virtual {p0, p1}, Landroid/view/View;->setMinimumWidth(I)V

    :cond_4
    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final setContactDot(Z)V
    .locals 3

    iget-object v0, p0, Ld0/s;->D:[Z

    const/4 v1, 0x1

    aget-boolean v2, v0, v1

    if-ne v2, p1, :cond_0

    return-void

    :cond_0
    aput-boolean p1, v0, v1

    invoke-virtual {p0, v1}, Ld0/s;->d(I)V

    return-void
.end method

.method public final setContactUnread(I)V
    .locals 3

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget-object v0, p0, Ld0/s;->C:[I

    const/4 v1, 0x1

    aget v2, v0, v1

    if-ne v2, p1, :cond_0

    return-void

    :cond_0
    aput p1, v0, v1

    invoke-virtual {p0, v1}, Ld0/s;->d(I)V

    return-void
.end method

.method public final setFriendDot(Z)V
    .locals 3

    iget-object v0, p0, Ld0/s;->D:[Z

    const/4 v1, 0x2

    aget-boolean v2, v0, v1

    if-ne v2, p1, :cond_0

    return-void

    :cond_0
    aput-boolean p1, v0, v1

    invoke-virtual {p0, v1}, Ld0/s;->d(I)V

    return-void
.end method

.method public final setFriendUnread(I)V
    .locals 3

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget-object v0, p0, Ld0/s;->C:[I

    const/4 v1, 0x2

    aget v2, v0, v1

    if-ne v2, p1, :cond_0

    return-void

    :cond_0
    aput p1, v0, v1

    invoke-virtual {p0, v1}, Ld0/s;->d(I)V

    return-void
.end method

.method public final setMainUnread(I)V
    .locals 3

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget-object v1, p0, Ld0/s;->C:[I

    aget v2, v1, v0

    if-ne v2, p1, :cond_0

    return-void

    :cond_0
    aput p1, v1, v0

    invoke-virtual {p0, v0}, Ld0/s;->d(I)V

    return-void
.end method

.method public final setScrollProgress(F)V
    .locals 2

    iget-object v0, p0, Ld0/s;->B:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    const/4 v0, 0x0

    const/high16 v1, 0x40400000    # 3.0f

    invoke-static {p1, v0, v1}, LA0/p;->o(FFF)F

    move-result p1

    iput p1, p0, Ld0/s;->w:F

    iput p1, p0, Ld0/s;->y:F

    iput p1, p0, Ld0/s;->z:F

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Ld0/s;->x:F

    invoke-static {p1}, LA0/p;->P(F)I

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {p1, v0, v1}, LA0/p;->p(III)I

    move-result p1

    iget v0, p0, Ld0/s;->A:I

    if-eq p1, v0, :cond_1

    iput p1, p0, Ld0/s;->A:I

    :cond_1
    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ld0/s;->b(Z)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
