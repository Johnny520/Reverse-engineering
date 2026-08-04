.class public final Lyyds/ᲈᛳᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᛴᛳᛲ:Z

.field public final ᛲᲈᲁ:Lyyds/ᛴᛵᲈᛴ;

.field public final ᛵᛸᛸᛷ:Lyyds/ᛳᛵᲇᛷ;

.field public ᛶᛷᛲᲁ:Z

.field public final ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛳᛶ;

.field public ᲇᲇᲇᛱ:I

.field public ᲇᲈᛵᛷ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lyyds/ᛴᛵᲈᛴ;Lyyds/ᛳᛵᲇᛷ;Lyyds/ᛵᲇᛳᛶ;)V
    .locals 2

    .line 1
    const-wide v0, -0x3d2b5e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x3d2bae68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    const-wide v0, -0x3d2c9e68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lyyds/ᲈᛳᛲ;->ᛲᲈᲁ:Lyyds/ᛴᛵᲈᛴ;

    .line 29
    .line 30
    iput-object p2, p0, Lyyds/ᲈᛳᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛵᲇᛷ;

    .line 31
    .line 32
    iput-object p3, p0, Lyyds/ᲈᛳᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛳᛶ;

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    iput-object p1, p0, Lyyds/ᲈᛳᛲ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    iput-boolean p1, p0, Lyyds/ᲈᛳᛲ;->ᛲᛴᛳᛲ:Z

    .line 39
    .line 40
    iput p1, p0, Lyyds/ᲈᛳᛲ;->ᲇᲇᲇᛱ:I

    .line 41
    .line 42
    iput-boolean p1, p0, Lyyds/ᲈᛳᛲ;->ᛶᛷᛲᲁ:Z

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lyyds/ᲈᛳᛲ;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Lyyds/ᲈᛳᛲ;

    .line 11
    .line 12
    iget-object v0, p0, Lyyds/ᲈᛳᛲ;->ᛲᲈᲁ:Lyyds/ᛴᛵᲈᛴ;

    .line 13
    .line 14
    iget-object v2, p1, Lyyds/ᲈᛳᛲ;->ᛲᲈᲁ:Lyyds/ᛴᛵᲈᛴ;

    .line 15
    .line 16
    if-eq v0, v2, :cond_2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_2
    iget-object v0, p0, Lyyds/ᲈᛳᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛵᲇᛷ;

    .line 20
    .line 21
    iget-object v2, p1, Lyyds/ᲈᛳᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛵᲇᛷ;

    .line 22
    .line 23
    if-eq v0, v2, :cond_3

    .line 24
    .line 25
    return v1

    .line 26
    :cond_3
    iget-object v0, p0, Lyyds/ᲈᛳᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛳᛶ;

    .line 27
    .line 28
    iget-object v2, p1, Lyyds/ᲈᛳᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛳᛶ;

    .line 29
    .line 30
    if-eq v0, v2, :cond_4

    .line 31
    .line 32
    return v1

    .line 33
    :cond_4
    iget-object v0, p0, Lyyds/ᲈᛳᛲ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v2, p1, Lyyds/ᲈᛳᛲ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v0, v2}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_5

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_5
    iget-boolean v0, p0, Lyyds/ᲈᛳᛲ;->ᛲᛴᛳᛲ:Z

    .line 45
    .line 46
    iget-boolean v2, p1, Lyyds/ᲈᛳᛲ;->ᛲᛴᛳᛲ:Z

    .line 47
    .line 48
    if-eq v0, v2, :cond_6

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_6
    iget v0, p0, Lyyds/ᲈᛳᛲ;->ᲇᲇᲇᛱ:I

    .line 52
    .line 53
    iget v2, p1, Lyyds/ᲈᛳᛲ;->ᲇᲇᲇᛱ:I

    .line 54
    .line 55
    if-eq v0, v2, :cond_7

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_7
    iget-boolean p0, p0, Lyyds/ᲈᛳᛲ;->ᛶᛷᛲᲁ:Z

    .line 59
    .line 60
    iget-boolean p1, p1, Lyyds/ᲈᛳᛲ;->ᛶᛷᛲᲁ:Z

    .line 61
    .line 62
    if-eq p0, p1, :cond_8

    .line 63
    .line 64
    :goto_0
    return v1

    .line 65
    :cond_8
    :goto_1
    const/4 p0, 0x1

    .line 66
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᲈᛳᛲ;->ᛲᲈᲁ:Lyyds/ᛴᛵᲈᛴ;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget-object v2, p0, Lyyds/ᲈᛳᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛵᲇᛷ;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, Lyyds/ᲈᛳᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛳᛶ;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget-object v2, p0, Lyyds/ᲈᛳᛲ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 27
    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    :goto_0
    add-int/2addr v0, v2

    .line 37
    mul-int/2addr v0, v1

    .line 38
    iget-boolean v2, p0, Lyyds/ᲈᛳᛲ;->ᛲᛴᛳᛲ:Z

    .line 39
    .line 40
    invoke-static {v0, v1, v2}, Lyyds/ᲀᲁᲈᲇ;->ᲇᲈᛵᛷ(IIZ)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget v2, p0, Lyyds/ᲈᛳᛲ;->ᲇᲇᲇᛱ:I

    .line 45
    .line 46
    invoke-static {v2, v0, v1}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛳᲀ(III)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-boolean p0, p0, Lyyds/ᲈᛳᛲ;->ᛶᛷᛲᲁ:Z

    .line 51
    .line 52
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    add-int/2addr p0, v0

    .line 57
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-wide v1, -0x3d2fbe68a836eL

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
    iget-object v1, p0, Lyyds/ᲈᛳᛲ;->ᛲᲈᲁ:Lyyds/ᛴᛵᲈᛴ;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-wide v1, -0x3d30de68a836eL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lyyds/ᲈᛳᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛵᲇᛷ;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-wide v1, -0x3d31fe68a836eL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lyyds/ᲈᛳᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛳᛶ;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-wide v1, -0x3d331e68a836eL

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lyyds/ᲈᛳᛲ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 67
    .line 68
    const-wide v2, -0x3d347e68a836eL

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    invoke-static {v0, v1, v2, v3}, Lyyds/ᛴᛷᛷᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 74
    .line 75
    .line 76
    iget-boolean v1, p0, Lyyds/ᲈᛳᛲ;->ᛲᛴᛳᛲ:Z

    .line 77
    .line 78
    const-wide v2, -0x3d351e68a836eL

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;ZJ)V

    .line 84
    .line 85
    .line 86
    iget v1, p0, Lyyds/ᲈᛳᛲ;->ᲇᲇᲇᛱ:I

    .line 87
    .line 88
    const-wide v2, -0x3d363e68a836eL

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 94
    .line 95
    .line 96
    iget-boolean p0, p0, Lyyds/ᲈᛳᛲ;->ᛶᛷᛲᲁ:Z

    .line 97
    .line 98
    const/16 v1, 0x29

    .line 99
    .line 100
    invoke-static {v0, p0, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛱᛳᲇ(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0
.end method
