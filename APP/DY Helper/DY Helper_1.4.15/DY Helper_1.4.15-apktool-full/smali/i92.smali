.class public final Li92;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroidx/compose/ui/viewinterop/ViewFactoryHolder;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;I)V
    .locals 0

    .line 1
    iput p2, p0, Li92;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Li92;->ζ:Landroidx/compose/ui/viewinterop/ViewFactoryHolder;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Li92;->ε:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, Li92;->ζ:Landroidx/compose/ui/viewinterop/ViewFactoryHolder;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget v0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->σ:I

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->getUpdateBlock()La80;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-object v1

    .line 21
    :pswitch_0
    sget v0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->σ:I

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->getResetBlock()La80;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p0, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    return-object v1

    .line 31
    :pswitch_1
    sget v0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->σ:I

    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->getReleaseBlock()La80;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    invoke-static {p0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->κ(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;)V

    .line 41
    .line 42
    .line 43
    return-object v1

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
