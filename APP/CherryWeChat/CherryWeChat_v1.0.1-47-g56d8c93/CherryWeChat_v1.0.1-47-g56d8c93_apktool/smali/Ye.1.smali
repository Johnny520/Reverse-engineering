.class public final LYe;
.super Landroid/database/ContentObserver;
.source ""


# static fields
.field public static final synthetic d:I


# instance fields
.field public a:Ljava/util/ArrayList;

.field public b:Landroid/app/Application;

.field public c:Ljava/lang/Boolean;


# virtual methods
.method public final onChange(Z)V
    .locals 7

    invoke-super {p0, p1}, Landroid/database/ContentObserver;->onChange(Z)V

    iget-object p1, p0, LYe;->b:Landroid/app/Application;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    if-eqz p1, :cond_7

    iget-object p1, p0, LYe;->a:Ljava/util/ArrayList;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, p0, LYe;->b:Landroid/app/Application;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    const-string v0, "navigationbar_is_min"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p1

    iget-object v0, p0, LYe;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/gyf/immersionbar/a;

    if-nez p1, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    iget-object v4, v2, Lcom/gyf/immersionbar/a;->c:Landroid/view/ViewGroup;

    const v5, 0x550a0127

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_0

    new-instance v5, Ln5;

    iget-object v6, v2, Lcom/gyf/immersionbar/a;->a:Landroid/app/Activity;

    invoke-direct {v5, v6}, Ln5;-><init>(Landroid/app/Activity;)V

    iput-object v5, v2, Lcom/gyf/immersionbar/a;->i:Ln5;

    iget-object v5, v2, Lcom/gyf/immersionbar/a;->d:Landroid/view/ViewGroup;

    invoke-virtual {v5}, Landroid/view/View;->getPaddingBottom()I

    iget-object v5, v2, Lcom/gyf/immersionbar/a;->d:Landroid/view/ViewGroup;

    invoke-virtual {v5}, Landroid/view/View;->getPaddingRight()I

    if-nez v3, :cond_2

    const/16 v3, 0x8

    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_2
    move v5, v1

    move v6, v5

    goto :goto_4

    :cond_2
    invoke-virtual {v4, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v3, v2, Lcom/gyf/immersionbar/a;->c:Landroid/view/ViewGroup;

    const v5, 0x1020002

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Lcom/gyf/immersionbar/a;->a(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_2

    :cond_3
    iget v3, v2, Lcom/gyf/immersionbar/a;->j:I

    if-nez v3, :cond_4

    iget-object v3, v2, Lcom/gyf/immersionbar/a;->i:Ln5;

    iget v3, v3, Ln5;->d:I

    iput v3, v2, Lcom/gyf/immersionbar/a;->j:I

    :cond_4
    iget v3, v2, Lcom/gyf/immersionbar/a;->k:I

    if-nez v3, :cond_5

    iget-object v3, v2, Lcom/gyf/immersionbar/a;->i:Ln5;

    iget v3, v3, Ln5;->e:I

    iput v3, v2, Lcom/gyf/immersionbar/a;->k:I

    :cond_5
    iget-object v3, v2, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v5, v2, Lcom/gyf/immersionbar/a;->i:Ln5;

    invoke-virtual {v5}, Ln5;->c()Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x50

    iput v5, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    iget v5, v2, Lcom/gyf/immersionbar/a;->j:I

    iput v5, v3, Landroid/widget/FrameLayout$LayoutParams;->height:I

    iget-object v5, v2, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v5, v2, Lcom/gyf/immersionbar/a;->j:I

    move v6, v1

    goto :goto_3

    :cond_6
    const v5, 0x800005

    iput v5, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    iget v5, v2, Lcom/gyf/immersionbar/a;->k:I

    iput v5, v3, Landroid/widget/FrameLayout$LayoutParams;->width:I

    iget-object v5, v2, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v5, v2, Lcom/gyf/immersionbar/a;->k:I

    move v6, v5

    move v5, v1

    :goto_3
    invoke-virtual {v4, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :goto_4
    iget-object v3, v2, Lcom/gyf/immersionbar/a;->d:Landroid/view/ViewGroup;

    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    invoke-virtual {v2, v3, v6, v5}, Lcom/gyf/immersionbar/a;->g(III)V

    goto/16 :goto_0

    :cond_7
    return-void
.end method
