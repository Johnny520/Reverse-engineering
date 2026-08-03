.class public final Ljt;
.super LBn;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lot;


# direct methods
.method public synthetic constructor <init>(Lot;I)V
    .locals 0

    iput p2, p0, Ljt;->b:I

    iput-object p1, p0, Ljt;->c:Lot;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LBn;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ljt;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljt;->c:Lot;

    invoke-virtual {v0}, Lot;->b()V

    sget-object v0, LTC;->a:LTC;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ljt;->c:Lot;

    invoke-virtual {v0}, Lot;->a()V

    sget-object v0, LTC;->a:LTC;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ljt;->c:Lot;

    invoke-virtual {v0}, Lot;->b()V

    sget-object v0, LTC;->a:LTC;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
