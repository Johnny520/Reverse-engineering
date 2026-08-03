.class public final synthetic Lnt;
.super Lpj;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    iput p6, p0, Lnt;->i:I

    invoke-direct/range {p0 .. p5}, Lpj;-><init>(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lnt;->i:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LF6;->b:Ljava/lang/Object;

    check-cast v0, Lot;

    invoke-virtual {v0}, Lot;->d()V

    sget-object v0, LTC;->a:LTC;

    return-object v0

    :pswitch_0
    iget-object v0, p0, LF6;->b:Ljava/lang/Object;

    check-cast v0, Lot;

    invoke-virtual {v0}, Lot;->d()V

    sget-object v0, LTC;->a:LTC;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
