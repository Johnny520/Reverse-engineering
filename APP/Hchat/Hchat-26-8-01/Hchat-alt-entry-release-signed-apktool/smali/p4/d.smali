.class public final Lp4/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final g:I

.field public final h:I

.field public final i:Lp4/c;


# direct methods
.method public constructor <init>(IILp4/c;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-ltz p1, :cond_2

    .line 5
    .line 6
    if-le p2, p1, :cond_1

    .line 7
    .line 8
    iget-boolean v0, p3, Lz4/j;->g:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iput p1, p0, Lp4/d;->g:I

    .line 13
    .line 14
    iput p2, p0, Lp4/d;->h:I

    .line 15
    .line 16
    iput-object p3, p0, Lp4/d;->i:Lp4/c;

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p1, "handlers.isMutable()"

    .line 20
    .line 21
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    throw p1

    .line 26
    :cond_1
    const-string p1, "end <= start"

    .line 27
    .line 28
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    throw p1

    .line 33
    :cond_2
    const-string p1, "start < 0"

    .line 34
    .line 35
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    throw p1
.end method


# virtual methods
.method public final a(Lp4/d;)I
    .locals 2

    .line 1
    iget v0, p1, Lp4/d;->g:I

    .line 2
    .line 3
    iget v1, p0, Lp4/d;->g:I

    .line 4
    .line 5
    if-ge v1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    if-le v1, v0, :cond_1

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_1
    iget v0, p1, Lp4/d;->h:I

    .line 12
    .line 13
    iget v1, p0, Lp4/d;->h:I

    .line 14
    .line 15
    if-ge v1, v0, :cond_2

    .line 16
    .line 17
    :goto_0
    const/4 p1, -0x1

    .line 18
    return p1

    .line 19
    :cond_2
    if-le v1, v0, :cond_3

    .line 20
    .line 21
    :goto_1
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_3
    iget-object v0, p0, Lp4/d;->i:Lp4/c;

    .line 24
    .line 25
    iget-object p1, p1, Lp4/d;->i:Lp4/c;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lp4/c;->o(Lp4/c;)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lp4/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lp4/d;->a(Lp4/d;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lp4/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lp4/d;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lp4/d;->a(Lp4/d;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1

    .line 16
    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lp4/d;->g:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget v1, p0, Lp4/d;->h:I

    .line 6
    .line 7
    add-int/2addr v0, v1

    .line 8
    mul-int/lit8 v0, v0, 0x1f

    .line 9
    .line 10
    iget-object v1, p0, Lp4/d;->i:Lp4/c;

    .line 11
    .line 12
    iget-object v1, v1, Lz4/e;->h:[Ljava/lang/Object;

    .line 13
    .line 14
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    add-int/2addr v1, v0

    .line 19
    return v1
.end method
