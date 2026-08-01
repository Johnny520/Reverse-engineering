.class public final synthetic Lcd0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lnd0;

.field public final synthetic η:Lpt;


# direct methods
.method public synthetic constructor <init>(Lnd0;Lpt;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcd0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lcd0;->ζ:Lnd0;

    .line 4
    .line 5
    iput-object p2, p0, Lcd0;->η:Lpt;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcd0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcd0;->ζ:Lnd0;

    .line 7
    .line 8
    iget-object p0, p0, Lcd0;->η:Lpt;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Lnd0;->γ(Lpt;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    iget-object v0, p0, Lcd0;->ζ:Lnd0;

    .line 17
    .line 18
    iget-object p0, p0, Lcd0;->η:Lpt;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Lnd0;->γ(Lpt;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :pswitch_1
    iget-object v0, p0, Lcd0;->ζ:Lnd0;

    .line 25
    .line 26
    iget-object p0, p0, Lcd0;->η:Lpt;

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Lnd0;->γ(Lpt;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
