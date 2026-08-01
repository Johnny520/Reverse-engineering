.class public final Lir0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:Lcr0;

.field public β:Lfr0;


# virtual methods
.method public final α(Lhr0;Lbr0;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Lbr0;->α()Lcr0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lir0;->α:Lcr0;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-gez v2, :cond_0

    .line 15
    .line 16
    move-object v1, v0

    .line 17
    :cond_0
    iput-object v1, p0, Lir0;->α:Lcr0;

    .line 18
    .line 19
    iget-object v1, p0, Lir0;->β:Lfr0;

    .line 20
    .line 21
    invoke-interface {v1, p1, p2}, Lfr0;->κ(Lhr0;Lbr0;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lir0;->α:Lcr0;

    .line 25
    .line 26
    return-void
.end method
