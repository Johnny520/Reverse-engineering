.class public final LY9;
.super LOz;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Lqe;

.field public final synthetic g:Landroid/view/View;

.field public final synthetic h:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lqe;Landroid/view/View;Ljava/lang/Exception;LEb;I)V
    .locals 0

    iput p5, p0, LY9;->e:I

    iput-object p1, p0, LY9;->f:Lqe;

    iput-object p2, p0, LY9;->g:Landroid/view/View;

    iput-object p3, p0, LY9;->h:Ljava/lang/Exception;

    invoke-direct {p0, p4}, LOz;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, LY9;->e:I

    check-cast p1, Lfc;

    check-cast p2, LEb;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p2, p1}, LY9;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LY9;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LY9;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    invoke-virtual {p0, p2, p1}, LY9;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LY9;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LY9;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(LEb;Ljava/lang/Object;)LEb;
    .locals 7

    iget p2, p0, LY9;->e:I

    packed-switch p2, :pswitch_data_0

    new-instance v0, LY9;

    iget-object v3, p0, LY9;->h:Ljava/lang/Exception;

    const/4 v5, 0x1

    iget-object v1, p0, LY9;->f:Lqe;

    iget-object v2, p0, LY9;->g:Landroid/view/View;

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, LY9;-><init>(Lqe;Landroid/view/View;Ljava/lang/Exception;LEb;I)V

    return-object v0

    :pswitch_0
    move-object v4, p1

    new-instance v1, LY9;

    move-object v5, v4

    iget-object v4, p0, LY9;->h:Ljava/lang/Exception;

    const/4 v6, 0x0

    iget-object v2, p0, LY9;->f:Lqe;

    iget-object v3, p0, LY9;->g:Landroid/view/View;

    invoke-direct/range {v1 .. v6}, LY9;-><init>(Lqe;Landroid/view/View;Ljava/lang/Exception;LEb;I)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, LY9;->e:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    iget-object p1, p0, LY9;->f:Lqe;

    invoke-virtual {p1}, Lqe;->a()V

    iget-object p1, p0, LY9;->g:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x5e13fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LY9;->h:Ljava/lang/Exception;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    sget-object p1, LTC;->a:LTC;

    return-object p1

    :pswitch_0
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    iget-object p1, p0, LY9;->f:Lqe;

    invoke-virtual {p1}, Lqe;->a()V

    iget-object p1, p0, LY9;->g:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v0, -0x5fe5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LY9;->h:Ljava/lang/Exception;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-wide v1, -0x5fecfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    sget-object p1, LTC;->a:LTC;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
