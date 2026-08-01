.class public final synthetic Lbd0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lnd0;


# direct methods
.method public synthetic constructor <init>(Lnd0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lbd0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lbd0;->ζ:Lnd0;

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
    .locals 4

    .line 1
    iget v0, p0, Lbd0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Long;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    const-wide/16 v2, 0x0

    .line 13
    .line 14
    cmp-long v0, v0, v2

    .line 15
    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, Lbd0;->ζ:Lnd0;

    .line 19
    .line 20
    iget-object p0, p0, Lnd0;->Γ:Ljava/util/LinkedHashSet;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p0, 0x0

    .line 31
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_0
    check-cast p1, Lpt;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v0, Lcd0;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    iget-object p0, p0, Lbd0;->ζ:Lnd0;

    .line 45
    .line 46
    invoke-direct {v0, p0, p1, v1}, Lcd0;-><init>(Lnd0;Lpt;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, Lnd0;->δ(Lp70;)V

    .line 50
    .line 51
    .line 52
    sget-object p0, Ls62;->α:Ls62;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
