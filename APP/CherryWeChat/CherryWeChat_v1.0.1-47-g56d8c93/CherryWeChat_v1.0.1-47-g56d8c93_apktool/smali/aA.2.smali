.class public final LaA;
.super Landroid/widget/FrameLayout;
.source ""


# instance fields
.field public a:Ljava/lang/String;

.field public final b:LXz;

.field public final c:Landroid/widget/TextView;

.field public final d:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    const-wide v0, -0x1c036fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 v0, 0x32

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v1

    invoke-virtual {p0, v1}, Landroid/view/View;->setMinimumHeight(I)V

    new-instance v1, LXz;

    invoke-direct {v1, p1}, LXz;-><init>(Landroid/content/Context;)V

    new-instance v2, Ls;

    const/4 v3, 0x7

    invoke-direct {v2, v3, p0}, Ls;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v2}, LXz;->setOnCheckedChangeListener(Lfj;)V

    iput-object v1, p0, LaA;->b:LXz;

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v3, 0x28

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    const/16 v4, 0x19

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-direct {v2, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const v3, 0x1020006

    invoke-virtual {p0, v3}, Landroid/view/View;->setId(I)V

    const v3, 0x800015

    iput v3, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {p0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v3, -0x2

    invoke-direct {v2, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const v3, 0x800013

    iput v3, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v0

    iput v0, v2, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const/high16 v2, 0x41800000    # 16.0f

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    const v2, 0x550603f9

    invoke-virtual {p1, v2}, Landroid/content/Context;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iput-object v0, p0, LaA;->c:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const/high16 v2, 0x41600000    # 14.0f

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    const v2, 0x550603f7

    invoke-virtual {p1, v2}, Landroid/content/Context;->getColor(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    iput-object v0, p0, LaA;->d:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final getKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LaA;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final setChecked(Z)V
    .locals 1

    iget-object v0, p0, LaA;->b:LXz;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LXz;->setChecked(Z)V

    :cond_0
    return-void
.end method

.method public final setKey(Ljava/lang/String;)V
    .locals 2

    const-wide v0, -0x1c03efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iput-object p1, p0, LaA;->a:Ljava/lang/String;

    return-void
.end method

.method public final setOnCheckedChangeListener(Lfj;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj;",
            ")V"
        }
    .end annotation

    const-wide v0, -0x1c0d0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, p0, LaA;->b:LXz;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LXz;->setOnCheckedChangeListener(Lfj;)V

    :cond_0
    return-void
.end method

.method public final setSummary(Ljava/lang/String;)V
    .locals 2

    const-wide v0, -0x1c0c8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, p0, LaA;->d:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 2

    const-wide v0, -0x1c0c2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, p0, LaA;->c:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method
