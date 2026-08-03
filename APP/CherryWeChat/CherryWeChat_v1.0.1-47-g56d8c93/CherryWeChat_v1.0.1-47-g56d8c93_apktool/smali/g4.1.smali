.class public final Lg4;
.super LNj;
.source ""


# instance fields
.field public final synthetic j:I

.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/ref/WeakReference;

.field public final synthetic m:Ll4;


# direct methods
.method public constructor <init>(Ll4;IILjava/lang/ref/WeakReference;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg4;->m:Ll4;

    iput p2, p0, Lg4;->j:I

    iput p3, p0, Lg4;->k:I

    iput-object p4, p0, Lg4;->l:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final I(I)V
    .locals 0

    return-void
.end method

.method public final J(Landroid/graphics/Typeface;)V
    .locals 3

    const/4 v0, -0x1

    iget v1, p0, Lg4;->j:I

    if-eq v1, v0, :cond_1

    iget v0, p0, Lg4;->k:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p1, v1, v0}, Lk4;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    :cond_1
    iget-object v0, p0, Lg4;->m:Ll4;

    iget-boolean v1, v0, Ll4;->m:Z

    if-eqz v1, :cond_3

    iput-object p1, v0, Ll4;->l:Landroid/graphics/Typeface;

    iget-object v1, p0, Lg4;->l:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v2

    if-eqz v2, :cond_2

    iget v0, v0, Ll4;->j:I

    new-instance v2, Lh4;

    invoke-direct {v2, v1, p1, v0}, Lh4;-><init>(Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_2
    iget v0, v0, Ll4;->j:I

    invoke-virtual {v1, p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_3
    return-void
.end method
