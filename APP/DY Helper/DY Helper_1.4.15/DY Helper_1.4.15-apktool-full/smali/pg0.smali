.class public final Lpg0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp6;


# instance fields
.field public final ε:I

.field public ζ:I

.field public final η:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    .line 19
    new-array v0, v0, [Lpg0;

    iput-object v0, p0, Lpg0;->η:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 20
    iput v0, p0, Lpg0;->ε:I

    .line 21
    iput v0, p0, Lpg0;->ζ:I

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lpg0;->η:Ljava/lang/Object;

    .line 6
    .line 7
    iput p1, p0, Lpg0;->ε:I

    .line 8
    .line 9
    and-int/lit8 p1, p2, 0x7

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    const/16 p1, 0x8

    .line 14
    .line 15
    :cond_0
    iput p1, p0, Lpg0;->ζ:I

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lp6;I)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpg0;->η:Ljava/lang/Object;

    iput p2, p0, Lpg0;->ε:I

    return-void
.end method


# virtual methods
.method public α(ILjava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lpg0;->η:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lp6;

    .line 4
    .line 5
    iget v1, p0, Lpg0;->ζ:I

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget p0, p0, Lpg0;->ε:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    add-int/2addr p1, p0

    .line 14
    invoke-interface {v0, p1, p2}, Lp6;->α(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public γ(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lpg0;->ζ:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lpg0;->ζ:I

    .line 6
    .line 7
    iget-object p0, p0, Lpg0;->η:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lp6;

    .line 10
    .line 11
    invoke-interface {p0, p1}, Lp6;->γ(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public δ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lpg0;->η:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lp6;

    .line 4
    .line 5
    invoke-interface {p0}, Lp6;->δ()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public ε(ILjava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lpg0;->η:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lp6;

    .line 4
    .line 5
    iget v1, p0, Lpg0;->ζ:I

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget p0, p0, Lpg0;->ε:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    add-int/2addr p1, p0

    .line 14
    invoke-interface {v0, p1, p2}, Lp6;->ε(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public η(III)V
    .locals 1

    .line 1
    iget v0, p0, Lpg0;->ζ:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lpg0;->ε:I

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iget-object p0, p0, Lpg0;->η:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lp6;

    .line 12
    .line 13
    add-int/2addr p1, v0

    .line 14
    add-int/2addr p2, v0

    .line 15
    invoke-interface {p0, p1, p2, p3}, Lp6;->η(III)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public θ()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lpg0;->η:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lp6;

    .line 4
    .line 5
    invoke-interface {p0}, Lp6;->θ()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public ι(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lpg0;->η:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lp6;

    .line 4
    .line 5
    iget v1, p0, Lpg0;->ζ:I

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget p0, p0, Lpg0;->ε:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    add-int/2addr p1, p0

    .line 14
    invoke-interface {v0, p1, p2}, Lp6;->ι(II)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public κ(Le80;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lpg0;->η:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lp6;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2}, Lp6;->κ(Le80;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public μ()V
    .locals 1

    .line 1
    iget v0, p0, Lpg0;->ζ:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string v0, "OffsetApplier up called with no corresponding down"

    .line 7
    .line 8
    invoke-static {v0}, Lsn;->α(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :goto_0
    iget v0, p0, Lpg0;->ζ:I

    .line 12
    .line 13
    add-int/lit8 v0, v0, -0x1

    .line 14
    .line 15
    iput v0, p0, Lpg0;->ζ:I

    .line 16
    .line 17
    iget-object p0, p0, Lpg0;->η:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lp6;

    .line 20
    .line 21
    invoke-interface {p0}, Lp6;->μ()V

    .line 22
    .line 23
    .line 24
    return-void
.end method
