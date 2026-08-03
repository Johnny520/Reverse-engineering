.class public final synthetic Lck;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lhk;

.field public final synthetic c:LEC;


# direct methods
.method public synthetic constructor <init>(LEC;Lhk;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lck;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lck;->c:LEC;

    iput-object p2, p0, Lck;->b:Lhk;

    return-void
.end method

.method public synthetic constructor <init>(Lhk;LEC;I)V
    .locals 0

    .line 1
    iput p3, p0, Lck;->a:I

    iput-object p1, p0, Lck;->b:Lhk;

    iput-object p2, p0, Lck;->c:LEC;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    iget p1, p0, Lck;->a:I

    const/16 v0, 0x3ee

    iget-object v1, p0, Lck;->c:LEC;

    iget-object v2, p0, Lck;->b:Lhk;

    packed-switch p1, :pswitch_data_0

    invoke-virtual {v2, v1}, Lhk;->b(LEC;)V

    return-void

    :pswitch_0
    invoke-virtual {v2, v1}, Lhk;->b(LEC;)V

    return-void

    :pswitch_1
    iget-object v4, p0, Lck;->b:Lhk;

    iget-object p1, v4, Lhk;->e:Landroid/widget/TextView;

    iget-object v6, p0, Lck;->c:LEC;

    iget-object v0, v6, LEC;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v0, -0x403ffffff835L

    :goto_0
    invoke-static {v0, v1, p1, v2}, LEy;->k(JLandroid/content/Context;I)V

    goto :goto_1

    :cond_0
    invoke-static {v0}, Lra;->h0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LDA;

    sget-object v0, LEA;->a:LEA;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->h()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v0, -0x40c8fffff835L

    goto :goto_0

    :cond_1
    sget-object v0, LIC;->a:LIC;

    iget-object v1, v6, LEC;->a:Ljava/lang/String;

    sget-object v3, LCC;->c:LCC;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v3}, LIC;->f(Ljava/lang/String;LCC;)V

    const-wide v0, -0x40cefffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    sget-object p1, Lhe;->a:Lhd;

    sget-object p1, LVc;->b:LVc;

    invoke-static {p1}, LPj;->a(Lac;)LCb;

    move-result-object p1

    new-instance v3, Lfk;

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v8}, Lfk;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LEb;I)V

    const/4 v0, 0x3

    invoke-static {p1, v3, v0}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    :goto_1
    return-void

    :pswitch_2
    sget-object p1, Lds;->a:Lds;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-wide v3, -0x40a0fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LEC;->b:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v0, v1}, Lds;->c(Landroid/content/Context;ILjava/lang/String;)V

    return-void

    :pswitch_3
    iget-object p1, v1, LEC;->s:LCC;

    sget-object v3, LCC;->a:LCC;

    if-ne p1, v3, :cond_2

    sget-object p1, Lds;->a:Lds;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-wide v3, -0x4090fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LEC;->b:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v0, v1}, Lds;->c(Landroid/content/Context;ILjava/lang/String;)V

    :cond_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
