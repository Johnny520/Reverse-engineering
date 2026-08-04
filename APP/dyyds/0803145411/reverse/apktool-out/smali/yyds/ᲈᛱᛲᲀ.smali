.class public final Lyyds/ᲈᛱᛲᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:I

.field public final ᛲᲈᲁ:Z

.field public final ᛵᛸᛸᛷ:I

.field public final ᛶᛷᛲᲁ:Z

.field public final ᲀᛲᛳᲀ:I

.field public final ᲇᲇᲇᛱ:Ljava/util/ArrayList;

.field public final ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(ZIIIILjava/util/ArrayList;Z)V
    .locals 2

    .line 1
    const-wide v0, -0x6215fe68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-boolean p1, p0, Lyyds/ᲈᛱᛲᲀ;->ᛲᲈᲁ:Z

    .line 13
    .line 14
    iput p2, p0, Lyyds/ᲈᛱᛲᲀ;->ᛵᛸᛸᛷ:I

    .line 15
    .line 16
    iput p3, p0, Lyyds/ᲈᛱᛲᲀ;->ᲀᛲᛳᲀ:I

    .line 17
    .line 18
    iput p4, p0, Lyyds/ᲈᛱᛲᲀ;->ᲇᲈᛵᛷ:I

    .line 19
    .line 20
    iput p5, p0, Lyyds/ᲈᛱᛲᲀ;->ᛲᛴᛳᛲ:I

    .line 21
    .line 22
    iput-object p6, p0, Lyyds/ᲈᛱᛲᲀ;->ᲇᲇᲇᛱ:Ljava/util/ArrayList;

    .line 23
    .line 24
    iput-boolean p7, p0, Lyyds/ᲈᛱᛲᲀ;->ᛶᛷᛲᲁ:Z

    .line 25
    .line 26
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
    instance-of v0, p1, Lyyds/ᲈᛱᛲᲀ;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lyyds/ᲈᛱᛲᲀ;

    .line 10
    .line 11
    iget-boolean v0, p0, Lyyds/ᲈᛱᛲᲀ;->ᛲᲈᲁ:Z

    .line 12
    .line 13
    iget-boolean v1, p1, Lyyds/ᲈᛱᛲᲀ;->ᛲᲈᲁ:Z

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget v0, p0, Lyyds/ᲈᛱᛲᲀ;->ᛵᛸᛸᛷ:I

    .line 19
    .line 20
    iget v1, p1, Lyyds/ᲈᛱᛲᲀ;->ᛵᛸᛸᛷ:I

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget v0, p0, Lyyds/ᲈᛱᛲᲀ;->ᲀᛲᛳᲀ:I

    .line 26
    .line 27
    iget v1, p1, Lyyds/ᲈᛱᛲᲀ;->ᲀᛲᛳᲀ:I

    .line 28
    .line 29
    if-eq v0, v1, :cond_4

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_4
    iget v0, p0, Lyyds/ᲈᛱᛲᲀ;->ᲇᲈᛵᛷ:I

    .line 33
    .line 34
    iget v1, p1, Lyyds/ᲈᛱᛲᲀ;->ᲇᲈᛵᛷ:I

    .line 35
    .line 36
    if-eq v0, v1, :cond_5

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_5
    iget v0, p0, Lyyds/ᲈᛱᛲᲀ;->ᛲᛴᛳᛲ:I

    .line 40
    .line 41
    iget v1, p1, Lyyds/ᲈᛱᛲᲀ;->ᛲᛴᛳᛲ:I

    .line 42
    .line 43
    if-eq v0, v1, :cond_6

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_6
    iget-object v0, p0, Lyyds/ᲈᛱᛲᲀ;->ᲇᲇᲇᛱ:Ljava/util/ArrayList;

    .line 47
    .line 48
    iget-object v1, p1, Lyyds/ᲈᛱᛲᲀ;->ᲇᲇᲇᛱ:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_7

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_7
    iget-boolean p0, p0, Lyyds/ᲈᛱᛲᲀ;->ᛶᛷᛲᲁ:Z

    .line 58
    .line 59
    iget-boolean p1, p1, Lyyds/ᲈᛱᛲᲀ;->ᛶᛷᛲᲁ:Z

    .line 60
    .line 61
    if-eq p0, p1, :cond_8

    .line 62
    .line 63
    :goto_0
    const/4 p0, 0x0

    .line 64
    return p0

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
    iget-boolean v0, p0, Lyyds/ᲈᛱᛲᲀ;->ᛲᲈᲁ:Z

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
    iget v2, p0, Lyyds/ᲈᛱᛲᲀ;->ᛵᛸᛸᛷ:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛳᲀ(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lyyds/ᲈᛱᛲᲀ;->ᲀᛲᛳᲀ:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛳᲀ(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lyyds/ᲈᛱᛲᲀ;->ᲇᲈᛵᛷ:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛳᲀ(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, Lyyds/ᲈᛱᛲᲀ;->ᛲᛴᛳᛲ:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛳᲀ(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lyyds/ᲈᛱᛲᲀ;->ᲇᲇᲇᛱ:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v2, v0

    .line 41
    mul-int/2addr v2, v1

    .line 42
    iget-boolean p0, p0, Lyyds/ᲈᛱᛲᲀ;->ᛶᛷᛲᲁ:Z

    .line 43
    .line 44
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    add-int/2addr p0, v2

    .line 49
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-wide v1, -0x6216de68a836eL

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
    iget-boolean v1, p0, Lyyds/ᲈᛱᛲᲀ;->ᛲᲈᲁ:Z

    .line 16
    .line 17
    const-wide v2, -0x62182e68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;ZJ)V

    .line 23
    .line 24
    .line 25
    iget v1, p0, Lyyds/ᲈᛱᛲᲀ;->ᛵᛸᛸᛷ:I

    .line 26
    .line 27
    const-wide v2, -0x62191e68a836eL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 33
    .line 34
    .line 35
    iget v1, p0, Lyyds/ᲈᛱᛲᲀ;->ᲀᛲᛳᲀ:I

    .line 36
    .line 37
    const-wide v2, -0x621a1e68a836eL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 43
    .line 44
    .line 45
    iget v1, p0, Lyyds/ᲈᛱᛲᲀ;->ᲇᲈᛵᛷ:I

    .line 46
    .line 47
    const-wide v2, -0x621aee68a836eL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 53
    .line 54
    .line 55
    iget v1, p0, Lyyds/ᲈᛱᛲᲀ;->ᛲᛴᛳᛲ:I

    .line 56
    .line 57
    const-wide v2, -0x621c1e68a836eL

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lyyds/ᲈᛱᛲᲀ;->ᲇᲇᲇᛱ:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-wide v1, -0x621cbe68a836eL

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    iget-boolean p0, p0, Lyyds/ᲈᛱᛲᲀ;->ᛶᛷᛲᲁ:Z

    .line 83
    .line 84
    const/16 v1, 0x29

    .line 85
    .line 86
    invoke-static {v0, p0, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛱᛳᲇ(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0
.end method
