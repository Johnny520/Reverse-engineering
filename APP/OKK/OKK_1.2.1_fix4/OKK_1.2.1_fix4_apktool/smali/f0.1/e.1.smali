.class public final Lf0/e;
.super Landroid/app/Dialog;
.source "SourceFile"


# instance fields
.field public final a:Landroid/app/Activity;

.field public final b:I

.field public c:Landroid/widget/TextView;

.field public d:Landroid/widget/TextView;

.field public e:Landroid/widget/TextView;

.field public f:Landroid/widget/ProgressBar;


# direct methods
.method public constructor <init>(Landroid/app/Activity;I)V
    .locals 1

    const-string v0, "host"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x1030135

    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object p1, p0, Lf0/e;->a:Landroid/app/Activity;

    iput p2, p0, Lf0/e;->b:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :cond_0
    :goto_0
    return-void
.end method

.method public final b(I)I
    .locals 1

    int-to-float p1, p1

    iget-object v0, p0, Lf0/e;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    return p1
.end method

.method public final c(Ljava/lang/String;IZI)Landroid/widget/TextView;
    .locals 2

    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, Lf0/e;->a:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p1, 0x2

    int-to-float p2, p2

    invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    invoke-virtual {v0, p4}, Landroid/widget/TextView;->setTextColor(I)V

    if-eqz p3, :cond_0

    sget-object p1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_0
    return-object v0
.end method

.method public final d(IILjava/lang/String;)V
    .locals 5

    const-string v0, "\u6b63\u5728\u68c0\u67e5\uff1a"

    const-string v1, "title"

    invoke-static {p3, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v1, p0, Lf0/e;->f:Landroid/widget/ProgressBar;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    const-string v3, "bar"

    if-eqz v1, :cond_5

    const/4 v4, 0x1

    if-ge p2, v4, :cond_1

    goto :goto_0

    :cond_1
    move v4, p2

    :goto_0
    :try_start_1
    invoke-virtual {v1, v4}, Landroid/widget/ProgressBar;->setMax(I)V

    iget-object v1, p0, Lf0/e;->f:Landroid/widget/ProgressBar;

    if-eqz v1, :cond_4

    const/4 v3, 0x0

    invoke-static {p1, v3, p2}, LA0/p;->p(III)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/ProgressBar;->setProgress(I)V

    iget-object v1, p0, Lf0/e;->e:Landroid/widget/TextView;

    if-eqz v1, :cond_3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " / "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lf0/e;->d:Landroid/widget/TextView;

    if-eqz p1, :cond_2

    invoke-virtual {v0, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    const-string p1, "tvCurrent"

    invoke-static {p1}, LQ0/g;->g(Ljava/lang/String;)V

    throw v2

    :cond_3
    const-string p1, "tvCount"

    invoke-static {p1}, LQ0/g;->g(Ljava/lang/String;)V

    throw v2

    :cond_4
    invoke-static {v3}, LQ0/g;->g(Ljava/lang/String;)V

    throw v2

    :cond_5
    invoke-static {v3}, LQ0/g;->g(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-static {p1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_2
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 9

    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    const/16 v0, 0x14

    invoke-virtual {p0, v0}, Lf0/e;->b(I)I

    move-result v0

    new-instance v1, Landroid/widget/LinearLayout;

    iget-object v2, p0, Lf0/e;->a:Landroid/app/Activity;

    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v1, v0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/16 v4, 0x10

    invoke-virtual {p0, v4}, Lf0/e;->b(I)I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    const-string v4, "#F7F8FA"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const-string v0, "#1A1A1A"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    const-string v4, "\u529f\u80fd\u9002\u914d\u68c0\u67e5"

    const/16 v5, 0x11

    invoke-virtual {p0, v4, v5, v3, v0}, Lf0/e;->c(Ljava/lang/String;IZI)Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lf0/e;->c:Landroid/widget/TextView;

    const-string v0, "#444444"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    const-string v4, "\u51c6\u5907\u4e2d\u2026"

    const/16 v5, 0xd

    invoke-virtual {p0, v4, v5, p1, v0}, Lf0/e;->c(Ljava/lang/String;IZI)Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lf0/e;->d:Landroid/widget/TextView;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "0 / "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Lf0/e;->b:I

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v5, "#336940"

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    const/16 v6, 0xe

    invoke-virtual {p0, v0, v6, v3, v5}, Lf0/e;->c(Ljava/lang/String;IZI)Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lf0/e;->e:Landroid/widget/TextView;

    new-instance v0, Landroid/widget/ProgressBar;

    const/4 v5, 0x0

    const v6, 0x1010078

    invoke-direct {v0, v2, v5, v6}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    if-ge v4, v3, :cond_0

    move v4, v3

    :cond_0
    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setMax(I)V

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v6, 0x8

    invoke-virtual {p0, v6}, Lf0/e;->b(I)I

    move-result v7

    const/4 v8, -0x1

    invoke-direct {v4, v8, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v7, 0xc

    invoke-virtual {p0, v7}, Lf0/e;->b(I)I

    move-result v7

    iput v7, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-virtual {p0, v6}, Lf0/e;->b(I)I

    move-result v7

    iput v7, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iput-object v0, p0, Lf0/e;->f:Landroid/widget/ProgressBar;

    iget-object v0, p0, Lf0/e;->c:Landroid/widget/TextView;

    if-eqz v0, :cond_5

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v0, Landroid/view/View;

    invoke-direct {v0, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {p0, v6}, Lf0/e;->b(I)I

    move-result v6

    invoke-direct {v4, v3, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lf0/e;->e:Landroid/widget/TextView;

    if-eqz v0, :cond_4

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lf0/e;->f:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_3

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lf0/e;->d:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v0, Landroid/view/View;

    invoke-direct {v0, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v5, 0x4

    invoke-virtual {p0, v5}, Lf0/e;->b(I)I

    move-result v5

    invoke-direct {v4, v3, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v0, "#888888"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    const-string v3, "\u6b63\u5728\u68c0\u6d4b\u5404\u529f\u80fd\u5728\u5f53\u524d\u5fae\u4fe1\u4e0a\u7684\u9002\u914d\u70b9\u2026"

    const/16 v4, 0xb

    invoke-virtual {p0, v3, v4, p1, v0}, Lf0/e;->c(Ljava/lang/String;IZI)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance p1, Landroid/widget/FrameLayout;

    invoke-direct {p1, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/16 v0, 0x1c

    invoke-virtual {p0, v0}, Lf0/e;->b(I)I

    move-result v2

    invoke-virtual {p0, v0}, Lf0/e;->b(I)I

    move-result v3

    invoke-virtual {p0, v0}, Lf0/e;->b(I)I

    move-result v4

    invoke-virtual {p0, v0}, Lf0/e;->b(I)I

    move-result v0

    invoke-virtual {p1, v2, v3, v4, v0}, Landroid/view/View;->setPadding(IIII)V

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_1

    const v0, 0x106000d

    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    :cond_1
    return-void

    :cond_2
    const-string p1, "tvCurrent"

    invoke-static {p1}, LQ0/g;->g(Ljava/lang/String;)V

    throw v5

    :cond_3
    const-string p1, "bar"

    invoke-static {p1}, LQ0/g;->g(Ljava/lang/String;)V

    throw v5

    :cond_4
    const-string p1, "tvCount"

    invoke-static {p1}, LQ0/g;->g(Ljava/lang/String;)V

    throw v5

    :cond_5
    const-string p1, "tvTitle"

    invoke-static {p1}, LQ0/g;->g(Ljava/lang/String;)V

    throw v5
.end method
