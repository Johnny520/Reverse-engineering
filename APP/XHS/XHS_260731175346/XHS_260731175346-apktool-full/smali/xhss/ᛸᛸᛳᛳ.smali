.class public abstract Lxhss/ᛸᛸᛳᛳ;
.super Lxhss/ᛱᛱᛶᲁ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛴᛲᛱᲇ;


# instance fields
.field public final ᛸᛴᛶᛳ:Z


# direct methods
.method public constructor <init>(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p1, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    move v7, v0

    .line 7
    :goto_0
    move-object v2, p0

    .line 8
    move-object v4, p2

    .line 9
    move-object v3, p3

    .line 10
    move-object v5, p4

    .line 11
    move-object v6, p5

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    move v7, v1

    .line 14
    goto :goto_0

    .line 15
    :goto_1
    invoke-direct/range {v2 .. v7}, Lxhss/ᛱᛱᛶᲁ;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    iput-boolean v1, v2, Lxhss/ᛸᛸᛳᛳ;->ᛸᛴᛶᛳ:Z

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lxhss/ᛸᛸᛳᛳ;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p1, Lxhss/ᛸᛸᛳᛳ;

    .line 9
    .line 10
    invoke-virtual {p0}, Lxhss/ᛱᛱᛶᲁ;->ᲇᛶᛴᲀ()Lxhss/ᛲᛵᲀᲈ;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1}, Lxhss/ᛱᛱᛶᲁ;->ᲇᛶᛴᲀ()Lxhss/ᛲᛵᲀᲈ;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Lxhss/ᛱᛱᛶᲁ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v1, p1, Lxhss/ᛱᛱᛶᲁ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v0, p0, Lxhss/ᛱᛱᛶᲁ;->ᲇᛶᛴᲀ:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v1, p1, Lxhss/ᛱᛱᛶᲁ;->ᲇᛶᛴᲀ:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    iget-object p0, p0, Lxhss/ᛱᛱᛶᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 45
    .line 46
    iget-object p1, p1, Lxhss/ᛱᛱᛶᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-static {p0, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_2

    .line 53
    .line 54
    :goto_0
    const/4 p0, 0x1

    .line 55
    return p0

    .line 56
    :cond_1
    instance-of v0, p1, Lxhss/ᛴᛲᛱᲇ;

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    invoke-virtual {p0}, Lxhss/ᛸᛸᛳᛳ;->ᲀᲇᛳᲁ()Lxhss/ᲁᛶᛳᲀ;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    return p0

    .line 69
    :cond_2
    const/4 p0, 0x0

    .line 70
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxhss/ᛱᛱᛶᲁ;->ᲇᛶᛴᲀ()Lxhss/ᛲᛵᲀᲈ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Lxhss/ᛱᛱᛶᲁ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object p0, p0, Lxhss/ᛱᛱᛶᲁ;->ᲇᛶᛴᲀ:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    add-int/2addr p0, v1

    .line 27
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxhss/ᛸᛸᛳᛳ;->ᲀᲇᛳᲁ()Lxhss/ᲁᛶᛳᲀ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eq v0, p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, "property "

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lxhss/ᛱᛱᛶᲁ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p0, " (Kotlin reflection is not available)"

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public final ᲀᲇᛳᲁ()Lxhss/ᲁᛶᛳᲀ;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lxhss/ᛸᛸᛳᛳ;->ᛸᛴᛶᛳ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget-object v0, p0, Lxhss/ᛱᛱᛶᲁ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛶᛳᲀ;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lxhss/ᛱᛱᛶᲁ;->ᛷᛴᛷᛱ()Lxhss/ᲁᛶᛳᲀ;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lxhss/ᛱᛱᛶᲁ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛶᛳᲀ;

    .line 15
    .line 16
    :cond_1
    return-object v0
.end method
