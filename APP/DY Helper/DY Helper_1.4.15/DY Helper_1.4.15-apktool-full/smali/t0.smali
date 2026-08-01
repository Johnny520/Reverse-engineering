.class public final Lt0;
.super Lbp0;
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
    iput p2, p0, Lt0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lt0;->ζ:Lch1;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lt0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lbh1;

    .line 7
    .line 8
    iget-object p0, p0, Lt0;->ζ:Lch1;

    .line 9
    .line 10
    invoke-static {p1, p0}, Lbh1;->χ(Lbh1;Lch1;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Ls62;->α:Ls62;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    check-cast p1, Lbh1;

    .line 17
    .line 18
    iget-object p0, p0, Lt0;->ζ:Lch1;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-static {p1, p0, v0, v0}, Lbh1;->ξ(Lbh1;Lch1;II)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Ls62;->α:Ls62;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_1
    check-cast p1, Lbh1;

    .line 28
    .line 29
    iget-object p0, p0, Lt0;->ζ:Lch1;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-static {p1, p0, v0, v0}, Lbh1;->λ(Lbh1;Lch1;II)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Ls62;->α:Ls62;

    .line 36
    .line 37
    return-object p0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
