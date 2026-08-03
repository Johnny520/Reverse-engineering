.class public final Lg7;
.super Ltj;
.source ""

# interfaces
.implements LKr;


# instance fields
.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lvj;I)V
    .locals 0

    iput p2, p0, Lg7;->c:I

    invoke-direct {p0, p1}, Ltj;-><init>(Lvj;)V

    return-void
.end method


# virtual methods
.method public final a()Lvj;
    .locals 1

    iget v0, p0, Lg7;->c:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ltj;->a:Lvj;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ltj;->a:Lvj;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ltj;->a:Lvj;

    return-object v0

    :pswitch_2
    iget-object v0, p0, Ltj;->a:Lvj;

    return-object v0

    :pswitch_3
    iget-object v0, p0, Ltj;->a:Lvj;

    return-object v0

    :pswitch_4
    iget-object v0, p0, Ltj;->a:Lvj;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lg7;->c:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Ltj;->d()Ltj;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {p0}, Ltj;->d()Ltj;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-virtual {p0}, Ltj;->d()Ltj;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-virtual {p0}, Ltj;->d()Ltj;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-virtual {p0}, Ltj;->d()Ltj;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-virtual {p0}, Ltj;->d()Ltj;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
