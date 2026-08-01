.class public final synthetic Lrs0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lg21;

.field public final synthetic η:Lg21;

.field public final synthetic θ:Lg21;


# direct methods
.method public synthetic constructor <init>(Lg21;Lg21;Lg21;I)V
    .locals 0

    .line 1
    iput p4, p0, Lrs0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lrs0;->ζ:Lg21;

    .line 4
    .line 5
    iput-object p2, p0, Lrs0;->η:Lg21;

    .line 6
    .line 7
    iput-object p3, p0, Lrs0;->θ:Lg21;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lrs0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lrs0;->ζ:Lg21;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-interface {v0, v1}, Lg21;->setValue(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lrs0;->η:Lg21;

    .line 13
    .line 14
    invoke-interface {v0, v1}, Lg21;->setValue(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lrs0;->θ:Lg21;

    .line 18
    .line 19
    invoke-interface {p0, v1}, Lg21;->setValue(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    iget-object v0, p0, Lrs0;->ζ:Lg21;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-interface {v0, v1}, Lg21;->setValue(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lrs0;->η:Lg21;

    .line 32
    .line 33
    invoke-interface {v0, v1}, Lg21;->setValue(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, Lrs0;->θ:Lg21;

    .line 37
    .line 38
    invoke-interface {p0, v1}, Lg21;->setValue(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
