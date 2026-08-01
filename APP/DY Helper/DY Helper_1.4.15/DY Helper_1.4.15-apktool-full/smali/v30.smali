.class public final synthetic Lv30;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lch1;


# direct methods
.method public synthetic constructor <init>(Lch1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lv30;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lv30;->ζ:Lch1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lv30;->ε:I

    .line 2
    .line 3
    check-cast p1, Lbh1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iget-object p0, p0, Lv30;->ζ:Lch1;

    .line 10
    .line 11
    invoke-static {p1, p0, v0, v0}, Lbh1;->ξ(Lbh1;Lch1;II)V

    .line 12
    .line 13
    .line 14
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_0
    const/4 v0, 0x0

    .line 18
    iget-object p0, p0, Lv30;->ζ:Lch1;

    .line 19
    .line 20
    invoke-static {p1, p0, v0, v0}, Lbh1;->λ(Lbh1;Lch1;II)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :pswitch_1
    const/4 v0, 0x0

    .line 25
    iget-object p0, p0, Lv30;->ζ:Lch1;

    .line 26
    .line 27
    invoke-static {p1, p0, v0, v0}, Lbh1;->ξ(Lbh1;Lch1;II)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_2
    const/4 v0, 0x0

    .line 32
    iget-object p0, p0, Lv30;->ζ:Lch1;

    .line 33
    .line 34
    invoke-static {p1, p0, v0, v0}, Lbh1;->ξ(Lbh1;Lch1;II)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
