.class public final Llc0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/util/Iterator;
.implements Llo0;


# instance fields
.field public final ε:Low1;

.field public final ζ:I

.field public η:I

.field public final θ:I


# direct methods
.method public constructor <init>(Low1;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llc0;->ε:Low1;

    .line 5
    .line 6
    iput p3, p0, Llc0;->ζ:I

    .line 7
    .line 8
    iput p2, p0, Llc0;->η:I

    .line 9
    .line 10
    iget p2, p1, Low1;->μ:I

    .line 11
    .line 12
    iput p2, p0, Llc0;->θ:I

    .line 13
    .line 14
    iget-boolean p0, p1, Low1;->λ:Z

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-static {}, Lqw1;->ζ()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, Llc0;->η:I

    .line 2
    .line 3
    iget p0, p0, Llc0;->ζ:I

    .line 4
    .line 5
    if-ge v0, p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Llc0;->ε:Low1;

    .line 2
    .line 3
    iget v1, v0, Low1;->μ:I

    .line 4
    .line 5
    iget v2, p0, Llc0;->θ:I

    .line 6
    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lqw1;->ζ()V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget v1, p0, Llc0;->η:I

    .line 13
    .line 14
    iget-object v3, v0, Low1;->ε:[I

    .line 15
    .line 16
    mul-int/lit8 v4, v1, 0x5

    .line 17
    .line 18
    add-int/lit8 v4, v4, 0x3

    .line 19
    .line 20
    aget v3, v3, v4

    .line 21
    .line 22
    add-int/2addr v3, v1

    .line 23
    iput v3, p0, Llc0;->η:I

    .line 24
    .line 25
    new-instance p0, Lpw1;

    .line 26
    .line 27
    invoke-direct {p0, v0, v1, v2}, Lpw1;-><init>(Low1;II)V

    .line 28
    .line 29
    .line 30
    return-object p0
.end method

.method public final remove()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method
