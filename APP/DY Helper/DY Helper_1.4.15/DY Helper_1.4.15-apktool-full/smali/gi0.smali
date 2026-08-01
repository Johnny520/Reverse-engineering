.class public final synthetic Lgi0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lli0;

.field public final synthetic η:Lgj0;


# direct methods
.method public synthetic constructor <init>(Lli0;Lgj0;I)V
    .locals 0

    .line 1
    iput p3, p0, Lgi0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lgi0;->ζ:Lli0;

    .line 4
    .line 5
    iput-object p2, p0, Lgi0;->η:Lgj0;

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
    .locals 2

    .line 1
    iget v0, p0, Lgi0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lgi0;->η:Lgj0;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iget-object p0, p0, Lgi0;->ζ:Lli0;

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Lli0;->β(Lgj0;Z)V

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
    iget-object v0, p0, Lgi0;->η:Lgj0;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    iget-object p0, p0, Lgi0;->ζ:Lli0;

    .line 21
    .line 22
    invoke-virtual {p0, v0, v1}, Lli0;->β(Lgj0;Z)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
