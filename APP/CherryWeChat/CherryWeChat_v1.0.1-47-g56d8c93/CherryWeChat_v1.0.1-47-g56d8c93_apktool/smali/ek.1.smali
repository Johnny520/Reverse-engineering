.class public final Lek;
.super LOz;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Lhk;

.field public final synthetic g:Ljava/lang/Exception;

.field public final synthetic h:LEC;


# direct methods
.method public synthetic constructor <init>(Lhk;Ljava/lang/Exception;LEC;LEb;I)V
    .locals 0

    iput p5, p0, Lek;->e:I

    iput-object p1, p0, Lek;->f:Lhk;

    iput-object p2, p0, Lek;->g:Ljava/lang/Exception;

    iput-object p3, p0, Lek;->h:LEC;

    invoke-direct {p0, p4}, LOz;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lek;->e:I

    check-cast p1, Lfc;

    check-cast p2, LEb;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p2, p1}, Lek;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Lek;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Lek;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lek;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Lek;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Lek;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(LEb;Ljava/lang/Object;)LEb;
    .locals 7

    iget p2, p0, Lek;->e:I

    packed-switch p2, :pswitch_data_0

    new-instance v0, Lek;

    iget-object v3, p0, Lek;->h:LEC;

    const/4 v5, 0x1

    iget-object v1, p0, Lek;->f:Lhk;

    iget-object v2, p0, Lek;->g:Ljava/lang/Exception;

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lek;-><init>(Lhk;Ljava/lang/Exception;LEC;LEb;I)V

    return-object v0

    :pswitch_0
    move-object v4, p1

    new-instance v1, Lek;

    move-object v5, v4

    iget-object v4, p0, Lek;->h:LEC;

    const/4 v6, 0x0

    iget-object v2, p0, Lek;->f:Lhk;

    iget-object v3, p0, Lek;->g:Ljava/lang/Exception;

    invoke-direct/range {v1 .. v6}, Lek;-><init>(Lhk;Ljava/lang/Exception;LEC;LEb;I)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lek;->e:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    iget-object p1, p0, Lek;->f:Lhk;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x43adfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lek;->g:Ljava/lang/Exception;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    iget-object v0, p0, Lek;->h:LEC;

    invoke-static {p1, v0}, Lhk;->a(Lhk;LEC;)V

    sget-object p1, LTC;->a:LTC;

    return-object p1

    :pswitch_0
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    iget-object p1, p0, Lek;->f:Lhk;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x433bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lek;->g:Ljava/lang/Exception;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    iget-object v0, p0, Lek;->h:LEC;

    invoke-static {p1, v0}, Lhk;->a(Lhk;LEC;)V

    sget-object p1, LTC;->a:LTC;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
