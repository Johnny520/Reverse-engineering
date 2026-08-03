.class public final Lu4/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final g:Lv4/c0;

.field public final h:Lv4/c0;


# direct methods
.method public constructor <init>(Lv4/c0;Lv4/c0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu4/k;->g:Lv4/c0;

    .line 5
    .line 6
    iput-object p2, p0, Lu4/k;->h:Lv4/c0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lu4/k;)I
    .locals 5

    .line 1
    iget-object v0, p1, Lu4/k;->g:Lv4/c0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, -0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object v4, p0, Lu4/k;->g:Lv4/c0;

    .line 7
    .line 8
    if-ne v4, v0, :cond_0

    .line 9
    .line 10
    move v0, v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    if-nez v4, :cond_1

    .line 13
    .line 14
    move v0, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    if-nez v0, :cond_2

    .line 17
    .line 18
    move v0, v1

    .line 19
    goto :goto_0

    .line 20
    :cond_2
    invoke-virtual {v4, v0}, Lv4/a;->d(Lv4/a;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    :goto_0
    if-eqz v0, :cond_3

    .line 25
    .line 26
    return v0

    .line 27
    :cond_3
    iget-object p1, p1, Lu4/k;->h:Lv4/c0;

    .line 28
    .line 29
    iget-object v0, p0, Lu4/k;->h:Lv4/c0;

    .line 30
    .line 31
    if-ne v0, p1, :cond_4

    .line 32
    .line 33
    return v3

    .line 34
    :cond_4
    if-nez v0, :cond_5

    .line 35
    .line 36
    return v2

    .line 37
    :cond_5
    if-nez p1, :cond_6

    .line 38
    .line 39
    return v1

    .line 40
    :cond_6
    invoke-virtual {v0, p1}, Lv4/a;->d(Lv4/a;)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    return p1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lu4/k;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lu4/k;->a(Lu4/k;)I

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
    instance-of v0, p1, Lu4/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lu4/k;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lu4/k;->a(Lu4/k;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lu4/k;->g:Lv4/c0;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v1, v1, Lv4/c0;->g:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    .line 15
    .line 16
    iget-object v2, p0, Lu4/k;->h:Lv4/c0;

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    iget-object v0, v2, Lv4/c0;->g:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    :goto_1
    add-int/2addr v1, v0

    .line 28
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lu4/k;->h:Lv4/c0;

    .line 2
    .line 3
    iget-object v1, p0, Lu4/k;->g:Lv4/c0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Lv4/c0;->l()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const-string v2, ""

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    return-object v2

    .line 21
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v4, "["

    .line 24
    .line 25
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    move-object v1, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-virtual {v1}, Lv4/c0;->l()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    :goto_0
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v1, "|"

    .line 40
    .line 41
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    if-nez v0, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    invoke-virtual {v0}, Lv4/c0;->l()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    :goto_1
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    return-object v0
.end method
