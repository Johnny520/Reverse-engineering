.class public final LQA;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LDE;


# instance fields
.field public final synthetic a:Landroid/widget/TextView;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:LFE;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Ljava/util/List;LFE;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQA;->a:Landroid/widget/TextView;

    iput-object p2, p0, LQA;->b:Ljava/util/List;

    iput-object p3, p0, LQA;->c:LFE;

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v1, p1, 0x1

    const-wide v2, -0x1bfb3fffff835L

    invoke-static {v0, v1, v2, v3}, LEy;->p(Ljava/lang/StringBuilder;IJ)V

    iget-object v2, p0, LQA;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, LQA;->a:Landroid/widget/TextView;

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    add-int/lit8 p1, p1, -0x1

    const/high16 v0, 0x40000000    # 2.0f

    iget-object v3, p0, LQA;->c:LFE;

    if-ltz p1, :cond_1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v5, -0x1bfb7fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object p1

    check-cast p1, LOA;

    if-eqz p1, :cond_1

    iget v4, p1, LOA;->e:F

    iget v5, p1, LOA;->f:F

    cmpg-float v4, v4, v5

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    iget v4, p1, LOA;->k:I

    int-to-float v4, v4

    div-float/2addr v4, v0

    iget v6, p1, LOA;->l:I

    int-to-float v6, v6

    div-float/2addr v6, v0

    invoke-virtual {p1, v5, v4, v6}, LOA;->a(FFF)V

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v1, p1, :cond_3

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, -0x1bfbefffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object p1

    check-cast p1, LOA;

    if-eqz p1, :cond_3

    iget v1, p1, LOA;->e:F

    iget v2, p1, LOA;->f:F

    cmpg-float v1, v1, v2

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    iget v1, p1, LOA;->k:I

    int-to-float v1, v1

    div-float/2addr v1, v0

    iget v3, p1, LOA;->l:I

    int-to-float v3, v3

    div-float/2addr v3, v0

    invoke-virtual {p1, v2, v1, v3}, LOA;->a(FFF)V

    :cond_3
    :goto_1
    return-void
.end method
