.class public final Le7;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Iterable;
.implements Llo0;


# instance fields
.field public final synthetic ε:I

.field public final ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Le7;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Le7;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget v0, p0, Le7;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Le7;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lwr;

    .line 9
    .line 10
    new-instance v0, Lvr;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lvr;-><init>(Lwr;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    new-instance v0, Lrw;

    .line 17
    .line 18
    iget-object p0, p0, Le7;->ζ:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lbi;

    .line 21
    .line 22
    iget-object p0, p0, Lbi;->ζ:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {v0, p0}, Lrw;-><init>(Ljava/util/Iterator;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_1
    iget-object p0, p0, Le7;->ζ:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, [Ljava/lang/Object;

    .line 35
    .line 36
    new-instance v0, Lτ;

    .line 37
    .line 38
    invoke-direct {v0, p0}, Lτ;-><init>([Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
