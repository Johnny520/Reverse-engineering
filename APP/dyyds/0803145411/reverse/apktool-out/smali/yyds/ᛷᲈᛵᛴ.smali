.class public final Lyyds/ᛷᲈᛵᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:Z

.field public final ᛲᲈᲁ:I

.field public final ᛵᛸᛸᛷ:Ljava/lang/String;

.field public final ᛶᛷᛲᲁ:J

.field public final ᲀᛲᛳᲀ:Ljava/lang/String;

.field public final ᲇᲇᲇᛱ:Z

.field public final ᲇᲈᛵᛷ:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lyyds/ᛷᲈᛵᛴ;->ᛲᲈᲁ:I

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛷᲈᛵᛴ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᛷᲈᛵᛴ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lyyds/ᛷᲈᛵᛴ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 11
    .line 12
    iput-boolean p5, p0, Lyyds/ᛷᲈᛵᛴ;->ᛲᛴᛳᛲ:Z

    .line 13
    .line 14
    iput-boolean p6, p0, Lyyds/ᛷᲈᛵᛴ;->ᲇᲇᲇᛱ:Z

    .line 15
    .line 16
    iput-wide p7, p0, Lyyds/ᛷᲈᛵᛴ;->ᛶᛷᛲᲁ:J

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lyyds/ᛷᲈᛵᛴ;

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
    check-cast p1, Lyyds/ᛷᲈᛵᛴ;

    .line 12
    .line 13
    iget v1, p0, Lyyds/ᛷᲈᛵᛴ;->ᛲᲈᲁ:I

    .line 14
    .line 15
    iget v3, p1, Lyyds/ᛷᲈᛵᛴ;->ᛲᲈᲁ:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, Lyyds/ᛷᲈᛵᛴ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v3, p1, Lyyds/ᛷᲈᛵᛴ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v1, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-object v1, p0, Lyyds/ᛷᲈᛵᛴ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v3, p1, Lyyds/ᛷᲈᛵᛴ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v1, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-object v1, p0, Lyyds/ᛷᲈᛵᛴ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v3, p1, Lyyds/ᛷᲈᛵᛴ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v1, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    iget-boolean v1, p0, Lyyds/ᛷᲈᛵᛴ;->ᛲᛴᛳᛲ:Z

    .line 54
    .line 55
    iget-boolean v3, p1, Lyyds/ᛷᲈᛵᛴ;->ᛲᛴᛳᛲ:Z

    .line 56
    .line 57
    if-eq v1, v3, :cond_6

    .line 58
    .line 59
    return v2

    .line 60
    :cond_6
    iget-boolean v1, p0, Lyyds/ᛷᲈᛵᛴ;->ᲇᲇᲇᛱ:Z

    .line 61
    .line 62
    iget-boolean v3, p1, Lyyds/ᛷᲈᛵᛴ;->ᲇᲇᲇᛱ:Z

    .line 63
    .line 64
    if-eq v1, v3, :cond_7

    .line 65
    .line 66
    return v2

    .line 67
    :cond_7
    iget-wide v3, p0, Lyyds/ᛷᲈᛵᛴ;->ᛶᛷᛲᲁ:J

    .line 68
    .line 69
    iget-wide p0, p1, Lyyds/ᛷᲈᛵᛴ;->ᛶᛷᛲᲁ:J

    .line 70
    .line 71
    cmp-long p0, v3, p0

    .line 72
    .line 73
    if-eqz p0, :cond_8

    .line 74
    .line 75
    return v2

    .line 76
    :cond_8
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᛷᲈᛵᛴ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

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
    const/4 v2, 0x0

    .line 11
    iget-object v3, p0, Lyyds/ᛷᲈᛵᛴ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    move v3, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    :goto_0
    add-int/2addr v0, v3

    .line 22
    mul-int/2addr v0, v1

    .line 23
    iget-object v3, p0, Lyyds/ᛷᲈᛵᛴ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 24
    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    move v3, v2

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    :goto_1
    add-int/2addr v0, v3

    .line 34
    mul-int/2addr v0, v1

    .line 35
    iget-object v3, p0, Lyyds/ᛷᲈᛵᛴ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 36
    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    :goto_2
    add-int/2addr v0, v2

    .line 45
    mul-int/2addr v0, v1

    .line 46
    iget-boolean v2, p0, Lyyds/ᛷᲈᛵᛴ;->ᛲᛴᛳᛲ:Z

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, Lyyds/ᲀᲁᲈᲇ;->ᲇᲈᛵᛷ(IIZ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, Lyyds/ᛷᲈᛵᛴ;->ᲇᲇᲇᛱ:Z

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, Lyyds/ᲀᲁᲈᲇ;->ᲇᲈᛵᛷ(IIZ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-wide v1, p0, Lyyds/ᛷᲈᛵᛴ;->ᛶᛷᛲᲁ:J

    .line 59
    .line 60
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    add-int/2addr p0, v0

    .line 65
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-wide v1, -0x36378e68a836eL

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
    iget v1, p0, Lyyds/ᛷᲈᛵᛴ;->ᛲᲈᲁ:I

    .line 16
    .line 17
    const-wide v2, -0x3639ae68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lyyds/ᛷᲈᛵᛴ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 26
    .line 27
    const-wide v2, -0x363a9e68a836eL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1, v2, v3}, Lyyds/ᛴᛷᛷᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lyyds/ᛷᲈᛵᛴ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 36
    .line 37
    const-wide v2, -0x363b9e68a836eL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1, v2, v3}, Lyyds/ᛴᛷᛷᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lyyds/ᛷᲈᛵᛴ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 46
    .line 47
    const-wide v2, -0x363c7e68a836eL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1, v2, v3}, Lyyds/ᛴᛷᛷᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 53
    .line 54
    .line 55
    iget-boolean v1, p0, Lyyds/ᛷᲈᛵᛴ;->ᛲᛴᛳᛲ:Z

    .line 56
    .line 57
    const-wide v2, -0x363d2e68a836eL

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;ZJ)V

    .line 63
    .line 64
    .line 65
    iget-boolean v1, p0, Lyyds/ᛷᲈᛵᛴ;->ᲇᲇᲇᛱ:Z

    .line 66
    .line 67
    const-wide v2, -0x363dfe68a836eL

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;ZJ)V

    .line 73
    .line 74
    .line 75
    iget-wide v1, p0, Lyyds/ᛷᲈᛵᛴ;->ᛶᛷᛲᲁ:J

    .line 76
    .line 77
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const/16 p0, 0x29

    .line 81
    .line 82
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0
.end method
