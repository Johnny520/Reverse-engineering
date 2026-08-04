.class public final Lyyds/ᛳᛷᛶᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:I

.field public final ᛲᲈᲁ:Z

.field public final ᛵᛸᛸᛷ:Ljava/lang/String;

.field public final ᛶᛷᛲᲁ:Ljava/lang/String;

.field public final ᲀᛲᛳᲀ:I

.field public final ᲇᲇᲇᛱ:Z

.field public final ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(ZLjava/lang/String;IIIZLjava/lang/String;I)V
    .locals 3

    .line 1
    and-int/lit8 v0, p8, 0x2

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object p2, v1

    .line 7
    :cond_0
    and-int/lit8 v0, p8, 0x4

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    move p3, v2

    .line 13
    :cond_1
    and-int/lit8 v0, p8, 0x8

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    move p4, v2

    .line 18
    :cond_2
    and-int/lit8 v0, p8, 0x10

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    move p5, v2

    .line 23
    :cond_3
    and-int/lit8 v0, p8, 0x20

    .line 24
    .line 25
    if-eqz v0, :cond_4

    .line 26
    .line 27
    move p6, v2

    .line 28
    :cond_4
    and-int/lit8 p8, p8, 0x40

    .line 29
    .line 30
    if-eqz p8, :cond_5

    .line 31
    .line 32
    move-object p7, v1

    .line 33
    :cond_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-boolean p1, p0, Lyyds/ᛳᛷᛶᛴ;->ᛲᲈᲁ:Z

    .line 37
    .line 38
    iput-object p2, p0, Lyyds/ᛳᛷᛶᛴ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 39
    .line 40
    iput p3, p0, Lyyds/ᛳᛷᛶᛴ;->ᲀᛲᛳᲀ:I

    .line 41
    .line 42
    iput p4, p0, Lyyds/ᛳᛷᛶᛴ;->ᲇᲈᛵᛷ:I

    .line 43
    .line 44
    iput p5, p0, Lyyds/ᛳᛷᛶᛴ;->ᛲᛴᛳᛲ:I

    .line 45
    .line 46
    iput-boolean p6, p0, Lyyds/ᛳᛷᛶᛴ;->ᲇᲇᲇᛱ:Z

    .line 47
    .line 48
    iput-object p7, p0, Lyyds/ᛳᛷᛶᛴ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lyyds/ᛳᛷᛶᛴ;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lyyds/ᛳᛷᛶᛴ;

    .line 10
    .line 11
    iget-boolean v0, p0, Lyyds/ᛳᛷᛶᛴ;->ᛲᲈᲁ:Z

    .line 12
    .line 13
    iget-boolean v1, p1, Lyyds/ᛳᛷᛶᛴ;->ᛲᲈᲁ:Z

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-object v0, p0, Lyyds/ᛳᛷᛶᛴ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v1, p1, Lyyds/ᛳᛷᛶᛴ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v0, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget v0, p0, Lyyds/ᛳᛷᛶᛴ;->ᲀᛲᛳᲀ:I

    .line 30
    .line 31
    iget v1, p1, Lyyds/ᛳᛷᛶᛴ;->ᲀᛲᛳᲀ:I

    .line 32
    .line 33
    if-eq v0, v1, :cond_4

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_4
    iget v0, p0, Lyyds/ᛳᛷᛶᛴ;->ᲇᲈᛵᛷ:I

    .line 37
    .line 38
    iget v1, p1, Lyyds/ᛳᛷᛶᛴ;->ᲇᲈᛵᛷ:I

    .line 39
    .line 40
    if-eq v0, v1, :cond_5

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_5
    iget v0, p0, Lyyds/ᛳᛷᛶᛴ;->ᛲᛴᛳᛲ:I

    .line 44
    .line 45
    iget v1, p1, Lyyds/ᛳᛷᛶᛴ;->ᛲᛴᛳᛲ:I

    .line 46
    .line 47
    if-eq v0, v1, :cond_6

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_6
    iget-boolean v0, p0, Lyyds/ᛳᛷᛶᛴ;->ᲇᲇᲇᛱ:Z

    .line 51
    .line 52
    iget-boolean v1, p1, Lyyds/ᛳᛷᛶᛴ;->ᲇᲇᲇᛱ:Z

    .line 53
    .line 54
    if-eq v0, v1, :cond_7

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_7
    iget-object p0, p0, Lyyds/ᛳᛷᛶᛴ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 58
    .line 59
    iget-object p1, p1, Lyyds/ᛳᛷᛶᛴ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {p0, p1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-nez p0, :cond_8

    .line 66
    .line 67
    :goto_0
    const/4 p0, 0x0

    .line 68
    return p0

    .line 69
    :cond_8
    :goto_1
    const/4 p0, 0x1

    .line 70
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-boolean v0, p0, Lyyds/ᛳᛷᛶᛴ;->ᛲᲈᲁ:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-object v3, p0, Lyyds/ᛳᛷᛶᛴ;->ᛵᛸᛸᛷ:Ljava/lang/String;

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
    iget v3, p0, Lyyds/ᛳᛷᛶᛴ;->ᲀᛲᛳᲀ:I

    .line 24
    .line 25
    invoke-static {v3, v0, v1}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛳᲀ(III)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget v3, p0, Lyyds/ᛳᛷᛶᛴ;->ᲇᲈᛵᛷ:I

    .line 30
    .line 31
    invoke-static {v3, v0, v1}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛳᲀ(III)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget v3, p0, Lyyds/ᛳᛷᛶᛴ;->ᛲᛴᛳᛲ:I

    .line 36
    .line 37
    invoke-static {v3, v0, v1}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛳᲀ(III)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-boolean v3, p0, Lyyds/ᛳᛷᛶᛴ;->ᲇᲇᲇᛱ:Z

    .line 42
    .line 43
    invoke-static {v0, v1, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲇᲈᛵᛷ(IIZ)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget-object p0, p0, Lyyds/ᛳᛷᛶᛴ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 48
    .line 49
    if-nez p0, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    :goto_1
    add-int/2addr v0, v2

    .line 57
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-wide v1, -0x61e1fe68a836eL

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
    iget-boolean v1, p0, Lyyds/ᛳᛷᛶᛴ;->ᛲᲈᲁ:Z

    .line 16
    .line 17
    const-wide v2, -0x61e36e68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;ZJ)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lyyds/ᛳᛷᛶᛴ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 26
    .line 27
    const-wide v2, -0x61e44e68a836eL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1, v2, v3}, Lyyds/ᛴᛷᛷᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 33
    .line 34
    .line 35
    iget v1, p0, Lyyds/ᛳᛷᛶᛴ;->ᲀᛲᛳᲀ:I

    .line 36
    .line 37
    const-wide v2, -0x61e52e68a836eL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 43
    .line 44
    .line 45
    iget v1, p0, Lyyds/ᛳᛷᛶᛴ;->ᲇᲈᛵᛷ:I

    .line 46
    .line 47
    const-wide v2, -0x61e5be68a836eL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 53
    .line 54
    .line 55
    iget v1, p0, Lyyds/ᛳᛷᛶᛴ;->ᛲᛴᛳᛲ:I

    .line 56
    .line 57
    const-wide v2, -0x61e65e68a836eL

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 63
    .line 64
    .line 65
    iget-boolean v1, p0, Lyyds/ᛳᛷᛶᛴ;->ᲇᲇᲇᛱ:Z

    .line 66
    .line 67
    const-wide v2, -0x61e78e68a836eL

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;ZJ)V

    .line 73
    .line 74
    .line 75
    iget-object p0, p0, Lyyds/ᛳᛷᛶᛴ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 76
    .line 77
    const/16 v1, 0x29

    .line 78
    .line 79
    invoke-static {v0, p0, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛷᛵᲇᲀ(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method
