.class public final Ltx1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lwn;
.implements Ljava/lang/Iterable;
.implements Llo0;


# instance fields
.field public final ε:Low1;

.field public final ζ:I

.field public final η:Ldn1;


# direct methods
.method public constructor <init>(Low1;ILx80;Ldn1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltx1;->ε:Low1;

    .line 5
    .line 6
    iput p2, p0, Ltx1;->ζ:I

    .line 7
    .line 8
    iput-object p4, p0, Ltx1;->η:Ldn1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Ltx1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ltx1;

    .line 6
    .line 7
    iget v0, p1, Ltx1;->ζ:I

    .line 8
    .line 9
    iget v1, p0, Ltx1;->ζ:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v0, p1, Ltx1;->ε:Low1;

    .line 14
    .line 15
    iget-object v1, p0, Ltx1;->ε:Low1;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object p1, p1, Ltx1;->η:Ldn1;

    .line 24
    .line 25
    iget-object p0, p0, Ltx1;->η:Ldn1;

    .line 26
    .line 27
    invoke-virtual {p1, p0}, Ldn1;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_0
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Ltx1;->ζ:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget-object v1, p0, Ltx1;->ε:Low1;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/2addr v1, v0

    .line 12
    mul-int/lit8 v1, v1, 0x1f

    .line 13
    .line 14
    iget-object p0, p0, Ltx1;->η:Ldn1;

    .line 15
    .line 16
    invoke-virtual {p0}, Ldn1;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    add-int/2addr p0, v1

    .line 21
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 4

    .line 1
    new-instance v0, Lsx1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Ltx1;->η:Ldn1;

    .line 5
    .line 6
    iget-object v3, p0, Ltx1;->ε:Low1;

    .line 7
    .line 8
    iget p0, p0, Ltx1;->ζ:I

    .line 9
    .line 10
    invoke-direct {v0, v3, p0, v1, v2}, Lsx1;-><init>(Low1;ILx80;Li91;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
