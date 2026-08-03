.class public final synthetic LU9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Ljava/io/File;

.field public final synthetic b:LDA;

.field public final synthetic c:Lqe;

.field public final synthetic d:Lca;

.field public final synthetic e:Lba;

.field public final synthetic f:LBA;


# direct methods
.method public synthetic constructor <init>(Ljava/io/File;LDA;Lqe;Lca;Lba;LBA;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU9;->a:Ljava/io/File;

    iput-object p2, p0, LU9;->b:LDA;

    iput-object p3, p0, LU9;->c:Lqe;

    iput-object p4, p0, LU9;->d:Lca;

    iput-object p5, p0, LU9;->e:Lba;

    iput-object p6, p0, LU9;->f:LBA;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 13

    iget-object v5, p0, LU9;->b:LDA;

    iget-object v0, v5, LDA;->a:Ljava/lang/String;

    iget-object v1, p0, LU9;->a:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    iget-object v3, p0, LU9;->c:Lqe;

    move-object v4, v1

    iget-object v1, p0, LU9;->d:Lca;

    move-object v6, v4

    iget-object v4, p0, LU9;->f:LBA;

    const/4 v7, 0x0

    if-eqz v2, :cond_7

    sget-object p1, LEA;->a:LEA;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v0, -0x5df1fffff835L

    invoke-static {v0, v1, p1, v7}, LEy;->k(JLandroid/content/Context;I)V

    return-void

    :cond_0
    invoke-virtual {v6}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    array-length v8, v2

    move v9, v7

    :goto_1
    if-ge v9, v8, :cond_2

    aget-object v10, v2, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_2
    iget-object v8, p0, LU9;->e:Lba;

    if-eqz v2, :cond_5

    array-length v9, v2

    move v10, v7

    :goto_2
    if-ge v10, v9, :cond_5

    aget-object v11, v2, v10

    invoke-virtual {v11}, Ljava/io/File;->isDirectory()Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_4

    :try_start_0
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v9, -0x5dfdfffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v5, LDA;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v4, -0x5d83fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    invoke-virtual {v8}, Landroidx/recyclerview/widget/o;->getAdapterPosition()I

    move-result p1

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/g;->notifyItemChanged(I)V

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v0, -0x5d88fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    :cond_4
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_5
    if-eqz p1, :cond_6

    invoke-static {p1}, Lwh;->b0(Ljava/io/File;)Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_6

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v5, -0x5d91fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v4, LBA;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v4, -0x5d95fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    invoke-virtual {v8}, Landroidx/recyclerview/widget/o;->getAdapterPosition()I

    move-result p1

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/g;->notifyItemChanged(I)V

    return-void

    :cond_6
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v0, -0x5d9afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_3
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x5da1fffff835L

    invoke-static {v2, v3, v1, p1}, LEy;->c(JLjava/lang/StringBuilder;Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    :cond_7
    sget-object v0, LEA;->a:LEA;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->h()Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v0, -0x5daafffff835L

    invoke-static {v0, v1, p1, v7}, LEy;->k(JLandroid/content/Context;I)V

    return-void

    :cond_8
    new-instance v0, Loe;

    invoke-direct {v0, v3, v7}, Loe;-><init>(Lqe;I)V

    invoke-static {v0}, LbA;->a(Ljava/lang/Runnable;)V

    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LVc;->b:LVc;

    invoke-static {v0}, LPj;->a(Lac;)LCb;

    move-result-object v7

    new-instance v0, Laa;

    const/4 v2, 0x0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Laa;-><init>(Lca;LEb;Lqe;LBA;LDA;Landroid/view/View;)V

    const/4 p1, 0x3

    invoke-static {v7, v0, p1}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    return-void
.end method
