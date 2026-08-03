.class public final LVA;
.super Landroidx/recyclerview/widget/g;
.source ""


# instance fields
.field public a:Ljava/util/ArrayList;


# virtual methods
.method public final getItemCount()I
    .locals 1

    iget-object v0, p0, LVA;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final onBindViewHolder(Landroidx/recyclerview/widget/o;I)V
    .locals 6

    check-cast p1, LUA;

    const-wide v0, -0x1bc3bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LUA;->a:LTA;

    iget-object v0, p0, LVA;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/github/cherrywechat/network/model/ThemeStoreItem;

    iget-object v0, p1, LTA;->a:Landroid/widget/ImageView;

    const-wide v1, -0x1bc01fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, p1, LTA;->b:Landroid/widget/TextView;

    invoke-virtual {p2}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p1, LTA;->c:Landroid/widget/TextView;

    invoke-virtual {p2}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getAuthor()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p1, LTA;->d:Landroid/widget/TextView;

    invoke-virtual {p2}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getPrice()D

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    if-lez v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "\u00a5"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getPrice()D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const-wide v2, -0x1bc06fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v0}, Lcom/bumptech/glide/a;->d(Landroid/view/View;)Lgw;

    move-result-object v1

    invoke-virtual {p2}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getCoverImage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lgw;->n(Ljava/lang/String;)Law;

    move-result-object v1

    invoke-virtual {v1}, Ly5;->b()Ly5;

    move-result-object v1

    check-cast v1, Law;

    invoke-virtual {v1}, Ly5;->k()Ly5;

    move-result-object v1

    check-cast v1, Law;

    const v2, 0x5508010e

    invoke-virtual {v1, v2}, Ly5;->f(I)Ly5;

    move-result-object v1

    check-cast v1, Law;

    invoke-virtual {v1, v0}, Law;->A(Landroid/widget/ImageView;)V

    new-instance v0, Ll5;

    const/16 v1, 0x14

    invoke-direct {v0, v1, p1, p2}, Ll5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o;
    .locals 3

    const-wide v0, -0x1bc24fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance p2, LUA;

    new-instance v0, LTA;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v1, -0x1bc2bfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {v0, p1}, LTA;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, LUA;-><init>(LTA;)V

    return-object p2
.end method
