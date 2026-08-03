.class public final LMC;
.super LOz;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:LQC;


# direct methods
.method public synthetic constructor <init>(LQC;LEb;I)V
    .locals 0

    iput p3, p0, LMC;->e:I

    iput-object p1, p0, LMC;->f:LQC;

    invoke-direct {p0, p2}, LOz;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, LMC;->e:I

    check-cast p1, Lfc;

    check-cast p2, LEb;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p2, p1}, LMC;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LMC;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LMC;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    invoke-virtual {p0, p2, p1}, LMC;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LMC;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LMC;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_1
    invoke-virtual {p0, p2, p1}, LMC;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LMC;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LMC;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(LEb;Ljava/lang/Object;)LEb;
    .locals 2

    iget p2, p0, LMC;->e:I

    packed-switch p2, :pswitch_data_0

    new-instance p2, LMC;

    iget-object v0, p0, LMC;->f:LQC;

    const/4 v1, 0x2

    invoke-direct {p2, v0, p1, v1}, LMC;-><init>(LQC;LEb;I)V

    return-object p2

    :pswitch_0
    new-instance p2, LMC;

    iget-object v0, p0, LMC;->f:LQC;

    const/4 v1, 0x1

    invoke-direct {p2, v0, p1, v1}, LMC;-><init>(LQC;LEb;I)V

    return-object p2

    :pswitch_1
    new-instance p2, LMC;

    iget-object v0, p0, LMC;->f:LQC;

    const/4 v1, 0x0

    invoke-direct {p2, v0, p1, v1}, LMC;-><init>(LQC;LEb;I)V

    return-object p2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, LMC;->e:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LMC;->f:LQC;

    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_0
    sget-object p1, LY4;->a:LY4;

    invoke-virtual {v0}, LQC;->f()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, LNC;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, LNC;-><init>(LQC;I)V

    new-instance v3, LNC;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v4}, LNC;-><init>(LQC;I)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    invoke-static {v1, v2, v3, p1}, LY4;->a(Landroid/content/Context;Lfj;Lfj;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object v1, v0, LQC;->b:LWz;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1, v2}, LWz;->setRefreshing(Z)V

    :cond_0
    invoke-virtual {v0}, LQC;->f()Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v3, -0x1b965fffff835L

    invoke-static {v3, v4, v1, p1}, LEy;->c(JLjava/lang/StringBuilder;Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :goto_0
    sget-object p1, LTC;->a:LTC;

    return-object p1

    :pswitch_0
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    iget-object p1, p0, LMC;->f:LQC;

    iget-object v0, p1, LQC;->g:Lca;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/g;->notifyDataSetChanged()V

    :cond_1
    invoke-static {p1}, LQC;->a(LQC;)V

    sget-object p1, LTC;->a:LTC;

    return-object p1

    :pswitch_1
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    iget-object p1, p0, LMC;->f:LQC;

    iget-object v0, p1, LQC;->e:Landroid/widget/EditText;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    :cond_2
    const-wide v0, -0x1ba19fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_3
    invoke-virtual {p1, v0}, LQC;->e(Ljava/lang/String;)V

    invoke-static {p1}, LQC;->a(LQC;)V

    sget-object p1, LTC;->a:LTC;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
