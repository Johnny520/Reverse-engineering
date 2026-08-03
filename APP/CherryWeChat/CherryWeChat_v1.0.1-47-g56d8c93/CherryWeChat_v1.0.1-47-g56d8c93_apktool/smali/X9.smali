.class public final LX9;
.super LOz;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic e:Lqe;

.field public final synthetic f:Landroid/view/View;

.field public final synthetic g:LBA;

.field public final synthetic h:LDA;

.field public final synthetic i:Lca;


# direct methods
.method public constructor <init>(Lca;LEb;Lqe;LBA;LDA;Landroid/view/View;)V
    .locals 0

    iput-object p3, p0, LX9;->e:Lqe;

    iput-object p6, p0, LX9;->f:Landroid/view/View;

    iput-object p4, p0, LX9;->g:LBA;

    iput-object p5, p0, LX9;->h:LDA;

    iput-object p1, p0, LX9;->i:Lca;

    invoke-direct {p0, p2}, LOz;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfc;

    check-cast p2, LEb;

    invoke-virtual {p0, p2, p1}, LX9;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LX9;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LX9;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final h(LEb;Ljava/lang/Object;)LEb;
    .locals 7

    new-instance v0, LX9;

    iget-object v5, p0, LX9;->h:LDA;

    iget-object v1, p0, LX9;->i:Lca;

    iget-object v3, p0, LX9;->e:Lqe;

    iget-object v4, p0, LX9;->g:LBA;

    iget-object v6, p0, LX9;->f:Landroid/view/View;

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, LX9;-><init>(Lca;LEb;Lqe;LBA;LDA;Landroid/view/View;)V

    return-object v0
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    const/16 p1, 0x64

    iget-object v0, p0, LX9;->e:Lqe;

    invoke-virtual {v0, p1}, Lqe;->b(I)V

    new-instance p1, Loe;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, Loe;-><init>(Lqe;I)V

    invoke-static {p1}, LbA;->a(Ljava/lang/Runnable;)V

    iget-object p1, p0, LX9;->f:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x5f27fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LX9;->g:LBA;

    iget-object v1, v1, LBA;->b:Ljava/lang/String;

    const-wide v2, -0x5f2bfffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget-object v1, p0, LX9;->h:LDA;

    iget-object v1, v1, LDA;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v1, -0x5f2efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    iget-object p1, p0, LX9;->i:Lca;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/g;->notifyDataSetChanged()V

    sget-object p1, LTC;->a:LTC;

    return-object p1
.end method
