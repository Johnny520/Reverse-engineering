.class public final Lp/z;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lp/r1;


# instance fields
.field public final a:Lp/r1;

.field public final b:Lp/r1;


# direct methods
.method public constructor <init>(Lp/r1;Lp/r1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp/z;->a:Lp/r1;

    .line 5
    .line 6
    iput-object p2, p0, Lp/z;->b:Lp/r1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lu2/c;Lu2/m;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lp/z;->a:Lp/r1;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lp/r1;->a(Lu2/c;Lu2/m;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lp/z;->b:Lp/r1;

    .line 8
    .line 9
    invoke-interface {v1, p1, p2}, Lp/r1;->a(Lu2/c;Lu2/m;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    sub-int/2addr v0, p1

    .line 14
    if-gez v0, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_0
    return v0
.end method

.method public final b(Lu2/c;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lp/z;->a:Lp/r1;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lp/r1;->b(Lu2/c;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lp/z;->b:Lp/r1;

    .line 8
    .line 9
    invoke-interface {v1, p1}, Lp/r1;->b(Lu2/c;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    sub-int/2addr v0, p1

    .line 14
    if-gez v0, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_0
    return v0
.end method

.method public final c(Lu2/c;Lu2/m;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lp/z;->a:Lp/r1;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lp/r1;->c(Lu2/c;Lu2/m;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lp/z;->b:Lp/r1;

    .line 8
    .line 9
    invoke-interface {v1, p1, p2}, Lp/r1;->c(Lu2/c;Lu2/m;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    sub-int/2addr v0, p1

    .line 14
    if-gez v0, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_0
    return v0
.end method

.method public final d(Lu2/c;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lp/z;->a:Lp/r1;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lp/r1;->d(Lu2/c;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lp/z;->b:Lp/r1;

    .line 8
    .line 9
    invoke-interface {v1, p1}, Lp/r1;->d(Lu2/c;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    sub-int/2addr v0, p1

    .line 14
    if-gez v0, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_0
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lp/z;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lp/z;

    .line 10
    .line 11
    iget-object v0, p1, Lp/z;->a:Lp/r1;

    .line 12
    .line 13
    iget-object v1, p0, Lp/z;->a:Lp/r1;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object p1, p1, Lp/z;->b:Lp/r1;

    .line 22
    .line 23
    iget-object v0, p0, Lp/z;->b:Lp/r1;

    .line 24
    .line 25
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    :goto_0
    const/4 p1, 0x1

    .line 32
    return p1

    .line 33
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 34
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lp/z;->a:Lp/r1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lp/z;->b:Lp/r1;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lp/z;->a:Lp/r1;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " - "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lp/z;->b:Lp/r1;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 v1, 0x29

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
.end method
