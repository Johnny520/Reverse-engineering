.class public final synthetic Ld0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Landroid/widget/LinearLayout;

.field public final synthetic d:Lc0/E0;

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:F

.field public final synthetic j:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Landroid/app/Activity;Landroid/widget/LinearLayout;Lc0/E0;IIIZFLandroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/i;->a:Ljava/util/List;

    iput-object p2, p0, Ld0/i;->b:Landroid/app/Activity;

    iput-object p3, p0, Ld0/i;->c:Landroid/widget/LinearLayout;

    iput-object p4, p0, Ld0/i;->d:Lc0/E0;

    iput p5, p0, Ld0/i;->e:I

    iput p6, p0, Ld0/i;->f:I

    iput p7, p0, Ld0/i;->g:I

    iput-boolean p8, p0, Ld0/i;->h:Z

    iput p9, p0, Ld0/i;->i:F

    iput-object p10, p0, Ld0/i;->j:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 12

    iget-object p1, p0, Ld0/i;->a:Ljava/util/List;

    const-string v0, "$selected"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld0/i;->b:Landroid/app/Activity;

    const-string v1, "$activity"

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, p0, Ld0/i;->c:Landroid/widget/LinearLayout;

    const-string v1, "$row"

    invoke-static {v7, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Ld0/i;->d:Lc0/E0;

    const-string v2, "$s"

    invoke-static {v1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, p0, Ld0/i;->j:Landroid/widget/TextView;

    const-string v2, "$countTv"

    invoke-static {v9, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    iget v4, p0, Ld0/i;->e:I

    iget v5, p0, Ld0/i;->f:I

    iget v6, p0, Ld0/i;->g:I

    iget-boolean v8, p0, Ld0/i;->h:Z

    iget v10, p0, Ld0/i;->i:F

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lc0/E0;

    if-ne v11, v1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v11, 0x1

    if-gt v2, v11, :cond_2

    const-string p1, "\u81f3\u5c11\u4fdd\u7559 1 \u4e2a\u5feb\u6377"

    invoke-static {v0, p1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_2

    :cond_2
    new-instance v0, Lc0/H;

    const/4 v2, 0x4

    invoke-direct {v0, v2, v1}, Lc0/H;-><init>(ILjava/lang/Object;)V

    invoke-static {p1, v0}, LE0/s;->n0(Ljava/util/List;LP0/l;)V

    const/4 v0, 0x0

    move v2, v4

    move v3, v5

    move v4, v6

    move v5, v8

    move v6, v10

    move v8, v0

    invoke-static/range {v2 .. v8}, LU/S;->q0(IIIZFLandroid/widget/LinearLayout;Z)V

    goto :goto_1

    :cond_3
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v11, 0x3

    if-lt v2, v11, :cond_4

    const-string p1, "\u6700\u591a\u9009 3 \u4e2a"

    invoke-static {v0, p1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_2

    :cond_4
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    move v2, v4

    move v3, v5

    move v4, v6

    move v5, v8

    move v6, v10

    move v8, v0

    invoke-static/range {v2 .. v8}, LU/S;->q0(IIIZFLandroid/widget/LinearLayout;Z)V

    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\u5df2\u9009 "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "/3 \u00b7 \u70b9\u9009\u5207\u6362"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v9, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_2
    return-void
.end method
