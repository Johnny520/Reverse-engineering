.class public final synthetic Lpc0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lp70;


# direct methods
.method public synthetic constructor <init>(ILp70;)V
    .locals 0

    .line 1
    iput p1, p0, Lpc0;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Lpc0;->ζ:Lp70;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lpc0;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lpc0;->ζ:Lp70;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    :goto_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 12
    .line 13
    return-object p0

    .line 14
    :pswitch_0
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :pswitch_1
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :pswitch_2
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :pswitch_3
    :try_start_0
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Ljava/util/List;
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :catch_0
    sget-object p0, Ljz;->ε:Ljz;

    .line 34
    .line 35
    :goto_1
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
