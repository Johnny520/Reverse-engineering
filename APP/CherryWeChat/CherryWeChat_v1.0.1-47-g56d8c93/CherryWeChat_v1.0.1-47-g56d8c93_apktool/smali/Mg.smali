.class public final LMg;
.super LOz;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic e:Lqe;

.field public final synthetic f:LOg;

.field public final synthetic g:LEC;

.field public final synthetic h:LDA;


# direct methods
.method public constructor <init>(LEb;Lqe;LOg;LDA;LEC;)V
    .locals 0

    iput-object p2, p0, LMg;->e:Lqe;

    iput-object p3, p0, LMg;->f:LOg;

    iput-object p5, p0, LMg;->g:LEC;

    iput-object p4, p0, LMg;->h:LDA;

    invoke-direct {p0, p1}, LOz;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfc;

    check-cast p2, LEb;

    invoke-virtual {p0, p2, p1}, LMg;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LMg;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LMg;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final h(LEb;Ljava/lang/Object;)LEb;
    .locals 6

    new-instance v0, LMg;

    iget-object v5, p0, LMg;->g:LEC;

    iget-object v4, p0, LMg;->h:LDA;

    iget-object v2, p0, LMg;->e:Lqe;

    iget-object v3, p0, LMg;->f:LOg;

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, LMg;-><init>(LEb;Lqe;LOg;LDA;LEC;)V

    return-object v0
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    new-instance p1, Loe;

    const/4 v0, 0x1

    iget-object v1, p0, LMg;->e:Lqe;

    invoke-direct {p1, v1, v0}, Loe;-><init>(Lqe;I)V

    invoke-static {p1}, LbA;->a(Ljava/lang/Runnable;)V

    iget-object p1, p0, LMg;->f:LOg;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-wide v1, -0x5b6afffff835L

    const/4 v3, 0x0

    invoke-static {v1, v2, v0, v3}, LEy;->k(JLandroid/content/Context;I)V

    iget-object v0, p1, LOg;->a:Lca;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/g;->notifyDataSetChanged()V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-wide v1, -0x5b73fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x5b03fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, -0x5b08fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, LMg;->g:LEC;

    iget-object v5, v4, LEC;->c:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x20

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v5, p0, LMg;->h:LDA;

    iget-object v6, v5, LDA;->b:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v6, -0x5b0efffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v6, LKb;

    invoke-direct {v6, p1, v5, v4}, LKb;-><init>(LOg;LDA;LEC;)V

    invoke-static {v0, v1, v2, v6, v3}, Lgf;->S(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Z)V

    sget-object p1, LTC;->a:LTC;

    return-object p1
.end method
