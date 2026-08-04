.class public final Lyyds/ᲈᛶᛵᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field private final ᛲᛴᛳᛲ:Ljava/lang/String;
    .annotation runtime Lyyds/ᛴᛱᛷᛳ;
        value = "chineseName"
    .end annotation
.end field

.field private final ᛲᲈᲁ:Ljava/lang/String;
    .annotation runtime Lyyds/ᛴᛱᛷᛳ;
        value = "englishName"
    .end annotation
.end field

.field private final ᛵᛸᛸᛷ:Ljava/lang/String;
    .annotation runtime Lyyds/ᛴᛱᛷᛳ;
        value = "code2"
    .end annotation
.end field

.field private final ᲀᛲᛳᲀ:Ljava/lang/String;
    .annotation runtime Lyyds/ᛴᛱᛷᛳ;
        value = "code3"
    .end annotation
.end field

.field private final ᲇᲇᲇᛱ:Ljava/lang/String;
    .annotation runtime Lyyds/ᛴᛱᛷᛳ;
        value = "phoneCode"
    .end annotation
.end field

.field private final ᲇᲈᛵᛷ:Ljava/lang/String;
    .annotation runtime Lyyds/ᛴᛱᛷᛳ;
        value = "numericCode"
    .end annotation
.end field


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
    instance-of v1, p1, Lyyds/ᲈᛶᛵᛳ;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lyyds/ᲈᛶᛵᛳ;

    .line 12
    .line 13
    iget-object v1, p0, Lyyds/ᲈᛶᛵᛳ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lyyds/ᲈᛶᛵᛳ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lyyds/ᲈᛶᛵᛳ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lyyds/ᲈᛶᛵᛳ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lyyds/ᲈᛶᛵᛳ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lyyds/ᲈᛶᛵᛳ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lyyds/ᲈᛶᛵᛳ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lyyds/ᲈᛶᛵᛳ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Lyyds/ᲈᛶᛵᛳ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, p1, Lyyds/ᲈᛶᛵᛳ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget-object p0, p0, Lyyds/ᲈᛶᛵᛳ;->ᲇᲇᲇᛱ:Ljava/lang/String;

    .line 69
    .line 70
    iget-object p1, p1, Lyyds/ᲈᛶᛵᛳ;->ᲇᲇᲇᛱ:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {p0, p1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-nez p0, :cond_7

    .line 77
    .line 78
    return v2

    .line 79
    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᲈᛶᛵᛳ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lyyds/ᲈᛶᛵᛳ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛶᛷᛲᲁ(Ljava/lang/String;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lyyds/ᲈᛶᛵᛳ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛶᛷᛲᲁ(Ljava/lang/String;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lyyds/ᲈᛶᛵᛳ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛶᛷᛲᲁ(Ljava/lang/String;II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lyyds/ᲈᛶᛵᛳ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛶᛷᛲᲁ(Ljava/lang/String;II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object p0, p0, Lyyds/ᲈᛶᛵᛳ;->ᲇᲇᲇᛱ:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    add-int/2addr p0, v0

    .line 41
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-wide v1, -0x54087e68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lyyds/ᲈᛶᛵᛳ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 16
    .line 17
    const-wide v2, -0x5409ce68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, Lyyds/ᛴᛷᛷᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lyyds/ᲈᛶᛵᛳ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 26
    .line 27
    const-wide v2, -0x540a5e68a836eL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1, v2, v3}, Lyyds/ᛴᛷᛷᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lyyds/ᲈᛶᛵᛳ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 36
    .line 37
    const-wide v2, -0x540aee68a836eL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1, v2, v3}, Lyyds/ᛴᛷᛷᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lyyds/ᲈᛶᛵᛳ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 46
    .line 47
    const-wide v2, -0x540bde68a836eL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1, v2, v3}, Lyyds/ᛴᛷᛷᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lyyds/ᲈᛶᛵᛳ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 56
    .line 57
    const-wide v2, -0x540cce68a836eL

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    invoke-static {v0, v1, v2, v3}, Lyyds/ᛴᛷᛷᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 63
    .line 64
    .line 65
    iget-object p0, p0, Lyyds/ᲈᛶᛵᛳ;->ᲇᲇᲇᛱ:Ljava/lang/String;

    .line 66
    .line 67
    const/16 v1, 0x29

    .line 68
    .line 69
    invoke-static {v0, p0, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛷᛵᲇᲀ(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method

.method public final ᛲᲈᲁ()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲈᛶᛵᛳ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛵᛸᛸᛷ()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲈᛶᛵᛳ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲀᛲᛳᲀ()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲈᛶᛵᛳ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
