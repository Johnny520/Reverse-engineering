.class public final Lxhss/ᛶᲁᛱᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/io/Serializable;

.field public final ᛳᲁᲇᛸ:Lxhss/ᛱᲀᲇᛸ;

.field public final ᛷᛵᛵᲈ:Ljava/lang/String;

.field public final ᲇᛴᲇᛵ:Lxhss/ᛶᲀᲀᛵ;


# direct methods
.method public native constructor <init>(Ljava/lang/String;Ljava/io/Serializable;Lxhss/ᛱᲀᲇᛸ;Lxhss/ᛶᲀᲀᛵ;)V
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lxhss/ᛶᲁᛱᛴ;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    check-cast p1, Lxhss/ᛶᲁᛱᛴ;

    .line 12
    .line 13
    iget-object v1, p0, Lxhss/ᛶᲁᛱᛴ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lxhss/ᛶᲁᛱᛴ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    iget-object v1, p0, Lxhss/ᛶᲁᛱᛴ;->ᛱᛱᛲᲇ:Ljava/io/Serializable;

    .line 25
    .line 26
    iget-object v3, p1, Lxhss/ᛶᲁᛱᛴ;->ᛱᛱᛲᲇ:Ljava/io/Serializable;

    .line 27
    .line 28
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    :goto_0
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lxhss/ᛶᲁᛱᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛱᲀᲇᛸ;

    .line 36
    .line 37
    iget-object v3, p1, Lxhss/ᛶᲁᛱᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛱᲀᲇᛸ;

    .line 38
    .line 39
    if-eq v1, v3, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-object p0, p0, Lxhss/ᛶᲁᛱᛴ;->ᲇᛴᲇᛵ:Lxhss/ᛶᲀᲀᛵ;

    .line 43
    .line 44
    iget-object p1, p1, Lxhss/ᛶᲁᛱᛴ;->ᲇᛴᲇᛵ:Lxhss/ᛶᲀᲀᛵ;

    .line 45
    .line 46
    if-eq p0, p1, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lxhss/ᛶᲁᛱᛴ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lxhss/ᛶᲁᛱᛴ;->ᛱᛱᛲᲇ:Ljava/io/Serializable;

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
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object v0, p0, Lxhss/ᛶᲁᛱᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛱᲀᲇᛸ;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object p0, p0, Lxhss/ᛶᲁᛱᛴ;->ᲇᛴᲇᛵ:Lxhss/ᛶᲀᲀᛵ;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    add-int/2addr p0, v0

    .line 34
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-wide v1, -0xe1161b858845L

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lxhss/ᛶᲁᛱᛴ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-wide v1, -0xe1271b858845L

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lxhss/ᛶᲁᛱᛴ;->ᛱᛱᛲᲇ:Ljava/io/Serializable;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-wide v1, -0xe1371b858845L

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lxhss/ᛶᲁᛱᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛱᲀᲇᛸ;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-wide v1, -0xe1431b858845L

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object p0, p0, Lxhss/ᛶᲁᛱᛴ;->ᲇᛴᲇᛵ:Lxhss/ᛶᲀᲀᛵ;

    .line 67
    .line 68
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const/16 p0, 0x29

    .line 72
    .line 73
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0
.end method
