.class public final LJA;
.super Landroidx/recyclerview/widget/g;
.source ""


# instance fields
.field public final a:Ljava/util/List;

.field public final b:I

.field public final c:I

.field public final synthetic d:LSA;


# direct methods
.method public constructor <init>(LSA;Ljava/util/List;)V
    .locals 2

    const-wide v0, -0x1bf80fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iput-object p1, p0, LJA;->d:LSA;

    invoke-direct {p0}, Landroidx/recyclerview/widget/g;-><init>()V

    iput-object p2, p0, LJA;->a:Ljava/util/List;

    const/16 p1, 0x82

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, LGu;->i(Ljava/lang/Number;)I

    move-result p1

    iput p1, p0, LJA;->b:I

    const/16 p1, 0x12c

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, LGu;->i(Ljava/lang/Number;)I

    move-result p1

    iput p1, p0, LJA;->c:I

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    iget-object v0, p0, LJA;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final onBindViewHolder(Landroidx/recyclerview/widget/o;I)V
    .locals 6

    check-cast p1, LKA;

    const-wide v0, -0x1bf8cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, p0, LJA;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p1, LKA;->b:Landroid/widget/ImageView;

    invoke-static {v1}, Lcom/bumptech/glide/a;->d(Landroid/view/View;)Lgw;

    move-result-object v2

    invoke-virtual {v2, v0}, Lgw;->n(Ljava/lang/String;)Law;

    move-result-object v0

    new-instance v2, Lmw;

    invoke-direct {v2}, Ly5;-><init>()V

    sget-object v3, Lre;->b:Lre;

    new-instance v4, Lzh;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    const/4 v5, 0x1

    invoke-virtual {v2, v3, v4, v5}, Ly5;->m(Lre;LP5;Z)Ly5;

    move-result-object v2

    check-cast v2, Lmw;

    invoke-virtual {v2}, Ly5;->k()Ly5;

    move-result-object v2

    check-cast v2, Lmw;

    const v3, 0x5508010e

    invoke-virtual {v2, v3}, Ly5;->f(I)Ly5;

    move-result-object v2

    invoke-virtual {v0, v2}, Law;->w(Ly5;)Law;

    move-result-object v0

    new-instance v2, Lgk;

    const/4 v3, 0x2

    invoke-direct {v2, v3, p1}, Lgk;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Law;->B(Lgk;)Law;

    move-result-object v0

    invoke-virtual {v0, v1}, Law;->A(Landroid/widget/ImageView;)V

    iget-object v0, p1, LKA;->a:Landroid/widget/FrameLayout;

    new-instance v1, LV7;

    iget-object v2, p0, LJA;->d:LSA;

    invoke-direct {v1, p2, p0, p1, v2}, LV7;-><init>(ILJA;LKA;LSA;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o;
    .locals 5

    const-wide v0, -0x1bf85fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance p2, Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Lqv;

    iget v1, p0, LJA;->b:I

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Lqv;-><init>(II)V

    const/16 v1, 0xc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    iput v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const v4, 0x55060040

    invoke-virtual {v3, v4}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v1

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v0

    invoke-virtual {p2, v1, v3, v4, v0}, Landroid/view/View;->setPadding(IIII)V

    new-instance v0, Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {p1, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget-object p1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setAdjustViewBounds(Z)V

    iget v1, p0, LJA;->c:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setMaxHeight(I)V

    new-instance v1, Lk;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lk;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setClipToOutline(Z)V

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance p1, LKA;

    invoke-direct {p1, p2, v0}, LKA;-><init>(Landroid/widget/FrameLayout;Landroid/widget/ImageView;)V

    return-object p1
.end method
