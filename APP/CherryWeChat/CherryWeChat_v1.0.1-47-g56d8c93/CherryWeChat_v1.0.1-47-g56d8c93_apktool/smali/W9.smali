.class public final LW9;
.super LOz;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Lqe;


# direct methods
.method public synthetic constructor <init>(Lqe;LEb;I)V
    .locals 0

    iput p3, p0, LW9;->e:I

    iput-object p1, p0, LW9;->f:Lqe;

    invoke-direct {p0, p2}, LOz;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, LW9;->e:I

    check-cast p1, Lfc;

    check-cast p2, LEb;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p2, p1}, LW9;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LW9;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LW9;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    invoke-virtual {p0, p2, p1}, LW9;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LW9;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LW9;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(LEb;Ljava/lang/Object;)LEb;
    .locals 2

    iget p2, p0, LW9;->e:I

    packed-switch p2, :pswitch_data_0

    new-instance p2, LW9;

    iget-object v0, p0, LW9;->f:Lqe;

    const/4 v1, 0x1

    invoke-direct {p2, v0, p1, v1}, LW9;-><init>(Lqe;LEb;I)V

    return-object p2

    :pswitch_0
    new-instance p2, LW9;

    iget-object v0, p0, LW9;->f:Lqe;

    const/4 v1, 0x0

    invoke-direct {p2, v0, p1, v1}, LW9;-><init>(Lqe;LEb;I)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, LW9;->e:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    iget-object p1, p0, LW9;->f:Lqe;

    const/16 v0, 0x62

    invoke-virtual {p1, v0}, Lqe;->b(I)V

    sget-object p1, LTC;->a:LTC;

    return-object p1

    :pswitch_0
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    iget-object p1, p0, LW9;->f:Lqe;

    const/16 v0, 0x5f

    invoke-virtual {p1, v0}, Lqe;->b(I)V

    sget-object p1, LTC;->a:LTC;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
