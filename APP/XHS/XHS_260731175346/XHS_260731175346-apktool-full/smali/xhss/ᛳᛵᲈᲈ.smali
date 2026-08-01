.class public final Lxhss/ᛳᛵᲈᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛴᛵᛳᛵ;
.implements Ljava/io/Serializable;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᛴᛵᛳᛵ;

.field public final ᛳᲁᲇᛸ:Lxhss/ᛳᛵᲈᛲ;


# direct methods
.method public constructor <init>(Lxhss/ᛴᛵᛳᛵ;Lxhss/ᛳᛵᲈᛲ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛳᛵᲈᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛵᛳᛵ;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᛳᛵᲈᲈ;->ᛳᲁᲇᛸ:Lxhss/ᛳᛵᲈᛲ;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    if-eq p0, p1, :cond_7

    .line 2
    .line 3
    instance-of v0, p1, Lxhss/ᛳᛵᲈᲈ;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_6

    .line 7
    .line 8
    check-cast p1, Lxhss/ᛳᛵᲈᲈ;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    move-object v2, p1

    .line 12
    move v3, v0

    .line 13
    :goto_0
    iget-object v2, v2, Lxhss/ᛳᛵᲈᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛵᛳᛵ;

    .line 14
    .line 15
    instance-of v4, v2, Lxhss/ᛳᛵᲈᲈ;

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    check-cast v2, Lxhss/ᛳᛵᲈᲈ;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    move-object v2, v5

    .line 24
    :goto_1
    if-nez v2, :cond_5

    .line 25
    .line 26
    move-object v2, p0

    .line 27
    :goto_2
    iget-object v2, v2, Lxhss/ᛳᛵᲈᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛵᛳᛵ;

    .line 28
    .line 29
    instance-of v4, v2, Lxhss/ᛳᛵᲈᲈ;

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    check-cast v2, Lxhss/ᛳᛵᲈᲈ;

    .line 34
    .line 35
    goto :goto_3

    .line 36
    :cond_1
    move-object v2, v5

    .line 37
    :goto_3
    if-nez v2, :cond_4

    .line 38
    .line 39
    if-ne v3, v0, :cond_6

    .line 40
    .line 41
    :goto_4
    iget-object v0, p0, Lxhss/ᛳᛵᲈᲈ;->ᛳᲁᲇᛸ:Lxhss/ᛳᛵᲈᛲ;

    .line 42
    .line 43
    invoke-interface {v0}, Lxhss/ᛳᛵᲈᛲ;->getKey()Lxhss/ᲇᲁᛵᲈ;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {p1, v2}, Lxhss/ᛳᛵᲈᲈ;->ᲇᛴᲇᛵ(Lxhss/ᲇᲁᛵᲈ;)Lxhss/ᛳᛵᲈᛲ;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v2, v0}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    move p0, v1

    .line 58
    goto :goto_5

    .line 59
    :cond_2
    iget-object p0, p0, Lxhss/ᛳᛵᲈᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛵᛳᛵ;

    .line 60
    .line 61
    instance-of v0, p0, Lxhss/ᛳᛵᲈᲈ;

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    check-cast p0, Lxhss/ᛳᛵᲈᲈ;

    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_3
    check-cast p0, Lxhss/ᛳᛵᲈᛲ;

    .line 69
    .line 70
    invoke-interface {p0}, Lxhss/ᛳᛵᲈᛲ;->getKey()Lxhss/ᲇᲁᛵᲈ;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p1, v0}, Lxhss/ᛳᛵᲈᲈ;->ᲇᛴᲇᛵ(Lxhss/ᲇᲁᛵᲈ;)Lxhss/ᛳᛵᲈᛲ;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {p1, p0}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    :goto_5
    if-eqz p0, :cond_6

    .line 83
    .line 84
    goto :goto_6

    .line 85
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_6
    return v1

    .line 92
    :cond_7
    :goto_6
    const/4 p0, 0x1

    .line 93
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lxhss/ᛳᛵᲈᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛵᛳᛵ;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object p0, p0, Lxhss/ᛳᛵᲈᲈ;->ᛳᲁᲇᛸ:Lxhss/ᛳᛵᲈᛲ;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    add-int/2addr p0, v0

    .line 14
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lxhss/ᲇᛵᲈᛵ;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v2}, Lxhss/ᲇᛵᲈᛵ;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const-string v2, ""

    .line 15
    .line 16
    invoke-virtual {p0, v2, v1}, Lxhss/ᛳᛵᲈᲈ;->ᛳᲁᲇᛸ(Ljava/lang/Object;Lxhss/ᛵᲇᛱᛴ;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 p0, 0x5d

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public final ᛳᲁᲇᛸ(Ljava/lang/Object;Lxhss/ᛵᲇᛱᛴ;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lxhss/ᛳᛵᲈᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛵᛳᛵ;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lxhss/ᛴᛵᛳᛵ;->ᛳᲁᲇᛸ(Ljava/lang/Object;Lxhss/ᛵᲇᛱᛴ;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p0, p0, Lxhss/ᛳᛵᲈᲈ;->ᛳᲁᲇᛸ:Lxhss/ᛳᛵᲈᛲ;

    .line 8
    .line 9
    invoke-interface {p2, p1, p0}, Lxhss/ᛵᲇᛱᛴ;->ᛳᲁᲇᛸ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final ᛸᛲᲀᛵ(Lxhss/ᲇᲁᛵᲈ;)Lxhss/ᛴᛵᛳᛵ;
    .locals 3

    .line 1
    iget-object v0, p0, Lxhss/ᛳᛵᲈᲈ;->ᛳᲁᲇᛸ:Lxhss/ᛳᛵᲈᛲ;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lxhss/ᛴᛵᛳᛵ;->ᲇᛴᲇᛵ(Lxhss/ᲇᲁᛵᲈ;)Lxhss/ᛳᛵᲈᛲ;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lxhss/ᛳᛵᲈᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛵᛳᛵ;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v2

    .line 12
    :cond_0
    invoke-interface {v2, p1}, Lxhss/ᛴᛵᛳᛵ;->ᛸᛲᲀᛵ(Lxhss/ᲇᲁᛵᲈ;)Lxhss/ᛴᛵᛳᛵ;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-ne p1, v2, :cond_1

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    sget-object p0, Lxhss/ᲇᛷᲁᛷ;->ᛱᛱᛲᲇ:Lxhss/ᲇᛷᲁᛷ;

    .line 20
    .line 21
    if-ne p1, p0, :cond_2

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_2
    new-instance p0, Lxhss/ᛳᛵᲈᲈ;

    .line 25
    .line 26
    invoke-direct {p0, p1, v0}, Lxhss/ᛳᛵᲈᲈ;-><init>(Lxhss/ᛴᛵᛳᛵ;Lxhss/ᛳᛵᲈᛲ;)V

    .line 27
    .line 28
    .line 29
    return-object p0
.end method

.method public final bridge ᲀᲇᛳᲁ(Lxhss/ᛴᛵᛳᛵ;)Lxhss/ᛴᛵᛳᛵ;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxhss/ᛱᛷᛵᛷ;->ᛸᛶᲈᛶ(Lxhss/ᛴᛵᛳᛵ;Lxhss/ᛴᛵᛳᛵ;)Lxhss/ᛴᛵᛳᛵ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final ᲇᛴᲇᛵ(Lxhss/ᲇᲁᛵᲈ;)Lxhss/ᛳᛵᲈᛲ;
    .locals 1

    .line 1
    :goto_0
    iget-object v0, p0, Lxhss/ᛳᛵᲈᲈ;->ᛳᲁᲇᛸ:Lxhss/ᛳᛵᲈᛲ;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lxhss/ᛴᛵᛳᛵ;->ᲇᛴᲇᛵ(Lxhss/ᲇᲁᛵᲈ;)Lxhss/ᛳᛵᲈᛲ;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object p0, p0, Lxhss/ᛳᛵᲈᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛵᛳᛵ;

    .line 11
    .line 12
    instance-of v0, p0, Lxhss/ᛳᛵᲈᲈ;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    check-cast p0, Lxhss/ᛳᛵᲈᲈ;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-interface {p0, p1}, Lxhss/ᛴᛵᛳᛵ;->ᲇᛴᲇᛵ(Lxhss/ᲇᲁᛵᲈ;)Lxhss/ᛳᛵᲈᛲ;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
