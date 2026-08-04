.class public final Lyyds/ᛸᛵᲈᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:Z

.field public ᛲᛳᛶᲁ:Z

.field public ᛲᛴᛳᛲ:Z

.field public final ᛲᲈᲁ:Lyyds/ᲁᛴᛸᲈ;

.field public final ᛵᛸᛸᛷ:Ljava/lang/String;

.field public ᛶᛷᛲᲁ:Z

.field public ᛷᲈᲈᲁ:J

.field public final ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

.field public ᲇᲇᲇᛱ:I

.field public ᲇᲈᛵᛷ:Ljava/util/Set;


# direct methods
.method public constructor <init>(Lyyds/ᲁᛴᛸᲈ;Ljava/lang/String;Ljava/lang/ref/WeakReference;)V
    .locals 2

    .line 1
    const-wide v0, -0x20a28e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x20a37e68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    const-wide v0, -0x20a3ee68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    const-wide v0, -0x20a48e68a836eL

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lyyds/ᛸᛵᲈᛵ;->ᛲᲈᲁ:Lyyds/ᲁᛴᛸᲈ;

    .line 37
    .line 38
    iput-object p2, p0, Lyyds/ᛸᛵᲈᛵ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 39
    .line 40
    iput-object p3, p0, Lyyds/ᛸᛵᲈᛵ;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

    .line 41
    .line 42
    sget-object p1, Lyyds/ᛶᲁᛲᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛶᲁᛲᛶ;

    .line 43
    .line 44
    iput-object p1, p0, Lyyds/ᛸᛵᲈᛵ;->ᲇᲈᛵᛷ:Ljava/util/Set;

    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    iput-boolean p1, p0, Lyyds/ᛸᛵᲈᛵ;->ᛲᛴᛳᛲ:Z

    .line 48
    .line 49
    const/4 p2, 0x3

    .line 50
    iput p2, p0, Lyyds/ᛸᛵᲈᛵ;->ᲇᲇᲇᛱ:I

    .line 51
    .line 52
    iput-boolean p1, p0, Lyyds/ᛸᛵᲈᛵ;->ᛶᛷᛲᲁ:Z

    .line 53
    .line 54
    iput-boolean p1, p0, Lyyds/ᛸᛵᲈᛵ;->ᛱᲈᲁ:Z

    .line 55
    .line 56
    iput-boolean p1, p0, Lyyds/ᛸᛵᲈᛵ;->ᛲᛳᛶᲁ:Z

    .line 57
    .line 58
    const-wide/16 p1, 0x0

    .line 59
    .line 60
    iput-wide p1, p0, Lyyds/ᛸᛵᲈᛵ;->ᛷᲈᲈᲁ:J

    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Lyyds/ᛸᛵᲈᛵ;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Lyyds/ᛸᛵᲈᛵ;

    .line 11
    .line 12
    iget-object v0, p0, Lyyds/ᛸᛵᲈᛵ;->ᛲᲈᲁ:Lyyds/ᲁᛴᛸᲈ;

    .line 13
    .line 14
    iget-object v1, p1, Lyyds/ᛸᛵᲈᛵ;->ᛲᲈᲁ:Lyyds/ᲁᛴᛸᲈ;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lyyds/ᲁᛴᛸᲈ;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget-object v0, p0, Lyyds/ᛸᛵᲈᛵ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v1, p1, Lyyds/ᛸᛵᲈᛵ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    iget-object v0, p0, Lyyds/ᛸᛵᲈᛵ;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

    .line 35
    .line 36
    iget-object v1, p1, Lyyds/ᛸᛵᲈᛵ;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_4

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_4
    iget-object v0, p0, Lyyds/ᛸᛵᲈᛵ;->ᲇᲈᛵᛷ:Ljava/util/Set;

    .line 46
    .line 47
    iget-object v1, p1, Lyyds/ᛸᛵᲈᛵ;->ᲇᲈᛵᛷ:Ljava/util/Set;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_5

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_5
    iget-boolean v0, p0, Lyyds/ᛸᛵᲈᛵ;->ᛲᛴᛳᛲ:Z

    .line 57
    .line 58
    iget-boolean v1, p1, Lyyds/ᛸᛵᲈᛵ;->ᛲᛴᛳᛲ:Z

    .line 59
    .line 60
    if-eq v0, v1, :cond_6

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_6
    iget v0, p0, Lyyds/ᛸᛵᲈᛵ;->ᲇᲇᲇᛱ:I

    .line 64
    .line 65
    iget v1, p1, Lyyds/ᛸᛵᲈᛵ;->ᲇᲇᲇᛱ:I

    .line 66
    .line 67
    if-eq v0, v1, :cond_7

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_7
    iget-boolean v0, p0, Lyyds/ᛸᛵᲈᛵ;->ᛶᛷᛲᲁ:Z

    .line 71
    .line 72
    iget-boolean v1, p1, Lyyds/ᛸᛵᲈᛵ;->ᛶᛷᛲᲁ:Z

    .line 73
    .line 74
    if-eq v0, v1, :cond_8

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_8
    iget-boolean v0, p0, Lyyds/ᛸᛵᲈᛵ;->ᛱᲈᲁ:Z

    .line 78
    .line 79
    iget-boolean v1, p1, Lyyds/ᛸᛵᲈᛵ;->ᛱᲈᲁ:Z

    .line 80
    .line 81
    if-eq v0, v1, :cond_9

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_9
    iget-boolean v0, p0, Lyyds/ᛸᛵᲈᛵ;->ᛲᛳᛶᲁ:Z

    .line 85
    .line 86
    iget-boolean v1, p1, Lyyds/ᛸᛵᲈᛵ;->ᛲᛳᛶᲁ:Z

    .line 87
    .line 88
    if-eq v0, v1, :cond_a

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_a
    iget-wide v0, p0, Lyyds/ᛸᛵᲈᛵ;->ᛷᲈᲈᲁ:J

    .line 92
    .line 93
    iget-wide p0, p1, Lyyds/ᛸᛵᲈᛵ;->ᛷᲈᲈᲁ:J

    .line 94
    .line 95
    cmp-long p0, v0, p0

    .line 96
    .line 97
    if-eqz p0, :cond_b

    .line 98
    .line 99
    :goto_0
    const/4 p0, 0x0

    .line 100
    return p0

    .line 101
    :cond_b
    :goto_1
    const/4 p0, 0x1

    .line 102
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛸᛵᲈᛵ;->ᛲᲈᲁ:Lyyds/ᲁᛴᛸᲈ;

    .line 2
    .line 3
    invoke-virtual {v0}, Lyyds/ᲁᛴᛸᲈ;->hashCode()I

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
    iget-object v2, p0, Lyyds/ᛸᛵᲈᛵ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛶᛷᛲᲁ(Ljava/lang/String;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lyyds/ᛸᛵᲈᛵ;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    iget-object v0, p0, Lyyds/ᛸᛵᲈᛵ;->ᲇᲈᛵᛷ:Ljava/util/Set;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    add-int/2addr v0, v2

    .line 31
    mul-int/2addr v0, v1

    .line 32
    iget-boolean v2, p0, Lyyds/ᛸᛵᲈᛵ;->ᛲᛴᛳᛲ:Z

    .line 33
    .line 34
    invoke-static {v0, v1, v2}, Lyyds/ᲀᲁᲈᲇ;->ᲇᲈᛵᛷ(IIZ)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget v2, p0, Lyyds/ᛸᛵᲈᛵ;->ᲇᲇᲇᛱ:I

    .line 39
    .line 40
    invoke-static {v2, v0, v1}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛳᲀ(III)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-boolean v2, p0, Lyyds/ᛸᛵᲈᛵ;->ᛶᛷᛲᲁ:Z

    .line 45
    .line 46
    invoke-static {v0, v1, v2}, Lyyds/ᲀᲁᲈᲇ;->ᲇᲈᛵᛷ(IIZ)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-boolean v2, p0, Lyyds/ᛸᛵᲈᛵ;->ᛱᲈᲁ:Z

    .line 51
    .line 52
    invoke-static {v0, v1, v2}, Lyyds/ᲀᲁᲈᲇ;->ᲇᲈᛵᛷ(IIZ)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-boolean v2, p0, Lyyds/ᛸᛵᲈᛵ;->ᛲᛳᛶᲁ:Z

    .line 57
    .line 58
    invoke-static {v0, v1, v2}, Lyyds/ᲀᲁᲈᲇ;->ᲇᲈᛵᛷ(IIZ)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-wide v1, p0, Lyyds/ᛸᛵᲈᛵ;->ᛷᲈᲈᲁ:J

    .line 63
    .line 64
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    add-int/2addr p0, v0

    .line 69
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-wide v1, -0x20a86e68a836eL

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
    iget-object v1, p0, Lyyds/ᛸᛵᲈᛵ;->ᛲᲈᲁ:Lyyds/ᲁᛴᛸᲈ;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-wide v1, -0x20aa5e68a836eL

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
    iget-object v1, p0, Lyyds/ᛸᛵᲈᛵ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 33
    .line 34
    const-wide v2, -0x20aafe68a836eL

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1, v2, v3}, Lyyds/ᛴᛷᛷᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lyyds/ᛸᛵᲈᛵ;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-wide v1, -0x20abce68a836eL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lyyds/ᛸᛵᲈᛵ;->ᲇᲈᛵᛷ:Ljava/util/Set;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-wide v1, -0x20acae68a836eL

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget-boolean v1, p0, Lyyds/ᛸᛵᲈᛵ;->ᛲᛴᛳᛲ:Z

    .line 77
    .line 78
    const-wide v2, -0x20ad7e68a836eL

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;ZJ)V

    .line 84
    .line 85
    .line 86
    iget v1, p0, Lyyds/ᛸᛵᲈᛵ;->ᲇᲇᲇᛱ:I

    .line 87
    .line 88
    const-wide v2, -0x20ae4e68a836eL

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 94
    .line 95
    .line 96
    iget-boolean v1, p0, Lyyds/ᛸᛵᲈᛵ;->ᛶᛷᛲᲁ:Z

    .line 97
    .line 98
    const-wide v2, -0x20aeee68a836eL

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;ZJ)V

    .line 104
    .line 105
    .line 106
    iget-boolean v1, p0, Lyyds/ᛸᛵᲈᛵ;->ᛱᲈᲁ:Z

    .line 107
    .line 108
    const-wide v2, -0x20afae68a836eL

    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;ZJ)V

    .line 114
    .line 115
    .line 116
    iget-boolean v1, p0, Lyyds/ᛸᛵᲈᛵ;->ᛲᛳᛶᲁ:Z

    .line 117
    .line 118
    const-wide v2, -0x20b07e68a836eL

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;ZJ)V

    .line 124
    .line 125
    .line 126
    iget-wide v1, p0, Lyyds/ᛸᛵᲈᛵ;->ᛷᲈᲈᲁ:J

    .line 127
    .line 128
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const/16 p0, 0x29

    .line 132
    .line 133
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    return-object p0
.end method
