.class public final Ln31;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lq31;


# direct methods
.method public synthetic constructor <init>(Lq31;I)V
    .locals 0

    .line 1
    iput p2, p0, Ln31;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Ln31;->ζ:Lq31;

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
    .locals 2

    .line 1
    iget v0, p0, Ln31;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ln31;->ζ:Lq31;

    .line 7
    .line 8
    iget-object p0, p0, Lq31;->υ:Lq31;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lq31;->Я()V

    .line 13
    .line 14
    .line 15
    :cond_0
    sget-object p0, Ls62;->α:Ls62;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    iget-object p0, p0, Ln31;->ζ:Lq31;

    .line 19
    .line 20
    iget-object v0, p0, Lq31;->Ν:Lde;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lq31;->Μ:Lwa0;

    .line 26
    .line 27
    invoke-virtual {p0, v0, v1}, Lq31;->П(Lde;Lwa0;)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Ls62;->α:Ls62;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
