.class public final LZ9;
.super LOz;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Landroid/view/View;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lhk;Ljava/lang/String;LEC;LEb;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LZ9;->e:I

    .line 2
    iput-object p1, p0, LZ9;->f:Landroid/view/View;

    iput-object p2, p0, LZ9;->g:Ljava/lang/String;

    iput-object p3, p0, LZ9;->h:Ljava/lang/Object;

    invoke-direct {p0, p4}, LOz;-><init>(LEb;)V

    return-void
.end method

.method public synthetic constructor <init>(Lqe;Landroid/view/View;Ljava/lang/String;LEb;I)V
    .locals 0

    .line 1
    iput p5, p0, LZ9;->e:I

    iput-object p1, p0, LZ9;->f:Landroid/view/View;

    iput-object p2, p0, LZ9;->h:Ljava/lang/Object;

    iput-object p3, p0, LZ9;->g:Ljava/lang/String;

    invoke-direct {p0, p4}, LOz;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, LZ9;->e:I

    check-cast p1, Lfc;

    check-cast p2, LEb;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p2, p1}, LZ9;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LZ9;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LZ9;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    invoke-virtual {p0, p2, p1}, LZ9;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LZ9;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LZ9;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_1
    invoke-virtual {p0, p2, p1}, LZ9;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LZ9;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LZ9;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(LEb;Ljava/lang/Object;)LEb;
    .locals 10

    iget p2, p0, LZ9;->e:I

    packed-switch p2, :pswitch_data_0

    new-instance p2, LZ9;

    iget-object v0, p0, LZ9;->f:Landroid/view/View;

    check-cast v0, Lhk;

    iget-object v1, p0, LZ9;->h:Ljava/lang/Object;

    check-cast v1, LEC;

    iget-object v2, p0, LZ9;->g:Ljava/lang/String;

    invoke-direct {p2, v0, v2, v1, p1}, LZ9;-><init>(Lhk;Ljava/lang/String;LEC;LEb;)V

    return-object p2

    :pswitch_0
    new-instance v3, LZ9;

    iget-object p2, p0, LZ9;->f:Landroid/view/View;

    move-object v4, p2

    check-cast v4, Lqe;

    iget-object p2, p0, LZ9;->h:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, LOg;

    iget-object v6, p0, LZ9;->g:Ljava/lang/String;

    const/4 v8, 0x1

    move-object v7, p1

    invoke-direct/range {v3 .. v8}, LZ9;-><init>(Lqe;Landroid/view/View;Ljava/lang/String;LEb;I)V

    return-object v3

    :pswitch_1
    move-object v7, p1

    new-instance v4, LZ9;

    iget-object p1, p0, LZ9;->f:Landroid/view/View;

    move-object v5, p1

    check-cast v5, Lqe;

    iget-object p1, p0, LZ9;->h:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Landroid/view/View;

    move-object v8, v7

    iget-object v7, p0, LZ9;->g:Ljava/lang/String;

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v9}, LZ9;-><init>(Lqe;Landroid/view/View;Ljava/lang/String;LEb;I)V

    return-object v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, LZ9;->e:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    iget-object p1, p0, LZ9;->f:Landroid/view/View;

    check-cast p1, Lhk;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x43f2fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LZ9;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    iget-object v0, p0, LZ9;->h:Ljava/lang/Object;

    check-cast v0, LEC;

    invoke-static {p1, v0}, Lhk;->a(Lhk;LEC;)V

    sget-object p1, LTC;->a:LTC;

    return-object p1

    :pswitch_0
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    iget-object p1, p0, LZ9;->f:Landroid/view/View;

    check-cast p1, Lqe;

    invoke-virtual {p1}, Lqe;->a()V

    iget-object p1, p0, LZ9;->h:Ljava/lang/Object;

    check-cast p1, LOg;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x5b84fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LZ9;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    sget-object p1, LTC;->a:LTC;

    return-object p1

    :pswitch_1
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    iget-object p1, p0, LZ9;->f:Landroid/view/View;

    check-cast p1, Lqe;

    invoke-virtual {p1}, Lqe;->a()V

    iget-object p1, p0, LZ9;->h:Ljava/lang/Object;

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x5fa1fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LZ9;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    sget-object p1, LTC;->a:LTC;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
